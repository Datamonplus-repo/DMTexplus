package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webbccomp_impl extends GXDataArea
{
   public webbccomp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webbccomp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webbccomp_impl.class ));
   }

   public webbccomp_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavOp = UIFactory.getCheckbox(this);
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
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_16 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_16"))) ;
      nGXsfl_16_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_16_idx"))) ;
      sGXsfl_16_idx = httpContext.GetPar( "sGXsfl_16_idx") ;
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
      AV7EmprCod = httpContext.GetPar( "EmprCod") ;
      AV6AplicarConfirmar = GXutil.strtobool( httpContext.GetPar( "AplicarConfirmar")) ;
      AV11PrvNif = httpContext.GetPar( "PrvNif") ;
      AV16Op = httpContext.GetPar( "Op") ;
      A795PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
      AV10PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
      A793PrvNif = httpContext.GetPar( "PrvNif") ;
      n793PrvNif = false ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV7EmprCod, AV6AplicarConfirmar, AV11PrvNif, AV16Op, A795PrvNum, AV10PrvNum, A793PrvNif) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
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
      paAI2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startAI2( ) ;
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
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"true\"" : "") ;
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
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webbccomp", new String[] {}, new String[] {}) +"\">") ;
         app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      }
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRVNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10PrvNum), "ZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_16", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_16, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vAPLICARCONFIRMAR", AV6AplicarConfirmar);
      app.GxWebStd.gx_hidden_field( httpContext, "ENTPRVNUM", GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "LINENT", GXutil.ltrim( localUtil.ntoc( A597LinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVNUM", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRVNUM", GXutil.ltrim( localUtil.ntoc( AV10PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRVNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10PrvNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVNIF", GXutil.rtrim( A793PrvNif));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTREMTPO", GXutil.rtrim( A10184EntRemTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "</form>") ;
      }
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
         weAI2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtAI2( ) ;
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
      return formatLink("app.webbccomp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebBCCOMP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Envio Compras a BC", "") ;
   }

   public void wbAI0( )
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFec1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFec1_Internalname, httpContext.getMessage( "Fecha Inicial", ""), "col-sm-3 AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'" + sGXsfl_16_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFec1_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFec1_Internalname, localUtil.format(AV12Fec1, "99/99/99"), localUtil.format( AV12Fec1, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,8);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFec1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFec1_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebBCCOMP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFec1_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFec1_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebBCCOMP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFec2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFec2_Internalname, httpContext.getMessage( "Fecha Final", ""), "col-sm-3 AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'" + sGXsfl_16_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFec2_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFec2_Internalname, localUtil.format(AV13Fec2, "99/99/99"), localUtil.format( AV13Fec2, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,13);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFec2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFec2_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebBCCOMP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFec2_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFec2_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebBCCOMP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol16( ) ;
      }
      if ( wbEnd == 16 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_16 = (int)(nGXsfl_16_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
            GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 16 )
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
               GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
               GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void startAI2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Envio Compras a BC", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupAI0( ) ;
   }

   public void wsAI2( )
   {
      startAI2( ) ;
      evtAI2( ) ;
   }

   public void evtAI2( )
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
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRIDPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "VOP.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 11), "'CONFIRMAR'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "VOP.CLICK") == 0 ) )
                        {
                           nGXsfl_16_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_16_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_16_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_162( ) ;
                           AV16Op = ((GXutil.strcmp(httpContext.cgiGet( chkavOp.getInternalname()), "S")==0) ? "S" : "N") ;
                           httpContext.ajax_rsp_assign_attri("", false, chkavOp.getInternalname(), AV16Op);
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A418EntUniEnt = localUtil.ctond( httpContext.cgiGet( edtEntUniEnt_Internalname)) ;
                           A417EntPre = localUtil.ctond( httpContext.cgiGet( edtEntPre_Internalname)) ;
                           A5691EntBnc = httpContext.cgiGet( edtEntBnc_Internalname) ;
                           A11Albaran = httpContext.cgiGet( edtAlbaran_Internalname) ;
                           A415EntFecEnt = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtEntFecEnt_Internalname), 0)) ;
                           A3404EntPedCum = GXutil.upper( httpContext.cgiGet( edtEntPedCum_Internalname)) ;
                           AV11PrvNif = httpContext.cgiGet( edtavPrvnif_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavPrvnif_Internalname, AV11PrvNif);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e11AI2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e12AI2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VOP.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e13AI2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'CONFIRMAR'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'Confirmar' */
                                 e14AI2 ();
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

   public void weAI2( )
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

   public void paAI2( )
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
            GX_FocusControl = edtavFec1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      subsflControlProps_162( ) ;
      while ( nGXsfl_16_idx <= nRC_GXsfl_16 )
      {
         sendrow_162( ) ;
         nGXsfl_16_idx = ((subGrid_Islastpage==1)&&(nGXsfl_16_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_16_idx+1) ;
         sGXsfl_16_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_16_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_162( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV7EmprCod ,
                                 boolean AV6AplicarConfirmar ,
                                 String AV11PrvNif ,
                                 String AV16Op ,
                                 int A795PrvNum ,
                                 int AV10PrvNum ,
                                 String A793PrvNif )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID_nCurrentRecord = 0 ;
      rfAI2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
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
      rfAI2( ) ;
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

   public void rfAI2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(16) ;
      nGXsfl_16_idx = 1 ;
      sGXsfl_16_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_16_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_162( ) ;
      bGXsfl_16_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "Grid");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_162( ) ;
         /* Using cursor H00AI2 */
         pr_default.execute(0, new Object[] {AV7EmprCod});
         nGXsfl_16_idx = 1 ;
         sGXsfl_16_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_16_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_162( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 0 == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H00AI2_A396EmprCod[0] ;
            A10184EntRemTpo = H00AI2_A10184EntRemTpo[0] ;
            A6156EntPrvNum = H00AI2_A6156EntPrvNum[0] ;
            n6156EntPrvNum = H00AI2_n6156EntPrvNum[0] ;
            A597LinEnt = H00AI2_A597LinEnt[0] ;
            A3404EntPedCum = H00AI2_A3404EntPedCum[0] ;
            A415EntFecEnt = H00AI2_A415EntFecEnt[0] ;
            A11Albaran = H00AI2_A11Albaran[0] ;
            A5691EntBnc = H00AI2_A5691EntBnc[0] ;
            A417EntPre = H00AI2_A417EntPre[0] ;
            A418EntUniEnt = H00AI2_A418EntUniEnt[0] ;
            A718PrdNom = H00AI2_A718PrdNom[0] ;
            A719PrdNum = H00AI2_A719PrdNum[0] ;
            A718PrdNom = H00AI2_A718PrdNom[0] ;
            if ( GXutil.strcmp(A10184EntRemTpo, httpContext.getMessage( "SI", "")) != 0 )
            {
               if ( GXutil.strcmp(GXutil.substring( A11Albaran, 1, 3), httpContext.getMessage( "REC", "")) != 0 )
               {
                  e12AI2 ();
               }
            }
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(16) ;
         wbAI0( ) ;
      }
      bGXsfl_16_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesAI2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPRVNUM", GXutil.ltrim( localUtil.ntoc( AV10PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRVNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10PrvNum), "ZZZZZ9")));
   }

   public int subgrid_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid_fnc_recordcount( )
   {
      return (int)(GRID_nFirstRecordOnPage+1) ;
   }

   public int subgrid_fnc_recordsperpage( )
   {
      if ( 0 > 0 )
      {
         return 0*1 ;
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
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7EmprCod, AV6AplicarConfirmar, AV11PrvNif, AV16Op, A795PrvNum, AV10PrvNum, A793PrvNif) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7EmprCod, AV6AplicarConfirmar, AV11PrvNif, AV16Op, A795PrvNum, AV10PrvNum, A793PrvNif) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      if ( GRID_nFirstRecordOnPage >= subgrid_fnc_recordsperpage( ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage-subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7EmprCod, AV6AplicarConfirmar, AV11PrvNif, AV16Op, A795PrvNum, AV10PrvNum, A793PrvNif) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7EmprCod, AV6AplicarConfirmar, AV11PrvNif, AV16Op, A795PrvNum, AV10PrvNum, A793PrvNif) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7EmprCod, AV6AplicarConfirmar, AV11PrvNif, AV16Op, A795PrvNum, AV10PrvNum, A793PrvNif) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupAI0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11AI2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_16 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_16"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFec1_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFEC1");
            GX_FocusControl = edtavFec1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12Fec1 = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12Fec1", localUtil.format(AV12Fec1, "99/99/99"));
         }
         else
         {
            AV12Fec1 = localUtil.ctod( httpContext.cgiGet( edtavFec1_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12Fec1", localUtil.format(AV12Fec1, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFec2_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFEC2");
            GX_FocusControl = edtavFec2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13Fec2 = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Fec2", localUtil.format(AV13Fec2, "99/99/99"));
         }
         else
         {
            AV13Fec2 = localUtil.ctod( httpContext.cgiGet( edtavFec2_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Fec2", localUtil.format(AV13Fec2, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      e11AI2 ();
      if (returnInSub) return;
   }

   public void e11AI2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV5Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webbccomp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV5Station = GXt_char1 ;
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char4[0] = AV9UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV5Station, GXv_char2, GXv_char3, GXv_char4) ;
      webbccomp_impl.this.AV7EmprCod = GXv_char2[0] ;
      webbccomp_impl.this.AV8EmprNom = GXv_char3[0] ;
      webbccomp_impl.this.AV9UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      AV6AplicarConfirmar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6AplicarConfirmar", AV6AplicarConfirmar);
   }

   private void e12AI2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      if ( AV6AplicarConfirmar )
      {
         /* Execute user subroutine: 'APLICAR CONFIRMAR' */
         S112 ();
         if (returnInSub) return;
      }
      AV10PrvNum = A6156EntPrvNum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10PrvNum), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRVNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10PrvNum), "ZZZZZ9")));
      /* Execute user subroutine: 'PRVGEN' */
      S122 ();
      if (returnInSub) return;
      AV16Op = ((GXutil.strcmp("", A5691EntBnc)==0)||(GXutil.strcmp("", AV11PrvNif)==0) ? httpContext.getMessage( "N", "") : httpContext.getMessage( "S", "")) ;
      httpContext.ajax_rsp_assign_attri("", false, chkavOp.getInternalname(), AV16Op);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(16) ;
      }
      if ( ( subGrid_Islastpage == 1 ) || ( 0 == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         sendrow_162( ) ;
         GRID_nEOF = (byte)(1) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
         {
            GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
         }
      }
      if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
      {
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      }
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_16_Refreshing )
      {
         httpContext.doAjaxLoad(16, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e13AI2( )
   {
      /* Op_Click Routine */
      returnInSub = false ;
      if ( (GXutil.strcmp("", A5691EntBnc)==0) || (GXutil.strcmp("", AV11PrvNif)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO se puede seleccionar la linea, falta Nº Interno o NIF", ""));
         AV16Op = httpContext.getMessage( "N", "") ;
         httpContext.ajax_rsp_assign_attri("", false, chkavOp.getInternalname(), AV16Op);
         httpContext.doAjaxRefresh();
      }
      /*  Sending Event outputs  */
   }

   public void e14AI2( )
   {
      /* 'Confirmar' Routine */
      returnInSub = false ;
      AV6AplicarConfirmar = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6AplicarConfirmar", AV6AplicarConfirmar);
      /* Execute user subroutine: 'APLICAR CONFIRMAR' */
      S112 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void S122( )
   {
      /* 'PRVGEN' Routine */
      returnInSub = false ;
      AV11PrvNif = httpContext.getMessage( "NO", "") ;
      httpContext.ajax_rsp_assign_attri("", false, edtavPrvnif_Internalname, AV11PrvNif);
      /* Using cursor H00AI3 */
      pr_default.execute(1, new Object[] {AV7EmprCod, Integer.valueOf(AV10PrvNum)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A795PrvNum = H00AI3_A795PrvNum[0] ;
         A396EmprCod = H00AI3_A396EmprCod[0] ;
         A793PrvNif = H00AI3_A793PrvNif[0] ;
         n793PrvNif = H00AI3_n793PrvNif[0] ;
         AV11PrvNif = ((GXutil.strcmp("", A793PrvNif)==0) ? httpContext.getMessage( "NO NIF", "") : A793PrvNif) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavPrvnif_Internalname, AV11PrvNif);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S112( )
   {
      /* 'APLICAR CONFIRMAR' Routine */
      returnInSub = false ;
      if ( AV6AplicarConfirmar )
      {
         if ( GXutil.strcmp(AV16Op, httpContext.getMessage( "S", "")) == 0 )
         {
            GXv_char4[0] = AV7EmprCod ;
            GXv_char3[0] = A719PrdNum ;
            GXv_char2[0] = A5691EntBnc ;
            GXv_char5[0] = A11Albaran ;
            GXv_decimal6[0] = A417EntPre ;
            GXv_decimal7[0] = A418EntUniEnt ;
            GXv_dtime8[0] = GXutil.resetTime( A415EntFecEnt );
            GXv_char9[0] = AV11PrvNif ;
            GXv_char10[0] = A3404EntPedCum ;
            GXv_int11[0] = A597LinEnt ;
            new app.pinsbccomp(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_char5, GXv_decimal6, GXv_decimal7, GXv_dtime8, GXv_char9, GXv_char10, GXv_int11) ;
            webbccomp_impl.this.AV7EmprCod = GXv_char4[0] ;
            webbccomp_impl.this.A719PrdNum = GXv_char3[0] ;
            webbccomp_impl.this.A5691EntBnc = GXv_char2[0] ;
            webbccomp_impl.this.A11Albaran = GXv_char5[0] ;
            webbccomp_impl.this.A417EntPre = GXv_decimal6[0] ;
            webbccomp_impl.this.A418EntUniEnt = GXv_decimal7[0] ;
            webbccomp_impl.this.A415EntFecEnt = GXutil.resetTime(GXv_dtime8[0]) ;
            webbccomp_impl.this.AV11PrvNif = GXv_char9[0] ;
            webbccomp_impl.this.A3404EntPedCum = GXv_char10[0] ;
            webbccomp_impl.this.A597LinEnt = GXv_int11[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, edtavPrvnif_Internalname, AV11PrvNif);
            httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         }
      }
      if ( ! ( subgrid_fnc_pagecount( ) > 0 ) )
      {
         if ( AV6AplicarConfirmar )
         {
            AV6AplicarConfirmar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6AplicarConfirmar", AV6AplicarConfirmar);
            httpContext.doAjaxRefresh();
         }
      }
      else
      {
         if ( AV6AplicarConfirmar && ( subGrid_Rows > 0 ) )
         {
            gxgrgrid_refresh( subGrid_Rows, AV7EmprCod, AV6AplicarConfirmar, AV11PrvNif, AV16Op, A795PrvNum, AV10PrvNum, A793PrvNif) ;
         }
      }
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
      paAI2( ) ;
      wsAI2( ) ;
      weAI2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016405017", true, true);
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
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("messages."+httpContext.getLanguageProperty( "code")+".js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
         httpContext.AddJavascriptSource("webbccomp.js", "?202661016405017", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_162( )
   {
      chkavOp.setInternalname( "vOP_"+sGXsfl_16_idx );
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_16_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_16_idx ;
      edtEntUniEnt_Internalname = "ENTUNIENT_"+sGXsfl_16_idx ;
      edtEntPre_Internalname = "ENTPRE_"+sGXsfl_16_idx ;
      edtEntBnc_Internalname = "ENTBNC_"+sGXsfl_16_idx ;
      edtAlbaran_Internalname = "ALBARAN_"+sGXsfl_16_idx ;
      edtEntFecEnt_Internalname = "ENTFECENT_"+sGXsfl_16_idx ;
      edtEntPedCum_Internalname = "ENTPEDCUM_"+sGXsfl_16_idx ;
      edtavPrvnif_Internalname = "vPRVNIF_"+sGXsfl_16_idx ;
   }

   public void subsflControlProps_fel_162( )
   {
      chkavOp.setInternalname( "vOP_"+sGXsfl_16_fel_idx );
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_16_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_16_fel_idx ;
      edtEntUniEnt_Internalname = "ENTUNIENT_"+sGXsfl_16_fel_idx ;
      edtEntPre_Internalname = "ENTPRE_"+sGXsfl_16_fel_idx ;
      edtEntBnc_Internalname = "ENTBNC_"+sGXsfl_16_fel_idx ;
      edtAlbaran_Internalname = "ALBARAN_"+sGXsfl_16_fel_idx ;
      edtEntFecEnt_Internalname = "ENTFECENT_"+sGXsfl_16_fel_idx ;
      edtEntPedCum_Internalname = "ENTPEDCUM_"+sGXsfl_16_fel_idx ;
      edtavPrvnif_Internalname = "vPRVNIF_"+sGXsfl_16_fel_idx ;
   }

   public void sendrow_162( )
   {
      subsflControlProps_162( ) ;
      wbAI0( ) ;
      if ( ( 0 * 1 == 0 ) || ( nGXsfl_16_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_16_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"Grid"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_16_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavOp.getEnabled()!=0)&&(chkavOp.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 17,'',false,'"+sGXsfl_16_idx+"',16)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vOP_" + sGXsfl_16_idx ;
         chkavOp.setName( GXCCtl );
         chkavOp.setWebtags( "" );
         chkavOp.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavOp.getInternalname(), "TitleCaption", chkavOp.getCaption(), !bGXsfl_16_Refreshing);
         chkavOp.setCheckedValue( "N" );
         AV16Op = ((GXutil.strcmp(GXutil.rtrim( AV16Op), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, chkavOp.getInternalname(), AV16Op);
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavOp.getInternalname(),AV16Op,"","",Integer.valueOf(-1),Integer.valueOf(1),"S","",StyleString,ClassString,"","",TempTags+((chkavOp.getEnabled()!=0)&&(chkavOp.getVisible()!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,17);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntUniEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A418EntUniEnt, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntUniEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntPre_Internalname,GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A417EntPre, "ZZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntBnc_Internalname,GXutil.rtrim( A5691EntBnc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntBnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbaran_Internalname,GXutil.rtrim( A11Albaran),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbaran_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntFecEnt_Internalname,localUtil.format(A415EntFecEnt, "99/99/99"),localUtil.format( A415EntFecEnt, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntFecEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntPedCum_Internalname,GXutil.rtrim( A3404EntPedCum),GXutil.rtrim( localUtil.format( A3404EntPedCum, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntPedCum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrvnif_Enabled!=0)&&(edtavPrvnif_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 26,'',false,'"+sGXsfl_16_idx+"',16)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrvnif_Internalname,GXutil.rtrim( AV11PrvNif),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavPrvnif_Enabled!=0)&&(edtavPrvnif_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,26);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrvnif_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesAI2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_16_idx = ((subGrid_Islastpage==1)&&(nGXsfl_16_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_16_idx+1) ;
         sGXsfl_16_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_16_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_162( ) ;
      }
      /* End function sendrow_162 */
   }

   public void startgridcontrol16( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"16\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "Grid", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Uds Ent", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Documento BNC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Albaran", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cerrar?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N.I.F.", "")) ;
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
         GridContainer.AddObjectProperty("Class", "Grid");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV16Op));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5691EntBnc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11Albaran));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A415EntFecEnt, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3404EntPedCum));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV11PrvNif));
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
      edtavFec1_Internalname = "vFEC1" ;
      edtavFec2_Internalname = "vFEC2" ;
      chkavOp.setInternalname( "vOP" );
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtEntUniEnt_Internalname = "ENTUNIENT" ;
      edtEntPre_Internalname = "ENTPRE" ;
      edtEntBnc_Internalname = "ENTBNC" ;
      edtAlbaran_Internalname = "ALBARAN" ;
      edtEntFecEnt_Internalname = "ENTFECENT" ;
      edtEntPedCum_Internalname = "ENTPEDCUM" ;
      edtavPrvnif_Internalname = "vPRVNIF" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid_Internalname = "GRID" ;
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
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtavPrvnif_Jsonclick = "" ;
      edtavPrvnif_Visible = -1 ;
      edtavPrvnif_Enabled = 1 ;
      edtEntPedCum_Jsonclick = "" ;
      edtEntFecEnt_Jsonclick = "" ;
      edtAlbaran_Jsonclick = "" ;
      edtEntBnc_Jsonclick = "" ;
      edtEntPre_Jsonclick = "" ;
      edtEntUniEnt_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      chkavOp.setCaption( "" );
      chkavOp.setVisible( -1 );
      chkavOp.setEnabled( 1 );
      subGrid_Class = "Grid" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFec2_Jsonclick = "" ;
      edtavFec2_Enabled = 1 ;
      edtavFec1_Jsonclick = "" ;
      edtavFec1_Enabled = 1 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Envio Compras a BC", "") );
      subGrid_Rows = 0 ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vOP_" + sGXsfl_16_idx ;
      chkavOp.setName( GXCCtl );
      chkavOp.setWebtags( "" );
      chkavOp.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavOp.getInternalname(), "TitleCaption", chkavOp.getCaption(), !bGXsfl_16_Refreshing);
      chkavOp.setCheckedValue( "N" );
      AV16Op = ((GXutil.strcmp(GXutil.rtrim( AV16Op), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, chkavOp.getInternalname(), AV16Op);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AplicarConfirmar',fld:'vAPLICARCONFIRMAR',pic:''},{av:'AV11PrvNif',fld:'vPRVNIF',pic:''},{av:'AV16Op',fld:'vOP',pic:'@!'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A793PrvNif',fld:'PRVNIF',pic:''},{av:'AV10PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e12AI2',iparms:[{av:'AV6AplicarConfirmar',fld:'vAPLICARCONFIRMAR',pic:''},{av:'A6156EntPrvNum',fld:'ENTPRVNUM',pic:'ZZZZZ9'},{av:'A5691EntBnc',fld:'ENTBNC',pic:''},{av:'AV11PrvNif',fld:'vPRVNIF',pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV16Op',fld:'vOP',pic:'@!'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'AV10PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9',hsh:true},{av:'A793PrvNif',fld:'PRVNIF',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A11Albaran',fld:'ALBARAN',pic:''},{av:'A417EntPre',fld:'ENTPRE',pic:'ZZZZZZZ9.999'},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'A415EntFecEnt',fld:'ENTFECENT',pic:''},{av:'A3404EntPedCum',fld:'ENTPEDCUM',pic:'@!'},{av:'A597LinEnt',fld:'LINENT',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV10PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9',hsh:true},{av:'AV16Op',fld:'vOP',pic:'@!'},{av:'A597LinEnt',fld:'LINENT',pic:'ZZZ9'},{av:'A3404EntPedCum',fld:'ENTPEDCUM',pic:'@!'},{av:'AV11PrvNif',fld:'vPRVNIF',pic:''},{av:'A415EntFecEnt',fld:'ENTFECENT',pic:''},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'A417EntPre',fld:'ENTPRE',pic:'ZZZZZZZ9.999'},{av:'A11Albaran',fld:'ALBARAN',pic:''},{av:'A5691EntBnc',fld:'ENTBNC',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AplicarConfirmar',fld:'vAPLICARCONFIRMAR',pic:''}]}");
      setEventMetadata("VOP.CLICK","{handler:'e13AI2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AplicarConfirmar',fld:'vAPLICARCONFIRMAR',pic:''},{av:'AV11PrvNif',fld:'vPRVNIF',pic:''},{av:'AV16Op',fld:'vOP',pic:'@!'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'AV10PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9',hsh:true},{av:'A793PrvNif',fld:'PRVNIF',pic:''},{av:'A5691EntBnc',fld:'ENTBNC',pic:''}]");
      setEventMetadata("VOP.CLICK",",oparms:[{av:'AV16Op',fld:'vOP',pic:'@!'}]}");
      setEventMetadata("'CONFIRMAR'","{handler:'e14AI2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AplicarConfirmar',fld:'vAPLICARCONFIRMAR',pic:''},{av:'AV11PrvNif',fld:'vPRVNIF',pic:''},{av:'AV16Op',fld:'vOP',pic:'@!'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'AV10PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9',hsh:true},{av:'A793PrvNif',fld:'PRVNIF',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A5691EntBnc',fld:'ENTBNC',pic:''},{av:'A11Albaran',fld:'ALBARAN',pic:''},{av:'A417EntPre',fld:'ENTPRE',pic:'ZZZZZZZ9.999'},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'A415EntFecEnt',fld:'ENTFECENT',pic:''},{av:'A3404EntPedCum',fld:'ENTPEDCUM',pic:'@!'},{av:'A597LinEnt',fld:'LINENT',pic:'ZZZ9'}]");
      setEventMetadata("'CONFIRMAR'",",oparms:[{av:'AV6AplicarConfirmar',fld:'vAPLICARCONFIRMAR',pic:''},{av:'A597LinEnt',fld:'LINENT',pic:'ZZZ9'},{av:'A3404EntPedCum',fld:'ENTPEDCUM',pic:'@!'},{av:'AV11PrvNif',fld:'vPRVNIF',pic:''},{av:'A415EntFecEnt',fld:'ENTFECENT',pic:''},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'A417EntPre',fld:'ENTPRE',pic:'ZZZZZZZ9.999'},{av:'A11Albaran',fld:'ALBARAN',pic:''},{av:'A5691EntBnc',fld:'ENTBNC',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AplicarConfirmar',fld:'vAPLICARCONFIRMAR',pic:''},{av:'AV11PrvNif',fld:'vPRVNIF',pic:''},{av:'AV16Op',fld:'vOP',pic:'@!'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'AV10PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9',hsh:true},{av:'A793PrvNif',fld:'PRVNIF',pic:''}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AplicarConfirmar',fld:'vAPLICARCONFIRMAR',pic:''},{av:'AV11PrvNif',fld:'vPRVNIF',pic:''},{av:'AV16Op',fld:'vOP',pic:'@!'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'AV10PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9',hsh:true},{av:'A793PrvNif',fld:'PRVNIF',pic:''}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AplicarConfirmar',fld:'vAPLICARCONFIRMAR',pic:''},{av:'AV11PrvNif',fld:'vPRVNIF',pic:''},{av:'AV16Op',fld:'vOP',pic:'@!'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'AV10PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9',hsh:true},{av:'A793PrvNif',fld:'PRVNIF',pic:''}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AplicarConfirmar',fld:'vAPLICARCONFIRMAR',pic:''},{av:'AV11PrvNif',fld:'vPRVNIF',pic:''},{av:'AV16Op',fld:'vOP',pic:'@!'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'AV10PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9',hsh:true},{av:'A793PrvNif',fld:'PRVNIF',pic:''}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_ALBARAN","{handler:'valid_Albaran',iparms:[]");
      setEventMetadata("VALID_ALBARAN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Prvnif',iparms:[]");
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7EmprCod = "" ;
      AV11PrvNif = "" ;
      AV16Op = "" ;
      A793PrvNif = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      A396EmprCod = "" ;
      A10184EntRemTpo = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      TempTags = "" ;
      AV12Fec1 = GXutil.nullDate() ;
      AV13Fec2 = GXutil.nullDate() ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      A417EntPre = DecimalUtil.ZERO ;
      A5691EntBnc = "" ;
      A11Albaran = "" ;
      A415EntFecEnt = GXutil.nullDate() ;
      A3404EntPedCum = "" ;
      scmdbuf = "" ;
      H00AI2_A396EmprCod = new String[] {""} ;
      H00AI2_A10184EntRemTpo = new String[] {""} ;
      H00AI2_A6156EntPrvNum = new int[1] ;
      H00AI2_n6156EntPrvNum = new boolean[] {false} ;
      H00AI2_A597LinEnt = new short[1] ;
      H00AI2_A3404EntPedCum = new String[] {""} ;
      H00AI2_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      H00AI2_A11Albaran = new String[] {""} ;
      H00AI2_A5691EntBnc = new String[] {""} ;
      H00AI2_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00AI2_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00AI2_A718PrdNom = new String[] {""} ;
      H00AI2_A719PrdNum = new String[] {""} ;
      AV5Station = "" ;
      GXt_char1 = "" ;
      AV8EmprNom = "" ;
      AV9UsurCod = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      H00AI3_A795PrvNum = new int[1] ;
      H00AI3_A396EmprCod = new String[] {""} ;
      H00AI3_A793PrvNif = new String[] {""} ;
      H00AI3_n793PrvNif = new boolean[] {false} ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_dtime8 = new java.util.Date[1] ;
      GXv_char9 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_int11 = new short[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ClassString = "" ;
      StyleString = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webbccomp__default(),
         new Object[] {
             new Object[] {
            H00AI2_A396EmprCod, H00AI2_A10184EntRemTpo, H00AI2_A6156EntPrvNum, H00AI2_n6156EntPrvNum, H00AI2_A597LinEnt, H00AI2_A3404EntPedCum, H00AI2_A415EntFecEnt, H00AI2_A11Albaran, H00AI2_A5691EntBnc, H00AI2_A417EntPre,
            H00AI2_A418EntUniEnt, H00AI2_A718PrdNom, H00AI2_A719PrdNum
            }
            , new Object[] {
            H00AI3_A795PrvNum, H00AI3_A396EmprCod, H00AI3_A793PrvNif, H00AI3_n793PrvNif
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short A597LinEnt ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int11[] ;
   private int subGrid_Rows ;
   private int nRC_GXsfl_16 ;
   private int nGXsfl_16_idx=1 ;
   private int A795PrvNum ;
   private int AV10PrvNum ;
   private int A6156EntPrvNum ;
   private int edtavFec1_Enabled ;
   private int edtavFec2_Enabled ;
   private int subGrid_Islastpage ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavPrvnif_Enabled ;
   private int edtavPrvnif_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private java.math.BigDecimal A418EntUniEnt ;
   private java.math.BigDecimal A417EntPre ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_16_idx="0001" ;
   private String AV7EmprCod ;
   private String AV11PrvNif ;
   private String AV16Op ;
   private String A793PrvNif ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A10184EntRemTpo ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String edtavFec1_Internalname ;
   private String TempTags ;
   private String edtavFec1_Jsonclick ;
   private String edtavFec2_Internalname ;
   private String edtavFec2_Jsonclick ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String edtEntUniEnt_Internalname ;
   private String edtEntPre_Internalname ;
   private String A5691EntBnc ;
   private String edtEntBnc_Internalname ;
   private String A11Albaran ;
   private String edtAlbaran_Internalname ;
   private String edtEntFecEnt_Internalname ;
   private String A3404EntPedCum ;
   private String edtEntPedCum_Internalname ;
   private String edtavPrvnif_Internalname ;
   private String scmdbuf ;
   private String AV5Station ;
   private String GXt_char1 ;
   private String AV8EmprNom ;
   private String AV9UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char5[] ;
   private String GXv_char9[] ;
   private String GXv_char10[] ;
   private String sGXsfl_16_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ClassString ;
   private String StyleString ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtEntUniEnt_Jsonclick ;
   private String edtEntPre_Jsonclick ;
   private String edtEntBnc_Jsonclick ;
   private String edtAlbaran_Jsonclick ;
   private String edtEntFecEnt_Jsonclick ;
   private String edtEntPedCum_Jsonclick ;
   private String edtavPrvnif_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date GXv_dtime8[] ;
   private java.util.Date AV12Fec1 ;
   private java.util.Date AV13Fec2 ;
   private java.util.Date A415EntFecEnt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV6AplicarConfirmar ;
   private boolean n793PrvNif ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_16_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n6156EntPrvNum ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private ICheckbox chkavOp ;
   private IDataStoreProvider pr_default ;
   private String[] H00AI2_A396EmprCod ;
   private String[] H00AI2_A10184EntRemTpo ;
   private int[] H00AI2_A6156EntPrvNum ;
   private boolean[] H00AI2_n6156EntPrvNum ;
   private short[] H00AI2_A597LinEnt ;
   private String[] H00AI2_A3404EntPedCum ;
   private java.util.Date[] H00AI2_A415EntFecEnt ;
   private String[] H00AI2_A11Albaran ;
   private String[] H00AI2_A5691EntBnc ;
   private java.math.BigDecimal[] H00AI2_A417EntPre ;
   private java.math.BigDecimal[] H00AI2_A418EntUniEnt ;
   private String[] H00AI2_A718PrdNom ;
   private String[] H00AI2_A719PrdNum ;
   private int[] H00AI3_A795PrvNum ;
   private String[] H00AI3_A396EmprCod ;
   private String[] H00AI3_A793PrvNif ;
   private boolean[] H00AI3_n793PrvNif ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class webbccomp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00AI2", "SELECT T1.EmprCod, T1.EntRemTpo, T1.EntPrvNum, T1.LinEnt, T1.EntPedCum, T1.EntFecEnt, T1.Albaran, T1.EntBnc, T1.EntPre, T1.EntUniEnt, T2.PrdNom, T1.PrdNum FROM (TXPENTALM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? ORDER BY T1.EmprCod, T1.EntFecEnt DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00AI3", "SELECT PrvNum, EmprCod, PrvNif FROM TXPPRVGEN WHERE EmprCod = ? and PrvNum = ? ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 10);
               ((String[]) buf[8])[0] = rslt.getString(8, 10);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((String[]) buf[12])[0] = rslt.getString(12, 6);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

