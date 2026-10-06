package app.balance ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wpexpauto2_impl extends GXDataArea
{
   public wpexpauto2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wpexpauto2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpexpauto2_impl.class ));
   }

   public wpexpauto2_impl( int remoteHandle ,
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
      nRC_GXsfl_63 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_63"))) ;
      nGXsfl_63_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_63_idx"))) ;
      sGXsfl_63_idx = httpContext.GetPar( "sGXsfl_63_idx") ;
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
      subGrid1_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid1_Rows"))) ;
      AV15BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV5EmprCod = httpContext.GetPar( "EmprCod") ;
      AV144MaqNom = httpContext.GetPar( "MaqNom") ;
      AV47Device_id = httpContext.GetPar( "Device_id") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid1_refresh( subGrid1_Rows, AV15BarCod, AV5EmprCod, AV144MaqNom, AV47Device_id) ;
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
      pa2ED2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2ED2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/Balance.UCBalanceRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/WWP_IconButtonRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/WWP_IconButtonRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"false\"" : "") ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.balance.wpexpauto2", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV144MaqNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVICE_ID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Device_id, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCOD", GXutil.ltrim( localUtil.ntoc( AV15BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_63", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_63, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOPECOD_DATA", AV160OpeCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOPECOD_DATA", AV160OpeCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV45DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV45DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCOD_DATA", AV138MaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCOD_DATA", AV138MaqCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRID1PAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV352Grid1PageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "LECMAQCOD", GXutil.rtrim( A1166LecMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQNOM", GXutil.rtrim( AV144MaqNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV144MaqNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "LECBARCOD", GXutil.ltrim( localUtil.ntoc( A1167LecBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LECBARPAR", GXutil.rtrim( A1169LecBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "LECBARREO", GXutil.ltrim( localUtil.ntoc( A1168LecBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LECFASORD", GXutil.ltrim( localUtil.ntoc( A1188LecFasOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LECFASCOD", GXutil.rtrim( A1171LecFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "LECOPECOD", GXutil.ltrim( localUtil.ntoc( A1170LecOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LECPARCOD", GXutil.ltrim( localUtil.ntoc( A1172LecParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OPECOD", GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OPENOM", GXutil.rtrim( A653OpeNom));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD", GXutil.rtrim( A457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC", GXutil.rtrim( A460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "FASACTTIN", GXutil.rtrim( A456FasActTin));
      app.GxWebStd.gx_hidden_field( httpContext, "PARCOD", GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARCODNOM", GXutil.rtrim( A867ParCodNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVICE_ID", AV47Device_id);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVICE_ID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Device_id, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTITLE", AV185Title);
      app.GxWebStd.gx_hidden_field( httpContext, "vLOG", AV133Log);
      app.GxWebStd.gx_hidden_field( httpContext, "vDATAHORACAPTURA", AV44DataHoraCaptura);
      app.GxWebStd.gx_hidden_field( httpContext, "vRAWCAPTURADO", AV172RawCapturado);
      app.GxWebStd.gx_hidden_field( httpContext, "vUNIDADECAPTURADA", AV188UnidadeCapturada);
      app.GxWebStd.gx_hidden_field( httpContext, "vPESOCAPTURADO", AV167PesoCapturado);
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Selectedpage", GXutil.rtrim( Grid1paginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Grid1paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BALANCE_Stopped_weight", GXutil.rtrim( Balance_Stopped_weight));
      app.GxWebStd.gx_hidden_field( httpContext, "BALANCE_Stopped_unit", GXutil.rtrim( Balance_Stopped_unit));
      app.GxWebStd.gx_hidden_field( httpContext, "BALANCE_Stopped_raw", GXutil.rtrim( Balance_Stopped_raw));
      app.GxWebStd.gx_hidden_field( httpContext, "BALANCE_Stopped_timestamp", GXutil.rtrim( Balance_Stopped_timestamp));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_maqcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OPECOD_Selectedvalue_get", GXutil.rtrim( Combo_opecod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Selectedpage", GXutil.rtrim( Grid1paginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Grid1paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_maqcod_Selectedvalue_get));
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
         we2ED2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2ED2( ) ;
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
      return formatLink("app.balance.wpexpauto2", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Balance.WPExpAuto2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "HDR - Expediciones automáticas v.01", "") ;
   }

   public void wb2ED0( )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divMaincontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-8", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divContentleft_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHeadercontent_Internalname, 1, 0, "px", 0, "px", "TableHeaderContentExp", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheaderinput_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Operario", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "AttributeTitleWWP", 0, "", 1, 1, 0, (short)(0), "HLP_Balance\\WPExpAuto2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ExtendedComboCell", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_opecod.setProperty("Caption", Combo_opecod_Caption);
         ucCombo_opecod.setProperty("Cls", Combo_opecod_Cls);
         ucCombo_opecod.setProperty("DropDownOptionsData", AV160OpeCod_Data);
         ucCombo_opecod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_opecod_Internalname, "COMBO_OPECODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "AttributeTitleWWP", 0, "", 1, 1, 0, (short)(0), "HLP_Balance\\WPExpAuto2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ExtendedComboCell", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_maqcod.setProperty("Caption", Combo_maqcod_Caption);
         ucCombo_maqcod.setProperty("Cls", Combo_maqcod_Cls);
         ucCombo_maqcod.setProperty("DropDownOptionsTitleSettingsIcons", AV45DDO_TitleSettingsIcons);
         ucCombo_maqcod.setProperty("DropDownOptionsData", AV138MaqCod_Data);
         ucCombo_maqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcod_Internalname, "COMBO_MAQCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Bar Cod", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV15BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV15BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV15BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "Codigo Barcada", ""), edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Balance\\WPExpAuto2.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divErrorcontent_Internalname, 1, 0, "px", 0, "px", "TableHeaderContentError", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
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
         app.GxWebStd.gx_div_start( httpContext, divTabledatalist_Internalname, 1, 0, "px", 0, "px", "TableHeaderContentList", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGrid1tablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         startgridcontrol63( ) ;
      }
      if ( wbEnd == 63 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_63 = (int)(nGXsfl_63_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
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
         /* User Defined Control */
         ucGrid1paginationbar.setProperty("Class", Grid1paginationbar_Class);
         ucGrid1paginationbar.setProperty("ShowFirst", Grid1paginationbar_Showfirst);
         ucGrid1paginationbar.setProperty("ShowPrevious", Grid1paginationbar_Showprevious);
         ucGrid1paginationbar.setProperty("ShowNext", Grid1paginationbar_Shownext);
         ucGrid1paginationbar.setProperty("ShowLast", Grid1paginationbar_Showlast);
         ucGrid1paginationbar.setProperty("PagesToShow", Grid1paginationbar_Pagestoshow);
         ucGrid1paginationbar.setProperty("PagingButtonsPosition", Grid1paginationbar_Pagingbuttonsposition);
         ucGrid1paginationbar.setProperty("PagingCaptionPosition", Grid1paginationbar_Pagingcaptionposition);
         ucGrid1paginationbar.setProperty("EmptyGridClass", Grid1paginationbar_Emptygridclass);
         ucGrid1paginationbar.setProperty("RowsPerPageSelector", Grid1paginationbar_Rowsperpageselector);
         ucGrid1paginationbar.setProperty("RowsPerPageOptions", Grid1paginationbar_Rowsperpageoptions);
         ucGrid1paginationbar.setProperty("Previous", Grid1paginationbar_Previous);
         ucGrid1paginationbar.setProperty("Next", Grid1paginationbar_Next);
         ucGrid1paginationbar.setProperty("Caption", Grid1paginationbar_Caption);
         ucGrid1paginationbar.setProperty("EmptyGridCaption", Grid1paginationbar_Emptygridcaption);
         ucGrid1paginationbar.setProperty("RowsPerPageCaption", Grid1paginationbar_Rowsperpagecaption);
         ucGrid1paginationbar.setProperty("CurrentPage", AV351Grid1CurrentPage);
         ucGrid1paginationbar.setProperty("PageCount", AV352Grid1PageCount);
         ucGrid1paginationbar.render(context, "dvelop.dvpaginationbar", Grid1paginationbar_Internalname, "GRID1PAGINATIONBARContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divContentwidget_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucBalance.setProperty("title", Balance_Title);
         ucBalance.render(context, "balance.ucbalance", Balance_Internalname, "BALANCEContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divActionbarwidget_Internalname, 1, 0, "px", 0, "px", "TableHeaderContentError", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divContentwidgetcenter_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;justify-content:space-between;align-items:flex-start;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;align-self:center;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbwidgetvalue_Internalname, lblTbwidgetvalue_Caption, "", "", lblTbwidgetvalue_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "HTMLClass", 0, "", 1, 1, 0, (short)(1), "HLP_Balance\\WPExpAuto2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;align-self:center;", "div");
         /* User Defined Control */
         ucBtnwidget.setProperty("BeforeIconClass", Btnwidget_Beforeiconclass);
         ucBtnwidget.setProperty("Caption", Btnwidget_Caption);
         ucBtnwidget.setProperty("Class", Btnwidget_Class);
         ucBtnwidget.render(context, "wwp_iconbutton", Btnwidget_Internalname, "BTNWIDGETContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divTableinformation_Internalname, 1, 0, "px", 0, "px", "TableInformatioEXP", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_96_2ED2( true) ;
      }
      else
      {
         wb_table1_96_2ED2( false) ;
      }
      return  ;
   }

   public void wb_table1_96_2ED2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLecnom_Internalname, httpContext.getMessage( "Lec Nom", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecnom_Internalname, AV104LecNom, GXutil.rtrim( localUtil.format( AV104LecNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLecnom_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Balance\\WPExpAuto2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLecfasnom_Internalname, httpContext.getMessage( "Lec Fas Nom", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecfasnom_Internalname, AV96LecFasNom, GXutil.rtrim( localUtil.format( AV96LecFasNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecfasnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLecfasnom_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Balance\\WPExpAuto2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLecparnom_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecparnom_Internalname, GXutil.rtrim( AV108LecParNom), GXutil.rtrim( localUtil.format( AV108LecParNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,112);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecparnom_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavLecparnom_Visible, edtavLecparnom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Balance\\WPExpAuto2.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLecbarcod_Internalname, httpContext.getMessage( "Hoja de Ruta", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecbarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV89LecBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLecbarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV89LecBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV89LecBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecbarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLecbarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Balance\\WPExpAuto2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLecbarreo_Internalname, httpContext.getMessage( "Reoperado", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecbarreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV93LecBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLecbarreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV93LecBarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV93LecBarReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,122);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecbarreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLecbarreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Balance\\WPExpAuto2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLecbarpar_Internalname, httpContext.getMessage( "Partición", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecbarpar_Internalname, GXutil.rtrim( AV91LecBarPar), GXutil.rtrim( localUtil.format( AV91LecBarPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,125);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecbarpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLecbarpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Balance\\WPExpAuto2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablestatusmaquina_Internalname, 1, 0, "px", 0, "px", "CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Right", "top", "", "", "div");
         /* User Defined Control */
         ucBtnvisualizar.setProperty("BeforeIconClass", Btnvisualizar_Beforeiconclass);
         ucBtnvisualizar.setProperty("Caption", Btnvisualizar_Caption);
         ucBtnvisualizar.setProperty("Class", Btnvisualizar_Class);
         ucBtnvisualizar.render(context, "wwp_iconbutton", Btnvisualizar_Internalname, "BTNVISUALIZARContainer");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV355Pgmname), GXutil.rtrim( localUtil.format( AV355Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Balance\\WPExpAuto2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOpecod_Internalname, GXutil.ltrim( localUtil.ntoc( AV159OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV159OpeCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOpecod_Jsonclick, 0, "Attribute", "", "", "", "", edtavOpecod_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Balance\\WPExpAuto2.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 142,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod_Internalname, GXutil.rtrim( AV137MaqCod), GXutil.rtrim( localUtil.format( AV137MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,142);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavMaqcod_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Balance\\WPExpAuto2.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGrid1currentpage_Internalname, GXutil.ltrim( localUtil.ntoc( AV351Grid1CurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV351Grid1CurrentPage), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,143);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGrid1currentpage_Jsonclick, 0, "Attribute", "", "", "", "", edtavGrid1currentpage_Visible, 1, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Balance\\WPExpAuto2.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavVdesestado_Internalname, GXutil.rtrim( AV190vDesEstado), GXutil.rtrim( localUtil.format( AV190vDesEstado, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavVdesestado_Jsonclick, 0, "Attribute", "", "", "", "", edtavVdesestado_Visible, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Balance\\WPExpAuto2.htm");
         /* User Defined Control */
         ucGrid1_empowerer.render(context, "wwp.gridempowerer", Grid1_empowerer_Internalname, "GRID1_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 63 )
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

   public void start2ED2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "HDR - Expediciones automáticas v.01", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2ED0( ) ;
   }

   public void ws2ED2( )
   {
      start2ED2( ) ;
      evt2ED2( ) ;
   }

   public void evt2ED2( )
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
                        else if ( GXutil.strcmp(sEvt, "COMBO_MAQCOD.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e112ED2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122ED2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132ED2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_63_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_632( ) ;
                           A2809MetTerCod = httpContext.cgiGet( edtMetTerCod_Internalname) ;
                           AV282MetPieCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavMetpiecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMetpiecod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV282MetPieCod), 4, 0));
                           A2813MetPieCod = httpContext.cgiGet( edtMetPieCod_Internalname) ;
                           A2814MetPieKil = localUtil.ctond( httpContext.cgiGet( edtMetPieKil_Internalname)) ;
                           A2815MetPieMet = localUtil.ctond( httpContext.cgiGet( edtMetPieMet_Internalname)) ;
                           A6635MetPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4910MetPieMtD = localUtil.ctond( httpContext.cgiGet( edtMetPieMtD_Internalname)) ;
                           A2816MetPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtMetPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4917MetPieObs = httpContext.cgiGet( edtMetPieObs_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e142ED2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e152ED2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e162ED2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Barcod Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV15BarCod )
                                    {
                                       Rfr0gs = true ;
                                    }
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

   public void we2ED2( )
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

   public void pa2ED2( )
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
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_632( ) ;
      while ( nGXsfl_63_idx <= nRC_GXsfl_63 )
      {
         sendrow_632( ) ;
         nGXsfl_63_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_63_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_63_idx+1) ;
         sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_632( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  int AV15BarCod ,
                                  String AV5EmprCod ,
                                  String AV144MaqNom ,
                                  String AV47Device_id )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e152ED2 ();
      GRID1_nCurrentRecord = 0 ;
      rf2ED2( ) ;
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
      rf2ED2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV355Pgmname = "Balance.WPExpAuto2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV355Pgmname", AV355Pgmname);
      Gx_err = (short)(0) ;
      edtavMetpiecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMetpiecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMetpiecod_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavLecmaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecmaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecmaqcod_Enabled), 5, 0), true);
      edtavLecmaqnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecmaqnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecmaqnom_Enabled), 5, 0), true);
      edtavLecnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecnom_Enabled), 5, 0), true);
      edtavLecfasnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecfasnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecfasnom_Enabled), 5, 0), true);
      edtavLecparnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecparnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecparnom_Enabled), 5, 0), true);
      edtavLecbarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecbarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecbarcod_Enabled), 5, 0), true);
      edtavLecbarreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecbarreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecbarreo_Enabled), 5, 0), true);
      edtavLecbarpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecbarpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecbarpar_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2ED2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(63) ;
      /* Execute user event: Refresh */
      e152ED2 ();
      nGXsfl_63_idx = 1 ;
      sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_632( ) ;
      bGXsfl_63_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_632( ) ;
         GXPagingFrom2 = (int)(((subGrid1_Rows==0) ? 1 : GRID1_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid1_Rows==0) ? 10000 : GRID1_nFirstRecordOnPage+subgrid1_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Integer.valueOf(AV15BarCod) ,
                                              Integer.valueOf(A129BarCod) } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT
                                              }
         });
         /* Using cursor H02ED2 */
         pr_default.execute(0, new Object[] {Integer.valueOf(AV15BarCod), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_63_idx = 1 ;
         sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_632( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid1_Rows == 0 ) || ( GRID1_nCurrentRecord < subgrid1_fnc_recordsperpage( ) ) ) ) )
         {
            A129BarCod = H02ED2_A129BarCod[0] ;
            A4917MetPieObs = H02ED2_A4917MetPieObs[0] ;
            A2816MetPieEst = H02ED2_A2816MetPieEst[0] ;
            A4910MetPieMtD = H02ED2_A4910MetPieMtD[0] ;
            A6635MetPieAnc = H02ED2_A6635MetPieAnc[0] ;
            A2815MetPieMet = H02ED2_A2815MetPieMet[0] ;
            A2814MetPieKil = H02ED2_A2814MetPieKil[0] ;
            A2813MetPieCod = H02ED2_A2813MetPieCod[0] ;
            A2809MetTerCod = H02ED2_A2809MetTerCod[0] ;
            e162ED2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(63) ;
         wb2ED0( ) ;
      }
      bGXsfl_63_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2ED2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQNOM", GXutil.rtrim( AV144MaqNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV144MaqNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVICE_ID", AV47Device_id);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVICE_ID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Device_id, ""))));
   }

   public int subgrid1_fnc_pagecount( )
   {
      GRID1_nRecordCount = subgrid1_fnc_recordcount( ) ;
      if ( ((int)((GRID1_nRecordCount) % (subgrid1_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_fnc_recordsperpage( )))+1) ;
   }

   public int subgrid1_fnc_recordcount( )
   {
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV15BarCod) ,
                                           Integer.valueOf(A129BarCod) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT
                                           }
      });
      /* Using cursor H02ED3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV15BarCod)});
      GRID1_nRecordCount = H02ED3_AGRID1_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID1_nRecordCount) ;
   }

   public int subgrid1_fnc_recordsperpage( )
   {
      if ( subGrid1_Rows > 0 )
      {
         return subGrid1_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid1_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRID1_nFirstRecordOnPage/ (double) (subgrid1_fnc_recordsperpage( )))+1) ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV15BarCod, AV5EmprCod, AV144MaqNom, AV47Device_id) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      GRID1_nRecordCount = subgrid1_fnc_recordcount( ) ;
      if ( ( GRID1_nRecordCount >= subgrid1_fnc_recordsperpage( ) ) && ( GRID1_nEOF == 0 ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV15BarCod, AV5EmprCod, AV144MaqNom, AV47Device_id) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID1_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid1_previouspage( )
   {
      if ( GRID1_nFirstRecordOnPage >= subgrid1_fnc_recordsperpage( ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage-subgrid1_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV15BarCod, AV5EmprCod, AV144MaqNom, AV47Device_id) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      GRID1_nRecordCount = subgrid1_fnc_recordcount( ) ;
      if ( GRID1_nRecordCount > subgrid1_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRID1_nRecordCount) % (subgrid1_fnc_recordsperpage( )))) == 0 )
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-subgrid1_fnc_recordsperpage( )) ;
         }
         else
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-((int)((GRID1_nRecordCount) % (subgrid1_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV15BarCod, AV5EmprCod, AV144MaqNom, AV47Device_id) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid1_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV15BarCod, AV5EmprCod, AV144MaqNom, AV47Device_id) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV355Pgmname = "Balance.WPExpAuto2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV355Pgmname", AV355Pgmname);
      Gx_err = (short)(0) ;
      edtavMetpiecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMetpiecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMetpiecod_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavLecmaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecmaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecmaqcod_Enabled), 5, 0), true);
      edtavLecmaqnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecmaqnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecmaqnom_Enabled), 5, 0), true);
      edtavLecnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecnom_Enabled), 5, 0), true);
      edtavLecfasnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecfasnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecfasnom_Enabled), 5, 0), true);
      edtavLecparnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecparnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecparnom_Enabled), 5, 0), true);
      edtavLecbarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecbarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecbarcod_Enabled), 5, 0), true);
      edtavLecbarreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecbarreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecbarreo_Enabled), 5, 0), true);
      edtavLecbarpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecbarpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecbarpar_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2ED0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e142ED2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vOPECOD_DATA"), AV160OpeCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV45DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCOD_DATA"), AV138MaqCod_Data);
         /* Read saved values. */
         nRC_GXsfl_63 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_63"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV352Grid1PageCount = localUtil.ctol( httpContext.cgiGet( "vGRID1PAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV133Log = httpContext.cgiGet( "vLOG") ;
         AV44DataHoraCaptura = httpContext.cgiGet( "vDATAHORACAPTURA") ;
         AV172RawCapturado = httpContext.cgiGet( "vRAWCAPTURADO") ;
         AV188UnidadeCapturada = httpContext.cgiGet( "vUNIDADECAPTURADA") ;
         AV167PesoCapturado = httpContext.cgiGet( "vPESOCAPTURADO") ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
         Grid1paginationbar_Selectedpage = httpContext.cgiGet( "GRID1PAGINATIONBAR_Selectedpage") ;
         Grid1paginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1PAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Combo_maqcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_MAQCOD_Selectedvalue_get") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOD");
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarCod), 8, 0));
         }
         else
         {
            AV15BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarCod), 8, 0));
         }
         AV100LecMaqCod = httpContext.cgiGet( edtavLecmaqcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV100LecMaqCod", AV100LecMaqCod);
         AV102LecMaqNom = httpContext.cgiGet( edtavLecmaqnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV102LecMaqNom", AV102LecMaqNom);
         AV104LecNom = httpContext.cgiGet( edtavLecnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV104LecNom", AV104LecNom);
         AV96LecFasNom = httpContext.cgiGet( edtavLecfasnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV96LecFasNom", AV96LecFasNom);
         AV108LecParNom = httpContext.cgiGet( edtavLecparnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV108LecParNom", AV108LecParNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavLecbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavLecbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLECBARCOD");
            GX_FocusControl = edtavLecbarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV89LecBarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89LecBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89LecBarCod), 8, 0));
         }
         else
         {
            AV89LecBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavLecbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89LecBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89LecBarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavLecbarreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavLecbarreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLECBARREO");
            GX_FocusControl = edtavLecbarreo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV93LecBarReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93LecBarReo", GXutil.str( AV93LecBarReo, 1, 0));
         }
         else
         {
            AV93LecBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavLecbarreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93LecBarReo", GXutil.str( AV93LecBarReo, 1, 0));
         }
         AV91LecBarPar = httpContext.cgiGet( edtavLecbarpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV91LecBarPar", AV91LecBarPar);
         AV355Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV355Pgmname", AV355Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavOpecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavOpecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOPECOD");
            GX_FocusControl = edtavOpecod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV159OpeCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV159OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV159OpeCod), 6, 0));
         }
         else
         {
            AV159OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavOpecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV159OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV159OpeCod), 6, 0));
         }
         AV137MaqCod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV137MaqCod", AV137MaqCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGrid1currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGrid1currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRID1CURRENTPAGE");
            GX_FocusControl = edtavGrid1currentpage_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV351Grid1CurrentPage = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV351Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV351Grid1CurrentPage), 10, 0));
         }
         else
         {
            AV351Grid1CurrentPage = localUtil.ctol( httpContext.cgiGet( edtavGrid1currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV351Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV351Grid1CurrentPage), 10, 0));
         }
         AV190vDesEstado = httpContext.cgiGet( edtavVdesestado_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV190vDesEstado", AV190vDesEstado);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV15BarCod )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e142ED2 ();
      if (returnInSub) return;
   }

   public void e142ED2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wpexpauto2_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Station = GXt_char1 ;
      GXv_char2[0] = AV5EmprCod ;
      GXv_char3[0] = AV6EmprNom ;
      GXv_char4[0] = AV349UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char2, GXv_char3, GXv_char4) ;
      wpexpauto2_impl.this.AV5EmprCod = GXv_char2[0] ;
      wpexpauto2_impl.this.AV6EmprNom = GXv_char3[0] ;
      wpexpauto2_impl.this.AV349UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5EmprCod, "@!"))));
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV45DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV45DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      edtavMaqcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Visible), 5, 0), true);
      edtavOpecod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOpecod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpecod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOOPECOD' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOMAQCOD' */
      S122 ();
      if (returnInSub) return;
      edtavVdesestado_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVdesestado_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVdesestado_Visible), 5, 0), true);
      Grid1_empowerer_Gridinternalname = subGrid1_Internalname ;
      ucGrid1_empowerer.sendProperty(context, "", false, Grid1_empowerer_Internalname, "GridInternalName", Grid1_empowerer_Gridinternalname);
      subGrid1_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      AV351Grid1CurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV351Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV351Grid1CurrentPage), 10, 0));
      edtavGrid1currentpage_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid1currentpage_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid1currentpage_Visible), 5, 0), true);
      AV352Grid1PageCount = -1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV352Grid1PageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV352Grid1PageCount), 10, 0));
      Grid1paginationbar_Rowsperpageselectedvalue = subGrid1_Rows ;
      ucGrid1paginationbar.sendProperty(context, "", false, Grid1paginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Grid1paginationbar_Rowsperpageselectedvalue), 9, 0));
      /* Execute user subroutine: 'INITPARAMETERS' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INITBALANCE' */
      S142 ();
      if (returnInSub) return;
      Btnvisualizar_Visible = false ;
      ucBtnvisualizar.sendProperty(context, "", false, Btnvisualizar_Internalname, "Visible", GXutil.booltostr( Btnvisualizar_Visible));
      edtavLecparnom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecparnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecparnom_Visible), 5, 0), true);
   }

   public void e152ED2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
   }

   private void e162ED2( )
   {
      /* Grid1_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(63) ;
      }
      sendrow_632( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_63_Refreshing )
      {
         httpContext.doAjaxLoad(63, Grid1Row);
      }
   }

   public void e122ED2( )
   {
      /* Grid1paginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Grid1paginationbar_Selectedpage, "Previous") == 0 )
      {
         AV351Grid1CurrentPage = (long)(AV351Grid1CurrentPage-1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV351Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV351Grid1CurrentPage), 10, 0));
         subgrid1_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Grid1paginationbar_Selectedpage, "Next") == 0 )
      {
         AV351Grid1CurrentPage = (long)(AV351Grid1CurrentPage+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV351Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV351Grid1CurrentPage), 10, 0));
         subgrid1_nextpage( ) ;
      }
      else
      {
         AV350PageToGo = (int)(GXutil.lval( Grid1paginationbar_Selectedpage)) ;
         AV351Grid1CurrentPage = AV350PageToGo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV351Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV351Grid1CurrentPage), 10, 0));
         subgrid1_gotopage( AV350PageToGo) ;
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e132ED2( )
   {
      /* Grid1paginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid1_Rows = Grid1paginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      AV351Grid1CurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV351Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV351Grid1CurrentPage), 10, 0));
      subgrid1_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e112ED2( )
   {
      /* Combo_maqcod_Onoptionclicked Routine */
      returnInSub = false ;
      AV137MaqCod = Combo_maqcod_Selectedvalue_get ;
      httpContext.ajax_rsp_assign_attri("", false, "AV137MaqCod", AV137MaqCod);
      /* Execute user subroutine: 'LECTOR' */
      S152 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", AV190vDesEstado)==0) )
      {
         Btnvisualizar_Visible = true ;
         ucBtnvisualizar.sendProperty(context, "", false, Btnvisualizar_Internalname, "Visible", GXutil.booltostr( Btnvisualizar_Visible));
      }
      if ( GXutil.strcmp(AV190vDesEstado, "EN PROCESO") == 0 )
      {
         Btnvisualizar_Class = "btn btn-warning" ;
         ucBtnvisualizar.sendProperty(context, "", false, Btnvisualizar_Internalname, "Class", Btnvisualizar_Class);
         Btnvisualizar_Beforeiconclass = "fas fa-spinner" ;
         ucBtnvisualizar.sendProperty(context, "", false, Btnvisualizar_Internalname, "BeforeIconClass", Btnvisualizar_Beforeiconclass);
         Btnvisualizar_Caption = AV190vDesEstado ;
         ucBtnvisualizar.sendProperty(context, "", false, Btnvisualizar_Internalname, "Caption", Btnvisualizar_Caption);
      }
      else if ( GXutil.strcmp(AV190vDesEstado, "FINALIZADA") == 0 )
      {
         Btnvisualizar_Class = "btn btn-success" ;
         ucBtnvisualizar.sendProperty(context, "", false, Btnvisualizar_Internalname, "Class", Btnvisualizar_Class);
         Btnvisualizar_Beforeiconclass = "fas fa-exclamation-triangle" ;
         ucBtnvisualizar.sendProperty(context, "", false, Btnvisualizar_Internalname, "BeforeIconClass", Btnvisualizar_Beforeiconclass);
         Btnvisualizar_Caption = AV190vDesEstado ;
         ucBtnvisualizar.sendProperty(context, "", false, Btnvisualizar_Internalname, "Caption", Btnvisualizar_Caption);
      }
      else
      {
         Btnvisualizar_Visible = false ;
         ucBtnvisualizar.sendProperty(context, "", false, Btnvisualizar_Internalname, "Visible", GXutil.booltostr( Btnvisualizar_Visible));
      }
      /* Execute user subroutine: 'INITBALANCE' */
      S142 ();
      if (returnInSub) return;
      AV185Title = AV102LecMaqNom ;
      httpContext.ajax_rsp_assign_attri("", false, "AV185Title", AV185Title);
      /*  Sending Event outputs  */
   }

   public void S122( )
   {
      /* 'LOADCOMBOMAQCOD' Routine */
      returnInSub = false ;
      /* Using cursor H02ED4 */
      pr_default.execute(2, new Object[] {AV5EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A607MaqEst = H02ED4_A607MaqEst[0] ;
         n607MaqEst = H02ED4_n607MaqEst[0] ;
         A396EmprCod = H02ED4_A396EmprCod[0] ;
         A606MaqDsc = H02ED4_A606MaqDsc[0] ;
         n606MaqDsc = H02ED4_n606MaqDsc[0] ;
         A620MaqTip = H02ED4_A620MaqTip[0] ;
         n620MaqTip = H02ED4_n620MaqTip[0] ;
         A602MaqCod = H02ED4_A602MaqCod[0] ;
         AV137MaqCod = A602MaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV137MaqCod", AV137MaqCod);
         AV144MaqNom = A606MaqDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV144MaqNom", AV144MaqNom);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV144MaqNom, ""))));
         AV145MaqTip = A620MaqTip ;
         AV142MaqEst = A607MaqEst ;
         AV35Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV35Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( AV137MaqCod) );
         AV35Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( AV137MaqCod+"-"+AV144MaqNom );
         AV35Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Type( AV145MaqTip );
         AV138MaqCod_Data.add(AV35Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV138MaqCod_Data.sort("Title");
      Combo_maqcod_Selectedvalue_set = AV137MaqCod ;
      ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "SelectedValue_set", Combo_maqcod_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOOPECOD' Routine */
      returnInSub = false ;
      /* Using cursor H02ED5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A8482OpeAct = H02ED5_A8482OpeAct[0] ;
         n8482OpeAct = H02ED5_n8482OpeAct[0] ;
         A13748OpeCNom = H02ED5_A13748OpeCNom[0] ;
         A652OpeCod = H02ED5_A652OpeCod[0] ;
         A653OpeNom = H02ED5_A653OpeNom[0] ;
         n653OpeNom = H02ED5_n653OpeNom[0] ;
         AV35Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV35Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A652OpeCod, 6, 0)) );
         AV35Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13748OpeCNom );
         AV160OpeCod_Data.add(AV35Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      Combo_opecod_Selectedvalue_set = ((0==AV159OpeCod) ? "" : GXutil.trim( GXutil.str( AV159OpeCod, 6, 0))) ;
      ucCombo_opecod.sendProperty(context, "", false, Combo_opecod_Internalname, "SelectedValue_set", Combo_opecod_Selectedvalue_set);
   }

   public void S162( )
   {
      /* 'LHIPRO' Routine */
      returnInSub = false ;
      AV110Lhipro = (byte)(0) ;
      /* Using cursor H02ED6 */
      pr_default.execute(4, new Object[] {AV5EmprCod, Integer.valueOf(AV14Barcada), Byte.valueOf(AV18BarCodReo), AV17BarCodPar, Short.valueOf(AV24BarOrdLin), AV137MaqCod, AV99Lecfec});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A396EmprCod = H02ED6_A396EmprCod[0] ;
         A129BarCod = H02ED6_A129BarCod[0] ;
         A132BarCodReo = H02ED6_A132BarCodReo[0] ;
         A130BarCodPar = H02ED6_A130BarCodPar[0] ;
         A194BarOrdLin = H02ED6_A194BarOrdLin[0] ;
         A602MaqCod = H02ED6_A602MaqCod[0] ;
         A558HisProFec = H02ED6_A558HisProFec[0] ;
         A656ParCod = H02ED6_A656ParCod[0] ;
         n656ParCod = H02ED6_n656ParCod[0] ;
         A561HisProLin = H02ED6_A561HisProLin[0] ;
         AV81HisProlin = A561HisProLin ;
         AV110Lhipro = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S172( )
   {
      /* 'MAQFAS' Routine */
      returnInSub = false ;
      AV143MaqFasi = (byte)(0) ;
      AV21Barfasest = (byte)(9) ;
      /* Using cursor H02ED7 */
      pr_default.execute(5, new Object[] {AV5EmprCod, Integer.valueOf(AV14Barcada), Byte.valueOf(AV18BarCodReo), AV17BarCodPar});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A457FasCod = H02ED7_A457FasCod[0] ;
         A152BarFasCon = H02ED7_A152BarFasCon[0] ;
         A153BarFasEst = H02ED7_A153BarFasEst[0] ;
         A130BarCodPar = H02ED7_A130BarCodPar[0] ;
         A132BarCodReo = H02ED7_A132BarCodReo[0] ;
         A129BarCod = H02ED7_A129BarCod[0] ;
         A396EmprCod = H02ED7_A396EmprCod[0] ;
         A460FasDsc = H02ED7_A460FasDsc[0] ;
         A6011FasTip = H02ED7_A6011FasTip[0] ;
         n6011FasTip = H02ED7_n6011FasTip[0] ;
         A7600FasH2OReh = H02ED7_A7600FasH2OReh[0] ;
         n7600FasH2OReh = H02ED7_n7600FasH2OReh[0] ;
         A194BarOrdLin = H02ED7_A194BarOrdLin[0] ;
         A758ProCod = H02ED7_A758ProCod[0] ;
         A460FasDsc = H02ED7_A460FasDsc[0] ;
         A6011FasTip = H02ED7_A6011FasTip[0] ;
         n6011FasTip = H02ED7_n6011FasTip[0] ;
         A7600FasH2OReh = H02ED7_A7600FasH2OReh[0] ;
         n7600FasH2OReh = H02ED7_n7600FasH2OReh[0] ;
         if ( ( A153BarFasEst != 2 ) && ( GXutil.strcmp(A152BarFasCon, httpContext.getMessage( "S", "")) == 0 ) )
         {
            AV61FasCodi = A457FasCod ;
            AV63FasDscmf = A460FasDsc ;
            AV66FasTip = A6011FasTip ;
            AV24BarOrdLin = A194BarOrdLin ;
            AV169Procod = A758ProCod ;
            AV87KgMt = A7600FasH2OReh ;
            AV21Barfasest = A153BarFasEst ;
            /* Using cursor H02ED8 */
            pr_default.execute(6, new Object[] {AV5EmprCod, AV137MaqCod, AV61FasCodi});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A1142MaqFCod = H02ED8_A1142MaqFCod[0] ;
               A602MaqCod = H02ED8_A602MaqCod[0] ;
               A396EmprCod = H02ED8_A396EmprCod[0] ;
               AV143MaqFasi = (byte)(1) ;
               AV62FasCodmf = A457FasCod ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(6);
            if ( AV143MaqFasi == 1 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      if ( ( AV143MaqFasi == 1 ) && ( AV76FsSgts == 1 ) )
      {
         GXv_char4[0] = AV5EmprCod ;
         GXv_int7[0] = AV14Barcada ;
         GXv_int8[0] = AV18BarCodReo ;
         GXv_char3[0] = AV17BarCodPar ;
         GXv_char2[0] = AV169Procod ;
         GXv_int9[0] = AV24BarOrdLin ;
         GXv_char10[0] = AV349UsurCod ;
         GXv_char11[0] = AV7Station ;
         new app.pfssgts(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int8, GXv_char3, GXv_char2, GXv_int9, GXv_char10, GXv_char11) ;
         wpexpauto2_impl.this.AV5EmprCod = GXv_char4[0] ;
         wpexpauto2_impl.this.AV14Barcada = GXv_int7[0] ;
         wpexpauto2_impl.this.AV18BarCodReo = GXv_int8[0] ;
         wpexpauto2_impl.this.AV17BarCodPar = GXv_char3[0] ;
         wpexpauto2_impl.this.AV169Procod = GXv_char2[0] ;
         wpexpauto2_impl.this.AV24BarOrdLin = GXv_int9[0] ;
         wpexpauto2_impl.this.AV349UsurCod = GXv_char10[0] ;
         wpexpauto2_impl.this.AV7Station = GXv_char11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5EmprCod, "@!"))));
      }
      if ( AV183Tintutex == 1 )
      {
         AV143MaqFasi = (byte)(1) ;
      }
   }

   public void S182( )
   {
      /* 'STKI' Routine */
      returnInSub = false ;
      AV78HDRs = "" ;
      AV20BarEst = (byte)(0) ;
      AV361GXLvl314 = (byte)(0) ;
      /* Using cursor H02ED9 */
      pr_default.execute(7, new Object[] {Integer.valueOf(AV48Discod)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk2ED8 = false ;
         A361DisCod = H02ED9_A361DisCod[0] ;
         A3400DisRefBCPa = H02ED9_A3400DisRefBCPa[0] ;
         A3399DisRefBCRe = H02ED9_A3399DisRefBCRe[0] ;
         A3398DisRefBarC = H02ED9_A3398DisRefBarC[0] ;
         AV361GXLvl314 = (byte)(1) ;
         AV20BarEst = (byte)(1) ;
         AV78HDRs += ((GXutil.strcmp(AV78HDRs, "")==0) ? "" : ", ") ;
         AV78HDRs += GXutil.trim( GXutil.str( A3398DisRefBarC, 10, 0)) + "-" + GXutil.trim( GXutil.str( A3399DisRefBCRe, 10, 0)) + GXutil.trim( A3400DisRefBCPa) ;
         while ( (pr_default.getStatus(7) != 101) && ( H02ED9_A3398DisRefBarC[0] == A3398DisRefBarC ) && ( H02ED9_A3399DisRefBCRe[0] == A3399DisRefBCRe ) && ( GXutil.strcmp(H02ED9_A3400DisRefBCPa[0], A3400DisRefBCPa) == 0 ) )
         {
            brk2ED8 = false ;
            A361DisCod = H02ED9_A361DisCod[0] ;
            brk2ED8 = true ;
            pr_default.readNext(7);
         }
         if ( ! brk2ED8 )
         {
            brk2ED8 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
      if ( AV361GXLvl314 == 0 )
      {
         AV78HDRs = httpContext.getMessage( "No Stki", "") ;
         AV20BarEst = (byte)(0) ;
      }
   }

   public void S152( )
   {
      /* 'LECTOR' Routine */
      returnInSub = false ;
      /* Using cursor H02ED10 */
      pr_default.execute(8, new Object[] {AV5EmprCod, AV137MaqCod});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A1172LecParCod = H02ED10_A1172LecParCod[0] ;
         n1172LecParCod = H02ED10_n1172LecParCod[0] ;
         A1171LecFasCod = H02ED10_A1171LecFasCod[0] ;
         n1171LecFasCod = H02ED10_n1171LecFasCod[0] ;
         A1170LecOpeCod = H02ED10_A1170LecOpeCod[0] ;
         n1170LecOpeCod = H02ED10_n1170LecOpeCod[0] ;
         A396EmprCod = H02ED10_A396EmprCod[0] ;
         A1166LecMaqCod = H02ED10_A1166LecMaqCod[0] ;
         A1167LecBarCod = H02ED10_A1167LecBarCod[0] ;
         n1167LecBarCod = H02ED10_n1167LecBarCod[0] ;
         A1169LecBarPar = H02ED10_A1169LecBarPar[0] ;
         n1169LecBarPar = H02ED10_n1169LecBarPar[0] ;
         A1168LecBarReo = H02ED10_A1168LecBarReo[0] ;
         n1168LecBarReo = H02ED10_n1168LecBarReo[0] ;
         A1188LecFasOrd = H02ED10_A1188LecFasOrd[0] ;
         n1188LecFasOrd = H02ED10_n1188LecFasOrd[0] ;
         AV100LecMaqCod = A1166LecMaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV100LecMaqCod", AV100LecMaqCod);
         AV102LecMaqNom = AV144MaqNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV102LecMaqNom", AV102LecMaqNom);
         AV89LecBarCod = A1167LecBarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89LecBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89LecBarCod), 8, 0));
         AV91LecBarPar = A1169LecBarPar ;
         httpContext.ajax_rsp_assign_attri("", false, "AV91LecBarPar", AV91LecBarPar);
         AV93LecBarReo = A1168LecBarReo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93LecBarReo", GXutil.str( AV93LecBarReo, 1, 0));
         AV104LecNom = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "AV104LecNom", AV104LecNom);
         AV98LecFasord = A1188LecFasOrd ;
         AV95LecFasCod = A1171LecFasCod ;
         AV106LecOpeCod = A1170LecOpeCod ;
         AV107Lecparcod = A1172LecParCod ;
         /* Using cursor H02ED11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n1170LecOpeCod), Integer.valueOf(A1170LecOpeCod)});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A652OpeCod = H02ED11_A652OpeCod[0] ;
            A653OpeNom = H02ED11_A653OpeNom[0] ;
            n653OpeNom = H02ED11_n653OpeNom[0] ;
            AV104LecNom = A653OpeNom ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104LecNom", AV104LecNom);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(9);
         AV96LecFasNom = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "AV96LecFasNom", AV96LecFasNom);
         /* Using cursor H02ED12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n1171LecFasCod), A1171LecFasCod});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A457FasCod = H02ED12_A457FasCod[0] ;
            A460FasDsc = H02ED12_A460FasDsc[0] ;
            A456FasActTin = H02ED12_A456FasActTin[0] ;
            n456FasActTin = H02ED12_n456FasActTin[0] ;
            AV96LecFasNom = A460FasDsc ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96LecFasNom", AV96LecFasNom);
            AV59FasAgr = A456FasActTin ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(10);
         AV108LecParNom = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "AV108LecParNom", AV108LecParNom);
         /* Using cursor H02ED13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n1172LecParCod), Short.valueOf(A1172LecParCod)});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A656ParCod = H02ED13_A656ParCod[0] ;
            n656ParCod = H02ED13_n656ParCod[0] ;
            A867ParCodNom = H02ED13_A867ParCodNom[0] ;
            n867ParCodNom = H02ED13_n867ParCodNom[0] ;
            AV108LecParNom = A867ParCodNom ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108LecParNom", AV108LecParNom);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(11);
         GXv_char11[0] = AV55EstFase ;
         GXv_char10[0] = AV179terminus ;
         new app.psitfas(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char11, GXv_char10) ;
         wpexpauto2_impl.this.AV55EstFase = GXv_char11[0] ;
         wpexpauto2_impl.this.AV179terminus = GXv_char10[0] ;
         AV190vDesEstado = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "AV190vDesEstado", AV190vDesEstado);
         if ( GXutil.strcmp(AV55EstFase, "I") == 0 )
         {
            AV190vDesEstado = "EN PROCESO" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV190vDesEstado", AV190vDesEstado);
         }
         if ( GXutil.strcmp(AV55EstFase, "F") == 0 )
         {
            AV190vDesEstado = "FINALIZADA" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV190vDesEstado", AV190vDesEstado);
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   public void S132( )
   {
      /* 'INITPARAMETERS' Routine */
      returnInSub = false ;
      GXt_int12 = AV71FlagCB ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "HP710C", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV71FlagCB = GXt_int12 ;
      GXt_int12 = AV136Magosa ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "MAGOSA", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV136Magosa = GXt_int12 ;
      GXt_int12 = AV69Finite ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "FINITE", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV69Finite = GXt_int12 ;
      GXt_int12 = AV74FlagRibes ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "RIBES", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV74FlagRibes = GXt_int12 ;
      GXt_int12 = AV75FlagSit ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "LECSIT", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV75FlagSit = GXt_int12 ;
      GXt_int12 = AV85JBP ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "JBURGO", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV85JBP = GXt_int12 ;
      GXt_int12 = AV54Estamp ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "ESTAMP", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV54Estamp = GXt_int12 ;
      GXt_int12 = AV182TinEst ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "TINEST", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV182TinEst = GXt_int12 ;
      GXt_int12 = AV65FasMan ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "MAQMAN", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV65FasMan = GXt_int12 ;
      GXt_int12 = AV84JBMartin ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "JBMAR", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV84JBMartin = GXt_int12 ;
      GXt_int12 = AV154NoProc ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "NOPROC", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV154NoProc = GXt_int12 ;
      GXt_int12 = AV58F_vt ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "VTABUA", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV58F_vt = GXt_int12 ;
      GXt_int12 = AV79Hidro ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "HIDRO", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV79Hidro = GXt_int12 ;
      GXt_int12 = AV67Fidel ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "FIDEL", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV67Fidel = GXt_int12 ;
      GXt_int12 = AV31CieHrI ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "CIEHRI", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV31CieHrI = GXt_int12 ;
      GXt_int12 = AV32Cierre_Hdr ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "CIEHRP", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV32Cierre_Hdr = GXt_int12 ;
      GXt_int12 = (byte)(AV174Revhdm) ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "REVHDM", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV174Revhdm = GXt_int12 ;
      GXt_int12 = (byte)(AV150MetSim) ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "METSIM", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV150MetSim = GXt_int12 ;
      GXt_int13 = AV57ExpSinDetail ;
      GXv_char11[0] = AV5EmprCod ;
      GXv_char10[0] = "METSIM" ;
      GXv_int7[0] = GXt_int13 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char11, GXv_char10, GXv_int7) ;
      wpexpauto2_impl.this.AV5EmprCod = GXv_char11[0] ;
      wpexpauto2_impl.this.GXt_int13 = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5EmprCod, "@!"))));
      AV57ExpSinDetail = (byte)(GXt_int13) ;
      GXt_int12 = AV29Carolina ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "CAROLI", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV29Carolina = GXt_int12 ;
      GXt_int12 = AV88KgMtcc ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "KGMTCC", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV88KgMtcc = GXt_int12 ;
      GXt_int12 = AV39CosFrac ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "COSFRA", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV39CosFrac = GXt_int12 ;
      GXt_int12 = AV56Expcondetail ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "DETAIL", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV56Expcondetail = GXt_int12 ;
      GXt_int12 = AV171PzasTrozos ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "PZSTRS", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV171PzasTrozos = GXt_int12 ;
      GXt_int13 = AV166Pass00 ;
      GXv_char11[0] = AV5EmprCod ;
      GXv_char10[0] = "PWD111" ;
      GXv_int7[0] = GXt_int13 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char11, GXv_char10, GXv_int7) ;
      wpexpauto2_impl.this.AV5EmprCod = GXv_char11[0] ;
      wpexpauto2_impl.this.GXt_int13 = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5EmprCod, "@!"))));
      AV166Pass00 = GXt_int13 ;
      GXt_int12 = AV183Tintutex ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "TINTUT", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV183Tintutex = GXt_int12 ;
      GXt_int12 = AV181Tinamar ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "TINAMA", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV181Tinamar = GXt_int12 ;
      GXt_int12 = AV76FsSgts ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "FSSGTS", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV76FsSgts = GXt_int12 ;
      GXt_int12 = AV37ContadorCarvema ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "CTDCAV", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV37ContadorCarvema = GXt_int12 ;
      GXt_int12 = AV38ContadorErfoc ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "ERFOC", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV38ContadorErfoc = GXt_int12 ;
      GXt_int12 = AV28bianco ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "BIANCO", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV28bianco = GXt_int12 ;
      GXt_int12 = AV30Carvitin ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "CARVIT", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV30Carvitin = GXt_int12 ;
      GXt_int12 = AV52Endutex ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "ENDTEX", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV52Endutex = GXt_int12 ;
      GXt_int12 = AV46defectos ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "DEFCAV", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV46defectos = GXt_int12 ;
      GXt_int12 = AV40crearalbaranproduccion ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "FSINAL", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV40crearalbaranproduccion = GXt_int12 ;
      GXt_int12 = AV43ctrlsinrollos ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "SINPZS", GXv_int8) ;
      wpexpauto2_impl.this.GXt_int12 = GXv_int8[0] ;
      AV43ctrlsinrollos = GXt_int12 ;
   }

   public void S142( )
   {
      /* 'INITBALANCE' Routine */
      returnInSub = false ;
      AV10BalanceServer = httpContext.getMessage( "localhost:3000", "") ;
      Form.getJscriptsrc().add(GXutil.format( httpContext.getMessage( "http://%1%2", ""), AV10BalanceServer, httpContext.getMessage( "/balance-widget.js?v=20260722-3", ""), "", "", "", "", "", "", "")) ;
      Balance_Server = AV10BalanceServer ;
      ucBalance.sendProperty(context, "", false, Balance_Internalname, "server", Balance_Server);
      Balance_Device_id = ((GXutil.strcmp("", AV47Device_id)==0) ? "1" : AV47Device_id) ;
      ucBalance.sendProperty(context, "", false, Balance_Internalname, "device_id", Balance_Device_id);
      Balance_Title = ((GXutil.strcmp("", AV185Title)==0) ? httpContext.getMessage( "Balanza", "") : AV185Title) ;
      ucBalance.sendProperty(context, "", false, Balance_Internalname, "title", Balance_Title);
   }

   public void wb_table1_96_2ED2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedlecmaqcod_Internalname, tblTablemergedlecmaqcod_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLecmaqcod_Internalname, httpContext.getMessage( "Maquina", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecmaqcod_Internalname, GXutil.rtrim( AV100LecMaqCod), GXutil.rtrim( localUtil.format( AV100LecMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,100);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecmaqcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLecmaqcod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Balance\\WPExpAuto2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLecmaqnom_Internalname, httpContext.getMessage( "Lec Maq Nom", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecmaqnom_Internalname, AV102LecMaqNom, GXutil.rtrim( localUtil.format( AV102LecMaqNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,103);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecmaqnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLecmaqnom_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Balance\\WPExpAuto2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_96_2ED2e( true) ;
      }
      else
      {
         wb_table1_96_2ED2e( false) ;
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
      pa2ED2( ) ;
      ws2ED2( ) ;
      we2ED2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202610520415926", true, true);
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
         httpContext.AddJavascriptSource("balance/wpexpauto2.js", "?202610520415926", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
         httpContext.AddJavascriptSource("UserControls/Balance.UCBalanceRender.js", "", false, true);
         httpContext.AddJavascriptSource("UserControls/WWP_IconButtonRender.js", "", false, true);
         httpContext.AddJavascriptSource("UserControls/WWP_IconButtonRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_632( )
   {
      edtMetTerCod_Internalname = "METTERCOD_"+sGXsfl_63_idx ;
      edtavMetpiecod_Internalname = "vMETPIECOD_"+sGXsfl_63_idx ;
      edtMetPieCod_Internalname = "METPIECOD_"+sGXsfl_63_idx ;
      edtMetPieKil_Internalname = "METPIEKIL_"+sGXsfl_63_idx ;
      edtMetPieMet_Internalname = "METPIEMET_"+sGXsfl_63_idx ;
      edtMetPieAnc_Internalname = "METPIEANC_"+sGXsfl_63_idx ;
      edtMetPieMtD_Internalname = "METPIEMTD_"+sGXsfl_63_idx ;
      edtMetPieEst_Internalname = "METPIEEST_"+sGXsfl_63_idx ;
      edtMetPieObs_Internalname = "METPIEOBS_"+sGXsfl_63_idx ;
   }

   public void subsflControlProps_fel_632( )
   {
      edtMetTerCod_Internalname = "METTERCOD_"+sGXsfl_63_fel_idx ;
      edtavMetpiecod_Internalname = "vMETPIECOD_"+sGXsfl_63_fel_idx ;
      edtMetPieCod_Internalname = "METPIECOD_"+sGXsfl_63_fel_idx ;
      edtMetPieKil_Internalname = "METPIEKIL_"+sGXsfl_63_fel_idx ;
      edtMetPieMet_Internalname = "METPIEMET_"+sGXsfl_63_fel_idx ;
      edtMetPieAnc_Internalname = "METPIEANC_"+sGXsfl_63_fel_idx ;
      edtMetPieMtD_Internalname = "METPIEMTD_"+sGXsfl_63_fel_idx ;
      edtMetPieEst_Internalname = "METPIEEST_"+sGXsfl_63_fel_idx ;
      edtMetPieObs_Internalname = "METPIEOBS_"+sGXsfl_63_fel_idx ;
   }

   public void sendrow_632( )
   {
      subsflControlProps_632( ) ;
      wb2ED0( ) ;
      if ( ( subGrid1_Rows * 1 == 0 ) || ( nGXsfl_63_idx <= subgrid1_fnc_recordsperpage( ) * 1 ) )
      {
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
            if ( ((int)((nGXsfl_63_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_63_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetTerCod_Internalname,GXutil.rtrim( A2809MetTerCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetTerCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMetpiecod_Internalname,GXutil.ltrim( localUtil.ntoc( AV282MetPieCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMetpiecod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV282MetPieCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV282MetPieCod), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMetpiecod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavMetpiecod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieCod_Internalname,GXutil.rtrim( A2813MetPieCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieKil_Internalname,GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A2814MetPieKil, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieKil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieMet_Internalname,GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A2815MetPieMet, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieMet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6635MetPieAnc), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieMtD_Internalname,GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4910MetPieMtD, "ZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieMtD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieEst_Internalname,GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2816MetPieEst), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieObs_Internalname,A4917MetPieObs,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1024),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2ED2( ) ;
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_63_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_63_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_63_idx+1) ;
         sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_632( ) ;
      }
      /* End function sendrow_632 */
   }

   public void startgridcontrol63( )
   {
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"63\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeValue( httpContext.getMessage( "Terminal", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pieza", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Larg", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Grm2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Observaciones", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Grid1Container.AddObjectProperty("GridName", "Grid1");
      }
      else
      {
         if ( isAjaxCallMode( ) )
         {
            Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
         }
         else
         {
            Grid1Container.Clear();
         }
         Grid1Container.SetWrapped(nGXWrapped);
         Grid1Container.AddObjectProperty("GridName", "Grid1");
         Grid1Container.AddObjectProperty("Header", subGrid1_Header);
         Grid1Container.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("CmpContext", "");
         Grid1Container.AddObjectProperty("InMasterPage", "false");
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2809MetTerCod));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV282MetPieCod, (byte)(4), (byte)(0), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMetpiecod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2813MetPieCod));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", A4917MetPieObs);
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
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      Combo_opecod_Internalname = "COMBO_OPECOD" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      Combo_maqcod_Internalname = "COMBO_MAQCOD" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavBarcod_Internalname = "vBARCOD" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divTableheaderinput_Internalname = "TABLEHEADERINPUT" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      divHeadercontent_Internalname = "HEADERCONTENT" ;
      divErrorcontent_Internalname = "ERRORCONTENT" ;
      edtMetTerCod_Internalname = "METTERCOD" ;
      edtavMetpiecod_Internalname = "vMETPIECOD" ;
      edtMetPieCod_Internalname = "METPIECOD" ;
      edtMetPieKil_Internalname = "METPIEKIL" ;
      edtMetPieMet_Internalname = "METPIEMET" ;
      edtMetPieAnc_Internalname = "METPIEANC" ;
      edtMetPieMtD_Internalname = "METPIEMTD" ;
      edtMetPieEst_Internalname = "METPIEEST" ;
      edtMetPieObs_Internalname = "METPIEOBS" ;
      Grid1paginationbar_Internalname = "GRID1PAGINATIONBAR" ;
      divGrid1tablewithpaginationbar_Internalname = "GRID1TABLEWITHPAGINATIONBAR" ;
      divTabledatalist_Internalname = "TABLEDATALIST" ;
      divContentleft_Internalname = "CONTENTLEFT" ;
      Balance_Internalname = "BALANCE" ;
      lblTbwidgetvalue_Internalname = "TBWIDGETVALUE" ;
      Btnwidget_Internalname = "BTNWIDGET" ;
      divContentwidgetcenter_Internalname = "CONTENTWIDGETCENTER" ;
      divActionbarwidget_Internalname = "ACTIONBARWIDGET" ;
      edtavLecmaqcod_Internalname = "vLECMAQCOD" ;
      edtavLecmaqnom_Internalname = "vLECMAQNOM" ;
      tblTablemergedlecmaqcod_Internalname = "TABLEMERGEDLECMAQCOD" ;
      edtavLecnom_Internalname = "vLECNOM" ;
      edtavLecfasnom_Internalname = "vLECFASNOM" ;
      edtavLecparnom_Internalname = "vLECPARNOM" ;
      edtavLecbarcod_Internalname = "vLECBARCOD" ;
      edtavLecbarreo_Internalname = "vLECBARREO" ;
      edtavLecbarpar_Internalname = "vLECBARPAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Btnvisualizar_Internalname = "BTNVISUALIZAR" ;
      divTablestatusmaquina_Internalname = "TABLESTATUSMAQUINA" ;
      divTableinformation_Internalname = "TABLEINFORMATION" ;
      divContentwidget_Internalname = "CONTENTWIDGET" ;
      divMaincontent_Internalname = "MAINCONTENT" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavOpecod_Internalname = "vOPECOD" ;
      edtavMaqcod_Internalname = "vMAQCOD" ;
      edtavGrid1currentpage_Internalname = "vGRID1CURRENTPAGE" ;
      edtavVdesestado_Internalname = "vVDESESTADO" ;
      Grid1_empowerer_Internalname = "GRID1_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
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
      edtMetPieObs_Jsonclick = "" ;
      edtMetPieEst_Jsonclick = "" ;
      edtMetPieMtD_Jsonclick = "" ;
      edtMetPieAnc_Jsonclick = "" ;
      edtMetPieMet_Jsonclick = "" ;
      edtMetPieKil_Jsonclick = "" ;
      edtMetPieCod_Jsonclick = "" ;
      edtavMetpiecod_Jsonclick = "" ;
      edtavMetpiecod_Enabled = 0 ;
      edtMetTerCod_Jsonclick = "" ;
      subGrid1_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavLecmaqnom_Jsonclick = "" ;
      edtavLecmaqnom_Enabled = 1 ;
      edtavLecmaqcod_Jsonclick = "" ;
      edtavLecmaqcod_Enabled = 1 ;
      Balance_Device_id = "1" ;
      Balance_Server = "" ;
      Btnvisualizar_Visible = GXutil.toBoolean( -1) ;
      edtavVdesestado_Jsonclick = "" ;
      edtavVdesestado_Visible = 1 ;
      edtavGrid1currentpage_Jsonclick = "" ;
      edtavGrid1currentpage_Visible = 1 ;
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Visible = 1 ;
      edtavOpecod_Jsonclick = "" ;
      edtavOpecod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Btnvisualizar_Class = "btn btn-outline-primary" ;
      Btnvisualizar_Caption = httpContext.getMessage( "Status", "") ;
      Btnvisualizar_Beforeiconclass = "fas fa-spinner" ;
      edtavLecbarpar_Jsonclick = "" ;
      edtavLecbarpar_Enabled = 1 ;
      edtavLecbarreo_Jsonclick = "" ;
      edtavLecbarreo_Enabled = 1 ;
      edtavLecbarcod_Jsonclick = "" ;
      edtavLecbarcod_Enabled = 1 ;
      edtavLecparnom_Jsonclick = "" ;
      edtavLecparnom_Enabled = 1 ;
      edtavLecparnom_Visible = 1 ;
      edtavLecfasnom_Jsonclick = "" ;
      edtavLecfasnom_Enabled = 1 ;
      edtavLecnom_Jsonclick = "" ;
      edtavLecnom_Enabled = 1 ;
      Btnwidget_Class = "ButtonMaterial" ;
      Btnwidget_Caption = httpContext.getMessage( "Capturar", "") ;
      Btnwidget_Beforeiconclass = "fas fa-balance-scale-right" ;
      lblTbwidgetvalue_Caption = "000.000" ;
      Balance_Title = httpContext.getMessage( "Balança", "") ;
      Grid1paginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Grid1paginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Grid1paginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Grid1paginationbar_Next = "WWP_PagingNextCaption" ;
      Grid1paginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Grid1paginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Grid1paginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Grid1paginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Grid1paginationbar_Pagingcaptionposition = "Left" ;
      Grid1paginationbar_Pagingbuttonsposition = "Right" ;
      Grid1paginationbar_Pagestoshow = 5 ;
      Grid1paginationbar_Showlast = GXutil.toBoolean( 0) ;
      Grid1paginationbar_Shownext = GXutil.toBoolean( -1) ;
      Grid1paginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Grid1paginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Grid1paginationbar_Class = "PaginationBar" ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 1 ;
      Combo_maqcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_maqcod_Caption = "" ;
      Combo_opecod_Cls = "ExtendedCombo AttributeFL" ;
      Balance_Stopped_timestamp = "" ;
      Balance_Stopped_raw = "" ;
      Balance_Stopped_unit = "" ;
      Balance_Stopped_weight = "" ;
      Grid1paginationbar_Rowsperpageselectedvalue = 10 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "HDR - Expediciones automáticas v.01", "") );
      subGrid1_Rows = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV15BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV144MaqNom',fld:'vMAQNOM',pic:'',hsh:true},{av:'AV47Device_id',fld:'vDEVICE_ID',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRID1.LOAD","{handler:'e162ED2',iparms:[]");
      setEventMetadata("GRID1.LOAD",",oparms:[]}");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEPAGE","{handler:'e122ED2',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV15BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV144MaqNom',fld:'vMAQNOM',pic:'',hsh:true},{av:'AV47Device_id',fld:'vDEVICE_ID',pic:'',hsh:true},{av:'Grid1paginationbar_Selectedpage',ctrl:'GRID1PAGINATIONBAR',prop:'SelectedPage'},{av:'AV351Grid1CurrentPage',fld:'vGRID1CURRENTPAGE',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEPAGE",",oparms:[{av:'AV351Grid1CurrentPage',fld:'vGRID1CURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e132ED2',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV15BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV144MaqNom',fld:'vMAQNOM',pic:'',hsh:true},{av:'AV47Device_id',fld:'vDEVICE_ID',pic:'',hsh:true},{av:'Grid1paginationbar_Rowsperpageselectedvalue',ctrl:'GRID1PAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV351Grid1CurrentPage',fld:'vGRID1CURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("COMBO_MAQCOD.ONOPTIONCLICKED","{handler:'e112ED2',iparms:[{av:'Combo_maqcod_Selectedvalue_get',ctrl:'COMBO_MAQCOD',prop:'SelectedValue_get'},{av:'AV190vDesEstado',fld:'vVDESESTADO',pic:''},{av:'AV102LecMaqNom',fld:'vLECMAQNOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1166LecMaqCod',fld:'LECMAQCOD',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV137MaqCod',fld:'vMAQCOD',pic:''},{av:'AV144MaqNom',fld:'vMAQNOM',pic:'',hsh:true},{av:'A1167LecBarCod',fld:'LECBARCOD',pic:'ZZZZZZZ9'},{av:'A1169LecBarPar',fld:'LECBARPAR',pic:''},{av:'A1168LecBarReo',fld:'LECBARREO',pic:'9'},{av:'A1188LecFasOrd',fld:'LECFASORD',pic:'ZZZ9'},{av:'A1171LecFasCod',fld:'LECFASCOD',pic:''},{av:'A1170LecOpeCod',fld:'LECOPECOD',pic:'ZZZZZ9'},{av:'A1172LecParCod',fld:'LECPARCOD',pic:'ZZZ9'},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A653OpeNom',fld:'OPENOM',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A456FasActTin',fld:'FASACTTIN',pic:'@!'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''},{av:'AV47Device_id',fld:'vDEVICE_ID',pic:'',hsh:true},{av:'AV185Title',fld:'vTITLE',pic:''}]");
      setEventMetadata("COMBO_MAQCOD.ONOPTIONCLICKED",",oparms:[{av:'AV137MaqCod',fld:'vMAQCOD',pic:''},{av:'Btnvisualizar_Visible',ctrl:'BTNVISUALIZAR',prop:'Visible'},{av:'Btnvisualizar_Class',ctrl:'BTNVISUALIZAR',prop:'Class'},{av:'Btnvisualizar_Beforeiconclass',ctrl:'BTNVISUALIZAR',prop:'BeforeIconClass'},{av:'Btnvisualizar_Caption',ctrl:'BTNVISUALIZAR',prop:'Caption'},{av:'AV185Title',fld:'vTITLE',pic:''},{av:'AV100LecMaqCod',fld:'vLECMAQCOD',pic:''},{av:'AV102LecMaqNom',fld:'vLECMAQNOM',pic:''},{av:'AV89LecBarCod',fld:'vLECBARCOD',pic:'ZZZZZZZ9'},{av:'AV91LecBarPar',fld:'vLECBARPAR',pic:''},{av:'AV93LecBarReo',fld:'vLECBARREO',pic:'9'},{av:'AV104LecNom',fld:'vLECNOM',pic:''},{av:'AV96LecFasNom',fld:'vLECFASNOM',pic:''},{av:'AV108LecParNom',fld:'vLECPARNOM',pic:''},{av:'AV190vDesEstado',fld:'vVDESESTADO',pic:''},{av:'Balance_Server',ctrl:'BALANCE',prop:'server'},{av:'Balance_Device_id',ctrl:'BALANCE',prop:'device_id'},{av:'Balance_Title',ctrl:'BALANCE',prop:'title'}]}");
      setEventMetadata("VALIDV_MAQCOD","{handler:'validv_Maqcod',iparms:[]");
      setEventMetadata("VALIDV_MAQCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Metpieobs',iparms:[]");
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
      Grid1paginationbar_Selectedpage = "" ;
      Combo_maqcod_Selectedvalue_get = "" ;
      Combo_opecod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV5EmprCod = "" ;
      AV144MaqNom = "" ;
      AV47Device_id = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV160OpeCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV45DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV138MaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A396EmprCod = "" ;
      A1166LecMaqCod = "" ;
      A1169LecBarPar = "" ;
      A1171LecFasCod = "" ;
      A653OpeNom = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A456FasActTin = "" ;
      A867ParCodNom = "" ;
      AV185Title = "" ;
      AV133Log = "" ;
      AV44DataHoraCaptura = "" ;
      AV172RawCapturado = "" ;
      AV188UnidadeCapturada = "" ;
      AV167PesoCapturado = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblTextblock2_Jsonclick = "" ;
      ucCombo_opecod = new com.genexus.webpanels.GXUserControl();
      Combo_opecod_Caption = "" ;
      lblTextblock1_Jsonclick = "" ;
      ucCombo_maqcod = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGrid1paginationbar = new com.genexus.webpanels.GXUserControl();
      ucBalance = new com.genexus.webpanels.GXUserControl();
      lblTbwidgetvalue_Jsonclick = "" ;
      ucBtnwidget = new com.genexus.webpanels.GXUserControl();
      AV104LecNom = "" ;
      AV96LecFasNom = "" ;
      AV108LecParNom = "" ;
      AV91LecBarPar = "" ;
      ucBtnvisualizar = new com.genexus.webpanels.GXUserControl();
      AV355Pgmname = "" ;
      AV137MaqCod = "" ;
      AV190vDesEstado = "" ;
      ucGrid1_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A2809MetTerCod = "" ;
      A2813MetPieCod = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A4910MetPieMtD = DecimalUtil.ZERO ;
      A4917MetPieObs = "" ;
      scmdbuf = "" ;
      H02ED2_A396EmprCod = new String[] {""} ;
      H02ED2_A132BarCodReo = new byte[1] ;
      H02ED2_A130BarCodPar = new String[] {""} ;
      H02ED2_A129BarCod = new int[1] ;
      H02ED2_A4917MetPieObs = new String[] {""} ;
      H02ED2_A2816MetPieEst = new byte[1] ;
      H02ED2_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02ED2_A6635MetPieAnc = new short[1] ;
      H02ED2_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02ED2_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02ED2_A2813MetPieCod = new String[] {""} ;
      H02ED2_A2809MetTerCod = new String[] {""} ;
      H02ED3_AGRID1_nRecordCount = new long[1] ;
      AV100LecMaqCod = "" ;
      AV102LecMaqNom = "" ;
      AV7Station = "" ;
      GXt_char1 = "" ;
      AV6EmprNom = "" ;
      AV349UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      Grid1_empowerer_Gridinternalname = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      H02ED4_A607MaqEst = new String[] {""} ;
      H02ED4_n607MaqEst = new boolean[] {false} ;
      H02ED4_A396EmprCod = new String[] {""} ;
      H02ED4_A606MaqDsc = new String[] {""} ;
      H02ED4_n606MaqDsc = new boolean[] {false} ;
      H02ED4_A620MaqTip = new String[] {""} ;
      H02ED4_n620MaqTip = new boolean[] {false} ;
      H02ED4_A602MaqCod = new String[] {""} ;
      A607MaqEst = "" ;
      A606MaqDsc = "" ;
      A620MaqTip = "" ;
      A602MaqCod = "" ;
      AV145MaqTip = "" ;
      AV142MaqEst = "" ;
      AV35Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      Combo_maqcod_Selectedvalue_set = "" ;
      H02ED5_A396EmprCod = new String[] {""} ;
      H02ED5_A8482OpeAct = new String[] {""} ;
      H02ED5_n8482OpeAct = new boolean[] {false} ;
      H02ED5_A13748OpeCNom = new String[] {""} ;
      H02ED5_A652OpeCod = new int[1] ;
      H02ED5_A653OpeNom = new String[] {""} ;
      H02ED5_n653OpeNom = new boolean[] {false} ;
      A8482OpeAct = "" ;
      A13748OpeCNom = "" ;
      Combo_opecod_Selectedvalue_set = "" ;
      AV17BarCodPar = "" ;
      AV99Lecfec = GXutil.nullDate() ;
      H02ED6_A396EmprCod = new String[] {""} ;
      H02ED6_A129BarCod = new int[1] ;
      H02ED6_A132BarCodReo = new byte[1] ;
      H02ED6_A130BarCodPar = new String[] {""} ;
      H02ED6_A194BarOrdLin = new short[1] ;
      H02ED6_A602MaqCod = new String[] {""} ;
      H02ED6_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H02ED6_A656ParCod = new short[1] ;
      H02ED6_n656ParCod = new boolean[] {false} ;
      H02ED6_A561HisProLin = new int[1] ;
      A130BarCodPar = "" ;
      A558HisProFec = GXutil.nullDate() ;
      H02ED7_A457FasCod = new String[] {""} ;
      H02ED7_A152BarFasCon = new String[] {""} ;
      H02ED7_A153BarFasEst = new byte[1] ;
      H02ED7_A130BarCodPar = new String[] {""} ;
      H02ED7_A132BarCodReo = new byte[1] ;
      H02ED7_A129BarCod = new int[1] ;
      H02ED7_A396EmprCod = new String[] {""} ;
      H02ED7_A460FasDsc = new String[] {""} ;
      H02ED7_A6011FasTip = new String[] {""} ;
      H02ED7_n6011FasTip = new boolean[] {false} ;
      H02ED7_A7600FasH2OReh = new String[] {""} ;
      H02ED7_n7600FasH2OReh = new boolean[] {false} ;
      H02ED7_A194BarOrdLin = new short[1] ;
      H02ED7_A758ProCod = new String[] {""} ;
      A152BarFasCon = "" ;
      A6011FasTip = "" ;
      A7600FasH2OReh = "" ;
      A758ProCod = "" ;
      AV61FasCodi = "" ;
      AV63FasDscmf = "" ;
      AV66FasTip = "" ;
      AV169Procod = "" ;
      AV87KgMt = "" ;
      H02ED8_A1142MaqFCod = new String[] {""} ;
      H02ED8_A602MaqCod = new String[] {""} ;
      H02ED8_A396EmprCod = new String[] {""} ;
      A1142MaqFCod = "" ;
      AV62FasCodmf = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int9 = new short[1] ;
      A3400DisRefBCPa = "" ;
      AV78HDRs = "" ;
      H02ED9_A396EmprCod = new String[] {""} ;
      H02ED9_A3607DisRefBPie = new String[] {""} ;
      H02ED9_A361DisCod = new int[1] ;
      H02ED9_A3400DisRefBCPa = new String[] {""} ;
      H02ED9_A3399DisRefBCRe = new byte[1] ;
      H02ED9_A3398DisRefBarC = new int[1] ;
      H02ED10_A1172LecParCod = new short[1] ;
      H02ED10_n1172LecParCod = new boolean[] {false} ;
      H02ED10_A1171LecFasCod = new String[] {""} ;
      H02ED10_n1171LecFasCod = new boolean[] {false} ;
      H02ED10_A1170LecOpeCod = new int[1] ;
      H02ED10_n1170LecOpeCod = new boolean[] {false} ;
      H02ED10_A396EmprCod = new String[] {""} ;
      H02ED10_A1166LecMaqCod = new String[] {""} ;
      H02ED10_A1167LecBarCod = new int[1] ;
      H02ED10_n1167LecBarCod = new boolean[] {false} ;
      H02ED10_A1169LecBarPar = new String[] {""} ;
      H02ED10_n1169LecBarPar = new boolean[] {false} ;
      H02ED10_A1168LecBarReo = new byte[1] ;
      H02ED10_n1168LecBarReo = new boolean[] {false} ;
      H02ED10_A1188LecFasOrd = new short[1] ;
      H02ED10_n1188LecFasOrd = new boolean[] {false} ;
      AV95LecFasCod = "" ;
      H02ED11_A396EmprCod = new String[] {""} ;
      H02ED11_A652OpeCod = new int[1] ;
      H02ED11_A653OpeNom = new String[] {""} ;
      H02ED11_n653OpeNom = new boolean[] {false} ;
      H02ED12_A396EmprCod = new String[] {""} ;
      H02ED12_A457FasCod = new String[] {""} ;
      H02ED12_A460FasDsc = new String[] {""} ;
      H02ED12_A456FasActTin = new String[] {""} ;
      H02ED12_n456FasActTin = new boolean[] {false} ;
      AV59FasAgr = "" ;
      H02ED13_A396EmprCod = new String[] {""} ;
      H02ED13_A656ParCod = new short[1] ;
      H02ED13_n656ParCod = new boolean[] {false} ;
      H02ED13_A867ParCodNom = new String[] {""} ;
      H02ED13_n867ParCodNom = new boolean[] {false} ;
      AV55EstFase = "" ;
      AV179terminus = "" ;
      GXv_char11 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int8 = new byte[1] ;
      AV10BalanceServer = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.balance.wpexpauto2__default(),
         new Object[] {
             new Object[] {
            H02ED2_A396EmprCod, H02ED2_A132BarCodReo, H02ED2_A130BarCodPar, H02ED2_A129BarCod, H02ED2_A4917MetPieObs, H02ED2_A2816MetPieEst, H02ED2_A4910MetPieMtD, H02ED2_A6635MetPieAnc, H02ED2_A2815MetPieMet, H02ED2_A2814MetPieKil,
            H02ED2_A2813MetPieCod, H02ED2_A2809MetTerCod
            }
            , new Object[] {
            H02ED3_AGRID1_nRecordCount
            }
            , new Object[] {
            H02ED4_A607MaqEst, H02ED4_n607MaqEst, H02ED4_A396EmprCod, H02ED4_A606MaqDsc, H02ED4_n606MaqDsc, H02ED4_A620MaqTip, H02ED4_n620MaqTip, H02ED4_A602MaqCod
            }
            , new Object[] {
            H02ED5_A396EmprCod, H02ED5_A8482OpeAct, H02ED5_n8482OpeAct, H02ED5_A13748OpeCNom, H02ED5_A652OpeCod, H02ED5_A653OpeNom, H02ED5_n653OpeNom
            }
            , new Object[] {
            H02ED6_A396EmprCod, H02ED6_A129BarCod, H02ED6_A132BarCodReo, H02ED6_A130BarCodPar, H02ED6_A194BarOrdLin, H02ED6_A602MaqCod, H02ED6_A558HisProFec, H02ED6_A656ParCod, H02ED6_n656ParCod, H02ED6_A561HisProLin
            }
            , new Object[] {
            H02ED7_A457FasCod, H02ED7_A152BarFasCon, H02ED7_A153BarFasEst, H02ED7_A130BarCodPar, H02ED7_A132BarCodReo, H02ED7_A129BarCod, H02ED7_A396EmprCod, H02ED7_A460FasDsc, H02ED7_A6011FasTip, H02ED7_n6011FasTip,
            H02ED7_A7600FasH2OReh, H02ED7_n7600FasH2OReh, H02ED7_A194BarOrdLin, H02ED7_A758ProCod
            }
            , new Object[] {
            H02ED8_A1142MaqFCod, H02ED8_A602MaqCod, H02ED8_A396EmprCod
            }
            , new Object[] {
            H02ED9_A396EmprCod, H02ED9_A3607DisRefBPie, H02ED9_A361DisCod, H02ED9_A3400DisRefBCPa, H02ED9_A3399DisRefBCRe, H02ED9_A3398DisRefBarC
            }
            , new Object[] {
            H02ED10_A1172LecParCod, H02ED10_n1172LecParCod, H02ED10_A1171LecFasCod, H02ED10_n1171LecFasCod, H02ED10_A1170LecOpeCod, H02ED10_n1170LecOpeCod, H02ED10_A396EmprCod, H02ED10_A1166LecMaqCod, H02ED10_A1167LecBarCod, H02ED10_n1167LecBarCod,
            H02ED10_A1169LecBarPar, H02ED10_n1169LecBarPar, H02ED10_A1168LecBarReo, H02ED10_n1168LecBarReo, H02ED10_A1188LecFasOrd, H02ED10_n1188LecFasOrd
            }
            , new Object[] {
            H02ED11_A396EmprCod, H02ED11_A652OpeCod, H02ED11_A653OpeNom, H02ED11_n653OpeNom
            }
            , new Object[] {
            H02ED12_A396EmprCod, H02ED12_A457FasCod, H02ED12_A460FasDsc, H02ED12_A456FasActTin, H02ED12_n456FasActTin
            }
            , new Object[] {
            H02ED13_A396EmprCod, H02ED13_A656ParCod, H02ED13_A867ParCodNom, H02ED13_n867ParCodNom
            }
         }
      );
      AV355Pgmname = "Balance.WPExpAuto2" ;
      /* GeneXus formulas. */
      AV355Pgmname = "Balance.WPExpAuto2" ;
      Gx_err = (short)(0) ;
      edtavMetpiecod_Enabled = 0 ;
      edtavLecmaqcod_Enabled = 0 ;
      edtavLecmaqnom_Enabled = 0 ;
      edtavLecnom_Enabled = 0 ;
      edtavLecfasnom_Enabled = 0 ;
      edtavLecparnom_Enabled = 0 ;
      edtavLecbarcod_Enabled = 0 ;
      edtavLecbarreo_Enabled = 0 ;
      edtavLecbarpar_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GRID1_nEOF ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte A1168LecBarReo ;
   private byte AV93LecBarReo ;
   private byte A2816MetPieEst ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte AV110Lhipro ;
   private byte AV18BarCodReo ;
   private byte A132BarCodReo ;
   private byte AV143MaqFasi ;
   private byte AV21Barfasest ;
   private byte A153BarFasEst ;
   private byte AV76FsSgts ;
   private byte AV183Tintutex ;
   private byte A3399DisRefBCRe ;
   private byte AV20BarEst ;
   private byte AV361GXLvl314 ;
   private byte AV71FlagCB ;
   private byte AV136Magosa ;
   private byte AV69Finite ;
   private byte AV74FlagRibes ;
   private byte AV75FlagSit ;
   private byte AV85JBP ;
   private byte AV54Estamp ;
   private byte AV182TinEst ;
   private byte AV65FasMan ;
   private byte AV84JBMartin ;
   private byte AV154NoProc ;
   private byte AV58F_vt ;
   private byte AV79Hidro ;
   private byte AV67Fidel ;
   private byte AV31CieHrI ;
   private byte AV32Cierre_Hdr ;
   private byte AV57ExpSinDetail ;
   private byte AV29Carolina ;
   private byte AV88KgMtcc ;
   private byte AV39CosFrac ;
   private byte AV56Expcondetail ;
   private byte AV171PzasTrozos ;
   private byte AV181Tinamar ;
   private byte AV37ContadorCarvema ;
   private byte AV38ContadorErfoc ;
   private byte AV28bianco ;
   private byte AV30Carvitin ;
   private byte AV52Endutex ;
   private byte AV46defectos ;
   private byte AV40crearalbaranproduccion ;
   private byte AV43ctrlsinrollos ;
   private byte GXt_int12 ;
   private byte GXv_int8[] ;
   private byte subGrid1_Backstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short nRcdExists_10 ;
   private short nIsMod_10 ;
   private short nRcdExists_13 ;
   private short nIsMod_13 ;
   private short nRcdExists_12 ;
   private short nIsMod_12 ;
   private short nRcdExists_11 ;
   private short nIsMod_11 ;
   private short nRcdExists_8 ;
   private short nIsMod_8 ;
   private short nRcdExists_9 ;
   private short nIsMod_9 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short A1188LecFasOrd ;
   private short A1172LecParCod ;
   private short A656ParCod ;
   private short wbEnd ;
   private short wbStart ;
   private short AV282MetPieCod ;
   private short A6635MetPieAnc ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV24BarOrdLin ;
   private short A194BarOrdLin ;
   private short GXv_int9[] ;
   private short AV98LecFasord ;
   private short AV107Lecparcod ;
   private short AV174Revhdm ;
   private short AV150MetSim ;
   private int Grid1paginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_63 ;
   private int subGrid1_Rows ;
   private int nGXsfl_63_idx=1 ;
   private int AV15BarCod ;
   private int A1167LecBarCod ;
   private int A1170LecOpeCod ;
   private int A652OpeCod ;
   private int edtavBarcod_Enabled ;
   private int Grid1paginationbar_Pagestoshow ;
   private int edtavLecnom_Enabled ;
   private int edtavLecfasnom_Enabled ;
   private int edtavLecparnom_Visible ;
   private int edtavLecparnom_Enabled ;
   private int AV89LecBarCod ;
   private int edtavLecbarcod_Enabled ;
   private int edtavLecbarreo_Enabled ;
   private int edtavLecbarpar_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV159OpeCod ;
   private int edtavOpecod_Visible ;
   private int edtavMaqcod_Visible ;
   private int edtavGrid1currentpage_Visible ;
   private int edtavVdesestado_Visible ;
   private int subGrid1_Islastpage ;
   private int edtavMetpiecod_Enabled ;
   private int edtavLecmaqcod_Enabled ;
   private int edtavLecmaqnom_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A129BarCod ;
   private int AV350PageToGo ;
   private int AV14Barcada ;
   private int A561HisProLin ;
   private int AV81HisProlin ;
   private int A3398DisRefBarC ;
   private int AV48Discod ;
   private int A361DisCod ;
   private int AV106LecOpeCod ;
   private int AV166Pass00 ;
   private int GXt_int13 ;
   private int GXv_int7[] ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long AV352Grid1PageCount ;
   private long AV351Grid1CurrentPage ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A4910MetPieMtD ;
   private String Grid1paginationbar_Selectedpage ;
   private String Balance_Stopped_weight ;
   private String Balance_Stopped_unit ;
   private String Balance_Stopped_raw ;
   private String Balance_Stopped_timestamp ;
   private String Combo_maqcod_Selectedvalue_get ;
   private String Combo_opecod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_63_idx="0001" ;
   private String AV5EmprCod ;
   private String AV144MaqNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A1166LecMaqCod ;
   private String A1169LecBarPar ;
   private String A1171LecFasCod ;
   private String A653OpeNom ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A456FasActTin ;
   private String A867ParCodNom ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divTablecontent_Internalname ;
   private String divMaincontent_Internalname ;
   private String divContentleft_Internalname ;
   private String divHeadercontent_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableheaderinput_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String Combo_opecod_Caption ;
   private String Combo_opecod_Cls ;
   private String Combo_opecod_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String Combo_maqcod_Caption ;
   private String Combo_maqcod_Cls ;
   private String Combo_maqcod_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtavBarcod_Internalname ;
   private String TempTags ;
   private String edtavBarcod_Jsonclick ;
   private String divErrorcontent_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTabledatalist_Internalname ;
   private String divGrid1tablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String Grid1paginationbar_Class ;
   private String Grid1paginationbar_Pagingbuttonsposition ;
   private String Grid1paginationbar_Pagingcaptionposition ;
   private String Grid1paginationbar_Emptygridclass ;
   private String Grid1paginationbar_Rowsperpageoptions ;
   private String Grid1paginationbar_Previous ;
   private String Grid1paginationbar_Next ;
   private String Grid1paginationbar_Caption ;
   private String Grid1paginationbar_Emptygridcaption ;
   private String Grid1paginationbar_Rowsperpagecaption ;
   private String Grid1paginationbar_Internalname ;
   private String divContentwidget_Internalname ;
   private String Balance_Title ;
   private String Balance_Internalname ;
   private String divActionbarwidget_Internalname ;
   private String divContentwidgetcenter_Internalname ;
   private String lblTbwidgetvalue_Internalname ;
   private String lblTbwidgetvalue_Caption ;
   private String lblTbwidgetvalue_Jsonclick ;
   private String Btnwidget_Beforeiconclass ;
   private String Btnwidget_Caption ;
   private String Btnwidget_Class ;
   private String Btnwidget_Internalname ;
   private String divTableinformation_Internalname ;
   private String edtavLecnom_Internalname ;
   private String edtavLecnom_Jsonclick ;
   private String edtavLecfasnom_Internalname ;
   private String edtavLecfasnom_Jsonclick ;
   private String edtavLecparnom_Internalname ;
   private String AV108LecParNom ;
   private String edtavLecparnom_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtavLecbarcod_Internalname ;
   private String edtavLecbarcod_Jsonclick ;
   private String edtavLecbarreo_Internalname ;
   private String edtavLecbarreo_Jsonclick ;
   private String edtavLecbarpar_Internalname ;
   private String AV91LecBarPar ;
   private String edtavLecbarpar_Jsonclick ;
   private String divTablestatusmaquina_Internalname ;
   private String Btnvisualizar_Beforeiconclass ;
   private String Btnvisualizar_Caption ;
   private String Btnvisualizar_Class ;
   private String Btnvisualizar_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV355Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavOpecod_Internalname ;
   private String edtavOpecod_Jsonclick ;
   private String edtavMaqcod_Internalname ;
   private String AV137MaqCod ;
   private String edtavMaqcod_Jsonclick ;
   private String edtavGrid1currentpage_Internalname ;
   private String edtavGrid1currentpage_Jsonclick ;
   private String edtavVdesestado_Internalname ;
   private String AV190vDesEstado ;
   private String edtavVdesestado_Jsonclick ;
   private String Grid1_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A2809MetTerCod ;
   private String edtMetTerCod_Internalname ;
   private String edtavMetpiecod_Internalname ;
   private String A2813MetPieCod ;
   private String edtMetPieCod_Internalname ;
   private String edtMetPieKil_Internalname ;
   private String edtMetPieMet_Internalname ;
   private String edtMetPieAnc_Internalname ;
   private String edtMetPieMtD_Internalname ;
   private String edtMetPieEst_Internalname ;
   private String edtMetPieObs_Internalname ;
   private String edtavLecmaqcod_Internalname ;
   private String edtavLecmaqnom_Internalname ;
   private String scmdbuf ;
   private String AV100LecMaqCod ;
   private String AV7Station ;
   private String GXt_char1 ;
   private String AV6EmprNom ;
   private String AV349UsurCod ;
   private String Grid1_empowerer_Gridinternalname ;
   private String A607MaqEst ;
   private String A606MaqDsc ;
   private String A620MaqTip ;
   private String A602MaqCod ;
   private String AV145MaqTip ;
   private String AV142MaqEst ;
   private String Combo_maqcod_Selectedvalue_set ;
   private String A8482OpeAct ;
   private String Combo_opecod_Selectedvalue_set ;
   private String AV17BarCodPar ;
   private String A130BarCodPar ;
   private String A152BarFasCon ;
   private String A6011FasTip ;
   private String A7600FasH2OReh ;
   private String A758ProCod ;
   private String AV61FasCodi ;
   private String AV63FasDscmf ;
   private String AV66FasTip ;
   private String AV169Procod ;
   private String AV87KgMt ;
   private String A1142MaqFCod ;
   private String AV62FasCodmf ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String A3400DisRefBCPa ;
   private String AV78HDRs ;
   private String AV95LecFasCod ;
   private String AV59FasAgr ;
   private String AV55EstFase ;
   private String AV179terminus ;
   private String GXv_char11[] ;
   private String GXv_char10[] ;
   private String Balance_Server ;
   private String Balance_Device_id ;
   private String tblTablemergedlecmaqcod_Internalname ;
   private String edtavLecmaqcod_Jsonclick ;
   private String edtavLecmaqnom_Jsonclick ;
   private String sGXsfl_63_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtMetTerCod_Jsonclick ;
   private String edtavMetpiecod_Jsonclick ;
   private String edtMetPieCod_Jsonclick ;
   private String edtMetPieKil_Jsonclick ;
   private String edtMetPieMet_Jsonclick ;
   private String edtMetPieAnc_Jsonclick ;
   private String edtMetPieMtD_Jsonclick ;
   private String edtMetPieEst_Jsonclick ;
   private String edtMetPieObs_Jsonclick ;
   private String subGrid1_Header ;
   private java.util.Date AV99Lecfec ;
   private java.util.Date A558HisProFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Grid1paginationbar_Showfirst ;
   private boolean Grid1paginationbar_Showprevious ;
   private boolean Grid1paginationbar_Shownext ;
   private boolean Grid1paginationbar_Showlast ;
   private boolean Grid1paginationbar_Rowsperpageselector ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_63_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean Btnvisualizar_Visible ;
   private boolean gx_refresh_fired ;
   private boolean n607MaqEst ;
   private boolean n606MaqDsc ;
   private boolean n620MaqTip ;
   private boolean n8482OpeAct ;
   private boolean n653OpeNom ;
   private boolean n656ParCod ;
   private boolean n6011FasTip ;
   private boolean n7600FasH2OReh ;
   private boolean brk2ED8 ;
   private boolean n1172LecParCod ;
   private boolean n1171LecFasCod ;
   private boolean n1170LecOpeCod ;
   private boolean n1167LecBarCod ;
   private boolean n1169LecBarPar ;
   private boolean n1168LecBarReo ;
   private boolean n1188LecFasOrd ;
   private boolean n456FasActTin ;
   private boolean n867ParCodNom ;
   private String AV133Log ;
   private String AV47Device_id ;
   private String AV185Title ;
   private String AV44DataHoraCaptura ;
   private String AV172RawCapturado ;
   private String AV188UnidadeCapturada ;
   private String AV167PesoCapturado ;
   private String AV104LecNom ;
   private String AV96LecFasNom ;
   private String A4917MetPieObs ;
   private String AV102LecMaqNom ;
   private String A13748OpeCNom ;
   private String AV10BalanceServer ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucCombo_opecod ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcod ;
   private com.genexus.webpanels.GXUserControl ucGrid1paginationbar ;
   private com.genexus.webpanels.GXUserControl ucBalance ;
   private com.genexus.webpanels.GXUserControl ucBtnwidget ;
   private com.genexus.webpanels.GXUserControl ucBtnvisualizar ;
   private com.genexus.webpanels.GXUserControl ucGrid1_empowerer ;
   private IDataStoreProvider pr_default ;
   private String[] H02ED2_A396EmprCod ;
   private byte[] H02ED2_A132BarCodReo ;
   private String[] H02ED2_A130BarCodPar ;
   private int[] H02ED2_A129BarCod ;
   private String[] H02ED2_A4917MetPieObs ;
   private byte[] H02ED2_A2816MetPieEst ;
   private java.math.BigDecimal[] H02ED2_A4910MetPieMtD ;
   private short[] H02ED2_A6635MetPieAnc ;
   private java.math.BigDecimal[] H02ED2_A2815MetPieMet ;
   private java.math.BigDecimal[] H02ED2_A2814MetPieKil ;
   private String[] H02ED2_A2813MetPieCod ;
   private String[] H02ED2_A2809MetTerCod ;
   private long[] H02ED3_AGRID1_nRecordCount ;
   private String[] H02ED4_A607MaqEst ;
   private boolean[] H02ED4_n607MaqEst ;
   private String[] H02ED4_A396EmprCod ;
   private String[] H02ED4_A606MaqDsc ;
   private boolean[] H02ED4_n606MaqDsc ;
   private String[] H02ED4_A620MaqTip ;
   private boolean[] H02ED4_n620MaqTip ;
   private String[] H02ED4_A602MaqCod ;
   private String[] H02ED5_A396EmprCod ;
   private String[] H02ED5_A8482OpeAct ;
   private boolean[] H02ED5_n8482OpeAct ;
   private String[] H02ED5_A13748OpeCNom ;
   private int[] H02ED5_A652OpeCod ;
   private String[] H02ED5_A653OpeNom ;
   private boolean[] H02ED5_n653OpeNom ;
   private String[] H02ED6_A396EmprCod ;
   private int[] H02ED6_A129BarCod ;
   private byte[] H02ED6_A132BarCodReo ;
   private String[] H02ED6_A130BarCodPar ;
   private short[] H02ED6_A194BarOrdLin ;
   private String[] H02ED6_A602MaqCod ;
   private java.util.Date[] H02ED6_A558HisProFec ;
   private short[] H02ED6_A656ParCod ;
   private boolean[] H02ED6_n656ParCod ;
   private int[] H02ED6_A561HisProLin ;
   private String[] H02ED7_A457FasCod ;
   private String[] H02ED7_A152BarFasCon ;
   private byte[] H02ED7_A153BarFasEst ;
   private String[] H02ED7_A130BarCodPar ;
   private byte[] H02ED7_A132BarCodReo ;
   private int[] H02ED7_A129BarCod ;
   private String[] H02ED7_A396EmprCod ;
   private String[] H02ED7_A460FasDsc ;
   private String[] H02ED7_A6011FasTip ;
   private boolean[] H02ED7_n6011FasTip ;
   private String[] H02ED7_A7600FasH2OReh ;
   private boolean[] H02ED7_n7600FasH2OReh ;
   private short[] H02ED7_A194BarOrdLin ;
   private String[] H02ED7_A758ProCod ;
   private String[] H02ED8_A1142MaqFCod ;
   private String[] H02ED8_A602MaqCod ;
   private String[] H02ED8_A396EmprCod ;
   private String[] H02ED9_A396EmprCod ;
   private String[] H02ED9_A3607DisRefBPie ;
   private int[] H02ED9_A361DisCod ;
   private String[] H02ED9_A3400DisRefBCPa ;
   private byte[] H02ED9_A3399DisRefBCRe ;
   private int[] H02ED9_A3398DisRefBarC ;
   private short[] H02ED10_A1172LecParCod ;
   private boolean[] H02ED10_n1172LecParCod ;
   private String[] H02ED10_A1171LecFasCod ;
   private boolean[] H02ED10_n1171LecFasCod ;
   private int[] H02ED10_A1170LecOpeCod ;
   private boolean[] H02ED10_n1170LecOpeCod ;
   private String[] H02ED10_A396EmprCod ;
   private String[] H02ED10_A1166LecMaqCod ;
   private int[] H02ED10_A1167LecBarCod ;
   private boolean[] H02ED10_n1167LecBarCod ;
   private String[] H02ED10_A1169LecBarPar ;
   private boolean[] H02ED10_n1169LecBarPar ;
   private byte[] H02ED10_A1168LecBarReo ;
   private boolean[] H02ED10_n1168LecBarReo ;
   private short[] H02ED10_A1188LecFasOrd ;
   private boolean[] H02ED10_n1188LecFasOrd ;
   private String[] H02ED11_A396EmprCod ;
   private int[] H02ED11_A652OpeCod ;
   private String[] H02ED11_A653OpeNom ;
   private boolean[] H02ED11_n653OpeNom ;
   private String[] H02ED12_A396EmprCod ;
   private String[] H02ED12_A457FasCod ;
   private String[] H02ED12_A460FasDsc ;
   private String[] H02ED12_A456FasActTin ;
   private boolean[] H02ED12_n456FasActTin ;
   private String[] H02ED13_A396EmprCod ;
   private short[] H02ED13_A656ParCod ;
   private boolean[] H02ED13_n656ParCod ;
   private String[] H02ED13_A867ParCodNom ;
   private boolean[] H02ED13_n867ParCodNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV160OpeCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV138MaqCod_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV35Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV45DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class wpexpauto2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02ED2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV15BarCod ,
                                          int A129BarCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[6];
      Object[] GXv_Object15 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " EmprCod, BarCodReo, BarCodPar, BarCod, MetPieObs, MetPieEst, MetPieMtD, MetPieAnc, MetPieMet, MetPieKil, MetPieCod, MetTerCod" ;
      sFromString = " FROM TXPLMETPI" ;
      sOrderString = "" ;
      if ( (0==AV15BarCod) )
      {
         addWhere(sWhereString, "(BarCod = ?)");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
      }
      sOrderString += " ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod" ;
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_H02ED3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV15BarCod ,
                                          int A129BarCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[1];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPLMETPI" ;
      if ( (0==AV15BarCod) )
      {
         addWhere(sWhereString, "(BarCod = ?)");
      }
      else
      {
         GXv_int16[0] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H02ED2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() );
            case 1 :
                  return conditional_H02ED3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02ED2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02ED3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02ED4", "SELECT MaqEst, EmprCod, MaqDsc, MaqTip, MaqCod FROM TXPMAQUIN WHERE (EmprCod = ?) AND (MaqEst = 'A') ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02ED5", "SELECT EmprCod, OpeAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, OpeCod, OpeNom FROM TXPOPERAR WHERE OpeAct = 'A' ORDER BY OpeCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02ED6", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, MaqCod, HisProFec, ParCod, HisProLin FROM TXPLHIPRO WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? and MaqCod = ? and HisProFec = ?) AND (ParCod = 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, MaqCod, HisProFec, HisProLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02ED7", "SELECT T1.FasCod, T1.BarFasCon, T1.BarFasEst, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.FasDsc, T2.FasTip, T2.FasH2OReh, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02ED8", "SELECT MaqFCod, MaqCod, EmprCod FROM TXPMAQFAS WHERE EmprCod = ? and MaqCod = ? and MaqFCod = ? ORDER BY EmprCod, MaqCod, MaqFCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02ED9", "SELECT EmprCod, DisRefBPie, DisCod, DisRefBCPa, DisRefBCRe, DisRefBarC FROM TXPDISREF WHERE DisCod = ? ORDER BY DisRefBarC, DisRefBCRe, DisRefBCPa ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02ED10", "SELECT LecParCod, LecFasCod, LecOpeCod, EmprCod, LecMaqCod, LecBarCod, LecBarPar, LecBarReo, LecFasOrd FROM TXPLECTOR WHERE EmprCod = ? and LecMaqCod = ? ORDER BY EmprCod, LecMaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02ED11", "SELECT EmprCod, OpeCod, OpeNom FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02ED12", "SELECT EmprCod, FasCod, FasDsc, FasActTin FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02ED13", "SELECT EmprCod, ParCod, ParCodNom FROM TXPCODPAR WHERE EmprCod = ? and ParCod = ? ORDER BY EmprCod, ParCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 9);
               ((String[]) buf[11])[0] = rslt.getString(12, 10);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 28);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[6]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[1]).intValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 6);
               stmt.setDate(7, (java.util.Date)parms[6]);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
      }
   }

}

