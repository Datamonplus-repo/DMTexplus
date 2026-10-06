package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tconsfi_impl extends GXDataArea
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
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A681PrdAny = (short)(GXutil.lval( httpContext.GetPar( "PrdAny"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A681PrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A681PrdAny), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A719PrdNum, A681PrdAny) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CONSUMOS POR FIBRAS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPrdNum_Internalname ;
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

   public tconsfi_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tconsfi_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tconsfi_impl.class ));
   }

   public tconsfi_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONSFI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONSFI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONSFI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONSFI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCONSFI.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCONSFI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCONSFI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "ProductoID", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCONSFI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCONSFI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Año estadistica Productos", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCONSFI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdAny_Internalname, GXutil.ltrim( localUtil.ntoc( A681PrdAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdAny_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A681PrdAny), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A681PrdAny), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdAny_Jsonclick, 0, "", "", "", "", "", 1, edtPrdAny_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCONSFI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Tipo Articulo", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCONSFI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A3669PrdTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdTipArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3669PrdTipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3669PrdTipArt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdTipArt_Jsonclick, 0, "", "", "", "", "", 1, edtPrdTipArt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCONSFI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONSFI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCONSFI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCONSFI.htm");
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
         nBlankRcdCount515 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_515 = (short)(1) ;
            scanStartDS515( ) ;
            while ( RcdFound515 != 0 )
            {
               init_level_properties515( ) ;
               getByPrimaryKeyDS515( ) ;
               addRowDS515( ) ;
               scanNextDS515( ) ;
            }
            scanEndDS515( ) ;
            nBlankRcdCount515 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalDS515( ) ;
         standaloneModalDS515( ) ;
         sMode515 = Gx_mode ;
         while ( nGXsfl_45_idx < nRC_GXsfl_45 )
         {
            bGXsfl_45_Refreshing = true ;
            readRowDS515( ) ;
            edtavnRcdDeleted_515_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_515_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_515_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_515_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPrdMes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDMES_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdMes_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPrdFibKT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDFIBKT_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdFibKT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFibKT_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPrdFibMT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDFIBMT_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdFibMT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFibMT_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPrdFibKC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDFIBKC_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdFibKC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFibKC_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPrdFibMC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDFIBMC_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdFibMC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFibMC_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPrdFibValK_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDFIBVALK_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdFibValK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFibValK_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPrdFibValM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDFIBVALM_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdFibValM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFibValM_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            if ( ( nRcdExists_515 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalDS515( ) ;
            }
            sendRowDS515( ) ;
            bGXsfl_45_Refreshing = false ;
         }
         Gx_mode = sMode515 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount515 = (short)(5) ;
         nRcdExists_515 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartDS515( ) ;
            while ( RcdFound515 != 0 )
            {
               sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_45515( ) ;
               init_level_properties515( ) ;
               standaloneNotModalDS515( ) ;
               getByPrimaryKeyDS515( ) ;
               standaloneModalDS515( ) ;
               addRowDS515( ) ;
               scanNextDS515( ) ;
            }
            scanEndDS515( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode515 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_45515( ) ;
      initAllDS515( ) ;
      init_level_properties515( ) ;
      nRcdExists_515 = (short)(0) ;
      nIsMod_515 = (short)(0) ;
      nRcdDeleted_515 = (short)(0) ;
      nBlankRcdCount515 = (short)(nBlankRcdUsr515+nBlankRcdCount515) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount515 > 0 )
      {
         standaloneNotModalDS515( ) ;
         standaloneModalDS515( ) ;
         addRowDS515( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtPrdMes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount515 = (short)(nBlankRcdCount515-1) ;
      }
      Gx_mode = sMode515 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONSFI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONSFI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONSFI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONSFI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCONSFI.htm");
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
      e11DS2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
            Z681PrdAny = (short)(localUtil.ctol( httpContext.cgiGet( "Z681PrdAny"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3669PrdTipArt = (short)(localUtil.ctol( httpContext.cgiGet( "Z3669PrdTipArt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDANY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrdAny_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A681PrdAny = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A681PrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A681PrdAny), 4, 0));
            }
            else
            {
               A681PrdAny = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A681PrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A681PrdAny), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDTIPART");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrdTipArt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3669PrdTipArt = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3669PrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3669PrdTipArt), 4, 0));
            }
            else
            {
               A3669PrdTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3669PrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3669PrdTipArt), 4, 0));
            }
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
               A719PrdNum = httpContext.GetPar( "PrdNum") ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               A681PrdAny = (short)(GXutil.lval( httpContext.GetPar( "PrdAny"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A681PrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A681PrdAny), 4, 0));
               A3669PrdTipArt = (short)(GXutil.lval( httpContext.GetPar( "PrdTipArt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3669PrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3669PrdTipArt), 4, 0));
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
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
                        e11DS2 ();
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
            initAllDS514( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_515_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_515_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      disableAttributesDS514( ) ;
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

   public void confirm_DS0( )
   {
      beforeValidateDS514( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsDS514( ) ;
         }
         else
         {
            checkExtendedTableDS514( ) ;
            if ( AnyError == 0 )
            {
               zmDS514( 2) ;
               zmDS514( 3) ;
            }
            closeExtendedTableCursorsDS514( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode514 = Gx_mode ;
         confirm_DS515( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode514 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode514 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesDS0( ) ;
      }
   }

   public void confirm_DS515( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRowDS515( ) ;
         if ( ( nRcdExists_515 != 0 ) || ( nIsMod_515 != 0 ) )
         {
            getKeyDS515( ) ;
            if ( ( nRcdExists_515 == 0 ) && ( nRcdDeleted_515 == 0 ) )
            {
               if ( RcdFound515 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateDS515( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableDS515( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsDS515( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PRDMES_" + sGXsfl_45_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPrdMes_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound515 != 0 )
               {
                  if ( nRcdDeleted_515 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyDS515( ) ;
                     loadDS515( ) ;
                     beforeValidateDS515( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsDS515( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_515 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateDS515( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableDS515( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsDS515( ) ;
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
                  if ( nRcdDeleted_515 == 0 )
                  {
                     GXCCtl = "PRDMES_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrdMes_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_515_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_515, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdMes_Internalname, GXutil.ltrim( localUtil.ntoc( A3670PrdMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdFibKT_Internalname, GXutil.ltrim( localUtil.ntoc( A3671PrdFibKT, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdFibMT_Internalname, GXutil.ltrim( localUtil.ntoc( A3672PrdFibMT, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdFibKC_Internalname, GXutil.ltrim( localUtil.ntoc( A3673PrdFibKC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdFibMC_Internalname, GXutil.ltrim( localUtil.ntoc( A3674PrdFibMC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdFibValK_Internalname, GXutil.ltrim( localUtil.ntoc( A3675PrdFibValK, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdFibValM_Internalname, GXutil.ltrim( localUtil.ntoc( A3676PrdFibValM, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3670PrdMes_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z3670PrdMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3671PrdFibKT_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z3671PrdFibKT, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3672PrdFibMT_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z3672PrdFibMT, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3673PrdFibKC_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z3673PrdFibKC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3674PrdFibMC_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z3674PrdFibMC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3675PrdFibValK_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z3675PrdFibValK, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3676PrdFibValM_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z3676PrdFibValM, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_515_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_515, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_515_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_515, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_515_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_515, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_515 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_515_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_515_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDMES_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdMes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDFIBKT_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFibKT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDFIBMT_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFibMT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDFIBKC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFibKC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDFIBMC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFibMC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDFIBVALK_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFibValK_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDFIBVALM_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFibValM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionDS0( )
   {
   }

   public void e11DS2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV18Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV16EmprNom ;
      GXv_char3[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char1, GXv_char2, GXv_char3) ;
      tconsfi_impl.this.A396EmprCod = GXv_char1[0] ;
      tconsfi_impl.this.AV16EmprNom = GXv_char2[0] ;
      tconsfi_impl.this.AV17UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char4 = AV20LitFe ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
      tconsfi_impl.this.GXt_char4 = GXv_char3[0] ;
      AV20LitFe = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20LitFe", AV20LitFe);
      GXt_char4 = AV19Lit0 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char3) ;
      tconsfi_impl.this.GXt_char4 = GXv_char3[0] ;
      AV19Lit0 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit0", AV19Lit0);
   }

   public void zmDS514( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -1 )
      {
         Z3669PrdTipArt = A3669PrdTipArt ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z681PrdAny = A681PrdAny ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T00DS6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00DS6_A407EmprNom[0] ;
      n407EmprNom = T00DS6_n407EmprNom[0] ;
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

   public void loadDS514( )
   {
      /* Using cursor T00DS8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Short.valueOf(A3669PrdTipArt)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound514 = (short)(1) ;
         A407EmprNom = T00DS8_A407EmprNom[0] ;
         n407EmprNom = T00DS8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zmDS514( -1) ;
      }
      pr_default.close(6);
      onLoadActionsDS514( ) ;
   }

   public void onLoadActionsDS514( )
   {
   }

   public void checkExtendedTableDS514( )
   {
      nIsDirty_514 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00DS7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPRDES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDANY");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
   }

   public void closeExtendedTableCursorsDS514( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         String A719PrdNum ,
                         short A681PrdAny )
   {
      /* Using cursor T00DS9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPRDES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDANY");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKeyDS514( )
   {
      /* Using cursor T00DS10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Short.valueOf(A3669PrdTipArt)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound514 = (short)(1) ;
      }
      else
      {
         RcdFound514 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00DS5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Short.valueOf(A3669PrdTipArt)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T00DS5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmDS514( 1) ;
         RcdFound514 = (short)(1) ;
         A3669PrdTipArt = T00DS5_A3669PrdTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3669PrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3669PrdTipArt), 4, 0));
         A719PrdNum = T00DS5_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A681PrdAny = T00DS5_A681PrdAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A681PrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A681PrdAny), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z681PrdAny = A681PrdAny ;
         Z3669PrdTipArt = A3669PrdTipArt ;
         sMode514 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadDS514( ) ;
         if ( AnyError == 1 )
         {
            RcdFound514 = (short)(0) ;
            initializeNonKeyDS514( ) ;
         }
         Gx_mode = sMode514 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound514 = (short)(0) ;
         initializeNonKeyDS514( ) ;
         sMode514 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode514 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyDS514( ) ;
      if ( RcdFound514 == 0 )
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
      RcdFound514 = (short)(0) ;
      /* Using cursor T00DS11 */
      pr_default.execute(9, new Object[] {A719PrdNum, A719PrdNum, Short.valueOf(A681PrdAny), Short.valueOf(A681PrdAny), A719PrdNum, Short.valueOf(A3669PrdTipArt), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T00DS11_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T00DS11_A719PrdNum[0], A719PrdNum) == 0 ) && ( T00DS11_A681PrdAny[0] < A681PrdAny ) || ( T00DS11_A681PrdAny[0] == A681PrdAny ) && ( GXutil.strcmp(T00DS11_A719PrdNum[0], A719PrdNum) == 0 ) && ( T00DS11_A3669PrdTipArt[0] < A3669PrdTipArt ) ) && ( GXutil.strcmp(T00DS11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T00DS11_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T00DS11_A719PrdNum[0], A719PrdNum) == 0 ) && ( T00DS11_A681PrdAny[0] > A681PrdAny ) || ( T00DS11_A681PrdAny[0] == A681PrdAny ) && ( GXutil.strcmp(T00DS11_A719PrdNum[0], A719PrdNum) == 0 ) && ( T00DS11_A3669PrdTipArt[0] > A3669PrdTipArt ) ) && ( GXutil.strcmp(T00DS11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A719PrdNum = T00DS11_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A681PrdAny = T00DS11_A681PrdAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A681PrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A681PrdAny), 4, 0));
            A3669PrdTipArt = T00DS11_A3669PrdTipArt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3669PrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3669PrdTipArt), 4, 0));
            RcdFound514 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound514 = (short)(0) ;
      /* Using cursor T00DS12 */
      pr_default.execute(10, new Object[] {A719PrdNum, A719PrdNum, Short.valueOf(A681PrdAny), Short.valueOf(A681PrdAny), A719PrdNum, Short.valueOf(A3669PrdTipArt), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T00DS12_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T00DS12_A719PrdNum[0], A719PrdNum) == 0 ) && ( T00DS12_A681PrdAny[0] > A681PrdAny ) || ( T00DS12_A681PrdAny[0] == A681PrdAny ) && ( GXutil.strcmp(T00DS12_A719PrdNum[0], A719PrdNum) == 0 ) && ( T00DS12_A3669PrdTipArt[0] > A3669PrdTipArt ) ) && ( GXutil.strcmp(T00DS12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T00DS12_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T00DS12_A719PrdNum[0], A719PrdNum) == 0 ) && ( T00DS12_A681PrdAny[0] < A681PrdAny ) || ( T00DS12_A681PrdAny[0] == A681PrdAny ) && ( GXutil.strcmp(T00DS12_A719PrdNum[0], A719PrdNum) == 0 ) && ( T00DS12_A3669PrdTipArt[0] < A3669PrdTipArt ) ) && ( GXutil.strcmp(T00DS12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A719PrdNum = T00DS12_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A681PrdAny = T00DS12_A681PrdAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A681PrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A681PrdAny), 4, 0));
            A3669PrdTipArt = T00DS12_A3669PrdTipArt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3669PrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3669PrdTipArt), 4, 0));
            RcdFound514 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyDS514( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertDS514( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound514 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A681PrdAny != Z681PrdAny ) || ( A3669PrdTipArt != Z3669PrdTipArt ) )
            {
               A719PrdNum = Z719PrdNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               A681PrdAny = Z681PrdAny ;
               httpContext.ajax_rsp_assign_attri("", false, "A681PrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A681PrdAny), 4, 0));
               A3669PrdTipArt = Z3669PrdTipArt ;
               httpContext.ajax_rsp_assign_attri("", false, "A3669PrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3669PrdTipArt), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateDS514( ) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A681PrdAny != Z681PrdAny ) || ( A3669PrdTipArt != Z3669PrdTipArt ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertDS514( ) ;
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
                  GX_FocusControl = edtPrdNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertDS514( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A681PrdAny != Z681PrdAny ) || ( A3669PrdTipArt != Z3669PrdTipArt ) )
      {
         A719PrdNum = Z719PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A681PrdAny = Z681PrdAny ;
         httpContext.ajax_rsp_assign_attri("", false, "A681PrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A681PrdAny), 4, 0));
         A3669PrdTipArt = Z3669PrdTipArt ;
         httpContext.ajax_rsp_assign_attri("", false, "A3669PrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3669PrdTipArt), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPrdNum_Internalname ;
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
      getKeyDS514( ) ;
      if ( RcdFound514 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A681PrdAny != Z681PrdAny ) || ( A3669PrdTipArt != Z3669PrdTipArt ) )
         {
            A719PrdNum = Z719PrdNum ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A681PrdAny = Z681PrdAny ;
            httpContext.ajax_rsp_assign_attri("", false, "A681PrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A681PrdAny), 4, 0));
            A3669PrdTipArt = Z3669PrdTipArt ;
            httpContext.ajax_rsp_assign_attri("", false, "A3669PrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3669PrdTipArt), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A681PrdAny != Z681PrdAny ) || ( A3669PrdTipArt != Z3669PrdTipArt ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tconsfi");
   }

   public void insert_check( )
   {
      confirm_DS0( ) ;
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
      if ( RcdFound514 == 0 )
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
      scanStartDS514( ) ;
      if ( RcdFound514 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndDS514( ) ;
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
      if ( RcdFound514 == 0 )
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
      if ( RcdFound514 == 0 )
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
      scanStartDS514( ) ;
      if ( RcdFound514 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound514 != 0 )
         {
            scanNextDS514( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndDS514( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyDS514( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00DS4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Short.valueOf(A3669PrdTipArt)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCONSFI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCONSFI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertDS514( )
   {
      beforeValidateDS514( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableDS514( ) ;
      }
      if ( AnyError == 0 )
      {
         zmDS514( 0) ;
         checkOptimisticConcurrencyDS514( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmDS514( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertDS514( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00DS13 */
                  pr_default.execute(11, new Object[] {Short.valueOf(A3669PrdTipArt), A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONSFI");
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
                        processLevelDS514( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionDS0( ) ;
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
            loadDS514( ) ;
         }
         endLevelDS514( ) ;
      }
      closeExtendedTableCursorsDS514( ) ;
   }

   public void updateDS514( )
   {
      beforeValidateDS514( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableDS514( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyDS514( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmDS514( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateDS514( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPCONSFI */
                  deferredUpdateDS514( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelDS514( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionDS0( ) ;
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
         endLevelDS514( ) ;
      }
      closeExtendedTableCursorsDS514( ) ;
   }

   public void deferredUpdateDS514( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateDS514( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyDS514( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsDS514( ) ;
         afterConfirmDS514( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteDS514( ) ;
            if ( AnyError == 0 )
            {
               scanStartDS515( ) ;
               while ( RcdFound515 != 0 )
               {
                  getByPrimaryKeyDS515( ) ;
                  deleteDS515( ) ;
                  scanNextDS515( ) ;
               }
               scanEndDS515( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00DS14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Short.valueOf(A3669PrdTipArt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONSFI");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound514 == 0 )
                        {
                           initAllDS514( ) ;
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
                        resetCaptionDS0( ) ;
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
      sMode514 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelDS514( ) ;
      Gx_mode = sMode514 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsDS514( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevelDS515( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRowDS515( ) ;
         if ( ( nRcdExists_515 != 0 ) || ( nIsMod_515 != 0 ) )
         {
            standaloneNotModalDS515( ) ;
            getKeyDS515( ) ;
            if ( ( nRcdExists_515 == 0 ) && ( nRcdDeleted_515 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertDS515( ) ;
            }
            else
            {
               if ( RcdFound515 != 0 )
               {
                  if ( ( nRcdDeleted_515 != 0 ) && ( nRcdExists_515 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteDS515( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_515 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateDS515( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_515 == 0 )
                  {
                     GXCCtl = "PRDMES_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrdMes_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_515_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_515, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdMes_Internalname, GXutil.ltrim( localUtil.ntoc( A3670PrdMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdFibKT_Internalname, GXutil.ltrim( localUtil.ntoc( A3671PrdFibKT, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdFibMT_Internalname, GXutil.ltrim( localUtil.ntoc( A3672PrdFibMT, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdFibKC_Internalname, GXutil.ltrim( localUtil.ntoc( A3673PrdFibKC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdFibMC_Internalname, GXutil.ltrim( localUtil.ntoc( A3674PrdFibMC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdFibValK_Internalname, GXutil.ltrim( localUtil.ntoc( A3675PrdFibValK, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdFibValM_Internalname, GXutil.ltrim( localUtil.ntoc( A3676PrdFibValM, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3670PrdMes_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z3670PrdMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3671PrdFibKT_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z3671PrdFibKT, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3672PrdFibMT_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z3672PrdFibMT, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3673PrdFibKC_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z3673PrdFibKC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3674PrdFibMC_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z3674PrdFibMC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3675PrdFibValK_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z3675PrdFibValK, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3676PrdFibValM_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z3676PrdFibValM, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_515_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_515, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_515_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_515, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_515_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_515, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_515 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_515_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_515_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDMES_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdMes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDFIBKT_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFibKT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDFIBMT_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFibMT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDFIBKC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFibKC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDFIBMC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFibMC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDFIBVALK_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFibValK_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDFIBVALM_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFibValM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllDS515( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_515 = (short)(0) ;
      nIsMod_515 = (short)(0) ;
      nRcdDeleted_515 = (short)(0) ;
   }

   public void processLevelDS514( )
   {
      /* Save parent mode. */
      sMode514 = Gx_mode ;
      processNestedLevelDS515( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode514 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelDS514( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteDS514( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tconsfi");
         if ( AnyError == 0 )
         {
            confirmValuesDS0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tconsfi");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartDS514( )
   {
      /* Scan By routine */
      /* Using cursor T00DS15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      RcdFound514 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound514 = (short)(1) ;
         A719PrdNum = T00DS15_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A681PrdAny = T00DS15_A681PrdAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A681PrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A681PrdAny), 4, 0));
         A3669PrdTipArt = T00DS15_A3669PrdTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3669PrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3669PrdTipArt), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextDS514( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound514 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound514 = (short)(1) ;
         A719PrdNum = T00DS15_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A681PrdAny = T00DS15_A681PrdAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A681PrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A681PrdAny), 4, 0));
         A3669PrdTipArt = T00DS15_A3669PrdTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3669PrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3669PrdTipArt), 4, 0));
      }
   }

   public void scanEndDS514( )
   {
      pr_default.close(13);
   }

   public void afterConfirmDS514( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertDS514( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateDS514( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteDS514( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteDS514( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateDS514( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesDS514( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdAny_Enabled), 5, 0), true);
      edtPrdTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdTipArt_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zmDS515( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3671PrdFibKT = T00DS3_A3671PrdFibKT[0] ;
            Z3672PrdFibMT = T00DS3_A3672PrdFibMT[0] ;
            Z3673PrdFibKC = T00DS3_A3673PrdFibKC[0] ;
            Z3674PrdFibMC = T00DS3_A3674PrdFibMC[0] ;
            Z3675PrdFibValK = T00DS3_A3675PrdFibValK[0] ;
            Z3676PrdFibValM = T00DS3_A3676PrdFibValM[0] ;
         }
         else
         {
            Z3671PrdFibKT = A3671PrdFibKT ;
            Z3672PrdFibMT = A3672PrdFibMT ;
            Z3673PrdFibKC = A3673PrdFibKC ;
            Z3674PrdFibMC = A3674PrdFibMC ;
            Z3675PrdFibValK = A3675PrdFibValK ;
            Z3676PrdFibValM = A3676PrdFibValM ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z719PrdNum = A719PrdNum ;
         Z681PrdAny = A681PrdAny ;
         Z3669PrdTipArt = A3669PrdTipArt ;
         Z3670PrdMes = A3670PrdMes ;
         Z3671PrdFibKT = A3671PrdFibKT ;
         Z3672PrdFibMT = A3672PrdFibMT ;
         Z3673PrdFibKC = A3673PrdFibKC ;
         Z3674PrdFibMC = A3674PrdFibMC ;
         Z3675PrdFibValK = A3675PrdFibValK ;
         Z3676PrdFibValM = A3676PrdFibValM ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModalDS515( )
   {
   }

   public void standaloneModalDS515( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPrdMes_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdMes_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtPrdMes_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdMes_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
   }

   public void loadDS515( )
   {
      /* Using cursor T00DS16 */
      pr_default.execute(14, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Short.valueOf(A3669PrdTipArt), Byte.valueOf(A3670PrdMes)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound515 = (short)(1) ;
         A3671PrdFibKT = T00DS16_A3671PrdFibKT[0] ;
         n3671PrdFibKT = T00DS16_n3671PrdFibKT[0] ;
         A3672PrdFibMT = T00DS16_A3672PrdFibMT[0] ;
         n3672PrdFibMT = T00DS16_n3672PrdFibMT[0] ;
         A3673PrdFibKC = T00DS16_A3673PrdFibKC[0] ;
         n3673PrdFibKC = T00DS16_n3673PrdFibKC[0] ;
         A3674PrdFibMC = T00DS16_A3674PrdFibMC[0] ;
         n3674PrdFibMC = T00DS16_n3674PrdFibMC[0] ;
         A3675PrdFibValK = T00DS16_A3675PrdFibValK[0] ;
         n3675PrdFibValK = T00DS16_n3675PrdFibValK[0] ;
         A3676PrdFibValM = T00DS16_A3676PrdFibValM[0] ;
         n3676PrdFibValM = T00DS16_n3676PrdFibValM[0] ;
         zmDS515( -4) ;
      }
      pr_default.close(14);
      onLoadActionsDS515( ) ;
   }

   public void onLoadActionsDS515( )
   {
   }

   public void checkExtendedTableDS515( )
   {
      nIsDirty_515 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalDS515( ) ;
   }

   public void closeExtendedTableCursorsDS515( )
   {
   }

   public void enableDisableDS515( )
   {
   }

   public void getKeyDS515( )
   {
      /* Using cursor T00DS17 */
      pr_default.execute(15, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Short.valueOf(A3669PrdTipArt), Byte.valueOf(A3670PrdMes)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound515 = (short)(1) ;
      }
      else
      {
         RcdFound515 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKeyDS515( )
   {
      /* Using cursor T00DS3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Short.valueOf(A3669PrdTipArt), Byte.valueOf(A3670PrdMes)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00DS3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmDS515( 4) ;
         RcdFound515 = (short)(1) ;
         initializeNonKeyDS515( ) ;
         A3670PrdMes = T00DS3_A3670PrdMes[0] ;
         A3671PrdFibKT = T00DS3_A3671PrdFibKT[0] ;
         n3671PrdFibKT = T00DS3_n3671PrdFibKT[0] ;
         A3672PrdFibMT = T00DS3_A3672PrdFibMT[0] ;
         n3672PrdFibMT = T00DS3_n3672PrdFibMT[0] ;
         A3673PrdFibKC = T00DS3_A3673PrdFibKC[0] ;
         n3673PrdFibKC = T00DS3_n3673PrdFibKC[0] ;
         A3674PrdFibMC = T00DS3_A3674PrdFibMC[0] ;
         n3674PrdFibMC = T00DS3_n3674PrdFibMC[0] ;
         A3675PrdFibValK = T00DS3_A3675PrdFibValK[0] ;
         n3675PrdFibValK = T00DS3_n3675PrdFibValK[0] ;
         A3676PrdFibValM = T00DS3_A3676PrdFibValM[0] ;
         n3676PrdFibValM = T00DS3_n3676PrdFibValM[0] ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z681PrdAny = A681PrdAny ;
         Z3669PrdTipArt = A3669PrdTipArt ;
         Z3670PrdMes = A3670PrdMes ;
         sMode515 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalDS515( ) ;
         loadDS515( ) ;
         Gx_mode = sMode515 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound515 = (short)(0) ;
         initializeNonKeyDS515( ) ;
         sMode515 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalDS515( ) ;
         Gx_mode = sMode515 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesDS515( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyDS515( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00DS2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Short.valueOf(A3669PrdTipArt), Byte.valueOf(A3670PrdMes)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLCONSF"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z3671PrdFibKT, T00DS2_A3671PrdFibKT[0]) != 0 ) || ( DecimalUtil.compareTo(Z3672PrdFibMT, T00DS2_A3672PrdFibMT[0]) != 0 ) || ( DecimalUtil.compareTo(Z3673PrdFibKC, T00DS2_A3673PrdFibKC[0]) != 0 ) || ( DecimalUtil.compareTo(Z3674PrdFibMC, T00DS2_A3674PrdFibMC[0]) != 0 ) || ( DecimalUtil.compareTo(Z3675PrdFibValK, T00DS2_A3675PrdFibValK[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z3676PrdFibValM, T00DS2_A3676PrdFibValM[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z3671PrdFibKT, T00DS2_A3671PrdFibKT[0]) != 0 )
            {
               GXutil.writeLogln("tconsfi:[seudo value changed for attri]"+"PrdFibKT");
               GXutil.writeLogRaw("Old: ",Z3671PrdFibKT);
               GXutil.writeLogRaw("Current: ",T00DS2_A3671PrdFibKT[0]);
            }
            if ( DecimalUtil.compareTo(Z3672PrdFibMT, T00DS2_A3672PrdFibMT[0]) != 0 )
            {
               GXutil.writeLogln("tconsfi:[seudo value changed for attri]"+"PrdFibMT");
               GXutil.writeLogRaw("Old: ",Z3672PrdFibMT);
               GXutil.writeLogRaw("Current: ",T00DS2_A3672PrdFibMT[0]);
            }
            if ( DecimalUtil.compareTo(Z3673PrdFibKC, T00DS2_A3673PrdFibKC[0]) != 0 )
            {
               GXutil.writeLogln("tconsfi:[seudo value changed for attri]"+"PrdFibKC");
               GXutil.writeLogRaw("Old: ",Z3673PrdFibKC);
               GXutil.writeLogRaw("Current: ",T00DS2_A3673PrdFibKC[0]);
            }
            if ( DecimalUtil.compareTo(Z3674PrdFibMC, T00DS2_A3674PrdFibMC[0]) != 0 )
            {
               GXutil.writeLogln("tconsfi:[seudo value changed for attri]"+"PrdFibMC");
               GXutil.writeLogRaw("Old: ",Z3674PrdFibMC);
               GXutil.writeLogRaw("Current: ",T00DS2_A3674PrdFibMC[0]);
            }
            if ( DecimalUtil.compareTo(Z3675PrdFibValK, T00DS2_A3675PrdFibValK[0]) != 0 )
            {
               GXutil.writeLogln("tconsfi:[seudo value changed for attri]"+"PrdFibValK");
               GXutil.writeLogRaw("Old: ",Z3675PrdFibValK);
               GXutil.writeLogRaw("Current: ",T00DS2_A3675PrdFibValK[0]);
            }
            if ( DecimalUtil.compareTo(Z3676PrdFibValM, T00DS2_A3676PrdFibValM[0]) != 0 )
            {
               GXutil.writeLogln("tconsfi:[seudo value changed for attri]"+"PrdFibValM");
               GXutil.writeLogRaw("Old: ",Z3676PrdFibValM);
               GXutil.writeLogRaw("Current: ",T00DS2_A3676PrdFibValM[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLCONSF"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertDS515( )
   {
      beforeValidateDS515( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableDS515( ) ;
      }
      if ( AnyError == 0 )
      {
         zmDS515( 0) ;
         checkOptimisticConcurrencyDS515( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmDS515( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertDS515( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00DS18 */
                  pr_default.execute(16, new Object[] {A719PrdNum, Short.valueOf(A681PrdAny), Short.valueOf(A3669PrdTipArt), Byte.valueOf(A3670PrdMes), Boolean.valueOf(n3671PrdFibKT), A3671PrdFibKT, Boolean.valueOf(n3672PrdFibMT), A3672PrdFibMT, Boolean.valueOf(n3673PrdFibKC), A3673PrdFibKC, Boolean.valueOf(n3674PrdFibMC), A3674PrdFibMC, Boolean.valueOf(n3675PrdFibValK), A3675PrdFibValK, Boolean.valueOf(n3676PrdFibValM), A3676PrdFibValM, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCONSF");
                  if ( (pr_default.getStatus(16) == 1) )
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
            loadDS515( ) ;
         }
         endLevelDS515( ) ;
      }
      closeExtendedTableCursorsDS515( ) ;
   }

   public void updateDS515( )
   {
      beforeValidateDS515( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableDS515( ) ;
      }
      if ( ( nIsMod_515 != 0 ) || ( nIsDirty_515 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyDS515( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmDS515( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateDS515( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00DS19 */
                     pr_default.execute(17, new Object[] {Boolean.valueOf(n3671PrdFibKT), A3671PrdFibKT, Boolean.valueOf(n3672PrdFibMT), A3672PrdFibMT, Boolean.valueOf(n3673PrdFibKC), A3673PrdFibKC, Boolean.valueOf(n3674PrdFibMC), A3674PrdFibMC, Boolean.valueOf(n3675PrdFibValK), A3675PrdFibValK, Boolean.valueOf(n3676PrdFibValM), A3676PrdFibValM, A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Short.valueOf(A3669PrdTipArt), Byte.valueOf(A3670PrdMes)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCONSF");
                     if ( (pr_default.getStatus(17) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLCONSF"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateDS515( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyDS515( ) ;
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
            endLevelDS515( ) ;
         }
      }
      closeExtendedTableCursorsDS515( ) ;
   }

   public void deferredUpdateDS515( )
   {
   }

   public void deleteDS515( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateDS515( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyDS515( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsDS515( ) ;
         afterConfirmDS515( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteDS515( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00DS20 */
               pr_default.execute(18, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Short.valueOf(A3669PrdTipArt), Byte.valueOf(A3670PrdMes)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCONSF");
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
      sMode515 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelDS515( ) ;
      Gx_mode = sMode515 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsDS515( )
   {
      standaloneModalDS515( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelDS515( )
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

   public void scanStartDS515( )
   {
      /* Scan By routine */
      /* Using cursor T00DS21 */
      pr_default.execute(19, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Short.valueOf(A3669PrdTipArt)});
      RcdFound515 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound515 = (short)(1) ;
         A3670PrdMes = T00DS21_A3670PrdMes[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextDS515( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound515 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound515 = (short)(1) ;
         A3670PrdMes = T00DS21_A3670PrdMes[0] ;
      }
   }

   public void scanEndDS515( )
   {
      pr_default.close(19);
   }

   public void afterConfirmDS515( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertDS515( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateDS515( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteDS515( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteDS515( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateDS515( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesDS515( )
   {
      edtPrdMes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdMes_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdFibKT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFibKT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFibKT_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdFibMT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFibMT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFibMT_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdFibKC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFibKC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFibKC_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdFibMC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFibMC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFibMC_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdFibValK_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFibValK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFibValK_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdFibValM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFibValM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFibValM_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void send_integrity_lvl_hashesDS515( )
   {
   }

   public void send_integrity_lvl_hashesDS514( )
   {
   }

   public void subsflControlProps_45515( )
   {
      edtavnRcdDeleted_515_Internalname = "vNRCDDELETED_515_"+sGXsfl_45_idx ;
      edtPrdMes_Internalname = "PRDMES_"+sGXsfl_45_idx ;
      edtPrdFibKT_Internalname = "PRDFIBKT_"+sGXsfl_45_idx ;
      edtPrdFibMT_Internalname = "PRDFIBMT_"+sGXsfl_45_idx ;
      edtPrdFibKC_Internalname = "PRDFIBKC_"+sGXsfl_45_idx ;
      edtPrdFibMC_Internalname = "PRDFIBMC_"+sGXsfl_45_idx ;
      edtPrdFibValK_Internalname = "PRDFIBVALK_"+sGXsfl_45_idx ;
      edtPrdFibValM_Internalname = "PRDFIBVALM_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_45515( )
   {
      edtavnRcdDeleted_515_Internalname = "vNRCDDELETED_515_"+sGXsfl_45_fel_idx ;
      edtPrdMes_Internalname = "PRDMES_"+sGXsfl_45_fel_idx ;
      edtPrdFibKT_Internalname = "PRDFIBKT_"+sGXsfl_45_fel_idx ;
      edtPrdFibMT_Internalname = "PRDFIBMT_"+sGXsfl_45_fel_idx ;
      edtPrdFibKC_Internalname = "PRDFIBKC_"+sGXsfl_45_fel_idx ;
      edtPrdFibMC_Internalname = "PRDFIBMC_"+sGXsfl_45_fel_idx ;
      edtPrdFibValK_Internalname = "PRDFIBVALK_"+sGXsfl_45_fel_idx ;
      edtPrdFibValM_Internalname = "PRDFIBVALM_"+sGXsfl_45_fel_idx ;
   }

   public void addRowDS515( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_45515( ) ;
      sendRowDS515( ) ;
   }

   public void sendRowDS515( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_515_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_515_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_515, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_515_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_515), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_515), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_515_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_515_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_515_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdMes_Internalname,GXutil.ltrim( localUtil.ntoc( A3670PrdMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3670PrdMes), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdMes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdMes_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_515_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdFibKT_Internalname,GXutil.ltrim( localUtil.ntoc( A3671PrdFibKT, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdFibKT_Enabled!=0) ? localUtil.format( A3671PrdFibKT, "ZZZZZZ9.9999") : localUtil.format( A3671PrdFibKT, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdFibKT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdFibKT_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_515_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdFibMT_Internalname,GXutil.ltrim( localUtil.ntoc( A3672PrdFibMT, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdFibMT_Enabled!=0) ? localUtil.format( A3672PrdFibMT, "ZZZZZZ9.9999") : localUtil.format( A3672PrdFibMT, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdFibMT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdFibMT_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_515_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdFibKC_Internalname,GXutil.ltrim( localUtil.ntoc( A3673PrdFibKC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdFibKC_Enabled!=0) ? localUtil.format( A3673PrdFibKC, "ZZZZZZ9.9999") : localUtil.format( A3673PrdFibKC, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdFibKC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdFibKC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_515_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdFibMC_Internalname,GXutil.ltrim( localUtil.ntoc( A3674PrdFibMC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdFibMC_Enabled!=0) ? localUtil.format( A3674PrdFibMC, "ZZZZZZ9.9999") : localUtil.format( A3674PrdFibMC, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdFibMC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdFibMC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_515_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdFibValK_Internalname,GXutil.ltrim( localUtil.ntoc( A3675PrdFibValK, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdFibValK_Enabled!=0) ? localUtil.format( A3675PrdFibValK, "ZZZZZZZZ9.99") : localUtil.format( A3675PrdFibValK, "ZZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdFibValK_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdFibValK_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_515_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdFibValM_Internalname,GXutil.ltrim( localUtil.ntoc( A3676PrdFibValM, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdFibValM_Enabled!=0) ? localUtil.format( A3676PrdFibValM, "ZZZZZZZZ9.99") : localUtil.format( A3676PrdFibValM, "ZZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdFibValM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdFibValM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesDS515( ) ;
      GXCCtl = "Z3670PrdMes_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3670PrdMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3671PrdFibKT_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3671PrdFibKT, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3672PrdFibMT_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3672PrdFibMT, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3673PrdFibKC_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3673PrdFibKC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3674PrdFibMC_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3674PrdFibMC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3675PrdFibValK_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3675PrdFibValK, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3676PrdFibValM_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3676PrdFibValM, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_515_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_515, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_515_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_515, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_515_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_515, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_515_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_515_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDMES_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdMes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFIBKT_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFibKT_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFIBMT_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFibMT_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFIBKC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFibKC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFIBMC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFibMC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFIBVALK_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFibValK_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFIBVALM_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFibValM_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowDS515( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_45515( ) ;
      edtavnRcdDeleted_515_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_515_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdMes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDMES_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdFibKT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDFIBKT_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdFibMT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDFIBMT_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdFibKC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDFIBKC_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdFibMC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDFIBMC_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdFibValK_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDFIBVALK_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdFibValM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDFIBVALM_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_515_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_515_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_515");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_515_Internalname ;
         wbErr = true ;
         nRcdDeleted_515 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_515 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_515_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "PRDMES_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdMes_Internalname ;
         wbErr = true ;
         A3670PrdMes = (byte)(0) ;
      }
      else
      {
         A3670PrdMes = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdFibKT_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdFibKT_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
      {
         GXCCtl = "PRDFIBKT_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdFibKT_Internalname ;
         wbErr = true ;
         A3671PrdFibKT = DecimalUtil.ZERO ;
         n3671PrdFibKT = false ;
      }
      else
      {
         A3671PrdFibKT = localUtil.ctond( httpContext.cgiGet( edtPrdFibKT_Internalname)) ;
         n3671PrdFibKT = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdFibMT_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdFibMT_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
      {
         GXCCtl = "PRDFIBMT_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdFibMT_Internalname ;
         wbErr = true ;
         A3672PrdFibMT = DecimalUtil.ZERO ;
         n3672PrdFibMT = false ;
      }
      else
      {
         A3672PrdFibMT = localUtil.ctond( httpContext.cgiGet( edtPrdFibMT_Internalname)) ;
         n3672PrdFibMT = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdFibKC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdFibKC_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
      {
         GXCCtl = "PRDFIBKC_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdFibKC_Internalname ;
         wbErr = true ;
         A3673PrdFibKC = DecimalUtil.ZERO ;
         n3673PrdFibKC = false ;
      }
      else
      {
         A3673PrdFibKC = localUtil.ctond( httpContext.cgiGet( edtPrdFibKC_Internalname)) ;
         n3673PrdFibKC = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdFibMC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdFibMC_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
      {
         GXCCtl = "PRDFIBMC_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdFibMC_Internalname ;
         wbErr = true ;
         A3674PrdFibMC = DecimalUtil.ZERO ;
         n3674PrdFibMC = false ;
      }
      else
      {
         A3674PrdFibMC = localUtil.ctond( httpContext.cgiGet( edtPrdFibMC_Internalname)) ;
         n3674PrdFibMC = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdFibValK_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdFibValK_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
      {
         GXCCtl = "PRDFIBVALK_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdFibValK_Internalname ;
         wbErr = true ;
         A3675PrdFibValK = DecimalUtil.ZERO ;
         n3675PrdFibValK = false ;
      }
      else
      {
         A3675PrdFibValK = localUtil.ctond( httpContext.cgiGet( edtPrdFibValK_Internalname)) ;
         n3675PrdFibValK = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdFibValM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdFibValM_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
      {
         GXCCtl = "PRDFIBVALM_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdFibValM_Internalname ;
         wbErr = true ;
         A3676PrdFibValM = DecimalUtil.ZERO ;
         n3676PrdFibValM = false ;
      }
      else
      {
         A3676PrdFibValM = localUtil.ctond( httpContext.cgiGet( edtPrdFibValM_Internalname)) ;
         n3676PrdFibValM = false ;
      }
      GXCCtl = "Z3670PrdMes_" + sGXsfl_45_idx ;
      Z3670PrdMes = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3671PrdFibKT_" + sGXsfl_45_idx ;
      Z3671PrdFibKT = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3672PrdFibMT_" + sGXsfl_45_idx ;
      Z3672PrdFibMT = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3673PrdFibKC_" + sGXsfl_45_idx ;
      Z3673PrdFibKC = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3674PrdFibMC_" + sGXsfl_45_idx ;
      Z3674PrdFibMC = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3675PrdFibValK_" + sGXsfl_45_idx ;
      Z3675PrdFibValK = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3676PrdFibValM_" + sGXsfl_45_idx ;
      Z3676PrdFibValM = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_515_" + sGXsfl_45_idx ;
      nRcdDeleted_515 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_515_" + sGXsfl_45_idx ;
      nRcdExists_515 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_515_" + sGXsfl_45_idx ;
      nIsMod_515 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPrdMes_Enabled = edtPrdMes_Enabled ;
   }

   public void confirmValuesDS0( )
   {
      nGXsfl_45_idx = 0 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_45515( ) ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_45515( ) ;
         httpContext.changePostValue( "Z3670PrdMes_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z3670PrdMes_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3670PrdMes_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z3671PrdFibKT_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z3671PrdFibKT_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3671PrdFibKT_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z3672PrdFibMT_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z3672PrdFibMT_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3672PrdFibMT_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z3673PrdFibKC_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z3673PrdFibKC_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3673PrdFibKC_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z3674PrdFibMC_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z3674PrdFibMC_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3674PrdFibMC_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z3675PrdFibValK_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z3675PrdFibValK_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3675PrdFibValK_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z3676PrdFibValM_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z3676PrdFibValM_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3676PrdFibValM_"+sGXsfl_45_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tconsfi", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z681PrdAny", GXutil.ltrim( localUtil.ntoc( Z681PrdAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3669PrdTipArt", GXutil.ltrim( localUtil.ntoc( Z3669PrdTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nGXsfl_45_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tconsfi", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TCONSFI" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CONSUMOS POR FIBRAS", "") ;
   }

   public void initializeNonKeyDS514( )
   {
   }

   public void initAllDS514( )
   {
      A719PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A681PrdAny = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A681PrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A681PrdAny), 4, 0));
      A3669PrdTipArt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3669PrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3669PrdTipArt), 4, 0));
      initializeNonKeyDS514( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyDS515( )
   {
      A3671PrdFibKT = DecimalUtil.ZERO ;
      n3671PrdFibKT = false ;
      A3672PrdFibMT = DecimalUtil.ZERO ;
      n3672PrdFibMT = false ;
      A3673PrdFibKC = DecimalUtil.ZERO ;
      n3673PrdFibKC = false ;
      A3674PrdFibMC = DecimalUtil.ZERO ;
      n3674PrdFibMC = false ;
      A3675PrdFibValK = DecimalUtil.ZERO ;
      n3675PrdFibValK = false ;
      A3676PrdFibValM = DecimalUtil.ZERO ;
      n3676PrdFibValM = false ;
      Z3671PrdFibKT = DecimalUtil.ZERO ;
      Z3672PrdFibMT = DecimalUtil.ZERO ;
      Z3673PrdFibKC = DecimalUtil.ZERO ;
      Z3674PrdFibMC = DecimalUtil.ZERO ;
      Z3675PrdFibValK = DecimalUtil.ZERO ;
      Z3676PrdFibValM = DecimalUtil.ZERO ;
   }

   public void initAllDS515( )
   {
      A3670PrdMes = (byte)(0) ;
      initializeNonKeyDS515( ) ;
   }

   public void standaloneModalInsertDS515( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241514089", true, true);
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
      httpContext.AddJavascriptSource("tconsfi.js", "?20268241514089", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties515( )
   {
      edtPrdMes_Enabled = defedtPrdMes_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdMes_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_515, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_515_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3670PrdMes, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdMes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3671PrdFibKT, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFibKT_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3672PrdFibMT, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFibMT_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3673PrdFibKC, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFibKC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3674PrdFibMC, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFibMC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3675PrdFibValK, (byte)(12), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFibValK_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3676PrdFibValM, (byte)(12), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFibValM_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtPrdNum_Internalname = "PRDNUM" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtPrdAny_Internalname = "PRDANY" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtPrdTipArt_Internalname = "PRDTIPART" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtavnRcdDeleted_515_Internalname = "vNRCDDELETED_515" ;
      edtPrdMes_Internalname = "PRDMES" ;
      edtPrdFibKT_Internalname = "PRDFIBKT" ;
      edtPrdFibMT_Internalname = "PRDFIBMT" ;
      edtPrdFibKC_Internalname = "PRDFIBKC" ;
      edtPrdFibMC_Internalname = "PRDFIBMC" ;
      edtPrdFibValK_Internalname = "PRDFIBVALK" ;
      edtPrdFibValM_Internalname = "PRDFIBVALM" ;
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
      Form.setCaption( httpContext.getMessage( "CONSUMOS POR FIBRAS", "") );
      edtPrdFibValM_Jsonclick = "" ;
      edtPrdFibValK_Jsonclick = "" ;
      edtPrdFibMC_Jsonclick = "" ;
      edtPrdFibKC_Jsonclick = "" ;
      edtPrdFibMT_Jsonclick = "" ;
      edtPrdFibKT_Jsonclick = "" ;
      edtPrdMes_Jsonclick = "" ;
      edtavnRcdDeleted_515_Jsonclick = "" ;
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
      edtPrdFibValM_Enabled = 1 ;
      edtPrdFibValK_Enabled = 1 ;
      edtPrdFibMC_Enabled = 1 ;
      edtPrdFibKC_Enabled = 1 ;
      edtPrdFibMT_Enabled = 1 ;
      edtPrdFibKT_Enabled = 1 ;
      edtPrdMes_Enabled = 1 ;
      edtavnRcdDeleted_515_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPrdTipArt_Jsonclick = "" ;
      edtPrdTipArt_Backcolor = (int)(0xFFFFFF) ;
      edtPrdTipArt_Enabled = 1 ;
      edtPrdAny_Jsonclick = "" ;
      edtPrdAny_Backcolor = (int)(0xFFFFFF) ;
      edtPrdAny_Enabled = 1 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Backcolor = (int)(0xFFFFFF) ;
      edtPrdNum_Enabled = 1 ;
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
      subsflControlProps_45515( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalDS515( ) ;
         standaloneModalDS515( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowDS515( ) ;
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_45515( ) ;
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
      /* Using cursor T00DS22 */
      pr_default.execute(20, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00DS22_A407EmprNom[0] ;
      n407EmprNom = T00DS22_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(20);
      /* Using cursor T00DS23 */
      pr_default.execute(21, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPRDES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDANY");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
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

   public void valid_Prdany( )
   {
      /* Using cursor T00DS23 */
      pr_default.execute(21, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPRDES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDANY");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Prdtipart( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z681PrdAny", GXutil.ltrim( localUtil.ntoc( Z681PrdAny, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3669PrdTipArt", GXutil.ltrim( localUtil.ntoc( Z3669PrdTipArt, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_PRDANY","{handler:'valid_Prdany',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A681PrdAny',fld:'PRDANY',pic:'ZZZ9'}]");
      setEventMetadata("VALID_PRDANY",",oparms:[]}");
      setEventMetadata("VALID_PRDTIPART","{handler:'valid_Prdtipart',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A681PrdAny',fld:'PRDANY',pic:'ZZZ9'},{av:'A3669PrdTipArt',fld:'PRDTIPART',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PRDTIPART",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z719PrdNum'},{av:'Z681PrdAny'},{av:'Z3669PrdTipArt'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_PRDMES","{handler:'valid_Prdmes',iparms:[]");
      setEventMetadata("VALID_PRDMES",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Prdfibvalm',iparms:[]");
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
      pr_default.close(20);
      pr_default.close(21);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z3671PrdFibKT = DecimalUtil.ZERO ;
      Z3672PrdFibMT = DecimalUtil.ZERO ;
      Z3673PrdFibKC = DecimalUtil.ZERO ;
      Z3674PrdFibMC = DecimalUtil.ZERO ;
      Z3675PrdFibValK = DecimalUtil.ZERO ;
      Z3676PrdFibValM = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode515 = "" ;
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
      sMode514 = "" ;
      GXCCtl = "" ;
      A3671PrdFibKT = DecimalUtil.ZERO ;
      A3672PrdFibMT = DecimalUtil.ZERO ;
      A3673PrdFibKC = DecimalUtil.ZERO ;
      A3674PrdFibMC = DecimalUtil.ZERO ;
      A3675PrdFibValK = DecimalUtil.ZERO ;
      A3676PrdFibValM = DecimalUtil.ZERO ;
      AV18Station = "" ;
      GXv_char1 = new String[1] ;
      AV16EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV17UsurCod = "" ;
      AV20LitFe = "" ;
      AV19Lit0 = "" ;
      GXt_char4 = "" ;
      GXv_char3 = new String[1] ;
      Z407EmprNom = "" ;
      T00DS6_A407EmprNom = new String[] {""} ;
      T00DS6_n407EmprNom = new boolean[] {false} ;
      T00DS8_A3669PrdTipArt = new short[1] ;
      T00DS8_A407EmprNom = new String[] {""} ;
      T00DS8_n407EmprNom = new boolean[] {false} ;
      T00DS8_A396EmprCod = new String[] {""} ;
      T00DS8_A719PrdNum = new String[] {""} ;
      T00DS8_A681PrdAny = new short[1] ;
      T00DS7_A396EmprCod = new String[] {""} ;
      T00DS9_A396EmprCod = new String[] {""} ;
      T00DS10_A396EmprCod = new String[] {""} ;
      T00DS10_A719PrdNum = new String[] {""} ;
      T00DS10_A681PrdAny = new short[1] ;
      T00DS10_A3669PrdTipArt = new short[1] ;
      T00DS5_A3669PrdTipArt = new short[1] ;
      T00DS5_A396EmprCod = new String[] {""} ;
      T00DS5_A719PrdNum = new String[] {""} ;
      T00DS5_A681PrdAny = new short[1] ;
      T00DS11_A396EmprCod = new String[] {""} ;
      T00DS11_A719PrdNum = new String[] {""} ;
      T00DS11_A681PrdAny = new short[1] ;
      T00DS11_A3669PrdTipArt = new short[1] ;
      T00DS12_A396EmprCod = new String[] {""} ;
      T00DS12_A719PrdNum = new String[] {""} ;
      T00DS12_A681PrdAny = new short[1] ;
      T00DS12_A3669PrdTipArt = new short[1] ;
      T00DS4_A3669PrdTipArt = new short[1] ;
      T00DS4_A396EmprCod = new String[] {""} ;
      T00DS4_A719PrdNum = new String[] {""} ;
      T00DS4_A681PrdAny = new short[1] ;
      T00DS15_A396EmprCod = new String[] {""} ;
      T00DS15_A719PrdNum = new String[] {""} ;
      T00DS15_A681PrdAny = new short[1] ;
      T00DS15_A3669PrdTipArt = new short[1] ;
      T00DS16_A719PrdNum = new String[] {""} ;
      T00DS16_A681PrdAny = new short[1] ;
      T00DS16_A3669PrdTipArt = new short[1] ;
      T00DS16_A3670PrdMes = new byte[1] ;
      T00DS16_A3671PrdFibKT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DS16_n3671PrdFibKT = new boolean[] {false} ;
      T00DS16_A3672PrdFibMT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DS16_n3672PrdFibMT = new boolean[] {false} ;
      T00DS16_A3673PrdFibKC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DS16_n3673PrdFibKC = new boolean[] {false} ;
      T00DS16_A3674PrdFibMC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DS16_n3674PrdFibMC = new boolean[] {false} ;
      T00DS16_A3675PrdFibValK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DS16_n3675PrdFibValK = new boolean[] {false} ;
      T00DS16_A3676PrdFibValM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DS16_n3676PrdFibValM = new boolean[] {false} ;
      T00DS16_A396EmprCod = new String[] {""} ;
      T00DS17_A396EmprCod = new String[] {""} ;
      T00DS17_A719PrdNum = new String[] {""} ;
      T00DS17_A681PrdAny = new short[1] ;
      T00DS17_A3669PrdTipArt = new short[1] ;
      T00DS17_A3670PrdMes = new byte[1] ;
      T00DS3_A719PrdNum = new String[] {""} ;
      T00DS3_A681PrdAny = new short[1] ;
      T00DS3_A3669PrdTipArt = new short[1] ;
      T00DS3_A3670PrdMes = new byte[1] ;
      T00DS3_A3671PrdFibKT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DS3_n3671PrdFibKT = new boolean[] {false} ;
      T00DS3_A3672PrdFibMT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DS3_n3672PrdFibMT = new boolean[] {false} ;
      T00DS3_A3673PrdFibKC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DS3_n3673PrdFibKC = new boolean[] {false} ;
      T00DS3_A3674PrdFibMC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DS3_n3674PrdFibMC = new boolean[] {false} ;
      T00DS3_A3675PrdFibValK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DS3_n3675PrdFibValK = new boolean[] {false} ;
      T00DS3_A3676PrdFibValM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DS3_n3676PrdFibValM = new boolean[] {false} ;
      T00DS3_A396EmprCod = new String[] {""} ;
      T00DS2_A719PrdNum = new String[] {""} ;
      T00DS2_A681PrdAny = new short[1] ;
      T00DS2_A3669PrdTipArt = new short[1] ;
      T00DS2_A3670PrdMes = new byte[1] ;
      T00DS2_A3671PrdFibKT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DS2_n3671PrdFibKT = new boolean[] {false} ;
      T00DS2_A3672PrdFibMT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DS2_n3672PrdFibMT = new boolean[] {false} ;
      T00DS2_A3673PrdFibKC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DS2_n3673PrdFibKC = new boolean[] {false} ;
      T00DS2_A3674PrdFibMC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DS2_n3674PrdFibMC = new boolean[] {false} ;
      T00DS2_A3675PrdFibValK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DS2_n3675PrdFibValK = new boolean[] {false} ;
      T00DS2_A3676PrdFibValM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DS2_n3676PrdFibValM = new boolean[] {false} ;
      T00DS2_A396EmprCod = new String[] {""} ;
      T00DS21_A396EmprCod = new String[] {""} ;
      T00DS21_A719PrdNum = new String[] {""} ;
      T00DS21_A681PrdAny = new short[1] ;
      T00DS21_A3669PrdTipArt = new short[1] ;
      T00DS21_A3670PrdMes = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00DS22_A407EmprNom = new String[] {""} ;
      T00DS22_n407EmprNom = new boolean[] {false} ;
      T00DS23_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ719PrdNum = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tconsfi__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tconsfi__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tconsfi__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tconsfi__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tconsfi__default(),
         new Object[] {
             new Object[] {
            T00DS2_A719PrdNum, T00DS2_A681PrdAny, T00DS2_A3669PrdTipArt, T00DS2_A3670PrdMes, T00DS2_A3671PrdFibKT, T00DS2_n3671PrdFibKT, T00DS2_A3672PrdFibMT, T00DS2_n3672PrdFibMT, T00DS2_A3673PrdFibKC, T00DS2_n3673PrdFibKC,
            T00DS2_A3674PrdFibMC, T00DS2_n3674PrdFibMC, T00DS2_A3675PrdFibValK, T00DS2_n3675PrdFibValK, T00DS2_A3676PrdFibValM, T00DS2_n3676PrdFibValM, T00DS2_A396EmprCod
            }
            , new Object[] {
            T00DS3_A719PrdNum, T00DS3_A681PrdAny, T00DS3_A3669PrdTipArt, T00DS3_A3670PrdMes, T00DS3_A3671PrdFibKT, T00DS3_n3671PrdFibKT, T00DS3_A3672PrdFibMT, T00DS3_n3672PrdFibMT, T00DS3_A3673PrdFibKC, T00DS3_n3673PrdFibKC,
            T00DS3_A3674PrdFibMC, T00DS3_n3674PrdFibMC, T00DS3_A3675PrdFibValK, T00DS3_n3675PrdFibValK, T00DS3_A3676PrdFibValM, T00DS3_n3676PrdFibValM, T00DS3_A396EmprCod
            }
            , new Object[] {
            T00DS4_A3669PrdTipArt, T00DS4_A396EmprCod, T00DS4_A719PrdNum, T00DS4_A681PrdAny
            }
            , new Object[] {
            T00DS5_A3669PrdTipArt, T00DS5_A396EmprCod, T00DS5_A719PrdNum, T00DS5_A681PrdAny
            }
            , new Object[] {
            T00DS6_A407EmprNom, T00DS6_n407EmprNom
            }
            , new Object[] {
            T00DS7_A396EmprCod
            }
            , new Object[] {
            T00DS8_A3669PrdTipArt, T00DS8_A407EmprNom, T00DS8_n407EmprNom, T00DS8_A396EmprCod, T00DS8_A719PrdNum, T00DS8_A681PrdAny
            }
            , new Object[] {
            T00DS9_A396EmprCod
            }
            , new Object[] {
            T00DS10_A396EmprCod, T00DS10_A719PrdNum, T00DS10_A681PrdAny, T00DS10_A3669PrdTipArt
            }
            , new Object[] {
            T00DS11_A396EmprCod, T00DS11_A719PrdNum, T00DS11_A681PrdAny, T00DS11_A3669PrdTipArt
            }
            , new Object[] {
            T00DS12_A396EmprCod, T00DS12_A719PrdNum, T00DS12_A681PrdAny, T00DS12_A3669PrdTipArt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00DS15_A396EmprCod, T00DS15_A719PrdNum, T00DS15_A681PrdAny, T00DS15_A3669PrdTipArt
            }
            , new Object[] {
            T00DS16_A719PrdNum, T00DS16_A681PrdAny, T00DS16_A3669PrdTipArt, T00DS16_A3670PrdMes, T00DS16_A3671PrdFibKT, T00DS16_n3671PrdFibKT, T00DS16_A3672PrdFibMT, T00DS16_n3672PrdFibMT, T00DS16_A3673PrdFibKC, T00DS16_n3673PrdFibKC,
            T00DS16_A3674PrdFibMC, T00DS16_n3674PrdFibMC, T00DS16_A3675PrdFibValK, T00DS16_n3675PrdFibValK, T00DS16_A3676PrdFibValM, T00DS16_n3676PrdFibValM, T00DS16_A396EmprCod
            }
            , new Object[] {
            T00DS17_A396EmprCod, T00DS17_A719PrdNum, T00DS17_A681PrdAny, T00DS17_A3669PrdTipArt, T00DS17_A3670PrdMes
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00DS21_A396EmprCod, T00DS21_A719PrdNum, T00DS21_A681PrdAny, T00DS21_A3669PrdTipArt, T00DS21_A3670PrdMes
            }
            , new Object[] {
            T00DS22_A407EmprNom, T00DS22_n407EmprNom
            }
            , new Object[] {
            T00DS23_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z3670PrdMes ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A3670PrdMes ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z681PrdAny ;
   private short Z3669PrdTipArt ;
   private short nRcdDeleted_515 ;
   private short nRcdExists_515 ;
   private short nIsMod_515 ;
   private short A681PrdAny ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A3669PrdTipArt ;
   private short nBlankRcdCount515 ;
   private short RcdFound515 ;
   private short nBlankRcdUsr515 ;
   private short RcdFound514 ;
   private short nIsDirty_514 ;
   private short nIsDirty_515 ;
   private short ZZ681PrdAny ;
   private short ZZ3669PrdTipArt ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdAny_Enabled ;
   private int edtPrdTipArt_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtavnRcdDeleted_515_Enabled ;
   private int edtPrdMes_Enabled ;
   private int edtPrdFibKT_Enabled ;
   private int edtPrdFibMT_Enabled ;
   private int edtPrdFibKC_Enabled ;
   private int edtPrdFibMC_Enabled ;
   private int edtPrdFibValK_Enabled ;
   private int edtPrdFibValM_Enabled ;
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
   private int defedtPrdMes_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtPrdTipArt_Backcolor ;
   private int edtPrdAny_Backcolor ;
   private int edtPrdNum_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z3671PrdFibKT ;
   private java.math.BigDecimal Z3672PrdFibMT ;
   private java.math.BigDecimal Z3673PrdFibKC ;
   private java.math.BigDecimal Z3674PrdFibMC ;
   private java.math.BigDecimal Z3675PrdFibValK ;
   private java.math.BigDecimal Z3676PrdFibValM ;
   private java.math.BigDecimal A3671PrdFibKT ;
   private java.math.BigDecimal A3672PrdFibMT ;
   private java.math.BigDecimal A3673PrdFibKC ;
   private java.math.BigDecimal A3674PrdFibMC ;
   private java.math.BigDecimal A3675PrdFibValK ;
   private java.math.BigDecimal A3676PrdFibValM ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPrdNum_Internalname ;
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
   private String edtPrdNum_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtPrdAny_Internalname ;
   private String edtPrdAny_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtPrdTipArt_Internalname ;
   private String edtPrdTipArt_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode515 ;
   private String edtavnRcdDeleted_515_Internalname ;
   private String edtPrdMes_Internalname ;
   private String edtPrdFibKT_Internalname ;
   private String edtPrdFibMT_Internalname ;
   private String edtPrdFibKC_Internalname ;
   private String edtPrdFibMC_Internalname ;
   private String edtPrdFibValK_Internalname ;
   private String edtPrdFibValM_Internalname ;
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
   private String sMode514 ;
   private String GXCCtl ;
   private String AV18Station ;
   private String GXv_char1[] ;
   private String AV16EmprNom ;
   private String GXv_char2[] ;
   private String AV17UsurCod ;
   private String AV20LitFe ;
   private String AV19Lit0 ;
   private String GXt_char4 ;
   private String GXv_char3[] ;
   private String Z407EmprNom ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_515_Jsonclick ;
   private String edtPrdMes_Jsonclick ;
   private String edtPrdFibKT_Jsonclick ;
   private String edtPrdFibMT_Jsonclick ;
   private String edtPrdFibKC_Jsonclick ;
   private String edtPrdFibMC_Jsonclick ;
   private String edtPrdFibValK_Jsonclick ;
   private String edtPrdFibValM_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ719PrdNum ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n3671PrdFibKT ;
   private boolean n3672PrdFibMT ;
   private boolean n3673PrdFibKC ;
   private boolean n3674PrdFibMC ;
   private boolean n3675PrdFibValK ;
   private boolean n3676PrdFibValM ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00DS6_A407EmprNom ;
   private boolean[] T00DS6_n407EmprNom ;
   private short[] T00DS8_A3669PrdTipArt ;
   private String[] T00DS8_A407EmprNom ;
   private boolean[] T00DS8_n407EmprNom ;
   private String[] T00DS8_A396EmprCod ;
   private String[] T00DS8_A719PrdNum ;
   private short[] T00DS8_A681PrdAny ;
   private String[] T00DS7_A396EmprCod ;
   private String[] T00DS9_A396EmprCod ;
   private String[] T00DS10_A396EmprCod ;
   private String[] T00DS10_A719PrdNum ;
   private short[] T00DS10_A681PrdAny ;
   private short[] T00DS10_A3669PrdTipArt ;
   private short[] T00DS5_A3669PrdTipArt ;
   private String[] T00DS5_A396EmprCod ;
   private String[] T00DS5_A719PrdNum ;
   private short[] T00DS5_A681PrdAny ;
   private String[] T00DS11_A396EmprCod ;
   private String[] T00DS11_A719PrdNum ;
   private short[] T00DS11_A681PrdAny ;
   private short[] T00DS11_A3669PrdTipArt ;
   private String[] T00DS12_A396EmprCod ;
   private String[] T00DS12_A719PrdNum ;
   private short[] T00DS12_A681PrdAny ;
   private short[] T00DS12_A3669PrdTipArt ;
   private short[] T00DS4_A3669PrdTipArt ;
   private String[] T00DS4_A396EmprCod ;
   private String[] T00DS4_A719PrdNum ;
   private short[] T00DS4_A681PrdAny ;
   private String[] T00DS15_A396EmprCod ;
   private String[] T00DS15_A719PrdNum ;
   private short[] T00DS15_A681PrdAny ;
   private short[] T00DS15_A3669PrdTipArt ;
   private String[] T00DS16_A719PrdNum ;
   private short[] T00DS16_A681PrdAny ;
   private short[] T00DS16_A3669PrdTipArt ;
   private byte[] T00DS16_A3670PrdMes ;
   private java.math.BigDecimal[] T00DS16_A3671PrdFibKT ;
   private boolean[] T00DS16_n3671PrdFibKT ;
   private java.math.BigDecimal[] T00DS16_A3672PrdFibMT ;
   private boolean[] T00DS16_n3672PrdFibMT ;
   private java.math.BigDecimal[] T00DS16_A3673PrdFibKC ;
   private boolean[] T00DS16_n3673PrdFibKC ;
   private java.math.BigDecimal[] T00DS16_A3674PrdFibMC ;
   private boolean[] T00DS16_n3674PrdFibMC ;
   private java.math.BigDecimal[] T00DS16_A3675PrdFibValK ;
   private boolean[] T00DS16_n3675PrdFibValK ;
   private java.math.BigDecimal[] T00DS16_A3676PrdFibValM ;
   private boolean[] T00DS16_n3676PrdFibValM ;
   private String[] T00DS16_A396EmprCod ;
   private String[] T00DS17_A396EmprCod ;
   private String[] T00DS17_A719PrdNum ;
   private short[] T00DS17_A681PrdAny ;
   private short[] T00DS17_A3669PrdTipArt ;
   private byte[] T00DS17_A3670PrdMes ;
   private String[] T00DS3_A719PrdNum ;
   private short[] T00DS3_A681PrdAny ;
   private short[] T00DS3_A3669PrdTipArt ;
   private byte[] T00DS3_A3670PrdMes ;
   private java.math.BigDecimal[] T00DS3_A3671PrdFibKT ;
   private boolean[] T00DS3_n3671PrdFibKT ;
   private java.math.BigDecimal[] T00DS3_A3672PrdFibMT ;
   private boolean[] T00DS3_n3672PrdFibMT ;
   private java.math.BigDecimal[] T00DS3_A3673PrdFibKC ;
   private boolean[] T00DS3_n3673PrdFibKC ;
   private java.math.BigDecimal[] T00DS3_A3674PrdFibMC ;
   private boolean[] T00DS3_n3674PrdFibMC ;
   private java.math.BigDecimal[] T00DS3_A3675PrdFibValK ;
   private boolean[] T00DS3_n3675PrdFibValK ;
   private java.math.BigDecimal[] T00DS3_A3676PrdFibValM ;
   private boolean[] T00DS3_n3676PrdFibValM ;
   private String[] T00DS3_A396EmprCod ;
   private String[] T00DS2_A719PrdNum ;
   private short[] T00DS2_A681PrdAny ;
   private short[] T00DS2_A3669PrdTipArt ;
   private byte[] T00DS2_A3670PrdMes ;
   private java.math.BigDecimal[] T00DS2_A3671PrdFibKT ;
   private boolean[] T00DS2_n3671PrdFibKT ;
   private java.math.BigDecimal[] T00DS2_A3672PrdFibMT ;
   private boolean[] T00DS2_n3672PrdFibMT ;
   private java.math.BigDecimal[] T00DS2_A3673PrdFibKC ;
   private boolean[] T00DS2_n3673PrdFibKC ;
   private java.math.BigDecimal[] T00DS2_A3674PrdFibMC ;
   private boolean[] T00DS2_n3674PrdFibMC ;
   private java.math.BigDecimal[] T00DS2_A3675PrdFibValK ;
   private boolean[] T00DS2_n3675PrdFibValK ;
   private java.math.BigDecimal[] T00DS2_A3676PrdFibValM ;
   private boolean[] T00DS2_n3676PrdFibValM ;
   private String[] T00DS2_A396EmprCod ;
   private String[] T00DS21_A396EmprCod ;
   private String[] T00DS21_A719PrdNum ;
   private short[] T00DS21_A681PrdAny ;
   private short[] T00DS21_A3669PrdTipArt ;
   private byte[] T00DS21_A3670PrdMes ;
   private String[] T00DS22_A407EmprNom ;
   private boolean[] T00DS22_n407EmprNom ;
   private String[] T00DS23_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tconsfi__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tconsfi__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tconsfi__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tconsfi__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tconsfi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00DS2", "SELECT PrdNum, PrdAny, PrdTipArt, PrdMes, PrdFibKT, PrdFibMT, PrdFibKC, PrdFibMC, PrdFibValK, PrdFibValM, EmprCod FROM TXPLCONSF WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? AND PrdTipArt = ? AND PrdMes = ?  FOR UPDATE OF PrdFibKT, PrdFibMT, PrdFibKC, PrdFibMC, PrdFibValK, PrdFibValM NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DS3", "SELECT PrdNum, PrdAny, PrdTipArt, PrdMes, PrdFibKT, PrdFibMT, PrdFibKC, PrdFibMC, PrdFibValK, PrdFibValM, EmprCod FROM TXPLCONSF WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? AND PrdTipArt = ? AND PrdMes = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DS4", "SELECT PrdTipArt, EmprCod, PrdNum, PrdAny FROM TXPCONSFI WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? AND PrdTipArt = ?  FOR UPDATE OF PrdTipArt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DS5", "SELECT PrdTipArt, EmprCod, PrdNum, PrdAny FROM TXPCONSFI WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? AND PrdTipArt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DS6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DS7", "SELECT EmprCod FROM TXPCPRDES WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DS8", "SELECT /*+ FIRST_ROWS(100) */ TM1.PrdTipArt, T2.EmprNom, TM1.EmprCod, TM1.PrdNum, TM1.PrdAny FROM (TXPCONSFI TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? and TM1.PrdAny = ? and TM1.PrdTipArt = ? ORDER BY TM1.EmprCod, TM1.PrdNum, TM1.PrdAny, TM1.PrdTipArt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DS9", "SELECT EmprCod FROM TXPCPRDES WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DS10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, PrdAny, PrdTipArt FROM TXPCONSFI WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? AND PrdTipArt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DS11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, PrdAny, PrdTipArt FROM TXPCONSFI WHERE ( PrdNum > ? or PrdNum = ? and PrdAny > ? or PrdAny = ? and PrdNum = ? and PrdTipArt > ?) and EmprCod = ? ORDER BY EmprCod, PrdNum, PrdAny, PrdTipArt) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00DS12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, PrdAny, PrdTipArt FROM TXPCONSFI WHERE ( PrdNum < ? or PrdNum = ? and PrdAny < ? or PrdAny = ? and PrdNum = ? and PrdTipArt < ?) and EmprCod = ? ORDER BY EmprCod DESC, PrdNum DESC, PrdAny DESC, PrdTipArt DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00DS13", "INSERT INTO TXPCONSFI(PrdTipArt, EmprCod, PrdNum, PrdAny) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPCONSFI")
         ,new UpdateCursor("T00DS14", "DELETE FROM TXPCONSFI  WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? AND PrdTipArt = ?", GX_NOMASK, "TXPCONSFI")
         ,new ForEachCursor("T00DS15", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum, PrdAny, PrdTipArt FROM TXPCONSFI WHERE EmprCod = ? ORDER BY EmprCod, PrdNum, PrdAny, PrdTipArt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DS16", "SELECT PrdNum, PrdAny, PrdTipArt, PrdMes, PrdFibKT, PrdFibMT, PrdFibKC, PrdFibMC, PrdFibValK, PrdFibValM, EmprCod FROM TXPLCONSF WHERE EmprCod = ? and PrdNum = ? and PrdAny = ? and PrdTipArt = ? and PrdMes = ? ORDER BY EmprCod, PrdNum, PrdAny, PrdTipArt, PrdMes ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DS17", "SELECT EmprCod, PrdNum, PrdAny, PrdTipArt, PrdMes FROM TXPLCONSF WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? AND PrdTipArt = ? AND PrdMes = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00DS18", "INSERT INTO TXPLCONSF(PrdNum, PrdAny, PrdTipArt, PrdMes, PrdFibKT, PrdFibMT, PrdFibKC, PrdFibMC, PrdFibValK, PrdFibValM, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLCONSF")
         ,new UpdateCursor("T00DS19", "UPDATE TXPLCONSF SET PrdFibKT=?, PrdFibMT=?, PrdFibKC=?, PrdFibMC=?, PrdFibValK=?, PrdFibValM=?  WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? AND PrdTipArt = ? AND PrdMes = ?", GX_NOMASK, "TXPLCONSF")
         ,new UpdateCursor("T00DS20", "DELETE FROM TXPLCONSF  WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? AND PrdTipArt = ? AND PrdMes = ?", GX_NOMASK, "TXPLCONSF")
         ,new ForEachCursor("T00DS21", "SELECT EmprCod, PrdNum, PrdAny, PrdTipArt, PrdMes FROM TXPLCONSF WHERE EmprCod = ? and PrdNum = ? and PrdAny = ? and PrdTipArt = ? ORDER BY EmprCod, PrdNum, PrdAny, PrdTipArt, PrdMes ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DS22", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DS23", "SELECT EmprCod FROM TXPCPRDES WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,4);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,4);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,4);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 4);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 4);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 4);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[11], 4);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[15], 2);
               }
               stmt.setString(11, (String)parms[16], 3);
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 4);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 4);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 4);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 4);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setString(8, (String)parms[13], 6);
               stmt.setShort(9, ((Number) parms[14]).shortValue());
               stmt.setShort(10, ((Number) parms[15]).shortValue());
               stmt.setByte(11, ((Number) parms[16]).byteValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

