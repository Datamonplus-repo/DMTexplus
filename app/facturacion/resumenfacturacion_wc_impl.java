package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class resumenfacturacion_wc_impl extends GXWebComponent
{
   public resumenfacturacion_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public resumenfacturacion_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( resumenfacturacion_wc_impl.class ));
   }

   public resumenfacturacion_wc_impl( int remoteHandle ,
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
               AV39Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Emprcod", AV39Emprcod);
               AV40ClicodFrom = (int)(GXutil.lval( httpContext.GetPar( "ClicodFrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40ClicodFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40ClicodFrom), 6, 0));
               AV41ClicodTo = (int)(GXutil.lval( httpContext.GetPar( "ClicodTo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41ClicodTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41ClicodTo), 6, 0));
               AV42FacFchfrom = localUtil.parseDateParm( httpContext.GetPar( "FacFchfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42FacFchfrom", localUtil.format(AV42FacFchfrom, "99/99/99"));
               AV43FacFchto = localUtil.parseDateParm( httpContext.GetPar( "FacFchto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43FacFchto", localUtil.format(AV43FacFchto, "99/99/99"));
               AV44FacSerNum = httpContext.GetPar( "FacSerNum") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44FacSerNum", AV44FacSerNum);
               AV45FacPri = httpContext.GetPar( "FacPri") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45FacPri", AV45FacPri);
               AV58serief = (byte)(GXutil.lval( httpContext.GetPar( "serief"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58serief", GXutil.str( AV58serief, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV39Emprcod,Integer.valueOf(AV40ClicodFrom),Integer.valueOf(AV41ClicodTo),AV42FacFchfrom,AV43FacFchto,AV44FacSerNum,AV45FacPri,Byte.valueOf(AV58serief)});
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
      nRC_GXsfl_36 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_36"))) ;
      nGXsfl_36_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_36_idx"))) ;
      sGXsfl_36_idx = httpContext.GetPar( "sGXsfl_36_idx") ;
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
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV17ColumnsSelector);
      AV75Pgmname = httpContext.GetPar( "Pgmname") ;
      AV39Emprcod = httpContext.GetPar( "Emprcod") ;
      AV40ClicodFrom = (int)(GXutil.lval( httpContext.GetPar( "ClicodFrom"))) ;
      AV41ClicodTo = (int)(GXutil.lval( httpContext.GetPar( "ClicodTo"))) ;
      AV42FacFchfrom = localUtil.parseDateParm( httpContext.GetPar( "FacFchfrom")) ;
      AV43FacFchto = localUtil.parseDateParm( httpContext.GetPar( "FacFchto")) ;
      AV44FacSerNum = httpContext.GetPar( "FacSerNum") ;
      AV45FacPri = httpContext.GetPar( "FacPri") ;
      AV58serief = (byte)(GXutil.lval( httpContext.GetPar( "serief"))) ;
      AV55moda21 = (short)(GXutil.lval( httpContext.GetPar( "moda21"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV12ResumenFacturacion_SDT);
      AV25Tot_FacImpTot = CommonUtil.decimalVal( httpContext.GetPar( "Tot_FacImpTot"), ".") ;
      AV27Tot_FacImpPP = CommonUtil.decimalVal( httpContext.GetPar( "Tot_FacImpPP"), ".") ;
      AV29Tot_FacIVAImp = CommonUtil.decimalVal( httpContext.GetPar( "Tot_FacIVAImp"), ".") ;
      AV31Tot_FacImpGen = CommonUtil.decimalVal( httpContext.GetPar( "Tot_FacImpGen"), ".") ;
      AV33Tot_FacTot = CommonUtil.decimalVal( httpContext.GetPar( "Tot_FacTot"), ".") ;
      AV35Tot_Kgs_Fra = CommonUtil.decimalVal( httpContext.GetPar( "Tot_Kgs_Fra"), ".") ;
      AV56Tot_Pzs_fra = GXutil.lval( httpContext.GetPar( "Tot_Pzs_fra")) ;
      AV37Tot_Kgs_otros = CommonUtil.decimalVal( httpContext.GetPar( "Tot_Kgs_otros"), ".") ;
      AV49Tot_Pre_medio = CommonUtil.decimalVal( httpContext.GetPar( "Tot_Pre_medio"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV17ColumnsSelector, AV75Pgmname, AV39Emprcod, AV40ClicodFrom, AV41ClicodTo, AV42FacFchfrom, AV43FacFchto, AV44FacSerNum, AV45FacPri, AV58serief, AV55moda21, AV12ResumenFacturacion_SDT, AV25Tot_FacImpTot, AV27Tot_FacImpPP, AV29Tot_FacIVAImp, AV31Tot_FacImpGen, AV33Tot_FacTot, AV35Tot_Kgs_Fra, AV56Tot_Pzs_fra, AV37Tot_Kgs_otros, AV49Tot_Pre_medio, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa24J2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Resumen Facturacion", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.resumenfacturacion_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV39Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV40ClicodFrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV41ClicodTo,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV42FacFchfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV43FacFchto)),GXutil.URLEncode(GXutil.rtrim(AV44FacSerNum)),GXutil.URLEncode(GXutil.rtrim(AV45FacPri)),GXutil.URLEncode(GXutil.ltrimstr(AV58serief,1,0))}, new String[] {"Emprcod","ClicodFrom","ClicodTo","FacFchfrom","FacFchto","FacSerNum","FacPri","serief"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV55moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRESUMENFACTURACION_SDT", getSecureSignedToken( sPrefix, AV12ResumenFacturacion_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPTOT", getSecureSignedToken( sPrefix, localUtil.format( AV25Tot_FacImpTot, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPPP", getSecureSignedToken( sPrefix, localUtil.format( AV27Tot_FacImpPP, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIVAIMP", getSecureSignedToken( sPrefix, localUtil.format( AV29Tot_FacIVAImp, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPGEN", getSecureSignedToken( sPrefix, localUtil.format( AV31Tot_FacImpGen, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACTOT", getSecureSignedToken( sPrefix, localUtil.format( AV33Tot_FacTot, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KGS_FRA", getSecureSignedToken( sPrefix, localUtil.format( AV35Tot_Kgs_Fra, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_PZS_FRA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV56Tot_Pzs_fra), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KGS_OTROS", getSecureSignedToken( sPrefix, localUtil.format( AV37Tot_Kgs_otros, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_PRE_MEDIO", getSecureSignedToken( sPrefix, localUtil.format( AV49Tot_Pre_medio, "ZZZZ9.99999")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ResumenFacturacion_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV75Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\resumenfacturacion_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Resumenfacturacion_sdt", AV12ResumenFacturacion_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Resumenfacturacion_sdt", AV12ResumenFacturacion_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_Resumenfacturacion_sdt", getSecureSignedToken( sPrefix, AV12ResumenFacturacion_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_36", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_36, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV22GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV23GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV20DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV20DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV17ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV17ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV39Emprcod", GXutil.rtrim( wcpOAV39Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV40ClicodFrom", GXutil.ltrim( localUtil.ntoc( wcpOAV40ClicodFrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV41ClicodTo", GXutil.ltrim( localUtil.ntoc( wcpOAV41ClicodTo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV42FacFchfrom", localUtil.dtoc( wcpOAV42FacFchfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV43FacFchto", localUtil.dtoc( wcpOAV43FacFchto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV44FacSerNum", GXutil.rtrim( wcpOAV44FacSerNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV45FacPri", GXutil.rtrim( wcpOAV45FacPri));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV58serief", GXutil.ltrim( localUtil.ntoc( wcpOAV58serief, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV39Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODFROM", GXutil.ltrim( localUtil.ntoc( AV40ClicodFrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODTO", GXutil.ltrim( localUtil.ntoc( AV41ClicodTo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACFCHFROM", localUtil.dtoc( AV42FacFchfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACFCHTO", localUtil.dtoc( AV43FacFchto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACSERNUM", GXutil.rtrim( AV44FacSerNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACPRI", GXutil.rtrim( AV45FacPri));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSERIEF", GXutil.ltrim( localUtil.ntoc( AV58serief, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV55moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV55moda21), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vRESUMENFACTURACION_SDT", AV12ResumenFacturacion_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vRESUMENFACTURACION_SDT", AV12ResumenFacturacion_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRESUMENFACTURACION_SDT", getSecureSignedToken( sPrefix, AV12ResumenFacturacion_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACIMPTOT", GXutil.ltrim( localUtil.ntoc( AV25Tot_FacImpTot, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPTOT", getSecureSignedToken( sPrefix, localUtil.format( AV25Tot_FacImpTot, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACIMPPP", GXutil.ltrim( localUtil.ntoc( AV27Tot_FacImpPP, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPPP", getSecureSignedToken( sPrefix, localUtil.format( AV27Tot_FacImpPP, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACIVAIMP", GXutil.ltrim( localUtil.ntoc( AV29Tot_FacIVAImp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIVAIMP", getSecureSignedToken( sPrefix, localUtil.format( AV29Tot_FacIVAImp, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACIMPGEN", GXutil.ltrim( localUtil.ntoc( AV31Tot_FacImpGen, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPGEN", getSecureSignedToken( sPrefix, localUtil.format( AV31Tot_FacImpGen, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACTOT", GXutil.ltrim( localUtil.ntoc( AV33Tot_FacTot, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACTOT", getSecureSignedToken( sPrefix, localUtil.format( AV33Tot_FacTot, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_KGS_FRA", GXutil.ltrim( localUtil.ntoc( AV35Tot_Kgs_Fra, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KGS_FRA", getSecureSignedToken( sPrefix, localUtil.format( AV35Tot_Kgs_Fra, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_PZS_FRA", GXutil.ltrim( localUtil.ntoc( AV56Tot_Pzs_fra, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_PZS_FRA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV56Tot_Pzs_fra), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_KGS_OTROS", GXutil.ltrim( localUtil.ntoc( AV37Tot_Kgs_otros, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KGS_OTROS", getSecureSignedToken( sPrefix, localUtil.format( AV37Tot_Kgs_otros, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_PRE_MEDIO", GXutil.ltrim( localUtil.ntoc( AV49Tot_Pre_medio, (byte)(18), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_PRE_MEDIO", getSecureSignedToken( sPrefix, localUtil.format( AV49Tot_Pre_medio, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
   }

   public void renderHtmlCloseForm24J2( )
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
      return "Facturacion.ResumenFacturacion_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Resumen Facturacion", "") ;
   }

   public void wb24J0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.facturacion.resumenfacturacion_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\ResumenFacturacion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpdf_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "Pdf (Win)", ""), bttBtnpdf_Jsonclick, 7, httpContext.getMessage( "Pdf (Win)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1124j1_client"+"'", TempTags, "", 2, "HLP_Facturacion\\ResumenFacturacion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\ResumenFacturacion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\ResumenFacturacion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_24J2( true) ;
      }
      else
      {
         wb_table1_25_24J2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_24J2e( boolean wbgen )
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
         startgridcontrol36( ) ;
      }
      if ( wbEnd == 36 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_36 = (int)(nGXsfl_36_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV61GXV1 = nGXsfl_36_idx ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_52_24J2( true) ;
      }
      else
      {
         wb_table2_52_24J2( false) ;
      }
      return  ;
   }

   public void wb_table2_52_24J2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         ucGridpaginationbar.setProperty("CurrentPage", AV22GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV23GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV75Pgmname), GXutil.rtrim( localUtil.format( AV75Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\ResumenFacturacion_WC.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV20DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV20DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV17ColumnsSelector);
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
      if ( wbEnd == 36 )
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
               AV61GXV1 = nGXsfl_36_idx ;
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

   public void start24J2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Resumen Facturacion", ""), (short)(0)) ;
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
            strup24J0( ) ;
         }
      }
   }

   public void ws24J2( )
   {
      start24J2( ) ;
      evt24J2( ) ;
   }

   public void evt24J2( )
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
                              strup24J0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24J0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1224J2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24J0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1324J2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24J0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1424J2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24J0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e1524J2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24J0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e1624J2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24J0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavTotvalue_facimptot_Internalname ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "'DOEXPORTREPORT'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24J0( ) ;
                           }
                           nGXsfl_36_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_362( ) ;
                           AV61GXV1 = (int)(nGXsfl_36_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV12ResumenFacturacion_SDT.size() >= AV61GXV1 ) && ( AV61GXV1 > 0 ) )
                           {
                              AV12ResumenFacturacion_SDT.currentItem( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)) );
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
                                       GX_FocusControl = edtavTotvalue_facimptot_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1724J2 ();
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
                                       GX_FocusControl = edtavTotvalue_facimptot_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e1824J2 ();
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
                                       GX_FocusControl = edtavTotvalue_facimptot_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1924J2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavTotvalue_facimptot_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: 'DoExportReport' */
                                       e2024J2 ();
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
                                    strup24J0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavTotvalue_facimptot_Internalname ;
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

   public void we24J2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm24J2( ) ;
         }
      }
   }

   public void pa24J2( )
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
            GX_FocusControl = edtavTotvalue_facimptot_Internalname ;
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
      subsflControlProps_362( ) ;
      while ( nGXsfl_36_idx <= nRC_GXsfl_36 )
      {
         sendrow_362( ) ;
         nGXsfl_36_idx = ((subGrid_Islastpage==1)&&(nGXsfl_36_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_36_idx+1) ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_362( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV17ColumnsSelector ,
                                 String AV75Pgmname ,
                                 String AV39Emprcod ,
                                 int AV40ClicodFrom ,
                                 int AV41ClicodTo ,
                                 java.util.Date AV42FacFchfrom ,
                                 java.util.Date AV43FacFchto ,
                                 String AV44FacSerNum ,
                                 String AV45FacPri ,
                                 byte AV58serief ,
                                 short AV55moda21 ,
                                 GXBaseCollection<app.facturacion.SdtResumenFacturacion_SDT_Item> AV12ResumenFacturacion_SDT ,
                                 java.math.BigDecimal AV25Tot_FacImpTot ,
                                 java.math.BigDecimal AV27Tot_FacImpPP ,
                                 java.math.BigDecimal AV29Tot_FacIVAImp ,
                                 java.math.BigDecimal AV31Tot_FacImpGen ,
                                 java.math.BigDecimal AV33Tot_FacTot ,
                                 java.math.BigDecimal AV35Tot_Kgs_Fra ,
                                 long AV56Tot_Pzs_fra ,
                                 java.math.BigDecimal AV37Tot_Kgs_otros ,
                                 java.math.BigDecimal AV49Tot_Pre_medio ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1824J2 ();
      GRID_nCurrentRecord = 0 ;
      rf24J2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ResumenFacturacion_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV75Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\resumenfacturacion_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf24J2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV75Pgmname = "Facturacion.ResumenFacturacion_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75Pgmname", AV75Pgmname);
      Gx_err = (short)(0) ;
      edtavResumenfacturacion_sdt__faccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__faccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__faccod_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__facfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__facfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__facfch_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__clicod_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__clinom_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__facimptot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__facimptot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__facimptot_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__facimppp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__facimppp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__facimppp_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__facivaimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__facivaimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__facivaimp_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__facimpgen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__facimpgen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__facimpgen_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__factot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__factot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__factot_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__kgs_fra_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__kgs_fra_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__kgs_fra_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__pzs_fra_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__pzs_fra_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__pzs_fra_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__kgs_otros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__kgs_otros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__kgs_otros_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__pre_medio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__pre_medio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__pre_medio_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavTotvalue_facimptot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_facimptot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_facimptot_Enabled), 5, 0), true);
      edtavTotvalue_facimppp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_facimppp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_facimppp_Enabled), 5, 0), true);
      edtavTotvalue_facivaimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_facivaimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_facivaimp_Enabled), 5, 0), true);
      edtavTotvalue_facimpgen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_facimpgen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_facimpgen_Enabled), 5, 0), true);
      edtavTotvalue_factot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_factot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_factot_Enabled), 5, 0), true);
      edtavTotvalue_kgs_fra_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_kgs_fra_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_kgs_fra_Enabled), 5, 0), true);
      edtavTotvalue_pzs_fra_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_pzs_fra_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_pzs_fra_Enabled), 5, 0), true);
      edtavTotvalue_pre_medio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_pre_medio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_pre_medio_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf24J2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(36) ;
      /* Execute user event: Refresh */
      e1824J2 ();
      nGXsfl_36_idx = 1 ;
      sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_362( ) ;
      bGXsfl_36_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
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
         subsflControlProps_362( ) ;
         e1924J2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_36_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e1924J2 ();
         }
         wbEnd = (short)(36) ;
         wb24J0( ) ;
      }
      bGXsfl_36_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes24J2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV55moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV55moda21), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vRESUMENFACTURACION_SDT", AV12ResumenFacturacion_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vRESUMENFACTURACION_SDT", AV12ResumenFacturacion_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRESUMENFACTURACION_SDT", getSecureSignedToken( sPrefix, AV12ResumenFacturacion_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACIMPTOT", GXutil.ltrim( localUtil.ntoc( AV25Tot_FacImpTot, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPTOT", getSecureSignedToken( sPrefix, localUtil.format( AV25Tot_FacImpTot, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACIMPPP", GXutil.ltrim( localUtil.ntoc( AV27Tot_FacImpPP, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPPP", getSecureSignedToken( sPrefix, localUtil.format( AV27Tot_FacImpPP, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACIVAIMP", GXutil.ltrim( localUtil.ntoc( AV29Tot_FacIVAImp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIVAIMP", getSecureSignedToken( sPrefix, localUtil.format( AV29Tot_FacIVAImp, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACIMPGEN", GXutil.ltrim( localUtil.ntoc( AV31Tot_FacImpGen, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPGEN", getSecureSignedToken( sPrefix, localUtil.format( AV31Tot_FacImpGen, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACTOT", GXutil.ltrim( localUtil.ntoc( AV33Tot_FacTot, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACTOT", getSecureSignedToken( sPrefix, localUtil.format( AV33Tot_FacTot, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_KGS_FRA", GXutil.ltrim( localUtil.ntoc( AV35Tot_Kgs_Fra, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KGS_FRA", getSecureSignedToken( sPrefix, localUtil.format( AV35Tot_Kgs_Fra, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_PZS_FRA", GXutil.ltrim( localUtil.ntoc( AV56Tot_Pzs_fra, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_PZS_FRA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV56Tot_Pzs_fra), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_KGS_OTROS", GXutil.ltrim( localUtil.ntoc( AV37Tot_Kgs_otros, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KGS_OTROS", getSecureSignedToken( sPrefix, localUtil.format( AV37Tot_Kgs_otros, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_PRE_MEDIO", GXutil.ltrim( localUtil.ntoc( AV49Tot_Pre_medio, (byte)(18), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_PRE_MEDIO", getSecureSignedToken( sPrefix, localUtil.format( AV49Tot_Pre_medio, "ZZZZ9.99999")));
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
      return AV12ResumenFacturacion_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV17ColumnsSelector, AV75Pgmname, AV39Emprcod, AV40ClicodFrom, AV41ClicodTo, AV42FacFchfrom, AV43FacFchto, AV44FacSerNum, AV45FacPri, AV58serief, AV55moda21, AV12ResumenFacturacion_SDT, AV25Tot_FacImpTot, AV27Tot_FacImpPP, AV29Tot_FacIVAImp, AV31Tot_FacImpGen, AV33Tot_FacTot, AV35Tot_Kgs_Fra, AV56Tot_Pzs_fra, AV37Tot_Kgs_otros, AV49Tot_Pre_medio, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV17ColumnsSelector, AV75Pgmname, AV39Emprcod, AV40ClicodFrom, AV41ClicodTo, AV42FacFchfrom, AV43FacFchto, AV44FacSerNum, AV45FacPri, AV58serief, AV55moda21, AV12ResumenFacturacion_SDT, AV25Tot_FacImpTot, AV27Tot_FacImpPP, AV29Tot_FacIVAImp, AV31Tot_FacImpGen, AV33Tot_FacTot, AV35Tot_Kgs_Fra, AV56Tot_Pzs_fra, AV37Tot_Kgs_otros, AV49Tot_Pre_medio, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV17ColumnsSelector, AV75Pgmname, AV39Emprcod, AV40ClicodFrom, AV41ClicodTo, AV42FacFchfrom, AV43FacFchto, AV44FacSerNum, AV45FacPri, AV58serief, AV55moda21, AV12ResumenFacturacion_SDT, AV25Tot_FacImpTot, AV27Tot_FacImpPP, AV29Tot_FacIVAImp, AV31Tot_FacImpGen, AV33Tot_FacTot, AV35Tot_Kgs_Fra, AV56Tot_Pzs_fra, AV37Tot_Kgs_otros, AV49Tot_Pre_medio, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV17ColumnsSelector, AV75Pgmname, AV39Emprcod, AV40ClicodFrom, AV41ClicodTo, AV42FacFchfrom, AV43FacFchto, AV44FacSerNum, AV45FacPri, AV58serief, AV55moda21, AV12ResumenFacturacion_SDT, AV25Tot_FacImpTot, AV27Tot_FacImpPP, AV29Tot_FacIVAImp, AV31Tot_FacImpGen, AV33Tot_FacTot, AV35Tot_Kgs_Fra, AV56Tot_Pzs_fra, AV37Tot_Kgs_otros, AV49Tot_Pre_medio, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV17ColumnsSelector, AV75Pgmname, AV39Emprcod, AV40ClicodFrom, AV41ClicodTo, AV42FacFchfrom, AV43FacFchto, AV44FacSerNum, AV45FacPri, AV58serief, AV55moda21, AV12ResumenFacturacion_SDT, AV25Tot_FacImpTot, AV27Tot_FacImpPP, AV29Tot_FacIVAImp, AV31Tot_FacImpGen, AV33Tot_FacTot, AV35Tot_Kgs_Fra, AV56Tot_Pzs_fra, AV37Tot_Kgs_otros, AV49Tot_Pre_medio, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV75Pgmname = "Facturacion.ResumenFacturacion_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75Pgmname", AV75Pgmname);
      Gx_err = (short)(0) ;
      edtavResumenfacturacion_sdt__faccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__faccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__faccod_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__facfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__facfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__facfch_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__clicod_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__clinom_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__facimptot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__facimptot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__facimptot_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__facimppp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__facimppp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__facimppp_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__facivaimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__facivaimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__facivaimp_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__facimpgen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__facimpgen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__facimpgen_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__factot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__factot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__factot_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__kgs_fra_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__kgs_fra_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__kgs_fra_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__pzs_fra_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__pzs_fra_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__pzs_fra_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__kgs_otros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__kgs_otros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__kgs_otros_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__pre_medio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__pre_medio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__pre_medio_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavTotvalue_facimptot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_facimptot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_facimptot_Enabled), 5, 0), true);
      edtavTotvalue_facimppp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_facimppp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_facimppp_Enabled), 5, 0), true);
      edtavTotvalue_facivaimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_facivaimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_facivaimp_Enabled), 5, 0), true);
      edtavTotvalue_facimpgen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_facimpgen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_facimpgen_Enabled), 5, 0), true);
      edtavTotvalue_factot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_factot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_factot_Enabled), 5, 0), true);
      edtavTotvalue_kgs_fra_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_kgs_fra_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_kgs_fra_Enabled), 5, 0), true);
      edtavTotvalue_pzs_fra_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_pzs_fra_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_pzs_fra_Enabled), 5, 0), true);
      edtavTotvalue_pre_medio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_pre_medio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_pre_medio_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup24J0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1724J2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Resumenfacturacion_sdt"), AV12ResumenFacturacion_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV20DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV17ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vRESUMENFACTURACION_SDT"), AV12ResumenFacturacion_SDT);
         /* Read saved values. */
         nRC_GXsfl_36 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_36"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV22GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV23GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV39Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV39Emprcod") ;
         wcpOAV40ClicodFrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV40ClicodFrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV41ClicodTo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV41ClicodTo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV42FacFchfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV42FacFchfrom"), 0) ;
         wcpOAV43FacFchto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV43FacFchto"), 0) ;
         wcpOAV44FacSerNum = httpContext.cgiGet( sPrefix+"wcpOAV44FacSerNum") ;
         wcpOAV45FacPri = httpContext.cgiGet( sPrefix+"wcpOAV45FacPri") ;
         wcpOAV58serief = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV58serief"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV58serief = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vSERIEF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV45FacPri = httpContext.cgiGet( sPrefix+"vFACPRI") ;
         AV43FacFchto = localUtil.ctod( httpContext.cgiGet( sPrefix+"vFACFCHTO"), 0) ;
         AV42FacFchfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"vFACFCHFROM"), 0) ;
         AV41ClicodTo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vCLICODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV40ClicodFrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vCLICODFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV39Emprcod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         nRC_GXsfl_36 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_36"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_36_fel_idx = 0 ;
         while ( nGXsfl_36_fel_idx < nRC_GXsfl_36 )
         {
            nGXsfl_36_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_36_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_36_fel_idx+1) ;
            sGXsfl_36_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_362( ) ;
            AV61GXV1 = (int)(nGXsfl_36_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV12ResumenFacturacion_SDT.size() >= AV61GXV1 ) && ( AV61GXV1 > 0 ) )
            {
               AV12ResumenFacturacion_SDT.currentItem( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)) );
            }
         }
         if ( nGXsfl_36_fel_idx == 0 )
         {
            nGXsfl_36_idx = 1 ;
            sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_362( ) ;
         }
         nGXsfl_36_fel_idx = 1 ;
         /* Read variables values. */
         AV26TotValue_FacImpTot = httpContext.cgiGet( edtavTotvalue_facimptot_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TotValue_FacImpTot", AV26TotValue_FacImpTot);
         AV28TotValue_FacImpPP = httpContext.cgiGet( edtavTotvalue_facimppp_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TotValue_FacImpPP", AV28TotValue_FacImpPP);
         AV30TotValue_FacIVAImp = httpContext.cgiGet( edtavTotvalue_facivaimp_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TotValue_FacIVAImp", AV30TotValue_FacIVAImp);
         AV32TotValue_FacImpGen = httpContext.cgiGet( edtavTotvalue_facimpgen_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TotValue_FacImpGen", AV32TotValue_FacImpGen);
         AV34TotValue_FacTot = httpContext.cgiGet( edtavTotvalue_factot_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TotValue_FacTot", AV34TotValue_FacTot);
         AV36TotValue_Kgs_Fra = httpContext.cgiGet( edtavTotvalue_kgs_fra_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TotValue_Kgs_Fra", AV36TotValue_Kgs_Fra);
         AV57TotValue_Pzs_fra = httpContext.cgiGet( edtavTotvalue_pzs_fra_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TotValue_Pzs_fra", AV57TotValue_Pzs_fra);
         AV50TotValue_Pre_medio = httpContext.cgiGet( edtavTotvalue_pre_medio_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TotValue_Pre_medio", AV50TotValue_Pre_medio);
         AV75Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75Pgmname", AV75Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ResumenFacturacion_WC");
         AV75Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75Pgmname", AV75Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV75Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\resumenfacturacion_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1724J2 ();
      if (returnInSub) return;
   }

   public void e1724J2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_objcol_SdtResumenFacturacion_SDT_Item1 = AV12ResumenFacturacion_SDT ;
      GXv_objcol_SdtResumenFacturacion_SDT_Item2[0] = GXt_objcol_SdtResumenFacturacion_SDT_Item1 ;
      new app.facturacion.resumenfacturacion_dp(remoteHandle, context).execute( AV39Emprcod, AV42FacFchfrom, AV43FacFchto, AV40ClicodFrom, AV41ClicodTo, AV44FacSerNum, AV45FacPri, GXv_objcol_SdtResumenFacturacion_SDT_Item2) ;
      GXt_objcol_SdtResumenFacturacion_SDT_Item1 = GXv_objcol_SdtResumenFacturacion_SDT_Item2[0] ;
      AV12ResumenFacturacion_SDT = GXt_objcol_SdtResumenFacturacion_SDT_Item1 ;
      gx_BV36 = true ;
      GXt_char3 = AV46Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      resumenfacturacion_wc_impl.this.GXt_char3 = GXv_char4[0] ;
      AV46Station = GXt_char3 ;
      GXv_char4[0] = AV39Emprcod ;
      GXv_char5[0] = AV47EmprNom ;
      GXv_char6[0] = AV48UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV46Station, GXv_char4, GXv_char5, GXv_char6) ;
      resumenfacturacion_wc_impl.this.AV39Emprcod = GXv_char4[0] ;
      resumenfacturacion_wc_impl.this.AV47EmprNom = GXv_char5[0] ;
      resumenfacturacion_wc_impl.this.AV48UsurCod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Emprcod", AV39Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV20DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV20DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int9 = (byte)(AV55moda21) ;
      GXv_int10[0] = GXt_int9 ;
      new app.pexicon(remoteHandle, context).execute( AV39Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int10) ;
      resumenfacturacion_wc_impl.this.GXt_int9 = GXv_int10[0] ;
      AV55moda21 = GXt_int9 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV55moda21), "ZZZ9")));
   }

   public void e1824J2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV6WWPContext = GXv_SdtWWPContext11[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV19Session.getValue("Facturacion.ResumenFacturacion_WCColumnsSelector"), "") != 0 )
      {
         AV15ColumnsSelectorXML = AV19Session.getValue("Facturacion.ResumenFacturacion_WCColumnsSelector") ;
         AV17ColumnsSelector.fromxml(AV15ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S132 ();
         if (returnInSub) return;
      }
      edtavResumenfacturacion_sdt__faccod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__faccod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__faccod_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__facfch_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__facfch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__facfch_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__clicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__clicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__clicod_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__clinom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__clinom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__clinom_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__facimptot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__facimptot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__facimptot_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__facimppp_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__facimppp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__facimppp_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__facivaimp_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__facivaimp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__facivaimp_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__facimpgen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__facimpgen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__facimpgen_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__factot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__factot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__factot_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__kgs_fra_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__kgs_fra_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__kgs_fra_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__pzs_fra_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__pzs_fra_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__pzs_fra_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavResumenfacturacion_sdt__pre_medio_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavResumenfacturacion_sdt__pre_medio_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResumenfacturacion_sdt__pre_medio_Visible), 5, 0), !bGXsfl_36_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S152 ();
      if (returnInSub) return;
      AV22GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22GridCurrentPage), 10, 0));
      AV23GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S162 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV17ColumnsSelector", AV17ColumnsSelector);
   }

   public void e1224J2( )
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
         AV21PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV21PageToGo) ;
      }
   }

   public void e1324J2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e1924J2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV61GXV1 = 1 ;
      while ( AV61GXV1 <= AV12ResumenFacturacion_SDT.size() )
      {
         AV12ResumenFacturacion_SDT.currentItem( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(36) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_362( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_36_Refreshing )
         {
            httpContext.doAjaxLoad(36, GridRow);
         }
         AV61GXV1 = (int)(AV61GXV1+1) ;
      }
   }

   public void e1424J2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV15ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV17ColumnsSelector.fromJSonString(AV15ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Facturacion.ResumenFacturacion_WCColumnsSelector", ((GXutil.strcmp("", AV15ColumnsSelectorXML)==0) ? "" : AV17ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV17ColumnsSelector", AV17ColumnsSelector);
   }

   public void e1524J2( )
   {
      AV61GXV1 = (int)(nGXsfl_36_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV61GXV1 > 0 ) && ( AV12ResumenFacturacion_SDT.size() >= AV61GXV1 ) )
      {
         AV12ResumenFacturacion_SDT.currentItem( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)) );
      }
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV51ResumenFacturacion_SDT_json = AV12ResumenFacturacion_SDT.toJSonString(false) ;
      AV54Websession.setValue(httpContext.getMessage( "&ResumenFacturacion_SDT_json", ""), AV51ResumenFacturacion_SDT_json);
      GXv_char6[0] = AV13ExcelFilename ;
      GXv_char5[0] = AV14ErrorMessage ;
      new app.facturacion.resumenfacturacion_wcexport(remoteHandle, context).execute( GXv_char6, GXv_char5) ;
      resumenfacturacion_wc_impl.this.AV13ExcelFilename = GXv_char6[0] ;
      resumenfacturacion_wc_impl.this.AV14ErrorMessage = GXv_char5[0] ;
      if ( GXutil.strcmp(AV13ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV13ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV14ErrorMessage);
      }
   }

   public void e1624J2( )
   {
      AV61GXV1 = (int)(nGXsfl_36_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV61GXV1 > 0 ) && ( AV12ResumenFacturacion_SDT.size() >= AV61GXV1 ) )
      {
         AV12ResumenFacturacion_SDT.currentItem( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)) );
      }
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV51ResumenFacturacion_SDT_json = AV12ResumenFacturacion_SDT.toJSonString(false) ;
      AV54Websession.setValue(httpContext.getMessage( "&ResumenFacturacion_SDT_json", ""), AV51ResumenFacturacion_SDT_json);
      callWebObject(formatLink("app.facturacion.resumenfacturacion_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S152( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S132( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV17ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ResumenFacturacion_SDT__Faccod", "", "Nº Factura", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ResumenFacturacion_SDT__FacFch", "", "Fecha", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ResumenFacturacion_SDT__CliCod", "", "Cliente", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ResumenFacturacion_SDT__CliNom", "", "Nombre", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ResumenFacturacion_SDT__FacImpTot", "", "Valor", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ResumenFacturacion_SDT__FacImpPP", "", "Imp. Dto. PP", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ResumenFacturacion_SDT__FacIVAImp", "", "Imp. IVA", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ResumenFacturacion_SDT__FacImpGen", "", "Imp. Dto. Gral.", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ResumenFacturacion_SDT__FacTot", "", "TOTAL", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ResumenFacturacion_SDT__Kgs_Fra", "", "Kgs Fact.", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      if ( AV55moda21 == 1 )
      {
         GXv_SdtWWPColumnsSelector12[0] = AV17ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ResumenFacturacion_SDT__Pzs_fra", "", "Pcs. Fact.", true, "") ;
         AV17ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector12[0] = AV17ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "", "", "", false, "") ;
         AV17ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      }
      GXv_SdtWWPColumnsSelector12[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ResumenFacturacion_SDT__Pre_medio", "", "Precio medio p/kg", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXt_char3 = AV16UserCustomValue ;
      GXv_char6[0] = GXt_char3 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Facturacion.ResumenFacturacion_WCColumnsSelector", GXv_char6) ;
      resumenfacturacion_wc_impl.this.GXt_char3 = GXv_char6[0] ;
      AV16UserCustomValue = GXt_char3 ;
      if ( ! ( (GXutil.strcmp("", AV16UserCustomValue)==0) ) )
      {
         AV18ColumnsSelectorAux.fromxml(AV16UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector13[0] = AV17ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, GXv_SdtWWPColumnsSelector13) ;
         AV18ColumnsSelectorAux = GXv_SdtWWPColumnsSelector12[0] ;
         AV17ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue(AV75Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV75Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV19Session.getValue(AV75Pgmname+"GridState"), null, null);
      }
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S122( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV19Session.getValue(AV75Pgmname+"GridState"), null, null);
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      if ( ! (GXutil.strcmp("", AV39Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV39Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV40ClicodFrom) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICODFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV40ClicodFrom, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV41ClicodTo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICODTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV41ClicodTo, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42FacFchfrom)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FACFCHFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV42FacFchfrom, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV43FacFchto)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FACFCHTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV43FacFchto, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV44FacSerNum)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FACSERNUM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV44FacSerNum );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV45FacPri)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FACPRI" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV45FacPri );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV58serief) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&SERIEF" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV58serief, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV75Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S142( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV25Tot_FacImpTot = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Tot_FacImpTot", GXutil.ltrimstr( AV25Tot_FacImpTot, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPTOT", getSecureSignedToken( sPrefix, localUtil.format( AV25Tot_FacImpTot, "ZZZZZZZZZ9.99")));
      AV27Tot_FacImpPP = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Tot_FacImpPP", GXutil.ltrimstr( AV27Tot_FacImpPP, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPPP", getSecureSignedToken( sPrefix, localUtil.format( AV27Tot_FacImpPP, "ZZZZZZZ9.99")));
      AV29Tot_FacIVAImp = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Tot_FacIVAImp", GXutil.ltrimstr( AV29Tot_FacIVAImp, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIVAIMP", getSecureSignedToken( sPrefix, localUtil.format( AV29Tot_FacIVAImp, "ZZZZZZZ9.99")));
      AV31Tot_FacImpGen = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Tot_FacImpGen", GXutil.ltrimstr( AV31Tot_FacImpGen, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPGEN", getSecureSignedToken( sPrefix, localUtil.format( AV31Tot_FacImpGen, "ZZZZZZZ9.99")));
      AV33Tot_FacTot = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Tot_FacTot", GXutil.ltrimstr( AV33Tot_FacTot, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACTOT", getSecureSignedToken( sPrefix, localUtil.format( AV33Tot_FacTot, "ZZZZZZZZZ9.99")));
      AV35Tot_Kgs_Fra = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Tot_Kgs_Fra", GXutil.ltrimstr( AV35Tot_Kgs_Fra, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KGS_FRA", getSecureSignedToken( sPrefix, localUtil.format( AV35Tot_Kgs_Fra, "ZZZZZZ9.99")));
      AV56Tot_Pzs_fra = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56Tot_Pzs_fra", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56Tot_Pzs_fra), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_PZS_FRA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV56Tot_Pzs_fra), "ZZZZZ9")));
      AV37Tot_Kgs_otros = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Tot_Kgs_otros", GXutil.ltrimstr( AV37Tot_Kgs_otros, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KGS_OTROS", getSecureSignedToken( sPrefix, localUtil.format( AV37Tot_Kgs_otros, "ZZZZZZ9.99")));
      AV49Tot_Pre_medio = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Tot_Pre_medio", GXutil.ltrimstr( AV49Tot_Pre_medio, 18, 5));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_PRE_MEDIO", getSecureSignedToken( sPrefix, localUtil.format( AV49Tot_Pre_medio, "ZZZZ9.99999")));
   }

   public void S162( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV76GXV15 = 1 ;
      while ( AV76GXV15 <= AV12ResumenFacturacion_SDT.size() )
      {
         AV24ResumenFacturacion_SDTItem = (app.facturacion.SdtResumenFacturacion_SDT_Item)((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV76GXV15));
         AV25Tot_FacImpTot = AV25Tot_FacImpTot.add((AV24ResumenFacturacion_SDTItem.getgxTv_SdtResumenFacturacion_SDT_Item_Facimptot())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Tot_FacImpTot", GXutil.ltrimstr( AV25Tot_FacImpTot, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPTOT", getSecureSignedToken( sPrefix, localUtil.format( AV25Tot_FacImpTot, "ZZZZZZZZZ9.99")));
         AV27Tot_FacImpPP = AV27Tot_FacImpPP.add((AV24ResumenFacturacion_SDTItem.getgxTv_SdtResumenFacturacion_SDT_Item_Facimppp())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Tot_FacImpPP", GXutil.ltrimstr( AV27Tot_FacImpPP, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPPP", getSecureSignedToken( sPrefix, localUtil.format( AV27Tot_FacImpPP, "ZZZZZZZ9.99")));
         AV29Tot_FacIVAImp = AV29Tot_FacIVAImp.add((AV24ResumenFacturacion_SDTItem.getgxTv_SdtResumenFacturacion_SDT_Item_Facivaimp())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Tot_FacIVAImp", GXutil.ltrimstr( AV29Tot_FacIVAImp, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIVAIMP", getSecureSignedToken( sPrefix, localUtil.format( AV29Tot_FacIVAImp, "ZZZZZZZ9.99")));
         AV31Tot_FacImpGen = AV31Tot_FacImpGen.add((AV24ResumenFacturacion_SDTItem.getgxTv_SdtResumenFacturacion_SDT_Item_Facimpgen())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Tot_FacImpGen", GXutil.ltrimstr( AV31Tot_FacImpGen, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPGEN", getSecureSignedToken( sPrefix, localUtil.format( AV31Tot_FacImpGen, "ZZZZZZZ9.99")));
         AV33Tot_FacTot = AV33Tot_FacTot.add((AV24ResumenFacturacion_SDTItem.getgxTv_SdtResumenFacturacion_SDT_Item_Factot())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Tot_FacTot", GXutil.ltrimstr( AV33Tot_FacTot, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACTOT", getSecureSignedToken( sPrefix, localUtil.format( AV33Tot_FacTot, "ZZZZZZZZZ9.99")));
         AV35Tot_Kgs_Fra = AV35Tot_Kgs_Fra.add((AV24ResumenFacturacion_SDTItem.getgxTv_SdtResumenFacturacion_SDT_Item_Kgs_fra())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Tot_Kgs_Fra", GXutil.ltrimstr( AV35Tot_Kgs_Fra, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KGS_FRA", getSecureSignedToken( sPrefix, localUtil.format( AV35Tot_Kgs_Fra, "ZZZZZZ9.99")));
         AV56Tot_Pzs_fra = (long)(AV56Tot_Pzs_fra+(AV24ResumenFacturacion_SDTItem.getgxTv_SdtResumenFacturacion_SDT_Item_Pzs_fra())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56Tot_Pzs_fra", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56Tot_Pzs_fra), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_PZS_FRA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV56Tot_Pzs_fra), "ZZZZZ9")));
         AV37Tot_Kgs_otros = AV37Tot_Kgs_otros.add((AV24ResumenFacturacion_SDTItem.getgxTv_SdtResumenFacturacion_SDT_Item_Kgs_otros())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Tot_Kgs_otros", GXutil.ltrimstr( AV37Tot_Kgs_otros, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KGS_OTROS", getSecureSignedToken( sPrefix, localUtil.format( AV37Tot_Kgs_otros, "ZZZZZZ9.99")));
         AV49Tot_Pre_medio = AV49Tot_Pre_medio.add((AV24ResumenFacturacion_SDTItem.getgxTv_SdtResumenFacturacion_SDT_Item_Pre_medio())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Tot_Pre_medio", GXutil.ltrimstr( AV49Tot_Pre_medio, 18, 5));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_PRE_MEDIO", getSecureSignedToken( sPrefix, localUtil.format( AV49Tot_Pre_medio, "ZZZZ9.99999")));
         AV76GXV15 = (int)(AV76GXV15+1) ;
      }
      AV26TotValue_FacImpTot = localUtil.format( AV25Tot_FacImpTot, "ZZZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TotValue_FacImpTot", AV26TotValue_FacImpTot);
      AV28TotValue_FacImpPP = localUtil.format( AV27Tot_FacImpPP, "ZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TotValue_FacImpPP", AV28TotValue_FacImpPP);
      AV30TotValue_FacIVAImp = localUtil.format( AV29Tot_FacIVAImp, "ZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TotValue_FacIVAImp", AV30TotValue_FacIVAImp);
      AV32TotValue_FacImpGen = localUtil.format( AV31Tot_FacImpGen, "ZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TotValue_FacImpGen", AV32TotValue_FacImpGen);
      AV34TotValue_FacTot = localUtil.format( AV33Tot_FacTot, "ZZZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TotValue_FacTot", AV34TotValue_FacTot);
      AV36TotValue_Kgs_Fra = localUtil.format( AV35Tot_Kgs_Fra, "ZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TotValue_Kgs_Fra", AV36TotValue_Kgs_Fra);
      AV57TotValue_Pzs_fra = localUtil.format( DecimalUtil.doubleToDec(AV56Tot_Pzs_fra), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TotValue_Pzs_fra", AV57TotValue_Pzs_fra);
      AV38TotValue_Kgs_otros = localUtil.format( AV37Tot_Kgs_otros, "ZZZZZZ9.99") ;
      AV77Totalrecords = subgrid_fnc_recordcount( ) ;
      if ( AV77Totalrecords > 0 )
      {
         AV49Tot_Pre_medio = AV49Tot_Pre_medio.divide(DecimalUtil.doubleToDec(AV77Totalrecords), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Tot_Pre_medio", GXutil.ltrimstr( AV49Tot_Pre_medio, 18, 5));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_PRE_MEDIO", getSecureSignedToken( sPrefix, localUtil.format( AV49Tot_Pre_medio, "ZZZZ9.99999")));
      }
      AV50TotValue_Pre_medio = httpContext.getMessage( "WWP_TotalizerAvg", "") + localUtil.format( AV49Tot_Pre_medio, "ZZZZ9.99999") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TotValue_Pre_medio", AV50TotValue_Pre_medio);
   }

   public void e2024J2( )
   {
      AV61GXV1 = (int)(nGXsfl_36_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV61GXV1 > 0 ) && ( AV12ResumenFacturacion_SDT.size() >= AV61GXV1 ) )
      {
         AV12ResumenFacturacion_SDT.currentItem( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)) );
      }
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      AV51ResumenFacturacion_SDT_json = AV12ResumenFacturacion_SDT.toJSonString(false) ;
      AV54Websession.setValue(httpContext.getMessage( "&ResumenFacturacion_SDT_json", ""), AV51ResumenFacturacion_SDT_json);
   }

   public void wb_table2_52_24J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblGridtabletotalizer_Internalname, tblGridtabletotalizer_Internalname, "", "TableTotalizerAl", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_facimptot_Internalname, httpContext.getMessage( "Tot Value_Fac Imp Tot", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_facimptot_Internalname, AV26TotValue_FacImpTot, GXutil.rtrim( localUtil.format( AV26TotValue_FacImpTot, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_facimptot_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_facimptot_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\ResumenFacturacion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_facimppp_Internalname, httpContext.getMessage( "Tot Value_Fac Imp PP", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_facimppp_Internalname, AV28TotValue_FacImpPP, GXutil.rtrim( localUtil.format( AV28TotValue_FacImpPP, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_facimppp_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_facimppp_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\ResumenFacturacion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_facivaimp_Internalname, httpContext.getMessage( "Tot Value_Fac IVAImp", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_facivaimp_Internalname, AV30TotValue_FacIVAImp, GXutil.rtrim( localUtil.format( AV30TotValue_FacIVAImp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_facivaimp_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_facivaimp_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\ResumenFacturacion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_facimpgen_Internalname, httpContext.getMessage( "Tot Value_Fac Imp Gen", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_facimpgen_Internalname, AV32TotValue_FacImpGen, GXutil.rtrim( localUtil.format( AV32TotValue_FacImpGen, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_facimpgen_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_facimpgen_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\ResumenFacturacion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_factot_Internalname, httpContext.getMessage( "Tot Value_Fac Tot", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_factot_Internalname, AV34TotValue_FacTot, GXutil.rtrim( localUtil.format( AV34TotValue_FacTot, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,72);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_factot_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_factot_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\ResumenFacturacion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_kgs_fra_Internalname, httpContext.getMessage( "Tot Value_Kgs_Fra", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_kgs_fra_Internalname, AV36TotValue_Kgs_Fra, GXutil.rtrim( localUtil.format( AV36TotValue_Kgs_Fra, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_kgs_fra_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_kgs_fra_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\ResumenFacturacion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_pzs_fra_Internalname, httpContext.getMessage( "Tot Value_Pzs_fra", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_pzs_fra_Internalname, AV57TotValue_Pzs_fra, GXutil.rtrim( localUtil.format( AV57TotValue_Pzs_fra, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_pzs_fra_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_pzs_fra_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\ResumenFacturacion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_pre_medio_Internalname, httpContext.getMessage( "Tot Value_Pre_medio", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_pre_medio_Internalname, AV50TotValue_Pre_medio, GXutil.rtrim( localUtil.format( AV50TotValue_Pre_medio, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,82);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_pre_medio_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_pre_medio_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\ResumenFacturacion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_52_24J2e( true) ;
      }
      else
      {
         wb_table2_52_24J2e( false) ;
      }
   }

   public void wb_table1_25_24J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_24J2e( true) ;
      }
      else
      {
         wb_table1_25_24J2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV39Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Emprcod", AV39Emprcod);
      AV40ClicodFrom = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40ClicodFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40ClicodFrom), 6, 0));
      AV41ClicodTo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41ClicodTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41ClicodTo), 6, 0));
      AV42FacFchfrom = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42FacFchfrom", localUtil.format(AV42FacFchfrom, "99/99/99"));
      AV43FacFchto = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43FacFchto", localUtil.format(AV43FacFchto, "99/99/99"));
      AV44FacSerNum = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44FacSerNum", AV44FacSerNum);
      AV45FacPri = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45FacPri", AV45FacPri);
      AV58serief = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58serief", GXutil.str( AV58serief, 1, 0));
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
      pa24J2( ) ;
      ws24J2( ) ;
      we24J2( ) ;
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
      sCtrlAV39Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV40ClicodFrom = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV41ClicodTo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV42FacFchfrom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV43FacFchto = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV44FacSerNum = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV45FacPri = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV58serief = (String)getParm(obj,7,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa24J2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "facturacion\\resumenfacturacion_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa24J2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV39Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Emprcod", AV39Emprcod);
         AV40ClicodFrom = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40ClicodFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40ClicodFrom), 6, 0));
         AV41ClicodTo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41ClicodTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41ClicodTo), 6, 0));
         AV42FacFchfrom = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42FacFchfrom", localUtil.format(AV42FacFchfrom, "99/99/99"));
         AV43FacFchto = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43FacFchto", localUtil.format(AV43FacFchto, "99/99/99"));
         AV44FacSerNum = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44FacSerNum", AV44FacSerNum);
         AV45FacPri = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45FacPri", AV45FacPri);
         AV58serief = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58serief", GXutil.str( AV58serief, 1, 0));
      }
      wcpOAV39Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV39Emprcod") ;
      wcpOAV40ClicodFrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV40ClicodFrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV41ClicodTo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV41ClicodTo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV42FacFchfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV42FacFchfrom"), 0) ;
      wcpOAV43FacFchto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV43FacFchto"), 0) ;
      wcpOAV44FacSerNum = httpContext.cgiGet( sPrefix+"wcpOAV44FacSerNum") ;
      wcpOAV45FacPri = httpContext.cgiGet( sPrefix+"wcpOAV45FacPri") ;
      wcpOAV58serief = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV58serief"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV39Emprcod, wcpOAV39Emprcod) != 0 ) || ( AV40ClicodFrom != wcpOAV40ClicodFrom ) || ( AV41ClicodTo != wcpOAV41ClicodTo ) || !( GXutil.dateCompare(GXutil.resetTime(AV42FacFchfrom), GXutil.resetTime(wcpOAV42FacFchfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV43FacFchto), GXutil.resetTime(wcpOAV43FacFchto)) ) || ( GXutil.strcmp(AV44FacSerNum, wcpOAV44FacSerNum) != 0 ) || ( GXutil.strcmp(AV45FacPri, wcpOAV45FacPri) != 0 ) || ( AV58serief != wcpOAV58serief ) ) )
      {
         setjustcreated();
      }
      wcpOAV39Emprcod = AV39Emprcod ;
      wcpOAV40ClicodFrom = AV40ClicodFrom ;
      wcpOAV41ClicodTo = AV41ClicodTo ;
      wcpOAV42FacFchfrom = AV42FacFchfrom ;
      wcpOAV43FacFchto = AV43FacFchto ;
      wcpOAV44FacSerNum = AV44FacSerNum ;
      wcpOAV45FacPri = AV45FacPri ;
      wcpOAV58serief = AV58serief ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV39Emprcod = httpContext.cgiGet( sPrefix+"AV39Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV39Emprcod) > 0 )
      {
         AV39Emprcod = httpContext.cgiGet( sCtrlAV39Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Emprcod", AV39Emprcod);
      }
      else
      {
         AV39Emprcod = httpContext.cgiGet( sPrefix+"AV39Emprcod_PARM") ;
      }
      sCtrlAV40ClicodFrom = httpContext.cgiGet( sPrefix+"AV40ClicodFrom_CTRL") ;
      if ( GXutil.len( sCtrlAV40ClicodFrom) > 0 )
      {
         AV40ClicodFrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV40ClicodFrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40ClicodFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40ClicodFrom), 6, 0));
      }
      else
      {
         AV40ClicodFrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV40ClicodFrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV41ClicodTo = httpContext.cgiGet( sPrefix+"AV41ClicodTo_CTRL") ;
      if ( GXutil.len( sCtrlAV41ClicodTo) > 0 )
      {
         AV41ClicodTo = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV41ClicodTo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41ClicodTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41ClicodTo), 6, 0));
      }
      else
      {
         AV41ClicodTo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV41ClicodTo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV42FacFchfrom = httpContext.cgiGet( sPrefix+"AV42FacFchfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV42FacFchfrom) > 0 )
      {
         AV42FacFchfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV42FacFchfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42FacFchfrom", localUtil.format(AV42FacFchfrom, "99/99/99"));
      }
      else
      {
         AV42FacFchfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV42FacFchfrom_PARM"), 0) ;
      }
      sCtrlAV43FacFchto = httpContext.cgiGet( sPrefix+"AV43FacFchto_CTRL") ;
      if ( GXutil.len( sCtrlAV43FacFchto) > 0 )
      {
         AV43FacFchto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV43FacFchto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43FacFchto", localUtil.format(AV43FacFchto, "99/99/99"));
      }
      else
      {
         AV43FacFchto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV43FacFchto_PARM"), 0) ;
      }
      sCtrlAV44FacSerNum = httpContext.cgiGet( sPrefix+"AV44FacSerNum_CTRL") ;
      if ( GXutil.len( sCtrlAV44FacSerNum) > 0 )
      {
         AV44FacSerNum = httpContext.cgiGet( sCtrlAV44FacSerNum) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44FacSerNum", AV44FacSerNum);
      }
      else
      {
         AV44FacSerNum = httpContext.cgiGet( sPrefix+"AV44FacSerNum_PARM") ;
      }
      sCtrlAV45FacPri = httpContext.cgiGet( sPrefix+"AV45FacPri_CTRL") ;
      if ( GXutil.len( sCtrlAV45FacPri) > 0 )
      {
         AV45FacPri = httpContext.cgiGet( sCtrlAV45FacPri) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45FacPri", AV45FacPri);
      }
      else
      {
         AV45FacPri = httpContext.cgiGet( sPrefix+"AV45FacPri_PARM") ;
      }
      sCtrlAV58serief = httpContext.cgiGet( sPrefix+"AV58serief_CTRL") ;
      if ( GXutil.len( sCtrlAV58serief) > 0 )
      {
         AV58serief = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV58serief), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58serief", GXutil.str( AV58serief, 1, 0));
      }
      else
      {
         AV58serief = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV58serief_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa24J2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws24J2( ) ;
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
      ws24J2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39Emprcod_PARM", GXutil.rtrim( AV39Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV39Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39Emprcod_CTRL", GXutil.rtrim( sCtrlAV39Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40ClicodFrom_PARM", GXutil.ltrim( localUtil.ntoc( AV40ClicodFrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV40ClicodFrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40ClicodFrom_CTRL", GXutil.rtrim( sCtrlAV40ClicodFrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41ClicodTo_PARM", GXutil.ltrim( localUtil.ntoc( AV41ClicodTo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV41ClicodTo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41ClicodTo_CTRL", GXutil.rtrim( sCtrlAV41ClicodTo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42FacFchfrom_PARM", localUtil.dtoc( AV42FacFchfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV42FacFchfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42FacFchfrom_CTRL", GXutil.rtrim( sCtrlAV42FacFchfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43FacFchto_PARM", localUtil.dtoc( AV43FacFchto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV43FacFchto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43FacFchto_CTRL", GXutil.rtrim( sCtrlAV43FacFchto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44FacSerNum_PARM", GXutil.rtrim( AV44FacSerNum));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV44FacSerNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44FacSerNum_CTRL", GXutil.rtrim( sCtrlAV44FacSerNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45FacPri_PARM", GXutil.rtrim( AV45FacPri));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV45FacPri)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45FacPri_CTRL", GXutil.rtrim( sCtrlAV45FacPri));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58serief_PARM", GXutil.ltrim( localUtil.ntoc( AV58serief, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV58serief)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58serief_CTRL", GXutil.rtrim( sCtrlAV58serief));
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
      we24J2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115553166", true, true);
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
      httpContext.AddJavascriptSource("facturacion/resumenfacturacion_wc.js", "?202682115553166", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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

   public void subsflControlProps_362( )
   {
      edtavResumenfacturacion_sdt__faccod_Internalname = sPrefix+"RESUMENFACTURACION_SDT__FACCOD_"+sGXsfl_36_idx ;
      edtavResumenfacturacion_sdt__facfch_Internalname = sPrefix+"RESUMENFACTURACION_SDT__FACFCH_"+sGXsfl_36_idx ;
      edtavResumenfacturacion_sdt__clicod_Internalname = sPrefix+"RESUMENFACTURACION_SDT__CLICOD_"+sGXsfl_36_idx ;
      edtavResumenfacturacion_sdt__clinom_Internalname = sPrefix+"RESUMENFACTURACION_SDT__CLINOM_"+sGXsfl_36_idx ;
      edtavResumenfacturacion_sdt__facimptot_Internalname = sPrefix+"RESUMENFACTURACION_SDT__FACIMPTOT_"+sGXsfl_36_idx ;
      edtavResumenfacturacion_sdt__facimppp_Internalname = sPrefix+"RESUMENFACTURACION_SDT__FACIMPPP_"+sGXsfl_36_idx ;
      edtavResumenfacturacion_sdt__facivaimp_Internalname = sPrefix+"RESUMENFACTURACION_SDT__FACIVAIMP_"+sGXsfl_36_idx ;
      edtavResumenfacturacion_sdt__facimpgen_Internalname = sPrefix+"RESUMENFACTURACION_SDT__FACIMPGEN_"+sGXsfl_36_idx ;
      edtavResumenfacturacion_sdt__factot_Internalname = sPrefix+"RESUMENFACTURACION_SDT__FACTOT_"+sGXsfl_36_idx ;
      edtavResumenfacturacion_sdt__kgs_fra_Internalname = sPrefix+"RESUMENFACTURACION_SDT__KGS_FRA_"+sGXsfl_36_idx ;
      edtavResumenfacturacion_sdt__pzs_fra_Internalname = sPrefix+"RESUMENFACTURACION_SDT__PZS_FRA_"+sGXsfl_36_idx ;
      edtavResumenfacturacion_sdt__kgs_otros_Internalname = sPrefix+"RESUMENFACTURACION_SDT__KGS_OTROS_"+sGXsfl_36_idx ;
      edtavResumenfacturacion_sdt__pre_medio_Internalname = sPrefix+"RESUMENFACTURACION_SDT__PRE_MEDIO_"+sGXsfl_36_idx ;
   }

   public void subsflControlProps_fel_362( )
   {
      edtavResumenfacturacion_sdt__faccod_Internalname = sPrefix+"RESUMENFACTURACION_SDT__FACCOD_"+sGXsfl_36_fel_idx ;
      edtavResumenfacturacion_sdt__facfch_Internalname = sPrefix+"RESUMENFACTURACION_SDT__FACFCH_"+sGXsfl_36_fel_idx ;
      edtavResumenfacturacion_sdt__clicod_Internalname = sPrefix+"RESUMENFACTURACION_SDT__CLICOD_"+sGXsfl_36_fel_idx ;
      edtavResumenfacturacion_sdt__clinom_Internalname = sPrefix+"RESUMENFACTURACION_SDT__CLINOM_"+sGXsfl_36_fel_idx ;
      edtavResumenfacturacion_sdt__facimptot_Internalname = sPrefix+"RESUMENFACTURACION_SDT__FACIMPTOT_"+sGXsfl_36_fel_idx ;
      edtavResumenfacturacion_sdt__facimppp_Internalname = sPrefix+"RESUMENFACTURACION_SDT__FACIMPPP_"+sGXsfl_36_fel_idx ;
      edtavResumenfacturacion_sdt__facivaimp_Internalname = sPrefix+"RESUMENFACTURACION_SDT__FACIVAIMP_"+sGXsfl_36_fel_idx ;
      edtavResumenfacturacion_sdt__facimpgen_Internalname = sPrefix+"RESUMENFACTURACION_SDT__FACIMPGEN_"+sGXsfl_36_fel_idx ;
      edtavResumenfacturacion_sdt__factot_Internalname = sPrefix+"RESUMENFACTURACION_SDT__FACTOT_"+sGXsfl_36_fel_idx ;
      edtavResumenfacturacion_sdt__kgs_fra_Internalname = sPrefix+"RESUMENFACTURACION_SDT__KGS_FRA_"+sGXsfl_36_fel_idx ;
      edtavResumenfacturacion_sdt__pzs_fra_Internalname = sPrefix+"RESUMENFACTURACION_SDT__PZS_FRA_"+sGXsfl_36_fel_idx ;
      edtavResumenfacturacion_sdt__kgs_otros_Internalname = sPrefix+"RESUMENFACTURACION_SDT__KGS_OTROS_"+sGXsfl_36_fel_idx ;
      edtavResumenfacturacion_sdt__pre_medio_Internalname = sPrefix+"RESUMENFACTURACION_SDT__PRE_MEDIO_"+sGXsfl_36_fel_idx ;
   }

   public void sendrow_362( )
   {
      subsflControlProps_362( ) ;
      wb24J0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_36_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_36_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_36_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavResumenfacturacion_sdt__faccod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavResumenfacturacion_sdt__faccod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Faccod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavResumenfacturacion_sdt__faccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Faccod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Faccod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavResumenfacturacion_sdt__faccod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavResumenfacturacion_sdt__faccod_Visible),Integer.valueOf(edtavResumenfacturacion_sdt__faccod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavResumenfacturacion_sdt__facfch_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavResumenfacturacion_sdt__facfch_Internalname,localUtil.format(((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Facfch(), "99/99/99"),localUtil.format( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Facfch(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavResumenfacturacion_sdt__facfch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavResumenfacturacion_sdt__facfch_Visible),Integer.valueOf(edtavResumenfacturacion_sdt__facfch_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavResumenfacturacion_sdt__clicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavResumenfacturacion_sdt__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavResumenfacturacion_sdt__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavResumenfacturacion_sdt__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavResumenfacturacion_sdt__clicod_Visible),Integer.valueOf(edtavResumenfacturacion_sdt__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavResumenfacturacion_sdt__clinom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavResumenfacturacion_sdt__clinom_Internalname,GXutil.rtrim( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Clinom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavResumenfacturacion_sdt__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavResumenfacturacion_sdt__clinom_Visible),Integer.valueOf(edtavResumenfacturacion_sdt__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavResumenfacturacion_sdt__facimptot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavResumenfacturacion_sdt__facimptot_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Facimptot(), (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavResumenfacturacion_sdt__facimptot_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Facimptot(), "ZZZZZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Facimptot(), "ZZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavResumenfacturacion_sdt__facimptot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavResumenfacturacion_sdt__facimptot_Visible),Integer.valueOf(edtavResumenfacturacion_sdt__facimptot_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavResumenfacturacion_sdt__facimppp_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavResumenfacturacion_sdt__facimppp_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Facimppp(), (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavResumenfacturacion_sdt__facimppp_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Facimppp(), "ZZZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Facimppp(), "ZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavResumenfacturacion_sdt__facimppp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavResumenfacturacion_sdt__facimppp_Visible),Integer.valueOf(edtavResumenfacturacion_sdt__facimppp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavResumenfacturacion_sdt__facivaimp_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavResumenfacturacion_sdt__facivaimp_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Facivaimp(), (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavResumenfacturacion_sdt__facivaimp_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Facivaimp(), "ZZZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Facivaimp(), "ZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavResumenfacturacion_sdt__facivaimp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavResumenfacturacion_sdt__facivaimp_Visible),Integer.valueOf(edtavResumenfacturacion_sdt__facivaimp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavResumenfacturacion_sdt__facimpgen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavResumenfacturacion_sdt__facimpgen_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Facimpgen(), (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavResumenfacturacion_sdt__facimpgen_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Facimpgen(), "ZZZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Facimpgen(), "ZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavResumenfacturacion_sdt__facimpgen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavResumenfacturacion_sdt__facimpgen_Visible),Integer.valueOf(edtavResumenfacturacion_sdt__facimpgen_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavResumenfacturacion_sdt__factot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavResumenfacturacion_sdt__factot_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Factot(), (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavResumenfacturacion_sdt__factot_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Factot(), "ZZZZZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Factot(), "ZZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavResumenfacturacion_sdt__factot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavResumenfacturacion_sdt__factot_Visible),Integer.valueOf(edtavResumenfacturacion_sdt__factot_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavResumenfacturacion_sdt__kgs_fra_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavResumenfacturacion_sdt__kgs_fra_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Kgs_fra(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavResumenfacturacion_sdt__kgs_fra_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Kgs_fra(), "ZZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Kgs_fra(), "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavResumenfacturacion_sdt__kgs_fra_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavResumenfacturacion_sdt__kgs_fra_Visible),Integer.valueOf(edtavResumenfacturacion_sdt__kgs_fra_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavResumenfacturacion_sdt__pzs_fra_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavResumenfacturacion_sdt__pzs_fra_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Pzs_fra(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavResumenfacturacion_sdt__pzs_fra_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Pzs_fra()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Pzs_fra()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavResumenfacturacion_sdt__pzs_fra_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavResumenfacturacion_sdt__pzs_fra_Visible),Integer.valueOf(edtavResumenfacturacion_sdt__pzs_fra_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavResumenfacturacion_sdt__kgs_otros_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Kgs_otros(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavResumenfacturacion_sdt__kgs_otros_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Kgs_otros(), "ZZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Kgs_otros(), "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavResumenfacturacion_sdt__kgs_otros_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavResumenfacturacion_sdt__kgs_otros_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavResumenfacturacion_sdt__pre_medio_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavResumenfacturacion_sdt__pre_medio_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Pre_medio(), (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavResumenfacturacion_sdt__pre_medio_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Pre_medio(), "ZZZZ9.99999") : localUtil.format( ((app.facturacion.SdtResumenFacturacion_SDT_Item)AV12ResumenFacturacion_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtResumenFacturacion_SDT_Item_Pre_medio(), "ZZZZ9.99999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavResumenfacturacion_sdt__pre_medio_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavResumenfacturacion_sdt__pre_medio_Visible),Integer.valueOf(edtavResumenfacturacion_sdt__pre_medio_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes24J2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_36_idx = ((subGrid_Islastpage==1)&&(nGXsfl_36_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_36_idx+1) ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_362( ) ;
      }
      /* End function sendrow_362 */
   }

   public void startgridcontrol36( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"36\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavResumenfacturacion_sdt__faccod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Factura", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavResumenfacturacion_sdt__facfch_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavResumenfacturacion_sdt__clicod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavResumenfacturacion_sdt__clinom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavResumenfacturacion_sdt__facimptot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavResumenfacturacion_sdt__facimppp_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Imp. Dto. PP", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavResumenfacturacion_sdt__facivaimp_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Imp. IVA", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavResumenfacturacion_sdt__facimpgen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Imp. Dto. Gral.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavResumenfacturacion_sdt__factot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TOTAL", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavResumenfacturacion_sdt__kgs_fra_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs Fact.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavResumenfacturacion_sdt__pzs_fra_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pcs. Fact.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavResumenfacturacion_sdt__pre_medio_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio medio p/kg", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavResumenfacturacion_sdt__faccod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavResumenfacturacion_sdt__faccod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavResumenfacturacion_sdt__facfch_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavResumenfacturacion_sdt__facfch_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavResumenfacturacion_sdt__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavResumenfacturacion_sdt__clicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavResumenfacturacion_sdt__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavResumenfacturacion_sdt__clinom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavResumenfacturacion_sdt__facimptot_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavResumenfacturacion_sdt__facimptot_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavResumenfacturacion_sdt__facimppp_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavResumenfacturacion_sdt__facimppp_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavResumenfacturacion_sdt__facivaimp_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavResumenfacturacion_sdt__facivaimp_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavResumenfacturacion_sdt__facimpgen_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavResumenfacturacion_sdt__facimpgen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavResumenfacturacion_sdt__factot_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavResumenfacturacion_sdt__factot_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavResumenfacturacion_sdt__kgs_fra_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavResumenfacturacion_sdt__kgs_fra_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavResumenfacturacion_sdt__pzs_fra_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavResumenfacturacion_sdt__pzs_fra_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavResumenfacturacion_sdt__kgs_otros_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavResumenfacturacion_sdt__pre_medio_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavResumenfacturacion_sdt__pre_medio_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnpdf_Internalname = sPrefix+"BTNPDF" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavResumenfacturacion_sdt__faccod_Internalname = sPrefix+"RESUMENFACTURACION_SDT__FACCOD" ;
      edtavResumenfacturacion_sdt__facfch_Internalname = sPrefix+"RESUMENFACTURACION_SDT__FACFCH" ;
      edtavResumenfacturacion_sdt__clicod_Internalname = sPrefix+"RESUMENFACTURACION_SDT__CLICOD" ;
      edtavResumenfacturacion_sdt__clinom_Internalname = sPrefix+"RESUMENFACTURACION_SDT__CLINOM" ;
      edtavResumenfacturacion_sdt__facimptot_Internalname = sPrefix+"RESUMENFACTURACION_SDT__FACIMPTOT" ;
      edtavResumenfacturacion_sdt__facimppp_Internalname = sPrefix+"RESUMENFACTURACION_SDT__FACIMPPP" ;
      edtavResumenfacturacion_sdt__facivaimp_Internalname = sPrefix+"RESUMENFACTURACION_SDT__FACIVAIMP" ;
      edtavResumenfacturacion_sdt__facimpgen_Internalname = sPrefix+"RESUMENFACTURACION_SDT__FACIMPGEN" ;
      edtavResumenfacturacion_sdt__factot_Internalname = sPrefix+"RESUMENFACTURACION_SDT__FACTOT" ;
      edtavResumenfacturacion_sdt__kgs_fra_Internalname = sPrefix+"RESUMENFACTURACION_SDT__KGS_FRA" ;
      edtavResumenfacturacion_sdt__pzs_fra_Internalname = sPrefix+"RESUMENFACTURACION_SDT__PZS_FRA" ;
      edtavResumenfacturacion_sdt__kgs_otros_Internalname = sPrefix+"RESUMENFACTURACION_SDT__KGS_OTROS" ;
      edtavResumenfacturacion_sdt__pre_medio_Internalname = sPrefix+"RESUMENFACTURACION_SDT__PRE_MEDIO" ;
      edtavTotvalue_facimptot_Internalname = sPrefix+"vTOTVALUE_FACIMPTOT" ;
      edtavTotvalue_facimppp_Internalname = sPrefix+"vTOTVALUE_FACIMPPP" ;
      edtavTotvalue_facivaimp_Internalname = sPrefix+"vTOTVALUE_FACIVAIMP" ;
      edtavTotvalue_facimpgen_Internalname = sPrefix+"vTOTVALUE_FACIMPGEN" ;
      edtavTotvalue_factot_Internalname = sPrefix+"vTOTVALUE_FACTOT" ;
      edtavTotvalue_kgs_fra_Internalname = sPrefix+"vTOTVALUE_KGS_FRA" ;
      edtavTotvalue_pzs_fra_Internalname = sPrefix+"vTOTVALUE_PZS_FRA" ;
      edtavTotvalue_pre_medio_Internalname = sPrefix+"vTOTVALUE_PRE_MEDIO" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
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
      edtavResumenfacturacion_sdt__pre_medio_Jsonclick = "" ;
      edtavResumenfacturacion_sdt__pre_medio_Enabled = 0 ;
      edtavResumenfacturacion_sdt__pre_medio_Visible = -1 ;
      edtavResumenfacturacion_sdt__kgs_otros_Jsonclick = "" ;
      edtavResumenfacturacion_sdt__kgs_otros_Enabled = 0 ;
      edtavResumenfacturacion_sdt__pzs_fra_Jsonclick = "" ;
      edtavResumenfacturacion_sdt__pzs_fra_Enabled = 0 ;
      edtavResumenfacturacion_sdt__pzs_fra_Visible = -1 ;
      edtavResumenfacturacion_sdt__kgs_fra_Jsonclick = "" ;
      edtavResumenfacturacion_sdt__kgs_fra_Enabled = 0 ;
      edtavResumenfacturacion_sdt__kgs_fra_Visible = -1 ;
      edtavResumenfacturacion_sdt__factot_Jsonclick = "" ;
      edtavResumenfacturacion_sdt__factot_Enabled = 0 ;
      edtavResumenfacturacion_sdt__factot_Visible = -1 ;
      edtavResumenfacturacion_sdt__facimpgen_Jsonclick = "" ;
      edtavResumenfacturacion_sdt__facimpgen_Enabled = 0 ;
      edtavResumenfacturacion_sdt__facimpgen_Visible = -1 ;
      edtavResumenfacturacion_sdt__facivaimp_Jsonclick = "" ;
      edtavResumenfacturacion_sdt__facivaimp_Enabled = 0 ;
      edtavResumenfacturacion_sdt__facivaimp_Visible = -1 ;
      edtavResumenfacturacion_sdt__facimppp_Jsonclick = "" ;
      edtavResumenfacturacion_sdt__facimppp_Enabled = 0 ;
      edtavResumenfacturacion_sdt__facimppp_Visible = -1 ;
      edtavResumenfacturacion_sdt__facimptot_Jsonclick = "" ;
      edtavResumenfacturacion_sdt__facimptot_Enabled = 0 ;
      edtavResumenfacturacion_sdt__facimptot_Visible = -1 ;
      edtavResumenfacturacion_sdt__clinom_Jsonclick = "" ;
      edtavResumenfacturacion_sdt__clinom_Enabled = 0 ;
      edtavResumenfacturacion_sdt__clinom_Visible = -1 ;
      edtavResumenfacturacion_sdt__clicod_Jsonclick = "" ;
      edtavResumenfacturacion_sdt__clicod_Enabled = 0 ;
      edtavResumenfacturacion_sdt__clicod_Visible = -1 ;
      edtavResumenfacturacion_sdt__facfch_Jsonclick = "" ;
      edtavResumenfacturacion_sdt__facfch_Enabled = 0 ;
      edtavResumenfacturacion_sdt__facfch_Visible = -1 ;
      edtavResumenfacturacion_sdt__faccod_Jsonclick = "" ;
      edtavResumenfacturacion_sdt__faccod_Enabled = 0 ;
      edtavResumenfacturacion_sdt__faccod_Visible = -1 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvalue_pre_medio_Jsonclick = "" ;
      edtavTotvalue_pre_medio_Enabled = 1 ;
      edtavTotvalue_pzs_fra_Jsonclick = "" ;
      edtavTotvalue_pzs_fra_Enabled = 1 ;
      edtavTotvalue_kgs_fra_Jsonclick = "" ;
      edtavTotvalue_kgs_fra_Enabled = 1 ;
      edtavTotvalue_factot_Jsonclick = "" ;
      edtavTotvalue_factot_Enabled = 1 ;
      edtavTotvalue_facimpgen_Jsonclick = "" ;
      edtavTotvalue_facimpgen_Enabled = 1 ;
      edtavTotvalue_facivaimp_Jsonclick = "" ;
      edtavTotvalue_facivaimp_Enabled = 1 ;
      edtavTotvalue_facimppp_Jsonclick = "" ;
      edtavTotvalue_facimppp_Enabled = 1 ;
      edtavTotvalue_facimptot_Jsonclick = "" ;
      edtavTotvalue_facimptot_Enabled = 1 ;
      edtavResumenfacturacion_sdt__pre_medio_Visible = -1 ;
      edtavResumenfacturacion_sdt__pzs_fra_Visible = -1 ;
      edtavResumenfacturacion_sdt__kgs_fra_Visible = -1 ;
      edtavResumenfacturacion_sdt__factot_Visible = -1 ;
      edtavResumenfacturacion_sdt__facimpgen_Visible = -1 ;
      edtavResumenfacturacion_sdt__facivaimp_Visible = -1 ;
      edtavResumenfacturacion_sdt__facimppp_Visible = -1 ;
      edtavResumenfacturacion_sdt__facimptot_Visible = -1 ;
      edtavResumenfacturacion_sdt__clinom_Visible = -1 ;
      edtavResumenfacturacion_sdt__clicod_Visible = -1 ;
      edtavResumenfacturacion_sdt__facfch_Visible = -1 ;
      edtavResumenfacturacion_sdt__faccod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavResumenfacturacion_sdt__pre_medio_Enabled = -1 ;
      edtavResumenfacturacion_sdt__kgs_otros_Enabled = -1 ;
      edtavResumenfacturacion_sdt__pzs_fra_Enabled = -1 ;
      edtavResumenfacturacion_sdt__kgs_fra_Enabled = -1 ;
      edtavResumenfacturacion_sdt__factot_Enabled = -1 ;
      edtavResumenfacturacion_sdt__facimpgen_Enabled = -1 ;
      edtavResumenfacturacion_sdt__facivaimp_Enabled = -1 ;
      edtavResumenfacturacion_sdt__facimppp_Enabled = -1 ;
      edtavResumenfacturacion_sdt__facimptot_Enabled = -1 ;
      edtavResumenfacturacion_sdt__clinom_Enabled = -1 ;
      edtavResumenfacturacion_sdt__clicod_Enabled = -1 ;
      edtavResumenfacturacion_sdt__facfch_Enabled = -1 ;
      edtavResumenfacturacion_sdt__faccod_Enabled = -1 ;
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
      Ddo_grid_Columnssortvalues = "|||||||||||" ;
      Ddo_grid_Columnids = "0:ResumenFacturacion_SDT__Faccod|1:ResumenFacturacion_SDT__FacFch|2:ResumenFacturacion_SDT__CliCod|3:ResumenFacturacion_SDT__CliNom|4:ResumenFacturacion_SDT__FacImpTot|5:ResumenFacturacion_SDT__FacImpPP|6:ResumenFacturacion_SDT__FacIVAImp|7:ResumenFacturacion_SDT__FacImpGen|8:ResumenFacturacion_SDT__FacTot|9:ResumenFacturacion_SDT__Kgs_Fra|10:ResumenFacturacion_SDT__Pzs_fra|12:ResumenFacturacion_SDT__Pre_medio" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV39Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV40ClicodFrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV41ClicodTo',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV42FacFchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV43FacFchto',fld:'vFACFCHTO',pic:''},{av:'AV44FacSerNum',fld:'vFACSERNUM',pic:''},{av:'AV45FacPri',fld:'vFACPRI',pic:'9'},{av:'AV58serief',fld:'vSERIEF',pic:'9'},{av:'AV55moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV12ResumenFacturacion_SDT',fld:'vRESUMENFACTURACION_SDT',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV25Tot_FacImpTot',fld:'vTOT_FACIMPTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV27Tot_FacImpPP',fld:'vTOT_FACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV29Tot_FacIVAImp',fld:'vTOT_FACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV31Tot_FacImpGen',fld:'vTOT_FACIMPGEN',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV33Tot_FacTot',fld:'vTOT_FACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV35Tot_Kgs_Fra',fld:'vTOT_KGS_FRA',pic:'ZZZZZZ9.99',hsh:true},{av:'AV56Tot_Pzs_fra',fld:'vTOT_PZS_FRA',pic:'ZZZZZ9',hsh:true},{av:'AV37Tot_Kgs_otros',fld:'vTOT_KGS_OTROS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV49Tot_Pre_medio',fld:'vTOT_PRE_MEDIO',pic:'ZZZZ9.99999',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'RESUMENFACTURACION_SDT__FACCOD',prop:'Visible'},{ctrl:'RESUMENFACTURACION_SDT__FACFCH',prop:'Visible'},{ctrl:'RESUMENFACTURACION_SDT__CLICOD',prop:'Visible'},{ctrl:'RESUMENFACTURACION_SDT__CLINOM',prop:'Visible'},{ctrl:'RESUMENFACTURACION_SDT__FACIMPTOT',prop:'Visible'},{ctrl:'RESUMENFACTURACION_SDT__FACIMPPP',prop:'Visible'},{ctrl:'RESUMENFACTURACION_SDT__FACIVAIMP',prop:'Visible'},{ctrl:'RESUMENFACTURACION_SDT__FACIMPGEN',prop:'Visible'},{ctrl:'RESUMENFACTURACION_SDT__FACTOT',prop:'Visible'},{ctrl:'RESUMENFACTURACION_SDT__KGS_FRA',prop:'Visible'},{ctrl:'RESUMENFACTURACION_SDT__PZS_FRA',prop:'Visible'},{ctrl:'RESUMENFACTURACION_SDT__PRE_MEDIO',prop:'Visible'},{av:'AV22GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV23GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV25Tot_FacImpTot',fld:'vTOT_FACIMPTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV27Tot_FacImpPP',fld:'vTOT_FACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV29Tot_FacIVAImp',fld:'vTOT_FACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV31Tot_FacImpGen',fld:'vTOT_FACIMPGEN',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV33Tot_FacTot',fld:'vTOT_FACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV35Tot_Kgs_Fra',fld:'vTOT_KGS_FRA',pic:'ZZZZZZ9.99',hsh:true},{av:'AV56Tot_Pzs_fra',fld:'vTOT_PZS_FRA',pic:'ZZZZZ9',hsh:true},{av:'AV37Tot_Kgs_otros',fld:'vTOT_KGS_OTROS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV49Tot_Pre_medio',fld:'vTOT_PRE_MEDIO',pic:'ZZZZ9.99999',hsh:true},{av:'AV26TotValue_FacImpTot',fld:'vTOTVALUE_FACIMPTOT',pic:''},{av:'AV28TotValue_FacImpPP',fld:'vTOTVALUE_FACIMPPP',pic:''},{av:'AV30TotValue_FacIVAImp',fld:'vTOTVALUE_FACIVAIMP',pic:''},{av:'AV32TotValue_FacImpGen',fld:'vTOTVALUE_FACIMPGEN',pic:''},{av:'AV34TotValue_FacTot',fld:'vTOTVALUE_FACTOT',pic:''},{av:'AV36TotValue_Kgs_Fra',fld:'vTOTVALUE_KGS_FRA',pic:''},{av:'AV57TotValue_Pzs_fra',fld:'vTOTVALUE_PZS_FRA',pic:''},{av:'AV50TotValue_Pre_medio',fld:'vTOTVALUE_PRE_MEDIO',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1224J2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV39Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV40ClicodFrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV41ClicodTo',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV42FacFchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV43FacFchto',fld:'vFACFCHTO',pic:''},{av:'AV44FacSerNum',fld:'vFACSERNUM',pic:''},{av:'AV45FacPri',fld:'vFACPRI',pic:'9'},{av:'AV58serief',fld:'vSERIEF',pic:'9'},{av:'AV55moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV12ResumenFacturacion_SDT',fld:'vRESUMENFACTURACION_SDT',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV25Tot_FacImpTot',fld:'vTOT_FACIMPTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV27Tot_FacImpPP',fld:'vTOT_FACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV29Tot_FacIVAImp',fld:'vTOT_FACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV31Tot_FacImpGen',fld:'vTOT_FACIMPGEN',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV33Tot_FacTot',fld:'vTOT_FACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV35Tot_Kgs_Fra',fld:'vTOT_KGS_FRA',pic:'ZZZZZZ9.99',hsh:true},{av:'AV56Tot_Pzs_fra',fld:'vTOT_PZS_FRA',pic:'ZZZZZ9',hsh:true},{av:'AV37Tot_Kgs_otros',fld:'vTOT_KGS_OTROS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV49Tot_Pre_medio',fld:'vTOT_PRE_MEDIO',pic:'ZZZZ9.99999',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1324J2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV39Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV40ClicodFrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV41ClicodTo',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV42FacFchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV43FacFchto',fld:'vFACFCHTO',pic:''},{av:'AV44FacSerNum',fld:'vFACSERNUM',pic:''},{av:'AV45FacPri',fld:'vFACPRI',pic:'9'},{av:'AV58serief',fld:'vSERIEF',pic:'9'},{av:'AV55moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV12ResumenFacturacion_SDT',fld:'vRESUMENFACTURACION_SDT',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV25Tot_FacImpTot',fld:'vTOT_FACIMPTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV27Tot_FacImpPP',fld:'vTOT_FACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV29Tot_FacIVAImp',fld:'vTOT_FACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV31Tot_FacImpGen',fld:'vTOT_FACIMPGEN',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV33Tot_FacTot',fld:'vTOT_FACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV35Tot_Kgs_Fra',fld:'vTOT_KGS_FRA',pic:'ZZZZZZ9.99',hsh:true},{av:'AV56Tot_Pzs_fra',fld:'vTOT_PZS_FRA',pic:'ZZZZZ9',hsh:true},{av:'AV37Tot_Kgs_otros',fld:'vTOT_KGS_OTROS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV49Tot_Pre_medio',fld:'vTOT_PRE_MEDIO',pic:'ZZZZ9.99999',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1924J2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1424J2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV39Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV40ClicodFrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV41ClicodTo',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV42FacFchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV43FacFchto',fld:'vFACFCHTO',pic:''},{av:'AV44FacSerNum',fld:'vFACSERNUM',pic:''},{av:'AV45FacPri',fld:'vFACPRI',pic:'9'},{av:'AV58serief',fld:'vSERIEF',pic:'9'},{av:'AV55moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV12ResumenFacturacion_SDT',fld:'vRESUMENFACTURACION_SDT',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV25Tot_FacImpTot',fld:'vTOT_FACIMPTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV27Tot_FacImpPP',fld:'vTOT_FACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV29Tot_FacIVAImp',fld:'vTOT_FACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV31Tot_FacImpGen',fld:'vTOT_FACIMPGEN',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV33Tot_FacTot',fld:'vTOT_FACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV35Tot_Kgs_Fra',fld:'vTOT_KGS_FRA',pic:'ZZZZZZ9.99',hsh:true},{av:'AV56Tot_Pzs_fra',fld:'vTOT_PZS_FRA',pic:'ZZZZZ9',hsh:true},{av:'AV37Tot_Kgs_otros',fld:'vTOT_KGS_OTROS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV49Tot_Pre_medio',fld:'vTOT_PRE_MEDIO',pic:'ZZZZ9.99999',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'RESUMENFACTURACION_SDT__FACCOD',prop:'Visible'},{ctrl:'RESUMENFACTURACION_SDT__FACFCH',prop:'Visible'},{ctrl:'RESUMENFACTURACION_SDT__CLICOD',prop:'Visible'},{ctrl:'RESUMENFACTURACION_SDT__CLINOM',prop:'Visible'},{ctrl:'RESUMENFACTURACION_SDT__FACIMPTOT',prop:'Visible'},{ctrl:'RESUMENFACTURACION_SDT__FACIMPPP',prop:'Visible'},{ctrl:'RESUMENFACTURACION_SDT__FACIVAIMP',prop:'Visible'},{ctrl:'RESUMENFACTURACION_SDT__FACIMPGEN',prop:'Visible'},{ctrl:'RESUMENFACTURACION_SDT__FACTOT',prop:'Visible'},{ctrl:'RESUMENFACTURACION_SDT__KGS_FRA',prop:'Visible'},{ctrl:'RESUMENFACTURACION_SDT__PZS_FRA',prop:'Visible'},{ctrl:'RESUMENFACTURACION_SDT__PRE_MEDIO',prop:'Visible'},{av:'AV22GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV23GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV25Tot_FacImpTot',fld:'vTOT_FACIMPTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV27Tot_FacImpPP',fld:'vTOT_FACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV29Tot_FacIVAImp',fld:'vTOT_FACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV31Tot_FacImpGen',fld:'vTOT_FACIMPGEN',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV33Tot_FacTot',fld:'vTOT_FACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV35Tot_Kgs_Fra',fld:'vTOT_KGS_FRA',pic:'ZZZZZZ9.99',hsh:true},{av:'AV56Tot_Pzs_fra',fld:'vTOT_PZS_FRA',pic:'ZZZZZ9',hsh:true},{av:'AV37Tot_Kgs_otros',fld:'vTOT_KGS_OTROS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV49Tot_Pre_medio',fld:'vTOT_PRE_MEDIO',pic:'ZZZZ9.99999',hsh:true},{av:'AV26TotValue_FacImpTot',fld:'vTOTVALUE_FACIMPTOT',pic:''},{av:'AV28TotValue_FacImpPP',fld:'vTOTVALUE_FACIMPPP',pic:''},{av:'AV30TotValue_FacIVAImp',fld:'vTOTVALUE_FACIVAIMP',pic:''},{av:'AV32TotValue_FacImpGen',fld:'vTOTVALUE_FACIMPGEN',pic:''},{av:'AV34TotValue_FacTot',fld:'vTOTVALUE_FACTOT',pic:''},{av:'AV36TotValue_Kgs_Fra',fld:'vTOTVALUE_KGS_FRA',pic:''},{av:'AV57TotValue_Pzs_fra',fld:'vTOTVALUE_PZS_FRA',pic:''},{av:'AV50TotValue_Pre_medio',fld:'vTOTVALUE_PRE_MEDIO',pic:''}]}");
      setEventMetadata("'DOPDF'","{handler:'e1124J1',iparms:[{av:'AV39Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV40ClicodFrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV41ClicodTo',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV42FacFchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV43FacFchto',fld:'vFACFCHTO',pic:''},{av:'AV45FacPri',fld:'vFACPRI',pic:'9'},{av:'AV58serief',fld:'vSERIEF',pic:'9'}]");
      setEventMetadata("'DOPDF'",",oparms:[{av:'AV58serief',fld:'vSERIEF',pic:'9'},{av:'AV45FacPri',fld:'vFACPRI',pic:'9'},{av:'AV43FacFchto',fld:'vFACFCHTO',pic:''},{av:'AV42FacFchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV41ClicodTo',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV40ClicodFrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV39Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1524J2',iparms:[{av:'AV12ResumenFacturacion_SDT',fld:'vRESUMENFACTURACION_SDT',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1624J2',iparms:[{av:'AV12ResumenFacturacion_SDT',fld:'vRESUMENFACTURACION_SDT',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e2024J2',iparms:[{av:'AV12ResumenFacturacion_SDT',fld:'vRESUMENFACTURACION_SDT',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv14',iparms:[]");
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
      wcpOAV39Emprcod = "" ;
      wcpOAV42FacFchfrom = GXutil.nullDate() ;
      wcpOAV43FacFchto = GXutil.nullDate() ;
      wcpOAV44FacSerNum = "" ;
      wcpOAV45FacPri = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV39Emprcod = "" ;
      AV42FacFchfrom = GXutil.nullDate() ;
      AV43FacFchto = GXutil.nullDate() ;
      AV44FacSerNum = "" ;
      AV45FacPri = "" ;
      AV17ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV75Pgmname = "" ;
      AV12ResumenFacturacion_SDT = new GXBaseCollection<app.facturacion.SdtResumenFacturacion_SDT_Item>(app.facturacion.SdtResumenFacturacion_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV25Tot_FacImpTot = DecimalUtil.ZERO ;
      AV27Tot_FacImpPP = DecimalUtil.ZERO ;
      AV29Tot_FacIVAImp = DecimalUtil.ZERO ;
      AV31Tot_FacImpGen = DecimalUtil.ZERO ;
      AV33Tot_FacTot = DecimalUtil.ZERO ;
      AV35Tot_Kgs_Fra = DecimalUtil.ZERO ;
      AV37Tot_Kgs_otros = DecimalUtil.ZERO ;
      AV49Tot_Pre_medio = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV20DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnpdf_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
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
      AV26TotValue_FacImpTot = "" ;
      AV28TotValue_FacImpPP = "" ;
      AV30TotValue_FacIVAImp = "" ;
      AV32TotValue_FacImpGen = "" ;
      AV34TotValue_FacTot = "" ;
      AV36TotValue_Kgs_Fra = "" ;
      AV57TotValue_Pzs_fra = "" ;
      AV50TotValue_Pre_medio = "" ;
      hsh = "" ;
      GXt_objcol_SdtResumenFacturacion_SDT_Item1 = new GXBaseCollection<app.facturacion.SdtResumenFacturacion_SDT_Item>(app.facturacion.SdtResumenFacturacion_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtResumenFacturacion_SDT_Item2 = new GXBaseCollection[1] ;
      AV46Station = "" ;
      GXv_char4 = new String[1] ;
      AV47EmprNom = "" ;
      AV48UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_int10 = new byte[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV19Session = httpContext.getWebSession();
      AV15ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV51ResumenFacturacion_SDT_json = "" ;
      AV54Websession = httpContext.getWebSession();
      AV13ExcelFilename = "" ;
      AV14ErrorMessage = "" ;
      GXv_char5 = new String[1] ;
      AV16UserCustomValue = "" ;
      GXt_char3 = "" ;
      GXv_char6 = new String[1] ;
      AV18ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV24ResumenFacturacion_SDTItem = new app.facturacion.SdtResumenFacturacion_SDT_Item(remoteHandle, context);
      AV38TotValue_Kgs_otros = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV39Emprcod = "" ;
      sCtrlAV40ClicodFrom = "" ;
      sCtrlAV41ClicodTo = "" ;
      sCtrlAV42FacFchfrom = "" ;
      sCtrlAV43FacFchto = "" ;
      sCtrlAV44FacSerNum = "" ;
      sCtrlAV45FacPri = "" ;
      sCtrlAV58serief = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV75Pgmname = "Facturacion.ResumenFacturacion_WC" ;
      /* GeneXus formulas. */
      AV75Pgmname = "Facturacion.ResumenFacturacion_WC" ;
      Gx_err = (short)(0) ;
      edtavResumenfacturacion_sdt__faccod_Enabled = 0 ;
      edtavResumenfacturacion_sdt__facfch_Enabled = 0 ;
      edtavResumenfacturacion_sdt__clicod_Enabled = 0 ;
      edtavResumenfacturacion_sdt__clinom_Enabled = 0 ;
      edtavResumenfacturacion_sdt__facimptot_Enabled = 0 ;
      edtavResumenfacturacion_sdt__facimppp_Enabled = 0 ;
      edtavResumenfacturacion_sdt__facivaimp_Enabled = 0 ;
      edtavResumenfacturacion_sdt__facimpgen_Enabled = 0 ;
      edtavResumenfacturacion_sdt__factot_Enabled = 0 ;
      edtavResumenfacturacion_sdt__kgs_fra_Enabled = 0 ;
      edtavResumenfacturacion_sdt__pzs_fra_Enabled = 0 ;
      edtavResumenfacturacion_sdt__kgs_otros_Enabled = 0 ;
      edtavResumenfacturacion_sdt__pre_medio_Enabled = 0 ;
      edtavTotvalue_facimptot_Enabled = 0 ;
      edtavTotvalue_facimppp_Enabled = 0 ;
      edtavTotvalue_facivaimp_Enabled = 0 ;
      edtavTotvalue_facimpgen_Enabled = 0 ;
      edtavTotvalue_factot_Enabled = 0 ;
      edtavTotvalue_kgs_fra_Enabled = 0 ;
      edtavTotvalue_pzs_fra_Enabled = 0 ;
      edtavTotvalue_pre_medio_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV58serief ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV58serief ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int9 ;
   private byte GXv_int10[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV55moda21 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV40ClicodFrom ;
   private int wcpOAV41ClicodTo ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_36 ;
   private int AV40ClicodFrom ;
   private int AV41ClicodTo ;
   private int nGXsfl_36_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV61GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavResumenfacturacion_sdt__faccod_Enabled ;
   private int edtavResumenfacturacion_sdt__facfch_Enabled ;
   private int edtavResumenfacturacion_sdt__clicod_Enabled ;
   private int edtavResumenfacturacion_sdt__clinom_Enabled ;
   private int edtavResumenfacturacion_sdt__facimptot_Enabled ;
   private int edtavResumenfacturacion_sdt__facimppp_Enabled ;
   private int edtavResumenfacturacion_sdt__facivaimp_Enabled ;
   private int edtavResumenfacturacion_sdt__facimpgen_Enabled ;
   private int edtavResumenfacturacion_sdt__factot_Enabled ;
   private int edtavResumenfacturacion_sdt__kgs_fra_Enabled ;
   private int edtavResumenfacturacion_sdt__pzs_fra_Enabled ;
   private int edtavResumenfacturacion_sdt__kgs_otros_Enabled ;
   private int edtavResumenfacturacion_sdt__pre_medio_Enabled ;
   private int edtavTotvalue_facimptot_Enabled ;
   private int edtavTotvalue_facimppp_Enabled ;
   private int edtavTotvalue_facivaimp_Enabled ;
   private int edtavTotvalue_facimpgen_Enabled ;
   private int edtavTotvalue_factot_Enabled ;
   private int edtavTotvalue_kgs_fra_Enabled ;
   private int edtavTotvalue_pzs_fra_Enabled ;
   private int edtavTotvalue_pre_medio_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_36_fel_idx=1 ;
   private int edtavResumenfacturacion_sdt__faccod_Visible ;
   private int edtavResumenfacturacion_sdt__facfch_Visible ;
   private int edtavResumenfacturacion_sdt__clicod_Visible ;
   private int edtavResumenfacturacion_sdt__clinom_Visible ;
   private int edtavResumenfacturacion_sdt__facimptot_Visible ;
   private int edtavResumenfacturacion_sdt__facimppp_Visible ;
   private int edtavResumenfacturacion_sdt__facivaimp_Visible ;
   private int edtavResumenfacturacion_sdt__facimpgen_Visible ;
   private int edtavResumenfacturacion_sdt__factot_Visible ;
   private int edtavResumenfacturacion_sdt__kgs_fra_Visible ;
   private int edtavResumenfacturacion_sdt__pzs_fra_Visible ;
   private int edtavResumenfacturacion_sdt__pre_medio_Visible ;
   private int AV21PageToGo ;
   private int AV76GXV15 ;
   private int AV77Totalrecords ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV56Tot_Pzs_fra ;
   private long AV22GridCurrentPage ;
   private long AV23GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV25Tot_FacImpTot ;
   private java.math.BigDecimal AV27Tot_FacImpPP ;
   private java.math.BigDecimal AV29Tot_FacIVAImp ;
   private java.math.BigDecimal AV31Tot_FacImpGen ;
   private java.math.BigDecimal AV33Tot_FacTot ;
   private java.math.BigDecimal AV35Tot_Kgs_Fra ;
   private java.math.BigDecimal AV37Tot_Kgs_otros ;
   private java.math.BigDecimal AV49Tot_Pre_medio ;
   private String wcpOAV39Emprcod ;
   private String wcpOAV44FacSerNum ;
   private String wcpOAV45FacPri ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV39Emprcod ;
   private String AV44FacSerNum ;
   private String AV45FacPri ;
   private String sGXsfl_36_idx="0001" ;
   private String AV75Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String bttBtnpdf_Internalname ;
   private String bttBtnpdf_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
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
   private String edtavTotvalue_facimptot_Internalname ;
   private String edtavResumenfacturacion_sdt__faccod_Internalname ;
   private String edtavResumenfacturacion_sdt__facfch_Internalname ;
   private String edtavResumenfacturacion_sdt__clicod_Internalname ;
   private String edtavResumenfacturacion_sdt__clinom_Internalname ;
   private String edtavResumenfacturacion_sdt__facimptot_Internalname ;
   private String edtavResumenfacturacion_sdt__facimppp_Internalname ;
   private String edtavResumenfacturacion_sdt__facivaimp_Internalname ;
   private String edtavResumenfacturacion_sdt__facimpgen_Internalname ;
   private String edtavResumenfacturacion_sdt__factot_Internalname ;
   private String edtavResumenfacturacion_sdt__kgs_fra_Internalname ;
   private String edtavResumenfacturacion_sdt__pzs_fra_Internalname ;
   private String edtavResumenfacturacion_sdt__kgs_otros_Internalname ;
   private String edtavResumenfacturacion_sdt__pre_medio_Internalname ;
   private String edtavTotvalue_facimppp_Internalname ;
   private String edtavTotvalue_facivaimp_Internalname ;
   private String edtavTotvalue_facimpgen_Internalname ;
   private String edtavTotvalue_factot_Internalname ;
   private String edtavTotvalue_kgs_fra_Internalname ;
   private String edtavTotvalue_pzs_fra_Internalname ;
   private String edtavTotvalue_pre_medio_Internalname ;
   private String sGXsfl_36_fel_idx="0001" ;
   private String hsh ;
   private String AV46Station ;
   private String GXv_char4[] ;
   private String AV47EmprNom ;
   private String AV48UsurCod ;
   private String GXv_char5[] ;
   private String GXt_char3 ;
   private String GXv_char6[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvalue_facimptot_Jsonclick ;
   private String edtavTotvalue_facimppp_Jsonclick ;
   private String edtavTotvalue_facivaimp_Jsonclick ;
   private String edtavTotvalue_facimpgen_Jsonclick ;
   private String edtavTotvalue_factot_Jsonclick ;
   private String edtavTotvalue_kgs_fra_Jsonclick ;
   private String edtavTotvalue_pzs_fra_Jsonclick ;
   private String edtavTotvalue_pre_medio_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV39Emprcod ;
   private String sCtrlAV40ClicodFrom ;
   private String sCtrlAV41ClicodTo ;
   private String sCtrlAV42FacFchfrom ;
   private String sCtrlAV43FacFchto ;
   private String sCtrlAV44FacSerNum ;
   private String sCtrlAV45FacPri ;
   private String sCtrlAV58serief ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavResumenfacturacion_sdt__faccod_Jsonclick ;
   private String edtavResumenfacturacion_sdt__facfch_Jsonclick ;
   private String edtavResumenfacturacion_sdt__clicod_Jsonclick ;
   private String edtavResumenfacturacion_sdt__clinom_Jsonclick ;
   private String edtavResumenfacturacion_sdt__facimptot_Jsonclick ;
   private String edtavResumenfacturacion_sdt__facimppp_Jsonclick ;
   private String edtavResumenfacturacion_sdt__facivaimp_Jsonclick ;
   private String edtavResumenfacturacion_sdt__facimpgen_Jsonclick ;
   private String edtavResumenfacturacion_sdt__factot_Jsonclick ;
   private String edtavResumenfacturacion_sdt__kgs_fra_Jsonclick ;
   private String edtavResumenfacturacion_sdt__pzs_fra_Jsonclick ;
   private String edtavResumenfacturacion_sdt__kgs_otros_Jsonclick ;
   private String edtavResumenfacturacion_sdt__pre_medio_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV42FacFchfrom ;
   private java.util.Date wcpOAV43FacFchto ;
   private java.util.Date AV42FacFchfrom ;
   private java.util.Date AV43FacFchto ;
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
   private boolean bGXsfl_36_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV36 ;
   private boolean gx_refresh_fired ;
   private String AV15ColumnsSelectorXML ;
   private String AV51ResumenFacturacion_SDT_json ;
   private String AV16UserCustomValue ;
   private String AV26TotValue_FacImpTot ;
   private String AV28TotValue_FacImpPP ;
   private String AV30TotValue_FacIVAImp ;
   private String AV32TotValue_FacImpGen ;
   private String AV34TotValue_FacTot ;
   private String AV36TotValue_Kgs_Fra ;
   private String AV57TotValue_Pzs_fra ;
   private String AV50TotValue_Pre_medio ;
   private String AV13ExcelFilename ;
   private String AV14ErrorMessage ;
   private String AV38TotValue_Kgs_otros ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private com.genexus.webpanels.WebSession AV54Websession ;
   private GXBaseCollection<app.facturacion.SdtResumenFacturacion_SDT_Item> AV12ResumenFacturacion_SDT ;
   private GXBaseCollection<app.facturacion.SdtResumenFacturacion_SDT_Item> GXt_objcol_SdtResumenFacturacion_SDT_Item1 ;
   private GXBaseCollection<app.facturacion.SdtResumenFacturacion_SDT_Item> GXv_objcol_SdtResumenFacturacion_SDT_Item2[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV17ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV20DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.facturacion.SdtResumenFacturacion_SDT_Item AV24ResumenFacturacion_SDTItem ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
}

