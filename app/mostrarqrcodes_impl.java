package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mostrarqrcodes_impl extends GXWebPanel
{
   public mostrarqrcodes_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mostrarqrcodes_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mostrarqrcodes_impl.class ));
   }

   public mostrarqrcodes_impl( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void executeCmdLine( String args[] )
   {
      nGotPars = 1 ;
      webExecute();
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
         gxfirstwebparm = httpContext.GetNextPar( ) ;
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
            gxfirstwebparm = httpContext.GetNextPar( ) ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetNextPar( ) ;
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
         paBP2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            wsBP2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               weBP2( ) ;
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
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( httpContext.getMessage( "Mostrar QRCODES", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle += "-moz-opacity:0;opacity:0;" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.mostrarqrcodes", new String[] {}, new String[] {}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "QRCTEXTO", A13692QrcTexto);
      app.GxWebStd.gx_hidden_field( httpContext, "QRCIMAGEN", A13691QrcImagen);
      app.GxWebStd.gx_hidden_field( httpContext, "QRCIMAGEN_", A40000QrcImagen_);
      app.GxWebStd.gx_hidden_field( httpContext, "QRCID", GXutil.ltrim( localUtil.ntoc( A13688QrcID, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CONFIRMPANEL1_Title", GXutil.rtrim( Confirmpanel1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "CONFIRMPANEL1_Confirmationtext", GXutil.rtrim( Confirmpanel1_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "CONFIRMPANEL1_Yesbuttoncaption", GXutil.rtrim( Confirmpanel1_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "CONFIRMPANEL1_Nobuttoncaption", GXutil.rtrim( Confirmpanel1_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Width", GXutil.rtrim( Innewwindow1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Height", GXutil.rtrim( Innewwindow1_Height));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Name", GXutil.rtrim( Innewwindow1_Name));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Target", GXutil.rtrim( Innewwindow1_Target));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Location", GXutil.booltostr( Innewwindow1_Location));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Menubar", GXutil.booltostr( Innewwindow1_Menubar));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Resizable", GXutil.booltostr( Innewwindow1_Resizable));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Titlebar", GXutil.booltostr( Innewwindow1_Titlebar));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Toolbar", GXutil.booltostr( Innewwindow1_Toolbar));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Status", GXutil.booltostr( Innewwindow1_Status));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Top", GXutil.rtrim( Innewwindow1_Top));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Left", GXutil.rtrim( Innewwindow1_Left));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Refreshparentonclose", GXutil.booltostr( Innewwindow1_Refreshparentonclose));
      app.GxWebStd.gx_hidden_field( httpContext, "CONFIRMPANEL1_Result", GXutil.rtrim( Confirmpanel1_Result));
   }

   public void renderHtmlCloseFormBP2( )
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
      httpContext.writeTextNL( "</body>") ;
      httpContext.writeTextNL( "</html>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
   }

   public String getPgmname( )
   {
      return "MostrarQRCODES" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mostrar QRCODES", "") ;
   }

   public void wbBP0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, lblTextblock1_Caption, "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockTitleMaster", 0, "", 1, 1, 0, (short)(0), "HLP_MostrarQRCODES.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavQrctexto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavQrctexto_Internalname, httpContext.getMessage( "Qrc Texto", ""), "col-sm-3 AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavQrctexto_Internalname, AV21QrcTexto, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,14);\"", (short)(0), 1, edtavQrctexto_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2048", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_MostrarQRCODES.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttEnter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttEnter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MostrarQRCODES.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMensaje_Internalname, httpContext.getMessage( "Mensaje", ""), "col-sm-3 TextBlockLabel", 0, true, "");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "TextBlock" ;
         StyleString = "font-size:" + GXutil.str( edtavMensaje_Fontsize, 3, 0) + "pt;" + "color:" + WebUtils.getHTMLColor( edtavMensaje_Forecolor) + ";" + ((edtavMensaje_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavMensaje_Backcolor)+";") ;
         ClassString = "TextBlock" ;
         StyleString = "font-size:" + GXutil.str( edtavMensaje_Fontsize, 3, 0) + "pt;" + "color:" + WebUtils.getHTMLColor( edtavMensaje_Forecolor) + ";" + ((edtavMensaje_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavMensaje_Backcolor)+";") ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavMensaje_Internalname, AV16Mensaje, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,20);\"", (short)(1), 1, edtavMensaje_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "1024", 1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_MostrarQRCODES.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, "", httpContext.getMessage( "Imagen QR", ""), "col-sm-3 ImageLabel", 0, true, "");
         /* Static Bitmap Variable */
         ClassString = "Image" + " " + ((GXutil.strcmp(imgavImagenqr_gximage, "")==0) ? "" : "GX_Image_"+imgavImagenqr_gximage+"_Class") ;
         StyleString = "" ;
         AV14ImagenQR_IsBlob = (boolean)(((GXutil.strcmp("", AV14ImagenQR)==0)&&(GXutil.strcmp("", AV33Imagenqr_GXI)==0))||!(GXutil.strcmp("", AV14ImagenQR)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV14ImagenQR)==0) ? AV33Imagenqr_GXI : httpContext.getResourceRelative(AV14ImagenQR)) ;
         app.GxWebStd.gx_bitmap( httpContext, imgavImagenqr_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 0, "", "", 0, -1, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", "", 1, AV14ImagenQR_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_MostrarQRCODES.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* User Defined Control */
         ucConfirmpanel1.setProperty("Title", Confirmpanel1_Title);
         ucConfirmpanel1.setProperty("YesButtonCaption", Confirmpanel1_Yesbuttoncaption);
         ucConfirmpanel1.setProperty("NoButtonCaption", Confirmpanel1_Nobuttoncaption);
         ucConfirmpanel1.render(context, "dvelop.gxbootstrap.confirmpanel", Confirmpanel1_Internalname, "CONFIRMPANEL1Container");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* User Defined Control */
         ucInnewwindow1.setProperty("Width", Innewwindow1_Width);
         ucInnewwindow1.setProperty("Height", Innewwindow1_Height);
         ucInnewwindow1.setProperty("Name", Innewwindow1_Name);
         ucInnewwindow1.setProperty("Location", Innewwindow1_Location);
         ucInnewwindow1.setProperty("MenuBar", Innewwindow1_Menubar);
         ucInnewwindow1.setProperty("Resizable", Innewwindow1_Resizable);
         ucInnewwindow1.setProperty("TitleBar", Innewwindow1_Titlebar);
         ucInnewwindow1.setProperty("ToolBar", Innewwindow1_Toolbar);
         ucInnewwindow1.setProperty("status", Innewwindow1_Status);
         ucInnewwindow1.setProperty("top", Innewwindow1_Top);
         ucInnewwindow1.setProperty("left", Innewwindow1_Left);
         ucInnewwindow1.setProperty("RefreshParentOnClose", Innewwindow1_Refreshparentonclose);
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void startBP2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mostrar QRCODES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupBP0( ) ;
   }

   public void wsBP2( )
   {
      startBP2( ) ;
      evtBP2( ) ;
   }

   public void evtBP2( )
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
                        e11BP2 ();
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
                              e12BP2 ();
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Load */
                        e13BP2 ();
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

   public void weBP2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormBP2( ) ;
         }
      }
   }

   public void paBP2( )
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
            GX_FocusControl = edtavQrctexto_Internalname ;
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
      rfBP2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV31Pgmdesc = httpContext.getMessage( "Mostrar QRCODES", "") ;
      Gx_err = (short)(0) ;
      edtavMensaje_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMensaje_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMensaje_Enabled), 5, 0), true);
   }

   public void rfBP2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e13BP2 ();
         wbBP0( ) ;
      }
   }

   public void send_integrity_lvl_hashesBP2( )
   {
   }

   public void before_start_formulas( )
   {
      AV31Pgmdesc = httpContext.getMessage( "Mostrar QRCODES", "") ;
      Gx_err = (short)(0) ;
      edtavMensaje_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMensaje_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMensaje_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupBP0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11BP2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Confirmpanel1_Title = httpContext.cgiGet( "CONFIRMPANEL1_Title") ;
         Confirmpanel1_Confirmationtext = httpContext.cgiGet( "CONFIRMPANEL1_Confirmationtext") ;
         Confirmpanel1_Yesbuttoncaption = httpContext.cgiGet( "CONFIRMPANEL1_Yesbuttoncaption") ;
         Confirmpanel1_Nobuttoncaption = httpContext.cgiGet( "CONFIRMPANEL1_Nobuttoncaption") ;
         Innewwindow1_Width = httpContext.cgiGet( "INNEWWINDOW1_Width") ;
         Innewwindow1_Height = httpContext.cgiGet( "INNEWWINDOW1_Height") ;
         Innewwindow1_Name = httpContext.cgiGet( "INNEWWINDOW1_Name") ;
         Innewwindow1_Target = httpContext.cgiGet( "INNEWWINDOW1_Target") ;
         Innewwindow1_Location = GXutil.strtobool( httpContext.cgiGet( "INNEWWINDOW1_Location")) ;
         Innewwindow1_Menubar = GXutil.strtobool( httpContext.cgiGet( "INNEWWINDOW1_Menubar")) ;
         Innewwindow1_Resizable = GXutil.strtobool( httpContext.cgiGet( "INNEWWINDOW1_Resizable")) ;
         Innewwindow1_Titlebar = GXutil.strtobool( httpContext.cgiGet( "INNEWWINDOW1_Titlebar")) ;
         Innewwindow1_Toolbar = GXutil.strtobool( httpContext.cgiGet( "INNEWWINDOW1_Toolbar")) ;
         Innewwindow1_Status = GXutil.strtobool( httpContext.cgiGet( "INNEWWINDOW1_Status")) ;
         Innewwindow1_Top = httpContext.cgiGet( "INNEWWINDOW1_Top") ;
         Innewwindow1_Left = httpContext.cgiGet( "INNEWWINDOW1_Left") ;
         Innewwindow1_Refreshparentonclose = GXutil.strtobool( httpContext.cgiGet( "INNEWWINDOW1_Refreshparentonclose")) ;
         /* Read variables values. */
         AV21QrcTexto = httpContext.cgiGet( edtavQrctexto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21QrcTexto", AV21QrcTexto);
         AV16Mensaje = httpContext.cgiGet( edtavMensaje_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Mensaje", AV16Mensaje);
         AV14ImagenQR = httpContext.cgiGet( imgavImagenqr_Internalname) ;
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
      e11BP2 ();
      if (returnInSub) return;
   }

   public void e11BP2( )
   {
      /* Start Routine */
      returnInSub = false ;
      lblTextblock1_Caption = AV31Pgmdesc ;
      httpContext.ajax_rsp_assign_prop("", false, lblTextblock1_Internalname, "Caption", lblTextblock1_Caption, true);
      Confirmpanel1_Confirmationtext = httpContext.getMessage( "¿Desea Imprimir PDF de Ejemplo?", "") ;
      ucConfirmpanel1.sendProperty(context, "", false, Confirmpanel1_Internalname, "ConfirmationText", Confirmpanel1_Confirmationtext);
      this.executeUsercontrolMethod("", false, "CONFIRMPANEL1Container", "Confirm", "", new Object[] {});
      edtavMensaje_Fontsize = 14 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMensaje_Internalname, "Fontsize", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMensaje_Fontsize), 9, 0), true);
      edtavMensaje_Backcolor = GXutil.getColor( 140, 43, 44) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMensaje_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMensaje_Backcolor), 9, 0), true);
      edtavMensaje_Forecolor = GXutil.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMensaje_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMensaje_Forecolor), 9, 0), true);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e12BP2 ();
      if (returnInSub) return;
   }

   public void e12BP2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV21QrcTexto)==0) )
      {
         AV32GXLvl13 = (byte)(0) ;
         /* Using cursor H00BP2 */
         pr_default.execute(0, new Object[] {AV21QrcTexto});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A13692QrcTexto = H00BP2_A13692QrcTexto[0] ;
            n13692QrcTexto = H00BP2_n13692QrcTexto[0] ;
            A40000QrcImagen_ = H00BP2_A40000QrcImagen_[0] ;
            n40000QrcImagen_ = H00BP2_n40000QrcImagen_[0] ;
            A13691QrcImagen = H00BP2_A13691QrcImagen[0] ;
            n13691QrcImagen = H00BP2_n13691QrcImagen[0] ;
            A13688QrcID = H00BP2_A13688QrcID[0] ;
            AV32GXLvl13 = (byte)(1) ;
            AV14ImagenQR = A13691QrcImagen ;
            httpContext.ajax_rsp_assign_prop("", false, imgavImagenqr_Internalname, "Bitmap", ((GXutil.strcmp("", AV14ImagenQR)==0) ? AV33Imagenqr_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV14ImagenQR))), true);
            httpContext.ajax_rsp_assign_prop("", false, imgavImagenqr_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV14ImagenQR), true);
            AV33Imagenqr_GXI = A40000QrcImagen_ ;
            httpContext.ajax_rsp_assign_prop("", false, imgavImagenqr_Internalname, "Bitmap", ((GXutil.strcmp("", AV14ImagenQR)==0) ? AV33Imagenqr_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV14ImagenQR))), true);
            httpContext.ajax_rsp_assign_prop("", false, imgavImagenqr_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV14ImagenQR), true);
            AV16Mensaje = httpContext.getMessage( "Cargado de QRCODES Id: ", "") + GXutil.trim( GXutil.str( A13688QrcID, 18, 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Mensaje", AV16Mensaje);
            pr_default.readNext(0);
         }
         pr_default.close(0);
         if ( AV32GXLvl13 == 0 )
         {
            GXt_char1 = AV28QrcURL ;
            GXv_char2[0] = GXt_char1 ;
            new app.obtenerqrcurl(remoteHandle, context).execute( AV21QrcTexto, GXv_char2) ;
            mostrarqrcodes_impl.this.GXt_char1 = GXv_char2[0] ;
            AV28QrcURL = GXt_char1 ;
            AV14ImagenQR = AV28QrcURL ;
            httpContext.ajax_rsp_assign_prop("", false, imgavImagenqr_Internalname, "Bitmap", ((GXutil.strcmp("", AV14ImagenQR)==0) ? AV33Imagenqr_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV14ImagenQR))), true);
            httpContext.ajax_rsp_assign_prop("", false, imgavImagenqr_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV14ImagenQR), true);
            AV33Imagenqr_GXI = GXDbFile.pathToUrl( AV28QrcURL, context.getHttpContext()) ;
            httpContext.ajax_rsp_assign_prop("", false, imgavImagenqr_Internalname, "Bitmap", ((GXutil.strcmp("", AV14ImagenQR)==0) ? AV33Imagenqr_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV14ImagenQR))), true);
            httpContext.ajax_rsp_assign_prop("", false, imgavImagenqr_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV14ImagenQR), true);
            AV16Mensaje = httpContext.getMessage( "Registrado desde URL ", "") + AV28QrcURL ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Mensaje", AV16Mensaje);
         }
      }
      else
      {
         AV16Mensaje = httpContext.getMessage( "Se requiere TEXTO", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Mensaje", AV16Mensaje);
      }
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e13BP2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
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
      paBP2( ) ;
      wsBP2( ) ;
      weBP2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202612519141194", true, true);
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
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("mostrarqrcodes.js", "?202612519141194", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtavQrctexto_Internalname = "vQRCTEXTO" ;
      bttEnter_Internalname = "ENTER" ;
      edtavMensaje_Internalname = "vMENSAJE" ;
      imgavImagenqr_Internalname = "vIMAGENQR" ;
      divTable1_Internalname = "TABLE1" ;
      Confirmpanel1_Internalname = "CONFIRMPANEL1" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      divMaintable_Internalname = "MAINTABLE" ;
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
      imgavImagenqr_gximage = "" ;
      edtavMensaje_Backstyle = (byte)(-1) ;
      edtavMensaje_Backcolor = (int)(0xFFFFFF) ;
      edtavMensaje_Forecolor = (int)(0x000000) ;
      edtavMensaje_Fontsize = (int)(DecimalUtil.decToDouble(DecimalUtil.stringToDec("12.0"))) ;
      edtavMensaje_Enabled = 1 ;
      edtavQrctexto_Enabled = 1 ;
      lblTextblock1_Caption = httpContext.getMessage( "Text Block", "") ;
      Innewwindow1_Refreshparentonclose = GXutil.toBoolean( -1) ;
      Innewwindow1_Left = "100" ;
      Innewwindow1_Top = "100" ;
      Innewwindow1_Status = GXutil.toBoolean( 0) ;
      Innewwindow1_Toolbar = GXutil.toBoolean( 0) ;
      Innewwindow1_Titlebar = GXutil.toBoolean( 0) ;
      Innewwindow1_Resizable = GXutil.toBoolean( 0) ;
      Innewwindow1_Menubar = GXutil.toBoolean( 0) ;
      Innewwindow1_Location = GXutil.toBoolean( 0) ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Name = "" ;
      Innewwindow1_Height = "600" ;
      Innewwindow1_Width = "800" ;
      Confirmpanel1_Nobuttoncaption = "No" ;
      Confirmpanel1_Yesbuttoncaption = "Si" ;
      Confirmpanel1_Confirmationtext = "" ;
      Confirmpanel1_Title = httpContext.getMessage( "Confirmar", "") ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e12BP2',iparms:[{av:'AV21QrcTexto',fld:'vQRCTEXTO',pic:''},{av:'A13692QrcTexto',fld:'QRCTEXTO',pic:''},{av:'A13691QrcImagen',fld:'QRCIMAGEN',pic:''},{av:'A40000QrcImagen_',fld:'QRCIMAGEN_',pic:''},{av:'A13688QrcID',fld:'QRCID',pic:'ZZZZZZZZZZZZZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV14ImagenQR',fld:'vIMAGENQR',pic:''},{av:'AV16Mensaje',fld:'vMENSAJE',pic:''}]}");
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
      Confirmpanel1_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      A13692QrcTexto = "" ;
      A13691QrcImagen = "" ;
      A40000QrcImagen_ = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblTextblock1_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      AV21QrcTexto = "" ;
      bttEnter_Jsonclick = "" ;
      AV16Mensaje = "" ;
      AV14ImagenQR = "" ;
      AV33Imagenqr_GXI = "" ;
      sImgUrl = "" ;
      ucConfirmpanel1 = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV31Pgmdesc = "" ;
      scmdbuf = "" ;
      H00BP2_A13692QrcTexto = new String[] {""} ;
      H00BP2_n13692QrcTexto = new boolean[] {false} ;
      H00BP2_A40000QrcImagen_ = new String[] {""} ;
      H00BP2_n40000QrcImagen_ = new boolean[] {false} ;
      H00BP2_A13691QrcImagen = new String[] {""} ;
      H00BP2_n13691QrcImagen = new boolean[] {false} ;
      H00BP2_A13688QrcID = new long[1] ;
      AV28QrcURL = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mostrarqrcodes__default(),
         new Object[] {
             new Object[] {
            H00BP2_A13692QrcTexto, H00BP2_n13692QrcTexto, H00BP2_A40000QrcImagen_, H00BP2_n40000QrcImagen_, H00BP2_A13691QrcImagen, H00BP2_n13691QrcImagen, H00BP2_A13688QrcID
            }
         }
      );
      AV31Pgmdesc = httpContext.getMessage( "Mostrar QRCODES", "") ;
      /* GeneXus formulas. */
      AV31Pgmdesc = httpContext.getMessage( "Mostrar QRCODES", "") ;
      Gx_err = (short)(0) ;
      edtavMensaje_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDonePA ;
   private byte AV32GXLvl13 ;
   private byte nGXWrapped ;
   private byte edtavMensaje_Backstyle ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtavQrctexto_Enabled ;
   private int edtavMensaje_Fontsize ;
   private int edtavMensaje_Forecolor ;
   private int edtavMensaje_Backcolor ;
   private int edtavMensaje_Enabled ;
   private int idxLst ;
   private long A13688QrcID ;
   private String Confirmpanel1_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Confirmpanel1_Title ;
   private String Confirmpanel1_Confirmationtext ;
   private String Confirmpanel1_Yesbuttoncaption ;
   private String Confirmpanel1_Nobuttoncaption ;
   private String Innewwindow1_Width ;
   private String Innewwindow1_Height ;
   private String Innewwindow1_Name ;
   private String Innewwindow1_Target ;
   private String Innewwindow1_Top ;
   private String Innewwindow1_Left ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Caption ;
   private String lblTextblock1_Jsonclick ;
   private String divTable1_Internalname ;
   private String edtavQrctexto_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttEnter_Internalname ;
   private String bttEnter_Jsonclick ;
   private String edtavMensaje_Internalname ;
   private String imgavImagenqr_gximage ;
   private String sImgUrl ;
   private String imgavImagenqr_Internalname ;
   private String Confirmpanel1_Internalname ;
   private String Innewwindow1_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV31Pgmdesc ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Innewwindow1_Location ;
   private boolean Innewwindow1_Menubar ;
   private boolean Innewwindow1_Resizable ;
   private boolean Innewwindow1_Titlebar ;
   private boolean Innewwindow1_Toolbar ;
   private boolean Innewwindow1_Status ;
   private boolean Innewwindow1_Refreshparentonclose ;
   private boolean wbLoad ;
   private boolean AV14ImagenQR_IsBlob ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n13692QrcTexto ;
   private boolean n40000QrcImagen_ ;
   private boolean n13691QrcImagen ;
   private String A13692QrcTexto ;
   private String A40000QrcImagen_ ;
   private String AV21QrcTexto ;
   private String AV16Mensaje ;
   private String AV33Imagenqr_GXI ;
   private String AV28QrcURL ;
   private String A13691QrcImagen ;
   private String AV14ImagenQR ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucConfirmpanel1 ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private IDataStoreProvider pr_default ;
   private String[] H00BP2_A13692QrcTexto ;
   private boolean[] H00BP2_n13692QrcTexto ;
   private String[] H00BP2_A40000QrcImagen_ ;
   private boolean[] H00BP2_n40000QrcImagen_ ;
   private String[] H00BP2_A13691QrcImagen ;
   private boolean[] H00BP2_n13691QrcImagen ;
   private long[] H00BP2_A13688QrcID ;
}

final  class mostrarqrcodes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00BP2", "SELECT QrcTexto, QrcImagen_, QrcImagen, QrcID FROM QRCodes WHERE QrcTexto = ? ORDER BY QrcID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getMultimediaUri(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getMultimediaFile(3, rslt.getVarchar(2));
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4);
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
               stmt.setVarchar(1, (String)parms[0], 2048);
               return;
      }
   }

}

