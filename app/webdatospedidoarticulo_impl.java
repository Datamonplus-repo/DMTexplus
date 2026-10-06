package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webdatospedidoarticulo_impl extends GXDataArea
{
   public webdatospedidoarticulo_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webdatospedidoarticulo_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webdatospedidoarticulo_impl.class ));
   }

   public webdatospedidoarticulo_impl( int remoteHandle ,
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
         gxfirstwebparm = httpContext.GetFirstPar( "Realizado") ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vARTCOD") == 0 )
         {
            AV10EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
            AV6CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV6CliCod), "ZZZZZ9")));
            A69ArtDsc = httpContext.GetPar( "ArtDsc") ;
            n69ArtDsc = false ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvartcodDB0( AV10EmprCod, AV6CliCod, A69ArtDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPROCOD") == 0 )
         {
            AV10EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
            A759ProDsc = httpContext.GetPar( "ProDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvprocodDB0( AV10EmprCod, A759ProDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vARTCOD") == 0 )
         {
            AV10EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
            AV6CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV6CliCod), "ZZZZZ9")));
            A69ArtDsc = httpContext.GetPar( "ArtDsc") ;
            n69ArtDsc = false ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvartcodDB0( AV10EmprCod, AV6CliCod, A69ArtDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vARTCOD") == 0 )
         {
            AV10EmprCod = httpContext.GetPar( "EmprCod") ;
            AV6CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            hV18ArtCod = httpContext.GetPar( "hV18ArtCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvartcodDB2( AV10EmprCod, AV6CliCod, hV18ArtCod) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPROCOD") == 0 )
         {
            AV10EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
            A759ProDsc = httpContext.GetPar( "ProDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvprocodDB0( AV10EmprCod, A759ProDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vPROCOD") == 0 )
         {
            AV10EmprCod = httpContext.GetPar( "EmprCod") ;
            hV5ProCod = httpContext.GetPar( "hV5ProCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvprocodDB2( AV10EmprCod, hV5ProCod) ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "Realizado") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "Realizado") ;
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
            AV21Realizado = GXutil.strtobool( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Realizado", AV21Realizado);
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
         MasterPageObj= createMasterPage(remoteHandle, "app.wwpbaseobjects.workwithplusmasterpageprompt");
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
      paDB2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startDB2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webdatospedidoarticulo", new String[] {GXutil.URLEncode(GXutil.booltostr(AV21Realizado))}, new String[] {"Realizado"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV6CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8Contexto, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTARTICULOPEDIDO", AV13SdtArticuloPedido);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTARTICULOPEDIDO", AV13SdtArticuloPedido);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD", GXutil.rtrim( A758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PRONUMLIN", GXutil.ltrim( localUtil.ntoc( A774ProNumLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD", GXutil.rtrim( A457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC", GXutil.rtrim( A460FasDsc));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTARTICULOPEDIDOCOLLECTION", AV19SdtArticuloPedidoCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTARTICULOPEDIDOCOLLECTION", AV19SdtArticuloPedidoCollection);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTENCABEZADOPEDIDO", AV14SdtEnCabezadoPedido);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTENCABEZADOPEDIDO", AV14SdtEnCabezadoPedido);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTEXTO", AV8Contexto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8Contexto, ""))));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vREALIZADO", AV21Realizado);
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvARTCOD", GXutil.rtrim( AV18ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV6CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV6CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvPROCOD", GXutil.rtrim( AV5ProCod));
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
         weDB2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtDB2( ) ;
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
      return formatLink("app.webdatospedidoarticulo", new String[] {GXutil.URLEncode(GXutil.booltostr(AV21Realizado))}, new String[] {"Realizado"})  ;
   }

   public String getPgmname( )
   {
      return "WebDatosPedidoArticulo" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Web Datos Pedido Articulo", "") ;
   }

   public void wbDB0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, divTablecontent_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebDatosPedidoArticulo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtncancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebDatosPedidoArticulo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         wb_table1_24_DB2( true) ;
      }
      else
      {
         wb_table1_24_DB2( false) ;
      }
      return  ;
   }

   public void wb_table1_24_DB2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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

   public void startDB2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Web Datos Pedido Articulo", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupDB0( ) ;
   }

   public void wsDB2( )
   {
      startDB2( ) ;
      evtDB2( ) ;
   }

   public void evtDB2( )
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
                           e11DB2 ();
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
                                 e12DB2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e13DB2 ();
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

   public void weDB2( )
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

   public void paDB2( )
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
            GX_FocusControl = edtavArtcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvartcodDB0( String AV10EmprCod ,
                                int AV6CliCod ,
                                String A69ArtDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvartcod_dataDB0( AV10EmprCod, AV6CliCod, A69ArtDsc) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgvvartcod_dataDB0( String AV10EmprCod ,
                                        int AV6CliCod ,
                                        String A69ArtDsc )
   {
      l69ArtDsc = GXutil.padr( GXutil.rtrim( A69ArtDsc), 26, "%") ;
      n69ArtDsc = false ;
      /* Using cursor H00DB2 */
      pr_default.execute(0, new Object[] {l69ArtDsc, AV10EmprCod, Integer.valueOf(AV6CliCod)});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H00DB2_A69ArtDsc[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00DB2_A69ArtDsc[0]));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgvvprocodDB0( String AV10EmprCod ,
                                String A759ProDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvprocod_dataDB0( AV10EmprCod, A759ProDsc) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgvvprocod_dataDB0( String AV10EmprCod ,
                                        String A759ProDsc )
   {
      l759ProDsc = GXutil.padr( GXutil.rtrim( A759ProDsc), 40, "%") ;
      /* Using cursor H00DB3 */
      pr_default.execute(1, new Object[] {l759ProDsc, AV10EmprCod});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H00DB3_A759ProDsc[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00DB3_A759ProDsc[0]));
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxhcvvartcodDB2( String AV10EmprCod ,
                                int AV6CliCod ,
                                String A69ArtDsc )
   {
      /* Using cursor H00DB4 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n69ArtDsc), A69ArtDsc, AV10EmprCod, Integer.valueOf(AV6CliCod)});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(2) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A69ArtDsc = H00DB4_A69ArtDsc[0] ;
         n69ArtDsc = H00DB4_n69ArtDsc[0] ;
         A396EmprCod = H00DB4_A396EmprCod[0] ;
         A252CliCod = H00DB4_A252CliCod[0] ;
         A65ArtCod = H00DB4_A65ArtCod[0] ;
         pr_default.readNext(2);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A65ArtCod))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(2);
   }

   public void gxhcvvprocodDB2( String AV10EmprCod ,
                                String A759ProDsc )
   {
      /* Using cursor H00DB5 */
      pr_default.execute(3, new Object[] {A759ProDsc, AV10EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(3) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A759ProDsc = H00DB5_A759ProDsc[0] ;
         A396EmprCod = H00DB5_A396EmprCod[0] ;
         A758ProCod = H00DB5_A758ProCod[0] ;
         pr_default.readNext(3);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A758ProCod))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(3);
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
      rfDB2( ) ;
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
   }

   public void rfDB2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e13DB2 ();
         wbDB0( ) ;
      }
   }

   public void send_integrity_lvl_hashesDB2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV6CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV6CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTEXTO", AV8Contexto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8Contexto, ""))));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupDB0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11DB2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
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
         /* Read variables values. */
         hV18ArtCod = httpContext.cgiGet( edtavArtcod_Internalname) ;
         if ( (GXutil.strcmp("", hV18ArtCod)==0) )
         {
            AV18ArtCod = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18ArtCod", AV18ArtCod);
         }
         else
         {
            A69ArtDsc = hV18ArtCod ;
            n69ArtDsc = false ;
            /* Using cursor H00DB6 */
            pr_default.execute(4, new Object[] {Boolean.valueOf(n69ArtDsc), A69ArtDsc, AV10EmprCod, Integer.valueOf(AV6CliCod)});
            AV18ArtCod = H00DB6_A65ArtCod[0] ;
            if ( ! ( (pr_default.getStatus(4) == 101) ) )
            {
               pr_default.readNext(4);
               if ( ! ( (pr_default.getStatus(4) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Artículo", "")}), 1, "vARTCOD");
                  GX_FocusControl = edtavArtcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(4);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV18ArtCod", hV18ArtCod);
         hV5ProCod = httpContext.cgiGet( edtavProcod_Internalname) ;
         if ( (GXutil.strcmp("", hV5ProCod)==0) )
         {
            AV5ProCod = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5ProCod", AV5ProCod);
         }
         else
         {
            A759ProDsc = hV5ProCod ;
            /* Using cursor H00DB7 */
            pr_default.execute(5, new Object[] {A759ProDsc, AV10EmprCod});
            AV5ProCod = H00DB7_A758ProCod[0] ;
            if ( ! ( (pr_default.getStatus(5) == 101) ) )
            {
               pr_default.readNext(5);
               if ( ! ( (pr_default.getStatus(5) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Descripcion Proceso", "")}), 1, "vPROCOD");
                  GX_FocusControl = edtavProcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(5);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV5ProCod", hV5ProCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavDisnumpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavDisnumpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISNUMPIE");
            GX_FocusControl = edtavDisnumpie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV22DisNumPie = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22DisNumPie), 4, 0));
         }
         else
         {
            AV22DisNumPie = (short)(localUtil.ctol( httpContext.cgiGet( edtavDisnumpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22DisNumPie), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavKilos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavKilos_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vKILOS");
            GX_FocusControl = edtavKilos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23Kilos = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Kilos", GXutil.ltrimstr( AV23Kilos, 9, 2));
         }
         else
         {
            AV23Kilos = localUtil.ctond( httpContext.cgiGet( edtavKilos_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Kilos", GXutil.ltrimstr( AV23Kilos, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMetros_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMetros_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMETROS");
            GX_FocusControl = edtavMetros_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24Metros = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24Metros", GXutil.ltrimstr( AV24Metros, 9, 2));
         }
         else
         {
            AV24Metros = localUtil.ctond( httpContext.cgiGet( edtavMetros_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24Metros", GXutil.ltrimstr( AV24Metros, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavDisartanh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavDisartanh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISARTANH");
            GX_FocusControl = edtavDisartanh_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV25DisArtAnh = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25DisArtAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25DisArtAnh), 3, 0));
         }
         else
         {
            AV25DisArtAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtavDisartanh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25DisArtAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25DisArtAnh), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavDisgraaca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavDisgraaca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISGRAACA");
            GX_FocusControl = edtavDisgraaca_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV26DisGraAca = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26DisGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26DisGraAca), 4, 0));
         }
         else
         {
            AV26DisGraAca = (short)(localUtil.ctol( httpContext.cgiGet( edtavDisgraaca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26DisGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26DisGraAca), 4, 0));
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
      e11DB2 ();
      if (returnInSub) return;
   }

   public void e11DB2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV21Realizado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Realizado", AV21Realizado);
      GXt_char1 = AV10EmprCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerempresa(remoteHandle, context).execute( GXv_char2) ;
      webdatospedidoarticulo_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10EmprCod = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      AV8Contexto = "CapturaDatosPedidosCliente" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Contexto", AV8Contexto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8Contexto, ""))));
      AV9DatosPedidoJSON = AV17WebSession.getValue(AV8Contexto) ;
      if ( (GXutil.strcmp("", AV9DatosPedidoJSON)==0) )
      {
         AV11Mensajes = httpContext.getMessage( "Sin Registros", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Mensajes", AV11Mensajes);
      }
      else
      {
         AV14SdtEnCabezadoPedido.fromJSonString(AV9DatosPedidoJSON, null);
         AV19SdtArticuloPedidoCollection.fromJSonString(AV14SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Articulopedido().toJSonString(false), null);
         AV6CliCod = AV14SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Clicod() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCod), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV6CliCod), "ZZZZZ9")));
         GXt_char1 = AV7CliNom ;
         GXv_char2[0] = GXt_char1 ;
         new app.pclinom(remoteHandle, context).execute( AV10EmprCod, AV6CliCod, GXv_char2) ;
         webdatospedidoarticulo_impl.this.GXt_char1 = GXv_char2[0] ;
         AV7CliNom = GXt_char1 ;
         Form.setCaption( GXutil.format( httpContext.getMessage( "Artículos para %1 - Pedido: %2", ""), AV7CliNom, AV14SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disenccli(), "", "", "", "", "", "", "") );
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      }
      divTablecontent_Visible = (((GXutil.strcmp("", AV11Mensajes)==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divTablecontent_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablecontent_Visible), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV11Mensajes)==0) )
      {
         httpContext.GX_msglist.addItem(AV11Mensajes);
      }
      AV22DisNumPie = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22DisNumPie), 4, 0));
      GX_FocusControl = edtavArtcod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      GXt_char1 = AV29Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webdatospedidoarticulo_impl.this.GXt_char1 = GXv_char2[0] ;
      AV29Station = GXt_char1 ;
      GXv_char2[0] = AV10EmprCod ;
      GXv_char3[0] = AV30Emprnom ;
      GXv_char4[0] = AV31Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char2, GXv_char3, GXv_char4) ;
      webdatospedidoarticulo_impl.this.AV10EmprCod = GXv_char2[0] ;
      webdatospedidoarticulo_impl.this.AV30Emprnom = GXv_char3[0] ;
      webdatospedidoarticulo_impl.this.AV31Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e12DB2 ();
      if (returnInSub) return;
   }

   public void e12DB2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV13SdtArticuloPedido.setgxTv_SdtSdtArticuloPedido_Disartcod( AV18ArtCod );
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.ppartdsc(remoteHandle, context).execute( AV10EmprCod, AV6CliCod, AV18ArtCod, GXv_char4) ;
      webdatospedidoarticulo_impl.this.GXt_char1 = GXv_char4[0] ;
      AV13SdtArticuloPedido.setgxTv_SdtSdtArticuloPedido_Artdsc( GXt_char1 );
      AV13SdtArticuloPedido.setgxTv_SdtSdtArticuloPedido_Procod( AV5ProCod );
      if ( (0==AV22DisNumPie) )
      {
         AV13SdtArticuloPedido.setgxTv_SdtSdtArticuloPedido_Disnumpie( (short)(1) );
      }
      else
      {
         AV13SdtArticuloPedido.setgxTv_SdtSdtArticuloPedido_Disnumpie( AV22DisNumPie );
      }
      AV13SdtArticuloPedido.setgxTv_SdtSdtArticuloPedido_Kilos( AV23Kilos );
      AV13SdtArticuloPedido.setgxTv_SdtSdtArticuloPedido_Metros( AV24Metros );
      AV13SdtArticuloPedido.setgxTv_SdtSdtArticuloPedido_Disartanh( AV25DisArtAnh );
      AV13SdtArticuloPedido.setgxTv_SdtSdtArticuloPedido_Disgraaca( AV26DisGraAca );
      if ( ! (GXutil.strcmp("", AV13SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Procod())==0) )
      {
         AV16SdtFasePedidoCollection.clear();
         /* Using cursor H00DB8 */
         pr_default.execute(6, new Object[] {AV10EmprCod, AV5ProCod});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A758ProCod = H00DB8_A758ProCod[0] ;
            A396EmprCod = H00DB8_A396EmprCod[0] ;
            A774ProNumLin = H00DB8_A774ProNumLin[0] ;
            A457FasCod = H00DB8_A457FasCod[0] ;
            A460FasDsc = H00DB8_A460FasDsc[0] ;
            A460FasDsc = H00DB8_A460FasDsc[0] ;
            AV15SdtFasePedido = (app.SdtSdtFasePedido)new app.SdtSdtFasePedido(remoteHandle, context);
            AV15SdtFasePedido.setgxTv_SdtSdtFasePedido_Disfaslin( A774ProNumLin );
            AV15SdtFasePedido.setgxTv_SdtSdtFasePedido_Fascod( A457FasCod );
            AV15SdtFasePedido.setgxTv_SdtSdtFasePedido_Fasdsc( A460FasDsc );
            AV16SdtFasePedidoCollection.add(AV15SdtFasePedido, 0);
            pr_default.readNext(6);
         }
         pr_default.close(6);
         AV13SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Fases().fromJSonString(AV16SdtFasePedidoCollection.toJSonString(false), null);
      }
      AV19SdtArticuloPedidoCollection.add(AV13SdtArticuloPedido, 0);
      AV14SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Articulopedido().fromJSonString(AV19SdtArticuloPedidoCollection.toJSonString(false), null);
      AV9DatosPedidoJSON = AV14SdtEnCabezadoPedido.toJSonString(false, true) ;
      AV17WebSession.setValue(AV8Contexto, AV9DatosPedidoJSON);
      AV21Realizado = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Realizado", AV21Realizado);
      httpContext.setWebReturnParms(new Object[] {Boolean.valueOf(AV21Realizado)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV21Realizado"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13SdtArticuloPedido", AV13SdtArticuloPedido);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19SdtArticuloPedidoCollection", AV19SdtArticuloPedidoCollection);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14SdtEnCabezadoPedido", AV14SdtEnCabezadoPedido);
   }

   protected void nextLoad( )
   {
   }

   protected void e13DB2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_24_DB2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDatoarticulo_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtcod_Internalname, httpContext.getMessage( "Articulo", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtcod_Internalname, GXutil.rtrim( hV18ArtCod), GXutil.rtrim( localUtil.format( hV18ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtcod_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_WebDatosPedidoArticulo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavProcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProcod_Internalname, httpContext.getMessage( "Proceso", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProcod_Internalname, GXutil.rtrim( hV5ProCod), GXutil.rtrim( localUtil.format( hV5ProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProcod_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_WebDatosPedidoArticulo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisnumpie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDisnumpie_Internalname, httpContext.getMessage( "N° Piezas", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDisnumpie_Internalname, GXutil.ltrim( localUtil.ntoc( AV22DisNumPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDisnumpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV22DisNumPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV22DisNumPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisnumpie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDisnumpie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebDatosPedidoArticulo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavKilos_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavKilos_Internalname, httpContext.getMessage( "Kilos", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavKilos_Internalname, GXutil.ltrim( localUtil.ntoc( AV23Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavKilos_Enabled!=0) ? localUtil.format( AV23Kilos, "ZZZZZ9.99") : localUtil.format( AV23Kilos, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavKilos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavKilos_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebDatosPedidoArticulo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavMetros_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMetros_Internalname, httpContext.getMessage( "Metros", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMetros_Internalname, GXutil.ltrim( localUtil.ntoc( AV24Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMetros_Enabled!=0) ? localUtil.format( AV24Metros, "ZZZZZ9.99") : localUtil.format( AV24Metros, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMetros_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMetros_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebDatosPedidoArticulo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisartanh_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDisartanh_Internalname, httpContext.getMessage( "Ancho(cm)", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDisartanh_Internalname, GXutil.ltrim( localUtil.ntoc( AV25DisArtAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDisartanh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV25DisArtAnh), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV25DisArtAnh), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisartanh_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDisartanh_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebDatosPedidoArticulo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisgraaca_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDisgraaca_Internalname, httpContext.getMessage( "Grm2", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDisgraaca_Internalname, GXutil.ltrim( localUtil.ntoc( AV26DisGraAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDisgraaca_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV26DisGraAca), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV26DisGraAca), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisgraaca_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDisgraaca_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebDatosPedidoArticulo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_24_DB2e( true) ;
      }
      else
      {
         wb_table1_24_DB2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV21Realizado = ((Boolean) getParm(obj,0)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Realizado", AV21Realizado);
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
      paDB2( ) ;
      wsDB2( ) ;
      weDB2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20267613481983", true, true);
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
      httpContext.AddJavascriptSource("webdatospedidoarticulo.js", "?20267613481983", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncancel_Internalname = "BTNCANCEL" ;
      edtavArtcod_Internalname = "vARTCOD" ;
      edtavProcod_Internalname = "vPROCOD" ;
      edtavDisnumpie_Internalname = "vDISNUMPIE" ;
      edtavKilos_Internalname = "vKILOS" ;
      edtavMetros_Internalname = "vMETROS" ;
      edtavDisartanh_Internalname = "vDISARTANH" ;
      edtavDisgraaca_Internalname = "vDISGRAACA" ;
      divDatoarticulo_Internalname = "DATOARTICULO" ;
      tblUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
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
      edtavDisgraaca_Jsonclick = "" ;
      edtavDisgraaca_Enabled = 1 ;
      edtavDisartanh_Jsonclick = "" ;
      edtavDisartanh_Enabled = 1 ;
      edtavMetros_Jsonclick = "" ;
      edtavMetros_Enabled = 1 ;
      edtavKilos_Jsonclick = "" ;
      edtavKilos_Enabled = 1 ;
      edtavDisnumpie_Jsonclick = "" ;
      edtavDisnumpie_Enabled = 1 ;
      edtavProcod_Jsonclick = "" ;
      edtavProcod_Enabled = 1 ;
      edtavArtcod_Jsonclick = "" ;
      edtavArtcod_Enabled = 1 ;
      divTablecontent_Visible = 1 ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Web Datos Pedido Articulo", "") );
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

   public void validv_Artcod( )
   {
      if ( (GXutil.strcmp("", hV18ArtCod)==0) )
      {
         AV18ArtCod = "" ;
      }
      else
      {
         A69ArtDsc = hV18ArtCod ;
         n69ArtDsc = false ;
         /* Using cursor H00DB9 */
         pr_default.execute(7, new Object[] {Boolean.valueOf(n69ArtDsc), A69ArtDsc, AV10EmprCod, Integer.valueOf(AV6CliCod)});
         AV18ArtCod = H00DB9_A65ArtCod[0] ;
         if ( ! ( (pr_default.getStatus(7) == 101) ) )
         {
            pr_default.readNext(7);
            if ( ! ( (pr_default.getStatus(7) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Artículo", "")}), 1, "vARTCOD");
               GX_FocusControl = edtavArtcod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(7);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV18ArtCod", hV18ArtCod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV18ArtCod", GXutil.rtrim( AV18ArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "hV18ArtCod", GXutil.rtrim( hV18ArtCod));
   }

   public void validv_Procod( )
   {
      if ( (GXutil.strcmp("", hV5ProCod)==0) )
      {
         AV5ProCod = "" ;
      }
      else
      {
         A759ProDsc = hV5ProCod ;
         /* Using cursor H00DB10 */
         pr_default.execute(8, new Object[] {A759ProDsc, AV10EmprCod});
         AV5ProCod = H00DB10_A758ProCod[0] ;
         if ( ! ( (pr_default.getStatus(8) == 101) ) )
         {
            pr_default.readNext(8);
            if ( ! ( (pr_default.getStatus(8) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Descripcion Proceso", "")}), 1, "vPROCOD");
               GX_FocusControl = edtavProcod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(8);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV5ProCod", hV5ProCod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV5ProCod", GXutil.rtrim( AV5ProCod));
      httpContext.ajax_rsp_assign_attri("", false, "hV5ProCod", GXutil.rtrim( hV5ProCod));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV8Contexto',fld:'vCONTEXTO',pic:'',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV6CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e12DB2',iparms:[{av:'AV18ArtCod',fld:'vARTCOD',pic:''},{av:'AV13SdtArticuloPedido',fld:'vSDTARTICULOPEDIDO',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV6CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV5ProCod',fld:'vPROCOD',pic:''},{av:'AV22DisNumPie',fld:'vDISNUMPIE',pic:'ZZZ9'},{av:'AV23Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV24Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'AV25DisArtAnh',fld:'vDISARTANH',pic:'ZZ9'},{av:'AV26DisGraAca',fld:'vDISGRAACA',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A774ProNumLin',fld:'PRONUMLIN',pic:'ZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'AV19SdtArticuloPedidoCollection',fld:'vSDTARTICULOPEDIDOCOLLECTION',pic:''},{av:'AV14SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV8Contexto',fld:'vCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV13SdtArticuloPedido',fld:'vSDTARTICULOPEDIDO',pic:''},{av:'AV19SdtArticuloPedidoCollection',fld:'vSDTARTICULOPEDIDOCOLLECTION',pic:''},{av:'AV14SdtEnCabezadoPedido',fld:'vSDTENCABEZADOPEDIDO',pic:''},{av:'AV21Realizado',fld:'vREALIZADO',pic:''}]}");
      setEventMetadata("VALIDV_ARTCOD","{handler:'validv_Artcod',iparms:[{av:'hV18ArtCod'},{av:'AV18ArtCod',fld:'vARTCOD',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV6CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("VALIDV_ARTCOD",",oparms:[{av:'AV18ArtCod',fld:'vARTCOD',pic:''},{av:'hV18ArtCod'}]}");
      setEventMetadata("VALIDV_PROCOD","{handler:'validv_Procod',iparms:[{av:'hV5ProCod'},{av:'AV5ProCod',fld:'vPROCOD',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("VALIDV_PROCOD",",oparms:[{av:'AV5ProCod',fld:'vPROCOD',pic:''},{av:'hV5ProCod'}]}");
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV10EmprCod = "" ;
      A69ArtDsc = "" ;
      A759ProDsc = "" ;
      hV18ArtCod = "" ;
      hV5ProCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV8Contexto = "" ;
      GXKey = "" ;
      AV13SdtArticuloPedido = new app.SdtSdtArticuloPedido(remoteHandle, context);
      A396EmprCod = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      AV19SdtArticuloPedidoCollection = new GXBaseCollection<app.SdtSdtArticuloPedido>(app.SdtSdtArticuloPedido.class, "SdtArticuloPedido", "TexplusNET", remoteHandle);
      AV14SdtEnCabezadoPedido = new app.SdtSdtEncabezadoPedido(remoteHandle, context);
      AV18ArtCod = "" ;
      AV5ProCod = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncancel_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l69ArtDsc = "" ;
      H00DB2_A69ArtDsc = new String[] {""} ;
      H00DB2_n69ArtDsc = new boolean[] {false} ;
      l759ProDsc = "" ;
      H00DB3_A759ProDsc = new String[] {""} ;
      H00DB4_A69ArtDsc = new String[] {""} ;
      H00DB4_n69ArtDsc = new boolean[] {false} ;
      H00DB4_A396EmprCod = new String[] {""} ;
      H00DB4_A252CliCod = new int[1] ;
      H00DB4_A65ArtCod = new String[] {""} ;
      A65ArtCod = "" ;
      H00DB5_A759ProDsc = new String[] {""} ;
      H00DB5_A396EmprCod = new String[] {""} ;
      H00DB5_A758ProCod = new String[] {""} ;
      H00DB6_A69ArtDsc = new String[] {""} ;
      H00DB6_n69ArtDsc = new boolean[] {false} ;
      H00DB6_A396EmprCod = new String[] {""} ;
      H00DB6_A252CliCod = new int[1] ;
      H00DB6_A65ArtCod = new String[] {""} ;
      H00DB7_A759ProDsc = new String[] {""} ;
      H00DB7_A396EmprCod = new String[] {""} ;
      H00DB7_A758ProCod = new String[] {""} ;
      AV23Kilos = DecimalUtil.ZERO ;
      AV24Metros = DecimalUtil.ZERO ;
      AV9DatosPedidoJSON = "" ;
      AV17WebSession = httpContext.getWebSession();
      AV11Mensajes = "" ;
      AV7CliNom = "" ;
      AV29Station = "" ;
      GXv_char2 = new String[1] ;
      AV30Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV31Usurcod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV16SdtFasePedidoCollection = new GXBaseCollection<app.SdtSdtFasePedido>(app.SdtSdtFasePedido.class, "SdtFasePedido", "TexplusNET", remoteHandle);
      H00DB8_A758ProCod = new String[] {""} ;
      H00DB8_A396EmprCod = new String[] {""} ;
      H00DB8_A774ProNumLin = new short[1] ;
      H00DB8_A457FasCod = new String[] {""} ;
      H00DB8_A460FasDsc = new String[] {""} ;
      AV15SdtFasePedido = new app.SdtSdtFasePedido(remoteHandle, context);
      sStyleString = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      H00DB9_A69ArtDsc = new String[] {""} ;
      H00DB9_n69ArtDsc = new boolean[] {false} ;
      H00DB9_A396EmprCod = new String[] {""} ;
      H00DB9_A252CliCod = new int[1] ;
      H00DB9_A65ArtCod = new String[] {""} ;
      ZV18ArtCod = "" ;
      ZhV18ArtCod = "" ;
      H00DB10_A759ProDsc = new String[] {""} ;
      H00DB10_A396EmprCod = new String[] {""} ;
      H00DB10_A758ProCod = new String[] {""} ;
      ZV5ProCod = "" ;
      ZhV5ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webdatospedidoarticulo__default(),
         new Object[] {
             new Object[] {
            H00DB2_A69ArtDsc, H00DB2_n69ArtDsc
            }
            , new Object[] {
            H00DB3_A759ProDsc
            }
            , new Object[] {
            H00DB4_A69ArtDsc, H00DB4_n69ArtDsc, H00DB4_A396EmprCod, H00DB4_A252CliCod, H00DB4_A65ArtCod
            }
            , new Object[] {
            H00DB5_A759ProDsc, H00DB5_A396EmprCod, H00DB5_A758ProCod
            }
            , new Object[] {
            H00DB6_A69ArtDsc, H00DB6_n69ArtDsc, H00DB6_A396EmprCod, H00DB6_A252CliCod, H00DB6_A65ArtCod
            }
            , new Object[] {
            H00DB7_A759ProDsc, H00DB7_A396EmprCod, H00DB7_A758ProCod
            }
            , new Object[] {
            H00DB8_A758ProCod, H00DB8_A396EmprCod, H00DB8_A774ProNumLin, H00DB8_A457FasCod, H00DB8_A460FasDsc
            }
            , new Object[] {
            H00DB9_A69ArtDsc, H00DB9_n69ArtDsc, H00DB9_A396EmprCod, H00DB9_A252CliCod, H00DB9_A65ArtCod
            }
            , new Object[] {
            H00DB10_A759ProDsc, H00DB10_A396EmprCod, H00DB10_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short A774ProNumLin ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private short AV22DisNumPie ;
   private short AV25DisArtAnh ;
   private short AV26DisGraAca ;
   private int AV6CliCod ;
   private int divTablecontent_Visible ;
   private int gxdynajaxindex ;
   private int A252CliCod ;
   private int edtavArtcod_Enabled ;
   private int edtavProcod_Enabled ;
   private int edtavDisnumpie_Enabled ;
   private int edtavKilos_Enabled ;
   private int edtavMetros_Enabled ;
   private int edtavDisartanh_Enabled ;
   private int edtavDisgraaca_Enabled ;
   private int idxLst ;
   private java.math.BigDecimal AV23Kilos ;
   private java.math.BigDecimal AV24Metros ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV10EmprCod ;
   private String A69ArtDsc ;
   private String A759ProDsc ;
   private String hV18ArtCod ;
   private String hV5ProCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String AV18ArtCod ;
   private String AV5ProCod ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String TempTags ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncancel_Internalname ;
   private String bttBtncancel_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavArtcod_Internalname ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String l69ArtDsc ;
   private String l759ProDsc ;
   private String A65ArtCod ;
   private String edtavProcod_Internalname ;
   private String edtavDisnumpie_Internalname ;
   private String edtavKilos_Internalname ;
   private String edtavMetros_Internalname ;
   private String edtavDisartanh_Internalname ;
   private String edtavDisgraaca_Internalname ;
   private String AV7CliNom ;
   private String AV29Station ;
   private String GXv_char2[] ;
   private String AV30Emprnom ;
   private String GXv_char3[] ;
   private String AV31Usurcod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String sStyleString ;
   private String tblUnnamedtable1_Internalname ;
   private String divDatoarticulo_Internalname ;
   private String edtavArtcod_Jsonclick ;
   private String edtavProcod_Jsonclick ;
   private String edtavDisnumpie_Jsonclick ;
   private String edtavKilos_Jsonclick ;
   private String edtavMetros_Jsonclick ;
   private String edtavDisartanh_Jsonclick ;
   private String edtavDisgraaca_Jsonclick ;
   private String ZV18ArtCod ;
   private String ZhV18ArtCod ;
   private String ZV5ProCod ;
   private String ZhV5ProCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n69ArtDsc ;
   private boolean AV21Realizado ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private String AV8Contexto ;
   private String AV9DatosPedidoJSON ;
   private String AV11Mensajes ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV17WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private IDataStoreProvider pr_default ;
   private String[] H00DB2_A69ArtDsc ;
   private boolean[] H00DB2_n69ArtDsc ;
   private String[] H00DB3_A759ProDsc ;
   private String[] H00DB4_A69ArtDsc ;
   private boolean[] H00DB4_n69ArtDsc ;
   private String[] H00DB4_A396EmprCod ;
   private int[] H00DB4_A252CliCod ;
   private String[] H00DB4_A65ArtCod ;
   private String[] H00DB5_A759ProDsc ;
   private String[] H00DB5_A396EmprCod ;
   private String[] H00DB5_A758ProCod ;
   private String[] H00DB6_A69ArtDsc ;
   private boolean[] H00DB6_n69ArtDsc ;
   private String[] H00DB6_A396EmprCod ;
   private int[] H00DB6_A252CliCod ;
   private String[] H00DB6_A65ArtCod ;
   private String[] H00DB7_A759ProDsc ;
   private String[] H00DB7_A396EmprCod ;
   private String[] H00DB7_A758ProCod ;
   private String[] H00DB8_A758ProCod ;
   private String[] H00DB8_A396EmprCod ;
   private short[] H00DB8_A774ProNumLin ;
   private String[] H00DB8_A457FasCod ;
   private String[] H00DB8_A460FasDsc ;
   private String[] H00DB9_A69ArtDsc ;
   private boolean[] H00DB9_n69ArtDsc ;
   private String[] H00DB9_A396EmprCod ;
   private int[] H00DB9_A252CliCod ;
   private String[] H00DB9_A65ArtCod ;
   private String[] H00DB10_A759ProDsc ;
   private String[] H00DB10_A396EmprCod ;
   private String[] H00DB10_A758ProCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.SdtSdtArticuloPedido> AV19SdtArticuloPedidoCollection ;
   private GXBaseCollection<app.SdtSdtFasePedido> AV16SdtFasePedidoCollection ;
   private app.SdtSdtArticuloPedido AV13SdtArticuloPedido ;
   private app.SdtSdtFasePedido AV15SdtFasePedido ;
   private app.SdtSdtEncabezadoPedido AV14SdtEnCabezadoPedido ;
}

final  class webdatospedidoarticulo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00DB2", "SELECT * FROM (SELECT DISTINCT ArtDsc FROM TXPARTICU WHERE (UPPER(ArtDsc) like '%' || UPPER(?)) AND (EmprCod = ?) AND (CliCod = ?) ORDER BY ArtDsc) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DB3", "SELECT * FROM (SELECT DISTINCT ProDsc FROM TXPPROCES WHERE (UPPER(ProDsc) like '%' || UPPER(?)) AND (EmprCod = ?) ORDER BY ProDsc) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DB4", "SELECT ArtDsc, EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE (ArtDsc = ?) AND (EmprCod = ?) AND (CliCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DB5", "SELECT ProDsc, EmprCod, ProCod FROM TXPPROCES WHERE (ProDsc = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DB6", "SELECT ArtDsc, EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE (ArtDsc = ?) AND (EmprCod = ?) AND (CliCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DB7", "SELECT ProDsc, EmprCod, ProCod FROM TXPPROCES WHERE (ProDsc = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DB8", "SELECT T1.ProCod, T1.EmprCod, T1.ProNumLin, T1.FasCod, T2.FasDsc FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DB9", "SELECT ArtDsc, EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE (ArtDsc = ?) AND (EmprCod = ?) AND (CliCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DB10", "SELECT ProDsc, EmprCod, ProCod FROM TXPPROCES WHERE (ProDsc = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 28);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
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
               stmt.setString(1, (String)parms[0], 26);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
      }
   }

}

