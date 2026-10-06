package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tplnacc_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13183PLNColor = (byte)(GXutil.lval( httpContext.GetPar( "PLNColor"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13183PLNColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13183PLNColor), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_12( A396EmprCod, A13183PLNColor) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
      {
         gxnrgrid1_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Plan de ACCION", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = cmbPLNProceso.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgrid1_newrow_invoke( )
   {
      nRC_GXsfl_55 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_55"))) ;
      nGXsfl_55_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_55_idx"))) ;
      sGXsfl_55_idx = httpContext.GetPar( "sGXsfl_55_idx") ;
      A13187PLNUltCarg = (short)(GXutil.lval( httpContext.GetPar( "PLNUltCarg"))) ;
      n13187PLNUltCarg = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public tplnacc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tplnacc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tplnacc_impl.class ));
   }

   public tplnacc_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbPLNProceso = new HTMLChoice();
      cmbPLNTipoCru = new HTMLChoice();
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
      if ( cmbPLNProceso.getItemCount() > 0 )
      {
         A13181PLNProceso = cmbPLNProceso.getValidValue(A13181PLNProceso) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13181PLNProceso", A13181PLNProceso);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPLNProceso.setValue( GXutil.rtrim( A13181PLNProceso) );
         httpContext.ajax_rsp_assign_prop("", false, cmbPLNProceso.getInternalname(), "Values", cmbPLNProceso.ToJavascriptSource(), true);
      }
      if ( cmbPLNTipoCru.getItemCount() > 0 )
      {
         A13182PLNTipoCru = (byte)(GXutil.lval( cmbPLNTipoCru.getValidValue(GXutil.trim( GXutil.str( A13182PLNTipoCru, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13182PLNTipoCru", GXutil.str( A13182PLNTipoCru, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPLNTipoCru.setValue( GXutil.trim( GXutil.str( A13182PLNTipoCru, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbPLNTipoCru.getInternalname(), "Values", cmbPLNTipoCru.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLNACC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLNACC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLNACC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLNACC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPLNACC.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLNACC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPLNACC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLNACC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPLNACC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Normal o Especial", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLNACC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPLNProceso, cmbPLNProceso.getInternalname(), GXutil.rtrim( A13181PLNProceso), 1, cmbPLNProceso.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPLNProceso.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "", true, (byte)(0), "HLP_TPLNACC.htm");
      cmbPLNProceso.setValue( GXutil.rtrim( A13181PLNProceso) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPLNProceso.getInternalname(), "Values", cmbPLNProceso.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "MTS o MTO", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLNACC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPLNTipoCru, cmbPLNTipoCru.getInternalname(), GXutil.trim( GXutil.str( A13182PLNTipoCru, 1, 0)), 1, cmbPLNTipoCru.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbPLNTipoCru.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "", true, (byte)(0), "HLP_TPLNACC.htm");
      cmbPLNTipoCru.setValue( GXutil.trim( GXutil.str( A13182PLNTipoCru, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPLNTipoCru.getInternalname(), "Values", cmbPLNTipoCru.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Color, Intensidad", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLNACC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPLNColor_Internalname, GXutil.ltrim( localUtil.ntoc( A13183PLNColor, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPLNColor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13183PLNColor), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A13183PLNColor), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPLNColor_Jsonclick, 0, "", "", "", "", "", 1, edtPLNColor_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPLNACC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLNACC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLNACC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPLNColorDs_Internalname, GXutil.rtrim( A13186PLNColorDs), GXutil.rtrim( localUtil.format( A13186PLNColorDs, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPLNColorDs_Jsonclick, 0, "", "", "", "", "", 1, edtPLNColorDs_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPLNACC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Ultima Carga", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLNACC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPLNUltCarg_Internalname, GXutil.ltrim( localUtil.ntoc( A13187PLNUltCarg, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPLNUltCarg_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13187PLNUltCarg), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13187PLNUltCarg), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPLNUltCarg_Jsonclick, 0, "", "", "", "", "", 1, edtPLNUltCarg_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPLNACC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol55( ) ;
      nGXsfl_55_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1805 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1805 = (short)(1) ;
            scanStart1N31805( ) ;
            while ( RcdFound1805 != 0 )
            {
               init_level_properties1805( ) ;
               getByPrimaryKey1N31805( ) ;
               addRow1N31805( ) ;
               scanNext1N31805( ) ;
            }
            scanEnd1N31805( ) ;
            nBlankRcdCount1805 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B13187PLNUltCarg = A13187PLNUltCarg ;
         n13187PLNUltCarg = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
         standaloneNotModal1N31805( ) ;
         standaloneModal1N31805( ) ;
         sMode1805 = Gx_mode ;
         while ( nGXsfl_55_idx < nRC_GXsfl_55 )
         {
            bGXsfl_55_Refreshing = true ;
            readRow1N31805( ) ;
            edtavnRcdDeleted_1805_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1805_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1805_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1805_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtPLNLinea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLNLINEA_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPLNLinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLNLinea_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtPLNCarga_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLNCARGA_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPLNCarga_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLNCarga_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtPLNCargaF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLNCARGAF_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPLNCargaF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLNCargaF_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtPLNDias_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLNDIAS_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPLNDias_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLNDias_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            if ( ( nRcdExists_1805 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1N31805( ) ;
            }
            sendRow1N31805( ) ;
            bGXsfl_55_Refreshing = false ;
         }
         Gx_mode = sMode1805 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A13187PLNUltCarg = B13187PLNUltCarg ;
         n13187PLNUltCarg = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1805 = (short)(5) ;
         nRcdExists_1805 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1N31805( ) ;
            while ( RcdFound1805 != 0 )
            {
               sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_551805( ) ;
               init_level_properties1805( ) ;
               standaloneNotModal1N31805( ) ;
               getByPrimaryKey1N31805( ) ;
               standaloneModal1N31805( ) ;
               addRow1N31805( ) ;
               scanNext1N31805( ) ;
            }
            scanEnd1N31805( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1805 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_551805( ) ;
      initAll1N31805( ) ;
      init_level_properties1805( ) ;
      B13187PLNUltCarg = A13187PLNUltCarg ;
      n13187PLNUltCarg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
      nRcdExists_1805 = (short)(0) ;
      nIsMod_1805 = (short)(0) ;
      nRcdDeleted_1805 = (short)(0) ;
      nBlankRcdCount1805 = (short)(nBlankRcdUsr1805+nBlankRcdCount1805) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1805 > 0 )
      {
         standaloneNotModal1N31805( ) ;
         standaloneModal1N31805( ) ;
         addRow1N31805( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtPLNLinea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1805 = (short)(nBlankRcdCount1805-1) ;
      }
      Gx_mode = sMode1805 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A13187PLNUltCarg = B13187PLNUltCarg ;
      n13187PLNUltCarg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container, subGrid1_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
      }
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLNACC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLNACC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLNACC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLNACC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPLNACC.htm");
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
      e111N32 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z13181PLNProceso = httpContext.cgiGet( "Z13181PLNProceso") ;
            Z13182PLNTipoCru = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13182PLNTipoCru"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13183PLNColor = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13183PLNColor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13187PLNUltCarg = (short)(localUtil.ctol( httpContext.cgiGet( "Z13187PLNUltCarg"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O13187PLNUltCarg = (short)(localUtil.ctol( httpContext.cgiGet( "O13187PLNUltCarg"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV37Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_date = localUtil.ctod( httpContext.cgiGet( "vTODAY"), 0) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            cmbPLNProceso.setName( cmbPLNProceso.getInternalname() );
            cmbPLNProceso.setValue( httpContext.cgiGet( cmbPLNProceso.getInternalname()) );
            A13181PLNProceso = httpContext.cgiGet( cmbPLNProceso.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13181PLNProceso", A13181PLNProceso);
            cmbPLNTipoCru.setName( cmbPLNTipoCru.getInternalname() );
            cmbPLNTipoCru.setValue( httpContext.cgiGet( cmbPLNTipoCru.getInternalname()) );
            A13182PLNTipoCru = (byte)(GXutil.lval( httpContext.cgiGet( cmbPLNTipoCru.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13182PLNTipoCru", GXutil.str( A13182PLNTipoCru, 1, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPLNColor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPLNColor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PLNCOLOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPLNColor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13183PLNColor = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13183PLNColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13183PLNColor), 2, 0));
            }
            else
            {
               A13183PLNColor = (byte)(localUtil.ctol( httpContext.cgiGet( edtPLNColor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13183PLNColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13183PLNColor), 2, 0));
            }
            A13186PLNColorDs = httpContext.cgiGet( edtPLNColorDs_Internalname) ;
            n13186PLNColorDs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13186PLNColorDs", A13186PLNColorDs);
            A13187PLNUltCarg = (short)(localUtil.ctol( httpContext.cgiGet( edtPLNUltCarg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13187PLNUltCarg = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            /* Check if conditions changed and reset current page numbers */
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
               A13181PLNProceso = httpContext.GetPar( "PLNProceso") ;
               httpContext.ajax_rsp_assign_attri("", false, "A13181PLNProceso", A13181PLNProceso);
               A13182PLNTipoCru = (byte)(GXutil.lval( httpContext.GetPar( "PLNTipoCru"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13182PLNTipoCru", GXutil.str( A13182PLNTipoCru, 1, 0));
               A13183PLNColor = (byte)(GXutil.lval( httpContext.GetPar( "PLNColor"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13183PLNColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13183PLNColor), 2, 0));
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
                        e111N32 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'EXPORTAR'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Exportar' */
                        e121N32 ();
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
                     sEvtType = GXutil.right( sEvt, 4) ;
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
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
            initAll1N31804( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1805_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1805_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      disableAttributes1N31804( ) ;
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

   public void confirm_1N30( )
   {
      beforeValidate1N31804( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1N31804( ) ;
         }
         else
         {
            checkExtendedTable1N31804( ) ;
            if ( AnyError == 0 )
            {
               zm1N31804( 11) ;
               zm1N31804( 12) ;
            }
            closeExtendedTableCursors1N31804( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1804 = Gx_mode ;
         confirm_1N31805( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1804 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1804 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1N30( ) ;
      }
   }

   public void confirm_1N31805( )
   {
      s13187PLNUltCarg = O13187PLNUltCarg ;
      n13187PLNUltCarg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1N31805( ) ;
         if ( ( nRcdExists_1805 != 0 ) || ( nIsMod_1805 != 0 ) )
         {
            getKey1N31805( ) ;
            if ( ( nRcdExists_1805 == 0 ) && ( nRcdDeleted_1805 == 0 ) )
            {
               if ( RcdFound1805 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1N31805( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1N31805( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1N31805( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O13187PLNUltCarg = A13187PLNUltCarg ;
                     n13187PLNUltCarg = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "PLNLINEA_" + sGXsfl_55_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPLNLinea_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1805 != 0 )
               {
                  if ( nRcdDeleted_1805 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1N31805( ) ;
                     load1N31805( ) ;
                     beforeValidate1N31805( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1N31805( ) ;
                        O13187PLNUltCarg = A13187PLNUltCarg ;
                        n13187PLNUltCarg = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1805 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1N31805( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1N31805( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1N31805( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O13187PLNUltCarg = A13187PLNUltCarg ;
                           n13187PLNUltCarg = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1805 == 0 )
                  {
                     GXCCtl = "PLNLINEA_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPLNLinea_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1805_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1805, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPLNLinea_Internalname, GXutil.ltrim( localUtil.ntoc( A13188PLNLinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPLNCarga_Internalname, GXutil.ltrim( localUtil.ntoc( A13184PLNCarga, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPLNCargaF_Internalname, GXutil.ltrim( localUtil.ntoc( A13189PLNCargaF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPLNDias_Internalname, GXutil.ltrim( localUtil.ntoc( A13185PLNDias, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13188PLNLinea_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z13188PLNLinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13184PLNCarga_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z13184PLNCarga, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13189PLNCargaF_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z13189PLNCargaF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13185PLNDias_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z13185PLNDias, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1805_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1805, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1805_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1805, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1805_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1805, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1805 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1805_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1805_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLNLINEA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPLNLinea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLNCARGA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPLNCarga_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLNCARGAF_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPLNCargaF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLNDIAS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPLNDias_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O13187PLNUltCarg = s13187PLNUltCarg ;
      n13187PLNUltCarg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1N30( )
   {
   }

   public void e111N32( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tplnacc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV37Pgmname, (byte)(99), GXv_char2) ;
      tplnacc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tplnacc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tplnacc_impl.this.A396EmprCod = GXv_char2[0] ;
      tplnacc_impl.this.AV11EmprNom = GXv_char3[0] ;
      tplnacc_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e121N32( )
   {
      /* 'Exportar' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A407EmprNom ;
      GXv_char2[0] = AV34name ;
      new app.pinfplnaccion(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tplnacc_impl.this.A396EmprCod = GXv_char4[0] ;
      tplnacc_impl.this.A407EmprNom = GXv_char3[0] ;
      tplnacc_impl.this.AV34name = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV34name", AV34name);
      AV33txt = httpContext.getMessage( "run rundll32 url.dll,FileProtocolHandler \"", "") + GXutil.trim( AV34name) + "\"" ;
      /*  Sending Event outputs  */
   }

   public void zm1N31804( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13187PLNUltCarg = T01N35_A13187PLNUltCarg[0] ;
         }
         else
         {
            Z13187PLNUltCarg = A13187PLNUltCarg ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z13181PLNProceso = A13181PLNProceso ;
         Z13182PLNTipoCru = A13182PLNTipoCru ;
         Z13187PLNUltCarg = A13187PLNUltCarg ;
         Z396EmprCod = A396EmprCod ;
         Z13183PLNColor = A13183PLNColor ;
         Z407EmprNom = A407EmprNom ;
         Z13186PLNColorDs = A13186PLNColorDs ;
      }
   }

   public void standaloneNotModal( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPLNUltCarg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLNUltCarg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLNUltCarg_Enabled), 5, 0), true);
      AV37Pgmname = "TPLNACC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Pgmname", AV37Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPLNUltCarg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLNUltCarg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLNUltCarg_Enabled), 5, 0), true);
      /* Using cursor T01N36 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01N36_A407EmprNom[0] ;
      n407EmprNom = T01N36_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
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

   public void load1N31804( )
   {
      /* Using cursor T01N38 */
      pr_default.execute(6, new Object[] {A396EmprCod, A13181PLNProceso, Byte.valueOf(A13182PLNTipoCru), Byte.valueOf(A13183PLNColor)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1804 = (short)(1) ;
         A407EmprNom = T01N38_A407EmprNom[0] ;
         n407EmprNom = T01N38_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A13186PLNColorDs = T01N38_A13186PLNColorDs[0] ;
         n13186PLNColorDs = T01N38_n13186PLNColorDs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13186PLNColorDs", A13186PLNColorDs);
         A13187PLNUltCarg = T01N38_A13187PLNUltCarg[0] ;
         n13187PLNUltCarg = T01N38_n13187PLNUltCarg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
         zm1N31804( -10) ;
      }
      pr_default.close(6);
      onLoadActions1N31804( ) ;
   }

   public void onLoadActions1N31804( )
   {
   }

   public void checkExtendedTable1N31804( )
   {
      nIsDirty_1804 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01N37 */
      pr_default.execute(5, new Object[] {A396EmprCod, Byte.valueOf(A13183PLNColor)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Color", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PLNCOLOR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPLNColor_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13186PLNColorDs = T01N37_A13186PLNColorDs[0] ;
      n13186PLNColorDs = T01N37_n13186PLNColorDs[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13186PLNColorDs", A13186PLNColorDs);
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1N31804( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_12( String A396EmprCod ,
                          byte A13183PLNColor )
   {
      /* Using cursor T01N39 */
      pr_default.execute(7, new Object[] {A396EmprCod, Byte.valueOf(A13183PLNColor)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Color", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PLNCOLOR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPLNColor_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13186PLNColorDs = T01N39_A13186PLNColorDs[0] ;
      n13186PLNColorDs = T01N39_n13186PLNColorDs[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13186PLNColorDs", A13186PLNColorDs);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13186PLNColorDs))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey1N31804( )
   {
      /* Using cursor T01N310 */
      pr_default.execute(8, new Object[] {A396EmprCod, A13181PLNProceso, Byte.valueOf(A13182PLNTipoCru), Byte.valueOf(A13183PLNColor)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1804 = (short)(1) ;
      }
      else
      {
         RcdFound1804 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01N35 */
      pr_default.execute(3, new Object[] {A396EmprCod, A13181PLNProceso, Byte.valueOf(A13182PLNTipoCru), Byte.valueOf(A13183PLNColor)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01N35_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1N31804( 10) ;
         RcdFound1804 = (short)(1) ;
         A13181PLNProceso = T01N35_A13181PLNProceso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13181PLNProceso", A13181PLNProceso);
         A13182PLNTipoCru = T01N35_A13182PLNTipoCru[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13182PLNTipoCru", GXutil.str( A13182PLNTipoCru, 1, 0));
         A13187PLNUltCarg = T01N35_A13187PLNUltCarg[0] ;
         n13187PLNUltCarg = T01N35_n13187PLNUltCarg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
         A13183PLNColor = T01N35_A13183PLNColor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13183PLNColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13183PLNColor), 2, 0));
         O13187PLNUltCarg = A13187PLNUltCarg ;
         n13187PLNUltCarg = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z13181PLNProceso = A13181PLNProceso ;
         Z13182PLNTipoCru = A13182PLNTipoCru ;
         Z13183PLNColor = A13183PLNColor ;
         sMode1804 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1N31804( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1804 = (short)(0) ;
            initializeNonKey1N31804( ) ;
         }
         Gx_mode = sMode1804 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1804 = (short)(0) ;
         initializeNonKey1N31804( ) ;
         sMode1804 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1804 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1N31804( ) ;
      if ( RcdFound1804 == 0 )
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
      RcdFound1804 = (short)(0) ;
      /* Using cursor T01N311 */
      pr_default.execute(9, new Object[] {A13181PLNProceso, A13181PLNProceso, Byte.valueOf(A13182PLNTipoCru), Byte.valueOf(A13182PLNTipoCru), A13181PLNProceso, Byte.valueOf(A13183PLNColor), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01N311_A13181PLNProceso[0], A13181PLNProceso) < 0 ) || ( GXutil.strcmp(T01N311_A13181PLNProceso[0], A13181PLNProceso) == 0 ) && ( T01N311_A13182PLNTipoCru[0] < A13182PLNTipoCru ) || ( T01N311_A13182PLNTipoCru[0] == A13182PLNTipoCru ) && ( GXutil.strcmp(T01N311_A13181PLNProceso[0], A13181PLNProceso) == 0 ) && ( T01N311_A13183PLNColor[0] < A13183PLNColor ) ) && ( GXutil.strcmp(T01N311_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01N311_A13181PLNProceso[0], A13181PLNProceso) > 0 ) || ( GXutil.strcmp(T01N311_A13181PLNProceso[0], A13181PLNProceso) == 0 ) && ( T01N311_A13182PLNTipoCru[0] > A13182PLNTipoCru ) || ( T01N311_A13182PLNTipoCru[0] == A13182PLNTipoCru ) && ( GXutil.strcmp(T01N311_A13181PLNProceso[0], A13181PLNProceso) == 0 ) && ( T01N311_A13183PLNColor[0] > A13183PLNColor ) ) && ( GXutil.strcmp(T01N311_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A13181PLNProceso = T01N311_A13181PLNProceso[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13181PLNProceso", A13181PLNProceso);
            A13182PLNTipoCru = T01N311_A13182PLNTipoCru[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13182PLNTipoCru", GXutil.str( A13182PLNTipoCru, 1, 0));
            A13183PLNColor = T01N311_A13183PLNColor[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13183PLNColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13183PLNColor), 2, 0));
            RcdFound1804 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1804 = (short)(0) ;
      /* Using cursor T01N312 */
      pr_default.execute(10, new Object[] {A13181PLNProceso, A13181PLNProceso, Byte.valueOf(A13182PLNTipoCru), Byte.valueOf(A13182PLNTipoCru), A13181PLNProceso, Byte.valueOf(A13183PLNColor), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01N312_A13181PLNProceso[0], A13181PLNProceso) > 0 ) || ( GXutil.strcmp(T01N312_A13181PLNProceso[0], A13181PLNProceso) == 0 ) && ( T01N312_A13182PLNTipoCru[0] > A13182PLNTipoCru ) || ( T01N312_A13182PLNTipoCru[0] == A13182PLNTipoCru ) && ( GXutil.strcmp(T01N312_A13181PLNProceso[0], A13181PLNProceso) == 0 ) && ( T01N312_A13183PLNColor[0] > A13183PLNColor ) ) && ( GXutil.strcmp(T01N312_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01N312_A13181PLNProceso[0], A13181PLNProceso) < 0 ) || ( GXutil.strcmp(T01N312_A13181PLNProceso[0], A13181PLNProceso) == 0 ) && ( T01N312_A13182PLNTipoCru[0] < A13182PLNTipoCru ) || ( T01N312_A13182PLNTipoCru[0] == A13182PLNTipoCru ) && ( GXutil.strcmp(T01N312_A13181PLNProceso[0], A13181PLNProceso) == 0 ) && ( T01N312_A13183PLNColor[0] < A13183PLNColor ) ) && ( GXutil.strcmp(T01N312_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A13181PLNProceso = T01N312_A13181PLNProceso[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13181PLNProceso", A13181PLNProceso);
            A13182PLNTipoCru = T01N312_A13182PLNTipoCru[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13182PLNTipoCru", GXutil.str( A13182PLNTipoCru, 1, 0));
            A13183PLNColor = T01N312_A13183PLNColor[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13183PLNColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13183PLNColor), 2, 0));
            RcdFound1804 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1N31804( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A13187PLNUltCarg = O13187PLNUltCarg ;
         n13187PLNUltCarg = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
         GX_FocusControl = cmbPLNProceso.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1N31804( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1804 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A13181PLNProceso, Z13181PLNProceso) != 0 ) || ( A13182PLNTipoCru != Z13182PLNTipoCru ) || ( A13183PLNColor != Z13183PLNColor ) )
            {
               A13181PLNProceso = Z13181PLNProceso ;
               httpContext.ajax_rsp_assign_attri("", false, "A13181PLNProceso", A13181PLNProceso);
               A13182PLNTipoCru = Z13182PLNTipoCru ;
               httpContext.ajax_rsp_assign_attri("", false, "A13182PLNTipoCru", GXutil.str( A13182PLNTipoCru, 1, 0));
               A13183PLNColor = Z13183PLNColor ;
               httpContext.ajax_rsp_assign_attri("", false, "A13183PLNColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13183PLNColor), 2, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A13187PLNUltCarg = O13187PLNUltCarg ;
               n13187PLNUltCarg = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = cmbPLNProceso.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A13187PLNUltCarg = O13187PLNUltCarg ;
               n13187PLNUltCarg = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
               update1N31804( ) ;
               GX_FocusControl = cmbPLNProceso.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A13181PLNProceso, Z13181PLNProceso) != 0 ) || ( A13182PLNTipoCru != Z13182PLNTipoCru ) || ( A13183PLNColor != Z13183PLNColor ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A13187PLNUltCarg = O13187PLNUltCarg ;
               n13187PLNUltCarg = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
               GX_FocusControl = cmbPLNProceso.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1N31804( ) ;
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
                  A13187PLNUltCarg = O13187PLNUltCarg ;
                  n13187PLNUltCarg = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
                  GX_FocusControl = cmbPLNProceso.getInternalname() ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1N31804( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A13181PLNProceso, Z13181PLNProceso) != 0 ) || ( A13182PLNTipoCru != Z13182PLNTipoCru ) || ( A13183PLNColor != Z13183PLNColor ) )
      {
         A13181PLNProceso = Z13181PLNProceso ;
         httpContext.ajax_rsp_assign_attri("", false, "A13181PLNProceso", A13181PLNProceso);
         A13182PLNTipoCru = Z13182PLNTipoCru ;
         httpContext.ajax_rsp_assign_attri("", false, "A13182PLNTipoCru", GXutil.str( A13182PLNTipoCru, 1, 0));
         A13183PLNColor = Z13183PLNColor ;
         httpContext.ajax_rsp_assign_attri("", false, "A13183PLNColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13183PLNColor), 2, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A13187PLNUltCarg = O13187PLNUltCarg ;
         n13187PLNUltCarg = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = cmbPLNProceso.getInternalname() ;
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
      getKey1N31804( ) ;
      if ( RcdFound1804 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A13181PLNProceso, Z13181PLNProceso) != 0 ) || ( A13182PLNTipoCru != Z13182PLNTipoCru ) || ( A13183PLNColor != Z13183PLNColor ) )
         {
            A13181PLNProceso = Z13181PLNProceso ;
            httpContext.ajax_rsp_assign_attri("", false, "A13181PLNProceso", A13181PLNProceso);
            A13182PLNTipoCru = Z13182PLNTipoCru ;
            httpContext.ajax_rsp_assign_attri("", false, "A13182PLNTipoCru", GXutil.str( A13182PLNTipoCru, 1, 0));
            A13183PLNColor = Z13183PLNColor ;
            httpContext.ajax_rsp_assign_attri("", false, "A13183PLNColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13183PLNColor), 2, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A13181PLNProceso, Z13181PLNProceso) != 0 ) || ( A13182PLNTipoCru != Z13182PLNTipoCru ) || ( A13183PLNColor != Z13183PLNColor ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tplnacc");
   }

   public void insert_check( )
   {
      confirm_1N30( ) ;
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
      if ( RcdFound1804 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1N31804( ) ;
      if ( RcdFound1804 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1N31804( ) ;
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
      if ( RcdFound1804 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
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
      if ( RcdFound1804 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1N31804( ) ;
      if ( RcdFound1804 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1804 != 0 )
         {
            scanNext1N31804( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1N31804( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1N31804( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01N34 */
         pr_default.execute(2, new Object[] {A396EmprCod, A13181PLNProceso, Byte.valueOf(A13182PLNTipoCru), Byte.valueOf(A13183PLNColor)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPLNACC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z13187PLNUltCarg != T01N34_A13187PLNUltCarg[0] ) )
         {
            if ( Z13187PLNUltCarg != T01N34_A13187PLNUltCarg[0] )
            {
               GXutil.writeLogln("tplnacc:[seudo value changed for attri]"+"PLNUltCarg");
               GXutil.writeLogRaw("Old: ",Z13187PLNUltCarg);
               GXutil.writeLogRaw("Current: ",T01N34_A13187PLNUltCarg[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPLNACC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1N31804( )
   {
      beforeValidate1N31804( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N31804( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1N31804( 0) ;
         checkOptimisticConcurrency1N31804( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1N31804( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1N31804( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01N313 */
                  pr_default.execute(11, new Object[] {A13181PLNProceso, Byte.valueOf(A13182PLNTipoCru), Boolean.valueOf(n13187PLNUltCarg), Short.valueOf(A13187PLNUltCarg), A396EmprCod, Byte.valueOf(A13183PLNColor)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPLNACC");
                  if ( (pr_default.getStatus(11) == 1) )
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
                        processLevel1N31804( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1N30( ) ;
                        }
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
            load1N31804( ) ;
         }
         endLevel1N31804( ) ;
      }
      closeExtendedTableCursors1N31804( ) ;
   }

   public void update1N31804( )
   {
      beforeValidate1N31804( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N31804( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1N31804( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1N31804( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1N31804( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01N314 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n13187PLNUltCarg), Short.valueOf(A13187PLNUltCarg), A396EmprCod, A13181PLNProceso, Byte.valueOf(A13182PLNTipoCru), Byte.valueOf(A13183PLNColor)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPLNACC");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPLNACC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1N31804( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1N31804( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1N30( ) ;
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
         }
         endLevel1N31804( ) ;
      }
      closeExtendedTableCursors1N31804( ) ;
   }

   public void deferredUpdate1N31804( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1N31804( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1N31804( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1N31804( ) ;
         afterConfirm1N31804( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1N31804( ) ;
            if ( AnyError == 0 )
            {
               A13187PLNUltCarg = O13187PLNUltCarg ;
               n13187PLNUltCarg = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
               scanStart1N31805( ) ;
               while ( RcdFound1805 != 0 )
               {
                  getByPrimaryKey1N31805( ) ;
                  delete1N31805( ) ;
                  scanNext1N31805( ) ;
                  O13187PLNUltCarg = A13187PLNUltCarg ;
                  n13187PLNUltCarg = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
               }
               scanEnd1N31805( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01N315 */
                  pr_default.execute(13, new Object[] {A396EmprCod, A13181PLNProceso, Byte.valueOf(A13182PLNTipoCru), Byte.valueOf(A13183PLNColor)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPLNACC");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1804 == 0 )
                        {
                           initAll1N31804( ) ;
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
                        resetCaption1N30( ) ;
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
      }
      sMode1804 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1N31804( ) ;
      Gx_mode = sMode1804 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1N31804( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01N316 */
         pr_default.execute(14, new Object[] {A396EmprCod, Byte.valueOf(A13183PLNColor)});
         A13186PLNColorDs = T01N316_A13186PLNColorDs[0] ;
         n13186PLNColorDs = T01N316_n13186PLNColorDs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13186PLNColorDs", A13186PLNColorDs);
         pr_default.close(14);
      }
   }

   public void processNestedLevel1N31805( )
   {
      s13187PLNUltCarg = O13187PLNUltCarg ;
      n13187PLNUltCarg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1N31805( ) ;
         if ( ( nRcdExists_1805 != 0 ) || ( nIsMod_1805 != 0 ) )
         {
            standaloneNotModal1N31805( ) ;
            getKey1N31805( ) ;
            if ( ( nRcdExists_1805 == 0 ) && ( nRcdDeleted_1805 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1N31805( ) ;
            }
            else
            {
               if ( RcdFound1805 != 0 )
               {
                  if ( ( nRcdDeleted_1805 != 0 ) && ( nRcdExists_1805 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1N31805( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1805 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1N31805( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1805 == 0 )
                  {
                     GXCCtl = "PLNLINEA_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPLNLinea_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O13187PLNUltCarg = A13187PLNUltCarg ;
            n13187PLNUltCarg = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1805_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1805, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPLNLinea_Internalname, GXutil.ltrim( localUtil.ntoc( A13188PLNLinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPLNCarga_Internalname, GXutil.ltrim( localUtil.ntoc( A13184PLNCarga, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPLNCargaF_Internalname, GXutil.ltrim( localUtil.ntoc( A13189PLNCargaF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPLNDias_Internalname, GXutil.ltrim( localUtil.ntoc( A13185PLNDias, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13188PLNLinea_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z13188PLNLinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13184PLNCarga_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z13184PLNCarga, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13189PLNCargaF_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z13189PLNCargaF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13185PLNDias_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z13185PLNDias, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1805_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1805, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1805_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1805, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1805_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1805, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1805 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1805_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1805_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLNLINEA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPLNLinea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLNCARGA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPLNCarga_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLNCARGAF_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPLNCargaF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLNDIAS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPLNDias_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1N31805( ) ;
      if ( AnyError != 0 )
      {
         O13187PLNUltCarg = s13187PLNUltCarg ;
         n13187PLNUltCarg = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
      }
      nRcdExists_1805 = (short)(0) ;
      nIsMod_1805 = (short)(0) ;
      nRcdDeleted_1805 = (short)(0) ;
   }

   public void processLevel1N31804( )
   {
      /* Save parent mode. */
      sMode1804 = Gx_mode ;
      processNestedLevel1N31805( ) ;
      if ( AnyError != 0 )
      {
         O13187PLNUltCarg = s13187PLNUltCarg ;
         n13187PLNUltCarg = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1804 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01N317 */
      pr_default.execute(15, new Object[] {Boolean.valueOf(n13187PLNUltCarg), Short.valueOf(A13187PLNUltCarg), A396EmprCod, A13181PLNProceso, Byte.valueOf(A13182PLNTipoCru), Byte.valueOf(A13183PLNColor)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPLNACC");
   }

   public void endLevel1N31804( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1N31804( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tplnacc");
         if ( AnyError == 0 )
         {
            confirmValues1N30( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tplnacc");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1N31804( )
   {
      /* Scan By routine */
      /* Using cursor T01N318 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      RcdFound1804 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1804 = (short)(1) ;
         A13181PLNProceso = T01N318_A13181PLNProceso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13181PLNProceso", A13181PLNProceso);
         A13182PLNTipoCru = T01N318_A13182PLNTipoCru[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13182PLNTipoCru", GXutil.str( A13182PLNTipoCru, 1, 0));
         A13183PLNColor = T01N318_A13183PLNColor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13183PLNColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13183PLNColor), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1N31804( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound1804 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1804 = (short)(1) ;
         A13181PLNProceso = T01N318_A13181PLNProceso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13181PLNProceso", A13181PLNProceso);
         A13182PLNTipoCru = T01N318_A13182PLNTipoCru[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13182PLNTipoCru", GXutil.str( A13182PLNTipoCru, 1, 0));
         A13183PLNColor = T01N318_A13183PLNColor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13183PLNColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13183PLNColor), 2, 0));
      }
   }

   public void scanEnd1N31804( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1N31804( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(A13181PLNProceso, "X") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor incorrecto Proceso: Normal o Especial", ""), 1, "PLNPROCESO");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbPLNProceso.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( ( A13182PLNTipoCru == 9 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor incorrecto Tipo Crudo: MTS o MTO", ""), 1, "PLNTIPOCRU");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbPLNTipoCru.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1N31804( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1N31804( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1N31804( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1N31804( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1N31804( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1N31804( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      cmbPLNProceso.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbPLNProceso.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPLNProceso.getEnabled(), 5, 0), true);
      cmbPLNTipoCru.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbPLNTipoCru.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPLNTipoCru.getEnabled(), 5, 0), true);
      edtPLNColor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLNColor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLNColor_Enabled), 5, 0), true);
      edtPLNColorDs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLNColorDs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLNColorDs_Enabled), 5, 0), true);
      edtPLNUltCarg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLNUltCarg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLNUltCarg_Enabled), 5, 0), true);
   }

   public void zm1N31805( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13184PLNCarga = T01N33_A13184PLNCarga[0] ;
            Z13189PLNCargaF = T01N33_A13189PLNCargaF[0] ;
            Z13185PLNDias = T01N33_A13185PLNDias[0] ;
         }
         else
         {
            Z13184PLNCarga = A13184PLNCarga ;
            Z13189PLNCargaF = A13189PLNCargaF ;
            Z13185PLNDias = A13185PLNDias ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z396EmprCod = A396EmprCod ;
         Z13181PLNProceso = A13181PLNProceso ;
         Z13182PLNTipoCru = A13182PLNTipoCru ;
         Z13183PLNColor = A13183PLNColor ;
         Z13188PLNLinea = A13188PLNLinea ;
         Z13184PLNCarga = A13184PLNCarga ;
         Z13189PLNCargaF = A13189PLNCargaF ;
         Z13185PLNDias = A13185PLNDias ;
      }
   }

   public void standaloneNotModal1N31805( )
   {
      edtPLNUltCarg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLNUltCarg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLNUltCarg_Enabled), 5, 0), true);
      edtPLNUltCarg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLNUltCarg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLNUltCarg_Enabled), 5, 0), true);
   }

   public void standaloneModal1N31805( )
   {
      if ( isIns( )  )
      {
         A13187PLNUltCarg = (short)(O13187PLNUltCarg+1) ;
         n13187PLNUltCarg = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A13188PLNLinea = A13187PLNUltCarg ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPLNLinea_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPLNLinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLNLinea_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      else
      {
         edtPLNLinea_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPLNLinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLNLinea_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
   }

   public void load1N31805( )
   {
      /* Using cursor T01N319 */
      pr_default.execute(17, new Object[] {A396EmprCod, A13181PLNProceso, Byte.valueOf(A13182PLNTipoCru), Byte.valueOf(A13183PLNColor), Short.valueOf(A13188PLNLinea)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1805 = (short)(1) ;
         A13184PLNCarga = T01N319_A13184PLNCarga[0] ;
         n13184PLNCarga = T01N319_n13184PLNCarga[0] ;
         A13189PLNCargaF = T01N319_A13189PLNCargaF[0] ;
         n13189PLNCargaF = T01N319_n13189PLNCargaF[0] ;
         A13185PLNDias = T01N319_A13185PLNDias[0] ;
         n13185PLNDias = T01N319_n13185PLNDias[0] ;
         zm1N31805( -13) ;
      }
      pr_default.close(17);
      onLoadActions1N31805( ) ;
   }

   public void onLoadActions1N31805( )
   {
   }

   public void checkExtendedTable1N31805( )
   {
      nIsDirty_1805 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1N31805( ) ;
   }

   public void closeExtendedTableCursors1N31805( )
   {
   }

   public void enableDisable1N31805( )
   {
   }

   public void getKey1N31805( )
   {
      /* Using cursor T01N320 */
      pr_default.execute(18, new Object[] {A396EmprCod, A13181PLNProceso, Byte.valueOf(A13182PLNTipoCru), Byte.valueOf(A13183PLNColor), Short.valueOf(A13188PLNLinea)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1805 = (short)(1) ;
      }
      else
      {
         RcdFound1805 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey1N31805( )
   {
      /* Using cursor T01N33 */
      pr_default.execute(1, new Object[] {A396EmprCod, A13181PLNProceso, Byte.valueOf(A13182PLNTipoCru), Byte.valueOf(A13183PLNColor), Short.valueOf(A13188PLNLinea)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01N33_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1N31805( 13) ;
         RcdFound1805 = (short)(1) ;
         initializeNonKey1N31805( ) ;
         A13188PLNLinea = T01N33_A13188PLNLinea[0] ;
         A13184PLNCarga = T01N33_A13184PLNCarga[0] ;
         n13184PLNCarga = T01N33_n13184PLNCarga[0] ;
         A13189PLNCargaF = T01N33_A13189PLNCargaF[0] ;
         n13189PLNCargaF = T01N33_n13189PLNCargaF[0] ;
         A13185PLNDias = T01N33_A13185PLNDias[0] ;
         n13185PLNDias = T01N33_n13185PLNDias[0] ;
         Z396EmprCod = A396EmprCod ;
         Z13181PLNProceso = A13181PLNProceso ;
         Z13182PLNTipoCru = A13182PLNTipoCru ;
         Z13183PLNColor = A13183PLNColor ;
         Z13188PLNLinea = A13188PLNLinea ;
         sMode1805 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1N31805( ) ;
         load1N31805( ) ;
         Gx_mode = sMode1805 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1805 = (short)(0) ;
         initializeNonKey1N31805( ) ;
         sMode1805 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1N31805( ) ;
         Gx_mode = sMode1805 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1N31805( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1N31805( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01N32 */
         pr_default.execute(0, new Object[] {A396EmprCod, A13181PLNProceso, Byte.valueOf(A13182PLNTipoCru), Byte.valueOf(A13183PLNColor), Short.valueOf(A13188PLNLinea)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPLNAC1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z13184PLNCarga, T01N32_A13184PLNCarga[0]) != 0 ) || ( Z13189PLNCargaF != T01N32_A13189PLNCargaF[0] ) || ( Z13185PLNDias != T01N32_A13185PLNDias[0] ) )
         {
            if ( DecimalUtil.compareTo(Z13184PLNCarga, T01N32_A13184PLNCarga[0]) != 0 )
            {
               GXutil.writeLogln("tplnacc:[seudo value changed for attri]"+"PLNCarga");
               GXutil.writeLogRaw("Old: ",Z13184PLNCarga);
               GXutil.writeLogRaw("Current: ",T01N32_A13184PLNCarga[0]);
            }
            if ( Z13189PLNCargaF != T01N32_A13189PLNCargaF[0] )
            {
               GXutil.writeLogln("tplnacc:[seudo value changed for attri]"+"PLNCargaF");
               GXutil.writeLogRaw("Old: ",Z13189PLNCargaF);
               GXutil.writeLogRaw("Current: ",T01N32_A13189PLNCargaF[0]);
            }
            if ( Z13185PLNDias != T01N32_A13185PLNDias[0] )
            {
               GXutil.writeLogln("tplnacc:[seudo value changed for attri]"+"PLNDias");
               GXutil.writeLogRaw("Old: ",Z13185PLNDias);
               GXutil.writeLogRaw("Current: ",T01N32_A13185PLNDias[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPLNAC1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1N31805( )
   {
      beforeValidate1N31805( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N31805( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1N31805( 0) ;
         checkOptimisticConcurrency1N31805( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1N31805( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1N31805( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01N321 */
                  pr_default.execute(19, new Object[] {A396EmprCod, A13181PLNProceso, Byte.valueOf(A13182PLNTipoCru), Byte.valueOf(A13183PLNColor), Short.valueOf(A13188PLNLinea), Boolean.valueOf(n13184PLNCarga), A13184PLNCarga, Boolean.valueOf(n13189PLNCargaF), Short.valueOf(A13189PLNCargaF), Boolean.valueOf(n13185PLNDias), Short.valueOf(A13185PLNDias)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPLNAC1");
                  if ( (pr_default.getStatus(19) == 1) )
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
            load1N31805( ) ;
         }
         endLevel1N31805( ) ;
      }
      closeExtendedTableCursors1N31805( ) ;
   }

   public void update1N31805( )
   {
      beforeValidate1N31805( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N31805( ) ;
      }
      if ( ( nIsMod_1805 != 0 ) || ( nIsDirty_1805 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1N31805( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1N31805( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1N31805( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01N322 */
                     pr_default.execute(20, new Object[] {Boolean.valueOf(n13184PLNCarga), A13184PLNCarga, Boolean.valueOf(n13189PLNCargaF), Short.valueOf(A13189PLNCargaF), Boolean.valueOf(n13185PLNDias), Short.valueOf(A13185PLNDias), A396EmprCod, A13181PLNProceso, Byte.valueOf(A13182PLNTipoCru), Byte.valueOf(A13183PLNColor), Short.valueOf(A13188PLNLinea)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPLNAC1");
                     if ( (pr_default.getStatus(20) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPLNAC1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1N31805( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1N31805( ) ;
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
            endLevel1N31805( ) ;
         }
      }
      closeExtendedTableCursors1N31805( ) ;
   }

   public void deferredUpdate1N31805( )
   {
   }

   public void delete1N31805( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1N31805( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1N31805( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1N31805( ) ;
         afterConfirm1N31805( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1N31805( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01N323 */
               pr_default.execute(21, new Object[] {A396EmprCod, A13181PLNProceso, Byte.valueOf(A13182PLNTipoCru), Byte.valueOf(A13183PLNColor), Short.valueOf(A13188PLNLinea)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPLNAC1");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode1805 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1N31805( ) ;
      Gx_mode = sMode1805 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1N31805( )
   {
      standaloneModal1N31805( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1N31805( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1N31805( )
   {
      /* Scan By routine */
      /* Using cursor T01N324 */
      pr_default.execute(22, new Object[] {A396EmprCod, A13181PLNProceso, Byte.valueOf(A13182PLNTipoCru), Byte.valueOf(A13183PLNColor)});
      RcdFound1805 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1805 = (short)(1) ;
         A13188PLNLinea = T01N324_A13188PLNLinea[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1N31805( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1805 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1805 = (short)(1) ;
         A13188PLNLinea = T01N324_A13188PLNLinea[0] ;
      }
   }

   public void scanEnd1N31805( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1N31805( )
   {
      /* After Confirm Rules */
      if ( ( A13185PLNDias == 0 ) && true /* After */ )
      {
         GXCCtl = "PLNDIAS_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor incorrecto, Dias", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPLNDias_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1N31805( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1N31805( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1N31805( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1N31805( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1N31805( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1N31805( )
   {
      edtPLNLinea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLNLinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLNLinea_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtPLNCarga_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLNCarga_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLNCarga_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtPLNCargaF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLNCargaF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLNCargaF_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtPLNDias_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLNDias_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLNDias_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void send_integrity_lvl_hashes1N31805( )
   {
   }

   public void send_integrity_lvl_hashes1N31804( )
   {
   }

   public void subsflControlProps_551805( )
   {
      edtavnRcdDeleted_1805_Internalname = "vNRCDDELETED_1805_"+sGXsfl_55_idx ;
      edtPLNLinea_Internalname = "PLNLINEA_"+sGXsfl_55_idx ;
      edtPLNCarga_Internalname = "PLNCARGA_"+sGXsfl_55_idx ;
      edtPLNCargaF_Internalname = "PLNCARGAF_"+sGXsfl_55_idx ;
      edtPLNDias_Internalname = "PLNDIAS_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_551805( )
   {
      edtavnRcdDeleted_1805_Internalname = "vNRCDDELETED_1805_"+sGXsfl_55_fel_idx ;
      edtPLNLinea_Internalname = "PLNLINEA_"+sGXsfl_55_fel_idx ;
      edtPLNCarga_Internalname = "PLNCARGA_"+sGXsfl_55_fel_idx ;
      edtPLNCargaF_Internalname = "PLNCARGAF_"+sGXsfl_55_fel_idx ;
      edtPLNDias_Internalname = "PLNDIAS_"+sGXsfl_55_fel_idx ;
   }

   public void addRow1N31805( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551805( ) ;
      sendRow1N31805( ) ;
   }

   public void sendRow1N31805( )
   {
      Grid1Row = GXWebRow.GetNew(context) ;
      if ( subGrid1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Odd" ;
         }
      }
      else if ( subGrid1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid1_Backstyle = (byte)(0) ;
         subGrid1_Backcolor = subGrid1_Allbackcolor ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
         }
      }
      else if ( subGrid1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Odd" ;
         }
         subGrid1_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_55_idx) % (2))) == 0 )
         {
            subGrid1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Even" ;
            }
         }
         else
         {
            subGrid1_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1805_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1805_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1805, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1805_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1805), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1805), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1805_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1805_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1805_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPLNLinea_Internalname,GXutil.ltrim( localUtil.ntoc( A13188PLNLinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13188PLNLinea), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPLNLinea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPLNLinea_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1805_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPLNCarga_Internalname,GXutil.ltrim( localUtil.ntoc( A13184PLNCarga, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPLNCarga_Enabled!=0) ? localUtil.format( A13184PLNCarga, "ZZZZZ9.99") : localUtil.format( A13184PLNCarga, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPLNCarga_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPLNCarga_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1805_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPLNCargaF_Internalname,GXutil.ltrim( localUtil.ntoc( A13189PLNCargaF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPLNCargaF_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13189PLNCargaF), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13189PLNCargaF), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPLNCargaF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPLNCargaF_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1805_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPLNDias_Internalname,GXutil.ltrim( localUtil.ntoc( A13185PLNDias, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPLNDias_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13185PLNDias), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13185PLNDias), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPLNDias_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPLNDias_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1N31805( ) ;
      GXCCtl = "Z13188PLNLinea_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13188PLNLinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13184PLNCarga_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13184PLNCarga, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13189PLNCargaF_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13189PLNCargaF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13185PLNDias_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13185PLNDias, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1805_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1805, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1805_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1805, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1805_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1805, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vNAME_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, AV34name);
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1805_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1805_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLNLINEA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPLNLinea_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLNCARGA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPLNCarga_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLNCARGAF_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPLNCargaF_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLNDIAS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPLNDias_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1N31805( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551805( ) ;
      edtavnRcdDeleted_1805_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1805_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPLNLinea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLNLINEA_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPLNCarga_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLNCARGA_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPLNCargaF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLNCARGAF_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPLNDias_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLNDIAS_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1805_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1805_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1805");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1805_Internalname ;
         wbErr = true ;
         nRcdDeleted_1805 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1805 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1805_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPLNLinea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPLNLinea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PLNLINEA_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPLNLinea_Internalname ;
         wbErr = true ;
         A13188PLNLinea = (short)(0) ;
      }
      else
      {
         A13188PLNLinea = (short)(localUtil.ctol( httpContext.cgiGet( edtPLNLinea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPLNCarga_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPLNCarga_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "PLNCARGA_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPLNCarga_Internalname ;
         wbErr = true ;
         A13184PLNCarga = DecimalUtil.ZERO ;
         n13184PLNCarga = false ;
      }
      else
      {
         A13184PLNCarga = localUtil.ctond( httpContext.cgiGet( edtPLNCarga_Internalname)) ;
         n13184PLNCarga = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPLNCargaF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPLNCargaF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PLNCARGAF_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPLNCargaF_Internalname ;
         wbErr = true ;
         A13189PLNCargaF = (short)(0) ;
         n13189PLNCargaF = false ;
      }
      else
      {
         A13189PLNCargaF = (short)(localUtil.ctol( httpContext.cgiGet( edtPLNCargaF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13189PLNCargaF = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPLNDias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPLNDias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PLNDIAS_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPLNDias_Internalname ;
         wbErr = true ;
         A13185PLNDias = (short)(0) ;
         n13185PLNDias = false ;
      }
      else
      {
         A13185PLNDias = (short)(localUtil.ctol( httpContext.cgiGet( edtPLNDias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13185PLNDias = false ;
      }
      GXCCtl = "Z13188PLNLinea_" + sGXsfl_55_idx ;
      Z13188PLNLinea = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13184PLNCarga_" + sGXsfl_55_idx ;
      Z13184PLNCarga = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13189PLNCargaF_" + sGXsfl_55_idx ;
      Z13189PLNCargaF = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13185PLNDias_" + sGXsfl_55_idx ;
      Z13185PLNDias = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1805_" + sGXsfl_55_idx ;
      nRcdDeleted_1805 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1805_" + sGXsfl_55_idx ;
      nRcdExists_1805 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1805_" + sGXsfl_55_idx ;
      nIsMod_1805 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPLNLinea_Enabled = edtPLNLinea_Enabled ;
   }

   public void confirmValues1N30( )
   {
      nGXsfl_55_idx = 0 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551805( ) ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551805( ) ;
         httpContext.changePostValue( "Z13188PLNLinea_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z13188PLNLinea_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13188PLNLinea_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z13184PLNCarga_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z13184PLNCarga_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13184PLNCarga_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z13189PLNCargaF_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z13189PLNCargaF_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13189PLNCargaF_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z13185PLNDias_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z13185PLNDias_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13185PLNDias_"+sGXsfl_55_idx) ;
      }
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tplnacc", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z13181PLNProceso", GXutil.rtrim( Z13181PLNProceso));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13182PLNTipoCru", GXutil.ltrim( localUtil.ntoc( Z13182PLNTipoCru, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13183PLNColor", GXutil.ltrim( localUtil.ntoc( Z13183PLNColor, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13187PLNUltCarg", GXutil.ltrim( localUtil.ntoc( Z13187PLNUltCarg, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O13187PLNUltCarg", GXutil.ltrim( localUtil.ntoc( O13187PLNUltCarg, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nGXsfl_55_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNAME", AV34name);
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV37Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
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
      return formatLink("app.tplnacc", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPLNACC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Plan de ACCION", "") ;
   }

   public void initializeNonKey1N31804( )
   {
      A13186PLNColorDs = "" ;
      n13186PLNColorDs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13186PLNColorDs", A13186PLNColorDs);
      A13187PLNUltCarg = (short)(0) ;
      n13187PLNUltCarg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
      O13187PLNUltCarg = A13187PLNUltCarg ;
      n13187PLNUltCarg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
      Z13187PLNUltCarg = (short)(0) ;
   }

   public void initAll1N31804( )
   {
      A13181PLNProceso = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13181PLNProceso", A13181PLNProceso);
      A13182PLNTipoCru = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13182PLNTipoCru", GXutil.str( A13182PLNTipoCru, 1, 0));
      A13183PLNColor = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13183PLNColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13183PLNColor), 2, 0));
      initializeNonKey1N31804( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1N31805( )
   {
      A13184PLNCarga = DecimalUtil.ZERO ;
      n13184PLNCarga = false ;
      A13189PLNCargaF = (short)(0) ;
      n13189PLNCargaF = false ;
      A13185PLNDias = (short)(0) ;
      n13185PLNDias = false ;
      Z13184PLNCarga = DecimalUtil.ZERO ;
      Z13189PLNCargaF = (short)(0) ;
      Z13185PLNDias = (short)(0) ;
   }

   public void initAll1N31805( )
   {
      A13188PLNLinea = (short)(0) ;
      initializeNonKey1N31805( ) ;
   }

   public void standaloneModalInsert1N31805( )
   {
      A13187PLNUltCarg = i13187PLNUltCarg ;
      n13187PLNUltCarg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13187PLNUltCarg), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241510284", true, true);
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
      httpContext.AddJavascriptSource("tplnacc.js", "?20268241510284", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1805( )
   {
      edtPLNLinea_Enabled = defedtPLNLinea_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLNLinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLNLinea_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void startgridcontrol55( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("Class", "");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1805, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1805_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13188PLNLinea, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPLNLinea_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13184PLNCarga, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPLNCarga_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13189PLNCargaF, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPLNCargaF_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13185PLNDias, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPLNDias_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      cmbPLNProceso.setInternalname( "PLNPROCESO" );
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      cmbPLNTipoCru.setInternalname( "PLNTIPOCRU" );
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtPLNColor_Internalname = "PLNCOLOR" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtPLNColorDs_Internalname = "PLNCOLORDS" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtPLNUltCarg_Internalname = "PLNULTCARG" ;
      edtavnRcdDeleted_1805_Internalname = "vNRCDDELETED_1805" ;
      edtPLNLinea_Internalname = "PLNLINEA" ;
      edtPLNCarga_Internalname = "PLNCARGA" ;
      edtPLNCargaF_Internalname = "PLNCARGAF" ;
      edtPLNDias_Internalname = "PLNDIAS" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
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
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      subGrid1_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Plan de ACCION", "") );
      edtPLNDias_Jsonclick = "" ;
      edtPLNCargaF_Jsonclick = "" ;
      edtPLNCarga_Jsonclick = "" ;
      edtPLNLinea_Jsonclick = "" ;
      edtavnRcdDeleted_1805_Jsonclick = "" ;
      subGrid1_Class = "" ;
      subGrid1_Backcolorstyle = (byte)(2) ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPLNDias_Enabled = 1 ;
      edtPLNCargaF_Enabled = 1 ;
      edtPLNCarga_Enabled = 1 ;
      edtPLNLinea_Enabled = 1 ;
      edtavnRcdDeleted_1805_Enabled = 1 ;
      edtPLNUltCarg_Jsonclick = "" ;
      edtPLNUltCarg_Backcolor = (int)(0xFFFFFF) ;
      edtPLNUltCarg_Enabled = 0 ;
      edtPLNColorDs_Jsonclick = "" ;
      edtPLNColorDs_Backcolor = (int)(0xFFFFFF) ;
      edtPLNColorDs_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPLNColor_Jsonclick = "" ;
      edtPLNColor_Backcolor = (int)(0xFFFFFF) ;
      edtPLNColor_Enabled = 1 ;
      cmbPLNTipoCru.setJsonclick( "" );
      cmbPLNTipoCru.setEnabled( 1 );
      cmbPLNTipoCru.setIBackground( (int)(0xFFFFFF) );
      cmbPLNProceso.setJsonclick( "" );
      cmbPLNProceso.setEnabled( 1 );
      cmbPLNProceso.setIBackground( (int)(0xFFFFFF) );
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_551805( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1N31805( ) ;
         standaloneModal1N31805( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1N31805( ) ;
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551805( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      cmbPLNProceso.setName( "PLNPROCESO" );
      cmbPLNProceso.setWebtags( "" );
      cmbPLNProceso.addItem("X", httpContext.getMessage( "Definir", ""), (short)(0));
      cmbPLNProceso.addItem("N", httpContext.getMessage( "Normal", ""), (short)(0));
      cmbPLNProceso.addItem("E", httpContext.getMessage( "Especial", ""), (short)(0));
      if ( cmbPLNProceso.getItemCount() > 0 )
      {
         A13181PLNProceso = cmbPLNProceso.getValidValue(A13181PLNProceso) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13181PLNProceso", A13181PLNProceso);
      }
      cmbPLNTipoCru.setName( "PLNTIPOCRU" );
      cmbPLNTipoCru.setWebtags( "" );
      cmbPLNTipoCru.addItem("9", httpContext.getMessage( "Definir", ""), (short)(0));
      cmbPLNTipoCru.addItem("1", httpContext.getMessage( "MTO", ""), (short)(0));
      cmbPLNTipoCru.addItem("0", httpContext.getMessage( "MTS", ""), (short)(0));
      if ( cmbPLNTipoCru.getItemCount() > 0 )
      {
         A13182PLNTipoCru = (byte)(GXutil.lval( cmbPLNTipoCru.getValidValue(GXutil.trim( GXutil.str( A13182PLNTipoCru, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13182PLNTipoCru", GXutil.str( A13182PLNTipoCru, 1, 0));
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01N325 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01N325_A407EmprNom[0] ;
      n407EmprNom = T01N325_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(23);
      /* Using cursor T01N316 */
      pr_default.execute(14, new Object[] {A396EmprCod, Byte.valueOf(A13183PLNColor)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Color", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PLNCOLOR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPLNColor_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13186PLNColorDs = T01N316_A13186PLNColorDs[0] ;
      n13186PLNColorDs = T01N316_n13186PLNColorDs[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13186PLNColorDs", A13186PLNColorDs);
      pr_default.close(14);
      if ( AnyError == 0 )
      {
         GX_FocusControl = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
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

   public void valid_Plncolor( )
   {
      n13187PLNUltCarg = false ;
      A13181PLNProceso = cmbPLNProceso.getValue() ;
      A13182PLNTipoCru = (byte)(GXutil.lval( cmbPLNTipoCru.getValue())) ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01N316 */
      pr_default.execute(14, new Object[] {A396EmprCod, Byte.valueOf(A13183PLNColor)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Color", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PLNCOLOR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPLNColor_Internalname ;
      }
      A13186PLNColorDs = T01N316_A13186PLNColorDs[0] ;
      n13186PLNColorDs = T01N316_n13186PLNColorDs[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      if ( cmbPLNProceso.getItemCount() > 0 )
      {
         A13181PLNProceso = cmbPLNProceso.getValidValue(A13181PLNProceso) ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPLNProceso.setValue( GXutil.rtrim( A13181PLNProceso) );
      }
      if ( cmbPLNTipoCru.getItemCount() > 0 )
      {
         A13182PLNTipoCru = (byte)(GXutil.lval( cmbPLNTipoCru.getValidValue(GXutil.trim( GXutil.str( A13182PLNTipoCru, 1, 0))))) ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPLNTipoCru.setValue( GXutil.trim( GXutil.str( A13182PLNTipoCru, 1, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A13187PLNUltCarg", GXutil.ltrim( localUtil.ntoc( A13187PLNUltCarg, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13186PLNColorDs", GXutil.rtrim( A13186PLNColorDs));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13181PLNProceso", GXutil.rtrim( Z13181PLNProceso));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13182PLNTipoCru", GXutil.ltrim( localUtil.ntoc( Z13182PLNTipoCru, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13183PLNColor", GXutil.ltrim( localUtil.ntoc( Z13183PLNColor, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13187PLNUltCarg", GXutil.ltrim( localUtil.ntoc( Z13187PLNUltCarg, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13186PLNColorDs", GXutil.rtrim( Z13186PLNColorDs));
      httpContext.ajax_rsp_assign_attri("", false, "O13187PLNUltCarg", GXutil.ltrim( localUtil.ntoc( O13187PLNUltCarg, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("'EXPORTAR'","{handler:'e121N32',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'AV34name',fld:'vNAME',pic:''}]");
      setEventMetadata("'EXPORTAR'",",oparms:[{av:'AV34name',fld:'vNAME',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PLNPROCESO","{handler:'valid_Plnproceso',iparms:[]");
      setEventMetadata("VALID_PLNPROCESO",",oparms:[]}");
      setEventMetadata("VALID_PLNTIPOCRU","{handler:'valid_Plntipocru',iparms:[]");
      setEventMetadata("VALID_PLNTIPOCRU",",oparms:[]}");
      setEventMetadata("VALID_PLNCOLOR","{handler:'valid_Plncolor',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A13187PLNUltCarg',fld:'PLNULTCARG',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'cmbPLNProceso'},{av:'A13181PLNProceso',fld:'PLNPROCESO',pic:''},{av:'cmbPLNTipoCru'},{av:'A13182PLNTipoCru',fld:'PLNTIPOCRU',pic:'9'},{av:'A13183PLNColor',fld:'PLNCOLOR',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PLNCOLOR",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A13187PLNUltCarg',fld:'PLNULTCARG',pic:'ZZZ9'},{av:'A13186PLNColorDs',fld:'PLNCOLORDS',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z13181PLNProceso'},{av:'Z13182PLNTipoCru'},{av:'Z13183PLNColor'},{av:'Z407EmprNom'},{av:'Z13187PLNUltCarg'},{av:'Z13186PLNColorDs'},{av:'O13187PLNUltCarg'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_PLNULTCARG","{handler:'valid_Plnultcarg',iparms:[]");
      setEventMetadata("VALID_PLNULTCARG",",oparms:[]}");
      setEventMetadata("VALID_PLNLINEA","{handler:'valid_Plnlinea',iparms:[]");
      setEventMetadata("VALID_PLNLINEA",",oparms:[]}");
      setEventMetadata("VALID_PLNDIAS","{handler:'valid_Plndias',iparms:[]");
      setEventMetadata("VALID_PLNDIAS",",oparms:[]}");
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
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z13181PLNProceso = "" ;
      Z13184PLNCarga = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_mode = "" ;
      A13181PLNProceso = "" ;
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
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A13186PLNColorDs = "" ;
      lblTextblock7_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1805 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV37Pgmname = "" ;
      Gx_date = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1804 = "" ;
      GXCCtl = "" ;
      A13184PLNCarga = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      AV34name = "" ;
      GXv_char2 = new String[1] ;
      AV33txt = "" ;
      Z407EmprNom = "" ;
      Z13186PLNColorDs = "" ;
      T01N36_A407EmprNom = new String[] {""} ;
      T01N36_n407EmprNom = new boolean[] {false} ;
      T01N38_A13181PLNProceso = new String[] {""} ;
      T01N38_A13182PLNTipoCru = new byte[1] ;
      T01N38_A407EmprNom = new String[] {""} ;
      T01N38_n407EmprNom = new boolean[] {false} ;
      T01N38_A13186PLNColorDs = new String[] {""} ;
      T01N38_n13186PLNColorDs = new boolean[] {false} ;
      T01N38_A13187PLNUltCarg = new short[1] ;
      T01N38_n13187PLNUltCarg = new boolean[] {false} ;
      T01N38_A396EmprCod = new String[] {""} ;
      T01N38_A13183PLNColor = new byte[1] ;
      T01N37_A13186PLNColorDs = new String[] {""} ;
      T01N37_n13186PLNColorDs = new boolean[] {false} ;
      T01N39_A13186PLNColorDs = new String[] {""} ;
      T01N39_n13186PLNColorDs = new boolean[] {false} ;
      T01N310_A396EmprCod = new String[] {""} ;
      T01N310_A13181PLNProceso = new String[] {""} ;
      T01N310_A13182PLNTipoCru = new byte[1] ;
      T01N310_A13183PLNColor = new byte[1] ;
      T01N35_A13181PLNProceso = new String[] {""} ;
      T01N35_A13182PLNTipoCru = new byte[1] ;
      T01N35_A13187PLNUltCarg = new short[1] ;
      T01N35_n13187PLNUltCarg = new boolean[] {false} ;
      T01N35_A396EmprCod = new String[] {""} ;
      T01N35_A13183PLNColor = new byte[1] ;
      T01N311_A396EmprCod = new String[] {""} ;
      T01N311_A13181PLNProceso = new String[] {""} ;
      T01N311_A13182PLNTipoCru = new byte[1] ;
      T01N311_A13183PLNColor = new byte[1] ;
      T01N312_A396EmprCod = new String[] {""} ;
      T01N312_A13181PLNProceso = new String[] {""} ;
      T01N312_A13182PLNTipoCru = new byte[1] ;
      T01N312_A13183PLNColor = new byte[1] ;
      T01N34_A13181PLNProceso = new String[] {""} ;
      T01N34_A13182PLNTipoCru = new byte[1] ;
      T01N34_A13187PLNUltCarg = new short[1] ;
      T01N34_n13187PLNUltCarg = new boolean[] {false} ;
      T01N34_A396EmprCod = new String[] {""} ;
      T01N34_A13183PLNColor = new byte[1] ;
      T01N316_A13186PLNColorDs = new String[] {""} ;
      T01N316_n13186PLNColorDs = new boolean[] {false} ;
      T01N318_A396EmprCod = new String[] {""} ;
      T01N318_A13181PLNProceso = new String[] {""} ;
      T01N318_A13182PLNTipoCru = new byte[1] ;
      T01N318_A13183PLNColor = new byte[1] ;
      T01N319_A396EmprCod = new String[] {""} ;
      T01N319_A13181PLNProceso = new String[] {""} ;
      T01N319_A13182PLNTipoCru = new byte[1] ;
      T01N319_A13183PLNColor = new byte[1] ;
      T01N319_A13188PLNLinea = new short[1] ;
      T01N319_A13184PLNCarga = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N319_n13184PLNCarga = new boolean[] {false} ;
      T01N319_A13189PLNCargaF = new short[1] ;
      T01N319_n13189PLNCargaF = new boolean[] {false} ;
      T01N319_A13185PLNDias = new short[1] ;
      T01N319_n13185PLNDias = new boolean[] {false} ;
      T01N320_A396EmprCod = new String[] {""} ;
      T01N320_A13181PLNProceso = new String[] {""} ;
      T01N320_A13182PLNTipoCru = new byte[1] ;
      T01N320_A13183PLNColor = new byte[1] ;
      T01N320_A13188PLNLinea = new short[1] ;
      T01N33_A396EmprCod = new String[] {""} ;
      T01N33_A13181PLNProceso = new String[] {""} ;
      T01N33_A13182PLNTipoCru = new byte[1] ;
      T01N33_A13183PLNColor = new byte[1] ;
      T01N33_A13188PLNLinea = new short[1] ;
      T01N33_A13184PLNCarga = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N33_n13184PLNCarga = new boolean[] {false} ;
      T01N33_A13189PLNCargaF = new short[1] ;
      T01N33_n13189PLNCargaF = new boolean[] {false} ;
      T01N33_A13185PLNDias = new short[1] ;
      T01N33_n13185PLNDias = new boolean[] {false} ;
      T01N32_A396EmprCod = new String[] {""} ;
      T01N32_A13181PLNProceso = new String[] {""} ;
      T01N32_A13182PLNTipoCru = new byte[1] ;
      T01N32_A13183PLNColor = new byte[1] ;
      T01N32_A13188PLNLinea = new short[1] ;
      T01N32_A13184PLNCarga = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N32_n13184PLNCarga = new boolean[] {false} ;
      T01N32_A13189PLNCargaF = new short[1] ;
      T01N32_n13189PLNCargaF = new boolean[] {false} ;
      T01N32_A13185PLNDias = new short[1] ;
      T01N32_n13185PLNDias = new boolean[] {false} ;
      T01N324_A396EmprCod = new String[] {""} ;
      T01N324_A13181PLNProceso = new String[] {""} ;
      T01N324_A13182PLNTipoCru = new byte[1] ;
      T01N324_A13183PLNColor = new byte[1] ;
      T01N324_A13188PLNLinea = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01N325_A407EmprNom = new String[] {""} ;
      T01N325_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ13181PLNProceso = "" ;
      ZZ407EmprNom = "" ;
      ZZ13186PLNColorDs = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tplnacc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tplnacc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tplnacc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tplnacc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tplnacc__default(),
         new Object[] {
             new Object[] {
            T01N32_A396EmprCod, T01N32_A13181PLNProceso, T01N32_A13182PLNTipoCru, T01N32_A13183PLNColor, T01N32_A13188PLNLinea, T01N32_A13184PLNCarga, T01N32_n13184PLNCarga, T01N32_A13189PLNCargaF, T01N32_n13189PLNCargaF, T01N32_A13185PLNDias,
            T01N32_n13185PLNDias
            }
            , new Object[] {
            T01N33_A396EmprCod, T01N33_A13181PLNProceso, T01N33_A13182PLNTipoCru, T01N33_A13183PLNColor, T01N33_A13188PLNLinea, T01N33_A13184PLNCarga, T01N33_n13184PLNCarga, T01N33_A13189PLNCargaF, T01N33_n13189PLNCargaF, T01N33_A13185PLNDias,
            T01N33_n13185PLNDias
            }
            , new Object[] {
            T01N34_A13181PLNProceso, T01N34_A13182PLNTipoCru, T01N34_A13187PLNUltCarg, T01N34_n13187PLNUltCarg, T01N34_A396EmprCod, T01N34_A13183PLNColor
            }
            , new Object[] {
            T01N35_A13181PLNProceso, T01N35_A13182PLNTipoCru, T01N35_A13187PLNUltCarg, T01N35_n13187PLNUltCarg, T01N35_A396EmprCod, T01N35_A13183PLNColor
            }
            , new Object[] {
            T01N36_A407EmprNom, T01N36_n407EmprNom
            }
            , new Object[] {
            T01N37_A13186PLNColorDs, T01N37_n13186PLNColorDs
            }
            , new Object[] {
            T01N38_A13181PLNProceso, T01N38_A13182PLNTipoCru, T01N38_A407EmprNom, T01N38_n407EmprNom, T01N38_A13186PLNColorDs, T01N38_n13186PLNColorDs, T01N38_A13187PLNUltCarg, T01N38_n13187PLNUltCarg, T01N38_A396EmprCod, T01N38_A13183PLNColor
            }
            , new Object[] {
            T01N39_A13186PLNColorDs, T01N39_n13186PLNColorDs
            }
            , new Object[] {
            T01N310_A396EmprCod, T01N310_A13181PLNProceso, T01N310_A13182PLNTipoCru, T01N310_A13183PLNColor
            }
            , new Object[] {
            T01N311_A396EmprCod, T01N311_A13181PLNProceso, T01N311_A13182PLNTipoCru, T01N311_A13183PLNColor
            }
            , new Object[] {
            T01N312_A396EmprCod, T01N312_A13181PLNProceso, T01N312_A13182PLNTipoCru, T01N312_A13183PLNColor
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01N316_A13186PLNColorDs, T01N316_n13186PLNColorDs
            }
            , new Object[] {
            }
            , new Object[] {
            T01N318_A396EmprCod, T01N318_A13181PLNProceso, T01N318_A13182PLNTipoCru, T01N318_A13183PLNColor
            }
            , new Object[] {
            T01N319_A396EmprCod, T01N319_A13181PLNProceso, T01N319_A13182PLNTipoCru, T01N319_A13183PLNColor, T01N319_A13188PLNLinea, T01N319_A13184PLNCarga, T01N319_n13184PLNCarga, T01N319_A13189PLNCargaF, T01N319_n13189PLNCargaF, T01N319_A13185PLNDias,
            T01N319_n13185PLNDias
            }
            , new Object[] {
            T01N320_A396EmprCod, T01N320_A13181PLNProceso, T01N320_A13182PLNTipoCru, T01N320_A13183PLNColor, T01N320_A13188PLNLinea
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01N324_A396EmprCod, T01N324_A13181PLNProceso, T01N324_A13182PLNTipoCru, T01N324_A13183PLNColor, T01N324_A13188PLNLinea
            }
            , new Object[] {
            T01N325_A407EmprNom, T01N325_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV37Pgmname = "TPLNACC" ;
      Gx_date = GXutil.today( ) ;
   }

   private byte Z13182PLNTipoCru ;
   private byte Z13183PLNColor ;
   private byte GxWebError ;
   private byte A13183PLNColor ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A13182PLNTipoCru ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ13182PLNTipoCru ;
   private byte ZZ13183PLNColor ;
   private short Z13187PLNUltCarg ;
   private short O13187PLNUltCarg ;
   private short Z13188PLNLinea ;
   private short Z13189PLNCargaF ;
   private short Z13185PLNDias ;
   private short nRcdDeleted_1805 ;
   private short nRcdExists_1805 ;
   private short nIsMod_1805 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A13187PLNUltCarg ;
   private short nBlankRcdCount1805 ;
   private short RcdFound1805 ;
   private short B13187PLNUltCarg ;
   private short nBlankRcdUsr1805 ;
   private short s13187PLNUltCarg ;
   private short A13188PLNLinea ;
   private short A13189PLNCargaF ;
   private short A13185PLNDias ;
   private short RcdFound1804 ;
   private short nIsDirty_1804 ;
   private short nIsDirty_1805 ;
   private short i13187PLNUltCarg ;
   private short ZZ13187PLNUltCarg ;
   private short ZO13187PLNUltCarg ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtPLNColor_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtPLNColorDs_Enabled ;
   private int edtPLNUltCarg_Enabled ;
   private int edtavnRcdDeleted_1805_Enabled ;
   private int edtPLNLinea_Enabled ;
   private int edtPLNCarga_Enabled ;
   private int edtPLNCargaF_Enabled ;
   private int edtPLNDias_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtPLNLinea_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtPLNUltCarg_Backcolor ;
   private int edtPLNColorDs_Backcolor ;
   private int edtPLNColor_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z13184PLNCarga ;
   private java.math.BigDecimal A13184PLNCarga ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z13181PLNProceso ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String sGXsfl_55_idx="0001" ;
   private String Gx_mode ;
   private String A13181PLNProceso ;
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
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtPLNColor_Internalname ;
   private String edtPLNColor_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtPLNColorDs_Internalname ;
   private String A13186PLNColorDs ;
   private String edtPLNColorDs_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtPLNUltCarg_Internalname ;
   private String edtPLNUltCarg_Jsonclick ;
   private String sMode1805 ;
   private String edtavnRcdDeleted_1805_Internalname ;
   private String edtPLNLinea_Internalname ;
   private String edtPLNCarga_Internalname ;
   private String edtPLNCargaF_Internalname ;
   private String edtPLNDias_Internalname ;
   private String subGrid1_Internalname ;
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
   private String AV37Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1804 ;
   private String GXCCtl ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z13186PLNColorDs ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1805_Jsonclick ;
   private String edtPLNLinea_Jsonclick ;
   private String edtPLNCarga_Jsonclick ;
   private String edtPLNCargaF_Jsonclick ;
   private String edtPLNDias_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ13181PLNProceso ;
   private String ZZ407EmprNom ;
   private String ZZ13186PLNColorDs ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n13187PLNUltCarg ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n13186PLNColorDs ;
   private boolean returnInSub ;
   private boolean n13184PLNCarga ;
   private boolean n13189PLNCargaF ;
   private boolean n13185PLNDias ;
   private String AV33txt ;
   private String AV34name ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private HTMLChoice cmbPLNProceso ;
   private HTMLChoice cmbPLNTipoCru ;
   private IDataStoreProvider pr_default ;
   private String[] T01N36_A407EmprNom ;
   private boolean[] T01N36_n407EmprNom ;
   private String[] T01N38_A13181PLNProceso ;
   private byte[] T01N38_A13182PLNTipoCru ;
   private String[] T01N38_A407EmprNom ;
   private boolean[] T01N38_n407EmprNom ;
   private String[] T01N38_A13186PLNColorDs ;
   private boolean[] T01N38_n13186PLNColorDs ;
   private short[] T01N38_A13187PLNUltCarg ;
   private boolean[] T01N38_n13187PLNUltCarg ;
   private String[] T01N38_A396EmprCod ;
   private byte[] T01N38_A13183PLNColor ;
   private String[] T01N37_A13186PLNColorDs ;
   private boolean[] T01N37_n13186PLNColorDs ;
   private String[] T01N39_A13186PLNColorDs ;
   private boolean[] T01N39_n13186PLNColorDs ;
   private String[] T01N310_A396EmprCod ;
   private String[] T01N310_A13181PLNProceso ;
   private byte[] T01N310_A13182PLNTipoCru ;
   private byte[] T01N310_A13183PLNColor ;
   private String[] T01N35_A13181PLNProceso ;
   private byte[] T01N35_A13182PLNTipoCru ;
   private short[] T01N35_A13187PLNUltCarg ;
   private boolean[] T01N35_n13187PLNUltCarg ;
   private String[] T01N35_A396EmprCod ;
   private byte[] T01N35_A13183PLNColor ;
   private String[] T01N311_A396EmprCod ;
   private String[] T01N311_A13181PLNProceso ;
   private byte[] T01N311_A13182PLNTipoCru ;
   private byte[] T01N311_A13183PLNColor ;
   private String[] T01N312_A396EmprCod ;
   private String[] T01N312_A13181PLNProceso ;
   private byte[] T01N312_A13182PLNTipoCru ;
   private byte[] T01N312_A13183PLNColor ;
   private String[] T01N34_A13181PLNProceso ;
   private byte[] T01N34_A13182PLNTipoCru ;
   private short[] T01N34_A13187PLNUltCarg ;
   private boolean[] T01N34_n13187PLNUltCarg ;
   private String[] T01N34_A396EmprCod ;
   private byte[] T01N34_A13183PLNColor ;
   private String[] T01N316_A13186PLNColorDs ;
   private boolean[] T01N316_n13186PLNColorDs ;
   private String[] T01N318_A396EmprCod ;
   private String[] T01N318_A13181PLNProceso ;
   private byte[] T01N318_A13182PLNTipoCru ;
   private byte[] T01N318_A13183PLNColor ;
   private String[] T01N319_A396EmprCod ;
   private String[] T01N319_A13181PLNProceso ;
   private byte[] T01N319_A13182PLNTipoCru ;
   private byte[] T01N319_A13183PLNColor ;
   private short[] T01N319_A13188PLNLinea ;
   private java.math.BigDecimal[] T01N319_A13184PLNCarga ;
   private boolean[] T01N319_n13184PLNCarga ;
   private short[] T01N319_A13189PLNCargaF ;
   private boolean[] T01N319_n13189PLNCargaF ;
   private short[] T01N319_A13185PLNDias ;
   private boolean[] T01N319_n13185PLNDias ;
   private String[] T01N320_A396EmprCod ;
   private String[] T01N320_A13181PLNProceso ;
   private byte[] T01N320_A13182PLNTipoCru ;
   private byte[] T01N320_A13183PLNColor ;
   private short[] T01N320_A13188PLNLinea ;
   private String[] T01N33_A396EmprCod ;
   private String[] T01N33_A13181PLNProceso ;
   private byte[] T01N33_A13182PLNTipoCru ;
   private byte[] T01N33_A13183PLNColor ;
   private short[] T01N33_A13188PLNLinea ;
   private java.math.BigDecimal[] T01N33_A13184PLNCarga ;
   private boolean[] T01N33_n13184PLNCarga ;
   private short[] T01N33_A13189PLNCargaF ;
   private boolean[] T01N33_n13189PLNCargaF ;
   private short[] T01N33_A13185PLNDias ;
   private boolean[] T01N33_n13185PLNDias ;
   private String[] T01N32_A396EmprCod ;
   private String[] T01N32_A13181PLNProceso ;
   private byte[] T01N32_A13182PLNTipoCru ;
   private byte[] T01N32_A13183PLNColor ;
   private short[] T01N32_A13188PLNLinea ;
   private java.math.BigDecimal[] T01N32_A13184PLNCarga ;
   private boolean[] T01N32_n13184PLNCarga ;
   private short[] T01N32_A13189PLNCargaF ;
   private boolean[] T01N32_n13189PLNCargaF ;
   private short[] T01N32_A13185PLNDias ;
   private boolean[] T01N32_n13185PLNDias ;
   private String[] T01N324_A396EmprCod ;
   private String[] T01N324_A13181PLNProceso ;
   private byte[] T01N324_A13182PLNTipoCru ;
   private byte[] T01N324_A13183PLNColor ;
   private short[] T01N324_A13188PLNLinea ;
   private String[] T01N325_A407EmprNom ;
   private boolean[] T01N325_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tplnacc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplnacc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplnacc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplnacc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplnacc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01N32", "SELECT EmprCod, PLNProceso, PLNTipoCru, PLNColor, PLNLinea, PLNCarga, PLNCargaF, PLNDias FROM TXPPLNAC1 WHERE EmprCod = ? AND PLNProceso = ? AND PLNTipoCru = ? AND PLNColor = ? AND PLNLinea = ?  FOR UPDATE OF PLNCarga, PLNCargaF, PLNDias NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N33", "SELECT EmprCod, PLNProceso, PLNTipoCru, PLNColor, PLNLinea, PLNCarga, PLNCargaF, PLNDias FROM TXPPLNAC1 WHERE EmprCod = ? AND PLNProceso = ? AND PLNTipoCru = ? AND PLNColor = ? AND PLNLinea = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N34", "SELECT PLNProceso, PLNTipoCru, PLNUltCarg, EmprCod, PLNColor FROM TXPPLNACC WHERE EmprCod = ? AND PLNProceso = ? AND PLNTipoCru = ? AND PLNColor = ?  FOR UPDATE OF PLNUltCarg NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N35", "SELECT PLNProceso, PLNTipoCru, PLNUltCarg, EmprCod, PLNColor FROM TXPPLNACC WHERE EmprCod = ? AND PLNProceso = ? AND PLNTipoCru = ? AND PLNColor = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N36", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N37", "SELECT PLNColorDs FROM TXPPLNCol WHERE EmprCod = ? AND PLNColor = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N38", "SELECT /*+ FIRST_ROWS(100) */ TM1.PLNProceso, TM1.PLNTipoCru, T2.EmprNom, T3.PLNColorDs, TM1.PLNUltCarg, TM1.EmprCod, TM1.PLNColor FROM ((TXPPLNACC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPPLNCol T3 ON T3.EmprCod = TM1.EmprCod AND T3.PLNColor = TM1.PLNColor) WHERE TM1.EmprCod = ? and TM1.PLNProceso = ? and TM1.PLNTipoCru = ? and TM1.PLNColor = ? ORDER BY TM1.EmprCod, TM1.PLNProceso, TM1.PLNTipoCru, TM1.PLNColor ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N39", "SELECT PLNColorDs FROM TXPPLNCol WHERE EmprCod = ? AND PLNColor = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N310", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PLNProceso, PLNTipoCru, PLNColor FROM TXPPLNACC WHERE EmprCod = ? AND PLNProceso = ? AND PLNTipoCru = ? AND PLNColor = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N311", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PLNProceso, PLNTipoCru, PLNColor FROM TXPPLNACC WHERE ( PLNProceso > ? or PLNProceso = ? and PLNTipoCru > ? or PLNTipoCru = ? and PLNProceso = ? and PLNColor > ?) and EmprCod = ? ORDER BY EmprCod, PLNProceso, PLNTipoCru, PLNColor) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N312", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PLNProceso, PLNTipoCru, PLNColor FROM TXPPLNACC WHERE ( PLNProceso < ? or PLNProceso = ? and PLNTipoCru < ? or PLNTipoCru = ? and PLNProceso = ? and PLNColor < ?) and EmprCod = ? ORDER BY EmprCod DESC, PLNProceso DESC, PLNTipoCru DESC, PLNColor DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01N313", "INSERT INTO TXPPLNACC(PLNProceso, PLNTipoCru, PLNUltCarg, EmprCod, PLNColor) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPPLNACC")
         ,new UpdateCursor("T01N314", "UPDATE TXPPLNACC SET PLNUltCarg=?  WHERE EmprCod = ? AND PLNProceso = ? AND PLNTipoCru = ? AND PLNColor = ?", GX_NOMASK, "TXPPLNACC")
         ,new UpdateCursor("T01N315", "DELETE FROM TXPPLNACC  WHERE EmprCod = ? AND PLNProceso = ? AND PLNTipoCru = ? AND PLNColor = ?", GX_NOMASK, "TXPPLNACC")
         ,new ForEachCursor("T01N316", "SELECT PLNColorDs FROM TXPPLNCol WHERE EmprCod = ? AND PLNColor = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01N317", "UPDATE TXPPLNACC SET PLNUltCarg=?  WHERE EmprCod = ? AND PLNProceso = ? AND PLNTipoCru = ? AND PLNColor = ?", GX_NOMASK, "TXPPLNACC")
         ,new ForEachCursor("T01N318", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PLNProceso, PLNTipoCru, PLNColor FROM TXPPLNACC WHERE EmprCod = ? ORDER BY EmprCod, PLNProceso, PLNTipoCru, PLNColor ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N319", "SELECT EmprCod, PLNProceso, PLNTipoCru, PLNColor, PLNLinea, PLNCarga, PLNCargaF, PLNDias FROM TXPPLNAC1 WHERE EmprCod = ? and PLNProceso = ? and PLNTipoCru = ? and PLNColor = ? and PLNLinea = ? ORDER BY EmprCod, PLNProceso, PLNTipoCru, PLNColor, PLNLinea ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N320", "SELECT EmprCod, PLNProceso, PLNTipoCru, PLNColor, PLNLinea FROM TXPPLNAC1 WHERE EmprCod = ? AND PLNProceso = ? AND PLNTipoCru = ? AND PLNColor = ? AND PLNLinea = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01N321", "INSERT INTO TXPPLNAC1(EmprCod, PLNProceso, PLNTipoCru, PLNColor, PLNLinea, PLNCarga, PLNCargaF, PLNDias) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPLNAC1")
         ,new UpdateCursor("T01N322", "UPDATE TXPPLNAC1 SET PLNCarga=?, PLNCargaF=?, PLNDias=?  WHERE EmprCod = ? AND PLNProceso = ? AND PLNTipoCru = ? AND PLNColor = ? AND PLNLinea = ?", GX_NOMASK, "TXPPLNAC1")
         ,new UpdateCursor("T01N323", "DELETE FROM TXPPLNAC1  WHERE EmprCod = ? AND PLNProceso = ? AND PLNTipoCru = ? AND PLNColor = ? AND PLNLinea = ?", GX_NOMASK, "TXPPLNAC1")
         ,new ForEachCursor("T01N324", "SELECT EmprCod, PLNProceso, PLNTipoCru, PLNColor, PLNLinea FROM TXPPLNAC1 WHERE EmprCod = ? and PLNProceso = ? and PLNTipoCru = ? and PLNColor = ? ORDER BY EmprCod, PLNProceso, PLNTipoCru, PLNColor, PLNLinea ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N325", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               stmt.setString(2, (String)parms[1], 1);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               stmt.setString(4, (String)parms[4], 3);
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 1);
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 1);
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[10]).shortValue());
               }
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setString(5, (String)parms[7], 1);
               stmt.setByte(6, ((Number) parms[8]).byteValue());
               stmt.setByte(7, ((Number) parms[9]).byteValue());
               stmt.setShort(8, ((Number) parms[10]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

