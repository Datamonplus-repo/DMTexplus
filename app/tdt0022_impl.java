package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdt0022_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A774ProNumLin = (short)(GXutil.lval( httpContext.GetPar( "ProNumLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
         A7897Dtp_Ordl = (short)(GXutil.lval( httpContext.GetPar( "Dtp_Ordl"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7897Dtp_Ordl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7897Dtp_Ordl), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A758ProCod, A774ProNumLin, A7897Dtp_Ordl) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_2") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1664ParFasCod = (short)(GXutil.lval( httpContext.GetPar( "ParFasCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod, A1664ParFasCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PARAMETROS PROCESOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tdt0022_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdt0022_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdt0022_impl.class ));
   }

   public tdt0022_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT0022.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT0022.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT0022.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT0022.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDT0022.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT0022.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDT0022.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT0022.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDT0022.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Numero Linea Proceso", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT0022.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProNumLin_Internalname, GXutil.ltrim( localUtil.ntoc( A774ProNumLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProNumLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A774ProNumLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A774ProNumLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProNumLin_Jsonclick, 0, "", "", "", "", "", 1, edtProNumLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDT0022.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Orden Proceso Q DT", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT0022.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDtp_Ordl_Internalname, GXutil.ltrim( localUtil.ntoc( A7897Dtp_Ordl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDtp_Ordl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7897Dtp_Ordl), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7897Dtp_Ordl), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDtp_Ordl_Jsonclick, 0, "", "", "", "", "", 1, edtDtp_Ordl_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDT0022.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Parametro Fase", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT0022.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParFasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtParFasCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1664ParFasCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1664ParFasCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParFasCod_Jsonclick, 0, "", "", "", "", "", 1, edtParFasCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDT0022.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT0022.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Valor", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT0022.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDtp_Valpar_Internalname, GXutil.rtrim( A11535Dtp_Valpar), GXutil.rtrim( localUtil.format( A11535Dtp_Valpar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDtp_Valpar_Jsonclick, 0, "", "", "", "", "", 1, edtDtp_Valpar_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDT0022.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Texto", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT0022.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtDtp_ParTxt_Internalname, A11536Dtp_ParTxt, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", (short)(0), 1, edtDtp_ParTxt_Enabled, 0, 80, "chr", 5, "row", (byte)(0), StyleString, ClassString, "", "", "400", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TDT0022.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT0022.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT0022.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT0022.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT0022.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDT0022.htm");
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
         Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
         Z774ProNumLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z774ProNumLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7897Dtp_Ordl = (short)(localUtil.ctol( httpContext.cgiGet( "Z7897Dtp_Ordl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1664ParFasCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z1664ParFasCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11535Dtp_Valpar = httpContext.cgiGet( "Z11535Dtp_Valpar") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProNumLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProNumLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRONUMLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProNumLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A774ProNumLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
         }
         else
         {
            A774ProNumLin = (short)(localUtil.ctol( httpContext.cgiGet( edtProNumLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDtp_Ordl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDtp_Ordl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DTP_ORDL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDtp_Ordl_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7897Dtp_Ordl = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7897Dtp_Ordl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7897Dtp_Ordl), 4, 0));
         }
         else
         {
            A7897Dtp_Ordl = (short)(localUtil.ctol( httpContext.cgiGet( edtDtp_Ordl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7897Dtp_Ordl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7897Dtp_Ordl), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParFasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParFasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARFASCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtParFasCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1664ParFasCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
         }
         else
         {
            A1664ParFasCod = (short)(localUtil.ctol( httpContext.cgiGet( edtParFasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
         }
         A11535Dtp_Valpar = httpContext.cgiGet( edtDtp_Valpar_Internalname) ;
         n11535Dtp_Valpar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11535Dtp_Valpar", A11535Dtp_Valpar);
         A11536Dtp_ParTxt = httpContext.cgiGet( edtDtp_ParTxt_Internalname) ;
         n11536Dtp_ParTxt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11536Dtp_ParTxt", A11536Dtp_ParTxt);
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
            A758ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A774ProNumLin = (short)(GXutil.lval( httpContext.GetPar( "ProNumLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
            A7897Dtp_Ordl = (short)(GXutil.lval( httpContext.GetPar( "Dtp_Ordl"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7897Dtp_Ordl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7897Dtp_Ordl), 4, 0));
            A1664ParFasCod = (short)(GXutil.lval( httpContext.GetPar( "ParFasCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
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
            initAll1CC1537( ) ;
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
      disableAttributes1CC1537( ) ;
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

   public void confirm_1CC0( )
   {
      beforeValidate1CC1537( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1CC1537( ) ;
         }
         else
         {
            checkExtendedTable1CC1537( ) ;
            if ( AnyError == 0 )
            {
               zm1CC1537( 2) ;
               zm1CC1537( 3) ;
            }
            closeExtendedTableCursors1CC1537( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1CC0( ) ;
      }
   }

   public void resetCaption1CC0( )
   {
   }

   public void zm1CC1537( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11535Dtp_Valpar = T01CC3_A11535Dtp_Valpar[0] ;
         }
         else
         {
            Z11535Dtp_Valpar = A11535Dtp_Valpar ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z11535Dtp_Valpar = A11535Dtp_Valpar ;
         Z11536Dtp_ParTxt = A11536Dtp_ParTxt ;
         Z396EmprCod = A396EmprCod ;
         Z758ProCod = A758ProCod ;
         Z774ProNumLin = A774ProNumLin ;
         Z1664ParFasCod = A1664ParFasCod ;
         Z7897Dtp_Ordl = A7897Dtp_Ordl ;
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

   public void load1CC1537( )
   {
      /* Using cursor T01CC6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl), Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1537 = (short)(1) ;
         A11536Dtp_ParTxt = T01CC6_A11536Dtp_ParTxt[0] ;
         n11536Dtp_ParTxt = T01CC6_n11536Dtp_ParTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11536Dtp_ParTxt", A11536Dtp_ParTxt);
         A11535Dtp_Valpar = T01CC6_A11535Dtp_Valpar[0] ;
         n11535Dtp_Valpar = T01CC6_n11535Dtp_Valpar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11535Dtp_Valpar", A11535Dtp_Valpar);
         zm1CC1537( -1) ;
      }
      pr_default.close(4);
      onLoadActions1CC1537( ) ;
   }

   public void onLoadActions1CC1537( )
   {
   }

   public void checkExtendedTable1CC1537( )
   {
      nIsDirty_1537 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01CC5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DT002", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DTP_ORDL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
      /* Using cursor T01CC4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARFASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1CC1537( )
   {
      pr_default.close(3);
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         String A758ProCod ,
                         short A774ProNumLin ,
                         short A7897Dtp_Ordl )
   {
      /* Using cursor T01CC7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DT002", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DTP_ORDL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxload_2( String A396EmprCod ,
                         short A1664ParFasCod )
   {
      /* Using cursor T01CC8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARFASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1CC1537( )
   {
      /* Using cursor T01CC9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl), Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1537 = (short)(1) ;
      }
      else
      {
         RcdFound1537 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01CC3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl), Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1CC1537( 1) ;
         RcdFound1537 = (short)(1) ;
         A11536Dtp_ParTxt = T01CC3_A11536Dtp_ParTxt[0] ;
         n11536Dtp_ParTxt = T01CC3_n11536Dtp_ParTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11536Dtp_ParTxt", A11536Dtp_ParTxt);
         A11535Dtp_Valpar = T01CC3_A11535Dtp_Valpar[0] ;
         n11535Dtp_Valpar = T01CC3_n11535Dtp_Valpar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11535Dtp_Valpar", A11535Dtp_Valpar);
         A396EmprCod = T01CC3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = T01CC3_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A774ProNumLin = T01CC3_A774ProNumLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
         A1664ParFasCod = T01CC3_A1664ParFasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
         A7897Dtp_Ordl = T01CC3_A7897Dtp_Ordl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7897Dtp_Ordl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7897Dtp_Ordl), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z758ProCod = A758ProCod ;
         Z774ProNumLin = A774ProNumLin ;
         Z7897Dtp_Ordl = A7897Dtp_Ordl ;
         Z1664ParFasCod = A1664ParFasCod ;
         sMode1537 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1CC1537( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1537 = (short)(0) ;
            initializeNonKey1CC1537( ) ;
         }
         Gx_mode = sMode1537 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1537 = (short)(0) ;
         initializeNonKey1CC1537( ) ;
         sMode1537 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1537 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1CC1537( ) ;
      if ( RcdFound1537 == 0 )
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
      RcdFound1537 = (short)(0) ;
      /* Using cursor T01CC10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, A758ProCod, A758ProCod, A396EmprCod, Short.valueOf(A774ProNumLin), Short.valueOf(A774ProNumLin), A758ProCod, A396EmprCod, Short.valueOf(A7897Dtp_Ordl), Short.valueOf(A7897Dtp_Ordl), Short.valueOf(A774ProNumLin), A758ProCod, A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01CC10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01CC10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01CC10_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T01CC10_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01CC10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01CC10_A774ProNumLin[0] < A774ProNumLin ) || ( T01CC10_A774ProNumLin[0] == A774ProNumLin ) && ( GXutil.strcmp(T01CC10_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01CC10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01CC10_A7897Dtp_Ordl[0] < A7897Dtp_Ordl ) || ( T01CC10_A7897Dtp_Ordl[0] == A7897Dtp_Ordl ) && ( T01CC10_A774ProNumLin[0] == A774ProNumLin ) && ( GXutil.strcmp(T01CC10_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01CC10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01CC10_A1664ParFasCod[0] < A1664ParFasCod ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01CC10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01CC10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01CC10_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T01CC10_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01CC10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01CC10_A774ProNumLin[0] > A774ProNumLin ) || ( T01CC10_A774ProNumLin[0] == A774ProNumLin ) && ( GXutil.strcmp(T01CC10_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01CC10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01CC10_A7897Dtp_Ordl[0] > A7897Dtp_Ordl ) || ( T01CC10_A7897Dtp_Ordl[0] == A7897Dtp_Ordl ) && ( T01CC10_A774ProNumLin[0] == A774ProNumLin ) && ( GXutil.strcmp(T01CC10_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01CC10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01CC10_A1664ParFasCod[0] > A1664ParFasCod ) ) )
         {
            A396EmprCod = T01CC10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A758ProCod = T01CC10_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A774ProNumLin = T01CC10_A774ProNumLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
            A7897Dtp_Ordl = T01CC10_A7897Dtp_Ordl[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7897Dtp_Ordl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7897Dtp_Ordl), 4, 0));
            A1664ParFasCod = T01CC10_A1664ParFasCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
            RcdFound1537 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1537 = (short)(0) ;
      /* Using cursor T01CC11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, A758ProCod, A758ProCod, A396EmprCod, Short.valueOf(A774ProNumLin), Short.valueOf(A774ProNumLin), A758ProCod, A396EmprCod, Short.valueOf(A7897Dtp_Ordl), Short.valueOf(A7897Dtp_Ordl), Short.valueOf(A774ProNumLin), A758ProCod, A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01CC11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01CC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01CC11_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T01CC11_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01CC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01CC11_A774ProNumLin[0] > A774ProNumLin ) || ( T01CC11_A774ProNumLin[0] == A774ProNumLin ) && ( GXutil.strcmp(T01CC11_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01CC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01CC11_A7897Dtp_Ordl[0] > A7897Dtp_Ordl ) || ( T01CC11_A7897Dtp_Ordl[0] == A7897Dtp_Ordl ) && ( T01CC11_A774ProNumLin[0] == A774ProNumLin ) && ( GXutil.strcmp(T01CC11_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01CC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01CC11_A1664ParFasCod[0] > A1664ParFasCod ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01CC11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01CC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01CC11_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T01CC11_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01CC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01CC11_A774ProNumLin[0] < A774ProNumLin ) || ( T01CC11_A774ProNumLin[0] == A774ProNumLin ) && ( GXutil.strcmp(T01CC11_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01CC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01CC11_A7897Dtp_Ordl[0] < A7897Dtp_Ordl ) || ( T01CC11_A7897Dtp_Ordl[0] == A7897Dtp_Ordl ) && ( T01CC11_A774ProNumLin[0] == A774ProNumLin ) && ( GXutil.strcmp(T01CC11_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01CC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01CC11_A1664ParFasCod[0] < A1664ParFasCod ) ) )
         {
            A396EmprCod = T01CC11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A758ProCod = T01CC11_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A774ProNumLin = T01CC11_A774ProNumLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
            A7897Dtp_Ordl = T01CC11_A7897Dtp_Ordl[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7897Dtp_Ordl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7897Dtp_Ordl), 4, 0));
            A1664ParFasCod = T01CC11_A1664ParFasCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
            RcdFound1537 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1CC1537( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1CC1537( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1537 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A774ProNumLin != Z774ProNumLin ) || ( A7897Dtp_Ordl != Z7897Dtp_Ordl ) || ( A1664ParFasCod != Z1664ParFasCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A758ProCod = Z758ProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A774ProNumLin = Z774ProNumLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
               A7897Dtp_Ordl = Z7897Dtp_Ordl ;
               httpContext.ajax_rsp_assign_attri("", false, "A7897Dtp_Ordl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7897Dtp_Ordl), 4, 0));
               A1664ParFasCod = Z1664ParFasCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1CC1537( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A774ProNumLin != Z774ProNumLin ) || ( A7897Dtp_Ordl != Z7897Dtp_Ordl ) || ( A1664ParFasCod != Z1664ParFasCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1CC1537( ) ;
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
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1CC1537( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A774ProNumLin != Z774ProNumLin ) || ( A7897Dtp_Ordl != Z7897Dtp_Ordl ) || ( A1664ParFasCod != Z1664ParFasCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = Z758ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A774ProNumLin = Z774ProNumLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
         A7897Dtp_Ordl = Z7897Dtp_Ordl ;
         httpContext.ajax_rsp_assign_attri("", false, "A7897Dtp_Ordl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7897Dtp_Ordl), 4, 0));
         A1664ParFasCod = Z1664ParFasCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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
      getKey1CC1537( ) ;
      if ( RcdFound1537 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A774ProNumLin != Z774ProNumLin ) || ( A7897Dtp_Ordl != Z7897Dtp_Ordl ) || ( A1664ParFasCod != Z1664ParFasCod ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A758ProCod = Z758ProCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A774ProNumLin = Z774ProNumLin ;
            httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
            A7897Dtp_Ordl = Z7897Dtp_Ordl ;
            httpContext.ajax_rsp_assign_attri("", false, "A7897Dtp_Ordl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7897Dtp_Ordl), 4, 0));
            A1664ParFasCod = Z1664ParFasCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A774ProNumLin != Z774ProNumLin ) || ( A7897Dtp_Ordl != Z7897Dtp_Ordl ) || ( A1664ParFasCod != Z1664ParFasCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdt0022");
      GX_FocusControl = edtDtp_Valpar_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1CC0( ) ;
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
      if ( RcdFound1537 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtDtp_Valpar_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1CC1537( ) ;
      if ( RcdFound1537 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDtp_Valpar_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1CC1537( ) ;
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
      if ( RcdFound1537 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDtp_Valpar_Internalname ;
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
      if ( RcdFound1537 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDtp_Valpar_Internalname ;
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
      scanStart1CC1537( ) ;
      if ( RcdFound1537 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1537 != 0 )
         {
            scanNext1CC1537( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDtp_Valpar_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1CC1537( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1CC1537( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01CC2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl), Short.valueOf(A1664ParFasCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDT0022"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z11535Dtp_Valpar, T01CC2_A11535Dtp_Valpar[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z11535Dtp_Valpar, T01CC2_A11535Dtp_Valpar[0]) != 0 )
            {
               GXutil.writeLogln("tdt0022:[seudo value changed for attri]"+"Dtp_Valpar");
               GXutil.writeLogRaw("Old: ",Z11535Dtp_Valpar);
               GXutil.writeLogRaw("Current: ",T01CC2_A11535Dtp_Valpar[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDT0022"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1CC1537( )
   {
      beforeValidate1CC1537( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1CC1537( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1CC1537( 0) ;
         checkOptimisticConcurrency1CC1537( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1CC1537( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1CC1537( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01CC12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n11535Dtp_Valpar), A11535Dtp_Valpar, Boolean.valueOf(n11536Dtp_ParTxt), A11536Dtp_ParTxt, A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A1664ParFasCod), Short.valueOf(A7897Dtp_Ordl)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0022");
                  if ( (pr_default.getStatus(10) == 1) )
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
                        resetCaption1CC0( ) ;
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
            load1CC1537( ) ;
         }
         endLevel1CC1537( ) ;
      }
      closeExtendedTableCursors1CC1537( ) ;
   }

   public void update1CC1537( )
   {
      beforeValidate1CC1537( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1CC1537( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1CC1537( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1CC1537( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1CC1537( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01CC13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n11535Dtp_Valpar), A11535Dtp_Valpar, Boolean.valueOf(n11536Dtp_ParTxt), A11536Dtp_ParTxt, A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl), Short.valueOf(A1664ParFasCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0022");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDT0022"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1CC1537( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1CC0( ) ;
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
         endLevel1CC1537( ) ;
      }
      closeExtendedTableCursors1CC1537( ) ;
   }

   public void deferredUpdate1CC1537( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1CC1537( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1CC1537( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1CC1537( ) ;
         afterConfirm1CC1537( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1CC1537( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01CC14 */
               pr_default.execute(12, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl), Short.valueOf(A1664ParFasCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0022");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1537 == 0 )
                     {
                        initAll1CC1537( ) ;
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
                     resetCaption1CC0( ) ;
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
      sMode1537 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1CC1537( ) ;
      Gx_mode = sMode1537 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1CC1537( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1CC1537( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1CC1537( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdt0022");
         if ( AnyError == 0 )
         {
            confirmValues1CC0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdt0022");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1CC1537( )
   {
      /* Using cursor T01CC15 */
      pr_default.execute(13);
      RcdFound1537 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1537 = (short)(1) ;
         A396EmprCod = T01CC15_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = T01CC15_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A774ProNumLin = T01CC15_A774ProNumLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
         A7897Dtp_Ordl = T01CC15_A7897Dtp_Ordl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7897Dtp_Ordl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7897Dtp_Ordl), 4, 0));
         A1664ParFasCod = T01CC15_A1664ParFasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1CC1537( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound1537 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1537 = (short)(1) ;
         A396EmprCod = T01CC15_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = T01CC15_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A774ProNumLin = T01CC15_A774ProNumLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
         A7897Dtp_Ordl = T01CC15_A7897Dtp_Ordl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7897Dtp_Ordl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7897Dtp_Ordl), 4, 0));
         A1664ParFasCod = T01CC15_A1664ParFasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
      }
   }

   public void scanEnd1CC1537( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1CC1537( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1CC1537( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1CC1537( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1CC1537( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1CC1537( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1CC1537( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1CC1537( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtProNumLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProNumLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProNumLin_Enabled), 5, 0), true);
      edtDtp_Ordl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_Ordl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_Ordl_Enabled), 5, 0), true);
      edtParFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), true);
      edtDtp_Valpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_Valpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_Valpar_Enabled), 5, 0), true);
      edtDtp_ParTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_ParTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_ParTxt_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1CC1537( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1CC0( )
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
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdt0022", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z774ProNumLin", GXutil.ltrim( localUtil.ntoc( Z774ProNumLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7897Dtp_Ordl", GXutil.ltrim( localUtil.ntoc( Z7897Dtp_Ordl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1664ParFasCod", GXutil.ltrim( localUtil.ntoc( Z1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11535Dtp_Valpar", GXutil.rtrim( Z11535Dtp_Valpar));
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
      return formatLink("app.tdt0022", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TDT0022" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PARAMETROS PROCESOS", "") ;
   }

   public void initializeNonKey1CC1537( )
   {
      A11535Dtp_Valpar = "" ;
      n11535Dtp_Valpar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11535Dtp_Valpar", A11535Dtp_Valpar);
      A11536Dtp_ParTxt = "" ;
      n11536Dtp_ParTxt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11536Dtp_ParTxt", A11536Dtp_ParTxt);
      Z11535Dtp_Valpar = "" ;
   }

   public void initAll1CC1537( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A758ProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      A774ProNumLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
      A7897Dtp_Ordl = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7897Dtp_Ordl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7897Dtp_Ordl), 4, 0));
      A1664ParFasCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
      initializeNonKey1CC1537( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101631125", true, true);
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
      httpContext.AddJavascriptSource("tdt0022.js", "?20266101631125", false, true);
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
      edtProCod_Internalname = "PROCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtProNumLin_Internalname = "PRONUMLIN" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtDtp_Ordl_Internalname = "DTP_ORDL" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtParFasCod_Internalname = "PARFASCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtDtp_Valpar_Internalname = "DTP_VALPAR" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtDtp_ParTxt_Internalname = "DTP_PARTXT" ;
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
      Form.setCaption( httpContext.getMessage( "PARAMETROS PROCESOS", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtDtp_ParTxt_Backcolor = (int)(0xFFFFFF) ;
      edtDtp_ParTxt_Enabled = 1 ;
      edtDtp_Valpar_Jsonclick = "" ;
      edtDtp_Valpar_Backcolor = (int)(0xFFFFFF) ;
      edtDtp_Valpar_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtParFasCod_Jsonclick = "" ;
      edtParFasCod_Backcolor = (int)(0xFFFFFF) ;
      edtParFasCod_Enabled = 1 ;
      edtDtp_Ordl_Jsonclick = "" ;
      edtDtp_Ordl_Backcolor = (int)(0xFFFFFF) ;
      edtDtp_Ordl_Enabled = 1 ;
      edtProNumLin_Jsonclick = "" ;
      edtProNumLin_Backcolor = (int)(0xFFFFFF) ;
      edtProNumLin_Enabled = 1 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Backcolor = (int)(0xFFFFFF) ;
      edtProCod_Enabled = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Backcolor = (int)(0xFFFFFF) ;
      edtEmprCod_Enabled = 1 ;
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
      /* Using cursor T01CC16 */
      pr_default.execute(14, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DT002", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DTP_ORDL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(14);
      /* Using cursor T01CC17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARFASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(15);
      GX_FocusControl = edtDtp_Valpar_Internalname ;
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

   public void valid_Dtp_ordl( )
   {
      /* Using cursor T01CC16 */
      pr_default.execute(14, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DT002", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DTP_ORDL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Parfascod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01CC17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARFASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11535Dtp_Valpar", GXutil.rtrim( A11535Dtp_Valpar));
      httpContext.ajax_rsp_assign_attri("", false, "A11536Dtp_ParTxt", A11536Dtp_ParTxt);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z774ProNumLin", GXutil.ltrim( localUtil.ntoc( Z774ProNumLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7897Dtp_Ordl", GXutil.ltrim( localUtil.ntoc( Z7897Dtp_Ordl, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1664ParFasCod", GXutil.ltrim( localUtil.ntoc( Z1664ParFasCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11535Dtp_Valpar", GXutil.rtrim( Z11535Dtp_Valpar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11536Dtp_ParTxt", Z11536Dtp_ParTxt);
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
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
      setEventMetadata("VALID_PRONUMLIN","{handler:'valid_Pronumlin',iparms:[]");
      setEventMetadata("VALID_PRONUMLIN",",oparms:[]}");
      setEventMetadata("VALID_DTP_ORDL","{handler:'valid_Dtp_ordl',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A774ProNumLin',fld:'PRONUMLIN',pic:'ZZZ9'},{av:'A7897Dtp_Ordl',fld:'DTP_ORDL',pic:'ZZZ9'}]");
      setEventMetadata("VALID_DTP_ORDL",",oparms:[]}");
      setEventMetadata("VALID_PARFASCOD","{handler:'valid_Parfascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A774ProNumLin',fld:'PRONUMLIN',pic:'ZZZ9'},{av:'A7897Dtp_Ordl',fld:'DTP_ORDL',pic:'ZZZ9'},{av:'A1664ParFasCod',fld:'PARFASCOD',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PARFASCOD",",oparms:[{av:'A11535Dtp_Valpar',fld:'DTP_VALPAR',pic:''},{av:'A11536Dtp_ParTxt',fld:'DTP_PARTXT',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z758ProCod'},{av:'Z774ProNumLin'},{av:'Z7897Dtp_Ordl'},{av:'Z1664ParFasCod'},{av:'Z11535Dtp_Valpar'},{av:'Z11536Dtp_ParTxt'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z758ProCod = "" ;
      Z11535Dtp_Valpar = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
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
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A11535Dtp_Valpar = "" ;
      lblTextblock7_Jsonclick = "" ;
      A11536Dtp_ParTxt = "" ;
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
      Z11536Dtp_ParTxt = "" ;
      T01CC6_A11536Dtp_ParTxt = new String[] {""} ;
      T01CC6_n11536Dtp_ParTxt = new boolean[] {false} ;
      T01CC6_A11535Dtp_Valpar = new String[] {""} ;
      T01CC6_n11535Dtp_Valpar = new boolean[] {false} ;
      T01CC6_A396EmprCod = new String[] {""} ;
      T01CC6_A758ProCod = new String[] {""} ;
      T01CC6_A774ProNumLin = new short[1] ;
      T01CC6_A1664ParFasCod = new short[1] ;
      T01CC6_A7897Dtp_Ordl = new short[1] ;
      T01CC5_A396EmprCod = new String[] {""} ;
      T01CC4_A396EmprCod = new String[] {""} ;
      T01CC7_A396EmprCod = new String[] {""} ;
      T01CC8_A396EmprCod = new String[] {""} ;
      T01CC9_A396EmprCod = new String[] {""} ;
      T01CC9_A758ProCod = new String[] {""} ;
      T01CC9_A774ProNumLin = new short[1] ;
      T01CC9_A7897Dtp_Ordl = new short[1] ;
      T01CC9_A1664ParFasCod = new short[1] ;
      T01CC3_A11536Dtp_ParTxt = new String[] {""} ;
      T01CC3_n11536Dtp_ParTxt = new boolean[] {false} ;
      T01CC3_A11535Dtp_Valpar = new String[] {""} ;
      T01CC3_n11535Dtp_Valpar = new boolean[] {false} ;
      T01CC3_A396EmprCod = new String[] {""} ;
      T01CC3_A758ProCod = new String[] {""} ;
      T01CC3_A774ProNumLin = new short[1] ;
      T01CC3_A1664ParFasCod = new short[1] ;
      T01CC3_A7897Dtp_Ordl = new short[1] ;
      sMode1537 = "" ;
      T01CC10_A396EmprCod = new String[] {""} ;
      T01CC10_A758ProCod = new String[] {""} ;
      T01CC10_A774ProNumLin = new short[1] ;
      T01CC10_A7897Dtp_Ordl = new short[1] ;
      T01CC10_A1664ParFasCod = new short[1] ;
      T01CC11_A396EmprCod = new String[] {""} ;
      T01CC11_A758ProCod = new String[] {""} ;
      T01CC11_A774ProNumLin = new short[1] ;
      T01CC11_A7897Dtp_Ordl = new short[1] ;
      T01CC11_A1664ParFasCod = new short[1] ;
      T01CC2_A11536Dtp_ParTxt = new String[] {""} ;
      T01CC2_n11536Dtp_ParTxt = new boolean[] {false} ;
      T01CC2_A11535Dtp_Valpar = new String[] {""} ;
      T01CC2_n11535Dtp_Valpar = new boolean[] {false} ;
      T01CC2_A396EmprCod = new String[] {""} ;
      T01CC2_A758ProCod = new String[] {""} ;
      T01CC2_A774ProNumLin = new short[1] ;
      T01CC2_A1664ParFasCod = new short[1] ;
      T01CC2_A7897Dtp_Ordl = new short[1] ;
      T01CC15_A396EmprCod = new String[] {""} ;
      T01CC15_A758ProCod = new String[] {""} ;
      T01CC15_A774ProNumLin = new short[1] ;
      T01CC15_A7897Dtp_Ordl = new short[1] ;
      T01CC15_A1664ParFasCod = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01CC16_A396EmprCod = new String[] {""} ;
      T01CC17_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ758ProCod = "" ;
      ZZ11535Dtp_Valpar = "" ;
      ZZ11536Dtp_ParTxt = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdt0022__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdt0022__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdt0022__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdt0022__default(),
         new Object[] {
             new Object[] {
            T01CC2_A11536Dtp_ParTxt, T01CC2_n11536Dtp_ParTxt, T01CC2_A11535Dtp_Valpar, T01CC2_n11535Dtp_Valpar, T01CC2_A396EmprCod, T01CC2_A758ProCod, T01CC2_A774ProNumLin, T01CC2_A1664ParFasCod, T01CC2_A7897Dtp_Ordl
            }
            , new Object[] {
            T01CC3_A11536Dtp_ParTxt, T01CC3_n11536Dtp_ParTxt, T01CC3_A11535Dtp_Valpar, T01CC3_n11535Dtp_Valpar, T01CC3_A396EmprCod, T01CC3_A758ProCod, T01CC3_A774ProNumLin, T01CC3_A1664ParFasCod, T01CC3_A7897Dtp_Ordl
            }
            , new Object[] {
            T01CC4_A396EmprCod
            }
            , new Object[] {
            T01CC5_A396EmprCod
            }
            , new Object[] {
            T01CC6_A11536Dtp_ParTxt, T01CC6_n11536Dtp_ParTxt, T01CC6_A11535Dtp_Valpar, T01CC6_n11535Dtp_Valpar, T01CC6_A396EmprCod, T01CC6_A758ProCod, T01CC6_A774ProNumLin, T01CC6_A1664ParFasCod, T01CC6_A7897Dtp_Ordl
            }
            , new Object[] {
            T01CC7_A396EmprCod
            }
            , new Object[] {
            T01CC8_A396EmprCod
            }
            , new Object[] {
            T01CC9_A396EmprCod, T01CC9_A758ProCod, T01CC9_A774ProNumLin, T01CC9_A7897Dtp_Ordl, T01CC9_A1664ParFasCod
            }
            , new Object[] {
            T01CC10_A396EmprCod, T01CC10_A758ProCod, T01CC10_A774ProNumLin, T01CC10_A7897Dtp_Ordl, T01CC10_A1664ParFasCod
            }
            , new Object[] {
            T01CC11_A396EmprCod, T01CC11_A758ProCod, T01CC11_A774ProNumLin, T01CC11_A7897Dtp_Ordl, T01CC11_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01CC15_A396EmprCod, T01CC15_A758ProCod, T01CC15_A774ProNumLin, T01CC15_A7897Dtp_Ordl, T01CC15_A1664ParFasCod
            }
            , new Object[] {
            T01CC16_A396EmprCod
            }
            , new Object[] {
            T01CC17_A396EmprCod
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z774ProNumLin ;
   private short Z7897Dtp_Ordl ;
   private short Z1664ParFasCod ;
   private short A774ProNumLin ;
   private short A7897Dtp_Ordl ;
   private short A1664ParFasCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1537 ;
   private short nIsDirty_1537 ;
   private short ZZ774ProNumLin ;
   private short ZZ7897Dtp_Ordl ;
   private short ZZ1664ParFasCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtProCod_Enabled ;
   private int edtProNumLin_Enabled ;
   private int edtDtp_Ordl_Enabled ;
   private int edtParFasCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtDtp_Valpar_Enabled ;
   private int edtDtp_ParTxt_Enabled ;
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
   private int edtDtp_ParTxt_Backcolor ;
   private int edtDtp_Valpar_Backcolor ;
   private int edtParFasCod_Backcolor ;
   private int edtDtp_Ordl_Backcolor ;
   private int edtProNumLin_Backcolor ;
   private int edtProCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z758ProCod ;
   private String Z11535Dtp_Valpar ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
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
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtProNumLin_Internalname ;
   private String edtProNumLin_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtDtp_Ordl_Internalname ;
   private String edtDtp_Ordl_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtParFasCod_Internalname ;
   private String edtParFasCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtDtp_Valpar_Internalname ;
   private String A11535Dtp_Valpar ;
   private String edtDtp_Valpar_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtDtp_ParTxt_Internalname ;
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
   private String sMode1537 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ758ProCod ;
   private String ZZ11535Dtp_Valpar ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n11535Dtp_Valpar ;
   private boolean n11536Dtp_ParTxt ;
   private String A11536Dtp_ParTxt ;
   private String Z11536Dtp_ParTxt ;
   private String ZZ11536Dtp_ParTxt ;
   private IDataStoreProvider pr_default ;
   private String[] T01CC6_A11536Dtp_ParTxt ;
   private boolean[] T01CC6_n11536Dtp_ParTxt ;
   private String[] T01CC6_A11535Dtp_Valpar ;
   private boolean[] T01CC6_n11535Dtp_Valpar ;
   private String[] T01CC6_A396EmprCod ;
   private String[] T01CC6_A758ProCod ;
   private short[] T01CC6_A774ProNumLin ;
   private short[] T01CC6_A1664ParFasCod ;
   private short[] T01CC6_A7897Dtp_Ordl ;
   private String[] T01CC5_A396EmprCod ;
   private String[] T01CC4_A396EmprCod ;
   private String[] T01CC7_A396EmprCod ;
   private String[] T01CC8_A396EmprCod ;
   private String[] T01CC9_A396EmprCod ;
   private String[] T01CC9_A758ProCod ;
   private short[] T01CC9_A774ProNumLin ;
   private short[] T01CC9_A7897Dtp_Ordl ;
   private short[] T01CC9_A1664ParFasCod ;
   private String[] T01CC3_A11536Dtp_ParTxt ;
   private boolean[] T01CC3_n11536Dtp_ParTxt ;
   private String[] T01CC3_A11535Dtp_Valpar ;
   private boolean[] T01CC3_n11535Dtp_Valpar ;
   private String[] T01CC3_A396EmprCod ;
   private String[] T01CC3_A758ProCod ;
   private short[] T01CC3_A774ProNumLin ;
   private short[] T01CC3_A1664ParFasCod ;
   private short[] T01CC3_A7897Dtp_Ordl ;
   private String[] T01CC10_A396EmprCod ;
   private String[] T01CC10_A758ProCod ;
   private short[] T01CC10_A774ProNumLin ;
   private short[] T01CC10_A7897Dtp_Ordl ;
   private short[] T01CC10_A1664ParFasCod ;
   private String[] T01CC11_A396EmprCod ;
   private String[] T01CC11_A758ProCod ;
   private short[] T01CC11_A774ProNumLin ;
   private short[] T01CC11_A7897Dtp_Ordl ;
   private short[] T01CC11_A1664ParFasCod ;
   private String[] T01CC2_A11536Dtp_ParTxt ;
   private boolean[] T01CC2_n11536Dtp_ParTxt ;
   private String[] T01CC2_A11535Dtp_Valpar ;
   private boolean[] T01CC2_n11535Dtp_Valpar ;
   private String[] T01CC2_A396EmprCod ;
   private String[] T01CC2_A758ProCod ;
   private short[] T01CC2_A774ProNumLin ;
   private short[] T01CC2_A1664ParFasCod ;
   private short[] T01CC2_A7897Dtp_Ordl ;
   private String[] T01CC15_A396EmprCod ;
   private String[] T01CC15_A758ProCod ;
   private short[] T01CC15_A774ProNumLin ;
   private short[] T01CC15_A7897Dtp_Ordl ;
   private short[] T01CC15_A1664ParFasCod ;
   private String[] T01CC16_A396EmprCod ;
   private String[] T01CC17_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdt0022__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdt0022__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdt0022__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdt0022__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01CC2", "SELECT Dtp_ParTxt, Dtp_Valpar, EmprCod, ProCod, ProNumLin, ParFasCod, Dtp_Ordl FROM TXPDT0022 WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? AND Dtp_Ordl = ? AND ParFasCod = ?  FOR UPDATE OF Dtp_Valpar, Dtp_ParTxt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01CC3", "SELECT Dtp_ParTxt, Dtp_Valpar, EmprCod, ProCod, ProNumLin, ParFasCod, Dtp_Ordl FROM TXPDT0022 WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? AND Dtp_Ordl = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01CC4", "SELECT EmprCod FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01CC5", "SELECT EmprCod FROM TXPDT002 WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? AND Dtp_Ordl = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01CC6", "SELECT /*+ FIRST_ROWS(100) */ TM1.Dtp_ParTxt, TM1.Dtp_Valpar, TM1.EmprCod, TM1.ProCod, TM1.ProNumLin, TM1.ParFasCod, TM1.Dtp_Ordl FROM TXPDT0022 TM1 WHERE TM1.EmprCod = ? and TM1.ProCod = ? and TM1.ProNumLin = ? and TM1.Dtp_Ordl = ? and TM1.ParFasCod = ? ORDER BY TM1.EmprCod, TM1.ProCod, TM1.ProNumLin, TM1.Dtp_Ordl, TM1.ParFasCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01CC7", "SELECT EmprCod FROM TXPDT002 WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? AND Dtp_Ordl = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01CC8", "SELECT EmprCod FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01CC9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProCod, ProNumLin, Dtp_Ordl, ParFasCod FROM TXPDT0022 WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? AND Dtp_Ordl = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01CC10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProCod, ProNumLin, Dtp_Ordl, ParFasCod FROM TXPDT0022 WHERE ( EmprCod > ? or EmprCod = ? and ProCod > ? or ProCod = ? and EmprCod = ? and ProNumLin > ? or ProNumLin = ? and ProCod = ? and EmprCod = ? and Dtp_Ordl > ? or Dtp_Ordl = ? and ProNumLin = ? and ProCod = ? and EmprCod = ? and ParFasCod > ?) ORDER BY EmprCod, ProCod, ProNumLin, Dtp_Ordl, ParFasCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01CC11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProCod, ProNumLin, Dtp_Ordl, ParFasCod FROM TXPDT0022 WHERE ( EmprCod < ? or EmprCod = ? and ProCod < ? or ProCod = ? and EmprCod = ? and ProNumLin < ? or ProNumLin = ? and ProCod = ? and EmprCod = ? and Dtp_Ordl < ? or Dtp_Ordl = ? and ProNumLin = ? and ProCod = ? and EmprCod = ? and ParFasCod < ?) ORDER BY EmprCod DESC, ProCod DESC, ProNumLin DESC, Dtp_Ordl DESC, ParFasCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01CC12", "INSERT INTO TXPDT0022(Dtp_Valpar, Dtp_ParTxt, EmprCod, ProCod, ProNumLin, ParFasCod, Dtp_Ordl) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDT0022")
         ,new UpdateCursor("T01CC13", "UPDATE TXPDT0022 SET Dtp_Valpar=?, Dtp_ParTxt=?  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? AND Dtp_Ordl = ? AND ParFasCod = ?", GX_NOMASK, "TXPDT0022")
         ,new UpdateCursor("T01CC14", "DELETE FROM TXPDT0022  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? AND Dtp_Ordl = ? AND ParFasCod = ?", GX_NOMASK, "TXPDT0022")
         ,new ForEachCursor("T01CC15", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ProCod, ProNumLin, Dtp_Ordl, ParFasCod FROM TXPDT0022 ORDER BY EmprCod, ProCod, ProNumLin, Dtp_Ordl, ParFasCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01CC16", "SELECT EmprCod FROM TXPDT002 WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? AND Dtp_Ordl = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01CC17", "SELECT EmprCod FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((short[]) buf[8])[0] = rslt.getShort(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((short[]) buf[8])[0] = rslt.getShort(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((short[]) buf[8])[0] = rslt.getShort(7);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 8);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setString(13, (String)parms[12], 8);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 8);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setString(13, (String)parms[12], 8);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(2, (String)parms[3]);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setString(4, (String)parms[5], 8);
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               stmt.setShort(6, ((Number) parms[7]).shortValue());
               stmt.setShort(7, ((Number) parms[8]).shortValue());
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(2, (String)parms[3]);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setString(4, (String)parms[5], 8);
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               stmt.setShort(6, ((Number) parms[7]).shortValue());
               stmt.setShort(7, ((Number) parms[8]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

