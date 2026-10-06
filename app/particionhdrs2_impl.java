package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class particionhdrs2_impl extends GXDataArea
{
   public particionhdrs2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public particionhdrs2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( particionhdrs2_impl.class ));
   }

   public particionhdrs2_impl( int remoteHandle ,
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
            AV12EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV10BarOriCod = (int)(GXutil.lval( httpContext.GetPar( "BarOriCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10BarOriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarOriCod), 8, 0));
               AV11BarOriReo = (byte)(GXutil.lval( httpContext.GetPar( "BarOriReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11BarOriReo", GXutil.str( AV11BarOriReo, 1, 0));
               AV18BarOriPar = httpContext.GetPar( "BarOriPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18BarOriPar", AV18BarOriPar);
               AV19Barser = httpContext.GetPar( "Barser") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19Barser", AV19Barser);
               AV20Barserdsc = httpContext.GetPar( "Barserdsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20Barserdsc", AV20Barserdsc);
               AV21Barcolnom = httpContext.GetPar( "Barcolnom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21Barcolnom", AV21Barcolnom);
               AV22Barcolnum = (int)(GXutil.lval( httpContext.GetPar( "Barcolnum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22Barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Barcolnum), 6, 0));
               AV23BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23BarKgm", GXutil.ltrimstr( AV23BarKgm, 9, 2));
               AV24BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24BarMtr", GXutil.ltrimstr( AV24BarMtr, 9, 2));
               AV25BarPiepie = (int)(GXutil.lval( httpContext.GetPar( "BarPiepie"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25BarPiepie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarPiepie), 6, 0));
               AV14Conos = (short)(GXutil.lval( httpContext.GetPar( "Conos"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14Conos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Conos), 4, 0));
               AV15Kilos = CommonUtil.decimalVal( httpContext.GetPar( "Kilos"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15Kilos", GXutil.ltrimstr( AV15Kilos, 9, 2));
               AV16Metros = CommonUtil.decimalVal( httpContext.GetPar( "Metros"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16Metros", GXutil.ltrimstr( AV16Metros, 9, 2));
               AV17Rectotkgm = CommonUtil.decimalVal( httpContext.GetPar( "Rectotkgm"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Rectotkgm", GXutil.ltrimstr( AV17Rectotkgm, 10, 2));
               AV38Barpes = (short)(GXutil.lval( httpContext.GetPar( "Barpes"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV38Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Barpes), 4, 0));
               AV35CosAnyOri = CommonUtil.decimalVal( httpContext.GetPar( "CosAnyOri"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV35CosAnyOri", GXutil.ltrimstr( AV35CosAnyOri, 10, 2));
               AV36CosPrdOri = CommonUtil.decimalVal( httpContext.GetPar( "CosPrdOri"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV36CosPrdOri", GXutil.ltrimstr( AV36CosPrdOri, 10, 2));
               AV13OK = httpContext.GetPar( "OK") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13OK", AV13OK);
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

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "app.wwpbaseobjects.workwithplusmasterpage");
         MasterPageObj.setDataArea(this,false);
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
      pa15E2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start15E2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.particionhdrs2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV12EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarOriCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11BarOriReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV18BarOriPar)),GXutil.URLEncode(GXutil.rtrim(AV19Barser)),GXutil.URLEncode(GXutil.rtrim(AV20Barserdsc)),GXutil.URLEncode(GXutil.rtrim(AV21Barcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV22Barcolnum,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV23BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV24BarMtr)),GXutil.URLEncode(GXutil.ltrimstr(AV25BarPiepie,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14Conos,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV15Kilos)),GXutil.URLEncode(DecimalUtil.decToString(AV16Metros)),GXutil.URLEncode(DecimalUtil.decToString(AV17Rectotkgm)),GXutil.URLEncode(GXutil.ltrimstr(AV38Barpes,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV35CosAnyOri)),GXutil.URLEncode(DecimalUtil.decToString(AV36CosPrdOri)),GXutil.URLEncode(GXutil.rtrim(AV13OK))}, new String[] {"EmprCod","BarOriCod","BarOriReo","BarOriPar","Barser","Barserdsc","Barcolnom","Barcolnum","BarKgm","BarMtr","BarPiepie","Conos","Kilos","Metros","Rectotkgm","Barpes","CosAnyOri","CosPrdOri","OK"}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43msg1, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vPARTIC", GXutil.ltrim( localUtil.ntoc( AV8Partic, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORICOD", GXutil.ltrim( localUtil.ntoc( AV10BarOriCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORIREO", GXutil.ltrim( localUtil.ntoc( AV11BarOriReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORIPAR", GXutil.rtrim( AV18BarOriPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPES", GXutil.ltrim( localUtil.ntoc( AV38Barpes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAG2", GXutil.ltrim( localUtil.ntoc( AV52Flag2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV12EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vKILOS", GXutil.ltrim( localUtil.ntoc( AV15Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETROS", GXutil.ltrim( localUtil.ntoc( AV16Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSANYORI", GXutil.ltrim( localUtil.ntoc( AV35CosAnyOri, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSPRDORI", GXutil.ltrim( localUtil.ntoc( AV36CosPrdOri, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV57Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV49UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV50station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECTOTKGM", GXutil.ltrim( localUtil.ntoc( AV17Rectotkgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONOS", GXutil.ltrim( localUtil.ntoc( AV14Conos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAGREST", GXutil.rtrim( AV53BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSIT", GXutil.ltrim( localUtil.ntoc( AV54BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAG", GXutil.ltrim( localUtil.ntoc( AV29Flag, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG1", GXutil.rtrim( AV43msg1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43msg1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODDES", GXutil.ltrim( localUtil.ntoc( AV26BarCodDes, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARREODES", GXutil.ltrim( localUtil.ntoc( AV27BarReoDes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPARDES", GXutil.rtrim( AV28BarParDes));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGREST", GXutil.rtrim( A120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSIT", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOK", GXutil.rtrim( AV13OK));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Width", GXutil.rtrim( Dvpanel_unnamedtable3_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable3_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable3_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Cls", GXutil.rtrim( Dvpanel_unnamedtable3_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Title", GXutil.rtrim( Dvpanel_unnamedtable3_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable3_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable3_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable3_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
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
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we15E2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt15E2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return false ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.particionhdrs2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV12EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarOriCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11BarOriReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV18BarOriPar)),GXutil.URLEncode(GXutil.rtrim(AV19Barser)),GXutil.URLEncode(GXutil.rtrim(AV20Barserdsc)),GXutil.URLEncode(GXutil.rtrim(AV21Barcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV22Barcolnum,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV23BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV24BarMtr)),GXutil.URLEncode(GXutil.ltrimstr(AV25BarPiepie,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14Conos,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV15Kilos)),GXutil.URLEncode(DecimalUtil.decToString(AV16Metros)),GXutil.URLEncode(DecimalUtil.decToString(AV17Rectotkgm)),GXutil.URLEncode(GXutil.ltrimstr(AV38Barpes,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV35CosAnyOri)),GXutil.URLEncode(DecimalUtil.decToString(AV36CosPrdOri)),GXutil.URLEncode(GXutil.rtrim(AV13OK))}, new String[] {"EmprCod","BarOriCod","BarOriReo","BarOriPar","Barser","Barserdsc","Barcolnom","Barcolnum","BarKgm","BarMtr","BarPiepie","Conos","Kilos","Metros","Rectotkgm","Barpes","CosAnyOri","CosPrdOri","OK"})  ;
   }

   public String getPgmname( )
   {
      return "ParticionHdrs2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Particion Hdrs", "") ;
   }

   public void wb15E0( )
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable1.setProperty("Width", Dvpanel_unnamedtable1_Width);
         ucDvpanel_unnamedtable1.setProperty("AutoWidth", Dvpanel_unnamedtable1_Autowidth);
         ucDvpanel_unnamedtable1.setProperty("AutoHeight", Dvpanel_unnamedtable1_Autoheight);
         ucDvpanel_unnamedtable1.setProperty("Cls", Dvpanel_unnamedtable1_Cls);
         ucDvpanel_unnamedtable1.setProperty("Title", Dvpanel_unnamedtable1_Title);
         ucDvpanel_unnamedtable1.setProperty("Collapsible", Dvpanel_unnamedtable1_Collapsible);
         ucDvpanel_unnamedtable1.setProperty("Collapsed", Dvpanel_unnamedtable1_Collapsed);
         ucDvpanel_unnamedtable1.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable1_Showcollapseicon);
         ucDvpanel_unnamedtable1.setProperty("IconPosition", Dvpanel_unnamedtable1_Iconposition);
         ucDvpanel_unnamedtable1.setProperty("AutoScroll", Dvpanel_unnamedtable1_Autoscroll);
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, "DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV19Barser), GXutil.rtrim( localUtil.format( AV19Barser, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ParticionHdrs2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarserdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarserdsc_Internalname, httpContext.getMessage( "Descripción ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserdsc_Internalname, GXutil.rtrim( AV20Barserdsc), GXutil.rtrim( localUtil.format( AV20Barserdsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ParticionHdrs2.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV21Barcolnom), GXutil.rtrim( localUtil.format( AV21Barcolnom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ParticionHdrs2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV22Barcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV22Barcolnum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV22Barcolnum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ParticionHdrs2.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarkgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarkgm_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarkgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV23BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarkgm_Enabled!=0) ? localUtil.format( AV23BarKgm, "ZZZZZ9.99") : localUtil.format( AV23BarKgm, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarkgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarkgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ParticionHdrs2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarmtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarmtr_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarmtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV24BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarmtr_Enabled!=0) ? localUtil.format( AV24BarMtr, "ZZZZZ9.99") : localUtil.format( AV24BarMtr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarmtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarmtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ParticionHdrs2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpiepie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpiepie_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpiepie_Internalname, GXutil.ltrim( localUtil.ntoc( AV25BarPiepie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpiepie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV25BarPiepie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV25BarPiepie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpiepie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpiepie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ParticionHdrs2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable2.setProperty("Width", Dvpanel_unnamedtable2_Width);
         ucDvpanel_unnamedtable2.setProperty("AutoWidth", Dvpanel_unnamedtable2_Autowidth);
         ucDvpanel_unnamedtable2.setProperty("AutoHeight", Dvpanel_unnamedtable2_Autoheight);
         ucDvpanel_unnamedtable2.setProperty("Cls", Dvpanel_unnamedtable2_Cls);
         ucDvpanel_unnamedtable2.setProperty("Title", Dvpanel_unnamedtable2_Title);
         ucDvpanel_unnamedtable2.setProperty("Collapsible", Dvpanel_unnamedtable2_Collapsible);
         ucDvpanel_unnamedtable2.setProperty("Collapsed", Dvpanel_unnamedtable2_Collapsed);
         ucDvpanel_unnamedtable2.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable2_Showcollapseicon);
         ucDvpanel_unnamedtable2.setProperty("IconPosition", Dvpanel_unnamedtable2_Iconposition);
         ucDvpanel_unnamedtable2.setProperty("AutoScroll", Dvpanel_unnamedtable2_Autoscroll);
         ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, "DVPANEL_UNNAMEDTABLE2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpan_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpan_Internalname, httpContext.getMessage( "N Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpan_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BarCodPan, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodpan_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV5BarCodPan), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV5BarCodPan), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpan_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpan_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ParticionHdrs2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarreopan_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarreopan_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarreopan_Internalname, GXutil.ltrim( localUtil.ntoc( AV7BarReoPan, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarreopan_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV7BarReoPan), "9") : localUtil.format( DecimalUtil.doubleToDec(AV7BarReoPan), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarreopan_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarreopan_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ParticionHdrs2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarparpan_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarparpan_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarparpan_Internalname, GXutil.rtrim( AV6BarParPan), GXutil.rtrim( localUtil.format( AV6BarParPan, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarparpan_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarparpan_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ParticionHdrs2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncrearparticion_Internalname, "", httpContext.getMessage( "Crear Particion", ""), bttBtncrearparticion_Jsonclick, 5, httpContext.getMessage( "Crear Particion", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCREARPARTICION\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ParticionHdrs2.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable3.setProperty("Width", Dvpanel_unnamedtable3_Width);
         ucDvpanel_unnamedtable3.setProperty("AutoWidth", Dvpanel_unnamedtable3_Autowidth);
         ucDvpanel_unnamedtable3.setProperty("AutoHeight", Dvpanel_unnamedtable3_Autoheight);
         ucDvpanel_unnamedtable3.setProperty("Cls", Dvpanel_unnamedtable3_Cls);
         ucDvpanel_unnamedtable3.setProperty("Title", Dvpanel_unnamedtable3_Title);
         ucDvpanel_unnamedtable3.setProperty("Collapsible", Dvpanel_unnamedtable3_Collapsible);
         ucDvpanel_unnamedtable3.setProperty("Collapsed", Dvpanel_unnamedtable3_Collapsed);
         ucDvpanel_unnamedtable3.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable3_Showcollapseicon);
         ucDvpanel_unnamedtable3.setProperty("IconPosition", Dvpanel_unnamedtable3_Iconposition);
         ucDvpanel_unnamedtable3.setProperty("AutoScroll", Dvpanel_unnamedtable3_Autoscroll);
         ucDvpanel_unnamedtable3.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable3_Internalname, "DVPANEL_UNNAMEDTABLE3Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE3Container"+"UnnamedTable3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavKilosdestino_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavKilosdestino_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavKilosdestino_Internalname, GXutil.ltrim( localUtil.ntoc( AV40Kilosdestino, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavKilosdestino_Enabled!=0) ? localUtil.format( AV40Kilosdestino, "ZZZZZ9.99") : localUtil.format( AV40Kilosdestino, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavKilosdestino_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavKilosdestino_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ParticionHdrs2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMetrosdestino_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMetrosdestino_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMetrosdestino_Internalname, GXutil.ltrim( localUtil.ntoc( AV41MetrosDestino, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMetrosdestino_Enabled!=0) ? localUtil.format( AV41MetrosDestino, "ZZZZZ9.99") : localUtil.format( AV41MetrosDestino, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMetrosdestino_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMetrosdestino_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ParticionHdrs2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPiezasdestino_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPiezasdestino_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPiezasdestino_Internalname, GXutil.ltrim( localUtil.ntoc( AV39PiezasDestino, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPiezasdestino_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV39PiezasDestino), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV39PiezasDestino), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPiezasdestino_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPiezasdestino_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ParticionHdrs2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1115e1_client"+"'", TempTags, "", 2, "HLP_ParticionHdrs2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnsalir_Internalname, "", httpContext.getMessage( "Salir", ""), bttBtnsalir_Jsonclick, 5, httpContext.getMessage( "Salir", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOSALIR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ParticionHdrs2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         wb_table1_113_15E2( true) ;
      }
      else
      {
         wb_table1_113_15E2( false) ;
      }
      return  ;
   }

   public void wb_table1_113_15E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start15E2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Particion Hdrs", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup15E0( ) ;
   }

   public void ws15E2( )
   {
      start15E2( ) ;
      evt15E2( ) ;
   }

   public void evt15E2( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1215E2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e1315E2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOSALIR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoSalir' */
                           e1415E2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCREARPARTICION'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCrearParticion' */
                           e1515E2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1615E2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              Rfr0gs = false ;
                              if ( ! Rfr0gs )
                              {
                              }
                              dynload_actions( ) ;
                           }
                           /* No code required for Cancel button. It is implemented as the Reset button. */
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
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we15E2( )
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

   public void pa15E2( )
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
            GX_FocusControl = edtavBarcodpan_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
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
      rf15E2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV57Pgmname = "ParticionHdrs2" ;
      Gx_err = (short)(0) ;
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavBarpiepie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpiepie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpiepie_Enabled), 5, 0), true);
   }

   public void rf15E2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H015E2 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = H015E2_A396EmprCod[0] ;
            /* Execute user event: Load */
            e1615E2 ();
            pr_default.readNext(0);
         }
         pr_default.close(0);
         wb15E0( ) ;
      }
   }

   public void send_integrity_lvl_hashes15E2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV57Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV49UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV50station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG1", GXutil.rtrim( AV43msg1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43msg1, ""))));
   }

   public void before_start_formulas( )
   {
      AV57Pgmname = "ParticionHdrs2" ;
      Gx_err = (short)(0) ;
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavBarpiepie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpiepie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpiepie_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup15E0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1315E2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV18BarOriPar = httpContext.cgiGet( "vBARORIPAR") ;
         AV11BarOriReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARORIREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV10BarOriCod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARORICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV8Partic = (short)(localUtil.ctol( httpContext.cgiGet( "vPARTIC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
         Dvpanel_unnamedtable2_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Width") ;
         Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
         Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
         Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Cls") ;
         Dvpanel_unnamedtable2_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Title") ;
         Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
         Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
         Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
         Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Iconposition") ;
         Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
         Dvpanel_unnamedtable3_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Width") ;
         Dvpanel_unnamedtable3_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autowidth")) ;
         Dvpanel_unnamedtable3_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoheight")) ;
         Dvpanel_unnamedtable3_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Cls") ;
         Dvpanel_unnamedtable3_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Title") ;
         Dvpanel_unnamedtable3_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsible")) ;
         Dvpanel_unnamedtable3_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsed")) ;
         Dvpanel_unnamedtable3_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Showcollapseicon")) ;
         Dvpanel_unnamedtable3_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Iconposition") ;
         Dvpanel_unnamedtable3_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoscroll")) ;
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         /* Read variables values. */
         AV25BarPiepie = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarpiepie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25BarPiepie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarPiepie), 6, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodpan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodpan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODPAN");
            GX_FocusControl = edtavBarcodpan_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BarCodPan = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5BarCodPan", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCodPan), 8, 0));
         }
         else
         {
            AV5BarCodPan = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcodpan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5BarCodPan", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCodPan), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarreopan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarreopan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARREOPAN");
            GX_FocusControl = edtavBarreopan_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7BarReoPan = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7BarReoPan", GXutil.str( AV7BarReoPan, 1, 0));
         }
         else
         {
            AV7BarReoPan = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarreopan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7BarReoPan", GXutil.str( AV7BarReoPan, 1, 0));
         }
         AV6BarParPan = httpContext.cgiGet( edtavBarparpan_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6BarParPan", AV6BarParPan);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavKilosdestino_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavKilosdestino_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vKILOSDESTINO");
            GX_FocusControl = edtavKilosdestino_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV40Kilosdestino = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40Kilosdestino", GXutil.ltrimstr( AV40Kilosdestino, 9, 2));
         }
         else
         {
            AV40Kilosdestino = localUtil.ctond( httpContext.cgiGet( edtavKilosdestino_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40Kilosdestino", GXutil.ltrimstr( AV40Kilosdestino, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMetrosdestino_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMetrosdestino_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMETROSDESTINO");
            GX_FocusControl = edtavMetrosdestino_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV41MetrosDestino = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41MetrosDestino", GXutil.ltrimstr( AV41MetrosDestino, 9, 2));
         }
         else
         {
            AV41MetrosDestino = localUtil.ctond( httpContext.cgiGet( edtavMetrosdestino_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41MetrosDestino", GXutil.ltrimstr( AV41MetrosDestino, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPiezasdestino_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPiezasdestino_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPIEZASDESTINO");
            GX_FocusControl = edtavPiezasdestino_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV39PiezasDestino = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39PiezasDestino", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39PiezasDestino), 6, 0));
         }
         else
         {
            AV39PiezasDestino = (int)(localUtil.ctol( httpContext.cgiGet( edtavPiezasdestino_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39PiezasDestino", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39PiezasDestino), 6, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e1315E2 ();
      if (returnInSub) return;
   }

   public void e1315E2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV50station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      particionhdrs2_impl.this.GXt_char1 = GXv_char2[0] ;
      AV50station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50station", AV50station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50station, ""))));
      GXv_char2[0] = AV12EmprCod ;
      GXv_char3[0] = AV51EmprNom ;
      GXv_char4[0] = AV49UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV50station, GXv_char2, GXv_char3, GXv_char4) ;
      particionhdrs2_impl.this.AV12EmprCod = GXv_char2[0] ;
      particionhdrs2_impl.this.AV51EmprNom = GXv_char3[0] ;
      particionhdrs2_impl.this.AV49UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV49UsurCod", AV49UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49UsurCod, "@!"))));
      AV8Partic = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Partic", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Partic), 4, 0));
      GXv_int5[0] = (byte)(AV30TinEst) ;
      new app.pexicon(remoteHandle, context).execute( AV12EmprCod, httpContext.getMessage( "TINEST", ""), GXv_int5) ;
      particionhdrs2_impl.this.AV30TinEst = GXv_int5[0] ;
      AV13OK = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OK", AV13OK);
      GXt_char1 = AV42msg0 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG219_", ""), (byte)(99), GXv_char4) ;
      particionhdrs2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV42msg0 = GXt_char1 ;
      GXt_char1 = AV43msg1 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG220_", ""), (byte)(99), GXv_char4) ;
      particionhdrs2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV43msg1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43msg1", AV43msg1);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43msg1, ""))));
      GXt_char1 = AV50station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      particionhdrs2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV50station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50station", AV50station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50station, ""))));
      GXv_char4[0] = AV12EmprCod ;
      GXv_char3[0] = AV51EmprNom ;
      GXv_char2[0] = AV49UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV50station, GXv_char4, GXv_char3, GXv_char2) ;
      particionhdrs2_impl.this.AV12EmprCod = GXv_char4[0] ;
      particionhdrs2_impl.this.AV51EmprNom = GXv_char3[0] ;
      particionhdrs2_impl.this.AV49UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV49UsurCod", AV49UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49UsurCod, "@!"))));
   }

   public void e1215E2( )
   {
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S112 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e1415E2( )
   {
      /* 'DoSalir' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV12EmprCod,Integer.valueOf(AV10BarOriCod),Byte.valueOf(AV11BarOriReo),AV18BarOriPar,AV19Barser,AV20Barserdsc,AV21Barcolnom,Integer.valueOf(AV22Barcolnum),AV23BarKgm,AV24BarMtr,Integer.valueOf(AV25BarPiepie),Short.valueOf(AV14Conos),AV15Kilos,AV16Metros,AV17Rectotkgm,Short.valueOf(AV38Barpes),AV35CosAnyOri,AV36CosPrdOri,AV13OK});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV12EmprCod","AV10BarOriCod","AV11BarOriReo","AV18BarOriPar","AV19Barser","AV20Barserdsc","AV21Barcolnom","AV22Barcolnum","AV23BarKgm","AV24BarMtr","AV25BarPiepie","AV14Conos","AV15Kilos","AV16Metros","AV17Rectotkgm","AV38Barpes","AV35CosAnyOri","AV36CosPrdOri","AV13OK"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e1515E2( )
   {
      /* 'DoCrearParticion' Routine */
      returnInSub = false ;
      if ( AV8Partic == 0 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = AV10BarOriCod ;
         GXv_int5[0] = AV11BarOriReo ;
         GXv_char3[0] = AV6BarParPan ;
         new app.pnumpar(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int5, GXv_char3) ;
         particionhdrs2_impl.this.A396EmprCod = GXv_char4[0] ;
         particionhdrs2_impl.this.AV10BarOriCod = GXv_int6[0] ;
         particionhdrs2_impl.this.AV11BarOriReo = GXv_int5[0] ;
         particionhdrs2_impl.this.AV6BarParPan = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV10BarOriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarOriCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV11BarOriReo", GXutil.str( AV11BarOriReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV6BarParPan", AV6BarParPan);
         AV8Partic = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Partic", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Partic), 4, 0));
         AV9Destino = (short)(0) ;
         AV5BarCodPan = AV10BarOriCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5BarCodPan", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCodPan), 8, 0));
         AV7BarReoPan = AV11BarOriReo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarReoPan", GXutil.str( AV7BarReoPan, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ya fue pulsado el boton Crear Particion", ""));
      }
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      AV26BarCodDes = AV5BarCodPan ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26BarCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26BarCodDes), 8, 0));
      AV27BarReoDes = AV7BarReoPan ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27BarReoDes", GXutil.str( AV27BarReoDes, 1, 0));
      AV28BarParDes = AV6BarParPan ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28BarParDes", AV28BarParDes);
      if ( (0==AV26BarCodDes) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Hdr Destino sin valor", ""));
         GX_FocusControl = edtavBarcodpan_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         /* Execute user subroutine: 'HDRDESTINO' */
         S122 ();
         if (returnInSub) return;
         if ( ( AV39PiezasDestino > AV25BarPiepie ) || ( DecimalUtil.compareTo(AV40Kilosdestino, AV23BarKgm) > 0 ) || ( DecimalUtil.compareTo(AV41MetrosDestino, AV24BarMtr) > 0 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Revisar Piezas o Kilos o Metros, cantidad superior al origen", ""));
         }
         else
         {
            if ( (0==AV39PiezasDestino) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40Kilosdestino)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41MetrosDestino)==0) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "NO hay valores", ""));
            }
            else
            {
               AV13OK = httpContext.getMessage( "S", "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13OK", AV13OK);
               AV45Conos2 = (short)(AV39PiezasDestino) ;
               AV46Kilos2 = AV40Kilosdestino ;
               AV46Kilos2 = ((AV40Kilosdestino.doubleValue()==0) ? (AV41MetrosDestino.multiply(DecimalUtil.doubleToDec(AV38Barpes))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) : AV46Kilos2) ;
               AV47Metros2 = AV41MetrosDestino ;
               if ( AV52Flag2 == 0 )
               {
                  GXv_char4[0] = AV12EmprCod ;
                  GXv_int6[0] = AV10BarOriCod ;
                  GXv_int5[0] = AV11BarOriReo ;
                  GXv_char3[0] = AV18BarOriPar ;
                  GXv_int7[0] = AV26BarCodDes ;
                  GXv_int8[0] = AV27BarReoDes ;
                  GXv_char2[0] = AV28BarParDes ;
                  new app.pcrebar(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int5, GXv_char3, GXv_int7, GXv_int8, GXv_char2) ;
                  particionhdrs2_impl.this.AV12EmprCod = GXv_char4[0] ;
                  particionhdrs2_impl.this.AV10BarOriCod = GXv_int6[0] ;
                  particionhdrs2_impl.this.AV11BarOriReo = GXv_int5[0] ;
                  particionhdrs2_impl.this.AV18BarOriPar = GXv_char3[0] ;
                  particionhdrs2_impl.this.AV26BarCodDes = GXv_int7[0] ;
                  particionhdrs2_impl.this.AV27BarReoDes = GXv_int8[0] ;
                  particionhdrs2_impl.this.AV28BarParDes = GXv_char2[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV10BarOriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarOriCod), 8, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV11BarOriReo", GXutil.str( AV11BarOriReo, 1, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV18BarOriPar", AV18BarOriPar);
                  httpContext.ajax_rsp_assign_attri("", false, "AV26BarCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26BarCodDes), 8, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV27BarReoDes", GXutil.str( AV27BarReoDes, 1, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV28BarParDes", AV28BarParDes);
                  GXv_char4[0] = AV12EmprCod ;
                  GXv_int7[0] = AV10BarOriCod ;
                  GXv_int8[0] = AV11BarOriReo ;
                  GXv_char3[0] = AV18BarOriPar ;
                  GXv_int6[0] = AV26BarCodDes ;
                  GXv_int5[0] = AV27BarReoDes ;
                  GXv_char2[0] = AV28BarParDes ;
                  GXv_int9[0] = AV45Conos2 ;
                  GXv_decimal10[0] = AV46Kilos2 ;
                  GXv_decimal11[0] = AV47Metros2 ;
                  new app.preopeh(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int8, GXv_char3, GXv_int6, GXv_int5, GXv_char2, GXv_int9, GXv_decimal10, GXv_decimal11) ;
                  particionhdrs2_impl.this.AV12EmprCod = GXv_char4[0] ;
                  particionhdrs2_impl.this.AV10BarOriCod = GXv_int7[0] ;
                  particionhdrs2_impl.this.AV11BarOriReo = GXv_int8[0] ;
                  particionhdrs2_impl.this.AV18BarOriPar = GXv_char3[0] ;
                  particionhdrs2_impl.this.AV26BarCodDes = GXv_int6[0] ;
                  particionhdrs2_impl.this.AV27BarReoDes = GXv_int5[0] ;
                  particionhdrs2_impl.this.AV28BarParDes = GXv_char2[0] ;
                  particionhdrs2_impl.this.AV45Conos2 = (short)((short)(GXv_int9[0])) ;
                  particionhdrs2_impl.this.AV46Kilos2 = GXv_decimal10[0] ;
                  particionhdrs2_impl.this.AV47Metros2 = GXv_decimal11[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV10BarOriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarOriCod), 8, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV11BarOriReo", GXutil.str( AV11BarOriReo, 1, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV18BarOriPar", AV18BarOriPar);
                  httpContext.ajax_rsp_assign_attri("", false, "AV26BarCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26BarCodDes), 8, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV27BarReoDes", GXutil.str( AV27BarReoDes, 1, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV28BarParDes", AV28BarParDes);
                  AV37Signo = (byte)(1) ;
                  GXv_char4[0] = AV12EmprCod ;
                  GXv_int9[0] = AV26BarCodDes ;
                  GXv_int8[0] = AV27BarReoDes ;
                  GXv_char3[0] = AV28BarParDes ;
                  GXv_int12[0] = AV45Conos2 ;
                  GXv_decimal11[0] = AV46Kilos2 ;
                  GXv_decimal10[0] = AV47Metros2 ;
                  GXv_int13[0] = (short)(AV25BarPiepie) ;
                  GXv_decimal14[0] = AV15Kilos ;
                  GXv_decimal15[0] = AV16Metros ;
                  GXv_decimal16[0] = AV35CosAnyOri ;
                  GXv_decimal17[0] = AV36CosPrdOri ;
                  GXv_int5[0] = AV37Signo ;
                  new app.pacparth(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int8, GXv_char3, GXv_int12, GXv_decimal11, GXv_decimal10, GXv_int13, GXv_decimal14, GXv_decimal15, GXv_decimal16, GXv_decimal17, GXv_int5) ;
                  particionhdrs2_impl.this.AV12EmprCod = GXv_char4[0] ;
                  particionhdrs2_impl.this.AV26BarCodDes = GXv_int9[0] ;
                  particionhdrs2_impl.this.AV27BarReoDes = GXv_int8[0] ;
                  particionhdrs2_impl.this.AV28BarParDes = GXv_char3[0] ;
                  particionhdrs2_impl.this.AV45Conos2 = GXv_int12[0] ;
                  particionhdrs2_impl.this.AV46Kilos2 = GXv_decimal11[0] ;
                  particionhdrs2_impl.this.AV47Metros2 = GXv_decimal10[0] ;
                  particionhdrs2_impl.this.AV25BarPiepie = GXv_int13[0] ;
                  particionhdrs2_impl.this.AV15Kilos = GXv_decimal14[0] ;
                  particionhdrs2_impl.this.AV16Metros = GXv_decimal15[0] ;
                  particionhdrs2_impl.this.AV35CosAnyOri = GXv_decimal16[0] ;
                  particionhdrs2_impl.this.AV36CosPrdOri = GXv_decimal17[0] ;
                  particionhdrs2_impl.this.AV37Signo = GXv_int5[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV26BarCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26BarCodDes), 8, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV27BarReoDes", GXutil.str( AV27BarReoDes, 1, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV28BarParDes", AV28BarParDes);
                  httpContext.ajax_rsp_assign_attri("", false, "AV25BarPiepie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarPiepie), 6, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV15Kilos", GXutil.ltrimstr( AV15Kilos, 9, 2));
                  httpContext.ajax_rsp_assign_attri("", false, "AV16Metros", GXutil.ltrimstr( AV16Metros, 9, 2));
                  httpContext.ajax_rsp_assign_attri("", false, "AV35CosAnyOri", GXutil.ltrimstr( AV35CosAnyOri, 10, 2));
                  httpContext.ajax_rsp_assign_attri("", false, "AV36CosPrdOri", GXutil.ltrimstr( AV36CosPrdOri, 10, 2));
                  AV37Signo = (byte)(-1) ;
                  GXv_char4[0] = AV12EmprCod ;
                  GXv_int9[0] = AV10BarOriCod ;
                  GXv_int8[0] = AV11BarOriReo ;
                  GXv_char3[0] = AV18BarOriPar ;
                  GXv_int13[0] = AV45Conos2 ;
                  GXv_decimal17[0] = AV46Kilos2 ;
                  GXv_decimal16[0] = AV47Metros2 ;
                  GXv_int12[0] = (short)(AV25BarPiepie) ;
                  GXv_decimal15[0] = AV15Kilos ;
                  GXv_decimal14[0] = AV16Metros ;
                  GXv_decimal11[0] = AV35CosAnyOri ;
                  GXv_decimal10[0] = AV36CosPrdOri ;
                  GXv_int5[0] = AV37Signo ;
                  new app.pacparth(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int8, GXv_char3, GXv_int13, GXv_decimal17, GXv_decimal16, GXv_int12, GXv_decimal15, GXv_decimal14, GXv_decimal11, GXv_decimal10, GXv_int5) ;
                  particionhdrs2_impl.this.AV12EmprCod = GXv_char4[0] ;
                  particionhdrs2_impl.this.AV10BarOriCod = GXv_int9[0] ;
                  particionhdrs2_impl.this.AV11BarOriReo = GXv_int8[0] ;
                  particionhdrs2_impl.this.AV18BarOriPar = GXv_char3[0] ;
                  particionhdrs2_impl.this.AV45Conos2 = GXv_int13[0] ;
                  particionhdrs2_impl.this.AV46Kilos2 = GXv_decimal17[0] ;
                  particionhdrs2_impl.this.AV47Metros2 = GXv_decimal16[0] ;
                  particionhdrs2_impl.this.AV25BarPiepie = GXv_int12[0] ;
                  particionhdrs2_impl.this.AV15Kilos = GXv_decimal15[0] ;
                  particionhdrs2_impl.this.AV16Metros = GXv_decimal14[0] ;
                  particionhdrs2_impl.this.AV35CosAnyOri = GXv_decimal11[0] ;
                  particionhdrs2_impl.this.AV36CosPrdOri = GXv_decimal10[0] ;
                  particionhdrs2_impl.this.AV37Signo = GXv_int5[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV10BarOriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarOriCod), 8, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV11BarOriReo", GXutil.str( AV11BarOriReo, 1, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV18BarOriPar", AV18BarOriPar);
                  httpContext.ajax_rsp_assign_attri("", false, "AV25BarPiepie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarPiepie), 6, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV15Kilos", GXutil.ltrimstr( AV15Kilos, 9, 2));
                  httpContext.ajax_rsp_assign_attri("", false, "AV16Metros", GXutil.ltrimstr( AV16Metros, 9, 2));
                  httpContext.ajax_rsp_assign_attri("", false, "AV35CosAnyOri", GXutil.ltrimstr( AV35CosAnyOri, 10, 2));
                  httpContext.ajax_rsp_assign_attri("", false, "AV36CosPrdOri", GXutil.ltrimstr( AV36CosPrdOri, 10, 2));
                  AV48Inc_obs = httpContext.getMessage( "Fin Particion Hdrs", "") ;
                  new app.pctrinc(remoteHandle, context).execute( AV12EmprCod, GXutil.substring( AV57Pgmname, 1, 10), AV49UsurCod, AV50station, AV48Inc_obs, AV10BarOriCod, AV11BarOriReo, AV18BarOriPar) ;
                  httpContext.setWebReturnParms(new Object[] {AV12EmprCod,Integer.valueOf(AV10BarOriCod),Byte.valueOf(AV11BarOriReo),AV18BarOriPar,AV19Barser,AV20Barserdsc,AV21Barcolnom,Integer.valueOf(AV22Barcolnum),AV23BarKgm,AV24BarMtr,Integer.valueOf(AV25BarPiepie),Short.valueOf(AV14Conos),AV15Kilos,AV16Metros,AV17Rectotkgm,Short.valueOf(AV38Barpes),AV35CosAnyOri,AV36CosPrdOri,AV13OK});
                  httpContext.setWebReturnParmsMetadata(new Object[] {"AV12EmprCod","AV10BarOriCod","AV11BarOriReo","AV18BarOriPar","AV19Barser","AV20Barserdsc","AV21Barcolnom","AV22Barcolnum","AV23BarKgm","AV24BarMtr","AV25BarPiepie","AV14Conos","AV15Kilos","AV16Metros","AV17Rectotkgm","AV38Barpes","AV35CosAnyOri","AV36CosPrdOri","AV13OK"});
                  httpContext.wjLocDisableFrm = (byte)(1) ;
                  httpContext.nUserReturn = (byte)(1) ;
                  returnInSub = true;
                  if (true) return;
               }
               else
               {
                  if ( GXutil.strcmp(AV53BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
                  {
                     httpContext.GX_msglist.addItem(httpContext.getMessage( "N Hdr Destino , esta AGRUPADA.", ""));
                     GX_FocusControl = edtavBarcodpan_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     if ( AV54BarSit < 5 )
                     {
                        GXv_char4[0] = AV12EmprCod ;
                        GXv_int9[0] = AV10BarOriCod ;
                        GXv_int8[0] = AV11BarOriReo ;
                        GXv_char3[0] = AV18BarOriPar ;
                        GXv_int7[0] = AV26BarCodDes ;
                        GXv_int5[0] = AV27BarReoDes ;
                        GXv_char2[0] = AV28BarParDes ;
                        GXv_int18[0] = AV29Flag ;
                        new app.pcomfor(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int8, GXv_char3, GXv_int7, GXv_int5, GXv_char2, GXv_int18) ;
                        particionhdrs2_impl.this.AV12EmprCod = GXv_char4[0] ;
                        particionhdrs2_impl.this.AV10BarOriCod = GXv_int9[0] ;
                        particionhdrs2_impl.this.AV11BarOriReo = GXv_int8[0] ;
                        particionhdrs2_impl.this.AV18BarOriPar = GXv_char3[0] ;
                        particionhdrs2_impl.this.AV26BarCodDes = GXv_int7[0] ;
                        particionhdrs2_impl.this.AV27BarReoDes = GXv_int5[0] ;
                        particionhdrs2_impl.this.AV28BarParDes = GXv_char2[0] ;
                        particionhdrs2_impl.this.AV29Flag = GXv_int18[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "AV10BarOriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarOriCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV11BarOriReo", GXutil.str( AV11BarOriReo, 1, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV18BarOriPar", AV18BarOriPar);
                        httpContext.ajax_rsp_assign_attri("", false, "AV26BarCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26BarCodDes), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV27BarReoDes", GXutil.str( AV27BarReoDes, 1, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV28BarParDes", AV28BarParDes);
                        httpContext.ajax_rsp_assign_attri("", false, "AV29Flag", GXutil.str( AV29Flag, 1, 0));
                        if ( AV29Flag == 1 )
                        {
                           httpContext.GX_msglist.addItem(AV43msg1);
                        }
                        GXv_char4[0] = AV12EmprCod ;
                        GXv_int9[0] = AV10BarOriCod ;
                        GXv_int18[0] = AV11BarOriReo ;
                        GXv_char3[0] = AV18BarOriPar ;
                        GXv_int7[0] = AV26BarCodDes ;
                        GXv_int8[0] = AV27BarReoDes ;
                        GXv_char2[0] = AV28BarParDes ;
                        GXv_int6[0] = AV45Conos2 ;
                        GXv_decimal17[0] = AV46Kilos2 ;
                        GXv_decimal16[0] = AV47Metros2 ;
                        new app.preopeh(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int18, GXv_char3, GXv_int7, GXv_int8, GXv_char2, GXv_int6, GXv_decimal17, GXv_decimal16) ;
                        particionhdrs2_impl.this.AV12EmprCod = GXv_char4[0] ;
                        particionhdrs2_impl.this.AV10BarOriCod = GXv_int9[0] ;
                        particionhdrs2_impl.this.AV11BarOriReo = GXv_int18[0] ;
                        particionhdrs2_impl.this.AV18BarOriPar = GXv_char3[0] ;
                        particionhdrs2_impl.this.AV26BarCodDes = GXv_int7[0] ;
                        particionhdrs2_impl.this.AV27BarReoDes = GXv_int8[0] ;
                        particionhdrs2_impl.this.AV28BarParDes = GXv_char2[0] ;
                        particionhdrs2_impl.this.AV45Conos2 = (short)((short)(GXv_int6[0])) ;
                        particionhdrs2_impl.this.AV46Kilos2 = GXv_decimal17[0] ;
                        particionhdrs2_impl.this.AV47Metros2 = GXv_decimal16[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "AV10BarOriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarOriCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV11BarOriReo", GXutil.str( AV11BarOriReo, 1, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV18BarOriPar", AV18BarOriPar);
                        httpContext.ajax_rsp_assign_attri("", false, "AV26BarCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26BarCodDes), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV27BarReoDes", GXutil.str( AV27BarReoDes, 1, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV28BarParDes", AV28BarParDes);
                        AV37Signo = (byte)(1) ;
                        GXv_char4[0] = AV12EmprCod ;
                        GXv_int9[0] = AV26BarCodDes ;
                        GXv_int18[0] = AV27BarReoDes ;
                        GXv_char3[0] = AV28BarParDes ;
                        GXv_int13[0] = AV45Conos2 ;
                        GXv_decimal17[0] = AV46Kilos2 ;
                        GXv_decimal16[0] = AV47Metros2 ;
                        GXv_int12[0] = (short)(AV25BarPiepie) ;
                        GXv_decimal15[0] = AV15Kilos ;
                        GXv_decimal14[0] = AV16Metros ;
                        GXv_decimal11[0] = AV35CosAnyOri ;
                        GXv_decimal10[0] = AV36CosPrdOri ;
                        GXv_int8[0] = AV37Signo ;
                        new app.pacparth(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int18, GXv_char3, GXv_int13, GXv_decimal17, GXv_decimal16, GXv_int12, GXv_decimal15, GXv_decimal14, GXv_decimal11, GXv_decimal10, GXv_int8) ;
                        particionhdrs2_impl.this.AV12EmprCod = GXv_char4[0] ;
                        particionhdrs2_impl.this.AV26BarCodDes = GXv_int9[0] ;
                        particionhdrs2_impl.this.AV27BarReoDes = GXv_int18[0] ;
                        particionhdrs2_impl.this.AV28BarParDes = GXv_char3[0] ;
                        particionhdrs2_impl.this.AV45Conos2 = GXv_int13[0] ;
                        particionhdrs2_impl.this.AV46Kilos2 = GXv_decimal17[0] ;
                        particionhdrs2_impl.this.AV47Metros2 = GXv_decimal16[0] ;
                        particionhdrs2_impl.this.AV25BarPiepie = GXv_int12[0] ;
                        particionhdrs2_impl.this.AV15Kilos = GXv_decimal15[0] ;
                        particionhdrs2_impl.this.AV16Metros = GXv_decimal14[0] ;
                        particionhdrs2_impl.this.AV35CosAnyOri = GXv_decimal11[0] ;
                        particionhdrs2_impl.this.AV36CosPrdOri = GXv_decimal10[0] ;
                        particionhdrs2_impl.this.AV37Signo = GXv_int8[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "AV26BarCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26BarCodDes), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV27BarReoDes", GXutil.str( AV27BarReoDes, 1, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV28BarParDes", AV28BarParDes);
                        httpContext.ajax_rsp_assign_attri("", false, "AV25BarPiepie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarPiepie), 6, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV15Kilos", GXutil.ltrimstr( AV15Kilos, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "AV16Metros", GXutil.ltrimstr( AV16Metros, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "AV35CosAnyOri", GXutil.ltrimstr( AV35CosAnyOri, 10, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "AV36CosPrdOri", GXutil.ltrimstr( AV36CosPrdOri, 10, 2));
                        AV37Signo = (byte)(-1) ;
                        GXv_char4[0] = AV12EmprCod ;
                        GXv_int9[0] = AV10BarOriCod ;
                        GXv_int18[0] = AV11BarOriReo ;
                        GXv_char3[0] = AV18BarOriPar ;
                        GXv_int13[0] = AV45Conos2 ;
                        GXv_decimal17[0] = AV46Kilos2 ;
                        GXv_decimal16[0] = AV47Metros2 ;
                        GXv_int12[0] = (short)(AV25BarPiepie) ;
                        GXv_decimal15[0] = AV15Kilos ;
                        GXv_decimal14[0] = AV16Metros ;
                        GXv_decimal11[0] = AV35CosAnyOri ;
                        GXv_decimal10[0] = AV36CosPrdOri ;
                        GXv_int8[0] = AV37Signo ;
                        new app.pacparth(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int18, GXv_char3, GXv_int13, GXv_decimal17, GXv_decimal16, GXv_int12, GXv_decimal15, GXv_decimal14, GXv_decimal11, GXv_decimal10, GXv_int8) ;
                        particionhdrs2_impl.this.AV12EmprCod = GXv_char4[0] ;
                        particionhdrs2_impl.this.AV10BarOriCod = GXv_int9[0] ;
                        particionhdrs2_impl.this.AV11BarOriReo = GXv_int18[0] ;
                        particionhdrs2_impl.this.AV18BarOriPar = GXv_char3[0] ;
                        particionhdrs2_impl.this.AV45Conos2 = GXv_int13[0] ;
                        particionhdrs2_impl.this.AV46Kilos2 = GXv_decimal17[0] ;
                        particionhdrs2_impl.this.AV47Metros2 = GXv_decimal16[0] ;
                        particionhdrs2_impl.this.AV25BarPiepie = GXv_int12[0] ;
                        particionhdrs2_impl.this.AV15Kilos = GXv_decimal15[0] ;
                        particionhdrs2_impl.this.AV16Metros = GXv_decimal14[0] ;
                        particionhdrs2_impl.this.AV35CosAnyOri = GXv_decimal11[0] ;
                        particionhdrs2_impl.this.AV36CosPrdOri = GXv_decimal10[0] ;
                        particionhdrs2_impl.this.AV37Signo = GXv_int8[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "AV10BarOriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarOriCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV11BarOriReo", GXutil.str( AV11BarOriReo, 1, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV18BarOriPar", AV18BarOriPar);
                        httpContext.ajax_rsp_assign_attri("", false, "AV25BarPiepie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarPiepie), 6, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV15Kilos", GXutil.ltrimstr( AV15Kilos, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "AV16Metros", GXutil.ltrimstr( AV16Metros, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "AV35CosAnyOri", GXutil.ltrimstr( AV35CosAnyOri, 10, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "AV36CosPrdOri", GXutil.ltrimstr( AV36CosPrdOri, 10, 2));
                        AV48Inc_obs = httpContext.getMessage( "Fin Particion Hdrs.Opcion pasar de Origen a Destino", "") ;
                        new app.pctrinc(remoteHandle, context).execute( AV12EmprCod, GXutil.substring( AV57Pgmname, 1, 10), AV49UsurCod, AV50station, AV48Inc_obs, AV10BarOriCod, AV11BarOriReo, AV18BarOriPar) ;
                        httpContext.setWebReturnParms(new Object[] {AV12EmprCod,Integer.valueOf(AV10BarOriCod),Byte.valueOf(AV11BarOriReo),AV18BarOriPar,AV19Barser,AV20Barserdsc,AV21Barcolnom,Integer.valueOf(AV22Barcolnum),AV23BarKgm,AV24BarMtr,Integer.valueOf(AV25BarPiepie),Short.valueOf(AV14Conos),AV15Kilos,AV16Metros,AV17Rectotkgm,Short.valueOf(AV38Barpes),AV35CosAnyOri,AV36CosPrdOri,AV13OK});
                        httpContext.setWebReturnParmsMetadata(new Object[] {"AV12EmprCod","AV10BarOriCod","AV11BarOriReo","AV18BarOriPar","AV19Barser","AV20Barserdsc","AV21Barcolnom","AV22Barcolnum","AV23BarKgm","AV24BarMtr","AV25BarPiepie","AV14Conos","AV15Kilos","AV16Metros","AV17Rectotkgm","AV38Barpes","AV35CosAnyOri","AV36CosPrdOri","AV13OK"});
                        httpContext.wjLocDisableFrm = (byte)(1) ;
                        httpContext.nUserReturn = (byte)(1) ;
                        returnInSub = true;
                        if (true) return;
                     }
                     else
                     {
                     }
                  }
               }
            }
         }
      }
   }

   public void S122( )
   {
      /* 'HDRDESTINO' Routine */
      returnInSub = false ;
      AV9Destino = (short)(1) ;
      AV52Flag2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Flag2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Flag2), 4, 0));
      /* Using cursor H015E3 */
      pr_default.execute(1, new Object[] {AV12EmprCod, Integer.valueOf(AV26BarCodDes), Byte.valueOf(AV27BarReoDes), AV28BarParDes});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = H015E3_A130BarCodPar[0] ;
         A132BarCodReo = H015E3_A132BarCodReo[0] ;
         A129BarCod = H015E3_A129BarCod[0] ;
         A396EmprCod = H015E3_A396EmprCod[0] ;
         A120BarAgrEst = H015E3_A120BarAgrEst[0] ;
         A213BarSit = H015E3_A213BarSit[0] ;
         AV52Flag2 = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52Flag2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Flag2), 4, 0));
         AV53BarAgrEst = A120BarAgrEst ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53BarAgrEst", AV53BarAgrEst);
         AV54BarSit = A213BarSit ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54BarSit), 2, 0));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void nextLoad( )
   {
   }

   protected void e1615E2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_113_15E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_confirmar_Internalname, tblTabledvelop_confirmpanel_confirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_confirmar.setProperty("Title", Dvelop_confirmpanel_confirmar_Title);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_confirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_confirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_confirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_confirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmType", Dvelop_confirmpanel_confirmar_Confirmtype);
         ucDvelop_confirmpanel_confirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_confirmar_Internalname, "DVELOP_CONFIRMPANEL_CONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_CONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_113_15E2e( true) ;
      }
      else
      {
         wb_table1_113_15E2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV12EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
      AV10BarOriCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarOriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarOriCod), 8, 0));
      AV11BarOriReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11BarOriReo", GXutil.str( AV11BarOriReo, 1, 0));
      AV18BarOriPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18BarOriPar", AV18BarOriPar);
      AV19Barser = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Barser", AV19Barser);
      AV20Barserdsc = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Barserdsc", AV20Barserdsc);
      AV21Barcolnom = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Barcolnom", AV21Barcolnom);
      AV22Barcolnum = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Barcolnum), 6, 0));
      AV23BarKgm = (java.math.BigDecimal)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23BarKgm", GXutil.ltrimstr( AV23BarKgm, 9, 2));
      AV24BarMtr = (java.math.BigDecimal)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24BarMtr", GXutil.ltrimstr( AV24BarMtr, 9, 2));
      AV25BarPiepie = ((Number) GXutil.testNumericType( getParm(obj,10), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25BarPiepie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarPiepie), 6, 0));
      AV14Conos = ((Number) GXutil.testNumericType( getParm(obj,11), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Conos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Conos), 4, 0));
      AV15Kilos = (java.math.BigDecimal)getParm(obj,12) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Kilos", GXutil.ltrimstr( AV15Kilos, 9, 2));
      AV16Metros = (java.math.BigDecimal)getParm(obj,13) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Metros", GXutil.ltrimstr( AV16Metros, 9, 2));
      AV17Rectotkgm = (java.math.BigDecimal)getParm(obj,14) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Rectotkgm", GXutil.ltrimstr( AV17Rectotkgm, 10, 2));
      AV38Barpes = ((Number) GXutil.testNumericType( getParm(obj,15), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Barpes), 4, 0));
      AV35CosAnyOri = (java.math.BigDecimal)getParm(obj,16) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35CosAnyOri", GXutil.ltrimstr( AV35CosAnyOri, 10, 2));
      AV36CosPrdOri = (java.math.BigDecimal)getParm(obj,17) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36CosPrdOri", GXutil.ltrimstr( AV36CosPrdOri, 10, 2));
      AV13OK = (String)getParm(obj,18) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OK", AV13OK);
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
      pa15E2( ) ;
      ws15E2( ) ;
      we15E2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241513819", true, true);
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
      httpContext.AddJavascriptSource("particionhdrs2.js", "?20268241513819", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarserdsc_Internalname = "vBARSERDSC" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarcolnum_Internalname = "vBARCOLNUM" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      edtavBarkgm_Internalname = "vBARKGM" ;
      edtavBarmtr_Internalname = "vBARMTR" ;
      edtavBarpiepie_Internalname = "vBARPIEPIE" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavBarcodpan_Internalname = "vBARCODPAN" ;
      edtavBarreopan_Internalname = "vBARREOPAN" ;
      edtavBarparpan_Internalname = "vBARPARPAN" ;
      bttBtncrearparticion_Internalname = "BTNCREARPARTICION" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      edtavKilosdestino_Internalname = "vKILOSDESTINO" ;
      edtavMetrosdestino_Internalname = "vMETROSDESTINO" ;
      edtavPiezasdestino_Internalname = "vPIEZASDESTINO" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtnsalir_Internalname = "BTNSALIR" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_confirmar_Internalname = "DVELOP_CONFIRMPANEL_CONFIRMAR" ;
      tblTabledvelop_confirmpanel_confirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_CONFIRMAR" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
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
      edtavPiezasdestino_Jsonclick = "" ;
      edtavPiezasdestino_Enabled = 1 ;
      edtavMetrosdestino_Jsonclick = "" ;
      edtavMetrosdestino_Enabled = 1 ;
      edtavKilosdestino_Jsonclick = "" ;
      edtavKilosdestino_Enabled = 1 ;
      edtavBarparpan_Jsonclick = "" ;
      edtavBarparpan_Enabled = 1 ;
      edtavBarreopan_Jsonclick = "" ;
      edtavBarreopan_Enabled = 1 ;
      edtavBarcodpan_Jsonclick = "" ;
      edtavBarcodpan_Enabled = 1 ;
      edtavBarpiepie_Jsonclick = "" ;
      edtavBarpiepie_Enabled = 0 ;
      edtavBarmtr_Jsonclick = "" ;
      edtavBarmtr_Enabled = 0 ;
      edtavBarkgm_Jsonclick = "" ;
      edtavBarkgm_Enabled = 0 ;
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarserdsc_Jsonclick = "" ;
      edtavBarserdsc_Enabled = 0 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 0 ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Desea crear la Hdr Destino?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Mas datos...", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Hdr Destino", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Hdr Origen", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Particion Hdrs", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV57Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV49UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV50station',fld:'vSTATION',pic:'',hsh:true},{av:'AV43msg1',fld:'vMSG1',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e1115E1',iparms:[{av:'AV8Partic',fld:'vPARTIC',pic:'ZZZ9'},{av:'AV5BarCodPan',fld:'vBARCODPAN',pic:'ZZZZZZZ9'},{av:'AV7BarReoPan',fld:'vBARREOPAN',pic:'9'},{av:'AV6BarParPan',fld:'vBARPARPAN',pic:''},{av:'AV10BarOriCod',fld:'vBARORICOD',pic:'ZZZZZZZ9'},{av:'AV11BarOriReo',fld:'vBARORIREO',pic:'9'},{av:'AV18BarOriPar',fld:'vBARORIPAR',pic:''}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'Dvelop_confirmpanel_confirmar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e1215E2',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'AV5BarCodPan',fld:'vBARCODPAN',pic:'ZZZZZZZ9'},{av:'AV7BarReoPan',fld:'vBARREOPAN',pic:'9'},{av:'AV6BarParPan',fld:'vBARPARPAN',pic:''},{av:'AV39PiezasDestino',fld:'vPIEZASDESTINO',pic:'ZZZZZ9'},{av:'AV25BarPiepie',fld:'vBARPIEPIE',pic:'ZZZZZ9'},{av:'AV40Kilosdestino',fld:'vKILOSDESTINO',pic:'ZZZZZ9.99'},{av:'AV23BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV41MetrosDestino',fld:'vMETROSDESTINO',pic:'ZZZZZ9.99'},{av:'AV24BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV38Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV52Flag2',fld:'vFLAG2',pic:'ZZZ9'},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV10BarOriCod',fld:'vBARORICOD',pic:'ZZZZZZZ9'},{av:'AV11BarOriReo',fld:'vBARORIREO',pic:'9'},{av:'AV18BarOriPar',fld:'vBARORIPAR',pic:''},{av:'AV15Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV16Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'AV35CosAnyOri',fld:'vCOSANYORI',pic:'ZZZZZZ9.99'},{av:'AV36CosPrdOri',fld:'vCOSPRDORI',pic:'ZZZZZZ9.99'},{av:'AV57Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV49UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV50station',fld:'vSTATION',pic:'',hsh:true},{av:'AV17Rectotkgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV14Conos',fld:'vCONOS',pic:'ZZZ9'},{av:'AV22Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV21Barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV20Barserdsc',fld:'vBARSERDSC',pic:''},{av:'AV19Barser',fld:'vBARSER',pic:''},{av:'AV53BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV54BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV29Flag',fld:'vFLAG',pic:'9'},{av:'AV43msg1',fld:'vMSG1',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV26BarCodDes',fld:'vBARCODDES',pic:'ZZZZZZZ9'},{av:'AV27BarReoDes',fld:'vBARREODES',pic:'9'},{av:'AV28BarParDes',fld:'vBARPARDES',pic:''},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV26BarCodDes',fld:'vBARCODDES',pic:'ZZZZZZZ9'},{av:'AV27BarReoDes',fld:'vBARREODES',pic:'9'},{av:'AV28BarParDes',fld:'vBARPARDES',pic:''},{av:'AV13OK',fld:'vOK',pic:''},{av:'AV18BarOriPar',fld:'vBARORIPAR',pic:''},{av:'AV11BarOriReo',fld:'vBARORIREO',pic:'9'},{av:'AV10BarOriCod',fld:'vBARORICOD',pic:'ZZZZZZZ9'},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36CosPrdOri',fld:'vCOSPRDORI',pic:'ZZZZZZ9.99'},{av:'AV35CosAnyOri',fld:'vCOSANYORI',pic:'ZZZZZZ9.99'},{av:'AV16Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'AV15Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV25BarPiepie',fld:'vBARPIEPIE',pic:'ZZZZZ9'},{av:'AV29Flag',fld:'vFLAG',pic:'9'},{av:'AV52Flag2',fld:'vFLAG2',pic:'ZZZ9'},{av:'AV53BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV54BarSit',fld:'vBARSIT',pic:'Z9'}]}");
      setEventMetadata("'DOSALIR'","{handler:'e1415E2',iparms:[{av:'AV13OK',fld:'vOK',pic:''},{av:'AV36CosPrdOri',fld:'vCOSPRDORI',pic:'ZZZZZZ9.99'},{av:'AV35CosAnyOri',fld:'vCOSANYORI',pic:'ZZZZZZ9.99'},{av:'AV38Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV17Rectotkgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV16Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'AV15Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV14Conos',fld:'vCONOS',pic:'ZZZ9'},{av:'AV25BarPiepie',fld:'vBARPIEPIE',pic:'ZZZZZ9'},{av:'AV24BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV23BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV22Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV21Barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV20Barserdsc',fld:'vBARSERDSC',pic:''},{av:'AV19Barser',fld:'vBARSER',pic:''},{av:'AV18BarOriPar',fld:'vBARORIPAR',pic:''},{av:'AV11BarOriReo',fld:'vBARORIREO',pic:'9'},{av:'AV10BarOriCod',fld:'vBARORICOD',pic:'ZZZZZZZ9'},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOSALIR'",",oparms:[]}");
      setEventMetadata("'DOCREARPARTICION'","{handler:'e1515E2',iparms:[{av:'AV8Partic',fld:'vPARTIC',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV10BarOriCod',fld:'vBARORICOD',pic:'ZZZZZZZ9'},{av:'AV11BarOriReo',fld:'vBARORIREO',pic:'9'},{av:'AV6BarParPan',fld:'vBARPARPAN',pic:''}]");
      setEventMetadata("'DOCREARPARTICION'",",oparms:[{av:'AV6BarParPan',fld:'vBARPARPAN',pic:''},{av:'AV11BarOriReo',fld:'vBARORIREO',pic:'9'},{av:'AV10BarOriCod',fld:'vBARORICOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV8Partic',fld:'vPARTIC',pic:'ZZZ9'},{av:'AV5BarCodPan',fld:'vBARCODPAN',pic:'ZZZZZZZ9'},{av:'AV7BarReoPan',fld:'vBARREOPAN',pic:'9'}]}");
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
      wcpOAV12EmprCod = "" ;
      wcpOAV18BarOriPar = "" ;
      wcpOAV19Barser = "" ;
      wcpOAV20Barserdsc = "" ;
      wcpOAV21Barcolnom = "" ;
      wcpOAV23BarKgm = DecimalUtil.ZERO ;
      wcpOAV24BarMtr = DecimalUtil.ZERO ;
      wcpOAV15Kilos = DecimalUtil.ZERO ;
      wcpOAV16Metros = DecimalUtil.ZERO ;
      wcpOAV17Rectotkgm = DecimalUtil.ZERO ;
      wcpOAV35CosAnyOri = DecimalUtil.ZERO ;
      wcpOAV36CosPrdOri = DecimalUtil.ZERO ;
      wcpOAV13OK = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV12EmprCod = "" ;
      AV18BarOriPar = "" ;
      AV19Barser = "" ;
      AV20Barserdsc = "" ;
      AV21Barcolnom = "" ;
      AV23BarKgm = DecimalUtil.ZERO ;
      AV24BarMtr = DecimalUtil.ZERO ;
      AV15Kilos = DecimalUtil.ZERO ;
      AV16Metros = DecimalUtil.ZERO ;
      AV17Rectotkgm = DecimalUtil.ZERO ;
      AV35CosAnyOri = DecimalUtil.ZERO ;
      AV36CosPrdOri = DecimalUtil.ZERO ;
      AV13OK = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV57Pgmname = "" ;
      AV49UsurCod = "" ;
      AV50station = "" ;
      AV43msg1 = "" ;
      GXKey = "" ;
      AV53BarAgrEst = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV28BarParDes = "" ;
      A120BarAgrEst = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV6BarParPan = "" ;
      bttBtncrearparticion_Jsonclick = "" ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      AV40Kilosdestino = DecimalUtil.ZERO ;
      AV41MetrosDestino = DecimalUtil.ZERO ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtnsalir_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      scmdbuf = "" ;
      H015E2_A396EmprCod = new String[] {""} ;
      AV51EmprNom = "" ;
      AV42msg0 = "" ;
      GXt_char1 = "" ;
      AV46Kilos2 = DecimalUtil.ZERO ;
      AV47Metros2 = DecimalUtil.ZERO ;
      AV48Inc_obs = "" ;
      GXv_int5 = new byte[1] ;
      GXv_int7 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int18 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int13 = new short[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_int12 = new short[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int8 = new byte[1] ;
      H015E3_A130BarCodPar = new String[] {""} ;
      H015E3_A132BarCodReo = new byte[1] ;
      H015E3_A129BarCod = new int[1] ;
      H015E3_A396EmprCod = new String[] {""} ;
      H015E3_A120BarAgrEst = new String[] {""} ;
      H015E3_A213BarSit = new byte[1] ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.particionhdrs2__default(),
         new Object[] {
             new Object[] {
            H015E2_A396EmprCod
            }
            , new Object[] {
            H015E3_A130BarCodPar, H015E3_A132BarCodReo, H015E3_A129BarCod, H015E3_A396EmprCod, H015E3_A120BarAgrEst, H015E3_A213BarSit
            }
         }
      );
      AV57Pgmname = "ParticionHdrs2" ;
      /* GeneXus formulas. */
      AV57Pgmname = "ParticionHdrs2" ;
      Gx_err = (short)(0) ;
      edtavBarser_Enabled = 0 ;
      edtavBarserdsc_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBarkgm_Enabled = 0 ;
      edtavBarmtr_Enabled = 0 ;
      edtavBarpiepie_Enabled = 0 ;
   }

   private byte wcpOAV11BarOriReo ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV11BarOriReo ;
   private byte gxajaxcallmode ;
   private byte AV54BarSit ;
   private byte AV29Flag ;
   private byte A132BarCodReo ;
   private byte AV27BarReoDes ;
   private byte A213BarSit ;
   private byte AV7BarReoPan ;
   private byte nDonePA ;
   private byte AV37Signo ;
   private byte GXv_int5[] ;
   private byte GXv_int18[] ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
   private short wcpOAV14Conos ;
   private short wcpOAV38Barpes ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV14Conos ;
   private short AV38Barpes ;
   private short AV8Partic ;
   private short AV52Flag2 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV30TinEst ;
   private short AV9Destino ;
   private short AV45Conos2 ;
   private short GXv_int13[] ;
   private short GXv_int12[] ;
   private int wcpOAV10BarOriCod ;
   private int wcpOAV22Barcolnum ;
   private int wcpOAV25BarPiepie ;
   private int AV10BarOriCod ;
   private int AV22Barcolnum ;
   private int AV25BarPiepie ;
   private int A129BarCod ;
   private int AV26BarCodDes ;
   private int edtavBarser_Enabled ;
   private int edtavBarserdsc_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBarcolnum_Enabled ;
   private int edtavBarkgm_Enabled ;
   private int edtavBarmtr_Enabled ;
   private int edtavBarpiepie_Enabled ;
   private int AV5BarCodPan ;
   private int edtavBarcodpan_Enabled ;
   private int edtavBarreopan_Enabled ;
   private int edtavBarparpan_Enabled ;
   private int edtavKilosdestino_Enabled ;
   private int edtavMetrosdestino_Enabled ;
   private int AV39PiezasDestino ;
   private int edtavPiezasdestino_Enabled ;
   private int GXv_int7[] ;
   private int GXv_int6[] ;
   private int GXv_int9[] ;
   private int idxLst ;
   private java.math.BigDecimal wcpOAV23BarKgm ;
   private java.math.BigDecimal wcpOAV24BarMtr ;
   private java.math.BigDecimal wcpOAV15Kilos ;
   private java.math.BigDecimal wcpOAV16Metros ;
   private java.math.BigDecimal wcpOAV17Rectotkgm ;
   private java.math.BigDecimal wcpOAV35CosAnyOri ;
   private java.math.BigDecimal wcpOAV36CosPrdOri ;
   private java.math.BigDecimal AV23BarKgm ;
   private java.math.BigDecimal AV24BarMtr ;
   private java.math.BigDecimal AV15Kilos ;
   private java.math.BigDecimal AV16Metros ;
   private java.math.BigDecimal AV17Rectotkgm ;
   private java.math.BigDecimal AV35CosAnyOri ;
   private java.math.BigDecimal AV36CosPrdOri ;
   private java.math.BigDecimal AV40Kilosdestino ;
   private java.math.BigDecimal AV41MetrosDestino ;
   private java.math.BigDecimal AV46Kilos2 ;
   private java.math.BigDecimal AV47Metros2 ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private String wcpOAV12EmprCod ;
   private String wcpOAV18BarOriPar ;
   private String wcpOAV19Barser ;
   private String wcpOAV20Barserdsc ;
   private String wcpOAV21Barcolnom ;
   private String wcpOAV13OK ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV12EmprCod ;
   private String AV18BarOriPar ;
   private String AV19Barser ;
   private String AV20Barserdsc ;
   private String AV21Barcolnom ;
   private String AV13OK ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV57Pgmname ;
   private String AV49UsurCod ;
   private String AV50station ;
   private String AV43msg1 ;
   private String GXKey ;
   private String AV53BarAgrEst ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV28BarParDes ;
   private String A120BarAgrEst ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Dvelop_confirmpanel_confirmar_Title ;
   private String Dvelop_confirmpanel_confirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar_Confirmtype ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String edtavBarser_Internalname ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarserdsc_Internalname ;
   private String edtavBarserdsc_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String edtavBarcolnom_Internalname ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcolnum_Internalname ;
   private String edtavBarcolnum_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String edtavBarkgm_Internalname ;
   private String edtavBarkgm_Jsonclick ;
   private String edtavBarmtr_Internalname ;
   private String edtavBarmtr_Jsonclick ;
   private String edtavBarpiepie_Internalname ;
   private String edtavBarpiepie_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavBarcodpan_Internalname ;
   private String TempTags ;
   private String edtavBarcodpan_Jsonclick ;
   private String edtavBarreopan_Internalname ;
   private String edtavBarreopan_Jsonclick ;
   private String edtavBarparpan_Internalname ;
   private String AV6BarParPan ;
   private String edtavBarparpan_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String bttBtncrearparticion_Internalname ;
   private String bttBtncrearparticion_Jsonclick ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavKilosdestino_Internalname ;
   private String edtavKilosdestino_Jsonclick ;
   private String edtavMetrosdestino_Internalname ;
   private String edtavMetrosdestino_Jsonclick ;
   private String edtavPiezasdestino_Internalname ;
   private String edtavPiezasdestino_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtnsalir_Internalname ;
   private String bttBtnsalir_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String scmdbuf ;
   private String AV51EmprNom ;
   private String AV42msg0 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private String AV48Inc_obs ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private IDataStoreProvider pr_default ;
   private String[] H015E2_A396EmprCod ;
   private String[] H015E3_A130BarCodPar ;
   private byte[] H015E3_A132BarCodReo ;
   private int[] H015E3_A129BarCod ;
   private String[] H015E3_A396EmprCod ;
   private String[] H015E3_A120BarAgrEst ;
   private byte[] H015E3_A213BarSit ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class particionhdrs2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H015E2", "SELECT EmprCod FROM TXPEMPRES ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015E3", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarAgrEst, BarSit FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

