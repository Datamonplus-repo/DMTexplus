package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmprec_impl extends GXDataArea
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
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MPRec", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBarCod_Internalname ;
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
      nRC_GXsfl_45 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_45"))) ;
      nGXsfl_45_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_45_idx"))) ;
      sGXsfl_45_idx = httpContext.GetPar( "sGXsfl_45_idx") ;
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

   public tmprec_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmprec_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmprec_impl.class ));
   }

   public tmprec_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkMPRecEr = UIFactory.getCheckbox(this);
      cmbMPRecEst = new HTMLChoice();
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMPRec.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMPRec.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMPRec.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMPRec.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TMPRec.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMPRec.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMPRec.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMPRec.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMPRec.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMPRec.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMPRec.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMPRec.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMPRec.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Orden", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMPRec.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEnvOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A14152MEnvOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMEnvOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14152MEnvOrd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14152MEnvOrd), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEnvOrd_Jsonclick, 0, "", "", "", "", "", 1, edtMEnvOrd_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMPRec.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMPRec.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol45( ) ;
      nGXsfl_45_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1895 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1895 = (short)(1) ;
            scanStart1UF1895( ) ;
            while ( RcdFound1895 != 0 )
            {
               init_level_properties1895( ) ;
               getByPrimaryKey1UF1895( ) ;
               addRow1UF1895( ) ;
               scanNext1UF1895( ) ;
            }
            scanEnd1UF1895( ) ;
            nBlankRcdCount1895 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1UF1895( ) ;
         standaloneModal1UF1895( ) ;
         sMode1895 = Gx_mode ;
         while ( nGXsfl_45_idx < nRC_GXsfl_45 )
         {
            bGXsfl_45_Refreshing = true ;
            readRow1UF1895( ) ;
            edtavnRcdDeleted_1895_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1895_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1895_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1895_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtMRecLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRECLIN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMRecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRecLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtMPRecPLC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECPLC_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMPRecPLC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecPLC_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtMPRecVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECVAL_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMPRecVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecVal_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtMPRecFec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECFEC_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMPRecFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecFec_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            chkMPRecEr.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "MPRECER_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkMPRecEr.getInternalname(), "Enabled", GXutil.ltrimstr( chkMPRecEr.getEnabled(), 5, 0), !bGXsfl_45_Refreshing);
            edtMPRecFecEv_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECFECEV_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMPRecFecEv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecFecEv_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            cmbMPRecEst.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "MPRECEST_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbMPRecEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMPRecEst.getEnabled(), 5, 0), !bGXsfl_45_Refreshing);
            edtMPRecInt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECINT_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMPRecInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecInt_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            if ( ( nRcdExists_1895 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1UF1895( ) ;
            }
            sendRow1UF1895( ) ;
            bGXsfl_45_Refreshing = false ;
         }
         Gx_mode = sMode1895 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1895 = (short)(5) ;
         nRcdExists_1895 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1UF1895( ) ;
            while ( RcdFound1895 != 0 )
            {
               sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_451895( ) ;
               init_level_properties1895( ) ;
               standaloneNotModal1UF1895( ) ;
               getByPrimaryKey1UF1895( ) ;
               standaloneModal1UF1895( ) ;
               addRow1UF1895( ) ;
               scanNext1UF1895( ) ;
            }
            scanEnd1UF1895( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1895 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_451895( ) ;
      initAll1UF1895( ) ;
      init_level_properties1895( ) ;
      nRcdExists_1895 = (short)(0) ;
      nIsMod_1895 = (short)(0) ;
      nRcdDeleted_1895 = (short)(0) ;
      nBlankRcdCount1895 = (short)(nBlankRcdUsr1895+nBlankRcdCount1895) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1895 > 0 )
      {
         standaloneNotModal1UF1895( ) ;
         standaloneModal1UF1895( ) ;
         addRow1UF1895( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMRecLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1895 = (short)(nBlankRcdCount1895-1) ;
      }
      Gx_mode = sMode1895 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMPRec.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMPRec.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMPRec.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMPRec.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TMPRec.htm");
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
      e111UF2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z14152MEnvOrd = (short)(localUtil.ctol( httpContext.cgiGet( "Z14152MEnvOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A129BarCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            }
            else
            {
               A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCODREO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCodReo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A132BarCodReo = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            else
            {
               A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMEnvOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMEnvOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MENVORD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMEnvOrd_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14152MEnvOrd = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
            }
            else
            {
               A14152MEnvOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtMEnvOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
            }
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
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A14152MEnvOrd = (short)(GXutil.lval( httpContext.GetPar( "MEnvOrd"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
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
                        e111UF2 ();
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
            initAll1UF1893( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1895_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1895_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      disableAttributes1UF1893( ) ;
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

   public void confirm_1UF0( )
   {
      beforeValidate1UF1893( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1UF1893( ) ;
         }
         else
         {
            checkExtendedTable1UF1893( ) ;
            if ( AnyError == 0 )
            {
               zm1UF1893( 4) ;
            }
            closeExtendedTableCursors1UF1893( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1893 = Gx_mode ;
         confirm_1UF1895( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1893 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1893 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1UF0( ) ;
      }
   }

   public void confirm_1UF1895( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1UF1895( ) ;
         if ( ( nRcdExists_1895 != 0 ) || ( nIsMod_1895 != 0 ) )
         {
            getKey1UF1895( ) ;
            if ( ( nRcdExists_1895 == 0 ) && ( nRcdDeleted_1895 == 0 ) )
            {
               if ( RcdFound1895 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1UF1895( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1UF1895( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1UF1895( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "MRECLIN_" + sGXsfl_45_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMRecLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1895 != 0 )
               {
                  if ( nRcdDeleted_1895 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1UF1895( ) ;
                     load1UF1895( ) ;
                     beforeValidate1UF1895( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1UF1895( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1895 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1UF1895( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1UF1895( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1UF1895( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1895 == 0 )
                  {
                     GXCCtl = "MRECLIN_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMRecLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1895_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1895, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMRecLin_Internalname, GXutil.ltrim( localUtil.ntoc( A14153MRecLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMPRecPLC_Internalname, A14166MPRecPLC) ;
         httpContext.changePostValue( edtMPRecVal_Internalname, GXutil.rtrim( A14165MPRecVal)) ;
         httpContext.changePostValue( edtMPRecFec_Internalname, localUtil.ttoc( A14167MPRecFec, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( chkMPRecEr.getInternalname(), GXutil.booltostr( A14168MPRecEr)) ;
         httpContext.changePostValue( edtMPRecFecEv_Internalname, localUtil.ttoc( A14169MPRecFecEv, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( cmbMPRecEst.getInternalname(), GXutil.ltrim( localUtil.ntoc( A14170MPRecEst, (byte)(1), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtMPRecInt_Internalname, GXutil.ltrim( localUtil.ntoc( A14171MPRecInt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14153MRecLin_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z14153MRecLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14166MPRecPLC_"+sGXsfl_45_idx, Z14166MPRecPLC) ;
         httpContext.changePostValue( "ZT_"+"Z14165MPRecVal_"+sGXsfl_45_idx, GXutil.rtrim( Z14165MPRecVal)) ;
         httpContext.changePostValue( "ZT_"+"Z14167MPRecFec_"+sGXsfl_45_idx, localUtil.ttoc( Z14167MPRecFec, 10, 12, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z14168MPRecEr_"+sGXsfl_45_idx, GXutil.booltostr( Z14168MPRecEr)) ;
         httpContext.changePostValue( "ZT_"+"Z14169MPRecFecEv_"+sGXsfl_45_idx, localUtil.ttoc( Z14169MPRecFecEv, 10, 12, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "nRcdDeleted_1895_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1895, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1895_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1895, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1895_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1895, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1895 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1895_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1895_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRECLIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRecLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECPLC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecPLC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECVAL_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECFEC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecFec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECER_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkMPRecEr.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECFECEV_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecFecEv_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECEST_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbMPRecEst.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECINT_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecInt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1UF0( )
   {
   }

   public void e111UF2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tmprec_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tmprec_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tmprec_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmprec_impl.this.A396EmprCod = GXv_char2[0] ;
      tmprec_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmprec_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1UF1893( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -3 )
      {
         Z14152MEnvOrd = A14152MEnvOrd ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TMPRec" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
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

   public void load1UF1893( )
   {
      /* Using cursor T01UF7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1893 = (short)(1) ;
         zm1UF1893( -3) ;
      }
      pr_default.close(5);
      onLoadActions1UF1893( ) ;
   }

   public void onLoadActions1UF1893( )
   {
   }

   public void checkExtendedTable1UF1893( )
   {
      nIsDirty_1893 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01UF6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(4);
   }

   public void closeExtendedTableCursors1UF1893( )
   {
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_4( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01UF8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
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

   public void getKey1UF1893( )
   {
      /* Using cursor T01UF9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1893 = (short)(1) ;
      }
      else
      {
         RcdFound1893 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01UF5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01UF5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1UF1893( 3) ;
         RcdFound1893 = (short)(1) ;
         A14152MEnvOrd = T01UF5_A14152MEnvOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
         A129BarCod = T01UF5_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01UF5_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01UF5_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z14152MEnvOrd = A14152MEnvOrd ;
         sMode1893 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1UF1893( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1893 = (short)(0) ;
            initializeNonKey1UF1893( ) ;
         }
         Gx_mode = sMode1893 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1893 = (short)(0) ;
         initializeNonKey1UF1893( ) ;
         sMode1893 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1893 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1UF1893( ) ;
      if ( RcdFound1893 == 0 )
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
      RcdFound1893 = (short)(0) ;
      /* Using cursor T01UF10 */
      pr_default.execute(8, new Object[] {Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Short.valueOf(A14152MEnvOrd), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T01UF10_A129BarCod[0] < A129BarCod ) || ( T01UF10_A129BarCod[0] == A129BarCod ) && ( T01UF10_A132BarCodReo[0] < A132BarCodReo ) || ( T01UF10_A132BarCodReo[0] == A132BarCodReo ) && ( T01UF10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01UF10_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01UF10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01UF10_A132BarCodReo[0] == A132BarCodReo ) && ( T01UF10_A129BarCod[0] == A129BarCod ) && ( T01UF10_A14152MEnvOrd[0] < A14152MEnvOrd ) ) && ( GXutil.strcmp(T01UF10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T01UF10_A129BarCod[0] > A129BarCod ) || ( T01UF10_A129BarCod[0] == A129BarCod ) && ( T01UF10_A132BarCodReo[0] > A132BarCodReo ) || ( T01UF10_A132BarCodReo[0] == A132BarCodReo ) && ( T01UF10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01UF10_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01UF10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01UF10_A132BarCodReo[0] == A132BarCodReo ) && ( T01UF10_A129BarCod[0] == A129BarCod ) && ( T01UF10_A14152MEnvOrd[0] > A14152MEnvOrd ) ) && ( GXutil.strcmp(T01UF10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A129BarCod = T01UF10_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01UF10_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01UF10_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A14152MEnvOrd = T01UF10_A14152MEnvOrd[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
            RcdFound1893 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1893 = (short)(0) ;
      /* Using cursor T01UF11 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Short.valueOf(A14152MEnvOrd), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T01UF11_A129BarCod[0] > A129BarCod ) || ( T01UF11_A129BarCod[0] == A129BarCod ) && ( T01UF11_A132BarCodReo[0] > A132BarCodReo ) || ( T01UF11_A132BarCodReo[0] == A132BarCodReo ) && ( T01UF11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01UF11_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01UF11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01UF11_A132BarCodReo[0] == A132BarCodReo ) && ( T01UF11_A129BarCod[0] == A129BarCod ) && ( T01UF11_A14152MEnvOrd[0] > A14152MEnvOrd ) ) && ( GXutil.strcmp(T01UF11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T01UF11_A129BarCod[0] < A129BarCod ) || ( T01UF11_A129BarCod[0] == A129BarCod ) && ( T01UF11_A132BarCodReo[0] < A132BarCodReo ) || ( T01UF11_A132BarCodReo[0] == A132BarCodReo ) && ( T01UF11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01UF11_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01UF11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01UF11_A132BarCodReo[0] == A132BarCodReo ) && ( T01UF11_A129BarCod[0] == A129BarCod ) && ( T01UF11_A14152MEnvOrd[0] < A14152MEnvOrd ) ) && ( GXutil.strcmp(T01UF11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A129BarCod = T01UF11_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01UF11_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01UF11_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A14152MEnvOrd = T01UF11_A14152MEnvOrd[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
            RcdFound1893 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1UF1893( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1UF1893( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1893 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A14152MEnvOrd != Z14152MEnvOrd ) )
            {
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A14152MEnvOrd = Z14152MEnvOrd ;
               httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1UF1893( ) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A14152MEnvOrd != Z14152MEnvOrd ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1UF1893( ) ;
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
                  GX_FocusControl = edtBarCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1UF1893( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A14152MEnvOrd != Z14152MEnvOrd ) )
      {
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A14152MEnvOrd = Z14152MEnvOrd ;
         httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBarCod_Internalname ;
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
      getKey1UF1893( ) ;
      if ( RcdFound1893 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A14152MEnvOrd != Z14152MEnvOrd ) )
         {
            A129BarCod = Z129BarCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = Z132BarCodReo ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = Z130BarCodPar ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A14152MEnvOrd = Z14152MEnvOrd ;
            httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A14152MEnvOrd != Z14152MEnvOrd ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tmprec");
   }

   public void insert_check( )
   {
      confirm_1UF0( ) ;
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
      if ( RcdFound1893 == 0 )
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
      scanStart1UF1893( ) ;
      if ( RcdFound1893 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1UF1893( ) ;
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
      if ( RcdFound1893 == 0 )
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
      if ( RcdFound1893 == 0 )
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
      scanStart1UF1893( ) ;
      if ( RcdFound1893 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1893 != 0 )
         {
            scanNext1UF1893( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1UF1893( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1UF1893( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UF4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMEnv"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMEnv"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UF1893( )
   {
      beforeValidate1UF1893( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UF1893( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UF1893( 0) ;
         checkOptimisticConcurrency1UF1893( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UF1893( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UF1893( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UF12 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A14152MEnvOrd), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEnv");
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
                        processLevel1UF1893( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1UF0( ) ;
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
            load1UF1893( ) ;
         }
         endLevel1UF1893( ) ;
      }
      closeExtendedTableCursors1UF1893( ) ;
   }

   public void update1UF1893( )
   {
      beforeValidate1UF1893( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UF1893( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UF1893( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UF1893( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1UF1893( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPMEnv */
                  deferredUpdate1UF1893( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1UF1893( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1UF0( ) ;
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
         endLevel1UF1893( ) ;
      }
      closeExtendedTableCursors1UF1893( ) ;
   }

   public void deferredUpdate1UF1893( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1UF1893( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UF1893( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UF1893( ) ;
         afterConfirm1UF1893( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UF1893( ) ;
            if ( AnyError == 0 )
            {
               scanStart1UF1895( ) ;
               while ( RcdFound1895 != 0 )
               {
                  getByPrimaryKey1UF1895( ) ;
                  delete1UF1895( ) ;
                  scanNext1UF1895( ) ;
               }
               scanEnd1UF1895( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UF13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEnv");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1893 == 0 )
                        {
                           initAll1UF1893( ) ;
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
                        resetCaption1UF0( ) ;
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
      sMode1893 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UF1893( ) ;
      Gx_mode = sMode1893 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UF1893( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01UF14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MEPr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T01UF15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Valores de Parámetros", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void processNestedLevel1UF1895( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1UF1895( ) ;
         if ( ( nRcdExists_1895 != 0 ) || ( nIsMod_1895 != 0 ) )
         {
            standaloneNotModal1UF1895( ) ;
            getKey1UF1895( ) ;
            if ( ( nRcdExists_1895 == 0 ) && ( nRcdDeleted_1895 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1UF1895( ) ;
            }
            else
            {
               if ( RcdFound1895 != 0 )
               {
                  if ( ( nRcdDeleted_1895 != 0 ) && ( nRcdExists_1895 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1UF1895( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1895 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1UF1895( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1895 == 0 )
                  {
                     GXCCtl = "MRECLIN_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMRecLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1895_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1895, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMRecLin_Internalname, GXutil.ltrim( localUtil.ntoc( A14153MRecLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMPRecPLC_Internalname, A14166MPRecPLC) ;
         httpContext.changePostValue( edtMPRecVal_Internalname, GXutil.rtrim( A14165MPRecVal)) ;
         httpContext.changePostValue( edtMPRecFec_Internalname, localUtil.ttoc( A14167MPRecFec, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( chkMPRecEr.getInternalname(), GXutil.booltostr( A14168MPRecEr)) ;
         httpContext.changePostValue( edtMPRecFecEv_Internalname, localUtil.ttoc( A14169MPRecFecEv, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( cmbMPRecEst.getInternalname(), GXutil.ltrim( localUtil.ntoc( A14170MPRecEst, (byte)(1), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtMPRecInt_Internalname, GXutil.ltrim( localUtil.ntoc( A14171MPRecInt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14153MRecLin_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z14153MRecLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14166MPRecPLC_"+sGXsfl_45_idx, Z14166MPRecPLC) ;
         httpContext.changePostValue( "ZT_"+"Z14165MPRecVal_"+sGXsfl_45_idx, GXutil.rtrim( Z14165MPRecVal)) ;
         httpContext.changePostValue( "ZT_"+"Z14167MPRecFec_"+sGXsfl_45_idx, localUtil.ttoc( Z14167MPRecFec, 10, 12, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z14168MPRecEr_"+sGXsfl_45_idx, GXutil.booltostr( Z14168MPRecEr)) ;
         httpContext.changePostValue( "ZT_"+"Z14169MPRecFecEv_"+sGXsfl_45_idx, localUtil.ttoc( Z14169MPRecFecEv, 10, 12, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "nRcdDeleted_1895_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1895, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1895_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1895, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1895_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1895, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1895 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1895_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1895_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRECLIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRecLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECPLC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecPLC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECVAL_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECFEC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecFec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECER_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkMPRecEr.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECFECEV_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecFecEv_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECEST_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbMPRecEst.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECINT_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecInt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1UF1895( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1895 = (short)(0) ;
      nIsMod_1895 = (short)(0) ;
      nRcdDeleted_1895 = (short)(0) ;
   }

   public void processLevel1UF1893( )
   {
      /* Save parent mode. */
      sMode1893 = Gx_mode ;
      processNestedLevel1UF1895( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1893 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1UF1893( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1UF1893( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmprec");
         if ( AnyError == 0 )
         {
            confirmValues1UF0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmprec");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1UF1893( )
   {
      /* Scan By routine */
      /* Using cursor T01UF16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      RcdFound1893 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1893 = (short)(1) ;
         A129BarCod = T01UF16_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01UF16_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01UF16_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A14152MEnvOrd = T01UF16_A14152MEnvOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UF1893( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1893 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1893 = (short)(1) ;
         A129BarCod = T01UF16_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01UF16_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01UF16_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A14152MEnvOrd = T01UF16_A14152MEnvOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
      }
   }

   public void scanEnd1UF1893( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1UF1893( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1UF1893( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UF1893( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UF1893( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UF1893( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UF1893( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UF1893( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtMEnvOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvOrd_Enabled), 5, 0), true);
   }

   public void zm1UF1895( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14166MPRecPLC = T01UF3_A14166MPRecPLC[0] ;
            Z14165MPRecVal = T01UF3_A14165MPRecVal[0] ;
            Z14167MPRecFec = T01UF3_A14167MPRecFec[0] ;
            Z14168MPRecEr = T01UF3_A14168MPRecEr[0] ;
            Z14169MPRecFecEv = T01UF3_A14169MPRecFecEv[0] ;
         }
         else
         {
            Z14166MPRecPLC = A14166MPRecPLC ;
            Z14165MPRecVal = A14165MPRecVal ;
            Z14167MPRecFec = A14167MPRecFec ;
            Z14168MPRecEr = A14168MPRecEr ;
            Z14169MPRecFecEv = A14169MPRecFecEv ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z14152MEnvOrd = A14152MEnvOrd ;
         Z14153MRecLin = A14153MRecLin ;
         Z14166MPRecPLC = A14166MPRecPLC ;
         Z14165MPRecVal = A14165MPRecVal ;
         Z14167MPRecFec = A14167MPRecFec ;
         Z14168MPRecEr = A14168MPRecEr ;
         Z14169MPRecFecEv = A14169MPRecFecEv ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1UF1895( )
   {
   }

   public void standaloneModal1UF1895( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMRecLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMRecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRecLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtMRecLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMRecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRecLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
   }

   public void load1UF1895( )
   {
      /* Using cursor T01UF17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Long.valueOf(A14153MRecLin)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1895 = (short)(1) ;
         A14166MPRecPLC = T01UF17_A14166MPRecPLC[0] ;
         A14165MPRecVal = T01UF17_A14165MPRecVal[0] ;
         A14167MPRecFec = T01UF17_A14167MPRecFec[0] ;
         A14168MPRecEr = T01UF17_A14168MPRecEr[0] ;
         A14169MPRecFecEv = T01UF17_A14169MPRecFecEv[0] ;
         zm1UF1895( -5) ;
      }
      pr_default.close(15);
      onLoadActions1UF1895( ) ;
   }

   public void onLoadActions1UF1895( )
   {
      if ( ! GXutil.dateCompare(GXutil.nullDate(), A14169MPRecFecEv) )
      {
         A14171MPRecInt = DecimalUtil.doubleToDec(GXutil.dtdiffms( A14169MPRecFecEv, A14167MPRecFec)) ;
      }
      else
      {
         A14171MPRecInt = DecimalUtil.doubleToDec(0) ;
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), A14169MPRecFecEv) )
      {
         A14170MPRecEst = (byte)(1) ;
      }
      else
      {
         A14170MPRecEst = (byte)(2) ;
      }
   }

   public void checkExtendedTable1UF1895( )
   {
      nIsDirty_1895 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1UF1895( ) ;
      if ( ! GXutil.dateCompare(GXutil.nullDate(), A14169MPRecFecEv) )
      {
         nIsDirty_1895 = (short)(1) ;
         A14171MPRecInt = DecimalUtil.doubleToDec(GXutil.dtdiffms( A14169MPRecFecEv, A14167MPRecFec)) ;
      }
      else
      {
         nIsDirty_1895 = (short)(1) ;
         A14171MPRecInt = DecimalUtil.doubleToDec(0) ;
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), A14169MPRecFecEv) )
      {
         nIsDirty_1895 = (short)(1) ;
         A14170MPRecEst = (byte)(1) ;
      }
      else
      {
         nIsDirty_1895 = (short)(1) ;
         A14170MPRecEst = (byte)(2) ;
      }
   }

   public void closeExtendedTableCursors1UF1895( )
   {
   }

   public void enableDisable1UF1895( )
   {
   }

   public void getKey1UF1895( )
   {
      /* Using cursor T01UF18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Long.valueOf(A14153MRecLin)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1895 = (short)(1) ;
      }
      else
      {
         RcdFound1895 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey1UF1895( )
   {
      /* Using cursor T01UF3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Long.valueOf(A14153MRecLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01UF3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1UF1895( 5) ;
         RcdFound1895 = (short)(1) ;
         initializeNonKey1UF1895( ) ;
         A14153MRecLin = T01UF3_A14153MRecLin[0] ;
         A14166MPRecPLC = T01UF3_A14166MPRecPLC[0] ;
         A14165MPRecVal = T01UF3_A14165MPRecVal[0] ;
         A14167MPRecFec = T01UF3_A14167MPRecFec[0] ;
         A14168MPRecEr = T01UF3_A14168MPRecEr[0] ;
         A14169MPRecFecEv = T01UF3_A14169MPRecFecEv[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z14152MEnvOrd = A14152MEnvOrd ;
         Z14153MRecLin = A14153MRecLin ;
         sMode1895 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1UF1895( ) ;
         load1UF1895( ) ;
         Gx_mode = sMode1895 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1895 = (short)(0) ;
         initializeNonKey1UF1895( ) ;
         sMode1895 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1UF1895( ) ;
         Gx_mode = sMode1895 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1UF1895( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1UF1895( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UF2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Long.valueOf(A14153MRecLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMPRec"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z14166MPRecPLC, T01UF2_A14166MPRecPLC[0]) != 0 ) || ( GXutil.strcmp(Z14165MPRecVal, T01UF2_A14165MPRecVal[0]) != 0 ) || !( GXutil.dateCompare(Z14167MPRecFec, T01UF2_A14167MPRecFec[0]) ) || ( Z14168MPRecEr != T01UF2_A14168MPRecEr[0] ) || !( GXutil.dateCompare(Z14169MPRecFecEv, T01UF2_A14169MPRecFecEv[0]) ) )
         {
            if ( GXutil.strcmp(Z14166MPRecPLC, T01UF2_A14166MPRecPLC[0]) != 0 )
            {
               GXutil.writeLogln("tmprec:[seudo value changed for attri]"+"MPRecPLC");
               GXutil.writeLogRaw("Old: ",Z14166MPRecPLC);
               GXutil.writeLogRaw("Current: ",T01UF2_A14166MPRecPLC[0]);
            }
            if ( GXutil.strcmp(Z14165MPRecVal, T01UF2_A14165MPRecVal[0]) != 0 )
            {
               GXutil.writeLogln("tmprec:[seudo value changed for attri]"+"MPRecVal");
               GXutil.writeLogRaw("Old: ",Z14165MPRecVal);
               GXutil.writeLogRaw("Current: ",T01UF2_A14165MPRecVal[0]);
            }
            if ( !( GXutil.dateCompare(Z14167MPRecFec, T01UF2_A14167MPRecFec[0]) ) )
            {
               GXutil.writeLogln("tmprec:[seudo value changed for attri]"+"MPRecFec");
               GXutil.writeLogRaw("Old: ",Z14167MPRecFec);
               GXutil.writeLogRaw("Current: ",T01UF2_A14167MPRecFec[0]);
            }
            if ( Z14168MPRecEr != T01UF2_A14168MPRecEr[0] )
            {
               GXutil.writeLogln("tmprec:[seudo value changed for attri]"+"MPRecEr");
               GXutil.writeLogRaw("Old: ",Z14168MPRecEr);
               GXutil.writeLogRaw("Current: ",T01UF2_A14168MPRecEr[0]);
            }
            if ( !( GXutil.dateCompare(Z14169MPRecFecEv, T01UF2_A14169MPRecFecEv[0]) ) )
            {
               GXutil.writeLogln("tmprec:[seudo value changed for attri]"+"MPRecFecEv");
               GXutil.writeLogRaw("Old: ",Z14169MPRecFecEv);
               GXutil.writeLogRaw("Current: ",T01UF2_A14169MPRecFecEv[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMPRec"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UF1895( )
   {
      beforeValidate1UF1895( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UF1895( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UF1895( 0) ;
         checkOptimisticConcurrency1UF1895( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UF1895( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UF1895( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UF19 */
                  pr_default.execute(17, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Long.valueOf(A14153MRecLin), A14166MPRecPLC, A14165MPRecVal, A14167MPRecFec, Boolean.valueOf(A14168MPRecEr), A14169MPRecFecEv, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPRec");
                  if ( (pr_default.getStatus(17) == 1) )
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
            load1UF1895( ) ;
         }
         endLevel1UF1895( ) ;
      }
      closeExtendedTableCursors1UF1895( ) ;
   }

   public void update1UF1895( )
   {
      beforeValidate1UF1895( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UF1895( ) ;
      }
      if ( ( nIsMod_1895 != 0 ) || ( nIsDirty_1895 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1UF1895( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1UF1895( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1UF1895( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01UF20 */
                     pr_default.execute(18, new Object[] {A14166MPRecPLC, A14165MPRecVal, A14167MPRecFec, Boolean.valueOf(A14168MPRecEr), A14169MPRecFecEv, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Long.valueOf(A14153MRecLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPRec");
                     if ( (pr_default.getStatus(18) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMPRec"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1UF1895( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1UF1895( ) ;
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
            endLevel1UF1895( ) ;
         }
      }
      closeExtendedTableCursors1UF1895( ) ;
   }

   public void deferredUpdate1UF1895( )
   {
   }

   public void delete1UF1895( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1UF1895( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UF1895( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UF1895( ) ;
         afterConfirm1UF1895( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UF1895( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01UF21 */
               pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Long.valueOf(A14153MRecLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPRec");
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
      sMode1895 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UF1895( ) ;
      Gx_mode = sMode1895 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UF1895( )
   {
      standaloneModal1UF1895( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A14169MPRecFecEv) )
         {
            A14171MPRecInt = DecimalUtil.doubleToDec(GXutil.dtdiffms( A14169MPRecFecEv, A14167MPRecFec)) ;
         }
         else
         {
            A14171MPRecInt = DecimalUtil.doubleToDec(0) ;
         }
         if ( GXutil.dateCompare(GXutil.nullDate(), A14169MPRecFecEv) )
         {
            A14170MPRecEst = (byte)(1) ;
         }
         else
         {
            A14170MPRecEst = (byte)(2) ;
         }
      }
   }

   public void endLevel1UF1895( )
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

   public void scanStart1UF1895( )
   {
      /* Scan By routine */
      /* Using cursor T01UF22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
      RcdFound1895 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1895 = (short)(1) ;
         A14153MRecLin = T01UF22_A14153MRecLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UF1895( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound1895 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1895 = (short)(1) ;
         A14153MRecLin = T01UF22_A14153MRecLin[0] ;
      }
   }

   public void scanEnd1UF1895( )
   {
      pr_default.close(20);
   }

   public void afterConfirm1UF1895( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1UF1895( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UF1895( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UF1895( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UF1895( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UF1895( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UF1895( )
   {
      edtMRecLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRecLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtMPRecPLC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMPRecPLC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecPLC_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtMPRecVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMPRecVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecVal_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtMPRecFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMPRecFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecFec_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      chkMPRecEr.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkMPRecEr.getInternalname(), "Enabled", GXutil.ltrimstr( chkMPRecEr.getEnabled(), 5, 0), !bGXsfl_45_Refreshing);
      edtMPRecFecEv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMPRecFecEv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecFecEv_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      cmbMPRecEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMPRecEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMPRecEst.getEnabled(), 5, 0), !bGXsfl_45_Refreshing);
      edtMPRecInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMPRecInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecInt_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void send_integrity_lvl_hashes1UF1895( )
   {
   }

   public void send_integrity_lvl_hashes1UF1893( )
   {
   }

   public void subsflControlProps_451895( )
   {
      edtavnRcdDeleted_1895_Internalname = "vNRCDDELETED_1895_"+sGXsfl_45_idx ;
      edtMRecLin_Internalname = "MRECLIN_"+sGXsfl_45_idx ;
      edtMPRecPLC_Internalname = "MPRECPLC_"+sGXsfl_45_idx ;
      edtMPRecVal_Internalname = "MPRECVAL_"+sGXsfl_45_idx ;
      edtMPRecFec_Internalname = "MPRECFEC_"+sGXsfl_45_idx ;
      chkMPRecEr.setInternalname( "MPRECER_"+sGXsfl_45_idx );
      edtMPRecFecEv_Internalname = "MPRECFECEV_"+sGXsfl_45_idx ;
      cmbMPRecEst.setInternalname( "MPRECEST_"+sGXsfl_45_idx );
      edtMPRecInt_Internalname = "MPRECINT_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_451895( )
   {
      edtavnRcdDeleted_1895_Internalname = "vNRCDDELETED_1895_"+sGXsfl_45_fel_idx ;
      edtMRecLin_Internalname = "MRECLIN_"+sGXsfl_45_fel_idx ;
      edtMPRecPLC_Internalname = "MPRECPLC_"+sGXsfl_45_fel_idx ;
      edtMPRecVal_Internalname = "MPRECVAL_"+sGXsfl_45_fel_idx ;
      edtMPRecFec_Internalname = "MPRECFEC_"+sGXsfl_45_fel_idx ;
      chkMPRecEr.setInternalname( "MPRECER_"+sGXsfl_45_fel_idx );
      edtMPRecFecEv_Internalname = "MPRECFECEV_"+sGXsfl_45_fel_idx ;
      cmbMPRecEst.setInternalname( "MPRECEST_"+sGXsfl_45_fel_idx );
      edtMPRecInt_Internalname = "MPRECINT_"+sGXsfl_45_fel_idx ;
   }

   public void addRow1UF1895( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451895( ) ;
      sendRow1UF1895( ) ;
   }

   public void sendRow1UF1895( )
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
         if ( ((int)((nGXsfl_45_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1895_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1895_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1895, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1895_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1895), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1895), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1895_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1895_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1895_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRecLin_Internalname,GXutil.ltrim( localUtil.ntoc( A14153MRecLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14153MRecLin), "ZZZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRecLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMRecLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1895_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMPRecPLC_Internalname,A14166MPRecPLC,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMPRecPLC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMPRecPLC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1895_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMPRecVal_Internalname,GXutil.rtrim( A14165MPRecVal),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMPRecVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMPRecVal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1895_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMPRecFec_Internalname,localUtil.ttoc( A14167MPRecFec, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A14167MPRecFec, "99/99/99 99:99:99.999"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMPRecFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMPRecFec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(21),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Check box */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1895_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "MPRECER_" + sGXsfl_45_idx ;
      chkMPRecEr.setName( GXCCtl );
      chkMPRecEr.setWebtags( "" );
      chkMPRecEr.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkMPRecEr.getInternalname(), "TitleCaption", chkMPRecEr.getCaption(), !bGXsfl_45_Refreshing);
      chkMPRecEr.setCheckedValue( "false" );
      A14168MPRecEr = GXutil.strtobool( GXutil.booltostr( A14168MPRecEr)) ;
      Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkMPRecEr.getInternalname(),GXutil.booltostr( A14168MPRecEr),"","",Integer.valueOf(-1),Integer.valueOf(chkMPRecEr.getEnabled()),"true","",StyleString,ClassString,"","",TempTags+" onclick="+"\"gx.fn.checkboxClick(51, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,51);\""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1895_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMPRecFecEv_Internalname,localUtil.ttoc( A14169MPRecFecEv, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A14169MPRecFecEv, "99/99/99 99:99:99.999"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMPRecFecEv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMPRecFecEv_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(21),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      GXCCtl = "MPRECEST_" + sGXsfl_45_idx ;
      cmbMPRecEst.setName( GXCCtl );
      cmbMPRecEst.setWebtags( "" );
      cmbMPRecEst.addItem("1", httpContext.getMessage( "A evaluar", ""), (short)(0));
      cmbMPRecEst.addItem("2", httpContext.getMessage( "Evaluado", ""), (short)(0));
      if ( cmbMPRecEst.getItemCount() > 0 )
      {
         A14170MPRecEst = (byte)(GXutil.lval( cmbMPRecEst.getValidValue(GXutil.trim( GXutil.str( A14170MPRecEst, 1, 0))))) ;
      }
      /* ComboBox */
      Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbMPRecEst,cmbMPRecEst.getInternalname(),GXutil.trim( GXutil.str( A14170MPRecEst, 1, 0)),Integer.valueOf(1),cmbMPRecEst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(cmbMPRecEst.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","","","","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbMPRecEst.setValue( GXutil.trim( GXutil.str( A14170MPRecEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMPRecEst.getInternalname(), "Values", cmbMPRecEst.ToJavascriptSource(), !bGXsfl_45_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMPRecInt_Internalname,GXutil.ltrim( localUtil.ntoc( A14171MPRecInt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMPRecInt_Enabled!=0) ? localUtil.format( A14171MPRecInt, "ZZZZZZ9.99") : localUtil.format( A14171MPRecInt, "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMPRecInt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMPRecInt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1UF1895( ) ;
      GXCCtl = "Z14153MRecLin_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14153MRecLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14166MPRecPLC_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z14166MPRecPLC);
      GXCCtl = "Z14165MPRecVal_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14165MPRecVal));
      GXCCtl = "Z14167MPRecFec_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z14167MPRecFec, 10, 12, 0, 0, "/", ":", " "));
      GXCCtl = "Z14168MPRecEr_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_boolean_hidden_field( httpContext, GXCCtl, Z14168MPRecEr);
      GXCCtl = "Z14169MPRecFecEv_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z14169MPRecFecEv, 10, 12, 0, 0, "/", ":", " "));
      GXCCtl = "nRcdDeleted_1895_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1895, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1895_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1895, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1895_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1895, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1895_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1895_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MRECLIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRecLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MPRECPLC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecPLC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MPRECVAL_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MPRECFEC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecFec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MPRECER_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkMPRecEr.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MPRECFECEV_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecFecEv_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MPRECEST_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbMPRecEst.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MPRECINT_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecInt_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1UF1895( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451895( ) ;
      edtavnRcdDeleted_1895_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1895_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMRecLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRECLIN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMPRecPLC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECPLC_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMPRecVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECVAL_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMPRecFec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECFEC_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      chkMPRecEr.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "MPRECER_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtMPRecFecEv_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECFECEV_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbMPRecEst.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "MPRECEST_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtMPRecInt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECINT_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1895_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1895_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1895");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1895_Internalname ;
         wbErr = true ;
         nRcdDeleted_1895 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1895 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1895_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
      {
         GXCCtl = "MRECLIN_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRecLin_Internalname ;
         wbErr = true ;
         A14153MRecLin = 0 ;
      }
      else
      {
         A14153MRecLin = localUtil.ctol( httpContext.cgiGet( edtMRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      A14166MPRecPLC = httpContext.cgiGet( edtMPRecPLC_Internalname) ;
      A14165MPRecVal = httpContext.cgiGet( edtMPRecVal_Internalname) ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtMPRecFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "MPRECFEC_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMPRecFec_Internalname ;
         wbErr = true ;
         A14167MPRecFec = GXutil.resetTime( GXutil.nullDate() );
      }
      else
      {
         A14167MPRecFec = localUtil.ctot( httpContext.cgiGet( edtMPRecFec_Internalname)) ;
      }
      A14168MPRecEr = GXutil.strtobool( httpContext.cgiGet( chkMPRecEr.getInternalname())) ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtMPRecFecEv_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "MPRECFECEV_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMPRecFecEv_Internalname ;
         wbErr = true ;
         A14169MPRecFecEv = GXutil.resetTime( GXutil.nullDate() );
      }
      else
      {
         A14169MPRecFecEv = localUtil.ctot( httpContext.cgiGet( edtMPRecFecEv_Internalname)) ;
      }
      cmbMPRecEst.setName( cmbMPRecEst.getInternalname() );
      cmbMPRecEst.setValue( httpContext.cgiGet( cmbMPRecEst.getInternalname()) );
      A14170MPRecEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbMPRecEst.getInternalname()))) ;
      A14171MPRecInt = localUtil.ctond( httpContext.cgiGet( edtMPRecInt_Internalname)) ;
      GXCCtl = "Z14153MRecLin_" + sGXsfl_45_idx ;
      Z14153MRecLin = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z14166MPRecPLC_" + sGXsfl_45_idx ;
      Z14166MPRecPLC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14165MPRecVal_" + sGXsfl_45_idx ;
      Z14165MPRecVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14167MPRecFec_" + sGXsfl_45_idx ;
      Z14167MPRecFec = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z14168MPRecEr_" + sGXsfl_45_idx ;
      Z14168MPRecEr = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z14169MPRecFecEv_" + sGXsfl_45_idx ;
      Z14169MPRecFecEv = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "nRcdDeleted_1895_" + sGXsfl_45_idx ;
      nRcdDeleted_1895 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1895_" + sGXsfl_45_idx ;
      nRcdExists_1895 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1895_" + sGXsfl_45_idx ;
      nIsMod_1895 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMRecLin_Enabled = edtMRecLin_Enabled ;
   }

   public void confirmValues1UF0( )
   {
      nGXsfl_45_idx = 0 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451895( ) ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451895( ) ;
         httpContext.changePostValue( "Z14153MRecLin_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z14153MRecLin_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14153MRecLin_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z14166MPRecPLC_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z14166MPRecPLC_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14166MPRecPLC_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z14165MPRecVal_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z14165MPRecVal_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14165MPRecVal_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z14167MPRecFec_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z14167MPRecFec_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14167MPRecFec_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z14168MPRecEr_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z14168MPRecEr_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14168MPRecEr_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z14169MPRecFecEv_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z14169MPRecFecEv_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14169MPRecFecEv_"+sGXsfl_45_idx) ;
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tmprec", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14152MEnvOrd", GXutil.ltrim( localUtil.ntoc( Z14152MEnvOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nGXsfl_45_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV33Pgmname));
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
      return formatLink("app.tmprec", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TMPRec" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MPRec", "") ;
   }

   public void initializeNonKey1UF1893( )
   {
   }

   public void initAll1UF1893( )
   {
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A14152MEnvOrd = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
      initializeNonKey1UF1893( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1UF1895( )
   {
      A14170MPRecEst = (byte)(0) ;
      A14171MPRecInt = DecimalUtil.ZERO ;
      A14166MPRecPLC = "" ;
      A14165MPRecVal = "" ;
      A14167MPRecFec = GXutil.resetTime( GXutil.nullDate() );
      A14168MPRecEr = false ;
      A14169MPRecFecEv = GXutil.resetTime( GXutil.nullDate() );
      Z14166MPRecPLC = "" ;
      Z14165MPRecVal = "" ;
      Z14167MPRecFec = GXutil.resetTime( GXutil.nullDate() );
      Z14168MPRecEr = false ;
      Z14169MPRecFecEv = GXutil.resetTime( GXutil.nullDate() );
   }

   public void initAll1UF1895( )
   {
      A14153MRecLin = 0 ;
      initializeNonKey1UF1895( ) ;
   }

   public void standaloneModalInsert1UF1895( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202671011112179", true, true);
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
      httpContext.AddJavascriptSource("tmprec.js", "?202671011112179", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1895( )
   {
      edtMRecLin_Enabled = defedtMRecLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRecLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void startgridcontrol45( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1895, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1895_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14153MRecLin, (byte)(12), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMRecLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A14166MPRecPLC);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecPLC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A14165MPRecVal));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A14167MPRecFec, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecFec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.booltostr( A14168MPRecEr));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkMPRecEr.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A14169MPRecFecEv, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecFecEv_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14170MPRecEst, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbMPRecEst.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14171MPRecInt, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecInt_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtMEnvOrd_Internalname = "MENVORD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      edtavnRcdDeleted_1895_Internalname = "vNRCDDELETED_1895" ;
      edtMRecLin_Internalname = "MRECLIN" ;
      edtMPRecPLC_Internalname = "MPRECPLC" ;
      edtMPRecVal_Internalname = "MPRECVAL" ;
      edtMPRecFec_Internalname = "MPRECFEC" ;
      chkMPRecEr.setInternalname( "MPRECER" );
      edtMPRecFecEv_Internalname = "MPRECFECEV" ;
      cmbMPRecEst.setInternalname( "MPRECEST" );
      edtMPRecInt_Internalname = "MPRECINT" ;
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
      Form.setCaption( httpContext.getMessage( "MPRec", "") );
      edtMPRecInt_Jsonclick = "" ;
      cmbMPRecEst.setJsonclick( "" );
      edtMPRecFecEv_Jsonclick = "" ;
      chkMPRecEr.setCaption( "" );
      edtMPRecFec_Jsonclick = "" ;
      edtMPRecVal_Jsonclick = "" ;
      edtMPRecPLC_Jsonclick = "" ;
      edtMRecLin_Jsonclick = "" ;
      edtavnRcdDeleted_1895_Jsonclick = "" ;
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
      edtMPRecInt_Enabled = 0 ;
      cmbMPRecEst.setEnabled( 0 );
      edtMPRecFecEv_Enabled = 1 ;
      chkMPRecEr.setEnabled( 1 );
      edtMPRecFec_Enabled = 1 ;
      edtMPRecVal_Enabled = 1 ;
      edtMPRecPLC_Enabled = 1 ;
      edtMRecLin_Enabled = 1 ;
      edtavnRcdDeleted_1895_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtMEnvOrd_Jsonclick = "" ;
      edtMEnvOrd_Backcolor = (int)(0xFFFFFF) ;
      edtMEnvOrd_Enabled = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 1 ;
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
      subsflControlProps_451895( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1UF1895( ) ;
         standaloneModal1UF1895( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1UF1895( ) ;
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451895( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "MPRECER_" + sGXsfl_45_idx ;
      chkMPRecEr.setName( GXCCtl );
      chkMPRecEr.setWebtags( "" );
      chkMPRecEr.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkMPRecEr.getInternalname(), "TitleCaption", chkMPRecEr.getCaption(), !bGXsfl_45_Refreshing);
      chkMPRecEr.setCheckedValue( "false" );
      A14168MPRecEr = GXutil.strtobool( GXutil.booltostr( A14168MPRecEr)) ;
      GXCCtl = "MPRECEST_" + sGXsfl_45_idx ;
      cmbMPRecEst.setName( GXCCtl );
      cmbMPRecEst.setWebtags( "" );
      cmbMPRecEst.addItem("1", httpContext.getMessage( "A evaluar", ""), (short)(0));
      cmbMPRecEst.addItem("2", httpContext.getMessage( "Evaluado", ""), (short)(0));
      if ( cmbMPRecEst.getItemCount() > 0 )
      {
         A14170MPRecEst = (byte)(GXutil.lval( cmbMPRecEst.getValidValue(GXutil.trim( GXutil.str( A14170MPRecEst, 1, 0))))) ;
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01UF23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(21);
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

   public void valid_Barcodpar( )
   {
      /* Using cursor T01UF23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
      }
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Menvord( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14152MEnvOrd", GXutil.ltrim( localUtil.ntoc( Z14152MEnvOrd, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Mprecfecev( )
   {
      A14170MPRecEst = (byte)(GXutil.lval( cmbMPRecEst.getValue())) ;
      cmbMPRecEst.setValue( GXutil.str( A14170MPRecEst, 1, 0) );
      if ( ! GXutil.dateCompare(GXutil.nullDate(), A14169MPRecFecEv) )
      {
         A14171MPRecInt = DecimalUtil.doubleToDec(GXutil.dtdiffms( A14169MPRecFecEv, A14167MPRecFec)) ;
      }
      else
      {
         A14171MPRecInt = DecimalUtil.doubleToDec(0) ;
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), A14169MPRecFecEv) )
      {
         A14170MPRecEst = (byte)(1) ;
         cmbMPRecEst.setValue( GXutil.str( A14170MPRecEst, 1, 0) );
      }
      else
      {
         A14170MPRecEst = (byte)(2) ;
         cmbMPRecEst.setValue( GXutil.str( A14170MPRecEst, 1, 0) );
      }
      dynload_actions( ) ;
      if ( cmbMPRecEst.getItemCount() > 0 )
      {
         A14170MPRecEst = (byte)(GXutil.lval( cmbMPRecEst.getValidValue(GXutil.trim( GXutil.str( A14170MPRecEst, 1, 0))))) ;
         cmbMPRecEst.setValue( GXutil.str( A14170MPRecEst, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbMPRecEst.setValue( GXutil.trim( GXutil.str( A14170MPRecEst, 1, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14171MPRecInt", GXutil.ltrim( localUtil.ntoc( A14171MPRecInt, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14170MPRecEst", GXutil.ltrim( localUtil.ntoc( A14170MPRecEst, (byte)(1), (byte)(0), ".", "")));
      cmbMPRecEst.setValue( GXutil.trim( GXutil.str( A14170MPRecEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMPRecEst.getInternalname(), "Values", cmbMPRecEst.ToJavascriptSource(), true);
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
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_MENVORD","{handler:'valid_Menvord',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A14152MEnvOrd',fld:'MENVORD',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MENVORD",",oparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z14152MEnvOrd'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MRECLIN","{handler:'valid_Mreclin',iparms:[]");
      setEventMetadata("VALID_MRECLIN",",oparms:[]}");
      setEventMetadata("VALID_MPRECFEC","{handler:'valid_Mprecfec',iparms:[]");
      setEventMetadata("VALID_MPRECFEC",",oparms:[]}");
      setEventMetadata("VALID_MPRECFECEV","{handler:'valid_Mprecfecev',iparms:[{av:'A14169MPRecFecEv',fld:'MPRECFECEV',pic:'99/99/99 99:99:99.999'},{av:'A14167MPRecFec',fld:'MPRECFEC',pic:'99/99/99 99:99:99.999'},{av:'A14171MPRecInt',fld:'MPRECINT',pic:'ZZZZZZ9.99'},{av:'cmbMPRecEst'},{av:'A14170MPRecEst',fld:'MPRECEST',pic:'9'}]");
      setEventMetadata("VALID_MPRECFECEV",",oparms:[{av:'A14171MPRecInt',fld:'MPRECINT',pic:'ZZZZZZ9.99'},{av:'cmbMPRecEst'},{av:'A14170MPRecEst',fld:'MPRECEST',pic:'9'}]}");
      setEventMetadata("NULL","{handler:'valid_Mprecint',iparms:[]");
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
      pr_default.close(21);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z14166MPRecPLC = "" ;
      Z14165MPRecVal = "" ;
      Z14167MPRecFec = GXutil.resetTime( GXutil.nullDate() );
      Z14169MPRecFecEv = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_mode = "" ;
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
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1895 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV33Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1893 = "" ;
      GXCCtl = "" ;
      A14166MPRecPLC = "" ;
      A14165MPRecVal = "" ;
      A14167MPRecFec = GXutil.resetTime( GXutil.nullDate() );
      A14169MPRecFecEv = GXutil.resetTime( GXutil.nullDate() );
      A14171MPRecInt = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      T01UF7_A14152MEnvOrd = new short[1] ;
      T01UF7_A396EmprCod = new String[] {""} ;
      T01UF7_A129BarCod = new int[1] ;
      T01UF7_A132BarCodReo = new byte[1] ;
      T01UF7_A130BarCodPar = new String[] {""} ;
      T01UF6_A396EmprCod = new String[] {""} ;
      T01UF8_A396EmprCod = new String[] {""} ;
      T01UF9_A396EmprCod = new String[] {""} ;
      T01UF9_A129BarCod = new int[1] ;
      T01UF9_A132BarCodReo = new byte[1] ;
      T01UF9_A130BarCodPar = new String[] {""} ;
      T01UF9_A14152MEnvOrd = new short[1] ;
      T01UF5_A14152MEnvOrd = new short[1] ;
      T01UF5_A396EmprCod = new String[] {""} ;
      T01UF5_A129BarCod = new int[1] ;
      T01UF5_A132BarCodReo = new byte[1] ;
      T01UF5_A130BarCodPar = new String[] {""} ;
      T01UF10_A396EmprCod = new String[] {""} ;
      T01UF10_A129BarCod = new int[1] ;
      T01UF10_A132BarCodReo = new byte[1] ;
      T01UF10_A130BarCodPar = new String[] {""} ;
      T01UF10_A14152MEnvOrd = new short[1] ;
      T01UF11_A396EmprCod = new String[] {""} ;
      T01UF11_A129BarCod = new int[1] ;
      T01UF11_A132BarCodReo = new byte[1] ;
      T01UF11_A130BarCodPar = new String[] {""} ;
      T01UF11_A14152MEnvOrd = new short[1] ;
      T01UF4_A14152MEnvOrd = new short[1] ;
      T01UF4_A396EmprCod = new String[] {""} ;
      T01UF4_A129BarCod = new int[1] ;
      T01UF4_A132BarCodReo = new byte[1] ;
      T01UF4_A130BarCodPar = new String[] {""} ;
      T01UF14_A14674MEPrId = new long[1] ;
      T01UF15_A396EmprCod = new String[] {""} ;
      T01UF15_A129BarCod = new int[1] ;
      T01UF15_A132BarCodReo = new byte[1] ;
      T01UF15_A130BarCodPar = new String[] {""} ;
      T01UF15_A14152MEnvOrd = new short[1] ;
      T01UF15_A1664ParFasCod = new short[1] ;
      T01UF16_A396EmprCod = new String[] {""} ;
      T01UF16_A129BarCod = new int[1] ;
      T01UF16_A132BarCodReo = new byte[1] ;
      T01UF16_A130BarCodPar = new String[] {""} ;
      T01UF16_A14152MEnvOrd = new short[1] ;
      T01UF17_A129BarCod = new int[1] ;
      T01UF17_A132BarCodReo = new byte[1] ;
      T01UF17_A130BarCodPar = new String[] {""} ;
      T01UF17_A14152MEnvOrd = new short[1] ;
      T01UF17_A14153MRecLin = new long[1] ;
      T01UF17_A14166MPRecPLC = new String[] {""} ;
      T01UF17_A14165MPRecVal = new String[] {""} ;
      T01UF17_A14167MPRecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01UF17_A14168MPRecEr = new boolean[] {false} ;
      T01UF17_A14169MPRecFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      T01UF17_A396EmprCod = new String[] {""} ;
      T01UF18_A396EmprCod = new String[] {""} ;
      T01UF18_A129BarCod = new int[1] ;
      T01UF18_A132BarCodReo = new byte[1] ;
      T01UF18_A130BarCodPar = new String[] {""} ;
      T01UF18_A14152MEnvOrd = new short[1] ;
      T01UF18_A14153MRecLin = new long[1] ;
      T01UF3_A129BarCod = new int[1] ;
      T01UF3_A132BarCodReo = new byte[1] ;
      T01UF3_A130BarCodPar = new String[] {""} ;
      T01UF3_A14152MEnvOrd = new short[1] ;
      T01UF3_A14153MRecLin = new long[1] ;
      T01UF3_A14166MPRecPLC = new String[] {""} ;
      T01UF3_A14165MPRecVal = new String[] {""} ;
      T01UF3_A14167MPRecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01UF3_A14168MPRecEr = new boolean[] {false} ;
      T01UF3_A14169MPRecFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      T01UF3_A396EmprCod = new String[] {""} ;
      T01UF2_A129BarCod = new int[1] ;
      T01UF2_A132BarCodReo = new byte[1] ;
      T01UF2_A130BarCodPar = new String[] {""} ;
      T01UF2_A14152MEnvOrd = new short[1] ;
      T01UF2_A14153MRecLin = new long[1] ;
      T01UF2_A14166MPRecPLC = new String[] {""} ;
      T01UF2_A14165MPRecVal = new String[] {""} ;
      T01UF2_A14167MPRecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01UF2_A14168MPRecEr = new boolean[] {false} ;
      T01UF2_A14169MPRecFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      T01UF2_A396EmprCod = new String[] {""} ;
      T01UF22_A396EmprCod = new String[] {""} ;
      T01UF22_A129BarCod = new int[1] ;
      T01UF22_A132BarCodReo = new byte[1] ;
      T01UF22_A130BarCodPar = new String[] {""} ;
      T01UF22_A14152MEnvOrd = new short[1] ;
      T01UF22_A14153MRecLin = new long[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01UF23_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      Z14171MPRecInt = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmprec__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmprec__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmprec__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmprec__default(),
         new Object[] {
             new Object[] {
            T01UF2_A129BarCod, T01UF2_A132BarCodReo, T01UF2_A130BarCodPar, T01UF2_A14152MEnvOrd, T01UF2_A14153MRecLin, T01UF2_A14166MPRecPLC, T01UF2_A14165MPRecVal, T01UF2_A14167MPRecFec, T01UF2_A14168MPRecEr, T01UF2_A14169MPRecFecEv,
            T01UF2_A396EmprCod
            }
            , new Object[] {
            T01UF3_A129BarCod, T01UF3_A132BarCodReo, T01UF3_A130BarCodPar, T01UF3_A14152MEnvOrd, T01UF3_A14153MRecLin, T01UF3_A14166MPRecPLC, T01UF3_A14165MPRecVal, T01UF3_A14167MPRecFec, T01UF3_A14168MPRecEr, T01UF3_A14169MPRecFecEv,
            T01UF3_A396EmprCod
            }
            , new Object[] {
            T01UF4_A14152MEnvOrd, T01UF4_A396EmprCod, T01UF4_A129BarCod, T01UF4_A132BarCodReo, T01UF4_A130BarCodPar
            }
            , new Object[] {
            T01UF5_A14152MEnvOrd, T01UF5_A396EmprCod, T01UF5_A129BarCod, T01UF5_A132BarCodReo, T01UF5_A130BarCodPar
            }
            , new Object[] {
            T01UF6_A396EmprCod
            }
            , new Object[] {
            T01UF7_A14152MEnvOrd, T01UF7_A396EmprCod, T01UF7_A129BarCod, T01UF7_A132BarCodReo, T01UF7_A130BarCodPar
            }
            , new Object[] {
            T01UF8_A396EmprCod
            }
            , new Object[] {
            T01UF9_A396EmprCod, T01UF9_A129BarCod, T01UF9_A132BarCodReo, T01UF9_A130BarCodPar, T01UF9_A14152MEnvOrd
            }
            , new Object[] {
            T01UF10_A396EmprCod, T01UF10_A129BarCod, T01UF10_A132BarCodReo, T01UF10_A130BarCodPar, T01UF10_A14152MEnvOrd
            }
            , new Object[] {
            T01UF11_A396EmprCod, T01UF11_A129BarCod, T01UF11_A132BarCodReo, T01UF11_A130BarCodPar, T01UF11_A14152MEnvOrd
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UF14_A14674MEPrId
            }
            , new Object[] {
            T01UF15_A396EmprCod, T01UF15_A129BarCod, T01UF15_A132BarCodReo, T01UF15_A130BarCodPar, T01UF15_A14152MEnvOrd, T01UF15_A1664ParFasCod
            }
            , new Object[] {
            T01UF16_A396EmprCod, T01UF16_A129BarCod, T01UF16_A132BarCodReo, T01UF16_A130BarCodPar, T01UF16_A14152MEnvOrd
            }
            , new Object[] {
            T01UF17_A129BarCod, T01UF17_A132BarCodReo, T01UF17_A130BarCodPar, T01UF17_A14152MEnvOrd, T01UF17_A14153MRecLin, T01UF17_A14166MPRecPLC, T01UF17_A14165MPRecVal, T01UF17_A14167MPRecFec, T01UF17_A14168MPRecEr, T01UF17_A14169MPRecFecEv,
            T01UF17_A396EmprCod
            }
            , new Object[] {
            T01UF18_A396EmprCod, T01UF18_A129BarCod, T01UF18_A132BarCodReo, T01UF18_A130BarCodPar, T01UF18_A14152MEnvOrd, T01UF18_A14153MRecLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UF22_A396EmprCod, T01UF22_A129BarCod, T01UF22_A132BarCodReo, T01UF22_A130BarCodPar, T01UF22_A14152MEnvOrd, T01UF22_A14153MRecLin
            }
            , new Object[] {
            T01UF23_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TMPRec" ;
   }

   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A14170MPRecEst ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private byte Z14170MPRecEst ;
   private short Z14152MEnvOrd ;
   private short nRcdDeleted_1895 ;
   private short nRcdExists_1895 ;
   private short nIsMod_1895 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14152MEnvOrd ;
   private short nBlankRcdCount1895 ;
   private short RcdFound1895 ;
   private short nBlankRcdUsr1895 ;
   private short RcdFound1893 ;
   private short nIsDirty_1893 ;
   private short nIsDirty_1895 ;
   private short ZZ14152MEnvOrd ;
   private int Z129BarCod ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtMEnvOrd_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtavnRcdDeleted_1895_Enabled ;
   private int edtMRecLin_Enabled ;
   private int edtMPRecPLC_Enabled ;
   private int edtMPRecVal_Enabled ;
   private int edtMPRecFec_Enabled ;
   private int edtMPRecFecEv_Enabled ;
   private int edtMPRecInt_Enabled ;
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
   private int defedtMRecLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtMEnvOrd_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private long Z14153MRecLin ;
   private long GRID1_nFirstRecordOnPage ;
   private long A14153MRecLin ;
   private java.math.BigDecimal A14171MPRecInt ;
   private java.math.BigDecimal Z14171MPRecInt ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z14165MPRecVal ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBarCod_Internalname ;
   private String sGXsfl_45_idx="0001" ;
   private String Gx_mode ;
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
   private String edtBarCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtMEnvOrd_Internalname ;
   private String edtMEnvOrd_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String sMode1895 ;
   private String edtavnRcdDeleted_1895_Internalname ;
   private String edtMRecLin_Internalname ;
   private String edtMPRecPLC_Internalname ;
   private String edtMPRecVal_Internalname ;
   private String edtMPRecFec_Internalname ;
   private String edtMPRecFecEv_Internalname ;
   private String edtMPRecInt_Internalname ;
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
   private String AV33Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1893 ;
   private String GXCCtl ;
   private String A14165MPRecVal ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1895_Jsonclick ;
   private String edtMRecLin_Jsonclick ;
   private String edtMPRecPLC_Jsonclick ;
   private String edtMPRecVal_Jsonclick ;
   private String edtMPRecFec_Jsonclick ;
   private String edtMPRecFecEv_Jsonclick ;
   private String edtMPRecInt_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private java.util.Date Z14167MPRecFec ;
   private java.util.Date Z14169MPRecFecEv ;
   private java.util.Date A14167MPRecFec ;
   private java.util.Date A14169MPRecFecEv ;
   private boolean Z14168MPRecEr ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean A14168MPRecEr ;
   private boolean returnInSub ;
   private String Z14166MPRecPLC ;
   private String A14166MPRecPLC ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private ICheckbox chkMPRecEr ;
   private HTMLChoice cmbMPRecEst ;
   private IDataStoreProvider pr_default ;
   private short[] T01UF7_A14152MEnvOrd ;
   private String[] T01UF7_A396EmprCod ;
   private int[] T01UF7_A129BarCod ;
   private byte[] T01UF7_A132BarCodReo ;
   private String[] T01UF7_A130BarCodPar ;
   private String[] T01UF6_A396EmprCod ;
   private String[] T01UF8_A396EmprCod ;
   private String[] T01UF9_A396EmprCod ;
   private int[] T01UF9_A129BarCod ;
   private byte[] T01UF9_A132BarCodReo ;
   private String[] T01UF9_A130BarCodPar ;
   private short[] T01UF9_A14152MEnvOrd ;
   private short[] T01UF5_A14152MEnvOrd ;
   private String[] T01UF5_A396EmprCod ;
   private int[] T01UF5_A129BarCod ;
   private byte[] T01UF5_A132BarCodReo ;
   private String[] T01UF5_A130BarCodPar ;
   private String[] T01UF10_A396EmprCod ;
   private int[] T01UF10_A129BarCod ;
   private byte[] T01UF10_A132BarCodReo ;
   private String[] T01UF10_A130BarCodPar ;
   private short[] T01UF10_A14152MEnvOrd ;
   private String[] T01UF11_A396EmprCod ;
   private int[] T01UF11_A129BarCod ;
   private byte[] T01UF11_A132BarCodReo ;
   private String[] T01UF11_A130BarCodPar ;
   private short[] T01UF11_A14152MEnvOrd ;
   private short[] T01UF4_A14152MEnvOrd ;
   private String[] T01UF4_A396EmprCod ;
   private int[] T01UF4_A129BarCod ;
   private byte[] T01UF4_A132BarCodReo ;
   private String[] T01UF4_A130BarCodPar ;
   private long[] T01UF14_A14674MEPrId ;
   private String[] T01UF15_A396EmprCod ;
   private int[] T01UF15_A129BarCod ;
   private byte[] T01UF15_A132BarCodReo ;
   private String[] T01UF15_A130BarCodPar ;
   private short[] T01UF15_A14152MEnvOrd ;
   private short[] T01UF15_A1664ParFasCod ;
   private String[] T01UF16_A396EmprCod ;
   private int[] T01UF16_A129BarCod ;
   private byte[] T01UF16_A132BarCodReo ;
   private String[] T01UF16_A130BarCodPar ;
   private short[] T01UF16_A14152MEnvOrd ;
   private int[] T01UF17_A129BarCod ;
   private byte[] T01UF17_A132BarCodReo ;
   private String[] T01UF17_A130BarCodPar ;
   private short[] T01UF17_A14152MEnvOrd ;
   private long[] T01UF17_A14153MRecLin ;
   private String[] T01UF17_A14166MPRecPLC ;
   private String[] T01UF17_A14165MPRecVal ;
   private java.util.Date[] T01UF17_A14167MPRecFec ;
   private boolean[] T01UF17_A14168MPRecEr ;
   private java.util.Date[] T01UF17_A14169MPRecFecEv ;
   private String[] T01UF17_A396EmprCod ;
   private String[] T01UF18_A396EmprCod ;
   private int[] T01UF18_A129BarCod ;
   private byte[] T01UF18_A132BarCodReo ;
   private String[] T01UF18_A130BarCodPar ;
   private short[] T01UF18_A14152MEnvOrd ;
   private long[] T01UF18_A14153MRecLin ;
   private int[] T01UF3_A129BarCod ;
   private byte[] T01UF3_A132BarCodReo ;
   private String[] T01UF3_A130BarCodPar ;
   private short[] T01UF3_A14152MEnvOrd ;
   private long[] T01UF3_A14153MRecLin ;
   private String[] T01UF3_A14166MPRecPLC ;
   private String[] T01UF3_A14165MPRecVal ;
   private java.util.Date[] T01UF3_A14167MPRecFec ;
   private boolean[] T01UF3_A14168MPRecEr ;
   private java.util.Date[] T01UF3_A14169MPRecFecEv ;
   private String[] T01UF3_A396EmprCod ;
   private int[] T01UF2_A129BarCod ;
   private byte[] T01UF2_A132BarCodReo ;
   private String[] T01UF2_A130BarCodPar ;
   private short[] T01UF2_A14152MEnvOrd ;
   private long[] T01UF2_A14153MRecLin ;
   private String[] T01UF2_A14166MPRecPLC ;
   private String[] T01UF2_A14165MPRecVal ;
   private java.util.Date[] T01UF2_A14167MPRecFec ;
   private boolean[] T01UF2_A14168MPRecEr ;
   private java.util.Date[] T01UF2_A14169MPRecFecEv ;
   private String[] T01UF2_A396EmprCod ;
   private String[] T01UF22_A396EmprCod ;
   private int[] T01UF22_A129BarCod ;
   private byte[] T01UF22_A132BarCodReo ;
   private String[] T01UF22_A130BarCodPar ;
   private short[] T01UF22_A14152MEnvOrd ;
   private long[] T01UF22_A14153MRecLin ;
   private String[] T01UF23_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmprec__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmprec__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmprec__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmprec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01UF2", "SELECT BarCod, BarCodReo, BarCodPar, MEnvOrd, MRecLin, MPRecPLC, MPRecVal, MPRecFec, MPRecEr, MPRecFecEv, EmprCod FROM TXPMPRec WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? AND MRecLin = ?  FOR UPDATE OF MPRecPLC, MPRecVal, MPRecFec, MPRecEr, MPRecFecEv NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UF3", "SELECT BarCod, BarCodReo, BarCodPar, MEnvOrd, MRecLin, MPRecPLC, MPRecVal, MPRecFec, MPRecEr, MPRecFecEv, EmprCod FROM TXPMPRec WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? AND MRecLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UF4", "SELECT MEnvOrd, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ?  FOR UPDATE OF MEnvOrd NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UF5", "SELECT MEnvOrd, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UF6", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UF7", "SELECT /*+ FIRST_ROWS(100) */ TM1.MEnvOrd, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar FROM TXPMEnv TM1 WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.MEnvOrd = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.MEnvOrd ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UF8", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UF9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UF10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE ( BarCod > ? or BarCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and MEnvOrd > ?) and EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UF11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE ( BarCod < ? or BarCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and MEnvOrd < ?) and EmprCod = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MEnvOrd DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01UF12", "INSERT INTO TXPMEnv(MEnvOrd, EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, MEnvMaqCod, MEnvIni, MEnvFin, MRecHdr) VALUES(?, ?, ?, ?, ?, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ')", GX_NOMASK, "TXPMEnv")
         ,new UpdateCursor("T01UF13", "DELETE FROM TXPMEnv  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ?", GX_NOMASK, "TXPMEnv")
         ,new ForEachCursor("T01UF14", "SELECT * FROM (SELECT MEPrId FROM MEPr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UF15", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, ParFasCod FROM TXPMPEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UF16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UF17", "SELECT BarCod, BarCodReo, BarCodPar, MEnvOrd, MRecLin, MPRecPLC, MPRecVal, MPRecFec, MPRecEr, MPRecFecEv, EmprCod FROM TXPMPRec WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MEnvOrd = ? and MRecLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, MRecLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UF18", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, MRecLin FROM TXPMPRec WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? AND MRecLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01UF19", "INSERT INTO TXPMPRec(BarCod, BarCodReo, BarCodPar, MEnvOrd, MRecLin, MPRecPLC, MPRecVal, MPRecFec, MPRecEr, MPRecFecEv, EmprCod, MPRecValMi, MPRecValMa, MPRecParFa, MPRecReg) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPMPRec")
         ,new UpdateCursor("T01UF20", "UPDATE TXPMPRec SET MPRecPLC=?, MPRecVal=?, MPRecFec=?, MPRecEr=?, MPRecFecEv=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? AND MRecLin = ?", GX_NOMASK, "TXPMPRec")
         ,new UpdateCursor("T01UF21", "DELETE FROM TXPMPRec  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? AND MRecLin = ?", GX_NOMASK, "TXPMPRec")
         ,new ForEachCursor("T01UF22", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, MRecLin FROM TXPMPRec WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MEnvOrd = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, MRecLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UF23", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8, true);
               ((boolean[]) buf[8])[0] = rslt.getBoolean(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10, true);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8, true);
               ((boolean[]) buf[8])[0] = rslt.getBoolean(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10, true);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8, true);
               ((boolean[]) buf[8])[0] = rslt.getBoolean(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10, true);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               return;
            case 21 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setVarchar(6, (String)parms[5], 100, false);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setDateTime(8, (java.util.Date)parms[7], false, true);
               stmt.setBoolean(9, ((Boolean) parms[8]).booleanValue());
               stmt.setDateTime(10, (java.util.Date)parms[9], false, true);
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 18 :
               stmt.setVarchar(1, (String)parms[0], 100, false);
               stmt.setString(2, (String)parms[1], 12);
               stmt.setDateTime(3, (java.util.Date)parms[2], false, true);
               stmt.setBoolean(4, ((Boolean) parms[3]).booleanValue());
               stmt.setDateTime(5, (java.util.Date)parms[4], false, true);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setLong(11, ((Number) parms[10]).longValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

