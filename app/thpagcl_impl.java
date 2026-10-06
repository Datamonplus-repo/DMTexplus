package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class thpagcl_impl extends GXDataArea
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
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A252CliCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "HISTORICO PAGOS", ""), (short)(0)) ;
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

   public thpagcl_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public thpagcl_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( thpagcl_impl.class ));
   }

   public thpagcl_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPAGCL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPAGCL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPAGCL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPAGCL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_THPAGCL.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPAGCL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPAGCL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPAGCL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPAGCL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "N Factura", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPAGCL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHpagIden_Internalname, GXutil.ltrim( localUtil.ntoc( A11248HpagIden, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHpagIden_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11248HpagIden), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11248HpagIden), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHpagIden_Jsonclick, 0, "", "", "", "", "", 1, edtHpagIden_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THPAGCL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPAGCL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Ultimo LInea", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPAGCL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHpagUltl_Internalname, GXutil.ltrim( localUtil.ntoc( A11249HpagUltl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHpagUltl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11249HpagUltl), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11249HpagUltl), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHpagUltl_Jsonclick, 0, "", "", "", "", "", 1, edtHpagUltl_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THPAGCL.htm");
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
         nBlankRcdCount1499 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1499 = (short)(1) ;
            scanStart1BB1499( ) ;
            while ( RcdFound1499 != 0 )
            {
               init_level_properties1499( ) ;
               getByPrimaryKey1BB1499( ) ;
               addRow1BB1499( ) ;
               scanNext1BB1499( ) ;
            }
            scanEnd1BB1499( ) ;
            nBlankRcdCount1499 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1BB1499( ) ;
         standaloneModal1BB1499( ) ;
         sMode1499 = Gx_mode ;
         while ( nGXsfl_40_idx < nRC_GXsfl_40 )
         {
            bGXsfl_40_Refreshing = true ;
            readRow1BB1499( ) ;
            edtavnRcdDeleted_1499_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1499_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1499_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1499_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtHpagLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HPAGLIN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHpagLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHpagLin_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtHpagfec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HPAGFEC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHpagfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHpagfec_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtHpagImpo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HPAGIMPO_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHpagImpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHpagImpo_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtCliNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLINOM_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtHpagDoc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HPAGDOC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHpagDoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHpagDoc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtHpagTerm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HPAGTERM_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHpagTerm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHpagTerm_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtHpagFechh_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HPAGFECHH_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHpagFechh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHpagFechh_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtHpagUsur_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HPAGUSUR_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHpagUsur_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHpagUsur_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            if ( ( nRcdExists_1499 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1BB1499( ) ;
            }
            sendRow1BB1499( ) ;
            bGXsfl_40_Refreshing = false ;
         }
         Gx_mode = sMode1499 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1499 = (short)(5) ;
         nRcdExists_1499 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1BB1499( ) ;
            while ( RcdFound1499 != 0 )
            {
               sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_401499( ) ;
               init_level_properties1499( ) ;
               standaloneNotModal1BB1499( ) ;
               getByPrimaryKey1BB1499( ) ;
               standaloneModal1BB1499( ) ;
               addRow1BB1499( ) ;
               scanNext1BB1499( ) ;
            }
            scanEnd1BB1499( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1499 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_401499( ) ;
      initAll1BB1499( ) ;
      init_level_properties1499( ) ;
      nRcdExists_1499 = (short)(0) ;
      nIsMod_1499 = (short)(0) ;
      nRcdDeleted_1499 = (short)(0) ;
      nBlankRcdCount1499 = (short)(nBlankRcdUsr1499+nBlankRcdCount1499) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1499 > 0 )
      {
         standaloneNotModal1BB1499( ) ;
         standaloneModal1BB1499( ) ;
         addRow1BB1499( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtHpagLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1499 = (short)(nBlankRcdCount1499-1) ;
      }
      Gx_mode = sMode1499 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPAGCL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPAGCL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPAGCL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPAGCL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_THPAGCL.htm");
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
         Z11248HpagIden = (int)(localUtil.ctol( httpContext.cgiGet( "Z11248HpagIden"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11249HpagUltl = (short)(localUtil.ctol( httpContext.cgiGet( "Z11249HpagUltl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHpagIden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHpagIden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HPAGIDEN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHpagIden_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11248HpagIden = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A11248HpagIden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11248HpagIden), 8, 0));
         }
         else
         {
            A11248HpagIden = (int)(localUtil.ctol( httpContext.cgiGet( edtHpagIden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11248HpagIden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11248HpagIden), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHpagUltl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHpagUltl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HPAGULTL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHpagUltl_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11249HpagUltl = (short)(0) ;
            n11249HpagUltl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11249HpagUltl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11249HpagUltl), 4, 0));
         }
         else
         {
            A11249HpagUltl = (short)(localUtil.ctol( httpContext.cgiGet( edtHpagUltl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11249HpagUltl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11249HpagUltl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11249HpagUltl), 4, 0));
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
            A11248HpagIden = (int)(GXutil.lval( httpContext.GetPar( "HpagIden"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11248HpagIden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11248HpagIden), 8, 0));
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
            initAll1BB1498( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1499_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1499_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      disableAttributes1BB1498( ) ;
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

   public void confirm_1BB0( )
   {
      beforeValidate1BB1498( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1BB1498( ) ;
         }
         else
         {
            checkExtendedTable1BB1498( ) ;
            if ( AnyError == 0 )
            {
               zm1BB1498( 2) ;
            }
            closeExtendedTableCursors1BB1498( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1498 = Gx_mode ;
         confirm_1BB1499( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1498 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1498 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1BB0( ) ;
      }
   }

   public void confirm_1BB1499( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1BB1499( ) ;
         if ( ( nRcdExists_1499 != 0 ) || ( nIsMod_1499 != 0 ) )
         {
            getKey1BB1499( ) ;
            if ( ( nRcdExists_1499 == 0 ) && ( nRcdDeleted_1499 == 0 ) )
            {
               if ( RcdFound1499 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1BB1499( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1BB1499( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1BB1499( 4) ;
                     }
                     closeExtendedTableCursors1BB1499( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "HPAGLIN_" + sGXsfl_40_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtHpagLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1499 != 0 )
               {
                  if ( nRcdDeleted_1499 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1BB1499( ) ;
                     load1BB1499( ) ;
                     beforeValidate1BB1499( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1BB1499( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1499 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1BB1499( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1BB1499( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1BB1499( 4) ;
                           }
                           closeExtendedTableCursors1BB1499( ) ;
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
                  if ( nRcdDeleted_1499 == 0 )
                  {
                     GXCCtl = "HPAGLIN_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHpagLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1499_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1499, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHpagLin_Internalname, GXutil.ltrim( localUtil.ntoc( A11250HpagLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHpagfec_Internalname, localUtil.format(A11251Hpagfec, "99/99/99")) ;
         httpContext.changePostValue( edtHpagImpo_Internalname, GXutil.ltrim( localUtil.ntoc( A11252HpagImpo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliNom_Internalname, GXutil.rtrim( A279CliNom)) ;
         httpContext.changePostValue( edtHpagDoc_Internalname, GXutil.rtrim( A11253HpagDoc)) ;
         httpContext.changePostValue( edtHpagTerm_Internalname, GXutil.rtrim( A11254HpagTerm)) ;
         httpContext.changePostValue( edtHpagFechh_Internalname, localUtil.ttoc( A11255HpagFechh, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtHpagUsur_Internalname, GXutil.rtrim( A11256HpagUsur)) ;
         httpContext.changePostValue( "ZT_"+"Z11250HpagLin_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z11250HpagLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11251Hpagfec_"+sGXsfl_40_idx, localUtil.dtoc( Z11251Hpagfec, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z11252HpagImpo_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z11252HpagImpo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11253HpagDoc_"+sGXsfl_40_idx, GXutil.rtrim( Z11253HpagDoc)) ;
         httpContext.changePostValue( "ZT_"+"Z11254HpagTerm_"+sGXsfl_40_idx, GXutil.rtrim( Z11254HpagTerm)) ;
         httpContext.changePostValue( "ZT_"+"Z11255HpagFechh_"+sGXsfl_40_idx, localUtil.ttoc( Z11255HpagFechh, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z11256HpagUsur_"+sGXsfl_40_idx, GXutil.rtrim( Z11256HpagUsur)) ;
         httpContext.changePostValue( "ZT_"+"Z252CliCod_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1499_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1499, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1499_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1499, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1499_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1499, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1499 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1499_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1499_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HPAGLIN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HPAGFEC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagfec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HPAGIMPO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagImpo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLINOM_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HPAGDOC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagDoc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HPAGTERM_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagTerm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HPAGFECHH_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagFechh_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HPAGUSUR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagUsur_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1BB0( )
   {
   }

   public void zm1BB1498( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11249HpagUltl = T01BB6_A11249HpagUltl[0] ;
         }
         else
         {
            Z11249HpagUltl = A11249HpagUltl ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z11248HpagIden = A11248HpagIden ;
         Z11249HpagUltl = A11249HpagUltl ;
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

   public void load1BB1498( )
   {
      /* Using cursor T01BB8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A11248HpagIden)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1498 = (short)(1) ;
         A407EmprNom = T01BB8_A407EmprNom[0] ;
         n407EmprNom = T01BB8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A11249HpagUltl = T01BB8_A11249HpagUltl[0] ;
         n11249HpagUltl = T01BB8_n11249HpagUltl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11249HpagUltl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11249HpagUltl), 4, 0));
         zm1BB1498( -1) ;
      }
      pr_default.close(6);
      onLoadActions1BB1498( ) ;
   }

   public void onLoadActions1BB1498( )
   {
   }

   public void checkExtendedTable1BB1498( )
   {
      nIsDirty_1498 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01BB7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01BB7_A407EmprNom[0] ;
      n407EmprNom = T01BB7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1BB1498( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T01BB9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01BB9_A407EmprNom[0] ;
      n407EmprNom = T01BB9_n407EmprNom[0] ;
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

   public void getKey1BB1498( )
   {
      /* Using cursor T01BB10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A11248HpagIden)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1498 = (short)(1) ;
      }
      else
      {
         RcdFound1498 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01BB6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A11248HpagIden)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1BB1498( 1) ;
         RcdFound1498 = (short)(1) ;
         A11248HpagIden = T01BB6_A11248HpagIden[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11248HpagIden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11248HpagIden), 8, 0));
         A11249HpagUltl = T01BB6_A11249HpagUltl[0] ;
         n11249HpagUltl = T01BB6_n11249HpagUltl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11249HpagUltl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11249HpagUltl), 4, 0));
         A396EmprCod = T01BB6_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z11248HpagIden = A11248HpagIden ;
         sMode1498 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1BB1498( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1498 = (short)(0) ;
            initializeNonKey1BB1498( ) ;
         }
         Gx_mode = sMode1498 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1498 = (short)(0) ;
         initializeNonKey1BB1498( ) ;
         sMode1498 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1498 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1BB1498( ) ;
      if ( RcdFound1498 == 0 )
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
      RcdFound1498 = (short)(0) ;
      /* Using cursor T01BB11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A11248HpagIden)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01BB11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01BB11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01BB11_A11248HpagIden[0] < A11248HpagIden ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01BB11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01BB11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01BB11_A11248HpagIden[0] > A11248HpagIden ) ) )
         {
            A396EmprCod = T01BB11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A11248HpagIden = T01BB11_A11248HpagIden[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11248HpagIden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11248HpagIden), 8, 0));
            RcdFound1498 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1498 = (short)(0) ;
      /* Using cursor T01BB12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A11248HpagIden)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01BB12_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01BB12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01BB12_A11248HpagIden[0] > A11248HpagIden ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01BB12_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01BB12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01BB12_A11248HpagIden[0] < A11248HpagIden ) ) )
         {
            A396EmprCod = T01BB12_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A11248HpagIden = T01BB12_A11248HpagIden[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11248HpagIden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11248HpagIden), 8, 0));
            RcdFound1498 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1BB1498( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1BB1498( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1498 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11248HpagIden != Z11248HpagIden ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A11248HpagIden = Z11248HpagIden ;
               httpContext.ajax_rsp_assign_attri("", false, "A11248HpagIden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11248HpagIden), 8, 0));
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
               update1BB1498( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11248HpagIden != Z11248HpagIden ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1BB1498( ) ;
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
                  insert1BB1498( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11248HpagIden != Z11248HpagIden ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11248HpagIden = Z11248HpagIden ;
         httpContext.ajax_rsp_assign_attri("", false, "A11248HpagIden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11248HpagIden), 8, 0));
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
      getKey1BB1498( ) ;
      if ( RcdFound1498 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11248HpagIden != Z11248HpagIden ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A11248HpagIden = Z11248HpagIden ;
            httpContext.ajax_rsp_assign_attri("", false, "A11248HpagIden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11248HpagIden), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11248HpagIden != Z11248HpagIden ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "thpagcl");
      GX_FocusControl = edtHpagUltl_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1BB0( ) ;
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
      if ( RcdFound1498 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtHpagUltl_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1BB1498( ) ;
      if ( RcdFound1498 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHpagUltl_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1BB1498( ) ;
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
      if ( RcdFound1498 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHpagUltl_Internalname ;
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
      if ( RcdFound1498 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHpagUltl_Internalname ;
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
      scanStart1BB1498( ) ;
      if ( RcdFound1498 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1498 != 0 )
         {
            scanNext1BB1498( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHpagUltl_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1BB1498( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1BB1498( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01BB5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A11248HpagIden)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHPAGCL"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z11249HpagUltl != T01BB5_A11249HpagUltl[0] ) )
         {
            if ( Z11249HpagUltl != T01BB5_A11249HpagUltl[0] )
            {
               GXutil.writeLogln("thpagcl:[seudo value changed for attri]"+"HpagUltl");
               GXutil.writeLogRaw("Old: ",Z11249HpagUltl);
               GXutil.writeLogRaw("Current: ",T01BB5_A11249HpagUltl[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHPAGCL"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1BB1498( )
   {
      beforeValidate1BB1498( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BB1498( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1BB1498( 0) ;
         checkOptimisticConcurrency1BB1498( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BB1498( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1BB1498( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BB13 */
                  pr_default.execute(11, new Object[] {Integer.valueOf(A11248HpagIden), Boolean.valueOf(n11249HpagUltl), Short.valueOf(A11249HpagUltl), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPAGCL");
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
                        processLevel1BB1498( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1BB0( ) ;
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
            load1BB1498( ) ;
         }
         endLevel1BB1498( ) ;
      }
      closeExtendedTableCursors1BB1498( ) ;
   }

   public void update1BB1498( )
   {
      beforeValidate1BB1498( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BB1498( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BB1498( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BB1498( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1BB1498( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BB14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n11249HpagUltl), Short.valueOf(A11249HpagUltl), A396EmprCod, Integer.valueOf(A11248HpagIden)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPAGCL");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHPAGCL"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1BB1498( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1BB1498( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1BB0( ) ;
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
         endLevel1BB1498( ) ;
      }
      closeExtendedTableCursors1BB1498( ) ;
   }

   public void deferredUpdate1BB1498( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1BB1498( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BB1498( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1BB1498( ) ;
         afterConfirm1BB1498( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1BB1498( ) ;
            if ( AnyError == 0 )
            {
               scanStart1BB1499( ) ;
               while ( RcdFound1499 != 0 )
               {
                  getByPrimaryKey1BB1499( ) ;
                  delete1BB1499( ) ;
                  scanNext1BB1499( ) ;
               }
               scanEnd1BB1499( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BB15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A11248HpagIden)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPAGCL");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1498 == 0 )
                        {
                           initAll1BB1498( ) ;
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
                        resetCaption1BB0( ) ;
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
      sMode1498 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1BB1498( ) ;
      Gx_mode = sMode1498 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1BB1498( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01BB16 */
         pr_default.execute(14, new Object[] {A396EmprCod});
         A407EmprNom = T01BB16_A407EmprNom[0] ;
         n407EmprNom = T01BB16_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(14);
      }
   }

   public void processNestedLevel1BB1499( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1BB1499( ) ;
         if ( ( nRcdExists_1499 != 0 ) || ( nIsMod_1499 != 0 ) )
         {
            standaloneNotModal1BB1499( ) ;
            getKey1BB1499( ) ;
            if ( ( nRcdExists_1499 == 0 ) && ( nRcdDeleted_1499 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1BB1499( ) ;
            }
            else
            {
               if ( RcdFound1499 != 0 )
               {
                  if ( ( nRcdDeleted_1499 != 0 ) && ( nRcdExists_1499 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1BB1499( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1499 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1BB1499( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1499 == 0 )
                  {
                     GXCCtl = "HPAGLIN_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHpagLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1499_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1499, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHpagLin_Internalname, GXutil.ltrim( localUtil.ntoc( A11250HpagLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHpagfec_Internalname, localUtil.format(A11251Hpagfec, "99/99/99")) ;
         httpContext.changePostValue( edtHpagImpo_Internalname, GXutil.ltrim( localUtil.ntoc( A11252HpagImpo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliNom_Internalname, GXutil.rtrim( A279CliNom)) ;
         httpContext.changePostValue( edtHpagDoc_Internalname, GXutil.rtrim( A11253HpagDoc)) ;
         httpContext.changePostValue( edtHpagTerm_Internalname, GXutil.rtrim( A11254HpagTerm)) ;
         httpContext.changePostValue( edtHpagFechh_Internalname, localUtil.ttoc( A11255HpagFechh, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtHpagUsur_Internalname, GXutil.rtrim( A11256HpagUsur)) ;
         httpContext.changePostValue( "ZT_"+"Z11250HpagLin_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z11250HpagLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11251Hpagfec_"+sGXsfl_40_idx, localUtil.dtoc( Z11251Hpagfec, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z11252HpagImpo_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z11252HpagImpo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11253HpagDoc_"+sGXsfl_40_idx, GXutil.rtrim( Z11253HpagDoc)) ;
         httpContext.changePostValue( "ZT_"+"Z11254HpagTerm_"+sGXsfl_40_idx, GXutil.rtrim( Z11254HpagTerm)) ;
         httpContext.changePostValue( "ZT_"+"Z11255HpagFechh_"+sGXsfl_40_idx, localUtil.ttoc( Z11255HpagFechh, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z11256HpagUsur_"+sGXsfl_40_idx, GXutil.rtrim( Z11256HpagUsur)) ;
         httpContext.changePostValue( "ZT_"+"Z252CliCod_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1499_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1499, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1499_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1499, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1499_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1499, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1499 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1499_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1499_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HPAGLIN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HPAGFEC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagfec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HPAGIMPO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagImpo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLINOM_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HPAGDOC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagDoc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HPAGTERM_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagTerm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HPAGFECHH_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagFechh_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HPAGUSUR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagUsur_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1BB1499( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1499 = (short)(0) ;
      nIsMod_1499 = (short)(0) ;
      nRcdDeleted_1499 = (short)(0) ;
   }

   public void processLevel1BB1498( )
   {
      /* Save parent mode. */
      sMode1498 = Gx_mode ;
      processNestedLevel1BB1499( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1498 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1BB1498( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1BB1498( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "thpagcl");
         if ( AnyError == 0 )
         {
            confirmValues1BB0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "thpagcl");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1BB1498( )
   {
      /* Using cursor T01BB17 */
      pr_default.execute(15);
      RcdFound1498 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1498 = (short)(1) ;
         A396EmprCod = T01BB17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11248HpagIden = T01BB17_A11248HpagIden[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11248HpagIden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11248HpagIden), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1BB1498( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1498 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1498 = (short)(1) ;
         A396EmprCod = T01BB17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11248HpagIden = T01BB17_A11248HpagIden[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11248HpagIden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11248HpagIden), 8, 0));
      }
   }

   public void scanEnd1BB1498( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1BB1498( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1BB1498( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1BB1498( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1BB1498( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1BB1498( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1BB1498( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1BB1498( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtHpagIden_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHpagIden_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHpagIden_Enabled), 5, 0), true);
      edtHpagUltl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHpagUltl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHpagUltl_Enabled), 5, 0), true);
   }

   public void zm1BB1499( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11251Hpagfec = T01BB3_A11251Hpagfec[0] ;
            Z11252HpagImpo = T01BB3_A11252HpagImpo[0] ;
            Z11253HpagDoc = T01BB3_A11253HpagDoc[0] ;
            Z11254HpagTerm = T01BB3_A11254HpagTerm[0] ;
            Z11255HpagFechh = T01BB3_A11255HpagFechh[0] ;
            Z11256HpagUsur = T01BB3_A11256HpagUsur[0] ;
            Z252CliCod = T01BB3_A252CliCod[0] ;
         }
         else
         {
            Z11251Hpagfec = A11251Hpagfec ;
            Z11252HpagImpo = A11252HpagImpo ;
            Z11253HpagDoc = A11253HpagDoc ;
            Z11254HpagTerm = A11254HpagTerm ;
            Z11255HpagFechh = A11255HpagFechh ;
            Z11256HpagUsur = A11256HpagUsur ;
            Z252CliCod = A252CliCod ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z11248HpagIden = A11248HpagIden ;
         Z11250HpagLin = A11250HpagLin ;
         Z11251Hpagfec = A11251Hpagfec ;
         Z11252HpagImpo = A11252HpagImpo ;
         Z11253HpagDoc = A11253HpagDoc ;
         Z11254HpagTerm = A11254HpagTerm ;
         Z11255HpagFechh = A11255HpagFechh ;
         Z11256HpagUsur = A11256HpagUsur ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal1BB1499( )
   {
   }

   public void standaloneModal1BB1499( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHpagLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHpagLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHpagLin_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtHpagLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHpagLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHpagLin_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
   }

   public void load1BB1499( )
   {
      /* Using cursor T01BB18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A11248HpagIden), Short.valueOf(A11250HpagLin)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1499 = (short)(1) ;
         A11251Hpagfec = T01BB18_A11251Hpagfec[0] ;
         n11251Hpagfec = T01BB18_n11251Hpagfec[0] ;
         A11252HpagImpo = T01BB18_A11252HpagImpo[0] ;
         n11252HpagImpo = T01BB18_n11252HpagImpo[0] ;
         A279CliNom = T01BB18_A279CliNom[0] ;
         A11253HpagDoc = T01BB18_A11253HpagDoc[0] ;
         n11253HpagDoc = T01BB18_n11253HpagDoc[0] ;
         A11254HpagTerm = T01BB18_A11254HpagTerm[0] ;
         n11254HpagTerm = T01BB18_n11254HpagTerm[0] ;
         A11255HpagFechh = T01BB18_A11255HpagFechh[0] ;
         n11255HpagFechh = T01BB18_n11255HpagFechh[0] ;
         A11256HpagUsur = T01BB18_A11256HpagUsur[0] ;
         n11256HpagUsur = T01BB18_n11256HpagUsur[0] ;
         A252CliCod = T01BB18_A252CliCod[0] ;
         n252CliCod = T01BB18_n252CliCod[0] ;
         zm1BB1499( -3) ;
      }
      pr_default.close(16);
      onLoadActions1BB1499( ) ;
   }

   public void onLoadActions1BB1499( )
   {
   }

   public void checkExtendedTable1BB1499( )
   {
      nIsDirty_1499 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1BB1499( ) ;
      /* Using cursor T01BB4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "CLICOD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01BB4_A279CliNom[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1BB1499( )
   {
      pr_default.close(2);
   }

   public void enableDisable1BB1499( )
   {
   }

   public void gxload_4( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T01BB19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         GXCCtl = "CLICOD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01BB19_A279CliNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void getKey1BB1499( )
   {
      /* Using cursor T01BB20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A11248HpagIden), Short.valueOf(A11250HpagLin)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1499 = (short)(1) ;
      }
      else
      {
         RcdFound1499 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey1BB1499( )
   {
      /* Using cursor T01BB3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A11248HpagIden), Short.valueOf(A11250HpagLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1BB1499( 3) ;
         RcdFound1499 = (short)(1) ;
         initializeNonKey1BB1499( ) ;
         A11250HpagLin = T01BB3_A11250HpagLin[0] ;
         A11251Hpagfec = T01BB3_A11251Hpagfec[0] ;
         n11251Hpagfec = T01BB3_n11251Hpagfec[0] ;
         A11252HpagImpo = T01BB3_A11252HpagImpo[0] ;
         n11252HpagImpo = T01BB3_n11252HpagImpo[0] ;
         A11253HpagDoc = T01BB3_A11253HpagDoc[0] ;
         n11253HpagDoc = T01BB3_n11253HpagDoc[0] ;
         A11254HpagTerm = T01BB3_A11254HpagTerm[0] ;
         n11254HpagTerm = T01BB3_n11254HpagTerm[0] ;
         A11255HpagFechh = T01BB3_A11255HpagFechh[0] ;
         n11255HpagFechh = T01BB3_n11255HpagFechh[0] ;
         A11256HpagUsur = T01BB3_A11256HpagUsur[0] ;
         n11256HpagUsur = T01BB3_n11256HpagUsur[0] ;
         A252CliCod = T01BB3_A252CliCod[0] ;
         n252CliCod = T01BB3_n252CliCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z11248HpagIden = A11248HpagIden ;
         Z11250HpagLin = A11250HpagLin ;
         sMode1499 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1BB1499( ) ;
         load1BB1499( ) ;
         Gx_mode = sMode1499 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1499 = (short)(0) ;
         initializeNonKey1BB1499( ) ;
         sMode1499 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1BB1499( ) ;
         Gx_mode = sMode1499 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1BB1499( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1BB1499( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01BB2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11248HpagIden), Short.valueOf(A11250HpagLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHPAGC1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z11251Hpagfec), GXutil.resetTime(T01BB2_A11251Hpagfec[0])) ) || ( DecimalUtil.compareTo(Z11252HpagImpo, T01BB2_A11252HpagImpo[0]) != 0 ) || ( GXutil.strcmp(Z11253HpagDoc, T01BB2_A11253HpagDoc[0]) != 0 ) || ( GXutil.strcmp(Z11254HpagTerm, T01BB2_A11254HpagTerm[0]) != 0 ) || !( GXutil.dateCompare(Z11255HpagFechh, T01BB2_A11255HpagFechh[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11256HpagUsur, T01BB2_A11256HpagUsur[0]) != 0 ) || ( Z252CliCod != T01BB2_A252CliCod[0] ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11251Hpagfec), GXutil.resetTime(T01BB2_A11251Hpagfec[0])) ) )
            {
               GXutil.writeLogln("thpagcl:[seudo value changed for attri]"+"Hpagfec");
               GXutil.writeLogRaw("Old: ",Z11251Hpagfec);
               GXutil.writeLogRaw("Current: ",T01BB2_A11251Hpagfec[0]);
            }
            if ( DecimalUtil.compareTo(Z11252HpagImpo, T01BB2_A11252HpagImpo[0]) != 0 )
            {
               GXutil.writeLogln("thpagcl:[seudo value changed for attri]"+"HpagImpo");
               GXutil.writeLogRaw("Old: ",Z11252HpagImpo);
               GXutil.writeLogRaw("Current: ",T01BB2_A11252HpagImpo[0]);
            }
            if ( GXutil.strcmp(Z11253HpagDoc, T01BB2_A11253HpagDoc[0]) != 0 )
            {
               GXutil.writeLogln("thpagcl:[seudo value changed for attri]"+"HpagDoc");
               GXutil.writeLogRaw("Old: ",Z11253HpagDoc);
               GXutil.writeLogRaw("Current: ",T01BB2_A11253HpagDoc[0]);
            }
            if ( GXutil.strcmp(Z11254HpagTerm, T01BB2_A11254HpagTerm[0]) != 0 )
            {
               GXutil.writeLogln("thpagcl:[seudo value changed for attri]"+"HpagTerm");
               GXutil.writeLogRaw("Old: ",Z11254HpagTerm);
               GXutil.writeLogRaw("Current: ",T01BB2_A11254HpagTerm[0]);
            }
            if ( !( GXutil.dateCompare(Z11255HpagFechh, T01BB2_A11255HpagFechh[0]) ) )
            {
               GXutil.writeLogln("thpagcl:[seudo value changed for attri]"+"HpagFechh");
               GXutil.writeLogRaw("Old: ",Z11255HpagFechh);
               GXutil.writeLogRaw("Current: ",T01BB2_A11255HpagFechh[0]);
            }
            if ( GXutil.strcmp(Z11256HpagUsur, T01BB2_A11256HpagUsur[0]) != 0 )
            {
               GXutil.writeLogln("thpagcl:[seudo value changed for attri]"+"HpagUsur");
               GXutil.writeLogRaw("Old: ",Z11256HpagUsur);
               GXutil.writeLogRaw("Current: ",T01BB2_A11256HpagUsur[0]);
            }
            if ( Z252CliCod != T01BB2_A252CliCod[0] )
            {
               GXutil.writeLogln("thpagcl:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01BB2_A252CliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHPAGC1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1BB1499( )
   {
      beforeValidate1BB1499( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BB1499( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1BB1499( 0) ;
         checkOptimisticConcurrency1BB1499( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BB1499( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1BB1499( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BB21 */
                  pr_default.execute(19, new Object[] {Integer.valueOf(A11248HpagIden), Short.valueOf(A11250HpagLin), Boolean.valueOf(n11251Hpagfec), A11251Hpagfec, Boolean.valueOf(n11252HpagImpo), A11252HpagImpo, Boolean.valueOf(n11253HpagDoc), A11253HpagDoc, Boolean.valueOf(n11254HpagTerm), A11254HpagTerm, Boolean.valueOf(n11255HpagFechh), A11255HpagFechh, Boolean.valueOf(n11256HpagUsur), A11256HpagUsur, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPAGC1");
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
            load1BB1499( ) ;
         }
         endLevel1BB1499( ) ;
      }
      closeExtendedTableCursors1BB1499( ) ;
   }

   public void update1BB1499( )
   {
      beforeValidate1BB1499( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BB1499( ) ;
      }
      if ( ( nIsMod_1499 != 0 ) || ( nIsDirty_1499 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1BB1499( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1BB1499( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1BB1499( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01BB22 */
                     pr_default.execute(20, new Object[] {Boolean.valueOf(n11251Hpagfec), A11251Hpagfec, Boolean.valueOf(n11252HpagImpo), A11252HpagImpo, Boolean.valueOf(n11253HpagDoc), A11253HpagDoc, Boolean.valueOf(n11254HpagTerm), A11254HpagTerm, Boolean.valueOf(n11255HpagFechh), A11255HpagFechh, Boolean.valueOf(n11256HpagUsur), A11256HpagUsur, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A11248HpagIden), Short.valueOf(A11250HpagLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPAGC1");
                     if ( (pr_default.getStatus(20) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHPAGC1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1BB1499( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1BB1499( ) ;
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
            endLevel1BB1499( ) ;
         }
      }
      closeExtendedTableCursors1BB1499( ) ;
   }

   public void deferredUpdate1BB1499( )
   {
   }

   public void delete1BB1499( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1BB1499( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BB1499( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1BB1499( ) ;
         afterConfirm1BB1499( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1BB1499( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01BB23 */
               pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A11248HpagIden), Short.valueOf(A11250HpagLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPAGC1");
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
      sMode1499 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1BB1499( ) ;
      Gx_mode = sMode1499 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1BB1499( )
   {
      standaloneModal1BB1499( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01BB24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T01BB24_A279CliNom[0] ;
         pr_default.close(22);
      }
   }

   public void endLevel1BB1499( )
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

   public void scanStart1BB1499( )
   {
      /* Scan By routine */
      /* Using cursor T01BB25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A11248HpagIden)});
      RcdFound1499 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1499 = (short)(1) ;
         A11250HpagLin = T01BB25_A11250HpagLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1BB1499( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound1499 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1499 = (short)(1) ;
         A11250HpagLin = T01BB25_A11250HpagLin[0] ;
      }
   }

   public void scanEnd1BB1499( )
   {
      pr_default.close(23);
   }

   public void afterConfirm1BB1499( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1BB1499( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1BB1499( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1BB1499( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1BB1499( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1BB1499( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1BB1499( )
   {
      edtHpagLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHpagLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHpagLin_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtHpagfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHpagfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHpagfec_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtHpagImpo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHpagImpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHpagImpo_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtHpagDoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHpagDoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHpagDoc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtHpagTerm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHpagTerm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHpagTerm_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtHpagFechh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHpagFechh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHpagFechh_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtHpagUsur_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHpagUsur_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHpagUsur_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void send_integrity_lvl_hashes1BB1499( )
   {
   }

   public void send_integrity_lvl_hashes1BB1498( )
   {
   }

   public void subsflControlProps_401499( )
   {
      edtavnRcdDeleted_1499_Internalname = "vNRCDDELETED_1499_"+sGXsfl_40_idx ;
      edtHpagLin_Internalname = "HPAGLIN_"+sGXsfl_40_idx ;
      edtHpagfec_Internalname = "HPAGFEC_"+sGXsfl_40_idx ;
      edtHpagImpo_Internalname = "HPAGIMPO_"+sGXsfl_40_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_40_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_40_idx ;
      edtHpagDoc_Internalname = "HPAGDOC_"+sGXsfl_40_idx ;
      edtHpagTerm_Internalname = "HPAGTERM_"+sGXsfl_40_idx ;
      edtHpagFechh_Internalname = "HPAGFECHH_"+sGXsfl_40_idx ;
      edtHpagUsur_Internalname = "HPAGUSUR_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_401499( )
   {
      edtavnRcdDeleted_1499_Internalname = "vNRCDDELETED_1499_"+sGXsfl_40_fel_idx ;
      edtHpagLin_Internalname = "HPAGLIN_"+sGXsfl_40_fel_idx ;
      edtHpagfec_Internalname = "HPAGFEC_"+sGXsfl_40_fel_idx ;
      edtHpagImpo_Internalname = "HPAGIMPO_"+sGXsfl_40_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_40_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_40_fel_idx ;
      edtHpagDoc_Internalname = "HPAGDOC_"+sGXsfl_40_fel_idx ;
      edtHpagTerm_Internalname = "HPAGTERM_"+sGXsfl_40_fel_idx ;
      edtHpagFechh_Internalname = "HPAGFECHH_"+sGXsfl_40_fel_idx ;
      edtHpagUsur_Internalname = "HPAGUSUR_"+sGXsfl_40_fel_idx ;
   }

   public void addRow1BB1499( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401499( ) ;
      sendRow1BB1499( ) ;
   }

   public void sendRow1BB1499( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1499_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1499_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1499, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1499_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1499), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1499), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1499_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1499_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1499_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHpagLin_Internalname,GXutil.ltrim( localUtil.ntoc( A11250HpagLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11250HpagLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHpagLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHpagLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1499_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHpagfec_Internalname,localUtil.format(A11251Hpagfec, "99/99/99"),localUtil.format( A11251Hpagfec, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHpagfec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHpagfec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1499_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHpagImpo_Internalname,GXutil.ltrim( localUtil.ntoc( A11252HpagImpo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHpagImpo_Enabled!=0) ? localUtil.format( A11252HpagImpo, "ZZZZZZZZ9.99") : localUtil.format( A11252HpagImpo, "ZZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,44);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHpagImpo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHpagImpo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1499_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCliCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCliNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1499_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHpagDoc_Internalname,GXutil.rtrim( A11253HpagDoc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHpagDoc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHpagDoc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1499_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHpagTerm_Internalname,GXutil.rtrim( A11254HpagTerm),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHpagTerm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHpagTerm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1499_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHpagFechh_Internalname,localUtil.ttoc( A11255HpagFechh, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A11255HpagFechh, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHpagFechh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHpagFechh_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1499_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHpagUsur_Internalname,GXutil.rtrim( A11256HpagUsur),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHpagUsur_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHpagUsur_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1BB1499( ) ;
      GXCCtl = "Z11250HpagLin_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11250HpagLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11251Hpagfec_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z11251Hpagfec, 0, "/"));
      GXCCtl = "Z11252HpagImpo_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11252HpagImpo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11253HpagDoc_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11253HpagDoc));
      GXCCtl = "Z11254HpagTerm_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11254HpagTerm));
      GXCCtl = "Z11255HpagFechh_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z11255HpagFechh, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z11256HpagUsur_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11256HpagUsur));
      GXCCtl = "Z252CliCod_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1499_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1499, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1499_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1499, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1499_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1499, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1499_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1499_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HPAGLIN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HPAGFEC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagfec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HPAGIMPO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagImpo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HPAGDOC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagDoc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HPAGTERM_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagTerm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HPAGFECHH_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagFechh_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HPAGUSUR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagUsur_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1BB1499( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401499( ) ;
      edtavnRcdDeleted_1499_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1499_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHpagLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HPAGLIN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHpagfec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HPAGFEC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHpagImpo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HPAGIMPO_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLINOM_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHpagDoc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HPAGDOC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHpagTerm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HPAGTERM_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHpagFechh_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HPAGFECHH_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHpagUsur_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HPAGUSUR_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1499_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1499_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1499");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1499_Internalname ;
         wbErr = true ;
         nRcdDeleted_1499 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1499 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1499_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHpagLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHpagLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "HPAGLIN_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHpagLin_Internalname ;
         wbErr = true ;
         A11250HpagLin = (short)(0) ;
      }
      else
      {
         A11250HpagLin = (short)(localUtil.ctol( httpContext.cgiGet( edtHpagLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtHpagfec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "HPAGFEC_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHpagfec_Internalname ;
         wbErr = true ;
         A11251Hpagfec = GXutil.nullDate() ;
         n11251Hpagfec = false ;
      }
      else
      {
         A11251Hpagfec = localUtil.ctod( httpContext.cgiGet( edtHpagfec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n11251Hpagfec = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHpagImpo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHpagImpo_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
      {
         GXCCtl = "HPAGIMPO_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHpagImpo_Internalname ;
         wbErr = true ;
         A11252HpagImpo = DecimalUtil.ZERO ;
         n11252HpagImpo = false ;
      }
      else
      {
         A11252HpagImpo = localUtil.ctond( httpContext.cgiGet( edtHpagImpo_Internalname)) ;
         n11252HpagImpo = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "CLICOD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         wbErr = true ;
         A252CliCod = 0 ;
         n252CliCod = false ;
      }
      else
      {
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n252CliCod = false ;
      }
      A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
      A11253HpagDoc = httpContext.cgiGet( edtHpagDoc_Internalname) ;
      n11253HpagDoc = false ;
      A11254HpagTerm = httpContext.cgiGet( edtHpagTerm_Internalname) ;
      n11254HpagTerm = false ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtHpagFechh_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "HPAGFECHH_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHpagFechh_Internalname ;
         wbErr = true ;
         A11255HpagFechh = GXutil.resetTime( GXutil.nullDate() );
         n11255HpagFechh = false ;
      }
      else
      {
         A11255HpagFechh = localUtil.ctot( httpContext.cgiGet( edtHpagFechh_Internalname)) ;
         n11255HpagFechh = false ;
      }
      A11256HpagUsur = httpContext.cgiGet( edtHpagUsur_Internalname) ;
      n11256HpagUsur = false ;
      GXCCtl = "Z11250HpagLin_" + sGXsfl_40_idx ;
      Z11250HpagLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11251Hpagfec_" + sGXsfl_40_idx ;
      Z11251Hpagfec = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z11252HpagImpo_" + sGXsfl_40_idx ;
      Z11252HpagImpo = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11253HpagDoc_" + sGXsfl_40_idx ;
      Z11253HpagDoc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11254HpagTerm_" + sGXsfl_40_idx ;
      Z11254HpagTerm = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11255HpagFechh_" + sGXsfl_40_idx ;
      Z11255HpagFechh = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z11256HpagUsur_" + sGXsfl_40_idx ;
      Z11256HpagUsur = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z252CliCod_" + sGXsfl_40_idx ;
      Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1499_" + sGXsfl_40_idx ;
      nRcdDeleted_1499 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1499_" + sGXsfl_40_idx ;
      nRcdExists_1499 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1499_" + sGXsfl_40_idx ;
      nIsMod_1499 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtHpagLin_Enabled = edtHpagLin_Enabled ;
   }

   public void confirmValues1BB0( )
   {
      nGXsfl_40_idx = 0 ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401499( ) ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401499( ) ;
         httpContext.changePostValue( "Z11250HpagLin_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z11250HpagLin_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11250HpagLin_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z11251Hpagfec_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z11251Hpagfec_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11251Hpagfec_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z11252HpagImpo_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z11252HpagImpo_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11252HpagImpo_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z11253HpagDoc_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z11253HpagDoc_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11253HpagDoc_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z11254HpagTerm_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z11254HpagTerm_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11254HpagTerm_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z11255HpagFechh_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z11255HpagFechh_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11255HpagFechh_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z11256HpagUsur_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z11256HpagUsur_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11256HpagUsur_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z252CliCod_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z252CliCod_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z252CliCod_"+sGXsfl_40_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.thpagcl", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11248HpagIden", GXutil.ltrim( localUtil.ntoc( Z11248HpagIden, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11249HpagUltl", GXutil.ltrim( localUtil.ntoc( Z11249HpagUltl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_40", GXutil.ltrim( localUtil.ntoc( nGXsfl_40_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.thpagcl", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "THPAGCL" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "HISTORICO PAGOS", "") ;
   }

   public void initializeNonKey1BB1498( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A11249HpagUltl = (short)(0) ;
      n11249HpagUltl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11249HpagUltl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11249HpagUltl), 4, 0));
      Z11249HpagUltl = (short)(0) ;
   }

   public void initAll1BB1498( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A11248HpagIden = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11248HpagIden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11248HpagIden), 8, 0));
      initializeNonKey1BB1498( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1BB1499( )
   {
      A11251Hpagfec = GXutil.nullDate() ;
      n11251Hpagfec = false ;
      A11252HpagImpo = DecimalUtil.ZERO ;
      n11252HpagImpo = false ;
      A252CliCod = 0 ;
      n252CliCod = false ;
      A279CliNom = "" ;
      A11253HpagDoc = "" ;
      n11253HpagDoc = false ;
      A11254HpagTerm = "" ;
      n11254HpagTerm = false ;
      A11255HpagFechh = GXutil.resetTime( GXutil.nullDate() );
      n11255HpagFechh = false ;
      A11256HpagUsur = "" ;
      n11256HpagUsur = false ;
      Z11251Hpagfec = GXutil.nullDate() ;
      Z11252HpagImpo = DecimalUtil.ZERO ;
      Z11253HpagDoc = "" ;
      Z11254HpagTerm = "" ;
      Z11255HpagFechh = GXutil.resetTime( GXutil.nullDate() );
      Z11256HpagUsur = "" ;
      Z252CliCod = 0 ;
   }

   public void initAll1BB1499( )
   {
      A11250HpagLin = (short)(0) ;
      initializeNonKey1BB1499( ) ;
   }

   public void standaloneModalInsert1BB1499( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241563867", true, true);
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
      httpContext.AddJavascriptSource("thpagcl.js", "?20268241563867", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1499( )
   {
      edtHpagLin_Enabled = defedtHpagLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHpagLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHpagLin_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1499, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1499_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11250HpagLin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A11251Hpagfec, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagfec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11252HpagImpo, (byte)(12), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagImpo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11253HpagDoc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagDoc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11254HpagTerm));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagTerm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A11255HpagFechh, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagFechh_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11256HpagUsur));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHpagUsur_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtHpagIden_Internalname = "HPAGIDEN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtHpagUltl_Internalname = "HPAGULTL" ;
      edtavnRcdDeleted_1499_Internalname = "vNRCDDELETED_1499" ;
      edtHpagLin_Internalname = "HPAGLIN" ;
      edtHpagfec_Internalname = "HPAGFEC" ;
      edtHpagImpo_Internalname = "HPAGIMPO" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtHpagDoc_Internalname = "HPAGDOC" ;
      edtHpagTerm_Internalname = "HPAGTERM" ;
      edtHpagFechh_Internalname = "HPAGFECHH" ;
      edtHpagUsur_Internalname = "HPAGUSUR" ;
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
      Form.setCaption( httpContext.getMessage( "HISTORICO PAGOS", "") );
      edtHpagUsur_Jsonclick = "" ;
      edtHpagFechh_Jsonclick = "" ;
      edtHpagTerm_Jsonclick = "" ;
      edtHpagDoc_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtHpagImpo_Jsonclick = "" ;
      edtHpagfec_Jsonclick = "" ;
      edtHpagLin_Jsonclick = "" ;
      edtavnRcdDeleted_1499_Jsonclick = "" ;
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
      edtHpagUsur_Enabled = 1 ;
      edtHpagFechh_Enabled = 1 ;
      edtHpagTerm_Enabled = 1 ;
      edtHpagDoc_Enabled = 1 ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Enabled = 1 ;
      edtHpagImpo_Enabled = 1 ;
      edtHpagfec_Enabled = 1 ;
      edtHpagLin_Enabled = 1 ;
      edtavnRcdDeleted_1499_Enabled = 1 ;
      edtHpagUltl_Jsonclick = "" ;
      edtHpagUltl_Backcolor = (int)(0xFFFFFF) ;
      edtHpagUltl_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtHpagIden_Jsonclick = "" ;
      edtHpagIden_Backcolor = (int)(0xFFFFFF) ;
      edtHpagIden_Enabled = 1 ;
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
      subsflControlProps_401499( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1BB1499( ) ;
         standaloneModal1BB1499( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1BB1499( ) ;
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401499( ) ;
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
      /* Using cursor T01BB16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01BB16_A407EmprNom[0] ;
      n407EmprNom = T01BB16_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(14);
      GX_FocusControl = edtHpagUltl_Internalname ;
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
      /* Using cursor T01BB16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01BB16_A407EmprNom[0] ;
      n407EmprNom = T01BB16_n407EmprNom[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Hpagiden( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11249HpagUltl", GXutil.ltrim( localUtil.ntoc( A11249HpagUltl, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11248HpagIden", GXutil.ltrim( localUtil.ntoc( Z11248HpagIden, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11249HpagUltl", GXutil.ltrim( localUtil.ntoc( Z11249HpagUltl, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Clicod( )
   {
      n252CliCod = false ;
      /* Using cursor T01BB24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01BB24_A279CliNom[0] ;
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
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
      setEventMetadata("VALID_HPAGIDEN","{handler:'valid_Hpagiden',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11248HpagIden',fld:'HPAGIDEN',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_HPAGIDEN",",oparms:[{av:'A11249HpagUltl',fld:'HPAGULTL',pic:'ZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z11248HpagIden'},{av:'Z11249HpagUltl'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_HPAGLIN","{handler:'valid_Hpaglin',iparms:[]");
      setEventMetadata("VALID_HPAGLIN",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Hpagusur',iparms:[]");
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
      pr_default.close(22);
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z11251Hpagfec = GXutil.nullDate() ;
      Z11252HpagImpo = DecimalUtil.ZERO ;
      Z11253HpagDoc = "" ;
      Z11254HpagTerm = "" ;
      Z11255HpagFechh = GXutil.resetTime( GXutil.nullDate() );
      Z11256HpagUsur = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1499 = "" ;
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
      sMode1498 = "" ;
      GXCCtl = "" ;
      A11251Hpagfec = GXutil.nullDate() ;
      A11252HpagImpo = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      A11253HpagDoc = "" ;
      A11254HpagTerm = "" ;
      A11255HpagFechh = GXutil.resetTime( GXutil.nullDate() );
      A11256HpagUsur = "" ;
      Z407EmprNom = "" ;
      T01BB8_A11248HpagIden = new int[1] ;
      T01BB8_A407EmprNom = new String[] {""} ;
      T01BB8_n407EmprNom = new boolean[] {false} ;
      T01BB8_A11249HpagUltl = new short[1] ;
      T01BB8_n11249HpagUltl = new boolean[] {false} ;
      T01BB8_A396EmprCod = new String[] {""} ;
      T01BB7_A407EmprNom = new String[] {""} ;
      T01BB7_n407EmprNom = new boolean[] {false} ;
      T01BB9_A407EmprNom = new String[] {""} ;
      T01BB9_n407EmprNom = new boolean[] {false} ;
      T01BB10_A396EmprCod = new String[] {""} ;
      T01BB10_A11248HpagIden = new int[1] ;
      T01BB6_A11248HpagIden = new int[1] ;
      T01BB6_A11249HpagUltl = new short[1] ;
      T01BB6_n11249HpagUltl = new boolean[] {false} ;
      T01BB6_A396EmprCod = new String[] {""} ;
      T01BB11_A396EmprCod = new String[] {""} ;
      T01BB11_A11248HpagIden = new int[1] ;
      T01BB12_A396EmprCod = new String[] {""} ;
      T01BB12_A11248HpagIden = new int[1] ;
      T01BB5_A11248HpagIden = new int[1] ;
      T01BB5_A11249HpagUltl = new short[1] ;
      T01BB5_n11249HpagUltl = new boolean[] {false} ;
      T01BB5_A396EmprCod = new String[] {""} ;
      T01BB16_A407EmprNom = new String[] {""} ;
      T01BB16_n407EmprNom = new boolean[] {false} ;
      T01BB17_A396EmprCod = new String[] {""} ;
      T01BB17_A11248HpagIden = new int[1] ;
      Z279CliNom = "" ;
      T01BB18_A11248HpagIden = new int[1] ;
      T01BB18_A11250HpagLin = new short[1] ;
      T01BB18_A11251Hpagfec = new java.util.Date[] {GXutil.nullDate()} ;
      T01BB18_n11251Hpagfec = new boolean[] {false} ;
      T01BB18_A11252HpagImpo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BB18_n11252HpagImpo = new boolean[] {false} ;
      T01BB18_A279CliNom = new String[] {""} ;
      T01BB18_A11253HpagDoc = new String[] {""} ;
      T01BB18_n11253HpagDoc = new boolean[] {false} ;
      T01BB18_A11254HpagTerm = new String[] {""} ;
      T01BB18_n11254HpagTerm = new boolean[] {false} ;
      T01BB18_A11255HpagFechh = new java.util.Date[] {GXutil.nullDate()} ;
      T01BB18_n11255HpagFechh = new boolean[] {false} ;
      T01BB18_A11256HpagUsur = new String[] {""} ;
      T01BB18_n11256HpagUsur = new boolean[] {false} ;
      T01BB18_A396EmprCod = new String[] {""} ;
      T01BB18_A252CliCod = new int[1] ;
      T01BB18_n252CliCod = new boolean[] {false} ;
      T01BB4_A279CliNom = new String[] {""} ;
      T01BB19_A279CliNom = new String[] {""} ;
      T01BB20_A396EmprCod = new String[] {""} ;
      T01BB20_A11248HpagIden = new int[1] ;
      T01BB20_A11250HpagLin = new short[1] ;
      T01BB3_A11248HpagIden = new int[1] ;
      T01BB3_A11250HpagLin = new short[1] ;
      T01BB3_A11251Hpagfec = new java.util.Date[] {GXutil.nullDate()} ;
      T01BB3_n11251Hpagfec = new boolean[] {false} ;
      T01BB3_A11252HpagImpo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BB3_n11252HpagImpo = new boolean[] {false} ;
      T01BB3_A11253HpagDoc = new String[] {""} ;
      T01BB3_n11253HpagDoc = new boolean[] {false} ;
      T01BB3_A11254HpagTerm = new String[] {""} ;
      T01BB3_n11254HpagTerm = new boolean[] {false} ;
      T01BB3_A11255HpagFechh = new java.util.Date[] {GXutil.nullDate()} ;
      T01BB3_n11255HpagFechh = new boolean[] {false} ;
      T01BB3_A11256HpagUsur = new String[] {""} ;
      T01BB3_n11256HpagUsur = new boolean[] {false} ;
      T01BB3_A396EmprCod = new String[] {""} ;
      T01BB3_A252CliCod = new int[1] ;
      T01BB3_n252CliCod = new boolean[] {false} ;
      T01BB2_A11248HpagIden = new int[1] ;
      T01BB2_A11250HpagLin = new short[1] ;
      T01BB2_A11251Hpagfec = new java.util.Date[] {GXutil.nullDate()} ;
      T01BB2_n11251Hpagfec = new boolean[] {false} ;
      T01BB2_A11252HpagImpo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BB2_n11252HpagImpo = new boolean[] {false} ;
      T01BB2_A11253HpagDoc = new String[] {""} ;
      T01BB2_n11253HpagDoc = new boolean[] {false} ;
      T01BB2_A11254HpagTerm = new String[] {""} ;
      T01BB2_n11254HpagTerm = new boolean[] {false} ;
      T01BB2_A11255HpagFechh = new java.util.Date[] {GXutil.nullDate()} ;
      T01BB2_n11255HpagFechh = new boolean[] {false} ;
      T01BB2_A11256HpagUsur = new String[] {""} ;
      T01BB2_n11256HpagUsur = new boolean[] {false} ;
      T01BB2_A396EmprCod = new String[] {""} ;
      T01BB2_A252CliCod = new int[1] ;
      T01BB2_n252CliCod = new boolean[] {false} ;
      T01BB24_A279CliNom = new String[] {""} ;
      T01BB25_A396EmprCod = new String[] {""} ;
      T01BB25_A11248HpagIden = new int[1] ;
      T01BB25_A11250HpagLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.thpagcl__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.thpagcl__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.thpagcl__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.thpagcl__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.thpagcl__default(),
         new Object[] {
             new Object[] {
            T01BB2_A11248HpagIden, T01BB2_A11250HpagLin, T01BB2_A11251Hpagfec, T01BB2_n11251Hpagfec, T01BB2_A11252HpagImpo, T01BB2_n11252HpagImpo, T01BB2_A11253HpagDoc, T01BB2_n11253HpagDoc, T01BB2_A11254HpagTerm, T01BB2_n11254HpagTerm,
            T01BB2_A11255HpagFechh, T01BB2_n11255HpagFechh, T01BB2_A11256HpagUsur, T01BB2_n11256HpagUsur, T01BB2_A396EmprCod, T01BB2_A252CliCod, T01BB2_n252CliCod
            }
            , new Object[] {
            T01BB3_A11248HpagIden, T01BB3_A11250HpagLin, T01BB3_A11251Hpagfec, T01BB3_n11251Hpagfec, T01BB3_A11252HpagImpo, T01BB3_n11252HpagImpo, T01BB3_A11253HpagDoc, T01BB3_n11253HpagDoc, T01BB3_A11254HpagTerm, T01BB3_n11254HpagTerm,
            T01BB3_A11255HpagFechh, T01BB3_n11255HpagFechh, T01BB3_A11256HpagUsur, T01BB3_n11256HpagUsur, T01BB3_A396EmprCod, T01BB3_A252CliCod, T01BB3_n252CliCod
            }
            , new Object[] {
            T01BB4_A279CliNom
            }
            , new Object[] {
            T01BB5_A11248HpagIden, T01BB5_A11249HpagUltl, T01BB5_n11249HpagUltl, T01BB5_A396EmprCod
            }
            , new Object[] {
            T01BB6_A11248HpagIden, T01BB6_A11249HpagUltl, T01BB6_n11249HpagUltl, T01BB6_A396EmprCod
            }
            , new Object[] {
            T01BB7_A407EmprNom, T01BB7_n407EmprNom
            }
            , new Object[] {
            T01BB8_A11248HpagIden, T01BB8_A407EmprNom, T01BB8_n407EmprNom, T01BB8_A11249HpagUltl, T01BB8_n11249HpagUltl, T01BB8_A396EmprCod
            }
            , new Object[] {
            T01BB9_A407EmprNom, T01BB9_n407EmprNom
            }
            , new Object[] {
            T01BB10_A396EmprCod, T01BB10_A11248HpagIden
            }
            , new Object[] {
            T01BB11_A396EmprCod, T01BB11_A11248HpagIden
            }
            , new Object[] {
            T01BB12_A396EmprCod, T01BB12_A11248HpagIden
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01BB16_A407EmprNom, T01BB16_n407EmprNom
            }
            , new Object[] {
            T01BB17_A396EmprCod, T01BB17_A11248HpagIden
            }
            , new Object[] {
            T01BB18_A11248HpagIden, T01BB18_A11250HpagLin, T01BB18_A11251Hpagfec, T01BB18_n11251Hpagfec, T01BB18_A11252HpagImpo, T01BB18_n11252HpagImpo, T01BB18_A279CliNom, T01BB18_A11253HpagDoc, T01BB18_n11253HpagDoc, T01BB18_A11254HpagTerm,
            T01BB18_n11254HpagTerm, T01BB18_A11255HpagFechh, T01BB18_n11255HpagFechh, T01BB18_A11256HpagUsur, T01BB18_n11256HpagUsur, T01BB18_A396EmprCod, T01BB18_A252CliCod, T01BB18_n252CliCod
            }
            , new Object[] {
            T01BB19_A279CliNom
            }
            , new Object[] {
            T01BB20_A396EmprCod, T01BB20_A11248HpagIden, T01BB20_A11250HpagLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01BB24_A279CliNom
            }
            , new Object[] {
            T01BB25_A396EmprCod, T01BB25_A11248HpagIden, T01BB25_A11250HpagLin
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
   private short Z11249HpagUltl ;
   private short Z11250HpagLin ;
   private short nRcdDeleted_1499 ;
   private short nRcdExists_1499 ;
   private short nIsMod_1499 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A11249HpagUltl ;
   private short nBlankRcdCount1499 ;
   private short RcdFound1499 ;
   private short nBlankRcdUsr1499 ;
   private short A11250HpagLin ;
   private short RcdFound1498 ;
   private short nIsDirty_1498 ;
   private short nIsDirty_1499 ;
   private short ZZ11249HpagUltl ;
   private int Z11248HpagIden ;
   private int nRC_GXsfl_40 ;
   private int nGXsfl_40_idx=1 ;
   private int Z252CliCod ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A11248HpagIden ;
   private int edtHpagIden_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtHpagUltl_Enabled ;
   private int edtavnRcdDeleted_1499_Enabled ;
   private int edtHpagLin_Enabled ;
   private int edtHpagfec_Enabled ;
   private int edtHpagImpo_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtHpagDoc_Enabled ;
   private int edtHpagTerm_Enabled ;
   private int edtHpagFechh_Enabled ;
   private int edtHpagUsur_Enabled ;
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
   private int defedtHpagLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtHpagUltl_Backcolor ;
   private int edtHpagIden_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ11248HpagIden ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z11252HpagImpo ;
   private java.math.BigDecimal A11252HpagImpo ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z11253HpagDoc ;
   private String Z11254HpagTerm ;
   private String Z11256HpagUsur ;
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
   private String edtHpagIden_Internalname ;
   private String edtHpagIden_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtHpagUltl_Internalname ;
   private String edtHpagUltl_Jsonclick ;
   private String sMode1499 ;
   private String edtavnRcdDeleted_1499_Internalname ;
   private String edtHpagLin_Internalname ;
   private String edtHpagfec_Internalname ;
   private String edtHpagImpo_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliNom_Internalname ;
   private String edtHpagDoc_Internalname ;
   private String edtHpagTerm_Internalname ;
   private String edtHpagFechh_Internalname ;
   private String edtHpagUsur_Internalname ;
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
   private String sMode1498 ;
   private String GXCCtl ;
   private String A279CliNom ;
   private String A11253HpagDoc ;
   private String A11254HpagTerm ;
   private String A11256HpagUsur ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String sGXsfl_40_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1499_Jsonclick ;
   private String edtHpagLin_Jsonclick ;
   private String edtHpagfec_Jsonclick ;
   private String edtHpagImpo_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtHpagDoc_Jsonclick ;
   private String edtHpagTerm_Jsonclick ;
   private String edtHpagFechh_Jsonclick ;
   private String edtHpagUsur_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private java.util.Date Z11255HpagFechh ;
   private java.util.Date A11255HpagFechh ;
   private java.util.Date Z11251Hpagfec ;
   private java.util.Date A11251Hpagfec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean wbErr ;
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n11249HpagUltl ;
   private boolean n11251Hpagfec ;
   private boolean n11252HpagImpo ;
   private boolean n11253HpagDoc ;
   private boolean n11254HpagTerm ;
   private boolean n11255HpagFechh ;
   private boolean n11256HpagUsur ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private int[] T01BB8_A11248HpagIden ;
   private String[] T01BB8_A407EmprNom ;
   private boolean[] T01BB8_n407EmprNom ;
   private short[] T01BB8_A11249HpagUltl ;
   private boolean[] T01BB8_n11249HpagUltl ;
   private String[] T01BB8_A396EmprCod ;
   private String[] T01BB7_A407EmprNom ;
   private boolean[] T01BB7_n407EmprNom ;
   private String[] T01BB9_A407EmprNom ;
   private boolean[] T01BB9_n407EmprNom ;
   private String[] T01BB10_A396EmprCod ;
   private int[] T01BB10_A11248HpagIden ;
   private int[] T01BB6_A11248HpagIden ;
   private short[] T01BB6_A11249HpagUltl ;
   private boolean[] T01BB6_n11249HpagUltl ;
   private String[] T01BB6_A396EmprCod ;
   private String[] T01BB11_A396EmprCod ;
   private int[] T01BB11_A11248HpagIden ;
   private String[] T01BB12_A396EmprCod ;
   private int[] T01BB12_A11248HpagIden ;
   private int[] T01BB5_A11248HpagIden ;
   private short[] T01BB5_A11249HpagUltl ;
   private boolean[] T01BB5_n11249HpagUltl ;
   private String[] T01BB5_A396EmprCod ;
   private String[] T01BB16_A407EmprNom ;
   private boolean[] T01BB16_n407EmprNom ;
   private String[] T01BB17_A396EmprCod ;
   private int[] T01BB17_A11248HpagIden ;
   private int[] T01BB18_A11248HpagIden ;
   private short[] T01BB18_A11250HpagLin ;
   private java.util.Date[] T01BB18_A11251Hpagfec ;
   private boolean[] T01BB18_n11251Hpagfec ;
   private java.math.BigDecimal[] T01BB18_A11252HpagImpo ;
   private boolean[] T01BB18_n11252HpagImpo ;
   private String[] T01BB18_A279CliNom ;
   private String[] T01BB18_A11253HpagDoc ;
   private boolean[] T01BB18_n11253HpagDoc ;
   private String[] T01BB18_A11254HpagTerm ;
   private boolean[] T01BB18_n11254HpagTerm ;
   private java.util.Date[] T01BB18_A11255HpagFechh ;
   private boolean[] T01BB18_n11255HpagFechh ;
   private String[] T01BB18_A11256HpagUsur ;
   private boolean[] T01BB18_n11256HpagUsur ;
   private String[] T01BB18_A396EmprCod ;
   private int[] T01BB18_A252CliCod ;
   private boolean[] T01BB18_n252CliCod ;
   private String[] T01BB4_A279CliNom ;
   private String[] T01BB19_A279CliNom ;
   private String[] T01BB20_A396EmprCod ;
   private int[] T01BB20_A11248HpagIden ;
   private short[] T01BB20_A11250HpagLin ;
   private int[] T01BB3_A11248HpagIden ;
   private short[] T01BB3_A11250HpagLin ;
   private java.util.Date[] T01BB3_A11251Hpagfec ;
   private boolean[] T01BB3_n11251Hpagfec ;
   private java.math.BigDecimal[] T01BB3_A11252HpagImpo ;
   private boolean[] T01BB3_n11252HpagImpo ;
   private String[] T01BB3_A11253HpagDoc ;
   private boolean[] T01BB3_n11253HpagDoc ;
   private String[] T01BB3_A11254HpagTerm ;
   private boolean[] T01BB3_n11254HpagTerm ;
   private java.util.Date[] T01BB3_A11255HpagFechh ;
   private boolean[] T01BB3_n11255HpagFechh ;
   private String[] T01BB3_A11256HpagUsur ;
   private boolean[] T01BB3_n11256HpagUsur ;
   private String[] T01BB3_A396EmprCod ;
   private int[] T01BB3_A252CliCod ;
   private boolean[] T01BB3_n252CliCod ;
   private int[] T01BB2_A11248HpagIden ;
   private short[] T01BB2_A11250HpagLin ;
   private java.util.Date[] T01BB2_A11251Hpagfec ;
   private boolean[] T01BB2_n11251Hpagfec ;
   private java.math.BigDecimal[] T01BB2_A11252HpagImpo ;
   private boolean[] T01BB2_n11252HpagImpo ;
   private String[] T01BB2_A11253HpagDoc ;
   private boolean[] T01BB2_n11253HpagDoc ;
   private String[] T01BB2_A11254HpagTerm ;
   private boolean[] T01BB2_n11254HpagTerm ;
   private java.util.Date[] T01BB2_A11255HpagFechh ;
   private boolean[] T01BB2_n11255HpagFechh ;
   private String[] T01BB2_A11256HpagUsur ;
   private boolean[] T01BB2_n11256HpagUsur ;
   private String[] T01BB2_A396EmprCod ;
   private int[] T01BB2_A252CliCod ;
   private boolean[] T01BB2_n252CliCod ;
   private String[] T01BB24_A279CliNom ;
   private String[] T01BB25_A396EmprCod ;
   private int[] T01BB25_A11248HpagIden ;
   private short[] T01BB25_A11250HpagLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class thpagcl__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thpagcl__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thpagcl__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thpagcl__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thpagcl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01BB2", "SELECT HpagIden, HpagLin, Hpagfec, HpagImpo, HpagDoc, HpagTerm, HpagFechh, HpagUsur, EmprCod, CliCod FROM TXPHPAGC1 WHERE EmprCod = ? AND HpagIden = ? AND HpagLin = ?  FOR UPDATE OF Hpagfec, HpagImpo, HpagDoc, HpagTerm, HpagFechh, HpagUsur, CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BB3", "SELECT HpagIden, HpagLin, Hpagfec, HpagImpo, HpagDoc, HpagTerm, HpagFechh, HpagUsur, EmprCod, CliCod FROM TXPHPAGC1 WHERE EmprCod = ? AND HpagIden = ? AND HpagLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BB4", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BB5", "SELECT HpagIden, HpagUltl, EmprCod FROM TXPHPAGCL WHERE EmprCod = ? AND HpagIden = ?  FOR UPDATE OF HpagUltl NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BB6", "SELECT HpagIden, HpagUltl, EmprCod FROM TXPHPAGCL WHERE EmprCod = ? AND HpagIden = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BB7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BB8", "SELECT /*+ FIRST_ROWS(100) */ TM1.HpagIden, T2.EmprNom, TM1.HpagUltl, TM1.EmprCod FROM (TXPHPAGCL TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.HpagIden = ? ORDER BY TM1.EmprCod, TM1.HpagIden ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BB9", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BB10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, HpagIden FROM TXPHPAGCL WHERE EmprCod = ? AND HpagIden = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BB11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HpagIden FROM TXPHPAGCL WHERE ( EmprCod > ? or EmprCod = ? and HpagIden > ?) ORDER BY EmprCod, HpagIden) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BB12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HpagIden FROM TXPHPAGCL WHERE ( EmprCod < ? or EmprCod = ? and HpagIden < ?) ORDER BY EmprCod DESC, HpagIden DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01BB13", "INSERT INTO TXPHPAGCL(HpagIden, HpagUltl, EmprCod) VALUES(?, ?, ?)", GX_NOMASK, "TXPHPAGCL")
         ,new UpdateCursor("T01BB14", "UPDATE TXPHPAGCL SET HpagUltl=?  WHERE EmprCod = ? AND HpagIden = ?", GX_NOMASK, "TXPHPAGCL")
         ,new UpdateCursor("T01BB15", "DELETE FROM TXPHPAGCL  WHERE EmprCod = ? AND HpagIden = ?", GX_NOMASK, "TXPHPAGCL")
         ,new ForEachCursor("T01BB16", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BB17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, HpagIden FROM TXPHPAGCL ORDER BY EmprCod, HpagIden ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BB18", "SELECT T1.HpagIden, T1.HpagLin, T1.Hpagfec, T1.HpagImpo, T2.CliNom, T1.HpagDoc, T1.HpagTerm, T1.HpagFechh, T1.HpagUsur, T1.EmprCod, T1.CliCod FROM (TXPHPAGC1 T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.HpagIden = ? and T1.HpagLin = ? ORDER BY T1.EmprCod, T1.HpagIden, T1.HpagLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BB19", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BB20", "SELECT EmprCod, HpagIden, HpagLin FROM TXPHPAGC1 WHERE EmprCod = ? AND HpagIden = ? AND HpagLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01BB21", "INSERT INTO TXPHPAGC1(HpagIden, HpagLin, Hpagfec, HpagImpo, HpagDoc, HpagTerm, HpagFechh, HpagUsur, EmprCod, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHPAGC1")
         ,new UpdateCursor("T01BB22", "UPDATE TXPHPAGC1 SET Hpagfec=?, HpagImpo=?, HpagDoc=?, HpagTerm=?, HpagFechh=?, HpagUsur=?, CliCod=?  WHERE EmprCod = ? AND HpagIden = ? AND HpagLin = ?", GX_NOMASK, "TXPHPAGC1")
         ,new UpdateCursor("T01BB23", "DELETE FROM TXPHPAGC1  WHERE EmprCod = ? AND HpagIden = ? AND HpagLin = ?", GX_NOMASK, "TXPHPAGC1")
         ,new ForEachCursor("T01BB24", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BB25", "SELECT EmprCod, HpagIden, HpagLin FROM TXPHPAGC1 WHERE EmprCod = ? and HpagIden = ? ORDER BY EmprCod, HpagIden, HpagLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 3);
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 3);
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((String[]) buf[7])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 3);
               ((int[]) buf[16])[0] = rslt.getInt(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
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
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 19 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 10);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 10);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[11], false);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[13], 10);
               }
               stmt.setString(9, (String)parms[14], 3);
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[16]).intValue());
               }
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 10);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 10);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 10);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[13]).intValue());
               }
               stmt.setString(8, (String)parms[14], 3);
               stmt.setInt(9, ((Number) parms[15]).intValue());
               stmt.setShort(10, ((Number) parms[16]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

