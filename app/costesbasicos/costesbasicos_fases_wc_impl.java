package app.costesbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class costesbasicos_fases_wc_impl extends GXWebComponent
{
   public costesbasicos_fases_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public costesbasicos_fases_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( costesbasicos_fases_wc_impl.class ));
   }

   public costesbasicos_fases_wc_impl( int remoteHandle ,
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
               AV30EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30EmprCod", AV30EmprCod);
               AV34Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Barcod), 8, 0));
               AV35Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Barcodreo", GXutil.str( AV35Barcodreo, 1, 0));
               AV36Barcodpar = httpContext.GetPar( "Barcodpar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Barcodpar", AV36Barcodpar);
               AV46clicod = (int)(GXutil.lval( httpContext.GetPar( "clicod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46clicod), 6, 0));
               AV47Clinom = httpContext.GetPar( "Clinom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Clinom", AV47Clinom);
               AV48barser = httpContext.GetPar( "barser") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48barser", AV48barser);
               AV49barserdsc = httpContext.GetPar( "barserdsc") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49barserdsc", AV49barserdsc);
               AV50barcolnom = httpContext.GetPar( "barcolnom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50barcolnom", AV50barcolnom);
               AV51Barcolnum = (int)(GXutil.lval( httpContext.GetPar( "Barcolnum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51Barcolnum), 6, 0));
               AV40BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40BarKgm", GXutil.ltrimstr( AV40BarKgm, 9, 2));
               AV42BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42BarMtr", GXutil.ltrimstr( AV42BarMtr, 9, 2));
               AV43costefab2 = CommonUtil.decimalVal( httpContext.GetPar( "costefab2"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43costefab2", GXutil.ltrimstr( AV43costefab2, 10, 2));
               AV52mAgua = CommonUtil.decimalVal( httpContext.GetPar( "mAgua"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52mAgua", GXutil.ltrimstr( AV52mAgua, 12, 2));
               AV53menergia = CommonUtil.decimalVal( httpContext.GetPar( "menergia"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53menergia", GXutil.ltrimstr( AV53menergia, 12, 2));
               AV54mgas = CommonUtil.decimalVal( httpContext.GetPar( "mgas"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54mgas", GXutil.ltrimstr( AV54mgas, 12, 2));
               AV55mmod = CommonUtil.decimalVal( httpContext.GetPar( "mmod"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55mmod", GXutil.ltrimstr( AV55mmod, 12, 2));
               AV56mmoi = CommonUtil.decimalVal( httpContext.GetPar( "mmoi"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56mmoi", GXutil.ltrimstr( AV56mmoi, 12, 2));
               AV57madc = CommonUtil.decimalVal( httpContext.GetPar( "madc"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57madc", GXutil.ltrimstr( AV57madc, 12, 2));
               AV58mam = CommonUtil.decimalVal( httpContext.GetPar( "mam"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58mam", GXutil.ltrimstr( AV58mam, 12, 2));
               AV59mgi = CommonUtil.decimalVal( httpContext.GetPar( "mgi"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59mgi", GXutil.ltrimstr( AV59mgi, 12, 2));
               AV60costeoperario1 = CommonUtil.decimalVal( httpContext.GetPar( "costeoperario1"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60costeoperario1", GXutil.ltrimstr( AV60costeoperario1, 10, 2));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV30EmprCod,Integer.valueOf(AV34Barcod),Byte.valueOf(AV35Barcodreo),AV36Barcodpar,Integer.valueOf(AV46clicod),AV47Clinom,AV48barser,AV49barserdsc,AV50barcolnom,Integer.valueOf(AV51Barcolnum),AV40BarKgm,AV42BarMtr,AV43costefab2,AV52mAgua,AV53menergia,AV54mgas,AV55mmod,AV56mmoi,AV57madc,AV58mam,AV59mgi,AV60costeoperario1});
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
      nRC_GXsfl_43 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_43"))) ;
      nGXsfl_43_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_43_idx"))) ;
      sGXsfl_43_idx = httpContext.GetPar( "sGXsfl_43_idx") ;
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
      AV23ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV18ColumnsSelector);
      AV92Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV30EmprCod = httpContext.GetPar( "EmprCod") ;
      AV34Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
      AV35Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
      AV36Barcodpar = httpContext.GetPar( "Barcodpar") ;
      AV46clicod = (int)(GXutil.lval( httpContext.GetPar( "clicod"))) ;
      AV47Clinom = httpContext.GetPar( "Clinom") ;
      AV48barser = httpContext.GetPar( "barser") ;
      AV49barserdsc = httpContext.GetPar( "barserdsc") ;
      AV50barcolnom = httpContext.GetPar( "barcolnom") ;
      AV51Barcolnum = (int)(GXutil.lval( httpContext.GetPar( "Barcolnum"))) ;
      AV40BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
      AV42BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
      AV43costefab2 = CommonUtil.decimalVal( httpContext.GetPar( "costefab2"), ".") ;
      AV52mAgua = CommonUtil.decimalVal( httpContext.GetPar( "mAgua"), ".") ;
      AV53menergia = CommonUtil.decimalVal( httpContext.GetPar( "menergia"), ".") ;
      AV54mgas = CommonUtil.decimalVal( httpContext.GetPar( "mgas"), ".") ;
      AV55mmod = CommonUtil.decimalVal( httpContext.GetPar( "mmod"), ".") ;
      AV56mmoi = CommonUtil.decimalVal( httpContext.GetPar( "mmoi"), ".") ;
      AV57madc = CommonUtil.decimalVal( httpContext.GetPar( "madc"), ".") ;
      AV58mam = CommonUtil.decimalVal( httpContext.GetPar( "mam"), ".") ;
      AV59mgi = CommonUtil.decimalVal( httpContext.GetPar( "mgi"), ".") ;
      AV60costeoperario1 = CommonUtil.decimalVal( httpContext.GetPar( "costeoperario1"), ".") ;
      AV31TasasEstandar = (short)(GXutil.lval( httpContext.GetPar( "TasasEstandar"))) ;
      AV33Station = httpContext.GetPar( "Station") ;
      AV61reoperados = (byte)(GXutil.lval( httpContext.GetPar( "reoperados"))) ;
      AV37CostesBasicos_Fases_SDTjson = httpContext.GetPar( "CostesBasicos_Fases_SDTjson") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV92Pgmname, AV12FilterFullText, AV30EmprCod, AV34Barcod, AV35Barcodreo, AV36Barcodpar, AV46clicod, AV47Clinom, AV48barser, AV49barserdsc, AV50barcolnom, AV51Barcolnum, AV40BarKgm, AV42BarMtr, AV43costefab2, AV52mAgua, AV53menergia, AV54mgas, AV55mmod, AV56mmoi, AV57madc, AV58mam, AV59mgi, AV60costeoperario1, AV31TasasEstandar, AV33Station, AV61reoperados, AV37CostesBasicos_Fases_SDTjson, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2DD2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Costes Basicos (Fases)", "")) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.costesbasicos.costesbasicos_fases_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV30EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV34Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV35Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV36Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV46clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV47Clinom)),GXutil.URLEncode(GXutil.rtrim(AV48barser)),GXutil.URLEncode(GXutil.rtrim(AV49barserdsc)),GXutil.URLEncode(GXutil.rtrim(AV50barcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV51Barcolnum,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV40BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV42BarMtr)),GXutil.URLEncode(DecimalUtil.decToString(AV43costefab2)),GXutil.URLEncode(DecimalUtil.decToString(AV52mAgua)),GXutil.URLEncode(DecimalUtil.decToString(AV53menergia)),GXutil.URLEncode(DecimalUtil.decToString(AV54mgas)),GXutil.URLEncode(DecimalUtil.decToString(AV55mmod)),GXutil.URLEncode(DecimalUtil.decToString(AV56mmoi)),GXutil.URLEncode(DecimalUtil.decToString(AV57madc)),GXutil.URLEncode(DecimalUtil.decToString(AV58mam)),GXutil.URLEncode(DecimalUtil.decToString(AV59mgi)),GXutil.URLEncode(DecimalUtil.decToString(AV60costeoperario1))}, new String[] {"EmprCod","Barcod","Barcodreo","Barcodpar","clicod","Clinom","barser","barserdsc","barcolnom","Barcolnum","BarKgm","BarMtr","costefab2","mAgua","menergia","mgas","mmod","mmoi","madc","mam","mgi","costeoperario1"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTASASESTANDAR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV31TasasEstandar), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV33Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vREOPERADOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV61reoperados), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTESBASICOS_FASES_SDTJSON", getSecureSignedToken( sPrefix, AV37CostesBasicos_Fases_SDTjson));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"CostesBasicos_Fases_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV92Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("costesbasicos\\costesbasicos_fases_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Costesbasicos_fases_sdt", AV13CostesBasicos_Fases_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Costesbasicos_fases_sdt", AV13CostesBasicos_Fases_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_43, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV21ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV21ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV26GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV27GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV24DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV24DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV18ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV18ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30EmprCod", GXutil.rtrim( wcpOAV30EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34Barcod", GXutil.ltrim( localUtil.ntoc( wcpOAV34Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV35Barcodreo", GXutil.ltrim( localUtil.ntoc( wcpOAV35Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV36Barcodpar", GXutil.rtrim( wcpOAV36Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV46clicod", GXutil.ltrim( localUtil.ntoc( wcpOAV46clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV47Clinom", GXutil.rtrim( wcpOAV47Clinom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV48barser", GXutil.rtrim( wcpOAV48barser));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV49barserdsc", GXutil.rtrim( wcpOAV49barserdsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV50barcolnom", GXutil.rtrim( wcpOAV50barcolnom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV51Barcolnum", GXutil.ltrim( localUtil.ntoc( wcpOAV51Barcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV40BarKgm", GXutil.ltrim( localUtil.ntoc( wcpOAV40BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV42BarMtr", GXutil.ltrim( localUtil.ntoc( wcpOAV42BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV43costefab2", GXutil.ltrim( localUtil.ntoc( wcpOAV43costefab2, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV52mAgua", GXutil.ltrim( localUtil.ntoc( wcpOAV52mAgua, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV53menergia", GXutil.ltrim( localUtil.ntoc( wcpOAV53menergia, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV54mgas", GXutil.ltrim( localUtil.ntoc( wcpOAV54mgas, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV55mmod", GXutil.ltrim( localUtil.ntoc( wcpOAV55mmod, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV56mmoi", GXutil.ltrim( localUtil.ntoc( wcpOAV56mmoi, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV57madc", GXutil.ltrim( localUtil.ntoc( wcpOAV57madc, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV58mam", GXutil.ltrim( localUtil.ntoc( wcpOAV58mam, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV59mgi", GXutil.ltrim( localUtil.ntoc( wcpOAV59mgi, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV60costeoperario1", GXutil.ltrim( localUtil.ntoc( wcpOAV60costeoperario1, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV23ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV30EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV34Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV35Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV36Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV46clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLINOM", GXutil.rtrim( AV47Clinom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSER", GXutil.rtrim( AV48barser));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSERDSC", GXutil.rtrim( AV49barserdsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOM", GXutil.rtrim( AV50barcolnom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV51Barcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARKGM", GXutil.ltrim( localUtil.ntoc( AV40BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARMTR", GXutil.ltrim( localUtil.ntoc( AV42BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOSTEFAB2", GXutil.ltrim( localUtil.ntoc( AV43costefab2, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAGUA", GXutil.ltrim( localUtil.ntoc( AV52mAgua, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMENERGIA", GXutil.ltrim( localUtil.ntoc( AV53menergia, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMGAS", GXutil.ltrim( localUtil.ntoc( AV54mgas, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMMOD", GXutil.ltrim( localUtil.ntoc( AV55mmod, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMMOI", GXutil.ltrim( localUtil.ntoc( AV56mmoi, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMADC", GXutil.ltrim( localUtil.ntoc( AV57madc, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAM", GXutil.ltrim( localUtil.ntoc( AV58mam, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMGI", GXutil.ltrim( localUtil.ntoc( AV59mgi, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOSTEOPERARIO1", GXutil.ltrim( localUtil.ntoc( AV60costeoperario1, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTASASESTANDAR", GXutil.ltrim( localUtil.ntoc( AV31TasasEstandar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTASASESTANDAR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV31TasasEstandar), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV33Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV33Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vREOPERADOS", GXutil.ltrim( localUtil.ntoc( AV61reoperados, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vREOPERADOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV61reoperados), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOSTESBASICOS_FASES_SDTJSON", AV37CostesBasicos_Fases_SDTjson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTESBASICOS_FASES_SDTJSON", getSecureSignedToken( sPrefix, AV37CostesBasicos_Fases_SDTjson));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOSTESBASICOS_FASES_SDT", AV13CostesBasicos_Fases_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOSTESBASICOS_FASES_SDT", AV13CostesBasicos_Fases_SDT);
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm2DD2( )
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
      return "CostesBasicos.CostesBasicos_Fases_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Costes Basicos (Fases)", "") ;
   }

   public void wb2DD0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.costesbasicos.costesbasicos_fases_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesBasicos\\CostesBasicos_Fases_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesBasicos\\CostesBasicos_Fases_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnficha_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "Excel (Ficha)", ""), bttBtnficha_Jsonclick, 5, httpContext.getMessage( "Excel (Ficha)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOFICHA\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesBasicos\\CostesBasicos_Fases_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesBasicos\\CostesBasicos_Fases_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_2DD2( true) ;
      }
      else
      {
         wb_table1_25_2DD2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_2DD2e( boolean wbgen )
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
         startgridcontrol43( ) ;
      }
      if ( wbEnd == 43 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_43 = (int)(nGXsfl_43_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV64GXV1 = nGXsfl_43_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV26GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV27GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV92Pgmname), GXutil.rtrim( localUtil.format( AV92Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CostesBasicos\\CostesBasicos_Fases_WC.htm");
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
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV24DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV24DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV18ColumnsSelector);
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
      if ( wbEnd == 43 )
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
               AV64GXV1 = nGXsfl_43_idx ;
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

   public void start2DD2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Costes Basicos (Fases)", ""), (short)(0)) ;
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
            strup2DD0( ) ;
         }
      }
   }

   public void ws2DD2( )
   {
      start2DD2( ) ;
      evt2DD2( ) ;
   }

   public void evt2DD2( )
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
                              strup2DD0( ) ;
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
                              strup2DD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e112DD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e122DD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e132DD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e142DD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOFICHA'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoFicha' */
                                 e152DD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e162DD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e172DD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DD0( ) ;
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
                              strup2DD0( ) ;
                           }
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           AV64GXV1 = (int)(nGXsfl_43_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV13CostesBasicos_Fases_SDT.size() >= AV64GXV1 ) && ( AV64GXV1 > 0 ) )
                           {
                              AV13CostesBasicos_Fases_SDT.currentItem( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)) );
                           }
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
                                       e182DD2 ();
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
                                       e192DD2 ();
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
                                       e202DD2 ();
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
                                    strup2DD0( ) ;
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

   public void we2DD2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2DD2( ) ;
         }
      }
   }

   public void pa2DD2( )
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
      subsflControlProps_432( ) ;
      while ( nGXsfl_43_idx <= nRC_GXsfl_43 )
      {
         sendrow_432( ) ;
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV23ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ,
                                 String AV92Pgmname ,
                                 String AV12FilterFullText ,
                                 String AV30EmprCod ,
                                 int AV34Barcod ,
                                 byte AV35Barcodreo ,
                                 String AV36Barcodpar ,
                                 int AV46clicod ,
                                 String AV47Clinom ,
                                 String AV48barser ,
                                 String AV49barserdsc ,
                                 String AV50barcolnom ,
                                 int AV51Barcolnum ,
                                 java.math.BigDecimal AV40BarKgm ,
                                 java.math.BigDecimal AV42BarMtr ,
                                 java.math.BigDecimal AV43costefab2 ,
                                 java.math.BigDecimal AV52mAgua ,
                                 java.math.BigDecimal AV53menergia ,
                                 java.math.BigDecimal AV54mgas ,
                                 java.math.BigDecimal AV55mmod ,
                                 java.math.BigDecimal AV56mmoi ,
                                 java.math.BigDecimal AV57madc ,
                                 java.math.BigDecimal AV58mam ,
                                 java.math.BigDecimal AV59mgi ,
                                 java.math.BigDecimal AV60costeoperario1 ,
                                 short AV31TasasEstandar ,
                                 String AV33Station ,
                                 byte AV61reoperados ,
                                 String AV37CostesBasicos_Fases_SDTjson ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e192DD2 ();
      GRID_nCurrentRecord = 0 ;
      rf2DD2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"CostesBasicos_Fases_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV92Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("costesbasicos\\costesbasicos_fases_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf2DD2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV92Pgmname = "CostesBasicos.CostesBasicos_Fases_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92Pgmname", AV92Pgmname);
      Gx_err = (short)(0) ;
      edtavCostesbasicos_fases_sdt__barfassec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__barfassec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__barfassec_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__barordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__barordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__barordlin_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__fascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__fascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__fascod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__fasdsc_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__maqcod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__maqdsc_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__unidades_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__unidades_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__unidades_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__unidadest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__unidadest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__unidadest_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__barunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__barunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__barunimed_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__horini_5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__horini_5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__horini_5_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__horfin_5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__horfin_5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__horfin_5_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__bartierea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__bartierea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__bartierea_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__tieteo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__tieteo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__tieteo_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__tteo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__tteo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__tteo_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__maqcosmin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__maqcosmin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__maqcosmin_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__coste_m_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__coste_m_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__coste_m_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__coste_tm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__coste_tm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__coste_tm_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__mmod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__mmod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__mmod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__mmoi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__mmoi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__mmoi_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__menergia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__menergia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__menergia_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__mgas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__mgas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__mgas_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__magua_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__magua_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__magua_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__mgi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__mgi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__mgi_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__madc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__madc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__madc_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__mam_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__mam_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__mam_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__tiempo_m_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__tiempo_m_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__tiempo_m_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__lhipro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__lhipro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__lhipro_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2DD2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(43) ;
      /* Execute user event: Refresh */
      e192DD2 ();
      nGXsfl_43_idx = 1 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_432( ) ;
      bGXsfl_43_Refreshing = true ;
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
         subsflControlProps_432( ) ;
         e202DD2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_43_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e202DD2 ();
         }
         wbEnd = (short)(43) ;
         wb2DD0( ) ;
      }
      bGXsfl_43_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2DD2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTASASESTANDAR", GXutil.ltrim( localUtil.ntoc( AV31TasasEstandar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTASASESTANDAR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV31TasasEstandar), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV33Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV33Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vREOPERADOS", GXutil.ltrim( localUtil.ntoc( AV61reoperados, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vREOPERADOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV61reoperados), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOSTESBASICOS_FASES_SDTJSON", AV37CostesBasicos_Fases_SDTjson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTESBASICOS_FASES_SDTJSON", getSecureSignedToken( sPrefix, AV37CostesBasicos_Fases_SDTjson));
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
      return AV13CostesBasicos_Fases_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV92Pgmname, AV12FilterFullText, AV30EmprCod, AV34Barcod, AV35Barcodreo, AV36Barcodpar, AV46clicod, AV47Clinom, AV48barser, AV49barserdsc, AV50barcolnom, AV51Barcolnum, AV40BarKgm, AV42BarMtr, AV43costefab2, AV52mAgua, AV53menergia, AV54mgas, AV55mmod, AV56mmoi, AV57madc, AV58mam, AV59mgi, AV60costeoperario1, AV31TasasEstandar, AV33Station, AV61reoperados, AV37CostesBasicos_Fases_SDTjson, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV92Pgmname, AV12FilterFullText, AV30EmprCod, AV34Barcod, AV35Barcodreo, AV36Barcodpar, AV46clicod, AV47Clinom, AV48barser, AV49barserdsc, AV50barcolnom, AV51Barcolnum, AV40BarKgm, AV42BarMtr, AV43costefab2, AV52mAgua, AV53menergia, AV54mgas, AV55mmod, AV56mmoi, AV57madc, AV58mam, AV59mgi, AV60costeoperario1, AV31TasasEstandar, AV33Station, AV61reoperados, AV37CostesBasicos_Fases_SDTjson, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV92Pgmname, AV12FilterFullText, AV30EmprCod, AV34Barcod, AV35Barcodreo, AV36Barcodpar, AV46clicod, AV47Clinom, AV48barser, AV49barserdsc, AV50barcolnom, AV51Barcolnum, AV40BarKgm, AV42BarMtr, AV43costefab2, AV52mAgua, AV53menergia, AV54mgas, AV55mmod, AV56mmoi, AV57madc, AV58mam, AV59mgi, AV60costeoperario1, AV31TasasEstandar, AV33Station, AV61reoperados, AV37CostesBasicos_Fases_SDTjson, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV92Pgmname, AV12FilterFullText, AV30EmprCod, AV34Barcod, AV35Barcodreo, AV36Barcodpar, AV46clicod, AV47Clinom, AV48barser, AV49barserdsc, AV50barcolnom, AV51Barcolnum, AV40BarKgm, AV42BarMtr, AV43costefab2, AV52mAgua, AV53menergia, AV54mgas, AV55mmod, AV56mmoi, AV57madc, AV58mam, AV59mgi, AV60costeoperario1, AV31TasasEstandar, AV33Station, AV61reoperados, AV37CostesBasicos_Fases_SDTjson, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV92Pgmname, AV12FilterFullText, AV30EmprCod, AV34Barcod, AV35Barcodreo, AV36Barcodpar, AV46clicod, AV47Clinom, AV48barser, AV49barserdsc, AV50barcolnom, AV51Barcolnum, AV40BarKgm, AV42BarMtr, AV43costefab2, AV52mAgua, AV53menergia, AV54mgas, AV55mmod, AV56mmoi, AV57madc, AV58mam, AV59mgi, AV60costeoperario1, AV31TasasEstandar, AV33Station, AV61reoperados, AV37CostesBasicos_Fases_SDTjson, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV92Pgmname = "CostesBasicos.CostesBasicos_Fases_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92Pgmname", AV92Pgmname);
      Gx_err = (short)(0) ;
      edtavCostesbasicos_fases_sdt__barfassec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__barfassec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__barfassec_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__barordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__barordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__barordlin_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__fascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__fascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__fascod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__fasdsc_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__maqcod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__maqdsc_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__unidades_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__unidades_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__unidades_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__unidadest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__unidadest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__unidadest_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__barunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__barunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__barunimed_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__horini_5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__horini_5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__horini_5_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__horfin_5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__horfin_5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__horfin_5_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__bartierea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__bartierea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__bartierea_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__tieteo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__tieteo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__tieteo_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__tteo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__tteo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__tteo_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__maqcosmin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__maqcosmin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__maqcosmin_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__coste_m_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__coste_m_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__coste_m_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__coste_tm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__coste_tm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__coste_tm_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__mmod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__mmod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__mmod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__mmoi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__mmoi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__mmoi_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__menergia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__menergia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__menergia_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__mgas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__mgas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__mgas_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__magua_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__magua_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__magua_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__mgi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__mgi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__mgi_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__madc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__madc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__madc_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__mam_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__mam_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__mam_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__tiempo_m_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__tiempo_m_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__tiempo_m_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__lhipro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__lhipro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__lhipro_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2DD0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e182DD2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Costesbasicos_fases_sdt"), AV13CostesBasicos_Fases_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV21ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV24DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV18ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOSTESBASICOS_FASES_SDT"), AV13CostesBasicos_Fases_SDT);
         /* Read saved values. */
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV26GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV27GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV30EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV30EmprCod") ;
         wcpOAV34Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV34Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV35Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV35Barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV36Barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV36Barcodpar") ;
         wcpOAV46clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV46clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV47Clinom = httpContext.cgiGet( sPrefix+"wcpOAV47Clinom") ;
         wcpOAV48barser = httpContext.cgiGet( sPrefix+"wcpOAV48barser") ;
         wcpOAV49barserdsc = httpContext.cgiGet( sPrefix+"wcpOAV49barserdsc") ;
         wcpOAV50barcolnom = httpContext.cgiGet( sPrefix+"wcpOAV50barcolnom") ;
         wcpOAV51Barcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV51Barcolnum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV40BarKgm = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV40BarKgm")) ;
         wcpOAV42BarMtr = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV42BarMtr")) ;
         wcpOAV43costefab2 = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV43costefab2")) ;
         wcpOAV52mAgua = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV52mAgua")) ;
         wcpOAV53menergia = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV53menergia")) ;
         wcpOAV54mgas = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV54mgas")) ;
         wcpOAV55mmod = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV55mmod")) ;
         wcpOAV56mmoi = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV56mmoi")) ;
         wcpOAV57madc = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV57madc")) ;
         wcpOAV58mam = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV58mam")) ;
         wcpOAV59mgi = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV59mgi")) ;
         wcpOAV60costeoperario1 = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV60costeoperario1")) ;
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
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
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
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_43_fel_idx = 0 ;
         while ( nGXsfl_43_fel_idx < nRC_GXsfl_43 )
         {
            nGXsfl_43_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_fel_idx+1) ;
            sGXsfl_43_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_432( ) ;
            AV64GXV1 = (int)(nGXsfl_43_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV13CostesBasicos_Fases_SDT.size() >= AV64GXV1 ) && ( AV64GXV1 > 0 ) )
            {
               AV13CostesBasicos_Fases_SDT.currentItem( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)) );
            }
         }
         if ( nGXsfl_43_fel_idx == 0 )
         {
            nGXsfl_43_idx = 1 ;
            sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_432( ) ;
         }
         nGXsfl_43_fel_idx = 1 ;
         /* Read variables values. */
         AV12FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         AV92Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92Pgmname", AV92Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"CostesBasicos_Fases_WC");
         AV92Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92Pgmname", AV92Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV92Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("costesbasicos\\costesbasicos_fases_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e182DD2 ();
      if (returnInSub) return;
   }

   public void e182DD2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV33Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      costesbasicos_fases_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV33Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Station", AV33Station);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV33Station, ""))));
      GXv_char2[0] = AV30EmprCod ;
      GXv_char3[0] = AV28EmprNom ;
      GXv_char4[0] = AV29UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV33Station, GXv_char2, GXv_char3, GXv_char4) ;
      costesbasicos_fases_wc_impl.this.AV30EmprCod = GXv_char2[0] ;
      costesbasicos_fases_wc_impl.this.AV28EmprNom = GXv_char3[0] ;
      costesbasicos_fases_wc_impl.this.AV29UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30EmprCod", AV30EmprCod);
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
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV24DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV24DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = (byte)(AV31TasasEstandar) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV30EmprCod, httpContext.getMessage( "TASSTD", ""), GXv_int8) ;
      costesbasicos_fases_wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV31TasasEstandar = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TasasEstandar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TasasEstandar), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTASASESTANDAR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV31TasasEstandar), "ZZZ9")));
      GXt_int7 = (byte)(AV32Moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV30EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      costesbasicos_fases_wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV32Moda21 = GXt_int7 ;
      GXt_int7 = AV61reoperados ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV30EmprCod, httpContext.getMessage( "NCHROR", ""), GXv_int8) ;
      costesbasicos_fases_wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV61reoperados = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61reoperados", GXutil.str( AV61reoperados, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vREOPERADOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV61reoperados), "9")));
      GXt_char1 = AV37CostesBasicos_Fases_SDTjson ;
      GXv_char4[0] = GXt_char1 ;
      new app.costesbasicos.costesbasicos_fases_prc(remoteHandle, context).execute( AV30EmprCod, AV34Barcod, AV35Barcodreo, AV36Barcodpar, GXv_char4) ;
      costesbasicos_fases_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV37CostesBasicos_Fases_SDTjson = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37CostesBasicos_Fases_SDTjson", AV37CostesBasicos_Fases_SDTjson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTESBASICOS_FASES_SDTJSON", getSecureSignedToken( sPrefix, AV37CostesBasicos_Fases_SDTjson));
      AV13CostesBasicos_Fases_SDT.fromJSonString(AV37CostesBasicos_Fases_SDTjson, null);
      gx_BV43 = true ;
   }

   public void e192DD2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV6WWPContext = GXv_SdtWWPContext9[0] ;
      if ( AV23ManageFiltersExecutionStep == 1 )
      {
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV23ManageFiltersExecutionStep == 2 )
      {
         AV23ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV20Session.getValue("CostesBasicos.CostesBasicos_Fases_WCColumnsSelector"), "") != 0 )
      {
         AV16ColumnsSelectorXML = AV20Session.getValue("CostesBasicos.CostesBasicos_Fases_WCColumnsSelector") ;
         AV18ColumnsSelector.fromxml(AV16ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      edtavCostesbasicos_fases_sdt__barfassec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__barfassec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__barfassec_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__barordlin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__barordlin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__barordlin_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__fascod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__fascod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__fascod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__fasdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__fasdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__fasdsc_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__maqcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__maqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__maqcod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__maqdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__maqdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__maqdsc_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__unidades_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__unidades_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__unidades_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__unidadest_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__unidadest_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__unidadest_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__barunimed_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__barunimed_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__barunimed_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__horini_5_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__horini_5_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__horini_5_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__horfin_5_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__horfin_5_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__horfin_5_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__bartierea_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__bartierea_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__bartierea_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__tieteo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__tieteo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__tieteo_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__tteo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__tteo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__tteo_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__maqcosmin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__maqcosmin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__maqcosmin_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__coste_m_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__coste_m_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__coste_m_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__coste_tm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__coste_tm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__coste_tm_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__mmod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__mmod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__mmod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__mmoi_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__mmoi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__mmoi_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__menergia_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__menergia_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__menergia_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__mgas_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__mgas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__mgas_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__magua_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__magua_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__magua_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__mgi_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__mgi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__mgi_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__madc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__madc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__madc_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__mam_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__mam_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__mam_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCostesbasicos_fases_sdt__tiempo_m_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_fases_sdt__tiempo_m_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_fases_sdt__tiempo_m_Visible), 5, 0), !bGXsfl_43_Refreshing);
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S152 ();
      if (returnInSub) return;
      AV26GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridCurrentPage), 10, 0));
      AV27GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e122DD2( )
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
         AV25PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV25PageToGo) ;
      }
   }

   public void e132DD2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e202DD2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV64GXV1 = 1 ;
      while ( AV64GXV1 <= AV13CostesBasicos_Fases_SDT.size() )
      {
         AV13CostesBasicos_Fases_SDT.currentItem( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(43) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_432( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_43_Refreshing )
         {
            httpContext.doAjaxLoad(43, GridRow);
         }
         AV64GXV1 = (int)(AV64GXV1+1) ;
      }
   }

   public void e142DD2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV16ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV18ColumnsSelector.fromJSonString(AV16ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "CostesBasicos.CostesBasicos_Fases_WCColumnsSelector", ((GXutil.strcmp("", AV16ColumnsSelectorXML)==0) ? "" : AV18ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e112DD2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S162 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S132 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("CostesBasicos.CostesBasicos_Fases_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV92Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("CostesBasicos.CostesBasicos_Fases_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV22ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "CostesBasicos.CostesBasicos_Fases_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         costesbasicos_fases_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV22ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV22ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S162 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV92Pgmname+"GridState", AV22ManageFiltersXml) ;
            AV10GridState.fromxml(AV22ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S172 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
   }

   public void e152DD2( )
   {
      /* 'DoFicha' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV14ExcelFilename ;
      GXv_char3[0] = AV15ErrorMessage ;
      new app.costesbasicos.costesbasicos_fases_ficha_export(remoteHandle, context).execute( AV30EmprCod, AV34Barcod, AV35Barcodreo, AV36Barcodpar, AV33Station, AV46clicod, AV47Clinom, AV48barser, AV49barserdsc, AV50barcolnom, AV51Barcolnum, AV40BarKgm, AV42BarMtr, AV43costefab2, AV61reoperados, AV52mAgua, AV53menergia, AV54mgas, AV55mmod, AV56mmoi, AV57madc, AV58mam, AV59mgi, AV60costeoperario1, GXv_char4, GXv_char3) ;
      costesbasicos_fases_wc_impl.this.AV14ExcelFilename = GXv_char4[0] ;
      costesbasicos_fases_wc_impl.this.AV15ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV14ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV14ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV15ErrorMessage);
      }
   }

   public void e162DD2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV38Websession.setValue(httpContext.getMessage( "CostesBasicos_Fases_SDT", ""), AV37CostesBasicos_Fases_SDTjson);
      GXv_char4[0] = AV14ExcelFilename ;
      GXv_char3[0] = AV15ErrorMessage ;
      new app.costesbasicos.costesbasicos_fases_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      costesbasicos_fases_wc_impl.this.AV14ExcelFilename = GXv_char4[0] ;
      costesbasicos_fases_wc_impl.this.AV15ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV14ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV14ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV15ErrorMessage);
      }
   }

   public void e172DD2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV38Websession.setValue(httpContext.getMessage( "CostesBasicos_Fases_SDT", ""), AV37CostesBasicos_Fases_SDTjson);
      callWebObject(formatLink("app.costesbasicos.costesbasicos_fases_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S152( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S142( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV18ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_Fases_SDT__Barfassec", "", "", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_Fases_SDT__Barordlin", "", "Orden", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_Fases_SDT__Fascod", "", "Fase", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_Fases_SDT__Fasdsc", "", "Descripcion", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_Fases_SDT__Maqcod", "", "Maquina", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_Fases_SDT__MaqDsc", "", "Descripcion", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_Fases_SDT__Unidades", "", "Unidades", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_Fases_SDT__UnidadesT", "", "Unidades Tot.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_Fases_SDT__BarUnimed", "", "Und", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_Fases_SDT__HorIni_5", "", "Inicio", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_Fases_SDT__HorFin_5", "", "Fin", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_Fases_SDT__BarTieRea", "", "T. Real", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_Fases_SDT__TieTeo", "", "T. Teo", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_Fases_SDT__TTeo", "", "T. Teo (calc.)", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_Fases_SDT__MaqCosMin", "", "Coste Mm", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_Fases_SDT__Coste_m", "", "Coste Real", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_Fases_SDT__Coste_tm", "", "Coste Teo.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      if ( AV31TasasEstandar == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_Fases_SDT__Mmod", "", "MOD", true, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      if ( AV31TasasEstandar == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_Fases_SDT__Mmoi", "", "MOI", true, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      if ( AV31TasasEstandar == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_Fases_SDT__Menergia", "", "Energia", true, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      if ( AV31TasasEstandar == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_Fases_SDT__Mgas", "", "Gas", true, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      if ( AV31TasasEstandar == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_Fases_SDT__Magua", "", "Agua", true, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      if ( AV31TasasEstandar == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_Fases_SDT__Mgi", "", "Gastos Ind.", true, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      if ( AV31TasasEstandar == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_Fases_SDT__Madc", "", "Adm. Cent.", true, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      if ( AV31TasasEstandar == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_Fases_SDT__Mam", "", "Amortizaciones", true, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_Fases_SDT__Tiempo_m", "", "Tiempo m", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV17UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "CostesBasicos.CostesBasicos_Fases_WCColumnsSelector", GXv_char4) ;
      costesbasicos_fases_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV17UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV17UserCustomValue)==0) ) )
      {
         AV19ColumnsSelectorAux.fromxml(AV17UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV19ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = AV21ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "CostesBasicos.CostesBasicos_Fases_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV21ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S162( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV12FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue(AV92Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV92Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV20Session.getValue(AV92Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S172 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S172( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV93GXV29 = 1 ;
      while ( AV93GXV29 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV93GXV29));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         }
         AV93GXV29 = (int)(AV93GXV29+1) ;
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV20Session.getValue(AV92Pgmname+"GridState"), null, null);
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV12FilterFullText)==0), (short)(0), AV12FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      if ( ! (GXutil.strcmp("", AV30EmprCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV30EmprCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV34Barcod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV34Barcod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV35Barcodreo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV35Barcodreo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV36Barcodpar)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV36Barcodpar );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV46clicod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV46clicod, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV47Clinom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLINOM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV47Clinom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV48barser)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSER" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV48barser );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV49barserdsc)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSERDSC" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV49barserdsc );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV50barcolnom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNOM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV50barcolnom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV51Barcolnum) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNUM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV51Barcolnum, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40BarKgm)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARKGM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV40BarKgm, 9, 2) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42BarMtr)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARMTR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV42BarMtr, 9, 2) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43costefab2)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&COSTEFAB2" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV43costefab2, 10, 2) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52mAgua)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAGUA" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV52mAgua, 12, 2) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53menergia)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MENERGIA" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV53menergia, 12, 2) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54mgas)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MGAS" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV54mgas, 12, 2) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55mmod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MMOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV55mmod, 12, 2) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56mmoi)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MMOI" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV56mmoi, 12, 2) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57madc)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MADC" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV57madc, 12, 2) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58mam)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV58mam, 12, 2) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59mgi)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MGI" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV59mgi, 12, 2) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60costeoperario1)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&COSTEOPERARIO1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV60costeoperario1, 10, 2) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV92Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void wb_table1_25_2DD2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV21ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_30_2DD2( true) ;
      }
      else
      {
         wb_table2_30_2DD2( false) ;
      }
      return  ;
   }

   public void wb_table2_30_2DD2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_2DD2e( true) ;
      }
      else
      {
         wb_table1_25_2DD2e( false) ;
      }
   }

   public void wb_table2_30_2DD2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV12FilterFullText, GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_CostesBasicos\\CostesBasicos_Fases_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_30_2DD2e( true) ;
      }
      else
      {
         wb_table2_30_2DD2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV30EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30EmprCod", AV30EmprCod);
      AV34Barcod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Barcod), 8, 0));
      AV35Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Barcodreo", GXutil.str( AV35Barcodreo, 1, 0));
      AV36Barcodpar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Barcodpar", AV36Barcodpar);
      AV46clicod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46clicod), 6, 0));
      AV47Clinom = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Clinom", AV47Clinom);
      AV48barser = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48barser", AV48barser);
      AV49barserdsc = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49barserdsc", AV49barserdsc);
      AV50barcolnom = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50barcolnom", AV50barcolnom);
      AV51Barcolnum = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51Barcolnum), 6, 0));
      AV40BarKgm = (java.math.BigDecimal)getParm(obj,10,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40BarKgm", GXutil.ltrimstr( AV40BarKgm, 9, 2));
      AV42BarMtr = (java.math.BigDecimal)getParm(obj,11,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42BarMtr", GXutil.ltrimstr( AV42BarMtr, 9, 2));
      AV43costefab2 = (java.math.BigDecimal)getParm(obj,12,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43costefab2", GXutil.ltrimstr( AV43costefab2, 10, 2));
      AV52mAgua = (java.math.BigDecimal)getParm(obj,13,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52mAgua", GXutil.ltrimstr( AV52mAgua, 12, 2));
      AV53menergia = (java.math.BigDecimal)getParm(obj,14,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53menergia", GXutil.ltrimstr( AV53menergia, 12, 2));
      AV54mgas = (java.math.BigDecimal)getParm(obj,15,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54mgas", GXutil.ltrimstr( AV54mgas, 12, 2));
      AV55mmod = (java.math.BigDecimal)getParm(obj,16,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55mmod", GXutil.ltrimstr( AV55mmod, 12, 2));
      AV56mmoi = (java.math.BigDecimal)getParm(obj,17,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56mmoi", GXutil.ltrimstr( AV56mmoi, 12, 2));
      AV57madc = (java.math.BigDecimal)getParm(obj,18,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57madc", GXutil.ltrimstr( AV57madc, 12, 2));
      AV58mam = (java.math.BigDecimal)getParm(obj,19,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58mam", GXutil.ltrimstr( AV58mam, 12, 2));
      AV59mgi = (java.math.BigDecimal)getParm(obj,20,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59mgi", GXutil.ltrimstr( AV59mgi, 12, 2));
      AV60costeoperario1 = (java.math.BigDecimal)getParm(obj,21,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60costeoperario1", GXutil.ltrimstr( AV60costeoperario1, 10, 2));
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
      pa2DD2( ) ;
      ws2DD2( ) ;
      we2DD2( ) ;
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
      sCtrlAV30EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV34Barcod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV35Barcodreo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV36Barcodpar = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV46clicod = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV47Clinom = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV48barser = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV49barserdsc = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV50barcolnom = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV51Barcolnum = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV40BarKgm = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV42BarMtr = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV43costefab2 = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV52mAgua = (String)getParm(obj,13,TypeConstants.STRING) ;
      sCtrlAV53menergia = (String)getParm(obj,14,TypeConstants.STRING) ;
      sCtrlAV54mgas = (String)getParm(obj,15,TypeConstants.STRING) ;
      sCtrlAV55mmod = (String)getParm(obj,16,TypeConstants.STRING) ;
      sCtrlAV56mmoi = (String)getParm(obj,17,TypeConstants.STRING) ;
      sCtrlAV57madc = (String)getParm(obj,18,TypeConstants.STRING) ;
      sCtrlAV58mam = (String)getParm(obj,19,TypeConstants.STRING) ;
      sCtrlAV59mgi = (String)getParm(obj,20,TypeConstants.STRING) ;
      sCtrlAV60costeoperario1 = (String)getParm(obj,21,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2DD2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "costesbasicos\\costesbasicos_fases_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2DD2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV30EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30EmprCod", AV30EmprCod);
         AV34Barcod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Barcod), 8, 0));
         AV35Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Barcodreo", GXutil.str( AV35Barcodreo, 1, 0));
         AV36Barcodpar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Barcodpar", AV36Barcodpar);
         AV46clicod = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46clicod), 6, 0));
         AV47Clinom = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Clinom", AV47Clinom);
         AV48barser = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48barser", AV48barser);
         AV49barserdsc = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49barserdsc", AV49barserdsc);
         AV50barcolnom = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50barcolnom", AV50barcolnom);
         AV51Barcolnum = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51Barcolnum), 6, 0));
         AV40BarKgm = (java.math.BigDecimal)getParm(obj,12,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40BarKgm", GXutil.ltrimstr( AV40BarKgm, 9, 2));
         AV42BarMtr = (java.math.BigDecimal)getParm(obj,13,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42BarMtr", GXutil.ltrimstr( AV42BarMtr, 9, 2));
         AV43costefab2 = (java.math.BigDecimal)getParm(obj,14,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43costefab2", GXutil.ltrimstr( AV43costefab2, 10, 2));
         AV52mAgua = (java.math.BigDecimal)getParm(obj,15,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52mAgua", GXutil.ltrimstr( AV52mAgua, 12, 2));
         AV53menergia = (java.math.BigDecimal)getParm(obj,16,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53menergia", GXutil.ltrimstr( AV53menergia, 12, 2));
         AV54mgas = (java.math.BigDecimal)getParm(obj,17,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54mgas", GXutil.ltrimstr( AV54mgas, 12, 2));
         AV55mmod = (java.math.BigDecimal)getParm(obj,18,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55mmod", GXutil.ltrimstr( AV55mmod, 12, 2));
         AV56mmoi = (java.math.BigDecimal)getParm(obj,19,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56mmoi", GXutil.ltrimstr( AV56mmoi, 12, 2));
         AV57madc = (java.math.BigDecimal)getParm(obj,20,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57madc", GXutil.ltrimstr( AV57madc, 12, 2));
         AV58mam = (java.math.BigDecimal)getParm(obj,21,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58mam", GXutil.ltrimstr( AV58mam, 12, 2));
         AV59mgi = (java.math.BigDecimal)getParm(obj,22,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59mgi", GXutil.ltrimstr( AV59mgi, 12, 2));
         AV60costeoperario1 = (java.math.BigDecimal)getParm(obj,23,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60costeoperario1", GXutil.ltrimstr( AV60costeoperario1, 10, 2));
      }
      wcpOAV30EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV30EmprCod") ;
      wcpOAV34Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV34Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV35Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV35Barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV36Barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV36Barcodpar") ;
      wcpOAV46clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV46clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV47Clinom = httpContext.cgiGet( sPrefix+"wcpOAV47Clinom") ;
      wcpOAV48barser = httpContext.cgiGet( sPrefix+"wcpOAV48barser") ;
      wcpOAV49barserdsc = httpContext.cgiGet( sPrefix+"wcpOAV49barserdsc") ;
      wcpOAV50barcolnom = httpContext.cgiGet( sPrefix+"wcpOAV50barcolnom") ;
      wcpOAV51Barcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV51Barcolnum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV40BarKgm = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV40BarKgm")) ;
      wcpOAV42BarMtr = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV42BarMtr")) ;
      wcpOAV43costefab2 = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV43costefab2")) ;
      wcpOAV52mAgua = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV52mAgua")) ;
      wcpOAV53menergia = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV53menergia")) ;
      wcpOAV54mgas = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV54mgas")) ;
      wcpOAV55mmod = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV55mmod")) ;
      wcpOAV56mmoi = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV56mmoi")) ;
      wcpOAV57madc = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV57madc")) ;
      wcpOAV58mam = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV58mam")) ;
      wcpOAV59mgi = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV59mgi")) ;
      wcpOAV60costeoperario1 = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV60costeoperario1")) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV30EmprCod, wcpOAV30EmprCod) != 0 ) || ( AV34Barcod != wcpOAV34Barcod ) || ( AV35Barcodreo != wcpOAV35Barcodreo ) || ( GXutil.strcmp(AV36Barcodpar, wcpOAV36Barcodpar) != 0 ) || ( AV46clicod != wcpOAV46clicod ) || ( GXutil.strcmp(AV47Clinom, wcpOAV47Clinom) != 0 ) || ( GXutil.strcmp(AV48barser, wcpOAV48barser) != 0 ) || ( GXutil.strcmp(AV49barserdsc, wcpOAV49barserdsc) != 0 ) || ( GXutil.strcmp(AV50barcolnom, wcpOAV50barcolnom) != 0 ) || ( AV51Barcolnum != wcpOAV51Barcolnum ) || ( DecimalUtil.compareTo(AV40BarKgm, wcpOAV40BarKgm) != 0 ) || ( DecimalUtil.compareTo(AV42BarMtr, wcpOAV42BarMtr) != 0 ) || ( DecimalUtil.compareTo(AV43costefab2, wcpOAV43costefab2) != 0 ) || ( DecimalUtil.compareTo(AV52mAgua, wcpOAV52mAgua) != 0 ) || ( DecimalUtil.compareTo(AV53menergia, wcpOAV53menergia) != 0 ) || ( DecimalUtil.compareTo(AV54mgas, wcpOAV54mgas) != 0 ) || ( DecimalUtil.compareTo(AV55mmod, wcpOAV55mmod) != 0 ) || ( DecimalUtil.compareTo(AV56mmoi, wcpOAV56mmoi) != 0 ) || ( DecimalUtil.compareTo(AV57madc, wcpOAV57madc) != 0 ) || ( DecimalUtil.compareTo(AV58mam, wcpOAV58mam) != 0 ) || ( DecimalUtil.compareTo(AV59mgi, wcpOAV59mgi) != 0 ) || ( DecimalUtil.compareTo(AV60costeoperario1, wcpOAV60costeoperario1) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV30EmprCod = AV30EmprCod ;
      wcpOAV34Barcod = AV34Barcod ;
      wcpOAV35Barcodreo = AV35Barcodreo ;
      wcpOAV36Barcodpar = AV36Barcodpar ;
      wcpOAV46clicod = AV46clicod ;
      wcpOAV47Clinom = AV47Clinom ;
      wcpOAV48barser = AV48barser ;
      wcpOAV49barserdsc = AV49barserdsc ;
      wcpOAV50barcolnom = AV50barcolnom ;
      wcpOAV51Barcolnum = AV51Barcolnum ;
      wcpOAV40BarKgm = AV40BarKgm ;
      wcpOAV42BarMtr = AV42BarMtr ;
      wcpOAV43costefab2 = AV43costefab2 ;
      wcpOAV52mAgua = AV52mAgua ;
      wcpOAV53menergia = AV53menergia ;
      wcpOAV54mgas = AV54mgas ;
      wcpOAV55mmod = AV55mmod ;
      wcpOAV56mmoi = AV56mmoi ;
      wcpOAV57madc = AV57madc ;
      wcpOAV58mam = AV58mam ;
      wcpOAV59mgi = AV59mgi ;
      wcpOAV60costeoperario1 = AV60costeoperario1 ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV30EmprCod = httpContext.cgiGet( sPrefix+"AV30EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV30EmprCod) > 0 )
      {
         AV30EmprCod = httpContext.cgiGet( sCtrlAV30EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30EmprCod", AV30EmprCod);
      }
      else
      {
         AV30EmprCod = httpContext.cgiGet( sPrefix+"AV30EmprCod_PARM") ;
      }
      sCtrlAV34Barcod = httpContext.cgiGet( sPrefix+"AV34Barcod_CTRL") ;
      if ( GXutil.len( sCtrlAV34Barcod) > 0 )
      {
         AV34Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV34Barcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Barcod), 8, 0));
      }
      else
      {
         AV34Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV34Barcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV35Barcodreo = httpContext.cgiGet( sPrefix+"AV35Barcodreo_CTRL") ;
      if ( GXutil.len( sCtrlAV35Barcodreo) > 0 )
      {
         AV35Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV35Barcodreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Barcodreo", GXutil.str( AV35Barcodreo, 1, 0));
      }
      else
      {
         AV35Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV35Barcodreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV36Barcodpar = httpContext.cgiGet( sPrefix+"AV36Barcodpar_CTRL") ;
      if ( GXutil.len( sCtrlAV36Barcodpar) > 0 )
      {
         AV36Barcodpar = httpContext.cgiGet( sCtrlAV36Barcodpar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Barcodpar", AV36Barcodpar);
      }
      else
      {
         AV36Barcodpar = httpContext.cgiGet( sPrefix+"AV36Barcodpar_PARM") ;
      }
      sCtrlAV46clicod = httpContext.cgiGet( sPrefix+"AV46clicod_CTRL") ;
      if ( GXutil.len( sCtrlAV46clicod) > 0 )
      {
         AV46clicod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV46clicod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46clicod), 6, 0));
      }
      else
      {
         AV46clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV46clicod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV47Clinom = httpContext.cgiGet( sPrefix+"AV47Clinom_CTRL") ;
      if ( GXutil.len( sCtrlAV47Clinom) > 0 )
      {
         AV47Clinom = httpContext.cgiGet( sCtrlAV47Clinom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Clinom", AV47Clinom);
      }
      else
      {
         AV47Clinom = httpContext.cgiGet( sPrefix+"AV47Clinom_PARM") ;
      }
      sCtrlAV48barser = httpContext.cgiGet( sPrefix+"AV48barser_CTRL") ;
      if ( GXutil.len( sCtrlAV48barser) > 0 )
      {
         AV48barser = httpContext.cgiGet( sCtrlAV48barser) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48barser", AV48barser);
      }
      else
      {
         AV48barser = httpContext.cgiGet( sPrefix+"AV48barser_PARM") ;
      }
      sCtrlAV49barserdsc = httpContext.cgiGet( sPrefix+"AV49barserdsc_CTRL") ;
      if ( GXutil.len( sCtrlAV49barserdsc) > 0 )
      {
         AV49barserdsc = httpContext.cgiGet( sCtrlAV49barserdsc) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49barserdsc", AV49barserdsc);
      }
      else
      {
         AV49barserdsc = httpContext.cgiGet( sPrefix+"AV49barserdsc_PARM") ;
      }
      sCtrlAV50barcolnom = httpContext.cgiGet( sPrefix+"AV50barcolnom_CTRL") ;
      if ( GXutil.len( sCtrlAV50barcolnom) > 0 )
      {
         AV50barcolnom = httpContext.cgiGet( sCtrlAV50barcolnom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50barcolnom", AV50barcolnom);
      }
      else
      {
         AV50barcolnom = httpContext.cgiGet( sPrefix+"AV50barcolnom_PARM") ;
      }
      sCtrlAV51Barcolnum = httpContext.cgiGet( sPrefix+"AV51Barcolnum_CTRL") ;
      if ( GXutil.len( sCtrlAV51Barcolnum) > 0 )
      {
         AV51Barcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV51Barcolnum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51Barcolnum), 6, 0));
      }
      else
      {
         AV51Barcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV51Barcolnum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV40BarKgm = httpContext.cgiGet( sPrefix+"AV40BarKgm_CTRL") ;
      if ( GXutil.len( sCtrlAV40BarKgm) > 0 )
      {
         AV40BarKgm = localUtil.ctond( httpContext.cgiGet( sCtrlAV40BarKgm)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40BarKgm", GXutil.ltrimstr( AV40BarKgm, 9, 2));
      }
      else
      {
         AV40BarKgm = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV40BarKgm_PARM")) ;
      }
      sCtrlAV42BarMtr = httpContext.cgiGet( sPrefix+"AV42BarMtr_CTRL") ;
      if ( GXutil.len( sCtrlAV42BarMtr) > 0 )
      {
         AV42BarMtr = localUtil.ctond( httpContext.cgiGet( sCtrlAV42BarMtr)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42BarMtr", GXutil.ltrimstr( AV42BarMtr, 9, 2));
      }
      else
      {
         AV42BarMtr = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV42BarMtr_PARM")) ;
      }
      sCtrlAV43costefab2 = httpContext.cgiGet( sPrefix+"AV43costefab2_CTRL") ;
      if ( GXutil.len( sCtrlAV43costefab2) > 0 )
      {
         AV43costefab2 = localUtil.ctond( httpContext.cgiGet( sCtrlAV43costefab2)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43costefab2", GXutil.ltrimstr( AV43costefab2, 10, 2));
      }
      else
      {
         AV43costefab2 = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV43costefab2_PARM")) ;
      }
      sCtrlAV52mAgua = httpContext.cgiGet( sPrefix+"AV52mAgua_CTRL") ;
      if ( GXutil.len( sCtrlAV52mAgua) > 0 )
      {
         AV52mAgua = localUtil.ctond( httpContext.cgiGet( sCtrlAV52mAgua)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52mAgua", GXutil.ltrimstr( AV52mAgua, 12, 2));
      }
      else
      {
         AV52mAgua = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV52mAgua_PARM")) ;
      }
      sCtrlAV53menergia = httpContext.cgiGet( sPrefix+"AV53menergia_CTRL") ;
      if ( GXutil.len( sCtrlAV53menergia) > 0 )
      {
         AV53menergia = localUtil.ctond( httpContext.cgiGet( sCtrlAV53menergia)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53menergia", GXutil.ltrimstr( AV53menergia, 12, 2));
      }
      else
      {
         AV53menergia = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV53menergia_PARM")) ;
      }
      sCtrlAV54mgas = httpContext.cgiGet( sPrefix+"AV54mgas_CTRL") ;
      if ( GXutil.len( sCtrlAV54mgas) > 0 )
      {
         AV54mgas = localUtil.ctond( httpContext.cgiGet( sCtrlAV54mgas)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54mgas", GXutil.ltrimstr( AV54mgas, 12, 2));
      }
      else
      {
         AV54mgas = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV54mgas_PARM")) ;
      }
      sCtrlAV55mmod = httpContext.cgiGet( sPrefix+"AV55mmod_CTRL") ;
      if ( GXutil.len( sCtrlAV55mmod) > 0 )
      {
         AV55mmod = localUtil.ctond( httpContext.cgiGet( sCtrlAV55mmod)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55mmod", GXutil.ltrimstr( AV55mmod, 12, 2));
      }
      else
      {
         AV55mmod = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV55mmod_PARM")) ;
      }
      sCtrlAV56mmoi = httpContext.cgiGet( sPrefix+"AV56mmoi_CTRL") ;
      if ( GXutil.len( sCtrlAV56mmoi) > 0 )
      {
         AV56mmoi = localUtil.ctond( httpContext.cgiGet( sCtrlAV56mmoi)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56mmoi", GXutil.ltrimstr( AV56mmoi, 12, 2));
      }
      else
      {
         AV56mmoi = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV56mmoi_PARM")) ;
      }
      sCtrlAV57madc = httpContext.cgiGet( sPrefix+"AV57madc_CTRL") ;
      if ( GXutil.len( sCtrlAV57madc) > 0 )
      {
         AV57madc = localUtil.ctond( httpContext.cgiGet( sCtrlAV57madc)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57madc", GXutil.ltrimstr( AV57madc, 12, 2));
      }
      else
      {
         AV57madc = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV57madc_PARM")) ;
      }
      sCtrlAV58mam = httpContext.cgiGet( sPrefix+"AV58mam_CTRL") ;
      if ( GXutil.len( sCtrlAV58mam) > 0 )
      {
         AV58mam = localUtil.ctond( httpContext.cgiGet( sCtrlAV58mam)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58mam", GXutil.ltrimstr( AV58mam, 12, 2));
      }
      else
      {
         AV58mam = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV58mam_PARM")) ;
      }
      sCtrlAV59mgi = httpContext.cgiGet( sPrefix+"AV59mgi_CTRL") ;
      if ( GXutil.len( sCtrlAV59mgi) > 0 )
      {
         AV59mgi = localUtil.ctond( httpContext.cgiGet( sCtrlAV59mgi)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59mgi", GXutil.ltrimstr( AV59mgi, 12, 2));
      }
      else
      {
         AV59mgi = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV59mgi_PARM")) ;
      }
      sCtrlAV60costeoperario1 = httpContext.cgiGet( sPrefix+"AV60costeoperario1_CTRL") ;
      if ( GXutil.len( sCtrlAV60costeoperario1) > 0 )
      {
         AV60costeoperario1 = localUtil.ctond( httpContext.cgiGet( sCtrlAV60costeoperario1)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60costeoperario1", GXutil.ltrimstr( AV60costeoperario1, 10, 2));
      }
      else
      {
         AV60costeoperario1 = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV60costeoperario1_PARM")) ;
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
      pa2DD2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2DD2( ) ;
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
      ws2DD2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30EmprCod_PARM", GXutil.rtrim( AV30EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30EmprCod_CTRL", GXutil.rtrim( sCtrlAV30EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34Barcod_PARM", GXutil.ltrim( localUtil.ntoc( AV34Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34Barcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34Barcod_CTRL", GXutil.rtrim( sCtrlAV34Barcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35Barcodreo_PARM", GXutil.ltrim( localUtil.ntoc( AV35Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV35Barcodreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35Barcodreo_CTRL", GXutil.rtrim( sCtrlAV35Barcodreo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36Barcodpar_PARM", GXutil.rtrim( AV36Barcodpar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV36Barcodpar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36Barcodpar_CTRL", GXutil.rtrim( sCtrlAV36Barcodpar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46clicod_PARM", GXutil.ltrim( localUtil.ntoc( AV46clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV46clicod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46clicod_CTRL", GXutil.rtrim( sCtrlAV46clicod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47Clinom_PARM", GXutil.rtrim( AV47Clinom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV47Clinom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47Clinom_CTRL", GXutil.rtrim( sCtrlAV47Clinom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV48barser_PARM", GXutil.rtrim( AV48barser));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV48barser)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV48barser_CTRL", GXutil.rtrim( sCtrlAV48barser));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV49barserdsc_PARM", GXutil.rtrim( AV49barserdsc));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV49barserdsc)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV49barserdsc_CTRL", GXutil.rtrim( sCtrlAV49barserdsc));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV50barcolnom_PARM", GXutil.rtrim( AV50barcolnom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV50barcolnom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV50barcolnom_CTRL", GXutil.rtrim( sCtrlAV50barcolnom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51Barcolnum_PARM", GXutil.ltrim( localUtil.ntoc( AV51Barcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV51Barcolnum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51Barcolnum_CTRL", GXutil.rtrim( sCtrlAV51Barcolnum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40BarKgm_PARM", GXutil.ltrim( localUtil.ntoc( AV40BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV40BarKgm)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40BarKgm_CTRL", GXutil.rtrim( sCtrlAV40BarKgm));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42BarMtr_PARM", GXutil.ltrim( localUtil.ntoc( AV42BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV42BarMtr)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42BarMtr_CTRL", GXutil.rtrim( sCtrlAV42BarMtr));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43costefab2_PARM", GXutil.ltrim( localUtil.ntoc( AV43costefab2, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV43costefab2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43costefab2_CTRL", GXutil.rtrim( sCtrlAV43costefab2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV52mAgua_PARM", GXutil.ltrim( localUtil.ntoc( AV52mAgua, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV52mAgua)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV52mAgua_CTRL", GXutil.rtrim( sCtrlAV52mAgua));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV53menergia_PARM", GXutil.ltrim( localUtil.ntoc( AV53menergia, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV53menergia)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV53menergia_CTRL", GXutil.rtrim( sCtrlAV53menergia));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54mgas_PARM", GXutil.ltrim( localUtil.ntoc( AV54mgas, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV54mgas)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54mgas_CTRL", GXutil.rtrim( sCtrlAV54mgas));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV55mmod_PARM", GXutil.ltrim( localUtil.ntoc( AV55mmod, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV55mmod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV55mmod_CTRL", GXutil.rtrim( sCtrlAV55mmod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV56mmoi_PARM", GXutil.ltrim( localUtil.ntoc( AV56mmoi, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV56mmoi)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV56mmoi_CTRL", GXutil.rtrim( sCtrlAV56mmoi));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57madc_PARM", GXutil.ltrim( localUtil.ntoc( AV57madc, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV57madc)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57madc_CTRL", GXutil.rtrim( sCtrlAV57madc));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58mam_PARM", GXutil.ltrim( localUtil.ntoc( AV58mam, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV58mam)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58mam_CTRL", GXutil.rtrim( sCtrlAV58mam));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59mgi_PARM", GXutil.ltrim( localUtil.ntoc( AV59mgi, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV59mgi)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59mgi_CTRL", GXutil.rtrim( sCtrlAV59mgi));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60costeoperario1_PARM", GXutil.ltrim( localUtil.ntoc( AV60costeoperario1, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV60costeoperario1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60costeoperario1_CTRL", GXutil.rtrim( sCtrlAV60costeoperario1));
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
      we2DD2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115551310", true, true);
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
      httpContext.AddJavascriptSource("costesbasicos/costesbasicos_fases_wc.js", "?202682115551310", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_432( )
   {
      edtavCostesbasicos_fases_sdt__barfassec_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__BARFASSEC_"+sGXsfl_43_idx ;
      edtavCostesbasicos_fases_sdt__barordlin_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__BARORDLIN_"+sGXsfl_43_idx ;
      edtavCostesbasicos_fases_sdt__fascod_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__FASCOD_"+sGXsfl_43_idx ;
      edtavCostesbasicos_fases_sdt__fasdsc_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__FASDSC_"+sGXsfl_43_idx ;
      edtavCostesbasicos_fases_sdt__maqcod_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MAQCOD_"+sGXsfl_43_idx ;
      edtavCostesbasicos_fases_sdt__maqdsc_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MAQDSC_"+sGXsfl_43_idx ;
      edtavCostesbasicos_fases_sdt__unidades_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__UNIDADES_"+sGXsfl_43_idx ;
      edtavCostesbasicos_fases_sdt__unidadest_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__UNIDADEST_"+sGXsfl_43_idx ;
      edtavCostesbasicos_fases_sdt__barunimed_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__BARUNIMED_"+sGXsfl_43_idx ;
      edtavCostesbasicos_fases_sdt__horini_5_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__HORINI_5_"+sGXsfl_43_idx ;
      edtavCostesbasicos_fases_sdt__horfin_5_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__HORFIN_5_"+sGXsfl_43_idx ;
      edtavCostesbasicos_fases_sdt__bartierea_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__BARTIEREA_"+sGXsfl_43_idx ;
      edtavCostesbasicos_fases_sdt__tieteo_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__TIETEO_"+sGXsfl_43_idx ;
      edtavCostesbasicos_fases_sdt__tteo_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__TTEO_"+sGXsfl_43_idx ;
      edtavCostesbasicos_fases_sdt__maqcosmin_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MAQCOSMIN_"+sGXsfl_43_idx ;
      edtavCostesbasicos_fases_sdt__coste_m_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__COSTE_M_"+sGXsfl_43_idx ;
      edtavCostesbasicos_fases_sdt__coste_tm_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__COSTE_TM_"+sGXsfl_43_idx ;
      edtavCostesbasicos_fases_sdt__mmod_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MMOD_"+sGXsfl_43_idx ;
      edtavCostesbasicos_fases_sdt__mmoi_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MMOI_"+sGXsfl_43_idx ;
      edtavCostesbasicos_fases_sdt__menergia_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MENERGIA_"+sGXsfl_43_idx ;
      edtavCostesbasicos_fases_sdt__mgas_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MGAS_"+sGXsfl_43_idx ;
      edtavCostesbasicos_fases_sdt__magua_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MAGUA_"+sGXsfl_43_idx ;
      edtavCostesbasicos_fases_sdt__mgi_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MGI_"+sGXsfl_43_idx ;
      edtavCostesbasicos_fases_sdt__madc_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MADC_"+sGXsfl_43_idx ;
      edtavCostesbasicos_fases_sdt__mam_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MAM_"+sGXsfl_43_idx ;
      edtavCostesbasicos_fases_sdt__tiempo_m_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__TIEMPO_M_"+sGXsfl_43_idx ;
      edtavCostesbasicos_fases_sdt__lhipro_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__LHIPRO_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_432( )
   {
      edtavCostesbasicos_fases_sdt__barfassec_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__BARFASSEC_"+sGXsfl_43_fel_idx ;
      edtavCostesbasicos_fases_sdt__barordlin_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__BARORDLIN_"+sGXsfl_43_fel_idx ;
      edtavCostesbasicos_fases_sdt__fascod_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__FASCOD_"+sGXsfl_43_fel_idx ;
      edtavCostesbasicos_fases_sdt__fasdsc_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__FASDSC_"+sGXsfl_43_fel_idx ;
      edtavCostesbasicos_fases_sdt__maqcod_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MAQCOD_"+sGXsfl_43_fel_idx ;
      edtavCostesbasicos_fases_sdt__maqdsc_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MAQDSC_"+sGXsfl_43_fel_idx ;
      edtavCostesbasicos_fases_sdt__unidades_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__UNIDADES_"+sGXsfl_43_fel_idx ;
      edtavCostesbasicos_fases_sdt__unidadest_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__UNIDADEST_"+sGXsfl_43_fel_idx ;
      edtavCostesbasicos_fases_sdt__barunimed_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__BARUNIMED_"+sGXsfl_43_fel_idx ;
      edtavCostesbasicos_fases_sdt__horini_5_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__HORINI_5_"+sGXsfl_43_fel_idx ;
      edtavCostesbasicos_fases_sdt__horfin_5_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__HORFIN_5_"+sGXsfl_43_fel_idx ;
      edtavCostesbasicos_fases_sdt__bartierea_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__BARTIEREA_"+sGXsfl_43_fel_idx ;
      edtavCostesbasicos_fases_sdt__tieteo_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__TIETEO_"+sGXsfl_43_fel_idx ;
      edtavCostesbasicos_fases_sdt__tteo_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__TTEO_"+sGXsfl_43_fel_idx ;
      edtavCostesbasicos_fases_sdt__maqcosmin_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MAQCOSMIN_"+sGXsfl_43_fel_idx ;
      edtavCostesbasicos_fases_sdt__coste_m_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__COSTE_M_"+sGXsfl_43_fel_idx ;
      edtavCostesbasicos_fases_sdt__coste_tm_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__COSTE_TM_"+sGXsfl_43_fel_idx ;
      edtavCostesbasicos_fases_sdt__mmod_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MMOD_"+sGXsfl_43_fel_idx ;
      edtavCostesbasicos_fases_sdt__mmoi_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MMOI_"+sGXsfl_43_fel_idx ;
      edtavCostesbasicos_fases_sdt__menergia_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MENERGIA_"+sGXsfl_43_fel_idx ;
      edtavCostesbasicos_fases_sdt__mgas_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MGAS_"+sGXsfl_43_fel_idx ;
      edtavCostesbasicos_fases_sdt__magua_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MAGUA_"+sGXsfl_43_fel_idx ;
      edtavCostesbasicos_fases_sdt__mgi_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MGI_"+sGXsfl_43_fel_idx ;
      edtavCostesbasicos_fases_sdt__madc_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MADC_"+sGXsfl_43_fel_idx ;
      edtavCostesbasicos_fases_sdt__mam_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MAM_"+sGXsfl_43_fel_idx ;
      edtavCostesbasicos_fases_sdt__tiempo_m_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__TIEMPO_M_"+sGXsfl_43_fel_idx ;
      edtavCostesbasicos_fases_sdt__lhipro_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__LHIPRO_"+sGXsfl_43_fel_idx ;
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wb2DD0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_43_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_43_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_43_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCostesbasicos_fases_sdt__barfassec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__barfassec_Internalname,GXutil.rtrim( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barfassec()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__barfassec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_fases_sdt__barfassec_Visible),Integer.valueOf(edtavCostesbasicos_fases_sdt__barfassec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_fases_sdt__barordlin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__barordlin_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barordlin(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_fases_sdt__barordlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barordlin()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barordlin()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__barordlin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_fases_sdt__barordlin_Visible),Integer.valueOf(edtavCostesbasicos_fases_sdt__barordlin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCostesbasicos_fases_sdt__fascod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__fascod_Internalname,GXutil.rtrim( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fascod()),GXutil.rtrim( localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fascod(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__fascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_fases_sdt__fascod_Visible),Integer.valueOf(edtavCostesbasicos_fases_sdt__fascod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCostesbasicos_fases_sdt__fasdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__fasdsc_Internalname,GXutil.rtrim( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fasdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__fasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_fases_sdt__fasdsc_Visible),Integer.valueOf(edtavCostesbasicos_fases_sdt__fasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCostesbasicos_fases_sdt__maqcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__maqcod_Internalname,GXutil.rtrim( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcod()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__maqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_fases_sdt__maqcod_Visible),Integer.valueOf(edtavCostesbasicos_fases_sdt__maqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCostesbasicos_fases_sdt__maqdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__maqdsc_Internalname,GXutil.rtrim( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__maqdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_fases_sdt__maqdsc_Visible),Integer.valueOf(edtavCostesbasicos_fases_sdt__maqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_fases_sdt__unidades_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__unidades_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidades(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_fases_sdt__unidades_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidades(), "ZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidades(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__unidades_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_fases_sdt__unidades_Visible),Integer.valueOf(edtavCostesbasicos_fases_sdt__unidades_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_fases_sdt__unidadest_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__unidadest_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidadest(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_fases_sdt__unidadest_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidadest(), "ZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidadest(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__unidadest_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_fases_sdt__unidadest_Visible),Integer.valueOf(edtavCostesbasicos_fases_sdt__unidadest_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCostesbasicos_fases_sdt__barunimed_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__barunimed_Internalname,GXutil.rtrim( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barunimed()),GXutil.rtrim( localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barunimed(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__barunimed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_fases_sdt__barunimed_Visible),Integer.valueOf(edtavCostesbasicos_fases_sdt__barunimed_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCostesbasicos_fases_sdt__horini_5_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__horini_5_Internalname,GXutil.rtrim( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horini_5()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__horini_5_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_fases_sdt__horini_5_Visible),Integer.valueOf(edtavCostesbasicos_fases_sdt__horini_5_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCostesbasicos_fases_sdt__horfin_5_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__horfin_5_Internalname,GXutil.rtrim( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horfin_5()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__horfin_5_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_fases_sdt__horfin_5_Visible),Integer.valueOf(edtavCostesbasicos_fases_sdt__horfin_5_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_fases_sdt__bartierea_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__bartierea_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Bartierea(), (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_fases_sdt__bartierea_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Bartierea(), "Z9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Bartierea(), "Z9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__bartierea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_fases_sdt__bartierea_Visible),Integer.valueOf(edtavCostesbasicos_fases_sdt__bartierea_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_fases_sdt__tieteo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__tieteo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tieteo(), (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_fases_sdt__tieteo_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tieteo(), "Z9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tieteo(), "Z9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__tieteo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_fases_sdt__tieteo_Visible),Integer.valueOf(edtavCostesbasicos_fases_sdt__tieteo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_fases_sdt__tteo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__tteo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tteo(), (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_fases_sdt__tteo_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tteo(), "Z9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tteo(), "Z9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__tteo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_fases_sdt__tteo_Visible),Integer.valueOf(edtavCostesbasicos_fases_sdt__tteo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_fases_sdt__maqcosmin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__maqcosmin_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcosmin(), (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_fases_sdt__maqcosmin_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcosmin(), "ZZZZ9.9999") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcosmin(), "ZZZZ9.9999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__maqcosmin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_fases_sdt__maqcosmin_Visible),Integer.valueOf(edtavCostesbasicos_fases_sdt__maqcosmin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_fases_sdt__coste_m_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__coste_m_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_m(), (byte)(16), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_fases_sdt__coste_m_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_m(), "ZZZZZZZZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_m(), "ZZZZZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__coste_m_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_fases_sdt__coste_m_Visible),Integer.valueOf(edtavCostesbasicos_fases_sdt__coste_m_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_fases_sdt__coste_tm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__coste_tm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_tm(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_fases_sdt__coste_tm_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_tm(), "ZZZZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_tm(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__coste_tm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_fases_sdt__coste_tm_Visible),Integer.valueOf(edtavCostesbasicos_fases_sdt__coste_tm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_fases_sdt__mmod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__mmod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmod(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_fases_sdt__mmod_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmod(), "ZZZZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmod(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__mmod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_fases_sdt__mmod_Visible),Integer.valueOf(edtavCostesbasicos_fases_sdt__mmod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_fases_sdt__mmoi_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__mmoi_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmoi(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_fases_sdt__mmoi_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmoi(), "ZZZZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmoi(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__mmoi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_fases_sdt__mmoi_Visible),Integer.valueOf(edtavCostesbasicos_fases_sdt__mmoi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_fases_sdt__menergia_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__menergia_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Menergia(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_fases_sdt__menergia_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Menergia(), "ZZZZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Menergia(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__menergia_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_fases_sdt__menergia_Visible),Integer.valueOf(edtavCostesbasicos_fases_sdt__menergia_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_fases_sdt__mgas_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__mgas_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgas(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_fases_sdt__mgas_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgas(), "ZZZZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgas(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__mgas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_fases_sdt__mgas_Visible),Integer.valueOf(edtavCostesbasicos_fases_sdt__mgas_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_fases_sdt__magua_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__magua_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Magua(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_fases_sdt__magua_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Magua(), "ZZZZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Magua(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__magua_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_fases_sdt__magua_Visible),Integer.valueOf(edtavCostesbasicos_fases_sdt__magua_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_fases_sdt__mgi_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__mgi_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgi(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_fases_sdt__mgi_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgi(), "ZZZZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgi(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__mgi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_fases_sdt__mgi_Visible),Integer.valueOf(edtavCostesbasicos_fases_sdt__mgi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_fases_sdt__madc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__madc_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Madc(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_fases_sdt__madc_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Madc(), "ZZZZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Madc(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__madc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_fases_sdt__madc_Visible),Integer.valueOf(edtavCostesbasicos_fases_sdt__madc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_fases_sdt__mam_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__mam_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mam(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_fases_sdt__mam_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mam(), "ZZZZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mam(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__mam_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_fases_sdt__mam_Visible),Integer.valueOf(edtavCostesbasicos_fases_sdt__mam_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_fases_sdt__tiempo_m_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__tiempo_m_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tiempo_m(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_fases_sdt__tiempo_m_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tiempo_m()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tiempo_m()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__tiempo_m_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_fases_sdt__tiempo_m_Visible),Integer.valueOf(edtavCostesbasicos_fases_sdt__tiempo_m_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_fases_sdt__lhipro_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Lhipro(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_fases_sdt__lhipro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Lhipro()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV13CostesBasicos_Fases_SDT.elementAt(-1+AV64GXV1)).getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Lhipro()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_fases_sdt__lhipro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCostesbasicos_fases_sdt__lhipro_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2DD2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      /* End function sendrow_432 */
   }

   public void startgridcontrol43( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"43\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_fases_sdt__barfassec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_fases_sdt__barordlin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_fases_sdt__fascod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_fases_sdt__fasdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_fases_sdt__maqcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_fases_sdt__maqdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_fases_sdt__unidades_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidades", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_fases_sdt__unidadest_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidades Tot.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_fases_sdt__barunimed_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_fases_sdt__horini_5_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_fases_sdt__horfin_5_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_fases_sdt__bartierea_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T. Real", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_fases_sdt__tieteo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T. Teo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_fases_sdt__tteo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T. Teo (calc.)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_fases_sdt__maqcosmin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Mm", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_fases_sdt__coste_m_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Real", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_fases_sdt__coste_tm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Teo.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_fases_sdt__mmod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "MOD", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_fases_sdt__mmoi_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "MOI", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_fases_sdt__menergia_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Energia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_fases_sdt__mgas_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Gas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_fases_sdt__magua_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Agua", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_fases_sdt__mgi_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Gastos Ind.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_fases_sdt__madc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Adm. Cent.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_fases_sdt__mam_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Amortizaciones", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_fases_sdt__tiempo_m_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tiempo m", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
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
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__barfassec_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__barfassec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__barordlin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__barordlin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__fascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__fascod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__fasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__fasdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__maqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__maqcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__maqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__maqdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__unidades_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__unidades_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__unidadest_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__unidadest_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__barunimed_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__barunimed_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__horini_5_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__horini_5_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__horfin_5_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__horfin_5_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__bartierea_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__bartierea_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__tieteo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__tieteo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__tteo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__tteo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__maqcosmin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__maqcosmin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__coste_m_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__coste_m_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__coste_tm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__coste_tm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__mmod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__mmod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__mmoi_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__mmoi_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__menergia_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__menergia_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__mgas_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__mgas_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__magua_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__magua_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__mgi_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__mgi_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__madc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__madc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__mam_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__mam_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__tiempo_m_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__tiempo_m_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_fases_sdt__lhipro_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtnficha_Internalname = sPrefix+"BTNFICHA" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavCostesbasicos_fases_sdt__barfassec_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__BARFASSEC" ;
      edtavCostesbasicos_fases_sdt__barordlin_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__BARORDLIN" ;
      edtavCostesbasicos_fases_sdt__fascod_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__FASCOD" ;
      edtavCostesbasicos_fases_sdt__fasdsc_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__FASDSC" ;
      edtavCostesbasicos_fases_sdt__maqcod_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MAQCOD" ;
      edtavCostesbasicos_fases_sdt__maqdsc_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MAQDSC" ;
      edtavCostesbasicos_fases_sdt__unidades_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__UNIDADES" ;
      edtavCostesbasicos_fases_sdt__unidadest_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__UNIDADEST" ;
      edtavCostesbasicos_fases_sdt__barunimed_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__BARUNIMED" ;
      edtavCostesbasicos_fases_sdt__horini_5_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__HORINI_5" ;
      edtavCostesbasicos_fases_sdt__horfin_5_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__HORFIN_5" ;
      edtavCostesbasicos_fases_sdt__bartierea_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__BARTIEREA" ;
      edtavCostesbasicos_fases_sdt__tieteo_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__TIETEO" ;
      edtavCostesbasicos_fases_sdt__tteo_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__TTEO" ;
      edtavCostesbasicos_fases_sdt__maqcosmin_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MAQCOSMIN" ;
      edtavCostesbasicos_fases_sdt__coste_m_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__COSTE_M" ;
      edtavCostesbasicos_fases_sdt__coste_tm_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__COSTE_TM" ;
      edtavCostesbasicos_fases_sdt__mmod_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MMOD" ;
      edtavCostesbasicos_fases_sdt__mmoi_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MMOI" ;
      edtavCostesbasicos_fases_sdt__menergia_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MENERGIA" ;
      edtavCostesbasicos_fases_sdt__mgas_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MGAS" ;
      edtavCostesbasicos_fases_sdt__magua_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MAGUA" ;
      edtavCostesbasicos_fases_sdt__mgi_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MGI" ;
      edtavCostesbasicos_fases_sdt__madc_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MADC" ;
      edtavCostesbasicos_fases_sdt__mam_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__MAM" ;
      edtavCostesbasicos_fases_sdt__tiempo_m_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__TIEMPO_M" ;
      edtavCostesbasicos_fases_sdt__lhipro_Internalname = sPrefix+"COSTESBASICOS_FASES_SDT__LHIPRO" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
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
      edtavCostesbasicos_fases_sdt__lhipro_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__lhipro_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__tiempo_m_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__tiempo_m_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__tiempo_m_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__mam_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__mam_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__mam_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__madc_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__madc_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__madc_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__mgi_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__mgi_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__mgi_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__magua_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__magua_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__magua_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__mgas_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__mgas_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__mgas_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__menergia_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__menergia_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__menergia_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__mmoi_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__mmoi_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__mmoi_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__mmod_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__mmod_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__mmod_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__coste_tm_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__coste_tm_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__coste_tm_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__coste_m_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__coste_m_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__coste_m_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__maqcosmin_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__maqcosmin_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__maqcosmin_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__tteo_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__tteo_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__tteo_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__tieteo_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__tieteo_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__tieteo_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__bartierea_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__bartierea_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__bartierea_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__horfin_5_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__horfin_5_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__horfin_5_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__horini_5_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__horini_5_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__horini_5_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__barunimed_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__barunimed_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__barunimed_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__unidadest_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__unidadest_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__unidadest_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__unidades_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__unidades_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__unidades_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__maqdsc_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__maqdsc_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__maqdsc_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__maqcod_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__maqcod_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__maqcod_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__fasdsc_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__fasdsc_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__fasdsc_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__fascod_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__fascod_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__fascod_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__barordlin_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__barordlin_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__barordlin_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__barfassec_Jsonclick = "" ;
      edtavCostesbasicos_fases_sdt__barfassec_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__barfassec_Visible = -1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavCostesbasicos_fases_sdt__tiempo_m_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__mam_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__madc_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__mgi_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__magua_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__mgas_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__menergia_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__mmoi_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__mmod_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__coste_tm_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__coste_m_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__maqcosmin_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__tteo_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__tieteo_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__bartierea_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__horfin_5_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__horini_5_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__barunimed_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__unidadest_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__unidades_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__maqdsc_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__maqcod_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__fasdsc_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__fascod_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__barordlin_Visible = -1 ;
      edtavCostesbasicos_fases_sdt__barfassec_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavCostesbasicos_fases_sdt__lhipro_Enabled = -1 ;
      edtavCostesbasicos_fases_sdt__tiempo_m_Enabled = -1 ;
      edtavCostesbasicos_fases_sdt__mam_Enabled = -1 ;
      edtavCostesbasicos_fases_sdt__madc_Enabled = -1 ;
      edtavCostesbasicos_fases_sdt__mgi_Enabled = -1 ;
      edtavCostesbasicos_fases_sdt__magua_Enabled = -1 ;
      edtavCostesbasicos_fases_sdt__mgas_Enabled = -1 ;
      edtavCostesbasicos_fases_sdt__menergia_Enabled = -1 ;
      edtavCostesbasicos_fases_sdt__mmoi_Enabled = -1 ;
      edtavCostesbasicos_fases_sdt__mmod_Enabled = -1 ;
      edtavCostesbasicos_fases_sdt__coste_tm_Enabled = -1 ;
      edtavCostesbasicos_fases_sdt__coste_m_Enabled = -1 ;
      edtavCostesbasicos_fases_sdt__maqcosmin_Enabled = -1 ;
      edtavCostesbasicos_fases_sdt__tteo_Enabled = -1 ;
      edtavCostesbasicos_fases_sdt__tieteo_Enabled = -1 ;
      edtavCostesbasicos_fases_sdt__bartierea_Enabled = -1 ;
      edtavCostesbasicos_fases_sdt__horfin_5_Enabled = -1 ;
      edtavCostesbasicos_fases_sdt__horini_5_Enabled = -1 ;
      edtavCostesbasicos_fases_sdt__barunimed_Enabled = -1 ;
      edtavCostesbasicos_fases_sdt__unidadest_Enabled = -1 ;
      edtavCostesbasicos_fases_sdt__unidades_Enabled = -1 ;
      edtavCostesbasicos_fases_sdt__maqdsc_Enabled = -1 ;
      edtavCostesbasicos_fases_sdt__maqcod_Enabled = -1 ;
      edtavCostesbasicos_fases_sdt__fasdsc_Enabled = -1 ;
      edtavCostesbasicos_fases_sdt__fascod_Enabled = -1 ;
      edtavCostesbasicos_fases_sdt__barordlin_Enabled = -1 ;
      edtavCostesbasicos_fases_sdt__barfassec_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "|||||||||||||||||||||||||" ;
      Ddo_grid_Columnids = "0:CostesBasicos_Fases_SDT__Barfassec|1:CostesBasicos_Fases_SDT__Barordlin|2:CostesBasicos_Fases_SDT__Fascod|3:CostesBasicos_Fases_SDT__Fasdsc|4:CostesBasicos_Fases_SDT__Maqcod|5:CostesBasicos_Fases_SDT__MaqDsc|6:CostesBasicos_Fases_SDT__Unidades|7:CostesBasicos_Fases_SDT__UnidadesT|8:CostesBasicos_Fases_SDT__BarUnimed|9:CostesBasicos_Fases_SDT__HorIni_5|10:CostesBasicos_Fases_SDT__HorFin_5|11:CostesBasicos_Fases_SDT__BarTieRea|12:CostesBasicos_Fases_SDT__TieTeo|13:CostesBasicos_Fases_SDT__TTeo|14:CostesBasicos_Fases_SDT__MaqCosMin|15:CostesBasicos_Fases_SDT__Coste_m|16:CostesBasicos_Fases_SDT__Coste_tm|17:CostesBasicos_Fases_SDT__Mmod|18:CostesBasicos_Fases_SDT__Mmoi|19:CostesBasicos_Fases_SDT__Menergia|20:CostesBasicos_Fases_SDT__Mgas|21:CostesBasicos_Fases_SDT__Magua|22:CostesBasicos_Fases_SDT__Mgi|23:CostesBasicos_Fases_SDT__Madc|24:CostesBasicos_Fases_SDT__Mam|25:CostesBasicos_Fases_SDT__Tiempo_m" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13CostesBasicos_Fases_SDT',fld:'vCOSTESBASICOS_FASES_SDT',grid:43,pic:''},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'sPrefix'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV34Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV35Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV36Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV46clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV47Clinom',fld:'vCLINOM',pic:''},{av:'AV48barser',fld:'vBARSER',pic:''},{av:'AV49barserdsc',fld:'vBARSERDSC',pic:''},{av:'AV50barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV51Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV40BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV42BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV43costefab2',fld:'vCOSTEFAB2',pic:'ZZZZZZ9.99'},{av:'AV52mAgua',fld:'vMAGUA',pic:'ZZZZZZZZ9.99'},{av:'AV53menergia',fld:'vMENERGIA',pic:'ZZZZZZZZ9.99'},{av:'AV54mgas',fld:'vMGAS',pic:'ZZZZZZZZ9.99'},{av:'AV55mmod',fld:'vMMOD',pic:'ZZZZZZZZ9.99'},{av:'AV56mmoi',fld:'vMMOI',pic:'ZZZZZZZZ9.99'},{av:'AV57madc',fld:'vMADC',pic:'ZZZZZZZZ9.99'},{av:'AV58mam',fld:'vMAM',pic:'ZZZZZZZZ9.99'},{av:'AV59mgi',fld:'vMGI',pic:'ZZZZZZZZ9.99'},{av:'AV60costeoperario1',fld:'vCOSTEOPERARIO1',pic:'ZZZZZZ9.99'},{av:'AV31TasasEstandar',fld:'vTASASESTANDAR',pic:'ZZZ9',hsh:true},{av:'AV33Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV61reoperados',fld:'vREOPERADOS',pic:'9',hsh:true},{av:'AV37CostesBasicos_Fases_SDTjson',fld:'vCOSTESBASICOS_FASES_SDTJSON',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'COSTESBASICOS_FASES_SDT__BARFASSEC',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__BARORDLIN',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__FASCOD',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__FASDSC',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MAQCOD',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MAQDSC',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__UNIDADES',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__UNIDADEST',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__BARUNIMED',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__HORINI_5',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__HORFIN_5',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__BARTIEREA',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__TIETEO',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__TTEO',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MAQCOSMIN',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__COSTE_M',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__COSTE_TM',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MMOD',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MMOI',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MENERGIA',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MGAS',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MAGUA',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MGI',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MADC',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MAM',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__TIEMPO_M',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e122DD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13CostesBasicos_Fases_SDT',fld:'vCOSTESBASICOS_FASES_SDT',grid:43,pic:''},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV34Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV35Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV36Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV46clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV47Clinom',fld:'vCLINOM',pic:''},{av:'AV48barser',fld:'vBARSER',pic:''},{av:'AV49barserdsc',fld:'vBARSERDSC',pic:''},{av:'AV50barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV51Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV40BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV42BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV43costefab2',fld:'vCOSTEFAB2',pic:'ZZZZZZ9.99'},{av:'AV52mAgua',fld:'vMAGUA',pic:'ZZZZZZZZ9.99'},{av:'AV53menergia',fld:'vMENERGIA',pic:'ZZZZZZZZ9.99'},{av:'AV54mgas',fld:'vMGAS',pic:'ZZZZZZZZ9.99'},{av:'AV55mmod',fld:'vMMOD',pic:'ZZZZZZZZ9.99'},{av:'AV56mmoi',fld:'vMMOI',pic:'ZZZZZZZZ9.99'},{av:'AV57madc',fld:'vMADC',pic:'ZZZZZZZZ9.99'},{av:'AV58mam',fld:'vMAM',pic:'ZZZZZZZZ9.99'},{av:'AV59mgi',fld:'vMGI',pic:'ZZZZZZZZ9.99'},{av:'AV60costeoperario1',fld:'vCOSTEOPERARIO1',pic:'ZZZZZZ9.99'},{av:'AV31TasasEstandar',fld:'vTASASESTANDAR',pic:'ZZZ9',hsh:true},{av:'AV33Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV61reoperados',fld:'vREOPERADOS',pic:'9',hsh:true},{av:'AV37CostesBasicos_Fases_SDTjson',fld:'vCOSTESBASICOS_FASES_SDTJSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e132DD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13CostesBasicos_Fases_SDT',fld:'vCOSTESBASICOS_FASES_SDT',grid:43,pic:''},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV34Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV35Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV36Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV46clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV47Clinom',fld:'vCLINOM',pic:''},{av:'AV48barser',fld:'vBARSER',pic:''},{av:'AV49barserdsc',fld:'vBARSERDSC',pic:''},{av:'AV50barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV51Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV40BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV42BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV43costefab2',fld:'vCOSTEFAB2',pic:'ZZZZZZ9.99'},{av:'AV52mAgua',fld:'vMAGUA',pic:'ZZZZZZZZ9.99'},{av:'AV53menergia',fld:'vMENERGIA',pic:'ZZZZZZZZ9.99'},{av:'AV54mgas',fld:'vMGAS',pic:'ZZZZZZZZ9.99'},{av:'AV55mmod',fld:'vMMOD',pic:'ZZZZZZZZ9.99'},{av:'AV56mmoi',fld:'vMMOI',pic:'ZZZZZZZZ9.99'},{av:'AV57madc',fld:'vMADC',pic:'ZZZZZZZZ9.99'},{av:'AV58mam',fld:'vMAM',pic:'ZZZZZZZZ9.99'},{av:'AV59mgi',fld:'vMGI',pic:'ZZZZZZZZ9.99'},{av:'AV60costeoperario1',fld:'vCOSTEOPERARIO1',pic:'ZZZZZZ9.99'},{av:'AV31TasasEstandar',fld:'vTASASESTANDAR',pic:'ZZZ9',hsh:true},{av:'AV33Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV61reoperados',fld:'vREOPERADOS',pic:'9',hsh:true},{av:'AV37CostesBasicos_Fases_SDTjson',fld:'vCOSTESBASICOS_FASES_SDTJSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e202DD2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e142DD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13CostesBasicos_Fases_SDT',fld:'vCOSTESBASICOS_FASES_SDT',grid:43,pic:''},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV34Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV35Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV36Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV46clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV47Clinom',fld:'vCLINOM',pic:''},{av:'AV48barser',fld:'vBARSER',pic:''},{av:'AV49barserdsc',fld:'vBARSERDSC',pic:''},{av:'AV50barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV51Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV40BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV42BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV43costefab2',fld:'vCOSTEFAB2',pic:'ZZZZZZ9.99'},{av:'AV52mAgua',fld:'vMAGUA',pic:'ZZZZZZZZ9.99'},{av:'AV53menergia',fld:'vMENERGIA',pic:'ZZZZZZZZ9.99'},{av:'AV54mgas',fld:'vMGAS',pic:'ZZZZZZZZ9.99'},{av:'AV55mmod',fld:'vMMOD',pic:'ZZZZZZZZ9.99'},{av:'AV56mmoi',fld:'vMMOI',pic:'ZZZZZZZZ9.99'},{av:'AV57madc',fld:'vMADC',pic:'ZZZZZZZZ9.99'},{av:'AV58mam',fld:'vMAM',pic:'ZZZZZZZZ9.99'},{av:'AV59mgi',fld:'vMGI',pic:'ZZZZZZZZ9.99'},{av:'AV60costeoperario1',fld:'vCOSTEOPERARIO1',pic:'ZZZZZZ9.99'},{av:'AV31TasasEstandar',fld:'vTASASESTANDAR',pic:'ZZZ9',hsh:true},{av:'AV33Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV61reoperados',fld:'vREOPERADOS',pic:'9',hsh:true},{av:'AV37CostesBasicos_Fases_SDTjson',fld:'vCOSTESBASICOS_FASES_SDTJSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{ctrl:'COSTESBASICOS_FASES_SDT__BARFASSEC',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__BARORDLIN',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__FASCOD',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__FASDSC',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MAQCOD',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MAQDSC',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__UNIDADES',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__UNIDADEST',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__BARUNIMED',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__HORINI_5',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__HORFIN_5',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__BARTIEREA',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__TIETEO',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__TTEO',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MAQCOSMIN',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__COSTE_M',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__COSTE_TM',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MMOD',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MMOI',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MENERGIA',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MGAS',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MAGUA',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MGI',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MADC',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MAM',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__TIEMPO_M',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e112DD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13CostesBasicos_Fases_SDT',fld:'vCOSTESBASICOS_FASES_SDT',grid:43,pic:''},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV34Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV35Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV36Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV46clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV47Clinom',fld:'vCLINOM',pic:''},{av:'AV48barser',fld:'vBARSER',pic:''},{av:'AV49barserdsc',fld:'vBARSERDSC',pic:''},{av:'AV50barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV51Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV40BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV42BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV43costefab2',fld:'vCOSTEFAB2',pic:'ZZZZZZ9.99'},{av:'AV52mAgua',fld:'vMAGUA',pic:'ZZZZZZZZ9.99'},{av:'AV53menergia',fld:'vMENERGIA',pic:'ZZZZZZZZ9.99'},{av:'AV54mgas',fld:'vMGAS',pic:'ZZZZZZZZ9.99'},{av:'AV55mmod',fld:'vMMOD',pic:'ZZZZZZZZ9.99'},{av:'AV56mmoi',fld:'vMMOI',pic:'ZZZZZZZZ9.99'},{av:'AV57madc',fld:'vMADC',pic:'ZZZZZZZZ9.99'},{av:'AV58mam',fld:'vMAM',pic:'ZZZZZZZZ9.99'},{av:'AV59mgi',fld:'vMGI',pic:'ZZZZZZZZ9.99'},{av:'AV60costeoperario1',fld:'vCOSTEOPERARIO1',pic:'ZZZZZZ9.99'},{av:'AV31TasasEstandar',fld:'vTASASESTANDAR',pic:'ZZZ9',hsh:true},{av:'AV33Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV61reoperados',fld:'vREOPERADOS',pic:'9',hsh:true},{av:'AV37CostesBasicos_Fases_SDTjson',fld:'vCOSTESBASICOS_FASES_SDTJSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'COSTESBASICOS_FASES_SDT__BARFASSEC',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__BARORDLIN',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__FASCOD',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__FASDSC',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MAQCOD',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MAQDSC',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__UNIDADES',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__UNIDADEST',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__BARUNIMED',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__HORINI_5',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__HORFIN_5',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__BARTIEREA',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__TIETEO',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__TTEO',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MAQCOSMIN',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__COSTE_M',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__COSTE_TM',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MMOD',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MMOI',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MENERGIA',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MGAS',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MAGUA',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MGI',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MADC',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__MAM',prop:'Visible'},{ctrl:'COSTESBASICOS_FASES_SDT__TIEMPO_M',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOFICHA'","{handler:'e152DD2',iparms:[{av:'AV30EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV34Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV35Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV36Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV33Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV46clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV47Clinom',fld:'vCLINOM',pic:''},{av:'AV48barser',fld:'vBARSER',pic:''},{av:'AV49barserdsc',fld:'vBARSERDSC',pic:''},{av:'AV50barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV51Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV40BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV42BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV43costefab2',fld:'vCOSTEFAB2',pic:'ZZZZZZ9.99'},{av:'AV61reoperados',fld:'vREOPERADOS',pic:'9',hsh:true},{av:'AV52mAgua',fld:'vMAGUA',pic:'ZZZZZZZZ9.99'},{av:'AV53menergia',fld:'vMENERGIA',pic:'ZZZZZZZZ9.99'},{av:'AV54mgas',fld:'vMGAS',pic:'ZZZZZZZZ9.99'},{av:'AV55mmod',fld:'vMMOD',pic:'ZZZZZZZZ9.99'},{av:'AV56mmoi',fld:'vMMOI',pic:'ZZZZZZZZ9.99'},{av:'AV57madc',fld:'vMADC',pic:'ZZZZZZZZ9.99'},{av:'AV58mam',fld:'vMAM',pic:'ZZZZZZZZ9.99'},{av:'AV59mgi',fld:'vMGI',pic:'ZZZZZZZZ9.99'},{av:'AV60costeoperario1',fld:'vCOSTEOPERARIO1',pic:'ZZZZZZ9.99'}]");
      setEventMetadata("'DOFICHA'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e162DD2',iparms:[{av:'AV37CostesBasicos_Fases_SDTjson',fld:'vCOSTESBASICOS_FASES_SDTJSON',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e172DD2',iparms:[{av:'AV37CostesBasicos_Fases_SDTjson',fld:'vCOSTESBASICOS_FASES_SDTJSON',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALIDV_GXV10","{handler:'validv_Gxv10',iparms:[]");
      setEventMetadata("VALIDV_GXV10",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv28',iparms:[]");
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
      wcpOAV30EmprCod = "" ;
      wcpOAV36Barcodpar = "" ;
      wcpOAV47Clinom = "" ;
      wcpOAV48barser = "" ;
      wcpOAV49barserdsc = "" ;
      wcpOAV50barcolnom = "" ;
      wcpOAV40BarKgm = DecimalUtil.ZERO ;
      wcpOAV42BarMtr = DecimalUtil.ZERO ;
      wcpOAV43costefab2 = DecimalUtil.ZERO ;
      wcpOAV52mAgua = DecimalUtil.ZERO ;
      wcpOAV53menergia = DecimalUtil.ZERO ;
      wcpOAV54mgas = DecimalUtil.ZERO ;
      wcpOAV55mmod = DecimalUtil.ZERO ;
      wcpOAV56mmoi = DecimalUtil.ZERO ;
      wcpOAV57madc = DecimalUtil.ZERO ;
      wcpOAV58mam = DecimalUtil.ZERO ;
      wcpOAV59mgi = DecimalUtil.ZERO ;
      wcpOAV60costeoperario1 = DecimalUtil.ZERO ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV30EmprCod = "" ;
      AV36Barcodpar = "" ;
      AV47Clinom = "" ;
      AV48barser = "" ;
      AV49barserdsc = "" ;
      AV50barcolnom = "" ;
      AV40BarKgm = DecimalUtil.ZERO ;
      AV42BarMtr = DecimalUtil.ZERO ;
      AV43costefab2 = DecimalUtil.ZERO ;
      AV52mAgua = DecimalUtil.ZERO ;
      AV53menergia = DecimalUtil.ZERO ;
      AV54mgas = DecimalUtil.ZERO ;
      AV55mmod = DecimalUtil.ZERO ;
      AV56mmoi = DecimalUtil.ZERO ;
      AV57madc = DecimalUtil.ZERO ;
      AV58mam = DecimalUtil.ZERO ;
      AV59mgi = DecimalUtil.ZERO ;
      AV60costeoperario1 = DecimalUtil.ZERO ;
      AV18ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV92Pgmname = "" ;
      AV12FilterFullText = "" ;
      AV33Station = "" ;
      AV37CostesBasicos_Fases_SDTjson = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV13CostesBasicos_Fases_SDT = new GXBaseCollection<app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem>(app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem.class, "CostesBasicos_Fases_SDTItem", "TexplusNET", remoteHandle);
      AV21ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV24DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtnficha_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      GXv_char2 = new String[1] ;
      AV28EmprNom = "" ;
      AV29UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_int8 = new byte[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV20Session = httpContext.getWebSession();
      AV16ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV22ManageFiltersXml = "" ;
      AV14ExcelFilename = "" ;
      AV15ErrorMessage = "" ;
      AV38Websession = httpContext.getWebSession();
      GXv_char3 = new String[1] ;
      AV17UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV19ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState14 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV30EmprCod = "" ;
      sCtrlAV34Barcod = "" ;
      sCtrlAV35Barcodreo = "" ;
      sCtrlAV36Barcodpar = "" ;
      sCtrlAV46clicod = "" ;
      sCtrlAV47Clinom = "" ;
      sCtrlAV48barser = "" ;
      sCtrlAV49barserdsc = "" ;
      sCtrlAV50barcolnom = "" ;
      sCtrlAV51Barcolnum = "" ;
      sCtrlAV40BarKgm = "" ;
      sCtrlAV42BarMtr = "" ;
      sCtrlAV43costefab2 = "" ;
      sCtrlAV52mAgua = "" ;
      sCtrlAV53menergia = "" ;
      sCtrlAV54mgas = "" ;
      sCtrlAV55mmod = "" ;
      sCtrlAV56mmoi = "" ;
      sCtrlAV57madc = "" ;
      sCtrlAV58mam = "" ;
      sCtrlAV59mgi = "" ;
      sCtrlAV60costeoperario1 = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV92Pgmname = "CostesBasicos.CostesBasicos_Fases_WC" ;
      /* GeneXus formulas. */
      AV92Pgmname = "CostesBasicos.CostesBasicos_Fases_WC" ;
      Gx_err = (short)(0) ;
      edtavCostesbasicos_fases_sdt__barfassec_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__barordlin_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__fascod_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__fasdsc_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__maqcod_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__maqdsc_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__unidades_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__unidadest_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__barunimed_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__horini_5_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__horfin_5_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__bartierea_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__tieteo_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__tteo_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__maqcosmin_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__coste_m_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__coste_tm_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__mmod_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__mmoi_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__menergia_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__mgas_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__magua_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__mgi_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__madc_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__mam_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__tiempo_m_Enabled = 0 ;
      edtavCostesbasicos_fases_sdt__lhipro_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV35Barcodreo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV35Barcodreo ;
   private byte AV23ManageFiltersExecutionStep ;
   private byte AV61reoperados ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV31TasasEstandar ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV32Moda21 ;
   private int wcpOAV34Barcod ;
   private int wcpOAV46clicod ;
   private int wcpOAV51Barcolnum ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_43 ;
   private int AV34Barcod ;
   private int AV46clicod ;
   private int AV51Barcolnum ;
   private int nGXsfl_43_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV64GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavCostesbasicos_fases_sdt__barfassec_Enabled ;
   private int edtavCostesbasicos_fases_sdt__barordlin_Enabled ;
   private int edtavCostesbasicos_fases_sdt__fascod_Enabled ;
   private int edtavCostesbasicos_fases_sdt__fasdsc_Enabled ;
   private int edtavCostesbasicos_fases_sdt__maqcod_Enabled ;
   private int edtavCostesbasicos_fases_sdt__maqdsc_Enabled ;
   private int edtavCostesbasicos_fases_sdt__unidades_Enabled ;
   private int edtavCostesbasicos_fases_sdt__unidadest_Enabled ;
   private int edtavCostesbasicos_fases_sdt__barunimed_Enabled ;
   private int edtavCostesbasicos_fases_sdt__horini_5_Enabled ;
   private int edtavCostesbasicos_fases_sdt__horfin_5_Enabled ;
   private int edtavCostesbasicos_fases_sdt__bartierea_Enabled ;
   private int edtavCostesbasicos_fases_sdt__tieteo_Enabled ;
   private int edtavCostesbasicos_fases_sdt__tteo_Enabled ;
   private int edtavCostesbasicos_fases_sdt__maqcosmin_Enabled ;
   private int edtavCostesbasicos_fases_sdt__coste_m_Enabled ;
   private int edtavCostesbasicos_fases_sdt__coste_tm_Enabled ;
   private int edtavCostesbasicos_fases_sdt__mmod_Enabled ;
   private int edtavCostesbasicos_fases_sdt__mmoi_Enabled ;
   private int edtavCostesbasicos_fases_sdt__menergia_Enabled ;
   private int edtavCostesbasicos_fases_sdt__mgas_Enabled ;
   private int edtavCostesbasicos_fases_sdt__magua_Enabled ;
   private int edtavCostesbasicos_fases_sdt__mgi_Enabled ;
   private int edtavCostesbasicos_fases_sdt__madc_Enabled ;
   private int edtavCostesbasicos_fases_sdt__mam_Enabled ;
   private int edtavCostesbasicos_fases_sdt__tiempo_m_Enabled ;
   private int edtavCostesbasicos_fases_sdt__lhipro_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_43_fel_idx=1 ;
   private int edtavCostesbasicos_fases_sdt__barfassec_Visible ;
   private int edtavCostesbasicos_fases_sdt__barordlin_Visible ;
   private int edtavCostesbasicos_fases_sdt__fascod_Visible ;
   private int edtavCostesbasicos_fases_sdt__fasdsc_Visible ;
   private int edtavCostesbasicos_fases_sdt__maqcod_Visible ;
   private int edtavCostesbasicos_fases_sdt__maqdsc_Visible ;
   private int edtavCostesbasicos_fases_sdt__unidades_Visible ;
   private int edtavCostesbasicos_fases_sdt__unidadest_Visible ;
   private int edtavCostesbasicos_fases_sdt__barunimed_Visible ;
   private int edtavCostesbasicos_fases_sdt__horini_5_Visible ;
   private int edtavCostesbasicos_fases_sdt__horfin_5_Visible ;
   private int edtavCostesbasicos_fases_sdt__bartierea_Visible ;
   private int edtavCostesbasicos_fases_sdt__tieteo_Visible ;
   private int edtavCostesbasicos_fases_sdt__tteo_Visible ;
   private int edtavCostesbasicos_fases_sdt__maqcosmin_Visible ;
   private int edtavCostesbasicos_fases_sdt__coste_m_Visible ;
   private int edtavCostesbasicos_fases_sdt__coste_tm_Visible ;
   private int edtavCostesbasicos_fases_sdt__mmod_Visible ;
   private int edtavCostesbasicos_fases_sdt__mmoi_Visible ;
   private int edtavCostesbasicos_fases_sdt__menergia_Visible ;
   private int edtavCostesbasicos_fases_sdt__mgas_Visible ;
   private int edtavCostesbasicos_fases_sdt__magua_Visible ;
   private int edtavCostesbasicos_fases_sdt__mgi_Visible ;
   private int edtavCostesbasicos_fases_sdt__madc_Visible ;
   private int edtavCostesbasicos_fases_sdt__mam_Visible ;
   private int edtavCostesbasicos_fases_sdt__tiempo_m_Visible ;
   private int AV25PageToGo ;
   private int AV93GXV29 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV26GridCurrentPage ;
   private long AV27GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal wcpOAV40BarKgm ;
   private java.math.BigDecimal wcpOAV42BarMtr ;
   private java.math.BigDecimal wcpOAV43costefab2 ;
   private java.math.BigDecimal wcpOAV52mAgua ;
   private java.math.BigDecimal wcpOAV53menergia ;
   private java.math.BigDecimal wcpOAV54mgas ;
   private java.math.BigDecimal wcpOAV55mmod ;
   private java.math.BigDecimal wcpOAV56mmoi ;
   private java.math.BigDecimal wcpOAV57madc ;
   private java.math.BigDecimal wcpOAV58mam ;
   private java.math.BigDecimal wcpOAV59mgi ;
   private java.math.BigDecimal wcpOAV60costeoperario1 ;
   private java.math.BigDecimal AV40BarKgm ;
   private java.math.BigDecimal AV42BarMtr ;
   private java.math.BigDecimal AV43costefab2 ;
   private java.math.BigDecimal AV52mAgua ;
   private java.math.BigDecimal AV53menergia ;
   private java.math.BigDecimal AV54mgas ;
   private java.math.BigDecimal AV55mmod ;
   private java.math.BigDecimal AV56mmoi ;
   private java.math.BigDecimal AV57madc ;
   private java.math.BigDecimal AV58mam ;
   private java.math.BigDecimal AV59mgi ;
   private java.math.BigDecimal AV60costeoperario1 ;
   private String wcpOAV30EmprCod ;
   private String wcpOAV36Barcodpar ;
   private String wcpOAV47Clinom ;
   private String wcpOAV48barser ;
   private String wcpOAV49barserdsc ;
   private String wcpOAV50barcolnom ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV30EmprCod ;
   private String AV36Barcodpar ;
   private String AV47Clinom ;
   private String AV48barser ;
   private String AV49barserdsc ;
   private String AV50barcolnom ;
   private String sGXsfl_43_idx="0001" ;
   private String AV92Pgmname ;
   private String AV33Station ;
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
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Fixable ;
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
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtnficha_Internalname ;
   private String bttBtnficha_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String edtavCostesbasicos_fases_sdt__barfassec_Internalname ;
   private String edtavCostesbasicos_fases_sdt__barordlin_Internalname ;
   private String edtavCostesbasicos_fases_sdt__fascod_Internalname ;
   private String edtavCostesbasicos_fases_sdt__fasdsc_Internalname ;
   private String edtavCostesbasicos_fases_sdt__maqcod_Internalname ;
   private String edtavCostesbasicos_fases_sdt__maqdsc_Internalname ;
   private String edtavCostesbasicos_fases_sdt__unidades_Internalname ;
   private String edtavCostesbasicos_fases_sdt__unidadest_Internalname ;
   private String edtavCostesbasicos_fases_sdt__barunimed_Internalname ;
   private String edtavCostesbasicos_fases_sdt__horini_5_Internalname ;
   private String edtavCostesbasicos_fases_sdt__horfin_5_Internalname ;
   private String edtavCostesbasicos_fases_sdt__bartierea_Internalname ;
   private String edtavCostesbasicos_fases_sdt__tieteo_Internalname ;
   private String edtavCostesbasicos_fases_sdt__tteo_Internalname ;
   private String edtavCostesbasicos_fases_sdt__maqcosmin_Internalname ;
   private String edtavCostesbasicos_fases_sdt__coste_m_Internalname ;
   private String edtavCostesbasicos_fases_sdt__coste_tm_Internalname ;
   private String edtavCostesbasicos_fases_sdt__mmod_Internalname ;
   private String edtavCostesbasicos_fases_sdt__mmoi_Internalname ;
   private String edtavCostesbasicos_fases_sdt__menergia_Internalname ;
   private String edtavCostesbasicos_fases_sdt__mgas_Internalname ;
   private String edtavCostesbasicos_fases_sdt__magua_Internalname ;
   private String edtavCostesbasicos_fases_sdt__mgi_Internalname ;
   private String edtavCostesbasicos_fases_sdt__madc_Internalname ;
   private String edtavCostesbasicos_fases_sdt__mam_Internalname ;
   private String edtavCostesbasicos_fases_sdt__tiempo_m_Internalname ;
   private String edtavCostesbasicos_fases_sdt__lhipro_Internalname ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String hsh ;
   private String GXv_char2[] ;
   private String AV28EmprNom ;
   private String AV29UsurCod ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV30EmprCod ;
   private String sCtrlAV34Barcod ;
   private String sCtrlAV35Barcodreo ;
   private String sCtrlAV36Barcodpar ;
   private String sCtrlAV46clicod ;
   private String sCtrlAV47Clinom ;
   private String sCtrlAV48barser ;
   private String sCtrlAV49barserdsc ;
   private String sCtrlAV50barcolnom ;
   private String sCtrlAV51Barcolnum ;
   private String sCtrlAV40BarKgm ;
   private String sCtrlAV42BarMtr ;
   private String sCtrlAV43costefab2 ;
   private String sCtrlAV52mAgua ;
   private String sCtrlAV53menergia ;
   private String sCtrlAV54mgas ;
   private String sCtrlAV55mmod ;
   private String sCtrlAV56mmoi ;
   private String sCtrlAV57madc ;
   private String sCtrlAV58mam ;
   private String sCtrlAV59mgi ;
   private String sCtrlAV60costeoperario1 ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavCostesbasicos_fases_sdt__barfassec_Jsonclick ;
   private String edtavCostesbasicos_fases_sdt__barordlin_Jsonclick ;
   private String edtavCostesbasicos_fases_sdt__fascod_Jsonclick ;
   private String edtavCostesbasicos_fases_sdt__fasdsc_Jsonclick ;
   private String edtavCostesbasicos_fases_sdt__maqcod_Jsonclick ;
   private String edtavCostesbasicos_fases_sdt__maqdsc_Jsonclick ;
   private String edtavCostesbasicos_fases_sdt__unidades_Jsonclick ;
   private String edtavCostesbasicos_fases_sdt__unidadest_Jsonclick ;
   private String edtavCostesbasicos_fases_sdt__barunimed_Jsonclick ;
   private String edtavCostesbasicos_fases_sdt__horini_5_Jsonclick ;
   private String edtavCostesbasicos_fases_sdt__horfin_5_Jsonclick ;
   private String edtavCostesbasicos_fases_sdt__bartierea_Jsonclick ;
   private String edtavCostesbasicos_fases_sdt__tieteo_Jsonclick ;
   private String edtavCostesbasicos_fases_sdt__tteo_Jsonclick ;
   private String edtavCostesbasicos_fases_sdt__maqcosmin_Jsonclick ;
   private String edtavCostesbasicos_fases_sdt__coste_m_Jsonclick ;
   private String edtavCostesbasicos_fases_sdt__coste_tm_Jsonclick ;
   private String edtavCostesbasicos_fases_sdt__mmod_Jsonclick ;
   private String edtavCostesbasicos_fases_sdt__mmoi_Jsonclick ;
   private String edtavCostesbasicos_fases_sdt__menergia_Jsonclick ;
   private String edtavCostesbasicos_fases_sdt__mgas_Jsonclick ;
   private String edtavCostesbasicos_fases_sdt__magua_Jsonclick ;
   private String edtavCostesbasicos_fases_sdt__mgi_Jsonclick ;
   private String edtavCostesbasicos_fases_sdt__madc_Jsonclick ;
   private String edtavCostesbasicos_fases_sdt__mam_Jsonclick ;
   private String edtavCostesbasicos_fases_sdt__tiempo_m_Jsonclick ;
   private String edtavCostesbasicos_fases_sdt__lhipro_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private boolean bGXsfl_43_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV43 ;
   private boolean gx_refresh_fired ;
   private String AV37CostesBasicos_Fases_SDTjson ;
   private String AV16ColumnsSelectorXML ;
   private String AV22ManageFiltersXml ;
   private String AV17UserCustomValue ;
   private String AV12FilterFullText ;
   private String AV14ExcelFilename ;
   private String AV15ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private com.genexus.webpanels.WebSession AV38Websession ;
   private GXBaseCollection<app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem> AV13CostesBasicos_Fases_SDT ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV21ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState14[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV24DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

