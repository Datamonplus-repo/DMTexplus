package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tplanri_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PLANING RITEX PARTIDAS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtParBarAgr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tplanri_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tplanri_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tplanri_impl.class ));
   }

   public tplanri_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLANRI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLANRI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLANRI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLANRI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPLANRI.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Agrupacion/Partida", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLANRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParBarAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A6670ParBarAgr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtParBarAgr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6670ParBarAgr), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6670ParBarAgr), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParBarAgr_Jsonclick, 0, "", "", "", "", "", 1, edtParBarAgr_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPLANRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Hoja de ruta", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLANRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A6671ParBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtParBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6671ParBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6671ParBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtParBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPLANRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "ParBarReo", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLANRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A6672ParBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtParBarReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6672ParBarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A6672ParBarReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParBarReo_Jsonclick, 0, "", "", "", "", "", 1, edtParBarReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPLANRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Particion", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLANRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParBarPar_Internalname, GXutil.rtrim( A6673ParBarPar), GXutil.rtrim( localUtil.format( A6673ParBarPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParBarPar_Jsonclick, 0, "", "", "", "", "", 1, edtParBarPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPLANRI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLANRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Kilos", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLANRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParBarKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A6674ParBarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtParBarKgm_Enabled!=0) ? localUtil.format( A6674ParBarKgm, "ZZZZZ9.99") : localUtil.format( A6674ParBarKgm, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParBarKgm_Jsonclick, 0, "", "", "", "", "", 1, edtParBarKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPLANRI.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLANRI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLANRI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLANRI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLANRI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPLANRI.htm");
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
         Z6670ParBarAgr = (int)(localUtil.ctol( httpContext.cgiGet( "Z6670ParBarAgr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6671ParBarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z6671ParBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6672ParBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6672ParBarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6673ParBarPar = httpContext.cgiGet( "Z6673ParBarPar") ;
         Z6674ParBarKgm = localUtil.ctond( httpContext.cgiGet( "Z6674ParBarKgm")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParBarAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParBarAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARBARAGR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtParBarAgr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6670ParBarAgr = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A6670ParBarAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6670ParBarAgr), 8, 0));
         }
         else
         {
            A6670ParBarAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtParBarAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6670ParBarAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6670ParBarAgr), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARBARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtParBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6671ParBarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A6671ParBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6671ParBarCod), 8, 0));
         }
         else
         {
            A6671ParBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtParBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6671ParBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6671ParBarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARBARREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtParBarReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6672ParBarReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6672ParBarReo", GXutil.str( A6672ParBarReo, 1, 0));
         }
         else
         {
            A6672ParBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtParBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6672ParBarReo", GXutil.str( A6672ParBarReo, 1, 0));
         }
         A6673ParBarPar = httpContext.cgiGet( edtParBarPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6673ParBarPar", A6673ParBarPar);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtParBarKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtParBarKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARBARKGM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtParBarKgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6674ParBarKgm = DecimalUtil.ZERO ;
            n6674ParBarKgm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6674ParBarKgm", GXutil.ltrimstr( A6674ParBarKgm, 9, 2));
         }
         else
         {
            A6674ParBarKgm = localUtil.ctond( httpContext.cgiGet( edtParBarKgm_Internalname)) ;
            n6674ParBarKgm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6674ParBarKgm", GXutil.ltrimstr( A6674ParBarKgm, 9, 2));
         }
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
            A6670ParBarAgr = (int)(GXutil.lval( httpContext.GetPar( "ParBarAgr"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6670ParBarAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6670ParBarAgr), 8, 0));
            A6671ParBarCod = (int)(GXutil.lval( httpContext.GetPar( "ParBarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6671ParBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6671ParBarCod), 8, 0));
            A6672ParBarReo = (byte)(GXutil.lval( httpContext.GetPar( "ParBarReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6672ParBarReo", GXutil.str( A6672ParBarReo, 1, 0));
            A6673ParBarPar = httpContext.GetPar( "ParBarPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A6673ParBarPar", A6673ParBarPar);
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
            initAll1GT1624( ) ;
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
      disableAttributes1GT1624( ) ;
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

   public void confirm_1GT0( )
   {
      beforeValidate1GT1624( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1GT1624( ) ;
         }
         else
         {
            checkExtendedTable1GT1624( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1GT1624( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1GT0( ) ;
      }
   }

   public void resetCaption1GT0( )
   {
   }

   public void zm1GT1624( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6674ParBarKgm = T01GT3_A6674ParBarKgm[0] ;
         }
         else
         {
            Z6674ParBarKgm = A6674ParBarKgm ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z6670ParBarAgr = A6670ParBarAgr ;
         Z6671ParBarCod = A6671ParBarCod ;
         Z6672ParBarReo = A6672ParBarReo ;
         Z6673ParBarPar = A6673ParBarPar ;
         Z6674ParBarKgm = A6674ParBarKgm ;
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

   public void load1GT1624( )
   {
      /* Using cursor T01GT4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(A6670ParBarAgr), Integer.valueOf(A6671ParBarCod), Byte.valueOf(A6672ParBarReo), A6673ParBarPar});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1624 = (short)(1) ;
         A6674ParBarKgm = T01GT4_A6674ParBarKgm[0] ;
         n6674ParBarKgm = T01GT4_n6674ParBarKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6674ParBarKgm", GXutil.ltrimstr( A6674ParBarKgm, 9, 2));
         zm1GT1624( -1) ;
      }
      pr_default.close(2);
      onLoadActions1GT1624( ) ;
   }

   public void onLoadActions1GT1624( )
   {
   }

   public void checkExtendedTable1GT1624( )
   {
      nIsDirty_1624 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1GT1624( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1GT1624( )
   {
      /* Using cursor T01GT5 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A6670ParBarAgr), Integer.valueOf(A6671ParBarCod), Byte.valueOf(A6672ParBarReo), A6673ParBarPar});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1624 = (short)(1) ;
      }
      else
      {
         RcdFound1624 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01GT3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(A6670ParBarAgr), Integer.valueOf(A6671ParBarCod), Byte.valueOf(A6672ParBarReo), A6673ParBarPar});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1GT1624( 1) ;
         RcdFound1624 = (short)(1) ;
         A6670ParBarAgr = T01GT3_A6670ParBarAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6670ParBarAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6670ParBarAgr), 8, 0));
         A6671ParBarCod = T01GT3_A6671ParBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6671ParBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6671ParBarCod), 8, 0));
         A6672ParBarReo = T01GT3_A6672ParBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6672ParBarReo", GXutil.str( A6672ParBarReo, 1, 0));
         A6673ParBarPar = T01GT3_A6673ParBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6673ParBarPar", A6673ParBarPar);
         A6674ParBarKgm = T01GT3_A6674ParBarKgm[0] ;
         n6674ParBarKgm = T01GT3_n6674ParBarKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6674ParBarKgm", GXutil.ltrimstr( A6674ParBarKgm, 9, 2));
         Z6670ParBarAgr = A6670ParBarAgr ;
         Z6671ParBarCod = A6671ParBarCod ;
         Z6672ParBarReo = A6672ParBarReo ;
         Z6673ParBarPar = A6673ParBarPar ;
         sMode1624 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1GT1624( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1624 = (short)(0) ;
            initializeNonKey1GT1624( ) ;
         }
         Gx_mode = sMode1624 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1624 = (short)(0) ;
         initializeNonKey1GT1624( ) ;
         sMode1624 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1624 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1GT1624( ) ;
      if ( RcdFound1624 == 0 )
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
      RcdFound1624 = (short)(0) ;
      /* Using cursor T01GT6 */
      pr_default.execute(4, new Object[] {Integer.valueOf(A6670ParBarAgr), Integer.valueOf(A6670ParBarAgr), Integer.valueOf(A6671ParBarCod), Integer.valueOf(A6671ParBarCod), Integer.valueOf(A6670ParBarAgr), Byte.valueOf(A6672ParBarReo), Byte.valueOf(A6672ParBarReo), Integer.valueOf(A6671ParBarCod), Integer.valueOf(A6670ParBarAgr), A6673ParBarPar});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T01GT6_A6670ParBarAgr[0] < A6670ParBarAgr ) || ( T01GT6_A6670ParBarAgr[0] == A6670ParBarAgr ) && ( T01GT6_A6671ParBarCod[0] < A6671ParBarCod ) || ( T01GT6_A6671ParBarCod[0] == A6671ParBarCod ) && ( T01GT6_A6670ParBarAgr[0] == A6670ParBarAgr ) && ( T01GT6_A6672ParBarReo[0] < A6672ParBarReo ) || ( T01GT6_A6672ParBarReo[0] == A6672ParBarReo ) && ( T01GT6_A6671ParBarCod[0] == A6671ParBarCod ) && ( T01GT6_A6670ParBarAgr[0] == A6670ParBarAgr ) && ( GXutil.strcmp(T01GT6_A6673ParBarPar[0], A6673ParBarPar) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T01GT6_A6670ParBarAgr[0] > A6670ParBarAgr ) || ( T01GT6_A6670ParBarAgr[0] == A6670ParBarAgr ) && ( T01GT6_A6671ParBarCod[0] > A6671ParBarCod ) || ( T01GT6_A6671ParBarCod[0] == A6671ParBarCod ) && ( T01GT6_A6670ParBarAgr[0] == A6670ParBarAgr ) && ( T01GT6_A6672ParBarReo[0] > A6672ParBarReo ) || ( T01GT6_A6672ParBarReo[0] == A6672ParBarReo ) && ( T01GT6_A6671ParBarCod[0] == A6671ParBarCod ) && ( T01GT6_A6670ParBarAgr[0] == A6670ParBarAgr ) && ( GXutil.strcmp(T01GT6_A6673ParBarPar[0], A6673ParBarPar) > 0 ) ) )
         {
            A6670ParBarAgr = T01GT6_A6670ParBarAgr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6670ParBarAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6670ParBarAgr), 8, 0));
            A6671ParBarCod = T01GT6_A6671ParBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6671ParBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6671ParBarCod), 8, 0));
            A6672ParBarReo = T01GT6_A6672ParBarReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6672ParBarReo", GXutil.str( A6672ParBarReo, 1, 0));
            A6673ParBarPar = T01GT6_A6673ParBarPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6673ParBarPar", A6673ParBarPar);
            RcdFound1624 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1624 = (short)(0) ;
      /* Using cursor T01GT7 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A6670ParBarAgr), Integer.valueOf(A6670ParBarAgr), Integer.valueOf(A6671ParBarCod), Integer.valueOf(A6671ParBarCod), Integer.valueOf(A6670ParBarAgr), Byte.valueOf(A6672ParBarReo), Byte.valueOf(A6672ParBarReo), Integer.valueOf(A6671ParBarCod), Integer.valueOf(A6670ParBarAgr), A6673ParBarPar});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01GT7_A6670ParBarAgr[0] > A6670ParBarAgr ) || ( T01GT7_A6670ParBarAgr[0] == A6670ParBarAgr ) && ( T01GT7_A6671ParBarCod[0] > A6671ParBarCod ) || ( T01GT7_A6671ParBarCod[0] == A6671ParBarCod ) && ( T01GT7_A6670ParBarAgr[0] == A6670ParBarAgr ) && ( T01GT7_A6672ParBarReo[0] > A6672ParBarReo ) || ( T01GT7_A6672ParBarReo[0] == A6672ParBarReo ) && ( T01GT7_A6671ParBarCod[0] == A6671ParBarCod ) && ( T01GT7_A6670ParBarAgr[0] == A6670ParBarAgr ) && ( GXutil.strcmp(T01GT7_A6673ParBarPar[0], A6673ParBarPar) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01GT7_A6670ParBarAgr[0] < A6670ParBarAgr ) || ( T01GT7_A6670ParBarAgr[0] == A6670ParBarAgr ) && ( T01GT7_A6671ParBarCod[0] < A6671ParBarCod ) || ( T01GT7_A6671ParBarCod[0] == A6671ParBarCod ) && ( T01GT7_A6670ParBarAgr[0] == A6670ParBarAgr ) && ( T01GT7_A6672ParBarReo[0] < A6672ParBarReo ) || ( T01GT7_A6672ParBarReo[0] == A6672ParBarReo ) && ( T01GT7_A6671ParBarCod[0] == A6671ParBarCod ) && ( T01GT7_A6670ParBarAgr[0] == A6670ParBarAgr ) && ( GXutil.strcmp(T01GT7_A6673ParBarPar[0], A6673ParBarPar) < 0 ) ) )
         {
            A6670ParBarAgr = T01GT7_A6670ParBarAgr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6670ParBarAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6670ParBarAgr), 8, 0));
            A6671ParBarCod = T01GT7_A6671ParBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6671ParBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6671ParBarCod), 8, 0));
            A6672ParBarReo = T01GT7_A6672ParBarReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6672ParBarReo", GXutil.str( A6672ParBarReo, 1, 0));
            A6673ParBarPar = T01GT7_A6673ParBarPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6673ParBarPar", A6673ParBarPar);
            RcdFound1624 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1GT1624( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtParBarAgr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1GT1624( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1624 == 1 )
         {
            if ( ( A6670ParBarAgr != Z6670ParBarAgr ) || ( A6671ParBarCod != Z6671ParBarCod ) || ( A6672ParBarReo != Z6672ParBarReo ) || ( GXutil.strcmp(A6673ParBarPar, Z6673ParBarPar) != 0 ) )
            {
               A6670ParBarAgr = Z6670ParBarAgr ;
               httpContext.ajax_rsp_assign_attri("", false, "A6670ParBarAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6670ParBarAgr), 8, 0));
               A6671ParBarCod = Z6671ParBarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A6671ParBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6671ParBarCod), 8, 0));
               A6672ParBarReo = Z6672ParBarReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A6672ParBarReo", GXutil.str( A6672ParBarReo, 1, 0));
               A6673ParBarPar = Z6673ParBarPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A6673ParBarPar", A6673ParBarPar);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "PARBARAGR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParBarAgr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtParBarAgr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1GT1624( ) ;
               GX_FocusControl = edtParBarAgr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A6670ParBarAgr != Z6670ParBarAgr ) || ( A6671ParBarCod != Z6671ParBarCod ) || ( A6672ParBarReo != Z6672ParBarReo ) || ( GXutil.strcmp(A6673ParBarPar, Z6673ParBarPar) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtParBarAgr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1GT1624( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PARBARAGR");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtParBarAgr_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtParBarAgr_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1GT1624( ) ;
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
      if ( ( A6670ParBarAgr != Z6670ParBarAgr ) || ( A6671ParBarCod != Z6671ParBarCod ) || ( A6672ParBarReo != Z6672ParBarReo ) || ( GXutil.strcmp(A6673ParBarPar, Z6673ParBarPar) != 0 ) )
      {
         A6670ParBarAgr = Z6670ParBarAgr ;
         httpContext.ajax_rsp_assign_attri("", false, "A6670ParBarAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6670ParBarAgr), 8, 0));
         A6671ParBarCod = Z6671ParBarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A6671ParBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6671ParBarCod), 8, 0));
         A6672ParBarReo = Z6672ParBarReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A6672ParBarReo", GXutil.str( A6672ParBarReo, 1, 0));
         A6673ParBarPar = Z6673ParBarPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A6673ParBarPar", A6673ParBarPar);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "PARBARAGR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtParBarAgr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtParBarAgr_Internalname ;
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
      getKey1GT1624( ) ;
      if ( RcdFound1624 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "PARBARAGR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtParBarAgr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( A6670ParBarAgr != Z6670ParBarAgr ) || ( A6671ParBarCod != Z6671ParBarCod ) || ( A6672ParBarReo != Z6672ParBarReo ) || ( GXutil.strcmp(A6673ParBarPar, Z6673ParBarPar) != 0 ) )
         {
            A6670ParBarAgr = Z6670ParBarAgr ;
            httpContext.ajax_rsp_assign_attri("", false, "A6670ParBarAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6670ParBarAgr), 8, 0));
            A6671ParBarCod = Z6671ParBarCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A6671ParBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6671ParBarCod), 8, 0));
            A6672ParBarReo = Z6672ParBarReo ;
            httpContext.ajax_rsp_assign_attri("", false, "A6672ParBarReo", GXutil.str( A6672ParBarReo, 1, 0));
            A6673ParBarPar = Z6673ParBarPar ;
            httpContext.ajax_rsp_assign_attri("", false, "A6673ParBarPar", A6673ParBarPar);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "PARBARAGR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtParBarAgr_Internalname ;
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
         if ( ( A6670ParBarAgr != Z6670ParBarAgr ) || ( A6671ParBarCod != Z6671ParBarCod ) || ( A6672ParBarReo != Z6672ParBarReo ) || ( GXutil.strcmp(A6673ParBarPar, Z6673ParBarPar) != 0 ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PARBARAGR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParBarAgr_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tplanri");
      GX_FocusControl = edtParBarKgm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1GT0( ) ;
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
      if ( RcdFound1624 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "PARBARAGR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtParBarAgr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtParBarKgm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1GT1624( ) ;
      if ( RcdFound1624 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtParBarKgm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1GT1624( ) ;
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
      if ( RcdFound1624 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtParBarKgm_Internalname ;
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
      if ( RcdFound1624 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtParBarKgm_Internalname ;
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
      scanStart1GT1624( ) ;
      if ( RcdFound1624 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1624 != 0 )
         {
            scanNext1GT1624( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtParBarKgm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1GT1624( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1GT1624( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01GT2 */
         pr_default.execute(0, new Object[] {Integer.valueOf(A6670ParBarAgr), Integer.valueOf(A6671ParBarCod), Byte.valueOf(A6672ParBarReo), A6673ParBarPar});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPLANRI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z6674ParBarKgm, T01GT2_A6674ParBarKgm[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z6674ParBarKgm, T01GT2_A6674ParBarKgm[0]) != 0 )
            {
               GXutil.writeLogln("tplanri:[seudo value changed for attri]"+"ParBarKgm");
               GXutil.writeLogRaw("Old: ",Z6674ParBarKgm);
               GXutil.writeLogRaw("Current: ",T01GT2_A6674ParBarKgm[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPLANRI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1GT1624( )
   {
      beforeValidate1GT1624( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GT1624( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1GT1624( 0) ;
         checkOptimisticConcurrency1GT1624( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GT1624( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1GT1624( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GT8 */
                  pr_default.execute(6, new Object[] {Integer.valueOf(A6670ParBarAgr), Integer.valueOf(A6671ParBarCod), Byte.valueOf(A6672ParBarReo), A6673ParBarPar, Boolean.valueOf(n6674ParBarKgm), A6674ParBarKgm});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPLANRI");
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
                        resetCaption1GT0( ) ;
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
            load1GT1624( ) ;
         }
         endLevel1GT1624( ) ;
      }
      closeExtendedTableCursors1GT1624( ) ;
   }

   public void update1GT1624( )
   {
      beforeValidate1GT1624( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GT1624( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GT1624( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GT1624( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1GT1624( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GT9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n6674ParBarKgm), A6674ParBarKgm, Integer.valueOf(A6670ParBarAgr), Integer.valueOf(A6671ParBarCod), Byte.valueOf(A6672ParBarReo), A6673ParBarPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPLANRI");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPLANRI"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1GT1624( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1GT0( ) ;
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
         endLevel1GT1624( ) ;
      }
      closeExtendedTableCursors1GT1624( ) ;
   }

   public void deferredUpdate1GT1624( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1GT1624( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GT1624( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1GT1624( ) ;
         afterConfirm1GT1624( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1GT1624( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01GT10 */
               pr_default.execute(8, new Object[] {Integer.valueOf(A6670ParBarAgr), Integer.valueOf(A6671ParBarCod), Byte.valueOf(A6672ParBarReo), A6673ParBarPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPLANRI");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1624 == 0 )
                     {
                        initAll1GT1624( ) ;
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
                     resetCaption1GT0( ) ;
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
      sMode1624 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1GT1624( ) ;
      Gx_mode = sMode1624 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1GT1624( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1GT1624( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1GT1624( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tplanri");
         if ( AnyError == 0 )
         {
            confirmValues1GT0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tplanri");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1GT1624( )
   {
      /* Using cursor T01GT11 */
      pr_default.execute(9);
      RcdFound1624 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1624 = (short)(1) ;
         A6670ParBarAgr = T01GT11_A6670ParBarAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6670ParBarAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6670ParBarAgr), 8, 0));
         A6671ParBarCod = T01GT11_A6671ParBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6671ParBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6671ParBarCod), 8, 0));
         A6672ParBarReo = T01GT11_A6672ParBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6672ParBarReo", GXutil.str( A6672ParBarReo, 1, 0));
         A6673ParBarPar = T01GT11_A6673ParBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6673ParBarPar", A6673ParBarPar);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1GT1624( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound1624 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1624 = (short)(1) ;
         A6670ParBarAgr = T01GT11_A6670ParBarAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6670ParBarAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6670ParBarAgr), 8, 0));
         A6671ParBarCod = T01GT11_A6671ParBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6671ParBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6671ParBarCod), 8, 0));
         A6672ParBarReo = T01GT11_A6672ParBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6672ParBarReo", GXutil.str( A6672ParBarReo, 1, 0));
         A6673ParBarPar = T01GT11_A6673ParBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6673ParBarPar", A6673ParBarPar);
      }
   }

   public void scanEnd1GT1624( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1GT1624( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1GT1624( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1GT1624( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1GT1624( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1GT1624( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1GT1624( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1GT1624( )
   {
      edtParBarAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParBarAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParBarAgr_Enabled), 5, 0), true);
      edtParBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParBarCod_Enabled), 5, 0), true);
      edtParBarReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParBarReo_Enabled), 5, 0), true);
      edtParBarPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParBarPar_Enabled), 5, 0), true);
      edtParBarKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParBarKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParBarKgm_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1GT1624( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1GT0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tplanri", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z6670ParBarAgr", GXutil.ltrim( localUtil.ntoc( Z6670ParBarAgr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6671ParBarCod", GXutil.ltrim( localUtil.ntoc( Z6671ParBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6672ParBarReo", GXutil.ltrim( localUtil.ntoc( Z6672ParBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6673ParBarPar", GXutil.rtrim( Z6673ParBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6674ParBarKgm", GXutil.ltrim( localUtil.ntoc( Z6674ParBarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tplanri", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPLANRI" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PLANING RITEX PARTIDAS", "") ;
   }

   public void initializeNonKey1GT1624( )
   {
      A6674ParBarKgm = DecimalUtil.ZERO ;
      n6674ParBarKgm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6674ParBarKgm", GXutil.ltrimstr( A6674ParBarKgm, 9, 2));
      Z6674ParBarKgm = DecimalUtil.ZERO ;
   }

   public void initAll1GT1624( )
   {
      A6670ParBarAgr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6670ParBarAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6670ParBarAgr), 8, 0));
      A6671ParBarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6671ParBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6671ParBarCod), 8, 0));
      A6672ParBarReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6672ParBarReo", GXutil.str( A6672ParBarReo, 1, 0));
      A6673ParBarPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6673ParBarPar", A6673ParBarPar);
      initializeNonKey1GT1624( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20261251943320", true, true);
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
      httpContext.AddJavascriptSource("tplanri.js", "?20261251943320", false, true);
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
      edtParBarAgr_Internalname = "PARBARAGR" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtParBarCod_Internalname = "PARBARCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtParBarReo_Internalname = "PARBARREO" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtParBarPar_Internalname = "PARBARPAR" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtParBarKgm_Internalname = "PARBARKGM" ;
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
      Form.setCaption( httpContext.getMessage( "PLANING RITEX PARTIDAS", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtParBarKgm_Jsonclick = "" ;
      edtParBarKgm_Backcolor = (int)(0xFFFFFF) ;
      edtParBarKgm_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtParBarPar_Jsonclick = "" ;
      edtParBarPar_Backcolor = (int)(0xFFFFFF) ;
      edtParBarPar_Enabled = 1 ;
      edtParBarReo_Jsonclick = "" ;
      edtParBarReo_Backcolor = (int)(0xFFFFFF) ;
      edtParBarReo_Enabled = 1 ;
      edtParBarCod_Jsonclick = "" ;
      edtParBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtParBarCod_Enabled = 1 ;
      edtParBarAgr_Jsonclick = "" ;
      edtParBarAgr_Backcolor = (int)(0xFFFFFF) ;
      edtParBarAgr_Enabled = 1 ;
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
      GX_FocusControl = edtParBarKgm_Internalname ;
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

   public void valid_Parbarpar( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6674ParBarKgm", GXutil.ltrim( localUtil.ntoc( A6674ParBarKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6670ParBarAgr", GXutil.ltrim( localUtil.ntoc( Z6670ParBarAgr, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6671ParBarCod", GXutil.ltrim( localUtil.ntoc( Z6671ParBarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6672ParBarReo", GXutil.ltrim( localUtil.ntoc( Z6672ParBarReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6673ParBarPar", GXutil.rtrim( Z6673ParBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6674ParBarKgm", GXutil.ltrim( localUtil.ntoc( Z6674ParBarKgm, (byte)(9), (byte)(2), ".", "")));
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
      setEventMetadata("VALID_PARBARAGR","{handler:'valid_Parbaragr',iparms:[]");
      setEventMetadata("VALID_PARBARAGR",",oparms:[]}");
      setEventMetadata("VALID_PARBARCOD","{handler:'valid_Parbarcod',iparms:[]");
      setEventMetadata("VALID_PARBARCOD",",oparms:[]}");
      setEventMetadata("VALID_PARBARREO","{handler:'valid_Parbarreo',iparms:[]");
      setEventMetadata("VALID_PARBARREO",",oparms:[]}");
      setEventMetadata("VALID_PARBARPAR","{handler:'valid_Parbarpar',iparms:[{av:'A6670ParBarAgr',fld:'PARBARAGR',pic:'ZZZZZZZ9'},{av:'A6671ParBarCod',fld:'PARBARCOD',pic:'ZZZZZZZ9'},{av:'A6672ParBarReo',fld:'PARBARREO',pic:'9'},{av:'A6673ParBarPar',fld:'PARBARPAR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PARBARPAR",",oparms:[{av:'A6674ParBarKgm',fld:'PARBARKGM',pic:'ZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z6670ParBarAgr'},{av:'Z6671ParBarCod'},{av:'Z6672ParBarReo'},{av:'Z6673ParBarPar'},{av:'Z6674ParBarKgm'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      Z6673ParBarPar = "" ;
      Z6674ParBarKgm = DecimalUtil.ZERO ;
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
      lblTextblock2_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A6673ParBarPar = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A6674ParBarKgm = DecimalUtil.ZERO ;
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
      T01GT4_A6670ParBarAgr = new int[1] ;
      T01GT4_A6671ParBarCod = new int[1] ;
      T01GT4_A6672ParBarReo = new byte[1] ;
      T01GT4_A6673ParBarPar = new String[] {""} ;
      T01GT4_A6674ParBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GT4_n6674ParBarKgm = new boolean[] {false} ;
      T01GT5_A6670ParBarAgr = new int[1] ;
      T01GT5_A6671ParBarCod = new int[1] ;
      T01GT5_A6672ParBarReo = new byte[1] ;
      T01GT5_A6673ParBarPar = new String[] {""} ;
      T01GT3_A6670ParBarAgr = new int[1] ;
      T01GT3_A6671ParBarCod = new int[1] ;
      T01GT3_A6672ParBarReo = new byte[1] ;
      T01GT3_A6673ParBarPar = new String[] {""} ;
      T01GT3_A6674ParBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GT3_n6674ParBarKgm = new boolean[] {false} ;
      sMode1624 = "" ;
      T01GT6_A6670ParBarAgr = new int[1] ;
      T01GT6_A6671ParBarCod = new int[1] ;
      T01GT6_A6672ParBarReo = new byte[1] ;
      T01GT6_A6673ParBarPar = new String[] {""} ;
      T01GT7_A6670ParBarAgr = new int[1] ;
      T01GT7_A6671ParBarCod = new int[1] ;
      T01GT7_A6672ParBarReo = new byte[1] ;
      T01GT7_A6673ParBarPar = new String[] {""} ;
      T01GT2_A6670ParBarAgr = new int[1] ;
      T01GT2_A6671ParBarCod = new int[1] ;
      T01GT2_A6672ParBarReo = new byte[1] ;
      T01GT2_A6673ParBarPar = new String[] {""} ;
      T01GT2_A6674ParBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GT2_n6674ParBarKgm = new boolean[] {false} ;
      T01GT11_A6670ParBarAgr = new int[1] ;
      T01GT11_A6671ParBarCod = new int[1] ;
      T01GT11_A6672ParBarReo = new byte[1] ;
      T01GT11_A6673ParBarPar = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ6673ParBarPar = "" ;
      ZZ6674ParBarKgm = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tplanri__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tplanri__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tplanri__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tplanri__default(),
         new Object[] {
             new Object[] {
            T01GT2_A6670ParBarAgr, T01GT2_A6671ParBarCod, T01GT2_A6672ParBarReo, T01GT2_A6673ParBarPar, T01GT2_A6674ParBarKgm, T01GT2_n6674ParBarKgm
            }
            , new Object[] {
            T01GT3_A6670ParBarAgr, T01GT3_A6671ParBarCod, T01GT3_A6672ParBarReo, T01GT3_A6673ParBarPar, T01GT3_A6674ParBarKgm, T01GT3_n6674ParBarKgm
            }
            , new Object[] {
            T01GT4_A6670ParBarAgr, T01GT4_A6671ParBarCod, T01GT4_A6672ParBarReo, T01GT4_A6673ParBarPar, T01GT4_A6674ParBarKgm, T01GT4_n6674ParBarKgm
            }
            , new Object[] {
            T01GT5_A6670ParBarAgr, T01GT5_A6671ParBarCod, T01GT5_A6672ParBarReo, T01GT5_A6673ParBarPar
            }
            , new Object[] {
            T01GT6_A6670ParBarAgr, T01GT6_A6671ParBarCod, T01GT6_A6672ParBarReo, T01GT6_A6673ParBarPar
            }
            , new Object[] {
            T01GT7_A6670ParBarAgr, T01GT7_A6671ParBarCod, T01GT7_A6672ParBarReo, T01GT7_A6673ParBarPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01GT11_A6670ParBarAgr, T01GT11_A6671ParBarCod, T01GT11_A6672ParBarReo, T01GT11_A6673ParBarPar
            }
         }
      );
   }

   private byte Z6672ParBarReo ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A6672ParBarReo ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ6672ParBarReo ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1624 ;
   private short nIsDirty_1624 ;
   private int Z6670ParBarAgr ;
   private int Z6671ParBarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int A6670ParBarAgr ;
   private int edtParBarAgr_Enabled ;
   private int A6671ParBarCod ;
   private int edtParBarCod_Enabled ;
   private int edtParBarReo_Enabled ;
   private int edtParBarPar_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtParBarKgm_Enabled ;
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
   private int edtParBarKgm_Backcolor ;
   private int edtParBarPar_Backcolor ;
   private int edtParBarReo_Backcolor ;
   private int edtParBarCod_Backcolor ;
   private int edtParBarAgr_Backcolor ;
   private int ZZ6670ParBarAgr ;
   private int ZZ6671ParBarCod ;
   private java.math.BigDecimal Z6674ParBarKgm ;
   private java.math.BigDecimal A6674ParBarKgm ;
   private java.math.BigDecimal ZZ6674ParBarKgm ;
   private String sPrefix ;
   private String Z6673ParBarPar ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtParBarAgr_Internalname ;
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
   private String edtParBarAgr_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtParBarCod_Internalname ;
   private String edtParBarCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtParBarReo_Internalname ;
   private String edtParBarReo_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtParBarPar_Internalname ;
   private String A6673ParBarPar ;
   private String edtParBarPar_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtParBarKgm_Internalname ;
   private String edtParBarKgm_Jsonclick ;
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
   private String sMode1624 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ6673ParBarPar ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n6674ParBarKgm ;
   private IDataStoreProvider pr_default ;
   private int[] T01GT4_A6670ParBarAgr ;
   private int[] T01GT4_A6671ParBarCod ;
   private byte[] T01GT4_A6672ParBarReo ;
   private String[] T01GT4_A6673ParBarPar ;
   private java.math.BigDecimal[] T01GT4_A6674ParBarKgm ;
   private boolean[] T01GT4_n6674ParBarKgm ;
   private int[] T01GT5_A6670ParBarAgr ;
   private int[] T01GT5_A6671ParBarCod ;
   private byte[] T01GT5_A6672ParBarReo ;
   private String[] T01GT5_A6673ParBarPar ;
   private int[] T01GT3_A6670ParBarAgr ;
   private int[] T01GT3_A6671ParBarCod ;
   private byte[] T01GT3_A6672ParBarReo ;
   private String[] T01GT3_A6673ParBarPar ;
   private java.math.BigDecimal[] T01GT3_A6674ParBarKgm ;
   private boolean[] T01GT3_n6674ParBarKgm ;
   private int[] T01GT6_A6670ParBarAgr ;
   private int[] T01GT6_A6671ParBarCod ;
   private byte[] T01GT6_A6672ParBarReo ;
   private String[] T01GT6_A6673ParBarPar ;
   private int[] T01GT7_A6670ParBarAgr ;
   private int[] T01GT7_A6671ParBarCod ;
   private byte[] T01GT7_A6672ParBarReo ;
   private String[] T01GT7_A6673ParBarPar ;
   private int[] T01GT2_A6670ParBarAgr ;
   private int[] T01GT2_A6671ParBarCod ;
   private byte[] T01GT2_A6672ParBarReo ;
   private String[] T01GT2_A6673ParBarPar ;
   private java.math.BigDecimal[] T01GT2_A6674ParBarKgm ;
   private boolean[] T01GT2_n6674ParBarKgm ;
   private int[] T01GT11_A6670ParBarAgr ;
   private int[] T01GT11_A6671ParBarCod ;
   private byte[] T01GT11_A6672ParBarReo ;
   private String[] T01GT11_A6673ParBarPar ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tplanri__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplanri__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplanri__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplanri__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01GT2", "SELECT ParBarAgr, ParBarCod, ParBarReo, ParBarPar, ParBarKgm FROM TXPPLANRI WHERE ParBarAgr = ? AND ParBarCod = ? AND ParBarReo = ? AND ParBarPar = ?  FOR UPDATE OF ParBarKgm NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GT3", "SELECT ParBarAgr, ParBarCod, ParBarReo, ParBarPar, ParBarKgm FROM TXPPLANRI WHERE ParBarAgr = ? AND ParBarCod = ? AND ParBarReo = ? AND ParBarPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GT4", "SELECT /*+ FIRST_ROWS(100) */ TM1.ParBarAgr, TM1.ParBarCod, TM1.ParBarReo, TM1.ParBarPar, TM1.ParBarKgm FROM TXPPLANRI TM1 WHERE TM1.ParBarAgr = ? and TM1.ParBarCod = ? and TM1.ParBarReo = ? and TM1.ParBarPar = ? ORDER BY TM1.ParBarAgr, TM1.ParBarCod, TM1.ParBarReo, TM1.ParBarPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GT5", "SELECT /*+ FIRST_ROWS(1) */ ParBarAgr, ParBarCod, ParBarReo, ParBarPar FROM TXPPLANRI WHERE ParBarAgr = ? AND ParBarCod = ? AND ParBarReo = ? AND ParBarPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GT6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ ParBarAgr, ParBarCod, ParBarReo, ParBarPar FROM TXPPLANRI WHERE ( ParBarAgr > ? or ParBarAgr = ? and ParBarCod > ? or ParBarCod = ? and ParBarAgr = ? and ParBarReo > ? or ParBarReo = ? and ParBarCod = ? and ParBarAgr = ? and ParBarPar > ?) ORDER BY ParBarAgr, ParBarCod, ParBarReo, ParBarPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01GT7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ ParBarAgr, ParBarCod, ParBarReo, ParBarPar FROM TXPPLANRI WHERE ( ParBarAgr < ? or ParBarAgr = ? and ParBarCod < ? or ParBarCod = ? and ParBarAgr = ? and ParBarReo < ? or ParBarReo = ? and ParBarCod = ? and ParBarAgr = ? and ParBarPar < ?) ORDER BY ParBarAgr DESC, ParBarCod DESC, ParBarReo DESC, ParBarPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01GT8", "INSERT INTO TXPPLANRI(ParBarAgr, ParBarCod, ParBarReo, ParBarPar, ParBarKgm) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPPLANRI")
         ,new UpdateCursor("T01GT9", "UPDATE TXPPLANRI SET ParBarKgm=?  WHERE ParBarAgr = ? AND ParBarCod = ? AND ParBarReo = ? AND ParBarPar = ?", GX_NOMASK, "TXPPLANRI")
         ,new UpdateCursor("T01GT10", "DELETE FROM TXPPLANRI  WHERE ParBarAgr = ? AND ParBarCod = ? AND ParBarReo = ? AND ParBarPar = ?", GX_NOMASK, "TXPPLANRI")
         ,new ForEachCursor("T01GT11", "SELECT /*+ FIRST_ROWS(100) */ ParBarAgr, ParBarCod, ParBarReo, ParBarPar FROM TXPPLANRI ORDER BY ParBarAgr, ParBarCod, ParBarReo, ParBarPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 1);
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 1);
               return;
            case 6 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

