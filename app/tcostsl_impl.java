package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcostsl_impl extends GXDataArea
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
         A1211TipEntCod = (short)(GXutil.lval( httpContext.GetPar( "TipEntCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A1211TipEntCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TABLA COSTES LAVANDERIA", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtTipEntCod_Internalname ;
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
      nRC_GXsfl_50 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_50"))) ;
      nGXsfl_50_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_50_idx"))) ;
      sGXsfl_50_idx = httpContext.GetPar( "sGXsfl_50_idx") ;
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

   public tcostsl_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcostsl_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcostsl_impl.class ));
   }

   public tcostsl_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTSL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTSL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTSL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTSL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCOSTSL.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTSL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTSL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTSL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTSL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Tipo Entrada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTSL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipEntCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipEntCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1211TipEntCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1211TipEntCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipEntCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipEntCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTSL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Tipo Entrada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTSL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipEntNom_Internalname, GXutil.rtrim( A1212TipEntNom), GXutil.rtrim( localUtil.format( A1212TipEntNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipEntNom_Jsonclick, 0, "", "", "", "", "", 1, edtTipEntNom_Enabled, 0, "text", "", 25, "chr", 1, "row", 25, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTSL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Tipo Lavados Teñidos Manualidades", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTSL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCostsTip_Internalname, GXutil.rtrim( A12122CostsTip), GXutil.rtrim( localUtil.format( A12122CostsTip, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCostsTip_Jsonclick, 0, "", "", "", "", "", 1, edtCostsTip_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTSL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Año", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTSL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCostsAny_Internalname, GXutil.ltrim( localUtil.ntoc( A12117CostsAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCostsAny_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12117CostsAny), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12117CostsAny), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCostsAny_Jsonclick, 0, "", "", "", "", "", 1, edtCostsAny_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTSL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTSL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol50( ) ;
      nGXsfl_50_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1685 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1685 = (short)(1) ;
            scanStart1J11685( ) ;
            while ( RcdFound1685 != 0 )
            {
               init_level_properties1685( ) ;
               getByPrimaryKey1J11685( ) ;
               addRow1J11685( ) ;
               scanNext1J11685( ) ;
            }
            scanEnd1J11685( ) ;
            nBlankRcdCount1685 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1J11685( ) ;
         standaloneModal1J11685( ) ;
         sMode1685 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRow1J11685( ) ;
            edtavnRcdDeleted_1685_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1685_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1685_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1685_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtCostsMes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COSTSMES_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCostsMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCostsMes_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtCostsKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COSTSKGS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCostsKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCostsKgs_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtCostsUnd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COSTSUND_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCostsUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCostsUnd_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtCostsVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COSTSVAL_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCostsVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCostsVal_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_1685 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1J11685( ) ;
            }
            sendRow1J11685( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode1685 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1685 = (short)(5) ;
         nRcdExists_1685 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1J11685( ) ;
            while ( RcdFound1685 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_501685( ) ;
               init_level_properties1685( ) ;
               standaloneNotModal1J11685( ) ;
               getByPrimaryKey1J11685( ) ;
               standaloneModal1J11685( ) ;
               addRow1J11685( ) ;
               scanNext1J11685( ) ;
            }
            scanEnd1J11685( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1685 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_501685( ) ;
      initAll1J11685( ) ;
      init_level_properties1685( ) ;
      nRcdExists_1685 = (short)(0) ;
      nIsMod_1685 = (short)(0) ;
      nRcdDeleted_1685 = (short)(0) ;
      nBlankRcdCount1685 = (short)(nBlankRcdUsr1685+nBlankRcdCount1685) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1685 > 0 )
      {
         standaloneNotModal1J11685( ) ;
         standaloneModal1J11685( ) ;
         addRow1J11685( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCostsMes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1685 = (short)(nBlankRcdCount1685-1) ;
      }
      Gx_mode = sMode1685 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTSL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTSL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTSL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTSL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCOSTSL.htm");
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
      e111J12 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z1211TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z1211TipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12122CostsTip = httpContext.cgiGet( "Z12122CostsTip") ;
            Z12117CostsAny = (short)(localUtil.ctol( httpContext.cgiGet( "Z12117CostsAny"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipEntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipEntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPENTCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipEntCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1211TipEntCod = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
            }
            else
            {
               A1211TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipEntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
            }
            A1212TipEntNom = httpContext.cgiGet( edtTipEntNom_Internalname) ;
            n1212TipEntNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
            A12122CostsTip = httpContext.cgiGet( edtCostsTip_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12122CostsTip", A12122CostsTip);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCostsAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCostsAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COSTSANY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCostsAny_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12117CostsAny = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12117CostsAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12117CostsAny), 4, 0));
            }
            else
            {
               A12117CostsAny = (short)(localUtil.ctol( httpContext.cgiGet( edtCostsAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12117CostsAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12117CostsAny), 4, 0));
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
               A1211TipEntCod = (short)(GXutil.lval( httpContext.GetPar( "TipEntCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
               A12122CostsTip = httpContext.GetPar( "CostsTip") ;
               httpContext.ajax_rsp_assign_attri("", false, "A12122CostsTip", A12122CostsTip);
               A12117CostsAny = (short)(GXutil.lval( httpContext.GetPar( "CostsAny"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12117CostsAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12117CostsAny), 4, 0));
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
                        e111J12 ();
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
            initAll1J11684( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1685_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1685_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      disableAttributes1J11684( ) ;
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

   public void confirm_1J10( )
   {
      beforeValidate1J11684( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1J11684( ) ;
         }
         else
         {
            checkExtendedTable1J11684( ) ;
            if ( AnyError == 0 )
            {
               zm1J11684( 2) ;
               zm1J11684( 3) ;
            }
            closeExtendedTableCursors1J11684( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1684 = Gx_mode ;
         confirm_1J11685( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1684 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1684 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1J10( ) ;
      }
   }

   public void confirm_1J11685( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1J11685( ) ;
         if ( ( nRcdExists_1685 != 0 ) || ( nIsMod_1685 != 0 ) )
         {
            getKey1J11685( ) ;
            if ( ( nRcdExists_1685 == 0 ) && ( nRcdDeleted_1685 == 0 ) )
            {
               if ( RcdFound1685 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1J11685( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1J11685( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1J11685( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "COSTSMES_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCostsMes_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1685 != 0 )
               {
                  if ( nRcdDeleted_1685 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1J11685( ) ;
                     load1J11685( ) ;
                     beforeValidate1J11685( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1J11685( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1685 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1J11685( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1J11685( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1J11685( ) ;
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
                  if ( nRcdDeleted_1685 == 0 )
                  {
                     GXCCtl = "COSTSMES_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCostsMes_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1685_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1685, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCostsMes_Internalname, GXutil.ltrim( localUtil.ntoc( A12118CostsMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCostsKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A12119CostsKgs, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCostsUnd_Internalname, GXutil.ltrim( localUtil.ntoc( A12120CostsUnd, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCostsVal_Internalname, GXutil.ltrim( localUtil.ntoc( A12121CostsVal, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12118CostsMes_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z12118CostsMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12119CostsKgs_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z12119CostsKgs, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12120CostsUnd_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z12120CostsUnd, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12121CostsVal_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z12121CostsVal, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1685_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1685, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1685_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1685, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1685_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1685, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1685 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1685_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1685_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COSTSMES_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCostsMes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COSTSKGS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCostsKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COSTSUND_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCostsUnd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COSTSVAL_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCostsVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1J10( )
   {
   }

   public void e111J12( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tcostsl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tcostsl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tcostsl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tcostsl_impl.this.A396EmprCod = GXv_char2[0] ;
      tcostsl_impl.this.AV11EmprNom = GXv_char3[0] ;
      tcostsl_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1J11684( int GX_JID )
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
         Z12122CostsTip = A12122CostsTip ;
         Z12117CostsAny = A12117CostsAny ;
         Z396EmprCod = A396EmprCod ;
         Z1211TipEntCod = A1211TipEntCod ;
         Z407EmprNom = A407EmprNom ;
         Z1212TipEntNom = A1212TipEntNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TCOSTSL" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      /* Using cursor T01J16 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01J16_A407EmprNom[0] ;
      n407EmprNom = T01J16_n407EmprNom[0] ;
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

   public void load1J11684( )
   {
      /* Using cursor T01J18 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A1211TipEntCod), A12122CostsTip, Short.valueOf(A12117CostsAny)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1684 = (short)(1) ;
         A407EmprNom = T01J18_A407EmprNom[0] ;
         n407EmprNom = T01J18_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A1212TipEntNom = T01J18_A1212TipEntNom[0] ;
         n1212TipEntNom = T01J18_n1212TipEntNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
         zm1J11684( -1) ;
      }
      pr_default.close(6);
      onLoadActions1J11684( ) ;
   }

   public void onLoadActions1J11684( )
   {
   }

   public void checkExtendedTable1J11684( )
   {
      nIsDirty_1684 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01J17 */
      pr_default.execute(5, new Object[] {A396EmprCod, Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipEntCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1212TipEntNom = T01J17_A1212TipEntNom[0] ;
      n1212TipEntNom = T01J17_n1212TipEntNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1J11684( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         short A1211TipEntCod )
   {
      /* Using cursor T01J19 */
      pr_default.execute(7, new Object[] {A396EmprCod, Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipEntCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1212TipEntNom = T01J19_A1212TipEntNom[0] ;
      n1212TipEntNom = T01J19_n1212TipEntNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1212TipEntNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey1J11684( )
   {
      /* Using cursor T01J110 */
      pr_default.execute(8, new Object[] {A396EmprCod, Short.valueOf(A1211TipEntCod), A12122CostsTip, Short.valueOf(A12117CostsAny)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1684 = (short)(1) ;
      }
      else
      {
         RcdFound1684 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01J15 */
      pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A1211TipEntCod), A12122CostsTip, Short.valueOf(A12117CostsAny)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01J15_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1J11684( 1) ;
         RcdFound1684 = (short)(1) ;
         A12122CostsTip = T01J15_A12122CostsTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12122CostsTip", A12122CostsTip);
         A12117CostsAny = T01J15_A12117CostsAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12117CostsAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12117CostsAny), 4, 0));
         A1211TipEntCod = T01J15_A1211TipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z1211TipEntCod = A1211TipEntCod ;
         Z12122CostsTip = A12122CostsTip ;
         Z12117CostsAny = A12117CostsAny ;
         sMode1684 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1J11684( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1684 = (short)(0) ;
            initializeNonKey1J11684( ) ;
         }
         Gx_mode = sMode1684 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1684 = (short)(0) ;
         initializeNonKey1J11684( ) ;
         sMode1684 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1684 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1J11684( ) ;
      if ( RcdFound1684 == 0 )
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
      RcdFound1684 = (short)(0) ;
      /* Using cursor T01J111 */
      pr_default.execute(9, new Object[] {Short.valueOf(A1211TipEntCod), Short.valueOf(A1211TipEntCod), A12122CostsTip, A12122CostsTip, Short.valueOf(A1211TipEntCod), Short.valueOf(A12117CostsAny), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T01J111_A1211TipEntCod[0] < A1211TipEntCod ) || ( T01J111_A1211TipEntCod[0] == A1211TipEntCod ) && ( GXutil.strcmp(T01J111_A12122CostsTip[0], A12122CostsTip) < 0 ) || ( GXutil.strcmp(T01J111_A12122CostsTip[0], A12122CostsTip) == 0 ) && ( T01J111_A1211TipEntCod[0] == A1211TipEntCod ) && ( T01J111_A12117CostsAny[0] < A12117CostsAny ) ) && ( GXutil.strcmp(T01J111_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T01J111_A1211TipEntCod[0] > A1211TipEntCod ) || ( T01J111_A1211TipEntCod[0] == A1211TipEntCod ) && ( GXutil.strcmp(T01J111_A12122CostsTip[0], A12122CostsTip) > 0 ) || ( GXutil.strcmp(T01J111_A12122CostsTip[0], A12122CostsTip) == 0 ) && ( T01J111_A1211TipEntCod[0] == A1211TipEntCod ) && ( T01J111_A12117CostsAny[0] > A12117CostsAny ) ) && ( GXutil.strcmp(T01J111_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A1211TipEntCod = T01J111_A1211TipEntCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
            A12122CostsTip = T01J111_A12122CostsTip[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12122CostsTip", A12122CostsTip);
            A12117CostsAny = T01J111_A12117CostsAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12117CostsAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12117CostsAny), 4, 0));
            RcdFound1684 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1684 = (short)(0) ;
      /* Using cursor T01J112 */
      pr_default.execute(10, new Object[] {Short.valueOf(A1211TipEntCod), Short.valueOf(A1211TipEntCod), A12122CostsTip, A12122CostsTip, Short.valueOf(A1211TipEntCod), Short.valueOf(A12117CostsAny), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T01J112_A1211TipEntCod[0] > A1211TipEntCod ) || ( T01J112_A1211TipEntCod[0] == A1211TipEntCod ) && ( GXutil.strcmp(T01J112_A12122CostsTip[0], A12122CostsTip) > 0 ) || ( GXutil.strcmp(T01J112_A12122CostsTip[0], A12122CostsTip) == 0 ) && ( T01J112_A1211TipEntCod[0] == A1211TipEntCod ) && ( T01J112_A12117CostsAny[0] > A12117CostsAny ) ) && ( GXutil.strcmp(T01J112_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T01J112_A1211TipEntCod[0] < A1211TipEntCod ) || ( T01J112_A1211TipEntCod[0] == A1211TipEntCod ) && ( GXutil.strcmp(T01J112_A12122CostsTip[0], A12122CostsTip) < 0 ) || ( GXutil.strcmp(T01J112_A12122CostsTip[0], A12122CostsTip) == 0 ) && ( T01J112_A1211TipEntCod[0] == A1211TipEntCod ) && ( T01J112_A12117CostsAny[0] < A12117CostsAny ) ) && ( GXutil.strcmp(T01J112_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A1211TipEntCod = T01J112_A1211TipEntCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
            A12122CostsTip = T01J112_A12122CostsTip[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12122CostsTip", A12122CostsTip);
            A12117CostsAny = T01J112_A12117CostsAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12117CostsAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12117CostsAny), 4, 0));
            RcdFound1684 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1J11684( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtTipEntCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1J11684( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1684 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1211TipEntCod != Z1211TipEntCod ) || ( GXutil.strcmp(A12122CostsTip, Z12122CostsTip) != 0 ) || ( A12117CostsAny != Z12117CostsAny ) )
            {
               A1211TipEntCod = Z1211TipEntCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
               A12122CostsTip = Z12122CostsTip ;
               httpContext.ajax_rsp_assign_attri("", false, "A12122CostsTip", A12122CostsTip);
               A12117CostsAny = Z12117CostsAny ;
               httpContext.ajax_rsp_assign_attri("", false, "A12117CostsAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12117CostsAny), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTipEntCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1J11684( ) ;
               GX_FocusControl = edtTipEntCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1211TipEntCod != Z1211TipEntCod ) || ( GXutil.strcmp(A12122CostsTip, Z12122CostsTip) != 0 ) || ( A12117CostsAny != Z12117CostsAny ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTipEntCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1J11684( ) ;
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
                  GX_FocusControl = edtTipEntCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1J11684( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1211TipEntCod != Z1211TipEntCod ) || ( GXutil.strcmp(A12122CostsTip, Z12122CostsTip) != 0 ) || ( A12117CostsAny != Z12117CostsAny ) )
      {
         A1211TipEntCod = Z1211TipEntCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         A12122CostsTip = Z12122CostsTip ;
         httpContext.ajax_rsp_assign_attri("", false, "A12122CostsTip", A12122CostsTip);
         A12117CostsAny = Z12117CostsAny ;
         httpContext.ajax_rsp_assign_attri("", false, "A12117CostsAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12117CostsAny), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTipEntCod_Internalname ;
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
      getKey1J11684( ) ;
      if ( RcdFound1684 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1211TipEntCod != Z1211TipEntCod ) || ( GXutil.strcmp(A12122CostsTip, Z12122CostsTip) != 0 ) || ( A12117CostsAny != Z12117CostsAny ) )
         {
            A1211TipEntCod = Z1211TipEntCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
            A12122CostsTip = Z12122CostsTip ;
            httpContext.ajax_rsp_assign_attri("", false, "A12122CostsTip", A12122CostsTip);
            A12117CostsAny = Z12117CostsAny ;
            httpContext.ajax_rsp_assign_attri("", false, "A12117CostsAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12117CostsAny), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1211TipEntCod != Z1211TipEntCod ) || ( GXutil.strcmp(A12122CostsTip, Z12122CostsTip) != 0 ) || ( A12117CostsAny != Z12117CostsAny ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tcostsl");
   }

   public void insert_check( )
   {
      confirm_1J10( ) ;
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
      if ( RcdFound1684 == 0 )
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
      scanStart1J11684( ) ;
      if ( RcdFound1684 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1J11684( ) ;
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
      if ( RcdFound1684 == 0 )
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
      if ( RcdFound1684 == 0 )
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
      scanStart1J11684( ) ;
      if ( RcdFound1684 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1684 != 0 )
         {
            scanNext1J11684( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1J11684( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1J11684( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01J14 */
         pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A1211TipEntCod), A12122CostsTip, Short.valueOf(A12117CostsAny)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCOSTSL"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCOSTSL"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1J11684( )
   {
      beforeValidate1J11684( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J11684( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1J11684( 0) ;
         checkOptimisticConcurrency1J11684( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1J11684( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1J11684( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01J113 */
                  pr_default.execute(11, new Object[] {A12122CostsTip, Short.valueOf(A12117CostsAny), A396EmprCod, Short.valueOf(A1211TipEntCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCOSTSL");
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
                        processLevel1J11684( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1J10( ) ;
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
            load1J11684( ) ;
         }
         endLevel1J11684( ) ;
      }
      closeExtendedTableCursors1J11684( ) ;
   }

   public void update1J11684( )
   {
      beforeValidate1J11684( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J11684( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1J11684( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1J11684( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1J11684( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPCOSTSL */
                  deferredUpdate1J11684( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1J11684( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1J10( ) ;
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
         endLevel1J11684( ) ;
      }
      closeExtendedTableCursors1J11684( ) ;
   }

   public void deferredUpdate1J11684( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1J11684( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1J11684( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1J11684( ) ;
         afterConfirm1J11684( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1J11684( ) ;
            if ( AnyError == 0 )
            {
               scanStart1J11685( ) ;
               while ( RcdFound1685 != 0 )
               {
                  getByPrimaryKey1J11685( ) ;
                  delete1J11685( ) ;
                  scanNext1J11685( ) ;
               }
               scanEnd1J11685( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01J114 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Short.valueOf(A1211TipEntCod), A12122CostsTip, Short.valueOf(A12117CostsAny)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCOSTSL");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1684 == 0 )
                        {
                           initAll1J11684( ) ;
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
                        resetCaption1J10( ) ;
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
      sMode1684 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1J11684( ) ;
      Gx_mode = sMode1684 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1J11684( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01J115 */
         pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(A1211TipEntCod)});
         A1212TipEntNom = T01J115_A1212TipEntNom[0] ;
         n1212TipEntNom = T01J115_n1212TipEntNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
         pr_default.close(13);
      }
   }

   public void processNestedLevel1J11685( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1J11685( ) ;
         if ( ( nRcdExists_1685 != 0 ) || ( nIsMod_1685 != 0 ) )
         {
            standaloneNotModal1J11685( ) ;
            getKey1J11685( ) ;
            if ( ( nRcdExists_1685 == 0 ) && ( nRcdDeleted_1685 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1J11685( ) ;
            }
            else
            {
               if ( RcdFound1685 != 0 )
               {
                  if ( ( nRcdDeleted_1685 != 0 ) && ( nRcdExists_1685 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1J11685( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1685 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1J11685( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1685 == 0 )
                  {
                     GXCCtl = "COSTSMES_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCostsMes_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1685_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1685, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCostsMes_Internalname, GXutil.ltrim( localUtil.ntoc( A12118CostsMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCostsKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A12119CostsKgs, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCostsUnd_Internalname, GXutil.ltrim( localUtil.ntoc( A12120CostsUnd, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCostsVal_Internalname, GXutil.ltrim( localUtil.ntoc( A12121CostsVal, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12118CostsMes_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z12118CostsMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12119CostsKgs_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z12119CostsKgs, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12120CostsUnd_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z12120CostsUnd, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12121CostsVal_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z12121CostsVal, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1685_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1685, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1685_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1685, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1685_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1685, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1685 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1685_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1685_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COSTSMES_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCostsMes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COSTSKGS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCostsKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COSTSUND_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCostsUnd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COSTSVAL_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCostsVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1J11685( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1685 = (short)(0) ;
      nIsMod_1685 = (short)(0) ;
      nRcdDeleted_1685 = (short)(0) ;
   }

   public void processLevel1J11684( )
   {
      /* Save parent mode. */
      sMode1684 = Gx_mode ;
      processNestedLevel1J11685( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1684 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1J11684( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1J11684( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcostsl");
         if ( AnyError == 0 )
         {
            confirmValues1J10( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcostsl");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1J11684( )
   {
      /* Scan By routine */
      /* Using cursor T01J116 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      RcdFound1684 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1684 = (short)(1) ;
         A1211TipEntCod = T01J116_A1211TipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         A12122CostsTip = T01J116_A12122CostsTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12122CostsTip", A12122CostsTip);
         A12117CostsAny = T01J116_A12117CostsAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12117CostsAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12117CostsAny), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1J11684( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1684 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1684 = (short)(1) ;
         A1211TipEntCod = T01J116_A1211TipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         A12122CostsTip = T01J116_A12122CostsTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12122CostsTip", A12122CostsTip);
         A12117CostsAny = T01J116_A12117CostsAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12117CostsAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12117CostsAny), 4, 0));
      }
   }

   public void scanEnd1J11684( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1J11684( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1J11684( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1J11684( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1J11684( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1J11684( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1J11684( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1J11684( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtTipEntCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
      edtTipEntNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipEntNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntNom_Enabled), 5, 0), true);
      edtCostsTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCostsTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCostsTip_Enabled), 5, 0), true);
      edtCostsAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCostsAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCostsAny_Enabled), 5, 0), true);
   }

   public void zm1J11685( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12119CostsKgs = T01J13_A12119CostsKgs[0] ;
            Z12120CostsUnd = T01J13_A12120CostsUnd[0] ;
            Z12121CostsVal = T01J13_A12121CostsVal[0] ;
         }
         else
         {
            Z12119CostsKgs = A12119CostsKgs ;
            Z12120CostsUnd = A12120CostsUnd ;
            Z12121CostsVal = A12121CostsVal ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z396EmprCod = A396EmprCod ;
         Z1211TipEntCod = A1211TipEntCod ;
         Z12122CostsTip = A12122CostsTip ;
         Z12117CostsAny = A12117CostsAny ;
         Z12118CostsMes = A12118CostsMes ;
         Z12119CostsKgs = A12119CostsKgs ;
         Z12120CostsUnd = A12120CostsUnd ;
         Z12121CostsVal = A12121CostsVal ;
      }
   }

   public void standaloneNotModal1J11685( )
   {
   }

   public void standaloneModal1J11685( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCostsMes_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCostsMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCostsMes_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtCostsMes_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCostsMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCostsMes_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void load1J11685( )
   {
      /* Using cursor T01J117 */
      pr_default.execute(15, new Object[] {A396EmprCod, Short.valueOf(A1211TipEntCod), A12122CostsTip, Short.valueOf(A12117CostsAny), Byte.valueOf(A12118CostsMes)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1685 = (short)(1) ;
         A12119CostsKgs = T01J117_A12119CostsKgs[0] ;
         n12119CostsKgs = T01J117_n12119CostsKgs[0] ;
         A12120CostsUnd = T01J117_A12120CostsUnd[0] ;
         n12120CostsUnd = T01J117_n12120CostsUnd[0] ;
         A12121CostsVal = T01J117_A12121CostsVal[0] ;
         n12121CostsVal = T01J117_n12121CostsVal[0] ;
         zm1J11685( -4) ;
      }
      pr_default.close(15);
      onLoadActions1J11685( ) ;
   }

   public void onLoadActions1J11685( )
   {
   }

   public void checkExtendedTable1J11685( )
   {
      nIsDirty_1685 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1J11685( ) ;
   }

   public void closeExtendedTableCursors1J11685( )
   {
   }

   public void enableDisable1J11685( )
   {
   }

   public void getKey1J11685( )
   {
      /* Using cursor T01J118 */
      pr_default.execute(16, new Object[] {A396EmprCod, Short.valueOf(A1211TipEntCod), A12122CostsTip, Short.valueOf(A12117CostsAny), Byte.valueOf(A12118CostsMes)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1685 = (short)(1) ;
      }
      else
      {
         RcdFound1685 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey1J11685( )
   {
      /* Using cursor T01J13 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A1211TipEntCod), A12122CostsTip, Short.valueOf(A12117CostsAny), Byte.valueOf(A12118CostsMes)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01J13_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1J11685( 4) ;
         RcdFound1685 = (short)(1) ;
         initializeNonKey1J11685( ) ;
         A12118CostsMes = T01J13_A12118CostsMes[0] ;
         A12119CostsKgs = T01J13_A12119CostsKgs[0] ;
         n12119CostsKgs = T01J13_n12119CostsKgs[0] ;
         A12120CostsUnd = T01J13_A12120CostsUnd[0] ;
         n12120CostsUnd = T01J13_n12120CostsUnd[0] ;
         A12121CostsVal = T01J13_A12121CostsVal[0] ;
         n12121CostsVal = T01J13_n12121CostsVal[0] ;
         Z396EmprCod = A396EmprCod ;
         Z1211TipEntCod = A1211TipEntCod ;
         Z12122CostsTip = A12122CostsTip ;
         Z12117CostsAny = A12117CostsAny ;
         Z12118CostsMes = A12118CostsMes ;
         sMode1685 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1J11685( ) ;
         load1J11685( ) ;
         Gx_mode = sMode1685 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1685 = (short)(0) ;
         initializeNonKey1J11685( ) ;
         sMode1685 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1J11685( ) ;
         Gx_mode = sMode1685 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1J11685( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1J11685( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01J12 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A1211TipEntCod), A12122CostsTip, Short.valueOf(A12117CostsAny), Byte.valueOf(A12118CostsMes)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCOSTS1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z12119CostsKgs, T01J12_A12119CostsKgs[0]) != 0 ) || ( Z12120CostsUnd != T01J12_A12120CostsUnd[0] ) || ( DecimalUtil.compareTo(Z12121CostsVal, T01J12_A12121CostsVal[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z12119CostsKgs, T01J12_A12119CostsKgs[0]) != 0 )
            {
               GXutil.writeLogln("tcostsl:[seudo value changed for attri]"+"CostsKgs");
               GXutil.writeLogRaw("Old: ",Z12119CostsKgs);
               GXutil.writeLogRaw("Current: ",T01J12_A12119CostsKgs[0]);
            }
            if ( Z12120CostsUnd != T01J12_A12120CostsUnd[0] )
            {
               GXutil.writeLogln("tcostsl:[seudo value changed for attri]"+"CostsUnd");
               GXutil.writeLogRaw("Old: ",Z12120CostsUnd);
               GXutil.writeLogRaw("Current: ",T01J12_A12120CostsUnd[0]);
            }
            if ( DecimalUtil.compareTo(Z12121CostsVal, T01J12_A12121CostsVal[0]) != 0 )
            {
               GXutil.writeLogln("tcostsl:[seudo value changed for attri]"+"CostsVal");
               GXutil.writeLogRaw("Old: ",Z12121CostsVal);
               GXutil.writeLogRaw("Current: ",T01J12_A12121CostsVal[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCOSTS1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1J11685( )
   {
      beforeValidate1J11685( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J11685( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1J11685( 0) ;
         checkOptimisticConcurrency1J11685( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1J11685( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1J11685( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01J119 */
                  pr_default.execute(17, new Object[] {A396EmprCod, Short.valueOf(A1211TipEntCod), A12122CostsTip, Short.valueOf(A12117CostsAny), Byte.valueOf(A12118CostsMes), Boolean.valueOf(n12119CostsKgs), A12119CostsKgs, Boolean.valueOf(n12120CostsUnd), Long.valueOf(A12120CostsUnd), Boolean.valueOf(n12121CostsVal), A12121CostsVal});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCOSTS1");
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
            load1J11685( ) ;
         }
         endLevel1J11685( ) ;
      }
      closeExtendedTableCursors1J11685( ) ;
   }

   public void update1J11685( )
   {
      beforeValidate1J11685( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J11685( ) ;
      }
      if ( ( nIsMod_1685 != 0 ) || ( nIsDirty_1685 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1J11685( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1J11685( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1J11685( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01J120 */
                     pr_default.execute(18, new Object[] {Boolean.valueOf(n12119CostsKgs), A12119CostsKgs, Boolean.valueOf(n12120CostsUnd), Long.valueOf(A12120CostsUnd), Boolean.valueOf(n12121CostsVal), A12121CostsVal, A396EmprCod, Short.valueOf(A1211TipEntCod), A12122CostsTip, Short.valueOf(A12117CostsAny), Byte.valueOf(A12118CostsMes)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCOSTS1");
                     if ( (pr_default.getStatus(18) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCOSTS1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1J11685( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1J11685( ) ;
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
            endLevel1J11685( ) ;
         }
      }
      closeExtendedTableCursors1J11685( ) ;
   }

   public void deferredUpdate1J11685( )
   {
   }

   public void delete1J11685( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1J11685( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1J11685( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1J11685( ) ;
         afterConfirm1J11685( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1J11685( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01J121 */
               pr_default.execute(19, new Object[] {A396EmprCod, Short.valueOf(A1211TipEntCod), A12122CostsTip, Short.valueOf(A12117CostsAny), Byte.valueOf(A12118CostsMes)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCOSTS1");
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
      sMode1685 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1J11685( ) ;
      Gx_mode = sMode1685 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1J11685( )
   {
      standaloneModal1J11685( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1J11685( )
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

   public void scanStart1J11685( )
   {
      /* Scan By routine */
      /* Using cursor T01J122 */
      pr_default.execute(20, new Object[] {A396EmprCod, Short.valueOf(A1211TipEntCod), A12122CostsTip, Short.valueOf(A12117CostsAny)});
      RcdFound1685 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1685 = (short)(1) ;
         A12118CostsMes = T01J122_A12118CostsMes[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1J11685( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound1685 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1685 = (short)(1) ;
         A12118CostsMes = T01J122_A12118CostsMes[0] ;
      }
   }

   public void scanEnd1J11685( )
   {
      pr_default.close(20);
   }

   public void afterConfirm1J11685( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1J11685( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1J11685( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1J11685( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1J11685( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1J11685( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1J11685( )
   {
      edtCostsMes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCostsMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCostsMes_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtCostsKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCostsKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCostsKgs_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtCostsUnd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCostsUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCostsUnd_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtCostsVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCostsVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCostsVal_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void send_integrity_lvl_hashes1J11685( )
   {
   }

   public void send_integrity_lvl_hashes1J11684( )
   {
   }

   public void subsflControlProps_501685( )
   {
      edtavnRcdDeleted_1685_Internalname = "vNRCDDELETED_1685_"+sGXsfl_50_idx ;
      edtCostsMes_Internalname = "COSTSMES_"+sGXsfl_50_idx ;
      edtCostsKgs_Internalname = "COSTSKGS_"+sGXsfl_50_idx ;
      edtCostsUnd_Internalname = "COSTSUND_"+sGXsfl_50_idx ;
      edtCostsVal_Internalname = "COSTSVAL_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_501685( )
   {
      edtavnRcdDeleted_1685_Internalname = "vNRCDDELETED_1685_"+sGXsfl_50_fel_idx ;
      edtCostsMes_Internalname = "COSTSMES_"+sGXsfl_50_fel_idx ;
      edtCostsKgs_Internalname = "COSTSKGS_"+sGXsfl_50_fel_idx ;
      edtCostsUnd_Internalname = "COSTSUND_"+sGXsfl_50_fel_idx ;
      edtCostsVal_Internalname = "COSTSVAL_"+sGXsfl_50_fel_idx ;
   }

   public void addRow1J11685( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501685( ) ;
      sendRow1J11685( ) ;
   }

   public void sendRow1J11685( )
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
         if ( ((int)((nGXsfl_50_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1685_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1685_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1685, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1685_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1685), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1685), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1685_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1685_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1685_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCostsMes_Internalname,GXutil.ltrim( localUtil.ntoc( A12118CostsMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12118CostsMes), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCostsMes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCostsMes_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1685_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCostsKgs_Internalname,GXutil.ltrim( localUtil.ntoc( A12119CostsKgs, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCostsKgs_Enabled!=0) ? localUtil.format( A12119CostsKgs, "ZZZZZZZZ9.99") : localUtil.format( A12119CostsKgs, "ZZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCostsKgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCostsKgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1685_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCostsUnd_Internalname,GXutil.ltrim( localUtil.ntoc( A12120CostsUnd, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCostsUnd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12120CostsUnd), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12120CostsUnd), "ZZZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCostsUnd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCostsUnd_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1685_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCostsVal_Internalname,GXutil.ltrim( localUtil.ntoc( A12121CostsVal, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCostsVal_Enabled!=0) ? localUtil.format( A12121CostsVal, "ZZZZZZZZ9.99") : localUtil.format( A12121CostsVal, "ZZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCostsVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCostsVal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1J11685( ) ;
      GXCCtl = "Z12118CostsMes_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12118CostsMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12119CostsKgs_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12119CostsKgs, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12120CostsUnd_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12120CostsUnd, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12121CostsVal_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12121CostsVal, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1685_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1685, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1685_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1685, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1685_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1685, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1685_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1685_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COSTSMES_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCostsMes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COSTSKGS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCostsKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COSTSUND_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCostsUnd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COSTSVAL_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCostsVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1J11685( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501685( ) ;
      edtavnRcdDeleted_1685_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1685_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCostsMes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COSTSMES_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCostsKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COSTSKGS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCostsUnd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COSTSUND_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCostsVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COSTSVAL_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1685_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1685_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1685");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1685_Internalname ;
         wbErr = true ;
         nRcdDeleted_1685 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1685 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1685_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCostsMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCostsMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "COSTSMES_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCostsMes_Internalname ;
         wbErr = true ;
         A12118CostsMes = (byte)(0) ;
      }
      else
      {
         A12118CostsMes = (byte)(localUtil.ctol( httpContext.cgiGet( edtCostsMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCostsKgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCostsKgs_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
      {
         GXCCtl = "COSTSKGS_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCostsKgs_Internalname ;
         wbErr = true ;
         A12119CostsKgs = DecimalUtil.ZERO ;
         n12119CostsKgs = false ;
      }
      else
      {
         A12119CostsKgs = localUtil.ctond( httpContext.cgiGet( edtCostsKgs_Internalname)) ;
         n12119CostsKgs = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCostsUnd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCostsUnd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
      {
         GXCCtl = "COSTSUND_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCostsUnd_Internalname ;
         wbErr = true ;
         A12120CostsUnd = 0 ;
         n12120CostsUnd = false ;
      }
      else
      {
         A12120CostsUnd = localUtil.ctol( httpContext.cgiGet( edtCostsUnd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n12120CostsUnd = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCostsVal_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCostsVal_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
      {
         GXCCtl = "COSTSVAL_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCostsVal_Internalname ;
         wbErr = true ;
         A12121CostsVal = DecimalUtil.ZERO ;
         n12121CostsVal = false ;
      }
      else
      {
         A12121CostsVal = localUtil.ctond( httpContext.cgiGet( edtCostsVal_Internalname)) ;
         n12121CostsVal = false ;
      }
      GXCCtl = "Z12118CostsMes_" + sGXsfl_50_idx ;
      Z12118CostsMes = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12119CostsKgs_" + sGXsfl_50_idx ;
      Z12119CostsKgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12120CostsUnd_" + sGXsfl_50_idx ;
      Z12120CostsUnd = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z12121CostsVal_" + sGXsfl_50_idx ;
      Z12121CostsVal = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1685_" + sGXsfl_50_idx ;
      nRcdDeleted_1685 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1685_" + sGXsfl_50_idx ;
      nRcdExists_1685 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1685_" + sGXsfl_50_idx ;
      nIsMod_1685 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCostsMes_Enabled = edtCostsMes_Enabled ;
   }

   public void confirmValues1J10( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501685( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501685( ) ;
         httpContext.changePostValue( "Z12118CostsMes_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z12118CostsMes_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12118CostsMes_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z12119CostsKgs_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z12119CostsKgs_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12119CostsKgs_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z12120CostsUnd_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z12120CostsUnd_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12120CostsUnd_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z12121CostsVal_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z12121CostsVal_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12121CostsVal_"+sGXsfl_50_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tcostsl", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z1211TipEntCod", GXutil.ltrim( localUtil.ntoc( Z1211TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12122CostsTip", GXutil.rtrim( Z12122CostsTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12117CostsAny", GXutil.ltrim( localUtil.ntoc( Z12117CostsAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tcostsl", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TCOSTSL" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TABLA COSTES LAVANDERIA", "") ;
   }

   public void initializeNonKey1J11684( )
   {
      A1212TipEntNom = "" ;
      n1212TipEntNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
   }

   public void initAll1J11684( )
   {
      A1211TipEntCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
      A12122CostsTip = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12122CostsTip", A12122CostsTip);
      A12117CostsAny = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12117CostsAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12117CostsAny), 4, 0));
      initializeNonKey1J11684( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1J11685( )
   {
      A12119CostsKgs = DecimalUtil.ZERO ;
      n12119CostsKgs = false ;
      A12120CostsUnd = 0 ;
      n12120CostsUnd = false ;
      A12121CostsVal = DecimalUtil.ZERO ;
      n12121CostsVal = false ;
      Z12119CostsKgs = DecimalUtil.ZERO ;
      Z12120CostsUnd = 0 ;
      Z12121CostsVal = DecimalUtil.ZERO ;
   }

   public void initAll1J11685( )
   {
      A12118CostsMes = (byte)(0) ;
      initializeNonKey1J11685( ) ;
   }

   public void standaloneModalInsert1J11685( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241582265", true, true);
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
      httpContext.AddJavascriptSource("tcostsl.js", "?20268241582265", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1685( )
   {
      edtCostsMes_Enabled = defedtCostsMes_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCostsMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCostsMes_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void startgridcontrol50( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1685, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1685_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12118CostsMes, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCostsMes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12119CostsKgs, (byte)(12), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCostsKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12120CostsUnd, (byte)(12), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCostsUnd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12121CostsVal, (byte)(12), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCostsVal_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtTipEntCod_Internalname = "TIPENTCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtTipEntNom_Internalname = "TIPENTNOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCostsTip_Internalname = "COSTSTIP" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtCostsAny_Internalname = "COSTSANY" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      edtavnRcdDeleted_1685_Internalname = "vNRCDDELETED_1685" ;
      edtCostsMes_Internalname = "COSTSMES" ;
      edtCostsKgs_Internalname = "COSTSKGS" ;
      edtCostsUnd_Internalname = "COSTSUND" ;
      edtCostsVal_Internalname = "COSTSVAL" ;
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
      Form.setCaption( httpContext.getMessage( "TABLA COSTES LAVANDERIA", "") );
      edtCostsVal_Jsonclick = "" ;
      edtCostsUnd_Jsonclick = "" ;
      edtCostsKgs_Jsonclick = "" ;
      edtCostsMes_Jsonclick = "" ;
      edtavnRcdDeleted_1685_Jsonclick = "" ;
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
      edtCostsVal_Enabled = 1 ;
      edtCostsUnd_Enabled = 1 ;
      edtCostsKgs_Enabled = 1 ;
      edtCostsMes_Enabled = 1 ;
      edtavnRcdDeleted_1685_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtCostsAny_Jsonclick = "" ;
      edtCostsAny_Backcolor = (int)(0xFFFFFF) ;
      edtCostsAny_Enabled = 1 ;
      edtCostsTip_Jsonclick = "" ;
      edtCostsTip_Backcolor = (int)(0xFFFFFF) ;
      edtCostsTip_Enabled = 1 ;
      edtTipEntNom_Jsonclick = "" ;
      edtTipEntNom_Backcolor = (int)(0xFFFFFF) ;
      edtTipEntNom_Enabled = 0 ;
      edtTipEntCod_Jsonclick = "" ;
      edtTipEntCod_Backcolor = (int)(0xFFFFFF) ;
      edtTipEntCod_Enabled = 1 ;
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
      subsflControlProps_501685( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1J11685( ) ;
         standaloneModal1J11685( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1J11685( ) ;
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501685( ) ;
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
      /* Using cursor T01J123 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01J123_A407EmprNom[0] ;
      n407EmprNom = T01J123_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(21);
      /* Using cursor T01J115 */
      pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipEntCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1212TipEntNom = T01J115_A1212TipEntNom[0] ;
      n1212TipEntNom = T01J115_n1212TipEntNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
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

   public void valid_Tipentcod( )
   {
      n1212TipEntNom = false ;
      /* Using cursor T01J115 */
      pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipEntCod_Internalname ;
      }
      A1212TipEntNom = T01J115_A1212TipEntNom[0] ;
      n1212TipEntNom = T01J115_n1212TipEntNom[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", GXutil.rtrim( A1212TipEntNom));
   }

   public void valid_Costsany( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", GXutil.rtrim( A1212TipEntNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1211TipEntCod", GXutil.ltrim( localUtil.ntoc( Z1211TipEntCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12122CostsTip", GXutil.rtrim( Z12122CostsTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12117CostsAny", GXutil.ltrim( localUtil.ntoc( Z12117CostsAny, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1212TipEntNom", GXutil.rtrim( Z1212TipEntNom));
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
      setEventMetadata("VALID_TIPENTCOD","{handler:'valid_Tipentcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'},{av:'A1212TipEntNom',fld:'TIPENTNOM',pic:''}]");
      setEventMetadata("VALID_TIPENTCOD",",oparms:[{av:'A1212TipEntNom',fld:'TIPENTNOM',pic:''}]}");
      setEventMetadata("VALID_COSTSTIP","{handler:'valid_Coststip',iparms:[]");
      setEventMetadata("VALID_COSTSTIP",",oparms:[]}");
      setEventMetadata("VALID_COSTSANY","{handler:'valid_Costsany',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'},{av:'A12122CostsTip',fld:'COSTSTIP',pic:''},{av:'A12117CostsAny',fld:'COSTSANY',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_COSTSANY",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A1212TipEntNom',fld:'TIPENTNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z1211TipEntCod'},{av:'Z12122CostsTip'},{av:'Z12117CostsAny'},{av:'Z407EmprNom'},{av:'Z1212TipEntNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_COSTSMES","{handler:'valid_Costsmes',iparms:[]");
      setEventMetadata("VALID_COSTSMES",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Costsval',iparms:[]");
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
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z12122CostsTip = "" ;
      Z12119CostsKgs = DecimalUtil.ZERO ;
      Z12121CostsVal = DecimalUtil.ZERO ;
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
      lblTextblock4_Jsonclick = "" ;
      A1212TipEntNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      A12122CostsTip = "" ;
      lblTextblock6_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1685 = "" ;
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
      sMode1684 = "" ;
      GXCCtl = "" ;
      A12119CostsKgs = DecimalUtil.ZERO ;
      A12121CostsVal = DecimalUtil.ZERO ;
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
      Z1212TipEntNom = "" ;
      T01J16_A407EmprNom = new String[] {""} ;
      T01J16_n407EmprNom = new boolean[] {false} ;
      T01J18_A12122CostsTip = new String[] {""} ;
      T01J18_A12117CostsAny = new short[1] ;
      T01J18_A407EmprNom = new String[] {""} ;
      T01J18_n407EmprNom = new boolean[] {false} ;
      T01J18_A1212TipEntNom = new String[] {""} ;
      T01J18_n1212TipEntNom = new boolean[] {false} ;
      T01J18_A396EmprCod = new String[] {""} ;
      T01J18_A1211TipEntCod = new short[1] ;
      T01J17_A1212TipEntNom = new String[] {""} ;
      T01J17_n1212TipEntNom = new boolean[] {false} ;
      T01J19_A1212TipEntNom = new String[] {""} ;
      T01J19_n1212TipEntNom = new boolean[] {false} ;
      T01J110_A396EmprCod = new String[] {""} ;
      T01J110_A1211TipEntCod = new short[1] ;
      T01J110_A12122CostsTip = new String[] {""} ;
      T01J110_A12117CostsAny = new short[1] ;
      T01J15_A12122CostsTip = new String[] {""} ;
      T01J15_A12117CostsAny = new short[1] ;
      T01J15_A396EmprCod = new String[] {""} ;
      T01J15_A1211TipEntCod = new short[1] ;
      T01J111_A396EmprCod = new String[] {""} ;
      T01J111_A1211TipEntCod = new short[1] ;
      T01J111_A12122CostsTip = new String[] {""} ;
      T01J111_A12117CostsAny = new short[1] ;
      T01J112_A396EmprCod = new String[] {""} ;
      T01J112_A1211TipEntCod = new short[1] ;
      T01J112_A12122CostsTip = new String[] {""} ;
      T01J112_A12117CostsAny = new short[1] ;
      T01J14_A12122CostsTip = new String[] {""} ;
      T01J14_A12117CostsAny = new short[1] ;
      T01J14_A396EmprCod = new String[] {""} ;
      T01J14_A1211TipEntCod = new short[1] ;
      T01J115_A1212TipEntNom = new String[] {""} ;
      T01J115_n1212TipEntNom = new boolean[] {false} ;
      T01J116_A396EmprCod = new String[] {""} ;
      T01J116_A1211TipEntCod = new short[1] ;
      T01J116_A12122CostsTip = new String[] {""} ;
      T01J116_A12117CostsAny = new short[1] ;
      T01J117_A396EmprCod = new String[] {""} ;
      T01J117_A1211TipEntCod = new short[1] ;
      T01J117_A12122CostsTip = new String[] {""} ;
      T01J117_A12117CostsAny = new short[1] ;
      T01J117_A12118CostsMes = new byte[1] ;
      T01J117_A12119CostsKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J117_n12119CostsKgs = new boolean[] {false} ;
      T01J117_A12120CostsUnd = new long[1] ;
      T01J117_n12120CostsUnd = new boolean[] {false} ;
      T01J117_A12121CostsVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J117_n12121CostsVal = new boolean[] {false} ;
      T01J118_A396EmprCod = new String[] {""} ;
      T01J118_A1211TipEntCod = new short[1] ;
      T01J118_A12122CostsTip = new String[] {""} ;
      T01J118_A12117CostsAny = new short[1] ;
      T01J118_A12118CostsMes = new byte[1] ;
      T01J13_A396EmprCod = new String[] {""} ;
      T01J13_A1211TipEntCod = new short[1] ;
      T01J13_A12122CostsTip = new String[] {""} ;
      T01J13_A12117CostsAny = new short[1] ;
      T01J13_A12118CostsMes = new byte[1] ;
      T01J13_A12119CostsKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J13_n12119CostsKgs = new boolean[] {false} ;
      T01J13_A12120CostsUnd = new long[1] ;
      T01J13_n12120CostsUnd = new boolean[] {false} ;
      T01J13_A12121CostsVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J13_n12121CostsVal = new boolean[] {false} ;
      T01J12_A396EmprCod = new String[] {""} ;
      T01J12_A1211TipEntCod = new short[1] ;
      T01J12_A12122CostsTip = new String[] {""} ;
      T01J12_A12117CostsAny = new short[1] ;
      T01J12_A12118CostsMes = new byte[1] ;
      T01J12_A12119CostsKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J12_n12119CostsKgs = new boolean[] {false} ;
      T01J12_A12120CostsUnd = new long[1] ;
      T01J12_n12120CostsUnd = new boolean[] {false} ;
      T01J12_A12121CostsVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J12_n12121CostsVal = new boolean[] {false} ;
      T01J122_A396EmprCod = new String[] {""} ;
      T01J122_A1211TipEntCod = new short[1] ;
      T01J122_A12122CostsTip = new String[] {""} ;
      T01J122_A12117CostsAny = new short[1] ;
      T01J122_A12118CostsMes = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01J123_A407EmprNom = new String[] {""} ;
      T01J123_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ12122CostsTip = "" ;
      ZZ407EmprNom = "" ;
      ZZ1212TipEntNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcostsl__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcostsl__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcostsl__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcostsl__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcostsl__default(),
         new Object[] {
             new Object[] {
            T01J12_A396EmprCod, T01J12_A1211TipEntCod, T01J12_A12122CostsTip, T01J12_A12117CostsAny, T01J12_A12118CostsMes, T01J12_A12119CostsKgs, T01J12_n12119CostsKgs, T01J12_A12120CostsUnd, T01J12_n12120CostsUnd, T01J12_A12121CostsVal,
            T01J12_n12121CostsVal
            }
            , new Object[] {
            T01J13_A396EmprCod, T01J13_A1211TipEntCod, T01J13_A12122CostsTip, T01J13_A12117CostsAny, T01J13_A12118CostsMes, T01J13_A12119CostsKgs, T01J13_n12119CostsKgs, T01J13_A12120CostsUnd, T01J13_n12120CostsUnd, T01J13_A12121CostsVal,
            T01J13_n12121CostsVal
            }
            , new Object[] {
            T01J14_A12122CostsTip, T01J14_A12117CostsAny, T01J14_A396EmprCod, T01J14_A1211TipEntCod
            }
            , new Object[] {
            T01J15_A12122CostsTip, T01J15_A12117CostsAny, T01J15_A396EmprCod, T01J15_A1211TipEntCod
            }
            , new Object[] {
            T01J16_A407EmprNom, T01J16_n407EmprNom
            }
            , new Object[] {
            T01J17_A1212TipEntNom, T01J17_n1212TipEntNom
            }
            , new Object[] {
            T01J18_A12122CostsTip, T01J18_A12117CostsAny, T01J18_A407EmprNom, T01J18_n407EmprNom, T01J18_A1212TipEntNom, T01J18_n1212TipEntNom, T01J18_A396EmprCod, T01J18_A1211TipEntCod
            }
            , new Object[] {
            T01J19_A1212TipEntNom, T01J19_n1212TipEntNom
            }
            , new Object[] {
            T01J110_A396EmprCod, T01J110_A1211TipEntCod, T01J110_A12122CostsTip, T01J110_A12117CostsAny
            }
            , new Object[] {
            T01J111_A396EmprCod, T01J111_A1211TipEntCod, T01J111_A12122CostsTip, T01J111_A12117CostsAny
            }
            , new Object[] {
            T01J112_A396EmprCod, T01J112_A1211TipEntCod, T01J112_A12122CostsTip, T01J112_A12117CostsAny
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01J115_A1212TipEntNom, T01J115_n1212TipEntNom
            }
            , new Object[] {
            T01J116_A396EmprCod, T01J116_A1211TipEntCod, T01J116_A12122CostsTip, T01J116_A12117CostsAny
            }
            , new Object[] {
            T01J117_A396EmprCod, T01J117_A1211TipEntCod, T01J117_A12122CostsTip, T01J117_A12117CostsAny, T01J117_A12118CostsMes, T01J117_A12119CostsKgs, T01J117_n12119CostsKgs, T01J117_A12120CostsUnd, T01J117_n12120CostsUnd, T01J117_A12121CostsVal,
            T01J117_n12121CostsVal
            }
            , new Object[] {
            T01J118_A396EmprCod, T01J118_A1211TipEntCod, T01J118_A12122CostsTip, T01J118_A12117CostsAny, T01J118_A12118CostsMes
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01J122_A396EmprCod, T01J122_A1211TipEntCod, T01J122_A12122CostsTip, T01J122_A12117CostsAny, T01J122_A12118CostsMes
            }
            , new Object[] {
            T01J123_A407EmprNom, T01J123_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TCOSTSL" ;
   }

   private byte Z12118CostsMes ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A12118CostsMes ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z1211TipEntCod ;
   private short Z12117CostsAny ;
   private short nRcdDeleted_1685 ;
   private short nRcdExists_1685 ;
   private short nIsMod_1685 ;
   private short A1211TipEntCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A12117CostsAny ;
   private short nBlankRcdCount1685 ;
   private short RcdFound1685 ;
   private short nBlankRcdUsr1685 ;
   private short RcdFound1684 ;
   private short nIsDirty_1684 ;
   private short nIsDirty_1685 ;
   private short ZZ1211TipEntCod ;
   private short ZZ12117CostsAny ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtTipEntCod_Enabled ;
   private int edtTipEntNom_Enabled ;
   private int edtCostsTip_Enabled ;
   private int edtCostsAny_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtavnRcdDeleted_1685_Enabled ;
   private int edtCostsMes_Enabled ;
   private int edtCostsKgs_Enabled ;
   private int edtCostsUnd_Enabled ;
   private int edtCostsVal_Enabled ;
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
   private int defedtCostsMes_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtCostsAny_Backcolor ;
   private int edtCostsTip_Backcolor ;
   private int edtTipEntNom_Backcolor ;
   private int edtTipEntCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long Z12120CostsUnd ;
   private long GRID1_nFirstRecordOnPage ;
   private long A12120CostsUnd ;
   private java.math.BigDecimal Z12119CostsKgs ;
   private java.math.BigDecimal Z12121CostsVal ;
   private java.math.BigDecimal A12119CostsKgs ;
   private java.math.BigDecimal A12121CostsVal ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z12122CostsTip ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTipEntCod_Internalname ;
   private String sGXsfl_50_idx="0001" ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtTipEntCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtTipEntNom_Internalname ;
   private String A1212TipEntNom ;
   private String edtTipEntNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCostsTip_Internalname ;
   private String A12122CostsTip ;
   private String edtCostsTip_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtCostsAny_Internalname ;
   private String edtCostsAny_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String sMode1685 ;
   private String edtavnRcdDeleted_1685_Internalname ;
   private String edtCostsMes_Internalname ;
   private String edtCostsKgs_Internalname ;
   private String edtCostsUnd_Internalname ;
   private String edtCostsVal_Internalname ;
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
   private String sMode1684 ;
   private String GXCCtl ;
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
   private String Z1212TipEntNom ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1685_Jsonclick ;
   private String edtCostsMes_Jsonclick ;
   private String edtCostsKgs_Jsonclick ;
   private String edtCostsUnd_Jsonclick ;
   private String edtCostsVal_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ12122CostsTip ;
   private String ZZ407EmprNom ;
   private String ZZ1212TipEntNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n1212TipEntNom ;
   private boolean returnInSub ;
   private boolean n12119CostsKgs ;
   private boolean n12120CostsUnd ;
   private boolean n12121CostsVal ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01J16_A407EmprNom ;
   private boolean[] T01J16_n407EmprNom ;
   private String[] T01J18_A12122CostsTip ;
   private short[] T01J18_A12117CostsAny ;
   private String[] T01J18_A407EmprNom ;
   private boolean[] T01J18_n407EmprNom ;
   private String[] T01J18_A1212TipEntNom ;
   private boolean[] T01J18_n1212TipEntNom ;
   private String[] T01J18_A396EmprCod ;
   private short[] T01J18_A1211TipEntCod ;
   private String[] T01J17_A1212TipEntNom ;
   private boolean[] T01J17_n1212TipEntNom ;
   private String[] T01J19_A1212TipEntNom ;
   private boolean[] T01J19_n1212TipEntNom ;
   private String[] T01J110_A396EmprCod ;
   private short[] T01J110_A1211TipEntCod ;
   private String[] T01J110_A12122CostsTip ;
   private short[] T01J110_A12117CostsAny ;
   private String[] T01J15_A12122CostsTip ;
   private short[] T01J15_A12117CostsAny ;
   private String[] T01J15_A396EmprCod ;
   private short[] T01J15_A1211TipEntCod ;
   private String[] T01J111_A396EmprCod ;
   private short[] T01J111_A1211TipEntCod ;
   private String[] T01J111_A12122CostsTip ;
   private short[] T01J111_A12117CostsAny ;
   private String[] T01J112_A396EmprCod ;
   private short[] T01J112_A1211TipEntCod ;
   private String[] T01J112_A12122CostsTip ;
   private short[] T01J112_A12117CostsAny ;
   private String[] T01J14_A12122CostsTip ;
   private short[] T01J14_A12117CostsAny ;
   private String[] T01J14_A396EmprCod ;
   private short[] T01J14_A1211TipEntCod ;
   private String[] T01J115_A1212TipEntNom ;
   private boolean[] T01J115_n1212TipEntNom ;
   private String[] T01J116_A396EmprCod ;
   private short[] T01J116_A1211TipEntCod ;
   private String[] T01J116_A12122CostsTip ;
   private short[] T01J116_A12117CostsAny ;
   private String[] T01J117_A396EmprCod ;
   private short[] T01J117_A1211TipEntCod ;
   private String[] T01J117_A12122CostsTip ;
   private short[] T01J117_A12117CostsAny ;
   private byte[] T01J117_A12118CostsMes ;
   private java.math.BigDecimal[] T01J117_A12119CostsKgs ;
   private boolean[] T01J117_n12119CostsKgs ;
   private long[] T01J117_A12120CostsUnd ;
   private boolean[] T01J117_n12120CostsUnd ;
   private java.math.BigDecimal[] T01J117_A12121CostsVal ;
   private boolean[] T01J117_n12121CostsVal ;
   private String[] T01J118_A396EmprCod ;
   private short[] T01J118_A1211TipEntCod ;
   private String[] T01J118_A12122CostsTip ;
   private short[] T01J118_A12117CostsAny ;
   private byte[] T01J118_A12118CostsMes ;
   private String[] T01J13_A396EmprCod ;
   private short[] T01J13_A1211TipEntCod ;
   private String[] T01J13_A12122CostsTip ;
   private short[] T01J13_A12117CostsAny ;
   private byte[] T01J13_A12118CostsMes ;
   private java.math.BigDecimal[] T01J13_A12119CostsKgs ;
   private boolean[] T01J13_n12119CostsKgs ;
   private long[] T01J13_A12120CostsUnd ;
   private boolean[] T01J13_n12120CostsUnd ;
   private java.math.BigDecimal[] T01J13_A12121CostsVal ;
   private boolean[] T01J13_n12121CostsVal ;
   private String[] T01J12_A396EmprCod ;
   private short[] T01J12_A1211TipEntCod ;
   private String[] T01J12_A12122CostsTip ;
   private short[] T01J12_A12117CostsAny ;
   private byte[] T01J12_A12118CostsMes ;
   private java.math.BigDecimal[] T01J12_A12119CostsKgs ;
   private boolean[] T01J12_n12119CostsKgs ;
   private long[] T01J12_A12120CostsUnd ;
   private boolean[] T01J12_n12120CostsUnd ;
   private java.math.BigDecimal[] T01J12_A12121CostsVal ;
   private boolean[] T01J12_n12121CostsVal ;
   private String[] T01J122_A396EmprCod ;
   private short[] T01J122_A1211TipEntCod ;
   private String[] T01J122_A12122CostsTip ;
   private short[] T01J122_A12117CostsAny ;
   private byte[] T01J122_A12118CostsMes ;
   private String[] T01J123_A407EmprNom ;
   private boolean[] T01J123_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tcostsl__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcostsl__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcostsl__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcostsl__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcostsl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01J12", "SELECT EmprCod, TipEntCod, CostsTip, CostsAny, CostsMes, CostsKgs, CostsUnd, CostsVal FROM TXPCOSTS1 WHERE EmprCod = ? AND TipEntCod = ? AND CostsTip = ? AND CostsAny = ? AND CostsMes = ?  FOR UPDATE OF CostsKgs, CostsUnd, CostsVal NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J13", "SELECT EmprCod, TipEntCod, CostsTip, CostsAny, CostsMes, CostsKgs, CostsUnd, CostsVal FROM TXPCOSTS1 WHERE EmprCod = ? AND TipEntCod = ? AND CostsTip = ? AND CostsAny = ? AND CostsMes = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J14", "SELECT CostsTip, CostsAny, EmprCod, TipEntCod FROM TXPCOSTSL WHERE EmprCod = ? AND TipEntCod = ? AND CostsTip = ? AND CostsAny = ?  FOR UPDATE OF CostsTip NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J15", "SELECT CostsTip, CostsAny, EmprCod, TipEntCod FROM TXPCOSTSL WHERE EmprCod = ? AND TipEntCod = ? AND CostsTip = ? AND CostsAny = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J16", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J17", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J18", "SELECT /*+ FIRST_ROWS(100) */ TM1.CostsTip, TM1.CostsAny, T2.EmprNom, T3.TipEntNom, TM1.EmprCod, TM1.TipEntCod FROM ((TXPCOSTSL TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPENTRAD T3 ON T3.EmprCod = TM1.EmprCod AND T3.TipEntCod = TM1.TipEntCod) WHERE TM1.EmprCod = ? and TM1.TipEntCod = ? and TM1.CostsTip = ? and TM1.CostsAny = ? ORDER BY TM1.EmprCod, TM1.TipEntCod, TM1.CostsTip, TM1.CostsAny ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J19", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J110", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, TipEntCod, CostsTip, CostsAny FROM TXPCOSTSL WHERE EmprCod = ? AND TipEntCod = ? AND CostsTip = ? AND CostsAny = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J111", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TipEntCod, CostsTip, CostsAny FROM TXPCOSTSL WHERE ( TipEntCod > ? or TipEntCod = ? and CostsTip > ? or CostsTip = ? and TipEntCod = ? and CostsAny > ?) and EmprCod = ? ORDER BY EmprCod, TipEntCod, CostsTip, CostsAny) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01J112", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TipEntCod, CostsTip, CostsAny FROM TXPCOSTSL WHERE ( TipEntCod < ? or TipEntCod = ? and CostsTip < ? or CostsTip = ? and TipEntCod = ? and CostsAny < ?) and EmprCod = ? ORDER BY EmprCod DESC, TipEntCod DESC, CostsTip DESC, CostsAny DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01J113", "INSERT INTO TXPCOSTSL(CostsTip, CostsAny, EmprCod, TipEntCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPCOSTSL")
         ,new UpdateCursor("T01J114", "DELETE FROM TXPCOSTSL  WHERE EmprCod = ? AND TipEntCod = ? AND CostsTip = ? AND CostsAny = ?", GX_NOMASK, "TXPCOSTSL")
         ,new ForEachCursor("T01J115", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J116", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, TipEntCod, CostsTip, CostsAny FROM TXPCOSTSL WHERE EmprCod = ? ORDER BY EmprCod, TipEntCod, CostsTip, CostsAny ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J117", "SELECT EmprCod, TipEntCod, CostsTip, CostsAny, CostsMes, CostsKgs, CostsUnd, CostsVal FROM TXPCOSTS1 WHERE EmprCod = ? and TipEntCod = ? and CostsTip = ? and CostsAny = ? and CostsMes = ? ORDER BY EmprCod, TipEntCod, CostsTip, CostsAny, CostsMes ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J118", "SELECT EmprCod, TipEntCod, CostsTip, CostsAny, CostsMes FROM TXPCOSTS1 WHERE EmprCod = ? AND TipEntCod = ? AND CostsTip = ? AND CostsAny = ? AND CostsMes = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01J119", "INSERT INTO TXPCOSTS1(EmprCod, TipEntCod, CostsTip, CostsAny, CostsMes, CostsKgs, CostsUnd, CostsVal) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCOSTS1")
         ,new UpdateCursor("T01J120", "UPDATE TXPCOSTS1 SET CostsKgs=?, CostsUnd=?, CostsVal=?  WHERE EmprCod = ? AND TipEntCod = ? AND CostsTip = ? AND CostsAny = ? AND CostsMes = ?", GX_NOMASK, "TXPCOSTS1")
         ,new UpdateCursor("T01J121", "DELETE FROM TXPCOSTS1  WHERE EmprCod = ? AND TipEntCod = ? AND CostsTip = ? AND CostsAny = ? AND CostsMes = ?", GX_NOMASK, "TXPCOSTS1")
         ,new ForEachCursor("T01J122", "SELECT EmprCod, TipEntCod, CostsTip, CostsAny, CostsMes FROM TXPCOSTS1 WHERE EmprCod = ? and TipEntCod = ? and CostsTip = ? and CostsAny = ? ORDER BY EmprCod, TipEntCod, CostsTip, CostsAny, CostsMes ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J123", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 25);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((short[]) buf[7])[0] = rslt.getShort(6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 21 :
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
               stmt.setString(3, (String)parms[2], 2);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 2);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 2);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 2);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 2);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 2);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 9 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 2);
               stmt.setString(4, (String)parms[3], 2);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 2);
               stmt.setString(4, (String)parms[3], 2);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 2);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 2);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 2);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 2);
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
                  stmt.setLong(7, ((Number) parms[8]).longValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               }
               return;
            case 18 :
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
                  stmt.setLong(2, ((Number) parms[3]).longValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setShort(5, ((Number) parms[7]).shortValue());
               stmt.setString(6, (String)parms[8], 2);
               stmt.setShort(7, ((Number) parms[9]).shortValue());
               stmt.setByte(8, ((Number) parms[10]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 2);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 2);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

