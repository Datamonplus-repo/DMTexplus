package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tparlan_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PARAMETROS LANZAMIENTO", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtParLanCod_Internalname ;
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
      A3147ParLanUL = (short)(GXutil.lval( httpContext.GetPar( "ParLanUL"))) ;
      n3147ParLanUL = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public tparlan_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tparlan_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tparlan_impl.class ));
   }

   public tparlan_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPARLAN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPARLAN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPARLAN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPARLAN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPARLAN.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPARLAN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPARLAN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPARLAN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParLanCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3146ParLanCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtParLanCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3146ParLanCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3146ParLanCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParLanCod_Jsonclick, 0, "", "", "", "", "", 1, edtParLanCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPARLAN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPARLAN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPARLAN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtParLanUL_Internalname, GXutil.ltrim( localUtil.ntoc( A3147ParLanUL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtParLanUL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3147ParLanUL), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3147ParLanUL), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParLanUL_Jsonclick, 0, "", "", "", "", "", 1, edtParLanUL_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPARLAN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPARLAN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPARLAN.htm");
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
         nBlankRcdCount1574 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1574 = (short)(1) ;
            scanStart1FK1574( ) ;
            while ( RcdFound1574 != 0 )
            {
               init_level_properties1574( ) ;
               getByPrimaryKey1FK1574( ) ;
               addRow1FK1574( ) ;
               scanNext1FK1574( ) ;
            }
            scanEnd1FK1574( ) ;
            nBlankRcdCount1574 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B3147ParLanUL = A3147ParLanUL ;
         n3147ParLanUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
         standaloneNotModal1FK1574( ) ;
         standaloneModal1FK1574( ) ;
         sMode1574 = Gx_mode ;
         while ( nGXsfl_40_idx < nRC_GXsfl_40 )
         {
            bGXsfl_40_Refreshing = true ;
            readRow1FK1574( ) ;
            edtavnRcdDeleted_1574_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1574_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1574_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1574_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtParLanLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARLANLIN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParLanLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLanLin_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtParLanLK_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARLANLK_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParLanLK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLanLK_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtParLanNHdr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARLANNHDR_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParLanNHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLanNHdr_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtParLanCap_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARLANCAP_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParLanCap_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLanCap_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtParLanFec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARLANFEC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParLanFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLanFec_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtParLanHor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARLANHOR_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParLanHor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLanHor_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtParLanNhor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARLANNHOR_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParLanNhor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLanNhor_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            if ( ( nRcdExists_1574 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1FK1574( ) ;
            }
            sendRow1FK1574( ) ;
            bGXsfl_40_Refreshing = false ;
         }
         Gx_mode = sMode1574 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A3147ParLanUL = B3147ParLanUL ;
         n3147ParLanUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1574 = (short)(5) ;
         nRcdExists_1574 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1FK1574( ) ;
            while ( RcdFound1574 != 0 )
            {
               sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_401574( ) ;
               init_level_properties1574( ) ;
               standaloneNotModal1FK1574( ) ;
               getByPrimaryKey1FK1574( ) ;
               standaloneModal1FK1574( ) ;
               addRow1FK1574( ) ;
               scanNext1FK1574( ) ;
            }
            scanEnd1FK1574( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1574 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_401574( ) ;
      initAll1FK1574( ) ;
      init_level_properties1574( ) ;
      B3147ParLanUL = A3147ParLanUL ;
      n3147ParLanUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
      nRcdExists_1574 = (short)(0) ;
      nIsMod_1574 = (short)(0) ;
      nRcdDeleted_1574 = (short)(0) ;
      nBlankRcdCount1574 = (short)(nBlankRcdUsr1574+nBlankRcdCount1574) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1574 > 0 )
      {
         standaloneNotModal1FK1574( ) ;
         standaloneModal1FK1574( ) ;
         addRow1FK1574( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtParLanLK_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1574 = (short)(nBlankRcdCount1574-1) ;
      }
      Gx_mode = sMode1574 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A3147ParLanUL = B3147ParLanUL ;
      n3147ParLanUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPARLAN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPARLAN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPARLAN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPARLAN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPARLAN.htm");
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
      e111FK2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z3146ParLanCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3146ParLanCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3147ParLanUL = (short)(localUtil.ctol( httpContext.cgiGet( "Z3147ParLanUL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O3147ParLanUL = (short)(localUtil.ctol( httpContext.cgiGet( "O3147ParLanUL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV21UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParLanCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParLanCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARLANCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParLanCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3146ParLanCod = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3146ParLanCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3146ParLanCod), 2, 0));
            }
            else
            {
               A3146ParLanCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtParLanCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3146ParLanCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3146ParLanCod), 2, 0));
            }
            A3147ParLanUL = (short)(localUtil.ctol( httpContext.cgiGet( edtParLanUL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3147ParLanUL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
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
               A3146ParLanCod = (byte)(GXutil.lval( httpContext.GetPar( "ParLanCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3146ParLanCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3146ParLanCod), 2, 0));
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
                        e111FK2 ();
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
            initAll1FK1573( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1574_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1574_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      disableAttributes1FK1573( ) ;
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

   public void confirm_1FK0( )
   {
      beforeValidate1FK1573( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1FK1573( ) ;
         }
         else
         {
            checkExtendedTable1FK1573( ) ;
            if ( AnyError == 0 )
            {
               zm1FK1573( 8) ;
            }
            closeExtendedTableCursors1FK1573( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1573 = Gx_mode ;
         confirm_1FK1574( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1573 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1573 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1FK0( ) ;
      }
   }

   public void confirm_1FK1574( )
   {
      s3147ParLanUL = O3147ParLanUL ;
      n3147ParLanUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1FK1574( ) ;
         if ( ( nRcdExists_1574 != 0 ) || ( nIsMod_1574 != 0 ) )
         {
            getKey1FK1574( ) ;
            if ( ( nRcdExists_1574 == 0 ) && ( nRcdDeleted_1574 == 0 ) )
            {
               if ( RcdFound1574 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1FK1574( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1FK1574( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1FK1574( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O3147ParLanUL = A3147ParLanUL ;
                     n3147ParLanUL = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "PARLANCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtParLanCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1574 != 0 )
               {
                  if ( nRcdDeleted_1574 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1FK1574( ) ;
                     load1FK1574( ) ;
                     beforeValidate1FK1574( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1FK1574( ) ;
                        O3147ParLanUL = A3147ParLanUL ;
                        n3147ParLanUL = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1574 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1FK1574( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1FK1574( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1FK1574( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O3147ParLanUL = A3147ParLanUL ;
                           n3147ParLanUL = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1574 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PARLANCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtParLanCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1574_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1574, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParLanLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3148ParLanLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParLanLK_Internalname, GXutil.ltrim( localUtil.ntoc( A3149ParLanLK, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParLanNHdr_Internalname, GXutil.ltrim( localUtil.ntoc( A3150ParLanNHdr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParLanCap_Internalname, GXutil.ltrim( localUtil.ntoc( A3151ParLanCap, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParLanFec_Internalname, localUtil.format(A3152ParLanFec, "99/99/99")) ;
         httpContext.changePostValue( edtParLanHor_Internalname, GXutil.ltrim( localUtil.ntoc( A3901ParLanHor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParLanNhor_Internalname, GXutil.ltrim( localUtil.ntoc( A3902ParLanNhor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3148ParLanLin_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z3148ParLanLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3149ParLanLK_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z3149ParLanLK, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3150ParLanNHdr_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z3150ParLanNHdr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3151ParLanCap_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z3151ParLanCap, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3152ParLanFec_"+sGXsfl_40_idx, localUtil.dtoc( Z3152ParLanFec, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z3901ParLanHor_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z3901ParLanHor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3902ParLanNhor_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z3902ParLanNhor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1574_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1574, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1574_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1574, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1574_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1574, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1574 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1574_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1574_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARLANLIN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARLANLK_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanLK_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARLANNHDR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanNHdr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARLANCAP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanCap_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARLANFEC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanFec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARLANHOR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanHor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARLANNHOR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanNhor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O3147ParLanUL = s3147ParLanUL ;
      n3147ParLanUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1FK0( )
   {
   }

   public void e111FK2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV22LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tparlan_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22LitFe", AV22LitFe);
      GXt_char1 = AV16Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      tparlan_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit0", AV16Lit0);
      GXt_char1 = AV17Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1612_", ""), (byte)(99), GXv_char2) ;
      tparlan_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit1", AV17Lit1);
      GXt_char1 = AV18Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1613_", ""), (byte)(99), GXv_char2) ;
      tparlan_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit2", AV18Lit2);
      GXt_char1 = AV19Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1614_", ""), (byte)(99), GXv_char2) ;
      tparlan_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit3", AV19Lit3);
      GXt_char1 = AV20Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1615_", ""), (byte)(99), GXv_char2) ;
      tparlan_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit4", AV20Lit4);
      GXt_char1 = AV23Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT120_", ""), (byte)(99), GXv_char2) ;
      tparlan_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit5", AV23Lit5);
      AV24Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Station", AV24Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV25EmprNom ;
      GXv_char4[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char2, GXv_char3, GXv_char4) ;
      tparlan_impl.this.A396EmprCod = GXv_char2[0] ;
      tparlan_impl.this.AV25EmprNom = GXv_char3[0] ;
      tparlan_impl.this.AV21UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprNom", AV25EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV21UsurCod", AV21UsurCod);
   }

   public void zm1FK1573( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3147ParLanUL = T01FK5_A3147ParLanUL[0] ;
         }
         else
         {
            Z3147ParLanUL = A3147ParLanUL ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z3146ParLanCod = A3146ParLanCod ;
         Z3147ParLanUL = A3147ParLanUL ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtParLanUL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParLanUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLanUL_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtParLanUL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParLanUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLanUL_Enabled), 5, 0), true);
      /* Using cursor T01FK6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FK6_A407EmprNom[0] ;
      n407EmprNom = T01FK6_n407EmprNom[0] ;
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

   public void load1FK1573( )
   {
      /* Using cursor T01FK7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Byte.valueOf(A3146ParLanCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1573 = (short)(1) ;
         A3147ParLanUL = T01FK7_A3147ParLanUL[0] ;
         n3147ParLanUL = T01FK7_n3147ParLanUL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
         A407EmprNom = T01FK7_A407EmprNom[0] ;
         n407EmprNom = T01FK7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm1FK1573( -7) ;
      }
      pr_default.close(5);
      onLoadActions1FK1573( ) ;
   }

   public void onLoadActions1FK1573( )
   {
      if ( 1 < 0 )
      {
         AV21UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21UsurCod", AV21UsurCod);
      }
   }

   public void checkExtendedTable1FK1573( )
   {
      nIsDirty_1573 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( 1 < 0 )
      {
         AV21UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21UsurCod", AV21UsurCod);
      }
   }

   public void closeExtendedTableCursors1FK1573( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1FK1573( )
   {
      /* Using cursor T01FK8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Byte.valueOf(A3146ParLanCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1573 = (short)(1) ;
      }
      else
      {
         RcdFound1573 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01FK5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Byte.valueOf(A3146ParLanCod)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01FK5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1FK1573( 7) ;
         RcdFound1573 = (short)(1) ;
         A3146ParLanCod = T01FK5_A3146ParLanCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3146ParLanCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3146ParLanCod), 2, 0));
         A3147ParLanUL = T01FK5_A3147ParLanUL[0] ;
         n3147ParLanUL = T01FK5_n3147ParLanUL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
         O3147ParLanUL = A3147ParLanUL ;
         n3147ParLanUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z3146ParLanCod = A3146ParLanCod ;
         sMode1573 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1FK1573( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1573 = (short)(0) ;
            initializeNonKey1FK1573( ) ;
         }
         Gx_mode = sMode1573 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1573 = (short)(0) ;
         initializeNonKey1FK1573( ) ;
         sMode1573 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1573 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1FK1573( ) ;
      if ( RcdFound1573 == 0 )
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
      RcdFound1573 = (short)(0) ;
      /* Using cursor T01FK9 */
      pr_default.execute(7, new Object[] {Byte.valueOf(A3146ParLanCod), A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T01FK9_A3146ParLanCod[0] < A3146ParLanCod ) ) && ( GXutil.strcmp(T01FK9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T01FK9_A3146ParLanCod[0] > A3146ParLanCod ) ) && ( GXutil.strcmp(T01FK9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A3146ParLanCod = T01FK9_A3146ParLanCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3146ParLanCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3146ParLanCod), 2, 0));
            RcdFound1573 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound1573 = (short)(0) ;
      /* Using cursor T01FK10 */
      pr_default.execute(8, new Object[] {Byte.valueOf(A3146ParLanCod), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T01FK10_A3146ParLanCod[0] > A3146ParLanCod ) ) && ( GXutil.strcmp(T01FK10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T01FK10_A3146ParLanCod[0] < A3146ParLanCod ) ) && ( GXutil.strcmp(T01FK10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A3146ParLanCod = T01FK10_A3146ParLanCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3146ParLanCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3146ParLanCod), 2, 0));
            RcdFound1573 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1FK1573( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A3147ParLanUL = O3147ParLanUL ;
         n3147ParLanUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
         GX_FocusControl = edtParLanCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1FK1573( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1573 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3146ParLanCod != Z3146ParLanCod ) )
            {
               A3146ParLanCod = Z3146ParLanCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A3146ParLanCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3146ParLanCod), 2, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A3147ParLanUL = O3147ParLanUL ;
               n3147ParLanUL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtParLanCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A3147ParLanUL = O3147ParLanUL ;
               n3147ParLanUL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
               update1FK1573( ) ;
               GX_FocusControl = edtParLanCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3146ParLanCod != Z3146ParLanCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A3147ParLanUL = O3147ParLanUL ;
               n3147ParLanUL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
               GX_FocusControl = edtParLanCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1FK1573( ) ;
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
                  A3147ParLanUL = O3147ParLanUL ;
                  n3147ParLanUL = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
                  GX_FocusControl = edtParLanCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1FK1573( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3146ParLanCod != Z3146ParLanCod ) )
      {
         A3146ParLanCod = Z3146ParLanCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A3146ParLanCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3146ParLanCod), 2, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A3147ParLanUL = O3147ParLanUL ;
         n3147ParLanUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtParLanCod_Internalname ;
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
      getKey1FK1573( ) ;
      if ( RcdFound1573 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3146ParLanCod != Z3146ParLanCod ) )
         {
            A3146ParLanCod = Z3146ParLanCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A3146ParLanCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3146ParLanCod), 2, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3146ParLanCod != Z3146ParLanCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tparlan");
   }

   public void insert_check( )
   {
      confirm_1FK0( ) ;
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
      if ( RcdFound1573 == 0 )
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
      scanStart1FK1573( ) ;
      if ( RcdFound1573 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1FK1573( ) ;
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
      if ( RcdFound1573 == 0 )
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
      if ( RcdFound1573 == 0 )
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
      scanStart1FK1573( ) ;
      if ( RcdFound1573 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1573 != 0 )
         {
            scanNext1FK1573( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1FK1573( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1FK1573( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FK4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Byte.valueOf(A3146ParLanCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPARLA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z3147ParLanUL != T01FK4_A3147ParLanUL[0] ) )
         {
            if ( Z3147ParLanUL != T01FK4_A3147ParLanUL[0] )
            {
               GXutil.writeLogln("tparlan:[seudo value changed for attri]"+"ParLanUL");
               GXutil.writeLogRaw("Old: ",Z3147ParLanUL);
               GXutil.writeLogRaw("Current: ",T01FK4_A3147ParLanUL[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCPARLA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FK1573( )
   {
      beforeValidate1FK1573( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FK1573( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FK1573( 0) ;
         checkOptimisticConcurrency1FK1573( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FK1573( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FK1573( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FK11 */
                  pr_default.execute(9, new Object[] {Byte.valueOf(A3146ParLanCod), Boolean.valueOf(n3147ParLanUL), Short.valueOf(A3147ParLanUL), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPARLA");
                  if ( (pr_default.getStatus(9) == 1) )
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
                        processLevel1FK1573( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1FK0( ) ;
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
            load1FK1573( ) ;
         }
         endLevel1FK1573( ) ;
      }
      closeExtendedTableCursors1FK1573( ) ;
   }

   public void update1FK1573( )
   {
      beforeValidate1FK1573( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FK1573( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FK1573( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FK1573( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1FK1573( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FK12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n3147ParLanUL), Short.valueOf(A3147ParLanUL), A396EmprCod, Byte.valueOf(A3146ParLanCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPARLA");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPARLA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1FK1573( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1FK1573( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1FK0( ) ;
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
         endLevel1FK1573( ) ;
      }
      closeExtendedTableCursors1FK1573( ) ;
   }

   public void deferredUpdate1FK1573( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FK1573( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FK1573( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FK1573( ) ;
         afterConfirm1FK1573( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FK1573( ) ;
            if ( AnyError == 0 )
            {
               A3147ParLanUL = O3147ParLanUL ;
               n3147ParLanUL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
               scanStart1FK1574( ) ;
               while ( RcdFound1574 != 0 )
               {
                  getByPrimaryKey1FK1574( ) ;
                  delete1FK1574( ) ;
                  scanNext1FK1574( ) ;
                  O3147ParLanUL = A3147ParLanUL ;
                  n3147ParLanUL = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
               }
               scanEnd1FK1574( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FK13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Byte.valueOf(A3146ParLanCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPARLA");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1573 == 0 )
                        {
                           initAll1FK1573( ) ;
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
                        resetCaption1FK0( ) ;
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
      sMode1573 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FK1573( ) ;
      Gx_mode = sMode1573 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FK1573( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( 1 < 0 )
         {
            AV21UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21UsurCod", AV21UsurCod);
         }
      }
   }

   public void processNestedLevel1FK1574( )
   {
      s3147ParLanUL = O3147ParLanUL ;
      n3147ParLanUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1FK1574( ) ;
         if ( ( nRcdExists_1574 != 0 ) || ( nIsMod_1574 != 0 ) )
         {
            standaloneNotModal1FK1574( ) ;
            getKey1FK1574( ) ;
            if ( ( nRcdExists_1574 == 0 ) && ( nRcdDeleted_1574 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1FK1574( ) ;
            }
            else
            {
               if ( RcdFound1574 != 0 )
               {
                  if ( ( nRcdDeleted_1574 != 0 ) && ( nRcdExists_1574 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1FK1574( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1574 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1FK1574( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1574 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PARLANCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtParLanCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O3147ParLanUL = A3147ParLanUL ;
            n3147ParLanUL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1574_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1574, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParLanLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3148ParLanLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParLanLK_Internalname, GXutil.ltrim( localUtil.ntoc( A3149ParLanLK, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParLanNHdr_Internalname, GXutil.ltrim( localUtil.ntoc( A3150ParLanNHdr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParLanCap_Internalname, GXutil.ltrim( localUtil.ntoc( A3151ParLanCap, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParLanFec_Internalname, localUtil.format(A3152ParLanFec, "99/99/99")) ;
         httpContext.changePostValue( edtParLanHor_Internalname, GXutil.ltrim( localUtil.ntoc( A3901ParLanHor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParLanNhor_Internalname, GXutil.ltrim( localUtil.ntoc( A3902ParLanNhor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3148ParLanLin_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z3148ParLanLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3149ParLanLK_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z3149ParLanLK, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3150ParLanNHdr_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z3150ParLanNHdr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3151ParLanCap_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z3151ParLanCap, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3152ParLanFec_"+sGXsfl_40_idx, localUtil.dtoc( Z3152ParLanFec, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z3901ParLanHor_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z3901ParLanHor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3902ParLanNhor_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z3902ParLanNhor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1574_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1574, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1574_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1574, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1574_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1574, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1574 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1574_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1574_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARLANLIN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARLANLK_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanLK_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARLANNHDR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanNHdr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARLANCAP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanCap_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARLANFEC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanFec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARLANHOR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanHor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARLANNHOR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanNhor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1FK1574( ) ;
      if ( AnyError != 0 )
      {
         O3147ParLanUL = s3147ParLanUL ;
         n3147ParLanUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
      }
      nRcdExists_1574 = (short)(0) ;
      nIsMod_1574 = (short)(0) ;
      nRcdDeleted_1574 = (short)(0) ;
   }

   public void processLevel1FK1573( )
   {
      /* Save parent mode. */
      sMode1573 = Gx_mode ;
      processNestedLevel1FK1574( ) ;
      if ( AnyError != 0 )
      {
         O3147ParLanUL = s3147ParLanUL ;
         n3147ParLanUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1573 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01FK14 */
      pr_default.execute(12, new Object[] {Boolean.valueOf(n3147ParLanUL), Short.valueOf(A3147ParLanUL), A396EmprCod, Byte.valueOf(A3146ParLanCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPARLA");
   }

   public void endLevel1FK1573( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1FK1573( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tparlan");
         if ( AnyError == 0 )
         {
            confirmValues1FK0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tparlan");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1FK1573( )
   {
      /* Scan By routine */
      /* Using cursor T01FK15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      RcdFound1573 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1573 = (short)(1) ;
         A3146ParLanCod = T01FK15_A3146ParLanCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3146ParLanCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3146ParLanCod), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FK1573( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound1573 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1573 = (short)(1) ;
         A3146ParLanCod = T01FK15_A3146ParLanCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3146ParLanCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3146ParLanCod), 2, 0));
      }
   }

   public void scanEnd1FK1573( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1FK1573( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FK1573( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FK1573( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FK1573( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FK1573( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FK1573( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FK1573( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtParLanCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParLanCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLanCod_Enabled), 5, 0), true);
      edtParLanUL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParLanUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLanUL_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zm1FK1574( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3149ParLanLK = T01FK3_A3149ParLanLK[0] ;
            Z3150ParLanNHdr = T01FK3_A3150ParLanNHdr[0] ;
            Z3151ParLanCap = T01FK3_A3151ParLanCap[0] ;
            Z3152ParLanFec = T01FK3_A3152ParLanFec[0] ;
            Z3901ParLanHor = T01FK3_A3901ParLanHor[0] ;
            Z3902ParLanNhor = T01FK3_A3902ParLanNhor[0] ;
         }
         else
         {
            Z3149ParLanLK = A3149ParLanLK ;
            Z3150ParLanNHdr = A3150ParLanNHdr ;
            Z3151ParLanCap = A3151ParLanCap ;
            Z3152ParLanFec = A3152ParLanFec ;
            Z3901ParLanHor = A3901ParLanHor ;
            Z3902ParLanNhor = A3902ParLanNhor ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z396EmprCod = A396EmprCod ;
         Z3146ParLanCod = A3146ParLanCod ;
         Z3148ParLanLin = A3148ParLanLin ;
         Z3149ParLanLK = A3149ParLanLK ;
         Z3150ParLanNHdr = A3150ParLanNHdr ;
         Z3151ParLanCap = A3151ParLanCap ;
         Z3152ParLanFec = A3152ParLanFec ;
         Z3901ParLanHor = A3901ParLanHor ;
         Z3902ParLanNhor = A3902ParLanNhor ;
      }
   }

   public void standaloneNotModal1FK1574( )
   {
      edtParLanLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParLanLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLanLin_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtParLanUL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParLanUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLanUL_Enabled), 5, 0), true);
      edtParLanUL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParLanUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLanUL_Enabled), 5, 0), true);
   }

   public void standaloneModal1FK1574( )
   {
      if ( isIns( )  )
      {
         A3147ParLanUL = (short)(O3147ParLanUL+1) ;
         n3147ParLanUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A3148ParLanLin = A3147ParLanUL ;
      }
   }

   public void load1FK1574( )
   {
      /* Using cursor T01FK16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Byte.valueOf(A3146ParLanCod), Short.valueOf(A3148ParLanLin)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1574 = (short)(1) ;
         A3149ParLanLK = T01FK16_A3149ParLanLK[0] ;
         n3149ParLanLK = T01FK16_n3149ParLanLK[0] ;
         A3150ParLanNHdr = T01FK16_A3150ParLanNHdr[0] ;
         n3150ParLanNHdr = T01FK16_n3150ParLanNHdr[0] ;
         A3151ParLanCap = T01FK16_A3151ParLanCap[0] ;
         n3151ParLanCap = T01FK16_n3151ParLanCap[0] ;
         A3152ParLanFec = T01FK16_A3152ParLanFec[0] ;
         n3152ParLanFec = T01FK16_n3152ParLanFec[0] ;
         A3901ParLanHor = T01FK16_A3901ParLanHor[0] ;
         n3901ParLanHor = T01FK16_n3901ParLanHor[0] ;
         A3902ParLanNhor = T01FK16_A3902ParLanNhor[0] ;
         n3902ParLanNhor = T01FK16_n3902ParLanNhor[0] ;
         zm1FK1574( -9) ;
      }
      pr_default.close(14);
      onLoadActions1FK1574( ) ;
   }

   public void onLoadActions1FK1574( )
   {
   }

   public void checkExtendedTable1FK1574( )
   {
      nIsDirty_1574 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1FK1574( ) ;
   }

   public void closeExtendedTableCursors1FK1574( )
   {
   }

   public void enableDisable1FK1574( )
   {
   }

   public void getKey1FK1574( )
   {
      /* Using cursor T01FK17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Byte.valueOf(A3146ParLanCod), Short.valueOf(A3148ParLanLin)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1574 = (short)(1) ;
      }
      else
      {
         RcdFound1574 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey1FK1574( )
   {
      /* Using cursor T01FK3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Byte.valueOf(A3146ParLanCod), Short.valueOf(A3148ParLanLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01FK3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1FK1574( 9) ;
         RcdFound1574 = (short)(1) ;
         initializeNonKey1FK1574( ) ;
         A3148ParLanLin = T01FK3_A3148ParLanLin[0] ;
         A3149ParLanLK = T01FK3_A3149ParLanLK[0] ;
         n3149ParLanLK = T01FK3_n3149ParLanLK[0] ;
         A3150ParLanNHdr = T01FK3_A3150ParLanNHdr[0] ;
         n3150ParLanNHdr = T01FK3_n3150ParLanNHdr[0] ;
         A3151ParLanCap = T01FK3_A3151ParLanCap[0] ;
         n3151ParLanCap = T01FK3_n3151ParLanCap[0] ;
         A3152ParLanFec = T01FK3_A3152ParLanFec[0] ;
         n3152ParLanFec = T01FK3_n3152ParLanFec[0] ;
         A3901ParLanHor = T01FK3_A3901ParLanHor[0] ;
         n3901ParLanHor = T01FK3_n3901ParLanHor[0] ;
         A3902ParLanNhor = T01FK3_A3902ParLanNhor[0] ;
         n3902ParLanNhor = T01FK3_n3902ParLanNhor[0] ;
         Z396EmprCod = A396EmprCod ;
         Z3146ParLanCod = A3146ParLanCod ;
         Z3148ParLanLin = A3148ParLanLin ;
         sMode1574 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FK1574( ) ;
         load1FK1574( ) ;
         Gx_mode = sMode1574 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1574 = (short)(0) ;
         initializeNonKey1FK1574( ) ;
         sMode1574 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FK1574( ) ;
         Gx_mode = sMode1574 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1FK1574( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1FK1574( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FK2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(A3146ParLanCod), Short.valueOf(A3148ParLanLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPARLA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z3149ParLanLK, T01FK2_A3149ParLanLK[0]) != 0 ) || ( Z3150ParLanNHdr != T01FK2_A3150ParLanNHdr[0] ) || ( Z3151ParLanCap != T01FK2_A3151ParLanCap[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z3152ParLanFec), GXutil.resetTime(T01FK2_A3152ParLanFec[0])) ) || ( Z3901ParLanHor != T01FK2_A3901ParLanHor[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3902ParLanNhor != T01FK2_A3902ParLanNhor[0] ) )
         {
            if ( DecimalUtil.compareTo(Z3149ParLanLK, T01FK2_A3149ParLanLK[0]) != 0 )
            {
               GXutil.writeLogln("tparlan:[seudo value changed for attri]"+"ParLanLK");
               GXutil.writeLogRaw("Old: ",Z3149ParLanLK);
               GXutil.writeLogRaw("Current: ",T01FK2_A3149ParLanLK[0]);
            }
            if ( Z3150ParLanNHdr != T01FK2_A3150ParLanNHdr[0] )
            {
               GXutil.writeLogln("tparlan:[seudo value changed for attri]"+"ParLanNHdr");
               GXutil.writeLogRaw("Old: ",Z3150ParLanNHdr);
               GXutil.writeLogRaw("Current: ",T01FK2_A3150ParLanNHdr[0]);
            }
            if ( Z3151ParLanCap != T01FK2_A3151ParLanCap[0] )
            {
               GXutil.writeLogln("tparlan:[seudo value changed for attri]"+"ParLanCap");
               GXutil.writeLogRaw("Old: ",Z3151ParLanCap);
               GXutil.writeLogRaw("Current: ",T01FK2_A3151ParLanCap[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3152ParLanFec), GXutil.resetTime(T01FK2_A3152ParLanFec[0])) ) )
            {
               GXutil.writeLogln("tparlan:[seudo value changed for attri]"+"ParLanFec");
               GXutil.writeLogRaw("Old: ",Z3152ParLanFec);
               GXutil.writeLogRaw("Current: ",T01FK2_A3152ParLanFec[0]);
            }
            if ( Z3901ParLanHor != T01FK2_A3901ParLanHor[0] )
            {
               GXutil.writeLogln("tparlan:[seudo value changed for attri]"+"ParLanHor");
               GXutil.writeLogRaw("Old: ",Z3901ParLanHor);
               GXutil.writeLogRaw("Current: ",T01FK2_A3901ParLanHor[0]);
            }
            if ( Z3902ParLanNhor != T01FK2_A3902ParLanNhor[0] )
            {
               GXutil.writeLogln("tparlan:[seudo value changed for attri]"+"ParLanNhor");
               GXutil.writeLogRaw("Old: ",Z3902ParLanNhor);
               GXutil.writeLogRaw("Current: ",T01FK2_A3902ParLanNhor[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLPARLA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FK1574( )
   {
      beforeValidate1FK1574( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FK1574( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FK1574( 0) ;
         checkOptimisticConcurrency1FK1574( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FK1574( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FK1574( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FK18 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Byte.valueOf(A3146ParLanCod), Short.valueOf(A3148ParLanLin), Boolean.valueOf(n3149ParLanLK), A3149ParLanLK, Boolean.valueOf(n3150ParLanNHdr), Short.valueOf(A3150ParLanNHdr), Boolean.valueOf(n3151ParLanCap), Short.valueOf(A3151ParLanCap), Boolean.valueOf(n3152ParLanFec), A3152ParLanFec, Boolean.valueOf(n3901ParLanHor), Integer.valueOf(A3901ParLanHor), Boolean.valueOf(n3902ParLanNhor), Integer.valueOf(A3902ParLanNhor)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARLA");
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
            load1FK1574( ) ;
         }
         endLevel1FK1574( ) ;
      }
      closeExtendedTableCursors1FK1574( ) ;
   }

   public void update1FK1574( )
   {
      beforeValidate1FK1574( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FK1574( ) ;
      }
      if ( ( nIsMod_1574 != 0 ) || ( nIsDirty_1574 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1FK1574( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1FK1574( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1FK1574( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01FK19 */
                     pr_default.execute(17, new Object[] {Boolean.valueOf(n3149ParLanLK), A3149ParLanLK, Boolean.valueOf(n3150ParLanNHdr), Short.valueOf(A3150ParLanNHdr), Boolean.valueOf(n3151ParLanCap), Short.valueOf(A3151ParLanCap), Boolean.valueOf(n3152ParLanFec), A3152ParLanFec, Boolean.valueOf(n3901ParLanHor), Integer.valueOf(A3901ParLanHor), Boolean.valueOf(n3902ParLanNhor), Integer.valueOf(A3902ParLanNhor), A396EmprCod, Byte.valueOf(A3146ParLanCod), Short.valueOf(A3148ParLanLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARLA");
                     if ( (pr_default.getStatus(17) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPARLA"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1FK1574( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1FK1574( ) ;
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
            endLevel1FK1574( ) ;
         }
      }
      closeExtendedTableCursors1FK1574( ) ;
   }

   public void deferredUpdate1FK1574( )
   {
   }

   public void delete1FK1574( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FK1574( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FK1574( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FK1574( ) ;
         afterConfirm1FK1574( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FK1574( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01FK20 */
               pr_default.execute(18, new Object[] {A396EmprCod, Byte.valueOf(A3146ParLanCod), Short.valueOf(A3148ParLanLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARLA");
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
      sMode1574 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FK1574( ) ;
      Gx_mode = sMode1574 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FK1574( )
   {
      standaloneModal1FK1574( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1FK1574( )
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

   public void scanStart1FK1574( )
   {
      /* Scan By routine */
      /* Using cursor T01FK21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Byte.valueOf(A3146ParLanCod)});
      RcdFound1574 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1574 = (short)(1) ;
         A3148ParLanLin = T01FK21_A3148ParLanLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FK1574( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound1574 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1574 = (short)(1) ;
         A3148ParLanLin = T01FK21_A3148ParLanLin[0] ;
      }
   }

   public void scanEnd1FK1574( )
   {
      pr_default.close(19);
   }

   public void afterConfirm1FK1574( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FK1574( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FK1574( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FK1574( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FK1574( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FK1574( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FK1574( )
   {
      edtParLanLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParLanLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLanLin_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtParLanLK_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParLanLK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLanLK_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtParLanNHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParLanNHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLanNHdr_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtParLanCap_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParLanCap_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLanCap_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtParLanFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParLanFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLanFec_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtParLanHor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParLanHor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLanHor_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtParLanNhor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParLanNhor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLanNhor_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void send_integrity_lvl_hashes1FK1574( )
   {
   }

   public void send_integrity_lvl_hashes1FK1573( )
   {
   }

   public void subsflControlProps_401574( )
   {
      edtavnRcdDeleted_1574_Internalname = "vNRCDDELETED_1574_"+sGXsfl_40_idx ;
      edtParLanLin_Internalname = "PARLANLIN_"+sGXsfl_40_idx ;
      edtParLanLK_Internalname = "PARLANLK_"+sGXsfl_40_idx ;
      edtParLanNHdr_Internalname = "PARLANNHDR_"+sGXsfl_40_idx ;
      edtParLanCap_Internalname = "PARLANCAP_"+sGXsfl_40_idx ;
      edtParLanFec_Internalname = "PARLANFEC_"+sGXsfl_40_idx ;
      edtParLanHor_Internalname = "PARLANHOR_"+sGXsfl_40_idx ;
      edtParLanNhor_Internalname = "PARLANNHOR_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_401574( )
   {
      edtavnRcdDeleted_1574_Internalname = "vNRCDDELETED_1574_"+sGXsfl_40_fel_idx ;
      edtParLanLin_Internalname = "PARLANLIN_"+sGXsfl_40_fel_idx ;
      edtParLanLK_Internalname = "PARLANLK_"+sGXsfl_40_fel_idx ;
      edtParLanNHdr_Internalname = "PARLANNHDR_"+sGXsfl_40_fel_idx ;
      edtParLanCap_Internalname = "PARLANCAP_"+sGXsfl_40_fel_idx ;
      edtParLanFec_Internalname = "PARLANFEC_"+sGXsfl_40_fel_idx ;
      edtParLanHor_Internalname = "PARLANHOR_"+sGXsfl_40_fel_idx ;
      edtParLanNhor_Internalname = "PARLANNHOR_"+sGXsfl_40_fel_idx ;
   }

   public void addRow1FK1574( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401574( ) ;
      sendRow1FK1574( ) ;
   }

   public void sendRow1FK1574( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1574_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1574_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1574, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1574_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1574), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1574), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1574_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1574_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParLanLin_Internalname,GXutil.ltrim( localUtil.ntoc( A3148ParLanLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtParLanLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3148ParLanLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3148ParLanLin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParLanLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtParLanLin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1574_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParLanLK_Internalname,GXutil.ltrim( localUtil.ntoc( A3149ParLanLK, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtParLanLK_Enabled!=0) ? localUtil.format( A3149ParLanLK, "ZZZZZ9.99") : localUtil.format( A3149ParLanLK, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParLanLK_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtParLanLK_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1574_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParLanNHdr_Internalname,GXutil.ltrim( localUtil.ntoc( A3150ParLanNHdr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtParLanNHdr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3150ParLanNHdr), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3150ParLanNHdr), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParLanNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtParLanNHdr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1574_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParLanCap_Internalname,GXutil.ltrim( localUtil.ntoc( A3151ParLanCap, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtParLanCap_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3151ParLanCap), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3151ParLanCap), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParLanCap_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtParLanCap_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1574_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParLanFec_Internalname,localUtil.format(A3152ParLanFec, "99/99/99"),localUtil.format( A3152ParLanFec, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParLanFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtParLanFec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1574_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParLanHor_Internalname,GXutil.ltrim( localUtil.ntoc( A3901ParLanHor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtParLanHor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3901ParLanHor), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3901ParLanHor), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParLanHor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtParLanHor_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1574_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParLanNhor_Internalname,GXutil.ltrim( localUtil.ntoc( A3902ParLanNhor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtParLanNhor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3902ParLanNhor), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3902ParLanNhor), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParLanNhor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtParLanNhor_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1FK1574( ) ;
      GXCCtl = "Z3148ParLanLin_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3148ParLanLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3149ParLanLK_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3149ParLanLK, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3150ParLanNHdr_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3150ParLanNHdr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3151ParLanCap_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3151ParLanCap, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3152ParLanFec_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z3152ParLanFec, 0, "/"));
      GXCCtl = "Z3901ParLanHor_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3901ParLanHor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3902ParLanNhor_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3902ParLanNhor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1574_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1574, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1574_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1574, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1574_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1574, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1574_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1574_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARLANLIN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARLANLK_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanLK_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARLANNHDR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanNHdr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARLANCAP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanCap_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARLANFEC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanFec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARLANHOR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanHor_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARLANNHOR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanNhor_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1FK1574( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401574( ) ;
      edtavnRcdDeleted_1574_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1574_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParLanLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARLANLIN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParLanLK_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARLANLK_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParLanNHdr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARLANNHDR_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParLanCap_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARLANCAP_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParLanFec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARLANFEC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParLanHor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARLANHOR_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParLanNhor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARLANNHOR_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1574_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1574_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1574");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1574_Internalname ;
         wbErr = true ;
         nRcdDeleted_1574 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1574 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1574_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A3148ParLanLin = (short)(localUtil.ctol( httpContext.cgiGet( edtParLanLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtParLanLK_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtParLanLK_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "PARLANLK_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParLanLK_Internalname ;
         wbErr = true ;
         A3149ParLanLK = DecimalUtil.ZERO ;
         n3149ParLanLK = false ;
      }
      else
      {
         A3149ParLanLK = localUtil.ctond( httpContext.cgiGet( edtParLanLK_Internalname)) ;
         n3149ParLanLK = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParLanNHdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParLanNHdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PARLANNHDR_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParLanNHdr_Internalname ;
         wbErr = true ;
         A3150ParLanNHdr = (short)(0) ;
         n3150ParLanNHdr = false ;
      }
      else
      {
         A3150ParLanNHdr = (short)(localUtil.ctol( httpContext.cgiGet( edtParLanNHdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3150ParLanNHdr = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParLanCap_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParLanCap_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PARLANCAP_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParLanCap_Internalname ;
         wbErr = true ;
         A3151ParLanCap = (short)(0) ;
         n3151ParLanCap = false ;
      }
      else
      {
         A3151ParLanCap = (short)(localUtil.ctol( httpContext.cgiGet( edtParLanCap_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3151ParLanCap = false ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtParLanFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "PARLANFEC_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParLanFec_Internalname ;
         wbErr = true ;
         A3152ParLanFec = GXutil.nullDate() ;
         n3152ParLanFec = false ;
      }
      else
      {
         A3152ParLanFec = localUtil.ctod( httpContext.cgiGet( edtParLanFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n3152ParLanFec = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParLanHor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParLanHor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "PARLANHOR_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParLanHor_Internalname ;
         wbErr = true ;
         A3901ParLanHor = 0 ;
         n3901ParLanHor = false ;
      }
      else
      {
         A3901ParLanHor = (int)(localUtil.ctol( httpContext.cgiGet( edtParLanHor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3901ParLanHor = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParLanNhor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParLanNhor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "PARLANNHOR_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParLanNhor_Internalname ;
         wbErr = true ;
         A3902ParLanNhor = 0 ;
         n3902ParLanNhor = false ;
      }
      else
      {
         A3902ParLanNhor = (int)(localUtil.ctol( httpContext.cgiGet( edtParLanNhor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3902ParLanNhor = false ;
      }
      GXCCtl = "Z3148ParLanLin_" + sGXsfl_40_idx ;
      Z3148ParLanLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3149ParLanLK_" + sGXsfl_40_idx ;
      Z3149ParLanLK = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3150ParLanNHdr_" + sGXsfl_40_idx ;
      Z3150ParLanNHdr = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3151ParLanCap_" + sGXsfl_40_idx ;
      Z3151ParLanCap = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3152ParLanFec_" + sGXsfl_40_idx ;
      Z3152ParLanFec = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z3901ParLanHor_" + sGXsfl_40_idx ;
      Z3901ParLanHor = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3902ParLanNhor_" + sGXsfl_40_idx ;
      Z3902ParLanNhor = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1574_" + sGXsfl_40_idx ;
      nRcdDeleted_1574 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1574_" + sGXsfl_40_idx ;
      nRcdExists_1574 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1574_" + sGXsfl_40_idx ;
      nIsMod_1574 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtParLanLin_Enabled = edtParLanLin_Enabled ;
   }

   public void confirmValues1FK0( )
   {
      nGXsfl_40_idx = 0 ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401574( ) ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401574( ) ;
         httpContext.changePostValue( "Z3148ParLanLin_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z3148ParLanLin_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3148ParLanLin_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z3149ParLanLK_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z3149ParLanLK_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3149ParLanLK_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z3150ParLanNHdr_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z3150ParLanNHdr_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3150ParLanNHdr_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z3151ParLanCap_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z3151ParLanCap_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3151ParLanCap_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z3152ParLanFec_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z3152ParLanFec_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3152ParLanFec_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z3901ParLanHor_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z3901ParLanHor_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3901ParLanHor_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z3902ParLanNhor_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z3902ParLanNhor_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3902ParLanNhor_"+sGXsfl_40_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tparlan", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z3146ParLanCod", GXutil.ltrim( localUtil.ntoc( Z3146ParLanCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3147ParLanUL", GXutil.ltrim( localUtil.ntoc( Z3147ParLanUL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O3147ParLanUL", GXutil.ltrim( localUtil.ntoc( O3147ParLanUL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_40", GXutil.ltrim( localUtil.ntoc( nGXsfl_40_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV21UsurCod));
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
      return formatLink("app.tparlan", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPARLAN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PARAMETROS LANZAMIENTO", "") ;
   }

   public void initializeNonKey1FK1573( )
   {
      A3147ParLanUL = (short)(0) ;
      n3147ParLanUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
      O3147ParLanUL = A3147ParLanUL ;
      n3147ParLanUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
      Z3147ParLanUL = (short)(0) ;
   }

   public void initAll1FK1573( )
   {
      A3146ParLanCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3146ParLanCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3146ParLanCod), 2, 0));
      initializeNonKey1FK1573( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1FK1574( )
   {
      A3149ParLanLK = DecimalUtil.ZERO ;
      n3149ParLanLK = false ;
      A3150ParLanNHdr = (short)(0) ;
      n3150ParLanNHdr = false ;
      A3151ParLanCap = (short)(0) ;
      n3151ParLanCap = false ;
      A3152ParLanFec = GXutil.nullDate() ;
      n3152ParLanFec = false ;
      A3901ParLanHor = 0 ;
      n3901ParLanHor = false ;
      A3902ParLanNhor = 0 ;
      n3902ParLanNhor = false ;
      Z3149ParLanLK = DecimalUtil.ZERO ;
      Z3150ParLanNHdr = (short)(0) ;
      Z3151ParLanCap = (short)(0) ;
      Z3152ParLanFec = GXutil.nullDate() ;
      Z3901ParLanHor = 0 ;
      Z3902ParLanNhor = 0 ;
   }

   public void initAll1FK1574( )
   {
      A3148ParLanLin = (short)(0) ;
      initializeNonKey1FK1574( ) ;
   }

   public void standaloneModalInsert1FK1574( )
   {
      A3147ParLanUL = i3147ParLanUL ;
      n3147ParLanUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3147ParLanUL), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241572029", true, true);
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
      httpContext.AddJavascriptSource("tparlan.js", "?20268241572029", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1574( )
   {
      edtParLanLin_Enabled = defedtParLanLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtParLanLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParLanLin_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1574, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1574_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3148ParLanLin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3149ParLanLK, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanLK_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3150ParLanNHdr, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanNHdr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3151ParLanCap, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanCap_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A3152ParLanFec, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanFec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3901ParLanHor, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanHor_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3902ParLanNhor, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParLanNhor_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtParLanCod_Internalname = "PARLANCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtParLanUL_Internalname = "PARLANUL" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtavnRcdDeleted_1574_Internalname = "vNRCDDELETED_1574" ;
      edtParLanLin_Internalname = "PARLANLIN" ;
      edtParLanLK_Internalname = "PARLANLK" ;
      edtParLanNHdr_Internalname = "PARLANNHDR" ;
      edtParLanCap_Internalname = "PARLANCAP" ;
      edtParLanFec_Internalname = "PARLANFEC" ;
      edtParLanHor_Internalname = "PARLANHOR" ;
      edtParLanNhor_Internalname = "PARLANNHOR" ;
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
      Form.setCaption( httpContext.getMessage( "PARAMETROS LANZAMIENTO", "") );
      edtParLanNhor_Jsonclick = "" ;
      edtParLanHor_Jsonclick = "" ;
      edtParLanFec_Jsonclick = "" ;
      edtParLanCap_Jsonclick = "" ;
      edtParLanNHdr_Jsonclick = "" ;
      edtParLanLK_Jsonclick = "" ;
      edtParLanLin_Jsonclick = "" ;
      edtavnRcdDeleted_1574_Jsonclick = "" ;
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
      edtParLanNhor_Enabled = 1 ;
      edtParLanHor_Enabled = 1 ;
      edtParLanFec_Enabled = 1 ;
      edtParLanCap_Enabled = 1 ;
      edtParLanNHdr_Enabled = 1 ;
      edtParLanLK_Enabled = 1 ;
      edtParLanLin_Enabled = 0 ;
      edtavnRcdDeleted_1574_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtParLanUL_Jsonclick = "" ;
      edtParLanUL_Backcolor = (int)(0xFFFFFF) ;
      edtParLanUL_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtParLanCod_Jsonclick = "" ;
      edtParLanCod_Backcolor = (int)(0xFFFFFF) ;
      edtParLanCod_Enabled = 1 ;
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
      subsflControlProps_401574( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1FK1574( ) ;
         standaloneModal1FK1574( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1FK1574( ) ;
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401574( ) ;
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
      /* Using cursor T01FK22 */
      pr_default.execute(20, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FK22_A407EmprNom[0] ;
      n407EmprNom = T01FK22_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(20);
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

   public void valid_Parlancod( )
   {
      n3147ParLanUL = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3147ParLanUL", GXutil.ltrim( localUtil.ntoc( A3147ParLanUL, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "AV21UsurCod", GXutil.rtrim( AV21UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3146ParLanCod", GXutil.ltrim( localUtil.ntoc( Z3146ParLanCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3147ParLanUL", GXutil.ltrim( localUtil.ntoc( Z3147ParLanUL, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV21UsurCod", GXutil.rtrim( ZV21UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "O3147ParLanUL", GXutil.ltrim( localUtil.ntoc( O3147ParLanUL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("VALID_PARLANCOD","{handler:'valid_Parlancod',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A3147ParLanUL',fld:'PARLANUL',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3146ParLanCod',fld:'PARLANCOD',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV21UsurCod',fld:'vUSURCOD',pic:''}]");
      setEventMetadata("VALID_PARLANCOD",",oparms:[{av:'A3147ParLanUL',fld:'PARLANUL',pic:'ZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'AV21UsurCod',fld:'vUSURCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z3146ParLanCod'},{av:'Z3147ParLanUL'},{av:'Z407EmprNom'},{av:'ZV21UsurCod'},{av:'O3147ParLanUL'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_PARLANUL","{handler:'valid_Parlanul',iparms:[]");
      setEventMetadata("VALID_PARLANUL",",oparms:[]}");
      setEventMetadata("VALID_PARLANLIN","{handler:'valid_Parlanlin',iparms:[]");
      setEventMetadata("VALID_PARLANLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Parlannhor',iparms:[]");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z3149ParLanLK = DecimalUtil.ZERO ;
      Z3152ParLanFec = GXutil.nullDate() ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      A396EmprCod = "" ;
      lblTextblock2_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1574 = "" ;
      Gx_mode = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV21UsurCod = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1573 = "" ;
      A3149ParLanLK = DecimalUtil.ZERO ;
      A3152ParLanFec = GXutil.nullDate() ;
      AV22LitFe = "" ;
      AV16Lit0 = "" ;
      AV17Lit1 = "" ;
      AV18Lit2 = "" ;
      AV19Lit3 = "" ;
      AV20Lit4 = "" ;
      AV23Lit5 = "" ;
      GXt_char1 = "" ;
      AV24Station = "" ;
      GXv_char2 = new String[1] ;
      AV25EmprNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      T01FK6_A407EmprNom = new String[] {""} ;
      T01FK6_n407EmprNom = new boolean[] {false} ;
      T01FK7_A3146ParLanCod = new byte[1] ;
      T01FK7_A3147ParLanUL = new short[1] ;
      T01FK7_n3147ParLanUL = new boolean[] {false} ;
      T01FK7_A407EmprNom = new String[] {""} ;
      T01FK7_n407EmprNom = new boolean[] {false} ;
      T01FK7_A396EmprCod = new String[] {""} ;
      T01FK8_A396EmprCod = new String[] {""} ;
      T01FK8_A3146ParLanCod = new byte[1] ;
      T01FK5_A3146ParLanCod = new byte[1] ;
      T01FK5_A3147ParLanUL = new short[1] ;
      T01FK5_n3147ParLanUL = new boolean[] {false} ;
      T01FK5_A396EmprCod = new String[] {""} ;
      T01FK9_A396EmprCod = new String[] {""} ;
      T01FK9_A3146ParLanCod = new byte[1] ;
      T01FK10_A396EmprCod = new String[] {""} ;
      T01FK10_A3146ParLanCod = new byte[1] ;
      T01FK4_A3146ParLanCod = new byte[1] ;
      T01FK4_A3147ParLanUL = new short[1] ;
      T01FK4_n3147ParLanUL = new boolean[] {false} ;
      T01FK4_A396EmprCod = new String[] {""} ;
      T01FK15_A396EmprCod = new String[] {""} ;
      T01FK15_A3146ParLanCod = new byte[1] ;
      T01FK16_A396EmprCod = new String[] {""} ;
      T01FK16_A3146ParLanCod = new byte[1] ;
      T01FK16_A3148ParLanLin = new short[1] ;
      T01FK16_A3149ParLanLK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FK16_n3149ParLanLK = new boolean[] {false} ;
      T01FK16_A3150ParLanNHdr = new short[1] ;
      T01FK16_n3150ParLanNHdr = new boolean[] {false} ;
      T01FK16_A3151ParLanCap = new short[1] ;
      T01FK16_n3151ParLanCap = new boolean[] {false} ;
      T01FK16_A3152ParLanFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01FK16_n3152ParLanFec = new boolean[] {false} ;
      T01FK16_A3901ParLanHor = new int[1] ;
      T01FK16_n3901ParLanHor = new boolean[] {false} ;
      T01FK16_A3902ParLanNhor = new int[1] ;
      T01FK16_n3902ParLanNhor = new boolean[] {false} ;
      T01FK17_A396EmprCod = new String[] {""} ;
      T01FK17_A3146ParLanCod = new byte[1] ;
      T01FK17_A3148ParLanLin = new short[1] ;
      T01FK3_A396EmprCod = new String[] {""} ;
      T01FK3_A3146ParLanCod = new byte[1] ;
      T01FK3_A3148ParLanLin = new short[1] ;
      T01FK3_A3149ParLanLK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FK3_n3149ParLanLK = new boolean[] {false} ;
      T01FK3_A3150ParLanNHdr = new short[1] ;
      T01FK3_n3150ParLanNHdr = new boolean[] {false} ;
      T01FK3_A3151ParLanCap = new short[1] ;
      T01FK3_n3151ParLanCap = new boolean[] {false} ;
      T01FK3_A3152ParLanFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01FK3_n3152ParLanFec = new boolean[] {false} ;
      T01FK3_A3901ParLanHor = new int[1] ;
      T01FK3_n3901ParLanHor = new boolean[] {false} ;
      T01FK3_A3902ParLanNhor = new int[1] ;
      T01FK3_n3902ParLanNhor = new boolean[] {false} ;
      T01FK2_A396EmprCod = new String[] {""} ;
      T01FK2_A3146ParLanCod = new byte[1] ;
      T01FK2_A3148ParLanLin = new short[1] ;
      T01FK2_A3149ParLanLK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FK2_n3149ParLanLK = new boolean[] {false} ;
      T01FK2_A3150ParLanNHdr = new short[1] ;
      T01FK2_n3150ParLanNHdr = new boolean[] {false} ;
      T01FK2_A3151ParLanCap = new short[1] ;
      T01FK2_n3151ParLanCap = new boolean[] {false} ;
      T01FK2_A3152ParLanFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01FK2_n3152ParLanFec = new boolean[] {false} ;
      T01FK2_A3901ParLanHor = new int[1] ;
      T01FK2_n3901ParLanHor = new boolean[] {false} ;
      T01FK2_A3902ParLanNhor = new int[1] ;
      T01FK2_n3902ParLanNhor = new boolean[] {false} ;
      T01FK21_A396EmprCod = new String[] {""} ;
      T01FK21_A3146ParLanCod = new byte[1] ;
      T01FK21_A3148ParLanLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01FK22_A407EmprNom = new String[] {""} ;
      T01FK22_n407EmprNom = new boolean[] {false} ;
      ZV21UsurCod = "" ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZV21UsurCod = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tparlan__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tparlan__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tparlan__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tparlan__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tparlan__default(),
         new Object[] {
             new Object[] {
            T01FK2_A396EmprCod, T01FK2_A3146ParLanCod, T01FK2_A3148ParLanLin, T01FK2_A3149ParLanLK, T01FK2_n3149ParLanLK, T01FK2_A3150ParLanNHdr, T01FK2_n3150ParLanNHdr, T01FK2_A3151ParLanCap, T01FK2_n3151ParLanCap, T01FK2_A3152ParLanFec,
            T01FK2_n3152ParLanFec, T01FK2_A3901ParLanHor, T01FK2_n3901ParLanHor, T01FK2_A3902ParLanNhor, T01FK2_n3902ParLanNhor
            }
            , new Object[] {
            T01FK3_A396EmprCod, T01FK3_A3146ParLanCod, T01FK3_A3148ParLanLin, T01FK3_A3149ParLanLK, T01FK3_n3149ParLanLK, T01FK3_A3150ParLanNHdr, T01FK3_n3150ParLanNHdr, T01FK3_A3151ParLanCap, T01FK3_n3151ParLanCap, T01FK3_A3152ParLanFec,
            T01FK3_n3152ParLanFec, T01FK3_A3901ParLanHor, T01FK3_n3901ParLanHor, T01FK3_A3902ParLanNhor, T01FK3_n3902ParLanNhor
            }
            , new Object[] {
            T01FK4_A3146ParLanCod, T01FK4_A3147ParLanUL, T01FK4_n3147ParLanUL, T01FK4_A396EmprCod
            }
            , new Object[] {
            T01FK5_A3146ParLanCod, T01FK5_A3147ParLanUL, T01FK5_n3147ParLanUL, T01FK5_A396EmprCod
            }
            , new Object[] {
            T01FK6_A407EmprNom, T01FK6_n407EmprNom
            }
            , new Object[] {
            T01FK7_A3146ParLanCod, T01FK7_A3147ParLanUL, T01FK7_n3147ParLanUL, T01FK7_A407EmprNom, T01FK7_n407EmprNom, T01FK7_A396EmprCod
            }
            , new Object[] {
            T01FK8_A396EmprCod, T01FK8_A3146ParLanCod
            }
            , new Object[] {
            T01FK9_A396EmprCod, T01FK9_A3146ParLanCod
            }
            , new Object[] {
            T01FK10_A396EmprCod, T01FK10_A3146ParLanCod
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
            T01FK15_A396EmprCod, T01FK15_A3146ParLanCod
            }
            , new Object[] {
            T01FK16_A396EmprCod, T01FK16_A3146ParLanCod, T01FK16_A3148ParLanLin, T01FK16_A3149ParLanLK, T01FK16_n3149ParLanLK, T01FK16_A3150ParLanNHdr, T01FK16_n3150ParLanNHdr, T01FK16_A3151ParLanCap, T01FK16_n3151ParLanCap, T01FK16_A3152ParLanFec,
            T01FK16_n3152ParLanFec, T01FK16_A3901ParLanHor, T01FK16_n3901ParLanHor, T01FK16_A3902ParLanNhor, T01FK16_n3902ParLanNhor
            }
            , new Object[] {
            T01FK17_A396EmprCod, T01FK17_A3146ParLanCod, T01FK17_A3148ParLanLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FK21_A396EmprCod, T01FK21_A3146ParLanCod, T01FK21_A3148ParLanLin
            }
            , new Object[] {
            T01FK22_A407EmprNom, T01FK22_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z3146ParLanCod ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A3146ParLanCod ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ3146ParLanCod ;
   private short Z3147ParLanUL ;
   private short O3147ParLanUL ;
   private short Z3148ParLanLin ;
   private short Z3150ParLanNHdr ;
   private short Z3151ParLanCap ;
   private short nRcdDeleted_1574 ;
   private short nRcdExists_1574 ;
   private short nIsMod_1574 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A3147ParLanUL ;
   private short nBlankRcdCount1574 ;
   private short RcdFound1574 ;
   private short B3147ParLanUL ;
   private short nBlankRcdUsr1574 ;
   private short s3147ParLanUL ;
   private short A3148ParLanLin ;
   private short A3150ParLanNHdr ;
   private short A3151ParLanCap ;
   private short RcdFound1573 ;
   private short nIsDirty_1573 ;
   private short nIsDirty_1574 ;
   private short i3147ParLanUL ;
   private short ZZ3147ParLanUL ;
   private short ZO3147ParLanUL ;
   private int nRC_GXsfl_40 ;
   private int nGXsfl_40_idx=1 ;
   private int Z3901ParLanHor ;
   private int Z3902ParLanNhor ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtParLanCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtParLanUL_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtavnRcdDeleted_1574_Enabled ;
   private int edtParLanLin_Enabled ;
   private int edtParLanLK_Enabled ;
   private int edtParLanNHdr_Enabled ;
   private int edtParLanCap_Enabled ;
   private int edtParLanFec_Enabled ;
   private int edtParLanHor_Enabled ;
   private int edtParLanNhor_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A3901ParLanHor ;
   private int A3902ParLanNhor ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtParLanLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtParLanUL_Backcolor ;
   private int edtParLanCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z3149ParLanLK ;
   private java.math.BigDecimal A3149ParLanLK ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtParLanCod_Internalname ;
   private String sGXsfl_40_idx="0001" ;
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
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtParLanCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtParLanUL_Internalname ;
   private String edtParLanUL_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode1574 ;
   private String Gx_mode ;
   private String edtavnRcdDeleted_1574_Internalname ;
   private String edtParLanLin_Internalname ;
   private String edtParLanLK_Internalname ;
   private String edtParLanNHdr_Internalname ;
   private String edtParLanCap_Internalname ;
   private String edtParLanFec_Internalname ;
   private String edtParLanHor_Internalname ;
   private String edtParLanNhor_Internalname ;
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
   private String AV21UsurCod ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1573 ;
   private String AV22LitFe ;
   private String AV16Lit0 ;
   private String AV17Lit1 ;
   private String AV18Lit2 ;
   private String AV19Lit3 ;
   private String AV20Lit4 ;
   private String AV23Lit5 ;
   private String GXt_char1 ;
   private String AV24Station ;
   private String GXv_char2[] ;
   private String AV25EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sGXsfl_40_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1574_Jsonclick ;
   private String edtParLanLin_Jsonclick ;
   private String edtParLanLK_Jsonclick ;
   private String edtParLanNHdr_Jsonclick ;
   private String edtParLanCap_Jsonclick ;
   private String edtParLanFec_Jsonclick ;
   private String edtParLanHor_Jsonclick ;
   private String edtParLanNhor_Jsonclick ;
   private String GXCCtl ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZV21UsurCod ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZV21UsurCod ;
   private java.util.Date Z3152ParLanFec ;
   private java.util.Date A3152ParLanFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n3147ParLanUL ;
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n3149ParLanLK ;
   private boolean n3150ParLanNHdr ;
   private boolean n3151ParLanCap ;
   private boolean n3152ParLanFec ;
   private boolean n3901ParLanHor ;
   private boolean n3902ParLanNhor ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01FK6_A407EmprNom ;
   private boolean[] T01FK6_n407EmprNom ;
   private byte[] T01FK7_A3146ParLanCod ;
   private short[] T01FK7_A3147ParLanUL ;
   private boolean[] T01FK7_n3147ParLanUL ;
   private String[] T01FK7_A407EmprNom ;
   private boolean[] T01FK7_n407EmprNom ;
   private String[] T01FK7_A396EmprCod ;
   private String[] T01FK8_A396EmprCod ;
   private byte[] T01FK8_A3146ParLanCod ;
   private byte[] T01FK5_A3146ParLanCod ;
   private short[] T01FK5_A3147ParLanUL ;
   private boolean[] T01FK5_n3147ParLanUL ;
   private String[] T01FK5_A396EmprCod ;
   private String[] T01FK9_A396EmprCod ;
   private byte[] T01FK9_A3146ParLanCod ;
   private String[] T01FK10_A396EmprCod ;
   private byte[] T01FK10_A3146ParLanCod ;
   private byte[] T01FK4_A3146ParLanCod ;
   private short[] T01FK4_A3147ParLanUL ;
   private boolean[] T01FK4_n3147ParLanUL ;
   private String[] T01FK4_A396EmprCod ;
   private String[] T01FK15_A396EmprCod ;
   private byte[] T01FK15_A3146ParLanCod ;
   private String[] T01FK16_A396EmprCod ;
   private byte[] T01FK16_A3146ParLanCod ;
   private short[] T01FK16_A3148ParLanLin ;
   private java.math.BigDecimal[] T01FK16_A3149ParLanLK ;
   private boolean[] T01FK16_n3149ParLanLK ;
   private short[] T01FK16_A3150ParLanNHdr ;
   private boolean[] T01FK16_n3150ParLanNHdr ;
   private short[] T01FK16_A3151ParLanCap ;
   private boolean[] T01FK16_n3151ParLanCap ;
   private java.util.Date[] T01FK16_A3152ParLanFec ;
   private boolean[] T01FK16_n3152ParLanFec ;
   private int[] T01FK16_A3901ParLanHor ;
   private boolean[] T01FK16_n3901ParLanHor ;
   private int[] T01FK16_A3902ParLanNhor ;
   private boolean[] T01FK16_n3902ParLanNhor ;
   private String[] T01FK17_A396EmprCod ;
   private byte[] T01FK17_A3146ParLanCod ;
   private short[] T01FK17_A3148ParLanLin ;
   private String[] T01FK3_A396EmprCod ;
   private byte[] T01FK3_A3146ParLanCod ;
   private short[] T01FK3_A3148ParLanLin ;
   private java.math.BigDecimal[] T01FK3_A3149ParLanLK ;
   private boolean[] T01FK3_n3149ParLanLK ;
   private short[] T01FK3_A3150ParLanNHdr ;
   private boolean[] T01FK3_n3150ParLanNHdr ;
   private short[] T01FK3_A3151ParLanCap ;
   private boolean[] T01FK3_n3151ParLanCap ;
   private java.util.Date[] T01FK3_A3152ParLanFec ;
   private boolean[] T01FK3_n3152ParLanFec ;
   private int[] T01FK3_A3901ParLanHor ;
   private boolean[] T01FK3_n3901ParLanHor ;
   private int[] T01FK3_A3902ParLanNhor ;
   private boolean[] T01FK3_n3902ParLanNhor ;
   private String[] T01FK2_A396EmprCod ;
   private byte[] T01FK2_A3146ParLanCod ;
   private short[] T01FK2_A3148ParLanLin ;
   private java.math.BigDecimal[] T01FK2_A3149ParLanLK ;
   private boolean[] T01FK2_n3149ParLanLK ;
   private short[] T01FK2_A3150ParLanNHdr ;
   private boolean[] T01FK2_n3150ParLanNHdr ;
   private short[] T01FK2_A3151ParLanCap ;
   private boolean[] T01FK2_n3151ParLanCap ;
   private java.util.Date[] T01FK2_A3152ParLanFec ;
   private boolean[] T01FK2_n3152ParLanFec ;
   private int[] T01FK2_A3901ParLanHor ;
   private boolean[] T01FK2_n3901ParLanHor ;
   private int[] T01FK2_A3902ParLanNhor ;
   private boolean[] T01FK2_n3902ParLanNhor ;
   private String[] T01FK21_A396EmprCod ;
   private byte[] T01FK21_A3146ParLanCod ;
   private short[] T01FK21_A3148ParLanLin ;
   private String[] T01FK22_A407EmprNom ;
   private boolean[] T01FK22_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tparlan__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tparlan__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tparlan__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tparlan__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tparlan__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01FK2", "SELECT EmprCod, ParLanCod, ParLanLin, ParLanLK, ParLanNHdr, ParLanCap, ParLanFec, ParLanHor, ParLanNhor FROM TXPLPARLA WHERE EmprCod = ? AND ParLanCod = ? AND ParLanLin = ?  FOR UPDATE OF ParLanLK, ParLanNHdr, ParLanCap, ParLanFec, ParLanHor, ParLanNhor NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FK3", "SELECT EmprCod, ParLanCod, ParLanLin, ParLanLK, ParLanNHdr, ParLanCap, ParLanFec, ParLanHor, ParLanNhor FROM TXPLPARLA WHERE EmprCod = ? AND ParLanCod = ? AND ParLanLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FK4", "SELECT ParLanCod, ParLanUL, EmprCod FROM TXPCPARLA WHERE EmprCod = ? AND ParLanCod = ?  FOR UPDATE OF ParLanUL NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FK5", "SELECT ParLanCod, ParLanUL, EmprCod FROM TXPCPARLA WHERE EmprCod = ? AND ParLanCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FK6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FK7", "SELECT /*+ FIRST_ROWS(100) */ TM1.ParLanCod, TM1.ParLanUL, T2.EmprNom, TM1.EmprCod FROM (TXPCPARLA TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.ParLanCod = ? ORDER BY TM1.EmprCod, TM1.ParLanCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FK8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ParLanCod FROM TXPCPARLA WHERE EmprCod = ? AND ParLanCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FK9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ParLanCod FROM TXPCPARLA WHERE ( ParLanCod > ?) and EmprCod = ? ORDER BY EmprCod, ParLanCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FK10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ParLanCod FROM TXPCPARLA WHERE ( ParLanCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, ParLanCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01FK11", "INSERT INTO TXPCPARLA(ParLanCod, ParLanUL, EmprCod) VALUES(?, ?, ?)", GX_NOMASK, "TXPCPARLA")
         ,new UpdateCursor("T01FK12", "UPDATE TXPCPARLA SET ParLanUL=?  WHERE EmprCod = ? AND ParLanCod = ?", GX_NOMASK, "TXPCPARLA")
         ,new UpdateCursor("T01FK13", "DELETE FROM TXPCPARLA  WHERE EmprCod = ? AND ParLanCod = ?", GX_NOMASK, "TXPCPARLA")
         ,new UpdateCursor("T01FK14", "UPDATE TXPCPARLA SET ParLanUL=?  WHERE EmprCod = ? AND ParLanCod = ?", GX_NOMASK, "TXPCPARLA")
         ,new ForEachCursor("T01FK15", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ParLanCod FROM TXPCPARLA WHERE EmprCod = ? ORDER BY EmprCod, ParLanCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FK16", "SELECT EmprCod, ParLanCod, ParLanLin, ParLanLK, ParLanNHdr, ParLanCap, ParLanFec, ParLanHor, ParLanNhor FROM TXPLPARLA WHERE EmprCod = ? and ParLanCod = ? and ParLanLin = ? ORDER BY EmprCod, ParLanCod, ParLanLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FK17", "SELECT EmprCod, ParLanCod, ParLanLin FROM TXPLPARLA WHERE EmprCod = ? AND ParLanCod = ? AND ParLanLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01FK18", "INSERT INTO TXPLPARLA(EmprCod, ParLanCod, ParLanLin, ParLanLK, ParLanNHdr, ParLanCap, ParLanFec, ParLanHor, ParLanNhor) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLPARLA")
         ,new UpdateCursor("T01FK19", "UPDATE TXPLPARLA SET ParLanLK=?, ParLanNHdr=?, ParLanCap=?, ParLanFec=?, ParLanHor=?, ParLanNhor=?  WHERE EmprCod = ? AND ParLanCod = ? AND ParLanLin = ?", GX_NOMASK, "TXPLPARLA")
         ,new UpdateCursor("T01FK20", "DELETE FROM TXPLPARLA  WHERE EmprCod = ? AND ParLanCod = ? AND ParLanLin = ?", GX_NOMASK, "TXPLPARLA")
         ,new ForEachCursor("T01FK21", "SELECT EmprCod, ParLanCod, ParLanLin FROM TXPLPARLA WHERE EmprCod = ? and ParLanCod = ? ORDER BY EmprCod, ParLanCod, ParLanLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FK22", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 20 :
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 7 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 8 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 9 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
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
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[6]).shortValue());
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
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[10]);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[12]).intValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[14]).intValue());
               }
               return;
            case 17 :
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
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[11]).intValue());
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setByte(8, ((Number) parms[13]).byteValue());
               stmt.setShort(9, ((Number) parms[14]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

