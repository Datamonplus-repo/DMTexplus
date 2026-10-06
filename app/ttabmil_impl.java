package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttabmil_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TABLA MILITAR", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmprNom_Internalname ;
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
      nRC_GXsfl_35 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_35"))) ;
      nGXsfl_35_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_35_idx"))) ;
      sGXsfl_35_idx = httpContext.GetPar( "sGXsfl_35_idx") ;
      A7231Auc_ULin = (short)(GXutil.lval( httpContext.GetPar( "Auc_ULin"))) ;
      n7231Auc_ULin = false ;
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

   public ttabmil_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttabmil_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttabmil_impl.class ));
   }

   public ttabmil_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTABMIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTABMIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTABMIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTABMIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTABMIL.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTABMIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTABMIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTABMIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTABMIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTABMIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Ultimo numero de linea", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTABMIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAuc_ULin_Internalname, GXutil.ltrim( localUtil.ntoc( A7231Auc_ULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAuc_ULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7231Auc_ULin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7231Auc_ULin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAuc_ULin_Jsonclick, 0, "", "", "", "", "", 1, edtAuc_ULin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTABMIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol35( ) ;
      nGXsfl_35_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1026 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1026 = (short)(1) ;
            scanStartYK1026( ) ;
            while ( RcdFound1026 != 0 )
            {
               init_level_properties1026( ) ;
               getByPrimaryKeyYK1026( ) ;
               addRowYK1026( ) ;
               scanNextYK1026( ) ;
            }
            scanEndYK1026( ) ;
            nBlankRcdCount1026 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B7231Auc_ULin = A7231Auc_ULin ;
         n7231Auc_ULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
         standaloneNotModalYK1026( ) ;
         standaloneModalYK1026( ) ;
         sMode1026 = Gx_mode ;
         while ( nGXsfl_35_idx < nRC_GXsfl_35 )
         {
            bGXsfl_35_Refreshing = true ;
            readRowYK1026( ) ;
            edtavnRcdDeleted_1026_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1026_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1026_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1026_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAuc_Lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AUC_LIN_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAuc_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAuc_Lin_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAuc_VI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AUC_VI_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAuc_VI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAuc_VI_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAuc_VF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AUC_VF_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAuc_VF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAuc_VF_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAuc_Ui_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AUC_UI_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAuc_Ui_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAuc_Ui_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAuc_Na_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AUC_NA_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAuc_Na_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAuc_Na_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAuc_Nr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AUC_NR_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAuc_Nr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAuc_Nr_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            if ( ( nRcdExists_1026 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalYK1026( ) ;
            }
            sendRowYK1026( ) ;
            bGXsfl_35_Refreshing = false ;
         }
         Gx_mode = sMode1026 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A7231Auc_ULin = B7231Auc_ULin ;
         n7231Auc_ULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1026 = (short)(5) ;
         nRcdExists_1026 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartYK1026( ) ;
            while ( RcdFound1026 != 0 )
            {
               sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_351026( ) ;
               init_level_properties1026( ) ;
               standaloneNotModalYK1026( ) ;
               getByPrimaryKeyYK1026( ) ;
               standaloneModalYK1026( ) ;
               addRowYK1026( ) ;
               scanNextYK1026( ) ;
            }
            scanEndYK1026( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1026 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_351026( ) ;
      initAllYK1026( ) ;
      init_level_properties1026( ) ;
      B7231Auc_ULin = A7231Auc_ULin ;
      n7231Auc_ULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
      nRcdExists_1026 = (short)(0) ;
      nIsMod_1026 = (short)(0) ;
      nRcdDeleted_1026 = (short)(0) ;
      nBlankRcdCount1026 = (short)(nBlankRcdUsr1026+nBlankRcdCount1026) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1026 > 0 )
      {
         standaloneNotModalYK1026( ) ;
         standaloneModalYK1026( ) ;
         addRowYK1026( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtAuc_Lin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1026 = (short)(nBlankRcdCount1026-1) ;
      }
      Gx_mode = sMode1026 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A7231Auc_ULin = B7231Auc_ULin ;
      n7231Auc_ULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTABMIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTABMIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTABMIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTABMIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTABMIL.htm");
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
      e11YK2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z407EmprNom = httpContext.cgiGet( "Z407EmprNom") ;
            Z7231Auc_ULin = (short)(localUtil.ctol( httpContext.cgiGet( "Z7231Auc_ULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O7231Auc_ULin = (short)(localUtil.ctol( httpContext.cgiGet( "O7231Auc_ULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_35 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_35"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A7231Auc_ULin = (short)(localUtil.ctol( httpContext.cgiGet( edtAuc_ULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7231Auc_ULin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
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
                        e11YK2 ();
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
            initAllYK27( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1026_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1026_Enabled), 5, 0), !bGXsfl_35_Refreshing);
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
      disableAttributesYK27( ) ;
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

   public void confirm_YK0( )
   {
      beforeValidateYK27( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsYK27( ) ;
         }
         else
         {
            checkExtendedTableYK27( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursorsYK27( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode27 = Gx_mode ;
         confirm_YK1026( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode27 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesYK0( ) ;
      }
   }

   public void confirm_YK1026( )
   {
      s7231Auc_ULin = O7231Auc_ULin ;
      n7231Auc_ULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRowYK1026( ) ;
         if ( ( nRcdExists_1026 != 0 ) || ( nIsMod_1026 != 0 ) )
         {
            getKeyYK1026( ) ;
            if ( ( nRcdExists_1026 == 0 ) && ( nRcdDeleted_1026 == 0 ) )
            {
               if ( RcdFound1026 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateYK1026( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableYK1026( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsYK1026( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O7231Auc_ULin = A7231Auc_ULin ;
                     n7231Auc_ULin = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "AUC_LIN_" + sGXsfl_35_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAuc_Lin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1026 != 0 )
               {
                  if ( nRcdDeleted_1026 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyYK1026( ) ;
                     loadYK1026( ) ;
                     beforeValidateYK1026( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsYK1026( ) ;
                        O7231Auc_ULin = A7231Auc_ULin ;
                        n7231Auc_ULin = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1026 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateYK1026( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableYK1026( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsYK1026( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O7231Auc_ULin = A7231Auc_ULin ;
                           n7231Auc_ULin = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1026 == 0 )
                  {
                     GXCCtl = "AUC_LIN_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAuc_Lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1026_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1026, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAuc_Lin_Internalname, GXutil.ltrim( localUtil.ntoc( A7232Auc_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAuc_VI_Internalname, GXutil.ltrim( localUtil.ntoc( A7233Auc_VI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAuc_VF_Internalname, GXutil.ltrim( localUtil.ntoc( A7234Auc_VF, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAuc_Ui_Internalname, GXutil.ltrim( localUtil.ntoc( A7235Auc_Ui, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAuc_Na_Internalname, GXutil.ltrim( localUtil.ntoc( A7185Auc_Na, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAuc_Nr_Internalname, GXutil.ltrim( localUtil.ntoc( A7236Auc_Nr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7232Auc_Lin_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7232Auc_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7233Auc_VI_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7233Auc_VI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7234Auc_VF_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7234Auc_VF, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7235Auc_Ui_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7235Auc_Ui, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7185Auc_Na_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7185Auc_Na, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7236Auc_Nr_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7236Auc_Nr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1026_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1026, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1026_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1026, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1026_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1026, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1026 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1026_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1026_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AUC_LIN_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAuc_Lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AUC_VI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAuc_VI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AUC_VF_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAuc_VF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AUC_UI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAuc_Ui_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AUC_NA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAuc_Na_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AUC_NR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAuc_Nr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O7231Auc_ULin = s7231Auc_ULin ;
      n7231Auc_ULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionYK0( )
   {
   }

   public void e11YK2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttabmil_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      ttabmil_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttabmil_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV14Lit2 = httpContext.getMessage( "Empresa", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttabmil_impl.this.A396EmprCod = GXv_char2[0] ;
      ttabmil_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttabmil_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zmYK27( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z407EmprNom = T00YK5_A407EmprNom[0] ;
            Z7231Auc_ULin = T00YK5_A7231Auc_ULin[0] ;
         }
         else
         {
            Z407EmprNom = A407EmprNom ;
            Z7231Auc_ULin = A7231Auc_ULin ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z7231Auc_ULin = A7231Auc_ULin ;
      }
   }

   public void standaloneNotModal( )
   {
      edtAuc_ULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAuc_ULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAuc_ULin_Enabled), 5, 0), true);
      AV33Pgmname = "TTABMIL" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtAuc_ULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAuc_ULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAuc_ULin_Enabled), 5, 0), true);
   }

   public void standaloneModal( )
   {
      if ( isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite eliminar", ""), 1, "");
         AnyError = (short)(1) ;
      }
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

   public void loadYK27( )
   {
      /* Using cursor T00YK6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A407EmprNom = T00YK6_A407EmprNom[0] ;
         n407EmprNom = T00YK6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A7231Auc_ULin = T00YK6_A7231Auc_ULin[0] ;
         n7231Auc_ULin = T00YK6_n7231Auc_ULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
         zmYK27( -6) ;
      }
      pr_default.close(4);
      onLoadActionsYK27( ) ;
   }

   public void onLoadActionsYK27( )
   {
   }

   public void checkExtendedTableYK27( )
   {
      nIsDirty_27 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursorsYK27( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyYK27( )
   {
      /* Using cursor T00YK7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound27 = (short)(1) ;
      }
      else
      {
         RcdFound27 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00YK5 */
      pr_default.execute(3, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T00YK5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmYK27( 6) ;
         RcdFound27 = (short)(1) ;
         A407EmprNom = T00YK5_A407EmprNom[0] ;
         n407EmprNom = T00YK5_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A7231Auc_ULin = T00YK5_A7231Auc_ULin[0] ;
         n7231Auc_ULin = T00YK5_n7231Auc_ULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
         O7231Auc_ULin = A7231Auc_ULin ;
         n7231Auc_ULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
         Z396EmprCod = A396EmprCod ;
         sMode27 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadYK27( ) ;
         if ( AnyError == 1 )
         {
            RcdFound27 = (short)(0) ;
            initializeNonKeyYK27( ) ;
         }
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound27 = (short)(0) ;
         initializeNonKeyYK27( ) ;
         sMode27 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyYK27( ) ;
      if ( RcdFound27 == 0 )
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
      RcdFound27 = (short)(0) ;
      /* Using cursor T00YK8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(T00YK8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(T00YK8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            RcdFound27 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound27 = (short)(0) ;
      /* Using cursor T00YK9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T00YK9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T00YK9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            RcdFound27 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyYK27( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A7231Auc_ULin = O7231Auc_ULin ;
         n7231Auc_ULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
         GX_FocusControl = edtEmprNom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertYK27( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound27 == 1 )
         {
            if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A7231Auc_ULin = O7231Auc_ULin ;
               n7231Auc_ULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprNom_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A7231Auc_ULin = O7231Auc_ULin ;
               n7231Auc_ULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
               updateYK27( ) ;
               GX_FocusControl = edtEmprNom_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A7231Auc_ULin = O7231Auc_ULin ;
               n7231Auc_ULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
               GX_FocusControl = edtEmprNom_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertYK27( ) ;
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
                  A7231Auc_ULin = O7231Auc_ULin ;
                  n7231Auc_ULin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
                  GX_FocusControl = edtEmprNom_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertYK27( ) ;
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
      if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A7231Auc_ULin = O7231Auc_ULin ;
         n7231Auc_ULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprNom_Internalname ;
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
      getKeyYK27( ) ;
      if ( RcdFound27 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
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
         if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttabmil");
      GX_FocusControl = edtEmprNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_YK0( ) ;
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
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtEmprNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartYK27( ) ;
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEmprNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndYK27( ) ;
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
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEmprNom_Internalname ;
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
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEmprNom_Internalname ;
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
      scanStartYK27( ) ;
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound27 != 0 )
         {
            scanNextYK27( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEmprNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndYK27( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyYK27( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00YK4 */
         pr_default.execute(2, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEMPRES"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z407EmprNom, T00YK4_A407EmprNom[0]) != 0 ) || ( Z7231Auc_ULin != T00YK4_A7231Auc_ULin[0] ) )
         {
            if ( GXutil.strcmp(Z407EmprNom, T00YK4_A407EmprNom[0]) != 0 )
            {
               GXutil.writeLogln("ttabmil:[seudo value changed for attri]"+"EmprNom");
               GXutil.writeLogRaw("Old: ",Z407EmprNom);
               GXutil.writeLogRaw("Current: ",T00YK4_A407EmprNom[0]);
            }
            if ( Z7231Auc_ULin != T00YK4_A7231Auc_ULin[0] )
            {
               GXutil.writeLogln("ttabmil:[seudo value changed for attri]"+"Auc_ULin");
               GXutil.writeLogRaw("Old: ",Z7231Auc_ULin);
               GXutil.writeLogRaw("Current: ",T00YK4_A7231Auc_ULin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPEMPRES"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertYK27( )
   {
      beforeValidateYK27( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableYK27( ) ;
      }
      if ( AnyError == 0 )
      {
         zmYK27( 0) ;
         checkOptimisticConcurrencyYK27( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmYK27( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertYK27( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00YK10 */
                  pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n407EmprNom), A407EmprNom, Boolean.valueOf(n7231Auc_ULin), Short.valueOf(A7231Auc_ULin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPRES");
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
                        processLevelYK27( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionYK0( ) ;
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
            loadYK27( ) ;
         }
         endLevelYK27( ) ;
      }
      closeExtendedTableCursorsYK27( ) ;
   }

   public void updateYK27( )
   {
      beforeValidateYK27( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableYK27( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyYK27( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmYK27( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateYK27( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00YK11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n407EmprNom), A407EmprNom, Boolean.valueOf(n7231Auc_ULin), Short.valueOf(A7231Auc_ULin), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPRES");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEMPRES"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateYK27( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelYK27( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionYK0( ) ;
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
         endLevelYK27( ) ;
      }
      closeExtendedTableCursorsYK27( ) ;
   }

   public void deferredUpdateYK27( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateYK27( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyYK27( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsYK27( ) ;
         afterConfirmYK27( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteYK27( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00YK12 */
               pr_default.execute(10, new Object[] {A396EmprCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPRES");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound27 == 0 )
                     {
                        initAllYK27( ) ;
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
                     resetCaptionYK0( ) ;
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
      sMode27 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelYK27( ) ;
      Gx_mode = sMode27 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsYK27( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevelYK1026( )
   {
      s7231Auc_ULin = O7231Auc_ULin ;
      n7231Auc_ULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRowYK1026( ) ;
         if ( ( nRcdExists_1026 != 0 ) || ( nIsMod_1026 != 0 ) )
         {
            standaloneNotModalYK1026( ) ;
            getKeyYK1026( ) ;
            if ( ( nRcdExists_1026 == 0 ) && ( nRcdDeleted_1026 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertYK1026( ) ;
            }
            else
            {
               if ( RcdFound1026 != 0 )
               {
                  if ( ( nRcdDeleted_1026 != 0 ) && ( nRcdExists_1026 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteYK1026( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1026 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateYK1026( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1026 == 0 )
                  {
                     GXCCtl = "AUC_LIN_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAuc_Lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O7231Auc_ULin = A7231Auc_ULin ;
            n7231Auc_ULin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1026_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1026, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAuc_Lin_Internalname, GXutil.ltrim( localUtil.ntoc( A7232Auc_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAuc_VI_Internalname, GXutil.ltrim( localUtil.ntoc( A7233Auc_VI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAuc_VF_Internalname, GXutil.ltrim( localUtil.ntoc( A7234Auc_VF, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAuc_Ui_Internalname, GXutil.ltrim( localUtil.ntoc( A7235Auc_Ui, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAuc_Na_Internalname, GXutil.ltrim( localUtil.ntoc( A7185Auc_Na, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAuc_Nr_Internalname, GXutil.ltrim( localUtil.ntoc( A7236Auc_Nr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7232Auc_Lin_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7232Auc_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7233Auc_VI_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7233Auc_VI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7234Auc_VF_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7234Auc_VF, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7235Auc_Ui_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7235Auc_Ui, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7185Auc_Na_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7185Auc_Na, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7236Auc_Nr_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7236Auc_Nr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1026_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1026, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1026_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1026, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1026_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1026, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1026 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1026_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1026_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AUC_LIN_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAuc_Lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AUC_VI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAuc_VI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AUC_VF_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAuc_VF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AUC_UI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAuc_Ui_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AUC_NA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAuc_Na_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AUC_NR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAuc_Nr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllYK1026( ) ;
      if ( AnyError != 0 )
      {
         O7231Auc_ULin = s7231Auc_ULin ;
         n7231Auc_ULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
      }
      nRcdExists_1026 = (short)(0) ;
      nIsMod_1026 = (short)(0) ;
      nRcdDeleted_1026 = (short)(0) ;
   }

   public void processLevelYK27( )
   {
      /* Save parent mode. */
      sMode27 = Gx_mode ;
      processNestedLevelYK1026( ) ;
      if ( AnyError != 0 )
      {
         O7231Auc_ULin = s7231Auc_ULin ;
         n7231Auc_ULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode27 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T00YK13 */
      pr_default.execute(11, new Object[] {Boolean.valueOf(n7231Auc_ULin), Short.valueOf(A7231Auc_ULin), A396EmprCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPRES");
   }

   public void endLevelYK27( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeCompleteYK27( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttabmil");
         if ( AnyError == 0 )
         {
            confirmValuesYK0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttabmil");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartYK27( )
   {
      /* Scan By routine */
      /* Using cursor T00YK14 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      RcdFound27 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound27 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextYK27( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound27 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound27 = (short)(1) ;
      }
   }

   public void scanEndYK27( )
   {
      pr_default.close(12);
   }

   public void afterConfirmYK27( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertYK27( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateYK27( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteYK27( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteYK27( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateYK27( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesYK27( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtAuc_ULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAuc_ULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAuc_ULin_Enabled), 5, 0), true);
   }

   public void zmYK1026( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7233Auc_VI = T00YK3_A7233Auc_VI[0] ;
            Z7234Auc_VF = T00YK3_A7234Auc_VF[0] ;
            Z7235Auc_Ui = T00YK3_A7235Auc_Ui[0] ;
            Z7185Auc_Na = T00YK3_A7185Auc_Na[0] ;
            Z7236Auc_Nr = T00YK3_A7236Auc_Nr[0] ;
         }
         else
         {
            Z7233Auc_VI = A7233Auc_VI ;
            Z7234Auc_VF = A7234Auc_VF ;
            Z7235Auc_Ui = A7235Auc_Ui ;
            Z7185Auc_Na = A7185Auc_Na ;
            Z7236Auc_Nr = A7236Auc_Nr ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z396EmprCod = A396EmprCod ;
         Z7232Auc_Lin = A7232Auc_Lin ;
         Z7233Auc_VI = A7233Auc_VI ;
         Z7234Auc_VF = A7234Auc_VF ;
         Z7235Auc_Ui = A7235Auc_Ui ;
         Z7185Auc_Na = A7185Auc_Na ;
         Z7236Auc_Nr = A7236Auc_Nr ;
      }
   }

   public void standaloneNotModalYK1026( )
   {
      edtAuc_ULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAuc_ULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAuc_ULin_Enabled), 5, 0), true);
      edtAuc_ULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAuc_ULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAuc_ULin_Enabled), 5, 0), true);
   }

   public void standaloneModalYK1026( )
   {
      if ( isIns( )  )
      {
         A7231Auc_ULin = (short)(O7231Auc_ULin+1) ;
         n7231Auc_ULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A7232Auc_Lin = A7231Auc_ULin ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAuc_Lin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAuc_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAuc_Lin_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      else
      {
         edtAuc_Lin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAuc_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAuc_Lin_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
   }

   public void loadYK1026( )
   {
      /* Using cursor T00YK15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(A7232Auc_Lin)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1026 = (short)(1) ;
         A7233Auc_VI = T00YK15_A7233Auc_VI[0] ;
         n7233Auc_VI = T00YK15_n7233Auc_VI[0] ;
         A7234Auc_VF = T00YK15_A7234Auc_VF[0] ;
         n7234Auc_VF = T00YK15_n7234Auc_VF[0] ;
         A7235Auc_Ui = T00YK15_A7235Auc_Ui[0] ;
         n7235Auc_Ui = T00YK15_n7235Auc_Ui[0] ;
         A7185Auc_Na = T00YK15_A7185Auc_Na[0] ;
         n7185Auc_Na = T00YK15_n7185Auc_Na[0] ;
         A7236Auc_Nr = T00YK15_A7236Auc_Nr[0] ;
         n7236Auc_Nr = T00YK15_n7236Auc_Nr[0] ;
         zmYK1026( -7) ;
      }
      pr_default.close(13);
      onLoadActionsYK1026( ) ;
   }

   public void onLoadActionsYK1026( )
   {
   }

   public void checkExtendedTableYK1026( )
   {
      nIsDirty_1026 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalYK1026( ) ;
   }

   public void closeExtendedTableCursorsYK1026( )
   {
   }

   public void enableDisableYK1026( )
   {
   }

   public void getKeyYK1026( )
   {
      /* Using cursor T00YK16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Short.valueOf(A7232Auc_Lin)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1026 = (short)(1) ;
      }
      else
      {
         RcdFound1026 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKeyYK1026( )
   {
      /* Using cursor T00YK3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A7232Auc_Lin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00YK3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmYK1026( 7) ;
         RcdFound1026 = (short)(1) ;
         initializeNonKeyYK1026( ) ;
         A7232Auc_Lin = T00YK3_A7232Auc_Lin[0] ;
         A7233Auc_VI = T00YK3_A7233Auc_VI[0] ;
         n7233Auc_VI = T00YK3_n7233Auc_VI[0] ;
         A7234Auc_VF = T00YK3_A7234Auc_VF[0] ;
         n7234Auc_VF = T00YK3_n7234Auc_VF[0] ;
         A7235Auc_Ui = T00YK3_A7235Auc_Ui[0] ;
         n7235Auc_Ui = T00YK3_n7235Auc_Ui[0] ;
         A7185Auc_Na = T00YK3_A7185Auc_Na[0] ;
         n7185Auc_Na = T00YK3_n7185Auc_Na[0] ;
         A7236Auc_Nr = T00YK3_A7236Auc_Nr[0] ;
         n7236Auc_Nr = T00YK3_n7236Auc_Nr[0] ;
         Z396EmprCod = A396EmprCod ;
         Z7232Auc_Lin = A7232Auc_Lin ;
         sMode1026 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalYK1026( ) ;
         loadYK1026( ) ;
         Gx_mode = sMode1026 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1026 = (short)(0) ;
         initializeNonKeyYK1026( ) ;
         sMode1026 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalYK1026( ) ;
         Gx_mode = sMode1026 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesYK1026( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyYK1026( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00YK2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A7232Auc_Lin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTABMIL"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z7233Auc_VI != T00YK2_A7233Auc_VI[0] ) || ( Z7234Auc_VF != T00YK2_A7234Auc_VF[0] ) || ( Z7235Auc_Ui != T00YK2_A7235Auc_Ui[0] ) || ( Z7185Auc_Na != T00YK2_A7185Auc_Na[0] ) || ( Z7236Auc_Nr != T00YK2_A7236Auc_Nr[0] ) )
         {
            if ( Z7233Auc_VI != T00YK2_A7233Auc_VI[0] )
            {
               GXutil.writeLogln("ttabmil:[seudo value changed for attri]"+"Auc_VI");
               GXutil.writeLogRaw("Old: ",Z7233Auc_VI);
               GXutil.writeLogRaw("Current: ",T00YK2_A7233Auc_VI[0]);
            }
            if ( Z7234Auc_VF != T00YK2_A7234Auc_VF[0] )
            {
               GXutil.writeLogln("ttabmil:[seudo value changed for attri]"+"Auc_VF");
               GXutil.writeLogRaw("Old: ",Z7234Auc_VF);
               GXutil.writeLogRaw("Current: ",T00YK2_A7234Auc_VF[0]);
            }
            if ( Z7235Auc_Ui != T00YK2_A7235Auc_Ui[0] )
            {
               GXutil.writeLogln("ttabmil:[seudo value changed for attri]"+"Auc_Ui");
               GXutil.writeLogRaw("Old: ",Z7235Auc_Ui);
               GXutil.writeLogRaw("Current: ",T00YK2_A7235Auc_Ui[0]);
            }
            if ( Z7185Auc_Na != T00YK2_A7185Auc_Na[0] )
            {
               GXutil.writeLogln("ttabmil:[seudo value changed for attri]"+"Auc_Na");
               GXutil.writeLogRaw("Old: ",Z7185Auc_Na);
               GXutil.writeLogRaw("Current: ",T00YK2_A7185Auc_Na[0]);
            }
            if ( Z7236Auc_Nr != T00YK2_A7236Auc_Nr[0] )
            {
               GXutil.writeLogln("ttabmil:[seudo value changed for attri]"+"Auc_Nr");
               GXutil.writeLogRaw("Old: ",Z7236Auc_Nr);
               GXutil.writeLogRaw("Current: ",T00YK2_A7236Auc_Nr[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTABMIL"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertYK1026( )
   {
      beforeValidateYK1026( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableYK1026( ) ;
      }
      if ( AnyError == 0 )
      {
         zmYK1026( 0) ;
         checkOptimisticConcurrencyYK1026( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmYK1026( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertYK1026( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00YK17 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Short.valueOf(A7232Auc_Lin), Boolean.valueOf(n7233Auc_VI), Integer.valueOf(A7233Auc_VI), Boolean.valueOf(n7234Auc_VF), Integer.valueOf(A7234Auc_VF), Boolean.valueOf(n7235Auc_Ui), Integer.valueOf(A7235Auc_Ui), Boolean.valueOf(n7185Auc_Na), Integer.valueOf(A7185Auc_Na), Boolean.valueOf(n7236Auc_Nr), Integer.valueOf(A7236Auc_Nr)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTABMIL");
                  if ( (pr_default.getStatus(15) == 1) )
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
            loadYK1026( ) ;
         }
         endLevelYK1026( ) ;
      }
      closeExtendedTableCursorsYK1026( ) ;
   }

   public void updateYK1026( )
   {
      beforeValidateYK1026( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableYK1026( ) ;
      }
      if ( ( nIsMod_1026 != 0 ) || ( nIsDirty_1026 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyYK1026( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmYK1026( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateYK1026( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00YK18 */
                     pr_default.execute(16, new Object[] {Boolean.valueOf(n7233Auc_VI), Integer.valueOf(A7233Auc_VI), Boolean.valueOf(n7234Auc_VF), Integer.valueOf(A7234Auc_VF), Boolean.valueOf(n7235Auc_Ui), Integer.valueOf(A7235Auc_Ui), Boolean.valueOf(n7185Auc_Na), Integer.valueOf(A7185Auc_Na), Boolean.valueOf(n7236Auc_Nr), Integer.valueOf(A7236Auc_Nr), A396EmprCod, Short.valueOf(A7232Auc_Lin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTABMIL");
                     if ( (pr_default.getStatus(16) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTABMIL"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateYK1026( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyYK1026( ) ;
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
            endLevelYK1026( ) ;
         }
      }
      closeExtendedTableCursorsYK1026( ) ;
   }

   public void deferredUpdateYK1026( )
   {
   }

   public void deleteYK1026( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateYK1026( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyYK1026( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsYK1026( ) ;
         afterConfirmYK1026( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteYK1026( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00YK19 */
               pr_default.execute(17, new Object[] {A396EmprCod, Short.valueOf(A7232Auc_Lin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTABMIL");
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
      sMode1026 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelYK1026( ) ;
      Gx_mode = sMode1026 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsYK1026( )
   {
      standaloneModalYK1026( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00YK20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Short.valueOf(A7232Auc_Lin)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AUDCOB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
      }
   }

   public void endLevelYK1026( )
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

   public void scanStartYK1026( )
   {
      /* Scan By routine */
      /* Using cursor T00YK21 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      RcdFound1026 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1026 = (short)(1) ;
         A7232Auc_Lin = T00YK21_A7232Auc_Lin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextYK1026( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound1026 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1026 = (short)(1) ;
         A7232Auc_Lin = T00YK21_A7232Auc_Lin[0] ;
      }
   }

   public void scanEndYK1026( )
   {
      pr_default.close(19);
   }

   public void afterConfirmYK1026( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertYK1026( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateYK1026( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteYK1026( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteYK1026( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateYK1026( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesYK1026( )
   {
      edtAuc_Lin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAuc_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAuc_Lin_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAuc_VI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAuc_VI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAuc_VI_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAuc_VF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAuc_VF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAuc_VF_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAuc_Ui_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAuc_Ui_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAuc_Ui_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAuc_Na_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAuc_Na_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAuc_Na_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAuc_Nr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAuc_Nr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAuc_Nr_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void send_integrity_lvl_hashesYK1026( )
   {
   }

   public void send_integrity_lvl_hashesYK27( )
   {
   }

   public void subsflControlProps_351026( )
   {
      edtavnRcdDeleted_1026_Internalname = "vNRCDDELETED_1026_"+sGXsfl_35_idx ;
      edtAuc_Lin_Internalname = "AUC_LIN_"+sGXsfl_35_idx ;
      edtAuc_VI_Internalname = "AUC_VI_"+sGXsfl_35_idx ;
      edtAuc_VF_Internalname = "AUC_VF_"+sGXsfl_35_idx ;
      edtAuc_Ui_Internalname = "AUC_UI_"+sGXsfl_35_idx ;
      edtAuc_Na_Internalname = "AUC_NA_"+sGXsfl_35_idx ;
      edtAuc_Nr_Internalname = "AUC_NR_"+sGXsfl_35_idx ;
   }

   public void subsflControlProps_fel_351026( )
   {
      edtavnRcdDeleted_1026_Internalname = "vNRCDDELETED_1026_"+sGXsfl_35_fel_idx ;
      edtAuc_Lin_Internalname = "AUC_LIN_"+sGXsfl_35_fel_idx ;
      edtAuc_VI_Internalname = "AUC_VI_"+sGXsfl_35_fel_idx ;
      edtAuc_VF_Internalname = "AUC_VF_"+sGXsfl_35_fel_idx ;
      edtAuc_Ui_Internalname = "AUC_UI_"+sGXsfl_35_fel_idx ;
      edtAuc_Na_Internalname = "AUC_NA_"+sGXsfl_35_fel_idx ;
      edtAuc_Nr_Internalname = "AUC_NR_"+sGXsfl_35_fel_idx ;
   }

   public void addRowYK1026( )
   {
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_351026( ) ;
      sendRowYK1026( ) ;
   }

   public void sendRowYK1026( )
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
         if ( ((int)((nGXsfl_35_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1026_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1026_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1026, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1026_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1026), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1026), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1026_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1026_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1026_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAuc_Lin_Internalname,GXutil.ltrim( localUtil.ntoc( A7232Auc_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7232Auc_Lin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,37);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAuc_Lin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAuc_Lin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1026_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAuc_VI_Internalname,GXutil.ltrim( localUtil.ntoc( A7233Auc_VI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAuc_VI_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7233Auc_VI), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7233Auc_VI), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,38);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAuc_VI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAuc_VI_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1026_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAuc_VF_Internalname,GXutil.ltrim( localUtil.ntoc( A7234Auc_VF, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAuc_VF_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7234Auc_VF), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7234Auc_VF), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAuc_VF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAuc_VF_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1026_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 40,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAuc_Ui_Internalname,GXutil.ltrim( localUtil.ntoc( A7235Auc_Ui, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAuc_Ui_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7235Auc_Ui), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7235Auc_Ui), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAuc_Ui_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAuc_Ui_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1026_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAuc_Na_Internalname,GXutil.ltrim( localUtil.ntoc( A7185Auc_Na, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAuc_Na_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7185Auc_Na), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7185Auc_Na), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAuc_Na_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAuc_Na_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1026_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAuc_Nr_Internalname,GXutil.ltrim( localUtil.ntoc( A7236Auc_Nr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAuc_Nr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7236Auc_Nr), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7236Auc_Nr), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAuc_Nr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAuc_Nr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesYK1026( ) ;
      GXCCtl = "Z7232Auc_Lin_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7232Auc_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7233Auc_VI_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7233Auc_VI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7234Auc_VF_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7234Auc_VF, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7235Auc_Ui_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7235Auc_Ui, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7185Auc_Na_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7185Auc_Na, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7236Auc_Nr_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7236Auc_Nr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1026_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1026, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1026_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1026, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1026_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1026, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1026_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1026_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AUC_LIN_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAuc_Lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AUC_VI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAuc_VI_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AUC_VF_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAuc_VF_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AUC_UI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAuc_Ui_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AUC_NA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAuc_Na_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AUC_NR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAuc_Nr_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowYK1026( )
   {
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_351026( ) ;
      edtavnRcdDeleted_1026_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1026_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAuc_Lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AUC_LIN_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAuc_VI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AUC_VI_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAuc_VF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AUC_VF_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAuc_Ui_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AUC_UI_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAuc_Na_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AUC_NA_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAuc_Nr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AUC_NR_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1026_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1026_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1026");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1026_Internalname ;
         wbErr = true ;
         nRcdDeleted_1026 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1026 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1026_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAuc_Lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAuc_Lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "AUC_LIN_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAuc_Lin_Internalname ;
         wbErr = true ;
         A7232Auc_Lin = (short)(0) ;
      }
      else
      {
         A7232Auc_Lin = (short)(localUtil.ctol( httpContext.cgiGet( edtAuc_Lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAuc_VI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAuc_VI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "AUC_VI_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAuc_VI_Internalname ;
         wbErr = true ;
         A7233Auc_VI = 0 ;
         n7233Auc_VI = false ;
      }
      else
      {
         A7233Auc_VI = (int)(localUtil.ctol( httpContext.cgiGet( edtAuc_VI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7233Auc_VI = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAuc_VF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAuc_VF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "AUC_VF_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAuc_VF_Internalname ;
         wbErr = true ;
         A7234Auc_VF = 0 ;
         n7234Auc_VF = false ;
      }
      else
      {
         A7234Auc_VF = (int)(localUtil.ctol( httpContext.cgiGet( edtAuc_VF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7234Auc_VF = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAuc_Ui_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAuc_Ui_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "AUC_UI_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAuc_Ui_Internalname ;
         wbErr = true ;
         A7235Auc_Ui = 0 ;
         n7235Auc_Ui = false ;
      }
      else
      {
         A7235Auc_Ui = (int)(localUtil.ctol( httpContext.cgiGet( edtAuc_Ui_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7235Auc_Ui = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAuc_Na_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAuc_Na_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "AUC_NA_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAuc_Na_Internalname ;
         wbErr = true ;
         A7185Auc_Na = 0 ;
         n7185Auc_Na = false ;
      }
      else
      {
         A7185Auc_Na = (int)(localUtil.ctol( httpContext.cgiGet( edtAuc_Na_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7185Auc_Na = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAuc_Nr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAuc_Nr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "AUC_NR_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAuc_Nr_Internalname ;
         wbErr = true ;
         A7236Auc_Nr = 0 ;
         n7236Auc_Nr = false ;
      }
      else
      {
         A7236Auc_Nr = (int)(localUtil.ctol( httpContext.cgiGet( edtAuc_Nr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7236Auc_Nr = false ;
      }
      GXCCtl = "Z7232Auc_Lin_" + sGXsfl_35_idx ;
      Z7232Auc_Lin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7233Auc_VI_" + sGXsfl_35_idx ;
      Z7233Auc_VI = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7234Auc_VF_" + sGXsfl_35_idx ;
      Z7234Auc_VF = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7235Auc_Ui_" + sGXsfl_35_idx ;
      Z7235Auc_Ui = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7185Auc_Na_" + sGXsfl_35_idx ;
      Z7185Auc_Na = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7236Auc_Nr_" + sGXsfl_35_idx ;
      Z7236Auc_Nr = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1026_" + sGXsfl_35_idx ;
      nRcdDeleted_1026 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1026_" + sGXsfl_35_idx ;
      nRcdExists_1026 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1026_" + sGXsfl_35_idx ;
      nIsMod_1026 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAuc_Lin_Enabled = edtAuc_Lin_Enabled ;
   }

   public void confirmValuesYK0( )
   {
      nGXsfl_35_idx = 0 ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_351026( ) ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_351026( ) ;
         httpContext.changePostValue( "Z7232Auc_Lin_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7232Auc_Lin_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7232Auc_Lin_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7233Auc_VI_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7233Auc_VI_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7233Auc_VI_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7234Auc_VF_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7234Auc_VF_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7234Auc_VF_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7235Auc_Ui_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7235Auc_Ui_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7235Auc_Ui_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7185Auc_Na_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7185Auc_Na_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7185Auc_Na_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7236Auc_Nr_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7236Auc_Nr_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7236Auc_Nr_"+sGXsfl_35_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttabmil", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7231Auc_ULin", GXutil.ltrim( localUtil.ntoc( Z7231Auc_ULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O7231Auc_ULin", GXutil.ltrim( localUtil.ntoc( O7231Auc_ULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_35", GXutil.ltrim( localUtil.ntoc( nGXsfl_35_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV33Pgmname));
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
      return formatLink("app.ttabmil", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTABMIL" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TABLA MILITAR", "") ;
   }

   public void initializeNonKeyYK27( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A7231Auc_ULin = (short)(0) ;
      n7231Auc_ULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
      O7231Auc_ULin = A7231Auc_ULin ;
      n7231Auc_ULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
      Z407EmprNom = "" ;
      Z7231Auc_ULin = (short)(0) ;
   }

   public void initAllYK27( )
   {
      initializeNonKeyYK27( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyYK1026( )
   {
      A7233Auc_VI = 0 ;
      n7233Auc_VI = false ;
      A7234Auc_VF = 0 ;
      n7234Auc_VF = false ;
      A7235Auc_Ui = 0 ;
      n7235Auc_Ui = false ;
      A7185Auc_Na = 0 ;
      n7185Auc_Na = false ;
      A7236Auc_Nr = 0 ;
      n7236Auc_Nr = false ;
      Z7233Auc_VI = 0 ;
      Z7234Auc_VF = 0 ;
      Z7235Auc_Ui = 0 ;
      Z7185Auc_Na = 0 ;
      Z7236Auc_Nr = 0 ;
   }

   public void initAllYK1026( )
   {
      A7232Auc_Lin = (short)(0) ;
      initializeNonKeyYK1026( ) ;
   }

   public void standaloneModalInsertYK1026( )
   {
      A7231Auc_ULin = i7231Auc_ULin ;
      n7231Auc_ULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7231Auc_ULin), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241532428", true, true);
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
      httpContext.AddJavascriptSource("ttabmil.js", "?20268241532428", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1026( )
   {
      edtAuc_Lin_Enabled = defedtAuc_Lin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAuc_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAuc_Lin_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void startgridcontrol35( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1026, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1026_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7232Auc_Lin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAuc_Lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7233Auc_VI, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAuc_VI_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7234Auc_VF, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAuc_VF_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7235Auc_Ui, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAuc_Ui_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7185Auc_Na, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAuc_Na_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7236Auc_Nr, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAuc_Nr_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtAuc_ULin_Internalname = "AUC_ULIN" ;
      edtavnRcdDeleted_1026_Internalname = "vNRCDDELETED_1026" ;
      edtAuc_Lin_Internalname = "AUC_LIN" ;
      edtAuc_VI_Internalname = "AUC_VI" ;
      edtAuc_VF_Internalname = "AUC_VF" ;
      edtAuc_Ui_Internalname = "AUC_UI" ;
      edtAuc_Na_Internalname = "AUC_NA" ;
      edtAuc_Nr_Internalname = "AUC_NR" ;
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
      Form.setCaption( httpContext.getMessage( "TABLA MILITAR", "") );
      edtAuc_Nr_Jsonclick = "" ;
      edtAuc_Na_Jsonclick = "" ;
      edtAuc_Ui_Jsonclick = "" ;
      edtAuc_VF_Jsonclick = "" ;
      edtAuc_VI_Jsonclick = "" ;
      edtAuc_Lin_Jsonclick = "" ;
      edtavnRcdDeleted_1026_Jsonclick = "" ;
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
      edtAuc_Nr_Enabled = 1 ;
      edtAuc_Na_Enabled = 1 ;
      edtAuc_Ui_Enabled = 1 ;
      edtAuc_VF_Enabled = 1 ;
      edtAuc_VI_Enabled = 1 ;
      edtAuc_Lin_Enabled = 1 ;
      edtavnRcdDeleted_1026_Enabled = 1 ;
      edtAuc_ULin_Jsonclick = "" ;
      edtAuc_ULin_Backcolor = (int)(0xFFFFFF) ;
      edtAuc_ULin_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
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
      subsflControlProps_351026( ) ;
      while ( nGXsfl_35_idx <= nRC_GXsfl_35 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalYK1026( ) ;
         standaloneModalYK1026( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowYK1026( ) ;
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_351026( ) ;
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
      GX_FocusControl = edtEmprNom_Internalname ;
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
      n7231Auc_ULin = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A7231Auc_ULin", GXutil.ltrim( localUtil.ntoc( A7231Auc_ULin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7231Auc_ULin", GXutil.ltrim( localUtil.ntoc( Z7231Auc_ULin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O7231Auc_ULin", GXutil.ltrim( localUtil.ntoc( O7231Auc_ULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A7231Auc_ULin',fld:'AUC_ULIN',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A7231Auc_ULin',fld:'AUC_ULIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z407EmprNom'},{av:'Z7231Auc_ULin'},{av:'O7231Auc_ULin'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_AUC_ULIN","{handler:'valid_Auc_ulin',iparms:[]");
      setEventMetadata("VALID_AUC_ULIN",",oparms:[]}");
      setEventMetadata("VALID_AUC_LIN","{handler:'valid_Auc_lin',iparms:[]");
      setEventMetadata("VALID_AUC_LIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Auc_nr',iparms:[]");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z407EmprNom = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      A396EmprCod = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1026 = "" ;
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
      sMode27 = "" ;
      GXCCtl = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV14Lit2 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      T00YK6_A396EmprCod = new String[] {""} ;
      T00YK6_A407EmprNom = new String[] {""} ;
      T00YK6_n407EmprNom = new boolean[] {false} ;
      T00YK6_A7231Auc_ULin = new short[1] ;
      T00YK6_n7231Auc_ULin = new boolean[] {false} ;
      T00YK7_A396EmprCod = new String[] {""} ;
      T00YK5_A396EmprCod = new String[] {""} ;
      T00YK5_A407EmprNom = new String[] {""} ;
      T00YK5_n407EmprNom = new boolean[] {false} ;
      T00YK5_A7231Auc_ULin = new short[1] ;
      T00YK5_n7231Auc_ULin = new boolean[] {false} ;
      T00YK8_A396EmprCod = new String[] {""} ;
      T00YK9_A396EmprCod = new String[] {""} ;
      T00YK4_A396EmprCod = new String[] {""} ;
      T00YK4_A407EmprNom = new String[] {""} ;
      T00YK4_n407EmprNom = new boolean[] {false} ;
      T00YK4_A7231Auc_ULin = new short[1] ;
      T00YK4_n7231Auc_ULin = new boolean[] {false} ;
      T00YK14_A396EmprCod = new String[] {""} ;
      T00YK15_A396EmprCod = new String[] {""} ;
      T00YK15_A7232Auc_Lin = new short[1] ;
      T00YK15_A7233Auc_VI = new int[1] ;
      T00YK15_n7233Auc_VI = new boolean[] {false} ;
      T00YK15_A7234Auc_VF = new int[1] ;
      T00YK15_n7234Auc_VF = new boolean[] {false} ;
      T00YK15_A7235Auc_Ui = new int[1] ;
      T00YK15_n7235Auc_Ui = new boolean[] {false} ;
      T00YK15_A7185Auc_Na = new int[1] ;
      T00YK15_n7185Auc_Na = new boolean[] {false} ;
      T00YK15_A7236Auc_Nr = new int[1] ;
      T00YK15_n7236Auc_Nr = new boolean[] {false} ;
      T00YK16_A396EmprCod = new String[] {""} ;
      T00YK16_A7232Auc_Lin = new short[1] ;
      T00YK3_A396EmprCod = new String[] {""} ;
      T00YK3_A7232Auc_Lin = new short[1] ;
      T00YK3_A7233Auc_VI = new int[1] ;
      T00YK3_n7233Auc_VI = new boolean[] {false} ;
      T00YK3_A7234Auc_VF = new int[1] ;
      T00YK3_n7234Auc_VF = new boolean[] {false} ;
      T00YK3_A7235Auc_Ui = new int[1] ;
      T00YK3_n7235Auc_Ui = new boolean[] {false} ;
      T00YK3_A7185Auc_Na = new int[1] ;
      T00YK3_n7185Auc_Na = new boolean[] {false} ;
      T00YK3_A7236Auc_Nr = new int[1] ;
      T00YK3_n7236Auc_Nr = new boolean[] {false} ;
      T00YK2_A396EmprCod = new String[] {""} ;
      T00YK2_A7232Auc_Lin = new short[1] ;
      T00YK2_A7233Auc_VI = new int[1] ;
      T00YK2_n7233Auc_VI = new boolean[] {false} ;
      T00YK2_A7234Auc_VF = new int[1] ;
      T00YK2_n7234Auc_VF = new boolean[] {false} ;
      T00YK2_A7235Auc_Ui = new int[1] ;
      T00YK2_n7235Auc_Ui = new boolean[] {false} ;
      T00YK2_A7185Auc_Na = new int[1] ;
      T00YK2_n7185Auc_Na = new boolean[] {false} ;
      T00YK2_A7236Auc_Nr = new int[1] ;
      T00YK2_n7236Auc_Nr = new boolean[] {false} ;
      T00YK20_A396EmprCod = new String[] {""} ;
      T00YK20_A7198Auc_Discod = new int[1] ;
      T00YK20_A7232Auc_Lin = new short[1] ;
      T00YK21_A396EmprCod = new String[] {""} ;
      T00YK21_A7232Auc_Lin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttabmil__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttabmil__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttabmil__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttabmil__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttabmil__default(),
         new Object[] {
             new Object[] {
            T00YK2_A396EmprCod, T00YK2_A7232Auc_Lin, T00YK2_A7233Auc_VI, T00YK2_n7233Auc_VI, T00YK2_A7234Auc_VF, T00YK2_n7234Auc_VF, T00YK2_A7235Auc_Ui, T00YK2_n7235Auc_Ui, T00YK2_A7185Auc_Na, T00YK2_n7185Auc_Na,
            T00YK2_A7236Auc_Nr, T00YK2_n7236Auc_Nr
            }
            , new Object[] {
            T00YK3_A396EmprCod, T00YK3_A7232Auc_Lin, T00YK3_A7233Auc_VI, T00YK3_n7233Auc_VI, T00YK3_A7234Auc_VF, T00YK3_n7234Auc_VF, T00YK3_A7235Auc_Ui, T00YK3_n7235Auc_Ui, T00YK3_A7185Auc_Na, T00YK3_n7185Auc_Na,
            T00YK3_A7236Auc_Nr, T00YK3_n7236Auc_Nr
            }
            , new Object[] {
            T00YK4_A396EmprCod, T00YK4_A407EmprNom, T00YK4_n407EmprNom, T00YK4_A7231Auc_ULin, T00YK4_n7231Auc_ULin
            }
            , new Object[] {
            T00YK5_A396EmprCod, T00YK5_A407EmprNom, T00YK5_n407EmprNom, T00YK5_A7231Auc_ULin, T00YK5_n7231Auc_ULin
            }
            , new Object[] {
            T00YK6_A396EmprCod, T00YK6_A407EmprNom, T00YK6_n407EmprNom, T00YK6_A7231Auc_ULin, T00YK6_n7231Auc_ULin
            }
            , new Object[] {
            T00YK7_A396EmprCod
            }
            , new Object[] {
            T00YK8_A396EmprCod
            }
            , new Object[] {
            T00YK9_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00YK14_A396EmprCod
            }
            , new Object[] {
            T00YK15_A396EmprCod, T00YK15_A7232Auc_Lin, T00YK15_A7233Auc_VI, T00YK15_n7233Auc_VI, T00YK15_A7234Auc_VF, T00YK15_n7234Auc_VF, T00YK15_A7235Auc_Ui, T00YK15_n7235Auc_Ui, T00YK15_A7185Auc_Na, T00YK15_n7185Auc_Na,
            T00YK15_A7236Auc_Nr, T00YK15_n7236Auc_Nr
            }
            , new Object[] {
            T00YK16_A396EmprCod, T00YK16_A7232Auc_Lin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00YK20_A396EmprCod, T00YK20_A7198Auc_Discod, T00YK20_A7232Auc_Lin
            }
            , new Object[] {
            T00YK21_A396EmprCod, T00YK21_A7232Auc_Lin
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TTABMIL" ;
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
   private short Z7231Auc_ULin ;
   private short O7231Auc_ULin ;
   private short Z7232Auc_Lin ;
   private short nRcdDeleted_1026 ;
   private short nRcdExists_1026 ;
   private short nIsMod_1026 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A7231Auc_ULin ;
   private short nBlankRcdCount1026 ;
   private short RcdFound1026 ;
   private short B7231Auc_ULin ;
   private short nBlankRcdUsr1026 ;
   private short s7231Auc_ULin ;
   private short A7232Auc_Lin ;
   private short RcdFound27 ;
   private short nIsDirty_27 ;
   private short nIsDirty_1026 ;
   private short i7231Auc_ULin ;
   private short ZZ7231Auc_ULin ;
   private short ZO7231Auc_ULin ;
   private int nRC_GXsfl_35 ;
   private int nGXsfl_35_idx=1 ;
   private int Z7233Auc_VI ;
   private int Z7234Auc_VF ;
   private int Z7235Auc_Ui ;
   private int Z7185Auc_Na ;
   private int Z7236Auc_Nr ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtAuc_ULin_Enabled ;
   private int edtavnRcdDeleted_1026_Enabled ;
   private int edtAuc_Lin_Enabled ;
   private int edtAuc_VI_Enabled ;
   private int edtAuc_VF_Enabled ;
   private int edtAuc_Ui_Enabled ;
   private int edtAuc_Na_Enabled ;
   private int edtAuc_Nr_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A7233Auc_VI ;
   private int A7234Auc_VF ;
   private int A7235Auc_Ui ;
   private int A7185Auc_Na ;
   private int A7236Auc_Nr ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtAuc_Lin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtAuc_ULin_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z407EmprNom ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprNom_Internalname ;
   private String sGXsfl_35_idx="0001" ;
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
   private String A396EmprCod ;
   private String edtEmprCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtAuc_ULin_Internalname ;
   private String edtAuc_ULin_Jsonclick ;
   private String sMode1026 ;
   private String edtavnRcdDeleted_1026_Internalname ;
   private String edtAuc_Lin_Internalname ;
   private String edtAuc_VI_Internalname ;
   private String edtAuc_VF_Internalname ;
   private String edtAuc_Ui_Internalname ;
   private String edtAuc_Na_Internalname ;
   private String edtAuc_Nr_Internalname ;
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
   private String sMode27 ;
   private String GXCCtl ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV14Lit2 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String sGXsfl_35_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1026_Jsonclick ;
   private String edtAuc_Lin_Jsonclick ;
   private String edtAuc_VI_Jsonclick ;
   private String edtAuc_VF_Jsonclick ;
   private String edtAuc_Ui_Jsonclick ;
   private String edtAuc_Na_Jsonclick ;
   private String edtAuc_Nr_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n7231Auc_ULin ;
   private boolean bGXsfl_35_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n7233Auc_VI ;
   private boolean n7234Auc_VF ;
   private boolean n7235Auc_Ui ;
   private boolean n7185Auc_Na ;
   private boolean n7236Auc_Nr ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00YK6_A396EmprCod ;
   private String[] T00YK6_A407EmprNom ;
   private boolean[] T00YK6_n407EmprNom ;
   private short[] T00YK6_A7231Auc_ULin ;
   private boolean[] T00YK6_n7231Auc_ULin ;
   private String[] T00YK7_A396EmprCod ;
   private String[] T00YK5_A396EmprCod ;
   private String[] T00YK5_A407EmprNom ;
   private boolean[] T00YK5_n407EmprNom ;
   private short[] T00YK5_A7231Auc_ULin ;
   private boolean[] T00YK5_n7231Auc_ULin ;
   private String[] T00YK8_A396EmprCod ;
   private String[] T00YK9_A396EmprCod ;
   private String[] T00YK4_A396EmprCod ;
   private String[] T00YK4_A407EmprNom ;
   private boolean[] T00YK4_n407EmprNom ;
   private short[] T00YK4_A7231Auc_ULin ;
   private boolean[] T00YK4_n7231Auc_ULin ;
   private String[] T00YK14_A396EmprCod ;
   private String[] T00YK15_A396EmprCod ;
   private short[] T00YK15_A7232Auc_Lin ;
   private int[] T00YK15_A7233Auc_VI ;
   private boolean[] T00YK15_n7233Auc_VI ;
   private int[] T00YK15_A7234Auc_VF ;
   private boolean[] T00YK15_n7234Auc_VF ;
   private int[] T00YK15_A7235Auc_Ui ;
   private boolean[] T00YK15_n7235Auc_Ui ;
   private int[] T00YK15_A7185Auc_Na ;
   private boolean[] T00YK15_n7185Auc_Na ;
   private int[] T00YK15_A7236Auc_Nr ;
   private boolean[] T00YK15_n7236Auc_Nr ;
   private String[] T00YK16_A396EmprCod ;
   private short[] T00YK16_A7232Auc_Lin ;
   private String[] T00YK3_A396EmprCod ;
   private short[] T00YK3_A7232Auc_Lin ;
   private int[] T00YK3_A7233Auc_VI ;
   private boolean[] T00YK3_n7233Auc_VI ;
   private int[] T00YK3_A7234Auc_VF ;
   private boolean[] T00YK3_n7234Auc_VF ;
   private int[] T00YK3_A7235Auc_Ui ;
   private boolean[] T00YK3_n7235Auc_Ui ;
   private int[] T00YK3_A7185Auc_Na ;
   private boolean[] T00YK3_n7185Auc_Na ;
   private int[] T00YK3_A7236Auc_Nr ;
   private boolean[] T00YK3_n7236Auc_Nr ;
   private String[] T00YK2_A396EmprCod ;
   private short[] T00YK2_A7232Auc_Lin ;
   private int[] T00YK2_A7233Auc_VI ;
   private boolean[] T00YK2_n7233Auc_VI ;
   private int[] T00YK2_A7234Auc_VF ;
   private boolean[] T00YK2_n7234Auc_VF ;
   private int[] T00YK2_A7235Auc_Ui ;
   private boolean[] T00YK2_n7235Auc_Ui ;
   private int[] T00YK2_A7185Auc_Na ;
   private boolean[] T00YK2_n7185Auc_Na ;
   private int[] T00YK2_A7236Auc_Nr ;
   private boolean[] T00YK2_n7236Auc_Nr ;
   private String[] T00YK20_A396EmprCod ;
   private int[] T00YK20_A7198Auc_Discod ;
   private short[] T00YK20_A7232Auc_Lin ;
   private String[] T00YK21_A396EmprCod ;
   private short[] T00YK21_A7232Auc_Lin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttabmil__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttabmil__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttabmil__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttabmil__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttabmil__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00YK2", "SELECT EmprCod, Auc_Lin, Auc_VI, Auc_VF, Auc_Ui, Auc_Na, Auc_Nr FROM TXPTABMIL WHERE EmprCod = ? AND Auc_Lin = ?  FOR UPDATE OF Auc_VI, Auc_VF, Auc_Ui, Auc_Na, Auc_Nr NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00YK3", "SELECT EmprCod, Auc_Lin, Auc_VI, Auc_VF, Auc_Ui, Auc_Na, Auc_Nr FROM TXPTABMIL WHERE EmprCod = ? AND Auc_Lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00YK4", "SELECT EmprCod, EmprNom, Auc_ULin FROM TXPEMPRES WHERE EmprCod = ?  FOR UPDATE OF EmprNom, Auc_ULin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00YK5", "SELECT EmprCod, EmprNom, Auc_ULin FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00YK6", "SELECT /*+ FIRST_ROWS(1) */ TM1.EmprCod, TM1.EmprNom, TM1.Auc_ULin FROM TXPEMPRES TM1 WHERE TM1.EmprCod = ? ORDER BY TM1.EmprCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00YK7", "SELECT /*+ FIRST_ROWS(1) */ EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00YK8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00YK9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00YK10", "INSERT INTO TXPEMPRES(EmprCod, EmprNom, Auc_ULin, EmprDir, EmprCpo, EmprPob, EmprCif, EmprTel, EmprFax, IvaCod, Emp1, Emp0, Ser1, Ser0, Ser2, Ser20, Ser3, Ser30, EmpNumDec, Ser4, Ser40, Ser5, Ser50, Ser6, Ser60, Ser7, Ser70, Hh_UltL, Coste_mca, Coste_msa, Factor_in, Colombia, EmpItm1, EmpItm2, EmpItm3, EmpItm4, EmpItm5, EmpItm6, EmpQuePrd, EmpQueCol, EmpQueSod, EmpCosInd, EmpGasGen, EmpMarCom, EmpCosTin, EmpRelBan, EmpItm7, PtosUltID, EmpKey, EmpToken, EmpEnv, EmpProd) VALUES(?, ?, ?, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ')", GX_NOMASK, "TXPEMPRES")
         ,new UpdateCursor("T00YK11", "UPDATE TXPEMPRES SET EmprNom=?, Auc_ULin=?  WHERE EmprCod = ?", GX_NOMASK, "TXPEMPRES")
         ,new UpdateCursor("T00YK12", "DELETE FROM TXPEMPRES  WHERE EmprCod = ?", GX_NOMASK, "TXPEMPRES")
         ,new UpdateCursor("T00YK13", "UPDATE TXPEMPRES SET Auc_ULin=?  WHERE EmprCod = ?", GX_NOMASK, "TXPEMPRES")
         ,new ForEachCursor("T00YK14", "SELECT /*+ FIRST_ROWS(100) */ EmprCod FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00YK15", "SELECT EmprCod, Auc_Lin, Auc_VI, Auc_VF, Auc_Ui, Auc_Na, Auc_Nr FROM TXPTABMIL WHERE EmprCod = ? and Auc_Lin = ? ORDER BY EmprCod, Auc_Lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00YK16", "SELECT EmprCod, Auc_Lin FROM TXPTABMIL WHERE EmprCod = ? AND Auc_Lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00YK17", "INSERT INTO TXPTABMIL(EmprCod, Auc_Lin, Auc_VI, Auc_VF, Auc_Ui, Auc_Na, Auc_Nr) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTABMIL")
         ,new UpdateCursor("T00YK18", "UPDATE TXPTABMIL SET Auc_VI=?, Auc_VF=?, Auc_Ui=?, Auc_Na=?, Auc_Nr=?  WHERE EmprCod = ? AND Auc_Lin = ?", GX_NOMASK, "TXPTABMIL")
         ,new UpdateCursor("T00YK19", "DELETE FROM TXPTABMIL  WHERE EmprCod = ? AND Auc_Lin = ?", GX_NOMASK, "TXPTABMIL")
         ,new ForEachCursor("T00YK20", "SELECT * FROM (SELECT EmprCod, Auc_Discod, Auc_Lin FROM TXPAUDCOB WHERE EmprCod = ? AND Auc_Lin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00YK21", "SELECT EmprCod, Auc_Lin FROM TXPTABMIL WHERE EmprCod = ? ORDER BY EmprCod, Auc_Lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 19 :
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
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 30);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[4]).shortValue());
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[11]).intValue());
               }
               return;
            case 16 :
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
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setShort(7, ((Number) parms[11]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

