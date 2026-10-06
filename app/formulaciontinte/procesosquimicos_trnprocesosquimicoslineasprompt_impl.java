package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class procesosquimicos_trnprocesosquimicoslineasprompt_impl extends GXDataArea
{
   public procesosquimicos_trnprocesosquimicoslineasprompt_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public procesosquimicos_trnprocesosquimicoslineasprompt_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( procesosquimicos_trnprocesosquimicoslineasprompt_impl.class ));
   }

   public procesosquimicos_trnprocesosquimicoslineasprompt_impl( int remoteHandle ,
                                                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "InEmprCod") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "InEmprCod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "InEmprCod") ;
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
            AV7InEmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7InEmprCod", AV7InEmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV8InProForCod = httpContext.GetPar( "InProForCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8InProForCod", AV8InProForCod);
               AV9InOutProForLin = (short)(GXutil.lval( httpContext.GetPar( "InOutProForLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9InOutProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9InOutProForLin), 4, 0));
               AV10InOutProForPrd = httpContext.GetPar( "InOutProForPrd") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10InOutProForPrd", AV10InOutProForPrd);
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
      AV14FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV7InEmprCod = httpContext.GetPar( "InEmprCod") ;
      AV8InProForCod = httpContext.GetPar( "InProForCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV14FilterFullText, AV7InEmprCod, AV8InProForCod) ;
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
      pa1MD2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1MD2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal FormNoBackgroundColor\" data-gx-class=\"form-horizontal FormNoBackgroundColor\" novalidate action=\""+formatLink("app.formulaciontinte.procesosquimicos_trnprocesosquimicoslineasprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7InEmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8InProForCod)),GXutil.URLEncode(GXutil.ltrimstr(AV9InOutProForLin,4,0)),GXutil.URLEncode(GXutil.rtrim(AV10InOutProForPrd))}, new String[] {"InEmprCod","InProForCod","InOutProForLin","InOutProForPrd"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV14FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_24", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_24, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV17GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV18GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV15DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV15DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vINEMPRCOD", GXutil.rtrim( AV7InEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vINPROFORCOD", GXutil.rtrim( AV8InProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTPROFORLIN", GXutil.ltrim( localUtil.ntoc( AV9InOutProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTPROFORPRD", GXutil.rtrim( AV10InOutProForPrd));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
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
         we1MD2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1MD2( ) ;
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
      return formatLink("app.formulaciontinte.procesosquimicos_trnprocesosquimicoslineasprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7InEmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8InProForCod)),GXutil.URLEncode(GXutil.ltrimstr(AV9InOutProForLin,4,0)),GXutil.URLEncode(GXutil.rtrim(AV10InOutProForPrd))}, new String[] {"InEmprCod","InProForCod","InOutProForLin","InOutProForPrd"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.ProcesosQuimicos_TRNProcesosQuimicosLineasPrompt" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Selecciona Procesos Quimicos Lineas", "") ;
   }

   public void wb1MD0( )
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
         wb_table1_12_1MD2( true) ;
      }
      else
      {
         wb_table1_12_1MD2( false) ;
      }
      return  ;
   }

   public void wb_table1_12_1MD2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV17GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV18GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV15DDO_TitleSettingsIcons);
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

   public void start1MD2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Selecciona Procesos Quimicos Lineas", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1MD0( ) ;
   }

   public void ws1MD2( )
   {
      start1MD2( ) ;
      evt1MD2( ) ;
   }

   public void evt1MD2( )
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
                           e111MD2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121MD2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131MD2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCLEANFILTERS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCleanFilters' */
                           e141MD2 ();
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
                           AV19Select = httpContext.cgiGet( edtavSelect_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavSelect_Internalname, AV19Select);
                           A767ProForLin = (short)(localUtil.ctol( httpContext.cgiGet( edtProForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A770ProForPrd = httpContext.cgiGet( edtProForPrd_Internalname) ;
                           A765ProForDes = httpContext.cgiGet( edtProForDes_Internalname) ;
                           A13111ProForDe2 = httpContext.cgiGet( edtProForDe2_Internalname) ;
                           A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
                           n488ForPrdDsc = false ;
                           A762ProForCan = localUtil.ctond( httpContext.cgiGet( edtProForCan_Internalname)) ;
                           A1645ProForNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtProForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3379ProForTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtProForTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A6062ProForCPo = localUtil.ctond( httpContext.cgiGet( edtProForCPo_Internalname)) ;
                           A13178ProForFT = httpContext.cgiGet( edtProForFT_Internalname) ;
                           A763ProForCla = httpContext.cgiGet( edtProForCla_Internalname) ;
                           A5358ProForClv = httpContext.cgiGet( edtProForClv_Internalname) ;
                           A710PrdFind = httpContext.cgiGet( edtPrdFind_Internalname) ;
                           n710PrdFind = false ;
                           A4340PrdUMeFind = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdUMeFind_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n4340PrdUMeFind = false ;
                           A13976PrdNomForm = httpContext.cgiGet( edtPrdNomForm_Internalname) ;
                           A768ProForLinV = (short)(localUtil.ctol( httpContext.cgiGet( edtProForLinV_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A717PrdMaxFind = httpContext.cgiGet( edtPrdMaxFind_Internalname) ;
                           n717PrdMaxFind = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e151MD2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e161MD2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e171MD2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV14FilterFullText) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e181MD2 ();
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

   public void we1MD2( )
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

   public void pa1MD2( )
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
                                 String AV14FilterFullText ,
                                 String AV7InEmprCod ,
                                 String AV8InProForCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e161MD2 ();
      GRID_nCurrentRecord = 0 ;
      rf1MD2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PROFORLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A767ProForLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORLIN", GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PROFORPRD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A770ProForPrd, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORPRD", GXutil.rtrim( A770ProForPrd));
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
      rf1MD2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavSelect_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSelect_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSelect_Enabled), 5, 0), !bGXsfl_24_Refreshing);
   }

   public int subgridclient_rec_count_fnc( )
   {
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV14FilterFullText ,
                                           Short.valueOf(A767ProForLin) ,
                                           A770ProForPrd ,
                                           A765ProForDes ,
                                           A13111ProForDe2 ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A762ProForCan ,
                                           Byte.valueOf(A1645ProForNro) ,
                                           Byte.valueOf(A3379ProForTnq) ,
                                           A6062ProForCPo ,
                                           A13178ProForFT ,
                                           A763ProForCla ,
                                           A5358ProForClv ,
                                           A710PrdFind ,
                                           Byte.valueOf(A4340PrdUMeFind) ,
                                           A13976PrdNomForm ,
                                           Short.valueOf(A768ProForLinV) ,
                                           A717PrdMaxFind ,
                                           AV7InEmprCod ,
                                           AV8InProForCod ,
                                           A396EmprCod ,
                                           A764ProForCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor H01MD9 */
      pr_default.execute(0, new Object[] {AV7InEmprCod, AV8InProForCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A764ProForCod = H01MD9_A764ProForCod[0] ;
         A766ProForDsc = H01MD9_A766ProForDsc[0] ;
         A768ProForLinV = H01MD9_A768ProForLinV[0] ;
         A5358ProForClv = H01MD9_A5358ProForClv[0] ;
         A763ProForCla = H01MD9_A763ProForCla[0] ;
         A13178ProForFT = H01MD9_A13178ProForFT[0] ;
         A6062ProForCPo = H01MD9_A6062ProForCPo[0] ;
         A3379ProForTnq = H01MD9_A3379ProForTnq[0] ;
         A1645ProForNro = H01MD9_A1645ProForNro[0] ;
         A762ProForCan = H01MD9_A762ProForCan[0] ;
         A488ForPrdDsc = H01MD9_A488ForPrdDsc[0] ;
         n488ForPrdDsc = H01MD9_n488ForPrdDsc[0] ;
         A490ForPrdUMe = H01MD9_A490ForPrdUMe[0] ;
         A13111ProForDe2 = H01MD9_A13111ProForDe2[0] ;
         A765ProForDes = H01MD9_A765ProForDes[0] ;
         A717PrdMaxFind = H01MD9_A717PrdMaxFind[0] ;
         n717PrdMaxFind = H01MD9_n717PrdMaxFind[0] ;
         A767ProForLin = H01MD9_A767ProForLin[0] ;
         A4340PrdUMeFind = H01MD9_A4340PrdUMeFind[0] ;
         n4340PrdUMeFind = H01MD9_n4340PrdUMeFind[0] ;
         A710PrdFind = H01MD9_A710PrdFind[0] ;
         n710PrdFind = H01MD9_n710PrdFind[0] ;
         A770ProForPrd = H01MD9_A770ProForPrd[0] ;
         A396EmprCod = H01MD9_A396EmprCod[0] ;
         A766ProForDsc = H01MD9_A766ProForDsc[0] ;
         A488ForPrdDsc = H01MD9_A488ForPrdDsc[0] ;
         n488ForPrdDsc = H01MD9_n488ForPrdDsc[0] ;
         A717PrdMaxFind = H01MD9_A717PrdMaxFind[0] ;
         n717PrdMaxFind = H01MD9_n717PrdMaxFind[0] ;
         A4340PrdUMeFind = H01MD9_A4340PrdUMeFind[0] ;
         n4340PrdUMeFind = H01MD9_n4340PrdUMeFind[0] ;
         A710PrdFind = H01MD9_A710PrdFind[0] ;
         n710PrdFind = H01MD9_n710PrdFind[0] ;
         GXt_char1 = A13976PrdNomForm ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A770ProForPrd ;
         GXv_char4[0] = GXt_char1 ;
         new app.pprddsc(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
         procesosquimicos_trnprocesosquimicoslineasprompt_impl.this.A396EmprCod = GXv_char2[0] ;
         procesosquimicos_trnprocesosquimicoslineasprompt_impl.this.A770ProForPrd = GXv_char3[0] ;
         procesosquimicos_trnprocesosquimicoslineasprompt_impl.this.GXt_char1 = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13976PrdNomForm = GXt_char1 ;
         if ( (GXutil.strcmp("", AV14FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A767ProForLin, 4, 0) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A770ProForPrd) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A765ProForDes) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13111ProForDe2) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A490ForPrdUMe, 1, 0) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A488ForPrdDsc) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A762ProForCan, 12, 5) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1645ProForNro, 2, 0) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3379ProForTnq, 2, 0) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6062ProForCPo, 6, 2) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13178ProForFT) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A763ProForCla) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5358ProForClv) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A710PrdFind) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4340PrdUMeFind, 1, 0) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13976PrdNomForm) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A768ProForLinV, 4, 0) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A717PrdMaxFind) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) ) )
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

   public void rf1MD2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(24) ;
      /* Execute user event: Refresh */
      e161MD2 ();
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
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV14FilterFullText ,
                                              Short.valueOf(A767ProForLin) ,
                                              A770ProForPrd ,
                                              A765ProForDes ,
                                              A13111ProForDe2 ,
                                              Byte.valueOf(A490ForPrdUMe) ,
                                              A488ForPrdDsc ,
                                              A762ProForCan ,
                                              Byte.valueOf(A1645ProForNro) ,
                                              Byte.valueOf(A3379ProForTnq) ,
                                              A6062ProForCPo ,
                                              A13178ProForFT ,
                                              A763ProForCla ,
                                              A5358ProForClv ,
                                              A710PrdFind ,
                                              Byte.valueOf(A4340PrdUMeFind) ,
                                              A13976PrdNomForm ,
                                              Short.valueOf(A768ProForLinV) ,
                                              A717PrdMaxFind ,
                                              AV7InEmprCod ,
                                              AV8InProForCod ,
                                              A396EmprCod ,
                                              A764ProForCod } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor H01MD17 */
         pr_default.execute(1, new Object[] {AV7InEmprCod, AV8InProForCod});
         nGXsfl_24_idx = 1 ;
         sGXsfl_24_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_24_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_242( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A764ProForCod = H01MD17_A764ProForCod[0] ;
            A766ProForDsc = H01MD17_A766ProForDsc[0] ;
            A768ProForLinV = H01MD17_A768ProForLinV[0] ;
            A5358ProForClv = H01MD17_A5358ProForClv[0] ;
            A763ProForCla = H01MD17_A763ProForCla[0] ;
            A13178ProForFT = H01MD17_A13178ProForFT[0] ;
            A6062ProForCPo = H01MD17_A6062ProForCPo[0] ;
            A3379ProForTnq = H01MD17_A3379ProForTnq[0] ;
            A1645ProForNro = H01MD17_A1645ProForNro[0] ;
            A762ProForCan = H01MD17_A762ProForCan[0] ;
            A488ForPrdDsc = H01MD17_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H01MD17_n488ForPrdDsc[0] ;
            A490ForPrdUMe = H01MD17_A490ForPrdUMe[0] ;
            A13111ProForDe2 = H01MD17_A13111ProForDe2[0] ;
            A765ProForDes = H01MD17_A765ProForDes[0] ;
            A717PrdMaxFind = H01MD17_A717PrdMaxFind[0] ;
            n717PrdMaxFind = H01MD17_n717PrdMaxFind[0] ;
            A767ProForLin = H01MD17_A767ProForLin[0] ;
            A4340PrdUMeFind = H01MD17_A4340PrdUMeFind[0] ;
            n4340PrdUMeFind = H01MD17_n4340PrdUMeFind[0] ;
            A710PrdFind = H01MD17_A710PrdFind[0] ;
            n710PrdFind = H01MD17_n710PrdFind[0] ;
            A770ProForPrd = H01MD17_A770ProForPrd[0] ;
            A396EmprCod = H01MD17_A396EmprCod[0] ;
            A766ProForDsc = H01MD17_A766ProForDsc[0] ;
            A488ForPrdDsc = H01MD17_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H01MD17_n488ForPrdDsc[0] ;
            A717PrdMaxFind = H01MD17_A717PrdMaxFind[0] ;
            n717PrdMaxFind = H01MD17_n717PrdMaxFind[0] ;
            A4340PrdUMeFind = H01MD17_A4340PrdUMeFind[0] ;
            n4340PrdUMeFind = H01MD17_n4340PrdUMeFind[0] ;
            A710PrdFind = H01MD17_A710PrdFind[0] ;
            n710PrdFind = H01MD17_n710PrdFind[0] ;
            GXt_char1 = A13976PrdNomForm ;
            GXv_char4[0] = A396EmprCod ;
            GXv_char3[0] = A770ProForPrd ;
            GXv_char2[0] = GXt_char1 ;
            new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            procesosquimicos_trnprocesosquimicoslineasprompt_impl.this.A396EmprCod = GXv_char4[0] ;
            procesosquimicos_trnprocesosquimicoslineasprompt_impl.this.A770ProForPrd = GXv_char3[0] ;
            procesosquimicos_trnprocesosquimicoslineasprompt_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A13976PrdNomForm = GXt_char1 ;
            if ( (GXutil.strcmp("", AV14FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A767ProForLin, 4, 0) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A770ProForPrd) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A765ProForDes) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13111ProForDe2) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A490ForPrdUMe, 1, 0) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A488ForPrdDsc) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A762ProForCan, 12, 5) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1645ProForNro, 2, 0) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3379ProForTnq, 2, 0) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6062ProForCPo, 6, 2) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13178ProForFT) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A763ProForCla) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5358ProForClv) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A710PrdFind) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4340PrdUMeFind, 1, 0) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13976PrdNomForm) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A768ProForLinV, 4, 0) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A717PrdMaxFind) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) ) )
            {
               e171MD2 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(24) ;
         wb1MD0( ) ;
      }
      bGXsfl_24_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1MD2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PROFORLIN"+"_"+sGXsfl_24_idx, getSecureSignedToken( sGXsfl_24_idx, localUtil.format( DecimalUtil.doubleToDec(A767ProForLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PROFORPRD"+"_"+sGXsfl_24_idx, getSecureSignedToken( sGXsfl_24_idx, GXutil.rtrim( localUtil.format( A770ProForPrd, ""))));
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
         gxgrgrid_refresh( subGrid_Rows, AV14FilterFullText, AV7InEmprCod, AV8InProForCod) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14FilterFullText, AV7InEmprCod, AV8InProForCod) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14FilterFullText, AV7InEmprCod, AV8InProForCod) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14FilterFullText, AV7InEmprCod, AV8InProForCod) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14FilterFullText, AV7InEmprCod, AV8InProForCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavSelect_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSelect_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSelect_Enabled), 5, 0), !bGXsfl_24_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup1MD0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e151MD2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV15DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_24 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_24"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV17GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV18GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         AV14FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14FilterFullText", AV14FilterFullText);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV14FilterFullText) != 0 )
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
      e151MD2 ();
      if (returnInSub) return;
   }

   public void e151MD2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV22Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      procesosquimicos_trnprocesosquimicoslineasprompt_impl.this.GXt_char1 = GXv_char4[0] ;
      AV22Station = GXt_char1 ;
      GXv_char4[0] = AV23Emprcod ;
      GXv_char3[0] = AV24Emprnom ;
      GXv_char2[0] = AV25Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char4, GXv_char3, GXv_char2) ;
      procesosquimicos_trnprocesosquimicoslineasprompt_impl.this.AV23Emprcod = GXv_char4[0] ;
      procesosquimicos_trnprocesosquimicoslineasprompt_impl.this.AV24Emprnom = GXv_char3[0] ;
      procesosquimicos_trnprocesosquimicoslineasprompt_impl.this.AV25Usurcod = GXv_char2[0] ;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Selecciona Procesos Quimicos Lineas", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S112 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV15DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV15DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e161MD2( )
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
      AV17GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17GridCurrentPage), 10, 0));
      AV18GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18GridPageCount), 10, 0));
      /*  Sending Event outputs  */
   }

   public void e111MD2( )
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
         AV16PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV16PageToGo) ;
      }
   }

   public void e121MD2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131MD2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV12OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         AV13OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S112 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e171MD2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV19Select = "<i class=\"fas fa-check\"></i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavSelect_Internalname, AV19Select);
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
      e181MD2 ();
      if (returnInSub) return;
   }

   public void e181MD2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV9InOutProForLin = A767ProForLin ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9InOutProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9InOutProForLin), 4, 0));
      AV10InOutProForPrd = A770ProForPrd ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10InOutProForPrd", AV10InOutProForPrd);
      httpContext.setWebReturnParms(new Object[] {Short.valueOf(AV9InOutProForLin),AV10InOutProForPrd});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV9InOutProForLin","AV10InOutProForPrd"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void e141MD2( )
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
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S122( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV14FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14FilterFullText", AV14FilterFullText);
   }

   public void wb_table1_12_1MD2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablefilters_Internalname, tblTablefilters_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='CellAlignTopPaddingTop10'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblCleanfilters_Internalname, httpContext.getMessage( "<i class=\"fas fa-filter CleanFiltersIcon\"></i>", ""), "", "", lblCleanfilters_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOCLEANFILTERS\\'."+"'", "", "TextBlock", 5, httpContext.getMessage( "WWP_CleanFiltersTooltip", ""), 1, 1, 0, (short)(1), "HLP_FormulacionTinte\\ProcesosQuimicos_TRNProcesosQuimicosLineasPrompt.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Filter Full Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'" + sGXsfl_24_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV14FilterFullText, GXutil.rtrim( localUtil.format( AV14FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,18);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNProcesosQuimicosLineasPrompt.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_12_1MD2e( true) ;
      }
      else
      {
         wb_table1_12_1MD2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV7InEmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7InEmprCod", AV7InEmprCod);
      AV8InProForCod = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8InProForCod", AV8InProForCod);
      AV9InOutProForLin = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9InOutProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9InOutProForLin), 4, 0));
      AV10InOutProForPrd = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10InOutProForPrd", AV10InOutProForPrd);
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
      pa1MD2( ) ;
      ws1MD2( ) ;
      we1MD2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116135143", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/procesosquimicos_trnprocesosquimicoslineasprompt.js", "?202682116135144", false, true);
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
      edtProForLin_Internalname = "PROFORLIN_"+sGXsfl_24_idx ;
      edtProForPrd_Internalname = "PROFORPRD_"+sGXsfl_24_idx ;
      edtProForDes_Internalname = "PROFORDES_"+sGXsfl_24_idx ;
      edtProForDe2_Internalname = "PROFORDE2_"+sGXsfl_24_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_24_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_24_idx ;
      edtProForCan_Internalname = "PROFORCAN_"+sGXsfl_24_idx ;
      edtProForNro_Internalname = "PROFORNRO_"+sGXsfl_24_idx ;
      edtProForTnq_Internalname = "PROFORTNQ_"+sGXsfl_24_idx ;
      edtProForCPo_Internalname = "PROFORCPO_"+sGXsfl_24_idx ;
      edtProForFT_Internalname = "PROFORFT_"+sGXsfl_24_idx ;
      edtProForCla_Internalname = "PROFORCLA_"+sGXsfl_24_idx ;
      edtProForClv_Internalname = "PROFORCLV_"+sGXsfl_24_idx ;
      edtPrdFind_Internalname = "PRDFIND_"+sGXsfl_24_idx ;
      edtPrdUMeFind_Internalname = "PRDUMEFIND_"+sGXsfl_24_idx ;
      edtPrdNomForm_Internalname = "PRDNOMFORM_"+sGXsfl_24_idx ;
      edtProForLinV_Internalname = "PROFORLINV_"+sGXsfl_24_idx ;
      edtPrdMaxFind_Internalname = "PRDMAXFIND_"+sGXsfl_24_idx ;
   }

   public void subsflControlProps_fel_242( )
   {
      edtavSelect_Internalname = "vSELECT_"+sGXsfl_24_fel_idx ;
      edtProForLin_Internalname = "PROFORLIN_"+sGXsfl_24_fel_idx ;
      edtProForPrd_Internalname = "PROFORPRD_"+sGXsfl_24_fel_idx ;
      edtProForDes_Internalname = "PROFORDES_"+sGXsfl_24_fel_idx ;
      edtProForDe2_Internalname = "PROFORDE2_"+sGXsfl_24_fel_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_24_fel_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_24_fel_idx ;
      edtProForCan_Internalname = "PROFORCAN_"+sGXsfl_24_fel_idx ;
      edtProForNro_Internalname = "PROFORNRO_"+sGXsfl_24_fel_idx ;
      edtProForTnq_Internalname = "PROFORTNQ_"+sGXsfl_24_fel_idx ;
      edtProForCPo_Internalname = "PROFORCPO_"+sGXsfl_24_fel_idx ;
      edtProForFT_Internalname = "PROFORFT_"+sGXsfl_24_fel_idx ;
      edtProForCla_Internalname = "PROFORCLA_"+sGXsfl_24_fel_idx ;
      edtProForClv_Internalname = "PROFORCLV_"+sGXsfl_24_fel_idx ;
      edtPrdFind_Internalname = "PRDFIND_"+sGXsfl_24_fel_idx ;
      edtPrdUMeFind_Internalname = "PRDUMEFIND_"+sGXsfl_24_fel_idx ;
      edtPrdNomForm_Internalname = "PRDNOMFORM_"+sGXsfl_24_fel_idx ;
      edtProForLinV_Internalname = "PROFORLINV_"+sGXsfl_24_fel_idx ;
      edtPrdMaxFind_Internalname = "PRDMAXFIND_"+sGXsfl_24_fel_idx ;
   }

   public void sendrow_242( )
   {
      subsflControlProps_242( ) ;
      wb1MD0( ) ;
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
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSelect_Internalname,GXutil.rtrim( AV19Select),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavSelect_Enabled!=0)&&(edtavSelect_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,25);\"" : " "),"'"+""+"'"+",false,"+"'"+"EENTER."+sGXsfl_24_idx+"'","","",httpContext.getMessage( "GX_BtnSelect", ""),"",edtavSelect_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWIconActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSelect_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForLin_Internalname,GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A767ProForLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForPrd_Internalname,GXutil.rtrim( A770ProForPrd),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForPrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForDes_Internalname,GXutil.rtrim( A765ProForDes),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForDes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForDe2_Internalname,GXutil.rtrim( A13111ProForDe2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForDe2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdDsc_Internalname,GXutil.rtrim( A488ForPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCan_Internalname,GXutil.ltrim( localUtil.ntoc( A762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A762ProForCan, "ZZZZZ9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForNro_Internalname,GXutil.ltrim( localUtil.ntoc( A1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1645ProForNro), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForNro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForTnq_Internalname,GXutil.ltrim( localUtil.ntoc( A3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3379ProForTnq), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForTnq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCPo_Internalname,GXutil.ltrim( localUtil.ntoc( A6062ProForCPo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A6062ProForCPo, "ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCPo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForFT_Internalname,GXutil.rtrim( A13178ProForFT),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForFT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCla_Internalname,GXutil.rtrim( A763ProForCla),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCla_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForClv_Internalname,GXutil.rtrim( A5358ProForClv),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForClv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdFind_Internalname,GXutil.rtrim( A710PrdFind),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdFind_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdUMeFind_Internalname,GXutil.ltrim( localUtil.ntoc( A4340PrdUMeFind, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4340PrdUMeFind), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdUMeFind_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNomForm_Internalname,GXutil.rtrim( A13976PrdNomForm),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNomForm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForLinV_Internalname,GXutil.ltrim( localUtil.ntoc( A768ProForLinV, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A768ProForLinV), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForLinV_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdMaxFind_Internalname,GXutil.rtrim( A717PrdMaxFind),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdMaxFind_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1MD2( ) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion (Large)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad Medida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion Unidades Medida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tq.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "% Cpd.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ficha Tecn.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Clave I", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Clave II", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "PrdFind", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unid.Medida Formula(Prd-Find)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "ProForLinV", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Busca producto linea anterior", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV19Select));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSelect_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A770ProForPrd));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A765ProForDes));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13111ProForDe2));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A488ForPrdDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A762ProForCan, (byte)(12), (byte)(5), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1645ProForNro, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3379ProForTnq, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6062ProForCPo, (byte)(6), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13178ProForFT));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A763ProForCla));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5358ProForClv));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A710PrdFind));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4340PrdUMeFind, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13976PrdNomForm));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A768ProForLinV, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A717PrdMaxFind));
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
      edtProForLin_Internalname = "PROFORLIN" ;
      edtProForPrd_Internalname = "PROFORPRD" ;
      edtProForDes_Internalname = "PROFORDES" ;
      edtProForDe2_Internalname = "PROFORDE2" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtProForCan_Internalname = "PROFORCAN" ;
      edtProForNro_Internalname = "PROFORNRO" ;
      edtProForTnq_Internalname = "PROFORTNQ" ;
      edtProForCPo_Internalname = "PROFORCPO" ;
      edtProForFT_Internalname = "PROFORFT" ;
      edtProForCla_Internalname = "PROFORCLA" ;
      edtProForClv_Internalname = "PROFORCLV" ;
      edtPrdFind_Internalname = "PRDFIND" ;
      edtPrdUMeFind_Internalname = "PRDUMEFIND" ;
      edtPrdNomForm_Internalname = "PRDNOMFORM" ;
      edtProForLinV_Internalname = "PROFORLINV" ;
      edtPrdMaxFind_Internalname = "PRDMAXFIND" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
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
      edtPrdMaxFind_Jsonclick = "" ;
      edtProForLinV_Jsonclick = "" ;
      edtPrdNomForm_Jsonclick = "" ;
      edtPrdUMeFind_Jsonclick = "" ;
      edtPrdFind_Jsonclick = "" ;
      edtProForClv_Jsonclick = "" ;
      edtProForCla_Jsonclick = "" ;
      edtProForFT_Jsonclick = "" ;
      edtProForCPo_Jsonclick = "" ;
      edtProForTnq_Jsonclick = "" ;
      edtProForNro_Jsonclick = "" ;
      edtProForCan_Jsonclick = "" ;
      edtForPrdDsc_Jsonclick = "" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtProForDe2_Jsonclick = "" ;
      edtProForDes_Jsonclick = "" ;
      edtProForPrd_Jsonclick = "" ;
      edtProForLin_Jsonclick = "" ;
      edtavSelect_Jsonclick = "" ;
      edtavSelect_Visible = -1 ;
      edtavSelect_Enabled = 1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11|12|13|14" ;
      Ddo_grid_Columnids = "1:ProForLin|2:ProForPrd|3:ProForDes|4:ProForDe2|5:ForPrdUMe|6:ForPrdDsc|7:ProForCan|8:ProForNro|9:ProForTnq|10:ProForCPo|11:ProForFT|12:ProForCla|13:ProForClv" ;
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
      Form.setCaption( httpContext.getMessage( "Selecciona Procesos Quimicos Lineas", "") );
      subGrid_Rows = 0 ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7InEmprCod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV8InProForCod',fld:'vINPROFORCOD',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV17GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV18GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111MD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7InEmprCod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV8InProForCod',fld:'vINPROFORCOD',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121MD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7InEmprCod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV8InProForCod',fld:'vINPROFORCOD',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e131MD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7InEmprCod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV8InProForCod',fld:'vINPROFORCOD',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e171MD2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV19Select',fld:'vSELECT',pic:''}]}");
      setEventMetadata("ENTER","{handler:'e181MD2',iparms:[{av:'A767ProForLin',fld:'PROFORLIN',pic:'ZZZ9',hsh:true},{av:'A770ProForPrd',fld:'PROFORPRD',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV9InOutProForLin',fld:'vINOUTPROFORLIN',pic:'ZZZ9'},{av:'AV10InOutProForPrd',fld:'vINOUTPROFORPRD',pic:''}]}");
      setEventMetadata("'DOCLEANFILTERS'","{handler:'e141MD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7InEmprCod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV8InProForCod',fld:'vINPROFORCOD',pic:''}]");
      setEventMetadata("'DOCLEANFILTERS'",",oparms:[{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV17GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV18GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VALID_PROFORLIN","{handler:'valid_Proforlin',iparms:[]");
      setEventMetadata("VALID_PROFORLIN",",oparms:[]}");
      setEventMetadata("VALID_PROFORPRD","{handler:'valid_Proforprd',iparms:[]");
      setEventMetadata("VALID_PROFORPRD",",oparms:[]}");
      setEventMetadata("VALID_PROFORDES","{handler:'valid_Profordes',iparms:[]");
      setEventMetadata("VALID_PROFORDES",",oparms:[]}");
      setEventMetadata("VALID_PROFORDE2","{handler:'valid_Proforde2',iparms:[]");
      setEventMetadata("VALID_PROFORDE2",",oparms:[]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[]}");
      setEventMetadata("VALID_FORPRDDSC","{handler:'valid_Forprddsc',iparms:[]");
      setEventMetadata("VALID_FORPRDDSC",",oparms:[]}");
      setEventMetadata("VALID_PROFORCAN","{handler:'valid_Proforcan',iparms:[]");
      setEventMetadata("VALID_PROFORCAN",",oparms:[]}");
      setEventMetadata("VALID_PROFORNRO","{handler:'valid_Profornro',iparms:[]");
      setEventMetadata("VALID_PROFORNRO",",oparms:[]}");
      setEventMetadata("VALID_PROFORTNQ","{handler:'valid_Profortnq',iparms:[]");
      setEventMetadata("VALID_PROFORTNQ",",oparms:[]}");
      setEventMetadata("VALID_PROFORCPO","{handler:'valid_Proforcpo',iparms:[]");
      setEventMetadata("VALID_PROFORCPO",",oparms:[]}");
      setEventMetadata("VALID_PROFORFT","{handler:'valid_Proforft',iparms:[]");
      setEventMetadata("VALID_PROFORFT",",oparms:[]}");
      setEventMetadata("VALID_PROFORCLA","{handler:'valid_Proforcla',iparms:[]");
      setEventMetadata("VALID_PROFORCLA",",oparms:[]}");
      setEventMetadata("VALID_PROFORCLV","{handler:'valid_Proforclv',iparms:[]");
      setEventMetadata("VALID_PROFORCLV",",oparms:[]}");
      setEventMetadata("VALID_PRDFIND","{handler:'valid_Prdfind',iparms:[]");
      setEventMetadata("VALID_PRDFIND",",oparms:[]}");
      setEventMetadata("VALID_PRDUMEFIND","{handler:'valid_Prdumefind',iparms:[]");
      setEventMetadata("VALID_PRDUMEFIND",",oparms:[]}");
      setEventMetadata("VALID_PRDNOMFORM","{handler:'valid_Prdnomform',iparms:[]");
      setEventMetadata("VALID_PRDNOMFORM",",oparms:[]}");
      setEventMetadata("VALID_PROFORLINV","{handler:'valid_Proforlinv',iparms:[]");
      setEventMetadata("VALID_PROFORLINV",",oparms:[]}");
      setEventMetadata("VALID_PRDMAXFIND","{handler:'valid_Prdmaxfind',iparms:[]");
      setEventMetadata("VALID_PRDMAXFIND",",oparms:[]}");
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
      wcpOAV7InEmprCod = "" ;
      wcpOAV8InProForCod = "" ;
      wcpOAV10InOutProForPrd = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7InEmprCod = "" ;
      AV8InProForCod = "" ;
      AV10InOutProForPrd = "" ;
      AV14FilterFullText = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV15DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV19Select = "" ;
      A770ProForPrd = "" ;
      A765ProForDes = "" ;
      A13111ProForDe2 = "" ;
      A488ForPrdDsc = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A6062ProForCPo = DecimalUtil.ZERO ;
      A13178ProForFT = "" ;
      A763ProForCla = "" ;
      A5358ProForClv = "" ;
      A710PrdFind = "" ;
      A13976PrdNomForm = "" ;
      A717PrdMaxFind = "" ;
      scmdbuf = "" ;
      lV14FilterFullText = "" ;
      A764ProForCod = "" ;
      H01MD9_A719PrdNum = new String[] {""} ;
      H01MD9_A764ProForCod = new String[] {""} ;
      H01MD9_A766ProForDsc = new String[] {""} ;
      H01MD9_A768ProForLinV = new short[1] ;
      H01MD9_A5358ProForClv = new String[] {""} ;
      H01MD9_A763ProForCla = new String[] {""} ;
      H01MD9_A13178ProForFT = new String[] {""} ;
      H01MD9_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01MD9_A3379ProForTnq = new byte[1] ;
      H01MD9_A1645ProForNro = new byte[1] ;
      H01MD9_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01MD9_A488ForPrdDsc = new String[] {""} ;
      H01MD9_n488ForPrdDsc = new boolean[] {false} ;
      H01MD9_A490ForPrdUMe = new byte[1] ;
      H01MD9_A13111ProForDe2 = new String[] {""} ;
      H01MD9_A765ProForDes = new String[] {""} ;
      H01MD9_A717PrdMaxFind = new String[] {""} ;
      H01MD9_n717PrdMaxFind = new boolean[] {false} ;
      H01MD9_A767ProForLin = new short[1] ;
      H01MD9_A4340PrdUMeFind = new byte[1] ;
      H01MD9_n4340PrdUMeFind = new boolean[] {false} ;
      H01MD9_A710PrdFind = new String[] {""} ;
      H01MD9_n710PrdFind = new boolean[] {false} ;
      H01MD9_A770ProForPrd = new String[] {""} ;
      H01MD9_A396EmprCod = new String[] {""} ;
      A766ProForDsc = "" ;
      H01MD17_A719PrdNum = new String[] {""} ;
      H01MD17_A764ProForCod = new String[] {""} ;
      H01MD17_A766ProForDsc = new String[] {""} ;
      H01MD17_A768ProForLinV = new short[1] ;
      H01MD17_A5358ProForClv = new String[] {""} ;
      H01MD17_A763ProForCla = new String[] {""} ;
      H01MD17_A13178ProForFT = new String[] {""} ;
      H01MD17_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01MD17_A3379ProForTnq = new byte[1] ;
      H01MD17_A1645ProForNro = new byte[1] ;
      H01MD17_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01MD17_A488ForPrdDsc = new String[] {""} ;
      H01MD17_n488ForPrdDsc = new boolean[] {false} ;
      H01MD17_A490ForPrdUMe = new byte[1] ;
      H01MD17_A13111ProForDe2 = new String[] {""} ;
      H01MD17_A765ProForDes = new String[] {""} ;
      H01MD17_A717PrdMaxFind = new String[] {""} ;
      H01MD17_n717PrdMaxFind = new boolean[] {false} ;
      H01MD17_A767ProForLin = new short[1] ;
      H01MD17_A4340PrdUMeFind = new byte[1] ;
      H01MD17_n4340PrdUMeFind = new boolean[] {false} ;
      H01MD17_A710PrdFind = new String[] {""} ;
      H01MD17_n710PrdFind = new boolean[] {false} ;
      H01MD17_A770ProForPrd = new String[] {""} ;
      H01MD17_A396EmprCod = new String[] {""} ;
      AV22Station = "" ;
      GXt_char1 = "" ;
      AV23Emprcod = "" ;
      GXv_char4 = new String[1] ;
      AV24Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV25Usurcod = "" ;
      GXv_char2 = new String[1] ;
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
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesosquimicos_trnprocesosquimicoslineasprompt__default(),
         new Object[] {
             new Object[] {
            H01MD9_A719PrdNum, H01MD9_A764ProForCod, H01MD9_A766ProForDsc, H01MD9_A768ProForLinV, H01MD9_A5358ProForClv, H01MD9_A763ProForCla, H01MD9_A13178ProForFT, H01MD9_A6062ProForCPo, H01MD9_A3379ProForTnq, H01MD9_A1645ProForNro,
            H01MD9_A762ProForCan, H01MD9_A488ForPrdDsc, H01MD9_n488ForPrdDsc, H01MD9_A490ForPrdUMe, H01MD9_A13111ProForDe2, H01MD9_A765ProForDes, H01MD9_A717PrdMaxFind, H01MD9_n717PrdMaxFind, H01MD9_A767ProForLin, H01MD9_A4340PrdUMeFind,
            H01MD9_n4340PrdUMeFind, H01MD9_A710PrdFind, H01MD9_n710PrdFind, H01MD9_A770ProForPrd, H01MD9_A396EmprCod
            }
            , new Object[] {
            H01MD17_A719PrdNum, H01MD17_A764ProForCod, H01MD17_A766ProForDsc, H01MD17_A768ProForLinV, H01MD17_A5358ProForClv, H01MD17_A763ProForCla, H01MD17_A13178ProForFT, H01MD17_A6062ProForCPo, H01MD17_A3379ProForTnq, H01MD17_A1645ProForNro,
            H01MD17_A762ProForCan, H01MD17_A488ForPrdDsc, H01MD17_n488ForPrdDsc, H01MD17_A490ForPrdUMe, H01MD17_A13111ProForDe2, H01MD17_A765ProForDes, H01MD17_A717PrdMaxFind, H01MD17_n717PrdMaxFind, H01MD17_A767ProForLin, H01MD17_A4340PrdUMeFind,
            H01MD17_n4340PrdUMeFind, H01MD17_A710PrdFind, H01MD17_n710PrdFind, H01MD17_A770ProForPrd, H01MD17_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavSelect_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte A490ForPrdUMe ;
   private byte A1645ProForNro ;
   private byte A3379ProForTnq ;
   private byte A4340PrdUMeFind ;
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
   private short wcpOAV9InOutProForLin ;
   private short AV9InOutProForLin ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short A767ProForLin ;
   private short A768ProForLinV ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_24 ;
   private int subGrid_Rows ;
   private int nGXsfl_24_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int subGrid_Islastpage ;
   private int edtavSelect_Enabled ;
   private int AV16PageToGo ;
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
   private long AV17GridCurrentPage ;
   private long AV18GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal A6062ProForCPo ;
   private String wcpOAV7InEmprCod ;
   private String wcpOAV8InProForCod ;
   private String wcpOAV10InOutProForPrd ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV7InEmprCod ;
   private String AV8InProForCod ;
   private String AV10InOutProForPrd ;
   private String sGXsfl_24_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
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
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV19Select ;
   private String edtavSelect_Internalname ;
   private String edtProForLin_Internalname ;
   private String A770ProForPrd ;
   private String edtProForPrd_Internalname ;
   private String A765ProForDes ;
   private String edtProForDes_Internalname ;
   private String A13111ProForDe2 ;
   private String edtProForDe2_Internalname ;
   private String edtForPrdUMe_Internalname ;
   private String A488ForPrdDsc ;
   private String edtForPrdDsc_Internalname ;
   private String edtProForCan_Internalname ;
   private String edtProForNro_Internalname ;
   private String edtProForTnq_Internalname ;
   private String edtProForCPo_Internalname ;
   private String A13178ProForFT ;
   private String edtProForFT_Internalname ;
   private String A763ProForCla ;
   private String edtProForCla_Internalname ;
   private String A5358ProForClv ;
   private String edtProForClv_Internalname ;
   private String A710PrdFind ;
   private String edtPrdFind_Internalname ;
   private String edtPrdUMeFind_Internalname ;
   private String A13976PrdNomForm ;
   private String edtPrdNomForm_Internalname ;
   private String edtProForLinV_Internalname ;
   private String A717PrdMaxFind ;
   private String edtPrdMaxFind_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String AV22Station ;
   private String GXt_char1 ;
   private String AV23Emprcod ;
   private String GXv_char4[] ;
   private String AV24Emprnom ;
   private String GXv_char3[] ;
   private String AV25Usurcod ;
   private String GXv_char2[] ;
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
   private String edtProForLin_Jsonclick ;
   private String edtProForPrd_Jsonclick ;
   private String edtProForDes_Jsonclick ;
   private String edtProForDe2_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtProForCan_Jsonclick ;
   private String edtProForNro_Jsonclick ;
   private String edtProForTnq_Jsonclick ;
   private String edtProForCPo_Jsonclick ;
   private String edtProForFT_Jsonclick ;
   private String edtProForCla_Jsonclick ;
   private String edtProForClv_Jsonclick ;
   private String edtPrdFind_Jsonclick ;
   private String edtPrdUMeFind_Jsonclick ;
   private String edtPrdNomForm_Jsonclick ;
   private String edtProForLinV_Jsonclick ;
   private String edtPrdMaxFind_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n488ForPrdDsc ;
   private boolean n710PrdFind ;
   private boolean n4340PrdUMeFind ;
   private boolean n717PrdMaxFind ;
   private boolean bGXsfl_24_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV14FilterFullText ;
   private String lV14FilterFullText ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private IDataStoreProvider pr_default ;
   private String[] H01MD9_A719PrdNum ;
   private String[] H01MD9_A764ProForCod ;
   private String[] H01MD9_A766ProForDsc ;
   private short[] H01MD9_A768ProForLinV ;
   private String[] H01MD9_A5358ProForClv ;
   private String[] H01MD9_A763ProForCla ;
   private String[] H01MD9_A13178ProForFT ;
   private java.math.BigDecimal[] H01MD9_A6062ProForCPo ;
   private byte[] H01MD9_A3379ProForTnq ;
   private byte[] H01MD9_A1645ProForNro ;
   private java.math.BigDecimal[] H01MD9_A762ProForCan ;
   private String[] H01MD9_A488ForPrdDsc ;
   private boolean[] H01MD9_n488ForPrdDsc ;
   private byte[] H01MD9_A490ForPrdUMe ;
   private String[] H01MD9_A13111ProForDe2 ;
   private String[] H01MD9_A765ProForDes ;
   private String[] H01MD9_A717PrdMaxFind ;
   private boolean[] H01MD9_n717PrdMaxFind ;
   private short[] H01MD9_A767ProForLin ;
   private byte[] H01MD9_A4340PrdUMeFind ;
   private boolean[] H01MD9_n4340PrdUMeFind ;
   private String[] H01MD9_A710PrdFind ;
   private boolean[] H01MD9_n710PrdFind ;
   private String[] H01MD9_A770ProForPrd ;
   private String[] H01MD9_A396EmprCod ;
   private String[] H01MD17_A719PrdNum ;
   private String[] H01MD17_A764ProForCod ;
   private String[] H01MD17_A766ProForDsc ;
   private short[] H01MD17_A768ProForLinV ;
   private String[] H01MD17_A5358ProForClv ;
   private String[] H01MD17_A763ProForCla ;
   private String[] H01MD17_A13178ProForFT ;
   private java.math.BigDecimal[] H01MD17_A6062ProForCPo ;
   private byte[] H01MD17_A3379ProForTnq ;
   private byte[] H01MD17_A1645ProForNro ;
   private java.math.BigDecimal[] H01MD17_A762ProForCan ;
   private String[] H01MD17_A488ForPrdDsc ;
   private boolean[] H01MD17_n488ForPrdDsc ;
   private byte[] H01MD17_A490ForPrdUMe ;
   private String[] H01MD17_A13111ProForDe2 ;
   private String[] H01MD17_A765ProForDes ;
   private String[] H01MD17_A717PrdMaxFind ;
   private boolean[] H01MD17_n717PrdMaxFind ;
   private short[] H01MD17_A767ProForLin ;
   private byte[] H01MD17_A4340PrdUMeFind ;
   private boolean[] H01MD17_n4340PrdUMeFind ;
   private String[] H01MD17_A710PrdFind ;
   private boolean[] H01MD17_n710PrdFind ;
   private String[] H01MD17_A770ProForPrd ;
   private String[] H01MD17_A396EmprCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV15DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class procesosquimicos_trnprocesosquimicoslineasprompt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01MD9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV14FilterFullText ,
                                          short A767ProForLin ,
                                          String A770ProForPrd ,
                                          String A765ProForDes ,
                                          String A13111ProForDe2 ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A762ProForCan ,
                                          byte A1645ProForNro ,
                                          byte A3379ProForTnq ,
                                          java.math.BigDecimal A6062ProForCPo ,
                                          String A13178ProForFT ,
                                          String A763ProForCla ,
                                          String A5358ProForClv ,
                                          String A710PrdFind ,
                                          byte A4340PrdUMeFind ,
                                          String A13976PrdNomForm ,
                                          short A768ProForLinV ,
                                          String A717PrdMaxFind ,
                                          String AV7InEmprCod ,
                                          String AV8InProForCod ,
                                          String A396EmprCod ,
                                          String A764ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[2];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T6.PrdNum, T1.ProForCod, T2.ProForDsc, T1.ProForLin AS ProForLinV, T1.ProForClv, T1.ProForCla, T1.ProForFT, T1.ProForCPo, T1.ProForTnq, T1.ProForNro, T1.ProForCan," ;
      scmdbuf += " T3.ForPrdDsc, T1.ForPrdUMe, T1.ProForDe2, T1.ProForDes, COALESCE( T4.PrdMaxFind, '') AS PrdMaxFind, T1.ProForLin, COALESCE( T5.PrdUMeFind, 0) AS PrdUMeFind, COALESCE(" ;
      scmdbuf += " T6.PrdNum, 'xxxxxx') AS PrdFind, T1.ProForPrd, T1.EmprCod FROM (((((TXPLPROFO T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod)" ;
      scmdbuf += " INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) INNER JOIN (SELECT CASE  WHEN Not (T7.ProForLin = 0) THEN COALESCE( T9.GXC1," ;
      scmdbuf += " ' ') ELSE COALESCE( T8.GXC2, ' ') END AS PrdMaxFind, T7.EmprCod, T7.ProForCod, T7.ProForLin FROM TXPLPROFO T7,  (SELECT MIN(T10.ProForPrd) AS GXC2 FROM (TXPLPROFO" ;
      scmdbuf += " T10 INNER JOIN TXPCPROFO T12 ON T12.EmprCod = T10.EmprCod AND T12.ProForCod = T10.ProForCod),  (SELECT MAX(T13.ProForLin) AS GXC5 FROM (TXPLPROFO T13 INNER JOIN" ;
      scmdbuf += " TXPCPROFO T14 ON T14.EmprCod = T13.EmprCod AND T14.ProForCod = T13.ProForCod) WHERE T13.EmprCod = T14.EmprCod and T13.ProForCod = T14.ProForCod ) T11 WHERE (T10.ProForLin" ;
      scmdbuf += " = T11.GXC5) AND (T10.EmprCod = T12.EmprCod and T10.ProForCod = T12.ProForCod) ) T8,  (SELECT MIN(T10.ProForPrd) AS GXC1 FROM (TXPLPROFO T10 INNER JOIN TXPCPROFO" ;
      scmdbuf += " T12 ON T12.EmprCod = T10.EmprCod AND T12.ProForCod = T10.ProForCod),  (SELECT MAX(T13.ProForLin) AS GXC4 FROM (TXPLPROFO T13 INNER JOIN TXPCPROFO T14 ON T14.EmprCod" ;
      scmdbuf += " = T13.EmprCod AND T14.ProForCod = T13.ProForCod) WHERE T13.EmprCod = T14.EmprCod and T13.ProForCod = T14.ProForCod and T13.ProForLin < T13.ProForLin ) T11 WHERE" ;
      scmdbuf += " (T10.ProForLin = T11.GXC4) AND (T10.EmprCod = T12.EmprCod and T10.ProForCod = T12.ProForCod and T10.ProForLin < T10.ProForLin) ) T9 ) T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.ProForCod = T1.ProForCod AND T4.ProForLin = T1.ProForLin) LEFT JOIN (SELECT CASE  WHEN COALESCE( T8.PrdNum, 'xxxxxx') <> 'xxxxxx' THEN COALESCE( T9.PrdUMeFo," ;
      scmdbuf += " 0) END AS PrdUMeFind, T7.EmprCod, T7.ProForCod, T7.ProForLin FROM ((TXPLPROFO T7 LEFT JOIN TXPPRODUC T8 ON T8.EmprCod = T7.EmprCod AND T8.PrdNum = T7.ProForPrd)" ;
      scmdbuf += " LEFT JOIN (SELECT T10.PrdUMeFo AS PrdUMeFo, T10.EmprCod, T11.ProForCod, T11.ProForLin, T10.PrdNum, T11.ProForPrd FROM (TXPPRODUC T10 INNER JOIN TXPLPROFO T11 ON" ;
      scmdbuf += " T11.EmprCod = T10.EmprCod) WHERE T10.PrdNum = T11.ProForPrd ) T9 ON T9.EmprCod = T7.EmprCod AND T9.ProForCod = T7.ProForCod AND T9.ProForLin = T7.ProForLin) ) T5" ;
      scmdbuf += " ON T5.EmprCod = T1.EmprCod AND T5.ProForCod = T1.ProForCod AND T5.ProForLin = T1.ProForLin) LEFT JOIN TXPPRODUC T6 ON T6.EmprCod = T1.EmprCod AND T6.PrdNum = T1.ProForPrd)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ProForCod = ?)");
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T2.ProForDsc" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProForLin" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProForLin DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProForPrd" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProForPrd DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProForDes" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProForDes DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProForDe2" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProForDe2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForPrdUMe" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForPrdUMe DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.ForPrdDsc" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.ForPrdDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProForCan" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProForCan DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProForNro" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProForNro DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProForTnq" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProForTnq DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProForCPo" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProForCPo DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProForFT" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProForFT DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProForCla" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProForCla DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProForClv" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProForClv DESC" ;
      }
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_H01MD17( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           short AV12OrderedBy ,
                                           boolean AV13OrderedDsc ,
                                           String AV14FilterFullText ,
                                           short A767ProForLin ,
                                           String A770ProForPrd ,
                                           String A765ProForDes ,
                                           String A13111ProForDe2 ,
                                           byte A490ForPrdUMe ,
                                           String A488ForPrdDsc ,
                                           java.math.BigDecimal A762ProForCan ,
                                           byte A1645ProForNro ,
                                           byte A3379ProForTnq ,
                                           java.math.BigDecimal A6062ProForCPo ,
                                           String A13178ProForFT ,
                                           String A763ProForCla ,
                                           String A5358ProForClv ,
                                           String A710PrdFind ,
                                           byte A4340PrdUMeFind ,
                                           String A13976PrdNomForm ,
                                           short A768ProForLinV ,
                                           String A717PrdMaxFind ,
                                           String AV7InEmprCod ,
                                           String AV8InProForCod ,
                                           String A396EmprCod ,
                                           String A764ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[2];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T6.PrdNum, T1.ProForCod, T2.ProForDsc, T1.ProForLin AS ProForLinV, T1.ProForClv, T1.ProForCla, T1.ProForFT, T1.ProForCPo, T1.ProForTnq, T1.ProForNro, T1.ProForCan," ;
      scmdbuf += " T3.ForPrdDsc, T1.ForPrdUMe, T1.ProForDe2, T1.ProForDes, COALESCE( T4.PrdMaxFind, '') AS PrdMaxFind, T1.ProForLin, COALESCE( T5.PrdUMeFind, 0) AS PrdUMeFind, COALESCE(" ;
      scmdbuf += " T6.PrdNum, 'xxxxxx') AS PrdFind, T1.ProForPrd, T1.EmprCod FROM (((((TXPLPROFO T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod)" ;
      scmdbuf += " INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) INNER JOIN (SELECT CASE  WHEN Not (T7.ProForLin = 0) THEN COALESCE( T9.GXC1," ;
      scmdbuf += " ' ') ELSE COALESCE( T8.GXC2, ' ') END AS PrdMaxFind, T7.EmprCod, T7.ProForCod, T7.ProForLin FROM TXPLPROFO T7,  (SELECT MIN(T10.ProForPrd) AS GXC2 FROM (TXPLPROFO" ;
      scmdbuf += " T10 INNER JOIN TXPCPROFO T12 ON T12.EmprCod = T10.EmprCod AND T12.ProForCod = T10.ProForCod),  (SELECT MAX(T13.ProForLin) AS GXC5 FROM (TXPLPROFO T13 INNER JOIN" ;
      scmdbuf += " TXPCPROFO T14 ON T14.EmprCod = T13.EmprCod AND T14.ProForCod = T13.ProForCod) WHERE T13.EmprCod = T14.EmprCod and T13.ProForCod = T14.ProForCod ) T11 WHERE (T10.ProForLin" ;
      scmdbuf += " = T11.GXC5) AND (T10.EmprCod = T12.EmprCod and T10.ProForCod = T12.ProForCod) ) T8,  (SELECT MIN(T10.ProForPrd) AS GXC1 FROM (TXPLPROFO T10 INNER JOIN TXPCPROFO" ;
      scmdbuf += " T12 ON T12.EmprCod = T10.EmprCod AND T12.ProForCod = T10.ProForCod),  (SELECT MAX(T13.ProForLin) AS GXC4 FROM (TXPLPROFO T13 INNER JOIN TXPCPROFO T14 ON T14.EmprCod" ;
      scmdbuf += " = T13.EmprCod AND T14.ProForCod = T13.ProForCod) WHERE T13.EmprCod = T14.EmprCod and T13.ProForCod = T14.ProForCod and T13.ProForLin < T13.ProForLin ) T11 WHERE" ;
      scmdbuf += " (T10.ProForLin = T11.GXC4) AND (T10.EmprCod = T12.EmprCod and T10.ProForCod = T12.ProForCod and T10.ProForLin < T10.ProForLin) ) T9 ) T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.ProForCod = T1.ProForCod AND T4.ProForLin = T1.ProForLin) LEFT JOIN (SELECT CASE  WHEN COALESCE( T8.PrdNum, 'xxxxxx') <> 'xxxxxx' THEN COALESCE( T9.PrdUMeFo," ;
      scmdbuf += " 0) END AS PrdUMeFind, T7.EmprCod, T7.ProForCod, T7.ProForLin FROM ((TXPLPROFO T7 LEFT JOIN TXPPRODUC T8 ON T8.EmprCod = T7.EmprCod AND T8.PrdNum = T7.ProForPrd)" ;
      scmdbuf += " LEFT JOIN (SELECT T10.PrdUMeFo AS PrdUMeFo, T10.EmprCod, T11.ProForCod, T11.ProForLin, T10.PrdNum, T11.ProForPrd FROM (TXPPRODUC T10 INNER JOIN TXPLPROFO T11 ON" ;
      scmdbuf += " T11.EmprCod = T10.EmprCod) WHERE T10.PrdNum = T11.ProForPrd ) T9 ON T9.EmprCod = T7.EmprCod AND T9.ProForCod = T7.ProForCod AND T9.ProForLin = T7.ProForLin) ) T5" ;
      scmdbuf += " ON T5.EmprCod = T1.EmprCod AND T5.ProForCod = T1.ProForCod AND T5.ProForLin = T1.ProForLin) LEFT JOIN TXPPRODUC T6 ON T6.EmprCod = T1.EmprCod AND T6.PrdNum = T1.ProForPrd)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ProForCod = ?)");
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T2.ProForDsc" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProForLin" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProForLin DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProForPrd" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProForPrd DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProForDes" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProForDes DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProForDe2" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProForDe2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForPrdUMe" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForPrdUMe DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.ForPrdDsc" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.ForPrdDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProForCan" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProForCan DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProForNro" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProForNro DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProForTnq" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProForTnq DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProForCPo" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProForCPo DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProForFT" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProForFT DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProForCla" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProForCla DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProForClv" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProForClv DESC" ;
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
                  return conditional_H01MD9(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Boolean) dynConstraints[1]).booleanValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 1 :
                  return conditional_H01MD17(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Boolean) dynConstraints[1]).booleanValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01MD9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01MD17", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((String[]) buf[11])[0] = rslt.getString(12, 5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 40);
               ((String[]) buf[15])[0] = rslt.getString(15, 26);
               ((String[]) buf[16])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(17);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(19, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(20, 6);
               ((String[]) buf[24])[0] = rslt.getString(21, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((String[]) buf[11])[0] = rslt.getString(12, 5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 40);
               ((String[]) buf[15])[0] = rslt.getString(15, 26);
               ((String[]) buf[16])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(17);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(19, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(20, 6);
               ((String[]) buf[24])[0] = rslt.getString(21, 3);
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
                  stmt.setString(sIdx, (String)parms[2], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[3], 6);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[2], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[3], 6);
               }
               return;
      }
   }

}

