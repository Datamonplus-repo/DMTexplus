package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class salidasmanuales_impl extends GXDataArea
{
   public salidasmanuales_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public salidasmanuales_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( salidasmanuales_impl.class ));
   }

   public salidasmanuales_impl( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCtlcumunidad = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"CTLPRDNUM") == 0 )
         {
            A13747PrdCDsc = httpContext.GetPar( "PrdCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvctlprdnum1530( A13747PrdCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"CTLPRDNUM") == 0 )
         {
            A13747PrdCDsc = httpContext.GetPar( "PrdCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvctlprdnum1530( A13747PrdCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"CTLPRDNUM") == 0 )
         {
            hV18GXV4 = httpContext.GetPar( "hV18GXV4") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvctlprdnum1532( hV18GXV4) ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            gxnrgrid1_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid1") == 0 )
         {
            gxgrgrid1_refresh_invoke( ) ;
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

   public void gxnrgrid1_newrow_invoke( )
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
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public void gxgrgrid1_refresh_invoke( )
   {
      AV7Emprcod = httpContext.GetPar( "Emprcod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid1_refresh( AV7Emprcod) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid1_refresh_invoke */
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
      pa1532( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1532( ) ;
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
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.salidasmanuales", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Emprcod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Salidasmanualessdt", AV5SalidasManualesSDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Salidasmanualessdt", AV5SalidasManualesSDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_16", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_16, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNUM", GXutil.rtrim( AV11Prdnum));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANRES", GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRODUCTO", AV6Producto);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRODUCTO", AV6Producto);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXIALM", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFACCON", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSALIDASMANUALESSDT", AV5SalidasManualesSDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSALIDASMANUALESSDT", AV5SalidasManualesSDT);
      }
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
         we1532( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1532( ) ;
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
      return formatLink("app.salidasmanuales", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "SalidasManuales" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Salidas Manuales", "") ;
   }

   public void wb1530( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCtlcumconfec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCtlcumconfec_Internalname, httpContext.getMessage( "Fecha cumplimentación", ""), "col-sm-3 AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'" + sGXsfl_16_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCtlcumconfec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCtlcumconfec_Internalname, localUtil.format(AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Cabecera().getgxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec(), "99/99/99"), localUtil.format( AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Cabecera().getgxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec(), "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,8);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlcumconfec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavCtlcumconfec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SalidasManuales.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavCtlcumconfec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavCtlcumconfec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_SalidasManuales.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCtlccocod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCtlccocod_Internalname, httpContext.getMessage( "CcoCod", ""), "col-sm-3 AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'" + sGXsfl_16_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCtlccocod_Internalname, GXutil.ltrim( localUtil.ntoc( AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Cabecera().getgxTv_SdtSalidasManualesSDT_Cabecera_Ccocod(), (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCtlccocod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Cabecera().getgxTv_SdtSalidasManualesSDT_Cabecera_Ccocod()), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Cabecera().getgxTv_SdtSalidasManualesSDT_Cabecera_Ccocod()), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,13);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlccocod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavCtlccocod_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SalidasManuales.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         startgridcontrol16( ) ;
      }
      if ( wbEnd == 16 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_16 = (int)(nGXsfl_16_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV17GXV3 = nGXsfl_16_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container, subGrid1_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttButton2_Internalname, "gx.evt.setGridEvt("+GXutil.str( 16, 2, 0)+","+"null"+");", httpContext.getMessage( "Insertar Linea", ""), bttButton2_Jsonclick, 5, httpContext.getMessage( "Insertar Linea", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'INSERTAR LINEA\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SalidasManuales.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttButton4_Internalname, "gx.evt.setGridEvt("+GXutil.str( 16, 2, 0)+","+"null"+");", httpContext.getMessage( "Salir", ""), bttButton4_Jsonclick, 5, httpContext.getMessage( "Salir", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'SALIR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SalidasManuales.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
            if ( Grid1Container.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV17GXV3 = nGXsfl_16_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container, subGrid1_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start1532( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Salidas Manuales", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1530( ) ;
   }

   public void ws1532( )
   {
      start1532( ) ;
      evt1532( ) ;
   }

   public void evt1532( )
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
                        else if ( GXutil.strcmp(sEvt, "'INSERTAR LINEA'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Insertar Linea' */
                           e111532 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'SALIR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Salir' */
                           e121532 ();
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
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_16_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_16_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_16_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_162( ) ;
                           AV17GXV3 = nGXsfl_16_idx ;
                           if ( ( AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().size() >= AV17GXV3 ) && ( AV17GXV3 > 0 ) )
                           {
                              AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().currentItem( ((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)) );
                              hV18GXV4 = httpContext.cgiGet( edtavCtlprdnum_Internalname) ;
                           }
                           GXCCtl = "GXHCCTLPRDNUM_" + sGXsfl_16_idx ;
                           ((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)).setgxTv_SdtSalidasManualesSDT_Producto_Prdnum( httpContext.cgiGet( GXCCtl) );
                           if ( ! httpContext.isAjaxRequest( ) )
                           {
                              GXCCtl = "GXHCCTLPRDNUM_" + sGXsfl_16_idx ;
                              ((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)).setgxTv_SdtSalidasManualesSDT_Producto_Prdnum( httpContext.cgiGet( GXCCtl) );
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e131532 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e141532 ();
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

   public void we1532( )
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

   public void pa1532( )
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
            GX_FocusControl = edtavCtlcumconfec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvctlprdnum1530( String A13747PrdCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvctlprdnum_data1530( A13747PrdCDsc) ;
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

   protected void gxsgvctlprdnum_data1530( String A13747PrdCDsc )
   {
      l13747PrdCDsc = GXutil.concat( GXutil.rtrim( A13747PrdCDsc), "%", "") ;
      /* Using cursor H01532 */
      pr_default.execute(0, new Object[] {l13747PrdCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01532_A13747PrdCDsc[0]) , GXutil.padr( "%" + GXutil.upper( A13747PrdCDsc) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01532_A13747PrdCDsc[0]);
            gxdynajaxctrldescr.add(H01532_A13747PrdCDsc[0]);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxhcvctlprdnum1532( String A13747PrdCDsc )
   {
      /* Using cursor H01533 */
      pr_default.execute(1, new Object[] {A13747PrdCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(1) != 101) )
      {
         if ( GXutil.strcmp(H01533_A13747PrdCDsc[0], A13747PrdCDsc) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13747PrdCDsc = H01533_A13747PrdCDsc[0] ;
            A396EmprCod = H01533_A396EmprCod[0] ;
            A719PrdNum = H01533_A719PrdNum[0] ;
         }
         pr_default.readNext(1);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\"") ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_162( ) ;
      while ( nGXsfl_16_idx <= nRC_GXsfl_16 )
      {
         sendrow_162( ) ;
         nGXsfl_16_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_16_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_16_idx+1) ;
         sGXsfl_16_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_16_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_162( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( String AV7Emprcod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rf1532( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid1_refresh */
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
      rf1532( ) ;
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

   public void rf1532( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(16) ;
      nGXsfl_16_idx = 1 ;
      sGXsfl_16_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_16_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_162( ) ;
      bGXsfl_16_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "WorkWith");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_162( ) ;
         e141532 ();
         wbEnd = (short)(16) ;
         wb1530( ) ;
      }
      bGXsfl_16_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1532( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Emprcod, "@!"))));
   }

   public int subgrid1_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid1_fnc_recordcount( )
   {
      return -1 ;
   }

   public int subgrid1_fnc_recordsperpage( )
   {
      return -1 ;
   }

   public int subgrid1_fnc_currentpage( )
   {
      return -1 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1530( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e131532 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSALIDASMANUALESSDT"), AV5SalidasManualesSDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Salidasmanualessdt"), AV5SalidasManualesSDT);
         /* Read saved values. */
         nRC_GXsfl_16 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_16"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_16 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_16"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_16_fel_idx = 0 ;
         while ( nGXsfl_16_fel_idx < nRC_GXsfl_16 )
         {
            nGXsfl_16_fel_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_16_fel_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_16_fel_idx+1) ;
            sGXsfl_16_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_16_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_162( ) ;
            AV17GXV3 = nGXsfl_16_fel_idx ;
            if ( ( AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().size() >= AV17GXV3 ) && ( AV17GXV3 > 0 ) )
            {
               AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().currentItem( ((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)) );
               hV18GXV4 = httpContext.cgiGet( edtavCtlprdnum_Internalname) ;
            }
            GXCCtl = "GXHCCTLPRDNUM_" + sGXsfl_16_fel_idx ;
            ((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)).setgxTv_SdtSalidasManualesSDT_Producto_Prdnum( httpContext.cgiGet( GXCCtl) );
            if ( ! httpContext.isAjaxRequest( ) )
            {
               GXCCtl = "GXHCCTLPRDNUM_" + sGXsfl_16_fel_idx ;
               ((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)).setgxTv_SdtSalidasManualesSDT_Producto_Prdnum( httpContext.cgiGet( GXCCtl) );
            }
         }
         if ( nGXsfl_16_fel_idx == 0 )
         {
            nGXsfl_16_idx = 1 ;
            sGXsfl_16_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_16_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_162( ) ;
         }
         nGXsfl_16_fel_idx = 1 ;
         /* Read variables values. */
         if ( localUtil.vcdate( httpContext.cgiGet( edtavCtlcumconfec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "CTLCUMCONFEC");
            GX_FocusControl = edtavCtlcumconfec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Cabecera().setgxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec( GXutil.nullDate() );
         }
         else
         {
            AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Cabecera().setgxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec( localUtil.ctod( httpContext.cgiGet( edtavCtlcumconfec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlccocod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlccocod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLCCOCOD");
            GX_FocusControl = edtavCtlccocod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Cabecera().setgxTv_SdtSalidasManualesSDT_Cabecera_Ccocod( (short)(0) );
         }
         else
         {
            AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Cabecera().setgxTv_SdtSalidasManualesSDT_Cabecera_Ccocod( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlccocod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
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
      e131532 ();
      if (returnInSub) return;
   }

   public void e131532( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV10Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      salidasmanuales_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Station = GXt_char1 ;
      GXv_char2[0] = AV7Emprcod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char4[0] = AV9UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV10Station, GXv_char2, GXv_char3, GXv_char4) ;
      salidasmanuales_impl.this.AV7Emprcod = GXv_char2[0] ;
      salidasmanuales_impl.this.AV8EmprNom = GXv_char3[0] ;
      salidasmanuales_impl.this.AV9UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Emprcod", AV7Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Emprcod, "@!"))));
      AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Cabecera().setgxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec( GXutil.today( ) );
      AV12WebSession.setValue(httpContext.getMessage( "SalidasManuales", ""), AV5SalidasManualesSDT.toJSonString(false, true));
   }

   public void e111532( )
   {
      AV17GXV3 = nGXsfl_16_idx ;
      if ( ( AV17GXV3 > 0 ) && ( AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().size() >= AV17GXV3 ) )
      {
         AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().currentItem( ((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)) );
      }
      /* 'Insertar Linea' Routine */
      returnInSub = false ;
      AV6Producto = (app.SdtSalidasManualesSDT_Producto)new app.SdtSalidasManualesSDT_Producto(remoteHandle, context);
      AV11Prdnum = AV6Producto.getgxTv_SdtSalidasManualesSDT_Producto_Prdnum() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Prdnum", AV11Prdnum);
      /* Execute user subroutine: 'PRODUC' */
      S112 ();
      if (returnInSub) return;
      AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().add(AV6Producto, 0);
      gx_BV16 = true ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6Producto", AV6Producto);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5SalidasManualesSDT", AV5SalidasManualesSDT);
      nGXsfl_16_bak_idx = nGXsfl_16_idx ;
      gxgrgrid1_refresh( AV7Emprcod) ;
      nGXsfl_16_idx = nGXsfl_16_bak_idx ;
      sGXsfl_16_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_16_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_162( ) ;
   }

   public void S112( )
   {
      /* 'PRODUC' Routine */
      returnInSub = false ;
      AV26GXLvl22 = (byte)(0) ;
      /* Using cursor H01534 */
      pr_default.execute(2, new Object[] {AV7Emprcod, AV11Prdnum});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A719PrdNum = H01534_A719PrdNum[0] ;
         A396EmprCod = H01534_A396EmprCod[0] ;
         A685PrdCanRes = H01534_A685PrdCanRes[0] ;
         A704PrdExiAlm = H01534_A704PrdExiAlm[0] ;
         A707PrdFacCon = H01534_A707PrdFacCon[0] ;
         AV26GXLvl22 = (byte)(1) ;
         AV6Producto.setgxTv_SdtSalidasManualesSDT_Producto_Prdcanres( A685PrdCanRes );
         AV6Producto.setgxTv_SdtSalidasManualesSDT_Producto_Prdexialm( A704PrdExiAlm );
         AV6Producto.setgxTv_SdtSalidasManualesSDT_Producto_Prdfaccon( A707PrdFacCon );
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV26GXLvl22 == 0 )
      {
         AV6Producto.setgxTv_SdtSalidasManualesSDT_Producto_Prdcanres( DecimalUtil.doubleToDec(0) );
         AV6Producto.setgxTv_SdtSalidasManualesSDT_Producto_Prdexialm( DecimalUtil.doubleToDec(0) );
         AV6Producto.setgxTv_SdtSalidasManualesSDT_Producto_Prdfaccon( DecimalUtil.doubleToDec(0) );
      }
   }

   public void e121532( )
   {
      /* 'Salir' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   private void e141532( )
   {
      /* Grid1_Load Routine */
      returnInSub = false ;
      AV17GXV3 = 1 ;
      while ( AV17GXV3 <= AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().size() )
      {
         AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().currentItem( ((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(16) ;
         }
         sendrow_162( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_16_Refreshing )
         {
            httpContext.doAjaxLoad(16, Grid1Row);
         }
         AV17GXV3 = (int)(AV17GXV3+1) ;
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
      pa1532( ) ;
      ws1532( ) ;
      we1532( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016424721", true, true);
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
      httpContext.AddJavascriptSource("salidasmanuales.js", "?202661016424722", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_162( )
   {
      edtavCtlprdnum_Internalname = "CTLPRDNUM_"+sGXsfl_16_idx ;
      edtavCtlprdfaccon_Internalname = "CTLPRDFACCON_"+sGXsfl_16_idx ;
      edtavCtlprdexialm_Internalname = "CTLPRDEXIALM_"+sGXsfl_16_idx ;
      edtavCtlprdcanres_Internalname = "CTLPRDCANRES_"+sGXsfl_16_idx ;
      edtavCtlcumconcant_Internalname = "CTLCUMCONCANT_"+sGXsfl_16_idx ;
      cmbavCtlcumunidad.setInternalname( "CTLCUMUNIDAD_"+sGXsfl_16_idx );
      edtavCtlcumconlot_Internalname = "CTLCUMCONLOT_"+sGXsfl_16_idx ;
      edtavCtlultfecccs_Internalname = "CTLULTFECCCS_"+sGXsfl_16_idx ;
   }

   public void subsflControlProps_fel_162( )
   {
      edtavCtlprdnum_Internalname = "CTLPRDNUM_"+sGXsfl_16_fel_idx ;
      edtavCtlprdfaccon_Internalname = "CTLPRDFACCON_"+sGXsfl_16_fel_idx ;
      edtavCtlprdexialm_Internalname = "CTLPRDEXIALM_"+sGXsfl_16_fel_idx ;
      edtavCtlprdcanres_Internalname = "CTLPRDCANRES_"+sGXsfl_16_fel_idx ;
      edtavCtlcumconcant_Internalname = "CTLCUMCONCANT_"+sGXsfl_16_fel_idx ;
      cmbavCtlcumunidad.setInternalname( "CTLCUMUNIDAD_"+sGXsfl_16_fel_idx );
      edtavCtlcumconlot_Internalname = "CTLCUMCONLOT_"+sGXsfl_16_fel_idx ;
      edtavCtlultfecccs_Internalname = "CTLULTFECCCS_"+sGXsfl_16_fel_idx ;
   }

   public void sendrow_162( )
   {
      subsflControlProps_162( ) ;
      wb1530( ) ;
      Grid1Row = GXWebRow.GetNew(context,Grid1Container) ;
      if ( subGrid1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Odd" ;
         }
      }
      else if ( subGrid1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid1_Backstyle = (byte)(0) ;
         subGrid1_Backcolor = subGrid1_Allbackcolor ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
         }
      }
      else if ( subGrid1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Odd" ;
         }
         subGrid1_Backcolor = (int)(0x0) ;
      }
      else if ( subGrid1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_16_idx) % (2))) == 0 )
         {
            subGrid1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Even" ;
            }
         }
         else
         {
            subGrid1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr ") ;
         httpContext.writeText( " class=\""+"WorkWith"+"\" style=\""+""+"\"") ;
         httpContext.writeText( " gxrow=\""+sGXsfl_16_idx+"\">") ;
      }
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCtlprdnum_Enabled!=0)&&(edtavCtlprdnum_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 17,'',false,'"+sGXsfl_16_idx+"',16)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlprdnum_Internalname,hV18GXV4,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCtlprdnum_Enabled!=0)&&(edtavCtlprdnum_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,17);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlprdnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCtlprdfaccon_Enabled!=0)&&(edtavCtlprdfaccon_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 18,'',false,'"+sGXsfl_16_idx+"',16)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlprdfaccon_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)).getgxTv_SdtSalidasManualesSDT_Producto_Prdfaccon(), (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( ((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)).getgxTv_SdtSalidasManualesSDT_Producto_Prdfaccon(), "Z9.9999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavCtlprdfaccon_Enabled!=0)&&(edtavCtlprdfaccon_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,18);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlprdfaccon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCtlprdexialm_Enabled!=0)&&(edtavCtlprdexialm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 19,'',false,'"+sGXsfl_16_idx+"',16)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlprdexialm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)).getgxTv_SdtSalidasManualesSDT_Producto_Prdexialm(), (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( ((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)).getgxTv_SdtSalidasManualesSDT_Producto_Prdexialm(), "ZZZZZZ9.9999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavCtlprdexialm_Enabled!=0)&&(edtavCtlprdexialm_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,19);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlprdexialm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCtlprdcanres_Enabled!=0)&&(edtavCtlprdcanres_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 20,'',false,'"+sGXsfl_16_idx+"',16)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlprdcanres_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)).getgxTv_SdtSalidasManualesSDT_Producto_Prdcanres(), (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( ((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)).getgxTv_SdtSalidasManualesSDT_Producto_Prdcanres(), "ZZZZZZ9.9999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavCtlprdcanres_Enabled!=0)&&(edtavCtlprdcanres_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,20);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlprdcanres_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCtlcumconcant_Enabled!=0)&&(edtavCtlcumconcant_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 21,'',false,'"+sGXsfl_16_idx+"',16)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlcumconcant_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)).getgxTv_SdtSalidasManualesSDT_Producto_Cumconcant(), (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( ((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)).getgxTv_SdtSalidasManualesSDT_Producto_Cumconcant(), "ZZZZZZ9.9999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavCtlcumconcant_Enabled!=0)&&(edtavCtlcumconcant_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,21);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlcumconcant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      TempTags = " " + ((cmbavCtlcumunidad.getEnabled()!=0)&&(cmbavCtlcumunidad.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 22,'',false,'"+sGXsfl_16_idx+"',16)\"" : " ") ;
      if ( ( cmbavCtlcumunidad.getItemCount() == 0 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "CTLCUMUNIDAD_" + sGXsfl_16_idx ;
         cmbavCtlcumunidad.setName( GXCCtl );
         cmbavCtlcumunidad.setWebtags( "" );
         cmbavCtlcumunidad.addItem("1", httpContext.getMessage( "kg", ""), (short)(0));
         cmbavCtlcumunidad.addItem("0", httpContext.getMessage( "gr", ""), (short)(0));
         if ( cmbavCtlcumunidad.getItemCount() > 0 )
         {
            if ( ( AV17GXV3 > 0 ) && ( AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().size() >= AV17GXV3 ) && (0==((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)).getgxTv_SdtSalidasManualesSDT_Producto_Cumunidad()) )
            {
               ((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)).setgxTv_SdtSalidasManualesSDT_Producto_Cumunidad( (byte)(GXutil.lval( cmbavCtlcumunidad.getValidValue(GXutil.trim( GXutil.str( ((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)).getgxTv_SdtSalidasManualesSDT_Producto_Cumunidad(), 1, 0))))) );
            }
         }
      }
      /* ComboBox */
      Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavCtlcumunidad,cmbavCtlcumunidad.getInternalname(),GXutil.trim( GXutil.str( ((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)).getgxTv_SdtSalidasManualesSDT_Producto_Cumunidad(), 1, 0)),Integer.valueOf(1),cmbavCtlcumunidad.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavCtlcumunidad.getEnabled()!=0)&&(cmbavCtlcumunidad.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,22);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbavCtlcumunidad.setValue( GXutil.trim( GXutil.str( ((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)).getgxTv_SdtSalidasManualesSDT_Producto_Cumunidad(), 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCtlcumunidad.getInternalname(), "Values", cmbavCtlcumunidad.ToJavascriptSource(), !bGXsfl_16_Refreshing);
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCtlcumconlot_Enabled!=0)&&(edtavCtlcumconlot_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 23,'',false,'"+sGXsfl_16_idx+"',16)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlcumconlot_Internalname,GXutil.rtrim( ((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)).getgxTv_SdtSalidasManualesSDT_Producto_Cumconlot()),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCtlcumconlot_Enabled!=0)&&(edtavCtlcumconlot_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,23);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlcumconlot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCtlultfecccs_Enabled!=0)&&(edtavCtlultfecccs_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 24,'',false,'"+sGXsfl_16_idx+"',16)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlultfecccs_Internalname,localUtil.format(((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)).getgxTv_SdtSalidasManualesSDT_Producto_Ultfecccs(), "99/99/99"),localUtil.format( ((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)).getgxTv_SdtSalidasManualesSDT_Producto_Ultfecccs(), "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavCtlultfecccs_Enabled!=0)&&(edtavCtlultfecccs_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,24);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlultfecccs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      send_integrity_lvl_hashes1532( ) ;
      GXCCtl = "GXHCCTLPRDNUM_" + sGXsfl_16_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( ((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)).getgxTv_SdtSalidasManualesSDT_Producto_Prdnum()));
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_16_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_16_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_16_idx+1) ;
      sGXsfl_16_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_16_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_162( ) ;
      /* End function sendrow_162 */
   }

   public void startgridcontrol16( )
   {
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"16\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid1_Backcolorstyle == 0 )
         {
            subGrid1_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid1_Class) > 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Title" ;
            }
         }
         else
         {
            subGrid1_Titlebackstyle = (byte)(1) ;
            if ( subGrid1_Backcolorstyle == 1 )
            {
               subGrid1_Titlebackcolor = subGrid1_Allbackcolor ;
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Factor de Conversion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Existencias Almacen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad Reservada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ultimo Mov CCSTKS", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Grid1Container.AddObjectProperty("GridName", "Grid1");
      }
      else
      {
         Grid1Container.AddObjectProperty("GridName", "Grid1");
         Grid1Container.AddObjectProperty("Header", subGrid1_Header);
         Grid1Container.AddObjectProperty("Class", "WorkWith");
         Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("CmpContext", "");
         Grid1Container.AddObjectProperty("InMasterPage", "false");
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      edtavCtlcumconfec_Internalname = "CTLCUMCONFEC" ;
      edtavCtlccocod_Internalname = "CTLCCOCOD" ;
      edtavCtlprdnum_Internalname = "CTLPRDNUM" ;
      edtavCtlprdfaccon_Internalname = "CTLPRDFACCON" ;
      edtavCtlprdexialm_Internalname = "CTLPRDEXIALM" ;
      edtavCtlprdcanres_Internalname = "CTLPRDCANRES" ;
      edtavCtlcumconcant_Internalname = "CTLCUMCONCANT" ;
      cmbavCtlcumunidad.setInternalname( "CTLCUMUNIDAD" );
      edtavCtlcumconlot_Internalname = "CTLCUMCONLOT" ;
      edtavCtlultfecccs_Internalname = "CTLULTFECCCS" ;
      bttButton2_Internalname = "BUTTON2" ;
      bttButton4_Internalname = "BUTTON4" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
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
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      subGrid1_Header = "" ;
      edtavCtlultfecccs_Jsonclick = "" ;
      edtavCtlultfecccs_Visible = -1 ;
      edtavCtlultfecccs_Enabled = 1 ;
      edtavCtlcumconlot_Jsonclick = "" ;
      edtavCtlcumconlot_Visible = -1 ;
      edtavCtlcumconlot_Enabled = 1 ;
      cmbavCtlcumunidad.setJsonclick( "" );
      cmbavCtlcumunidad.setVisible( -1 );
      cmbavCtlcumunidad.setEnabled( 1 );
      edtavCtlcumconcant_Jsonclick = "" ;
      edtavCtlcumconcant_Visible = -1 ;
      edtavCtlcumconcant_Enabled = 1 ;
      edtavCtlprdcanres_Jsonclick = "" ;
      edtavCtlprdcanres_Visible = -1 ;
      edtavCtlprdcanres_Enabled = 1 ;
      edtavCtlprdexialm_Jsonclick = "" ;
      edtavCtlprdexialm_Visible = -1 ;
      edtavCtlprdexialm_Enabled = 1 ;
      edtavCtlprdfaccon_Jsonclick = "" ;
      edtavCtlprdfaccon_Visible = -1 ;
      edtavCtlprdfaccon_Enabled = 1 ;
      edtavCtlprdnum_Jsonclick = "" ;
      edtavCtlprdnum_Visible = -1 ;
      edtavCtlprdnum_Enabled = 1 ;
      subGrid1_Class = "WorkWith" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCtlccocod_Jsonclick = "" ;
      edtavCtlccocod_Enabled = 1 ;
      edtavCtlcumconfec_Jsonclick = "" ;
      edtavCtlcumconfec_Enabled = 1 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Salidas Manuales", "") );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "CTLCUMUNIDAD_" + sGXsfl_16_idx ;
      cmbavCtlcumunidad.setName( GXCCtl );
      cmbavCtlcumunidad.setWebtags( "" );
      cmbavCtlcumunidad.addItem("1", httpContext.getMessage( "kg", ""), (short)(0));
      cmbavCtlcumunidad.addItem("0", httpContext.getMessage( "gr", ""), (short)(0));
      if ( cmbavCtlcumunidad.getItemCount() > 0 )
      {
         if ( ( AV17GXV3 > 0 ) && ( AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().size() >= AV17GXV3 ) && (0==((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)).getgxTv_SdtSalidasManualesSDT_Producto_Cumunidad()) )
         {
            ((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)).setgxTv_SdtSalidasManualesSDT_Producto_Cumunidad( (byte)(GXutil.lval( cmbavCtlcumunidad.getValidValue(GXutil.trim( GXutil.str( ((app.SdtSalidasManualesSDT_Producto)AV5SalidasManualesSDT.getgxTv_SdtSalidasManualesSDT_Productos().elementAt(-1+AV17GXV3)).getgxTv_SdtSalidasManualesSDT_Producto_Cumunidad(), 1, 0))))) );
         }
      }
      /* End function init_web_controls */
   }

   public void validv_Gxv4( )
   {
      if ( (GXutil.strcmp("", hV18GXV4)==0) )
      {
         GXV4 = "" ;
      }
      else
      {
         A13747PrdCDsc = hV18GXV4 ;
         /* Using cursor H01535 */
         pr_default.execute(3, new Object[] {A13747PrdCDsc});
         GXV4 = H01535_A719PrdNum[0] ;
         if ( ! ( (pr_default.getStatus(3) == 101) ) )
         {
            pr_default.readNext(3);
            if ( ! ( (pr_default.getStatus(3) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Producto", "")}), 1, "vGXV4");
               GX_FocusControl = edtavCtlprdnum_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(3);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV18GXV4", hV18GXV4);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "GXV4", GXutil.rtrim( GXV4));
      httpContext.ajax_rsp_assign_attri("", false, "hV18GXV4", hV18GXV4);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'AV5SalidasManualesSDT',fld:'vSALIDASMANUALESSDT',pic:''},{av:'nRC_GXsfl_16',ctrl:'GRID1',prop:'GridRC',grid:16},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'INSERTAR LINEA'","{handler:'e111532',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'AV5SalidasManualesSDT',fld:'vSALIDASMANUALESSDT',pic:''},{av:'nRC_GXsfl_16',ctrl:'GRID1',prop:'GridRC',grid:16},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'AV11Prdnum',fld:'vPRDNUM',pic:''},{av:'A685PrdCanRes',fld:'PRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV6Producto',fld:'vPRODUCTO',pic:''},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'}]");
      setEventMetadata("'INSERTAR LINEA'",",oparms:[{av:'AV6Producto',fld:'vPRODUCTO',pic:''},{av:'AV11Prdnum',fld:'vPRDNUM',pic:''},{av:'AV5SalidasManualesSDT',fld:'vSALIDASMANUALESSDT',pic:''},{av:'GRID1_nFirstRecordOnPage'},{av:'nRC_GXsfl_16',ctrl:'GRID1',prop:'GridRC',grid:16}]}");
      setEventMetadata("'SALIR'","{handler:'e121532',iparms:[]");
      setEventMetadata("'SALIR'",",oparms:[]}");
      setEventMetadata("VALIDV_GXV4","{handler:'validv_Gxv4',iparms:[{av:'hV18GXV4'},{av:'GXV4',fld:'CTLPRDNUM',pic:''}]");
      setEventMetadata("VALIDV_GXV4",",oparms:[{av:'GXV4',fld:'CTLPRDNUM',pic:''},{av:'hV18GXV4'}]}");
      setEventMetadata("NULL","{handler:'validv_Gxv11',iparms:[]");
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
      AV5SalidasManualesSDT = new app.SdtSalidasManualesSDT(remoteHandle, context);
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A13747PrdCDsc = "" ;
      hV18GXV4 = "" ;
      AV7Emprcod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      AV11Prdnum = "" ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      AV6Producto = new app.SdtSalidasManualesSDT_Producto(remoteHandle, context);
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      TempTags = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttButton2_Jsonclick = "" ;
      bttButton4_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13747PrdCDsc = "" ;
      H01532_A13747PrdCDsc = new String[] {""} ;
      H01533_A13747PrdCDsc = new String[] {""} ;
      H01533_A396EmprCod = new String[] {""} ;
      H01533_A719PrdNum = new String[] {""} ;
      AV10Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV8EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV9UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV12WebSession = httpContext.getWebSession();
      H01534_A719PrdNum = new String[] {""} ;
      H01534_A396EmprCod = new String[] {""} ;
      H01534_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01534_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01534_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      H01535_A13747PrdCDsc = new String[] {""} ;
      H01535_A396EmprCod = new String[] {""} ;
      H01535_A719PrdNum = new String[] {""} ;
      ZV18GXV4 = "" ;
      ZhV18GXV4 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.salidasmanuales__default(),
         new Object[] {
             new Object[] {
            H01532_A13747PrdCDsc
            }
            , new Object[] {
            H01533_A13747PrdCDsc, H01533_A396EmprCod, H01533_A719PrdNum
            }
            , new Object[] {
            H01534_A719PrdNum, H01534_A396EmprCod, H01534_A685PrdCanRes, H01534_A704PrdExiAlm, H01534_A707PrdFacCon
            }
            , new Object[] {
            H01535_A13747PrdCDsc, H01535_A396EmprCod, H01535_A719PrdNum
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
   private byte subGrid1_Backcolorstyle ;
   private byte GRID1_nEOF ;
   private byte AV26GXLvl22 ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private int AV17GXV3 ;
   private int nRC_GXsfl_16 ;
   private int nGXsfl_16_idx=1 ;
   private int edtavCtlcumconfec_Enabled ;
   private int edtavCtlccocod_Enabled ;
   private int gxdynajaxindex ;
   private int subGrid1_Islastpage ;
   private int nGXsfl_16_fel_idx=1 ;
   private int nGXsfl_16_bak_idx=1 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavCtlprdnum_Enabled ;
   private int edtavCtlprdnum_Visible ;
   private int edtavCtlprdfaccon_Enabled ;
   private int edtavCtlprdfaccon_Visible ;
   private int edtavCtlprdexialm_Enabled ;
   private int edtavCtlprdexialm_Visible ;
   private int edtavCtlprdcanres_Enabled ;
   private int edtavCtlprdcanres_Visible ;
   private int edtavCtlcumconcant_Enabled ;
   private int edtavCtlcumconcant_Visible ;
   private int edtavCtlcumconlot_Enabled ;
   private int edtavCtlcumconlot_Visible ;
   private int edtavCtlultfecccs_Enabled ;
   private int edtavCtlultfecccs_Visible ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A707PrdFacCon ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_16_idx="0001" ;
   private String AV7Emprcod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV11Prdnum ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String edtavCtlcumconfec_Internalname ;
   private String TempTags ;
   private String edtavCtlcumconfec_Jsonclick ;
   private String edtavCtlccocod_Internalname ;
   private String edtavCtlccocod_Jsonclick ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttButton2_Internalname ;
   private String bttButton2_Jsonclick ;
   private String bttButton4_Internalname ;
   private String bttButton4_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavCtlprdnum_Internalname ;
   private String GXCCtl ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String sGXsfl_16_fel_idx="0001" ;
   private String AV10Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV8EmprNom ;
   private String GXv_char3[] ;
   private String AV9UsurCod ;
   private String GXv_char4[] ;
   private String edtavCtlprdfaccon_Internalname ;
   private String edtavCtlprdexialm_Internalname ;
   private String edtavCtlprdcanres_Internalname ;
   private String edtavCtlcumconcant_Internalname ;
   private String edtavCtlcumconlot_Internalname ;
   private String edtavCtlultfecccs_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavCtlprdnum_Jsonclick ;
   private String edtavCtlprdfaccon_Jsonclick ;
   private String edtavCtlprdexialm_Jsonclick ;
   private String edtavCtlprdcanres_Jsonclick ;
   private String edtavCtlcumconcant_Jsonclick ;
   private String edtavCtlcumconlot_Jsonclick ;
   private String edtavCtlultfecccs_Jsonclick ;
   private String subGrid1_Header ;
   private String GXV4="" ;
   private String ZV18GXV4 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_16_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV16 ;
   private String A13747PrdCDsc ;
   private String hV18GXV4 ;
   private String l13747PrdCDsc ;
   private String ZhV18GXV4 ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private HTMLChoice cmbavCtlcumunidad ;
   private IDataStoreProvider pr_default ;
   private String[] H01532_A13747PrdCDsc ;
   private String[] H01533_A13747PrdCDsc ;
   private String[] H01533_A396EmprCod ;
   private String[] H01533_A719PrdNum ;
   private String[] H01534_A719PrdNum ;
   private String[] H01534_A396EmprCod ;
   private java.math.BigDecimal[] H01534_A685PrdCanRes ;
   private java.math.BigDecimal[] H01534_A704PrdExiAlm ;
   private java.math.BigDecimal[] H01534_A707PrdFacCon ;
   private String[] H01535_A13747PrdCDsc ;
   private String[] H01535_A396EmprCod ;
   private String[] H01535_A719PrdNum ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.WebSession AV12WebSession ;
   private app.SdtSalidasManualesSDT AV5SalidasManualesSDT ;
   private app.SdtSalidasManualesSDT_Producto AV6Producto ;
}

final  class salidasmanuales__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01532", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc FROM TXPPRODUC WHERE UPPER(RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom))) like '%' || UPPER(?) ORDER BY PrdCDsc) WHERE rownum <= 50 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01533", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01534", "SELECT PrdNum, EmprCod, PrdCanRes, PrdExiAlm, PrdFacCon FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01535", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
      }
   }

}

