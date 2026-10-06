package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class nwdpalmacentejidotdispoh_impl extends GXWebComponent
{
   public nwdpalmacentejidotdispoh_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public nwdpalmacentejidotdispoh_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( nwdpalmacentejidotdispoh_impl.class ));
   }

   public nwdpalmacentejidotdispoh_impl( int remoteHandle ,
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
      chkPriCod = UIFactory.getCheckbox(this);
      chkDisDes = UIFactory.getCheckbox(this);
      cmbDisEst = new HTMLChoice();
      chkDisPla = UIFactory.getCheckbox(this);
      chkDisFac = UIFactory.getCheckbox(this);
      chkDisArtEnc = UIFactory.getCheckbox(this);
      chkDisArtCor = UIFactory.getCheckbox(this);
      chkDisAcc = UIFactory.getCheckbox(this);
      chkDisExp = UIFactory.getCheckbox(this);
      chkDisEstTip = UIFactory.getCheckbox(this);
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
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Integer.valueOf(A361DisCod)});
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

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paKI2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Nw DPAlmacen Tejido TDISPOH", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.nwdpalmacentejidotdispoh", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"EmprCod","DisCod"}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA361DisCod", GXutil.ltrim( localUtil.ntoc( wcpOA361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
   }

   public void renderHtmlCloseFormKI2( )
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
      return "NwDPAlmacenTejidoTDISPOH" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Nw DPAlmacen Tejido TDISPOH", "") ;
   }

   public void wbKI0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.nwdpalmacentejidotdispoh");
         }
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", sPrefix, "false");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtEmprCod_Internalname, httpContext.getMessage( "Código Empresa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkPriCod.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkPriCod.getInternalname(), httpContext.getMessage( "Prioridad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkPriCod.getInternalname(), A757PriCod, "", httpContext.getMessage( "Prioridad", ""), 1, chkPriCod.getEnabled(), "1", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisCod_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprNom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtEmprNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtEmprNom_Link, "", "", "", edtEmprNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisCliNum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisCliNum_Internalname, httpContext.getMessage( "Codigo Disposicion Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisCliNum_Internalname, GXutil.rtrim( A360DisCliNum), GXutil.rtrim( localUtil.format( A360DisCliNum, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCliNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCliNum_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtCod_Internalname, httpContext.getMessage( "Código Artículo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtCod_Internalname, GXutil.rtrim( A335DisArtCod), GXutil.rtrim( localUtil.format( A335DisArtCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisFec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisFec_Internalname, httpContext.getMessage( "Fecha Pedido", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtDisFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisFec_Internalname, localUtil.format(A369DisFec, "99/99/99"), localUtil.format( A369DisFec, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtDisFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisFecEnt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisFecEnt_Internalname, httpContext.getMessage( "Fecha Entrega Prevista", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtDisFecEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisFecEnt_Internalname, localUtil.format(A371DisFecEnt, "99/99/99"), localUtil.format( A371DisFecEnt, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFecEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisFecEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtDisFecEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisFecEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisFecCli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisFecCli_Internalname, httpContext.getMessage( "Fecha pedido cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtDisFecCli_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisFecCli_Internalname, localUtil.format(A370DisFecCli, "99/99/99"), localUtil.format( A370DisFecCli, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFecCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisFecCli_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtDisFecCli_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisFecCli_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtDsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtDsc_Internalname, httpContext.getMessage( "Artículo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtDsc_Internalname, GXutil.rtrim( A337DisArtDsc), GXutil.rtrim( localUtil.format( A337DisArtDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtTr1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtTr1_Internalname, httpContext.getMessage( "Trama1", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtTr1_Internalname, GXutil.rtrim( A353DisArtTr1), GXutil.rtrim( localUtil.format( A353DisArtTr1, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtTr1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtTr1_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtPt1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtPt1_Internalname, httpContext.getMessage( "Porcentaje Trama1", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPt1_Internalname, GXutil.ltrim( localUtil.ntoc( A344DisArtPt1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPt1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A344DisArtPt1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A344DisArtPt1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPt1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtPt1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtTr2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtTr2_Internalname, httpContext.getMessage( "Trama2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtTr2_Internalname, GXutil.rtrim( A354DisArtTr2), GXutil.rtrim( localUtil.format( A354DisArtTr2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtTr2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtTr2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtPt2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtPt2_Internalname, httpContext.getMessage( "Porcentaje Trama2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPt2_Internalname, GXutil.ltrim( localUtil.ntoc( A345DisArtPt2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPt2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A345DisArtPt2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A345DisArtPt2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPt2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtPt2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtTr3_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtTr3_Internalname, httpContext.getMessage( "Trama3", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtTr3_Internalname, GXutil.rtrim( A355DisArtTr3), GXutil.rtrim( localUtil.format( A355DisArtTr3, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtTr3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtTr3_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtPt3_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtPt3_Internalname, httpContext.getMessage( "Porcentaje Trama3", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPt3_Internalname, GXutil.ltrim( localUtil.ntoc( A346DisArtPt3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPt3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A346DisArtPt3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A346DisArtPt3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPt3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtPt3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtUr1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtUr1_Internalname, httpContext.getMessage( "Urdido1", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtUr1_Internalname, GXutil.rtrim( A356DisArtUr1), GXutil.rtrim( localUtil.format( A356DisArtUr1, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtUr1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtUr1_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtPu1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtPu1_Internalname, httpContext.getMessage( "Porcentaje Urdido1", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPu1_Internalname, GXutil.ltrim( localUtil.ntoc( A347DisArtPu1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPu1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A347DisArtPu1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A347DisArtPu1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPu1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtPu1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtUr2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtUr2_Internalname, httpContext.getMessage( "Urdido2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtUr2_Internalname, GXutil.rtrim( A357DisArtUr2), GXutil.rtrim( localUtil.format( A357DisArtUr2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtUr2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtUr2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtPu2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtPu2_Internalname, httpContext.getMessage( "Porcentaje Urdido 2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPu2_Internalname, GXutil.ltrim( localUtil.ntoc( A348DisArtPu2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPu2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A348DisArtPu2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A348DisArtPu2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPu2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtPu2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtUr3_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtUr3_Internalname, httpContext.getMessage( "Urdido3", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtUr3_Internalname, GXutil.rtrim( A358DisArtUr3), GXutil.rtrim( localUtil.format( A358DisArtUr3, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtUr3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtUr3_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtPu3_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtPu3_Internalname, httpContext.getMessage( "Porcentaje Urdido3", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPu3_Internalname, GXutil.ltrim( localUtil.ntoc( A349DisArtPu3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPu3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A349DisArtPu3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A349DisArtPu3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPu3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtPu3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtOpe_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtOpe_Internalname, httpContext.getMessage( "Operacion Especial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtOpe_Internalname, GXutil.rtrim( A341DisArtOpe), GXutil.rtrim( localUtil.format( A341DisArtOpe, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtOpe_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtOpe_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtTip_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtTip_Internalname, httpContext.getMessage( "Tipo Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtTip_Internalname, GXutil.ltrim( localUtil.ntoc( A352DisArtTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtTip_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A352DisArtTip), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A352DisArtTip), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtTip_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtTip_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtMat_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtMat_Internalname, httpContext.getMessage( "Materia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtMat_Internalname, GXutil.rtrim( A340DisArtMat), GXutil.rtrim( localUtil.format( A340DisArtMat, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisNMtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisNMtr_Internalname, httpContext.getMessage( "Número Métrico", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNMtr_Internalname, GXutil.rtrim( A998DisNMtr), GXutil.rtrim( localUtil.format( A998DisNMtr, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNMtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNMtr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisNMez_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisNMez_Internalname, httpContext.getMessage( "Numero Mezcl para Peinado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNMez_Internalname, GXutil.rtrim( A999DisNMez), GXutil.rtrim( localUtil.format( A999DisNMez, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNMez_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNMez_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisColNom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisColNom_Internalname, httpContext.getMessage( "Nombre Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisColNom_Internalname, GXutil.rtrim( A362DisColNom), GXutil.rtrim( localUtil.format( A362DisColNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisColNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisColNum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisColNum_Internalname, httpContext.getMessage( "Numero Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A363DisColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A363DisColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A363DisColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisColNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisNomCli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisNomCli_Internalname, httpContext.getMessage( "Nombre Color Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNomCli_Internalname, GXutil.rtrim( A1195DisNomCli), GXutil.rtrim( localUtil.format( A1195DisNomCli, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNomCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNomCli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisNumCli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisNumCli_Internalname, httpContext.getMessage( "Numero Color Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumCli_Internalname, GXutil.ltrim( localUtil.ntoc( A1196DisNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1196DisNumCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1196DisNumCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNumCli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisTipCol_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisTipCol_Internalname, httpContext.getMessage( "Tipo Colorante", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A390DisTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A390DisTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A390DisTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisTipCol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkDisDes.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkDisDes.getInternalname(), httpContext.getMessage( "Desglose", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisDes.getInternalname(), A365DisDes, "", httpContext.getMessage( "Desglose", ""), 1, chkDisDes.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFindInt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFindInt_Internalname, httpContext.getMessage( "FindInt", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFindInt_Internalname, GXutil.ltrim( localUtil.ntoc( A1000FindInt, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFindInt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1000FindInt), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1000FindInt), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFindInt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFindInt_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFindTon_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFindTon_Internalname, httpContext.getMessage( "FindTon", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFindTon_Internalname, GXutil.rtrim( A1001FindTon), GXutil.rtrim( localUtil.format( A1001FindTon, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFindTon_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFindTon_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisNumTen_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisNumTen_Internalname, httpContext.getMessage( "Teñida Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumTen_Internalname, GXutil.rtrim( A1002DisNumTen), GXutil.rtrim( localUtil.format( A1002DisNumTen, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumTen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNumTen_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqCodDis_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqCodDis_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCodDis_Internalname, GXutil.rtrim( A1122MaqCodDis), GXutil.rtrim( localUtil.format( A1122MaqCodDis, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCodDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqCodDis_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFindCol_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFindCol_Internalname, httpContext.getMessage( "Busca Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFindCol_Internalname, GXutil.rtrim( A475FindCol), GXutil.rtrim( localUtil.format( A475FindCol, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFindCol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFindCol_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPartCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPartCod_Internalname, httpContext.getMessage( "Código de Partido", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPartCod_Internalname, GXutil.rtrim( A966PartCod), GXutil.rtrim( localUtil.format( A966PartCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPartCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPartCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPartReo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPartReo_Internalname, httpContext.getMessage( "Reoperado Exterior,SI o No", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPartReo_Internalname, GXutil.rtrim( A2244PartReo), GXutil.rtrim( localUtil.format( A2244PartReo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPartReo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPartReo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisNumUni_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisNumUni_Internalname, httpContext.getMessage( "Unidades", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumUni_Internalname, GXutil.ltrim( localUtil.ntoc( A375DisNumUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumUni_Enabled!=0) ? localUtil.format( A375DisNumUni, "ZZZZZ9.99") : localUtil.format( A375DisNumUni, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumUni_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNumUni_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisNumPie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisNumPie_Internalname, httpContext.getMessage( "Numero Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumPie_Internalname, GXutil.ltrim( localUtil.ntoc( A374DisNumPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A374DisNumPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A374DisNumPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumPie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNumPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbDisEst.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbDisEst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbDisEst, cmbDisEst.getInternalname(), GXutil.trim( GXutil.str( A367DisEst, 1, 0)), 1, cmbDisEst.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbDisEst.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         cmbDisEst.setValue( GXutil.trim( GXutil.str( A367DisEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbDisEst.getInternalname(), "Values", cmbDisEst.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisUniMed_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisUniMed_Internalname, httpContext.getMessage( "Unidades Medida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisUniMed_Internalname, GXutil.rtrim( A392DisUniMed), GXutil.rtrim( localUtil.format( A392DisUniMed, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisUniMed_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisUniMed_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipConCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtTipConCod_Internalname, httpContext.getMessage( "TipConCod", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTipConCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1157TipConCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipConCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1157TipConCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1157TipConCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipConCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipConCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipConNom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtTipConNom_Internalname, httpContext.getMessage( "TipConNom", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTipConNom_Internalname, GXutil.rtrim( A1158TipConNom), GXutil.rtrim( localUtil.format( A1158TipConNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipConNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipConNom_Enabled, 0, "text", "", 35, "chr", 1, "row", 35, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisRes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisRes_Internalname, httpContext.getMessage( "Disposicion Reservada? S o N", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisRes_Internalname, GXutil.rtrim( A1968DisRes), GXutil.rtrim( localUtil.format( A1968DisRes, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisRes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisRes_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisTipDis_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisTipDis_Internalname, httpContext.getMessage( "Tipo Pedido", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisTipDis_Internalname, GXutil.rtrim( A2009DisTipDis), GXutil.rtrim( localUtil.format( A2009DisTipDis, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisTipDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisTipDis_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisNumBas_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisNumBas_Internalname, httpContext.getMessage( "Numero Bastones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumBas_Internalname, GXutil.ltrim( localUtil.ntoc( A2267DisNumBas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumBas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2267DisNumBas), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2267DisNumBas), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumBas_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNumBas_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisCliDes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisCliDes_Internalname, httpContext.getMessage( "Código Cliente Destino", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisCliDes_Internalname, GXutil.ltrim( localUtil.ntoc( A2310DisCliDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCliDes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2310DisCliDes), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2310DisCliDes), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Código Cliente Destino", ""), "", edtDisCliDes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCliDes_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisManCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisManCod_Internalname, httpContext.getMessage( "Codigo Manufacturador", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisManCod_Internalname, GXutil.ltrim( localUtil.ntoc( A2402DisManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisManCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2402DisManCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2402DisManCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisManCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisManCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisOpeAnt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisOpeAnt_Internalname, httpContext.getMessage( "Codigo Operacion Aspeado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisOpeAnt_Internalname, GXutil.ltrim( localUtil.ntoc( A2403DisOpeAnt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisOpeAnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2403DisOpeAnt), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2403DisOpeAnt), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisOpeAnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisOpeAnt_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisCodTex_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisCodTex_Internalname, httpContext.getMessage( "Codigo Numeracion Textil", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisCodTex_Internalname, GXutil.rtrim( A2742DisCodTex), GXutil.rtrim( localUtil.format( A2742DisCodTex, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCodTex_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCodTex_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisNumTex1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisNumTex1_Internalname, httpContext.getMessage( "Primera parte NMetrico", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumTex1_Internalname, GXutil.ltrim( localUtil.ntoc( A2743DisNumTex1, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumTex1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2743DisNumTex1), "9") : localUtil.format( DecimalUtil.doubleToDec(A2743DisNumTex1), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumTex1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNumTex1_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisNumTex2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisNumTex2_Internalname, httpContext.getMessage( "Segunda parte NMetrico", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumTex2_Internalname, GXutil.ltrim( localUtil.ntoc( A2744DisNumTex2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumTex2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2744DisNumTex2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2744DisNumTex2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumTex2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNumTex2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisNumLot_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisNumLot_Internalname, httpContext.getMessage( "Numero de Lote/Barcada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumLot_Internalname, GXutil.ltrim( localUtil.ntoc( A2831DisNumLot, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumLot_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2831DisNumLot), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2831DisNumLot), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumLot_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNumLot_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisKgsLot_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisKgsLot_Internalname, httpContext.getMessage( "Kilos del Lote/Barcada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisKgsLot_Internalname, GXutil.ltrim( localUtil.ntoc( A2832DisKgsLot, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisKgsLot_Enabled!=0) ? localUtil.format( A2832DisKgsLot, "ZZZZZ9.99") : localUtil.format( A2832DisKgsLot, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisKgsLot_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisKgsLot_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkDisPla.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkDisPla.getInternalname(), httpContext.getMessage( "Tipo, valor S o N", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisPla.getInternalname(), A2926DisPla, "", httpContext.getMessage( "Tipo, valor S o N", ""), 1, chkDisPla.getEnabled(), "S", httpContext.getMessage( "¿Muestras?", ""), StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisNumTon_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisNumTon_Internalname, httpContext.getMessage( "Tono Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumTon_Internalname, GXutil.rtrim( A3309DisNumTon), GXutil.rtrim( localUtil.format( A3309DisNumTon, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumTon_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNumTon_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkDisFac.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkDisFac.getInternalname(), httpContext.getMessage( "Hdr a Facturar", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisFac.getInternalname(), A3306DisFac, "", httpContext.getMessage( "Hdr a Facturar", ""), 1, chkDisFac.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRetCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtRetCod_Internalname, httpContext.getMessage( "Código Retención Dispos.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtRetCod_Internalname, GXutil.rtrim( A3826RetCod), GXutil.rtrim( localUtil.format( A3826RetCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRetCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtRetCod_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisPle2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisPle2_Internalname, httpContext.getMessage( "Plegado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisPle2_Internalname, GXutil.rtrim( A2835DisPle2), GXutil.rtrim( localUtil.format( A2835DisPle2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPle2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisPle2_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisFecLan_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisFecLan_Internalname, httpContext.getMessage( "Fecha Planif. Tinte Teor.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtDisFecLan_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisFecLan_Internalname, localUtil.format(A3627DisFecLan, "99/99/99"), localUtil.format( A3627DisFecLan, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFecLan_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisFecLan_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtDisFecLan_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisFecLan_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkDisArtEnc.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkDisArtEnc.getInternalname(), httpContext.getMessage( "Encolar Orillos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisArtEnc.getInternalname(), A338DisArtEnc, "", httpContext.getMessage( "Encolar Orillos", ""), 1, chkDisArtEnc.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkDisArtCor.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkDisArtCor.getInternalname(), httpContext.getMessage( "Cortar Orillos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisArtCor.getInternalname(), A336DisArtCor, "", httpContext.getMessage( "Cortar Orillos", ""), 1, chkDisArtCor.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisAntp_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisAntp_Internalname, httpContext.getMessage( "Antipiling?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisAntp_Internalname, GXutil.rtrim( A5366DisAntp), GXutil.rtrim( localUtil.format( A5366DisAntp, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisAntp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisAntp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisCruKgs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisCruKgs_Internalname, httpContext.getMessage( "Kilos Pieza Crudo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisCruKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A4470DisCruKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCruKgs_Enabled!=0) ? localUtil.format( A4470DisCruKgs, "ZZZZZ9.99") : localUtil.format( A4470DisCruKgs, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCruKgs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCruKgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkDisAcc.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkDisAcc.getInternalname(), httpContext.getMessage( "Accesorios Metalicos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisAcc.getInternalname(), A5252DisAcc, "", httpContext.getMessage( "Accesorios Metalicos", ""), 1, chkDisAcc.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkDisExp.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkDisExp.getInternalname(), httpContext.getMessage( "Exportación", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisExp.getInternalname(), A7739DisExp, "", httpContext.getMessage( "Exportación", ""), 1, chkDisExp.getEnabled(), "E", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkDisEstTip.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkDisEstTip.getInternalname(), httpContext.getMessage( "Tipo de Estampado (Plana,Rot)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisEstTip.getInternalname(), A5032DisEstTip, "", httpContext.getMessage( "Tipo de Estampado (Plana,Rot)", ""), 1, chkDisEstTip.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 374,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", httpContext.getMessage( "GXM_update", ""), bttBtnupdate_Jsonclick, 5, httpContext.getMessage( "GXM_update", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOUPDATE\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_NwDPAlmacenTejidoTDISPOH.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 376,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtndelete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DODELETE\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_NwDPAlmacenTejidoTDISPOH.htm");
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

   public void startKI2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Nw DPAlmacen Tejido TDISPOH", ""), (short)(0)) ;
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
            strupKI0( ) ;
         }
      }
   }

   public void wsKI2( )
   {
      startKI2( ) ;
      evtKI2( ) ;
   }

   public void evtKI2( )
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
                              strupKI0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupKI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e11KI2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupKI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e12KI2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUPDATE'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupKI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoUpdate' */
                                 e13KI2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DODELETE'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupKI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoDelete' */
                                 e14KI2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupKI0( ) ;
                           }
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
                              strupKI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
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

   public void weKI2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormKI2( ) ;
         }
      }
   }

   public void paKI2( )
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
      A757PriCod = ((GXutil.strcmp(GXutil.rtrim( A757PriCod), "1")==0) ? "1" : "0") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A757PriCod", A757PriCod);
      A365DisDes = ((GXutil.strcmp(GXutil.rtrim( A365DisDes), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A365DisDes", A365DisDes);
      if ( cmbDisEst.getItemCount() > 0 )
      {
         A367DisEst = (byte)(GXutil.lval( cmbDisEst.getValidValue(GXutil.trim( GXutil.str( A367DisEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A367DisEst", GXutil.str( A367DisEst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbDisEst.setValue( GXutil.trim( GXutil.str( A367DisEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbDisEst.getInternalname(), "Values", cmbDisEst.ToJavascriptSource(), true);
      }
      A2926DisPla = ((GXutil.strcmp(GXutil.rtrim( A2926DisPla), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2926DisPla", A2926DisPla);
      A3306DisFac = ((GXutil.strcmp(GXutil.rtrim( A3306DisFac), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3306DisFac", A3306DisFac);
      A338DisArtEnc = ((GXutil.strcmp(GXutil.rtrim( A338DisArtEnc), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A338DisArtEnc", A338DisArtEnc);
      A336DisArtCor = ((GXutil.strcmp(GXutil.rtrim( A336DisArtCor), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A336DisArtCor", A336DisArtCor);
      A5252DisAcc = ((GXutil.strcmp(GXutil.rtrim( A5252DisAcc), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5252DisAcc", A5252DisAcc);
      A7739DisExp = ((GXutil.strcmp(GXutil.rtrim( A7739DisExp), "E")==0) ? "E" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7739DisExp", A7739DisExp);
      A5032DisEstTip = ((GXutil.strcmp(GXutil.rtrim( A5032DisEstTip), "S")==0) ? "S" : "*") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5032DisEstTip", A5032DisEstTip);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfKI2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV17Pgmname = "NwDPAlmacenTejidoTDISPOH" ;
      Gx_err = (short)(0) ;
   }

   public void rfKI2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00KI3 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A5032DisEstTip = H00KI3_A5032DisEstTip[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5032DisEstTip", A5032DisEstTip);
            A7739DisExp = H00KI3_A7739DisExp[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7739DisExp", A7739DisExp);
            A5252DisAcc = H00KI3_A5252DisAcc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5252DisAcc", A5252DisAcc);
            A4470DisCruKgs = H00KI3_A4470DisCruKgs[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4470DisCruKgs", GXutil.ltrimstr( A4470DisCruKgs, 9, 2));
            A5366DisAntp = H00KI3_A5366DisAntp[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5366DisAntp", A5366DisAntp);
            A336DisArtCor = H00KI3_A336DisArtCor[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A336DisArtCor", A336DisArtCor);
            A338DisArtEnc = H00KI3_A338DisArtEnc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A338DisArtEnc", A338DisArtEnc);
            A3627DisFecLan = H00KI3_A3627DisFecLan[0] ;
            n3627DisFecLan = H00KI3_n3627DisFecLan[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3627DisFecLan", localUtil.format(A3627DisFecLan, "99/99/99"));
            A2835DisPle2 = H00KI3_A2835DisPle2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2835DisPle2", A2835DisPle2);
            A3826RetCod = H00KI3_A3826RetCod[0] ;
            n3826RetCod = H00KI3_n3826RetCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3826RetCod", A3826RetCod);
            A3306DisFac = H00KI3_A3306DisFac[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3306DisFac", A3306DisFac);
            A3309DisNumTon = H00KI3_A3309DisNumTon[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3309DisNumTon", A3309DisNumTon);
            A2926DisPla = H00KI3_A2926DisPla[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2926DisPla", A2926DisPla);
            A2832DisKgsLot = H00KI3_A2832DisKgsLot[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2832DisKgsLot", GXutil.ltrimstr( A2832DisKgsLot, 9, 2));
            A2831DisNumLot = H00KI3_A2831DisNumLot[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2831DisNumLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2831DisNumLot), 8, 0));
            A2744DisNumTex2 = H00KI3_A2744DisNumTex2[0] ;
            n2744DisNumTex2 = H00KI3_n2744DisNumTex2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2744DisNumTex2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2744DisNumTex2), 3, 0));
            A2743DisNumTex1 = H00KI3_A2743DisNumTex1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2743DisNumTex1", GXutil.str( A2743DisNumTex1, 1, 0));
            A2742DisCodTex = H00KI3_A2742DisCodTex[0] ;
            n2742DisCodTex = H00KI3_n2742DisCodTex[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2742DisCodTex", A2742DisCodTex);
            A2403DisOpeAnt = H00KI3_A2403DisOpeAnt[0] ;
            n2403DisOpeAnt = H00KI3_n2403DisOpeAnt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2403DisOpeAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2403DisOpeAnt), 8, 0));
            A2402DisManCod = H00KI3_A2402DisManCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2402DisManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2402DisManCod), 4, 0));
            A2310DisCliDes = H00KI3_A2310DisCliDes[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2310DisCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2310DisCliDes), 6, 0));
            A2267DisNumBas = H00KI3_A2267DisNumBas[0] ;
            n2267DisNumBas = H00KI3_n2267DisNumBas[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2267DisNumBas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2267DisNumBas), 4, 0));
            A2009DisTipDis = H00KI3_A2009DisTipDis[0] ;
            n2009DisTipDis = H00KI3_n2009DisTipDis[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2009DisTipDis", A2009DisTipDis);
            A1968DisRes = H00KI3_A1968DisRes[0] ;
            n1968DisRes = H00KI3_n1968DisRes[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1968DisRes", A1968DisRes);
            A1158TipConNom = H00KI3_A1158TipConNom[0] ;
            n1158TipConNom = H00KI3_n1158TipConNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1158TipConNom", A1158TipConNom);
            A1157TipConCod = H00KI3_A1157TipConCod[0] ;
            n1157TipConCod = H00KI3_n1157TipConCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1157TipConCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1157TipConCod), 4, 0));
            A392DisUniMed = H00KI3_A392DisUniMed[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A392DisUniMed", A392DisUniMed);
            A367DisEst = H00KI3_A367DisEst[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A367DisEst", GXutil.str( A367DisEst, 1, 0));
            A374DisNumPie = H00KI3_A374DisNumPie[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
            A375DisNumUni = H00KI3_A375DisNumUni[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A375DisNumUni", GXutil.ltrimstr( A375DisNumUni, 9, 2));
            A2244PartReo = H00KI3_A2244PartReo[0] ;
            n2244PartReo = H00KI3_n2244PartReo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2244PartReo", A2244PartReo);
            A966PartCod = H00KI3_A966PartCod[0] ;
            n966PartCod = H00KI3_n966PartCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A966PartCod", A966PartCod);
            A1122MaqCodDis = H00KI3_A1122MaqCodDis[0] ;
            n1122MaqCodDis = H00KI3_n1122MaqCodDis[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1122MaqCodDis", A1122MaqCodDis);
            A1002DisNumTen = H00KI3_A1002DisNumTen[0] ;
            n1002DisNumTen = H00KI3_n1002DisNumTen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1002DisNumTen", A1002DisNumTen);
            A365DisDes = H00KI3_A365DisDes[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A365DisDes", A365DisDes);
            A1196DisNumCli = H00KI3_A1196DisNumCli[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1196DisNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1196DisNumCli), 6, 0));
            A1195DisNomCli = H00KI3_A1195DisNomCli[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1195DisNomCli", A1195DisNomCli);
            A999DisNMez = H00KI3_A999DisNMez[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A999DisNMez", A999DisNMez);
            A998DisNMtr = H00KI3_A998DisNMtr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A998DisNMtr", A998DisNMtr);
            A340DisArtMat = H00KI3_A340DisArtMat[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A340DisArtMat", A340DisArtMat);
            A352DisArtTip = H00KI3_A352DisArtTip[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A352DisArtTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A352DisArtTip), 4, 0));
            A341DisArtOpe = H00KI3_A341DisArtOpe[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A341DisArtOpe", A341DisArtOpe);
            A349DisArtPu3 = H00KI3_A349DisArtPu3[0] ;
            n349DisArtPu3 = H00KI3_n349DisArtPu3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A349DisArtPu3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A349DisArtPu3), 3, 0));
            A358DisArtUr3 = H00KI3_A358DisArtUr3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A358DisArtUr3", A358DisArtUr3);
            A348DisArtPu2 = H00KI3_A348DisArtPu2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A348DisArtPu2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A348DisArtPu2), 3, 0));
            A357DisArtUr2 = H00KI3_A357DisArtUr2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A357DisArtUr2", A357DisArtUr2);
            A347DisArtPu1 = H00KI3_A347DisArtPu1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A347DisArtPu1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A347DisArtPu1), 3, 0));
            A356DisArtUr1 = H00KI3_A356DisArtUr1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A356DisArtUr1", A356DisArtUr1);
            A346DisArtPt3 = H00KI3_A346DisArtPt3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A346DisArtPt3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A346DisArtPt3), 3, 0));
            A355DisArtTr3 = H00KI3_A355DisArtTr3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A355DisArtTr3", A355DisArtTr3);
            A345DisArtPt2 = H00KI3_A345DisArtPt2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A345DisArtPt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A345DisArtPt2), 3, 0));
            A354DisArtTr2 = H00KI3_A354DisArtTr2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A354DisArtTr2", A354DisArtTr2);
            A344DisArtPt1 = H00KI3_A344DisArtPt1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A344DisArtPt1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A344DisArtPt1), 3, 0));
            A353DisArtTr1 = H00KI3_A353DisArtTr1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A353DisArtTr1", A353DisArtTr1);
            A337DisArtDsc = H00KI3_A337DisArtDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A337DisArtDsc", A337DisArtDsc);
            A370DisFecCli = H00KI3_A370DisFecCli[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A370DisFecCli", localUtil.format(A370DisFecCli, "99/99/99"));
            A371DisFecEnt = H00KI3_A371DisFecEnt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A371DisFecEnt", localUtil.format(A371DisFecEnt, "99/99/99"));
            A369DisFec = H00KI3_A369DisFec[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
            A279CliNom = H00KI3_A279CliNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", A279CliNom);
            A360DisCliNum = H00KI3_A360DisCliNum[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A360DisCliNum", A360DisCliNum);
            A757PriCod = H00KI3_A757PriCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A757PriCod", A757PriCod);
            A1001FindTon = H00KI3_A1001FindTon[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1001FindTon", A1001FindTon);
            A1000FindInt = H00KI3_A1000FindInt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1000FindInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1000FindInt), 2, 0));
            A390DisTipCol = H00KI3_A390DisTipCol[0] ;
            n390DisTipCol = H00KI3_n390DisTipCol[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
            A363DisColNum = H00KI3_A363DisColNum[0] ;
            n363DisColNum = H00KI3_n363DisColNum[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
            A362DisColNom = H00KI3_A362DisColNom[0] ;
            n362DisColNom = H00KI3_n362DisColNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A362DisColNom", A362DisColNom);
            A335DisArtCod = H00KI3_A335DisArtCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A335DisArtCod", A335DisArtCod);
            A252CliCod = H00KI3_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = H00KI3_A279CliNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", A279CliNom);
            A1158TipConNom = H00KI3_A1158TipConNom[0] ;
            n1158TipConNom = H00KI3_n1158TipConNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1158TipConNom", A1158TipConNom);
            A2244PartReo = H00KI3_A2244PartReo[0] ;
            n2244PartReo = H00KI3_n2244PartReo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2244PartReo", A2244PartReo);
            A1001FindTon = H00KI3_A1001FindTon[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1001FindTon", A1001FindTon);
            A1000FindInt = H00KI3_A1000FindInt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1000FindInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1000FindInt), 2, 0));
            GXt_char1 = A475FindCol ;
            GXv_char2[0] = GXt_char1 ;
            new app.pedidos.dis_findcol_validate(remoteHandle, context).execute( A396EmprCod, A252CliCod, A335DisArtCod, A362DisColNom, A363DisColNum, A390DisTipCol, GXv_char2) ;
            nwdpalmacentejidotdispoh_impl.this.GXt_char1 = GXv_char2[0] ;
            A475FindCol = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A475FindCol", A475FindCol);
            /* Execute user event: Load */
            e12KI2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wbKI0( ) ;
      }
   }

   public void send_integrity_lvl_hashesKI2( )
   {
   }

   public void before_start_formulas( )
   {
      AV17Pgmname = "NwDPAlmacenTejidoTDISPOH" ;
      Gx_err = (short)(0) ;
      /* Using cursor H00KI4 */
      pr_default.execute(1, new Object[] {A396EmprCod});
      A407EmprNom = H00KI4_A407EmprNom[0] ;
      n407EmprNom = H00KI4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A407EmprNom", A407EmprNom);
      pr_default.close(1);
      /* Using cursor H00KI6 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A1001FindTon = H00KI6_A1001FindTon[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1001FindTon", A1001FindTon);
         A1000FindInt = H00KI6_A1000FindInt[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1000FindInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1000FindInt), 2, 0));
      }
      else
      {
         A1001FindTon = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1001FindTon", A1001FindTon);
         A1000FindInt = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1000FindInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1000FindInt), 2, 0));
      }
      pr_default.close(2);
      pr_default.close(1);
      pr_default.close(2);
      fix_multi_value_controls( ) ;
   }

   public void strupKI0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11KI2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A757PriCod = ((GXutil.strcmp(httpContext.cgiGet( chkPriCod.getInternalname()), "1")==0) ? "1" : "0") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A757PriCod", A757PriCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A407EmprNom", A407EmprNom);
         A360DisCliNum = httpContext.cgiGet( edtDisCliNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A360DisCliNum", A360DisCliNum);
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", A279CliNom);
         A335DisArtCod = httpContext.cgiGet( edtDisArtCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A335DisArtCod", A335DisArtCod);
         A369DisFec = localUtil.ctod( httpContext.cgiGet( edtDisFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
         A371DisFecEnt = localUtil.ctod( httpContext.cgiGet( edtDisFecEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A371DisFecEnt", localUtil.format(A371DisFecEnt, "99/99/99"));
         A370DisFecCli = localUtil.ctod( httpContext.cgiGet( edtDisFecCli_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A370DisFecCli", localUtil.format(A370DisFecCli, "99/99/99"));
         A337DisArtDsc = httpContext.cgiGet( edtDisArtDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A337DisArtDsc", A337DisArtDsc);
         A353DisArtTr1 = httpContext.cgiGet( edtDisArtTr1_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A353DisArtTr1", A353DisArtTr1);
         A344DisArtPt1 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPt1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A344DisArtPt1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A344DisArtPt1), 3, 0));
         A354DisArtTr2 = httpContext.cgiGet( edtDisArtTr2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A354DisArtTr2", A354DisArtTr2);
         A345DisArtPt2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPt2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A345DisArtPt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A345DisArtPt2), 3, 0));
         A355DisArtTr3 = httpContext.cgiGet( edtDisArtTr3_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A355DisArtTr3", A355DisArtTr3);
         A346DisArtPt3 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPt3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A346DisArtPt3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A346DisArtPt3), 3, 0));
         A356DisArtUr1 = httpContext.cgiGet( edtDisArtUr1_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A356DisArtUr1", A356DisArtUr1);
         A347DisArtPu1 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPu1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A347DisArtPu1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A347DisArtPu1), 3, 0));
         A357DisArtUr2 = httpContext.cgiGet( edtDisArtUr2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A357DisArtUr2", A357DisArtUr2);
         A348DisArtPu2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPu2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A348DisArtPu2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A348DisArtPu2), 3, 0));
         A358DisArtUr3 = httpContext.cgiGet( edtDisArtUr3_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A358DisArtUr3", A358DisArtUr3);
         A349DisArtPu3 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPu3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n349DisArtPu3 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A349DisArtPu3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A349DisArtPu3), 3, 0));
         A341DisArtOpe = GXutil.upper( httpContext.cgiGet( edtDisArtOpe_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A341DisArtOpe", A341DisArtOpe);
         A352DisArtTip = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A352DisArtTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A352DisArtTip), 4, 0));
         A340DisArtMat = httpContext.cgiGet( edtDisArtMat_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A340DisArtMat", A340DisArtMat);
         A998DisNMtr = httpContext.cgiGet( edtDisNMtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A998DisNMtr", A998DisNMtr);
         A999DisNMez = httpContext.cgiGet( edtDisNMez_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A999DisNMez", A999DisNMez);
         A362DisColNom = httpContext.cgiGet( edtDisColNom_Internalname) ;
         n362DisColNom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A362DisColNom", A362DisColNom);
         A363DisColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtDisColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n363DisColNum = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
         A1195DisNomCli = httpContext.cgiGet( edtDisNomCli_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1195DisNomCli", A1195DisNomCli);
         A1196DisNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtDisNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1196DisNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1196DisNumCli), 6, 0));
         A390DisTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n390DisTipCol = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
         A365DisDes = ((GXutil.strcmp(httpContext.cgiGet( chkDisDes.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A365DisDes", A365DisDes);
         A1000FindInt = (byte)(localUtil.ctol( httpContext.cgiGet( edtFindInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1000FindInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1000FindInt), 2, 0));
         A1001FindTon = httpContext.cgiGet( edtFindTon_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1001FindTon", A1001FindTon);
         A1002DisNumTen = httpContext.cgiGet( edtDisNumTen_Internalname) ;
         n1002DisNumTen = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1002DisNumTen", A1002DisNumTen);
         A1122MaqCodDis = httpContext.cgiGet( edtMaqCodDis_Internalname) ;
         n1122MaqCodDis = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1122MaqCodDis", A1122MaqCodDis);
         A475FindCol = httpContext.cgiGet( edtFindCol_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A475FindCol", A475FindCol);
         A966PartCod = httpContext.cgiGet( edtPartCod_Internalname) ;
         n966PartCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A966PartCod", A966PartCod);
         A2244PartReo = httpContext.cgiGet( edtPartReo_Internalname) ;
         n2244PartReo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2244PartReo", A2244PartReo);
         A375DisNumUni = localUtil.ctond( httpContext.cgiGet( edtDisNumUni_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A375DisNumUni", GXutil.ltrimstr( A375DisNumUni, 9, 2));
         A374DisNumPie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisNumPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
         cmbDisEst.setValue( httpContext.cgiGet( cmbDisEst.getInternalname()) );
         A367DisEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbDisEst.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A367DisEst", GXutil.str( A367DisEst, 1, 0));
         A392DisUniMed = GXutil.upper( httpContext.cgiGet( edtDisUniMed_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A392DisUniMed", A392DisUniMed);
         A1157TipConCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipConCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1157TipConCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1157TipConCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1157TipConCod), 4, 0));
         A1158TipConNom = httpContext.cgiGet( edtTipConNom_Internalname) ;
         n1158TipConNom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1158TipConNom", A1158TipConNom);
         A1968DisRes = httpContext.cgiGet( edtDisRes_Internalname) ;
         n1968DisRes = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1968DisRes", A1968DisRes);
         A2009DisTipDis = GXutil.upper( httpContext.cgiGet( edtDisTipDis_Internalname)) ;
         n2009DisTipDis = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2009DisTipDis", A2009DisTipDis);
         A2267DisNumBas = (short)(localUtil.ctol( httpContext.cgiGet( edtDisNumBas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2267DisNumBas = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2267DisNumBas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2267DisNumBas), 4, 0));
         A2310DisCliDes = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCliDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2310DisCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2310DisCliDes), 6, 0));
         A2402DisManCod = (short)(localUtil.ctol( httpContext.cgiGet( edtDisManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2402DisManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2402DisManCod), 4, 0));
         A2403DisOpeAnt = (int)(localUtil.ctol( httpContext.cgiGet( edtDisOpeAnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2403DisOpeAnt = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2403DisOpeAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2403DisOpeAnt), 8, 0));
         A2742DisCodTex = httpContext.cgiGet( edtDisCodTex_Internalname) ;
         n2742DisCodTex = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2742DisCodTex", A2742DisCodTex);
         A2743DisNumTex1 = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisNumTex1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2743DisNumTex1", GXutil.str( A2743DisNumTex1, 1, 0));
         A2744DisNumTex2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisNumTex2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2744DisNumTex2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2744DisNumTex2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2744DisNumTex2), 3, 0));
         A2831DisNumLot = (int)(localUtil.ctol( httpContext.cgiGet( edtDisNumLot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2831DisNumLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2831DisNumLot), 8, 0));
         A2832DisKgsLot = localUtil.ctond( httpContext.cgiGet( edtDisKgsLot_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2832DisKgsLot", GXutil.ltrimstr( A2832DisKgsLot, 9, 2));
         A2926DisPla = ((GXutil.strcmp(httpContext.cgiGet( chkDisPla.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2926DisPla", A2926DisPla);
         A3309DisNumTon = httpContext.cgiGet( edtDisNumTon_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3309DisNumTon", A3309DisNumTon);
         A3306DisFac = ((GXutil.strcmp(httpContext.cgiGet( chkDisFac.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3306DisFac", A3306DisFac);
         A3826RetCod = httpContext.cgiGet( edtRetCod_Internalname) ;
         n3826RetCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3826RetCod", A3826RetCod);
         A2835DisPle2 = httpContext.cgiGet( edtDisPle2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2835DisPle2", A2835DisPle2);
         A3627DisFecLan = localUtil.ctod( httpContext.cgiGet( edtDisFecLan_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n3627DisFecLan = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3627DisFecLan", localUtil.format(A3627DisFecLan, "99/99/99"));
         A338DisArtEnc = ((GXutil.strcmp(httpContext.cgiGet( chkDisArtEnc.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A338DisArtEnc", A338DisArtEnc);
         A336DisArtCor = ((GXutil.strcmp(httpContext.cgiGet( chkDisArtCor.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A336DisArtCor", A336DisArtCor);
         A5366DisAntp = httpContext.cgiGet( edtDisAntp_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5366DisAntp", A5366DisAntp);
         A4470DisCruKgs = localUtil.ctond( httpContext.cgiGet( edtDisCruKgs_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4470DisCruKgs", GXutil.ltrimstr( A4470DisCruKgs, 9, 2));
         A5252DisAcc = ((GXutil.strcmp(httpContext.cgiGet( chkDisAcc.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5252DisAcc", A5252DisAcc);
         A7739DisExp = ((GXutil.strcmp(httpContext.cgiGet( chkDisExp.getInternalname()), "E")==0) ? "E" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7739DisExp", A7739DisExp);
         A5032DisEstTip = ((GXutil.strcmp(httpContext.cgiGet( chkDisEstTip.getInternalname()), "S")==0) ? "S" : "*") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5032DisEstTip", A5032DisEstTip);
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
      e11KI2 ();
      if (returnInSub) return;
   }

   public void e11KI2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV13Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      nwdpalmacentejidotdispoh_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13Station = GXt_char1 ;
      GXv_char2[0] = AV14Emprcod ;
      GXv_char3[0] = AV15Emprnom ;
      GXv_char4[0] = AV16Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char2, GXv_char3, GXv_char4) ;
      nwdpalmacentejidotdispoh_impl.this.AV14Emprcod = GXv_char2[0] ;
      nwdpalmacentejidotdispoh_impl.this.AV15Emprnom = GXv_char3[0] ;
      nwdpalmacentejidotdispoh_impl.this.AV16Usurcod = GXv_char4[0] ;
      GXv_SdtWWPContext5[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV6WWPContext = GXv_SdtWWPContext5[0] ;
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e12KI2( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtEmprNom_Link = formatLink("app.tempparview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","TabCode"})  ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprNom_Internalname, "Link", edtEmprNom_Link, true);
   }

   public void e13KI2( )
   {
      /* 'DoUpdate' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tdispoh", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      /*  Sending Event outputs  */
   }

   public void e14KI2( )
   {
      /* 'DoDelete' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tdispoh", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV7TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV17Pgmname );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( false );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TDISPOH" );
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A361DisCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
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
      paKI2( ) ;
      wsKI2( ) ;
      weKI2( ) ;
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
      sCtrlA396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlA361DisCod = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paKI2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "nwdpalmacentejidotdispoh", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paKI2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A361DisCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A361DisCod != wcpOA361DisCod ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA361DisCod = A361DisCod ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA396EmprCod = httpContext.cgiGet( sPrefix+"A396EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlA396EmprCod) > 0 )
      {
         A396EmprCod = httpContext.cgiGet( sCtrlA396EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      }
      else
      {
         A396EmprCod = httpContext.cgiGet( sPrefix+"A396EmprCod_PARM") ;
      }
      sCtrlA361DisCod = httpContext.cgiGet( sPrefix+"A361DisCod_CTRL") ;
      if ( GXutil.len( sCtrlA361DisCod) > 0 )
      {
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA361DisCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      else
      {
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A361DisCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paKI2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsKI2( ) ;
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
      wsKI2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A396EmprCod_PARM", GXutil.rtrim( A396EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlA396EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A396EmprCod_CTRL", GXutil.rtrim( sCtrlA396EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A361DisCod_PARM", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA361DisCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A361DisCod_CTRL", GXutil.rtrim( sCtrlA361DisCod));
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
      weKI2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682414552992", true, true);
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
      httpContext.AddJavascriptSource("nwdpalmacentejidotdispoh.js", "?202682414552992", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      chkPriCod.setInternalname( sPrefix+"PRICOD" );
      edtDisCod_Internalname = sPrefix+"DISCOD" ;
      edtEmprNom_Internalname = sPrefix+"EMPRNOM" ;
      edtDisCliNum_Internalname = sPrefix+"DISCLINUM" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtDisArtCod_Internalname = sPrefix+"DISARTCOD" ;
      edtDisFec_Internalname = sPrefix+"DISFEC" ;
      edtDisFecEnt_Internalname = sPrefix+"DISFECENT" ;
      edtDisFecCli_Internalname = sPrefix+"DISFECCLI" ;
      edtDisArtDsc_Internalname = sPrefix+"DISARTDSC" ;
      edtDisArtTr1_Internalname = sPrefix+"DISARTTR1" ;
      edtDisArtPt1_Internalname = sPrefix+"DISARTPT1" ;
      edtDisArtTr2_Internalname = sPrefix+"DISARTTR2" ;
      edtDisArtPt2_Internalname = sPrefix+"DISARTPT2" ;
      edtDisArtTr3_Internalname = sPrefix+"DISARTTR3" ;
      edtDisArtPt3_Internalname = sPrefix+"DISARTPT3" ;
      edtDisArtUr1_Internalname = sPrefix+"DISARTUR1" ;
      edtDisArtPu1_Internalname = sPrefix+"DISARTPU1" ;
      edtDisArtUr2_Internalname = sPrefix+"DISARTUR2" ;
      edtDisArtPu2_Internalname = sPrefix+"DISARTPU2" ;
      edtDisArtUr3_Internalname = sPrefix+"DISARTUR3" ;
      edtDisArtPu3_Internalname = sPrefix+"DISARTPU3" ;
      edtDisArtOpe_Internalname = sPrefix+"DISARTOPE" ;
      edtDisArtTip_Internalname = sPrefix+"DISARTTIP" ;
      edtDisArtMat_Internalname = sPrefix+"DISARTMAT" ;
      edtDisNMtr_Internalname = sPrefix+"DISNMTR" ;
      edtDisNMez_Internalname = sPrefix+"DISNMEZ" ;
      edtDisColNom_Internalname = sPrefix+"DISCOLNOM" ;
      edtDisColNum_Internalname = sPrefix+"DISCOLNUM" ;
      edtDisNomCli_Internalname = sPrefix+"DISNOMCLI" ;
      edtDisNumCli_Internalname = sPrefix+"DISNUMCLI" ;
      edtDisTipCol_Internalname = sPrefix+"DISTIPCOL" ;
      chkDisDes.setInternalname( sPrefix+"DISDES" );
      edtFindInt_Internalname = sPrefix+"FINDINT" ;
      edtFindTon_Internalname = sPrefix+"FINDTON" ;
      edtDisNumTen_Internalname = sPrefix+"DISNUMTEN" ;
      edtMaqCodDis_Internalname = sPrefix+"MAQCODDIS" ;
      edtFindCol_Internalname = sPrefix+"FINDCOL" ;
      edtPartCod_Internalname = sPrefix+"PARTCOD" ;
      edtPartReo_Internalname = sPrefix+"PARTREO" ;
      edtDisNumUni_Internalname = sPrefix+"DISNUMUNI" ;
      edtDisNumPie_Internalname = sPrefix+"DISNUMPIE" ;
      cmbDisEst.setInternalname( sPrefix+"DISEST" );
      edtDisUniMed_Internalname = sPrefix+"DISUNIMED" ;
      edtTipConCod_Internalname = sPrefix+"TIPCONCOD" ;
      edtTipConNom_Internalname = sPrefix+"TIPCONNOM" ;
      edtDisRes_Internalname = sPrefix+"DISRES" ;
      edtDisTipDis_Internalname = sPrefix+"DISTIPDIS" ;
      edtDisNumBas_Internalname = sPrefix+"DISNUMBAS" ;
      edtDisCliDes_Internalname = sPrefix+"DISCLIDES" ;
      edtDisManCod_Internalname = sPrefix+"DISMANCOD" ;
      edtDisOpeAnt_Internalname = sPrefix+"DISOPEANT" ;
      edtDisCodTex_Internalname = sPrefix+"DISCODTEX" ;
      edtDisNumTex1_Internalname = sPrefix+"DISNUMTEX1" ;
      edtDisNumTex2_Internalname = sPrefix+"DISNUMTEX2" ;
      edtDisNumLot_Internalname = sPrefix+"DISNUMLOT" ;
      edtDisKgsLot_Internalname = sPrefix+"DISKGSLOT" ;
      chkDisPla.setInternalname( sPrefix+"DISPLA" );
      edtDisNumTon_Internalname = sPrefix+"DISNUMTON" ;
      chkDisFac.setInternalname( sPrefix+"DISFAC" );
      edtRetCod_Internalname = sPrefix+"RETCOD" ;
      edtDisPle2_Internalname = sPrefix+"DISPLE2" ;
      edtDisFecLan_Internalname = sPrefix+"DISFECLAN" ;
      chkDisArtEnc.setInternalname( sPrefix+"DISARTENC" );
      chkDisArtCor.setInternalname( sPrefix+"DISARTCOR" );
      edtDisAntp_Internalname = sPrefix+"DISANTP" ;
      edtDisCruKgs_Internalname = sPrefix+"DISCRUKGS" ;
      chkDisAcc.setInternalname( sPrefix+"DISACC" );
      chkDisExp.setInternalname( sPrefix+"DISEXP" );
      chkDisEstTip.setInternalname( sPrefix+"DISESTTIP" );
      divTransactiondetail_tableattributes_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      divTable_Internalname = sPrefix+"TABLE" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
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
      chkDisEstTip.setEnabled( 0 );
      chkDisExp.setEnabled( 0 );
      chkDisAcc.setEnabled( 0 );
      edtDisCruKgs_Jsonclick = "" ;
      edtDisCruKgs_Enabled = 0 ;
      edtDisAntp_Jsonclick = "" ;
      edtDisAntp_Enabled = 0 ;
      chkDisArtCor.setEnabled( 0 );
      chkDisArtEnc.setEnabled( 0 );
      edtDisFecLan_Jsonclick = "" ;
      edtDisFecLan_Enabled = 0 ;
      edtDisPle2_Jsonclick = "" ;
      edtDisPle2_Enabled = 0 ;
      edtRetCod_Jsonclick = "" ;
      edtRetCod_Enabled = 0 ;
      chkDisFac.setEnabled( 0 );
      edtDisNumTon_Jsonclick = "" ;
      edtDisNumTon_Enabled = 0 ;
      chkDisPla.setEnabled( 0 );
      edtDisKgsLot_Jsonclick = "" ;
      edtDisKgsLot_Enabled = 0 ;
      edtDisNumLot_Jsonclick = "" ;
      edtDisNumLot_Enabled = 0 ;
      edtDisNumTex2_Jsonclick = "" ;
      edtDisNumTex2_Enabled = 0 ;
      edtDisNumTex1_Jsonclick = "" ;
      edtDisNumTex1_Enabled = 0 ;
      edtDisCodTex_Jsonclick = "" ;
      edtDisCodTex_Enabled = 0 ;
      edtDisOpeAnt_Jsonclick = "" ;
      edtDisOpeAnt_Enabled = 0 ;
      edtDisManCod_Jsonclick = "" ;
      edtDisManCod_Enabled = 0 ;
      edtDisCliDes_Jsonclick = "" ;
      edtDisCliDes_Enabled = 0 ;
      edtDisNumBas_Jsonclick = "" ;
      edtDisNumBas_Enabled = 0 ;
      edtDisTipDis_Jsonclick = "" ;
      edtDisTipDis_Enabled = 0 ;
      edtDisRes_Jsonclick = "" ;
      edtDisRes_Enabled = 0 ;
      edtTipConNom_Jsonclick = "" ;
      edtTipConNom_Enabled = 0 ;
      edtTipConCod_Jsonclick = "" ;
      edtTipConCod_Enabled = 0 ;
      edtDisUniMed_Jsonclick = "" ;
      edtDisUniMed_Enabled = 0 ;
      cmbDisEst.setJsonclick( "" );
      cmbDisEst.setEnabled( 0 );
      edtDisNumPie_Jsonclick = "" ;
      edtDisNumPie_Enabled = 0 ;
      edtDisNumUni_Jsonclick = "" ;
      edtDisNumUni_Enabled = 0 ;
      edtPartReo_Jsonclick = "" ;
      edtPartReo_Enabled = 0 ;
      edtPartCod_Jsonclick = "" ;
      edtPartCod_Enabled = 0 ;
      edtFindCol_Jsonclick = "" ;
      edtFindCol_Enabled = 0 ;
      edtMaqCodDis_Jsonclick = "" ;
      edtMaqCodDis_Enabled = 0 ;
      edtDisNumTen_Jsonclick = "" ;
      edtDisNumTen_Enabled = 0 ;
      edtFindTon_Jsonclick = "" ;
      edtFindTon_Enabled = 0 ;
      edtFindInt_Jsonclick = "" ;
      edtFindInt_Enabled = 0 ;
      chkDisDes.setEnabled( 0 );
      edtDisTipCol_Jsonclick = "" ;
      edtDisTipCol_Enabled = 0 ;
      edtDisNumCli_Jsonclick = "" ;
      edtDisNumCli_Enabled = 0 ;
      edtDisNomCli_Jsonclick = "" ;
      edtDisNomCli_Enabled = 0 ;
      edtDisColNum_Jsonclick = "" ;
      edtDisColNum_Enabled = 0 ;
      edtDisColNom_Jsonclick = "" ;
      edtDisColNom_Enabled = 0 ;
      edtDisNMez_Jsonclick = "" ;
      edtDisNMez_Enabled = 0 ;
      edtDisNMtr_Jsonclick = "" ;
      edtDisNMtr_Enabled = 0 ;
      edtDisArtMat_Jsonclick = "" ;
      edtDisArtMat_Enabled = 0 ;
      edtDisArtTip_Jsonclick = "" ;
      edtDisArtTip_Enabled = 0 ;
      edtDisArtOpe_Jsonclick = "" ;
      edtDisArtOpe_Enabled = 0 ;
      edtDisArtPu3_Jsonclick = "" ;
      edtDisArtPu3_Enabled = 0 ;
      edtDisArtUr3_Jsonclick = "" ;
      edtDisArtUr3_Enabled = 0 ;
      edtDisArtPu2_Jsonclick = "" ;
      edtDisArtPu2_Enabled = 0 ;
      edtDisArtUr2_Jsonclick = "" ;
      edtDisArtUr2_Enabled = 0 ;
      edtDisArtPu1_Jsonclick = "" ;
      edtDisArtPu1_Enabled = 0 ;
      edtDisArtUr1_Jsonclick = "" ;
      edtDisArtUr1_Enabled = 0 ;
      edtDisArtPt3_Jsonclick = "" ;
      edtDisArtPt3_Enabled = 0 ;
      edtDisArtTr3_Jsonclick = "" ;
      edtDisArtTr3_Enabled = 0 ;
      edtDisArtPt2_Jsonclick = "" ;
      edtDisArtPt2_Enabled = 0 ;
      edtDisArtTr2_Jsonclick = "" ;
      edtDisArtTr2_Enabled = 0 ;
      edtDisArtPt1_Jsonclick = "" ;
      edtDisArtPt1_Enabled = 0 ;
      edtDisArtTr1_Jsonclick = "" ;
      edtDisArtTr1_Enabled = 0 ;
      edtDisArtDsc_Jsonclick = "" ;
      edtDisArtDsc_Enabled = 0 ;
      edtDisFecCli_Jsonclick = "" ;
      edtDisFecCli_Enabled = 0 ;
      edtDisFecEnt_Jsonclick = "" ;
      edtDisFecEnt_Enabled = 0 ;
      edtDisFec_Jsonclick = "" ;
      edtDisFec_Enabled = 0 ;
      edtDisArtCod_Jsonclick = "" ;
      edtDisArtCod_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtDisCliNum_Jsonclick = "" ;
      edtDisCliNum_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Link = "" ;
      edtEmprNom_Enabled = 0 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Enabled = 0 ;
      chkPriCod.setEnabled( 0 );
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 0 ;
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
      chkPriCod.setName( "PRICOD" );
      chkPriCod.setWebtags( "" );
      chkPriCod.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkPriCod.getInternalname(), "TitleCaption", chkPriCod.getCaption(), true);
      chkPriCod.setCheckedValue( "0" );
      chkDisDes.setName( "DISDES" );
      chkDisDes.setWebtags( "" );
      chkDisDes.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisDes.getInternalname(), "TitleCaption", chkDisDes.getCaption(), true);
      chkDisDes.setCheckedValue( "N" );
      cmbDisEst.setName( "DISEST" );
      cmbDisEst.setWebtags( "" );
      cmbDisEst.addItem("1", httpContext.getMessage( "En Pedido", ""), (short)(0));
      cmbDisEst.addItem("3", httpContext.getMessage( "En Produccion", ""), (short)(0));
      if ( cmbDisEst.getItemCount() > 0 )
      {
      }
      chkDisPla.setName( "DISPLA" );
      chkDisPla.setWebtags( "" );
      chkDisPla.setCaption( httpContext.getMessage( "¿Muestras?", "") );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisPla.getInternalname(), "TitleCaption", chkDisPla.getCaption(), true);
      chkDisPla.setCheckedValue( "N" );
      chkDisFac.setName( "DISFAC" );
      chkDisFac.setWebtags( "" );
      chkDisFac.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisFac.getInternalname(), "TitleCaption", chkDisFac.getCaption(), true);
      chkDisFac.setCheckedValue( "N" );
      chkDisArtEnc.setName( "DISARTENC" );
      chkDisArtEnc.setWebtags( "" );
      chkDisArtEnc.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisArtEnc.getInternalname(), "TitleCaption", chkDisArtEnc.getCaption(), true);
      chkDisArtEnc.setCheckedValue( "N" );
      chkDisArtCor.setName( "DISARTCOR" );
      chkDisArtCor.setWebtags( "" );
      chkDisArtCor.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisArtCor.getInternalname(), "TitleCaption", chkDisArtCor.getCaption(), true);
      chkDisArtCor.setCheckedValue( "N" );
      chkDisAcc.setName( "DISACC" );
      chkDisAcc.setWebtags( "" );
      chkDisAcc.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisAcc.getInternalname(), "TitleCaption", chkDisAcc.getCaption(), true);
      chkDisAcc.setCheckedValue( "N" );
      chkDisExp.setName( "DISEXP" );
      chkDisExp.setWebtags( "" );
      chkDisExp.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisExp.getInternalname(), "TitleCaption", chkDisExp.getCaption(), true);
      chkDisExp.setCheckedValue( "N" );
      chkDisEstTip.setName( "DISESTTIP" );
      chkDisEstTip.setWebtags( "" );
      chkDisEstTip.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisEstTip.getInternalname(), "TitleCaption", chkDisEstTip.getCaption(), true);
      chkDisEstTip.setCheckedValue( "*" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A7739DisExp',fld:'DISEXP',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e13KI2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOUPDATE'",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DODELETE'","{handler:'e14KI2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DODELETE'",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[]");
      setEventMetadata("VALID_DISCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_DISARTCOD","{handler:'valid_Disartcod',iparms:[]");
      setEventMetadata("VALID_DISARTCOD",",oparms:[]}");
      setEventMetadata("VALID_DISCOLNOM","{handler:'valid_Discolnom',iparms:[]");
      setEventMetadata("VALID_DISCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_DISCOLNUM","{handler:'valid_Discolnum',iparms:[]");
      setEventMetadata("VALID_DISCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_DISTIPCOL","{handler:'valid_Distipcol',iparms:[]");
      setEventMetadata("VALID_DISTIPCOL",",oparms:[]}");
      setEventMetadata("VALID_PARTCOD","{handler:'valid_Partcod',iparms:[]");
      setEventMetadata("VALID_PARTCOD",",oparms:[]}");
      setEventMetadata("VALID_TIPCONCOD","{handler:'valid_Tipconcod',iparms:[]");
      setEventMetadata("VALID_TIPCONCOD",",oparms:[]}");
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      A757PriCod = "" ;
      A407EmprNom = "" ;
      A360DisCliNum = "" ;
      A279CliNom = "" ;
      A335DisArtCod = "" ;
      A369DisFec = GXutil.nullDate() ;
      A371DisFecEnt = GXutil.nullDate() ;
      A370DisFecCli = GXutil.nullDate() ;
      A337DisArtDsc = "" ;
      A353DisArtTr1 = "" ;
      A354DisArtTr2 = "" ;
      A355DisArtTr3 = "" ;
      A356DisArtUr1 = "" ;
      A357DisArtUr2 = "" ;
      A358DisArtUr3 = "" ;
      A341DisArtOpe = "" ;
      A340DisArtMat = "" ;
      A998DisNMtr = "" ;
      A999DisNMez = "" ;
      A362DisColNom = "" ;
      A1195DisNomCli = "" ;
      A365DisDes = "" ;
      A1001FindTon = "" ;
      A1002DisNumTen = "" ;
      A1122MaqCodDis = "" ;
      A475FindCol = "" ;
      A966PartCod = "" ;
      A2244PartReo = "" ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A392DisUniMed = "" ;
      A1158TipConNom = "" ;
      A1968DisRes = "" ;
      A2009DisTipDis = "" ;
      A2742DisCodTex = "" ;
      A2832DisKgsLot = DecimalUtil.ZERO ;
      A2926DisPla = "" ;
      A3309DisNumTon = "" ;
      A3306DisFac = "" ;
      A3826RetCod = "" ;
      A2835DisPle2 = "" ;
      A3627DisFecLan = GXutil.nullDate() ;
      A338DisArtEnc = "" ;
      A336DisArtCor = "" ;
      A5366DisAntp = "" ;
      A4470DisCruKgs = DecimalUtil.ZERO ;
      A5252DisAcc = "" ;
      A7739DisExp = "" ;
      A5032DisEstTip = "" ;
      TempTags = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Pgmname = "" ;
      scmdbuf = "" ;
      H00KI3_A361DisCod = new int[1] ;
      H00KI3_A5032DisEstTip = new String[] {""} ;
      H00KI3_A7739DisExp = new String[] {""} ;
      H00KI3_A5252DisAcc = new String[] {""} ;
      H00KI3_A4470DisCruKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00KI3_A5366DisAntp = new String[] {""} ;
      H00KI3_A336DisArtCor = new String[] {""} ;
      H00KI3_A338DisArtEnc = new String[] {""} ;
      H00KI3_A3627DisFecLan = new java.util.Date[] {GXutil.nullDate()} ;
      H00KI3_n3627DisFecLan = new boolean[] {false} ;
      H00KI3_A2835DisPle2 = new String[] {""} ;
      H00KI3_A3826RetCod = new String[] {""} ;
      H00KI3_n3826RetCod = new boolean[] {false} ;
      H00KI3_A3306DisFac = new String[] {""} ;
      H00KI3_A3309DisNumTon = new String[] {""} ;
      H00KI3_A2926DisPla = new String[] {""} ;
      H00KI3_A2832DisKgsLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00KI3_A2831DisNumLot = new int[1] ;
      H00KI3_A2744DisNumTex2 = new short[1] ;
      H00KI3_n2744DisNumTex2 = new boolean[] {false} ;
      H00KI3_A2743DisNumTex1 = new byte[1] ;
      H00KI3_A2742DisCodTex = new String[] {""} ;
      H00KI3_n2742DisCodTex = new boolean[] {false} ;
      H00KI3_A2403DisOpeAnt = new int[1] ;
      H00KI3_n2403DisOpeAnt = new boolean[] {false} ;
      H00KI3_A2402DisManCod = new short[1] ;
      H00KI3_A2310DisCliDes = new int[1] ;
      H00KI3_A2267DisNumBas = new short[1] ;
      H00KI3_n2267DisNumBas = new boolean[] {false} ;
      H00KI3_A2009DisTipDis = new String[] {""} ;
      H00KI3_n2009DisTipDis = new boolean[] {false} ;
      H00KI3_A1968DisRes = new String[] {""} ;
      H00KI3_n1968DisRes = new boolean[] {false} ;
      H00KI3_A1158TipConNom = new String[] {""} ;
      H00KI3_n1158TipConNom = new boolean[] {false} ;
      H00KI3_A1157TipConCod = new short[1] ;
      H00KI3_n1157TipConCod = new boolean[] {false} ;
      H00KI3_A392DisUniMed = new String[] {""} ;
      H00KI3_A367DisEst = new byte[1] ;
      H00KI3_A374DisNumPie = new short[1] ;
      H00KI3_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00KI3_A2244PartReo = new String[] {""} ;
      H00KI3_n2244PartReo = new boolean[] {false} ;
      H00KI3_A966PartCod = new String[] {""} ;
      H00KI3_n966PartCod = new boolean[] {false} ;
      H00KI3_A1122MaqCodDis = new String[] {""} ;
      H00KI3_n1122MaqCodDis = new boolean[] {false} ;
      H00KI3_A1002DisNumTen = new String[] {""} ;
      H00KI3_n1002DisNumTen = new boolean[] {false} ;
      H00KI3_A365DisDes = new String[] {""} ;
      H00KI3_A1196DisNumCli = new int[1] ;
      H00KI3_A1195DisNomCli = new String[] {""} ;
      H00KI3_A999DisNMez = new String[] {""} ;
      H00KI3_A998DisNMtr = new String[] {""} ;
      H00KI3_A340DisArtMat = new String[] {""} ;
      H00KI3_A352DisArtTip = new short[1] ;
      H00KI3_A341DisArtOpe = new String[] {""} ;
      H00KI3_A349DisArtPu3 = new short[1] ;
      H00KI3_n349DisArtPu3 = new boolean[] {false} ;
      H00KI3_A358DisArtUr3 = new String[] {""} ;
      H00KI3_A348DisArtPu2 = new short[1] ;
      H00KI3_A357DisArtUr2 = new String[] {""} ;
      H00KI3_A347DisArtPu1 = new short[1] ;
      H00KI3_A356DisArtUr1 = new String[] {""} ;
      H00KI3_A346DisArtPt3 = new short[1] ;
      H00KI3_A355DisArtTr3 = new String[] {""} ;
      H00KI3_A345DisArtPt2 = new short[1] ;
      H00KI3_A354DisArtTr2 = new String[] {""} ;
      H00KI3_A344DisArtPt1 = new short[1] ;
      H00KI3_A353DisArtTr1 = new String[] {""} ;
      H00KI3_A337DisArtDsc = new String[] {""} ;
      H00KI3_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H00KI3_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      H00KI3_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00KI3_A279CliNom = new String[] {""} ;
      H00KI3_A360DisCliNum = new String[] {""} ;
      H00KI3_A407EmprNom = new String[] {""} ;
      H00KI3_n407EmprNom = new boolean[] {false} ;
      H00KI3_A757PriCod = new String[] {""} ;
      H00KI3_A396EmprCod = new String[] {""} ;
      H00KI3_A1001FindTon = new String[] {""} ;
      H00KI3_A1000FindInt = new byte[1] ;
      H00KI3_A390DisTipCol = new byte[1] ;
      H00KI3_n390DisTipCol = new boolean[] {false} ;
      H00KI3_A363DisColNum = new int[1] ;
      H00KI3_n363DisColNum = new boolean[] {false} ;
      H00KI3_A362DisColNom = new String[] {""} ;
      H00KI3_n362DisColNom = new boolean[] {false} ;
      H00KI3_A335DisArtCod = new String[] {""} ;
      H00KI3_A252CliCod = new int[1] ;
      H00KI4_A407EmprNom = new String[] {""} ;
      H00KI4_n407EmprNom = new boolean[] {false} ;
      H00KI6_A1001FindTon = new String[] {""} ;
      H00KI6_A1000FindInt = new byte[1] ;
      AV13Station = "" ;
      GXt_char1 = "" ;
      AV14Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV15Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV16Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV7TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      AV9Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA361DisCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.nwdpalmacentejidotdispoh__default(),
         new Object[] {
             new Object[] {
            H00KI3_A361DisCod, H00KI3_A5032DisEstTip, H00KI3_A7739DisExp, H00KI3_A5252DisAcc, H00KI3_A4470DisCruKgs, H00KI3_A5366DisAntp, H00KI3_A336DisArtCor, H00KI3_A338DisArtEnc, H00KI3_A3627DisFecLan, H00KI3_n3627DisFecLan,
            H00KI3_A2835DisPle2, H00KI3_A3826RetCod, H00KI3_n3826RetCod, H00KI3_A3306DisFac, H00KI3_A3309DisNumTon, H00KI3_A2926DisPla, H00KI3_A2832DisKgsLot, H00KI3_A2831DisNumLot, H00KI3_A2744DisNumTex2, H00KI3_n2744DisNumTex2,
            H00KI3_A2743DisNumTex1, H00KI3_A2742DisCodTex, H00KI3_n2742DisCodTex, H00KI3_A2403DisOpeAnt, H00KI3_n2403DisOpeAnt, H00KI3_A2402DisManCod, H00KI3_A2310DisCliDes, H00KI3_A2267DisNumBas, H00KI3_n2267DisNumBas, H00KI3_A2009DisTipDis,
            H00KI3_n2009DisTipDis, H00KI3_A1968DisRes, H00KI3_n1968DisRes, H00KI3_A1158TipConNom, H00KI3_n1158TipConNom, H00KI3_A1157TipConCod, H00KI3_n1157TipConCod, H00KI3_A392DisUniMed, H00KI3_A367DisEst, H00KI3_A374DisNumPie,
            H00KI3_A375DisNumUni, H00KI3_A2244PartReo, H00KI3_n2244PartReo, H00KI3_A966PartCod, H00KI3_n966PartCod, H00KI3_A1122MaqCodDis, H00KI3_n1122MaqCodDis, H00KI3_A1002DisNumTen, H00KI3_n1002DisNumTen, H00KI3_A365DisDes,
            H00KI3_A1196DisNumCli, H00KI3_A1195DisNomCli, H00KI3_A999DisNMez, H00KI3_A998DisNMtr, H00KI3_A340DisArtMat, H00KI3_A352DisArtTip, H00KI3_A341DisArtOpe, H00KI3_A349DisArtPu3, H00KI3_n349DisArtPu3, H00KI3_A358DisArtUr3,
            H00KI3_A348DisArtPu2, H00KI3_A357DisArtUr2, H00KI3_A347DisArtPu1, H00KI3_A356DisArtUr1, H00KI3_A346DisArtPt3, H00KI3_A355DisArtTr3, H00KI3_A345DisArtPt2, H00KI3_A354DisArtTr2, H00KI3_A344DisArtPt1, H00KI3_A353DisArtTr1,
            H00KI3_A337DisArtDsc, H00KI3_A370DisFecCli, H00KI3_A371DisFecEnt, H00KI3_A369DisFec, H00KI3_A279CliNom, H00KI3_A360DisCliNum, H00KI3_A407EmprNom, H00KI3_n407EmprNom, H00KI3_A757PriCod, H00KI3_A396EmprCod,
            H00KI3_A1001FindTon, H00KI3_A1000FindInt, H00KI3_A390DisTipCol, H00KI3_n390DisTipCol, H00KI3_A363DisColNum, H00KI3_n363DisColNum, H00KI3_A362DisColNom, H00KI3_n362DisColNom, H00KI3_A335DisArtCod, H00KI3_A252CliCod
            }
            , new Object[] {
            H00KI4_A407EmprNom, H00KI4_n407EmprNom
            }
            , new Object[] {
            H00KI6_A1001FindTon, H00KI6_A1000FindInt
            }
         }
      );
      AV17Pgmname = "NwDPAlmacenTejidoTDISPOH" ;
      /* GeneXus formulas. */
      AV17Pgmname = "NwDPAlmacenTejidoTDISPOH" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A390DisTipCol ;
   private byte A1000FindInt ;
   private byte A367DisEst ;
   private byte A2743DisNumTex1 ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short A344DisArtPt1 ;
   private short A345DisArtPt2 ;
   private short A346DisArtPt3 ;
   private short A347DisArtPu1 ;
   private short A348DisArtPu2 ;
   private short A349DisArtPu3 ;
   private short A352DisArtTip ;
   private short A374DisNumPie ;
   private short A1157TipConCod ;
   private short A2267DisNumBas ;
   private short A2402DisManCod ;
   private short A2744DisNumTex2 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOA361DisCod ;
   private int A361DisCod ;
   private int edtEmprCod_Enabled ;
   private int edtDisCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtDisCliNum_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtDisArtCod_Enabled ;
   private int edtDisFec_Enabled ;
   private int edtDisFecEnt_Enabled ;
   private int edtDisFecCli_Enabled ;
   private int edtDisArtDsc_Enabled ;
   private int edtDisArtTr1_Enabled ;
   private int edtDisArtPt1_Enabled ;
   private int edtDisArtTr2_Enabled ;
   private int edtDisArtPt2_Enabled ;
   private int edtDisArtTr3_Enabled ;
   private int edtDisArtPt3_Enabled ;
   private int edtDisArtUr1_Enabled ;
   private int edtDisArtPu1_Enabled ;
   private int edtDisArtUr2_Enabled ;
   private int edtDisArtPu2_Enabled ;
   private int edtDisArtUr3_Enabled ;
   private int edtDisArtPu3_Enabled ;
   private int edtDisArtOpe_Enabled ;
   private int edtDisArtTip_Enabled ;
   private int edtDisArtMat_Enabled ;
   private int edtDisNMtr_Enabled ;
   private int edtDisNMez_Enabled ;
   private int edtDisColNom_Enabled ;
   private int A363DisColNum ;
   private int edtDisColNum_Enabled ;
   private int edtDisNomCli_Enabled ;
   private int A1196DisNumCli ;
   private int edtDisNumCli_Enabled ;
   private int edtDisTipCol_Enabled ;
   private int edtFindInt_Enabled ;
   private int edtFindTon_Enabled ;
   private int edtDisNumTen_Enabled ;
   private int edtMaqCodDis_Enabled ;
   private int edtFindCol_Enabled ;
   private int edtPartCod_Enabled ;
   private int edtPartReo_Enabled ;
   private int edtDisNumUni_Enabled ;
   private int edtDisNumPie_Enabled ;
   private int edtDisUniMed_Enabled ;
   private int edtTipConCod_Enabled ;
   private int edtTipConNom_Enabled ;
   private int edtDisRes_Enabled ;
   private int edtDisTipDis_Enabled ;
   private int edtDisNumBas_Enabled ;
   private int A2310DisCliDes ;
   private int edtDisCliDes_Enabled ;
   private int edtDisManCod_Enabled ;
   private int A2403DisOpeAnt ;
   private int edtDisOpeAnt_Enabled ;
   private int edtDisCodTex_Enabled ;
   private int edtDisNumTex1_Enabled ;
   private int edtDisNumTex2_Enabled ;
   private int A2831DisNumLot ;
   private int edtDisNumLot_Enabled ;
   private int edtDisKgsLot_Enabled ;
   private int edtDisNumTon_Enabled ;
   private int edtRetCod_Enabled ;
   private int edtDisPle2_Enabled ;
   private int edtDisFecLan_Enabled ;
   private int edtDisAntp_Enabled ;
   private int edtDisCruKgs_Enabled ;
   private int idxLst ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal A2832DisKgsLot ;
   private java.math.BigDecimal A4470DisCruKgs ;
   private String wcpOA396EmprCod ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String A396EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTable_Internalname ;
   private String divTransactiondetail_tableattributes_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String A757PriCod ;
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Link ;
   private String edtEmprNom_Jsonclick ;
   private String edtDisCliNum_Internalname ;
   private String A360DisCliNum ;
   private String edtDisCliNum_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtDisArtCod_Internalname ;
   private String A335DisArtCod ;
   private String edtDisArtCod_Jsonclick ;
   private String edtDisFec_Internalname ;
   private String edtDisFec_Jsonclick ;
   private String edtDisFecEnt_Internalname ;
   private String edtDisFecEnt_Jsonclick ;
   private String edtDisFecCli_Internalname ;
   private String edtDisFecCli_Jsonclick ;
   private String edtDisArtDsc_Internalname ;
   private String A337DisArtDsc ;
   private String edtDisArtDsc_Jsonclick ;
   private String edtDisArtTr1_Internalname ;
   private String A353DisArtTr1 ;
   private String edtDisArtTr1_Jsonclick ;
   private String edtDisArtPt1_Internalname ;
   private String edtDisArtPt1_Jsonclick ;
   private String edtDisArtTr2_Internalname ;
   private String A354DisArtTr2 ;
   private String edtDisArtTr2_Jsonclick ;
   private String edtDisArtPt2_Internalname ;
   private String edtDisArtPt2_Jsonclick ;
   private String edtDisArtTr3_Internalname ;
   private String A355DisArtTr3 ;
   private String edtDisArtTr3_Jsonclick ;
   private String edtDisArtPt3_Internalname ;
   private String edtDisArtPt3_Jsonclick ;
   private String edtDisArtUr1_Internalname ;
   private String A356DisArtUr1 ;
   private String edtDisArtUr1_Jsonclick ;
   private String edtDisArtPu1_Internalname ;
   private String edtDisArtPu1_Jsonclick ;
   private String edtDisArtUr2_Internalname ;
   private String A357DisArtUr2 ;
   private String edtDisArtUr2_Jsonclick ;
   private String edtDisArtPu2_Internalname ;
   private String edtDisArtPu2_Jsonclick ;
   private String edtDisArtUr3_Internalname ;
   private String A358DisArtUr3 ;
   private String edtDisArtUr3_Jsonclick ;
   private String edtDisArtPu3_Internalname ;
   private String edtDisArtPu3_Jsonclick ;
   private String edtDisArtOpe_Internalname ;
   private String A341DisArtOpe ;
   private String edtDisArtOpe_Jsonclick ;
   private String edtDisArtTip_Internalname ;
   private String edtDisArtTip_Jsonclick ;
   private String edtDisArtMat_Internalname ;
   private String A340DisArtMat ;
   private String edtDisArtMat_Jsonclick ;
   private String edtDisNMtr_Internalname ;
   private String A998DisNMtr ;
   private String edtDisNMtr_Jsonclick ;
   private String edtDisNMez_Internalname ;
   private String A999DisNMez ;
   private String edtDisNMez_Jsonclick ;
   private String edtDisColNom_Internalname ;
   private String A362DisColNom ;
   private String edtDisColNom_Jsonclick ;
   private String edtDisColNum_Internalname ;
   private String edtDisColNum_Jsonclick ;
   private String edtDisNomCli_Internalname ;
   private String A1195DisNomCli ;
   private String edtDisNomCli_Jsonclick ;
   private String edtDisNumCli_Internalname ;
   private String edtDisNumCli_Jsonclick ;
   private String edtDisTipCol_Internalname ;
   private String edtDisTipCol_Jsonclick ;
   private String A365DisDes ;
   private String edtFindInt_Internalname ;
   private String edtFindInt_Jsonclick ;
   private String edtFindTon_Internalname ;
   private String A1001FindTon ;
   private String edtFindTon_Jsonclick ;
   private String edtDisNumTen_Internalname ;
   private String A1002DisNumTen ;
   private String edtDisNumTen_Jsonclick ;
   private String edtMaqCodDis_Internalname ;
   private String A1122MaqCodDis ;
   private String edtMaqCodDis_Jsonclick ;
   private String edtFindCol_Internalname ;
   private String A475FindCol ;
   private String edtFindCol_Jsonclick ;
   private String edtPartCod_Internalname ;
   private String A966PartCod ;
   private String edtPartCod_Jsonclick ;
   private String edtPartReo_Internalname ;
   private String A2244PartReo ;
   private String edtPartReo_Jsonclick ;
   private String edtDisNumUni_Internalname ;
   private String edtDisNumUni_Jsonclick ;
   private String edtDisNumPie_Internalname ;
   private String edtDisNumPie_Jsonclick ;
   private String edtDisUniMed_Internalname ;
   private String A392DisUniMed ;
   private String edtDisUniMed_Jsonclick ;
   private String edtTipConCod_Internalname ;
   private String edtTipConCod_Jsonclick ;
   private String edtTipConNom_Internalname ;
   private String A1158TipConNom ;
   private String edtTipConNom_Jsonclick ;
   private String edtDisRes_Internalname ;
   private String A1968DisRes ;
   private String edtDisRes_Jsonclick ;
   private String edtDisTipDis_Internalname ;
   private String A2009DisTipDis ;
   private String edtDisTipDis_Jsonclick ;
   private String edtDisNumBas_Internalname ;
   private String edtDisNumBas_Jsonclick ;
   private String edtDisCliDes_Internalname ;
   private String edtDisCliDes_Jsonclick ;
   private String edtDisManCod_Internalname ;
   private String edtDisManCod_Jsonclick ;
   private String edtDisOpeAnt_Internalname ;
   private String edtDisOpeAnt_Jsonclick ;
   private String edtDisCodTex_Internalname ;
   private String A2742DisCodTex ;
   private String edtDisCodTex_Jsonclick ;
   private String edtDisNumTex1_Internalname ;
   private String edtDisNumTex1_Jsonclick ;
   private String edtDisNumTex2_Internalname ;
   private String edtDisNumTex2_Jsonclick ;
   private String edtDisNumLot_Internalname ;
   private String edtDisNumLot_Jsonclick ;
   private String edtDisKgsLot_Internalname ;
   private String edtDisKgsLot_Jsonclick ;
   private String A2926DisPla ;
   private String edtDisNumTon_Internalname ;
   private String A3309DisNumTon ;
   private String edtDisNumTon_Jsonclick ;
   private String A3306DisFac ;
   private String edtRetCod_Internalname ;
   private String A3826RetCod ;
   private String edtRetCod_Jsonclick ;
   private String edtDisPle2_Internalname ;
   private String A2835DisPle2 ;
   private String edtDisPle2_Jsonclick ;
   private String edtDisFecLan_Internalname ;
   private String edtDisFecLan_Jsonclick ;
   private String A338DisArtEnc ;
   private String A336DisArtCor ;
   private String edtDisAntp_Internalname ;
   private String A5366DisAntp ;
   private String edtDisAntp_Jsonclick ;
   private String edtDisCruKgs_Internalname ;
   private String edtDisCruKgs_Jsonclick ;
   private String A5252DisAcc ;
   private String A7739DisExp ;
   private String A5032DisEstTip ;
   private String TempTags ;
   private String bttBtnupdate_Internalname ;
   private String bttBtnupdate_Jsonclick ;
   private String bttBtndelete_Internalname ;
   private String bttBtndelete_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV17Pgmname ;
   private String scmdbuf ;
   private String AV13Station ;
   private String GXt_char1 ;
   private String AV14Emprcod ;
   private String GXv_char2[] ;
   private String AV15Emprnom ;
   private String GXv_char3[] ;
   private String AV16Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA361DisCod ;
   private java.util.Date A369DisFec ;
   private java.util.Date A371DisFecEnt ;
   private java.util.Date A370DisFecCli ;
   private java.util.Date A3627DisFecLan ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n3627DisFecLan ;
   private boolean n3826RetCod ;
   private boolean n2744DisNumTex2 ;
   private boolean n2742DisCodTex ;
   private boolean n2403DisOpeAnt ;
   private boolean n2267DisNumBas ;
   private boolean n2009DisTipDis ;
   private boolean n1968DisRes ;
   private boolean n1158TipConNom ;
   private boolean n1157TipConCod ;
   private boolean n2244PartReo ;
   private boolean n966PartCod ;
   private boolean n1122MaqCodDis ;
   private boolean n1002DisNumTen ;
   private boolean n349DisArtPu3 ;
   private boolean n390DisTipCol ;
   private boolean n363DisColNum ;
   private boolean n362DisColNom ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private ICheckbox chkPriCod ;
   private ICheckbox chkDisDes ;
   private HTMLChoice cmbDisEst ;
   private ICheckbox chkDisPla ;
   private ICheckbox chkDisFac ;
   private ICheckbox chkDisArtEnc ;
   private ICheckbox chkDisArtCor ;
   private ICheckbox chkDisAcc ;
   private ICheckbox chkDisExp ;
   private ICheckbox chkDisEstTip ;
   private IDataStoreProvider pr_default ;
   private int[] H00KI3_A361DisCod ;
   private String[] H00KI3_A5032DisEstTip ;
   private String[] H00KI3_A7739DisExp ;
   private String[] H00KI3_A5252DisAcc ;
   private java.math.BigDecimal[] H00KI3_A4470DisCruKgs ;
   private String[] H00KI3_A5366DisAntp ;
   private String[] H00KI3_A336DisArtCor ;
   private String[] H00KI3_A338DisArtEnc ;
   private java.util.Date[] H00KI3_A3627DisFecLan ;
   private boolean[] H00KI3_n3627DisFecLan ;
   private String[] H00KI3_A2835DisPle2 ;
   private String[] H00KI3_A3826RetCod ;
   private boolean[] H00KI3_n3826RetCod ;
   private String[] H00KI3_A3306DisFac ;
   private String[] H00KI3_A3309DisNumTon ;
   private String[] H00KI3_A2926DisPla ;
   private java.math.BigDecimal[] H00KI3_A2832DisKgsLot ;
   private int[] H00KI3_A2831DisNumLot ;
   private short[] H00KI3_A2744DisNumTex2 ;
   private boolean[] H00KI3_n2744DisNumTex2 ;
   private byte[] H00KI3_A2743DisNumTex1 ;
   private String[] H00KI3_A2742DisCodTex ;
   private boolean[] H00KI3_n2742DisCodTex ;
   private int[] H00KI3_A2403DisOpeAnt ;
   private boolean[] H00KI3_n2403DisOpeAnt ;
   private short[] H00KI3_A2402DisManCod ;
   private int[] H00KI3_A2310DisCliDes ;
   private short[] H00KI3_A2267DisNumBas ;
   private boolean[] H00KI3_n2267DisNumBas ;
   private String[] H00KI3_A2009DisTipDis ;
   private boolean[] H00KI3_n2009DisTipDis ;
   private String[] H00KI3_A1968DisRes ;
   private boolean[] H00KI3_n1968DisRes ;
   private String[] H00KI3_A1158TipConNom ;
   private boolean[] H00KI3_n1158TipConNom ;
   private short[] H00KI3_A1157TipConCod ;
   private boolean[] H00KI3_n1157TipConCod ;
   private String[] H00KI3_A392DisUniMed ;
   private byte[] H00KI3_A367DisEst ;
   private short[] H00KI3_A374DisNumPie ;
   private java.math.BigDecimal[] H00KI3_A375DisNumUni ;
   private String[] H00KI3_A2244PartReo ;
   private boolean[] H00KI3_n2244PartReo ;
   private String[] H00KI3_A966PartCod ;
   private boolean[] H00KI3_n966PartCod ;
   private String[] H00KI3_A1122MaqCodDis ;
   private boolean[] H00KI3_n1122MaqCodDis ;
   private String[] H00KI3_A1002DisNumTen ;
   private boolean[] H00KI3_n1002DisNumTen ;
   private String[] H00KI3_A365DisDes ;
   private int[] H00KI3_A1196DisNumCli ;
   private String[] H00KI3_A1195DisNomCli ;
   private String[] H00KI3_A999DisNMez ;
   private String[] H00KI3_A998DisNMtr ;
   private String[] H00KI3_A340DisArtMat ;
   private short[] H00KI3_A352DisArtTip ;
   private String[] H00KI3_A341DisArtOpe ;
   private short[] H00KI3_A349DisArtPu3 ;
   private boolean[] H00KI3_n349DisArtPu3 ;
   private String[] H00KI3_A358DisArtUr3 ;
   private short[] H00KI3_A348DisArtPu2 ;
   private String[] H00KI3_A357DisArtUr2 ;
   private short[] H00KI3_A347DisArtPu1 ;
   private String[] H00KI3_A356DisArtUr1 ;
   private short[] H00KI3_A346DisArtPt3 ;
   private String[] H00KI3_A355DisArtTr3 ;
   private short[] H00KI3_A345DisArtPt2 ;
   private String[] H00KI3_A354DisArtTr2 ;
   private short[] H00KI3_A344DisArtPt1 ;
   private String[] H00KI3_A353DisArtTr1 ;
   private String[] H00KI3_A337DisArtDsc ;
   private java.util.Date[] H00KI3_A370DisFecCli ;
   private java.util.Date[] H00KI3_A371DisFecEnt ;
   private java.util.Date[] H00KI3_A369DisFec ;
   private String[] H00KI3_A279CliNom ;
   private String[] H00KI3_A360DisCliNum ;
   private String[] H00KI3_A407EmprNom ;
   private boolean[] H00KI3_n407EmprNom ;
   private String[] H00KI3_A757PriCod ;
   private String[] H00KI3_A396EmprCod ;
   private String[] H00KI3_A1001FindTon ;
   private byte[] H00KI3_A1000FindInt ;
   private byte[] H00KI3_A390DisTipCol ;
   private boolean[] H00KI3_n390DisTipCol ;
   private int[] H00KI3_A363DisColNum ;
   private boolean[] H00KI3_n363DisColNum ;
   private String[] H00KI3_A362DisColNom ;
   private boolean[] H00KI3_n362DisColNom ;
   private String[] H00KI3_A335DisArtCod ;
   private int[] H00KI3_A252CliCod ;
   private String[] H00KI4_A407EmprNom ;
   private boolean[] H00KI4_n407EmprNom ;
   private String[] H00KI6_A1001FindTon ;
   private byte[] H00KI6_A1000FindInt ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class nwdpalmacentejidotdispoh__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00KI3", "SELECT T1.DisCod, T1.DisEstTip, T1.DisExp, T1.DisAcc, T1.DisCruKgs, T1.DisAntp, T1.DisArtCor, T1.DisArtEnc, T1.DisFecLan, T1.DisPle2, T1.RetCod, T1.DisFac, T1.DisNumTon, T1.DisPla, T1.DisKgsLot, T1.DisNumLot, T1.DisNumTex2, T1.DisNumTex1, T1.DisCodTex, T1.DisOpeAnt, T1.DisManCod, T1.DisCliDes, T1.DisNumBas, T1.DisTipDis, T1.DisRes, T4.TipConDsc AS TipConNom, T1.TipConCod AS TipConCod, T1.DisUniMed, T1.DisEst, T1.DisNumPie, T1.DisNumUni, T5.PartReo, T1.PartCod, T1.MaqCodDis, T1.DisNumTen, T1.DisDes, T1.DisNumCli, T1.DisNomCli, T1.DisNMez, T1.DisNMtr, T1.DisArtMat, T1.DisArtTip, T1.DisArtOpe, T1.DisArtPu3, T1.DisArtUr3, T1.DisArtPu2, T1.DisArtUr2, T1.DisArtPu1, T1.DisArtUr1, T1.DisArtPt3, T1.DisArtTr3, T1.DisArtPt2, T1.DisArtTr2, T1.DisArtPt1, T1.DisArtTr1, T1.DisArtDsc, T1.DisFecCli, T1.DisFecEnt, T1.DisFec, T3.CliNom, T1.DisCliNum, T2.EmprNom, T1.PriCod, T1.EmprCod, COALESCE( T6.FindTon, '') AS FindTon, COALESCE( T6.FindInt, 0) AS FindInt, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtCod, T1.CliCod FROM (((((TXPDISPOS T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPTIPCON T4 ON T4.EmprCod = T1.EmprCod AND T4.TipCon = T1.TipConCod) LEFT JOIN TXPCPARTI T5 ON T5.EmprCod = T1.EmprCod AND T5.PartCod = T1.PartCod AND T5.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T7.ForNomCli) AS FindTon, T7.EmprCod, T8.DisCod, MIN(T7.IntCod) AS FindInt FROM ((TXPCFORMU T7 LEFT JOIN TXPBARCAD T8 ON T8.EmprCod = T7.EmprCod AND T8.BarCod = T7.BarCod AND T8.BarCodReo = T7.BarCodReo AND T8.BarCodPar = T7.BarCodPar) LEFT JOIN TXPDISPOS T9 ON T9.EmprCod = T7.EmprCod AND T9.DisCod = T8.DisCod) WHERE T7.ForSer = T9.DisArtCod and T7.ForColNom = T9.DisColNom and T7.ForColNum = T9.DisColNum and T7.TipColCod = T9.DisTipCol GROUP BY T7.EmprCod, T8.DisCod ) T6 ON T6.EmprCod = T1.EmprCod AND T6.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00KI4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00KI6", "SELECT COALESCE( T1.FindTon, '') AS FindTon, COALESCE( T1.FindInt, 0) AS FindInt FROM (SELECT MIN(T2.ForNomCli) AS FindTon, T2.EmprCod, T3.DisCod, MIN(T2.IntCod) AS FindInt FROM ((TXPCFORMU T2 LEFT JOIN TXPBARCAD T3 ON T3.EmprCod = T2.EmprCod AND T3.BarCod = T2.BarCod AND T3.BarCodReo = T2.BarCodReo AND T3.BarCodPar = T2.BarCodPar) LEFT JOIN TXPDISPOS T4 ON T4.EmprCod = T2.EmprCod AND T4.DisCod = T3.DisCod) WHERE T2.ForSer = T4.DisArtCod and T2.ForColNom = T4.DisColNom and T2.ForColNum = T4.DisColNum and T2.TipColCod = T4.DisTipCol GROUP BY T2.EmprCod, T3.DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((String[]) buf[11])[0] = rslt.getString(11, 4);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((String[]) buf[14])[0] = rslt.getString(13, 10);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((short[]) buf[18])[0] = rslt.getShort(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((String[]) buf[21])[0] = rslt.getString(19, 4);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(21);
               ((int[]) buf[26])[0] = rslt.getInt(22);
               ((short[]) buf[27])[0] = rslt.getShort(23);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(24, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(26, 35);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(27);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(28, 1);
               ((byte[]) buf[38])[0] = rslt.getByte(29);
               ((short[]) buf[39])[0] = rslt.getShort(30);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(31,2);
               ((String[]) buf[41])[0] = rslt.getString(32, 2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(33, 16);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(34, 6);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(35, 10);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(36, 1);
               ((int[]) buf[50])[0] = rslt.getInt(37);
               ((String[]) buf[51])[0] = rslt.getString(38, 13);
               ((String[]) buf[52])[0] = rslt.getString(39, 10);
               ((String[]) buf[53])[0] = rslt.getString(40, 10);
               ((String[]) buf[54])[0] = rslt.getString(41, 16);
               ((short[]) buf[55])[0] = rslt.getShort(42);
               ((String[]) buf[56])[0] = rslt.getString(43, 2);
               ((short[]) buf[57])[0] = rslt.getShort(44);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(45, 4);
               ((short[]) buf[60])[0] = rslt.getShort(46);
               ((String[]) buf[61])[0] = rslt.getString(47, 4);
               ((short[]) buf[62])[0] = rslt.getShort(48);
               ((String[]) buf[63])[0] = rslt.getString(49, 4);
               ((short[]) buf[64])[0] = rslt.getShort(50);
               ((String[]) buf[65])[0] = rslt.getString(51, 4);
               ((short[]) buf[66])[0] = rslt.getShort(52);
               ((String[]) buf[67])[0] = rslt.getString(53, 4);
               ((short[]) buf[68])[0] = rslt.getShort(54);
               ((String[]) buf[69])[0] = rslt.getString(55, 4);
               ((String[]) buf[70])[0] = rslt.getString(56, 26);
               ((java.util.Date[]) buf[71])[0] = rslt.getGXDate(57);
               ((java.util.Date[]) buf[72])[0] = rslt.getGXDate(58);
               ((java.util.Date[]) buf[73])[0] = rslt.getGXDate(59);
               ((String[]) buf[74])[0] = rslt.getString(60, 30);
               ((String[]) buf[75])[0] = rslt.getString(61, 8);
               ((String[]) buf[76])[0] = rslt.getString(62, 30);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getString(63, 1);
               ((String[]) buf[79])[0] = rslt.getString(64, 3);
               ((String[]) buf[80])[0] = rslt.getString(65, 13);
               ((byte[]) buf[81])[0] = rslt.getByte(66);
               ((byte[]) buf[82])[0] = rslt.getByte(67);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((int[]) buf[84])[0] = rslt.getInt(68);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getString(69, 13);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getString(70, 16);
               ((int[]) buf[89])[0] = rslt.getInt(71);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

