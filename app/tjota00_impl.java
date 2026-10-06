package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tjota00_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod, A719PrdNum) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TABLA CODIGOS DEPOSITOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtJt_codigo_Internalname ;
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
      A10245Jt_ultL = (short)(GXutil.lval( httpContext.GetPar( "Jt_ultL"))) ;
      n10245Jt_ultL = false ;
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

   public tjota00_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tjota00_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tjota00_impl.class ));
   }

   public tjota00_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJOTA00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJOTA00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJOTA00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJOTA00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TJOTA00.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TJOTA00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TJOTA00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo deposito", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TJOTA00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtJt_codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A10243Jt_codigo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtJt_codigo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10243Jt_codigo), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10243Jt_codigo), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtJt_codigo_Jsonclick, 0, "", "", "", "", "", 1, edtJt_codigo_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TJOTA00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJOTA00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TJOTA00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TJOTA00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TJOTA00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtJt_Desc_Internalname, GXutil.rtrim( A10244Jt_Desc), GXutil.rtrim( localUtil.format( A10244Jt_Desc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtJt_Desc_Jsonclick, 0, "", "", "", "", "", 1, edtJt_Desc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TJOTA00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TJOTA00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtJt_ultL_Internalname, GXutil.ltrim( localUtil.ntoc( A10245Jt_ultL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtJt_ultL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10245Jt_ultL), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10245Jt_ultL), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtJt_ultL_Jsonclick, 0, "", "", "", "", "", 1, edtJt_ultL_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TJOTA00.htm");
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
         nBlankRcdCount1389 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1389 = (short)(1) ;
            scanStart17J1389( ) ;
            while ( RcdFound1389 != 0 )
            {
               init_level_properties1389( ) ;
               getByPrimaryKey17J1389( ) ;
               addRow17J1389( ) ;
               scanNext17J1389( ) ;
            }
            scanEnd17J1389( ) ;
            nBlankRcdCount1389 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B10245Jt_ultL = A10245Jt_ultL ;
         n10245Jt_ultL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
         standaloneNotModal17J1389( ) ;
         standaloneModal17J1389( ) ;
         sMode1389 = Gx_mode ;
         while ( nGXsfl_45_idx < nRC_GXsfl_45 )
         {
            bGXsfl_45_Refreshing = true ;
            readRow17J1389( ) ;
            edtavnRcdDeleted_1389_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1389_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1389_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1389_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtJt_ord_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "JT_ORD_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtJt_ord_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_ord_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPrdNum2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM2_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum2_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtJt_Reb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "JT_REB_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtJt_Reb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_Reb_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtJt_CatMn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "JT_CATMN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtJt_CatMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_CatMn_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            if ( ( nRcdExists_1389 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal17J1389( ) ;
            }
            sendRow17J1389( ) ;
            bGXsfl_45_Refreshing = false ;
         }
         Gx_mode = sMode1389 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A10245Jt_ultL = B10245Jt_ultL ;
         n10245Jt_ultL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1389 = (short)(5) ;
         nRcdExists_1389 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart17J1389( ) ;
            while ( RcdFound1389 != 0 )
            {
               sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_451389( ) ;
               init_level_properties1389( ) ;
               standaloneNotModal17J1389( ) ;
               getByPrimaryKey17J1389( ) ;
               standaloneModal17J1389( ) ;
               addRow17J1389( ) ;
               scanNext17J1389( ) ;
            }
            scanEnd17J1389( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1389 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_451389( ) ;
      initAll17J1389( ) ;
      init_level_properties1389( ) ;
      B10245Jt_ultL = A10245Jt_ultL ;
      n10245Jt_ultL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
      nRcdExists_1389 = (short)(0) ;
      nIsMod_1389 = (short)(0) ;
      nRcdDeleted_1389 = (short)(0) ;
      nBlankRcdCount1389 = (short)(nBlankRcdUsr1389+nBlankRcdCount1389) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1389 > 0 )
      {
         standaloneNotModal17J1389( ) ;
         standaloneModal17J1389( ) ;
         addRow17J1389( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtJt_ord_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1389 = (short)(nBlankRcdCount1389-1) ;
      }
      Gx_mode = sMode1389 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A10245Jt_ultL = B10245Jt_ultL ;
      n10245Jt_ultL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJOTA00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJOTA00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJOTA00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJOTA00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TJOTA00.htm");
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
      e1117J2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z10243Jt_codigo = (short)(localUtil.ctol( httpContext.cgiGet( "Z10243Jt_codigo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10244Jt_Desc = httpContext.cgiGet( "Z10244Jt_Desc") ;
            Z10245Jt_ultL = (short)(localUtil.ctol( httpContext.cgiGet( "Z10245Jt_ultL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O10245Jt_ultL = (short)(localUtil.ctol( httpContext.cgiGet( "O10245Jt_ultL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtJt_codigo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtJt_codigo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "JT_CODIGO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtJt_codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10243Jt_codigo = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10243Jt_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10243Jt_codigo), 4, 0));
            }
            else
            {
               A10243Jt_codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtJt_codigo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10243Jt_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10243Jt_codigo), 4, 0));
            }
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A10244Jt_Desc = httpContext.cgiGet( edtJt_Desc_Internalname) ;
            n10244Jt_Desc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10244Jt_Desc", A10244Jt_Desc);
            A10245Jt_ultL = (short)(localUtil.ctol( httpContext.cgiGet( edtJt_ultL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10245Jt_ultL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
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
               A10243Jt_codigo = (short)(GXutil.lval( httpContext.GetPar( "Jt_codigo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10243Jt_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10243Jt_codigo), 4, 0));
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
                        e1117J2 ();
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
            initAll17J1388( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1389_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1389_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      disableAttributes17J1388( ) ;
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

   public void confirm_17J0( )
   {
      beforeValidate17J1388( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls17J1388( ) ;
         }
         else
         {
            checkExtendedTable17J1388( ) ;
            if ( AnyError == 0 )
            {
               zm17J1388( 7) ;
            }
            closeExtendedTableCursors17J1388( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1388 = Gx_mode ;
         confirm_17J1389( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1388 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1388 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues17J0( ) ;
      }
   }

   public void confirm_17J1389( )
   {
      s10245Jt_ultL = O10245Jt_ultL ;
      n10245Jt_ultL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow17J1389( ) ;
         if ( ( nRcdExists_1389 != 0 ) || ( nIsMod_1389 != 0 ) )
         {
            getKey17J1389( ) ;
            if ( ( nRcdExists_1389 == 0 ) && ( nRcdDeleted_1389 == 0 ) )
            {
               if ( RcdFound1389 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate17J1389( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable17J1389( ) ;
                     if ( AnyError == 0 )
                     {
                        zm17J1389( 9) ;
                     }
                     closeExtendedTableCursors17J1389( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O10245Jt_ultL = A10245Jt_ultL ;
                     n10245Jt_ultL = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "JT_ORD_" + sGXsfl_45_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtJt_ord_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1389 != 0 )
               {
                  if ( nRcdDeleted_1389 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey17J1389( ) ;
                     load17J1389( ) ;
                     beforeValidate17J1389( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls17J1389( ) ;
                        O10245Jt_ultL = A10245Jt_ultL ;
                        n10245Jt_ultL = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1389 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate17J1389( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable17J1389( ) ;
                           if ( AnyError == 0 )
                           {
                              zm17J1389( 9) ;
                           }
                           closeExtendedTableCursors17J1389( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O10245Jt_ultL = A10245Jt_ultL ;
                           n10245Jt_ultL = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1389 == 0 )
                  {
                     GXCCtl = "JT_ORD_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtJt_ord_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1389_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1389, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtJt_ord_Internalname, GXutil.ltrim( localUtil.ntoc( A10246Jt_ord, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtPrdNum2_Internalname, GXutil.rtrim( A4693PrdNum2)) ;
         httpContext.changePostValue( edtJt_Reb_Internalname, GXutil.rtrim( A10247Jt_Reb)) ;
         httpContext.changePostValue( edtJt_CatMn_Internalname, GXutil.ltrim( localUtil.ntoc( A10248Jt_CatMn, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10246Jt_ord_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10246Jt_ord, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10247Jt_Reb_"+sGXsfl_45_idx, GXutil.rtrim( Z10247Jt_Reb)) ;
         httpContext.changePostValue( "ZT_"+"Z10248Jt_CatMn_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10248Jt_CatMn, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_45_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_1389_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1389, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1389_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1389, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1389_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1389, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1389 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1389_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1389_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "JT_ORD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_ord_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM2_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "JT_REB_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_Reb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "JT_CATMN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_CatMn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O10245Jt_ultL = s10245Jt_ultL ;
      n10245Jt_ultL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption17J0( )
   {
   }

   public void e1117J2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tjota00_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tjota00_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tjota00_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tjota00_impl.this.A396EmprCod = GXv_char2[0] ;
      tjota00_impl.this.AV11EmprNom = GXv_char3[0] ;
      tjota00_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm17J1388( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10244Jt_Desc = T017J6_A10244Jt_Desc[0] ;
            Z10245Jt_ultL = T017J6_A10245Jt_ultL[0] ;
         }
         else
         {
            Z10244Jt_Desc = A10244Jt_Desc ;
            Z10245Jt_ultL = A10245Jt_ultL ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z10243Jt_codigo = A10243Jt_codigo ;
         Z10244Jt_Desc = A10244Jt_Desc ;
         Z10245Jt_ultL = A10245Jt_ultL ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtJt_ultL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJt_ultL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_ultL_Enabled), 5, 0), true);
      AV33Pgmname = "TJOTA00" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtJt_ultL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJt_ultL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_ultL_Enabled), 5, 0), true);
      /* Using cursor T017J7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T017J7_A407EmprNom[0] ;
      n407EmprNom = T017J7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
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

   public void load17J1388( )
   {
      /* Using cursor T017J8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1388 = (short)(1) ;
         A407EmprNom = T017J8_A407EmprNom[0] ;
         n407EmprNom = T017J8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10244Jt_Desc = T017J8_A10244Jt_Desc[0] ;
         n10244Jt_Desc = T017J8_n10244Jt_Desc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10244Jt_Desc", A10244Jt_Desc);
         A10245Jt_ultL = T017J8_A10245Jt_ultL[0] ;
         n10245Jt_ultL = T017J8_n10245Jt_ultL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
         zm17J1388( -6) ;
      }
      pr_default.close(6);
      onLoadActions17J1388( ) ;
   }

   public void onLoadActions17J1388( )
   {
   }

   public void checkExtendedTable17J1388( )
   {
      nIsDirty_1388 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors17J1388( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey17J1388( )
   {
      /* Using cursor T017J9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1388 = (short)(1) ;
      }
      else
      {
         RcdFound1388 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T017J6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T017J6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm17J1388( 6) ;
         RcdFound1388 = (short)(1) ;
         A10243Jt_codigo = T017J6_A10243Jt_codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10243Jt_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10243Jt_codigo), 4, 0));
         A10244Jt_Desc = T017J6_A10244Jt_Desc[0] ;
         n10244Jt_Desc = T017J6_n10244Jt_Desc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10244Jt_Desc", A10244Jt_Desc);
         A10245Jt_ultL = T017J6_A10245Jt_ultL[0] ;
         n10245Jt_ultL = T017J6_n10245Jt_ultL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
         O10245Jt_ultL = A10245Jt_ultL ;
         n10245Jt_ultL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z10243Jt_codigo = A10243Jt_codigo ;
         sMode1388 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load17J1388( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1388 = (short)(0) ;
            initializeNonKey17J1388( ) ;
         }
         Gx_mode = sMode1388 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1388 = (short)(0) ;
         initializeNonKey17J1388( ) ;
         sMode1388 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1388 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey17J1388( ) ;
      if ( RcdFound1388 == 0 )
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
      RcdFound1388 = (short)(0) ;
      /* Using cursor T017J10 */
      pr_default.execute(8, new Object[] {Short.valueOf(A10243Jt_codigo), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T017J10_A10243Jt_codigo[0] < A10243Jt_codigo ) ) && ( GXutil.strcmp(T017J10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T017J10_A10243Jt_codigo[0] > A10243Jt_codigo ) ) && ( GXutil.strcmp(T017J10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10243Jt_codigo = T017J10_A10243Jt_codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10243Jt_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10243Jt_codigo), 4, 0));
            RcdFound1388 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1388 = (short)(0) ;
      /* Using cursor T017J11 */
      pr_default.execute(9, new Object[] {Short.valueOf(A10243Jt_codigo), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T017J11_A10243Jt_codigo[0] > A10243Jt_codigo ) ) && ( GXutil.strcmp(T017J11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T017J11_A10243Jt_codigo[0] < A10243Jt_codigo ) ) && ( GXutil.strcmp(T017J11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10243Jt_codigo = T017J11_A10243Jt_codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10243Jt_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10243Jt_codigo), 4, 0));
            RcdFound1388 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey17J1388( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A10245Jt_ultL = O10245Jt_ultL ;
         n10245Jt_ultL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
         GX_FocusControl = edtJt_codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert17J1388( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1388 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10243Jt_codigo != Z10243Jt_codigo ) )
            {
               A10243Jt_codigo = Z10243Jt_codigo ;
               httpContext.ajax_rsp_assign_attri("", false, "A10243Jt_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10243Jt_codigo), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A10245Jt_ultL = O10245Jt_ultL ;
               n10245Jt_ultL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtJt_codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A10245Jt_ultL = O10245Jt_ultL ;
               n10245Jt_ultL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
               update17J1388( ) ;
               GX_FocusControl = edtJt_codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10243Jt_codigo != Z10243Jt_codigo ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A10245Jt_ultL = O10245Jt_ultL ;
               n10245Jt_ultL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
               GX_FocusControl = edtJt_codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert17J1388( ) ;
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
                  A10245Jt_ultL = O10245Jt_ultL ;
                  n10245Jt_ultL = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
                  GX_FocusControl = edtJt_codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert17J1388( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10243Jt_codigo != Z10243Jt_codigo ) )
      {
         A10243Jt_codigo = Z10243Jt_codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A10243Jt_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10243Jt_codigo), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A10245Jt_ultL = O10245Jt_ultL ;
         n10245Jt_ultL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtJt_codigo_Internalname ;
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
      getKey17J1388( ) ;
      if ( RcdFound1388 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10243Jt_codigo != Z10243Jt_codigo ) )
         {
            A10243Jt_codigo = Z10243Jt_codigo ;
            httpContext.ajax_rsp_assign_attri("", false, "A10243Jt_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10243Jt_codigo), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10243Jt_codigo != Z10243Jt_codigo ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tjota00");
      GX_FocusControl = edtJt_Desc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_17J0( ) ;
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
      if ( RcdFound1388 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtJt_Desc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart17J1388( ) ;
      if ( RcdFound1388 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtJt_Desc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd17J1388( ) ;
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
      if ( RcdFound1388 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtJt_Desc_Internalname ;
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
      if ( RcdFound1388 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtJt_Desc_Internalname ;
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
      scanStart17J1388( ) ;
      if ( RcdFound1388 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1388 != 0 )
         {
            scanNext17J1388( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtJt_Desc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd17J1388( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency17J1388( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T017J5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPJOTA00"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z10244Jt_Desc, T017J5_A10244Jt_Desc[0]) != 0 ) || ( Z10245Jt_ultL != T017J5_A10245Jt_ultL[0] ) )
         {
            if ( GXutil.strcmp(Z10244Jt_Desc, T017J5_A10244Jt_Desc[0]) != 0 )
            {
               GXutil.writeLogln("tjota00:[seudo value changed for attri]"+"Jt_Desc");
               GXutil.writeLogRaw("Old: ",Z10244Jt_Desc);
               GXutil.writeLogRaw("Current: ",T017J5_A10244Jt_Desc[0]);
            }
            if ( Z10245Jt_ultL != T017J5_A10245Jt_ultL[0] )
            {
               GXutil.writeLogln("tjota00:[seudo value changed for attri]"+"Jt_ultL");
               GXutil.writeLogRaw("Old: ",Z10245Jt_ultL);
               GXutil.writeLogRaw("Current: ",T017J5_A10245Jt_ultL[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPJOTA00"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert17J1388( )
   {
      beforeValidate17J1388( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17J1388( ) ;
      }
      if ( AnyError == 0 )
      {
         zm17J1388( 0) ;
         checkOptimisticConcurrency17J1388( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17J1388( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert17J1388( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017J12 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A10243Jt_codigo), Boolean.valueOf(n10244Jt_Desc), A10244Jt_Desc, Boolean.valueOf(n10245Jt_ultL), Short.valueOf(A10245Jt_ultL), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOTA00");
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
                        processLevel17J1388( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption17J0( ) ;
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
            load17J1388( ) ;
         }
         endLevel17J1388( ) ;
      }
      closeExtendedTableCursors17J1388( ) ;
   }

   public void update17J1388( )
   {
      beforeValidate17J1388( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17J1388( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17J1388( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17J1388( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate17J1388( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017J13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n10244Jt_Desc), A10244Jt_Desc, Boolean.valueOf(n10245Jt_ultL), Short.valueOf(A10245Jt_ultL), A396EmprCod, Short.valueOf(A10243Jt_codigo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOTA00");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPJOTA00"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate17J1388( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel17J1388( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption17J0( ) ;
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
         endLevel17J1388( ) ;
      }
      closeExtendedTableCursors17J1388( ) ;
   }

   public void deferredUpdate17J1388( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate17J1388( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17J1388( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls17J1388( ) ;
         afterConfirm17J1388( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete17J1388( ) ;
            if ( AnyError == 0 )
            {
               A10245Jt_ultL = O10245Jt_ultL ;
               n10245Jt_ultL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
               scanStart17J1389( ) ;
               while ( RcdFound1389 != 0 )
               {
                  getByPrimaryKey17J1389( ) ;
                  delete17J1389( ) ;
                  scanNext17J1389( ) ;
                  O10245Jt_ultL = A10245Jt_ultL ;
                  n10245Jt_ultL = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
               }
               scanEnd17J1389( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017J14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOTA00");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1388 == 0 )
                        {
                           initAll17J1388( ) ;
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
                        resetCaption17J0( ) ;
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
      sMode1388 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel17J1388( ) ;
      Gx_mode = sMode1388 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls17J1388( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T017J15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "JOTA02", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void processNestedLevel17J1389( )
   {
      s10245Jt_ultL = O10245Jt_ultL ;
      n10245Jt_ultL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow17J1389( ) ;
         if ( ( nRcdExists_1389 != 0 ) || ( nIsMod_1389 != 0 ) )
         {
            standaloneNotModal17J1389( ) ;
            getKey17J1389( ) ;
            if ( ( nRcdExists_1389 == 0 ) && ( nRcdDeleted_1389 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert17J1389( ) ;
            }
            else
            {
               if ( RcdFound1389 != 0 )
               {
                  if ( ( nRcdDeleted_1389 != 0 ) && ( nRcdExists_1389 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete17J1389( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1389 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update17J1389( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1389 == 0 )
                  {
                     GXCCtl = "JT_ORD_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtJt_ord_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O10245Jt_ultL = A10245Jt_ultL ;
            n10245Jt_ultL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1389_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1389, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtJt_ord_Internalname, GXutil.ltrim( localUtil.ntoc( A10246Jt_ord, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtPrdNum2_Internalname, GXutil.rtrim( A4693PrdNum2)) ;
         httpContext.changePostValue( edtJt_Reb_Internalname, GXutil.rtrim( A10247Jt_Reb)) ;
         httpContext.changePostValue( edtJt_CatMn_Internalname, GXutil.ltrim( localUtil.ntoc( A10248Jt_CatMn, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10246Jt_ord_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10246Jt_ord, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10247Jt_Reb_"+sGXsfl_45_idx, GXutil.rtrim( Z10247Jt_Reb)) ;
         httpContext.changePostValue( "ZT_"+"Z10248Jt_CatMn_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10248Jt_CatMn, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_45_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_1389_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1389, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1389_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1389, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1389_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1389, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1389 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1389_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1389_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "JT_ORD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_ord_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM2_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "JT_REB_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_Reb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "JT_CATMN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_CatMn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll17J1389( ) ;
      if ( AnyError != 0 )
      {
         O10245Jt_ultL = s10245Jt_ultL ;
         n10245Jt_ultL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
      }
      nRcdExists_1389 = (short)(0) ;
      nIsMod_1389 = (short)(0) ;
      nRcdDeleted_1389 = (short)(0) ;
   }

   public void processLevel17J1388( )
   {
      /* Save parent mode. */
      sMode1388 = Gx_mode ;
      processNestedLevel17J1389( ) ;
      if ( AnyError != 0 )
      {
         O10245Jt_ultL = s10245Jt_ultL ;
         n10245Jt_ultL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1388 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T017J16 */
      pr_default.execute(14, new Object[] {Boolean.valueOf(n10245Jt_ultL), Short.valueOf(A10245Jt_ultL), A396EmprCod, Short.valueOf(A10243Jt_codigo)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOTA00");
   }

   public void endLevel17J1388( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeComplete17J1388( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tjota00");
         if ( AnyError == 0 )
         {
            confirmValues17J0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tjota00");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart17J1388( )
   {
      /* Scan By routine */
      /* Using cursor T017J17 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      RcdFound1388 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1388 = (short)(1) ;
         A10243Jt_codigo = T017J17_A10243Jt_codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10243Jt_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10243Jt_codigo), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext17J1388( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1388 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1388 = (short)(1) ;
         A10243Jt_codigo = T017J17_A10243Jt_codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10243Jt_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10243Jt_codigo), 4, 0));
      }
   }

   public void scanEnd17J1388( )
   {
      pr_default.close(15);
   }

   public void afterConfirm17J1388( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert17J1388( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate17J1388( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete17J1388( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete17J1388( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate17J1388( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes17J1388( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtJt_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJt_codigo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_codigo_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtJt_Desc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJt_Desc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_Desc_Enabled), 5, 0), true);
      edtJt_ultL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJt_ultL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_ultL_Enabled), 5, 0), true);
   }

   public void zm17J1389( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10247Jt_Reb = T017J3_A10247Jt_Reb[0] ;
            Z10248Jt_CatMn = T017J3_A10248Jt_CatMn[0] ;
            Z719PrdNum = T017J3_A719PrdNum[0] ;
         }
         else
         {
            Z10247Jt_Reb = A10247Jt_Reb ;
            Z10248Jt_CatMn = A10248Jt_CatMn ;
            Z719PrdNum = A719PrdNum ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z10243Jt_codigo = A10243Jt_codigo ;
         Z10246Jt_ord = A10246Jt_ord ;
         Z10247Jt_Reb = A10247Jt_Reb ;
         Z10248Jt_CatMn = A10248Jt_CatMn ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z718PrdNom = A718PrdNom ;
         Z4693PrdNum2 = A4693PrdNum2 ;
      }
   }

   public void standaloneNotModal17J1389( )
   {
      edtJt_ultL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJt_ultL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_ultL_Enabled), 5, 0), true);
      edtJt_ultL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJt_ultL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_ultL_Enabled), 5, 0), true);
   }

   public void standaloneModal17J1389( )
   {
      if ( isIns( )  )
      {
         A10245Jt_ultL = (short)(O10245Jt_ultL+1) ;
         n10245Jt_ultL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A10246Jt_ord = A10245Jt_ultL ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtJt_ord_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtJt_ord_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_ord_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtJt_ord_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtJt_ord_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_ord_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
   }

   public void load17J1389( )
   {
      /* Using cursor T017J18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo), Short.valueOf(A10246Jt_ord)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1389 = (short)(1) ;
         A718PrdNom = T017J18_A718PrdNom[0] ;
         A4693PrdNum2 = T017J18_A4693PrdNum2[0] ;
         A10247Jt_Reb = T017J18_A10247Jt_Reb[0] ;
         n10247Jt_Reb = T017J18_n10247Jt_Reb[0] ;
         A10248Jt_CatMn = T017J18_A10248Jt_CatMn[0] ;
         n10248Jt_CatMn = T017J18_n10248Jt_CatMn[0] ;
         A719PrdNum = T017J18_A719PrdNum[0] ;
         n719PrdNum = T017J18_n719PrdNum[0] ;
         zm17J1389( -8) ;
      }
      pr_default.close(16);
      onLoadActions17J1389( ) ;
   }

   public void onLoadActions17J1389( )
   {
   }

   public void checkExtendedTable17J1389( )
   {
      nIsDirty_1389 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal17J1389( ) ;
      /* Using cursor T017J4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T017J4_A718PrdNom[0] ;
      A4693PrdNum2 = T017J4_A4693PrdNum2[0] ;
      pr_default.close(2);
      if ( ! ( ( GXutil.strcmp(A10247Jt_Reb, "S") == 0 ) || ( GXutil.strcmp(A10247Jt_Reb, "N") == 0 ) ) )
      {
         GXCCtl = "JT_REB_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Rebajar?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtJt_Reb_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors17J1389( )
   {
      pr_default.close(2);
   }

   public void enableDisable17J1389( )
   {
   }

   public void gxload_9( String A396EmprCod ,
                         String A719PrdNum )
   {
      /* Using cursor T017J19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(17) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T017J19_A718PrdNom[0] ;
      A4693PrdNum2 = T017J19_A4693PrdNum2[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4693PrdNum2))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void getKey17J1389( )
   {
      /* Using cursor T017J20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo), Short.valueOf(A10246Jt_ord)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1389 = (short)(1) ;
      }
      else
      {
         RcdFound1389 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey17J1389( )
   {
      /* Using cursor T017J3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo), Short.valueOf(A10246Jt_ord)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T017J3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm17J1389( 8) ;
         RcdFound1389 = (short)(1) ;
         initializeNonKey17J1389( ) ;
         A10246Jt_ord = T017J3_A10246Jt_ord[0] ;
         A10247Jt_Reb = T017J3_A10247Jt_Reb[0] ;
         n10247Jt_Reb = T017J3_n10247Jt_Reb[0] ;
         A10248Jt_CatMn = T017J3_A10248Jt_CatMn[0] ;
         n10248Jt_CatMn = T017J3_n10248Jt_CatMn[0] ;
         A719PrdNum = T017J3_A719PrdNum[0] ;
         n719PrdNum = T017J3_n719PrdNum[0] ;
         Z396EmprCod = A396EmprCod ;
         Z10243Jt_codigo = A10243Jt_codigo ;
         Z10246Jt_ord = A10246Jt_ord ;
         sMode1389 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal17J1389( ) ;
         load17J1389( ) ;
         Gx_mode = sMode1389 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1389 = (short)(0) ;
         initializeNonKey17J1389( ) ;
         sMode1389 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal17J1389( ) ;
         Gx_mode = sMode1389 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes17J1389( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency17J1389( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T017J2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo), Short.valueOf(A10246Jt_ord)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPJOTA01"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10247Jt_Reb, T017J2_A10247Jt_Reb[0]) != 0 ) || ( DecimalUtil.compareTo(Z10248Jt_CatMn, T017J2_A10248Jt_CatMn[0]) != 0 ) || ( GXutil.strcmp(Z719PrdNum, T017J2_A719PrdNum[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z10247Jt_Reb, T017J2_A10247Jt_Reb[0]) != 0 )
            {
               GXutil.writeLogln("tjota00:[seudo value changed for attri]"+"Jt_Reb");
               GXutil.writeLogRaw("Old: ",Z10247Jt_Reb);
               GXutil.writeLogRaw("Current: ",T017J2_A10247Jt_Reb[0]);
            }
            if ( DecimalUtil.compareTo(Z10248Jt_CatMn, T017J2_A10248Jt_CatMn[0]) != 0 )
            {
               GXutil.writeLogln("tjota00:[seudo value changed for attri]"+"Jt_CatMn");
               GXutil.writeLogRaw("Old: ",Z10248Jt_CatMn);
               GXutil.writeLogRaw("Current: ",T017J2_A10248Jt_CatMn[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T017J2_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("tjota00:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T017J2_A719PrdNum[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPJOTA01"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert17J1389( )
   {
      beforeValidate17J1389( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17J1389( ) ;
      }
      if ( AnyError == 0 )
      {
         zm17J1389( 0) ;
         checkOptimisticConcurrency17J1389( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17J1389( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert17J1389( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017J21 */
                  pr_default.execute(19, new Object[] {Short.valueOf(A10243Jt_codigo), Short.valueOf(A10246Jt_ord), Boolean.valueOf(n10247Jt_Reb), A10247Jt_Reb, Boolean.valueOf(n10248Jt_CatMn), A10248Jt_CatMn, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOTA01");
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
            load17J1389( ) ;
         }
         endLevel17J1389( ) ;
      }
      closeExtendedTableCursors17J1389( ) ;
   }

   public void update17J1389( )
   {
      beforeValidate17J1389( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17J1389( ) ;
      }
      if ( ( nIsMod_1389 != 0 ) || ( nIsDirty_1389 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency17J1389( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm17J1389( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate17J1389( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T017J22 */
                     pr_default.execute(20, new Object[] {Boolean.valueOf(n10247Jt_Reb), A10247Jt_Reb, Boolean.valueOf(n10248Jt_CatMn), A10248Jt_CatMn, Boolean.valueOf(n719PrdNum), A719PrdNum, A396EmprCod, Short.valueOf(A10243Jt_codigo), Short.valueOf(A10246Jt_ord)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOTA01");
                     if ( (pr_default.getStatus(20) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPJOTA01"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate17J1389( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey17J1389( ) ;
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
            endLevel17J1389( ) ;
         }
      }
      closeExtendedTableCursors17J1389( ) ;
   }

   public void deferredUpdate17J1389( )
   {
   }

   public void delete17J1389( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate17J1389( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17J1389( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls17J1389( ) ;
         afterConfirm17J1389( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete17J1389( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T017J23 */
               pr_default.execute(21, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo), Short.valueOf(A10246Jt_ord)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOTA01");
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
      sMode1389 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel17J1389( ) ;
      Gx_mode = sMode1389 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls17J1389( )
   {
      standaloneModal17J1389( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T017J24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         A718PrdNom = T017J24_A718PrdNom[0] ;
         A4693PrdNum2 = T017J24_A4693PrdNum2[0] ;
         pr_default.close(22);
      }
   }

   public void endLevel17J1389( )
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

   public void scanStart17J1389( )
   {
      /* Scan By routine */
      /* Using cursor T017J25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo)});
      RcdFound1389 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1389 = (short)(1) ;
         A10246Jt_ord = T017J25_A10246Jt_ord[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext17J1389( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound1389 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1389 = (short)(1) ;
         A10246Jt_ord = T017J25_A10246Jt_ord[0] ;
      }
   }

   public void scanEnd17J1389( )
   {
      pr_default.close(23);
   }

   public void afterConfirm17J1389( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert17J1389( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate17J1389( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete17J1389( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete17J1389( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate17J1389( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes17J1389( )
   {
      edtJt_ord_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJt_ord_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_ord_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdNum2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum2_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtJt_Reb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJt_Reb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_Reb_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtJt_CatMn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJt_CatMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_CatMn_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void send_integrity_lvl_hashes17J1389( )
   {
   }

   public void send_integrity_lvl_hashes17J1388( )
   {
   }

   public void subsflControlProps_451389( )
   {
      edtavnRcdDeleted_1389_Internalname = "vNRCDDELETED_1389_"+sGXsfl_45_idx ;
      edtJt_ord_Internalname = "JT_ORD_"+sGXsfl_45_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_45_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_45_idx ;
      edtPrdNum2_Internalname = "PRDNUM2_"+sGXsfl_45_idx ;
      edtJt_Reb_Internalname = "JT_REB_"+sGXsfl_45_idx ;
      edtJt_CatMn_Internalname = "JT_CATMN_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_451389( )
   {
      edtavnRcdDeleted_1389_Internalname = "vNRCDDELETED_1389_"+sGXsfl_45_fel_idx ;
      edtJt_ord_Internalname = "JT_ORD_"+sGXsfl_45_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_45_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_45_fel_idx ;
      edtPrdNum2_Internalname = "PRDNUM2_"+sGXsfl_45_fel_idx ;
      edtJt_Reb_Internalname = "JT_REB_"+sGXsfl_45_fel_idx ;
      edtJt_CatMn_Internalname = "JT_CATMN_"+sGXsfl_45_fel_idx ;
   }

   public void addRow17J1389( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451389( ) ;
      sendRow17J1389( ) ;
   }

   public void sendRow17J1389( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1389_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1389_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1389, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1389_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1389), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1389), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1389_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1389_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1389_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtJt_ord_Internalname,GXutil.ltrim( localUtil.ntoc( A10246Jt_ord, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10246Jt_ord), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtJt_ord_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtJt_ord_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1389_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum2_Internalname,GXutil.rtrim( A4693PrdNum2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1389_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtJt_Reb_Internalname,GXutil.rtrim( A10247Jt_Reb),GXutil.rtrim( localUtil.format( A10247Jt_Reb, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtJt_Reb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtJt_Reb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1389_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtJt_CatMn_Internalname,GXutil.ltrim( localUtil.ntoc( A10248Jt_CatMn, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtJt_CatMn_Enabled!=0) ? localUtil.format( A10248Jt_CatMn, "ZZZZZZ9.9999") : localUtil.format( A10248Jt_CatMn, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtJt_CatMn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtJt_CatMn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes17J1389( ) ;
      GXCCtl = "Z10246Jt_ord_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10246Jt_ord, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10247Jt_Reb_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10247Jt_Reb));
      GXCCtl = "Z10248Jt_CatMn_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10248Jt_CatMn, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z719PrdNum_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "nRcdDeleted_1389_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1389, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1389_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1389, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1389_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1389, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1389_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1389_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "JT_ORD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_ord_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM2_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "JT_REB_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_Reb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "JT_CATMN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_CatMn_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow17J1389( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451389( ) ;
      edtavnRcdDeleted_1389_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1389_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtJt_ord_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "JT_ORD_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM2_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtJt_Reb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "JT_REB_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtJt_CatMn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "JT_CATMN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1389_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1389_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1389");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1389_Internalname ;
         wbErr = true ;
         nRcdDeleted_1389 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1389 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1389_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtJt_ord_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtJt_ord_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "JT_ORD_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtJt_ord_Internalname ;
         wbErr = true ;
         A10246Jt_ord = (short)(0) ;
      }
      else
      {
         A10246Jt_ord = (short)(localUtil.ctol( httpContext.cgiGet( edtJt_ord_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      n719PrdNum = false ;
      A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
      A4693PrdNum2 = httpContext.cgiGet( edtPrdNum2_Internalname) ;
      A10247Jt_Reb = GXutil.upper( httpContext.cgiGet( edtJt_Reb_Internalname)) ;
      n10247Jt_Reb = false ;
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtJt_CatMn_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtJt_CatMn_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
      {
         GXCCtl = "JT_CATMN_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtJt_CatMn_Internalname ;
         wbErr = true ;
         A10248Jt_CatMn = DecimalUtil.ZERO ;
         n10248Jt_CatMn = false ;
      }
      else
      {
         A10248Jt_CatMn = localUtil.ctond( httpContext.cgiGet( edtJt_CatMn_Internalname)) ;
         n10248Jt_CatMn = false ;
      }
      GXCCtl = "Z10246Jt_ord_" + sGXsfl_45_idx ;
      Z10246Jt_ord = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10247Jt_Reb_" + sGXsfl_45_idx ;
      Z10247Jt_Reb = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10248Jt_CatMn_" + sGXsfl_45_idx ;
      Z10248Jt_CatMn = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_45_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1389_" + sGXsfl_45_idx ;
      nRcdDeleted_1389 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1389_" + sGXsfl_45_idx ;
      nRcdExists_1389 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1389_" + sGXsfl_45_idx ;
      nIsMod_1389 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtJt_ord_Enabled = edtJt_ord_Enabled ;
   }

   public void confirmValues17J0( )
   {
      nGXsfl_45_idx = 0 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451389( ) ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451389( ) ;
         httpContext.changePostValue( "Z10246Jt_ord_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10246Jt_ord_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10246Jt_ord_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10247Jt_Reb_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10247Jt_Reb_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10247Jt_Reb_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10248Jt_CatMn_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10248Jt_CatMn_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10248Jt_CatMn_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_45_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tjota00", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10243Jt_codigo", GXutil.ltrim( localUtil.ntoc( Z10243Jt_codigo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10244Jt_Desc", GXutil.rtrim( Z10244Jt_Desc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10245Jt_ultL", GXutil.ltrim( localUtil.ntoc( Z10245Jt_ultL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O10245Jt_ultL", GXutil.ltrim( localUtil.ntoc( O10245Jt_ultL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nGXsfl_45_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tjota00", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TJOTA00" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TABLA CODIGOS DEPOSITOS", "") ;
   }

   public void initializeNonKey17J1388( )
   {
      A10244Jt_Desc = "" ;
      n10244Jt_Desc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10244Jt_Desc", A10244Jt_Desc);
      A10245Jt_ultL = (short)(0) ;
      n10245Jt_ultL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
      O10245Jt_ultL = A10245Jt_ultL ;
      n10245Jt_ultL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
      Z10244Jt_Desc = "" ;
      Z10245Jt_ultL = (short)(0) ;
   }

   public void initAll17J1388( )
   {
      A10243Jt_codigo = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10243Jt_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10243Jt_codigo), 4, 0));
      initializeNonKey17J1388( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey17J1389( )
   {
      A719PrdNum = "" ;
      n719PrdNum = false ;
      A718PrdNom = "" ;
      A4693PrdNum2 = "" ;
      A10247Jt_Reb = "" ;
      n10247Jt_Reb = false ;
      A10248Jt_CatMn = DecimalUtil.ZERO ;
      n10248Jt_CatMn = false ;
      Z10247Jt_Reb = "" ;
      Z10248Jt_CatMn = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
   }

   public void initAll17J1389( )
   {
      A10246Jt_ord = (short)(0) ;
      initializeNonKey17J1389( ) ;
   }

   public void standaloneModalInsert17J1389( )
   {
      A10245Jt_ultL = i10245Jt_ultL ;
      n10245Jt_ultL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10245Jt_ultL), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241551532", true, true);
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
      httpContext.AddJavascriptSource("tjota00.js", "?20268241551533", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1389( )
   {
      edtJt_ord_Enabled = defedtJt_ord_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtJt_ord_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_ord_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1389, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1389_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10246Jt_ord, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_ord_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4693PrdNum2));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10247Jt_Reb));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_Reb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10248Jt_CatMn, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_CatMn_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtJt_codigo_Internalname = "JT_CODIGO" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtJt_Desc_Internalname = "JT_DESC" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtJt_ultL_Internalname = "JT_ULTL" ;
      edtavnRcdDeleted_1389_Internalname = "vNRCDDELETED_1389" ;
      edtJt_ord_Internalname = "JT_ORD" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtPrdNum2_Internalname = "PRDNUM2" ;
      edtJt_Reb_Internalname = "JT_REB" ;
      edtJt_CatMn_Internalname = "JT_CATMN" ;
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
      Form.setCaption( httpContext.getMessage( "TABLA CODIGOS DEPOSITOS", "") );
      edtJt_CatMn_Jsonclick = "" ;
      edtJt_Reb_Jsonclick = "" ;
      edtPrdNum2_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtJt_ord_Jsonclick = "" ;
      edtavnRcdDeleted_1389_Jsonclick = "" ;
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
      edtJt_CatMn_Enabled = 1 ;
      edtJt_Reb_Enabled = 1 ;
      edtPrdNum2_Enabled = 0 ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Enabled = 1 ;
      edtJt_ord_Enabled = 1 ;
      edtavnRcdDeleted_1389_Enabled = 1 ;
      edtJt_ultL_Jsonclick = "" ;
      edtJt_ultL_Backcolor = (int)(0xFFFFFF) ;
      edtJt_ultL_Enabled = 0 ;
      edtJt_Desc_Jsonclick = "" ;
      edtJt_Desc_Backcolor = (int)(0xFFFFFF) ;
      edtJt_Desc_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtJt_codigo_Jsonclick = "" ;
      edtJt_codigo_Backcolor = (int)(0xFFFFFF) ;
      edtJt_codigo_Enabled = 1 ;
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
      subsflControlProps_451389( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal17J1389( ) ;
         standaloneModal17J1389( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow17J1389( ) ;
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451389( ) ;
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
      /* Using cursor T017J26 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T017J26_A407EmprNom[0] ;
      n407EmprNom = T017J26_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(24);
      GX_FocusControl = edtJt_Desc_Internalname ;
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

   public void valid_Jt_codigo( )
   {
      n10245Jt_ultL = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10244Jt_Desc", GXutil.rtrim( A10244Jt_Desc));
      httpContext.ajax_rsp_assign_attri("", false, "A10245Jt_ultL", GXutil.ltrim( localUtil.ntoc( A10245Jt_ultL, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10243Jt_codigo", GXutil.ltrim( localUtil.ntoc( Z10243Jt_codigo, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10244Jt_Desc", GXutil.rtrim( Z10244Jt_Desc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10245Jt_ultL", GXutil.ltrim( localUtil.ntoc( Z10245Jt_ultL, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O10245Jt_ultL", GXutil.ltrim( localUtil.ntoc( O10245Jt_ultL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Prdnum( )
   {
      n719PrdNum = false ;
      /* Using cursor T017J24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A718PrdNom = T017J24_A718PrdNom[0] ;
      A4693PrdNum2 = T017J24_A4693PrdNum2[0] ;
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4693PrdNum2", GXutil.rtrim( A4693PrdNum2));
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
      setEventMetadata("VALID_JT_CODIGO","{handler:'valid_Jt_codigo',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A10245Jt_ultL',fld:'JT_ULTL',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10243Jt_codigo',fld:'JT_CODIGO',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_JT_CODIGO",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A10244Jt_Desc',fld:'JT_DESC',pic:''},{av:'A10245Jt_ultL',fld:'JT_ULTL',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z10243Jt_codigo'},{av:'Z407EmprNom'},{av:'Z10244Jt_Desc'},{av:'Z10245Jt_ultL'},{av:'O10245Jt_ultL'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_JT_ULTL","{handler:'valid_Jt_ultl',iparms:[]");
      setEventMetadata("VALID_JT_ULTL",",oparms:[]}");
      setEventMetadata("VALID_JT_ORD","{handler:'valid_Jt_ord',iparms:[]");
      setEventMetadata("VALID_JT_ORD",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A4693PrdNum2',fld:'PRDNUM2',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A4693PrdNum2',fld:'PRDNUM2',pic:''}]}");
      setEventMetadata("VALID_JT_REB","{handler:'valid_Jt_reb',iparms:[]");
      setEventMetadata("VALID_JT_REB",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Jt_catmn',iparms:[]");
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
      pr_default.close(24);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z10244Jt_Desc = "" ;
      Z10247Jt_Reb = "" ;
      Z10248Jt_CatMn = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock4_Jsonclick = "" ;
      A10244Jt_Desc = "" ;
      lblTextblock5_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1389 = "" ;
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
      sMode1388 = "" ;
      GXCCtl = "" ;
      A718PrdNom = "" ;
      A4693PrdNum2 = "" ;
      A10247Jt_Reb = "" ;
      A10248Jt_CatMn = DecimalUtil.ZERO ;
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
      Z407EmprNom = "" ;
      T017J7_A407EmprNom = new String[] {""} ;
      T017J7_n407EmprNom = new boolean[] {false} ;
      T017J8_A10243Jt_codigo = new short[1] ;
      T017J8_A407EmprNom = new String[] {""} ;
      T017J8_n407EmprNom = new boolean[] {false} ;
      T017J8_A10244Jt_Desc = new String[] {""} ;
      T017J8_n10244Jt_Desc = new boolean[] {false} ;
      T017J8_A10245Jt_ultL = new short[1] ;
      T017J8_n10245Jt_ultL = new boolean[] {false} ;
      T017J8_A396EmprCod = new String[] {""} ;
      T017J9_A396EmprCod = new String[] {""} ;
      T017J9_A10243Jt_codigo = new short[1] ;
      T017J6_A10243Jt_codigo = new short[1] ;
      T017J6_A10244Jt_Desc = new String[] {""} ;
      T017J6_n10244Jt_Desc = new boolean[] {false} ;
      T017J6_A10245Jt_ultL = new short[1] ;
      T017J6_n10245Jt_ultL = new boolean[] {false} ;
      T017J6_A396EmprCod = new String[] {""} ;
      T017J10_A396EmprCod = new String[] {""} ;
      T017J10_A10243Jt_codigo = new short[1] ;
      T017J11_A396EmprCod = new String[] {""} ;
      T017J11_A10243Jt_codigo = new short[1] ;
      T017J5_A10243Jt_codigo = new short[1] ;
      T017J5_A10244Jt_Desc = new String[] {""} ;
      T017J5_n10244Jt_Desc = new boolean[] {false} ;
      T017J5_A10245Jt_ultL = new short[1] ;
      T017J5_n10245Jt_ultL = new boolean[] {false} ;
      T017J5_A396EmprCod = new String[] {""} ;
      T017J15_A396EmprCod = new String[] {""} ;
      T017J15_A10243Jt_codigo = new short[1] ;
      T017J15_A10249Jt_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017J17_A396EmprCod = new String[] {""} ;
      T017J17_A10243Jt_codigo = new short[1] ;
      Z718PrdNom = "" ;
      Z4693PrdNum2 = "" ;
      T017J18_A10243Jt_codigo = new short[1] ;
      T017J18_A10246Jt_ord = new short[1] ;
      T017J18_A718PrdNom = new String[] {""} ;
      T017J18_A4693PrdNum2 = new String[] {""} ;
      T017J18_A10247Jt_Reb = new String[] {""} ;
      T017J18_n10247Jt_Reb = new boolean[] {false} ;
      T017J18_A10248Jt_CatMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017J18_n10248Jt_CatMn = new boolean[] {false} ;
      T017J18_A396EmprCod = new String[] {""} ;
      T017J18_A719PrdNum = new String[] {""} ;
      T017J18_n719PrdNum = new boolean[] {false} ;
      T017J4_A718PrdNom = new String[] {""} ;
      T017J4_A4693PrdNum2 = new String[] {""} ;
      T017J19_A718PrdNom = new String[] {""} ;
      T017J19_A4693PrdNum2 = new String[] {""} ;
      T017J20_A396EmprCod = new String[] {""} ;
      T017J20_A10243Jt_codigo = new short[1] ;
      T017J20_A10246Jt_ord = new short[1] ;
      T017J3_A10243Jt_codigo = new short[1] ;
      T017J3_A10246Jt_ord = new short[1] ;
      T017J3_A10247Jt_Reb = new String[] {""} ;
      T017J3_n10247Jt_Reb = new boolean[] {false} ;
      T017J3_A10248Jt_CatMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017J3_n10248Jt_CatMn = new boolean[] {false} ;
      T017J3_A396EmprCod = new String[] {""} ;
      T017J3_A719PrdNum = new String[] {""} ;
      T017J3_n719PrdNum = new boolean[] {false} ;
      T017J2_A10243Jt_codigo = new short[1] ;
      T017J2_A10246Jt_ord = new short[1] ;
      T017J2_A10247Jt_Reb = new String[] {""} ;
      T017J2_n10247Jt_Reb = new boolean[] {false} ;
      T017J2_A10248Jt_CatMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017J2_n10248Jt_CatMn = new boolean[] {false} ;
      T017J2_A396EmprCod = new String[] {""} ;
      T017J2_A719PrdNum = new String[] {""} ;
      T017J2_n719PrdNum = new boolean[] {false} ;
      T017J24_A718PrdNom = new String[] {""} ;
      T017J24_A4693PrdNum2 = new String[] {""} ;
      T017J25_A396EmprCod = new String[] {""} ;
      T017J25_A10243Jt_codigo = new short[1] ;
      T017J25_A10246Jt_ord = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T017J26_A407EmprNom = new String[] {""} ;
      T017J26_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ10244Jt_Desc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tjota00__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tjota00__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tjota00__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tjota00__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tjota00__default(),
         new Object[] {
             new Object[] {
            T017J2_A10243Jt_codigo, T017J2_A10246Jt_ord, T017J2_A10247Jt_Reb, T017J2_n10247Jt_Reb, T017J2_A10248Jt_CatMn, T017J2_n10248Jt_CatMn, T017J2_A396EmprCod, T017J2_A719PrdNum, T017J2_n719PrdNum
            }
            , new Object[] {
            T017J3_A10243Jt_codigo, T017J3_A10246Jt_ord, T017J3_A10247Jt_Reb, T017J3_n10247Jt_Reb, T017J3_A10248Jt_CatMn, T017J3_n10248Jt_CatMn, T017J3_A396EmprCod, T017J3_A719PrdNum, T017J3_n719PrdNum
            }
            , new Object[] {
            T017J4_A718PrdNom, T017J4_A4693PrdNum2
            }
            , new Object[] {
            T017J5_A10243Jt_codigo, T017J5_A10244Jt_Desc, T017J5_n10244Jt_Desc, T017J5_A10245Jt_ultL, T017J5_n10245Jt_ultL, T017J5_A396EmprCod
            }
            , new Object[] {
            T017J6_A10243Jt_codigo, T017J6_A10244Jt_Desc, T017J6_n10244Jt_Desc, T017J6_A10245Jt_ultL, T017J6_n10245Jt_ultL, T017J6_A396EmprCod
            }
            , new Object[] {
            T017J7_A407EmprNom, T017J7_n407EmprNom
            }
            , new Object[] {
            T017J8_A10243Jt_codigo, T017J8_A407EmprNom, T017J8_n407EmprNom, T017J8_A10244Jt_Desc, T017J8_n10244Jt_Desc, T017J8_A10245Jt_ultL, T017J8_n10245Jt_ultL, T017J8_A396EmprCod
            }
            , new Object[] {
            T017J9_A396EmprCod, T017J9_A10243Jt_codigo
            }
            , new Object[] {
            T017J10_A396EmprCod, T017J10_A10243Jt_codigo
            }
            , new Object[] {
            T017J11_A396EmprCod, T017J11_A10243Jt_codigo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017J15_A396EmprCod, T017J15_A10243Jt_codigo, T017J15_A10249Jt_Dia
            }
            , new Object[] {
            }
            , new Object[] {
            T017J17_A396EmprCod, T017J17_A10243Jt_codigo
            }
            , new Object[] {
            T017J18_A10243Jt_codigo, T017J18_A10246Jt_ord, T017J18_A718PrdNom, T017J18_A4693PrdNum2, T017J18_A10247Jt_Reb, T017J18_n10247Jt_Reb, T017J18_A10248Jt_CatMn, T017J18_n10248Jt_CatMn, T017J18_A396EmprCod, T017J18_A719PrdNum,
            T017J18_n719PrdNum
            }
            , new Object[] {
            T017J19_A718PrdNom, T017J19_A4693PrdNum2
            }
            , new Object[] {
            T017J20_A396EmprCod, T017J20_A10243Jt_codigo, T017J20_A10246Jt_ord
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017J24_A718PrdNom, T017J24_A4693PrdNum2
            }
            , new Object[] {
            T017J25_A396EmprCod, T017J25_A10243Jt_codigo, T017J25_A10246Jt_ord
            }
            , new Object[] {
            T017J26_A407EmprNom, T017J26_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TJOTA00" ;
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
   private short Z10243Jt_codigo ;
   private short Z10245Jt_ultL ;
   private short O10245Jt_ultL ;
   private short Z10246Jt_ord ;
   private short nRcdDeleted_1389 ;
   private short nRcdExists_1389 ;
   private short nIsMod_1389 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A10245Jt_ultL ;
   private short A10243Jt_codigo ;
   private short nBlankRcdCount1389 ;
   private short RcdFound1389 ;
   private short B10245Jt_ultL ;
   private short nBlankRcdUsr1389 ;
   private short s10245Jt_ultL ;
   private short A10246Jt_ord ;
   private short RcdFound1388 ;
   private short nIsDirty_1388 ;
   private short nIsDirty_1389 ;
   private short i10245Jt_ultL ;
   private short ZZ10243Jt_codigo ;
   private short ZZ10245Jt_ultL ;
   private short ZO10245Jt_ultL ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtJt_codigo_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtJt_Desc_Enabled ;
   private int edtJt_ultL_Enabled ;
   private int edtavnRcdDeleted_1389_Enabled ;
   private int edtJt_ord_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtPrdNum2_Enabled ;
   private int edtJt_Reb_Enabled ;
   private int edtJt_CatMn_Enabled ;
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
   private int defedtJt_ord_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtJt_ultL_Backcolor ;
   private int edtJt_Desc_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtJt_codigo_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z10248Jt_CatMn ;
   private java.math.BigDecimal A10248Jt_CatMn ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z10244Jt_Desc ;
   private String Z10247Jt_Reb ;
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
   private String edtJt_codigo_Internalname ;
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
   private String edtJt_codigo_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtJt_Desc_Internalname ;
   private String A10244Jt_Desc ;
   private String edtJt_Desc_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtJt_ultL_Internalname ;
   private String edtJt_ultL_Jsonclick ;
   private String sMode1389 ;
   private String edtavnRcdDeleted_1389_Internalname ;
   private String edtJt_ord_Internalname ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNom_Internalname ;
   private String edtPrdNum2_Internalname ;
   private String edtJt_Reb_Internalname ;
   private String edtJt_CatMn_Internalname ;
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
   private String sMode1388 ;
   private String GXCCtl ;
   private String A718PrdNom ;
   private String A4693PrdNum2 ;
   private String A10247Jt_Reb ;
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
   private String Z407EmprNom ;
   private String Z718PrdNom ;
   private String Z4693PrdNum2 ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1389_Jsonclick ;
   private String edtJt_ord_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtPrdNum2_Jsonclick ;
   private String edtJt_Reb_Jsonclick ;
   private String edtJt_CatMn_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ10244Jt_Desc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n719PrdNum ;
   private boolean wbErr ;
   private boolean n10245Jt_ultL ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n10244Jt_Desc ;
   private boolean returnInSub ;
   private boolean n10247Jt_Reb ;
   private boolean n10248Jt_CatMn ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T017J7_A407EmprNom ;
   private boolean[] T017J7_n407EmprNom ;
   private short[] T017J8_A10243Jt_codigo ;
   private String[] T017J8_A407EmprNom ;
   private boolean[] T017J8_n407EmprNom ;
   private String[] T017J8_A10244Jt_Desc ;
   private boolean[] T017J8_n10244Jt_Desc ;
   private short[] T017J8_A10245Jt_ultL ;
   private boolean[] T017J8_n10245Jt_ultL ;
   private String[] T017J8_A396EmprCod ;
   private String[] T017J9_A396EmprCod ;
   private short[] T017J9_A10243Jt_codigo ;
   private short[] T017J6_A10243Jt_codigo ;
   private String[] T017J6_A10244Jt_Desc ;
   private boolean[] T017J6_n10244Jt_Desc ;
   private short[] T017J6_A10245Jt_ultL ;
   private boolean[] T017J6_n10245Jt_ultL ;
   private String[] T017J6_A396EmprCod ;
   private String[] T017J10_A396EmprCod ;
   private short[] T017J10_A10243Jt_codigo ;
   private String[] T017J11_A396EmprCod ;
   private short[] T017J11_A10243Jt_codigo ;
   private short[] T017J5_A10243Jt_codigo ;
   private String[] T017J5_A10244Jt_Desc ;
   private boolean[] T017J5_n10244Jt_Desc ;
   private short[] T017J5_A10245Jt_ultL ;
   private boolean[] T017J5_n10245Jt_ultL ;
   private String[] T017J5_A396EmprCod ;
   private String[] T017J15_A396EmprCod ;
   private short[] T017J15_A10243Jt_codigo ;
   private java.util.Date[] T017J15_A10249Jt_Dia ;
   private String[] T017J17_A396EmprCod ;
   private short[] T017J17_A10243Jt_codigo ;
   private short[] T017J18_A10243Jt_codigo ;
   private short[] T017J18_A10246Jt_ord ;
   private String[] T017J18_A718PrdNom ;
   private String[] T017J18_A4693PrdNum2 ;
   private String[] T017J18_A10247Jt_Reb ;
   private boolean[] T017J18_n10247Jt_Reb ;
   private java.math.BigDecimal[] T017J18_A10248Jt_CatMn ;
   private boolean[] T017J18_n10248Jt_CatMn ;
   private String[] T017J18_A396EmprCod ;
   private String[] T017J18_A719PrdNum ;
   private boolean[] T017J18_n719PrdNum ;
   private String[] T017J4_A718PrdNom ;
   private String[] T017J4_A4693PrdNum2 ;
   private String[] T017J19_A718PrdNom ;
   private String[] T017J19_A4693PrdNum2 ;
   private String[] T017J20_A396EmprCod ;
   private short[] T017J20_A10243Jt_codigo ;
   private short[] T017J20_A10246Jt_ord ;
   private short[] T017J3_A10243Jt_codigo ;
   private short[] T017J3_A10246Jt_ord ;
   private String[] T017J3_A10247Jt_Reb ;
   private boolean[] T017J3_n10247Jt_Reb ;
   private java.math.BigDecimal[] T017J3_A10248Jt_CatMn ;
   private boolean[] T017J3_n10248Jt_CatMn ;
   private String[] T017J3_A396EmprCod ;
   private String[] T017J3_A719PrdNum ;
   private boolean[] T017J3_n719PrdNum ;
   private short[] T017J2_A10243Jt_codigo ;
   private short[] T017J2_A10246Jt_ord ;
   private String[] T017J2_A10247Jt_Reb ;
   private boolean[] T017J2_n10247Jt_Reb ;
   private java.math.BigDecimal[] T017J2_A10248Jt_CatMn ;
   private boolean[] T017J2_n10248Jt_CatMn ;
   private String[] T017J2_A396EmprCod ;
   private String[] T017J2_A719PrdNum ;
   private boolean[] T017J2_n719PrdNum ;
   private String[] T017J24_A718PrdNom ;
   private String[] T017J24_A4693PrdNum2 ;
   private String[] T017J25_A396EmprCod ;
   private short[] T017J25_A10243Jt_codigo ;
   private short[] T017J25_A10246Jt_ord ;
   private String[] T017J26_A407EmprNom ;
   private boolean[] T017J26_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tjota00__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tjota00__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tjota00__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tjota00__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tjota00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T017J2", "SELECT Jt_codigo, Jt_ord, Jt_Reb, Jt_CatMn, EmprCod, PrdNum FROM TXPJOTA01 WHERE EmprCod = ? AND Jt_codigo = ? AND Jt_ord = ?  FOR UPDATE OF Jt_Reb, Jt_CatMn, PrdNum NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017J3", "SELECT Jt_codigo, Jt_ord, Jt_Reb, Jt_CatMn, EmprCod, PrdNum FROM TXPJOTA01 WHERE EmprCod = ? AND Jt_codigo = ? AND Jt_ord = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017J4", "SELECT PrdNom, PrdNum2 FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017J5", "SELECT Jt_codigo, Jt_Desc, Jt_ultL, EmprCod FROM TXPJOTA00 WHERE EmprCod = ? AND Jt_codigo = ?  FOR UPDATE OF Jt_Desc, Jt_ultL NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017J6", "SELECT Jt_codigo, Jt_Desc, Jt_ultL, EmprCod FROM TXPJOTA00 WHERE EmprCod = ? AND Jt_codigo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017J7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017J8", "SELECT /*+ FIRST_ROWS(100) */ TM1.Jt_codigo, T2.EmprNom, TM1.Jt_Desc, TM1.Jt_ultL, TM1.EmprCod FROM (TXPJOTA00 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Jt_codigo = ? ORDER BY TM1.EmprCod, TM1.Jt_codigo ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017J9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Jt_codigo FROM TXPJOTA00 WHERE EmprCod = ? AND Jt_codigo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017J10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Jt_codigo FROM TXPJOTA00 WHERE ( Jt_codigo > ?) and EmprCod = ? ORDER BY EmprCod, Jt_codigo) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017J11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Jt_codigo FROM TXPJOTA00 WHERE ( Jt_codigo < ?) and EmprCod = ? ORDER BY EmprCod DESC, Jt_codigo DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T017J12", "INSERT INTO TXPJOTA00(Jt_codigo, Jt_Desc, Jt_ultL, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPJOTA00")
         ,new UpdateCursor("T017J13", "UPDATE TXPJOTA00 SET Jt_Desc=?, Jt_ultL=?  WHERE EmprCod = ? AND Jt_codigo = ?", GX_NOMASK, "TXPJOTA00")
         ,new UpdateCursor("T017J14", "DELETE FROM TXPJOTA00  WHERE EmprCod = ? AND Jt_codigo = ?", GX_NOMASK, "TXPJOTA00")
         ,new ForEachCursor("T017J15", "SELECT * FROM (SELECT EmprCod, Jt_codigo, Jt_Dia FROM TXPJOTA02 WHERE EmprCod = ? AND Jt_codigo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T017J16", "UPDATE TXPJOTA00 SET Jt_ultL=?  WHERE EmprCod = ? AND Jt_codigo = ?", GX_NOMASK, "TXPJOTA00")
         ,new ForEachCursor("T017J17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Jt_codigo FROM TXPJOTA00 WHERE EmprCod = ? ORDER BY EmprCod, Jt_codigo ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017J18", "SELECT T1.Jt_codigo, T1.Jt_ord, T2.PrdNom, T2.PrdNum2, T1.Jt_Reb, T1.Jt_CatMn, T1.EmprCod, T1.PrdNum FROM (TXPJOTA01 T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.Jt_codigo = ? and T1.Jt_ord = ? ORDER BY T1.EmprCod, T1.Jt_codigo, T1.Jt_ord ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017J19", "SELECT PrdNom, PrdNum2 FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017J20", "SELECT EmprCod, Jt_codigo, Jt_ord FROM TXPJOTA01 WHERE EmprCod = ? AND Jt_codigo = ? AND Jt_ord = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T017J21", "INSERT INTO TXPJOTA01(Jt_codigo, Jt_ord, Jt_Reb, Jt_CatMn, EmprCod, PrdNum) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPJOTA01")
         ,new UpdateCursor("T017J22", "UPDATE TXPJOTA01 SET Jt_Reb=?, Jt_CatMn=?, PrdNum=?  WHERE EmprCod = ? AND Jt_codigo = ? AND Jt_ord = ?", GX_NOMASK, "TXPJOTA01")
         ,new UpdateCursor("T017J23", "DELETE FROM TXPJOTA01  WHERE EmprCod = ? AND Jt_codigo = ? AND Jt_ord = ?", GX_NOMASK, "TXPJOTA01")
         ,new ForEachCursor("T017J24", "SELECT PrdNom, PrdNum2 FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017J25", "SELECT EmprCod, Jt_codigo, Jt_ord FROM TXPJOTA01 WHERE EmprCod = ? and Jt_codigo = ? ORDER BY EmprCod, Jt_codigo, Jt_ord ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017J26", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 16 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((String[]) buf[9])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 9 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 40);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[4]).shortValue());
               }
               stmt.setString(4, (String)parms[5], 3);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 40);
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
               stmt.setShort(4, ((Number) parms[5]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 19 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 4);
               }
               stmt.setString(5, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 6);
               }
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 6);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setShort(5, ((Number) parms[7]).shortValue());
               stmt.setShort(6, ((Number) parms[8]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

