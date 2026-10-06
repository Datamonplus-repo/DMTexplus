package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class programacionmaquinas_impl extends GXDataArea
{
   public programacionmaquinas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public programacionmaquinas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( programacionmaquinas_impl.class ));
   }

   public programacionmaquinas_impl( int remoteHandle ,
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridhdrs") == 0 )
         {
            gxnrgridhdrs_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridhdrs") == 0 )
         {
            gxgrgridhdrs_refresh_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridmaquinas") == 0 )
         {
            gxnrgridmaquinas_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridmaquinas") == 0 )
         {
            gxgrgridmaquinas_refresh_invoke( ) ;
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

   public void gxnrgridhdrs_newrow_invoke( )
   {
      nRC_GXsfl_34 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_34"))) ;
      nGXsfl_34_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_34_idx"))) ;
      sGXsfl_34_idx = httpContext.GetPar( "sGXsfl_34_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridhdrs_newrow( ) ;
      /* End function gxnrGridhdrs_newrow_invoke */
   }

   public void gxgrgridhdrs_refresh_invoke( )
   {
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV14MaqCodVisible);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV5SDTMaquina);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV7SDTMaquinaCollection);
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridhdrs_refresh( AV14MaqCodVisible, AV5SDTMaquina, AV7SDTMaquinaCollection) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridhdrs_refresh_invoke */
   }

   public void gxnrgridmaquinas_newrow_invoke( )
   {
      nRC_GXsfl_23 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_23"))) ;
      nGXsfl_23_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_23_idx"))) ;
      sGXsfl_23_idx = httpContext.GetPar( "sGXsfl_23_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridmaquinas_newrow( ) ;
      /* End function gxnrGridmaquinas_newrow_invoke */
   }

   public void gxgrgridmaquinas_refresh_invoke( )
   {
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV14MaqCodVisible);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV7SDTMaquinaCollection);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV5SDTMaquina);
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridmaquinas_refresh( AV14MaqCodVisible, AV7SDTMaquinaCollection, AV5SDTMaquina) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridmaquinas_refresh_invoke */
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
      paBQ2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startBQ2( ) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.programacionmaquinas", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTMAQUINACOLLECTION", getSecureSignedToken( "", AV7SDTMaquinaCollection));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTMAQUINA", getSecureSignedToken( "", AV5SDTMaquina));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdtmaquina", AV5SDTMaquina);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdtmaquina", AV5SDTMaquina);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Sdtmaquina", getSecureSignedToken( "", AV5SDTMaquina));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdthdrspormaquina", AV6SDTHdrsporMaquina);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdthdrspormaquina", AV6SDTHdrsporMaquina);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_23", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_23, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV15DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV15DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCODVISIBLE_DATA", AV13MaqCodVisible_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCODVISIBLE_DATA", AV13MaqCodVisible_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTMAQUINACOLLECTION", AV7SDTMaquinaCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTMAQUINACOLLECTION", AV7SDTMaquinaCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTMAQUINACOLLECTION", getSecureSignedToken( "", AV7SDTMaquinaCollection));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTMAQUINA", AV5SDTMaquina);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTMAQUINA", AV5SDTMaquina);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTMAQUINA", getSecureSignedToken( "", AV5SDTMaquina));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCODVISIBLE", AV14MaqCodVisible);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCODVISIBLE", AV14MaqCodVisible);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODVISIBLE_Cls", GXutil.rtrim( Combo_maqcodvisible_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODVISIBLE_Selectedvalue_set", GXutil.rtrim( Combo_maqcodvisible_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODVISIBLE_Allowmultipleselection", GXutil.booltostr( Combo_maqcodvisible_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODVISIBLE_Includeonlyselectedoption", GXutil.booltostr( Combo_maqcodvisible_Includeonlyselectedoption));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODVISIBLE_Emptyitem", GXutil.booltostr( Combo_maqcodvisible_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODVISIBLE_Multiplevaluestype", GXutil.rtrim( Combo_maqcodvisible_Multiplevaluestype));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODVISIBLE_Onlyselectedvalues", GXutil.rtrim( Combo_maqcodvisible_Onlyselectedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODVISIBLE_Selectalltext", GXutil.rtrim( Combo_maqcodvisible_Selectalltext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODVISIBLE_Multiplevaluesseparator", GXutil.rtrim( Combo_maqcodvisible_Multiplevaluesseparator));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODVISIBLE_Selectedvalue_get", GXutil.rtrim( Combo_maqcodvisible_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODVISIBLE_Selectedvalue_get", GXutil.rtrim( Combo_maqcodvisible_Selectedvalue_get));
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
         weBQ2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtBQ2( ) ;
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
      return formatLink("app.programacionmaquinas", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ProgramacionMaquinas" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Programacion Maquinas", "") ;
   }

   public void wbBQ0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", divTablecontent_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqcodvisible_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_maqcodvisible_Internalname, httpContext.getMessage( "Maquinas", ""), "", "", lblTextblockcombo_maqcodvisible_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ProgramacionMaquinas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_maqcodvisible.setProperty("Caption", Combo_maqcodvisible_Caption);
         ucCombo_maqcodvisible.setProperty("Cls", Combo_maqcodvisible_Cls);
         ucCombo_maqcodvisible.setProperty("AllowMultipleSelection", Combo_maqcodvisible_Allowmultipleselection);
         ucCombo_maqcodvisible.setProperty("IncludeOnlySelectedOption", Combo_maqcodvisible_Includeonlyselectedoption);
         ucCombo_maqcodvisible.setProperty("EmptyItem", Combo_maqcodvisible_Emptyitem);
         ucCombo_maqcodvisible.setProperty("MultipleValuesType", Combo_maqcodvisible_Multiplevaluestype);
         ucCombo_maqcodvisible.setProperty("OnlySelectedValues", Combo_maqcodvisible_Onlyselectedvalues);
         ucCombo_maqcodvisible.setProperty("SelectAllText", Combo_maqcodvisible_Selectalltext);
         ucCombo_maqcodvisible.setProperty("MultipleValuesSeparator", Combo_maqcodvisible_Multiplevaluesseparator);
         ucCombo_maqcodvisible.setProperty("DropDownOptionsTitleSettingsIcons", AV15DDO_TitleSettingsIcons);
         ucCombo_maqcodvisible.setProperty("DropDownOptionsData", AV13MaqCodVisible_Data);
         ucCombo_maqcodvisible.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcodvisible_Internalname, "COMBO_MAQCODVISIBLEContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridmaquinasContainer.SetIsFreestyle(true);
         GridmaquinasContainer.SetWrapped(nGXWrapped);
         startgridcontrol23( ) ;
      }
      if ( wbEnd == 23 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_23 = (int)(nGXsfl_23_idx-1) ;
         if ( GridmaquinasContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridmaquinasContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridmaquinas", GridmaquinasContainer, subGridmaquinas_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridmaquinasContainerData", GridmaquinasContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridmaquinasContainerData"+"V", GridmaquinasContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridmaquinasContainerData"+"V"+"\" value='"+GridmaquinasContainer.GridValuesHidden()+"'/>") ;
            }
         }
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
      if ( wbEnd == 23 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridmaquinasContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"GridmaquinasContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridmaquinas", GridmaquinasContainer, subGridmaquinas_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridmaquinasContainerData", GridmaquinasContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridmaquinasContainerData"+"V", GridmaquinasContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridmaquinasContainerData"+"V"+"\" value='"+GridmaquinasContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      if ( wbEnd == 34 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridhdrsContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"GridhdrsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridhdrs", GridhdrsContainer, subGridhdrs_Internalname);
               if ( ! isAjaxCallMode( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridhdrsContainerData", GridhdrsContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridhdrsContainerData"+"V", GridhdrsContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridhdrsContainerData"+"V"+"\" value='"+GridhdrsContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void startBQ2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Programacion Maquinas", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupBQ0( ) ;
   }

   public void wsBQ2( )
   {
      startBQ2( ) ;
      evtBQ2( ) ;
   }

   public void evtBQ2( )
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
                        else if ( GXutil.strcmp(sEvt, "COMBO_MAQCODVISIBLE.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e11BQ2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 17), "GRIDMAQUINAS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "'PDF'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "GRIDHDRS.LOAD") == 0 ) )
                        {
                           nGXsfl_23_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_232( ) ;
                           AV5SDTMaquina.setgxTv_SdtSDTMaquina_Maqdsc( httpContext.cgiGet( edtavSdtmaquina_maqdsc_Internalname) );
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e12BQ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDMAQUINAS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e13BQ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e14BQ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'PDF'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'PDF' */
                                 e15BQ2 ();
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
                              sEvtType = GXutil.right( sEvt, 4) ;
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                              if ( GXutil.strcmp(GXutil.left( sEvt, 13), "GRIDHDRS.LOAD") == 0 )
                              {
                                 nGXsfl_34_idx = (int)(GXutil.lval( sEvtType)) ;
                                 sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") + sGXsfl_23_idx ;
                                 subsflControlProps_343( ) ;
                                 AV6SDTHdrsporMaquina.setgxTv_SdtSDTHdrsporMaquina_Barcolnom( httpContext.cgiGet( edtavSdthdrspormaquina_barcolnom_Internalname) );
                                 AV6SDTHdrsporMaquina.setgxTv_SdtSDTHdrsporMaquina_Barnomcli( httpContext.cgiGet( edtavSdthdrspormaquina_barnomcli_Internalname) );
                                 AV6SDTHdrsporMaquina.setgxTv_SdtSDTHdrsporMaquina_Barkgs( localUtil.ctond( httpContext.cgiGet( edtavSdthdrspormaquina_barkgs_Internalname)) );
                                 AV6SDTHdrsporMaquina.setgxTv_SdtSDTHdrsporMaquina_Clinom( httpContext.cgiGet( edtavSdthdrspormaquina_clinom_Internalname) );
                                 AV6SDTHdrsporMaquina.setgxTv_SdtSDTHdrsporMaquina_Barser( httpContext.cgiGet( edtavSdthdrspormaquina_barser_Internalname) );
                                 AV6SDTHdrsporMaquina.setgxTv_SdtSDTHdrsporMaquina_Barserdsc( httpContext.cgiGet( edtavSdthdrspormaquina_barserdsc_Internalname) );
                                 AV6SDTHdrsporMaquina.setgxTv_SdtSDTHdrsporMaquina_Barhdr( httpContext.cgiGet( edtavSdthdrspormaquina_barhdr_Internalname) );
                                 AV6SDTHdrsporMaquina.setgxTv_SdtSDTHdrsporMaquina_Barfasest( (byte)(localUtil.ctol( httpContext.cgiGet( edtavSdthdrspormaquina_barfasest_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
                                 sEvtType = GXutil.right( sEvt, 1) ;
                                 if ( GXutil.strcmp(sEvtType, ".") == 0 )
                                 {
                                    sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                                    if ( GXutil.strcmp(sEvt, "GRIDHDRS.LOAD") == 0 )
                                    {
                                       httpContext.wbHandled = (byte)(1) ;
                                       dynload_actions( ) ;
                                       e16BQ3 ();
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
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void weBQ2( )
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

   public void paBQ2( )
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

   public void gxnrgridmaquinas_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_232( ) ;
      while ( nGXsfl_23_idx <= nRC_GXsfl_23 )
      {
         sendrow_232( ) ;
         nGXsfl_23_idx = ((subGridmaquinas_Islastpage==1)&&(nGXsfl_23_idx+1>subgridmaquinas_fnc_recordsperpage( )) ? 1 : nGXsfl_23_idx+1) ;
         sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_232( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridmaquinasContainer)) ;
      /* End function gxnrGridmaquinas_newrow */
   }

   public void gxnrgridhdrs_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_343( ) ;
      while ( nGXsfl_34_idx <= nRC_GXsfl_34 )
      {
         sendrow_343( ) ;
         nGXsfl_34_idx = ((subGridhdrs_Islastpage==1)&&(nGXsfl_34_idx+1>subgridhdrs_fnc_recordsperpage( )) ? 1 : nGXsfl_34_idx+1) ;
         sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") + sGXsfl_23_idx ;
         subsflControlProps_343( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridhdrsContainer)) ;
      /* End function gxnrGridhdrs_newrow */
   }

   public void gxgrgridhdrs_refresh( GXSimpleCollection<String> AV14MaqCodVisible ,
                                     app.SdtSDTMaquina AV5SDTMaquina ,
                                     GXBaseCollection<app.SdtSDTMaquina> AV7SDTMaquinaCollection )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e14BQ2 ();
      GRIDHDRS_nCurrentRecord = 0 ;
      rfBQ3( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridhdrs_refresh */
   }

   public void gxgrgridmaquinas_refresh( GXSimpleCollection<String> AV14MaqCodVisible ,
                                         GXBaseCollection<app.SdtSDTMaquina> AV7SDTMaquinaCollection ,
                                         app.SdtSDTMaquina AV5SDTMaquina )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e14BQ2 ();
      GRIDMAQUINAS_nCurrentRecord = 0 ;
      rfBQ2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridmaquinas_refresh */
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
      rfBQ2( ) ;
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
      edtavSdtmaquina_maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtmaquina_maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtmaquina_maqdsc_Enabled), 5, 0), !bGXsfl_23_Refreshing);
      edtavSdthdrspormaquina_barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrspormaquina_barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrspormaquina_barcolnom_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavSdthdrspormaquina_barnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrspormaquina_barnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrspormaquina_barnomcli_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavSdthdrspormaquina_barkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrspormaquina_barkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrspormaquina_barkgs_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavSdthdrspormaquina_clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrspormaquina_clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrspormaquina_clinom_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavSdthdrspormaquina_barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrspormaquina_barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrspormaquina_barser_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavSdthdrspormaquina_barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrspormaquina_barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrspormaquina_barserdsc_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavSdthdrspormaquina_barhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrspormaquina_barhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrspormaquina_barhdr_Enabled), 5, 0), !bGXsfl_34_Refreshing);
   }

   public void rfBQ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridmaquinasContainer.ClearRows();
      }
      wbStart = (short)(23) ;
      /* Execute user event: Refresh */
      e14BQ2 ();
      nGXsfl_23_idx = 1 ;
      sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_232( ) ;
      bGXsfl_23_Refreshing = true ;
      GridmaquinasContainer.AddObjectProperty("GridName", "Gridmaquinas");
      GridmaquinasContainer.AddObjectProperty("CmpContext", "");
      GridmaquinasContainer.AddObjectProperty("InMasterPage", "false");
      GridmaquinasContainer.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
      GridmaquinasContainer.AddObjectProperty("Class", "FreeStyleGrid");
      GridmaquinasContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridmaquinasContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridmaquinasContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridmaquinasContainer.setPageSize( subgridmaquinas_fnc_recordsperpage( ) );
      if ( subGridhdrs_Islastpage != 0 )
      {
         GRIDHDRS_nFirstRecordOnPage = (long)(subgridhdrs_fnc_recordcount( )-subgridhdrs_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRIDHDRS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDHDRS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("GRIDHDRS_nFirstRecordOnPage", GRIDHDRS_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_232( ) ;
         e13BQ2 ();
         wbEnd = (short)(23) ;
         wbBQ0( ) ;
      }
      bGXsfl_23_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesBQ2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTMAQUINACOLLECTION", AV7SDTMaquinaCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTMAQUINACOLLECTION", AV7SDTMaquinaCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTMAQUINACOLLECTION", getSecureSignedToken( "", AV7SDTMaquinaCollection));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTMAQUINA", AV5SDTMaquina);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTMAQUINA", AV5SDTMaquina);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTMAQUINA", getSecureSignedToken( "", AV5SDTMaquina));
   }

   public void rfBQ3( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridhdrsContainer.ClearRows();
      }
      wbStart = (short)(34) ;
      nGXsfl_34_idx = 1 ;
      sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") + sGXsfl_23_idx ;
      subsflControlProps_343( ) ;
      bGXsfl_34_Refreshing = true ;
      GridhdrsContainer.AddObjectProperty("GridName", "Gridhdrs");
      GridhdrsContainer.AddObjectProperty("CmpContext", "");
      GridhdrsContainer.AddObjectProperty("InMasterPage", "false");
      GridhdrsContainer.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
      GridhdrsContainer.AddObjectProperty("Class", "FreeStyleGrid");
      GridhdrsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridhdrsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridhdrsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridhdrsContainer.setPageSize( subgridhdrs_fnc_recordsperpage( ) );
      GXCCtl = "GRIDHDRS_nFirstRecordOnPage_" + sGXsfl_23_idx ;
      if ( subGridhdrs_Islastpage != 0 )
      {
         GRIDHDRS_nFirstRecordOnPage = (long)(subgridhdrs_fnc_recordcount( )-subgridhdrs_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRIDHDRS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("GRIDHDRS_nFirstRecordOnPage", GRIDHDRS_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_343( ) ;
         e16BQ3 ();
         wbEnd = (short)(34) ;
         wbBQ0( ) ;
      }
      bGXsfl_34_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesBQ3( )
   {
   }

   public int subgridmaquinas_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgridmaquinas_fnc_recordcount( )
   {
      return -1 ;
   }

   public int subgridmaquinas_fnc_recordsperpage( )
   {
      return -1 ;
   }

   public int subgridmaquinas_fnc_currentpage( )
   {
      return -1 ;
   }

   public int subgridhdrs_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgridhdrs_fnc_recordcount( )
   {
      return -1 ;
   }

   public int subgridhdrs_fnc_recordsperpage( )
   {
      return -1 ;
   }

   public int subgridhdrs_fnc_currentpage( )
   {
      return -1 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavSdtmaquina_maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtmaquina_maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtmaquina_maqdsc_Enabled), 5, 0), !bGXsfl_23_Refreshing);
      edtavSdthdrspormaquina_barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrspormaquina_barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrspormaquina_barcolnom_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavSdthdrspormaquina_barnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrspormaquina_barnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrspormaquina_barnomcli_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavSdthdrspormaquina_barkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrspormaquina_barkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrspormaquina_barkgs_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavSdthdrspormaquina_clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrspormaquina_clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrspormaquina_clinom_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavSdthdrspormaquina_barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrspormaquina_barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrspormaquina_barser_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavSdthdrspormaquina_barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrspormaquina_barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrspormaquina_barserdsc_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavSdthdrspormaquina_barhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrspormaquina_barhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrspormaquina_barhdr_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupBQ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e12BQ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdtmaquina"), AV5SDTMaquina);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdthdrspormaquina"), AV6SDTHdrsporMaquina);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV15DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCODVISIBLE_DATA"), AV13MaqCodVisible_Data);
         /* Read saved values. */
         nRC_GXsfl_23 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_23"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Combo_maqcodvisible_Cls = httpContext.cgiGet( "COMBO_MAQCODVISIBLE_Cls") ;
         Combo_maqcodvisible_Selectedvalue_set = httpContext.cgiGet( "COMBO_MAQCODVISIBLE_Selectedvalue_set") ;
         Combo_maqcodvisible_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCODVISIBLE_Allowmultipleselection")) ;
         Combo_maqcodvisible_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCODVISIBLE_Includeonlyselectedoption")) ;
         Combo_maqcodvisible_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCODVISIBLE_Emptyitem")) ;
         Combo_maqcodvisible_Multiplevaluestype = httpContext.cgiGet( "COMBO_MAQCODVISIBLE_Multiplevaluestype") ;
         Combo_maqcodvisible_Onlyselectedvalues = httpContext.cgiGet( "COMBO_MAQCODVISIBLE_Onlyselectedvalues") ;
         Combo_maqcodvisible_Selectalltext = httpContext.cgiGet( "COMBO_MAQCODVISIBLE_Selectalltext") ;
         Combo_maqcodvisible_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_MAQCODVISIBLE_Multiplevaluesseparator") ;
         Combo_maqcodvisible_Selectedvalue_get = httpContext.cgiGet( "COMBO_MAQCODVISIBLE_Selectedvalue_get") ;
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
      e12BQ2 ();
      if (returnInSub) return;
   }

   public void e12BQ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons1 = AV15DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons2[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons1;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons2) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons1 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons2[0] ;
      AV15DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons1;
      /* Execute user subroutine: 'LOADCOMBOMAQCODVISIBLE' */
      S112 ();
      if (returnInSub) return;
      divTablecontent_Class = httpContext.getMessage( "TableContent", "") ;
      httpContext.ajax_rsp_assign_prop("", false, divTablecontent_Internalname, "Class", divTablecontent_Class, true);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons1 = AV15DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons2[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons1;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons2) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons1 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons2[0] ;
      AV15DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons1;
      /* Execute user subroutine: 'LOADCOMBOMAQCODVISIBLE' */
      S112 ();
      if (returnInSub) return;
   }

   private void e13BQ2( )
   {
      /* Gridmaquinas_Load Routine */
      returnInSub = false ;
      AV28GXV10 = 1 ;
      while ( AV28GXV10 <= AV7SDTMaquinaCollection.size() )
      {
         AV5SDTMaquina = (app.SdtSDTMaquina)((app.SdtSDTMaquina)AV7SDTMaquinaCollection.elementAt(-1+AV28GXV10));
         AV11Maqcod = AV5SDTMaquina.getgxTv_SdtSDTMaquina_Maqcod() ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(23) ;
         }
         sendrow_232( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_23_Refreshing )
         {
            httpContext.doAjaxLoad(23, GridmaquinasRow);
         }
         AV28GXV10 = (int)(AV28GXV10+1) ;
      }
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('FALSE',41) ]
         Target    : [ t('Barcod',23),t('Visible',3) ]
         ForType   : 29
         Type      : []
      */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('FALSE',41) ]
         Target    : [ t('Barcodreo',23),t('Visible',3) ]
         ForType   : 29
         Type      : []
      */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('FALSE',41) ]
         Target    : [ t('Barcodpar',23),t('Visible',3) ]
         ForType   : 29
         Type      : []
      */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('FALSE',41) ]
         Target    : [ t('Maqcod',23),t('Visible',3) ]
         ForType   : 29
         Type      : []
      */
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5SDTMaquina", AV5SDTMaquina);
   }

   public void e11BQ2( )
   {
      /* Combo_maqcodvisible_Onoptionclicked Routine */
      returnInSub = false ;
      AV14MaqCodVisible.fromJSonString(Combo_maqcodvisible_Selectedvalue_get, null);
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14MaqCodVisible", AV14MaqCodVisible);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV7SDTMaquinaCollection", AV7SDTMaquinaCollection);
   }

   public void S112( )
   {
      /* 'LOADCOMBOMAQCODVISIBLE' Routine */
      returnInSub = false ;
      /* Using cursor H00BQ2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A607MaqEst = H00BQ2_A607MaqEst[0] ;
         n607MaqEst = H00BQ2_n607MaqEst[0] ;
         A6432MaqPln = H00BQ2_A6432MaqPln[0] ;
         n6432MaqPln = H00BQ2_n6432MaqPln[0] ;
         A620MaqTip = H00BQ2_A620MaqTip[0] ;
         n620MaqTip = H00BQ2_n620MaqTip[0] ;
         A602MaqCod = H00BQ2_A602MaqCod[0] ;
         A606MaqDsc = H00BQ2_A606MaqDsc[0] ;
         n606MaqDsc = H00BQ2_n606MaqDsc[0] ;
         AV12Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV12Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A602MaqCod );
         AV12Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A606MaqDsc );
         AV14MaqCodVisible.add(A602MaqCod, 0);
         AV13MaqCodVisible_Data.add(AV12Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Combo_maqcodvisible_Selectedvalue_set = AV14MaqCodVisible.toJSonString(false) ;
      ucCombo_maqcodvisible.sendProperty(context, "", false, Combo_maqcodvisible_Internalname, "SelectedValue_set", Combo_maqcodvisible_Selectedvalue_set);
      /* Using cursor H00BQ3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A607MaqEst = H00BQ3_A607MaqEst[0] ;
         n607MaqEst = H00BQ3_n607MaqEst[0] ;
         A6432MaqPln = H00BQ3_A6432MaqPln[0] ;
         n6432MaqPln = H00BQ3_n6432MaqPln[0] ;
         A620MaqTip = H00BQ3_A620MaqTip[0] ;
         n620MaqTip = H00BQ3_n620MaqTip[0] ;
         A602MaqCod = H00BQ3_A602MaqCod[0] ;
         A606MaqDsc = H00BQ3_A606MaqDsc[0] ;
         n606MaqDsc = H00BQ3_n606MaqDsc[0] ;
         AV12Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV12Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A602MaqCod );
         AV12Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A606MaqDsc );
         AV13MaqCodVisible_Data.add(AV12Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      Combo_maqcodvisible_Selectedvalue_set = AV14MaqCodVisible.toJSonString(false) ;
      ucCombo_maqcodvisible.sendProperty(context, "", false, Combo_maqcodvisible_Internalname, "SelectedValue_set", Combo_maqcodvisible_Selectedvalue_set);
   }

   public void e14BQ2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXt_objcol_SdtSDTMaquina3 = AV7SDTMaquinaCollection ;
      GXv_objcol_SdtSDTMaquina4[0] = GXt_objcol_SdtSDTMaquina3 ;
      new app.dpmaquina(remoteHandle, context).execute( "001", AV14MaqCodVisible, false, GXv_objcol_SdtSDTMaquina4) ;
      GXt_objcol_SdtSDTMaquina3 = GXv_objcol_SdtSDTMaquina4[0] ;
      AV7SDTMaquinaCollection = GXt_objcol_SdtSDTMaquina3 ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV7SDTMaquinaCollection", AV7SDTMaquinaCollection);
   }

   public void e15BQ2( )
   {
      /* 'PDF' Routine */
      returnInSub = false ;
      AV16WebSession.setValue(httpContext.getMessage( "ProgramacionMaquinas_MaquinasVisibles", ""), AV14MaqCodVisible.toJSonString(false));
      callWebObject(formatLink("app.programacionmaquinaspdf", new String[] {GXutil.URLEncode(GXutil.rtrim("001"))}, new String[] {"EmprCod"}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   private void e16BQ3( )
   {
      /* Gridhdrs_Load Routine */
      returnInSub = false ;
      AV29GXV11 = 1 ;
      while ( AV29GXV11 <= AV5SDTMaquina.getgxTv_SdtSDTMaquina_Sdthdrspormaquina().size() )
      {
         AV6SDTHdrsporMaquina = (app.SdtSDTHdrsporMaquina)((app.SdtSDTHdrsporMaquina)AV5SDTMaquina.getgxTv_SdtSDTMaquina_Sdthdrspormaquina().elementAt(-1+AV29GXV11));
         AV8BarCod = AV6SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barcod() ;
         AV9BarCodReo = AV6SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barcodreo() ;
         AV10BarCodPar = AV6SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barcodpar() ;
         tblTblhdr_Backcolor = (int)(AV6SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barrgb()) ;
         httpContext.ajax_rsp_assign_prop("", false, tblTblhdr_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(tblTblhdr_Backcolor), 9, 0), !bGXsfl_34_Refreshing);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(34) ;
         }
         sendrow_343( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_34_Refreshing )
         {
            httpContext.doAjaxLoad(34, GridhdrsRow);
         }
         AV29GXV11 = (int)(AV29GXV11+1) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6SDTHdrsporMaquina", AV6SDTHdrsporMaquina);
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
      paBQ2( ) ;
      wsBQ2( ) ;
      weBQ2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714184730", true, true);
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
         httpContext.AddJavascriptSource("programacionmaquinas.js", "?202681714184730", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_343( )
   {
      edtavSdthdrspormaquina_barcolnom_Internalname = "SDTHDRSPORMAQUINA_BARCOLNOM_"+sGXsfl_34_idx ;
      edtavSdthdrspormaquina_barnomcli_Internalname = "SDTHDRSPORMAQUINA_BARNOMCLI_"+sGXsfl_34_idx ;
      edtavSdthdrspormaquina_barkgs_Internalname = "SDTHDRSPORMAQUINA_BARKGS_"+sGXsfl_34_idx ;
      edtavSdthdrspormaquina_clinom_Internalname = "SDTHDRSPORMAQUINA_CLINOM_"+sGXsfl_34_idx ;
      edtavSdthdrspormaquina_barser_Internalname = "SDTHDRSPORMAQUINA_BARSER_"+sGXsfl_34_idx ;
      edtavSdthdrspormaquina_barserdsc_Internalname = "SDTHDRSPORMAQUINA_BARSERDSC_"+sGXsfl_34_idx ;
      edtavSdthdrspormaquina_barhdr_Internalname = "SDTHDRSPORMAQUINA_BARHDR_"+sGXsfl_34_idx ;
      edtavSdthdrspormaquina_barfasest_Internalname = "SDTHDRSPORMAQUINA_BARFASEST_"+sGXsfl_34_idx ;
   }

   public void subsflControlProps_fel_343( )
   {
      edtavSdthdrspormaquina_barcolnom_Internalname = "SDTHDRSPORMAQUINA_BARCOLNOM_"+sGXsfl_34_fel_idx ;
      edtavSdthdrspormaquina_barnomcli_Internalname = "SDTHDRSPORMAQUINA_BARNOMCLI_"+sGXsfl_34_fel_idx ;
      edtavSdthdrspormaquina_barkgs_Internalname = "SDTHDRSPORMAQUINA_BARKGS_"+sGXsfl_34_fel_idx ;
      edtavSdthdrspormaquina_clinom_Internalname = "SDTHDRSPORMAQUINA_CLINOM_"+sGXsfl_34_fel_idx ;
      edtavSdthdrspormaquina_barser_Internalname = "SDTHDRSPORMAQUINA_BARSER_"+sGXsfl_34_fel_idx ;
      edtavSdthdrspormaquina_barserdsc_Internalname = "SDTHDRSPORMAQUINA_BARSERDSC_"+sGXsfl_34_fel_idx ;
      edtavSdthdrspormaquina_barhdr_Internalname = "SDTHDRSPORMAQUINA_BARHDR_"+sGXsfl_34_fel_idx ;
      edtavSdthdrspormaquina_barfasest_Internalname = "SDTHDRSPORMAQUINA_BARFASEST_"+sGXsfl_34_fel_idx ;
   }

   public void sendrow_343( )
   {
      subsflControlProps_343( ) ;
      wbBQ0( ) ;
      GridhdrsRow = GXWebRow.GetNew(context,GridhdrsContainer) ;
      if ( subGridhdrs_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridhdrs_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridhdrs_Class, "") != 0 )
         {
            subGridhdrs_Linesclass = subGridhdrs_Class+"Odd" ;
         }
      }
      else if ( subGridhdrs_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridhdrs_Backstyle = (byte)(0) ;
         subGridhdrs_Backcolor = subGridhdrs_Allbackcolor ;
         if ( GXutil.strcmp(subGridhdrs_Class, "") != 0 )
         {
            subGridhdrs_Linesclass = subGridhdrs_Class+"Uniform" ;
         }
      }
      else if ( subGridhdrs_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridhdrs_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridhdrs_Class, "") != 0 )
         {
            subGridhdrs_Linesclass = subGridhdrs_Class+"Odd" ;
         }
         subGridhdrs_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGridhdrs_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridhdrs_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_34_idx) % (2))) == 0 )
         {
            subGridhdrs_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridhdrs_Class, "") != 0 )
            {
               subGridhdrs_Linesclass = subGridhdrs_Class+"Even" ;
            }
         }
         else
         {
            subGridhdrs_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGridhdrs_Class, "") != 0 )
            {
               subGridhdrs_Linesclass = subGridhdrs_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGridhdrs_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_34_idx+"\">") ;
      }
      /* Table start */
      GridhdrsRow.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblUnnamedtablefsgridhdrs_Internalname+"_"+sGXsfl_34_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      GridhdrsRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridhdrsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      GridhdrsRow.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTblhdr_Internalname+"_"+sGXsfl_34_idx,Integer.valueOf(1),"","",Integer.valueOf(tblTblhdr_Backcolor),"","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      GridhdrsRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridhdrsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      GridhdrsRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavSdthdrspormaquina_barcolnom_Internalname,httpContext.getMessage( "Nombre Color", ""),"gx-form-item ReadonlyAttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Single line edit */
      ROClassString = "ReadonlyAttribute" ;
      GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrspormaquina_barcolnom_Internalname,GXutil.rtrim( AV6SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barcolnom()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrspormaquina_barcolnom_Jsonclick,Integer.valueOf(0),"ReadonlyAttribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtavSdthdrspormaquina_barcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(13),"chr",Integer.valueOf(1),"row",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("cell");
      }
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("row");
      }
      GridhdrsRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridhdrsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      GridhdrsRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavSdthdrspormaquina_barnomcli_Internalname,httpContext.getMessage( "Nombre Color Cliente", ""),"gx-form-item ReadonlyAttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Single line edit */
      ROClassString = "ReadonlyAttribute" ;
      GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrspormaquina_barnomcli_Internalname,GXutil.rtrim( AV6SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barnomcli()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrspormaquina_barnomcli_Jsonclick,Integer.valueOf(0),"ReadonlyAttribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtavSdthdrspormaquina_barnomcli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(13),"chr",Integer.valueOf(1),"row",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("cell");
      }
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("row");
      }
      GridhdrsRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridhdrsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      GridhdrsRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavSdthdrspormaquina_barkgs_Internalname,httpContext.getMessage( "Kgs Hdr", ""),"gx-form-item ReadonlyAttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Single line edit */
      ROClassString = "ReadonlyAttribute" ;
      GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrspormaquina_barkgs_Internalname,GXutil.ltrim( localUtil.ntoc( AV6SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barkgs(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdthdrspormaquina_barkgs_Enabled!=0) ? localUtil.format( AV6SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barkgs(), "ZZZZZ9.99") : localUtil.format( AV6SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barkgs(), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrspormaquina_barkgs_Jsonclick,Integer.valueOf(0),"ReadonlyAttribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtavSdthdrspormaquina_barkgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(9),"chr",Integer.valueOf(1),"row",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("cell");
      }
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("row");
      }
      GridhdrsRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridhdrsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      GridhdrsRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavSdthdrspormaquina_clinom_Internalname,httpContext.getMessage( "Nombre Cliente", ""),"gx-form-item ReadonlyAttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Single line edit */
      ROClassString = "ReadonlyAttribute" ;
      GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrspormaquina_clinom_Internalname,GXutil.rtrim( AV6SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Clinom()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrspormaquina_clinom_Jsonclick,Integer.valueOf(0),"ReadonlyAttribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtavSdthdrspormaquina_clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(30),"chr",Integer.valueOf(1),"row",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("cell");
      }
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("row");
      }
      GridhdrsRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridhdrsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      GridhdrsRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavSdthdrspormaquina_barser_Internalname,httpContext.getMessage( "Serie", ""),"gx-form-item ReadonlyAttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Single line edit */
      ROClassString = "ReadonlyAttribute" ;
      GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrspormaquina_barser_Internalname,GXutil.rtrim( AV6SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barser()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrspormaquina_barser_Jsonclick,Integer.valueOf(0),"ReadonlyAttribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtavSdthdrspormaquina_barser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(16),"chr",Integer.valueOf(1),"row",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("cell");
      }
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("row");
      }
      GridhdrsRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridhdrsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      GridhdrsRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavSdthdrspormaquina_barserdsc_Internalname,httpContext.getMessage( "Descripción Serie", ""),"gx-form-item ReadonlyAttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Single line edit */
      ROClassString = "ReadonlyAttribute" ;
      GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrspormaquina_barserdsc_Internalname,GXutil.rtrim( AV6SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barserdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrspormaquina_barserdsc_Jsonclick,Integer.valueOf(0),"ReadonlyAttribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtavSdthdrspormaquina_barserdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(26),"chr",Integer.valueOf(1),"row",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("cell");
      }
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("row");
      }
      GridhdrsRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridhdrsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      sendrow_34330( ) ;
   }

   public void sendrow_34330( )
   {
      /* Attribute/Variable Label */
      GridhdrsRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavSdthdrspormaquina_barhdr_Internalname,httpContext.getMessage( "Hdr", ""),"gx-form-item ReadonlyAttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Single line edit */
      ROClassString = "ReadonlyAttribute" ;
      GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrspormaquina_barhdr_Internalname,GXutil.rtrim( AV6SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barhdr()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrspormaquina_barhdr_Jsonclick,Integer.valueOf(0),"ReadonlyAttribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtavSdthdrspormaquina_barhdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(10),"chr",Integer.valueOf(1),"row",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("cell");
      }
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("row");
      }
      GridhdrsRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridhdrsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group gx-default-form-group","left","top",""+" data-gx-for=\""+edtavSdthdrspormaquina_barfasest_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      GridhdrsRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavSdthdrspormaquina_barfasest_Internalname,httpContext.getMessage( "Estado", ""),"gx-form-item AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),"width: 25%;"});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(75),"%",Integer.valueOf(0),"px","gx-form-item gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " " + ((edtavSdthdrspormaquina_barfasest_Enabled!=0)&&(edtavSdthdrspormaquina_barfasest_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 71,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
      ROClassString = "Attribute" ;
      GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrspormaquina_barfasest_Internalname,GXutil.ltrim( localUtil.ntoc( AV6SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barfasest(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barfasest()), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavSdthdrspormaquina_barfasest_Enabled!=0)&&(edtavSdthdrspormaquina_barfasest_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrspormaquina_barfasest_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),"text","1",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("cell");
      }
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("row");
      }
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("table");
      }
      /* End of table */
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("cell");
      }
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("row");
      }
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("table");
      }
      /* End of table */
      send_integrity_lvl_hashesBQ3( ) ;
      /* End of Columns property logic. */
      GridhdrsContainer.AddRow(GridhdrsRow);
      nGXsfl_34_idx = ((subGridhdrs_Islastpage==1)&&(nGXsfl_34_idx+1>subgridhdrs_fnc_recordsperpage( )) ? 1 : nGXsfl_34_idx+1) ;
      sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") + sGXsfl_23_idx ;
      subsflControlProps_343( ) ;
      /* End function sendrow_343 */
   }

   public void subsflControlProps_232( )
   {
      edtavSdtmaquina_maqdsc_Internalname = "SDTMAQUINA_MAQDSC_"+sGXsfl_23_idx ;
      subGridhdrs_Internalname = "GRIDHDRS_"+sGXsfl_23_idx ;
   }

   public void subsflControlProps_fel_232( )
   {
      edtavSdtmaquina_maqdsc_Internalname = "SDTMAQUINA_MAQDSC_"+sGXsfl_23_fel_idx ;
      subGridhdrs_Internalname = "GRIDHDRS_"+sGXsfl_23_fel_idx ;
   }

   public void sendrow_232( )
   {
      subsflControlProps_232( ) ;
      wbBQ0( ) ;
      GridmaquinasRow = GXWebRow.GetNew(context,GridmaquinasContainer) ;
      if ( subGridmaquinas_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridmaquinas_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridmaquinas_Class, "") != 0 )
         {
            subGridmaquinas_Linesclass = subGridmaquinas_Class+"Odd" ;
         }
      }
      else if ( subGridmaquinas_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridmaquinas_Backstyle = (byte)(0) ;
         subGridmaquinas_Backcolor = subGridmaquinas_Allbackcolor ;
         if ( GXutil.strcmp(subGridmaquinas_Class, "") != 0 )
         {
            subGridmaquinas_Linesclass = subGridmaquinas_Class+"Uniform" ;
         }
      }
      else if ( subGridmaquinas_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridmaquinas_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridmaquinas_Class, "") != 0 )
         {
            subGridmaquinas_Linesclass = subGridmaquinas_Class+"Odd" ;
         }
         subGridmaquinas_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGridmaquinas_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridmaquinas_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_23_idx) % (2))) == 0 )
         {
            subGridmaquinas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridmaquinas_Class, "") != 0 )
            {
               subGridmaquinas_Linesclass = subGridmaquinas_Class+"Even" ;
            }
         }
         else
         {
            subGridmaquinas_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGridmaquinas_Class, "") != 0 )
            {
               subGridmaquinas_Linesclass = subGridmaquinas_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( GridmaquinasContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGridmaquinas_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_23_idx+"\">") ;
      }
      /* Table start */
      GridmaquinasRow.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblUnnamedtablefsgridmaquinas_Internalname+"_"+sGXsfl_23_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      GridmaquinasRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridmaquinasRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      GridmaquinasRow.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTblmaquina_Internalname+"_"+sGXsfl_23_idx,Integer.valueOf(1),"","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      GridmaquinasRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridmaquinasRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GridmaquinasRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      GridmaquinasRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavSdtmaquina_maqdsc_Internalname,httpContext.getMessage( "Descripcion Maquina", ""),"gx-form-item ReadonlyAttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Single line edit */
      ROClassString = "ReadonlyAttribute" ;
      GridmaquinasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtmaquina_maqdsc_Internalname,GXutil.rtrim( AV5SDTMaquina.getgxTv_SdtSDTMaquina_Maqdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtmaquina_maqdsc_Jsonclick,Integer.valueOf(0),"ReadonlyAttribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtavSdtmaquina_maqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(16),"chr",Integer.valueOf(1),"row",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(23),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      GridmaquinasRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GridmaquinasContainer.GetWrapped() == 1 )
      {
         GridmaquinasContainer.CloseTag("cell");
      }
      if ( GridmaquinasContainer.GetWrapped() == 1 )
      {
         GridmaquinasContainer.CloseTag("row");
      }
      GridmaquinasRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridmaquinasRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /*  Child Grid Control  */
      GridmaquinasRow.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"GridhdrsContainer"});
      if ( isAjaxCallMode( ) )
      {
         GridhdrsContainer = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         GridhdrsContainer.Clear();
      }
      GridhdrsContainer.SetIsFreestyle(true);
      GridhdrsContainer.SetWrapped(nGXWrapped);
      startgridcontrol34( ) ;
      rfBQ3( ) ;
      nRC_GXsfl_34 = (int)(nGXsfl_34_idx-1) ;
      send_integrity_footer_hashes( ) ;
      GXCCtl = "nRC_GXsfl_34_" + sGXsfl_23_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_34, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "</table>") ;
      }
      else
      {
         if ( ! isAjaxCallMode( ) )
         {
            app.GxWebStd.gx_hidden_field( httpContext, "GridhdrsContainerData"+"_"+sGXsfl_23_idx, GridhdrsContainer.ToJavascriptSource());
         }
         if ( isAjaxCallMode( ) )
         {
            GridmaquinasRow.AddGrid("Gridhdrs", GridhdrsContainer);
         }
         if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
         {
            app.GxWebStd.gx_hidden_field( httpContext, "GridhdrsContainerData"+"V_"+sGXsfl_23_idx, GridhdrsContainer.GridValuesHidden());
         }
         else
         {
            httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridhdrsContainerData"+"V_"+sGXsfl_23_idx+"\" value='"+GridhdrsContainer.GridValuesHidden()+"'/>") ;
         }
      }
      if ( GridmaquinasContainer.GetWrapped() == 1 )
      {
         GridmaquinasContainer.CloseTag("cell");
      }
      if ( GridmaquinasContainer.GetWrapped() == 1 )
      {
         GridmaquinasContainer.CloseTag("row");
      }
      if ( GridmaquinasContainer.GetWrapped() == 1 )
      {
         GridmaquinasContainer.CloseTag("table");
      }
      /* End of table */
      if ( GridmaquinasContainer.GetWrapped() == 1 )
      {
         GridmaquinasContainer.CloseTag("cell");
      }
      if ( GridmaquinasContainer.GetWrapped() == 1 )
      {
         GridmaquinasContainer.CloseTag("row");
      }
      if ( GridmaquinasContainer.GetWrapped() == 1 )
      {
         GridmaquinasContainer.CloseTag("table");
      }
      /* End of table */
      send_integrity_lvl_hashesBQ2( ) ;
      /* End of Columns property logic. */
      GridmaquinasContainer.AddRow(GridmaquinasRow);
      nGXsfl_23_idx = ((subGridmaquinas_Islastpage==1)&&(nGXsfl_23_idx+1>subgridmaquinas_fnc_recordsperpage( )) ? 1 : nGXsfl_23_idx+1) ;
      sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_232( ) ;
      /* End function sendrow_232 */
   }

   public void startgridcontrol23( )
   {
      if ( GridmaquinasContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridmaquinasContainer"+"DivS\" data-gxgridid=\"23\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridmaquinas_Internalname, subGridmaquinas_Internalname, "", "FreeStyleGrid", 0, "", "", 1, 2, sStyleString, "", "", 0);
         GridmaquinasContainer.AddObjectProperty("GridName", "Gridmaquinas");
      }
      else
      {
         GridmaquinasContainer.AddObjectProperty("GridName", "Gridmaquinas");
         GridmaquinasContainer.AddObjectProperty("Header", subGridmaquinas_Header);
         GridmaquinasContainer.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
         GridmaquinasContainer.AddObjectProperty("Class", "FreeStyleGrid");
         GridmaquinasContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("CmpContext", "");
         GridmaquinasContainer.AddObjectProperty("InMasterPage", "false");
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasColumn.AddObjectProperty("Value", GXutil.rtrim( AV5SDTMaquina.getgxTv_SdtSDTMaquina_Maqdsc()));
         GridmaquinasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtmaquina_maqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void startgridcontrol34( )
   {
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridhdrsContainer"+"DivS\" data-gxgridid=\"34\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridhdrs_Internalname, subGridhdrs_Internalname, "", "FreeStyleGrid", 0, "", "", 1, 2, sStyleString, "", "", 0);
         GridhdrsContainer.AddObjectProperty("GridName", "Gridhdrs");
      }
      else
      {
         GridhdrsContainer.AddObjectProperty("GridName", "Gridhdrs");
         GridhdrsContainer.AddObjectProperty("Header", subGridhdrs_Header);
         GridhdrsContainer.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
         GridhdrsContainer.AddObjectProperty("Class", "FreeStyleGrid");
         GridhdrsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("CmpContext", "");
         GridhdrsContainer.AddObjectProperty("InMasterPage", "false");
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.rtrim( AV6SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barcolnom()));
         GridhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrspormaquina_barcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.rtrim( AV6SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barnomcli()));
         GridhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrspormaquina_barnomcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV6SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barkgs(), (byte)(9), (byte)(2), ".", "")));
         GridhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrspormaquina_barkgs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.rtrim( AV6SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Clinom()));
         GridhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrspormaquina_clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.rtrim( AV6SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barser()));
         GridhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrspormaquina_barser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.rtrim( AV6SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barserdsc()));
         GridhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrspormaquina_barserdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.rtrim( AV6SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barhdr()));
         GridhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrspormaquina_barhdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV6SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barfasest(), (byte)(1), (byte)(0), ".", "")));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      lblTextblockcombo_maqcodvisible_Internalname = "TEXTBLOCKCOMBO_MAQCODVISIBLE" ;
      Combo_maqcodvisible_Internalname = "COMBO_MAQCODVISIBLE" ;
      divTablesplittedmaqcodvisible_Internalname = "TABLESPLITTEDMAQCODVISIBLE" ;
      edtavSdtmaquina_maqdsc_Internalname = "SDTMAQUINA_MAQDSC" ;
      edtavSdthdrspormaquina_barcolnom_Internalname = "SDTHDRSPORMAQUINA_BARCOLNOM" ;
      edtavSdthdrspormaquina_barnomcli_Internalname = "SDTHDRSPORMAQUINA_BARNOMCLI" ;
      edtavSdthdrspormaquina_barkgs_Internalname = "SDTHDRSPORMAQUINA_BARKGS" ;
      edtavSdthdrspormaquina_clinom_Internalname = "SDTHDRSPORMAQUINA_CLINOM" ;
      edtavSdthdrspormaquina_barser_Internalname = "SDTHDRSPORMAQUINA_BARSER" ;
      edtavSdthdrspormaquina_barserdsc_Internalname = "SDTHDRSPORMAQUINA_BARSERDSC" ;
      edtavSdthdrspormaquina_barhdr_Internalname = "SDTHDRSPORMAQUINA_BARHDR" ;
      edtavSdthdrspormaquina_barfasest_Internalname = "SDTHDRSPORMAQUINA_BARFASEST" ;
      tblTblhdr_Internalname = "TBLHDR" ;
      tblUnnamedtablefsgridhdrs_Internalname = "UNNAMEDTABLEFSGRIDHDRS" ;
      tblTblmaquina_Internalname = "TBLMAQUINA" ;
      tblUnnamedtablefsgridmaquinas_Internalname = "UNNAMEDTABLEFSGRIDMAQUINAS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridhdrs_Internalname = "GRIDHDRS" ;
      subGridmaquinas_Internalname = "GRIDMAQUINAS" ;
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
      subGridhdrs_Allowcollapsing = (byte)(0) ;
      subGridmaquinas_Allowcollapsing = (byte)(0) ;
      edtavSdtmaquina_maqdsc_Jsonclick = "" ;
      edtavSdtmaquina_maqdsc_Enabled = 0 ;
      subGridmaquinas_Class = "FreeStyleGrid" ;
      edtavSdthdrspormaquina_barfasest_Jsonclick = "" ;
      edtavSdthdrspormaquina_barfasest_Visible = 1 ;
      edtavSdthdrspormaquina_barfasest_Enabled = 1 ;
      edtavSdthdrspormaquina_barhdr_Jsonclick = "" ;
      edtavSdthdrspormaquina_barhdr_Enabled = 0 ;
      edtavSdthdrspormaquina_barserdsc_Jsonclick = "" ;
      edtavSdthdrspormaquina_barserdsc_Enabled = 0 ;
      edtavSdthdrspormaquina_barser_Jsonclick = "" ;
      edtavSdthdrspormaquina_barser_Enabled = 0 ;
      edtavSdthdrspormaquina_clinom_Jsonclick = "" ;
      edtavSdthdrspormaquina_clinom_Enabled = 0 ;
      edtavSdthdrspormaquina_barkgs_Jsonclick = "" ;
      edtavSdthdrspormaquina_barkgs_Enabled = 0 ;
      edtavSdthdrspormaquina_barnomcli_Jsonclick = "" ;
      edtavSdthdrspormaquina_barnomcli_Enabled = 0 ;
      edtavSdthdrspormaquina_barcolnom_Jsonclick = "" ;
      edtavSdthdrspormaquina_barcolnom_Enabled = 0 ;
      subGridhdrs_Class = "FreeStyleGrid" ;
      tblTblhdr_Backcolor = (int)(0x000000) ;
      subGridhdrs_Backcolorstyle = (byte)(0) ;
      subGridmaquinas_Backcolorstyle = (byte)(0) ;
      edtavSdthdrspormaquina_barhdr_Enabled = -1 ;
      edtavSdthdrspormaquina_barserdsc_Enabled = -1 ;
      edtavSdthdrspormaquina_barser_Enabled = -1 ;
      edtavSdthdrspormaquina_clinom_Enabled = -1 ;
      edtavSdthdrspormaquina_barkgs_Enabled = -1 ;
      edtavSdthdrspormaquina_barnomcli_Enabled = -1 ;
      edtavSdthdrspormaquina_barcolnom_Enabled = -1 ;
      edtavSdtmaquina_maqdsc_Enabled = -1 ;
      Combo_maqcodvisible_Caption = "" ;
      divTablecontent_Class = "" ;
      Combo_maqcodvisible_Multiplevaluesseparator = ", " ;
      Combo_maqcodvisible_Selectalltext = "WWP_SelectAll" ;
      Combo_maqcodvisible_Onlyselectedvalues = "WWP_OnlySelectedValues" ;
      Combo_maqcodvisible_Multiplevaluestype = "Tags" ;
      Combo_maqcodvisible_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_maqcodvisible_Includeonlyselectedoption = GXutil.toBoolean( -1) ;
      Combo_maqcodvisible_Allowmultipleselection = GXutil.toBoolean( -1) ;
      Combo_maqcodvisible_Cls = "ExtendedCombo Attribute" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Programacion Maquinas", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDMAQUINAS_nFirstRecordOnPage'},{av:'GRIDMAQUINAS_nEOF'},{av:'GRIDHDRS_nFirstRecordOnPage'},{av:'GRIDHDRS_nEOF'},{av:'AV14MaqCodVisible',fld:'vMAQCODVISIBLE',pic:''},{av:'AV5SDTMaquina',fld:'vSDTMAQUINA',pic:'',hsh:true},{av:'AV7SDTMaquinaCollection',fld:'vSDTMAQUINACOLLECTION',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV7SDTMaquinaCollection',fld:'vSDTMAQUINACOLLECTION',pic:'',hsh:true}]}");
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      setEventMetadata("GRIDMAQUINAS.LOAD","{handler:'e13BQ2',iparms:[{av:'AV7SDTMaquinaCollection',fld:'vSDTMAQUINACOLLECTION',pic:'',hsh:true}]");
      setEventMetadata("GRIDMAQUINAS.LOAD",",oparms:[{av:'AV5SDTMaquina',fld:'vSDTMAQUINA',pic:'',hsh:true},{ctrl:'vBARCOD',prop:'Visible'},{ctrl:'vBARCODREO',prop:'Visible'},{ctrl:'vBARCODPAR',prop:'Visible'},{ctrl:'vMAQCOD',prop:'Visible'}]}");
      setEventMetadata("GRIDHDRS.LOAD","{handler:'e16BQ3',iparms:[{av:'AV5SDTMaquina',fld:'vSDTMAQUINA',pic:'',hsh:true}]");
      setEventMetadata("GRIDHDRS.LOAD",",oparms:[{av:'AV6SDTHdrsporMaquina',fld:'vSDTHDRSPORMAQUINA',pic:''},{av:'tblTblhdr_Backcolor',ctrl:'TBLHDR',prop:'Backcolor'}]}");
      setEventMetadata("COMBO_MAQCODVISIBLE.ONOPTIONCLICKED","{handler:'e11BQ2',iparms:[{av:'GRIDMAQUINAS_nFirstRecordOnPage'},{av:'GRIDMAQUINAS_nEOF'},{av:'AV14MaqCodVisible',fld:'vMAQCODVISIBLE',pic:''},{av:'AV7SDTMaquinaCollection',fld:'vSDTMAQUINACOLLECTION',pic:'',hsh:true},{av:'AV5SDTMaquina',fld:'vSDTMAQUINA',pic:'',hsh:true},{av:'Combo_maqcodvisible_Selectedvalue_get',ctrl:'COMBO_MAQCODVISIBLE',prop:'SelectedValue_get'},{av:'GRIDHDRS_nFirstRecordOnPage'},{av:'GRIDHDRS_nEOF'}]");
      setEventMetadata("COMBO_MAQCODVISIBLE.ONOPTIONCLICKED",",oparms:[{av:'AV14MaqCodVisible',fld:'vMAQCODVISIBLE',pic:''},{av:'AV7SDTMaquinaCollection',fld:'vSDTMAQUINACOLLECTION',pic:'',hsh:true}]}");
      setEventMetadata("'PDF'","{handler:'e15BQ2',iparms:[{av:'AV14MaqCodVisible',fld:'vMAQCODVISIBLE',pic:''}]");
      setEventMetadata("'PDF'",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv1',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALIDV_GXV9","{handler:'validv_Gxv9',iparms:[]");
      setEventMetadata("VALIDV_GXV9",",oparms:[]}");
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
      Combo_maqcodvisible_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV14MaqCodVisible = new GXSimpleCollection<String>(String.class, "internal", "");
      AV5SDTMaquina = new app.SdtSDTMaquina(remoteHandle, context);
      AV7SDTMaquinaCollection = new GXBaseCollection<app.SdtSDTMaquina>(app.SdtSDTMaquina.class, "SDTMaquina", "TexplusNET", remoteHandle);
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV6SDTHdrsporMaquina = new app.SdtSDTHdrsporMaquina(remoteHandle, context);
      AV15DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV13MaqCodVisible_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Combo_maqcodvisible_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTextblockcombo_maqcodvisible_Jsonclick = "" ;
      ucCombo_maqcodvisible = new com.genexus.webpanels.GXUserControl();
      GridmaquinasContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      GridhdrsContainer = new com.genexus.webpanels.GXWebGrid(context);
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons1 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons2 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV11Maqcod = "" ;
      GridmaquinasRow = new com.genexus.webpanels.GXWebRow();
      scmdbuf = "" ;
      H00BQ2_A396EmprCod = new String[] {""} ;
      H00BQ2_A607MaqEst = new String[] {""} ;
      H00BQ2_n607MaqEst = new boolean[] {false} ;
      H00BQ2_A6432MaqPln = new byte[1] ;
      H00BQ2_n6432MaqPln = new boolean[] {false} ;
      H00BQ2_A620MaqTip = new String[] {""} ;
      H00BQ2_n620MaqTip = new boolean[] {false} ;
      H00BQ2_A602MaqCod = new String[] {""} ;
      H00BQ2_A606MaqDsc = new String[] {""} ;
      H00BQ2_n606MaqDsc = new boolean[] {false} ;
      A607MaqEst = "" ;
      A620MaqTip = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      AV12Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H00BQ3_A396EmprCod = new String[] {""} ;
      H00BQ3_A607MaqEst = new String[] {""} ;
      H00BQ3_n607MaqEst = new boolean[] {false} ;
      H00BQ3_A6432MaqPln = new byte[1] ;
      H00BQ3_n6432MaqPln = new boolean[] {false} ;
      H00BQ3_A620MaqTip = new String[] {""} ;
      H00BQ3_n620MaqTip = new boolean[] {false} ;
      H00BQ3_A602MaqCod = new String[] {""} ;
      H00BQ3_A606MaqDsc = new String[] {""} ;
      H00BQ3_n606MaqDsc = new boolean[] {false} ;
      GXt_objcol_SdtSDTMaquina3 = new GXBaseCollection<app.SdtSDTMaquina>(app.SdtSDTMaquina.class, "SDTMaquina", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTMaquina4 = new GXBaseCollection[1] ;
      AV16WebSession = httpContext.getWebSession();
      AV10BarCodPar = "" ;
      GridhdrsRow = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGridhdrs_Linesclass = "" ;
      ROClassString = "" ;
      TempTags = "" ;
      subGridmaquinas_Linesclass = "" ;
      subGridmaquinas_Header = "" ;
      GridmaquinasColumn = new com.genexus.webpanels.GXWebColumn();
      subGridhdrs_Header = "" ;
      GridhdrsColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.programacionmaquinas__default(),
         new Object[] {
             new Object[] {
            H00BQ2_A396EmprCod, H00BQ2_A607MaqEst, H00BQ2_n607MaqEst, H00BQ2_A6432MaqPln, H00BQ2_n6432MaqPln, H00BQ2_A620MaqTip, H00BQ2_n620MaqTip, H00BQ2_A602MaqCod, H00BQ2_A606MaqDsc, H00BQ2_n606MaqDsc
            }
            , new Object[] {
            H00BQ3_A396EmprCod, H00BQ3_A607MaqEst, H00BQ3_n607MaqEst, H00BQ3_A6432MaqPln, H00BQ3_n6432MaqPln, H00BQ3_A620MaqTip, H00BQ3_n620MaqTip, H00BQ3_A602MaqCod, H00BQ3_A606MaqDsc, H00BQ3_n606MaqDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavSdtmaquina_maqdsc_Enabled = 0 ;
      edtavSdthdrspormaquina_barcolnom_Enabled = 0 ;
      edtavSdthdrspormaquina_barnomcli_Enabled = 0 ;
      edtavSdthdrspormaquina_barkgs_Enabled = 0 ;
      edtavSdthdrspormaquina_clinom_Enabled = 0 ;
      edtavSdthdrspormaquina_barser_Enabled = 0 ;
      edtavSdthdrspormaquina_barserdsc_Enabled = 0 ;
      edtavSdthdrspormaquina_barhdr_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte nDonePA ;
   private byte subGridmaquinas_Backcolorstyle ;
   private byte subGridhdrs_Backcolorstyle ;
   private byte GRIDMAQUINAS_nEOF ;
   private byte GRIDHDRS_nEOF ;
   private byte A6432MaqPln ;
   private byte AV9BarCodReo ;
   private byte subGridhdrs_Backstyle ;
   private byte subGridmaquinas_Backstyle ;
   private byte subGridmaquinas_Allowselection ;
   private byte subGridmaquinas_Allowhovering ;
   private byte subGridmaquinas_Allowcollapsing ;
   private byte subGridmaquinas_Collapsed ;
   private byte subGridhdrs_Allowselection ;
   private byte subGridhdrs_Allowhovering ;
   private byte subGridhdrs_Allowcollapsing ;
   private byte subGridhdrs_Collapsed ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int nRC_GXsfl_34 ;
   private int nGXsfl_34_idx=1 ;
   private int nRC_GXsfl_23 ;
   private int nGXsfl_23_idx=1 ;
   private int subGridmaquinas_Islastpage ;
   private int subGridhdrs_Islastpage ;
   private int edtavSdtmaquina_maqdsc_Enabled ;
   private int edtavSdthdrspormaquina_barcolnom_Enabled ;
   private int edtavSdthdrspormaquina_barnomcli_Enabled ;
   private int edtavSdthdrspormaquina_barkgs_Enabled ;
   private int edtavSdthdrspormaquina_clinom_Enabled ;
   private int edtavSdthdrspormaquina_barser_Enabled ;
   private int edtavSdthdrspormaquina_barserdsc_Enabled ;
   private int edtavSdthdrspormaquina_barhdr_Enabled ;
   private int AV28GXV10 ;
   private int AV29GXV11 ;
   private int AV8BarCod ;
   private int tblTblhdr_Backcolor ;
   private int idxLst ;
   private int subGridhdrs_Backcolor ;
   private int subGridhdrs_Allbackcolor ;
   private int edtavSdthdrspormaquina_barfasest_Enabled ;
   private int edtavSdthdrspormaquina_barfasest_Visible ;
   private int subGridmaquinas_Backcolor ;
   private int subGridmaquinas_Allbackcolor ;
   private int subGridmaquinas_Selectedindex ;
   private int subGridmaquinas_Selectioncolor ;
   private int subGridmaquinas_Hoveringcolor ;
   private int subGridhdrs_Selectedindex ;
   private int subGridhdrs_Selectioncolor ;
   private int subGridhdrs_Hoveringcolor ;
   private long GRIDHDRS_nCurrentRecord ;
   private long GRIDMAQUINAS_nCurrentRecord ;
   private long GRIDHDRS_nFirstRecordOnPage ;
   private long GRIDMAQUINAS_nFirstRecordOnPage ;
   private String Combo_maqcodvisible_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_34_idx="0001" ;
   private String sGXsfl_23_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Combo_maqcodvisible_Cls ;
   private String Combo_maqcodvisible_Selectedvalue_set ;
   private String Combo_maqcodvisible_Multiplevaluestype ;
   private String Combo_maqcodvisible_Onlyselectedvalues ;
   private String Combo_maqcodvisible_Selectalltext ;
   private String Combo_maqcodvisible_Multiplevaluesseparator ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String divTablecontent_Class ;
   private String divTablesplittedmaqcodvisible_Internalname ;
   private String lblTextblockcombo_maqcodvisible_Internalname ;
   private String lblTextblockcombo_maqcodvisible_Jsonclick ;
   private String Combo_maqcodvisible_Caption ;
   private String Combo_maqcodvisible_Internalname ;
   private String sStyleString ;
   private String subGridmaquinas_Internalname ;
   private String subGridhdrs_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavSdtmaquina_maqdsc_Internalname ;
   private String edtavSdthdrspormaquina_barcolnom_Internalname ;
   private String edtavSdthdrspormaquina_barnomcli_Internalname ;
   private String edtavSdthdrspormaquina_barkgs_Internalname ;
   private String edtavSdthdrspormaquina_clinom_Internalname ;
   private String edtavSdthdrspormaquina_barser_Internalname ;
   private String edtavSdthdrspormaquina_barserdsc_Internalname ;
   private String edtavSdthdrspormaquina_barhdr_Internalname ;
   private String edtavSdthdrspormaquina_barfasest_Internalname ;
   private String GXCCtl ;
   private String AV11Maqcod ;
   private String scmdbuf ;
   private String A607MaqEst ;
   private String A620MaqTip ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String AV10BarCodPar ;
   private String tblTblhdr_Internalname ;
   private String sGXsfl_34_fel_idx="0001" ;
   private String subGridhdrs_Class ;
   private String subGridhdrs_Linesclass ;
   private String tblUnnamedtablefsgridhdrs_Internalname ;
   private String ROClassString ;
   private String edtavSdthdrspormaquina_barcolnom_Jsonclick ;
   private String edtavSdthdrspormaquina_barnomcli_Jsonclick ;
   private String edtavSdthdrspormaquina_barkgs_Jsonclick ;
   private String edtavSdthdrspormaquina_clinom_Jsonclick ;
   private String edtavSdthdrspormaquina_barser_Jsonclick ;
   private String edtavSdthdrspormaquina_barserdsc_Jsonclick ;
   private String edtavSdthdrspormaquina_barhdr_Jsonclick ;
   private String TempTags ;
   private String edtavSdthdrspormaquina_barfasest_Jsonclick ;
   private String sGXsfl_23_fel_idx="0001" ;
   private String subGridmaquinas_Class ;
   private String subGridmaquinas_Linesclass ;
   private String tblUnnamedtablefsgridmaquinas_Internalname ;
   private String tblTblmaquina_Internalname ;
   private String edtavSdtmaquina_maqdsc_Jsonclick ;
   private String subGridmaquinas_Header ;
   private String subGridhdrs_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Combo_maqcodvisible_Allowmultipleselection ;
   private boolean Combo_maqcodvisible_Includeonlyselectedoption ;
   private boolean Combo_maqcodvisible_Emptyitem ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_23_Refreshing=false ;
   private boolean bGXsfl_34_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n607MaqEst ;
   private boolean n6432MaqPln ;
   private boolean n620MaqTip ;
   private boolean n606MaqDsc ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid GridmaquinasContainer ;
   private com.genexus.webpanels.GXWebGrid GridhdrsContainer ;
   private com.genexus.webpanels.GXWebRow GridmaquinasRow ;
   private com.genexus.webpanels.GXWebRow GridhdrsRow ;
   private com.genexus.webpanels.GXWebColumn GridmaquinasColumn ;
   private com.genexus.webpanels.GXWebColumn GridhdrsColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcodvisible ;
   private IDataStoreProvider pr_default ;
   private String[] H00BQ2_A396EmprCod ;
   private String[] H00BQ2_A607MaqEst ;
   private boolean[] H00BQ2_n607MaqEst ;
   private byte[] H00BQ2_A6432MaqPln ;
   private boolean[] H00BQ2_n6432MaqPln ;
   private String[] H00BQ2_A620MaqTip ;
   private boolean[] H00BQ2_n620MaqTip ;
   private String[] H00BQ2_A602MaqCod ;
   private String[] H00BQ2_A606MaqDsc ;
   private boolean[] H00BQ2_n606MaqDsc ;
   private String[] H00BQ3_A396EmprCod ;
   private String[] H00BQ3_A607MaqEst ;
   private boolean[] H00BQ3_n607MaqEst ;
   private byte[] H00BQ3_A6432MaqPln ;
   private boolean[] H00BQ3_n6432MaqPln ;
   private String[] H00BQ3_A620MaqTip ;
   private boolean[] H00BQ3_n620MaqTip ;
   private String[] H00BQ3_A602MaqCod ;
   private String[] H00BQ3_A606MaqDsc ;
   private boolean[] H00BQ3_n606MaqDsc ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.WebSession AV16WebSession ;
   private GXSimpleCollection<String> AV14MaqCodVisible ;
   private GXBaseCollection<app.SdtSDTMaquina> AV7SDTMaquinaCollection ;
   private GXBaseCollection<app.SdtSDTMaquina> GXt_objcol_SdtSDTMaquina3 ;
   private GXBaseCollection<app.SdtSDTMaquina> GXv_objcol_SdtSDTMaquina4[] ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV13MaqCodVisible_Data ;
   private app.SdtSDTMaquina AV5SDTMaquina ;
   private app.SdtSDTHdrsporMaquina AV6SDTHdrsporMaquina ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV12Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV15DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons1 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons2[] ;
}

final  class programacionmaquinas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00BQ2", "SELECT EmprCod, MaqEst, MaqPln, MaqTip, MaqCod, MaqDsc FROM TXPMAQUIN WHERE (MaqCod like 'TN%') AND (MaqEst = 'A') AND (MaqPln = 1) AND (MaqTip = 'E') ORDER BY MaqDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00BQ3", "SELECT EmprCod, MaqEst, MaqPln, MaqTip, MaqCod, MaqDsc FROM TXPMAQUIN WHERE (MaqCod like 'TN%') AND (MaqEst = 'A') AND (MaqPln = 1) AND (MaqTip = 'E') ORDER BY MaqDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((String[]) buf[8])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((String[]) buf[8])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

