package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mantenimientorollos_wc_impl extends GXWebComponent
{
   public mantenimientorollos_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mantenimientorollos_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantenimientorollos_wc_impl.class ));
   }

   public mantenimientorollos_wc_impl( int remoteHandle ,
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
      chkavSeleccionar = UIFactory.getCheckbox(this);
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
               AV61Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Emprcod", AV61Emprcod);
               AV62BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62BarCod), 8, 0));
               AV63BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarCodReo", GXutil.str( AV63BarCodReo, 1, 0));
               AV64BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarCodPar", AV64BarCodPar);
               AV65Kms = httpContext.GetPar( "Kms") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Kms", AV65Kms);
               AV66Maqcod = httpContext.GetPar( "Maqcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Maqcod", AV66Maqcod);
               AV67Opecod = (int)(GXutil.lval( httpContext.GetPar( "Opecod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Opecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67Opecod), 6, 0));
               AV68Mensaje = httpContext.GetPar( "Mensaje") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Mensaje", AV68Mensaje);
               AV72BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72BarKgm", GXutil.ltrimstr( AV72BarKgm, 9, 2));
               AV73BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73BarMtr", GXutil.ltrimstr( AV73BarMtr, 9, 2));
               AV78BarAncAca1 = (short)(GXutil.lval( httpContext.GetPar( "BarAncAca1"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78BarAncAca1), 3, 0));
               AV79BarRdt = CommonUtil.decimalVal( httpContext.GetPar( "BarRdt"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79BarRdt", GXutil.ltrimstr( AV79BarRdt, 6, 2));
               AV80Barpes = (short)(GXutil.lval( httpContext.GetPar( "Barpes"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80Barpes), 4, 0));
               AV81BarUnimed = httpContext.GetPar( "BarUnimed") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81BarUnimed", AV81BarUnimed);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV61Emprcod,Integer.valueOf(AV62BarCod),Byte.valueOf(AV63BarCodReo),AV64BarCodPar,AV65Kms,AV66Maqcod,Integer.valueOf(AV67Opecod),AV68Mensaje,AV72BarKgm,AV73BarMtr,Short.valueOf(AV78BarAncAca1),AV79BarRdt,Short.valueOf(AV80Barpes),AV81BarUnimed});
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
      nRC_GXsfl_61 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_61"))) ;
      nGXsfl_61_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_61_idx"))) ;
      sGXsfl_61_idx = httpContext.GetPar( "sGXsfl_61_idx") ;
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
      AV61Emprcod = httpContext.GetPar( "Emprcod") ;
      AV62BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV63BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV64BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV106Ok = httpContext.GetPar( "Ok") ;
      AV28TFMetTerCod = httpContext.GetPar( "TFMetTerCod") ;
      AV29TFMetTerCod_Sel = httpContext.GetPar( "TFMetTerCod_Sel") ;
      AV36TFMetPieCod = httpContext.GetPar( "TFMetPieCod") ;
      AV37TFMetPieCod_Sel = httpContext.GetPar( "TFMetPieCod_Sel") ;
      AV38TFMetPieKil = CommonUtil.decimalVal( httpContext.GetPar( "TFMetPieKil"), ".") ;
      AV39TFMetPieKil_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMetPieKil_To"), ".") ;
      AV40TFMetPieMet = CommonUtil.decimalVal( httpContext.GetPar( "TFMetPieMet"), ".") ;
      AV41TFMetPieMet_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMetPieMet_To"), ".") ;
      AV42TFMetPieAnc = (short)(GXutil.lval( httpContext.GetPar( "TFMetPieAnc"))) ;
      AV43TFMetPieAnc_To = (short)(GXutil.lval( httpContext.GetPar( "TFMetPieAnc_To"))) ;
      AV44TFMetPieMtD = CommonUtil.decimalVal( httpContext.GetPar( "TFMetPieMtD"), ".") ;
      AV45TFMetPieMtD_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMetPieMtD_To"), ".") ;
      AV46TFMetPieEst = (byte)(GXutil.lval( httpContext.GetPar( "TFMetPieEst"))) ;
      AV47TFMetPieEst_To = (byte)(GXutil.lval( httpContext.GetPar( "TFMetPieEst_To"))) ;
      AV102TFMetPieLoc = httpContext.GetPar( "TFMetPieLoc") ;
      AV103TFMetPieLoc_Sel = httpContext.GetPar( "TFMetPieLoc_Sel") ;
      AV104TFMetPieDCP = httpContext.GetPar( "TFMetPieDCP") ;
      AV105TFMetPieDCP_Sel = httpContext.GetPar( "TFMetPieDCP_Sel") ;
      AV111Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV65Kms = httpContext.GetPar( "Kms") ;
      AV66Maqcod = httpContext.GetPar( "Maqcod") ;
      AV67Opecod = (int)(GXutil.lval( httpContext.GetPar( "Opecod"))) ;
      AV68Mensaje = httpContext.GetPar( "Mensaje") ;
      AV72BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
      AV73BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
      AV78BarAncAca1 = (short)(GXutil.lval( httpContext.GetPar( "BarAncAca1"))) ;
      AV79BarRdt = CommonUtil.decimalVal( httpContext.GetPar( "BarRdt"), ".") ;
      AV80Barpes = (short)(GXutil.lval( httpContext.GetPar( "Barpes"))) ;
      AV81BarUnimed = httpContext.GetPar( "BarUnimed") ;
      AV74TotMetPieKil = CommonUtil.decimalVal( httpContext.GetPar( "TotMetPieKil"), ".") ;
      AV76TotMetPieMet = CommonUtil.decimalVal( httpContext.GetPar( "TotMetPieMet"), ".") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV86Col_BarCod);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV87Col_BarCodPar);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV88Col_BarCodReo);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV97Col_MetPieCod);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV96Col_MetTerCod);
      AV83ContVal = (int)(GXutil.lval( httpContext.GetPar( "ContVal"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV61Emprcod, AV62BarCod, AV63BarCodReo, AV64BarCodPar, AV106Ok, AV28TFMetTerCod, AV29TFMetTerCod_Sel, AV36TFMetPieCod, AV37TFMetPieCod_Sel, AV38TFMetPieKil, AV39TFMetPieKil_To, AV40TFMetPieMet, AV41TFMetPieMet_To, AV42TFMetPieAnc, AV43TFMetPieAnc_To, AV44TFMetPieMtD, AV45TFMetPieMtD_To, AV46TFMetPieEst, AV47TFMetPieEst_To, AV102TFMetPieLoc, AV103TFMetPieLoc_Sel, AV104TFMetPieDCP, AV105TFMetPieDCP_Sel, AV111Pgmname, AV12OrderedBy, AV13OrderedDsc, AV65Kms, AV66Maqcod, AV67Opecod, AV68Mensaje, AV72BarKgm, AV73BarMtr, AV78BarAncAca1, AV79BarRdt, AV80Barpes, AV81BarUnimed, AV74TotMetPieKil, AV76TotMetPieMet, AV86Col_BarCod, AV87Col_BarCodPar, AV88Col_BarCodReo, AV97Col_MetPieCod, AV96Col_MetTerCod, AV83ContVal, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa26I2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Rollos", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidosclientesindetalle.mantenimientorollos_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV61Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV62BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV63BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV64BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV65Kms)),GXutil.URLEncode(GXutil.rtrim(AV66Maqcod)),GXutil.URLEncode(GXutil.ltrimstr(AV67Opecod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV68Mensaje)),GXutil.URLEncode(DecimalUtil.decToString(AV72BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV73BarMtr)),GXutil.URLEncode(GXutil.ltrimstr(AV78BarAncAca1,3,0)),GXutil.URLEncode(DecimalUtil.decToString(AV79BarRdt)),GXutil.URLEncode(GXutil.ltrimstr(AV80Barpes,4,0)),GXutil.URLEncode(GXutil.rtrim(AV81BarUnimed))}, new String[] {"Emprcod","BarCod","BarCodReo","BarCodPar","Kms","Maqcod","Opecod","Mensaje","BarKgm","BarMtr","BarAncAca1","BarRdt","Barpes","BarUnimed"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEKIL", getSecureSignedToken( sPrefix, localUtil.format( AV74TotMetPieKil, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEMET", getSecureSignedToken( sPrefix, localUtil.format( AV76TotMetPieMet, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV83ContVal), "ZZZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MantenimientoRollos_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV111Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidosclientesindetalle\\mantenimientorollos_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_61", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_61, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV56GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV57GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV54DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV54DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV61Emprcod", GXutil.rtrim( wcpOAV61Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV62BarCod", GXutil.ltrim( localUtil.ntoc( wcpOAV62BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV63BarCodReo", GXutil.ltrim( localUtil.ntoc( wcpOAV63BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV64BarCodPar", GXutil.rtrim( wcpOAV64BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV65Kms", GXutil.rtrim( wcpOAV65Kms));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV66Maqcod", GXutil.rtrim( wcpOAV66Maqcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV67Opecod", GXutil.ltrim( localUtil.ntoc( wcpOAV67Opecod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV68Mensaje", wcpOAV68Mensaje);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV72BarKgm", GXutil.ltrim( localUtil.ntoc( wcpOAV72BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV73BarMtr", GXutil.ltrim( localUtil.ntoc( wcpOAV73BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV78BarAncAca1", GXutil.ltrim( localUtil.ntoc( wcpOAV78BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV79BarRdt", GXutil.ltrim( localUtil.ntoc( wcpOAV79BarRdt, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV80Barpes", GXutil.ltrim( localUtil.ntoc( wcpOAV80Barpes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV81BarUnimed", GXutil.rtrim( wcpOAV81BarUnimed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETTERCOD", GXutil.rtrim( AV28TFMetTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETTERCOD_SEL", GXutil.rtrim( AV29TFMetTerCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIECOD", GXutil.rtrim( AV36TFMetPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIECOD_SEL", GXutil.rtrim( AV37TFMetPieCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEKIL", GXutil.ltrim( localUtil.ntoc( AV38TFMetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEKIL_TO", GXutil.ltrim( localUtil.ntoc( AV39TFMetPieKil_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEMET", GXutil.ltrim( localUtil.ntoc( AV40TFMetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEMET_TO", GXutil.ltrim( localUtil.ntoc( AV41TFMetPieMet_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEANC", GXutil.ltrim( localUtil.ntoc( AV42TFMetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEANC_TO", GXutil.ltrim( localUtil.ntoc( AV43TFMetPieAnc_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEMTD", GXutil.ltrim( localUtil.ntoc( AV44TFMetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEMTD_TO", GXutil.ltrim( localUtil.ntoc( AV45TFMetPieMtD_To, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEEST", GXutil.ltrim( localUtil.ntoc( AV46TFMetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEEST_TO", GXutil.ltrim( localUtil.ntoc( AV47TFMetPieEst_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIELOC", GXutil.rtrim( AV102TFMetPieLoc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIELOC_SEL", GXutil.rtrim( AV103TFMetPieLoc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEDCP", GXutil.rtrim( AV104TFMetPieDCP));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEDCP_SEL", GXutil.rtrim( AV105TFMetPieDCP_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV61Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vKMS", GXutil.rtrim( AV65Kms));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD", GXutil.rtrim( AV66Maqcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOPECOD", GXutil.ltrim( localUtil.ntoc( AV67Opecod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMENSAJE", AV68Mensaje);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARANCACA1", GXutil.ltrim( localUtil.ntoc( AV78BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARRDT", GXutil.ltrim( localUtil.ntoc( AV79BarRdt, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARPES", GXutil.ltrim( localUtil.ntoc( AV80Barpes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARUNIMED", GXutil.rtrim( AV81BarUnimed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMETPIEKIL", GXutil.ltrim( localUtil.ntoc( AV74TotMetPieKil, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEKIL", getSecureSignedToken( sPrefix, localUtil.format( AV74TotMetPieKil, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMETPIEMET", GXutil.ltrim( localUtil.ntoc( AV76TotMetPieMet, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEMET", getSecureSignedToken( sPrefix, localUtil.format( AV76TotMetPieMet, "ZZZZZ9.99")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_BARCOD", AV86Col_BarCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_BARCOD", AV86Col_BarCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_BARCODPAR", AV87Col_BarCodPar);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_BARCODPAR", AV87Col_BarCodPar);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_BARCODREO", AV88Col_BarCodReo);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_BARCODREO", AV88Col_BarCodReo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_METPIECOD", AV97Col_MetPieCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_METPIECOD", AV97Col_MetPieCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_METTERCOD", AV96Col_MetTerCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_METTERCOD", AV96Col_MetTerCod);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONTVAL", GXutil.ltrim( localUtil.ntoc( AV83ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV83ContVal), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV71UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV69Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vULTIMAPIEZA", GXutil.ltrim( localUtil.ntoc( AV95UltimaPieza, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vI", GXutil.ltrim( localUtil.ntoc( AV98i, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARPIEZAS_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminarpiezas_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARPIEZAS_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminarpiezas_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARPIEZAS_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarpiezas_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARPIEZAS_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarpiezas_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARPIEZAS_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarpiezas_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARPIEZAS_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminarpiezas_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARPIEZAS_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminarpiezas_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARPIEZAS_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarpiezas_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARPIEZAS_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarpiezas_Result));
   }

   public void renderHtmlCloseForm26I2( )
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
      return "PedidosClienteSinDetalle.MantenimientoRollos_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Rollos", "") ;
   }

   public void wb26I0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.pedidosclientesindetalle.mantenimientorollos_wc");
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
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
         }
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table TableWithSelectableGrid", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTableactions0_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Nº Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV62BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV62BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV62BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV63BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV63BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV63BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV64BarCodPar), GXutil.rtrim( localUtil.format( AV64BarCodPar, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarkgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarkgm_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarkgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV72BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarkgm_Enabled!=0) ? localUtil.format( AV72BarKgm, "ZZZZZ9.99") : localUtil.format( AV72BarKgm, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarkgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarkgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarmtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarmtr_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarmtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV73BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarmtr_Enabled!=0) ? localUtil.format( AV73BarMtr, "ZZZZZ9.99") : localUtil.format( AV73BarMtr, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarmtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarmtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 61, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\MantenimientoRollos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_43_26I2( true) ;
      }
      else
      {
         wb_table1_43_26I2( false) ;
      }
      return  ;
   }

   public void wb_table1_43_26I2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminarpiezas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 61, 2, 0)+","+"null"+");", httpContext.getMessage( "Eliminar Pieza(s) (Op)", ""), bttBtneliminarpiezas_Jsonclick, 5, httpContext.getMessage( "Eliminar Pieza(s) (Op)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOELIMINARPIEZAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\MantenimientoRollos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnaltapieza_Internalname, "gx.evt.setGridEvt("+GXutil.str( 61, 2, 0)+","+"null"+");", httpContext.getMessage( "Alta Pieza", ""), bttBtnaltapieza_Jsonclick, 5, httpContext.getMessage( "Alta Pieza", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOALTAPIEZA\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\MantenimientoRollos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol61( ) ;
      }
      if ( wbEnd == 61 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_61 = (int)(nGXsfl_61_idx-1) ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_82_26I2( true) ;
      }
      else
      {
         wb_table2_82_26I2( false) ;
      }
      return  ;
   }

   public void wb_table2_82_26I2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV56GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV57GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV111Pgmname), GXutil.rtrim( localUtil.format( AV111Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos_WC.htm");
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
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV54DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'" + sPrefix + "',false,'" + sGXsfl_61_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOk_Internalname, GXutil.rtrim( AV106Ok), GXutil.rtrim( localUtil.format( AV106Ok, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,120);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOk_Jsonclick, 0, "Attribute", "", "", "", "", edtavOk_Visible, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos_WC.htm");
         wb_table3_121_26I2( true) ;
      }
      else
      {
         wb_table3_121_26I2( false) ;
      }
      return  ;
   }

   public void wb_table3_121_26I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 61 )
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

   public void start26I2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Rollos", ""), (short)(0)) ;
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
            strup26I0( ) ;
         }
      }
   }

   public void ws26I2( )
   {
      start26I2( ) ;
      evt26I2( ) ;
   }

   public void evt26I2( )
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
                              strup26I0( ) ;
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
                              strup26I0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1126I2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26I0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1226I2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26I0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1326I2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARPIEZAS.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26I0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1426I2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOELIMINARPIEZAS'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26I0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoEliminarPiezas' */
                                 e1526I2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOALTAPIEZA'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26I0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoAltaPieza' */
                                 e1626I2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26I0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e1726I2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26I0( ) ;
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
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26I0( ) ;
                           }
                           nGXsfl_61_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_61_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_61_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_612( ) ;
                           cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                           cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                           AV82GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82GridActionGroup1), 4, 0));
                           AV93Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV93Seleccionar);
                           A2809MetTerCod = httpContext.cgiGet( edtMetTerCod_Internalname) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A2813MetPieCod = httpContext.cgiGet( edtMetPieCod_Internalname) ;
                           A2814MetPieKil = localUtil.ctond( httpContext.cgiGet( edtMetPieKil_Internalname)) ;
                           A2815MetPieMet = localUtil.ctond( httpContext.cgiGet( edtMetPieMet_Internalname)) ;
                           A6635MetPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4910MetPieMtD = localUtil.ctond( httpContext.cgiGet( edtMetPieMtD_Internalname)) ;
                           A2816MetPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtMetPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV60VControl = httpContext.cgiGet( edtavVcontrol_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavVcontrol_Internalname, AV60VControl);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vVCONTROL"+"_"+sGXsfl_61_idx, getSecureSignedToken( sPrefix+sGXsfl_61_idx, GXutil.rtrim( localUtil.format( AV60VControl, ""))));
                           A4913MetPieLoc = httpContext.cgiGet( edtMetPieLoc_Internalname) ;
                           A4915MetPieDCP = GXutil.upper( httpContext.cgiGet( edtMetPieDCP_Internalname)) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarordlingrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarordlingrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARORDLINGRID");
                              GX_FocusControl = edtavBarordlingrid_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV59barOrdlinGRID = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarordlingrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59barOrdlinGRID), 4, 0));
                           }
                           else
                           {
                              AV59barOrdlinGRID = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarordlingrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarordlingrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59barOrdlinGRID), 4, 0));
                           }
                           A10784MetPieId = httpContext.cgiGet( edtMetPieId_Internalname) ;
                           A4917MetPieObs = httpContext.cgiGet( edtMetPieObs_Internalname) ;
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
                                       e1826I2 ();
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
                                       e1926I2 ();
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
                                       e2026I2 ();
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
                                       e2126I2 ();
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
                                    strup26I0( ) ;
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
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we26I2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm26I2( ) ;
         }
      }
   }

   public void pa26I2( )
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
            GX_FocusControl = edtavTotvaluemetpiekil_Internalname ;
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
      subsflControlProps_612( ) ;
      while ( nGXsfl_61_idx <= nRC_GXsfl_61 )
      {
         sendrow_612( ) ;
         nGXsfl_61_idx = ((subGrid_Islastpage==1)&&(nGXsfl_61_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_61_idx+1) ;
         sGXsfl_61_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_61_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_612( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV61Emprcod ,
                                 int AV62BarCod ,
                                 byte AV63BarCodReo ,
                                 String AV64BarCodPar ,
                                 String AV106Ok ,
                                 String AV28TFMetTerCod ,
                                 String AV29TFMetTerCod_Sel ,
                                 String AV36TFMetPieCod ,
                                 String AV37TFMetPieCod_Sel ,
                                 java.math.BigDecimal AV38TFMetPieKil ,
                                 java.math.BigDecimal AV39TFMetPieKil_To ,
                                 java.math.BigDecimal AV40TFMetPieMet ,
                                 java.math.BigDecimal AV41TFMetPieMet_To ,
                                 short AV42TFMetPieAnc ,
                                 short AV43TFMetPieAnc_To ,
                                 java.math.BigDecimal AV44TFMetPieMtD ,
                                 java.math.BigDecimal AV45TFMetPieMtD_To ,
                                 byte AV46TFMetPieEst ,
                                 byte AV47TFMetPieEst_To ,
                                 String AV102TFMetPieLoc ,
                                 String AV103TFMetPieLoc_Sel ,
                                 String AV104TFMetPieDCP ,
                                 String AV105TFMetPieDCP_Sel ,
                                 String AV111Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV65Kms ,
                                 String AV66Maqcod ,
                                 int AV67Opecod ,
                                 String AV68Mensaje ,
                                 java.math.BigDecimal AV72BarKgm ,
                                 java.math.BigDecimal AV73BarMtr ,
                                 short AV78BarAncAca1 ,
                                 java.math.BigDecimal AV79BarRdt ,
                                 short AV80Barpes ,
                                 String AV81BarUnimed ,
                                 java.math.BigDecimal AV74TotMetPieKil ,
                                 java.math.BigDecimal AV76TotMetPieMet ,
                                 GXSimpleCollection<Integer> AV86Col_BarCod ,
                                 GXSimpleCollection<String> AV87Col_BarCodPar ,
                                 GXSimpleCollection<Byte> AV88Col_BarCodReo ,
                                 GXSimpleCollection<String> AV97Col_MetPieCod ,
                                 GXSimpleCollection<String> AV96Col_MetTerCod ,
                                 int AV83ContVal ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1926I2 ();
      GRID_nCurrentRecord = 0 ;
      rf26I2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MantenimientoRollos_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV111Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidosclientesindetalle\\mantenimientorollos_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_METPIEID", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A10784MetPieId, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"METPIEID", GXutil.rtrim( A10784MetPieId));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vVCONTROL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV60VControl, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vVCONTROL", GXutil.rtrim( AV60VControl));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_METPIEOBS", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A4917MetPieObs, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"METPIEOBS", A4917MetPieObs);
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
      rf26I2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV111Pgmname = "PedidosClienteSinDetalle.MantenimientoRollos_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111Pgmname", AV111Pgmname);
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavVcontrol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavVcontrol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVcontrol_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavBarordlingrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarordlingrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarordlingrid_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavTotvaluemetpiekil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemetpiekil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetpiekil_Enabled), 5, 0), true);
      edtavTotvaluemetpiemet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemetpiemet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetpiemet_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf26I2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(61) ;
      /* Execute user event: Refresh */
      e1926I2 ();
      nGXsfl_61_idx = 1 ;
      sGXsfl_61_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_61_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_612( ) ;
      bGXsfl_61_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_612( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV113Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel ,
                                              AV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod ,
                                              AV115Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel ,
                                              AV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod ,
                                              AV116Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil ,
                                              AV117Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to ,
                                              AV118Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet ,
                                              AV119Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to ,
                                              Short.valueOf(AV120Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc) ,
                                              Short.valueOf(AV121Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to) ,
                                              AV122Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd ,
                                              AV123Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to ,
                                              Byte.valueOf(AV124Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest) ,
                                              Byte.valueOf(AV125Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to) ,
                                              AV127Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel ,
                                              AV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc ,
                                              AV129Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel ,
                                              AV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp ,
                                              A2809MetTerCod ,
                                              A2813MetPieCod ,
                                              A2814MetPieKil ,
                                              A2815MetPieMet ,
                                              Short.valueOf(A6635MetPieAnc) ,
                                              A4910MetPieMtD ,
                                              Byte.valueOf(A2816MetPieEst) ,
                                              A4913MetPieLoc ,
                                              A4915MetPieDCP ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV61Emprcod ,
                                              Integer.valueOf(AV62BarCod) ,
                                              Byte.valueOf(AV63BarCodReo) ,
                                              AV64BarCodPar ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = GXutil.padr( GXutil.rtrim( AV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod), 10, "%") ;
         lV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod), 9, "%") ;
         lV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = GXutil.padr( GXutil.rtrim( AV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc), 10, "%") ;
         lV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = GXutil.padr( GXutil.rtrim( AV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp), 1, "%") ;
         /* Using cursor H026I2 */
         pr_default.execute(0, new Object[] {AV61Emprcod, Integer.valueOf(AV62BarCod), Byte.valueOf(AV63BarCodReo), AV64BarCodPar, lV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod, AV113Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel, lV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod, AV115Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel, AV116Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil, AV117Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to, AV118Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet, AV119Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to, Short.valueOf(AV120Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc), Short.valueOf(AV121Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to), AV122Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd, AV123Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to, Byte.valueOf(AV124Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest), Byte.valueOf(AV125Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to), lV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc, AV127Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel, lV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp, AV129Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_61_idx = 1 ;
         sGXsfl_61_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_61_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_612( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H026I2_A396EmprCod[0] ;
            A4917MetPieObs = H026I2_A4917MetPieObs[0] ;
            A10784MetPieId = H026I2_A10784MetPieId[0] ;
            A4915MetPieDCP = H026I2_A4915MetPieDCP[0] ;
            A4913MetPieLoc = H026I2_A4913MetPieLoc[0] ;
            A2816MetPieEst = H026I2_A2816MetPieEst[0] ;
            A4910MetPieMtD = H026I2_A4910MetPieMtD[0] ;
            A6635MetPieAnc = H026I2_A6635MetPieAnc[0] ;
            A2815MetPieMet = H026I2_A2815MetPieMet[0] ;
            A2814MetPieKil = H026I2_A2814MetPieKil[0] ;
            A2813MetPieCod = H026I2_A2813MetPieCod[0] ;
            A130BarCodPar = H026I2_A130BarCodPar[0] ;
            A132BarCodReo = H026I2_A132BarCodReo[0] ;
            A129BarCod = H026I2_A129BarCod[0] ;
            A2809MetTerCod = H026I2_A2809MetTerCod[0] ;
            e2026I2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(61) ;
         wb26I0( ) ;
      }
      bGXsfl_61_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes26I2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMETPIEKIL", GXutil.ltrim( localUtil.ntoc( AV74TotMetPieKil, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEKIL", getSecureSignedToken( sPrefix, localUtil.format( AV74TotMetPieKil, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMETPIEMET", GXutil.ltrim( localUtil.ntoc( AV76TotMetPieMet, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEMET", getSecureSignedToken( sPrefix, localUtil.format( AV76TotMetPieMet, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_METPIEID"+"_"+sGXsfl_61_idx, getSecureSignedToken( sPrefix+sGXsfl_61_idx, GXutil.rtrim( localUtil.format( A10784MetPieId, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vVCONTROL"+"_"+sGXsfl_61_idx, getSecureSignedToken( sPrefix+sGXsfl_61_idx, GXutil.rtrim( localUtil.format( AV60VControl, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONTVAL", GXutil.ltrim( localUtil.ntoc( AV83ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV83ContVal), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_METPIEOBS"+"_"+sGXsfl_61_idx, getSecureSignedToken( sPrefix+sGXsfl_61_idx, GXutil.rtrim( localUtil.format( A4917MetPieObs, ""))));
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
      AV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = AV28TFMetTerCod ;
      AV113Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel = AV29TFMetTerCod_Sel ;
      AV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = AV36TFMetPieCod ;
      AV115Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel = AV37TFMetPieCod_Sel ;
      AV116Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil = AV38TFMetPieKil ;
      AV117Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to = AV39TFMetPieKil_To ;
      AV118Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet = AV40TFMetPieMet ;
      AV119Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to = AV41TFMetPieMet_To ;
      AV120Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc = AV42TFMetPieAnc ;
      AV121Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to = AV43TFMetPieAnc_To ;
      AV122Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd = AV44TFMetPieMtD ;
      AV123Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to = AV45TFMetPieMtD_To ;
      AV124Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest = AV46TFMetPieEst ;
      AV125Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to = AV47TFMetPieEst_To ;
      AV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = AV102TFMetPieLoc ;
      AV127Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel = AV103TFMetPieLoc_Sel ;
      AV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = AV104TFMetPieDCP ;
      AV129Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel = AV105TFMetPieDCP_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV113Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel ,
                                           AV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod ,
                                           AV115Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel ,
                                           AV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod ,
                                           AV116Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil ,
                                           AV117Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to ,
                                           AV118Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet ,
                                           AV119Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to ,
                                           Short.valueOf(AV120Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc) ,
                                           Short.valueOf(AV121Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to) ,
                                           AV122Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd ,
                                           AV123Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to ,
                                           Byte.valueOf(AV124Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest) ,
                                           Byte.valueOf(AV125Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to) ,
                                           AV127Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel ,
                                           AV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc ,
                                           AV129Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel ,
                                           AV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp ,
                                           A2809MetTerCod ,
                                           A2813MetPieCod ,
                                           A2814MetPieKil ,
                                           A2815MetPieMet ,
                                           Short.valueOf(A6635MetPieAnc) ,
                                           A4910MetPieMtD ,
                                           Byte.valueOf(A2816MetPieEst) ,
                                           A4913MetPieLoc ,
                                           A4915MetPieDCP ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV61Emprcod ,
                                           Integer.valueOf(AV62BarCod) ,
                                           Byte.valueOf(AV63BarCodReo) ,
                                           AV64BarCodPar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = GXutil.padr( GXutil.rtrim( AV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod), 10, "%") ;
      lV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod), 9, "%") ;
      lV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = GXutil.padr( GXutil.rtrim( AV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc), 10, "%") ;
      lV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = GXutil.padr( GXutil.rtrim( AV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp), 1, "%") ;
      /* Using cursor H026I3 */
      pr_default.execute(1, new Object[] {AV61Emprcod, Integer.valueOf(AV62BarCod), Byte.valueOf(AV63BarCodReo), AV64BarCodPar, lV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod, AV113Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel, lV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod, AV115Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel, AV116Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil, AV117Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to, AV118Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet, AV119Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to, Short.valueOf(AV120Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc), Short.valueOf(AV121Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to), AV122Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd, AV123Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to, Byte.valueOf(AV124Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest), Byte.valueOf(AV125Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to), lV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc, AV127Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel, lV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp, AV129Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel});
      GRID_nRecordCount = H026I3_AGRID_nRecordCount[0] ;
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
      AV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = AV28TFMetTerCod ;
      AV113Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel = AV29TFMetTerCod_Sel ;
      AV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = AV36TFMetPieCod ;
      AV115Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel = AV37TFMetPieCod_Sel ;
      AV116Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil = AV38TFMetPieKil ;
      AV117Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to = AV39TFMetPieKil_To ;
      AV118Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet = AV40TFMetPieMet ;
      AV119Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to = AV41TFMetPieMet_To ;
      AV120Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc = AV42TFMetPieAnc ;
      AV121Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to = AV43TFMetPieAnc_To ;
      AV122Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd = AV44TFMetPieMtD ;
      AV123Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to = AV45TFMetPieMtD_To ;
      AV124Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest = AV46TFMetPieEst ;
      AV125Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to = AV47TFMetPieEst_To ;
      AV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = AV102TFMetPieLoc ;
      AV127Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel = AV103TFMetPieLoc_Sel ;
      AV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = AV104TFMetPieDCP ;
      AV129Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel = AV105TFMetPieDCP_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV61Emprcod, AV62BarCod, AV63BarCodReo, AV64BarCodPar, AV106Ok, AV28TFMetTerCod, AV29TFMetTerCod_Sel, AV36TFMetPieCod, AV37TFMetPieCod_Sel, AV38TFMetPieKil, AV39TFMetPieKil_To, AV40TFMetPieMet, AV41TFMetPieMet_To, AV42TFMetPieAnc, AV43TFMetPieAnc_To, AV44TFMetPieMtD, AV45TFMetPieMtD_To, AV46TFMetPieEst, AV47TFMetPieEst_To, AV102TFMetPieLoc, AV103TFMetPieLoc_Sel, AV104TFMetPieDCP, AV105TFMetPieDCP_Sel, AV111Pgmname, AV12OrderedBy, AV13OrderedDsc, AV65Kms, AV66Maqcod, AV67Opecod, AV68Mensaje, AV72BarKgm, AV73BarMtr, AV78BarAncAca1, AV79BarRdt, AV80Barpes, AV81BarUnimed, AV74TotMetPieKil, AV76TotMetPieMet, AV86Col_BarCod, AV87Col_BarCodPar, AV88Col_BarCodReo, AV97Col_MetPieCod, AV96Col_MetTerCod, AV83ContVal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = AV28TFMetTerCod ;
      AV113Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel = AV29TFMetTerCod_Sel ;
      AV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = AV36TFMetPieCod ;
      AV115Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel = AV37TFMetPieCod_Sel ;
      AV116Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil = AV38TFMetPieKil ;
      AV117Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to = AV39TFMetPieKil_To ;
      AV118Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet = AV40TFMetPieMet ;
      AV119Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to = AV41TFMetPieMet_To ;
      AV120Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc = AV42TFMetPieAnc ;
      AV121Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to = AV43TFMetPieAnc_To ;
      AV122Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd = AV44TFMetPieMtD ;
      AV123Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to = AV45TFMetPieMtD_To ;
      AV124Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest = AV46TFMetPieEst ;
      AV125Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to = AV47TFMetPieEst_To ;
      AV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = AV102TFMetPieLoc ;
      AV127Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel = AV103TFMetPieLoc_Sel ;
      AV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = AV104TFMetPieDCP ;
      AV129Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel = AV105TFMetPieDCP_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV61Emprcod, AV62BarCod, AV63BarCodReo, AV64BarCodPar, AV106Ok, AV28TFMetTerCod, AV29TFMetTerCod_Sel, AV36TFMetPieCod, AV37TFMetPieCod_Sel, AV38TFMetPieKil, AV39TFMetPieKil_To, AV40TFMetPieMet, AV41TFMetPieMet_To, AV42TFMetPieAnc, AV43TFMetPieAnc_To, AV44TFMetPieMtD, AV45TFMetPieMtD_To, AV46TFMetPieEst, AV47TFMetPieEst_To, AV102TFMetPieLoc, AV103TFMetPieLoc_Sel, AV104TFMetPieDCP, AV105TFMetPieDCP_Sel, AV111Pgmname, AV12OrderedBy, AV13OrderedDsc, AV65Kms, AV66Maqcod, AV67Opecod, AV68Mensaje, AV72BarKgm, AV73BarMtr, AV78BarAncAca1, AV79BarRdt, AV80Barpes, AV81BarUnimed, AV74TotMetPieKil, AV76TotMetPieMet, AV86Col_BarCod, AV87Col_BarCodPar, AV88Col_BarCodReo, AV97Col_MetPieCod, AV96Col_MetTerCod, AV83ContVal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = AV28TFMetTerCod ;
      AV113Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel = AV29TFMetTerCod_Sel ;
      AV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = AV36TFMetPieCod ;
      AV115Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel = AV37TFMetPieCod_Sel ;
      AV116Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil = AV38TFMetPieKil ;
      AV117Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to = AV39TFMetPieKil_To ;
      AV118Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet = AV40TFMetPieMet ;
      AV119Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to = AV41TFMetPieMet_To ;
      AV120Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc = AV42TFMetPieAnc ;
      AV121Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to = AV43TFMetPieAnc_To ;
      AV122Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd = AV44TFMetPieMtD ;
      AV123Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to = AV45TFMetPieMtD_To ;
      AV124Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest = AV46TFMetPieEst ;
      AV125Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to = AV47TFMetPieEst_To ;
      AV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = AV102TFMetPieLoc ;
      AV127Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel = AV103TFMetPieLoc_Sel ;
      AV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = AV104TFMetPieDCP ;
      AV129Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel = AV105TFMetPieDCP_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV61Emprcod, AV62BarCod, AV63BarCodReo, AV64BarCodPar, AV106Ok, AV28TFMetTerCod, AV29TFMetTerCod_Sel, AV36TFMetPieCod, AV37TFMetPieCod_Sel, AV38TFMetPieKil, AV39TFMetPieKil_To, AV40TFMetPieMet, AV41TFMetPieMet_To, AV42TFMetPieAnc, AV43TFMetPieAnc_To, AV44TFMetPieMtD, AV45TFMetPieMtD_To, AV46TFMetPieEst, AV47TFMetPieEst_To, AV102TFMetPieLoc, AV103TFMetPieLoc_Sel, AV104TFMetPieDCP, AV105TFMetPieDCP_Sel, AV111Pgmname, AV12OrderedBy, AV13OrderedDsc, AV65Kms, AV66Maqcod, AV67Opecod, AV68Mensaje, AV72BarKgm, AV73BarMtr, AV78BarAncAca1, AV79BarRdt, AV80Barpes, AV81BarUnimed, AV74TotMetPieKil, AV76TotMetPieMet, AV86Col_BarCod, AV87Col_BarCodPar, AV88Col_BarCodReo, AV97Col_MetPieCod, AV96Col_MetTerCod, AV83ContVal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = AV28TFMetTerCod ;
      AV113Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel = AV29TFMetTerCod_Sel ;
      AV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = AV36TFMetPieCod ;
      AV115Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel = AV37TFMetPieCod_Sel ;
      AV116Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil = AV38TFMetPieKil ;
      AV117Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to = AV39TFMetPieKil_To ;
      AV118Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet = AV40TFMetPieMet ;
      AV119Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to = AV41TFMetPieMet_To ;
      AV120Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc = AV42TFMetPieAnc ;
      AV121Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to = AV43TFMetPieAnc_To ;
      AV122Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd = AV44TFMetPieMtD ;
      AV123Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to = AV45TFMetPieMtD_To ;
      AV124Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest = AV46TFMetPieEst ;
      AV125Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to = AV47TFMetPieEst_To ;
      AV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = AV102TFMetPieLoc ;
      AV127Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel = AV103TFMetPieLoc_Sel ;
      AV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = AV104TFMetPieDCP ;
      AV129Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel = AV105TFMetPieDCP_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV61Emprcod, AV62BarCod, AV63BarCodReo, AV64BarCodPar, AV106Ok, AV28TFMetTerCod, AV29TFMetTerCod_Sel, AV36TFMetPieCod, AV37TFMetPieCod_Sel, AV38TFMetPieKil, AV39TFMetPieKil_To, AV40TFMetPieMet, AV41TFMetPieMet_To, AV42TFMetPieAnc, AV43TFMetPieAnc_To, AV44TFMetPieMtD, AV45TFMetPieMtD_To, AV46TFMetPieEst, AV47TFMetPieEst_To, AV102TFMetPieLoc, AV103TFMetPieLoc_Sel, AV104TFMetPieDCP, AV105TFMetPieDCP_Sel, AV111Pgmname, AV12OrderedBy, AV13OrderedDsc, AV65Kms, AV66Maqcod, AV67Opecod, AV68Mensaje, AV72BarKgm, AV73BarMtr, AV78BarAncAca1, AV79BarRdt, AV80Barpes, AV81BarUnimed, AV74TotMetPieKil, AV76TotMetPieMet, AV86Col_BarCod, AV87Col_BarCodPar, AV88Col_BarCodReo, AV97Col_MetPieCod, AV96Col_MetTerCod, AV83ContVal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = AV28TFMetTerCod ;
      AV113Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel = AV29TFMetTerCod_Sel ;
      AV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = AV36TFMetPieCod ;
      AV115Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel = AV37TFMetPieCod_Sel ;
      AV116Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil = AV38TFMetPieKil ;
      AV117Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to = AV39TFMetPieKil_To ;
      AV118Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet = AV40TFMetPieMet ;
      AV119Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to = AV41TFMetPieMet_To ;
      AV120Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc = AV42TFMetPieAnc ;
      AV121Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to = AV43TFMetPieAnc_To ;
      AV122Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd = AV44TFMetPieMtD ;
      AV123Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to = AV45TFMetPieMtD_To ;
      AV124Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest = AV46TFMetPieEst ;
      AV125Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to = AV47TFMetPieEst_To ;
      AV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = AV102TFMetPieLoc ;
      AV127Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel = AV103TFMetPieLoc_Sel ;
      AV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = AV104TFMetPieDCP ;
      AV129Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel = AV105TFMetPieDCP_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV61Emprcod, AV62BarCod, AV63BarCodReo, AV64BarCodPar, AV106Ok, AV28TFMetTerCod, AV29TFMetTerCod_Sel, AV36TFMetPieCod, AV37TFMetPieCod_Sel, AV38TFMetPieKil, AV39TFMetPieKil_To, AV40TFMetPieMet, AV41TFMetPieMet_To, AV42TFMetPieAnc, AV43TFMetPieAnc_To, AV44TFMetPieMtD, AV45TFMetPieMtD_To, AV46TFMetPieEst, AV47TFMetPieEst_To, AV102TFMetPieLoc, AV103TFMetPieLoc_Sel, AV104TFMetPieDCP, AV105TFMetPieDCP_Sel, AV111Pgmname, AV12OrderedBy, AV13OrderedDsc, AV65Kms, AV66Maqcod, AV67Opecod, AV68Mensaje, AV72BarKgm, AV73BarMtr, AV78BarAncAca1, AV79BarRdt, AV80Barpes, AV81BarUnimed, AV74TotMetPieKil, AV76TotMetPieMet, AV86Col_BarCod, AV87Col_BarCodPar, AV88Col_BarCodReo, AV97Col_MetPieCod, AV96Col_MetTerCod, AV83ContVal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV111Pgmname = "PedidosClienteSinDetalle.MantenimientoRollos_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111Pgmname", AV111Pgmname);
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavVcontrol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavVcontrol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVcontrol_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavBarordlingrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarordlingrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarordlingrid_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavTotvaluemetpiekil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemetpiekil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetpiekil_Enabled), 5, 0), true);
      edtavTotvaluemetpiemet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemetpiemet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetpiemet_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup26I0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1826I2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV54DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_METTERCOD"), AV96Col_MetTerCod);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_METPIECOD"), AV97Col_MetPieCod);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_BARCODREO"), AV88Col_BarCodReo);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_BARCODPAR"), AV87Col_BarCodPar);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_BARCOD"), AV86Col_BarCod);
         /* Read saved values. */
         nRC_GXsfl_61 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_61"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV56GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV57GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV61Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV61Emprcod") ;
         wcpOAV62BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV62BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV63BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV63BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV64BarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV64BarCodPar") ;
         wcpOAV65Kms = httpContext.cgiGet( sPrefix+"wcpOAV65Kms") ;
         wcpOAV66Maqcod = httpContext.cgiGet( sPrefix+"wcpOAV66Maqcod") ;
         wcpOAV67Opecod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV67Opecod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV68Mensaje = httpContext.cgiGet( sPrefix+"wcpOAV68Mensaje") ;
         wcpOAV72BarKgm = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV72BarKgm")) ;
         wcpOAV73BarMtr = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV73BarMtr")) ;
         wcpOAV78BarAncAca1 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV78BarAncAca1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV79BarRdt = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV79BarRdt")) ;
         wcpOAV80Barpes = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV80Barpes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV81BarUnimed = httpContext.cgiGet( sPrefix+"wcpOAV81BarUnimed") ;
         AV98i = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvelop_confirmpanel_eliminarpiezas_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARPIEZAS_Title") ;
         Dvelop_confirmpanel_eliminarpiezas_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARPIEZAS_Confirmationtext") ;
         Dvelop_confirmpanel_eliminarpiezas_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARPIEZAS_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminarpiezas_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARPIEZAS_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminarpiezas_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARPIEZAS_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminarpiezas_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARPIEZAS_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminarpiezas_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARPIEZAS_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Dvelop_confirmpanel_eliminarpiezas_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARPIEZAS_Result") ;
         /* Read variables values. */
         AV75TotValueMetPieKil = httpContext.cgiGet( edtavTotvaluemetpiekil_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TotValueMetPieKil", AV75TotValueMetPieKil);
         AV77TotValueMetPieMet = httpContext.cgiGet( edtavTotvaluemetpiemet_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TotValueMetPieMet", AV77TotValueMetPieMet);
         AV111Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111Pgmname", AV111Pgmname);
         AV106Ok = httpContext.cgiGet( edtavOk_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106Ok", AV106Ok);
         /* Read subfile selected row values. */
         nGXsfl_61_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_61_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_61_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_612( ) ;
         if ( nGXsfl_61_idx > 0 )
         {
            cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
            cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
            AV82GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82GridActionGroup1), 4, 0));
            AV93Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV93Seleccionar);
            A2809MetTerCod = httpContext.cgiGet( edtMetTerCod_Internalname) ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            A2813MetPieCod = httpContext.cgiGet( edtMetPieCod_Internalname) ;
            A2814MetPieKil = localUtil.ctond( httpContext.cgiGet( edtMetPieKil_Internalname)) ;
            A2815MetPieMet = localUtil.ctond( httpContext.cgiGet( edtMetPieMet_Internalname)) ;
            A6635MetPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4910MetPieMtD = localUtil.ctond( httpContext.cgiGet( edtMetPieMtD_Internalname)) ;
            A2816MetPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtMetPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV60VControl = httpContext.cgiGet( edtavVcontrol_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavVcontrol_Internalname, AV60VControl);
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vVCONTROL"+"_"+sGXsfl_61_idx, getSecureSignedToken( sPrefix+sGXsfl_61_idx, GXutil.rtrim( localUtil.format( AV60VControl, ""))));
            A4913MetPieLoc = httpContext.cgiGet( edtMetPieLoc_Internalname) ;
            A4915MetPieDCP = GXutil.upper( httpContext.cgiGet( edtMetPieDCP_Internalname)) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarordlingrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarordlingrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARORDLINGRID");
               GX_FocusControl = edtavBarordlingrid_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV59barOrdlinGRID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarordlingrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59barOrdlinGRID), 4, 0));
            }
            else
            {
               AV59barOrdlinGRID = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarordlingrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarordlingrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59barOrdlinGRID), 4, 0));
            }
            A10784MetPieId = httpContext.cgiGet( edtMetPieId_Internalname) ;
            A4917MetPieObs = httpContext.cgiGet( edtMetPieObs_Internalname) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MantenimientoRollos_WC");
         AV111Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111Pgmname", AV111Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV111Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("pedidosclientesindetalle\\mantenimientorollos_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1826I2 ();
      if (returnInSub) return;
   }

   public void e1826I2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV69Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mantenimientorollos_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV69Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Station", AV69Station);
      GXv_char2[0] = AV61Emprcod ;
      GXv_char3[0] = AV70EmprNom ;
      GXv_char4[0] = AV71UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV69Station, GXv_char2, GXv_char3, GXv_char4) ;
      mantenimientorollos_wc_impl.this.AV61Emprcod = GXv_char2[0] ;
      mantenimientorollos_wc_impl.this.AV70EmprNom = GXv_char3[0] ;
      mantenimientorollos_wc_impl.this.AV71UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Emprcod", AV61Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71UsurCod", AV71UsurCod);
      edtavOk_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOk_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOk_Visible), 5, 0), true);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV54DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV54DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = (byte)(AV91Moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV61Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      mantenimientorollos_wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV91Moda21 = GXt_int7 ;
      GXt_int7 = (byte)(AV94Tinamar) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV61Emprcod, httpContext.getMessage( "TINAMA", ""), GXv_int8) ;
      mantenimientorollos_wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV94Tinamar = GXt_int7 ;
      GXt_int7 = (byte)(AV90Erfoc) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV61Emprcod, httpContext.getMessage( "ERFOC", ""), GXv_int8) ;
      mantenimientorollos_wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV90Erfoc = GXt_int7 ;
      GXt_int9 = AV83ContVal ;
      GXv_int10[0] = GXt_int9 ;
      new app.pbuscon(remoteHandle, context).execute( AV61Emprcod, httpContext.getMessage( "VERPZC", ""), GXv_int10) ;
      mantenimientorollos_wc_impl.this.GXt_int9 = GXv_int10[0] ;
      AV83ContVal = GXt_int9 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83ContVal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83ContVal), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV83ContVal), "ZZZZZZZ9")));
   }

   public void e1926I2( )
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
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S152 ();
      if (returnInSub) return;
      AV56GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GridCurrentPage), 10, 0));
      AV57GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S162 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV106Ok, httpContext.getMessage( "S", "")) == 0 )
      {
         this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_ELIMINARPIEZASContainer", "Confirm", "", new Object[] {});
      }
      AV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = AV28TFMetTerCod ;
      AV113Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel = AV29TFMetTerCod_Sel ;
      AV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = AV36TFMetPieCod ;
      AV115Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel = AV37TFMetPieCod_Sel ;
      AV116Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil = AV38TFMetPieKil ;
      AV117Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to = AV39TFMetPieKil_To ;
      AV118Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet = AV40TFMetPieMet ;
      AV119Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to = AV41TFMetPieMet_To ;
      AV120Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc = AV42TFMetPieAnc ;
      AV121Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to = AV43TFMetPieAnc_To ;
      AV122Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd = AV44TFMetPieMtD ;
      AV123Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to = AV45TFMetPieMtD_To ;
      AV124Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest = AV46TFMetPieEst ;
      AV125Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to = AV47TFMetPieEst_To ;
      AV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = AV102TFMetPieLoc ;
      AV127Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel = AV103TFMetPieLoc_Sel ;
      AV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = AV104TFMetPieDCP ;
      AV129Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel = AV105TFMetPieDCP_Sel ;
      /*  Sending Event outputs  */
   }

   public void e1126I2( )
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
         AV55PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV55PageToGo) ;
      }
   }

   public void e1226I2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1326I2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetTerCod") == 0 )
         {
            AV28TFMetTerCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFMetTerCod", AV28TFMetTerCod);
            AV29TFMetTerCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFMetTerCod_Sel", AV29TFMetTerCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieCod") == 0 )
         {
            AV36TFMetPieCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFMetPieCod", AV36TFMetPieCod);
            AV37TFMetPieCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFMetPieCod_Sel", AV37TFMetPieCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieKil") == 0 )
         {
            AV38TFMetPieKil = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFMetPieKil", GXutil.ltrimstr( AV38TFMetPieKil, 9, 2));
            AV39TFMetPieKil_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFMetPieKil_To", GXutil.ltrimstr( AV39TFMetPieKil_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieMet") == 0 )
         {
            AV40TFMetPieMet = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFMetPieMet", GXutil.ltrimstr( AV40TFMetPieMet, 9, 2));
            AV41TFMetPieMet_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFMetPieMet_To", GXutil.ltrimstr( AV41TFMetPieMet_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieAnc") == 0 )
         {
            AV42TFMetPieAnc = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFMetPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFMetPieAnc), 3, 0));
            AV43TFMetPieAnc_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFMetPieAnc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFMetPieAnc_To), 3, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieMtD") == 0 )
         {
            AV44TFMetPieMtD = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFMetPieMtD", GXutil.ltrimstr( AV44TFMetPieMtD, 8, 2));
            AV45TFMetPieMtD_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFMetPieMtD_To", GXutil.ltrimstr( AV45TFMetPieMtD_To, 8, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieEst") == 0 )
         {
            AV46TFMetPieEst = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFMetPieEst", GXutil.str( AV46TFMetPieEst, 1, 0));
            AV47TFMetPieEst_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFMetPieEst_To", GXutil.str( AV47TFMetPieEst_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieLoc") == 0 )
         {
            AV102TFMetPieLoc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFMetPieLoc", AV102TFMetPieLoc);
            AV103TFMetPieLoc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103TFMetPieLoc_Sel", AV103TFMetPieLoc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieDCP") == 0 )
         {
            AV104TFMetPieDCP = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104TFMetPieDCP", AV104TFMetPieDCP);
            AV105TFMetPieDCP_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105TFMetPieDCP_Sel", AV105TFMetPieDCP_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e2026I2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactiongroup1.removeAllItems();
      cmbavGridactiongroup1.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Modificar Mts", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactiongroup1.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Imprimir Pieza", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
      AV60VControl = GXutil.substring( A4917MetPieObs, 1, 30) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavVcontrol_Internalname, AV60VControl);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vVCONTROL"+"_"+sGXsfl_61_idx, getSecureSignedToken( sPrefix+sGXsfl_61_idx, GXutil.rtrim( localUtil.format( AV60VControl, ""))));
      AV59barOrdlinGRID = (short)(GXutil.lval( GXutil.substring( A4917MetPieObs, 18, 8))) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarordlingrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59barOrdlinGRID), 4, 0));
      AV93Seleccionar = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV93Seleccionar);
      AV98i = (short)(1) ;
      while ( AV98i <= AV86Col_BarCod.size() )
      {
         if ( ( ((Number) AV86Col_BarCod.elementAt(-1+AV98i)).intValue() == A129BarCod ) && ( GXutil.strcmp((String)AV87Col_BarCodPar.elementAt(-1+AV98i), A130BarCodPar) == 0 ) && ( ((Number) AV88Col_BarCodReo.elementAt(-1+AV98i)).byteValue() == A132BarCodReo ) && ( GXutil.strcmp((String)AV97Col_MetPieCod.elementAt(-1+AV98i), A2813MetPieCod) == 0 ) && ( GXutil.strcmp((String)AV96Col_MetTerCod.elementAt(-1+AV98i), A2809MetTerCod) == 0 ) )
         {
            AV93Seleccionar = true ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV93Seleccionar);
            if (true) break;
         }
         AV98i = (short)(AV98i+1) ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(61) ;
      }
      sendrow_612( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_61_Refreshing )
      {
         httpContext.doAjaxLoad(61, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV82GridActionGroup1, 4, 0)) );
   }

   public void e2126I2( )
   {
      /* Gridactiongroup1_Click Routine */
      returnInSub = false ;
      if ( AV82GridActionGroup1 == 1 )
      {
         /* Execute user subroutine: 'DO MODIFICARMETROS' */
         S172 ();
         if (returnInSub) return;
      }
      else if ( AV82GridActionGroup1 == 2 )
      {
         /* Execute user subroutine: 'DO IMPRIMIRPIEZA' */
         S182 ();
         if (returnInSub) return;
      }
      AV82GridActionGroup1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82GridActionGroup1), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV82GridActionGroup1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), true);
   }

   public void e1526I2( )
   {
      /* 'DoEliminarPiezas' Routine */
      returnInSub = false ;
      if ( AV86Col_BarCod.size() == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO hay ninguna pieza seleccionada", ""));
      }
      else
      {
         AV106Ok = "N" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106Ok", AV106Ok);
         httpContext.popup(formatLink("app.albaranes.pwdgrl", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV83ContVal,8,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"UsurPwd1","PwdBo"}) , new Object[] {"AV106Ok"});
         httpContext.doAjaxRefreshCmp(sPrefix);
         if ( 1 == 2 )
         {
            this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_ELIMINARPIEZASContainer", "Confirm", "", new Object[] {});
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1426I2( )
   {
      /* Dvelop_confirmpanel_eliminarpiezas_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminarpiezas_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARPIEZAS' */
         S192 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV86Col_BarCod", AV86Col_BarCod);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV87Col_BarCodPar", AV87Col_BarCodPar);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV88Col_BarCodReo", AV88Col_BarCodReo);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV97Col_MetPieCod", AV97Col_MetPieCod);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV96Col_MetTerCod", AV96Col_MetTerCod);
   }

   public void e1626I2( )
   {
      /* 'DoAltaPieza' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.pedidosclientesindetalle.mantenimientorollos_ins_pieza", new String[] {GXutil.URLEncode(GXutil.rtrim(AV61Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV62BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV63BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV64BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(1,9,0))}, new String[] {"emprcod","BarCod","BarCodReo","BarCodPar","Flag"}) , new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
   }

   public void e1726I2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      GXv_int12[0] = AV108silineas ;
      new app.produccion.packinglist_prc(remoteHandle, context).execute( AV61Emprcod, AV62BarCod, AV63BarCodReo, AV64BarCodPar, GXv_char4, GXv_char3, GXv_int12) ;
      mantenimientorollos_wc_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      mantenimientorollos_wc_impl.this.AV17ErrorMessage = GXv_char3[0] ;
      mantenimientorollos_wc_impl.this.AV108silineas = GXv_int12[0] ;
      if ( GXutil.strcmp(AV16ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV16ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV17ErrorMessage);
      }
      if ( 1 == 0 )
      {
         GXv_char4[0] = AV16ExcelFilename ;
         GXv_char3[0] = AV17ErrorMessage ;
         new app.pedidosclientesindetalle.mantenimientorollos_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
         mantenimientorollos_wc_impl.this.AV16ExcelFilename = GXv_char4[0] ;
         mantenimientorollos_wc_impl.this.AV17ErrorMessage = GXv_char3[0] ;
         if ( GXutil.strcmp(AV16ExcelFilename, "") != 0 )
         {
            callWebObject(formatLink(AV16ExcelFilename, new String[] {}, new String[] {}) );
            httpContext.wjLocDisableFrm = (byte)(0) ;
         }
         else
         {
            httpContext.GX_msglist.addItem(AV17ErrorMessage);
         }
      }
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S172( )
   {
      /* 'DO MODIFICARMETROS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.pedidosclientesindetalle.mantenimientorollos__upd_mts", new String[] {GXutil.URLEncode(GXutil.rtrim(AV61Emprcod)),GXutil.URLEncode(GXutil.rtrim(A2809MetTerCod)),GXutil.URLEncode(GXutil.ltrimstr(AV62BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV63BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV64BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A2813MetPieCod)),GXutil.URLEncode(DecimalUtil.decToString(A2815MetPieMet)),GXutil.URLEncode(DecimalUtil.decToString(A2814MetPieKil)),GXutil.URLEncode(GXutil.ltrimstr(A6635MetPieAnc,3,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV81BarUnimed)),GXutil.URLEncode(GXutil.ltrimstr(AV80Barpes,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV79BarRdt)),GXutil.URLEncode(GXutil.rtrim(A10784MetPieId)),GXutil.URLEncode(DecimalUtil.decToString(A4910MetPieMtD)),GXutil.URLEncode(GXutil.rtrim(AV65Kms))}, new String[] {"EmprCod","METTERCOD","BarCod","BarCodreo","BarCodpar","METPIECOD","METPIEMET","MetPieKil","MetPieAnc","BarTrocal1","BarUnimed","Barpes","BarRdt","IdPz","grm2","Kms"}) , new Object[] {"AV61Emprcod","A2809MetTerCod","AV62BarCod","AV63BarCodReo","AV64BarCodPar","A2813MetPieCod","AV65Kms"});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S182( )
   {
      /* 'DO IMPRIMIRPIEZA' Routine */
      returnInSub = false ;
      AV66Maqcod = GXutil.substring( AV60VControl, 4, 6) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Maqcod", AV66Maqcod);
      httpContext.popup(formatLink("app.retim21", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV62BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV63BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV64BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A2813MetPieCod)),GXutil.URLEncode(DecimalUtil.decToString(A2814MetPieKil)),GXutil.URLEncode(DecimalUtil.decToString(A2815MetPieMet)),GXutil.URLEncode(GXutil.ltrimstr(A6635MetPieAnc,3,0)),GXutil.URLEncode(DecimalUtil.decToString(A4910MetPieMtD)),GXutil.URLEncode(GXutil.rtrim(AV66Maqcod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "PRN", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","Metpiecod","Metpiekil","Metpiemet","MetPieAnc","MetPieMtd","MaqCod","Opecod","Output"}) , new Object[] {"A396EmprCod","AV62BarCod","AV63BarCodReo","AV64BarCodPar","A2813MetPieCod","A2814MetPieKil","A2815MetPieMet","A6635MetPieAnc","A4910MetPieMtD","AV66Maqcod","",""});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S192( )
   {
      /* 'DO ACTION ELIMINARPIEZAS' Routine */
      returnInSub = false ;
      AV98i = (short)(1) ;
      while ( AV98i <= AV86Col_BarCod.size() )
      {
         AV99MetPiecod = (String)AV97Col_MetPieCod.elementAt(-1+AV98i) ;
         AV100MetTerCod = (String)AV96Col_MetTerCod.elementAt(-1+AV98i) ;
         AV101MetPieObs = A4917MetPieObs ;
         AV92Piezactrl = AV99MetPiecod ;
         GXv_char4[0] = AV61Emprcod ;
         GXv_char3[0] = AV100MetTerCod ;
         GXv_int10[0] = AV62BarCod ;
         GXv_int8[0] = AV63BarCodReo ;
         GXv_char2[0] = AV64BarCodPar ;
         GXv_char13[0] = AV99MetPiecod ;
         new app.pcoshde(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int10, GXv_int8, GXv_char2, GXv_char13) ;
         mantenimientorollos_wc_impl.this.AV61Emprcod = GXv_char4[0] ;
         mantenimientorollos_wc_impl.this.AV100MetTerCod = GXv_char3[0] ;
         mantenimientorollos_wc_impl.this.AV62BarCod = GXv_int10[0] ;
         mantenimientorollos_wc_impl.this.AV63BarCodReo = GXv_int8[0] ;
         mantenimientorollos_wc_impl.this.AV64BarCodPar = GXv_char2[0] ;
         mantenimientorollos_wc_impl.this.AV99MetPiecod = GXv_char13[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Emprcod", AV61Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarCodReo", GXutil.str( AV63BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarCodPar", AV64BarCodPar);
         GXv_char13[0] = AV61Emprcod ;
         GXv_int10[0] = AV62BarCod ;
         GXv_int8[0] = AV63BarCodReo ;
         GXv_char4[0] = AV64BarCodPar ;
         GXv_int12[0] = AV59barOrdlinGRID ;
         new app.pautkgmtpz(remoteHandle, context).execute( GXv_char13, GXv_int10, GXv_int8, GXv_char4, GXv_int12) ;
         mantenimientorollos_wc_impl.this.AV61Emprcod = GXv_char13[0] ;
         mantenimientorollos_wc_impl.this.AV62BarCod = GXv_int10[0] ;
         mantenimientorollos_wc_impl.this.AV63BarCodReo = GXv_int8[0] ;
         mantenimientorollos_wc_impl.this.AV64BarCodPar = GXv_char4[0] ;
         mantenimientorollos_wc_impl.this.AV59barOrdlinGRID = GXv_int12[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Emprcod", AV61Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarCodReo", GXutil.str( AV63BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarCodPar", AV64BarCodPar);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarordlingrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59barOrdlinGRID), 4, 0));
         AV98i = (short)(AV98i+1) ;
      }
      GXv_char13[0] = AV61Emprcod ;
      GXv_char4[0] = AV100MetTerCod ;
      GXv_int10[0] = AV62BarCod ;
      GXv_int8[0] = AV63BarCodReo ;
      GXv_char3[0] = AV64BarCodPar ;
      GXv_char2[0] = AV101MetPieObs ;
      GXv_char14[0] = AV71UsurCod ;
      GXv_char15[0] = AV69Station ;
      new app.pnumpzsb(remoteHandle, context).execute( GXv_char13, GXv_char4, GXv_int10, GXv_int8, GXv_char3, GXv_char2, GXv_char14, GXv_char15) ;
      mantenimientorollos_wc_impl.this.AV61Emprcod = GXv_char13[0] ;
      mantenimientorollos_wc_impl.this.AV100MetTerCod = GXv_char4[0] ;
      mantenimientorollos_wc_impl.this.AV62BarCod = GXv_int10[0] ;
      mantenimientorollos_wc_impl.this.AV63BarCodReo = GXv_int8[0] ;
      mantenimientorollos_wc_impl.this.AV64BarCodPar = GXv_char3[0] ;
      mantenimientorollos_wc_impl.this.AV101MetPieObs = GXv_char2[0] ;
      mantenimientorollos_wc_impl.this.AV71UsurCod = GXv_char14[0] ;
      mantenimientorollos_wc_impl.this.AV69Station = GXv_char15[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Emprcod", AV61Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarCodReo", GXutil.str( AV63BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarCodPar", AV64BarCodPar);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71UsurCod", AV71UsurCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Station", AV69Station);
      GXv_char15[0] = AV61Emprcod ;
      GXv_char14[0] = AV100MetTerCod ;
      GXv_int10[0] = AV62BarCod ;
      GXv_int8[0] = AV63BarCodReo ;
      GXv_char13[0] = AV64BarCodPar ;
      GXv_char4[0] = AV101MetPieObs ;
      GXv_char3[0] = AV92Piezactrl ;
      GXv_int16[0] = (byte)(AV95UltimaPieza) ;
      new app.pnumpzsa(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_int10, GXv_int8, GXv_char13, GXv_char4, GXv_char3, GXv_int16) ;
      mantenimientorollos_wc_impl.this.AV61Emprcod = GXv_char15[0] ;
      mantenimientorollos_wc_impl.this.AV100MetTerCod = GXv_char14[0] ;
      mantenimientorollos_wc_impl.this.AV62BarCod = GXv_int10[0] ;
      mantenimientorollos_wc_impl.this.AV63BarCodReo = GXv_int8[0] ;
      mantenimientorollos_wc_impl.this.AV64BarCodPar = GXv_char13[0] ;
      mantenimientorollos_wc_impl.this.AV101MetPieObs = GXv_char4[0] ;
      mantenimientorollos_wc_impl.this.AV92Piezactrl = GXv_char3[0] ;
      mantenimientorollos_wc_impl.this.AV95UltimaPieza = GXv_int16[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Emprcod", AV61Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarCodReo", GXutil.str( AV63BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarCodPar", AV64BarCodPar);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95UltimaPieza", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95UltimaPieza), 4, 0));
      if ( AV95UltimaPieza == 2 )
      {
         httpContext.popup(formatLink("app.pedidosclientesindetalle.mantenimientorollos_dlt_moda21", new String[] {GXutil.URLEncode(GXutil.rtrim(AV61Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV100MetTerCod)),GXutil.URLEncode(GXutil.ltrimstr(AV62BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV63BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV64BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV101MetPieObs)),GXutil.URLEncode(GXutil.rtrim(AV66Maqcod)),GXutil.URLEncode(GXutil.ltrimstr(AV67Opecod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV92Piezactrl)),GXutil.URLEncode(GXutil.rtrim(AV71UsurCod)),GXutil.URLEncode(GXutil.rtrim(AV69Station))}, new String[] {"Emprcod","MetTerCod","BarCod","BarCodReo","BarCodPar","MetPieObs","MaqCod","OpeCod","Piezactrl","UsurCod","Station"}) , new Object[] {"AV61Emprcod","AV100MetTerCod","AV62BarCod","AV63BarCodReo","AV64BarCodPar","AV101MetPieObs","AV66Maqcod","AV67Opecod","AV92Piezactrl","AV71UsurCod","AV69Station"});
      }
      AV106Ok = "N" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106Ok", AV106Ok);
      AV86Col_BarCod.clear();
      AV87Col_BarCodPar.clear();
      AV88Col_BarCodReo.clear();
      AV97Col_MetPieCod.clear();
      AV96Col_MetTerCod.clear();
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV111Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV111Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV111Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV130GXV1 = 1 ;
      while ( AV130GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV130GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETTERCOD") == 0 )
         {
            AV28TFMetTerCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFMetTerCod", AV28TFMetTerCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETTERCOD_SEL") == 0 )
         {
            AV29TFMetTerCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFMetTerCod_Sel", AV29TFMetTerCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECOD") == 0 )
         {
            AV36TFMetPieCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFMetPieCod", AV36TFMetPieCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECOD_SEL") == 0 )
         {
            AV37TFMetPieCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFMetPieCod_Sel", AV37TFMetPieCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEKIL") == 0 )
         {
            AV38TFMetPieKil = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFMetPieKil", GXutil.ltrimstr( AV38TFMetPieKil, 9, 2));
            AV39TFMetPieKil_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFMetPieKil_To", GXutil.ltrimstr( AV39TFMetPieKil_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEMET") == 0 )
         {
            AV40TFMetPieMet = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFMetPieMet", GXutil.ltrimstr( AV40TFMetPieMet, 9, 2));
            AV41TFMetPieMet_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFMetPieMet_To", GXutil.ltrimstr( AV41TFMetPieMet_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEANC") == 0 )
         {
            AV42TFMetPieAnc = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFMetPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFMetPieAnc), 3, 0));
            AV43TFMetPieAnc_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFMetPieAnc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFMetPieAnc_To), 3, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEMTD") == 0 )
         {
            AV44TFMetPieMtD = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFMetPieMtD", GXutil.ltrimstr( AV44TFMetPieMtD, 8, 2));
            AV45TFMetPieMtD_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFMetPieMtD_To", GXutil.ltrimstr( AV45TFMetPieMtD_To, 8, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEEST") == 0 )
         {
            AV46TFMetPieEst = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFMetPieEst", GXutil.str( AV46TFMetPieEst, 1, 0));
            AV47TFMetPieEst_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFMetPieEst_To", GXutil.str( AV47TFMetPieEst_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIELOC") == 0 )
         {
            AV102TFMetPieLoc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFMetPieLoc", AV102TFMetPieLoc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIELOC_SEL") == 0 )
         {
            AV103TFMetPieLoc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103TFMetPieLoc_Sel", AV103TFMetPieLoc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDCP") == 0 )
         {
            AV104TFMetPieDCP = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104TFMetPieDCP", AV104TFMetPieDCP);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDCP_SEL") == 0 )
         {
            AV105TFMetPieDCP_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105TFMetPieDCP_Sel", AV105TFMetPieDCP_Sel);
         }
         AV130GXV1 = (int)(AV130GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char15[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFMetTerCod_Sel)==0), AV29TFMetTerCod_Sel, GXv_char15) ;
      mantenimientorollos_wc_impl.this.GXt_char1 = GXv_char15[0] ;
      GXt_char17 = "" ;
      GXv_char14[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFMetPieCod_Sel)==0), AV37TFMetPieCod_Sel, GXv_char14) ;
      mantenimientorollos_wc_impl.this.GXt_char17 = GXv_char14[0] ;
      GXt_char18 = "" ;
      GXv_char13[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV103TFMetPieLoc_Sel)==0), AV103TFMetPieLoc_Sel, GXv_char13) ;
      mantenimientorollos_wc_impl.this.GXt_char18 = GXv_char13[0] ;
      GXt_char19 = "" ;
      GXv_char4[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV105TFMetPieDCP_Sel)==0), AV105TFMetPieDCP_Sel, GXv_char4) ;
      mantenimientorollos_wc_impl.this.GXt_char19 = GXv_char4[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char17+"||||||"+GXt_char18+"|"+GXt_char19 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char19 = "" ;
      GXv_char15[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFMetTerCod)==0), AV28TFMetTerCod, GXv_char15) ;
      mantenimientorollos_wc_impl.this.GXt_char19 = GXv_char15[0] ;
      GXt_char18 = "" ;
      GXv_char14[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFMetPieCod)==0), AV36TFMetPieCod, GXv_char14) ;
      mantenimientorollos_wc_impl.this.GXt_char18 = GXv_char14[0] ;
      GXt_char17 = "" ;
      GXv_char13[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV102TFMetPieLoc)==0), AV102TFMetPieLoc, GXv_char13) ;
      mantenimientorollos_wc_impl.this.GXt_char17 = GXv_char13[0] ;
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV104TFMetPieDCP)==0), AV104TFMetPieDCP, GXv_char4) ;
      mantenimientorollos_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = GXt_char19+"|"+GXt_char18+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFMetPieKil)==0) ? "" : GXutil.str( AV38TFMetPieKil, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFMetPieMet)==0) ? "" : GXutil.str( AV40TFMetPieMet, 9, 2))+"|"+((0==AV42TFMetPieAnc) ? "" : GXutil.str( AV42TFMetPieAnc, 3, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFMetPieMtD)==0) ? "" : GXutil.str( AV44TFMetPieMtD, 8, 2))+"|"+((0==AV46TFMetPieEst) ? "" : GXutil.str( AV46TFMetPieEst, 1, 0))+"|"+GXt_char17+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFMetPieKil_To)==0) ? "" : GXutil.str( AV39TFMetPieKil_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFMetPieMet_To)==0) ? "" : GXutil.str( AV41TFMetPieMet_To, 9, 2))+"|"+((0==AV43TFMetPieAnc_To) ? "" : GXutil.str( AV43TFMetPieAnc_To, 3, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFMetPieMtD_To)==0) ? "" : GXutil.str( AV45TFMetPieMtD_To, 8, 2))+"|"+((0==AV47TFMetPieEst_To) ? "" : GXutil.str( AV47TFMetPieEst_To, 1, 0))+"||" ;
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
      AV10GridState.fromxml(AV22Session.getValue(AV111Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFMETTERCOD", "", !(GXutil.strcmp("", AV28TFMetTerCod)==0), (short)(0), AV28TFMetTerCod, "", !(GXutil.strcmp("", AV29TFMetTerCod_Sel)==0), AV29TFMetTerCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFMETPIECOD", "", !(GXutil.strcmp("", AV36TFMetPieCod)==0), (short)(0), AV36TFMetPieCod, "", !(GXutil.strcmp("", AV37TFMetPieCod_Sel)==0), AV37TFMetPieCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFMETPIEKIL", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFMetPieKil)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFMetPieKil_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV38TFMetPieKil, 9, 2)), GXutil.trim( GXutil.str( AV39TFMetPieKil_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFMETPIEMET", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFMetPieMet)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFMetPieMet_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV40TFMetPieMet, 9, 2)), GXutil.trim( GXutil.str( AV41TFMetPieMet_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFMETPIEANC", "", !((0==AV42TFMetPieAnc)&&(0==AV43TFMetPieAnc_To)), (short)(0), GXutil.trim( GXutil.str( AV42TFMetPieAnc, 3, 0)), GXutil.trim( GXutil.str( AV43TFMetPieAnc_To, 3, 0))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFMETPIEMTD", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFMetPieMtD)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFMetPieMtD_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV44TFMetPieMtD, 8, 2)), GXutil.trim( GXutil.str( AV45TFMetPieMtD_To, 8, 2))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFMETPIEEST", "", !((0==AV46TFMetPieEst)&&(0==AV47TFMetPieEst_To)), (short)(0), GXutil.trim( GXutil.str( AV46TFMetPieEst, 1, 0)), GXutil.trim( GXutil.str( AV47TFMetPieEst_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFMETPIELOC", "", !(GXutil.strcmp("", AV102TFMetPieLoc)==0), (short)(0), AV102TFMetPieLoc, "", !(GXutil.strcmp("", AV103TFMetPieLoc_Sel)==0), AV103TFMetPieLoc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFMETPIEDCP", "", !(GXutil.strcmp("", AV104TFMetPieDCP)==0), (short)(0), AV104TFMetPieDCP, "", !(GXutil.strcmp("", AV105TFMetPieDCP_Sel)==0), AV105TFMetPieDCP_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      if ( ! (GXutil.strcmp("", AV61Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV61Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV62BarCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV62BarCod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV63BarCodReo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV63BarCodReo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV64BarCodPar)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV64BarCodPar );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV65Kms)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&KMS" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV65Kms );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV66Maqcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAQCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV66Maqcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV67Opecod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&OPECOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV67Opecod, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV68Mensaje)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MENSAJE" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV68Mensaje );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72BarKgm)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARKGM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV72BarKgm, 9, 2) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73BarMtr)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARMTR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV73BarMtr, 9, 2) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV78BarAncAca1) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARANCACA1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV78BarAncAca1, 3, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79BarRdt)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARRDT" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV79BarRdt, 6, 2) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV80Barpes) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARPES" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV80Barpes, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV81BarUnimed)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARUNIMED" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV81BarUnimed );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV111Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV111Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "ExpedicionesAutomatizadas.LMETPI" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S152( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV74TotMetPieKil = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TotMetPieKil", GXutil.ltrimstr( AV74TotMetPieKil, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEKIL", getSecureSignedToken( sPrefix, localUtil.format( AV74TotMetPieKil, "ZZZZZ9.99")));
      AV76TotMetPieMet = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TotMetPieMet", GXutil.ltrimstr( AV76TotMetPieMet, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEMET", getSecureSignedToken( sPrefix, localUtil.format( AV76TotMetPieMet, "ZZZZZ9.99")));
   }

   public void S162( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = AV28TFMetTerCod ;
      AV113Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel = AV29TFMetTerCod_Sel ;
      AV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = AV36TFMetPieCod ;
      AV115Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel = AV37TFMetPieCod_Sel ;
      AV116Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil = AV38TFMetPieKil ;
      AV117Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to = AV39TFMetPieKil_To ;
      AV118Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet = AV40TFMetPieMet ;
      AV119Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to = AV41TFMetPieMet_To ;
      AV120Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc = AV42TFMetPieAnc ;
      AV121Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to = AV43TFMetPieAnc_To ;
      AV122Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd = AV44TFMetPieMtD ;
      AV123Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to = AV45TFMetPieMtD_To ;
      AV124Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest = AV46TFMetPieEst ;
      AV125Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to = AV47TFMetPieEst_To ;
      AV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = AV102TFMetPieLoc ;
      AV127Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel = AV103TFMetPieLoc_Sel ;
      AV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = AV104TFMetPieDCP ;
      AV129Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel = AV105TFMetPieDCP_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV113Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel ,
                                           AV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod ,
                                           AV115Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel ,
                                           AV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod ,
                                           AV116Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil ,
                                           AV117Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to ,
                                           AV118Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet ,
                                           AV119Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to ,
                                           Short.valueOf(AV120Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc) ,
                                           Short.valueOf(AV121Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to) ,
                                           AV122Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd ,
                                           AV123Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to ,
                                           Byte.valueOf(AV124Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest) ,
                                           Byte.valueOf(AV125Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to) ,
                                           AV127Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel ,
                                           AV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc ,
                                           AV129Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel ,
                                           AV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp ,
                                           A2809MetTerCod ,
                                           A2813MetPieCod ,
                                           A2814MetPieKil ,
                                           A2815MetPieMet ,
                                           Short.valueOf(A6635MetPieAnc) ,
                                           A4910MetPieMtD ,
                                           Byte.valueOf(A2816MetPieEst) ,
                                           A4913MetPieLoc ,
                                           A4915MetPieDCP ,
                                           AV61Emprcod ,
                                           Integer.valueOf(AV62BarCod) ,
                                           Byte.valueOf(AV63BarCodReo) ,
                                           AV64BarCodPar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = GXutil.padr( GXutil.rtrim( AV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod), 10, "%") ;
      lV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod), 9, "%") ;
      lV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = GXutil.padr( GXutil.rtrim( AV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc), 10, "%") ;
      lV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = GXutil.padr( GXutil.rtrim( AV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp), 1, "%") ;
      /* Using cursor H026I4 */
      pr_default.execute(2, new Object[] {AV61Emprcod, Integer.valueOf(AV62BarCod), Byte.valueOf(AV63BarCodReo), AV64BarCodPar, lV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod, AV113Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel, lV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod, AV115Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel, AV116Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil, AV117Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to, AV118Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet, AV119Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to, Short.valueOf(AV120Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc), Short.valueOf(AV121Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to), AV122Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd, AV123Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to, Byte.valueOf(AV124Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest), Byte.valueOf(AV125Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to), lV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc, AV127Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel, lV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp, AV129Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A130BarCodPar = H026I4_A130BarCodPar[0] ;
         A132BarCodReo = H026I4_A132BarCodReo[0] ;
         A129BarCod = H026I4_A129BarCod[0] ;
         A396EmprCod = H026I4_A396EmprCod[0] ;
         A4915MetPieDCP = H026I4_A4915MetPieDCP[0] ;
         A4913MetPieLoc = H026I4_A4913MetPieLoc[0] ;
         A2816MetPieEst = H026I4_A2816MetPieEst[0] ;
         A4910MetPieMtD = H026I4_A4910MetPieMtD[0] ;
         A6635MetPieAnc = H026I4_A6635MetPieAnc[0] ;
         A2815MetPieMet = H026I4_A2815MetPieMet[0] ;
         A2814MetPieKil = H026I4_A2814MetPieKil[0] ;
         A2813MetPieCod = H026I4_A2813MetPieCod[0] ;
         A2809MetTerCod = H026I4_A2809MetTerCod[0] ;
         AV74TotMetPieKil = A2814MetPieKil.add(AV74TotMetPieKil) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TotMetPieKil", GXutil.ltrimstr( AV74TotMetPieKil, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEKIL", getSecureSignedToken( sPrefix, localUtil.format( AV74TotMetPieKil, "ZZZZZ9.99")));
         AV76TotMetPieMet = A2815MetPieMet.add(AV76TotMetPieMet) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TotMetPieMet", GXutil.ltrimstr( AV76TotMetPieMet, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEMET", getSecureSignedToken( sPrefix, localUtil.format( AV76TotMetPieMet, "ZZZZZ9.99")));
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV75TotValueMetPieKil = localUtil.format( AV74TotMetPieKil, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TotValueMetPieKil", AV75TotValueMetPieKil);
      AV77TotValueMetPieMet = localUtil.format( AV76TotMetPieMet, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TotValueMetPieMet", AV77TotValueMetPieMet);
   }

   public void wb_table3_121_26I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminarpiezas_Internalname, tblTabledvelop_confirmpanel_eliminarpiezas_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminarpiezas.setProperty("Title", Dvelop_confirmpanel_eliminarpiezas_Title);
         ucDvelop_confirmpanel_eliminarpiezas.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminarpiezas_Confirmationtext);
         ucDvelop_confirmpanel_eliminarpiezas.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminarpiezas_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminarpiezas.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminarpiezas_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminarpiezas.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminarpiezas_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminarpiezas.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminarpiezas_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminarpiezas.setProperty("ConfirmType", Dvelop_confirmpanel_eliminarpiezas_Confirmtype);
         ucDvelop_confirmpanel_eliminarpiezas.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminarpiezas_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARPIEZASContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARPIEZASContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_121_26I2e( true) ;
      }
      else
      {
         wb_table3_121_26I2e( false) ;
      }
   }

   public void wb_table2_82_26I2( boolean wbgen )
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
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemetpiekil_Internalname, httpContext.getMessage( "Tot Value Met Pie Kil", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'" + sPrefix + "',false,'" + sGXsfl_61_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemetpiekil_Internalname, AV75TotValueMetPieKil, GXutil.rtrim( localUtil.format( AV75TotValueMetPieKil, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,93);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemetpiekil_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemetpiekil_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemetpiemet_Internalname, httpContext.getMessage( "Tot Value Met Pie Met", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'" + sPrefix + "',false,'" + sGXsfl_61_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemetpiemet_Internalname, AV77TotValueMetPieMet, GXutil.rtrim( localUtil.format( AV77TotValueMetPieMet, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemetpiemet_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemetpiemet_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_82_26I2e( true) ;
      }
      else
      {
         wb_table2_82_26I2e( false) ;
      }
   }

   public void wb_table1_43_26I2( boolean wbgen )
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
         wb_table1_43_26I2e( true) ;
      }
      else
      {
         wb_table1_43_26I2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV61Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Emprcod", AV61Emprcod);
      AV62BarCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62BarCod), 8, 0));
      AV63BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarCodReo", GXutil.str( AV63BarCodReo, 1, 0));
      AV64BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarCodPar", AV64BarCodPar);
      AV65Kms = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Kms", AV65Kms);
      AV66Maqcod = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Maqcod", AV66Maqcod);
      AV67Opecod = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Opecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67Opecod), 6, 0));
      AV68Mensaje = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Mensaje", AV68Mensaje);
      AV72BarKgm = (java.math.BigDecimal)getParm(obj,8,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72BarKgm", GXutil.ltrimstr( AV72BarKgm, 9, 2));
      AV73BarMtr = (java.math.BigDecimal)getParm(obj,9,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73BarMtr", GXutil.ltrimstr( AV73BarMtr, 9, 2));
      AV78BarAncAca1 = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78BarAncAca1), 3, 0));
      AV79BarRdt = (java.math.BigDecimal)getParm(obj,11,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79BarRdt", GXutil.ltrimstr( AV79BarRdt, 6, 2));
      AV80Barpes = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80Barpes), 4, 0));
      AV81BarUnimed = (String)getParm(obj,13,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81BarUnimed", AV81BarUnimed);
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
      pa26I2( ) ;
      ws26I2( ) ;
      we26I2( ) ;
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
      sCtrlAV61Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV62BarCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV63BarCodReo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV64BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV65Kms = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV66Maqcod = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV67Opecod = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV68Mensaje = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV72BarKgm = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV73BarMtr = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV78BarAncAca1 = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV79BarRdt = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV80Barpes = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV81BarUnimed = (String)getParm(obj,13,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa26I2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "pedidosclientesindetalle\\mantenimientorollos_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa26I2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV61Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Emprcod", AV61Emprcod);
         AV62BarCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62BarCod), 8, 0));
         AV63BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarCodReo", GXutil.str( AV63BarCodReo, 1, 0));
         AV64BarCodPar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarCodPar", AV64BarCodPar);
         AV65Kms = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Kms", AV65Kms);
         AV66Maqcod = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Maqcod", AV66Maqcod);
         AV67Opecod = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Opecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67Opecod), 6, 0));
         AV68Mensaje = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Mensaje", AV68Mensaje);
         AV72BarKgm = (java.math.BigDecimal)getParm(obj,10,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72BarKgm", GXutil.ltrimstr( AV72BarKgm, 9, 2));
         AV73BarMtr = (java.math.BigDecimal)getParm(obj,11,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73BarMtr", GXutil.ltrimstr( AV73BarMtr, 9, 2));
         AV78BarAncAca1 = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78BarAncAca1), 3, 0));
         AV79BarRdt = (java.math.BigDecimal)getParm(obj,13,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79BarRdt", GXutil.ltrimstr( AV79BarRdt, 6, 2));
         AV80Barpes = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80Barpes), 4, 0));
         AV81BarUnimed = (String)getParm(obj,15,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81BarUnimed", AV81BarUnimed);
      }
      wcpOAV61Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV61Emprcod") ;
      wcpOAV62BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV62BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV63BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV63BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV64BarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV64BarCodPar") ;
      wcpOAV65Kms = httpContext.cgiGet( sPrefix+"wcpOAV65Kms") ;
      wcpOAV66Maqcod = httpContext.cgiGet( sPrefix+"wcpOAV66Maqcod") ;
      wcpOAV67Opecod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV67Opecod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV68Mensaje = httpContext.cgiGet( sPrefix+"wcpOAV68Mensaje") ;
      wcpOAV72BarKgm = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV72BarKgm")) ;
      wcpOAV73BarMtr = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV73BarMtr")) ;
      wcpOAV78BarAncAca1 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV78BarAncAca1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV79BarRdt = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV79BarRdt")) ;
      wcpOAV80Barpes = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV80Barpes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV81BarUnimed = httpContext.cgiGet( sPrefix+"wcpOAV81BarUnimed") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV61Emprcod, wcpOAV61Emprcod) != 0 ) || ( AV62BarCod != wcpOAV62BarCod ) || ( AV63BarCodReo != wcpOAV63BarCodReo ) || ( GXutil.strcmp(AV64BarCodPar, wcpOAV64BarCodPar) != 0 ) || ( GXutil.strcmp(AV65Kms, wcpOAV65Kms) != 0 ) || ( GXutil.strcmp(AV66Maqcod, wcpOAV66Maqcod) != 0 ) || ( AV67Opecod != wcpOAV67Opecod ) || ( GXutil.strcmp(AV68Mensaje, wcpOAV68Mensaje) != 0 ) || ( DecimalUtil.compareTo(AV72BarKgm, wcpOAV72BarKgm) != 0 ) || ( DecimalUtil.compareTo(AV73BarMtr, wcpOAV73BarMtr) != 0 ) || ( AV78BarAncAca1 != wcpOAV78BarAncAca1 ) || ( DecimalUtil.compareTo(AV79BarRdt, wcpOAV79BarRdt) != 0 ) || ( AV80Barpes != wcpOAV80Barpes ) || ( GXutil.strcmp(AV81BarUnimed, wcpOAV81BarUnimed) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV61Emprcod = AV61Emprcod ;
      wcpOAV62BarCod = AV62BarCod ;
      wcpOAV63BarCodReo = AV63BarCodReo ;
      wcpOAV64BarCodPar = AV64BarCodPar ;
      wcpOAV65Kms = AV65Kms ;
      wcpOAV66Maqcod = AV66Maqcod ;
      wcpOAV67Opecod = AV67Opecod ;
      wcpOAV68Mensaje = AV68Mensaje ;
      wcpOAV72BarKgm = AV72BarKgm ;
      wcpOAV73BarMtr = AV73BarMtr ;
      wcpOAV78BarAncAca1 = AV78BarAncAca1 ;
      wcpOAV79BarRdt = AV79BarRdt ;
      wcpOAV80Barpes = AV80Barpes ;
      wcpOAV81BarUnimed = AV81BarUnimed ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV61Emprcod = httpContext.cgiGet( sPrefix+"AV61Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV61Emprcod) > 0 )
      {
         AV61Emprcod = httpContext.cgiGet( sCtrlAV61Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Emprcod", AV61Emprcod);
      }
      else
      {
         AV61Emprcod = httpContext.cgiGet( sPrefix+"AV61Emprcod_PARM") ;
      }
      sCtrlAV62BarCod = httpContext.cgiGet( sPrefix+"AV62BarCod_CTRL") ;
      if ( GXutil.len( sCtrlAV62BarCod) > 0 )
      {
         AV62BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV62BarCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62BarCod), 8, 0));
      }
      else
      {
         AV62BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV62BarCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV63BarCodReo = httpContext.cgiGet( sPrefix+"AV63BarCodReo_CTRL") ;
      if ( GXutil.len( sCtrlAV63BarCodReo) > 0 )
      {
         AV63BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV63BarCodReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarCodReo", GXutil.str( AV63BarCodReo, 1, 0));
      }
      else
      {
         AV63BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV63BarCodReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV64BarCodPar = httpContext.cgiGet( sPrefix+"AV64BarCodPar_CTRL") ;
      if ( GXutil.len( sCtrlAV64BarCodPar) > 0 )
      {
         AV64BarCodPar = httpContext.cgiGet( sCtrlAV64BarCodPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarCodPar", AV64BarCodPar);
      }
      else
      {
         AV64BarCodPar = httpContext.cgiGet( sPrefix+"AV64BarCodPar_PARM") ;
      }
      sCtrlAV65Kms = httpContext.cgiGet( sPrefix+"AV65Kms_CTRL") ;
      if ( GXutil.len( sCtrlAV65Kms) > 0 )
      {
         AV65Kms = httpContext.cgiGet( sCtrlAV65Kms) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Kms", AV65Kms);
      }
      else
      {
         AV65Kms = httpContext.cgiGet( sPrefix+"AV65Kms_PARM") ;
      }
      sCtrlAV66Maqcod = httpContext.cgiGet( sPrefix+"AV66Maqcod_CTRL") ;
      if ( GXutil.len( sCtrlAV66Maqcod) > 0 )
      {
         AV66Maqcod = httpContext.cgiGet( sCtrlAV66Maqcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Maqcod", AV66Maqcod);
      }
      else
      {
         AV66Maqcod = httpContext.cgiGet( sPrefix+"AV66Maqcod_PARM") ;
      }
      sCtrlAV67Opecod = httpContext.cgiGet( sPrefix+"AV67Opecod_CTRL") ;
      if ( GXutil.len( sCtrlAV67Opecod) > 0 )
      {
         AV67Opecod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV67Opecod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Opecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67Opecod), 6, 0));
      }
      else
      {
         AV67Opecod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV67Opecod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV68Mensaje = httpContext.cgiGet( sPrefix+"AV68Mensaje_CTRL") ;
      if ( GXutil.len( sCtrlAV68Mensaje) > 0 )
      {
         AV68Mensaje = httpContext.cgiGet( sCtrlAV68Mensaje) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Mensaje", AV68Mensaje);
      }
      else
      {
         AV68Mensaje = httpContext.cgiGet( sPrefix+"AV68Mensaje_PARM") ;
      }
      sCtrlAV72BarKgm = httpContext.cgiGet( sPrefix+"AV72BarKgm_CTRL") ;
      if ( GXutil.len( sCtrlAV72BarKgm) > 0 )
      {
         AV72BarKgm = localUtil.ctond( httpContext.cgiGet( sCtrlAV72BarKgm)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72BarKgm", GXutil.ltrimstr( AV72BarKgm, 9, 2));
      }
      else
      {
         AV72BarKgm = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV72BarKgm_PARM")) ;
      }
      sCtrlAV73BarMtr = httpContext.cgiGet( sPrefix+"AV73BarMtr_CTRL") ;
      if ( GXutil.len( sCtrlAV73BarMtr) > 0 )
      {
         AV73BarMtr = localUtil.ctond( httpContext.cgiGet( sCtrlAV73BarMtr)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73BarMtr", GXutil.ltrimstr( AV73BarMtr, 9, 2));
      }
      else
      {
         AV73BarMtr = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV73BarMtr_PARM")) ;
      }
      sCtrlAV78BarAncAca1 = httpContext.cgiGet( sPrefix+"AV78BarAncAca1_CTRL") ;
      if ( GXutil.len( sCtrlAV78BarAncAca1) > 0 )
      {
         AV78BarAncAca1 = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV78BarAncAca1), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78BarAncAca1), 3, 0));
      }
      else
      {
         AV78BarAncAca1 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV78BarAncAca1_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV79BarRdt = httpContext.cgiGet( sPrefix+"AV79BarRdt_CTRL") ;
      if ( GXutil.len( sCtrlAV79BarRdt) > 0 )
      {
         AV79BarRdt = localUtil.ctond( httpContext.cgiGet( sCtrlAV79BarRdt)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79BarRdt", GXutil.ltrimstr( AV79BarRdt, 6, 2));
      }
      else
      {
         AV79BarRdt = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV79BarRdt_PARM")) ;
      }
      sCtrlAV80Barpes = httpContext.cgiGet( sPrefix+"AV80Barpes_CTRL") ;
      if ( GXutil.len( sCtrlAV80Barpes) > 0 )
      {
         AV80Barpes = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV80Barpes), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80Barpes), 4, 0));
      }
      else
      {
         AV80Barpes = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV80Barpes_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV81BarUnimed = httpContext.cgiGet( sPrefix+"AV81BarUnimed_CTRL") ;
      if ( GXutil.len( sCtrlAV81BarUnimed) > 0 )
      {
         AV81BarUnimed = httpContext.cgiGet( sCtrlAV81BarUnimed) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81BarUnimed", AV81BarUnimed);
      }
      else
      {
         AV81BarUnimed = httpContext.cgiGet( sPrefix+"AV81BarUnimed_PARM") ;
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
      pa26I2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws26I2( ) ;
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
      ws26I2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61Emprcod_PARM", GXutil.rtrim( AV61Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV61Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61Emprcod_CTRL", GXutil.rtrim( sCtrlAV61Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62BarCod_PARM", GXutil.ltrim( localUtil.ntoc( AV62BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV62BarCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62BarCod_CTRL", GXutil.rtrim( sCtrlAV62BarCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63BarCodReo_PARM", GXutil.ltrim( localUtil.ntoc( AV63BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV63BarCodReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63BarCodReo_CTRL", GXutil.rtrim( sCtrlAV63BarCodReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64BarCodPar_PARM", GXutil.rtrim( AV64BarCodPar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV64BarCodPar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64BarCodPar_CTRL", GXutil.rtrim( sCtrlAV64BarCodPar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65Kms_PARM", GXutil.rtrim( AV65Kms));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV65Kms)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65Kms_CTRL", GXutil.rtrim( sCtrlAV65Kms));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66Maqcod_PARM", GXutil.rtrim( AV66Maqcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV66Maqcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66Maqcod_CTRL", GXutil.rtrim( sCtrlAV66Maqcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67Opecod_PARM", GXutil.ltrim( localUtil.ntoc( AV67Opecod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV67Opecod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67Opecod_CTRL", GXutil.rtrim( sCtrlAV67Opecod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68Mensaje_PARM", AV68Mensaje);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV68Mensaje)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68Mensaje_CTRL", GXutil.rtrim( sCtrlAV68Mensaje));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV72BarKgm_PARM", GXutil.ltrim( localUtil.ntoc( AV72BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV72BarKgm)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV72BarKgm_CTRL", GXutil.rtrim( sCtrlAV72BarKgm));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV73BarMtr_PARM", GXutil.ltrim( localUtil.ntoc( AV73BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV73BarMtr)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV73BarMtr_CTRL", GXutil.rtrim( sCtrlAV73BarMtr));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV78BarAncAca1_PARM", GXutil.ltrim( localUtil.ntoc( AV78BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV78BarAncAca1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV78BarAncAca1_CTRL", GXutil.rtrim( sCtrlAV78BarAncAca1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV79BarRdt_PARM", GXutil.ltrim( localUtil.ntoc( AV79BarRdt, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV79BarRdt)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV79BarRdt_CTRL", GXutil.rtrim( sCtrlAV79BarRdt));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV80Barpes_PARM", GXutil.ltrim( localUtil.ntoc( AV80Barpes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV80Barpes)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV80Barpes_CTRL", GXutil.rtrim( sCtrlAV80Barpes));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV81BarUnimed_PARM", GXutil.rtrim( AV81BarUnimed));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV81BarUnimed)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV81BarUnimed_CTRL", GXutil.rtrim( sCtrlAV81BarUnimed));
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
      we26I2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115553223", true, true);
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
      httpContext.AddJavascriptSource("pedidosclientesindetalle/mantenimientorollos_wc.js", "?202682115553223", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_612( )
   {
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1_"+sGXsfl_61_idx );
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_61_idx );
      edtMetTerCod_Internalname = sPrefix+"METTERCOD_"+sGXsfl_61_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_61_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_61_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_61_idx ;
      edtMetPieCod_Internalname = sPrefix+"METPIECOD_"+sGXsfl_61_idx ;
      edtMetPieKil_Internalname = sPrefix+"METPIEKIL_"+sGXsfl_61_idx ;
      edtMetPieMet_Internalname = sPrefix+"METPIEMET_"+sGXsfl_61_idx ;
      edtMetPieAnc_Internalname = sPrefix+"METPIEANC_"+sGXsfl_61_idx ;
      edtMetPieMtD_Internalname = sPrefix+"METPIEMTD_"+sGXsfl_61_idx ;
      edtMetPieEst_Internalname = sPrefix+"METPIEEST_"+sGXsfl_61_idx ;
      edtavVcontrol_Internalname = sPrefix+"vVCONTROL_"+sGXsfl_61_idx ;
      edtMetPieLoc_Internalname = sPrefix+"METPIELOC_"+sGXsfl_61_idx ;
      edtMetPieDCP_Internalname = sPrefix+"METPIEDCP_"+sGXsfl_61_idx ;
      edtavBarordlingrid_Internalname = sPrefix+"vBARORDLINGRID_"+sGXsfl_61_idx ;
      edtMetPieId_Internalname = sPrefix+"METPIEID_"+sGXsfl_61_idx ;
      edtMetPieObs_Internalname = sPrefix+"METPIEOBS_"+sGXsfl_61_idx ;
   }

   public void subsflControlProps_fel_612( )
   {
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1_"+sGXsfl_61_fel_idx );
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_61_fel_idx );
      edtMetTerCod_Internalname = sPrefix+"METTERCOD_"+sGXsfl_61_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_61_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_61_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_61_fel_idx ;
      edtMetPieCod_Internalname = sPrefix+"METPIECOD_"+sGXsfl_61_fel_idx ;
      edtMetPieKil_Internalname = sPrefix+"METPIEKIL_"+sGXsfl_61_fel_idx ;
      edtMetPieMet_Internalname = sPrefix+"METPIEMET_"+sGXsfl_61_fel_idx ;
      edtMetPieAnc_Internalname = sPrefix+"METPIEANC_"+sGXsfl_61_fel_idx ;
      edtMetPieMtD_Internalname = sPrefix+"METPIEMTD_"+sGXsfl_61_fel_idx ;
      edtMetPieEst_Internalname = sPrefix+"METPIEEST_"+sGXsfl_61_fel_idx ;
      edtavVcontrol_Internalname = sPrefix+"vVCONTROL_"+sGXsfl_61_fel_idx ;
      edtMetPieLoc_Internalname = sPrefix+"METPIELOC_"+sGXsfl_61_fel_idx ;
      edtMetPieDCP_Internalname = sPrefix+"METPIEDCP_"+sGXsfl_61_fel_idx ;
      edtavBarordlingrid_Internalname = sPrefix+"vBARORDLINGRID_"+sGXsfl_61_fel_idx ;
      edtMetPieId_Internalname = sPrefix+"METPIEID_"+sGXsfl_61_fel_idx ;
      edtMetPieObs_Internalname = sPrefix+"METPIEOBS_"+sGXsfl_61_fel_idx ;
   }

   public void sendrow_612( )
   {
      subsflControlProps_612( ) ;
      wb26I0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_61_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_61_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_61_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 62,'"+sPrefix+"',false,'"+sGXsfl_61_idx+"',61)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_61_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               AV82GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV82GridActionGroup1, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82GridActionGroup1), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV82GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVGRIDACTIONGROUP1.CLICK."+sGXsfl_61_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,62);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV82GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_61_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 63,'"+sPrefix+"',false,'"+sGXsfl_61_idx+"',61)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONAR_" + sGXsfl_61_idx ;
         chkavSeleccionar.setName( GXCCtl );
         chkavSeleccionar.setWebtags( "" );
         chkavSeleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_61_Refreshing);
         chkavSeleccionar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionar.getInternalname(),GXutil.booltostr( AV93Seleccionar),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,63);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetTerCod_Internalname,GXutil.rtrim( A2809MetTerCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetTerCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieCod_Internalname,GXutil.rtrim( A2813MetPieCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieKil_Internalname,GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A2814MetPieKil, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieKil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieMet_Internalname,GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A2815MetPieMet, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieMet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6635MetPieAnc), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieMtD_Internalname,GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4910MetPieMtD, "ZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieMtD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieEst_Internalname,GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2816MetPieEst), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavVcontrol_Enabled!=0)&&(edtavVcontrol_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 74,'"+sPrefix+"',false,'"+sGXsfl_61_idx+"',61)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavVcontrol_Internalname,GXutil.rtrim( AV60VControl),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavVcontrol_Enabled!=0)&&(edtavVcontrol_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,74);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavVcontrol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavVcontrol_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieLoc_Internalname,GXutil.rtrim( A4913MetPieLoc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieLoc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieDCP_Internalname,GXutil.rtrim( A4915MetPieDCP),GXutil.rtrim( localUtil.format( A4915MetPieDCP, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieDCP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarordlingrid_Enabled!=0)&&(edtavBarordlingrid_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 77,'"+sPrefix+"',false,'"+sGXsfl_61_idx+"',61)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarordlingrid_Internalname,GXutil.ltrim( localUtil.ntoc( AV59barOrdlinGRID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarordlingrid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV59barOrdlinGRID), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV59barOrdlinGRID), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBarordlingrid_Enabled!=0)&&(edtavBarordlingrid_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,77);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarordlingrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarordlingrid_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieId_Internalname,GXutil.rtrim( A10784MetPieId),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieObs_Internalname,A4917MetPieObs,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1024),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes26I2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_61_idx = ((subGrid_Islastpage==1)&&(nGXsfl_61_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_61_idx+1) ;
         sGXsfl_61_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_61_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_612( ) ;
      }
      /* End function sendrow_612 */
   }

   public void startgridcontrol61( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"61\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Terminal", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Reoperado Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Particion Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pieza", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ancho", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Grm2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Control", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Localicacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Calidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Pieza Sistema Externo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Observaciones", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV82GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( AV93Seleccionar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2809MetTerCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2813MetPieCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV60VControl));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavVcontrol_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4913MetPieLoc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4915MetPieDCP));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV59barOrdlinGRID, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarordlingrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10784MetPieId));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A4917MetPieObs);
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
      edtavBarcod_Internalname = sPrefix+"vBARCOD" ;
      edtavBarcodreo_Internalname = sPrefix+"vBARCODREO" ;
      edtavBarcodpar_Internalname = sPrefix+"vBARCODPAR" ;
      edtavBarkgm_Internalname = sPrefix+"vBARKGM" ;
      edtavBarmtr_Internalname = sPrefix+"vBARMTR" ;
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      divTableactions0_Internalname = sPrefix+"TABLEACTIONS0" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      bttBtneliminarpiezas_Internalname = sPrefix+"BTNELIMINARPIEZAS" ;
      bttBtnaltapieza_Internalname = sPrefix+"BTNALTAPIEZA" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1" );
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR" );
      edtMetTerCod_Internalname = sPrefix+"METTERCOD" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtMetPieCod_Internalname = sPrefix+"METPIECOD" ;
      edtMetPieKil_Internalname = sPrefix+"METPIEKIL" ;
      edtMetPieMet_Internalname = sPrefix+"METPIEMET" ;
      edtMetPieAnc_Internalname = sPrefix+"METPIEANC" ;
      edtMetPieMtD_Internalname = sPrefix+"METPIEMTD" ;
      edtMetPieEst_Internalname = sPrefix+"METPIEEST" ;
      edtavVcontrol_Internalname = sPrefix+"vVCONTROL" ;
      edtMetPieLoc_Internalname = sPrefix+"METPIELOC" ;
      edtMetPieDCP_Internalname = sPrefix+"METPIEDCP" ;
      edtavBarordlingrid_Internalname = sPrefix+"vBARORDLINGRID" ;
      edtMetPieId_Internalname = sPrefix+"METPIEID" ;
      edtMetPieObs_Internalname = sPrefix+"METPIEOBS" ;
      edtavTotvaluemetpiekil_Internalname = sPrefix+"vTOTVALUEMETPIEKIL" ;
      edtavTotvaluemetpiemet_Internalname = sPrefix+"vTOTVALUEMETPIEMET" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      edtavOk_Internalname = sPrefix+"vOK" ;
      Dvelop_confirmpanel_eliminarpiezas_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARPIEZAS" ;
      tblTabledvelop_confirmpanel_eliminarpiezas_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ELIMINARPIEZAS" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtMetPieObs_Jsonclick = "" ;
      edtMetPieId_Jsonclick = "" ;
      edtavBarordlingrid_Jsonclick = "" ;
      edtavBarordlingrid_Visible = -1 ;
      edtavBarordlingrid_Enabled = 1 ;
      edtMetPieDCP_Jsonclick = "" ;
      edtMetPieLoc_Jsonclick = "" ;
      edtavVcontrol_Jsonclick = "" ;
      edtavVcontrol_Visible = -1 ;
      edtavVcontrol_Enabled = 1 ;
      edtMetPieEst_Jsonclick = "" ;
      edtMetPieMtD_Jsonclick = "" ;
      edtMetPieAnc_Jsonclick = "" ;
      edtMetPieMet_Jsonclick = "" ;
      edtMetPieKil_Jsonclick = "" ;
      edtMetPieCod_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtMetTerCod_Jsonclick = "" ;
      chkavSeleccionar.setCaption( "" );
      chkavSeleccionar.setVisible( -1 );
      chkavSeleccionar.setEnabled( 1 );
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluemetpiemet_Jsonclick = "" ;
      edtavTotvaluemetpiemet_Enabled = 1 ;
      edtavTotvaluemetpiekil_Jsonclick = "" ;
      edtavTotvaluemetpiekil_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavOk_Jsonclick = "" ;
      edtavOk_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavBarmtr_Jsonclick = "" ;
      edtavBarmtr_Enabled = 0 ;
      edtavBarkgm_Jsonclick = "" ;
      edtavBarkgm_Enabled = 0 ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 0 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_eliminarpiezas_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminarpiezas_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminarpiezas_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminarpiezas_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminarpiezas_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminarpiezas_Confirmationtext = "¿Confirma el Proceso?" ;
      Dvelop_confirmpanel_eliminarpiezas_Title = "" ;
      Ddo_grid_Datalistproc = "PedidosClienteSinDetalle.MantenimientoRollos_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic||||||Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "T|T||||||T|T" ;
      Ddo_grid_Filterisrange = "||T|T|T|T|T||" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10" ;
      Ddo_grid_Columnids = "2:MetTerCod|6:MetPieCod|7:MetPieKil|8:MetPieMet|9:MetPieAnc|10:MetPieMtD|11:MetPieEst|13:MetPieLoc|14:MetPieDCP" ;
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
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_61_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
      {
      }
      GXCCtl = "vSELECCIONAR_" + sGXsfl_61_idx ;
      chkavSeleccionar.setName( GXCCtl );
      chkavSeleccionar.setWebtags( "" );
      chkavSeleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_61_Refreshing);
      chkavSeleccionar.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV86Col_BarCod',fld:'vCOL_BARCOD',pic:''},{av:'AV87Col_BarCodPar',fld:'vCOL_BARCODPAR',pic:''},{av:'AV88Col_BarCodReo',fld:'vCOL_BARCODREO',pic:''},{av:'AV97Col_MetPieCod',fld:'vCOL_METPIECOD',pic:''},{av:'AV96Col_MetTerCod',fld:'vCOL_METTERCOD',pic:''},{av:'sPrefix'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV61Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV62BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV63BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV64BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV106Ok',fld:'vOK',pic:''},{av:'AV28TFMetTerCod',fld:'vTFMETTERCOD',pic:''},{av:'AV29TFMetTerCod_Sel',fld:'vTFMETTERCOD_SEL',pic:''},{av:'AV36TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV37TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV38TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV39TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV40TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV41TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV43TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV44TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV45TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV46TFMetPieEst',fld:'vTFMETPIEEST',pic:'9'},{av:'AV47TFMetPieEst_To',fld:'vTFMETPIEEST_TO',pic:'9'},{av:'AV102TFMetPieLoc',fld:'vTFMETPIELOC',pic:''},{av:'AV103TFMetPieLoc_Sel',fld:'vTFMETPIELOC_SEL',pic:''},{av:'AV104TFMetPieDCP',fld:'vTFMETPIEDCP',pic:'@!'},{av:'AV105TFMetPieDCP_Sel',fld:'vTFMETPIEDCP_SEL',pic:'@!'},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65Kms',fld:'vKMS',pic:''},{av:'AV66Maqcod',fld:'vMAQCOD',pic:''},{av:'AV67Opecod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV68Mensaje',fld:'vMENSAJE',pic:''},{av:'AV72BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV73BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV78BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9'},{av:'AV79BarRdt',fld:'vBARRDT',pic:'ZZ9.99'},{av:'AV80Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV81BarUnimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV74TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV76TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV83ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV56GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV57GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV74TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV76TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotValueMetPieKil',fld:'vTOTVALUEMETPIEKIL',pic:''},{av:'AV77TotValueMetPieMet',fld:'vTOTVALUEMETPIEMET',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1126I2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV61Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV62BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV63BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV64BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV106Ok',fld:'vOK',pic:''},{av:'AV28TFMetTerCod',fld:'vTFMETTERCOD',pic:''},{av:'AV29TFMetTerCod_Sel',fld:'vTFMETTERCOD_SEL',pic:''},{av:'AV36TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV37TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV38TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV39TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV40TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV41TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV43TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV44TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV45TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV46TFMetPieEst',fld:'vTFMETPIEEST',pic:'9'},{av:'AV47TFMetPieEst_To',fld:'vTFMETPIEEST_TO',pic:'9'},{av:'AV102TFMetPieLoc',fld:'vTFMETPIELOC',pic:''},{av:'AV103TFMetPieLoc_Sel',fld:'vTFMETPIELOC_SEL',pic:''},{av:'AV104TFMetPieDCP',fld:'vTFMETPIEDCP',pic:'@!'},{av:'AV105TFMetPieDCP_Sel',fld:'vTFMETPIEDCP_SEL',pic:'@!'},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65Kms',fld:'vKMS',pic:''},{av:'AV66Maqcod',fld:'vMAQCOD',pic:''},{av:'AV67Opecod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV68Mensaje',fld:'vMENSAJE',pic:''},{av:'AV72BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV73BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV78BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9'},{av:'AV79BarRdt',fld:'vBARRDT',pic:'ZZ9.99'},{av:'AV80Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV81BarUnimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV74TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV76TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV86Col_BarCod',fld:'vCOL_BARCOD',pic:''},{av:'AV87Col_BarCodPar',fld:'vCOL_BARCODPAR',pic:''},{av:'AV88Col_BarCodReo',fld:'vCOL_BARCODREO',pic:''},{av:'AV97Col_MetPieCod',fld:'vCOL_METPIECOD',pic:''},{av:'AV96Col_MetTerCod',fld:'vCOL_METTERCOD',pic:''},{av:'AV83ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1226I2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV61Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV62BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV63BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV64BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV106Ok',fld:'vOK',pic:''},{av:'AV28TFMetTerCod',fld:'vTFMETTERCOD',pic:''},{av:'AV29TFMetTerCod_Sel',fld:'vTFMETTERCOD_SEL',pic:''},{av:'AV36TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV37TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV38TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV39TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV40TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV41TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV43TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV44TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV45TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV46TFMetPieEst',fld:'vTFMETPIEEST',pic:'9'},{av:'AV47TFMetPieEst_To',fld:'vTFMETPIEEST_TO',pic:'9'},{av:'AV102TFMetPieLoc',fld:'vTFMETPIELOC',pic:''},{av:'AV103TFMetPieLoc_Sel',fld:'vTFMETPIELOC_SEL',pic:''},{av:'AV104TFMetPieDCP',fld:'vTFMETPIEDCP',pic:'@!'},{av:'AV105TFMetPieDCP_Sel',fld:'vTFMETPIEDCP_SEL',pic:'@!'},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65Kms',fld:'vKMS',pic:''},{av:'AV66Maqcod',fld:'vMAQCOD',pic:''},{av:'AV67Opecod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV68Mensaje',fld:'vMENSAJE',pic:''},{av:'AV72BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV73BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV78BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9'},{av:'AV79BarRdt',fld:'vBARRDT',pic:'ZZ9.99'},{av:'AV80Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV81BarUnimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV74TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV76TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV86Col_BarCod',fld:'vCOL_BARCOD',pic:''},{av:'AV87Col_BarCodPar',fld:'vCOL_BARCODPAR',pic:''},{av:'AV88Col_BarCodReo',fld:'vCOL_BARCODREO',pic:''},{av:'AV97Col_MetPieCod',fld:'vCOL_METPIECOD',pic:''},{av:'AV96Col_MetTerCod',fld:'vCOL_METTERCOD',pic:''},{av:'AV83ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1326I2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV61Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV62BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV63BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV64BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV106Ok',fld:'vOK',pic:''},{av:'AV28TFMetTerCod',fld:'vTFMETTERCOD',pic:''},{av:'AV29TFMetTerCod_Sel',fld:'vTFMETTERCOD_SEL',pic:''},{av:'AV36TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV37TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV38TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV39TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV40TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV41TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV43TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV44TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV45TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV46TFMetPieEst',fld:'vTFMETPIEEST',pic:'9'},{av:'AV47TFMetPieEst_To',fld:'vTFMETPIEEST_TO',pic:'9'},{av:'AV102TFMetPieLoc',fld:'vTFMETPIELOC',pic:''},{av:'AV103TFMetPieLoc_Sel',fld:'vTFMETPIELOC_SEL',pic:''},{av:'AV104TFMetPieDCP',fld:'vTFMETPIEDCP',pic:'@!'},{av:'AV105TFMetPieDCP_Sel',fld:'vTFMETPIEDCP_SEL',pic:'@!'},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65Kms',fld:'vKMS',pic:''},{av:'AV66Maqcod',fld:'vMAQCOD',pic:''},{av:'AV67Opecod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV68Mensaje',fld:'vMENSAJE',pic:''},{av:'AV72BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV73BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV78BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9'},{av:'AV79BarRdt',fld:'vBARRDT',pic:'ZZ9.99'},{av:'AV80Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV81BarUnimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV74TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV76TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV86Col_BarCod',fld:'vCOL_BARCOD',pic:''},{av:'AV87Col_BarCodPar',fld:'vCOL_BARCODPAR',pic:''},{av:'AV88Col_BarCodReo',fld:'vCOL_BARCODREO',pic:''},{av:'AV97Col_MetPieCod',fld:'vCOL_METPIECOD',pic:''},{av:'AV96Col_MetTerCod',fld:'vCOL_METTERCOD',pic:''},{av:'AV83ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV104TFMetPieDCP',fld:'vTFMETPIEDCP',pic:'@!'},{av:'AV105TFMetPieDCP_Sel',fld:'vTFMETPIEDCP_SEL',pic:'@!'},{av:'AV102TFMetPieLoc',fld:'vTFMETPIELOC',pic:''},{av:'AV103TFMetPieLoc_Sel',fld:'vTFMETPIELOC_SEL',pic:''},{av:'AV46TFMetPieEst',fld:'vTFMETPIEEST',pic:'9'},{av:'AV47TFMetPieEst_To',fld:'vTFMETPIEEST_TO',pic:'9'},{av:'AV44TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV45TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV42TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV43TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV40TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV41TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV38TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV39TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV36TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV37TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV28TFMetTerCod',fld:'vTFMETTERCOD',pic:''},{av:'AV29TFMetTerCod_Sel',fld:'vTFMETTERCOD_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2026I2',iparms:[{av:'A4917MetPieObs',fld:'METPIEOBS',pic:'',hsh:true},{av:'AV86Col_BarCod',fld:'vCOL_BARCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV87Col_BarCodPar',fld:'vCOL_BARCODPAR',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV88Col_BarCodReo',fld:'vCOL_BARCODREO',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV97Col_MetPieCod',fld:'vCOL_METPIECOD',pic:''},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''},{av:'AV96Col_MetTerCod',fld:'vCOL_METTERCOD',pic:''},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV82GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'AV60VControl',fld:'vVCONTROL',pic:'',hsh:true},{av:'AV59barOrdlinGRID',fld:'vBARORDLINGRID',pic:'ZZZ9'},{av:'AV93Seleccionar',fld:'vSELECCIONAR',pic:''}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e2126I2',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV82GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV61Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV62BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV63BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV64BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV106Ok',fld:'vOK',pic:''},{av:'AV28TFMetTerCod',fld:'vTFMETTERCOD',pic:''},{av:'AV29TFMetTerCod_Sel',fld:'vTFMETTERCOD_SEL',pic:''},{av:'AV36TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV37TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV38TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV39TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV40TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV41TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV43TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV44TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV45TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV46TFMetPieEst',fld:'vTFMETPIEEST',pic:'9'},{av:'AV47TFMetPieEst_To',fld:'vTFMETPIEEST_TO',pic:'9'},{av:'AV102TFMetPieLoc',fld:'vTFMETPIELOC',pic:''},{av:'AV103TFMetPieLoc_Sel',fld:'vTFMETPIELOC_SEL',pic:''},{av:'AV104TFMetPieDCP',fld:'vTFMETPIEDCP',pic:'@!'},{av:'AV105TFMetPieDCP_Sel',fld:'vTFMETPIEDCP_SEL',pic:'@!'},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65Kms',fld:'vKMS',pic:''},{av:'AV66Maqcod',fld:'vMAQCOD',pic:''},{av:'AV67Opecod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV68Mensaje',fld:'vMENSAJE',pic:''},{av:'AV72BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV73BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV78BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9'},{av:'AV79BarRdt',fld:'vBARRDT',pic:'ZZ9.99'},{av:'AV80Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV81BarUnimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV74TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV76TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV86Col_BarCod',fld:'vCOL_BARCOD',pic:''},{av:'AV87Col_BarCodPar',fld:'vCOL_BARCODPAR',pic:''},{av:'AV88Col_BarCodReo',fld:'vCOL_BARCODREO',pic:''},{av:'AV97Col_MetPieCod',fld:'vCOL_METPIECOD',pic:''},{av:'AV96Col_MetTerCod',fld:'vCOL_METTERCOD',pic:''},{av:'AV83ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'},{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'},{av:'A6635MetPieAnc',fld:'METPIEANC',pic:'ZZ9'},{av:'A10784MetPieId',fld:'METPIEID',pic:'',hsh:true},{av:'A4910MetPieMtD',fld:'METPIEMTD',pic:'ZZZZ9.99'},{av:'AV60VControl',fld:'vVCONTROL',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV82GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'AV65Kms',fld:'vKMS',pic:''},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''},{av:'AV64BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV63BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV62BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'AV61Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV66Maqcod',fld:'vMAQCOD',pic:''},{av:'A4910MetPieMtD',fld:'METPIEMTD',pic:'ZZZZ9.99'},{av:'A6635MetPieAnc',fld:'METPIEANC',pic:'ZZ9'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'},{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV56GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV57GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV74TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV76TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotValueMetPieKil',fld:'vTOTVALUEMETPIEKIL',pic:''},{av:'AV77TotValueMetPieMet',fld:'vTOTVALUEMETPIEMET',pic:''}]}");
      setEventMetadata("'DOELIMINARPIEZAS'","{handler:'e1526I2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV61Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV62BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV63BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV64BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV106Ok',fld:'vOK',pic:''},{av:'AV28TFMetTerCod',fld:'vTFMETTERCOD',pic:''},{av:'AV29TFMetTerCod_Sel',fld:'vTFMETTERCOD_SEL',pic:''},{av:'AV36TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV37TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV38TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV39TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV40TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV41TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV43TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV44TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV45TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV46TFMetPieEst',fld:'vTFMETPIEEST',pic:'9'},{av:'AV47TFMetPieEst_To',fld:'vTFMETPIEEST_TO',pic:'9'},{av:'AV102TFMetPieLoc',fld:'vTFMETPIELOC',pic:''},{av:'AV103TFMetPieLoc_Sel',fld:'vTFMETPIELOC_SEL',pic:''},{av:'AV104TFMetPieDCP',fld:'vTFMETPIEDCP',pic:'@!'},{av:'AV105TFMetPieDCP_Sel',fld:'vTFMETPIEDCP_SEL',pic:'@!'},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65Kms',fld:'vKMS',pic:''},{av:'AV66Maqcod',fld:'vMAQCOD',pic:''},{av:'AV67Opecod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV68Mensaje',fld:'vMENSAJE',pic:''},{av:'AV72BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV73BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV78BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9'},{av:'AV79BarRdt',fld:'vBARRDT',pic:'ZZ9.99'},{av:'AV80Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV81BarUnimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV74TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV76TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV86Col_BarCod',fld:'vCOL_BARCOD',pic:''},{av:'AV87Col_BarCodPar',fld:'vCOL_BARCODPAR',pic:''},{av:'AV88Col_BarCodReo',fld:'vCOL_BARCODREO',pic:''},{av:'AV97Col_MetPieCod',fld:'vCOL_METPIECOD',pic:''},{av:'AV96Col_MetTerCod',fld:'vCOL_METTERCOD',pic:''},{av:'AV83ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'}]");
      setEventMetadata("'DOELIMINARPIEZAS'",",oparms:[{av:'AV106Ok',fld:'vOK',pic:''},{av:'AV56GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV57GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV74TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV76TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotValueMetPieKil',fld:'vTOTVALUEMETPIEKIL',pic:''},{av:'AV77TotValueMetPieMet',fld:'vTOTVALUEMETPIEMET',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARPIEZAS.CLOSE","{handler:'e1426I2',iparms:[{av:'Dvelop_confirmpanel_eliminarpiezas_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARPIEZAS',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV61Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV62BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV63BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV64BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV106Ok',fld:'vOK',pic:''},{av:'AV28TFMetTerCod',fld:'vTFMETTERCOD',pic:''},{av:'AV29TFMetTerCod_Sel',fld:'vTFMETTERCOD_SEL',pic:''},{av:'AV36TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV37TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV38TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV39TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV40TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV41TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV43TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV44TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV45TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV46TFMetPieEst',fld:'vTFMETPIEEST',pic:'9'},{av:'AV47TFMetPieEst_To',fld:'vTFMETPIEEST_TO',pic:'9'},{av:'AV102TFMetPieLoc',fld:'vTFMETPIELOC',pic:''},{av:'AV103TFMetPieLoc_Sel',fld:'vTFMETPIELOC_SEL',pic:''},{av:'AV104TFMetPieDCP',fld:'vTFMETPIEDCP',pic:'@!'},{av:'AV105TFMetPieDCP_Sel',fld:'vTFMETPIEDCP_SEL',pic:'@!'},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65Kms',fld:'vKMS',pic:''},{av:'AV66Maqcod',fld:'vMAQCOD',pic:''},{av:'AV67Opecod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV68Mensaje',fld:'vMENSAJE',pic:''},{av:'AV72BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV73BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV78BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9'},{av:'AV79BarRdt',fld:'vBARRDT',pic:'ZZ9.99'},{av:'AV80Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV81BarUnimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV74TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV76TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV86Col_BarCod',fld:'vCOL_BARCOD',pic:''},{av:'AV87Col_BarCodPar',fld:'vCOL_BARCODPAR',pic:''},{av:'AV88Col_BarCodReo',fld:'vCOL_BARCODREO',pic:''},{av:'AV97Col_MetPieCod',fld:'vCOL_METPIECOD',pic:''},{av:'AV96Col_MetTerCod',fld:'vCOL_METTERCOD',pic:''},{av:'AV83ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'A4917MetPieObs',fld:'METPIEOBS',pic:'',hsh:true},{av:'AV59barOrdlinGRID',fld:'vBARORDLINGRID',pic:'ZZZ9'},{av:'AV71UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV69Station',fld:'vSTATION',pic:''},{av:'AV95UltimaPieza',fld:'vULTIMAPIEZA',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARPIEZAS.CLOSE",",oparms:[{av:'AV64BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV63BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV62BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV61Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV59barOrdlinGRID',fld:'vBARORDLINGRID',pic:'ZZZ9'},{av:'AV69Station',fld:'vSTATION',pic:''},{av:'AV71UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV95UltimaPieza',fld:'vULTIMAPIEZA',pic:'ZZZ9'},{av:'AV67Opecod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV66Maqcod',fld:'vMAQCOD',pic:''},{av:'AV106Ok',fld:'vOK',pic:''},{av:'AV86Col_BarCod',fld:'vCOL_BARCOD',pic:''},{av:'AV87Col_BarCodPar',fld:'vCOL_BARCODPAR',pic:''},{av:'AV88Col_BarCodReo',fld:'vCOL_BARCODREO',pic:''},{av:'AV97Col_MetPieCod',fld:'vCOL_METPIECOD',pic:''},{av:'AV96Col_MetTerCod',fld:'vCOL_METTERCOD',pic:''},{av:'AV56GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV57GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV74TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV76TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotValueMetPieKil',fld:'vTOTVALUEMETPIEKIL',pic:''},{av:'AV77TotValueMetPieMet',fld:'vTOTVALUEMETPIEMET',pic:''}]}");
      setEventMetadata("'DOALTAPIEZA'","{handler:'e1626I2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV61Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV62BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV63BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV64BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV106Ok',fld:'vOK',pic:''},{av:'AV28TFMetTerCod',fld:'vTFMETTERCOD',pic:''},{av:'AV29TFMetTerCod_Sel',fld:'vTFMETTERCOD_SEL',pic:''},{av:'AV36TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV37TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV38TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV39TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV40TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV41TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV43TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV44TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV45TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV46TFMetPieEst',fld:'vTFMETPIEEST',pic:'9'},{av:'AV47TFMetPieEst_To',fld:'vTFMETPIEEST_TO',pic:'9'},{av:'AV102TFMetPieLoc',fld:'vTFMETPIELOC',pic:''},{av:'AV103TFMetPieLoc_Sel',fld:'vTFMETPIELOC_SEL',pic:''},{av:'AV104TFMetPieDCP',fld:'vTFMETPIEDCP',pic:'@!'},{av:'AV105TFMetPieDCP_Sel',fld:'vTFMETPIEDCP_SEL',pic:'@!'},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65Kms',fld:'vKMS',pic:''},{av:'AV66Maqcod',fld:'vMAQCOD',pic:''},{av:'AV67Opecod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV68Mensaje',fld:'vMENSAJE',pic:''},{av:'AV72BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV73BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV78BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9'},{av:'AV79BarRdt',fld:'vBARRDT',pic:'ZZ9.99'},{av:'AV80Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV81BarUnimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV74TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV76TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV86Col_BarCod',fld:'vCOL_BARCOD',pic:''},{av:'AV87Col_BarCodPar',fld:'vCOL_BARCODPAR',pic:''},{av:'AV88Col_BarCodReo',fld:'vCOL_BARCODREO',pic:''},{av:'AV97Col_MetPieCod',fld:'vCOL_METPIECOD',pic:''},{av:'AV96Col_MetTerCod',fld:'vCOL_METTERCOD',pic:''},{av:'AV83ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'}]");
      setEventMetadata("'DOALTAPIEZA'",",oparms:[{av:'AV56GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV57GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV74TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV76TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotValueMetPieKil',fld:'vTOTVALUEMETPIEKIL',pic:''},{av:'AV77TotValueMetPieMet',fld:'vTOTVALUEMETPIEMET',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1726I2',iparms:[{av:'AV61Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV62BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV63BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV64BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("VALIDV_BARCOD","{handler:'validv_Barcod',iparms:[]");
      setEventMetadata("VALIDV_BARCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODREO","{handler:'validv_Barcodreo',iparms:[]");
      setEventMetadata("VALIDV_BARCODREO",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODPAR","{handler:'validv_Barcodpar',iparms:[]");
      setEventMetadata("VALIDV_BARCODPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Metpieobs',iparms:[]");
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
      wcpOAV61Emprcod = "" ;
      wcpOAV64BarCodPar = "" ;
      wcpOAV65Kms = "" ;
      wcpOAV66Maqcod = "" ;
      wcpOAV68Mensaje = "" ;
      wcpOAV72BarKgm = DecimalUtil.ZERO ;
      wcpOAV73BarMtr = DecimalUtil.ZERO ;
      wcpOAV79BarRdt = DecimalUtil.ZERO ;
      wcpOAV81BarUnimed = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_eliminarpiezas_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV61Emprcod = "" ;
      AV64BarCodPar = "" ;
      AV65Kms = "" ;
      AV66Maqcod = "" ;
      AV68Mensaje = "" ;
      AV72BarKgm = DecimalUtil.ZERO ;
      AV73BarMtr = DecimalUtil.ZERO ;
      AV79BarRdt = DecimalUtil.ZERO ;
      AV81BarUnimed = "" ;
      AV106Ok = "" ;
      AV28TFMetTerCod = "" ;
      AV29TFMetTerCod_Sel = "" ;
      AV36TFMetPieCod = "" ;
      AV37TFMetPieCod_Sel = "" ;
      AV38TFMetPieKil = DecimalUtil.ZERO ;
      AV39TFMetPieKil_To = DecimalUtil.ZERO ;
      AV40TFMetPieMet = DecimalUtil.ZERO ;
      AV41TFMetPieMet_To = DecimalUtil.ZERO ;
      AV44TFMetPieMtD = DecimalUtil.ZERO ;
      AV45TFMetPieMtD_To = DecimalUtil.ZERO ;
      AV102TFMetPieLoc = "" ;
      AV103TFMetPieLoc_Sel = "" ;
      AV104TFMetPieDCP = "" ;
      AV105TFMetPieDCP_Sel = "" ;
      AV111Pgmname = "" ;
      AV74TotMetPieKil = DecimalUtil.ZERO ;
      AV76TotMetPieMet = DecimalUtil.ZERO ;
      AV86Col_BarCod = new GXSimpleCollection<Integer>(Integer.class, "internal", "");
      AV87Col_BarCodPar = new GXSimpleCollection<String>(String.class, "internal", "");
      AV88Col_BarCodReo = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV97Col_MetPieCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV96Col_MetTerCod = new GXSimpleCollection<String>(String.class, "internal", "");
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV54DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      AV71UsurCod = "" ;
      AV69Station = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtneliminarpiezas_Jsonclick = "" ;
      bttBtnaltapieza_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A2809MetTerCod = "" ;
      A130BarCodPar = "" ;
      A2813MetPieCod = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A4910MetPieMtD = DecimalUtil.ZERO ;
      AV60VControl = "" ;
      A4913MetPieLoc = "" ;
      A4915MetPieDCP = "" ;
      A10784MetPieId = "" ;
      A4917MetPieObs = "" ;
      scmdbuf = "" ;
      lV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = "" ;
      lV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = "" ;
      lV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = "" ;
      lV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = "" ;
      AV113Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel = "" ;
      AV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = "" ;
      AV115Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel = "" ;
      AV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = "" ;
      AV116Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil = DecimalUtil.ZERO ;
      AV117Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to = DecimalUtil.ZERO ;
      AV118Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet = DecimalUtil.ZERO ;
      AV119Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to = DecimalUtil.ZERO ;
      AV122Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd = DecimalUtil.ZERO ;
      AV123Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to = DecimalUtil.ZERO ;
      AV127Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel = "" ;
      AV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = "" ;
      AV129Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel = "" ;
      AV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = "" ;
      H026I2_A396EmprCod = new String[] {""} ;
      H026I2_A4917MetPieObs = new String[] {""} ;
      H026I2_A10784MetPieId = new String[] {""} ;
      H026I2_A4915MetPieDCP = new String[] {""} ;
      H026I2_A4913MetPieLoc = new String[] {""} ;
      H026I2_A2816MetPieEst = new byte[1] ;
      H026I2_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H026I2_A6635MetPieAnc = new short[1] ;
      H026I2_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H026I2_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H026I2_A2813MetPieCod = new String[] {""} ;
      H026I2_A130BarCodPar = new String[] {""} ;
      H026I2_A132BarCodReo = new byte[1] ;
      H026I2_A129BarCod = new int[1] ;
      H026I2_A2809MetTerCod = new String[] {""} ;
      H026I3_AGRID_nRecordCount = new long[1] ;
      AV75TotValueMetPieKil = "" ;
      AV77TotValueMetPieMet = "" ;
      hsh = "" ;
      AV70EmprNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      AV99MetPiecod = "" ;
      AV100MetTerCod = "" ;
      AV101MetPieObs = "" ;
      AV92Piezactrl = "" ;
      GXv_int12 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int16 = new byte[1] ;
      AV22Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char19 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char14 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char13 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState20 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H026I4_A130BarCodPar = new String[] {""} ;
      H026I4_A132BarCodReo = new byte[1] ;
      H026I4_A129BarCod = new int[1] ;
      H026I4_A396EmprCod = new String[] {""} ;
      H026I4_A4915MetPieDCP = new String[] {""} ;
      H026I4_A4913MetPieLoc = new String[] {""} ;
      H026I4_A2816MetPieEst = new byte[1] ;
      H026I4_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H026I4_A6635MetPieAnc = new short[1] ;
      H026I4_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H026I4_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H026I4_A2813MetPieCod = new String[] {""} ;
      H026I4_A2809MetTerCod = new String[] {""} ;
      ucDvelop_confirmpanel_eliminarpiezas = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV61Emprcod = "" ;
      sCtrlAV62BarCod = "" ;
      sCtrlAV63BarCodReo = "" ;
      sCtrlAV64BarCodPar = "" ;
      sCtrlAV65Kms = "" ;
      sCtrlAV66Maqcod = "" ;
      sCtrlAV67Opecod = "" ;
      sCtrlAV68Mensaje = "" ;
      sCtrlAV72BarKgm = "" ;
      sCtrlAV73BarMtr = "" ;
      sCtrlAV78BarAncAca1 = "" ;
      sCtrlAV79BarRdt = "" ;
      sCtrlAV80Barpes = "" ;
      sCtrlAV81BarUnimed = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.mantenimientorollos_wc__default(),
         new Object[] {
             new Object[] {
            H026I2_A396EmprCod, H026I2_A4917MetPieObs, H026I2_A10784MetPieId, H026I2_A4915MetPieDCP, H026I2_A4913MetPieLoc, H026I2_A2816MetPieEst, H026I2_A4910MetPieMtD, H026I2_A6635MetPieAnc, H026I2_A2815MetPieMet, H026I2_A2814MetPieKil,
            H026I2_A2813MetPieCod, H026I2_A130BarCodPar, H026I2_A132BarCodReo, H026I2_A129BarCod, H026I2_A2809MetTerCod
            }
            , new Object[] {
            H026I3_AGRID_nRecordCount
            }
            , new Object[] {
            H026I4_A130BarCodPar, H026I4_A132BarCodReo, H026I4_A129BarCod, H026I4_A396EmprCod, H026I4_A4915MetPieDCP, H026I4_A4913MetPieLoc, H026I4_A2816MetPieEst, H026I4_A4910MetPieMtD, H026I4_A6635MetPieAnc, H026I4_A2815MetPieMet,
            H026I4_A2814MetPieKil, H026I4_A2813MetPieCod, H026I4_A2809MetTerCod
            }
         }
      );
      AV111Pgmname = "PedidosClienteSinDetalle.MantenimientoRollos_WC" ;
      /* GeneXus formulas. */
      AV111Pgmname = "PedidosClienteSinDetalle.MantenimientoRollos_WC" ;
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcodpar_Enabled = 0 ;
      edtavBarkgm_Enabled = 0 ;
      edtavBarmtr_Enabled = 0 ;
      edtavVcontrol_Enabled = 0 ;
      edtavBarordlingrid_Enabled = 0 ;
      edtavTotvaluemetpiekil_Enabled = 0 ;
      edtavTotvaluemetpiemet_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV63BarCodReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV63BarCodReo ;
   private byte AV46TFMetPieEst ;
   private byte AV47TFMetPieEst_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A132BarCodReo ;
   private byte A2816MetPieEst ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV124Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest ;
   private byte AV125Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte GXv_int16[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV78BarAncAca1 ;
   private short wcpOAV80Barpes ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV78BarAncAca1 ;
   private short AV80Barpes ;
   private short AV42TFMetPieAnc ;
   private short AV43TFMetPieAnc_To ;
   private short AV12OrderedBy ;
   private short AV95UltimaPieza ;
   private short AV98i ;
   private short wbEnd ;
   private short wbStart ;
   private short AV82GridActionGroup1 ;
   private short A6635MetPieAnc ;
   private short AV59barOrdlinGRID ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV120Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc ;
   private short AV121Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to ;
   private short AV91Moda21 ;
   private short AV94Tinamar ;
   private short AV90Erfoc ;
   private short AV108silineas ;
   private short GXv_int12[] ;
   private int wcpOAV62BarCod ;
   private int wcpOAV67Opecod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_61 ;
   private int AV62BarCod ;
   private int AV67Opecod ;
   private int nGXsfl_61_idx=1 ;
   private int AV83ContVal ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavBarkgm_Enabled ;
   private int edtavBarmtr_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavOk_Visible ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int edtavVcontrol_Enabled ;
   private int edtavBarordlingrid_Enabled ;
   private int edtavTotvaluemetpiekil_Enabled ;
   private int edtavTotvaluemetpiemet_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int GXt_int9 ;
   private int AV55PageToGo ;
   private int GXv_int10[] ;
   private int AV130GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavVcontrol_Visible ;
   private int edtavBarordlingrid_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV56GridCurrentPage ;
   private long AV57GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal wcpOAV72BarKgm ;
   private java.math.BigDecimal wcpOAV73BarMtr ;
   private java.math.BigDecimal wcpOAV79BarRdt ;
   private java.math.BigDecimal AV72BarKgm ;
   private java.math.BigDecimal AV73BarMtr ;
   private java.math.BigDecimal AV79BarRdt ;
   private java.math.BigDecimal AV38TFMetPieKil ;
   private java.math.BigDecimal AV39TFMetPieKil_To ;
   private java.math.BigDecimal AV40TFMetPieMet ;
   private java.math.BigDecimal AV41TFMetPieMet_To ;
   private java.math.BigDecimal AV44TFMetPieMtD ;
   private java.math.BigDecimal AV45TFMetPieMtD_To ;
   private java.math.BigDecimal AV74TotMetPieKil ;
   private java.math.BigDecimal AV76TotMetPieMet ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A4910MetPieMtD ;
   private java.math.BigDecimal AV116Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil ;
   private java.math.BigDecimal AV117Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to ;
   private java.math.BigDecimal AV118Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet ;
   private java.math.BigDecimal AV119Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to ;
   private java.math.BigDecimal AV122Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd ;
   private java.math.BigDecimal AV123Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to ;
   private String wcpOAV61Emprcod ;
   private String wcpOAV64BarCodPar ;
   private String wcpOAV65Kms ;
   private String wcpOAV66Maqcod ;
   private String wcpOAV81BarUnimed ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_eliminarpiezas_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV61Emprcod ;
   private String AV64BarCodPar ;
   private String AV65Kms ;
   private String AV66Maqcod ;
   private String AV81BarUnimed ;
   private String sGXsfl_61_idx="0001" ;
   private String AV106Ok ;
   private String AV28TFMetTerCod ;
   private String AV29TFMetTerCod_Sel ;
   private String AV36TFMetPieCod ;
   private String AV37TFMetPieCod_Sel ;
   private String AV102TFMetPieLoc ;
   private String AV103TFMetPieLoc_Sel ;
   private String AV104TFMetPieDCP ;
   private String AV105TFMetPieDCP_Sel ;
   private String AV111Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String AV71UsurCod ;
   private String AV69Station ;
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
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Dvelop_confirmpanel_eliminarpiezas_Title ;
   private String Dvelop_confirmpanel_eliminarpiezas_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminarpiezas_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarpiezas_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminarpiezas_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarpiezas_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminarpiezas_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions0_Internalname ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String edtavBarcodpar_Jsonclick ;
   private String edtavBarkgm_Internalname ;
   private String edtavBarkgm_Jsonclick ;
   private String edtavBarmtr_Internalname ;
   private String edtavBarmtr_Jsonclick ;
   private String TempTags ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtneliminarpiezas_Internalname ;
   private String bttBtneliminarpiezas_Jsonclick ;
   private String bttBtnaltapieza_Internalname ;
   private String bttBtnaltapieza_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String edtavOk_Internalname ;
   private String edtavOk_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A2809MetTerCod ;
   private String edtMetTerCod_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String A2813MetPieCod ;
   private String edtMetPieCod_Internalname ;
   private String edtMetPieKil_Internalname ;
   private String edtMetPieMet_Internalname ;
   private String edtMetPieAnc_Internalname ;
   private String edtMetPieMtD_Internalname ;
   private String edtMetPieEst_Internalname ;
   private String AV60VControl ;
   private String edtavVcontrol_Internalname ;
   private String A4913MetPieLoc ;
   private String edtMetPieLoc_Internalname ;
   private String A4915MetPieDCP ;
   private String edtMetPieDCP_Internalname ;
   private String edtavBarordlingrid_Internalname ;
   private String A10784MetPieId ;
   private String edtMetPieId_Internalname ;
   private String edtMetPieObs_Internalname ;
   private String edtavTotvaluemetpiekil_Internalname ;
   private String edtavTotvaluemetpiemet_Internalname ;
   private String scmdbuf ;
   private String lV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod ;
   private String lV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod ;
   private String lV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc ;
   private String lV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp ;
   private String AV113Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel ;
   private String AV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod ;
   private String AV115Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel ;
   private String AV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod ;
   private String AV127Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel ;
   private String AV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc ;
   private String AV129Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel ;
   private String AV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp ;
   private String hsh ;
   private String AV70EmprNom ;
   private String AV99MetPiecod ;
   private String AV100MetTerCod ;
   private String AV92Piezactrl ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXt_char19 ;
   private String GXv_char15[] ;
   private String GXt_char18 ;
   private String GXv_char14[] ;
   private String GXt_char17 ;
   private String GXv_char13[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_eliminarpiezas_Internalname ;
   private String Dvelop_confirmpanel_eliminarpiezas_Internalname ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluemetpiekil_Jsonclick ;
   private String edtavTotvaluemetpiemet_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV61Emprcod ;
   private String sCtrlAV62BarCod ;
   private String sCtrlAV63BarCodReo ;
   private String sCtrlAV64BarCodPar ;
   private String sCtrlAV65Kms ;
   private String sCtrlAV66Maqcod ;
   private String sCtrlAV67Opecod ;
   private String sCtrlAV68Mensaje ;
   private String sCtrlAV72BarKgm ;
   private String sCtrlAV73BarMtr ;
   private String sCtrlAV78BarAncAca1 ;
   private String sCtrlAV79BarRdt ;
   private String sCtrlAV80Barpes ;
   private String sCtrlAV81BarUnimed ;
   private String sGXsfl_61_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtMetTerCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtMetPieCod_Jsonclick ;
   private String edtMetPieKil_Jsonclick ;
   private String edtMetPieMet_Jsonclick ;
   private String edtMetPieAnc_Jsonclick ;
   private String edtMetPieMtD_Jsonclick ;
   private String edtMetPieEst_Jsonclick ;
   private String edtavVcontrol_Jsonclick ;
   private String edtMetPieLoc_Jsonclick ;
   private String edtMetPieDCP_Jsonclick ;
   private String edtavBarordlingrid_Jsonclick ;
   private String edtMetPieId_Jsonclick ;
   private String edtMetPieObs_Jsonclick ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV93Seleccionar ;
   private boolean bGXsfl_61_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String wcpOAV68Mensaje ;
   private String AV68Mensaje ;
   private String A4917MetPieObs ;
   private String AV75TotValueMetPieKil ;
   private String AV77TotValueMetPieMet ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private String AV101MetPieObs ;
   private GXSimpleCollection<Byte> AV88Col_BarCodReo ;
   private GXSimpleCollection<Integer> AV86Col_BarCod ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminarpiezas ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private ICheckbox chkavSeleccionar ;
   private IDataStoreProvider pr_default ;
   private String[] H026I2_A396EmprCod ;
   private String[] H026I2_A4917MetPieObs ;
   private String[] H026I2_A10784MetPieId ;
   private String[] H026I2_A4915MetPieDCP ;
   private String[] H026I2_A4913MetPieLoc ;
   private byte[] H026I2_A2816MetPieEst ;
   private java.math.BigDecimal[] H026I2_A4910MetPieMtD ;
   private short[] H026I2_A6635MetPieAnc ;
   private java.math.BigDecimal[] H026I2_A2815MetPieMet ;
   private java.math.BigDecimal[] H026I2_A2814MetPieKil ;
   private String[] H026I2_A2813MetPieCod ;
   private String[] H026I2_A130BarCodPar ;
   private byte[] H026I2_A132BarCodReo ;
   private int[] H026I2_A129BarCod ;
   private String[] H026I2_A2809MetTerCod ;
   private long[] H026I3_AGRID_nRecordCount ;
   private String[] H026I4_A130BarCodPar ;
   private byte[] H026I4_A132BarCodReo ;
   private int[] H026I4_A129BarCod ;
   private String[] H026I4_A396EmprCod ;
   private String[] H026I4_A4915MetPieDCP ;
   private String[] H026I4_A4913MetPieLoc ;
   private byte[] H026I4_A2816MetPieEst ;
   private java.math.BigDecimal[] H026I4_A4910MetPieMtD ;
   private short[] H026I4_A6635MetPieAnc ;
   private java.math.BigDecimal[] H026I4_A2815MetPieMet ;
   private java.math.BigDecimal[] H026I4_A2814MetPieKil ;
   private String[] H026I4_A2813MetPieCod ;
   private String[] H026I4_A2809MetTerCod ;
   private GXSimpleCollection<String> AV87Col_BarCodPar ;
   private GXSimpleCollection<String> AV97Col_MetPieCod ;
   private GXSimpleCollection<String> AV96Col_MetTerCod ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV54DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState20[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
}

final  class mantenimientorollos_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H026I2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV113Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel ,
                                          String AV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod ,
                                          String AV115Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel ,
                                          String AV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod ,
                                          java.math.BigDecimal AV116Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil ,
                                          java.math.BigDecimal AV117Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to ,
                                          java.math.BigDecimal AV118Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet ,
                                          java.math.BigDecimal AV119Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to ,
                                          short AV120Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc ,
                                          short AV121Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to ,
                                          java.math.BigDecimal AV122Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd ,
                                          java.math.BigDecimal AV123Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to ,
                                          byte AV124Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest ,
                                          byte AV125Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to ,
                                          String AV127Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel ,
                                          String AV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc ,
                                          String AV129Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel ,
                                          String AV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp ,
                                          String A2809MetTerCod ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          short A6635MetPieAnc ,
                                          java.math.BigDecimal A4910MetPieMtD ,
                                          byte A2816MetPieEst ,
                                          String A4913MetPieLoc ,
                                          String A4915MetPieDCP ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV61Emprcod ,
                                          int AV62BarCod ,
                                          byte AV63BarCodReo ,
                                          String AV64BarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[27];
      Object[] GXv_Object22 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " EmprCod, MetPieObs, MetPieId, MetPieDCP, MetPieLoc, MetPieEst, MetPieMtD, MetPieAnc, MetPieMet, MetPieKil, MetPieCod, BarCodPar, BarCodReo, BarCod, MetTerCod" ;
      sFromString = " FROM TXPLMETPI" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV113Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(MetTerCod = ?)");
      }
      else
      {
         GXv_int21[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieCod = ?)");
      }
      else
      {
         GXv_int21[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(MetPieKil >= ?)");
      }
      else
      {
         GXv_int21[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(MetPieKil <= ?)");
      }
      else
      {
         GXv_int21[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(MetPieMet >= ?)");
      }
      else
      {
         GXv_int21[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMet <= ?)");
      }
      else
      {
         GXv_int21[11] = (byte)(1) ;
      }
      if ( ! (0==AV120Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc) )
      {
         addWhere(sWhereString, "(MetPieAnc >= ?)");
      }
      else
      {
         GXv_int21[12] = (byte)(1) ;
      }
      if ( ! (0==AV121Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(MetPieAnc <= ?)");
      }
      else
      {
         GXv_int21[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd)==0) )
      {
         addWhere(sWhereString, "(MetPieMtD >= ?)");
      }
      else
      {
         GXv_int21[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMtD <= ?)");
      }
      else
      {
         GXv_int21[15] = (byte)(1) ;
      }
      if ( ! (0==AV124Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest) )
      {
         addWhere(sWhereString, "(MetPieEst >= ?)");
      }
      else
      {
         GXv_int21[16] = (byte)(1) ;
      }
      if ( ! (0==AV125Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to) )
      {
         addWhere(sWhereString, "(MetPieEst <= ?)");
      }
      else
      {
         GXv_int21[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel)==0) && ( ! (GXutil.strcmp("", AV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieLoc = ?)");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel)==0) && ( ! (GXutil.strcmp("", AV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieDCP) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieDCP = ?)");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MetTerCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MetTerCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MetPieCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MetPieCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MetPieKil" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MetPieKil DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MetPieMet" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MetPieMet DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MetPieAnc" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MetPieAnc DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MetPieMtD" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MetPieMtD DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MetPieEst" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MetPieEst DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MetPieLoc" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MetPieLoc DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MetPieDCP" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MetPieDCP DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
   }

   protected Object[] conditional_H026I3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV113Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel ,
                                          String AV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod ,
                                          String AV115Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel ,
                                          String AV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod ,
                                          java.math.BigDecimal AV116Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil ,
                                          java.math.BigDecimal AV117Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to ,
                                          java.math.BigDecimal AV118Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet ,
                                          java.math.BigDecimal AV119Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to ,
                                          short AV120Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc ,
                                          short AV121Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to ,
                                          java.math.BigDecimal AV122Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd ,
                                          java.math.BigDecimal AV123Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to ,
                                          byte AV124Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest ,
                                          byte AV125Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to ,
                                          String AV127Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel ,
                                          String AV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc ,
                                          String AV129Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel ,
                                          String AV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp ,
                                          String A2809MetTerCod ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          short A6635MetPieAnc ,
                                          java.math.BigDecimal A4910MetPieMtD ,
                                          byte A2816MetPieEst ,
                                          String A4913MetPieLoc ,
                                          String A4915MetPieDCP ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV61Emprcod ,
                                          int AV62BarCod ,
                                          byte AV63BarCodReo ,
                                          String AV64BarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[22];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPLMETPI" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV113Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(MetTerCod = ?)");
      }
      else
      {
         GXv_int23[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieCod = ?)");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(MetPieKil >= ?)");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(MetPieKil <= ?)");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(MetPieMet >= ?)");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMet <= ?)");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( ! (0==AV120Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc) )
      {
         addWhere(sWhereString, "(MetPieAnc >= ?)");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( ! (0==AV121Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(MetPieAnc <= ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd)==0) )
      {
         addWhere(sWhereString, "(MetPieMtD >= ?)");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMtD <= ?)");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( ! (0==AV124Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest) )
      {
         addWhere(sWhereString, "(MetPieEst >= ?)");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ! (0==AV125Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to) )
      {
         addWhere(sWhereString, "(MetPieEst <= ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel)==0) && ( ! (GXutil.strcmp("", AV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieLoc = ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel)==0) && ( ! (GXutil.strcmp("", AV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieDCP) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieDCP = ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
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
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_H026I4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV113Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel ,
                                          String AV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod ,
                                          String AV115Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel ,
                                          String AV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod ,
                                          java.math.BigDecimal AV116Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil ,
                                          java.math.BigDecimal AV117Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to ,
                                          java.math.BigDecimal AV118Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet ,
                                          java.math.BigDecimal AV119Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to ,
                                          short AV120Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc ,
                                          short AV121Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to ,
                                          java.math.BigDecimal AV122Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd ,
                                          java.math.BigDecimal AV123Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to ,
                                          byte AV124Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest ,
                                          byte AV125Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to ,
                                          String AV127Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel ,
                                          String AV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc ,
                                          String AV129Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel ,
                                          String AV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp ,
                                          String A2809MetTerCod ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          short A6635MetPieAnc ,
                                          java.math.BigDecimal A4910MetPieMtD ,
                                          byte A2816MetPieEst ,
                                          String A4913MetPieLoc ,
                                          String A4915MetPieDCP ,
                                          String AV61Emprcod ,
                                          int AV62BarCod ,
                                          byte AV63BarCodReo ,
                                          String AV64BarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[22];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, MetPieDCP, MetPieLoc, MetPieEst, MetPieMtD, MetPieAnc, MetPieMet, MetPieKil, MetPieCod, MetTerCod FROM TXPLMETPI" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV113Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV112Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(MetTerCod = ?)");
      }
      else
      {
         GXv_int25[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV114Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieCod = ?)");
      }
      else
      {
         GXv_int25[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(MetPieKil >= ?)");
      }
      else
      {
         GXv_int25[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(MetPieKil <= ?)");
      }
      else
      {
         GXv_int25[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(MetPieMet >= ?)");
      }
      else
      {
         GXv_int25[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMet <= ?)");
      }
      else
      {
         GXv_int25[11] = (byte)(1) ;
      }
      if ( ! (0==AV120Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc) )
      {
         addWhere(sWhereString, "(MetPieAnc >= ?)");
      }
      else
      {
         GXv_int25[12] = (byte)(1) ;
      }
      if ( ! (0==AV121Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(MetPieAnc <= ?)");
      }
      else
      {
         GXv_int25[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd)==0) )
      {
         addWhere(sWhereString, "(MetPieMtD >= ?)");
      }
      else
      {
         GXv_int25[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMtD <= ?)");
      }
      else
      {
         GXv_int25[15] = (byte)(1) ;
      }
      if ( ! (0==AV124Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest) )
      {
         addWhere(sWhereString, "(MetPieEst >= ?)");
      }
      else
      {
         GXv_int25[16] = (byte)(1) ;
      }
      if ( ! (0==AV125Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to) )
      {
         addWhere(sWhereString, "(MetPieEst <= ?)");
      }
      else
      {
         GXv_int25[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel)==0) && ( ! (GXutil.strcmp("", AV126Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieLoc = ?)");
      }
      else
      {
         GXv_int25[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel)==0) && ( ! (GXutil.strcmp("", AV128Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieDCP) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieDCP = ?)");
      }
      else
      {
         GXv_int25[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
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
                  return conditional_H026I2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Boolean) dynConstraints[28]).booleanValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] );
            case 1 :
                  return conditional_H026I3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Boolean) dynConstraints[28]).booleanValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] );
            case 2 :
                  return conditional_H026I4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H026I2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H026I3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H026I4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 9);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 10);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 9);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
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
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 9);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 9);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 10);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 10);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 9);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 9);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 10);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 10);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 9);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 9);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 10);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 10);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 1);
               }
               return;
      }
   }

}

