package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webpartesproduccionupd_impl extends GXDataArea
{
   public webpartesproduccionupd_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webpartesproduccionupd_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webpartesproduccionupd_impl.class ));
   }

   public webpartesproduccionupd_impl( int remoteHandle ,
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
            A396EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               A602MaqCod = httpContext.GetPar( "MaqCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
               A558HisProFec = localUtil.parseDateParm( httpContext.GetPar( "HisProFec")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
               A561HisProLin = (int)(GXutil.lval( httpContext.GetPar( "HisProLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
               AV5BarNHdr = httpContext.GetPar( "BarNHdr") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5BarNHdr", AV5BarNHdr);
               AV7BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarOrdLin), 4, 0));
               AV8Fase = httpContext.GetPar( "Fase") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8Fase", AV8Fase);
               AV9FaseDsc = httpContext.GetPar( "FaseDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9FaseDsc", AV9FaseDsc);
               AV24Usurcod = httpContext.GetPar( "Usurcod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24Usurcod", AV24Usurcod);
               AV28station = httpContext.GetPar( "station") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28station", AV28station);
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
      paHN2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startHN2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webpartesproduccionupd", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod)),GXutil.URLEncode(GXutil.formatDateParm(A558HisProFec)),GXutil.URLEncode(GXutil.ltrimstr(A561HisProLin,8,0)),GXutil.URLEncode(GXutil.rtrim(AV5BarNHdr)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarOrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(AV8Fase)),GXutil.URLEncode(GXutil.rtrim(AV9FaseDsc)),GXutil.URLEncode(GXutil.rtrim(AV24Usurcod)),GXutil.URLEncode(GXutil.rtrim(AV28station))}, new String[] {"EmprCod","MaqCod","HisProFec","HisProLin","BarNHdr","BarOrdLin","Fase","FaseDsc","Usurcod","station"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDATOSARTICULO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19DatosArticulo), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20Barpes), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRUOPECODOLD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29GruOpeCodold), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPROKGROLD", getSecureSignedToken( "", localUtil.format( AV30HisProKgrold, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPROMTROLD", getSecureSignedToken( "", localUtil.format( AV35HisProMtrold, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPRONPZSOLD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31HisProNpzsold), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPROTUROLD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32HisProTurold), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPROFOLD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36HisProFold, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPRODTIOLD", getSecureSignedToken( "", localUtil.format( AV33HisProDTIold, "99/99/99 99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPRODTFOLD", getSecureSignedToken( "", localUtil.format( AV34HisProDTFold, "99/99/99 99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV55Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRUOPECOD_DATA", AV39GruOpeCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRUOPECOD_DATA", AV39GruOpeCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPARCOD_DATA", AV37ParCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPARCOD_DATA", AV37ParCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vDATOSARTICULO", GXutil.ltrim( localUtil.ntoc( AV19DatosArticulo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDATOSARTICULO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19DatosArticulo), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPES", GXutil.ltrim( localUtil.ntoc( AV20Barpes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20Barpes), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD", GXutil.rtrim( A602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROFEC", localUtil.dtoc( A558HisProFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROLIN", GXutil.ltrim( localUtil.ntoc( A561HisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISHHMAQ", GXutil.ltrim( localUtil.ntoc( AV22Hishhmaq, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISHHINI", GXutil.ltrim( localUtil.ntoc( AV23HisHhIni, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV28station));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV24Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPROANCF", GXutil.ltrim( localUtil.ntoc( AV41HisproAncF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPROANCI", GXutil.ltrim( localUtil.ntoc( AV42HisProAncI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPROMTSF", GXutil.ltrim( localUtil.ntoc( AV43HisProMtsF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPROMTSI", GXutil.ltrim( localUtil.ntoc( AV44HisProMtsI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV25BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV21BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV26BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRUOPECODOLD", GXutil.ltrim( localUtil.ntoc( AV29GruOpeCodold, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRUOPECODOLD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29GruOpeCodold), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPROKGROLD", GXutil.ltrim( localUtil.ntoc( AV30HisProKgrold, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPROKGROLD", getSecureSignedToken( "", localUtil.format( AV30HisProKgrold, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPROMTROLD", GXutil.ltrim( localUtil.ntoc( AV35HisProMtrold, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPROMTROLD", getSecureSignedToken( "", localUtil.format( AV35HisProMtrold, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPRONPZSOLD", GXutil.ltrim( localUtil.ntoc( AV31HisProNpzsold, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPRONPZSOLD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31HisProNpzsold), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPROTUROLD", GXutil.ltrim( localUtil.ntoc( AV32HisProTurold, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPROTUROLD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32HisProTurold), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPROFOLD", GXutil.rtrim( AV36HisProFold));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPROFOLD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36HisProFold, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPRODTIOLD", localUtil.ttoc( AV33HisProDTIold, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPRODTIOLD", getSecureSignedToken( "", localUtil.format( AV33HisProDTIold, "99/99/99 99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPRODTFOLD", localUtil.ttoc( AV34HisProDTFold, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPRODTFOLD", getSecureSignedToken( "", localUtil.format( AV34HisProDTFold, "99/99/99 99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV55Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV55Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASE", GXutil.rtrim( A461Fase));
      app.GxWebStd.gx_hidden_field( httpContext, "FASEDSC", GXutil.rtrim( A7258FaseDsc));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GRUOPECOD_Cls", GXutil.rtrim( Combo_gruopecod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GRUOPECOD_Selectedvalue_set", GXutil.rtrim( Combo_gruopecod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GRUOPECOD_Emptyitem", GXutil.booltostr( Combo_gruopecod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARCOD_Cls", GXutil.rtrim( Combo_parcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARCOD_Selectedvalue_set", GXutil.rtrim( Combo_parcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARCOD_Emptyitemtext", GXutil.rtrim( Combo_parcod_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARCOD_Selectedvalue_get", GXutil.rtrim( Combo_parcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GRUOPECOD_Selectedvalue_get", GXutil.rtrim( Combo_gruopecod_Selectedvalue_get));
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
         weHN2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtHN2( ) ;
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
      return formatLink("app.webpartesproduccionupd", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod)),GXutil.URLEncode(GXutil.formatDateParm(A558HisProFec)),GXutil.URLEncode(GXutil.ltrimstr(A561HisProLin,8,0)),GXutil.URLEncode(GXutil.rtrim(AV5BarNHdr)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarOrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(AV8Fase)),GXutil.URLEncode(GXutil.rtrim(AV9FaseDsc)),GXutil.URLEncode(GXutil.rtrim(AV24Usurcod)),GXutil.URLEncode(GXutil.rtrim(AV28station))}, new String[] {"EmprCod","MaqCod","HisProFec","HisProLin","BarNHdr","BarOrdLin","Fase","FaseDsc","Usurcod","station"})  ;
   }

   public String getPgmname( )
   {
      return "WebPartesProduccionUPD" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Modificacion Parte de Produccion", "") ;
   }

   public void wbHN0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent15", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         wb_table1_17_HN2( true) ;
      }
      else
      {
         wb_table1_17_HN2( false) ;
      }
      return  ;
   }

   public void wb_table1_17_HN2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedgruopecod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_gruopecod_Internalname, httpContext.getMessage( "Operario", ""), "", "", lblTextblockcombo_gruopecod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebPartesProduccionUPD.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_gruopecod.setProperty("Caption", Combo_gruopecod_Caption);
         ucCombo_gruopecod.setProperty("Cls", Combo_gruopecod_Cls);
         ucCombo_gruopecod.setProperty("EmptyItem", Combo_gruopecod_Emptyitem);
         ucCombo_gruopecod.setProperty("DropDownOptionsData", AV39GruOpeCod_Data);
         ucCombo_gruopecod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_gruopecod_Internalname, "COMBO_GRUOPECODContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisprodti_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprodti_Internalname, httpContext.getMessage( "Inicio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHisprodti_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprodti_Internalname, localUtil.ttoc( AV10HisProDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV10HisProDTI, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprodti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprodti_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebPartesProduccionUPD.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisprodti_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHisprodti_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebPartesProduccionUPD.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisprodtf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprodtf_Internalname, httpContext.getMessage( "Fin", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHisprodtf_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprodtf_Internalname, localUtil.ttoc( AV11HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV11HisProDTF, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprodtf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprodtf_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebPartesProduccionUPD.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisprodtf_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHisprodtf_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebPartesProduccionUPD.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisprof_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprof_Internalname, httpContext.getMessage( "Fin?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprof_Internalname, GXutil.rtrim( AV12HisProF), GXutil.rtrim( localUtil.format( AV12HisProF, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprof_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprof_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebPartesProduccionUPD.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisprotur_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprotur_Internalname, httpContext.getMessage( "Turno", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprotur_Internalname, GXutil.ltrim( localUtil.ntoc( AV13HisProTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavHisprotur_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV13HisProTur), "9") : localUtil.format( DecimalUtil.doubleToDec(AV13HisProTur), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprotur_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprotur_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebPartesProduccionUPD.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisprokgr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprokgr_Internalname, httpContext.getMessage( "Kgs", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprokgr_Internalname, GXutil.ltrim( localUtil.ntoc( AV14HisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavHisprokgr_Enabled!=0) ? localUtil.format( AV14HisProKgr, "ZZZZZ9.99") : localUtil.format( AV14HisProKgr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprokgr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprokgr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebPartesProduccionUPD.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHispromtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHispromtr_Internalname, httpContext.getMessage( "Mts", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHispromtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV15HisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavHispromtr_Enabled!=0) ? localUtil.format( AV15HisProMtr, "ZZZZZ9.99") : localUtil.format( AV15HisProMtr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHispromtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHispromtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebPartesProduccionUPD.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHispronpzs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHispronpzs_Internalname, httpContext.getMessage( "Pcs", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHispronpzs_Internalname, GXutil.ltrim( localUtil.ntoc( AV16HisProNpzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavHispronpzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV16HisProNpzs), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV16HisProNpzs), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHispronpzs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHispronpzs_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebPartesProduccionUPD.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedparcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_parcod_Internalname, httpContext.getMessage( "Paro", ""), "", "", lblTextblockcombo_parcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebPartesProduccionUPD.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_parcod.setProperty("Caption", Combo_parcod_Caption);
         ucCombo_parcod.setProperty("Cls", Combo_parcod_Cls);
         ucCombo_parcod.setProperty("EmptyItemText", Combo_parcod_Emptyitemtext);
         ucCombo_parcod.setProperty("DropDownOptionsData", AV37ParCod_Data);
         ucCombo_parcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_parcod_Internalname, "COMBO_PARCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e11hn1_client"+"'", TempTags, "", 2, "HLP_WebPartesProduccionUPD.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebPartesProduccionUPD.htm");
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
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGruopecod_Internalname, GXutil.ltrim( localUtil.ntoc( AV6GruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6GruOpeCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,108);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGruopecod_Jsonclick, 0, "Attribute", "", "", "", "", edtavGruopecod_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebPartesProduccionUPD.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavParcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV17ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17ParCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavParcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavParcod_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebPartesProduccionUPD.htm");
         wb_table2_110_HN2( true) ;
      }
      else
      {
         wb_table2_110_HN2( false) ;
      }
      return  ;
   }

   public void wb_table2_110_HN2e( boolean wbgen )
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

   public void startHN2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Modificacion Parte de Produccion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupHN0( ) ;
   }

   public void wsHN2( )
   {
      startHN2( ) ;
      evtHN2( ) ;
   }

   public void evtHN2( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12HN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e13HN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e14HN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e15HN2 ();
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

   public void weHN2( )
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

   public void paHN2( )
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
            GX_FocusControl = edtavHisprodti_Internalname ;
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
      rfHN2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV55Pgmname = "WebPartesProduccionUPD" ;
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavBarordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarordlin_Enabled), 5, 0), true);
      edtavFase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFase_Enabled), 5, 0), true);
      edtavFasedsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasedsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasedsc_Enabled), 5, 0), true);
   }

   public void rfHN2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00HN2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A129BarCod = H00HN2_A129BarCod[0] ;
            A132BarCodReo = H00HN2_A132BarCodReo[0] ;
            A130BarCodPar = H00HN2_A130BarCodPar[0] ;
            A194BarOrdLin = H00HN2_A194BarOrdLin[0] ;
            A503GruOpeCod = H00HN2_A503GruOpeCod[0] ;
            A4440HisProDTI = H00HN2_A4440HisProDTI[0] ;
            n4440HisProDTI = H00HN2_n4440HisProDTI[0] ;
            A4441HisProDTF = H00HN2_A4441HisProDTF[0] ;
            n4441HisProDTF = H00HN2_n4441HisProDTF[0] ;
            A557HisProF = H00HN2_A557HisProF[0] ;
            A566HisProTur = H00HN2_A566HisProTur[0] ;
            A1525HisProKgr = H00HN2_A1525HisProKgr[0] ;
            A1526HisProMtr = H00HN2_A1526HisProMtr[0] ;
            A656ParCod = H00HN2_A656ParCod[0] ;
            n656ParCod = H00HN2_n656ParCod[0] ;
            A4003HisHhMaq = H00HN2_A4003HisHhMaq[0] ;
            A1060HisHhIni = H00HN2_A1060HisHhIni[0] ;
            A4714HisProNpzs = H00HN2_A4714HisProNpzs[0] ;
            A252CliCod = H00HN2_A252CliCod[0] ;
            n252CliCod = H00HN2_n252CliCod[0] ;
            A212BarSer = H00HN2_A212BarSer[0] ;
            A14024HisProAncF = H00HN2_A14024HisProAncF[0] ;
            A14022HisProAncI = H00HN2_A14022HisProAncI[0] ;
            A14023HisProMtsF = H00HN2_A14023HisProMtsF[0] ;
            A14021HisproMtsI = H00HN2_A14021HisproMtsI[0] ;
            A461Fase = H00HN2_A461Fase[0] ;
            A252CliCod = H00HN2_A252CliCod[0] ;
            n252CliCod = H00HN2_n252CliCod[0] ;
            A212BarSer = H00HN2_A212BarSer[0] ;
            GXt_char1 = A7258FaseDsc ;
            GXv_char2[0] = GXt_char1 ;
            new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char2) ;
            webpartesproduccionupd_impl.this.GXt_char1 = GXv_char2[0] ;
            A7258FaseDsc = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A7258FaseDsc", A7258FaseDsc);
            /* Execute user event: Load */
            e15HN2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wbHN0( ) ;
      }
   }

   public void send_integrity_lvl_hashesHN2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vDATOSARTICULO", GXutil.ltrim( localUtil.ntoc( AV19DatosArticulo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDATOSARTICULO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19DatosArticulo), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPES", GXutil.ltrim( localUtil.ntoc( AV20Barpes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20Barpes), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRUOPECODOLD", GXutil.ltrim( localUtil.ntoc( AV29GruOpeCodold, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRUOPECODOLD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29GruOpeCodold), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPROKGROLD", GXutil.ltrim( localUtil.ntoc( AV30HisProKgrold, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPROKGROLD", getSecureSignedToken( "", localUtil.format( AV30HisProKgrold, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPROMTROLD", GXutil.ltrim( localUtil.ntoc( AV35HisProMtrold, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPROMTROLD", getSecureSignedToken( "", localUtil.format( AV35HisProMtrold, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPRONPZSOLD", GXutil.ltrim( localUtil.ntoc( AV31HisProNpzsold, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPRONPZSOLD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31HisProNpzsold), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPROTUROLD", GXutil.ltrim( localUtil.ntoc( AV32HisProTurold, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPROTUROLD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32HisProTurold), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPROFOLD", GXutil.rtrim( AV36HisProFold));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPROFOLD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36HisProFold, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPRODTIOLD", localUtil.ttoc( AV33HisProDTIold, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPRODTIOLD", getSecureSignedToken( "", localUtil.format( AV33HisProDTIold, "99/99/99 99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPRODTFOLD", localUtil.ttoc( AV34HisProDTFold, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPRODTFOLD", getSecureSignedToken( "", localUtil.format( AV34HisProDTFold, "99/99/99 99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV55Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV55Pgmname, ""))));
   }

   public void before_start_formulas( )
   {
      AV55Pgmname = "WebPartesProduccionUPD" ;
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavBarordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarordlin_Enabled), 5, 0), true);
      edtavFase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFase_Enabled), 5, 0), true);
      edtavFasedsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasedsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasedsc_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupHN0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13HN2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vGRUOPECOD_DATA"), AV39GruOpeCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPARCOD_DATA"), AV37ParCod_Data);
         /* Read saved values. */
         AV20Barpes = (short)(localUtil.ctol( httpContext.cgiGet( "vBARPES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV19DatosArticulo = (short)(localUtil.ctol( httpContext.cgiGet( "vDATOSARTICULO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Combo_gruopecod_Cls = httpContext.cgiGet( "COMBO_GRUOPECOD_Cls") ;
         Combo_gruopecod_Selectedvalue_set = httpContext.cgiGet( "COMBO_GRUOPECOD_Selectedvalue_set") ;
         Combo_gruopecod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_GRUOPECOD_Emptyitem")) ;
         Combo_parcod_Cls = httpContext.cgiGet( "COMBO_PARCOD_Cls") ;
         Combo_parcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PARCOD_Selectedvalue_set") ;
         Combo_parcod_Emptyitemtext = httpContext.cgiGet( "COMBO_PARCOD_Emptyitemtext") ;
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
         Dvelop_confirmpanel_btnconfirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype") ;
         /* Read variables values. */
         AV7BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarOrdLin), 4, 0));
         AV8Fase = httpContext.cgiGet( edtavFase_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Fase", AV8Fase);
         AV9FaseDsc = httpContext.cgiGet( edtavFasedsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9FaseDsc", AV9FaseDsc);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavHisprodti_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHISPRODTI");
            GX_FocusControl = edtavHisprodti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10HisProDTI = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV10HisProDTI", localUtil.ttoc( AV10HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV10HisProDTI = localUtil.ctot( httpContext.cgiGet( edtavHisprodti_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10HisProDTI", localUtil.ttoc( AV10HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavHisprodtf_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHISPRODTF");
            GX_FocusControl = edtavHisprodtf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11HisProDTF = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV11HisProDTF", localUtil.ttoc( AV11HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV11HisProDTF = localUtil.ctot( httpContext.cgiGet( edtavHisprodtf_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11HisProDTF", localUtil.ttoc( AV11HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         AV12HisProF = GXutil.upper( httpContext.cgiGet( edtavHisprof_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12HisProF", AV12HisProF);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHisprotur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHisprotur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHISPROTUR");
            GX_FocusControl = edtavHisprotur_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13HisProTur = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13HisProTur", GXutil.str( AV13HisProTur, 1, 0));
         }
         else
         {
            AV13HisProTur = (byte)(localUtil.ctol( httpContext.cgiGet( edtavHisprotur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13HisProTur", GXutil.str( AV13HisProTur, 1, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavHisprokgr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavHisprokgr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHISPROKGR");
            GX_FocusControl = edtavHisprokgr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14HisProKgr = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14HisProKgr", GXutil.ltrimstr( AV14HisProKgr, 9, 2));
         }
         else
         {
            AV14HisProKgr = localUtil.ctond( httpContext.cgiGet( edtavHisprokgr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14HisProKgr", GXutil.ltrimstr( AV14HisProKgr, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavHispromtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavHispromtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHISPROMTR");
            GX_FocusControl = edtavHispromtr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15HisProMtr = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15HisProMtr", GXutil.ltrimstr( AV15HisProMtr, 9, 2));
         }
         else
         {
            AV15HisProMtr = localUtil.ctond( httpContext.cgiGet( edtavHispromtr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15HisProMtr", GXutil.ltrimstr( AV15HisProMtr, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHispronpzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHispronpzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHISPRONPZS");
            GX_FocusControl = edtavHispronpzs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16HisProNpzs = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16HisProNpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16HisProNpzs), 4, 0));
         }
         else
         {
            AV16HisProNpzs = (short)(localUtil.ctol( httpContext.cgiGet( edtavHispronpzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16HisProNpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16HisProNpzs), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGruopecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGruopecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRUOPECOD");
            GX_FocusControl = edtavGruopecod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6GruOpeCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6GruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6GruOpeCod), 6, 0));
         }
         else
         {
            AV6GruOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavGruopecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6GruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6GruOpeCod), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavParcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavParcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPARCOD");
            GX_FocusControl = edtavParcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17ParCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ParCod), 4, 0));
         }
         else
         {
            AV17ParCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavParcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ParCod), 4, 0));
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
      e13HN2 ();
      if (returnInSub) return;
   }

   public void e13HN2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int3 = (byte)(AV19DatosArticulo) ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DATART", ""), GXv_int4) ;
      webpartesproduccionupd_impl.this.GXt_int3 = GXv_int4[0] ;
      AV19DatosArticulo = GXt_int3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19DatosArticulo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19DatosArticulo), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDATOSARTICULO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19DatosArticulo), "ZZZ9")));
      GXt_char1 = AV28station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webpartesproduccionupd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28station", AV28station);
      GXv_char2[0] = AV53Emprcod ;
      GXv_char5[0] = AV54Emprnom ;
      GXv_char6[0] = AV24Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV28station, GXv_char2, GXv_char5, GXv_char6) ;
      webpartesproduccionupd_impl.this.AV53Emprcod = GXv_char2[0] ;
      webpartesproduccionupd_impl.this.AV54Emprnom = GXv_char5[0] ;
      webpartesproduccionupd_impl.this.AV24Usurcod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Usurcod", AV24Usurcod);
      edtavParcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavParcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavParcod_Visible), 5, 0), true);
      edtavGruopecod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGruopecod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGruopecod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOGRUOPECOD' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOPARCOD' */
      S122 ();
      if (returnInSub) return;
   }

   public void e12HN2( )
   {
      /* Dvelop_confirmpanel_btnconfirmar_Close Routine */
      returnInSub = false ;
      GXv_char6[0] = A396EmprCod ;
      GXv_char5[0] = A602MaqCod ;
      GXv_date7[0] = A558HisProFec ;
      GXv_int8[0] = A561HisProLin ;
      GXv_int9[0] = AV6GruOpeCod ;
      GXv_dtime10[0] = AV10HisProDTI ;
      GXv_dtime11[0] = AV11HisProDTF ;
      GXv_decimal12[0] = AV14HisProKgr ;
      GXv_decimal13[0] = AV15HisProMtr ;
      GXv_int4[0] = AV13HisProTur ;
      GXv_int14[0] = AV17ParCod ;
      GXv_char2[0] = AV12HisProF ;
      GXv_decimal15[0] = AV22Hishhmaq ;
      GXv_decimal16[0] = AV23HisHhIni ;
      GXv_char17[0] = AV28station ;
      GXv_char18[0] = AV24Usurcod ;
      GXv_int19[0] = AV16HisProNpzs ;
      GXv_int20[0] = AV41HisproAncF ;
      GXv_int21[0] = AV42HisProAncI ;
      GXv_decimal22[0] = AV43HisProMtsF ;
      GXv_decimal23[0] = AV44HisProMtsI ;
      new app.lectoroptico.pwbollm(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_date7, GXv_int8, GXv_int9, GXv_dtime10, GXv_dtime11, GXv_decimal12, GXv_decimal13, GXv_int4, GXv_int14, GXv_char2, GXv_decimal15, GXv_decimal16, GXv_char17, GXv_char18, GXv_int19, GXv_int20, GXv_int21, GXv_decimal22, GXv_decimal23) ;
      webpartesproduccionupd_impl.this.A396EmprCod = GXv_char6[0] ;
      webpartesproduccionupd_impl.this.A602MaqCod = GXv_char5[0] ;
      webpartesproduccionupd_impl.this.A558HisProFec = GXv_date7[0] ;
      webpartesproduccionupd_impl.this.A561HisProLin = GXv_int8[0] ;
      webpartesproduccionupd_impl.this.AV6GruOpeCod = GXv_int9[0] ;
      webpartesproduccionupd_impl.this.AV10HisProDTI = GXv_dtime10[0] ;
      webpartesproduccionupd_impl.this.AV11HisProDTF = GXv_dtime11[0] ;
      webpartesproduccionupd_impl.this.AV14HisProKgr = GXv_decimal12[0] ;
      webpartesproduccionupd_impl.this.AV15HisProMtr = GXv_decimal13[0] ;
      webpartesproduccionupd_impl.this.AV13HisProTur = GXv_int4[0] ;
      webpartesproduccionupd_impl.this.AV17ParCod = GXv_int14[0] ;
      webpartesproduccionupd_impl.this.AV12HisProF = GXv_char2[0] ;
      webpartesproduccionupd_impl.this.AV22Hishhmaq = GXv_decimal15[0] ;
      webpartesproduccionupd_impl.this.AV23HisHhIni = GXv_decimal16[0] ;
      webpartesproduccionupd_impl.this.AV28station = GXv_char17[0] ;
      webpartesproduccionupd_impl.this.AV24Usurcod = GXv_char18[0] ;
      webpartesproduccionupd_impl.this.AV16HisProNpzs = GXv_int19[0] ;
      webpartesproduccionupd_impl.this.AV41HisproAncF = GXv_int20[0] ;
      webpartesproduccionupd_impl.this.AV42HisProAncI = GXv_int21[0] ;
      webpartesproduccionupd_impl.this.AV43HisProMtsF = GXv_decimal22[0] ;
      webpartesproduccionupd_impl.this.AV44HisProMtsI = GXv_decimal23[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV6GruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6GruOpeCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV10HisProDTI", localUtil.ttoc( AV10HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "AV11HisProDTF", localUtil.ttoc( AV11HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "AV14HisProKgr", GXutil.ltrimstr( AV14HisProKgr, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV15HisProMtr", GXutil.ltrimstr( AV15HisProMtr, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV13HisProTur", GXutil.str( AV13HisProTur, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV17ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ParCod), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV12HisProF", AV12HisProF);
      httpContext.ajax_rsp_assign_attri("", false, "AV22Hishhmaq", GXutil.ltrimstr( AV22Hishhmaq, 10, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV23HisHhIni", GXutil.ltrimstr( AV23HisHhIni, 10, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV28station", AV28station);
      httpContext.ajax_rsp_assign_attri("", false, "AV24Usurcod", AV24Usurcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16HisProNpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16HisProNpzs), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV41HisproAncF", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41HisproAncF), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV42HisProAncI", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42HisProAncI), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV43HisProMtsF", GXutil.ltrimstr( AV43HisProMtsF, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV44HisProMtsI", GXutil.ltrimstr( AV44HisProMtsI, 9, 2));
      if ( GXutil.strcmp(AV12HisProF, httpContext.getMessage( "S", "")) == 0 )
      {
         GXv_char18[0] = A396EmprCod ;
         GXv_char17[0] = A602MaqCod ;
         GXv_date7[0] = A558HisProFec ;
         GXv_int9[0] = AV25BarCod ;
         GXv_int4[0] = AV21BarCodReo ;
         GXv_char6[0] = AV26BarCodPar ;
         GXv_int21[0] = AV7BarOrdLin ;
         new app.psilpar(remoteHandle, context).execute( GXv_char18, GXv_char17, GXv_date7, GXv_int9, GXv_int4, GXv_char6, GXv_int21) ;
         webpartesproduccionupd_impl.this.A396EmprCod = GXv_char18[0] ;
         webpartesproduccionupd_impl.this.A602MaqCod = GXv_char17[0] ;
         webpartesproduccionupd_impl.this.A558HisProFec = GXv_date7[0] ;
         webpartesproduccionupd_impl.this.AV25BarCod = GXv_int9[0] ;
         webpartesproduccionupd_impl.this.AV21BarCodReo = GXv_int4[0] ;
         webpartesproduccionupd_impl.this.AV26BarCodPar = GXv_char6[0] ;
         webpartesproduccionupd_impl.this.AV7BarOrdLin = GXv_int21[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV25BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21BarCodReo", GXutil.str( AV21BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV26BarCodPar", AV26BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarOrdLin), 4, 0));
      }
      GXv_char18[0] = A396EmprCod ;
      GXv_int9[0] = AV25BarCod ;
      GXv_int4[0] = AV21BarCodReo ;
      GXv_char17[0] = AV26BarCodPar ;
      GXv_int21[0] = AV7BarOrdLin ;
      new app.lectoroptico.pacfbar3(remoteHandle, context).execute( GXv_char18, GXv_int9, GXv_int4, GXv_char17, GXv_int21) ;
      webpartesproduccionupd_impl.this.A396EmprCod = GXv_char18[0] ;
      webpartesproduccionupd_impl.this.AV25BarCod = GXv_int9[0] ;
      webpartesproduccionupd_impl.this.AV21BarCodReo = GXv_int4[0] ;
      webpartesproduccionupd_impl.this.AV26BarCodPar = GXv_char17[0] ;
      webpartesproduccionupd_impl.this.AV7BarOrdLin = GXv_int21[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV25BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV21BarCodReo", GXutil.str( AV21BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV26BarCodPar", AV26BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarOrdLin), 4, 0));
      GXv_char18[0] = A396EmprCod ;
      GXv_char17[0] = A602MaqCod ;
      GXv_date7[0] = A558HisProFec ;
      GXv_int9[0] = A561HisProLin ;
      new app.pactbar(remoteHandle, context).execute( GXv_char18, GXv_char17, GXv_date7, GXv_int9) ;
      webpartesproduccionupd_impl.this.A396EmprCod = GXv_char18[0] ;
      webpartesproduccionupd_impl.this.A602MaqCod = GXv_char17[0] ;
      webpartesproduccionupd_impl.this.A558HisProFec = GXv_date7[0] ;
      webpartesproduccionupd_impl.this.A561HisProLin = GXv_int9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
      AV27Inc_obs = httpContext.getMessage( "Modifacion Linea", "") + httpContext.getMessage( " Usuario=", "") + AV24Usurcod + httpContext.getMessage( " Terminal=", "") + AV28station + GXutil.newLine( ) ;
      AV27Inc_obs += httpContext.getMessage( "Linea=", "") + GXutil.str( A561HisProLin, 8, 0) + httpContext.getMessage( " OldOperario=", "") + GXutil.str( AV29GruOpeCodold, 6, 0) + httpContext.getMessage( " Operario=", "") + GXutil.str( AV6GruOpeCod, 6, 0) + GXutil.newLine( ) ;
      AV27Inc_obs += httpContext.getMessage( "Orden=", "") + GXutil.str( AV7BarOrdLin, 4, 0) + httpContext.getMessage( " OldKgs=", "") + GXutil.str( AV30HisProKgrold, 9, 2) + httpContext.getMessage( " Kgs=", "") + GXutil.str( AV14HisProKgr, 9, 2) + httpContext.getMessage( " OldMts  =", "") + GXutil.str( AV35HisProMtrold, 9, 2) + GXutil.newLine( ) ;
      AV27Inc_obs += httpContext.getMessage( "Mts  =", "") + GXutil.str( AV15HisProMtr, 9, 2) + httpContext.getMessage( " OldPzs=", "") + GXutil.str( AV31HisProNpzsold, 4, 0) + httpContext.getMessage( " Pzs=", "") + GXutil.str( AV16HisProNpzs, 4, 0) + GXutil.newLine( ) ;
      AV27Inc_obs += httpContext.getMessage( "OldTurno=", "") + GXutil.str( AV32HisProTurold, 1, 0) + httpContext.getMessage( " Turno=", "") + GXutil.str( AV13HisProTur, 1, 0) + httpContext.getMessage( " OldFin=", "") + AV36HisProFold + httpContext.getMessage( " Fin=", "") + AV12HisProF + GXutil.newLine( ) ;
      AV27Inc_obs += httpContext.getMessage( "OldInicio=", "") + localUtil.ttoc( AV33HisProDTIold, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Inicio=", "") + localUtil.ttoc( AV10HisProDTI, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " OldFin=", "") + localUtil.ttoc( AV34HisProDTFold, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Fin=", "") + localUtil.ttoc( AV11HisProDTF, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Pml=", "") + GXutil.str( AV20Barpes, 4, 0) ;
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV55Pgmname, 1, 10), AV24Usurcod, AV28station, AV27Inc_obs, AV25BarCod, AV21BarCodReo, AV26BarCodPar) ;
      httpContext.setWebReturnParms(new Object[] {A396EmprCod,A602MaqCod,localUtil.format( A558HisProFec, "99/99/99"),Integer.valueOf(A561HisProLin),AV5BarNHdr,Short.valueOf(AV7BarOrdLin),AV8Fase,AV9FaseDsc,AV24Usurcod,AV28station});
      httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","A602MaqCod","A558HisProFec","A561HisProLin","AV5BarNHdr","AV7BarOrdLin","AV8Fase","AV9FaseDsc","AV24Usurcod","AV28station"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void e14HN2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {A396EmprCod,A602MaqCod,localUtil.format( A558HisProFec, "99/99/99"),Integer.valueOf(A561HisProLin),AV5BarNHdr,Short.valueOf(AV7BarOrdLin),AV8Fase,AV9FaseDsc,AV24Usurcod,AV28station});
      httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","A602MaqCod","A558HisProFec","A561HisProLin","AV5BarNHdr","AV7BarOrdLin","AV8Fase","AV9FaseDsc","AV24Usurcod","AV28station"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S122( )
   {
      /* 'LOADCOMBOPARCOD' Routine */
      returnInSub = false ;
      /* Using cursor H00HN3 */
      pr_default.execute(1, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A13824ParCodNomI = H00HN3_A13824ParCodNomI[0] ;
         A656ParCod = H00HN3_A656ParCod[0] ;
         n656ParCod = H00HN3_n656ParCod[0] ;
         A867ParCodNom = H00HN3_A867ParCodNom[0] ;
         n867ParCodNom = H00HN3_n867ParCodNom[0] ;
         AV38Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV38Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A656ParCod, 4, 0)) );
         AV38Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13824ParCodNomI );
         AV37ParCod_Data.add(AV38Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      Combo_parcod_Selectedvalue_set = ((0==AV17ParCod) ? "" : GXutil.trim( GXutil.str( AV17ParCod, 4, 0))) ;
      ucCombo_parcod.sendProperty(context, "", false, Combo_parcod_Internalname, "SelectedValue_set", Combo_parcod_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOGRUOPECOD' Routine */
      returnInSub = false ;
      /* Using cursor H00HN4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A8482OpeAct = H00HN4_A8482OpeAct[0] ;
         n8482OpeAct = H00HN4_n8482OpeAct[0] ;
         A13748OpeCNom = H00HN4_A13748OpeCNom[0] ;
         A652OpeCod = H00HN4_A652OpeCod[0] ;
         A653OpeNom = H00HN4_A653OpeNom[0] ;
         n653OpeNom = H00HN4_n653OpeNom[0] ;
         AV38Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV38Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A652OpeCod, 6, 0)) );
         AV38Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13748OpeCNom );
         AV39GruOpeCod_Data.add(AV38Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Combo_gruopecod_Selectedvalue_set = ((0==AV6GruOpeCod) ? "" : GXutil.trim( GXutil.str( AV6GruOpeCod, 6, 0))) ;
      ucCombo_gruopecod.sendProperty(context, "", false, Combo_gruopecod_Internalname, "SelectedValue_set", Combo_gruopecod_Selectedvalue_set);
   }

   protected void nextLoad( )
   {
   }

   protected void e15HN2( )
   {
      /* Load Routine */
      returnInSub = false ;
      AV50Hisprolin = A561HisProLin ;
      AV25BarCod = A129BarCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarCod), 8, 0));
      AV21BarCodReo = A132BarCodReo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21BarCodReo", GXutil.str( AV21BarCodReo, 1, 0));
      AV26BarCodPar = A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26BarCodPar", AV26BarCodPar);
      AV7BarOrdLin = A194BarOrdLin ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarOrdLin), 4, 0));
      AV6GruOpeCod = A503GruOpeCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6GruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6GruOpeCod), 6, 0));
      Combo_gruopecod_Selectedvalue_set = GXutil.trim( GXutil.str( AV6GruOpeCod, 6, 0)) ;
      ucCombo_gruopecod.sendProperty(context, "", false, Combo_gruopecod_Internalname, "SelectedValue_set", Combo_gruopecod_Selectedvalue_set);
      AV8Fase = A461Fase ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Fase", AV8Fase);
      AV9FaseDsc = A7258FaseDsc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9FaseDsc", AV9FaseDsc);
      AV10HisProDTI = A4440HisProDTI ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10HisProDTI", localUtil.ttoc( AV10HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV11HisProDTF = A4441HisProDTF ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11HisProDTF", localUtil.ttoc( AV11HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV12HisProF = A557HisProF ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12HisProF", AV12HisProF);
      AV13HisProTur = A566HisProTur ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13HisProTur", GXutil.str( AV13HisProTur, 1, 0));
      AV14HisProKgr = A1525HisProKgr ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14HisProKgr", GXutil.ltrimstr( AV14HisProKgr, 9, 2));
      AV15HisProMtr = A1526HisProMtr ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15HisProMtr", GXutil.ltrimstr( AV15HisProMtr, 9, 2));
      AV17ParCod = A656ParCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ParCod), 4, 0));
      Combo_parcod_Selectedvalue_set = GXutil.trim( GXutil.str( A656ParCod, 4, 0)) ;
      ucCombo_parcod.sendProperty(context, "", false, Combo_parcod_Internalname, "SelectedValue_set", Combo_parcod_Selectedvalue_set);
      GXv_char18[0] = A396EmprCod ;
      GXv_int9[0] = A129BarCod ;
      GXv_int4[0] = A132BarCodReo ;
      GXv_char17[0] = A130BarCodPar ;
      GXv_decimal23[0] = AV45Kgs ;
      GXv_decimal22[0] = AV46Mts ;
      new app.pkgmtpd(remoteHandle, context).execute( GXv_char18, GXv_int9, GXv_int4, GXv_char17, GXv_decimal23, GXv_decimal22) ;
      webpartesproduccionupd_impl.this.A396EmprCod = GXv_char18[0] ;
      webpartesproduccionupd_impl.this.A129BarCod = GXv_int9[0] ;
      webpartesproduccionupd_impl.this.A132BarCodReo = GXv_int4[0] ;
      webpartesproduccionupd_impl.this.A130BarCodPar = GXv_char17[0] ;
      webpartesproduccionupd_impl.this.AV45Kgs = GXv_decimal23[0] ;
      webpartesproduccionupd_impl.this.AV46Mts = GXv_decimal22[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV45Kgs", GXutil.ltrimstr( AV45Kgs, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV46Mts", GXutil.ltrimstr( AV46Mts, 9, 2));
      AV22Hishhmaq = A4003HisHhMaq ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Hishhmaq", GXutil.ltrimstr( AV22Hishhmaq, 10, 2));
      AV23HisHhIni = A1060HisHhIni ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23HisHhIni", GXutil.ltrimstr( AV23HisHhIni, 10, 2));
      AV16HisProNpzs = A4714HisProNpzs ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16HisProNpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16HisProNpzs), 4, 0));
      AV48CliCod = A252CliCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48CliCod), 6, 0));
      AV49Barser = A212BarSer ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Barser", AV49Barser);
      /* Execute user subroutine: 'ARTICU' */
      S132 ();
      if (returnInSub) return;
      AV41HisproAncF = A14024HisProAncF ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41HisproAncF", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41HisproAncF), 4, 0));
      AV42HisProAncI = A14022HisProAncI ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42HisProAncI", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42HisProAncI), 4, 0));
      AV43HisProMtsF = A14023HisProMtsF ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43HisProMtsF", GXutil.ltrimstr( AV43HisProMtsF, 9, 2));
      AV44HisProMtsI = A14021HisproMtsI ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44HisProMtsI", GXutil.ltrimstr( AV44HisProMtsI, 9, 2));
   }

   public void S132( )
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV20Barpes = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Barpes), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20Barpes), "ZZZ9")));
      /* Using cursor H00HN5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV48CliCod), AV49Barser});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A65ArtCod = H00HN5_A65ArtCod[0] ;
         A252CliCod = H00HN5_A252CliCod[0] ;
         n252CliCod = H00HN5_n252CliCod[0] ;
         A7415ArtPmlCru = H00HN5_A7415ArtPmlCru[0] ;
         n7415ArtPmlCru = H00HN5_n7415ArtPmlCru[0] ;
         AV20Barpes = A7415ArtPmlCru ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Barpes), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20Barpes), "ZZZ9")));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void wb_table2_110_HN2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnconfirmar.setProperty("Title", Dvelop_confirmpanel_btnconfirmar_Title);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_btnconfirmar_Confirmationtext);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmType", Dvelop_confirmpanel_btnconfirmar_Confirmtype);
         ucDvelop_confirmpanel_btnconfirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnconfirmar_Internalname, "DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_110_HN2e( true) ;
      }
      else
      {
         wb_table2_110_HN2e( false) ;
      }
   }

   public void wb_table1_17_HN2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='CellMarginTop'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnhdr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnhdr_Internalname, httpContext.getMessage( "Nº Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnhdr_Internalname, GXutil.rtrim( AV5BarNHdr), GXutil.rtrim( localUtil.format( AV5BarNHdr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnhdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnhdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebPartesProduccionUPD.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarordlin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarordlin_Internalname, httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarordlin_Internalname, GXutil.ltrim( localUtil.ntoc( AV7BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarordlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV7BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV7BarOrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarordlin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarordlin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebPartesProduccionUPD.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFase_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFase_Internalname, httpContext.getMessage( "Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFase_Internalname, GXutil.rtrim( AV8Fase), GXutil.rtrim( localUtil.format( AV8Fase, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFase_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFase_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebPartesProduccionUPD.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFasedsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFasedsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFasedsc_Internalname, GXutil.rtrim( AV9FaseDsc), GXutil.rtrim( localUtil.format( AV9FaseDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFasedsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFasedsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebPartesProduccionUPD.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_17_HN2e( true) ;
      }
      else
      {
         wb_table1_17_HN2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A602MaqCod = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      A558HisProFec = (java.util.Date)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
      A561HisProLin = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
      AV5BarNHdr = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5BarNHdr", AV5BarNHdr);
      AV7BarOrdLin = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarOrdLin), 4, 0));
      AV8Fase = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Fase", AV8Fase);
      AV9FaseDsc = (String)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9FaseDsc", AV9FaseDsc);
      AV24Usurcod = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Usurcod", AV24Usurcod);
      AV28station = (String)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28station", AV28station);
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
      paHN2( ) ;
      wsHN2( ) ;
      weHN2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268171419642", true, true);
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
      httpContext.AddJavascriptSource("webpartesproduccionupd.js", "?20268171419642", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavBarnhdr_Internalname = "vBARNHDR" ;
      edtavBarordlin_Internalname = "vBARORDLIN" ;
      edtavFase_Internalname = "vFASE" ;
      edtavFasedsc_Internalname = "vFASEDSC" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      tblUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      lblTextblockcombo_gruopecod_Internalname = "TEXTBLOCKCOMBO_GRUOPECOD" ;
      Combo_gruopecod_Internalname = "COMBO_GRUOPECOD" ;
      divTablesplittedgruopecod_Internalname = "TABLESPLITTEDGRUOPECOD" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavHisprodti_Internalname = "vHISPRODTI" ;
      edtavHisprodtf_Internalname = "vHISPRODTF" ;
      edtavHisprof_Internalname = "vHISPROF" ;
      edtavHisprotur_Internalname = "vHISPROTUR" ;
      edtavHisprokgr_Internalname = "vHISPROKGR" ;
      edtavHispromtr_Internalname = "vHISPROMTR" ;
      edtavHispronpzs_Internalname = "vHISPRONPZS" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      lblTextblockcombo_parcod_Internalname = "TEXTBLOCKCOMBO_PARCOD" ;
      Combo_parcod_Internalname = "COMBO_PARCOD" ;
      divTablesplittedparcod_Internalname = "TABLESPLITTEDPARCOD" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavGruopecod_Internalname = "vGRUOPECOD" ;
      edtavParcod_Internalname = "vPARCOD" ;
      Dvelop_confirmpanel_btnconfirmar_Internalname = "DVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
      tblTabledvelop_confirmpanel_btnconfirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
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
      edtavFasedsc_Jsonclick = "" ;
      edtavFasedsc_Enabled = 0 ;
      edtavFase_Jsonclick = "" ;
      edtavFase_Enabled = 0 ;
      edtavBarordlin_Jsonclick = "" ;
      edtavBarordlin_Enabled = 0 ;
      edtavBarnhdr_Jsonclick = "" ;
      edtavBarnhdr_Enabled = 0 ;
      edtavParcod_Jsonclick = "" ;
      edtavParcod_Visible = 1 ;
      edtavGruopecod_Jsonclick = "" ;
      edtavGruopecod_Visible = 1 ;
      edtavHispronpzs_Jsonclick = "" ;
      edtavHispronpzs_Enabled = 1 ;
      edtavHispromtr_Jsonclick = "" ;
      edtavHispromtr_Enabled = 1 ;
      edtavHisprokgr_Jsonclick = "" ;
      edtavHisprokgr_Enabled = 1 ;
      edtavHisprotur_Jsonclick = "" ;
      edtavHisprotur_Enabled = 1 ;
      edtavHisprof_Jsonclick = "" ;
      edtavHisprof_Enabled = 1 ;
      edtavHisprodtf_Jsonclick = "" ;
      edtavHisprodtf_Enabled = 1 ;
      edtavHisprodti_Jsonclick = "" ;
      edtavHisprodti_Enabled = 1 ;
      Dvelop_confirmpanel_btnconfirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmationtext = "¿Confirma los Datos?" ;
      Dvelop_confirmpanel_btnconfirmar_Title = httpContext.getMessage( "Confirmar", "") ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Modificar", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Combo_parcod_Emptyitemtext = "" ;
      Combo_parcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_gruopecod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_gruopecod_Cls = "ExtendedCombo AttributeFL" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Datos", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Modificacion Parte de Produccion", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV19DatosArticulo',fld:'vDATOSARTICULO',pic:'ZZZ9',hsh:true},{av:'AV20Barpes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV29GruOpeCodold',fld:'vGRUOPECODOLD',pic:'ZZZZZ9',hsh:true},{av:'AV30HisProKgrold',fld:'vHISPROKGROLD',pic:'ZZZZZ9.99',hsh:true},{av:'AV35HisProMtrold',fld:'vHISPROMTROLD',pic:'ZZZZZ9.99',hsh:true},{av:'AV31HisProNpzsold',fld:'vHISPRONPZSOLD',pic:'ZZZ9',hsh:true},{av:'AV32HisProTurold',fld:'vHISPROTUROLD',pic:'9',hsh:true},{av:'AV36HisProFold',fld:'vHISPROFOLD',pic:'@!',hsh:true},{av:'AV33HisProDTIold',fld:'vHISPRODTIOLD',pic:'99/99/99 99:99:99',hsh:true},{av:'AV34HisProDTFold',fld:'vHISPRODTFOLD',pic:'99/99/99 99:99:99',hsh:true},{av:'AV55Pgmname',fld:'vPGMNAME',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e11HN1',iparms:[{av:'AV19DatosArticulo',fld:'vDATOSARTICULO',pic:'ZZZ9',hsh:true},{av:'AV15HisProMtr',fld:'vHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV20Barpes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV14HisProKgr',fld:'vHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV11HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV10HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV12HisProF',fld:'vHISPROF',pic:'@!'}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV14HisProKgr',fld:'vHISPROKGR',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE","{handler:'e12HN2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'AV6GruOpeCod',fld:'vGRUOPECOD',pic:'ZZZZZ9'},{av:'AV10HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV11HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV14HisProKgr',fld:'vHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV15HisProMtr',fld:'vHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV13HisProTur',fld:'vHISPROTUR',pic:'9'},{av:'AV17ParCod',fld:'vPARCOD',pic:'ZZZ9'},{av:'AV12HisProF',fld:'vHISPROF',pic:'@!'},{av:'AV22Hishhmaq',fld:'vHISHHMAQ',pic:'ZZZZZZ9.99'},{av:'AV23HisHhIni',fld:'vHISHHINI',pic:'ZZZZZZ9.99'},{av:'AV28station',fld:'vSTATION',pic:''},{av:'AV24Usurcod',fld:'vUSURCOD',pic:'@!'},{av:'AV16HisProNpzs',fld:'vHISPRONPZS',pic:'ZZZ9'},{av:'AV41HisproAncF',fld:'vHISPROANCF',pic:'ZZZ9'},{av:'AV42HisProAncI',fld:'vHISPROANCI',pic:'ZZZ9'},{av:'AV43HisProMtsF',fld:'vHISPROMTSF',pic:'ZZZZZ9.99'},{av:'AV44HisProMtsI',fld:'vHISPROMTSI',pic:'ZZZZZ9.99'},{av:'AV25BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV21BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV26BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV29GruOpeCodold',fld:'vGRUOPECODOLD',pic:'ZZZZZ9',hsh:true},{av:'AV30HisProKgrold',fld:'vHISPROKGROLD',pic:'ZZZZZ9.99',hsh:true},{av:'AV35HisProMtrold',fld:'vHISPROMTROLD',pic:'ZZZZZ9.99',hsh:true},{av:'AV31HisProNpzsold',fld:'vHISPRONPZSOLD',pic:'ZZZ9',hsh:true},{av:'AV32HisProTurold',fld:'vHISPROTUROLD',pic:'9',hsh:true},{av:'AV36HisProFold',fld:'vHISPROFOLD',pic:'@!',hsh:true},{av:'AV33HisProDTIold',fld:'vHISPRODTIOLD',pic:'99/99/99 99:99:99',hsh:true},{av:'AV34HisProDTFold',fld:'vHISPRODTFOLD',pic:'99/99/99 99:99:99',hsh:true},{av:'AV20Barpes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV55Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV9FaseDsc',fld:'vFASEDSC',pic:''},{av:'AV8Fase',fld:'vFASE',pic:''},{av:'AV5BarNHdr',fld:'vBARNHDR',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE",",oparms:[{av:'AV44HisProMtsI',fld:'vHISPROMTSI',pic:'ZZZZZ9.99'},{av:'AV43HisProMtsF',fld:'vHISPROMTSF',pic:'ZZZZZ9.99'},{av:'AV42HisProAncI',fld:'vHISPROANCI',pic:'ZZZ9'},{av:'AV41HisproAncF',fld:'vHISPROANCF',pic:'ZZZ9'},{av:'AV16HisProNpzs',fld:'vHISPRONPZS',pic:'ZZZ9'},{av:'AV24Usurcod',fld:'vUSURCOD',pic:'@!'},{av:'AV28station',fld:'vSTATION',pic:''},{av:'AV23HisHhIni',fld:'vHISHHINI',pic:'ZZZZZZ9.99'},{av:'AV22Hishhmaq',fld:'vHISHHMAQ',pic:'ZZZZZZ9.99'},{av:'AV12HisProF',fld:'vHISPROF',pic:'@!'},{av:'AV17ParCod',fld:'vPARCOD',pic:'ZZZ9'},{av:'AV13HisProTur',fld:'vHISPROTUR',pic:'9'},{av:'AV15HisProMtr',fld:'vHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV14HisProKgr',fld:'vHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV11HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV10HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV6GruOpeCod',fld:'vGRUOPECOD',pic:'ZZZZZ9'},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV7BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV26BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV21BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV25BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e14HN2',iparms:[{av:'AV28station',fld:'vSTATION',pic:''},{av:'AV24Usurcod',fld:'vUSURCOD',pic:'@!'},{av:'AV9FaseDsc',fld:'vFASEDSC',pic:''},{av:'AV8Fase',fld:'vFASE',pic:''},{av:'AV7BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV5BarNHdr',fld:'vBARNHDR',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VALIDV_HISPROF","{handler:'validv_Hisprof',iparms:[]");
      setEventMetadata("VALIDV_HISPROF",",oparms:[]}");
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
      wcpOA396EmprCod = "" ;
      wcpOA602MaqCod = "" ;
      wcpOA558HisProFec = GXutil.nullDate() ;
      wcpOAV5BarNHdr = "" ;
      wcpOAV8Fase = "" ;
      wcpOAV9FaseDsc = "" ;
      wcpOAV24Usurcod = "" ;
      wcpOAV28station = "" ;
      Combo_parcod_Selectedvalue_get = "" ;
      Combo_gruopecod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      AV5BarNHdr = "" ;
      AV8Fase = "" ;
      AV9FaseDsc = "" ;
      AV24Usurcod = "" ;
      AV28station = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV30HisProKgrold = DecimalUtil.ZERO ;
      AV35HisProMtrold = DecimalUtil.ZERO ;
      AV36HisProFold = "" ;
      AV33HisProDTIold = GXutil.resetTime( GXutil.nullDate() );
      AV34HisProDTFold = GXutil.resetTime( GXutil.nullDate() );
      AV55Pgmname = "" ;
      GXKey = "" ;
      AV39GruOpeCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV37ParCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV22Hishhmaq = DecimalUtil.ZERO ;
      AV23HisHhIni = DecimalUtil.ZERO ;
      AV43HisProMtsF = DecimalUtil.ZERO ;
      AV44HisProMtsI = DecimalUtil.ZERO ;
      AV26BarCodPar = "" ;
      A461Fase = "" ;
      A7258FaseDsc = "" ;
      Combo_gruopecod_Selectedvalue_set = "" ;
      Combo_parcod_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_gruopecod_Jsonclick = "" ;
      ucCombo_gruopecod = new com.genexus.webpanels.GXUserControl();
      Combo_gruopecod_Caption = "" ;
      TempTags = "" ;
      AV10HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV11HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV12HisProF = "" ;
      AV14HisProKgr = DecimalUtil.ZERO ;
      AV15HisProMtr = DecimalUtil.ZERO ;
      lblTextblockcombo_parcod_Jsonclick = "" ;
      ucCombo_parcod = new com.genexus.webpanels.GXUserControl();
      Combo_parcod_Caption = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      scmdbuf = "" ;
      H00HN2_A602MaqCod = new String[] {""} ;
      H00HN2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00HN2_A561HisProLin = new int[1] ;
      H00HN2_A129BarCod = new int[1] ;
      H00HN2_A132BarCodReo = new byte[1] ;
      H00HN2_A130BarCodPar = new String[] {""} ;
      H00HN2_A194BarOrdLin = new short[1] ;
      H00HN2_A503GruOpeCod = new int[1] ;
      H00HN2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H00HN2_n4440HisProDTI = new boolean[] {false} ;
      H00HN2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H00HN2_n4441HisProDTF = new boolean[] {false} ;
      H00HN2_A557HisProF = new String[] {""} ;
      H00HN2_A566HisProTur = new byte[1] ;
      H00HN2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00HN2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00HN2_A656ParCod = new short[1] ;
      H00HN2_n656ParCod = new boolean[] {false} ;
      H00HN2_A4003HisHhMaq = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00HN2_A1060HisHhIni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00HN2_A4714HisProNpzs = new short[1] ;
      H00HN2_A252CliCod = new int[1] ;
      H00HN2_n252CliCod = new boolean[] {false} ;
      H00HN2_A212BarSer = new String[] {""} ;
      H00HN2_A14024HisProAncF = new short[1] ;
      H00HN2_A14022HisProAncI = new short[1] ;
      H00HN2_A14023HisProMtsF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00HN2_A14021HisproMtsI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00HN2_A396EmprCod = new String[] {""} ;
      H00HN2_A461Fase = new String[] {""} ;
      A130BarCodPar = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A557HisProF = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A4003HisHhMaq = DecimalUtil.ZERO ;
      A1060HisHhIni = DecimalUtil.ZERO ;
      A212BarSer = "" ;
      A14023HisProMtsF = DecimalUtil.ZERO ;
      A14021HisproMtsI = DecimalUtil.ZERO ;
      GXt_char1 = "" ;
      AV53Emprcod = "" ;
      AV54Emprnom = "" ;
      GXv_char5 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_dtime10 = new java.util.Date[1] ;
      GXv_dtime11 = new java.util.Date[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_int14 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_int19 = new short[1] ;
      GXv_int20 = new short[1] ;
      GXv_char6 = new String[1] ;
      GXv_int21 = new short[1] ;
      GXv_date7 = new java.util.Date[1] ;
      AV27Inc_obs = "" ;
      H00HN3_A396EmprCod = new String[] {""} ;
      H00HN3_A13824ParCodNomI = new String[] {""} ;
      H00HN3_A656ParCod = new short[1] ;
      H00HN3_n656ParCod = new boolean[] {false} ;
      H00HN3_A867ParCodNom = new String[] {""} ;
      H00HN3_n867ParCodNom = new boolean[] {false} ;
      A13824ParCodNomI = "" ;
      A867ParCodNom = "" ;
      AV38Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H00HN4_A396EmprCod = new String[] {""} ;
      H00HN4_A8482OpeAct = new String[] {""} ;
      H00HN4_n8482OpeAct = new boolean[] {false} ;
      H00HN4_A13748OpeCNom = new String[] {""} ;
      H00HN4_A652OpeCod = new int[1] ;
      H00HN4_A653OpeNom = new String[] {""} ;
      H00HN4_n653OpeNom = new boolean[] {false} ;
      A8482OpeAct = "" ;
      A13748OpeCNom = "" ;
      A653OpeNom = "" ;
      GXv_char18 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int4 = new byte[1] ;
      GXv_char17 = new String[1] ;
      AV45Kgs = DecimalUtil.ZERO ;
      GXv_decimal23 = new java.math.BigDecimal[1] ;
      AV46Mts = DecimalUtil.ZERO ;
      GXv_decimal22 = new java.math.BigDecimal[1] ;
      AV49Barser = "" ;
      H00HN5_A396EmprCod = new String[] {""} ;
      H00HN5_A65ArtCod = new String[] {""} ;
      H00HN5_A252CliCod = new int[1] ;
      H00HN5_n252CliCod = new boolean[] {false} ;
      H00HN5_A7415ArtPmlCru = new short[1] ;
      H00HN5_n7415ArtPmlCru = new boolean[] {false} ;
      A65ArtCod = "" ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_btnconfirmar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webpartesproduccionupd__default(),
         new Object[] {
             new Object[] {
            H00HN2_A602MaqCod, H00HN2_A558HisProFec, H00HN2_A561HisProLin, H00HN2_A129BarCod, H00HN2_A132BarCodReo, H00HN2_A130BarCodPar, H00HN2_A194BarOrdLin, H00HN2_A503GruOpeCod, H00HN2_A4440HisProDTI, H00HN2_n4440HisProDTI,
            H00HN2_A4441HisProDTF, H00HN2_n4441HisProDTF, H00HN2_A557HisProF, H00HN2_A566HisProTur, H00HN2_A1525HisProKgr, H00HN2_A1526HisProMtr, H00HN2_A656ParCod, H00HN2_n656ParCod, H00HN2_A4003HisHhMaq, H00HN2_A1060HisHhIni,
            H00HN2_A4714HisProNpzs, H00HN2_A252CliCod, H00HN2_n252CliCod, H00HN2_A212BarSer, H00HN2_A14024HisProAncF, H00HN2_A14022HisProAncI, H00HN2_A14023HisProMtsF, H00HN2_A14021HisproMtsI, H00HN2_A396EmprCod, H00HN2_A461Fase
            }
            , new Object[] {
            H00HN3_A396EmprCod, H00HN3_A13824ParCodNomI, H00HN3_A656ParCod, H00HN3_A867ParCodNom, H00HN3_n867ParCodNom
            }
            , new Object[] {
            H00HN4_A396EmprCod, H00HN4_A8482OpeAct, H00HN4_n8482OpeAct, H00HN4_A13748OpeCNom, H00HN4_A652OpeCod, H00HN4_A653OpeNom, H00HN4_n653OpeNom
            }
            , new Object[] {
            H00HN5_A396EmprCod, H00HN5_A65ArtCod, H00HN5_A252CliCod, H00HN5_A7415ArtPmlCru, H00HN5_n7415ArtPmlCru
            }
         }
      );
      AV55Pgmname = "WebPartesProduccionUPD" ;
      /* GeneXus formulas. */
      AV55Pgmname = "WebPartesProduccionUPD" ;
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      edtavBarordlin_Enabled = 0 ;
      edtavFase_Enabled = 0 ;
      edtavFasedsc_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV32HisProTurold ;
   private byte AV21BarCodReo ;
   private byte AV13HisProTur ;
   private byte nDonePA ;
   private byte A132BarCodReo ;
   private byte A566HisProTur ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private byte nGXWrapped ;
   private short wcpOAV7BarOrdLin ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV7BarOrdLin ;
   private short AV19DatosArticulo ;
   private short AV20Barpes ;
   private short AV31HisProNpzsold ;
   private short AV41HisproAncF ;
   private short AV42HisProAncI ;
   private short wbEnd ;
   private short wbStart ;
   private short AV16HisProNpzs ;
   private short AV17ParCod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A194BarOrdLin ;
   private short A656ParCod ;
   private short A4714HisProNpzs ;
   private short A14024HisProAncF ;
   private short A14022HisProAncI ;
   private short GXv_int14[] ;
   private short GXv_int19[] ;
   private short GXv_int20[] ;
   private short GXv_int21[] ;
   private short A7415ArtPmlCru ;
   private int wcpOA561HisProLin ;
   private int A561HisProLin ;
   private int AV29GruOpeCodold ;
   private int AV25BarCod ;
   private int edtavHisprodti_Enabled ;
   private int edtavHisprodtf_Enabled ;
   private int edtavHisprof_Enabled ;
   private int edtavHisprotur_Enabled ;
   private int edtavHisprokgr_Enabled ;
   private int edtavHispromtr_Enabled ;
   private int edtavHispronpzs_Enabled ;
   private int AV6GruOpeCod ;
   private int edtavGruopecod_Visible ;
   private int edtavParcod_Visible ;
   private int edtavBarnhdr_Enabled ;
   private int edtavBarordlin_Enabled ;
   private int edtavFase_Enabled ;
   private int edtavFasedsc_Enabled ;
   private int A129BarCod ;
   private int A503GruOpeCod ;
   private int A252CliCod ;
   private int GXv_int8[] ;
   private int A652OpeCod ;
   private int AV50Hisprolin ;
   private int GXv_int9[] ;
   private int AV48CliCod ;
   private int idxLst ;
   private java.math.BigDecimal AV30HisProKgrold ;
   private java.math.BigDecimal AV35HisProMtrold ;
   private java.math.BigDecimal AV22Hishhmaq ;
   private java.math.BigDecimal AV23HisHhIni ;
   private java.math.BigDecimal AV43HisProMtsF ;
   private java.math.BigDecimal AV44HisProMtsI ;
   private java.math.BigDecimal AV14HisProKgr ;
   private java.math.BigDecimal AV15HisProMtr ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal A4003HisHhMaq ;
   private java.math.BigDecimal A1060HisHhIni ;
   private java.math.BigDecimal A14023HisProMtsF ;
   private java.math.BigDecimal A14021HisproMtsI ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal AV45Kgs ;
   private java.math.BigDecimal GXv_decimal23[] ;
   private java.math.BigDecimal AV46Mts ;
   private java.math.BigDecimal GXv_decimal22[] ;
   private String wcpOA396EmprCod ;
   private String wcpOA602MaqCod ;
   private String wcpOAV5BarNHdr ;
   private String wcpOAV8Fase ;
   private String wcpOAV9FaseDsc ;
   private String wcpOAV24Usurcod ;
   private String wcpOAV28station ;
   private String Combo_parcod_Selectedvalue_get ;
   private String Combo_gruopecod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String AV5BarNHdr ;
   private String AV8Fase ;
   private String AV9FaseDsc ;
   private String AV24Usurcod ;
   private String AV28station ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV36HisProFold ;
   private String AV55Pgmname ;
   private String GXKey ;
   private String AV26BarCodPar ;
   private String A461Fase ;
   private String A7258FaseDsc ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Combo_gruopecod_Cls ;
   private String Combo_gruopecod_Selectedvalue_set ;
   private String Combo_parcod_Cls ;
   private String Combo_parcod_Selectedvalue_set ;
   private String Combo_parcod_Emptyitemtext ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvelop_confirmpanel_btnconfirmar_Title ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmtype ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String divTablesplittedgruopecod_Internalname ;
   private String lblTextblockcombo_gruopecod_Internalname ;
   private String lblTextblockcombo_gruopecod_Jsonclick ;
   private String Combo_gruopecod_Caption ;
   private String Combo_gruopecod_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtavHisprodti_Internalname ;
   private String TempTags ;
   private String edtavHisprodti_Jsonclick ;
   private String edtavHisprodtf_Internalname ;
   private String edtavHisprodtf_Jsonclick ;
   private String edtavHisprof_Internalname ;
   private String AV12HisProF ;
   private String edtavHisprof_Jsonclick ;
   private String edtavHisprotur_Internalname ;
   private String edtavHisprotur_Jsonclick ;
   private String edtavHisprokgr_Internalname ;
   private String edtavHisprokgr_Jsonclick ;
   private String edtavHispromtr_Internalname ;
   private String edtavHispromtr_Jsonclick ;
   private String edtavHispronpzs_Internalname ;
   private String edtavHispronpzs_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String divTablesplittedparcod_Internalname ;
   private String lblTextblockcombo_parcod_Internalname ;
   private String lblTextblockcombo_parcod_Jsonclick ;
   private String Combo_parcod_Caption ;
   private String Combo_parcod_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavGruopecod_Internalname ;
   private String edtavGruopecod_Jsonclick ;
   private String edtavParcod_Internalname ;
   private String edtavParcod_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavBarnhdr_Internalname ;
   private String edtavBarordlin_Internalname ;
   private String edtavFase_Internalname ;
   private String edtavFasedsc_Internalname ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A557HisProF ;
   private String A212BarSer ;
   private String GXt_char1 ;
   private String AV53Emprcod ;
   private String AV54Emprnom ;
   private String GXv_char5[] ;
   private String GXv_char2[] ;
   private String GXv_char6[] ;
   private String A867ParCodNom ;
   private String A8482OpeAct ;
   private String A653OpeNom ;
   private String GXv_char18[] ;
   private String GXv_char17[] ;
   private String AV49Barser ;
   private String A65ArtCod ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_btnconfirmar_Internalname ;
   private String Dvelop_confirmpanel_btnconfirmar_Internalname ;
   private String tblUnnamedtable1_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String edtavBarnhdr_Jsonclick ;
   private String edtavBarordlin_Jsonclick ;
   private String edtavFase_Jsonclick ;
   private String edtavFasedsc_Jsonclick ;
   private java.util.Date AV33HisProDTIold ;
   private java.util.Date AV34HisProDTFold ;
   private java.util.Date AV10HisProDTI ;
   private java.util.Date AV11HisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date GXv_dtime10[] ;
   private java.util.Date GXv_dtime11[] ;
   private java.util.Date wcpOA558HisProFec ;
   private java.util.Date A558HisProFec ;
   private java.util.Date GXv_date7[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Combo_gruopecod_Emptyitem ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private boolean n656ParCod ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n867ParCodNom ;
   private boolean n8482OpeAct ;
   private boolean n653OpeNom ;
   private boolean n7415ArtPmlCru ;
   private String AV27Inc_obs ;
   private String A13824ParCodNomI ;
   private String A13748OpeCNom ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucCombo_gruopecod ;
   private com.genexus.webpanels.GXUserControl ucCombo_parcod ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconfirmar ;
   private IDataStoreProvider pr_default ;
   private String[] H00HN2_A602MaqCod ;
   private java.util.Date[] H00HN2_A558HisProFec ;
   private int[] H00HN2_A561HisProLin ;
   private int[] H00HN2_A129BarCod ;
   private byte[] H00HN2_A132BarCodReo ;
   private String[] H00HN2_A130BarCodPar ;
   private short[] H00HN2_A194BarOrdLin ;
   private int[] H00HN2_A503GruOpeCod ;
   private java.util.Date[] H00HN2_A4440HisProDTI ;
   private boolean[] H00HN2_n4440HisProDTI ;
   private java.util.Date[] H00HN2_A4441HisProDTF ;
   private boolean[] H00HN2_n4441HisProDTF ;
   private String[] H00HN2_A557HisProF ;
   private byte[] H00HN2_A566HisProTur ;
   private java.math.BigDecimal[] H00HN2_A1525HisProKgr ;
   private java.math.BigDecimal[] H00HN2_A1526HisProMtr ;
   private short[] H00HN2_A656ParCod ;
   private boolean[] H00HN2_n656ParCod ;
   private java.math.BigDecimal[] H00HN2_A4003HisHhMaq ;
   private java.math.BigDecimal[] H00HN2_A1060HisHhIni ;
   private short[] H00HN2_A4714HisProNpzs ;
   private int[] H00HN2_A252CliCod ;
   private boolean[] H00HN2_n252CliCod ;
   private String[] H00HN2_A212BarSer ;
   private short[] H00HN2_A14024HisProAncF ;
   private short[] H00HN2_A14022HisProAncI ;
   private java.math.BigDecimal[] H00HN2_A14023HisProMtsF ;
   private java.math.BigDecimal[] H00HN2_A14021HisproMtsI ;
   private String[] H00HN2_A396EmprCod ;
   private String[] H00HN2_A461Fase ;
   private String[] H00HN3_A396EmprCod ;
   private String[] H00HN3_A13824ParCodNomI ;
   private short[] H00HN3_A656ParCod ;
   private boolean[] H00HN3_n656ParCod ;
   private String[] H00HN3_A867ParCodNom ;
   private boolean[] H00HN3_n867ParCodNom ;
   private String[] H00HN4_A396EmprCod ;
   private String[] H00HN4_A8482OpeAct ;
   private boolean[] H00HN4_n8482OpeAct ;
   private String[] H00HN4_A13748OpeCNom ;
   private int[] H00HN4_A652OpeCod ;
   private String[] H00HN4_A653OpeNom ;
   private boolean[] H00HN4_n653OpeNom ;
   private String[] H00HN5_A396EmprCod ;
   private String[] H00HN5_A65ArtCod ;
   private int[] H00HN5_A252CliCod ;
   private boolean[] H00HN5_n252CliCod ;
   private short[] H00HN5_A7415ArtPmlCru ;
   private boolean[] H00HN5_n7415ArtPmlCru ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV39GruOpeCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV37ParCod_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV38Combo_DataItem ;
}

final  class webpartesproduccionupd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00HN2", "SELECT T1.MaqCod, T1.HisProFec, T1.HisProLin, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T1.GruOpeCod, T1.HisProDTI, T1.HisProDTF, T1.HisProF, T1.HisProTur, T1.HisProKgr, T1.HisProMtr, T1.ParCod, T1.HisHhMaq, T1.HisHhIni, T1.HisProNpzs, T2.CliCod, T2.BarSer, T1.HisProAncF, T1.HisProAncI, T1.HisProMtsF, T1.HisproMtsI, T1.EmprCod, T1.Fase FROM (TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.MaqCod = ? and T1.HisProFec = ? and T1.HisProLin = ? ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec, T1.HisProLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00HN3", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(ParCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ParCodNom, ''))) AS ParCodNomI, ParCod, ParCodNom FROM TXPCODPAR WHERE EmprCod = ? ORDER BY ParCodNomI ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00HN4", "SELECT EmprCod, OpeAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, OpeCod, OpeNom FROM TXPOPERAR WHERE (EmprCod = ?) AND (OpeAct = 'A') ORDER BY OpeCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00HN5", "SELECT EmprCod, ArtCod, CliCod, ArtPmlCru FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(17,2);
               ((short[]) buf[20])[0] = rslt.getShort(18);
               ((int[]) buf[21])[0] = rslt.getInt(19);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(20, 16);
               ((short[]) buf[24])[0] = rslt.getShort(21);
               ((short[]) buf[25])[0] = rslt.getShort(22);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(24,2);
               ((String[]) buf[28])[0] = rslt.getString(25, 3);
               ((String[]) buf[29])[0] = rslt.getString(26, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

