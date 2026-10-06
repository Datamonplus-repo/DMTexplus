package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tccvar_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Variables Automáticas", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCCVCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tccvar_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tccvar_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tccvar_impl.class ));
   }

   public tccvar_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbCCVTpoDat = new HTMLChoice();
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
      if ( cmbCCVTpoDat.getItemCount() > 0 )
      {
         A11528CCVTpoDat = cmbCCVTpoDat.getValidValue(A11528CCVTpoDat) ;
         n11528CCVTpoDat = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11528CCVTpoDat", A11528CCVTpoDat);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCCVTpoDat.setValue( GXutil.rtrim( A11528CCVTpoDat) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCVTpoDat.getInternalname(), "Values", cmbCCVTpoDat.ToJavascriptSource(), true);
      }
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCVar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCVar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCVar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCVar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ControlCalidadHTD\\TCCVar.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCVar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCVar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCVar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCVar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Variable Automática", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCVar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCVCod_Internalname, GXutil.rtrim( A11522CCVCod), GXutil.rtrim( localUtil.format( A11522CCVCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCVCod_Jsonclick, 0, "", "", "", "", "", 1, edtCCVCod_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCVar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCVar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Descripción", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCVar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCVDsc_Internalname, GXutil.rtrim( A11529CCVDsc), GXutil.rtrim( localUtil.format( A11529CCVDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCVDsc_Jsonclick, 0, "", "", "", "", "", 1, edtCCVDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCVar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Largo", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCVar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCVLgoDat_Internalname, GXutil.ltrim( localUtil.ntoc( A11527CCVLgoDat, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCVLgoDat_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11527CCVLgoDat), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11527CCVLgoDat), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCVLgoDat_Jsonclick, 0, "", "", "", "", "", 1, edtCCVLgoDat_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TCCVar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Tipo de Datos", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCVar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCCVTpoDat, cmbCCVTpoDat.getInternalname(), GXutil.rtrim( A11528CCVTpoDat), 1, cmbCCVTpoDat.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbCCVTpoDat.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "", true, (byte)(0), "HLP_ControlCalidadHTD\\TCCVar.htm");
      cmbCCVTpoDat.setValue( GXutil.rtrim( A11528CCVTpoDat) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCVTpoDat.getInternalname(), "Values", cmbCCVTpoDat.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Pict", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCVar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCVPict_Internalname, GXutil.rtrim( A11526CCVPict), GXutil.rtrim( localUtil.format( A11526CCVPict, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCVPict_Jsonclick, 0, "", "", "", "", "", 1, edtCCVPict_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCVar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Prc Calcula", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCVar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCVCalc_Internalname, GXutil.rtrim( A11533CCVCalc), GXutil.rtrim( localUtil.format( A11533CCVCalc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCVCalc_Jsonclick, 0, "", "", "", "", "", 1, edtCCVCalc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCVar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCVar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCVar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCVar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCVar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_ControlCalidadHTD\\TCCVar.htm");
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
      e111C92 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z11522CCVCod = httpContext.cgiGet( "Z11522CCVCod") ;
            Z11529CCVDsc = httpContext.cgiGet( "Z11529CCVDsc") ;
            Z11527CCVLgoDat = (short)(localUtil.ctol( httpContext.cgiGet( "Z11527CCVLgoDat"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11528CCVTpoDat = httpContext.cgiGet( "Z11528CCVTpoDat") ;
            Z11526CCVPict = httpContext.cgiGet( "Z11526CCVPict") ;
            Z11533CCVCalc = httpContext.cgiGet( "Z11533CCVCalc") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A11522CCVCod = httpContext.cgiGet( edtCCVCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11522CCVCod", A11522CCVCod);
            A11529CCVDsc = httpContext.cgiGet( edtCCVDsc_Internalname) ;
            n11529CCVDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11529CCVDsc", A11529CCVDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCVLgoDat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCVLgoDat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCVLGODAT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCCVLgoDat_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11527CCVLgoDat = (short)(0) ;
               n11527CCVLgoDat = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11527CCVLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11527CCVLgoDat), 3, 0));
            }
            else
            {
               A11527CCVLgoDat = (short)(localUtil.ctol( httpContext.cgiGet( edtCCVLgoDat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11527CCVLgoDat = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11527CCVLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11527CCVLgoDat), 3, 0));
            }
            cmbCCVTpoDat.setValue( httpContext.cgiGet( cmbCCVTpoDat.getInternalname()) );
            A11528CCVTpoDat = httpContext.cgiGet( cmbCCVTpoDat.getInternalname()) ;
            n11528CCVTpoDat = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11528CCVTpoDat", A11528CCVTpoDat);
            A11526CCVPict = httpContext.cgiGet( edtCCVPict_Internalname) ;
            n11526CCVPict = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11526CCVPict", A11526CCVPict);
            A11533CCVCalc = httpContext.cgiGet( edtCCVCalc_Internalname) ;
            n11533CCVCalc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11533CCVCalc", A11533CCVCalc);
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
               A11522CCVCod = httpContext.GetPar( "CCVCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A11522CCVCod", A11522CCVCod);
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
                        e111C92 ();
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
            initAll1C91536( ) ;
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
      disableAttributes1C91536( ) ;
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

   public void confirm_1C90( )
   {
      beforeValidate1C91536( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1C91536( ) ;
         }
         else
         {
            checkExtendedTable1C91536( ) ;
            if ( AnyError == 0 )
            {
               zm1C91536( 3) ;
            }
            closeExtendedTableCursors1C91536( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1C90( ) ;
      }
   }

   public void resetCaption1C90( )
   {
   }

   public void e111C92( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(8), GXv_char2) ;
      tccvar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tccvar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tccvar_impl.this.A396EmprCod = GXv_char2[0] ;
      tccvar_impl.this.AV11EmprNom = GXv_char3[0] ;
      tccvar_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1C91536( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11529CCVDsc = T01C93_A11529CCVDsc[0] ;
            Z11527CCVLgoDat = T01C93_A11527CCVLgoDat[0] ;
            Z11528CCVTpoDat = T01C93_A11528CCVTpoDat[0] ;
            Z11526CCVPict = T01C93_A11526CCVPict[0] ;
            Z11533CCVCalc = T01C93_A11533CCVCalc[0] ;
         }
         else
         {
            Z11529CCVDsc = A11529CCVDsc ;
            Z11527CCVLgoDat = A11527CCVLgoDat ;
            Z11528CCVTpoDat = A11528CCVTpoDat ;
            Z11526CCVPict = A11526CCVPict ;
            Z11533CCVCalc = A11533CCVCalc ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z11522CCVCod = A11522CCVCod ;
         Z11529CCVDsc = A11529CCVDsc ;
         Z11527CCVLgoDat = A11527CCVLgoDat ;
         Z11528CCVTpoDat = A11528CCVTpoDat ;
         Z11526CCVPict = A11526CCVPict ;
         Z11533CCVCalc = A11533CCVCalc ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T01C94 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01C94_A407EmprNom[0] ;
      n407EmprNom = T01C94_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
   }

   public void standaloneModal( )
   {
      if ( isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion NO permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
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

   public void load1C91536( )
   {
      /* Using cursor T01C95 */
      pr_default.execute(3, new Object[] {A396EmprCod, A11522CCVCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1536 = (short)(1) ;
         A407EmprNom = T01C95_A407EmprNom[0] ;
         n407EmprNom = T01C95_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A11529CCVDsc = T01C95_A11529CCVDsc[0] ;
         n11529CCVDsc = T01C95_n11529CCVDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11529CCVDsc", A11529CCVDsc);
         A11527CCVLgoDat = T01C95_A11527CCVLgoDat[0] ;
         n11527CCVLgoDat = T01C95_n11527CCVLgoDat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11527CCVLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11527CCVLgoDat), 3, 0));
         A11528CCVTpoDat = T01C95_A11528CCVTpoDat[0] ;
         n11528CCVTpoDat = T01C95_n11528CCVTpoDat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11528CCVTpoDat", A11528CCVTpoDat);
         A11526CCVPict = T01C95_A11526CCVPict[0] ;
         n11526CCVPict = T01C95_n11526CCVPict[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11526CCVPict", A11526CCVPict);
         A11533CCVCalc = T01C95_A11533CCVCalc[0] ;
         n11533CCVCalc = T01C95_n11533CCVCalc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11533CCVCalc", A11533CCVCalc);
         zm1C91536( -2) ;
      }
      pr_default.close(3);
      onLoadActions1C91536( ) ;
   }

   public void onLoadActions1C91536( )
   {
   }

   public void checkExtendedTable1C91536( )
   {
      nIsDirty_1536 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1C91536( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1C91536( )
   {
      /* Using cursor T01C96 */
      pr_default.execute(4, new Object[] {A396EmprCod, A11522CCVCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1536 = (short)(1) ;
      }
      else
      {
         RcdFound1536 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01C93 */
      pr_default.execute(1, new Object[] {A396EmprCod, A11522CCVCod});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01C93_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1C91536( 2) ;
         RcdFound1536 = (short)(1) ;
         A11522CCVCod = T01C93_A11522CCVCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11522CCVCod", A11522CCVCod);
         A11529CCVDsc = T01C93_A11529CCVDsc[0] ;
         n11529CCVDsc = T01C93_n11529CCVDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11529CCVDsc", A11529CCVDsc);
         A11527CCVLgoDat = T01C93_A11527CCVLgoDat[0] ;
         n11527CCVLgoDat = T01C93_n11527CCVLgoDat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11527CCVLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11527CCVLgoDat), 3, 0));
         A11528CCVTpoDat = T01C93_A11528CCVTpoDat[0] ;
         n11528CCVTpoDat = T01C93_n11528CCVTpoDat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11528CCVTpoDat", A11528CCVTpoDat);
         A11526CCVPict = T01C93_A11526CCVPict[0] ;
         n11526CCVPict = T01C93_n11526CCVPict[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11526CCVPict", A11526CCVPict);
         A11533CCVCalc = T01C93_A11533CCVCalc[0] ;
         n11533CCVCalc = T01C93_n11533CCVCalc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11533CCVCalc", A11533CCVCalc);
         Z396EmprCod = A396EmprCod ;
         Z11522CCVCod = A11522CCVCod ;
         sMode1536 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1C91536( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1536 = (short)(0) ;
            initializeNonKey1C91536( ) ;
         }
         Gx_mode = sMode1536 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1536 = (short)(0) ;
         initializeNonKey1C91536( ) ;
         sMode1536 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1536 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1C91536( ) ;
      if ( RcdFound1536 == 0 )
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
      RcdFound1536 = (short)(0) ;
      /* Using cursor T01C97 */
      pr_default.execute(5, new Object[] {A11522CCVCod, A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T01C97_A11522CCVCod[0], A11522CCVCod) < 0 ) ) && ( GXutil.strcmp(T01C97_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T01C97_A11522CCVCod[0], A11522CCVCod) > 0 ) ) && ( GXutil.strcmp(T01C97_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A11522CCVCod = T01C97_A11522CCVCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11522CCVCod", A11522CCVCod);
            RcdFound1536 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound1536 = (short)(0) ;
      /* Using cursor T01C98 */
      pr_default.execute(6, new Object[] {A11522CCVCod, A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01C98_A11522CCVCod[0], A11522CCVCod) > 0 ) ) && ( GXutil.strcmp(T01C98_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01C98_A11522CCVCod[0], A11522CCVCod) < 0 ) ) && ( GXutil.strcmp(T01C98_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A11522CCVCod = T01C98_A11522CCVCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11522CCVCod", A11522CCVCod);
            RcdFound1536 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1C91536( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCCVCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1C91536( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1536 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11522CCVCod, Z11522CCVCod) != 0 ) )
            {
               A11522CCVCod = Z11522CCVCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A11522CCVCod", A11522CCVCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCCVCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1C91536( ) ;
               GX_FocusControl = edtCCVCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11522CCVCod, Z11522CCVCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtCCVCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1C91536( ) ;
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
                  GX_FocusControl = edtCCVCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1C91536( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11522CCVCod, Z11522CCVCod) != 0 ) )
      {
         A11522CCVCod = Z11522CCVCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A11522CCVCod", A11522CCVCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCCVCod_Internalname ;
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
      getKey1C91536( ) ;
      if ( RcdFound1536 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11522CCVCod, Z11522CCVCod) != 0 ) )
         {
            A11522CCVCod = Z11522CCVCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A11522CCVCod", A11522CCVCod);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11522CCVCod, Z11522CCVCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.tccvar");
      GX_FocusControl = edtCCVDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1C90( ) ;
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
      if ( RcdFound1536 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtCCVDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1C91536( ) ;
      if ( RcdFound1536 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCVDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1C91536( ) ;
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
      if ( RcdFound1536 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCVDsc_Internalname ;
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
      if ( RcdFound1536 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCVDsc_Internalname ;
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
      scanStart1C91536( ) ;
      if ( RcdFound1536 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1536 != 0 )
         {
            scanNext1C91536( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCVDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1C91536( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1C91536( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01C92 */
         pr_default.execute(0, new Object[] {A396EmprCod, A11522CCVCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCVar"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z11529CCVDsc, T01C92_A11529CCVDsc[0]) != 0 ) || ( Z11527CCVLgoDat != T01C92_A11527CCVLgoDat[0] ) || ( GXutil.strcmp(Z11528CCVTpoDat, T01C92_A11528CCVTpoDat[0]) != 0 ) || ( GXutil.strcmp(Z11526CCVPict, T01C92_A11526CCVPict[0]) != 0 ) || ( GXutil.strcmp(Z11533CCVCalc, T01C92_A11533CCVCalc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z11529CCVDsc, T01C92_A11529CCVDsc[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccvar:[seudo value changed for attri]"+"CCVDsc");
               GXutil.writeLogRaw("Old: ",Z11529CCVDsc);
               GXutil.writeLogRaw("Current: ",T01C92_A11529CCVDsc[0]);
            }
            if ( Z11527CCVLgoDat != T01C92_A11527CCVLgoDat[0] )
            {
               GXutil.writeLogln("controlcalidadhtd.tccvar:[seudo value changed for attri]"+"CCVLgoDat");
               GXutil.writeLogRaw("Old: ",Z11527CCVLgoDat);
               GXutil.writeLogRaw("Current: ",T01C92_A11527CCVLgoDat[0]);
            }
            if ( GXutil.strcmp(Z11528CCVTpoDat, T01C92_A11528CCVTpoDat[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccvar:[seudo value changed for attri]"+"CCVTpoDat");
               GXutil.writeLogRaw("Old: ",Z11528CCVTpoDat);
               GXutil.writeLogRaw("Current: ",T01C92_A11528CCVTpoDat[0]);
            }
            if ( GXutil.strcmp(Z11526CCVPict, T01C92_A11526CCVPict[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccvar:[seudo value changed for attri]"+"CCVPict");
               GXutil.writeLogRaw("Old: ",Z11526CCVPict);
               GXutil.writeLogRaw("Current: ",T01C92_A11526CCVPict[0]);
            }
            if ( GXutil.strcmp(Z11533CCVCalc, T01C92_A11533CCVCalc[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccvar:[seudo value changed for attri]"+"CCVCalc");
               GXutil.writeLogRaw("Old: ",Z11533CCVCalc);
               GXutil.writeLogRaw("Current: ",T01C92_A11533CCVCalc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCVar"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1C91536( )
   {
      beforeValidate1C91536( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1C91536( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1C91536( 0) ;
         checkOptimisticConcurrency1C91536( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1C91536( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1C91536( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01C99 */
                  pr_default.execute(7, new Object[] {A11522CCVCod, Boolean.valueOf(n11529CCVDsc), A11529CCVDsc, Boolean.valueOf(n11527CCVLgoDat), Short.valueOf(A11527CCVLgoDat), Boolean.valueOf(n11528CCVTpoDat), A11528CCVTpoDat, Boolean.valueOf(n11526CCVPict), A11526CCVPict, Boolean.valueOf(n11533CCVCalc), A11533CCVCalc, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCVar");
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
                        resetCaption1C90( ) ;
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
            load1C91536( ) ;
         }
         endLevel1C91536( ) ;
      }
      closeExtendedTableCursors1C91536( ) ;
   }

   public void update1C91536( )
   {
      beforeValidate1C91536( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1C91536( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1C91536( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1C91536( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1C91536( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01C910 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n11529CCVDsc), A11529CCVDsc, Boolean.valueOf(n11527CCVLgoDat), Short.valueOf(A11527CCVLgoDat), Boolean.valueOf(n11528CCVTpoDat), A11528CCVTpoDat, Boolean.valueOf(n11526CCVPict), A11526CCVPict, Boolean.valueOf(n11533CCVCalc), A11533CCVCalc, A396EmprCod, A11522CCVCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCVar");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCVar"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1C91536( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1C90( ) ;
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
         endLevel1C91536( ) ;
      }
      closeExtendedTableCursors1C91536( ) ;
   }

   public void deferredUpdate1C91536( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1C91536( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1C91536( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1C91536( ) ;
         afterConfirm1C91536( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1C91536( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01C911 */
               pr_default.execute(9, new Object[] {A396EmprCod, A11522CCVCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCVar");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1536 == 0 )
                     {
                        initAll1C91536( ) ;
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
                     resetCaption1C90( ) ;
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
      sMode1536 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1C91536( ) ;
      Gx_mode = sMode1536 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1C91536( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1C91536( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1C91536( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.tccvar");
         if ( AnyError == 0 )
         {
            confirmValues1C90( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.tccvar");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1C91536( )
   {
      /* Scan By routine */
      /* Using cursor T01C912 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      RcdFound1536 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1536 = (short)(1) ;
         A11522CCVCod = T01C912_A11522CCVCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11522CCVCod", A11522CCVCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1C91536( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound1536 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1536 = (short)(1) ;
         A11522CCVCod = T01C912_A11522CCVCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11522CCVCod", A11522CCVCod);
      }
   }

   public void scanEnd1C91536( )
   {
      pr_default.close(10);
   }

   public void afterConfirm1C91536( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1C91536( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1C91536( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1C91536( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1C91536( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1C91536( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1C91536( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCCVCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVCod_Enabled), 5, 0), true);
      edtCCVDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVDsc_Enabled), 5, 0), true);
      edtCCVLgoDat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVLgoDat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVLgoDat_Enabled), 5, 0), true);
      cmbCCVTpoDat.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCVTpoDat.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCVTpoDat.getEnabled(), 5, 0), true);
      edtCCVPict_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVPict_Enabled), 5, 0), true);
      edtCCVCalc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVCalc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVCalc_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1C91536( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1C90( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.tccvar", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11522CCVCod", GXutil.rtrim( Z11522CCVCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11529CCVDsc", GXutil.rtrim( Z11529CCVDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11527CCVLgoDat", GXutil.ltrim( localUtil.ntoc( Z11527CCVLgoDat, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11528CCVTpoDat", GXutil.rtrim( Z11528CCVTpoDat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11526CCVPict", GXutil.rtrim( Z11526CCVPict));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11533CCVCalc", GXutil.rtrim( Z11533CCVCalc));
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
      return formatLink("app.controlcalidadhtd.tccvar", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.TCCVar" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Variables Automáticas", "") ;
   }

   public void initializeNonKey1C91536( )
   {
      A11529CCVDsc = "" ;
      n11529CCVDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11529CCVDsc", A11529CCVDsc);
      A11527CCVLgoDat = (short)(0) ;
      n11527CCVLgoDat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11527CCVLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11527CCVLgoDat), 3, 0));
      A11528CCVTpoDat = "" ;
      n11528CCVTpoDat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11528CCVTpoDat", A11528CCVTpoDat);
      A11526CCVPict = "" ;
      n11526CCVPict = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11526CCVPict", A11526CCVPict);
      A11533CCVCalc = "" ;
      n11533CCVCalc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11533CCVCalc", A11533CCVCalc);
      Z11529CCVDsc = "" ;
      Z11527CCVLgoDat = (short)(0) ;
      Z11528CCVTpoDat = "" ;
      Z11526CCVPict = "" ;
      Z11533CCVCalc = "" ;
   }

   public void initAll1C91536( )
   {
      A11522CCVCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11522CCVCod", A11522CCVCod);
      initializeNonKey1C91536( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241564919", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/tccvar.js", "?20268241564920", false, true);
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtCCVCod_Internalname = "CCVCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCCVDsc_Internalname = "CCVDSC" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCCVLgoDat_Internalname = "CCVLGODAT" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      cmbCCVTpoDat.setInternalname( "CCVTPODAT" );
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtCCVPict_Internalname = "CCVPICT" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtCCVCalc_Internalname = "CCVCALC" ;
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
      Form.setCaption( httpContext.getMessage( "Variables Automáticas", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtCCVCalc_Jsonclick = "" ;
      edtCCVCalc_Backcolor = (int)(0xFFFFFF) ;
      edtCCVCalc_Enabled = 1 ;
      edtCCVPict_Jsonclick = "" ;
      edtCCVPict_Backcolor = (int)(0xFFFFFF) ;
      edtCCVPict_Enabled = 1 ;
      cmbCCVTpoDat.setJsonclick( "" );
      cmbCCVTpoDat.setEnabled( 1 );
      cmbCCVTpoDat.setIBackground( (int)(0xFFFFFF) );
      edtCCVLgoDat_Jsonclick = "" ;
      edtCCVLgoDat_Backcolor = (int)(0xFFFFFF) ;
      edtCCVLgoDat_Enabled = 1 ;
      edtCCVDsc_Jsonclick = "" ;
      edtCCVDsc_Backcolor = (int)(0xFFFFFF) ;
      edtCCVDsc_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtCCVCod_Jsonclick = "" ;
      edtCCVCod_Backcolor = (int)(0xFFFFFF) ;
      edtCCVCod_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
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
      cmbCCVTpoDat.setName( "CCVTPODAT" );
      cmbCCVTpoDat.setWebtags( "" );
      cmbCCVTpoDat.addItem("", httpContext.getMessage( "No Aplica", ""), (short)(0));
      cmbCCVTpoDat.addItem("N", httpContext.getMessage( "Numerico", ""), (short)(0));
      cmbCCVTpoDat.addItem("F", httpContext.getMessage( "Fecha", ""), (short)(0));
      cmbCCVTpoDat.addItem("H", httpContext.getMessage( "Hora", ""), (short)(0));
      cmbCCVTpoDat.addItem("C", httpContext.getMessage( "Caracter", ""), (short)(0));
      if ( cmbCCVTpoDat.getItemCount() > 0 )
      {
         A11528CCVTpoDat = cmbCCVTpoDat.getValidValue(A11528CCVTpoDat) ;
         n11528CCVTpoDat = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11528CCVTpoDat", A11528CCVTpoDat);
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01C913 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01C913_A407EmprNom[0] ;
      n407EmprNom = T01C913_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(11);
      GX_FocusControl = edtCCVDsc_Internalname ;
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

   public void valid_Ccvcod( )
   {
      n11528CCVTpoDat = false ;
      A11528CCVTpoDat = cmbCCVTpoDat.getValue() ;
      n11528CCVTpoDat = false ;
      cmbCCVTpoDat.setValue( A11528CCVTpoDat );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      if ( cmbCCVTpoDat.getItemCount() > 0 )
      {
         A11528CCVTpoDat = cmbCCVTpoDat.getValidValue(A11528CCVTpoDat) ;
         n11528CCVTpoDat = false ;
         cmbCCVTpoDat.setValue( A11528CCVTpoDat );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCCVTpoDat.setValue( GXutil.rtrim( A11528CCVTpoDat) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A11529CCVDsc", GXutil.rtrim( A11529CCVDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A11527CCVLgoDat", GXutil.ltrim( localUtil.ntoc( A11527CCVLgoDat, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11528CCVTpoDat", GXutil.rtrim( A11528CCVTpoDat));
      cmbCCVTpoDat.setValue( GXutil.rtrim( A11528CCVTpoDat) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCVTpoDat.getInternalname(), "Values", cmbCCVTpoDat.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11526CCVPict", GXutil.rtrim( A11526CCVPict));
      httpContext.ajax_rsp_assign_attri("", false, "A11533CCVCalc", GXutil.rtrim( A11533CCVCalc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11522CCVCod", GXutil.rtrim( Z11522CCVCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11529CCVDsc", GXutil.rtrim( Z11529CCVDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11527CCVLgoDat", GXutil.ltrim( localUtil.ntoc( Z11527CCVLgoDat, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11528CCVTpoDat", GXutil.rtrim( Z11528CCVTpoDat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11526CCVPict", GXutil.rtrim( Z11526CCVPict));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11533CCVCalc", GXutil.rtrim( Z11533CCVCalc));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CCVCOD","{handler:'valid_Ccvcod',iparms:[{av:'cmbCCVTpoDat'},{av:'A11528CCVTpoDat',fld:'CCVTPODAT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11522CCVCod',fld:'CCVCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_CCVCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A11529CCVDsc',fld:'CCVDSC',pic:''},{av:'A11527CCVLgoDat',fld:'CCVLGODAT',pic:'ZZ9'},{av:'cmbCCVTpoDat'},{av:'A11528CCVTpoDat',fld:'CCVTPODAT',pic:''},{av:'A11526CCVPict',fld:'CCVPICT',pic:''},{av:'A11533CCVCalc',fld:'CCVCALC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z11522CCVCod'},{av:'Z407EmprNom'},{av:'Z11529CCVDsc'},{av:'Z11527CCVLgoDat'},{av:'Z11528CCVTpoDat'},{av:'Z11526CCVPict'},{av:'Z11533CCVCalc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_default.close(11);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z11522CCVCod = "" ;
      Z11529CCVDsc = "" ;
      Z11528CCVTpoDat = "" ;
      Z11526CCVPict = "" ;
      Z11533CCVCalc = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A11528CCVTpoDat = "" ;
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
      A396EmprCod = "" ;
      lblTextblock2_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      A11522CCVCod = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A11529CCVDsc = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A11526CCVPict = "" ;
      lblTextblock8_Jsonclick = "" ;
      A11533CCVCalc = "" ;
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
      AV7Lit0 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      T01C94_A407EmprNom = new String[] {""} ;
      T01C94_n407EmprNom = new boolean[] {false} ;
      T01C95_A11522CCVCod = new String[] {""} ;
      T01C95_A407EmprNom = new String[] {""} ;
      T01C95_n407EmprNom = new boolean[] {false} ;
      T01C95_A11529CCVDsc = new String[] {""} ;
      T01C95_n11529CCVDsc = new boolean[] {false} ;
      T01C95_A11527CCVLgoDat = new short[1] ;
      T01C95_n11527CCVLgoDat = new boolean[] {false} ;
      T01C95_A11528CCVTpoDat = new String[] {""} ;
      T01C95_n11528CCVTpoDat = new boolean[] {false} ;
      T01C95_A11526CCVPict = new String[] {""} ;
      T01C95_n11526CCVPict = new boolean[] {false} ;
      T01C95_A11533CCVCalc = new String[] {""} ;
      T01C95_n11533CCVCalc = new boolean[] {false} ;
      T01C95_A396EmprCod = new String[] {""} ;
      T01C96_A396EmprCod = new String[] {""} ;
      T01C96_A11522CCVCod = new String[] {""} ;
      T01C93_A11522CCVCod = new String[] {""} ;
      T01C93_A11529CCVDsc = new String[] {""} ;
      T01C93_n11529CCVDsc = new boolean[] {false} ;
      T01C93_A11527CCVLgoDat = new short[1] ;
      T01C93_n11527CCVLgoDat = new boolean[] {false} ;
      T01C93_A11528CCVTpoDat = new String[] {""} ;
      T01C93_n11528CCVTpoDat = new boolean[] {false} ;
      T01C93_A11526CCVPict = new String[] {""} ;
      T01C93_n11526CCVPict = new boolean[] {false} ;
      T01C93_A11533CCVCalc = new String[] {""} ;
      T01C93_n11533CCVCalc = new boolean[] {false} ;
      T01C93_A396EmprCod = new String[] {""} ;
      sMode1536 = "" ;
      T01C97_A396EmprCod = new String[] {""} ;
      T01C97_A11522CCVCod = new String[] {""} ;
      T01C98_A396EmprCod = new String[] {""} ;
      T01C98_A11522CCVCod = new String[] {""} ;
      T01C92_A11522CCVCod = new String[] {""} ;
      T01C92_A11529CCVDsc = new String[] {""} ;
      T01C92_n11529CCVDsc = new boolean[] {false} ;
      T01C92_A11527CCVLgoDat = new short[1] ;
      T01C92_n11527CCVLgoDat = new boolean[] {false} ;
      T01C92_A11528CCVTpoDat = new String[] {""} ;
      T01C92_n11528CCVTpoDat = new boolean[] {false} ;
      T01C92_A11526CCVPict = new String[] {""} ;
      T01C92_n11526CCVPict = new boolean[] {false} ;
      T01C92_A11533CCVCalc = new String[] {""} ;
      T01C92_n11533CCVCalc = new boolean[] {false} ;
      T01C92_A396EmprCod = new String[] {""} ;
      T01C912_A396EmprCod = new String[] {""} ;
      T01C912_A11522CCVCod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01C913_A407EmprNom = new String[] {""} ;
      T01C913_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ11522CCVCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ11529CCVDsc = "" ;
      ZZ11528CCVTpoDat = "" ;
      ZZ11526CCVPict = "" ;
      ZZ11533CCVCalc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccvar__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccvar__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccvar__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccvar__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccvar__default(),
         new Object[] {
             new Object[] {
            T01C92_A11522CCVCod, T01C92_A11529CCVDsc, T01C92_n11529CCVDsc, T01C92_A11527CCVLgoDat, T01C92_n11527CCVLgoDat, T01C92_A11528CCVTpoDat, T01C92_n11528CCVTpoDat, T01C92_A11526CCVPict, T01C92_n11526CCVPict, T01C92_A11533CCVCalc,
            T01C92_n11533CCVCalc, T01C92_A396EmprCod
            }
            , new Object[] {
            T01C93_A11522CCVCod, T01C93_A11529CCVDsc, T01C93_n11529CCVDsc, T01C93_A11527CCVLgoDat, T01C93_n11527CCVLgoDat, T01C93_A11528CCVTpoDat, T01C93_n11528CCVTpoDat, T01C93_A11526CCVPict, T01C93_n11526CCVPict, T01C93_A11533CCVCalc,
            T01C93_n11533CCVCalc, T01C93_A396EmprCod
            }
            , new Object[] {
            T01C94_A407EmprNom, T01C94_n407EmprNom
            }
            , new Object[] {
            T01C95_A11522CCVCod, T01C95_A407EmprNom, T01C95_n407EmprNom, T01C95_A11529CCVDsc, T01C95_n11529CCVDsc, T01C95_A11527CCVLgoDat, T01C95_n11527CCVLgoDat, T01C95_A11528CCVTpoDat, T01C95_n11528CCVTpoDat, T01C95_A11526CCVPict,
            T01C95_n11526CCVPict, T01C95_A11533CCVCalc, T01C95_n11533CCVCalc, T01C95_A396EmprCod
            }
            , new Object[] {
            T01C96_A396EmprCod, T01C96_A11522CCVCod
            }
            , new Object[] {
            T01C97_A396EmprCod, T01C97_A11522CCVCod
            }
            , new Object[] {
            T01C98_A396EmprCod, T01C98_A11522CCVCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01C912_A396EmprCod, T01C912_A11522CCVCod
            }
            , new Object[] {
            T01C913_A407EmprNom, T01C913_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z11527CCVLgoDat ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A11527CCVLgoDat ;
   private short RcdFound1536 ;
   private short nIsDirty_1536 ;
   private short ZZ11527CCVLgoDat ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCCVCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtCCVDsc_Enabled ;
   private int edtCCVLgoDat_Enabled ;
   private int edtCCVPict_Enabled ;
   private int edtCCVCalc_Enabled ;
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
   private int edtCCVCalc_Backcolor ;
   private int edtCCVPict_Backcolor ;
   private int edtCCVLgoDat_Backcolor ;
   private int edtCCVDsc_Backcolor ;
   private int edtCCVCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z11522CCVCod ;
   private String Z11529CCVDsc ;
   private String Z11528CCVTpoDat ;
   private String Z11526CCVPict ;
   private String Z11533CCVCalc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCCVCod_Internalname ;
   private String A11528CCVTpoDat ;
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
   private String A396EmprCod ;
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String A11522CCVCod ;
   private String edtCCVCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCCVDsc_Internalname ;
   private String A11529CCVDsc ;
   private String edtCCVDsc_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCCVLgoDat_Internalname ;
   private String edtCCVLgoDat_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtCCVPict_Internalname ;
   private String A11526CCVPict ;
   private String edtCCVPict_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtCCVCalc_Internalname ;
   private String A11533CCVCalc ;
   private String edtCCVCalc_Jsonclick ;
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
   private String AV7Lit0 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sMode1536 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ11522CCVCod ;
   private String ZZ407EmprNom ;
   private String ZZ11529CCVDsc ;
   private String ZZ11528CCVTpoDat ;
   private String ZZ11526CCVPict ;
   private String ZZ11533CCVCalc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n11528CCVTpoDat ;
   private boolean n407EmprNom ;
   private boolean n11529CCVDsc ;
   private boolean n11527CCVLgoDat ;
   private boolean n11526CCVPict ;
   private boolean n11533CCVCalc ;
   private boolean returnInSub ;
   private HTMLChoice cmbCCVTpoDat ;
   private IDataStoreProvider pr_default ;
   private String[] T01C94_A407EmprNom ;
   private boolean[] T01C94_n407EmprNom ;
   private String[] T01C95_A11522CCVCod ;
   private String[] T01C95_A407EmprNom ;
   private boolean[] T01C95_n407EmprNom ;
   private String[] T01C95_A11529CCVDsc ;
   private boolean[] T01C95_n11529CCVDsc ;
   private short[] T01C95_A11527CCVLgoDat ;
   private boolean[] T01C95_n11527CCVLgoDat ;
   private String[] T01C95_A11528CCVTpoDat ;
   private boolean[] T01C95_n11528CCVTpoDat ;
   private String[] T01C95_A11526CCVPict ;
   private boolean[] T01C95_n11526CCVPict ;
   private String[] T01C95_A11533CCVCalc ;
   private boolean[] T01C95_n11533CCVCalc ;
   private String[] T01C95_A396EmprCod ;
   private String[] T01C96_A396EmprCod ;
   private String[] T01C96_A11522CCVCod ;
   private String[] T01C93_A11522CCVCod ;
   private String[] T01C93_A11529CCVDsc ;
   private boolean[] T01C93_n11529CCVDsc ;
   private short[] T01C93_A11527CCVLgoDat ;
   private boolean[] T01C93_n11527CCVLgoDat ;
   private String[] T01C93_A11528CCVTpoDat ;
   private boolean[] T01C93_n11528CCVTpoDat ;
   private String[] T01C93_A11526CCVPict ;
   private boolean[] T01C93_n11526CCVPict ;
   private String[] T01C93_A11533CCVCalc ;
   private boolean[] T01C93_n11533CCVCalc ;
   private String[] T01C93_A396EmprCod ;
   private String[] T01C97_A396EmprCod ;
   private String[] T01C97_A11522CCVCod ;
   private String[] T01C98_A396EmprCod ;
   private String[] T01C98_A11522CCVCod ;
   private String[] T01C92_A11522CCVCod ;
   private String[] T01C92_A11529CCVDsc ;
   private boolean[] T01C92_n11529CCVDsc ;
   private short[] T01C92_A11527CCVLgoDat ;
   private boolean[] T01C92_n11527CCVLgoDat ;
   private String[] T01C92_A11528CCVTpoDat ;
   private boolean[] T01C92_n11528CCVTpoDat ;
   private String[] T01C92_A11526CCVPict ;
   private boolean[] T01C92_n11526CCVPict ;
   private String[] T01C92_A11533CCVCalc ;
   private boolean[] T01C92_n11533CCVCalc ;
   private String[] T01C92_A396EmprCod ;
   private String[] T01C912_A396EmprCod ;
   private String[] T01C912_A11522CCVCod ;
   private String[] T01C913_A407EmprNom ;
   private boolean[] T01C913_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tccvar__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tccvar__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tccvar__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tccvar__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tccvar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01C92", "SELECT CCVCod, CCVDsc, CCVLgoDat, CCVTpoDat, CCVPict, CCVCalc, EmprCod FROM TXPCCVar WHERE EmprCod = ? AND CCVCod = ?  FOR UPDATE OF CCVDsc, CCVLgoDat, CCVTpoDat, CCVPict, CCVCalc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01C93", "SELECT CCVCod, CCVDsc, CCVLgoDat, CCVTpoDat, CCVPict, CCVCalc, EmprCod FROM TXPCCVar WHERE EmprCod = ? AND CCVCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01C94", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01C95", "SELECT /*+ FIRST_ROWS(100) */ TM1.CCVCod, T2.EmprNom, TM1.CCVDsc, TM1.CCVLgoDat, TM1.CCVTpoDat, TM1.CCVPict, TM1.CCVCalc, TM1.EmprCod FROM (TXPCCVar TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CCVCod = ? ORDER BY TM1.EmprCod, TM1.CCVCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01C96", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CCVCod FROM TXPCCVar WHERE EmprCod = ? AND CCVCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01C97", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CCVCod FROM TXPCCVar WHERE ( CCVCod > ?) and EmprCod = ? ORDER BY EmprCod, CCVCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01C98", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CCVCod FROM TXPCCVar WHERE ( CCVCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, CCVCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01C99", "INSERT INTO TXPCCVar(CCVCod, CCVDsc, CCVLgoDat, CCVTpoDat, CCVPict, CCVCalc, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCVar")
         ,new UpdateCursor("T01C910", "UPDATE TXPCCVar SET CCVDsc=?, CCVLgoDat=?, CCVTpoDat=?, CCVPict=?, CCVCalc=?  WHERE EmprCod = ? AND CCVCod = ?", GX_NOMASK, "TXPCCVar")
         ,new UpdateCursor("T01C911", "DELETE FROM TXPCCVar  WHERE EmprCod = ? AND CCVCod = ?", GX_NOMASK, "TXPCCVar")
         ,new ForEachCursor("T01C912", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CCVCod FROM TXPCCVar WHERE EmprCod = ? ORDER BY EmprCod, CCVCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01C913", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 40);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 11 :
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
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 10);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 30);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 40);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 10);
               }
               stmt.setString(7, (String)parms[11], 3);
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 40);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 10);
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setString(7, (String)parms[11], 10);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

