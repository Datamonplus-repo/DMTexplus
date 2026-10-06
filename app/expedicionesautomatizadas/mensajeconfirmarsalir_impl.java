package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mensajeconfirmarsalir_impl extends GXDataArea
{
   public mensajeconfirmarsalir_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mensajeconfirmarsalir_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mensajeconfirmarsalir_impl.class ));
   }

   public mensajeconfirmarsalir_impl( int remoteHandle ,
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
         gxfirstwebparm = httpContext.GetFirstPar( "Mensaje") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "Mensaje") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "Mensaje") ;
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
            AV6Mensaje = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6Mensaje", AV6Mensaje);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV5Confirmado = GXutil.strtobool( httpContext.GetPar( "Confirmado")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5Confirmado", AV5Confirmado);
               AV7EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
               AV9MaqCod = httpContext.GetPar( "MaqCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9MaqCod", AV9MaqCod);
               AV8BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
               AV10BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodReo", GXutil.str( AV10BarCodReo, 1, 0));
               AV11BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11BarCodPar", AV11BarCodPar);
               AV12OpeCod = (int)(GXutil.lval( httpContext.GetPar( "OpeCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OpeCod), 6, 0));
               AV13FasCod = httpContext.GetPar( "FasCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13FasCod", AV13FasCod);
               AV14BarOrdlin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdlin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14BarOrdlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarOrdlin), 4, 0));
               AV15ParCod = (short)(GXutil.lval( httpContext.GetPar( "ParCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15ParCod), 4, 0));
               Gx_time = httpContext.GetPar( "Gx_time") ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_time", Gx_time);
               Gx_date = localUtil.parseDateParm( httpContext.GetPar( "Gx_date")) ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
               AV16Turno = (byte)(GXutil.lval( httpContext.GetPar( "Turno"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16Turno", GXutil.str( AV16Turno, 1, 0));
               AV17Lecfec = localUtil.parseDateParm( httpContext.GetPar( "Lecfec")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Lecfec", localUtil.format(AV17Lecfec, "99/99/99"));
               AV18Msg1 = httpContext.GetPar( "Msg1") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18Msg1", AV18Msg1);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18Msg1, ""))));
               AV19Msg_i = httpContext.GetPar( "Msg_i") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19Msg_i", AV19Msg_i);
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
      pa1IL2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1IL2( ) ;
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
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.expedicionesautomatizadas.mensajeconfirmarsalir", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6Mensaje)),GXutil.URLEncode(GXutil.booltostr(AV5Confirmado)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV9MaqCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV11BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV12OpeCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV13FasCod)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarOrdlin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15ParCod,4,0)),GXutil.URLEncode(GXutil.rtrim(Gx_time)),GXutil.URLEncode(GXutil.formatDateParm(Gx_date)),GXutil.URLEncode(GXutil.ltrimstr(AV16Turno,1,0)),GXutil.URLEncode(GXutil.formatDateParm(AV17Lecfec)),GXutil.URLEncode(GXutil.rtrim(AV18Msg1)),GXutil.URLEncode(GXutil.rtrim(AV19Msg_i))}, new String[] {"Mensaje","Confirmado","EmprCod","MaqCod","BarCod","BarCodReo","BarCodPar","OpeCod","FasCod","BarOrdlin","ParCod","Gx_time","Gx_date","Turno","Lecfec","Msg1","Msg_i"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18Msg1, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG1", GXutil.rtrim( AV18Msg1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18Msg1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTURNO", GXutil.ltrim( localUtil.ntoc( AV16Turno, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD", GXutil.rtrim( AV9MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV8BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV10BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV11BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vOPECOD", GXutil.ltrim( localUtil.ntoc( AV12OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASCOD", GXutil.rtrim( AV13FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV14BarOrdlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPARCOD", GXutil.ltrim( localUtil.ntoc( AV15ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIME", GXutil.rtrim( Gx_time));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vCONFIRMADO", AV5Confirmado);
      app.GxWebStd.gx_hidden_field( httpContext, "vLECFEC", localUtil.dtoc( AV17Lecfec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_I", GXutil.rtrim( AV19Msg_i));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Width", GXutil.rtrim( Dvpanel_tableattributes_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autowidth", GXutil.booltostr( Dvpanel_tableattributes_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoheight", GXutil.booltostr( Dvpanel_tableattributes_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Cls", GXutil.rtrim( Dvpanel_tableattributes_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Title", GXutil.rtrim( Dvpanel_tableattributes_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsible", GXutil.booltostr( Dvpanel_tableattributes_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsed", GXutil.booltostr( Dvpanel_tableattributes_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Showcollapseicon", GXutil.booltostr( Dvpanel_tableattributes_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Iconposition", GXutil.rtrim( Dvpanel_tableattributes_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoscroll", GXutil.booltostr( Dvpanel_tableattributes_Autoscroll));
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
         we1IL2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1IL2( ) ;
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
      return formatLink("app.expedicionesautomatizadas.mensajeconfirmarsalir", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6Mensaje)),GXutil.URLEncode(GXutil.booltostr(AV5Confirmado)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV9MaqCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV11BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV12OpeCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV13FasCod)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarOrdlin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15ParCod,4,0)),GXutil.URLEncode(GXutil.rtrim(Gx_time)),GXutil.URLEncode(GXutil.formatDateParm(Gx_date)),GXutil.URLEncode(GXutil.ltrimstr(AV16Turno,1,0)),GXutil.URLEncode(GXutil.formatDateParm(AV17Lecfec)),GXutil.URLEncode(GXutil.rtrim(AV18Msg1)),GXutil.URLEncode(GXutil.rtrim(AV19Msg_i))}, new String[] {"Mensaje","Confirmado","EmprCod","MaqCod","BarCod","BarCodReo","BarCodPar","OpeCod","FasCod","BarOrdlin","ParCod","Gx_time","Gx_date","Turno","Lecfec","Msg1","Msg_i"})  ;
   }

   public String getPgmname( )
   {
      return "ExpedicionesAutomatizadas.MensajeConfirmarSalir" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mensaje Confirmar", "") ;
   }

   public void wb1IL0( )
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
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table TableTransactionTemplate", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainTransaction", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-lg-6", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tableattributes.setProperty("Width", Dvpanel_tableattributes_Width);
         ucDvpanel_tableattributes.setProperty("AutoWidth", Dvpanel_tableattributes_Autowidth);
         ucDvpanel_tableattributes.setProperty("AutoHeight", Dvpanel_tableattributes_Autoheight);
         ucDvpanel_tableattributes.setProperty("Cls", Dvpanel_tableattributes_Cls);
         ucDvpanel_tableattributes.setProperty("Title", Dvpanel_tableattributes_Title);
         ucDvpanel_tableattributes.setProperty("Collapsible", Dvpanel_tableattributes_Collapsible);
         ucDvpanel_tableattributes.setProperty("Collapsed", Dvpanel_tableattributes_Collapsed);
         ucDvpanel_tableattributes.setProperty("ShowCollapseIcon", Dvpanel_tableattributes_Showcollapseicon);
         ucDvpanel_tableattributes.setProperty("IconPosition", Dvpanel_tableattributes_Iconposition);
         ucDvpanel_tableattributes.setProperty("AutoScroll", Dvpanel_tableattributes_Autoscroll);
         ucDvpanel_tableattributes.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableattributes_Internalname, "DVPANEL_TABLEATTRIBUTESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEATTRIBUTESContainer"+"TableAttributes"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMensaje_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavMensaje_Internalname, AV6Mensaje, "", "", (short)(1), 1, edtavMensaje_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ExpedicionesAutomatizadas\\MensajeConfirmarSalir.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\MensajeConfirmarSalir.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtncancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\MensajeConfirmarSalir.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1IL2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mensaje Confirmar", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1IL0( ) ;
   }

   public void ws1IL2( )
   {
      start1IL2( ) ;
      evt1IL2( ) ;
   }

   public void evt1IL2( )
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
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e111IL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              Rfr0gs = false ;
                              if ( ! Rfr0gs )
                              {
                                 /* Execute user event: Enter */
                                 e121IL2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e131IL2 ();
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

   public void we1IL2( )
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

   public void pa1IL2( )
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
      rf1IL2( ) ;
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
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      Gx_time = GXutil.time( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_time", Gx_time);
      edtavMensaje_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMensaje_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMensaje_Enabled), 5, 0), true);
   }

   public void rf1IL2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e131IL2 ();
         wb1IL0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1IL2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG1", GXutil.rtrim( AV18Msg1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18Msg1, ""))));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      Gx_time = GXutil.time( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_time", Gx_time);
      edtavMensaje_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMensaje_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMensaje_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1IL0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111IL2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Dvpanel_tableattributes_Width = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Width") ;
         Dvpanel_tableattributes_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autowidth")) ;
         Dvpanel_tableattributes_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoheight")) ;
         Dvpanel_tableattributes_Cls = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Cls") ;
         Dvpanel_tableattributes_Title = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Title") ;
         Dvpanel_tableattributes_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsible")) ;
         Dvpanel_tableattributes_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsed")) ;
         Dvpanel_tableattributes_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Showcollapseicon")) ;
         Dvpanel_tableattributes_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Iconposition") ;
         Dvpanel_tableattributes_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoscroll")) ;
         /* Read variables values. */
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
      e111IL2 ();
      if (returnInSub) return;
   }

   public void e111IL2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV5Confirmado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Confirmado", AV5Confirmado);
      GXt_char1 = AV24Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mensajeconfirmarsalir_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Station = GXt_char1 ;
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV25Emprnom ;
      GXv_char4[0] = AV26Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char2, GXv_char3, GXv_char4) ;
      mensajeconfirmarsalir_impl.this.AV7EmprCod = GXv_char2[0] ;
      mensajeconfirmarsalir_impl.this.AV25Emprnom = GXv_char3[0] ;
      mensajeconfirmarsalir_impl.this.AV26Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e121IL2 ();
      if (returnInSub) return;
   }

   public void e121IL2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV5Confirmado = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Confirmado", AV5Confirmado);
      AV19Msg_i = AV18Msg1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Msg_i", AV19Msg_i);
      GXv_char4[0] = AV7EmprCod ;
      GXv_int5[0] = AV16Turno ;
      new app.pturno(remoteHandle, context).execute( GXv_char4, GXv_int5) ;
      mensajeconfirmarsalir_impl.this.AV7EmprCod = GXv_char4[0] ;
      mensajeconfirmarsalir_impl.this.AV16Turno = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16Turno", GXutil.str( AV16Turno, 1, 0));
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = AV9MaqCod ;
      GXv_int6[0] = AV8BarCod ;
      GXv_int5[0] = AV10BarCodReo ;
      GXv_char2[0] = AV11BarCodPar ;
      GXv_int7[0] = AV12OpeCod ;
      GXv_char8[0] = AV13FasCod ;
      GXv_int9[0] = AV14BarOrdlin ;
      GXv_int10[0] = AV15ParCod ;
      GXv_char11[0] = Gx_time ;
      GXv_date12[0] = Gx_date ;
      GXv_char13[0] = " " ;
      new app.pnueop2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6, GXv_int5, GXv_char2, GXv_int7, GXv_char8, GXv_int9, GXv_int10, GXv_char11, GXv_date12, GXv_char13) ;
      mensajeconfirmarsalir_impl.this.AV7EmprCod = GXv_char4[0] ;
      mensajeconfirmarsalir_impl.this.AV9MaqCod = GXv_char3[0] ;
      mensajeconfirmarsalir_impl.this.AV8BarCod = GXv_int6[0] ;
      mensajeconfirmarsalir_impl.this.AV10BarCodReo = GXv_int5[0] ;
      mensajeconfirmarsalir_impl.this.AV11BarCodPar = GXv_char2[0] ;
      mensajeconfirmarsalir_impl.this.AV12OpeCod = GXv_int7[0] ;
      mensajeconfirmarsalir_impl.this.AV13FasCod = GXv_char8[0] ;
      mensajeconfirmarsalir_impl.this.AV14BarOrdlin = GXv_int9[0] ;
      mensajeconfirmarsalir_impl.this.AV15ParCod = GXv_int10[0] ;
      mensajeconfirmarsalir_impl.this.Gx_time = GXv_char11[0] ;
      mensajeconfirmarsalir_impl.this.Gx_date = GXv_date12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV9MaqCod", AV9MaqCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodReo", GXutil.str( AV10BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11BarCodPar", AV11BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV12OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OpeCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV13FasCod", AV13FasCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV14BarOrdlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarOrdlin), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV15ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15ParCod), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_time", Gx_time);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      httpContext.setWebReturnParms(new Object[] {Boolean.valueOf(AV5Confirmado),AV19Msg_i});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV5Confirmado","AV19Msg_i"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e131IL2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV6Mensaje = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Mensaje", AV6Mensaje);
      AV5Confirmado = ((Boolean) getParm(obj,1)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Confirmado", AV5Confirmado);
      AV7EmprCod = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      AV9MaqCod = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9MaqCod", AV9MaqCod);
      AV8BarCod = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
      AV10BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodReo", GXutil.str( AV10BarCodReo, 1, 0));
      AV11BarCodPar = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11BarCodPar", AV11BarCodPar);
      AV12OpeCod = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OpeCod), 6, 0));
      AV13FasCod = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13FasCod", AV13FasCod);
      AV14BarOrdlin = ((Number) GXutil.testNumericType( getParm(obj,9), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14BarOrdlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarOrdlin), 4, 0));
      AV15ParCod = ((Number) GXutil.testNumericType( getParm(obj,10), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15ParCod), 4, 0));
      Gx_time = (String)getParm(obj,11) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_time", Gx_time);
      Gx_date = (java.util.Date)getParm(obj,12) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      AV16Turno = ((Number) GXutil.testNumericType( getParm(obj,13), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Turno", GXutil.str( AV16Turno, 1, 0));
      AV17Lecfec = (java.util.Date)getParm(obj,14) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lecfec", localUtil.format(AV17Lecfec, "99/99/99"));
      AV18Msg1 = (String)getParm(obj,15) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Msg1", AV18Msg1);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18Msg1, ""))));
      AV19Msg_i = (String)getParm(obj,16) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Msg_i", AV19Msg_i);
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
      pa1IL2( ) ;
      ws1IL2( ) ;
      we1IL2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016432196", true, true);
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
      httpContext.AddJavascriptSource("expedicionesautomatizadas/mensajeconfirmarsalir.js", "?202661016432197", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavMensaje_Internalname = "vMENSAJE" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncancel_Internalname = "BTNCANCEL" ;
      divTablemain_Internalname = "TABLEMAIN" ;
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
      edtavMensaje_Enabled = 0 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "Confirmar", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Mensaje Confirmar", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV18Msg1',fld:'vMSG1',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e121IL2',iparms:[{av:'AV18Msg1',fld:'vMSG1',pic:'',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV16Turno',fld:'vTURNO',pic:'9'},{av:'AV9MaqCod',fld:'vMAQCOD',pic:''},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV11BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV12OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV13FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV14BarOrdlin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV15ParCod',fld:'vPARCOD',pic:'ZZZ9'},{av:'Gx_time',fld:'vTIME',pic:''},{av:'Gx_date',fld:'vTODAY',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV5Confirmado',fld:'vCONFIRMADO',pic:''},{av:'AV19Msg_i',fld:'vMSG_I',pic:''},{av:'AV16Turno',fld:'vTURNO',pic:'9'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'Gx_date',fld:'vTODAY',pic:''},{av:'Gx_time',fld:'vTIME',pic:''},{av:'AV15ParCod',fld:'vPARCOD',pic:'ZZZ9'},{av:'AV14BarOrdlin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV13FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV12OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV11BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9MaqCod',fld:'vMAQCOD',pic:''}]}");
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
      wcpOAV6Mensaje = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV9MaqCod = "" ;
      wcpOAV11BarCodPar = "" ;
      wcpOAV13FasCod = "" ;
      wcpOGx_time = "" ;
      wcpOGx_date = GXutil.nullDate() ;
      wcpOAV17Lecfec = GXutil.nullDate() ;
      wcpOAV18Msg1 = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV6Mensaje = "" ;
      AV7EmprCod = "" ;
      AV9MaqCod = "" ;
      AV11BarCodPar = "" ;
      AV13FasCod = "" ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      AV17Lecfec = GXutil.nullDate() ;
      AV18Msg1 = "" ;
      AV19Msg_i = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV24Station = "" ;
      GXt_char1 = "" ;
      AV25Emprnom = "" ;
      AV26Usurcod = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_char8 = new String[1] ;
      GXv_int9 = new short[1] ;
      GXv_int10 = new short[1] ;
      GXv_char11 = new String[1] ;
      GXv_date12 = new java.util.Date[1] ;
      GXv_char13 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      edtavMensaje_Enabled = 0 ;
   }

   private byte wcpOAV10BarCodReo ;
   private byte wcpOAV16Turno ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV10BarCodReo ;
   private byte AV16Turno ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte GXv_int5[] ;
   private byte nGXWrapped ;
   private short wcpOAV14BarOrdlin ;
   private short wcpOAV15ParCod ;
   private short AV14BarOrdlin ;
   private short AV15ParCod ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int9[] ;
   private short GXv_int10[] ;
   private int wcpOAV8BarCod ;
   private int wcpOAV12OpeCod ;
   private int AV8BarCod ;
   private int AV12OpeCod ;
   private int edtavMensaje_Enabled ;
   private int GXv_int6[] ;
   private int GXv_int7[] ;
   private int idxLst ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV9MaqCod ;
   private String wcpOAV11BarCodPar ;
   private String wcpOAV13FasCod ;
   private String wcpOGx_time ;
   private String wcpOAV18Msg1 ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV7EmprCod ;
   private String AV9MaqCod ;
   private String AV11BarCodPar ;
   private String AV13FasCod ;
   private String Gx_time ;
   private String AV18Msg1 ;
   private String AV19Msg_i ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String edtavMensaje_Internalname ;
   private String TempTags ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncancel_Internalname ;
   private String bttBtncancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV24Station ;
   private String GXt_char1 ;
   private String AV25Emprnom ;
   private String AV26Usurcod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char8[] ;
   private String GXv_char11[] ;
   private String GXv_char13[] ;
   private java.util.Date wcpOGx_date ;
   private java.util.Date wcpOAV17Lecfec ;
   private java.util.Date Gx_date ;
   private java.util.Date AV17Lecfec ;
   private java.util.Date GXv_date12[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV5Confirmado ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private String wcpOAV6Mensaje ;
   private String AV6Mensaje ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXWebForm Form ;
}

