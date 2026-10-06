package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class txtogeq_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "RX enl Totus, Gpo Eco, Queue", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtXTOGEQPrv_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public txtogeq_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public txtogeq_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txtogeq_impl.class ));
   }

   public txtogeq_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXTOGEQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXTOGEQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXTOGEQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXTOGEQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TXTOGEQ.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Proveedor", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXTOGEQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXTOGEQPrv_Internalname, A10205XTOGEQPrv, GXutil.rtrim( localUtil.format( A10205XTOGEQPrv, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXTOGEQPrv_Jsonclick, 0, "", "", "", "", "", 1, edtXTOGEQPrv_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXTOGEQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Número de Tienda", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXTOGEQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXTOGEQTda_Internalname, A10206XTOGEQTda, GXutil.rtrim( localUtil.format( A10206XTOGEQTda, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXTOGEQTda_Jsonclick, 0, "", "", "", "", "", 1, edtXTOGEQTda_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXTOGEQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre Proveedor", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXTOGEQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXTOGEQPrvN_Internalname, A10207XTOGEQPrvN, GXutil.rtrim( localUtil.format( A10207XTOGEQPrvN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXTOGEQPrvN_Jsonclick, 0, "", "", "", "", "", 1, edtXTOGEQPrvN_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXTOGEQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Código Grupo Económico", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXTOGEQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXTOGEQCod_Internalname, A10208XTOGEQCod, GXutil.rtrim( localUtil.format( A10208XTOGEQCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXTOGEQCod_Jsonclick, 0, "", "", "", "", "", 1, edtXTOGEQCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXTOGEQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXTOGEQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre Grupo Económico", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXTOGEQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXTOGEQNom_Internalname, A10209XTOGEQNom, GXutil.rtrim( localUtil.format( A10209XTOGEQNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXTOGEQNom_Jsonclick, 0, "", "", "", "", "", 1, edtXTOGEQNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXTOGEQ.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXTOGEQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXTOGEQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXTOGEQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXTOGEQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TXTOGEQ.htm");
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
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Z10205XTOGEQPrv = httpContext.cgiGet( "Z10205XTOGEQPrv") ;
         Z10206XTOGEQTda = httpContext.cgiGet( "Z10206XTOGEQTda") ;
         Z10208XTOGEQCod = httpContext.cgiGet( "Z10208XTOGEQCod") ;
         Z10207XTOGEQPrvN = httpContext.cgiGet( "Z10207XTOGEQPrvN") ;
         Z10209XTOGEQNom = httpContext.cgiGet( "Z10209XTOGEQNom") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A10205XTOGEQPrv = httpContext.cgiGet( edtXTOGEQPrv_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10205XTOGEQPrv", A10205XTOGEQPrv);
         A10206XTOGEQTda = httpContext.cgiGet( edtXTOGEQTda_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10206XTOGEQTda", A10206XTOGEQTda);
         A10207XTOGEQPrvN = httpContext.cgiGet( edtXTOGEQPrvN_Internalname) ;
         n10207XTOGEQPrvN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10207XTOGEQPrvN", A10207XTOGEQPrvN);
         A10208XTOGEQCod = httpContext.cgiGet( edtXTOGEQCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10208XTOGEQCod", A10208XTOGEQCod);
         A10209XTOGEQNom = httpContext.cgiGet( edtXTOGEQNom_Internalname) ;
         n10209XTOGEQNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10209XTOGEQNom", A10209XTOGEQNom);
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
            A10205XTOGEQPrv = httpContext.GetPar( "XTOGEQPrv") ;
            httpContext.ajax_rsp_assign_attri("", false, "A10205XTOGEQPrv", A10205XTOGEQPrv);
            A10206XTOGEQTda = httpContext.GetPar( "XTOGEQTda") ;
            httpContext.ajax_rsp_assign_attri("", false, "A10206XTOGEQTda", A10206XTOGEQTda);
            A10208XTOGEQCod = httpContext.GetPar( "XTOGEQCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A10208XTOGEQCod", A10208XTOGEQCod);
            getEqualNoModal( ) ;
            Gx_mode = "DSP" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            disable_std_buttons_dsp( ) ;
            standaloneModal( ) ;
         }
         else
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            standaloneModal( ) ;
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
                     if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
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
            initAll17C1382( ) ;
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
      disableAttributes17C1382( ) ;
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

   public void confirm_17C0( )
   {
      beforeValidate17C1382( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls17C1382( ) ;
         }
         else
         {
            checkExtendedTable17C1382( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors17C1382( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues17C0( ) ;
      }
   }

   public void resetCaption17C0( )
   {
   }

   public void zm17C1382( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10207XTOGEQPrvN = T017C3_A10207XTOGEQPrvN[0] ;
            Z10209XTOGEQNom = T017C3_A10209XTOGEQNom[0] ;
         }
         else
         {
            Z10207XTOGEQPrvN = A10207XTOGEQPrvN ;
            Z10209XTOGEQNom = A10209XTOGEQNom ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z10205XTOGEQPrv = A10205XTOGEQPrv ;
         Z10206XTOGEQTda = A10206XTOGEQTda ;
         Z10208XTOGEQCod = A10208XTOGEQCod ;
         Z10207XTOGEQPrvN = A10207XTOGEQPrvN ;
         Z10209XTOGEQNom = A10209XTOGEQNom ;
      }
   }

   public void standaloneNotModal( )
   {
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

   public void load17C1382( )
   {
      /* Using cursor T017C4 */
      pr_default.execute(2, new Object[] {A10205XTOGEQPrv, A10206XTOGEQTda, A10208XTOGEQCod});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1382 = (short)(1) ;
         A10207XTOGEQPrvN = T017C4_A10207XTOGEQPrvN[0] ;
         n10207XTOGEQPrvN = T017C4_n10207XTOGEQPrvN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10207XTOGEQPrvN", A10207XTOGEQPrvN);
         A10209XTOGEQNom = T017C4_A10209XTOGEQNom[0] ;
         n10209XTOGEQNom = T017C4_n10209XTOGEQNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10209XTOGEQNom", A10209XTOGEQNom);
         zm17C1382( -1) ;
      }
      pr_default.close(2);
      onLoadActions17C1382( ) ;
   }

   public void onLoadActions17C1382( )
   {
   }

   public void checkExtendedTable17C1382( )
   {
      nIsDirty_1382 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors17C1382( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey17C1382( )
   {
      /* Using cursor T017C5 */
      pr_default.execute(3, new Object[] {A10205XTOGEQPrv, A10206XTOGEQTda, A10208XTOGEQCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1382 = (short)(1) ;
      }
      else
      {
         RcdFound1382 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T017C3 */
      pr_default.execute(1, new Object[] {A10205XTOGEQPrv, A10206XTOGEQTda, A10208XTOGEQCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm17C1382( 1) ;
         RcdFound1382 = (short)(1) ;
         A10205XTOGEQPrv = T017C3_A10205XTOGEQPrv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10205XTOGEQPrv", A10205XTOGEQPrv);
         A10206XTOGEQTda = T017C3_A10206XTOGEQTda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10206XTOGEQTda", A10206XTOGEQTda);
         A10208XTOGEQCod = T017C3_A10208XTOGEQCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10208XTOGEQCod", A10208XTOGEQCod);
         A10207XTOGEQPrvN = T017C3_A10207XTOGEQPrvN[0] ;
         n10207XTOGEQPrvN = T017C3_n10207XTOGEQPrvN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10207XTOGEQPrvN", A10207XTOGEQPrvN);
         A10209XTOGEQNom = T017C3_A10209XTOGEQNom[0] ;
         n10209XTOGEQNom = T017C3_n10209XTOGEQNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10209XTOGEQNom", A10209XTOGEQNom);
         Z10205XTOGEQPrv = A10205XTOGEQPrv ;
         Z10206XTOGEQTda = A10206XTOGEQTda ;
         Z10208XTOGEQCod = A10208XTOGEQCod ;
         sMode1382 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load17C1382( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1382 = (short)(0) ;
            initializeNonKey17C1382( ) ;
         }
         Gx_mode = sMode1382 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1382 = (short)(0) ;
         initializeNonKey17C1382( ) ;
         sMode1382 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1382 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey17C1382( ) ;
      if ( RcdFound1382 == 0 )
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
      RcdFound1382 = (short)(0) ;
      /* Using cursor T017C6 */
      pr_default.execute(4, new Object[] {A10205XTOGEQPrv, A10205XTOGEQPrv, A10206XTOGEQTda, A10206XTOGEQTda, A10205XTOGEQPrv, A10208XTOGEQCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T017C6_A10205XTOGEQPrv[0], A10205XTOGEQPrv) < 0 ) || ( GXutil.strcmp(T017C6_A10205XTOGEQPrv[0], A10205XTOGEQPrv) == 0 ) && ( GXutil.strcmp(T017C6_A10206XTOGEQTda[0], A10206XTOGEQTda) < 0 ) || ( GXutil.strcmp(T017C6_A10206XTOGEQTda[0], A10206XTOGEQTda) == 0 ) && ( GXutil.strcmp(T017C6_A10205XTOGEQPrv[0], A10205XTOGEQPrv) == 0 ) && ( GXutil.strcmp(T017C6_A10208XTOGEQCod[0], A10208XTOGEQCod) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T017C6_A10205XTOGEQPrv[0], A10205XTOGEQPrv) > 0 ) || ( GXutil.strcmp(T017C6_A10205XTOGEQPrv[0], A10205XTOGEQPrv) == 0 ) && ( GXutil.strcmp(T017C6_A10206XTOGEQTda[0], A10206XTOGEQTda) > 0 ) || ( GXutil.strcmp(T017C6_A10206XTOGEQTda[0], A10206XTOGEQTda) == 0 ) && ( GXutil.strcmp(T017C6_A10205XTOGEQPrv[0], A10205XTOGEQPrv) == 0 ) && ( GXutil.strcmp(T017C6_A10208XTOGEQCod[0], A10208XTOGEQCod) > 0 ) ) )
         {
            A10205XTOGEQPrv = T017C6_A10205XTOGEQPrv[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10205XTOGEQPrv", A10205XTOGEQPrv);
            A10206XTOGEQTda = T017C6_A10206XTOGEQTda[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10206XTOGEQTda", A10206XTOGEQTda);
            A10208XTOGEQCod = T017C6_A10208XTOGEQCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10208XTOGEQCod", A10208XTOGEQCod);
            RcdFound1382 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1382 = (short)(0) ;
      /* Using cursor T017C7 */
      pr_default.execute(5, new Object[] {A10205XTOGEQPrv, A10205XTOGEQPrv, A10206XTOGEQTda, A10206XTOGEQTda, A10205XTOGEQPrv, A10208XTOGEQCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T017C7_A10205XTOGEQPrv[0], A10205XTOGEQPrv) > 0 ) || ( GXutil.strcmp(T017C7_A10205XTOGEQPrv[0], A10205XTOGEQPrv) == 0 ) && ( GXutil.strcmp(T017C7_A10206XTOGEQTda[0], A10206XTOGEQTda) > 0 ) || ( GXutil.strcmp(T017C7_A10206XTOGEQTda[0], A10206XTOGEQTda) == 0 ) && ( GXutil.strcmp(T017C7_A10205XTOGEQPrv[0], A10205XTOGEQPrv) == 0 ) && ( GXutil.strcmp(T017C7_A10208XTOGEQCod[0], A10208XTOGEQCod) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T017C7_A10205XTOGEQPrv[0], A10205XTOGEQPrv) < 0 ) || ( GXutil.strcmp(T017C7_A10205XTOGEQPrv[0], A10205XTOGEQPrv) == 0 ) && ( GXutil.strcmp(T017C7_A10206XTOGEQTda[0], A10206XTOGEQTda) < 0 ) || ( GXutil.strcmp(T017C7_A10206XTOGEQTda[0], A10206XTOGEQTda) == 0 ) && ( GXutil.strcmp(T017C7_A10205XTOGEQPrv[0], A10205XTOGEQPrv) == 0 ) && ( GXutil.strcmp(T017C7_A10208XTOGEQCod[0], A10208XTOGEQCod) < 0 ) ) )
         {
            A10205XTOGEQPrv = T017C7_A10205XTOGEQPrv[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10205XTOGEQPrv", A10205XTOGEQPrv);
            A10206XTOGEQTda = T017C7_A10206XTOGEQTda[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10206XTOGEQTda", A10206XTOGEQTda);
            A10208XTOGEQCod = T017C7_A10208XTOGEQCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10208XTOGEQCod", A10208XTOGEQCod);
            RcdFound1382 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey17C1382( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtXTOGEQPrv_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert17C1382( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1382 == 1 )
         {
            if ( ( GXutil.strcmp(A10205XTOGEQPrv, Z10205XTOGEQPrv) != 0 ) || ( GXutil.strcmp(A10206XTOGEQTda, Z10206XTOGEQTda) != 0 ) || ( GXutil.strcmp(A10208XTOGEQCod, Z10208XTOGEQCod) != 0 ) )
            {
               A10205XTOGEQPrv = Z10205XTOGEQPrv ;
               httpContext.ajax_rsp_assign_attri("", false, "A10205XTOGEQPrv", A10205XTOGEQPrv);
               A10206XTOGEQTda = Z10206XTOGEQTda ;
               httpContext.ajax_rsp_assign_attri("", false, "A10206XTOGEQTda", A10206XTOGEQTda);
               A10208XTOGEQCod = Z10208XTOGEQCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A10208XTOGEQCod", A10208XTOGEQCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "XTOGEQPRV");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXTOGEQPrv_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtXTOGEQPrv_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update17C1382( ) ;
               GX_FocusControl = edtXTOGEQPrv_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A10205XTOGEQPrv, Z10205XTOGEQPrv) != 0 ) || ( GXutil.strcmp(A10206XTOGEQTda, Z10206XTOGEQTda) != 0 ) || ( GXutil.strcmp(A10208XTOGEQCod, Z10208XTOGEQCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtXTOGEQPrv_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert17C1382( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "XTOGEQPRV");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtXTOGEQPrv_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtXTOGEQPrv_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert17C1382( ) ;
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
      if ( ( GXutil.strcmp(A10205XTOGEQPrv, Z10205XTOGEQPrv) != 0 ) || ( GXutil.strcmp(A10206XTOGEQTda, Z10206XTOGEQTda) != 0 ) || ( GXutil.strcmp(A10208XTOGEQCod, Z10208XTOGEQCod) != 0 ) )
      {
         A10205XTOGEQPrv = Z10205XTOGEQPrv ;
         httpContext.ajax_rsp_assign_attri("", false, "A10205XTOGEQPrv", A10205XTOGEQPrv);
         A10206XTOGEQTda = Z10206XTOGEQTda ;
         httpContext.ajax_rsp_assign_attri("", false, "A10206XTOGEQTda", A10206XTOGEQTda);
         A10208XTOGEQCod = Z10208XTOGEQCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A10208XTOGEQCod", A10208XTOGEQCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "XTOGEQPRV");
         AnyError = (short)(1) ;
         GX_FocusControl = edtXTOGEQPrv_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtXTOGEQPrv_Internalname ;
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
      getKey17C1382( ) ;
      if ( RcdFound1382 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "XTOGEQPRV");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXTOGEQPrv_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A10205XTOGEQPrv, Z10205XTOGEQPrv) != 0 ) || ( GXutil.strcmp(A10206XTOGEQTda, Z10206XTOGEQTda) != 0 ) || ( GXutil.strcmp(A10208XTOGEQCod, Z10208XTOGEQCod) != 0 ) )
         {
            A10205XTOGEQPrv = Z10205XTOGEQPrv ;
            httpContext.ajax_rsp_assign_attri("", false, "A10205XTOGEQPrv", A10205XTOGEQPrv);
            A10206XTOGEQTda = Z10206XTOGEQTda ;
            httpContext.ajax_rsp_assign_attri("", false, "A10206XTOGEQTda", A10206XTOGEQTda);
            A10208XTOGEQCod = Z10208XTOGEQCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A10208XTOGEQCod", A10208XTOGEQCod);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "XTOGEQPRV");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXTOGEQPrv_Internalname ;
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
         if ( ( GXutil.strcmp(A10205XTOGEQPrv, Z10205XTOGEQPrv) != 0 ) || ( GXutil.strcmp(A10206XTOGEQTda, Z10206XTOGEQTda) != 0 ) || ( GXutil.strcmp(A10208XTOGEQCod, Z10208XTOGEQCod) != 0 ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "XTOGEQPRV");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXTOGEQPrv_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "txtogeq");
      GX_FocusControl = edtXTOGEQPrvN_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_17C0( ) ;
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
      if ( RcdFound1382 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "XTOGEQPRV");
         AnyError = (short)(1) ;
         GX_FocusControl = edtXTOGEQPrv_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtXTOGEQPrvN_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart17C1382( ) ;
      if ( RcdFound1382 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtXTOGEQPrvN_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd17C1382( ) ;
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
      if ( RcdFound1382 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtXTOGEQPrvN_Internalname ;
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
      if ( RcdFound1382 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtXTOGEQPrvN_Internalname ;
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
      scanStart17C1382( ) ;
      if ( RcdFound1382 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1382 != 0 )
         {
            scanNext17C1382( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtXTOGEQPrvN_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd17C1382( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency17C1382( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T017C2 */
         pr_default.execute(0, new Object[] {A10205XTOGEQPrv, A10206XTOGEQTda, A10208XTOGEQCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPXTOGEQ"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10207XTOGEQPrvN, T017C2_A10207XTOGEQPrvN[0]) != 0 ) || ( GXutil.strcmp(Z10209XTOGEQNom, T017C2_A10209XTOGEQNom[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z10207XTOGEQPrvN, T017C2_A10207XTOGEQPrvN[0]) != 0 )
            {
               GXutil.writeLogln("txtogeq:[seudo value changed for attri]"+"XTOGEQPrvN");
               GXutil.writeLogRaw("Old: ",Z10207XTOGEQPrvN);
               GXutil.writeLogRaw("Current: ",T017C2_A10207XTOGEQPrvN[0]);
            }
            if ( GXutil.strcmp(Z10209XTOGEQNom, T017C2_A10209XTOGEQNom[0]) != 0 )
            {
               GXutil.writeLogln("txtogeq:[seudo value changed for attri]"+"XTOGEQNom");
               GXutil.writeLogRaw("Old: ",Z10209XTOGEQNom);
               GXutil.writeLogRaw("Current: ",T017C2_A10209XTOGEQNom[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPXTOGEQ"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert17C1382( )
   {
      beforeValidate17C1382( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17C1382( ) ;
      }
      if ( AnyError == 0 )
      {
         zm17C1382( 0) ;
         checkOptimisticConcurrency17C1382( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17C1382( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert17C1382( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017C8 */
                  pr_default.execute(6, new Object[] {A10205XTOGEQPrv, A10206XTOGEQTda, A10208XTOGEQCod, Boolean.valueOf(n10207XTOGEQPrvN), A10207XTOGEQPrvN, Boolean.valueOf(n10209XTOGEQNom), A10209XTOGEQNom});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXTOGEQ");
                  if ( (pr_default.getStatus(6) == 1) )
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
                        resetCaption17C0( ) ;
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
            load17C1382( ) ;
         }
         endLevel17C1382( ) ;
      }
      closeExtendedTableCursors17C1382( ) ;
   }

   public void update17C1382( )
   {
      beforeValidate17C1382( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17C1382( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17C1382( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17C1382( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate17C1382( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017C9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n10207XTOGEQPrvN), A10207XTOGEQPrvN, Boolean.valueOf(n10209XTOGEQNom), A10209XTOGEQNom, A10205XTOGEQPrv, A10206XTOGEQTda, A10208XTOGEQCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXTOGEQ");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPXTOGEQ"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate17C1382( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption17C0( ) ;
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
         endLevel17C1382( ) ;
      }
      closeExtendedTableCursors17C1382( ) ;
   }

   public void deferredUpdate17C1382( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate17C1382( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17C1382( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls17C1382( ) ;
         afterConfirm17C1382( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete17C1382( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T017C10 */
               pr_default.execute(8, new Object[] {A10205XTOGEQPrv, A10206XTOGEQTda, A10208XTOGEQCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXTOGEQ");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1382 == 0 )
                     {
                        initAll17C1382( ) ;
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
                     resetCaption17C0( ) ;
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
      sMode1382 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel17C1382( ) ;
      Gx_mode = sMode1382 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls17C1382( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel17C1382( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete17C1382( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "txtogeq");
         if ( AnyError == 0 )
         {
            confirmValues17C0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "txtogeq");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart17C1382( )
   {
      /* Using cursor T017C11 */
      pr_default.execute(9);
      RcdFound1382 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1382 = (short)(1) ;
         A10205XTOGEQPrv = T017C11_A10205XTOGEQPrv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10205XTOGEQPrv", A10205XTOGEQPrv);
         A10206XTOGEQTda = T017C11_A10206XTOGEQTda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10206XTOGEQTda", A10206XTOGEQTda);
         A10208XTOGEQCod = T017C11_A10208XTOGEQCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10208XTOGEQCod", A10208XTOGEQCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext17C1382( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound1382 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1382 = (short)(1) ;
         A10205XTOGEQPrv = T017C11_A10205XTOGEQPrv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10205XTOGEQPrv", A10205XTOGEQPrv);
         A10206XTOGEQTda = T017C11_A10206XTOGEQTda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10206XTOGEQTda", A10206XTOGEQTda);
         A10208XTOGEQCod = T017C11_A10208XTOGEQCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10208XTOGEQCod", A10208XTOGEQCod);
      }
   }

   public void scanEnd17C1382( )
   {
      pr_default.close(9);
   }

   public void afterConfirm17C1382( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert17C1382( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate17C1382( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete17C1382( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete17C1382( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate17C1382( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes17C1382( )
   {
      edtXTOGEQPrv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXTOGEQPrv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXTOGEQPrv_Enabled), 5, 0), true);
      edtXTOGEQTda_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXTOGEQTda_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXTOGEQTda_Enabled), 5, 0), true);
      edtXTOGEQPrvN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXTOGEQPrvN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXTOGEQPrvN_Enabled), 5, 0), true);
      edtXTOGEQCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXTOGEQCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXTOGEQCod_Enabled), 5, 0), true);
      edtXTOGEQNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXTOGEQNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXTOGEQNom_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes17C1382( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues17C0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.txtogeq", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10205XTOGEQPrv", Z10205XTOGEQPrv);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10206XTOGEQTda", Z10206XTOGEQTda);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10208XTOGEQCod", Z10208XTOGEQCod);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10207XTOGEQPrvN", Z10207XTOGEQPrvN);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10209XTOGEQNom", Z10209XTOGEQNom);
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
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
      return formatLink("app.txtogeq", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TXTOGEQ" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "RX enl Totus, Gpo Eco, Queue", "") ;
   }

   public void initializeNonKey17C1382( )
   {
      A10207XTOGEQPrvN = "" ;
      n10207XTOGEQPrvN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10207XTOGEQPrvN", A10207XTOGEQPrvN);
      A10209XTOGEQNom = "" ;
      n10209XTOGEQNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10209XTOGEQNom", A10209XTOGEQNom);
      Z10207XTOGEQPrvN = "" ;
      Z10209XTOGEQNom = "" ;
   }

   public void initAll17C1382( )
   {
      A10205XTOGEQPrv = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10205XTOGEQPrv", A10205XTOGEQPrv);
      A10206XTOGEQTda = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10206XTOGEQTda", A10206XTOGEQTda);
      A10208XTOGEQCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10208XTOGEQCod", A10208XTOGEQCod);
      initializeNonKey17C1382( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20261251913043", true, true);
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
      httpContext.AddJavascriptSource("txtogeq.js", "?20261251913043", false, true);
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
      edtXTOGEQPrv_Internalname = "XTOGEQPRV" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtXTOGEQTda_Internalname = "XTOGEQTDA" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtXTOGEQPrvN_Internalname = "XTOGEQPRVN" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtXTOGEQCod_Internalname = "XTOGEQCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtXTOGEQNom_Internalname = "XTOGEQNOM" ;
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
      Form.setCaption( httpContext.getMessage( "RX enl Totus, Gpo Eco, Queue", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtXTOGEQNom_Jsonclick = "" ;
      edtXTOGEQNom_Backcolor = (int)(0xFFFFFF) ;
      edtXTOGEQNom_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtXTOGEQCod_Jsonclick = "" ;
      edtXTOGEQCod_Backcolor = (int)(0xFFFFFF) ;
      edtXTOGEQCod_Enabled = 1 ;
      edtXTOGEQPrvN_Jsonclick = "" ;
      edtXTOGEQPrvN_Backcolor = (int)(0xFFFFFF) ;
      edtXTOGEQPrvN_Enabled = 1 ;
      edtXTOGEQTda_Jsonclick = "" ;
      edtXTOGEQTda_Backcolor = (int)(0xFFFFFF) ;
      edtXTOGEQTda_Enabled = 1 ;
      edtXTOGEQPrv_Jsonclick = "" ;
      edtXTOGEQPrv_Backcolor = (int)(0xFFFFFF) ;
      edtXTOGEQPrv_Enabled = 1 ;
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
      GX_FocusControl = edtXTOGEQPrvN_Internalname ;
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

   public void valid_Xtogeqcod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10207XTOGEQPrvN", A10207XTOGEQPrvN);
      httpContext.ajax_rsp_assign_attri("", false, "A10209XTOGEQNom", A10209XTOGEQNom);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10205XTOGEQPrv", Z10205XTOGEQPrv);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10206XTOGEQTda", Z10206XTOGEQTda);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10208XTOGEQCod", Z10208XTOGEQCod);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10207XTOGEQPrvN", Z10207XTOGEQPrvN);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10209XTOGEQNom", Z10209XTOGEQNom);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_XTOGEQPRV","{handler:'valid_Xtogeqprv',iparms:[]");
      setEventMetadata("VALID_XTOGEQPRV",",oparms:[]}");
      setEventMetadata("VALID_XTOGEQTDA","{handler:'valid_Xtogeqtda',iparms:[]");
      setEventMetadata("VALID_XTOGEQTDA",",oparms:[]}");
      setEventMetadata("VALID_XTOGEQCOD","{handler:'valid_Xtogeqcod',iparms:[{av:'A10205XTOGEQPrv',fld:'XTOGEQPRV',pic:''},{av:'A10206XTOGEQTda',fld:'XTOGEQTDA',pic:''},{av:'A10208XTOGEQCod',fld:'XTOGEQCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_XTOGEQCOD",",oparms:[{av:'A10207XTOGEQPrvN',fld:'XTOGEQPRVN',pic:''},{av:'A10209XTOGEQNom',fld:'XTOGEQNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z10205XTOGEQPrv'},{av:'Z10206XTOGEQTda'},{av:'Z10208XTOGEQCod'},{av:'Z10207XTOGEQPrvN'},{av:'Z10209XTOGEQNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      sPrefix = "" ;
      Z10205XTOGEQPrv = "" ;
      Z10206XTOGEQTda = "" ;
      Z10208XTOGEQCod = "" ;
      Z10207XTOGEQPrvN = "" ;
      Z10209XTOGEQNom = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      A10205XTOGEQPrv = "" ;
      lblTextblock2_Jsonclick = "" ;
      A10206XTOGEQTda = "" ;
      lblTextblock3_Jsonclick = "" ;
      A10207XTOGEQPrvN = "" ;
      lblTextblock4_Jsonclick = "" ;
      A10208XTOGEQCod = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A10209XTOGEQNom = "" ;
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
      T017C4_A10205XTOGEQPrv = new String[] {""} ;
      T017C4_A10206XTOGEQTda = new String[] {""} ;
      T017C4_A10208XTOGEQCod = new String[] {""} ;
      T017C4_A10207XTOGEQPrvN = new String[] {""} ;
      T017C4_n10207XTOGEQPrvN = new boolean[] {false} ;
      T017C4_A10209XTOGEQNom = new String[] {""} ;
      T017C4_n10209XTOGEQNom = new boolean[] {false} ;
      T017C5_A10205XTOGEQPrv = new String[] {""} ;
      T017C5_A10206XTOGEQTda = new String[] {""} ;
      T017C5_A10208XTOGEQCod = new String[] {""} ;
      T017C3_A10205XTOGEQPrv = new String[] {""} ;
      T017C3_A10206XTOGEQTda = new String[] {""} ;
      T017C3_A10208XTOGEQCod = new String[] {""} ;
      T017C3_A10207XTOGEQPrvN = new String[] {""} ;
      T017C3_n10207XTOGEQPrvN = new boolean[] {false} ;
      T017C3_A10209XTOGEQNom = new String[] {""} ;
      T017C3_n10209XTOGEQNom = new boolean[] {false} ;
      sMode1382 = "" ;
      T017C6_A10205XTOGEQPrv = new String[] {""} ;
      T017C6_A10206XTOGEQTda = new String[] {""} ;
      T017C6_A10208XTOGEQCod = new String[] {""} ;
      T017C7_A10205XTOGEQPrv = new String[] {""} ;
      T017C7_A10206XTOGEQTda = new String[] {""} ;
      T017C7_A10208XTOGEQCod = new String[] {""} ;
      T017C2_A10205XTOGEQPrv = new String[] {""} ;
      T017C2_A10206XTOGEQTda = new String[] {""} ;
      T017C2_A10208XTOGEQCod = new String[] {""} ;
      T017C2_A10207XTOGEQPrvN = new String[] {""} ;
      T017C2_n10207XTOGEQPrvN = new boolean[] {false} ;
      T017C2_A10209XTOGEQNom = new String[] {""} ;
      T017C2_n10209XTOGEQNom = new boolean[] {false} ;
      T017C11_A10205XTOGEQPrv = new String[] {""} ;
      T017C11_A10206XTOGEQTda = new String[] {""} ;
      T017C11_A10208XTOGEQCod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ10205XTOGEQPrv = "" ;
      ZZ10206XTOGEQTda = "" ;
      ZZ10208XTOGEQCod = "" ;
      ZZ10207XTOGEQPrvN = "" ;
      ZZ10209XTOGEQNom = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.txtogeq__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.txtogeq__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.txtogeq__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txtogeq__default(),
         new Object[] {
             new Object[] {
            T017C2_A10205XTOGEQPrv, T017C2_A10206XTOGEQTda, T017C2_A10208XTOGEQCod, T017C2_A10207XTOGEQPrvN, T017C2_n10207XTOGEQPrvN, T017C2_A10209XTOGEQNom, T017C2_n10209XTOGEQNom
            }
            , new Object[] {
            T017C3_A10205XTOGEQPrv, T017C3_A10206XTOGEQTda, T017C3_A10208XTOGEQCod, T017C3_A10207XTOGEQPrvN, T017C3_n10207XTOGEQPrvN, T017C3_A10209XTOGEQNom, T017C3_n10209XTOGEQNom
            }
            , new Object[] {
            T017C4_A10205XTOGEQPrv, T017C4_A10206XTOGEQTda, T017C4_A10208XTOGEQCod, T017C4_A10207XTOGEQPrvN, T017C4_n10207XTOGEQPrvN, T017C4_A10209XTOGEQNom, T017C4_n10209XTOGEQNom
            }
            , new Object[] {
            T017C5_A10205XTOGEQPrv, T017C5_A10206XTOGEQTda, T017C5_A10208XTOGEQCod
            }
            , new Object[] {
            T017C6_A10205XTOGEQPrv, T017C6_A10206XTOGEQTda, T017C6_A10208XTOGEQCod
            }
            , new Object[] {
            T017C7_A10205XTOGEQPrv, T017C7_A10206XTOGEQTda, T017C7_A10208XTOGEQCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017C11_A10205XTOGEQPrv, T017C11_A10206XTOGEQTda, T017C11_A10208XTOGEQCod
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1382 ;
   private short nIsDirty_1382 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtXTOGEQPrv_Enabled ;
   private int edtXTOGEQTda_Enabled ;
   private int edtXTOGEQPrvN_Enabled ;
   private int edtXTOGEQCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtXTOGEQNom_Enabled ;
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
   private int edtXTOGEQNom_Backcolor ;
   private int edtXTOGEQCod_Backcolor ;
   private int edtXTOGEQPrvN_Backcolor ;
   private int edtXTOGEQTda_Backcolor ;
   private int edtXTOGEQPrv_Backcolor ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtXTOGEQPrv_Internalname ;
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
   private String edtXTOGEQPrv_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtXTOGEQTda_Internalname ;
   private String edtXTOGEQTda_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtXTOGEQPrvN_Internalname ;
   private String edtXTOGEQPrvN_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtXTOGEQCod_Internalname ;
   private String edtXTOGEQCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtXTOGEQNom_Internalname ;
   private String edtXTOGEQNom_Jsonclick ;
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
   private String sMode1382 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n10207XTOGEQPrvN ;
   private boolean n10209XTOGEQNom ;
   private String Z10205XTOGEQPrv ;
   private String Z10206XTOGEQTda ;
   private String Z10208XTOGEQCod ;
   private String Z10207XTOGEQPrvN ;
   private String Z10209XTOGEQNom ;
   private String A10205XTOGEQPrv ;
   private String A10206XTOGEQTda ;
   private String A10207XTOGEQPrvN ;
   private String A10208XTOGEQCod ;
   private String A10209XTOGEQNom ;
   private String ZZ10205XTOGEQPrv ;
   private String ZZ10206XTOGEQTda ;
   private String ZZ10208XTOGEQCod ;
   private String ZZ10207XTOGEQPrvN ;
   private String ZZ10209XTOGEQNom ;
   private IDataStoreProvider pr_default ;
   private String[] T017C4_A10205XTOGEQPrv ;
   private String[] T017C4_A10206XTOGEQTda ;
   private String[] T017C4_A10208XTOGEQCod ;
   private String[] T017C4_A10207XTOGEQPrvN ;
   private boolean[] T017C4_n10207XTOGEQPrvN ;
   private String[] T017C4_A10209XTOGEQNom ;
   private boolean[] T017C4_n10209XTOGEQNom ;
   private String[] T017C5_A10205XTOGEQPrv ;
   private String[] T017C5_A10206XTOGEQTda ;
   private String[] T017C5_A10208XTOGEQCod ;
   private String[] T017C3_A10205XTOGEQPrv ;
   private String[] T017C3_A10206XTOGEQTda ;
   private String[] T017C3_A10208XTOGEQCod ;
   private String[] T017C3_A10207XTOGEQPrvN ;
   private boolean[] T017C3_n10207XTOGEQPrvN ;
   private String[] T017C3_A10209XTOGEQNom ;
   private boolean[] T017C3_n10209XTOGEQNom ;
   private String[] T017C6_A10205XTOGEQPrv ;
   private String[] T017C6_A10206XTOGEQTda ;
   private String[] T017C6_A10208XTOGEQCod ;
   private String[] T017C7_A10205XTOGEQPrv ;
   private String[] T017C7_A10206XTOGEQTda ;
   private String[] T017C7_A10208XTOGEQCod ;
   private String[] T017C2_A10205XTOGEQPrv ;
   private String[] T017C2_A10206XTOGEQTda ;
   private String[] T017C2_A10208XTOGEQCod ;
   private String[] T017C2_A10207XTOGEQPrvN ;
   private boolean[] T017C2_n10207XTOGEQPrvN ;
   private String[] T017C2_A10209XTOGEQNom ;
   private boolean[] T017C2_n10209XTOGEQNom ;
   private String[] T017C11_A10205XTOGEQPrv ;
   private String[] T017C11_A10206XTOGEQTda ;
   private String[] T017C11_A10208XTOGEQCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class txtogeq__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txtogeq__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txtogeq__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txtogeq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T017C2", "SELECT XTOGEQPrv, XTOGEQTda, XTOGEQCod, XTOGEQPrvN, XTOGEQNom FROM TXPXTOGEQ WHERE XTOGEQPrv = ? AND XTOGEQTda = ? AND XTOGEQCod = ?  FOR UPDATE OF XTOGEQPrvN, XTOGEQNom NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017C3", "SELECT XTOGEQPrv, XTOGEQTda, XTOGEQCod, XTOGEQPrvN, XTOGEQNom FROM TXPXTOGEQ WHERE XTOGEQPrv = ? AND XTOGEQTda = ? AND XTOGEQCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017C4", "SELECT /*+ FIRST_ROWS(100) */ TM1.XTOGEQPrv, TM1.XTOGEQTda, TM1.XTOGEQCod, TM1.XTOGEQPrvN, TM1.XTOGEQNom FROM TXPXTOGEQ TM1 WHERE TM1.XTOGEQPrv = ? and TM1.XTOGEQTda = ? and TM1.XTOGEQCod = ? ORDER BY TM1.XTOGEQPrv, TM1.XTOGEQTda, TM1.XTOGEQCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017C5", "SELECT /*+ FIRST_ROWS(1) */ XTOGEQPrv, XTOGEQTda, XTOGEQCod FROM TXPXTOGEQ WHERE XTOGEQPrv = ? AND XTOGEQTda = ? AND XTOGEQCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017C6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ XTOGEQPrv, XTOGEQTda, XTOGEQCod FROM TXPXTOGEQ WHERE ( XTOGEQPrv > ? or XTOGEQPrv = ? and XTOGEQTda > ? or XTOGEQTda = ? and XTOGEQPrv = ? and XTOGEQCod > ?) ORDER BY XTOGEQPrv, XTOGEQTda, XTOGEQCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017C7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ XTOGEQPrv, XTOGEQTda, XTOGEQCod FROM TXPXTOGEQ WHERE ( XTOGEQPrv < ? or XTOGEQPrv = ? and XTOGEQTda < ? or XTOGEQTda = ? and XTOGEQPrv = ? and XTOGEQCod < ?) ORDER BY XTOGEQPrv DESC, XTOGEQTda DESC, XTOGEQCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T017C8", "INSERT INTO TXPXTOGEQ(XTOGEQPrv, XTOGEQTda, XTOGEQCod, XTOGEQPrvN, XTOGEQNom) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPXTOGEQ")
         ,new UpdateCursor("T017C9", "UPDATE TXPXTOGEQ SET XTOGEQPrvN=?, XTOGEQNom=?  WHERE XTOGEQPrv = ? AND XTOGEQTda = ? AND XTOGEQCod = ?", GX_NOMASK, "TXPXTOGEQ")
         ,new UpdateCursor("T017C10", "DELETE FROM TXPXTOGEQ  WHERE XTOGEQPrv = ? AND XTOGEQTda = ? AND XTOGEQCod = ?", GX_NOMASK, "TXPXTOGEQ")
         ,new ForEachCursor("T017C11", "SELECT /*+ FIRST_ROWS(100) */ XTOGEQPrv, XTOGEQTda, XTOGEQCod FROM TXPXTOGEQ ORDER BY XTOGEQPrv, XTOGEQTda, XTOGEQCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
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
               stmt.setVarchar(1, (String)parms[0], 6, false);
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 6, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 6, false);
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 6, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 6, false);
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 6, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 6, false);
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 6, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 6, false);
               stmt.setVarchar(2, (String)parms[1], 6, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               stmt.setVarchar(5, (String)parms[4], 6, false);
               stmt.setVarchar(6, (String)parms[5], 6, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 6, false);
               stmt.setVarchar(2, (String)parms[1], 6, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               stmt.setVarchar(5, (String)parms[4], 6, false);
               stmt.setVarchar(6, (String)parms[5], 6, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 6, false);
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 6, false);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[4], 30);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[6], 30);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 30);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 30);
               }
               stmt.setVarchar(3, (String)parms[4], 6, false);
               stmt.setVarchar(4, (String)parms[5], 2, false);
               stmt.setVarchar(5, (String)parms[6], 6, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 6, false);
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 6, false);
               return;
      }
   }

}

