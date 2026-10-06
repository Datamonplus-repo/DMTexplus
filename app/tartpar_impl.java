package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tartpar_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PARAMETROS ARTICULOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPar_Art_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tartpar_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tartpar_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tartpar_impl.class ));
   }

   public tartpar_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TARTPAR.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Parametro", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPar_Art_Internalname, GXutil.ltrim( localUtil.ntoc( A7949Par_Art, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPar_Art_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7949Par_Art), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7949Par_Art), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPar_Art_Jsonclick, 0, "", "", "", "", "", 1, edtPar_Art_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPar_Dsc_Internalname, GXutil.rtrim( A7950Par_Dsc), GXutil.rtrim( localUtil.format( A7950Par_Dsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPar_Dsc_Jsonclick, 0, "", "", "", "", "", 1, edtPar_Dsc_Enabled, 0, "text", "", 80, "chr", 1, "row", 80, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Seccion", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPar_Sec_Internalname, GXutil.rtrim( A7951Par_Sec), GXutil.rtrim( localUtil.format( A7951Par_Sec, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPar_Sec_Jsonclick, 0, "", "", "", "", "", 1, edtPar_Sec_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Variable", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPar_Var_Internalname, GXutil.rtrim( A10413Par_Var), GXutil.rtrim( localUtil.format( A10413Par_Var, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPar_Var_Jsonclick, 0, "", "", "", "", "", 1, edtPar_Var_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "N Variable Impresion", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPar_NVar_Internalname, GXutil.ltrim( localUtil.ntoc( A10551Par_NVar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPar_NVar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10551Par_NVar), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10551Par_NVar), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPar_NVar_Jsonclick, 0, "", "", "", "", "", 1, edtPar_NVar_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Texto Impresion N Variable", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTPAR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPar_NVarT_Internalname, GXutil.rtrim( A10552Par_NVarT), GXutil.rtrim( localUtil.format( A10552Par_NVarT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPar_NVarT_Jsonclick, 0, "", "", "", "", "", 1, edtPar_NVarT_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTPAR.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTPAR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TARTPAR.htm");
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
         Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
         Z7949Par_Art = (short)(localUtil.ctol( httpContext.cgiGet( "Z7949Par_Art"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7950Par_Dsc = httpContext.cgiGet( "Z7950Par_Dsc") ;
         Z7951Par_Sec = httpContext.cgiGet( "Z7951Par_Sec") ;
         Z10413Par_Var = httpContext.cgiGet( "Z10413Par_Var") ;
         Z10551Par_NVar = (short)(localUtil.ctol( httpContext.cgiGet( "Z10551Par_NVar"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10552Par_NVarT = httpContext.cgiGet( "Z10552Par_NVarT") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPar_Art_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPar_Art_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PAR_ART");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPar_Art_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7949Par_Art = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7949Par_Art", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7949Par_Art), 4, 0));
         }
         else
         {
            A7949Par_Art = (short)(localUtil.ctol( httpContext.cgiGet( edtPar_Art_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7949Par_Art", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7949Par_Art), 4, 0));
         }
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A7950Par_Dsc = httpContext.cgiGet( edtPar_Dsc_Internalname) ;
         n7950Par_Dsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7950Par_Dsc", A7950Par_Dsc);
         A7951Par_Sec = httpContext.cgiGet( edtPar_Sec_Internalname) ;
         n7951Par_Sec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7951Par_Sec", A7951Par_Sec);
         A10413Par_Var = httpContext.cgiGet( edtPar_Var_Internalname) ;
         n10413Par_Var = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10413Par_Var", A10413Par_Var);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPar_NVar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPar_NVar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PAR_NVAR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPar_NVar_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10551Par_NVar = (short)(0) ;
            n10551Par_NVar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10551Par_NVar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10551Par_NVar), 4, 0));
         }
         else
         {
            A10551Par_NVar = (short)(localUtil.ctol( httpContext.cgiGet( edtPar_NVar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10551Par_NVar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10551Par_NVar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10551Par_NVar), 4, 0));
         }
         A10552Par_NVarT = httpContext.cgiGet( edtPar_NVarT_Internalname) ;
         n10552Par_NVarT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10552Par_NVarT", A10552Par_NVarT);
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
            A7949Par_Art = (short)(GXutil.lval( httpContext.GetPar( "Par_Art"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7949Par_Art", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7949Par_Art), 4, 0));
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
            initAll10J1110( ) ;
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
      disableAttributes10J1110( ) ;
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

   public void confirm_10J0( )
   {
      beforeValidate10J1110( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls10J1110( ) ;
         }
         else
         {
            checkExtendedTable10J1110( ) ;
            if ( AnyError == 0 )
            {
               zm10J1110( 4) ;
            }
            closeExtendedTableCursors10J1110( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues10J0( ) ;
      }
   }

   public void resetCaption10J0( )
   {
   }

   public void zm10J1110( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7950Par_Dsc = T010J3_A7950Par_Dsc[0] ;
            Z7951Par_Sec = T010J3_A7951Par_Sec[0] ;
            Z10413Par_Var = T010J3_A10413Par_Var[0] ;
            Z10551Par_NVar = T010J3_A10551Par_NVar[0] ;
            Z10552Par_NVarT = T010J3_A10552Par_NVarT[0] ;
         }
         else
         {
            Z7950Par_Dsc = A7950Par_Dsc ;
            Z7951Par_Sec = A7951Par_Sec ;
            Z10413Par_Var = A10413Par_Var ;
            Z10551Par_NVar = A10551Par_NVar ;
            Z10552Par_NVarT = A10552Par_NVarT ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z7949Par_Art = A7949Par_Art ;
         Z7950Par_Dsc = A7950Par_Dsc ;
         Z7951Par_Sec = A7951Par_Sec ;
         Z10413Par_Var = A10413Par_Var ;
         Z10551Par_NVar = A10551Par_NVar ;
         Z10552Par_NVarT = A10552Par_NVarT ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
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

   public void load10J1110( )
   {
      /* Using cursor T010J5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A7949Par_Art)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1110 = (short)(1) ;
         A407EmprNom = T010J5_A407EmprNom[0] ;
         n407EmprNom = T010J5_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A7950Par_Dsc = T010J5_A7950Par_Dsc[0] ;
         n7950Par_Dsc = T010J5_n7950Par_Dsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7950Par_Dsc", A7950Par_Dsc);
         A7951Par_Sec = T010J5_A7951Par_Sec[0] ;
         n7951Par_Sec = T010J5_n7951Par_Sec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7951Par_Sec", A7951Par_Sec);
         A10413Par_Var = T010J5_A10413Par_Var[0] ;
         n10413Par_Var = T010J5_n10413Par_Var[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10413Par_Var", A10413Par_Var);
         A10551Par_NVar = T010J5_A10551Par_NVar[0] ;
         n10551Par_NVar = T010J5_n10551Par_NVar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10551Par_NVar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10551Par_NVar), 4, 0));
         A10552Par_NVarT = T010J5_A10552Par_NVarT[0] ;
         n10552Par_NVarT = T010J5_n10552Par_NVarT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10552Par_NVarT", A10552Par_NVarT);
         zm10J1110( -3) ;
      }
      pr_default.close(3);
      onLoadActions10J1110( ) ;
   }

   public void onLoadActions10J1110( )
   {
   }

   public void checkExtendedTable10J1110( )
   {
      nIsDirty_1110 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T010J4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T010J4_A407EmprNom[0] ;
      n407EmprNom = T010J4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
   }

   public void closeExtendedTableCursors10J1110( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_4( String A396EmprCod )
   {
      /* Using cursor T010J6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T010J6_A407EmprNom[0] ;
      n407EmprNom = T010J6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void getKey10J1110( )
   {
      /* Using cursor T010J7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Short.valueOf(A7949Par_Art)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1110 = (short)(1) ;
      }
      else
      {
         RcdFound1110 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T010J3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A7949Par_Art)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm10J1110( 3) ;
         RcdFound1110 = (short)(1) ;
         A7949Par_Art = T010J3_A7949Par_Art[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7949Par_Art", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7949Par_Art), 4, 0));
         A7950Par_Dsc = T010J3_A7950Par_Dsc[0] ;
         n7950Par_Dsc = T010J3_n7950Par_Dsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7950Par_Dsc", A7950Par_Dsc);
         A7951Par_Sec = T010J3_A7951Par_Sec[0] ;
         n7951Par_Sec = T010J3_n7951Par_Sec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7951Par_Sec", A7951Par_Sec);
         A10413Par_Var = T010J3_A10413Par_Var[0] ;
         n10413Par_Var = T010J3_n10413Par_Var[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10413Par_Var", A10413Par_Var);
         A10551Par_NVar = T010J3_A10551Par_NVar[0] ;
         n10551Par_NVar = T010J3_n10551Par_NVar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10551Par_NVar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10551Par_NVar), 4, 0));
         A10552Par_NVarT = T010J3_A10552Par_NVarT[0] ;
         n10552Par_NVarT = T010J3_n10552Par_NVarT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10552Par_NVarT", A10552Par_NVarT);
         A396EmprCod = T010J3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z7949Par_Art = A7949Par_Art ;
         sMode1110 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load10J1110( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1110 = (short)(0) ;
            initializeNonKey10J1110( ) ;
         }
         Gx_mode = sMode1110 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1110 = (short)(0) ;
         initializeNonKey10J1110( ) ;
         sMode1110 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1110 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey10J1110( ) ;
      if ( RcdFound1110 == 0 )
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
      RcdFound1110 = (short)(0) ;
      /* Using cursor T010J8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A396EmprCod, Short.valueOf(A7949Par_Art)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T010J8_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T010J8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010J8_A7949Par_Art[0] < A7949Par_Art ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T010J8_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T010J8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010J8_A7949Par_Art[0] > A7949Par_Art ) ) )
         {
            A396EmprCod = T010J8_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A7949Par_Art = T010J8_A7949Par_Art[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7949Par_Art", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7949Par_Art), 4, 0));
            RcdFound1110 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1110 = (short)(0) ;
      /* Using cursor T010J9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A396EmprCod, Short.valueOf(A7949Par_Art)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T010J9_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T010J9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010J9_A7949Par_Art[0] > A7949Par_Art ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T010J9_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T010J9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010J9_A7949Par_Art[0] < A7949Par_Art ) ) )
         {
            A396EmprCod = T010J9_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A7949Par_Art = T010J9_A7949Par_Art[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7949Par_Art", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7949Par_Art), 4, 0));
            RcdFound1110 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey10J1110( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPar_Art_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert10J1110( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1110 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7949Par_Art != Z7949Par_Art ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A7949Par_Art = Z7949Par_Art ;
               httpContext.ajax_rsp_assign_attri("", false, "A7949Par_Art", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7949Par_Art), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPar_Art_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update10J1110( ) ;
               GX_FocusControl = edtPar_Art_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7949Par_Art != Z7949Par_Art ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtPar_Art_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert10J1110( ) ;
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
                  GX_FocusControl = edtPar_Art_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert10J1110( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7949Par_Art != Z7949Par_Art ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7949Par_Art = Z7949Par_Art ;
         httpContext.ajax_rsp_assign_attri("", false, "A7949Par_Art", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7949Par_Art), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPar_Art_Internalname ;
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
      getKey10J1110( ) ;
      if ( RcdFound1110 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7949Par_Art != Z7949Par_Art ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A7949Par_Art = Z7949Par_Art ;
            httpContext.ajax_rsp_assign_attri("", false, "A7949Par_Art", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7949Par_Art), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7949Par_Art != Z7949Par_Art ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tartpar");
      GX_FocusControl = edtPar_Dsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_10J0( ) ;
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
      if ( RcdFound1110 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPar_Dsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart10J1110( ) ;
      if ( RcdFound1110 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPar_Dsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd10J1110( ) ;
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
      if ( RcdFound1110 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPar_Dsc_Internalname ;
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
      if ( RcdFound1110 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPar_Dsc_Internalname ;
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
      scanStart10J1110( ) ;
      if ( RcdFound1110 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1110 != 0 )
         {
            scanNext10J1110( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPar_Dsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd10J1110( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency10J1110( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T010J2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A7949Par_Art)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTPAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z7950Par_Dsc, T010J2_A7950Par_Dsc[0]) != 0 ) || ( GXutil.strcmp(Z7951Par_Sec, T010J2_A7951Par_Sec[0]) != 0 ) || ( GXutil.strcmp(Z10413Par_Var, T010J2_A10413Par_Var[0]) != 0 ) || ( Z10551Par_NVar != T010J2_A10551Par_NVar[0] ) || ( GXutil.strcmp(Z10552Par_NVarT, T010J2_A10552Par_NVarT[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z7950Par_Dsc, T010J2_A7950Par_Dsc[0]) != 0 )
            {
               GXutil.writeLogln("tartpar:[seudo value changed for attri]"+"Par_Dsc");
               GXutil.writeLogRaw("Old: ",Z7950Par_Dsc);
               GXutil.writeLogRaw("Current: ",T010J2_A7950Par_Dsc[0]);
            }
            if ( GXutil.strcmp(Z7951Par_Sec, T010J2_A7951Par_Sec[0]) != 0 )
            {
               GXutil.writeLogln("tartpar:[seudo value changed for attri]"+"Par_Sec");
               GXutil.writeLogRaw("Old: ",Z7951Par_Sec);
               GXutil.writeLogRaw("Current: ",T010J2_A7951Par_Sec[0]);
            }
            if ( GXutil.strcmp(Z10413Par_Var, T010J2_A10413Par_Var[0]) != 0 )
            {
               GXutil.writeLogln("tartpar:[seudo value changed for attri]"+"Par_Var");
               GXutil.writeLogRaw("Old: ",Z10413Par_Var);
               GXutil.writeLogRaw("Current: ",T010J2_A10413Par_Var[0]);
            }
            if ( Z10551Par_NVar != T010J2_A10551Par_NVar[0] )
            {
               GXutil.writeLogln("tartpar:[seudo value changed for attri]"+"Par_NVar");
               GXutil.writeLogRaw("Old: ",Z10551Par_NVar);
               GXutil.writeLogRaw("Current: ",T010J2_A10551Par_NVar[0]);
            }
            if ( GXutil.strcmp(Z10552Par_NVarT, T010J2_A10552Par_NVarT[0]) != 0 )
            {
               GXutil.writeLogln("tartpar:[seudo value changed for attri]"+"Par_NVarT");
               GXutil.writeLogRaw("Old: ",Z10552Par_NVarT);
               GXutil.writeLogRaw("Current: ",T010J2_A10552Par_NVarT[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPARTPAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert10J1110( )
   {
      beforeValidate10J1110( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10J1110( ) ;
      }
      if ( AnyError == 0 )
      {
         zm10J1110( 0) ;
         checkOptimisticConcurrency10J1110( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10J1110( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert10J1110( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010J10 */
                  pr_default.execute(8, new Object[] {Short.valueOf(A7949Par_Art), Boolean.valueOf(n7950Par_Dsc), A7950Par_Dsc, Boolean.valueOf(n7951Par_Sec), A7951Par_Sec, Boolean.valueOf(n10413Par_Var), A10413Par_Var, Boolean.valueOf(n10551Par_NVar), Short.valueOf(A10551Par_NVar), Boolean.valueOf(n10552Par_NVarT), A10552Par_NVarT, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTPAR");
                  if ( (pr_default.getStatus(8) == 1) )
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
                        resetCaption10J0( ) ;
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
            load10J1110( ) ;
         }
         endLevel10J1110( ) ;
      }
      closeExtendedTableCursors10J1110( ) ;
   }

   public void update10J1110( )
   {
      beforeValidate10J1110( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10J1110( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10J1110( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10J1110( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate10J1110( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010J11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n7950Par_Dsc), A7950Par_Dsc, Boolean.valueOf(n7951Par_Sec), A7951Par_Sec, Boolean.valueOf(n10413Par_Var), A10413Par_Var, Boolean.valueOf(n10551Par_NVar), Short.valueOf(A10551Par_NVar), Boolean.valueOf(n10552Par_NVarT), A10552Par_NVarT, A396EmprCod, Short.valueOf(A7949Par_Art)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTPAR");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTPAR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate10J1110( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption10J0( ) ;
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
         endLevel10J1110( ) ;
      }
      closeExtendedTableCursors10J1110( ) ;
   }

   public void deferredUpdate10J1110( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate10J1110( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10J1110( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls10J1110( ) ;
         afterConfirm10J1110( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete10J1110( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T010J12 */
               pr_default.execute(10, new Object[] {A396EmprCod, Short.valueOf(A7949Par_Art)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTPAR");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1110 == 0 )
                     {
                        initAll10J1110( ) ;
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
                     resetCaption10J0( ) ;
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
      sMode1110 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel10J1110( ) ;
      Gx_mode = sMode1110 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls10J1110( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T010J13 */
         pr_default.execute(11, new Object[] {A396EmprCod});
         A407EmprNom = T010J13_A407EmprNom[0] ;
         n407EmprNom = T010J13_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(11);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T010J14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Short.valueOf(A7949Par_Art)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTTEJ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
      }
   }

   public void endLevel10J1110( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete10J1110( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tartpar");
         if ( AnyError == 0 )
         {
            confirmValues10J0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tartpar");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart10J1110( )
   {
      /* Using cursor T010J15 */
      pr_default.execute(13);
      RcdFound1110 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1110 = (short)(1) ;
         A396EmprCod = T010J15_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7949Par_Art = T010J15_A7949Par_Art[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7949Par_Art", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7949Par_Art), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext10J1110( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound1110 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1110 = (short)(1) ;
         A396EmprCod = T010J15_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7949Par_Art = T010J15_A7949Par_Art[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7949Par_Art", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7949Par_Art), 4, 0));
      }
   }

   public void scanEnd10J1110( )
   {
      pr_default.close(13);
   }

   public void afterConfirm10J1110( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert10J1110( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate10J1110( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete10J1110( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete10J1110( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate10J1110( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes10J1110( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtPar_Art_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_Art_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_Art_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPar_Dsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_Dsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_Dsc_Enabled), 5, 0), true);
      edtPar_Sec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_Sec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_Sec_Enabled), 5, 0), true);
      edtPar_Var_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_Var_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_Var_Enabled), 5, 0), true);
      edtPar_NVar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_NVar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_NVar_Enabled), 5, 0), true);
      edtPar_NVarT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPar_NVarT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPar_NVarT_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes10J1110( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues10J0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tartpar", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z7949Par_Art", GXutil.ltrim( localUtil.ntoc( Z7949Par_Art, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7950Par_Dsc", GXutil.rtrim( Z7950Par_Dsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7951Par_Sec", GXutil.rtrim( Z7951Par_Sec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10413Par_Var", GXutil.rtrim( Z10413Par_Var));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10551Par_NVar", GXutil.ltrim( localUtil.ntoc( Z10551Par_NVar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10552Par_NVarT", GXutil.rtrim( Z10552Par_NVarT));
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
      return formatLink("app.tartpar", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TARTPAR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PARAMETROS ARTICULOS", "") ;
   }

   public void initializeNonKey10J1110( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A7950Par_Dsc = "" ;
      n7950Par_Dsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7950Par_Dsc", A7950Par_Dsc);
      A7951Par_Sec = "" ;
      n7951Par_Sec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7951Par_Sec", A7951Par_Sec);
      A10413Par_Var = "" ;
      n10413Par_Var = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10413Par_Var", A10413Par_Var);
      A10551Par_NVar = (short)(0) ;
      n10551Par_NVar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10551Par_NVar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10551Par_NVar), 4, 0));
      A10552Par_NVarT = "" ;
      n10552Par_NVarT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10552Par_NVarT", A10552Par_NVarT);
      Z7950Par_Dsc = "" ;
      Z7951Par_Sec = "" ;
      Z10413Par_Var = "" ;
      Z10551Par_NVar = (short)(0) ;
      Z10552Par_NVarT = "" ;
   }

   public void initAll10J1110( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7949Par_Art = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7949Par_Art", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7949Par_Art), 4, 0));
      initializeNonKey10J1110( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241533124", true, true);
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
      httpContext.AddJavascriptSource("tartpar.js", "?20268241533124", false, true);
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
      edtPar_Art_Internalname = "PAR_ART" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtPar_Dsc_Internalname = "PAR_DSC" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtPar_Sec_Internalname = "PAR_SEC" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtPar_Var_Internalname = "PAR_VAR" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtPar_NVar_Internalname = "PAR_NVAR" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtPar_NVarT_Internalname = "PAR_NVART" ;
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
      Form.setCaption( httpContext.getMessage( "PARAMETROS ARTICULOS", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPar_NVarT_Jsonclick = "" ;
      edtPar_NVarT_Backcolor = (int)(0xFFFFFF) ;
      edtPar_NVarT_Enabled = 1 ;
      edtPar_NVar_Jsonclick = "" ;
      edtPar_NVar_Backcolor = (int)(0xFFFFFF) ;
      edtPar_NVar_Enabled = 1 ;
      edtPar_Var_Jsonclick = "" ;
      edtPar_Var_Backcolor = (int)(0xFFFFFF) ;
      edtPar_Var_Enabled = 1 ;
      edtPar_Sec_Jsonclick = "" ;
      edtPar_Sec_Backcolor = (int)(0xFFFFFF) ;
      edtPar_Sec_Enabled = 1 ;
      edtPar_Dsc_Jsonclick = "" ;
      edtPar_Dsc_Backcolor = (int)(0xFFFFFF) ;
      edtPar_Dsc_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPar_Art_Jsonclick = "" ;
      edtPar_Art_Backcolor = (int)(0xFFFFFF) ;
      edtPar_Art_Enabled = 1 ;
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
      /* Using cursor T010J13 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T010J13_A407EmprNom[0] ;
      n407EmprNom = T010J13_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(11);
      GX_FocusControl = edtPar_Dsc_Internalname ;
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T010J13 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T010J13_A407EmprNom[0] ;
      n407EmprNom = T010J13_n407EmprNom[0] ;
      pr_default.close(11);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Par_art( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7950Par_Dsc", GXutil.rtrim( A7950Par_Dsc));
      httpContext.ajax_rsp_assign_attri("", false, "A7951Par_Sec", GXutil.rtrim( A7951Par_Sec));
      httpContext.ajax_rsp_assign_attri("", false, "A10413Par_Var", GXutil.rtrim( A10413Par_Var));
      httpContext.ajax_rsp_assign_attri("", false, "A10551Par_NVar", GXutil.ltrim( localUtil.ntoc( A10551Par_NVar, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10552Par_NVarT", GXutil.rtrim( A10552Par_NVarT));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7949Par_Art", GXutil.ltrim( localUtil.ntoc( Z7949Par_Art, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7950Par_Dsc", GXutil.rtrim( Z7950Par_Dsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7951Par_Sec", GXutil.rtrim( Z7951Par_Sec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10413Par_Var", GXutil.rtrim( Z10413Par_Var));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10551Par_NVar", GXutil.ltrim( localUtil.ntoc( Z10551Par_NVar, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10552Par_NVarT", GXutil.rtrim( Z10552Par_NVarT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_PAR_ART","{handler:'valid_Par_art',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7949Par_Art',fld:'PAR_ART',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("VALID_PAR_ART",",oparms:[{av:'A7950Par_Dsc',fld:'PAR_DSC',pic:''},{av:'A7951Par_Sec',fld:'PAR_SEC',pic:''},{av:'A10413Par_Var',fld:'PAR_VAR',pic:''},{av:'A10551Par_NVar',fld:'PAR_NVAR',pic:'ZZZ9'},{av:'A10552Par_NVarT',fld:'PAR_NVART',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z7949Par_Art'},{av:'Z7950Par_Dsc'},{av:'Z7951Par_Sec'},{av:'Z10413Par_Var'},{av:'Z10551Par_NVar'},{av:'Z10552Par_NVarT'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      Z7950Par_Dsc = "" ;
      Z7951Par_Sec = "" ;
      Z10413Par_Var = "" ;
      Z10552Par_NVarT = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      A407EmprNom = "" ;
      lblTextblock4_Jsonclick = "" ;
      A7950Par_Dsc = "" ;
      lblTextblock5_Jsonclick = "" ;
      A7951Par_Sec = "" ;
      lblTextblock6_Jsonclick = "" ;
      A10413Par_Var = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A10552Par_NVarT = "" ;
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
      Z407EmprNom = "" ;
      T010J5_A7949Par_Art = new short[1] ;
      T010J5_A407EmprNom = new String[] {""} ;
      T010J5_n407EmprNom = new boolean[] {false} ;
      T010J5_A7950Par_Dsc = new String[] {""} ;
      T010J5_n7950Par_Dsc = new boolean[] {false} ;
      T010J5_A7951Par_Sec = new String[] {""} ;
      T010J5_n7951Par_Sec = new boolean[] {false} ;
      T010J5_A10413Par_Var = new String[] {""} ;
      T010J5_n10413Par_Var = new boolean[] {false} ;
      T010J5_A10551Par_NVar = new short[1] ;
      T010J5_n10551Par_NVar = new boolean[] {false} ;
      T010J5_A10552Par_NVarT = new String[] {""} ;
      T010J5_n10552Par_NVarT = new boolean[] {false} ;
      T010J5_A396EmprCod = new String[] {""} ;
      T010J4_A407EmprNom = new String[] {""} ;
      T010J4_n407EmprNom = new boolean[] {false} ;
      T010J6_A407EmprNom = new String[] {""} ;
      T010J6_n407EmprNom = new boolean[] {false} ;
      T010J7_A396EmprCod = new String[] {""} ;
      T010J7_A7949Par_Art = new short[1] ;
      T010J3_A7949Par_Art = new short[1] ;
      T010J3_A7950Par_Dsc = new String[] {""} ;
      T010J3_n7950Par_Dsc = new boolean[] {false} ;
      T010J3_A7951Par_Sec = new String[] {""} ;
      T010J3_n7951Par_Sec = new boolean[] {false} ;
      T010J3_A10413Par_Var = new String[] {""} ;
      T010J3_n10413Par_Var = new boolean[] {false} ;
      T010J3_A10551Par_NVar = new short[1] ;
      T010J3_n10551Par_NVar = new boolean[] {false} ;
      T010J3_A10552Par_NVarT = new String[] {""} ;
      T010J3_n10552Par_NVarT = new boolean[] {false} ;
      T010J3_A396EmprCod = new String[] {""} ;
      sMode1110 = "" ;
      T010J8_A396EmprCod = new String[] {""} ;
      T010J8_A7949Par_Art = new short[1] ;
      T010J9_A396EmprCod = new String[] {""} ;
      T010J9_A7949Par_Art = new short[1] ;
      T010J2_A7949Par_Art = new short[1] ;
      T010J2_A7950Par_Dsc = new String[] {""} ;
      T010J2_n7950Par_Dsc = new boolean[] {false} ;
      T010J2_A7951Par_Sec = new String[] {""} ;
      T010J2_n7951Par_Sec = new boolean[] {false} ;
      T010J2_A10413Par_Var = new String[] {""} ;
      T010J2_n10413Par_Var = new boolean[] {false} ;
      T010J2_A10551Par_NVar = new short[1] ;
      T010J2_n10551Par_NVar = new boolean[] {false} ;
      T010J2_A10552Par_NVarT = new String[] {""} ;
      T010J2_n10552Par_NVarT = new boolean[] {false} ;
      T010J2_A396EmprCod = new String[] {""} ;
      T010J13_A407EmprNom = new String[] {""} ;
      T010J13_n407EmprNom = new boolean[] {false} ;
      T010J14_A396EmprCod = new String[] {""} ;
      T010J14_A252CliCod = new int[1] ;
      T010J14_A65ArtCod = new String[] {""} ;
      T010J14_A7949Par_Art = new short[1] ;
      T010J15_A396EmprCod = new String[] {""} ;
      T010J15_A7949Par_Art = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ396EmprCod = "" ;
      ZZ7950Par_Dsc = "" ;
      ZZ7951Par_Sec = "" ;
      ZZ10413Par_Var = "" ;
      ZZ10552Par_NVarT = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tartpar__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tartpar__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tartpar__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tartpar__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tartpar__default(),
         new Object[] {
             new Object[] {
            T010J2_A7949Par_Art, T010J2_A7950Par_Dsc, T010J2_n7950Par_Dsc, T010J2_A7951Par_Sec, T010J2_n7951Par_Sec, T010J2_A10413Par_Var, T010J2_n10413Par_Var, T010J2_A10551Par_NVar, T010J2_n10551Par_NVar, T010J2_A10552Par_NVarT,
            T010J2_n10552Par_NVarT, T010J2_A396EmprCod
            }
            , new Object[] {
            T010J3_A7949Par_Art, T010J3_A7950Par_Dsc, T010J3_n7950Par_Dsc, T010J3_A7951Par_Sec, T010J3_n7951Par_Sec, T010J3_A10413Par_Var, T010J3_n10413Par_Var, T010J3_A10551Par_NVar, T010J3_n10551Par_NVar, T010J3_A10552Par_NVarT,
            T010J3_n10552Par_NVarT, T010J3_A396EmprCod
            }
            , new Object[] {
            T010J4_A407EmprNom, T010J4_n407EmprNom
            }
            , new Object[] {
            T010J5_A7949Par_Art, T010J5_A407EmprNom, T010J5_n407EmprNom, T010J5_A7950Par_Dsc, T010J5_n7950Par_Dsc, T010J5_A7951Par_Sec, T010J5_n7951Par_Sec, T010J5_A10413Par_Var, T010J5_n10413Par_Var, T010J5_A10551Par_NVar,
            T010J5_n10551Par_NVar, T010J5_A10552Par_NVarT, T010J5_n10552Par_NVarT, T010J5_A396EmprCod
            }
            , new Object[] {
            T010J6_A407EmprNom, T010J6_n407EmprNom
            }
            , new Object[] {
            T010J7_A396EmprCod, T010J7_A7949Par_Art
            }
            , new Object[] {
            T010J8_A396EmprCod, T010J8_A7949Par_Art
            }
            , new Object[] {
            T010J9_A396EmprCod, T010J9_A7949Par_Art
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T010J13_A407EmprNom, T010J13_n407EmprNom
            }
            , new Object[] {
            T010J14_A396EmprCod, T010J14_A252CliCod, T010J14_A65ArtCod, T010J14_A7949Par_Art
            }
            , new Object[] {
            T010J15_A396EmprCod, T010J15_A7949Par_Art
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z7949Par_Art ;
   private short Z10551Par_NVar ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A7949Par_Art ;
   private short A10551Par_NVar ;
   private short RcdFound1110 ;
   private short nIsDirty_1110 ;
   private short ZZ7949Par_Art ;
   private short ZZ10551Par_NVar ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtPar_Art_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtPar_Dsc_Enabled ;
   private int edtPar_Sec_Enabled ;
   private int edtPar_Var_Enabled ;
   private int edtPar_NVar_Enabled ;
   private int edtPar_NVarT_Enabled ;
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
   private int edtPar_NVarT_Backcolor ;
   private int edtPar_NVar_Backcolor ;
   private int edtPar_Var_Backcolor ;
   private int edtPar_Sec_Backcolor ;
   private int edtPar_Dsc_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtPar_Art_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z7950Par_Dsc ;
   private String Z7951Par_Sec ;
   private String Z10413Par_Var ;
   private String Z10552Par_NVarT ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPar_Art_Internalname ;
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
   private String edtPar_Art_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtPar_Dsc_Internalname ;
   private String A7950Par_Dsc ;
   private String edtPar_Dsc_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtPar_Sec_Internalname ;
   private String A7951Par_Sec ;
   private String edtPar_Sec_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtPar_Var_Internalname ;
   private String A10413Par_Var ;
   private String edtPar_Var_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtPar_NVar_Internalname ;
   private String edtPar_NVar_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtPar_NVarT_Internalname ;
   private String A10552Par_NVarT ;
   private String edtPar_NVarT_Jsonclick ;
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
   private String Z407EmprNom ;
   private String sMode1110 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ7950Par_Dsc ;
   private String ZZ7951Par_Sec ;
   private String ZZ10413Par_Var ;
   private String ZZ10552Par_NVarT ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n7950Par_Dsc ;
   private boolean n7951Par_Sec ;
   private boolean n10413Par_Var ;
   private boolean n10551Par_NVar ;
   private boolean n10552Par_NVarT ;
   private IDataStoreProvider pr_default ;
   private short[] T010J5_A7949Par_Art ;
   private String[] T010J5_A407EmprNom ;
   private boolean[] T010J5_n407EmprNom ;
   private String[] T010J5_A7950Par_Dsc ;
   private boolean[] T010J5_n7950Par_Dsc ;
   private String[] T010J5_A7951Par_Sec ;
   private boolean[] T010J5_n7951Par_Sec ;
   private String[] T010J5_A10413Par_Var ;
   private boolean[] T010J5_n10413Par_Var ;
   private short[] T010J5_A10551Par_NVar ;
   private boolean[] T010J5_n10551Par_NVar ;
   private String[] T010J5_A10552Par_NVarT ;
   private boolean[] T010J5_n10552Par_NVarT ;
   private String[] T010J5_A396EmprCod ;
   private String[] T010J4_A407EmprNom ;
   private boolean[] T010J4_n407EmprNom ;
   private String[] T010J6_A407EmprNom ;
   private boolean[] T010J6_n407EmprNom ;
   private String[] T010J7_A396EmprCod ;
   private short[] T010J7_A7949Par_Art ;
   private short[] T010J3_A7949Par_Art ;
   private String[] T010J3_A7950Par_Dsc ;
   private boolean[] T010J3_n7950Par_Dsc ;
   private String[] T010J3_A7951Par_Sec ;
   private boolean[] T010J3_n7951Par_Sec ;
   private String[] T010J3_A10413Par_Var ;
   private boolean[] T010J3_n10413Par_Var ;
   private short[] T010J3_A10551Par_NVar ;
   private boolean[] T010J3_n10551Par_NVar ;
   private String[] T010J3_A10552Par_NVarT ;
   private boolean[] T010J3_n10552Par_NVarT ;
   private String[] T010J3_A396EmprCod ;
   private String[] T010J8_A396EmprCod ;
   private short[] T010J8_A7949Par_Art ;
   private String[] T010J9_A396EmprCod ;
   private short[] T010J9_A7949Par_Art ;
   private short[] T010J2_A7949Par_Art ;
   private String[] T010J2_A7950Par_Dsc ;
   private boolean[] T010J2_n7950Par_Dsc ;
   private String[] T010J2_A7951Par_Sec ;
   private boolean[] T010J2_n7951Par_Sec ;
   private String[] T010J2_A10413Par_Var ;
   private boolean[] T010J2_n10413Par_Var ;
   private short[] T010J2_A10551Par_NVar ;
   private boolean[] T010J2_n10551Par_NVar ;
   private String[] T010J2_A10552Par_NVarT ;
   private boolean[] T010J2_n10552Par_NVarT ;
   private String[] T010J2_A396EmprCod ;
   private String[] T010J13_A407EmprNom ;
   private boolean[] T010J13_n407EmprNom ;
   private String[] T010J14_A396EmprCod ;
   private int[] T010J14_A252CliCod ;
   private String[] T010J14_A65ArtCod ;
   private short[] T010J14_A7949Par_Art ;
   private String[] T010J15_A396EmprCod ;
   private short[] T010J15_A7949Par_Art ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tartpar__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tartpar__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tartpar__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tartpar__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tartpar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T010J2", "SELECT Par_Art, Par_Dsc, Par_Sec, Par_Var, Par_NVar, Par_NVarT, EmprCod FROM TXPARTPAR WHERE EmprCod = ? AND Par_Art = ?  FOR UPDATE OF Par_Dsc, Par_Sec, Par_Var, Par_NVar, Par_NVarT NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010J3", "SELECT Par_Art, Par_Dsc, Par_Sec, Par_Var, Par_NVar, Par_NVarT, EmprCod FROM TXPARTPAR WHERE EmprCod = ? AND Par_Art = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010J4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010J5", "SELECT /*+ FIRST_ROWS(100) */ TM1.Par_Art, T2.EmprNom, TM1.Par_Dsc, TM1.Par_Sec, TM1.Par_Var, TM1.Par_NVar, TM1.Par_NVarT, TM1.EmprCod FROM (TXPARTPAR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Par_Art = ? ORDER BY TM1.EmprCod, TM1.Par_Art ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010J6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010J7", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Par_Art FROM TXPARTPAR WHERE EmprCod = ? AND Par_Art = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010J8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Par_Art FROM TXPARTPAR WHERE ( EmprCod > ? or EmprCod = ? and Par_Art > ?) ORDER BY EmprCod, Par_Art) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010J9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Par_Art FROM TXPARTPAR WHERE ( EmprCod < ? or EmprCod = ? and Par_Art < ?) ORDER BY EmprCod DESC, Par_Art DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T010J10", "INSERT INTO TXPARTPAR(Par_Art, Par_Dsc, Par_Sec, Par_Var, Par_NVar, Par_NVarT, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPARTPAR")
         ,new UpdateCursor("T010J11", "UPDATE TXPARTPAR SET Par_Dsc=?, Par_Sec=?, Par_Var=?, Par_NVar=?, Par_NVarT=?  WHERE EmprCod = ? AND Par_Art = ?", GX_NOMASK, "TXPARTPAR")
         ,new UpdateCursor("T010J12", "DELETE FROM TXPARTPAR  WHERE EmprCod = ? AND Par_Art = ?", GX_NOMASK, "TXPARTPAR")
         ,new ForEachCursor("T010J13", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010J14", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Par_Art FROM TXPARTTEJ WHERE EmprCod = ? AND Par_Art = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010J15", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Par_Art FROM TXPARTPAR ORDER BY EmprCod, Par_Art ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 80);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 80);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 80);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 15);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 80);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 10);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 15);
               }
               stmt.setString(7, (String)parms[11], 3);
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 80);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 10);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 15);
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setShort(7, ((Number) parms[11]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

