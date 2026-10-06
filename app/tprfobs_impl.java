package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tprfobs_impl extends GXDataArea
{
   public void initenv( )
   {
      if ( GxWebError != 0 )
      {
         return  ;
      }
   }

   public void inittrn( )
   {
      initialize_properties( ) ;
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
      if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
      {
         A396EmprCod = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A764ProForCod = httpContext.GetPar( "ProForCod") ;
            n764ProForCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         }
      }
      if ( toggleJsOutput )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
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
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
         }
         Form.getMeta().addItem("description", httpContext.getMessage( "OBSERVACIONES PROCESO", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtProForDsc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tprfobs_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tprfobs_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprfobs_impl.class ));
   }

   public tprfobs_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void webExecute( )
   {
      initenv( ) ;
      inittrn( ) ;
      if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
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

   public void fix_multi_value_controls( )
   {
   }

   public void draw( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         disable_std_buttons( ) ;
         enableDisable( ) ;
         set_caption( ) ;
         /* Form start */
         drawControls( ) ;
         fix_multi_value_controls( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void drawControls( )
   {
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tbody>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 5,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRFOBS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRFOBS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRFOBS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRFOBS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPRFOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tbody>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRFOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRFOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Proceso Formula ID", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRFOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForCod_Internalname, GXutil.rtrim( A764ProForCod), GXutil.rtrim( localUtil.format( A764ProForCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForCod_Jsonclick, 0, "", "", "", "", "", 1, edtProForCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRFOBS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRFOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRFOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc), GXutil.rtrim( localUtil.format( A766ProForDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForDsc_Jsonclick, 0, "", "", "", "", "", 1, edtProForDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRFOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRFOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRFOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRFOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtProForObs_Internalname, A4586ProForObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", (short)(0), 1, edtProForObs_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TPRFOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRFOBS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRFOBS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRFOBS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRFOBS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPRFOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
   }

   public void userMain( )
   {
      standaloneStartup( ) ;
   }

   public void userMainFullajax( )
   {
      initenv( ) ;
      inittrn( ) ;
      userMain( ) ;
      draw( ) ;
      sendCloseFormHiddens( ) ;
   }

   public void standaloneStartup( )
   {
      standaloneStartupServer( ) ;
      disable_std_buttons( ) ;
      enableDisable( ) ;
      process( ) ;
   }

   public void standaloneStartupServer( )
   {
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11L92 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z764ProForCod = httpContext.cgiGet( "Z764ProForCod") ;
            Z766ProForDsc = httpContext.cgiGet( "Z766ProForDsc") ;
            Z4586ProForObs = httpContext.cgiGet( "Z4586ProForObs") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV27Nlin = (short)(localUtil.ctol( httpContext.cgiGet( "vNLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
            n764ProForCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
            A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A4586ProForObs = httpContext.cgiGet( edtProForObs_Internalname) ;
            n4586ProForObs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4586ProForObs", A4586ProForObs);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            standaloneNotModal( ) ;
         }
         else
         {
            standaloneNotModal( ) ;
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") == 0 )
            {
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A764ProForCod = httpContext.GetPar( "ProForCod") ;
               n764ProForCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               getEqualNoModal( ) ;
               standaloneModal( ) ;
            }
         }
      }
   }

   public void process( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read Transaction buttons. */
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
                     if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e11L92 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_enter( ) ;
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_first( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "PREVIOUS") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_previous( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_next( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_last( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "SELECT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_select( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "GET") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_get( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "CHECK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_check( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_delete( ) ;
                        /* No code required for Help button. It is implemented at the Browser level. */
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        afterkeyloadscreen( ) ;
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

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         if ( ! (GXutil.strcmp("", endTrnMsgTxt)==0) )
         {
            httpContext.GX_msglist.addItem(endTrnMsgTxt, endTrnMsgCod, 0, "", true);
         }
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAllL989( ) ;
            standaloneNotModal( ) ;
            standaloneModal( ) ;
         }
      }
      endTrnMsgTxt = "" ;
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public void disable_std_buttons( )
   {
      if ( isIns( ) )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
   }

   public void disable_std_buttons_dsp( )
   {
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      bttBtn_first_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_first_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_first_Visible), 5, 0), true);
      bttBtn_previous_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_previous_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_previous_Visible), 5, 0), true);
      bttBtn_next_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_next_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_next_Visible), 5, 0), true);
      bttBtn_last_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_last_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_last_Visible), 5, 0), true);
      bttBtn_select_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_select_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_select_Visible), 5, 0), true);
      bttBtn_get_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Visible), 5, 0), true);
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      if ( isDsp( ) )
      {
         bttBtn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
      }
      disableAttributesL989( ) ;
   }

   public void set_caption( )
   {
      if ( ( IsConfirmed == 1 ) && ( AnyError == 0 ) )
      {
         if ( isDlt( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "", true);
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "", true);
         }
      }
   }

   public void confirm_L90( )
   {
      beforeValidateL989( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsL989( ) ;
         }
         else
         {
            checkExtendedTableL989( ) ;
            if ( AnyError == 0 )
            {
               zmL989( 4) ;
            }
            closeExtendedTableCursorsL989( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValuesL90( ) ;
      }
   }

   public void resetCaptionL90( )
   {
   }

   public void e11L92( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV22LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tprfobs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22LitFe", AV22LitFe);
      GXt_char1 = AV16Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      tprfobs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit0", AV16Lit0);
      GXt_char1 = AV17Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1612_", ""), (byte)(99), GXv_char2) ;
      tprfobs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit1", AV17Lit1);
      GXt_char1 = AV18Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1613_", ""), (byte)(99), GXv_char2) ;
      tprfobs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit2", AV18Lit2);
      GXt_char1 = AV19Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1614_", ""), (byte)(99), GXv_char2) ;
      tprfobs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit3", AV19Lit3);
      GXt_char1 = AV20Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1615_", ""), (byte)(99), GXv_char2) ;
      tprfobs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit4", AV20Lit4);
      AV24Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Station", AV24Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV25EmprNom ;
      GXv_char4[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char2, GXv_char3, GXv_char4) ;
      tprfobs_impl.this.A396EmprCod = GXv_char2[0] ;
      tprfobs_impl.this.AV25EmprNom = GXv_char3[0] ;
      tprfobs_impl.this.AV21UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprNom", AV25EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV21UsurCod", AV21UsurCod);
   }

   public void zmL989( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z766ProForDsc = T00L93_A766ProForDsc[0] ;
            Z4586ProForObs = T00L93_A4586ProForObs[0] ;
         }
         else
         {
            Z766ProForDsc = A766ProForDsc ;
            Z4586ProForObs = A4586ProForObs ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z764ProForCod = A764ProForCod ;
         Z766ProForDsc = A766ProForDsc ;
         Z4586ProForObs = A4586ProForObs ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T00L94 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00L94_A407EmprNom[0] ;
      n407EmprNom = T00L94_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  )
      {
         bttBtn_get_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_get_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_delete_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_check_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_check_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      }
   }

   public void loadL989( )
   {
      /* Using cursor T00L95 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound89 = (short)(1) ;
         A766ProForDsc = T00L95_A766ProForDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A407EmprNom = T00L95_A407EmprNom[0] ;
         n407EmprNom = T00L95_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4586ProForObs = T00L95_A4586ProForObs[0] ;
         n4586ProForObs = T00L95_n4586ProForObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4586ProForObs", A4586ProForObs);
         zmL989( -3) ;
      }
      pr_default.close(3);
      onLoadActionsL989( ) ;
   }

   public void onLoadActionsL989( )
   {
      AV27Nlin = (short)(GXutil.gxmlines( A4586ProForObs, (short)(40))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Nlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Nlin), 4, 0));
   }

   public void checkExtendedTableL989( )
   {
      nIsDirty_89 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV27Nlin = (short)(GXutil.gxmlines( A4586ProForObs, (short)(40))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Nlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Nlin), 4, 0));
   }

   public void closeExtendedTableCursorsL989( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyL989( )
   {
      /* Using cursor T00L96 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound89 = (short)(1) ;
      }
      else
      {
         RcdFound89 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00L93 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00L93_A764ProForCod[0], A764ProForCod) == 0 ) && ( GXutil.strcmp(T00L93_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmL989( 3) ;
         RcdFound89 = (short)(1) ;
         A766ProForDsc = T00L93_A766ProForDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A4586ProForObs = T00L93_A4586ProForObs[0] ;
         n4586ProForObs = T00L93_n4586ProForObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4586ProForObs", A4586ProForObs);
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         sMode89 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadL989( ) ;
         if ( AnyError == 1 )
         {
            RcdFound89 = (short)(0) ;
            initializeNonKeyL989( ) ;
         }
         Gx_mode = sMode89 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound89 = (short)(0) ;
         initializeNonKeyL989( ) ;
         sMode89 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode89 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKeyL989( ) ;
      if ( RcdFound89 == 0 )
      {
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound89 = (short)(0) ;
      /* Using cursor T00L97 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T00L97_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00L97_A764ProForCod[0], A764ProForCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T00L97_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00L97_A764ProForCod[0], A764ProForCod) == 0 ) )
         {
            RcdFound89 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound89 = (short)(0) ;
      /* Using cursor T00L98 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(T00L98_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00L98_A764ProForCod[0], A764ProForCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(T00L98_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00L98_A764ProForCod[0], A764ProForCod) == 0 ) )
         {
            RcdFound89 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyL989( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtProForDsc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertL989( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound89 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtProForDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateL989( ) ;
               GX_FocusControl = edtProForDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtProForDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertL989( ) ;
               if ( AnyError == 1 )
               {
                  GX_FocusControl = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "EMPRCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtProForDsc_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertL989( ) ;
                  if ( AnyError == 1 )
                  {
                     GX_FocusControl = "" ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
      }
      afterTrn( ) ;
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtProForDsc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         getByPrimaryKey( ) ;
      }
      CloseOpenCursors();
   }

   public void btn_check( )
   {
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getKeyL989( ) ;
      if ( RcdFound89 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( isDlt( ) )
         {
            delete_check( ) ;
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            update_check( ) ;
         }
      }
      else
      {
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert_check( ) ;
            }
         }
      }
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tprfobs");
      GX_FocusControl = edtProForDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_L90( ) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      if ( RcdFound89 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtProForDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartL989( ) ;
      if ( RcdFound89 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProForDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndL989( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_previous( ) ;
      if ( RcdFound89 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProForDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_next( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_next( ) ;
      if ( RcdFound89 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProForDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartL989( ) ;
      if ( RcdFound89 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound89 != 0 )
         {
            scanNextL989( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProForDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndL989( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyL989( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00L92 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPROFO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z766ProForDsc, T00L92_A766ProForDsc[0]) != 0 ) || ( GXutil.strcmp(Z4586ProForObs, T00L92_A4586ProForObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z766ProForDsc, T00L92_A766ProForDsc[0]) != 0 )
            {
               GXutil.writeLogln("tprfobs:[seudo value changed for attri]"+"ProForDsc");
               GXutil.writeLogRaw("Old: ",Z766ProForDsc);
               GXutil.writeLogRaw("Current: ",T00L92_A766ProForDsc[0]);
            }
            if ( GXutil.strcmp(Z4586ProForObs, T00L92_A4586ProForObs[0]) != 0 )
            {
               GXutil.writeLogln("tprfobs:[seudo value changed for attri]"+"ProForObs");
               GXutil.writeLogRaw("Old: ",Z4586ProForObs);
               GXutil.writeLogRaw("Current: ",T00L92_A4586ProForObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCPROFO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertL989( )
   {
      beforeValidateL989( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableL989( ) ;
      }
      if ( AnyError == 0 )
      {
         zmL989( 0) ;
         checkOptimisticConcurrencyL989( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmL989( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertL989( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00L99 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n764ProForCod), A764ProForCod, A766ProForDsc, Boolean.valueOf(n4586ProForObs), A4586ProForObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
                  if ( (pr_default.getStatus(7) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaptionL90( ) ;
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            loadL989( ) ;
         }
         endLevelL989( ) ;
      }
      closeExtendedTableCursorsL989( ) ;
   }

   public void updateL989( )
   {
      beforeValidateL989( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableL989( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyL989( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmL989( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateL989( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00L910 */
                  pr_default.execute(8, new Object[] {A766ProForDsc, Boolean.valueOf(n4586ProForObs), A4586ProForObs, A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPROFO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateL989( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaptionL90( ) ;
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevelL989( ) ;
      }
      closeExtendedTableCursorsL989( ) ;
   }

   public void deferredUpdateL989( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateL989( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyL989( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsL989( ) ;
         afterConfirmL989( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteL989( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00L911 */
               pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound89 == 0 )
                     {
                        initAllL989( ) ;
                        Gx_mode = "INS" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     else
                     {
                        getByPrimaryKey( ) ;
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                     endTrnMsgCod = "SuccessfullyDeleted" ;
                     resetCaptionL90( ) ;
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode89 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelL989( ) ;
      Gx_mode = sMode89 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsL989( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV27Nlin = (short)(GXutil.gxmlines( A4586ProForObs, (short)(40))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Nlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Nlin), 4, 0));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00L912 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T00L913 */
         pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tratamientos Quimicos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T00L914 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Procesos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T00L915 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "creest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T00L916 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Procesos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T00L917 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FTPQS1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T00L918 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECETAS ACABADO , OLLAS (POT)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T00L919 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PQPRGNO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T00L920 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CORAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T00L921 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T00L922 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECE1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T00L923 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T00L924 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T00L925 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFOC", "")+" ("+httpContext.getMessage( "PQuimicos", "")+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T00L926 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFOC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T00L927 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPCOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T00L928 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRERE1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T00L929 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas de Formulación por Fase", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T00L930 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASPR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T00L931 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T00L932 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LMACPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T00L933 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T00L934 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESCMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T00L935 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPROFO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
      }
   }

   public void endLevelL989( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteL989( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tprfobs");
         if ( AnyError == 0 )
         {
            confirmValuesL90( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tprfobs");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartL989( )
   {
      /* Scan By routine */
      /* Using cursor T00L936 */
      pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      RcdFound89 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound89 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextL989( )
   {
      /* Scan next routine */
      pr_default.readNext(34);
      RcdFound89 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound89 = (short)(1) ;
      }
   }

   public void scanEndL989( )
   {
      pr_default.close(34);
   }

   public void afterConfirmL989( )
   {
      /* After Confirm Rules */
      if ( ( AV27Nlin > 20 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero Maximo linhas es 20 ¡¡¡", ""), 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsertL989( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateL989( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteL989( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteL989( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateL989( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesL989( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtProForCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), true);
      edtProForDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtProForObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForObs_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashesL989( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValuesL90( )
   {
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), false);
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
      MasterPageObj.master_styles();
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
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      bodyStyle += "-moz-opacity:0;opacity:0;" ;
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tprfobs", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A764ProForCod))}, new String[] {"EmprCod","ProForCod"}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "Form", true);
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z764ProForCod", GXutil.rtrim( Z764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z766ProForDsc", GXutil.rtrim( Z766ProForDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4586ProForObs", Z4586ProForObs);
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vNLIN", GXutil.ltrim( localUtil.ntoc( AV27Nlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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

   public byte executeStartEvent( )
   {
      standaloneStartup( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      return gxajaxcallmode ;
   }

   public void renderHtmlContent( )
   {
      httpContext.writeText( "<div") ;
      app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "Form" : Form.getThemeClass())+"-fx");
      httpContext.writeText( ">") ;
      draw( ) ;
      httpContext.writeText( "</div>") ;
   }

   public void dispatchEvents( )
   {
      process( ) ;
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
      return formatLink("app.tprfobs", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A764ProForCod))}, new String[] {"EmprCod","ProForCod"})  ;
   }

   public String getPgmname( )
   {
      return "TPRFOBS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "OBSERVACIONES PROCESO", "") ;
   }

   public void initializeNonKeyL989( )
   {
      AV27Nlin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Nlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Nlin), 4, 0));
      A766ProForDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      A4586ProForObs = "" ;
      n4586ProForObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4586ProForObs", A4586ProForObs);
      Z766ProForDsc = "" ;
      Z4586ProForObs = "" ;
   }

   public void initAllL989( )
   {
      initializeNonKeyL989( ) ;
   }

   public void standaloneModalInsert( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241521243", true, true);
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
      httpContext.AddJavascriptSource("tprfobs.js", "?20268241521243", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtn_first_Internalname = "BTN_FIRST" ;
      bttBtn_previous_Internalname = "BTN_PREVIOUS" ;
      bttBtn_next_Internalname = "BTN_NEXT" ;
      bttBtn_last_Internalname = "BTN_LAST" ;
      bttBtn_select_Internalname = "BTN_SELECT" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtProForCod_Internalname = "PROFORCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtProForDsc_Internalname = "PROFORDSC" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtProForObs_Internalname = "PROFOROBS" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "OBSERVACIONES PROCESO", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtProForObs_Backcolor = (int)(0xFFFFFF) ;
      edtProForObs_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtProForDsc_Jsonclick = "" ;
      edtProForDsc_Backcolor = (int)(0xFFFFFF) ;
      edtProForDsc_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtProForCod_Jsonclick = "" ;
      edtProForCod_Backcolor = (int)(0xFFFFFF) ;
      edtProForCod_Enabled = 0 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Backcolor = (int)(0xFFFFFF) ;
      edtEmprCod_Enabled = 0 ;
      bttBtn_select_Visible = 1 ;
      bttBtn_last_Visible = 1 ;
      bttBtn_next_Visible = 1 ;
      bttBtn_previous_Visible = 1 ;
      bttBtn_first_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T00L937 */
      pr_default.execute(35, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(35) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00L937_A407EmprNom[0] ;
      n407EmprNom = T00L937_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(35);
      GX_FocusControl = edtProForDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public boolean isIns( )
   {
      return ((GXutil.strcmp(Gx_mode, "INS")==0) ? true : false) ;
   }

   public boolean isDlt( )
   {
      return ((GXutil.strcmp(Gx_mode, "DLT")==0) ? true : false) ;
   }

   public boolean isUpd( )
   {
      return ((GXutil.strcmp(Gx_mode, "UPD")==0) ? true : false) ;
   }

   public boolean isDsp( )
   {
      return ((GXutil.strcmp(Gx_mode, "DSP")==0) ? true : false) ;
   }

   public void valid_Proforcod( )
   {
      n764ProForCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", GXutil.rtrim( A766ProForDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4586ProForObs", A4586ProForObs);
      httpContext.ajax_rsp_assign_attri("", false, "AV27Nlin", GXutil.ltrim( localUtil.ntoc( AV27Nlin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z764ProForCod", GXutil.rtrim( Z764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z766ProForDsc", GXutil.rtrim( Z766ProForDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4586ProForObs", Z4586ProForObs);
      app.GxWebStd.gx_hidden_field( httpContext, "ZV27Nlin", GXutil.ltrim( localUtil.ntoc( ZV27Nlin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Proforobs( )
   {
      n4586ProForObs = false ;
      AV27Nlin = (short)(GXutil.gxmlines( A4586ProForObs, (short)(40))) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV27Nlin", GXutil.ltrim( localUtil.ntoc( AV27Nlin, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV27Nlin',fld:'vNLIN',pic:'ZZZ9'}]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4586ProForObs',fld:'PROFOROBS',pic:''},{av:'AV27Nlin',fld:'vNLIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z764ProForCod'},{av:'Z766ProForDsc'},{av:'Z407EmprNom'},{av:'Z4586ProForObs'},{av:'ZV27Nlin'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_PROFOROBS","{handler:'valid_Proforobs',iparms:[{av:'A4586ProForObs',fld:'PROFOROBS',pic:''},{av:'AV27Nlin',fld:'vNLIN',pic:'ZZZ9'}]");
      setEventMetadata("VALID_PROFOROBS",",oparms:[{av:'AV27Nlin',fld:'vNLIN',pic:'ZZZ9'}]}");
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
      pr_default.close(35);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA764ProForCod = "" ;
      Z396EmprCod = "" ;
      Z764ProForCod = "" ;
      Z766ProForDsc = "" ;
      Z4586ProForObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      sStyleString = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      lblTextblock1_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A766ProForDsc = "" ;
      lblTextblock4_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      A4586ProForObs = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV22LitFe = "" ;
      AV16Lit0 = "" ;
      AV17Lit1 = "" ;
      AV18Lit2 = "" ;
      AV19Lit3 = "" ;
      AV20Lit4 = "" ;
      GXt_char1 = "" ;
      AV24Station = "" ;
      GXv_char2 = new String[1] ;
      AV25EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV21UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      T00L94_A407EmprNom = new String[] {""} ;
      T00L94_n407EmprNom = new boolean[] {false} ;
      T00L95_A764ProForCod = new String[] {""} ;
      T00L95_n764ProForCod = new boolean[] {false} ;
      T00L95_A766ProForDsc = new String[] {""} ;
      T00L95_A407EmprNom = new String[] {""} ;
      T00L95_n407EmprNom = new boolean[] {false} ;
      T00L95_A4586ProForObs = new String[] {""} ;
      T00L95_n4586ProForObs = new boolean[] {false} ;
      T00L95_A396EmprCod = new String[] {""} ;
      T00L96_A396EmprCod = new String[] {""} ;
      T00L96_A764ProForCod = new String[] {""} ;
      T00L96_n764ProForCod = new boolean[] {false} ;
      T00L93_A764ProForCod = new String[] {""} ;
      T00L93_n764ProForCod = new boolean[] {false} ;
      T00L93_A766ProForDsc = new String[] {""} ;
      T00L93_A4586ProForObs = new String[] {""} ;
      T00L93_n4586ProForObs = new boolean[] {false} ;
      T00L93_A396EmprCod = new String[] {""} ;
      sMode89 = "" ;
      T00L97_A396EmprCod = new String[] {""} ;
      T00L97_A764ProForCod = new String[] {""} ;
      T00L97_n764ProForCod = new boolean[] {false} ;
      T00L98_A396EmprCod = new String[] {""} ;
      T00L98_A764ProForCod = new String[] {""} ;
      T00L98_n764ProForCod = new boolean[] {false} ;
      T00L92_A764ProForCod = new String[] {""} ;
      T00L92_n764ProForCod = new boolean[] {false} ;
      T00L92_A766ProForDsc = new String[] {""} ;
      T00L92_A4586ProForObs = new String[] {""} ;
      T00L92_n4586ProForObs = new boolean[] {false} ;
      T00L92_A396EmprCod = new String[] {""} ;
      T00L912_A396EmprCod = new String[] {""} ;
      T00L912_A252CliCod = new int[1] ;
      T00L912_A13381CliProQui = new String[] {""} ;
      T00L913_A396EmprCod = new String[] {""} ;
      T00L913_A13026PedDGId = new int[1] ;
      T00L913_A758ProCod = new String[] {""} ;
      T00L913_A13045PedDGFasLi = new short[1] ;
      T00L913_A13057PedDGPQLin = new short[1] ;
      T00L914_A396EmprCod = new String[] {""} ;
      T00L914_A12673LavMqId = new int[1] ;
      T00L914_A12692LavMqLnPq = new short[1] ;
      T00L915_A396EmprCod = new String[] {""} ;
      T00L915_A129BarCod = new int[1] ;
      T00L915_A132BarCodReo = new byte[1] ;
      T00L915_A130BarCodPar = new String[] {""} ;
      T00L915_A4075recestncol = new byte[1] ;
      T00L915_A4076recestnpro = new byte[1] ;
      T00L916_A396EmprCod = new String[] {""} ;
      T00L916_A4052EstNumFor = new int[1] ;
      T00L916_A4053EstNumCol = new byte[1] ;
      T00L916_A4057EstNumLin = new byte[1] ;
      T00L917_A396EmprCod = new String[] {""} ;
      T00L917_A6380Ft_procod = new String[] {""} ;
      T00L917_A6383Ft_ProLin = new short[1] ;
      T00L918_A396EmprCod = new String[] {""} ;
      T00L918_A11270Pot_num = new int[1] ;
      T00L919_A396EmprCod = new String[] {""} ;
      T00L919_A764ProForCod = new String[] {""} ;
      T00L919_n764ProForCod = new boolean[] {false} ;
      T00L919_A8877Prg_Cod = new int[1] ;
      T00L920_A396EmprCod = new String[] {""} ;
      T00L920_A252CliCod = new int[1] ;
      T00L920_A494ForSer = new String[] {""} ;
      T00L920_A482ForColNom = new String[] {""} ;
      T00L920_A483ForColNum = new int[1] ;
      T00L920_A831TipColCod = new byte[1] ;
      T00L920_A7094Acab_Ter = new String[] {""} ;
      T00L921_A396EmprCod = new String[] {""} ;
      T00L921_A758ProCod = new String[] {""} ;
      T00L921_A774ProNumLin = new short[1] ;
      T00L921_A6438ProFsaL = new short[1] ;
      T00L922_A396EmprCod = new String[] {""} ;
      T00L922_A6319C_Barcod = new int[1] ;
      T00L922_A6320C_Barcodre = new byte[1] ;
      T00L922_A6321C_Barcodpa = new String[] {""} ;
      T00L922_A6322C_Reclinma = new short[1] ;
      T00L922_A6323C_Reclinpr = new byte[1] ;
      T00L923_A396EmprCod = new String[] {""} ;
      T00L923_A361DisCod = new int[1] ;
      T00L923_A758ProCod = new String[] {""} ;
      T00L923_A368DisFasLin = new short[1] ;
      T00L923_A5377DisQuiLin = new short[1] ;
      T00L924_A396EmprCod = new String[] {""} ;
      T00L924_A129BarCod = new int[1] ;
      T00L924_A132BarCodReo = new byte[1] ;
      T00L924_A130BarCodPar = new String[] {""} ;
      T00L924_A758ProCod = new String[] {""} ;
      T00L924_A194BarOrdLin = new short[1] ;
      T00L924_A5371FasQuiLin = new short[1] ;
      T00L925_A396EmprCod = new String[] {""} ;
      T00L925_A764ProForCod = new String[] {""} ;
      T00L925_n764ProForCod = new boolean[] {false} ;
      T00L925_A5191ProForLC = new short[1] ;
      T00L926_A396EmprCod = new String[] {""} ;
      T00L926_A764ProForCod = new String[] {""} ;
      T00L926_n764ProForCod = new boolean[] {false} ;
      T00L926_A5191ProForLC = new short[1] ;
      T00L927_A396EmprCod = new String[] {""} ;
      T00L927_A831TipColCod = new byte[1] ;
      T00L927_A5162TipColLin = new short[1] ;
      T00L928_A396EmprCod = new String[] {""} ;
      T00L928_A4744RecPreCod = new int[1] ;
      T00L928_A4762RecPreLin = new short[1] ;
      T00L929_A396EmprCod = new String[] {""} ;
      T00L929_A252CliCod = new int[1] ;
      T00L929_A65ArtCod = new String[] {""} ;
      T00L929_A4658MdlCod = new String[] {""} ;
      T00L929_A457FasCod = new String[] {""} ;
      T00L929_A4660FasProLin = new short[1] ;
      T00L930_A396EmprCod = new String[] {""} ;
      T00L930_A457FasCod = new String[] {""} ;
      T00L930_A4650FasForLin = new short[1] ;
      T00L931_A396EmprCod = new String[] {""} ;
      T00L931_A129BarCod = new int[1] ;
      T00L931_A132BarCodReo = new byte[1] ;
      T00L931_A130BarCodPar = new String[] {""} ;
      T00L931_A2804RecLinMaq = new short[1] ;
      T00L931_A1273RecLinPro = new byte[1] ;
      T00L932_A396EmprCod = new String[] {""} ;
      T00L932_A1514MacProCod = new String[] {""} ;
      T00L932_A1517MacProLin = new short[1] ;
      T00L933_A396EmprCod = new String[] {""} ;
      T00L933_A252CliCod = new int[1] ;
      T00L933_A494ForSer = new String[] {""} ;
      T00L933_A482ForColNom = new String[] {""} ;
      T00L933_A483ForColNum = new int[1] ;
      T00L933_A831TipColCod = new byte[1] ;
      T00L933_A1160ProForL = new short[1] ;
      T00L934_A396EmprCod = new String[] {""} ;
      T00L934_A910Workstat = new String[] {""} ;
      T00L934_A887EscMLin = new int[1] ;
      T00L935_A396EmprCod = new String[] {""} ;
      T00L935_A764ProForCod = new String[] {""} ;
      T00L935_n764ProForCod = new boolean[] {false} ;
      T00L935_A767ProForLin = new short[1] ;
      T00L936_A396EmprCod = new String[] {""} ;
      T00L936_A764ProForCod = new String[] {""} ;
      T00L936_n764ProForCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T00L937_A407EmprNom = new String[] {""} ;
      T00L937_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ764ProForCod = "" ;
      ZZ766ProForDsc = "" ;
      ZZ407EmprNom = "" ;
      ZZ4586ProForObs = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tprfobs__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tprfobs__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tprfobs__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tprfobs__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprfobs__default(),
         new Object[] {
             new Object[] {
            T00L92_A764ProForCod, T00L92_A766ProForDsc, T00L92_A4586ProForObs, T00L92_n4586ProForObs, T00L92_A396EmprCod
            }
            , new Object[] {
            T00L93_A764ProForCod, T00L93_A766ProForDsc, T00L93_A4586ProForObs, T00L93_n4586ProForObs, T00L93_A396EmprCod
            }
            , new Object[] {
            T00L94_A407EmprNom, T00L94_n407EmprNom
            }
            , new Object[] {
            T00L95_A764ProForCod, T00L95_A766ProForDsc, T00L95_A407EmprNom, T00L95_n407EmprNom, T00L95_A4586ProForObs, T00L95_n4586ProForObs, T00L95_A396EmprCod
            }
            , new Object[] {
            T00L96_A396EmprCod, T00L96_A764ProForCod
            }
            , new Object[] {
            T00L97_A396EmprCod, T00L97_A764ProForCod
            }
            , new Object[] {
            T00L98_A396EmprCod, T00L98_A764ProForCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00L912_A396EmprCod, T00L912_A252CliCod, T00L912_A13381CliProQui
            }
            , new Object[] {
            T00L913_A396EmprCod, T00L913_A13026PedDGId, T00L913_A758ProCod, T00L913_A13045PedDGFasLi, T00L913_A13057PedDGPQLin
            }
            , new Object[] {
            T00L914_A396EmprCod, T00L914_A12673LavMqId, T00L914_A12692LavMqLnPq
            }
            , new Object[] {
            T00L915_A396EmprCod, T00L915_A129BarCod, T00L915_A132BarCodReo, T00L915_A130BarCodPar, T00L915_A4075recestncol, T00L915_A4076recestnpro
            }
            , new Object[] {
            T00L916_A396EmprCod, T00L916_A4052EstNumFor, T00L916_A4053EstNumCol, T00L916_A4057EstNumLin
            }
            , new Object[] {
            T00L917_A396EmprCod, T00L917_A6380Ft_procod, T00L917_A6383Ft_ProLin
            }
            , new Object[] {
            T00L918_A396EmprCod, T00L918_A11270Pot_num
            }
            , new Object[] {
            T00L919_A396EmprCod, T00L919_A764ProForCod, T00L919_A8877Prg_Cod
            }
            , new Object[] {
            T00L920_A396EmprCod, T00L920_A252CliCod, T00L920_A494ForSer, T00L920_A482ForColNom, T00L920_A483ForColNum, T00L920_A831TipColCod, T00L920_A7094Acab_Ter
            }
            , new Object[] {
            T00L921_A396EmprCod, T00L921_A758ProCod, T00L921_A774ProNumLin, T00L921_A6438ProFsaL
            }
            , new Object[] {
            T00L922_A396EmprCod, T00L922_A6319C_Barcod, T00L922_A6320C_Barcodre, T00L922_A6321C_Barcodpa, T00L922_A6322C_Reclinma, T00L922_A6323C_Reclinpr
            }
            , new Object[] {
            T00L923_A396EmprCod, T00L923_A361DisCod, T00L923_A758ProCod, T00L923_A368DisFasLin, T00L923_A5377DisQuiLin
            }
            , new Object[] {
            T00L924_A396EmprCod, T00L924_A129BarCod, T00L924_A132BarCodReo, T00L924_A130BarCodPar, T00L924_A758ProCod, T00L924_A194BarOrdLin, T00L924_A5371FasQuiLin
            }
            , new Object[] {
            T00L925_A396EmprCod, T00L925_A764ProForCod, T00L925_A5191ProForLC
            }
            , new Object[] {
            T00L926_A396EmprCod, T00L926_A764ProForCod, T00L926_A5191ProForLC
            }
            , new Object[] {
            T00L927_A396EmprCod, T00L927_A831TipColCod, T00L927_A5162TipColLin
            }
            , new Object[] {
            T00L928_A396EmprCod, T00L928_A4744RecPreCod, T00L928_A4762RecPreLin
            }
            , new Object[] {
            T00L929_A396EmprCod, T00L929_A252CliCod, T00L929_A65ArtCod, T00L929_A4658MdlCod, T00L929_A457FasCod, T00L929_A4660FasProLin
            }
            , new Object[] {
            T00L930_A396EmprCod, T00L930_A457FasCod, T00L930_A4650FasForLin
            }
            , new Object[] {
            T00L931_A396EmprCod, T00L931_A129BarCod, T00L931_A132BarCodReo, T00L931_A130BarCodPar, T00L931_A2804RecLinMaq, T00L931_A1273RecLinPro
            }
            , new Object[] {
            T00L932_A396EmprCod, T00L932_A1514MacProCod, T00L932_A1517MacProLin
            }
            , new Object[] {
            T00L933_A396EmprCod, T00L933_A252CliCod, T00L933_A494ForSer, T00L933_A482ForColNom, T00L933_A483ForColNum, T00L933_A831TipColCod, T00L933_A1160ProForL
            }
            , new Object[] {
            T00L934_A396EmprCod, T00L934_A910Workstat, T00L934_A887EscMLin
            }
            , new Object[] {
            T00L935_A396EmprCod, T00L935_A764ProForCod, T00L935_A767ProForLin
            }
            , new Object[] {
            T00L936_A396EmprCod, T00L936_A764ProForCod
            }
            , new Object[] {
            T00L937_A407EmprNom, T00L937_n407EmprNom
            }
         }
      );
      Z764ProForCod = "" ;
      n764ProForCod = false ;
      A764ProForCod = "" ;
      n764ProForCod = false ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short AV27Nlin ;
   private short RcdFound89 ;
   private short nIsDirty_89 ;
   private short ZV27Nlin ;
   private short ZZV27Nlin ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtProForCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtProForDsc_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtProForObs_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GX_JID ;
   private int idxLst ;
   private int edtProForObs_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtProForDsc_Backcolor ;
   private int edtProForCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA764ProForCod ;
   private String Z396EmprCod ;
   private String Z764ProForCod ;
   private String Z766ProForDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtProForDsc_Internalname ;
   private String sStyleString ;
   private String tblTable1_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtn_first_Internalname ;
   private String bttBtn_first_Jsonclick ;
   private String bttBtn_previous_Internalname ;
   private String bttBtn_previous_Jsonclick ;
   private String bttBtn_next_Internalname ;
   private String bttBtn_next_Jsonclick ;
   private String bttBtn_last_Internalname ;
   private String bttBtn_last_Jsonclick ;
   private String bttBtn_select_Internalname ;
   private String bttBtn_select_Jsonclick ;
   private String tblTable2_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtProForCod_Internalname ;
   private String edtProForCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String A766ProForDsc ;
   private String edtProForDsc_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtProForObs_Internalname ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_check_Internalname ;
   private String bttBtn_check_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String bttBtn_help_Internalname ;
   private String bttBtn_help_Jsonclick ;
   private String Gx_mode ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV22LitFe ;
   private String AV16Lit0 ;
   private String AV17Lit1 ;
   private String AV18Lit2 ;
   private String AV19Lit3 ;
   private String AV20Lit4 ;
   private String GXt_char1 ;
   private String AV24Station ;
   private String GXv_char2[] ;
   private String AV25EmprNom ;
   private String GXv_char3[] ;
   private String AV21UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sMode89 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ764ProForCod ;
   private String ZZ766ProForDsc ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n764ProForCod ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n4586ProForObs ;
   private boolean returnInSub ;
   private String Z4586ProForObs ;
   private String A4586ProForObs ;
   private String ZZ4586ProForObs ;
   private IDataStoreProvider pr_default ;
   private String[] T00L94_A407EmprNom ;
   private boolean[] T00L94_n407EmprNom ;
   private String[] T00L95_A764ProForCod ;
   private boolean[] T00L95_n764ProForCod ;
   private String[] T00L95_A766ProForDsc ;
   private String[] T00L95_A407EmprNom ;
   private boolean[] T00L95_n407EmprNom ;
   private String[] T00L95_A4586ProForObs ;
   private boolean[] T00L95_n4586ProForObs ;
   private String[] T00L95_A396EmprCod ;
   private String[] T00L96_A396EmprCod ;
   private String[] T00L96_A764ProForCod ;
   private boolean[] T00L96_n764ProForCod ;
   private String[] T00L93_A764ProForCod ;
   private boolean[] T00L93_n764ProForCod ;
   private String[] T00L93_A766ProForDsc ;
   private String[] T00L93_A4586ProForObs ;
   private boolean[] T00L93_n4586ProForObs ;
   private String[] T00L93_A396EmprCod ;
   private String[] T00L97_A396EmprCod ;
   private String[] T00L97_A764ProForCod ;
   private boolean[] T00L97_n764ProForCod ;
   private String[] T00L98_A396EmprCod ;
   private String[] T00L98_A764ProForCod ;
   private boolean[] T00L98_n764ProForCod ;
   private String[] T00L92_A764ProForCod ;
   private boolean[] T00L92_n764ProForCod ;
   private String[] T00L92_A766ProForDsc ;
   private String[] T00L92_A4586ProForObs ;
   private boolean[] T00L92_n4586ProForObs ;
   private String[] T00L92_A396EmprCod ;
   private String[] T00L912_A396EmprCod ;
   private int[] T00L912_A252CliCod ;
   private String[] T00L912_A13381CliProQui ;
   private String[] T00L913_A396EmprCod ;
   private int[] T00L913_A13026PedDGId ;
   private String[] T00L913_A758ProCod ;
   private short[] T00L913_A13045PedDGFasLi ;
   private short[] T00L913_A13057PedDGPQLin ;
   private String[] T00L914_A396EmprCod ;
   private int[] T00L914_A12673LavMqId ;
   private short[] T00L914_A12692LavMqLnPq ;
   private String[] T00L915_A396EmprCod ;
   private int[] T00L915_A129BarCod ;
   private byte[] T00L915_A132BarCodReo ;
   private String[] T00L915_A130BarCodPar ;
   private byte[] T00L915_A4075recestncol ;
   private byte[] T00L915_A4076recestnpro ;
   private String[] T00L916_A396EmprCod ;
   private int[] T00L916_A4052EstNumFor ;
   private byte[] T00L916_A4053EstNumCol ;
   private byte[] T00L916_A4057EstNumLin ;
   private String[] T00L917_A396EmprCod ;
   private String[] T00L917_A6380Ft_procod ;
   private short[] T00L917_A6383Ft_ProLin ;
   private String[] T00L918_A396EmprCod ;
   private int[] T00L918_A11270Pot_num ;
   private String[] T00L919_A396EmprCod ;
   private String[] T00L919_A764ProForCod ;
   private boolean[] T00L919_n764ProForCod ;
   private int[] T00L919_A8877Prg_Cod ;
   private String[] T00L920_A396EmprCod ;
   private int[] T00L920_A252CliCod ;
   private String[] T00L920_A494ForSer ;
   private String[] T00L920_A482ForColNom ;
   private int[] T00L920_A483ForColNum ;
   private byte[] T00L920_A831TipColCod ;
   private String[] T00L920_A7094Acab_Ter ;
   private String[] T00L921_A396EmprCod ;
   private String[] T00L921_A758ProCod ;
   private short[] T00L921_A774ProNumLin ;
   private short[] T00L921_A6438ProFsaL ;
   private String[] T00L922_A396EmprCod ;
   private int[] T00L922_A6319C_Barcod ;
   private byte[] T00L922_A6320C_Barcodre ;
   private String[] T00L922_A6321C_Barcodpa ;
   private short[] T00L922_A6322C_Reclinma ;
   private byte[] T00L922_A6323C_Reclinpr ;
   private String[] T00L923_A396EmprCod ;
   private int[] T00L923_A361DisCod ;
   private String[] T00L923_A758ProCod ;
   private short[] T00L923_A368DisFasLin ;
   private short[] T00L923_A5377DisQuiLin ;
   private String[] T00L924_A396EmprCod ;
   private int[] T00L924_A129BarCod ;
   private byte[] T00L924_A132BarCodReo ;
   private String[] T00L924_A130BarCodPar ;
   private String[] T00L924_A758ProCod ;
   private short[] T00L924_A194BarOrdLin ;
   private short[] T00L924_A5371FasQuiLin ;
   private String[] T00L925_A396EmprCod ;
   private String[] T00L925_A764ProForCod ;
   private boolean[] T00L925_n764ProForCod ;
   private short[] T00L925_A5191ProForLC ;
   private String[] T00L926_A396EmprCod ;
   private String[] T00L926_A764ProForCod ;
   private boolean[] T00L926_n764ProForCod ;
   private short[] T00L926_A5191ProForLC ;
   private String[] T00L927_A396EmprCod ;
   private byte[] T00L927_A831TipColCod ;
   private short[] T00L927_A5162TipColLin ;
   private String[] T00L928_A396EmprCod ;
   private int[] T00L928_A4744RecPreCod ;
   private short[] T00L928_A4762RecPreLin ;
   private String[] T00L929_A396EmprCod ;
   private int[] T00L929_A252CliCod ;
   private String[] T00L929_A65ArtCod ;
   private String[] T00L929_A4658MdlCod ;
   private String[] T00L929_A457FasCod ;
   private short[] T00L929_A4660FasProLin ;
   private String[] T00L930_A396EmprCod ;
   private String[] T00L930_A457FasCod ;
   private short[] T00L930_A4650FasForLin ;
   private String[] T00L931_A396EmprCod ;
   private int[] T00L931_A129BarCod ;
   private byte[] T00L931_A132BarCodReo ;
   private String[] T00L931_A130BarCodPar ;
   private short[] T00L931_A2804RecLinMaq ;
   private byte[] T00L931_A1273RecLinPro ;
   private String[] T00L932_A396EmprCod ;
   private String[] T00L932_A1514MacProCod ;
   private short[] T00L932_A1517MacProLin ;
   private String[] T00L933_A396EmprCod ;
   private int[] T00L933_A252CliCod ;
   private String[] T00L933_A494ForSer ;
   private String[] T00L933_A482ForColNom ;
   private int[] T00L933_A483ForColNum ;
   private byte[] T00L933_A831TipColCod ;
   private short[] T00L933_A1160ProForL ;
   private String[] T00L934_A396EmprCod ;
   private String[] T00L934_A910Workstat ;
   private int[] T00L934_A887EscMLin ;
   private String[] T00L935_A396EmprCod ;
   private String[] T00L935_A764ProForCod ;
   private boolean[] T00L935_n764ProForCod ;
   private short[] T00L935_A767ProForLin ;
   private String[] T00L936_A396EmprCod ;
   private String[] T00L936_A764ProForCod ;
   private boolean[] T00L936_n764ProForCod ;
   private String[] T00L937_A407EmprNom ;
   private boolean[] T00L937_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tprfobs__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "MODA21";
   }

}

final  class tprfobs__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class tprfobs__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class tprfobs__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class tprfobs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00L92", "SELECT ProForCod, ProForDsc, ProForObs, EmprCod FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ?  FOR UPDATE OF ProForDsc, ProForObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L93", "SELECT ProForCod, ProForDsc, ProForObs, EmprCod FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L94", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L95", "SELECT /*+ FIRST_ROWS(1) */ TM1.ProForCod, TM1.ProForDsc, T2.EmprNom, TM1.ProForObs, TM1.EmprCod FROM (TXPCPROFO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.ProForCod = ? ORDER BY TM1.EmprCod, TM1.ProForCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L96", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProForCod FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L97", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProForCod FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L98", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProForCod FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod DESC, ProForCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00L99", "INSERT INTO TXPCPROFO(ProForCod, ProForDsc, ProForObs, EmprCod, ProForTie, ProForTmx, ProForMat, PorForFul, ProForUli, ProNumPro, ProNumRec, ProRev, ProForPau, ProForRb, ProForDsc2, ProForCCi, ProForDCi, ProFoLCU, ProForFac, IntCodF2, ProForTip, ProForFab, ProForLab, ProForCol, ProForPhx, ProForPhn, ProForAbs, ProForCos, ProforVl, ProH2O, ProForMer, ProNh2o, ProForAct, ProForRs) VALUES(?, ?, ?, ?, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, ' ', 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ')", GX_NOMASK, "TXPCPROFO")
         ,new UpdateCursor("T00L910", "UPDATE TXPCPROFO SET ProForDsc=?, ProForObs=?  WHERE EmprCod = ? AND ProForCod = ?", GX_NOMASK, "TXPCPROFO")
         ,new UpdateCursor("T00L911", "DELETE FROM TXPCPROFO  WHERE EmprCod = ? AND ProForCod = ?", GX_NOMASK, "TXPCPROFO")
         ,new ForEachCursor("T00L912", "SELECT * FROM (SELECT EmprCod, CliCod, CliProQui FROM TXPCLIPQU WHERE EmprCod = ? AND CliProQui = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L913", "SELECT * FROM (SELECT EmprCod, PedDGId, ProCod, PedDGFasLi, PedDGPQLin FROM TXPPEDDG7 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L914", "SELECT * FROM (SELECT EmprCod, LavMqId, LavMqLnPq FROM TXPLAVMQ1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L915", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro FROM TXPcreest WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L916", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstNumLin FROM TXPLCoPro WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L917", "SELECT * FROM (SELECT EmprCod, Ft_procod, Ft_ProLin FROM TXPFTPQS1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L918", "SELECT * FROM (SELECT EmprCod, Pot_num FROM TXPRECPOT WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L919", "SELECT * FROM (SELECT EmprCod, ProForCod, Prg_Cod FROM TXPPQPRGN WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L920", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Acab_Ter FROM TXPCORAQ WHERE EmprCod = ? AND Acab_Ter = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L921", "SELECT * FROM (SELECT EmprCod, ProCod, ProNumLin, ProFsaL FROM TXPPROFSA WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L922", "SELECT * FROM (SELECT EmprCod, C_Barcod, C_Barcodre, C_Barcodpa, C_Reclinma, C_Reclinpr FROM TXPCRECE1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L923", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin FROM TXPDISQUI WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L924", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L925", "SELECT * FROM (SELECT EmprCod, ProForCod, ProForLC FROM TXPPROFOC WHERE EmprCod = ? AND ProFoQuC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L926", "SELECT * FROM (SELECT EmprCod, ProForCod, ProForLC FROM TXPPROFOC WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L927", "SELECT * FROM (SELECT EmprCod, TipColCod, TipColLin FROM TXPTIPCOP WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L928", "SELECT * FROM (SELECT EmprCod, RecPreCod, RecPreLin FROM TXPPRERE1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L929", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, MdlCod, FasCod, FasProLin FROM TXPLForFa WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L930", "SELECT * FROM (SELECT EmprCod, FasCod, FasForLin FROM TXPFASPR1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L931", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L932", "SELECT * FROM (SELECT EmprCod, MacProCod, MacProLin FROM TXPLMACPR WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L933", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L934", "SELECT * FROM (SELECT EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L935", "SELECT * FROM (SELECT EmprCod, ProForCod, ProForLin FROM TXPLPROFO WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L936", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ProForCod FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L937", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 30);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[4], 300);
               }
               stmt.setString(4, (String)parms[5], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 30);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 300);
               }
               stmt.setString(3, (String)parms[3], 3);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 6);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

