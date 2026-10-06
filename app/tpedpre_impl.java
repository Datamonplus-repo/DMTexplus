package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpedpre_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV42Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42Pgmname", AV42Pgmname);
         AV8UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
         AV12Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
         AV35Texto_i = httpContext.GetPar( "Texto_i") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Texto_i", AV35Texto_i);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_4_1K634( A396EmprCod, AV42Pgmname, AV8UsurCod, AV12Station, AV35Texto_i, A361DisCod) ;
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
            A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PRECIOS Unidad y Kilo", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = chkDisAcc.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tpedpre_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpedpre_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpedpre_impl.class ));
   }

   public tpedpre_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkDisAcc = UIFactory.getCheckbox(this);
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
      A5252DisAcc = ((GXutil.strcmp(GXutil.rtrim( A5252DisAcc), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A5252DisAcc", A5252DisAcc);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDPRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDPRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDPRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDPRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPEDPRE.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDPRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Accesorios Metalicos", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisAcc.getInternalname(), A5252DisAcc, "", "", 1, chkDisAcc.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(36, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,36);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Precio Kgm.", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A388DisPreKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPreKgm_Enabled!=0) ? localUtil.format( A388DisPreKgm, "ZZZZZZ9.99") : localUtil.format( A388DisPreKgm, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPreKgm_Jsonclick, 0, "", "", "", "", "", 1, edtDisPreKgm_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Precio Metro", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A389DisPreMtr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPreMtr_Enabled!=0) ? localUtil.format( A389DisPreMtr, "ZZZZZZ9.99") : localUtil.format( A389DisPreMtr, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPreMtr_Jsonclick, 0, "", "", "", "", "", 1, edtDisPreMtr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDPRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDPRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDPRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDPRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPEDPRE.htm");
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
      e111K62 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5252DisAcc = httpContext.cgiGet( "Z5252DisAcc") ;
            Z388DisPreKgm = localUtil.ctond( httpContext.cgiGet( "Z388DisPreKgm")) ;
            Z389DisPreMtr = localUtil.ctond( httpContext.cgiGet( "Z389DisPreMtr")) ;
            O389DisPreMtr = localUtil.ctond( httpContext.cgiGet( "O389DisPreMtr")) ;
            O388DisPreKgm = localUtil.ctond( httpContext.cgiGet( "O388DisPreKgm")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV36OldKgm = localUtil.ctond( httpContext.cgiGet( "vOLDKGM")) ;
            AV37OldMtr = localUtil.ctond( httpContext.cgiGet( "vOLDMTR")) ;
            AV35Texto_i = httpContext.cgiGet( "vTEXTO_I") ;
            AV42Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV12Station = httpContext.cgiGet( "vSTATION") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A5252DisAcc = ((GXutil.strcmp(httpContext.cgiGet( chkDisAcc.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri("", false, "A5252DisAcc", A5252DisAcc);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisPreKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisPreKgm_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISPREKGM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDisPreKgm_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A388DisPreKgm = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A388DisPreKgm", GXutil.ltrimstr( A388DisPreKgm, 10, 2));
            }
            else
            {
               A388DisPreKgm = localUtil.ctond( httpContext.cgiGet( edtDisPreKgm_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A388DisPreKgm", GXutil.ltrimstr( A388DisPreKgm, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisPreMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisPreMtr_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISPREMTR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDisPreMtr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A389DisPreMtr = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A389DisPreMtr", GXutil.ltrimstr( A389DisPreMtr, 10, 2));
            }
            else
            {
               A389DisPreMtr = localUtil.ctond( httpContext.cgiGet( edtDisPreMtr_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A389DisPreMtr", GXutil.ltrimstr( A389DisPreMtr, 10, 2));
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
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
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
                        e111K62 ();
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
            initAll1K634( ) ;
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
      disableAttributes1K634( ) ;
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

   public void confirm_1K60( )
   {
      beforeValidate1K634( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1K634( ) ;
         }
         else
         {
            checkExtendedTable1K634( ) ;
            if ( AnyError == 0 )
            {
               zm1K634( 6) ;
            }
            closeExtendedTableCursors1K634( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1K60( ) ;
      }
   }

   public void resetCaption1K60( )
   {
   }

   public void e111K62( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tpedpre_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV42Pgmname, (byte)(99), GXv_char2) ;
      tpedpre_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tpedpre_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tpedpre_impl.this.A396EmprCod = GXv_char2[0] ;
      tpedpre_impl.this.AV11EmprNom = GXv_char3[0] ;
      tpedpre_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1K634( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5252DisAcc = T01K63_A5252DisAcc[0] ;
            Z388DisPreKgm = T01K63_A388DisPreKgm[0] ;
            Z389DisPreMtr = T01K63_A389DisPreMtr[0] ;
         }
         else
         {
            Z5252DisAcc = A5252DisAcc ;
            Z388DisPreKgm = A388DisPreKgm ;
            Z389DisPreMtr = A389DisPreMtr ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z361DisCod = A361DisCod ;
         Z5252DisAcc = A5252DisAcc ;
         Z388DisPreKgm = A388DisPreKgm ;
         Z389DisPreMtr = A389DisPreMtr ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV42Pgmname = "TPEDPRE" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Pgmname", AV42Pgmname);
      /* Using cursor T01K64 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01K64_A407EmprNom[0] ;
      n407EmprNom = T01K64_n407EmprNom[0] ;
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

   public void load1K634( )
   {
      /* Using cursor T01K65 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A407EmprNom = T01K65_A407EmprNom[0] ;
         n407EmprNom = T01K65_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A5252DisAcc = T01K65_A5252DisAcc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5252DisAcc", A5252DisAcc);
         A388DisPreKgm = T01K65_A388DisPreKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A388DisPreKgm", GXutil.ltrimstr( A388DisPreKgm, 10, 2));
         A389DisPreMtr = T01K65_A389DisPreMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A389DisPreMtr", GXutil.ltrimstr( A389DisPreMtr, 10, 2));
         zm1K634( -5) ;
      }
      pr_default.close(3);
      onLoadActions1K634( ) ;
   }

   public void onLoadActions1K634( )
   {
      AV36OldKgm = O388DisPreKgm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36OldKgm", GXutil.ltrimstr( AV36OldKgm, 10, 2));
      AV37OldMtr = O389DisPreMtr ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37OldMtr", GXutil.ltrimstr( AV37OldMtr, 10, 2));
      AV35Texto_i = httpContext.getMessage( httpContext.getMessage( "Precios. ", ""), "") + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Precio Anterior, Kilo   ", ""), "") + GXutil.str( AV36OldKgm, 10, 2) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Precio Anterior, Unidad ", ""), "") + GXutil.str( AV37OldMtr, 10, 2) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Precio Nuevo      Kilo  ", ""), "") + GXutil.str( A388DisPreKgm, 10, 2) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Precio Nuevo    , Unidad", ""), "") + GXutil.str( A389DisPreMtr, 10, 2) + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Texto_i", AV35Texto_i);
   }

   public void checkExtendedTable1K634( )
   {
      nIsDirty_34 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV36OldKgm = O388DisPreKgm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36OldKgm", GXutil.ltrimstr( AV36OldKgm, 10, 2));
      AV37OldMtr = O389DisPreMtr ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37OldMtr", GXutil.ltrimstr( AV37OldMtr, 10, 2));
      AV35Texto_i = httpContext.getMessage( httpContext.getMessage( "Precios. ", ""), "") + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Precio Anterior, Kilo   ", ""), "") + GXutil.str( AV36OldKgm, 10, 2) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Precio Anterior, Unidad ", ""), "") + GXutil.str( AV37OldMtr, 10, 2) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Precio Nuevo      Kilo  ", ""), "") + GXutil.str( A388DisPreKgm, 10, 2) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Precio Nuevo    , Unidad", ""), "") + GXutil.str( A389DisPreMtr, 10, 2) + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Texto_i", AV35Texto_i);
   }

   public void closeExtendedTableCursors1K634( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1K634( )
   {
      /* Using cursor T01K66 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
      else
      {
         RcdFound34 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01K63 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(1) != 101) && ( T01K63_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01K63_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1K634( 5) ;
         RcdFound34 = (short)(1) ;
         A5252DisAcc = T01K63_A5252DisAcc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5252DisAcc", A5252DisAcc);
         A388DisPreKgm = T01K63_A388DisPreKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A388DisPreKgm", GXutil.ltrimstr( A388DisPreKgm, 10, 2));
         A389DisPreMtr = T01K63_A389DisPreMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A389DisPreMtr", GXutil.ltrimstr( A389DisPreMtr, 10, 2));
         O389DisPreMtr = A389DisPreMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A389DisPreMtr", GXutil.ltrimstr( A389DisPreMtr, 10, 2));
         O388DisPreKgm = A388DisPreKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "A388DisPreKgm", GXutil.ltrimstr( A388DisPreKgm, 10, 2));
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1K634( ) ;
         if ( AnyError == 1 )
         {
            RcdFound34 = (short)(0) ;
            initializeNonKey1K634( ) ;
         }
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound34 = (short)(0) ;
         initializeNonKey1K634( ) ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1K634( ) ;
      if ( RcdFound34 == 0 )
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
      RcdFound34 = (short)(0) ;
      /* Using cursor T01K67 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T01K67_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01K67_A361DisCod[0] == A361DisCod ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T01K67_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01K67_A361DisCod[0] == A361DisCod ) )
         {
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound34 = (short)(0) ;
      /* Using cursor T01K68 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(T01K68_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01K68_A361DisCod[0] == A361DisCod ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(T01K68_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01K68_A361DisCod[0] == A361DisCod ) )
         {
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1K634( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = chkDisAcc.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1K634( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound34 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
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
               GX_FocusControl = chkDisAcc.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1K634( ) ;
               GX_FocusControl = chkDisAcc.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = chkDisAcc.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1K634( ) ;
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
                  GX_FocusControl = chkDisAcc.getInternalname() ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1K634( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
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
         GX_FocusControl = chkDisAcc.getInternalname() ;
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
      getKey1K634( ) ;
      if ( RcdFound34 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpedpre");
      GX_FocusControl = chkDisAcc.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1K60( ) ;
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
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = chkDisAcc.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1K634( ) ;
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = chkDisAcc.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1K634( ) ;
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
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = chkDisAcc.getInternalname() ;
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
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = chkDisAcc.getInternalname() ;
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
      scanStart1K634( ) ;
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound34 != 0 )
         {
            scanNext1K634( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = chkDisAcc.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1K634( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1K634( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01K62 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z5252DisAcc, T01K62_A5252DisAcc[0]) != 0 ) || ( DecimalUtil.compareTo(Z388DisPreKgm, T01K62_A388DisPreKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z389DisPreMtr, T01K62_A389DisPreMtr[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z5252DisAcc, T01K62_A5252DisAcc[0]) != 0 )
            {
               GXutil.writeLogln("tpedpre:[seudo value changed for attri]"+"DisAcc");
               GXutil.writeLogRaw("Old: ",Z5252DisAcc);
               GXutil.writeLogRaw("Current: ",T01K62_A5252DisAcc[0]);
            }
            if ( DecimalUtil.compareTo(Z388DisPreKgm, T01K62_A388DisPreKgm[0]) != 0 )
            {
               GXutil.writeLogln("tpedpre:[seudo value changed for attri]"+"DisPreKgm");
               GXutil.writeLogRaw("Old: ",Z388DisPreKgm);
               GXutil.writeLogRaw("Current: ",T01K62_A388DisPreKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z389DisPreMtr, T01K62_A389DisPreMtr[0]) != 0 )
            {
               GXutil.writeLogln("tpedpre:[seudo value changed for attri]"+"DisPreMtr");
               GXutil.writeLogRaw("Old: ",Z389DisPreMtr);
               GXutil.writeLogRaw("Current: ",T01K62_A389DisPreMtr[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISPOS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1K634( )
   {
      beforeValidate1K634( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1K634( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1K634( 0) ;
         checkOptimisticConcurrency1K634( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1K634( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1K634( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01K69 */
                  pr_default.execute(7, new Object[] {Integer.valueOf(A361DisCod), A5252DisAcc, A388DisPreKgm, A389DisPreMtr, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
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
                        resetCaption1K60( ) ;
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
            load1K634( ) ;
         }
         endLevel1K634( ) ;
      }
      closeExtendedTableCursors1K634( ) ;
   }

   public void update1K634( )
   {
      beforeValidate1K634( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1K634( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1K634( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1K634( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1K634( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01K610 */
                  pr_default.execute(8, new Object[] {A5252DisAcc, A388DisPreKgm, A389DisPreMtr, A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1K634( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int5[0] = A361DisCod ;
                     new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int5) ;
                     tpedpre_impl.this.A396EmprCod = GXv_char4[0] ;
                     tpedpre_impl.this.A361DisCod = GXv_int5[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1K60( ) ;
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
         endLevel1K634( ) ;
      }
      closeExtendedTableCursors1K634( ) ;
   }

   public void deferredUpdate1K634( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1K634( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1K634( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1K634( ) ;
         afterConfirm1K634( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1K634( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01K611 */
               pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound34 == 0 )
                     {
                        initAll1K634( ) ;
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
                     resetCaption1K60( ) ;
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
      sMode34 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1K634( ) ;
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1K634( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV36OldKgm = O388DisPreKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36OldKgm", GXutil.ltrimstr( AV36OldKgm, 10, 2));
         AV37OldMtr = O389DisPreMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37OldMtr", GXutil.ltrimstr( AV37OldMtr, 10, 2));
         AV35Texto_i = httpContext.getMessage( httpContext.getMessage( "Precios. ", ""), "") + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Precio Anterior, Kilo   ", ""), "") + GXutil.str( AV36OldKgm, 10, 2) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Precio Anterior, Unidad ", ""), "") + GXutil.str( AV37OldMtr, 10, 2) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Precio Nuevo      Kilo  ", ""), "") + GXutil.str( A388DisPreKgm, 10, 2) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Precio Nuevo    , Unidad", ""), "") + GXutil.str( A389DisPreMtr, 10, 2) + GXutil.newLine( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Texto_i", AV35Texto_i);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01K612 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Accesorios Tinte", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T01K613 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normativas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T01K614 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T01K615 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01K616 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DisPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01K617 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISACC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01K618 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01K619 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISREF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01K620 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSERV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01K621 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01K622 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISDEF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01K623 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
      }
   }

   public void endLevel1K634( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1K634( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpedpre");
         if ( AnyError == 0 )
         {
            confirmValues1K60( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpedpre");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1K634( )
   {
      /* Scan By routine */
      /* Using cursor T01K624 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1K634( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
   }

   public void scanEnd1K634( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1K634( )
   {
      /* After Confirm Rules */
      if ( true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV42Pgmname, AV8UsurCod, AV12Station, AV35Texto_i, A361DisCod, (byte)(0), " ") ;
      }
   }

   public void beforeInsert1K634( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1K634( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1K634( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1K634( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1K634( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1K634( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      chkDisAcc.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkDisAcc.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisAcc.getEnabled(), 5, 0), true);
      edtDisPreKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPreKgm_Enabled), 5, 0), true);
      edtDisPreMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPreMtr_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1K634( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1K60( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpedpre", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"EmprCod","DisCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5252DisAcc", GXutil.rtrim( Z5252DisAcc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z388DisPreKgm", GXutil.ltrim( localUtil.ntoc( Z388DisPreKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z389DisPreMtr", GXutil.ltrim( localUtil.ntoc( Z389DisPreMtr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O389DisPreMtr", GXutil.ltrim( localUtil.ntoc( O389DisPreMtr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O388DisPreKgm", GXutil.ltrim( localUtil.ntoc( O388DisPreKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDKGM", GXutil.ltrim( localUtil.ntoc( AV36OldKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDMTR", GXutil.ltrim( localUtil.ntoc( AV37OldMtr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTO_I", AV35Texto_i);
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV42Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV12Station));
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
      return formatLink("app.tpedpre", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"EmprCod","DisCod"})  ;
   }

   public String getPgmname( )
   {
      return "TPEDPRE" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PRECIOS Unidad y Kilo", "") ;
   }

   public void initializeNonKey1K634( )
   {
      AV36OldKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36OldKgm", GXutil.ltrimstr( AV36OldKgm, 10, 2));
      AV37OldMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37OldMtr", GXutil.ltrimstr( AV37OldMtr, 10, 2));
      A5252DisAcc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5252DisAcc", A5252DisAcc);
      A388DisPreKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A388DisPreKgm", GXutil.ltrimstr( A388DisPreKgm, 10, 2));
      A389DisPreMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A389DisPreMtr", GXutil.ltrimstr( A389DisPreMtr, 10, 2));
      AV35Texto_i = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Texto_i", AV35Texto_i);
      O389DisPreMtr = A389DisPreMtr ;
      httpContext.ajax_rsp_assign_attri("", false, "A389DisPreMtr", GXutil.ltrimstr( A389DisPreMtr, 10, 2));
      O388DisPreKgm = A388DisPreKgm ;
      httpContext.ajax_rsp_assign_attri("", false, "A388DisPreKgm", GXutil.ltrimstr( A388DisPreKgm, 10, 2));
      Z5252DisAcc = "" ;
      Z388DisPreKgm = DecimalUtil.ZERO ;
      Z389DisPreMtr = DecimalUtil.ZERO ;
   }

   public void initAll1K634( )
   {
      initializeNonKey1K634( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241584287", true, true);
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
      httpContext.AddJavascriptSource("tpedpre.js", "?20268241584287", false, true);
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
      edtDisCod_Internalname = "DISCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      chkDisAcc.setInternalname( "DISACC" );
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtDisPreKgm_Internalname = "DISPREKGM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtDisPreMtr_Internalname = "DISPREMTR" ;
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
      Form.setCaption( httpContext.getMessage( "PRECIOS Unidad y Kilo", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtDisPreMtr_Jsonclick = "" ;
      edtDisPreMtr_Backcolor = (int)(0xFFFFFF) ;
      edtDisPreMtr_Enabled = 1 ;
      edtDisPreKgm_Jsonclick = "" ;
      edtDisPreKgm_Backcolor = (int)(0xFFFFFF) ;
      edtDisPreKgm_Enabled = 1 ;
      chkDisAcc.setIBackground( (int)(0xFFFFFF) );
      chkDisAcc.setEnabled( 1 );
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Backcolor = (int)(0xFFFFFF) ;
      edtDisCod_Enabled = 0 ;
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

   public void xc_4_1K634( String A396EmprCod ,
                           String AV42Pgmname ,
                           String AV8UsurCod ,
                           String AV12Station ,
                           String AV35Texto_i ,
                           int A361DisCod )
   {
      if ( true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV42Pgmname, AV8UsurCod, AV12Station, AV35Texto_i, A361DisCod, (byte)(0), " ") ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void init_web_controls( )
   {
      chkDisAcc.setName( "DISACC" );
      chkDisAcc.setWebtags( "" );
      chkDisAcc.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisAcc.getInternalname(), "TitleCaption", chkDisAcc.getCaption(), true);
      chkDisAcc.setCheckedValue( "N" );
      A5252DisAcc = ((GXutil.strcmp(GXutil.rtrim( A5252DisAcc), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A5252DisAcc", A5252DisAcc);
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01K625 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01K625_A407EmprNom[0] ;
      n407EmprNom = T01K625_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(23);
      GX_FocusControl = chkDisAcc.getInternalname() ;
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

   public void valid_Discod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      A5252DisAcc = ((GXutil.strcmp(GXutil.rtrim( A5252DisAcc), "S")==0) ? "S" : "N") ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A5252DisAcc", GXutil.rtrim( A5252DisAcc));
      httpContext.ajax_rsp_assign_attri("", false, "A388DisPreKgm", GXutil.ltrim( localUtil.ntoc( A388DisPreKgm, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A389DisPreMtr", GXutil.ltrim( localUtil.ntoc( A389DisPreMtr, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV36OldKgm", GXutil.ltrim( localUtil.ntoc( AV36OldKgm, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV37OldMtr", GXutil.ltrim( localUtil.ntoc( AV37OldMtr, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV35Texto_i", AV35Texto_i);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5252DisAcc", GXutil.rtrim( Z5252DisAcc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z388DisPreKgm", GXutil.ltrim( localUtil.ntoc( Z388DisPreKgm, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z389DisPreMtr", GXutil.ltrim( localUtil.ntoc( Z389DisPreMtr, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV36OldKgm", GXutil.ltrim( localUtil.ntoc( ZV36OldKgm, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV37OldMtr", GXutil.ltrim( localUtil.ntoc( ZV37OldMtr, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV35Texto_i", ZV35Texto_i);
      httpContext.ajax_rsp_assign_attri("", false, "O389DisPreMtr", GXutil.ltrim( localUtil.ntoc( O389DisPreMtr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O388DisPreKgm", GXutil.ltrim( localUtil.ntoc( O388DisPreKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Disprekgm( )
   {
      AV36OldKgm = O388DisPreKgm ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV36OldKgm", GXutil.ltrim( localUtil.ntoc( AV36OldKgm, (byte)(10), (byte)(2), ".", "")));
   }

   public void valid_Dispremtr( )
   {
      AV37OldMtr = O389DisPreMtr ;
      AV35Texto_i = httpContext.getMessage( httpContext.getMessage( "Precios. ", ""), "") + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Precio Anterior, Kilo   ", ""), "") + GXutil.str( AV36OldKgm, 10, 2) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Precio Anterior, Unidad ", ""), "") + GXutil.str( AV37OldMtr, 10, 2) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Precio Nuevo      Kilo  ", ""), "") + GXutil.str( A388DisPreKgm, 10, 2) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Precio Nuevo    , Unidad", ""), "") + GXutil.str( A389DisPreMtr, 10, 2) + GXutil.newLine( ) ;
      O389DisPreMtr = A389DisPreMtr ;
      O388DisPreKgm = A388DisPreKgm ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV37OldMtr", GXutil.ltrim( localUtil.ntoc( AV37OldMtr, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV35Texto_i", AV35Texto_i);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A5252DisAcc',fld:'DISACC',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A5252DisAcc',fld:'DISACC',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A5252DisAcc',fld:'DISACC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A5252DisAcc',fld:'DISACC',pic:''}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A5252DisAcc',fld:'DISACC',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A5252DisAcc',fld:'DISACC',pic:''}]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[{av:'AV8UsurCod',fld:'vUSURCOD',pic:''},{av:'AV12Station',fld:'vSTATION',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV36OldKgm',fld:'vOLDKGM',pic:'ZZZZZZ9.99'},{av:'AV37OldMtr',fld:'vOLDMTR',pic:'ZZZZZZ9.99'},{av:'AV35Texto_i',fld:'vTEXTO_I',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''}]");
      setEventMetadata("VALID_DISCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A388DisPreKgm',fld:'DISPREKGM',pic:'ZZZZZZ9.99'},{av:'A389DisPreMtr',fld:'DISPREMTR',pic:'ZZZZZZ9.99'},{av:'AV36OldKgm',fld:'vOLDKGM',pic:'ZZZZZZ9.99'},{av:'AV37OldMtr',fld:'vOLDMTR',pic:'ZZZZZZ9.99'},{av:'AV35Texto_i',fld:'vTEXTO_I',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z361DisCod'},{av:'Z407EmprNom'},{av:'Z5252DisAcc'},{av:'Z388DisPreKgm'},{av:'Z389DisPreMtr'},{av:'ZV36OldKgm'},{av:'ZV37OldMtr'},{av:'ZV35Texto_i'},{av:'O389DisPreMtr'},{av:'O388DisPreKgm'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'},{av:'A5252DisAcc',fld:'DISACC',pic:''}]}");
      setEventMetadata("VALID_DISPREKGM","{handler:'valid_Disprekgm',iparms:[{av:'O388DisPreKgm'},{av:'A388DisPreKgm',fld:'DISPREKGM',pic:'ZZZZZZ9.99'},{av:'AV36OldKgm',fld:'vOLDKGM',pic:'ZZZZZZ9.99'},{av:'A5252DisAcc',fld:'DISACC',pic:''}]");
      setEventMetadata("VALID_DISPREKGM",",oparms:[{av:'AV36OldKgm',fld:'vOLDKGM',pic:'ZZZZZZ9.99'},{av:'A5252DisAcc',fld:'DISACC',pic:''}]}");
      setEventMetadata("VALID_DISPREMTR","{handler:'valid_Dispremtr',iparms:[{av:'O389DisPreMtr'},{av:'A389DisPreMtr',fld:'DISPREMTR',pic:'ZZZZZZ9.99'},{av:'AV36OldKgm',fld:'vOLDKGM',pic:'ZZZZZZ9.99'},{av:'AV37OldMtr',fld:'vOLDMTR',pic:'ZZZZZZ9.99'},{av:'A388DisPreKgm',fld:'DISPREKGM',pic:'ZZZZZZ9.99'},{av:'AV35Texto_i',fld:'vTEXTO_I',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''}]");
      setEventMetadata("VALID_DISPREMTR",",oparms:[{av:'AV37OldMtr',fld:'vOLDMTR',pic:'ZZZZZZ9.99'},{av:'AV35Texto_i',fld:'vTEXTO_I',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''}]}");
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
      pr_default.close(23);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z5252DisAcc = "" ;
      Z388DisPreKgm = DecimalUtil.ZERO ;
      Z389DisPreMtr = DecimalUtil.ZERO ;
      O389DisPreMtr = DecimalUtil.ZERO ;
      O388DisPreKgm = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV42Pgmname = "" ;
      AV8UsurCod = "" ;
      AV12Station = "" ;
      AV35Texto_i = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A5252DisAcc = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A388DisPreKgm = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      A389DisPreMtr = DecimalUtil.ZERO ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV36OldKgm = DecimalUtil.ZERO ;
      AV37OldMtr = DecimalUtil.ZERO ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      Z407EmprNom = "" ;
      T01K64_A407EmprNom = new String[] {""} ;
      T01K64_n407EmprNom = new boolean[] {false} ;
      T01K65_A361DisCod = new int[1] ;
      T01K65_A407EmprNom = new String[] {""} ;
      T01K65_n407EmprNom = new boolean[] {false} ;
      T01K65_A5252DisAcc = new String[] {""} ;
      T01K65_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01K65_A389DisPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01K65_A396EmprCod = new String[] {""} ;
      T01K66_A396EmprCod = new String[] {""} ;
      T01K66_A361DisCod = new int[1] ;
      T01K63_A361DisCod = new int[1] ;
      T01K63_A5252DisAcc = new String[] {""} ;
      T01K63_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01K63_A389DisPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01K63_A396EmprCod = new String[] {""} ;
      sMode34 = "" ;
      T01K67_A396EmprCod = new String[] {""} ;
      T01K67_A361DisCod = new int[1] ;
      T01K68_A396EmprCod = new String[] {""} ;
      T01K68_A361DisCod = new int[1] ;
      T01K62_A361DisCod = new int[1] ;
      T01K62_A5252DisAcc = new String[] {""} ;
      T01K62_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01K62_A389DisPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01K62_A396EmprCod = new String[] {""} ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      T01K612_A396EmprCod = new String[] {""} ;
      T01K612_A361DisCod = new int[1] ;
      T01K612_A13376DisTraID = new String[] {""} ;
      T01K613_A396EmprCod = new String[] {""} ;
      T01K613_A361DisCod = new int[1] ;
      T01K613_A13213DisNormID = new String[] {""} ;
      T01K614_A396EmprCod = new String[] {""} ;
      T01K614_A361DisCod = new int[1] ;
      T01K614_A13081DisDGLin = new byte[1] ;
      T01K614_A13082DisDGDibCl = new String[] {""} ;
      T01K614_A13083DisDGDibIn = new int[1] ;
      T01K614_A13084DisDGComb = new String[] {""} ;
      T01K614_A13085DisDGFondo = new String[] {""} ;
      T01K615_A396EmprCod = new String[] {""} ;
      T01K615_A361DisCod = new int[1] ;
      T01K615_A7068DisNotLin = new byte[1] ;
      T01K616_A396EmprCod = new String[] {""} ;
      T01K616_A361DisCod = new int[1] ;
      T01K616_A10197ProEspCod = new String[] {""} ;
      T01K617_A396EmprCod = new String[] {""} ;
      T01K617_A361DisCod = new int[1] ;
      T01K617_A4594AccCod = new short[1] ;
      T01K618_A396EmprCod = new String[] {""} ;
      T01K618_A361DisCod = new int[1] ;
      T01K618_A2524DisComLin = new byte[1] ;
      T01K618_A1056DisComCod = new String[] {""} ;
      T01K618_A1032FonCod = new String[] {""} ;
      T01K619_A396EmprCod = new String[] {""} ;
      T01K619_A361DisCod = new int[1] ;
      T01K619_A3398DisRefBarC = new int[1] ;
      T01K619_A3399DisRefBCRe = new byte[1] ;
      T01K619_A3400DisRefBCPa = new String[] {""} ;
      T01K619_A3607DisRefBPie = new String[] {""} ;
      T01K620_A396EmprCod = new String[] {""} ;
      T01K620_A361DisCod = new int[1] ;
      T01K620_A376DisObsLin = new byte[1] ;
      T01K621_A396EmprCod = new String[] {""} ;
      T01K621_A361DisCod = new int[1] ;
      T01K621_A758ProCod = new String[] {""} ;
      T01K622_A396EmprCod = new String[] {""} ;
      T01K622_A361DisCod = new int[1] ;
      T01K622_A833TipDefCod = new short[1] ;
      T01K623_A396EmprCod = new String[] {""} ;
      T01K623_A361DisCod = new int[1] ;
      T01K623_A44AlbRecCod = new int[1] ;
      T01K624_A396EmprCod = new String[] {""} ;
      T01K624_A361DisCod = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01K625_A407EmprNom = new String[] {""} ;
      T01K625_n407EmprNom = new boolean[] {false} ;
      ZV36OldKgm = DecimalUtil.ZERO ;
      ZV37OldMtr = DecimalUtil.ZERO ;
      ZV35Texto_i = "" ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ5252DisAcc = "" ;
      ZZ388DisPreKgm = DecimalUtil.ZERO ;
      ZZ389DisPreMtr = DecimalUtil.ZERO ;
      ZZV36OldKgm = DecimalUtil.ZERO ;
      ZZV37OldMtr = DecimalUtil.ZERO ;
      ZZV35Texto_i = "" ;
      ZO389DisPreMtr = DecimalUtil.ZERO ;
      ZO388DisPreKgm = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tpedpre__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpedpre__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpedpre__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpedpre__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpedpre__default(),
         new Object[] {
             new Object[] {
            T01K62_A361DisCod, T01K62_A5252DisAcc, T01K62_A388DisPreKgm, T01K62_A389DisPreMtr, T01K62_A396EmprCod
            }
            , new Object[] {
            T01K63_A361DisCod, T01K63_A5252DisAcc, T01K63_A388DisPreKgm, T01K63_A389DisPreMtr, T01K63_A396EmprCod
            }
            , new Object[] {
            T01K64_A407EmprNom, T01K64_n407EmprNom
            }
            , new Object[] {
            T01K65_A361DisCod, T01K65_A407EmprNom, T01K65_n407EmprNom, T01K65_A5252DisAcc, T01K65_A388DisPreKgm, T01K65_A389DisPreMtr, T01K65_A396EmprCod
            }
            , new Object[] {
            T01K66_A396EmprCod, T01K66_A361DisCod
            }
            , new Object[] {
            T01K67_A396EmprCod, T01K67_A361DisCod
            }
            , new Object[] {
            T01K68_A396EmprCod, T01K68_A361DisCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01K612_A396EmprCod, T01K612_A361DisCod, T01K612_A13376DisTraID
            }
            , new Object[] {
            T01K613_A396EmprCod, T01K613_A361DisCod, T01K613_A13213DisNormID
            }
            , new Object[] {
            T01K614_A396EmprCod, T01K614_A361DisCod, T01K614_A13081DisDGLin, T01K614_A13082DisDGDibCl, T01K614_A13083DisDGDibIn, T01K614_A13084DisDGComb, T01K614_A13085DisDGFondo
            }
            , new Object[] {
            T01K615_A396EmprCod, T01K615_A361DisCod, T01K615_A7068DisNotLin
            }
            , new Object[] {
            T01K616_A396EmprCod, T01K616_A361DisCod, T01K616_A10197ProEspCod
            }
            , new Object[] {
            T01K617_A396EmprCod, T01K617_A361DisCod, T01K617_A4594AccCod
            }
            , new Object[] {
            T01K618_A396EmprCod, T01K618_A361DisCod, T01K618_A2524DisComLin, T01K618_A1056DisComCod, T01K618_A1032FonCod
            }
            , new Object[] {
            T01K619_A396EmprCod, T01K619_A361DisCod, T01K619_A3398DisRefBarC, T01K619_A3399DisRefBCRe, T01K619_A3400DisRefBCPa, T01K619_A3607DisRefBPie
            }
            , new Object[] {
            T01K620_A396EmprCod, T01K620_A361DisCod, T01K620_A376DisObsLin
            }
            , new Object[] {
            T01K621_A396EmprCod, T01K621_A361DisCod, T01K621_A758ProCod
            }
            , new Object[] {
            T01K622_A396EmprCod, T01K622_A361DisCod, T01K622_A833TipDefCod
            }
            , new Object[] {
            T01K623_A396EmprCod, T01K623_A361DisCod, T01K623_A44AlbRecCod
            }
            , new Object[] {
            T01K624_A396EmprCod, T01K624_A361DisCod
            }
            , new Object[] {
            T01K625_A407EmprNom, T01K625_n407EmprNom
            }
         }
      );
      Z361DisCod = 0 ;
      A361DisCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV42Pgmname = "TPEDPRE" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound34 ;
   private short nIsDirty_34 ;
   private int wcpOA361DisCod ;
   private int Z361DisCod ;
   private int A361DisCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtDisCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtDisPreKgm_Enabled ;
   private int edtDisPreMtr_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GX_JID ;
   private int GXv_int5[] ;
   private int idxLst ;
   private int edtDisPreMtr_Backcolor ;
   private int edtDisPreKgm_Backcolor ;
   private int edtDisCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ361DisCod ;
   private java.math.BigDecimal Z388DisPreKgm ;
   private java.math.BigDecimal Z389DisPreMtr ;
   private java.math.BigDecimal O389DisPreMtr ;
   private java.math.BigDecimal O388DisPreKgm ;
   private java.math.BigDecimal A388DisPreKgm ;
   private java.math.BigDecimal A389DisPreMtr ;
   private java.math.BigDecimal AV36OldKgm ;
   private java.math.BigDecimal AV37OldMtr ;
   private java.math.BigDecimal ZV36OldKgm ;
   private java.math.BigDecimal ZV37OldMtr ;
   private java.math.BigDecimal ZZ388DisPreKgm ;
   private java.math.BigDecimal ZZ389DisPreMtr ;
   private java.math.BigDecimal ZZV36OldKgm ;
   private java.math.BigDecimal ZZV37OldMtr ;
   private java.math.BigDecimal ZO389DisPreMtr ;
   private java.math.BigDecimal ZO388DisPreKgm ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String Z5252DisAcc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV42Pgmname ;
   private String AV8UsurCod ;
   private String AV12Station ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String A5252DisAcc ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtDisPreKgm_Internalname ;
   private String edtDisPreKgm_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtDisPreMtr_Internalname ;
   private String edtDisPreMtr_Jsonclick ;
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
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String Z407EmprNom ;
   private String sMode34 ;
   private String GXv_char4[] ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ5252DisAcc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private String AV35Texto_i ;
   private String ZV35Texto_i ;
   private String ZZV35Texto_i ;
   private ICheckbox chkDisAcc ;
   private IDataStoreProvider pr_default ;
   private String[] T01K64_A407EmprNom ;
   private boolean[] T01K64_n407EmprNom ;
   private int[] T01K65_A361DisCod ;
   private String[] T01K65_A407EmprNom ;
   private boolean[] T01K65_n407EmprNom ;
   private String[] T01K65_A5252DisAcc ;
   private java.math.BigDecimal[] T01K65_A388DisPreKgm ;
   private java.math.BigDecimal[] T01K65_A389DisPreMtr ;
   private String[] T01K65_A396EmprCod ;
   private String[] T01K66_A396EmprCod ;
   private int[] T01K66_A361DisCod ;
   private int[] T01K63_A361DisCod ;
   private String[] T01K63_A5252DisAcc ;
   private java.math.BigDecimal[] T01K63_A388DisPreKgm ;
   private java.math.BigDecimal[] T01K63_A389DisPreMtr ;
   private String[] T01K63_A396EmprCod ;
   private String[] T01K67_A396EmprCod ;
   private int[] T01K67_A361DisCod ;
   private String[] T01K68_A396EmprCod ;
   private int[] T01K68_A361DisCod ;
   private int[] T01K62_A361DisCod ;
   private String[] T01K62_A5252DisAcc ;
   private java.math.BigDecimal[] T01K62_A388DisPreKgm ;
   private java.math.BigDecimal[] T01K62_A389DisPreMtr ;
   private String[] T01K62_A396EmprCod ;
   private String[] T01K612_A396EmprCod ;
   private int[] T01K612_A361DisCod ;
   private String[] T01K612_A13376DisTraID ;
   private String[] T01K613_A396EmprCod ;
   private int[] T01K613_A361DisCod ;
   private String[] T01K613_A13213DisNormID ;
   private String[] T01K614_A396EmprCod ;
   private int[] T01K614_A361DisCod ;
   private byte[] T01K614_A13081DisDGLin ;
   private String[] T01K614_A13082DisDGDibCl ;
   private int[] T01K614_A13083DisDGDibIn ;
   private String[] T01K614_A13084DisDGComb ;
   private String[] T01K614_A13085DisDGFondo ;
   private String[] T01K615_A396EmprCod ;
   private int[] T01K615_A361DisCod ;
   private byte[] T01K615_A7068DisNotLin ;
   private String[] T01K616_A396EmprCod ;
   private int[] T01K616_A361DisCod ;
   private String[] T01K616_A10197ProEspCod ;
   private String[] T01K617_A396EmprCod ;
   private int[] T01K617_A361DisCod ;
   private short[] T01K617_A4594AccCod ;
   private String[] T01K618_A396EmprCod ;
   private int[] T01K618_A361DisCod ;
   private byte[] T01K618_A2524DisComLin ;
   private String[] T01K618_A1056DisComCod ;
   private String[] T01K618_A1032FonCod ;
   private String[] T01K619_A396EmprCod ;
   private int[] T01K619_A361DisCod ;
   private int[] T01K619_A3398DisRefBarC ;
   private byte[] T01K619_A3399DisRefBCRe ;
   private String[] T01K619_A3400DisRefBCPa ;
   private String[] T01K619_A3607DisRefBPie ;
   private String[] T01K620_A396EmprCod ;
   private int[] T01K620_A361DisCod ;
   private byte[] T01K620_A376DisObsLin ;
   private String[] T01K621_A396EmprCod ;
   private int[] T01K621_A361DisCod ;
   private String[] T01K621_A758ProCod ;
   private String[] T01K622_A396EmprCod ;
   private int[] T01K622_A361DisCod ;
   private short[] T01K622_A833TipDefCod ;
   private String[] T01K623_A396EmprCod ;
   private int[] T01K623_A361DisCod ;
   private int[] T01K623_A44AlbRecCod ;
   private String[] T01K624_A396EmprCod ;
   private int[] T01K624_A361DisCod ;
   private String[] T01K625_A407EmprNom ;
   private boolean[] T01K625_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpedpre__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpedpre__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpedpre__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpedpre__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpedpre__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01K62", "SELECT DisCod, DisAcc, DisPreKgm, DisPreMtr, EmprCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ?  FOR UPDATE OF DisAcc, DisPreKgm, DisPreMtr NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K63", "SELECT DisCod, DisAcc, DisPreKgm, DisPreMtr, EmprCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K64", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K65", "SELECT /*+ FIRST_ROWS(1) */ TM1.DisCod, T2.EmprNom, TM1.DisAcc, TM1.DisPreKgm, TM1.DisPreMtr, TM1.EmprCod FROM (TXPDISPOS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.DisCod = ? ORDER BY TM1.EmprCod, TM1.DisCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K66", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K67", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K68", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod DESC, DisCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01K69", "INSERT INTO TXPDISPOS(DisCod, DisAcc, DisPreKgm, DisPreMtr, EmprCod, DisDes, DisArtCod, DisNumPie, DisNumUni, DisUniMed, DisArtPes, PriCod, DisCliNum, DisFecCli, DisFec, DisFecEnt, DisColNom, DisColNum, DisTipCol, DisArtDsc, DisEnt, DisObsULin, DisArtMat, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtOpe, DisArtTr1, DisArtPt1, DisArtTr2, DisArtPt2, DisArtTr3, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtPu1, DisArtUr2, DisArtPu2, DisArtUr3, DisArtPu3, DisArtAnh, DisEst, DisPieLan, DisKgmLan, DisMtrLan, DisNMtr, DisNMez, DisNumTen, MaqCodDis, PartCod, CliCod, TipConCod, DisNomCli, DisNumCli, DisEncCom, DisEncAnh, DisGraCru, DisArtAn1, DisArtAcb, DisArtAc2, DisLoc, DisPart, DisGraAca, DisRdoN, DisRdoA, DisRes, DisTipDis, DisNumBas, DisCliDes, DisManCod, DisOpeAnt, DisCodTex, DisNumTex1, DisNumTex2, DisNumLot, DisKgsLot, DisMtrLot, DisPla, DisPle2, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisFac, DisManCod1, DisManCod2, DisNumTon, DisFecLan, RetCod, DisArtMer, EmpesCod, DibCli, DibInt, DisNumCol, DisObs, DisComULin, DisEnv, DisTin, DisNPzas, DisNPzasL, DisUsrCod, DisPelAnh, DisCruMts, DisCruKgs, DisCruEnr, DisLotMts, DisLotKgs, DisAcaBak, DisAcaAnh, DisAcaMar, DisMdlCod, DisTam, DisHorEnt, DisHorReg, DisDishCod, DisNroCor, DisEncCli, DibColDib, DisTipEst, DisGraCob, DisCom, DisEstTip, DisTipCor, DisObsGrm, DisObsAnc, DisAntp, DisAntpT, DisVolMaq, DisRbMaq, DisDto, DisFacSep, DisFacGra, DisOrdSep, DisOrdGra, DisDesCol, DisGraTam, DisRec, DisMaqEst, DisExp, DisFEnt, DisDest, DisFchT, DisItem1, DisItem2, DisItem3, DisItem4, DisItem5, DisItem6, Cod_Idtx, DisFecPed, DisLotPza, DisLotMaq, DisAcaFor, DibColCol, DisDibCoCN, DibColColN, DisDibCoDN, DisUltNot, DisParCod, DisParReo, DisParPar, DisMemo1, DisMemo2, MarcaId, DisOrdComp, DisCnoEncO, Nxt_modelo, CpteId, Nxt_statio, DesaID, DptoID, Nxt_artcli, RevenID, DisPriorid, DisTpEstam, DisProdID, DisOEKOTEX, DisLineaID, DisCanalID, DisLinPrd, DisDGUltli, DisRGB, DisRdto4, DisTallUlt, DisIdtx2, DisArtDsc2, DisPrePz) VALUES(?, ?, ?, ?, ?, ' ', ' ', 0, 0, ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0)", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T01K610", "UPDATE TXPDISPOS SET DisAcc=?, DisPreKgm=?, DisPreMtr=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T01K611", "DELETE FROM TXPDISPOS  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new ForEachCursor("T01K612", "SELECT * FROM (SELECT EmprCod, DisCod, DisTraID FROM TXPDISATI WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K613", "SELECT * FROM (SELECT EmprCod, DisCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K614", "SELECT * FROM (SELECT EmprCod, DisCod, DisDGLin, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo FROM TXPDIGCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K615", "SELECT * FROM (SELECT EmprCod, DisCod, DisNotLin FROM TXPDISNOT WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K616", "SELECT * FROM (SELECT EmprCod, DisCod, ProEspCod FROM TXPDisPE WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K617", "SELECT * FROM (SELECT EmprCod, DisCod, AccCod FROM TXPDISACC WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K618", "SELECT * FROM (SELECT EmprCod, DisCod, DisComLin, DisComCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K619", "SELECT * FROM (SELECT EmprCod, DisCod, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie FROM TXPDISREF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K620", "SELECT * FROM (SELECT EmprCod, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K621", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K622", "SELECT * FROM (SELECT EmprCod, DisCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K623", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K624", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01K625", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 5);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 23 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(5, (String)parms[4], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

