package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbarens_impl extends GXDataArea
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
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A361DisCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Ensayos de HDR", ""), (short)(0)) ;
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

   public tbarens_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbarens_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbarens_impl.class ));
   }

   public tbarens_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARENS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARENS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARENS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARENS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TBARENS.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARENS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARENS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARENS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARENS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARENS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARENS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARENS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARENS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARENS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARENS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARENS.htm");
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
         nBlankRcdCount1561 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1561 = (short)(1) ;
            scanStart1F31561( ) ;
            while ( RcdFound1561 != 0 )
            {
               init_level_properties1561( ) ;
               getByPrimaryKey1F31561( ) ;
               addRow1F31561( ) ;
               scanNext1F31561( ) ;
            }
            scanEnd1F31561( ) ;
            nBlankRcdCount1561 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1F31561( ) ;
         standaloneModal1F31561( ) ;
         sMode1561 = Gx_mode ;
         while ( nGXsfl_45_idx < nRC_GXsfl_45 )
         {
            bGXsfl_45_Refreshing = true ;
            readRow1F31561( ) ;
            edtavnRcdDeleted_1561_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1561_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1561_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1561_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBarEnsLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARENSLIN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarEnsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnsLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBarEnsGru_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARENSGRU_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarEnsGru_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnsGru_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBarEnsGrLi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARENSGRLI_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarEnsGrLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnsGrLi_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBarEnsTipo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARENSTIPO_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarEnsTipo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnsTipo_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBarEnsMaxI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARENSMAXI_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarEnsMaxI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnsMaxI_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBarEnsNumI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARENSNUMI_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarEnsNumI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnsNumI_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBarEnsEqui_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARENSEQUI_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarEnsEqui_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnsEqui_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBarEnsFchG_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARENSFCHG_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarEnsFchG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnsFchG_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBarEnsEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARENSEST_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarEnsEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnsEst_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBarKgTiras_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARKGTIRAS_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarKgTiras_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgTiras_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBarNbTiras_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNBTIRAS_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarNbTiras_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNbTiras_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBarKgRtFr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARKGRTFR_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarKgRtFr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgRtFr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            if ( ( nRcdExists_1561 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1F31561( ) ;
            }
            sendRow1F31561( ) ;
            bGXsfl_45_Refreshing = false ;
         }
         Gx_mode = sMode1561 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1561 = (short)(5) ;
         nRcdExists_1561 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1F31561( ) ;
            while ( RcdFound1561 != 0 )
            {
               sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_451561( ) ;
               init_level_properties1561( ) ;
               standaloneNotModal1F31561( ) ;
               getByPrimaryKey1F31561( ) ;
               standaloneModal1F31561( ) ;
               addRow1F31561( ) ;
               scanNext1F31561( ) ;
            }
            scanEnd1F31561( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1561 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_451561( ) ;
      initAll1F31561( ) ;
      init_level_properties1561( ) ;
      nRcdExists_1561 = (short)(0) ;
      nIsMod_1561 = (short)(0) ;
      nRcdDeleted_1561 = (short)(0) ;
      nBlankRcdCount1561 = (short)(nBlankRcdUsr1561+nBlankRcdCount1561) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1561 > 0 )
      {
         standaloneNotModal1F31561( ) ;
         standaloneModal1F31561( ) ;
         addRow1F31561( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtBarEnsLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1561 = (short)(nBlankRcdCount1561-1) ;
      }
      Gx_mode = sMode1561 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARENS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARENS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARENS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARENS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TBARENS.htm");
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
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
         Z180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
         A180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n252CliCod = false ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A180BarMaqCod = httpContext.cgiGet( "BARMAQCOD") ;
         A2759BarMaqGru = httpContext.cgiGet( "BARMAQGRU") ;
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A365DisDes = httpContext.cgiGet( "DISDES") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A129BarCod = 0 ;
            n129BarCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         }
         else
         {
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n129BarCod = false ;
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
            n132BarCodReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         }
         else
         {
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n132BarCodReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         }
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TBARENS");
         forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
         forbiddenHiddens.add("BarMaqGru", GXutil.rtrim( localUtil.format( A2759BarMaqGru, "")));
         forbiddenHiddens.add("BarMaqCod", GXutil.rtrim( localUtil.format( A180BarMaqCod, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("tbarens:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            AnyError = (short)(1) ;
            return  ;
         }
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
            n396EmprCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            n129BarCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            n132BarCodReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            n130BarCodPar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
            initAll1F312( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1561_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1561_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      disableAttributes1F312( ) ;
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

   public void confirm_1F30( )
   {
      beforeValidate1F312( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1F312( ) ;
         }
         else
         {
            checkExtendedTable1F312( ) ;
            if ( AnyError == 0 )
            {
               zm1F312( 3) ;
               zm1F312( 4) ;
            }
            closeExtendedTableCursors1F312( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode12 = Gx_mode ;
         confirm_1F31561( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode12 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1F30( ) ;
      }
   }

   public void confirm_1F31561( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1F31561( ) ;
         if ( ( nRcdExists_1561 != 0 ) || ( nIsMod_1561 != 0 ) )
         {
            getKey1F31561( ) ;
            if ( ( nRcdExists_1561 == 0 ) && ( nRcdDeleted_1561 == 0 ) )
            {
               if ( RcdFound1561 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1F31561( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1F31561( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1F31561( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "BARENSLIN_" + sGXsfl_45_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBarEnsLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1561 != 0 )
               {
                  if ( nRcdDeleted_1561 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1F31561( ) ;
                     load1F31561( ) ;
                     beforeValidate1F31561( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1F31561( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1561 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1F31561( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1F31561( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1F31561( ) ;
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
                  if ( nRcdDeleted_1561 == 0 )
                  {
                     GXCCtl = "BARENSLIN_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarEnsLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1561_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1561, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarEnsLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3940BarEnsLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarEnsGru_Internalname, GXutil.rtrim( A3941BarEnsGru)) ;
         httpContext.changePostValue( edtBarEnsGrLi_Internalname, GXutil.ltrim( localUtil.ntoc( A3942BarEnsGrLi, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarEnsTipo_Internalname, GXutil.rtrim( A3943BarEnsTipo)) ;
         httpContext.changePostValue( edtBarEnsMaxI_Internalname, GXutil.ltrim( localUtil.ntoc( A3944BarEnsMaxI, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarEnsNumI_Internalname, GXutil.ltrim( localUtil.ntoc( A3945BarEnsNumI, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarEnsEqui_Internalname, GXutil.rtrim( A4255BarEnsEqui)) ;
         httpContext.changePostValue( edtBarEnsFchG_Internalname, localUtil.format(A4256BarEnsFchG, "99/99/99")) ;
         httpContext.changePostValue( edtBarEnsEst_Internalname, GXutil.ltrim( localUtil.ntoc( A4257BarEnsEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarKgTiras_Internalname, GXutil.ltrim( localUtil.ntoc( A10712BarKgTiras, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarNbTiras_Internalname, GXutil.ltrim( localUtil.ntoc( A10711BarNbTiras, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarKgRtFr_Internalname, GXutil.ltrim( localUtil.ntoc( A12894BarKgRtFr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3940BarEnsLin_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z3940BarEnsLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3941BarEnsGru_"+sGXsfl_45_idx, GXutil.rtrim( Z3941BarEnsGru)) ;
         httpContext.changePostValue( "ZT_"+"Z3942BarEnsGrLi_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z3942BarEnsGrLi, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3943BarEnsTipo_"+sGXsfl_45_idx, GXutil.rtrim( Z3943BarEnsTipo)) ;
         httpContext.changePostValue( "ZT_"+"Z3944BarEnsMaxI_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z3944BarEnsMaxI, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3945BarEnsNumI_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z3945BarEnsNumI, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4255BarEnsEqui_"+sGXsfl_45_idx, GXutil.rtrim( Z4255BarEnsEqui)) ;
         httpContext.changePostValue( "ZT_"+"Z4256BarEnsFchG_"+sGXsfl_45_idx, localUtil.dtoc( Z4256BarEnsFchG, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z4257BarEnsEst_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z4257BarEnsEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10712BarKgTiras_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10712BarKgTiras, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10711BarNbTiras_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10711BarNbTiras, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12894BarKgRtFr_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z12894BarKgRtFr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1561_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1561, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1561_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1561, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1561_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1561, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1561 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1561_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1561_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARENSLIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARENSGRU_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsGru_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARENSGRLI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsGrLi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARENSTIPO_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsTipo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARENSMAXI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsMaxI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARENSNUMI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsNumI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARENSEQUI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsEqui_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARENSFCHG_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsFchG_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARENSEST_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARKGTIRAS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKgTiras_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNBTIRAS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNbTiras_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARKGRTFR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKgRtFr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1F30( )
   {
   }

   public void zm1F312( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z361DisCod = T01F35_A361DisCod[0] ;
            Z2759BarMaqGru = T01F35_A2759BarMaqGru[0] ;
            Z180BarMaqCod = T01F35_A180BarMaqCod[0] ;
            Z252CliCod = T01F35_A252CliCod[0] ;
         }
         else
         {
            Z361DisCod = A361DisCod ;
            Z2759BarMaqGru = A2759BarMaqGru ;
            Z180BarMaqCod = A180BarMaqCod ;
            Z252CliCod = A252CliCod ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z361DisCod = A361DisCod ;
         Z2759BarMaqGru = A2759BarMaqGru ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z180BarMaqCod = A180BarMaqCod ;
         Z252CliCod = A252CliCod ;
         Z365DisDes = A365DisDes ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
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
      A2759BarMaqGru = GXutil.substring( A180BarMaqCod, 1, 4) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
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

   public void load1F312( )
   {
      /* Using cursor T01F38 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A361DisCod = T01F38_A361DisCod[0] ;
         A2759BarMaqGru = T01F38_A2759BarMaqGru[0] ;
         A180BarMaqCod = T01F38_A180BarMaqCod[0] ;
         A407EmprNom = T01F38_A407EmprNom[0] ;
         n407EmprNom = T01F38_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A252CliCod = T01F38_A252CliCod[0] ;
         n252CliCod = T01F38_n252CliCod[0] ;
         A252CliCod = T01F38_A252CliCod[0] ;
         n252CliCod = T01F38_n252CliCod[0] ;
         A365DisDes = T01F38_A365DisDes[0] ;
         zm1F312( -2) ;
      }
      pr_default.close(6);
      onLoadActions1F312( ) ;
   }

   public void onLoadActions1F312( )
   {
      /* Using cursor T01F37 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      A252CliCod = T01F37_A252CliCod[0] ;
      n252CliCod = T01F37_n252CliCod[0] ;
      A365DisDes = T01F37_A365DisDes[0] ;
      pr_default.close(5);
   }

   public void checkExtendedTable1F312( )
   {
      nIsDirty_12 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01F36 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01F36_A407EmprNom[0] ;
      n407EmprNom = T01F36_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01F37 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A252CliCod = T01F37_A252CliCod[0] ;
      n252CliCod = T01F37_n252CliCod[0] ;
      A365DisDes = T01F37_A365DisDes[0] ;
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1F312( )
   {
      pr_default.close(4);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod )
   {
      /* Using cursor T01F39 */
      pr_default.execute(7, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01F39_A407EmprNom[0] ;
      n407EmprNom = T01F39_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_4( String A396EmprCod ,
                         int A361DisCod )
   {
      /* Using cursor T01F310 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A252CliCod = T01F310_A252CliCod[0] ;
      n252CliCod = T01F310_n252CliCod[0] ;
      A365DisDes = T01F310_A365DisDes[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A365DisDes))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1F312( )
   {
      /* Using cursor T01F311 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      else
      {
         RcdFound12 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01F35 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1F312( 2) ;
         RcdFound12 = (short)(1) ;
         A361DisCod = T01F35_A361DisCod[0] ;
         A2759BarMaqGru = T01F35_A2759BarMaqGru[0] ;
         A129BarCod = T01F35_A129BarCod[0] ;
         n129BarCod = T01F35_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01F35_A132BarCodReo[0] ;
         n132BarCodReo = T01F35_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01F35_A130BarCodPar[0] ;
         n130BarCodPar = T01F35_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A180BarMaqCod = T01F35_A180BarMaqCod[0] ;
         A396EmprCod = T01F35_A396EmprCod[0] ;
         n396EmprCod = T01F35_n396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01F35_A252CliCod[0] ;
         n252CliCod = T01F35_n252CliCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1F312( ) ;
         if ( AnyError == 1 )
         {
            RcdFound12 = (short)(0) ;
            initializeNonKey1F312( ) ;
         }
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound12 = (short)(0) ;
         initializeNonKey1F312( ) ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1F312( ) ;
      if ( RcdFound12 == 0 )
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
      RcdFound12 = (short)(0) ;
      /* Using cursor T01F312 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01F312_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01F312_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01F312_A129BarCod[0] < A129BarCod ) || ( T01F312_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01F312_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01F312_A132BarCodReo[0] < A132BarCodReo ) || ( T01F312_A132BarCodReo[0] == A132BarCodReo ) && ( T01F312_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01F312_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01F312_A130BarCodPar[0], A130BarCodPar) < 0 ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01F312_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01F312_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01F312_A129BarCod[0] > A129BarCod ) || ( T01F312_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01F312_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01F312_A132BarCodReo[0] > A132BarCodReo ) || ( T01F312_A132BarCodReo[0] == A132BarCodReo ) && ( T01F312_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01F312_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01F312_A130BarCodPar[0], A130BarCodPar) > 0 ) ) )
         {
            A396EmprCod = T01F312_A396EmprCod[0] ;
            n396EmprCod = T01F312_n396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01F312_A129BarCod[0] ;
            n129BarCod = T01F312_n129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01F312_A132BarCodReo[0] ;
            n132BarCodReo = T01F312_n132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01F312_A130BarCodPar[0] ;
            n130BarCodPar = T01F312_n130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound12 = (short)(0) ;
      /* Using cursor T01F313 */
      pr_default.execute(11, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01F313_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01F313_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01F313_A129BarCod[0] > A129BarCod ) || ( T01F313_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01F313_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01F313_A132BarCodReo[0] > A132BarCodReo ) || ( T01F313_A132BarCodReo[0] == A132BarCodReo ) && ( T01F313_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01F313_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01F313_A130BarCodPar[0], A130BarCodPar) > 0 ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01F313_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01F313_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01F313_A129BarCod[0] < A129BarCod ) || ( T01F313_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01F313_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01F313_A132BarCodReo[0] < A132BarCodReo ) || ( T01F313_A132BarCodReo[0] == A132BarCodReo ) && ( T01F313_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01F313_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01F313_A130BarCodPar[0], A130BarCodPar) < 0 ) ) )
         {
            A396EmprCod = T01F313_A396EmprCod[0] ;
            n396EmprCod = T01F313_n396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01F313_A129BarCod[0] ;
            n129BarCod = T01F313_n129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01F313_A132BarCodReo[0] ;
            n132BarCodReo = T01F313_n132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01F313_A130BarCodPar[0] ;
            n130BarCodPar = T01F313_n130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1F312( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1F312( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound12 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               n396EmprCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = Z129BarCod ;
               n129BarCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               n132BarCodReo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               n130BarCodPar = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
               update1F312( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1F312( ) ;
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
                  insert1F312( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = Z129BarCod ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
      getKey1F312( ) ;
      if ( RcdFound12 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            n396EmprCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = Z129BarCod ;
            n129BarCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = Z132BarCodReo ;
            n132BarCodReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = Z130BarCodPar ;
            n130BarCodPar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tbarens");
   }

   public void insert_check( )
   {
      confirm_1F30( ) ;
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
      if ( RcdFound12 == 0 )
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
      scanStart1F312( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1F312( ) ;
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
      if ( RcdFound12 == 0 )
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
      if ( RcdFound12 == 0 )
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
      scanStart1F312( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound12 != 0 )
         {
            scanNext1F312( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1F312( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1F312( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01F34 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z361DisCod != T01F34_A361DisCod[0] ) || ( GXutil.strcmp(Z2759BarMaqGru, T01F34_A2759BarMaqGru[0]) != 0 ) || ( GXutil.strcmp(Z180BarMaqCod, T01F34_A180BarMaqCod[0]) != 0 ) || ( Z252CliCod != T01F34_A252CliCod[0] ) )
         {
            if ( Z361DisCod != T01F34_A361DisCod[0] )
            {
               GXutil.writeLogln("tbarens:[seudo value changed for attri]"+"DisCod");
               GXutil.writeLogRaw("Old: ",Z361DisCod);
               GXutil.writeLogRaw("Current: ",T01F34_A361DisCod[0]);
            }
            if ( GXutil.strcmp(Z2759BarMaqGru, T01F34_A2759BarMaqGru[0]) != 0 )
            {
               GXutil.writeLogln("tbarens:[seudo value changed for attri]"+"BarMaqGru");
               GXutil.writeLogRaw("Old: ",Z2759BarMaqGru);
               GXutil.writeLogRaw("Current: ",T01F34_A2759BarMaqGru[0]);
            }
            if ( GXutil.strcmp(Z180BarMaqCod, T01F34_A180BarMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("tbarens:[seudo value changed for attri]"+"BarMaqCod");
               GXutil.writeLogRaw("Old: ",Z180BarMaqCod);
               GXutil.writeLogRaw("Current: ",T01F34_A180BarMaqCod[0]);
            }
            if ( Z252CliCod != T01F34_A252CliCod[0] )
            {
               GXutil.writeLogln("tbarens:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01F34_A252CliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARCAD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1F312( )
   {
      beforeValidate1F312( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F312( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1F312( 0) ;
         checkOptimisticConcurrency1F312( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1F312( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1F312( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01F314 */
                  pr_default.execute(12, new Object[] {A365DisDes, Integer.valueOf(A361DisCod), A2759BarMaqGru, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A180BarMaqCod, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(12) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11F312( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1F312( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1F30( ) ;
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
            load1F312( ) ;
         }
         endLevel1F312( ) ;
      }
      closeExtendedTableCursors1F312( ) ;
   }

   public void update1F312( )
   {
      beforeValidate1F312( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F312( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1F312( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1F312( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1F312( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01F315 */
                  pr_default.execute(13, new Object[] {A365DisDes, Integer.valueOf(A361DisCod), A2759BarMaqGru, A180BarMaqCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1F312( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char1[0] = A396EmprCod ;
                     GXv_int2[0] = A129BarCod ;
                     GXv_int3[0] = A132BarCodReo ;
                     GXv_char4[0] = A130BarCodPar ;
                     new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4) ;
                     tbarens_impl.this.A396EmprCod = GXv_char1[0] ;
                     tbarens_impl.this.A129BarCod = GXv_int2[0] ;
                     tbarens_impl.this.A132BarCodReo = GXv_int3[0] ;
                     tbarens_impl.this.A130BarCodPar = GXv_char4[0] ;
                     updateTablesN11F312( ) ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1F312( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1F30( ) ;
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
         endLevel1F312( ) ;
      }
      closeExtendedTableCursors1F312( ) ;
   }

   public void deferredUpdate1F312( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1F312( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1F312( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1F312( ) ;
         afterConfirm1F312( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1F312( ) ;
            if ( AnyError == 0 )
            {
               scanStart1F31561( ) ;
               while ( RcdFound1561 != 0 )
               {
                  getByPrimaryKey1F31561( ) ;
                  delete1F31561( ) ;
                  scanNext1F31561( ) ;
               }
               scanEnd1F31561( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01F316 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( AnyError == 0 )
                  {
                     updateTablesN11F312( ) ;
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound12 == 0 )
                        {
                           initAll1F312( ) ;
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
                        resetCaption1F30( ) ;
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
      sMode12 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1F312( ) ;
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1F312( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01F317 */
         pr_default.execute(15, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
         A407EmprNom = T01F317_A407EmprNom[0] ;
         n407EmprNom = T01F317_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(15);
         /* Using cursor T01F318 */
         pr_default.execute(16, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
         A252CliCod = T01F318_A252CliCod[0] ;
         n252CliCod = T01F318_n252CliCod[0] ;
         A365DisDes = T01F318_A365DisDes[0] ;
         pr_default.close(16);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01F319 */
         pr_default.execute(17, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "M Recibido Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01F320 */
         pr_default.execute(18, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cajas para Calipso", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01F321 */
         pr_default.execute(19, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01F322 */
         pr_default.execute(20, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tratamientos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01F323 */
         pr_default.execute(21, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01F324 */
         pr_default.execute(22, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Embellishment Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01F325 */
         pr_default.execute(23, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Print Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01F326 */
         pr_default.execute(24, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CONTRASTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01F327 */
         pr_default.execute(25, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST DE APARIENCIA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01F328 */
         pr_default.execute(26, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALJBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01F329 */
         pr_default.execute(27, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Incidencias Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01F330 */
         pr_default.execute(28, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "tinagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01F331 */
         pr_default.execute(29, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "estagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01F332 */
         pr_default.execute(30, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "creest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01F333 */
         pr_default.execute(31, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Planificacion ETAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01F334 */
         pr_default.execute(32, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AUDITORIA PIEZAS HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01F335 */
         pr_default.execute(33, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REFHDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01F336 */
         pr_default.execute(34, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "SOLIDEZ A SALIVA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01F337 */
         pr_default.execute(35, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01F338 */
         pr_default.execute(36, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BarPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01F339 */
         pr_default.execute(37, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01F340 */
         pr_default.execute(38, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENTSEC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01F341 */
         pr_default.execute(39, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Relación Lineas de Pedido/HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01F342 */
         pr_default.execute(40, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Separación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01F343 */
         pr_default.execute(41, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Grabado de Shablones", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01F344 */
         pr_default.execute(42, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HDRACA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01F345 */
         pr_default.execute(43, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PalSalRx", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01F346 */
         pr_default.execute(44, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01F347 */
         pr_default.execute(45, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALEXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01F348 */
         pr_default.execute(46, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FOAMIZADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01F349 */
         pr_default.execute(47, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PEGADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01F350 */
         pr_default.execute(48, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTRASP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01F351 */
         pr_default.execute(49, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSUBLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01F352 */
         pr_default.execute(50, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLLU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01F353 */
         pr_default.execute(51, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFRICC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01F354 */
         pr_default.execute(52, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPILLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01F355 */
         pr_default.execute(53, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISANY", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01F356 */
         pr_default.execute(54, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PLAPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01F357 */
         pr_default.execute(55, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMETPI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01F358 */
         pr_default.execute(56, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01F359 */
         pr_default.execute(57, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T01F360 */
         pr_default.execute(58, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARTER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T01F361 */
         pr_default.execute(59, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LREXHD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T01F362 */
         pr_default.execute(60, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXMVH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T01F363 */
         pr_default.execute(61, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T01F364 */
         pr_default.execute(62, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPLATINLevel1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T01F365 */
         pr_default.execute(63, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T01F366 */
         pr_default.execute(64, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T01F367 */
         pr_default.execute(65, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T01F368 */
         pr_default.execute(66, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T01F369 */
         pr_default.execute(67, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T01F370 */
         pr_default.execute(68, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T01F371 */
         pr_default.execute(69, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESDIM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T01F372 */
         pr_default.execute(70, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T01F373 */
         pr_default.execute(71, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T01F374 */
         pr_default.execute(72, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T01F375 */
         pr_default.execute(73, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LHIPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T01F376 */
         pr_default.execute(74, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T01F377 */
         pr_default.execute(75, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T01F378 */
         pr_default.execute(76, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T01F379 */
         pr_default.execute(77, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T01F380 */
         pr_default.execute(78, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARAGR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
      }
   }

   public void processNestedLevel1F31561( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1F31561( ) ;
         if ( ( nRcdExists_1561 != 0 ) || ( nIsMod_1561 != 0 ) )
         {
            standaloneNotModal1F31561( ) ;
            getKey1F31561( ) ;
            if ( ( nRcdExists_1561 == 0 ) && ( nRcdDeleted_1561 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1F31561( ) ;
            }
            else
            {
               if ( RcdFound1561 != 0 )
               {
                  if ( ( nRcdDeleted_1561 != 0 ) && ( nRcdExists_1561 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1F31561( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1561 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1F31561( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1561 == 0 )
                  {
                     GXCCtl = "BARENSLIN_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarEnsLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1561_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1561, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarEnsLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3940BarEnsLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarEnsGru_Internalname, GXutil.rtrim( A3941BarEnsGru)) ;
         httpContext.changePostValue( edtBarEnsGrLi_Internalname, GXutil.ltrim( localUtil.ntoc( A3942BarEnsGrLi, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarEnsTipo_Internalname, GXutil.rtrim( A3943BarEnsTipo)) ;
         httpContext.changePostValue( edtBarEnsMaxI_Internalname, GXutil.ltrim( localUtil.ntoc( A3944BarEnsMaxI, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarEnsNumI_Internalname, GXutil.ltrim( localUtil.ntoc( A3945BarEnsNumI, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarEnsEqui_Internalname, GXutil.rtrim( A4255BarEnsEqui)) ;
         httpContext.changePostValue( edtBarEnsFchG_Internalname, localUtil.format(A4256BarEnsFchG, "99/99/99")) ;
         httpContext.changePostValue( edtBarEnsEst_Internalname, GXutil.ltrim( localUtil.ntoc( A4257BarEnsEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarKgTiras_Internalname, GXutil.ltrim( localUtil.ntoc( A10712BarKgTiras, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarNbTiras_Internalname, GXutil.ltrim( localUtil.ntoc( A10711BarNbTiras, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarKgRtFr_Internalname, GXutil.ltrim( localUtil.ntoc( A12894BarKgRtFr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3940BarEnsLin_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z3940BarEnsLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3941BarEnsGru_"+sGXsfl_45_idx, GXutil.rtrim( Z3941BarEnsGru)) ;
         httpContext.changePostValue( "ZT_"+"Z3942BarEnsGrLi_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z3942BarEnsGrLi, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3943BarEnsTipo_"+sGXsfl_45_idx, GXutil.rtrim( Z3943BarEnsTipo)) ;
         httpContext.changePostValue( "ZT_"+"Z3944BarEnsMaxI_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z3944BarEnsMaxI, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3945BarEnsNumI_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z3945BarEnsNumI, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4255BarEnsEqui_"+sGXsfl_45_idx, GXutil.rtrim( Z4255BarEnsEqui)) ;
         httpContext.changePostValue( "ZT_"+"Z4256BarEnsFchG_"+sGXsfl_45_idx, localUtil.dtoc( Z4256BarEnsFchG, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z4257BarEnsEst_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z4257BarEnsEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10712BarKgTiras_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10712BarKgTiras, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10711BarNbTiras_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10711BarNbTiras, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12894BarKgRtFr_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z12894BarKgRtFr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1561_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1561, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1561_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1561, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1561_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1561, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1561 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1561_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1561_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARENSLIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARENSGRU_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsGru_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARENSGRLI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsGrLi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARENSTIPO_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsTipo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARENSMAXI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsMaxI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARENSNUMI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsNumI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARENSEQUI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsEqui_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARENSFCHG_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsFchG_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARENSEST_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARKGTIRAS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKgTiras_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNBTIRAS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNbTiras_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARKGRTFR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKgRtFr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1F31561( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1561 = (short)(0) ;
      nIsMod_1561 = (short)(0) ;
      nRcdDeleted_1561 = (short)(0) ;
   }

   public void processLevel1F312( )
   {
      /* Save parent mode. */
      sMode12 = Gx_mode ;
      processNestedLevel1F31561( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void updateTablesN11F312( )
   {
      /* Using cursor T01F381 */
      pr_default.execute(79, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCPRO");
   }

   public void endLevel1F312( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1F312( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tbarens");
         if ( AnyError == 0 )
         {
            confirmValues1F30( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tbarens");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1F312( )
   {
      /* Using cursor T01F382 */
      pr_default.execute(80);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(80) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A396EmprCod = T01F382_A396EmprCod[0] ;
         n396EmprCod = T01F382_n396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01F382_A129BarCod[0] ;
         n129BarCod = T01F382_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01F382_A132BarCodReo[0] ;
         n132BarCodReo = T01F382_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01F382_A130BarCodPar[0] ;
         n130BarCodPar = T01F382_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1F312( )
   {
      /* Scan next routine */
      pr_default.readNext(80);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(80) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A396EmprCod = T01F382_A396EmprCod[0] ;
         n396EmprCod = T01F382_n396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01F382_A129BarCod[0] ;
         n129BarCod = T01F382_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01F382_A132BarCodReo[0] ;
         n132BarCodReo = T01F382_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01F382_A130BarCodPar[0] ;
         n130BarCodPar = T01F382_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
   }

   public void scanEnd1F312( )
   {
      pr_default.close(80);
   }

   public void afterConfirm1F312( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1F312( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1F312( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1F312( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1F312( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1F312( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1F312( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zm1F31561( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3941BarEnsGru = T01F33_A3941BarEnsGru[0] ;
            Z3942BarEnsGrLi = T01F33_A3942BarEnsGrLi[0] ;
            Z3943BarEnsTipo = T01F33_A3943BarEnsTipo[0] ;
            Z3944BarEnsMaxI = T01F33_A3944BarEnsMaxI[0] ;
            Z3945BarEnsNumI = T01F33_A3945BarEnsNumI[0] ;
            Z4255BarEnsEqui = T01F33_A4255BarEnsEqui[0] ;
            Z4256BarEnsFchG = T01F33_A4256BarEnsFchG[0] ;
            Z4257BarEnsEst = T01F33_A4257BarEnsEst[0] ;
            Z10712BarKgTiras = T01F33_A10712BarKgTiras[0] ;
            Z10711BarNbTiras = T01F33_A10711BarNbTiras[0] ;
            Z12894BarKgRtFr = T01F33_A12894BarKgRtFr[0] ;
         }
         else
         {
            Z3941BarEnsGru = A3941BarEnsGru ;
            Z3942BarEnsGrLi = A3942BarEnsGrLi ;
            Z3943BarEnsTipo = A3943BarEnsTipo ;
            Z3944BarEnsMaxI = A3944BarEnsMaxI ;
            Z3945BarEnsNumI = A3945BarEnsNumI ;
            Z4255BarEnsEqui = A4255BarEnsEqui ;
            Z4256BarEnsFchG = A4256BarEnsFchG ;
            Z4257BarEnsEst = A4257BarEnsEst ;
            Z10712BarKgTiras = A10712BarKgTiras ;
            Z10711BarNbTiras = A10711BarNbTiras ;
            Z12894BarKgRtFr = A12894BarKgRtFr ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z3940BarEnsLin = A3940BarEnsLin ;
         Z3941BarEnsGru = A3941BarEnsGru ;
         Z3942BarEnsGrLi = A3942BarEnsGrLi ;
         Z3943BarEnsTipo = A3943BarEnsTipo ;
         Z3944BarEnsMaxI = A3944BarEnsMaxI ;
         Z3945BarEnsNumI = A3945BarEnsNumI ;
         Z4255BarEnsEqui = A4255BarEnsEqui ;
         Z4256BarEnsFchG = A4256BarEnsFchG ;
         Z4257BarEnsEst = A4257BarEnsEst ;
         Z10712BarKgTiras = A10712BarKgTiras ;
         Z10711BarNbTiras = A10711BarNbTiras ;
         Z12894BarKgRtFr = A12894BarKgRtFr ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1F31561( )
   {
   }

   public void standaloneModal1F31561( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarEnsLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarEnsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnsLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtBarEnsLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarEnsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnsLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
   }

   public void load1F31561( )
   {
      /* Using cursor T01F383 */
      pr_default.execute(81, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A3940BarEnsLin)});
      if ( (pr_default.getStatus(81) != 101) )
      {
         RcdFound1561 = (short)(1) ;
         A3941BarEnsGru = T01F383_A3941BarEnsGru[0] ;
         n3941BarEnsGru = T01F383_n3941BarEnsGru[0] ;
         A3942BarEnsGrLi = T01F383_A3942BarEnsGrLi[0] ;
         n3942BarEnsGrLi = T01F383_n3942BarEnsGrLi[0] ;
         A3943BarEnsTipo = T01F383_A3943BarEnsTipo[0] ;
         n3943BarEnsTipo = T01F383_n3943BarEnsTipo[0] ;
         A3944BarEnsMaxI = T01F383_A3944BarEnsMaxI[0] ;
         n3944BarEnsMaxI = T01F383_n3944BarEnsMaxI[0] ;
         A3945BarEnsNumI = T01F383_A3945BarEnsNumI[0] ;
         n3945BarEnsNumI = T01F383_n3945BarEnsNumI[0] ;
         A4255BarEnsEqui = T01F383_A4255BarEnsEqui[0] ;
         n4255BarEnsEqui = T01F383_n4255BarEnsEqui[0] ;
         A4256BarEnsFchG = T01F383_A4256BarEnsFchG[0] ;
         n4256BarEnsFchG = T01F383_n4256BarEnsFchG[0] ;
         A4257BarEnsEst = T01F383_A4257BarEnsEst[0] ;
         n4257BarEnsEst = T01F383_n4257BarEnsEst[0] ;
         A10712BarKgTiras = T01F383_A10712BarKgTiras[0] ;
         n10712BarKgTiras = T01F383_n10712BarKgTiras[0] ;
         A10711BarNbTiras = T01F383_A10711BarNbTiras[0] ;
         n10711BarNbTiras = T01F383_n10711BarNbTiras[0] ;
         A12894BarKgRtFr = T01F383_A12894BarKgRtFr[0] ;
         n12894BarKgRtFr = T01F383_n12894BarKgRtFr[0] ;
         zm1F31561( -5) ;
      }
      pr_default.close(81);
      onLoadActions1F31561( ) ;
   }

   public void onLoadActions1F31561( )
   {
   }

   public void checkExtendedTable1F31561( )
   {
      nIsDirty_1561 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1F31561( ) ;
   }

   public void closeExtendedTableCursors1F31561( )
   {
   }

   public void enableDisable1F31561( )
   {
   }

   public void getKey1F31561( )
   {
      /* Using cursor T01F384 */
      pr_default.execute(82, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A3940BarEnsLin)});
      if ( (pr_default.getStatus(82) != 101) )
      {
         RcdFound1561 = (short)(1) ;
      }
      else
      {
         RcdFound1561 = (short)(0) ;
      }
      pr_default.close(82);
   }

   public void getByPrimaryKey1F31561( )
   {
      /* Using cursor T01F33 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A3940BarEnsLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1F31561( 5) ;
         RcdFound1561 = (short)(1) ;
         initializeNonKey1F31561( ) ;
         A3940BarEnsLin = T01F33_A3940BarEnsLin[0] ;
         A3941BarEnsGru = T01F33_A3941BarEnsGru[0] ;
         n3941BarEnsGru = T01F33_n3941BarEnsGru[0] ;
         A3942BarEnsGrLi = T01F33_A3942BarEnsGrLi[0] ;
         n3942BarEnsGrLi = T01F33_n3942BarEnsGrLi[0] ;
         A3943BarEnsTipo = T01F33_A3943BarEnsTipo[0] ;
         n3943BarEnsTipo = T01F33_n3943BarEnsTipo[0] ;
         A3944BarEnsMaxI = T01F33_A3944BarEnsMaxI[0] ;
         n3944BarEnsMaxI = T01F33_n3944BarEnsMaxI[0] ;
         A3945BarEnsNumI = T01F33_A3945BarEnsNumI[0] ;
         n3945BarEnsNumI = T01F33_n3945BarEnsNumI[0] ;
         A4255BarEnsEqui = T01F33_A4255BarEnsEqui[0] ;
         n4255BarEnsEqui = T01F33_n4255BarEnsEqui[0] ;
         A4256BarEnsFchG = T01F33_A4256BarEnsFchG[0] ;
         n4256BarEnsFchG = T01F33_n4256BarEnsFchG[0] ;
         A4257BarEnsEst = T01F33_A4257BarEnsEst[0] ;
         n4257BarEnsEst = T01F33_n4257BarEnsEst[0] ;
         A10712BarKgTiras = T01F33_A10712BarKgTiras[0] ;
         n10712BarKgTiras = T01F33_n10712BarKgTiras[0] ;
         A10711BarNbTiras = T01F33_A10711BarNbTiras[0] ;
         n10711BarNbTiras = T01F33_n10711BarNbTiras[0] ;
         A12894BarKgRtFr = T01F33_A12894BarKgRtFr[0] ;
         n12894BarKgRtFr = T01F33_n12894BarKgRtFr[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z3940BarEnsLin = A3940BarEnsLin ;
         sMode1561 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1F31561( ) ;
         load1F31561( ) ;
         Gx_mode = sMode1561 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1561 = (short)(0) ;
         initializeNonKey1F31561( ) ;
         sMode1561 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1F31561( ) ;
         Gx_mode = sMode1561 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1F31561( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1F31561( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01F32 */
         pr_default.execute(0, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A3940BarEnsLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARENS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z3941BarEnsGru, T01F32_A3941BarEnsGru[0]) != 0 ) || ( Z3942BarEnsGrLi != T01F32_A3942BarEnsGrLi[0] ) || ( GXutil.strcmp(Z3943BarEnsTipo, T01F32_A3943BarEnsTipo[0]) != 0 ) || ( Z3944BarEnsMaxI != T01F32_A3944BarEnsMaxI[0] ) || ( Z3945BarEnsNumI != T01F32_A3945BarEnsNumI[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4255BarEnsEqui, T01F32_A4255BarEnsEqui[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z4256BarEnsFchG), GXutil.resetTime(T01F32_A4256BarEnsFchG[0])) ) || ( Z4257BarEnsEst != T01F32_A4257BarEnsEst[0] ) || ( DecimalUtil.compareTo(Z10712BarKgTiras, T01F32_A10712BarKgTiras[0]) != 0 ) || ( Z10711BarNbTiras != T01F32_A10711BarNbTiras[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z12894BarKgRtFr, T01F32_A12894BarKgRtFr[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z3941BarEnsGru, T01F32_A3941BarEnsGru[0]) != 0 )
            {
               GXutil.writeLogln("tbarens:[seudo value changed for attri]"+"BarEnsGru");
               GXutil.writeLogRaw("Old: ",Z3941BarEnsGru);
               GXutil.writeLogRaw("Current: ",T01F32_A3941BarEnsGru[0]);
            }
            if ( Z3942BarEnsGrLi != T01F32_A3942BarEnsGrLi[0] )
            {
               GXutil.writeLogln("tbarens:[seudo value changed for attri]"+"BarEnsGrLi");
               GXutil.writeLogRaw("Old: ",Z3942BarEnsGrLi);
               GXutil.writeLogRaw("Current: ",T01F32_A3942BarEnsGrLi[0]);
            }
            if ( GXutil.strcmp(Z3943BarEnsTipo, T01F32_A3943BarEnsTipo[0]) != 0 )
            {
               GXutil.writeLogln("tbarens:[seudo value changed for attri]"+"BarEnsTipo");
               GXutil.writeLogRaw("Old: ",Z3943BarEnsTipo);
               GXutil.writeLogRaw("Current: ",T01F32_A3943BarEnsTipo[0]);
            }
            if ( Z3944BarEnsMaxI != T01F32_A3944BarEnsMaxI[0] )
            {
               GXutil.writeLogln("tbarens:[seudo value changed for attri]"+"BarEnsMaxI");
               GXutil.writeLogRaw("Old: ",Z3944BarEnsMaxI);
               GXutil.writeLogRaw("Current: ",T01F32_A3944BarEnsMaxI[0]);
            }
            if ( Z3945BarEnsNumI != T01F32_A3945BarEnsNumI[0] )
            {
               GXutil.writeLogln("tbarens:[seudo value changed for attri]"+"BarEnsNumI");
               GXutil.writeLogRaw("Old: ",Z3945BarEnsNumI);
               GXutil.writeLogRaw("Current: ",T01F32_A3945BarEnsNumI[0]);
            }
            if ( GXutil.strcmp(Z4255BarEnsEqui, T01F32_A4255BarEnsEqui[0]) != 0 )
            {
               GXutil.writeLogln("tbarens:[seudo value changed for attri]"+"BarEnsEqui");
               GXutil.writeLogRaw("Old: ",Z4255BarEnsEqui);
               GXutil.writeLogRaw("Current: ",T01F32_A4255BarEnsEqui[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4256BarEnsFchG), GXutil.resetTime(T01F32_A4256BarEnsFchG[0])) ) )
            {
               GXutil.writeLogln("tbarens:[seudo value changed for attri]"+"BarEnsFchG");
               GXutil.writeLogRaw("Old: ",Z4256BarEnsFchG);
               GXutil.writeLogRaw("Current: ",T01F32_A4256BarEnsFchG[0]);
            }
            if ( Z4257BarEnsEst != T01F32_A4257BarEnsEst[0] )
            {
               GXutil.writeLogln("tbarens:[seudo value changed for attri]"+"BarEnsEst");
               GXutil.writeLogRaw("Old: ",Z4257BarEnsEst);
               GXutil.writeLogRaw("Current: ",T01F32_A4257BarEnsEst[0]);
            }
            if ( DecimalUtil.compareTo(Z10712BarKgTiras, T01F32_A10712BarKgTiras[0]) != 0 )
            {
               GXutil.writeLogln("tbarens:[seudo value changed for attri]"+"BarKgTiras");
               GXutil.writeLogRaw("Old: ",Z10712BarKgTiras);
               GXutil.writeLogRaw("Current: ",T01F32_A10712BarKgTiras[0]);
            }
            if ( Z10711BarNbTiras != T01F32_A10711BarNbTiras[0] )
            {
               GXutil.writeLogln("tbarens:[seudo value changed for attri]"+"BarNbTiras");
               GXutil.writeLogRaw("Old: ",Z10711BarNbTiras);
               GXutil.writeLogRaw("Current: ",T01F32_A10711BarNbTiras[0]);
            }
            if ( DecimalUtil.compareTo(Z12894BarKgRtFr, T01F32_A12894BarKgRtFr[0]) != 0 )
            {
               GXutil.writeLogln("tbarens:[seudo value changed for attri]"+"BarKgRtFr");
               GXutil.writeLogRaw("Old: ",Z12894BarKgRtFr);
               GXutil.writeLogRaw("Current: ",T01F32_A12894BarKgRtFr[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARENS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1F31561( )
   {
      beforeValidate1F31561( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F31561( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1F31561( 0) ;
         checkOptimisticConcurrency1F31561( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1F31561( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1F31561( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01F385 */
                  pr_default.execute(83, new Object[] {Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A3940BarEnsLin), Boolean.valueOf(n3941BarEnsGru), A3941BarEnsGru, Boolean.valueOf(n3942BarEnsGrLi), Short.valueOf(A3942BarEnsGrLi), Boolean.valueOf(n3943BarEnsTipo), A3943BarEnsTipo, Boolean.valueOf(n3944BarEnsMaxI), Byte.valueOf(A3944BarEnsMaxI), Boolean.valueOf(n3945BarEnsNumI), Byte.valueOf(A3945BarEnsNumI), Boolean.valueOf(n4255BarEnsEqui), A4255BarEnsEqui, Boolean.valueOf(n4256BarEnsFchG), A4256BarEnsFchG, Boolean.valueOf(n4257BarEnsEst), Byte.valueOf(A4257BarEnsEst), Boolean.valueOf(n10712BarKgTiras), A10712BarKgTiras, Boolean.valueOf(n10711BarNbTiras), Short.valueOf(A10711BarNbTiras), Boolean.valueOf(n12894BarKgRtFr), A12894BarKgRtFr, Boolean.valueOf(n396EmprCod), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARENS");
                  if ( (pr_default.getStatus(83) == 1) )
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
            load1F31561( ) ;
         }
         endLevel1F31561( ) ;
      }
      closeExtendedTableCursors1F31561( ) ;
   }

   public void update1F31561( )
   {
      beforeValidate1F31561( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F31561( ) ;
      }
      if ( ( nIsMod_1561 != 0 ) || ( nIsDirty_1561 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1F31561( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1F31561( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1F31561( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01F386 */
                     pr_default.execute(84, new Object[] {Boolean.valueOf(n3941BarEnsGru), A3941BarEnsGru, Boolean.valueOf(n3942BarEnsGrLi), Short.valueOf(A3942BarEnsGrLi), Boolean.valueOf(n3943BarEnsTipo), A3943BarEnsTipo, Boolean.valueOf(n3944BarEnsMaxI), Byte.valueOf(A3944BarEnsMaxI), Boolean.valueOf(n3945BarEnsNumI), Byte.valueOf(A3945BarEnsNumI), Boolean.valueOf(n4255BarEnsEqui), A4255BarEnsEqui, Boolean.valueOf(n4256BarEnsFchG), A4256BarEnsFchG, Boolean.valueOf(n4257BarEnsEst), Byte.valueOf(A4257BarEnsEst), Boolean.valueOf(n10712BarKgTiras), A10712BarKgTiras, Boolean.valueOf(n10711BarNbTiras), Short.valueOf(A10711BarNbTiras), Boolean.valueOf(n12894BarKgRtFr), A12894BarKgRtFr, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A3940BarEnsLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARENS");
                     if ( (pr_default.getStatus(84) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARENS"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1F31561( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int2[0] = A129BarCod ;
                        GXv_int3[0] = A132BarCodReo ;
                        GXv_char1[0] = A130BarCodPar ;
                        new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int2, GXv_int3, GXv_char1) ;
                        tbarens_impl.this.A396EmprCod = GXv_char4[0] ;
                        tbarens_impl.this.A129BarCod = GXv_int2[0] ;
                        tbarens_impl.this.A132BarCodReo = GXv_int3[0] ;
                        tbarens_impl.this.A130BarCodPar = GXv_char1[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1F31561( ) ;
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
            endLevel1F31561( ) ;
         }
      }
      closeExtendedTableCursors1F31561( ) ;
   }

   public void deferredUpdate1F31561( )
   {
   }

   public void delete1F31561( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1F31561( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1F31561( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1F31561( ) ;
         afterConfirm1F31561( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1F31561( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01F387 */
               pr_default.execute(85, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A3940BarEnsLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARENS");
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
      sMode1561 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1F31561( ) ;
      Gx_mode = sMode1561 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1F31561( )
   {
      standaloneModal1F31561( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1F31561( )
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

   public void scanStart1F31561( )
   {
      /* Scan By routine */
      /* Using cursor T01F388 */
      pr_default.execute(86, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      RcdFound1561 = (short)(0) ;
      if ( (pr_default.getStatus(86) != 101) )
      {
         RcdFound1561 = (short)(1) ;
         A3940BarEnsLin = T01F388_A3940BarEnsLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1F31561( )
   {
      /* Scan next routine */
      pr_default.readNext(86);
      RcdFound1561 = (short)(0) ;
      if ( (pr_default.getStatus(86) != 101) )
      {
         RcdFound1561 = (short)(1) ;
         A3940BarEnsLin = T01F388_A3940BarEnsLin[0] ;
      }
   }

   public void scanEnd1F31561( )
   {
      pr_default.close(86);
   }

   public void afterConfirm1F31561( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1F31561( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1F31561( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1F31561( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1F31561( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1F31561( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1F31561( )
   {
      edtBarEnsLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEnsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnsLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBarEnsGru_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEnsGru_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnsGru_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBarEnsGrLi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEnsGrLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnsGrLi_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBarEnsTipo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEnsTipo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnsTipo_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBarEnsMaxI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEnsMaxI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnsMaxI_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBarEnsNumI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEnsNumI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnsNumI_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBarEnsEqui_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEnsEqui_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnsEqui_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBarEnsFchG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEnsFchG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnsFchG_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBarEnsEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEnsEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnsEst_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBarKgTiras_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKgTiras_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgTiras_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBarNbTiras_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNbTiras_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNbTiras_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBarKgRtFr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKgRtFr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgRtFr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void send_integrity_lvl_hashes1F31561( )
   {
   }

   public void send_integrity_lvl_hashes1F312( )
   {
   }

   public void subsflControlProps_451561( )
   {
      edtavnRcdDeleted_1561_Internalname = "vNRCDDELETED_1561_"+sGXsfl_45_idx ;
      edtBarEnsLin_Internalname = "BARENSLIN_"+sGXsfl_45_idx ;
      edtBarEnsGru_Internalname = "BARENSGRU_"+sGXsfl_45_idx ;
      edtBarEnsGrLi_Internalname = "BARENSGRLI_"+sGXsfl_45_idx ;
      edtBarEnsTipo_Internalname = "BARENSTIPO_"+sGXsfl_45_idx ;
      edtBarEnsMaxI_Internalname = "BARENSMAXI_"+sGXsfl_45_idx ;
      edtBarEnsNumI_Internalname = "BARENSNUMI_"+sGXsfl_45_idx ;
      edtBarEnsEqui_Internalname = "BARENSEQUI_"+sGXsfl_45_idx ;
      edtBarEnsFchG_Internalname = "BARENSFCHG_"+sGXsfl_45_idx ;
      edtBarEnsEst_Internalname = "BARENSEST_"+sGXsfl_45_idx ;
      edtBarKgTiras_Internalname = "BARKGTIRAS_"+sGXsfl_45_idx ;
      edtBarNbTiras_Internalname = "BARNBTIRAS_"+sGXsfl_45_idx ;
      edtBarKgRtFr_Internalname = "BARKGRTFR_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_451561( )
   {
      edtavnRcdDeleted_1561_Internalname = "vNRCDDELETED_1561_"+sGXsfl_45_fel_idx ;
      edtBarEnsLin_Internalname = "BARENSLIN_"+sGXsfl_45_fel_idx ;
      edtBarEnsGru_Internalname = "BARENSGRU_"+sGXsfl_45_fel_idx ;
      edtBarEnsGrLi_Internalname = "BARENSGRLI_"+sGXsfl_45_fel_idx ;
      edtBarEnsTipo_Internalname = "BARENSTIPO_"+sGXsfl_45_fel_idx ;
      edtBarEnsMaxI_Internalname = "BARENSMAXI_"+sGXsfl_45_fel_idx ;
      edtBarEnsNumI_Internalname = "BARENSNUMI_"+sGXsfl_45_fel_idx ;
      edtBarEnsEqui_Internalname = "BARENSEQUI_"+sGXsfl_45_fel_idx ;
      edtBarEnsFchG_Internalname = "BARENSFCHG_"+sGXsfl_45_fel_idx ;
      edtBarEnsEst_Internalname = "BARENSEST_"+sGXsfl_45_fel_idx ;
      edtBarKgTiras_Internalname = "BARKGTIRAS_"+sGXsfl_45_fel_idx ;
      edtBarNbTiras_Internalname = "BARNBTIRAS_"+sGXsfl_45_fel_idx ;
      edtBarKgRtFr_Internalname = "BARKGRTFR_"+sGXsfl_45_fel_idx ;
   }

   public void addRow1F31561( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451561( ) ;
      sendRow1F31561( ) ;
   }

   public void sendRow1F31561( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1561_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1561_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1561, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1561_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1561), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1561), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1561_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1561_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1561_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarEnsLin_Internalname,GXutil.ltrim( localUtil.ntoc( A3940BarEnsLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3940BarEnsLin), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarEnsLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarEnsLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1561_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarEnsGru_Internalname,GXutil.rtrim( A3941BarEnsGru),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarEnsGru_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarEnsGru_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1561_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarEnsGrLi_Internalname,GXutil.ltrim( localUtil.ntoc( A3942BarEnsGrLi, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarEnsGrLi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3942BarEnsGrLi), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3942BarEnsGrLi), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarEnsGrLi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarEnsGrLi_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1561_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarEnsTipo_Internalname,GXutil.rtrim( A3943BarEnsTipo),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarEnsTipo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarEnsTipo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1561_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarEnsMaxI_Internalname,GXutil.ltrim( localUtil.ntoc( A3944BarEnsMaxI, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarEnsMaxI_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3944BarEnsMaxI), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3944BarEnsMaxI), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarEnsMaxI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarEnsMaxI_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1561_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarEnsNumI_Internalname,GXutil.ltrim( localUtil.ntoc( A3945BarEnsNumI, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarEnsNumI_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3945BarEnsNumI), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3945BarEnsNumI), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarEnsNumI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarEnsNumI_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1561_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarEnsEqui_Internalname,GXutil.rtrim( A4255BarEnsEqui),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarEnsEqui_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarEnsEqui_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1561_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarEnsFchG_Internalname,localUtil.format(A4256BarEnsFchG, "99/99/99"),localUtil.format( A4256BarEnsFchG, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarEnsFchG_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarEnsFchG_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1561_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarEnsEst_Internalname,GXutil.ltrim( localUtil.ntoc( A4257BarEnsEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarEnsEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4257BarEnsEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A4257BarEnsEst), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarEnsEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarEnsEst_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1561_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKgTiras_Internalname,GXutil.ltrim( localUtil.ntoc( A10712BarKgTiras, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarKgTiras_Enabled!=0) ? localUtil.format( A10712BarKgTiras, "ZZZZZ9.99") : localUtil.format( A10712BarKgTiras, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarKgTiras_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarKgTiras_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1561_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNbTiras_Internalname,GXutil.ltrim( localUtil.ntoc( A10711BarNbTiras, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarNbTiras_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10711BarNbTiras), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10711BarNbTiras), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNbTiras_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarNbTiras_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1561_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKgRtFr_Internalname,GXutil.ltrim( localUtil.ntoc( A12894BarKgRtFr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarKgRtFr_Enabled!=0) ? localUtil.format( A12894BarKgRtFr, "ZZZZZ9.99") : localUtil.format( A12894BarKgRtFr, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarKgRtFr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarKgRtFr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1F31561( ) ;
      GXCCtl = "Z3940BarEnsLin_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3940BarEnsLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3941BarEnsGru_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3941BarEnsGru));
      GXCCtl = "Z3942BarEnsGrLi_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3942BarEnsGrLi, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3943BarEnsTipo_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3943BarEnsTipo));
      GXCCtl = "Z3944BarEnsMaxI_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3944BarEnsMaxI, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3945BarEnsNumI_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3945BarEnsNumI, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4255BarEnsEqui_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4255BarEnsEqui));
      GXCCtl = "Z4256BarEnsFchG_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z4256BarEnsFchG, 0, "/"));
      GXCCtl = "Z4257BarEnsEst_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4257BarEnsEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10712BarKgTiras_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10712BarKgTiras, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10711BarNbTiras_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10711BarNbTiras, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12894BarKgRtFr_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12894BarKgRtFr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1561_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1561, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1561_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1561, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1561_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1561, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1561_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1561_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARENSLIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARENSGRU_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsGru_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARENSGRLI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsGrLi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARENSTIPO_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsTipo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARENSMAXI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsMaxI_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARENSNUMI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsNumI_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARENSEQUI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsEqui_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARENSFCHG_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsFchG_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARENSEST_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARKGTIRAS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKgTiras_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNBTIRAS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNbTiras_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARKGRTFR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKgRtFr_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1F31561( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451561( ) ;
      edtavnRcdDeleted_1561_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1561_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarEnsLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARENSLIN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarEnsGru_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARENSGRU_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarEnsGrLi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARENSGRLI_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarEnsTipo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARENSTIPO_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarEnsMaxI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARENSMAXI_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarEnsNumI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARENSNUMI_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarEnsEqui_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARENSEQUI_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarEnsFchG_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARENSFCHG_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarEnsEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARENSEST_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarKgTiras_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARKGTIRAS_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarNbTiras_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNBTIRAS_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarKgRtFr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARKGRTFR_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1561_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1561_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1561");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1561_Internalname ;
         wbErr = true ;
         nRcdDeleted_1561 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1561 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1561_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarEnsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarEnsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "BARENSLIN_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarEnsLin_Internalname ;
         wbErr = true ;
         A3940BarEnsLin = (short)(0) ;
      }
      else
      {
         A3940BarEnsLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarEnsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A3941BarEnsGru = httpContext.cgiGet( edtBarEnsGru_Internalname) ;
      n3941BarEnsGru = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarEnsGrLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarEnsGrLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "BARENSGRLI_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarEnsGrLi_Internalname ;
         wbErr = true ;
         A3942BarEnsGrLi = (short)(0) ;
         n3942BarEnsGrLi = false ;
      }
      else
      {
         A3942BarEnsGrLi = (short)(localUtil.ctol( httpContext.cgiGet( edtBarEnsGrLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3942BarEnsGrLi = false ;
      }
      A3943BarEnsTipo = httpContext.cgiGet( edtBarEnsTipo_Internalname) ;
      n3943BarEnsTipo = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarEnsMaxI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarEnsMaxI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "BARENSMAXI_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarEnsMaxI_Internalname ;
         wbErr = true ;
         A3944BarEnsMaxI = (byte)(0) ;
         n3944BarEnsMaxI = false ;
      }
      else
      {
         A3944BarEnsMaxI = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarEnsMaxI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3944BarEnsMaxI = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarEnsNumI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarEnsNumI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "BARENSNUMI_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarEnsNumI_Internalname ;
         wbErr = true ;
         A3945BarEnsNumI = (byte)(0) ;
         n3945BarEnsNumI = false ;
      }
      else
      {
         A3945BarEnsNumI = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarEnsNumI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3945BarEnsNumI = false ;
      }
      A4255BarEnsEqui = httpContext.cgiGet( edtBarEnsEqui_Internalname) ;
      n4255BarEnsEqui = false ;
      if ( localUtil.vcdate( httpContext.cgiGet( edtBarEnsFchG_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "BARENSFCHG_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarEnsFchG_Internalname ;
         wbErr = true ;
         A4256BarEnsFchG = GXutil.nullDate() ;
         n4256BarEnsFchG = false ;
      }
      else
      {
         A4256BarEnsFchG = localUtil.ctod( httpContext.cgiGet( edtBarEnsFchG_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n4256BarEnsFchG = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarEnsEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarEnsEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "BARENSEST_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarEnsEst_Internalname ;
         wbErr = true ;
         A4257BarEnsEst = (byte)(0) ;
         n4257BarEnsEst = false ;
      }
      else
      {
         A4257BarEnsEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarEnsEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4257BarEnsEst = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarKgTiras_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarKgTiras_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARKGTIRAS_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarKgTiras_Internalname ;
         wbErr = true ;
         A10712BarKgTiras = DecimalUtil.ZERO ;
         n10712BarKgTiras = false ;
      }
      else
      {
         A10712BarKgTiras = localUtil.ctond( httpContext.cgiGet( edtBarKgTiras_Internalname)) ;
         n10712BarKgTiras = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarNbTiras_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarNbTiras_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARNBTIRAS_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarNbTiras_Internalname ;
         wbErr = true ;
         A10711BarNbTiras = (short)(0) ;
         n10711BarNbTiras = false ;
      }
      else
      {
         A10711BarNbTiras = (short)(localUtil.ctol( httpContext.cgiGet( edtBarNbTiras_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10711BarNbTiras = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarKgRtFr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarKgRtFr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARKGRTFR_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarKgRtFr_Internalname ;
         wbErr = true ;
         A12894BarKgRtFr = DecimalUtil.ZERO ;
         n12894BarKgRtFr = false ;
      }
      else
      {
         A12894BarKgRtFr = localUtil.ctond( httpContext.cgiGet( edtBarKgRtFr_Internalname)) ;
         n12894BarKgRtFr = false ;
      }
      GXCCtl = "Z3940BarEnsLin_" + sGXsfl_45_idx ;
      Z3940BarEnsLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3941BarEnsGru_" + sGXsfl_45_idx ;
      Z3941BarEnsGru = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3942BarEnsGrLi_" + sGXsfl_45_idx ;
      Z3942BarEnsGrLi = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3943BarEnsTipo_" + sGXsfl_45_idx ;
      Z3943BarEnsTipo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3944BarEnsMaxI_" + sGXsfl_45_idx ;
      Z3944BarEnsMaxI = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3945BarEnsNumI_" + sGXsfl_45_idx ;
      Z3945BarEnsNumI = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4255BarEnsEqui_" + sGXsfl_45_idx ;
      Z4255BarEnsEqui = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4256BarEnsFchG_" + sGXsfl_45_idx ;
      Z4256BarEnsFchG = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z4257BarEnsEst_" + sGXsfl_45_idx ;
      Z4257BarEnsEst = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10712BarKgTiras_" + sGXsfl_45_idx ;
      Z10712BarKgTiras = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10711BarNbTiras_" + sGXsfl_45_idx ;
      Z10711BarNbTiras = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12894BarKgRtFr_" + sGXsfl_45_idx ;
      Z12894BarKgRtFr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1561_" + sGXsfl_45_idx ;
      nRcdDeleted_1561 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1561_" + sGXsfl_45_idx ;
      nRcdExists_1561 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1561_" + sGXsfl_45_idx ;
      nIsMod_1561 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtBarEnsLin_Enabled = edtBarEnsLin_Enabled ;
   }

   public void confirmValues1F30( )
   {
      nGXsfl_45_idx = 0 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451561( ) ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451561( ) ;
         httpContext.changePostValue( "Z3940BarEnsLin_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z3940BarEnsLin_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3940BarEnsLin_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z3941BarEnsGru_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z3941BarEnsGru_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3941BarEnsGru_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z3942BarEnsGrLi_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z3942BarEnsGrLi_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3942BarEnsGrLi_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z3943BarEnsTipo_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z3943BarEnsTipo_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3943BarEnsTipo_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z3944BarEnsMaxI_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z3944BarEnsMaxI_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3944BarEnsMaxI_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z3945BarEnsNumI_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z3945BarEnsNumI_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3945BarEnsNumI_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z4255BarEnsEqui_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z4255BarEnsEqui_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4255BarEnsEqui_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z4256BarEnsFchG_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z4256BarEnsFchG_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4256BarEnsFchG_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z4257BarEnsEst_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z4257BarEnsEst_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4257BarEnsEst_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10712BarKgTiras_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10712BarKgTiras_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10712BarKgTiras_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10711BarNbTiras_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10711BarNbTiras_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10711BarNbTiras_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z12894BarKgRtFr_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z12894BarKgRtFr_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12894BarKgRtFr_"+sGXsfl_45_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tbarens", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TBARENS");
      forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("BarMaqGru", GXutil.rtrim( localUtil.format( A2759BarMaqGru, "")));
      forbiddenHiddens.add("BarMaqCod", GXutil.rtrim( localUtil.format( A180BarMaqCod, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tbarens:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nGXsfl_45_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQCOD", GXutil.rtrim( A180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQGRU", GXutil.rtrim( A2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
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
      return formatLink("app.tbarens", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TBARENS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Ensayos de HDR", "") ;
   }

   public void initializeNonKey1F312( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A2759BarMaqGru = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
      A180BarMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A365DisDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      Z361DisCod = 0 ;
      Z2759BarMaqGru = "" ;
      Z180BarMaqCod = "" ;
      Z252CliCod = 0 ;
   }

   public void initAll1F312( )
   {
      A396EmprCod = "" ;
      n396EmprCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A129BarCod = 0 ;
      n129BarCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      n130BarCodPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      initializeNonKey1F312( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1F31561( )
   {
      A3941BarEnsGru = "" ;
      n3941BarEnsGru = false ;
      A3942BarEnsGrLi = (short)(0) ;
      n3942BarEnsGrLi = false ;
      A3943BarEnsTipo = "" ;
      n3943BarEnsTipo = false ;
      A3944BarEnsMaxI = (byte)(0) ;
      n3944BarEnsMaxI = false ;
      A3945BarEnsNumI = (byte)(0) ;
      n3945BarEnsNumI = false ;
      A4255BarEnsEqui = "" ;
      n4255BarEnsEqui = false ;
      A4256BarEnsFchG = GXutil.nullDate() ;
      n4256BarEnsFchG = false ;
      A4257BarEnsEst = (byte)(0) ;
      n4257BarEnsEst = false ;
      A10712BarKgTiras = DecimalUtil.ZERO ;
      n10712BarKgTiras = false ;
      A10711BarNbTiras = (short)(0) ;
      n10711BarNbTiras = false ;
      A12894BarKgRtFr = DecimalUtil.ZERO ;
      n12894BarKgRtFr = false ;
      Z3941BarEnsGru = "" ;
      Z3942BarEnsGrLi = (short)(0) ;
      Z3943BarEnsTipo = "" ;
      Z3944BarEnsMaxI = (byte)(0) ;
      Z3945BarEnsNumI = (byte)(0) ;
      Z4255BarEnsEqui = "" ;
      Z4256BarEnsFchG = GXutil.nullDate() ;
      Z4257BarEnsEst = (byte)(0) ;
      Z10712BarKgTiras = DecimalUtil.ZERO ;
      Z10711BarNbTiras = (short)(0) ;
      Z12894BarKgRtFr = DecimalUtil.ZERO ;
   }

   public void initAll1F31561( )
   {
      A3940BarEnsLin = (short)(0) ;
      initializeNonKey1F31561( ) ;
   }

   public void standaloneModalInsert1F31561( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241573618", true, true);
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
      httpContext.AddJavascriptSource("tbarens.js", "?20268241573618", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1561( )
   {
      edtBarEnsLin_Enabled = defedtBarEnsLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEnsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnsLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1561, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1561_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3940BarEnsLin, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3941BarEnsGru));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsGru_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3942BarEnsGrLi, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsGrLi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3943BarEnsTipo));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsTipo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3944BarEnsMaxI, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsMaxI_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3945BarEnsNumI, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsNumI_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4255BarEnsEqui));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsEqui_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A4256BarEnsFchG, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsFchG_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4257BarEnsEst, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnsEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10712BarKgTiras, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKgTiras_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10711BarNbTiras, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNbTiras_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12894BarKgRtFr, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKgRtFr_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtavnRcdDeleted_1561_Internalname = "vNRCDDELETED_1561" ;
      edtBarEnsLin_Internalname = "BARENSLIN" ;
      edtBarEnsGru_Internalname = "BARENSGRU" ;
      edtBarEnsGrLi_Internalname = "BARENSGRLI" ;
      edtBarEnsTipo_Internalname = "BARENSTIPO" ;
      edtBarEnsMaxI_Internalname = "BARENSMAXI" ;
      edtBarEnsNumI_Internalname = "BARENSNUMI" ;
      edtBarEnsEqui_Internalname = "BARENSEQUI" ;
      edtBarEnsFchG_Internalname = "BARENSFCHG" ;
      edtBarEnsEst_Internalname = "BARENSEST" ;
      edtBarKgTiras_Internalname = "BARKGTIRAS" ;
      edtBarNbTiras_Internalname = "BARNBTIRAS" ;
      edtBarKgRtFr_Internalname = "BARKGRTFR" ;
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
      Form.setCaption( httpContext.getMessage( "Ensayos de HDR", "") );
      edtBarKgRtFr_Jsonclick = "" ;
      edtBarNbTiras_Jsonclick = "" ;
      edtBarKgTiras_Jsonclick = "" ;
      edtBarEnsEst_Jsonclick = "" ;
      edtBarEnsFchG_Jsonclick = "" ;
      edtBarEnsEqui_Jsonclick = "" ;
      edtBarEnsNumI_Jsonclick = "" ;
      edtBarEnsMaxI_Jsonclick = "" ;
      edtBarEnsTipo_Jsonclick = "" ;
      edtBarEnsGrLi_Jsonclick = "" ;
      edtBarEnsGru_Jsonclick = "" ;
      edtBarEnsLin_Jsonclick = "" ;
      edtavnRcdDeleted_1561_Jsonclick = "" ;
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
      edtBarKgRtFr_Enabled = 1 ;
      edtBarNbTiras_Enabled = 1 ;
      edtBarKgTiras_Enabled = 1 ;
      edtBarEnsEst_Enabled = 1 ;
      edtBarEnsFchG_Enabled = 1 ;
      edtBarEnsEqui_Enabled = 1 ;
      edtBarEnsNumI_Enabled = 1 ;
      edtBarEnsMaxI_Enabled = 1 ;
      edtBarEnsTipo_Enabled = 1 ;
      edtBarEnsGrLi_Enabled = 1 ;
      edtBarEnsGru_Enabled = 1 ;
      edtBarEnsLin_Enabled = 1 ;
      edtavnRcdDeleted_1561_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
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
      subsflControlProps_451561( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1F31561( ) ;
         standaloneModal1F31561( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1F31561( ) ;
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451561( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
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
      /* Using cursor T01F317 */
      pr_default.execute(15, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01F317_A407EmprNom[0] ;
      n407EmprNom = T01F317_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(15);
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
      n396EmprCod = false ;
      n407EmprNom = false ;
      n252CliCod = false ;
      /* Using cursor T01F317 */
      pr_default.execute(15, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01F317_A407EmprNom[0] ;
      n407EmprNom = T01F317_n407EmprNom[0] ;
      pr_default.close(15);
      /* Using cursor T01F318 */
      pr_default.execute(16, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A252CliCod = T01F318_A252CliCod[0] ;
      n252CliCod = T01F318_n252CliCod[0] ;
      A365DisDes = T01F318_A365DisDes[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", GXutil.rtrim( A365DisDes));
   }

   public void valid_Barcodpar( )
   {
      n396EmprCod = false ;
      n129BarCod = false ;
      n132BarCodReo = false ;
      n130BarCodPar = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", GXutil.rtrim( A2759BarMaqGru));
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", GXutil.rtrim( A180BarMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", GXutil.rtrim( A365DisDes));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z365DisDes", GXutil.rtrim( Z365DisDes));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z361DisCod'},{av:'Z2759BarMaqGru'},{av:'Z180BarMaqCod'},{av:'Z407EmprNom'},{av:'Z252CliCod'},{av:'Z365DisDes'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_BARENSLIN","{handler:'valid_Barenslin',iparms:[]");
      setEventMetadata("VALID_BARENSLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barkgrtfr',iparms:[]");
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
      pr_default.close(15);
      pr_default.close(16);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z2759BarMaqGru = "" ;
      Z180BarMaqCod = "" ;
      Z3941BarEnsGru = "" ;
      Z3943BarEnsTipo = "" ;
      Z4255BarEnsEqui = "" ;
      Z4256BarEnsFchG = GXutil.nullDate() ;
      Z10712BarKgTiras = DecimalUtil.ZERO ;
      Z12894BarKgRtFr = DecimalUtil.ZERO ;
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
      A130BarCodPar = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1561 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A2759BarMaqGru = "" ;
      A180BarMaqCod = "" ;
      A365DisDes = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode12 = "" ;
      GXCCtl = "" ;
      A3941BarEnsGru = "" ;
      A3943BarEnsTipo = "" ;
      A4255BarEnsEqui = "" ;
      A4256BarEnsFchG = GXutil.nullDate() ;
      A10712BarKgTiras = DecimalUtil.ZERO ;
      A12894BarKgRtFr = DecimalUtil.ZERO ;
      Z365DisDes = "" ;
      Z407EmprNom = "" ;
      T01F38_A361DisCod = new int[1] ;
      T01F38_A2759BarMaqGru = new String[] {""} ;
      T01F38_A129BarCod = new int[1] ;
      T01F38_n129BarCod = new boolean[] {false} ;
      T01F38_A132BarCodReo = new byte[1] ;
      T01F38_n132BarCodReo = new boolean[] {false} ;
      T01F38_A130BarCodPar = new String[] {""} ;
      T01F38_n130BarCodPar = new boolean[] {false} ;
      T01F38_A180BarMaqCod = new String[] {""} ;
      T01F38_A407EmprNom = new String[] {""} ;
      T01F38_n407EmprNom = new boolean[] {false} ;
      T01F38_A252CliCod = new int[1] ;
      T01F38_n252CliCod = new boolean[] {false} ;
      T01F38_A365DisDes = new String[] {""} ;
      T01F38_A396EmprCod = new String[] {""} ;
      T01F38_n396EmprCod = new boolean[] {false} ;
      T01F37_A252CliCod = new int[1] ;
      T01F37_n252CliCod = new boolean[] {false} ;
      T01F37_A365DisDes = new String[] {""} ;
      T01F36_A407EmprNom = new String[] {""} ;
      T01F36_n407EmprNom = new boolean[] {false} ;
      T01F39_A407EmprNom = new String[] {""} ;
      T01F39_n407EmprNom = new boolean[] {false} ;
      T01F310_A252CliCod = new int[1] ;
      T01F310_n252CliCod = new boolean[] {false} ;
      T01F310_A365DisDes = new String[] {""} ;
      T01F311_A396EmprCod = new String[] {""} ;
      T01F311_n396EmprCod = new boolean[] {false} ;
      T01F311_A129BarCod = new int[1] ;
      T01F311_n129BarCod = new boolean[] {false} ;
      T01F311_A132BarCodReo = new byte[1] ;
      T01F311_n132BarCodReo = new boolean[] {false} ;
      T01F311_A130BarCodPar = new String[] {""} ;
      T01F311_n130BarCodPar = new boolean[] {false} ;
      T01F35_A361DisCod = new int[1] ;
      T01F35_A2759BarMaqGru = new String[] {""} ;
      T01F35_A129BarCod = new int[1] ;
      T01F35_n129BarCod = new boolean[] {false} ;
      T01F35_A132BarCodReo = new byte[1] ;
      T01F35_n132BarCodReo = new boolean[] {false} ;
      T01F35_A130BarCodPar = new String[] {""} ;
      T01F35_n130BarCodPar = new boolean[] {false} ;
      T01F35_A180BarMaqCod = new String[] {""} ;
      T01F35_A396EmprCod = new String[] {""} ;
      T01F35_n396EmprCod = new boolean[] {false} ;
      T01F35_A252CliCod = new int[1] ;
      T01F35_n252CliCod = new boolean[] {false} ;
      T01F35_A365DisDes = new String[] {""} ;
      T01F312_A396EmprCod = new String[] {""} ;
      T01F312_n396EmprCod = new boolean[] {false} ;
      T01F312_A129BarCod = new int[1] ;
      T01F312_n129BarCod = new boolean[] {false} ;
      T01F312_A132BarCodReo = new byte[1] ;
      T01F312_n132BarCodReo = new boolean[] {false} ;
      T01F312_A130BarCodPar = new String[] {""} ;
      T01F312_n130BarCodPar = new boolean[] {false} ;
      T01F313_A396EmprCod = new String[] {""} ;
      T01F313_n396EmprCod = new boolean[] {false} ;
      T01F313_A129BarCod = new int[1] ;
      T01F313_n129BarCod = new boolean[] {false} ;
      T01F313_A132BarCodReo = new byte[1] ;
      T01F313_n132BarCodReo = new boolean[] {false} ;
      T01F313_A130BarCodPar = new String[] {""} ;
      T01F313_n130BarCodPar = new boolean[] {false} ;
      T01F34_A361DisCod = new int[1] ;
      T01F34_A2759BarMaqGru = new String[] {""} ;
      T01F34_A129BarCod = new int[1] ;
      T01F34_n129BarCod = new boolean[] {false} ;
      T01F34_A132BarCodReo = new byte[1] ;
      T01F34_n132BarCodReo = new boolean[] {false} ;
      T01F34_A130BarCodPar = new String[] {""} ;
      T01F34_n130BarCodPar = new boolean[] {false} ;
      T01F34_A180BarMaqCod = new String[] {""} ;
      T01F34_A396EmprCod = new String[] {""} ;
      T01F34_n396EmprCod = new boolean[] {false} ;
      T01F34_A252CliCod = new int[1] ;
      T01F34_n252CliCod = new boolean[] {false} ;
      T01F34_A365DisDes = new String[] {""} ;
      T01F317_A407EmprNom = new String[] {""} ;
      T01F317_n407EmprNom = new boolean[] {false} ;
      T01F318_A252CliCod = new int[1] ;
      T01F318_n252CliCod = new boolean[] {false} ;
      T01F318_A365DisDes = new String[] {""} ;
      T01F319_A14681MRPrId = new long[1] ;
      T01F320_A5921XCjaDis = new String[] {""} ;
      T01F320_A5922XCjaCod = new long[1] ;
      T01F321_A396EmprCod = new String[] {""} ;
      T01F321_n396EmprCod = new boolean[] {false} ;
      T01F321_A129BarCod = new int[1] ;
      T01F321_n129BarCod = new boolean[] {false} ;
      T01F321_A132BarCodReo = new byte[1] ;
      T01F321_n132BarCodReo = new boolean[] {false} ;
      T01F321_A130BarCodPar = new String[] {""} ;
      T01F321_n130BarCodPar = new boolean[] {false} ;
      T01F321_A14152MEnvOrd = new short[1] ;
      T01F322_A396EmprCod = new String[] {""} ;
      T01F322_n396EmprCod = new boolean[] {false} ;
      T01F322_A129BarCod = new int[1] ;
      T01F322_n129BarCod = new boolean[] {false} ;
      T01F322_A132BarCodReo = new byte[1] ;
      T01F322_n132BarCodReo = new boolean[] {false} ;
      T01F322_A130BarCodPar = new String[] {""} ;
      T01F322_n130BarCodPar = new boolean[] {false} ;
      T01F322_A13905BarTraID = new String[] {""} ;
      T01F323_A396EmprCod = new String[] {""} ;
      T01F323_n396EmprCod = new boolean[] {false} ;
      T01F323_A129BarCod = new int[1] ;
      T01F323_n129BarCod = new boolean[] {false} ;
      T01F323_A132BarCodReo = new byte[1] ;
      T01F323_n132BarCodReo = new boolean[] {false} ;
      T01F323_A130BarCodPar = new String[] {""} ;
      T01F323_n130BarCodPar = new boolean[] {false} ;
      T01F323_A13093BarDGLin = new byte[1] ;
      T01F323_A13094BarDGDibCl = new String[] {""} ;
      T01F323_A13095BarDGDibIn = new int[1] ;
      T01F323_A13096BarDGComb = new String[] {""} ;
      T01F323_A13097BarDGFOndo = new String[] {""} ;
      T01F324_A396EmprCod = new String[] {""} ;
      T01F324_n396EmprCod = new boolean[] {false} ;
      T01F324_A11917Ebd_numero = new int[1] ;
      T01F325_A396EmprCod = new String[] {""} ;
      T01F325_n396EmprCod = new boolean[] {false} ;
      T01F325_A11898Prd_numero = new int[1] ;
      T01F326_A396EmprCod = new String[] {""} ;
      T01F326_n396EmprCod = new boolean[] {false} ;
      T01F326_A11849Cte_numero = new int[1] ;
      T01F327_A396EmprCod = new String[] {""} ;
      T01F327_n396EmprCod = new boolean[] {false} ;
      T01F327_A11791Ap_numero = new int[1] ;
      T01F328_A396EmprCod = new String[] {""} ;
      T01F328_n396EmprCod = new boolean[] {false} ;
      T01F328_A3985CalBarCod = new int[1] ;
      T01F328_A3986CalBarCodR = new byte[1] ;
      T01F328_A3987CalBarCodP = new String[] {""} ;
      T01F329_A396EmprCod = new String[] {""} ;
      T01F329_n396EmprCod = new boolean[] {false} ;
      T01F329_A5294InPTime = new java.util.Date[] {GXutil.nullDate()} ;
      T01F329_A652OpeCod = new int[1] ;
      T01F330_A396EmprCod = new String[] {""} ;
      T01F330_n396EmprCod = new boolean[] {false} ;
      T01F330_A129BarCod = new int[1] ;
      T01F330_n129BarCod = new boolean[] {false} ;
      T01F330_A132BarCodReo = new byte[1] ;
      T01F330_n132BarCodReo = new boolean[] {false} ;
      T01F330_A130BarCodPar = new String[] {""} ;
      T01F330_n130BarCodPar = new boolean[] {false} ;
      T01F330_A4118tinagrcod = new int[1] ;
      T01F330_A4119tinagrreo = new byte[1] ;
      T01F330_A4120tinagrpar = new String[] {""} ;
      T01F331_A396EmprCod = new String[] {""} ;
      T01F331_n396EmprCod = new boolean[] {false} ;
      T01F331_A129BarCod = new int[1] ;
      T01F331_n129BarCod = new boolean[] {false} ;
      T01F331_A132BarCodReo = new byte[1] ;
      T01F331_n132BarCodReo = new boolean[] {false} ;
      T01F331_A130BarCodPar = new String[] {""} ;
      T01F331_n130BarCodPar = new boolean[] {false} ;
      T01F331_A4080estagrcod = new int[1] ;
      T01F331_A4081estagrreo = new byte[1] ;
      T01F331_A4082estagrpar = new String[] {""} ;
      T01F332_A396EmprCod = new String[] {""} ;
      T01F332_n396EmprCod = new boolean[] {false} ;
      T01F332_A129BarCod = new int[1] ;
      T01F332_n129BarCod = new boolean[] {false} ;
      T01F332_A132BarCodReo = new byte[1] ;
      T01F332_n132BarCodReo = new boolean[] {false} ;
      T01F332_A130BarCodPar = new String[] {""} ;
      T01F332_n130BarCodPar = new boolean[] {false} ;
      T01F332_A4075recestncol = new byte[1] ;
      T01F332_A4076recestnpro = new byte[1] ;
      T01F333_A396EmprCod = new String[] {""} ;
      T01F333_n396EmprCod = new boolean[] {false} ;
      T01F333_A602MaqCod = new String[] {""} ;
      T01F333_A1142MaqFCod = new String[] {""} ;
      T01F333_A3068PlaEtaOrd = new short[1] ;
      T01F333_A3069PlaEtaOrdA = new byte[1] ;
      T01F333_A129BarCod = new int[1] ;
      T01F333_n129BarCod = new boolean[] {false} ;
      T01F333_A132BarCodReo = new byte[1] ;
      T01F333_n132BarCodReo = new boolean[] {false} ;
      T01F333_A130BarCodPar = new String[] {""} ;
      T01F333_n130BarCodPar = new boolean[] {false} ;
      T01F334_A396EmprCod = new String[] {""} ;
      T01F334_n396EmprCod = new boolean[] {false} ;
      T01F334_A129BarCod = new int[1] ;
      T01F334_n129BarCod = new boolean[] {false} ;
      T01F334_A132BarCodReo = new byte[1] ;
      T01F334_n132BarCodReo = new boolean[] {false} ;
      T01F334_A130BarCodPar = new String[] {""} ;
      T01F334_n130BarCodPar = new boolean[] {false} ;
      T01F334_A4846BarAudLin = new short[1] ;
      T01F335_A396EmprCod = new String[] {""} ;
      T01F335_n396EmprCod = new boolean[] {false} ;
      T01F335_A129BarCod = new int[1] ;
      T01F335_n129BarCod = new boolean[] {false} ;
      T01F335_A132BarCodReo = new byte[1] ;
      T01F335_n132BarCodReo = new boolean[] {false} ;
      T01F335_A130BarCodPar = new String[] {""} ;
      T01F335_n130BarCodPar = new boolean[] {false} ;
      T01F335_A3384RefBarCod = new int[1] ;
      T01F335_A3385RefBarReo = new byte[1] ;
      T01F335_A3386RefBarPar = new String[] {""} ;
      T01F336_A396EmprCod = new String[] {""} ;
      T01F336_n396EmprCod = new boolean[] {false} ;
      T01F336_A10914SolSalCod = new int[1] ;
      T01F337_A396EmprCod = new String[] {""} ;
      T01F337_n396EmprCod = new boolean[] {false} ;
      T01F337_A10364Ph_numero = new int[1] ;
      T01F338_A396EmprCod = new String[] {""} ;
      T01F338_n396EmprCod = new boolean[] {false} ;
      T01F338_A129BarCod = new int[1] ;
      T01F338_n129BarCod = new boolean[] {false} ;
      T01F338_A132BarCodReo = new byte[1] ;
      T01F338_n132BarCodReo = new boolean[] {false} ;
      T01F338_A130BarCodPar = new String[] {""} ;
      T01F338_n130BarCodPar = new boolean[] {false} ;
      T01F338_A10197ProEspCod = new String[] {""} ;
      T01F339_A396EmprCod = new String[] {""} ;
      T01F339_n396EmprCod = new boolean[] {false} ;
      T01F339_A129BarCod = new int[1] ;
      T01F339_n129BarCod = new boolean[] {false} ;
      T01F339_A132BarCodReo = new byte[1] ;
      T01F339_n132BarCodReo = new boolean[] {false} ;
      T01F339_A130BarCodPar = new String[] {""} ;
      T01F339_n130BarCodPar = new boolean[] {false} ;
      T01F339_A5322Dp_Nrecep = new int[1] ;
      T01F340_A396EmprCod = new String[] {""} ;
      T01F340_n396EmprCod = new boolean[] {false} ;
      T01F340_A129BarCod = new int[1] ;
      T01F340_n129BarCod = new boolean[] {false} ;
      T01F340_A132BarCodReo = new byte[1] ;
      T01F340_n132BarCodReo = new boolean[] {false} ;
      T01F340_A130BarCodPar = new String[] {""} ;
      T01F340_n130BarCodPar = new boolean[] {false} ;
      T01F340_A8569EntSecLn = new int[1] ;
      T01F341_A396EmprCod = new String[] {""} ;
      T01F341_n396EmprCod = new boolean[] {false} ;
      T01F341_A7434PLLNro = new int[1] ;
      T01F341_A7443LPLNro = new short[1] ;
      T01F341_A7459CPLCom = new short[1] ;
      T01F341_A129BarCod = new int[1] ;
      T01F341_n129BarCod = new boolean[] {false} ;
      T01F341_A132BarCodReo = new byte[1] ;
      T01F341_n132BarCodReo = new boolean[] {false} ;
      T01F341_A130BarCodPar = new String[] {""} ;
      T01F341_n130BarCodPar = new boolean[] {false} ;
      T01F342_A396EmprCod = new String[] {""} ;
      T01F342_n396EmprCod = new boolean[] {false} ;
      T01F342_A7145OSSCod = new int[1] ;
      T01F343_A396EmprCod = new String[] {""} ;
      T01F343_n396EmprCod = new boolean[] {false} ;
      T01F343_A7049OGSCod = new int[1] ;
      T01F344_A396EmprCod = new String[] {""} ;
      T01F344_n396EmprCod = new boolean[] {false} ;
      T01F344_A129BarCod = new int[1] ;
      T01F344_n129BarCod = new boolean[] {false} ;
      T01F344_A132BarCodReo = new byte[1] ;
      T01F344_n132BarCodReo = new boolean[] {false} ;
      T01F344_A130BarCodPar = new String[] {""} ;
      T01F344_n130BarCodPar = new boolean[] {false} ;
      T01F344_A6031Ac_Barcod = new int[1] ;
      T01F344_A6032Ac_BarReo = new byte[1] ;
      T01F344_A6033Ac_BarPar = new String[] {""} ;
      T01F345_A396EmprCod = new String[] {""} ;
      T01F345_n396EmprCod = new boolean[] {false} ;
      T01F345_A129BarCod = new int[1] ;
      T01F345_n129BarCod = new boolean[] {false} ;
      T01F345_A132BarCodReo = new byte[1] ;
      T01F345_n132BarCodReo = new boolean[] {false} ;
      T01F345_A130BarCodPar = new String[] {""} ;
      T01F345_n130BarCodPar = new boolean[] {false} ;
      T01F345_A5908PartPal = new int[1] ;
      T01F346_A396EmprCod = new String[] {""} ;
      T01F346_n396EmprCod = new boolean[] {false} ;
      T01F346_A129BarCod = new int[1] ;
      T01F346_n129BarCod = new boolean[] {false} ;
      T01F346_A132BarCodReo = new byte[1] ;
      T01F346_n132BarCodReo = new boolean[] {false} ;
      T01F346_A130BarCodPar = new String[] {""} ;
      T01F346_n130BarCodPar = new boolean[] {false} ;
      T01F346_A2524DisComLin = new byte[1] ;
      T01F346_A1056DisComCod = new String[] {""} ;
      T01F346_A1032FonCod = new String[] {""} ;
      T01F347_A396EmprCod = new String[] {""} ;
      T01F347_n396EmprCod = new boolean[] {false} ;
      T01F347_A1736AlbExtCod = new long[1] ;
      T01F347_A129BarCod = new int[1] ;
      T01F347_n129BarCod = new boolean[] {false} ;
      T01F347_A132BarCodReo = new byte[1] ;
      T01F347_n132BarCodReo = new boolean[] {false} ;
      T01F347_A130BarCodPar = new String[] {""} ;
      T01F347_n130BarCodPar = new boolean[] {false} ;
      T01F348_A396EmprCod = new String[] {""} ;
      T01F348_n396EmprCod = new boolean[] {false} ;
      T01F348_A129BarCod = new int[1] ;
      T01F348_n129BarCod = new boolean[] {false} ;
      T01F348_A132BarCodReo = new byte[1] ;
      T01F348_n132BarCodReo = new boolean[] {false} ;
      T01F348_A130BarCodPar = new String[] {""} ;
      T01F348_n130BarCodPar = new boolean[] {false} ;
      T01F348_A3753BarFoaCod = new int[1] ;
      T01F348_A3754BarFoaReo = new byte[1] ;
      T01F348_A3755BarFoaPar = new String[] {""} ;
      T01F349_A396EmprCod = new String[] {""} ;
      T01F349_n396EmprCod = new boolean[] {false} ;
      T01F349_A129BarCod = new int[1] ;
      T01F349_n129BarCod = new boolean[] {false} ;
      T01F349_A132BarCodReo = new byte[1] ;
      T01F349_n132BarCodReo = new boolean[] {false} ;
      T01F349_A130BarCodPar = new String[] {""} ;
      T01F349_n130BarCodPar = new boolean[] {false} ;
      T01F349_A3747BarPegCod = new int[1] ;
      T01F349_A3748BarPegReo = new byte[1] ;
      T01F349_A3749BarPegPar = new String[] {""} ;
      T01F350_A396EmprCod = new String[] {""} ;
      T01F350_n396EmprCod = new boolean[] {false} ;
      T01F350_A3253SolTraCod = new int[1] ;
      T01F351_A396EmprCod = new String[] {""} ;
      T01F351_n396EmprCod = new boolean[] {false} ;
      T01F351_A3235SolSubCod = new int[1] ;
      T01F352_A396EmprCod = new String[] {""} ;
      T01F352_n396EmprCod = new boolean[] {false} ;
      T01F352_A3218SolLuzCod = new int[1] ;
      T01F353_A396EmprCod = new String[] {""} ;
      T01F353_n396EmprCod = new boolean[] {false} ;
      T01F353_A3196SolFriCod = new int[1] ;
      T01F354_A396EmprCod = new String[] {""} ;
      T01F354_n396EmprCod = new boolean[] {false} ;
      T01F354_A3165SolPilCod = new int[1] ;
      T01F355_A396EmprCod = new String[] {""} ;
      T01F355_n396EmprCod = new boolean[] {false} ;
      T01F355_A129BarCod = new int[1] ;
      T01F355_n129BarCod = new boolean[] {false} ;
      T01F355_A132BarCodReo = new byte[1] ;
      T01F355_n132BarCodReo = new boolean[] {false} ;
      T01F355_A130BarCodPar = new String[] {""} ;
      T01F355_n130BarCodPar = new boolean[] {false} ;
      T01F355_A2872HAnRLinMaq = new short[1] ;
      T01F355_A2873HAnRLinPro = new byte[1] ;
      T01F355_A2874HAnRLin = new short[1] ;
      T01F355_A2875HAnNumAny = new byte[1] ;
      T01F356_A396EmprCod = new String[] {""} ;
      T01F356_n396EmprCod = new boolean[] {false} ;
      T01F356_A2817PlaTer = new String[] {""} ;
      T01F356_A2818PlaOrd = new short[1] ;
      T01F357_A396EmprCod = new String[] {""} ;
      T01F357_n396EmprCod = new boolean[] {false} ;
      T01F357_A2809MetTerCod = new String[] {""} ;
      T01F357_A129BarCod = new int[1] ;
      T01F357_n129BarCod = new boolean[] {false} ;
      T01F357_A132BarCodReo = new byte[1] ;
      T01F357_n132BarCodReo = new boolean[] {false} ;
      T01F357_A130BarCodPar = new String[] {""} ;
      T01F357_n130BarCodPar = new boolean[] {false} ;
      T01F358_A396EmprCod = new String[] {""} ;
      T01F358_n396EmprCod = new boolean[] {false} ;
      T01F358_A129BarCod = new int[1] ;
      T01F358_n129BarCod = new boolean[] {false} ;
      T01F358_A132BarCodReo = new byte[1] ;
      T01F358_n132BarCodReo = new boolean[] {false} ;
      T01F358_A130BarCodPar = new String[] {""} ;
      T01F358_n130BarCodPar = new boolean[] {false} ;
      T01F358_A2808RecLinMAL = new short[1] ;
      T01F358_A1377RecNumAny = new byte[1] ;
      T01F358_A719PrdNum = new String[] {""} ;
      T01F359_A396EmprCod = new String[] {""} ;
      T01F359_n396EmprCod = new boolean[] {false} ;
      T01F359_A129BarCod = new int[1] ;
      T01F359_n129BarCod = new boolean[] {false} ;
      T01F359_A132BarCodReo = new byte[1] ;
      T01F359_n132BarCodReo = new boolean[] {false} ;
      T01F359_A130BarCodPar = new String[] {""} ;
      T01F359_n130BarCodPar = new boolean[] {false} ;
      T01F359_A2804RecLinMaq = new short[1] ;
      T01F360_A396EmprCod = new String[] {""} ;
      T01F360_n396EmprCod = new boolean[] {false} ;
      T01F360_A2792TermiCod = new String[] {""} ;
      T01F360_A129BarCod = new int[1] ;
      T01F360_n129BarCod = new boolean[] {false} ;
      T01F360_A132BarCodReo = new byte[1] ;
      T01F360_n132BarCodReo = new boolean[] {false} ;
      T01F360_A130BarCodPar = new String[] {""} ;
      T01F360_n130BarCodPar = new boolean[] {false} ;
      T01F361_A396EmprCod = new String[] {""} ;
      T01F361_n396EmprCod = new boolean[] {false} ;
      T01F361_A2248ManCod = new short[1] ;
      T01F361_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01F361_A2713RpExHdLi = new short[1] ;
      T01F362_A396EmprCod = new String[] {""} ;
      T01F362_n396EmprCod = new boolean[] {false} ;
      T01F362_A2248ManCod = new short[1] ;
      T01F362_A2689ExHdrFas = new String[] {""} ;
      T01F362_A2692ExHdrLin = new int[1] ;
      T01F363_A396EmprCod = new String[] {""} ;
      T01F363_n396EmprCod = new boolean[] {false} ;
      T01F363_A129BarCod = new int[1] ;
      T01F363_n129BarCod = new boolean[] {false} ;
      T01F363_A132BarCodReo = new byte[1] ;
      T01F363_n132BarCodReo = new boolean[] {false} ;
      T01F363_A130BarCodPar = new String[] {""} ;
      T01F363_n130BarCodPar = new boolean[] {false} ;
      T01F363_A2494BarDosPro = new String[] {""} ;
      T01F363_A719PrdNum = new String[] {""} ;
      T01F364_A396EmprCod = new String[] {""} ;
      T01F364_n396EmprCod = new boolean[] {false} ;
      T01F364_A602MaqCod = new String[] {""} ;
      T01F364_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T01F364_A129BarCod = new int[1] ;
      T01F364_n129BarCod = new boolean[] {false} ;
      T01F364_A132BarCodReo = new byte[1] ;
      T01F364_n132BarCodReo = new boolean[] {false} ;
      T01F364_A130BarCodPar = new String[] {""} ;
      T01F364_n130BarCodPar = new boolean[] {false} ;
      T01F365_A396EmprCod = new String[] {""} ;
      T01F365_n396EmprCod = new boolean[] {false} ;
      T01F365_A129BarCod = new int[1] ;
      T01F365_n129BarCod = new boolean[] {false} ;
      T01F365_A132BarCodReo = new byte[1] ;
      T01F365_n132BarCodReo = new boolean[] {false} ;
      T01F365_A130BarCodPar = new String[] {""} ;
      T01F365_n130BarCodPar = new boolean[] {false} ;
      T01F365_A2457BarObLin = new short[1] ;
      T01F366_A396EmprCod = new String[] {""} ;
      T01F366_n396EmprCod = new boolean[] {false} ;
      T01F366_A129BarCod = new int[1] ;
      T01F366_n129BarCod = new boolean[] {false} ;
      T01F366_A132BarCodReo = new byte[1] ;
      T01F366_n132BarCodReo = new boolean[] {false} ;
      T01F366_A130BarCodPar = new String[] {""} ;
      T01F366_n130BarCodPar = new boolean[] {false} ;
      T01F366_A2444BarEnLin = new short[1] ;
      T01F367_A396EmprCod = new String[] {""} ;
      T01F367_n396EmprCod = new boolean[] {false} ;
      T01F367_A2406ExhAlbCod = new int[1] ;
      T01F367_A129BarCod = new int[1] ;
      T01F367_n129BarCod = new boolean[] {false} ;
      T01F367_A132BarCodReo = new byte[1] ;
      T01F367_n132BarCodReo = new boolean[] {false} ;
      T01F367_A130BarCodPar = new String[] {""} ;
      T01F367_n130BarCodPar = new boolean[] {false} ;
      T01F368_A396EmprCod = new String[] {""} ;
      T01F368_n396EmprCod = new boolean[] {false} ;
      T01F368_A2253SalExtAlb = new int[1] ;
      T01F368_A129BarCod = new int[1] ;
      T01F368_n129BarCod = new boolean[] {false} ;
      T01F368_A132BarCodReo = new byte[1] ;
      T01F368_n132BarCodReo = new boolean[] {false} ;
      T01F368_A130BarCodPar = new String[] {""} ;
      T01F368_n130BarCodPar = new boolean[] {false} ;
      T01F369_A396EmprCod = new String[] {""} ;
      T01F369_n396EmprCod = new boolean[] {false} ;
      T01F369_A30AlbProCod = new long[1] ;
      T01F369_A129BarCod = new int[1] ;
      T01F369_n129BarCod = new boolean[] {false} ;
      T01F369_A132BarCodReo = new byte[1] ;
      T01F369_n132BarCodReo = new boolean[] {false} ;
      T01F369_A130BarCodPar = new String[] {""} ;
      T01F369_n130BarCodPar = new boolean[] {false} ;
      T01F370_A396EmprCod = new String[] {""} ;
      T01F370_n396EmprCod = new boolean[] {false} ;
      T01F370_A1348SolColCod = new int[1] ;
      T01F371_A396EmprCod = new String[] {""} ;
      T01F371_n396EmprCod = new boolean[] {false} ;
      T01F371_A1333EstDimCod = new int[1] ;
      T01F372_A396EmprCod = new String[] {""} ;
      T01F372_n396EmprCod = new boolean[] {false} ;
      T01F372_A1314EnsLabCod = new int[1] ;
      T01F373_A396EmprCod = new String[] {""} ;
      T01F373_n396EmprCod = new boolean[] {false} ;
      T01F373_A129BarCod = new int[1] ;
      T01F373_n129BarCod = new boolean[] {false} ;
      T01F373_A132BarCodReo = new byte[1] ;
      T01F373_n132BarCodReo = new boolean[] {false} ;
      T01F373_A130BarCodPar = new String[] {""} ;
      T01F373_n130BarCodPar = new boolean[] {false} ;
      T01F373_A906ObsReoLin = new byte[1] ;
      T01F374_A396EmprCod = new String[] {""} ;
      T01F374_n396EmprCod = new boolean[] {false} ;
      T01F374_A859CumCodCont = new int[1] ;
      T01F375_A396EmprCod = new String[] {""} ;
      T01F375_n396EmprCod = new boolean[] {false} ;
      T01F375_A602MaqCod = new String[] {""} ;
      T01F375_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01F375_A561HisProLin = new int[1] ;
      T01F376_A396EmprCod = new String[] {""} ;
      T01F376_n396EmprCod = new boolean[] {false} ;
      T01F376_A252CliCod = new int[1] ;
      T01F376_n252CliCod = new boolean[] {false} ;
      T01F376_A494ForSer = new String[] {""} ;
      T01F376_A482ForColNom = new String[] {""} ;
      T01F376_A483ForColNum = new int[1] ;
      T01F376_A831TipColCod = new byte[1] ;
      T01F377_A396EmprCod = new String[] {""} ;
      T01F377_n396EmprCod = new boolean[] {false} ;
      T01F377_A129BarCod = new int[1] ;
      T01F377_n129BarCod = new boolean[] {false} ;
      T01F377_A132BarCodReo = new byte[1] ;
      T01F377_n132BarCodReo = new boolean[] {false} ;
      T01F377_A130BarCodPar = new String[] {""} ;
      T01F377_n130BarCodPar = new boolean[] {false} ;
      T01F377_A200BarPieCod = new String[] {""} ;
      T01F378_A396EmprCod = new String[] {""} ;
      T01F378_n396EmprCod = new boolean[] {false} ;
      T01F378_A129BarCod = new int[1] ;
      T01F378_n129BarCod = new boolean[] {false} ;
      T01F378_A132BarCodReo = new byte[1] ;
      T01F378_n132BarCodReo = new boolean[] {false} ;
      T01F378_A130BarCodPar = new String[] {""} ;
      T01F378_n130BarCodPar = new boolean[] {false} ;
      T01F378_A188BarNotLin = new byte[1] ;
      T01F379_A396EmprCod = new String[] {""} ;
      T01F379_n396EmprCod = new boolean[] {false} ;
      T01F379_A129BarCod = new int[1] ;
      T01F379_n129BarCod = new boolean[] {false} ;
      T01F379_A132BarCodReo = new byte[1] ;
      T01F379_n132BarCodReo = new boolean[] {false} ;
      T01F379_A130BarCodPar = new String[] {""} ;
      T01F379_n130BarCodPar = new boolean[] {false} ;
      T01F379_A758ProCod = new String[] {""} ;
      T01F380_A396EmprCod = new String[] {""} ;
      T01F380_n396EmprCod = new boolean[] {false} ;
      T01F380_A129BarCod = new int[1] ;
      T01F380_n129BarCod = new boolean[] {false} ;
      T01F380_A132BarCodReo = new byte[1] ;
      T01F380_n132BarCodReo = new boolean[] {false} ;
      T01F380_A130BarCodPar = new String[] {""} ;
      T01F380_n130BarCodPar = new boolean[] {false} ;
      T01F380_A119BarAgrCod = new int[1] ;
      T01F380_A124BarAgrReo = new byte[1] ;
      T01F380_A122BarAgrPar = new String[] {""} ;
      T01F382_A396EmprCod = new String[] {""} ;
      T01F382_n396EmprCod = new boolean[] {false} ;
      T01F382_A129BarCod = new int[1] ;
      T01F382_n129BarCod = new boolean[] {false} ;
      T01F382_A132BarCodReo = new byte[1] ;
      T01F382_n132BarCodReo = new boolean[] {false} ;
      T01F382_A130BarCodPar = new String[] {""} ;
      T01F382_n130BarCodPar = new boolean[] {false} ;
      T01F383_A129BarCod = new int[1] ;
      T01F383_n129BarCod = new boolean[] {false} ;
      T01F383_A132BarCodReo = new byte[1] ;
      T01F383_n132BarCodReo = new boolean[] {false} ;
      T01F383_A130BarCodPar = new String[] {""} ;
      T01F383_n130BarCodPar = new boolean[] {false} ;
      T01F383_A3940BarEnsLin = new short[1] ;
      T01F383_A3941BarEnsGru = new String[] {""} ;
      T01F383_n3941BarEnsGru = new boolean[] {false} ;
      T01F383_A3942BarEnsGrLi = new short[1] ;
      T01F383_n3942BarEnsGrLi = new boolean[] {false} ;
      T01F383_A3943BarEnsTipo = new String[] {""} ;
      T01F383_n3943BarEnsTipo = new boolean[] {false} ;
      T01F383_A3944BarEnsMaxI = new byte[1] ;
      T01F383_n3944BarEnsMaxI = new boolean[] {false} ;
      T01F383_A3945BarEnsNumI = new byte[1] ;
      T01F383_n3945BarEnsNumI = new boolean[] {false} ;
      T01F383_A4255BarEnsEqui = new String[] {""} ;
      T01F383_n4255BarEnsEqui = new boolean[] {false} ;
      T01F383_A4256BarEnsFchG = new java.util.Date[] {GXutil.nullDate()} ;
      T01F383_n4256BarEnsFchG = new boolean[] {false} ;
      T01F383_A4257BarEnsEst = new byte[1] ;
      T01F383_n4257BarEnsEst = new boolean[] {false} ;
      T01F383_A10712BarKgTiras = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F383_n10712BarKgTiras = new boolean[] {false} ;
      T01F383_A10711BarNbTiras = new short[1] ;
      T01F383_n10711BarNbTiras = new boolean[] {false} ;
      T01F383_A12894BarKgRtFr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F383_n12894BarKgRtFr = new boolean[] {false} ;
      T01F383_A396EmprCod = new String[] {""} ;
      T01F383_n396EmprCod = new boolean[] {false} ;
      T01F384_A396EmprCod = new String[] {""} ;
      T01F384_n396EmprCod = new boolean[] {false} ;
      T01F384_A129BarCod = new int[1] ;
      T01F384_n129BarCod = new boolean[] {false} ;
      T01F384_A132BarCodReo = new byte[1] ;
      T01F384_n132BarCodReo = new boolean[] {false} ;
      T01F384_A130BarCodPar = new String[] {""} ;
      T01F384_n130BarCodPar = new boolean[] {false} ;
      T01F384_A3940BarEnsLin = new short[1] ;
      T01F33_A129BarCod = new int[1] ;
      T01F33_n129BarCod = new boolean[] {false} ;
      T01F33_A132BarCodReo = new byte[1] ;
      T01F33_n132BarCodReo = new boolean[] {false} ;
      T01F33_A130BarCodPar = new String[] {""} ;
      T01F33_n130BarCodPar = new boolean[] {false} ;
      T01F33_A3940BarEnsLin = new short[1] ;
      T01F33_A3941BarEnsGru = new String[] {""} ;
      T01F33_n3941BarEnsGru = new boolean[] {false} ;
      T01F33_A3942BarEnsGrLi = new short[1] ;
      T01F33_n3942BarEnsGrLi = new boolean[] {false} ;
      T01F33_A3943BarEnsTipo = new String[] {""} ;
      T01F33_n3943BarEnsTipo = new boolean[] {false} ;
      T01F33_A3944BarEnsMaxI = new byte[1] ;
      T01F33_n3944BarEnsMaxI = new boolean[] {false} ;
      T01F33_A3945BarEnsNumI = new byte[1] ;
      T01F33_n3945BarEnsNumI = new boolean[] {false} ;
      T01F33_A4255BarEnsEqui = new String[] {""} ;
      T01F33_n4255BarEnsEqui = new boolean[] {false} ;
      T01F33_A4256BarEnsFchG = new java.util.Date[] {GXutil.nullDate()} ;
      T01F33_n4256BarEnsFchG = new boolean[] {false} ;
      T01F33_A4257BarEnsEst = new byte[1] ;
      T01F33_n4257BarEnsEst = new boolean[] {false} ;
      T01F33_A10712BarKgTiras = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F33_n10712BarKgTiras = new boolean[] {false} ;
      T01F33_A10711BarNbTiras = new short[1] ;
      T01F33_n10711BarNbTiras = new boolean[] {false} ;
      T01F33_A12894BarKgRtFr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F33_n12894BarKgRtFr = new boolean[] {false} ;
      T01F33_A396EmprCod = new String[] {""} ;
      T01F33_n396EmprCod = new boolean[] {false} ;
      T01F32_A129BarCod = new int[1] ;
      T01F32_n129BarCod = new boolean[] {false} ;
      T01F32_A132BarCodReo = new byte[1] ;
      T01F32_n132BarCodReo = new boolean[] {false} ;
      T01F32_A130BarCodPar = new String[] {""} ;
      T01F32_n130BarCodPar = new boolean[] {false} ;
      T01F32_A3940BarEnsLin = new short[1] ;
      T01F32_A3941BarEnsGru = new String[] {""} ;
      T01F32_n3941BarEnsGru = new boolean[] {false} ;
      T01F32_A3942BarEnsGrLi = new short[1] ;
      T01F32_n3942BarEnsGrLi = new boolean[] {false} ;
      T01F32_A3943BarEnsTipo = new String[] {""} ;
      T01F32_n3943BarEnsTipo = new boolean[] {false} ;
      T01F32_A3944BarEnsMaxI = new byte[1] ;
      T01F32_n3944BarEnsMaxI = new boolean[] {false} ;
      T01F32_A3945BarEnsNumI = new byte[1] ;
      T01F32_n3945BarEnsNumI = new boolean[] {false} ;
      T01F32_A4255BarEnsEqui = new String[] {""} ;
      T01F32_n4255BarEnsEqui = new boolean[] {false} ;
      T01F32_A4256BarEnsFchG = new java.util.Date[] {GXutil.nullDate()} ;
      T01F32_n4256BarEnsFchG = new boolean[] {false} ;
      T01F32_A4257BarEnsEst = new byte[1] ;
      T01F32_n4257BarEnsEst = new boolean[] {false} ;
      T01F32_A10712BarKgTiras = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F32_n10712BarKgTiras = new boolean[] {false} ;
      T01F32_A10711BarNbTiras = new short[1] ;
      T01F32_n10711BarNbTiras = new boolean[] {false} ;
      T01F32_A12894BarKgRtFr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F32_n12894BarKgRtFr = new boolean[] {false} ;
      T01F32_A396EmprCod = new String[] {""} ;
      T01F32_n396EmprCod = new boolean[] {false} ;
      GXv_char4 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char1 = new String[1] ;
      T01F388_A396EmprCod = new String[] {""} ;
      T01F388_n396EmprCod = new boolean[] {false} ;
      T01F388_A129BarCod = new int[1] ;
      T01F388_n129BarCod = new boolean[] {false} ;
      T01F388_A132BarCodReo = new byte[1] ;
      T01F388_n132BarCodReo = new boolean[] {false} ;
      T01F388_A130BarCodPar = new String[] {""} ;
      T01F388_n130BarCodPar = new boolean[] {false} ;
      T01F388_A3940BarEnsLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ2759BarMaqGru = "" ;
      ZZ180BarMaqCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ365DisDes = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tbarens__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tbarens__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tbarens__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tbarens__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tbarens__default(),
         new Object[] {
             new Object[] {
            T01F32_A129BarCod, T01F32_A132BarCodReo, T01F32_A130BarCodPar, T01F32_A3940BarEnsLin, T01F32_A3941BarEnsGru, T01F32_n3941BarEnsGru, T01F32_A3942BarEnsGrLi, T01F32_n3942BarEnsGrLi, T01F32_A3943BarEnsTipo, T01F32_n3943BarEnsTipo,
            T01F32_A3944BarEnsMaxI, T01F32_n3944BarEnsMaxI, T01F32_A3945BarEnsNumI, T01F32_n3945BarEnsNumI, T01F32_A4255BarEnsEqui, T01F32_n4255BarEnsEqui, T01F32_A4256BarEnsFchG, T01F32_n4256BarEnsFchG, T01F32_A4257BarEnsEst, T01F32_n4257BarEnsEst,
            T01F32_A10712BarKgTiras, T01F32_n10712BarKgTiras, T01F32_A10711BarNbTiras, T01F32_n10711BarNbTiras, T01F32_A12894BarKgRtFr, T01F32_n12894BarKgRtFr, T01F32_A396EmprCod
            }
            , new Object[] {
            T01F33_A129BarCod, T01F33_A132BarCodReo, T01F33_A130BarCodPar, T01F33_A3940BarEnsLin, T01F33_A3941BarEnsGru, T01F33_n3941BarEnsGru, T01F33_A3942BarEnsGrLi, T01F33_n3942BarEnsGrLi, T01F33_A3943BarEnsTipo, T01F33_n3943BarEnsTipo,
            T01F33_A3944BarEnsMaxI, T01F33_n3944BarEnsMaxI, T01F33_A3945BarEnsNumI, T01F33_n3945BarEnsNumI, T01F33_A4255BarEnsEqui, T01F33_n4255BarEnsEqui, T01F33_A4256BarEnsFchG, T01F33_n4256BarEnsFchG, T01F33_A4257BarEnsEst, T01F33_n4257BarEnsEst,
            T01F33_A10712BarKgTiras, T01F33_n10712BarKgTiras, T01F33_A10711BarNbTiras, T01F33_n10711BarNbTiras, T01F33_A12894BarKgRtFr, T01F33_n12894BarKgRtFr, T01F33_A396EmprCod
            }
            , new Object[] {
            T01F34_A361DisCod, T01F34_A2759BarMaqGru, T01F34_A129BarCod, T01F34_A132BarCodReo, T01F34_A130BarCodPar, T01F34_A180BarMaqCod, T01F34_A396EmprCod, T01F34_A252CliCod, T01F34_n252CliCod, T01F34_A365DisDes
            }
            , new Object[] {
            T01F35_A361DisCod, T01F35_A2759BarMaqGru, T01F35_A129BarCod, T01F35_A132BarCodReo, T01F35_A130BarCodPar, T01F35_A180BarMaqCod, T01F35_A396EmprCod, T01F35_A252CliCod, T01F35_n252CliCod, T01F35_A365DisDes
            }
            , new Object[] {
            T01F36_A407EmprNom, T01F36_n407EmprNom
            }
            , new Object[] {
            T01F37_A252CliCod, T01F37_A365DisDes
            }
            , new Object[] {
            T01F38_A361DisCod, T01F38_A2759BarMaqGru, T01F38_A129BarCod, T01F38_A132BarCodReo, T01F38_A130BarCodPar, T01F38_A180BarMaqCod, T01F38_A407EmprNom, T01F38_n407EmprNom, T01F38_A252CliCod, T01F38_n252CliCod,
            T01F38_A365DisDes, T01F38_A396EmprCod
            }
            , new Object[] {
            T01F39_A407EmprNom, T01F39_n407EmprNom
            }
            , new Object[] {
            T01F310_A252CliCod, T01F310_A365DisDes
            }
            , new Object[] {
            T01F311_A396EmprCod, T01F311_A129BarCod, T01F311_A132BarCodReo, T01F311_A130BarCodPar
            }
            , new Object[] {
            T01F312_A396EmprCod, T01F312_A129BarCod, T01F312_A132BarCodReo, T01F312_A130BarCodPar
            }
            , new Object[] {
            T01F313_A396EmprCod, T01F313_A129BarCod, T01F313_A132BarCodReo, T01F313_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01F317_A407EmprNom, T01F317_n407EmprNom
            }
            , new Object[] {
            T01F318_A252CliCod, T01F318_A365DisDes
            }
            , new Object[] {
            T01F319_A14681MRPrId
            }
            , new Object[] {
            T01F320_A5921XCjaDis, T01F320_A5922XCjaCod
            }
            , new Object[] {
            T01F321_A396EmprCod, T01F321_A129BarCod, T01F321_A132BarCodReo, T01F321_A130BarCodPar, T01F321_A14152MEnvOrd
            }
            , new Object[] {
            T01F322_A396EmprCod, T01F322_A129BarCod, T01F322_A132BarCodReo, T01F322_A130BarCodPar, T01F322_A13905BarTraID
            }
            , new Object[] {
            T01F323_A396EmprCod, T01F323_A129BarCod, T01F323_A132BarCodReo, T01F323_A130BarCodPar, T01F323_A13093BarDGLin, T01F323_A13094BarDGDibCl, T01F323_A13095BarDGDibIn, T01F323_A13096BarDGComb, T01F323_A13097BarDGFOndo
            }
            , new Object[] {
            T01F324_A396EmprCod, T01F324_A11917Ebd_numero
            }
            , new Object[] {
            T01F325_A396EmprCod, T01F325_A11898Prd_numero
            }
            , new Object[] {
            T01F326_A396EmprCod, T01F326_A11849Cte_numero
            }
            , new Object[] {
            T01F327_A396EmprCod, T01F327_A11791Ap_numero
            }
            , new Object[] {
            T01F328_A396EmprCod, T01F328_A3985CalBarCod, T01F328_A3986CalBarCodR, T01F328_A3987CalBarCodP
            }
            , new Object[] {
            T01F329_A396EmprCod, T01F329_A5294InPTime, T01F329_A652OpeCod
            }
            , new Object[] {
            T01F330_A396EmprCod, T01F330_A129BarCod, T01F330_A132BarCodReo, T01F330_A130BarCodPar, T01F330_A4118tinagrcod, T01F330_A4119tinagrreo, T01F330_A4120tinagrpar
            }
            , new Object[] {
            T01F331_A396EmprCod, T01F331_A129BarCod, T01F331_A132BarCodReo, T01F331_A130BarCodPar, T01F331_A4080estagrcod, T01F331_A4081estagrreo, T01F331_A4082estagrpar
            }
            , new Object[] {
            T01F332_A396EmprCod, T01F332_A129BarCod, T01F332_A132BarCodReo, T01F332_A130BarCodPar, T01F332_A4075recestncol, T01F332_A4076recestnpro
            }
            , new Object[] {
            T01F333_A396EmprCod, T01F333_A602MaqCod, T01F333_A1142MaqFCod, T01F333_A3068PlaEtaOrd, T01F333_A3069PlaEtaOrdA, T01F333_A129BarCod, T01F333_A132BarCodReo, T01F333_A130BarCodPar
            }
            , new Object[] {
            T01F334_A396EmprCod, T01F334_A129BarCod, T01F334_A132BarCodReo, T01F334_A130BarCodPar, T01F334_A4846BarAudLin
            }
            , new Object[] {
            T01F335_A396EmprCod, T01F335_A129BarCod, T01F335_A132BarCodReo, T01F335_A130BarCodPar, T01F335_A3384RefBarCod, T01F335_A3385RefBarReo, T01F335_A3386RefBarPar
            }
            , new Object[] {
            T01F336_A396EmprCod, T01F336_A10914SolSalCod
            }
            , new Object[] {
            T01F337_A396EmprCod, T01F337_A10364Ph_numero
            }
            , new Object[] {
            T01F338_A396EmprCod, T01F338_A129BarCod, T01F338_A132BarCodReo, T01F338_A130BarCodPar, T01F338_A10197ProEspCod
            }
            , new Object[] {
            T01F339_A396EmprCod, T01F339_A129BarCod, T01F339_A132BarCodReo, T01F339_A130BarCodPar, T01F339_A5322Dp_Nrecep
            }
            , new Object[] {
            T01F340_A396EmprCod, T01F340_A129BarCod, T01F340_A132BarCodReo, T01F340_A130BarCodPar, T01F340_A8569EntSecLn
            }
            , new Object[] {
            T01F341_A396EmprCod, T01F341_A7434PLLNro, T01F341_A7443LPLNro, T01F341_A7459CPLCom, T01F341_A129BarCod, T01F341_A132BarCodReo, T01F341_A130BarCodPar
            }
            , new Object[] {
            T01F342_A396EmprCod, T01F342_A7145OSSCod
            }
            , new Object[] {
            T01F343_A396EmprCod, T01F343_A7049OGSCod
            }
            , new Object[] {
            T01F344_A396EmprCod, T01F344_A129BarCod, T01F344_A132BarCodReo, T01F344_A130BarCodPar, T01F344_A6031Ac_Barcod, T01F344_A6032Ac_BarReo, T01F344_A6033Ac_BarPar
            }
            , new Object[] {
            T01F345_A396EmprCod, T01F345_A129BarCod, T01F345_A132BarCodReo, T01F345_A130BarCodPar, T01F345_A5908PartPal
            }
            , new Object[] {
            T01F346_A396EmprCod, T01F346_A129BarCod, T01F346_A132BarCodReo, T01F346_A130BarCodPar, T01F346_A2524DisComLin, T01F346_A1056DisComCod, T01F346_A1032FonCod
            }
            , new Object[] {
            T01F347_A396EmprCod, T01F347_A1736AlbExtCod, T01F347_A129BarCod, T01F347_A132BarCodReo, T01F347_A130BarCodPar
            }
            , new Object[] {
            T01F348_A396EmprCod, T01F348_A129BarCod, T01F348_A132BarCodReo, T01F348_A130BarCodPar, T01F348_A3753BarFoaCod, T01F348_A3754BarFoaReo, T01F348_A3755BarFoaPar
            }
            , new Object[] {
            T01F349_A396EmprCod, T01F349_A129BarCod, T01F349_A132BarCodReo, T01F349_A130BarCodPar, T01F349_A3747BarPegCod, T01F349_A3748BarPegReo, T01F349_A3749BarPegPar
            }
            , new Object[] {
            T01F350_A396EmprCod, T01F350_A3253SolTraCod
            }
            , new Object[] {
            T01F351_A396EmprCod, T01F351_A3235SolSubCod
            }
            , new Object[] {
            T01F352_A396EmprCod, T01F352_A3218SolLuzCod
            }
            , new Object[] {
            T01F353_A396EmprCod, T01F353_A3196SolFriCod
            }
            , new Object[] {
            T01F354_A396EmprCod, T01F354_A3165SolPilCod
            }
            , new Object[] {
            T01F355_A396EmprCod, T01F355_A129BarCod, T01F355_A132BarCodReo, T01F355_A130BarCodPar, T01F355_A2872HAnRLinMaq, T01F355_A2873HAnRLinPro, T01F355_A2874HAnRLin, T01F355_A2875HAnNumAny
            }
            , new Object[] {
            T01F356_A396EmprCod, T01F356_A2817PlaTer, T01F356_A2818PlaOrd
            }
            , new Object[] {
            T01F357_A396EmprCod, T01F357_A2809MetTerCod, T01F357_A129BarCod, T01F357_A132BarCodReo, T01F357_A130BarCodPar
            }
            , new Object[] {
            T01F358_A396EmprCod, T01F358_A129BarCod, T01F358_A132BarCodReo, T01F358_A130BarCodPar, T01F358_A2808RecLinMAL, T01F358_A1377RecNumAny, T01F358_A719PrdNum
            }
            , new Object[] {
            T01F359_A396EmprCod, T01F359_A129BarCod, T01F359_A132BarCodReo, T01F359_A130BarCodPar, T01F359_A2804RecLinMaq
            }
            , new Object[] {
            T01F360_A396EmprCod, T01F360_A2792TermiCod, T01F360_A129BarCod, T01F360_A132BarCodReo, T01F360_A130BarCodPar
            }
            , new Object[] {
            T01F361_A396EmprCod, T01F361_A2248ManCod, T01F361_A2711RpExHdFe, T01F361_A2713RpExHdLi
            }
            , new Object[] {
            T01F362_A396EmprCod, T01F362_A2248ManCod, T01F362_A2689ExHdrFas, T01F362_A2692ExHdrLin
            }
            , new Object[] {
            T01F363_A396EmprCod, T01F363_A129BarCod, T01F363_A132BarCodReo, T01F363_A130BarCodPar, T01F363_A2494BarDosPro, T01F363_A719PrdNum
            }
            , new Object[] {
            T01F364_A396EmprCod, T01F364_A602MaqCod, T01F364_A2461PlaFecTin, T01F364_A129BarCod, T01F364_A132BarCodReo, T01F364_A130BarCodPar
            }
            , new Object[] {
            T01F365_A396EmprCod, T01F365_A129BarCod, T01F365_A132BarCodReo, T01F365_A130BarCodPar, T01F365_A2457BarObLin
            }
            , new Object[] {
            T01F366_A396EmprCod, T01F366_A129BarCod, T01F366_A132BarCodReo, T01F366_A130BarCodPar, T01F366_A2444BarEnLin
            }
            , new Object[] {
            T01F367_A396EmprCod, T01F367_A2406ExhAlbCod, T01F367_A129BarCod, T01F367_A132BarCodReo, T01F367_A130BarCodPar
            }
            , new Object[] {
            T01F368_A396EmprCod, T01F368_A2253SalExtAlb, T01F368_A129BarCod, T01F368_A132BarCodReo, T01F368_A130BarCodPar
            }
            , new Object[] {
            T01F369_A396EmprCod, T01F369_A30AlbProCod, T01F369_A129BarCod, T01F369_A132BarCodReo, T01F369_A130BarCodPar
            }
            , new Object[] {
            T01F370_A396EmprCod, T01F370_A1348SolColCod
            }
            , new Object[] {
            T01F371_A396EmprCod, T01F371_A1333EstDimCod
            }
            , new Object[] {
            T01F372_A396EmprCod, T01F372_A1314EnsLabCod
            }
            , new Object[] {
            T01F373_A396EmprCod, T01F373_A129BarCod, T01F373_A132BarCodReo, T01F373_A130BarCodPar, T01F373_A906ObsReoLin
            }
            , new Object[] {
            T01F374_A396EmprCod, T01F374_A859CumCodCont
            }
            , new Object[] {
            T01F375_A396EmprCod, T01F375_A602MaqCod, T01F375_A558HisProFec, T01F375_A561HisProLin
            }
            , new Object[] {
            T01F376_A396EmprCod, T01F376_A252CliCod, T01F376_A494ForSer, T01F376_A482ForColNom, T01F376_A483ForColNum, T01F376_A831TipColCod
            }
            , new Object[] {
            T01F377_A396EmprCod, T01F377_A129BarCod, T01F377_A132BarCodReo, T01F377_A130BarCodPar, T01F377_A200BarPieCod
            }
            , new Object[] {
            T01F378_A396EmprCod, T01F378_A129BarCod, T01F378_A132BarCodReo, T01F378_A130BarCodPar, T01F378_A188BarNotLin
            }
            , new Object[] {
            T01F379_A396EmprCod, T01F379_A129BarCod, T01F379_A132BarCodReo, T01F379_A130BarCodPar, T01F379_A758ProCod
            }
            , new Object[] {
            T01F380_A396EmprCod, T01F380_A129BarCod, T01F380_A132BarCodReo, T01F380_A130BarCodPar, T01F380_A119BarAgrCod, T01F380_A124BarAgrReo, T01F380_A122BarAgrPar
            }
            , new Object[] {
            }
            , new Object[] {
            T01F382_A396EmprCod, T01F382_A129BarCod, T01F382_A132BarCodReo, T01F382_A130BarCodPar
            }
            , new Object[] {
            T01F383_A129BarCod, T01F383_A132BarCodReo, T01F383_A130BarCodPar, T01F383_A3940BarEnsLin, T01F383_A3941BarEnsGru, T01F383_n3941BarEnsGru, T01F383_A3942BarEnsGrLi, T01F383_n3942BarEnsGrLi, T01F383_A3943BarEnsTipo, T01F383_n3943BarEnsTipo,
            T01F383_A3944BarEnsMaxI, T01F383_n3944BarEnsMaxI, T01F383_A3945BarEnsNumI, T01F383_n3945BarEnsNumI, T01F383_A4255BarEnsEqui, T01F383_n4255BarEnsEqui, T01F383_A4256BarEnsFchG, T01F383_n4256BarEnsFchG, T01F383_A4257BarEnsEst, T01F383_n4257BarEnsEst,
            T01F383_A10712BarKgTiras, T01F383_n10712BarKgTiras, T01F383_A10711BarNbTiras, T01F383_n10711BarNbTiras, T01F383_A12894BarKgRtFr, T01F383_n12894BarKgRtFr, T01F383_A396EmprCod
            }
            , new Object[] {
            T01F384_A396EmprCod, T01F384_A129BarCod, T01F384_A132BarCodReo, T01F384_A130BarCodPar, T01F384_A3940BarEnsLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01F388_A396EmprCod, T01F388_A129BarCod, T01F388_A132BarCodReo, T01F388_A130BarCodPar, T01F388_A3940BarEnsLin
            }
         }
      );
   }

   private byte Z132BarCodReo ;
   private byte Z3944BarEnsMaxI ;
   private byte Z3945BarEnsNumI ;
   private byte Z4257BarEnsEst ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A132BarCodReo ;
   private byte A3944BarEnsMaxI ;
   private byte A3945BarEnsNumI ;
   private byte A4257BarEnsEst ;
   private byte Gx_BScreen ;
   private byte GXv_int3[] ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private short Z3940BarEnsLin ;
   private short Z3942BarEnsGrLi ;
   private short Z10711BarNbTiras ;
   private short nRcdDeleted_1561 ;
   private short nRcdExists_1561 ;
   private short nIsMod_1561 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1561 ;
   private short RcdFound1561 ;
   private short nBlankRcdUsr1561 ;
   private short A3940BarEnsLin ;
   private short A3942BarEnsGrLi ;
   private short A10711BarNbTiras ;
   private short RcdFound12 ;
   private short nIsDirty_12 ;
   private short nIsDirty_1561 ;
   private int Z129BarCod ;
   private int Z361DisCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int A361DisCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int A129BarCod ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtavnRcdDeleted_1561_Enabled ;
   private int edtBarEnsLin_Enabled ;
   private int edtBarEnsGru_Enabled ;
   private int edtBarEnsGrLi_Enabled ;
   private int edtBarEnsTipo_Enabled ;
   private int edtBarEnsMaxI_Enabled ;
   private int edtBarEnsNumI_Enabled ;
   private int edtBarEnsEqui_Enabled ;
   private int edtBarEnsFchG_Enabled ;
   private int edtBarEnsEst_Enabled ;
   private int edtBarKgTiras_Enabled ;
   private int edtBarNbTiras_Enabled ;
   private int edtBarKgRtFr_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A252CliCod ;
   private int GX_JID ;
   private int GXv_int2[] ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtBarEnsLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int ZZ361DisCod ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z10712BarKgTiras ;
   private java.math.BigDecimal Z12894BarKgRtFr ;
   private java.math.BigDecimal A10712BarKgTiras ;
   private java.math.BigDecimal A12894BarKgRtFr ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z2759BarMaqGru ;
   private String Z180BarMaqCod ;
   private String Z3941BarEnsGru ;
   private String Z3943BarEnsTipo ;
   private String Z4255BarEnsEqui ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
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
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode1561 ;
   private String edtavnRcdDeleted_1561_Internalname ;
   private String edtBarEnsLin_Internalname ;
   private String edtBarEnsGru_Internalname ;
   private String edtBarEnsGrLi_Internalname ;
   private String edtBarEnsTipo_Internalname ;
   private String edtBarEnsMaxI_Internalname ;
   private String edtBarEnsNumI_Internalname ;
   private String edtBarEnsEqui_Internalname ;
   private String edtBarEnsFchG_Internalname ;
   private String edtBarEnsEst_Internalname ;
   private String edtBarKgTiras_Internalname ;
   private String edtBarNbTiras_Internalname ;
   private String edtBarKgRtFr_Internalname ;
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
   private String A2759BarMaqGru ;
   private String A180BarMaqCod ;
   private String A365DisDes ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode12 ;
   private String GXCCtl ;
   private String A3941BarEnsGru ;
   private String A3943BarEnsTipo ;
   private String A4255BarEnsEqui ;
   private String Z365DisDes ;
   private String Z407EmprNom ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1561_Jsonclick ;
   private String edtBarEnsLin_Jsonclick ;
   private String edtBarEnsGru_Jsonclick ;
   private String edtBarEnsGrLi_Jsonclick ;
   private String edtBarEnsTipo_Jsonclick ;
   private String edtBarEnsMaxI_Jsonclick ;
   private String edtBarEnsNumI_Jsonclick ;
   private String edtBarEnsEqui_Jsonclick ;
   private String edtBarEnsFchG_Jsonclick ;
   private String edtBarEnsEst_Jsonclick ;
   private String edtBarKgTiras_Jsonclick ;
   private String edtBarNbTiras_Jsonclick ;
   private String edtBarKgRtFr_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ2759BarMaqGru ;
   private String ZZ180BarMaqCod ;
   private String ZZ407EmprNom ;
   private String ZZ365DisDes ;
   private java.util.Date Z4256BarEnsFchG ;
   private java.util.Date A4256BarEnsFchG ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n396EmprCod ;
   private boolean wbErr ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean n252CliCod ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n407EmprNom ;
   private boolean n3941BarEnsGru ;
   private boolean n3942BarEnsGrLi ;
   private boolean n3943BarEnsTipo ;
   private boolean n3944BarEnsMaxI ;
   private boolean n3945BarEnsNumI ;
   private boolean n4255BarEnsEqui ;
   private boolean n4256BarEnsFchG ;
   private boolean n4257BarEnsEst ;
   private boolean n10712BarKgTiras ;
   private boolean n10711BarNbTiras ;
   private boolean n12894BarKgRtFr ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private int[] T01F38_A361DisCod ;
   private String[] T01F38_A2759BarMaqGru ;
   private int[] T01F38_A129BarCod ;
   private boolean[] T01F38_n129BarCod ;
   private byte[] T01F38_A132BarCodReo ;
   private boolean[] T01F38_n132BarCodReo ;
   private String[] T01F38_A130BarCodPar ;
   private boolean[] T01F38_n130BarCodPar ;
   private String[] T01F38_A180BarMaqCod ;
   private String[] T01F38_A407EmprNom ;
   private boolean[] T01F38_n407EmprNom ;
   private int[] T01F38_A252CliCod ;
   private boolean[] T01F38_n252CliCod ;
   private String[] T01F38_A365DisDes ;
   private String[] T01F38_A396EmprCod ;
   private boolean[] T01F38_n396EmprCod ;
   private int[] T01F37_A252CliCod ;
   private boolean[] T01F37_n252CliCod ;
   private String[] T01F37_A365DisDes ;
   private String[] T01F36_A407EmprNom ;
   private boolean[] T01F36_n407EmprNom ;
   private String[] T01F39_A407EmprNom ;
   private boolean[] T01F39_n407EmprNom ;
   private int[] T01F310_A252CliCod ;
   private boolean[] T01F310_n252CliCod ;
   private String[] T01F310_A365DisDes ;
   private String[] T01F311_A396EmprCod ;
   private boolean[] T01F311_n396EmprCod ;
   private int[] T01F311_A129BarCod ;
   private boolean[] T01F311_n129BarCod ;
   private byte[] T01F311_A132BarCodReo ;
   private boolean[] T01F311_n132BarCodReo ;
   private String[] T01F311_A130BarCodPar ;
   private boolean[] T01F311_n130BarCodPar ;
   private int[] T01F35_A361DisCod ;
   private String[] T01F35_A2759BarMaqGru ;
   private int[] T01F35_A129BarCod ;
   private boolean[] T01F35_n129BarCod ;
   private byte[] T01F35_A132BarCodReo ;
   private boolean[] T01F35_n132BarCodReo ;
   private String[] T01F35_A130BarCodPar ;
   private boolean[] T01F35_n130BarCodPar ;
   private String[] T01F35_A180BarMaqCod ;
   private String[] T01F35_A396EmprCod ;
   private boolean[] T01F35_n396EmprCod ;
   private int[] T01F35_A252CliCod ;
   private boolean[] T01F35_n252CliCod ;
   private String[] T01F35_A365DisDes ;
   private String[] T01F312_A396EmprCod ;
   private boolean[] T01F312_n396EmprCod ;
   private int[] T01F312_A129BarCod ;
   private boolean[] T01F312_n129BarCod ;
   private byte[] T01F312_A132BarCodReo ;
   private boolean[] T01F312_n132BarCodReo ;
   private String[] T01F312_A130BarCodPar ;
   private boolean[] T01F312_n130BarCodPar ;
   private String[] T01F313_A396EmprCod ;
   private boolean[] T01F313_n396EmprCod ;
   private int[] T01F313_A129BarCod ;
   private boolean[] T01F313_n129BarCod ;
   private byte[] T01F313_A132BarCodReo ;
   private boolean[] T01F313_n132BarCodReo ;
   private String[] T01F313_A130BarCodPar ;
   private boolean[] T01F313_n130BarCodPar ;
   private int[] T01F34_A361DisCod ;
   private String[] T01F34_A2759BarMaqGru ;
   private int[] T01F34_A129BarCod ;
   private boolean[] T01F34_n129BarCod ;
   private byte[] T01F34_A132BarCodReo ;
   private boolean[] T01F34_n132BarCodReo ;
   private String[] T01F34_A130BarCodPar ;
   private boolean[] T01F34_n130BarCodPar ;
   private String[] T01F34_A180BarMaqCod ;
   private String[] T01F34_A396EmprCod ;
   private boolean[] T01F34_n396EmprCod ;
   private int[] T01F34_A252CliCod ;
   private boolean[] T01F34_n252CliCod ;
   private String[] T01F34_A365DisDes ;
   private String[] T01F317_A407EmprNom ;
   private boolean[] T01F317_n407EmprNom ;
   private int[] T01F318_A252CliCod ;
   private boolean[] T01F318_n252CliCod ;
   private String[] T01F318_A365DisDes ;
   private long[] T01F319_A14681MRPrId ;
   private String[] T01F320_A5921XCjaDis ;
   private long[] T01F320_A5922XCjaCod ;
   private String[] T01F321_A396EmprCod ;
   private boolean[] T01F321_n396EmprCod ;
   private int[] T01F321_A129BarCod ;
   private boolean[] T01F321_n129BarCod ;
   private byte[] T01F321_A132BarCodReo ;
   private boolean[] T01F321_n132BarCodReo ;
   private String[] T01F321_A130BarCodPar ;
   private boolean[] T01F321_n130BarCodPar ;
   private short[] T01F321_A14152MEnvOrd ;
   private String[] T01F322_A396EmprCod ;
   private boolean[] T01F322_n396EmprCod ;
   private int[] T01F322_A129BarCod ;
   private boolean[] T01F322_n129BarCod ;
   private byte[] T01F322_A132BarCodReo ;
   private boolean[] T01F322_n132BarCodReo ;
   private String[] T01F322_A130BarCodPar ;
   private boolean[] T01F322_n130BarCodPar ;
   private String[] T01F322_A13905BarTraID ;
   private String[] T01F323_A396EmprCod ;
   private boolean[] T01F323_n396EmprCod ;
   private int[] T01F323_A129BarCod ;
   private boolean[] T01F323_n129BarCod ;
   private byte[] T01F323_A132BarCodReo ;
   private boolean[] T01F323_n132BarCodReo ;
   private String[] T01F323_A130BarCodPar ;
   private boolean[] T01F323_n130BarCodPar ;
   private byte[] T01F323_A13093BarDGLin ;
   private String[] T01F323_A13094BarDGDibCl ;
   private int[] T01F323_A13095BarDGDibIn ;
   private String[] T01F323_A13096BarDGComb ;
   private String[] T01F323_A13097BarDGFOndo ;
   private String[] T01F324_A396EmprCod ;
   private boolean[] T01F324_n396EmprCod ;
   private int[] T01F324_A11917Ebd_numero ;
   private String[] T01F325_A396EmprCod ;
   private boolean[] T01F325_n396EmprCod ;
   private int[] T01F325_A11898Prd_numero ;
   private String[] T01F326_A396EmprCod ;
   private boolean[] T01F326_n396EmprCod ;
   private int[] T01F326_A11849Cte_numero ;
   private String[] T01F327_A396EmprCod ;
   private boolean[] T01F327_n396EmprCod ;
   private int[] T01F327_A11791Ap_numero ;
   private String[] T01F328_A396EmprCod ;
   private boolean[] T01F328_n396EmprCod ;
   private int[] T01F328_A3985CalBarCod ;
   private byte[] T01F328_A3986CalBarCodR ;
   private String[] T01F328_A3987CalBarCodP ;
   private String[] T01F329_A396EmprCod ;
   private boolean[] T01F329_n396EmprCod ;
   private java.util.Date[] T01F329_A5294InPTime ;
   private int[] T01F329_A652OpeCod ;
   private String[] T01F330_A396EmprCod ;
   private boolean[] T01F330_n396EmprCod ;
   private int[] T01F330_A129BarCod ;
   private boolean[] T01F330_n129BarCod ;
   private byte[] T01F330_A132BarCodReo ;
   private boolean[] T01F330_n132BarCodReo ;
   private String[] T01F330_A130BarCodPar ;
   private boolean[] T01F330_n130BarCodPar ;
   private int[] T01F330_A4118tinagrcod ;
   private byte[] T01F330_A4119tinagrreo ;
   private String[] T01F330_A4120tinagrpar ;
   private String[] T01F331_A396EmprCod ;
   private boolean[] T01F331_n396EmprCod ;
   private int[] T01F331_A129BarCod ;
   private boolean[] T01F331_n129BarCod ;
   private byte[] T01F331_A132BarCodReo ;
   private boolean[] T01F331_n132BarCodReo ;
   private String[] T01F331_A130BarCodPar ;
   private boolean[] T01F331_n130BarCodPar ;
   private int[] T01F331_A4080estagrcod ;
   private byte[] T01F331_A4081estagrreo ;
   private String[] T01F331_A4082estagrpar ;
   private String[] T01F332_A396EmprCod ;
   private boolean[] T01F332_n396EmprCod ;
   private int[] T01F332_A129BarCod ;
   private boolean[] T01F332_n129BarCod ;
   private byte[] T01F332_A132BarCodReo ;
   private boolean[] T01F332_n132BarCodReo ;
   private String[] T01F332_A130BarCodPar ;
   private boolean[] T01F332_n130BarCodPar ;
   private byte[] T01F332_A4075recestncol ;
   private byte[] T01F332_A4076recestnpro ;
   private String[] T01F333_A396EmprCod ;
   private boolean[] T01F333_n396EmprCod ;
   private String[] T01F333_A602MaqCod ;
   private String[] T01F333_A1142MaqFCod ;
   private short[] T01F333_A3068PlaEtaOrd ;
   private byte[] T01F333_A3069PlaEtaOrdA ;
   private int[] T01F333_A129BarCod ;
   private boolean[] T01F333_n129BarCod ;
   private byte[] T01F333_A132BarCodReo ;
   private boolean[] T01F333_n132BarCodReo ;
   private String[] T01F333_A130BarCodPar ;
   private boolean[] T01F333_n130BarCodPar ;
   private String[] T01F334_A396EmprCod ;
   private boolean[] T01F334_n396EmprCod ;
   private int[] T01F334_A129BarCod ;
   private boolean[] T01F334_n129BarCod ;
   private byte[] T01F334_A132BarCodReo ;
   private boolean[] T01F334_n132BarCodReo ;
   private String[] T01F334_A130BarCodPar ;
   private boolean[] T01F334_n130BarCodPar ;
   private short[] T01F334_A4846BarAudLin ;
   private String[] T01F335_A396EmprCod ;
   private boolean[] T01F335_n396EmprCod ;
   private int[] T01F335_A129BarCod ;
   private boolean[] T01F335_n129BarCod ;
   private byte[] T01F335_A132BarCodReo ;
   private boolean[] T01F335_n132BarCodReo ;
   private String[] T01F335_A130BarCodPar ;
   private boolean[] T01F335_n130BarCodPar ;
   private int[] T01F335_A3384RefBarCod ;
   private byte[] T01F335_A3385RefBarReo ;
   private String[] T01F335_A3386RefBarPar ;
   private String[] T01F336_A396EmprCod ;
   private boolean[] T01F336_n396EmprCod ;
   private int[] T01F336_A10914SolSalCod ;
   private String[] T01F337_A396EmprCod ;
   private boolean[] T01F337_n396EmprCod ;
   private int[] T01F337_A10364Ph_numero ;
   private String[] T01F338_A396EmprCod ;
   private boolean[] T01F338_n396EmprCod ;
   private int[] T01F338_A129BarCod ;
   private boolean[] T01F338_n129BarCod ;
   private byte[] T01F338_A132BarCodReo ;
   private boolean[] T01F338_n132BarCodReo ;
   private String[] T01F338_A130BarCodPar ;
   private boolean[] T01F338_n130BarCodPar ;
   private String[] T01F338_A10197ProEspCod ;
   private String[] T01F339_A396EmprCod ;
   private boolean[] T01F339_n396EmprCod ;
   private int[] T01F339_A129BarCod ;
   private boolean[] T01F339_n129BarCod ;
   private byte[] T01F339_A132BarCodReo ;
   private boolean[] T01F339_n132BarCodReo ;
   private String[] T01F339_A130BarCodPar ;
   private boolean[] T01F339_n130BarCodPar ;
   private int[] T01F339_A5322Dp_Nrecep ;
   private String[] T01F340_A396EmprCod ;
   private boolean[] T01F340_n396EmprCod ;
   private int[] T01F340_A129BarCod ;
   private boolean[] T01F340_n129BarCod ;
   private byte[] T01F340_A132BarCodReo ;
   private boolean[] T01F340_n132BarCodReo ;
   private String[] T01F340_A130BarCodPar ;
   private boolean[] T01F340_n130BarCodPar ;
   private int[] T01F340_A8569EntSecLn ;
   private String[] T01F341_A396EmprCod ;
   private boolean[] T01F341_n396EmprCod ;
   private int[] T01F341_A7434PLLNro ;
   private short[] T01F341_A7443LPLNro ;
   private short[] T01F341_A7459CPLCom ;
   private int[] T01F341_A129BarCod ;
   private boolean[] T01F341_n129BarCod ;
   private byte[] T01F341_A132BarCodReo ;
   private boolean[] T01F341_n132BarCodReo ;
   private String[] T01F341_A130BarCodPar ;
   private boolean[] T01F341_n130BarCodPar ;
   private String[] T01F342_A396EmprCod ;
   private boolean[] T01F342_n396EmprCod ;
   private int[] T01F342_A7145OSSCod ;
   private String[] T01F343_A396EmprCod ;
   private boolean[] T01F343_n396EmprCod ;
   private int[] T01F343_A7049OGSCod ;
   private String[] T01F344_A396EmprCod ;
   private boolean[] T01F344_n396EmprCod ;
   private int[] T01F344_A129BarCod ;
   private boolean[] T01F344_n129BarCod ;
   private byte[] T01F344_A132BarCodReo ;
   private boolean[] T01F344_n132BarCodReo ;
   private String[] T01F344_A130BarCodPar ;
   private boolean[] T01F344_n130BarCodPar ;
   private int[] T01F344_A6031Ac_Barcod ;
   private byte[] T01F344_A6032Ac_BarReo ;
   private String[] T01F344_A6033Ac_BarPar ;
   private String[] T01F345_A396EmprCod ;
   private boolean[] T01F345_n396EmprCod ;
   private int[] T01F345_A129BarCod ;
   private boolean[] T01F345_n129BarCod ;
   private byte[] T01F345_A132BarCodReo ;
   private boolean[] T01F345_n132BarCodReo ;
   private String[] T01F345_A130BarCodPar ;
   private boolean[] T01F345_n130BarCodPar ;
   private int[] T01F345_A5908PartPal ;
   private String[] T01F346_A396EmprCod ;
   private boolean[] T01F346_n396EmprCod ;
   private int[] T01F346_A129BarCod ;
   private boolean[] T01F346_n129BarCod ;
   private byte[] T01F346_A132BarCodReo ;
   private boolean[] T01F346_n132BarCodReo ;
   private String[] T01F346_A130BarCodPar ;
   private boolean[] T01F346_n130BarCodPar ;
   private byte[] T01F346_A2524DisComLin ;
   private String[] T01F346_A1056DisComCod ;
   private String[] T01F346_A1032FonCod ;
   private String[] T01F347_A396EmprCod ;
   private boolean[] T01F347_n396EmprCod ;
   private long[] T01F347_A1736AlbExtCod ;
   private int[] T01F347_A129BarCod ;
   private boolean[] T01F347_n129BarCod ;
   private byte[] T01F347_A132BarCodReo ;
   private boolean[] T01F347_n132BarCodReo ;
   private String[] T01F347_A130BarCodPar ;
   private boolean[] T01F347_n130BarCodPar ;
   private String[] T01F348_A396EmprCod ;
   private boolean[] T01F348_n396EmprCod ;
   private int[] T01F348_A129BarCod ;
   private boolean[] T01F348_n129BarCod ;
   private byte[] T01F348_A132BarCodReo ;
   private boolean[] T01F348_n132BarCodReo ;
   private String[] T01F348_A130BarCodPar ;
   private boolean[] T01F348_n130BarCodPar ;
   private int[] T01F348_A3753BarFoaCod ;
   private byte[] T01F348_A3754BarFoaReo ;
   private String[] T01F348_A3755BarFoaPar ;
   private String[] T01F349_A396EmprCod ;
   private boolean[] T01F349_n396EmprCod ;
   private int[] T01F349_A129BarCod ;
   private boolean[] T01F349_n129BarCod ;
   private byte[] T01F349_A132BarCodReo ;
   private boolean[] T01F349_n132BarCodReo ;
   private String[] T01F349_A130BarCodPar ;
   private boolean[] T01F349_n130BarCodPar ;
   private int[] T01F349_A3747BarPegCod ;
   private byte[] T01F349_A3748BarPegReo ;
   private String[] T01F349_A3749BarPegPar ;
   private String[] T01F350_A396EmprCod ;
   private boolean[] T01F350_n396EmprCod ;
   private int[] T01F350_A3253SolTraCod ;
   private String[] T01F351_A396EmprCod ;
   private boolean[] T01F351_n396EmprCod ;
   private int[] T01F351_A3235SolSubCod ;
   private String[] T01F352_A396EmprCod ;
   private boolean[] T01F352_n396EmprCod ;
   private int[] T01F352_A3218SolLuzCod ;
   private String[] T01F353_A396EmprCod ;
   private boolean[] T01F353_n396EmprCod ;
   private int[] T01F353_A3196SolFriCod ;
   private String[] T01F354_A396EmprCod ;
   private boolean[] T01F354_n396EmprCod ;
   private int[] T01F354_A3165SolPilCod ;
   private String[] T01F355_A396EmprCod ;
   private boolean[] T01F355_n396EmprCod ;
   private int[] T01F355_A129BarCod ;
   private boolean[] T01F355_n129BarCod ;
   private byte[] T01F355_A132BarCodReo ;
   private boolean[] T01F355_n132BarCodReo ;
   private String[] T01F355_A130BarCodPar ;
   private boolean[] T01F355_n130BarCodPar ;
   private short[] T01F355_A2872HAnRLinMaq ;
   private byte[] T01F355_A2873HAnRLinPro ;
   private short[] T01F355_A2874HAnRLin ;
   private byte[] T01F355_A2875HAnNumAny ;
   private String[] T01F356_A396EmprCod ;
   private boolean[] T01F356_n396EmprCod ;
   private String[] T01F356_A2817PlaTer ;
   private short[] T01F356_A2818PlaOrd ;
   private String[] T01F357_A396EmprCod ;
   private boolean[] T01F357_n396EmprCod ;
   private String[] T01F357_A2809MetTerCod ;
   private int[] T01F357_A129BarCod ;
   private boolean[] T01F357_n129BarCod ;
   private byte[] T01F357_A132BarCodReo ;
   private boolean[] T01F357_n132BarCodReo ;
   private String[] T01F357_A130BarCodPar ;
   private boolean[] T01F357_n130BarCodPar ;
   private String[] T01F358_A396EmprCod ;
   private boolean[] T01F358_n396EmprCod ;
   private int[] T01F358_A129BarCod ;
   private boolean[] T01F358_n129BarCod ;
   private byte[] T01F358_A132BarCodReo ;
   private boolean[] T01F358_n132BarCodReo ;
   private String[] T01F358_A130BarCodPar ;
   private boolean[] T01F358_n130BarCodPar ;
   private short[] T01F358_A2808RecLinMAL ;
   private byte[] T01F358_A1377RecNumAny ;
   private String[] T01F358_A719PrdNum ;
   private String[] T01F359_A396EmprCod ;
   private boolean[] T01F359_n396EmprCod ;
   private int[] T01F359_A129BarCod ;
   private boolean[] T01F359_n129BarCod ;
   private byte[] T01F359_A132BarCodReo ;
   private boolean[] T01F359_n132BarCodReo ;
   private String[] T01F359_A130BarCodPar ;
   private boolean[] T01F359_n130BarCodPar ;
   private short[] T01F359_A2804RecLinMaq ;
   private String[] T01F360_A396EmprCod ;
   private boolean[] T01F360_n396EmprCod ;
   private String[] T01F360_A2792TermiCod ;
   private int[] T01F360_A129BarCod ;
   private boolean[] T01F360_n129BarCod ;
   private byte[] T01F360_A132BarCodReo ;
   private boolean[] T01F360_n132BarCodReo ;
   private String[] T01F360_A130BarCodPar ;
   private boolean[] T01F360_n130BarCodPar ;
   private String[] T01F361_A396EmprCod ;
   private boolean[] T01F361_n396EmprCod ;
   private short[] T01F361_A2248ManCod ;
   private java.util.Date[] T01F361_A2711RpExHdFe ;
   private short[] T01F361_A2713RpExHdLi ;
   private String[] T01F362_A396EmprCod ;
   private boolean[] T01F362_n396EmprCod ;
   private short[] T01F362_A2248ManCod ;
   private String[] T01F362_A2689ExHdrFas ;
   private int[] T01F362_A2692ExHdrLin ;
   private String[] T01F363_A396EmprCod ;
   private boolean[] T01F363_n396EmprCod ;
   private int[] T01F363_A129BarCod ;
   private boolean[] T01F363_n129BarCod ;
   private byte[] T01F363_A132BarCodReo ;
   private boolean[] T01F363_n132BarCodReo ;
   private String[] T01F363_A130BarCodPar ;
   private boolean[] T01F363_n130BarCodPar ;
   private String[] T01F363_A2494BarDosPro ;
   private String[] T01F363_A719PrdNum ;
   private String[] T01F364_A396EmprCod ;
   private boolean[] T01F364_n396EmprCod ;
   private String[] T01F364_A602MaqCod ;
   private java.util.Date[] T01F364_A2461PlaFecTin ;
   private int[] T01F364_A129BarCod ;
   private boolean[] T01F364_n129BarCod ;
   private byte[] T01F364_A132BarCodReo ;
   private boolean[] T01F364_n132BarCodReo ;
   private String[] T01F364_A130BarCodPar ;
   private boolean[] T01F364_n130BarCodPar ;
   private String[] T01F365_A396EmprCod ;
   private boolean[] T01F365_n396EmprCod ;
   private int[] T01F365_A129BarCod ;
   private boolean[] T01F365_n129BarCod ;
   private byte[] T01F365_A132BarCodReo ;
   private boolean[] T01F365_n132BarCodReo ;
   private String[] T01F365_A130BarCodPar ;
   private boolean[] T01F365_n130BarCodPar ;
   private short[] T01F365_A2457BarObLin ;
   private String[] T01F366_A396EmprCod ;
   private boolean[] T01F366_n396EmprCod ;
   private int[] T01F366_A129BarCod ;
   private boolean[] T01F366_n129BarCod ;
   private byte[] T01F366_A132BarCodReo ;
   private boolean[] T01F366_n132BarCodReo ;
   private String[] T01F366_A130BarCodPar ;
   private boolean[] T01F366_n130BarCodPar ;
   private short[] T01F366_A2444BarEnLin ;
   private String[] T01F367_A396EmprCod ;
   private boolean[] T01F367_n396EmprCod ;
   private int[] T01F367_A2406ExhAlbCod ;
   private int[] T01F367_A129BarCod ;
   private boolean[] T01F367_n129BarCod ;
   private byte[] T01F367_A132BarCodReo ;
   private boolean[] T01F367_n132BarCodReo ;
   private String[] T01F367_A130BarCodPar ;
   private boolean[] T01F367_n130BarCodPar ;
   private String[] T01F368_A396EmprCod ;
   private boolean[] T01F368_n396EmprCod ;
   private int[] T01F368_A2253SalExtAlb ;
   private int[] T01F368_A129BarCod ;
   private boolean[] T01F368_n129BarCod ;
   private byte[] T01F368_A132BarCodReo ;
   private boolean[] T01F368_n132BarCodReo ;
   private String[] T01F368_A130BarCodPar ;
   private boolean[] T01F368_n130BarCodPar ;
   private String[] T01F369_A396EmprCod ;
   private boolean[] T01F369_n396EmprCod ;
   private long[] T01F369_A30AlbProCod ;
   private int[] T01F369_A129BarCod ;
   private boolean[] T01F369_n129BarCod ;
   private byte[] T01F369_A132BarCodReo ;
   private boolean[] T01F369_n132BarCodReo ;
   private String[] T01F369_A130BarCodPar ;
   private boolean[] T01F369_n130BarCodPar ;
   private String[] T01F370_A396EmprCod ;
   private boolean[] T01F370_n396EmprCod ;
   private int[] T01F370_A1348SolColCod ;
   private String[] T01F371_A396EmprCod ;
   private boolean[] T01F371_n396EmprCod ;
   private int[] T01F371_A1333EstDimCod ;
   private String[] T01F372_A396EmprCod ;
   private boolean[] T01F372_n396EmprCod ;
   private int[] T01F372_A1314EnsLabCod ;
   private String[] T01F373_A396EmprCod ;
   private boolean[] T01F373_n396EmprCod ;
   private int[] T01F373_A129BarCod ;
   private boolean[] T01F373_n129BarCod ;
   private byte[] T01F373_A132BarCodReo ;
   private boolean[] T01F373_n132BarCodReo ;
   private String[] T01F373_A130BarCodPar ;
   private boolean[] T01F373_n130BarCodPar ;
   private byte[] T01F373_A906ObsReoLin ;
   private String[] T01F374_A396EmprCod ;
   private boolean[] T01F374_n396EmprCod ;
   private int[] T01F374_A859CumCodCont ;
   private String[] T01F375_A396EmprCod ;
   private boolean[] T01F375_n396EmprCod ;
   private String[] T01F375_A602MaqCod ;
   private java.util.Date[] T01F375_A558HisProFec ;
   private int[] T01F375_A561HisProLin ;
   private String[] T01F376_A396EmprCod ;
   private boolean[] T01F376_n396EmprCod ;
   private int[] T01F376_A252CliCod ;
   private boolean[] T01F376_n252CliCod ;
   private String[] T01F376_A494ForSer ;
   private String[] T01F376_A482ForColNom ;
   private int[] T01F376_A483ForColNum ;
   private byte[] T01F376_A831TipColCod ;
   private String[] T01F377_A396EmprCod ;
   private boolean[] T01F377_n396EmprCod ;
   private int[] T01F377_A129BarCod ;
   private boolean[] T01F377_n129BarCod ;
   private byte[] T01F377_A132BarCodReo ;
   private boolean[] T01F377_n132BarCodReo ;
   private String[] T01F377_A130BarCodPar ;
   private boolean[] T01F377_n130BarCodPar ;
   private String[] T01F377_A200BarPieCod ;
   private String[] T01F378_A396EmprCod ;
   private boolean[] T01F378_n396EmprCod ;
   private int[] T01F378_A129BarCod ;
   private boolean[] T01F378_n129BarCod ;
   private byte[] T01F378_A132BarCodReo ;
   private boolean[] T01F378_n132BarCodReo ;
   private String[] T01F378_A130BarCodPar ;
   private boolean[] T01F378_n130BarCodPar ;
   private byte[] T01F378_A188BarNotLin ;
   private String[] T01F379_A396EmprCod ;
   private boolean[] T01F379_n396EmprCod ;
   private int[] T01F379_A129BarCod ;
   private boolean[] T01F379_n129BarCod ;
   private byte[] T01F379_A132BarCodReo ;
   private boolean[] T01F379_n132BarCodReo ;
   private String[] T01F379_A130BarCodPar ;
   private boolean[] T01F379_n130BarCodPar ;
   private String[] T01F379_A758ProCod ;
   private String[] T01F380_A396EmprCod ;
   private boolean[] T01F380_n396EmprCod ;
   private int[] T01F380_A129BarCod ;
   private boolean[] T01F380_n129BarCod ;
   private byte[] T01F380_A132BarCodReo ;
   private boolean[] T01F380_n132BarCodReo ;
   private String[] T01F380_A130BarCodPar ;
   private boolean[] T01F380_n130BarCodPar ;
   private int[] T01F380_A119BarAgrCod ;
   private byte[] T01F380_A124BarAgrReo ;
   private String[] T01F380_A122BarAgrPar ;
   private String[] T01F382_A396EmprCod ;
   private boolean[] T01F382_n396EmprCod ;
   private int[] T01F382_A129BarCod ;
   private boolean[] T01F382_n129BarCod ;
   private byte[] T01F382_A132BarCodReo ;
   private boolean[] T01F382_n132BarCodReo ;
   private String[] T01F382_A130BarCodPar ;
   private boolean[] T01F382_n130BarCodPar ;
   private int[] T01F383_A129BarCod ;
   private boolean[] T01F383_n129BarCod ;
   private byte[] T01F383_A132BarCodReo ;
   private boolean[] T01F383_n132BarCodReo ;
   private String[] T01F383_A130BarCodPar ;
   private boolean[] T01F383_n130BarCodPar ;
   private short[] T01F383_A3940BarEnsLin ;
   private String[] T01F383_A3941BarEnsGru ;
   private boolean[] T01F383_n3941BarEnsGru ;
   private short[] T01F383_A3942BarEnsGrLi ;
   private boolean[] T01F383_n3942BarEnsGrLi ;
   private String[] T01F383_A3943BarEnsTipo ;
   private boolean[] T01F383_n3943BarEnsTipo ;
   private byte[] T01F383_A3944BarEnsMaxI ;
   private boolean[] T01F383_n3944BarEnsMaxI ;
   private byte[] T01F383_A3945BarEnsNumI ;
   private boolean[] T01F383_n3945BarEnsNumI ;
   private String[] T01F383_A4255BarEnsEqui ;
   private boolean[] T01F383_n4255BarEnsEqui ;
   private java.util.Date[] T01F383_A4256BarEnsFchG ;
   private boolean[] T01F383_n4256BarEnsFchG ;
   private byte[] T01F383_A4257BarEnsEst ;
   private boolean[] T01F383_n4257BarEnsEst ;
   private java.math.BigDecimal[] T01F383_A10712BarKgTiras ;
   private boolean[] T01F383_n10712BarKgTiras ;
   private short[] T01F383_A10711BarNbTiras ;
   private boolean[] T01F383_n10711BarNbTiras ;
   private java.math.BigDecimal[] T01F383_A12894BarKgRtFr ;
   private boolean[] T01F383_n12894BarKgRtFr ;
   private String[] T01F383_A396EmprCod ;
   private boolean[] T01F383_n396EmprCod ;
   private String[] T01F384_A396EmprCod ;
   private boolean[] T01F384_n396EmprCod ;
   private int[] T01F384_A129BarCod ;
   private boolean[] T01F384_n129BarCod ;
   private byte[] T01F384_A132BarCodReo ;
   private boolean[] T01F384_n132BarCodReo ;
   private String[] T01F384_A130BarCodPar ;
   private boolean[] T01F384_n130BarCodPar ;
   private short[] T01F384_A3940BarEnsLin ;
   private int[] T01F33_A129BarCod ;
   private boolean[] T01F33_n129BarCod ;
   private byte[] T01F33_A132BarCodReo ;
   private boolean[] T01F33_n132BarCodReo ;
   private String[] T01F33_A130BarCodPar ;
   private boolean[] T01F33_n130BarCodPar ;
   private short[] T01F33_A3940BarEnsLin ;
   private String[] T01F33_A3941BarEnsGru ;
   private boolean[] T01F33_n3941BarEnsGru ;
   private short[] T01F33_A3942BarEnsGrLi ;
   private boolean[] T01F33_n3942BarEnsGrLi ;
   private String[] T01F33_A3943BarEnsTipo ;
   private boolean[] T01F33_n3943BarEnsTipo ;
   private byte[] T01F33_A3944BarEnsMaxI ;
   private boolean[] T01F33_n3944BarEnsMaxI ;
   private byte[] T01F33_A3945BarEnsNumI ;
   private boolean[] T01F33_n3945BarEnsNumI ;
   private String[] T01F33_A4255BarEnsEqui ;
   private boolean[] T01F33_n4255BarEnsEqui ;
   private java.util.Date[] T01F33_A4256BarEnsFchG ;
   private boolean[] T01F33_n4256BarEnsFchG ;
   private byte[] T01F33_A4257BarEnsEst ;
   private boolean[] T01F33_n4257BarEnsEst ;
   private java.math.BigDecimal[] T01F33_A10712BarKgTiras ;
   private boolean[] T01F33_n10712BarKgTiras ;
   private short[] T01F33_A10711BarNbTiras ;
   private boolean[] T01F33_n10711BarNbTiras ;
   private java.math.BigDecimal[] T01F33_A12894BarKgRtFr ;
   private boolean[] T01F33_n12894BarKgRtFr ;
   private String[] T01F33_A396EmprCod ;
   private boolean[] T01F33_n396EmprCod ;
   private int[] T01F32_A129BarCod ;
   private boolean[] T01F32_n129BarCod ;
   private byte[] T01F32_A132BarCodReo ;
   private boolean[] T01F32_n132BarCodReo ;
   private String[] T01F32_A130BarCodPar ;
   private boolean[] T01F32_n130BarCodPar ;
   private short[] T01F32_A3940BarEnsLin ;
   private String[] T01F32_A3941BarEnsGru ;
   private boolean[] T01F32_n3941BarEnsGru ;
   private short[] T01F32_A3942BarEnsGrLi ;
   private boolean[] T01F32_n3942BarEnsGrLi ;
   private String[] T01F32_A3943BarEnsTipo ;
   private boolean[] T01F32_n3943BarEnsTipo ;
   private byte[] T01F32_A3944BarEnsMaxI ;
   private boolean[] T01F32_n3944BarEnsMaxI ;
   private byte[] T01F32_A3945BarEnsNumI ;
   private boolean[] T01F32_n3945BarEnsNumI ;
   private String[] T01F32_A4255BarEnsEqui ;
   private boolean[] T01F32_n4255BarEnsEqui ;
   private java.util.Date[] T01F32_A4256BarEnsFchG ;
   private boolean[] T01F32_n4256BarEnsFchG ;
   private byte[] T01F32_A4257BarEnsEst ;
   private boolean[] T01F32_n4257BarEnsEst ;
   private java.math.BigDecimal[] T01F32_A10712BarKgTiras ;
   private boolean[] T01F32_n10712BarKgTiras ;
   private short[] T01F32_A10711BarNbTiras ;
   private boolean[] T01F32_n10711BarNbTiras ;
   private java.math.BigDecimal[] T01F32_A12894BarKgRtFr ;
   private boolean[] T01F32_n12894BarKgRtFr ;
   private String[] T01F32_A396EmprCod ;
   private boolean[] T01F32_n396EmprCod ;
   private String[] T01F388_A396EmprCod ;
   private boolean[] T01F388_n396EmprCod ;
   private int[] T01F388_A129BarCod ;
   private boolean[] T01F388_n129BarCod ;
   private byte[] T01F388_A132BarCodReo ;
   private boolean[] T01F388_n132BarCodReo ;
   private String[] T01F388_A130BarCodPar ;
   private boolean[] T01F388_n130BarCodPar ;
   private short[] T01F388_A3940BarEnsLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tbarens__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbarens__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbarens__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbarens__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbarens__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01F32", "SELECT BarCod, BarCodReo, BarCodPar, BarEnsLin, BarEnsGru, BarEnsGrLi, BarEnsTipo, BarEnsMaxI, BarEnsNumI, BarEnsEqui, BarEnsFchG, BarEnsEst, BarKgTiras, BarNbTiras, BarKgRtFr, EmprCod FROM TXPBARENS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarEnsLin = ?  FOR UPDATE OF BarEnsGru, BarEnsGrLi, BarEnsTipo, BarEnsMaxI, BarEnsNumI, BarEnsEqui, BarEnsFchG, BarEnsEst, BarKgTiras, BarNbTiras, BarKgRtFr NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F33", "SELECT BarCod, BarCodReo, BarCodPar, BarEnsLin, BarEnsGru, BarEnsGrLi, BarEnsTipo, BarEnsMaxI, BarEnsNumI, BarEnsEqui, BarEnsFchG, BarEnsEst, BarKgTiras, BarNbTiras, BarKgRtFr, EmprCod FROM TXPBARENS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarEnsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F34", "SELECT DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, EmprCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF DisCod, BarMaqGru, BarMaqCod, CliCod, DisDes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F35", "SELECT DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, EmprCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F36", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F37", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F38", "SELECT /*+ FIRST_ROWS(100) */ TM1.DisCod, TM1.BarMaqGru, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarMaqCod, T2.EmprNom, TM1.CliCod, TM1.DisDes, TM1.EmprCod FROM (TXPBARCAD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F39", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F310", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F311", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F312", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE ( EmprCod > ? or EmprCod = ? and BarCod > ? or BarCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar > ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F313", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE ( EmprCod < ? or EmprCod = ? and BarCod < ? or BarCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar < ?) ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01F314", "INSERT INTO TXPBARCAD(DisDes, DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, EmprCod, CliCod, BarAgrEst, BarVolMaq, BarDisNum, BarSer, BarTipArt, BarColNom, BarColNum, BarTipCol, BarFecGen, BarNumUni, BarUniMed, BarEstReo, BarFecCli, BarNumPie, BarOrdReo, BarFecEnt, BarMaqPro, BarOpeEsp, BarFecSal, BarUrg, BarDiaP, BarMat, BarRdt, BarTra1, BarTraP1, BarTra2, BarTraP2, BarTra3, BarTraP3, BarUrd1, BarUrdP1, BarUrd2, BarUrdP2, BarUrd3, BarUrdP3, BarAncCru1, BarAncCru2, BarAncAca1, BarAncAca2, BarPle, BarLar, BarSua, BarAcaQui, BarCorOri, BarEncOri, BarEst, BarSit, BarPri, BarConReo, BarConPar, BarNumAny, BarCosPro, BarCosAny, BarKgsFac, BarHorCum, BarFecFpr, BarEstCol, BarEstRes, BarNumAso, BarDisOri, BarLis, NotUltLin, BarPes, TipDefCod, TipDefPor, ObsReoEnt, ObsReoULin, BarReoCod, BarReoReo, BarReoPar, BarFecLan, BarMatiz, BarEncCom, BarEncAnh, BarGraCru, BarNomCli, BarNumCli, BarPesBal, BarLocDis, BarNMtr, BarNMez, BarPart, BarSerDsc, BarLisInd, BarNumTen, BarCodTN, BarTipDis, BarExt, BarCliDes, BarManCod, BarNumPas, BarFecEnE, BarBulEnE, BarKgEnE, BarEntEnE, BarEnULin, BarFecEnR, BarBulEnR, BarKgEnR, BarTipAca, BarGirar, BarNMont, BarTemSec, BarCal, BarEntAca, BarObsVL, BarGraAca, BarRdoN, BarRdoA, BarColPes, BarPrdPes, BarRDos1, BarRDos2, BarFecIni, BarFecFin, BarConAgu, BarConVap, BarConEle, BarCodTex, BarNumTex1, BarNumTex2, BarSitExt, UltLinMaq, BarNumLot, BarKgsLot, BarMtrLot, BarProPer, BarIntPer, BarCoef, BarPlf, BarPle2, BarNumCor, BarAncSal1, BarAncSal2, BarAncSal3, BarGraAca2, BarGraCru2, BarFac, BarManCod1, BarManCod2, BarNumTon, BarMacCod, BarPeg, BarFoa, BarNPed, BarEnvRec, BarFecLRe, BarFecCRe, BarDibCli, BarDibInt, BarComULin, BarEnv, BarTin, BarInci, BarBot, BarSitEst, BarPelAnh, BarCruMts, BarCruKgs, BarCruEnr, BarLotPza, BarLotMts, BarLotKgs, BarLotMaq, BarAcaFor, BarAcaBak, BarAcaAnh, BarAcaMar, BarMdlCod, BarTam, BarHorEnt, BarPzas, BarHorReg, BarDishCod, BarEncCli, BarAudSup, BarAudObs, BarMacPro, BarCtrPdas, BarNumReo, BarLoteA, BarTipEst, BarGraCob, BarCom, BarEstTip, BarBp12, BarBp13, BarBp14, BarBp15, BarFacAbs, BarAcc, BarTipCor, BarCodBan, BarObsGrm, BarObsAnc, BarAntp, BarAntpT, BarAsi, BarMaqEst, BarFecHis, BarOpeHis, EntSecUlt, BarItem1, barItem2, BarItem3, BarItem4, BarItem5, BarItem6, BarAudFec, BarAudTur, BarAudOpe, BarAudOpeN, BarAudSupN, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarOrdComp, BarPriTin, BarMaqAma, BarVolAma, BarKilLam, BarRecLis, BarAnyTie, BarUltAny, BarEnvBar, BarKgsPrv, BarMtsPrv, BarPiePrv, BarPieKgl, BarPieMtl, BarEnvLaw, Nxt_Mdlo2, Nxt_Sta2, Nxt_ArtCl2, Nxt_cpeID, Nxt_dpoID, Nxt_desaID, SubRevID, BarTpEstam, BarProdID, BarLocTel, BarLocMol, BarLocCol, BarOEKOTEX, BarLineaID, BarCanalID, BarLinPrd, BarDGUltLi, BarRGB, BarRdto4, BarSerDsc2, BarIdtx2, BarCnoEncO, BarPriorid) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0)", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T01F315", "UPDATE TXPBARCAD SET DisDes=?, DisCod=?, BarMaqGru=?, BarMaqCod=?, CliCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T01F316", "DELETE FROM TXPBARCAD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new ForEachCursor("T01F317", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F318", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F319", "SELECT * FROM (SELECT MRPrId FROM MRPr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F320", "SELECT * FROM (SELECT XCjaDis, XCjaCod FROM TXPXCaCja WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F321", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F322", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarTraID FROM TXPBARTTI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F323", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDGLin, BarDGDibCl, BarDGDibIn, BarDGComb, BarDGFOndo FROM TXPDIGBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F324", "SELECT * FROM (SELECT EmprCod, Ebd_numero FROM TXPEMBDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F325", "SELECT * FROM (SELECT EmprCod, Prd_numero FROM TXPPRIDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F326", "SELECT * FROM (SELECT EmprCod, Cte_numero FROM TXPCONTTE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F327", "SELECT * FROM (SELECT EmprCod, Ap_numero FROM TXPTAPAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F328", "SELECT * FROM (SELECT EmprCod, CalBarCod, CalBarCodR, CalBarCodP FROM TXPCALJBP WHERE EmprCod = ? AND CalBarCod = ? AND CalBarCodR = ? AND CalBarCodP = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F329", "SELECT * FROM (SELECT EmprCod, InPTime, OpeCod FROM TXPINCPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F330", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, tinagrcod, tinagrreo, tinagrpar FROM TXPtinagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F331", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, estagrcod, estagrreo, estagrpar FROM TXPestagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F332", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro FROM TXPcreest WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F333", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFCod, PlaEtaOrd, PlaEtaOrdA, BarCod, BarCodReo, BarCodPar FROM TXPPLAETA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F334", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAudLin FROM TXPBARAUD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F335", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RefBarCod, RefBarReo, RefBarPar FROM TXPREFHDR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F336", "SELECT * FROM (SELECT EmprCod, SolSalCod FROM TXPSOLSAL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F337", "SELECT * FROM (SELECT EmprCod, Ph_numero FROM TXPTPH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F338", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProEspCod FROM TXPBarPE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F339", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep FROM TXPUBIDEP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F340", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, EntSecLn FROM TXPENTSEC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F341", "SELECT * FROM (SELECT EmprCod, PLLNro, LPLNro, CPLCom, BarCod, BarCodReo, BarCodPar FROM TXPPLLBar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F342", "SELECT * FROM (SELECT EmprCod, OSSCod FROM TXPShaSep WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F343", "SELECT * FROM (SELECT EmprCod, OGSCod FROM TXPShaGra WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F344", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar FROM TXPHDRACA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F345", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, PartPal FROM TXPPalSal WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F346", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPBARCOM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F347", "SELECT * FROM (SELECT EmprCod, AlbExtCod, BarCod, BarCodReo, BarCodPar FROM TXPLALEXT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F348", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFoaCod, BarFoaReo, BarFoaPar FROM TXPBARFOA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F349", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPegCod, BarPegReo, BarPegPar FROM TXPBARPEG WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F350", "SELECT * FROM (SELECT EmprCod, SolTraCod FROM TXPCTRASP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F351", "SELECT * FROM (SELECT EmprCod, SolSubCod FROM TXPCSUBLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F352", "SELECT * FROM (SELECT EmprCod, SolLuzCod FROM TXPCSOLLU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F353", "SELECT * FROM (SELECT EmprCod, SolFriCod FROM TXPCFRICC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F354", "SELECT * FROM (SELECT EmprCod, SolPilCod FROM TXPCPILLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F355", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, HAnRLinMaq, HAnRLinPro, HAnRLin, HAnNumAny FROM TXPHISANY WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F356", "SELECT * FROM (SELECT EmprCod, PlaTer, PlaOrd FROM TXPPLAPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F357", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F358", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F359", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F360", "SELECT * FROM (SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar FROM TXPBARTER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F361", "SELECT * FROM (SELECT EmprCod, ManCod, RpExHdFe, RpExHdLi FROM TXPLREXHD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F362", "SELECT * FROM (SELECT EmprCod, ManCod, ExHdrFas, ExHdrLin FROM TXPLEXMVH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F363", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F364", "SELECT * FROM (SELECT EmprCod, MaqCod, PlaFecTin, BarCod, BarCodReo, BarCodPar FROM TXPLPLATI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F365", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarObLin FROM TXPBAROBA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F366", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnLin FROM TXPBAROBE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F367", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F368", "SELECT * FROM (SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F369", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F370", "SELECT * FROM (SELECT EmprCod, SolColCod FROM TXPCSOLCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F371", "SELECT * FROM (SELECT EmprCod, EstDimCod FROM TXPCESDIM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F372", "SELECT * FROM (SELECT EmprCod, EnsLabCod FROM TXPCENLAB WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F373", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ObsReoLin FROM TXPOBSREO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F374", "SELECT * FROM (SELECT EmprCod, CumCodCont FROM TXPCCUMCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F375", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F376", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F377", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F378", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F379", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F380", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01F381", "UPDATE TXPINCPRO SET CliCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPINCPRO")
         ,new ForEachCursor("T01F382", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F383", "SELECT BarCod, BarCodReo, BarCodPar, BarEnsLin, BarEnsGru, BarEnsGrLi, BarEnsTipo, BarEnsMaxI, BarEnsNumI, BarEnsEqui, BarEnsFchG, BarEnsEst, BarKgTiras, BarNbTiras, BarKgRtFr, EmprCod FROM TXPBARENS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarEnsLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarEnsLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F384", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnsLin FROM TXPBARENS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarEnsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01F385", "INSERT INTO TXPBARENS(BarCod, BarCodReo, BarCodPar, BarEnsLin, BarEnsGru, BarEnsGrLi, BarEnsTipo, BarEnsMaxI, BarEnsNumI, BarEnsEqui, BarEnsFchG, BarEnsEst, BarKgTiras, BarNbTiras, BarKgRtFr, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPBARENS")
         ,new UpdateCursor("T01F386", "UPDATE TXPBARENS SET BarEnsGru=?, BarEnsGrLi=?, BarEnsTipo=?, BarEnsMaxI=?, BarEnsNumI=?, BarEnsEqui=?, BarEnsFchG=?, BarEnsEst=?, BarKgTiras=?, BarNbTiras=?, BarKgRtFr=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarEnsLin = ?", GX_NOMASK, "TXPBARENS")
         ,new UpdateCursor("T01F387", "DELETE FROM TXPBARENS  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarEnsLin = ?", GX_NOMASK, "TXPBARENS")
         ,new ForEachCursor("T01F388", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnsLin FROM TXPBARENS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarEnsLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(14);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(14);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((String[]) buf[11])[0] = rslt.getString(10, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 17 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 81 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(14);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 3);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setShort(5, ((Number) parms[8]).shortValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setShort(5, ((Number) parms[8]).shortValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 3);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 3);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 1);
               }
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 3);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 3);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 1);
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 1);
               }
               stmt.setString(7, (String)parms[9], 6);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 3);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[13]).intValue());
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               stmt.setString(4, (String)parms[3], 6);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 3);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[13], 1);
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 24 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 25 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 26 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 27 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 28 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 29 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 31 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 32 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 33 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 34 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 35 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 36 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 37 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 38 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 39 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 40 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 41 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 42 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 43 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 44 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 45 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 46 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 47 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 48 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 49 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 50 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 51 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 52 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 53 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 54 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 55 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 56 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 57 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 58 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 59 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
      }
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 61 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 62 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 63 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 64 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 65 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 66 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 67 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 68 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 69 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 70 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 71 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 72 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 73 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 74 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 75 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 76 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 77 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 78 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 79 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               return;
            case 81 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setShort(5, ((Number) parms[8]).shortValue());
               return;
            case 82 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setShort(5, ((Number) parms[8]).shortValue());
               return;
            case 83 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               stmt.setShort(4, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 4);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 3);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[14]).byteValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[16]).byteValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DATE );
               }
               else
               {
                  stmt.setDate(11, (java.util.Date)parms[20]);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[22]).byteValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[26]).shortValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[30], 3);
               }
               return;
            case 84 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
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
                  stmt.setString(3, (String)parms[5], 3);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 3);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[25]).intValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[27]).byteValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 1);
               }
               stmt.setShort(16, ((Number) parms[30]).shortValue());
               return;
            case 85 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setShort(5, ((Number) parms[8]).shortValue());
               return;
            case 86 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
      }
   }

}

