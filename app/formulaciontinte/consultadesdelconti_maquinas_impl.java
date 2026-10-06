package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultadesdelconti_maquinas_impl extends GXWebComponent
{
   public consultadesdelconti_maquinas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consultadesdelconti_maquinas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadesdelconti_maquinas_impl.class ));
   }

   public consultadesdelconti_maquinas_impl( int remoteHandle ,
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
      cmbavGridactiongroup1 = new HTMLChoice();
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
               AV36EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36EmprCod", AV36EmprCod);
               AV37HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37HreBarCod), 8, 0));
               AV38HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38HreBarReo", GXutil.str( AV38HreBarReo, 1, 0));
               AV39HreBarPar = httpContext.GetPar( "HreBarPar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39HreBarPar", AV39HreBarPar);
               AV40Hremaqcod = httpContext.GetPar( "Hremaqcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Hremaqcod", AV40Hremaqcod);
               AV51EstFecCier = localUtil.parseDateParm( httpContext.GetPar( "EstFecCier")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51EstFecCier", localUtil.format(AV51EstFecCier, "99/99/99"));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV36EmprCod,Integer.valueOf(AV37HreBarCod),Byte.valueOf(AV38HreBarReo),AV39HreBarPar,AV40Hremaqcod,AV51EstFecCier});
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
      nRC_GXsfl_33 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_33"))) ;
      nGXsfl_33_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_33_idx"))) ;
      sGXsfl_33_idx = httpContext.GetPar( "sGXsfl_33_idx") ;
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
      AV36EmprCod = httpContext.GetPar( "EmprCod") ;
      AV37HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
      AV38HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
      AV39HreBarPar = httpContext.GetPar( "HreBarPar") ;
      AV40Hremaqcod = httpContext.GetPar( "Hremaqcod") ;
      AV51EstFecCier = localUtil.parseDateParm( httpContext.GetPar( "EstFecCier")) ;
      AV24TFHreMaqCod = httpContext.GetPar( "TFHreMaqCod") ;
      AV25TFHreMaqCod_Sel = httpContext.GetPar( "TFHreMaqCod_Sel") ;
      AV26TFHreVolPrd = (int)(GXutil.lval( httpContext.GetPar( "TFHreVolPrd"))) ;
      AV27TFHreVolPrd_To = (int)(GXutil.lval( httpContext.GetPar( "TFHreVolPrd_To"))) ;
      AV28TFHreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "TFHreNumCie"))) ;
      AV29TFHreNumCie_To = (byte)(GXutil.lval( httpContext.GetPar( "TFHreNumCie_To"))) ;
      AV30TFHreLinMaq = (short)(GXutil.lval( httpContext.GetPar( "TFHreLinMaq"))) ;
      AV31TFHreLinMaq_To = (short)(GXutil.lval( httpContext.GetPar( "TFHreLinMaq_To"))) ;
      AV65Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV41Receta = (short)(GXutil.lval( httpContext.GetPar( "Receta"))) ;
      AV43PwdGrl = (short)(GXutil.lval( httpContext.GetPar( "PwdGrl"))) ;
      AV42ContVal = (int)(GXutil.lval( httpContext.GetPar( "ContVal"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV36EmprCod, AV37HreBarCod, AV38HreBarReo, AV39HreBarPar, AV40Hremaqcod, AV51EstFecCier, AV24TFHreMaqCod, AV25TFHreMaqCod_Sel, AV26TFHreVolPrd, AV27TFHreVolPrd_To, AV28TFHreNumCie, AV29TFHreNumCie_To, AV30TFHreLinMaq, AV31TFHreLinMaq_To, AV65Pgmname, AV12OrderedBy, AV13OrderedDsc, AV41Receta, AV43PwdGrl, AV42ContVal, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1LP2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Tabla HISREM", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.consultadesdelconti_maquinas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV36EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV37HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV38HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV39HreBarPar)),GXutil.URLEncode(GXutil.rtrim(AV40Hremaqcod)),GXutil.URLEncode(GXutil.formatDateParm(AV51EstFecCier))}, new String[] {"EmprCod","HreBarCod","HreBarReo","HreBarPar","Hremaqcod","EstFecCier"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV65Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECETA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV41Receta), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPWDGRL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV43PwdGrl), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV42ContVal), "ZZZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_33", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_33, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV32DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV32DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV36EmprCod", GXutil.rtrim( wcpOAV36EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV37HreBarCod", GXutil.ltrim( localUtil.ntoc( wcpOAV37HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV38HreBarReo", GXutil.ltrim( localUtil.ntoc( wcpOAV38HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV39HreBarPar", GXutil.rtrim( wcpOAV39HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV40Hremaqcod", GXutil.rtrim( wcpOAV40Hremaqcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV51EstFecCier", localUtil.dtoc( wcpOAV51EstFecCier, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREMAQCOD", GXutil.rtrim( AV24TFHreMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREMAQCOD_SEL", GXutil.rtrim( AV25TFHreMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREVOLPRD", GXutil.ltrim( localUtil.ntoc( AV26TFHreVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREVOLPRD_TO", GXutil.ltrim( localUtil.ntoc( AV27TFHreVolPrd_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRENUMCIE", GXutil.ltrim( localUtil.ntoc( AV28TFHreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRENUMCIE_TO", GXutil.ltrim( localUtil.ntoc( AV29TFHreNumCie_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRELINMAQ", GXutil.ltrim( localUtil.ntoc( AV30TFHreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRELINMAQ_TO", GXutil.ltrim( localUtil.ntoc( AV31TFHreLinMaq_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV65Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV65Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV36EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARCOD", GXutil.ltrim( localUtil.ntoc( AV37HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARREO", GXutil.ltrim( localUtil.ntoc( AV38HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARPAR", GXutil.rtrim( AV39HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREMAQCOD", GXutil.rtrim( AV40Hremaqcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vESTFECCIER", localUtil.dtoc( AV51EstFecCier, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECETA", GXutil.ltrim( localUtil.ntoc( AV41Receta, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECETA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV41Receta), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPWDGRL", GXutil.ltrim( localUtil.ntoc( AV43PwdGrl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPWDGRL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV43PwdGrl), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONTVAL", GXutil.ltrim( localUtil.ntoc( AV42ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV42ContVal), "ZZZZZZZ9")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
   }

   public void renderHtmlCloseForm1LP2( )
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
         if ( ! ( WebComp_Grid_dwc == null ) )
         {
            WebComp_Grid_dwc.componentjscripts();
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
      return "FormulacionTinte.ConsultadesdeLconti_Maquinas" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Tabla HISREM", "") ;
   }

   public void wb1LP0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.formulaciontinte.consultadesdelconti_maquinas");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-8", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs hidden-sm hidden-md hidden-lg WWFiltersCell", "left", "top", "", "", "div");
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
         wb_table1_14_1LP2( true) ;
      }
      else
      {
         wb_table1_14_1LP2( false) ;
      }
      return  ;
   }

   public void wb_table1_14_1LP2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-11", "left", "top", "", "", "div");
         wb_table2_27_1LP2( true) ;
      }
      else
      {
         wb_table2_27_1LP2( false) ;
      }
      return  ;
   }

   public void wb_table2_27_1LP2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV32DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 33 )
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

   public void start1LP2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Tabla HISREM", ""), (short)(0)) ;
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
            strup1LP0( ) ;
         }
      }
   }

   public void ws1LP2( )
   {
      start1LP2( ) ;
      evt1LP2( ) ;
   }

   public void evt1LP2( )
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
                              strup1LP0( ) ;
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
                              strup1LP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111LP2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1LP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1LP0( ) ;
                           }
                           AV57Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod = AV24TFHreMaqCod ;
                           AV58Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel = AV25TFHreMaqCod_Sel ;
                           AV59Formulaciontinte_consultadesdelconti_maquinasds_3_tfhrevolprd = AV26TFHreVolPrd ;
                           AV60Formulaciontinte_consultadesdelconti_maquinasds_4_tfhrevolprd_to = AV27TFHreVolPrd_To ;
                           AV61Formulaciontinte_consultadesdelconti_maquinasds_5_tfhrenumcie = AV28TFHreNumCie ;
                           AV62Formulaciontinte_consultadesdelconti_maquinasds_6_tfhrenumcie_to = AV29TFHreNumCie_To ;
                           AV63Formulaciontinte_consultadesdelconti_maquinasds_7_tfhrelinmaq = AV30TFHreLinMaq ;
                           AV64Formulaciontinte_consultadesdelconti_maquinasds_8_tfhrelinmaq_to = AV31TFHreLinMaq_To ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "'DORECETACOSTES'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 19), "'DORECETAHISTORICO'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1LP0( ) ;
                           }
                           nGXsfl_33_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_332( ) ;
                           cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                           cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                           AV50GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50GridActionGroup1), 4, 0));
                           AV48DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV48DetailWebComponent);
                           A4546HreMaqCod = httpContext.cgiGet( edtHreMaqCod_Internalname) ;
                           n4546HreMaqCod = false ;
                           A4547HreVolPrd = (int)(localUtil.ctol( httpContext.cgiGet( edtHreVolPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n4547HreVolPrd = false ;
                           A4495HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreNumCie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4545HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtHreLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4492HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHreBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4493HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4494HreBarPar = httpContext.cgiGet( edtHreBarPar_Internalname) ;
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
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e121LP2 ();
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
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e131LP2 ();
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
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e141LP2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONGROUP1.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e151LP2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "'DORECETACOSTES'") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: 'DoRecetaCostes' */
                                       e161LP2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "'DORECETAHISTORICO'") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: 'DoRecetaHistorico' */
                                       e171LP2 ();
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
                                    strup1LP0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
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
                     if ( nCmpId == 45 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( sPrefix+"W0045") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess(sPrefix+"W0045", "", sEvt);
                        }
                        WebComp_Grid_dwc_Component = OldGrid_dwc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1LP2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1LP2( ) ;
         }
      }
   }

   public void pa1LP2( )
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
      subsflControlProps_332( ) ;
      while ( nGXsfl_33_idx <= nRC_GXsfl_33 )
      {
         sendrow_332( ) ;
         nGXsfl_33_idx = ((subGrid_Islastpage==1)&&(nGXsfl_33_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_33_idx+1) ;
         sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_332( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV36EmprCod ,
                                 int AV37HreBarCod ,
                                 byte AV38HreBarReo ,
                                 String AV39HreBarPar ,
                                 String AV40Hremaqcod ,
                                 java.util.Date AV51EstFecCier ,
                                 String AV24TFHreMaqCod ,
                                 String AV25TFHreMaqCod_Sel ,
                                 int AV26TFHreVolPrd ,
                                 int AV27TFHreVolPrd_To ,
                                 byte AV28TFHreNumCie ,
                                 byte AV29TFHreNumCie_To ,
                                 short AV30TFHreLinMaq ,
                                 short AV31TFHreLinMaq_To ,
                                 String AV65Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 short AV41Receta ,
                                 short AV43PwdGrl ,
                                 int AV42ContVal ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e131LP2 ();
      GRID_nCurrentRecord = 0 ;
      rf1LP2( ) ;
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
      rf1LP2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV65Pgmname = "FormulacionTinte.ConsultadesdeLconti_Maquinas" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_33_Refreshing);
   }

   public void rf1LP2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(33) ;
      /* Execute user event: Refresh */
      e131LP2 ();
      nGXsfl_33_idx = 1 ;
      sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_332( ) ;
      bGXsfl_33_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
            {
               WebComp_Grid_dwc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_332( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV58Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel ,
                                              AV57Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod ,
                                              Integer.valueOf(AV59Formulaciontinte_consultadesdelconti_maquinasds_3_tfhrevolprd) ,
                                              Integer.valueOf(AV60Formulaciontinte_consultadesdelconti_maquinasds_4_tfhrevolprd_to) ,
                                              Byte.valueOf(AV61Formulaciontinte_consultadesdelconti_maquinasds_5_tfhrenumcie) ,
                                              Byte.valueOf(AV62Formulaciontinte_consultadesdelconti_maquinasds_6_tfhrenumcie_to) ,
                                              Short.valueOf(AV63Formulaciontinte_consultadesdelconti_maquinasds_7_tfhrelinmaq) ,
                                              Short.valueOf(AV64Formulaciontinte_consultadesdelconti_maquinasds_8_tfhrelinmaq_to) ,
                                              A4546HreMaqCod ,
                                              Integer.valueOf(A4547HreVolPrd) ,
                                              Byte.valueOf(A4495HreNumCie) ,
                                              Short.valueOf(A4545HreLinMaq) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV40Hremaqcod ,
                                              A4529HreFecTin ,
                                              AV51EstFecCier ,
                                              AV36EmprCod ,
                                              Integer.valueOf(AV37HreBarCod) ,
                                              Byte.valueOf(AV38HreBarReo) ,
                                              AV39HreBarPar ,
                                              A396EmprCod ,
                                              Integer.valueOf(A4492HreBarCod) ,
                                              Byte.valueOf(A4493HreBarReo) ,
                                              A4494HreBarPar } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV57Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod = GXutil.padr( GXutil.rtrim( AV57Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod), 6, "%") ;
         /* Using cursor H01LP2 */
         pr_default.execute(0, new Object[] {AV36EmprCod, Integer.valueOf(AV37HreBarCod), Byte.valueOf(AV38HreBarReo), AV39HreBarPar, AV40Hremaqcod, AV51EstFecCier, lV57Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod, AV58Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel, Integer.valueOf(AV59Formulaciontinte_consultadesdelconti_maquinasds_3_tfhrevolprd), Integer.valueOf(AV60Formulaciontinte_consultadesdelconti_maquinasds_4_tfhrevolprd_to), Byte.valueOf(AV61Formulaciontinte_consultadesdelconti_maquinasds_5_tfhrenumcie), Byte.valueOf(AV62Formulaciontinte_consultadesdelconti_maquinasds_6_tfhrenumcie_to), Short.valueOf(AV63Formulaciontinte_consultadesdelconti_maquinasds_7_tfhrelinmaq), Short.valueOf(AV64Formulaciontinte_consultadesdelconti_maquinasds_8_tfhrelinmaq_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_33_idx = 1 ;
         sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_332( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A4529HreFecTin = H01LP2_A4529HreFecTin[0] ;
            n4529HreFecTin = H01LP2_n4529HreFecTin[0] ;
            A396EmprCod = H01LP2_A396EmprCod[0] ;
            A4494HreBarPar = H01LP2_A4494HreBarPar[0] ;
            A4493HreBarReo = H01LP2_A4493HreBarReo[0] ;
            A4492HreBarCod = H01LP2_A4492HreBarCod[0] ;
            A4545HreLinMaq = H01LP2_A4545HreLinMaq[0] ;
            A4495HreNumCie = H01LP2_A4495HreNumCie[0] ;
            A4547HreVolPrd = H01LP2_A4547HreVolPrd[0] ;
            n4547HreVolPrd = H01LP2_n4547HreVolPrd[0] ;
            A4546HreMaqCod = H01LP2_A4546HreMaqCod[0] ;
            n4546HreMaqCod = H01LP2_n4546HreMaqCod[0] ;
            A4529HreFecTin = H01LP2_A4529HreFecTin[0] ;
            n4529HreFecTin = H01LP2_n4529HreFecTin[0] ;
            e141LP2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(33) ;
         wb1LP0( ) ;
      }
      bGXsfl_33_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1LP2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV65Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV65Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECETA", GXutil.ltrim( localUtil.ntoc( AV41Receta, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECETA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV41Receta), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPWDGRL", GXutil.ltrim( localUtil.ntoc( AV43PwdGrl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPWDGRL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV43PwdGrl), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONTVAL", GXutil.ltrim( localUtil.ntoc( AV42ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV42ContVal), "ZZZZZZZ9")));
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
      AV57Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod = AV24TFHreMaqCod ;
      AV58Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel = AV25TFHreMaqCod_Sel ;
      AV59Formulaciontinte_consultadesdelconti_maquinasds_3_tfhrevolprd = AV26TFHreVolPrd ;
      AV60Formulaciontinte_consultadesdelconti_maquinasds_4_tfhrevolprd_to = AV27TFHreVolPrd_To ;
      AV61Formulaciontinte_consultadesdelconti_maquinasds_5_tfhrenumcie = AV28TFHreNumCie ;
      AV62Formulaciontinte_consultadesdelconti_maquinasds_6_tfhrenumcie_to = AV29TFHreNumCie_To ;
      AV63Formulaciontinte_consultadesdelconti_maquinasds_7_tfhrelinmaq = AV30TFHreLinMaq ;
      AV64Formulaciontinte_consultadesdelconti_maquinasds_8_tfhrelinmaq_to = AV31TFHreLinMaq_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV58Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel ,
                                           AV57Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod ,
                                           Integer.valueOf(AV59Formulaciontinte_consultadesdelconti_maquinasds_3_tfhrevolprd) ,
                                           Integer.valueOf(AV60Formulaciontinte_consultadesdelconti_maquinasds_4_tfhrevolprd_to) ,
                                           Byte.valueOf(AV61Formulaciontinte_consultadesdelconti_maquinasds_5_tfhrenumcie) ,
                                           Byte.valueOf(AV62Formulaciontinte_consultadesdelconti_maquinasds_6_tfhrenumcie_to) ,
                                           Short.valueOf(AV63Formulaciontinte_consultadesdelconti_maquinasds_7_tfhrelinmaq) ,
                                           Short.valueOf(AV64Formulaciontinte_consultadesdelconti_maquinasds_8_tfhrelinmaq_to) ,
                                           A4546HreMaqCod ,
                                           Integer.valueOf(A4547HreVolPrd) ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV40Hremaqcod ,
                                           A4529HreFecTin ,
                                           AV51EstFecCier ,
                                           AV36EmprCod ,
                                           Integer.valueOf(AV37HreBarCod) ,
                                           Byte.valueOf(AV38HreBarReo) ,
                                           AV39HreBarPar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV57Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod = GXutil.padr( GXutil.rtrim( AV57Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod), 6, "%") ;
      /* Using cursor H01LP3 */
      pr_default.execute(1, new Object[] {AV36EmprCod, Integer.valueOf(AV37HreBarCod), Byte.valueOf(AV38HreBarReo), AV39HreBarPar, AV40Hremaqcod, AV51EstFecCier, lV57Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod, AV58Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel, Integer.valueOf(AV59Formulaciontinte_consultadesdelconti_maquinasds_3_tfhrevolprd), Integer.valueOf(AV60Formulaciontinte_consultadesdelconti_maquinasds_4_tfhrevolprd_to), Byte.valueOf(AV61Formulaciontinte_consultadesdelconti_maquinasds_5_tfhrenumcie), Byte.valueOf(AV62Formulaciontinte_consultadesdelconti_maquinasds_6_tfhrenumcie_to), Short.valueOf(AV63Formulaciontinte_consultadesdelconti_maquinasds_7_tfhrelinmaq), Short.valueOf(AV64Formulaciontinte_consultadesdelconti_maquinasds_8_tfhrelinmaq_to)});
      GRID_nRecordCount = H01LP3_AGRID_nRecordCount[0] ;
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
      AV57Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod = AV24TFHreMaqCod ;
      AV58Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel = AV25TFHreMaqCod_Sel ;
      AV59Formulaciontinte_consultadesdelconti_maquinasds_3_tfhrevolprd = AV26TFHreVolPrd ;
      AV60Formulaciontinte_consultadesdelconti_maquinasds_4_tfhrevolprd_to = AV27TFHreVolPrd_To ;
      AV61Formulaciontinte_consultadesdelconti_maquinasds_5_tfhrenumcie = AV28TFHreNumCie ;
      AV62Formulaciontinte_consultadesdelconti_maquinasds_6_tfhrenumcie_to = AV29TFHreNumCie_To ;
      AV63Formulaciontinte_consultadesdelconti_maquinasds_7_tfhrelinmaq = AV30TFHreLinMaq ;
      AV64Formulaciontinte_consultadesdelconti_maquinasds_8_tfhrelinmaq_to = AV31TFHreLinMaq_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV36EmprCod, AV37HreBarCod, AV38HreBarReo, AV39HreBarPar, AV40Hremaqcod, AV51EstFecCier, AV24TFHreMaqCod, AV25TFHreMaqCod_Sel, AV26TFHreVolPrd, AV27TFHreVolPrd_To, AV28TFHreNumCie, AV29TFHreNumCie_To, AV30TFHreLinMaq, AV31TFHreLinMaq_To, AV65Pgmname, AV12OrderedBy, AV13OrderedDsc, AV41Receta, AV43PwdGrl, AV42ContVal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV57Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod = AV24TFHreMaqCod ;
      AV58Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel = AV25TFHreMaqCod_Sel ;
      AV59Formulaciontinte_consultadesdelconti_maquinasds_3_tfhrevolprd = AV26TFHreVolPrd ;
      AV60Formulaciontinte_consultadesdelconti_maquinasds_4_tfhrevolprd_to = AV27TFHreVolPrd_To ;
      AV61Formulaciontinte_consultadesdelconti_maquinasds_5_tfhrenumcie = AV28TFHreNumCie ;
      AV62Formulaciontinte_consultadesdelconti_maquinasds_6_tfhrenumcie_to = AV29TFHreNumCie_To ;
      AV63Formulaciontinte_consultadesdelconti_maquinasds_7_tfhrelinmaq = AV30TFHreLinMaq ;
      AV64Formulaciontinte_consultadesdelconti_maquinasds_8_tfhrelinmaq_to = AV31TFHreLinMaq_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV36EmprCod, AV37HreBarCod, AV38HreBarReo, AV39HreBarPar, AV40Hremaqcod, AV51EstFecCier, AV24TFHreMaqCod, AV25TFHreMaqCod_Sel, AV26TFHreVolPrd, AV27TFHreVolPrd_To, AV28TFHreNumCie, AV29TFHreNumCie_To, AV30TFHreLinMaq, AV31TFHreLinMaq_To, AV65Pgmname, AV12OrderedBy, AV13OrderedDsc, AV41Receta, AV43PwdGrl, AV42ContVal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV57Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod = AV24TFHreMaqCod ;
      AV58Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel = AV25TFHreMaqCod_Sel ;
      AV59Formulaciontinte_consultadesdelconti_maquinasds_3_tfhrevolprd = AV26TFHreVolPrd ;
      AV60Formulaciontinte_consultadesdelconti_maquinasds_4_tfhrevolprd_to = AV27TFHreVolPrd_To ;
      AV61Formulaciontinte_consultadesdelconti_maquinasds_5_tfhrenumcie = AV28TFHreNumCie ;
      AV62Formulaciontinte_consultadesdelconti_maquinasds_6_tfhrenumcie_to = AV29TFHreNumCie_To ;
      AV63Formulaciontinte_consultadesdelconti_maquinasds_7_tfhrelinmaq = AV30TFHreLinMaq ;
      AV64Formulaciontinte_consultadesdelconti_maquinasds_8_tfhrelinmaq_to = AV31TFHreLinMaq_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV36EmprCod, AV37HreBarCod, AV38HreBarReo, AV39HreBarPar, AV40Hremaqcod, AV51EstFecCier, AV24TFHreMaqCod, AV25TFHreMaqCod_Sel, AV26TFHreVolPrd, AV27TFHreVolPrd_To, AV28TFHreNumCie, AV29TFHreNumCie_To, AV30TFHreLinMaq, AV31TFHreLinMaq_To, AV65Pgmname, AV12OrderedBy, AV13OrderedDsc, AV41Receta, AV43PwdGrl, AV42ContVal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV57Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod = AV24TFHreMaqCod ;
      AV58Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel = AV25TFHreMaqCod_Sel ;
      AV59Formulaciontinte_consultadesdelconti_maquinasds_3_tfhrevolprd = AV26TFHreVolPrd ;
      AV60Formulaciontinte_consultadesdelconti_maquinasds_4_tfhrevolprd_to = AV27TFHreVolPrd_To ;
      AV61Formulaciontinte_consultadesdelconti_maquinasds_5_tfhrenumcie = AV28TFHreNumCie ;
      AV62Formulaciontinte_consultadesdelconti_maquinasds_6_tfhrenumcie_to = AV29TFHreNumCie_To ;
      AV63Formulaciontinte_consultadesdelconti_maquinasds_7_tfhrelinmaq = AV30TFHreLinMaq ;
      AV64Formulaciontinte_consultadesdelconti_maquinasds_8_tfhrelinmaq_to = AV31TFHreLinMaq_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV36EmprCod, AV37HreBarCod, AV38HreBarReo, AV39HreBarPar, AV40Hremaqcod, AV51EstFecCier, AV24TFHreMaqCod, AV25TFHreMaqCod_Sel, AV26TFHreVolPrd, AV27TFHreVolPrd_To, AV28TFHreNumCie, AV29TFHreNumCie_To, AV30TFHreLinMaq, AV31TFHreLinMaq_To, AV65Pgmname, AV12OrderedBy, AV13OrderedDsc, AV41Receta, AV43PwdGrl, AV42ContVal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV57Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod = AV24TFHreMaqCod ;
      AV58Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel = AV25TFHreMaqCod_Sel ;
      AV59Formulaciontinte_consultadesdelconti_maquinasds_3_tfhrevolprd = AV26TFHreVolPrd ;
      AV60Formulaciontinte_consultadesdelconti_maquinasds_4_tfhrevolprd_to = AV27TFHreVolPrd_To ;
      AV61Formulaciontinte_consultadesdelconti_maquinasds_5_tfhrenumcie = AV28TFHreNumCie ;
      AV62Formulaciontinte_consultadesdelconti_maquinasds_6_tfhrenumcie_to = AV29TFHreNumCie_To ;
      AV63Formulaciontinte_consultadesdelconti_maquinasds_7_tfhrelinmaq = AV30TFHreLinMaq ;
      AV64Formulaciontinte_consultadesdelconti_maquinasds_8_tfhrelinmaq_to = AV31TFHreLinMaq_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV36EmprCod, AV37HreBarCod, AV38HreBarReo, AV39HreBarPar, AV40Hremaqcod, AV51EstFecCier, AV24TFHreMaqCod, AV25TFHreMaqCod_Sel, AV26TFHreVolPrd, AV27TFHreVolPrd_To, AV28TFHreNumCie, AV29TFHreNumCie_To, AV30TFHreLinMaq, AV31TFHreLinMaq_To, AV65Pgmname, AV12OrderedBy, AV13OrderedDsc, AV41Receta, AV43PwdGrl, AV42ContVal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV65Pgmname = "FormulacionTinte.ConsultadesdeLconti_Maquinas" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup1LP0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e121LP2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV32DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_33 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_33"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV36EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV36EmprCod") ;
         wcpOAV37HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV37HreBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV38HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV38HreBarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV39HreBarPar = httpContext.cgiGet( sPrefix+"wcpOAV39HreBarPar") ;
         wcpOAV40Hremaqcod = httpContext.cgiGet( sPrefix+"wcpOAV40Hremaqcod") ;
         wcpOAV51EstFecCier = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV51EstFecCier"), 0) ;
         A396EmprCod = httpContext.cgiGet( sPrefix+"EMPRCOD") ;
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
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         /* Read variables values. */
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
      e121LP2 ();
      if (returnInSub) return;
   }

   public void e121LP2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = (byte)(AV41Receta) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV36EmprCod, httpContext.getMessage( "HRRECE", ""), GXv_int2) ;
      consultadesdelconti_maquinas_impl.this.GXt_int1 = GXv_int2[0] ;
      AV41Receta = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Receta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Receta), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECETA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV41Receta), "ZZZ9")));
      GXt_int3 = AV42ContVal ;
      GXv_int4[0] = GXt_int3 ;
      new app.pbuscon(remoteHandle, context).execute( AV36EmprCod, httpContext.getMessage( "PWDHHR", ""), GXv_int4) ;
      consultadesdelconti_maquinas_impl.this.GXt_int3 = GXv_int4[0] ;
      AV42ContVal = GXt_int3 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42ContVal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42ContVal), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV42ContVal), "ZZZZZZZ9")));
      GXt_int1 = (byte)(AV43PwdGrl) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV36EmprCod, httpContext.getMessage( "PWDHHR", ""), GXv_int2) ;
      consultadesdelconti_maquinas_impl.this.GXt_int1 = GXv_int2[0] ;
      AV43PwdGrl = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43PwdGrl", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43PwdGrl), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPWDGRL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV43PwdGrl), "ZZZ9")));
      GXt_int1 = (byte)(AV44anahuac) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV36EmprCod, httpContext.getMessage( "ANAHUA", ""), GXv_int2) ;
      consultadesdelconti_maquinas_impl.this.GXt_int1 = GXv_int2[0] ;
      AV44anahuac = GXt_int1 ;
      GXt_char5 = AV52Station ;
      GXv_char6[0] = GXt_char5 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char6) ;
      consultadesdelconti_maquinas_impl.this.GXt_char5 = GXv_char6[0] ;
      AV52Station = GXt_char5 ;
      GXv_char6[0] = AV36EmprCod ;
      GXv_char7[0] = AV53EmprNom ;
      GXv_char8[0] = AV54UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV52Station, GXv_char6, GXv_char7, GXv_char8) ;
      consultadesdelconti_maquinas_impl.this.AV36EmprCod = GXv_char6[0] ;
      consultadesdelconti_maquinas_impl.this.AV53EmprNom = GXv_char7[0] ;
      consultadesdelconti_maquinas_impl.this.AV54UsurCod = GXv_char8[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36EmprCod", AV36EmprCod);
      divCell_grid_dwc_Class = "Invisible WCD_"+GXutil.upper( subGrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divCell_grid_dwc_Internalname, "Class", divCell_grid_dwc_Class, true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = AV32DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] ;
      AV32DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
   }

   public void e131LP2( )
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
      S142 ();
      if (returnInSub) return;
      AV57Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod = AV24TFHreMaqCod ;
      AV58Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel = AV25TFHreMaqCod_Sel ;
      AV59Formulaciontinte_consultadesdelconti_maquinasds_3_tfhrevolprd = AV26TFHreVolPrd ;
      AV60Formulaciontinte_consultadesdelconti_maquinasds_4_tfhrevolprd_to = AV27TFHreVolPrd_To ;
      AV61Formulaciontinte_consultadesdelconti_maquinasds_5_tfhrenumcie = AV28TFHreNumCie ;
      AV62Formulaciontinte_consultadesdelconti_maquinasds_6_tfhrenumcie_to = AV29TFHreNumCie_To ;
      AV63Formulaciontinte_consultadesdelconti_maquinasds_7_tfhrelinmaq = AV30TFHreLinMaq ;
      AV64Formulaciontinte_consultadesdelconti_maquinasds_8_tfhrelinmaq_to = AV31TFHreLinMaq_To ;
   }

   public void e111LP2( )
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
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreMaqCod") == 0 )
         {
            AV24TFHreMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFHreMaqCod", AV24TFHreMaqCod);
            AV25TFHreMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFHreMaqCod_Sel", AV25TFHreMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreVolPrd") == 0 )
         {
            AV26TFHreVolPrd = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFHreVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFHreVolPrd), 5, 0));
            AV27TFHreVolPrd_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFHreVolPrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFHreVolPrd_To), 5, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreNumCie") == 0 )
         {
            AV28TFHreNumCie = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFHreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFHreNumCie), 2, 0));
            AV29TFHreNumCie_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFHreNumCie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFHreNumCie_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreLinMaq") == 0 )
         {
            AV30TFHreLinMaq = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFHreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFHreLinMaq), 4, 0));
            AV31TFHreLinMaq_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFHreLinMaq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFHreLinMaq_To), 4, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e141LP2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactiongroup1.removeAllItems();
      cmbavGridactiongroup1.addItem("0", ";fas fa-bars", (short)(0));
      cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Agrupadas", ""), "far fa-object-ungroup", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactiongroup1.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Receta Costes (PDF)", ""), "far fa-file-alt", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactiongroup1.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Receta Historico (PDF)", ""), "far fa-file-alt", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactiongroup1.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Receta con Normas (PDF)", ""), "far fa-file-alt", "", "", "", "", "", "", ""), (short)(0));
      AV48DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV48DetailWebComponent);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(33) ;
      }
      sendrow_332( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_33_Refreshing )
      {
         httpContext.doAjaxLoad(33, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV50GridActionGroup1, 4, 0)) );
   }

   public void e151LP2( )
   {
      /* Gridactiongroup1_Click Routine */
      returnInSub = false ;
      if ( AV50GridActionGroup1 == 1 )
      {
         /* Execute user subroutine: 'DO AGRUPADAS' */
         S152 ();
         if (returnInSub) return;
      }
      else if ( AV50GridActionGroup1 == 2 )
      {
         /* Execute user subroutine: 'DO RECETACOSTES' */
         S162 ();
         if (returnInSub) return;
      }
      else if ( AV50GridActionGroup1 == 3 )
      {
         /* Execute user subroutine: 'DO RECETAHISTORICO' */
         S172 ();
         if (returnInSub) return;
      }
      else if ( AV50GridActionGroup1 == 4 )
      {
         /* Execute user subroutine: 'DO RECETACONNORMAS' */
         S182 ();
         if (returnInSub) return;
      }
      AV50GridActionGroup1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50GridActionGroup1), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV50GridActionGroup1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), true);
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'DO AGRUPADAS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.consultahisrag_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4492HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A4493HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A4494HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(A4495HreNumCie,2,0))}, new String[] {"EmprCod","HreBarCod","HreBarReo","HreBarPar","HreNumCie"}) , new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S162( )
   {
      /* 'DO RECETACOSTES' Routine */
      returnInSub = false ;
      if ( AV41Receta == 1 )
      {
         httpContext.popup(formatLink("app.rhrhr021", new String[] {GXutil.URLEncode(GXutil.rtrim(AV36EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4492HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A4493HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A4494HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(A4495HreNumCie,2,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","HRENUMCIE","Output"}) , new Object[] {"AV36EmprCod","A4492HreBarCod","A4493HreBarReo","A4494HreBarPar","A4495HreNumCie",""});
      }
      else
      {
         httpContext.popup(formatLink("app.rhrhr02", new String[] {GXutil.URLEncode(GXutil.rtrim(AV36EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4492HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A4493HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A4494HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(A4495HreNumCie,2,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","HRENUMCIE","Output"}) , new Object[] {"AV36EmprCod","A4492HreBarCod","A4493HreBarReo","A4494HreBarPar","A4495HreNumCie",""});
      }
   }

   public void S172( )
   {
      /* 'DO RECETAHISTORICO' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.prctinhistorico", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4492HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A4493HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A4494HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(A4495HreNumCie,2,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","HreBarCod","HreBarReo","HreBarPar","HreNumCie","Output"}) , new Object[] {"A396EmprCod","A4492HreBarCod","A4493HreBarReo","A4494HreBarPar","A4495HreNumCie",""});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S182( )
   {
      /* 'DO RECETACONNORMAS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.prctccporhdr", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4492HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A4493HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A4494HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(A4545HreLinMaq,4,0)),GXutil.URLEncode(GXutil.ltrimstr(A4495HreNumCie,2,0))}, new String[] {"EmprCod","Barcod","Barcodreo","Barcodpar","Reclinmaq","HreNumCie"}) , new Object[] {"A396EmprCod","A4492HreBarCod","A4493HreBarReo","A4494HreBarPar","A4545HreLinMaq","A4495HreNumCie"});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue(AV65Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV65Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV20Session.getValue(AV65Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV66GXV1 = 1 ;
      while ( AV66GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV66GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREMAQCOD") == 0 )
         {
            AV24TFHreMaqCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFHreMaqCod", AV24TFHreMaqCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREMAQCOD_SEL") == 0 )
         {
            AV25TFHreMaqCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFHreMaqCod_Sel", AV25TFHreMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREVOLPRD") == 0 )
         {
            AV26TFHreVolPrd = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFHreVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFHreVolPrd), 5, 0));
            AV27TFHreVolPrd_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFHreVolPrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFHreVolPrd_To), 5, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRENUMCIE") == 0 )
         {
            AV28TFHreNumCie = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFHreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFHreNumCie), 2, 0));
            AV29TFHreNumCie_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFHreNumCie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFHreNumCie_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELINMAQ") == 0 )
         {
            AV30TFHreLinMaq = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFHreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFHreLinMaq), 4, 0));
            AV31TFHreLinMaq_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFHreLinMaq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFHreLinMaq_To), 4, 0));
         }
         AV66GXV1 = (int)(AV66GXV1+1) ;
      }
      GXt_char5 = "" ;
      GXv_char8[0] = GXt_char5 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV25TFHreMaqCod_Sel)==0), AV25TFHreMaqCod_Sel, GXv_char8) ;
      consultadesdelconti_maquinas_impl.this.GXt_char5 = GXv_char8[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char5+"|||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char5 = "" ;
      GXv_char8[0] = GXt_char5 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV24TFHreMaqCod)==0), AV24TFHreMaqCod, GXv_char8) ;
      consultadesdelconti_maquinas_impl.this.GXt_char5 = GXv_char8[0] ;
      Ddo_grid_Filteredtext_set = GXt_char5+"|"+((0==AV26TFHreVolPrd) ? "" : GXutil.str( AV26TFHreVolPrd, 5, 0))+"|"+((0==AV28TFHreNumCie) ? "" : GXutil.str( AV28TFHreNumCie, 2, 0))+"|"+((0==AV30TFHreLinMaq) ? "" : GXutil.str( AV30TFHreLinMaq, 4, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV27TFHreVolPrd_To) ? "" : GXutil.str( AV27TFHreVolPrd_To, 5, 0))+"|"+((0==AV29TFHreNumCie_To) ? "" : GXutil.str( AV29TFHreNumCie_To, 2, 0))+"|"+((0==AV31TFHreLinMaq_To) ? "" : GXutil.str( AV31TFHreLinMaq_To, 4, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV20Session.getValue(AV65Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFHREMAQCOD", "", !(GXutil.strcmp("", AV24TFHreMaqCod)==0), (short)(0), AV24TFHreMaqCod, "", !(GXutil.strcmp("", AV25TFHreMaqCod_Sel)==0), AV25TFHreMaqCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFHREVOLPRD", "", !((0==AV26TFHreVolPrd)&&(0==AV27TFHreVolPrd_To)), (short)(0), GXutil.trim( GXutil.str( AV26TFHreVolPrd, 5, 0)), GXutil.trim( GXutil.str( AV27TFHreVolPrd_To, 5, 0))) ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFHRENUMCIE", "", !((0==AV28TFHreNumCie)&&(0==AV29TFHreNumCie_To)), (short)(0), GXutil.trim( GXutil.str( AV28TFHreNumCie, 2, 0)), GXutil.trim( GXutil.str( AV29TFHreNumCie_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFHRELINMAQ", "", !((0==AV30TFHreLinMaq)&&(0==AV31TFHreLinMaq_To)), (short)(0), GXutil.trim( GXutil.str( AV30TFHreLinMaq, 4, 0)), GXutil.trim( GXutil.str( AV31TFHreLinMaq_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      if ( ! (GXutil.strcmp("", AV36EmprCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV36EmprCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV37HreBarCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREBARCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV37HreBarCod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV38HreBarReo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREBARREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV38HreBarReo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV39HreBarPar)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREBARPAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV39HreBarPar );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV40Hremaqcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREMAQCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV40Hremaqcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV51EstFecCier)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ESTFECCIER" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV51EstFecCier, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV65Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV65Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "HISREM" );
      AV20Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e161LP2( )
   {
      /* 'DoRecetaCostes' Routine */
      returnInSub = false ;
      if ( AV41Receta == 1 )
      {
         httpContext.popup(formatLink("app.rhrhr021", new String[] {GXutil.URLEncode(GXutil.rtrim(AV36EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4492HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A4493HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A4494HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(A4495HreNumCie,2,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","HRENUMCIE","Output"}) , new Object[] {"AV36EmprCod","A4492HreBarCod","A4493HreBarReo","A4494HreBarPar","A4495HreNumCie",""});
      }
      else
      {
         AV47ClaveConfirmada = true ;
         if ( AV43PwdGrl == 1 )
         {
            AV47ClaveConfirmada = false ;
            AV46WebSession.setValue("ValidarWebWPwdGrl", GXutil.str( AV42ContVal, 8, 0));
            /* Window Datatype Object Property */
            AV45Window.setUrl( formatLink("app.webwpwdgrl", new String[] {GXutil.URLEncode(GXutil.booltostr(AV47ClaveConfirmada))}, new String[] {"PwdBo"})  );
            AV45Window.setReturnParms(new Object[] {"AV47ClaveConfirmada",});
            httpContext.newWindow(AV45Window);
         }
         if ( AV47ClaveConfirmada )
         {
            httpContext.popup(formatLink("app.rhrhr02", new String[] {GXutil.URLEncode(GXutil.rtrim(AV36EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4492HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A4493HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A4494HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(A4495HreNumCie,2,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","HRENUMCIE","Output"}) , new Object[] {"AV36EmprCod","A4492HreBarCod","A4493HreBarReo","A4494HreBarPar","A4495HreNumCie",""});
         }
      }
      /*  Sending Event outputs  */
   }

   public void e171LP2( )
   {
      /* 'DoRecetaHistorico' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.prctinhistorico", new String[] {GXutil.URLEncode(GXutil.rtrim(AV36EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4492HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A4493HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A4494HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(A4495HreNumCie,2,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","HreBarCod","HreBarReo","HreBarPar","HreNumCie","Output"}) , new Object[] {"AV36EmprCod","A4492HreBarCod","A4493HreBarReo","A4494HreBarPar","A4495HreNumCie",""});
      /*  Sending Event outputs  */
   }

   public void wb_table2_27_1LP2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "grid-scroll-horizontal", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='SectionGrid GridNoBorderCell HasGridEmpowerer'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithtotalizers_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol33( ) ;
      }
      if ( wbEnd == 33 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_33 = (int)(nGXsfl_33_idx-1) ;
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
         app.GxWebStd.gx_div_start( httpContext, divCell_grid_dwc_Internalname, 1, 0, "px", 0, "px", divCell_grid_dwc_Class, "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0045"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0045"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_33_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0045"+"");
                  }
                  WebComp_Grid_dwc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
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
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_27_1LP2e( true) ;
      }
      else
      {
         wb_table2_27_1LP2e( false) ;
      }
   }

   public void wb_table1_14_1LP2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTableheader_Internalname, tblTableheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_19_1LP2( true) ;
      }
      else
      {
         wb_table3_19_1LP2( false) ;
      }
      return  ;
   }

   public void wb_table3_19_1LP2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_14_1LP2e( true) ;
      }
      else
      {
         wb_table1_14_1LP2e( false) ;
      }
   }

   public void wb_table3_19_1LP2( boolean wbgen )
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
         wb_table3_19_1LP2e( true) ;
      }
      else
      {
         wb_table3_19_1LP2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV36EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36EmprCod", AV36EmprCod);
      AV37HreBarCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37HreBarCod), 8, 0));
      AV38HreBarReo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38HreBarReo", GXutil.str( AV38HreBarReo, 1, 0));
      AV39HreBarPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39HreBarPar", AV39HreBarPar);
      AV40Hremaqcod = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Hremaqcod", AV40Hremaqcod);
      AV51EstFecCier = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51EstFecCier", localUtil.format(AV51EstFecCier, "99/99/99"));
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
      pa1LP2( ) ;
      ws1LP2( ) ;
      we1LP2( ) ;
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
      sCtrlAV36EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV37HreBarCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV38HreBarReo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV39HreBarPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV40Hremaqcod = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV51EstFecCier = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1LP2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "formulaciontinte\\consultadesdelconti_maquinas", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1LP2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV36EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36EmprCod", AV36EmprCod);
         AV37HreBarCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37HreBarCod), 8, 0));
         AV38HreBarReo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38HreBarReo", GXutil.str( AV38HreBarReo, 1, 0));
         AV39HreBarPar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39HreBarPar", AV39HreBarPar);
         AV40Hremaqcod = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Hremaqcod", AV40Hremaqcod);
         AV51EstFecCier = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51EstFecCier", localUtil.format(AV51EstFecCier, "99/99/99"));
      }
      wcpOAV36EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV36EmprCod") ;
      wcpOAV37HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV37HreBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV38HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV38HreBarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV39HreBarPar = httpContext.cgiGet( sPrefix+"wcpOAV39HreBarPar") ;
      wcpOAV40Hremaqcod = httpContext.cgiGet( sPrefix+"wcpOAV40Hremaqcod") ;
      wcpOAV51EstFecCier = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV51EstFecCier"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV36EmprCod, wcpOAV36EmprCod) != 0 ) || ( AV37HreBarCod != wcpOAV37HreBarCod ) || ( AV38HreBarReo != wcpOAV38HreBarReo ) || ( GXutil.strcmp(AV39HreBarPar, wcpOAV39HreBarPar) != 0 ) || ( GXutil.strcmp(AV40Hremaqcod, wcpOAV40Hremaqcod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV51EstFecCier), GXutil.resetTime(wcpOAV51EstFecCier)) ) ) )
      {
         setjustcreated();
      }
      wcpOAV36EmprCod = AV36EmprCod ;
      wcpOAV37HreBarCod = AV37HreBarCod ;
      wcpOAV38HreBarReo = AV38HreBarReo ;
      wcpOAV39HreBarPar = AV39HreBarPar ;
      wcpOAV40Hremaqcod = AV40Hremaqcod ;
      wcpOAV51EstFecCier = AV51EstFecCier ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV36EmprCod = httpContext.cgiGet( sPrefix+"AV36EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV36EmprCod) > 0 )
      {
         AV36EmprCod = httpContext.cgiGet( sCtrlAV36EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36EmprCod", AV36EmprCod);
      }
      else
      {
         AV36EmprCod = httpContext.cgiGet( sPrefix+"AV36EmprCod_PARM") ;
      }
      sCtrlAV37HreBarCod = httpContext.cgiGet( sPrefix+"AV37HreBarCod_CTRL") ;
      if ( GXutil.len( sCtrlAV37HreBarCod) > 0 )
      {
         AV37HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV37HreBarCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37HreBarCod), 8, 0));
      }
      else
      {
         AV37HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV37HreBarCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV38HreBarReo = httpContext.cgiGet( sPrefix+"AV38HreBarReo_CTRL") ;
      if ( GXutil.len( sCtrlAV38HreBarReo) > 0 )
      {
         AV38HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV38HreBarReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38HreBarReo", GXutil.str( AV38HreBarReo, 1, 0));
      }
      else
      {
         AV38HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV38HreBarReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV39HreBarPar = httpContext.cgiGet( sPrefix+"AV39HreBarPar_CTRL") ;
      if ( GXutil.len( sCtrlAV39HreBarPar) > 0 )
      {
         AV39HreBarPar = httpContext.cgiGet( sCtrlAV39HreBarPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39HreBarPar", AV39HreBarPar);
      }
      else
      {
         AV39HreBarPar = httpContext.cgiGet( sPrefix+"AV39HreBarPar_PARM") ;
      }
      sCtrlAV40Hremaqcod = httpContext.cgiGet( sPrefix+"AV40Hremaqcod_CTRL") ;
      if ( GXutil.len( sCtrlAV40Hremaqcod) > 0 )
      {
         AV40Hremaqcod = httpContext.cgiGet( sCtrlAV40Hremaqcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Hremaqcod", AV40Hremaqcod);
      }
      else
      {
         AV40Hremaqcod = httpContext.cgiGet( sPrefix+"AV40Hremaqcod_PARM") ;
      }
      sCtrlAV51EstFecCier = httpContext.cgiGet( sPrefix+"AV51EstFecCier_CTRL") ;
      if ( GXutil.len( sCtrlAV51EstFecCier) > 0 )
      {
         AV51EstFecCier = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV51EstFecCier), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51EstFecCier", localUtil.format(AV51EstFecCier, "99/99/99"));
      }
      else
      {
         AV51EstFecCier = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV51EstFecCier_PARM"), 0) ;
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
      pa1LP2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1LP2( ) ;
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
      ws1LP2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36EmprCod_PARM", GXutil.rtrim( AV36EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV36EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36EmprCod_CTRL", GXutil.rtrim( sCtrlAV36EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37HreBarCod_PARM", GXutil.ltrim( localUtil.ntoc( AV37HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV37HreBarCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37HreBarCod_CTRL", GXutil.rtrim( sCtrlAV37HreBarCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38HreBarReo_PARM", GXutil.ltrim( localUtil.ntoc( AV38HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV38HreBarReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38HreBarReo_CTRL", GXutil.rtrim( sCtrlAV38HreBarReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39HreBarPar_PARM", GXutil.rtrim( AV39HreBarPar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV39HreBarPar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39HreBarPar_CTRL", GXutil.rtrim( sCtrlAV39HreBarPar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40Hremaqcod_PARM", GXutil.rtrim( AV40Hremaqcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV40Hremaqcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40Hremaqcod_CTRL", GXutil.rtrim( sCtrlAV40Hremaqcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51EstFecCier_PARM", localUtil.dtoc( AV51EstFecCier, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV51EstFecCier)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51EstFecCier_CTRL", GXutil.rtrim( sCtrlAV51EstFecCier));
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
      we1LP2( ) ;
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
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         WebComp_Grid_dwc.componentjscripts();
      }
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
         {
            WebComp_Grid_dwc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211556573", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/consultadesdelconti_maquinas.js", "?20268211556574", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_332( )
   {
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1_"+sGXsfl_33_idx );
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_33_idx ;
      edtHreMaqCod_Internalname = sPrefix+"HREMAQCOD_"+sGXsfl_33_idx ;
      edtHreVolPrd_Internalname = sPrefix+"HREVOLPRD_"+sGXsfl_33_idx ;
      edtHreNumCie_Internalname = sPrefix+"HRENUMCIE_"+sGXsfl_33_idx ;
      edtHreLinMaq_Internalname = sPrefix+"HRELINMAQ_"+sGXsfl_33_idx ;
      edtHreBarCod_Internalname = sPrefix+"HREBARCOD_"+sGXsfl_33_idx ;
      edtHreBarReo_Internalname = sPrefix+"HREBARREO_"+sGXsfl_33_idx ;
      edtHreBarPar_Internalname = sPrefix+"HREBARPAR_"+sGXsfl_33_idx ;
   }

   public void subsflControlProps_fel_332( )
   {
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1_"+sGXsfl_33_fel_idx );
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_33_fel_idx ;
      edtHreMaqCod_Internalname = sPrefix+"HREMAQCOD_"+sGXsfl_33_fel_idx ;
      edtHreVolPrd_Internalname = sPrefix+"HREVOLPRD_"+sGXsfl_33_fel_idx ;
      edtHreNumCie_Internalname = sPrefix+"HRENUMCIE_"+sGXsfl_33_fel_idx ;
      edtHreLinMaq_Internalname = sPrefix+"HRELINMAQ_"+sGXsfl_33_fel_idx ;
      edtHreBarCod_Internalname = sPrefix+"HREBARCOD_"+sGXsfl_33_fel_idx ;
      edtHreBarReo_Internalname = sPrefix+"HREBARREO_"+sGXsfl_33_fel_idx ;
      edtHreBarPar_Internalname = sPrefix+"HREBARPAR_"+sGXsfl_33_fel_idx ;
   }

   public void sendrow_332( )
   {
      subsflControlProps_332( ) ;
      wb1LP0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_33_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_33_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_33_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 34,'"+sPrefix+"',false,'"+sGXsfl_33_idx+"',33)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_33_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               AV50GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV50GridActionGroup1, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50GridActionGroup1), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV50GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVGRIDACTIONGROUP1.CLICK."+sGXsfl_33_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,34);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV50GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_33_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 35,'"+sPrefix+"',false,'"+sGXsfl_33_idx+"',33)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV48DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,35);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+"e181lp2_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreMaqCod_Internalname,GXutil.rtrim( A4546HreMaqCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreVolPrd_Internalname,GXutil.ltrim( localUtil.ntoc( A4547HreVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4547HreVolPrd), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreVolPrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreNumCie_Internalname,GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreNumCie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreLinMaq_Internalname,GXutil.ltrim( localUtil.ntoc( A4545HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4545HreLinMaq), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreLinMaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreBarReo_Internalname,GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreBarReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreBarPar_Internalname,GXutil.rtrim( A4494HreBarPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreBarPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1LP2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_33_idx = ((subGrid_Islastpage==1)&&(nGXsfl_33_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_33_idx+1) ;
         sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_332( ) ;
      }
      /* End function sendrow_332 */
   }

   public void startgridcontrol33( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"33\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Volumen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "##") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV50GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV48DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4546HreMaqCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4547HreVolPrd, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4545HreLinMaq, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4494HreBarPar));
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
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      tblTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1" );
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT" ;
      edtHreMaqCod_Internalname = sPrefix+"HREMAQCOD" ;
      edtHreVolPrd_Internalname = sPrefix+"HREVOLPRD" ;
      edtHreNumCie_Internalname = sPrefix+"HRENUMCIE" ;
      edtHreLinMaq_Internalname = sPrefix+"HRELINMAQ" ;
      edtHreBarCod_Internalname = sPrefix+"HREBARCOD" ;
      edtHreBarReo_Internalname = sPrefix+"HREBARREO" ;
      edtHreBarPar_Internalname = sPrefix+"HREBARPAR" ;
      divCell_grid_dwc_Internalname = sPrefix+"CELL_GRID_DWC" ;
      divGridtablewithtotalizers_Internalname = sPrefix+"GRIDTABLEWITHTOTALIZERS" ;
      tblUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
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
      edtHreBarPar_Jsonclick = "" ;
      edtHreBarReo_Jsonclick = "" ;
      edtHreBarCod_Jsonclick = "" ;
      edtHreLinMaq_Jsonclick = "" ;
      edtHreNumCie_Jsonclick = "" ;
      edtHreVolPrd_Jsonclick = "" ;
      edtHreMaqCod_Jsonclick = "" ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      subGrid_Sortable = (byte)(0) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Datalistproc = "FormulacionTinte.ConsultadesdeLconti_MaquinasGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|||" ;
      Ddo_grid_Includedatalist = "T|||" ;
      Ddo_grid_Filterisrange = "|T|T|T" ;
      Ddo_grid_Filtertype = "Character|Numeric|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4" ;
      Ddo_grid_Columnids = "2:HreMaqCod|3:HreVolPrd|4:HreNumCie|5:HreLinMaq" ;
      Ddo_grid_Gridinternalname = "" ;
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
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_33_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV24TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV25TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV26TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV27TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV28TFHreNumCie',fld:'vTFHRENUMCIE',pic:'Z9'},{av:'AV29TFHreNumCie_To',fld:'vTFHRENUMCIE_TO',pic:'Z9'},{av:'AV30TFHreLinMaq',fld:'vTFHRELINMAQ',pic:'ZZZ9'},{av:'AV31TFHreLinMaq_To',fld:'vTFHRELINMAQ_TO',pic:'ZZZ9'},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV38HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV39HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV40Hremaqcod',fld:'vHREMAQCOD',pic:''},{av:'AV51EstFecCier',fld:'vESTFECCIER',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV65Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV41Receta',fld:'vRECETA',pic:'ZZZ9',hsh:true},{av:'AV43PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV42ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e111LP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV38HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV39HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV40Hremaqcod',fld:'vHREMAQCOD',pic:''},{av:'AV51EstFecCier',fld:'vESTFECCIER',pic:''},{av:'AV24TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV25TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV26TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV27TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV28TFHreNumCie',fld:'vTFHRENUMCIE',pic:'Z9'},{av:'AV29TFHreNumCie_To',fld:'vTFHRENUMCIE_TO',pic:'Z9'},{av:'AV30TFHreLinMaq',fld:'vTFHRELINMAQ',pic:'ZZZ9'},{av:'AV31TFHreLinMaq_To',fld:'vTFHRELINMAQ_TO',pic:'ZZZ9'},{av:'AV65Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV41Receta',fld:'vRECETA',pic:'ZZZ9',hsh:true},{av:'AV43PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV42ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV24TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV25TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV26TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV27TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV28TFHreNumCie',fld:'vTFHRENUMCIE',pic:'Z9'},{av:'AV29TFHreNumCie_To',fld:'vTFHRENUMCIE_TO',pic:'Z9'},{av:'AV30TFHreLinMaq',fld:'vTFHRELINMAQ',pic:'ZZZ9'},{av:'AV31TFHreLinMaq_To',fld:'vTFHRELINMAQ_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e141LP2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV50GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'AV48DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e151LP2',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV50GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV38HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV39HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV40Hremaqcod',fld:'vHREMAQCOD',pic:''},{av:'AV51EstFecCier',fld:'vESTFECCIER',pic:''},{av:'AV24TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV25TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV26TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV27TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV28TFHreNumCie',fld:'vTFHRENUMCIE',pic:'Z9'},{av:'AV29TFHreNumCie_To',fld:'vTFHRENUMCIE_TO',pic:'Z9'},{av:'AV30TFHreLinMaq',fld:'vTFHRELINMAQ',pic:'ZZZ9'},{av:'AV31TFHreLinMaq_To',fld:'vTFHRELINMAQ_TO',pic:'ZZZ9'},{av:'AV65Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV41Receta',fld:'vRECETA',pic:'ZZZ9',hsh:true},{av:'AV43PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV42ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV50GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'}]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e181LP2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("'DORECETACOSTES'","{handler:'e161LP2',iparms:[{av:'AV41Receta',fld:'vRECETA',pic:'ZZZ9',hsh:true},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'AV43PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV42ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("'DORECETACOSTES'",",oparms:[{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DORECETAHISTORICO'","{handler:'e171LP2',iparms:[{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'}]");
      setEventMetadata("'DORECETAHISTORICO'",",oparms:[{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV41Receta',fld:'vRECETA',pic:'ZZZ9',hsh:true},{av:'AV43PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV42ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'AV24TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV25TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV26TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV27TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV28TFHreNumCie',fld:'vTFHRENUMCIE',pic:'Z9'},{av:'AV29TFHreNumCie_To',fld:'vTFHRENUMCIE_TO',pic:'Z9'},{av:'AV30TFHreLinMaq',fld:'vTFHRELINMAQ',pic:'ZZZ9'},{av:'AV31TFHreLinMaq_To',fld:'vTFHRELINMAQ_TO',pic:'ZZZ9'},{av:'AV65Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV38HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV39HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV40Hremaqcod',fld:'vHREMAQCOD',pic:''},{av:'AV51EstFecCier',fld:'vESTFECCIER',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV41Receta',fld:'vRECETA',pic:'ZZZ9',hsh:true},{av:'AV43PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV42ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'AV24TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV25TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV26TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV27TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV28TFHreNumCie',fld:'vTFHRENUMCIE',pic:'Z9'},{av:'AV29TFHreNumCie_To',fld:'vTFHRENUMCIE_TO',pic:'Z9'},{av:'AV30TFHreLinMaq',fld:'vTFHRELINMAQ',pic:'ZZZ9'},{av:'AV31TFHreLinMaq_To',fld:'vTFHRELINMAQ_TO',pic:'ZZZ9'},{av:'AV65Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV38HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV39HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV40Hremaqcod',fld:'vHREMAQCOD',pic:''},{av:'AV51EstFecCier',fld:'vESTFECCIER',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV41Receta',fld:'vRECETA',pic:'ZZZ9',hsh:true},{av:'AV43PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV42ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'AV24TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV25TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV26TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV27TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV28TFHreNumCie',fld:'vTFHRENUMCIE',pic:'Z9'},{av:'AV29TFHreNumCie_To',fld:'vTFHRENUMCIE_TO',pic:'Z9'},{av:'AV30TFHreLinMaq',fld:'vTFHRELINMAQ',pic:'ZZZ9'},{av:'AV31TFHreLinMaq_To',fld:'vTFHRELINMAQ_TO',pic:'ZZZ9'},{av:'AV65Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV38HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV39HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV40Hremaqcod',fld:'vHREMAQCOD',pic:''},{av:'AV51EstFecCier',fld:'vESTFECCIER',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV41Receta',fld:'vRECETA',pic:'ZZZ9',hsh:true},{av:'AV43PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV42ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'AV24TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV25TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV26TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV27TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV28TFHreNumCie',fld:'vTFHRENUMCIE',pic:'Z9'},{av:'AV29TFHreNumCie_To',fld:'vTFHRENUMCIE_TO',pic:'Z9'},{av:'AV30TFHreLinMaq',fld:'vTFHRELINMAQ',pic:'ZZZ9'},{av:'AV31TFHreLinMaq_To',fld:'vTFHRELINMAQ_TO',pic:'ZZZ9'},{av:'AV65Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV38HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV39HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV40Hremaqcod',fld:'vHREMAQCOD',pic:''},{av:'AV51EstFecCier',fld:'vESTFECCIER',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("VALID_HRENUMCIE","{handler:'valid_Hrenumcie',iparms:[]");
      setEventMetadata("VALID_HRENUMCIE",",oparms:[]}");
      setEventMetadata("VALID_HREBARCOD","{handler:'valid_Hrebarcod',iparms:[]");
      setEventMetadata("VALID_HREBARCOD",",oparms:[]}");
      setEventMetadata("VALID_HREBARREO","{handler:'valid_Hrebarreo',iparms:[]");
      setEventMetadata("VALID_HREBARREO",",oparms:[]}");
      setEventMetadata("VALID_HREBARPAR","{handler:'valid_Hrebarpar',iparms:[]");
      setEventMetadata("VALID_HREBARPAR",",oparms:[]}");
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
      wcpOAV36EmprCod = "" ;
      wcpOAV39HreBarPar = "" ;
      wcpOAV40Hremaqcod = "" ;
      wcpOAV51EstFecCier = GXutil.nullDate() ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV36EmprCod = "" ;
      AV39HreBarPar = "" ;
      AV40Hremaqcod = "" ;
      AV51EstFecCier = GXutil.nullDate() ;
      AV24TFHreMaqCod = "" ;
      AV25TFHreMaqCod_Sel = "" ;
      AV65Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV32DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV57Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod = "" ;
      AV58Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel = "" ;
      AV48DetailWebComponent = "" ;
      A4546HreMaqCod = "" ;
      A4494HreBarPar = "" ;
      OldGrid_dwc = "" ;
      WebComp_Grid_dwc_Component = "" ;
      scmdbuf = "" ;
      lV57Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod = "" ;
      A4529HreFecTin = GXutil.nullDate() ;
      H01LP2_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      H01LP2_n4529HreFecTin = new boolean[] {false} ;
      H01LP2_A396EmprCod = new String[] {""} ;
      H01LP2_A4494HreBarPar = new String[] {""} ;
      H01LP2_A4493HreBarReo = new byte[1] ;
      H01LP2_A4492HreBarCod = new int[1] ;
      H01LP2_A4545HreLinMaq = new short[1] ;
      H01LP2_A4495HreNumCie = new byte[1] ;
      H01LP2_A4547HreVolPrd = new int[1] ;
      H01LP2_n4547HreVolPrd = new boolean[] {false} ;
      H01LP2_A4546HreMaqCod = new String[] {""} ;
      H01LP2_n4546HreMaqCod = new boolean[] {false} ;
      H01LP3_AGRID_nRecordCount = new long[1] ;
      GXv_int4 = new int[1] ;
      GXv_int2 = new byte[1] ;
      AV52Station = "" ;
      GXv_char6 = new String[1] ;
      AV53EmprNom = "" ;
      GXv_char7 = new String[1] ;
      AV54UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV20Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char5 = "" ;
      GXv_char8 = new String[1] ;
      GXv_SdtWWPGridState12 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV46WebSession = httpContext.getWebSession();
      AV45Window = new com.genexus.webpanels.GXWindow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV36EmprCod = "" ;
      sCtrlAV37HreBarCod = "" ;
      sCtrlAV38HreBarReo = "" ;
      sCtrlAV39HreBarPar = "" ;
      sCtrlAV40Hremaqcod = "" ;
      sCtrlAV51EstFecCier = "" ;
      subGrid_Linesclass = "" ;
      TempTags = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.consultadesdelconti_maquinas__default(),
         new Object[] {
             new Object[] {
            H01LP2_A4529HreFecTin, H01LP2_n4529HreFecTin, H01LP2_A396EmprCod, H01LP2_A4494HreBarPar, H01LP2_A4493HreBarReo, H01LP2_A4492HreBarCod, H01LP2_A4545HreLinMaq, H01LP2_A4495HreNumCie, H01LP2_A4547HreVolPrd, H01LP2_n4547HreVolPrd,
            H01LP2_A4546HreMaqCod, H01LP2_n4546HreMaqCod
            }
            , new Object[] {
            H01LP3_AGRID_nRecordCount
            }
         }
      );
      AV65Pgmname = "FormulacionTinte.ConsultadesdeLconti_Maquinas" ;
      /* GeneXus formulas. */
      AV65Pgmname = "FormulacionTinte.ConsultadesdeLconti_Maquinas" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV38HreBarReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV38HreBarReo ;
   private byte AV28TFHreNumCie ;
   private byte AV29TFHreNumCie_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV61Formulaciontinte_consultadesdelconti_maquinasds_5_tfhrenumcie ;
   private byte AV62Formulaciontinte_consultadesdelconti_maquinasds_6_tfhrenumcie_to ;
   private byte A4495HreNumCie ;
   private byte A4493HreBarReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV30TFHreLinMaq ;
   private short AV31TFHreLinMaq_To ;
   private short AV12OrderedBy ;
   private short AV41Receta ;
   private short AV43PwdGrl ;
   private short wbEnd ;
   private short wbStart ;
   private short AV63Formulaciontinte_consultadesdelconti_maquinasds_7_tfhrelinmaq ;
   private short AV64Formulaciontinte_consultadesdelconti_maquinasds_8_tfhrelinmaq_to ;
   private short AV50GridActionGroup1 ;
   private short A4545HreLinMaq ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV44anahuac ;
   private int wcpOAV37HreBarCod ;
   private int subGrid_Rows ;
   private int nRC_GXsfl_33 ;
   private int AV37HreBarCod ;
   private int nGXsfl_33_idx=1 ;
   private int AV26TFHreVolPrd ;
   private int AV27TFHreVolPrd_To ;
   private int AV42ContVal ;
   private int AV59Formulaciontinte_consultadesdelconti_maquinasds_3_tfhrevolprd ;
   private int AV60Formulaciontinte_consultadesdelconti_maquinasds_4_tfhrevolprd_to ;
   private int A4547HreVolPrd ;
   private int A4492HreBarCod ;
   private int subGrid_Islastpage ;
   private int edtavDetailwebcomponent_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int GXt_int3 ;
   private int GXv_int4[] ;
   private int AV66GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavDetailwebcomponent_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV36EmprCod ;
   private String wcpOAV39HreBarPar ;
   private String wcpOAV40Hremaqcod ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV36EmprCod ;
   private String AV39HreBarPar ;
   private String AV40Hremaqcod ;
   private String sGXsfl_33_idx="0001" ;
   private String AV24TFHreMaqCod ;
   private String AV25TFHreMaqCod_Sel ;
   private String AV65Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Filteredtext_set ;
   private String Ddo_grid_Filteredtextto_set ;
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV57Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod ;
   private String AV58Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel ;
   private String AV48DetailWebComponent ;
   private String edtavDetailwebcomponent_Internalname ;
   private String A4546HreMaqCod ;
   private String edtHreMaqCod_Internalname ;
   private String edtHreVolPrd_Internalname ;
   private String edtHreNumCie_Internalname ;
   private String edtHreLinMaq_Internalname ;
   private String edtHreBarCod_Internalname ;
   private String edtHreBarReo_Internalname ;
   private String A4494HreBarPar ;
   private String edtHreBarPar_Internalname ;
   private String OldGrid_dwc ;
   private String WebComp_Grid_dwc_Component ;
   private String scmdbuf ;
   private String lV57Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod ;
   private String AV52Station ;
   private String GXv_char6[] ;
   private String AV53EmprNom ;
   private String GXv_char7[] ;
   private String AV54UsurCod ;
   private String divCell_grid_dwc_Class ;
   private String divCell_grid_dwc_Internalname ;
   private String GXt_char5 ;
   private String GXv_char8[] ;
   private String tblUnnamedtable1_Internalname ;
   private String divGridtablewithtotalizers_Internalname ;
   private String tblTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV36EmprCod ;
   private String sCtrlAV37HreBarCod ;
   private String sCtrlAV38HreBarReo ;
   private String sCtrlAV39HreBarPar ;
   private String sCtrlAV40Hremaqcod ;
   private String sCtrlAV51EstFecCier ;
   private String sGXsfl_33_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String TempTags ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtHreMaqCod_Jsonclick ;
   private String edtHreVolPrd_Jsonclick ;
   private String edtHreNumCie_Jsonclick ;
   private String edtHreLinMaq_Jsonclick ;
   private String edtHreBarCod_Jsonclick ;
   private String edtHreBarReo_Jsonclick ;
   private String edtHreBarPar_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV51EstFecCier ;
   private java.util.Date AV51EstFecCier ;
   private java.util.Date A4529HreFecTin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n4546HreMaqCod ;
   private boolean n4547HreVolPrd ;
   private boolean bGXsfl_33_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n4529HreFecTin ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV47ClaveConfirmada ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.GXWindow AV45Window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H01LP2_A4529HreFecTin ;
   private boolean[] H01LP2_n4529HreFecTin ;
   private String[] H01LP2_A396EmprCod ;
   private String[] H01LP2_A4494HreBarPar ;
   private byte[] H01LP2_A4493HreBarReo ;
   private int[] H01LP2_A4492HreBarCod ;
   private short[] H01LP2_A4545HreLinMaq ;
   private byte[] H01LP2_A4495HreNumCie ;
   private int[] H01LP2_A4547HreVolPrd ;
   private boolean[] H01LP2_n4547HreVolPrd ;
   private String[] H01LP2_A4546HreMaqCod ;
   private boolean[] H01LP2_n4546HreMaqCod ;
   private long[] H01LP3_AGRID_nRecordCount ;
   private com.genexus.webpanels.WebSession AV46WebSession ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState12[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV32DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[] ;
}

final  class consultadesdelconti_maquinas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01LP2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel ,
                                          String AV57Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod ,
                                          int AV59Formulaciontinte_consultadesdelconti_maquinasds_3_tfhrevolprd ,
                                          int AV60Formulaciontinte_consultadesdelconti_maquinasds_4_tfhrevolprd_to ,
                                          byte AV61Formulaciontinte_consultadesdelconti_maquinasds_5_tfhrenumcie ,
                                          byte AV62Formulaciontinte_consultadesdelconti_maquinasds_6_tfhrenumcie_to ,
                                          short AV63Formulaciontinte_consultadesdelconti_maquinasds_7_tfhrelinmaq ,
                                          short AV64Formulaciontinte_consultadesdelconti_maquinasds_8_tfhrelinmaq_to ,
                                          String A4546HreMaqCod ,
                                          int A4547HreVolPrd ,
                                          byte A4495HreNumCie ,
                                          short A4545HreLinMaq ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV40Hremaqcod ,
                                          java.util.Date A4529HreFecTin ,
                                          java.util.Date AV51EstFecCier ,
                                          String AV36EmprCod ,
                                          int AV37HreBarCod ,
                                          byte AV38HreBarReo ,
                                          String AV39HreBarPar ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[19];
      Object[] GXv_Object14 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T2.HreFecTin, T1.EmprCod, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.HreLinMaq, T1.HreNumCie, T1.HreVolPrd, T1.HreMaqCod" ;
      sFromString = " FROM (TXPHISREM T1 INNER JOIN TXPHISREH T2 ON T2.EmprCod = T1.EmprCod AND T2.HreBarCod = T1.HreBarCod AND T2.HreBarReo = T1.HreBarReo AND T2.HreBarPar = T1.HreBarPar" ;
      sFromString += " AND T2.HreNumCie = T1.HreNumCie)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.HreBarCod = ? and T1.HreBarReo = ? and T1.HreBarPar = ?)");
      addWhere(sWhereString, "(T1.HreMaqCod = ?)");
      addWhere(sWhereString, "(T2.HreFecTin = ?)");
      if ( (GXutil.strcmp("", AV58Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV57Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreMaqCod = ?)");
      }
      else
      {
         GXv_int13[7] = (byte)(1) ;
      }
      if ( ! (0==AV59Formulaciontinte_consultadesdelconti_maquinasds_3_tfhrevolprd) )
      {
         addWhere(sWhereString, "(T1.HreVolPrd >= ?)");
      }
      else
      {
         GXv_int13[8] = (byte)(1) ;
      }
      if ( ! (0==AV60Formulaciontinte_consultadesdelconti_maquinasds_4_tfhrevolprd_to) )
      {
         addWhere(sWhereString, "(T1.HreVolPrd <= ?)");
      }
      else
      {
         GXv_int13[9] = (byte)(1) ;
      }
      if ( ! (0==AV61Formulaciontinte_consultadesdelconti_maquinasds_5_tfhrenumcie) )
      {
         addWhere(sWhereString, "(T1.HreNumCie >= ?)");
      }
      else
      {
         GXv_int13[10] = (byte)(1) ;
      }
      if ( ! (0==AV62Formulaciontinte_consultadesdelconti_maquinasds_6_tfhrenumcie_to) )
      {
         addWhere(sWhereString, "(T1.HreNumCie <= ?)");
      }
      else
      {
         GXv_int13[11] = (byte)(1) ;
      }
      if ( ! (0==AV63Formulaciontinte_consultadesdelconti_maquinasds_7_tfhrelinmaq) )
      {
         addWhere(sWhereString, "(T1.HreLinMaq >= ?)");
      }
      else
      {
         GXv_int13[12] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_consultadesdelconti_maquinasds_8_tfhrelinmaq_to) )
      {
         addWhere(sWhereString, "(T1.HreLinMaq <= ?)");
      }
      else
      {
         GXv_int13[13] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HreMaqCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HreMaqCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HreVolPrd" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HreVolPrd DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HreNumCie" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HreNumCie DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HreLinMaq" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HreLinMaq DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMaq" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   protected Object[] conditional_H01LP3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel ,
                                          String AV57Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod ,
                                          int AV59Formulaciontinte_consultadesdelconti_maquinasds_3_tfhrevolprd ,
                                          int AV60Formulaciontinte_consultadesdelconti_maquinasds_4_tfhrevolprd_to ,
                                          byte AV61Formulaciontinte_consultadesdelconti_maquinasds_5_tfhrenumcie ,
                                          byte AV62Formulaciontinte_consultadesdelconti_maquinasds_6_tfhrenumcie_to ,
                                          short AV63Formulaciontinte_consultadesdelconti_maquinasds_7_tfhrelinmaq ,
                                          short AV64Formulaciontinte_consultadesdelconti_maquinasds_8_tfhrelinmaq_to ,
                                          String A4546HreMaqCod ,
                                          int A4547HreVolPrd ,
                                          byte A4495HreNumCie ,
                                          short A4545HreLinMaq ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV40Hremaqcod ,
                                          java.util.Date A4529HreFecTin ,
                                          java.util.Date AV51EstFecCier ,
                                          String AV36EmprCod ,
                                          int AV37HreBarCod ,
                                          byte AV38HreBarReo ,
                                          String AV39HreBarPar ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[14];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPHISREM T1 INNER JOIN TXPHISREH T2 ON T2.EmprCod = T1.EmprCod AND T2.HreBarCod = T1.HreBarCod AND T2.HreBarReo = T1.HreBarReo AND T2.HreBarPar" ;
      scmdbuf += " = T1.HreBarPar AND T2.HreNumCie = T1.HreNumCie)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.HreBarCod = ? and T1.HreBarReo = ? and T1.HreBarPar = ?)");
      addWhere(sWhereString, "(T1.HreMaqCod = ?)");
      addWhere(sWhereString, "(T2.HreFecTin = ?)");
      if ( (GXutil.strcmp("", AV58Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV57Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreMaqCod = ?)");
      }
      else
      {
         GXv_int15[7] = (byte)(1) ;
      }
      if ( ! (0==AV59Formulaciontinte_consultadesdelconti_maquinasds_3_tfhrevolprd) )
      {
         addWhere(sWhereString, "(T1.HreVolPrd >= ?)");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( ! (0==AV60Formulaciontinte_consultadesdelconti_maquinasds_4_tfhrevolprd_to) )
      {
         addWhere(sWhereString, "(T1.HreVolPrd <= ?)");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      if ( ! (0==AV61Formulaciontinte_consultadesdelconti_maquinasds_5_tfhrenumcie) )
      {
         addWhere(sWhereString, "(T1.HreNumCie >= ?)");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( ! (0==AV62Formulaciontinte_consultadesdelconti_maquinasds_6_tfhrenumcie_to) )
      {
         addWhere(sWhereString, "(T1.HreNumCie <= ?)");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( ! (0==AV63Formulaciontinte_consultadesdelconti_maquinasds_7_tfhrelinmaq) )
      {
         addWhere(sWhereString, "(T1.HreLinMaq >= ?)");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_consultadesdelconti_maquinasds_8_tfhrelinmaq_to) )
      {
         addWhere(sWhereString, "(T1.HreLinMaq <= ?)");
      }
      else
      {
         GXv_int15[13] = (byte)(1) ;
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
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
                  return conditional_H01LP2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Boolean) dynConstraints[13]).booleanValue() , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] );
            case 1 :
                  return conditional_H01LP3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Boolean) dynConstraints[13]).booleanValue() , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01LP2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01LP3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[19]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               return;
      }
   }

}

