package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tlcoprv_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
      if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
      {
         A396EmprCod = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A4052EstNumFor = (int)(GXutil.lval( httpContext.GetPar( "EstNumFor"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4052EstNumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4052EstNumFor), 8, 0));
         }
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Productos especiales", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEstNumCol_Internalname ;
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
      A4089EstEspUlt = (byte)(GXutil.lval( httpContext.GetPar( "EstEspUlt"))) ;
      n4089EstEspUlt = false ;
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

   public tlcoprv_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tlcoprv_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tlcoprv_impl.class ));
   }

   public tlcoprv_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLcoprv.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLcoprv.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLcoprv.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLcoprv.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TLcoprv.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLcoprv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLcoprv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLcoprv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLcoprv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Numero de formula Interno", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLcoprv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstNumFor_Internalname, GXutil.ltrim( localUtil.ntoc( A4052EstNumFor, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstNumFor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4052EstNumFor), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4052EstNumFor), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstNumFor_Jsonclick, 0, "", "", "", "", "", 1, edtEstNumFor_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLcoprv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Numero de color", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLcoprv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstNumCol_Internalname, GXutil.ltrim( localUtil.ntoc( A4053EstNumCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstNumCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4053EstNumCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4053EstNumCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstNumCol_Jsonclick, 0, "", "", "", "", "", 1, edtEstNumCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLcoprv.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLcoprv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Ultima Linea Productos especia", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLcoprv.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstEspUlt_Internalname, GXutil.ltrim( localUtil.ntoc( A4089EstEspUlt, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstEspUlt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4089EstEspUlt), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4089EstEspUlt), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstEspUlt_Jsonclick, 0, "", "", "", "", "", 1, edtEstEspUlt_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLcoprv.htm");
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
         nBlankRcdCount1589 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1589 = (short)(1) ;
            scanStart1FW1589( ) ;
            while ( RcdFound1589 != 0 )
            {
               init_level_properties1589( ) ;
               getByPrimaryKey1FW1589( ) ;
               addRow1FW1589( ) ;
               scanNext1FW1589( ) ;
            }
            scanEnd1FW1589( ) ;
            nBlankRcdCount1589 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B4089EstEspUlt = A4089EstEspUlt ;
         n4089EstEspUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
         standaloneNotModal1FW1589( ) ;
         standaloneModal1FW1589( ) ;
         sMode1589 = Gx_mode ;
         while ( nGXsfl_45_idx < nRC_GXsfl_45 )
         {
            bGXsfl_45_Refreshing = true ;
            readRow1FW1589( ) ;
            edtavnRcdDeleted_1589_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1589_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1589_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1589_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtEstEspLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTESPLIN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEstEspLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstEspLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtEstCante_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTCANTE_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEstCante_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCante_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtEstUniMed_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTUNIMED_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEstUniMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstUniMed_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtEstOrden_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTORDEN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEstOrden_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstOrden_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            if ( ( nRcdExists_1589 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1FW1589( ) ;
            }
            sendRow1FW1589( ) ;
            bGXsfl_45_Refreshing = false ;
         }
         Gx_mode = sMode1589 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A4089EstEspUlt = B4089EstEspUlt ;
         n4089EstEspUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1589 = (short)(5) ;
         nRcdExists_1589 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1FW1589( ) ;
            while ( RcdFound1589 != 0 )
            {
               sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_451589( ) ;
               init_level_properties1589( ) ;
               standaloneNotModal1FW1589( ) ;
               getByPrimaryKey1FW1589( ) ;
               standaloneModal1FW1589( ) ;
               addRow1FW1589( ) ;
               scanNext1FW1589( ) ;
            }
            scanEnd1FW1589( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1589 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_451589( ) ;
      initAll1FW1589( ) ;
      init_level_properties1589( ) ;
      B4089EstEspUlt = A4089EstEspUlt ;
      n4089EstEspUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
      nRcdExists_1589 = (short)(0) ;
      nIsMod_1589 = (short)(0) ;
      nRcdDeleted_1589 = (short)(0) ;
      nBlankRcdCount1589 = (short)(nBlankRcdUsr1589+nBlankRcdCount1589) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1589 > 0 )
      {
         standaloneNotModal1FW1589( ) ;
         standaloneModal1FW1589( ) ;
         addRow1FW1589( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtPrdNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1589 = (short)(nBlankRcdCount1589-1) ;
      }
      Gx_mode = sMode1589 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A4089EstEspUlt = B4089EstEspUlt ;
      n4089EstEspUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLcoprv.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLcoprv.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLcoprv.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLcoprv.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TLcoprv.htm");
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
      e111FW2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z4052EstNumFor = (int)(localUtil.ctol( httpContext.cgiGet( "Z4052EstNumFor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4053EstNumCol = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4053EstNumCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4089EstEspUlt = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4089EstEspUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O4089EstEspUlt = (byte)(localUtil.ctol( httpContext.cgiGet( "O4089EstEspUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A4052EstNumFor = (int)(localUtil.ctol( httpContext.cgiGet( edtEstNumFor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4052EstNumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4052EstNumFor), 8, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTNUMCOL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstNumCol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4053EstNumCol = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4053EstNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4053EstNumCol), 2, 0));
            }
            else
            {
               A4053EstNumCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4053EstNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4053EstNumCol), 2, 0));
            }
            A4089EstEspUlt = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstEspUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4089EstEspUlt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
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
               A4052EstNumFor = (int)(GXutil.lval( httpContext.GetPar( "EstNumFor"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4052EstNumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4052EstNumFor), 8, 0));
               A4053EstNumCol = (byte)(GXutil.lval( httpContext.GetPar( "EstNumCol"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4053EstNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4053EstNumCol), 2, 0));
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
                     if ( GXutil.strcmp(sEvt, "'UNIDADES'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'unidades' */
                        e121FW2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e111FW2 ();
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
            initAll1FW1585( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1589_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1589_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      disableAttributes1FW1585( ) ;
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

   public void confirm_1FW0( )
   {
      beforeValidate1FW1585( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1FW1585( ) ;
         }
         else
         {
            checkExtendedTable1FW1585( ) ;
            if ( AnyError == 0 )
            {
               zm1FW1585( 7) ;
            }
            closeExtendedTableCursors1FW1585( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1585 = Gx_mode ;
         confirm_1FW1589( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1585 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1585 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1FW0( ) ;
      }
   }

   public void confirm_1FW1589( )
   {
      s4089EstEspUlt = O4089EstEspUlt ;
      n4089EstEspUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1FW1589( ) ;
         if ( ( nRcdExists_1589 != 0 ) || ( nIsMod_1589 != 0 ) )
         {
            getKey1FW1589( ) ;
            if ( ( nRcdExists_1589 == 0 ) && ( nRcdDeleted_1589 == 0 ) )
            {
               if ( RcdFound1589 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1FW1589( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1FW1589( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1FW1589( 9) ;
                     }
                     closeExtendedTableCursors1FW1589( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O4089EstEspUlt = A4089EstEspUlt ;
                     n4089EstEspUlt = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "ESTNUMCOL");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEstNumCol_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1589 != 0 )
               {
                  if ( nRcdDeleted_1589 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1FW1589( ) ;
                     load1FW1589( ) ;
                     beforeValidate1FW1589( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1FW1589( ) ;
                        O4089EstEspUlt = A4089EstEspUlt ;
                        n4089EstEspUlt = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1589 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1FW1589( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1FW1589( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1FW1589( 9) ;
                           }
                           closeExtendedTableCursors1FW1589( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O4089EstEspUlt = A4089EstEspUlt ;
                           n4089EstEspUlt = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1589 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ESTNUMCOL");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEstNumCol_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1589_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1589, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstEspLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4090EstEspLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtEstCante_Internalname, GXutil.ltrim( localUtil.ntoc( A4091EstCante, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstUniMed_Internalname, GXutil.ltrim( localUtil.ntoc( A4092EstUniMed, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstOrden_Internalname, GXutil.ltrim( localUtil.ntoc( A4093EstOrden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4090EstEspLin_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z4090EstEspLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4091EstCante_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z4091EstCante, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4092EstUniMed_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z4092EstUniMed, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4093EstOrden_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z4093EstOrden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_45_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_1589_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1589, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1589_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1589, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1589_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1589, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1589 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1589_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1589_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTESPLIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstEspLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTCANTE_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstCante_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTUNIMED_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstUniMed_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTORDEN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstOrden_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O4089EstEspUlt = s4089EstEspUlt ;
      n4089EstEspUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1FW0( )
   {
   }

   public void e111FW2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tlcoprv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      AV10Lit1 = httpContext.getMessage( "PRODUCTOS ESPECIALES", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tlcoprv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tlcoprv_impl.this.A396EmprCod = GXv_char2[0] ;
      tlcoprv_impl.this.AV11EmprNom = GXv_char3[0] ;
      tlcoprv_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e121FW2( )
   {
      /* 'unidades' Routine */
      returnInSub = false ;
      /*  Sending Event outputs  */
   }

   public void zm1FW1585( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4089EstEspUlt = T01FW6_A4089EstEspUlt[0] ;
         }
         else
         {
            Z4089EstEspUlt = A4089EstEspUlt ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z4052EstNumFor = A4052EstNumFor ;
         Z4053EstNumCol = A4053EstNumCol ;
         Z4089EstEspUlt = A4089EstEspUlt ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtEstEspUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstEspUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstEspUlt_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtEstEspUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstEspUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstEspUlt_Enabled), 5, 0), true);
      /* Using cursor T01FW7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FW7_A407EmprNom[0] ;
      n407EmprNom = T01FW7_n407EmprNom[0] ;
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

   public void load1FW1585( )
   {
      /* Using cursor T01FW8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1585 = (short)(1) ;
         A407EmprNom = T01FW8_A407EmprNom[0] ;
         n407EmprNom = T01FW8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4089EstEspUlt = T01FW8_A4089EstEspUlt[0] ;
         n4089EstEspUlt = T01FW8_n4089EstEspUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
         zm1FW1585( -6) ;
      }
      pr_default.close(6);
      onLoadActions1FW1585( ) ;
   }

   public void onLoadActions1FW1585( )
   {
   }

   public void checkExtendedTable1FW1585( )
   {
      nIsDirty_1585 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1FW1585( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1FW1585( )
   {
      /* Using cursor T01FW9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1585 = (short)(1) ;
      }
      else
      {
         RcdFound1585 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01FW6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol)});
      if ( (pr_default.getStatus(4) != 101) && ( T01FW6_A4052EstNumFor[0] == A4052EstNumFor ) && ( GXutil.strcmp(T01FW6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1FW1585( 6) ;
         RcdFound1585 = (short)(1) ;
         A4053EstNumCol = T01FW6_A4053EstNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4053EstNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4053EstNumCol), 2, 0));
         A4089EstEspUlt = T01FW6_A4089EstEspUlt[0] ;
         n4089EstEspUlt = T01FW6_n4089EstEspUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
         O4089EstEspUlt = A4089EstEspUlt ;
         n4089EstEspUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z4052EstNumFor = A4052EstNumFor ;
         Z4053EstNumCol = A4053EstNumCol ;
         sMode1585 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1FW1585( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1585 = (short)(0) ;
            initializeNonKey1FW1585( ) ;
         }
         Gx_mode = sMode1585 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1585 = (short)(0) ;
         initializeNonKey1FW1585( ) ;
         sMode1585 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1585 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1FW1585( ) ;
      if ( RcdFound1585 == 0 )
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
      RcdFound1585 = (short)(0) ;
      /* Using cursor T01FW10 */
      pr_default.execute(8, new Object[] {Byte.valueOf(A4053EstNumCol), A396EmprCod, Integer.valueOf(A4052EstNumFor)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T01FW10_A4053EstNumCol[0] < A4053EstNumCol ) ) && ( GXutil.strcmp(T01FW10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FW10_A4052EstNumFor[0] == A4052EstNumFor ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T01FW10_A4053EstNumCol[0] > A4053EstNumCol ) ) && ( GXutil.strcmp(T01FW10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FW10_A4052EstNumFor[0] == A4052EstNumFor ) )
         {
            A4053EstNumCol = T01FW10_A4053EstNumCol[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4053EstNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4053EstNumCol), 2, 0));
            RcdFound1585 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1585 = (short)(0) ;
      /* Using cursor T01FW11 */
      pr_default.execute(9, new Object[] {Byte.valueOf(A4053EstNumCol), A396EmprCod, Integer.valueOf(A4052EstNumFor)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T01FW11_A4053EstNumCol[0] > A4053EstNumCol ) ) && ( GXutil.strcmp(T01FW11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FW11_A4052EstNumFor[0] == A4052EstNumFor ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T01FW11_A4053EstNumCol[0] < A4053EstNumCol ) ) && ( GXutil.strcmp(T01FW11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FW11_A4052EstNumFor[0] == A4052EstNumFor ) )
         {
            A4053EstNumCol = T01FW11_A4053EstNumCol[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4053EstNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4053EstNumCol), 2, 0));
            RcdFound1585 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1FW1585( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A4089EstEspUlt = O4089EstEspUlt ;
         n4089EstEspUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
         GX_FocusControl = edtEstNumCol_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1FW1585( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1585 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4052EstNumFor != Z4052EstNumFor ) || ( A4053EstNumCol != Z4053EstNumCol ) )
            {
               A4053EstNumCol = Z4053EstNumCol ;
               httpContext.ajax_rsp_assign_attri("", false, "A4053EstNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4053EstNumCol), 2, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A4089EstEspUlt = O4089EstEspUlt ;
               n4089EstEspUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEstNumCol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A4089EstEspUlt = O4089EstEspUlt ;
               n4089EstEspUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
               update1FW1585( ) ;
               GX_FocusControl = edtEstNumCol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4052EstNumFor != Z4052EstNumFor ) || ( A4053EstNumCol != Z4053EstNumCol ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A4089EstEspUlt = O4089EstEspUlt ;
               n4089EstEspUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
               GX_FocusControl = edtEstNumCol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1FW1585( ) ;
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
                  A4089EstEspUlt = O4089EstEspUlt ;
                  n4089EstEspUlt = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
                  GX_FocusControl = edtEstNumCol_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1FW1585( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4052EstNumFor != Z4052EstNumFor ) || ( A4053EstNumCol != Z4053EstNumCol ) )
      {
         A4053EstNumCol = Z4053EstNumCol ;
         httpContext.ajax_rsp_assign_attri("", false, "A4053EstNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4053EstNumCol), 2, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A4089EstEspUlt = O4089EstEspUlt ;
         n4089EstEspUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEstNumCol_Internalname ;
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
      getKey1FW1585( ) ;
      if ( RcdFound1585 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4052EstNumFor != Z4052EstNumFor ) || ( A4053EstNumCol != Z4053EstNumCol ) )
         {
            A4053EstNumCol = Z4053EstNumCol ;
            httpContext.ajax_rsp_assign_attri("", false, "A4053EstNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4053EstNumCol), 2, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4052EstNumFor != Z4052EstNumFor ) || ( A4053EstNumCol != Z4053EstNumCol ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tlcoprv");
   }

   public void insert_check( )
   {
      confirm_1FW0( ) ;
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
      if ( RcdFound1585 == 0 )
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
      scanStart1FW1585( ) ;
      if ( RcdFound1585 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1FW1585( ) ;
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
      if ( RcdFound1585 == 0 )
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
      if ( RcdFound1585 == 0 )
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
      scanStart1FW1585( ) ;
      if ( RcdFound1585 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1585 != 0 )
         {
            scanNext1FW1585( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1FW1585( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1FW1585( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FW5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCopro"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z4089EstEspUlt != T01FW5_A4089EstEspUlt[0] ) )
         {
            if ( Z4089EstEspUlt != T01FW5_A4089EstEspUlt[0] )
            {
               GXutil.writeLogln("tlcoprv:[seudo value changed for attri]"+"EstEspUlt");
               GXutil.writeLogRaw("Old: ",Z4089EstEspUlt);
               GXutil.writeLogRaw("Current: ",T01FW5_A4089EstEspUlt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCopro"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FW1585( )
   {
      beforeValidate1FW1585( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FW1585( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FW1585( 0) ;
         checkOptimisticConcurrency1FW1585( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FW1585( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FW1585( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FW12 */
                  pr_default.execute(10, new Object[] {Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol), Boolean.valueOf(n4089EstEspUlt), Byte.valueOf(A4089EstEspUlt), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCopro");
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
                        processLevel1FW1585( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1FW0( ) ;
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
            load1FW1585( ) ;
         }
         endLevel1FW1585( ) ;
      }
      closeExtendedTableCursors1FW1585( ) ;
   }

   public void update1FW1585( )
   {
      beforeValidate1FW1585( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FW1585( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FW1585( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FW1585( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1FW1585( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FW13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n4089EstEspUlt), Byte.valueOf(A4089EstEspUlt), A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCopro");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCopro"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1FW1585( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1FW1585( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1FW0( ) ;
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
         endLevel1FW1585( ) ;
      }
      closeExtendedTableCursors1FW1585( ) ;
   }

   public void deferredUpdate1FW1585( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FW1585( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FW1585( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FW1585( ) ;
         afterConfirm1FW1585( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FW1585( ) ;
            if ( AnyError == 0 )
            {
               A4089EstEspUlt = O4089EstEspUlt ;
               n4089EstEspUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
               scanStart1FW1589( ) ;
               while ( RcdFound1589 != 0 )
               {
                  getByPrimaryKey1FW1589( ) ;
                  delete1FW1589( ) ;
                  scanNext1FW1589( ) ;
                  O4089EstEspUlt = A4089EstEspUlt ;
                  n4089EstEspUlt = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
               }
               scanEnd1FW1589( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FW14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCopro");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1585 == 0 )
                        {
                           initAll1FW1585( ) ;
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
                        resetCaption1FW0( ) ;
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
      sMode1585 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FW1585( ) ;
      Gx_mode = sMode1585 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FW1585( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01FW15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Observaciones color estampacio", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01FW16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas productos estampacion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01FW17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Procesos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void processNestedLevel1FW1589( )
   {
      s4089EstEspUlt = O4089EstEspUlt ;
      n4089EstEspUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1FW1589( ) ;
         if ( ( nRcdExists_1589 != 0 ) || ( nIsMod_1589 != 0 ) )
         {
            standaloneNotModal1FW1589( ) ;
            getKey1FW1589( ) ;
            if ( ( nRcdExists_1589 == 0 ) && ( nRcdDeleted_1589 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1FW1589( ) ;
            }
            else
            {
               if ( RcdFound1589 != 0 )
               {
                  if ( ( nRcdDeleted_1589 != 0 ) && ( nRcdExists_1589 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1FW1589( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1589 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1FW1589( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1589 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ESTNUMCOL");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEstNumCol_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O4089EstEspUlt = A4089EstEspUlt ;
            n4089EstEspUlt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1589_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1589, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstEspLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4090EstEspLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtEstCante_Internalname, GXutil.ltrim( localUtil.ntoc( A4091EstCante, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstUniMed_Internalname, GXutil.ltrim( localUtil.ntoc( A4092EstUniMed, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstOrden_Internalname, GXutil.ltrim( localUtil.ntoc( A4093EstOrden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4090EstEspLin_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z4090EstEspLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4091EstCante_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z4091EstCante, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4092EstUniMed_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z4092EstUniMed, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4093EstOrden_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z4093EstOrden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_45_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_1589_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1589, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1589_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1589, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1589_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1589, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1589 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1589_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1589_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTESPLIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstEspLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTCANTE_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstCante_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTUNIMED_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstUniMed_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTORDEN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstOrden_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1FW1589( ) ;
      if ( AnyError != 0 )
      {
         O4089EstEspUlt = s4089EstEspUlt ;
         n4089EstEspUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
      }
      nRcdExists_1589 = (short)(0) ;
      nIsMod_1589 = (short)(0) ;
      nRcdDeleted_1589 = (short)(0) ;
   }

   public void processLevel1FW1585( )
   {
      /* Save parent mode. */
      sMode1585 = Gx_mode ;
      processNestedLevel1FW1589( ) ;
      if ( AnyError != 0 )
      {
         O4089EstEspUlt = s4089EstEspUlt ;
         n4089EstEspUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1585 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01FW18 */
      pr_default.execute(16, new Object[] {Boolean.valueOf(n4089EstEspUlt), Byte.valueOf(A4089EstEspUlt), A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCopro");
   }

   public void endLevel1FW1585( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeComplete1FW1585( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tlcoprv");
         if ( AnyError == 0 )
         {
            confirmValues1FW0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tlcoprv");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1FW1585( )
   {
      /* Scan By routine */
      /* Using cursor T01FW19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor)});
      RcdFound1585 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1585 = (short)(1) ;
         A4053EstNumCol = T01FW19_A4053EstNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4053EstNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4053EstNumCol), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FW1585( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound1585 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1585 = (short)(1) ;
         A4053EstNumCol = T01FW19_A4053EstNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4053EstNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4053EstNumCol), 2, 0));
      }
   }

   public void scanEnd1FW1585( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1FW1585( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FW1585( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FW1585( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FW1585( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FW1585( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FW1585( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FW1585( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtEstNumFor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstNumFor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstNumFor_Enabled), 5, 0), true);
      edtEstNumCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstNumCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstNumCol_Enabled), 5, 0), true);
      edtEstEspUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstEspUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstEspUlt_Enabled), 5, 0), true);
   }

   public void zm1FW1589( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4091EstCante = T01FW3_A4091EstCante[0] ;
            Z4092EstUniMed = T01FW3_A4092EstUniMed[0] ;
            Z4093EstOrden = T01FW3_A4093EstOrden[0] ;
            Z719PrdNum = T01FW3_A719PrdNum[0] ;
         }
         else
         {
            Z4091EstCante = A4091EstCante ;
            Z4092EstUniMed = A4092EstUniMed ;
            Z4093EstOrden = A4093EstOrden ;
            Z719PrdNum = A719PrdNum ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z4052EstNumFor = A4052EstNumFor ;
         Z4053EstNumCol = A4053EstNumCol ;
         Z4090EstEspLin = A4090EstEspLin ;
         Z4091EstCante = A4091EstCante ;
         Z4092EstUniMed = A4092EstUniMed ;
         Z4093EstOrden = A4093EstOrden ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
      }
   }

   public void standaloneNotModal1FW1589( )
   {
      edtEstEspLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstEspLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstEspLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtEstEspUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstEspUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstEspUlt_Enabled), 5, 0), true);
      edtEstEspUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstEspUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstEspUlt_Enabled), 5, 0), true);
   }

   public void standaloneModal1FW1589( )
   {
      if ( isIns( )  )
      {
         A4089EstEspUlt = (byte)(O4089EstEspUlt+1) ;
         n4089EstEspUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A4090EstEspLin = A4089EstEspUlt ;
      }
   }

   public void load1FW1589( )
   {
      /* Using cursor T01FW20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol), Byte.valueOf(A4090EstEspLin)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1589 = (short)(1) ;
         A4091EstCante = T01FW20_A4091EstCante[0] ;
         n4091EstCante = T01FW20_n4091EstCante[0] ;
         A4092EstUniMed = T01FW20_A4092EstUniMed[0] ;
         n4092EstUniMed = T01FW20_n4092EstUniMed[0] ;
         A4093EstOrden = T01FW20_A4093EstOrden[0] ;
         n4093EstOrden = T01FW20_n4093EstOrden[0] ;
         A719PrdNum = T01FW20_A719PrdNum[0] ;
         n719PrdNum = T01FW20_n719PrdNum[0] ;
         zm1FW1589( -8) ;
      }
      pr_default.close(18);
      onLoadActions1FW1589( ) ;
   }

   public void onLoadActions1FW1589( )
   {
   }

   public void checkExtendedTable1FW1589( )
   {
      nIsDirty_1589 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1FW1589( ) ;
      /* Using cursor T01FW4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1FW1589( )
   {
      pr_default.close(2);
   }

   public void enableDisable1FW1589( )
   {
   }

   public void gxload_9( String A396EmprCod ,
                         String A719PrdNum )
   {
      /* Using cursor T01FW21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(19) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void getKey1FW1589( )
   {
      /* Using cursor T01FW22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol), Byte.valueOf(A4090EstEspLin)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1589 = (short)(1) ;
      }
      else
      {
         RcdFound1589 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey1FW1589( )
   {
      /* Using cursor T01FW3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol), Byte.valueOf(A4090EstEspLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T01FW3_A4052EstNumFor[0] == A4052EstNumFor ) && ( GXutil.strcmp(T01FW3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1FW1589( 8) ;
         RcdFound1589 = (short)(1) ;
         initializeNonKey1FW1589( ) ;
         A4090EstEspLin = T01FW3_A4090EstEspLin[0] ;
         A4091EstCante = T01FW3_A4091EstCante[0] ;
         n4091EstCante = T01FW3_n4091EstCante[0] ;
         A4092EstUniMed = T01FW3_A4092EstUniMed[0] ;
         n4092EstUniMed = T01FW3_n4092EstUniMed[0] ;
         A4093EstOrden = T01FW3_A4093EstOrden[0] ;
         n4093EstOrden = T01FW3_n4093EstOrden[0] ;
         A719PrdNum = T01FW3_A719PrdNum[0] ;
         n719PrdNum = T01FW3_n719PrdNum[0] ;
         Z396EmprCod = A396EmprCod ;
         Z4052EstNumFor = A4052EstNumFor ;
         Z4053EstNumCol = A4053EstNumCol ;
         Z4090EstEspLin = A4090EstEspLin ;
         sMode1589 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FW1589( ) ;
         load1FW1589( ) ;
         Gx_mode = sMode1589 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1589 = (short)(0) ;
         initializeNonKey1FW1589( ) ;
         sMode1589 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FW1589( ) ;
         Gx_mode = sMode1589 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1FW1589( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1FW1589( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FW2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol), Byte.valueOf(A4090EstEspLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLcoprv"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z4091EstCante, T01FW2_A4091EstCante[0]) != 0 ) || ( Z4092EstUniMed != T01FW2_A4092EstUniMed[0] ) || ( Z4093EstOrden != T01FW2_A4093EstOrden[0] ) || ( GXutil.strcmp(Z719PrdNum, T01FW2_A719PrdNum[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z4091EstCante, T01FW2_A4091EstCante[0]) != 0 )
            {
               GXutil.writeLogln("tlcoprv:[seudo value changed for attri]"+"EstCante");
               GXutil.writeLogRaw("Old: ",Z4091EstCante);
               GXutil.writeLogRaw("Current: ",T01FW2_A4091EstCante[0]);
            }
            if ( Z4092EstUniMed != T01FW2_A4092EstUniMed[0] )
            {
               GXutil.writeLogln("tlcoprv:[seudo value changed for attri]"+"EstUniMed");
               GXutil.writeLogRaw("Old: ",Z4092EstUniMed);
               GXutil.writeLogRaw("Current: ",T01FW2_A4092EstUniMed[0]);
            }
            if ( Z4093EstOrden != T01FW2_A4093EstOrden[0] )
            {
               GXutil.writeLogln("tlcoprv:[seudo value changed for attri]"+"EstOrden");
               GXutil.writeLogRaw("Old: ",Z4093EstOrden);
               GXutil.writeLogRaw("Current: ",T01FW2_A4093EstOrden[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T01FW2_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("tlcoprv:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T01FW2_A719PrdNum[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLcoprv"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FW1589( )
   {
      beforeValidate1FW1589( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FW1589( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FW1589( 0) ;
         checkOptimisticConcurrency1FW1589( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FW1589( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FW1589( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FW23 */
                  pr_default.execute(21, new Object[] {Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol), Byte.valueOf(A4090EstEspLin), Boolean.valueOf(n4091EstCante), A4091EstCante, Boolean.valueOf(n4092EstUniMed), Byte.valueOf(A4092EstUniMed), Boolean.valueOf(n4093EstOrden), Short.valueOf(A4093EstOrden), A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLcoprv");
                  if ( (pr_default.getStatus(21) == 1) )
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
            load1FW1589( ) ;
         }
         endLevel1FW1589( ) ;
      }
      closeExtendedTableCursors1FW1589( ) ;
   }

   public void update1FW1589( )
   {
      beforeValidate1FW1589( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FW1589( ) ;
      }
      if ( ( nIsMod_1589 != 0 ) || ( nIsDirty_1589 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1FW1589( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1FW1589( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1FW1589( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01FW24 */
                     pr_default.execute(22, new Object[] {Boolean.valueOf(n4091EstCante), A4091EstCante, Boolean.valueOf(n4092EstUniMed), Byte.valueOf(A4092EstUniMed), Boolean.valueOf(n4093EstOrden), Short.valueOf(A4093EstOrden), Boolean.valueOf(n719PrdNum), A719PrdNum, A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol), Byte.valueOf(A4090EstEspLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLcoprv");
                     if ( (pr_default.getStatus(22) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLcoprv"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1FW1589( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1FW1589( ) ;
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
            endLevel1FW1589( ) ;
         }
      }
      closeExtendedTableCursors1FW1589( ) ;
   }

   public void deferredUpdate1FW1589( )
   {
   }

   public void delete1FW1589( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FW1589( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FW1589( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FW1589( ) ;
         afterConfirm1FW1589( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FW1589( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01FW25 */
               pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol), Byte.valueOf(A4090EstEspLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLcoprv");
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
      sMode1589 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FW1589( ) ;
      Gx_mode = sMode1589 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FW1589( )
   {
      standaloneModal1FW1589( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1FW1589( )
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

   public void scanStart1FW1589( )
   {
      /* Scan By routine */
      /* Using cursor T01FW26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol)});
      RcdFound1589 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1589 = (short)(1) ;
         A4090EstEspLin = T01FW26_A4090EstEspLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FW1589( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound1589 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1589 = (short)(1) ;
         A4090EstEspLin = T01FW26_A4090EstEspLin[0] ;
      }
   }

   public void scanEnd1FW1589( )
   {
      pr_default.close(24);
   }

   public void afterConfirm1FW1589( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FW1589( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FW1589( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FW1589( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FW1589( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FW1589( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FW1589( )
   {
      edtEstEspLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstEspLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstEspLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtEstCante_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstCante_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCante_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtEstUniMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstUniMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstUniMed_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtEstOrden_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstOrden_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstOrden_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void send_integrity_lvl_hashes1FW1589( )
   {
   }

   public void send_integrity_lvl_hashes1FW1585( )
   {
   }

   public void subsflControlProps_451589( )
   {
      edtavnRcdDeleted_1589_Internalname = "vNRCDDELETED_1589_"+sGXsfl_45_idx ;
      edtEstEspLin_Internalname = "ESTESPLIN_"+sGXsfl_45_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_45_idx ;
      edtEstCante_Internalname = "ESTCANTE_"+sGXsfl_45_idx ;
      edtEstUniMed_Internalname = "ESTUNIMED_"+sGXsfl_45_idx ;
      edtEstOrden_Internalname = "ESTORDEN_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_451589( )
   {
      edtavnRcdDeleted_1589_Internalname = "vNRCDDELETED_1589_"+sGXsfl_45_fel_idx ;
      edtEstEspLin_Internalname = "ESTESPLIN_"+sGXsfl_45_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_45_fel_idx ;
      edtEstCante_Internalname = "ESTCANTE_"+sGXsfl_45_fel_idx ;
      edtEstUniMed_Internalname = "ESTUNIMED_"+sGXsfl_45_fel_idx ;
      edtEstOrden_Internalname = "ESTORDEN_"+sGXsfl_45_fel_idx ;
   }

   public void addRow1FW1589( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451589( ) ;
      sendRow1FW1589( ) ;
   }

   public void sendRow1FW1589( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1589_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1589_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1589, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1589_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1589), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1589), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1589_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1589_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstEspLin_Internalname,GXutil.ltrim( localUtil.ntoc( A4090EstEspLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEstEspLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4090EstEspLin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4090EstEspLin), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEstEspLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEstEspLin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1589_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1589_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstCante_Internalname,GXutil.ltrim( localUtil.ntoc( A4091EstCante, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEstCante_Enabled!=0) ? localUtil.format( A4091EstCante, "ZZ,ZZ9.99999") : localUtil.format( A4091EstCante, "ZZ,ZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEstCante_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEstCante_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1589_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstUniMed_Internalname,GXutil.ltrim( localUtil.ntoc( A4092EstUniMed, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEstUniMed_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4092EstUniMed), "9") : localUtil.format( DecimalUtil.doubleToDec(A4092EstUniMed), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEstUniMed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEstUniMed_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1589_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstOrden_Internalname,GXutil.ltrim( localUtil.ntoc( A4093EstOrden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEstOrden_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4093EstOrden), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4093EstOrden), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEstOrden_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEstOrden_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1FW1589( ) ;
      GXCCtl = "Z4090EstEspLin_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4090EstEspLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4091EstCante_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4091EstCante, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4092EstUniMed_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4092EstUniMed, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4093EstOrden_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4093EstOrden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z719PrdNum_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "nRcdDeleted_1589_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1589, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1589_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1589, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1589_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1589, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1589_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1589_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTESPLIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstEspLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTCANTE_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstCante_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTUNIMED_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstUniMed_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTORDEN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstOrden_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1FW1589( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451589( ) ;
      edtavnRcdDeleted_1589_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1589_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEstEspLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTESPLIN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEstCante_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTCANTE_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEstUniMed_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTUNIMED_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEstOrden_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTORDEN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1589_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1589_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1589");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1589_Internalname ;
         wbErr = true ;
         nRcdDeleted_1589 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1589 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1589_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A4090EstEspLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstEspLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      n719PrdNum = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEstCante_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstCante_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
      {
         GXCCtl = "ESTCANTE_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEstCante_Internalname ;
         wbErr = true ;
         A4091EstCante = DecimalUtil.ZERO ;
         n4091EstCante = false ;
      }
      else
      {
         A4091EstCante = localUtil.ctond( httpContext.cgiGet( edtEstCante_Internalname)) ;
         n4091EstCante = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstUniMed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstUniMed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "ESTUNIMED_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEstUniMed_Internalname ;
         wbErr = true ;
         A4092EstUniMed = (byte)(0) ;
         n4092EstUniMed = false ;
      }
      else
      {
         A4092EstUniMed = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstUniMed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4092EstUniMed = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstOrden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstOrden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ESTORDEN_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEstOrden_Internalname ;
         wbErr = true ;
         A4093EstOrden = (short)(0) ;
         n4093EstOrden = false ;
      }
      else
      {
         A4093EstOrden = (short)(localUtil.ctol( httpContext.cgiGet( edtEstOrden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4093EstOrden = false ;
      }
      GXCCtl = "Z4090EstEspLin_" + sGXsfl_45_idx ;
      Z4090EstEspLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4091EstCante_" + sGXsfl_45_idx ;
      Z4091EstCante = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4092EstUniMed_" + sGXsfl_45_idx ;
      Z4092EstUniMed = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4093EstOrden_" + sGXsfl_45_idx ;
      Z4093EstOrden = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_45_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1589_" + sGXsfl_45_idx ;
      nRcdDeleted_1589 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1589_" + sGXsfl_45_idx ;
      nRcdExists_1589 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1589_" + sGXsfl_45_idx ;
      nIsMod_1589 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtEstEspLin_Enabled = edtEstEspLin_Enabled ;
   }

   public void confirmValues1FW0( )
   {
      nGXsfl_45_idx = 0 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451589( ) ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451589( ) ;
         httpContext.changePostValue( "Z4090EstEspLin_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z4090EstEspLin_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4090EstEspLin_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z4091EstCante_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z4091EstCante_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4091EstCante_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z4092EstUniMed_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z4092EstUniMed_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4092EstUniMed_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z4093EstOrden_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z4093EstOrden_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4093EstOrden_"+sGXsfl_45_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tlcoprv", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4052EstNumFor,8,0))}, new String[] {"EmprCod","EstNumFor"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4052EstNumFor", GXutil.ltrim( localUtil.ntoc( Z4052EstNumFor, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4053EstNumCol", GXutil.ltrim( localUtil.ntoc( Z4053EstNumCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4089EstEspUlt", GXutil.ltrim( localUtil.ntoc( Z4089EstEspUlt, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O4089EstEspUlt", GXutil.ltrim( localUtil.ntoc( O4089EstEspUlt, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nGXsfl_45_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tlcoprv", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4052EstNumFor,8,0))}, new String[] {"EmprCod","EstNumFor"})  ;
   }

   public String getPgmname( )
   {
      return "TLcoprv" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Productos especiales", "") ;
   }

   public void initializeNonKey1FW1585( )
   {
      A4089EstEspUlt = (byte)(0) ;
      n4089EstEspUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
      O4089EstEspUlt = A4089EstEspUlt ;
      n4089EstEspUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
      Z4089EstEspUlt = (byte)(0) ;
   }

   public void initAll1FW1585( )
   {
      A4053EstNumCol = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4053EstNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4053EstNumCol), 2, 0));
      initializeNonKey1FW1585( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1FW1589( )
   {
      A719PrdNum = "" ;
      n719PrdNum = false ;
      A4091EstCante = DecimalUtil.ZERO ;
      n4091EstCante = false ;
      A4092EstUniMed = (byte)(0) ;
      n4092EstUniMed = false ;
      A4093EstOrden = (short)(0) ;
      n4093EstOrden = false ;
      Z4091EstCante = DecimalUtil.ZERO ;
      Z4092EstUniMed = (byte)(0) ;
      Z4093EstOrden = (short)(0) ;
      Z719PrdNum = "" ;
   }

   public void initAll1FW1589( )
   {
      A4090EstEspLin = (byte)(0) ;
      initializeNonKey1FW1589( ) ;
   }

   public void standaloneModalInsert1FW1589( )
   {
      A4089EstEspUlt = i4089EstEspUlt ;
      n4089EstEspUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4089EstEspUlt), 2, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241573516", true, true);
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
      httpContext.AddJavascriptSource("tlcoprv.js", "?20268241573516", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1589( )
   {
      edtEstEspLin_Enabled = defedtEstEspLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstEspLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstEspLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1589, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1589_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4090EstEspLin, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEstEspLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4091EstCante, (byte)(12), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEstCante_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4092EstUniMed, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEstUniMed_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4093EstOrden, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEstOrden_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtEstNumFor_Internalname = "ESTNUMFOR" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEstNumCol_Internalname = "ESTNUMCOL" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEstEspUlt_Internalname = "ESTESPULT" ;
      edtavnRcdDeleted_1589_Internalname = "vNRCDDELETED_1589" ;
      edtEstEspLin_Internalname = "ESTESPLIN" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtEstCante_Internalname = "ESTCANTE" ;
      edtEstUniMed_Internalname = "ESTUNIMED" ;
      edtEstOrden_Internalname = "ESTORDEN" ;
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
      Form.setCaption( httpContext.getMessage( "Productos especiales", "") );
      edtEstOrden_Jsonclick = "" ;
      edtEstUniMed_Jsonclick = "" ;
      edtEstCante_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtEstEspLin_Jsonclick = "" ;
      edtavnRcdDeleted_1589_Jsonclick = "" ;
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
      edtEstOrden_Enabled = 1 ;
      edtEstUniMed_Enabled = 1 ;
      edtEstCante_Enabled = 1 ;
      edtPrdNum_Enabled = 1 ;
      edtEstEspLin_Enabled = 0 ;
      edtavnRcdDeleted_1589_Enabled = 1 ;
      edtEstEspUlt_Jsonclick = "" ;
      edtEstEspUlt_Backcolor = (int)(0xFFFFFF) ;
      edtEstEspUlt_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtEstNumCol_Jsonclick = "" ;
      edtEstNumCol_Backcolor = (int)(0xFFFFFF) ;
      edtEstNumCol_Enabled = 1 ;
      edtEstNumFor_Jsonclick = "" ;
      edtEstNumFor_Backcolor = (int)(0xFFFFFF) ;
      edtEstNumFor_Enabled = 0 ;
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
      subsflControlProps_451589( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1FW1589( ) ;
         standaloneModal1FW1589( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1FW1589( ) ;
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451589( ) ;
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
      /* Using cursor T01FW27 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FW27_A407EmprNom[0] ;
      n407EmprNom = T01FW27_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(25);
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

   public void valid_Estnumcol( )
   {
      n4089EstEspUlt = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4089EstEspUlt", GXutil.ltrim( localUtil.ntoc( A4089EstEspUlt, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4052EstNumFor", GXutil.ltrim( localUtil.ntoc( Z4052EstNumFor, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4053EstNumCol", GXutil.ltrim( localUtil.ntoc( Z4053EstNumCol, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4089EstEspUlt", GXutil.ltrim( localUtil.ntoc( Z4089EstEspUlt, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O4089EstEspUlt", GXutil.ltrim( localUtil.ntoc( O4089EstEspUlt, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Prdnum( )
   {
      n719PrdNum = false ;
      /* Using cursor T01FW28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      pr_default.close(26);
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4052EstNumFor',fld:'ESTNUMFOR',pic:'ZZZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'UNIDADES'","{handler:'e121FW2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4092EstUniMed',fld:'ESTUNIMED',pic:'9'}]");
      setEventMetadata("'UNIDADES'",",oparms:[{av:'A4092EstUniMed',fld:'ESTUNIMED',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ESTNUMFOR","{handler:'valid_Estnumfor',iparms:[]");
      setEventMetadata("VALID_ESTNUMFOR",",oparms:[]}");
      setEventMetadata("VALID_ESTNUMCOL","{handler:'valid_Estnumcol',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A4089EstEspUlt',fld:'ESTESPULT',pic:'Z9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4052EstNumFor',fld:'ESTNUMFOR',pic:'ZZZZZZZ9'},{av:'A4053EstNumCol',fld:'ESTNUMCOL',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ESTNUMCOL",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4089EstEspUlt',fld:'ESTESPULT',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z4052EstNumFor'},{av:'Z4053EstNumCol'},{av:'Z407EmprNom'},{av:'Z4089EstEspUlt'},{av:'O4089EstEspUlt'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_ESTESPULT","{handler:'valid_Estespult',iparms:[]");
      setEventMetadata("VALID_ESTESPULT",",oparms:[]}");
      setEventMetadata("VALID_ESTESPLIN","{handler:'valid_Estesplin',iparms:[]");
      setEventMetadata("VALID_ESTESPLIN",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Estorden',iparms:[]");
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
      pr_default.close(26);
      pr_default.close(25);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z4091EstCante = DecimalUtil.ZERO ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1589 = "" ;
      Gx_mode = "" ;
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
      sMode1585 = "" ;
      A4091EstCante = DecimalUtil.ZERO ;
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
      T01FW7_A407EmprNom = new String[] {""} ;
      T01FW7_n407EmprNom = new boolean[] {false} ;
      T01FW8_A4052EstNumFor = new int[1] ;
      T01FW8_A4053EstNumCol = new byte[1] ;
      T01FW8_A407EmprNom = new String[] {""} ;
      T01FW8_n407EmprNom = new boolean[] {false} ;
      T01FW8_A4089EstEspUlt = new byte[1] ;
      T01FW8_n4089EstEspUlt = new boolean[] {false} ;
      T01FW8_A396EmprCod = new String[] {""} ;
      T01FW9_A396EmprCod = new String[] {""} ;
      T01FW9_A4052EstNumFor = new int[1] ;
      T01FW9_A4053EstNumCol = new byte[1] ;
      T01FW6_A4052EstNumFor = new int[1] ;
      T01FW6_A4053EstNumCol = new byte[1] ;
      T01FW6_A4089EstEspUlt = new byte[1] ;
      T01FW6_n4089EstEspUlt = new boolean[] {false} ;
      T01FW6_A396EmprCod = new String[] {""} ;
      T01FW10_A396EmprCod = new String[] {""} ;
      T01FW10_A4052EstNumFor = new int[1] ;
      T01FW10_A4053EstNumCol = new byte[1] ;
      T01FW11_A396EmprCod = new String[] {""} ;
      T01FW11_A4052EstNumFor = new int[1] ;
      T01FW11_A4053EstNumCol = new byte[1] ;
      T01FW5_A4052EstNumFor = new int[1] ;
      T01FW5_A4053EstNumCol = new byte[1] ;
      T01FW5_A4089EstEspUlt = new byte[1] ;
      T01FW5_n4089EstEspUlt = new boolean[] {false} ;
      T01FW5_A396EmprCod = new String[] {""} ;
      T01FW15_A396EmprCod = new String[] {""} ;
      T01FW15_A4052EstNumFor = new int[1] ;
      T01FW15_A4053EstNumCol = new byte[1] ;
      T01FW15_A4087EstObsLin = new byte[1] ;
      T01FW16_A396EmprCod = new String[] {""} ;
      T01FW16_A4052EstNumFor = new int[1] ;
      T01FW16_A4053EstNumCol = new byte[1] ;
      T01FW16_A4084EstProLin = new byte[1] ;
      T01FW17_A396EmprCod = new String[] {""} ;
      T01FW17_A4052EstNumFor = new int[1] ;
      T01FW17_A4053EstNumCol = new byte[1] ;
      T01FW17_A4057EstNumLin = new byte[1] ;
      T01FW19_A396EmprCod = new String[] {""} ;
      T01FW19_A4052EstNumFor = new int[1] ;
      T01FW19_A4053EstNumCol = new byte[1] ;
      T01FW20_A4052EstNumFor = new int[1] ;
      T01FW20_A4053EstNumCol = new byte[1] ;
      T01FW20_A4090EstEspLin = new byte[1] ;
      T01FW20_A4091EstCante = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FW20_n4091EstCante = new boolean[] {false} ;
      T01FW20_A4092EstUniMed = new byte[1] ;
      T01FW20_n4092EstUniMed = new boolean[] {false} ;
      T01FW20_A4093EstOrden = new short[1] ;
      T01FW20_n4093EstOrden = new boolean[] {false} ;
      T01FW20_A396EmprCod = new String[] {""} ;
      T01FW20_A719PrdNum = new String[] {""} ;
      T01FW20_n719PrdNum = new boolean[] {false} ;
      T01FW4_A396EmprCod = new String[] {""} ;
      GXCCtl = "" ;
      T01FW21_A396EmprCod = new String[] {""} ;
      T01FW22_A396EmprCod = new String[] {""} ;
      T01FW22_A4052EstNumFor = new int[1] ;
      T01FW22_A4053EstNumCol = new byte[1] ;
      T01FW22_A4090EstEspLin = new byte[1] ;
      T01FW3_A4052EstNumFor = new int[1] ;
      T01FW3_A4053EstNumCol = new byte[1] ;
      T01FW3_A4090EstEspLin = new byte[1] ;
      T01FW3_A4091EstCante = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FW3_n4091EstCante = new boolean[] {false} ;
      T01FW3_A4092EstUniMed = new byte[1] ;
      T01FW3_n4092EstUniMed = new boolean[] {false} ;
      T01FW3_A4093EstOrden = new short[1] ;
      T01FW3_n4093EstOrden = new boolean[] {false} ;
      T01FW3_A396EmprCod = new String[] {""} ;
      T01FW3_A719PrdNum = new String[] {""} ;
      T01FW3_n719PrdNum = new boolean[] {false} ;
      T01FW2_A4052EstNumFor = new int[1] ;
      T01FW2_A4053EstNumCol = new byte[1] ;
      T01FW2_A4090EstEspLin = new byte[1] ;
      T01FW2_A4091EstCante = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FW2_n4091EstCante = new boolean[] {false} ;
      T01FW2_A4092EstUniMed = new byte[1] ;
      T01FW2_n4092EstUniMed = new boolean[] {false} ;
      T01FW2_A4093EstOrden = new short[1] ;
      T01FW2_n4093EstOrden = new boolean[] {false} ;
      T01FW2_A396EmprCod = new String[] {""} ;
      T01FW2_A719PrdNum = new String[] {""} ;
      T01FW2_n719PrdNum = new boolean[] {false} ;
      T01FW26_A396EmprCod = new String[] {""} ;
      T01FW26_A4052EstNumFor = new int[1] ;
      T01FW26_A4053EstNumCol = new byte[1] ;
      T01FW26_A4090EstEspLin = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01FW27_A407EmprNom = new String[] {""} ;
      T01FW27_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      T01FW28_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tlcoprv__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tlcoprv__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tlcoprv__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tlcoprv__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tlcoprv__default(),
         new Object[] {
             new Object[] {
            T01FW2_A4052EstNumFor, T01FW2_A4053EstNumCol, T01FW2_A4090EstEspLin, T01FW2_A4091EstCante, T01FW2_n4091EstCante, T01FW2_A4092EstUniMed, T01FW2_n4092EstUniMed, T01FW2_A4093EstOrden, T01FW2_n4093EstOrden, T01FW2_A396EmprCod,
            T01FW2_A719PrdNum, T01FW2_n719PrdNum
            }
            , new Object[] {
            T01FW3_A4052EstNumFor, T01FW3_A4053EstNumCol, T01FW3_A4090EstEspLin, T01FW3_A4091EstCante, T01FW3_n4091EstCante, T01FW3_A4092EstUniMed, T01FW3_n4092EstUniMed, T01FW3_A4093EstOrden, T01FW3_n4093EstOrden, T01FW3_A396EmprCod,
            T01FW3_A719PrdNum, T01FW3_n719PrdNum
            }
            , new Object[] {
            T01FW4_A396EmprCod
            }
            , new Object[] {
            T01FW5_A4052EstNumFor, T01FW5_A4053EstNumCol, T01FW5_A4089EstEspUlt, T01FW5_n4089EstEspUlt, T01FW5_A396EmprCod
            }
            , new Object[] {
            T01FW6_A4052EstNumFor, T01FW6_A4053EstNumCol, T01FW6_A4089EstEspUlt, T01FW6_n4089EstEspUlt, T01FW6_A396EmprCod
            }
            , new Object[] {
            T01FW7_A407EmprNom, T01FW7_n407EmprNom
            }
            , new Object[] {
            T01FW8_A4052EstNumFor, T01FW8_A4053EstNumCol, T01FW8_A407EmprNom, T01FW8_n407EmprNom, T01FW8_A4089EstEspUlt, T01FW8_n4089EstEspUlt, T01FW8_A396EmprCod
            }
            , new Object[] {
            T01FW9_A396EmprCod, T01FW9_A4052EstNumFor, T01FW9_A4053EstNumCol
            }
            , new Object[] {
            T01FW10_A396EmprCod, T01FW10_A4052EstNumFor, T01FW10_A4053EstNumCol
            }
            , new Object[] {
            T01FW11_A396EmprCod, T01FW11_A4052EstNumFor, T01FW11_A4053EstNumCol
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FW15_A396EmprCod, T01FW15_A4052EstNumFor, T01FW15_A4053EstNumCol, T01FW15_A4087EstObsLin
            }
            , new Object[] {
            T01FW16_A396EmprCod, T01FW16_A4052EstNumFor, T01FW16_A4053EstNumCol, T01FW16_A4084EstProLin
            }
            , new Object[] {
            T01FW17_A396EmprCod, T01FW17_A4052EstNumFor, T01FW17_A4053EstNumCol, T01FW17_A4057EstNumLin
            }
            , new Object[] {
            }
            , new Object[] {
            T01FW19_A396EmprCod, T01FW19_A4052EstNumFor, T01FW19_A4053EstNumCol
            }
            , new Object[] {
            T01FW20_A4052EstNumFor, T01FW20_A4053EstNumCol, T01FW20_A4090EstEspLin, T01FW20_A4091EstCante, T01FW20_n4091EstCante, T01FW20_A4092EstUniMed, T01FW20_n4092EstUniMed, T01FW20_A4093EstOrden, T01FW20_n4093EstOrden, T01FW20_A396EmprCod,
            T01FW20_A719PrdNum, T01FW20_n719PrdNum
            }
            , new Object[] {
            T01FW21_A396EmprCod
            }
            , new Object[] {
            T01FW22_A396EmprCod, T01FW22_A4052EstNumFor, T01FW22_A4053EstNumCol, T01FW22_A4090EstEspLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FW26_A396EmprCod, T01FW26_A4052EstNumFor, T01FW26_A4053EstNumCol, T01FW26_A4090EstEspLin
            }
            , new Object[] {
            T01FW27_A407EmprNom, T01FW27_n407EmprNom
            }
            , new Object[] {
            T01FW28_A396EmprCod
            }
         }
      );
      Z4052EstNumFor = 0 ;
      A4052EstNumFor = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z4053EstNumCol ;
   private byte Z4089EstEspUlt ;
   private byte O4089EstEspUlt ;
   private byte Z4090EstEspLin ;
   private byte Z4092EstUniMed ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A4089EstEspUlt ;
   private byte Gx_BScreen ;
   private byte A4053EstNumCol ;
   private byte B4089EstEspUlt ;
   private byte s4089EstEspUlt ;
   private byte A4090EstEspLin ;
   private byte A4092EstUniMed ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i4089EstEspUlt ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ4053EstNumCol ;
   private byte ZZ4089EstEspUlt ;
   private byte ZO4089EstEspUlt ;
   private short Z4093EstOrden ;
   private short nRcdDeleted_1589 ;
   private short nRcdExists_1589 ;
   private short nIsMod_1589 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1589 ;
   private short RcdFound1589 ;
   private short nBlankRcdUsr1589 ;
   private short A4093EstOrden ;
   private short RcdFound1585 ;
   private short nIsDirty_1585 ;
   private short nIsDirty_1589 ;
   private int wcpOA4052EstNumFor ;
   private int Z4052EstNumFor ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int A4052EstNumFor ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtEstNumFor_Enabled ;
   private int edtEstNumCol_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEstEspUlt_Enabled ;
   private int edtavnRcdDeleted_1589_Enabled ;
   private int edtEstEspLin_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtEstCante_Enabled ;
   private int edtEstUniMed_Enabled ;
   private int edtEstOrden_Enabled ;
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
   private int defedtEstEspLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEstEspUlt_Backcolor ;
   private int edtEstNumCol_Backcolor ;
   private int edtEstNumFor_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ4052EstNumFor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z4091EstCante ;
   private java.math.BigDecimal A4091EstCante ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
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
   private String edtEstNumCol_Internalname ;
   private String sGXsfl_45_idx="0001" ;
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
   private String edtEstNumFor_Internalname ;
   private String edtEstNumFor_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEstNumCol_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEstEspUlt_Internalname ;
   private String edtEstEspUlt_Jsonclick ;
   private String sMode1589 ;
   private String Gx_mode ;
   private String edtavnRcdDeleted_1589_Internalname ;
   private String edtEstEspLin_Internalname ;
   private String edtPrdNum_Internalname ;
   private String edtEstCante_Internalname ;
   private String edtEstUniMed_Internalname ;
   private String edtEstOrden_Internalname ;
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
   private String sMode1585 ;
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
   private String GXCCtl ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1589_Jsonclick ;
   private String edtEstEspLin_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtEstCante_Jsonclick ;
   private String edtEstUniMed_Jsonclick ;
   private String edtEstOrden_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n719PrdNum ;
   private boolean wbErr ;
   private boolean n4089EstEspUlt ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n4091EstCante ;
   private boolean n4092EstUniMed ;
   private boolean n4093EstOrden ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01FW7_A407EmprNom ;
   private boolean[] T01FW7_n407EmprNom ;
   private int[] T01FW8_A4052EstNumFor ;
   private byte[] T01FW8_A4053EstNumCol ;
   private String[] T01FW8_A407EmprNom ;
   private boolean[] T01FW8_n407EmprNom ;
   private byte[] T01FW8_A4089EstEspUlt ;
   private boolean[] T01FW8_n4089EstEspUlt ;
   private String[] T01FW8_A396EmprCod ;
   private String[] T01FW9_A396EmprCod ;
   private int[] T01FW9_A4052EstNumFor ;
   private byte[] T01FW9_A4053EstNumCol ;
   private int[] T01FW6_A4052EstNumFor ;
   private byte[] T01FW6_A4053EstNumCol ;
   private byte[] T01FW6_A4089EstEspUlt ;
   private boolean[] T01FW6_n4089EstEspUlt ;
   private String[] T01FW6_A396EmprCod ;
   private String[] T01FW10_A396EmprCod ;
   private int[] T01FW10_A4052EstNumFor ;
   private byte[] T01FW10_A4053EstNumCol ;
   private String[] T01FW11_A396EmprCod ;
   private int[] T01FW11_A4052EstNumFor ;
   private byte[] T01FW11_A4053EstNumCol ;
   private int[] T01FW5_A4052EstNumFor ;
   private byte[] T01FW5_A4053EstNumCol ;
   private byte[] T01FW5_A4089EstEspUlt ;
   private boolean[] T01FW5_n4089EstEspUlt ;
   private String[] T01FW5_A396EmprCod ;
   private String[] T01FW15_A396EmprCod ;
   private int[] T01FW15_A4052EstNumFor ;
   private byte[] T01FW15_A4053EstNumCol ;
   private byte[] T01FW15_A4087EstObsLin ;
   private String[] T01FW16_A396EmprCod ;
   private int[] T01FW16_A4052EstNumFor ;
   private byte[] T01FW16_A4053EstNumCol ;
   private byte[] T01FW16_A4084EstProLin ;
   private String[] T01FW17_A396EmprCod ;
   private int[] T01FW17_A4052EstNumFor ;
   private byte[] T01FW17_A4053EstNumCol ;
   private byte[] T01FW17_A4057EstNumLin ;
   private String[] T01FW19_A396EmprCod ;
   private int[] T01FW19_A4052EstNumFor ;
   private byte[] T01FW19_A4053EstNumCol ;
   private int[] T01FW20_A4052EstNumFor ;
   private byte[] T01FW20_A4053EstNumCol ;
   private byte[] T01FW20_A4090EstEspLin ;
   private java.math.BigDecimal[] T01FW20_A4091EstCante ;
   private boolean[] T01FW20_n4091EstCante ;
   private byte[] T01FW20_A4092EstUniMed ;
   private boolean[] T01FW20_n4092EstUniMed ;
   private short[] T01FW20_A4093EstOrden ;
   private boolean[] T01FW20_n4093EstOrden ;
   private String[] T01FW20_A396EmprCod ;
   private String[] T01FW20_A719PrdNum ;
   private boolean[] T01FW20_n719PrdNum ;
   private String[] T01FW4_A396EmprCod ;
   private String[] T01FW21_A396EmprCod ;
   private String[] T01FW22_A396EmprCod ;
   private int[] T01FW22_A4052EstNumFor ;
   private byte[] T01FW22_A4053EstNumCol ;
   private byte[] T01FW22_A4090EstEspLin ;
   private int[] T01FW3_A4052EstNumFor ;
   private byte[] T01FW3_A4053EstNumCol ;
   private byte[] T01FW3_A4090EstEspLin ;
   private java.math.BigDecimal[] T01FW3_A4091EstCante ;
   private boolean[] T01FW3_n4091EstCante ;
   private byte[] T01FW3_A4092EstUniMed ;
   private boolean[] T01FW3_n4092EstUniMed ;
   private short[] T01FW3_A4093EstOrden ;
   private boolean[] T01FW3_n4093EstOrden ;
   private String[] T01FW3_A396EmprCod ;
   private String[] T01FW3_A719PrdNum ;
   private boolean[] T01FW3_n719PrdNum ;
   private int[] T01FW2_A4052EstNumFor ;
   private byte[] T01FW2_A4053EstNumCol ;
   private byte[] T01FW2_A4090EstEspLin ;
   private java.math.BigDecimal[] T01FW2_A4091EstCante ;
   private boolean[] T01FW2_n4091EstCante ;
   private byte[] T01FW2_A4092EstUniMed ;
   private boolean[] T01FW2_n4092EstUniMed ;
   private short[] T01FW2_A4093EstOrden ;
   private boolean[] T01FW2_n4093EstOrden ;
   private String[] T01FW2_A396EmprCod ;
   private String[] T01FW2_A719PrdNum ;
   private boolean[] T01FW2_n719PrdNum ;
   private String[] T01FW26_A396EmprCod ;
   private int[] T01FW26_A4052EstNumFor ;
   private byte[] T01FW26_A4053EstNumCol ;
   private byte[] T01FW26_A4090EstEspLin ;
   private String[] T01FW27_A407EmprNom ;
   private boolean[] T01FW27_n407EmprNom ;
   private String[] T01FW28_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tlcoprv__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlcoprv__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlcoprv__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlcoprv__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlcoprv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01FW2", "SELECT EstNumFor, EstNumCol, EstEspLin, EstCante, EstUniMed, EstOrden, EmprCod, PrdNum FROM TXPLcoprv WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ? AND EstEspLin = ?  FOR UPDATE OF EstCante, EstUniMed, EstOrden, PrdNum NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FW3", "SELECT EstNumFor, EstNumCol, EstEspLin, EstCante, EstUniMed, EstOrden, EmprCod, PrdNum FROM TXPLcoprv WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ? AND EstEspLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FW4", "SELECT EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FW5", "SELECT EstNumFor, EstNumCol, EstEspUlt, EmprCod FROM TXPCCopro WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ?  FOR UPDATE OF EstEspUlt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FW6", "SELECT EstNumFor, EstNumCol, EstEspUlt, EmprCod FROM TXPCCopro WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FW7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FW8", "SELECT /*+ FIRST_ROWS(100) */ TM1.EstNumFor, TM1.EstNumCol, T2.EmprNom, TM1.EstEspUlt, TM1.EmprCod FROM (TXPCCopro TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.EstNumFor = ? and TM1.EstNumCol = ? ORDER BY TM1.EmprCod, TM1.EstNumFor, TM1.EstNumCol ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FW9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, EstNumFor, EstNumCol FROM TXPCCopro WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FW10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, EstNumFor, EstNumCol FROM TXPCCopro WHERE ( EstNumCol > ?) and EmprCod = ? and EstNumFor = ? ORDER BY EmprCod, EstNumFor, EstNumCol) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FW11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, EstNumFor, EstNumCol FROM TXPCCopro WHERE ( EstNumCol < ?) and EmprCod = ? and EstNumFor = ? ORDER BY EmprCod DESC, EstNumFor DESC, EstNumCol DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01FW12", "INSERT INTO TXPCCopro(EstNumFor, EstNumCol, EstEspUlt, EmprCod, EstConsumo, EstNumLinu, EstTipCol, EstProUlt, EstObsUlt) VALUES(?, ?, ?, ?, 0, 0, ' ', 0, 0)", GX_NOMASK, "TXPCCopro")
         ,new UpdateCursor("T01FW13", "UPDATE TXPCCopro SET EstEspUlt=?  WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ?", GX_NOMASK, "TXPCCopro")
         ,new UpdateCursor("T01FW14", "DELETE FROM TXPCCopro  WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ?", GX_NOMASK, "TXPCCopro")
         ,new ForEachCursor("T01FW15", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstObsLin FROM TXPLcoobs WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FW16", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstProLin FROM TXPLcocol WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FW17", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstNumLin FROM TXPLCoPro WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01FW18", "UPDATE TXPCCopro SET EstEspUlt=?  WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ?", GX_NOMASK, "TXPCCopro")
         ,new ForEachCursor("T01FW19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, EstNumFor, EstNumCol FROM TXPCCopro WHERE EmprCod = ? and EstNumFor = ? ORDER BY EmprCod, EstNumFor, EstNumCol ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FW20", "SELECT EstNumFor, EstNumCol, EstEspLin, EstCante, EstUniMed, EstOrden, EmprCod, PrdNum FROM TXPLcoprv WHERE EmprCod = ? and EstNumFor = ? and EstNumCol = ? and EstEspLin = ? ORDER BY EmprCod, EstNumFor, EstNumCol, EstEspLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FW21", "SELECT EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FW22", "SELECT EmprCod, EstNumFor, EstNumCol, EstEspLin FROM TXPLcoprv WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ? AND EstEspLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01FW23", "INSERT INTO TXPLcoprv(EstNumFor, EstNumCol, EstEspLin, EstCante, EstUniMed, EstOrden, EmprCod, PrdNum) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLcoprv")
         ,new UpdateCursor("T01FW24", "UPDATE TXPLcoprv SET EstCante=?, EstUniMed=?, EstOrden=?, PrdNum=?  WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ? AND EstEspLin = ?", GX_NOMASK, "TXPLcoprv")
         ,new UpdateCursor("T01FW25", "DELETE FROM TXPLcoprv  WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ? AND EstEspLin = ?", GX_NOMASK, "TXPLcoprv")
         ,new ForEachCursor("T01FW26", "SELECT EmprCod, EstNumFor, EstNumCol, EstEspLin FROM TXPLcoprv WHERE EmprCod = ? and EstNumFor = ? and EstNumCol = ? ORDER BY EmprCod, EstNumFor, EstNumCol, EstEspLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FW27", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FW28", "SELECT EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               ((String[]) buf[10])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               ((String[]) buf[10])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               ((String[]) buf[10])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
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
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 8 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 9 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               stmt.setString(4, (String)parms[4], 3);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 19 :
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
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 21 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 5);
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[8]).shortValue());
               }
               stmt.setString(7, (String)parms[9], 3);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 6);
               }
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 6);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setByte(7, ((Number) parms[10]).byteValue());
               stmt.setByte(8, ((Number) parms[11]).byteValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 26 :
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
      }
   }

}

