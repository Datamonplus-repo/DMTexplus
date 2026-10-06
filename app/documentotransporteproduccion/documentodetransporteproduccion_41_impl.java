package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_41_impl extends GXWebComponent
{
   public documentodetransporteproduccion_41_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentodetransporteproduccion_41_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_41_impl.class ));
   }

   public documentodetransporteproduccion_41_impl( int remoteHandle ,
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
      cmbAlbProVal = new HTMLChoice();
      chkBarTipCor = UIFactory.getCheckbox(this);
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
               AV13EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13EmprCod", AV13EmprCod);
               AV8AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8AlbProCod), 10, 0));
               AV14Guiremcli = (int)(GXutil.lval( httpContext.GetPar( "Guiremcli"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Guiremcli), 6, 0));
               AV15GuiRemCln = httpContext.GetPar( "GuiRemCln") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15GuiRemCln", AV15GuiRemCln);
               AV10AlbProFch = localUtil.parseDateParm( httpContext.GetPar( "AlbProFch")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10AlbProFch", localUtil.format(AV10AlbProFch, "99/99/99"));
               AV12AlbSec = httpContext.GetPar( "AlbSec") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12AlbSec", AV12AlbSec);
               AV11AlbPropri = httpContext.GetPar( "AlbPropri") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11AlbPropri", AV11AlbPropri);
               AV5AlbEnvFtp = (byte)(GXutil.lval( httpContext.GetPar( "AlbEnvFtp"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5AlbEnvFtp", GXutil.str( AV5AlbEnvFtp, 1, 0));
               AV7AlbLic = httpContext.GetPar( "AlbLic") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7AlbLic", AV7AlbLic);
               AV6AlbHhfm = localUtil.parseDTimeParm( httpContext.GetPar( "AlbHhfm")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6AlbHhfm", localUtil.ttoc( AV6AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV9AlbProEst = (byte)(GXutil.lval( httpContext.GetPar( "AlbProEst"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9AlbProEst", GXutil.str( AV9AlbProEst, 1, 0));
               AV77BarAlbKgmE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbKgmE"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77BarAlbKgmE", GXutil.ltrimstr( AV77BarAlbKgmE, 9, 2));
               AV78BarAlbMtrE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbMtrE"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78BarAlbMtrE", GXutil.ltrimstr( AV78BarAlbMtrE, 9, 2));
               AV117AlbMarca = httpContext.GetPar( "AlbMarca") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV117AlbMarca", AV117AlbMarca);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV13EmprCod,Long.valueOf(AV8AlbProCod),Integer.valueOf(AV14Guiremcli),AV15GuiRemCln,AV10AlbProFch,AV12AlbSec,AV11AlbPropri,Byte.valueOf(AV5AlbEnvFtp),AV7AlbLic,AV6AlbHhfm,Byte.valueOf(AV9AlbProEst),AV77BarAlbKgmE,AV78BarAlbMtrE,AV117AlbMarca});
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
      gxnrgrid_newrow( ) ;
      /* End function gxnrGrid_newrow_invoke */
   }

   public void gxgrgrid_refresh_invoke( )
   {
      subGrid_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid_Rows"))) ;
      AV13EmprCod = httpContext.GetPar( "EmprCod") ;
      AV8AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
      AV118TFAlbHdrObs = httpContext.GetPar( "TFAlbHdrObs") ;
      AV119TFAlbHdrObs_Sel = httpContext.GetPar( "TFAlbHdrObs_Sel") ;
      AV114TFBarTipCor_Sel = httpContext.GetPar( "TFBarTipCor_Sel") ;
      AV122Pgmname = httpContext.GetPar( "Pgmname") ;
      AV23OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV24OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV14Guiremcli = (int)(GXutil.lval( httpContext.GetPar( "Guiremcli"))) ;
      AV15GuiRemCln = httpContext.GetPar( "GuiRemCln") ;
      AV10AlbProFch = localUtil.parseDateParm( httpContext.GetPar( "AlbProFch")) ;
      AV12AlbSec = httpContext.GetPar( "AlbSec") ;
      AV11AlbPropri = httpContext.GetPar( "AlbPropri") ;
      AV5AlbEnvFtp = (byte)(GXutil.lval( httpContext.GetPar( "AlbEnvFtp"))) ;
      AV7AlbLic = httpContext.GetPar( "AlbLic") ;
      AV6AlbHhfm = localUtil.parseDTimeParm( httpContext.GetPar( "AlbHhfm")) ;
      AV9AlbProEst = (byte)(GXutil.lval( httpContext.GetPar( "AlbProEst"))) ;
      AV77BarAlbKgmE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbKgmE"), ".") ;
      AV78BarAlbMtrE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbMtrE"), ".") ;
      AV117AlbMarca = httpContext.GetPar( "AlbMarca") ;
      AV115Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      AV112Mensaje = httpContext.GetPar( "Mensaje") ;
      AV116ImpCod = httpContext.GetPar( "ImpCod") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV13EmprCod, AV8AlbProCod, AV118TFAlbHdrObs, AV119TFAlbHdrObs_Sel, AV114TFBarTipCor_Sel, AV122Pgmname, AV23OrderedBy, AV24OrderedDsc, AV14Guiremcli, AV15GuiRemCln, AV10AlbProFch, AV12AlbSec, AV11AlbPropri, AV5AlbEnvFtp, AV7AlbLic, AV6AlbHhfm, AV9AlbProEst, AV77BarAlbKgmE, AV78BarAlbMtrE, AV117AlbMarca, AV115Moda21, AV112Mensaje, AV116ImpCod, A396EmprCod, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2962( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Detalle de Producciones", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_41", new String[] {GXutil.URLEncode(GXutil.rtrim(AV13EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14Guiremcli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV15GuiRemCln)),GXutil.URLEncode(GXutil.formatDateParm(AV10AlbProFch)),GXutil.URLEncode(GXutil.rtrim(AV12AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV11AlbPropri)),GXutil.URLEncode(GXutil.ltrimstr(AV5AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7AlbLic)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV6AlbHhfm)),GXutil.URLEncode(GXutil.ltrimstr(AV9AlbProEst,1,0)),GXutil.URLEncode(DecimalUtil.decToString(AV77BarAlbKgmE)),GXutil.URLEncode(DecimalUtil.decToString(AV78BarAlbMtrE)),GXutil.URLEncode(GXutil.rtrim(AV117AlbMarca))}, new String[] {"EmprCod","AlbProCod","Guiremcli","GuiRemCln","AlbProFch","AlbSec","AlbPropri","AlbEnvFtp","AlbLic","AlbHhfm","AlbProEst","BarAlbKgmE","BarAlbMtrE","AlbMarca"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV115Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMENSAJE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV112Mensaje, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vIMPCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV116ImpCod, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"DocumentodeTransporteProduccion_41");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV122Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransporteproduccion\\documentodetransporteproduccion_41:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_18", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_18, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV17GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV18GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV16DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV16DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13EmprCod", GXutil.rtrim( wcpOAV13EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8AlbProCod", GXutil.ltrim( localUtil.ntoc( wcpOAV8AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV14Guiremcli", GXutil.ltrim( localUtil.ntoc( wcpOAV14Guiremcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15GuiRemCln", GXutil.rtrim( wcpOAV15GuiRemCln));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10AlbProFch", localUtil.dtoc( wcpOAV10AlbProFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12AlbSec", GXutil.rtrim( wcpOAV12AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11AlbPropri", GXutil.rtrim( wcpOAV11AlbPropri));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5AlbEnvFtp", GXutil.ltrim( localUtil.ntoc( wcpOAV5AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7AlbLic", GXutil.rtrim( wcpOAV7AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6AlbHhfm", localUtil.ttoc( wcpOAV6AlbHhfm, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9AlbProEst", GXutil.ltrim( localUtil.ntoc( wcpOAV9AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV77BarAlbKgmE", GXutil.ltrim( localUtil.ntoc( wcpOAV77BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV78BarAlbMtrE", GXutil.ltrim( localUtil.ntoc( wcpOAV78BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV117AlbMarca", GXutil.rtrim( wcpOAV117AlbMarca));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBHDROBS", GXutil.rtrim( AV118TFAlbHdrObs));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBHDROBS_SEL", GXutil.rtrim( AV119TFAlbHdrObs_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPCOR_SEL", GXutil.rtrim( AV114TFBarTipCor_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV23OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV24OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV13EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV8AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGUIREMCLI", GXutil.ltrim( localUtil.ntoc( AV14Guiremcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGUIREMCLN", GXutil.rtrim( AV15GuiRemCln));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBPROFCH", localUtil.dtoc( AV10AlbProFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBSEC", GXutil.rtrim( AV12AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBPROPRI", GXutil.rtrim( AV11AlbPropri));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBENVFTP", GXutil.ltrim( localUtil.ntoc( AV5AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBLIC", GXutil.rtrim( AV7AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBHHFM", localUtil.ttoc( AV6AlbHhfm, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBPROEST", GXutil.ltrim( localUtil.ntoc( AV9AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARALBKGME", GXutil.ltrim( localUtil.ntoc( AV77BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARALBMTRE", GXutil.ltrim( localUtil.ntoc( AV78BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBMARCA", GXutil.rtrim( AV117AlbMarca));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV115Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV115Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMENSAJE", AV112Mensaje);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMENSAJE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV112Mensaje, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIMPCOD", GXutil.rtrim( AV116ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vIMPCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV116ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBPROCOD", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBCONTLIN", GXutil.ltrim( localUtil.ntoc( AV113AlbContLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARDISNUM", GXutil.rtrim( A143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
   }

   public void renderHtmlCloseForm2962( )
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
      return "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_41" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Detalle de Producciones", "") ;
   }

   public void wb2960( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.documentotransporteproduccion.documentodetransporteproduccion_41");
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
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_41.htm");
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
         startgridcontrol18( ) ;
      }
      if ( wbEnd == 18 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_18 = (int)(nGXsfl_18_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV17GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV18GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV122Pgmname), GXutil.rtrim( localUtil.format( AV122Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_41.htm");
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
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV16DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         wb_table1_56_2962( true) ;
      }
      else
      {
         wb_table1_56_2962( false) ;
      }
      return  ;
   }

   public void wb_table1_56_2962e( boolean wbgen )
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
      if ( wbEnd == 18 )
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

   public void start2962( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Detalle de Producciones", ""), (short)(0)) ;
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
            strup2960( ) ;
         }
      }
   }

   public void ws2962( )
   {
      start2962( ) ;
      evt2962( ) ;
   }

   public void evt2962( )
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
                              strup2960( ) ;
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
                              strup2960( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e112962 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2960( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e122962 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2960( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e132962 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2960( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e142962 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2960( ) ;
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
                              strup2960( ) ;
                           }
                           nGXsfl_18_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_18_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_18_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_182( ) ;
                           cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                           cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                           AV109GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV109GridActionGroup1), 4, 0));
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A13878PedidoClie = httpContext.cgiGet( edtPedidoClie_Internalname) ;
                           A3391AlbSer = httpContext.cgiGet( edtAlbSer_Internalname) ;
                           A8879AlbSerD = httpContext.cgiGet( edtAlbSerD_Internalname) ;
                           A3392AlbColNom = httpContext.cgiGet( edtAlbColNom_Internalname) ;
                           A3393AlbColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3394AlbTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A12232AlbNomCli = httpContext.cgiGet( edtAlbNomCli_Internalname) ;
                           A1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)) ;
                           A3271AlbHdrAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdrAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5019AlbHdrgm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdrgm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)) ;
                           A1265BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1206TubCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTubCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1206TubCod = false ;
                           A1266BarAlbTub = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbTub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A2441AlbHdrObs = httpContext.cgiGet( edtAlbHdrObs_Internalname) ;
                           cmbAlbProVal.setName( cmbAlbProVal.getInternalname() );
                           cmbAlbProVal.setValue( httpContext.cgiGet( cmbAlbProVal.getInternalname()) );
                           A2839AlbProVal = httpContext.cgiGet( cmbAlbProVal.getInternalname()) ;
                           A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A5291BarTipCor = ((GXutil.strcmp(httpContext.cgiGet( chkBarTipCor.getInternalname()), "SI")==0) ? "SI" : "NO") ;
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
                                       e152962 ();
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
                                       e162962 ();
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
                                       e172962 ();
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
                                       e182962 ();
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
                                    strup2960( ) ;
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

   public void we2962( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2962( ) ;
         }
      }
   }

   public void pa2962( )
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
      subsflControlProps_182( ) ;
      while ( nGXsfl_18_idx <= nRC_GXsfl_18 )
      {
         sendrow_182( ) ;
         nGXsfl_18_idx = ((subGrid_Islastpage==1)&&(nGXsfl_18_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_18_idx+1) ;
         sGXsfl_18_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_18_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_182( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV13EmprCod ,
                                 long AV8AlbProCod ,
                                 String AV118TFAlbHdrObs ,
                                 String AV119TFAlbHdrObs_Sel ,
                                 String AV114TFBarTipCor_Sel ,
                                 String AV122Pgmname ,
                                 short AV23OrderedBy ,
                                 boolean AV24OrderedDsc ,
                                 int AV14Guiremcli ,
                                 String AV15GuiRemCln ,
                                 java.util.Date AV10AlbProFch ,
                                 String AV12AlbSec ,
                                 String AV11AlbPropri ,
                                 byte AV5AlbEnvFtp ,
                                 String AV7AlbLic ,
                                 java.util.Date AV6AlbHhfm ,
                                 byte AV9AlbProEst ,
                                 java.math.BigDecimal AV77BarAlbKgmE ,
                                 java.math.BigDecimal AV78BarAlbMtrE ,
                                 String AV117AlbMarca ,
                                 short AV115Moda21 ,
                                 String AV112Mensaje ,
                                 String AV116ImpCod ,
                                 String A396EmprCod ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e162962 ();
      GRID_nCurrentRecord = 0 ;
      rf2962( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"DocumentodeTransporteProduccion_41");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV122Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransporteproduccion\\documentodetransporteproduccion_41:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PEDIDOCLIE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A13878PedidoClie, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PEDIDOCLIE", GXutil.rtrim( A13878PedidoClie));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALBSER", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A3391AlbSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBSER", GXutil.rtrim( A3391AlbSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALBSERD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A8879AlbSerD, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBSERD", GXutil.rtrim( A8879AlbSerD));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALBCOLNOM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A3392AlbColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBCOLNOM", GXutil.rtrim( A3392AlbColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALBCOLNUM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A3393AlbColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBCOLNUM", GXutil.ltrim( localUtil.ntoc( A3393AlbColNum, (byte)(6), (byte)(0), ".", "")));
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
      rf2962( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV122Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_41" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122Pgmname", AV122Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2962( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(18) ;
      /* Execute user event: Refresh */
      e162962 ();
      nGXsfl_18_idx = 1 ;
      sGXsfl_18_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_18_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_182( ) ;
      bGXsfl_18_Refreshing = true ;
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
         subsflControlProps_182( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV124Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel ,
                                              AV123Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs ,
                                              AV125Documentotransporteproduccion_documentodetransporteproduccion_41ds_3_tfbartipcor_sel ,
                                              A2441AlbHdrObs ,
                                              A5291BarTipCor ,
                                              Short.valueOf(AV23OrderedBy) ,
                                              Boolean.valueOf(AV24OrderedDsc) ,
                                              AV13EmprCod ,
                                              Long.valueOf(AV8AlbProCod) ,
                                              A396EmprCod ,
                                              Long.valueOf(A30AlbProCod) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING,
                                              TypeConstants.LONG
                                              }
         });
         lV123Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV123Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs), 60, "%") ;
         /* Using cursor H02962 */
         pr_default.execute(0, new Object[] {AV13EmprCod, Long.valueOf(AV8AlbProCod), lV123Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs, AV124Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel, AV125Documentotransporteproduccion_documentodetransporteproduccion_41ds_3_tfbartipcor_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_18_idx = 1 ;
         sGXsfl_18_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_18_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_182( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A30AlbProCod = H02962_A30AlbProCod[0] ;
            A5291BarTipCor = H02962_A5291BarTipCor[0] ;
            A213BarSit = H02962_A213BarSit[0] ;
            A2839AlbProVal = H02962_A2839AlbProVal[0] ;
            A2441AlbHdrObs = H02962_A2441AlbHdrObs[0] ;
            A1266BarAlbTub = H02962_A1266BarAlbTub[0] ;
            A1206TubCod = H02962_A1206TubCod[0] ;
            n1206TubCod = H02962_n1206TubCod[0] ;
            A1265BarAlbPie = H02962_A1265BarAlbPie[0] ;
            A1263BarAlbMtrE = H02962_A1263BarAlbMtrE[0] ;
            A5019AlbHdrgm2 = H02962_A5019AlbHdrgm2[0] ;
            A3271AlbHdrAnc = H02962_A3271AlbHdrAnc[0] ;
            A1261BarAlbKgmE = H02962_A1261BarAlbKgmE[0] ;
            A12232AlbNomCli = H02962_A12232AlbNomCli[0] ;
            A3394AlbTipCol = H02962_A3394AlbTipCol[0] ;
            A3393AlbColNum = H02962_A3393AlbColNum[0] ;
            A3392AlbColNom = H02962_A3392AlbColNom[0] ;
            A8879AlbSerD = H02962_A8879AlbSerD[0] ;
            A3391AlbSer = H02962_A3391AlbSer[0] ;
            A130BarCodPar = H02962_A130BarCodPar[0] ;
            A132BarCodReo = H02962_A132BarCodReo[0] ;
            A129BarCod = H02962_A129BarCod[0] ;
            A143BarDisNum = H02962_A143BarDisNum[0] ;
            A4812BarEncCli = H02962_A4812BarEncCli[0] ;
            A396EmprCod = H02962_A396EmprCod[0] ;
            A5291BarTipCor = H02962_A5291BarTipCor[0] ;
            A213BarSit = H02962_A213BarSit[0] ;
            A143BarDisNum = H02962_A143BarDisNum[0] ;
            A4812BarEncCli = H02962_A4812BarEncCli[0] ;
            GXt_char1 = A13878PedidoClie ;
            GXv_char2[0] = A396EmprCod ;
            GXv_char3[0] = A4812BarEncCli ;
            GXv_char4[0] = A143BarDisNum ;
            GXv_char5[0] = GXt_char1 ;
            new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4, GXv_char5) ;
            documentodetransporteproduccion_41_impl.this.A396EmprCod = GXv_char2[0] ;
            documentodetransporteproduccion_41_impl.this.A4812BarEncCli = GXv_char3[0] ;
            documentodetransporteproduccion_41_impl.this.A143BarDisNum = GXv_char4[0] ;
            documentodetransporteproduccion_41_impl.this.GXt_char1 = GXv_char5[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
            A13878PedidoClie = GXt_char1 ;
            A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
            e172962 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(18) ;
         wb2960( ) ;
      }
      bGXsfl_18_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2962( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV115Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV115Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMENSAJE", AV112Mensaje);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMENSAJE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV112Mensaje, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIMPCOD", GXutil.rtrim( AV116ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vIMPCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV116ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PEDIDOCLIE"+"_"+sGXsfl_18_idx, getSecureSignedToken( sPrefix+sGXsfl_18_idx, GXutil.rtrim( localUtil.format( A13878PedidoClie, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALBSER"+"_"+sGXsfl_18_idx, getSecureSignedToken( sPrefix+sGXsfl_18_idx, GXutil.rtrim( localUtil.format( A3391AlbSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALBSERD"+"_"+sGXsfl_18_idx, getSecureSignedToken( sPrefix+sGXsfl_18_idx, GXutil.rtrim( localUtil.format( A8879AlbSerD, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALBCOLNOM"+"_"+sGXsfl_18_idx, getSecureSignedToken( sPrefix+sGXsfl_18_idx, GXutil.rtrim( localUtil.format( A3392AlbColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALBCOLNUM"+"_"+sGXsfl_18_idx, getSecureSignedToken( sPrefix+sGXsfl_18_idx, localUtil.format( DecimalUtil.doubleToDec(A3393AlbColNum), "ZZZZZ9")));
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
      AV123Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs = AV118TFAlbHdrObs ;
      AV124Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel = AV119TFAlbHdrObs_Sel ;
      AV125Documentotransporteproduccion_documentodetransporteproduccion_41ds_3_tfbartipcor_sel = AV114TFBarTipCor_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV124Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel ,
                                           AV123Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs ,
                                           AV125Documentotransporteproduccion_documentodetransporteproduccion_41ds_3_tfbartipcor_sel ,
                                           A2441AlbHdrObs ,
                                           A5291BarTipCor ,
                                           Short.valueOf(AV23OrderedBy) ,
                                           Boolean.valueOf(AV24OrderedDsc) ,
                                           AV13EmprCod ,
                                           Long.valueOf(AV8AlbProCod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.LONG
                                           }
      });
      lV123Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV123Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs), 60, "%") ;
      /* Using cursor H02963 */
      pr_default.execute(1, new Object[] {AV13EmprCod, Long.valueOf(AV8AlbProCod), lV123Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs, AV124Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel, AV125Documentotransporteproduccion_documentodetransporteproduccion_41ds_3_tfbartipcor_sel});
      GRID_nRecordCount = H02963_AGRID_nRecordCount[0] ;
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
      AV123Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs = AV118TFAlbHdrObs ;
      AV124Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel = AV119TFAlbHdrObs_Sel ;
      AV125Documentotransporteproduccion_documentodetransporteproduccion_41ds_3_tfbartipcor_sel = AV114TFBarTipCor_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV13EmprCod, AV8AlbProCod, AV118TFAlbHdrObs, AV119TFAlbHdrObs_Sel, AV114TFBarTipCor_Sel, AV122Pgmname, AV23OrderedBy, AV24OrderedDsc, AV14Guiremcli, AV15GuiRemCln, AV10AlbProFch, AV12AlbSec, AV11AlbPropri, AV5AlbEnvFtp, AV7AlbLic, AV6AlbHhfm, AV9AlbProEst, AV77BarAlbKgmE, AV78BarAlbMtrE, AV117AlbMarca, AV115Moda21, AV112Mensaje, AV116ImpCod, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV123Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs = AV118TFAlbHdrObs ;
      AV124Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel = AV119TFAlbHdrObs_Sel ;
      AV125Documentotransporteproduccion_documentodetransporteproduccion_41ds_3_tfbartipcor_sel = AV114TFBarTipCor_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV13EmprCod, AV8AlbProCod, AV118TFAlbHdrObs, AV119TFAlbHdrObs_Sel, AV114TFBarTipCor_Sel, AV122Pgmname, AV23OrderedBy, AV24OrderedDsc, AV14Guiremcli, AV15GuiRemCln, AV10AlbProFch, AV12AlbSec, AV11AlbPropri, AV5AlbEnvFtp, AV7AlbLic, AV6AlbHhfm, AV9AlbProEst, AV77BarAlbKgmE, AV78BarAlbMtrE, AV117AlbMarca, AV115Moda21, AV112Mensaje, AV116ImpCod, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV123Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs = AV118TFAlbHdrObs ;
      AV124Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel = AV119TFAlbHdrObs_Sel ;
      AV125Documentotransporteproduccion_documentodetransporteproduccion_41ds_3_tfbartipcor_sel = AV114TFBarTipCor_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV13EmprCod, AV8AlbProCod, AV118TFAlbHdrObs, AV119TFAlbHdrObs_Sel, AV114TFBarTipCor_Sel, AV122Pgmname, AV23OrderedBy, AV24OrderedDsc, AV14Guiremcli, AV15GuiRemCln, AV10AlbProFch, AV12AlbSec, AV11AlbPropri, AV5AlbEnvFtp, AV7AlbLic, AV6AlbHhfm, AV9AlbProEst, AV77BarAlbKgmE, AV78BarAlbMtrE, AV117AlbMarca, AV115Moda21, AV112Mensaje, AV116ImpCod, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV123Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs = AV118TFAlbHdrObs ;
      AV124Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel = AV119TFAlbHdrObs_Sel ;
      AV125Documentotransporteproduccion_documentodetransporteproduccion_41ds_3_tfbartipcor_sel = AV114TFBarTipCor_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV13EmprCod, AV8AlbProCod, AV118TFAlbHdrObs, AV119TFAlbHdrObs_Sel, AV114TFBarTipCor_Sel, AV122Pgmname, AV23OrderedBy, AV24OrderedDsc, AV14Guiremcli, AV15GuiRemCln, AV10AlbProFch, AV12AlbSec, AV11AlbPropri, AV5AlbEnvFtp, AV7AlbLic, AV6AlbHhfm, AV9AlbProEst, AV77BarAlbKgmE, AV78BarAlbMtrE, AV117AlbMarca, AV115Moda21, AV112Mensaje, AV116ImpCod, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV123Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs = AV118TFAlbHdrObs ;
      AV124Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel = AV119TFAlbHdrObs_Sel ;
      AV125Documentotransporteproduccion_documentodetransporteproduccion_41ds_3_tfbartipcor_sel = AV114TFBarTipCor_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV13EmprCod, AV8AlbProCod, AV118TFAlbHdrObs, AV119TFAlbHdrObs_Sel, AV114TFBarTipCor_Sel, AV122Pgmname, AV23OrderedBy, AV24OrderedDsc, AV14Guiremcli, AV15GuiRemCln, AV10AlbProFch, AV12AlbSec, AV11AlbPropri, AV5AlbEnvFtp, AV7AlbLic, AV6AlbHhfm, AV9AlbProEst, AV77BarAlbKgmE, AV78BarAlbMtrE, AV117AlbMarca, AV115Moda21, AV112Mensaje, AV116ImpCod, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV122Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_41" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122Pgmname", AV122Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2960( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e152962 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV16DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_18 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_18"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV17GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV18GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV13EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV13EmprCod") ;
         wcpOAV8AlbProCod = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV14Guiremcli = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV14Guiremcli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV15GuiRemCln = httpContext.cgiGet( sPrefix+"wcpOAV15GuiRemCln") ;
         wcpOAV10AlbProFch = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV10AlbProFch"), 0) ;
         wcpOAV12AlbSec = httpContext.cgiGet( sPrefix+"wcpOAV12AlbSec") ;
         wcpOAV11AlbPropri = httpContext.cgiGet( sPrefix+"wcpOAV11AlbPropri") ;
         wcpOAV5AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV5AlbEnvFtp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV7AlbLic = httpContext.cgiGet( sPrefix+"wcpOAV7AlbLic") ;
         wcpOAV6AlbHhfm = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV6AlbHhfm"), 0) ;
         wcpOAV9AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9AlbProEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV77BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV77BarAlbKgmE")) ;
         wcpOAV78BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV78BarAlbMtrE")) ;
         wcpOAV117AlbMarca = httpContext.cgiGet( sPrefix+"wcpOAV117AlbMarca") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         /* Read variables values. */
         AV122Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122Pgmname", AV122Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"DocumentodeTransporteProduccion_41");
         AV122Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122Pgmname", AV122Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV122Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("documentotransporteproduccion\\documentodetransporteproduccion_41:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e152962 ();
      if (returnInSub) return;
   }

   public void e152962( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV106Station ;
      GXv_char5[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      documentodetransporteproduccion_41_impl.this.GXt_char1 = GXv_char5[0] ;
      AV106Station = GXt_char1 ;
      GXv_char5[0] = AV13EmprCod ;
      GXv_char4[0] = AV107EmprNom ;
      GXv_char3[0] = AV108UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV106Station, GXv_char5, GXv_char4, GXv_char3) ;
      documentodetransporteproduccion_41_impl.this.AV13EmprCod = GXv_char5[0] ;
      documentodetransporteproduccion_41_impl.this.AV107EmprNom = GXv_char4[0] ;
      documentodetransporteproduccion_41_impl.this.AV108UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13EmprCod", AV13EmprCod);
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
      if ( AV23OrderedBy < 1 )
      {
         AV23OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV16DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV16DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int8 = (byte)(AV115Moda21) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV13EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int9) ;
      documentodetransporteproduccion_41_impl.this.GXt_int8 = GXv_int9[0] ;
      AV115Moda21 = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV115Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV115Moda21), "ZZZ9")));
   }

   public void e162962( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext10[0] = AV63WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext10) ;
      AV63WWPContext = GXv_SdtWWPContext10[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      AV17GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17GridCurrentPage), 10, 0));
      AV18GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18GridPageCount), 10, 0));
      AV123Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs = AV118TFAlbHdrObs ;
      AV124Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel = AV119TFAlbHdrObs_Sel ;
      AV125Documentotransporteproduccion_documentodetransporteproduccion_41ds_3_tfbartipcor_sel = AV114TFBarTipCor_Sel ;
      /*  Sending Event outputs  */
   }

   public void e112962( )
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

   public void e122962( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e132962( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV23OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23OrderedBy), 4, 0));
         AV24OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24OrderedDsc", AV24OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbHdrObs") == 0 )
         {
            AV118TFAlbHdrObs = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118TFAlbHdrObs", AV118TFAlbHdrObs);
            AV119TFAlbHdrObs_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119TFAlbHdrObs_Sel", AV119TFAlbHdrObs_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTipCor") == 0 )
         {
            AV114TFBarTipCor_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114TFBarTipCor_Sel", AV114TFBarTipCor_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e172962( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactiongroup1.removeAllItems();
      cmbavGridactiongroup1.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Servicios", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV13EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int9) ;
      documentodetransporteproduccion_41_impl.this.GXt_int8 = GXv_int9[0] ;
      AV110TempBoolean = (boolean)((GXt_int8==1)) ;
      if ( AV110TempBoolean )
      {
         cmbavGridactiongroup1.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Ver Piezas", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      }
      if ( AV115Moda21 == 1 )
      {
         cmbavGridactiongroup1.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Imprimir OS", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
      }
      cmbavGridactiongroup1.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Packing List", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactiongroup1.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(18) ;
      }
      sendrow_182( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_18_Refreshing )
      {
         httpContext.doAjaxLoad(18, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV109GridActionGroup1, 4, 0)) );
   }

   public void e182962( )
   {
      /* Gridactiongroup1_Click Routine */
      returnInSub = false ;
      if ( AV109GridActionGroup1 == 1 )
      {
         /* Execute user subroutine: 'DO SERVICIOS' */
         S152 ();
         if (returnInSub) return;
      }
      else if ( AV109GridActionGroup1 == 2 )
      {
         /* Execute user subroutine: 'DO VERPIEZAS' */
         S162 ();
         if (returnInSub) return;
      }
      else if ( AV109GridActionGroup1 == 3 )
      {
         /* Execute user subroutine: 'DO IMPRIMIRHDR' */
         S172 ();
         if (returnInSub) return;
      }
      else if ( AV109GridActionGroup1 == 4 )
      {
         /* Execute user subroutine: 'DO PACKINGLIST' */
         S182 ();
         if (returnInSub) return;
      }
      else if ( AV109GridActionGroup1 == 5 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S192 ();
         if (returnInSub) return;
      }
      AV109GridActionGroup1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV109GridActionGroup1), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV109GridActionGroup1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), true);
   }

   public void e142962( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S202 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV23OrderedBy, 4, 0))+":"+(AV24OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'DO SERVICIOS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_4_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV13EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV14Guiremcli,6,0)),GXutil.URLEncode(DecimalUtil.decToString(A1261BarAlbKgmE)),GXutil.URLEncode(DecimalUtil.decToString(A1263BarAlbMtrE)),GXutil.URLEncode(GXutil.ltrimstr(AV5AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7AlbLic)),GXutil.URLEncode(GXutil.ltrimstr(AV9AlbProEst,1,0)),GXutil.URLEncode(GXutil.rtrim(AV117AlbMarca))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","Guiremcli","BarAlbKgmE","BarAlbMtrE","AlbEnvFtp","AlbLic","AlbProEst","albmarca"}) , new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S162( )
   {
      /* 'DO VERPIEZAS' Routine */
      returnInSub = false ;
      if ( ( AV115Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
      {
         GXv_int11[0] = A1265BarAlbPie ;
         GXv_decimal12[0] = A1261BarAlbKgmE ;
         GXv_decimal13[0] = A1263BarAlbMtrE ;
         GXv_char5[0] = AV111MetPieCtr ;
         GXv_char4[0] = Gx_msg ;
         new app.pmetpiacopy1(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV8AlbProCod, GXv_int11, GXv_decimal12, GXv_decimal13, GXv_char5, GXv_char4) ;
         documentodetransporteproduccion_41_impl.this.A1265BarAlbPie = GXv_int11[0] ;
         documentodetransporteproduccion_41_impl.this.A1261BarAlbKgmE = GXv_decimal12[0] ;
         documentodetransporteproduccion_41_impl.this.A1263BarAlbMtrE = GXv_decimal13[0] ;
         documentodetransporteproduccion_41_impl.this.AV111MetPieCtr = GXv_char5[0] ;
         documentodetransporteproduccion_41_impl.this.Gx_msg = GXv_char4[0] ;
         if ( ( AV5AlbEnvFtp == 3 ) || ( GXutil.strcmp(AV7AlbLic, " ") != 0 ) || ( AV9AlbProEst == 2 ) || ( GXutil.strcmp(AV117AlbMarca, "A") == 0 ) )
         {
            callWebObject(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_piezas", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV13EmprCod)),GXutil.URLEncode(GXutil.rtrim("9999999999")),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV8AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A1265BarAlbPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(A1261BarAlbKgmE)),GXutil.URLEncode(DecimalUtil.decToString(A1263BarAlbMtrE)),GXutil.URLEncode(GXutil.rtrim(AV111MetPieCtr)),GXutil.URLEncode(GXutil.rtrim(AV112Mensaje))}, new String[] {"Modo","EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","AlbProCod","Pzs","Kgs","Mts","MetPiectr","Mensaje"}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         else
         {
            callWebObject(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_piezas", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(AV13EmprCod)),GXutil.URLEncode(GXutil.rtrim("9999999999")),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV8AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A1265BarAlbPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(A1261BarAlbKgmE)),GXutil.URLEncode(DecimalUtil.decToString(A1263BarAlbMtrE)),GXutil.URLEncode(GXutil.rtrim(AV111MetPieCtr)),GXutil.URLEncode(GXutil.rtrim(AV112Mensaje))}, new String[] {"Modo","EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","AlbProCod","Pzs","Kgs","Mts","MetPiectr","Mensaje"}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
      }
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S172( )
   {
      /* 'DO IMPRIMIRHDR' Routine */
      returnInSub = false ;
      if ( AV115Moda21 == 1 )
      {
         httpContext.popup(formatLink("app.rhdrmod", new String[] {GXutil.URLEncode(GXutil.rtrim(AV13EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV116ImpCod)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ImpCod","Output"}) , new Object[] {});
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta definir el formato¡", ""));
      }
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S182( )
   {
      /* 'DO PACKINGLIST' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 )
      {
         httpContext.popup(formatLink("app.produccion.consultadeproduccion_packinglist", new String[] {GXutil.URLEncode(GXutil.rtrim(AV13EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV14Guiremcli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV15GuiRemCln)),GXutil.URLEncode(GXutil.rtrim(A13878PedidoClie)),GXutil.URLEncode(GXutil.rtrim(A3391AlbSer)),GXutil.URLEncode(GXutil.rtrim(A8879AlbSerD)),GXutil.URLEncode(GXutil.rtrim(A3392AlbColNom)),GXutil.URLEncode(GXutil.ltrimstr(A3393AlbColNum,6,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","CliNom","PedidoCliente","BarSer","BarSerDsc","BarColNom","BarColNum"}) , new Object[] {});
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO es Exportacion", ""));
      }
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S192( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( ( AV5AlbEnvFtp == 3 ) || ( GXutil.strcmp(AV7AlbLic, " ") != 0 ) || ( AV9AlbProEst == 2 ) || ( GXutil.strcmp(AV117AlbMarca, "A") == 0 ) )
      {
         httpContext.doAjaxRefreshCmp(sPrefix);
         lblTbmessage_Caption = ((AV5AlbEnvFtp==3)||(GXutil.strcmp(AV7AlbLic, " ")!=0) ? httpContext.getMessage( "Atenção.Este guia foi enviado para AT ¡¡¡¡", "") : httpContext.getMessage( "Guia faturada", "")) ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         if ( GXutil.strcmp(AV117AlbMarca, "A") == 0 )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Guia ANULADA", "") ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
      }
      else
      {
         AV127Emprcod_selected = A396EmprCod ;
         AV128Albprocod_selected = A30AlbProCod ;
         AV129Barcod_selected = A129BarCod ;
         AV130Barcodreo_selected = A132BarCodReo ;
         AV131Barcodpar_selected = A130BarCodPar ;
         this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
      }
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S202( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      GXv_char5[0] = AV13EmprCod ;
      GXv_int14[0] = A30AlbProCod ;
      GXv_int11[0] = A129BarCod ;
      GXv_int9[0] = A132BarCodReo ;
      GXv_char4[0] = A130BarCodPar ;
      GXv_int15[0] = (byte)(1) ;
      new app.pelihoj(remoteHandle, context).execute( GXv_char5, GXv_int14, GXv_int11, GXv_int9, GXv_char4, GXv_int15) ;
      documentodetransporteproduccion_41_impl.this.AV13EmprCod = GXv_char5[0] ;
      documentodetransporteproduccion_41_impl.this.A30AlbProCod = GXv_int14[0] ;
      documentodetransporteproduccion_41_impl.this.A129BarCod = GXv_int11[0] ;
      documentodetransporteproduccion_41_impl.this.A132BarCodReo = GXv_int9[0] ;
      documentodetransporteproduccion_41_impl.this.A130BarCodPar = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13EmprCod", AV13EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      GXv_char5[0] = AV13EmprCod ;
      GXv_int14[0] = A30AlbProCod ;
      GXv_int16[0] = AV113AlbContLin ;
      new app.plinalb(remoteHandle, context).execute( GXv_char5, GXv_int14, GXv_int16) ;
      documentodetransporteproduccion_41_impl.this.AV13EmprCod = GXv_char5[0] ;
      documentodetransporteproduccion_41_impl.this.A30AlbProCod = GXv_int14[0] ;
      documentodetransporteproduccion_41_impl.this.AV113AlbContLin = GXv_int16[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13EmprCod", AV13EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113AlbContLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113AlbContLin), 4, 0));
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Eliminacion realizada", ""));
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV26Session.getValue(AV122Pgmname+"GridState"), "") == 0 )
      {
         AV19GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV122Pgmname+"GridState"), null, null);
      }
      else
      {
         AV19GridState.fromxml(AV26Session.getValue(AV122Pgmname+"GridState"), null, null);
      }
      AV23OrderedBy = AV19GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23OrderedBy), 4, 0));
      AV24OrderedDsc = AV19GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24OrderedDsc", AV24OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV132GXV1 = 1 ;
      while ( AV132GXV1 <= AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV132GXV1));
         if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDROBS") == 0 )
         {
            AV118TFAlbHdrObs = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118TFAlbHdrObs", AV118TFAlbHdrObs);
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDROBS_SEL") == 0 )
         {
            AV119TFAlbHdrObs_Sel = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119TFAlbHdrObs_Sel", AV119TFAlbHdrObs_Sel);
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOR_SEL") == 0 )
         {
            AV114TFBarTipCor_Sel = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114TFBarTipCor_Sel", AV114TFBarTipCor_Sel);
         }
         AV132GXV1 = (int)(AV132GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char5[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV119TFAlbHdrObs_Sel)==0), AV119TFAlbHdrObs_Sel, GXv_char5) ;
      documentodetransporteproduccion_41_impl.this.GXt_char1 = GXv_char5[0] ;
      GXt_char17 = "" ;
      GXv_char4[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV114TFBarTipCor_Sel)==0), AV114TFBarTipCor_Sel, GXv_char4) ;
      documentodetransporteproduccion_41_impl.this.GXt_char17 = GXv_char4[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char17 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char17 = "" ;
      GXv_char5[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV118TFAlbHdrObs)==0), AV118TFAlbHdrObs, GXv_char5) ;
      documentodetransporteproduccion_41_impl.this.GXt_char17 = GXv_char5[0] ;
      Ddo_grid_Filteredtext_set = GXt_char17+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV19GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV19GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV19GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV19GridState.fromxml(AV26Session.getValue(AV122Pgmname+"GridState"), null, null);
      AV19GridState.setgxTv_SdtWWPGridState_Orderedby( AV23OrderedBy );
      AV19GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV24OrderedDsc );
      AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState18[0] = AV19GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFALBHDROBS", "", !(GXutil.strcmp("", AV118TFAlbHdrObs)==0), (short)(0), AV118TFAlbHdrObs, "", !(GXutil.strcmp("", AV119TFAlbHdrObs_Sel)==0), AV119TFAlbHdrObs_Sel, "") ;
      AV19GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV19GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFBARTIPCOR_SEL", "", !(GXutil.strcmp("", AV114TFBarTipCor_Sel)==0), (short)(0), AV114TFBarTipCor_Sel, "") ;
      AV19GridState = GXv_SdtWWPGridState18[0] ;
      if ( ! (GXutil.strcmp("", AV13EmprCod)==0) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV13EmprCod );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (0==AV8AlbProCod) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBPROCOD" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV8AlbProCod, 10, 0) );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (0==AV14Guiremcli) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&GUIREMCLI" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV14Guiremcli, 6, 0) );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV15GuiRemCln)==0) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&GUIREMCLN" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV15GuiRemCln );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10AlbProFch)) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBPROFCH" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV10AlbProFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV12AlbSec)==0) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBSEC" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV12AlbSec );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV11AlbPropri)==0) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBPROPRI" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV11AlbPropri );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (0==AV5AlbEnvFtp) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBENVFTP" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV5AlbEnvFtp, 1, 0) );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV7AlbLic)==0) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBLIC" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV7AlbLic );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV6AlbHhfm) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBHHFM" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.ttoc( AV6AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (0==AV9AlbProEst) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBPROEST" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV9AlbProEst, 1, 0) );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77BarAlbKgmE)==0) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARALBKGME" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV77BarAlbKgmE, 9, 2) );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78BarAlbMtrE)==0) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARALBMTRE" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV78BarAlbMtrE, 9, 2) );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV117AlbMarca)==0) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBMARCA" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV117AlbMarca );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      AV19GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV19GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV122Pgmname+"GridState", AV19GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV61TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV61TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV122Pgmname );
      AV61TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV61TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV21HTTPRequest.getScriptName()+"?"+AV21HTTPRequest.getQuerystring() );
      AV61TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_3" );
      AV26Session.setValue("TrnContext", AV61TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_56_2962( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminar_Internalname, tblTabledvelop_confirmpanel_eliminar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminar.setProperty("Title", Dvelop_confirmpanel_eliminar_Title);
         ucDvelop_confirmpanel_eliminar.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
         ucDvelop_confirmpanel_eliminar.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminar_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminar_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminar_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminar.setProperty("ConfirmType", Dvelop_confirmpanel_eliminar_Confirmtype);
         ucDvelop_confirmpanel_eliminar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminar_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_56_2962e( true) ;
      }
      else
      {
         wb_table1_56_2962e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV13EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13EmprCod", AV13EmprCod);
      AV8AlbProCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8AlbProCod), 10, 0));
      AV14Guiremcli = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Guiremcli), 6, 0));
      AV15GuiRemCln = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15GuiRemCln", AV15GuiRemCln);
      AV10AlbProFch = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10AlbProFch", localUtil.format(AV10AlbProFch, "99/99/99"));
      AV12AlbSec = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12AlbSec", AV12AlbSec);
      AV11AlbPropri = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11AlbPropri", AV11AlbPropri);
      AV5AlbEnvFtp = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5AlbEnvFtp", GXutil.str( AV5AlbEnvFtp, 1, 0));
      AV7AlbLic = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7AlbLic", AV7AlbLic);
      AV6AlbHhfm = (java.util.Date)getParm(obj,9,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6AlbHhfm", localUtil.ttoc( AV6AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV9AlbProEst = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9AlbProEst", GXutil.str( AV9AlbProEst, 1, 0));
      AV77BarAlbKgmE = (java.math.BigDecimal)getParm(obj,11,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77BarAlbKgmE", GXutil.ltrimstr( AV77BarAlbKgmE, 9, 2));
      AV78BarAlbMtrE = (java.math.BigDecimal)getParm(obj,12,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78BarAlbMtrE", GXutil.ltrimstr( AV78BarAlbMtrE, 9, 2));
      AV117AlbMarca = (String)getParm(obj,13,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV117AlbMarca", AV117AlbMarca);
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
      pa2962( ) ;
      ws2962( ) ;
      we2962( ) ;
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
      sCtrlAV13EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV8AlbProCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV14Guiremcli = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV15GuiRemCln = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV10AlbProFch = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV12AlbSec = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV11AlbPropri = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV5AlbEnvFtp = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV7AlbLic = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV6AlbHhfm = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV9AlbProEst = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV77BarAlbKgmE = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV78BarAlbMtrE = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV117AlbMarca = (String)getParm(obj,13,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2962( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "documentotransporteproduccion\\documentodetransporteproduccion_41", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2962( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV13EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13EmprCod", AV13EmprCod);
         AV8AlbProCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8AlbProCod), 10, 0));
         AV14Guiremcli = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Guiremcli), 6, 0));
         AV15GuiRemCln = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15GuiRemCln", AV15GuiRemCln);
         AV10AlbProFch = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10AlbProFch", localUtil.format(AV10AlbProFch, "99/99/99"));
         AV12AlbSec = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12AlbSec", AV12AlbSec);
         AV11AlbPropri = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11AlbPropri", AV11AlbPropri);
         AV5AlbEnvFtp = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5AlbEnvFtp", GXutil.str( AV5AlbEnvFtp, 1, 0));
         AV7AlbLic = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7AlbLic", AV7AlbLic);
         AV6AlbHhfm = (java.util.Date)getParm(obj,11,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6AlbHhfm", localUtil.ttoc( AV6AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV9AlbProEst = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9AlbProEst", GXutil.str( AV9AlbProEst, 1, 0));
         AV77BarAlbKgmE = (java.math.BigDecimal)getParm(obj,13,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77BarAlbKgmE", GXutil.ltrimstr( AV77BarAlbKgmE, 9, 2));
         AV78BarAlbMtrE = (java.math.BigDecimal)getParm(obj,14,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78BarAlbMtrE", GXutil.ltrimstr( AV78BarAlbMtrE, 9, 2));
         AV117AlbMarca = (String)getParm(obj,15,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV117AlbMarca", AV117AlbMarca);
      }
      wcpOAV13EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV13EmprCod") ;
      wcpOAV8AlbProCod = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      wcpOAV14Guiremcli = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV14Guiremcli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV15GuiRemCln = httpContext.cgiGet( sPrefix+"wcpOAV15GuiRemCln") ;
      wcpOAV10AlbProFch = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV10AlbProFch"), 0) ;
      wcpOAV12AlbSec = httpContext.cgiGet( sPrefix+"wcpOAV12AlbSec") ;
      wcpOAV11AlbPropri = httpContext.cgiGet( sPrefix+"wcpOAV11AlbPropri") ;
      wcpOAV5AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV5AlbEnvFtp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV7AlbLic = httpContext.cgiGet( sPrefix+"wcpOAV7AlbLic") ;
      wcpOAV6AlbHhfm = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV6AlbHhfm"), 0) ;
      wcpOAV9AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9AlbProEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV77BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV77BarAlbKgmE")) ;
      wcpOAV78BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV78BarAlbMtrE")) ;
      wcpOAV117AlbMarca = httpContext.cgiGet( sPrefix+"wcpOAV117AlbMarca") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV13EmprCod, wcpOAV13EmprCod) != 0 ) || ( AV8AlbProCod != wcpOAV8AlbProCod ) || ( AV14Guiremcli != wcpOAV14Guiremcli ) || ( GXutil.strcmp(AV15GuiRemCln, wcpOAV15GuiRemCln) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV10AlbProFch), GXutil.resetTime(wcpOAV10AlbProFch)) ) || ( GXutil.strcmp(AV12AlbSec, wcpOAV12AlbSec) != 0 ) || ( GXutil.strcmp(AV11AlbPropri, wcpOAV11AlbPropri) != 0 ) || ( AV5AlbEnvFtp != wcpOAV5AlbEnvFtp ) || ( GXutil.strcmp(AV7AlbLic, wcpOAV7AlbLic) != 0 ) || !( GXutil.dateCompare(AV6AlbHhfm, wcpOAV6AlbHhfm) ) || ( AV9AlbProEst != wcpOAV9AlbProEst ) || ( DecimalUtil.compareTo(AV77BarAlbKgmE, wcpOAV77BarAlbKgmE) != 0 ) || ( DecimalUtil.compareTo(AV78BarAlbMtrE, wcpOAV78BarAlbMtrE) != 0 ) || ( GXutil.strcmp(AV117AlbMarca, wcpOAV117AlbMarca) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV13EmprCod = AV13EmprCod ;
      wcpOAV8AlbProCod = AV8AlbProCod ;
      wcpOAV14Guiremcli = AV14Guiremcli ;
      wcpOAV15GuiRemCln = AV15GuiRemCln ;
      wcpOAV10AlbProFch = AV10AlbProFch ;
      wcpOAV12AlbSec = AV12AlbSec ;
      wcpOAV11AlbPropri = AV11AlbPropri ;
      wcpOAV5AlbEnvFtp = AV5AlbEnvFtp ;
      wcpOAV7AlbLic = AV7AlbLic ;
      wcpOAV6AlbHhfm = AV6AlbHhfm ;
      wcpOAV9AlbProEst = AV9AlbProEst ;
      wcpOAV77BarAlbKgmE = AV77BarAlbKgmE ;
      wcpOAV78BarAlbMtrE = AV78BarAlbMtrE ;
      wcpOAV117AlbMarca = AV117AlbMarca ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV13EmprCod = httpContext.cgiGet( sPrefix+"AV13EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV13EmprCod) > 0 )
      {
         AV13EmprCod = httpContext.cgiGet( sCtrlAV13EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13EmprCod", AV13EmprCod);
      }
      else
      {
         AV13EmprCod = httpContext.cgiGet( sPrefix+"AV13EmprCod_PARM") ;
      }
      sCtrlAV8AlbProCod = httpContext.cgiGet( sPrefix+"AV8AlbProCod_CTRL") ;
      if ( GXutil.len( sCtrlAV8AlbProCod) > 0 )
      {
         AV8AlbProCod = localUtil.ctol( httpContext.cgiGet( sCtrlAV8AlbProCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8AlbProCod), 10, 0));
      }
      else
      {
         AV8AlbProCod = localUtil.ctol( httpContext.cgiGet( sPrefix+"AV8AlbProCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      sCtrlAV14Guiremcli = httpContext.cgiGet( sPrefix+"AV14Guiremcli_CTRL") ;
      if ( GXutil.len( sCtrlAV14Guiremcli) > 0 )
      {
         AV14Guiremcli = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV14Guiremcli), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Guiremcli), 6, 0));
      }
      else
      {
         AV14Guiremcli = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV14Guiremcli_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV15GuiRemCln = httpContext.cgiGet( sPrefix+"AV15GuiRemCln_CTRL") ;
      if ( GXutil.len( sCtrlAV15GuiRemCln) > 0 )
      {
         AV15GuiRemCln = httpContext.cgiGet( sCtrlAV15GuiRemCln) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15GuiRemCln", AV15GuiRemCln);
      }
      else
      {
         AV15GuiRemCln = httpContext.cgiGet( sPrefix+"AV15GuiRemCln_PARM") ;
      }
      sCtrlAV10AlbProFch = httpContext.cgiGet( sPrefix+"AV10AlbProFch_CTRL") ;
      if ( GXutil.len( sCtrlAV10AlbProFch) > 0 )
      {
         AV10AlbProFch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV10AlbProFch), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10AlbProFch", localUtil.format(AV10AlbProFch, "99/99/99"));
      }
      else
      {
         AV10AlbProFch = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV10AlbProFch_PARM"), 0) ;
      }
      sCtrlAV12AlbSec = httpContext.cgiGet( sPrefix+"AV12AlbSec_CTRL") ;
      if ( GXutil.len( sCtrlAV12AlbSec) > 0 )
      {
         AV12AlbSec = httpContext.cgiGet( sCtrlAV12AlbSec) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12AlbSec", AV12AlbSec);
      }
      else
      {
         AV12AlbSec = httpContext.cgiGet( sPrefix+"AV12AlbSec_PARM") ;
      }
      sCtrlAV11AlbPropri = httpContext.cgiGet( sPrefix+"AV11AlbPropri_CTRL") ;
      if ( GXutil.len( sCtrlAV11AlbPropri) > 0 )
      {
         AV11AlbPropri = httpContext.cgiGet( sCtrlAV11AlbPropri) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11AlbPropri", AV11AlbPropri);
      }
      else
      {
         AV11AlbPropri = httpContext.cgiGet( sPrefix+"AV11AlbPropri_PARM") ;
      }
      sCtrlAV5AlbEnvFtp = httpContext.cgiGet( sPrefix+"AV5AlbEnvFtp_CTRL") ;
      if ( GXutil.len( sCtrlAV5AlbEnvFtp) > 0 )
      {
         AV5AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV5AlbEnvFtp), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5AlbEnvFtp", GXutil.str( AV5AlbEnvFtp, 1, 0));
      }
      else
      {
         AV5AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV5AlbEnvFtp_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV7AlbLic = httpContext.cgiGet( sPrefix+"AV7AlbLic_CTRL") ;
      if ( GXutil.len( sCtrlAV7AlbLic) > 0 )
      {
         AV7AlbLic = httpContext.cgiGet( sCtrlAV7AlbLic) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7AlbLic", AV7AlbLic);
      }
      else
      {
         AV7AlbLic = httpContext.cgiGet( sPrefix+"AV7AlbLic_PARM") ;
      }
      sCtrlAV6AlbHhfm = httpContext.cgiGet( sPrefix+"AV6AlbHhfm_CTRL") ;
      if ( GXutil.len( sCtrlAV6AlbHhfm) > 0 )
      {
         AV6AlbHhfm = localUtil.ctot( httpContext.cgiGet( sCtrlAV6AlbHhfm), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6AlbHhfm", localUtil.ttoc( AV6AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV6AlbHhfm = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV6AlbHhfm_PARM"), 0) ;
      }
      sCtrlAV9AlbProEst = httpContext.cgiGet( sPrefix+"AV9AlbProEst_CTRL") ;
      if ( GXutil.len( sCtrlAV9AlbProEst) > 0 )
      {
         AV9AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV9AlbProEst), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9AlbProEst", GXutil.str( AV9AlbProEst, 1, 0));
      }
      else
      {
         AV9AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV9AlbProEst_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV77BarAlbKgmE = httpContext.cgiGet( sPrefix+"AV77BarAlbKgmE_CTRL") ;
      if ( GXutil.len( sCtrlAV77BarAlbKgmE) > 0 )
      {
         AV77BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( sCtrlAV77BarAlbKgmE)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77BarAlbKgmE", GXutil.ltrimstr( AV77BarAlbKgmE, 9, 2));
      }
      else
      {
         AV77BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV77BarAlbKgmE_PARM")) ;
      }
      sCtrlAV78BarAlbMtrE = httpContext.cgiGet( sPrefix+"AV78BarAlbMtrE_CTRL") ;
      if ( GXutil.len( sCtrlAV78BarAlbMtrE) > 0 )
      {
         AV78BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( sCtrlAV78BarAlbMtrE)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78BarAlbMtrE", GXutil.ltrimstr( AV78BarAlbMtrE, 9, 2));
      }
      else
      {
         AV78BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV78BarAlbMtrE_PARM")) ;
      }
      sCtrlAV117AlbMarca = httpContext.cgiGet( sPrefix+"AV117AlbMarca_CTRL") ;
      if ( GXutil.len( sCtrlAV117AlbMarca) > 0 )
      {
         AV117AlbMarca = httpContext.cgiGet( sCtrlAV117AlbMarca) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV117AlbMarca", AV117AlbMarca);
      }
      else
      {
         AV117AlbMarca = httpContext.cgiGet( sPrefix+"AV117AlbMarca_PARM") ;
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
      pa2962( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2962( ) ;
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
      ws2962( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13EmprCod_PARM", GXutil.rtrim( AV13EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13EmprCod_CTRL", GXutil.rtrim( sCtrlAV13EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8AlbProCod_PARM", GXutil.ltrim( localUtil.ntoc( AV8AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8AlbProCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8AlbProCod_CTRL", GXutil.rtrim( sCtrlAV8AlbProCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14Guiremcli_PARM", GXutil.ltrim( localUtil.ntoc( AV14Guiremcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV14Guiremcli)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14Guiremcli_CTRL", GXutil.rtrim( sCtrlAV14Guiremcli));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15GuiRemCln_PARM", GXutil.rtrim( AV15GuiRemCln));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15GuiRemCln)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15GuiRemCln_CTRL", GXutil.rtrim( sCtrlAV15GuiRemCln));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10AlbProFch_PARM", localUtil.dtoc( AV10AlbProFch, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10AlbProFch)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10AlbProFch_CTRL", GXutil.rtrim( sCtrlAV10AlbProFch));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12AlbSec_PARM", GXutil.rtrim( AV12AlbSec));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12AlbSec)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12AlbSec_CTRL", GXutil.rtrim( sCtrlAV12AlbSec));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11AlbPropri_PARM", GXutil.rtrim( AV11AlbPropri));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11AlbPropri)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11AlbPropri_CTRL", GXutil.rtrim( sCtrlAV11AlbPropri));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5AlbEnvFtp_PARM", GXutil.ltrim( localUtil.ntoc( AV5AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5AlbEnvFtp)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5AlbEnvFtp_CTRL", GXutil.rtrim( sCtrlAV5AlbEnvFtp));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7AlbLic_PARM", GXutil.rtrim( AV7AlbLic));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7AlbLic)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7AlbLic_CTRL", GXutil.rtrim( sCtrlAV7AlbLic));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6AlbHhfm_PARM", localUtil.ttoc( AV6AlbHhfm, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6AlbHhfm)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6AlbHhfm_CTRL", GXutil.rtrim( sCtrlAV6AlbHhfm));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9AlbProEst_PARM", GXutil.ltrim( localUtil.ntoc( AV9AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9AlbProEst)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9AlbProEst_CTRL", GXutil.rtrim( sCtrlAV9AlbProEst));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV77BarAlbKgmE_PARM", GXutil.ltrim( localUtil.ntoc( AV77BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV77BarAlbKgmE)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV77BarAlbKgmE_CTRL", GXutil.rtrim( sCtrlAV77BarAlbKgmE));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV78BarAlbMtrE_PARM", GXutil.ltrim( localUtil.ntoc( AV78BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV78BarAlbMtrE)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV78BarAlbMtrE_CTRL", GXutil.rtrim( sCtrlAV78BarAlbMtrE));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV117AlbMarca_PARM", GXutil.rtrim( AV117AlbMarca));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV117AlbMarca)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV117AlbMarca_CTRL", GXutil.rtrim( sCtrlAV117AlbMarca));
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
      we2962( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116102555", true, true);
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
      httpContext.AddJavascriptSource("documentotransporteproduccion/documentodetransporteproduccion_41.js", "?202682116102555", false, true);
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

   public void subsflControlProps_182( )
   {
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1_"+sGXsfl_18_idx );
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_18_idx ;
      edtPedidoClie_Internalname = sPrefix+"PEDIDOCLIE_"+sGXsfl_18_idx ;
      edtAlbSer_Internalname = sPrefix+"ALBSER_"+sGXsfl_18_idx ;
      edtAlbSerD_Internalname = sPrefix+"ALBSERD_"+sGXsfl_18_idx ;
      edtAlbColNom_Internalname = sPrefix+"ALBCOLNOM_"+sGXsfl_18_idx ;
      edtAlbColNum_Internalname = sPrefix+"ALBCOLNUM_"+sGXsfl_18_idx ;
      edtAlbTipCol_Internalname = sPrefix+"ALBTIPCOL_"+sGXsfl_18_idx ;
      edtAlbNomCli_Internalname = sPrefix+"ALBNOMCLI_"+sGXsfl_18_idx ;
      edtBarAlbKgmE_Internalname = sPrefix+"BARALBKGME_"+sGXsfl_18_idx ;
      edtAlbHdrAnc_Internalname = sPrefix+"ALBHDRANC_"+sGXsfl_18_idx ;
      edtAlbHdrgm2_Internalname = sPrefix+"ALBHDRGM2_"+sGXsfl_18_idx ;
      edtBarAlbMtrE_Internalname = sPrefix+"BARALBMTRE_"+sGXsfl_18_idx ;
      edtBarAlbPie_Internalname = sPrefix+"BARALBPIE_"+sGXsfl_18_idx ;
      edtTubCod_Internalname = sPrefix+"TUBCOD_"+sGXsfl_18_idx ;
      edtBarAlbTub_Internalname = sPrefix+"BARALBTUB_"+sGXsfl_18_idx ;
      edtAlbHdrObs_Internalname = sPrefix+"ALBHDROBS_"+sGXsfl_18_idx ;
      cmbAlbProVal.setInternalname( sPrefix+"ALBPROVAL_"+sGXsfl_18_idx );
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_18_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_18_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_18_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_18_idx ;
      chkBarTipCor.setInternalname( sPrefix+"BARTIPCOR_"+sGXsfl_18_idx );
   }

   public void subsflControlProps_fel_182( )
   {
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1_"+sGXsfl_18_fel_idx );
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_18_fel_idx ;
      edtPedidoClie_Internalname = sPrefix+"PEDIDOCLIE_"+sGXsfl_18_fel_idx ;
      edtAlbSer_Internalname = sPrefix+"ALBSER_"+sGXsfl_18_fel_idx ;
      edtAlbSerD_Internalname = sPrefix+"ALBSERD_"+sGXsfl_18_fel_idx ;
      edtAlbColNom_Internalname = sPrefix+"ALBCOLNOM_"+sGXsfl_18_fel_idx ;
      edtAlbColNum_Internalname = sPrefix+"ALBCOLNUM_"+sGXsfl_18_fel_idx ;
      edtAlbTipCol_Internalname = sPrefix+"ALBTIPCOL_"+sGXsfl_18_fel_idx ;
      edtAlbNomCli_Internalname = sPrefix+"ALBNOMCLI_"+sGXsfl_18_fel_idx ;
      edtBarAlbKgmE_Internalname = sPrefix+"BARALBKGME_"+sGXsfl_18_fel_idx ;
      edtAlbHdrAnc_Internalname = sPrefix+"ALBHDRANC_"+sGXsfl_18_fel_idx ;
      edtAlbHdrgm2_Internalname = sPrefix+"ALBHDRGM2_"+sGXsfl_18_fel_idx ;
      edtBarAlbMtrE_Internalname = sPrefix+"BARALBMTRE_"+sGXsfl_18_fel_idx ;
      edtBarAlbPie_Internalname = sPrefix+"BARALBPIE_"+sGXsfl_18_fel_idx ;
      edtTubCod_Internalname = sPrefix+"TUBCOD_"+sGXsfl_18_fel_idx ;
      edtBarAlbTub_Internalname = sPrefix+"BARALBTUB_"+sGXsfl_18_fel_idx ;
      edtAlbHdrObs_Internalname = sPrefix+"ALBHDROBS_"+sGXsfl_18_fel_idx ;
      cmbAlbProVal.setInternalname( sPrefix+"ALBPROVAL_"+sGXsfl_18_fel_idx );
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_18_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_18_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_18_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_18_fel_idx ;
      chkBarTipCor.setInternalname( sPrefix+"BARTIPCOR_"+sGXsfl_18_fel_idx );
   }

   public void sendrow_182( )
   {
      subsflControlProps_182( ) ;
      wb2960( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_18_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_18_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_18_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 19,'"+sPrefix+"',false,'"+sGXsfl_18_idx+"',18)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_18_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               AV109GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV109GridActionGroup1, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV109GridActionGroup1), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV109GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVGRIDACTIONGROUP1.CLICK."+sGXsfl_18_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,19);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV109GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_18_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedidoClie_Internalname,GXutil.rtrim( A13878PedidoClie),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPedidoClie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbSer_Internalname,GXutil.rtrim( A3391AlbSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbSerD_Internalname,GXutil.rtrim( A8879AlbSerD),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbSerD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbColNom_Internalname,GXutil.rtrim( A3392AlbColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A3393AlbColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3393AlbColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbTipCol_Internalname,GXutil.ltrim( localUtil.ntoc( A3394AlbTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3394AlbTipCol), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbTipCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbNomCli_Internalname,GXutil.rtrim( A12232AlbNomCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbKgmE_Internalname,GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbKgmE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A3271AlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3271AlbHdrAnc), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrgm2_Internalname,GXutil.ltrim( localUtil.ntoc( A5019AlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5019AlbHdrgm2), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrgm2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbMtrE_Internalname,GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbMtrE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbPie_Internalname,GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTubCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1206TubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1206TubCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTubCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbTub_Internalname,GXutil.ltrim( localUtil.ntoc( A1266BarAlbTub, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1266BarAlbTub), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbTub_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrObs_Internalname,GXutil.rtrim( A2441AlbHdrObs),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbAlbProVal.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBPROVAL_" + sGXsfl_18_idx ;
            cmbAlbProVal.setName( GXCCtl );
            cmbAlbProVal.setWebtags( "" );
            cmbAlbProVal.addItem("S", httpContext.getMessage( "Si", ""), (short)(0));
            cmbAlbProVal.addItem("N", httpContext.getMessage( "No", ""), (short)(0));
            if ( cmbAlbProVal.getItemCount() > 0 )
            {
               A2839AlbProVal = cmbAlbProVal.getValidValue(A2839AlbProVal) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProVal,cmbAlbProVal.getInternalname(),GXutil.rtrim( A2839AlbProVal),Integer.valueOf(1),cmbAlbProVal.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbProVal.setValue( GXutil.rtrim( A2839AlbProVal) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbProVal.getInternalname(), "Values", cmbAlbProVal.ToJavascriptSource(), !bGXsfl_18_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "BARTIPCOR_" + sGXsfl_18_idx ;
         chkBarTipCor.setName( GXCCtl );
         chkBarTipCor.setWebtags( "" );
         chkBarTipCor.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkBarTipCor.getInternalname(), "TitleCaption", chkBarTipCor.getCaption(), !bGXsfl_18_Refreshing);
         chkBarTipCor.setCheckedValue( "NO" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkBarTipCor.getInternalname(),A5291BarTipCor,"","",Integer.valueOf(-1),Integer.valueOf(0),"SI","",StyleString,ClassString,"WWColumn","",""});
         send_integrity_lvl_hashes2962( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_18_idx = ((subGrid_Islastpage==1)&&(nGXsfl_18_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_18_idx+1) ;
         sGXsfl_18_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_18_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_182( ) ;
      }
      /* End function sendrow_182 */
   }

   public void startgridcontrol18( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"18\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº OS", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Enc. Cli.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descriçao", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cor Cli.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Quilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Larg.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Grm2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pças", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tubo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Qtd.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Obs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "F?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Sit.", "")) ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Exp?", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV109GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13878PedidoClie));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3391AlbSer));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A8879AlbSerD));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3392AlbColNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3393AlbColNum, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3394AlbTipCol, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A12232AlbNomCli));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3271AlbHdrAnc, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5019AlbHdrgm2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1206TubCod, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1266BarAlbTub, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2441AlbHdrObs));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2839AlbProVal));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5291BarTipCor));
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
      lblTbmessage_Internalname = sPrefix+"TBMESSAGE" ;
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1" );
      edtBarNHdr_Internalname = sPrefix+"BARNHDR" ;
      edtPedidoClie_Internalname = sPrefix+"PEDIDOCLIE" ;
      edtAlbSer_Internalname = sPrefix+"ALBSER" ;
      edtAlbSerD_Internalname = sPrefix+"ALBSERD" ;
      edtAlbColNom_Internalname = sPrefix+"ALBCOLNOM" ;
      edtAlbColNum_Internalname = sPrefix+"ALBCOLNUM" ;
      edtAlbTipCol_Internalname = sPrefix+"ALBTIPCOL" ;
      edtAlbNomCli_Internalname = sPrefix+"ALBNOMCLI" ;
      edtBarAlbKgmE_Internalname = sPrefix+"BARALBKGME" ;
      edtAlbHdrAnc_Internalname = sPrefix+"ALBHDRANC" ;
      edtAlbHdrgm2_Internalname = sPrefix+"ALBHDRGM2" ;
      edtBarAlbMtrE_Internalname = sPrefix+"BARALBMTRE" ;
      edtBarAlbPie_Internalname = sPrefix+"BARALBPIE" ;
      edtTubCod_Internalname = sPrefix+"TUBCOD" ;
      edtBarAlbTub_Internalname = sPrefix+"BARALBTUB" ;
      edtAlbHdrObs_Internalname = sPrefix+"ALBHDROBS" ;
      cmbAlbProVal.setInternalname( sPrefix+"ALBPROVAL" );
      edtBarSit_Internalname = sPrefix+"BARSIT" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      chkBarTipCor.setInternalname( sPrefix+"BARTIPCOR" );
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Dvelop_confirmpanel_eliminar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
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
      chkBarTipCor.setCaption( "" );
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtBarSit_Jsonclick = "" ;
      cmbAlbProVal.setJsonclick( "" );
      edtAlbHdrObs_Jsonclick = "" ;
      edtBarAlbTub_Jsonclick = "" ;
      edtTubCod_Jsonclick = "" ;
      edtBarAlbPie_Jsonclick = "" ;
      edtBarAlbMtrE_Jsonclick = "" ;
      edtAlbHdrgm2_Jsonclick = "" ;
      edtAlbHdrAnc_Jsonclick = "" ;
      edtBarAlbKgmE_Jsonclick = "" ;
      edtAlbNomCli_Jsonclick = "" ;
      edtAlbTipCol_Jsonclick = "" ;
      edtAlbColNum_Jsonclick = "" ;
      edtAlbColNom_Jsonclick = "" ;
      edtAlbSerD_Jsonclick = "" ;
      edtAlbSer_Jsonclick = "" ;
      edtPedidoClie_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblTbmessage_Caption = "  " ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminar el registro?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_grid_Datalistproc = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_41GetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|SI:WWP_TSChecked,NO:WWP_TSUnChecked" ;
      Ddo_grid_Datalisttype = "Dynamic|FixedValues" ;
      Ddo_grid_Includedatalist = "T" ;
      Ddo_grid_Filtertype = "Character|" ;
      Ddo_grid_Includefilter = "T|" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3" ;
      Ddo_grid_Columnids = "16:AlbHdrObs|22:BarTipCor" ;
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
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_18_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
      {
      }
      GXCCtl = "ALBPROVAL_" + sGXsfl_18_idx ;
      cmbAlbProVal.setName( GXCCtl );
      cmbAlbProVal.setWebtags( "" );
      cmbAlbProVal.addItem("S", httpContext.getMessage( "Si", ""), (short)(0));
      cmbAlbProVal.addItem("N", httpContext.getMessage( "No", ""), (short)(0));
      if ( cmbAlbProVal.getItemCount() > 0 )
      {
      }
      GXCCtl = "BARTIPCOR_" + sGXsfl_18_idx ;
      chkBarTipCor.setName( GXCCtl );
      chkBarTipCor.setWebtags( "" );
      chkBarTipCor.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkBarTipCor.getInternalname(), "TitleCaption", chkBarTipCor.getCaption(), !bGXsfl_18_Refreshing);
      chkBarTipCor.setCheckedValue( "NO" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV118TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV119TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV114TFBarTipCor_Sel',fld:'vTFBARTIPCOR_SEL',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:''},{av:'AV23OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV24OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV14Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV15GuiRemCln',fld:'vGUIREMCLN',pic:''},{av:'AV10AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV12AlbSec',fld:'vALBSEC',pic:'@!'},{av:'AV11AlbPropri',fld:'vALBPROPRI',pic:'9'},{av:'AV5AlbEnvFtp',fld:'vALBENVFTP',pic:'9'},{av:'AV7AlbLic',fld:'vALBLIC',pic:''},{av:'AV6AlbHhfm',fld:'vALBHHFM',pic:'99/99/99 99:99'},{av:'AV9AlbProEst',fld:'vALBPROEST',pic:'9'},{av:'AV77BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV78BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV117AlbMarca',fld:'vALBMARCA',pic:''},{av:'AV115Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV112Mensaje',fld:'vMENSAJE',pic:'',hsh:true},{av:'AV116ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV17GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV18GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e112962',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV118TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV119TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV114TFBarTipCor_Sel',fld:'vTFBARTIPCOR_SEL',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:''},{av:'AV23OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV24OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV14Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV15GuiRemCln',fld:'vGUIREMCLN',pic:''},{av:'AV10AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV12AlbSec',fld:'vALBSEC',pic:'@!'},{av:'AV11AlbPropri',fld:'vALBPROPRI',pic:'9'},{av:'AV5AlbEnvFtp',fld:'vALBENVFTP',pic:'9'},{av:'AV7AlbLic',fld:'vALBLIC',pic:''},{av:'AV6AlbHhfm',fld:'vALBHHFM',pic:'99/99/99 99:99'},{av:'AV9AlbProEst',fld:'vALBPROEST',pic:'9'},{av:'AV77BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV78BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV117AlbMarca',fld:'vALBMARCA',pic:''},{av:'AV115Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV112Mensaje',fld:'vMENSAJE',pic:'',hsh:true},{av:'AV116ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122962',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV118TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV119TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV114TFBarTipCor_Sel',fld:'vTFBARTIPCOR_SEL',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:''},{av:'AV23OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV24OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV14Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV15GuiRemCln',fld:'vGUIREMCLN',pic:''},{av:'AV10AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV12AlbSec',fld:'vALBSEC',pic:'@!'},{av:'AV11AlbPropri',fld:'vALBPROPRI',pic:'9'},{av:'AV5AlbEnvFtp',fld:'vALBENVFTP',pic:'9'},{av:'AV7AlbLic',fld:'vALBLIC',pic:''},{av:'AV6AlbHhfm',fld:'vALBHHFM',pic:'99/99/99 99:99'},{av:'AV9AlbProEst',fld:'vALBPROEST',pic:'9'},{av:'AV77BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV78BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV117AlbMarca',fld:'vALBMARCA',pic:''},{av:'AV115Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV112Mensaje',fld:'vMENSAJE',pic:'',hsh:true},{av:'AV116ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e132962',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV118TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV119TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV114TFBarTipCor_Sel',fld:'vTFBARTIPCOR_SEL',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:''},{av:'AV23OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV24OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV14Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV15GuiRemCln',fld:'vGUIREMCLN',pic:''},{av:'AV10AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV12AlbSec',fld:'vALBSEC',pic:'@!'},{av:'AV11AlbPropri',fld:'vALBPROPRI',pic:'9'},{av:'AV5AlbEnvFtp',fld:'vALBENVFTP',pic:'9'},{av:'AV7AlbLic',fld:'vALBLIC',pic:''},{av:'AV6AlbHhfm',fld:'vALBHHFM',pic:'99/99/99 99:99'},{av:'AV9AlbProEst',fld:'vALBPROEST',pic:'9'},{av:'AV77BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV78BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV117AlbMarca',fld:'vALBMARCA',pic:''},{av:'AV115Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV112Mensaje',fld:'vMENSAJE',pic:'',hsh:true},{av:'AV116ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV23OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV24OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV118TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV119TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV114TFBarTipCor_Sel',fld:'vTFBARTIPCOR_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e172962',iparms:[{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV115Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV109GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e182962',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV109GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV118TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV119TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV114TFBarTipCor_Sel',fld:'vTFBARTIPCOR_SEL',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:''},{av:'AV23OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV24OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV14Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV15GuiRemCln',fld:'vGUIREMCLN',pic:''},{av:'AV10AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV12AlbSec',fld:'vALBSEC',pic:'@!'},{av:'AV11AlbPropri',fld:'vALBPROPRI',pic:'9'},{av:'AV5AlbEnvFtp',fld:'vALBENVFTP',pic:'9'},{av:'AV7AlbLic',fld:'vALBLIC',pic:''},{av:'AV6AlbHhfm',fld:'vALBHHFM',pic:'99/99/99 99:99'},{av:'AV9AlbProEst',fld:'vALBPROEST',pic:'9'},{av:'AV77BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV78BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV117AlbMarca',fld:'vALBMARCA',pic:''},{av:'AV115Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV112Mensaje',fld:'vMENSAJE',pic:'',hsh:true},{av:'AV116ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'A3391AlbSer',fld:'ALBSER',pic:'',hsh:true},{av:'A8879AlbSerD',fld:'ALBSERD',pic:'',hsh:true},{av:'A3392AlbColNom',fld:'ALBCOLNOM',pic:'',hsh:true},{av:'A3393AlbColNum',fld:'ALBCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV109GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'},{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV17GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV18GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e142962',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV118TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV119TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV114TFBarTipCor_Sel',fld:'vTFBARTIPCOR_SEL',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:''},{av:'AV23OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV24OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV14Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV15GuiRemCln',fld:'vGUIREMCLN',pic:''},{av:'AV10AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV12AlbSec',fld:'vALBSEC',pic:'@!'},{av:'AV11AlbPropri',fld:'vALBPROPRI',pic:'9'},{av:'AV5AlbEnvFtp',fld:'vALBENVFTP',pic:'9'},{av:'AV7AlbLic',fld:'vALBLIC',pic:''},{av:'AV6AlbHhfm',fld:'vALBHHFM',pic:'99/99/99 99:99'},{av:'AV9AlbProEst',fld:'vALBPROEST',pic:'9'},{av:'AV77BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV78BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV117AlbMarca',fld:'vALBMARCA',pic:''},{av:'AV115Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV112Mensaje',fld:'vMENSAJE',pic:'',hsh:true},{av:'AV116ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV113AlbContLin',fld:'vALBCONTLIN',pic:'ZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV113AlbContLin',fld:'vALBCONTLIN',pic:'ZZZ9'},{av:'AV17GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV18GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Bartipcor',iparms:[]");
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
      wcpOAV13EmprCod = "" ;
      wcpOAV15GuiRemCln = "" ;
      wcpOAV10AlbProFch = GXutil.nullDate() ;
      wcpOAV12AlbSec = "" ;
      wcpOAV11AlbPropri = "" ;
      wcpOAV7AlbLic = "" ;
      wcpOAV6AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV77BarAlbKgmE = DecimalUtil.ZERO ;
      wcpOAV78BarAlbMtrE = DecimalUtil.ZERO ;
      wcpOAV117AlbMarca = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV13EmprCod = "" ;
      AV15GuiRemCln = "" ;
      AV10AlbProFch = GXutil.nullDate() ;
      AV12AlbSec = "" ;
      AV11AlbPropri = "" ;
      AV7AlbLic = "" ;
      AV6AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      AV77BarAlbKgmE = DecimalUtil.ZERO ;
      AV78BarAlbMtrE = DecimalUtil.ZERO ;
      AV117AlbMarca = "" ;
      AV118TFAlbHdrObs = "" ;
      AV119TFAlbHdrObs_Sel = "" ;
      AV114TFBarTipCor_Sel = "" ;
      AV122Pgmname = "" ;
      AV112Mensaje = "" ;
      AV116ImpCod = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV16DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTbmessage_Jsonclick = "" ;
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
      A13696BarNHdr = "" ;
      A13878PedidoClie = "" ;
      A3391AlbSer = "" ;
      A8879AlbSerD = "" ;
      A3392AlbColNom = "" ;
      A12232AlbNomCli = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A2441AlbHdrObs = "" ;
      A2839AlbProVal = "" ;
      A130BarCodPar = "" ;
      A5291BarTipCor = "" ;
      scmdbuf = "" ;
      lV123Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs = "" ;
      AV124Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel = "" ;
      AV123Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs = "" ;
      AV125Documentotransporteproduccion_documentodetransporteproduccion_41ds_3_tfbartipcor_sel = "" ;
      H02962_A30AlbProCod = new long[1] ;
      H02962_A5291BarTipCor = new String[] {""} ;
      H02962_A213BarSit = new byte[1] ;
      H02962_A2839AlbProVal = new String[] {""} ;
      H02962_A2441AlbHdrObs = new String[] {""} ;
      H02962_A1266BarAlbTub = new int[1] ;
      H02962_A1206TubCod = new short[1] ;
      H02962_n1206TubCod = new boolean[] {false} ;
      H02962_A1265BarAlbPie = new int[1] ;
      H02962_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02962_A5019AlbHdrgm2 = new short[1] ;
      H02962_A3271AlbHdrAnc = new short[1] ;
      H02962_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02962_A12232AlbNomCli = new String[] {""} ;
      H02962_A3394AlbTipCol = new byte[1] ;
      H02962_A3393AlbColNum = new int[1] ;
      H02962_A3392AlbColNom = new String[] {""} ;
      H02962_A8879AlbSerD = new String[] {""} ;
      H02962_A3391AlbSer = new String[] {""} ;
      H02962_A130BarCodPar = new String[] {""} ;
      H02962_A132BarCodReo = new byte[1] ;
      H02962_A129BarCod = new int[1] ;
      H02962_A143BarDisNum = new String[] {""} ;
      H02962_A4812BarEncCli = new String[] {""} ;
      H02962_A396EmprCod = new String[] {""} ;
      GXv_char2 = new String[1] ;
      H02963_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV106Station = "" ;
      AV107EmprNom = "" ;
      AV108UsurCod = "" ;
      GXv_char3 = new String[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV63WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext10 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      AV111MetPieCtr = "" ;
      Gx_msg = "" ;
      AV127Emprcod_selected = "" ;
      AV131Barcodpar_selected = "" ;
      GXv_int11 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int15 = new byte[1] ;
      GXv_int14 = new long[1] ;
      GXv_int16 = new short[1] ;
      AV26Session = httpContext.getWebSession();
      AV19GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV20GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char5 = new String[1] ;
      GXv_SdtWWPGridState18 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV61TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV21HTTPRequest = httpContext.getHttpRequest();
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV13EmprCod = "" ;
      sCtrlAV8AlbProCod = "" ;
      sCtrlAV14Guiremcli = "" ;
      sCtrlAV15GuiRemCln = "" ;
      sCtrlAV10AlbProFch = "" ;
      sCtrlAV12AlbSec = "" ;
      sCtrlAV11AlbPropri = "" ;
      sCtrlAV5AlbEnvFtp = "" ;
      sCtrlAV7AlbLic = "" ;
      sCtrlAV6AlbHhfm = "" ;
      sCtrlAV9AlbProEst = "" ;
      sCtrlAV77BarAlbKgmE = "" ;
      sCtrlAV78BarAlbMtrE = "" ;
      sCtrlAV117AlbMarca = "" ;
      subGrid_Linesclass = "" ;
      TempTags = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_41__default(),
         new Object[] {
             new Object[] {
            H02962_A30AlbProCod, H02962_A5291BarTipCor, H02962_A213BarSit, H02962_A2839AlbProVal, H02962_A2441AlbHdrObs, H02962_A1266BarAlbTub, H02962_A1206TubCod, H02962_n1206TubCod, H02962_A1265BarAlbPie, H02962_A1263BarAlbMtrE,
            H02962_A5019AlbHdrgm2, H02962_A3271AlbHdrAnc, H02962_A1261BarAlbKgmE, H02962_A12232AlbNomCli, H02962_A3394AlbTipCol, H02962_A3393AlbColNum, H02962_A3392AlbColNom, H02962_A8879AlbSerD, H02962_A3391AlbSer, H02962_A130BarCodPar,
            H02962_A132BarCodReo, H02962_A129BarCod, H02962_A143BarDisNum, H02962_A4812BarEncCli, H02962_A396EmprCod
            }
            , new Object[] {
            H02963_AGRID_nRecordCount
            }
         }
      );
      AV122Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_41" ;
      /* GeneXus formulas. */
      AV122Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_41" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV5AlbEnvFtp ;
   private byte wcpOAV9AlbProEst ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV5AlbEnvFtp ;
   private byte AV9AlbProEst ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A3394AlbTipCol ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int8 ;
   private byte AV130Barcodreo_selected ;
   private byte GXv_int9[] ;
   private byte GXv_int15[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV23OrderedBy ;
   private short AV115Moda21 ;
   private short AV113AlbContLin ;
   private short wbEnd ;
   private short wbStart ;
   private short AV109GridActionGroup1 ;
   private short A3271AlbHdrAnc ;
   private short A5019AlbHdrgm2 ;
   private short A1206TubCod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int16[] ;
   private int wcpOAV14Guiremcli ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_18 ;
   private int AV14Guiremcli ;
   private int nGXsfl_18_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A3393AlbColNum ;
   private int A1265BarAlbPie ;
   private int A1266BarAlbTub ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV25PageToGo ;
   private int AV129Barcod_selected ;
   private int GXv_int11[] ;
   private int AV132GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long wcpOAV8AlbProCod ;
   private long GRID_nFirstRecordOnPage ;
   private long AV8AlbProCod ;
   private long AV17GridCurrentPage ;
   private long AV18GridPageCount ;
   private long A30AlbProCod ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long AV128Albprocod_selected ;
   private long GXv_int14[] ;
   private java.math.BigDecimal wcpOAV77BarAlbKgmE ;
   private java.math.BigDecimal wcpOAV78BarAlbMtrE ;
   private java.math.BigDecimal AV77BarAlbKgmE ;
   private java.math.BigDecimal AV78BarAlbMtrE ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private String wcpOAV13EmprCod ;
   private String wcpOAV15GuiRemCln ;
   private String wcpOAV12AlbSec ;
   private String wcpOAV11AlbPropri ;
   private String wcpOAV7AlbLic ;
   private String wcpOAV117AlbMarca ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV13EmprCod ;
   private String AV15GuiRemCln ;
   private String AV12AlbSec ;
   private String AV11AlbPropri ;
   private String AV7AlbLic ;
   private String AV117AlbMarca ;
   private String sGXsfl_18_idx="0001" ;
   private String AV118TFAlbHdrObs ;
   private String AV119TFAlbHdrObs_Sel ;
   private String AV114TFBarTipCor_Sel ;
   private String AV122Pgmname ;
   private String AV116ImpCod ;
   private String A396EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
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
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String lblTbmessage_Internalname ;
   private String lblTbmessage_Caption ;
   private String lblTbmessage_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String A13878PedidoClie ;
   private String edtPedidoClie_Internalname ;
   private String A3391AlbSer ;
   private String edtAlbSer_Internalname ;
   private String A8879AlbSerD ;
   private String edtAlbSerD_Internalname ;
   private String A3392AlbColNom ;
   private String edtAlbColNom_Internalname ;
   private String edtAlbColNum_Internalname ;
   private String edtAlbTipCol_Internalname ;
   private String A12232AlbNomCli ;
   private String edtAlbNomCli_Internalname ;
   private String edtBarAlbKgmE_Internalname ;
   private String edtAlbHdrAnc_Internalname ;
   private String edtAlbHdrgm2_Internalname ;
   private String edtBarAlbMtrE_Internalname ;
   private String edtBarAlbPie_Internalname ;
   private String edtTubCod_Internalname ;
   private String edtBarAlbTub_Internalname ;
   private String A2441AlbHdrObs ;
   private String edtAlbHdrObs_Internalname ;
   private String A2839AlbProVal ;
   private String edtBarSit_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String A5291BarTipCor ;
   private String scmdbuf ;
   private String lV123Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs ;
   private String AV124Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel ;
   private String AV123Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs ;
   private String AV125Documentotransporteproduccion_documentodetransporteproduccion_41ds_3_tfbartipcor_sel ;
   private String GXv_char2[] ;
   private String hsh ;
   private String AV106Station ;
   private String AV107EmprNom ;
   private String AV108UsurCod ;
   private String GXv_char3[] ;
   private String AV111MetPieCtr ;
   private String Gx_msg ;
   private String AV127Emprcod_selected ;
   private String AV131Barcodpar_selected ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char17 ;
   private String GXv_char5[] ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String sCtrlAV13EmprCod ;
   private String sCtrlAV8AlbProCod ;
   private String sCtrlAV14Guiremcli ;
   private String sCtrlAV15GuiRemCln ;
   private String sCtrlAV10AlbProFch ;
   private String sCtrlAV12AlbSec ;
   private String sCtrlAV11AlbPropri ;
   private String sCtrlAV5AlbEnvFtp ;
   private String sCtrlAV7AlbLic ;
   private String sCtrlAV6AlbHhfm ;
   private String sCtrlAV9AlbProEst ;
   private String sCtrlAV77BarAlbKgmE ;
   private String sCtrlAV78BarAlbMtrE ;
   private String sCtrlAV117AlbMarca ;
   private String sGXsfl_18_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String TempTags ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtBarNHdr_Jsonclick ;
   private String edtPedidoClie_Jsonclick ;
   private String edtAlbSer_Jsonclick ;
   private String edtAlbSerD_Jsonclick ;
   private String edtAlbColNom_Jsonclick ;
   private String edtAlbColNum_Jsonclick ;
   private String edtAlbTipCol_Jsonclick ;
   private String edtAlbNomCli_Jsonclick ;
   private String edtBarAlbKgmE_Jsonclick ;
   private String edtAlbHdrAnc_Jsonclick ;
   private String edtAlbHdrgm2_Jsonclick ;
   private String edtBarAlbMtrE_Jsonclick ;
   private String edtBarAlbPie_Jsonclick ;
   private String edtTubCod_Jsonclick ;
   private String edtBarAlbTub_Jsonclick ;
   private String edtAlbHdrObs_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV6AlbHhfm ;
   private java.util.Date AV6AlbHhfm ;
   private java.util.Date wcpOAV10AlbProFch ;
   private java.util.Date AV10AlbProFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV24OrderedDsc ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n1206TubCod ;
   private boolean bGXsfl_18_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV110TempBoolean ;
   private String AV112Mensaje ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV21HTTPRequest ;
   private com.genexus.webpanels.WebSession AV26Session ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private HTMLChoice cmbAlbProVal ;
   private ICheckbox chkBarTipCor ;
   private IDataStoreProvider pr_default ;
   private long[] H02962_A30AlbProCod ;
   private String[] H02962_A5291BarTipCor ;
   private byte[] H02962_A213BarSit ;
   private String[] H02962_A2839AlbProVal ;
   private String[] H02962_A2441AlbHdrObs ;
   private int[] H02962_A1266BarAlbTub ;
   private short[] H02962_A1206TubCod ;
   private boolean[] H02962_n1206TubCod ;
   private int[] H02962_A1265BarAlbPie ;
   private java.math.BigDecimal[] H02962_A1263BarAlbMtrE ;
   private short[] H02962_A5019AlbHdrgm2 ;
   private short[] H02962_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] H02962_A1261BarAlbKgmE ;
   private String[] H02962_A12232AlbNomCli ;
   private byte[] H02962_A3394AlbTipCol ;
   private int[] H02962_A3393AlbColNum ;
   private String[] H02962_A3392AlbColNom ;
   private String[] H02962_A8879AlbSerD ;
   private String[] H02962_A3391AlbSer ;
   private String[] H02962_A130BarCodPar ;
   private byte[] H02962_A132BarCodReo ;
   private int[] H02962_A129BarCod ;
   private String[] H02962_A143BarDisNum ;
   private String[] H02962_A4812BarEncCli ;
   private String[] H02962_A396EmprCod ;
   private long[] H02963_AGRID_nRecordCount ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV16DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV19GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState18[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV20GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV61TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV63WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext10[] ;
}

final  class documentodetransporteproduccion_41__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02962( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV124Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel ,
                                          String AV123Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs ,
                                          String AV125Documentotransporteproduccion_documentodetransporteproduccion_41ds_3_tfbartipcor_sel ,
                                          String A2441AlbHdrObs ,
                                          String A5291BarTipCor ,
                                          short AV23OrderedBy ,
                                          boolean AV24OrderedDsc ,
                                          String AV13EmprCod ,
                                          long AV8AlbProCod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[10];
      Object[] GXv_Object20 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.AlbProCod, T2.BarTipCor, T2.BarSit, T1.AlbProVal, T1.AlbHdrObs, T1.BarAlbTub, T1.TubCod, T1.BarAlbPie, T1.BarAlbMtrE, T1.AlbHdrgm2, T1.AlbHdrAnc, T1.BarAlbKgmE," ;
      sSelectString += " T1.AlbNomCli, T1.AlbTipCol, T1.AlbColNum, T1.AlbColNom, T1.AlbSerD, T1.AlbSer, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarDisNum, T2.BarEncCli, T1.EmprCod" ;
      sFromString = " FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV124Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV123Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrObs = ?)");
      }
      else
      {
         GXv_int19[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Documentotransporteproduccion_documentodetransporteproduccion_41ds_3_tfbartipcor_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarTipCor = ?)");
      }
      else
      {
         GXv_int19[4] = (byte)(1) ;
      }
      if ( AV23OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      }
      else if ( ( AV23OrderedBy == 2 ) && ! AV24OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbHdrObs" ;
      }
      else if ( ( AV23OrderedBy == 2 ) && ( AV24OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbHdrObs DESC" ;
      }
      else if ( ( AV23OrderedBy == 3 ) && ! AV24OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarTipCor" ;
      }
      else if ( ( AV23OrderedBy == 3 ) && ( AV24OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarTipCor DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_H02963( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV124Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel ,
                                          String AV123Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs ,
                                          String AV125Documentotransporteproduccion_documentodetransporteproduccion_41ds_3_tfbartipcor_sel ,
                                          String A2441AlbHdrObs ,
                                          String A5291BarTipCor ,
                                          short AV23OrderedBy ,
                                          boolean AV24OrderedDsc ,
                                          String AV13EmprCod ,
                                          long AV8AlbProCod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[5];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV124Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV123Documentotransporteproduccion_documentodetransporteproduccion_41ds_1_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Documentotransporteproduccion_documentodetransporteproduccion_41ds_2_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrObs = ?)");
      }
      else
      {
         GXv_int21[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Documentotransporteproduccion_documentodetransporteproduccion_41ds_3_tfbartipcor_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarTipCor = ?)");
      }
      else
      {
         GXv_int21[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV23OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 2 ) && ! AV24OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 2 ) && ( AV24OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 3 ) && ! AV24OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 3 ) && ( AV24OrderedDsc ) )
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
                  return conditional_H02962(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Boolean) dynConstraints[6]).booleanValue() , (String)dynConstraints[7] , ((Number) dynConstraints[8]).longValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).longValue() );
            case 1 :
                  return conditional_H02963(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Boolean) dynConstraints[6]).booleanValue() , (String)dynConstraints[7] , ((Number) dynConstraints[8]).longValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02962", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02963", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 13);
               ((String[]) buf[17])[0] = rslt.getString(17, 26);
               ((String[]) buf[18])[0] = rslt.getString(18, 16);
               ((String[]) buf[19])[0] = rslt.getString(19, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(20);
               ((int[]) buf[21])[0] = rslt.getInt(21);
               ((String[]) buf[22])[0] = rslt.getString(22, 8);
               ((String[]) buf[23])[0] = rslt.getString(23, 20);
               ((String[]) buf[24])[0] = rslt.getString(24, 3);
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
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 60);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 60);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[6]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 60);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 60);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 2);
               }
               return;
      }
   }

}

