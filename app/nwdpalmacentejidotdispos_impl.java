package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class nwdpalmacentejidotdispos_impl extends GXWebComponent
{
   public nwdpalmacentejidotdispos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public nwdpalmacentejidotdispos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( nwdpalmacentejidotdispos_impl.class ));
   }

   public nwdpalmacentejidotdispos_impl( int remoteHandle ,
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
      chkDisArtEnc = UIFactory.getCheckbox(this);
      chkDisArtCor = UIFactory.getCheckbox(this);
      cmbDisEst = new HTMLChoice();
      chkDisDes = UIFactory.getCheckbox(this);
      chkDisFac = UIFactory.getCheckbox(this);
      chkDisTin = UIFactory.getCheckbox(this);
      chkDisFacSep = UIFactory.getCheckbox(this);
      chkDisFacGra = UIFactory.getCheckbox(this);
      chkDisOrdSep = UIFactory.getCheckbox(this);
      chkDisOrdGra = UIFactory.getCheckbox(this);
      chkDisDesCol = UIFactory.getCheckbox(this);
      cmbDisGraTam = new HTMLChoice();
      chkCliCtrl = UIFactory.getCheckbox(this);
      chkDisExp = UIFactory.getCheckbox(this);
      chkDisAcc = UIFactory.getCheckbox(this);
      chkDisPla = UIFactory.getCheckbox(this);
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
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"DISARTACA") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A764ProForCod = httpContext.GetPar( "ProForCod") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgadisartacaKG0( A396EmprCod, A764ProForCod) ;
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
         paKG2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Nw DPAlmacen Tejido TDISPOS", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.nwdpalmacentejidotdispos", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"EmprCod","DisCod"}) +"\">") ;
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

   public void renderHtmlCloseFormKG2( )
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
      return "NwDPAlmacenTejidoTDISPOS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Nw DPAlmacen Tejido TDISPOS", "") ;
   }

   public void wbKG0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.nwdpalmacentejidotdispos");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtEmprNom_Link, "", "", "", edtEmprNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisCliNum_Internalname, GXutil.rtrim( A360DisCliNum), GXutil.rtrim( localUtil.format( A360DisCliNum, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCliNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCliNum_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisFecCli_Internalname, localUtil.format(A370DisFecCli, "99/99/99"), localUtil.format( A370DisFecCli, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFecCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisFecCli_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtDisFecCli_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisFecCli_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtCod_Internalname, GXutil.rtrim( A335DisArtCod), GXutil.rtrim( localUtil.format( A335DisArtCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisFec_Internalname, localUtil.format(A369DisFec, "99/99/99"), localUtil.format( A369DisFec, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtDisFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisFecEnt_Internalname, localUtil.format(A371DisFecEnt, "99/99/99"), localUtil.format( A371DisFecEnt, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFecEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisFecEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtDisFecEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisFecEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtDsc_Internalname, GXutil.rtrim( A337DisArtDsc), GXutil.rtrim( localUtil.format( A337DisArtDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtMat_Internalname, GXutil.rtrim( A340DisArtMat), GXutil.rtrim( localUtil.format( A340DisArtMat, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtLar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtLar_Internalname, httpContext.getMessage( "Largo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtLar_Internalname, GXutil.rtrim( A339DisArtLar), GXutil.rtrim( localUtil.format( A339DisArtLar, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtLar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtLar_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtSua_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtSua_Internalname, httpContext.getMessage( "Suavizante", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtSua_Internalname, GXutil.rtrim( A351DisArtSua), GXutil.rtrim( localUtil.format( A351DisArtSua, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtSua_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtSua_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtAca_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtAca_Internalname, httpContext.getMessage( "Acabado Quimico", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtAca_Internalname, GXutil.rtrim( A333DisArtAca), GXutil.rtrim( localUtil.format( A333DisArtAca, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtAca_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtAca_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtPle_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtPle_Internalname, httpContext.getMessage( "Plegado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPle_Internalname, GXutil.rtrim( A343DisArtPle), GXutil.rtrim( localUtil.format( A343DisArtPle, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPle_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtPle_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtTip_Internalname, GXutil.ltrim( localUtil.ntoc( A352DisArtTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtTip_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A352DisArtTip), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A352DisArtTip), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtTip_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtTip_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtOpe_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtOpe_Internalname, httpContext.getMessage( "Operacion Especial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtOpe_Internalname, GXutil.rtrim( A341DisArtOpe), GXutil.rtrim( localUtil.format( A341DisArtOpe, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtOpe_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtOpe_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtTr1_Internalname, GXutil.rtrim( A353DisArtTr1), GXutil.rtrim( localUtil.format( A353DisArtTr1, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtTr1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtTr1_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPt1_Internalname, GXutil.ltrim( localUtil.ntoc( A344DisArtPt1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPt1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A344DisArtPt1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A344DisArtPt1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPt1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtPt1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtTr2_Internalname, GXutil.rtrim( A354DisArtTr2), GXutil.rtrim( localUtil.format( A354DisArtTr2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtTr2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtTr2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPt2_Internalname, GXutil.ltrim( localUtil.ntoc( A345DisArtPt2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPt2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A345DisArtPt2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A345DisArtPt2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPt2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtPt2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtTr3_Internalname, GXutil.rtrim( A355DisArtTr3), GXutil.rtrim( localUtil.format( A355DisArtTr3, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtTr3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtTr3_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPt3_Internalname, GXutil.ltrim( localUtil.ntoc( A346DisArtPt3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPt3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A346DisArtPt3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A346DisArtPt3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPt3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtPt3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtRdt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtRdt_Internalname, httpContext.getMessage( "Rendimiento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtRdt_Internalname, GXutil.ltrim( localUtil.ntoc( A350DisArtRdt, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtRdt_Enabled!=0) ? localUtil.format( A350DisArtRdt, "ZZ9.99") : localUtil.format( A350DisArtRdt, "ZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtRdt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtRdt_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtUrg_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtUrg_Internalname, httpContext.getMessage( "Urgencia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtUrg_Internalname, GXutil.ltrim( localUtil.ntoc( A359DisArtUrg, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtUrg_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A359DisArtUrg), "9") : localUtil.format( DecimalUtil.doubleToDec(A359DisArtUrg), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtUrg_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtUrg_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtUr1_Internalname, GXutil.rtrim( A356DisArtUr1), GXutil.rtrim( localUtil.format( A356DisArtUr1, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtUr1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtUr1_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPu1_Internalname, GXutil.ltrim( localUtil.ntoc( A347DisArtPu1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPu1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A347DisArtPu1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A347DisArtPu1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPu1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtPu1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtUr2_Internalname, GXutil.rtrim( A357DisArtUr2), GXutil.rtrim( localUtil.format( A357DisArtUr2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtUr2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtUr2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPu2_Internalname, GXutil.ltrim( localUtil.ntoc( A348DisArtPu2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPu2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A348DisArtPu2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A348DisArtPu2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPu2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtPu2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtUr3_Internalname, GXutil.rtrim( A358DisArtUr3), GXutil.rtrim( localUtil.format( A358DisArtUr3, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtUr3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtUr3_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPu3_Internalname, GXutil.ltrim( localUtil.ntoc( A349DisArtPu3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPu3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A349DisArtPu3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A349DisArtPu3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPu3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtPu3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtPes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtPes_Internalname, httpContext.getMessage( "Gramaje Crudo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPes_Internalname, GXutil.ltrim( localUtil.ntoc( A342DisArtPes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A342DisArtPes), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A342DisArtPes), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtPes_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtAnh_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtAnh_Internalname, httpContext.getMessage( "Ancho Acabado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A334DisArtAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtAnh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A334DisArtAnh), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A334DisArtAnh), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtAnh_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtAnh_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtAn1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtAn1_Internalname, httpContext.getMessage( "Ancho crudo Máximo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtAn1_Internalname, GXutil.ltrim( localUtil.ntoc( A1231DisArtAn1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtAn1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1231DisArtAn1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1231DisArtAn1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtAn1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtAn1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtAcb_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtAcb_Internalname, httpContext.getMessage( "Ancho Acabado Mínimo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtAcb_Internalname, GXutil.ltrim( localUtil.ntoc( A1232DisArtAcb, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtAcb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1232DisArtAcb), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1232DisArtAcb), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtAcb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtAcb_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtAc2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtAc2_Internalname, httpContext.getMessage( "Ancho Acabado Máximo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtAc2_Internalname, GXutil.ltrim( localUtil.ntoc( A1233DisArtAc2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtAc2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1233DisArtAc2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1233DisArtAc2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtAc2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtAc2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisPiePie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisPiePie_Internalname, httpContext.getMessage( "Total piezas dispuestas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisPiePie_Internalname, GXutil.ltrim( localUtil.ntoc( A387DisPiePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPiePie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A387DisPiePie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A387DisPiePie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPiePie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisPiePie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisPieMtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisPieMtr_Internalname, httpContext.getMessage( "Metros Dispuestos / Dispos.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisPieMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A385DisPieMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPieMtr_Enabled!=0) ? localUtil.format( A385DisPieMtr, "ZZZZZ9.99") : localUtil.format( A385DisPieMtr, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPieMtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisPieMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisPieKgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisPieKgm_Internalname, httpContext.getMessage( "Kilos Dispuestos Dispos.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisPieKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A381DisPieKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPieKgm_Enabled!=0) ? localUtil.format( A381DisPieKgm, "ZZZZZ9.99") : localUtil.format( A381DisPieKgm, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPieKgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisPieKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbDisEst, cmbDisEst.getInternalname(), GXutil.trim( GXutil.str( A367DisEst, 1, 0)), 1, cmbDisEst.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbDisEst.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisPreKgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisPreKgm_Internalname, httpContext.getMessage( "Precio Kgm.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A388DisPreKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPreKgm_Enabled!=0) ? localUtil.format( A388DisPreKgm, "ZZZZZZ9.99") : localUtil.format( A388DisPreKgm, "ZZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPreKgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisPreKgm_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisPreMtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisPreMtr_Internalname, httpContext.getMessage( "Precio Metro", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A389DisPreMtr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPreMtr_Enabled!=0) ? localUtil.format( A389DisPreMtr, "ZZZZZZ9.99") : localUtil.format( A389DisPreMtr, "ZZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPreMtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisPreMtr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisPieLan_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisPieLan_Internalname, httpContext.getMessage( "Piezas Lanzadas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisPieLan_Internalname, GXutil.ltrim( localUtil.ntoc( A383DisPieLan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPieLan_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A383DisPieLan), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A383DisPieLan), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPieLan_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisPieLan_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisKgmLan_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisKgmLan_Internalname, httpContext.getMessage( "Kgm Lanzados", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisKgmLan_Internalname, GXutil.ltrim( localUtil.ntoc( A372DisKgmLan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisKgmLan_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A372DisKgmLan), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A372DisKgmLan), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisKgmLan_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisKgmLan_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisMtrLan_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisMtrLan_Internalname, httpContext.getMessage( "Metros Lanzados", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisMtrLan_Internalname, GXutil.ltrim( localUtil.ntoc( A373DisMtrLan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisMtrLan_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A373DisMtrLan), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A373DisMtrLan), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisMtrLan_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisMtrLan_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisColNom_Internalname, GXutil.rtrim( A362DisColNom), GXutil.rtrim( localUtil.format( A362DisColNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisColNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A363DisColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A363DisColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A363DisColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisColNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNomCli_Internalname, GXutil.rtrim( A1195DisNomCli), GXutil.rtrim( localUtil.format( A1195DisNomCli, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNomCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNomCli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumCli_Internalname, GXutil.ltrim( localUtil.ntoc( A1196DisNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1196DisNumCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1196DisNumCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNumCli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisEncCom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisEncCom_Internalname, httpContext.getMessage( "Encogimiento: Comprimido", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisEncCom_Internalname, GXutil.ltrim( localUtil.ntoc( A1197DisEncCom, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisEncCom_Enabled!=0) ? localUtil.format( A1197DisEncCom, "ZZ9.99") : localUtil.format( A1197DisEncCom, "ZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisEncCom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisEncCom_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisEncAnh_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisEncAnh_Internalname, httpContext.getMessage( "Encogimiento: Ancho", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisEncAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A1198DisEncAnh, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisEncAnh_Enabled!=0) ? localUtil.format( A1198DisEncAnh, "ZZ9.99") : localUtil.format( A1198DisEncAnh, "ZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisEncAnh_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisEncAnh_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A390DisTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A390DisTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A390DisTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisTipCol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisNumPie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisNumPie_Internalname, httpContext.getMessage( "Numero Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumPie_Internalname, GXutil.ltrim( localUtil.ntoc( A374DisNumPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A374DisNumPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A374DisNumPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumPie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNumPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumUni_Internalname, GXutil.ltrim( localUtil.ntoc( A375DisNumUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumUni_Enabled!=0) ? localUtil.format( A375DisNumUni, "ZZZZZ9.99") : localUtil.format( A375DisNumUni, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumUni_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNumUni_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisUniMed_Internalname, GXutil.rtrim( A392DisUniMed), GXutil.rtrim( localUtil.format( A392DisUniMed, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisUniMed_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisUniMed_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprCodDis_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtEmprCodDis_Internalname, httpContext.getMessage( "EmprCodDis", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCodDis_Internalname, GXutil.rtrim( A399EmprCodDis), GXutil.rtrim( localUtil.format( A399EmprCodDis, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCodDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprCodDis_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCodDis_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliCodDis_Internalname, httpContext.getMessage( "CliCodDis", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliCodDis_Internalname, GXutil.ltrim( localUtil.ntoc( A253CliCodDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCodDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A253CliCodDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A253CliCodDis), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCodDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCodDis_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtFindCol_Internalname, GXutil.rtrim( A475FindCol), GXutil.rtrim( localUtil.format( A475FindCol, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFindCol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFindCol_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisPie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisPie_Internalname, httpContext.getMessage( "Piezas Disp. no desglose", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisPie_Internalname, GXutil.ltrim( localUtil.ntoc( A379DisPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A379DisPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A379DisPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisUni_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisUni_Internalname, httpContext.getMessage( "Unidades Disp. No desglose", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisUni_Internalname, GXutil.ltrim( localUtil.ntoc( A391DisUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisUni_Enabled!=0) ? localUtil.format( A391DisUni, "ZZZZZ9.99") : localUtil.format( A391DisUni, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisUni_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisUni_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisGraCru_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisGraCru_Internalname, httpContext.getMessage( "Gramaje Crudo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisGraCru_Internalname, GXutil.ltrim( localUtil.ntoc( A1225DisGraCru, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisGraCru_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1225DisGraCru), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1225DisGraCru), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisGraCru_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisGraCru_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisPieNor_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisPieNor_Internalname, httpContext.getMessage( "Total piezas dispos. no desgl.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisPieNor_Internalname, GXutil.ltrim( localUtil.ntoc( A386DisPieNor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPieNor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A386DisPieNor), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A386DisPieNor), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPieNor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisPieNor_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisLoc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisLoc_Internalname, httpContext.getMessage( "Localizacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisLoc_Internalname, GXutil.rtrim( A1430DisLoc), GXutil.rtrim( localUtil.format( A1430DisLoc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisLoc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisLoc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisPart_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisPart_Internalname, httpContext.getMessage( "Numero de Partida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisPart_Internalname, GXutil.ltrim( localUtil.ntoc( A1502DisPart, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPart_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1502DisPart), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1502DisPart), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPart_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisPart_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisGraAca_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisGraAca_Internalname, httpContext.getMessage( "Gramaje Acabado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisGraAca_Internalname, GXutil.ltrim( localUtil.ntoc( A1906DisGraAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisGraAca_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1906DisGraAca), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1906DisGraAca), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisGraAca_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisGraAca_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisRdoN_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisRdoN_Internalname, httpContext.getMessage( "Rendimiento en Neto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisRdoN_Internalname, GXutil.ltrim( localUtil.ntoc( A1907DisRdoN, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisRdoN_Enabled!=0) ? localUtil.format( A1907DisRdoN, "ZZ9.99") : localUtil.format( A1907DisRdoN, "ZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisRdoN_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisRdoN_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisRdoA_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisRdoA_Internalname, httpContext.getMessage( "Rendimiento en Acabado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisRdoA_Internalname, GXutil.ltrim( localUtil.ntoc( A1908DisRdoA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisRdoA_Enabled!=0) ? localUtil.format( A1908DisRdoA, "ZZ9.99") : localUtil.format( A1908DisRdoA, "ZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisRdoA_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisRdoA_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisTipDis_Internalname, GXutil.rtrim( A2009DisTipDis), GXutil.rtrim( localUtil.format( A2009DisTipDis, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisTipDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisTipDis_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumLot_Internalname, GXutil.ltrim( localUtil.ntoc( A2831DisNumLot, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumLot_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2831DisNumLot), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2831DisNumLot), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumLot_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNumLot_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisKgsLot_Internalname, GXutil.ltrim( localUtil.ntoc( A2832DisKgsLot, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisKgsLot_Enabled!=0) ? localUtil.format( A2832DisKgsLot, "ZZZZZ9.99") : localUtil.format( A2832DisKgsLot, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisKgsLot_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisKgsLot_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisMtrLot_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisMtrLot_Internalname, httpContext.getMessage( "Metros del Lote/Barcada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisMtrLot_Internalname, GXutil.ltrim( localUtil.ntoc( A2833DisMtrLot, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisMtrLot_Enabled!=0) ? localUtil.format( A2833DisMtrLot, "ZZZZZ9.99") : localUtil.format( A2833DisMtrLot, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisMtrLot_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisMtrLot_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisPle2_Internalname, GXutil.rtrim( A2835DisPle2), GXutil.rtrim( localUtil.format( A2835DisPle2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPle2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisPle2_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisNumCor_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisNumCor_Internalname, httpContext.getMessage( "Numero de Cortes", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumCor_Internalname, GXutil.ltrim( localUtil.ntoc( A3127DisNumCor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumCor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3127DisNumCor), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3127DisNumCor), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumCor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNumCor_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisAncSal1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisAncSal1_Internalname, httpContext.getMessage( "Ancho Salida 1", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisAncSal1_Internalname, GXutil.ltrim( localUtil.ntoc( A3128DisAncSal1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisAncSal1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3128DisAncSal1), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3128DisAncSal1), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisAncSal1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisAncSal1_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisAncSal2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisAncSal2_Internalname, httpContext.getMessage( "Ancho Salida 2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisAncSal2_Internalname, GXutil.ltrim( localUtil.ntoc( A3129DisAncSal2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisAncSal2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3129DisAncSal2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3129DisAncSal2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisAncSal2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisAncSal2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisAncSal3_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisAncSal3_Internalname, httpContext.getMessage( "Ancho Salida 3", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisAncSal3_Internalname, GXutil.ltrim( localUtil.ntoc( A3130DisAncSal3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisAncSal3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3130DisAncSal3), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3130DisAncSal3), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisAncSal3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisAncSal3_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisGraAca2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisGraAca2_Internalname, httpContext.getMessage( "Gramaje Acabado 2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisGraAca2_Internalname, GXutil.ltrim( localUtil.ntoc( A3131DisGraAca2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisGraAca2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3131DisGraAca2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3131DisGraAca2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisGraAca2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisGraAca2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisGraCru2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisGraCru2_Internalname, httpContext.getMessage( "Gramaje Crudo 2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisGraCru2_Internalname, GXutil.ltrim( localUtil.ntoc( A3132DisGraCru2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisGraCru2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3132DisGraCru2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3132DisGraCru2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisGraCru2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisGraCru2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCodDis_Internalname, GXutil.rtrim( A1122MaqCodDis), GXutil.rtrim( localUtil.format( A1122MaqCodDis, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCodDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqCodDis_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisManCod1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisManCod1_Internalname, httpContext.getMessage( "Manufacturador 1 (Bobinador)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisManCod1_Internalname, GXutil.ltrim( localUtil.ntoc( A3307DisManCod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisManCod1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3307DisManCod1), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3307DisManCod1), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisManCod1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisManCod1_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisManCod2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisManCod2_Internalname, httpContext.getMessage( "Manufacturador 2 (Re-Bobinado)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisManCod2_Internalname, GXutil.ltrim( localUtil.ntoc( A3308DisManCod2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisManCod2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3308DisManCod2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3308DisManCod2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisManCod2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisManCod2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumTon_Internalname, GXutil.rtrim( A3309DisNumTon), GXutil.rtrim( localUtil.format( A3309DisNumTon, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumTon_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNumTon_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisCliDes_Internalname, GXutil.ltrim( localUtil.ntoc( A2310DisCliDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCliDes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2310DisCliDes), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2310DisCliDes), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Código Cliente Destino", ""), "", edtDisCliDes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCliDes_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisFecLan_Internalname, localUtil.format(A3627DisFecLan, "99/99/99"), localUtil.format( A3627DisFecLan, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFecLan_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisFecLan_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtDisFecLan_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisFecLan_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisEnv_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisEnv_Internalname, httpContext.getMessage( "Domicilio Envio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisEnv_Internalname, GXutil.ltrim( localUtil.ntoc( A4013DisEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisEnv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4013DisEnv), "9") : localUtil.format( DecimalUtil.doubleToDec(A4013DisEnv), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisEnv_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisEnv_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkDisTin.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkDisTin.getInternalname(), httpContext.getMessage( "Tintar ?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisTin.getInternalname(), A4014DisTin, "", httpContext.getMessage( "Tintar ?", ""), 1, chkDisTin.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisNPzas_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisNPzas_Internalname, httpContext.getMessage( "Piezas Solicitadas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNPzas_Internalname, GXutil.ltrim( localUtil.ntoc( A4293DisNPzas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNPzas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4293DisNPzas), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4293DisNPzas), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNPzas_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNPzas_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisNPzasL_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisNPzasL_Internalname, httpContext.getMessage( "Piezas en Produccion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNPzasL_Internalname, GXutil.ltrim( localUtil.ntoc( A4294DisNPzasL, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNPzasL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4294DisNPzasL), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4294DisNPzasL), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNPzasL_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNPzasL_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisUsrCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisUsrCod_Internalname, httpContext.getMessage( "Usario que creó Dispo.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisUsrCod_Internalname, GXutil.rtrim( A4348DisUsrCod), GXutil.rtrim( localUtil.format( A4348DisUsrCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisUsrCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisUsrCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDibCli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDibCli_Internalname, httpContext.getMessage( "Dibujo del Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDibCli_Internalname, GXutil.rtrim( A1013DibCli), GXutil.rtrim( localUtil.format( A1013DibCli, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDibCli_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDibInt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDibInt_Internalname, httpContext.getMessage( "Dibujo Interno", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDibInt_Internalname, GXutil.ltrim( localUtil.ntoc( A1014DibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDibInt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibInt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDibInt_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisCom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisCom_Internalname, httpContext.getMessage( "Combinacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisCom_Internalname, GXutil.rtrim( A5031DisCom), GXutil.rtrim( localUtil.format( A5031DisCom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCom_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmpesCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtEmpesCod_Internalname, httpContext.getMessage( "Código Empesa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmpesCod_Internalname, GXutil.rtrim( A1031EmpesCod), GXutil.rtrim( localUtil.format( A1031EmpesCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpesCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmpesCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkDisFacSep.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkDisFacSep.getInternalname(), httpContext.getMessage( "Facturar Separación", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisFacSep.getInternalname(), GXutil.str( A7511DisFacSep, 1, 0), "", httpContext.getMessage( "Facturar Separación", ""), 1, chkDisFacSep.getEnabled(), "1", httpContext.getMessage( "Fac. Sep?", ""), StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkDisFacGra.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkDisFacGra.getInternalname(), httpContext.getMessage( "Facturar Grabación?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisFacGra.getInternalname(), GXutil.str( A7512DisFacGra, 1, 0), "", httpContext.getMessage( "Facturar Grabación?", ""), 1, chkDisFacGra.getEnabled(), "1", httpContext.getMessage( "Fac Gra?", ""), StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkDisOrdSep.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkDisOrdSep.getInternalname(), httpContext.getMessage( "Orden de Separación?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisOrdSep.getInternalname(), GXutil.str( A7513DisOrdSep, 1, 0), "", httpContext.getMessage( "Orden de Separación?", ""), 1, chkDisOrdSep.getEnabled(), "1", httpContext.getMessage( "Ord Sep?", ""), StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkDisOrdGra.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkDisOrdGra.getInternalname(), httpContext.getMessage( "Orden de Grabación", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisOrdGra.getInternalname(), GXutil.str( A7514DisOrdGra, 1, 0), "", httpContext.getMessage( "Orden de Grabación", ""), 1, chkDisOrdGra.getEnabled(), "1", httpContext.getMessage( "Ord Gra?", ""), StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkDisDesCol.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkDisDesCol.getInternalname(), httpContext.getMessage( "Desarrollo de Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisDesCol.getInternalname(), GXutil.str( A7515DisDesCol, 1, 0), "", httpContext.getMessage( "Desarrollo de Color", ""), 1, chkDisDesCol.getEnabled(), "1", httpContext.getMessage( "Des Col?", ""), StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbDisGraTam.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbDisGraTam.getInternalname(), httpContext.getMessage( "Tamaño a Grabar", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbDisGraTam, cmbDisGraTam.getInternalname(), GXutil.rtrim( A7516DisGraTam), 1, cmbDisGraTam.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbDisGraTam.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         cmbDisGraTam.setValue( GXutil.rtrim( A7516DisGraTam) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbDisGraTam.getInternalname(), "Values", cmbDisGraTam.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCliCtrl.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkCliCtrl.getInternalname(), httpContext.getMessage( "Controlar?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliCtrl.getInternalname(), A1901CliCtrl, "", httpContext.getMessage( "Controlar?", ""), 1, chkCliCtrl.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisRec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisRec_Internalname, httpContext.getMessage( "DisRec", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisRec_Internalname, GXutil.rtrim( A7523DisRec), GXutil.rtrim( localUtil.format( A7523DisRec, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisRec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisRec_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisMaqEst_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisMaqEst_Internalname, httpContext.getMessage( "Maquina de Estampado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisMaqEst_Internalname, GXutil.rtrim( A7738DisMaqEst), GXutil.rtrim( localUtil.format( A7738DisMaqEst, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisMaqEst_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisMaqEst_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisEncCli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisEncCli_Internalname, httpContext.getMessage( "Pedido Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisEncCli_Internalname, GXutil.rtrim( A4813DisEncCli), GXutil.rtrim( localUtil.format( A4813DisEncCli, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisEncCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisEncCli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisItem1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisItem1_Internalname, httpContext.getMessage( "Orden Compra", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisItem1_Internalname, GXutil.rtrim( A9771DisItem1), GXutil.rtrim( localUtil.format( A9771DisItem1, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisItem1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisItem1_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisItem2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisItem2_Internalname, httpContext.getMessage( "N Pedido Comercial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisItem2_Internalname, GXutil.rtrim( A9772DisItem2), GXutil.rtrim( localUtil.format( A9772DisItem2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisItem2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisItem2_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisItem3_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisItem3_Internalname, httpContext.getMessage( "Partida Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisItem3_Internalname, GXutil.rtrim( A9773DisItem3), GXutil.rtrim( localUtil.format( A9773DisItem3, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisItem3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisItem3_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisItem4_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisItem4_Internalname, httpContext.getMessage( "Partida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisItem4_Internalname, GXutil.rtrim( A9774DisItem4), GXutil.rtrim( localUtil.format( A9774DisItem4, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisItem4_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisItem4_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisItem5_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisItem5_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisItem5_Internalname, GXutil.rtrim( A9786DisItem5), GXutil.rtrim( localUtil.format( A9786DisItem5, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisItem5_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisItem5_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisItem6_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisItem6_Internalname, httpContext.getMessage( "N Estilo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisItem6_Internalname, GXutil.rtrim( A9787DisItem6), GXutil.rtrim( localUtil.format( A9787DisItem6, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisItem6_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisItem6_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisNMtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisNMtr_Internalname, httpContext.getMessage( "Número Métrico", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNMtr_Internalname, GXutil.rtrim( A998DisNMtr), GXutil.rtrim( localUtil.format( A998DisNMtr, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNMtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNMtr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisFecPed_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisFecPed_Internalname, httpContext.getMessage( "Fecha Pedida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtDisFecPed_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisFecPed_Internalname, localUtil.format(A4355DisFecPed, "99/99/99"), localUtil.format( A4355DisFecPed, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFecPed_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisFecPed_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtDisFecPed_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisFecPed_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDibColCol_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDibColCol_Internalname, httpContext.getMessage( "Color Dibujo Estampar Ribes", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDibColCol_Internalname, GXutil.rtrim( A4877DibColCol), GXutil.rtrim( localUtil.format( A4877DibColCol, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibColCol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDibColCol_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisDibCoCN_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisDibCoCN_Internalname, httpContext.getMessage( "N.Color Dibujo (Dispos-Ribes", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisDibCoCN_Internalname, GXutil.ltrim( localUtil.ntoc( A4919DisDibCoCN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisDibCoCN_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4919DisDibCoCN), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4919DisDibCoCN), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisDibCoCN_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisDibCoCN_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDibColColN_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDibColColN_Internalname, httpContext.getMessage( "N.Color Estampar Ribes", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDibColColN_Internalname, GXutil.ltrim( localUtil.ntoc( A4879DibColColN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDibColColN_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4879DibColColN), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4879DibColColN), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibColColN_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDibColColN_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumTen_Internalname, GXutil.rtrim( A1002DisNumTen), GXutil.rtrim( localUtil.format( A1002DisNumTen, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumTen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNumTen_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisAntpT_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisAntpT_Internalname, httpContext.getMessage( "Tipo Antipiling:F,R,N", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisAntpT_Internalname, GXutil.rtrim( A5405DisAntpT), GXutil.rtrim( localUtil.format( A5405DisAntpT, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisAntpT_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisAntpT_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisAntp_Internalname, GXutil.rtrim( A5366DisAntp), GXutil.rtrim( localUtil.format( A5366DisAntp, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisAntp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisAntp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisPriorid_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisPriorid_Internalname, httpContext.getMessage( "Prioridad Orden", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisPriorid_Internalname, GXutil.ltrim( localUtil.ntoc( A12765DisPriorid, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPriorid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12765DisPriorid), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A12765DisPriorid), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPriorid_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisPriorid_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisTpEstam_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisTpEstam_Internalname, httpContext.getMessage( "Tipo Estampado (Pigmentacion o Especial)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisTpEstam_Internalname, GXutil.ltrim( localUtil.ntoc( A12768DisTpEstam, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisTpEstam_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12768DisTpEstam), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A12768DisTpEstam), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisTpEstam_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisTpEstam_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisProdID_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisProdID_Internalname, httpContext.getMessage( "Codigo Orden Prioridad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisProdID_Internalname, GXutil.rtrim( A12772DisProdID), GXutil.rtrim( localUtil.format( A12772DisProdID, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisProdID_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisProdID_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisProdDs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisProdDs_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisProdDs_Internalname, GXutil.rtrim( A12773DisProdDs), GXutil.rtrim( localUtil.format( A12773DisProdDs, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisProdDs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisProdDs_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisLineaID_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisLineaID_Internalname, httpContext.getMessage( "Linea ID", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisLineaID_Internalname, GXutil.ltrim( localUtil.ntoc( A13068DisLineaID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisLineaID_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13068DisLineaID), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13068DisLineaID), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisLineaID_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisLineaID_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisCanalID_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisCanalID_Internalname, httpContext.getMessage( "Cliente Canal", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisCanalID_Internalname, GXutil.ltrim( localUtil.ntoc( A13069DisCanalID, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCanalID_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13069DisCanalID), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13069DisCanalID), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCanalID_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCanalID_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisLinPrd_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisLinPrd_Internalname, httpContext.getMessage( "Linea Produccion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisLinPrd_Internalname, GXutil.rtrim( A13076DisLinPrd), GXutil.rtrim( localUtil.format( A13076DisLinPrd, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisLinPrd_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisLinPrd_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisRdto4_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisRdto4_Internalname, httpContext.getMessage( "4 decimales", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisRdto4_Internalname, GXutil.ltrim( localUtil.ntoc( A13767DisRdto4, (byte)(7), (byte)(40), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisRdto4_Enabled!=0) ? localUtil.format( A13767DisRdto4, ".9999999999999999999999999999999999999999") : localUtil.format( A13767DisRdto4, ".9999999999999999999999999999999999999999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisRdto4_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisRdto4_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisTallUlt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisTallUlt_Internalname, httpContext.getMessage( "linea", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisTallUlt_Internalname, GXutil.ltrim( localUtil.ntoc( A13768DisTallUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisTallUlt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13768DisTallUlt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13768DisTallUlt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisTallUlt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisTallUlt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 689,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", httpContext.getMessage( "GXM_update", ""), bttBtnupdate_Jsonclick, 5, httpContext.getMessage( "GXM_update", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOUPDATE\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_NwDPAlmacenTejidoTDISPOS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 691,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtndelete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DODELETE\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_NwDPAlmacenTejidoTDISPOS.htm");
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

   public void startKG2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Nw DPAlmacen Tejido TDISPOS", ""), (short)(0)) ;
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
            strupKG0( ) ;
         }
      }
   }

   public void wsKG2( )
   {
      startKG2( ) ;
      evtKG2( ) ;
   }

   public void evtKG2( )
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
                              strupKG0( ) ;
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
                              strupKG0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e11KG2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupKG0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e12KG2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUPDATE'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupKG0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoUpdate' */
                                 e13KG2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DODELETE'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupKG0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoDelete' */
                                 e14KG2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupKG0( ) ;
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
                              strupKG0( ) ;
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

   public void weKG2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormKG2( ) ;
         }
      }
   }

   public void paKG2( )
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

   public void gxsgadisartacaKG0( String A396EmprCod ,
                                  String A764ProForCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgadisartaca_dataKG0( A396EmprCod, A764ProForCod) ;
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

   protected void gxsgadisartaca_dataKG0( String A396EmprCod ,
                                          String A764ProForCod )
   {
      l764ProForCod = GXutil.padr( GXutil.rtrim( A764ProForCod), 6, "%") ;
      /* Using cursor H00KG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, l764ProForCod});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H00KG2_A764ProForCod[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00KG2_A764ProForCod[0]));
         pr_default.readNext(0);
      }
      pr_default.close(0);
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
      A338DisArtEnc = ((GXutil.strcmp(GXutil.rtrim( A338DisArtEnc), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A338DisArtEnc", A338DisArtEnc);
      A336DisArtCor = ((GXutil.strcmp(GXutil.rtrim( A336DisArtCor), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A336DisArtCor", A336DisArtCor);
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
      A365DisDes = ((GXutil.strcmp(GXutil.rtrim( A365DisDes), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A365DisDes", A365DisDes);
      A3306DisFac = ((GXutil.strcmp(GXutil.rtrim( A3306DisFac), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3306DisFac", A3306DisFac);
      A4014DisTin = ((GXutil.strcmp(GXutil.rtrim( A4014DisTin), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4014DisTin", A4014DisTin);
      A7511DisFacSep = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7511DisFacSep, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n7511DisFacSep = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7511DisFacSep", GXutil.str( A7511DisFacSep, 1, 0));
      A7512DisFacGra = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7512DisFacGra, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n7512DisFacGra = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7512DisFacGra", GXutil.str( A7512DisFacGra, 1, 0));
      A7513DisOrdSep = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7513DisOrdSep, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7513DisOrdSep", GXutil.str( A7513DisOrdSep, 1, 0));
      A7514DisOrdGra = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7514DisOrdGra, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7514DisOrdGra", GXutil.str( A7514DisOrdGra, 1, 0));
      A7515DisDesCol = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7515DisDesCol, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n7515DisDesCol = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7515DisDesCol", GXutil.str( A7515DisDesCol, 1, 0));
      if ( cmbDisGraTam.getItemCount() > 0 )
      {
         A7516DisGraTam = cmbDisGraTam.getValidValue(A7516DisGraTam) ;
         n7516DisGraTam = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7516DisGraTam", A7516DisGraTam);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbDisGraTam.setValue( GXutil.rtrim( A7516DisGraTam) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbDisGraTam.getInternalname(), "Values", cmbDisGraTam.ToJavascriptSource(), true);
      }
      A1901CliCtrl = ((GXutil.strcmp(GXutil.rtrim( A1901CliCtrl), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1901CliCtrl", A1901CliCtrl);
      A7739DisExp = ((GXutil.strcmp(GXutil.rtrim( A7739DisExp), "E")==0) ? "E" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7739DisExp", A7739DisExp);
      A5252DisAcc = ((GXutil.strcmp(GXutil.rtrim( A5252DisAcc), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5252DisAcc", A5252DisAcc);
      A2926DisPla = ((GXutil.strcmp(GXutil.rtrim( A2926DisPla), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2926DisPla", A2926DisPla);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfKG2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV17Pgmname = "NwDPAlmacenTejidoTDISPOS" ;
      Gx_err = (short)(0) ;
   }

   public void rfKG2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00KG5 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A353DisArtTr1 = H00KG5_A353DisArtTr1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A353DisArtTr1", A353DisArtTr1);
            A341DisArtOpe = H00KG5_A341DisArtOpe[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A341DisArtOpe", A341DisArtOpe);
            A336DisArtCor = H00KG5_A336DisArtCor[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A336DisArtCor", A336DisArtCor);
            A338DisArtEnc = H00KG5_A338DisArtEnc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A338DisArtEnc", A338DisArtEnc);
            A352DisArtTip = H00KG5_A352DisArtTip[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A352DisArtTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A352DisArtTip), 4, 0));
            A343DisArtPle = H00KG5_A343DisArtPle[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A343DisArtPle", A343DisArtPle);
            A333DisArtAca = H00KG5_A333DisArtAca[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A333DisArtAca", A333DisArtAca);
            A351DisArtSua = H00KG5_A351DisArtSua[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A351DisArtSua", A351DisArtSua);
            A339DisArtLar = H00KG5_A339DisArtLar[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A339DisArtLar", A339DisArtLar);
            A340DisArtMat = H00KG5_A340DisArtMat[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A340DisArtMat", A340DisArtMat);
            A337DisArtDsc = H00KG5_A337DisArtDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A337DisArtDsc", A337DisArtDsc);
            A371DisFecEnt = H00KG5_A371DisFecEnt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A371DisFecEnt", localUtil.format(A371DisFecEnt, "99/99/99"));
            A369DisFec = H00KG5_A369DisFec[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
            A279CliNom = H00KG5_A279CliNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", A279CliNom);
            A370DisFecCli = H00KG5_A370DisFecCli[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A370DisFecCli", localUtil.format(A370DisFecCli, "99/99/99"));
            A360DisCliNum = H00KG5_A360DisCliNum[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A360DisCliNum", A360DisCliNum);
            A757PriCod = H00KG5_A757PriCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A757PriCod", A757PriCod);
            A379DisPie = H00KG5_A379DisPie[0] ;
            n379DisPie = H00KG5_n379DisPie[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A379DisPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A379DisPie), 4, 0));
            A387DisPiePie = H00KG5_A387DisPiePie[0] ;
            n387DisPiePie = H00KG5_n387DisPiePie[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
            A390DisTipCol = H00KG5_A390DisTipCol[0] ;
            n390DisTipCol = H00KG5_n390DisTipCol[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
            A363DisColNum = H00KG5_A363DisColNum[0] ;
            n363DisColNum = H00KG5_n363DisColNum[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
            A362DisColNom = H00KG5_A362DisColNom[0] ;
            n362DisColNom = H00KG5_n362DisColNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A362DisColNom", A362DisColNom);
            A335DisArtCod = H00KG5_A335DisArtCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A335DisArtCod", A335DisArtCod);
            A252CliCod = H00KG5_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A392DisUniMed = H00KG5_A392DisUniMed[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A392DisUniMed", A392DisUniMed);
            A365DisDes = H00KG5_A365DisDes[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A365DisDes", A365DisDes);
            A13768DisTallUlt = H00KG5_A13768DisTallUlt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13768DisTallUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13768DisTallUlt), 4, 0));
            A13767DisRdto4 = H00KG5_A13767DisRdto4[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13767DisRdto4", GXutil.ltrimstr( A13767DisRdto4, 7, 40));
            A13076DisLinPrd = H00KG5_A13076DisLinPrd[0] ;
            n13076DisLinPrd = H00KG5_n13076DisLinPrd[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13076DisLinPrd", A13076DisLinPrd);
            A13069DisCanalID = H00KG5_A13069DisCanalID[0] ;
            n13069DisCanalID = H00KG5_n13069DisCanalID[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13069DisCanalID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13069DisCanalID), 6, 0));
            A13068DisLineaID = H00KG5_A13068DisLineaID[0] ;
            n13068DisLineaID = H00KG5_n13068DisLineaID[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13068DisLineaID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13068DisLineaID), 4, 0));
            A2926DisPla = H00KG5_A2926DisPla[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2926DisPla", A2926DisPla);
            A12773DisProdDs = H00KG5_A12773DisProdDs[0] ;
            n12773DisProdDs = H00KG5_n12773DisProdDs[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12773DisProdDs", A12773DisProdDs);
            A12772DisProdID = H00KG5_A12772DisProdID[0] ;
            n12772DisProdID = H00KG5_n12772DisProdID[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12772DisProdID", A12772DisProdID);
            A12768DisTpEstam = H00KG5_A12768DisTpEstam[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12768DisTpEstam", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12768DisTpEstam), 2, 0));
            A12765DisPriorid = H00KG5_A12765DisPriorid[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12765DisPriorid", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12765DisPriorid), 2, 0));
            A5366DisAntp = H00KG5_A5366DisAntp[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5366DisAntp", A5366DisAntp);
            A5405DisAntpT = H00KG5_A5405DisAntpT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5405DisAntpT", A5405DisAntpT);
            A1002DisNumTen = H00KG5_A1002DisNumTen[0] ;
            n1002DisNumTen = H00KG5_n1002DisNumTen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1002DisNumTen", A1002DisNumTen);
            A4879DibColColN = H00KG5_A4879DibColColN[0] ;
            n4879DibColColN = H00KG5_n4879DibColColN[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4879DibColColN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4879DibColColN), 6, 0));
            A4919DisDibCoCN = H00KG5_A4919DisDibCoCN[0] ;
            n4919DisDibCoCN = H00KG5_n4919DisDibCoCN[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4919DisDibCoCN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4919DisDibCoCN), 6, 0));
            A4877DibColCol = H00KG5_A4877DibColCol[0] ;
            n4877DibColCol = H00KG5_n4877DibColCol[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4877DibColCol", A4877DibColCol);
            A4355DisFecPed = H00KG5_A4355DisFecPed[0] ;
            n4355DisFecPed = H00KG5_n4355DisFecPed[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4355DisFecPed", localUtil.format(A4355DisFecPed, "99/99/99"));
            A998DisNMtr = H00KG5_A998DisNMtr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A998DisNMtr", A998DisNMtr);
            A5252DisAcc = H00KG5_A5252DisAcc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5252DisAcc", A5252DisAcc);
            A9787DisItem6 = H00KG5_A9787DisItem6[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9787DisItem6", A9787DisItem6);
            A9786DisItem5 = H00KG5_A9786DisItem5[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9786DisItem5", A9786DisItem5);
            A9774DisItem4 = H00KG5_A9774DisItem4[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9774DisItem4", A9774DisItem4);
            A9773DisItem3 = H00KG5_A9773DisItem3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9773DisItem3", A9773DisItem3);
            A9772DisItem2 = H00KG5_A9772DisItem2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9772DisItem2", A9772DisItem2);
            A9771DisItem1 = H00KG5_A9771DisItem1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9771DisItem1", A9771DisItem1);
            A4813DisEncCli = H00KG5_A4813DisEncCli[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4813DisEncCli", A4813DisEncCli);
            A7739DisExp = H00KG5_A7739DisExp[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7739DisExp", A7739DisExp);
            A7738DisMaqEst = H00KG5_A7738DisMaqEst[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7738DisMaqEst", A7738DisMaqEst);
            A7523DisRec = H00KG5_A7523DisRec[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7523DisRec", A7523DisRec);
            A1901CliCtrl = H00KG5_A1901CliCtrl[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1901CliCtrl", A1901CliCtrl);
            A7516DisGraTam = H00KG5_A7516DisGraTam[0] ;
            n7516DisGraTam = H00KG5_n7516DisGraTam[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7516DisGraTam", A7516DisGraTam);
            A7515DisDesCol = H00KG5_A7515DisDesCol[0] ;
            n7515DisDesCol = H00KG5_n7515DisDesCol[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7515DisDesCol", GXutil.str( A7515DisDesCol, 1, 0));
            A7514DisOrdGra = H00KG5_A7514DisOrdGra[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7514DisOrdGra", GXutil.str( A7514DisOrdGra, 1, 0));
            A7513DisOrdSep = H00KG5_A7513DisOrdSep[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7513DisOrdSep", GXutil.str( A7513DisOrdSep, 1, 0));
            A7512DisFacGra = H00KG5_A7512DisFacGra[0] ;
            n7512DisFacGra = H00KG5_n7512DisFacGra[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7512DisFacGra", GXutil.str( A7512DisFacGra, 1, 0));
            A7511DisFacSep = H00KG5_A7511DisFacSep[0] ;
            n7511DisFacSep = H00KG5_n7511DisFacSep[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7511DisFacSep", GXutil.str( A7511DisFacSep, 1, 0));
            A1031EmpesCod = H00KG5_A1031EmpesCod[0] ;
            n1031EmpesCod = H00KG5_n1031EmpesCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1031EmpesCod", A1031EmpesCod);
            A5031DisCom = H00KG5_A5031DisCom[0] ;
            n5031DisCom = H00KG5_n5031DisCom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5031DisCom", A5031DisCom);
            A1014DibInt = H00KG5_A1014DibInt[0] ;
            n1014DibInt = H00KG5_n1014DibInt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            A1013DibCli = H00KG5_A1013DibCli[0] ;
            n1013DibCli = H00KG5_n1013DibCli[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1013DibCli", A1013DibCli);
            A4348DisUsrCod = H00KG5_A4348DisUsrCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4348DisUsrCod", A4348DisUsrCod);
            A4294DisNPzasL = H00KG5_A4294DisNPzasL[0] ;
            n4294DisNPzasL = H00KG5_n4294DisNPzasL[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4294DisNPzasL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4294DisNPzasL), 6, 0));
            A4293DisNPzas = H00KG5_A4293DisNPzas[0] ;
            n4293DisNPzas = H00KG5_n4293DisNPzas[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4293DisNPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4293DisNPzas), 6, 0));
            A4014DisTin = H00KG5_A4014DisTin[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4014DisTin", A4014DisTin);
            A4013DisEnv = H00KG5_A4013DisEnv[0] ;
            n4013DisEnv = H00KG5_n4013DisEnv[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4013DisEnv", GXutil.str( A4013DisEnv, 1, 0));
            A3627DisFecLan = H00KG5_A3627DisFecLan[0] ;
            n3627DisFecLan = H00KG5_n3627DisFecLan[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3627DisFecLan", localUtil.format(A3627DisFecLan, "99/99/99"));
            A2310DisCliDes = H00KG5_A2310DisCliDes[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2310DisCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2310DisCliDes), 6, 0));
            A3309DisNumTon = H00KG5_A3309DisNumTon[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3309DisNumTon", A3309DisNumTon);
            A3308DisManCod2 = H00KG5_A3308DisManCod2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3308DisManCod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3308DisManCod2), 4, 0));
            A3307DisManCod1 = H00KG5_A3307DisManCod1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3307DisManCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3307DisManCod1), 4, 0));
            A3306DisFac = H00KG5_A3306DisFac[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3306DisFac", A3306DisFac);
            A1122MaqCodDis = H00KG5_A1122MaqCodDis[0] ;
            n1122MaqCodDis = H00KG5_n1122MaqCodDis[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1122MaqCodDis", A1122MaqCodDis);
            A3132DisGraCru2 = H00KG5_A3132DisGraCru2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3132DisGraCru2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3132DisGraCru2), 4, 0));
            A3131DisGraAca2 = H00KG5_A3131DisGraAca2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3131DisGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3131DisGraAca2), 4, 0));
            A3130DisAncSal3 = H00KG5_A3130DisAncSal3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3130DisAncSal3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3130DisAncSal3), 4, 0));
            A3129DisAncSal2 = H00KG5_A3129DisAncSal2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3129DisAncSal2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3129DisAncSal2), 4, 0));
            A3128DisAncSal1 = H00KG5_A3128DisAncSal1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3128DisAncSal1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3128DisAncSal1), 4, 0));
            A3127DisNumCor = H00KG5_A3127DisNumCor[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3127DisNumCor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3127DisNumCor), 4, 0));
            A2835DisPle2 = H00KG5_A2835DisPle2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2835DisPle2", A2835DisPle2);
            A2833DisMtrLot = H00KG5_A2833DisMtrLot[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2833DisMtrLot", GXutil.ltrimstr( A2833DisMtrLot, 9, 2));
            A2832DisKgsLot = H00KG5_A2832DisKgsLot[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2832DisKgsLot", GXutil.ltrimstr( A2832DisKgsLot, 9, 2));
            A2831DisNumLot = H00KG5_A2831DisNumLot[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2831DisNumLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2831DisNumLot), 8, 0));
            A2009DisTipDis = H00KG5_A2009DisTipDis[0] ;
            n2009DisTipDis = H00KG5_n2009DisTipDis[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2009DisTipDis", A2009DisTipDis);
            A1908DisRdoA = H00KG5_A1908DisRdoA[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1908DisRdoA", GXutil.ltrimstr( A1908DisRdoA, 6, 2));
            A1907DisRdoN = H00KG5_A1907DisRdoN[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1907DisRdoN", GXutil.ltrimstr( A1907DisRdoN, 6, 2));
            A1906DisGraAca = H00KG5_A1906DisGraAca[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1906DisGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1906DisGraAca), 4, 0));
            A1502DisPart = H00KG5_A1502DisPart[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1502DisPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1502DisPart), 4, 0));
            A1430DisLoc = H00KG5_A1430DisLoc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1430DisLoc", A1430DisLoc);
            A1225DisGraCru = H00KG5_A1225DisGraCru[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1225DisGraCru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1225DisGraCru), 4, 0));
            A375DisNumUni = H00KG5_A375DisNumUni[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A375DisNumUni", GXutil.ltrimstr( A375DisNumUni, 9, 2));
            A374DisNumPie = H00KG5_A374DisNumPie[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
            A1198DisEncAnh = H00KG5_A1198DisEncAnh[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1198DisEncAnh", GXutil.ltrimstr( A1198DisEncAnh, 6, 2));
            A1197DisEncCom = H00KG5_A1197DisEncCom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1197DisEncCom", GXutil.ltrimstr( A1197DisEncCom, 6, 2));
            A1196DisNumCli = H00KG5_A1196DisNumCli[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1196DisNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1196DisNumCli), 6, 0));
            A1195DisNomCli = H00KG5_A1195DisNomCli[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1195DisNomCli", A1195DisNomCli);
            A373DisMtrLan = H00KG5_A373DisMtrLan[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A373DisMtrLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A373DisMtrLan), 4, 0));
            A372DisKgmLan = H00KG5_A372DisKgmLan[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A372DisKgmLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A372DisKgmLan), 4, 0));
            A383DisPieLan = H00KG5_A383DisPieLan[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A383DisPieLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A383DisPieLan), 4, 0));
            A389DisPreMtr = H00KG5_A389DisPreMtr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A389DisPreMtr", GXutil.ltrimstr( A389DisPreMtr, 10, 2));
            A388DisPreKgm = H00KG5_A388DisPreKgm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A388DisPreKgm", GXutil.ltrimstr( A388DisPreKgm, 10, 2));
            A367DisEst = H00KG5_A367DisEst[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A367DisEst", GXutil.str( A367DisEst, 1, 0));
            A1233DisArtAc2 = H00KG5_A1233DisArtAc2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1233DisArtAc2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1233DisArtAc2), 3, 0));
            A1232DisArtAcb = H00KG5_A1232DisArtAcb[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1232DisArtAcb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1232DisArtAcb), 3, 0));
            A1231DisArtAn1 = H00KG5_A1231DisArtAn1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1231DisArtAn1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1231DisArtAn1), 3, 0));
            A334DisArtAnh = H00KG5_A334DisArtAnh[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A334DisArtAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A334DisArtAnh), 3, 0));
            A342DisArtPes = H00KG5_A342DisArtPes[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A342DisArtPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A342DisArtPes), 4, 0));
            A349DisArtPu3 = H00KG5_A349DisArtPu3[0] ;
            n349DisArtPu3 = H00KG5_n349DisArtPu3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A349DisArtPu3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A349DisArtPu3), 3, 0));
            A358DisArtUr3 = H00KG5_A358DisArtUr3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A358DisArtUr3", A358DisArtUr3);
            A348DisArtPu2 = H00KG5_A348DisArtPu2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A348DisArtPu2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A348DisArtPu2), 3, 0));
            A357DisArtUr2 = H00KG5_A357DisArtUr2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A357DisArtUr2", A357DisArtUr2);
            A347DisArtPu1 = H00KG5_A347DisArtPu1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A347DisArtPu1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A347DisArtPu1), 3, 0));
            A356DisArtUr1 = H00KG5_A356DisArtUr1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A356DisArtUr1", A356DisArtUr1);
            A359DisArtUrg = H00KG5_A359DisArtUrg[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A359DisArtUrg", GXutil.str( A359DisArtUrg, 1, 0));
            A350DisArtRdt = H00KG5_A350DisArtRdt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A350DisArtRdt", GXutil.ltrimstr( A350DisArtRdt, 6, 2));
            A346DisArtPt3 = H00KG5_A346DisArtPt3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A346DisArtPt3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A346DisArtPt3), 3, 0));
            A355DisArtTr3 = H00KG5_A355DisArtTr3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A355DisArtTr3", A355DisArtTr3);
            A345DisArtPt2 = H00KG5_A345DisArtPt2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A345DisArtPt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A345DisArtPt2), 3, 0));
            A354DisArtTr2 = H00KG5_A354DisArtTr2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A354DisArtTr2", A354DisArtTr2);
            A344DisArtPt1 = H00KG5_A344DisArtPt1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A344DisArtPt1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A344DisArtPt1), 3, 0));
            A279CliNom = H00KG5_A279CliNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", A279CliNom);
            A1901CliCtrl = H00KG5_A1901CliCtrl[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1901CliCtrl", A1901CliCtrl);
            A12773DisProdDs = H00KG5_A12773DisProdDs[0] ;
            n12773DisProdDs = H00KG5_n12773DisProdDs[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12773DisProdDs", A12773DisProdDs);
            A379DisPie = H00KG5_A379DisPie[0] ;
            n379DisPie = H00KG5_n379DisPie[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A379DisPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A379DisPie), 4, 0));
            A387DisPiePie = H00KG5_A387DisPiePie[0] ;
            n387DisPiePie = H00KG5_n387DisPiePie[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
            {
               A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
            }
            else
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
               {
                  A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
               }
               else
               {
                  A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
               }
            }
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
            {
               A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
            }
            else
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
               {
                  A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
               }
               else
               {
                  A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
               }
            }
            if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               A391DisUni = getDisUni0( A396EmprCod, A361DisCod) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A391DisUni", GXutil.ltrimstr( A391DisUni, 9, 2));
            }
            else
            {
               if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "M", "")) == 0 )
               {
                  A391DisUni = getDisUni1( A396EmprCod, A361DisCod) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A391DisUni", GXutil.ltrimstr( A391DisUni, 9, 2));
               }
               else
               {
                  A391DisUni = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A391DisUni", GXutil.ltrimstr( A391DisUni, 9, 2));
               }
            }
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A386DisPieNor = (short)(getDisPieNor0( A396EmprCod, A361DisCod)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A386DisPieNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A386DisPieNor), 4, 0));
            }
            else
            {
               A386DisPieNor = (short)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A386DisPieNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A386DisPieNor), 4, 0));
            }
            GXt_char1 = A475FindCol ;
            GXv_char2[0] = GXt_char1 ;
            new app.pedidos.dis_findcol_validate(remoteHandle, context).execute( A396EmprCod, A252CliCod, A335DisArtCod, A362DisColNom, A363DisColNum, A390DisTipCol, GXv_char2) ;
            nwdpalmacentejidotdispos_impl.this.GXt_char1 = GXv_char2[0] ;
            A475FindCol = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A475FindCol", A475FindCol);
            A253CliCodDis = A252CliCod ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A253CliCodDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A253CliCodDis), 6, 0));
            /* Execute user event: Load */
            e12KG2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         wbKG0( ) ;
      }
   }

   public void send_integrity_lvl_hashesKG2( )
   {
   }

   public void before_start_formulas( )
   {
      AV17Pgmname = "NwDPAlmacenTejidoTDISPOS" ;
      Gx_err = (short)(0) ;
      /* Using cursor H00KG6 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      A407EmprNom = H00KG6_A407EmprNom[0] ;
      n407EmprNom = H00KG6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      A399EmprCodDis = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A399EmprCodDis", A399EmprCodDis);
      /* Using cursor H00KG8 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A379DisPie = H00KG8_A379DisPie[0] ;
         n379DisPie = H00KG8_n379DisPie[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A379DisPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A379DisPie), 4, 0));
      }
      else
      {
         A379DisPie = (short)(0) ;
         n379DisPie = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A379DisPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A379DisPie), 4, 0));
      }
      pr_default.close(3);
      /* Using cursor H00KG10 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         A387DisPiePie = H00KG10_A387DisPiePie[0] ;
         n387DisPiePie = H00KG10_n387DisPiePie[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
      }
      else
      {
         A387DisPiePie = (short)(0) ;
         n387DisPiePie = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
      }
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
      fix_multi_value_controls( ) ;
   }

   public void strupKG0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11KG2 ();
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
         A370DisFecCli = localUtil.ctod( httpContext.cgiGet( edtDisFecCli_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A370DisFecCli", localUtil.format(A370DisFecCli, "99/99/99"));
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
         A337DisArtDsc = httpContext.cgiGet( edtDisArtDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A337DisArtDsc", A337DisArtDsc);
         A340DisArtMat = httpContext.cgiGet( edtDisArtMat_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A340DisArtMat", A340DisArtMat);
         A339DisArtLar = httpContext.cgiGet( edtDisArtLar_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A339DisArtLar", A339DisArtLar);
         A351DisArtSua = httpContext.cgiGet( edtDisArtSua_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A351DisArtSua", A351DisArtSua);
         A333DisArtAca = httpContext.cgiGet( edtDisArtAca_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A333DisArtAca", A333DisArtAca);
         A343DisArtPle = httpContext.cgiGet( edtDisArtPle_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A343DisArtPle", A343DisArtPle);
         A352DisArtTip = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A352DisArtTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A352DisArtTip), 4, 0));
         A338DisArtEnc = ((GXutil.strcmp(httpContext.cgiGet( chkDisArtEnc.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A338DisArtEnc", A338DisArtEnc);
         A336DisArtCor = ((GXutil.strcmp(httpContext.cgiGet( chkDisArtCor.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A336DisArtCor", A336DisArtCor);
         A341DisArtOpe = GXutil.upper( httpContext.cgiGet( edtDisArtOpe_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A341DisArtOpe", A341DisArtOpe);
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
         A350DisArtRdt = localUtil.ctond( httpContext.cgiGet( edtDisArtRdt_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A350DisArtRdt", GXutil.ltrimstr( A350DisArtRdt, 6, 2));
         A359DisArtUrg = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisArtUrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A359DisArtUrg", GXutil.str( A359DisArtUrg, 1, 0));
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
         A342DisArtPes = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A342DisArtPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A342DisArtPes), 4, 0));
         A334DisArtAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A334DisArtAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A334DisArtAnh), 3, 0));
         A1231DisArtAn1 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtAn1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1231DisArtAn1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1231DisArtAn1), 3, 0));
         A1232DisArtAcb = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtAcb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1232DisArtAcb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1232DisArtAcb), 3, 0));
         A1233DisArtAc2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtAc2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1233DisArtAc2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1233DisArtAc2), 3, 0));
         A387DisPiePie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPiePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n387DisPiePie = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
         A385DisPieMtr = localUtil.ctond( httpContext.cgiGet( edtDisPieMtr_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
         A381DisPieKgm = localUtil.ctond( httpContext.cgiGet( edtDisPieKgm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
         cmbDisEst.setValue( httpContext.cgiGet( cmbDisEst.getInternalname()) );
         A367DisEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbDisEst.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A367DisEst", GXutil.str( A367DisEst, 1, 0));
         A388DisPreKgm = localUtil.ctond( httpContext.cgiGet( edtDisPreKgm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A388DisPreKgm", GXutil.ltrimstr( A388DisPreKgm, 10, 2));
         A389DisPreMtr = localUtil.ctond( httpContext.cgiGet( edtDisPreMtr_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A389DisPreMtr", GXutil.ltrimstr( A389DisPreMtr, 10, 2));
         A383DisPieLan = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPieLan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A383DisPieLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A383DisPieLan), 4, 0));
         A372DisKgmLan = (short)(localUtil.ctol( httpContext.cgiGet( edtDisKgmLan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A372DisKgmLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A372DisKgmLan), 4, 0));
         A373DisMtrLan = (short)(localUtil.ctol( httpContext.cgiGet( edtDisMtrLan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A373DisMtrLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A373DisMtrLan), 4, 0));
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
         A1197DisEncCom = localUtil.ctond( httpContext.cgiGet( edtDisEncCom_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1197DisEncCom", GXutil.ltrimstr( A1197DisEncCom, 6, 2));
         A1198DisEncAnh = localUtil.ctond( httpContext.cgiGet( edtDisEncAnh_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1198DisEncAnh", GXutil.ltrimstr( A1198DisEncAnh, 6, 2));
         A390DisTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n390DisTipCol = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
         A365DisDes = ((GXutil.strcmp(httpContext.cgiGet( chkDisDes.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A365DisDes", A365DisDes);
         A374DisNumPie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisNumPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
         A375DisNumUni = localUtil.ctond( httpContext.cgiGet( edtDisNumUni_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A375DisNumUni", GXutil.ltrimstr( A375DisNumUni, 9, 2));
         A392DisUniMed = GXutil.upper( httpContext.cgiGet( edtDisUniMed_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A392DisUniMed", A392DisUniMed);
         A399EmprCodDis = GXutil.upper( httpContext.cgiGet( edtEmprCodDis_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A399EmprCodDis", A399EmprCodDis);
         A253CliCodDis = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCodDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A253CliCodDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A253CliCodDis), 6, 0));
         A475FindCol = httpContext.cgiGet( edtFindCol_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A475FindCol", A475FindCol);
         A379DisPie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n379DisPie = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A379DisPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A379DisPie), 4, 0));
         A391DisUni = localUtil.ctond( httpContext.cgiGet( edtDisUni_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A391DisUni", GXutil.ltrimstr( A391DisUni, 9, 2));
         A1225DisGraCru = (short)(localUtil.ctol( httpContext.cgiGet( edtDisGraCru_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1225DisGraCru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1225DisGraCru), 4, 0));
         A386DisPieNor = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPieNor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A386DisPieNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A386DisPieNor), 4, 0));
         A1430DisLoc = httpContext.cgiGet( edtDisLoc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1430DisLoc", A1430DisLoc);
         A1502DisPart = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1502DisPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1502DisPart), 4, 0));
         A1906DisGraAca = (short)(localUtil.ctol( httpContext.cgiGet( edtDisGraAca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1906DisGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1906DisGraAca), 4, 0));
         A1907DisRdoN = localUtil.ctond( httpContext.cgiGet( edtDisRdoN_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1907DisRdoN", GXutil.ltrimstr( A1907DisRdoN, 6, 2));
         A1908DisRdoA = localUtil.ctond( httpContext.cgiGet( edtDisRdoA_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1908DisRdoA", GXutil.ltrimstr( A1908DisRdoA, 6, 2));
         A2009DisTipDis = GXutil.upper( httpContext.cgiGet( edtDisTipDis_Internalname)) ;
         n2009DisTipDis = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2009DisTipDis", A2009DisTipDis);
         A2831DisNumLot = (int)(localUtil.ctol( httpContext.cgiGet( edtDisNumLot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2831DisNumLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2831DisNumLot), 8, 0));
         A2832DisKgsLot = localUtil.ctond( httpContext.cgiGet( edtDisKgsLot_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2832DisKgsLot", GXutil.ltrimstr( A2832DisKgsLot, 9, 2));
         A2833DisMtrLot = localUtil.ctond( httpContext.cgiGet( edtDisMtrLot_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2833DisMtrLot", GXutil.ltrimstr( A2833DisMtrLot, 9, 2));
         A2835DisPle2 = httpContext.cgiGet( edtDisPle2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2835DisPle2", A2835DisPle2);
         A3127DisNumCor = (short)(localUtil.ctol( httpContext.cgiGet( edtDisNumCor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3127DisNumCor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3127DisNumCor), 4, 0));
         A3128DisAncSal1 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisAncSal1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3128DisAncSal1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3128DisAncSal1), 4, 0));
         A3129DisAncSal2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisAncSal2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3129DisAncSal2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3129DisAncSal2), 4, 0));
         A3130DisAncSal3 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisAncSal3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3130DisAncSal3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3130DisAncSal3), 4, 0));
         A3131DisGraAca2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisGraAca2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3131DisGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3131DisGraAca2), 4, 0));
         A3132DisGraCru2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisGraCru2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3132DisGraCru2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3132DisGraCru2), 4, 0));
         A1122MaqCodDis = httpContext.cgiGet( edtMaqCodDis_Internalname) ;
         n1122MaqCodDis = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1122MaqCodDis", A1122MaqCodDis);
         A3306DisFac = ((GXutil.strcmp(httpContext.cgiGet( chkDisFac.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3306DisFac", A3306DisFac);
         A3307DisManCod1 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisManCod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3307DisManCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3307DisManCod1), 4, 0));
         A3308DisManCod2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisManCod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3308DisManCod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3308DisManCod2), 4, 0));
         A3309DisNumTon = httpContext.cgiGet( edtDisNumTon_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3309DisNumTon", A3309DisNumTon);
         A2310DisCliDes = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCliDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2310DisCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2310DisCliDes), 6, 0));
         A3627DisFecLan = localUtil.ctod( httpContext.cgiGet( edtDisFecLan_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n3627DisFecLan = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3627DisFecLan", localUtil.format(A3627DisFecLan, "99/99/99"));
         A4013DisEnv = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4013DisEnv = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4013DisEnv", GXutil.str( A4013DisEnv, 1, 0));
         A4014DisTin = ((GXutil.strcmp(httpContext.cgiGet( chkDisTin.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4014DisTin", A4014DisTin);
         A4293DisNPzas = (int)(localUtil.ctol( httpContext.cgiGet( edtDisNPzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4293DisNPzas = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4293DisNPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4293DisNPzas), 6, 0));
         A4294DisNPzasL = (int)(localUtil.ctol( httpContext.cgiGet( edtDisNPzasL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4294DisNPzasL = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4294DisNPzasL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4294DisNPzasL), 6, 0));
         A4348DisUsrCod = httpContext.cgiGet( edtDisUsrCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4348DisUsrCod", A4348DisUsrCod);
         A1013DibCli = httpContext.cgiGet( edtDibCli_Internalname) ;
         n1013DibCli = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1013DibCli", A1013DibCli);
         A1014DibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1014DibInt = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A5031DisCom = httpContext.cgiGet( edtDisCom_Internalname) ;
         n5031DisCom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5031DisCom", A5031DisCom);
         A1031EmpesCod = httpContext.cgiGet( edtEmpesCod_Internalname) ;
         n1031EmpesCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1031EmpesCod", A1031EmpesCod);
         A7511DisFacSep = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkDisFacSep.getInternalname()), "1")==0) ? 1 : 0)) ;
         n7511DisFacSep = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7511DisFacSep", GXutil.str( A7511DisFacSep, 1, 0));
         A7512DisFacGra = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkDisFacGra.getInternalname()), "1")==0) ? 1 : 0)) ;
         n7512DisFacGra = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7512DisFacGra", GXutil.str( A7512DisFacGra, 1, 0));
         A7513DisOrdSep = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkDisOrdSep.getInternalname()), "1")==0) ? 1 : 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7513DisOrdSep", GXutil.str( A7513DisOrdSep, 1, 0));
         A7514DisOrdGra = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkDisOrdGra.getInternalname()), "1")==0) ? 1 : 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7514DisOrdGra", GXutil.str( A7514DisOrdGra, 1, 0));
         A7515DisDesCol = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkDisDesCol.getInternalname()), "1")==0) ? 1 : 0)) ;
         n7515DisDesCol = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7515DisDesCol", GXutil.str( A7515DisDesCol, 1, 0));
         cmbDisGraTam.setValue( httpContext.cgiGet( cmbDisGraTam.getInternalname()) );
         A7516DisGraTam = httpContext.cgiGet( cmbDisGraTam.getInternalname()) ;
         n7516DisGraTam = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7516DisGraTam", A7516DisGraTam);
         A1901CliCtrl = ((GXutil.strcmp(httpContext.cgiGet( chkCliCtrl.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1901CliCtrl", A1901CliCtrl);
         A7523DisRec = httpContext.cgiGet( edtDisRec_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7523DisRec", A7523DisRec);
         A7738DisMaqEst = httpContext.cgiGet( edtDisMaqEst_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7738DisMaqEst", A7738DisMaqEst);
         A7739DisExp = ((GXutil.strcmp(httpContext.cgiGet( chkDisExp.getInternalname()), "E")==0) ? "E" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7739DisExp", A7739DisExp);
         A4813DisEncCli = httpContext.cgiGet( edtDisEncCli_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4813DisEncCli", A4813DisEncCli);
         A9771DisItem1 = httpContext.cgiGet( edtDisItem1_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9771DisItem1", A9771DisItem1);
         A9772DisItem2 = httpContext.cgiGet( edtDisItem2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9772DisItem2", A9772DisItem2);
         A9773DisItem3 = httpContext.cgiGet( edtDisItem3_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9773DisItem3", A9773DisItem3);
         A9774DisItem4 = httpContext.cgiGet( edtDisItem4_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9774DisItem4", A9774DisItem4);
         A9786DisItem5 = httpContext.cgiGet( edtDisItem5_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9786DisItem5", A9786DisItem5);
         A9787DisItem6 = httpContext.cgiGet( edtDisItem6_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9787DisItem6", A9787DisItem6);
         A5252DisAcc = ((GXutil.strcmp(httpContext.cgiGet( chkDisAcc.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5252DisAcc", A5252DisAcc);
         A998DisNMtr = httpContext.cgiGet( edtDisNMtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A998DisNMtr", A998DisNMtr);
         A4355DisFecPed = localUtil.ctod( httpContext.cgiGet( edtDisFecPed_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n4355DisFecPed = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4355DisFecPed", localUtil.format(A4355DisFecPed, "99/99/99"));
         A4877DibColCol = httpContext.cgiGet( edtDibColCol_Internalname) ;
         n4877DibColCol = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4877DibColCol", A4877DibColCol);
         A4919DisDibCoCN = (int)(localUtil.ctol( httpContext.cgiGet( edtDisDibCoCN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4919DisDibCoCN = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4919DisDibCoCN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4919DisDibCoCN), 6, 0));
         A4879DibColColN = (int)(localUtil.ctol( httpContext.cgiGet( edtDibColColN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4879DibColColN = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4879DibColColN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4879DibColColN), 6, 0));
         A1002DisNumTen = httpContext.cgiGet( edtDisNumTen_Internalname) ;
         n1002DisNumTen = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1002DisNumTen", A1002DisNumTen);
         A5405DisAntpT = httpContext.cgiGet( edtDisAntpT_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5405DisAntpT", A5405DisAntpT);
         A5366DisAntp = httpContext.cgiGet( edtDisAntp_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5366DisAntp", A5366DisAntp);
         A12765DisPriorid = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisPriorid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12765DisPriorid", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12765DisPriorid), 2, 0));
         A12768DisTpEstam = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisTpEstam_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12768DisTpEstam", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12768DisTpEstam), 2, 0));
         A12772DisProdID = httpContext.cgiGet( edtDisProdID_Internalname) ;
         n12772DisProdID = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12772DisProdID", A12772DisProdID);
         A12773DisProdDs = httpContext.cgiGet( edtDisProdDs_Internalname) ;
         n12773DisProdDs = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12773DisProdDs", A12773DisProdDs);
         A2926DisPla = ((GXutil.strcmp(httpContext.cgiGet( chkDisPla.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2926DisPla", A2926DisPla);
         A13068DisLineaID = (short)(localUtil.ctol( httpContext.cgiGet( edtDisLineaID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13068DisLineaID = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13068DisLineaID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13068DisLineaID), 4, 0));
         A13069DisCanalID = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCanalID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13069DisCanalID = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13069DisCanalID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13069DisCanalID), 6, 0));
         A13076DisLinPrd = httpContext.cgiGet( edtDisLinPrd_Internalname) ;
         n13076DisLinPrd = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13076DisLinPrd", A13076DisLinPrd);
         A13767DisRdto4 = localUtil.ctond( httpContext.cgiGet( edtDisRdto4_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13767DisRdto4", GXutil.ltrimstr( A13767DisRdto4, 7, 40));
         A13768DisTallUlt = (short)(localUtil.ctol( httpContext.cgiGet( edtDisTallUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13768DisTallUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13768DisTallUlt), 4, 0));
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
      e11KG2 ();
      if (returnInSub) return;
   }

   public void e11KG2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV13Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      nwdpalmacentejidotdispos_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13Station = GXt_char1 ;
      GXv_char2[0] = AV14Emprcod ;
      GXv_char3[0] = AV15Emprnom ;
      GXv_char4[0] = AV16Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char2, GXv_char3, GXv_char4) ;
      nwdpalmacentejidotdispos_impl.this.AV14Emprcod = GXv_char2[0] ;
      nwdpalmacentejidotdispos_impl.this.AV15Emprnom = GXv_char3[0] ;
      nwdpalmacentejidotdispos_impl.this.AV16Usurcod = GXv_char4[0] ;
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

   protected void e12KG2( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtEmprNom_Link = formatLink("app.tempparview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","TabCode"})  ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprNom_Internalname, "Link", edtEmprNom_Link, true);
   }

   public void e13KG2( )
   {
      /* 'DoUpdate' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tdispos", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      /*  Sending Event outputs  */
   }

   public void e14KG2( )
   {
      /* 'DoDelete' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tdispos", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {}) );
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
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TDISPOS" );
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
      paKG2( ) ;
      wsKG2( ) ;
      weKG2( ) ;
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
      paKG2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "nwdpalmacentejidotdispos", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paKG2( ) ;
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
      paKG2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsKG2( ) ;
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
      wsKG2( ) ;
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
      weKG2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682414532886", true, true);
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
      httpContext.AddJavascriptSource("nwdpalmacentejidotdispos.js", "?202682414532886", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      chkPriCod.setInternalname( sPrefix+"PRICOD" );
      edtDisCod_Internalname = sPrefix+"DISCOD" ;
      edtEmprNom_Internalname = sPrefix+"EMPRNOM" ;
      edtDisCliNum_Internalname = sPrefix+"DISCLINUM" ;
      edtDisFecCli_Internalname = sPrefix+"DISFECCLI" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtDisArtCod_Internalname = sPrefix+"DISARTCOD" ;
      edtDisFec_Internalname = sPrefix+"DISFEC" ;
      edtDisFecEnt_Internalname = sPrefix+"DISFECENT" ;
      edtDisArtDsc_Internalname = sPrefix+"DISARTDSC" ;
      edtDisArtMat_Internalname = sPrefix+"DISARTMAT" ;
      edtDisArtLar_Internalname = sPrefix+"DISARTLAR" ;
      edtDisArtSua_Internalname = sPrefix+"DISARTSUA" ;
      edtDisArtAca_Internalname = sPrefix+"DISARTACA" ;
      edtDisArtPle_Internalname = sPrefix+"DISARTPLE" ;
      edtDisArtTip_Internalname = sPrefix+"DISARTTIP" ;
      chkDisArtEnc.setInternalname( sPrefix+"DISARTENC" );
      chkDisArtCor.setInternalname( sPrefix+"DISARTCOR" );
      edtDisArtOpe_Internalname = sPrefix+"DISARTOPE" ;
      edtDisArtTr1_Internalname = sPrefix+"DISARTTR1" ;
      edtDisArtPt1_Internalname = sPrefix+"DISARTPT1" ;
      edtDisArtTr2_Internalname = sPrefix+"DISARTTR2" ;
      edtDisArtPt2_Internalname = sPrefix+"DISARTPT2" ;
      edtDisArtTr3_Internalname = sPrefix+"DISARTTR3" ;
      edtDisArtPt3_Internalname = sPrefix+"DISARTPT3" ;
      edtDisArtRdt_Internalname = sPrefix+"DISARTRDT" ;
      edtDisArtUrg_Internalname = sPrefix+"DISARTURG" ;
      edtDisArtUr1_Internalname = sPrefix+"DISARTUR1" ;
      edtDisArtPu1_Internalname = sPrefix+"DISARTPU1" ;
      edtDisArtUr2_Internalname = sPrefix+"DISARTUR2" ;
      edtDisArtPu2_Internalname = sPrefix+"DISARTPU2" ;
      edtDisArtUr3_Internalname = sPrefix+"DISARTUR3" ;
      edtDisArtPu3_Internalname = sPrefix+"DISARTPU3" ;
      edtDisArtPes_Internalname = sPrefix+"DISARTPES" ;
      edtDisArtAnh_Internalname = sPrefix+"DISARTANH" ;
      edtDisArtAn1_Internalname = sPrefix+"DISARTAN1" ;
      edtDisArtAcb_Internalname = sPrefix+"DISARTACB" ;
      edtDisArtAc2_Internalname = sPrefix+"DISARTAC2" ;
      edtDisPiePie_Internalname = sPrefix+"DISPIEPIE" ;
      edtDisPieMtr_Internalname = sPrefix+"DISPIEMTR" ;
      edtDisPieKgm_Internalname = sPrefix+"DISPIEKGM" ;
      cmbDisEst.setInternalname( sPrefix+"DISEST" );
      edtDisPreKgm_Internalname = sPrefix+"DISPREKGM" ;
      edtDisPreMtr_Internalname = sPrefix+"DISPREMTR" ;
      edtDisPieLan_Internalname = sPrefix+"DISPIELAN" ;
      edtDisKgmLan_Internalname = sPrefix+"DISKGMLAN" ;
      edtDisMtrLan_Internalname = sPrefix+"DISMTRLAN" ;
      edtDisColNom_Internalname = sPrefix+"DISCOLNOM" ;
      edtDisColNum_Internalname = sPrefix+"DISCOLNUM" ;
      edtDisNomCli_Internalname = sPrefix+"DISNOMCLI" ;
      edtDisNumCli_Internalname = sPrefix+"DISNUMCLI" ;
      edtDisEncCom_Internalname = sPrefix+"DISENCCOM" ;
      edtDisEncAnh_Internalname = sPrefix+"DISENCANH" ;
      edtDisTipCol_Internalname = sPrefix+"DISTIPCOL" ;
      chkDisDes.setInternalname( sPrefix+"DISDES" );
      edtDisNumPie_Internalname = sPrefix+"DISNUMPIE" ;
      edtDisNumUni_Internalname = sPrefix+"DISNUMUNI" ;
      edtDisUniMed_Internalname = sPrefix+"DISUNIMED" ;
      edtEmprCodDis_Internalname = sPrefix+"EMPRCODDIS" ;
      edtCliCodDis_Internalname = sPrefix+"CLICODDIS" ;
      edtFindCol_Internalname = sPrefix+"FINDCOL" ;
      edtDisPie_Internalname = sPrefix+"DISPIE" ;
      edtDisUni_Internalname = sPrefix+"DISUNI" ;
      edtDisGraCru_Internalname = sPrefix+"DISGRACRU" ;
      edtDisPieNor_Internalname = sPrefix+"DISPIENOR" ;
      edtDisLoc_Internalname = sPrefix+"DISLOC" ;
      edtDisPart_Internalname = sPrefix+"DISPART" ;
      edtDisGraAca_Internalname = sPrefix+"DISGRAACA" ;
      edtDisRdoN_Internalname = sPrefix+"DISRDON" ;
      edtDisRdoA_Internalname = sPrefix+"DISRDOA" ;
      edtDisTipDis_Internalname = sPrefix+"DISTIPDIS" ;
      edtDisNumLot_Internalname = sPrefix+"DISNUMLOT" ;
      edtDisKgsLot_Internalname = sPrefix+"DISKGSLOT" ;
      edtDisMtrLot_Internalname = sPrefix+"DISMTRLOT" ;
      edtDisPle2_Internalname = sPrefix+"DISPLE2" ;
      edtDisNumCor_Internalname = sPrefix+"DISNUMCOR" ;
      edtDisAncSal1_Internalname = sPrefix+"DISANCSAL1" ;
      edtDisAncSal2_Internalname = sPrefix+"DISANCSAL2" ;
      edtDisAncSal3_Internalname = sPrefix+"DISANCSAL3" ;
      edtDisGraAca2_Internalname = sPrefix+"DISGRAACA2" ;
      edtDisGraCru2_Internalname = sPrefix+"DISGRACRU2" ;
      edtMaqCodDis_Internalname = sPrefix+"MAQCODDIS" ;
      chkDisFac.setInternalname( sPrefix+"DISFAC" );
      edtDisManCod1_Internalname = sPrefix+"DISMANCOD1" ;
      edtDisManCod2_Internalname = sPrefix+"DISMANCOD2" ;
      edtDisNumTon_Internalname = sPrefix+"DISNUMTON" ;
      edtDisCliDes_Internalname = sPrefix+"DISCLIDES" ;
      edtDisFecLan_Internalname = sPrefix+"DISFECLAN" ;
      edtDisEnv_Internalname = sPrefix+"DISENV" ;
      chkDisTin.setInternalname( sPrefix+"DISTIN" );
      edtDisNPzas_Internalname = sPrefix+"DISNPZAS" ;
      edtDisNPzasL_Internalname = sPrefix+"DISNPZASL" ;
      edtDisUsrCod_Internalname = sPrefix+"DISUSRCOD" ;
      edtDibCli_Internalname = sPrefix+"DIBCLI" ;
      edtDibInt_Internalname = sPrefix+"DIBINT" ;
      edtDisCom_Internalname = sPrefix+"DISCOM" ;
      edtEmpesCod_Internalname = sPrefix+"EMPESCOD" ;
      chkDisFacSep.setInternalname( sPrefix+"DISFACSEP" );
      chkDisFacGra.setInternalname( sPrefix+"DISFACGRA" );
      chkDisOrdSep.setInternalname( sPrefix+"DISORDSEP" );
      chkDisOrdGra.setInternalname( sPrefix+"DISORDGRA" );
      chkDisDesCol.setInternalname( sPrefix+"DISDESCOL" );
      cmbDisGraTam.setInternalname( sPrefix+"DISGRATAM" );
      chkCliCtrl.setInternalname( sPrefix+"CLICTRL" );
      edtDisRec_Internalname = sPrefix+"DISREC" ;
      edtDisMaqEst_Internalname = sPrefix+"DISMAQEST" ;
      chkDisExp.setInternalname( sPrefix+"DISEXP" );
      edtDisEncCli_Internalname = sPrefix+"DISENCCLI" ;
      edtDisItem1_Internalname = sPrefix+"DISITEM1" ;
      edtDisItem2_Internalname = sPrefix+"DISITEM2" ;
      edtDisItem3_Internalname = sPrefix+"DISITEM3" ;
      edtDisItem4_Internalname = sPrefix+"DISITEM4" ;
      edtDisItem5_Internalname = sPrefix+"DISITEM5" ;
      edtDisItem6_Internalname = sPrefix+"DISITEM6" ;
      chkDisAcc.setInternalname( sPrefix+"DISACC" );
      edtDisNMtr_Internalname = sPrefix+"DISNMTR" ;
      edtDisFecPed_Internalname = sPrefix+"DISFECPED" ;
      edtDibColCol_Internalname = sPrefix+"DIBCOLCOL" ;
      edtDisDibCoCN_Internalname = sPrefix+"DISDIBCOCN" ;
      edtDibColColN_Internalname = sPrefix+"DIBCOLCOLN" ;
      edtDisNumTen_Internalname = sPrefix+"DISNUMTEN" ;
      edtDisAntpT_Internalname = sPrefix+"DISANTPT" ;
      edtDisAntp_Internalname = sPrefix+"DISANTP" ;
      edtDisPriorid_Internalname = sPrefix+"DISPRIORID" ;
      edtDisTpEstam_Internalname = sPrefix+"DISTPESTAM" ;
      edtDisProdID_Internalname = sPrefix+"DISPRODID" ;
      edtDisProdDs_Internalname = sPrefix+"DISPRODDS" ;
      chkDisPla.setInternalname( sPrefix+"DISPLA" );
      edtDisLineaID_Internalname = sPrefix+"DISLINEAID" ;
      edtDisCanalID_Internalname = sPrefix+"DISCANALID" ;
      edtDisLinPrd_Internalname = sPrefix+"DISLINPRD" ;
      edtDisRdto4_Internalname = sPrefix+"DISRDTO4" ;
      edtDisTallUlt_Internalname = sPrefix+"DISTALLULT" ;
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
      edtDisTallUlt_Jsonclick = "" ;
      edtDisTallUlt_Enabled = 0 ;
      edtDisRdto4_Jsonclick = "" ;
      edtDisRdto4_Enabled = 0 ;
      edtDisLinPrd_Jsonclick = "" ;
      edtDisLinPrd_Enabled = 0 ;
      edtDisCanalID_Jsonclick = "" ;
      edtDisCanalID_Enabled = 0 ;
      edtDisLineaID_Jsonclick = "" ;
      edtDisLineaID_Enabled = 0 ;
      chkDisPla.setEnabled( 0 );
      edtDisProdDs_Jsonclick = "" ;
      edtDisProdDs_Enabled = 0 ;
      edtDisProdID_Jsonclick = "" ;
      edtDisProdID_Enabled = 0 ;
      edtDisTpEstam_Jsonclick = "" ;
      edtDisTpEstam_Enabled = 0 ;
      edtDisPriorid_Jsonclick = "" ;
      edtDisPriorid_Enabled = 0 ;
      edtDisAntp_Jsonclick = "" ;
      edtDisAntp_Enabled = 0 ;
      edtDisAntpT_Jsonclick = "" ;
      edtDisAntpT_Enabled = 0 ;
      edtDisNumTen_Jsonclick = "" ;
      edtDisNumTen_Enabled = 0 ;
      edtDibColColN_Jsonclick = "" ;
      edtDibColColN_Enabled = 0 ;
      edtDisDibCoCN_Jsonclick = "" ;
      edtDisDibCoCN_Enabled = 0 ;
      edtDibColCol_Jsonclick = "" ;
      edtDibColCol_Enabled = 0 ;
      edtDisFecPed_Jsonclick = "" ;
      edtDisFecPed_Enabled = 0 ;
      edtDisNMtr_Jsonclick = "" ;
      edtDisNMtr_Enabled = 0 ;
      chkDisAcc.setEnabled( 0 );
      edtDisItem6_Jsonclick = "" ;
      edtDisItem6_Enabled = 0 ;
      edtDisItem5_Jsonclick = "" ;
      edtDisItem5_Enabled = 0 ;
      edtDisItem4_Jsonclick = "" ;
      edtDisItem4_Enabled = 0 ;
      edtDisItem3_Jsonclick = "" ;
      edtDisItem3_Enabled = 0 ;
      edtDisItem2_Jsonclick = "" ;
      edtDisItem2_Enabled = 0 ;
      edtDisItem1_Jsonclick = "" ;
      edtDisItem1_Enabled = 0 ;
      edtDisEncCli_Jsonclick = "" ;
      edtDisEncCli_Enabled = 0 ;
      chkDisExp.setEnabled( 0 );
      edtDisMaqEst_Jsonclick = "" ;
      edtDisMaqEst_Enabled = 0 ;
      edtDisRec_Jsonclick = "" ;
      edtDisRec_Enabled = 0 ;
      chkCliCtrl.setEnabled( 0 );
      cmbDisGraTam.setJsonclick( "" );
      cmbDisGraTam.setEnabled( 0 );
      chkDisDesCol.setEnabled( 0 );
      chkDisOrdGra.setEnabled( 0 );
      chkDisOrdSep.setEnabled( 0 );
      chkDisFacGra.setEnabled( 0 );
      chkDisFacSep.setEnabled( 0 );
      edtEmpesCod_Jsonclick = "" ;
      edtEmpesCod_Enabled = 0 ;
      edtDisCom_Jsonclick = "" ;
      edtDisCom_Enabled = 0 ;
      edtDibInt_Jsonclick = "" ;
      edtDibInt_Enabled = 0 ;
      edtDibCli_Jsonclick = "" ;
      edtDibCli_Enabled = 0 ;
      edtDisUsrCod_Jsonclick = "" ;
      edtDisUsrCod_Enabled = 0 ;
      edtDisNPzasL_Jsonclick = "" ;
      edtDisNPzasL_Enabled = 0 ;
      edtDisNPzas_Jsonclick = "" ;
      edtDisNPzas_Enabled = 0 ;
      chkDisTin.setEnabled( 0 );
      edtDisEnv_Jsonclick = "" ;
      edtDisEnv_Enabled = 0 ;
      edtDisFecLan_Jsonclick = "" ;
      edtDisFecLan_Enabled = 0 ;
      edtDisCliDes_Jsonclick = "" ;
      edtDisCliDes_Enabled = 0 ;
      edtDisNumTon_Jsonclick = "" ;
      edtDisNumTon_Enabled = 0 ;
      edtDisManCod2_Jsonclick = "" ;
      edtDisManCod2_Enabled = 0 ;
      edtDisManCod1_Jsonclick = "" ;
      edtDisManCod1_Enabled = 0 ;
      chkDisFac.setEnabled( 0 );
      edtMaqCodDis_Jsonclick = "" ;
      edtMaqCodDis_Enabled = 0 ;
      edtDisGraCru2_Jsonclick = "" ;
      edtDisGraCru2_Enabled = 0 ;
      edtDisGraAca2_Jsonclick = "" ;
      edtDisGraAca2_Enabled = 0 ;
      edtDisAncSal3_Jsonclick = "" ;
      edtDisAncSal3_Enabled = 0 ;
      edtDisAncSal2_Jsonclick = "" ;
      edtDisAncSal2_Enabled = 0 ;
      edtDisAncSal1_Jsonclick = "" ;
      edtDisAncSal1_Enabled = 0 ;
      edtDisNumCor_Jsonclick = "" ;
      edtDisNumCor_Enabled = 0 ;
      edtDisPle2_Jsonclick = "" ;
      edtDisPle2_Enabled = 0 ;
      edtDisMtrLot_Jsonclick = "" ;
      edtDisMtrLot_Enabled = 0 ;
      edtDisKgsLot_Jsonclick = "" ;
      edtDisKgsLot_Enabled = 0 ;
      edtDisNumLot_Jsonclick = "" ;
      edtDisNumLot_Enabled = 0 ;
      edtDisTipDis_Jsonclick = "" ;
      edtDisTipDis_Enabled = 0 ;
      edtDisRdoA_Jsonclick = "" ;
      edtDisRdoA_Enabled = 0 ;
      edtDisRdoN_Jsonclick = "" ;
      edtDisRdoN_Enabled = 0 ;
      edtDisGraAca_Jsonclick = "" ;
      edtDisGraAca_Enabled = 0 ;
      edtDisPart_Jsonclick = "" ;
      edtDisPart_Enabled = 0 ;
      edtDisLoc_Jsonclick = "" ;
      edtDisLoc_Enabled = 0 ;
      edtDisPieNor_Jsonclick = "" ;
      edtDisPieNor_Enabled = 0 ;
      edtDisGraCru_Jsonclick = "" ;
      edtDisGraCru_Enabled = 0 ;
      edtDisUni_Jsonclick = "" ;
      edtDisUni_Enabled = 0 ;
      edtDisPie_Jsonclick = "" ;
      edtDisPie_Enabled = 0 ;
      edtFindCol_Jsonclick = "" ;
      edtFindCol_Enabled = 0 ;
      edtCliCodDis_Jsonclick = "" ;
      edtCliCodDis_Enabled = 0 ;
      edtEmprCodDis_Jsonclick = "" ;
      edtEmprCodDis_Enabled = 0 ;
      edtDisUniMed_Jsonclick = "" ;
      edtDisUniMed_Enabled = 0 ;
      edtDisNumUni_Jsonclick = "" ;
      edtDisNumUni_Enabled = 0 ;
      edtDisNumPie_Jsonclick = "" ;
      edtDisNumPie_Enabled = 0 ;
      chkDisDes.setEnabled( 0 );
      edtDisTipCol_Jsonclick = "" ;
      edtDisTipCol_Enabled = 0 ;
      edtDisEncAnh_Jsonclick = "" ;
      edtDisEncAnh_Enabled = 0 ;
      edtDisEncCom_Jsonclick = "" ;
      edtDisEncCom_Enabled = 0 ;
      edtDisNumCli_Jsonclick = "" ;
      edtDisNumCli_Enabled = 0 ;
      edtDisNomCli_Jsonclick = "" ;
      edtDisNomCli_Enabled = 0 ;
      edtDisColNum_Jsonclick = "" ;
      edtDisColNum_Enabled = 0 ;
      edtDisColNom_Jsonclick = "" ;
      edtDisColNom_Enabled = 0 ;
      edtDisMtrLan_Jsonclick = "" ;
      edtDisMtrLan_Enabled = 0 ;
      edtDisKgmLan_Jsonclick = "" ;
      edtDisKgmLan_Enabled = 0 ;
      edtDisPieLan_Jsonclick = "" ;
      edtDisPieLan_Enabled = 0 ;
      edtDisPreMtr_Jsonclick = "" ;
      edtDisPreMtr_Enabled = 0 ;
      edtDisPreKgm_Jsonclick = "" ;
      edtDisPreKgm_Enabled = 0 ;
      cmbDisEst.setJsonclick( "" );
      cmbDisEst.setEnabled( 0 );
      edtDisPieKgm_Jsonclick = "" ;
      edtDisPieKgm_Enabled = 0 ;
      edtDisPieMtr_Jsonclick = "" ;
      edtDisPieMtr_Enabled = 0 ;
      edtDisPiePie_Jsonclick = "" ;
      edtDisPiePie_Enabled = 0 ;
      edtDisArtAc2_Jsonclick = "" ;
      edtDisArtAc2_Enabled = 0 ;
      edtDisArtAcb_Jsonclick = "" ;
      edtDisArtAcb_Enabled = 0 ;
      edtDisArtAn1_Jsonclick = "" ;
      edtDisArtAn1_Enabled = 0 ;
      edtDisArtAnh_Jsonclick = "" ;
      edtDisArtAnh_Enabled = 0 ;
      edtDisArtPes_Jsonclick = "" ;
      edtDisArtPes_Enabled = 0 ;
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
      edtDisArtUrg_Jsonclick = "" ;
      edtDisArtUrg_Enabled = 0 ;
      edtDisArtRdt_Jsonclick = "" ;
      edtDisArtRdt_Enabled = 0 ;
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
      edtDisArtOpe_Jsonclick = "" ;
      edtDisArtOpe_Enabled = 0 ;
      chkDisArtCor.setEnabled( 0 );
      chkDisArtEnc.setEnabled( 0 );
      edtDisArtTip_Jsonclick = "" ;
      edtDisArtTip_Enabled = 0 ;
      edtDisArtPle_Jsonclick = "" ;
      edtDisArtPle_Enabled = 0 ;
      edtDisArtAca_Jsonclick = "" ;
      edtDisArtAca_Enabled = 0 ;
      edtDisArtSua_Jsonclick = "" ;
      edtDisArtSua_Enabled = 0 ;
      edtDisArtLar_Jsonclick = "" ;
      edtDisArtLar_Enabled = 0 ;
      edtDisArtMat_Jsonclick = "" ;
      edtDisArtMat_Enabled = 0 ;
      edtDisArtDsc_Jsonclick = "" ;
      edtDisArtDsc_Enabled = 0 ;
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
      edtDisFecCli_Jsonclick = "" ;
      edtDisFecCli_Enabled = 0 ;
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
      cmbDisEst.setName( "DISEST" );
      cmbDisEst.setWebtags( "" );
      cmbDisEst.addItem("1", httpContext.getMessage( "En Pedido", ""), (short)(0));
      cmbDisEst.addItem("3", httpContext.getMessage( "En Produccion", ""), (short)(0));
      if ( cmbDisEst.getItemCount() > 0 )
      {
      }
      chkDisDes.setName( "DISDES" );
      chkDisDes.setWebtags( "" );
      chkDisDes.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisDes.getInternalname(), "TitleCaption", chkDisDes.getCaption(), true);
      chkDisDes.setCheckedValue( "N" );
      chkDisFac.setName( "DISFAC" );
      chkDisFac.setWebtags( "" );
      chkDisFac.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisFac.getInternalname(), "TitleCaption", chkDisFac.getCaption(), true);
      chkDisFac.setCheckedValue( "N" );
      chkDisTin.setName( "DISTIN" );
      chkDisTin.setWebtags( "" );
      chkDisTin.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisTin.getInternalname(), "TitleCaption", chkDisTin.getCaption(), true);
      chkDisTin.setCheckedValue( "N" );
      chkDisFacSep.setName( "DISFACSEP" );
      chkDisFacSep.setWebtags( "" );
      chkDisFacSep.setCaption( httpContext.getMessage( "Fac. Sep?", "") );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisFacSep.getInternalname(), "TitleCaption", chkDisFacSep.getCaption(), true);
      chkDisFacSep.setCheckedValue( "0" );
      chkDisFacGra.setName( "DISFACGRA" );
      chkDisFacGra.setWebtags( "" );
      chkDisFacGra.setCaption( httpContext.getMessage( "Fac Gra?", "") );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisFacGra.getInternalname(), "TitleCaption", chkDisFacGra.getCaption(), true);
      chkDisFacGra.setCheckedValue( "0" );
      chkDisOrdSep.setName( "DISORDSEP" );
      chkDisOrdSep.setWebtags( "" );
      chkDisOrdSep.setCaption( httpContext.getMessage( "Ord Sep?", "") );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisOrdSep.getInternalname(), "TitleCaption", chkDisOrdSep.getCaption(), true);
      chkDisOrdSep.setCheckedValue( "0" );
      chkDisOrdGra.setName( "DISORDGRA" );
      chkDisOrdGra.setWebtags( "" );
      chkDisOrdGra.setCaption( httpContext.getMessage( "Ord Gra?", "") );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisOrdGra.getInternalname(), "TitleCaption", chkDisOrdGra.getCaption(), true);
      chkDisOrdGra.setCheckedValue( "0" );
      chkDisDesCol.setName( "DISDESCOL" );
      chkDisDesCol.setWebtags( "" );
      chkDisDesCol.setCaption( httpContext.getMessage( "Des Col?", "") );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisDesCol.getInternalname(), "TitleCaption", chkDisDesCol.getCaption(), true);
      chkDisDesCol.setCheckedValue( "0" );
      cmbDisGraTam.setName( "DISGRATAM" );
      cmbDisGraTam.setWebtags( "" );
      cmbDisGraTam.addItem("G", httpContext.getMessage( "Grande", ""), (short)(0));
      cmbDisGraTam.addItem("P", httpContext.getMessage( "Prenda", ""), (short)(0));
      if ( cmbDisGraTam.getItemCount() > 0 )
      {
      }
      chkCliCtrl.setName( "CLICTRL" );
      chkCliCtrl.setWebtags( "" );
      chkCliCtrl.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkCliCtrl.getInternalname(), "TitleCaption", chkCliCtrl.getCaption(), true);
      chkCliCtrl.setCheckedValue( "N" );
      chkDisExp.setName( "DISEXP" );
      chkDisExp.setWebtags( "" );
      chkDisExp.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisExp.getInternalname(), "TitleCaption", chkDisExp.getCaption(), true);
      chkDisExp.setCheckedValue( "N" );
      chkDisAcc.setName( "DISACC" );
      chkDisAcc.setWebtags( "" );
      chkDisAcc.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisAcc.getInternalname(), "TitleCaption", chkDisAcc.getCaption(), true);
      chkDisAcc.setCheckedValue( "N" );
      chkDisPla.setName( "DISPLA" );
      chkDisPla.setWebtags( "" );
      chkDisPla.setCaption( httpContext.getMessage( "¿Muestras?", "") );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisPla.getInternalname(), "TitleCaption", chkDisPla.getCaption(), true);
      chkDisPla.setCheckedValue( "N" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'},{av:'A7511DisFacSep',fld:'DISFACSEP',pic:'9'},{av:'A7512DisFacGra',fld:'DISFACGRA',pic:'9'},{av:'A7513DisOrdSep',fld:'DISORDSEP',pic:'9'},{av:'A7514DisOrdGra',fld:'DISORDGRA',pic:'9'},{av:'A7515DisDesCol',fld:'DISDESCOL',pic:'9'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A7739DisExp',fld:'DISEXP',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e13KG2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOUPDATE'",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DODELETE'","{handler:'e14KG2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
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
      setEventMetadata("VALID_DISDES","{handler:'valid_Disdes',iparms:[]");
      setEventMetadata("VALID_DISDES",",oparms:[]}");
      setEventMetadata("VALID_DISUNIMED","{handler:'valid_Disunimed',iparms:[]");
      setEventMetadata("VALID_DISUNIMED",",oparms:[]}");
      setEventMetadata("VALID_DISPRODID","{handler:'valid_Disprodid',iparms:[]");
      setEventMetadata("VALID_DISPRODID",",oparms:[]}");
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
   public int getDisPieNor0( String E396EmprCod ,
                             int E361DisCod )
   {
      X673Piezas = 0 ;
      /* Using cursor H00KG11 */
      pr_default.execute(5, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         X673Piezas = H00KG11_A673Piezas[0] ;
      }
      pr_default.close(5);
      return X673Piezas ;
   }

   public java.math.BigDecimal getDisUni1( String E396EmprCod ,
                                           int E361DisCod )
   {
      X631Metros = DecimalUtil.ZERO ;
      /* Using cursor H00KG12 */
      pr_default.execute(6, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         X631Metros = H00KG12_A631Metros[0] ;
      }
      pr_default.close(6);
      return X631Metros ;
   }

   public java.math.BigDecimal getDisUni0( String E396EmprCod ,
                                           int E361DisCod )
   {
      X595Kilos = DecimalUtil.ZERO ;
      /* Using cursor H00KG13 */
      pr_default.execute(7, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         X595Kilos = H00KG13_A595Kilos[0] ;
      }
      pr_default.close(7);
      return X595Kilos ;
   }

   public java.math.BigDecimal getDisPieKgm1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X595Kilos = DecimalUtil.ZERO ;
      /* Using cursor H00KG14 */
      pr_default.execute(8, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         X595Kilos = H00KG14_A595Kilos[0] ;
      }
      pr_default.close(8);
      return X595Kilos ;
   }

   public java.math.BigDecimal getDisPieKgm0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X382DisPieKil = DecimalUtil.ZERO ;
      /* Using cursor H00KG15 */
      pr_default.execute(9, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         X382DisPieKil = H00KG15_A382DisPieKil[0] ;
      }
      pr_default.close(9);
      return X382DisPieKil ;
   }

   public java.math.BigDecimal getDisPieMtr1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X631Metros = DecimalUtil.doubleToDec(0) ;
      /* Using cursor H00KG16 */
      pr_default.execute(10, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         X631Metros = H00KG16_A631Metros[0] ;
      }
      pr_default.close(10);
      return X631Metros ;
   }

   public java.math.BigDecimal getDisPieMtr0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X384DisPieMet = DecimalUtil.doubleToDec(0) ;
      /* Using cursor H00KG17 */
      pr_default.execute(11, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         X384DisPieMet = H00KG17_A384DisPieMet[0] ;
      }
      pr_default.close(11);
      return X384DisPieMet ;
   }

   public void initialize( )
   {
      wcpOA396EmprCod = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
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
      A370DisFecCli = GXutil.nullDate() ;
      A279CliNom = "" ;
      A335DisArtCod = "" ;
      A369DisFec = GXutil.nullDate() ;
      A371DisFecEnt = GXutil.nullDate() ;
      A337DisArtDsc = "" ;
      A340DisArtMat = "" ;
      A339DisArtLar = "" ;
      A351DisArtSua = "" ;
      A333DisArtAca = "" ;
      A343DisArtPle = "" ;
      A338DisArtEnc = "" ;
      A336DisArtCor = "" ;
      A341DisArtOpe = "" ;
      A353DisArtTr1 = "" ;
      A354DisArtTr2 = "" ;
      A355DisArtTr3 = "" ;
      A350DisArtRdt = DecimalUtil.ZERO ;
      A356DisArtUr1 = "" ;
      A357DisArtUr2 = "" ;
      A358DisArtUr3 = "" ;
      A385DisPieMtr = DecimalUtil.ZERO ;
      A381DisPieKgm = DecimalUtil.ZERO ;
      A388DisPreKgm = DecimalUtil.ZERO ;
      A389DisPreMtr = DecimalUtil.ZERO ;
      A362DisColNom = "" ;
      A1195DisNomCli = "" ;
      A1197DisEncCom = DecimalUtil.ZERO ;
      A1198DisEncAnh = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A392DisUniMed = "" ;
      A399EmprCodDis = "" ;
      A475FindCol = "" ;
      A391DisUni = DecimalUtil.ZERO ;
      A1430DisLoc = "" ;
      A1907DisRdoN = DecimalUtil.ZERO ;
      A1908DisRdoA = DecimalUtil.ZERO ;
      A2009DisTipDis = "" ;
      A2832DisKgsLot = DecimalUtil.ZERO ;
      A2833DisMtrLot = DecimalUtil.ZERO ;
      A2835DisPle2 = "" ;
      A1122MaqCodDis = "" ;
      A3306DisFac = "" ;
      A3309DisNumTon = "" ;
      A3627DisFecLan = GXutil.nullDate() ;
      A4014DisTin = "" ;
      A4348DisUsrCod = "" ;
      A1013DibCli = "" ;
      A5031DisCom = "" ;
      A1031EmpesCod = "" ;
      A7516DisGraTam = "" ;
      A1901CliCtrl = "" ;
      A7523DisRec = "" ;
      A7738DisMaqEst = "" ;
      A7739DisExp = "" ;
      A4813DisEncCli = "" ;
      A9771DisItem1 = "" ;
      A9772DisItem2 = "" ;
      A9773DisItem3 = "" ;
      A9774DisItem4 = "" ;
      A9786DisItem5 = "" ;
      A9787DisItem6 = "" ;
      A5252DisAcc = "" ;
      A998DisNMtr = "" ;
      A4355DisFecPed = GXutil.nullDate() ;
      A4877DibColCol = "" ;
      A1002DisNumTen = "" ;
      A5405DisAntpT = "" ;
      A5366DisAntp = "" ;
      A12772DisProdID = "" ;
      A12773DisProdDs = "" ;
      A2926DisPla = "" ;
      A13076DisLinPrd = "" ;
      A13767DisRdto4 = DecimalUtil.ZERO ;
      TempTags = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l764ProForCod = "" ;
      H00KG2_A396EmprCod = new String[] {""} ;
      H00KG2_A764ProForCod = new String[] {""} ;
      AV17Pgmname = "" ;
      H00KG5_A353DisArtTr1 = new String[] {""} ;
      H00KG5_A341DisArtOpe = new String[] {""} ;
      H00KG5_A336DisArtCor = new String[] {""} ;
      H00KG5_A338DisArtEnc = new String[] {""} ;
      H00KG5_A352DisArtTip = new short[1] ;
      H00KG5_A343DisArtPle = new String[] {""} ;
      H00KG5_A333DisArtAca = new String[] {""} ;
      H00KG5_A351DisArtSua = new String[] {""} ;
      H00KG5_A339DisArtLar = new String[] {""} ;
      H00KG5_A340DisArtMat = new String[] {""} ;
      H00KG5_A337DisArtDsc = new String[] {""} ;
      H00KG5_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      H00KG5_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00KG5_A279CliNom = new String[] {""} ;
      H00KG5_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H00KG5_A360DisCliNum = new String[] {""} ;
      H00KG5_A407EmprNom = new String[] {""} ;
      H00KG5_n407EmprNom = new boolean[] {false} ;
      H00KG5_A757PriCod = new String[] {""} ;
      H00KG5_A379DisPie = new short[1] ;
      H00KG5_n379DisPie = new boolean[] {false} ;
      H00KG5_A396EmprCod = new String[] {""} ;
      H00KG5_A387DisPiePie = new short[1] ;
      H00KG5_n387DisPiePie = new boolean[] {false} ;
      H00KG5_A390DisTipCol = new byte[1] ;
      H00KG5_n390DisTipCol = new boolean[] {false} ;
      H00KG5_A363DisColNum = new int[1] ;
      H00KG5_n363DisColNum = new boolean[] {false} ;
      H00KG5_A362DisColNom = new String[] {""} ;
      H00KG5_n362DisColNom = new boolean[] {false} ;
      H00KG5_A335DisArtCod = new String[] {""} ;
      H00KG5_A252CliCod = new int[1] ;
      H00KG5_A392DisUniMed = new String[] {""} ;
      H00KG5_A365DisDes = new String[] {""} ;
      H00KG5_A361DisCod = new int[1] ;
      H00KG5_A13768DisTallUlt = new short[1] ;
      H00KG5_A13767DisRdto4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00KG5_A13076DisLinPrd = new String[] {""} ;
      H00KG5_n13076DisLinPrd = new boolean[] {false} ;
      H00KG5_A13069DisCanalID = new int[1] ;
      H00KG5_n13069DisCanalID = new boolean[] {false} ;
      H00KG5_A13068DisLineaID = new short[1] ;
      H00KG5_n13068DisLineaID = new boolean[] {false} ;
      H00KG5_A2926DisPla = new String[] {""} ;
      H00KG5_A12773DisProdDs = new String[] {""} ;
      H00KG5_n12773DisProdDs = new boolean[] {false} ;
      H00KG5_A12772DisProdID = new String[] {""} ;
      H00KG5_n12772DisProdID = new boolean[] {false} ;
      H00KG5_A12768DisTpEstam = new byte[1] ;
      H00KG5_A12765DisPriorid = new byte[1] ;
      H00KG5_A5366DisAntp = new String[] {""} ;
      H00KG5_A5405DisAntpT = new String[] {""} ;
      H00KG5_A1002DisNumTen = new String[] {""} ;
      H00KG5_n1002DisNumTen = new boolean[] {false} ;
      H00KG5_A4879DibColColN = new int[1] ;
      H00KG5_n4879DibColColN = new boolean[] {false} ;
      H00KG5_A4919DisDibCoCN = new int[1] ;
      H00KG5_n4919DisDibCoCN = new boolean[] {false} ;
      H00KG5_A4877DibColCol = new String[] {""} ;
      H00KG5_n4877DibColCol = new boolean[] {false} ;
      H00KG5_A4355DisFecPed = new java.util.Date[] {GXutil.nullDate()} ;
      H00KG5_n4355DisFecPed = new boolean[] {false} ;
      H00KG5_A998DisNMtr = new String[] {""} ;
      H00KG5_A5252DisAcc = new String[] {""} ;
      H00KG5_A9787DisItem6 = new String[] {""} ;
      H00KG5_A9786DisItem5 = new String[] {""} ;
      H00KG5_A9774DisItem4 = new String[] {""} ;
      H00KG5_A9773DisItem3 = new String[] {""} ;
      H00KG5_A9772DisItem2 = new String[] {""} ;
      H00KG5_A9771DisItem1 = new String[] {""} ;
      H00KG5_A4813DisEncCli = new String[] {""} ;
      H00KG5_A7739DisExp = new String[] {""} ;
      H00KG5_A7738DisMaqEst = new String[] {""} ;
      H00KG5_A7523DisRec = new String[] {""} ;
      H00KG5_A1901CliCtrl = new String[] {""} ;
      H00KG5_A7516DisGraTam = new String[] {""} ;
      H00KG5_n7516DisGraTam = new boolean[] {false} ;
      H00KG5_A7515DisDesCol = new byte[1] ;
      H00KG5_n7515DisDesCol = new boolean[] {false} ;
      H00KG5_A7514DisOrdGra = new byte[1] ;
      H00KG5_A7513DisOrdSep = new byte[1] ;
      H00KG5_A7512DisFacGra = new byte[1] ;
      H00KG5_n7512DisFacGra = new boolean[] {false} ;
      H00KG5_A7511DisFacSep = new byte[1] ;
      H00KG5_n7511DisFacSep = new boolean[] {false} ;
      H00KG5_A1031EmpesCod = new String[] {""} ;
      H00KG5_n1031EmpesCod = new boolean[] {false} ;
      H00KG5_A5031DisCom = new String[] {""} ;
      H00KG5_n5031DisCom = new boolean[] {false} ;
      H00KG5_A1014DibInt = new int[1] ;
      H00KG5_n1014DibInt = new boolean[] {false} ;
      H00KG5_A1013DibCli = new String[] {""} ;
      H00KG5_n1013DibCli = new boolean[] {false} ;
      H00KG5_A4348DisUsrCod = new String[] {""} ;
      H00KG5_A4294DisNPzasL = new int[1] ;
      H00KG5_n4294DisNPzasL = new boolean[] {false} ;
      H00KG5_A4293DisNPzas = new int[1] ;
      H00KG5_n4293DisNPzas = new boolean[] {false} ;
      H00KG5_A4014DisTin = new String[] {""} ;
      H00KG5_A4013DisEnv = new byte[1] ;
      H00KG5_n4013DisEnv = new boolean[] {false} ;
      H00KG5_A3627DisFecLan = new java.util.Date[] {GXutil.nullDate()} ;
      H00KG5_n3627DisFecLan = new boolean[] {false} ;
      H00KG5_A2310DisCliDes = new int[1] ;
      H00KG5_A3309DisNumTon = new String[] {""} ;
      H00KG5_A3308DisManCod2 = new short[1] ;
      H00KG5_A3307DisManCod1 = new short[1] ;
      H00KG5_A3306DisFac = new String[] {""} ;
      H00KG5_A1122MaqCodDis = new String[] {""} ;
      H00KG5_n1122MaqCodDis = new boolean[] {false} ;
      H00KG5_A3132DisGraCru2 = new short[1] ;
      H00KG5_A3131DisGraAca2 = new short[1] ;
      H00KG5_A3130DisAncSal3 = new short[1] ;
      H00KG5_A3129DisAncSal2 = new short[1] ;
      H00KG5_A3128DisAncSal1 = new short[1] ;
      H00KG5_A3127DisNumCor = new short[1] ;
      H00KG5_A2835DisPle2 = new String[] {""} ;
      H00KG5_A2833DisMtrLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00KG5_A2832DisKgsLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00KG5_A2831DisNumLot = new int[1] ;
      H00KG5_A2009DisTipDis = new String[] {""} ;
      H00KG5_n2009DisTipDis = new boolean[] {false} ;
      H00KG5_A1908DisRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00KG5_A1907DisRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00KG5_A1906DisGraAca = new short[1] ;
      H00KG5_A1502DisPart = new short[1] ;
      H00KG5_A1430DisLoc = new String[] {""} ;
      H00KG5_A1225DisGraCru = new short[1] ;
      H00KG5_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00KG5_A374DisNumPie = new short[1] ;
      H00KG5_A1198DisEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00KG5_A1197DisEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00KG5_A1196DisNumCli = new int[1] ;
      H00KG5_A1195DisNomCli = new String[] {""} ;
      H00KG5_A373DisMtrLan = new short[1] ;
      H00KG5_A372DisKgmLan = new short[1] ;
      H00KG5_A383DisPieLan = new short[1] ;
      H00KG5_A389DisPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00KG5_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00KG5_A367DisEst = new byte[1] ;
      H00KG5_A1233DisArtAc2 = new short[1] ;
      H00KG5_A1232DisArtAcb = new short[1] ;
      H00KG5_A1231DisArtAn1 = new short[1] ;
      H00KG5_A334DisArtAnh = new short[1] ;
      H00KG5_A342DisArtPes = new short[1] ;
      H00KG5_A349DisArtPu3 = new short[1] ;
      H00KG5_n349DisArtPu3 = new boolean[] {false} ;
      H00KG5_A358DisArtUr3 = new String[] {""} ;
      H00KG5_A348DisArtPu2 = new short[1] ;
      H00KG5_A357DisArtUr2 = new String[] {""} ;
      H00KG5_A347DisArtPu1 = new short[1] ;
      H00KG5_A356DisArtUr1 = new String[] {""} ;
      H00KG5_A359DisArtUrg = new byte[1] ;
      H00KG5_A350DisArtRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00KG5_A346DisArtPt3 = new short[1] ;
      H00KG5_A355DisArtTr3 = new String[] {""} ;
      H00KG5_A345DisArtPt2 = new short[1] ;
      H00KG5_A354DisArtTr2 = new String[] {""} ;
      H00KG5_A344DisArtPt1 = new short[1] ;
      H00KG6_A407EmprNom = new String[] {""} ;
      H00KG6_n407EmprNom = new boolean[] {false} ;
      H00KG8_A379DisPie = new short[1] ;
      H00KG8_n379DisPie = new boolean[] {false} ;
      H00KG10_A387DisPiePie = new short[1] ;
      H00KG10_n387DisPiePie = new boolean[] {false} ;
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
      E396EmprCod = "" ;
      H00KG11_A673Piezas = new int[1] ;
      X631Metros = DecimalUtil.ZERO ;
      H00KG12_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X595Kilos = DecimalUtil.ZERO ;
      H00KG13_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00KG14_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X382DisPieKil = DecimalUtil.ZERO ;
      H00KG15_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00KG16_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X384DisPieMet = DecimalUtil.ZERO ;
      H00KG17_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.nwdpalmacentejidotdispos__default(),
         new Object[] {
             new Object[] {
            H00KG2_A396EmprCod, H00KG2_A764ProForCod
            }
            , new Object[] {
            H00KG5_A353DisArtTr1, H00KG5_A341DisArtOpe, H00KG5_A336DisArtCor, H00KG5_A338DisArtEnc, H00KG5_A352DisArtTip, H00KG5_A343DisArtPle, H00KG5_A333DisArtAca, H00KG5_A351DisArtSua, H00KG5_A339DisArtLar, H00KG5_A340DisArtMat,
            H00KG5_A337DisArtDsc, H00KG5_A371DisFecEnt, H00KG5_A369DisFec, H00KG5_A279CliNom, H00KG5_A370DisFecCli, H00KG5_A360DisCliNum, H00KG5_A407EmprNom, H00KG5_n407EmprNom, H00KG5_A757PriCod, H00KG5_A379DisPie,
            H00KG5_n379DisPie, H00KG5_A396EmprCod, H00KG5_A387DisPiePie, H00KG5_n387DisPiePie, H00KG5_A390DisTipCol, H00KG5_n390DisTipCol, H00KG5_A363DisColNum, H00KG5_n363DisColNum, H00KG5_A362DisColNom, H00KG5_n362DisColNom,
            H00KG5_A335DisArtCod, H00KG5_A252CliCod, H00KG5_A392DisUniMed, H00KG5_A365DisDes, H00KG5_A361DisCod, H00KG5_A13768DisTallUlt, H00KG5_A13767DisRdto4, H00KG5_A13076DisLinPrd, H00KG5_n13076DisLinPrd, H00KG5_A13069DisCanalID,
            H00KG5_n13069DisCanalID, H00KG5_A13068DisLineaID, H00KG5_n13068DisLineaID, H00KG5_A2926DisPla, H00KG5_A12773DisProdDs, H00KG5_n12773DisProdDs, H00KG5_A12772DisProdID, H00KG5_n12772DisProdID, H00KG5_A12768DisTpEstam, H00KG5_A12765DisPriorid,
            H00KG5_A5366DisAntp, H00KG5_A5405DisAntpT, H00KG5_A1002DisNumTen, H00KG5_n1002DisNumTen, H00KG5_A4879DibColColN, H00KG5_n4879DibColColN, H00KG5_A4919DisDibCoCN, H00KG5_n4919DisDibCoCN, H00KG5_A4877DibColCol, H00KG5_n4877DibColCol,
            H00KG5_A4355DisFecPed, H00KG5_n4355DisFecPed, H00KG5_A998DisNMtr, H00KG5_A5252DisAcc, H00KG5_A9787DisItem6, H00KG5_A9786DisItem5, H00KG5_A9774DisItem4, H00KG5_A9773DisItem3, H00KG5_A9772DisItem2, H00KG5_A9771DisItem1,
            H00KG5_A4813DisEncCli, H00KG5_A7739DisExp, H00KG5_A7738DisMaqEst, H00KG5_A7523DisRec, H00KG5_A1901CliCtrl, H00KG5_A7516DisGraTam, H00KG5_n7516DisGraTam, H00KG5_A7515DisDesCol, H00KG5_n7515DisDesCol, H00KG5_A7514DisOrdGra,
            H00KG5_A7513DisOrdSep, H00KG5_A7512DisFacGra, H00KG5_n7512DisFacGra, H00KG5_A7511DisFacSep, H00KG5_n7511DisFacSep, H00KG5_A1031EmpesCod, H00KG5_n1031EmpesCod, H00KG5_A5031DisCom, H00KG5_n5031DisCom, H00KG5_A1014DibInt,
            H00KG5_n1014DibInt, H00KG5_A1013DibCli, H00KG5_n1013DibCli, H00KG5_A4348DisUsrCod, H00KG5_A4294DisNPzasL, H00KG5_n4294DisNPzasL, H00KG5_A4293DisNPzas, H00KG5_n4293DisNPzas, H00KG5_A4014DisTin, H00KG5_A4013DisEnv,
            H00KG5_n4013DisEnv, H00KG5_A3627DisFecLan, H00KG5_n3627DisFecLan, H00KG5_A2310DisCliDes, H00KG5_A3309DisNumTon, H00KG5_A3308DisManCod2, H00KG5_A3307DisManCod1, H00KG5_A3306DisFac, H00KG5_A1122MaqCodDis, H00KG5_n1122MaqCodDis,
            H00KG5_A3132DisGraCru2, H00KG5_A3131DisGraAca2, H00KG5_A3130DisAncSal3, H00KG5_A3129DisAncSal2, H00KG5_A3128DisAncSal1, H00KG5_A3127DisNumCor, H00KG5_A2835DisPle2, H00KG5_A2833DisMtrLot, H00KG5_A2832DisKgsLot, H00KG5_A2831DisNumLot,
            H00KG5_A2009DisTipDis, H00KG5_n2009DisTipDis, H00KG5_A1908DisRdoA, H00KG5_A1907DisRdoN, H00KG5_A1906DisGraAca, H00KG5_A1502DisPart, H00KG5_A1430DisLoc, H00KG5_A1225DisGraCru, H00KG5_A375DisNumUni, H00KG5_A374DisNumPie,
            H00KG5_A1198DisEncAnh, H00KG5_A1197DisEncCom, H00KG5_A1196DisNumCli, H00KG5_A1195DisNomCli, H00KG5_A373DisMtrLan, H00KG5_A372DisKgmLan, H00KG5_A383DisPieLan, H00KG5_A389DisPreMtr, H00KG5_A388DisPreKgm, H00KG5_A367DisEst,
            H00KG5_A1233DisArtAc2, H00KG5_A1232DisArtAcb, H00KG5_A1231DisArtAn1, H00KG5_A334DisArtAnh, H00KG5_A342DisArtPes, H00KG5_A349DisArtPu3, H00KG5_n349DisArtPu3, H00KG5_A358DisArtUr3, H00KG5_A348DisArtPu2, H00KG5_A357DisArtUr2,
            H00KG5_A347DisArtPu1, H00KG5_A356DisArtUr1, H00KG5_A359DisArtUrg, H00KG5_A350DisArtRdt, H00KG5_A346DisArtPt3, H00KG5_A355DisArtTr3, H00KG5_A345DisArtPt2, H00KG5_A354DisArtTr2, H00KG5_A344DisArtPt1
            }
            , new Object[] {
            H00KG6_A407EmprNom, H00KG6_n407EmprNom
            }
            , new Object[] {
            H00KG8_A379DisPie, H00KG8_n379DisPie
            }
            , new Object[] {
            H00KG10_A387DisPiePie, H00KG10_n387DisPiePie
            }
            , new Object[] {
            H00KG11_A673Piezas
            }
            , new Object[] {
            H00KG12_A631Metros
            }
            , new Object[] {
            H00KG13_A595Kilos
            }
            , new Object[] {
            H00KG14_A595Kilos
            }
            , new Object[] {
            H00KG15_A382DisPieKil
            }
            , new Object[] {
            H00KG16_A631Metros
            }
            , new Object[] {
            H00KG17_A384DisPieMet
            }
         }
      );
      AV17Pgmname = "NwDPAlmacenTejidoTDISPOS" ;
      /* GeneXus formulas. */
      AV17Pgmname = "NwDPAlmacenTejidoTDISPOS" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A359DisArtUrg ;
   private byte A367DisEst ;
   private byte A390DisTipCol ;
   private byte A4013DisEnv ;
   private byte A7511DisFacSep ;
   private byte A7512DisFacGra ;
   private byte A7513DisOrdSep ;
   private byte A7514DisOrdGra ;
   private byte A7515DisDesCol ;
   private byte A12765DisPriorid ;
   private byte A12768DisTpEstam ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short A352DisArtTip ;
   private short A344DisArtPt1 ;
   private short A345DisArtPt2 ;
   private short A346DisArtPt3 ;
   private short A347DisArtPu1 ;
   private short A348DisArtPu2 ;
   private short A349DisArtPu3 ;
   private short A342DisArtPes ;
   private short A334DisArtAnh ;
   private short A1231DisArtAn1 ;
   private short A1232DisArtAcb ;
   private short A1233DisArtAc2 ;
   private short A387DisPiePie ;
   private short A383DisPieLan ;
   private short A372DisKgmLan ;
   private short A373DisMtrLan ;
   private short A374DisNumPie ;
   private short A379DisPie ;
   private short A1225DisGraCru ;
   private short A386DisPieNor ;
   private short A1502DisPart ;
   private short A1906DisGraAca ;
   private short A3127DisNumCor ;
   private short A3128DisAncSal1 ;
   private short A3129DisAncSal2 ;
   private short A3130DisAncSal3 ;
   private short A3131DisGraAca2 ;
   private short A3132DisGraCru2 ;
   private short A3307DisManCod1 ;
   private short A3308DisManCod2 ;
   private short A13068DisLineaID ;
   private short A13768DisTallUlt ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOA361DisCod ;
   private int A361DisCod ;
   private int edtEmprCod_Enabled ;
   private int edtDisCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtDisCliNum_Enabled ;
   private int edtDisFecCli_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtDisArtCod_Enabled ;
   private int edtDisFec_Enabled ;
   private int edtDisFecEnt_Enabled ;
   private int edtDisArtDsc_Enabled ;
   private int edtDisArtMat_Enabled ;
   private int edtDisArtLar_Enabled ;
   private int edtDisArtSua_Enabled ;
   private int edtDisArtAca_Enabled ;
   private int edtDisArtPle_Enabled ;
   private int edtDisArtTip_Enabled ;
   private int edtDisArtOpe_Enabled ;
   private int edtDisArtTr1_Enabled ;
   private int edtDisArtPt1_Enabled ;
   private int edtDisArtTr2_Enabled ;
   private int edtDisArtPt2_Enabled ;
   private int edtDisArtTr3_Enabled ;
   private int edtDisArtPt3_Enabled ;
   private int edtDisArtRdt_Enabled ;
   private int edtDisArtUrg_Enabled ;
   private int edtDisArtUr1_Enabled ;
   private int edtDisArtPu1_Enabled ;
   private int edtDisArtUr2_Enabled ;
   private int edtDisArtPu2_Enabled ;
   private int edtDisArtUr3_Enabled ;
   private int edtDisArtPu3_Enabled ;
   private int edtDisArtPes_Enabled ;
   private int edtDisArtAnh_Enabled ;
   private int edtDisArtAn1_Enabled ;
   private int edtDisArtAcb_Enabled ;
   private int edtDisArtAc2_Enabled ;
   private int edtDisPiePie_Enabled ;
   private int edtDisPieMtr_Enabled ;
   private int edtDisPieKgm_Enabled ;
   private int edtDisPreKgm_Enabled ;
   private int edtDisPreMtr_Enabled ;
   private int edtDisPieLan_Enabled ;
   private int edtDisKgmLan_Enabled ;
   private int edtDisMtrLan_Enabled ;
   private int edtDisColNom_Enabled ;
   private int A363DisColNum ;
   private int edtDisColNum_Enabled ;
   private int edtDisNomCli_Enabled ;
   private int A1196DisNumCli ;
   private int edtDisNumCli_Enabled ;
   private int edtDisEncCom_Enabled ;
   private int edtDisEncAnh_Enabled ;
   private int edtDisTipCol_Enabled ;
   private int edtDisNumPie_Enabled ;
   private int edtDisNumUni_Enabled ;
   private int edtDisUniMed_Enabled ;
   private int edtEmprCodDis_Enabled ;
   private int A253CliCodDis ;
   private int edtCliCodDis_Enabled ;
   private int edtFindCol_Enabled ;
   private int edtDisPie_Enabled ;
   private int edtDisUni_Enabled ;
   private int edtDisGraCru_Enabled ;
   private int edtDisPieNor_Enabled ;
   private int edtDisLoc_Enabled ;
   private int edtDisPart_Enabled ;
   private int edtDisGraAca_Enabled ;
   private int edtDisRdoN_Enabled ;
   private int edtDisRdoA_Enabled ;
   private int edtDisTipDis_Enabled ;
   private int A2831DisNumLot ;
   private int edtDisNumLot_Enabled ;
   private int edtDisKgsLot_Enabled ;
   private int edtDisMtrLot_Enabled ;
   private int edtDisPle2_Enabled ;
   private int edtDisNumCor_Enabled ;
   private int edtDisAncSal1_Enabled ;
   private int edtDisAncSal2_Enabled ;
   private int edtDisAncSal3_Enabled ;
   private int edtDisGraAca2_Enabled ;
   private int edtDisGraCru2_Enabled ;
   private int edtMaqCodDis_Enabled ;
   private int edtDisManCod1_Enabled ;
   private int edtDisManCod2_Enabled ;
   private int edtDisNumTon_Enabled ;
   private int A2310DisCliDes ;
   private int edtDisCliDes_Enabled ;
   private int edtDisFecLan_Enabled ;
   private int edtDisEnv_Enabled ;
   private int A4293DisNPzas ;
   private int edtDisNPzas_Enabled ;
   private int A4294DisNPzasL ;
   private int edtDisNPzasL_Enabled ;
   private int edtDisUsrCod_Enabled ;
   private int edtDibCli_Enabled ;
   private int A1014DibInt ;
   private int edtDibInt_Enabled ;
   private int edtDisCom_Enabled ;
   private int edtEmpesCod_Enabled ;
   private int edtDisRec_Enabled ;
   private int edtDisMaqEst_Enabled ;
   private int edtDisEncCli_Enabled ;
   private int edtDisItem1_Enabled ;
   private int edtDisItem2_Enabled ;
   private int edtDisItem3_Enabled ;
   private int edtDisItem4_Enabled ;
   private int edtDisItem5_Enabled ;
   private int edtDisItem6_Enabled ;
   private int edtDisNMtr_Enabled ;
   private int edtDisFecPed_Enabled ;
   private int edtDibColCol_Enabled ;
   private int A4919DisDibCoCN ;
   private int edtDisDibCoCN_Enabled ;
   private int A4879DibColColN ;
   private int edtDibColColN_Enabled ;
   private int edtDisNumTen_Enabled ;
   private int edtDisAntpT_Enabled ;
   private int edtDisAntp_Enabled ;
   private int edtDisPriorid_Enabled ;
   private int edtDisTpEstam_Enabled ;
   private int edtDisProdID_Enabled ;
   private int edtDisProdDs_Enabled ;
   private int edtDisLineaID_Enabled ;
   private int A13069DisCanalID ;
   private int edtDisCanalID_Enabled ;
   private int edtDisLinPrd_Enabled ;
   private int edtDisRdto4_Enabled ;
   private int edtDisTallUlt_Enabled ;
   private int gxdynajaxindex ;
   private int idxLst ;
   private int X673Piezas ;
   private int E361DisCod ;
   private java.math.BigDecimal A350DisArtRdt ;
   private java.math.BigDecimal A385DisPieMtr ;
   private java.math.BigDecimal A381DisPieKgm ;
   private java.math.BigDecimal A388DisPreKgm ;
   private java.math.BigDecimal A389DisPreMtr ;
   private java.math.BigDecimal A1197DisEncCom ;
   private java.math.BigDecimal A1198DisEncAnh ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal A391DisUni ;
   private java.math.BigDecimal A1907DisRdoN ;
   private java.math.BigDecimal A1908DisRdoA ;
   private java.math.BigDecimal A2832DisKgsLot ;
   private java.math.BigDecimal A2833DisMtrLot ;
   private java.math.BigDecimal A13767DisRdto4 ;
   private java.math.BigDecimal X631Metros ;
   private java.math.BigDecimal X595Kilos ;
   private java.math.BigDecimal X382DisPieKil ;
   private java.math.BigDecimal X384DisPieMet ;
   private String wcpOA396EmprCod ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String A396EmprCod ;
   private String A764ProForCod ;
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
   private String edtDisFecCli_Internalname ;
   private String edtDisFecCli_Jsonclick ;
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
   private String edtDisArtDsc_Internalname ;
   private String A337DisArtDsc ;
   private String edtDisArtDsc_Jsonclick ;
   private String edtDisArtMat_Internalname ;
   private String A340DisArtMat ;
   private String edtDisArtMat_Jsonclick ;
   private String edtDisArtLar_Internalname ;
   private String A339DisArtLar ;
   private String edtDisArtLar_Jsonclick ;
   private String edtDisArtSua_Internalname ;
   private String A351DisArtSua ;
   private String edtDisArtSua_Jsonclick ;
   private String edtDisArtAca_Internalname ;
   private String A333DisArtAca ;
   private String edtDisArtAca_Jsonclick ;
   private String edtDisArtPle_Internalname ;
   private String A343DisArtPle ;
   private String edtDisArtPle_Jsonclick ;
   private String edtDisArtTip_Internalname ;
   private String edtDisArtTip_Jsonclick ;
   private String A338DisArtEnc ;
   private String A336DisArtCor ;
   private String edtDisArtOpe_Internalname ;
   private String A341DisArtOpe ;
   private String edtDisArtOpe_Jsonclick ;
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
   private String edtDisArtRdt_Internalname ;
   private String edtDisArtRdt_Jsonclick ;
   private String edtDisArtUrg_Internalname ;
   private String edtDisArtUrg_Jsonclick ;
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
   private String edtDisArtPes_Internalname ;
   private String edtDisArtPes_Jsonclick ;
   private String edtDisArtAnh_Internalname ;
   private String edtDisArtAnh_Jsonclick ;
   private String edtDisArtAn1_Internalname ;
   private String edtDisArtAn1_Jsonclick ;
   private String edtDisArtAcb_Internalname ;
   private String edtDisArtAcb_Jsonclick ;
   private String edtDisArtAc2_Internalname ;
   private String edtDisArtAc2_Jsonclick ;
   private String edtDisPiePie_Internalname ;
   private String edtDisPiePie_Jsonclick ;
   private String edtDisPieMtr_Internalname ;
   private String edtDisPieMtr_Jsonclick ;
   private String edtDisPieKgm_Internalname ;
   private String edtDisPieKgm_Jsonclick ;
   private String edtDisPreKgm_Internalname ;
   private String edtDisPreKgm_Jsonclick ;
   private String edtDisPreMtr_Internalname ;
   private String edtDisPreMtr_Jsonclick ;
   private String edtDisPieLan_Internalname ;
   private String edtDisPieLan_Jsonclick ;
   private String edtDisKgmLan_Internalname ;
   private String edtDisKgmLan_Jsonclick ;
   private String edtDisMtrLan_Internalname ;
   private String edtDisMtrLan_Jsonclick ;
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
   private String edtDisEncCom_Internalname ;
   private String edtDisEncCom_Jsonclick ;
   private String edtDisEncAnh_Internalname ;
   private String edtDisEncAnh_Jsonclick ;
   private String edtDisTipCol_Internalname ;
   private String edtDisTipCol_Jsonclick ;
   private String A365DisDes ;
   private String edtDisNumPie_Internalname ;
   private String edtDisNumPie_Jsonclick ;
   private String edtDisNumUni_Internalname ;
   private String edtDisNumUni_Jsonclick ;
   private String edtDisUniMed_Internalname ;
   private String A392DisUniMed ;
   private String edtDisUniMed_Jsonclick ;
   private String edtEmprCodDis_Internalname ;
   private String A399EmprCodDis ;
   private String edtEmprCodDis_Jsonclick ;
   private String edtCliCodDis_Internalname ;
   private String edtCliCodDis_Jsonclick ;
   private String edtFindCol_Internalname ;
   private String A475FindCol ;
   private String edtFindCol_Jsonclick ;
   private String edtDisPie_Internalname ;
   private String edtDisPie_Jsonclick ;
   private String edtDisUni_Internalname ;
   private String edtDisUni_Jsonclick ;
   private String edtDisGraCru_Internalname ;
   private String edtDisGraCru_Jsonclick ;
   private String edtDisPieNor_Internalname ;
   private String edtDisPieNor_Jsonclick ;
   private String edtDisLoc_Internalname ;
   private String A1430DisLoc ;
   private String edtDisLoc_Jsonclick ;
   private String edtDisPart_Internalname ;
   private String edtDisPart_Jsonclick ;
   private String edtDisGraAca_Internalname ;
   private String edtDisGraAca_Jsonclick ;
   private String edtDisRdoN_Internalname ;
   private String edtDisRdoN_Jsonclick ;
   private String edtDisRdoA_Internalname ;
   private String edtDisRdoA_Jsonclick ;
   private String edtDisTipDis_Internalname ;
   private String A2009DisTipDis ;
   private String edtDisTipDis_Jsonclick ;
   private String edtDisNumLot_Internalname ;
   private String edtDisNumLot_Jsonclick ;
   private String edtDisKgsLot_Internalname ;
   private String edtDisKgsLot_Jsonclick ;
   private String edtDisMtrLot_Internalname ;
   private String edtDisMtrLot_Jsonclick ;
   private String edtDisPle2_Internalname ;
   private String A2835DisPle2 ;
   private String edtDisPle2_Jsonclick ;
   private String edtDisNumCor_Internalname ;
   private String edtDisNumCor_Jsonclick ;
   private String edtDisAncSal1_Internalname ;
   private String edtDisAncSal1_Jsonclick ;
   private String edtDisAncSal2_Internalname ;
   private String edtDisAncSal2_Jsonclick ;
   private String edtDisAncSal3_Internalname ;
   private String edtDisAncSal3_Jsonclick ;
   private String edtDisGraAca2_Internalname ;
   private String edtDisGraAca2_Jsonclick ;
   private String edtDisGraCru2_Internalname ;
   private String edtDisGraCru2_Jsonclick ;
   private String edtMaqCodDis_Internalname ;
   private String A1122MaqCodDis ;
   private String edtMaqCodDis_Jsonclick ;
   private String A3306DisFac ;
   private String edtDisManCod1_Internalname ;
   private String edtDisManCod1_Jsonclick ;
   private String edtDisManCod2_Internalname ;
   private String edtDisManCod2_Jsonclick ;
   private String edtDisNumTon_Internalname ;
   private String A3309DisNumTon ;
   private String edtDisNumTon_Jsonclick ;
   private String edtDisCliDes_Internalname ;
   private String edtDisCliDes_Jsonclick ;
   private String edtDisFecLan_Internalname ;
   private String edtDisFecLan_Jsonclick ;
   private String edtDisEnv_Internalname ;
   private String edtDisEnv_Jsonclick ;
   private String A4014DisTin ;
   private String edtDisNPzas_Internalname ;
   private String edtDisNPzas_Jsonclick ;
   private String edtDisNPzasL_Internalname ;
   private String edtDisNPzasL_Jsonclick ;
   private String edtDisUsrCod_Internalname ;
   private String A4348DisUsrCod ;
   private String edtDisUsrCod_Jsonclick ;
   private String edtDibCli_Internalname ;
   private String A1013DibCli ;
   private String edtDibCli_Jsonclick ;
   private String edtDibInt_Internalname ;
   private String edtDibInt_Jsonclick ;
   private String edtDisCom_Internalname ;
   private String A5031DisCom ;
   private String edtDisCom_Jsonclick ;
   private String edtEmpesCod_Internalname ;
   private String A1031EmpesCod ;
   private String edtEmpesCod_Jsonclick ;
   private String A7516DisGraTam ;
   private String A1901CliCtrl ;
   private String edtDisRec_Internalname ;
   private String A7523DisRec ;
   private String edtDisRec_Jsonclick ;
   private String edtDisMaqEst_Internalname ;
   private String A7738DisMaqEst ;
   private String edtDisMaqEst_Jsonclick ;
   private String A7739DisExp ;
   private String edtDisEncCli_Internalname ;
   private String A4813DisEncCli ;
   private String edtDisEncCli_Jsonclick ;
   private String edtDisItem1_Internalname ;
   private String A9771DisItem1 ;
   private String edtDisItem1_Jsonclick ;
   private String edtDisItem2_Internalname ;
   private String A9772DisItem2 ;
   private String edtDisItem2_Jsonclick ;
   private String edtDisItem3_Internalname ;
   private String A9773DisItem3 ;
   private String edtDisItem3_Jsonclick ;
   private String edtDisItem4_Internalname ;
   private String A9774DisItem4 ;
   private String edtDisItem4_Jsonclick ;
   private String edtDisItem5_Internalname ;
   private String A9786DisItem5 ;
   private String edtDisItem5_Jsonclick ;
   private String edtDisItem6_Internalname ;
   private String A9787DisItem6 ;
   private String edtDisItem6_Jsonclick ;
   private String A5252DisAcc ;
   private String edtDisNMtr_Internalname ;
   private String A998DisNMtr ;
   private String edtDisNMtr_Jsonclick ;
   private String edtDisFecPed_Internalname ;
   private String edtDisFecPed_Jsonclick ;
   private String edtDibColCol_Internalname ;
   private String A4877DibColCol ;
   private String edtDibColCol_Jsonclick ;
   private String edtDisDibCoCN_Internalname ;
   private String edtDisDibCoCN_Jsonclick ;
   private String edtDibColColN_Internalname ;
   private String edtDibColColN_Jsonclick ;
   private String edtDisNumTen_Internalname ;
   private String A1002DisNumTen ;
   private String edtDisNumTen_Jsonclick ;
   private String edtDisAntpT_Internalname ;
   private String A5405DisAntpT ;
   private String edtDisAntpT_Jsonclick ;
   private String edtDisAntp_Internalname ;
   private String A5366DisAntp ;
   private String edtDisAntp_Jsonclick ;
   private String edtDisPriorid_Internalname ;
   private String edtDisPriorid_Jsonclick ;
   private String edtDisTpEstam_Internalname ;
   private String edtDisTpEstam_Jsonclick ;
   private String edtDisProdID_Internalname ;
   private String A12772DisProdID ;
   private String edtDisProdID_Jsonclick ;
   private String edtDisProdDs_Internalname ;
   private String A12773DisProdDs ;
   private String edtDisProdDs_Jsonclick ;
   private String A2926DisPla ;
   private String edtDisLineaID_Internalname ;
   private String edtDisLineaID_Jsonclick ;
   private String edtDisCanalID_Internalname ;
   private String edtDisCanalID_Jsonclick ;
   private String edtDisLinPrd_Internalname ;
   private String A13076DisLinPrd ;
   private String edtDisLinPrd_Jsonclick ;
   private String edtDisRdto4_Internalname ;
   private String edtDisRdto4_Jsonclick ;
   private String edtDisTallUlt_Internalname ;
   private String edtDisTallUlt_Jsonclick ;
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
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String l764ProForCod ;
   private String AV17Pgmname ;
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
   private String E396EmprCod ;
   private java.util.Date A370DisFecCli ;
   private java.util.Date A369DisFec ;
   private java.util.Date A371DisFecEnt ;
   private java.util.Date A3627DisFecLan ;
   private java.util.Date A4355DisFecPed ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n7511DisFacSep ;
   private boolean n7512DisFacGra ;
   private boolean n7515DisDesCol ;
   private boolean n7516DisGraTam ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n379DisPie ;
   private boolean n387DisPiePie ;
   private boolean n390DisTipCol ;
   private boolean n363DisColNum ;
   private boolean n362DisColNom ;
   private boolean n13076DisLinPrd ;
   private boolean n13069DisCanalID ;
   private boolean n13068DisLineaID ;
   private boolean n12773DisProdDs ;
   private boolean n12772DisProdID ;
   private boolean n1002DisNumTen ;
   private boolean n4879DibColColN ;
   private boolean n4919DisDibCoCN ;
   private boolean n4877DibColCol ;
   private boolean n4355DisFecPed ;
   private boolean n1031EmpesCod ;
   private boolean n5031DisCom ;
   private boolean n1014DibInt ;
   private boolean n1013DibCli ;
   private boolean n4294DisNPzasL ;
   private boolean n4293DisNPzas ;
   private boolean n4013DisEnv ;
   private boolean n3627DisFecLan ;
   private boolean n1122MaqCodDis ;
   private boolean n2009DisTipDis ;
   private boolean n349DisArtPu3 ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private ICheckbox chkPriCod ;
   private ICheckbox chkDisArtEnc ;
   private ICheckbox chkDisArtCor ;
   private HTMLChoice cmbDisEst ;
   private ICheckbox chkDisDes ;
   private ICheckbox chkDisFac ;
   private ICheckbox chkDisTin ;
   private ICheckbox chkDisFacSep ;
   private ICheckbox chkDisFacGra ;
   private ICheckbox chkDisOrdSep ;
   private ICheckbox chkDisOrdGra ;
   private ICheckbox chkDisDesCol ;
   private HTMLChoice cmbDisGraTam ;
   private ICheckbox chkCliCtrl ;
   private ICheckbox chkDisExp ;
   private ICheckbox chkDisAcc ;
   private ICheckbox chkDisPla ;
   private IDataStoreProvider pr_default ;
   private String[] H00KG2_A396EmprCod ;
   private String[] H00KG2_A764ProForCod ;
   private String[] H00KG5_A353DisArtTr1 ;
   private String[] H00KG5_A341DisArtOpe ;
   private String[] H00KG5_A336DisArtCor ;
   private String[] H00KG5_A338DisArtEnc ;
   private short[] H00KG5_A352DisArtTip ;
   private String[] H00KG5_A343DisArtPle ;
   private String[] H00KG5_A333DisArtAca ;
   private String[] H00KG5_A351DisArtSua ;
   private String[] H00KG5_A339DisArtLar ;
   private String[] H00KG5_A340DisArtMat ;
   private String[] H00KG5_A337DisArtDsc ;
   private java.util.Date[] H00KG5_A371DisFecEnt ;
   private java.util.Date[] H00KG5_A369DisFec ;
   private String[] H00KG5_A279CliNom ;
   private java.util.Date[] H00KG5_A370DisFecCli ;
   private String[] H00KG5_A360DisCliNum ;
   private String[] H00KG5_A407EmprNom ;
   private boolean[] H00KG5_n407EmprNom ;
   private String[] H00KG5_A757PriCod ;
   private short[] H00KG5_A379DisPie ;
   private boolean[] H00KG5_n379DisPie ;
   private String[] H00KG5_A396EmprCod ;
   private short[] H00KG5_A387DisPiePie ;
   private boolean[] H00KG5_n387DisPiePie ;
   private byte[] H00KG5_A390DisTipCol ;
   private boolean[] H00KG5_n390DisTipCol ;
   private int[] H00KG5_A363DisColNum ;
   private boolean[] H00KG5_n363DisColNum ;
   private String[] H00KG5_A362DisColNom ;
   private boolean[] H00KG5_n362DisColNom ;
   private String[] H00KG5_A335DisArtCod ;
   private int[] H00KG5_A252CliCod ;
   private String[] H00KG5_A392DisUniMed ;
   private String[] H00KG5_A365DisDes ;
   private int[] H00KG5_A361DisCod ;
   private short[] H00KG5_A13768DisTallUlt ;
   private java.math.BigDecimal[] H00KG5_A13767DisRdto4 ;
   private String[] H00KG5_A13076DisLinPrd ;
   private boolean[] H00KG5_n13076DisLinPrd ;
   private int[] H00KG5_A13069DisCanalID ;
   private boolean[] H00KG5_n13069DisCanalID ;
   private short[] H00KG5_A13068DisLineaID ;
   private boolean[] H00KG5_n13068DisLineaID ;
   private String[] H00KG5_A2926DisPla ;
   private String[] H00KG5_A12773DisProdDs ;
   private boolean[] H00KG5_n12773DisProdDs ;
   private String[] H00KG5_A12772DisProdID ;
   private boolean[] H00KG5_n12772DisProdID ;
   private byte[] H00KG5_A12768DisTpEstam ;
   private byte[] H00KG5_A12765DisPriorid ;
   private String[] H00KG5_A5366DisAntp ;
   private String[] H00KG5_A5405DisAntpT ;
   private String[] H00KG5_A1002DisNumTen ;
   private boolean[] H00KG5_n1002DisNumTen ;
   private int[] H00KG5_A4879DibColColN ;
   private boolean[] H00KG5_n4879DibColColN ;
   private int[] H00KG5_A4919DisDibCoCN ;
   private boolean[] H00KG5_n4919DisDibCoCN ;
   private String[] H00KG5_A4877DibColCol ;
   private boolean[] H00KG5_n4877DibColCol ;
   private java.util.Date[] H00KG5_A4355DisFecPed ;
   private boolean[] H00KG5_n4355DisFecPed ;
   private String[] H00KG5_A998DisNMtr ;
   private String[] H00KG5_A5252DisAcc ;
   private String[] H00KG5_A9787DisItem6 ;
   private String[] H00KG5_A9786DisItem5 ;
   private String[] H00KG5_A9774DisItem4 ;
   private String[] H00KG5_A9773DisItem3 ;
   private String[] H00KG5_A9772DisItem2 ;
   private String[] H00KG5_A9771DisItem1 ;
   private String[] H00KG5_A4813DisEncCli ;
   private String[] H00KG5_A7739DisExp ;
   private String[] H00KG5_A7738DisMaqEst ;
   private String[] H00KG5_A7523DisRec ;
   private String[] H00KG5_A1901CliCtrl ;
   private String[] H00KG5_A7516DisGraTam ;
   private boolean[] H00KG5_n7516DisGraTam ;
   private byte[] H00KG5_A7515DisDesCol ;
   private boolean[] H00KG5_n7515DisDesCol ;
   private byte[] H00KG5_A7514DisOrdGra ;
   private byte[] H00KG5_A7513DisOrdSep ;
   private byte[] H00KG5_A7512DisFacGra ;
   private boolean[] H00KG5_n7512DisFacGra ;
   private byte[] H00KG5_A7511DisFacSep ;
   private boolean[] H00KG5_n7511DisFacSep ;
   private String[] H00KG5_A1031EmpesCod ;
   private boolean[] H00KG5_n1031EmpesCod ;
   private String[] H00KG5_A5031DisCom ;
   private boolean[] H00KG5_n5031DisCom ;
   private int[] H00KG5_A1014DibInt ;
   private boolean[] H00KG5_n1014DibInt ;
   private String[] H00KG5_A1013DibCli ;
   private boolean[] H00KG5_n1013DibCli ;
   private String[] H00KG5_A4348DisUsrCod ;
   private int[] H00KG5_A4294DisNPzasL ;
   private boolean[] H00KG5_n4294DisNPzasL ;
   private int[] H00KG5_A4293DisNPzas ;
   private boolean[] H00KG5_n4293DisNPzas ;
   private String[] H00KG5_A4014DisTin ;
   private byte[] H00KG5_A4013DisEnv ;
   private boolean[] H00KG5_n4013DisEnv ;
   private java.util.Date[] H00KG5_A3627DisFecLan ;
   private boolean[] H00KG5_n3627DisFecLan ;
   private int[] H00KG5_A2310DisCliDes ;
   private String[] H00KG5_A3309DisNumTon ;
   private short[] H00KG5_A3308DisManCod2 ;
   private short[] H00KG5_A3307DisManCod1 ;
   private String[] H00KG5_A3306DisFac ;
   private String[] H00KG5_A1122MaqCodDis ;
   private boolean[] H00KG5_n1122MaqCodDis ;
   private short[] H00KG5_A3132DisGraCru2 ;
   private short[] H00KG5_A3131DisGraAca2 ;
   private short[] H00KG5_A3130DisAncSal3 ;
   private short[] H00KG5_A3129DisAncSal2 ;
   private short[] H00KG5_A3128DisAncSal1 ;
   private short[] H00KG5_A3127DisNumCor ;
   private String[] H00KG5_A2835DisPle2 ;
   private java.math.BigDecimal[] H00KG5_A2833DisMtrLot ;
   private java.math.BigDecimal[] H00KG5_A2832DisKgsLot ;
   private int[] H00KG5_A2831DisNumLot ;
   private String[] H00KG5_A2009DisTipDis ;
   private boolean[] H00KG5_n2009DisTipDis ;
   private java.math.BigDecimal[] H00KG5_A1908DisRdoA ;
   private java.math.BigDecimal[] H00KG5_A1907DisRdoN ;
   private short[] H00KG5_A1906DisGraAca ;
   private short[] H00KG5_A1502DisPart ;
   private String[] H00KG5_A1430DisLoc ;
   private short[] H00KG5_A1225DisGraCru ;
   private java.math.BigDecimal[] H00KG5_A375DisNumUni ;
   private short[] H00KG5_A374DisNumPie ;
   private java.math.BigDecimal[] H00KG5_A1198DisEncAnh ;
   private java.math.BigDecimal[] H00KG5_A1197DisEncCom ;
   private int[] H00KG5_A1196DisNumCli ;
   private String[] H00KG5_A1195DisNomCli ;
   private short[] H00KG5_A373DisMtrLan ;
   private short[] H00KG5_A372DisKgmLan ;
   private short[] H00KG5_A383DisPieLan ;
   private java.math.BigDecimal[] H00KG5_A389DisPreMtr ;
   private java.math.BigDecimal[] H00KG5_A388DisPreKgm ;
   private byte[] H00KG5_A367DisEst ;
   private short[] H00KG5_A1233DisArtAc2 ;
   private short[] H00KG5_A1232DisArtAcb ;
   private short[] H00KG5_A1231DisArtAn1 ;
   private short[] H00KG5_A334DisArtAnh ;
   private short[] H00KG5_A342DisArtPes ;
   private short[] H00KG5_A349DisArtPu3 ;
   private boolean[] H00KG5_n349DisArtPu3 ;
   private String[] H00KG5_A358DisArtUr3 ;
   private short[] H00KG5_A348DisArtPu2 ;
   private String[] H00KG5_A357DisArtUr2 ;
   private short[] H00KG5_A347DisArtPu1 ;
   private String[] H00KG5_A356DisArtUr1 ;
   private byte[] H00KG5_A359DisArtUrg ;
   private java.math.BigDecimal[] H00KG5_A350DisArtRdt ;
   private short[] H00KG5_A346DisArtPt3 ;
   private String[] H00KG5_A355DisArtTr3 ;
   private short[] H00KG5_A345DisArtPt2 ;
   private String[] H00KG5_A354DisArtTr2 ;
   private short[] H00KG5_A344DisArtPt1 ;
   private String[] H00KG6_A407EmprNom ;
   private boolean[] H00KG6_n407EmprNom ;
   private short[] H00KG8_A379DisPie ;
   private boolean[] H00KG8_n379DisPie ;
   private short[] H00KG10_A387DisPiePie ;
   private boolean[] H00KG10_n387DisPiePie ;
   private int[] H00KG11_A673Piezas ;
   private java.math.BigDecimal[] H00KG12_A631Metros ;
   private java.math.BigDecimal[] H00KG13_A595Kilos ;
   private java.math.BigDecimal[] H00KG14_A595Kilos ;
   private java.math.BigDecimal[] H00KG15_A382DisPieKil ;
   private java.math.BigDecimal[] H00KG16_A631Metros ;
   private java.math.BigDecimal[] H00KG17_A384DisPieMet ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class nwdpalmacentejidotdispos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00KG2", "SELECT * FROM (SELECT EmprCod, ProForCod FROM TXPCPROFO WHERE (EmprCod = ?) AND (UPPER(ProForCod) like '%' || UPPER(?)) ORDER BY ProForCod) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00KG5", "SELECT T1.DisArtTr1, T1.DisArtOpe, T1.DisArtCor, T1.DisArtEnc, T1.DisArtTip, T1.DisArtPle, T1.DisArtAca, T1.DisArtSua, T1.DisArtLar, T1.DisArtMat, T1.DisArtDsc, T1.DisFecEnt, T1.DisFec, T3.CliNom, T1.DisFecCli, T1.DisCliNum, T2.EmprNom, T1.PriCod, COALESCE( T5.GXC1, 0) AS DisPie, T1.EmprCod, COALESCE( T6.DisPiePie, 0) AS DisPiePie, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtCod, T1.CliCod, T1.DisUniMed, T1.DisDes, T1.DisCod, T1.DisTallUlt, T1.DisRdto4, T1.DisLinPrd, T1.DisCanalID, T1.DisLineaID, T1.DisPla, T4.PRODDs AS DisProdDs, T1.DisProdID AS DisProdID, T1.DisTpEstam, T1.DisPriorid, T1.DisAntp, T1.DisAntpT, T1.DisNumTen, T1.DibColColN, T1.DisDibCoCN, T1.DibColCol, T1.DisFecPed, T1.DisNMtr, T1.DisAcc, T1.DisItem6, T1.DisItem5, T1.DisItem4, T1.DisItem3, T1.DisItem2, T1.DisItem1, T1.DisEncCli, T1.DisExp, T1.DisMaqEst, T1.DisRec, T3.CliCtrl, T1.DisGraTam, T1.DisDesCol, T1.DisOrdGra, T1.DisOrdSep, T1.DisFacGra, T1.DisFacSep, T1.EmpesCod, T1.DisCom, T1.DibInt, T1.DibCli, T1.DisUsrCod, T1.DisNPzasL, T1.DisNPzas, T1.DisTin, T1.DisEnv, T1.DisFecLan, T1.DisCliDes, T1.DisNumTon, T1.DisManCod2, T1.DisManCod1, T1.DisFac, T1.MaqCodDis, T1.DisGraCru2, T1.DisGraAca2, T1.DisAncSal3, T1.DisAncSal2, T1.DisAncSal1, T1.DisNumCor, T1.DisPle2, T1.DisMtrLot, T1.DisKgsLot, T1.DisNumLot, T1.DisTipDis, T1.DisRdoA, T1.DisRdoN, T1.DisGraAca, T1.DisPart, T1.DisLoc, T1.DisGraCru, T1.DisNumUni, T1.DisNumPie, T1.DisEncAnh, T1.DisEncCom, T1.DisNumCli, T1.DisNomCli, T1.DisMtrLan, T1.DisKgmLan, T1.DisPieLan, T1.DisPreMtr, T1.DisPreKgm, T1.DisEst, T1.DisArtAc2, T1.DisArtAcb, T1.DisArtAn1, T1.DisArtAnh, T1.DisArtPes, T1.DisArtPu3, T1.DisArtUr3, T1.DisArtPu2, T1.DisArtUr2, T1.DisArtPu1, T1.DisArtUr1, T1.DisArtUrg, T1.DisArtRdt, T1.DisArtPt3, T1.DisArtTr3, T1.DisArtPt2, T1.DisArtTr2, T1.DisArtPt1 FROM (((((TXPDISPOS T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPPRIORD T4 ON T4.EmprCod = T1.EmprCod AND T4.PRODId = T1.DisProdID) LEFT JOIN (SELECT SUM(Piezas) AS GXC1, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T5 ON T5.EmprCod = T1.EmprCod AND T5.DisCod = T1.DisCod) LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T6 ON T6.EmprCod = T1.EmprCod AND T6.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00KG6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00KG8", "SELECT COALESCE( T1.GXC1, 0) AS DisPie FROM (SELECT SUM(Piezas) AS GXC1, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00KG10", "SELECT COALESCE( T1.DisPiePie, 0) AS DisPiePie FROM (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00KG11", "SELECT SUM(Piezas) AS GXC1 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00KG12", "SELECT SUM(Metros) AS GXC4 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00KG13", "SELECT SUM(Kilos) AS GXC3 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00KG14", "SELECT SUM(Kilos) AS GXC3 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00KG15", "SELECT SUM(DisPieKil) AS GXC6 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00KG16", "SELECT SUM(Metros) AS GXC4 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00KG17", "SELECT SUM(DisPieMet) AS GXC8 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 8);
               ((String[]) buf[16])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(18, 1);
               ((short[]) buf[19])[0] = rslt.getShort(19);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(20, 3);
               ((short[]) buf[22])[0] = rslt.getShort(21);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((byte[]) buf[24])[0] = rslt.getByte(22);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(23);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(24, 13);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(25, 16);
               ((int[]) buf[31])[0] = rslt.getInt(26);
               ((String[]) buf[32])[0] = rslt.getString(27, 1);
               ((String[]) buf[33])[0] = rslt.getString(28, 1);
               ((int[]) buf[34])[0] = rslt.getInt(29);
               ((short[]) buf[35])[0] = rslt.getShort(30);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(31,40);
               ((String[]) buf[37])[0] = rslt.getString(32, 4);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((int[]) buf[39])[0] = rslt.getInt(33);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(34);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(35, 1);
               ((String[]) buf[44])[0] = rslt.getString(36, 20);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(37, 6);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((byte[]) buf[48])[0] = rslt.getByte(38);
               ((byte[]) buf[49])[0] = rslt.getByte(39);
               ((String[]) buf[50])[0] = rslt.getString(40, 1);
               ((String[]) buf[51])[0] = rslt.getString(41, 1);
               ((String[]) buf[52])[0] = rslt.getString(42, 10);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((int[]) buf[54])[0] = rslt.getInt(43);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((int[]) buf[56])[0] = rslt.getInt(44);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(45, 12);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[60])[0] = rslt.getGXDate(46);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(47, 10);
               ((String[]) buf[63])[0] = rslt.getString(48, 1);
               ((String[]) buf[64])[0] = rslt.getString(49, 20);
               ((String[]) buf[65])[0] = rslt.getString(50, 20);
               ((String[]) buf[66])[0] = rslt.getString(51, 20);
               ((String[]) buf[67])[0] = rslt.getString(52, 20);
               ((String[]) buf[68])[0] = rslt.getString(53, 20);
               ((String[]) buf[69])[0] = rslt.getString(54, 20);
               ((String[]) buf[70])[0] = rslt.getString(55, 20);
               ((String[]) buf[71])[0] = rslt.getString(56, 1);
               ((String[]) buf[72])[0] = rslt.getString(57, 6);
               ((String[]) buf[73])[0] = rslt.getString(58, 30);
               ((String[]) buf[74])[0] = rslt.getString(59, 1);
               ((String[]) buf[75])[0] = rslt.getString(60, 1);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((byte[]) buf[77])[0] = rslt.getByte(61);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((byte[]) buf[79])[0] = rslt.getByte(62);
               ((byte[]) buf[80])[0] = rslt.getByte(63);
               ((byte[]) buf[81])[0] = rslt.getByte(64);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((byte[]) buf[83])[0] = rslt.getByte(65);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(66, 16);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getString(67, 12);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((int[]) buf[89])[0] = rslt.getInt(68);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getString(69, 16);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getString(70, 8);
               ((int[]) buf[94])[0] = rslt.getInt(71);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((int[]) buf[96])[0] = rslt.getInt(72);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((String[]) buf[98])[0] = rslt.getString(73, 1);
               ((byte[]) buf[99])[0] = rslt.getByte(74);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[101])[0] = rslt.getGXDate(75);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((int[]) buf[103])[0] = rslt.getInt(76);
               ((String[]) buf[104])[0] = rslt.getString(77, 10);
               ((short[]) buf[105])[0] = rslt.getShort(78);
               ((short[]) buf[106])[0] = rslt.getShort(79);
               ((String[]) buf[107])[0] = rslt.getString(80, 1);
               ((String[]) buf[108])[0] = rslt.getString(81, 6);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((short[]) buf[110])[0] = rslt.getShort(82);
               ((short[]) buf[111])[0] = rslt.getShort(83);
               ((short[]) buf[112])[0] = rslt.getShort(84);
               ((short[]) buf[113])[0] = rslt.getShort(85);
               ((short[]) buf[114])[0] = rslt.getShort(86);
               ((short[]) buf[115])[0] = rslt.getShort(87);
               ((String[]) buf[116])[0] = rslt.getString(88, 30);
               ((java.math.BigDecimal[]) buf[117])[0] = rslt.getBigDecimal(89,2);
               ((java.math.BigDecimal[]) buf[118])[0] = rslt.getBigDecimal(90,2);
               ((int[]) buf[119])[0] = rslt.getInt(91);
               ((String[]) buf[120])[0] = rslt.getString(92, 1);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[122])[0] = rslt.getBigDecimal(93,2);
               ((java.math.BigDecimal[]) buf[123])[0] = rslt.getBigDecimal(94,2);
               ((short[]) buf[124])[0] = rslt.getShort(95);
               ((short[]) buf[125])[0] = rslt.getShort(96);
               ((String[]) buf[126])[0] = rslt.getString(97, 10);
               ((short[]) buf[127])[0] = rslt.getShort(98);
               ((java.math.BigDecimal[]) buf[128])[0] = rslt.getBigDecimal(99,2);
               ((short[]) buf[129])[0] = rslt.getShort(100);
               ((java.math.BigDecimal[]) buf[130])[0] = rslt.getBigDecimal(101,2);
               ((java.math.BigDecimal[]) buf[131])[0] = rslt.getBigDecimal(102,2);
               ((int[]) buf[132])[0] = rslt.getInt(103);
               ((String[]) buf[133])[0] = rslt.getString(104, 13);
               ((short[]) buf[134])[0] = rslt.getShort(105);
               ((short[]) buf[135])[0] = rslt.getShort(106);
               ((short[]) buf[136])[0] = rslt.getShort(107);
               ((java.math.BigDecimal[]) buf[137])[0] = rslt.getBigDecimal(108,2);
               ((java.math.BigDecimal[]) buf[138])[0] = rslt.getBigDecimal(109,2);
               ((byte[]) buf[139])[0] = rslt.getByte(110);
               ((short[]) buf[140])[0] = rslt.getShort(111);
               ((short[]) buf[141])[0] = rslt.getShort(112);
               ((short[]) buf[142])[0] = rslt.getShort(113);
               ((short[]) buf[143])[0] = rslt.getShort(114);
               ((short[]) buf[144])[0] = rslt.getShort(115);
               ((short[]) buf[145])[0] = rslt.getShort(116);
               ((boolean[]) buf[146])[0] = rslt.wasNull();
               ((String[]) buf[147])[0] = rslt.getString(117, 4);
               ((short[]) buf[148])[0] = rslt.getShort(118);
               ((String[]) buf[149])[0] = rslt.getString(119, 4);
               ((short[]) buf[150])[0] = rslt.getShort(120);
               ((String[]) buf[151])[0] = rslt.getString(121, 4);
               ((byte[]) buf[152])[0] = rslt.getByte(122);
               ((java.math.BigDecimal[]) buf[153])[0] = rslt.getBigDecimal(123,2);
               ((short[]) buf[154])[0] = rslt.getShort(124);
               ((String[]) buf[155])[0] = rslt.getString(125, 4);
               ((short[]) buf[156])[0] = rslt.getShort(126);
               ((String[]) buf[157])[0] = rslt.getString(127, 4);
               ((short[]) buf[158])[0] = rslt.getShort(128);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 8 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 10 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 11 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

