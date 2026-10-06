package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tasipor_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla Asignacion", ""), (short)(0)) ;
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

   public void gxnrgrid1_newrow_invoke( )
   {
      nRC_GXsfl_40 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_40"))) ;
      nGXsfl_40_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_40_idx"))) ;
      sGXsfl_40_idx = httpContext.GetPar( "sGXsfl_40_idx") ;
      A12986AsiPorUltL = (short)(GXutil.lval( httpContext.GetPar( "AsiPorUltL"))) ;
      n12986AsiPorUltL = false ;
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

   public tasipor_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tasipor_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tasipor_impl.class ));
   }

   public tasipor_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAsiPorID = new HTMLChoice();
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
      if ( cmbAsiPorID.getItemCount() > 0 )
      {
         A12985AsiPorID = cmbAsiPorID.getValidValue(A12985AsiPorID) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12985AsiPorID", A12985AsiPorID);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAsiPorID.setValue( GXutil.rtrim( A12985AsiPorID) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAsiPorID.getInternalname(), "Values", cmbAsiPorID.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TASIPOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TASIPOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TASIPOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TASIPOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TASIPOR.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TASIPOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TASIPOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TASIPOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TASIPOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Tecnologia (Plano,Circulares,Tricot)", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TASIPOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAsiPorID, cmbAsiPorID.getInternalname(), GXutil.rtrim( A12985AsiPorID), 1, cmbAsiPorID.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAsiPorID.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "", true, (byte)(0), "HLP_TASIPOR.htm");
      cmbAsiPorID.setValue( GXutil.rtrim( A12985AsiPorID) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAsiPorID.getInternalname(), "Values", cmbAsiPorID.ToJavascriptSource(), true);
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TASIPOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TASIPOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAsiPorUltL_Internalname, GXutil.ltrim( localUtil.ntoc( A12986AsiPorUltL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAsiPorUltL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12986AsiPorUltL), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12986AsiPorUltL), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAsiPorUltL_Jsonclick, 0, "", "", "", "", "", 1, edtAsiPorUltL_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TASIPOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol40( ) ;
      nGXsfl_40_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1780 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1780 = (short)(1) ;
            scanStart1M61780( ) ;
            while ( RcdFound1780 != 0 )
            {
               init_level_properties1780( ) ;
               getByPrimaryKey1M61780( ) ;
               addRow1M61780( ) ;
               scanNext1M61780( ) ;
            }
            scanEnd1M61780( ) ;
            nBlankRcdCount1780 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B12986AsiPorUltL = A12986AsiPorUltL ;
         n12986AsiPorUltL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
         standaloneNotModal1M61780( ) ;
         standaloneModal1M61780( ) ;
         sMode1780 = Gx_mode ;
         while ( nGXsfl_40_idx < nRC_GXsfl_40 )
         {
            bGXsfl_40_Refreshing = true ;
            readRow1M61780( ) ;
            edtavnRcdDeleted_1780_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1780_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1780_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1780_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtAsiPorLn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ASIPORLN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAsiPorLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAsiPorLn_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtAsiPorMMn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ASIPORMMN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAsiPorMMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAsiPorMMn_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtAsiPorMMx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ASIPORMMX_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAsiPorMMx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAsiPorMMx_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtAsiPorPMn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ASIPORPMN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAsiPorPMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAsiPorPMn_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtAsiPorPMx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ASIPORPMX_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAsiPorPMx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAsiPorPMx_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            if ( ( nRcdExists_1780 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1M61780( ) ;
            }
            sendRow1M61780( ) ;
            bGXsfl_40_Refreshing = false ;
         }
         Gx_mode = sMode1780 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A12986AsiPorUltL = B12986AsiPorUltL ;
         n12986AsiPorUltL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1780 = (short)(5) ;
         nRcdExists_1780 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1M61780( ) ;
            while ( RcdFound1780 != 0 )
            {
               sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_401780( ) ;
               init_level_properties1780( ) ;
               standaloneNotModal1M61780( ) ;
               getByPrimaryKey1M61780( ) ;
               standaloneModal1M61780( ) ;
               addRow1M61780( ) ;
               scanNext1M61780( ) ;
            }
            scanEnd1M61780( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1780 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_401780( ) ;
      initAll1M61780( ) ;
      init_level_properties1780( ) ;
      B12986AsiPorUltL = A12986AsiPorUltL ;
      n12986AsiPorUltL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
      nRcdExists_1780 = (short)(0) ;
      nIsMod_1780 = (short)(0) ;
      nRcdDeleted_1780 = (short)(0) ;
      nBlankRcdCount1780 = (short)(nBlankRcdUsr1780+nBlankRcdCount1780) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1780 > 0 )
      {
         standaloneNotModal1M61780( ) ;
         standaloneModal1M61780( ) ;
         addRow1M61780( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtAsiPorLn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1780 = (short)(nBlankRcdCount1780-1) ;
      }
      Gx_mode = sMode1780 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A12986AsiPorUltL = B12986AsiPorUltL ;
      n12986AsiPorUltL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TASIPOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TASIPOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TASIPOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TASIPOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TASIPOR.htm");
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
         Z12985AsiPorID = httpContext.cgiGet( "Z12985AsiPorID") ;
         Z12986AsiPorUltL = (short)(localUtil.ctol( httpContext.cgiGet( "Z12986AsiPorUltL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O12986AsiPorUltL = (short)(localUtil.ctol( httpContext.cgiGet( "O12986AsiPorUltL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         cmbAsiPorID.setName( cmbAsiPorID.getInternalname() );
         cmbAsiPorID.setValue( httpContext.cgiGet( cmbAsiPorID.getInternalname()) );
         A12985AsiPorID = httpContext.cgiGet( cmbAsiPorID.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12985AsiPorID", A12985AsiPorID);
         A12986AsiPorUltL = (short)(localUtil.ctol( httpContext.cgiGet( edtAsiPorUltL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12986AsiPorUltL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
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
            A12985AsiPorID = httpContext.GetPar( "AsiPorID") ;
            httpContext.ajax_rsp_assign_attri("", false, "A12985AsiPorID", A12985AsiPorID);
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
            initAll1M61779( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1780_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1780_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      disableAttributes1M61779( ) ;
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

   public void confirm_1M60( )
   {
      beforeValidate1M61779( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1M61779( ) ;
         }
         else
         {
            checkExtendedTable1M61779( ) ;
            if ( AnyError == 0 )
            {
               zm1M61779( 6) ;
            }
            closeExtendedTableCursors1M61779( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1779 = Gx_mode ;
         confirm_1M61780( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1779 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1779 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1M60( ) ;
      }
   }

   public void confirm_1M61780( )
   {
      s12986AsiPorUltL = O12986AsiPorUltL ;
      n12986AsiPorUltL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1M61780( ) ;
         if ( ( nRcdExists_1780 != 0 ) || ( nIsMod_1780 != 0 ) )
         {
            getKey1M61780( ) ;
            if ( ( nRcdExists_1780 == 0 ) && ( nRcdDeleted_1780 == 0 ) )
            {
               if ( RcdFound1780 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1M61780( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1M61780( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1M61780( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O12986AsiPorUltL = A12986AsiPorUltL ;
                     n12986AsiPorUltL = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "ASIPORLN_" + sGXsfl_40_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAsiPorLn_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1780 != 0 )
               {
                  if ( nRcdDeleted_1780 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1M61780( ) ;
                     load1M61780( ) ;
                     beforeValidate1M61780( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1M61780( ) ;
                        O12986AsiPorUltL = A12986AsiPorUltL ;
                        n12986AsiPorUltL = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1780 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1M61780( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1M61780( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1M61780( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O12986AsiPorUltL = A12986AsiPorUltL ;
                           n12986AsiPorUltL = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1780 == 0 )
                  {
                     GXCCtl = "ASIPORLN_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAsiPorLn_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1780_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1780, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAsiPorLn_Internalname, GXutil.ltrim( localUtil.ntoc( A12987AsiPorLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAsiPorMMn_Internalname, GXutil.ltrim( localUtil.ntoc( A12988AsiPorMMn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAsiPorMMx_Internalname, GXutil.ltrim( localUtil.ntoc( A12989AsiPorMMx, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAsiPorPMn_Internalname, GXutil.ltrim( localUtil.ntoc( A12990AsiPorPMn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAsiPorPMx_Internalname, GXutil.ltrim( localUtil.ntoc( A12991AsiPorPMx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12987AsiPorLn_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12987AsiPorLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12988AsiPorMMn_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12988AsiPorMMn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12989AsiPorMMx_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12989AsiPorMMx, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12990AsiPorPMn_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12990AsiPorPMn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12991AsiPorPMx_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12991AsiPorPMx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1780_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1780, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1780_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1780, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1780_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1780, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1780 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1780_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1780_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ASIPORLN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAsiPorLn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ASIPORMMN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAsiPorMMn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ASIPORMMX_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAsiPorMMx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ASIPORPMN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAsiPorPMn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ASIPORPMX_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAsiPorPMx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O12986AsiPorUltL = s12986AsiPorUltL ;
      n12986AsiPorUltL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1M60( )
   {
   }

   public void zm1M61779( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12986AsiPorUltL = T01M65_A12986AsiPorUltL[0] ;
         }
         else
         {
            Z12986AsiPorUltL = A12986AsiPorUltL ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z12985AsiPorID = A12985AsiPorID ;
         Z12986AsiPorUltL = A12986AsiPorUltL ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtAsiPorUltL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAsiPorUltL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAsiPorUltL_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtAsiPorUltL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAsiPorUltL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAsiPorUltL_Enabled), 5, 0), true);
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

   public void load1M61779( )
   {
      /* Using cursor T01M67 */
      pr_default.execute(5, new Object[] {A396EmprCod, A12985AsiPorID});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1779 = (short)(1) ;
         A407EmprNom = T01M67_A407EmprNom[0] ;
         n407EmprNom = T01M67_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A12986AsiPorUltL = T01M67_A12986AsiPorUltL[0] ;
         n12986AsiPorUltL = T01M67_n12986AsiPorUltL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
         zm1M61779( -5) ;
      }
      pr_default.close(5);
      onLoadActions1M61779( ) ;
   }

   public void onLoadActions1M61779( )
   {
   }

   public void checkExtendedTable1M61779( )
   {
      nIsDirty_1779 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01M66 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01M66_A407EmprNom[0] ;
      n407EmprNom = T01M66_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
   }

   public void closeExtendedTableCursors1M61779( )
   {
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_6( String A396EmprCod )
   {
      /* Using cursor T01M68 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01M68_A407EmprNom[0] ;
      n407EmprNom = T01M68_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1M61779( )
   {
      /* Using cursor T01M69 */
      pr_default.execute(7, new Object[] {A396EmprCod, A12985AsiPorID});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1779 = (short)(1) ;
      }
      else
      {
         RcdFound1779 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01M65 */
      pr_default.execute(3, new Object[] {A396EmprCod, A12985AsiPorID});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1M61779( 5) ;
         RcdFound1779 = (short)(1) ;
         A12985AsiPorID = T01M65_A12985AsiPorID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12985AsiPorID", A12985AsiPorID);
         A12986AsiPorUltL = T01M65_A12986AsiPorUltL[0] ;
         n12986AsiPorUltL = T01M65_n12986AsiPorUltL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
         A396EmprCod = T01M65_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         O12986AsiPorUltL = A12986AsiPorUltL ;
         n12986AsiPorUltL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z12985AsiPorID = A12985AsiPorID ;
         sMode1779 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1M61779( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1779 = (short)(0) ;
            initializeNonKey1M61779( ) ;
         }
         Gx_mode = sMode1779 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1779 = (short)(0) ;
         initializeNonKey1M61779( ) ;
         sMode1779 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1779 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1M61779( ) ;
      if ( RcdFound1779 == 0 )
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
      RcdFound1779 = (short)(0) ;
      /* Using cursor T01M610 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, A12985AsiPorID});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01M610_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01M610_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M610_A12985AsiPorID[0], A12985AsiPorID) < 0 ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01M610_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01M610_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M610_A12985AsiPorID[0], A12985AsiPorID) > 0 ) ) )
         {
            A396EmprCod = T01M610_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A12985AsiPorID = T01M610_A12985AsiPorID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12985AsiPorID", A12985AsiPorID);
            RcdFound1779 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1779 = (short)(0) ;
      /* Using cursor T01M611 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, A12985AsiPorID});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01M611_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01M611_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M611_A12985AsiPorID[0], A12985AsiPorID) > 0 ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01M611_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01M611_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M611_A12985AsiPorID[0], A12985AsiPorID) < 0 ) ) )
         {
            A396EmprCod = T01M611_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A12985AsiPorID = T01M611_A12985AsiPorID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12985AsiPorID", A12985AsiPorID);
            RcdFound1779 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1M61779( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A12986AsiPorUltL = O12986AsiPorUltL ;
         n12986AsiPorUltL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1M61779( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1779 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A12985AsiPorID, Z12985AsiPorID) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A12985AsiPorID = Z12985AsiPorID ;
               httpContext.ajax_rsp_assign_attri("", false, "A12985AsiPorID", A12985AsiPorID);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A12986AsiPorUltL = O12986AsiPorUltL ;
               n12986AsiPorUltL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
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
               A12986AsiPorUltL = O12986AsiPorUltL ;
               n12986AsiPorUltL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
               update1M61779( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A12985AsiPorID, Z12985AsiPorID) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A12986AsiPorUltL = O12986AsiPorUltL ;
               n12986AsiPorUltL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1M61779( ) ;
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
                  A12986AsiPorUltL = O12986AsiPorUltL ;
                  n12986AsiPorUltL = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1M61779( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A12985AsiPorID, Z12985AsiPorID) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12985AsiPorID = Z12985AsiPorID ;
         httpContext.ajax_rsp_assign_attri("", false, "A12985AsiPorID", A12985AsiPorID);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A12986AsiPorUltL = O12986AsiPorUltL ;
         n12986AsiPorUltL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
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
      getKey1M61779( ) ;
      if ( RcdFound1779 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A12985AsiPorID, Z12985AsiPorID) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A12985AsiPorID = Z12985AsiPorID ;
            httpContext.ajax_rsp_assign_attri("", false, "A12985AsiPorID", A12985AsiPorID);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A12985AsiPorID, Z12985AsiPorID) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tasipor");
   }

   public void insert_check( )
   {
      confirm_1M60( ) ;
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
      if ( RcdFound1779 == 0 )
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
      scanStart1M61779( ) ;
      if ( RcdFound1779 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1M61779( ) ;
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
      if ( RcdFound1779 == 0 )
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
      if ( RcdFound1779 == 0 )
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
      scanStart1M61779( ) ;
      if ( RcdFound1779 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1779 != 0 )
         {
            scanNext1M61779( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1M61779( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1M61779( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01M64 */
         pr_default.execute(2, new Object[] {A396EmprCod, A12985AsiPorID});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPASIPOR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z12986AsiPorUltL != T01M64_A12986AsiPorUltL[0] ) )
         {
            if ( Z12986AsiPorUltL != T01M64_A12986AsiPorUltL[0] )
            {
               GXutil.writeLogln("tasipor:[seudo value changed for attri]"+"AsiPorUltL");
               GXutil.writeLogRaw("Old: ",Z12986AsiPorUltL);
               GXutil.writeLogRaw("Current: ",T01M64_A12986AsiPorUltL[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPASIPOR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1M61779( )
   {
      beforeValidate1M61779( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M61779( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1M61779( 0) ;
         checkOptimisticConcurrency1M61779( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1M61779( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1M61779( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01M612 */
                  pr_default.execute(10, new Object[] {A12985AsiPorID, Boolean.valueOf(n12986AsiPorUltL), Short.valueOf(A12986AsiPorUltL), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPASIPOR");
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
                        processLevel1M61779( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1M60( ) ;
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
            load1M61779( ) ;
         }
         endLevel1M61779( ) ;
      }
      closeExtendedTableCursors1M61779( ) ;
   }

   public void update1M61779( )
   {
      beforeValidate1M61779( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M61779( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1M61779( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1M61779( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1M61779( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01M613 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n12986AsiPorUltL), Short.valueOf(A12986AsiPorUltL), A396EmprCod, A12985AsiPorID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPASIPOR");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPASIPOR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1M61779( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1M61779( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1M60( ) ;
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
         endLevel1M61779( ) ;
      }
      closeExtendedTableCursors1M61779( ) ;
   }

   public void deferredUpdate1M61779( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1M61779( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1M61779( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1M61779( ) ;
         afterConfirm1M61779( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1M61779( ) ;
            if ( AnyError == 0 )
            {
               A12986AsiPorUltL = O12986AsiPorUltL ;
               n12986AsiPorUltL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
               scanStart1M61780( ) ;
               while ( RcdFound1780 != 0 )
               {
                  getByPrimaryKey1M61780( ) ;
                  delete1M61780( ) ;
                  scanNext1M61780( ) ;
                  O12986AsiPorUltL = A12986AsiPorUltL ;
                  n12986AsiPorUltL = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
               }
               scanEnd1M61780( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01M614 */
                  pr_default.execute(12, new Object[] {A396EmprCod, A12985AsiPorID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPASIPOR");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1779 == 0 )
                        {
                           initAll1M61779( ) ;
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
                        resetCaption1M60( ) ;
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
      sMode1779 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1M61779( ) ;
      Gx_mode = sMode1779 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1M61779( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01M615 */
         pr_default.execute(13, new Object[] {A396EmprCod});
         A407EmprNom = T01M615_A407EmprNom[0] ;
         n407EmprNom = T01M615_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(13);
      }
   }

   public void processNestedLevel1M61780( )
   {
      s12986AsiPorUltL = O12986AsiPorUltL ;
      n12986AsiPorUltL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1M61780( ) ;
         if ( ( nRcdExists_1780 != 0 ) || ( nIsMod_1780 != 0 ) )
         {
            standaloneNotModal1M61780( ) ;
            getKey1M61780( ) ;
            if ( ( nRcdExists_1780 == 0 ) && ( nRcdDeleted_1780 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1M61780( ) ;
            }
            else
            {
               if ( RcdFound1780 != 0 )
               {
                  if ( ( nRcdDeleted_1780 != 0 ) && ( nRcdExists_1780 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1M61780( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1780 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1M61780( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1780 == 0 )
                  {
                     GXCCtl = "ASIPORLN_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAsiPorLn_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O12986AsiPorUltL = A12986AsiPorUltL ;
            n12986AsiPorUltL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1780_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1780, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAsiPorLn_Internalname, GXutil.ltrim( localUtil.ntoc( A12987AsiPorLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAsiPorMMn_Internalname, GXutil.ltrim( localUtil.ntoc( A12988AsiPorMMn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAsiPorMMx_Internalname, GXutil.ltrim( localUtil.ntoc( A12989AsiPorMMx, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAsiPorPMn_Internalname, GXutil.ltrim( localUtil.ntoc( A12990AsiPorPMn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAsiPorPMx_Internalname, GXutil.ltrim( localUtil.ntoc( A12991AsiPorPMx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12987AsiPorLn_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12987AsiPorLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12988AsiPorMMn_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12988AsiPorMMn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12989AsiPorMMx_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12989AsiPorMMx, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12990AsiPorPMn_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12990AsiPorPMn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12991AsiPorPMx_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12991AsiPorPMx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1780_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1780, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1780_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1780, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1780_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1780, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1780 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1780_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1780_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ASIPORLN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAsiPorLn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ASIPORMMN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAsiPorMMn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ASIPORMMX_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAsiPorMMx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ASIPORPMN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAsiPorPMn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ASIPORPMX_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAsiPorPMx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1M61780( ) ;
      if ( AnyError != 0 )
      {
         O12986AsiPorUltL = s12986AsiPorUltL ;
         n12986AsiPorUltL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
      }
      nRcdExists_1780 = (short)(0) ;
      nIsMod_1780 = (short)(0) ;
      nRcdDeleted_1780 = (short)(0) ;
   }

   public void processLevel1M61779( )
   {
      /* Save parent mode. */
      sMode1779 = Gx_mode ;
      processNestedLevel1M61780( ) ;
      if ( AnyError != 0 )
      {
         O12986AsiPorUltL = s12986AsiPorUltL ;
         n12986AsiPorUltL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1779 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01M616 */
      pr_default.execute(14, new Object[] {Boolean.valueOf(n12986AsiPorUltL), Short.valueOf(A12986AsiPorUltL), A396EmprCod, A12985AsiPorID});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPASIPOR");
   }

   public void endLevel1M61779( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1M61779( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tasipor");
         if ( AnyError == 0 )
         {
            confirmValues1M60( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tasipor");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1M61779( )
   {
      /* Using cursor T01M617 */
      pr_default.execute(15);
      RcdFound1779 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1779 = (short)(1) ;
         A396EmprCod = T01M617_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12985AsiPorID = T01M617_A12985AsiPorID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12985AsiPorID", A12985AsiPorID);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1M61779( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1779 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1779 = (short)(1) ;
         A396EmprCod = T01M617_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12985AsiPorID = T01M617_A12985AsiPorID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12985AsiPorID", A12985AsiPorID);
      }
   }

   public void scanEnd1M61779( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1M61779( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1M61779( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1M61779( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1M61779( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1M61779( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1M61779( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1M61779( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      cmbAsiPorID.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAsiPorID.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAsiPorID.getEnabled(), 5, 0), true);
      edtAsiPorUltL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAsiPorUltL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAsiPorUltL_Enabled), 5, 0), true);
   }

   public void zm1M61780( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12988AsiPorMMn = T01M63_A12988AsiPorMMn[0] ;
            Z12989AsiPorMMx = T01M63_A12989AsiPorMMx[0] ;
            Z12990AsiPorPMn = T01M63_A12990AsiPorPMn[0] ;
            Z12991AsiPorPMx = T01M63_A12991AsiPorPMx[0] ;
         }
         else
         {
            Z12988AsiPorMMn = A12988AsiPorMMn ;
            Z12989AsiPorMMx = A12989AsiPorMMx ;
            Z12990AsiPorPMn = A12990AsiPorPMn ;
            Z12991AsiPorPMx = A12991AsiPorPMx ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z396EmprCod = A396EmprCod ;
         Z12985AsiPorID = A12985AsiPorID ;
         Z12987AsiPorLn = A12987AsiPorLn ;
         Z12988AsiPorMMn = A12988AsiPorMMn ;
         Z12989AsiPorMMx = A12989AsiPorMMx ;
         Z12990AsiPorPMn = A12990AsiPorPMn ;
         Z12991AsiPorPMx = A12991AsiPorPMx ;
      }
   }

   public void standaloneNotModal1M61780( )
   {
      edtAsiPorUltL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAsiPorUltL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAsiPorUltL_Enabled), 5, 0), true);
      edtAsiPorUltL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAsiPorUltL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAsiPorUltL_Enabled), 5, 0), true);
   }

   public void standaloneModal1M61780( )
   {
      if ( isIns( )  )
      {
         A12986AsiPorUltL = (short)(O12986AsiPorUltL+1) ;
         n12986AsiPorUltL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A12987AsiPorLn = A12986AsiPorUltL ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAsiPorLn_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAsiPorLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAsiPorLn_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtAsiPorLn_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAsiPorLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAsiPorLn_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
   }

   public void load1M61780( )
   {
      /* Using cursor T01M618 */
      pr_default.execute(16, new Object[] {A396EmprCod, A12985AsiPorID, Short.valueOf(A12987AsiPorLn)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1780 = (short)(1) ;
         A12988AsiPorMMn = T01M618_A12988AsiPorMMn[0] ;
         n12988AsiPorMMn = T01M618_n12988AsiPorMMn[0] ;
         A12989AsiPorMMx = T01M618_A12989AsiPorMMx[0] ;
         n12989AsiPorMMx = T01M618_n12989AsiPorMMx[0] ;
         A12990AsiPorPMn = T01M618_A12990AsiPorPMn[0] ;
         n12990AsiPorPMn = T01M618_n12990AsiPorPMn[0] ;
         A12991AsiPorPMx = T01M618_A12991AsiPorPMx[0] ;
         n12991AsiPorPMx = T01M618_n12991AsiPorPMx[0] ;
         zm1M61780( -7) ;
      }
      pr_default.close(16);
      onLoadActions1M61780( ) ;
   }

   public void onLoadActions1M61780( )
   {
   }

   public void checkExtendedTable1M61780( )
   {
      nIsDirty_1780 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1M61780( ) ;
   }

   public void closeExtendedTableCursors1M61780( )
   {
   }

   public void enableDisable1M61780( )
   {
   }

   public void getKey1M61780( )
   {
      /* Using cursor T01M619 */
      pr_default.execute(17, new Object[] {A396EmprCod, A12985AsiPorID, Short.valueOf(A12987AsiPorLn)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1780 = (short)(1) ;
      }
      else
      {
         RcdFound1780 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey1M61780( )
   {
      /* Using cursor T01M63 */
      pr_default.execute(1, new Object[] {A396EmprCod, A12985AsiPorID, Short.valueOf(A12987AsiPorLn)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1M61780( 7) ;
         RcdFound1780 = (short)(1) ;
         initializeNonKey1M61780( ) ;
         A12987AsiPorLn = T01M63_A12987AsiPorLn[0] ;
         A12988AsiPorMMn = T01M63_A12988AsiPorMMn[0] ;
         n12988AsiPorMMn = T01M63_n12988AsiPorMMn[0] ;
         A12989AsiPorMMx = T01M63_A12989AsiPorMMx[0] ;
         n12989AsiPorMMx = T01M63_n12989AsiPorMMx[0] ;
         A12990AsiPorPMn = T01M63_A12990AsiPorPMn[0] ;
         n12990AsiPorPMn = T01M63_n12990AsiPorPMn[0] ;
         A12991AsiPorPMx = T01M63_A12991AsiPorPMx[0] ;
         n12991AsiPorPMx = T01M63_n12991AsiPorPMx[0] ;
         Z396EmprCod = A396EmprCod ;
         Z12985AsiPorID = A12985AsiPorID ;
         Z12987AsiPorLn = A12987AsiPorLn ;
         sMode1780 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1M61780( ) ;
         load1M61780( ) ;
         Gx_mode = sMode1780 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1780 = (short)(0) ;
         initializeNonKey1M61780( ) ;
         sMode1780 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1M61780( ) ;
         Gx_mode = sMode1780 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1M61780( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1M61780( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01M62 */
         pr_default.execute(0, new Object[] {A396EmprCod, A12985AsiPorID, Short.valueOf(A12987AsiPorLn)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPASIPO1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z12988AsiPorMMn, T01M62_A12988AsiPorMMn[0]) != 0 ) || ( DecimalUtil.compareTo(Z12989AsiPorMMx, T01M62_A12989AsiPorMMx[0]) != 0 ) || ( Z12990AsiPorPMn != T01M62_A12990AsiPorPMn[0] ) || ( Z12991AsiPorPMx != T01M62_A12991AsiPorPMx[0] ) )
         {
            if ( DecimalUtil.compareTo(Z12988AsiPorMMn, T01M62_A12988AsiPorMMn[0]) != 0 )
            {
               GXutil.writeLogln("tasipor:[seudo value changed for attri]"+"AsiPorMMn");
               GXutil.writeLogRaw("Old: ",Z12988AsiPorMMn);
               GXutil.writeLogRaw("Current: ",T01M62_A12988AsiPorMMn[0]);
            }
            if ( DecimalUtil.compareTo(Z12989AsiPorMMx, T01M62_A12989AsiPorMMx[0]) != 0 )
            {
               GXutil.writeLogln("tasipor:[seudo value changed for attri]"+"AsiPorMMx");
               GXutil.writeLogRaw("Old: ",Z12989AsiPorMMx);
               GXutil.writeLogRaw("Current: ",T01M62_A12989AsiPorMMx[0]);
            }
            if ( Z12990AsiPorPMn != T01M62_A12990AsiPorPMn[0] )
            {
               GXutil.writeLogln("tasipor:[seudo value changed for attri]"+"AsiPorPMn");
               GXutil.writeLogRaw("Old: ",Z12990AsiPorPMn);
               GXutil.writeLogRaw("Current: ",T01M62_A12990AsiPorPMn[0]);
            }
            if ( Z12991AsiPorPMx != T01M62_A12991AsiPorPMx[0] )
            {
               GXutil.writeLogln("tasipor:[seudo value changed for attri]"+"AsiPorPMx");
               GXutil.writeLogRaw("Old: ",Z12991AsiPorPMx);
               GXutil.writeLogRaw("Current: ",T01M62_A12991AsiPorPMx[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPASIPO1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1M61780( )
   {
      beforeValidate1M61780( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M61780( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1M61780( 0) ;
         checkOptimisticConcurrency1M61780( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1M61780( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1M61780( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01M620 */
                  pr_default.execute(18, new Object[] {A396EmprCod, A12985AsiPorID, Short.valueOf(A12987AsiPorLn), Boolean.valueOf(n12988AsiPorMMn), A12988AsiPorMMn, Boolean.valueOf(n12989AsiPorMMx), A12989AsiPorMMx, Boolean.valueOf(n12990AsiPorPMn), Short.valueOf(A12990AsiPorPMn), Boolean.valueOf(n12991AsiPorPMx), Short.valueOf(A12991AsiPorPMx)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPASIPO1");
                  if ( (pr_default.getStatus(18) == 1) )
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
            load1M61780( ) ;
         }
         endLevel1M61780( ) ;
      }
      closeExtendedTableCursors1M61780( ) ;
   }

   public void update1M61780( )
   {
      beforeValidate1M61780( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M61780( ) ;
      }
      if ( ( nIsMod_1780 != 0 ) || ( nIsDirty_1780 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1M61780( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1M61780( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1M61780( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01M621 */
                     pr_default.execute(19, new Object[] {Boolean.valueOf(n12988AsiPorMMn), A12988AsiPorMMn, Boolean.valueOf(n12989AsiPorMMx), A12989AsiPorMMx, Boolean.valueOf(n12990AsiPorPMn), Short.valueOf(A12990AsiPorPMn), Boolean.valueOf(n12991AsiPorPMx), Short.valueOf(A12991AsiPorPMx), A396EmprCod, A12985AsiPorID, Short.valueOf(A12987AsiPorLn)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPASIPO1");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPASIPO1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1M61780( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1M61780( ) ;
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
            endLevel1M61780( ) ;
         }
      }
      closeExtendedTableCursors1M61780( ) ;
   }

   public void deferredUpdate1M61780( )
   {
   }

   public void delete1M61780( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1M61780( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1M61780( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1M61780( ) ;
         afterConfirm1M61780( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1M61780( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01M622 */
               pr_default.execute(20, new Object[] {A396EmprCod, A12985AsiPorID, Short.valueOf(A12987AsiPorLn)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPASIPO1");
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
      sMode1780 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1M61780( ) ;
      Gx_mode = sMode1780 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1M61780( )
   {
      standaloneModal1M61780( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1M61780( )
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

   public void scanStart1M61780( )
   {
      /* Scan By routine */
      /* Using cursor T01M623 */
      pr_default.execute(21, new Object[] {A396EmprCod, A12985AsiPorID});
      RcdFound1780 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1780 = (short)(1) ;
         A12987AsiPorLn = T01M623_A12987AsiPorLn[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1M61780( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound1780 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1780 = (short)(1) ;
         A12987AsiPorLn = T01M623_A12987AsiPorLn[0] ;
      }
   }

   public void scanEnd1M61780( )
   {
      pr_default.close(21);
   }

   public void afterConfirm1M61780( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1M61780( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1M61780( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1M61780( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1M61780( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1M61780( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1M61780( )
   {
      edtAsiPorLn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAsiPorLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAsiPorLn_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtAsiPorMMn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAsiPorMMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAsiPorMMn_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtAsiPorMMx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAsiPorMMx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAsiPorMMx_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtAsiPorPMn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAsiPorPMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAsiPorPMn_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtAsiPorPMx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAsiPorPMx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAsiPorPMx_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void send_integrity_lvl_hashes1M61780( )
   {
   }

   public void send_integrity_lvl_hashes1M61779( )
   {
   }

   public void subsflControlProps_401780( )
   {
      edtavnRcdDeleted_1780_Internalname = "vNRCDDELETED_1780_"+sGXsfl_40_idx ;
      edtAsiPorLn_Internalname = "ASIPORLN_"+sGXsfl_40_idx ;
      edtAsiPorMMn_Internalname = "ASIPORMMN_"+sGXsfl_40_idx ;
      edtAsiPorMMx_Internalname = "ASIPORMMX_"+sGXsfl_40_idx ;
      edtAsiPorPMn_Internalname = "ASIPORPMN_"+sGXsfl_40_idx ;
      edtAsiPorPMx_Internalname = "ASIPORPMX_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_401780( )
   {
      edtavnRcdDeleted_1780_Internalname = "vNRCDDELETED_1780_"+sGXsfl_40_fel_idx ;
      edtAsiPorLn_Internalname = "ASIPORLN_"+sGXsfl_40_fel_idx ;
      edtAsiPorMMn_Internalname = "ASIPORMMN_"+sGXsfl_40_fel_idx ;
      edtAsiPorMMx_Internalname = "ASIPORMMX_"+sGXsfl_40_fel_idx ;
      edtAsiPorPMn_Internalname = "ASIPORPMN_"+sGXsfl_40_fel_idx ;
      edtAsiPorPMx_Internalname = "ASIPORPMX_"+sGXsfl_40_fel_idx ;
   }

   public void addRow1M61780( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401780( ) ;
      sendRow1M61780( ) ;
   }

   public void sendRow1M61780( )
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
         if ( ((int)((nGXsfl_40_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1780_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1780_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1780, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1780_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1780), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1780), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1780_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1780_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1780_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAsiPorLn_Internalname,GXutil.ltrim( localUtil.ntoc( A12987AsiPorLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12987AsiPorLn), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAsiPorLn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAsiPorLn_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1780_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAsiPorMMn_Internalname,GXutil.ltrim( localUtil.ntoc( A12988AsiPorMMn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAsiPorMMn_Enabled!=0) ? localUtil.format( A12988AsiPorMMn, "ZZZZZ9.99") : localUtil.format( A12988AsiPorMMn, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAsiPorMMn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAsiPorMMn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1780_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAsiPorMMx_Internalname,GXutil.ltrim( localUtil.ntoc( A12989AsiPorMMx, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAsiPorMMx_Enabled!=0) ? localUtil.format( A12989AsiPorMMx, "ZZZZZ9.99") : localUtil.format( A12989AsiPorMMx, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,44);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAsiPorMMx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAsiPorMMx_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1780_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAsiPorPMn_Internalname,GXutil.ltrim( localUtil.ntoc( A12990AsiPorPMn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAsiPorPMn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12990AsiPorPMn), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12990AsiPorPMn), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAsiPorPMn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAsiPorPMn_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1780_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAsiPorPMx_Internalname,GXutil.ltrim( localUtil.ntoc( A12991AsiPorPMx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAsiPorPMx_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12991AsiPorPMx), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12991AsiPorPMx), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAsiPorPMx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAsiPorPMx_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1M61780( ) ;
      GXCCtl = "Z12987AsiPorLn_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12987AsiPorLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12988AsiPorMMn_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12988AsiPorMMn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12989AsiPorMMx_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12989AsiPorMMx, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12990AsiPorPMn_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12990AsiPorPMn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12991AsiPorPMx_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12991AsiPorPMx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1780_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1780, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1780_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1780, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1780_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1780, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1780_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1780_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ASIPORLN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAsiPorLn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ASIPORMMN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAsiPorMMn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ASIPORMMX_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAsiPorMMx_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ASIPORPMN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAsiPorPMn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ASIPORPMX_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAsiPorPMx_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1M61780( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401780( ) ;
      edtavnRcdDeleted_1780_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1780_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAsiPorLn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ASIPORLN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAsiPorMMn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ASIPORMMN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAsiPorMMx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ASIPORMMX_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAsiPorPMn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ASIPORPMN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAsiPorPMx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ASIPORPMX_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1780_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1780_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1780");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1780_Internalname ;
         wbErr = true ;
         nRcdDeleted_1780 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1780 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1780_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAsiPorLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAsiPorLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ASIPORLN_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAsiPorLn_Internalname ;
         wbErr = true ;
         A12987AsiPorLn = (short)(0) ;
      }
      else
      {
         A12987AsiPorLn = (short)(localUtil.ctol( httpContext.cgiGet( edtAsiPorLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAsiPorMMn_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAsiPorMMn_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ASIPORMMN_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAsiPorMMn_Internalname ;
         wbErr = true ;
         A12988AsiPorMMn = DecimalUtil.ZERO ;
         n12988AsiPorMMn = false ;
      }
      else
      {
         A12988AsiPorMMn = localUtil.ctond( httpContext.cgiGet( edtAsiPorMMn_Internalname)) ;
         n12988AsiPorMMn = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAsiPorMMx_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAsiPorMMx_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ASIPORMMX_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAsiPorMMx_Internalname ;
         wbErr = true ;
         A12989AsiPorMMx = DecimalUtil.ZERO ;
         n12989AsiPorMMx = false ;
      }
      else
      {
         A12989AsiPorMMx = localUtil.ctond( httpContext.cgiGet( edtAsiPorMMx_Internalname)) ;
         n12989AsiPorMMx = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAsiPorPMn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAsiPorPMn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ASIPORPMN_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAsiPorPMn_Internalname ;
         wbErr = true ;
         A12990AsiPorPMn = (short)(0) ;
         n12990AsiPorPMn = false ;
      }
      else
      {
         A12990AsiPorPMn = (short)(localUtil.ctol( httpContext.cgiGet( edtAsiPorPMn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12990AsiPorPMn = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAsiPorPMx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAsiPorPMx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ASIPORPMX_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAsiPorPMx_Internalname ;
         wbErr = true ;
         A12991AsiPorPMx = (short)(0) ;
         n12991AsiPorPMx = false ;
      }
      else
      {
         A12991AsiPorPMx = (short)(localUtil.ctol( httpContext.cgiGet( edtAsiPorPMx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12991AsiPorPMx = false ;
      }
      GXCCtl = "Z12987AsiPorLn_" + sGXsfl_40_idx ;
      Z12987AsiPorLn = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12988AsiPorMMn_" + sGXsfl_40_idx ;
      Z12988AsiPorMMn = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12989AsiPorMMx_" + sGXsfl_40_idx ;
      Z12989AsiPorMMx = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12990AsiPorPMn_" + sGXsfl_40_idx ;
      Z12990AsiPorPMn = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12991AsiPorPMx_" + sGXsfl_40_idx ;
      Z12991AsiPorPMx = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1780_" + sGXsfl_40_idx ;
      nRcdDeleted_1780 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1780_" + sGXsfl_40_idx ;
      nRcdExists_1780 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1780_" + sGXsfl_40_idx ;
      nIsMod_1780 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAsiPorLn_Enabled = edtAsiPorLn_Enabled ;
   }

   public void confirmValues1M60( )
   {
      nGXsfl_40_idx = 0 ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401780( ) ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401780( ) ;
         httpContext.changePostValue( "Z12987AsiPorLn_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z12987AsiPorLn_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12987AsiPorLn_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z12988AsiPorMMn_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z12988AsiPorMMn_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12988AsiPorMMn_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z12989AsiPorMMx_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z12989AsiPorMMx_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12989AsiPorMMx_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z12990AsiPorPMn_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z12990AsiPorPMn_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12990AsiPorPMn_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z12991AsiPorPMx_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z12991AsiPorPMx_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12991AsiPorPMx_"+sGXsfl_40_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tasipor", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z12985AsiPorID", GXutil.rtrim( Z12985AsiPorID));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12986AsiPorUltL", GXutil.ltrim( localUtil.ntoc( Z12986AsiPorUltL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O12986AsiPorUltL", GXutil.ltrim( localUtil.ntoc( O12986AsiPorUltL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_40", GXutil.ltrim( localUtil.ntoc( nGXsfl_40_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tasipor", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TASIPOR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla Asignacion", "") ;
   }

   public void initializeNonKey1M61779( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A12986AsiPorUltL = (short)(0) ;
      n12986AsiPorUltL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
      O12986AsiPorUltL = A12986AsiPorUltL ;
      n12986AsiPorUltL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
      Z12986AsiPorUltL = (short)(0) ;
   }

   public void initAll1M61779( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A12985AsiPorID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12985AsiPorID", A12985AsiPorID);
      initializeNonKey1M61779( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1M61780( )
   {
      A12988AsiPorMMn = DecimalUtil.ZERO ;
      n12988AsiPorMMn = false ;
      A12989AsiPorMMx = DecimalUtil.ZERO ;
      n12989AsiPorMMx = false ;
      A12990AsiPorPMn = (short)(0) ;
      n12990AsiPorPMn = false ;
      A12991AsiPorPMx = (short)(0) ;
      n12991AsiPorPMx = false ;
      Z12988AsiPorMMn = DecimalUtil.ZERO ;
      Z12989AsiPorMMx = DecimalUtil.ZERO ;
      Z12990AsiPorPMn = (short)(0) ;
      Z12991AsiPorPMx = (short)(0) ;
   }

   public void initAll1M61780( )
   {
      A12987AsiPorLn = (short)(0) ;
      initializeNonKey1M61780( ) ;
   }

   public void standaloneModalInsert1M61780( )
   {
      A12986AsiPorUltL = i12986AsiPorUltL ;
      n12986AsiPorUltL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12986AsiPorUltL), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241593394", true, true);
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
      httpContext.AddJavascriptSource("tasipor.js", "?20268241593394", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1780( )
   {
      edtAsiPorLn_Enabled = defedtAsiPorLn_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAsiPorLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAsiPorLn_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void startgridcontrol40( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1780, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1780_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12987AsiPorLn, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAsiPorLn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12988AsiPorMMn, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAsiPorMMn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12989AsiPorMMx, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAsiPorMMx_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12990AsiPorPMn, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAsiPorPMn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12991AsiPorPMx, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAsiPorPMx_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      cmbAsiPorID.setInternalname( "ASIPORID" );
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtAsiPorUltL_Internalname = "ASIPORULTL" ;
      edtavnRcdDeleted_1780_Internalname = "vNRCDDELETED_1780" ;
      edtAsiPorLn_Internalname = "ASIPORLN" ;
      edtAsiPorMMn_Internalname = "ASIPORMMN" ;
      edtAsiPorMMx_Internalname = "ASIPORMMX" ;
      edtAsiPorPMn_Internalname = "ASIPORPMN" ;
      edtAsiPorPMx_Internalname = "ASIPORPMX" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla Asignacion", "") );
      edtAsiPorPMx_Jsonclick = "" ;
      edtAsiPorPMn_Jsonclick = "" ;
      edtAsiPorMMx_Jsonclick = "" ;
      edtAsiPorMMn_Jsonclick = "" ;
      edtAsiPorLn_Jsonclick = "" ;
      edtavnRcdDeleted_1780_Jsonclick = "" ;
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
      edtAsiPorPMx_Enabled = 1 ;
      edtAsiPorPMn_Enabled = 1 ;
      edtAsiPorMMx_Enabled = 1 ;
      edtAsiPorMMn_Enabled = 1 ;
      edtAsiPorLn_Enabled = 1 ;
      edtavnRcdDeleted_1780_Enabled = 1 ;
      edtAsiPorUltL_Jsonclick = "" ;
      edtAsiPorUltL_Backcolor = (int)(0xFFFFFF) ;
      edtAsiPorUltL_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      cmbAsiPorID.setJsonclick( "" );
      cmbAsiPorID.setEnabled( 1 );
      cmbAsiPorID.setIBackground( (int)(0xFFFFFF) );
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_401780( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1M61780( ) ;
         standaloneModal1M61780( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1M61780( ) ;
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401780( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      cmbAsiPorID.setName( "ASIPORID" );
      cmbAsiPorID.setWebtags( "" );
      cmbAsiPorID.addItem("P", httpContext.getMessage( "Plano", ""), (short)(0));
      cmbAsiPorID.addItem("C", httpContext.getMessage( "Circulares", ""), (short)(0));
      cmbAsiPorID.addItem("T", httpContext.getMessage( "Tricot", ""), (short)(0));
      if ( cmbAsiPorID.getItemCount() > 0 )
      {
         A12985AsiPorID = cmbAsiPorID.getValidValue(A12985AsiPorID) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12985AsiPorID", A12985AsiPorID);
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01M615 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01M615_A407EmprNom[0] ;
      n407EmprNom = T01M615_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(13);
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T01M615 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01M615_A407EmprNom[0] ;
      n407EmprNom = T01M615_n407EmprNom[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      if ( cmbAsiPorID.getItemCount() > 0 )
      {
         A12985AsiPorID = cmbAsiPorID.getValidValue(A12985AsiPorID) ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAsiPorID.setValue( GXutil.rtrim( A12985AsiPorID) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Asiporid( )
   {
      n12986AsiPorUltL = false ;
      A12985AsiPorID = cmbAsiPorID.getValue() ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      if ( cmbAsiPorID.getItemCount() > 0 )
      {
         A12985AsiPorID = cmbAsiPorID.getValidValue(A12985AsiPorID) ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAsiPorID.setValue( GXutil.rtrim( A12985AsiPorID) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12986AsiPorUltL", GXutil.ltrim( localUtil.ntoc( A12986AsiPorUltL, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12985AsiPorID", GXutil.rtrim( Z12985AsiPorID));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12986AsiPorUltL", GXutil.ltrim( localUtil.ntoc( Z12986AsiPorUltL, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "O12986AsiPorUltL", GXutil.ltrim( localUtil.ntoc( O12986AsiPorUltL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("VALID_ASIPORID","{handler:'valid_Asiporid',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A12986AsiPorUltL',fld:'ASIPORULTL',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'cmbAsiPorID'},{av:'A12985AsiPorID',fld:'ASIPORID',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ASIPORID",",oparms:[{av:'A12986AsiPorUltL',fld:'ASIPORULTL',pic:'ZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z12985AsiPorID'},{av:'Z12986AsiPorUltL'},{av:'Z407EmprNom'},{av:'O12986AsiPorUltL'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_ASIPORULTL","{handler:'valid_Asiporultl',iparms:[]");
      setEventMetadata("VALID_ASIPORULTL",",oparms:[]}");
      setEventMetadata("VALID_ASIPORLN","{handler:'valid_Asiporln',iparms:[]");
      setEventMetadata("VALID_ASIPORLN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Asiporpmx',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
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
      Z12985AsiPorID = "" ;
      Z12988AsiPorMMn = DecimalUtil.ZERO ;
      Z12989AsiPorMMx = DecimalUtil.ZERO ;
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
      A12985AsiPorID = "" ;
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
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1780 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1779 = "" ;
      GXCCtl = "" ;
      A12988AsiPorMMn = DecimalUtil.ZERO ;
      A12989AsiPorMMx = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      T01M67_A12985AsiPorID = new String[] {""} ;
      T01M67_A407EmprNom = new String[] {""} ;
      T01M67_n407EmprNom = new boolean[] {false} ;
      T01M67_A12986AsiPorUltL = new short[1] ;
      T01M67_n12986AsiPorUltL = new boolean[] {false} ;
      T01M67_A396EmprCod = new String[] {""} ;
      T01M66_A407EmprNom = new String[] {""} ;
      T01M66_n407EmprNom = new boolean[] {false} ;
      T01M68_A407EmprNom = new String[] {""} ;
      T01M68_n407EmprNom = new boolean[] {false} ;
      T01M69_A396EmprCod = new String[] {""} ;
      T01M69_A12985AsiPorID = new String[] {""} ;
      T01M65_A12985AsiPorID = new String[] {""} ;
      T01M65_A12986AsiPorUltL = new short[1] ;
      T01M65_n12986AsiPorUltL = new boolean[] {false} ;
      T01M65_A396EmprCod = new String[] {""} ;
      T01M610_A396EmprCod = new String[] {""} ;
      T01M610_A12985AsiPorID = new String[] {""} ;
      T01M611_A396EmprCod = new String[] {""} ;
      T01M611_A12985AsiPorID = new String[] {""} ;
      T01M64_A12985AsiPorID = new String[] {""} ;
      T01M64_A12986AsiPorUltL = new short[1] ;
      T01M64_n12986AsiPorUltL = new boolean[] {false} ;
      T01M64_A396EmprCod = new String[] {""} ;
      T01M615_A407EmprNom = new String[] {""} ;
      T01M615_n407EmprNom = new boolean[] {false} ;
      T01M617_A396EmprCod = new String[] {""} ;
      T01M617_A12985AsiPorID = new String[] {""} ;
      T01M618_A396EmprCod = new String[] {""} ;
      T01M618_A12985AsiPorID = new String[] {""} ;
      T01M618_A12987AsiPorLn = new short[1] ;
      T01M618_A12988AsiPorMMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M618_n12988AsiPorMMn = new boolean[] {false} ;
      T01M618_A12989AsiPorMMx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M618_n12989AsiPorMMx = new boolean[] {false} ;
      T01M618_A12990AsiPorPMn = new short[1] ;
      T01M618_n12990AsiPorPMn = new boolean[] {false} ;
      T01M618_A12991AsiPorPMx = new short[1] ;
      T01M618_n12991AsiPorPMx = new boolean[] {false} ;
      T01M619_A396EmprCod = new String[] {""} ;
      T01M619_A12985AsiPorID = new String[] {""} ;
      T01M619_A12987AsiPorLn = new short[1] ;
      T01M63_A396EmprCod = new String[] {""} ;
      T01M63_A12985AsiPorID = new String[] {""} ;
      T01M63_A12987AsiPorLn = new short[1] ;
      T01M63_A12988AsiPorMMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M63_n12988AsiPorMMn = new boolean[] {false} ;
      T01M63_A12989AsiPorMMx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M63_n12989AsiPorMMx = new boolean[] {false} ;
      T01M63_A12990AsiPorPMn = new short[1] ;
      T01M63_n12990AsiPorPMn = new boolean[] {false} ;
      T01M63_A12991AsiPorPMx = new short[1] ;
      T01M63_n12991AsiPorPMx = new boolean[] {false} ;
      T01M62_A396EmprCod = new String[] {""} ;
      T01M62_A12985AsiPorID = new String[] {""} ;
      T01M62_A12987AsiPorLn = new short[1] ;
      T01M62_A12988AsiPorMMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M62_n12988AsiPorMMn = new boolean[] {false} ;
      T01M62_A12989AsiPorMMx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M62_n12989AsiPorMMx = new boolean[] {false} ;
      T01M62_A12990AsiPorPMn = new short[1] ;
      T01M62_n12990AsiPorPMn = new boolean[] {false} ;
      T01M62_A12991AsiPorPMx = new short[1] ;
      T01M62_n12991AsiPorPMx = new boolean[] {false} ;
      T01M623_A396EmprCod = new String[] {""} ;
      T01M623_A12985AsiPorID = new String[] {""} ;
      T01M623_A12987AsiPorLn = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ12985AsiPorID = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tasipor__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tasipor__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tasipor__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tasipor__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tasipor__default(),
         new Object[] {
             new Object[] {
            T01M62_A396EmprCod, T01M62_A12985AsiPorID, T01M62_A12987AsiPorLn, T01M62_A12988AsiPorMMn, T01M62_n12988AsiPorMMn, T01M62_A12989AsiPorMMx, T01M62_n12989AsiPorMMx, T01M62_A12990AsiPorPMn, T01M62_n12990AsiPorPMn, T01M62_A12991AsiPorPMx,
            T01M62_n12991AsiPorPMx
            }
            , new Object[] {
            T01M63_A396EmprCod, T01M63_A12985AsiPorID, T01M63_A12987AsiPorLn, T01M63_A12988AsiPorMMn, T01M63_n12988AsiPorMMn, T01M63_A12989AsiPorMMx, T01M63_n12989AsiPorMMx, T01M63_A12990AsiPorPMn, T01M63_n12990AsiPorPMn, T01M63_A12991AsiPorPMx,
            T01M63_n12991AsiPorPMx
            }
            , new Object[] {
            T01M64_A12985AsiPorID, T01M64_A12986AsiPorUltL, T01M64_n12986AsiPorUltL, T01M64_A396EmprCod
            }
            , new Object[] {
            T01M65_A12985AsiPorID, T01M65_A12986AsiPorUltL, T01M65_n12986AsiPorUltL, T01M65_A396EmprCod
            }
            , new Object[] {
            T01M66_A407EmprNom, T01M66_n407EmprNom
            }
            , new Object[] {
            T01M67_A12985AsiPorID, T01M67_A407EmprNom, T01M67_n407EmprNom, T01M67_A12986AsiPorUltL, T01M67_n12986AsiPorUltL, T01M67_A396EmprCod
            }
            , new Object[] {
            T01M68_A407EmprNom, T01M68_n407EmprNom
            }
            , new Object[] {
            T01M69_A396EmprCod, T01M69_A12985AsiPorID
            }
            , new Object[] {
            T01M610_A396EmprCod, T01M610_A12985AsiPorID
            }
            , new Object[] {
            T01M611_A396EmprCod, T01M611_A12985AsiPorID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01M615_A407EmprNom, T01M615_n407EmprNom
            }
            , new Object[] {
            }
            , new Object[] {
            T01M617_A396EmprCod, T01M617_A12985AsiPorID
            }
            , new Object[] {
            T01M618_A396EmprCod, T01M618_A12985AsiPorID, T01M618_A12987AsiPorLn, T01M618_A12988AsiPorMMn, T01M618_n12988AsiPorMMn, T01M618_A12989AsiPorMMx, T01M618_n12989AsiPorMMx, T01M618_A12990AsiPorPMn, T01M618_n12990AsiPorPMn, T01M618_A12991AsiPorPMx,
            T01M618_n12991AsiPorPMx
            }
            , new Object[] {
            T01M619_A396EmprCod, T01M619_A12985AsiPorID, T01M619_A12987AsiPorLn
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01M623_A396EmprCod, T01M623_A12985AsiPorID, T01M623_A12987AsiPorLn
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z12986AsiPorUltL ;
   private short O12986AsiPorUltL ;
   private short Z12987AsiPorLn ;
   private short Z12990AsiPorPMn ;
   private short Z12991AsiPorPMx ;
   private short nRcdDeleted_1780 ;
   private short nRcdExists_1780 ;
   private short nIsMod_1780 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A12986AsiPorUltL ;
   private short nBlankRcdCount1780 ;
   private short RcdFound1780 ;
   private short B12986AsiPorUltL ;
   private short nBlankRcdUsr1780 ;
   private short s12986AsiPorUltL ;
   private short A12987AsiPorLn ;
   private short A12990AsiPorPMn ;
   private short A12991AsiPorPMx ;
   private short RcdFound1779 ;
   private short nIsDirty_1779 ;
   private short nIsDirty_1780 ;
   private short i12986AsiPorUltL ;
   private short ZZ12986AsiPorUltL ;
   private short ZO12986AsiPorUltL ;
   private int nRC_GXsfl_40 ;
   private int nGXsfl_40_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtAsiPorUltL_Enabled ;
   private int edtavnRcdDeleted_1780_Enabled ;
   private int edtAsiPorLn_Enabled ;
   private int edtAsiPorMMn_Enabled ;
   private int edtAsiPorMMx_Enabled ;
   private int edtAsiPorPMn_Enabled ;
   private int edtAsiPorPMx_Enabled ;
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
   private int defedtAsiPorLn_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtAsiPorUltL_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z12988AsiPorMMn ;
   private java.math.BigDecimal Z12989AsiPorMMx ;
   private java.math.BigDecimal A12988AsiPorMMn ;
   private java.math.BigDecimal A12989AsiPorMMx ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z12985AsiPorID ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_40_idx="0001" ;
   private String Gx_mode ;
   private String A12985AsiPorID ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtAsiPorUltL_Internalname ;
   private String edtAsiPorUltL_Jsonclick ;
   private String sMode1780 ;
   private String edtavnRcdDeleted_1780_Internalname ;
   private String edtAsiPorLn_Internalname ;
   private String edtAsiPorMMn_Internalname ;
   private String edtAsiPorMMx_Internalname ;
   private String edtAsiPorPMn_Internalname ;
   private String edtAsiPorPMx_Internalname ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1779 ;
   private String GXCCtl ;
   private String Z407EmprNom ;
   private String sGXsfl_40_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1780_Jsonclick ;
   private String edtAsiPorLn_Jsonclick ;
   private String edtAsiPorMMn_Jsonclick ;
   private String edtAsiPorMMx_Jsonclick ;
   private String edtAsiPorPMn_Jsonclick ;
   private String edtAsiPorPMx_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ12985AsiPorID ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n12986AsiPorUltL ;
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n12988AsiPorMMn ;
   private boolean n12989AsiPorMMx ;
   private boolean n12990AsiPorPMn ;
   private boolean n12991AsiPorPMx ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private HTMLChoice cmbAsiPorID ;
   private IDataStoreProvider pr_default ;
   private String[] T01M67_A12985AsiPorID ;
   private String[] T01M67_A407EmprNom ;
   private boolean[] T01M67_n407EmprNom ;
   private short[] T01M67_A12986AsiPorUltL ;
   private boolean[] T01M67_n12986AsiPorUltL ;
   private String[] T01M67_A396EmprCod ;
   private String[] T01M66_A407EmprNom ;
   private boolean[] T01M66_n407EmprNom ;
   private String[] T01M68_A407EmprNom ;
   private boolean[] T01M68_n407EmprNom ;
   private String[] T01M69_A396EmprCod ;
   private String[] T01M69_A12985AsiPorID ;
   private String[] T01M65_A12985AsiPorID ;
   private short[] T01M65_A12986AsiPorUltL ;
   private boolean[] T01M65_n12986AsiPorUltL ;
   private String[] T01M65_A396EmprCod ;
   private String[] T01M610_A396EmprCod ;
   private String[] T01M610_A12985AsiPorID ;
   private String[] T01M611_A396EmprCod ;
   private String[] T01M611_A12985AsiPorID ;
   private String[] T01M64_A12985AsiPorID ;
   private short[] T01M64_A12986AsiPorUltL ;
   private boolean[] T01M64_n12986AsiPorUltL ;
   private String[] T01M64_A396EmprCod ;
   private String[] T01M615_A407EmprNom ;
   private boolean[] T01M615_n407EmprNom ;
   private String[] T01M617_A396EmprCod ;
   private String[] T01M617_A12985AsiPorID ;
   private String[] T01M618_A396EmprCod ;
   private String[] T01M618_A12985AsiPorID ;
   private short[] T01M618_A12987AsiPorLn ;
   private java.math.BigDecimal[] T01M618_A12988AsiPorMMn ;
   private boolean[] T01M618_n12988AsiPorMMn ;
   private java.math.BigDecimal[] T01M618_A12989AsiPorMMx ;
   private boolean[] T01M618_n12989AsiPorMMx ;
   private short[] T01M618_A12990AsiPorPMn ;
   private boolean[] T01M618_n12990AsiPorPMn ;
   private short[] T01M618_A12991AsiPorPMx ;
   private boolean[] T01M618_n12991AsiPorPMx ;
   private String[] T01M619_A396EmprCod ;
   private String[] T01M619_A12985AsiPorID ;
   private short[] T01M619_A12987AsiPorLn ;
   private String[] T01M63_A396EmprCod ;
   private String[] T01M63_A12985AsiPorID ;
   private short[] T01M63_A12987AsiPorLn ;
   private java.math.BigDecimal[] T01M63_A12988AsiPorMMn ;
   private boolean[] T01M63_n12988AsiPorMMn ;
   private java.math.BigDecimal[] T01M63_A12989AsiPorMMx ;
   private boolean[] T01M63_n12989AsiPorMMx ;
   private short[] T01M63_A12990AsiPorPMn ;
   private boolean[] T01M63_n12990AsiPorPMn ;
   private short[] T01M63_A12991AsiPorPMx ;
   private boolean[] T01M63_n12991AsiPorPMx ;
   private String[] T01M62_A396EmprCod ;
   private String[] T01M62_A12985AsiPorID ;
   private short[] T01M62_A12987AsiPorLn ;
   private java.math.BigDecimal[] T01M62_A12988AsiPorMMn ;
   private boolean[] T01M62_n12988AsiPorMMn ;
   private java.math.BigDecimal[] T01M62_A12989AsiPorMMx ;
   private boolean[] T01M62_n12989AsiPorMMx ;
   private short[] T01M62_A12990AsiPorPMn ;
   private boolean[] T01M62_n12990AsiPorPMn ;
   private short[] T01M62_A12991AsiPorPMx ;
   private boolean[] T01M62_n12991AsiPorPMx ;
   private String[] T01M623_A396EmprCod ;
   private String[] T01M623_A12985AsiPorID ;
   private short[] T01M623_A12987AsiPorLn ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tasipor__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tasipor__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tasipor__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tasipor__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tasipor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01M62", "SELECT EmprCod, AsiPorID, AsiPorLn, AsiPorMMn, AsiPorMMx, AsiPorPMn, AsiPorPMx FROM TXPASIPO1 WHERE EmprCod = ? AND AsiPorID = ? AND AsiPorLn = ?  FOR UPDATE OF AsiPorMMn, AsiPorMMx, AsiPorPMn, AsiPorPMx NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M63", "SELECT EmprCod, AsiPorID, AsiPorLn, AsiPorMMn, AsiPorMMx, AsiPorPMn, AsiPorPMx FROM TXPASIPO1 WHERE EmprCod = ? AND AsiPorID = ? AND AsiPorLn = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M64", "SELECT AsiPorID, AsiPorUltL, EmprCod FROM TXPASIPOR WHERE EmprCod = ? AND AsiPorID = ?  FOR UPDATE OF AsiPorUltL NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M65", "SELECT AsiPorID, AsiPorUltL, EmprCod FROM TXPASIPOR WHERE EmprCod = ? AND AsiPorID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M66", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M67", "SELECT /*+ FIRST_ROWS(100) */ TM1.AsiPorID, T2.EmprNom, TM1.AsiPorUltL, TM1.EmprCod FROM (TXPASIPOR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.AsiPorID = ? ORDER BY TM1.EmprCod, TM1.AsiPorID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M68", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M69", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AsiPorID FROM TXPASIPOR WHERE EmprCod = ? AND AsiPorID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M610", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AsiPorID FROM TXPASIPOR WHERE ( EmprCod > ? or EmprCod = ? and AsiPorID > ?) ORDER BY EmprCod, AsiPorID) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M611", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AsiPorID FROM TXPASIPOR WHERE ( EmprCod < ? or EmprCod = ? and AsiPorID < ?) ORDER BY EmprCod DESC, AsiPorID DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01M612", "INSERT INTO TXPASIPOR(AsiPorID, AsiPorUltL, EmprCod) VALUES(?, ?, ?)", GX_NOMASK, "TXPASIPOR")
         ,new UpdateCursor("T01M613", "UPDATE TXPASIPOR SET AsiPorUltL=?  WHERE EmprCod = ? AND AsiPorID = ?", GX_NOMASK, "TXPASIPOR")
         ,new UpdateCursor("T01M614", "DELETE FROM TXPASIPOR  WHERE EmprCod = ? AND AsiPorID = ?", GX_NOMASK, "TXPASIPOR")
         ,new ForEachCursor("T01M615", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01M616", "UPDATE TXPASIPOR SET AsiPorUltL=?  WHERE EmprCod = ? AND AsiPorID = ?", GX_NOMASK, "TXPASIPOR")
         ,new ForEachCursor("T01M617", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AsiPorID FROM TXPASIPOR ORDER BY EmprCod, AsiPorID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M618", "SELECT EmprCod, AsiPorID, AsiPorLn, AsiPorMMn, AsiPorMMx, AsiPorPMn, AsiPorPMx FROM TXPASIPO1 WHERE EmprCod = ? and AsiPorID = ? and AsiPorLn = ? ORDER BY EmprCod, AsiPorID, AsiPorLn ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M619", "SELECT EmprCod, AsiPorID, AsiPorLn FROM TXPASIPO1 WHERE EmprCod = ? AND AsiPorID = ? AND AsiPorLn = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01M620", "INSERT INTO TXPASIPO1(EmprCod, AsiPorID, AsiPorLn, AsiPorMMn, AsiPorMMx, AsiPorPMn, AsiPorPMx) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPASIPO1")
         ,new UpdateCursor("T01M621", "UPDATE TXPASIPO1 SET AsiPorMMn=?, AsiPorMMx=?, AsiPorPMn=?, AsiPorPMx=?  WHERE EmprCod = ? AND AsiPorID = ? AND AsiPorLn = ?", GX_NOMASK, "TXPASIPO1")
         ,new UpdateCursor("T01M622", "DELETE FROM TXPASIPO1  WHERE EmprCod = ? AND AsiPorID = ? AND AsiPorLn = ?", GX_NOMASK, "TXPASIPO1")
         ,new ForEachCursor("T01M623", "SELECT EmprCod, AsiPorID, AsiPorLn FROM TXPASIPO1 WHERE EmprCod = ? and AsiPorID = ? ORDER BY EmprCod, AsiPorID, AsiPorLn ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setString(2, (String)parms[1], 2);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 2);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 2);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 2);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 2);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 2);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[10]).shortValue());
               }
               return;
            case 19 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setString(6, (String)parms[9], 2);
               stmt.setShort(7, ((Number) parms[10]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               return;
      }
   }

}

