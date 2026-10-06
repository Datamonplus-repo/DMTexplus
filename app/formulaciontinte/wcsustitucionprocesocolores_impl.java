package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcsustitucionprocesocolores_impl extends GXWebComponent
{
   public wcsustitucionprocesocolores_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcsustitucionprocesocolores_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcsustitucionprocesocolores_impl.class ));
   }

   public wcsustitucionprocesocolores_impl( int remoteHandle ,
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
               AV70Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Emprcod", AV70Emprcod);
               AV54CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54CliCod), 6, 0));
               AV55CliCod_to = (int)(GXutil.lval( httpContext.GetPar( "CliCod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55CliCod_to), 6, 0));
               AV56ForColNom = httpContext.GetPar( "ForColNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56ForColNom", AV56ForColNom);
               AV57ForColNom_to = httpContext.GetPar( "ForColNom_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57ForColNom_to", AV57ForColNom_to);
               AV58ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58ForColNum), 6, 0));
               AV59ForColNum_to = (int)(GXutil.lval( httpContext.GetPar( "ForColNum_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59ForColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59ForColNum_to), 6, 0));
               AV60ForSer = httpContext.GetPar( "ForSer") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60ForSer", AV60ForSer);
               AV61ForSer_to = httpContext.GetPar( "ForSer_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61ForSer_to", AV61ForSer_to);
               AV62IntCod = (byte)(GXutil.lval( httpContext.GetPar( "IntCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62IntCod), 2, 0));
               AV63IntCod_to = (byte)(GXutil.lval( httpContext.GetPar( "IntCod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63IntCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63IntCod_to), 2, 0));
               AV64MatCod = (short)(GXutil.lval( httpContext.GetPar( "MatCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64MatCod), 3, 0));
               AV65MatCod_to = (short)(GXutil.lval( httpContext.GetPar( "MatCod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65MatCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65MatCod_to), 3, 0));
               AV68TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TipColCod), 2, 0));
               AV69TipColCod_to = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TipColCod_to), 2, 0));
               AV66ProForCod = httpContext.GetPar( "ProForCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66ProForCod", AV66ProForCod);
               AV67ProForCoddestino = httpContext.GetPar( "ProForCoddestino") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67ProForCoddestino", AV67ProForCoddestino);
               AV71ProForDsc = httpContext.GetPar( "ProForDsc") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71ProForDsc", AV71ProForDsc);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV70Emprcod,Integer.valueOf(AV54CliCod),Integer.valueOf(AV55CliCod_to),AV56ForColNom,AV57ForColNom_to,Integer.valueOf(AV58ForColNum),Integer.valueOf(AV59ForColNum_to),AV60ForSer,AV61ForSer_to,Byte.valueOf(AV62IntCod),Byte.valueOf(AV63IntCod_to),Short.valueOf(AV64MatCod),Short.valueOf(AV65MatCod_to),Byte.valueOf(AV68TipColCod),Byte.valueOf(AV69TipColCod_to),AV66ProForCod,AV67ProForCoddestino,AV71ProForDsc});
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
      nRC_GXsfl_55 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_55"))) ;
      nGXsfl_55_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_55_idx"))) ;
      sGXsfl_55_idx = httpContext.GetPar( "sGXsfl_55_idx") ;
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
      AV72FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV70Emprcod = httpContext.GetPar( "Emprcod") ;
      AV54CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV55CliCod_to = (int)(GXutil.lval( httpContext.GetPar( "CliCod_to"))) ;
      AV56ForColNom = httpContext.GetPar( "ForColNom") ;
      AV57ForColNom_to = httpContext.GetPar( "ForColNom_to") ;
      AV58ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
      AV59ForColNum_to = (int)(GXutil.lval( httpContext.GetPar( "ForColNum_to"))) ;
      AV60ForSer = httpContext.GetPar( "ForSer") ;
      AV61ForSer_to = httpContext.GetPar( "ForSer_to") ;
      AV62IntCod = (byte)(GXutil.lval( httpContext.GetPar( "IntCod"))) ;
      AV63IntCod_to = (byte)(GXutil.lval( httpContext.GetPar( "IntCod_to"))) ;
      AV64MatCod = (short)(GXutil.lval( httpContext.GetPar( "MatCod"))) ;
      AV65MatCod_to = (short)(GXutil.lval( httpContext.GetPar( "MatCod_to"))) ;
      AV68TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
      AV69TipColCod_to = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod_to"))) ;
      AV24ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV19ColumnsSelector);
      AV26TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV27TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV29TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV30TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV32TFForSer = httpContext.GetPar( "TFForSer") ;
      AV33TFForSer_Sel = httpContext.GetPar( "TFForSer_Sel") ;
      AV35TFForSerDsc = httpContext.GetPar( "TFForSerDsc") ;
      AV36TFForSerDsc_Sel = httpContext.GetPar( "TFForSerDsc_Sel") ;
      AV38TFForColNom = httpContext.GetPar( "TFForColNom") ;
      AV39TFForColNom_Sel = httpContext.GetPar( "TFForColNom_Sel") ;
      AV41TFForColNum = (int)(GXutil.lval( httpContext.GetPar( "TFForColNum"))) ;
      AV42TFForColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFForColNum_To"))) ;
      AV44TFTipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TFTipColCod"))) ;
      AV45TFTipColCod_To = (byte)(GXutil.lval( httpContext.GetPar( "TFTipColCod_To"))) ;
      AV47TFTipColDsc = httpContext.GetPar( "TFTipColDsc") ;
      AV48TFTipColDsc_Sel = httpContext.GetPar( "TFTipColDsc_Sel") ;
      AV96Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV66ProForCod = httpContext.GetPar( "ProForCod") ;
      AV67ProForCoddestino = httpContext.GetPar( "ProForCoddestino") ;
      AV71ProForDsc = httpContext.GetPar( "ProForDsc") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV72FilterFullText, AV70Emprcod, AV54CliCod, AV55CliCod_to, AV56ForColNom, AV57ForColNom_to, AV58ForColNum, AV59ForColNum_to, AV60ForSer, AV61ForSer_to, AV62IntCod, AV63IntCod_to, AV64MatCod, AV65MatCod_to, AV68TipColCod, AV69TipColCod_to, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV26TFCliCod, AV27TFCliCod_To, AV29TFCliNom, AV30TFCliNom_Sel, AV32TFForSer, AV33TFForSer_Sel, AV35TFForSerDsc, AV36TFForSerDsc_Sel, AV38TFForColNom, AV39TFForColNom_Sel, AV41TFForColNum, AV42TFForColNum_To, AV44TFTipColCod, AV45TFTipColCod_To, AV47TFTipColDsc, AV48TFTipColDsc_Sel, AV96Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66ProForCod, AV67ProForCoddestino, AV71ProForDsc, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paQL2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Formulas", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.wcsustitucionprocesocolores", new String[] {GXutil.URLEncode(GXutil.rtrim(AV70Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV54CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV55CliCod_to,6,0)),GXutil.URLEncode(GXutil.rtrim(AV56ForColNom)),GXutil.URLEncode(GXutil.rtrim(AV57ForColNom_to)),GXutil.URLEncode(GXutil.ltrimstr(AV58ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV59ForColNum_to,6,0)),GXutil.URLEncode(GXutil.rtrim(AV60ForSer)),GXutil.URLEncode(GXutil.rtrim(AV61ForSer_to)),GXutil.URLEncode(GXutil.ltrimstr(AV62IntCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV63IntCod_to,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV64MatCod,3,0)),GXutil.URLEncode(GXutil.ltrimstr(AV65MatCod_to,3,0)),GXutil.URLEncode(GXutil.ltrimstr(AV68TipColCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV69TipColCod_to,2,0)),GXutil.URLEncode(GXutil.rtrim(AV66ProForCod)),GXutil.URLEncode(GXutil.rtrim(AV67ProForCoddestino)),GXutil.URLEncode(GXutil.rtrim(AV71ProForDsc))}, new String[] {"Emprcod","CliCod","CliCod_to","ForColNom","ForColNom_to","ForColNum","ForColNum_to","ForSer","ForSer_to","IntCod","IntCod_to","MatCod","MatCod_to","TipColCod","TipColCod_to","ProForCod","ProForCoddestino","ProForDsc"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV96Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV72FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_55, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV22ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV22ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV52GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV53GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV50DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV50DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV19ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV19ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV70Emprcod", GXutil.rtrim( wcpOAV70Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV54CliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV54CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV55CliCod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV55CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV56ForColNom", GXutil.rtrim( wcpOAV56ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV57ForColNom_to", GXutil.rtrim( wcpOAV57ForColNom_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV58ForColNum", GXutil.ltrim( localUtil.ntoc( wcpOAV58ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV59ForColNum_to", GXutil.ltrim( localUtil.ntoc( wcpOAV59ForColNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV60ForSer", GXutil.rtrim( wcpOAV60ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV61ForSer_to", GXutil.rtrim( wcpOAV61ForSer_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV62IntCod", GXutil.ltrim( localUtil.ntoc( wcpOAV62IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV63IntCod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV63IntCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV64MatCod", GXutil.ltrim( localUtil.ntoc( wcpOAV64MatCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV65MatCod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV65MatCod_to, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV68TipColCod", GXutil.ltrim( localUtil.ntoc( wcpOAV68TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV69TipColCod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV69TipColCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV66ProForCod", GXutil.rtrim( wcpOAV66ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV67ProForCoddestino", GXutil.rtrim( wcpOAV67ProForCoddestino));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV71ProForDsc", GXutil.rtrim( wcpOAV71ProForDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV24ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV26TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV27TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV29TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV30TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORSER", GXutil.rtrim( AV32TFForSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORSER_SEL", GXutil.rtrim( AV33TFForSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORSERDSC", GXutil.rtrim( AV35TFForSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORSERDSC_SEL", GXutil.rtrim( AV36TFForSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORCOLNOM", GXutil.rtrim( AV38TFForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORCOLNOM_SEL", GXutil.rtrim( AV39TFForColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV41TFForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV42TFForColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV44TFTipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPCOLCOD_TO", GXutil.ltrim( localUtil.ntoc( AV45TFTipColCod_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPCOLDSC", GXutil.rtrim( AV47TFTipColDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPCOLDSC_SEL", GXutil.rtrim( AV48TFTipColDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV96Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV96Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV70Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV54CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV55CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNOM", GXutil.rtrim( AV56ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNOM_TO", GXutil.rtrim( AV57ForColNom_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV58ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV59ForColNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORSER", GXutil.rtrim( AV60ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORSER_TO", GXutil.rtrim( AV61ForSer_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINTCOD", GXutil.ltrim( localUtil.ntoc( AV62IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINTCOD_TO", GXutil.ltrim( localUtil.ntoc( AV63IntCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMATCOD", GXutil.ltrim( localUtil.ntoc( AV64MatCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMATCOD_TO", GXutil.ltrim( localUtil.ntoc( AV65MatCod_to, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV68TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPCOLCOD_TO", GXutil.ltrim( localUtil.ntoc( AV69TipColCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPROFORCODDESTINO", GXutil.rtrim( AV67ProForCoddestino));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
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
   }

   public void renderHtmlCloseFormQL2( )
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
      return "FormulacionTinte.WCSustitucionProcesoColores" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Formulas", "") ;
   }

   public void wbQL0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.formulaciontinte.wcsustitucionprocesocolores");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavProforcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProforcod_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProforcod_Internalname, GXutil.rtrim( AV66ProForCod), GXutil.rtrim( localUtil.format( AV66ProForCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProforcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProforcod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\WCSustitucionProcesoColores.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavProfordsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProfordsc_Internalname, httpContext.getMessage( "Proceso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProfordsc_Internalname, GXutil.rtrim( AV71ProForDsc), GXutil.rtrim( localUtil.format( AV71ProForDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProfordsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProfordsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\WCSustitucionProcesoColores.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\WCSustitucionProcesoColores.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 7, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11ql1_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\WCSustitucionProcesoColores.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\WCSustitucionProcesoColores.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\WCSustitucionProcesoColores.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_37_QL2( true) ;
      }
      else
      {
         wb_table1_37_QL2( false) ;
      }
      return  ;
   }

   public void wb_table1_37_QL2e( boolean wbgen )
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
         startgridcontrol55( ) ;
      }
      if ( wbEnd == 55 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_55 = (int)(nGXsfl_55_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV52GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV53GridPageCount);
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV50DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, sPrefix+"INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV50DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV19ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 55 )
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

   public void startQL2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Formulas", ""), (short)(0)) ;
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
            strupQL0( ) ;
         }
      }
   }

   public void wsQL2( )
   {
      startQL2( ) ;
      evtQL2( ) ;
   }

   public void evtQL2( )
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
                              strupQL0( ) ;
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
                              strupQL0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12QL2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupQL0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e13QL2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupQL0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e14QL2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupQL0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e15QL2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupQL0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e16QL2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupQL0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e17QL2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupQL0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e18QL2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupQL0( ) ;
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
                              strupQL0( ) ;
                           }
                           nGXsfl_55_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_552( ) ;
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
                                       e19QL2 ();
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
                                       e20QL2 ();
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
                                       e21QL2 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV72FilterFullText) != 0 )
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
                                    strupQL0( ) ;
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

   public void weQL2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormQL2( ) ;
         }
      }
   }

   public void paQL2( )
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
      subsflControlProps_552( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         sendrow_552( ) ;
         nGXsfl_55_idx = ((subGrid_Islastpage==1)&&(nGXsfl_55_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_552( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV72FilterFullText ,
                                 String AV70Emprcod ,
                                 int AV54CliCod ,
                                 int AV55CliCod_to ,
                                 String AV56ForColNom ,
                                 String AV57ForColNom_to ,
                                 int AV58ForColNum ,
                                 int AV59ForColNum_to ,
                                 String AV60ForSer ,
                                 String AV61ForSer_to ,
                                 byte AV62IntCod ,
                                 byte AV63IntCod_to ,
                                 short AV64MatCod ,
                                 short AV65MatCod_to ,
                                 byte AV68TipColCod ,
                                 byte AV69TipColCod_to ,
                                 byte AV24ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelector ,
                                 int AV26TFCliCod ,
                                 int AV27TFCliCod_To ,
                                 String AV29TFCliNom ,
                                 String AV30TFCliNom_Sel ,
                                 String AV32TFForSer ,
                                 String AV33TFForSer_Sel ,
                                 String AV35TFForSerDsc ,
                                 String AV36TFForSerDsc_Sel ,
                                 String AV38TFForColNom ,
                                 String AV39TFForColNom_Sel ,
                                 int AV41TFForColNum ,
                                 int AV42TFForColNum_To ,
                                 byte AV44TFTipColCod ,
                                 byte AV45TFTipColCod_To ,
                                 String AV47TFTipColDsc ,
                                 String AV48TFTipColDsc_Sel ,
                                 String AV96Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV66ProForCod ,
                                 String AV67ProForCoddestino ,
                                 String AV71ProForDsc ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e20QL2 ();
      GRID_nCurrentRecord = 0 ;
      rfQL2( ) ;
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
      rfQL2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV96Pgmname = "FormulacionTinte.WCSustitucionProcesoColores" ;
      Gx_err = (short)(0) ;
      edtavProforcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavProforcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProforcod_Enabled), 5, 0), true);
      edtavProfordsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavProfordsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProfordsc_Enabled), 5, 0), true);
   }

   public void rfQL2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(55) ;
      /* Execute user event: Refresh */
      e20QL2 ();
      nGXsfl_55_idx = 1 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_552( ) ;
      bGXsfl_55_Refreshing = true ;
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
         subsflControlProps_552( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext ,
                                              Integer.valueOf(AV80Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod) ,
                                              Integer.valueOf(AV81Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to) ,
                                              AV83Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel ,
                                              AV82Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom ,
                                              AV85Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel ,
                                              AV84Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser ,
                                              AV87Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel ,
                                              AV86Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc ,
                                              AV89Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel ,
                                              AV88Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom ,
                                              Integer.valueOf(AV90Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum) ,
                                              Integer.valueOf(AV91Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to) ,
                                              Byte.valueOf(AV92Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod) ,
                                              Byte.valueOf(AV93Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to) ,
                                              AV95Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel ,
                                              AV94Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc ,
                                              Integer.valueOf(AV54CliCod) ,
                                              Integer.valueOf(AV55CliCod_to) ,
                                              AV56ForColNom ,
                                              AV57ForColNom_to ,
                                              Integer.valueOf(AV58ForColNum) ,
                                              Integer.valueOf(AV59ForColNum_to) ,
                                              AV60ForSer ,
                                              AV61ForSer_to ,
                                              Byte.valueOf(AV62IntCod) ,
                                              Byte.valueOf(AV63IntCod_to) ,
                                              Short.valueOf(AV64MatCod) ,
                                              Short.valueOf(AV65MatCod_to) ,
                                              Byte.valueOf(AV68TipColCod) ,
                                              Byte.valueOf(AV69TipColCod_to) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A494ForSer ,
                                              A5742ForSerDsc ,
                                              A482ForColNom ,
                                              Integer.valueOf(A483ForColNum) ,
                                              Byte.valueOf(A831TipColCod) ,
                                              A832TipColDsc ,
                                              Byte.valueOf(A583IntCod) ,
                                              Short.valueOf(A626MatCod) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV70Emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
         lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
         lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
         lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
         lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
         lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
         lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
         lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
         lV82Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV82Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom), 30, "%") ;
         lV84Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = GXutil.padr( GXutil.rtrim( AV84Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser), 16, "%") ;
         lV86Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV86Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc), 26, "%") ;
         lV88Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV88Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom), 13, "%") ;
         lV94Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV94Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc), 30, "%") ;
         /* Using cursor H00QL2 */
         pr_default.execute(0, new Object[] {AV70Emprcod, lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, Integer.valueOf(AV80Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod), Integer.valueOf(AV81Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to), lV82Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom, AV83Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel, lV84Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser, AV85Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel, lV86Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc, AV87Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel, lV88Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom, AV89Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel, Integer.valueOf(AV90Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum), Integer.valueOf(AV91Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to), Byte.valueOf(AV92Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod), Byte.valueOf(AV93Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to), lV94Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc, AV95Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel, Integer.valueOf(AV54CliCod), Integer.valueOf(AV55CliCod_to), AV56ForColNom, AV57ForColNom_to, Integer.valueOf(AV58ForColNum), Integer.valueOf(AV59ForColNum_to), AV60ForSer, AV61ForSer_to, Byte.valueOf(AV62IntCod), Byte.valueOf(AV63IntCod_to), Short.valueOf(AV64MatCod), Short.valueOf(AV65MatCod_to), Byte.valueOf(AV68TipColCod), Byte.valueOf(AV69TipColCod_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_55_idx = 1 ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_552( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A626MatCod = H00QL2_A626MatCod[0] ;
            A583IntCod = H00QL2_A583IntCod[0] ;
            A396EmprCod = H00QL2_A396EmprCod[0] ;
            A832TipColDsc = H00QL2_A832TipColDsc[0] ;
            n832TipColDsc = H00QL2_n832TipColDsc[0] ;
            A831TipColCod = H00QL2_A831TipColCod[0] ;
            A483ForColNum = H00QL2_A483ForColNum[0] ;
            A482ForColNom = H00QL2_A482ForColNom[0] ;
            A5742ForSerDsc = H00QL2_A5742ForSerDsc[0] ;
            n5742ForSerDsc = H00QL2_n5742ForSerDsc[0] ;
            A494ForSer = H00QL2_A494ForSer[0] ;
            A279CliNom = H00QL2_A279CliNom[0] ;
            A252CliCod = H00QL2_A252CliCod[0] ;
            A832TipColDsc = H00QL2_A832TipColDsc[0] ;
            n832TipColDsc = H00QL2_n832TipColDsc[0] ;
            A279CliNom = H00QL2_A279CliNom[0] ;
            e21QL2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(55) ;
         wbQL0( ) ;
      }
      bGXsfl_55_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesQL2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV96Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV96Pgmname, ""))));
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
      AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = AV72FilterFullText ;
      AV80Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod = AV26TFCliCod ;
      AV81Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to = AV27TFCliCod_To ;
      AV82Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = AV29TFCliNom ;
      AV83Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel = AV30TFCliNom_Sel ;
      AV84Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = AV32TFForSer ;
      AV85Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel = AV33TFForSer_Sel ;
      AV86Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = AV35TFForSerDsc ;
      AV87Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel = AV36TFForSerDsc_Sel ;
      AV88Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = AV38TFForColNom ;
      AV89Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel = AV39TFForColNom_Sel ;
      AV90Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum = AV41TFForColNum ;
      AV91Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to = AV42TFForColNum_To ;
      AV92Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod = AV44TFTipColCod ;
      AV93Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to = AV45TFTipColCod_To ;
      AV94Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = AV47TFTipColDsc ;
      AV95Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel = AV48TFTipColDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext ,
                                           Integer.valueOf(AV80Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod) ,
                                           Integer.valueOf(AV81Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to) ,
                                           AV83Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel ,
                                           AV82Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom ,
                                           AV85Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel ,
                                           AV84Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser ,
                                           AV87Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel ,
                                           AV86Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc ,
                                           AV89Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel ,
                                           AV88Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom ,
                                           Integer.valueOf(AV90Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum) ,
                                           Integer.valueOf(AV91Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to) ,
                                           Byte.valueOf(AV92Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod) ,
                                           Byte.valueOf(AV93Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to) ,
                                           AV95Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel ,
                                           AV94Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc ,
                                           Integer.valueOf(AV54CliCod) ,
                                           Integer.valueOf(AV55CliCod_to) ,
                                           AV56ForColNom ,
                                           AV57ForColNom_to ,
                                           Integer.valueOf(AV58ForColNum) ,
                                           Integer.valueOf(AV59ForColNum_to) ,
                                           AV60ForSer ,
                                           AV61ForSer_to ,
                                           Byte.valueOf(AV62IntCod) ,
                                           Byte.valueOf(AV63IntCod_to) ,
                                           Short.valueOf(AV64MatCod) ,
                                           Short.valueOf(AV65MatCod_to) ,
                                           Byte.valueOf(AV68TipColCod) ,
                                           Byte.valueOf(AV69TipColCod_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Byte.valueOf(A583IntCod) ,
                                           Short.valueOf(A626MatCod) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV70Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV82Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV82Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom), 30, "%") ;
      lV84Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = GXutil.padr( GXutil.rtrim( AV84Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser), 16, "%") ;
      lV86Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV86Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc), 26, "%") ;
      lV88Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV88Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom), 13, "%") ;
      lV94Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV94Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc), 30, "%") ;
      /* Using cursor H00QL3 */
      pr_default.execute(1, new Object[] {AV70Emprcod, lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, Integer.valueOf(AV80Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod), Integer.valueOf(AV81Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to), lV82Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom, AV83Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel, lV84Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser, AV85Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel, lV86Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc, AV87Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel, lV88Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom, AV89Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel, Integer.valueOf(AV90Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum), Integer.valueOf(AV91Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to), Byte.valueOf(AV92Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod), Byte.valueOf(AV93Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to), lV94Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc, AV95Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel, Integer.valueOf(AV54CliCod), Integer.valueOf(AV55CliCod_to), AV56ForColNom, AV57ForColNom_to, Integer.valueOf(AV58ForColNum), Integer.valueOf(AV59ForColNum_to), AV60ForSer, AV61ForSer_to, Byte.valueOf(AV62IntCod), Byte.valueOf(AV63IntCod_to), Short.valueOf(AV64MatCod), Short.valueOf(AV65MatCod_to), Byte.valueOf(AV68TipColCod), Byte.valueOf(AV69TipColCod_to)});
      GRID_nRecordCount = H00QL3_AGRID_nRecordCount[0] ;
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
      AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = AV72FilterFullText ;
      AV80Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod = AV26TFCliCod ;
      AV81Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to = AV27TFCliCod_To ;
      AV82Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = AV29TFCliNom ;
      AV83Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel = AV30TFCliNom_Sel ;
      AV84Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = AV32TFForSer ;
      AV85Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel = AV33TFForSer_Sel ;
      AV86Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = AV35TFForSerDsc ;
      AV87Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel = AV36TFForSerDsc_Sel ;
      AV88Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = AV38TFForColNom ;
      AV89Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel = AV39TFForColNom_Sel ;
      AV90Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum = AV41TFForColNum ;
      AV91Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to = AV42TFForColNum_To ;
      AV92Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod = AV44TFTipColCod ;
      AV93Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to = AV45TFTipColCod_To ;
      AV94Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = AV47TFTipColDsc ;
      AV95Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel = AV48TFTipColDsc_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV72FilterFullText, AV70Emprcod, AV54CliCod, AV55CliCod_to, AV56ForColNom, AV57ForColNom_to, AV58ForColNum, AV59ForColNum_to, AV60ForSer, AV61ForSer_to, AV62IntCod, AV63IntCod_to, AV64MatCod, AV65MatCod_to, AV68TipColCod, AV69TipColCod_to, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV26TFCliCod, AV27TFCliCod_To, AV29TFCliNom, AV30TFCliNom_Sel, AV32TFForSer, AV33TFForSer_Sel, AV35TFForSerDsc, AV36TFForSerDsc_Sel, AV38TFForColNom, AV39TFForColNom_Sel, AV41TFForColNum, AV42TFForColNum_To, AV44TFTipColCod, AV45TFTipColCod_To, AV47TFTipColDsc, AV48TFTipColDsc_Sel, AV96Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66ProForCod, AV67ProForCoddestino, AV71ProForDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = AV72FilterFullText ;
      AV80Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod = AV26TFCliCod ;
      AV81Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to = AV27TFCliCod_To ;
      AV82Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = AV29TFCliNom ;
      AV83Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel = AV30TFCliNom_Sel ;
      AV84Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = AV32TFForSer ;
      AV85Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel = AV33TFForSer_Sel ;
      AV86Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = AV35TFForSerDsc ;
      AV87Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel = AV36TFForSerDsc_Sel ;
      AV88Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = AV38TFForColNom ;
      AV89Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel = AV39TFForColNom_Sel ;
      AV90Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum = AV41TFForColNum ;
      AV91Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to = AV42TFForColNum_To ;
      AV92Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod = AV44TFTipColCod ;
      AV93Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to = AV45TFTipColCod_To ;
      AV94Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = AV47TFTipColDsc ;
      AV95Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel = AV48TFTipColDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV72FilterFullText, AV70Emprcod, AV54CliCod, AV55CliCod_to, AV56ForColNom, AV57ForColNom_to, AV58ForColNum, AV59ForColNum_to, AV60ForSer, AV61ForSer_to, AV62IntCod, AV63IntCod_to, AV64MatCod, AV65MatCod_to, AV68TipColCod, AV69TipColCod_to, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV26TFCliCod, AV27TFCliCod_To, AV29TFCliNom, AV30TFCliNom_Sel, AV32TFForSer, AV33TFForSer_Sel, AV35TFForSerDsc, AV36TFForSerDsc_Sel, AV38TFForColNom, AV39TFForColNom_Sel, AV41TFForColNum, AV42TFForColNum_To, AV44TFTipColCod, AV45TFTipColCod_To, AV47TFTipColDsc, AV48TFTipColDsc_Sel, AV96Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66ProForCod, AV67ProForCoddestino, AV71ProForDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = AV72FilterFullText ;
      AV80Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod = AV26TFCliCod ;
      AV81Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to = AV27TFCliCod_To ;
      AV82Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = AV29TFCliNom ;
      AV83Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel = AV30TFCliNom_Sel ;
      AV84Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = AV32TFForSer ;
      AV85Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel = AV33TFForSer_Sel ;
      AV86Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = AV35TFForSerDsc ;
      AV87Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel = AV36TFForSerDsc_Sel ;
      AV88Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = AV38TFForColNom ;
      AV89Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel = AV39TFForColNom_Sel ;
      AV90Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum = AV41TFForColNum ;
      AV91Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to = AV42TFForColNum_To ;
      AV92Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod = AV44TFTipColCod ;
      AV93Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to = AV45TFTipColCod_To ;
      AV94Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = AV47TFTipColDsc ;
      AV95Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel = AV48TFTipColDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV72FilterFullText, AV70Emprcod, AV54CliCod, AV55CliCod_to, AV56ForColNom, AV57ForColNom_to, AV58ForColNum, AV59ForColNum_to, AV60ForSer, AV61ForSer_to, AV62IntCod, AV63IntCod_to, AV64MatCod, AV65MatCod_to, AV68TipColCod, AV69TipColCod_to, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV26TFCliCod, AV27TFCliCod_To, AV29TFCliNom, AV30TFCliNom_Sel, AV32TFForSer, AV33TFForSer_Sel, AV35TFForSerDsc, AV36TFForSerDsc_Sel, AV38TFForColNom, AV39TFForColNom_Sel, AV41TFForColNum, AV42TFForColNum_To, AV44TFTipColCod, AV45TFTipColCod_To, AV47TFTipColDsc, AV48TFTipColDsc_Sel, AV96Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66ProForCod, AV67ProForCoddestino, AV71ProForDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = AV72FilterFullText ;
      AV80Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod = AV26TFCliCod ;
      AV81Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to = AV27TFCliCod_To ;
      AV82Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = AV29TFCliNom ;
      AV83Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel = AV30TFCliNom_Sel ;
      AV84Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = AV32TFForSer ;
      AV85Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel = AV33TFForSer_Sel ;
      AV86Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = AV35TFForSerDsc ;
      AV87Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel = AV36TFForSerDsc_Sel ;
      AV88Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = AV38TFForColNom ;
      AV89Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel = AV39TFForColNom_Sel ;
      AV90Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum = AV41TFForColNum ;
      AV91Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to = AV42TFForColNum_To ;
      AV92Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod = AV44TFTipColCod ;
      AV93Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to = AV45TFTipColCod_To ;
      AV94Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = AV47TFTipColDsc ;
      AV95Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel = AV48TFTipColDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV72FilterFullText, AV70Emprcod, AV54CliCod, AV55CliCod_to, AV56ForColNom, AV57ForColNom_to, AV58ForColNum, AV59ForColNum_to, AV60ForSer, AV61ForSer_to, AV62IntCod, AV63IntCod_to, AV64MatCod, AV65MatCod_to, AV68TipColCod, AV69TipColCod_to, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV26TFCliCod, AV27TFCliCod_To, AV29TFCliNom, AV30TFCliNom_Sel, AV32TFForSer, AV33TFForSer_Sel, AV35TFForSerDsc, AV36TFForSerDsc_Sel, AV38TFForColNom, AV39TFForColNom_Sel, AV41TFForColNum, AV42TFForColNum_To, AV44TFTipColCod, AV45TFTipColCod_To, AV47TFTipColDsc, AV48TFTipColDsc_Sel, AV96Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66ProForCod, AV67ProForCoddestino, AV71ProForDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = AV72FilterFullText ;
      AV80Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod = AV26TFCliCod ;
      AV81Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to = AV27TFCliCod_To ;
      AV82Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = AV29TFCliNom ;
      AV83Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel = AV30TFCliNom_Sel ;
      AV84Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = AV32TFForSer ;
      AV85Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel = AV33TFForSer_Sel ;
      AV86Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = AV35TFForSerDsc ;
      AV87Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel = AV36TFForSerDsc_Sel ;
      AV88Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = AV38TFForColNom ;
      AV89Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel = AV39TFForColNom_Sel ;
      AV90Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum = AV41TFForColNum ;
      AV91Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to = AV42TFForColNum_To ;
      AV92Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod = AV44TFTipColCod ;
      AV93Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to = AV45TFTipColCod_To ;
      AV94Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = AV47TFTipColDsc ;
      AV95Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel = AV48TFTipColDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV72FilterFullText, AV70Emprcod, AV54CliCod, AV55CliCod_to, AV56ForColNom, AV57ForColNom_to, AV58ForColNum, AV59ForColNum_to, AV60ForSer, AV61ForSer_to, AV62IntCod, AV63IntCod_to, AV64MatCod, AV65MatCod_to, AV68TipColCod, AV69TipColCod_to, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV26TFCliCod, AV27TFCliCod_To, AV29TFCliNom, AV30TFCliNom_Sel, AV32TFForSer, AV33TFForSer_Sel, AV35TFForSerDsc, AV36TFForSerDsc_Sel, AV38TFForColNom, AV39TFForColNom_Sel, AV41TFForColNum, AV42TFForColNum_To, AV44TFTipColCod, AV45TFTipColCod_To, AV47TFTipColDsc, AV48TFTipColDsc_Sel, AV96Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66ProForCod, AV67ProForCoddestino, AV71ProForDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV96Pgmname = "FormulacionTinte.WCSustitucionProcesoColores" ;
      Gx_err = (short)(0) ;
      edtavProforcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavProforcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProforcod_Enabled), 5, 0), true);
      edtavProfordsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavProfordsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProfordsc_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupQL0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19QL2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV22ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV50DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV19ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV52GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV53GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV70Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV70Emprcod") ;
         wcpOAV54CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV54CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV55CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV55CliCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV56ForColNom = httpContext.cgiGet( sPrefix+"wcpOAV56ForColNom") ;
         wcpOAV57ForColNom_to = httpContext.cgiGet( sPrefix+"wcpOAV57ForColNom_to") ;
         wcpOAV58ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV58ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV59ForColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV59ForColNum_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV60ForSer = httpContext.cgiGet( sPrefix+"wcpOAV60ForSer") ;
         wcpOAV61ForSer_to = httpContext.cgiGet( sPrefix+"wcpOAV61ForSer_to") ;
         wcpOAV62IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV62IntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV63IntCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV63IntCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV64MatCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV64MatCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV65MatCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV65MatCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV68TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV68TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV69TipColCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV69TipColCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV66ProForCod = httpContext.cgiGet( sPrefix+"wcpOAV66ProForCod") ;
         wcpOAV67ProForCoddestino = httpContext.cgiGet( sPrefix+"wcpOAV67ProForCoddestino") ;
         wcpOAV71ProForDsc = httpContext.cgiGet( sPrefix+"wcpOAV71ProForDsc") ;
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
         /* Read variables values. */
         AV72FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72FilterFullText", AV72FilterFullText);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV72FilterFullText) != 0 )
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
      e19QL2 ();
      if (returnInSub) return;
   }

   public void e19QL2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV76Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcsustitucionprocesocolores_impl.this.GXt_char1 = GXv_char2[0] ;
      AV76Station = GXt_char1 ;
      GXv_char2[0] = AV70Emprcod ;
      GXv_char3[0] = AV77Emprnom ;
      GXv_char4[0] = AV78Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV76Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcsustitucionprocesocolores_impl.this.AV70Emprcod = GXv_char2[0] ;
      wcsustitucionprocesocolores_impl.this.AV77Emprnom = GXv_char3[0] ;
      wcsustitucionprocesocolores_impl.this.AV78Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Emprcod", AV70Emprcod);
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
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV50DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV50DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e20QL2( )
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
      if ( AV24ManageFiltersExecutionStep == 1 )
      {
         AV24ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24ManageFiltersExecutionStep", GXutil.str( AV24ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV24ManageFiltersExecutionStep == 2 )
      {
         AV24ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24ManageFiltersExecutionStep", GXutil.str( AV24ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV21Session.getValue("FormulacionTinte.WCSustitucionProcesoColoresColumnsSelector"), "") != 0 )
      {
         AV17ColumnsSelectorXML = AV21Session.getValue("FormulacionTinte.WCSustitucionProcesoColoresColumnsSelector") ;
         AV19ColumnsSelector.fromxml(AV17ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtForSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSer_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtForSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSerDsc_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtForColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNom_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtForColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNum_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtTipColCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTipColCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtTipColDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTipColDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColDsc_Visible), 5, 0), !bGXsfl_55_Refreshing);
      AV52GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52GridCurrentPage), 10, 0));
      AV53GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GridPageCount), 10, 0));
      AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = AV72FilterFullText ;
      AV80Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod = AV26TFCliCod ;
      AV81Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to = AV27TFCliCod_To ;
      AV82Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = AV29TFCliNom ;
      AV83Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel = AV30TFCliNom_Sel ;
      AV84Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = AV32TFForSer ;
      AV85Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel = AV33TFForSer_Sel ;
      AV86Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = AV35TFForSerDsc ;
      AV87Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel = AV36TFForSerDsc_Sel ;
      AV88Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = AV38TFForColNom ;
      AV89Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel = AV39TFForColNom_Sel ;
      AV90Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum = AV41TFForColNum ;
      AV91Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to = AV42TFForColNum_To ;
      AV92Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod = AV44TFTipColCod ;
      AV93Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to = AV45TFTipColCod_To ;
      AV94Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = AV47TFTipColDsc ;
      AV95Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel = AV48TFTipColDsc_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ColumnsSelector", AV19ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22ManageFiltersData", AV22ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e13QL2( )
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
         AV51PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV51PageToGo) ;
      }
   }

   public void e14QL2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e15QL2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV12OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         AV13OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV26TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFCliCod), 6, 0));
            AV27TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV29TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFCliNom", AV29TFCliNom);
            AV30TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFCliNom_Sel", AV30TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForSer") == 0 )
         {
            AV32TFForSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFForSer", AV32TFForSer);
            AV33TFForSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFForSer_Sel", AV33TFForSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForSerDsc") == 0 )
         {
            AV35TFForSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFForSerDsc", AV35TFForSerDsc);
            AV36TFForSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFForSerDsc_Sel", AV36TFForSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForColNom") == 0 )
         {
            AV38TFForColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFForColNom", AV38TFForColNom);
            AV39TFForColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFForColNom_Sel", AV39TFForColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForColNum") == 0 )
         {
            AV41TFForColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFForColNum), 6, 0));
            AV42TFForColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFForColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFForColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipColCod") == 0 )
         {
            AV44TFTipColCod = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFTipColCod), 2, 0));
            AV45TFTipColCod_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFTipColCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipColDsc") == 0 )
         {
            AV47TFTipColDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFTipColDsc", AV47TFTipColDsc);
            AV48TFTipColDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFTipColDsc_Sel", AV48TFTipColDsc_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e21QL2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      edtForSerDsc_Link = formatLink("app.tmformulasview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","TabCode"})  ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(55) ;
      }
      sendrow_552( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_55_Refreshing )
      {
         httpContext.doAjaxLoad(55, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e16QL2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV17ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV19ColumnsSelector.fromJSonString(AV17ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.WCSustitucionProcesoColoresColumnsSelector", ((GXutil.strcmp("", AV17ColumnsSelectorXML)==0) ? "" : AV19ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ColumnsSelector", AV19ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22ManageFiltersData", AV22ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e12QL2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.WCSustitucionProcesoColoresFilters")),GXutil.URLEncode(GXutil.rtrim(AV96Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV24ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24ManageFiltersExecutionStep", GXutil.str( AV24ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.WCSustitucionProcesoColoresFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV24ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24ManageFiltersExecutionStep", GXutil.str( AV24ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV23ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "FormulacionTinte.WCSustitucionProcesoColoresFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         wcsustitucionprocesocolores_impl.this.GXt_char1 = GXv_char4[0] ;
         AV23ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV23ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV96Pgmname+"GridState", AV23ManageFiltersXml) ;
            AV10GridState.fromxml(AV23ManageFiltersXml, null, null);
            AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
            AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ColumnsSelector", AV19ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22ManageFiltersData", AV22ManageFiltersData);
   }

   public void e17QL2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV15ExcelFilename ;
      GXv_char3[0] = AV16ErrorMessage ;
      new app.formulaciontinte.wcsustitucionprocesocoloresexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      wcsustitucionprocesocolores_impl.this.AV15ExcelFilename = GXv_char4[0] ;
      wcsustitucionprocesocolores_impl.this.AV16ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV15ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV15ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV16ErrorMessage);
      }
   }

   public void e18QL2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.formulaciontinte.wcsustitucionprocesocoloresexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV19ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliCod", "", "Cliente", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliNom", "", "Nombre Cliente", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForSer", "", "Articulo", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForSerDsc", "", "Descripcion", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForColNom", "", "Color", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForColNum", "", "Numero", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TipColCod", "", "Tc", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TipColDsc", "", "Descripcion", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV18UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.WCSustitucionProcesoColoresColumnsSelector", GXv_char4) ;
      wcsustitucionprocesocolores_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV18UserCustomValue)==0) ) )
      {
         AV20ColumnsSelectorAux.fromxml(AV18UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV19ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV20ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV19ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV22ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "FormulacionTinte.WCSustitucionProcesoColoresFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV22ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV72FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72FilterFullText", AV72FilterFullText);
      AV26TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFCliCod), 6, 0));
      AV27TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFCliCod_To), 6, 0));
      AV29TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFCliNom", AV29TFCliNom);
      AV30TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFCliNom_Sel", AV30TFCliNom_Sel);
      AV32TFForSer = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFForSer", AV32TFForSer);
      AV33TFForSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFForSer_Sel", AV33TFForSer_Sel);
      AV35TFForSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFForSerDsc", AV35TFForSerDsc);
      AV36TFForSerDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFForSerDsc_Sel", AV36TFForSerDsc_Sel);
      AV38TFForColNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFForColNom", AV38TFForColNom);
      AV39TFForColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFForColNom_Sel", AV39TFForColNom_Sel);
      AV41TFForColNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFForColNum), 6, 0));
      AV42TFForColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFForColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFForColNum_To), 6, 0));
      AV44TFTipColCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFTipColCod), 2, 0));
      AV45TFTipColCod_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFTipColCod_To), 2, 0));
      AV47TFTipColDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFTipColDsc", AV47TFTipColDsc);
      AV48TFTipColDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFTipColDsc_Sel", AV48TFTipColDsc_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV21Session.getValue(AV96Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV96Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV21Session.getValue(AV96Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV97GXV1 = 1 ;
      while ( AV97GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV97GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV72FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72FilterFullText", AV72FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV26TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFCliCod), 6, 0));
            AV27TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV29TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFCliNom", AV29TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV30TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFCliNom_Sel", AV30TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV32TFForSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFForSer", AV32TFForSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV33TFForSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFForSer_Sel", AV33TFForSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV35TFForSerDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFForSerDsc", AV35TFForSerDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV36TFForSerDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFForSerDsc_Sel", AV36TFForSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV38TFForColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFForColNom", AV38TFForColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV39TFForColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFForColNom_Sel", AV39TFForColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV41TFForColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFForColNum), 6, 0));
            AV42TFForColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFForColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFForColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV44TFTipColCod = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFTipColCod), 2, 0));
            AV45TFTipColCod_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFTipColCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV47TFTipColDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFTipColDsc", AV47TFTipColDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV48TFTipColDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFTipColDsc_Sel", AV48TFTipColDsc_Sel);
         }
         AV97GXV1 = (int)(AV97GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFCliNom_Sel)==0), AV30TFCliNom_Sel, GXv_char4) ;
      wcsustitucionprocesocolores_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFForSer_Sel)==0), AV33TFForSer_Sel, GXv_char3) ;
      wcsustitucionprocesocolores_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFForSerDsc_Sel)==0), AV36TFForSerDsc_Sel, GXv_char2) ;
      wcsustitucionprocesocolores_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFForColNom_Sel)==0), AV39TFForColNom_Sel, GXv_char15) ;
      wcsustitucionprocesocolores_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFTipColDsc_Sel)==0), AV48TFTipColDsc_Sel, GXv_char17) ;
      wcsustitucionprocesocolores_impl.this.GXt_char16 = GXv_char17[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"|||"+GXt_char16 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFCliNom)==0), AV29TFCliNom, GXv_char17) ;
      wcsustitucionprocesocolores_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFForSer)==0), AV32TFForSer, GXv_char15) ;
      wcsustitucionprocesocolores_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFForSerDsc)==0), AV35TFForSerDsc, GXv_char4) ;
      wcsustitucionprocesocolores_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFForColNom)==0), AV38TFForColNom, GXv_char3) ;
      wcsustitucionprocesocolores_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFTipColDsc)==0), AV47TFTipColDsc, GXv_char2) ;
      wcsustitucionprocesocolores_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV26TFCliCod) ? "" : GXutil.str( AV26TFCliCod, 6, 0))+"|"+GXt_char16+"|"+GXt_char14+"|"+GXt_char13+"|"+GXt_char12+"|"+((0==AV41TFForColNum) ? "" : GXutil.str( AV41TFForColNum, 6, 0))+"|"+((0==AV44TFTipColCod) ? "" : GXutil.str( AV44TFTipColCod, 2, 0))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV27TFCliCod_To) ? "" : GXutil.str( AV27TFCliCod_To, 6, 0))+"|||||"+((0==AV42TFForColNum_To) ? "" : GXutil.str( AV42TFForColNum_To, 6, 0))+"|"+((0==AV45TFTipColCod_To) ? "" : GXutil.str( AV45TFTipColCod_To, 2, 0))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV21Session.getValue(AV96Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV72FilterFullText)==0), (short)(0), AV72FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFCLICOD", "", !((0==AV26TFCliCod)&&(0==AV27TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV26TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV27TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFCLINOM", "", !(GXutil.strcmp("", AV29TFCliNom)==0), (short)(0), AV29TFCliNom, "", !(GXutil.strcmp("", AV30TFCliNom_Sel)==0), AV30TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFFORSER", "", !(GXutil.strcmp("", AV32TFForSer)==0), (short)(0), AV32TFForSer, "", !(GXutil.strcmp("", AV33TFForSer_Sel)==0), AV33TFForSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFFORSERDSC", "", !(GXutil.strcmp("", AV35TFForSerDsc)==0), (short)(0), AV35TFForSerDsc, "", !(GXutil.strcmp("", AV36TFForSerDsc_Sel)==0), AV36TFForSerDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFFORCOLNOM", "", !(GXutil.strcmp("", AV38TFForColNom)==0), (short)(0), AV38TFForColNom, "", !(GXutil.strcmp("", AV39TFForColNom_Sel)==0), AV39TFForColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFFORCOLNUM", "", !((0==AV41TFForColNum)&&(0==AV42TFForColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV41TFForColNum, 6, 0)), GXutil.trim( GXutil.str( AV42TFForColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFTIPCOLCOD", "", !((0==AV44TFTipColCod)&&(0==AV45TFTipColCod_To)), (short)(0), GXutil.trim( GXutil.str( AV44TFTipColCod, 2, 0)), GXutil.trim( GXutil.str( AV45TFTipColCod_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFTIPCOLDSC", "", !(GXutil.strcmp("", AV47TFTipColDsc)==0), (short)(0), AV47TFTipColDsc, "", !(GXutil.strcmp("", AV48TFTipColDsc_Sel)==0), AV48TFTipColDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      if ( ! (GXutil.strcmp("", AV70Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV70Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV54CliCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV54CliCod, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV55CliCod_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV55CliCod_to, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV56ForColNom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNOM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV56ForColNom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV57ForColNom_to)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNOM_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV57ForColNom_to );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV58ForColNum) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNUM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV58ForColNum, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV59ForColNum_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNUM_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV59ForColNum_to, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV60ForSer)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORSER" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV60ForSer );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV61ForSer_to)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORSER_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV61ForSer_to );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV62IntCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INTCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV62IntCod, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV63IntCod_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INTCOD_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV63IntCod_to, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV64MatCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MATCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV64MatCod, 3, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV65MatCod_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MATCOD_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV65MatCod_to, 3, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV68TipColCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPCOLCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV68TipColCod, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV69TipColCod_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPCOLCOD_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV69TipColCod_to, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV66ProForCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PROFORCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV66ProForCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV67ProForCoddestino)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PROFORCODDESTINO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV67ProForCoddestino );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV71ProForDsc)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PROFORDSC" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV71ProForDsc );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV96Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV96Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TMFormulas" );
      AV21Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_37_QL2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV22ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_42_QL2( true) ;
      }
      else
      {
         wb_table2_42_QL2( false) ;
      }
      return  ;
   }

   public void wb_table2_42_QL2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_37_QL2e( true) ;
      }
      else
      {
         wb_table1_37_QL2e( false) ;
      }
   }

   public void wb_table2_42_QL2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'" + sPrefix + "',false,'" + sGXsfl_55_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV72FilterFullText, GXutil.rtrim( localUtil.format( AV72FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_FormulacionTinte\\WCSustitucionProcesoColores.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_42_QL2e( true) ;
      }
      else
      {
         wb_table2_42_QL2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV70Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Emprcod", AV70Emprcod);
      AV54CliCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54CliCod), 6, 0));
      AV55CliCod_to = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55CliCod_to), 6, 0));
      AV56ForColNom = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56ForColNom", AV56ForColNom);
      AV57ForColNom_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57ForColNom_to", AV57ForColNom_to);
      AV58ForColNum = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58ForColNum), 6, 0));
      AV59ForColNum_to = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59ForColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59ForColNum_to), 6, 0));
      AV60ForSer = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60ForSer", AV60ForSer);
      AV61ForSer_to = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61ForSer_to", AV61ForSer_to);
      AV62IntCod = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62IntCod), 2, 0));
      AV63IntCod_to = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63IntCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63IntCod_to), 2, 0));
      AV64MatCod = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64MatCod), 3, 0));
      AV65MatCod_to = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65MatCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65MatCod_to), 3, 0));
      AV68TipColCod = ((Number) GXutil.testNumericType( getParm(obj,13,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TipColCod), 2, 0));
      AV69TipColCod_to = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TipColCod_to), 2, 0));
      AV66ProForCod = (String)getParm(obj,15,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66ProForCod", AV66ProForCod);
      AV67ProForCoddestino = (String)getParm(obj,16,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67ProForCoddestino", AV67ProForCoddestino);
      AV71ProForDsc = (String)getParm(obj,17,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71ProForDsc", AV71ProForDsc);
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
      paQL2( ) ;
      wsQL2( ) ;
      weQL2( ) ;
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
      sCtrlAV70Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV54CliCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV55CliCod_to = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV56ForColNom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV57ForColNom_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV58ForColNum = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV59ForColNum_to = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV60ForSer = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV61ForSer_to = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV62IntCod = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV63IntCod_to = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV64MatCod = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV65MatCod_to = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV68TipColCod = (String)getParm(obj,13,TypeConstants.STRING) ;
      sCtrlAV69TipColCod_to = (String)getParm(obj,14,TypeConstants.STRING) ;
      sCtrlAV66ProForCod = (String)getParm(obj,15,TypeConstants.STRING) ;
      sCtrlAV67ProForCoddestino = (String)getParm(obj,16,TypeConstants.STRING) ;
      sCtrlAV71ProForDsc = (String)getParm(obj,17,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paQL2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "formulaciontinte\\wcsustitucionprocesocolores", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paQL2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV70Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Emprcod", AV70Emprcod);
         AV54CliCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54CliCod), 6, 0));
         AV55CliCod_to = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55CliCod_to), 6, 0));
         AV56ForColNom = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56ForColNom", AV56ForColNom);
         AV57ForColNom_to = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57ForColNom_to", AV57ForColNom_to);
         AV58ForColNum = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58ForColNum), 6, 0));
         AV59ForColNum_to = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59ForColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59ForColNum_to), 6, 0));
         AV60ForSer = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60ForSer", AV60ForSer);
         AV61ForSer_to = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61ForSer_to", AV61ForSer_to);
         AV62IntCod = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62IntCod), 2, 0));
         AV63IntCod_to = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63IntCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63IntCod_to), 2, 0));
         AV64MatCod = ((Number) GXutil.testNumericType( getParm(obj,13,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64MatCod), 3, 0));
         AV65MatCod_to = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65MatCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65MatCod_to), 3, 0));
         AV68TipColCod = ((Number) GXutil.testNumericType( getParm(obj,15,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TipColCod), 2, 0));
         AV69TipColCod_to = ((Number) GXutil.testNumericType( getParm(obj,16,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TipColCod_to), 2, 0));
         AV66ProForCod = (String)getParm(obj,17,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66ProForCod", AV66ProForCod);
         AV67ProForCoddestino = (String)getParm(obj,18,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67ProForCoddestino", AV67ProForCoddestino);
         AV71ProForDsc = (String)getParm(obj,19,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71ProForDsc", AV71ProForDsc);
      }
      wcpOAV70Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV70Emprcod") ;
      wcpOAV54CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV54CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV55CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV55CliCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV56ForColNom = httpContext.cgiGet( sPrefix+"wcpOAV56ForColNom") ;
      wcpOAV57ForColNom_to = httpContext.cgiGet( sPrefix+"wcpOAV57ForColNom_to") ;
      wcpOAV58ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV58ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV59ForColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV59ForColNum_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV60ForSer = httpContext.cgiGet( sPrefix+"wcpOAV60ForSer") ;
      wcpOAV61ForSer_to = httpContext.cgiGet( sPrefix+"wcpOAV61ForSer_to") ;
      wcpOAV62IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV62IntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV63IntCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV63IntCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV64MatCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV64MatCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV65MatCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV65MatCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV68TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV68TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV69TipColCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV69TipColCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV66ProForCod = httpContext.cgiGet( sPrefix+"wcpOAV66ProForCod") ;
      wcpOAV67ProForCoddestino = httpContext.cgiGet( sPrefix+"wcpOAV67ProForCoddestino") ;
      wcpOAV71ProForDsc = httpContext.cgiGet( sPrefix+"wcpOAV71ProForDsc") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV70Emprcod, wcpOAV70Emprcod) != 0 ) || ( AV54CliCod != wcpOAV54CliCod ) || ( AV55CliCod_to != wcpOAV55CliCod_to ) || ( GXutil.strcmp(AV56ForColNom, wcpOAV56ForColNom) != 0 ) || ( GXutil.strcmp(AV57ForColNom_to, wcpOAV57ForColNom_to) != 0 ) || ( AV58ForColNum != wcpOAV58ForColNum ) || ( AV59ForColNum_to != wcpOAV59ForColNum_to ) || ( GXutil.strcmp(AV60ForSer, wcpOAV60ForSer) != 0 ) || ( GXutil.strcmp(AV61ForSer_to, wcpOAV61ForSer_to) != 0 ) || ( AV62IntCod != wcpOAV62IntCod ) || ( AV63IntCod_to != wcpOAV63IntCod_to ) || ( AV64MatCod != wcpOAV64MatCod ) || ( AV65MatCod_to != wcpOAV65MatCod_to ) || ( AV68TipColCod != wcpOAV68TipColCod ) || ( AV69TipColCod_to != wcpOAV69TipColCod_to ) || ( GXutil.strcmp(AV66ProForCod, wcpOAV66ProForCod) != 0 ) || ( GXutil.strcmp(AV67ProForCoddestino, wcpOAV67ProForCoddestino) != 0 ) || ( GXutil.strcmp(AV71ProForDsc, wcpOAV71ProForDsc) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV70Emprcod = AV70Emprcod ;
      wcpOAV54CliCod = AV54CliCod ;
      wcpOAV55CliCod_to = AV55CliCod_to ;
      wcpOAV56ForColNom = AV56ForColNom ;
      wcpOAV57ForColNom_to = AV57ForColNom_to ;
      wcpOAV58ForColNum = AV58ForColNum ;
      wcpOAV59ForColNum_to = AV59ForColNum_to ;
      wcpOAV60ForSer = AV60ForSer ;
      wcpOAV61ForSer_to = AV61ForSer_to ;
      wcpOAV62IntCod = AV62IntCod ;
      wcpOAV63IntCod_to = AV63IntCod_to ;
      wcpOAV64MatCod = AV64MatCod ;
      wcpOAV65MatCod_to = AV65MatCod_to ;
      wcpOAV68TipColCod = AV68TipColCod ;
      wcpOAV69TipColCod_to = AV69TipColCod_to ;
      wcpOAV66ProForCod = AV66ProForCod ;
      wcpOAV67ProForCoddestino = AV67ProForCoddestino ;
      wcpOAV71ProForDsc = AV71ProForDsc ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV70Emprcod = httpContext.cgiGet( sPrefix+"AV70Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV70Emprcod) > 0 )
      {
         AV70Emprcod = httpContext.cgiGet( sCtrlAV70Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Emprcod", AV70Emprcod);
      }
      else
      {
         AV70Emprcod = httpContext.cgiGet( sPrefix+"AV70Emprcod_PARM") ;
      }
      sCtrlAV54CliCod = httpContext.cgiGet( sPrefix+"AV54CliCod_CTRL") ;
      if ( GXutil.len( sCtrlAV54CliCod) > 0 )
      {
         AV54CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV54CliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54CliCod), 6, 0));
      }
      else
      {
         AV54CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV54CliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV55CliCod_to = httpContext.cgiGet( sPrefix+"AV55CliCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV55CliCod_to) > 0 )
      {
         AV55CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV55CliCod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55CliCod_to), 6, 0));
      }
      else
      {
         AV55CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV55CliCod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV56ForColNom = httpContext.cgiGet( sPrefix+"AV56ForColNom_CTRL") ;
      if ( GXutil.len( sCtrlAV56ForColNom) > 0 )
      {
         AV56ForColNom = httpContext.cgiGet( sCtrlAV56ForColNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56ForColNom", AV56ForColNom);
      }
      else
      {
         AV56ForColNom = httpContext.cgiGet( sPrefix+"AV56ForColNom_PARM") ;
      }
      sCtrlAV57ForColNom_to = httpContext.cgiGet( sPrefix+"AV57ForColNom_to_CTRL") ;
      if ( GXutil.len( sCtrlAV57ForColNom_to) > 0 )
      {
         AV57ForColNom_to = httpContext.cgiGet( sCtrlAV57ForColNom_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57ForColNom_to", AV57ForColNom_to);
      }
      else
      {
         AV57ForColNom_to = httpContext.cgiGet( sPrefix+"AV57ForColNom_to_PARM") ;
      }
      sCtrlAV58ForColNum = httpContext.cgiGet( sPrefix+"AV58ForColNum_CTRL") ;
      if ( GXutil.len( sCtrlAV58ForColNum) > 0 )
      {
         AV58ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV58ForColNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58ForColNum), 6, 0));
      }
      else
      {
         AV58ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV58ForColNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV59ForColNum_to = httpContext.cgiGet( sPrefix+"AV59ForColNum_to_CTRL") ;
      if ( GXutil.len( sCtrlAV59ForColNum_to) > 0 )
      {
         AV59ForColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV59ForColNum_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59ForColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59ForColNum_to), 6, 0));
      }
      else
      {
         AV59ForColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV59ForColNum_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV60ForSer = httpContext.cgiGet( sPrefix+"AV60ForSer_CTRL") ;
      if ( GXutil.len( sCtrlAV60ForSer) > 0 )
      {
         AV60ForSer = httpContext.cgiGet( sCtrlAV60ForSer) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60ForSer", AV60ForSer);
      }
      else
      {
         AV60ForSer = httpContext.cgiGet( sPrefix+"AV60ForSer_PARM") ;
      }
      sCtrlAV61ForSer_to = httpContext.cgiGet( sPrefix+"AV61ForSer_to_CTRL") ;
      if ( GXutil.len( sCtrlAV61ForSer_to) > 0 )
      {
         AV61ForSer_to = httpContext.cgiGet( sCtrlAV61ForSer_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61ForSer_to", AV61ForSer_to);
      }
      else
      {
         AV61ForSer_to = httpContext.cgiGet( sPrefix+"AV61ForSer_to_PARM") ;
      }
      sCtrlAV62IntCod = httpContext.cgiGet( sPrefix+"AV62IntCod_CTRL") ;
      if ( GXutil.len( sCtrlAV62IntCod) > 0 )
      {
         AV62IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV62IntCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62IntCod), 2, 0));
      }
      else
      {
         AV62IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV62IntCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV63IntCod_to = httpContext.cgiGet( sPrefix+"AV63IntCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV63IntCod_to) > 0 )
      {
         AV63IntCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV63IntCod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63IntCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63IntCod_to), 2, 0));
      }
      else
      {
         AV63IntCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV63IntCod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV64MatCod = httpContext.cgiGet( sPrefix+"AV64MatCod_CTRL") ;
      if ( GXutil.len( sCtrlAV64MatCod) > 0 )
      {
         AV64MatCod = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV64MatCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64MatCod), 3, 0));
      }
      else
      {
         AV64MatCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV64MatCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV65MatCod_to = httpContext.cgiGet( sPrefix+"AV65MatCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV65MatCod_to) > 0 )
      {
         AV65MatCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV65MatCod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65MatCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65MatCod_to), 3, 0));
      }
      else
      {
         AV65MatCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV65MatCod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV68TipColCod = httpContext.cgiGet( sPrefix+"AV68TipColCod_CTRL") ;
      if ( GXutil.len( sCtrlAV68TipColCod) > 0 )
      {
         AV68TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV68TipColCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TipColCod), 2, 0));
      }
      else
      {
         AV68TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV68TipColCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV69TipColCod_to = httpContext.cgiGet( sPrefix+"AV69TipColCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV69TipColCod_to) > 0 )
      {
         AV69TipColCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV69TipColCod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TipColCod_to), 2, 0));
      }
      else
      {
         AV69TipColCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV69TipColCod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV66ProForCod = httpContext.cgiGet( sPrefix+"AV66ProForCod_CTRL") ;
      if ( GXutil.len( sCtrlAV66ProForCod) > 0 )
      {
         AV66ProForCod = httpContext.cgiGet( sCtrlAV66ProForCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66ProForCod", AV66ProForCod);
      }
      else
      {
         AV66ProForCod = httpContext.cgiGet( sPrefix+"AV66ProForCod_PARM") ;
      }
      sCtrlAV67ProForCoddestino = httpContext.cgiGet( sPrefix+"AV67ProForCoddestino_CTRL") ;
      if ( GXutil.len( sCtrlAV67ProForCoddestino) > 0 )
      {
         AV67ProForCoddestino = httpContext.cgiGet( sCtrlAV67ProForCoddestino) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67ProForCoddestino", AV67ProForCoddestino);
      }
      else
      {
         AV67ProForCoddestino = httpContext.cgiGet( sPrefix+"AV67ProForCoddestino_PARM") ;
      }
      sCtrlAV71ProForDsc = httpContext.cgiGet( sPrefix+"AV71ProForDsc_CTRL") ;
      if ( GXutil.len( sCtrlAV71ProForDsc) > 0 )
      {
         AV71ProForDsc = httpContext.cgiGet( sCtrlAV71ProForDsc) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71ProForDsc", AV71ProForDsc);
      }
      else
      {
         AV71ProForDsc = httpContext.cgiGet( sPrefix+"AV71ProForDsc_PARM") ;
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
      paQL2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsQL2( ) ;
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
      wsQL2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70Emprcod_PARM", GXutil.rtrim( AV70Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV70Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70Emprcod_CTRL", GXutil.rtrim( sCtrlAV70Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54CliCod_PARM", GXutil.ltrim( localUtil.ntoc( AV54CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV54CliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54CliCod_CTRL", GXutil.rtrim( sCtrlAV54CliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV55CliCod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV55CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV55CliCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV55CliCod_to_CTRL", GXutil.rtrim( sCtrlAV55CliCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV56ForColNom_PARM", GXutil.rtrim( AV56ForColNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV56ForColNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV56ForColNom_CTRL", GXutil.rtrim( sCtrlAV56ForColNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57ForColNom_to_PARM", GXutil.rtrim( AV57ForColNom_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV57ForColNom_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57ForColNom_to_CTRL", GXutil.rtrim( sCtrlAV57ForColNom_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58ForColNum_PARM", GXutil.ltrim( localUtil.ntoc( AV58ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV58ForColNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58ForColNum_CTRL", GXutil.rtrim( sCtrlAV58ForColNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59ForColNum_to_PARM", GXutil.ltrim( localUtil.ntoc( AV59ForColNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV59ForColNum_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59ForColNum_to_CTRL", GXutil.rtrim( sCtrlAV59ForColNum_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60ForSer_PARM", GXutil.rtrim( AV60ForSer));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV60ForSer)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60ForSer_CTRL", GXutil.rtrim( sCtrlAV60ForSer));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61ForSer_to_PARM", GXutil.rtrim( AV61ForSer_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV61ForSer_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61ForSer_to_CTRL", GXutil.rtrim( sCtrlAV61ForSer_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62IntCod_PARM", GXutil.ltrim( localUtil.ntoc( AV62IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV62IntCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62IntCod_CTRL", GXutil.rtrim( sCtrlAV62IntCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63IntCod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV63IntCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV63IntCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63IntCod_to_CTRL", GXutil.rtrim( sCtrlAV63IntCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64MatCod_PARM", GXutil.ltrim( localUtil.ntoc( AV64MatCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV64MatCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64MatCod_CTRL", GXutil.rtrim( sCtrlAV64MatCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65MatCod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV65MatCod_to, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV65MatCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65MatCod_to_CTRL", GXutil.rtrim( sCtrlAV65MatCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68TipColCod_PARM", GXutil.ltrim( localUtil.ntoc( AV68TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV68TipColCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68TipColCod_CTRL", GXutil.rtrim( sCtrlAV68TipColCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV69TipColCod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV69TipColCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV69TipColCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV69TipColCod_to_CTRL", GXutil.rtrim( sCtrlAV69TipColCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66ProForCod_PARM", GXutil.rtrim( AV66ProForCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV66ProForCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66ProForCod_CTRL", GXutil.rtrim( sCtrlAV66ProForCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67ProForCoddestino_PARM", GXutil.rtrim( AV67ProForCoddestino));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV67ProForCoddestino)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67ProForCoddestino_CTRL", GXutil.rtrim( sCtrlAV67ProForCoddestino));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71ProForDsc_PARM", GXutil.rtrim( AV71ProForDsc));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV71ProForDsc)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71ProForDsc_CTRL", GXutil.rtrim( sCtrlAV71ProForDsc));
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
      weQL2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211665420", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/wcsustitucionprocesocolores.js", "?20268211665420", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_552( )
   {
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_55_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_55_idx ;
      edtForSer_Internalname = sPrefix+"FORSER_"+sGXsfl_55_idx ;
      edtForSerDsc_Internalname = sPrefix+"FORSERDSC_"+sGXsfl_55_idx ;
      edtForColNom_Internalname = sPrefix+"FORCOLNOM_"+sGXsfl_55_idx ;
      edtForColNum_Internalname = sPrefix+"FORCOLNUM_"+sGXsfl_55_idx ;
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD_"+sGXsfl_55_idx ;
      edtTipColDsc_Internalname = sPrefix+"TIPCOLDSC_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_552( )
   {
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_55_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_55_fel_idx ;
      edtForSer_Internalname = sPrefix+"FORSER_"+sGXsfl_55_fel_idx ;
      edtForSerDsc_Internalname = sPrefix+"FORSERDSC_"+sGXsfl_55_fel_idx ;
      edtForColNom_Internalname = sPrefix+"FORCOLNOM_"+sGXsfl_55_fel_idx ;
      edtForColNum_Internalname = sPrefix+"FORCOLNUM_"+sGXsfl_55_fel_idx ;
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD_"+sGXsfl_55_fel_idx ;
      edtTipColDsc_Internalname = sPrefix+"TIPCOLDSC_"+sGXsfl_55_fel_idx ;
   }

   public void sendrow_552( )
   {
      subsflControlProps_552( ) ;
      wbQL0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_55_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_55_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_55_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForSer_Internalname,GXutil.rtrim( A494ForSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForSerDsc_Internalname,GXutil.rtrim( A5742ForSerDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtForSerDsc_Link,"","","",edtForSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtForSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForColNom_Internalname,GXutil.rtrim( A482ForColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtForColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtTipColCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColCod_Internalname,GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTipColCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipColCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTipColDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColDsc_Internalname,GXutil.rtrim( A832TipColDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTipColDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipColDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesQL2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_55_idx = ((subGrid_Islastpage==1)&&(nGXsfl_55_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_552( ) ;
      }
      /* End function sendrow_552 */
   }

   public void startgridcontrol55( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"55\">") ;
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
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtForSerDsc_Link));
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
      edtavProforcod_Internalname = sPrefix+"vPROFORCOD" ;
      edtavProfordsc_Internalname = sPrefix+"vPROFORDSC" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnexportreport_Internalname = sPrefix+"BTNEXPORTREPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
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
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Innewwindow1_Internalname = sPrefix+"INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
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
      edtTipColDsc_Jsonclick = "" ;
      edtTipColCod_Jsonclick = "" ;
      edtForColNum_Jsonclick = "" ;
      edtForColNom_Jsonclick = "" ;
      edtForSerDsc_Jsonclick = "" ;
      edtForSerDsc_Link = "" ;
      edtForSer_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtTipColDsc_Visible = -1 ;
      edtTipColCod_Visible = -1 ;
      edtForColNum_Visible = -1 ;
      edtForColNom_Visible = -1 ;
      edtForSerDsc_Visible = -1 ;
      edtForSer_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavProfordsc_Jsonclick = "" ;
      edtavProfordsc_Enabled = 0 ;
      edtavProforcod_Jsonclick = "" ;
      edtavProforcod_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "FormulacionTinte.WCSustitucionProcesoColoresGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic|Dynamic|||Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T|T|T|||T" ;
      Ddo_grid_Filterisrange = "T|||||T|T|" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character|Character|Numeric|Numeric|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8" ;
      Ddo_grid_Columnids = "0:CliCod|1:CliNom|2:ForSer|3:ForSerDsc|4:ForColNom|5:ForColNum|6:TipColCod|7:TipColDsc" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV55CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV56ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV57ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV58ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV59ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV60ForSer',fld:'vFORSER',pic:''},{av:'AV61ForSer_to',fld:'vFORSER_TO',pic:''},{av:'AV62IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV63IntCod_to',fld:'vINTCOD_TO',pic:'Z9'},{av:'AV64MatCod',fld:'vMATCOD',pic:'ZZ9'},{av:'AV65MatCod_to',fld:'vMATCOD_TO',pic:'ZZ9'},{av:'AV68TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV69TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV26TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV27TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV29TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV30TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFForSer',fld:'vTFFORSER',pic:''},{av:'AV33TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV35TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV36TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV38TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV39TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV41TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV42TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV45TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV47TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV48TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV96Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV67ProForCoddestino',fld:'vPROFORCODDESTINO',pic:''},{av:'AV71ProForDsc',fld:'vPROFORDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForSerDsc_Visible',ctrl:'FORSERDSC',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtTipColDsc_Visible',ctrl:'TIPCOLDSC',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV22ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e13QL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV55CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV56ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV57ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV58ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV59ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV60ForSer',fld:'vFORSER',pic:''},{av:'AV61ForSer_to',fld:'vFORSER_TO',pic:''},{av:'AV62IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV63IntCod_to',fld:'vINTCOD_TO',pic:'Z9'},{av:'AV64MatCod',fld:'vMATCOD',pic:'ZZ9'},{av:'AV65MatCod_to',fld:'vMATCOD_TO',pic:'ZZ9'},{av:'AV68TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV69TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV27TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV29TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV30TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFForSer',fld:'vTFFORSER',pic:''},{av:'AV33TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV35TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV36TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV38TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV39TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV41TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV42TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV45TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV47TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV48TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV96Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV67ProForCoddestino',fld:'vPROFORCODDESTINO',pic:''},{av:'AV71ProForDsc',fld:'vPROFORDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e14QL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV55CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV56ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV57ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV58ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV59ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV60ForSer',fld:'vFORSER',pic:''},{av:'AV61ForSer_to',fld:'vFORSER_TO',pic:''},{av:'AV62IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV63IntCod_to',fld:'vINTCOD_TO',pic:'Z9'},{av:'AV64MatCod',fld:'vMATCOD',pic:'ZZ9'},{av:'AV65MatCod_to',fld:'vMATCOD_TO',pic:'ZZ9'},{av:'AV68TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV69TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV27TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV29TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV30TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFForSer',fld:'vTFFORSER',pic:''},{av:'AV33TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV35TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV36TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV38TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV39TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV41TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV42TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV45TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV47TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV48TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV96Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV67ProForCoddestino',fld:'vPROFORCODDESTINO',pic:''},{av:'AV71ProForDsc',fld:'vPROFORDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e15QL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV55CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV56ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV57ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV58ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV59ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV60ForSer',fld:'vFORSER',pic:''},{av:'AV61ForSer_to',fld:'vFORSER_TO',pic:''},{av:'AV62IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV63IntCod_to',fld:'vINTCOD_TO',pic:'Z9'},{av:'AV64MatCod',fld:'vMATCOD',pic:'ZZ9'},{av:'AV65MatCod_to',fld:'vMATCOD_TO',pic:'ZZ9'},{av:'AV68TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV69TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV27TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV29TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV30TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFForSer',fld:'vTFFORSER',pic:''},{av:'AV33TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV35TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV36TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV38TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV39TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV41TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV42TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV45TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV47TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV48TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV96Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV67ProForCoddestino',fld:'vPROFORCODDESTINO',pic:''},{av:'AV71ProForDsc',fld:'vPROFORDSC',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV47TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV48TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV44TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV45TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV41TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV42TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV39TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV35TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV36TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV32TFForSer',fld:'vTFFORSER',pic:''},{av:'AV33TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV29TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV30TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV26TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV27TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e21QL2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'edtForSerDsc_Link',ctrl:'FORSERDSC',prop:'Link'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e16QL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV55CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV56ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV57ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV58ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV59ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV60ForSer',fld:'vFORSER',pic:''},{av:'AV61ForSer_to',fld:'vFORSER_TO',pic:''},{av:'AV62IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV63IntCod_to',fld:'vINTCOD_TO',pic:'Z9'},{av:'AV64MatCod',fld:'vMATCOD',pic:'ZZ9'},{av:'AV65MatCod_to',fld:'vMATCOD_TO',pic:'ZZ9'},{av:'AV68TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV69TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV27TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV29TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV30TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFForSer',fld:'vTFFORSER',pic:''},{av:'AV33TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV35TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV36TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV38TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV39TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV41TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV42TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV45TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV47TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV48TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV96Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV67ProForCoddestino',fld:'vPROFORCODDESTINO',pic:''},{av:'AV71ProForDsc',fld:'vPROFORDSC',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForSerDsc_Visible',ctrl:'FORSERDSC',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtTipColDsc_Visible',ctrl:'TIPCOLDSC',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV22ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e12QL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV55CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV56ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV57ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV58ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV59ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV60ForSer',fld:'vFORSER',pic:''},{av:'AV61ForSer_to',fld:'vFORSER_TO',pic:''},{av:'AV62IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV63IntCod_to',fld:'vINTCOD_TO',pic:'Z9'},{av:'AV64MatCod',fld:'vMATCOD',pic:'ZZ9'},{av:'AV65MatCod_to',fld:'vMATCOD_TO',pic:'ZZ9'},{av:'AV68TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV69TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV27TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV29TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV30TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFForSer',fld:'vTFFORSER',pic:''},{av:'AV33TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV35TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV36TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV38TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV39TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV41TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV42TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV45TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV47TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV48TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV96Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV67ProForCoddestino',fld:'vPROFORCODDESTINO',pic:''},{av:'AV71ProForDsc',fld:'vPROFORDSC',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV72FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV27TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV29TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV30TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFForSer',fld:'vTFFORSER',pic:''},{av:'AV33TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV35TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV36TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV38TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV39TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV41TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV42TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV45TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV47TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV48TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForSerDsc_Visible',ctrl:'FORSERDSC',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtTipColDsc_Visible',ctrl:'TIPCOLDSC',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV22ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17QL2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e11QL1',iparms:[]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e18QL2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Tipcoldsc',iparms:[]");
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
      wcpOAV70Emprcod = "" ;
      wcpOAV56ForColNom = "" ;
      wcpOAV57ForColNom_to = "" ;
      wcpOAV60ForSer = "" ;
      wcpOAV61ForSer_to = "" ;
      wcpOAV66ProForCod = "" ;
      wcpOAV67ProForCoddestino = "" ;
      wcpOAV71ProForDsc = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV70Emprcod = "" ;
      AV56ForColNom = "" ;
      AV57ForColNom_to = "" ;
      AV60ForSer = "" ;
      AV61ForSer_to = "" ;
      AV66ProForCod = "" ;
      AV67ProForCoddestino = "" ;
      AV71ProForDsc = "" ;
      AV72FilterFullText = "" ;
      AV19ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV29TFCliNom = "" ;
      AV30TFCliNom_Sel = "" ;
      AV32TFForSer = "" ;
      AV33TFForSer_Sel = "" ;
      AV35TFForSerDsc = "" ;
      AV36TFForSerDsc_Sel = "" ;
      AV38TFForColNom = "" ;
      AV39TFForColNom_Sel = "" ;
      AV47TFTipColDsc = "" ;
      AV48TFTipColDsc_Sel = "" ;
      AV96Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV22ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV50DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
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
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
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
      scmdbuf = "" ;
      lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = "" ;
      lV82Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = "" ;
      lV84Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = "" ;
      lV86Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = "" ;
      lV88Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = "" ;
      lV94Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = "" ;
      AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = "" ;
      AV83Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel = "" ;
      AV82Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = "" ;
      AV85Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel = "" ;
      AV84Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = "" ;
      AV87Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel = "" ;
      AV86Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = "" ;
      AV89Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel = "" ;
      AV88Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = "" ;
      AV95Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel = "" ;
      AV94Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = "" ;
      H00QL2_A626MatCod = new short[1] ;
      H00QL2_A583IntCod = new byte[1] ;
      H00QL2_A396EmprCod = new String[] {""} ;
      H00QL2_A832TipColDsc = new String[] {""} ;
      H00QL2_n832TipColDsc = new boolean[] {false} ;
      H00QL2_A831TipColCod = new byte[1] ;
      H00QL2_A483ForColNum = new int[1] ;
      H00QL2_A482ForColNom = new String[] {""} ;
      H00QL2_A5742ForSerDsc = new String[] {""} ;
      H00QL2_n5742ForSerDsc = new boolean[] {false} ;
      H00QL2_A494ForSer = new String[] {""} ;
      H00QL2_A279CliNom = new String[] {""} ;
      H00QL2_A252CliCod = new int[1] ;
      H00QL3_AGRID_nRecordCount = new long[1] ;
      AV76Station = "" ;
      AV77Emprnom = "" ;
      AV78Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV21Session = httpContext.getWebSession();
      AV17ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV23ManageFiltersXml = "" ;
      AV15ExcelFilename = "" ;
      AV16ErrorMessage = "" ;
      AV18UserCustomValue = "" ;
      AV20ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char16 = "" ;
      GXv_char17 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState18 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV70Emprcod = "" ;
      sCtrlAV54CliCod = "" ;
      sCtrlAV55CliCod_to = "" ;
      sCtrlAV56ForColNom = "" ;
      sCtrlAV57ForColNom_to = "" ;
      sCtrlAV58ForColNum = "" ;
      sCtrlAV59ForColNum_to = "" ;
      sCtrlAV60ForSer = "" ;
      sCtrlAV61ForSer_to = "" ;
      sCtrlAV62IntCod = "" ;
      sCtrlAV63IntCod_to = "" ;
      sCtrlAV64MatCod = "" ;
      sCtrlAV65MatCod_to = "" ;
      sCtrlAV68TipColCod = "" ;
      sCtrlAV69TipColCod_to = "" ;
      sCtrlAV66ProForCod = "" ;
      sCtrlAV67ProForCoddestino = "" ;
      sCtrlAV71ProForDsc = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.wcsustitucionprocesocolores__default(),
         new Object[] {
             new Object[] {
            H00QL2_A626MatCod, H00QL2_A583IntCod, H00QL2_A396EmprCod, H00QL2_A832TipColDsc, H00QL2_n832TipColDsc, H00QL2_A831TipColCod, H00QL2_A483ForColNum, H00QL2_A482ForColNom, H00QL2_A5742ForSerDsc, H00QL2_n5742ForSerDsc,
            H00QL2_A494ForSer, H00QL2_A279CliNom, H00QL2_A252CliCod
            }
            , new Object[] {
            H00QL3_AGRID_nRecordCount
            }
         }
      );
      AV96Pgmname = "FormulacionTinte.WCSustitucionProcesoColores" ;
      /* GeneXus formulas. */
      AV96Pgmname = "FormulacionTinte.WCSustitucionProcesoColores" ;
      Gx_err = (short)(0) ;
      edtavProforcod_Enabled = 0 ;
      edtavProfordsc_Enabled = 0 ;
   }

   private byte wcpOAV62IntCod ;
   private byte wcpOAV63IntCod_to ;
   private byte wcpOAV68TipColCod ;
   private byte wcpOAV69TipColCod_to ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV62IntCod ;
   private byte AV63IntCod_to ;
   private byte AV68TipColCod ;
   private byte AV69TipColCod_to ;
   private byte AV24ManageFiltersExecutionStep ;
   private byte AV44TFTipColCod ;
   private byte AV45TFTipColCod_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A831TipColCod ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV92Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod ;
   private byte AV93Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to ;
   private byte A583IntCod ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV64MatCod ;
   private short wcpOAV65MatCod_to ;
   private short AV64MatCod ;
   private short AV65MatCod_to ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A626MatCod ;
   private int wcpOAV54CliCod ;
   private int wcpOAV55CliCod_to ;
   private int wcpOAV58ForColNum ;
   private int wcpOAV59ForColNum_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_55 ;
   private int AV54CliCod ;
   private int AV55CliCod_to ;
   private int AV58ForColNum ;
   private int AV59ForColNum_to ;
   private int nGXsfl_55_idx=1 ;
   private int AV26TFCliCod ;
   private int AV27TFCliCod_To ;
   private int AV41TFForColNum ;
   private int AV42TFForColNum_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavProforcod_Enabled ;
   private int edtavProfordsc_Enabled ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV80Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod ;
   private int AV81Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to ;
   private int AV90Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum ;
   private int AV91Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtForSer_Visible ;
   private int edtForSerDsc_Visible ;
   private int edtForColNom_Visible ;
   private int edtForColNum_Visible ;
   private int edtTipColCod_Visible ;
   private int edtTipColDsc_Visible ;
   private int AV51PageToGo ;
   private int AV97GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV52GridCurrentPage ;
   private long AV53GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV70Emprcod ;
   private String wcpOAV56ForColNom ;
   private String wcpOAV57ForColNom_to ;
   private String wcpOAV60ForSer ;
   private String wcpOAV61ForSer_to ;
   private String wcpOAV66ProForCod ;
   private String wcpOAV67ProForCoddestino ;
   private String wcpOAV71ProForDsc ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV70Emprcod ;
   private String AV56ForColNom ;
   private String AV57ForColNom_to ;
   private String AV60ForSer ;
   private String AV61ForSer_to ;
   private String AV66ProForCod ;
   private String AV67ProForCoddestino ;
   private String AV71ProForDsc ;
   private String sGXsfl_55_idx="0001" ;
   private String AV29TFCliNom ;
   private String AV30TFCliNom_Sel ;
   private String AV32TFForSer ;
   private String AV33TFForSer_Sel ;
   private String AV35TFForSerDsc ;
   private String AV36TFForSerDsc_Sel ;
   private String AV38TFForColNom ;
   private String AV39TFForColNom_Sel ;
   private String AV47TFTipColDsc ;
   private String AV48TFTipColDsc_Sel ;
   private String AV96Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
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
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavProforcod_Internalname ;
   private String edtavProforcod_Jsonclick ;
   private String edtavProfordsc_Internalname ;
   private String edtavProfordsc_Jsonclick ;
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
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
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
   private String scmdbuf ;
   private String lV82Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom ;
   private String lV84Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser ;
   private String lV86Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc ;
   private String lV88Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom ;
   private String lV94Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc ;
   private String AV83Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel ;
   private String AV82Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom ;
   private String AV85Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel ;
   private String AV84Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser ;
   private String AV87Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel ;
   private String AV86Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc ;
   private String AV89Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel ;
   private String AV88Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom ;
   private String AV95Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel ;
   private String AV94Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc ;
   private String AV76Station ;
   private String AV77Emprnom ;
   private String AV78Usurcod ;
   private String edtForSerDsc_Link ;
   private String GXt_char16 ;
   private String GXv_char17[] ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV70Emprcod ;
   private String sCtrlAV54CliCod ;
   private String sCtrlAV55CliCod_to ;
   private String sCtrlAV56ForColNom ;
   private String sCtrlAV57ForColNom_to ;
   private String sCtrlAV58ForColNum ;
   private String sCtrlAV59ForColNum_to ;
   private String sCtrlAV60ForSer ;
   private String sCtrlAV61ForSer_to ;
   private String sCtrlAV62IntCod ;
   private String sCtrlAV63IntCod_to ;
   private String sCtrlAV64MatCod ;
   private String sCtrlAV65MatCod_to ;
   private String sCtrlAV68TipColCod ;
   private String sCtrlAV69TipColCod_to ;
   private String sCtrlAV66ProForCod ;
   private String sCtrlAV67ProForCoddestino ;
   private String sCtrlAV71ProForDsc ;
   private String sGXsfl_55_fel_idx="0001" ;
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
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
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
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV17ColumnsSelectorXML ;
   private String AV23ManageFiltersXml ;
   private String AV18UserCustomValue ;
   private String AV72FilterFullText ;
   private String lV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext ;
   private String AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext ;
   private String AV15ExcelFilename ;
   private String AV16ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private short[] H00QL2_A626MatCod ;
   private byte[] H00QL2_A583IntCod ;
   private String[] H00QL2_A396EmprCod ;
   private String[] H00QL2_A832TipColDsc ;
   private boolean[] H00QL2_n832TipColDsc ;
   private byte[] H00QL2_A831TipColCod ;
   private int[] H00QL2_A483ForColNum ;
   private String[] H00QL2_A482ForColNom ;
   private String[] H00QL2_A5742ForSerDsc ;
   private boolean[] H00QL2_n5742ForSerDsc ;
   private String[] H00QL2_A494ForSer ;
   private String[] H00QL2_A279CliNom ;
   private int[] H00QL2_A252CliCod ;
   private long[] H00QL3_AGRID_nRecordCount ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV22ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV50DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState18[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class wcsustitucionprocesocolores__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00QL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext ,
                                          int AV80Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod ,
                                          int AV81Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to ,
                                          String AV83Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel ,
                                          String AV82Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom ,
                                          String AV85Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel ,
                                          String AV84Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser ,
                                          String AV87Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel ,
                                          String AV86Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc ,
                                          String AV89Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel ,
                                          String AV88Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom ,
                                          int AV90Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum ,
                                          int AV91Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to ,
                                          byte AV92Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod ,
                                          byte AV93Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to ,
                                          String AV95Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel ,
                                          String AV94Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc ,
                                          int AV54CliCod ,
                                          int AV55CliCod_to ,
                                          String AV56ForColNom ,
                                          String AV57ForColNom_to ,
                                          int AV58ForColNum ,
                                          int AV59ForColNum_to ,
                                          String AV60ForSer ,
                                          String AV61ForSer_to ,
                                          byte AV62IntCod ,
                                          byte AV63IntCod_to ,
                                          short AV64MatCod ,
                                          short AV65MatCod_to ,
                                          byte AV68TipColCod ,
                                          byte AV69TipColCod_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          byte A583IntCod ,
                                          short A626MatCod ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV70Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[44];
      Object[] GXv_Object20 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.MatCod, T1.IntCod, T1.EmprCod, T2.TipColDsc, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T3.CliNom, T1.CliCod" ;
      sFromString = " FROM ((TXPCFORMU T1 INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod" ;
      sFromString += " = T1.CliCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int19[1] = (byte)(1) ;
         GXv_int19[2] = (byte)(1) ;
         GXv_int19[3] = (byte)(1) ;
         GXv_int19[4] = (byte)(1) ;
         GXv_int19[5] = (byte)(1) ;
         GXv_int19[6] = (byte)(1) ;
         GXv_int19[7] = (byte)(1) ;
         GXv_int19[8] = (byte)(1) ;
      }
      if ( ! (0==AV80Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( ! (0==AV81Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV82Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV88Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! (0==AV90Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( ! (0==AV91Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( ! (0==AV92Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV94Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int19[24] = (byte)(1) ;
      }
      if ( ! (0==AV54CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int19[25] = (byte)(1) ;
      }
      if ( ! (0==AV55CliCod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int19[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int19[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57ForColNom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int19[28] = (byte)(1) ;
      }
      if ( ! (0==AV58ForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int19[29] = (byte)(1) ;
      }
      if ( ! (0==AV59ForColNum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int19[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60ForSer)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int19[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61ForSer_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int19[32] = (byte)(1) ;
      }
      if ( ! (0==AV62IntCod) )
      {
         addWhere(sWhereString, "(T1.IntCod >= ?)");
      }
      else
      {
         GXv_int19[33] = (byte)(1) ;
      }
      if ( ! (0==AV63IntCod_to) )
      {
         addWhere(sWhereString, "(T1.IntCod <= ?)");
      }
      else
      {
         GXv_int19[34] = (byte)(1) ;
      }
      if ( ! (0==AV64MatCod) )
      {
         addWhere(sWhereString, "(T1.MatCod >= ?)");
      }
      else
      {
         GXv_int19[35] = (byte)(1) ;
      }
      if ( ! (0==AV65MatCod_to) )
      {
         addWhere(sWhereString, "(T1.MatCod <= ?)");
      }
      else
      {
         GXv_int19[36] = (byte)(1) ;
      }
      if ( ! (0==AV68TipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int19[37] = (byte)(1) ;
      }
      if ( ! (0==AV69TipColCod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int19[38] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForSer" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForSerDsc" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForSerDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForColNom" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForColNum" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.TipColDsc" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.TipColDsc DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_H00QL3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext ,
                                          int AV80Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod ,
                                          int AV81Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to ,
                                          String AV83Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel ,
                                          String AV82Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom ,
                                          String AV85Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel ,
                                          String AV84Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser ,
                                          String AV87Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel ,
                                          String AV86Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc ,
                                          String AV89Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel ,
                                          String AV88Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom ,
                                          int AV90Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum ,
                                          int AV91Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to ,
                                          byte AV92Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod ,
                                          byte AV93Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to ,
                                          String AV95Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel ,
                                          String AV94Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc ,
                                          int AV54CliCod ,
                                          int AV55CliCod_to ,
                                          String AV56ForColNom ,
                                          String AV57ForColNom_to ,
                                          int AV58ForColNum ,
                                          int AV59ForColNum_to ,
                                          String AV60ForSer ,
                                          String AV61ForSer_to ,
                                          byte AV62IntCod ,
                                          byte AV63IntCod_to ,
                                          short AV64MatCod ,
                                          short AV65MatCod_to ,
                                          byte AV68TipColCod ,
                                          byte AV69TipColCod_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          byte A583IntCod ,
                                          short A626MatCod ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV70Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[39];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPCFORMU T1 INNER JOIN TXPTIPCOL T3 ON T3.EmprCod = T1.EmprCod AND T3.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV79Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T3.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int21[1] = (byte)(1) ;
         GXv_int21[2] = (byte)(1) ;
         GXv_int21[3] = (byte)(1) ;
         GXv_int21[4] = (byte)(1) ;
         GXv_int21[5] = (byte)(1) ;
         GXv_int21[6] = (byte)(1) ;
         GXv_int21[7] = (byte)(1) ;
         GXv_int21[8] = (byte)(1) ;
      }
      if ( ! (0==AV80Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int21[9] = (byte)(1) ;
      }
      if ( ! (0==AV81Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int21[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV82Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int21[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int21[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int21[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV88Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( ! (0==AV90Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( ! (0==AV91Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( ! (0==AV92Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int21[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV94Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipColDsc = ?)");
      }
      else
      {
         GXv_int21[24] = (byte)(1) ;
      }
      if ( ! (0==AV54CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int21[25] = (byte)(1) ;
      }
      if ( ! (0==AV55CliCod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int21[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int21[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57ForColNom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int21[28] = (byte)(1) ;
      }
      if ( ! (0==AV58ForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int21[29] = (byte)(1) ;
      }
      if ( ! (0==AV59ForColNum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int21[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60ForSer)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int21[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61ForSer_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int21[32] = (byte)(1) ;
      }
      if ( ! (0==AV62IntCod) )
      {
         addWhere(sWhereString, "(T1.IntCod >= ?)");
      }
      else
      {
         GXv_int21[33] = (byte)(1) ;
      }
      if ( ! (0==AV63IntCod_to) )
      {
         addWhere(sWhereString, "(T1.IntCod <= ?)");
      }
      else
      {
         GXv_int21[34] = (byte)(1) ;
      }
      if ( ! (0==AV64MatCod) )
      {
         addWhere(sWhereString, "(T1.MatCod >= ?)");
      }
      else
      {
         GXv_int21[35] = (byte)(1) ;
      }
      if ( ! (0==AV65MatCod_to) )
      {
         addWhere(sWhereString, "(T1.MatCod <= ?)");
      }
      else
      {
         GXv_int21[36] = (byte)(1) ;
      }
      if ( ! (0==AV68TipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int21[37] = (byte)(1) ;
      }
      if ( ! (0==AV69TipColCod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int21[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
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
                  return conditional_H00QL2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Boolean) dynConstraints[42]).booleanValue() , (String)dynConstraints[43] , (String)dynConstraints[44] );
            case 1 :
                  return conditional_H00QL3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Boolean) dynConstraints[42]).booleanValue() , (String)dynConstraints[43] , (String)dynConstraints[44] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00QL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00QL3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((int[]) buf[12])[0] = rslt.getInt(11);
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
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[79]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[72]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               return;
      }
   }

}

