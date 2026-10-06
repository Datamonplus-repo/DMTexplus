package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class thisope_impl extends GXDataArea
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
         A503GruOpeCod = (int)(GXutil.lval( httpContext.GetPar( "GruOpeCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A503GruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A503GruOpeCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod, A503GruOpeCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "HISTORICO PRODUCCION OPERARIO", ""), (short)(0)) ;
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

   public thisope_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public thisope_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( thisope_impl.class ));
   }

   public thisope_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISOPE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISOPE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISOPE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISOPE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_THISOPE.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISOPE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISOPE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Grupo Operario", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISOPE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGruOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A503GruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGruOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A503GruOpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A503GruOpeCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGruOpeCod_Jsonclick, 0, "", "", "", "", "", 1, edtGruOpeCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISOPE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Mes", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISOPE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisMes_Internalname, GXutil.ltrim( localUtil.ntoc( A551HisMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisMes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A551HisMes), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A551HisMes), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisMes_Jsonclick, 0, "", "", "", "", "", 1, edtHisMes_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISOPE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Año", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISOPE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisAny_Internalname, GXutil.ltrim( localUtil.ntoc( A538HisAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisAny_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A538HisAny), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A538HisAny), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisAny_Jsonclick, 0, "", "", "", "", "", 1, edtHisAny_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISOPE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISOPE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Unidasdes Producidas/Mes", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISOPE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisUniPro_Internalname, GXutil.ltrim( localUtil.ntoc( A573HisUniPro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisUniPro_Enabled!=0) ? localUtil.format( A573HisUniPro, "ZZZZZZ9.99") : localUtil.format( A573HisUniPro, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisUniPro_Jsonclick, 0, "", "", "", "", "", 1, edtHisUniPro_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISOPE.htm");
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
         nBlankRcdCount1614 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1614 = (short)(1) ;
            scanStart1GL1614( ) ;
            while ( RcdFound1614 != 0 )
            {
               init_level_properties1614( ) ;
               getByPrimaryKey1GL1614( ) ;
               addRow1GL1614( ) ;
               scanNext1GL1614( ) ;
            }
            scanEnd1GL1614( ) ;
            nBlankRcdCount1614 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1GL1614( ) ;
         standaloneModal1GL1614( ) ;
         sMode1614 = Gx_mode ;
         while ( nGXsfl_45_idx < nRC_GXsfl_45 )
         {
            bGXsfl_45_Refreshing = true ;
            readRow1GL1614( ) ;
            edtavnRcdDeleted_1614_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1614_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1614_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1614_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtHisLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISLIN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtHisPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPRO_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisPro_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtHisTie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISTIE_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisTie_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            if ( ( nRcdExists_1614 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1GL1614( ) ;
            }
            sendRow1GL1614( ) ;
            bGXsfl_45_Refreshing = false ;
         }
         Gx_mode = sMode1614 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1614 = (short)(5) ;
         nRcdExists_1614 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1GL1614( ) ;
            while ( RcdFound1614 != 0 )
            {
               sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_451614( ) ;
               init_level_properties1614( ) ;
               standaloneNotModal1GL1614( ) ;
               getByPrimaryKey1GL1614( ) ;
               standaloneModal1GL1614( ) ;
               addRow1GL1614( ) ;
               scanNext1GL1614( ) ;
            }
            scanEnd1GL1614( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1614 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_451614( ) ;
      initAll1GL1614( ) ;
      init_level_properties1614( ) ;
      nRcdExists_1614 = (short)(0) ;
      nIsMod_1614 = (short)(0) ;
      nRcdDeleted_1614 = (short)(0) ;
      nBlankRcdCount1614 = (short)(nBlankRcdUsr1614+nBlankRcdCount1614) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1614 > 0 )
      {
         standaloneNotModal1GL1614( ) ;
         standaloneModal1GL1614( ) ;
         addRow1GL1614( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtHisLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1614 = (short)(nBlankRcdCount1614-1) ;
      }
      Gx_mode = sMode1614 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISOPE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISOPE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISOPE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISOPE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_THISOPE.htm");
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
      e111GL2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z503GruOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z503GruOpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z551HisMes = (byte)(localUtil.ctol( httpContext.cgiGet( "Z551HisMes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z538HisAny = (short)(localUtil.ctol( httpContext.cgiGet( "Z538HisAny"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z573HisUniPro = localUtil.ctond( httpContext.cgiGet( "Z573HisUniPro")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGruOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGruOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "GRUOPECOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtGruOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A503GruOpeCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A503GruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A503GruOpeCod), 6, 0));
            }
            else
            {
               A503GruOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtGruOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A503GruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A503GruOpeCod), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISMES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHisMes_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A551HisMes = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A551HisMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A551HisMes), 2, 0));
            }
            else
            {
               A551HisMes = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A551HisMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A551HisMes), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISANY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHisAny_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A538HisAny = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A538HisAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A538HisAny), 4, 0));
            }
            else
            {
               A538HisAny = (short)(localUtil.ctol( httpContext.cgiGet( edtHisAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A538HisAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A538HisAny), 4, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHisUniPro_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHisUniPro_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISUNIPRO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHisUniPro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A573HisUniPro = DecimalUtil.ZERO ;
               n573HisUniPro = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A573HisUniPro", GXutil.ltrimstr( A573HisUniPro, 10, 2));
            }
            else
            {
               A573HisUniPro = localUtil.ctond( httpContext.cgiGet( edtHisUniPro_Internalname)) ;
               n573HisUniPro = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A573HisUniPro", GXutil.ltrimstr( A573HisUniPro, 10, 2));
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
               A503GruOpeCod = (int)(GXutil.lval( httpContext.GetPar( "GruOpeCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A503GruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A503GruOpeCod), 6, 0));
               A551HisMes = (byte)(GXutil.lval( httpContext.GetPar( "HisMes"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A551HisMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A551HisMes), 2, 0));
               A538HisAny = (short)(GXutil.lval( httpContext.GetPar( "HisAny"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A538HisAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A538HisAny), 4, 0));
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
                        e111GL2 ();
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
            initAll1GL1613( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1614_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1614_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      disableAttributes1GL1613( ) ;
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

   public void confirm_1GL0( )
   {
      beforeValidate1GL1613( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1GL1613( ) ;
         }
         else
         {
            checkExtendedTable1GL1613( ) ;
            if ( AnyError == 0 )
            {
               zm1GL1613( 2) ;
            }
            closeExtendedTableCursors1GL1613( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1613 = Gx_mode ;
         confirm_1GL1614( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1613 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1613 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1GL0( ) ;
      }
   }

   public void confirm_1GL1614( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1GL1614( ) ;
         if ( ( nRcdExists_1614 != 0 ) || ( nIsMod_1614 != 0 ) )
         {
            getKey1GL1614( ) ;
            if ( ( nRcdExists_1614 == 0 ) && ( nRcdDeleted_1614 == 0 ) )
            {
               if ( RcdFound1614 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1GL1614( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1GL1614( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1GL1614( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "HISLIN_" + sGXsfl_45_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtHisLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1614 != 0 )
               {
                  if ( nRcdDeleted_1614 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1GL1614( ) ;
                     load1GL1614( ) ;
                     beforeValidate1GL1614( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1GL1614( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1614 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1GL1614( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1GL1614( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1GL1614( ) ;
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
                  if ( nRcdDeleted_1614 == 0 )
                  {
                     GXCCtl = "HISLIN_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHisLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1614_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1614, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisLin_Internalname, GXutil.ltrim( localUtil.ntoc( A550HisLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisPro_Internalname, GXutil.ltrim( localUtil.ntoc( A555HisPro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisTie_Internalname, GXutil.ltrim( localUtil.ntoc( A570HisTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z550HisLin_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z550HisLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z555HisPro_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z555HisPro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z570HisTie_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z570HisTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1614_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1614, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1614_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1614, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1614_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1614, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1614 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1614_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1614_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISLIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPRO_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISTIE_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisTie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1GL0( )
   {
   }

   public void e111GL2( )
   {
      /* Start Routine */
      returnInSub = false ;
   }

   public void zm1GL1613( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z573HisUniPro = T01GL5_A573HisUniPro[0] ;
         }
         else
         {
            Z573HisUniPro = A573HisUniPro ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z551HisMes = A551HisMes ;
         Z538HisAny = A538HisAny ;
         Z573HisUniPro = A573HisUniPro ;
         Z396EmprCod = A396EmprCod ;
         Z503GruOpeCod = A503GruOpeCod ;
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

   public void load1GL1613( )
   {
      /* Using cursor T01GL7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod), Byte.valueOf(A551HisMes), Short.valueOf(A538HisAny)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1613 = (short)(1) ;
         A573HisUniPro = T01GL7_A573HisUniPro[0] ;
         n573HisUniPro = T01GL7_n573HisUniPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A573HisUniPro", GXutil.ltrimstr( A573HisUniPro, 10, 2));
         zm1GL1613( -1) ;
      }
      pr_default.close(5);
      onLoadActions1GL1613( ) ;
   }

   public void onLoadActions1GL1613( )
   {
   }

   public void checkExtendedTable1GL1613( )
   {
      nIsDirty_1613 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01GL6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CGRUOP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRUOPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(4);
   }

   public void closeExtendedTableCursors1GL1613( )
   {
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod ,
                         int A503GruOpeCod )
   {
      /* Using cursor T01GL8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CGRUOP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRUOPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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

   public void getKey1GL1613( )
   {
      /* Using cursor T01GL9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod), Byte.valueOf(A551HisMes), Short.valueOf(A538HisAny)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1613 = (short)(1) ;
      }
      else
      {
         RcdFound1613 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01GL5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod), Byte.valueOf(A551HisMes), Short.valueOf(A538HisAny)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1GL1613( 1) ;
         RcdFound1613 = (short)(1) ;
         A551HisMes = T01GL5_A551HisMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A551HisMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A551HisMes), 2, 0));
         A538HisAny = T01GL5_A538HisAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A538HisAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A538HisAny), 4, 0));
         A573HisUniPro = T01GL5_A573HisUniPro[0] ;
         n573HisUniPro = T01GL5_n573HisUniPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A573HisUniPro", GXutil.ltrimstr( A573HisUniPro, 10, 2));
         A396EmprCod = T01GL5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A503GruOpeCod = T01GL5_A503GruOpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A503GruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A503GruOpeCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z503GruOpeCod = A503GruOpeCod ;
         Z551HisMes = A551HisMes ;
         Z538HisAny = A538HisAny ;
         sMode1613 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1GL1613( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1613 = (short)(0) ;
            initializeNonKey1GL1613( ) ;
         }
         Gx_mode = sMode1613 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1613 = (short)(0) ;
         initializeNonKey1GL1613( ) ;
         sMode1613 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1613 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1GL1613( ) ;
      if ( RcdFound1613 == 0 )
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
      RcdFound1613 = (short)(0) ;
      /* Using cursor T01GL10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A503GruOpeCod), Integer.valueOf(A503GruOpeCod), A396EmprCod, Byte.valueOf(A551HisMes), Byte.valueOf(A551HisMes), Integer.valueOf(A503GruOpeCod), A396EmprCod, Short.valueOf(A538HisAny)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01GL10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01GL10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GL10_A503GruOpeCod[0] < A503GruOpeCod ) || ( T01GL10_A503GruOpeCod[0] == A503GruOpeCod ) && ( GXutil.strcmp(T01GL10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GL10_A551HisMes[0] < A551HisMes ) || ( T01GL10_A551HisMes[0] == A551HisMes ) && ( T01GL10_A503GruOpeCod[0] == A503GruOpeCod ) && ( GXutil.strcmp(T01GL10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GL10_A538HisAny[0] < A538HisAny ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01GL10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01GL10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GL10_A503GruOpeCod[0] > A503GruOpeCod ) || ( T01GL10_A503GruOpeCod[0] == A503GruOpeCod ) && ( GXutil.strcmp(T01GL10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GL10_A551HisMes[0] > A551HisMes ) || ( T01GL10_A551HisMes[0] == A551HisMes ) && ( T01GL10_A503GruOpeCod[0] == A503GruOpeCod ) && ( GXutil.strcmp(T01GL10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GL10_A538HisAny[0] > A538HisAny ) ) )
         {
            A396EmprCod = T01GL10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A503GruOpeCod = T01GL10_A503GruOpeCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A503GruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A503GruOpeCod), 6, 0));
            A551HisMes = T01GL10_A551HisMes[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A551HisMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A551HisMes), 2, 0));
            A538HisAny = T01GL10_A538HisAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A538HisAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A538HisAny), 4, 0));
            RcdFound1613 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1613 = (short)(0) ;
      /* Using cursor T01GL11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A503GruOpeCod), Integer.valueOf(A503GruOpeCod), A396EmprCod, Byte.valueOf(A551HisMes), Byte.valueOf(A551HisMes), Integer.valueOf(A503GruOpeCod), A396EmprCod, Short.valueOf(A538HisAny)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01GL11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01GL11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GL11_A503GruOpeCod[0] > A503GruOpeCod ) || ( T01GL11_A503GruOpeCod[0] == A503GruOpeCod ) && ( GXutil.strcmp(T01GL11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GL11_A551HisMes[0] > A551HisMes ) || ( T01GL11_A551HisMes[0] == A551HisMes ) && ( T01GL11_A503GruOpeCod[0] == A503GruOpeCod ) && ( GXutil.strcmp(T01GL11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GL11_A538HisAny[0] > A538HisAny ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01GL11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01GL11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GL11_A503GruOpeCod[0] < A503GruOpeCod ) || ( T01GL11_A503GruOpeCod[0] == A503GruOpeCod ) && ( GXutil.strcmp(T01GL11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GL11_A551HisMes[0] < A551HisMes ) || ( T01GL11_A551HisMes[0] == A551HisMes ) && ( T01GL11_A503GruOpeCod[0] == A503GruOpeCod ) && ( GXutil.strcmp(T01GL11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GL11_A538HisAny[0] < A538HisAny ) ) )
         {
            A396EmprCod = T01GL11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A503GruOpeCod = T01GL11_A503GruOpeCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A503GruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A503GruOpeCod), 6, 0));
            A551HisMes = T01GL11_A551HisMes[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A551HisMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A551HisMes), 2, 0));
            A538HisAny = T01GL11_A538HisAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A538HisAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A538HisAny), 4, 0));
            RcdFound1613 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1GL1613( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1GL1613( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1613 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A503GruOpeCod != Z503GruOpeCod ) || ( A551HisMes != Z551HisMes ) || ( A538HisAny != Z538HisAny ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A503GruOpeCod = Z503GruOpeCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A503GruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A503GruOpeCod), 6, 0));
               A551HisMes = Z551HisMes ;
               httpContext.ajax_rsp_assign_attri("", false, "A551HisMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A551HisMes), 2, 0));
               A538HisAny = Z538HisAny ;
               httpContext.ajax_rsp_assign_attri("", false, "A538HisAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A538HisAny), 4, 0));
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
               update1GL1613( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A503GruOpeCod != Z503GruOpeCod ) || ( A551HisMes != Z551HisMes ) || ( A538HisAny != Z538HisAny ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1GL1613( ) ;
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
                  insert1GL1613( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A503GruOpeCod != Z503GruOpeCod ) || ( A551HisMes != Z551HisMes ) || ( A538HisAny != Z538HisAny ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A503GruOpeCod = Z503GruOpeCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A503GruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A503GruOpeCod), 6, 0));
         A551HisMes = Z551HisMes ;
         httpContext.ajax_rsp_assign_attri("", false, "A551HisMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A551HisMes), 2, 0));
         A538HisAny = Z538HisAny ;
         httpContext.ajax_rsp_assign_attri("", false, "A538HisAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A538HisAny), 4, 0));
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
      getKey1GL1613( ) ;
      if ( RcdFound1613 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A503GruOpeCod != Z503GruOpeCod ) || ( A551HisMes != Z551HisMes ) || ( A538HisAny != Z538HisAny ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A503GruOpeCod = Z503GruOpeCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A503GruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A503GruOpeCod), 6, 0));
            A551HisMes = Z551HisMes ;
            httpContext.ajax_rsp_assign_attri("", false, "A551HisMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A551HisMes), 2, 0));
            A538HisAny = Z538HisAny ;
            httpContext.ajax_rsp_assign_attri("", false, "A538HisAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A538HisAny), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A503GruOpeCod != Z503GruOpeCod ) || ( A551HisMes != Z551HisMes ) || ( A538HisAny != Z538HisAny ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "thisope");
      GX_FocusControl = edtHisUniPro_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1GL0( ) ;
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
      if ( RcdFound1613 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtHisUniPro_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1GL1613( ) ;
      if ( RcdFound1613 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHisUniPro_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1GL1613( ) ;
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
      if ( RcdFound1613 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHisUniPro_Internalname ;
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
      if ( RcdFound1613 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHisUniPro_Internalname ;
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
      scanStart1GL1613( ) ;
      if ( RcdFound1613 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1613 != 0 )
         {
            scanNext1GL1613( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHisUniPro_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1GL1613( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1GL1613( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01GL4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod), Byte.valueOf(A551HisMes), Short.valueOf(A538HisAny)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCHIOPE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( DecimalUtil.compareTo(Z573HisUniPro, T01GL4_A573HisUniPro[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z573HisUniPro, T01GL4_A573HisUniPro[0]) != 0 )
            {
               GXutil.writeLogln("thisope:[seudo value changed for attri]"+"HisUniPro");
               GXutil.writeLogRaw("Old: ",Z573HisUniPro);
               GXutil.writeLogRaw("Current: ",T01GL4_A573HisUniPro[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCHIOPE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1GL1613( )
   {
      beforeValidate1GL1613( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GL1613( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1GL1613( 0) ;
         checkOptimisticConcurrency1GL1613( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GL1613( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1GL1613( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GL12 */
                  pr_default.execute(10, new Object[] {Byte.valueOf(A551HisMes), Short.valueOf(A538HisAny), Boolean.valueOf(n573HisUniPro), A573HisUniPro, A396EmprCod, Integer.valueOf(A503GruOpeCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCHIOPE");
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
                        processLevel1GL1613( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1GL0( ) ;
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
            load1GL1613( ) ;
         }
         endLevel1GL1613( ) ;
      }
      closeExtendedTableCursors1GL1613( ) ;
   }

   public void update1GL1613( )
   {
      beforeValidate1GL1613( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GL1613( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GL1613( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GL1613( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1GL1613( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GL13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n573HisUniPro), A573HisUniPro, A396EmprCod, Integer.valueOf(A503GruOpeCod), Byte.valueOf(A551HisMes), Short.valueOf(A538HisAny)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCHIOPE");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCHIOPE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1GL1613( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1GL1613( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1GL0( ) ;
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
         endLevel1GL1613( ) ;
      }
      closeExtendedTableCursors1GL1613( ) ;
   }

   public void deferredUpdate1GL1613( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1GL1613( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GL1613( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1GL1613( ) ;
         afterConfirm1GL1613( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1GL1613( ) ;
            if ( AnyError == 0 )
            {
               scanStart1GL1614( ) ;
               while ( RcdFound1614 != 0 )
               {
                  getByPrimaryKey1GL1614( ) ;
                  delete1GL1614( ) ;
                  scanNext1GL1614( ) ;
               }
               scanEnd1GL1614( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GL14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod), Byte.valueOf(A551HisMes), Short.valueOf(A538HisAny)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCHIOPE");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1613 == 0 )
                        {
                           initAll1GL1613( ) ;
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
                        resetCaption1GL0( ) ;
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
      sMode1613 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1GL1613( ) ;
      Gx_mode = sMode1613 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1GL1613( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1GL1614( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1GL1614( ) ;
         if ( ( nRcdExists_1614 != 0 ) || ( nIsMod_1614 != 0 ) )
         {
            standaloneNotModal1GL1614( ) ;
            getKey1GL1614( ) ;
            if ( ( nRcdExists_1614 == 0 ) && ( nRcdDeleted_1614 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1GL1614( ) ;
            }
            else
            {
               if ( RcdFound1614 != 0 )
               {
                  if ( ( nRcdDeleted_1614 != 0 ) && ( nRcdExists_1614 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1GL1614( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1614 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1GL1614( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1614 == 0 )
                  {
                     GXCCtl = "HISLIN_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHisLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1614_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1614, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisLin_Internalname, GXutil.ltrim( localUtil.ntoc( A550HisLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisPro_Internalname, GXutil.ltrim( localUtil.ntoc( A555HisPro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisTie_Internalname, GXutil.ltrim( localUtil.ntoc( A570HisTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z550HisLin_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z550HisLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z555HisPro_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z555HisPro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z570HisTie_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z570HisTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1614_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1614, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1614_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1614, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1614_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1614, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1614 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1614_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1614_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISLIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPRO_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISTIE_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisTie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1GL1614( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1614 = (short)(0) ;
      nIsMod_1614 = (short)(0) ;
      nRcdDeleted_1614 = (short)(0) ;
   }

   public void processLevel1GL1613( )
   {
      /* Save parent mode. */
      sMode1613 = Gx_mode ;
      processNestedLevel1GL1614( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1613 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1GL1613( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1GL1613( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "thisope");
         if ( AnyError == 0 )
         {
            confirmValues1GL0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "thisope");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1GL1613( )
   {
      /* Using cursor T01GL15 */
      pr_default.execute(13);
      RcdFound1613 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1613 = (short)(1) ;
         A396EmprCod = T01GL15_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A503GruOpeCod = T01GL15_A503GruOpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A503GruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A503GruOpeCod), 6, 0));
         A551HisMes = T01GL15_A551HisMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A551HisMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A551HisMes), 2, 0));
         A538HisAny = T01GL15_A538HisAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A538HisAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A538HisAny), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1GL1613( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound1613 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1613 = (short)(1) ;
         A396EmprCod = T01GL15_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A503GruOpeCod = T01GL15_A503GruOpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A503GruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A503GruOpeCod), 6, 0));
         A551HisMes = T01GL15_A551HisMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A551HisMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A551HisMes), 2, 0));
         A538HisAny = T01GL15_A538HisAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A538HisAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A538HisAny), 4, 0));
      }
   }

   public void scanEnd1GL1613( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1GL1613( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1GL1613( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1GL1613( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1GL1613( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1GL1613( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1GL1613( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1GL1613( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtGruOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGruOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGruOpeCod_Enabled), 5, 0), true);
      edtHisMes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisMes_Enabled), 5, 0), true);
      edtHisAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisAny_Enabled), 5, 0), true);
      edtHisUniPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisUniPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisUniPro_Enabled), 5, 0), true);
   }

   public void zm1GL1614( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z555HisPro = T01GL3_A555HisPro[0] ;
            Z570HisTie = T01GL3_A570HisTie[0] ;
         }
         else
         {
            Z555HisPro = A555HisPro ;
            Z570HisTie = A570HisTie ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z396EmprCod = A396EmprCod ;
         Z503GruOpeCod = A503GruOpeCod ;
         Z551HisMes = A551HisMes ;
         Z538HisAny = A538HisAny ;
         Z550HisLin = A550HisLin ;
         Z555HisPro = A555HisPro ;
         Z570HisTie = A570HisTie ;
      }
   }

   public void standaloneNotModal1GL1614( )
   {
   }

   public void standaloneModal1GL1614( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHisLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHisLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtHisLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHisLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
   }

   public void load1GL1614( )
   {
      /* Using cursor T01GL16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod), Byte.valueOf(A551HisMes), Short.valueOf(A538HisAny), Byte.valueOf(A550HisLin)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1614 = (short)(1) ;
         A555HisPro = T01GL16_A555HisPro[0] ;
         n555HisPro = T01GL16_n555HisPro[0] ;
         A570HisTie = T01GL16_A570HisTie[0] ;
         n570HisTie = T01GL16_n570HisTie[0] ;
         zm1GL1614( -3) ;
      }
      pr_default.close(14);
      onLoadActions1GL1614( ) ;
   }

   public void onLoadActions1GL1614( )
   {
   }

   public void checkExtendedTable1GL1614( )
   {
      nIsDirty_1614 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1GL1614( ) ;
   }

   public void closeExtendedTableCursors1GL1614( )
   {
   }

   public void enableDisable1GL1614( )
   {
   }

   public void getKey1GL1614( )
   {
      /* Using cursor T01GL17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod), Byte.valueOf(A551HisMes), Short.valueOf(A538HisAny), Byte.valueOf(A550HisLin)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1614 = (short)(1) ;
      }
      else
      {
         RcdFound1614 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey1GL1614( )
   {
      /* Using cursor T01GL3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod), Byte.valueOf(A551HisMes), Short.valueOf(A538HisAny), Byte.valueOf(A550HisLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1GL1614( 3) ;
         RcdFound1614 = (short)(1) ;
         initializeNonKey1GL1614( ) ;
         A550HisLin = T01GL3_A550HisLin[0] ;
         A555HisPro = T01GL3_A555HisPro[0] ;
         n555HisPro = T01GL3_n555HisPro[0] ;
         A570HisTie = T01GL3_A570HisTie[0] ;
         n570HisTie = T01GL3_n570HisTie[0] ;
         Z396EmprCod = A396EmprCod ;
         Z503GruOpeCod = A503GruOpeCod ;
         Z551HisMes = A551HisMes ;
         Z538HisAny = A538HisAny ;
         Z550HisLin = A550HisLin ;
         sMode1614 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1GL1614( ) ;
         load1GL1614( ) ;
         Gx_mode = sMode1614 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1614 = (short)(0) ;
         initializeNonKey1GL1614( ) ;
         sMode1614 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1GL1614( ) ;
         Gx_mode = sMode1614 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1GL1614( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1GL1614( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01GL2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod), Byte.valueOf(A551HisMes), Short.valueOf(A538HisAny), Byte.valueOf(A550HisLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLHIOPE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z555HisPro, T01GL2_A555HisPro[0]) != 0 ) || ( Z570HisTie != T01GL2_A570HisTie[0] ) )
         {
            if ( DecimalUtil.compareTo(Z555HisPro, T01GL2_A555HisPro[0]) != 0 )
            {
               GXutil.writeLogln("thisope:[seudo value changed for attri]"+"HisPro");
               GXutil.writeLogRaw("Old: ",Z555HisPro);
               GXutil.writeLogRaw("Current: ",T01GL2_A555HisPro[0]);
            }
            if ( Z570HisTie != T01GL2_A570HisTie[0] )
            {
               GXutil.writeLogln("thisope:[seudo value changed for attri]"+"HisTie");
               GXutil.writeLogRaw("Old: ",Z570HisTie);
               GXutil.writeLogRaw("Current: ",T01GL2_A570HisTie[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLHIOPE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1GL1614( )
   {
      beforeValidate1GL1614( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GL1614( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1GL1614( 0) ;
         checkOptimisticConcurrency1GL1614( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GL1614( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1GL1614( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GL18 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod), Byte.valueOf(A551HisMes), Short.valueOf(A538HisAny), Byte.valueOf(A550HisLin), Boolean.valueOf(n555HisPro), A555HisPro, Boolean.valueOf(n570HisTie), Short.valueOf(A570HisTie)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIOPE");
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
            load1GL1614( ) ;
         }
         endLevel1GL1614( ) ;
      }
      closeExtendedTableCursors1GL1614( ) ;
   }

   public void update1GL1614( )
   {
      beforeValidate1GL1614( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GL1614( ) ;
      }
      if ( ( nIsMod_1614 != 0 ) || ( nIsDirty_1614 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1GL1614( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1GL1614( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1GL1614( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01GL19 */
                     pr_default.execute(17, new Object[] {Boolean.valueOf(n555HisPro), A555HisPro, Boolean.valueOf(n570HisTie), Short.valueOf(A570HisTie), A396EmprCod, Integer.valueOf(A503GruOpeCod), Byte.valueOf(A551HisMes), Short.valueOf(A538HisAny), Byte.valueOf(A550HisLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIOPE");
                     if ( (pr_default.getStatus(17) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLHIOPE"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1GL1614( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1GL1614( ) ;
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
            endLevel1GL1614( ) ;
         }
      }
      closeExtendedTableCursors1GL1614( ) ;
   }

   public void deferredUpdate1GL1614( )
   {
   }

   public void delete1GL1614( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1GL1614( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GL1614( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1GL1614( ) ;
         afterConfirm1GL1614( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1GL1614( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01GL20 */
               pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod), Byte.valueOf(A551HisMes), Short.valueOf(A538HisAny), Byte.valueOf(A550HisLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIOPE");
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
      sMode1614 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1GL1614( ) ;
      Gx_mode = sMode1614 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1GL1614( )
   {
      standaloneModal1GL1614( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1GL1614( )
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

   public void scanStart1GL1614( )
   {
      /* Scan By routine */
      /* Using cursor T01GL21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod), Byte.valueOf(A551HisMes), Short.valueOf(A538HisAny)});
      RcdFound1614 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1614 = (short)(1) ;
         A550HisLin = T01GL21_A550HisLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1GL1614( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound1614 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1614 = (short)(1) ;
         A550HisLin = T01GL21_A550HisLin[0] ;
      }
   }

   public void scanEnd1GL1614( )
   {
      pr_default.close(19);
   }

   public void afterConfirm1GL1614( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1GL1614( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1GL1614( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1GL1614( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1GL1614( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1GL1614( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1GL1614( )
   {
      edtHisLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtHisPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisPro_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtHisTie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisTie_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void send_integrity_lvl_hashes1GL1614( )
   {
   }

   public void send_integrity_lvl_hashes1GL1613( )
   {
   }

   public void subsflControlProps_451614( )
   {
      edtavnRcdDeleted_1614_Internalname = "vNRCDDELETED_1614_"+sGXsfl_45_idx ;
      edtHisLin_Internalname = "HISLIN_"+sGXsfl_45_idx ;
      edtHisPro_Internalname = "HISPRO_"+sGXsfl_45_idx ;
      edtHisTie_Internalname = "HISTIE_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_451614( )
   {
      edtavnRcdDeleted_1614_Internalname = "vNRCDDELETED_1614_"+sGXsfl_45_fel_idx ;
      edtHisLin_Internalname = "HISLIN_"+sGXsfl_45_fel_idx ;
      edtHisPro_Internalname = "HISPRO_"+sGXsfl_45_fel_idx ;
      edtHisTie_Internalname = "HISTIE_"+sGXsfl_45_fel_idx ;
   }

   public void addRow1GL1614( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451614( ) ;
      sendRow1GL1614( ) ;
   }

   public void sendRow1GL1614( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1614_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1614_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1614, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1614_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1614), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1614), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1614_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1614_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1614_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisLin_Internalname,GXutil.ltrim( localUtil.ntoc( A550HisLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A550HisLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1614_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisPro_Internalname,GXutil.ltrim( localUtil.ntoc( A555HisPro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisPro_Enabled!=0) ? localUtil.format( A555HisPro, "ZZZZZZ9.99") : localUtil.format( A555HisPro, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisPro_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1614_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisTie_Internalname,GXutil.ltrim( localUtil.ntoc( A570HisTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisTie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A570HisTie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A570HisTie), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisTie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisTie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1GL1614( ) ;
      GXCCtl = "Z550HisLin_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z550HisLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z555HisPro_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z555HisPro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z570HisTie_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z570HisTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1614_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1614, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1614_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1614, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1614_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1614, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1614_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1614_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISLIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPRO_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISTIE_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisTie_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1GL1614( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451614( ) ;
      edtavnRcdDeleted_1614_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1614_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISLIN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPRO_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisTie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISTIE_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1614_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1614_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1614");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1614_Internalname ;
         wbErr = true ;
         nRcdDeleted_1614 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1614 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1614_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "HISLIN_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisLin_Internalname ;
         wbErr = true ;
         A550HisLin = (byte)(0) ;
      }
      else
      {
         A550HisLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHisPro_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHisPro_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "HISPRO_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisPro_Internalname ;
         wbErr = true ;
         A555HisPro = DecimalUtil.ZERO ;
         n555HisPro = false ;
      }
      else
      {
         A555HisPro = localUtil.ctond( httpContext.cgiGet( edtHisPro_Internalname)) ;
         n555HisPro = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "HISTIE_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisTie_Internalname ;
         wbErr = true ;
         A570HisTie = (short)(0) ;
         n570HisTie = false ;
      }
      else
      {
         A570HisTie = (short)(localUtil.ctol( httpContext.cgiGet( edtHisTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n570HisTie = false ;
      }
      GXCCtl = "Z550HisLin_" + sGXsfl_45_idx ;
      Z550HisLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z555HisPro_" + sGXsfl_45_idx ;
      Z555HisPro = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z570HisTie_" + sGXsfl_45_idx ;
      Z570HisTie = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1614_" + sGXsfl_45_idx ;
      nRcdDeleted_1614 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1614_" + sGXsfl_45_idx ;
      nRcdExists_1614 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1614_" + sGXsfl_45_idx ;
      nIsMod_1614 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtHisLin_Enabled = edtHisLin_Enabled ;
   }

   public void confirmValues1GL0( )
   {
      nGXsfl_45_idx = 0 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451614( ) ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451614( ) ;
         httpContext.changePostValue( "Z550HisLin_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z550HisLin_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z550HisLin_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z555HisPro_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z555HisPro_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z555HisPro_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z570HisTie_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z570HisTie_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z570HisTie_"+sGXsfl_45_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.thisope", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z503GruOpeCod", GXutil.ltrim( localUtil.ntoc( Z503GruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z551HisMes", GXutil.ltrim( localUtil.ntoc( Z551HisMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z538HisAny", GXutil.ltrim( localUtil.ntoc( Z538HisAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z573HisUniPro", GXutil.ltrim( localUtil.ntoc( Z573HisUniPro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.thisope", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "THISOPE" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "HISTORICO PRODUCCION OPERARIO", "") ;
   }

   public void initializeNonKey1GL1613( )
   {
      A573HisUniPro = DecimalUtil.ZERO ;
      n573HisUniPro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A573HisUniPro", GXutil.ltrimstr( A573HisUniPro, 10, 2));
      Z573HisUniPro = DecimalUtil.ZERO ;
   }

   public void initAll1GL1613( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A503GruOpeCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A503GruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A503GruOpeCod), 6, 0));
      A551HisMes = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A551HisMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A551HisMes), 2, 0));
      A538HisAny = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A538HisAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A538HisAny), 4, 0));
      initializeNonKey1GL1613( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1GL1614( )
   {
      A555HisPro = DecimalUtil.ZERO ;
      n555HisPro = false ;
      A570HisTie = (short)(0) ;
      n570HisTie = false ;
      Z555HisPro = DecimalUtil.ZERO ;
      Z570HisTie = (short)(0) ;
   }

   public void initAll1GL1614( )
   {
      A550HisLin = (byte)(0) ;
      initializeNonKey1GL1614( ) ;
   }

   public void standaloneModalInsert1GL1614( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016323121", true, true);
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
      httpContext.AddJavascriptSource("thisope.js", "?202661016323121", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1614( )
   {
      edtHisLin_Enabled = defedtHisLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1614, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1614_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A550HisLin, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A555HisPro, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A570HisTie, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisTie_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtGruOpeCod_Internalname = "GRUOPECOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtHisMes_Internalname = "HISMES" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtHisAny_Internalname = "HISANY" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtHisUniPro_Internalname = "HISUNIPRO" ;
      edtavnRcdDeleted_1614_Internalname = "vNRCDDELETED_1614" ;
      edtHisLin_Internalname = "HISLIN" ;
      edtHisPro_Internalname = "HISPRO" ;
      edtHisTie_Internalname = "HISTIE" ;
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
      Form.setCaption( httpContext.getMessage( "HISTORICO PRODUCCION OPERARIO", "") );
      edtHisTie_Jsonclick = "" ;
      edtHisPro_Jsonclick = "" ;
      edtHisLin_Jsonclick = "" ;
      edtavnRcdDeleted_1614_Jsonclick = "" ;
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
      edtHisTie_Enabled = 1 ;
      edtHisPro_Enabled = 1 ;
      edtHisLin_Enabled = 1 ;
      edtavnRcdDeleted_1614_Enabled = 1 ;
      edtHisUniPro_Jsonclick = "" ;
      edtHisUniPro_Backcolor = (int)(0xFFFFFF) ;
      edtHisUniPro_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtHisAny_Jsonclick = "" ;
      edtHisAny_Backcolor = (int)(0xFFFFFF) ;
      edtHisAny_Enabled = 1 ;
      edtHisMes_Jsonclick = "" ;
      edtHisMes_Backcolor = (int)(0xFFFFFF) ;
      edtHisMes_Enabled = 1 ;
      edtGruOpeCod_Jsonclick = "" ;
      edtGruOpeCod_Backcolor = (int)(0xFFFFFF) ;
      edtGruOpeCod_Enabled = 1 ;
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
      subsflControlProps_451614( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1GL1614( ) ;
         standaloneModal1GL1614( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1GL1614( ) ;
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451614( ) ;
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
      /* Using cursor T01GL22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CGRUOP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRUOPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(20);
      GX_FocusControl = edtHisUniPro_Internalname ;
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

   public void valid_Gruopecod( )
   {
      /* Using cursor T01GL22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CGRUOP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRUOPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(20);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Hisany( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A573HisUniPro", GXutil.ltrim( localUtil.ntoc( A573HisUniPro, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z503GruOpeCod", GXutil.ltrim( localUtil.ntoc( Z503GruOpeCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z551HisMes", GXutil.ltrim( localUtil.ntoc( Z551HisMes, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z538HisAny", GXutil.ltrim( localUtil.ntoc( Z538HisAny, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z573HisUniPro", GXutil.ltrim( localUtil.ntoc( Z573HisUniPro, (byte)(10), (byte)(2), ".", "")));
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
      setEventMetadata("VALID_GRUOPECOD","{handler:'valid_Gruopecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_GRUOPECOD",",oparms:[]}");
      setEventMetadata("VALID_HISMES","{handler:'valid_Hismes',iparms:[]");
      setEventMetadata("VALID_HISMES",",oparms:[]}");
      setEventMetadata("VALID_HISANY","{handler:'valid_Hisany',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'A551HisMes',fld:'HISMES',pic:'Z9'},{av:'A538HisAny',fld:'HISANY',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_HISANY",",oparms:[{av:'A573HisUniPro',fld:'HISUNIPRO',pic:'ZZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z503GruOpeCod'},{av:'Z551HisMes'},{av:'Z538HisAny'},{av:'Z573HisUniPro'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_HISLIN","{handler:'valid_Hislin',iparms:[]");
      setEventMetadata("VALID_HISLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Histie',iparms:[]");
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
      Z573HisUniPro = DecimalUtil.ZERO ;
      Z555HisPro = DecimalUtil.ZERO ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A573HisUniPro = DecimalUtil.ZERO ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1614 = "" ;
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
      sMode1613 = "" ;
      GXCCtl = "" ;
      A555HisPro = DecimalUtil.ZERO ;
      T01GL7_A551HisMes = new byte[1] ;
      T01GL7_A538HisAny = new short[1] ;
      T01GL7_A573HisUniPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GL7_n573HisUniPro = new boolean[] {false} ;
      T01GL7_A396EmprCod = new String[] {""} ;
      T01GL7_A503GruOpeCod = new int[1] ;
      T01GL6_A396EmprCod = new String[] {""} ;
      T01GL8_A396EmprCod = new String[] {""} ;
      T01GL9_A396EmprCod = new String[] {""} ;
      T01GL9_A503GruOpeCod = new int[1] ;
      T01GL9_A551HisMes = new byte[1] ;
      T01GL9_A538HisAny = new short[1] ;
      T01GL5_A551HisMes = new byte[1] ;
      T01GL5_A538HisAny = new short[1] ;
      T01GL5_A573HisUniPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GL5_n573HisUniPro = new boolean[] {false} ;
      T01GL5_A396EmprCod = new String[] {""} ;
      T01GL5_A503GruOpeCod = new int[1] ;
      T01GL10_A396EmprCod = new String[] {""} ;
      T01GL10_A503GruOpeCod = new int[1] ;
      T01GL10_A551HisMes = new byte[1] ;
      T01GL10_A538HisAny = new short[1] ;
      T01GL11_A396EmprCod = new String[] {""} ;
      T01GL11_A503GruOpeCod = new int[1] ;
      T01GL11_A551HisMes = new byte[1] ;
      T01GL11_A538HisAny = new short[1] ;
      T01GL4_A551HisMes = new byte[1] ;
      T01GL4_A538HisAny = new short[1] ;
      T01GL4_A573HisUniPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GL4_n573HisUniPro = new boolean[] {false} ;
      T01GL4_A396EmprCod = new String[] {""} ;
      T01GL4_A503GruOpeCod = new int[1] ;
      T01GL15_A396EmprCod = new String[] {""} ;
      T01GL15_A503GruOpeCod = new int[1] ;
      T01GL15_A551HisMes = new byte[1] ;
      T01GL15_A538HisAny = new short[1] ;
      T01GL16_A396EmprCod = new String[] {""} ;
      T01GL16_A503GruOpeCod = new int[1] ;
      T01GL16_A551HisMes = new byte[1] ;
      T01GL16_A538HisAny = new short[1] ;
      T01GL16_A550HisLin = new byte[1] ;
      T01GL16_A555HisPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GL16_n555HisPro = new boolean[] {false} ;
      T01GL16_A570HisTie = new short[1] ;
      T01GL16_n570HisTie = new boolean[] {false} ;
      T01GL17_A396EmprCod = new String[] {""} ;
      T01GL17_A503GruOpeCod = new int[1] ;
      T01GL17_A551HisMes = new byte[1] ;
      T01GL17_A538HisAny = new short[1] ;
      T01GL17_A550HisLin = new byte[1] ;
      T01GL3_A396EmprCod = new String[] {""} ;
      T01GL3_A503GruOpeCod = new int[1] ;
      T01GL3_A551HisMes = new byte[1] ;
      T01GL3_A538HisAny = new short[1] ;
      T01GL3_A550HisLin = new byte[1] ;
      T01GL3_A555HisPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GL3_n555HisPro = new boolean[] {false} ;
      T01GL3_A570HisTie = new short[1] ;
      T01GL3_n570HisTie = new boolean[] {false} ;
      T01GL2_A396EmprCod = new String[] {""} ;
      T01GL2_A503GruOpeCod = new int[1] ;
      T01GL2_A551HisMes = new byte[1] ;
      T01GL2_A538HisAny = new short[1] ;
      T01GL2_A550HisLin = new byte[1] ;
      T01GL2_A555HisPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GL2_n555HisPro = new boolean[] {false} ;
      T01GL2_A570HisTie = new short[1] ;
      T01GL2_n570HisTie = new boolean[] {false} ;
      T01GL21_A396EmprCod = new String[] {""} ;
      T01GL21_A503GruOpeCod = new int[1] ;
      T01GL21_A551HisMes = new byte[1] ;
      T01GL21_A538HisAny = new short[1] ;
      T01GL21_A550HisLin = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01GL22_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ573HisUniPro = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.thisope__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.thisope__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.thisope__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.thisope__default(),
         new Object[] {
             new Object[] {
            T01GL2_A396EmprCod, T01GL2_A503GruOpeCod, T01GL2_A551HisMes, T01GL2_A538HisAny, T01GL2_A550HisLin, T01GL2_A555HisPro, T01GL2_n555HisPro, T01GL2_A570HisTie, T01GL2_n570HisTie
            }
            , new Object[] {
            T01GL3_A396EmprCod, T01GL3_A503GruOpeCod, T01GL3_A551HisMes, T01GL3_A538HisAny, T01GL3_A550HisLin, T01GL3_A555HisPro, T01GL3_n555HisPro, T01GL3_A570HisTie, T01GL3_n570HisTie
            }
            , new Object[] {
            T01GL4_A551HisMes, T01GL4_A538HisAny, T01GL4_A573HisUniPro, T01GL4_n573HisUniPro, T01GL4_A396EmprCod, T01GL4_A503GruOpeCod
            }
            , new Object[] {
            T01GL5_A551HisMes, T01GL5_A538HisAny, T01GL5_A573HisUniPro, T01GL5_n573HisUniPro, T01GL5_A396EmprCod, T01GL5_A503GruOpeCod
            }
            , new Object[] {
            T01GL6_A396EmprCod
            }
            , new Object[] {
            T01GL7_A551HisMes, T01GL7_A538HisAny, T01GL7_A573HisUniPro, T01GL7_n573HisUniPro, T01GL7_A396EmprCod, T01GL7_A503GruOpeCod
            }
            , new Object[] {
            T01GL8_A396EmprCod
            }
            , new Object[] {
            T01GL9_A396EmprCod, T01GL9_A503GruOpeCod, T01GL9_A551HisMes, T01GL9_A538HisAny
            }
            , new Object[] {
            T01GL10_A396EmprCod, T01GL10_A503GruOpeCod, T01GL10_A551HisMes, T01GL10_A538HisAny
            }
            , new Object[] {
            T01GL11_A396EmprCod, T01GL11_A503GruOpeCod, T01GL11_A551HisMes, T01GL11_A538HisAny
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01GL15_A396EmprCod, T01GL15_A503GruOpeCod, T01GL15_A551HisMes, T01GL15_A538HisAny
            }
            , new Object[] {
            T01GL16_A396EmprCod, T01GL16_A503GruOpeCod, T01GL16_A551HisMes, T01GL16_A538HisAny, T01GL16_A550HisLin, T01GL16_A555HisPro, T01GL16_n555HisPro, T01GL16_A570HisTie, T01GL16_n570HisTie
            }
            , new Object[] {
            T01GL17_A396EmprCod, T01GL17_A503GruOpeCod, T01GL17_A551HisMes, T01GL17_A538HisAny, T01GL17_A550HisLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01GL21_A396EmprCod, T01GL21_A503GruOpeCod, T01GL21_A551HisMes, T01GL21_A538HisAny, T01GL21_A550HisLin
            }
            , new Object[] {
            T01GL22_A396EmprCod
            }
         }
      );
   }

   private byte Z551HisMes ;
   private byte Z550HisLin ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A551HisMes ;
   private byte A550HisLin ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ551HisMes ;
   private short Z538HisAny ;
   private short Z570HisTie ;
   private short nRcdDeleted_1614 ;
   private short nRcdExists_1614 ;
   private short nIsMod_1614 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A538HisAny ;
   private short nBlankRcdCount1614 ;
   private short RcdFound1614 ;
   private short nBlankRcdUsr1614 ;
   private short A570HisTie ;
   private short RcdFound1613 ;
   private short nIsDirty_1613 ;
   private short nIsDirty_1614 ;
   private short ZZ538HisAny ;
   private int Z503GruOpeCod ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int A503GruOpeCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtGruOpeCod_Enabled ;
   private int edtHisMes_Enabled ;
   private int edtHisAny_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtHisUniPro_Enabled ;
   private int edtavnRcdDeleted_1614_Enabled ;
   private int edtHisLin_Enabled ;
   private int edtHisPro_Enabled ;
   private int edtHisTie_Enabled ;
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
   private int defedtHisLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtHisUniPro_Backcolor ;
   private int edtHisAny_Backcolor ;
   private int edtHisMes_Backcolor ;
   private int edtGruOpeCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ503GruOpeCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z573HisUniPro ;
   private java.math.BigDecimal Z555HisPro ;
   private java.math.BigDecimal A573HisUniPro ;
   private java.math.BigDecimal A555HisPro ;
   private java.math.BigDecimal ZZ573HisUniPro ;
   private String sPrefix ;
   private String Z396EmprCod ;
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
   private String edtGruOpeCod_Internalname ;
   private String edtGruOpeCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtHisMes_Internalname ;
   private String edtHisMes_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtHisAny_Internalname ;
   private String edtHisAny_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtHisUniPro_Internalname ;
   private String edtHisUniPro_Jsonclick ;
   private String sMode1614 ;
   private String edtavnRcdDeleted_1614_Internalname ;
   private String edtHisLin_Internalname ;
   private String edtHisPro_Internalname ;
   private String edtHisTie_Internalname ;
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
   private String sMode1613 ;
   private String GXCCtl ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1614_Jsonclick ;
   private String edtHisLin_Jsonclick ;
   private String edtHisPro_Jsonclick ;
   private String edtHisTie_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean n573HisUniPro ;
   private boolean returnInSub ;
   private boolean n555HisPro ;
   private boolean n570HisTie ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private byte[] T01GL7_A551HisMes ;
   private short[] T01GL7_A538HisAny ;
   private java.math.BigDecimal[] T01GL7_A573HisUniPro ;
   private boolean[] T01GL7_n573HisUniPro ;
   private String[] T01GL7_A396EmprCod ;
   private int[] T01GL7_A503GruOpeCod ;
   private String[] T01GL6_A396EmprCod ;
   private String[] T01GL8_A396EmprCod ;
   private String[] T01GL9_A396EmprCod ;
   private int[] T01GL9_A503GruOpeCod ;
   private byte[] T01GL9_A551HisMes ;
   private short[] T01GL9_A538HisAny ;
   private byte[] T01GL5_A551HisMes ;
   private short[] T01GL5_A538HisAny ;
   private java.math.BigDecimal[] T01GL5_A573HisUniPro ;
   private boolean[] T01GL5_n573HisUniPro ;
   private String[] T01GL5_A396EmprCod ;
   private int[] T01GL5_A503GruOpeCod ;
   private String[] T01GL10_A396EmprCod ;
   private int[] T01GL10_A503GruOpeCod ;
   private byte[] T01GL10_A551HisMes ;
   private short[] T01GL10_A538HisAny ;
   private String[] T01GL11_A396EmprCod ;
   private int[] T01GL11_A503GruOpeCod ;
   private byte[] T01GL11_A551HisMes ;
   private short[] T01GL11_A538HisAny ;
   private byte[] T01GL4_A551HisMes ;
   private short[] T01GL4_A538HisAny ;
   private java.math.BigDecimal[] T01GL4_A573HisUniPro ;
   private boolean[] T01GL4_n573HisUniPro ;
   private String[] T01GL4_A396EmprCod ;
   private int[] T01GL4_A503GruOpeCod ;
   private String[] T01GL15_A396EmprCod ;
   private int[] T01GL15_A503GruOpeCod ;
   private byte[] T01GL15_A551HisMes ;
   private short[] T01GL15_A538HisAny ;
   private String[] T01GL16_A396EmprCod ;
   private int[] T01GL16_A503GruOpeCod ;
   private byte[] T01GL16_A551HisMes ;
   private short[] T01GL16_A538HisAny ;
   private byte[] T01GL16_A550HisLin ;
   private java.math.BigDecimal[] T01GL16_A555HisPro ;
   private boolean[] T01GL16_n555HisPro ;
   private short[] T01GL16_A570HisTie ;
   private boolean[] T01GL16_n570HisTie ;
   private String[] T01GL17_A396EmprCod ;
   private int[] T01GL17_A503GruOpeCod ;
   private byte[] T01GL17_A551HisMes ;
   private short[] T01GL17_A538HisAny ;
   private byte[] T01GL17_A550HisLin ;
   private String[] T01GL3_A396EmprCod ;
   private int[] T01GL3_A503GruOpeCod ;
   private byte[] T01GL3_A551HisMes ;
   private short[] T01GL3_A538HisAny ;
   private byte[] T01GL3_A550HisLin ;
   private java.math.BigDecimal[] T01GL3_A555HisPro ;
   private boolean[] T01GL3_n555HisPro ;
   private short[] T01GL3_A570HisTie ;
   private boolean[] T01GL3_n570HisTie ;
   private String[] T01GL2_A396EmprCod ;
   private int[] T01GL2_A503GruOpeCod ;
   private byte[] T01GL2_A551HisMes ;
   private short[] T01GL2_A538HisAny ;
   private byte[] T01GL2_A550HisLin ;
   private java.math.BigDecimal[] T01GL2_A555HisPro ;
   private boolean[] T01GL2_n555HisPro ;
   private short[] T01GL2_A570HisTie ;
   private boolean[] T01GL2_n570HisTie ;
   private String[] T01GL21_A396EmprCod ;
   private int[] T01GL21_A503GruOpeCod ;
   private byte[] T01GL21_A551HisMes ;
   private short[] T01GL21_A538HisAny ;
   private byte[] T01GL21_A550HisLin ;
   private String[] T01GL22_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class thisope__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thisope__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thisope__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thisope__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01GL2", "SELECT EmprCod, GruOpeCod, HisMes, HisAny, HisLin, HisPro, HisTie FROM TXPLHIOPE WHERE EmprCod = ? AND GruOpeCod = ? AND HisMes = ? AND HisAny = ? AND HisLin = ?  FOR UPDATE OF HisPro, HisTie NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GL3", "SELECT EmprCod, GruOpeCod, HisMes, HisAny, HisLin, HisPro, HisTie FROM TXPLHIOPE WHERE EmprCod = ? AND GruOpeCod = ? AND HisMes = ? AND HisAny = ? AND HisLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GL4", "SELECT HisMes, HisAny, HisUniPro, EmprCod, GruOpeCod FROM TXPCHIOPE WHERE EmprCod = ? AND GruOpeCod = ? AND HisMes = ? AND HisAny = ?  FOR UPDATE OF HisUniPro NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GL5", "SELECT HisMes, HisAny, HisUniPro, EmprCod, GruOpeCod FROM TXPCHIOPE WHERE EmprCod = ? AND GruOpeCod = ? AND HisMes = ? AND HisAny = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GL6", "SELECT EmprCod FROM TXPCGRUOP WHERE EmprCod = ? AND GruOpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GL7", "SELECT /*+ FIRST_ROWS(100) */ TM1.HisMes, TM1.HisAny, TM1.HisUniPro, TM1.EmprCod, TM1.GruOpeCod FROM TXPCHIOPE TM1 WHERE TM1.EmprCod = ? and TM1.GruOpeCod = ? and TM1.HisMes = ? and TM1.HisAny = ? ORDER BY TM1.EmprCod, TM1.GruOpeCod, TM1.HisMes, TM1.HisAny ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GL8", "SELECT EmprCod FROM TXPCGRUOP WHERE EmprCod = ? AND GruOpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GL9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, GruOpeCod, HisMes, HisAny FROM TXPCHIOPE WHERE EmprCod = ? AND GruOpeCod = ? AND HisMes = ? AND HisAny = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GL10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, GruOpeCod, HisMes, HisAny FROM TXPCHIOPE WHERE ( EmprCod > ? or EmprCod = ? and GruOpeCod > ? or GruOpeCod = ? and EmprCod = ? and HisMes > ? or HisMes = ? and GruOpeCod = ? and EmprCod = ? and HisAny > ?) ORDER BY EmprCod, GruOpeCod, HisMes, HisAny) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01GL11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, GruOpeCod, HisMes, HisAny FROM TXPCHIOPE WHERE ( EmprCod < ? or EmprCod = ? and GruOpeCod < ? or GruOpeCod = ? and EmprCod = ? and HisMes < ? or HisMes = ? and GruOpeCod = ? and EmprCod = ? and HisAny < ?) ORDER BY EmprCod DESC, GruOpeCod DESC, HisMes DESC, HisAny DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01GL12", "INSERT INTO TXPCHIOPE(HisMes, HisAny, HisUniPro, EmprCod, GruOpeCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPCHIOPE")
         ,new UpdateCursor("T01GL13", "UPDATE TXPCHIOPE SET HisUniPro=?  WHERE EmprCod = ? AND GruOpeCod = ? AND HisMes = ? AND HisAny = ?", GX_NOMASK, "TXPCHIOPE")
         ,new UpdateCursor("T01GL14", "DELETE FROM TXPCHIOPE  WHERE EmprCod = ? AND GruOpeCod = ? AND HisMes = ? AND HisAny = ?", GX_NOMASK, "TXPCHIOPE")
         ,new ForEachCursor("T01GL15", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, GruOpeCod, HisMes, HisAny FROM TXPCHIOPE ORDER BY EmprCod, GruOpeCod, HisMes, HisAny ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GL16", "SELECT EmprCod, GruOpeCod, HisMes, HisAny, HisLin, HisPro, HisTie FROM TXPLHIOPE WHERE EmprCod = ? and GruOpeCod = ? and HisMes = ? and HisAny = ? and HisLin = ? ORDER BY EmprCod, GruOpeCod, HisMes, HisAny, HisLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GL17", "SELECT EmprCod, GruOpeCod, HisMes, HisAny, HisLin FROM TXPLHIOPE WHERE EmprCod = ? AND GruOpeCod = ? AND HisMes = ? AND HisAny = ? AND HisLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01GL18", "INSERT INTO TXPLHIOPE(EmprCod, GruOpeCod, HisMes, HisAny, HisLin, HisPro, HisTie) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLHIOPE")
         ,new UpdateCursor("T01GL19", "UPDATE TXPLHIOPE SET HisPro=?, HisTie=?  WHERE EmprCod = ? AND GruOpeCod = ? AND HisMes = ? AND HisAny = ? AND HisLin = ?", GX_NOMASK, "TXPLHIOPE")
         ,new UpdateCursor("T01GL20", "DELETE FROM TXPLHIOPE  WHERE EmprCod = ? AND GruOpeCod = ? AND HisMes = ? AND HisAny = ? AND HisLin = ?", GX_NOMASK, "TXPLHIOPE")
         ,new ForEachCursor("T01GL21", "SELECT EmprCod, GruOpeCod, HisMes, HisAny, HisLin FROM TXPLHIOPE WHERE EmprCod = ? and GruOpeCod = ? and HisMes = ? and HisAny = ? ORDER BY EmprCod, GruOpeCod, HisMes, HisAny, HisLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GL22", "SELECT EmprCod FROM TXPCGRUOP WHERE EmprCod = ? AND GruOpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 20 :
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
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 10 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(4, (String)parms[4], 3);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
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
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setByte(5, ((Number) parms[6]).byteValue());
               stmt.setShort(6, ((Number) parms[7]).shortValue());
               stmt.setByte(7, ((Number) parms[8]).byteValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

