package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmaqhnp_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = httpContext.GetPar( "MaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A602MaqCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MAQ. HORAS NO PRODUCT. MES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tmaqhnp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmaqhnp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmaqhnp_impl.class ));
   }

   public tmaqhnp_impl( int remoteHandle ,
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
      /* Execute user event: Exit */
      e111H2 ();
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQHNP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQHNP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQHNP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQHNP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TMAQHNP.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQHNP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQHNP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Código Máquina", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQHNP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQHNP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "MaqAny", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQHNP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqAny_Internalname, GXutil.ltrim( localUtil.ntoc( A599MaqAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqAny_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A599MaqAny), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A599MaqAny), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqAny_Jsonclick, 0, "", "", "", "", "", 1, edtMaqAny_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQHNP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "MaqMes", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQHNP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqMes_Internalname, GXutil.ltrim( localUtil.ntoc( A614MaqMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqMes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A614MaqMes), "99") : localUtil.format( DecimalUtil.doubleToDec(A614MaqMes), "99"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqMes_Jsonclick, 0, "", "", "", "", "", 1, edtMaqMes_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQHNP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQHNP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Descripcion Maquina", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQHNP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqDsc_Internalname, GXutil.rtrim( A606MaqDsc), GXutil.rtrim( localUtil.format( A606MaqDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqDsc_Jsonclick, 0, "", "", "", "", "", 1, edtMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQHNP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Horas No Product. Mes/Máq.", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQHNP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqHNPMes_Internalname, A610MaqHNPMes, GXutil.rtrim( localUtil.format( A610MaqHNPMes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqHNPMes_Jsonclick, 0, "", "", "", "", "", 1, edtMaqHNPMes_Enabled, 0, "text", "", 63, "chr", 1, "row", 63, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Descripcion63", "left", true, "", "HLP_TMAQHNP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQHNP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQHNP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQHNP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQHNP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQHNP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQHNP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TMAQHNP.htm");
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
      e121H2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z602MaqCod = httpContext.cgiGet( "Z602MaqCod") ;
            Z599MaqAny = (short)(localUtil.ctol( httpContext.cgiGet( "Z599MaqAny"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z614MaqMes = (byte)(localUtil.ctol( httpContext.cgiGet( "Z614MaqMes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z610MaqHNPMes = httpContext.cgiGet( "Z610MaqHNPMes") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQANY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqAny_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A599MaqAny = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A599MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A599MaqAny), 4, 0));
            }
            else
            {
               A599MaqAny = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A599MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A599MaqAny), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQMES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqMes_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A614MaqMes = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A614MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A614MaqMes), 2, 0));
            }
            else
            {
               A614MaqMes = (byte)(localUtil.ctol( httpContext.cgiGet( edtMaqMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A614MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A614MaqMes), 2, 0));
            }
            A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
            n606MaqDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
            A610MaqHNPMes = httpContext.cgiGet( edtMaqHNPMes_Internalname) ;
            n610MaqHNPMes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A610MaqHNPMes", A610MaqHNPMes);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
               A602MaqCod = httpContext.GetPar( "MaqCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
               A599MaqAny = (short)(GXutil.lval( httpContext.GetPar( "MaqAny"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A599MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A599MaqAny), 4, 0));
               A614MaqMes = (byte)(GXutil.lval( httpContext.GetPar( "MaqMes"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A614MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A614MaqMes), 2, 0));
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
                        e121H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "EXIT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Exit */
                        e111H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'INTERVALOS DíA'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Intervalos Día' */
                        e131H2 ();
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
            initAll1H67( ) ;
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
      disableAttributes1H67( ) ;
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

   public void confirm_1H0( )
   {
      beforeValidate1H67( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1H67( ) ;
         }
         else
         {
            checkExtendedTable1H67( ) ;
            if ( AnyError == 0 )
            {
               zm1H67( 4) ;
               zm1H67( 5) ;
            }
            closeExtendedTableCursors1H67( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1H0( ) ;
      }
   }

   public void resetCaption1H0( )
   {
   }

   public void e121H2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV18Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV16EmprNom ;
      GXv_char3[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char1, GXv_char2, GXv_char3) ;
      tmaqhnp_impl.this.A396EmprCod = GXv_char1[0] ;
      tmaqhnp_impl.this.AV16EmprNom = GXv_char2[0] ;
      tmaqhnp_impl.this.AV17UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char4 = AV20LitFe ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
      tmaqhnp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV20LitFe = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20LitFe", AV20LitFe);
      GXt_char4 = AV19Lit0 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char3) ;
      tmaqhnp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV19Lit0 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit0", AV19Lit0);
      GXt_char4 = AV21Lit1 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2193_", ""), (byte)(99), GXv_char3) ;
      tmaqhnp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV21Lit1 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit1", AV21Lit1);
      GXt_char4 = AV22Lit2 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN116_", ""), (byte)(99), GXv_char3) ;
      tmaqhnp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV22Lit2 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit2", AV22Lit2);
      GXt_char4 = AV23Lit3 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN113_", ""), (byte)(99), GXv_char3) ;
      tmaqhnp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV23Lit3 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit3", AV23Lit3);
      GXt_char4 = AV24Lit4 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN112_", ""), (byte)(99), GXv_char3) ;
      tmaqhnp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV24Lit4 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit4", AV24Lit4);
      GXt_char4 = AV25Lit5 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN820_", ""), (byte)(99), GXv_char3) ;
      tmaqhnp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV25Lit5 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lit5", AV25Lit5);
      GXv_int5[0] = AV26IntHnp ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INTHNP", ""), GXv_int5) ;
      tmaqhnp_impl.this.AV26IntHnp = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26IntHnp", GXutil.str( AV26IntHnp, 1, 0));
      if ( AV26IntHnp == 1 )
      {
      }
      else
      {
      }
   }

   public void e131H2( )
   {
      /* 'Intervalos Día' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tinthnp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod)),GXutil.URLEncode(GXutil.ltrimstr(A599MaqAny,4,0)),GXutil.URLEncode(GXutil.ltrimstr(A614MaqMes,2,0))}, new String[] {"EmprCod","MaqCod","MaqAny","MaqMes"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      /*  Sending Event outputs  */
   }

   protected void GXExit( )
   {
      /* Execute user event: Exit */
      e111H2 ();
      if ( returnInSub )
      {
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e111H2( )
   {
      /* Exit Routine */
      returnInSub = false ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char2[0] = A602MaqCod ;
      new app.plock16(remoteHandle, context).execute( GXv_char3, GXv_char2) ;
      tmaqhnp_impl.this.A396EmprCod = GXv_char3[0] ;
      tmaqhnp_impl.this.A602MaqCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      /*  Sending Event outputs  */
   }

   public void zm1H67( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z610MaqHNPMes = T001H3_A610MaqHNPMes[0] ;
         }
         else
         {
            Z610MaqHNPMes = A610MaqHNPMes ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z599MaqAny = A599MaqAny ;
         Z614MaqMes = A614MaqMes ;
         Z610MaqHNPMes = A610MaqHNPMes ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z407EmprNom = A407EmprNom ;
         Z606MaqDsc = A606MaqDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      /* Using cursor T001H4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T001H4_A407EmprNom[0] ;
      n407EmprNom = T001H4_n407EmprNom[0] ;
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

   public void load1H67( )
   {
      /* Using cursor T001H6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound67 = (short)(1) ;
         A606MaqDsc = T001H6_A606MaqDsc[0] ;
         n606MaqDsc = T001H6_n606MaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         A610MaqHNPMes = T001H6_A610MaqHNPMes[0] ;
         n610MaqHNPMes = T001H6_n610MaqHNPMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A610MaqHNPMes", A610MaqHNPMes);
         A407EmprNom = T001H6_A407EmprNom[0] ;
         n407EmprNom = T001H6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm1H67( -3) ;
      }
      pr_default.close(4);
      onLoadActions1H67( ) ;
   }

   public void onLoadActions1H67( )
   {
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
   }

   public void checkExtendedTable1H67( )
   {
      nIsDirty_67 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
      /* Using cursor T001H5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A606MaqDsc = T001H5_A606MaqDsc[0] ;
      n606MaqDsc = T001H5_n606MaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1H67( )
   {
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_5( String A396EmprCod ,
                         String A602MaqCod )
   {
      /* Using cursor T001H7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A606MaqDsc = T001H7_A606MaqDsc[0] ;
      n606MaqDsc = T001H7_n606MaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A606MaqDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void getKey1H67( )
   {
      /* Using cursor T001H8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound67 = (short)(1) ;
      }
      else
      {
         RcdFound67 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001H3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T001H3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1H67( 3) ;
         RcdFound67 = (short)(1) ;
         A599MaqAny = T001H3_A599MaqAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A599MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A599MaqAny), 4, 0));
         A614MaqMes = T001H3_A614MaqMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A614MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A614MaqMes), 2, 0));
         A610MaqHNPMes = T001H3_A610MaqHNPMes[0] ;
         n610MaqHNPMes = T001H3_n610MaqHNPMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A610MaqHNPMes", A610MaqHNPMes);
         A602MaqCod = T001H3_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z599MaqAny = A599MaqAny ;
         Z614MaqMes = A614MaqMes ;
         sMode67 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1H67( ) ;
         if ( AnyError == 1 )
         {
            RcdFound67 = (short)(0) ;
            initializeNonKey1H67( ) ;
         }
         Gx_mode = sMode67 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound67 = (short)(0) ;
         initializeNonKey1H67( ) ;
         sMode67 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode67 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1H67( ) ;
      if ( RcdFound67 == 0 )
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
      RcdFound67 = (short)(0) ;
      /* Using cursor T001H9 */
      pr_default.execute(7, new Object[] {A602MaqCod, A602MaqCod, Short.valueOf(A599MaqAny), Short.valueOf(A599MaqAny), A602MaqCod, Byte.valueOf(A614MaqMes), A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T001H9_A602MaqCod[0], A602MaqCod) < 0 ) || ( GXutil.strcmp(T001H9_A602MaqCod[0], A602MaqCod) == 0 ) && ( T001H9_A599MaqAny[0] < A599MaqAny ) || ( T001H9_A599MaqAny[0] == A599MaqAny ) && ( GXutil.strcmp(T001H9_A602MaqCod[0], A602MaqCod) == 0 ) && ( T001H9_A614MaqMes[0] < A614MaqMes ) ) && ( GXutil.strcmp(T001H9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T001H9_A602MaqCod[0], A602MaqCod) > 0 ) || ( GXutil.strcmp(T001H9_A602MaqCod[0], A602MaqCod) == 0 ) && ( T001H9_A599MaqAny[0] > A599MaqAny ) || ( T001H9_A599MaqAny[0] == A599MaqAny ) && ( GXutil.strcmp(T001H9_A602MaqCod[0], A602MaqCod) == 0 ) && ( T001H9_A614MaqMes[0] > A614MaqMes ) ) && ( GXutil.strcmp(T001H9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A602MaqCod = T001H9_A602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A599MaqAny = T001H9_A599MaqAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A599MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A599MaqAny), 4, 0));
            A614MaqMes = T001H9_A614MaqMes[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A614MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A614MaqMes), 2, 0));
            RcdFound67 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound67 = (short)(0) ;
      /* Using cursor T001H10 */
      pr_default.execute(8, new Object[] {A602MaqCod, A602MaqCod, Short.valueOf(A599MaqAny), Short.valueOf(A599MaqAny), A602MaqCod, Byte.valueOf(A614MaqMes), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T001H10_A602MaqCod[0], A602MaqCod) > 0 ) || ( GXutil.strcmp(T001H10_A602MaqCod[0], A602MaqCod) == 0 ) && ( T001H10_A599MaqAny[0] > A599MaqAny ) || ( T001H10_A599MaqAny[0] == A599MaqAny ) && ( GXutil.strcmp(T001H10_A602MaqCod[0], A602MaqCod) == 0 ) && ( T001H10_A614MaqMes[0] > A614MaqMes ) ) && ( GXutil.strcmp(T001H10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T001H10_A602MaqCod[0], A602MaqCod) < 0 ) || ( GXutil.strcmp(T001H10_A602MaqCod[0], A602MaqCod) == 0 ) && ( T001H10_A599MaqAny[0] < A599MaqAny ) || ( T001H10_A599MaqAny[0] == A599MaqAny ) && ( GXutil.strcmp(T001H10_A602MaqCod[0], A602MaqCod) == 0 ) && ( T001H10_A614MaqMes[0] < A614MaqMes ) ) && ( GXutil.strcmp(T001H10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A602MaqCod = T001H10_A602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A599MaqAny = T001H10_A599MaqAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A599MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A599MaqAny), 4, 0));
            A614MaqMes = T001H10_A614MaqMes[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A614MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A614MaqMes), 2, 0));
            RcdFound67 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1H67( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1H67( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound67 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A599MaqAny != Z599MaqAny ) || ( A614MaqMes != Z614MaqMes ) )
            {
               A602MaqCod = Z602MaqCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
               A599MaqAny = Z599MaqAny ;
               httpContext.ajax_rsp_assign_attri("", false, "A599MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A599MaqAny), 4, 0));
               A614MaqMes = Z614MaqMes ;
               httpContext.ajax_rsp_assign_attri("", false, "A614MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A614MaqMes), 2, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1H67( ) ;
               GX_FocusControl = edtMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A599MaqAny != Z599MaqAny ) || ( A614MaqMes != Z614MaqMes ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1H67( ) ;
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
                  GX_FocusControl = edtMaqCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1H67( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A599MaqAny != Z599MaqAny ) || ( A614MaqMes != Z614MaqMes ) )
      {
         A602MaqCod = Z602MaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A599MaqAny = Z599MaqAny ;
         httpContext.ajax_rsp_assign_attri("", false, "A599MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A599MaqAny), 4, 0));
         A614MaqMes = Z614MaqMes ;
         httpContext.ajax_rsp_assign_attri("", false, "A614MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A614MaqMes), 2, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMaqCod_Internalname ;
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
      getKey1H67( ) ;
      if ( RcdFound67 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A599MaqAny != Z599MaqAny ) || ( A614MaqMes != Z614MaqMes ) )
         {
            A602MaqCod = Z602MaqCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A599MaqAny = Z599MaqAny ;
            httpContext.ajax_rsp_assign_attri("", false, "A599MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A599MaqAny), 4, 0));
            A614MaqMes = Z614MaqMes ;
            httpContext.ajax_rsp_assign_attri("", false, "A614MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A614MaqMes), 2, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A599MaqAny != Z599MaqAny ) || ( A614MaqMes != Z614MaqMes ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tmaqhnp");
      GX_FocusControl = edtMaqHNPMes_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1H0( ) ;
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
      if ( RcdFound67 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMaqHNPMes_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1H67( ) ;
      if ( RcdFound67 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqHNPMes_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1H67( ) ;
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
      if ( RcdFound67 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqHNPMes_Internalname ;
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
      if ( RcdFound67 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqHNPMes_Internalname ;
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
      scanStart1H67( ) ;
      if ( RcdFound67 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound67 != 0 )
         {
            scanNext1H67( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqHNPMes_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1H67( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1H67( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T001H2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQHNP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z610MaqHNPMes, T001H2_A610MaqHNPMes[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z610MaqHNPMes, T001H2_A610MaqHNPMes[0]) != 0 )
            {
               GXutil.writeLogln("tmaqhnp:[seudo value changed for attri]"+"MaqHNPMes");
               GXutil.writeLogRaw("Old: ",Z610MaqHNPMes);
               GXutil.writeLogRaw("Current: ",T001H2_A610MaqHNPMes[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMAQHNP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1H67( )
   {
      beforeValidate1H67( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1H67( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1H67( 0) ;
         checkOptimisticConcurrency1H67( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1H67( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1H67( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001H11 */
                  pr_default.execute(9, new Object[] {Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes), Boolean.valueOf(n610MaqHNPMes), A610MaqHNPMes, A396EmprCod, A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQHNP");
                  if ( (pr_default.getStatus(9) == 1) )
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
                        resetCaption1H0( ) ;
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
            load1H67( ) ;
         }
         endLevel1H67( ) ;
      }
      closeExtendedTableCursors1H67( ) ;
   }

   public void update1H67( )
   {
      beforeValidate1H67( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1H67( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1H67( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1H67( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1H67( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001H12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n610MaqHNPMes), A610MaqHNPMes, A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQHNP");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQHNP"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1H67( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1H0( ) ;
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
         endLevel1H67( ) ;
      }
      closeExtendedTableCursors1H67( ) ;
   }

   public void deferredUpdate1H67( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1H67( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1H67( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1H67( ) ;
         afterConfirm1H67( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1H67( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001H13 */
               pr_default.execute(11, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQHNP");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound67 == 0 )
                     {
                        initAll1H67( ) ;
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
                     resetCaption1H0( ) ;
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
      sMode67 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1H67( ) ;
      Gx_mode = sMode67 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1H67( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( 1 < 0 )
         {
            AV17UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         }
         /* Using cursor T001H14 */
         pr_default.execute(12, new Object[] {A396EmprCod, A602MaqCod});
         A606MaqDsc = T001H14_A606MaqDsc[0] ;
         n606MaqDsc = T001H14_n606MaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         pr_default.close(12);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T001H15 */
         pr_default.execute(13, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INTHNP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void endLevel1H67( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1H67( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmaqhnp");
         if ( AnyError == 0 )
         {
            confirmValues1H0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmaqhnp");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1H67( )
   {
      /* Scan By routine */
      /* Using cursor T001H16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      RcdFound67 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound67 = (short)(1) ;
         A602MaqCod = T001H16_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A599MaqAny = T001H16_A599MaqAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A599MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A599MaqAny), 4, 0));
         A614MaqMes = T001H16_A614MaqMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A614MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A614MaqMes), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1H67( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound67 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound67 = (short)(1) ;
         A602MaqCod = T001H16_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A599MaqAny = T001H16_A599MaqAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A599MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A599MaqAny), 4, 0));
         A614MaqMes = T001H16_A614MaqMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A614MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A614MaqMes), 2, 0));
      }
   }

   public void scanEnd1H67( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1H67( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1H67( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1H67( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1H67( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1H67( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1H67( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1H67( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtMaqAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqAny_Enabled), 5, 0), true);
      edtMaqMes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqMes_Enabled), 5, 0), true);
      edtMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Enabled), 5, 0), true);
      edtMaqHNPMes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqHNPMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHNPMes_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1H67( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1H0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tmaqhnp", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z599MaqAny", GXutil.ltrim( localUtil.ntoc( Z599MaqAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z614MaqMes", GXutil.ltrim( localUtil.ntoc( Z614MaqMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z610MaqHNPMes", Z610MaqHNPMes);
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
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
      return formatLink("app.tmaqhnp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TMAQHNP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MAQ. HORAS NO PRODUCT. MES", "") ;
   }

   public void initializeNonKey1H67( )
   {
      A606MaqDsc = "" ;
      n606MaqDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      A610MaqHNPMes = "" ;
      n610MaqHNPMes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A610MaqHNPMes", A610MaqHNPMes);
      Z610MaqHNPMes = "" ;
   }

   public void initAll1H67( )
   {
      A602MaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      A599MaqAny = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A599MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A599MaqAny), 4, 0));
      A614MaqMes = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A614MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A614MaqMes), 2, 0));
      initializeNonKey1H67( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241522742", true, true);
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
      httpContext.AddJavascriptSource("tmaqhnp.js", "?20268241522742", false, true);
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
      edtMaqCod_Internalname = "MAQCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtMaqAny_Internalname = "MAQANY" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtMaqMes_Internalname = "MAQMES" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtMaqDsc_Internalname = "MAQDSC" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtMaqHNPMes_Internalname = "MAQHNPMES" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
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
      Form.setCaption( httpContext.getMessage( "MAQ. HORAS NO PRODUCT. MES", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtMaqHNPMes_Jsonclick = "" ;
      edtMaqHNPMes_Backcolor = (int)(0xFFFFFF) ;
      edtMaqHNPMes_Enabled = 1 ;
      edtMaqDsc_Jsonclick = "" ;
      edtMaqDsc_Backcolor = (int)(0xFFFFFF) ;
      edtMaqDsc_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtMaqMes_Jsonclick = "" ;
      edtMaqMes_Backcolor = (int)(0xFFFFFF) ;
      edtMaqMes_Enabled = 1 ;
      edtMaqAny_Jsonclick = "" ;
      edtMaqAny_Backcolor = (int)(0xFFFFFF) ;
      edtMaqAny_Enabled = 1 ;
      edtMaqCod_Jsonclick = "" ;
      edtMaqCod_Backcolor = (int)(0xFFFFFF) ;
      edtMaqCod_Enabled = 1 ;
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
      /* Using cursor T001H17 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T001H17_A407EmprNom[0] ;
      n407EmprNom = T001H17_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(15);
      /* Using cursor T001H14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A606MaqDsc = T001H14_A606MaqDsc[0] ;
      n606MaqDsc = T001H14_n606MaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      pr_default.close(12);
      GX_FocusControl = edtMaqHNPMes_Internalname ;
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

   public void valid_Maqcod( )
   {
      n606MaqDsc = false ;
      /* Using cursor T001H14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
      }
      A606MaqDsc = T001H14_A606MaqDsc[0] ;
      n606MaqDsc = T001H14_n606MaqDsc[0] ;
      pr_default.close(12);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", GXutil.rtrim( A606MaqDsc));
   }

   public void valid_Maqmes( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A610MaqHNPMes", A610MaqHNPMes);
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", GXutil.rtrim( AV17UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", GXutil.rtrim( A606MaqDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z599MaqAny", GXutil.ltrim( localUtil.ntoc( Z599MaqAny, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z614MaqMes", GXutil.ltrim( localUtil.ntoc( Z614MaqMes, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z610MaqHNPMes", Z610MaqHNPMes);
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV17UsurCod", GXutil.rtrim( ZV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z606MaqDsc", GXutil.rtrim( Z606MaqDsc));
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
      setEventMetadata("'INTERVALOS DíA'","{handler:'e131H2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A599MaqAny',fld:'MAQANY',pic:'ZZZ9'},{av:'A614MaqMes',fld:'MAQMES',pic:'99'}]");
      setEventMetadata("'INTERVALOS DíA'",",oparms:[{av:'A614MaqMes',fld:'MAQMES',pic:'99'},{av:'A599MaqAny',fld:'MAQANY',pic:'ZZZ9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("EXIT","{handler:'e111H2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''}]");
      setEventMetadata("EXIT",",oparms:[{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A606MaqDsc',fld:'MAQDSC',pic:''}]");
      setEventMetadata("VALID_MAQCOD",",oparms:[{av:'A606MaqDsc',fld:'MAQDSC',pic:''}]}");
      setEventMetadata("VALID_MAQANY","{handler:'valid_Maqany',iparms:[]");
      setEventMetadata("VALID_MAQANY",",oparms:[]}");
      setEventMetadata("VALID_MAQMES","{handler:'valid_Maqmes',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A599MaqAny',fld:'MAQANY',pic:'ZZZ9'},{av:'A614MaqMes',fld:'MAQMES',pic:'99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("VALID_MAQMES",",oparms:[{av:'A610MaqHNPMes',fld:'MAQHNPMES',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z602MaqCod'},{av:'Z599MaqAny'},{av:'Z614MaqMes'},{av:'Z610MaqHNPMes'},{av:'Z407EmprNom'},{av:'ZV17UsurCod'},{av:'Z606MaqDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_default.close(15);
      pr_default.close(12);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z602MaqCod = "" ;
      Z610MaqHNPMes = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A606MaqDsc = "" ;
      lblTextblock6_Jsonclick = "" ;
      A610MaqHNPMes = "" ;
      lblTextblock7_Jsonclick = "" ;
      A407EmprNom = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV17UsurCod = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV18Station = "" ;
      GXv_char1 = new String[1] ;
      AV16EmprNom = "" ;
      AV20LitFe = "" ;
      AV19Lit0 = "" ;
      AV21Lit1 = "" ;
      AV22Lit2 = "" ;
      AV23Lit3 = "" ;
      AV24Lit4 = "" ;
      AV25Lit5 = "" ;
      GXt_char4 = "" ;
      GXv_int5 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Z407EmprNom = "" ;
      Z606MaqDsc = "" ;
      T001H4_A407EmprNom = new String[] {""} ;
      T001H4_n407EmprNom = new boolean[] {false} ;
      T001H6_A599MaqAny = new short[1] ;
      T001H6_A614MaqMes = new byte[1] ;
      T001H6_A606MaqDsc = new String[] {""} ;
      T001H6_n606MaqDsc = new boolean[] {false} ;
      T001H6_A610MaqHNPMes = new String[] {""} ;
      T001H6_n610MaqHNPMes = new boolean[] {false} ;
      T001H6_A407EmprNom = new String[] {""} ;
      T001H6_n407EmprNom = new boolean[] {false} ;
      T001H6_A396EmprCod = new String[] {""} ;
      T001H6_A602MaqCod = new String[] {""} ;
      T001H5_A606MaqDsc = new String[] {""} ;
      T001H5_n606MaqDsc = new boolean[] {false} ;
      T001H7_A606MaqDsc = new String[] {""} ;
      T001H7_n606MaqDsc = new boolean[] {false} ;
      T001H8_A396EmprCod = new String[] {""} ;
      T001H8_A602MaqCod = new String[] {""} ;
      T001H8_A599MaqAny = new short[1] ;
      T001H8_A614MaqMes = new byte[1] ;
      T001H3_A599MaqAny = new short[1] ;
      T001H3_A614MaqMes = new byte[1] ;
      T001H3_A610MaqHNPMes = new String[] {""} ;
      T001H3_n610MaqHNPMes = new boolean[] {false} ;
      T001H3_A396EmprCod = new String[] {""} ;
      T001H3_A602MaqCod = new String[] {""} ;
      sMode67 = "" ;
      T001H9_A396EmprCod = new String[] {""} ;
      T001H9_A602MaqCod = new String[] {""} ;
      T001H9_A599MaqAny = new short[1] ;
      T001H9_A614MaqMes = new byte[1] ;
      T001H10_A396EmprCod = new String[] {""} ;
      T001H10_A602MaqCod = new String[] {""} ;
      T001H10_A599MaqAny = new short[1] ;
      T001H10_A614MaqMes = new byte[1] ;
      T001H2_A599MaqAny = new short[1] ;
      T001H2_A614MaqMes = new byte[1] ;
      T001H2_A610MaqHNPMes = new String[] {""} ;
      T001H2_n610MaqHNPMes = new boolean[] {false} ;
      T001H2_A396EmprCod = new String[] {""} ;
      T001H2_A602MaqCod = new String[] {""} ;
      T001H14_A606MaqDsc = new String[] {""} ;
      T001H14_n606MaqDsc = new boolean[] {false} ;
      T001H15_A396EmprCod = new String[] {""} ;
      T001H15_A602MaqCod = new String[] {""} ;
      T001H15_A599MaqAny = new short[1] ;
      T001H15_A614MaqMes = new byte[1] ;
      T001H15_A5123MaqHnpDia = new byte[1] ;
      T001H16_A396EmprCod = new String[] {""} ;
      T001H16_A602MaqCod = new String[] {""} ;
      T001H16_A599MaqAny = new short[1] ;
      T001H16_A614MaqMes = new byte[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T001H17_A407EmprNom = new String[] {""} ;
      T001H17_n407EmprNom = new boolean[] {false} ;
      ZV17UsurCod = "" ;
      ZZ396EmprCod = "" ;
      ZZ602MaqCod = "" ;
      ZZ610MaqHNPMes = "" ;
      ZZ407EmprNom = "" ;
      ZZV17UsurCod = "" ;
      ZZ606MaqDsc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tmaqhnp__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmaqhnp__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmaqhnp__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmaqhnp__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmaqhnp__default(),
         new Object[] {
             new Object[] {
            T001H2_A599MaqAny, T001H2_A614MaqMes, T001H2_A610MaqHNPMes, T001H2_n610MaqHNPMes, T001H2_A396EmprCod, T001H2_A602MaqCod
            }
            , new Object[] {
            T001H3_A599MaqAny, T001H3_A614MaqMes, T001H3_A610MaqHNPMes, T001H3_n610MaqHNPMes, T001H3_A396EmprCod, T001H3_A602MaqCod
            }
            , new Object[] {
            T001H4_A407EmprNom, T001H4_n407EmprNom
            }
            , new Object[] {
            T001H5_A606MaqDsc, T001H5_n606MaqDsc
            }
            , new Object[] {
            T001H6_A599MaqAny, T001H6_A614MaqMes, T001H6_A606MaqDsc, T001H6_n606MaqDsc, T001H6_A610MaqHNPMes, T001H6_n610MaqHNPMes, T001H6_A407EmprNom, T001H6_n407EmprNom, T001H6_A396EmprCod, T001H6_A602MaqCod
            }
            , new Object[] {
            T001H7_A606MaqDsc, T001H7_n606MaqDsc
            }
            , new Object[] {
            T001H8_A396EmprCod, T001H8_A602MaqCod, T001H8_A599MaqAny, T001H8_A614MaqMes
            }
            , new Object[] {
            T001H9_A396EmprCod, T001H9_A602MaqCod, T001H9_A599MaqAny, T001H9_A614MaqMes
            }
            , new Object[] {
            T001H10_A396EmprCod, T001H10_A602MaqCod, T001H10_A599MaqAny, T001H10_A614MaqMes
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001H14_A606MaqDsc, T001H14_n606MaqDsc
            }
            , new Object[] {
            T001H15_A396EmprCod, T001H15_A602MaqCod, T001H15_A599MaqAny, T001H15_A614MaqMes, T001H15_A5123MaqHnpDia
            }
            , new Object[] {
            T001H16_A396EmprCod, T001H16_A602MaqCod, T001H16_A599MaqAny, T001H16_A614MaqMes
            }
            , new Object[] {
            T001H17_A407EmprNom, T001H17_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z614MaqMes ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A614MaqMes ;
   private byte AV26IntHnp ;
   private byte GXv_int5[] ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ614MaqMes ;
   private short Z599MaqAny ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A599MaqAny ;
   private short RcdFound67 ;
   private short nIsDirty_67 ;
   private short ZZ599MaqAny ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtMaqCod_Enabled ;
   private int edtMaqAny_Enabled ;
   private int edtMaqMes_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtMaqDsc_Enabled ;
   private int edtMaqHNPMes_Enabled ;
   private int edtEmprNom_Enabled ;
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
   private int edtEmprNom_Backcolor ;
   private int edtMaqHNPMes_Backcolor ;
   private int edtMaqDsc_Backcolor ;
   private int edtMaqMes_Backcolor ;
   private int edtMaqAny_Backcolor ;
   private int edtMaqCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z602MaqCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMaqCod_Internalname ;
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
   private String edtMaqCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtMaqAny_Internalname ;
   private String edtMaqAny_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtMaqMes_Internalname ;
   private String edtMaqMes_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtMaqDsc_Internalname ;
   private String A606MaqDsc ;
   private String edtMaqDsc_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtMaqHNPMes_Internalname ;
   private String edtMaqHNPMes_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
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
   private String AV17UsurCod ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV18Station ;
   private String GXv_char1[] ;
   private String AV16EmprNom ;
   private String AV20LitFe ;
   private String AV19Lit0 ;
   private String AV21Lit1 ;
   private String AV22Lit2 ;
   private String AV23Lit3 ;
   private String AV24Lit4 ;
   private String AV25Lit5 ;
   private String GXt_char4 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z606MaqDsc ;
   private String sMode67 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZV17UsurCod ;
   private String ZZ396EmprCod ;
   private String ZZ602MaqCod ;
   private String ZZ407EmprNom ;
   private String ZZV17UsurCod ;
   private String ZZ606MaqDsc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n606MaqDsc ;
   private boolean n610MaqHNPMes ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private String Z610MaqHNPMes ;
   private String A610MaqHNPMes ;
   private String ZZ610MaqHNPMes ;
   private IDataStoreProvider pr_default ;
   private String[] T001H4_A407EmprNom ;
   private boolean[] T001H4_n407EmprNom ;
   private short[] T001H6_A599MaqAny ;
   private byte[] T001H6_A614MaqMes ;
   private String[] T001H6_A606MaqDsc ;
   private boolean[] T001H6_n606MaqDsc ;
   private String[] T001H6_A610MaqHNPMes ;
   private boolean[] T001H6_n610MaqHNPMes ;
   private String[] T001H6_A407EmprNom ;
   private boolean[] T001H6_n407EmprNom ;
   private String[] T001H6_A396EmprCod ;
   private String[] T001H6_A602MaqCod ;
   private String[] T001H5_A606MaqDsc ;
   private boolean[] T001H5_n606MaqDsc ;
   private String[] T001H7_A606MaqDsc ;
   private boolean[] T001H7_n606MaqDsc ;
   private String[] T001H8_A396EmprCod ;
   private String[] T001H8_A602MaqCod ;
   private short[] T001H8_A599MaqAny ;
   private byte[] T001H8_A614MaqMes ;
   private short[] T001H3_A599MaqAny ;
   private byte[] T001H3_A614MaqMes ;
   private String[] T001H3_A610MaqHNPMes ;
   private boolean[] T001H3_n610MaqHNPMes ;
   private String[] T001H3_A396EmprCod ;
   private String[] T001H3_A602MaqCod ;
   private String[] T001H9_A396EmprCod ;
   private String[] T001H9_A602MaqCod ;
   private short[] T001H9_A599MaqAny ;
   private byte[] T001H9_A614MaqMes ;
   private String[] T001H10_A396EmprCod ;
   private String[] T001H10_A602MaqCod ;
   private short[] T001H10_A599MaqAny ;
   private byte[] T001H10_A614MaqMes ;
   private short[] T001H2_A599MaqAny ;
   private byte[] T001H2_A614MaqMes ;
   private String[] T001H2_A610MaqHNPMes ;
   private boolean[] T001H2_n610MaqHNPMes ;
   private String[] T001H2_A396EmprCod ;
   private String[] T001H2_A602MaqCod ;
   private String[] T001H14_A606MaqDsc ;
   private boolean[] T001H14_n606MaqDsc ;
   private String[] T001H15_A396EmprCod ;
   private String[] T001H15_A602MaqCod ;
   private short[] T001H15_A599MaqAny ;
   private byte[] T001H15_A614MaqMes ;
   private byte[] T001H15_A5123MaqHnpDia ;
   private String[] T001H16_A396EmprCod ;
   private String[] T001H16_A602MaqCod ;
   private short[] T001H16_A599MaqAny ;
   private byte[] T001H16_A614MaqMes ;
   private String[] T001H17_A407EmprNom ;
   private boolean[] T001H17_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmaqhnp__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqhnp__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqhnp__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqhnp__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqhnp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001H2", "SELECT MaqAny, MaqMes, MaqHNPMes, EmprCod, MaqCod FROM TXPMAQHNP WHERE EmprCod = ? AND MaqCod = ? AND MaqAny = ? AND MaqMes = ?  FOR UPDATE OF MaqHNPMes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001H3", "SELECT MaqAny, MaqMes, MaqHNPMes, EmprCod, MaqCod FROM TXPMAQHNP WHERE EmprCod = ? AND MaqCod = ? AND MaqAny = ? AND MaqMes = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001H4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001H5", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001H6", "SELECT /*+ FIRST_ROWS(100) */ TM1.MaqAny, TM1.MaqMes, T3.MaqDsc, TM1.MaqHNPMes, T2.EmprNom, TM1.EmprCod, TM1.MaqCod FROM ((TXPMAQHNP TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = TM1.EmprCod AND T3.MaqCod = TM1.MaqCod) WHERE TM1.EmprCod = ? and TM1.MaqCod = ? and TM1.MaqAny = ? and TM1.MaqMes = ? ORDER BY TM1.EmprCod, TM1.MaqCod, TM1.MaqAny, TM1.MaqMes ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001H7", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001H8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, MaqAny, MaqMes FROM TXPMAQHNP WHERE EmprCod = ? AND MaqCod = ? AND MaqAny = ? AND MaqMes = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001H9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, MaqAny, MaqMes FROM TXPMAQHNP WHERE ( MaqCod > ? or MaqCod = ? and MaqAny > ? or MaqAny = ? and MaqCod = ? and MaqMes > ?) and EmprCod = ? ORDER BY EmprCod, MaqCod, MaqAny, MaqMes) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001H10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, MaqAny, MaqMes FROM TXPMAQHNP WHERE ( MaqCod < ? or MaqCod = ? and MaqAny < ? or MaqAny = ? and MaqCod = ? and MaqMes < ?) and EmprCod = ? ORDER BY EmprCod DESC, MaqCod DESC, MaqAny DESC, MaqMes DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T001H11", "INSERT INTO TXPMAQHNP(MaqAny, MaqMes, MaqHNPMes, EmprCod, MaqCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPMAQHNP")
         ,new UpdateCursor("T001H12", "UPDATE TXPMAQHNP SET MaqHNPMes=?  WHERE EmprCod = ? AND MaqCod = ? AND MaqAny = ? AND MaqMes = ?", GX_NOMASK, "TXPMAQHNP")
         ,new UpdateCursor("T001H13", "DELETE FROM TXPMAQHNP  WHERE EmprCod = ? AND MaqCod = ? AND MaqAny = ? AND MaqMes = ?", GX_NOMASK, "TXPMAQHNP")
         ,new ForEachCursor("T001H14", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001H15", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqAny, MaqMes, MaqHnpDia FROM TXPINTHNP WHERE EmprCod = ? AND MaqCod = ? AND MaqAny = ? AND MaqMes = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001H16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MaqCod, MaqAny, MaqMes FROM TXPMAQHNP WHERE EmprCod = ? ORDER BY EmprCod, MaqCod, MaqAny, MaqMes ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001H17", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               ((String[]) buf[9])[0] = rslt.getString(7, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 15 :
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 9 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[3], 63);
               }
               stmt.setString(4, (String)parms[4], 3);
               stmt.setString(5, (String)parms[5], 6);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 63);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

