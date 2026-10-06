package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcborradoformulas_impl extends GXWebComponent
{
   public wcborradoformulas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcborradoformulas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcborradoformulas_impl.class ));
   }

   public wcborradoformulas_impl( int remoteHandle ,
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
               AV72Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72Emprcod", AV72Emprcod);
               AV5CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5CliCod), 6, 0));
               AV6CliCod_to = (int)(GXutil.lval( httpContext.GetPar( "CliCod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCod_to), 6, 0));
               AV11ForSer = httpContext.GetPar( "ForSer") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11ForSer", AV11ForSer);
               AV12ForSer_to = httpContext.GetPar( "ForSer_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12ForSer_to", AV12ForSer_to);
               AV7ForColNom = httpContext.GetPar( "ForColNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7ForColNom", AV7ForColNom);
               AV8ForColNom_to = httpContext.GetPar( "ForColNom_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8ForColNom_to", AV8ForColNom_to);
               AV9ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9ForColNum), 6, 0));
               AV10ForColNum_to = (int)(GXutil.lval( httpContext.GetPar( "ForColNum_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10ForColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10ForColNum_to), 6, 0));
               AV13TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13TipColCod), 2, 0));
               AV14TipColCod_to = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14TipColCod_to), 2, 0));
               AV73ForUltUti = localUtil.parseDateParm( httpContext.GetPar( "ForUltUti")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73ForUltUti", localUtil.format(AV73ForUltUti, "99/99/99"));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV72Emprcod,Integer.valueOf(AV5CliCod),Integer.valueOf(AV6CliCod_to),AV11ForSer,AV12ForSer_to,AV7ForColNom,AV8ForColNom_to,Integer.valueOf(AV9ForColNum),Integer.valueOf(AV10ForColNum_to),Byte.valueOf(AV13TipColCod),Byte.valueOf(AV14TipColCod_to),AV73ForUltUti});
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
      nRC_GXsfl_45 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_45"))) ;
      nGXsfl_45_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_45_idx"))) ;
      sGXsfl_45_idx = httpContext.GetPar( "sGXsfl_45_idx") ;
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
      AV74FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV72Emprcod = httpContext.GetPar( "Emprcod") ;
      AV5CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV6CliCod_to = (int)(GXutil.lval( httpContext.GetPar( "CliCod_to"))) ;
      AV11ForSer = httpContext.GetPar( "ForSer") ;
      AV12ForSer_to = httpContext.GetPar( "ForSer_to") ;
      AV7ForColNom = httpContext.GetPar( "ForColNom") ;
      AV8ForColNom_to = httpContext.GetPar( "ForColNom_to") ;
      AV9ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
      AV10ForColNum_to = (int)(GXutil.lval( httpContext.GetPar( "ForColNum_to"))) ;
      AV13TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
      AV14TipColCod_to = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod_to"))) ;
      AV73ForUltUti = localUtil.parseDateParm( httpContext.GetPar( "ForUltUti")) ;
      AV34ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV29ColumnsSelector);
      AV36TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV37TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV39TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV40TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV42TFForSer = httpContext.GetPar( "TFForSer") ;
      AV43TFForSer_Sel = httpContext.GetPar( "TFForSer_Sel") ;
      AV45TFForSerDsc = httpContext.GetPar( "TFForSerDsc") ;
      AV46TFForSerDsc_Sel = httpContext.GetPar( "TFForSerDsc_Sel") ;
      AV48TFForColNom = httpContext.GetPar( "TFForColNom") ;
      AV49TFForColNom_Sel = httpContext.GetPar( "TFForColNom_Sel") ;
      AV51TFForColNum = (int)(GXutil.lval( httpContext.GetPar( "TFForColNum"))) ;
      AV52TFForColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFForColNum_To"))) ;
      AV54TFTipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TFTipColCod"))) ;
      AV55TFTipColCod_To = (byte)(GXutil.lval( httpContext.GetPar( "TFTipColCod_To"))) ;
      AV57TFTipColDsc = httpContext.GetPar( "TFTipColDsc") ;
      AV58TFTipColDsc_Sel = httpContext.GetPar( "TFTipColDsc_Sel") ;
      AV60TFForNumCol = (int)(GXutil.lval( httpContext.GetPar( "TFForNumCol"))) ;
      AV61TFForNumCol_To = (int)(GXutil.lval( httpContext.GetPar( "TFForNumCol_To"))) ;
      AV63TFForUltUti = localUtil.parseDateParm( httpContext.GetPar( "TFForUltUti")) ;
      AV101Pgmname = httpContext.GetPar( "Pgmname") ;
      AV22OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV23OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV74FilterFullText, AV72Emprcod, AV5CliCod, AV6CliCod_to, AV11ForSer, AV12ForSer_to, AV7ForColNom, AV8ForColNom_to, AV9ForColNum, AV10ForColNum_to, AV13TipColCod, AV14TipColCod_to, AV73ForUltUti, AV34ManageFiltersExecutionStep, AV29ColumnsSelector, AV36TFCliCod, AV37TFCliCod_To, AV39TFCliNom, AV40TFCliNom_Sel, AV42TFForSer, AV43TFForSer_Sel, AV45TFForSerDsc, AV46TFForSerDsc_Sel, AV48TFForColNom, AV49TFForColNom_Sel, AV51TFForColNum, AV52TFForColNum_To, AV54TFTipColCod, AV55TFTipColCod_To, AV57TFTipColDsc, AV58TFTipColDsc_Sel, AV60TFForNumCol, AV61TFForNumCol_To, AV63TFForUltUti, AV101Pgmname, AV22OrderedBy, AV23OrderedDsc, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paT42( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Mantenimiento de Formulas", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.wcborradoformulas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV72Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV5CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6CliCod_to,6,0)),GXutil.URLEncode(GXutil.rtrim(AV11ForSer)),GXutil.URLEncode(GXutil.rtrim(AV12ForSer_to)),GXutil.URLEncode(GXutil.rtrim(AV7ForColNom)),GXutil.URLEncode(GXutil.rtrim(AV8ForColNom_to)),GXutil.URLEncode(GXutil.ltrimstr(AV9ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10ForColNum_to,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV13TipColCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14TipColCod_to,2,0)),GXutil.URLEncode(GXutil.formatDateParm(AV73ForUltUti))}, new String[] {"Emprcod","CliCod","CliCod_to","ForSer","ForSer_to","ForColNom","ForColNom_to","ForColNum","ForColNum_to","TipColCod","TipColCod_to","ForUltUti"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV101Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV74FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_45, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV32ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV32ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV70GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV71GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV68DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV68DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV29ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV29ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV72Emprcod", GXutil.rtrim( wcpOAV72Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5CliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV5CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6CliCod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV6CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11ForSer", GXutil.rtrim( wcpOAV11ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12ForSer_to", GXutil.rtrim( wcpOAV12ForSer_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7ForColNom", GXutil.rtrim( wcpOAV7ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8ForColNom_to", GXutil.rtrim( wcpOAV8ForColNom_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9ForColNum", GXutil.ltrim( localUtil.ntoc( wcpOAV9ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10ForColNum_to", GXutil.ltrim( localUtil.ntoc( wcpOAV10ForColNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13TipColCod", GXutil.ltrim( localUtil.ntoc( wcpOAV13TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV14TipColCod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV14TipColCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV73ForUltUti", localUtil.dtoc( wcpOAV73ForUltUti, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV34ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV36TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV37TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV39TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV40TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORSER", GXutil.rtrim( AV42TFForSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORSER_SEL", GXutil.rtrim( AV43TFForSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORSERDSC", GXutil.rtrim( AV45TFForSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORSERDSC_SEL", GXutil.rtrim( AV46TFForSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORCOLNOM", GXutil.rtrim( AV48TFForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORCOLNOM_SEL", GXutil.rtrim( AV49TFForColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV51TFForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV52TFForColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV54TFTipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPCOLCOD_TO", GXutil.ltrim( localUtil.ntoc( AV55TFTipColCod_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPCOLDSC", GXutil.rtrim( AV57TFTipColDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPCOLDSC_SEL", GXutil.rtrim( AV58TFTipColDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORNUMCOL", GXutil.ltrim( localUtil.ntoc( AV60TFForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORNUMCOL_TO", GXutil.ltrim( localUtil.ntoc( AV61TFForNumCol_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORULTUTI", localUtil.dtoc( AV63TFForUltUti, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV101Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV101Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV22OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV23OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV72Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV5CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV6CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORSER", GXutil.rtrim( AV11ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORSER_TO", GXutil.rtrim( AV12ForSer_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNOM", GXutil.rtrim( AV7ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNOM_TO", GXutil.rtrim( AV8ForColNom_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV9ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV10ForColNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV13TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPCOLCOD_TO", GXutil.ltrim( localUtil.ntoc( AV14TipColCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORULTUTI", localUtil.dtoc( AV73ForUltUti, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV20GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV20GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icontype", GXutil.rtrim( Ddo_managefilters_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icon", GXutil.rtrim( Ddo_managefilters_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Tooltip", GXutil.rtrim( Ddo_managefilters_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Cls", GXutil.rtrim( Ddo_managefilters_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_tableheader_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Width", GXutil.rtrim( Innewwindow1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Height", GXutil.rtrim( Innewwindow1_Height));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Target", GXutil.rtrim( Innewwindow1_Target));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BORRARFORMULAS_Title", GXutil.rtrim( Dvelop_confirmpanel_borrarformulas_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BORRARFORMULAS_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_borrarformulas_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BORRARFORMULAS_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_borrarformulas_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BORRARFORMULAS_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_borrarformulas_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BORRARFORMULAS_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_borrarformulas_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BORRARFORMULAS_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_borrarformulas_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BORRARFORMULAS_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_borrarformulas_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BORRARFORMULAS_Result", GXutil.rtrim( Dvelop_confirmpanel_borrarformulas_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BORRARFORMULAS_Result", GXutil.rtrim( Dvelop_confirmpanel_borrarformulas_Result));
   }

   public void renderHtmlCloseFormT42( )
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
      return "FormulacionTinte.WCBorradoFormulas" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento de Formulas", "") ;
   }

   public void wbT40( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.formulaciontinte.wcborradoformulas");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tableheader.setProperty("Width", Dvpanel_tableheader_Width);
         ucDvpanel_tableheader.setProperty("AutoWidth", Dvpanel_tableheader_Autowidth);
         ucDvpanel_tableheader.setProperty("AutoHeight", Dvpanel_tableheader_Autoheight);
         ucDvpanel_tableheader.setProperty("Cls", Dvpanel_tableheader_Cls);
         ucDvpanel_tableheader.setProperty("Title", Dvpanel_tableheader_Title);
         ucDvpanel_tableheader.setProperty("Collapsible", Dvpanel_tableheader_Collapsible);
         ucDvpanel_tableheader.setProperty("Collapsed", Dvpanel_tableheader_Collapsed);
         ucDvpanel_tableheader.setProperty("ShowCollapseIcon", Dvpanel_tableheader_Showcollapseicon);
         ucDvpanel_tableheader.setProperty("IconPosition", Dvpanel_tableheader_Iconposition);
         ucDvpanel_tableheader.setProperty("AutoScroll", Dvpanel_tableheader_Autoscroll);
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, sPrefix+"DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\WCBorradoFormulas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 7, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11t41_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\WCBorradoFormulas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\WCBorradoFormulas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\WCBorradoFormulas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnborrarformulas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "Borrar Formulas", ""), bttBtnborrarformulas_Jsonclick, 7, httpContext.getMessage( "Borrar Formulas", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e12t41_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\WCBorradoFormulas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_T42( true) ;
      }
      else
      {
         wb_table1_27_T42( false) ;
      }
      return  ;
   }

   public void wb_table1_27_T42e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol45( ) ;
      }
      if ( wbEnd == 45 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_45 = (int)(nGXsfl_45_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
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
         ucGridpaginationbar.setProperty("CurrentPage", AV70GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV71GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
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
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV68DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, sPrefix+"INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV68DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV29ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_65_T42( true) ;
      }
      else
      {
         wb_table2_65_T42( false) ;
      }
      return  ;
   }

   public void wb_table2_65_T42e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_forultutiauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'" + sPrefix + "',false,'" + sGXsfl_45_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_forultutiauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_forultutiauxdate_Internalname, localUtil.format(AV65DDO_ForUltUtiAuxDate, "99/99/99"), localUtil.format( AV65DDO_ForUltUtiAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,72);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_forultutiauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\WCBorradoFormulas.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_forultutiauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\WCBorradoFormulas.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 45 )
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

   public void startT42( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Mantenimiento de Formulas", ""), (short)(0)) ;
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
            strupT40( ) ;
         }
      }
   }

   public void wsT42( )
   {
      startT42( ) ;
      evtT42( ) ;
   }

   public void evtT42( )
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
                              strupT40( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "DDO_MANAGEFILTERS.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT40( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e13T42 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT40( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e14T42 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT40( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e15T42 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT40( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e16T42 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT40( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e17T42 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BORRARFORMULAS.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT40( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e18T42 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT40( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e19T42 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT40( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e20T42 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT40( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavFilterfulltext_Internalname ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT40( ) ;
                           }
                           nGXsfl_45_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_452( ) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
                           A5742ForSerDsc = httpContext.cgiGet( edtForSerDsc_Internalname) ;
                           n5742ForSerDsc = false ;
                           A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
                           A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A832TipColDsc = httpContext.cgiGet( edtTipColDsc_Internalname) ;
                           n832TipColDsc = false ;
                           A486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A496ForUltUti = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtForUltUti_Internalname), 0)) ;
                           n496ForUltUti = false ;
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e21T42 ();
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e22T42 ();
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e23T42 ();
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
                                          /* Set Refresh If Filterfulltext Changed */
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV74FilterFullText) != 0 )
                                          {
                                             Rfr0gs = true ;
                                          }
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
                                    strupT40( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
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

   public void weT42( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormT42( ) ;
         }
      }
   }

   public void paT42( )
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
            GX_FocusControl = edtavFilterfulltext_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
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
      subsflControlProps_452( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         sendrow_452( ) ;
         nGXsfl_45_idx = ((subGrid_Islastpage==1)&&(nGXsfl_45_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV74FilterFullText ,
                                 String AV72Emprcod ,
                                 int AV5CliCod ,
                                 int AV6CliCod_to ,
                                 String AV11ForSer ,
                                 String AV12ForSer_to ,
                                 String AV7ForColNom ,
                                 String AV8ForColNom_to ,
                                 int AV9ForColNum ,
                                 int AV10ForColNum_to ,
                                 byte AV13TipColCod ,
                                 byte AV14TipColCod_to ,
                                 java.util.Date AV73ForUltUti ,
                                 byte AV34ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV29ColumnsSelector ,
                                 int AV36TFCliCod ,
                                 int AV37TFCliCod_To ,
                                 String AV39TFCliNom ,
                                 String AV40TFCliNom_Sel ,
                                 String AV42TFForSer ,
                                 String AV43TFForSer_Sel ,
                                 String AV45TFForSerDsc ,
                                 String AV46TFForSerDsc_Sel ,
                                 String AV48TFForColNom ,
                                 String AV49TFForColNom_Sel ,
                                 int AV51TFForColNum ,
                                 int AV52TFForColNum_To ,
                                 byte AV54TFTipColCod ,
                                 byte AV55TFTipColCod_To ,
                                 String AV57TFTipColDsc ,
                                 String AV58TFTipColDsc_Sel ,
                                 int AV60TFForNumCol ,
                                 int AV61TFForNumCol_To ,
                                 java.util.Date AV63TFForUltUti ,
                                 String AV101Pgmname ,
                                 short AV22OrderedBy ,
                                 boolean AV23OrderedDsc ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e22T42 ();
      GRID_nCurrentRecord = 0 ;
      rfT42( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      rfT42( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV101Pgmname = "FormulacionTinte.WCBorradoFormulas" ;
      Gx_err = (short)(0) ;
   }

   public void rfT42( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e22T42 ();
      nGXsfl_45_idx = 1 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_452( ) ;
      bGXsfl_45_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
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
         subsflControlProps_452( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext ,
                                              Integer.valueOf(AV82Formulaciontinte_wcborradoformulasds_2_tfclicod) ,
                                              Integer.valueOf(AV83Formulaciontinte_wcborradoformulasds_3_tfclicod_to) ,
                                              AV85Formulaciontinte_wcborradoformulasds_5_tfclinom_sel ,
                                              AV84Formulaciontinte_wcborradoformulasds_4_tfclinom ,
                                              AV87Formulaciontinte_wcborradoformulasds_7_tfforser_sel ,
                                              AV86Formulaciontinte_wcborradoformulasds_6_tfforser ,
                                              AV89Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel ,
                                              AV88Formulaciontinte_wcborradoformulasds_8_tfforserdsc ,
                                              AV91Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel ,
                                              AV90Formulaciontinte_wcborradoformulasds_10_tfforcolnom ,
                                              Integer.valueOf(AV92Formulaciontinte_wcborradoformulasds_12_tfforcolnum) ,
                                              Integer.valueOf(AV93Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to) ,
                                              Byte.valueOf(AV94Formulaciontinte_wcborradoformulasds_14_tftipcolcod) ,
                                              Byte.valueOf(AV95Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to) ,
                                              AV97Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel ,
                                              AV96Formulaciontinte_wcborradoformulasds_16_tftipcoldsc ,
                                              Integer.valueOf(AV98Formulaciontinte_wcborradoformulasds_18_tffornumcol) ,
                                              Integer.valueOf(AV99Formulaciontinte_wcborradoformulasds_19_tffornumcol_to) ,
                                              AV100Formulaciontinte_wcborradoformulasds_20_tfforultuti ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A494ForSer ,
                                              A5742ForSerDsc ,
                                              A482ForColNom ,
                                              Integer.valueOf(A483ForColNum) ,
                                              Byte.valueOf(A831TipColCod) ,
                                              A832TipColDsc ,
                                              Integer.valueOf(A486ForNumCol) ,
                                              A496ForUltUti ,
                                              Short.valueOf(AV22OrderedBy) ,
                                              Boolean.valueOf(AV23OrderedDsc) ,
                                              AV12ForSer_to ,
                                              AV8ForColNom_to ,
                                              Integer.valueOf(AV10ForColNum_to) ,
                                              Byte.valueOf(AV14TipColCod_to) ,
                                              AV73ForUltUti ,
                                              AV72Emprcod ,
                                              Integer.valueOf(AV5CliCod) ,
                                              AV11ForSer ,
                                              AV7ForColNom ,
                                              Integer.valueOf(AV9ForColNum) ,
                                              Byte.valueOf(AV13TipColCod) ,
                                              A396EmprCod ,
                                              Integer.valueOf(AV6CliCod_to) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
         lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
         lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
         lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
         lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
         lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
         lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
         lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
         lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
         lV84Formulaciontinte_wcborradoformulasds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV84Formulaciontinte_wcborradoformulasds_4_tfclinom), 30, "%") ;
         lV86Formulaciontinte_wcborradoformulasds_6_tfforser = GXutil.padr( GXutil.rtrim( AV86Formulaciontinte_wcborradoformulasds_6_tfforser), 16, "%") ;
         lV88Formulaciontinte_wcborradoformulasds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV88Formulaciontinte_wcborradoformulasds_8_tfforserdsc), 26, "%") ;
         lV90Formulaciontinte_wcborradoformulasds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV90Formulaciontinte_wcborradoformulasds_10_tfforcolnom), 13, "%") ;
         lV96Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV96Formulaciontinte_wcborradoformulasds_16_tftipcoldsc), 30, "%") ;
         /* Using cursor H00T42 */
         pr_default.execute(0, new Object[] {AV72Emprcod, Integer.valueOf(AV5CliCod), AV11ForSer, AV7ForColNom, Integer.valueOf(AV9ForColNum), Byte.valueOf(AV13TipColCod), AV12ForSer_to, AV8ForColNom_to, Integer.valueOf(AV10ForColNum_to), Byte.valueOf(AV14TipColCod_to), AV73ForUltUti, AV73ForUltUti, Integer.valueOf(AV6CliCod_to), lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext, Integer.valueOf(AV82Formulaciontinte_wcborradoformulasds_2_tfclicod), Integer.valueOf(AV83Formulaciontinte_wcborradoformulasds_3_tfclicod_to), lV84Formulaciontinte_wcborradoformulasds_4_tfclinom, AV85Formulaciontinte_wcborradoformulasds_5_tfclinom_sel, lV86Formulaciontinte_wcborradoformulasds_6_tfforser, AV87Formulaciontinte_wcborradoformulasds_7_tfforser_sel, lV88Formulaciontinte_wcborradoformulasds_8_tfforserdsc, AV89Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel, lV90Formulaciontinte_wcborradoformulasds_10_tfforcolnom, AV91Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel, Integer.valueOf(AV92Formulaciontinte_wcborradoformulasds_12_tfforcolnum), Integer.valueOf(AV93Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to), Byte.valueOf(AV94Formulaciontinte_wcborradoformulasds_14_tftipcolcod), Byte.valueOf(AV95Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to), lV96Formulaciontinte_wcborradoformulasds_16_tftipcoldsc, AV97Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel, Integer.valueOf(AV98Formulaciontinte_wcborradoformulasds_18_tffornumcol), Integer.valueOf(AV99Formulaciontinte_wcborradoformulasds_19_tffornumcol_to), AV100Formulaciontinte_wcborradoformulasds_20_tfforultuti, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H00T42_A396EmprCod[0] ;
            A496ForUltUti = H00T42_A496ForUltUti[0] ;
            n496ForUltUti = H00T42_n496ForUltUti[0] ;
            A486ForNumCol = H00T42_A486ForNumCol[0] ;
            A832TipColDsc = H00T42_A832TipColDsc[0] ;
            n832TipColDsc = H00T42_n832TipColDsc[0] ;
            A831TipColCod = H00T42_A831TipColCod[0] ;
            A483ForColNum = H00T42_A483ForColNum[0] ;
            A482ForColNom = H00T42_A482ForColNom[0] ;
            A5742ForSerDsc = H00T42_A5742ForSerDsc[0] ;
            n5742ForSerDsc = H00T42_n5742ForSerDsc[0] ;
            A494ForSer = H00T42_A494ForSer[0] ;
            A279CliNom = H00T42_A279CliNom[0] ;
            A252CliCod = H00T42_A252CliCod[0] ;
            A832TipColDsc = H00T42_A832TipColDsc[0] ;
            n832TipColDsc = H00T42_n832TipColDsc[0] ;
            A279CliNom = H00T42_A279CliNom[0] ;
            e23T42 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(45) ;
         wbT40( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesT42( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV101Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV101Pgmname, ""))));
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
      AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = AV74FilterFullText ;
      AV82Formulaciontinte_wcborradoformulasds_2_tfclicod = AV36TFCliCod ;
      AV83Formulaciontinte_wcborradoformulasds_3_tfclicod_to = AV37TFCliCod_To ;
      AV84Formulaciontinte_wcborradoformulasds_4_tfclinom = AV39TFCliNom ;
      AV85Formulaciontinte_wcborradoformulasds_5_tfclinom_sel = AV40TFCliNom_Sel ;
      AV86Formulaciontinte_wcborradoformulasds_6_tfforser = AV42TFForSer ;
      AV87Formulaciontinte_wcborradoformulasds_7_tfforser_sel = AV43TFForSer_Sel ;
      AV88Formulaciontinte_wcborradoformulasds_8_tfforserdsc = AV45TFForSerDsc ;
      AV89Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel = AV46TFForSerDsc_Sel ;
      AV90Formulaciontinte_wcborradoformulasds_10_tfforcolnom = AV48TFForColNom ;
      AV91Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel = AV49TFForColNom_Sel ;
      AV92Formulaciontinte_wcborradoformulasds_12_tfforcolnum = AV51TFForColNum ;
      AV93Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to = AV52TFForColNum_To ;
      AV94Formulaciontinte_wcborradoformulasds_14_tftipcolcod = AV54TFTipColCod ;
      AV95Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to = AV55TFTipColCod_To ;
      AV96Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = AV57TFTipColDsc ;
      AV97Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel = AV58TFTipColDsc_Sel ;
      AV98Formulaciontinte_wcborradoformulasds_18_tffornumcol = AV60TFForNumCol ;
      AV99Formulaciontinte_wcborradoformulasds_19_tffornumcol_to = AV61TFForNumCol_To ;
      AV100Formulaciontinte_wcborradoformulasds_20_tfforultuti = AV63TFForUltUti ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext ,
                                           Integer.valueOf(AV82Formulaciontinte_wcborradoformulasds_2_tfclicod) ,
                                           Integer.valueOf(AV83Formulaciontinte_wcborradoformulasds_3_tfclicod_to) ,
                                           AV85Formulaciontinte_wcborradoformulasds_5_tfclinom_sel ,
                                           AV84Formulaciontinte_wcborradoformulasds_4_tfclinom ,
                                           AV87Formulaciontinte_wcborradoformulasds_7_tfforser_sel ,
                                           AV86Formulaciontinte_wcborradoformulasds_6_tfforser ,
                                           AV89Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel ,
                                           AV88Formulaciontinte_wcborradoformulasds_8_tfforserdsc ,
                                           AV91Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel ,
                                           AV90Formulaciontinte_wcborradoformulasds_10_tfforcolnom ,
                                           Integer.valueOf(AV92Formulaciontinte_wcborradoformulasds_12_tfforcolnum) ,
                                           Integer.valueOf(AV93Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to) ,
                                           Byte.valueOf(AV94Formulaciontinte_wcborradoformulasds_14_tftipcolcod) ,
                                           Byte.valueOf(AV95Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to) ,
                                           AV97Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel ,
                                           AV96Formulaciontinte_wcborradoformulasds_16_tftipcoldsc ,
                                           Integer.valueOf(AV98Formulaciontinte_wcborradoformulasds_18_tffornumcol) ,
                                           Integer.valueOf(AV99Formulaciontinte_wcborradoformulasds_19_tffornumcol_to) ,
                                           AV100Formulaciontinte_wcborradoformulasds_20_tfforultuti ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A496ForUltUti ,
                                           Short.valueOf(AV22OrderedBy) ,
                                           Boolean.valueOf(AV23OrderedDsc) ,
                                           AV12ForSer_to ,
                                           AV8ForColNom_to ,
                                           Integer.valueOf(AV10ForColNum_to) ,
                                           Byte.valueOf(AV14TipColCod_to) ,
                                           AV73ForUltUti ,
                                           AV72Emprcod ,
                                           Integer.valueOf(AV5CliCod) ,
                                           AV11ForSer ,
                                           AV7ForColNom ,
                                           Integer.valueOf(AV9ForColNum) ,
                                           Byte.valueOf(AV13TipColCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(AV6CliCod_to) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV84Formulaciontinte_wcborradoformulasds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV84Formulaciontinte_wcborradoformulasds_4_tfclinom), 30, "%") ;
      lV86Formulaciontinte_wcborradoformulasds_6_tfforser = GXutil.padr( GXutil.rtrim( AV86Formulaciontinte_wcborradoformulasds_6_tfforser), 16, "%") ;
      lV88Formulaciontinte_wcborradoformulasds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV88Formulaciontinte_wcborradoformulasds_8_tfforserdsc), 26, "%") ;
      lV90Formulaciontinte_wcborradoformulasds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV90Formulaciontinte_wcborradoformulasds_10_tfforcolnom), 13, "%") ;
      lV96Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV96Formulaciontinte_wcborradoformulasds_16_tftipcoldsc), 30, "%") ;
      /* Using cursor H00T43 */
      pr_default.execute(1, new Object[] {AV72Emprcod, Integer.valueOf(AV5CliCod), AV11ForSer, AV7ForColNom, Integer.valueOf(AV9ForColNum), Byte.valueOf(AV13TipColCod), AV12ForSer_to, AV8ForColNom_to, Integer.valueOf(AV10ForColNum_to), Byte.valueOf(AV14TipColCod_to), AV73ForUltUti, AV73ForUltUti, Integer.valueOf(AV6CliCod_to), lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext, Integer.valueOf(AV82Formulaciontinte_wcborradoformulasds_2_tfclicod), Integer.valueOf(AV83Formulaciontinte_wcborradoformulasds_3_tfclicod_to), lV84Formulaciontinte_wcborradoformulasds_4_tfclinom, AV85Formulaciontinte_wcborradoformulasds_5_tfclinom_sel, lV86Formulaciontinte_wcborradoformulasds_6_tfforser, AV87Formulaciontinte_wcborradoformulasds_7_tfforser_sel, lV88Formulaciontinte_wcborradoformulasds_8_tfforserdsc, AV89Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel, lV90Formulaciontinte_wcborradoformulasds_10_tfforcolnom, AV91Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel, Integer.valueOf(AV92Formulaciontinte_wcborradoformulasds_12_tfforcolnum), Integer.valueOf(AV93Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to), Byte.valueOf(AV94Formulaciontinte_wcborradoformulasds_14_tftipcolcod), Byte.valueOf(AV95Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to), lV96Formulaciontinte_wcborradoformulasds_16_tftipcoldsc, AV97Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel, Integer.valueOf(AV98Formulaciontinte_wcborradoformulasds_18_tffornumcol), Integer.valueOf(AV99Formulaciontinte_wcborradoformulasds_19_tffornumcol_to), AV100Formulaciontinte_wcborradoformulasds_20_tfforultuti});
      GRID_nRecordCount = H00T43_AGRID_nRecordCount[0] ;
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
      AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = AV74FilterFullText ;
      AV82Formulaciontinte_wcborradoformulasds_2_tfclicod = AV36TFCliCod ;
      AV83Formulaciontinte_wcborradoformulasds_3_tfclicod_to = AV37TFCliCod_To ;
      AV84Formulaciontinte_wcborradoformulasds_4_tfclinom = AV39TFCliNom ;
      AV85Formulaciontinte_wcborradoformulasds_5_tfclinom_sel = AV40TFCliNom_Sel ;
      AV86Formulaciontinte_wcborradoformulasds_6_tfforser = AV42TFForSer ;
      AV87Formulaciontinte_wcborradoformulasds_7_tfforser_sel = AV43TFForSer_Sel ;
      AV88Formulaciontinte_wcborradoformulasds_8_tfforserdsc = AV45TFForSerDsc ;
      AV89Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel = AV46TFForSerDsc_Sel ;
      AV90Formulaciontinte_wcborradoformulasds_10_tfforcolnom = AV48TFForColNom ;
      AV91Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel = AV49TFForColNom_Sel ;
      AV92Formulaciontinte_wcborradoformulasds_12_tfforcolnum = AV51TFForColNum ;
      AV93Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to = AV52TFForColNum_To ;
      AV94Formulaciontinte_wcborradoformulasds_14_tftipcolcod = AV54TFTipColCod ;
      AV95Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to = AV55TFTipColCod_To ;
      AV96Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = AV57TFTipColDsc ;
      AV97Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel = AV58TFTipColDsc_Sel ;
      AV98Formulaciontinte_wcborradoformulasds_18_tffornumcol = AV60TFForNumCol ;
      AV99Formulaciontinte_wcborradoformulasds_19_tffornumcol_to = AV61TFForNumCol_To ;
      AV100Formulaciontinte_wcborradoformulasds_20_tfforultuti = AV63TFForUltUti ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV74FilterFullText, AV72Emprcod, AV5CliCod, AV6CliCod_to, AV11ForSer, AV12ForSer_to, AV7ForColNom, AV8ForColNom_to, AV9ForColNum, AV10ForColNum_to, AV13TipColCod, AV14TipColCod_to, AV73ForUltUti, AV34ManageFiltersExecutionStep, AV29ColumnsSelector, AV36TFCliCod, AV37TFCliCod_To, AV39TFCliNom, AV40TFCliNom_Sel, AV42TFForSer, AV43TFForSer_Sel, AV45TFForSerDsc, AV46TFForSerDsc_Sel, AV48TFForColNom, AV49TFForColNom_Sel, AV51TFForColNum, AV52TFForColNum_To, AV54TFTipColCod, AV55TFTipColCod_To, AV57TFTipColDsc, AV58TFTipColDsc_Sel, AV60TFForNumCol, AV61TFForNumCol_To, AV63TFForUltUti, AV101Pgmname, AV22OrderedBy, AV23OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = AV74FilterFullText ;
      AV82Formulaciontinte_wcborradoformulasds_2_tfclicod = AV36TFCliCod ;
      AV83Formulaciontinte_wcborradoformulasds_3_tfclicod_to = AV37TFCliCod_To ;
      AV84Formulaciontinte_wcborradoformulasds_4_tfclinom = AV39TFCliNom ;
      AV85Formulaciontinte_wcborradoformulasds_5_tfclinom_sel = AV40TFCliNom_Sel ;
      AV86Formulaciontinte_wcborradoformulasds_6_tfforser = AV42TFForSer ;
      AV87Formulaciontinte_wcborradoformulasds_7_tfforser_sel = AV43TFForSer_Sel ;
      AV88Formulaciontinte_wcborradoformulasds_8_tfforserdsc = AV45TFForSerDsc ;
      AV89Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel = AV46TFForSerDsc_Sel ;
      AV90Formulaciontinte_wcborradoformulasds_10_tfforcolnom = AV48TFForColNom ;
      AV91Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel = AV49TFForColNom_Sel ;
      AV92Formulaciontinte_wcborradoformulasds_12_tfforcolnum = AV51TFForColNum ;
      AV93Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to = AV52TFForColNum_To ;
      AV94Formulaciontinte_wcborradoformulasds_14_tftipcolcod = AV54TFTipColCod ;
      AV95Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to = AV55TFTipColCod_To ;
      AV96Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = AV57TFTipColDsc ;
      AV97Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel = AV58TFTipColDsc_Sel ;
      AV98Formulaciontinte_wcborradoformulasds_18_tffornumcol = AV60TFForNumCol ;
      AV99Formulaciontinte_wcborradoformulasds_19_tffornumcol_to = AV61TFForNumCol_To ;
      AV100Formulaciontinte_wcborradoformulasds_20_tfforultuti = AV63TFForUltUti ;
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
         gxgrgrid_refresh( subGrid_Rows, AV74FilterFullText, AV72Emprcod, AV5CliCod, AV6CliCod_to, AV11ForSer, AV12ForSer_to, AV7ForColNom, AV8ForColNom_to, AV9ForColNum, AV10ForColNum_to, AV13TipColCod, AV14TipColCod_to, AV73ForUltUti, AV34ManageFiltersExecutionStep, AV29ColumnsSelector, AV36TFCliCod, AV37TFCliCod_To, AV39TFCliNom, AV40TFCliNom_Sel, AV42TFForSer, AV43TFForSer_Sel, AV45TFForSerDsc, AV46TFForSerDsc_Sel, AV48TFForColNom, AV49TFForColNom_Sel, AV51TFForColNum, AV52TFForColNum_To, AV54TFTipColCod, AV55TFTipColCod_To, AV57TFTipColDsc, AV58TFTipColDsc_Sel, AV60TFForNumCol, AV61TFForNumCol_To, AV63TFForUltUti, AV101Pgmname, AV22OrderedBy, AV23OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = AV74FilterFullText ;
      AV82Formulaciontinte_wcborradoformulasds_2_tfclicod = AV36TFCliCod ;
      AV83Formulaciontinte_wcborradoformulasds_3_tfclicod_to = AV37TFCliCod_To ;
      AV84Formulaciontinte_wcborradoformulasds_4_tfclinom = AV39TFCliNom ;
      AV85Formulaciontinte_wcborradoformulasds_5_tfclinom_sel = AV40TFCliNom_Sel ;
      AV86Formulaciontinte_wcborradoformulasds_6_tfforser = AV42TFForSer ;
      AV87Formulaciontinte_wcborradoformulasds_7_tfforser_sel = AV43TFForSer_Sel ;
      AV88Formulaciontinte_wcborradoformulasds_8_tfforserdsc = AV45TFForSerDsc ;
      AV89Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel = AV46TFForSerDsc_Sel ;
      AV90Formulaciontinte_wcborradoformulasds_10_tfforcolnom = AV48TFForColNom ;
      AV91Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel = AV49TFForColNom_Sel ;
      AV92Formulaciontinte_wcborradoformulasds_12_tfforcolnum = AV51TFForColNum ;
      AV93Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to = AV52TFForColNum_To ;
      AV94Formulaciontinte_wcborradoformulasds_14_tftipcolcod = AV54TFTipColCod ;
      AV95Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to = AV55TFTipColCod_To ;
      AV96Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = AV57TFTipColDsc ;
      AV97Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel = AV58TFTipColDsc_Sel ;
      AV98Formulaciontinte_wcborradoformulasds_18_tffornumcol = AV60TFForNumCol ;
      AV99Formulaciontinte_wcborradoformulasds_19_tffornumcol_to = AV61TFForNumCol_To ;
      AV100Formulaciontinte_wcborradoformulasds_20_tfforultuti = AV63TFForUltUti ;
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
         gxgrgrid_refresh( subGrid_Rows, AV74FilterFullText, AV72Emprcod, AV5CliCod, AV6CliCod_to, AV11ForSer, AV12ForSer_to, AV7ForColNom, AV8ForColNom_to, AV9ForColNum, AV10ForColNum_to, AV13TipColCod, AV14TipColCod_to, AV73ForUltUti, AV34ManageFiltersExecutionStep, AV29ColumnsSelector, AV36TFCliCod, AV37TFCliCod_To, AV39TFCliNom, AV40TFCliNom_Sel, AV42TFForSer, AV43TFForSer_Sel, AV45TFForSerDsc, AV46TFForSerDsc_Sel, AV48TFForColNom, AV49TFForColNom_Sel, AV51TFForColNum, AV52TFForColNum_To, AV54TFTipColCod, AV55TFTipColCod_To, AV57TFTipColDsc, AV58TFTipColDsc_Sel, AV60TFForNumCol, AV61TFForNumCol_To, AV63TFForUltUti, AV101Pgmname, AV22OrderedBy, AV23OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = AV74FilterFullText ;
      AV82Formulaciontinte_wcborradoformulasds_2_tfclicod = AV36TFCliCod ;
      AV83Formulaciontinte_wcborradoformulasds_3_tfclicod_to = AV37TFCliCod_To ;
      AV84Formulaciontinte_wcborradoformulasds_4_tfclinom = AV39TFCliNom ;
      AV85Formulaciontinte_wcborradoformulasds_5_tfclinom_sel = AV40TFCliNom_Sel ;
      AV86Formulaciontinte_wcborradoformulasds_6_tfforser = AV42TFForSer ;
      AV87Formulaciontinte_wcborradoformulasds_7_tfforser_sel = AV43TFForSer_Sel ;
      AV88Formulaciontinte_wcborradoformulasds_8_tfforserdsc = AV45TFForSerDsc ;
      AV89Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel = AV46TFForSerDsc_Sel ;
      AV90Formulaciontinte_wcborradoformulasds_10_tfforcolnom = AV48TFForColNom ;
      AV91Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel = AV49TFForColNom_Sel ;
      AV92Formulaciontinte_wcborradoformulasds_12_tfforcolnum = AV51TFForColNum ;
      AV93Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to = AV52TFForColNum_To ;
      AV94Formulaciontinte_wcborradoformulasds_14_tftipcolcod = AV54TFTipColCod ;
      AV95Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to = AV55TFTipColCod_To ;
      AV96Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = AV57TFTipColDsc ;
      AV97Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel = AV58TFTipColDsc_Sel ;
      AV98Formulaciontinte_wcborradoformulasds_18_tffornumcol = AV60TFForNumCol ;
      AV99Formulaciontinte_wcborradoformulasds_19_tffornumcol_to = AV61TFForNumCol_To ;
      AV100Formulaciontinte_wcborradoformulasds_20_tfforultuti = AV63TFForUltUti ;
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
         gxgrgrid_refresh( subGrid_Rows, AV74FilterFullText, AV72Emprcod, AV5CliCod, AV6CliCod_to, AV11ForSer, AV12ForSer_to, AV7ForColNom, AV8ForColNom_to, AV9ForColNum, AV10ForColNum_to, AV13TipColCod, AV14TipColCod_to, AV73ForUltUti, AV34ManageFiltersExecutionStep, AV29ColumnsSelector, AV36TFCliCod, AV37TFCliCod_To, AV39TFCliNom, AV40TFCliNom_Sel, AV42TFForSer, AV43TFForSer_Sel, AV45TFForSerDsc, AV46TFForSerDsc_Sel, AV48TFForColNom, AV49TFForColNom_Sel, AV51TFForColNum, AV52TFForColNum_To, AV54TFTipColCod, AV55TFTipColCod_To, AV57TFTipColDsc, AV58TFTipColDsc_Sel, AV60TFForNumCol, AV61TFForNumCol_To, AV63TFForUltUti, AV101Pgmname, AV22OrderedBy, AV23OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = AV74FilterFullText ;
      AV82Formulaciontinte_wcborradoformulasds_2_tfclicod = AV36TFCliCod ;
      AV83Formulaciontinte_wcborradoformulasds_3_tfclicod_to = AV37TFCliCod_To ;
      AV84Formulaciontinte_wcborradoformulasds_4_tfclinom = AV39TFCliNom ;
      AV85Formulaciontinte_wcborradoformulasds_5_tfclinom_sel = AV40TFCliNom_Sel ;
      AV86Formulaciontinte_wcborradoformulasds_6_tfforser = AV42TFForSer ;
      AV87Formulaciontinte_wcborradoformulasds_7_tfforser_sel = AV43TFForSer_Sel ;
      AV88Formulaciontinte_wcborradoformulasds_8_tfforserdsc = AV45TFForSerDsc ;
      AV89Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel = AV46TFForSerDsc_Sel ;
      AV90Formulaciontinte_wcborradoformulasds_10_tfforcolnom = AV48TFForColNom ;
      AV91Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel = AV49TFForColNom_Sel ;
      AV92Formulaciontinte_wcborradoformulasds_12_tfforcolnum = AV51TFForColNum ;
      AV93Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to = AV52TFForColNum_To ;
      AV94Formulaciontinte_wcborradoformulasds_14_tftipcolcod = AV54TFTipColCod ;
      AV95Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to = AV55TFTipColCod_To ;
      AV96Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = AV57TFTipColDsc ;
      AV97Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel = AV58TFTipColDsc_Sel ;
      AV98Formulaciontinte_wcborradoformulasds_18_tffornumcol = AV60TFForNumCol ;
      AV99Formulaciontinte_wcborradoformulasds_19_tffornumcol_to = AV61TFForNumCol_To ;
      AV100Formulaciontinte_wcborradoformulasds_20_tfforultuti = AV63TFForUltUti ;
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
         gxgrgrid_refresh( subGrid_Rows, AV74FilterFullText, AV72Emprcod, AV5CliCod, AV6CliCod_to, AV11ForSer, AV12ForSer_to, AV7ForColNom, AV8ForColNom_to, AV9ForColNum, AV10ForColNum_to, AV13TipColCod, AV14TipColCod_to, AV73ForUltUti, AV34ManageFiltersExecutionStep, AV29ColumnsSelector, AV36TFCliCod, AV37TFCliCod_To, AV39TFCliNom, AV40TFCliNom_Sel, AV42TFForSer, AV43TFForSer_Sel, AV45TFForSerDsc, AV46TFForSerDsc_Sel, AV48TFForColNom, AV49TFForColNom_Sel, AV51TFForColNum, AV52TFForColNum_To, AV54TFTipColCod, AV55TFTipColCod_To, AV57TFTipColDsc, AV58TFTipColDsc_Sel, AV60TFForNumCol, AV61TFForNumCol_To, AV63TFForUltUti, AV101Pgmname, AV22OrderedBy, AV23OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV101Pgmname = "FormulacionTinte.WCBorradoFormulas" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupT40( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e21T42 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV32ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV68DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV29ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV70GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV71GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV72Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV72Emprcod") ;
         wcpOAV5CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV5CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV6CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6CliCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV11ForSer = httpContext.cgiGet( sPrefix+"wcpOAV11ForSer") ;
         wcpOAV12ForSer_to = httpContext.cgiGet( sPrefix+"wcpOAV12ForSer_to") ;
         wcpOAV7ForColNom = httpContext.cgiGet( sPrefix+"wcpOAV7ForColNom") ;
         wcpOAV8ForColNom_to = httpContext.cgiGet( sPrefix+"wcpOAV8ForColNom_to") ;
         wcpOAV9ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV10ForColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10ForColNum_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV13TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV13TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV14TipColCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV14TipColCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV73ForUltUti = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV73ForUltUti"), 0) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_managefilters_Icontype = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icontype") ;
         Ddo_managefilters_Icon = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icon") ;
         Ddo_managefilters_Tooltip = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Tooltip") ;
         Ddo_managefilters_Cls = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Cls") ;
         Dvpanel_tableheader_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_tableheader_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_tableheader_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_tableheader_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoscroll")) ;
         Gridpaginationbar_Class = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Innewwindow1_Width = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Width") ;
         Innewwindow1_Height = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Height") ;
         Innewwindow1_Target = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Target") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Dvelop_confirmpanel_borrarformulas_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BORRARFORMULAS_Title") ;
         Dvelop_confirmpanel_borrarformulas_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BORRARFORMULAS_Confirmationtext") ;
         Dvelop_confirmpanel_borrarformulas_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BORRARFORMULAS_Yesbuttoncaption") ;
         Dvelop_confirmpanel_borrarformulas_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BORRARFORMULAS_Nobuttoncaption") ;
         Dvelop_confirmpanel_borrarformulas_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BORRARFORMULAS_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_borrarformulas_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BORRARFORMULAS_Yesbuttonposition") ;
         Dvelop_confirmpanel_borrarformulas_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BORRARFORMULAS_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvelop_confirmpanel_borrarformulas_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BORRARFORMULAS_Result") ;
         /* Read variables values. */
         AV74FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74FilterFullText", AV74FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_forultutiauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_FORULTUTIAUXDATE");
            GX_FocusControl = edtavDdo_forultutiauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV65DDO_ForUltUtiAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65DDO_ForUltUtiAuxDate", localUtil.format(AV65DDO_ForUltUtiAuxDate, "99/99/99"));
         }
         else
         {
            AV65DDO_ForUltUtiAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_forultutiauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65DDO_ForUltUtiAuxDate", localUtil.format(AV65DDO_ForUltUtiAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV74FilterFullText) != 0 )
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
      e21T42 ();
      if (returnInSub) return;
   }

   public void e21T42( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV78Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcborradoformulas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV78Station = GXt_char1 ;
      GXv_char2[0] = AV72Emprcod ;
      GXv_char3[0] = AV79Emprnom ;
      GXv_char4[0] = AV80Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV78Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcborradoformulas_impl.this.AV72Emprcod = GXv_char2[0] ;
      wcborradoformulas_impl.this.AV79Emprnom = GXv_char3[0] ;
      wcborradoformulas_impl.this.AV80Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72Emprcod", AV72Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      /* Execute user subroutine: 'LOADSAVEDFILTERS' */
      S112 ();
      if (returnInSub) return;
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV22OrderedBy < 1 )
      {
         AV22OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV68DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV68DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e22T42( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV16WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV16WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV34ManageFiltersExecutionStep == 1 )
      {
         AV34ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34ManageFiltersExecutionStep", GXutil.str( AV34ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV34ManageFiltersExecutionStep == 2 )
      {
         AV34ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34ManageFiltersExecutionStep", GXutil.str( AV34ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV31Session.getValue("FormulacionTinte.WCBorradoFormulasColumnsSelector"), "") != 0 )
      {
         AV27ColumnsSelectorXML = AV31Session.getValue("FormulacionTinte.WCBorradoFormulasColumnsSelector") ;
         AV29ColumnsSelector.fromxml(AV27ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtForSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSer_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtForSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSerDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtForColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtForColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNum_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtTipColCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTipColCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtTipColDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTipColDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtForNumCol_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForNumCol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNumCol_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtForUltUti_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForUltUti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForUltUti_Visible), 5, 0), !bGXsfl_45_Refreshing);
      AV70GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70GridCurrentPage), 10, 0));
      AV71GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71GridPageCount), 10, 0));
      AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = AV74FilterFullText ;
      AV82Formulaciontinte_wcborradoformulasds_2_tfclicod = AV36TFCliCod ;
      AV83Formulaciontinte_wcborradoformulasds_3_tfclicod_to = AV37TFCliCod_To ;
      AV84Formulaciontinte_wcborradoformulasds_4_tfclinom = AV39TFCliNom ;
      AV85Formulaciontinte_wcborradoformulasds_5_tfclinom_sel = AV40TFCliNom_Sel ;
      AV86Formulaciontinte_wcborradoformulasds_6_tfforser = AV42TFForSer ;
      AV87Formulaciontinte_wcborradoformulasds_7_tfforser_sel = AV43TFForSer_Sel ;
      AV88Formulaciontinte_wcborradoformulasds_8_tfforserdsc = AV45TFForSerDsc ;
      AV89Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel = AV46TFForSerDsc_Sel ;
      AV90Formulaciontinte_wcborradoformulasds_10_tfforcolnom = AV48TFForColNom ;
      AV91Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel = AV49TFForColNom_Sel ;
      AV92Formulaciontinte_wcborradoformulasds_12_tfforcolnum = AV51TFForColNum ;
      AV93Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to = AV52TFForColNum_To ;
      AV94Formulaciontinte_wcborradoformulasds_14_tftipcolcod = AV54TFTipColCod ;
      AV95Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to = AV55TFTipColCod_To ;
      AV96Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = AV57TFTipColDsc ;
      AV97Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel = AV58TFTipColDsc_Sel ;
      AV98Formulaciontinte_wcborradoformulasds_18_tffornumcol = AV60TFForNumCol ;
      AV99Formulaciontinte_wcborradoformulasds_19_tffornumcol_to = AV61TFForNumCol_To ;
      AV100Formulaciontinte_wcborradoformulasds_20_tfforultuti = AV63TFForUltUti ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29ColumnsSelector", AV29ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV32ManageFiltersData", AV32ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20GridState", AV20GridState);
   }

   public void e14T42( )
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
         AV69PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV69PageToGo) ;
      }
   }

   public void e15T42( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e16T42( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV22OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22OrderedBy), 4, 0));
         AV23OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23OrderedDsc", AV23OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV36TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFCliCod), 6, 0));
            AV37TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV39TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFCliNom", AV39TFCliNom);
            AV40TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFCliNom_Sel", AV40TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForSer") == 0 )
         {
            AV42TFForSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFForSer", AV42TFForSer);
            AV43TFForSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFForSer_Sel", AV43TFForSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForSerDsc") == 0 )
         {
            AV45TFForSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFForSerDsc", AV45TFForSerDsc);
            AV46TFForSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFForSerDsc_Sel", AV46TFForSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForColNom") == 0 )
         {
            AV48TFForColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFForColNom", AV48TFForColNom);
            AV49TFForColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFForColNom_Sel", AV49TFForColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForColNum") == 0 )
         {
            AV51TFForColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFForColNum), 6, 0));
            AV52TFForColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFForColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFForColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipColCod") == 0 )
         {
            AV54TFTipColCod = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFTipColCod), 2, 0));
            AV55TFTipColCod_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFTipColCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipColDsc") == 0 )
         {
            AV57TFTipColDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFTipColDsc", AV57TFTipColDsc);
            AV58TFTipColDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFTipColDsc_Sel", AV58TFTipColDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForNumCol") == 0 )
         {
            AV60TFForNumCol = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFForNumCol), 8, 0));
            AV61TFForNumCol_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFForNumCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFForNumCol_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForUltUti") == 0 )
         {
            AV63TFForUltUti = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFForUltUti", localUtil.format(AV63TFForUltUti, "99/99/99"));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e23T42( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(45) ;
      }
      sendrow_452( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_45_Refreshing )
      {
         httpContext.doAjaxLoad(45, GridRow);
      }
   }

   public void e17T42( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV27ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV29ColumnsSelector.fromJSonString(AV27ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.WCBorradoFormulasColumnsSelector", ((GXutil.strcmp("", AV27ColumnsSelectorXML)==0) ? "" : AV29ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29ColumnsSelector", AV29ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV32ManageFiltersData", AV32ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20GridState", AV20GridState);
   }

   public void e13T42( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S172 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.WCBorradoFormulasFilters")),GXutil.URLEncode(GXutil.rtrim(AV101Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV34ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34ManageFiltersExecutionStep", GXutil.str( AV34ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.WCBorradoFormulasFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV34ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34ManageFiltersExecutionStep", GXutil.str( AV34ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV33ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "FormulacionTinte.WCBorradoFormulasFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         wcborradoformulas_impl.this.GXt_char1 = GXv_char4[0] ;
         AV33ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV33ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV101Pgmname+"GridState", AV33ManageFiltersXml) ;
            AV20GridState.fromxml(AV33ManageFiltersXml, null, null);
            AV22OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22OrderedBy), 4, 0));
            AV23OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23OrderedDsc", AV23OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S182 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20GridState", AV20GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29ColumnsSelector", AV29ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV32ManageFiltersData", AV32ManageFiltersData);
   }

   public void e18T42( )
   {
      /* Dvelop_confirmpanel_borrarformulas_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_borrarformulas_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION BORRARFORMULAS' */
         S192 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29ColumnsSelector", AV29ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV32ManageFiltersData", AV32ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20GridState", AV20GridState);
   }

   public void e19T42( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV25ExcelFilename ;
      GXv_char3[0] = AV26ErrorMessage ;
      new app.formulaciontinte.wcborradoformulasexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      wcborradoformulas_impl.this.AV25ExcelFilename = GXv_char4[0] ;
      wcborradoformulas_impl.this.AV26ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV25ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV25ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV26ErrorMessage);
      }
   }

   public void e20T42( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.formulaciontinte.wcborradoformulasexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV22OrderedBy, 4, 0))+":"+(AV23OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV29ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliCod", "", "Cliente", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliNom", "", "Nombre Cliente", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForSer", "", "Articulo", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForSerDsc", "", "Descripcion", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForColNom", "", "Color", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForColNum", "", "Numero", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TipColCod", "", "Tc", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TipColDsc", "", "Descripcion", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForNumCol", "", "Nº Interno", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForUltUti", "", "Fec Ult Uti", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV28UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.WCBorradoFormulasColumnsSelector", GXv_char4) ;
      wcborradoformulas_impl.this.GXt_char1 = GXv_char4[0] ;
      AV28UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV28UserCustomValue)==0) ) )
      {
         AV30ColumnsSelectorAux.fromxml(AV28UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV30ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV29ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV30ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV29ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV32ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "FormulacionTinte.WCBorradoFormulasFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV32ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV74FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74FilterFullText", AV74FilterFullText);
      AV36TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFCliCod), 6, 0));
      AV37TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFCliCod_To), 6, 0));
      AV39TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFCliNom", AV39TFCliNom);
      AV40TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFCliNom_Sel", AV40TFCliNom_Sel);
      AV42TFForSer = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFForSer", AV42TFForSer);
      AV43TFForSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFForSer_Sel", AV43TFForSer_Sel);
      AV45TFForSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFForSerDsc", AV45TFForSerDsc);
      AV46TFForSerDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFForSerDsc_Sel", AV46TFForSerDsc_Sel);
      AV48TFForColNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFForColNom", AV48TFForColNom);
      AV49TFForColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFForColNom_Sel", AV49TFForColNom_Sel);
      AV51TFForColNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFForColNum), 6, 0));
      AV52TFForColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFForColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFForColNum_To), 6, 0));
      AV54TFTipColCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFTipColCod), 2, 0));
      AV55TFTipColCod_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFTipColCod_To), 2, 0));
      AV57TFTipColDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFTipColDsc", AV57TFTipColDsc);
      AV58TFTipColDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFTipColDsc_Sel", AV58TFTipColDsc_Sel);
      AV60TFForNumCol = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFForNumCol), 8, 0));
      AV61TFForNumCol_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFForNumCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFForNumCol_To), 8, 0));
      AV63TFForUltUti = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFForUltUti", localUtil.format(AV63TFForUltUti, "99/99/99"));
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S192( )
   {
      /* 'DO ACTION BORRARFORMULAS' Routine */
      returnInSub = false ;
      /* Start For Each Line in Grid */
      nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_45_fel_idx = 0 ;
      while ( nGXsfl_45_fel_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_45_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_45_fel_idx+1) ;
         sGXsfl_45_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_452( ) ;
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
         A5742ForSerDsc = httpContext.cgiGet( edtForSerDsc_Internalname) ;
         n5742ForSerDsc = false ;
         A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
         A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A832TipColDsc = httpContext.cgiGet( edtTipColDsc_Internalname) ;
         n832TipColDsc = false ;
         A486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A496ForUltUti = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtForUltUti_Internalname), 0)) ;
         n496ForUltUti = false ;
         GXv_char4[0] = AV72Emprcod ;
         GXv_int12[0] = A252CliCod ;
         GXv_char3[0] = A494ForSer ;
         GXv_char2[0] = A482ForColNom ;
         GXv_int13[0] = A483ForColNum ;
         GXv_int14[0] = A831TipColCod ;
         new app.pbofor2(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_char2, GXv_int13, GXv_int14) ;
         wcborradoformulas_impl.this.AV72Emprcod = GXv_char4[0] ;
         wcborradoformulas_impl.this.A252CliCod = GXv_int12[0] ;
         wcborradoformulas_impl.this.A494ForSer = GXv_char3[0] ;
         wcborradoformulas_impl.this.A482ForColNom = GXv_char2[0] ;
         wcborradoformulas_impl.this.A483ForColNum = GXv_int13[0] ;
         wcborradoformulas_impl.this.A831TipColCod = GXv_int14[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72Emprcod", AV72Emprcod);
         /* End For Each Line */
      }
      if ( nGXsfl_45_fel_idx == 0 )
      {
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
      }
      nGXsfl_45_fel_idx = 1 ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue(AV101Pgmname+"GridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV101Pgmname+"GridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV31Session.getValue(AV101Pgmname+"GridState"), null, null);
      }
      AV22OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22OrderedBy), 4, 0));
      AV23OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23OrderedDsc", AV23OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV20GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV20GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV20GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV103GXV1 = 1 ;
      while ( AV103GXV1 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV103GXV1));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV74FilterFullText = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74FilterFullText", AV74FilterFullText);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV36TFCliCod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFCliCod), 6, 0));
            AV37TFCliCod_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV39TFCliNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFCliNom", AV39TFCliNom);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV40TFCliNom_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFCliNom_Sel", AV40TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV42TFForSer = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFForSer", AV42TFForSer);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV43TFForSer_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFForSer_Sel", AV43TFForSer_Sel);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV45TFForSerDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFForSerDsc", AV45TFForSerDsc);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV46TFForSerDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFForSerDsc_Sel", AV46TFForSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV48TFForColNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFForColNom", AV48TFForColNom);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV49TFForColNom_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFForColNom_Sel", AV49TFForColNom_Sel);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV51TFForColNum = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFForColNum), 6, 0));
            AV52TFForColNum_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFForColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFForColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV54TFTipColCod = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFTipColCod), 2, 0));
            AV55TFTipColCod_To = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFTipColCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV57TFTipColDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFTipColDsc", AV57TFTipColDsc);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV58TFTipColDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFTipColDsc_Sel", AV58TFTipColDsc_Sel);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNUMCOL") == 0 )
         {
            AV60TFForNumCol = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFForNumCol), 8, 0));
            AV61TFForNumCol_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFForNumCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFForNumCol_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORULTUTI") == 0 )
         {
            AV63TFForUltUti = localUtil.ctod( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFForUltUti", localUtil.format(AV63TFForUltUti, "99/99/99"));
         }
         AV103GXV1 = (int)(AV103GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFCliNom_Sel)==0), AV40TFCliNom_Sel, GXv_char4) ;
      wcborradoformulas_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char15 = "" ;
      GXv_char3[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFForSer_Sel)==0), AV43TFForSer_Sel, GXv_char3) ;
      wcborradoformulas_impl.this.GXt_char15 = GXv_char3[0] ;
      GXt_char16 = "" ;
      GXv_char2[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFForSerDsc_Sel)==0), AV46TFForSerDsc_Sel, GXv_char2) ;
      wcborradoformulas_impl.this.GXt_char16 = GXv_char2[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFForColNom_Sel)==0), AV49TFForColNom_Sel, GXv_char18) ;
      wcborradoformulas_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFTipColDsc_Sel)==0), AV58TFTipColDsc_Sel, GXv_char20) ;
      wcborradoformulas_impl.this.GXt_char19 = GXv_char20[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char15+"|"+GXt_char16+"|"+GXt_char17+"|||"+GXt_char19+"||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFCliNom)==0), AV39TFCliNom, GXv_char20) ;
      wcborradoformulas_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFForSer)==0), AV42TFForSer, GXv_char18) ;
      wcborradoformulas_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char16 = "" ;
      GXv_char4[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFForSerDsc)==0), AV45TFForSerDsc, GXv_char4) ;
      wcborradoformulas_impl.this.GXt_char16 = GXv_char4[0] ;
      GXt_char15 = "" ;
      GXv_char3[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFForColNom)==0), AV48TFForColNom, GXv_char3) ;
      wcborradoformulas_impl.this.GXt_char15 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFTipColDsc)==0), AV57TFTipColDsc, GXv_char2) ;
      wcborradoformulas_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV36TFCliCod) ? "" : GXutil.str( AV36TFCliCod, 6, 0))+"|"+GXt_char19+"|"+GXt_char17+"|"+GXt_char16+"|"+GXt_char15+"|"+((0==AV51TFForColNum) ? "" : GXutil.str( AV51TFForColNum, 6, 0))+"|"+((0==AV54TFTipColCod) ? "" : GXutil.str( AV54TFTipColCod, 2, 0))+"|"+GXt_char1+"|"+((0==AV60TFForNumCol) ? "" : GXutil.str( AV60TFForNumCol, 8, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV63TFForUltUti)) ? "" : localUtil.dtoc( AV63TFForUltUti, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV37TFCliCod_To) ? "" : GXutil.str( AV37TFCliCod_To, 6, 0))+"|||||"+((0==AV52TFForColNum_To) ? "" : GXutil.str( AV52TFForColNum_To, 6, 0))+"|"+((0==AV55TFTipColCod_To) ? "" : GXutil.str( AV55TFTipColCod_To, 2, 0))+"||"+((0==AV61TFForNumCol_To) ? "" : GXutil.str( AV61TFForNumCol_To, 8, 0))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV20GridState.fromxml(AV31Session.getValue(AV101Pgmname+"GridState"), null, null);
      AV20GridState.setgxTv_SdtWWPGridState_Orderedby( AV22OrderedBy );
      AV20GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV23OrderedDsc );
      AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState21[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV74FilterFullText)==0), (short)(0), AV74FilterFullText, "") ;
      AV20GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFCLICOD", "", !((0==AV36TFCliCod)&&(0==AV37TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV37TFCliCod_To, 6, 0))) ;
      AV20GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFCLINOM", "", !(GXutil.strcmp("", AV39TFCliNom)==0), (short)(0), AV39TFCliNom, "", !(GXutil.strcmp("", AV40TFCliNom_Sel)==0), AV40TFCliNom_Sel, "") ;
      AV20GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFFORSER", "", !(GXutil.strcmp("", AV42TFForSer)==0), (short)(0), AV42TFForSer, "", !(GXutil.strcmp("", AV43TFForSer_Sel)==0), AV43TFForSer_Sel, "") ;
      AV20GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFFORSERDSC", "", !(GXutil.strcmp("", AV45TFForSerDsc)==0), (short)(0), AV45TFForSerDsc, "", !(GXutil.strcmp("", AV46TFForSerDsc_Sel)==0), AV46TFForSerDsc_Sel, "") ;
      AV20GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFFORCOLNOM", "", !(GXutil.strcmp("", AV48TFForColNom)==0), (short)(0), AV48TFForColNom, "", !(GXutil.strcmp("", AV49TFForColNom_Sel)==0), AV49TFForColNom_Sel, "") ;
      AV20GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFFORCOLNUM", "", !((0==AV51TFForColNum)&&(0==AV52TFForColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV51TFForColNum, 6, 0)), GXutil.trim( GXutil.str( AV52TFForColNum_To, 6, 0))) ;
      AV20GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFTIPCOLCOD", "", !((0==AV54TFTipColCod)&&(0==AV55TFTipColCod_To)), (short)(0), GXutil.trim( GXutil.str( AV54TFTipColCod, 2, 0)), GXutil.trim( GXutil.str( AV55TFTipColCod_To, 2, 0))) ;
      AV20GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFTIPCOLDSC", "", !(GXutil.strcmp("", AV57TFTipColDsc)==0), (short)(0), AV57TFTipColDsc, "", !(GXutil.strcmp("", AV58TFTipColDsc_Sel)==0), AV58TFTipColDsc_Sel, "") ;
      AV20GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFFORNUMCOL", "", !((0==AV60TFForNumCol)&&(0==AV61TFForNumCol_To)), (short)(0), GXutil.trim( GXutil.str( AV60TFForNumCol, 8, 0)), GXutil.trim( GXutil.str( AV61TFForNumCol_To, 8, 0))) ;
      AV20GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFFORULTUTI", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV63TFForUltUti)), (short)(0), GXutil.trim( localUtil.dtoc( AV63TFForUltUti, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV20GridState = GXv_SdtWWPGridState21[0] ;
      if ( ! (GXutil.strcmp("", AV72Emprcod)==0) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV72Emprcod );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      if ( ! (0==AV5CliCod) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV5CliCod, 6, 0) );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      if ( ! (0==AV6CliCod_to) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD_TO" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV6CliCod_to, 6, 0) );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV11ForSer)==0) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORSER" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV11ForSer );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV12ForSer_to)==0) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORSER_TO" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV12ForSer_to );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV7ForColNom)==0) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNOM" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV7ForColNom );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV8ForColNom_to)==0) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNOM_TO" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV8ForColNom_to );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      if ( ! (0==AV9ForColNum) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNUM" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV9ForColNum, 6, 0) );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      if ( ! (0==AV10ForColNum_to) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNUM_TO" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV10ForColNum_to, 6, 0) );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      if ( ! (0==AV13TipColCod) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPCOLCOD" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV13TipColCod, 2, 0) );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      if ( ! (0==AV14TipColCod_to) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPCOLCOD_TO" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV14TipColCod_to, 2, 0) );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73ForUltUti)) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORULTUTI" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV73ForUltUti, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      AV20GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV20GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV101Pgmname+"GridState", AV20GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV18TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV18TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV101Pgmname );
      AV18TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV18TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV17HTTPRequest.getScriptName()+"?"+AV17HTTPRequest.getQuerystring() );
      AV18TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TMFormulas" );
      AV31Session.setValue("TrnContext", AV18TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table2_65_T42( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_borrarformulas_Internalname, tblTabledvelop_confirmpanel_borrarformulas_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_borrarformulas.setProperty("Title", Dvelop_confirmpanel_borrarformulas_Title);
         ucDvelop_confirmpanel_borrarformulas.setProperty("ConfirmationText", Dvelop_confirmpanel_borrarformulas_Confirmationtext);
         ucDvelop_confirmpanel_borrarformulas.setProperty("YesButtonCaption", Dvelop_confirmpanel_borrarformulas_Yesbuttoncaption);
         ucDvelop_confirmpanel_borrarformulas.setProperty("NoButtonCaption", Dvelop_confirmpanel_borrarformulas_Nobuttoncaption);
         ucDvelop_confirmpanel_borrarformulas.setProperty("CancelButtonCaption", Dvelop_confirmpanel_borrarformulas_Cancelbuttoncaption);
         ucDvelop_confirmpanel_borrarformulas.setProperty("YesButtonPosition", Dvelop_confirmpanel_borrarformulas_Yesbuttonposition);
         ucDvelop_confirmpanel_borrarformulas.setProperty("ConfirmType", Dvelop_confirmpanel_borrarformulas_Confirmtype);
         ucDvelop_confirmpanel_borrarformulas.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_borrarformulas_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_BORRARFORMULASContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_BORRARFORMULASContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_65_T42e( true) ;
      }
      else
      {
         wb_table2_65_T42e( false) ;
      }
   }

   public void wb_table1_27_T42( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* User Defined Control */
         ucDdo_managefilters.setProperty("IconType", Ddo_managefilters_Icontype);
         ucDdo_managefilters.setProperty("Icon", Ddo_managefilters_Icon);
         ucDdo_managefilters.setProperty("Caption", Ddo_managefilters_Caption);
         ucDdo_managefilters.setProperty("Tooltip", Ddo_managefilters_Tooltip);
         ucDdo_managefilters.setProperty("Cls", Ddo_managefilters_Cls);
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV32ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_32_T42( true) ;
      }
      else
      {
         wb_table3_32_T42( false) ;
      }
      return  ;
   }

   public void wb_table3_32_T42e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_T42e( true) ;
      }
      else
      {
         wb_table1_27_T42e( false) ;
      }
   }

   public void wb_table3_32_T42( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablefilters_Internalname, tblTablefilters_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Filter Full Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'" + sPrefix + "',false,'" + sGXsfl_45_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV74FilterFullText, GXutil.rtrim( localUtil.format( AV74FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_FormulacionTinte\\WCBorradoFormulas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_32_T42e( true) ;
      }
      else
      {
         wb_table3_32_T42e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV72Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72Emprcod", AV72Emprcod);
      AV5CliCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5CliCod), 6, 0));
      AV6CliCod_to = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCod_to), 6, 0));
      AV11ForSer = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11ForSer", AV11ForSer);
      AV12ForSer_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12ForSer_to", AV12ForSer_to);
      AV7ForColNom = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7ForColNom", AV7ForColNom);
      AV8ForColNom_to = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8ForColNom_to", AV8ForColNom_to);
      AV9ForColNum = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9ForColNum), 6, 0));
      AV10ForColNum_to = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10ForColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10ForColNum_to), 6, 0));
      AV13TipColCod = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13TipColCod), 2, 0));
      AV14TipColCod_to = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14TipColCod_to), 2, 0));
      AV73ForUltUti = (java.util.Date)getParm(obj,11,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73ForUltUti", localUtil.format(AV73ForUltUti, "99/99/99"));
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
      paT42( ) ;
      wsT42( ) ;
      weT42( ) ;
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
      sCtrlAV72Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV5CliCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV6CliCod_to = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV11ForSer = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV12ForSer_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV7ForColNom = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV8ForColNom_to = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV9ForColNum = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV10ForColNum_to = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV13TipColCod = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV14TipColCod_to = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV73ForUltUti = (String)getParm(obj,11,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paT42( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "formulaciontinte\\wcborradoformulas", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paT42( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV72Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72Emprcod", AV72Emprcod);
         AV5CliCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5CliCod), 6, 0));
         AV6CliCod_to = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCod_to), 6, 0));
         AV11ForSer = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11ForSer", AV11ForSer);
         AV12ForSer_to = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12ForSer_to", AV12ForSer_to);
         AV7ForColNom = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7ForColNom", AV7ForColNom);
         AV8ForColNom_to = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8ForColNom_to", AV8ForColNom_to);
         AV9ForColNum = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9ForColNum), 6, 0));
         AV10ForColNum_to = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10ForColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10ForColNum_to), 6, 0));
         AV13TipColCod = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13TipColCod), 2, 0));
         AV14TipColCod_to = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14TipColCod_to), 2, 0));
         AV73ForUltUti = (java.util.Date)getParm(obj,13,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73ForUltUti", localUtil.format(AV73ForUltUti, "99/99/99"));
      }
      wcpOAV72Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV72Emprcod") ;
      wcpOAV5CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV5CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV6CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6CliCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV11ForSer = httpContext.cgiGet( sPrefix+"wcpOAV11ForSer") ;
      wcpOAV12ForSer_to = httpContext.cgiGet( sPrefix+"wcpOAV12ForSer_to") ;
      wcpOAV7ForColNom = httpContext.cgiGet( sPrefix+"wcpOAV7ForColNom") ;
      wcpOAV8ForColNom_to = httpContext.cgiGet( sPrefix+"wcpOAV8ForColNom_to") ;
      wcpOAV9ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV10ForColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10ForColNum_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV13TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV13TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV14TipColCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV14TipColCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV73ForUltUti = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV73ForUltUti"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV72Emprcod, wcpOAV72Emprcod) != 0 ) || ( AV5CliCod != wcpOAV5CliCod ) || ( AV6CliCod_to != wcpOAV6CliCod_to ) || ( GXutil.strcmp(AV11ForSer, wcpOAV11ForSer) != 0 ) || ( GXutil.strcmp(AV12ForSer_to, wcpOAV12ForSer_to) != 0 ) || ( GXutil.strcmp(AV7ForColNom, wcpOAV7ForColNom) != 0 ) || ( GXutil.strcmp(AV8ForColNom_to, wcpOAV8ForColNom_to) != 0 ) || ( AV9ForColNum != wcpOAV9ForColNum ) || ( AV10ForColNum_to != wcpOAV10ForColNum_to ) || ( AV13TipColCod != wcpOAV13TipColCod ) || ( AV14TipColCod_to != wcpOAV14TipColCod_to ) || !( GXutil.dateCompare(GXutil.resetTime(AV73ForUltUti), GXutil.resetTime(wcpOAV73ForUltUti)) ) ) )
      {
         setjustcreated();
      }
      wcpOAV72Emprcod = AV72Emprcod ;
      wcpOAV5CliCod = AV5CliCod ;
      wcpOAV6CliCod_to = AV6CliCod_to ;
      wcpOAV11ForSer = AV11ForSer ;
      wcpOAV12ForSer_to = AV12ForSer_to ;
      wcpOAV7ForColNom = AV7ForColNom ;
      wcpOAV8ForColNom_to = AV8ForColNom_to ;
      wcpOAV9ForColNum = AV9ForColNum ;
      wcpOAV10ForColNum_to = AV10ForColNum_to ;
      wcpOAV13TipColCod = AV13TipColCod ;
      wcpOAV14TipColCod_to = AV14TipColCod_to ;
      wcpOAV73ForUltUti = AV73ForUltUti ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV72Emprcod = httpContext.cgiGet( sPrefix+"AV72Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV72Emprcod) > 0 )
      {
         AV72Emprcod = httpContext.cgiGet( sCtrlAV72Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72Emprcod", AV72Emprcod);
      }
      else
      {
         AV72Emprcod = httpContext.cgiGet( sPrefix+"AV72Emprcod_PARM") ;
      }
      sCtrlAV5CliCod = httpContext.cgiGet( sPrefix+"AV5CliCod_CTRL") ;
      if ( GXutil.len( sCtrlAV5CliCod) > 0 )
      {
         AV5CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV5CliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5CliCod), 6, 0));
      }
      else
      {
         AV5CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV5CliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV6CliCod_to = httpContext.cgiGet( sPrefix+"AV6CliCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV6CliCod_to) > 0 )
      {
         AV6CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV6CliCod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCod_to), 6, 0));
      }
      else
      {
         AV6CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV6CliCod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV11ForSer = httpContext.cgiGet( sPrefix+"AV11ForSer_CTRL") ;
      if ( GXutil.len( sCtrlAV11ForSer) > 0 )
      {
         AV11ForSer = httpContext.cgiGet( sCtrlAV11ForSer) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11ForSer", AV11ForSer);
      }
      else
      {
         AV11ForSer = httpContext.cgiGet( sPrefix+"AV11ForSer_PARM") ;
      }
      sCtrlAV12ForSer_to = httpContext.cgiGet( sPrefix+"AV12ForSer_to_CTRL") ;
      if ( GXutil.len( sCtrlAV12ForSer_to) > 0 )
      {
         AV12ForSer_to = httpContext.cgiGet( sCtrlAV12ForSer_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12ForSer_to", AV12ForSer_to);
      }
      else
      {
         AV12ForSer_to = httpContext.cgiGet( sPrefix+"AV12ForSer_to_PARM") ;
      }
      sCtrlAV7ForColNom = httpContext.cgiGet( sPrefix+"AV7ForColNom_CTRL") ;
      if ( GXutil.len( sCtrlAV7ForColNom) > 0 )
      {
         AV7ForColNom = httpContext.cgiGet( sCtrlAV7ForColNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7ForColNom", AV7ForColNom);
      }
      else
      {
         AV7ForColNom = httpContext.cgiGet( sPrefix+"AV7ForColNom_PARM") ;
      }
      sCtrlAV8ForColNom_to = httpContext.cgiGet( sPrefix+"AV8ForColNom_to_CTRL") ;
      if ( GXutil.len( sCtrlAV8ForColNom_to) > 0 )
      {
         AV8ForColNom_to = httpContext.cgiGet( sCtrlAV8ForColNom_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8ForColNom_to", AV8ForColNom_to);
      }
      else
      {
         AV8ForColNom_to = httpContext.cgiGet( sPrefix+"AV8ForColNom_to_PARM") ;
      }
      sCtrlAV9ForColNum = httpContext.cgiGet( sPrefix+"AV9ForColNum_CTRL") ;
      if ( GXutil.len( sCtrlAV9ForColNum) > 0 )
      {
         AV9ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV9ForColNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9ForColNum), 6, 0));
      }
      else
      {
         AV9ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV9ForColNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV10ForColNum_to = httpContext.cgiGet( sPrefix+"AV10ForColNum_to_CTRL") ;
      if ( GXutil.len( sCtrlAV10ForColNum_to) > 0 )
      {
         AV10ForColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV10ForColNum_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10ForColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10ForColNum_to), 6, 0));
      }
      else
      {
         AV10ForColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV10ForColNum_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV13TipColCod = httpContext.cgiGet( sPrefix+"AV13TipColCod_CTRL") ;
      if ( GXutil.len( sCtrlAV13TipColCod) > 0 )
      {
         AV13TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV13TipColCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13TipColCod), 2, 0));
      }
      else
      {
         AV13TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV13TipColCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV14TipColCod_to = httpContext.cgiGet( sPrefix+"AV14TipColCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV14TipColCod_to) > 0 )
      {
         AV14TipColCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV14TipColCod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14TipColCod_to), 2, 0));
      }
      else
      {
         AV14TipColCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV14TipColCod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV73ForUltUti = httpContext.cgiGet( sPrefix+"AV73ForUltUti_CTRL") ;
      if ( GXutil.len( sCtrlAV73ForUltUti) > 0 )
      {
         AV73ForUltUti = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV73ForUltUti), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73ForUltUti", localUtil.format(AV73ForUltUti, "99/99/99"));
      }
      else
      {
         AV73ForUltUti = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV73ForUltUti_PARM"), 0) ;
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
      paT42( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsT42( ) ;
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
      wsT42( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV72Emprcod_PARM", GXutil.rtrim( AV72Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV72Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV72Emprcod_CTRL", GXutil.rtrim( sCtrlAV72Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5CliCod_PARM", GXutil.ltrim( localUtil.ntoc( AV5CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5CliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5CliCod_CTRL", GXutil.rtrim( sCtrlAV5CliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6CliCod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV6CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6CliCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6CliCod_to_CTRL", GXutil.rtrim( sCtrlAV6CliCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11ForSer_PARM", GXutil.rtrim( AV11ForSer));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11ForSer)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11ForSer_CTRL", GXutil.rtrim( sCtrlAV11ForSer));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12ForSer_to_PARM", GXutil.rtrim( AV12ForSer_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12ForSer_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12ForSer_to_CTRL", GXutil.rtrim( sCtrlAV12ForSer_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7ForColNom_PARM", GXutil.rtrim( AV7ForColNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7ForColNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7ForColNom_CTRL", GXutil.rtrim( sCtrlAV7ForColNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8ForColNom_to_PARM", GXutil.rtrim( AV8ForColNom_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8ForColNom_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8ForColNom_to_CTRL", GXutil.rtrim( sCtrlAV8ForColNom_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9ForColNum_PARM", GXutil.ltrim( localUtil.ntoc( AV9ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9ForColNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9ForColNum_CTRL", GXutil.rtrim( sCtrlAV9ForColNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10ForColNum_to_PARM", GXutil.ltrim( localUtil.ntoc( AV10ForColNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10ForColNum_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10ForColNum_to_CTRL", GXutil.rtrim( sCtrlAV10ForColNum_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13TipColCod_PARM", GXutil.ltrim( localUtil.ntoc( AV13TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13TipColCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13TipColCod_CTRL", GXutil.rtrim( sCtrlAV13TipColCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14TipColCod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV14TipColCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV14TipColCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14TipColCod_to_CTRL", GXutil.rtrim( sCtrlAV14TipColCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV73ForUltUti_PARM", localUtil.dtoc( AV73ForUltUti, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV73ForUltUti)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV73ForUltUti_CTRL", GXutil.rtrim( sCtrlAV73ForUltUti));
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
      weT42( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211665328", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/wcborradoformulas.js", "?20268211665329", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_452( )
   {
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_45_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_45_idx ;
      edtForSer_Internalname = sPrefix+"FORSER_"+sGXsfl_45_idx ;
      edtForSerDsc_Internalname = sPrefix+"FORSERDSC_"+sGXsfl_45_idx ;
      edtForColNom_Internalname = sPrefix+"FORCOLNOM_"+sGXsfl_45_idx ;
      edtForColNum_Internalname = sPrefix+"FORCOLNUM_"+sGXsfl_45_idx ;
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD_"+sGXsfl_45_idx ;
      edtTipColDsc_Internalname = sPrefix+"TIPCOLDSC_"+sGXsfl_45_idx ;
      edtForNumCol_Internalname = sPrefix+"FORNUMCOL_"+sGXsfl_45_idx ;
      edtForUltUti_Internalname = sPrefix+"FORULTUTI_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_452( )
   {
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_45_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_45_fel_idx ;
      edtForSer_Internalname = sPrefix+"FORSER_"+sGXsfl_45_fel_idx ;
      edtForSerDsc_Internalname = sPrefix+"FORSERDSC_"+sGXsfl_45_fel_idx ;
      edtForColNom_Internalname = sPrefix+"FORCOLNOM_"+sGXsfl_45_fel_idx ;
      edtForColNum_Internalname = sPrefix+"FORCOLNUM_"+sGXsfl_45_fel_idx ;
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD_"+sGXsfl_45_fel_idx ;
      edtTipColDsc_Internalname = sPrefix+"TIPCOLDSC_"+sGXsfl_45_fel_idx ;
      edtForNumCol_Internalname = sPrefix+"FORNUMCOL_"+sGXsfl_45_fel_idx ;
      edtForUltUti_Internalname = sPrefix+"FORULTUTI_"+sGXsfl_45_fel_idx ;
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wbT40( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_45_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_45_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_45_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForSer_Internalname,GXutil.rtrim( A494ForSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForSerDsc_Internalname,GXutil.rtrim( A5742ForSerDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtForSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForColNom_Internalname,GXutil.rtrim( A482ForColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtForColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtTipColCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColCod_Internalname,GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTipColCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipColCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTipColDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColDsc_Internalname,GXutil.rtrim( A832TipColDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTipColDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipColDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtForNumCol_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForNumCol_Internalname,GXutil.ltrim( localUtil.ntoc( A486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForNumCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForNumCol_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtForUltUti_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForUltUti_Internalname,localUtil.format(A496ForUltUti, "99/99/99"),localUtil.format( A496ForUltUti, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForUltUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForUltUti_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesT42( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_45_idx = ((subGrid_Islastpage==1)&&(nGXsfl_45_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
      }
      /* End function sendrow_452 */
   }

   public void startgridcontrol45( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"45\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForSerDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipColCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipColDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForNumCol_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Interno", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForUltUti_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fec Ult Uti", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A494ForSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5742ForSerDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForSerDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A482ForColNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipColCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A832TipColDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipColDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A486ForNumCol, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForNumCol_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A496ForUltUti, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForUltUti_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnexportreport_Internalname = sPrefix+"BTNEXPORTREPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      bttBtnborrarformulas_Internalname = sPrefix+"BTNBORRARFORMULAS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtForSer_Internalname = sPrefix+"FORSER" ;
      edtForSerDsc_Internalname = sPrefix+"FORSERDSC" ;
      edtForColNom_Internalname = sPrefix+"FORCOLNOM" ;
      edtForColNum_Internalname = sPrefix+"FORCOLNUM" ;
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD" ;
      edtTipColDsc_Internalname = sPrefix+"TIPCOLDSC" ;
      edtForNumCol_Internalname = sPrefix+"FORNUMCOL" ;
      edtForUltUti_Internalname = sPrefix+"FORULTUTI" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Innewwindow1_Internalname = sPrefix+"INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_borrarformulas_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_BORRARFORMULAS" ;
      tblTabledvelop_confirmpanel_borrarformulas_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_BORRARFORMULAS" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_forultutiauxdate_Internalname = sPrefix+"vDDO_FORULTUTIAUXDATE" ;
      divDdo_forultutiauxdates_Internalname = sPrefix+"DDO_FORULTUTIAUXDATES" ;
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
      edtForUltUti_Jsonclick = "" ;
      edtForNumCol_Jsonclick = "" ;
      edtTipColDsc_Jsonclick = "" ;
      edtTipColCod_Jsonclick = "" ;
      edtForColNum_Jsonclick = "" ;
      edtForColNom_Jsonclick = "" ;
      edtForSerDsc_Jsonclick = "" ;
      edtForSer_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtForUltUti_Visible = -1 ;
      edtForNumCol_Visible = -1 ;
      edtTipColDsc_Visible = -1 ;
      edtTipColCod_Visible = -1 ;
      edtForColNum_Visible = -1 ;
      edtForColNom_Visible = -1 ;
      edtForSerDsc_Visible = -1 ;
      edtForSer_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_forultutiauxdate_Jsonclick = "" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_borrarformulas_Confirmtype = "1" ;
      Dvelop_confirmpanel_borrarformulas_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_borrarformulas_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_borrarformulas_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_borrarformulas_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_borrarformulas_Confirmationtext = "¿Desea Borrar TODAS las Formulas?" ;
      Dvelop_confirmpanel_borrarformulas_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "FormulacionTinte.WCBorradoFormulasGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic|Dynamic|||Dynamic||" ;
      Ddo_grid_Includedatalist = "|T|T|T|T|||T||" ;
      Ddo_grid_Filterisrange = "T|||||T|T||T|" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character|Character|Numeric|Numeric|Character|Numeric|Date" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8|9|10" ;
      Ddo_grid_Columnids = "0:CliCod|1:CliNom|2:ForSer|3:ForSerDsc|4:ForColNom|5:ForColNum|6:TipColCod|7:TipColDsc|8:ForNumCol|9:ForUltUti" ;
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
      Dvpanel_tableheader_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Iconposition = "Right" ;
      Dvpanel_tableheader_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Title = httpContext.getMessage( "WWP_FilterOptions", "") ;
      Dvpanel_tableheader_Cls = "PanelNoHeader" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      Ddo_managefilters_Cls = "ManageFilters" ;
      Ddo_managefilters_Tooltip = "WWP_ManageFiltersTooltip" ;
      Ddo_managefilters_Icon = "fas fa-filter" ;
      Ddo_managefilters_Icontype = "FontIcon" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV29ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV74FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV6CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV11ForSer',fld:'vFORSER',pic:''},{av:'AV12ForSer_to',fld:'vFORSER_TO',pic:''},{av:'AV7ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV8ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV9ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV10ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV13TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV14TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV73ForUltUti',fld:'vFORULTUTI',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFForSer',fld:'vTFFORSER',pic:''},{av:'AV43TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV45TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV46TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV48TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV49TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV51TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV52TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV54TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV55TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV57TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV58TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV60TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV61TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV63TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV101Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV22OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV29ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForSerDsc_Visible',ctrl:'FORSERDSC',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtTipColDsc_Visible',ctrl:'TIPCOLDSC',prop:'Visible'},{av:'edtForNumCol_Visible',ctrl:'FORNUMCOL',prop:'Visible'},{av:'edtForUltUti_Visible',ctrl:'FORULTUTI',prop:'Visible'},{av:'AV70GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV71GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV32ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV20GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e14T42',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV74FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV6CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV11ForSer',fld:'vFORSER',pic:''},{av:'AV12ForSer_to',fld:'vFORSER_TO',pic:''},{av:'AV7ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV8ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV9ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV10ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV13TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV14TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV73ForUltUti',fld:'vFORULTUTI',pic:''},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV29ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFForSer',fld:'vTFFORSER',pic:''},{av:'AV43TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV45TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV46TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV48TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV49TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV51TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV52TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV54TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV55TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV57TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV58TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV60TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV61TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV63TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV101Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV22OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e15T42',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV74FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV6CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV11ForSer',fld:'vFORSER',pic:''},{av:'AV12ForSer_to',fld:'vFORSER_TO',pic:''},{av:'AV7ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV8ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV9ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV10ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV13TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV14TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV73ForUltUti',fld:'vFORULTUTI',pic:''},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV29ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFForSer',fld:'vTFFORSER',pic:''},{av:'AV43TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV45TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV46TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV48TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV49TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV51TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV52TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV54TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV55TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV57TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV58TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV60TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV61TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV63TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV101Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV22OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e16T42',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV74FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV6CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV11ForSer',fld:'vFORSER',pic:''},{av:'AV12ForSer_to',fld:'vFORSER_TO',pic:''},{av:'AV7ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV8ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV9ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV10ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV13TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV14TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV73ForUltUti',fld:'vFORULTUTI',pic:''},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV29ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFForSer',fld:'vTFFORSER',pic:''},{av:'AV43TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV45TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV46TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV48TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV49TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV51TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV52TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV54TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV55TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV57TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV58TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV60TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV61TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV63TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV101Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV22OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV22OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV60TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV61TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV57TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV58TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV54TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV55TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV51TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV52TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV48TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV49TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV45TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV46TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV42TFForSer',fld:'vTFFORSER',pic:''},{av:'AV43TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e23T42',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e17T42',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV74FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV6CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV11ForSer',fld:'vFORSER',pic:''},{av:'AV12ForSer_to',fld:'vFORSER_TO',pic:''},{av:'AV7ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV8ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV9ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV10ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV13TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV14TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV73ForUltUti',fld:'vFORULTUTI',pic:''},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV29ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFForSer',fld:'vTFFORSER',pic:''},{av:'AV43TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV45TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV46TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV48TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV49TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV51TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV52TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV54TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV55TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV57TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV58TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV60TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV61TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV63TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV101Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV22OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV29ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForSerDsc_Visible',ctrl:'FORSERDSC',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtTipColDsc_Visible',ctrl:'TIPCOLDSC',prop:'Visible'},{av:'edtForNumCol_Visible',ctrl:'FORNUMCOL',prop:'Visible'},{av:'edtForUltUti_Visible',ctrl:'FORULTUTI',prop:'Visible'},{av:'AV70GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV71GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV32ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV20GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e13T42',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV74FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV6CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV11ForSer',fld:'vFORSER',pic:''},{av:'AV12ForSer_to',fld:'vFORSER_TO',pic:''},{av:'AV7ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV8ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV9ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV10ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV13TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV14TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV73ForUltUti',fld:'vFORULTUTI',pic:''},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV29ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFForSer',fld:'vTFFORSER',pic:''},{av:'AV43TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV45TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV46TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV48TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV49TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV51TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV52TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV54TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV55TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV57TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV58TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV60TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV61TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV63TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV101Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV22OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV20GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20GridState',fld:'vGRIDSTATE',pic:''},{av:'AV22OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV74FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFForSer',fld:'vTFFORSER',pic:''},{av:'AV43TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV45TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV46TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV48TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV49TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV51TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV52TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV54TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV55TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV57TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV58TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV60TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV61TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV63TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV29ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForSerDsc_Visible',ctrl:'FORSERDSC',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtTipColDsc_Visible',ctrl:'TIPCOLDSC',prop:'Visible'},{av:'edtForNumCol_Visible',ctrl:'FORNUMCOL',prop:'Visible'},{av:'edtForUltUti_Visible',ctrl:'FORULTUTI',prop:'Visible'},{av:'AV70GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV71GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV32ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOBORRARFORMULAS'","{handler:'e12T41',iparms:[]");
      setEventMetadata("'DOBORRARFORMULAS'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BORRARFORMULAS.CLOSE","{handler:'e18T42',iparms:[{av:'Dvelop_confirmpanel_borrarformulas_Result',ctrl:'DVELOP_CONFIRMPANEL_BORRARFORMULAS',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV74FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV6CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV11ForSer',fld:'vFORSER',pic:''},{av:'AV12ForSer_to',fld:'vFORSER_TO',pic:''},{av:'AV7ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV8ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV9ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV10ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV13TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV14TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV73ForUltUti',fld:'vFORULTUTI',pic:''},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV29ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFForSer',fld:'vTFFORSER',pic:''},{av:'AV43TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV45TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV46TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV48TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV49TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV51TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV52TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV54TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV55TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV57TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV58TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV60TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV61TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV63TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV101Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV22OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'A252CliCod',fld:'CLICOD',grid:45,pic:'ZZZZZ9'},{av:'nRC_GXsfl_45',ctrl:'GRID',grid:45,prop:'GridRC',grid:45},{av:'A494ForSer',fld:'FORSER',grid:45,pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',grid:45,pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',grid:45,pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',grid:45,pic:'Z9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BORRARFORMULAS.CLOSE",",oparms:[{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV29ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForSerDsc_Visible',ctrl:'FORSERDSC',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtTipColDsc_Visible',ctrl:'TIPCOLDSC',prop:'Visible'},{av:'edtForNumCol_Visible',ctrl:'FORNUMCOL',prop:'Visible'},{av:'edtForUltUti_Visible',ctrl:'FORULTUTI',prop:'Visible'},{av:'AV70GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV71GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV32ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV20GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e19T42',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e11T41',iparms:[]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e20T42',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Forultuti',iparms:[]");
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
      wcpOAV72Emprcod = "" ;
      wcpOAV11ForSer = "" ;
      wcpOAV12ForSer_to = "" ;
      wcpOAV7ForColNom = "" ;
      wcpOAV8ForColNom_to = "" ;
      wcpOAV73ForUltUti = GXutil.nullDate() ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_borrarformulas_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV72Emprcod = "" ;
      AV11ForSer = "" ;
      AV12ForSer_to = "" ;
      AV7ForColNom = "" ;
      AV8ForColNom_to = "" ;
      AV73ForUltUti = GXutil.nullDate() ;
      AV74FilterFullText = "" ;
      AV29ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV39TFCliNom = "" ;
      AV40TFCliNom_Sel = "" ;
      AV42TFForSer = "" ;
      AV43TFForSer_Sel = "" ;
      AV45TFForSerDsc = "" ;
      AV46TFForSerDsc_Sel = "" ;
      AV48TFForColNom = "" ;
      AV49TFForColNom_Sel = "" ;
      AV57TFTipColDsc = "" ;
      AV58TFTipColDsc_Sel = "" ;
      AV63TFForUltUti = GXutil.nullDate() ;
      AV101Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV32ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV68DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      bttBtnborrarformulas_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV65DDO_ForUltUtiAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A279CliNom = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      A832TipColDsc = "" ;
      A496ForUltUti = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = "" ;
      lV84Formulaciontinte_wcborradoformulasds_4_tfclinom = "" ;
      lV86Formulaciontinte_wcborradoformulasds_6_tfforser = "" ;
      lV88Formulaciontinte_wcborradoformulasds_8_tfforserdsc = "" ;
      lV90Formulaciontinte_wcborradoformulasds_10_tfforcolnom = "" ;
      lV96Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = "" ;
      AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext = "" ;
      AV85Formulaciontinte_wcborradoformulasds_5_tfclinom_sel = "" ;
      AV84Formulaciontinte_wcborradoformulasds_4_tfclinom = "" ;
      AV87Formulaciontinte_wcborradoformulasds_7_tfforser_sel = "" ;
      AV86Formulaciontinte_wcborradoformulasds_6_tfforser = "" ;
      AV89Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel = "" ;
      AV88Formulaciontinte_wcborradoformulasds_8_tfforserdsc = "" ;
      AV91Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel = "" ;
      AV90Formulaciontinte_wcborradoformulasds_10_tfforcolnom = "" ;
      AV97Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel = "" ;
      AV96Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = "" ;
      AV100Formulaciontinte_wcborradoformulasds_20_tfforultuti = GXutil.nullDate() ;
      A396EmprCod = "" ;
      H00T42_A396EmprCod = new String[] {""} ;
      H00T42_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      H00T42_n496ForUltUti = new boolean[] {false} ;
      H00T42_A486ForNumCol = new int[1] ;
      H00T42_A832TipColDsc = new String[] {""} ;
      H00T42_n832TipColDsc = new boolean[] {false} ;
      H00T42_A831TipColCod = new byte[1] ;
      H00T42_A483ForColNum = new int[1] ;
      H00T42_A482ForColNom = new String[] {""} ;
      H00T42_A5742ForSerDsc = new String[] {""} ;
      H00T42_n5742ForSerDsc = new boolean[] {false} ;
      H00T42_A494ForSer = new String[] {""} ;
      H00T42_A279CliNom = new String[] {""} ;
      H00T42_A252CliCod = new int[1] ;
      H00T43_AGRID_nRecordCount = new long[1] ;
      AV78Station = "" ;
      AV79Emprnom = "" ;
      AV80Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV16WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31Session = httpContext.getWebSession();
      AV27ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV33ManageFiltersXml = "" ;
      AV25ExcelFilename = "" ;
      AV26ErrorMessage = "" ;
      AV28UserCustomValue = "" ;
      AV30ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      GXv_int12 = new int[1] ;
      GXv_int13 = new int[1] ;
      GXv_int14 = new byte[1] ;
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char19 = "" ;
      GXv_char20 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char18 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState21 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV18TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV17HTTPRequest = httpContext.getHttpRequest();
      ucDvelop_confirmpanel_borrarformulas = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV72Emprcod = "" ;
      sCtrlAV5CliCod = "" ;
      sCtrlAV6CliCod_to = "" ;
      sCtrlAV11ForSer = "" ;
      sCtrlAV12ForSer_to = "" ;
      sCtrlAV7ForColNom = "" ;
      sCtrlAV8ForColNom_to = "" ;
      sCtrlAV9ForColNum = "" ;
      sCtrlAV10ForColNum_to = "" ;
      sCtrlAV13TipColCod = "" ;
      sCtrlAV14TipColCod_to = "" ;
      sCtrlAV73ForUltUti = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.wcborradoformulas__default(),
         new Object[] {
             new Object[] {
            H00T42_A396EmprCod, H00T42_A496ForUltUti, H00T42_n496ForUltUti, H00T42_A486ForNumCol, H00T42_A832TipColDsc, H00T42_n832TipColDsc, H00T42_A831TipColCod, H00T42_A483ForColNum, H00T42_A482ForColNom, H00T42_A5742ForSerDsc,
            H00T42_n5742ForSerDsc, H00T42_A494ForSer, H00T42_A279CliNom, H00T42_A252CliCod
            }
            , new Object[] {
            H00T43_AGRID_nRecordCount
            }
         }
      );
      AV101Pgmname = "FormulacionTinte.WCBorradoFormulas" ;
      /* GeneXus formulas. */
      AV101Pgmname = "FormulacionTinte.WCBorradoFormulas" ;
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV13TipColCod ;
   private byte wcpOAV14TipColCod_to ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV13TipColCod ;
   private byte AV14TipColCod_to ;
   private byte AV34ManageFiltersExecutionStep ;
   private byte AV54TFTipColCod ;
   private byte AV55TFTipColCod_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A831TipColCod ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV94Formulaciontinte_wcborradoformulasds_14_tftipcolcod ;
   private byte AV95Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to ;
   private byte GXv_int14[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV22OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV5CliCod ;
   private int wcpOAV6CliCod_to ;
   private int wcpOAV9ForColNum ;
   private int wcpOAV10ForColNum_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int AV5CliCod ;
   private int AV6CliCod_to ;
   private int AV9ForColNum ;
   private int AV10ForColNum_to ;
   private int nGXsfl_45_idx=1 ;
   private int AV36TFCliCod ;
   private int AV37TFCliCod_To ;
   private int AV51TFForColNum ;
   private int AV52TFForColNum_To ;
   private int AV60TFForNumCol ;
   private int AV61TFForNumCol_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV82Formulaciontinte_wcborradoformulasds_2_tfclicod ;
   private int AV83Formulaciontinte_wcborradoformulasds_3_tfclicod_to ;
   private int AV92Formulaciontinte_wcborradoformulasds_12_tfforcolnum ;
   private int AV93Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to ;
   private int AV98Formulaciontinte_wcborradoformulasds_18_tffornumcol ;
   private int AV99Formulaciontinte_wcborradoformulasds_19_tffornumcol_to ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtForSer_Visible ;
   private int edtForSerDsc_Visible ;
   private int edtForColNom_Visible ;
   private int edtForColNum_Visible ;
   private int edtTipColCod_Visible ;
   private int edtTipColDsc_Visible ;
   private int edtForNumCol_Visible ;
   private int edtForUltUti_Visible ;
   private int AV69PageToGo ;
   private int nGXsfl_45_fel_idx=1 ;
   private int GXv_int12[] ;
   private int GXv_int13[] ;
   private int AV103GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV70GridCurrentPage ;
   private long AV71GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV72Emprcod ;
   private String wcpOAV11ForSer ;
   private String wcpOAV12ForSer_to ;
   private String wcpOAV7ForColNom ;
   private String wcpOAV8ForColNom_to ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_borrarformulas_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV72Emprcod ;
   private String AV11ForSer ;
   private String AV12ForSer_to ;
   private String AV7ForColNom ;
   private String AV8ForColNom_to ;
   private String sGXsfl_45_idx="0001" ;
   private String AV39TFCliNom ;
   private String AV40TFCliNom_Sel ;
   private String AV42TFForSer ;
   private String AV43TFForSer_Sel ;
   private String AV45TFForSerDsc ;
   private String AV46TFForSerDsc_Sel ;
   private String AV48TFForColNom ;
   private String AV49TFForColNom_Sel ;
   private String AV57TFTipColDsc ;
   private String AV58TFTipColDsc_Sel ;
   private String AV101Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
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
   private String Ddo_grid_Filteredtext_set ;
   private String Ddo_grid_Filteredtextto_set ;
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Fixable ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Innewwindow1_Width ;
   private String Innewwindow1_Height ;
   private String Innewwindow1_Target ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Dvelop_confirmpanel_borrarformulas_Title ;
   private String Dvelop_confirmpanel_borrarformulas_Confirmationtext ;
   private String Dvelop_confirmpanel_borrarformulas_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_borrarformulas_Nobuttoncaption ;
   private String Dvelop_confirmpanel_borrarformulas_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_borrarformulas_Yesbuttonposition ;
   private String Dvelop_confirmpanel_borrarformulas_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String bttBtnborrarformulas_Internalname ;
   private String bttBtnborrarformulas_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_forultutiauxdates_Internalname ;
   private String edtavDdo_forultutiauxdate_Internalname ;
   private String edtavDdo_forultutiauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A494ForSer ;
   private String edtForSer_Internalname ;
   private String A5742ForSerDsc ;
   private String edtForSerDsc_Internalname ;
   private String A482ForColNom ;
   private String edtForColNom_Internalname ;
   private String edtForColNum_Internalname ;
   private String edtTipColCod_Internalname ;
   private String A832TipColDsc ;
   private String edtTipColDsc_Internalname ;
   private String edtForNumCol_Internalname ;
   private String edtForUltUti_Internalname ;
   private String scmdbuf ;
   private String lV84Formulaciontinte_wcborradoformulasds_4_tfclinom ;
   private String lV86Formulaciontinte_wcborradoformulasds_6_tfforser ;
   private String lV88Formulaciontinte_wcborradoformulasds_8_tfforserdsc ;
   private String lV90Formulaciontinte_wcborradoformulasds_10_tfforcolnom ;
   private String lV96Formulaciontinte_wcborradoformulasds_16_tftipcoldsc ;
   private String AV85Formulaciontinte_wcborradoformulasds_5_tfclinom_sel ;
   private String AV84Formulaciontinte_wcborradoformulasds_4_tfclinom ;
   private String AV87Formulaciontinte_wcborradoformulasds_7_tfforser_sel ;
   private String AV86Formulaciontinte_wcborradoformulasds_6_tfforser ;
   private String AV89Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel ;
   private String AV88Formulaciontinte_wcborradoformulasds_8_tfforserdsc ;
   private String AV91Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel ;
   private String AV90Formulaciontinte_wcborradoformulasds_10_tfforcolnom ;
   private String AV97Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel ;
   private String AV96Formulaciontinte_wcborradoformulasds_16_tftipcoldsc ;
   private String A396EmprCod ;
   private String AV78Station ;
   private String AV79Emprnom ;
   private String AV80Usurcod ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String GXt_char19 ;
   private String GXv_char20[] ;
   private String GXt_char17 ;
   private String GXv_char18[] ;
   private String GXt_char16 ;
   private String GXv_char4[] ;
   private String GXt_char15 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_borrarformulas_Internalname ;
   private String Dvelop_confirmpanel_borrarformulas_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV72Emprcod ;
   private String sCtrlAV5CliCod ;
   private String sCtrlAV6CliCod_to ;
   private String sCtrlAV11ForSer ;
   private String sCtrlAV12ForSer_to ;
   private String sCtrlAV7ForColNom ;
   private String sCtrlAV8ForColNom_to ;
   private String sCtrlAV9ForColNum ;
   private String sCtrlAV10ForColNum_to ;
   private String sCtrlAV13TipColCod ;
   private String sCtrlAV14TipColCod_to ;
   private String sCtrlAV73ForUltUti ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtForSer_Jsonclick ;
   private String edtForSerDsc_Jsonclick ;
   private String edtForColNom_Jsonclick ;
   private String edtForColNum_Jsonclick ;
   private String edtTipColCod_Jsonclick ;
   private String edtTipColDsc_Jsonclick ;
   private String edtForNumCol_Jsonclick ;
   private String edtForUltUti_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV73ForUltUti ;
   private java.util.Date AV73ForUltUti ;
   private java.util.Date AV63TFForUltUti ;
   private java.util.Date AV65DDO_ForUltUtiAuxDate ;
   private java.util.Date A496ForUltUti ;
   private java.util.Date AV100Formulaciontinte_wcborradoformulasds_20_tfforultuti ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV23OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n5742ForSerDsc ;
   private boolean n832TipColDsc ;
   private boolean n496ForUltUti ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV27ColumnsSelectorXML ;
   private String AV33ManageFiltersXml ;
   private String AV28UserCustomValue ;
   private String AV74FilterFullText ;
   private String lV81Formulaciontinte_wcborradoformulasds_1_filterfulltext ;
   private String AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext ;
   private String AV25ExcelFilename ;
   private String AV26ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV17HTTPRequest ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_borrarformulas ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private String[] H00T42_A396EmprCod ;
   private java.util.Date[] H00T42_A496ForUltUti ;
   private boolean[] H00T42_n496ForUltUti ;
   private int[] H00T42_A486ForNumCol ;
   private String[] H00T42_A832TipColDsc ;
   private boolean[] H00T42_n832TipColDsc ;
   private byte[] H00T42_A831TipColCod ;
   private int[] H00T42_A483ForColNum ;
   private String[] H00T42_A482ForColNom ;
   private String[] H00T42_A5742ForSerDsc ;
   private boolean[] H00T42_n5742ForSerDsc ;
   private String[] H00T42_A494ForSer ;
   private String[] H00T42_A279CliNom ;
   private int[] H00T42_A252CliCod ;
   private long[] H00T43_AGRID_nRecordCount ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV32ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV16WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV18TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState21[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV21GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV29ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV30ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV68DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class wcborradoformulas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00T42( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext ,
                                          int AV82Formulaciontinte_wcborradoformulasds_2_tfclicod ,
                                          int AV83Formulaciontinte_wcborradoformulasds_3_tfclicod_to ,
                                          String AV85Formulaciontinte_wcborradoformulasds_5_tfclinom_sel ,
                                          String AV84Formulaciontinte_wcborradoformulasds_4_tfclinom ,
                                          String AV87Formulaciontinte_wcborradoformulasds_7_tfforser_sel ,
                                          String AV86Formulaciontinte_wcborradoformulasds_6_tfforser ,
                                          String AV89Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel ,
                                          String AV88Formulaciontinte_wcborradoformulasds_8_tfforserdsc ,
                                          String AV91Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel ,
                                          String AV90Formulaciontinte_wcborradoformulasds_10_tfforcolnom ,
                                          int AV92Formulaciontinte_wcborradoformulasds_12_tfforcolnum ,
                                          int AV93Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to ,
                                          byte AV94Formulaciontinte_wcborradoformulasds_14_tftipcolcod ,
                                          byte AV95Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to ,
                                          String AV97Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel ,
                                          String AV96Formulaciontinte_wcborradoformulasds_16_tftipcoldsc ,
                                          int AV98Formulaciontinte_wcborradoformulasds_18_tffornumcol ,
                                          int AV99Formulaciontinte_wcborradoformulasds_19_tffornumcol_to ,
                                          java.util.Date AV100Formulaciontinte_wcborradoformulasds_20_tfforultuti ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          int A486ForNumCol ,
                                          java.util.Date A496ForUltUti ,
                                          short AV22OrderedBy ,
                                          boolean AV23OrderedDsc ,
                                          String AV12ForSer_to ,
                                          String AV8ForColNom_to ,
                                          int AV10ForColNum_to ,
                                          byte AV14TipColCod_to ,
                                          java.util.Date AV73ForUltUti ,
                                          String AV72Emprcod ,
                                          int AV5CliCod ,
                                          String AV11ForSer ,
                                          String AV7ForColNom ,
                                          int AV9ForColNum ,
                                          byte AV13TipColCod ,
                                          String A396EmprCod ,
                                          int AV6CliCod_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[46];
      Object[] GXv_Object23 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.ForUltUti, T1.ForNumCol, T2.TipColDsc, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T3.CliNom, T1.CliCod" ;
      sFromString = " FROM ((TXPCFORMU T1 INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod" ;
      sFromString += " = T1.CliCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod >= ? and T1.ForSer >= ? and T1.ForColNom >= ? and T1.ForColNum >= ? and T1.TipColCod >= ?)");
      addWhere(sWhereString, "(T1.ForSer <= ?)");
      addWhere(sWhereString, "(T1.ForColNom <= ?)");
      addWhere(sWhereString, "(T1.ForColNum <= ?)");
      addWhere(sWhereString, "(T1.TipColCod <= ?)");
      addWhere(sWhereString, "(T1.ForUltUti <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForNumCol,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int22[13] = (byte)(1) ;
         GXv_int22[14] = (byte)(1) ;
         GXv_int22[15] = (byte)(1) ;
         GXv_int22[16] = (byte)(1) ;
         GXv_int22[17] = (byte)(1) ;
         GXv_int22[18] = (byte)(1) ;
         GXv_int22[19] = (byte)(1) ;
         GXv_int22[20] = (byte)(1) ;
         GXv_int22[21] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_wcborradoformulasds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int22[22] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_wcborradoformulasds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int22[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_wcborradoformulasds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_wcborradoformulasds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_wcborradoformulasds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int22[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Formulaciontinte_wcborradoformulasds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV86Formulaciontinte_wcborradoformulasds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Formulaciontinte_wcborradoformulasds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int22[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV88Formulaciontinte_wcborradoformulasds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int22[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV90Formulaciontinte_wcborradoformulasds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int22[31] = (byte)(1) ;
      }
      if ( ! (0==AV92Formulaciontinte_wcborradoformulasds_12_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int22[32] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int22[33] = (byte)(1) ;
      }
      if ( ! (0==AV94Formulaciontinte_wcborradoformulasds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int22[34] = (byte)(1) ;
      }
      if ( ! (0==AV95Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int22[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Formulaciontinte_wcborradoformulasds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int22[37] = (byte)(1) ;
      }
      if ( ! (0==AV98Formulaciontinte_wcborradoformulasds_18_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int22[38] = (byte)(1) ;
      }
      if ( ! (0==AV99Formulaciontinte_wcborradoformulasds_19_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int22[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100Formulaciontinte_wcborradoformulasds_20_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int22[40] = (byte)(1) ;
      }
      if ( ( AV22OrderedBy == 1 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV22OrderedBy == 1 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV22OrderedBy == 2 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV22OrderedBy == 2 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV22OrderedBy == 3 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForSer" ;
      }
      else if ( ( AV22OrderedBy == 3 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForSer DESC" ;
      }
      else if ( ( AV22OrderedBy == 4 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForSerDsc" ;
      }
      else if ( ( AV22OrderedBy == 4 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForSerDsc DESC" ;
      }
      else if ( ( AV22OrderedBy == 5 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForColNom" ;
      }
      else if ( ( AV22OrderedBy == 5 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForColNom DESC" ;
      }
      else if ( ( AV22OrderedBy == 6 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForColNum" ;
      }
      else if ( ( AV22OrderedBy == 6 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForColNum DESC" ;
      }
      else if ( ( AV22OrderedBy == 7 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV22OrderedBy == 7 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV22OrderedBy == 8 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T2.TipColDsc" ;
      }
      else if ( ( AV22OrderedBy == 8 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.TipColDsc DESC" ;
      }
      else if ( ( AV22OrderedBy == 9 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForNumCol" ;
      }
      else if ( ( AV22OrderedBy == 9 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForNumCol DESC" ;
      }
      else if ( ( AV22OrderedBy == 10 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForUltUti" ;
      }
      else if ( ( AV22OrderedBy == 10 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForUltUti DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
   }

   protected Object[] conditional_H00T43( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext ,
                                          int AV82Formulaciontinte_wcborradoformulasds_2_tfclicod ,
                                          int AV83Formulaciontinte_wcborradoformulasds_3_tfclicod_to ,
                                          String AV85Formulaciontinte_wcborradoformulasds_5_tfclinom_sel ,
                                          String AV84Formulaciontinte_wcborradoformulasds_4_tfclinom ,
                                          String AV87Formulaciontinte_wcborradoformulasds_7_tfforser_sel ,
                                          String AV86Formulaciontinte_wcborradoformulasds_6_tfforser ,
                                          String AV89Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel ,
                                          String AV88Formulaciontinte_wcborradoformulasds_8_tfforserdsc ,
                                          String AV91Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel ,
                                          String AV90Formulaciontinte_wcborradoformulasds_10_tfforcolnom ,
                                          int AV92Formulaciontinte_wcborradoformulasds_12_tfforcolnum ,
                                          int AV93Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to ,
                                          byte AV94Formulaciontinte_wcborradoformulasds_14_tftipcolcod ,
                                          byte AV95Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to ,
                                          String AV97Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel ,
                                          String AV96Formulaciontinte_wcborradoformulasds_16_tftipcoldsc ,
                                          int AV98Formulaciontinte_wcborradoformulasds_18_tffornumcol ,
                                          int AV99Formulaciontinte_wcborradoformulasds_19_tffornumcol_to ,
                                          java.util.Date AV100Formulaciontinte_wcborradoformulasds_20_tfforultuti ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          int A486ForNumCol ,
                                          java.util.Date A496ForUltUti ,
                                          short AV22OrderedBy ,
                                          boolean AV23OrderedDsc ,
                                          String AV12ForSer_to ,
                                          String AV8ForColNom_to ,
                                          int AV10ForColNum_to ,
                                          byte AV14TipColCod_to ,
                                          java.util.Date AV73ForUltUti ,
                                          String AV72Emprcod ,
                                          int AV5CliCod ,
                                          String AV11ForSer ,
                                          String AV7ForColNom ,
                                          int AV9ForColNum ,
                                          byte AV13TipColCod ,
                                          String A396EmprCod ,
                                          int AV6CliCod_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int24 = new byte[41];
      Object[] GXv_Object25 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPCFORMU T1 INNER JOIN TXPTIPCOL T3 ON T3.EmprCod = T1.EmprCod AND T3.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod >= ? and T1.ForSer >= ? and T1.ForColNom >= ? and T1.ForColNum >= ? and T1.TipColCod >= ?)");
      addWhere(sWhereString, "(T1.ForSer <= ?)");
      addWhere(sWhereString, "(T1.ForColNom <= ?)");
      addWhere(sWhereString, "(T1.ForColNum <= ?)");
      addWhere(sWhereString, "(T1.TipColCod <= ?)");
      addWhere(sWhereString, "(T1.ForUltUti <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_wcborradoformulasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T3.TipColDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForNumCol,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int24[13] = (byte)(1) ;
         GXv_int24[14] = (byte)(1) ;
         GXv_int24[15] = (byte)(1) ;
         GXv_int24[16] = (byte)(1) ;
         GXv_int24[17] = (byte)(1) ;
         GXv_int24[18] = (byte)(1) ;
         GXv_int24[19] = (byte)(1) ;
         GXv_int24[20] = (byte)(1) ;
         GXv_int24[21] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_wcborradoformulasds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int24[22] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_wcborradoformulasds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int24[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_wcborradoformulasds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_wcborradoformulasds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_wcborradoformulasds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int24[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Formulaciontinte_wcborradoformulasds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV86Formulaciontinte_wcborradoformulasds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Formulaciontinte_wcborradoformulasds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int24[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV88Formulaciontinte_wcborradoformulasds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int24[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV90Formulaciontinte_wcborradoformulasds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int24[31] = (byte)(1) ;
      }
      if ( ! (0==AV92Formulaciontinte_wcborradoformulasds_12_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int24[32] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int24[33] = (byte)(1) ;
      }
      if ( ! (0==AV94Formulaciontinte_wcborradoformulasds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int24[34] = (byte)(1) ;
      }
      if ( ! (0==AV95Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int24[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Formulaciontinte_wcborradoformulasds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipColDsc = ?)");
      }
      else
      {
         GXv_int24[37] = (byte)(1) ;
      }
      if ( ! (0==AV98Formulaciontinte_wcborradoformulasds_18_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int24[38] = (byte)(1) ;
      }
      if ( ! (0==AV99Formulaciontinte_wcborradoformulasds_19_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int24[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100Formulaciontinte_wcborradoformulasds_20_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int24[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV22OrderedBy == 1 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 1 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 2 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 2 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 3 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 3 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 4 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 4 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 5 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 5 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 6 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 6 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 7 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 7 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 8 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 8 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 9 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 9 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 10 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 10 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object25[0] = scmdbuf ;
      GXv_Object25[1] = GXv_int24 ;
      return GXv_Object25 ;
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
                  return conditional_H00T42(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).byteValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() );
            case 1 :
                  return conditional_H00T43(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).byteValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00T42", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00T43", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               ((String[]) buf[9])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((int[]) buf[13])[0] = rslt.getInt(11);
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
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[86]);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[81]);
               }
               return;
      }
   }

}

