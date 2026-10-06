package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrn04general_impl extends GXWebComponent
{
   public ttrn04general_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrn04general_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn04general_impl.class ));
   }

   public ttrn04general_impl( int remoteHandle ,
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
      cmbBarEstReo = new HTMLChoice();
      chkBarTin = UIFactory.getCheckbox(this);
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
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Integer.valueOf(A129BarCod),Byte.valueOf(A132BarCodReo),A130BarCodPar});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"BARLINPRD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13815LinPrdDcID = httpContext.GetPar( "LinPrdDcID") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgabarlinprdEI0( A396EmprCod, A13815LinPrdDcID) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"BARLINPRD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13815LinPrdDcID = httpContext.GetPar( "LinPrdDcID") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgabarlinprdEI0( A396EmprCod, A13815LinPrdDcID) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"BARLINPRD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               h13077BarLinPrd = httpContext.GetPar( "h13077BarLinPrd") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcabarlinprdEI2( A396EmprCod, h13077BarLinPrd) ;
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
         paEI2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "TTrn04 General", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ttrn04general", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA129BarCod", GXutil.ltrim( localUtil.ntoc( wcpOA129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA132BarCodReo", GXutil.ltrim( localUtil.ntoc( wcpOA132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA130BarCodPar", GXutil.rtrim( wcpOA130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCBARLINPRD", GXutil.rtrim( A13077BarLinPrd));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARTIPCOL", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARKGM", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARMTR", GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
   }

   public void renderHtmlCloseFormEI2( )
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
      return "TTrn04General" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TTrn04 General", "") ;
   }

   public void wbEI0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.ttrn04general");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarNHdr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarNHdr_Internalname, httpContext.getMessage( "N° Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarNHdr_Internalname, GXutil.rtrim( A13696BarNHdr), GXutil.rtrim( localUtil.format( A13696BarNHdr, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNHdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarNHdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn04General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divBartipdis_cell_Internalname, 1, 0, "px", 0, "px", divBartipdis_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtBarTipDis_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarTipDis_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipDis_Internalname, GXutil.rtrim( A2010BarTipDis), GXutil.rtrim( localUtil.format( A2010BarTipDis, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipDis_Jsonclick, 0, "AttributeFL", "", "", "", "", edtBarTipDis_Visible, edtBarTipDis_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn04General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbBarEstReo.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbBarEstReo.getInternalname(), httpContext.getMessage( "Tipo Produccion", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbBarEstReo, cmbBarEstReo.getInternalname(), GXutil.trim( GXutil.str( A148BarEstReo, 1, 0)), 1, cmbBarEstReo.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbBarEstReo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TTrn04General.htm");
         cmbBarEstReo.setValue( GXutil.trim( GXutil.str( A148BarEstReo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbBarEstReo.getInternalname(), "Values", cmbBarEstReo.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkBarTin.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkBarTin.getInternalname(), httpContext.getMessage( "Tinte ?", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkBarTin.getInternalname(), A4016BarTin, "", httpContext.getMessage( "Tinte ?", ""), 1, chkBarTin.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPlf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarPlf_Internalname, httpContext.getMessage( "Tipo, Valor S o N", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarPlf_Internalname, GXutil.rtrim( A3030BarPlf), GXutil.rtrim( localUtil.format( A3030BarPlf, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPlf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarPlf_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn04General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divBarlinprd_cell_Internalname, 1, 0, "px", 0, "px", divBarlinprd_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtBarLinPrd_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarLinPrd_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarLinPrd_Internalname, httpContext.getMessage( "Linea de Produccion", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarLinPrd_Internalname, h13077BarLinPrd, GXutil.rtrim( localUtil.format( h13077BarLinPrd, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarLinPrd_Jsonclick, 0, "AttributeFL", "", "", "", "", edtBarLinPrd_Visible, edtBarLinPrd_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TTrn04General.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn04General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn04General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCliDes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarCliDes_Internalname, httpContext.getMessage( "Cliente Destino", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCliDes_Internalname, GXutil.ltrim( localUtil.ntoc( A2311BarCliDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCliDes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2311BarCliDes), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2311BarCliDes), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCliDes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCliDes_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn04General.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, divUnnamedtable3_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divBardisnum_cell_Internalname, 1, 0, "px", 0, "px", divBardisnum_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtBarDisNum_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarDisNum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarDisNum_Internalname, httpContext.getMessage( "Disposicion Cliente", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarDisNum_Internalname, GXutil.rtrim( A143BarDisNum), GXutil.rtrim( localUtil.format( A143BarDisNum, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarDisNum_Jsonclick, 0, "AttributeFL", "", "", "", "", edtBarDisNum_Visible, edtBarDisNum_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn04General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divBarenccli_cell_Internalname, 1, 0, "px", 0, "px", divBarenccli_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtBarEncCli_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarEncCli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarEncCli_Internalname, httpContext.getMessage( "Disposicion Cliente Nueva", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarEncCli_Internalname, GXutil.rtrim( A4812BarEncCli), GXutil.rtrim( localUtil.format( A4812BarEncCli, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarEncCli_Jsonclick, 0, "AttributeFL", "", "", "", "", edtBarEncCli_Visible, edtBarEncCli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn04General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divBaritem5_cell_Internalname, 1, 0, "px", 0, "px", divBaritem5_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtBarItem5_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarItem5_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarItem5_Internalname, httpContext.getMessage( "Lote", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarItem5_Internalname, GXutil.rtrim( A9789BarItem5), GXutil.rtrim( localUtil.format( A9789BarItem5, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarItem5_Jsonclick, 0, "AttributeFL", "", "", "", "", edtBarItem5_Visible, edtBarItem5_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn04General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divBaritem1_cell_Internalname, 1, 0, "px", 0, "px", divBaritem1_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtBarItem1_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarItem1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarItem1_Internalname, httpContext.getMessage( "Orden Compra", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarItem1_Internalname, GXutil.rtrim( A9775BarItem1), GXutil.rtrim( localUtil.format( A9775BarItem1, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarItem1_Jsonclick, 0, "AttributeFL", "", "", "", "", edtBarItem1_Visible, edtBarItem1_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn04General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divBaritem2_cell_Internalname, 1, 0, "px", 0, "px", divBaritem2_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtbarItem2_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtbarItem2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtbarItem2_Internalname, httpContext.getMessage( "N Pedido Comercial", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtbarItem2_Internalname, GXutil.rtrim( A9776barItem2), GXutil.rtrim( localUtil.format( A9776barItem2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtbarItem2_Jsonclick, 0, "AttributeFL", "", "", "", "", edtbarItem2_Visible, edtbarItem2_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn04General.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, divUnnamedtable4_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divBartipcor_cell_Internalname, 1, 0, "px", 0, "px", divBartipcor_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", chkBarTipCor.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkBarTipCor.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkBarTipCor.getInternalname(), httpContext.getMessage( "Exportar?", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkBarTipCor.getInternalname(), A5291BarTipCor, "", httpContext.getMessage( "Exportar?", ""), chkBarTipCor.getVisible(), chkBarTipCor.getEnabled(), "SI", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divNxt_artcl2_cell_Internalname, 1, 0, "px", 0, "px", divNxt_artcl2_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtNxt_ArtCl2_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNxt_ArtCl2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNxt_ArtCl2_Internalname, httpContext.getMessage( "Destino", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNxt_ArtCl2_Internalname, GXutil.rtrim( A11852Nxt_ArtCl2), GXutil.rtrim( localUtil.format( A11852Nxt_ArtCl2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNxt_ArtCl2_Jsonclick, 0, "AttributeFL", "", "", "", "", edtNxt_ArtCl2_Visible, edtNxt_ArtCl2_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn04General.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", httpContext.getMessage( "GXM_update", ""), bttBtnupdate_Jsonclick, 7, httpContext.getMessage( "GXM_update", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11ei1_client"+"'", TempTags, "", 2, "HLP_TTrn04General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtndelete_Jsonclick, 7, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e12ei1_client"+"'", TempTags, "", 2, "HLP_TTrn04General.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCod_Visible, 0, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn04General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodReo_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn04General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodPar_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn04General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "Attribute", "", "", "", "", edtDisCod_Visible, 0, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn04General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarGots_Internalname, GXutil.rtrim( A13855BarGots), GXutil.rtrim( localUtil.format( A13855BarGots, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarGots_Jsonclick, 0, "Attribute", "", "", "", "", edtBarGots_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn04General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarGrs_Internalname, GXutil.rtrim( A13856BarGrs), GXutil.rtrim( localUtil.format( A13856BarGrs, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarGrs_Jsonclick, 0, "Attribute", "", "", "", "", edtBarGrs_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn04General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarOcs_Internalname, GXutil.rtrim( A13857BarOcs), GXutil.rtrim( localUtil.format( A13857BarOcs, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarOcs_Jsonclick, 0, "Attribute", "", "", "", "", edtBarOcs_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn04General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarRcs_Internalname, GXutil.rtrim( A13858BarRcs), GXutil.rtrim( localUtil.format( A13858BarRcs, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarRcs_Jsonclick, 0, "Attribute", "", "", "", "", edtBarRcs_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn04General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarOeko_Internalname, GXutil.rtrim( A13859BarOeko), GXutil.rtrim( localUtil.format( A13859BarOeko, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarOeko_Jsonclick, 0, "Attribute", "", "", "", "", edtBarOeko_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn04General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarAccesor_Internalname, GXutil.rtrim( A13860BarAccesor), GXutil.rtrim( localUtil.format( A13860BarAccesor, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAccesor_Jsonclick, 0, "Attribute", "", "", "", "", edtBarAccesor_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn04General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarMarca_Internalname, GXutil.rtrim( A13861BarMarca), GXutil.rtrim( localUtil.format( A13861BarMarca, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMarca_Jsonclick, 0, "Attribute", "", "", "", "", edtBarMarca_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn04General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBar_MacCod_Internalname, GXutil.ltrim( localUtil.ntoc( A13862Bar_MacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13862Bar_MacCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBar_MacCod_Jsonclick, 0, "Attribute", "", "", "", "", edtBar_MacCod_Visible, 0, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn04General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasCod2_Internalname, GXutil.rtrim( A13863BarFasCod2), GXutil.rtrim( localUtil.format( A13863BarFasCod2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasCod2_Jsonclick, 0, "Attribute", "", "", "", "", edtBarFasCod2_Visible, 0, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn04General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasDsc2_Internalname, GXutil.rtrim( A13864BarFasDsc2), GXutil.rtrim( localUtil.format( A13864BarFasDsc2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasDsc2_Jsonclick, 0, "Attribute", "", "", "", "", edtBarFasDsc2_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn04General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipColD_Internalname, GXutil.rtrim( A13868BarTipColD), GXutil.rtrim( localUtil.format( A13868BarTipColD, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipColD_Jsonclick, 0, "Attribute", "", "", "", "", edtBarTipColD_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn04General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPedidoClie_Internalname, GXutil.rtrim( A13878PedidoClie), GXutil.rtrim( localUtil.format( A13878PedidoClie, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedidoClie_Jsonclick, 0, "Attribute", "", "", "", "", edtPedidoClie_Visible, 0, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn04General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtKilosEntre_Internalname, GXutil.ltrim( localUtil.ntoc( A13887KilosEntre, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A13887KilosEntre, "ZZZZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKilosEntre_Jsonclick, 0, "Attribute", "", "", "", "", edtKilosEntre_Visible, 0, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn04General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMetrosEntr_Internalname, GXutil.ltrim( localUtil.ntoc( A13888MetrosEntr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13888MetrosEntr), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetrosEntr_Jsonclick, 0, "Attribute", "", "", "", "", edtMetrosEntr_Visible, 0, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn04General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtKilosPendi_Internalname, GXutil.ltrim( localUtil.ntoc( A13885KilosPendi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A13885KilosPendi, "ZZZZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKilosPendi_Jsonclick, 0, "Attribute", "", "", "", "", edtKilosPendi_Visible, 0, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn04General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMetrosPend_Internalname, GXutil.ltrim( localUtil.ntoc( A13886MetrosPend, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A13886MetrosPend, "ZZZZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetrosPend_Jsonclick, 0, "Attribute", "", "", "", "", edtMetrosPend_Visible, 0, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn04General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarHDSusp_Internalname, GXutil.ltrim( localUtil.ntoc( A13890BarHDSusp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13890BarHDSusp), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarHDSusp_Jsonclick, 0, "Attribute", "", "", "", "", edtBarHDSusp_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn04General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void startEI2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "TTrn04 General", ""), (short)(0)) ;
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
            strupEI0( ) ;
         }
      }
   }

   public void wsEI2( )
   {
      startEI2( ) ;
      evtEI2( ) ;
   }

   public void evtEI2( )
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
                              strupEI0( ) ;
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
                              strupEI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e13EI2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupEI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e14EI2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupEI0( ) ;
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
                              strupEI0( ) ;
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

   public void weEI2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormEI2( ) ;
         }
      }
   }

   public void paEI2( )
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

   public void gxsgabarlinprdEI0( String A396EmprCod ,
                                  String A13815LinPrdDcID )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgabarlinprd_dataEI0( A396EmprCod, A13815LinPrdDcID) ;
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

   protected void gxsgabarlinprd_dataEI0( String A396EmprCod ,
                                          String A13815LinPrdDcID )
   {
      l13815LinPrdDcID = GXutil.concat( GXutil.rtrim( A13815LinPrdDcID), "%", "") ;
      /* Using cursor H00EI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, l13815LinPrdDcID});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(H00EI2_A13815LinPrdDcID[0]);
         gxdynajaxctrldescr.add(H00EI2_A13815LinPrdDcID[0]);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxhcabarlinprdEI2( String A396EmprCod ,
                                  String A13815LinPrdDcID )
   {
      /* Using cursor H00EI3 */
      pr_default.execute(1, new Object[] {A13815LinPrdDcID, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13815LinPrdDcID = H00EI3_A13815LinPrdDcID[0] ;
         A396EmprCod = H00EI3_A396EmprCod[0] ;
         A13078LinPrdID = H00EI3_A13078LinPrdID[0] ;
         pr_default.readNext(1);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13078LinPrdID))+"\"") ;
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
      pr_default.close(1);
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
      if ( cmbBarEstReo.getItemCount() > 0 )
      {
         A148BarEstReo = (byte)(GXutil.lval( cmbBarEstReo.getValidValue(GXutil.trim( GXutil.str( A148BarEstReo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A148BarEstReo", GXutil.str( A148BarEstReo, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbBarEstReo.setValue( GXutil.trim( GXutil.str( A148BarEstReo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbBarEstReo.getInternalname(), "Values", cmbBarEstReo.ToJavascriptSource(), true);
      }
      A4016BarTin = ((GXutil.strcmp(GXutil.rtrim( A4016BarTin), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4016BarTin", A4016BarTin);
      A5291BarTipCor = ((GXutil.strcmp(GXutil.rtrim( A5291BarTipCor), "SI")==0) ? "SI" : "NO") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5291BarTipCor", A5291BarTipCor);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfEI2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV17Pgmname = "TTrn04General" ;
      Gx_err = (short)(0) ;
   }

   public void rfEI2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00EI12 */
         pr_default.execute(2, new Object[] {A396EmprCod, A396EmprCod, A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A4466BarAcaAnh = H00EI12_A4466BarAcaAnh[0] ;
            A11852Nxt_ArtCl2 = H00EI12_A11852Nxt_ArtCl2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11852Nxt_ArtCl2", A11852Nxt_ArtCl2);
            A5291BarTipCor = H00EI12_A5291BarTipCor[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5291BarTipCor", A5291BarTipCor);
            A9776barItem2 = H00EI12_A9776barItem2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9776barItem2", A9776barItem2);
            A9775BarItem1 = H00EI12_A9775BarItem1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9775BarItem1", A9775BarItem1);
            A9789BarItem5 = H00EI12_A9789BarItem5[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9789BarItem5", A9789BarItem5);
            A2311BarCliDes = H00EI12_A2311BarCliDes[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2311BarCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2311BarCliDes), 6, 0));
            A279CliNom = H00EI12_A279CliNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", A279CliNom);
            A252CliCod = H00EI12_A252CliCod[0] ;
            n252CliCod = H00EI12_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A13077BarLinPrd = H00EI12_A13077BarLinPrd[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13077BarLinPrd", A13077BarLinPrd);
            A3030BarPlf = H00EI12_A3030BarPlf[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3030BarPlf", A3030BarPlf);
            A4016BarTin = H00EI12_A4016BarTin[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4016BarTin", A4016BarTin);
            A148BarEstReo = H00EI12_A148BarEstReo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A148BarEstReo", GXutil.str( A148BarEstReo, 1, 0));
            A2010BarTipDis = H00EI12_A2010BarTipDis[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2010BarTipDis", A2010BarTipDis);
            A13890BarHDSusp = H00EI12_A13890BarHDSusp[0] ;
            n13890BarHDSusp = H00EI12_n13890BarHDSusp[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13890BarHDSusp", GXutil.str( A13890BarHDSusp, 1, 0));
            A13862Bar_MacCod = H00EI12_A13862Bar_MacCod[0] ;
            n13862Bar_MacCod = H00EI12_n13862Bar_MacCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13862Bar_MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13862Bar_MacCod), 8, 0));
            A13861BarMarca = H00EI12_A13861BarMarca[0] ;
            n13861BarMarca = H00EI12_n13861BarMarca[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13861BarMarca", A13861BarMarca);
            A13860BarAccesor = H00EI12_A13860BarAccesor[0] ;
            n13860BarAccesor = H00EI12_n13860BarAccesor[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13860BarAccesor", A13860BarAccesor);
            A361DisCod = H00EI12_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A13863BarFasCod2 = H00EI12_A13863BarFasCod2[0] ;
            n13863BarFasCod2 = H00EI12_n13863BarFasCod2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13863BarFasCod2", A13863BarFasCod2);
            A218BarTipCol = H00EI12_A218BarTipCol[0] ;
            A143BarDisNum = H00EI12_A143BarDisNum[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
            A4812BarEncCli = H00EI12_A4812BarEncCli[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
            A13887KilosEntre = H00EI12_A13887KilosEntre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13887KilosEntre", GXutil.ltrimstr( A13887KilosEntre, 9, 2));
            A166BarKgm = H00EI12_A166BarKgm[0] ;
            A13888MetrosEntr = H00EI12_A13888MetrosEntr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13888MetrosEntr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13888MetrosEntr), 4, 0));
            A184BarMtr = H00EI12_A184BarMtr[0] ;
            A279CliNom = H00EI12_A279CliNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", A279CliNom);
            A13861BarMarca = H00EI12_A13861BarMarca[0] ;
            n13861BarMarca = H00EI12_n13861BarMarca[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13861BarMarca", A13861BarMarca);
            A13890BarHDSusp = H00EI12_A13890BarHDSusp[0] ;
            n13890BarHDSusp = H00EI12_n13890BarHDSusp[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13890BarHDSusp", GXutil.str( A13890BarHDSusp, 1, 0));
            A13862Bar_MacCod = H00EI12_A13862Bar_MacCod[0] ;
            n13862Bar_MacCod = H00EI12_n13862Bar_MacCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13862Bar_MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13862Bar_MacCod), 8, 0));
            A166BarKgm = H00EI12_A166BarKgm[0] ;
            A184BarMtr = H00EI12_A184BarMtr[0] ;
            A13887KilosEntre = H00EI12_A13887KilosEntre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13887KilosEntre", GXutil.ltrimstr( A13887KilosEntre, 9, 2));
            A13888MetrosEntr = H00EI12_A13888MetrosEntr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13888MetrosEntr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13888MetrosEntr), 4, 0));
            A13863BarFasCod2 = H00EI12_A13863BarFasCod2[0] ;
            n13863BarFasCod2 = H00EI12_n13863BarFasCod2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13863BarFasCod2", A13863BarFasCod2);
            A13860BarAccesor = H00EI12_A13860BarAccesor[0] ;
            n13860BarAccesor = H00EI12_n13860BarAccesor[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13860BarAccesor", A13860BarAccesor);
            GXt_char1 = A13855BarGots ;
            GXv_char2[0] = GXt_char1 ;
            new app.recuperonormagots(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
            ttrn04general_impl.this.GXt_char1 = GXv_char2[0] ;
            A13855BarGots = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13855BarGots", A13855BarGots);
            GXt_char1 = A13856BarGrs ;
            GXv_char2[0] = GXt_char1 ;
            new app.recuperonormagrs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
            ttrn04general_impl.this.GXt_char1 = GXv_char2[0] ;
            A13856BarGrs = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13856BarGrs", A13856BarGrs);
            GXt_char1 = A13857BarOcs ;
            GXv_char2[0] = GXt_char1 ;
            new app.recuperonormaocs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
            ttrn04general_impl.this.GXt_char1 = GXv_char2[0] ;
            A13857BarOcs = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13857BarOcs", A13857BarOcs);
            GXt_char1 = A13858BarRcs ;
            GXv_char2[0] = GXt_char1 ;
            new app.recuperonormarcs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
            ttrn04general_impl.this.GXt_char1 = GXv_char2[0] ;
            A13858BarRcs = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13858BarRcs", A13858BarRcs);
            GXt_char1 = A13859BarOeko ;
            GXv_char2[0] = GXt_char1 ;
            new app.recuperonormaoeko(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
            ttrn04general_impl.this.GXt_char1 = GXv_char2[0] ;
            A13859BarOeko = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13859BarOeko", A13859BarOeko);
            GXt_char1 = A13868BarTipColD ;
            GXv_char2[0] = A396EmprCod ;
            GXv_int3[0] = A218BarTipCol ;
            GXv_char4[0] = GXt_char1 ;
            new app.pfcoldsc(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4) ;
            ttrn04general_impl.this.A396EmprCod = GXv_char2[0] ;
            ttrn04general_impl.this.A218BarTipCol = GXv_int3[0] ;
            ttrn04general_impl.this.GXt_char1 = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
            A13868BarTipColD = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13868BarTipColD", A13868BarTipColD);
            GXt_char1 = A13878PedidoClie ;
            GXv_char4[0] = A396EmprCod ;
            GXv_char2[0] = A4812BarEncCli ;
            GXv_char5[0] = A143BarDisNum ;
            GXv_char6[0] = GXt_char1 ;
            new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char4, GXv_char2, GXv_char5, GXv_char6) ;
            ttrn04general_impl.this.A396EmprCod = GXv_char4[0] ;
            ttrn04general_impl.this.A4812BarEncCli = GXv_char2[0] ;
            ttrn04general_impl.this.A143BarDisNum = GXv_char5[0] ;
            ttrn04general_impl.this.GXt_char1 = GXv_char6[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
            A13878PedidoClie = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13878PedidoClie", A13878PedidoClie);
            /* Execute user event: Load */
            e14EI2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         wbEI0( ) ;
      }
   }

   public void send_integrity_lvl_hashesEI2( )
   {
   }

   public void before_start_formulas( )
   {
      AV17Pgmname = "TTrn04General" ;
      Gx_err = (short)(0) ;
      /* Using cursor H00EI14 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A13890BarHDSusp = H00EI14_A13890BarHDSusp[0] ;
         n13890BarHDSusp = H00EI14_n13890BarHDSusp[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13890BarHDSusp", GXutil.str( A13890BarHDSusp, 1, 0));
      }
      else
      {
         A13890BarHDSusp = (byte)(0) ;
         n13890BarHDSusp = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13890BarHDSusp", GXutil.str( A13890BarHDSusp, 1, 0));
      }
      pr_default.close(3);
      /* Using cursor H00EI16 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(4) != 101) )
      {
         A13862Bar_MacCod = H00EI16_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = H00EI16_n13862Bar_MacCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13862Bar_MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13862Bar_MacCod), 8, 0));
      }
      else
      {
         A13862Bar_MacCod = 0 ;
         n13862Bar_MacCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13862Bar_MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13862Bar_MacCod), 8, 0));
      }
      pr_default.close(4);
      /* Using cursor H00EI18 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A166BarKgm = H00EI18_A166BarKgm[0] ;
         A184BarMtr = H00EI18_A184BarMtr[0] ;
      }
      else
      {
         A184BarMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A166BarKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      }
      pr_default.close(5);
      /* Using cursor H00EI20 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A13887KilosEntre = H00EI20_A13887KilosEntre[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13887KilosEntre", GXutil.ltrimstr( A13887KilosEntre, 9, 2));
         A13888MetrosEntr = H00EI20_A13888MetrosEntr[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13888MetrosEntr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13888MetrosEntr), 4, 0));
      }
      else
      {
         A13888MetrosEntr = (short)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13888MetrosEntr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13888MetrosEntr), 4, 0));
         A13887KilosEntre = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13887KilosEntre", GXutil.ltrimstr( A13887KilosEntre, 9, 2));
      }
      pr_default.close(6);
      A13885KilosPendi = (A166BarKgm.subtract(A13887KilosEntre)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13885KilosPendi", GXutil.ltrimstr( A13885KilosPendi, 9, 2));
      A13886MetrosPend = (A184BarMtr.subtract(DecimalUtil.doubleToDec(A13888MetrosEntr))) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13886MetrosPend", GXutil.ltrimstr( A13886MetrosPend, 9, 2));
      /* Using cursor H00EI23 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A13863BarFasCod2 = H00EI23_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = H00EI23_n13863BarFasCod2[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13863BarFasCod2", A13863BarFasCod2);
      }
      else
      {
         A13863BarFasCod2 = " " ;
         n13863BarFasCod2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13863BarFasCod2", A13863BarFasCod2);
      }
      pr_default.close(7);
      GXt_char1 = A13864BarFasDsc2 ;
      GXv_char6[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A13863BarFasCod2, GXv_char6) ;
      ttrn04general_impl.this.GXt_char1 = GXv_char6[0] ;
      A13864BarFasDsc2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13864BarFasDsc2", A13864BarFasDsc2);
      /* Using cursor H00EI26 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A13860BarAccesor = H00EI26_A13860BarAccesor[0] ;
         n13860BarAccesor = H00EI26_n13860BarAccesor[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13860BarAccesor", A13860BarAccesor);
      }
      else
      {
         A13860BarAccesor = "" ;
         n13860BarAccesor = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13860BarAccesor", A13860BarAccesor);
      }
      pr_default.close(8);
      A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13696BarNHdr", A13696BarNHdr);
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
      fix_multi_value_controls( ) ;
   }

   public void strupEI0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13EI2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOA132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOA130BarCodPar = httpContext.cgiGet( sPrefix+"wcpOA130BarCodPar") ;
         A396EmprCod = httpContext.cgiGet( sPrefix+"EMPRCOD") ;
         /* Read variables values. */
         A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13696BarNHdr", A13696BarNHdr);
         A2010BarTipDis = GXutil.upper( httpContext.cgiGet( edtBarTipDis_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2010BarTipDis", A2010BarTipDis);
         cmbBarEstReo.setValue( httpContext.cgiGet( cmbBarEstReo.getInternalname()) );
         A148BarEstReo = (byte)(GXutil.lval( httpContext.cgiGet( cmbBarEstReo.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A148BarEstReo", GXutil.str( A148BarEstReo, 1, 0));
         A4016BarTin = ((GXutil.strcmp(httpContext.cgiGet( chkBarTin.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4016BarTin", A4016BarTin);
         A3030BarPlf = GXutil.upper( httpContext.cgiGet( edtBarPlf_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3030BarPlf", A3030BarPlf);
         h13077BarLinPrd = httpContext.cgiGet( edtBarLinPrd_Internalname) ;
         if ( (GXutil.strcmp("", h13077BarLinPrd)==0) )
         {
            A13077BarLinPrd = "" ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13077BarLinPrd", A13077BarLinPrd);
         }
         else
         {
            A13815LinPrdDcID = h13077BarLinPrd ;
            /* Using cursor H00EI27 */
            pr_default.execute(9, new Object[] {A13815LinPrdDcID, A396EmprCod});
            A13077BarLinPrd = H00EI27_A13078LinPrdID[0] ;
            if ( ! ( (pr_default.getStatus(9) == 101) ) )
            {
               pr_default.readNext(9);
               if ( ! ( (pr_default.getStatus(9) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "BARLINPRD");
               }
            }
            else
            {
            }
            pr_default.close(9);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h13077BarLinPrd", h13077BarLinPrd);
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", A279CliNom);
         A2311BarCliDes = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCliDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2311BarCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2311BarCliDes), 6, 0));
         A143BarDisNum = httpContext.cgiGet( edtBarDisNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
         A4812BarEncCli = httpContext.cgiGet( edtBarEncCli_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
         A9789BarItem5 = httpContext.cgiGet( edtBarItem5_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9789BarItem5", A9789BarItem5);
         A9775BarItem1 = httpContext.cgiGet( edtBarItem1_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9775BarItem1", A9775BarItem1);
         A9776barItem2 = httpContext.cgiGet( edtbarItem2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9776barItem2", A9776barItem2);
         A5291BarTipCor = ((GXutil.strcmp(httpContext.cgiGet( chkBarTipCor.getInternalname()), "SI")==0) ? "SI" : "NO") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5291BarTipCor", A5291BarTipCor);
         A11852Nxt_ArtCl2 = httpContext.cgiGet( edtNxt_ArtCl2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11852Nxt_ArtCl2", A11852Nxt_ArtCl2);
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A13855BarGots = httpContext.cgiGet( edtBarGots_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13855BarGots", A13855BarGots);
         A13856BarGrs = httpContext.cgiGet( edtBarGrs_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13856BarGrs", A13856BarGrs);
         A13857BarOcs = httpContext.cgiGet( edtBarOcs_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13857BarOcs", A13857BarOcs);
         A13858BarRcs = httpContext.cgiGet( edtBarRcs_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13858BarRcs", A13858BarRcs);
         A13859BarOeko = httpContext.cgiGet( edtBarOeko_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13859BarOeko", A13859BarOeko);
         A13860BarAccesor = httpContext.cgiGet( edtBarAccesor_Internalname) ;
         n13860BarAccesor = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13860BarAccesor", A13860BarAccesor);
         A13861BarMarca = httpContext.cgiGet( edtBarMarca_Internalname) ;
         n13861BarMarca = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13861BarMarca", A13861BarMarca);
         A13862Bar_MacCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBar_MacCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13862Bar_MacCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13862Bar_MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13862Bar_MacCod), 8, 0));
         A13863BarFasCod2 = httpContext.cgiGet( edtBarFasCod2_Internalname) ;
         n13863BarFasCod2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13863BarFasCod2", A13863BarFasCod2);
         A13864BarFasDsc2 = httpContext.cgiGet( edtBarFasDsc2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13864BarFasDsc2", A13864BarFasDsc2);
         A13868BarTipColD = httpContext.cgiGet( edtBarTipColD_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13868BarTipColD", A13868BarTipColD);
         A13878PedidoClie = httpContext.cgiGet( edtPedidoClie_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13878PedidoClie", A13878PedidoClie);
         A13887KilosEntre = localUtil.ctond( httpContext.cgiGet( edtKilosEntre_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13887KilosEntre", GXutil.ltrimstr( A13887KilosEntre, 9, 2));
         A13888MetrosEntr = (short)(localUtil.ctol( httpContext.cgiGet( edtMetrosEntr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13888MetrosEntr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13888MetrosEntr), 4, 0));
         A13885KilosPendi = localUtil.ctond( httpContext.cgiGet( edtKilosPendi_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13885KilosPendi", GXutil.ltrimstr( A13885KilosPendi, 9, 2));
         A13886MetrosPend = localUtil.ctond( httpContext.cgiGet( edtMetrosPend_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13886MetrosPend", GXutil.ltrimstr( A13886MetrosPend, 9, 2));
         A13890BarHDSusp = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarHDSusp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13890BarHDSusp = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13890BarHDSusp", GXutil.str( A13890BarHDSusp, 1, 0));
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
      e13EI2 ();
      if (returnInSub) return;
   }

   public void e13EI2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV13Station ;
      GXv_char6[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char6) ;
      ttrn04general_impl.this.GXt_char1 = GXv_char6[0] ;
      AV13Station = GXt_char1 ;
      GXv_char6[0] = AV14Emprcod ;
      GXv_char5[0] = AV15Emprnom ;
      GXv_char4[0] = AV16Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char6, GXv_char5, GXv_char4) ;
      ttrn04general_impl.this.AV14Emprcod = GXv_char6[0] ;
      ttrn04general_impl.this.AV15Emprnom = GXv_char5[0] ;
      ttrn04general_impl.this.AV16Usurcod = GXv_char4[0] ;
      GXv_SdtWWPContext7[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV6WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e14EI2( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtBarCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Visible), 5, 0), true);
      edtBarCodReo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCodReo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Visible), 5, 0), true);
      edtBarCodPar_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCodPar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Visible), 5, 0), true);
      edtDisCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Visible), 5, 0), true);
      edtBarGots_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarGots_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGots_Visible), 5, 0), true);
      edtBarGrs_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarGrs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGrs_Visible), 5, 0), true);
      edtBarOcs_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarOcs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOcs_Visible), 5, 0), true);
      edtBarRcs_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarRcs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarRcs_Visible), 5, 0), true);
      edtBarOeko_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarOeko_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOeko_Visible), 5, 0), true);
      edtBarAccesor_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAccesor_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAccesor_Visible), 5, 0), true);
      edtBarMarca_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarMarca_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMarca_Visible), 5, 0), true);
      edtBar_MacCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBar_MacCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBar_MacCod_Visible), 5, 0), true);
      edtBarFasCod2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFasCod2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasCod2_Visible), 5, 0), true);
      edtBarFasDsc2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFasDsc2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasDsc2_Visible), 5, 0), true);
      edtBarTipColD_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarTipColD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipColD_Visible), 5, 0), true);
      edtPedidoClie_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPedidoClie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedidoClie_Visible), 5, 0), true);
      edtKilosEntre_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtKilosEntre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKilosEntre_Visible), 5, 0), true);
      edtMetrosEntr_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetrosEntr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetrosEntr_Visible), 5, 0), true);
      edtKilosPendi_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtKilosPendi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKilosPendi_Visible), 5, 0), true);
      edtMetrosPend_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetrosPend_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetrosPend_Visible), 5, 0), true);
      edtBarHDSusp_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarHDSusp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarHDSusp_Visible), 5, 0), true);
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "EXPENC", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         chkBarTipCor.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkBarTipCor.getInternalname(), "Visible", GXutil.ltrimstr( chkBarTipCor.getVisible(), 5, 0), true);
         divBartipcor_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divBartipcor_cell_Internalname, "Class", divBartipcor_cell_Class, true);
      }
      else
      {
         chkBarTipCor.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkBarTipCor.getInternalname(), "Visible", GXutil.ltrimstr( chkBarTipCor.getVisible(), 5, 0), true);
         divBartipcor_cell_Class = "col-xs-12 col-sm-6 DataContentCell DscTop" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divBartipcor_cell_Internalname, "Class", divBartipcor_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "EXPENC", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtNxt_ArtCl2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtNxt_ArtCl2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNxt_ArtCl2_Visible), 5, 0), true);
         divNxt_artcl2_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divNxt_artcl2_cell_Internalname, "Class", divNxt_artcl2_cell_Class, true);
      }
      else
      {
         edtNxt_ArtCl2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtNxt_ArtCl2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNxt_ArtCl2_Visible), 5, 0), true);
         divNxt_artcl2_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divNxt_artcl2_cell_Internalname, "Class", divNxt_artcl2_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ENC20C", "")) == 0 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtBarDisNum_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarDisNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDisNum_Visible), 5, 0), true);
         divBardisnum_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divBardisnum_cell_Internalname, "Class", divBardisnum_cell_Class, true);
      }
      else
      {
         edtBarDisNum_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarDisNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDisNum_Visible), 5, 0), true);
         divBardisnum_cell_Class = "col-xs-12 col-sm-4 DataContentCell DscTop" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divBardisnum_cell_Internalname, "Class", divBardisnum_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ENC20C", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtBarEncCli_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarEncCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEncCli_Visible), 5, 0), true);
         divBarenccli_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divBarenccli_cell_Internalname, "Class", divBarenccli_cell_Class, true);
      }
      else
      {
         edtBarEncCli_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarEncCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEncCli_Visible), 5, 0), true);
         divBarenccli_cell_Class = "col-xs-12 col-sm-4 DataContentCell DscTop" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divBarenccli_cell_Internalname, "Class", divBarenccli_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "TORIEN", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtBarItem5_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarItem5_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarItem5_Visible), 5, 0), true);
         divBaritem5_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divBaritem5_cell_Internalname, "Class", divBaritem5_cell_Class, true);
      }
      else
      {
         edtBarItem5_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarItem5_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarItem5_Visible), 5, 0), true);
         divBaritem5_cell_Class = "col-xs-12 col-sm-4 DataContentCell DscTop" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divBaritem5_cell_Internalname, "Class", divBaritem5_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ITM123", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtBarItem1_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarItem1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarItem1_Visible), 5, 0), true);
         divBaritem1_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divBaritem1_cell_Internalname, "Class", divBaritem1_cell_Class, true);
      }
      else
      {
         edtBarItem1_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarItem1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarItem1_Visible), 5, 0), true);
         divBaritem1_cell_Class = "col-xs-12 col-sm-6 DataContentCell DscTop" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divBaritem1_cell_Internalname, "Class", divBaritem1_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ITM123", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtbarItem2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtbarItem2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtbarItem2_Visible), 5, 0), true);
         divBaritem2_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divBaritem2_cell_Internalname, "Class", divBaritem2_cell_Class, true);
      }
      else
      {
         edtbarItem2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtbarItem2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtbarItem2_Visible), 5, 0), true);
         divBaritem2_cell_Class = "col-xs-12 col-sm-6 DataContentCell DscTop" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divBaritem2_cell_Internalname, "Class", divBaritem2_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "TIPDIS", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtBarTipDis_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarTipDis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipDis_Visible), 5, 0), true);
         divBartipdis_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divBartipdis_cell_Internalname, "Class", divBartipdis_cell_Class, true);
      }
      else
      {
         edtBarTipDis_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarTipDis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipDis_Visible), 5, 0), true);
         divBartipdis_cell_Class = "col-xs-12 col-sm-2 DataContentCell DscTop" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divBartipdis_cell_Internalname, "Class", divBartipdis_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "BIARPR", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtBarLinPrd_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarLinPrd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarLinPrd_Visible), 5, 0), true);
         divBarlinprd_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divBarlinprd_cell_Internalname, "Class", divBarlinprd_cell_Class, true);
      }
      else
      {
         edtBarLinPrd_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarLinPrd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarLinPrd_Visible), 5, 0), true);
         divBarlinprd_cell_Class = "col-xs-12 col-sm-2 DataContentCell DscTop" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divBarlinprd_cell_Internalname, "Class", divBarlinprd_cell_Class, true);
      }
      if ( ( edtBarDisNum_Visible == ( 0 )) && ( edtBarEncCli_Visible == ( 0 )) && ( edtBarItem5_Visible == ( 0 )) && ( edtBarItem1_Visible == ( 0 )) && ( edtbarItem2_Visible == ( 0 )) )
      {
         divUnnamedtable3_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divUnnamedtable3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable3_Visible), 5, 0), true);
      }
      if ( ( chkBarTipCor.getVisible() == ( 0 )) && ( edtNxt_ArtCl2_Visible == ( 0 )) )
      {
         divUnnamedtable4_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divUnnamedtable4_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable4_Visible), 5, 0), true);
      }
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV7TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV17Pgmname );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( false );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TTrn04" );
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A129BarCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
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
      paEI2( ) ;
      wsEI2( ) ;
      weEI2( ) ;
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
      sCtrlA129BarCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlA132BarCodReo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlA130BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paEI2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "ttrn04general", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paEI2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A129BarCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOA132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOA130BarCodPar = httpContext.cgiGet( sPrefix+"wcpOA130BarCodPar") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A129BarCod != wcpOA129BarCod ) || ( A132BarCodReo != wcpOA132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, wcpOA130BarCodPar) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA129BarCod = A129BarCod ;
      wcpOA132BarCodReo = A132BarCodReo ;
      wcpOA130BarCodPar = A130BarCodPar ;
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
      sCtrlA129BarCod = httpContext.cgiGet( sPrefix+"A129BarCod_CTRL") ;
      if ( GXutil.len( sCtrlA129BarCod) > 0 )
      {
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA129BarCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      }
      else
      {
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A129BarCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlA132BarCodReo = httpContext.cgiGet( sPrefix+"A132BarCodReo_CTRL") ;
      if ( GXutil.len( sCtrlA132BarCodReo) > 0 )
      {
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlA132BarCodReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      else
      {
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A132BarCodReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlA130BarCodPar = httpContext.cgiGet( sPrefix+"A130BarCodPar_CTRL") ;
      if ( GXutil.len( sCtrlA130BarCodPar) > 0 )
      {
         A130BarCodPar = httpContext.cgiGet( sCtrlA130BarCodPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
      }
      else
      {
         A130BarCodPar = httpContext.cgiGet( sPrefix+"A130BarCodPar_PARM") ;
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
      paEI2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsEI2( ) ;
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
      wsEI2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A129BarCod_PARM", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA129BarCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A129BarCod_CTRL", GXutil.rtrim( sCtrlA129BarCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A132BarCodReo_PARM", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA132BarCodReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A132BarCodReo_CTRL", GXutil.rtrim( sCtrlA132BarCodReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A130BarCodPar_PARM", GXutil.rtrim( A130BarCodPar));
      if ( GXutil.len( GXutil.rtrim( sCtrlA130BarCodPar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A130BarCodPar_CTRL", GXutil.rtrim( sCtrlA130BarCodPar));
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
      weEI2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211665120", true, true);
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
      httpContext.AddJavascriptSource("ttrn04general.js", "?20268211665121", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtBarNHdr_Internalname = sPrefix+"BARNHDR" ;
      edtBarTipDis_Internalname = sPrefix+"BARTIPDIS" ;
      divBartipdis_cell_Internalname = sPrefix+"BARTIPDIS_CELL" ;
      cmbBarEstReo.setInternalname( sPrefix+"BARESTREO" );
      chkBarTin.setInternalname( sPrefix+"BARTIN" );
      edtBarPlf_Internalname = sPrefix+"BARPLF" ;
      edtBarLinPrd_Internalname = sPrefix+"BARLINPRD" ;
      divBarlinprd_cell_Internalname = sPrefix+"BARLINPRD_CELL" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtBarCliDes_Internalname = sPrefix+"BARCLIDES" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      edtBarDisNum_Internalname = sPrefix+"BARDISNUM" ;
      divBardisnum_cell_Internalname = sPrefix+"BARDISNUM_CELL" ;
      edtBarEncCli_Internalname = sPrefix+"BARENCCLI" ;
      divBarenccli_cell_Internalname = sPrefix+"BARENCCLI_CELL" ;
      edtBarItem5_Internalname = sPrefix+"BARITEM5" ;
      divBaritem5_cell_Internalname = sPrefix+"BARITEM5_CELL" ;
      edtBarItem1_Internalname = sPrefix+"BARITEM1" ;
      divBaritem1_cell_Internalname = sPrefix+"BARITEM1_CELL" ;
      edtbarItem2_Internalname = sPrefix+"BARITEM2" ;
      divBaritem2_cell_Internalname = sPrefix+"BARITEM2_CELL" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      chkBarTipCor.setInternalname( sPrefix+"BARTIPCOR" );
      divBartipcor_cell_Internalname = sPrefix+"BARTIPCOR_CELL" ;
      edtNxt_ArtCl2_Internalname = sPrefix+"NXT_ARTCL2" ;
      divNxt_artcl2_cell_Internalname = sPrefix+"NXT_ARTCL2_CELL" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      divTransactiondetail_tableattributes_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      divTable_Internalname = sPrefix+"TABLE" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtDisCod_Internalname = sPrefix+"DISCOD" ;
      edtBarGots_Internalname = sPrefix+"BARGOTS" ;
      edtBarGrs_Internalname = sPrefix+"BARGRS" ;
      edtBarOcs_Internalname = sPrefix+"BAROCS" ;
      edtBarRcs_Internalname = sPrefix+"BARRCS" ;
      edtBarOeko_Internalname = sPrefix+"BAROEKO" ;
      edtBarAccesor_Internalname = sPrefix+"BARACCESOR" ;
      edtBarMarca_Internalname = sPrefix+"BARMARCA" ;
      edtBar_MacCod_Internalname = sPrefix+"BAR_MACCOD" ;
      edtBarFasCod2_Internalname = sPrefix+"BARFASCOD2" ;
      edtBarFasDsc2_Internalname = sPrefix+"BARFASDSC2" ;
      edtBarTipColD_Internalname = sPrefix+"BARTIPCOLD" ;
      edtPedidoClie_Internalname = sPrefix+"PEDIDOCLIE" ;
      edtKilosEntre_Internalname = sPrefix+"KILOSENTRE" ;
      edtMetrosEntr_Internalname = sPrefix+"METROSENTR" ;
      edtKilosPendi_Internalname = sPrefix+"KILOSPENDI" ;
      edtMetrosPend_Internalname = sPrefix+"METROSPEND" ;
      edtBarHDSusp_Internalname = sPrefix+"BARHDSUSP" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
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
      edtBarHDSusp_Jsonclick = "" ;
      edtBarHDSusp_Visible = 1 ;
      edtMetrosPend_Jsonclick = "" ;
      edtMetrosPend_Visible = 1 ;
      edtKilosPendi_Jsonclick = "" ;
      edtKilosPendi_Visible = 1 ;
      edtMetrosEntr_Jsonclick = "" ;
      edtMetrosEntr_Visible = 1 ;
      edtKilosEntre_Jsonclick = "" ;
      edtKilosEntre_Visible = 1 ;
      edtPedidoClie_Jsonclick = "" ;
      edtPedidoClie_Visible = 1 ;
      edtBarTipColD_Jsonclick = "" ;
      edtBarTipColD_Visible = 1 ;
      edtBarFasDsc2_Jsonclick = "" ;
      edtBarFasDsc2_Visible = 1 ;
      edtBarFasCod2_Jsonclick = "" ;
      edtBarFasCod2_Visible = 1 ;
      edtBar_MacCod_Jsonclick = "" ;
      edtBar_MacCod_Visible = 1 ;
      edtBarMarca_Jsonclick = "" ;
      edtBarMarca_Visible = 1 ;
      edtBarAccesor_Jsonclick = "" ;
      edtBarAccesor_Visible = 1 ;
      edtBarOeko_Jsonclick = "" ;
      edtBarOeko_Visible = 1 ;
      edtBarRcs_Jsonclick = "" ;
      edtBarRcs_Visible = 1 ;
      edtBarOcs_Jsonclick = "" ;
      edtBarOcs_Visible = 1 ;
      edtBarGrs_Jsonclick = "" ;
      edtBarGrs_Visible = 1 ;
      edtBarGots_Jsonclick = "" ;
      edtBarGots_Visible = 1 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Visible = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Visible = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Visible = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Visible = 1 ;
      edtNxt_ArtCl2_Jsonclick = "" ;
      edtNxt_ArtCl2_Enabled = 0 ;
      edtNxt_ArtCl2_Visible = 1 ;
      divNxt_artcl2_cell_Class = "col-xs-12 col-sm-6" ;
      chkBarTipCor.setEnabled( 0 );
      chkBarTipCor.setVisible( 1 );
      divBartipcor_cell_Class = "col-xs-12 col-sm-6" ;
      divUnnamedtable4_Visible = 1 ;
      edtbarItem2_Jsonclick = "" ;
      edtbarItem2_Enabled = 0 ;
      edtbarItem2_Visible = 1 ;
      divBaritem2_cell_Class = "col-xs-12 col-sm-6" ;
      edtBarItem1_Jsonclick = "" ;
      edtBarItem1_Enabled = 0 ;
      edtBarItem1_Visible = 1 ;
      divBaritem1_cell_Class = "col-xs-12 col-sm-6" ;
      edtBarItem5_Jsonclick = "" ;
      edtBarItem5_Enabled = 0 ;
      edtBarItem5_Visible = 1 ;
      divBaritem5_cell_Class = "col-xs-12 col-sm-4" ;
      edtBarEncCli_Jsonclick = "" ;
      edtBarEncCli_Enabled = 0 ;
      edtBarEncCli_Visible = 1 ;
      divBarenccli_cell_Class = "col-xs-12 col-sm-4" ;
      edtBarDisNum_Jsonclick = "" ;
      edtBarDisNum_Enabled = 0 ;
      edtBarDisNum_Visible = 1 ;
      divBardisnum_cell_Class = "col-xs-12 col-sm-4" ;
      divUnnamedtable3_Visible = 1 ;
      edtBarCliDes_Jsonclick = "" ;
      edtBarCliDes_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtBarLinPrd_Jsonclick = "" ;
      edtBarLinPrd_Enabled = 0 ;
      edtBarLinPrd_Visible = 1 ;
      divBarlinprd_cell_Class = "col-xs-12 col-sm-2" ;
      edtBarPlf_Jsonclick = "" ;
      edtBarPlf_Enabled = 0 ;
      chkBarTin.setEnabled( 0 );
      cmbBarEstReo.setJsonclick( "" );
      cmbBarEstReo.setEnabled( 0 );
      edtBarTipDis_Jsonclick = "" ;
      edtBarTipDis_Enabled = 0 ;
      edtBarTipDis_Visible = 1 ;
      divBartipdis_cell_Class = "col-xs-12 col-sm-2" ;
      edtBarNHdr_Jsonclick = "" ;
      edtBarNHdr_Enabled = 0 ;
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
      cmbBarEstReo.setName( "BARESTREO" );
      cmbBarEstReo.setWebtags( "" );
      cmbBarEstReo.addItem("0", httpContext.getMessage( "Normal", ""), (short)(0));
      cmbBarEstReo.addItem("1", httpContext.getMessage( "No Conformidad", ""), (short)(0));
      cmbBarEstReo.addItem("2", httpContext.getMessage( "Reclamacion", ""), (short)(0));
      if ( cmbBarEstReo.getItemCount() > 0 )
      {
      }
      chkBarTin.setName( "BARTIN" );
      chkBarTin.setWebtags( "" );
      chkBarTin.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkBarTin.getInternalname(), "TitleCaption", chkBarTin.getCaption(), true);
      chkBarTin.setCheckedValue( "N" );
      chkBarTipCor.setName( "BARTIPCOR" );
      chkBarTipCor.setWebtags( "" );
      chkBarTipCor.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkBarTipCor.getInternalname(), "TitleCaption", chkBarTipCor.getCaption(), true);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A4016BarTin',fld:'BARTIN',pic:'@!'},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e11EI1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("'DOUPDATE'",",oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e12EI1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("'DODELETE'",",oparms:[]}");
      setEventMetadata("VALID_BARLINPRD","{handler:'valid_Barlinprd',iparms:[]");
      setEventMetadata("VALID_BARLINPRD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_BARDISNUM","{handler:'valid_Bardisnum',iparms:[]");
      setEventMetadata("VALID_BARDISNUM",",oparms:[]}");
      setEventMetadata("VALID_BARENCCLI","{handler:'valid_Barenccli',iparms:[]");
      setEventMetadata("VALID_BARENCCLI",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[]");
      setEventMetadata("VALID_DISCOD",",oparms:[]}");
      setEventMetadata("VALID_BARFASCOD2","{handler:'valid_Barfascod2',iparms:[]");
      setEventMetadata("VALID_BARFASCOD2",",oparms:[]}");
      setEventMetadata("VALID_KILOSENTRE","{handler:'valid_Kilosentre',iparms:[]");
      setEventMetadata("VALID_KILOSENTRE",",oparms:[]}");
      setEventMetadata("VALID_METROSENTR","{handler:'valid_Metrosentr',iparms:[]");
      setEventMetadata("VALID_METROSENTR",",oparms:[]}");
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
      wcpOA130BarCodPar = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A13815LinPrdDcID = "" ;
      h13077BarLinPrd = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      A13077BarLinPrd = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      GX_FocusControl = "" ;
      A13696BarNHdr = "" ;
      A2010BarTipDis = "" ;
      ClassString = "" ;
      StyleString = "" ;
      A4016BarTin = "" ;
      A3030BarPlf = "" ;
      A279CliNom = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A9789BarItem5 = "" ;
      A9775BarItem1 = "" ;
      A9776barItem2 = "" ;
      A5291BarTipCor = "" ;
      A11852Nxt_ArtCl2 = "" ;
      TempTags = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A13855BarGots = "" ;
      A13856BarGrs = "" ;
      A13857BarOcs = "" ;
      A13858BarRcs = "" ;
      A13859BarOeko = "" ;
      A13860BarAccesor = "" ;
      A13861BarMarca = "" ;
      A13863BarFasCod2 = "" ;
      A13864BarFasDsc2 = "" ;
      A13868BarTipColD = "" ;
      A13878PedidoClie = "" ;
      A13887KilosEntre = DecimalUtil.ZERO ;
      A13885KilosPendi = DecimalUtil.ZERO ;
      A13886MetrosPend = DecimalUtil.ZERO ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13815LinPrdDcID = "" ;
      H00EI2_A13815LinPrdDcID = new String[] {""} ;
      H00EI3_A13815LinPrdDcID = new String[] {""} ;
      H00EI3_A396EmprCod = new String[] {""} ;
      H00EI3_A13078LinPrdID = new String[] {""} ;
      A13078LinPrdID = "" ;
      AV17Pgmname = "" ;
      H00EI12_A9713Tb1_Cod = new short[1] ;
      H00EI12_A4466BarAcaAnh = new short[1] ;
      H00EI12_A11852Nxt_ArtCl2 = new String[] {""} ;
      H00EI12_A5291BarTipCor = new String[] {""} ;
      H00EI12_A9776barItem2 = new String[] {""} ;
      H00EI12_A9775BarItem1 = new String[] {""} ;
      H00EI12_A9789BarItem5 = new String[] {""} ;
      H00EI12_A2311BarCliDes = new int[1] ;
      H00EI12_A279CliNom = new String[] {""} ;
      H00EI12_A252CliCod = new int[1] ;
      H00EI12_n252CliCod = new boolean[] {false} ;
      H00EI12_A13077BarLinPrd = new String[] {""} ;
      H00EI12_A3030BarPlf = new String[] {""} ;
      H00EI12_A4016BarTin = new String[] {""} ;
      H00EI12_A148BarEstReo = new byte[1] ;
      H00EI12_A2010BarTipDis = new String[] {""} ;
      H00EI12_A13890BarHDSusp = new byte[1] ;
      H00EI12_n13890BarHDSusp = new boolean[] {false} ;
      H00EI12_A396EmprCod = new String[] {""} ;
      H00EI12_A13862Bar_MacCod = new int[1] ;
      H00EI12_n13862Bar_MacCod = new boolean[] {false} ;
      H00EI12_A13861BarMarca = new String[] {""} ;
      H00EI12_n13861BarMarca = new boolean[] {false} ;
      H00EI12_A13860BarAccesor = new String[] {""} ;
      H00EI12_n13860BarAccesor = new boolean[] {false} ;
      H00EI12_A129BarCod = new int[1] ;
      H00EI12_A132BarCodReo = new byte[1] ;
      H00EI12_A130BarCodPar = new String[] {""} ;
      H00EI12_A361DisCod = new int[1] ;
      H00EI12_A13863BarFasCod2 = new String[] {""} ;
      H00EI12_n13863BarFasCod2 = new boolean[] {false} ;
      H00EI12_A218BarTipCol = new byte[1] ;
      H00EI12_A143BarDisNum = new String[] {""} ;
      H00EI12_A4812BarEncCli = new String[] {""} ;
      H00EI12_A13887KilosEntre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00EI12_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00EI12_A13888MetrosEntr = new short[1] ;
      H00EI12_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      GXv_int3 = new byte[1] ;
      GXv_char2 = new String[1] ;
      H00EI14_A13890BarHDSusp = new byte[1] ;
      H00EI14_n13890BarHDSusp = new boolean[] {false} ;
      H00EI16_A13862Bar_MacCod = new int[1] ;
      H00EI16_n13862Bar_MacCod = new boolean[] {false} ;
      H00EI18_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00EI18_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00EI20_A13887KilosEntre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00EI20_A13888MetrosEntr = new short[1] ;
      H00EI23_A13863BarFasCod2 = new String[] {""} ;
      H00EI23_n13863BarFasCod2 = new boolean[] {false} ;
      H00EI26_A13860BarAccesor = new String[] {""} ;
      H00EI26_n13860BarAccesor = new boolean[] {false} ;
      H00EI27_A13815LinPrdDcID = new String[] {""} ;
      H00EI27_A396EmprCod = new String[] {""} ;
      H00EI27_A13078LinPrdID = new String[] {""} ;
      AV13Station = "" ;
      GXt_char1 = "" ;
      AV14Emprcod = "" ;
      GXv_char6 = new String[1] ;
      AV15Emprnom = "" ;
      GXv_char5 = new String[1] ;
      AV16Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV7TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      AV9Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA129BarCod = "" ;
      sCtrlA132BarCodReo = "" ;
      sCtrlA130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn04general__default(),
         new Object[] {
             new Object[] {
            H00EI2_A13815LinPrdDcID
            }
            , new Object[] {
            H00EI3_A13815LinPrdDcID, H00EI3_A396EmprCod, H00EI3_A13078LinPrdID
            }
            , new Object[] {
            H00EI12_A9713Tb1_Cod, H00EI12_A4466BarAcaAnh, H00EI12_A11852Nxt_ArtCl2, H00EI12_A5291BarTipCor, H00EI12_A9776barItem2, H00EI12_A9775BarItem1, H00EI12_A9789BarItem5, H00EI12_A2311BarCliDes, H00EI12_A279CliNom, H00EI12_A252CliCod,
            H00EI12_n252CliCod, H00EI12_A13077BarLinPrd, H00EI12_A3030BarPlf, H00EI12_A4016BarTin, H00EI12_A148BarEstReo, H00EI12_A2010BarTipDis, H00EI12_A13890BarHDSusp, H00EI12_n13890BarHDSusp, H00EI12_A396EmprCod, H00EI12_A13862Bar_MacCod,
            H00EI12_n13862Bar_MacCod, H00EI12_A13861BarMarca, H00EI12_n13861BarMarca, H00EI12_A13860BarAccesor, H00EI12_n13860BarAccesor, H00EI12_A129BarCod, H00EI12_A132BarCodReo, H00EI12_A130BarCodPar, H00EI12_A361DisCod, H00EI12_A13863BarFasCod2,
            H00EI12_n13863BarFasCod2, H00EI12_A218BarTipCol, H00EI12_A143BarDisNum, H00EI12_A4812BarEncCli, H00EI12_A13887KilosEntre, H00EI12_A166BarKgm, H00EI12_A13888MetrosEntr, H00EI12_A184BarMtr
            }
            , new Object[] {
            H00EI14_A13890BarHDSusp, H00EI14_n13890BarHDSusp
            }
            , new Object[] {
            H00EI16_A13862Bar_MacCod, H00EI16_n13862Bar_MacCod
            }
            , new Object[] {
            H00EI18_A166BarKgm, H00EI18_A184BarMtr
            }
            , new Object[] {
            H00EI20_A13887KilosEntre, H00EI20_A13888MetrosEntr
            }
            , new Object[] {
            H00EI23_A13863BarFasCod2, H00EI23_n13863BarFasCod2
            }
            , new Object[] {
            H00EI26_A13860BarAccesor, H00EI26_n13860BarAccesor
            }
            , new Object[] {
            H00EI27_A13815LinPrdDcID, H00EI27_A396EmprCod, H00EI27_A13078LinPrdID
            }
         }
      );
      AV17Pgmname = "TTrn04General" ;
      /* GeneXus formulas. */
      AV17Pgmname = "TTrn04General" ;
      Gx_err = (short)(0) ;
   }

   private byte wcpOA132BarCodReo ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A148BarEstReo ;
   private byte A13890BarHDSusp ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte GXv_int3[] ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short A13888MetrosEntr ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private short A4466BarAcaAnh ;
   private int wcpOA129BarCod ;
   private int A129BarCod ;
   private int edtBarNHdr_Enabled ;
   private int edtBarTipDis_Visible ;
   private int edtBarTipDis_Enabled ;
   private int edtBarPlf_Enabled ;
   private int edtBarLinPrd_Visible ;
   private int edtBarLinPrd_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int A2311BarCliDes ;
   private int edtBarCliDes_Enabled ;
   private int divUnnamedtable3_Visible ;
   private int edtBarDisNum_Visible ;
   private int edtBarDisNum_Enabled ;
   private int edtBarEncCli_Visible ;
   private int edtBarEncCli_Enabled ;
   private int edtBarItem5_Visible ;
   private int edtBarItem5_Enabled ;
   private int edtBarItem1_Visible ;
   private int edtBarItem1_Enabled ;
   private int edtbarItem2_Visible ;
   private int edtbarItem2_Enabled ;
   private int divUnnamedtable4_Visible ;
   private int edtNxt_ArtCl2_Visible ;
   private int edtNxt_ArtCl2_Enabled ;
   private int edtBarCod_Visible ;
   private int edtBarCodReo_Visible ;
   private int edtBarCodPar_Visible ;
   private int A361DisCod ;
   private int edtDisCod_Visible ;
   private int edtBarGots_Visible ;
   private int edtBarGrs_Visible ;
   private int edtBarOcs_Visible ;
   private int edtBarRcs_Visible ;
   private int edtBarOeko_Visible ;
   private int edtBarAccesor_Visible ;
   private int edtBarMarca_Visible ;
   private int A13862Bar_MacCod ;
   private int edtBar_MacCod_Visible ;
   private int edtBarFasCod2_Visible ;
   private int edtBarFasDsc2_Visible ;
   private int edtBarTipColD_Visible ;
   private int edtPedidoClie_Visible ;
   private int edtKilosEntre_Visible ;
   private int edtMetrosEntr_Visible ;
   private int edtKilosPendi_Visible ;
   private int edtMetrosPend_Visible ;
   private int edtBarHDSusp_Visible ;
   private int gxdynajaxindex ;
   private int idxLst ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A13887KilosEntre ;
   private java.math.BigDecimal A13885KilosPendi ;
   private java.math.BigDecimal A13886MetrosPend ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A13077BarLinPrd ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTable_Internalname ;
   private String divTransactiondetail_tableattributes_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtBarNHdr_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Jsonclick ;
   private String divBartipdis_cell_Internalname ;
   private String divBartipdis_cell_Class ;
   private String edtBarTipDis_Internalname ;
   private String A2010BarTipDis ;
   private String edtBarTipDis_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String A4016BarTin ;
   private String edtBarPlf_Internalname ;
   private String A3030BarPlf ;
   private String edtBarPlf_Jsonclick ;
   private String divBarlinprd_cell_Internalname ;
   private String divBarlinprd_cell_Class ;
   private String edtBarLinPrd_Internalname ;
   private String edtBarLinPrd_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtBarCliDes_Internalname ;
   private String edtBarCliDes_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String divBardisnum_cell_Internalname ;
   private String divBardisnum_cell_Class ;
   private String edtBarDisNum_Internalname ;
   private String A143BarDisNum ;
   private String edtBarDisNum_Jsonclick ;
   private String divBarenccli_cell_Internalname ;
   private String divBarenccli_cell_Class ;
   private String edtBarEncCli_Internalname ;
   private String A4812BarEncCli ;
   private String edtBarEncCli_Jsonclick ;
   private String divBaritem5_cell_Internalname ;
   private String divBaritem5_cell_Class ;
   private String edtBarItem5_Internalname ;
   private String A9789BarItem5 ;
   private String edtBarItem5_Jsonclick ;
   private String divBaritem1_cell_Internalname ;
   private String divBaritem1_cell_Class ;
   private String edtBarItem1_Internalname ;
   private String A9775BarItem1 ;
   private String edtBarItem1_Jsonclick ;
   private String divBaritem2_cell_Internalname ;
   private String divBaritem2_cell_Class ;
   private String edtbarItem2_Internalname ;
   private String A9776barItem2 ;
   private String edtbarItem2_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String divBartipcor_cell_Internalname ;
   private String divBartipcor_cell_Class ;
   private String A5291BarTipCor ;
   private String divNxt_artcl2_cell_Internalname ;
   private String divNxt_artcl2_cell_Class ;
   private String edtNxt_ArtCl2_Internalname ;
   private String A11852Nxt_ArtCl2 ;
   private String edtNxt_ArtCl2_Jsonclick ;
   private String TempTags ;
   private String bttBtnupdate_Internalname ;
   private String bttBtnupdate_Jsonclick ;
   private String bttBtndelete_Internalname ;
   private String bttBtndelete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String edtBarGots_Internalname ;
   private String A13855BarGots ;
   private String edtBarGots_Jsonclick ;
   private String edtBarGrs_Internalname ;
   private String A13856BarGrs ;
   private String edtBarGrs_Jsonclick ;
   private String edtBarOcs_Internalname ;
   private String A13857BarOcs ;
   private String edtBarOcs_Jsonclick ;
   private String edtBarRcs_Internalname ;
   private String A13858BarRcs ;
   private String edtBarRcs_Jsonclick ;
   private String edtBarOeko_Internalname ;
   private String A13859BarOeko ;
   private String edtBarOeko_Jsonclick ;
   private String edtBarAccesor_Internalname ;
   private String A13860BarAccesor ;
   private String edtBarAccesor_Jsonclick ;
   private String edtBarMarca_Internalname ;
   private String A13861BarMarca ;
   private String edtBarMarca_Jsonclick ;
   private String edtBar_MacCod_Internalname ;
   private String edtBar_MacCod_Jsonclick ;
   private String edtBarFasCod2_Internalname ;
   private String A13863BarFasCod2 ;
   private String edtBarFasCod2_Jsonclick ;
   private String edtBarFasDsc2_Internalname ;
   private String A13864BarFasDsc2 ;
   private String edtBarFasDsc2_Jsonclick ;
   private String edtBarTipColD_Internalname ;
   private String A13868BarTipColD ;
   private String edtBarTipColD_Jsonclick ;
   private String edtPedidoClie_Internalname ;
   private String A13878PedidoClie ;
   private String edtPedidoClie_Jsonclick ;
   private String edtKilosEntre_Internalname ;
   private String edtKilosEntre_Jsonclick ;
   private String edtMetrosEntr_Internalname ;
   private String edtMetrosEntr_Jsonclick ;
   private String edtKilosPendi_Internalname ;
   private String edtKilosPendi_Jsonclick ;
   private String edtMetrosPend_Internalname ;
   private String edtMetrosPend_Jsonclick ;
   private String edtBarHDSusp_Internalname ;
   private String edtBarHDSusp_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String A13078LinPrdID ;
   private String AV17Pgmname ;
   private String GXv_char2[] ;
   private String AV13Station ;
   private String GXt_char1 ;
   private String AV14Emprcod ;
   private String GXv_char6[] ;
   private String AV15Emprnom ;
   private String GXv_char5[] ;
   private String AV16Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA129BarCod ;
   private String sCtrlA132BarCodReo ;
   private String sCtrlA130BarCodPar ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n252CliCod ;
   private boolean n13890BarHDSusp ;
   private boolean n13862Bar_MacCod ;
   private boolean n13861BarMarca ;
   private boolean n13860BarAccesor ;
   private boolean n13863BarFasCod2 ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private String A13815LinPrdDcID ;
   private String h13077BarLinPrd ;
   private String l13815LinPrdDcID ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private HTMLChoice cmbBarEstReo ;
   private ICheckbox chkBarTin ;
   private ICheckbox chkBarTipCor ;
   private IDataStoreProvider pr_default ;
   private String[] H00EI2_A13815LinPrdDcID ;
   private String[] H00EI3_A13815LinPrdDcID ;
   private String[] H00EI3_A396EmprCod ;
   private String[] H00EI3_A13078LinPrdID ;
   private short[] H00EI12_A9713Tb1_Cod ;
   private short[] H00EI12_A4466BarAcaAnh ;
   private String[] H00EI12_A11852Nxt_ArtCl2 ;
   private String[] H00EI12_A5291BarTipCor ;
   private String[] H00EI12_A9776barItem2 ;
   private String[] H00EI12_A9775BarItem1 ;
   private String[] H00EI12_A9789BarItem5 ;
   private int[] H00EI12_A2311BarCliDes ;
   private String[] H00EI12_A279CliNom ;
   private int[] H00EI12_A252CliCod ;
   private boolean[] H00EI12_n252CliCod ;
   private String[] H00EI12_A13077BarLinPrd ;
   private String[] H00EI12_A3030BarPlf ;
   private String[] H00EI12_A4016BarTin ;
   private byte[] H00EI12_A148BarEstReo ;
   private String[] H00EI12_A2010BarTipDis ;
   private byte[] H00EI12_A13890BarHDSusp ;
   private boolean[] H00EI12_n13890BarHDSusp ;
   private String[] H00EI12_A396EmprCod ;
   private int[] H00EI12_A13862Bar_MacCod ;
   private boolean[] H00EI12_n13862Bar_MacCod ;
   private String[] H00EI12_A13861BarMarca ;
   private boolean[] H00EI12_n13861BarMarca ;
   private String[] H00EI12_A13860BarAccesor ;
   private boolean[] H00EI12_n13860BarAccesor ;
   private int[] H00EI12_A129BarCod ;
   private byte[] H00EI12_A132BarCodReo ;
   private String[] H00EI12_A130BarCodPar ;
   private int[] H00EI12_A361DisCod ;
   private String[] H00EI12_A13863BarFasCod2 ;
   private boolean[] H00EI12_n13863BarFasCod2 ;
   private byte[] H00EI12_A218BarTipCol ;
   private String[] H00EI12_A143BarDisNum ;
   private String[] H00EI12_A4812BarEncCli ;
   private java.math.BigDecimal[] H00EI12_A13887KilosEntre ;
   private java.math.BigDecimal[] H00EI12_A166BarKgm ;
   private short[] H00EI12_A13888MetrosEntr ;
   private java.math.BigDecimal[] H00EI12_A184BarMtr ;
   private byte[] H00EI14_A13890BarHDSusp ;
   private boolean[] H00EI14_n13890BarHDSusp ;
   private int[] H00EI16_A13862Bar_MacCod ;
   private boolean[] H00EI16_n13862Bar_MacCod ;
   private java.math.BigDecimal[] H00EI18_A166BarKgm ;
   private java.math.BigDecimal[] H00EI18_A184BarMtr ;
   private java.math.BigDecimal[] H00EI20_A13887KilosEntre ;
   private short[] H00EI20_A13888MetrosEntr ;
   private String[] H00EI23_A13863BarFasCod2 ;
   private boolean[] H00EI23_n13863BarFasCod2 ;
   private String[] H00EI26_A13860BarAccesor ;
   private boolean[] H00EI26_n13860BarAccesor ;
   private String[] H00EI27_A13815LinPrdDcID ;
   private String[] H00EI27_A396EmprCod ;
   private String[] H00EI27_A13078LinPrdID ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class ttrn04general__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00EI2", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(LinPrdID)) || '-' || RTRIM(LTRIM(COALESCE( LinPrdDc, ''))) AS LinPrdDcID FROM TXPLINPRD WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(LinPrdID)) || '-' || RTRIM(LTRIM(COALESCE( LinPrdDc, '')))) like '%' || UPPER(?))) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00EI3", "SELECT RTRIM(LTRIM(LinPrdID)) || '-' || RTRIM(LTRIM(COALESCE( LinPrdDc, ''))) AS LinPrdDcID, EmprCod, LinPrdID FROM TXPLINPRD WHERE (RTRIM(LTRIM(LinPrdID)) || '-' || RTRIM(LTRIM(COALESCE( LinPrdDc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00EI12", "SELECT T3.Tb1_Cod, T1.BarAcaAnh, T1.Nxt_ArtCl2, T1.BarTipCor, T1.barItem2, T1.BarItem1, T1.BarItem5, T1.BarCliDes, T2.CliNom, T1.CliCod, T1.BarLinPrd, T1.BarPlf, T1.BarTin, T1.BarEstReo, T1.BarTipDis, COALESCE( T4.BarHDSusp, 0) AS BarHDSusp, T1.EmprCod, COALESCE( T5.Bar_MacCod, 0) AS Bar_MacCod, COALESCE( T3.Tb1_Dsc, ' ') AS BarMarca, COALESCE( T9.BarAccesor, '') AS BarAccesor, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisCod, COALESCE( T8.BarFasCod2, ' ') AS BarFasCod2, T1.BarTipCol, T1.BarDisNum, T1.BarEncCli, COALESCE( T7.KilosEntre, 0) AS KilosEntre, COALESCE( T6.BarKgm, 0) AS BarKgm, COALESCE( T7.MetrosEntr, 0) AS MetrosEntr, COALESCE( T6.BarMtr, 0) AS BarMtr FROM ((((((((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTABLE1 T3 ON T3.EmprCod = T1.EmprCod AND T3.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT MIN(T10.Stp_Est) AS BarHDSusp, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPHDSTO1 T10 INNER JOIN TXPBARCAD T11 ON T11.EmprCod = T10.EmprCod) WHERE (T10.EmprCod = ?) AND (T11.BarCod = T10.Stp_hdr) AND (T11.BarCodReo = T10.Stp_r) AND (T11.BarCodPar = T10.Stp_p) AND (T10.Stp_Est = 1) GROUP BY T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T4 ON T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T10.MacCod) AS Bar_MacCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPLMACRO T10 INNER JOIN TXPBARCAD T11 ON T11.EmprCod = T10.EmprCod) WHERE T10.EmprCod = ? and T10.MacBarCod = T11.BarCod and T10.MacBarReo = T11.BarCodReo and T10.MacBarPar = T11.BarCodPar GROUP BY T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T5 ON T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarMetLan) AS MetrosEntr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarKilLan) AS KilosEntre FROM TXPBARPIE WHERE BarPieEst = 1 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T10.FasCod) AS BarFasCod2, T10.EmprCod, T10.BarCod, T10.BarCodReo, T10.BarCodPar FROM (TXPBARFAS T10 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC3, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst = 2 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T11 ON T11.EmprCod = T10.EmprCod AND T11.BarCod = T10.BarCod AND T11.BarCodReo = T10.BarCodReo AND T11.BarCodPar = T10.BarCodPar) WHERE (T10.BarOrdLin = T11.GXC3) AND (T10.BarFasEst = 2) GROUP BY T10.EmprCod, T10.BarCod, T10.BarCodReo, T10.BarCodPar ) T8 ON T8.EmprCod = T1.EmprCod AND T8.BarCod = T1.BarCod AND T8.BarCodReo = T1.BarCodReo AND T8.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT COALESCE( T11.GXC4, 'N') AS BarAccesor, T10.EmprCod, T10.BarCod, T10.BarCodReo, T10.BarCodPar FROM (TXPBARCAD T10 LEFT JOIN (SELECT MIN('S') AS GXC4, T13.BarCod, T13.BarCodReo, T13.BarCodPar FROM (TXPLMACRO T12 INNER JOIN TXPBARCAD T13 ON T13.EmprCod = T12.EmprCod) WHERE T12.EmprCod = ? and T12.MacBarCod = T13.BarCod and T12.MacBarReo = T13.BarCodReo and T12.MacBarPar = T13.BarCodPar GROUP BY T13.BarCod, T13.BarCodReo, T13.BarCodPar ) T11 ON T11.BarCod = T10.BarCod AND T11.BarCodReo = T10.BarCodReo AND T11.BarCodPar = T10.BarCodPar) ) T9 ON T9.EmprCod = T1.EmprCod AND T9.BarCod = T1.BarCod AND T9.BarCodReo = T1.BarCodReo AND T9.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00EI14", "SELECT COALESCE( T1.BarHDSusp, 0) AS BarHDSusp FROM (SELECT MIN(T2.Stp_Est) AS BarHDSusp, T3.BarCod, T3.BarCodReo, T3.BarCodPar FROM (TXPHDSTO1 T2 INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T2.EmprCod) WHERE (T2.EmprCod = ?) AND (T3.BarCod = T2.Stp_hdr) AND (T3.BarCodReo = T2.Stp_r) AND (T3.BarCodPar = T2.Stp_p) AND (T2.Stp_Est = 1) GROUP BY T3.BarCod, T3.BarCodReo, T3.BarCodPar ) T1 WHERE T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00EI16", "SELECT COALESCE( T1.Bar_MacCod, 0) AS Bar_MacCod FROM (SELECT MIN(T2.MacCod) AS Bar_MacCod, T3.BarCod, T3.BarCodReo, T3.BarCodPar FROM (TXPLMACRO T2 INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T2.EmprCod) WHERE T2.EmprCod = ? and T2.MacBarCod = T3.BarCod and T2.MacBarReo = T3.BarCodReo and T2.MacBarPar = T3.BarCodPar GROUP BY T3.BarCod, T3.BarCodReo, T3.BarCodPar ) T1 WHERE T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00EI18", "SELECT COALESCE( T1.BarKgm, 0) AS BarKgm, COALESCE( T1.BarMtr, 0) AS BarMtr FROM (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00EI20", "SELECT COALESCE( T1.KilosEntre, 0) AS KilosEntre, COALESCE( T1.MetrosEntr, 0) AS MetrosEntr FROM (SELECT SUM(BarMetLan) AS MetrosEntr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarKilLan) AS KilosEntre FROM TXPBARPIE WHERE BarPieEst = 1 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00EI23", "SELECT COALESCE( T1.BarFasCod2, ' ') AS BarFasCod2 FROM (SELECT MIN(T2.FasCod) AS BarFasCod2, T2.EmprCod, T2.BarCod, T2.BarCodReo, T2.BarCodPar FROM (TXPBARFAS T2 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC3, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst = 2 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T2.EmprCod AND T3.BarCod = T2.BarCod AND T3.BarCodReo = T2.BarCodReo AND T3.BarCodPar = T2.BarCodPar) WHERE (T2.BarOrdLin = T3.GXC3) AND (T2.BarFasEst = 2) GROUP BY T2.EmprCod, T2.BarCod, T2.BarCodReo, T2.BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00EI26", "SELECT COALESCE( T1.BarAccesor, '') AS BarAccesor FROM (SELECT COALESCE( T3.GXC4, 'N') AS BarAccesor, T2.EmprCod, T2.BarCod, T2.BarCodReo, T2.BarCodPar FROM (TXPBARCAD T2 LEFT JOIN (SELECT MIN('S') AS GXC4, T5.BarCod, T5.BarCodReo, T5.BarCodPar FROM (TXPLMACRO T4 INNER JOIN TXPBARCAD T5 ON T5.EmprCod = T4.EmprCod) WHERE T4.EmprCod = ? and T4.MacBarCod = T5.BarCod and T4.MacBarReo = T5.BarCodReo and T4.MacBarPar = T5.BarCodPar GROUP BY T5.BarCod, T5.BarCodReo, T5.BarCodPar ) T3 ON T3.BarCod = T2.BarCod AND T3.BarCodReo = T2.BarCodReo AND T3.BarCodPar = T2.BarCodPar) ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00EI27", "SELECT RTRIM(LTRIM(LinPrdID)) || '-' || RTRIM(LTRIM(COALESCE( LinPrdDc, ''))) AS LinPrdDcID, EmprCod, LinPrdID FROM TXPLINPRD WHERE (RTRIM(LTRIM(LinPrdID)) || '-' || RTRIM(LTRIM(COALESCE( LinPrdDc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 4);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 1);
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(17, 3);
               ((int[]) buf[19])[0] = rslt.getInt(18);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(21);
               ((byte[]) buf[26])[0] = rslt.getByte(22);
               ((String[]) buf[27])[0] = rslt.getString(23, 1);
               ((int[]) buf[28])[0] = rslt.getInt(24);
               ((String[]) buf[29])[0] = rslt.getString(25, 8);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(26);
               ((String[]) buf[32])[0] = rslt.getString(27, 8);
               ((String[]) buf[33])[0] = rslt.getString(28, 20);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(29,2);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(30,2);
               ((short[]) buf[36])[0] = rslt.getShort(31);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(32,2);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
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
               stmt.setVarchar(2, (String)parms[1], 40);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
      }
   }

}

