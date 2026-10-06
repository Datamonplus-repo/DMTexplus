package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdvprdalm_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_2") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11935DVPrdNum = httpContext.GetPar( "DVPrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod, A11935DVPrdNum) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Existencias por Almacen DATA View", ""), (short)(0)) ;
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

   public tdvprdalm_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdvprdalm_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdvprdalm_impl.class ));
   }

   public tdvprdalm_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVPrdAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVPrdAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVPrdAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVPrdAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDVPrdAlm.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVPrdAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVPrdAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Producto Dv", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVPrdAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdNum_Internalname, GXutil.rtrim( A11935DVPrdNum), GXutil.rtrim( localUtil.format( A11935DVPrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdNum_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVPrdAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Almacen", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVPrdAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCC_AlmCo_Internalname, GXutil.ltrim( localUtil.ntoc( A11941DVCC_AlmCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVCC_AlmCo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11941DVCC_AlmCo), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A11941DVCC_AlmCo), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCC_AlmCo_Jsonclick, 0, "", "", "", "", "", 1, edtDVCC_AlmCo_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVPrdAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVPrdAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Existencias en CC p/Almacen", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVPrdAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCC_ExisC_Internalname, GXutil.ltrim( localUtil.ntoc( A12002DVCC_ExisC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVCC_ExisC_Enabled!=0) ? localUtil.format( A12002DVCC_ExisC, "ZZZZZZ9.9999") : localUtil.format( A12002DVCC_ExisC, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCC_ExisC_Jsonclick, 0, "", "", "", "", "", 1, edtDVCC_ExisC_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVPrdAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVPrdAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVPrdAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVPrdAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVPrdAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDVPrdAlm.htm");
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
         Z11935DVPrdNum = httpContext.cgiGet( "Z11935DVPrdNum") ;
         Z11941DVCC_AlmCo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11941DVCC_AlmCo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12002DVCC_ExisC = localUtil.ctond( httpContext.cgiGet( "Z12002DVCC_ExisC")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11935DVPrdNum = httpContext.cgiGet( edtDVPrdNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVCC_AlmCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVCC_AlmCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVCC_ALMCO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVCC_AlmCo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11941DVCC_AlmCo = (byte)(0) ;
            n11941DVCC_AlmCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11941DVCC_AlmCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11941DVCC_AlmCo), 2, 0));
         }
         else
         {
            A11941DVCC_AlmCo = (byte)(localUtil.ctol( httpContext.cgiGet( edtDVCC_AlmCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11941DVCC_AlmCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11941DVCC_AlmCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11941DVCC_AlmCo), 2, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVCC_ExisC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVCC_ExisC_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVCC_EXISC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVCC_ExisC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12002DVCC_ExisC = DecimalUtil.ZERO ;
            n12002DVCC_ExisC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12002DVCC_ExisC", GXutil.ltrimstr( A12002DVCC_ExisC, 12, 4));
         }
         else
         {
            A12002DVCC_ExisC = localUtil.ctond( httpContext.cgiGet( edtDVCC_ExisC_Internalname)) ;
            n12002DVCC_ExisC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12002DVCC_ExisC", GXutil.ltrimstr( A12002DVCC_ExisC, 12, 4));
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
            A11935DVPrdNum = httpContext.GetPar( "DVPrdNum") ;
            httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
            A11941DVCC_AlmCo = (byte)(GXutil.lval( httpContext.GetPar( "DVCC_AlmCo"))) ;
            n11941DVCC_AlmCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11941DVCC_AlmCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11941DVCC_AlmCo), 2, 0));
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
            initAll1IT1677( ) ;
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
      disableAttributes1IT1677( ) ;
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

   public void confirm_1IT0( )
   {
      beforeValidate1IT1677( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1IT1677( ) ;
         }
         else
         {
            checkExtendedTable1IT1677( ) ;
            if ( AnyError == 0 )
            {
               zm1IT1677( 2) ;
            }
            closeExtendedTableCursors1IT1677( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1IT0( ) ;
      }
   }

   public void resetCaption1IT0( )
   {
   }

   public void zm1IT1677( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12002DVCC_ExisC = T01IT3_A12002DVCC_ExisC[0] ;
         }
         else
         {
            Z12002DVCC_ExisC = A12002DVCC_ExisC ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z11941DVCC_AlmCo = A11941DVCC_AlmCo ;
         Z12002DVCC_ExisC = A12002DVCC_ExisC ;
         Z396EmprCod = A396EmprCod ;
         Z11935DVPrdNum = A11935DVPrdNum ;
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

   public void load1IT1677( )
   {
      /* Using cursor T01IT5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A11935DVPrdNum, Boolean.valueOf(n11941DVCC_AlmCo), Byte.valueOf(A11941DVCC_AlmCo)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1677 = (short)(1) ;
         A12002DVCC_ExisC = T01IT5_A12002DVCC_ExisC[0] ;
         n12002DVCC_ExisC = T01IT5_n12002DVCC_ExisC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12002DVCC_ExisC", GXutil.ltrimstr( A12002DVCC_ExisC, 12, 4));
         zm1IT1677( -1) ;
      }
      pr_default.close(3);
      onLoadActions1IT1677( ) ;
   }

   public void onLoadActions1IT1677( )
   {
   }

   public void checkExtendedTable1IT1677( )
   {
      nIsDirty_1677 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01IT4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A11935DVPrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Productos Data View", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DVPRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1IT1677( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod ,
                         String A11935DVPrdNum )
   {
      /* Using cursor T01IT6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A11935DVPrdNum});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Productos Data View", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DVPRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void getKey1IT1677( )
   {
      /* Using cursor T01IT7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A11935DVPrdNum, Boolean.valueOf(n11941DVCC_AlmCo), Byte.valueOf(A11941DVCC_AlmCo)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1677 = (short)(1) ;
      }
      else
      {
         RcdFound1677 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01IT3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A11935DVPrdNum, Boolean.valueOf(n11941DVCC_AlmCo), Byte.valueOf(A11941DVCC_AlmCo)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1IT1677( 1) ;
         RcdFound1677 = (short)(1) ;
         A11941DVCC_AlmCo = T01IT3_A11941DVCC_AlmCo[0] ;
         n11941DVCC_AlmCo = T01IT3_n11941DVCC_AlmCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11941DVCC_AlmCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11941DVCC_AlmCo), 2, 0));
         A12002DVCC_ExisC = T01IT3_A12002DVCC_ExisC[0] ;
         n12002DVCC_ExisC = T01IT3_n12002DVCC_ExisC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12002DVCC_ExisC", GXutil.ltrimstr( A12002DVCC_ExisC, 12, 4));
         A396EmprCod = T01IT3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11935DVPrdNum = T01IT3_A11935DVPrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
         Z396EmprCod = A396EmprCod ;
         Z11935DVPrdNum = A11935DVPrdNum ;
         Z11941DVCC_AlmCo = A11941DVCC_AlmCo ;
         sMode1677 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1IT1677( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1677 = (short)(0) ;
            initializeNonKey1IT1677( ) ;
         }
         Gx_mode = sMode1677 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1677 = (short)(0) ;
         initializeNonKey1IT1677( ) ;
         sMode1677 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1677 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1IT1677( ) ;
      if ( RcdFound1677 == 0 )
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
      RcdFound1677 = (short)(0) ;
      /* Using cursor T01IT8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A396EmprCod, A11935DVPrdNum, A11935DVPrdNum, A396EmprCod, Boolean.valueOf(n11941DVCC_AlmCo), Byte.valueOf(A11941DVCC_AlmCo)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01IT8_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01IT8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01IT8_A11935DVPrdNum[0], A11935DVPrdNum) < 0 ) || ( GXutil.strcmp(T01IT8_A11935DVPrdNum[0], A11935DVPrdNum) == 0 ) && ( GXutil.strcmp(T01IT8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IT8_A11941DVCC_AlmCo[0] < A11941DVCC_AlmCo ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01IT8_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01IT8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01IT8_A11935DVPrdNum[0], A11935DVPrdNum) > 0 ) || ( GXutil.strcmp(T01IT8_A11935DVPrdNum[0], A11935DVPrdNum) == 0 ) && ( GXutil.strcmp(T01IT8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IT8_A11941DVCC_AlmCo[0] > A11941DVCC_AlmCo ) ) )
         {
            A396EmprCod = T01IT8_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A11935DVPrdNum = T01IT8_A11935DVPrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
            A11941DVCC_AlmCo = T01IT8_A11941DVCC_AlmCo[0] ;
            n11941DVCC_AlmCo = T01IT8_n11941DVCC_AlmCo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11941DVCC_AlmCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11941DVCC_AlmCo), 2, 0));
            RcdFound1677 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1677 = (short)(0) ;
      /* Using cursor T01IT9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A396EmprCod, A11935DVPrdNum, A11935DVPrdNum, A396EmprCod, Boolean.valueOf(n11941DVCC_AlmCo), Byte.valueOf(A11941DVCC_AlmCo)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01IT9_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01IT9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01IT9_A11935DVPrdNum[0], A11935DVPrdNum) > 0 ) || ( GXutil.strcmp(T01IT9_A11935DVPrdNum[0], A11935DVPrdNum) == 0 ) && ( GXutil.strcmp(T01IT9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IT9_A11941DVCC_AlmCo[0] > A11941DVCC_AlmCo ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01IT9_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01IT9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01IT9_A11935DVPrdNum[0], A11935DVPrdNum) < 0 ) || ( GXutil.strcmp(T01IT9_A11935DVPrdNum[0], A11935DVPrdNum) == 0 ) && ( GXutil.strcmp(T01IT9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IT9_A11941DVCC_AlmCo[0] < A11941DVCC_AlmCo ) ) )
         {
            A396EmprCod = T01IT9_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A11935DVPrdNum = T01IT9_A11935DVPrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
            A11941DVCC_AlmCo = T01IT9_A11941DVCC_AlmCo[0] ;
            n11941DVCC_AlmCo = T01IT9_n11941DVCC_AlmCo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11941DVCC_AlmCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11941DVCC_AlmCo), 2, 0));
            RcdFound1677 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1IT1677( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1IT1677( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1677 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11935DVPrdNum, Z11935DVPrdNum) != 0 ) || ( A11941DVCC_AlmCo != Z11941DVCC_AlmCo ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A11935DVPrdNum = Z11935DVPrdNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
               A11941DVCC_AlmCo = Z11941DVCC_AlmCo ;
               n11941DVCC_AlmCo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11941DVCC_AlmCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11941DVCC_AlmCo), 2, 0));
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
               update1IT1677( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11935DVPrdNum, Z11935DVPrdNum) != 0 ) || ( A11941DVCC_AlmCo != Z11941DVCC_AlmCo ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1IT1677( ) ;
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
                  insert1IT1677( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11935DVPrdNum, Z11935DVPrdNum) != 0 ) || ( A11941DVCC_AlmCo != Z11941DVCC_AlmCo ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11935DVPrdNum = Z11935DVPrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
         A11941DVCC_AlmCo = Z11941DVCC_AlmCo ;
         n11941DVCC_AlmCo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11941DVCC_AlmCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11941DVCC_AlmCo), 2, 0));
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
      getKey1IT1677( ) ;
      if ( RcdFound1677 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11935DVPrdNum, Z11935DVPrdNum) != 0 ) || ( A11941DVCC_AlmCo != Z11941DVCC_AlmCo ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A11935DVPrdNum = Z11935DVPrdNum ;
            httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
            A11941DVCC_AlmCo = Z11941DVCC_AlmCo ;
            n11941DVCC_AlmCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11941DVCC_AlmCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11941DVCC_AlmCo), 2, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11935DVPrdNum, Z11935DVPrdNum) != 0 ) || ( A11941DVCC_AlmCo != Z11941DVCC_AlmCo ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdvprdalm");
      GX_FocusControl = edtDVCC_ExisC_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1IT0( ) ;
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
      if ( RcdFound1677 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtDVCC_ExisC_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1IT1677( ) ;
      if ( RcdFound1677 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDVCC_ExisC_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1IT1677( ) ;
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
      if ( RcdFound1677 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDVCC_ExisC_Internalname ;
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
      if ( RcdFound1677 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDVCC_ExisC_Internalname ;
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
      scanStart1IT1677( ) ;
      if ( RcdFound1677 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1677 != 0 )
         {
            scanNext1IT1677( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDVCC_ExisC_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1IT1677( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1IT1677( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01IT2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A11935DVPrdNum, Boolean.valueOf(n11941DVCC_AlmCo), Byte.valueOf(A11941DVCC_AlmCo)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"LVNPRDALM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z12002DVCC_ExisC, T01IT2_A12002DVCC_ExisC[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z12002DVCC_ExisC, T01IT2_A12002DVCC_ExisC[0]) != 0 )
            {
               GXutil.writeLogln("tdvprdalm:[seudo value changed for attri]"+"DVCC_ExisC");
               GXutil.writeLogRaw("Old: ",Z12002DVCC_ExisC);
               GXutil.writeLogRaw("Current: ",T01IT2_A12002DVCC_ExisC[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"LVNPRDALM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1IT1677( )
   {
      beforeValidate1IT1677( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IT1677( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1IT1677( 0) ;
         checkOptimisticConcurrency1IT1677( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IT1677( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1IT1677( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IT10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n11941DVCC_AlmCo), Byte.valueOf(A11941DVCC_AlmCo), Boolean.valueOf(n12002DVCC_ExisC), A12002DVCC_ExisC, A396EmprCod, A11935DVPrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNPRDALM");
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
                        resetCaption1IT0( ) ;
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
            load1IT1677( ) ;
         }
         endLevel1IT1677( ) ;
      }
      closeExtendedTableCursors1IT1677( ) ;
   }

   public void update1IT1677( )
   {
      beforeValidate1IT1677( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IT1677( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IT1677( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IT1677( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1IT1677( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IT11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n12002DVCC_ExisC), A12002DVCC_ExisC, A396EmprCod, A11935DVPrdNum, Boolean.valueOf(n11941DVCC_AlmCo), Byte.valueOf(A11941DVCC_AlmCo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNPRDALM");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"LVNPRDALM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1IT1677( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1IT0( ) ;
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
         endLevel1IT1677( ) ;
      }
      closeExtendedTableCursors1IT1677( ) ;
   }

   public void deferredUpdate1IT1677( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1IT1677( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IT1677( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1IT1677( ) ;
         afterConfirm1IT1677( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1IT1677( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01IT12 */
               pr_default.execute(10, new Object[] {A396EmprCod, A11935DVPrdNum, Boolean.valueOf(n11941DVCC_AlmCo), Byte.valueOf(A11941DVCC_AlmCo)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNPRDALM");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1677 == 0 )
                     {
                        initAll1IT1677( ) ;
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
                     resetCaption1IT0( ) ;
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
      sMode1677 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1IT1677( ) ;
      Gx_mode = sMode1677 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1IT1677( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01IT13 */
         pr_default.execute(11, new Object[] {A396EmprCod, A11935DVPrdNum, Boolean.valueOf(n11941DVCC_AlmCo), Byte.valueOf(A11941DVCC_AlmCo)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DVCCAlm", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
      }
   }

   public void endLevel1IT1677( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1IT1677( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdvprdalm");
         if ( AnyError == 0 )
         {
            confirmValues1IT0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdvprdalm");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1IT1677( )
   {
      /* Using cursor T01IT14 */
      pr_default.execute(12);
      RcdFound1677 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1677 = (short)(1) ;
         A396EmprCod = T01IT14_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11935DVPrdNum = T01IT14_A11935DVPrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
         A11941DVCC_AlmCo = T01IT14_A11941DVCC_AlmCo[0] ;
         n11941DVCC_AlmCo = T01IT14_n11941DVCC_AlmCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11941DVCC_AlmCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11941DVCC_AlmCo), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1IT1677( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound1677 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1677 = (short)(1) ;
         A396EmprCod = T01IT14_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11935DVPrdNum = T01IT14_A11935DVPrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
         A11941DVCC_AlmCo = T01IT14_A11941DVCC_AlmCo[0] ;
         n11941DVCC_AlmCo = T01IT14_n11941DVCC_AlmCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11941DVCC_AlmCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11941DVCC_AlmCo), 2, 0));
      }
   }

   public void scanEnd1IT1677( )
   {
      pr_default.close(12);
   }

   public void afterConfirm1IT1677( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1IT1677( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1IT1677( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1IT1677( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1IT1677( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1IT1677( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1IT1677( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDVPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdNum_Enabled), 5, 0), true);
      edtDVCC_AlmCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCC_AlmCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCC_AlmCo_Enabled), 5, 0), true);
      edtDVCC_ExisC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCC_ExisC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCC_ExisC_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1IT1677( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1IT0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdvprdalm", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11935DVPrdNum", GXutil.rtrim( Z11935DVPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11941DVCC_AlmCo", GXutil.ltrim( localUtil.ntoc( Z11941DVCC_AlmCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12002DVCC_ExisC", GXutil.ltrim( localUtil.ntoc( Z12002DVCC_ExisC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tdvprdalm", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TDVPrdAlm" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Existencias por Almacen DATA View", "") ;
   }

   public void initializeNonKey1IT1677( )
   {
      A12002DVCC_ExisC = DecimalUtil.ZERO ;
      n12002DVCC_ExisC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12002DVCC_ExisC", GXutil.ltrimstr( A12002DVCC_ExisC, 12, 4));
      Z12002DVCC_ExisC = DecimalUtil.ZERO ;
   }

   public void initAll1IT1677( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A11935DVPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
      A11941DVCC_AlmCo = (byte)(0) ;
      n11941DVCC_AlmCo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11941DVCC_AlmCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11941DVCC_AlmCo), 2, 0));
      initializeNonKey1IT1677( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101633053", true, true);
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
      httpContext.AddJavascriptSource("tdvprdalm.js", "?20266101633053", false, true);
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
      edtDVPrdNum_Internalname = "DVPRDNUM" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtDVCC_AlmCo_Internalname = "DVCC_ALMCO" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtDVCC_ExisC_Internalname = "DVCC_EXISC" ;
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
      Form.setCaption( httpContext.getMessage( "Existencias por Almacen DATA View", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtDVCC_ExisC_Jsonclick = "" ;
      edtDVCC_ExisC_Backcolor = (int)(0xFFFFFF) ;
      edtDVCC_ExisC_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtDVCC_AlmCo_Jsonclick = "" ;
      edtDVCC_AlmCo_Backcolor = (int)(0xFFFFFF) ;
      edtDVCC_AlmCo_Enabled = 1 ;
      edtDVPrdNum_Jsonclick = "" ;
      edtDVPrdNum_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdNum_Enabled = 1 ;
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
      /* Using cursor T01IT15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A11935DVPrdNum});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Productos Data View", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DVPRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(13);
      GX_FocusControl = edtDVCC_ExisC_Internalname ;
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

   public void valid_Dvprdnum( )
   {
      /* Using cursor T01IT15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A11935DVPrdNum});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Productos Data View", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DVPRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Dvcc_almco( )
   {
      n11941DVCC_AlmCo = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12002DVCC_ExisC", GXutil.ltrim( localUtil.ntoc( A12002DVCC_ExisC, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11935DVPrdNum", GXutil.rtrim( Z11935DVPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11941DVCC_AlmCo", GXutil.ltrim( localUtil.ntoc( Z11941DVCC_AlmCo, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12002DVCC_ExisC", GXutil.ltrim( localUtil.ntoc( Z12002DVCC_ExisC, (byte)(12), (byte)(4), ".", "")));
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
      setEventMetadata("VALID_DVPRDNUM","{handler:'valid_Dvprdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11935DVPrdNum',fld:'DVPRDNUM',pic:''}]");
      setEventMetadata("VALID_DVPRDNUM",",oparms:[]}");
      setEventMetadata("VALID_DVCC_ALMCO","{handler:'valid_Dvcc_almco',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11935DVPrdNum',fld:'DVPRDNUM',pic:''},{av:'A11941DVCC_AlmCo',fld:'DVCC_ALMCO',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_DVCC_ALMCO",",oparms:[{av:'A12002DVCC_ExisC',fld:'DVCC_EXISC',pic:'ZZZZZZ9.9999'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z11935DVPrdNum'},{av:'Z11941DVCC_AlmCo'},{av:'Z12002DVCC_ExisC'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z11935DVPrdNum = "" ;
      Z12002DVCC_ExisC = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A11935DVPrdNum = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A12002DVCC_ExisC = DecimalUtil.ZERO ;
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
      T01IT5_A11941DVCC_AlmCo = new byte[1] ;
      T01IT5_n11941DVCC_AlmCo = new boolean[] {false} ;
      T01IT5_A12002DVCC_ExisC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IT5_n12002DVCC_ExisC = new boolean[] {false} ;
      T01IT5_A396EmprCod = new String[] {""} ;
      T01IT5_A11935DVPrdNum = new String[] {""} ;
      T01IT4_A396EmprCod = new String[] {""} ;
      T01IT6_A396EmprCod = new String[] {""} ;
      T01IT7_A396EmprCod = new String[] {""} ;
      T01IT7_A11935DVPrdNum = new String[] {""} ;
      T01IT7_A11941DVCC_AlmCo = new byte[1] ;
      T01IT7_n11941DVCC_AlmCo = new boolean[] {false} ;
      T01IT3_A11941DVCC_AlmCo = new byte[1] ;
      T01IT3_n11941DVCC_AlmCo = new boolean[] {false} ;
      T01IT3_A12002DVCC_ExisC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IT3_n12002DVCC_ExisC = new boolean[] {false} ;
      T01IT3_A396EmprCod = new String[] {""} ;
      T01IT3_A11935DVPrdNum = new String[] {""} ;
      sMode1677 = "" ;
      T01IT8_A396EmprCod = new String[] {""} ;
      T01IT8_A11935DVPrdNum = new String[] {""} ;
      T01IT8_A11941DVCC_AlmCo = new byte[1] ;
      T01IT8_n11941DVCC_AlmCo = new boolean[] {false} ;
      T01IT9_A396EmprCod = new String[] {""} ;
      T01IT9_A11935DVPrdNum = new String[] {""} ;
      T01IT9_A11941DVCC_AlmCo = new byte[1] ;
      T01IT9_n11941DVCC_AlmCo = new boolean[] {false} ;
      T01IT2_A11941DVCC_AlmCo = new byte[1] ;
      T01IT2_n11941DVCC_AlmCo = new boolean[] {false} ;
      T01IT2_A12002DVCC_ExisC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IT2_n12002DVCC_ExisC = new boolean[] {false} ;
      T01IT2_A396EmprCod = new String[] {""} ;
      T01IT2_A11935DVPrdNum = new String[] {""} ;
      T01IT13_A396EmprCod = new String[] {""} ;
      T01IT13_A11935DVPrdNum = new String[] {""} ;
      T01IT13_A11936DVCC_Lin = new long[1] ;
      T01IT14_A396EmprCod = new String[] {""} ;
      T01IT14_A11935DVPrdNum = new String[] {""} ;
      T01IT14_A11941DVCC_AlmCo = new byte[1] ;
      T01IT14_n11941DVCC_AlmCo = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01IT15_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ11935DVPrdNum = "" ;
      ZZ12002DVCC_ExisC = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdvprdalm__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdvprdalm__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdvprdalm__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdvprdalm__default(),
         new Object[] {
             new Object[] {
            T01IT2_A11941DVCC_AlmCo, T01IT2_A12002DVCC_ExisC, T01IT2_n12002DVCC_ExisC, T01IT2_A396EmprCod, T01IT2_A11935DVPrdNum
            }
            , new Object[] {
            T01IT3_A11941DVCC_AlmCo, T01IT3_A12002DVCC_ExisC, T01IT3_n12002DVCC_ExisC, T01IT3_A396EmprCod, T01IT3_A11935DVPrdNum
            }
            , new Object[] {
            T01IT4_A396EmprCod
            }
            , new Object[] {
            T01IT5_A11941DVCC_AlmCo, T01IT5_A12002DVCC_ExisC, T01IT5_n12002DVCC_ExisC, T01IT5_A396EmprCod, T01IT5_A11935DVPrdNum
            }
            , new Object[] {
            T01IT6_A396EmprCod
            }
            , new Object[] {
            T01IT7_A396EmprCod, T01IT7_A11935DVPrdNum, T01IT7_A11941DVCC_AlmCo
            }
            , new Object[] {
            T01IT8_A396EmprCod, T01IT8_A11935DVPrdNum, T01IT8_A11941DVCC_AlmCo
            }
            , new Object[] {
            T01IT9_A396EmprCod, T01IT9_A11935DVPrdNum, T01IT9_A11941DVCC_AlmCo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01IT13_A396EmprCod, T01IT13_A11935DVPrdNum, T01IT13_A11936DVCC_Lin
            }
            , new Object[] {
            T01IT14_A396EmprCod, T01IT14_A11935DVPrdNum, T01IT14_A11941DVCC_AlmCo
            }
            , new Object[] {
            T01IT15_A396EmprCod
            }
         }
      );
   }

   private byte Z11941DVCC_AlmCo ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A11941DVCC_AlmCo ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ11941DVCC_AlmCo ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1677 ;
   private short nIsDirty_1677 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtDVPrdNum_Enabled ;
   private int edtDVCC_AlmCo_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtDVCC_ExisC_Enabled ;
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
   private int edtDVCC_ExisC_Backcolor ;
   private int edtDVCC_AlmCo_Backcolor ;
   private int edtDVPrdNum_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private java.math.BigDecimal Z12002DVCC_ExisC ;
   private java.math.BigDecimal A12002DVCC_ExisC ;
   private java.math.BigDecimal ZZ12002DVCC_ExisC ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z11935DVPrdNum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A11935DVPrdNum ;
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
   private String edtDVPrdNum_Internalname ;
   private String edtDVPrdNum_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtDVCC_AlmCo_Internalname ;
   private String edtDVCC_AlmCo_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtDVCC_ExisC_Internalname ;
   private String edtDVCC_ExisC_Jsonclick ;
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
   private String sMode1677 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ11935DVPrdNum ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n11941DVCC_AlmCo ;
   private boolean n12002DVCC_ExisC ;
   private IDataStoreProvider pr_default ;
   private byte[] T01IT5_A11941DVCC_AlmCo ;
   private boolean[] T01IT5_n11941DVCC_AlmCo ;
   private java.math.BigDecimal[] T01IT5_A12002DVCC_ExisC ;
   private boolean[] T01IT5_n12002DVCC_ExisC ;
   private String[] T01IT5_A396EmprCod ;
   private String[] T01IT5_A11935DVPrdNum ;
   private String[] T01IT4_A396EmprCod ;
   private String[] T01IT6_A396EmprCod ;
   private String[] T01IT7_A396EmprCod ;
   private String[] T01IT7_A11935DVPrdNum ;
   private byte[] T01IT7_A11941DVCC_AlmCo ;
   private boolean[] T01IT7_n11941DVCC_AlmCo ;
   private byte[] T01IT3_A11941DVCC_AlmCo ;
   private boolean[] T01IT3_n11941DVCC_AlmCo ;
   private java.math.BigDecimal[] T01IT3_A12002DVCC_ExisC ;
   private boolean[] T01IT3_n12002DVCC_ExisC ;
   private String[] T01IT3_A396EmprCod ;
   private String[] T01IT3_A11935DVPrdNum ;
   private String[] T01IT8_A396EmprCod ;
   private String[] T01IT8_A11935DVPrdNum ;
   private byte[] T01IT8_A11941DVCC_AlmCo ;
   private boolean[] T01IT8_n11941DVCC_AlmCo ;
   private String[] T01IT9_A396EmprCod ;
   private String[] T01IT9_A11935DVPrdNum ;
   private byte[] T01IT9_A11941DVCC_AlmCo ;
   private boolean[] T01IT9_n11941DVCC_AlmCo ;
   private byte[] T01IT2_A11941DVCC_AlmCo ;
   private boolean[] T01IT2_n11941DVCC_AlmCo ;
   private java.math.BigDecimal[] T01IT2_A12002DVCC_ExisC ;
   private boolean[] T01IT2_n12002DVCC_ExisC ;
   private String[] T01IT2_A396EmprCod ;
   private String[] T01IT2_A11935DVPrdNum ;
   private String[] T01IT13_A396EmprCod ;
   private String[] T01IT13_A11935DVPrdNum ;
   private long[] T01IT13_A11936DVCC_Lin ;
   private String[] T01IT14_A396EmprCod ;
   private String[] T01IT14_A11935DVPrdNum ;
   private byte[] T01IT14_A11941DVCC_AlmCo ;
   private boolean[] T01IT14_n11941DVCC_AlmCo ;
   private String[] T01IT15_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdvprdalm__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdvprdalm__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdvprdalm__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdvprdalm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01IT2", "SELECT CC_AlmCod AS DVCC_AlmCo, CC_ExisCC, Emprcod AS EmprCod, Prdnum AS DVPrdNum FROM LVNPRDALM WHERE Emprcod = ? AND Prdnum = ? AND CC_AlmCod = ?  FOR UPDATE OF CC_ExisCC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IT3", "SELECT CC_AlmCod AS DVCC_AlmCo, CC_ExisCC, Emprcod AS EmprCod, Prdnum AS DVPrdNum FROM LVNPRDALM WHERE Emprcod = ? AND Prdnum = ? AND CC_AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IT4", "SELECT Emprcod AS EmprCod FROM LVNDVPRODUC WHERE Emprcod = ? AND Prdnum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IT5", "SELECT /*+ FIRST_ROWS(100) */ TM1.CC_AlmCod AS DVCC_AlmCo, TM1.CC_ExisCC, TM1.Emprcod AS EmprCod, TM1.Prdnum AS DVPrdNum FROM LVNPRDALM TM1 WHERE TM1.Emprcod = ? and TM1.Prdnum = ? and TM1.CC_AlmCod = ? ORDER BY TM1.Emprcod, TM1.Prdnum, TM1.CC_AlmCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IT6", "SELECT Emprcod AS EmprCod FROM LVNDVPRODUC WHERE Emprcod = ? AND Prdnum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IT7", "SELECT /*+ FIRST_ROWS(1) */ Emprcod AS EmprCod, Prdnum AS DVPrdNum, CC_AlmCod AS DVCC_AlmCo FROM LVNPRDALM WHERE Emprcod = ? AND Prdnum = ? AND CC_AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IT8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Emprcod AS EmprCod, Prdnum AS DVPrdNum, CC_AlmCod AS DVCC_AlmCo FROM LVNPRDALM WHERE ( Emprcod > ? or Emprcod = ? and Prdnum > ? or Prdnum = ? and Emprcod = ? and CC_AlmCod > ?) ORDER BY Emprcod, Prdnum, CC_AlmCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IT9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Emprcod AS EmprCod, Prdnum AS DVPrdNum, CC_AlmCod AS DVCC_AlmCo FROM LVNPRDALM WHERE ( Emprcod < ? or Emprcod = ? and Prdnum < ? or Prdnum = ? and Emprcod = ? and CC_AlmCod < ?) ORDER BY Emprcod DESC, Prdnum DESC, CC_AlmCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01IT10", "INSERT INTO LVNPRDALM(CC_AlmCod, CC_ExisCC, Emprcod, Prdnum) VALUES(?, ?, ?, ?)", GX_NOMASK, "LVNPRDALM")
         ,new UpdateCursor("T01IT11", "UPDATE LVNPRDALM SET CC_ExisCC=?  WHERE Emprcod = ? AND Prdnum = ? AND CC_AlmCod = ?", GX_NOMASK, "LVNPRDALM")
         ,new UpdateCursor("T01IT12", "DELETE FROM LVNPRDALM  WHERE Emprcod = ? AND Prdnum = ? AND CC_AlmCod = ?", GX_NOMASK, "LVNPRDALM")
         ,new ForEachCursor("T01IT13", "SELECT * FROM (SELECT Emprcod AS EmprCod, Prdnum AS DVPrdNum, CC_lin FROM LVNCCALM WHERE Emprcod = ? AND Prdnum = ? AND CC_AlmCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IT14", "SELECT /*+ FIRST_ROWS(100) */ Emprcod AS EmprCod, Prdnum AS DVPrdNum, CC_AlmCod AS DVCC_AlmCo FROM LVNPRDALM ORDER BY Emprcod, Prdnum, CC_AlmCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IT15", "SELECT Emprcod AS EmprCod FROM LVNDVPRODUC WHERE Emprcod = ? AND Prdnum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 13 :
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
               stmt.setString(2, (String)parms[1], 6);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[6]).byteValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[6]).byteValue());
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 4);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setString(4, (String)parms[5], 6);
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 4);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[5]).byteValue());
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

