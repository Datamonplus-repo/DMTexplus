package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdt005_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"DTB_DPQ") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7935Dtb_CPQ = httpContext.GetPar( "Dtb_CPQ") ;
         n7935Dtb_CPQ = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asadtb_dpq10I1108( A396EmprCod, A7935Dtb_CPQ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel9"+"_"+"DTB_PRDNOM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7945Dtb_Prdnum = httpContext.GetPar( "Dtb_Prdnum") ;
         n7945Dtb_Prdnum = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx9asadtb_prdnom10I1109( A396EmprCod, A7945Dtb_Prdnum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_18") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         n490ForPrdUMe = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_18( A396EmprCod, A490ForPrdUMe) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
      {
         gxnrgrid2_newrow_invoke( ) ;
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
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A758ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TABLA BARFAS-PQUIMICO", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
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
      nRC_GXsfl_60 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_60"))) ;
      nGXsfl_60_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_60_idx"))) ;
      sGXsfl_60_idx = httpContext.GetPar( "sGXsfl_60_idx") ;
      A7933Dtb_UOrd = (short)(GXutil.lval( httpContext.GetPar( "Dtb_UOrd"))) ;
      n7933Dtb_UOrd = false ;
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

   public void gxnrgrid2_newrow_invoke( )
   {
      nRC_GXsfl_122 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_122"))) ;
      nGXsfl_122_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_122_idx"))) ;
      sGXsfl_122_idx = httpContext.GetPar( "sGXsfl_122_idx") ;
      A7943Dtb_ForUli = (short)(GXutil.lval( httpContext.GetPar( "Dtb_ForUli"))) ;
      n7943Dtb_ForUli = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid2_newrow( ) ;
      /* End function gxnrGrid2_newrow_invoke */
   }

   public tdt005_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdt005_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdt005_impl.class ));
   }

   public tdt005_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT005.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT005.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT005.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT005.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDT005.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDT005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDT005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDT005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDT005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDT005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Numero Orden Fase", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarOrdLin_Jsonclick, 0, "", "", "", "", "", 1, edtBarOrdLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDT005.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDT005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Ultimo PQ", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDtb_UOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A7933Dtb_UOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDtb_UOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7933Dtb_UOrd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7933Dtb_UOrd), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDtb_UOrd_Jsonclick, 0, "", "", "", "", "", 1, edtDtb_UOrd_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDT005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol60( ) ;
      /* Save parent mode. */
      sMode1108 = Gx_mode ;
      nGXsfl_60_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1108 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1108 = (short)(1) ;
            scanStart10I1108( ) ;
            while ( RcdFound1108 != 0 )
            {
               init_level_properties1108( ) ;
               getByPrimaryKey10I1108( ) ;
               addRow10I1108( ) ;
               scanNext10I1108( ) ;
            }
            scanEnd10I1108( ) ;
            nBlankRcdCount1108 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B7933Dtb_UOrd = A7933Dtb_UOrd ;
         n7933Dtb_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
         standaloneNotModal10I1108( ) ;
         standaloneModal10I1108( ) ;
         sMode1108 = Gx_mode ;
         while ( nGXsfl_60_idx < nRC_GXsfl_60 )
         {
            bGXsfl_60_Refreshing = true ;
            readRow10I1108( ) ;
            edtDtb_Ordl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_ORDL_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtb_Ordl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_Ordl_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDtb_CPQ_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_CPQ_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtb_CPQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_CPQ_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDtb_DPQ_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_DPQ_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtb_DPQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_DPQ_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDtb_ForFab_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_FORFAB_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtb_ForFab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_ForFab_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDtb_Fortie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_FORTIE_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtb_Fortie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_Fortie_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDtb_ForTmx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_FORTMX_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtb_ForTmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_ForTmx_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDtb_ForRb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_FORRB_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtb_ForRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_ForRb_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDtb_ForPhx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_FORPHX_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtb_ForPhx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_ForPhx_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDtb_ForPhn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_FORPHN_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtb_ForPhn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_ForPhn_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDtb_ForUli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_FORULI_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtb_ForUli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_ForUli_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDtb_Nh2o_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_NH2O_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtb_Nh2o_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_Nh2o_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            if ( ( nRcdExists_1108 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal10I1108( ) ;
            }
            sendRow10I1108( ) ;
            bGXsfl_60_Refreshing = false ;
         }
         Gx_mode = sMode1108 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A7933Dtb_UOrd = B7933Dtb_UOrd ;
         n7933Dtb_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1108 = (short)(5) ;
         nRcdExists_1108 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart10I1108( ) ;
            while ( RcdFound1108 != 0 )
            {
               sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_601108( ) ;
               init_level_properties1108( ) ;
               standaloneNotModal10I1108( ) ;
               getByPrimaryKey10I1108( ) ;
               standaloneModal10I1108( ) ;
               addRow10I1108( ) ;
               scanNext10I1108( ) ;
            }
            scanEnd10I1108( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1108 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_601108( ) ;
      initAll10I1108( ) ;
      init_level_properties1108( ) ;
      B7933Dtb_UOrd = A7933Dtb_UOrd ;
      n7933Dtb_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
      nRcdExists_1108 = (short)(0) ;
      nIsMod_1108 = (short)(0) ;
      nRcdDeleted_1108 = (short)(0) ;
      nBlankRcdCount1108 = (short)(nBlankRcdUsr1108+nBlankRcdCount1108) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1108 > 0 )
      {
         standaloneNotModal10I1108( ) ;
         standaloneModal10I1108( ) ;
         addRow10I1108( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtDtb_Ordl_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1108 = (short)(nBlankRcdCount1108-1) ;
      }
      Gx_mode = sMode1108 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A7933Dtb_UOrd = B7933Dtb_UOrd ;
      n7933Dtb_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
      /* Restore parent mode. */
      Gx_mode = sMode1108 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT005.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 135,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT005.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT005.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT005.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDT005.htm");
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
      e1110I2 ();
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
            Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
            Z194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z194BarOrdLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7933Dtb_UOrd = (short)(localUtil.ctol( httpContext.cgiGet( "Z7933Dtb_UOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O7933Dtb_UOrd = (short)(localUtil.ctol( httpContext.cgiGet( "O7933Dtb_UOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_60 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_60"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A7933Dtb_UOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtDtb_UOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7933Dtb_UOrd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            /* Check if conditions changed and reset current page numbers */
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
               A758ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
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
                        e1110I2 ();
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
            initAll10I15( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1109_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1109_Enabled), 5, 0), !bGXsfl_122_Refreshing);
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
      disableAttributes10I15( ) ;
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

   public void confirm_10I0( )
   {
      beforeValidate10I15( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls10I15( ) ;
         }
         else
         {
            checkExtendedTable10I15( ) ;
            if ( AnyError == 0 )
            {
               zm10I15( 14) ;
               zm10I15( 15) ;
            }
            closeExtendedTableCursors10I15( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode15 = Gx_mode ;
         confirm_10I1108( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode15 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues10I0( ) ;
      }
   }

   public void confirm_10I1109( )
   {
      s7943Dtb_ForUli = O7943Dtb_ForUli ;
      n7943Dtb_ForUli = false ;
      nGXsfl_122_idx = 0 ;
      while ( nGXsfl_122_idx < nRC_GXsfl_122 )
      {
         readRow10I1109( ) ;
         if ( ( nRcdExists_1109 != 0 ) || ( nIsMod_1109 != 0 ) )
         {
            getKey10I1109( ) ;
            if ( ( nRcdExists_1109 == 0 ) && ( nRcdDeleted_1109 == 0 ) )
            {
               if ( RcdFound1109 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate10I1109( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable10I1109( ) ;
                     if ( AnyError == 0 )
                     {
                        zm10I1109( 18) ;
                     }
                     closeExtendedTableCursors10I1109( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O7943Dtb_ForUli = A7943Dtb_ForUli ;
                     n7943Dtb_ForUli = false ;
                  }
               }
               else
               {
                  GXCCtl = "DTB_ORDL_" + sGXsfl_60_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDtb_Ordl_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1109 != 0 )
               {
                  if ( nRcdDeleted_1109 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey10I1109( ) ;
                     load10I1109( ) ;
                     beforeValidate10I1109( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls10I1109( ) ;
                        O7943Dtb_ForUli = A7943Dtb_ForUli ;
                        n7943Dtb_ForUli = false ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1109 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate10I1109( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable10I1109( ) ;
                           if ( AnyError == 0 )
                           {
                              zm10I1109( 18) ;
                           }
                           closeExtendedTableCursors10I1109( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O7943Dtb_ForUli = A7943Dtb_ForUli ;
                           n7943Dtb_ForUli = false ;
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1109 == 0 )
                  {
                     GXCCtl = "DTB_ORDL_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDtb_Ordl_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1109_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1109, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtb_ForLin_Internalname, GXutil.ltrim( localUtil.ntoc( A7944Dtb_ForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtb_Prdnum_Internalname, GXutil.rtrim( A7945Dtb_Prdnum)) ;
         httpContext.changePostValue( edtDtb_PrdNom_Internalname, GXutil.rtrim( A7946Dtb_PrdNom)) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc)) ;
         httpContext.changePostValue( edtDtb_Forcan_Internalname, GXutil.ltrim( localUtil.ntoc( A7947Dtb_Forcan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtb_clave1_Internalname, GXutil.rtrim( A8477Dtb_clave1)) ;
         httpContext.changePostValue( edtDtb_clave2_Internalname, GXutil.rtrim( A8478Dtb_clave2)) ;
         httpContext.changePostValue( "ZT_"+"Z7944Dtb_ForLin_"+sGXsfl_122_idx, GXutil.ltrim( localUtil.ntoc( Z7944Dtb_ForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7945Dtb_Prdnum_"+sGXsfl_122_idx, GXutil.rtrim( Z7945Dtb_Prdnum)) ;
         httpContext.changePostValue( "ZT_"+"Z7947Dtb_Forcan_"+sGXsfl_122_idx, GXutil.ltrim( localUtil.ntoc( Z7947Dtb_Forcan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8477Dtb_clave1_"+sGXsfl_122_idx, GXutil.rtrim( Z8477Dtb_clave1)) ;
         httpContext.changePostValue( "ZT_"+"Z8478Dtb_clave2_"+sGXsfl_122_idx, GXutil.rtrim( Z8478Dtb_clave2)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_122_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1109_"+sGXsfl_122_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1109, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1109_"+sGXsfl_122_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1109, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1109_"+sGXsfl_122_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1109, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1109 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1109_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1109_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_FORLIN_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_PRDNUM_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_Prdnum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_PRDNOM_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_PrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDDSC_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_FORCAN_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_Forcan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_CLAVE1_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_clave1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_CLAVE2_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_clave2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O7943Dtb_ForUli = s7943Dtb_ForUli ;
      n7943Dtb_ForUli = false ;
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_10I1108( )
   {
      s7933Dtb_UOrd = O7933Dtb_UOrd ;
      n7933Dtb_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow10I1108( ) ;
         if ( ( nRcdExists_1108 != 0 ) || ( nIsMod_1108 != 0 ) )
         {
            getKey10I1108( ) ;
            if ( ( nRcdExists_1108 == 0 ) && ( nRcdDeleted_1108 == 0 ) )
            {
               if ( RcdFound1108 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate10I1108( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable10I1108( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors10I1108( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode1108 = Gx_mode ;
                        confirm_10I1109( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode1108 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode1108 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     O7933Dtb_UOrd = A7933Dtb_UOrd ;
                     n7933Dtb_UOrd = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "DTB_ORDL_" + sGXsfl_60_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDtb_Ordl_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1108 != 0 )
               {
                  if ( nRcdDeleted_1108 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey10I1108( ) ;
                     load10I1108( ) ;
                     beforeValidate10I1108( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls10I1108( ) ;
                        O7933Dtb_UOrd = A7933Dtb_UOrd ;
                        n7933Dtb_UOrd = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1108 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate10I1108( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable10I1108( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors10I1108( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode1108 = Gx_mode ;
                              confirm_10I1109( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode1108 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode1108 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                           O7933Dtb_UOrd = A7933Dtb_UOrd ;
                           n7933Dtb_UOrd = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1108 == 0 )
                  {
                     GXCCtl = "DTB_ORDL_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDtb_Ordl_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtDtb_Ordl_Internalname, GXutil.ltrim( localUtil.ntoc( A7934Dtb_Ordl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtb_CPQ_Internalname, GXutil.rtrim( A7935Dtb_CPQ)) ;
         httpContext.changePostValue( edtDtb_DPQ_Internalname, GXutil.rtrim( A7936Dtb_DPQ)) ;
         httpContext.changePostValue( edtDtb_ForFab_Internalname, GXutil.rtrim( A7937Dtb_ForFab)) ;
         httpContext.changePostValue( edtDtb_Fortie_Internalname, GXutil.ltrim( localUtil.ntoc( A7938Dtb_Fortie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtb_ForTmx_Internalname, GXutil.ltrim( localUtil.ntoc( A7939Dtb_ForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtb_ForRb_Internalname, GXutil.ltrim( localUtil.ntoc( A7940Dtb_ForRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtb_ForPhx_Internalname, GXutil.ltrim( localUtil.ntoc( A7941Dtb_ForPhx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtb_ForPhn_Internalname, GXutil.ltrim( localUtil.ntoc( A7942Dtb_ForPhn, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtb_ForUli_Internalname, GXutil.ltrim( localUtil.ntoc( A7943Dtb_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtb_Nh2o_Internalname, GXutil.ltrim( localUtil.ntoc( A12111Dtb_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7934Dtb_Ordl_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z7934Dtb_Ordl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7935Dtb_CPQ_"+sGXsfl_60_idx, GXutil.rtrim( Z7935Dtb_CPQ)) ;
         httpContext.changePostValue( "ZT_"+"Z7937Dtb_ForFab_"+sGXsfl_60_idx, GXutil.rtrim( Z7937Dtb_ForFab)) ;
         httpContext.changePostValue( "ZT_"+"Z7938Dtb_Fortie_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z7938Dtb_Fortie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7939Dtb_ForTmx_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z7939Dtb_ForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7940Dtb_ForRb_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z7940Dtb_ForRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7941Dtb_ForPhx_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z7941Dtb_ForPhx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7942Dtb_ForPhn_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z7942Dtb_ForPhn, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7943Dtb_ForUli_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z7943Dtb_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12111Dtb_Nh2o_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z12111Dtb_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T7943Dtb_ForUli_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O7943Dtb_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_122_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_122, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1108_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1108, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1108_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1108, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1108_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1108, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1108 != 0 )
         {
            httpContext.changePostValue( "DTB_ORDL_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_Ordl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_CPQ_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_CPQ_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_DPQ_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_DPQ_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_FORFAB_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForFab_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_FORTIE_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_Fortie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_FORTMX_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForTmx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_FORRB_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForRb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_FORPHX_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForPhx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_FORPHN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForPhn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_FORULI_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForUli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_NH2O_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_Nh2o_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O7933Dtb_UOrd = s7933Dtb_UOrd ;
      n7933Dtb_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption10I0( )
   {
   }

   public void e1110I2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tdt005_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tdt005_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tdt005_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdt005_impl.this.A396EmprCod = GXv_char2[0] ;
      tdt005_impl.this.AV11EmprNom = GXv_char3[0] ;
      tdt005_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm10I15( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7933Dtb_UOrd = T010I8_A7933Dtb_UOrd[0] ;
         }
         else
         {
            Z7933Dtb_UOrd = A7933Dtb_UOrd ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z194BarOrdLin = A194BarOrdLin ;
         Z7933Dtb_UOrd = A7933Dtb_UOrd ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtDtb_UOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_UOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_UOrd_Enabled), 5, 0), true);
      AV33Pgmname = "TDT005" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtDtb_UOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_UOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_UOrd_Enabled), 5, 0), true);
      /* Using cursor T010I9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T010I9_A407EmprNom[0] ;
      n407EmprNom = T010I9_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(7);
      /* Using cursor T010I10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(8);
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

   public void load10I15( )
   {
      /* Using cursor T010I11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A407EmprNom = T010I11_A407EmprNom[0] ;
         n407EmprNom = T010I11_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A7933Dtb_UOrd = T010I11_A7933Dtb_UOrd[0] ;
         n7933Dtb_UOrd = T010I11_n7933Dtb_UOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
         zm10I15( -13) ;
      }
      pr_default.close(9);
      onLoadActions10I15( ) ;
   }

   public void onLoadActions10I15( )
   {
   }

   public void checkExtendedTable10I15( )
   {
      nIsDirty_15 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors10I15( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey10I15( )
   {
      /* Using cursor T010I12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound15 = (short)(1) ;
      }
      else
      {
         RcdFound15 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T010I8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(6) != 101) && ( T010I8_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T010I8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010I8_A129BarCod[0] == A129BarCod ) && ( T010I8_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T010I8_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T010I8_A758ProCod[0], A758ProCod) == 0 ) )
      {
         zm10I15( 13) ;
         RcdFound15 = (short)(1) ;
         A7933Dtb_UOrd = T010I8_A7933Dtb_UOrd[0] ;
         n7933Dtb_UOrd = T010I8_n7933Dtb_UOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
         O7933Dtb_UOrd = A7933Dtb_UOrd ;
         n7933Dtb_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load10I15( ) ;
         if ( AnyError == 1 )
         {
            RcdFound15 = (short)(0) ;
            initializeNonKey10I15( ) ;
         }
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound15 = (short)(0) ;
         initializeNonKey10I15( ) ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey10I15( ) ;
      if ( RcdFound15 == 0 )
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
      RcdFound15 = (short)(0) ;
      /* Using cursor T010I13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T010I13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010I13_A129BarCod[0] == A129BarCod ) && ( T010I13_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T010I13_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T010I13_A758ProCod[0], A758ProCod) == 0 ) && ( T010I13_A194BarOrdLin[0] == A194BarOrdLin ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T010I13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010I13_A129BarCod[0] == A129BarCod ) && ( T010I13_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T010I13_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T010I13_A758ProCod[0], A758ProCod) == 0 ) && ( T010I13_A194BarOrdLin[0] == A194BarOrdLin ) )
         {
            RcdFound15 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound15 = (short)(0) ;
      /* Using cursor T010I14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T010I14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010I14_A129BarCod[0] == A129BarCod ) && ( T010I14_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T010I14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T010I14_A758ProCod[0], A758ProCod) == 0 ) && ( T010I14_A194BarOrdLin[0] == A194BarOrdLin ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T010I14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010I14_A129BarCod[0] == A129BarCod ) && ( T010I14_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T010I14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T010I14_A758ProCod[0], A758ProCod) == 0 ) && ( T010I14_A194BarOrdLin[0] == A194BarOrdLin ) )
         {
            RcdFound15 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey10I15( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A7933Dtb_UOrd = O7933Dtb_UOrd ;
         n7933Dtb_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
         insert10I15( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound15 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A7933Dtb_UOrd = O7933Dtb_UOrd ;
               n7933Dtb_UOrd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A7933Dtb_UOrd = O7933Dtb_UOrd ;
               n7933Dtb_UOrd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
               update10I15( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A7933Dtb_UOrd = O7933Dtb_UOrd ;
               n7933Dtb_UOrd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
               insert10I15( ) ;
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
                  A7933Dtb_UOrd = O7933Dtb_UOrd ;
                  n7933Dtb_UOrd = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
                  insert10I15( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A7933Dtb_UOrd = O7933Dtb_UOrd ;
         n7933Dtb_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
         delete( ) ;
         afterTrn( ) ;
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
      getKey10I15( ) ;
      if ( RcdFound15 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdt005");
   }

   public void insert_check( )
   {
      confirm_10I0( ) ;
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
      if ( RcdFound15 == 0 )
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
      scanStart10I15( ) ;
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd10I15( ) ;
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
      if ( RcdFound15 == 0 )
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
      if ( RcdFound15 == 0 )
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
      scanStart10I15( ) ;
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound15 != 0 )
         {
            scanNext10I15( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd10I15( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency10I15( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T010I7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) || ( Z7933Dtb_UOrd != T010I7_A7933Dtb_UOrd[0] ) )
         {
            if ( Z7933Dtb_UOrd != T010I7_A7933Dtb_UOrd[0] )
            {
               GXutil.writeLogln("tdt005:[seudo value changed for attri]"+"Dtb_UOrd");
               GXutil.writeLogRaw("Old: ",Z7933Dtb_UOrd);
               GXutil.writeLogRaw("Current: ",T010I7_A7933Dtb_UOrd[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert10I15( )
   {
      beforeValidate10I15( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10I15( ) ;
      }
      if ( AnyError == 0 )
      {
         zm10I15( 0) ;
         checkOptimisticConcurrency10I15( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10I15( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert10I15( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010I15 */
                  pr_default.execute(13, new Object[] {Short.valueOf(A194BarOrdLin), Boolean.valueOf(n7933Dtb_UOrd), Short.valueOf(A7933Dtb_UOrd), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
                  if ( (pr_default.getStatus(13) == 1) )
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
                        processLevel10I15( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption10I0( ) ;
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
            load10I15( ) ;
         }
         endLevel10I15( ) ;
      }
      closeExtendedTableCursors10I15( ) ;
   }

   public void update10I15( )
   {
      beforeValidate10I15( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10I15( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10I15( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10I15( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate10I15( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010I16 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n7933Dtb_UOrd), Short.valueOf(A7933Dtb_UOrd), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARFAS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate10I15( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel10I15( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption10I0( ) ;
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
         endLevel10I15( ) ;
      }
      closeExtendedTableCursors10I15( ) ;
   }

   public void deferredUpdate10I15( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate10I15( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10I15( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls10I15( ) ;
         afterConfirm10I15( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete10I15( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T010I17 */
               pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound15 == 0 )
                     {
                        initAll10I15( ) ;
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
                     resetCaption10I0( ) ;
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
      sMode15 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel10I15( ) ;
      Gx_mode = sMode15 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls10I15( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T010I18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level8", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T010I19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level7", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T010I20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level6", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T010I21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level5", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T010I22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level4", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T010I23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level3", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T010I24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T010I25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T010I26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T010I27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZEPHYR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T010I28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACEMp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T010I29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACABp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T010I30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACCAp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T010I31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACPEp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T010I32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACRAp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T010I33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DT005", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T010I34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T010I35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AGRHDF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T010I36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T010I37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T010I38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Parametros por fase de la HR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
      }
   }

   public void processNestedLevel10I1108( )
   {
      s7933Dtb_UOrd = O7933Dtb_UOrd ;
      n7933Dtb_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow10I1108( ) ;
         if ( ( nRcdExists_1108 != 0 ) || ( nIsMod_1108 != 0 ) )
         {
            standaloneNotModal10I1108( ) ;
            getKey10I1108( ) ;
            if ( ( nRcdExists_1108 == 0 ) && ( nRcdDeleted_1108 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert10I1108( ) ;
            }
            else
            {
               if ( RcdFound1108 != 0 )
               {
                  if ( ( nRcdDeleted_1108 != 0 ) && ( nRcdExists_1108 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete10I1108( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1108 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update10I1108( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1108 == 0 )
                  {
                     GXCCtl = "DTB_ORDL_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDtb_Ordl_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O7933Dtb_UOrd = A7933Dtb_UOrd ;
            n7933Dtb_UOrd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
         }
         httpContext.changePostValue( edtDtb_Ordl_Internalname, GXutil.ltrim( localUtil.ntoc( A7934Dtb_Ordl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtb_CPQ_Internalname, GXutil.rtrim( A7935Dtb_CPQ)) ;
         httpContext.changePostValue( edtDtb_DPQ_Internalname, GXutil.rtrim( A7936Dtb_DPQ)) ;
         httpContext.changePostValue( edtDtb_ForFab_Internalname, GXutil.rtrim( A7937Dtb_ForFab)) ;
         httpContext.changePostValue( edtDtb_Fortie_Internalname, GXutil.ltrim( localUtil.ntoc( A7938Dtb_Fortie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtb_ForTmx_Internalname, GXutil.ltrim( localUtil.ntoc( A7939Dtb_ForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtb_ForRb_Internalname, GXutil.ltrim( localUtil.ntoc( A7940Dtb_ForRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtb_ForPhx_Internalname, GXutil.ltrim( localUtil.ntoc( A7941Dtb_ForPhx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtb_ForPhn_Internalname, GXutil.ltrim( localUtil.ntoc( A7942Dtb_ForPhn, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtb_ForUli_Internalname, GXutil.ltrim( localUtil.ntoc( A7943Dtb_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtb_Nh2o_Internalname, GXutil.ltrim( localUtil.ntoc( A12111Dtb_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7934Dtb_Ordl_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z7934Dtb_Ordl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7935Dtb_CPQ_"+sGXsfl_60_idx, GXutil.rtrim( Z7935Dtb_CPQ)) ;
         httpContext.changePostValue( "ZT_"+"Z7937Dtb_ForFab_"+sGXsfl_60_idx, GXutil.rtrim( Z7937Dtb_ForFab)) ;
         httpContext.changePostValue( "ZT_"+"Z7938Dtb_Fortie_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z7938Dtb_Fortie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7939Dtb_ForTmx_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z7939Dtb_ForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7940Dtb_ForRb_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z7940Dtb_ForRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7941Dtb_ForPhx_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z7941Dtb_ForPhx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7942Dtb_ForPhn_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z7942Dtb_ForPhn, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7943Dtb_ForUli_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z7943Dtb_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12111Dtb_Nh2o_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z12111Dtb_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T7943Dtb_ForUli_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O7943Dtb_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_122_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_122, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1108_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1108, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1108_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1108, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1108_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1108, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1108 != 0 )
         {
            httpContext.changePostValue( "DTB_ORDL_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_Ordl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_CPQ_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_CPQ_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_DPQ_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_DPQ_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_FORFAB_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForFab_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_FORTIE_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_Fortie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_FORTMX_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForTmx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_FORRB_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForRb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_FORPHX_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForPhx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_FORPHN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForPhn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_FORULI_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForUli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_NH2O_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_Nh2o_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll10I1108( ) ;
      if ( AnyError != 0 )
      {
         O7933Dtb_UOrd = s7933Dtb_UOrd ;
         n7933Dtb_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
      }
      nRcdExists_1108 = (short)(0) ;
      nIsMod_1108 = (short)(0) ;
      nRcdDeleted_1108 = (short)(0) ;
   }

   public void processLevel10I15( )
   {
      /* Save parent mode. */
      sMode15 = Gx_mode ;
      processNestedLevel10I1108( ) ;
      if ( AnyError != 0 )
      {
         O7933Dtb_UOrd = s7933Dtb_UOrd ;
         n7933Dtb_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode15 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T010I39 */
      pr_default.execute(37, new Object[] {Boolean.valueOf(n7933Dtb_UOrd), Short.valueOf(A7933Dtb_UOrd), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
   }

   public void endLevel10I15( )
   {
      pr_default.close(5);
      if ( AnyError == 0 )
      {
         beforeComplete10I15( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdt005");
         if ( AnyError == 0 )
         {
            confirmValues10I0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdt005");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart10I15( )
   {
      /* Scan By routine */
      /* Using cursor T010I40 */
      pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound15 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext10I15( )
   {
      /* Scan next routine */
      pr_default.readNext(38);
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound15 = (short)(1) ;
      }
   }

   public void scanEnd10I15( )
   {
      pr_default.close(38);
   }

   public void afterConfirm10I15( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert10I15( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate10I15( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete10I15( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete10I15( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate10I15( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes10I15( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtBarOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtDtb_UOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_UOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_UOrd_Enabled), 5, 0), true);
   }

   public void zm10I1108( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7935Dtb_CPQ = T010I6_A7935Dtb_CPQ[0] ;
            Z7937Dtb_ForFab = T010I6_A7937Dtb_ForFab[0] ;
            Z7938Dtb_Fortie = T010I6_A7938Dtb_Fortie[0] ;
            Z7939Dtb_ForTmx = T010I6_A7939Dtb_ForTmx[0] ;
            Z7940Dtb_ForRb = T010I6_A7940Dtb_ForRb[0] ;
            Z7941Dtb_ForPhx = T010I6_A7941Dtb_ForPhx[0] ;
            Z7942Dtb_ForPhn = T010I6_A7942Dtb_ForPhn[0] ;
            Z7943Dtb_ForUli = T010I6_A7943Dtb_ForUli[0] ;
            Z12111Dtb_Nh2o = T010I6_A12111Dtb_Nh2o[0] ;
         }
         else
         {
            Z7935Dtb_CPQ = A7935Dtb_CPQ ;
            Z7937Dtb_ForFab = A7937Dtb_ForFab ;
            Z7938Dtb_Fortie = A7938Dtb_Fortie ;
            Z7939Dtb_ForTmx = A7939Dtb_ForTmx ;
            Z7940Dtb_ForRb = A7940Dtb_ForRb ;
            Z7941Dtb_ForPhx = A7941Dtb_ForPhx ;
            Z7942Dtb_ForPhn = A7942Dtb_ForPhn ;
            Z7943Dtb_ForUli = A7943Dtb_ForUli ;
            Z12111Dtb_Nh2o = A12111Dtb_Nh2o ;
         }
      }
      if ( GX_JID == -16 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z7934Dtb_Ordl = A7934Dtb_Ordl ;
         Z7935Dtb_CPQ = A7935Dtb_CPQ ;
         Z7937Dtb_ForFab = A7937Dtb_ForFab ;
         Z7938Dtb_Fortie = A7938Dtb_Fortie ;
         Z7939Dtb_ForTmx = A7939Dtb_ForTmx ;
         Z7940Dtb_ForRb = A7940Dtb_ForRb ;
         Z7941Dtb_ForPhx = A7941Dtb_ForPhx ;
         Z7942Dtb_ForPhn = A7942Dtb_ForPhn ;
         Z7943Dtb_ForUli = A7943Dtb_ForUli ;
         Z12111Dtb_Nh2o = A12111Dtb_Nh2o ;
         Z396EmprCod = A396EmprCod ;
         Z758ProCod = A758ProCod ;
      }
   }

   public void standaloneNotModal10I1108( )
   {
      edtDtb_ForUli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_ForUli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_ForUli_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDtb_UOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_UOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_UOrd_Enabled), 5, 0), true);
      edtDtb_UOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_UOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_UOrd_Enabled), 5, 0), true);
   }

   public void standaloneModal10I1108( )
   {
      if ( isIns( )  )
      {
         A7933Dtb_UOrd = (short)(O7933Dtb_UOrd+10) ;
         n7933Dtb_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A7934Dtb_Ordl = A7933Dtb_UOrd ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDtb_Ordl_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDtb_Ordl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_Ordl_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtDtb_Ordl_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDtb_Ordl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_Ordl_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
   }

   public void load10I1108( )
   {
      /* Using cursor T010I41 */
      pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl)});
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound1108 = (short)(1) ;
         A7935Dtb_CPQ = T010I41_A7935Dtb_CPQ[0] ;
         n7935Dtb_CPQ = T010I41_n7935Dtb_CPQ[0] ;
         A7937Dtb_ForFab = T010I41_A7937Dtb_ForFab[0] ;
         n7937Dtb_ForFab = T010I41_n7937Dtb_ForFab[0] ;
         A7938Dtb_Fortie = T010I41_A7938Dtb_Fortie[0] ;
         n7938Dtb_Fortie = T010I41_n7938Dtb_Fortie[0] ;
         A7939Dtb_ForTmx = T010I41_A7939Dtb_ForTmx[0] ;
         n7939Dtb_ForTmx = T010I41_n7939Dtb_ForTmx[0] ;
         A7940Dtb_ForRb = T010I41_A7940Dtb_ForRb[0] ;
         n7940Dtb_ForRb = T010I41_n7940Dtb_ForRb[0] ;
         A7941Dtb_ForPhx = T010I41_A7941Dtb_ForPhx[0] ;
         n7941Dtb_ForPhx = T010I41_n7941Dtb_ForPhx[0] ;
         A7942Dtb_ForPhn = T010I41_A7942Dtb_ForPhn[0] ;
         n7942Dtb_ForPhn = T010I41_n7942Dtb_ForPhn[0] ;
         A7943Dtb_ForUli = T010I41_A7943Dtb_ForUli[0] ;
         n7943Dtb_ForUli = T010I41_n7943Dtb_ForUli[0] ;
         A12111Dtb_Nh2o = T010I41_A12111Dtb_Nh2o[0] ;
         n12111Dtb_Nh2o = T010I41_n12111Dtb_Nh2o[0] ;
         zm10I1108( -16) ;
      }
      pr_default.close(39);
      onLoadActions10I1108( ) ;
   }

   public void onLoadActions10I1108( )
   {
      GXt_char1 = A7936Dtb_DPQ ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7935Dtb_CPQ ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd3(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt005_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt005_impl.this.A7935Dtb_CPQ = GXv_char3[0] ;
      tdt005_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7936Dtb_DPQ = GXt_char1 ;
   }

   public void checkExtendedTable10I1108( )
   {
      nIsDirty_1108 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal10I1108( ) ;
      nIsDirty_1108 = (short)(1) ;
      GXt_char1 = A7936Dtb_DPQ ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7935Dtb_CPQ ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd3(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt005_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt005_impl.this.A7935Dtb_CPQ = GXv_char3[0] ;
      tdt005_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7936Dtb_DPQ = GXt_char1 ;
      if ( ( GXutil.strcmp(A7936Dtb_DPQ, httpContext.getMessage( "Error", "")) == 0 ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Inexistente", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors10I1108( )
   {
   }

   public void enableDisable10I1108( )
   {
   }

   public void getKey10I1108( )
   {
      /* Using cursor T010I42 */
      pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl)});
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound1108 = (short)(1) ;
      }
      else
      {
         RcdFound1108 = (short)(0) ;
      }
      pr_default.close(40);
   }

   public void getByPrimaryKey10I1108( )
   {
      /* Using cursor T010I6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl)});
      if ( (pr_default.getStatus(4) != 101) && ( T010I6_A129BarCod[0] == A129BarCod ) && ( T010I6_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T010I6_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T010I6_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T010I6_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T010I6_A758ProCod[0], A758ProCod) == 0 ) )
      {
         zm10I1108( 16) ;
         RcdFound1108 = (short)(1) ;
         initializeNonKey10I1108( ) ;
         A7934Dtb_Ordl = T010I6_A7934Dtb_Ordl[0] ;
         A7935Dtb_CPQ = T010I6_A7935Dtb_CPQ[0] ;
         n7935Dtb_CPQ = T010I6_n7935Dtb_CPQ[0] ;
         A7937Dtb_ForFab = T010I6_A7937Dtb_ForFab[0] ;
         n7937Dtb_ForFab = T010I6_n7937Dtb_ForFab[0] ;
         A7938Dtb_Fortie = T010I6_A7938Dtb_Fortie[0] ;
         n7938Dtb_Fortie = T010I6_n7938Dtb_Fortie[0] ;
         A7939Dtb_ForTmx = T010I6_A7939Dtb_ForTmx[0] ;
         n7939Dtb_ForTmx = T010I6_n7939Dtb_ForTmx[0] ;
         A7940Dtb_ForRb = T010I6_A7940Dtb_ForRb[0] ;
         n7940Dtb_ForRb = T010I6_n7940Dtb_ForRb[0] ;
         A7941Dtb_ForPhx = T010I6_A7941Dtb_ForPhx[0] ;
         n7941Dtb_ForPhx = T010I6_n7941Dtb_ForPhx[0] ;
         A7942Dtb_ForPhn = T010I6_A7942Dtb_ForPhn[0] ;
         n7942Dtb_ForPhn = T010I6_n7942Dtb_ForPhn[0] ;
         A7943Dtb_ForUli = T010I6_A7943Dtb_ForUli[0] ;
         n7943Dtb_ForUli = T010I6_n7943Dtb_ForUli[0] ;
         A12111Dtb_Nh2o = T010I6_A12111Dtb_Nh2o[0] ;
         n12111Dtb_Nh2o = T010I6_n12111Dtb_Nh2o[0] ;
         O7943Dtb_ForUli = A7943Dtb_ForUli ;
         n7943Dtb_ForUli = false ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z7934Dtb_Ordl = A7934Dtb_Ordl ;
         sMode1108 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal10I1108( ) ;
         load10I1108( ) ;
         Gx_mode = sMode1108 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1108 = (short)(0) ;
         initializeNonKey10I1108( ) ;
         sMode1108 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal10I1108( ) ;
         Gx_mode = sMode1108 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes10I1108( ) ;
      }
      pr_default.close(4);
   }

   public void checkOptimisticConcurrency10I1108( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T010I5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDT005"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z7935Dtb_CPQ, T010I5_A7935Dtb_CPQ[0]) != 0 ) || ( GXutil.strcmp(Z7937Dtb_ForFab, T010I5_A7937Dtb_ForFab[0]) != 0 ) || ( Z7938Dtb_Fortie != T010I5_A7938Dtb_Fortie[0] ) || ( Z7939Dtb_ForTmx != T010I5_A7939Dtb_ForTmx[0] ) || ( DecimalUtil.compareTo(Z7940Dtb_ForRb, T010I5_A7940Dtb_ForRb[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z7941Dtb_ForPhx, T010I5_A7941Dtb_ForPhx[0]) != 0 ) || ( DecimalUtil.compareTo(Z7942Dtb_ForPhn, T010I5_A7942Dtb_ForPhn[0]) != 0 ) || ( Z7943Dtb_ForUli != T010I5_A7943Dtb_ForUli[0] ) || ( Z12111Dtb_Nh2o != T010I5_A12111Dtb_Nh2o[0] ) )
         {
            if ( GXutil.strcmp(Z7935Dtb_CPQ, T010I5_A7935Dtb_CPQ[0]) != 0 )
            {
               GXutil.writeLogln("tdt005:[seudo value changed for attri]"+"Dtb_CPQ");
               GXutil.writeLogRaw("Old: ",Z7935Dtb_CPQ);
               GXutil.writeLogRaw("Current: ",T010I5_A7935Dtb_CPQ[0]);
            }
            if ( GXutil.strcmp(Z7937Dtb_ForFab, T010I5_A7937Dtb_ForFab[0]) != 0 )
            {
               GXutil.writeLogln("tdt005:[seudo value changed for attri]"+"Dtb_ForFab");
               GXutil.writeLogRaw("Old: ",Z7937Dtb_ForFab);
               GXutil.writeLogRaw("Current: ",T010I5_A7937Dtb_ForFab[0]);
            }
            if ( Z7938Dtb_Fortie != T010I5_A7938Dtb_Fortie[0] )
            {
               GXutil.writeLogln("tdt005:[seudo value changed for attri]"+"Dtb_Fortie");
               GXutil.writeLogRaw("Old: ",Z7938Dtb_Fortie);
               GXutil.writeLogRaw("Current: ",T010I5_A7938Dtb_Fortie[0]);
            }
            if ( Z7939Dtb_ForTmx != T010I5_A7939Dtb_ForTmx[0] )
            {
               GXutil.writeLogln("tdt005:[seudo value changed for attri]"+"Dtb_ForTmx");
               GXutil.writeLogRaw("Old: ",Z7939Dtb_ForTmx);
               GXutil.writeLogRaw("Current: ",T010I5_A7939Dtb_ForTmx[0]);
            }
            if ( DecimalUtil.compareTo(Z7940Dtb_ForRb, T010I5_A7940Dtb_ForRb[0]) != 0 )
            {
               GXutil.writeLogln("tdt005:[seudo value changed for attri]"+"Dtb_ForRb");
               GXutil.writeLogRaw("Old: ",Z7940Dtb_ForRb);
               GXutil.writeLogRaw("Current: ",T010I5_A7940Dtb_ForRb[0]);
            }
            if ( DecimalUtil.compareTo(Z7941Dtb_ForPhx, T010I5_A7941Dtb_ForPhx[0]) != 0 )
            {
               GXutil.writeLogln("tdt005:[seudo value changed for attri]"+"Dtb_ForPhx");
               GXutil.writeLogRaw("Old: ",Z7941Dtb_ForPhx);
               GXutil.writeLogRaw("Current: ",T010I5_A7941Dtb_ForPhx[0]);
            }
            if ( DecimalUtil.compareTo(Z7942Dtb_ForPhn, T010I5_A7942Dtb_ForPhn[0]) != 0 )
            {
               GXutil.writeLogln("tdt005:[seudo value changed for attri]"+"Dtb_ForPhn");
               GXutil.writeLogRaw("Old: ",Z7942Dtb_ForPhn);
               GXutil.writeLogRaw("Current: ",T010I5_A7942Dtb_ForPhn[0]);
            }
            if ( Z7943Dtb_ForUli != T010I5_A7943Dtb_ForUli[0] )
            {
               GXutil.writeLogln("tdt005:[seudo value changed for attri]"+"Dtb_ForUli");
               GXutil.writeLogRaw("Old: ",Z7943Dtb_ForUli);
               GXutil.writeLogRaw("Current: ",T010I5_A7943Dtb_ForUli[0]);
            }
            if ( Z12111Dtb_Nh2o != T010I5_A12111Dtb_Nh2o[0] )
            {
               GXutil.writeLogln("tdt005:[seudo value changed for attri]"+"Dtb_Nh2o");
               GXutil.writeLogRaw("Old: ",Z12111Dtb_Nh2o);
               GXutil.writeLogRaw("Current: ",T010I5_A12111Dtb_Nh2o[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDT005"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert10I1108( )
   {
      beforeValidate10I1108( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10I1108( ) ;
      }
      if ( AnyError == 0 )
      {
         zm10I1108( 0) ;
         checkOptimisticConcurrency10I1108( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10I1108( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert10I1108( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010I43 */
                  pr_default.execute(41, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl), Boolean.valueOf(n7935Dtb_CPQ), A7935Dtb_CPQ, Boolean.valueOf(n7937Dtb_ForFab), A7937Dtb_ForFab, Boolean.valueOf(n7938Dtb_Fortie), Short.valueOf(A7938Dtb_Fortie), Boolean.valueOf(n7939Dtb_ForTmx), Short.valueOf(A7939Dtb_ForTmx), Boolean.valueOf(n7940Dtb_ForRb), A7940Dtb_ForRb, Boolean.valueOf(n7941Dtb_ForPhx), A7941Dtb_ForPhx, Boolean.valueOf(n7942Dtb_ForPhn), A7942Dtb_ForPhn, Boolean.valueOf(n7943Dtb_ForUli), Short.valueOf(A7943Dtb_ForUli), Boolean.valueOf(n12111Dtb_Nh2o), Short.valueOf(A12111Dtb_Nh2o), A396EmprCod, A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT005");
                  if ( (pr_default.getStatus(41) == 1) )
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
                        processLevel10I1108( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
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
            load10I1108( ) ;
         }
         endLevel10I1108( ) ;
      }
      closeExtendedTableCursors10I1108( ) ;
   }

   public void update10I1108( )
   {
      beforeValidate10I1108( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10I1108( ) ;
      }
      if ( ( nIsMod_1108 != 0 ) || ( nIsDirty_1108 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency10I1108( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm10I1108( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate10I1108( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T010I44 */
                     pr_default.execute(42, new Object[] {Boolean.valueOf(n7935Dtb_CPQ), A7935Dtb_CPQ, Boolean.valueOf(n7937Dtb_ForFab), A7937Dtb_ForFab, Boolean.valueOf(n7938Dtb_Fortie), Short.valueOf(A7938Dtb_Fortie), Boolean.valueOf(n7939Dtb_ForTmx), Short.valueOf(A7939Dtb_ForTmx), Boolean.valueOf(n7940Dtb_ForRb), A7940Dtb_ForRb, Boolean.valueOf(n7941Dtb_ForPhx), A7941Dtb_ForPhx, Boolean.valueOf(n7942Dtb_ForPhn), A7942Dtb_ForPhn, Boolean.valueOf(n7943Dtb_ForUli), Short.valueOf(A7943Dtb_ForUli), Boolean.valueOf(n12111Dtb_Nh2o), Short.valueOf(A12111Dtb_Nh2o), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT005");
                     if ( (pr_default.getStatus(42) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDT005"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate10I1108( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel10I1108( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey10I1108( ) ;
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
            endLevel10I1108( ) ;
         }
      }
      closeExtendedTableCursors10I1108( ) ;
   }

   public void deferredUpdate10I1108( )
   {
   }

   public void delete10I1108( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate10I1108( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10I1108( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls10I1108( ) ;
         afterConfirm10I1108( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete10I1108( ) ;
            if ( AnyError == 0 )
            {
               A7943Dtb_ForUli = O7943Dtb_ForUli ;
               n7943Dtb_ForUli = false ;
               scanStart10I1109( ) ;
               while ( RcdFound1109 != 0 )
               {
                  getByPrimaryKey10I1109( ) ;
                  delete10I1109( ) ;
                  scanNext10I1109( ) ;
                  O7943Dtb_ForUli = A7943Dtb_ForUli ;
                  n7943Dtb_ForUli = false ;
               }
               scanEnd10I1109( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010I45 */
                  pr_default.execute(43, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT005");
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
      }
      sMode1108 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel10I1108( ) ;
      Gx_mode = sMode1108 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls10I1108( )
   {
      standaloneModal10I1108( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A7936Dtb_DPQ ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A7935Dtb_CPQ ;
         GXv_char2[0] = GXt_char1 ;
         new app.ppreqd3(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         tdt005_impl.this.A396EmprCod = GXv_char4[0] ;
         tdt005_impl.this.A7935Dtb_CPQ = GXv_char3[0] ;
         tdt005_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7936Dtb_DPQ = GXt_char1 ;
      }
   }

   public void processNestedLevel10I1109( )
   {
      s7943Dtb_ForUli = O7943Dtb_ForUli ;
      n7943Dtb_ForUli = false ;
      nGXsfl_122_idx = 0 ;
      while ( nGXsfl_122_idx < nRC_GXsfl_122 )
      {
         readRow10I1109( ) ;
         if ( ( nRcdExists_1109 != 0 ) || ( nIsMod_1109 != 0 ) )
         {
            standaloneNotModal10I1109( ) ;
            getKey10I1109( ) ;
            if ( ( nRcdExists_1109 == 0 ) && ( nRcdDeleted_1109 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert10I1109( ) ;
            }
            else
            {
               if ( RcdFound1109 != 0 )
               {
                  if ( ( nRcdDeleted_1109 != 0 ) && ( nRcdExists_1109 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete10I1109( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1109 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update10I1109( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1109 == 0 )
                  {
                     GXCCtl = "DTB_ORDL_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDtb_Ordl_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O7943Dtb_ForUli = A7943Dtb_ForUli ;
            n7943Dtb_ForUli = false ;
         }
         httpContext.changePostValue( edtavnRcdDeleted_1109_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1109, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtb_ForLin_Internalname, GXutil.ltrim( localUtil.ntoc( A7944Dtb_ForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtb_Prdnum_Internalname, GXutil.rtrim( A7945Dtb_Prdnum)) ;
         httpContext.changePostValue( edtDtb_PrdNom_Internalname, GXutil.rtrim( A7946Dtb_PrdNom)) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc)) ;
         httpContext.changePostValue( edtDtb_Forcan_Internalname, GXutil.ltrim( localUtil.ntoc( A7947Dtb_Forcan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtb_clave1_Internalname, GXutil.rtrim( A8477Dtb_clave1)) ;
         httpContext.changePostValue( edtDtb_clave2_Internalname, GXutil.rtrim( A8478Dtb_clave2)) ;
         httpContext.changePostValue( "ZT_"+"Z7944Dtb_ForLin_"+sGXsfl_122_idx, GXutil.ltrim( localUtil.ntoc( Z7944Dtb_ForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7945Dtb_Prdnum_"+sGXsfl_122_idx, GXutil.rtrim( Z7945Dtb_Prdnum)) ;
         httpContext.changePostValue( "ZT_"+"Z7947Dtb_Forcan_"+sGXsfl_122_idx, GXutil.ltrim( localUtil.ntoc( Z7947Dtb_Forcan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8477Dtb_clave1_"+sGXsfl_122_idx, GXutil.rtrim( Z8477Dtb_clave1)) ;
         httpContext.changePostValue( "ZT_"+"Z8478Dtb_clave2_"+sGXsfl_122_idx, GXutil.rtrim( Z8478Dtb_clave2)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_122_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1109_"+sGXsfl_122_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1109, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1109_"+sGXsfl_122_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1109, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1109_"+sGXsfl_122_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1109, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1109 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1109_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1109_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_FORLIN_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_PRDNUM_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_Prdnum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_PRDNOM_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_PrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDDSC_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_FORCAN_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_Forcan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_CLAVE1_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_clave1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTB_CLAVE2_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_clave2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll10I1109( ) ;
      if ( AnyError != 0 )
      {
         O7943Dtb_ForUli = s7943Dtb_ForUli ;
         n7943Dtb_ForUli = false ;
      }
      nRcdExists_1109 = (short)(0) ;
      nIsMod_1109 = (short)(0) ;
      nRcdDeleted_1109 = (short)(0) ;
   }

   public void processLevel10I1108( )
   {
      /* Save parent mode. */
      sMode1108 = Gx_mode ;
      processNestedLevel10I1109( ) ;
      if ( AnyError != 0 )
      {
         O7943Dtb_ForUli = s7943Dtb_ForUli ;
         n7943Dtb_ForUli = false ;
      }
      /* Restore parent mode. */
      Gx_mode = sMode1108 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T010I46 */
      pr_default.execute(44, new Object[] {Boolean.valueOf(n7943Dtb_ForUli), Short.valueOf(A7943Dtb_ForUli), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT005");
   }

   public void endLevel10I1108( )
   {
      pr_default.close(3);
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart10I1108( )
   {
      /* Scan By routine */
      /* Using cursor T010I47 */
      pr_default.execute(45, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      RcdFound1108 = (short)(0) ;
      if ( (pr_default.getStatus(45) != 101) )
      {
         RcdFound1108 = (short)(1) ;
         A7934Dtb_Ordl = T010I47_A7934Dtb_Ordl[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext10I1108( )
   {
      /* Scan next routine */
      pr_default.readNext(45);
      RcdFound1108 = (short)(0) ;
      if ( (pr_default.getStatus(45) != 101) )
      {
         RcdFound1108 = (short)(1) ;
         A7934Dtb_Ordl = T010I47_A7934Dtb_Ordl[0] ;
      }
   }

   public void scanEnd10I1108( )
   {
      pr_default.close(45);
   }

   public void afterConfirm10I1108( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert10I1108( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate10I1108( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete10I1108( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete10I1108( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate10I1108( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes10I1108( )
   {
      edtDtb_Ordl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_Ordl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_Ordl_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDtb_CPQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_CPQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_CPQ_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDtb_DPQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_DPQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_DPQ_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDtb_ForFab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_ForFab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_ForFab_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDtb_Fortie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_Fortie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_Fortie_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDtb_ForTmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_ForTmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_ForTmx_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDtb_ForRb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_ForRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_ForRb_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDtb_ForPhx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_ForPhx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_ForPhx_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDtb_ForPhn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_ForPhn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_ForPhn_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDtb_ForUli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_ForUli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_ForUli_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDtb_Nh2o_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_Nh2o_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_Nh2o_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void zm10I1109( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7945Dtb_Prdnum = T010I3_A7945Dtb_Prdnum[0] ;
            Z7947Dtb_Forcan = T010I3_A7947Dtb_Forcan[0] ;
            Z8477Dtb_clave1 = T010I3_A8477Dtb_clave1[0] ;
            Z8478Dtb_clave2 = T010I3_A8478Dtb_clave2[0] ;
            Z490ForPrdUMe = T010I3_A490ForPrdUMe[0] ;
         }
         else
         {
            Z7945Dtb_Prdnum = A7945Dtb_Prdnum ;
            Z7947Dtb_Forcan = A7947Dtb_Forcan ;
            Z8477Dtb_clave1 = A8477Dtb_clave1 ;
            Z8478Dtb_clave2 = A8478Dtb_clave2 ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z7934Dtb_Ordl = A7934Dtb_Ordl ;
         Z7944Dtb_ForLin = A7944Dtb_ForLin ;
         Z7945Dtb_Prdnum = A7945Dtb_Prdnum ;
         Z7947Dtb_Forcan = A7947Dtb_Forcan ;
         Z8477Dtb_clave1 = A8477Dtb_clave1 ;
         Z8478Dtb_clave2 = A8478Dtb_clave2 ;
         Z396EmprCod = A396EmprCod ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z758ProCod = A758ProCod ;
         Z488ForPrdDsc = A488ForPrdDsc ;
      }
   }

   public void standaloneNotModal10I1109( )
   {
      edtDtb_ForUli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_ForUli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_ForUli_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void standaloneModal10I1109( )
   {
      if ( isIns( )  )
      {
         A7943Dtb_ForUli = (short)(O7943Dtb_ForUli+1) ;
         n7943Dtb_ForUli = false ;
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A7944Dtb_ForLin = A7943Dtb_ForUli ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDtb_ForLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDtb_ForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_ForLin_Enabled), 5, 0), !bGXsfl_122_Refreshing);
      }
      else
      {
         edtDtb_ForLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDtb_ForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_ForLin_Enabled), 5, 0), !bGXsfl_122_Refreshing);
      }
   }

   public void load10I1109( )
   {
      /* Using cursor T010I48 */
      pr_default.execute(46, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl), Short.valueOf(A7944Dtb_ForLin)});
      if ( (pr_default.getStatus(46) != 101) )
      {
         RcdFound1109 = (short)(1) ;
         A7945Dtb_Prdnum = T010I48_A7945Dtb_Prdnum[0] ;
         n7945Dtb_Prdnum = T010I48_n7945Dtb_Prdnum[0] ;
         A488ForPrdDsc = T010I48_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T010I48_n488ForPrdDsc[0] ;
         A7947Dtb_Forcan = T010I48_A7947Dtb_Forcan[0] ;
         n7947Dtb_Forcan = T010I48_n7947Dtb_Forcan[0] ;
         A8477Dtb_clave1 = T010I48_A8477Dtb_clave1[0] ;
         n8477Dtb_clave1 = T010I48_n8477Dtb_clave1[0] ;
         A8478Dtb_clave2 = T010I48_A8478Dtb_clave2[0] ;
         n8478Dtb_clave2 = T010I48_n8478Dtb_clave2[0] ;
         A490ForPrdUMe = T010I48_A490ForPrdUMe[0] ;
         n490ForPrdUMe = T010I48_n490ForPrdUMe[0] ;
         zm10I1109( -17) ;
      }
      pr_default.close(46);
      onLoadActions10I1109( ) ;
   }

   public void onLoadActions10I1109( )
   {
      GXt_char1 = A7946Dtb_PrdNom ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7945Dtb_Prdnum ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt005_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt005_impl.this.A7945Dtb_Prdnum = GXv_char3[0] ;
      tdt005_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7946Dtb_PrdNom = GXt_char1 ;
   }

   public void checkExtendedTable10I1109( )
   {
      nIsDirty_1109 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal10I1109( ) ;
      /* Using cursor T010I4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_122_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T010I4_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T010I4_n488ForPrdDsc[0] ;
      pr_default.close(2);
      nIsDirty_1109 = (short)(1) ;
      GXt_char1 = A7946Dtb_PrdNom ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7945Dtb_Prdnum ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt005_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt005_impl.this.A7945Dtb_Prdnum = GXv_char3[0] ;
      tdt005_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7946Dtb_PrdNom = GXt_char1 ;
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_122_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors10I1109( )
   {
      pr_default.close(2);
   }

   public void enableDisable10I1109( )
   {
   }

   public void gxload_18( String A396EmprCod ,
                          byte A490ForPrdUMe )
   {
      /* Using cursor T010I49 */
      pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(47) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_122_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T010I49_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T010I49_n488ForPrdDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A488ForPrdDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(47) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(47);
   }

   public void getKey10I1109( )
   {
      /* Using cursor T010I50 */
      pr_default.execute(48, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl), Short.valueOf(A7944Dtb_ForLin)});
      if ( (pr_default.getStatus(48) != 101) )
      {
         RcdFound1109 = (short)(1) ;
      }
      else
      {
         RcdFound1109 = (short)(0) ;
      }
      pr_default.close(48);
   }

   public void getByPrimaryKey10I1109( )
   {
      /* Using cursor T010I3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl), Short.valueOf(A7944Dtb_ForLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T010I3_A129BarCod[0] == A129BarCod ) && ( T010I3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T010I3_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T010I3_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T010I3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T010I3_A758ProCod[0], A758ProCod) == 0 ) )
      {
         zm10I1109( 17) ;
         RcdFound1109 = (short)(1) ;
         initializeNonKey10I1109( ) ;
         A7944Dtb_ForLin = T010I3_A7944Dtb_ForLin[0] ;
         A7945Dtb_Prdnum = T010I3_A7945Dtb_Prdnum[0] ;
         n7945Dtb_Prdnum = T010I3_n7945Dtb_Prdnum[0] ;
         A7947Dtb_Forcan = T010I3_A7947Dtb_Forcan[0] ;
         n7947Dtb_Forcan = T010I3_n7947Dtb_Forcan[0] ;
         A8477Dtb_clave1 = T010I3_A8477Dtb_clave1[0] ;
         n8477Dtb_clave1 = T010I3_n8477Dtb_clave1[0] ;
         A8478Dtb_clave2 = T010I3_A8478Dtb_clave2[0] ;
         n8478Dtb_clave2 = T010I3_n8478Dtb_clave2[0] ;
         A490ForPrdUMe = T010I3_A490ForPrdUMe[0] ;
         n490ForPrdUMe = T010I3_n490ForPrdUMe[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z7934Dtb_Ordl = A7934Dtb_Ordl ;
         Z7944Dtb_ForLin = A7944Dtb_ForLin ;
         sMode1109 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal10I1109( ) ;
         load10I1109( ) ;
         Gx_mode = sMode1109 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1109 = (short)(0) ;
         initializeNonKey10I1109( ) ;
         sMode1109 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal10I1109( ) ;
         Gx_mode = sMode1109 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes10I1109( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency10I1109( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T010I2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl), Short.valueOf(A7944Dtb_ForLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDT0051"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z7945Dtb_Prdnum, T010I2_A7945Dtb_Prdnum[0]) != 0 ) || ( DecimalUtil.compareTo(Z7947Dtb_Forcan, T010I2_A7947Dtb_Forcan[0]) != 0 ) || ( GXutil.strcmp(Z8477Dtb_clave1, T010I2_A8477Dtb_clave1[0]) != 0 ) || ( GXutil.strcmp(Z8478Dtb_clave2, T010I2_A8478Dtb_clave2[0]) != 0 ) || ( Z490ForPrdUMe != T010I2_A490ForPrdUMe[0] ) )
         {
            if ( GXutil.strcmp(Z7945Dtb_Prdnum, T010I2_A7945Dtb_Prdnum[0]) != 0 )
            {
               GXutil.writeLogln("tdt005:[seudo value changed for attri]"+"Dtb_Prdnum");
               GXutil.writeLogRaw("Old: ",Z7945Dtb_Prdnum);
               GXutil.writeLogRaw("Current: ",T010I2_A7945Dtb_Prdnum[0]);
            }
            if ( DecimalUtil.compareTo(Z7947Dtb_Forcan, T010I2_A7947Dtb_Forcan[0]) != 0 )
            {
               GXutil.writeLogln("tdt005:[seudo value changed for attri]"+"Dtb_Forcan");
               GXutil.writeLogRaw("Old: ",Z7947Dtb_Forcan);
               GXutil.writeLogRaw("Current: ",T010I2_A7947Dtb_Forcan[0]);
            }
            if ( GXutil.strcmp(Z8477Dtb_clave1, T010I2_A8477Dtb_clave1[0]) != 0 )
            {
               GXutil.writeLogln("tdt005:[seudo value changed for attri]"+"Dtb_clave1");
               GXutil.writeLogRaw("Old: ",Z8477Dtb_clave1);
               GXutil.writeLogRaw("Current: ",T010I2_A8477Dtb_clave1[0]);
            }
            if ( GXutil.strcmp(Z8478Dtb_clave2, T010I2_A8478Dtb_clave2[0]) != 0 )
            {
               GXutil.writeLogln("tdt005:[seudo value changed for attri]"+"Dtb_clave2");
               GXutil.writeLogRaw("Old: ",Z8478Dtb_clave2);
               GXutil.writeLogRaw("Current: ",T010I2_A8478Dtb_clave2[0]);
            }
            if ( Z490ForPrdUMe != T010I2_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("tdt005:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T010I2_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDT0051"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert10I1109( )
   {
      beforeValidate10I1109( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10I1109( ) ;
      }
      if ( AnyError == 0 )
      {
         zm10I1109( 0) ;
         checkOptimisticConcurrency10I1109( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10I1109( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert10I1109( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010I51 */
                  pr_default.execute(49, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl), Short.valueOf(A7944Dtb_ForLin), Boolean.valueOf(n7945Dtb_Prdnum), A7945Dtb_Prdnum, Boolean.valueOf(n7947Dtb_Forcan), A7947Dtb_Forcan, Boolean.valueOf(n8477Dtb_clave1), A8477Dtb_clave1, Boolean.valueOf(n8478Dtb_clave2), A8478Dtb_clave2, A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0051");
                  if ( (pr_default.getStatus(49) == 1) )
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
            load10I1109( ) ;
         }
         endLevel10I1109( ) ;
      }
      closeExtendedTableCursors10I1109( ) ;
   }

   public void update10I1109( )
   {
      beforeValidate10I1109( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10I1109( ) ;
      }
      if ( ( nIsMod_1109 != 0 ) || ( nIsDirty_1109 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency10I1109( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm10I1109( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate10I1109( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T010I52 */
                     pr_default.execute(50, new Object[] {Boolean.valueOf(n7945Dtb_Prdnum), A7945Dtb_Prdnum, Boolean.valueOf(n7947Dtb_Forcan), A7947Dtb_Forcan, Boolean.valueOf(n8477Dtb_clave1), A8477Dtb_clave1, Boolean.valueOf(n8478Dtb_clave2), A8478Dtb_clave2, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl), Short.valueOf(A7944Dtb_ForLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0051");
                     if ( (pr_default.getStatus(50) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDT0051"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate10I1109( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey10I1109( ) ;
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
            endLevel10I1109( ) ;
         }
      }
      closeExtendedTableCursors10I1109( ) ;
   }

   public void deferredUpdate10I1109( )
   {
   }

   public void delete10I1109( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate10I1109( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10I1109( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls10I1109( ) ;
         afterConfirm10I1109( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete10I1109( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T010I53 */
               pr_default.execute(51, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl), Short.valueOf(A7944Dtb_ForLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0051");
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
      sMode1109 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel10I1109( ) ;
      Gx_mode = sMode1109 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls10I1109( )
   {
      standaloneModal10I1109( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A7946Dtb_PrdNom ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A7945Dtb_Prdnum ;
         GXv_char2[0] = GXt_char1 ;
         new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         tdt005_impl.this.A396EmprCod = GXv_char4[0] ;
         tdt005_impl.this.A7945Dtb_Prdnum = GXv_char3[0] ;
         tdt005_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7946Dtb_PrdNom = GXt_char1 ;
         /* Using cursor T010I54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T010I54_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T010I54_n488ForPrdDsc[0] ;
         pr_default.close(52);
      }
   }

   public void endLevel10I1109( )
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

   public void scanStart10I1109( )
   {
      /* Scan By routine */
      /* Using cursor T010I55 */
      pr_default.execute(53, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl)});
      RcdFound1109 = (short)(0) ;
      if ( (pr_default.getStatus(53) != 101) )
      {
         RcdFound1109 = (short)(1) ;
         A7944Dtb_ForLin = T010I55_A7944Dtb_ForLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext10I1109( )
   {
      /* Scan next routine */
      pr_default.readNext(53);
      RcdFound1109 = (short)(0) ;
      if ( (pr_default.getStatus(53) != 101) )
      {
         RcdFound1109 = (short)(1) ;
         A7944Dtb_ForLin = T010I55_A7944Dtb_ForLin[0] ;
      }
   }

   public void scanEnd10I1109( )
   {
      pr_default.close(53);
   }

   public void afterConfirm10I1109( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert10I1109( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate10I1109( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete10I1109( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete10I1109( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate10I1109( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes10I1109( )
   {
      edtDtb_ForLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_ForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_ForLin_Enabled), 5, 0), !bGXsfl_122_Refreshing);
      edtDtb_Prdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_Prdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_Prdnum_Enabled), 5, 0), !bGXsfl_122_Refreshing);
      edtDtb_PrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_PrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_PrdNom_Enabled), 5, 0), !bGXsfl_122_Refreshing);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_122_Refreshing);
      edtForPrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), !bGXsfl_122_Refreshing);
      edtDtb_Forcan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_Forcan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_Forcan_Enabled), 5, 0), !bGXsfl_122_Refreshing);
      edtDtb_clave1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_clave1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_clave1_Enabled), 5, 0), !bGXsfl_122_Refreshing);
      edtDtb_clave2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_clave2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_clave2_Enabled), 5, 0), !bGXsfl_122_Refreshing);
   }

   public void send_integrity_lvl_hashes10I1109( )
   {
   }

   public void send_integrity_lvl_hashes10I1108( )
   {
   }

   public void send_integrity_lvl_hashes10I15( )
   {
   }

   public void subsflControlProps_601108( )
   {
      lblTextblock9_Internalname = "TEXTBLOCK9_"+sGXsfl_60_idx ;
      edtDtb_Ordl_Internalname = "DTB_ORDL_"+sGXsfl_60_idx ;
      lblTextblock10_Internalname = "TEXTBLOCK10_"+sGXsfl_60_idx ;
      edtDtb_CPQ_Internalname = "DTB_CPQ_"+sGXsfl_60_idx ;
      lblTextblock11_Internalname = "TEXTBLOCK11_"+sGXsfl_60_idx ;
      edtDtb_DPQ_Internalname = "DTB_DPQ_"+sGXsfl_60_idx ;
      lblTextblock12_Internalname = "TEXTBLOCK12_"+sGXsfl_60_idx ;
      edtDtb_ForFab_Internalname = "DTB_FORFAB_"+sGXsfl_60_idx ;
      lblTextblock13_Internalname = "TEXTBLOCK13_"+sGXsfl_60_idx ;
      edtDtb_Fortie_Internalname = "DTB_FORTIE_"+sGXsfl_60_idx ;
      lblTextblock14_Internalname = "TEXTBLOCK14_"+sGXsfl_60_idx ;
      edtDtb_ForTmx_Internalname = "DTB_FORTMX_"+sGXsfl_60_idx ;
      lblTextblock15_Internalname = "TEXTBLOCK15_"+sGXsfl_60_idx ;
      edtDtb_ForRb_Internalname = "DTB_FORRB_"+sGXsfl_60_idx ;
      lblTextblock16_Internalname = "TEXTBLOCK16_"+sGXsfl_60_idx ;
      edtDtb_ForPhx_Internalname = "DTB_FORPHX_"+sGXsfl_60_idx ;
      lblTextblock17_Internalname = "TEXTBLOCK17_"+sGXsfl_60_idx ;
      edtDtb_ForPhn_Internalname = "DTB_FORPHN_"+sGXsfl_60_idx ;
      lblTextblock18_Internalname = "TEXTBLOCK18_"+sGXsfl_60_idx ;
      edtDtb_ForUli_Internalname = "DTB_FORULI_"+sGXsfl_60_idx ;
      lblTextblock19_Internalname = "TEXTBLOCK19_"+sGXsfl_60_idx ;
      edtDtb_Nh2o_Internalname = "DTB_NH2O_"+sGXsfl_60_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_60_idx ;
   }

   public void subsflControlProps_fel_601108( )
   {
      lblTextblock9_Internalname = "TEXTBLOCK9_"+sGXsfl_60_fel_idx ;
      edtDtb_Ordl_Internalname = "DTB_ORDL_"+sGXsfl_60_fel_idx ;
      lblTextblock10_Internalname = "TEXTBLOCK10_"+sGXsfl_60_fel_idx ;
      edtDtb_CPQ_Internalname = "DTB_CPQ_"+sGXsfl_60_fel_idx ;
      lblTextblock11_Internalname = "TEXTBLOCK11_"+sGXsfl_60_fel_idx ;
      edtDtb_DPQ_Internalname = "DTB_DPQ_"+sGXsfl_60_fel_idx ;
      lblTextblock12_Internalname = "TEXTBLOCK12_"+sGXsfl_60_fel_idx ;
      edtDtb_ForFab_Internalname = "DTB_FORFAB_"+sGXsfl_60_fel_idx ;
      lblTextblock13_Internalname = "TEXTBLOCK13_"+sGXsfl_60_fel_idx ;
      edtDtb_Fortie_Internalname = "DTB_FORTIE_"+sGXsfl_60_fel_idx ;
      lblTextblock14_Internalname = "TEXTBLOCK14_"+sGXsfl_60_fel_idx ;
      edtDtb_ForTmx_Internalname = "DTB_FORTMX_"+sGXsfl_60_fel_idx ;
      lblTextblock15_Internalname = "TEXTBLOCK15_"+sGXsfl_60_fel_idx ;
      edtDtb_ForRb_Internalname = "DTB_FORRB_"+sGXsfl_60_fel_idx ;
      lblTextblock16_Internalname = "TEXTBLOCK16_"+sGXsfl_60_fel_idx ;
      edtDtb_ForPhx_Internalname = "DTB_FORPHX_"+sGXsfl_60_fel_idx ;
      lblTextblock17_Internalname = "TEXTBLOCK17_"+sGXsfl_60_fel_idx ;
      edtDtb_ForPhn_Internalname = "DTB_FORPHN_"+sGXsfl_60_fel_idx ;
      lblTextblock18_Internalname = "TEXTBLOCK18_"+sGXsfl_60_fel_idx ;
      edtDtb_ForUli_Internalname = "DTB_FORULI_"+sGXsfl_60_fel_idx ;
      lblTextblock19_Internalname = "TEXTBLOCK19_"+sGXsfl_60_fel_idx ;
      edtDtb_Nh2o_Internalname = "DTB_NH2O_"+sGXsfl_60_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_60_fel_idx ;
   }

   public void addRow10I1108( )
   {
      nRC_GXsfl_122 = 0 ;
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601108( ) ;
      sendRow10I1108( ) ;
   }

   public void sendRow10I1108( )
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
         if ( ((int)((nGXsfl_60_idx) % (2))) == 0 )
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
      /* Start of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_60_idx+"\">") ;
      }
      if ( GRID1_IsPaging == 0 )
      {
         GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_60_idx ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable3_Internalname+"_"+sGXsfl_60_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock9_Internalname,httpContext.getMessage( "Orden PQ", ""),"","",lblTextblock9_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1108_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtb_Ordl_Internalname,GXutil.ltrim( localUtil.ntoc( A7934Dtb_Ordl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7934Dtb_Ordl), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtb_Ordl_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDtb_Ordl_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock10_Internalname,httpContext.getMessage( "PQ", ""),"","",lblTextblock10_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1108_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtb_CPQ_Internalname,GXutil.rtrim( A7935Dtb_CPQ),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtb_CPQ_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDtb_CPQ_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock11_Internalname,httpContext.getMessage( "Descripcion", ""),"","",lblTextblock11_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtb_DPQ_Internalname,GXutil.rtrim( A7936Dtb_DPQ),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtb_DPQ_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDtb_DPQ_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(80),"chr",Integer.valueOf(1),"row",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock12_Internalname,httpContext.getMessage( "Tipo L T M", ""),"","",lblTextblock12_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1108_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtb_ForFab_Internalname,GXutil.rtrim( A7937Dtb_ForFab),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtb_ForFab_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDtb_ForFab_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock13_Internalname,httpContext.getMessage( "Tiempo", ""),"","",lblTextblock13_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1108_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtb_Fortie_Internalname,GXutil.ltrim( localUtil.ntoc( A7938Dtb_Fortie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDtb_Fortie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7938Dtb_Fortie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7938Dtb_Fortie), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtb_Fortie_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDtb_Fortie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock14_Internalname,httpContext.getMessage( "TºC", ""),"","",lblTextblock14_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1108_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtb_ForTmx_Internalname,GXutil.ltrim( localUtil.ntoc( A7939Dtb_ForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDtb_ForTmx_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7939Dtb_ForTmx), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7939Dtb_ForTmx), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,93);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtb_ForTmx_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDtb_ForTmx_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock15_Internalname,httpContext.getMessage( "Rb", ""),"","",lblTextblock15_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1108_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtb_ForRb_Internalname,GXutil.ltrim( localUtil.ntoc( A7940Dtb_ForRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDtb_ForRb_Enabled!=0) ? localUtil.format( A7940Dtb_ForRb, "ZZZ9.99") : localUtil.format( A7940Dtb_ForRb, "ZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,98);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtb_ForRb_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDtb_ForRb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(7),"chr",Integer.valueOf(1),"row",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock16_Internalname,httpContext.getMessage( "PH Mx", ""),"","",lblTextblock16_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1108_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtb_ForPhx_Internalname,GXutil.ltrim( localUtil.ntoc( A7941Dtb_ForPhx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDtb_ForPhx_Enabled!=0) ? localUtil.format( A7941Dtb_ForPhx, "Z9.99") : localUtil.format( A7941Dtb_ForPhx, "Z9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,103);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtb_ForPhx_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDtb_ForPhx_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(5),"chr",Integer.valueOf(1),"row",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock17_Internalname,httpContext.getMessage( "PH Mn", ""),"","",lblTextblock17_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1108_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 108,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtb_ForPhn_Internalname,GXutil.ltrim( localUtil.ntoc( A7942Dtb_ForPhn, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDtb_ForPhn_Enabled!=0) ? localUtil.format( A7942Dtb_ForPhn, "Z9.99") : localUtil.format( A7942Dtb_ForPhn, "Z9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,108);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtb_ForPhn_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDtb_ForPhn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(5),"chr",Integer.valueOf(1),"row",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock18_Internalname,httpContext.getMessage( "Ult Linea", ""),"","",lblTextblock18_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtb_ForUli_Internalname,GXutil.ltrim( localUtil.ntoc( A7943Dtb_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDtb_ForUli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7943Dtb_ForUli), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7943Dtb_ForUli), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtb_ForUli_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDtb_ForUli_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock19_Internalname,httpContext.getMessage( "N Banyos", ""),"","",lblTextblock19_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1108_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 118,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtb_Nh2o_Internalname,GXutil.ltrim( localUtil.ntoc( A12111Dtb_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDtb_Nh2o_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12111Dtb_Nh2o), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12111Dtb_Nh2o), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,118);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtb_Nh2o_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDtb_Nh2o_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /*  Child Grid Control  */
      Grid1Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Grid2Container"});
      if ( isAjaxCallMode( ) )
      {
         Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Grid2Container.Clear();
      }
      startgridcontrol122( ) ;
      nGXsfl_122_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1109 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1109 = (short)(1) ;
            scanStart10I1109( ) ;
            while ( RcdFound1109 != 0 )
            {
               init_level_properties1109( ) ;
               getByPrimaryKey10I1109( ) ;
               addRow10I1109( ) ;
               scanNext10I1109( ) ;
            }
            scanEnd10I1109( ) ;
            nBlankRcdCount1109 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B7943Dtb_ForUli = A7943Dtb_ForUli ;
         n7943Dtb_ForUli = false ;
         B7933Dtb_UOrd = A7933Dtb_UOrd ;
         n7933Dtb_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
         standaloneNotModal10I1109( ) ;
         standaloneModal10I1109( ) ;
         sMode1109 = Gx_mode ;
         while ( nGXsfl_122_idx < nRC_GXsfl_122 )
         {
            bGXsfl_122_Refreshing = true ;
            readRow10I1109( ) ;
            edtavnRcdDeleted_1109_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1109_"+sGXsfl_122_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1109_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1109_Enabled), 5, 0), !bGXsfl_122_Refreshing);
            edtDtb_ForLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_FORLIN_"+sGXsfl_122_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtb_ForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_ForLin_Enabled), 5, 0), !bGXsfl_122_Refreshing);
            edtDtb_Prdnum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_PRDNUM_"+sGXsfl_122_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtb_Prdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_Prdnum_Enabled), 5, 0), !bGXsfl_122_Refreshing);
            edtDtb_PrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_PRDNOM_"+sGXsfl_122_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtb_PrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_PrdNom_Enabled), 5, 0), !bGXsfl_122_Refreshing);
            edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_122_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_122_Refreshing);
            edtForPrdDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDDSC_"+sGXsfl_122_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), !bGXsfl_122_Refreshing);
            edtDtb_Forcan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_FORCAN_"+sGXsfl_122_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtb_Forcan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_Forcan_Enabled), 5, 0), !bGXsfl_122_Refreshing);
            edtDtb_clave1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_CLAVE1_"+sGXsfl_122_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtb_clave1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_clave1_Enabled), 5, 0), !bGXsfl_122_Refreshing);
            edtDtb_clave2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_CLAVE2_"+sGXsfl_122_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtb_clave2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_clave2_Enabled), 5, 0), !bGXsfl_122_Refreshing);
            if ( ( nRcdExists_1109 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal10I1109( ) ;
            }
            sendRow10I1109( ) ;
            bGXsfl_122_Refreshing = false ;
         }
         Gx_mode = sMode1109 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A7943Dtb_ForUli = B7943Dtb_ForUli ;
         n7943Dtb_ForUli = false ;
         A7933Dtb_UOrd = B7933Dtb_UOrd ;
         n7933Dtb_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1109 = (short)(5) ;
         nRcdExists_1109 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart10I1109( ) ;
            while ( RcdFound1109 != 0 )
            {
               sGXsfl_122_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_122_idx+1), 4, 0), (short)(4), "0") + sGXsfl_60_idx ;
               subsflControlProps_1221109( ) ;
               init_level_properties1109( ) ;
               standaloneNotModal10I1109( ) ;
               getByPrimaryKey10I1109( ) ;
               standaloneModal10I1109( ) ;
               addRow10I1109( ) ;
               scanNext10I1109( ) ;
            }
            scanEnd10I1109( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1109 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_122_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_122_idx+1), 4, 0), (short)(4), "0") + sGXsfl_60_idx ;
      subsflControlProps_1221109( ) ;
      initAll10I1109( ) ;
      init_level_properties1109( ) ;
      B7943Dtb_ForUli = A7943Dtb_ForUli ;
      n7943Dtb_ForUli = false ;
      B7933Dtb_UOrd = A7933Dtb_UOrd ;
      n7933Dtb_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
      nRcdExists_1109 = (short)(0) ;
      nIsMod_1109 = (short)(0) ;
      nRcdDeleted_1109 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 60 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_60_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1109 = (short)(nBlankRcdUsr1109+nBlankRcdCount1109) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1109 > 0 )
      {
         standaloneNotModal10I1109( ) ;
         standaloneModal10I1109( ) ;
         addRow10I1109( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtDtb_ForLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1109 = (short)(nBlankRcdCount1109-1) ;
      }
      Gx_mode = sMode1109 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A7943Dtb_ForUli = B7943Dtb_ForUli ;
      n7943Dtb_ForUli = false ;
      A7933Dtb_UOrd = B7933Dtb_UOrd ;
      n7933Dtb_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_60_idx, Grid2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid1Row.AddGrid("Grid2", Grid2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_60_idx, Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_60_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      /* End of table */
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes10I1108( ) ;
      GXCCtl = "Z7934Dtb_Ordl_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7934Dtb_Ordl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7935Dtb_CPQ_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7935Dtb_CPQ));
      GXCCtl = "Z7937Dtb_ForFab_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7937Dtb_ForFab));
      GXCCtl = "Z7938Dtb_Fortie_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7938Dtb_Fortie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7939Dtb_ForTmx_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7939Dtb_ForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7940Dtb_ForRb_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7940Dtb_ForRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7941Dtb_ForPhx_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7941Dtb_ForPhx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7942Dtb_ForPhn_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7942Dtb_ForPhn, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7943Dtb_ForUli_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7943Dtb_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12111Dtb_Nh2o_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12111Dtb_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O7943Dtb_ForUli_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O7943Dtb_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_122_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_122_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1108_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1108, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1108_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1108, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1108_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1108, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vGXBSCREEN_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTB_ORDL_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_Ordl_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTB_CPQ_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_CPQ_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTB_DPQ_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_DPQ_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTB_FORFAB_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForFab_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTB_FORTIE_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_Fortie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTB_FORTMX_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForTmx_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTB_FORRB_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForRb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTB_FORPHX_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForPhx_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTB_FORPHN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForPhn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTB_FORULI_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForUli_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTB_NH2O_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_Nh2o_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_60_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow10I1108( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601108( ) ;
      edtDtb_Ordl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_ORDL_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtb_CPQ_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_CPQ_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtb_DPQ_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_DPQ_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtb_ForFab_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_FORFAB_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtb_Fortie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_FORTIE_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtb_ForTmx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_FORTMX_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtb_ForRb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_FORRB_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtb_ForPhx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_FORPHX_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtb_ForPhn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_FORPHN_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtb_ForUli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_FORULI_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtb_Nh2o_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_NH2O_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDtb_Ordl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDtb_Ordl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DTB_ORDL_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDtb_Ordl_Internalname ;
         wbErr = true ;
         A7934Dtb_Ordl = (short)(0) ;
      }
      else
      {
         A7934Dtb_Ordl = (short)(localUtil.ctol( httpContext.cgiGet( edtDtb_Ordl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A7935Dtb_CPQ = httpContext.cgiGet( edtDtb_CPQ_Internalname) ;
      n7935Dtb_CPQ = false ;
      A7936Dtb_DPQ = httpContext.cgiGet( edtDtb_DPQ_Internalname) ;
      A7937Dtb_ForFab = httpContext.cgiGet( edtDtb_ForFab_Internalname) ;
      n7937Dtb_ForFab = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDtb_Fortie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDtb_Fortie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DTB_FORTIE_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDtb_Fortie_Internalname ;
         wbErr = true ;
         A7938Dtb_Fortie = (short)(0) ;
         n7938Dtb_Fortie = false ;
      }
      else
      {
         A7938Dtb_Fortie = (short)(localUtil.ctol( httpContext.cgiGet( edtDtb_Fortie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7938Dtb_Fortie = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDtb_ForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDtb_ForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DTB_FORTMX_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDtb_ForTmx_Internalname ;
         wbErr = true ;
         A7939Dtb_ForTmx = (short)(0) ;
         n7939Dtb_ForTmx = false ;
      }
      else
      {
         A7939Dtb_ForTmx = (short)(localUtil.ctol( httpContext.cgiGet( edtDtb_ForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7939Dtb_ForTmx = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDtb_ForRb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDtb_ForRb_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
      {
         GXCCtl = "DTB_FORRB_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDtb_ForRb_Internalname ;
         wbErr = true ;
         A7940Dtb_ForRb = DecimalUtil.ZERO ;
         n7940Dtb_ForRb = false ;
      }
      else
      {
         A7940Dtb_ForRb = localUtil.ctond( httpContext.cgiGet( edtDtb_ForRb_Internalname)) ;
         n7940Dtb_ForRb = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDtb_ForPhx_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDtb_ForPhx_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
      {
         GXCCtl = "DTB_FORPHX_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDtb_ForPhx_Internalname ;
         wbErr = true ;
         A7941Dtb_ForPhx = DecimalUtil.ZERO ;
         n7941Dtb_ForPhx = false ;
      }
      else
      {
         A7941Dtb_ForPhx = localUtil.ctond( httpContext.cgiGet( edtDtb_ForPhx_Internalname)) ;
         n7941Dtb_ForPhx = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDtb_ForPhn_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDtb_ForPhn_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
      {
         GXCCtl = "DTB_FORPHN_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDtb_ForPhn_Internalname ;
         wbErr = true ;
         A7942Dtb_ForPhn = DecimalUtil.ZERO ;
         n7942Dtb_ForPhn = false ;
      }
      else
      {
         A7942Dtb_ForPhn = localUtil.ctond( httpContext.cgiGet( edtDtb_ForPhn_Internalname)) ;
         n7942Dtb_ForPhn = false ;
      }
      A7943Dtb_ForUli = (short)(localUtil.ctol( httpContext.cgiGet( edtDtb_ForUli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n7943Dtb_ForUli = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDtb_Nh2o_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDtb_Nh2o_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DTB_NH2O_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDtb_Nh2o_Internalname ;
         wbErr = true ;
         A12111Dtb_Nh2o = (short)(0) ;
         n12111Dtb_Nh2o = false ;
      }
      else
      {
         A12111Dtb_Nh2o = (short)(localUtil.ctol( httpContext.cgiGet( edtDtb_Nh2o_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12111Dtb_Nh2o = false ;
      }
      GXCCtl = "Z7934Dtb_Ordl_" + sGXsfl_60_idx ;
      Z7934Dtb_Ordl = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7935Dtb_CPQ_" + sGXsfl_60_idx ;
      Z7935Dtb_CPQ = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7937Dtb_ForFab_" + sGXsfl_60_idx ;
      Z7937Dtb_ForFab = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7938Dtb_Fortie_" + sGXsfl_60_idx ;
      Z7938Dtb_Fortie = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7939Dtb_ForTmx_" + sGXsfl_60_idx ;
      Z7939Dtb_ForTmx = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7940Dtb_ForRb_" + sGXsfl_60_idx ;
      Z7940Dtb_ForRb = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7941Dtb_ForPhx_" + sGXsfl_60_idx ;
      Z7941Dtb_ForPhx = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7942Dtb_ForPhn_" + sGXsfl_60_idx ;
      Z7942Dtb_ForPhn = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7943Dtb_ForUli_" + sGXsfl_60_idx ;
      Z7943Dtb_ForUli = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12111Dtb_Nh2o_" + sGXsfl_60_idx ;
      Z12111Dtb_Nh2o = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O7943Dtb_ForUli_" + sGXsfl_60_idx ;
      O7943Dtb_ForUli = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_122_" + sGXsfl_60_idx ;
      nRC_GXsfl_122 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1108_" + sGXsfl_60_idx ;
      nRcdDeleted_1108 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1108_" + sGXsfl_60_idx ;
      nRcdExists_1108 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1108_" + sGXsfl_60_idx ;
      nIsMod_1108 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "vGXBSCREEN_" + sGXsfl_60_idx ;
      Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_122_" + sGXsfl_60_idx ;
      nRC_GXsfl_122 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_1221109( )
   {
      edtavnRcdDeleted_1109_Internalname = "vNRCDDELETED_1109_"+sGXsfl_122_idx ;
      edtDtb_ForLin_Internalname = "DTB_FORLIN_"+sGXsfl_122_idx ;
      edtDtb_Prdnum_Internalname = "DTB_PRDNUM_"+sGXsfl_122_idx ;
      edtDtb_PrdNom_Internalname = "DTB_PRDNOM_"+sGXsfl_122_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_122_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_122_idx ;
      edtDtb_Forcan_Internalname = "DTB_FORCAN_"+sGXsfl_122_idx ;
      edtDtb_clave1_Internalname = "DTB_CLAVE1_"+sGXsfl_122_idx ;
      edtDtb_clave2_Internalname = "DTB_CLAVE2_"+sGXsfl_122_idx ;
   }

   public void subsflControlProps_fel_1221109( )
   {
      edtavnRcdDeleted_1109_Internalname = "vNRCDDELETED_1109_"+sGXsfl_122_fel_idx ;
      edtDtb_ForLin_Internalname = "DTB_FORLIN_"+sGXsfl_122_fel_idx ;
      edtDtb_Prdnum_Internalname = "DTB_PRDNUM_"+sGXsfl_122_fel_idx ;
      edtDtb_PrdNom_Internalname = "DTB_PRDNOM_"+sGXsfl_122_fel_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_122_fel_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_122_fel_idx ;
      edtDtb_Forcan_Internalname = "DTB_FORCAN_"+sGXsfl_122_fel_idx ;
      edtDtb_clave1_Internalname = "DTB_CLAVE1_"+sGXsfl_122_fel_idx ;
      edtDtb_clave2_Internalname = "DTB_CLAVE2_"+sGXsfl_122_fel_idx ;
   }

   public void addRow10I1109( )
   {
      nGXsfl_122_idx = (int)(nGXsfl_122_idx+1) ;
      sGXsfl_122_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_122_idx), 4, 0), (short)(4), "0") + sGXsfl_60_idx ;
      subsflControlProps_1221109( ) ;
      sendRow10I1109( ) ;
   }

   public void sendRow10I1109( )
   {
      Grid2Row = GXWebRow.GetNew(context) ;
      if ( subGrid2_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         subGrid2_Backcolor = subGrid2_Allbackcolor ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Uniform" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
         subGrid2_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid2_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_122_idx) % (2))) == 0 )
         {
            subGrid2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Even" ;
            }
         }
         else
         {
            subGrid2_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1109_" + sGXsfl_122_idx + "',1);gx.fn.setControlValue('nIsMod_1108_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 123,'',false,'" + sGXsfl_122_idx + "',122)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1109_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1109, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1109_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1109), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1109), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,123);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1109_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1109_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(122),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1109_" + sGXsfl_122_idx + "',1);gx.fn.setControlValue('nIsMod_1108_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 124,'',false,'" + sGXsfl_122_idx + "',122)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtb_ForLin_Internalname,GXutil.ltrim( localUtil.ntoc( A7944Dtb_ForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7944Dtb_ForLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,124);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtb_ForLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDtb_ForLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(122),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1109_" + sGXsfl_122_idx + "',1);gx.fn.setControlValue('nIsMod_1108_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 125,'',false,'" + sGXsfl_122_idx + "',122)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtb_Prdnum_Internalname,GXutil.rtrim( A7945Dtb_Prdnum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,125);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtb_Prdnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDtb_Prdnum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(122),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtb_PrdNom_Internalname,GXutil.rtrim( A7946Dtb_PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtb_PrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDtb_PrdNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(122),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1109_" + sGXsfl_122_idx + "',1);gx.fn.setControlValue('nIsMod_1108_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 127,'',false,'" + sGXsfl_122_idx + "',122)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForPrdUMe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9") : localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,127);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForPrdUMe_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(122),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdDsc_Internalname,GXutil.rtrim( A488ForPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForPrdDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(122),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1109_" + sGXsfl_122_idx + "',1);gx.fn.setControlValue('nIsMod_1108_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 129,'',false,'" + sGXsfl_122_idx + "',122)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtb_Forcan_Internalname,GXutil.ltrim( localUtil.ntoc( A7947Dtb_Forcan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDtb_Forcan_Enabled!=0) ? localUtil.format( A7947Dtb_Forcan, "ZZZZZ9.99999") : localUtil.format( A7947Dtb_Forcan, "ZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,129);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtb_Forcan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDtb_Forcan_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(122),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1109_" + sGXsfl_122_idx + "',1);gx.fn.setControlValue('nIsMod_1108_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 130,'',false,'" + sGXsfl_122_idx + "',122)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtb_clave1_Internalname,GXutil.rtrim( A8477Dtb_clave1),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,130);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtb_clave1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDtb_clave1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(122),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1109_" + sGXsfl_122_idx + "',1);gx.fn.setControlValue('nIsMod_1108_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 131,'',false,'" + sGXsfl_122_idx + "',122)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtb_clave2_Internalname,GXutil.rtrim( A8478Dtb_clave2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtb_clave2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDtb_clave2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(122),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashes10I1109( ) ;
      GXCCtl = "Z7944Dtb_ForLin_" + sGXsfl_122_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7944Dtb_ForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7945Dtb_Prdnum_" + sGXsfl_122_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7945Dtb_Prdnum));
      GXCCtl = "Z7947Dtb_Forcan_" + sGXsfl_122_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7947Dtb_Forcan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8477Dtb_clave1_" + sGXsfl_122_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8477Dtb_clave1));
      GXCCtl = "Z8478Dtb_clave2_" + sGXsfl_122_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8478Dtb_clave2));
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_122_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1109_" + sGXsfl_122_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1109, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1109_" + sGXsfl_122_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1109, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1109_" + sGXsfl_122_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1109, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1109_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1109_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTB_FORLIN_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTB_PRDNUM_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_Prdnum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTB_PRDNOM_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_PrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUME_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDDSC_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTB_FORCAN_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_Forcan_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTB_CLAVE1_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_clave1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTB_CLAVE2_"+sGXsfl_122_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_clave2_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRow10I1109( )
   {
      nGXsfl_122_idx = (int)(nGXsfl_122_idx+1) ;
      sGXsfl_122_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_122_idx), 4, 0), (short)(4), "0") + sGXsfl_60_idx ;
      subsflControlProps_1221109( ) ;
      edtavnRcdDeleted_1109_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1109_"+sGXsfl_122_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtb_ForLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_FORLIN_"+sGXsfl_122_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtb_Prdnum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_PRDNUM_"+sGXsfl_122_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtb_PrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_PRDNOM_"+sGXsfl_122_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_122_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDDSC_"+sGXsfl_122_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtb_Forcan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_FORCAN_"+sGXsfl_122_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtb_clave1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_CLAVE1_"+sGXsfl_122_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtb_clave2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTB_CLAVE2_"+sGXsfl_122_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1109_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1109_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1109");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1109_Internalname ;
         wbErr = true ;
         nRcdDeleted_1109 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1109 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1109_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDtb_ForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDtb_ForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DTB_FORLIN_" + sGXsfl_122_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDtb_ForLin_Internalname ;
         wbErr = true ;
         A7944Dtb_ForLin = (short)(0) ;
      }
      else
      {
         A7944Dtb_ForLin = (short)(localUtil.ctol( httpContext.cgiGet( edtDtb_ForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A7945Dtb_Prdnum = httpContext.cgiGet( edtDtb_Prdnum_Internalname) ;
      n7945Dtb_Prdnum = false ;
      A7946Dtb_PrdNom = httpContext.cgiGet( edtDtb_PrdNom_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_122_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         wbErr = true ;
         A490ForPrdUMe = (byte)(0) ;
         n490ForPrdUMe = false ;
      }
      else
      {
         A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n490ForPrdUMe = false ;
      }
      A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
      n488ForPrdDsc = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDtb_Forcan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDtb_Forcan_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "DTB_FORCAN_" + sGXsfl_122_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDtb_Forcan_Internalname ;
         wbErr = true ;
         A7947Dtb_Forcan = DecimalUtil.ZERO ;
         n7947Dtb_Forcan = false ;
      }
      else
      {
         A7947Dtb_Forcan = localUtil.ctond( httpContext.cgiGet( edtDtb_Forcan_Internalname)) ;
         n7947Dtb_Forcan = false ;
      }
      A8477Dtb_clave1 = httpContext.cgiGet( edtDtb_clave1_Internalname) ;
      n8477Dtb_clave1 = false ;
      A8478Dtb_clave2 = httpContext.cgiGet( edtDtb_clave2_Internalname) ;
      n8478Dtb_clave2 = false ;
      GXCCtl = "Z7944Dtb_ForLin_" + sGXsfl_122_idx ;
      Z7944Dtb_ForLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7945Dtb_Prdnum_" + sGXsfl_122_idx ;
      Z7945Dtb_Prdnum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7947Dtb_Forcan_" + sGXsfl_122_idx ;
      Z7947Dtb_Forcan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8477Dtb_clave1_" + sGXsfl_122_idx ;
      Z8477Dtb_clave1 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8478Dtb_clave2_" + sGXsfl_122_idx ;
      Z8478Dtb_clave2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_122_idx ;
      Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1109_" + sGXsfl_122_idx ;
      nRcdDeleted_1109 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1109_" + sGXsfl_122_idx ;
      nRcdExists_1109 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1109_" + sGXsfl_122_idx ;
      nIsMod_1109 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtDtb_ForLin_Enabled = edtDtb_ForLin_Enabled ;
      defedtDtb_ForUli_Enabled = edtDtb_ForUli_Enabled ;
      defedtDtb_Ordl_Enabled = edtDtb_Ordl_Enabled ;
   }

   public void confirmValues10I0( )
   {
      nGXsfl_60_idx = 0 ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601108( ) ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_601108( ) ;
         httpContext.changePostValue( "Z7934Dtb_Ordl_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z7934Dtb_Ordl_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7934Dtb_Ordl_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z7935Dtb_CPQ_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z7935Dtb_CPQ_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7935Dtb_CPQ_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z7937Dtb_ForFab_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z7937Dtb_ForFab_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7937Dtb_ForFab_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z7938Dtb_Fortie_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z7938Dtb_Fortie_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7938Dtb_Fortie_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z7939Dtb_ForTmx_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z7939Dtb_ForTmx_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7939Dtb_ForTmx_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z7940Dtb_ForRb_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z7940Dtb_ForRb_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7940Dtb_ForRb_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z7941Dtb_ForPhx_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z7941Dtb_ForPhx_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7941Dtb_ForPhx_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z7942Dtb_ForPhn_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z7942Dtb_ForPhn_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7942Dtb_ForPhn_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z7943Dtb_ForUli_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z7943Dtb_ForUli_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7943Dtb_ForUli_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z12111Dtb_Nh2o_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z12111Dtb_Nh2o_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12111Dtb_Nh2o_"+sGXsfl_60_idx) ;
      }
      nGXsfl_122_idx = 0 ;
      sGXsfl_122_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_122_idx), 4, 0), (short)(4), "0") + sGXsfl_60_idx ;
      subsflControlProps_1221109( ) ;
      while ( nGXsfl_122_idx < nRC_GXsfl_122 )
      {
         nGXsfl_122_idx = (int)(nGXsfl_122_idx+1) ;
         sGXsfl_122_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_122_idx), 4, 0), (short)(4), "0") + sGXsfl_60_idx ;
         subsflControlProps_1221109( ) ;
         httpContext.changePostValue( "Z7944Dtb_ForLin_"+sGXsfl_122_idx, httpContext.cgiGet( "ZT_"+"Z7944Dtb_ForLin_"+sGXsfl_122_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7944Dtb_ForLin_"+sGXsfl_122_idx) ;
         httpContext.changePostValue( "Z7945Dtb_Prdnum_"+sGXsfl_122_idx, httpContext.cgiGet( "ZT_"+"Z7945Dtb_Prdnum_"+sGXsfl_122_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7945Dtb_Prdnum_"+sGXsfl_122_idx) ;
         httpContext.changePostValue( "Z7947Dtb_Forcan_"+sGXsfl_122_idx, httpContext.cgiGet( "ZT_"+"Z7947Dtb_Forcan_"+sGXsfl_122_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7947Dtb_Forcan_"+sGXsfl_122_idx) ;
         httpContext.changePostValue( "Z8477Dtb_clave1_"+sGXsfl_122_idx, httpContext.cgiGet( "ZT_"+"Z8477Dtb_clave1_"+sGXsfl_122_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8477Dtb_clave1_"+sGXsfl_122_idx) ;
         httpContext.changePostValue( "Z8478Dtb_clave2_"+sGXsfl_122_idx, httpContext.cgiGet( "ZT_"+"Z8478Dtb_clave2_"+sGXsfl_122_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8478Dtb_clave2_"+sGXsfl_122_idx) ;
         httpContext.changePostValue( "Z490ForPrdUMe_"+sGXsfl_122_idx, httpContext.cgiGet( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_122_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_122_idx) ;
      }
      httpContext.changePostValue( "O7943Dtb_ForUli", httpContext.cgiGet( "T7943Dtb_ForUli")) ;
      httpContext.deletePostValue( "T7943Dtb_ForUli") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdt005", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z194BarOrdLin", GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7933Dtb_UOrd", GXutil.ltrim( localUtil.ntoc( Z7933Dtb_UOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O7933Dtb_UOrd", GXutil.ltrim( localUtil.ntoc( O7933Dtb_UOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_60", GXutil.ltrim( localUtil.ntoc( nGXsfl_60_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tdt005", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin"})  ;
   }

   public String getPgmname( )
   {
      return "TDT005" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TABLA BARFAS-PQUIMICO", "") ;
   }

   public void initializeNonKey10I15( )
   {
      A7933Dtb_UOrd = (short)(0) ;
      n7933Dtb_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
      O7933Dtb_UOrd = A7933Dtb_UOrd ;
      n7933Dtb_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
      Z7933Dtb_UOrd = (short)(0) ;
   }

   public void initAll10I15( )
   {
      initializeNonKey10I15( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey10I1108( )
   {
      A7936Dtb_DPQ = "" ;
      A7935Dtb_CPQ = "" ;
      n7935Dtb_CPQ = false ;
      A7937Dtb_ForFab = "" ;
      n7937Dtb_ForFab = false ;
      A7938Dtb_Fortie = (short)(0) ;
      n7938Dtb_Fortie = false ;
      A7939Dtb_ForTmx = (short)(0) ;
      n7939Dtb_ForTmx = false ;
      A7940Dtb_ForRb = DecimalUtil.ZERO ;
      n7940Dtb_ForRb = false ;
      A7941Dtb_ForPhx = DecimalUtil.ZERO ;
      n7941Dtb_ForPhx = false ;
      A7942Dtb_ForPhn = DecimalUtil.ZERO ;
      n7942Dtb_ForPhn = false ;
      A7943Dtb_ForUli = (short)(0) ;
      n7943Dtb_ForUli = false ;
      A12111Dtb_Nh2o = (short)(0) ;
      n12111Dtb_Nh2o = false ;
      O7943Dtb_ForUli = A7943Dtb_ForUli ;
      n7943Dtb_ForUli = false ;
      Z7935Dtb_CPQ = "" ;
      Z7937Dtb_ForFab = "" ;
      Z7938Dtb_Fortie = (short)(0) ;
      Z7939Dtb_ForTmx = (short)(0) ;
      Z7940Dtb_ForRb = DecimalUtil.ZERO ;
      Z7941Dtb_ForPhx = DecimalUtil.ZERO ;
      Z7942Dtb_ForPhn = DecimalUtil.ZERO ;
      Z7943Dtb_ForUli = (short)(0) ;
      Z12111Dtb_Nh2o = (short)(0) ;
   }

   public void initAll10I1108( )
   {
      A7934Dtb_Ordl = (short)(0) ;
      initializeNonKey10I1108( ) ;
   }

   public void standaloneModalInsert10I1108( )
   {
      A7933Dtb_UOrd = i7933Dtb_UOrd ;
      n7933Dtb_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7933Dtb_UOrd), 4, 0));
   }

   public void initializeNonKey10I1109( )
   {
      A7946Dtb_PrdNom = "" ;
      A7945Dtb_Prdnum = "" ;
      n7945Dtb_Prdnum = false ;
      A490ForPrdUMe = (byte)(0) ;
      n490ForPrdUMe = false ;
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      A7947Dtb_Forcan = DecimalUtil.ZERO ;
      n7947Dtb_Forcan = false ;
      A8477Dtb_clave1 = "" ;
      n8477Dtb_clave1 = false ;
      A8478Dtb_clave2 = "" ;
      n8478Dtb_clave2 = false ;
      Z7945Dtb_Prdnum = "" ;
      Z7947Dtb_Forcan = DecimalUtil.ZERO ;
      Z8477Dtb_clave1 = "" ;
      Z8478Dtb_clave2 = "" ;
      Z490ForPrdUMe = (byte)(0) ;
   }

   public void initAll10I1109( )
   {
      A7944Dtb_ForLin = (short)(0) ;
      initializeNonKey10I1109( ) ;
   }

   public void standaloneModalInsert10I1109( )
   {
      A7943Dtb_ForUli = i7943Dtb_ForUli ;
      n7943Dtb_ForUli = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241534768", true, true);
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
      httpContext.AddJavascriptSource("tdt005.js", "?20268241534768", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1108( )
   {
      edtDtb_ForUli_Enabled = defedtDtb_ForUli_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_ForUli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_ForUli_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDtb_Ordl_Enabled = defedtDtb_Ordl_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_Ordl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_Ordl_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void init_level_properties1109( )
   {
      edtDtb_ForLin_Enabled = defedtDtb_ForLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtb_ForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtb_ForLin_Enabled), 5, 0), !bGXsfl_122_Refreshing);
   }

   public void startgridcontrol60( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Class", "FreeStyleGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock9_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7934Dtb_Ordl, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_Ordl_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock10_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7935Dtb_CPQ));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_CPQ_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock11_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7936Dtb_DPQ));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_DPQ_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock12_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7937Dtb_ForFab));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForFab_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock13_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7938Dtb_Fortie, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_Fortie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock14_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7939Dtb_ForTmx, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForTmx_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock15_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7940Dtb_ForRb, (byte)(7), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForRb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock16_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7941Dtb_ForPhx, (byte)(5), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForPhx_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock17_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7942Dtb_ForPhn, (byte)(5), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForPhn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock18_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7943Dtb_ForUli, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForUli_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock19_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12111Dtb_Nh2o, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_Nh2o_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol122( )
   {
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("Header", subGrid2_Header);
      Grid2Container.AddObjectProperty("Class", "");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1109, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1109_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7944Dtb_ForLin, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_ForLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A7945Dtb_Prdnum));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_Prdnum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A7946Dtb_PrdNom));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_PrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A488ForPrdDsc));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7947Dtb_Forcan, (byte)(12), (byte)(5), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_Forcan_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A8477Dtb_clave1));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_clave1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A8478Dtb_clave2));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtb_clave2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtProCod_Internalname = "PROCOD" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtDtb_UOrd_Internalname = "DTB_UORD" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtDtb_Ordl_Internalname = "DTB_ORDL" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtDtb_CPQ_Internalname = "DTB_CPQ" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtDtb_DPQ_Internalname = "DTB_DPQ" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtDtb_ForFab_Internalname = "DTB_FORFAB" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtDtb_Fortie_Internalname = "DTB_FORTIE" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtDtb_ForTmx_Internalname = "DTB_FORTMX" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtDtb_ForRb_Internalname = "DTB_FORRB" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtDtb_ForPhx_Internalname = "DTB_FORPHX" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtDtb_ForPhn_Internalname = "DTB_FORPHN" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtDtb_ForUli_Internalname = "DTB_FORULI" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtDtb_Nh2o_Internalname = "DTB_NH2O" ;
      edtavnRcdDeleted_1109_Internalname = "vNRCDDELETED_1109" ;
      edtDtb_ForLin_Internalname = "DTB_FORLIN" ;
      edtDtb_Prdnum_Internalname = "DTB_PRDNUM" ;
      edtDtb_PrdNom_Internalname = "DTB_PRDNOM" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtDtb_Forcan_Internalname = "DTB_FORCAN" ;
      edtDtb_clave1_Internalname = "DTB_CLAVE1" ;
      edtDtb_clave2_Internalname = "DTB_CLAVE2" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
      subGrid2_Internalname = "GRID2" ;
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
      subGrid2_Allowcollapsing = (byte)(0) ;
      subGrid2_Allowselection = (byte)(0) ;
      subGrid2_Header = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      lblTextblock19_Caption = httpContext.getMessage( "N Banyos", "") ;
      lblTextblock18_Caption = httpContext.getMessage( "Ult Linea", "") ;
      lblTextblock17_Caption = httpContext.getMessage( "PH Mn", "") ;
      lblTextblock16_Caption = httpContext.getMessage( "PH Mx", "") ;
      lblTextblock15_Caption = httpContext.getMessage( "Rb", "") ;
      lblTextblock14_Caption = httpContext.getMessage( "TºC", "") ;
      lblTextblock13_Caption = httpContext.getMessage( "Tiempo", "") ;
      lblTextblock12_Caption = httpContext.getMessage( "Tipo L T M", "") ;
      lblTextblock11_Caption = httpContext.getMessage( "Descripcion", "") ;
      lblTextblock10_Caption = httpContext.getMessage( "PQ", "") ;
      lblTextblock9_Caption = httpContext.getMessage( "Orden PQ", "") ;
      subGrid1_Borderwidth = (short)(1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "TABLA BARFAS-PQUIMICO", "") );
      edtDtb_clave2_Jsonclick = "" ;
      edtDtb_clave1_Jsonclick = "" ;
      edtDtb_Forcan_Jsonclick = "" ;
      edtForPrdDsc_Jsonclick = "" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtDtb_PrdNom_Jsonclick = "" ;
      edtDtb_Prdnum_Jsonclick = "" ;
      edtDtb_ForLin_Jsonclick = "" ;
      edtavnRcdDeleted_1109_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtDtb_Nh2o_Jsonclick = "" ;
      edtDtb_ForUli_Jsonclick = "" ;
      edtDtb_ForPhn_Jsonclick = "" ;
      edtDtb_ForPhx_Jsonclick = "" ;
      edtDtb_ForRb_Jsonclick = "" ;
      edtDtb_ForTmx_Jsonclick = "" ;
      edtDtb_Fortie_Jsonclick = "" ;
      edtDtb_ForFab_Jsonclick = "" ;
      edtDtb_DPQ_Jsonclick = "" ;
      edtDtb_CPQ_Jsonclick = "" ;
      edtDtb_Ordl_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtDtb_clave2_Enabled = 1 ;
      edtDtb_clave1_Enabled = 1 ;
      edtDtb_Forcan_Enabled = 1 ;
      edtForPrdDsc_Enabled = 0 ;
      edtForPrdUMe_Enabled = 1 ;
      edtDtb_PrdNom_Enabled = 0 ;
      edtDtb_Prdnum_Enabled = 1 ;
      edtDtb_ForLin_Enabled = 1 ;
      edtavnRcdDeleted_1109_Enabled = 1 ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtDtb_Nh2o_Enabled = 1 ;
      edtDtb_ForUli_Enabled = 0 ;
      edtDtb_ForPhn_Enabled = 1 ;
      edtDtb_ForPhx_Enabled = 1 ;
      edtDtb_ForRb_Enabled = 1 ;
      edtDtb_ForTmx_Enabled = 1 ;
      edtDtb_Fortie_Enabled = 1 ;
      edtDtb_ForFab_Enabled = 1 ;
      edtDtb_DPQ_Enabled = 0 ;
      edtDtb_CPQ_Enabled = 1 ;
      edtDtb_Ordl_Enabled = 1 ;
      edtDtb_UOrd_Jsonclick = "" ;
      edtDtb_UOrd_Backcolor = (int)(0xFFFFFF) ;
      edtDtb_UOrd_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtBarOrdLin_Jsonclick = "" ;
      edtBarOrdLin_Backcolor = (int)(0xFFFFFF) ;
      edtBarOrdLin_Enabled = 0 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Backcolor = (int)(0xFFFFFF) ;
      edtProCod_Enabled = 0 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 0 ;
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

   public void gx2asadtb_dpq10I1108( String A396EmprCod ,
                                     String A7935Dtb_CPQ )
   {
      GXt_char1 = A7936Dtb_DPQ ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7935Dtb_CPQ ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd3(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt005_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt005_impl.this.A7935Dtb_CPQ = GXv_char3[0] ;
      tdt005_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7936Dtb_DPQ = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7936Dtb_DPQ))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx9asadtb_prdnom10I1109( String A396EmprCod ,
                                        String A7945Dtb_Prdnum )
   {
      GXt_char1 = A7946Dtb_PrdNom ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7945Dtb_Prdnum ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt005_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt005_impl.this.A7945Dtb_Prdnum = GXv_char3[0] ;
      tdt005_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7946Dtb_PrdNom = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7946Dtb_PrdNom))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_601108( ) ;
      while ( nGXsfl_60_idx <= nRC_GXsfl_60 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal10I1108( ) ;
         standaloneModal10I1108( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow10I1108( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_601108( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1221109( ) ;
      while ( nGXsfl_122_idx <= nRC_GXsfl_122 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal10I1108( ) ;
         standaloneModal10I1108( ) ;
         standaloneNotModal10I1109( ) ;
         standaloneModal10I1109( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow10I1109( ) ;
         nGXsfl_122_idx = (int)(nGXsfl_122_idx+1) ;
         sGXsfl_122_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_122_idx), 4, 0), (short)(4), "0") + sGXsfl_60_idx ;
         subsflControlProps_1221109( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid2Container)) ;
      /* End function gxnrGrid2_newrow */
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
      /* Using cursor T010I56 */
      pr_default.execute(54, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(54) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T010I56_A407EmprNom[0] ;
      n407EmprNom = T010I56_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(54);
      /* Using cursor T010I57 */
      pr_default.execute(55, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      if ( (pr_default.getStatus(55) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(55);
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

   public void valid_Barordlin( )
   {
      n7933Dtb_UOrd = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A7933Dtb_UOrd", GXutil.ltrim( localUtil.ntoc( A7933Dtb_UOrd, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z194BarOrdLin", GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7933Dtb_UOrd", GXutil.ltrim( localUtil.ntoc( Z7933Dtb_UOrd, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O7933Dtb_UOrd", GXutil.ltrim( localUtil.ntoc( O7933Dtb_UOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Dtb_cpq( )
   {
      n7935Dtb_CPQ = false ;
      GXt_char1 = A7936Dtb_DPQ ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7935Dtb_CPQ ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd3(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt005_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt005_impl.this.A7935Dtb_CPQ = GXv_char3[0] ;
      tdt005_impl.this.GXt_char1 = GXv_char2[0] ;
      A7936Dtb_DPQ = GXt_char1 ;
      if ( ( GXutil.strcmp(A7936Dtb_DPQ, httpContext.getMessage( "Error", "")) == 0 ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Inexistente", ""), 1, "DTB_CPQ");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDtb_CPQ_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7936Dtb_DPQ", GXutil.rtrim( A7936Dtb_DPQ));
   }

   public void valid_Dtb_prdnum( )
   {
      n7945Dtb_Prdnum = false ;
      GXt_char1 = A7946Dtb_PrdNom ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7945Dtb_Prdnum ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt005_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt005_impl.this.A7945Dtb_Prdnum = GXv_char3[0] ;
      tdt005_impl.this.GXt_char1 = GXv_char2[0] ;
      A7946Dtb_PrdNom = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7946Dtb_PrdNom", GXutil.rtrim( A7946Dtb_PrdNom));
   }

   public void valid_Forprdume( )
   {
      n490ForPrdUMe = false ;
      n488ForPrdDsc = false ;
      /* Using cursor T010I54 */
      pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(52) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      A488ForPrdDsc = T010I54_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T010I54_n488ForPrdDsc[0] ;
      pr_default.close(52);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", GXutil.rtrim( A488ForPrdDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
      setEventMetadata("VALID_BARORDLIN","{handler:'valid_Barordlin',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A7933Dtb_UOrd',fld:'DTB_UORD',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BARORDLIN",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A7933Dtb_UOrd',fld:'DTB_UORD',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z758ProCod'},{av:'Z194BarOrdLin'},{av:'Z407EmprNom'},{av:'Z7933Dtb_UOrd'},{av:'O7933Dtb_UOrd'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_DTB_UORD","{handler:'valid_Dtb_uord',iparms:[]");
      setEventMetadata("VALID_DTB_UORD",",oparms:[]}");
      setEventMetadata("VALID_DTB_ORDL","{handler:'valid_Dtb_ordl',iparms:[]");
      setEventMetadata("VALID_DTB_ORDL",",oparms:[]}");
      setEventMetadata("VALID_DTB_CPQ","{handler:'valid_Dtb_cpq',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7935Dtb_CPQ',fld:'DTB_CPQ',pic:''},{av:'A7936Dtb_DPQ',fld:'DTB_DPQ',pic:''}]");
      setEventMetadata("VALID_DTB_CPQ",",oparms:[{av:'A7936Dtb_DPQ',fld:'DTB_DPQ',pic:''}]}");
      setEventMetadata("VALID_DTB_DPQ","{handler:'valid_Dtb_dpq',iparms:[]");
      setEventMetadata("VALID_DTB_DPQ",",oparms:[]}");
      setEventMetadata("VALID_DTB_FORULI","{handler:'valid_Dtb_foruli',iparms:[]");
      setEventMetadata("VALID_DTB_FORULI",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Dtb_nh2o',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_DTB_FORLIN","{handler:'valid_Dtb_forlin',iparms:[]");
      setEventMetadata("VALID_DTB_FORLIN",",oparms:[]}");
      setEventMetadata("VALID_DTB_PRDNUM","{handler:'valid_Dtb_prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7945Dtb_Prdnum',fld:'DTB_PRDNUM',pic:''},{av:'A7946Dtb_PrdNom',fld:'DTB_PRDNOM',pic:''}]");
      setEventMetadata("VALID_DTB_PRDNUM",",oparms:[{av:'A7946Dtb_PrdNom',fld:'DTB_PRDNOM',pic:''}]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Dtb_clave2',iparms:[]");
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
      pr_default.close(52);
      pr_default.close(55);
      pr_default.close(54);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      wcpOA758ProCod = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z758ProCod = "" ;
      Z7935Dtb_CPQ = "" ;
      Z7937Dtb_ForFab = "" ;
      Z7940Dtb_ForRb = DecimalUtil.ZERO ;
      Z7941Dtb_ForPhx = DecimalUtil.ZERO ;
      Z7942Dtb_ForPhn = DecimalUtil.ZERO ;
      Z7945Dtb_Prdnum = "" ;
      Z7947Dtb_Forcan = DecimalUtil.ZERO ;
      Z8477Dtb_clave1 = "" ;
      Z8478Dtb_clave2 = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A7935Dtb_CPQ = "" ;
      A7945Dtb_Prdnum = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
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
      lblTextblock6_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock8_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1108 = "" ;
      GX_FocusControl = "" ;
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
      sMode15 = "" ;
      GXCCtl = "" ;
      A7946Dtb_PrdNom = "" ;
      A488ForPrdDsc = "" ;
      A7947Dtb_Forcan = DecimalUtil.ZERO ;
      A8477Dtb_clave1 = "" ;
      A8478Dtb_clave2 = "" ;
      A7936Dtb_DPQ = "" ;
      A7937Dtb_ForFab = "" ;
      A7940Dtb_ForRb = DecimalUtil.ZERO ;
      A7941Dtb_ForPhx = DecimalUtil.ZERO ;
      A7942Dtb_ForPhn = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      T010I9_A407EmprNom = new String[] {""} ;
      T010I9_n407EmprNom = new boolean[] {false} ;
      T010I10_A396EmprCod = new String[] {""} ;
      T010I11_A194BarOrdLin = new short[1] ;
      T010I11_A407EmprNom = new String[] {""} ;
      T010I11_n407EmprNom = new boolean[] {false} ;
      T010I11_A7933Dtb_UOrd = new short[1] ;
      T010I11_n7933Dtb_UOrd = new boolean[] {false} ;
      T010I11_A396EmprCod = new String[] {""} ;
      T010I11_A129BarCod = new int[1] ;
      T010I11_A132BarCodReo = new byte[1] ;
      T010I11_A130BarCodPar = new String[] {""} ;
      T010I11_A758ProCod = new String[] {""} ;
      T010I12_A396EmprCod = new String[] {""} ;
      T010I12_A129BarCod = new int[1] ;
      T010I12_A132BarCodReo = new byte[1] ;
      T010I12_A130BarCodPar = new String[] {""} ;
      T010I12_A758ProCod = new String[] {""} ;
      T010I12_A194BarOrdLin = new short[1] ;
      T010I8_A194BarOrdLin = new short[1] ;
      T010I8_A7933Dtb_UOrd = new short[1] ;
      T010I8_n7933Dtb_UOrd = new boolean[] {false} ;
      T010I8_A396EmprCod = new String[] {""} ;
      T010I8_A129BarCod = new int[1] ;
      T010I8_A132BarCodReo = new byte[1] ;
      T010I8_A130BarCodPar = new String[] {""} ;
      T010I8_A758ProCod = new String[] {""} ;
      T010I13_A396EmprCod = new String[] {""} ;
      T010I13_A129BarCod = new int[1] ;
      T010I13_A132BarCodReo = new byte[1] ;
      T010I13_A130BarCodPar = new String[] {""} ;
      T010I13_A758ProCod = new String[] {""} ;
      T010I13_A194BarOrdLin = new short[1] ;
      T010I14_A396EmprCod = new String[] {""} ;
      T010I14_A129BarCod = new int[1] ;
      T010I14_A132BarCodReo = new byte[1] ;
      T010I14_A130BarCodPar = new String[] {""} ;
      T010I14_A758ProCod = new String[] {""} ;
      T010I14_A194BarOrdLin = new short[1] ;
      T010I7_A194BarOrdLin = new short[1] ;
      T010I7_A7933Dtb_UOrd = new short[1] ;
      T010I7_n7933Dtb_UOrd = new boolean[] {false} ;
      T010I7_A396EmprCod = new String[] {""} ;
      T010I7_A129BarCod = new int[1] ;
      T010I7_A132BarCodReo = new byte[1] ;
      T010I7_A130BarCodPar = new String[] {""} ;
      T010I7_A758ProCod = new String[] {""} ;
      T010I18_A396EmprCod = new String[] {""} ;
      T010I18_A129BarCod = new int[1] ;
      T010I18_A132BarCodReo = new byte[1] ;
      T010I18_A130BarCodPar = new String[] {""} ;
      T010I18_A758ProCod = new String[] {""} ;
      T010I18_A194BarOrdLin = new short[1] ;
      T010I18_A12517SolAfLn = new short[1] ;
      T010I19_A396EmprCod = new String[] {""} ;
      T010I19_A129BarCod = new int[1] ;
      T010I19_A132BarCodReo = new byte[1] ;
      T010I19_A130BarCodPar = new String[] {""} ;
      T010I19_A758ProCod = new String[] {""} ;
      T010I19_A194BarOrdLin = new short[1] ;
      T010I19_A12516SolLzLn = new short[1] ;
      T010I20_A396EmprCod = new String[] {""} ;
      T010I20_A129BarCod = new int[1] ;
      T010I20_A132BarCodReo = new byte[1] ;
      T010I20_A130BarCodPar = new String[] {""} ;
      T010I20_A758ProCod = new String[] {""} ;
      T010I20_A194BarOrdLin = new short[1] ;
      T010I20_A12515SolPlLn = new short[1] ;
      T010I21_A396EmprCod = new String[] {""} ;
      T010I21_A129BarCod = new int[1] ;
      T010I21_A132BarCodReo = new byte[1] ;
      T010I21_A130BarCodPar = new String[] {""} ;
      T010I21_A758ProCod = new String[] {""} ;
      T010I21_A194BarOrdLin = new short[1] ;
      T010I21_A12514SolSAlLn = new short[1] ;
      T010I22_A396EmprCod = new String[] {""} ;
      T010I22_A129BarCod = new int[1] ;
      T010I22_A132BarCodReo = new byte[1] ;
      T010I22_A130BarCodPar = new String[] {""} ;
      T010I22_A758ProCod = new String[] {""} ;
      T010I22_A194BarOrdLin = new short[1] ;
      T010I22_A12513SolSAcLn = new short[1] ;
      T010I23_A396EmprCod = new String[] {""} ;
      T010I23_A129BarCod = new int[1] ;
      T010I23_A132BarCodReo = new byte[1] ;
      T010I23_A130BarCodPar = new String[] {""} ;
      T010I23_A758ProCod = new String[] {""} ;
      T010I23_A194BarOrdLin = new short[1] ;
      T010I23_A12512SolFrLn = new short[1] ;
      T010I24_A396EmprCod = new String[] {""} ;
      T010I24_A129BarCod = new int[1] ;
      T010I24_A132BarCodReo = new byte[1] ;
      T010I24_A130BarCodPar = new String[] {""} ;
      T010I24_A758ProCod = new String[] {""} ;
      T010I24_A194BarOrdLin = new short[1] ;
      T010I24_A12511SolAgLn = new short[1] ;
      T010I25_A396EmprCod = new String[] {""} ;
      T010I25_A129BarCod = new int[1] ;
      T010I25_A132BarCodReo = new byte[1] ;
      T010I25_A130BarCodPar = new String[] {""} ;
      T010I25_A758ProCod = new String[] {""} ;
      T010I25_A194BarOrdLin = new short[1] ;
      T010I25_A12510SolLvLn = new short[1] ;
      T010I26_A396EmprCod = new String[] {""} ;
      T010I26_A129BarCod = new int[1] ;
      T010I26_A132BarCodReo = new byte[1] ;
      T010I26_A130BarCodPar = new String[] {""} ;
      T010I26_A758ProCod = new String[] {""} ;
      T010I26_A194BarOrdLin = new short[1] ;
      T010I26_A10781BarFasNb = new int[1] ;
      T010I27_A396EmprCod = new String[] {""} ;
      T010I27_A129BarCod = new int[1] ;
      T010I27_A132BarCodReo = new byte[1] ;
      T010I27_A130BarCodPar = new String[] {""} ;
      T010I27_A758ProCod = new String[] {""} ;
      T010I27_A194BarOrdLin = new short[1] ;
      T010I27_A719PrdNum = new String[] {""} ;
      T010I28_A396EmprCod = new String[] {""} ;
      T010I28_A129BarCod = new int[1] ;
      T010I28_A132BarCodReo = new byte[1] ;
      T010I28_A130BarCodPar = new String[] {""} ;
      T010I28_A758ProCod = new String[] {""} ;
      T010I28_A194BarOrdLin = new short[1] ;
      T010I28_A9966Em_cod = new String[] {""} ;
      T010I29_A396EmprCod = new String[] {""} ;
      T010I29_A129BarCod = new int[1] ;
      T010I29_A132BarCodReo = new byte[1] ;
      T010I29_A130BarCodPar = new String[] {""} ;
      T010I29_A758ProCod = new String[] {""} ;
      T010I29_A194BarOrdLin = new short[1] ;
      T010I29_A9940Ab_cod = new String[] {""} ;
      T010I30_A396EmprCod = new String[] {""} ;
      T010I30_A129BarCod = new int[1] ;
      T010I30_A132BarCodReo = new byte[1] ;
      T010I30_A130BarCodPar = new String[] {""} ;
      T010I30_A758ProCod = new String[] {""} ;
      T010I30_A194BarOrdLin = new short[1] ;
      T010I30_A9911Ca_cod = new String[] {""} ;
      T010I31_A396EmprCod = new String[] {""} ;
      T010I31_A129BarCod = new int[1] ;
      T010I31_A132BarCodReo = new byte[1] ;
      T010I31_A130BarCodPar = new String[] {""} ;
      T010I31_A758ProCod = new String[] {""} ;
      T010I31_A194BarOrdLin = new short[1] ;
      T010I31_A9878Pe_cod = new String[] {""} ;
      T010I32_A396EmprCod = new String[] {""} ;
      T010I32_A129BarCod = new int[1] ;
      T010I32_A132BarCodReo = new byte[1] ;
      T010I32_A130BarCodPar = new String[] {""} ;
      T010I32_A758ProCod = new String[] {""} ;
      T010I32_A194BarOrdLin = new short[1] ;
      T010I32_A9870Rm_cod = new String[] {""} ;
      T010I33_A396EmprCod = new String[] {""} ;
      T010I33_A129BarCod = new int[1] ;
      T010I33_A132BarCodReo = new byte[1] ;
      T010I33_A130BarCodPar = new String[] {""} ;
      T010I33_A758ProCod = new String[] {""} ;
      T010I33_A194BarOrdLin = new short[1] ;
      T010I33_A7934Dtb_Ordl = new short[1] ;
      T010I34_A396EmprCod = new String[] {""} ;
      T010I34_A129BarCod = new int[1] ;
      T010I34_A132BarCodReo = new byte[1] ;
      T010I34_A130BarCodPar = new String[] {""} ;
      T010I34_A758ProCod = new String[] {""} ;
      T010I34_A194BarOrdLin = new short[1] ;
      T010I34_A5371FasQuiLin = new short[1] ;
      T010I35_A396EmprCod = new String[] {""} ;
      T010I35_A129BarCod = new int[1] ;
      T010I35_A132BarCodReo = new byte[1] ;
      T010I35_A130BarCodPar = new String[] {""} ;
      T010I35_A758ProCod = new String[] {""} ;
      T010I35_A194BarOrdLin = new short[1] ;
      T010I35_A4940A_Barcod = new int[1] ;
      T010I35_A4941A_BarReo = new byte[1] ;
      T010I35_A4942A_BarPar = new String[] {""} ;
      T010I35_A4943A_ProCod = new String[] {""} ;
      T010I35_A4944A_BarOrd = new short[1] ;
      T010I36_A396EmprCod = new String[] {""} ;
      T010I36_A129BarCod = new int[1] ;
      T010I36_A132BarCodReo = new byte[1] ;
      T010I36_A130BarCodPar = new String[] {""} ;
      T010I36_A758ProCod = new String[] {""} ;
      T010I36_A194BarOrdLin = new short[1] ;
      T010I36_A4643BarFasLot = new int[1] ;
      T010I37_A396EmprCod = new String[] {""} ;
      T010I37_A129BarCod = new int[1] ;
      T010I37_A132BarCodReo = new byte[1] ;
      T010I37_A130BarCodPar = new String[] {""} ;
      T010I37_A758ProCod = new String[] {""} ;
      T010I37_A194BarOrdLin = new short[1] ;
      T010I37_A4031CCTCod = new int[1] ;
      T010I38_A396EmprCod = new String[] {""} ;
      T010I38_A129BarCod = new int[1] ;
      T010I38_A132BarCodReo = new byte[1] ;
      T010I38_A130BarCodPar = new String[] {""} ;
      T010I38_A758ProCod = new String[] {""} ;
      T010I38_A194BarOrdLin = new short[1] ;
      T010I38_A1664ParFasCod = new short[1] ;
      T010I40_A396EmprCod = new String[] {""} ;
      T010I40_A129BarCod = new int[1] ;
      T010I40_A132BarCodReo = new byte[1] ;
      T010I40_A130BarCodPar = new String[] {""} ;
      T010I40_A758ProCod = new String[] {""} ;
      T010I40_A194BarOrdLin = new short[1] ;
      T010I41_A129BarCod = new int[1] ;
      T010I41_A132BarCodReo = new byte[1] ;
      T010I41_A130BarCodPar = new String[] {""} ;
      T010I41_A194BarOrdLin = new short[1] ;
      T010I41_A7934Dtb_Ordl = new short[1] ;
      T010I41_A7935Dtb_CPQ = new String[] {""} ;
      T010I41_n7935Dtb_CPQ = new boolean[] {false} ;
      T010I41_A7937Dtb_ForFab = new String[] {""} ;
      T010I41_n7937Dtb_ForFab = new boolean[] {false} ;
      T010I41_A7938Dtb_Fortie = new short[1] ;
      T010I41_n7938Dtb_Fortie = new boolean[] {false} ;
      T010I41_A7939Dtb_ForTmx = new short[1] ;
      T010I41_n7939Dtb_ForTmx = new boolean[] {false} ;
      T010I41_A7940Dtb_ForRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010I41_n7940Dtb_ForRb = new boolean[] {false} ;
      T010I41_A7941Dtb_ForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010I41_n7941Dtb_ForPhx = new boolean[] {false} ;
      T010I41_A7942Dtb_ForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010I41_n7942Dtb_ForPhn = new boolean[] {false} ;
      T010I41_A7943Dtb_ForUli = new short[1] ;
      T010I41_n7943Dtb_ForUli = new boolean[] {false} ;
      T010I41_A12111Dtb_Nh2o = new short[1] ;
      T010I41_n12111Dtb_Nh2o = new boolean[] {false} ;
      T010I41_A396EmprCod = new String[] {""} ;
      T010I41_A758ProCod = new String[] {""} ;
      T010I42_A396EmprCod = new String[] {""} ;
      T010I42_A129BarCod = new int[1] ;
      T010I42_A132BarCodReo = new byte[1] ;
      T010I42_A130BarCodPar = new String[] {""} ;
      T010I42_A758ProCod = new String[] {""} ;
      T010I42_A194BarOrdLin = new short[1] ;
      T010I42_A7934Dtb_Ordl = new short[1] ;
      T010I6_A129BarCod = new int[1] ;
      T010I6_A132BarCodReo = new byte[1] ;
      T010I6_A130BarCodPar = new String[] {""} ;
      T010I6_A194BarOrdLin = new short[1] ;
      T010I6_A7934Dtb_Ordl = new short[1] ;
      T010I6_A7935Dtb_CPQ = new String[] {""} ;
      T010I6_n7935Dtb_CPQ = new boolean[] {false} ;
      T010I6_A7937Dtb_ForFab = new String[] {""} ;
      T010I6_n7937Dtb_ForFab = new boolean[] {false} ;
      T010I6_A7938Dtb_Fortie = new short[1] ;
      T010I6_n7938Dtb_Fortie = new boolean[] {false} ;
      T010I6_A7939Dtb_ForTmx = new short[1] ;
      T010I6_n7939Dtb_ForTmx = new boolean[] {false} ;
      T010I6_A7940Dtb_ForRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010I6_n7940Dtb_ForRb = new boolean[] {false} ;
      T010I6_A7941Dtb_ForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010I6_n7941Dtb_ForPhx = new boolean[] {false} ;
      T010I6_A7942Dtb_ForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010I6_n7942Dtb_ForPhn = new boolean[] {false} ;
      T010I6_A7943Dtb_ForUli = new short[1] ;
      T010I6_n7943Dtb_ForUli = new boolean[] {false} ;
      T010I6_A12111Dtb_Nh2o = new short[1] ;
      T010I6_n12111Dtb_Nh2o = new boolean[] {false} ;
      T010I6_A396EmprCod = new String[] {""} ;
      T010I6_A758ProCod = new String[] {""} ;
      T010I5_A129BarCod = new int[1] ;
      T010I5_A132BarCodReo = new byte[1] ;
      T010I5_A130BarCodPar = new String[] {""} ;
      T010I5_A194BarOrdLin = new short[1] ;
      T010I5_A7934Dtb_Ordl = new short[1] ;
      T010I5_A7935Dtb_CPQ = new String[] {""} ;
      T010I5_n7935Dtb_CPQ = new boolean[] {false} ;
      T010I5_A7937Dtb_ForFab = new String[] {""} ;
      T010I5_n7937Dtb_ForFab = new boolean[] {false} ;
      T010I5_A7938Dtb_Fortie = new short[1] ;
      T010I5_n7938Dtb_Fortie = new boolean[] {false} ;
      T010I5_A7939Dtb_ForTmx = new short[1] ;
      T010I5_n7939Dtb_ForTmx = new boolean[] {false} ;
      T010I5_A7940Dtb_ForRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010I5_n7940Dtb_ForRb = new boolean[] {false} ;
      T010I5_A7941Dtb_ForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010I5_n7941Dtb_ForPhx = new boolean[] {false} ;
      T010I5_A7942Dtb_ForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010I5_n7942Dtb_ForPhn = new boolean[] {false} ;
      T010I5_A7943Dtb_ForUli = new short[1] ;
      T010I5_n7943Dtb_ForUli = new boolean[] {false} ;
      T010I5_A12111Dtb_Nh2o = new short[1] ;
      T010I5_n12111Dtb_Nh2o = new boolean[] {false} ;
      T010I5_A396EmprCod = new String[] {""} ;
      T010I5_A758ProCod = new String[] {""} ;
      T010I47_A396EmprCod = new String[] {""} ;
      T010I47_A129BarCod = new int[1] ;
      T010I47_A132BarCodReo = new byte[1] ;
      T010I47_A130BarCodPar = new String[] {""} ;
      T010I47_A758ProCod = new String[] {""} ;
      T010I47_A194BarOrdLin = new short[1] ;
      T010I47_A7934Dtb_Ordl = new short[1] ;
      Z488ForPrdDsc = "" ;
      T010I48_A129BarCod = new int[1] ;
      T010I48_A132BarCodReo = new byte[1] ;
      T010I48_A130BarCodPar = new String[] {""} ;
      T010I48_A194BarOrdLin = new short[1] ;
      T010I48_A7934Dtb_Ordl = new short[1] ;
      T010I48_A7944Dtb_ForLin = new short[1] ;
      T010I48_A7945Dtb_Prdnum = new String[] {""} ;
      T010I48_n7945Dtb_Prdnum = new boolean[] {false} ;
      T010I48_A488ForPrdDsc = new String[] {""} ;
      T010I48_n488ForPrdDsc = new boolean[] {false} ;
      T010I48_A7947Dtb_Forcan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010I48_n7947Dtb_Forcan = new boolean[] {false} ;
      T010I48_A8477Dtb_clave1 = new String[] {""} ;
      T010I48_n8477Dtb_clave1 = new boolean[] {false} ;
      T010I48_A8478Dtb_clave2 = new String[] {""} ;
      T010I48_n8478Dtb_clave2 = new boolean[] {false} ;
      T010I48_A396EmprCod = new String[] {""} ;
      T010I48_A490ForPrdUMe = new byte[1] ;
      T010I48_n490ForPrdUMe = new boolean[] {false} ;
      T010I48_A758ProCod = new String[] {""} ;
      T010I4_A488ForPrdDsc = new String[] {""} ;
      T010I4_n488ForPrdDsc = new boolean[] {false} ;
      T010I49_A488ForPrdDsc = new String[] {""} ;
      T010I49_n488ForPrdDsc = new boolean[] {false} ;
      T010I50_A396EmprCod = new String[] {""} ;
      T010I50_A129BarCod = new int[1] ;
      T010I50_A132BarCodReo = new byte[1] ;
      T010I50_A130BarCodPar = new String[] {""} ;
      T010I50_A758ProCod = new String[] {""} ;
      T010I50_A194BarOrdLin = new short[1] ;
      T010I50_A7934Dtb_Ordl = new short[1] ;
      T010I50_A7944Dtb_ForLin = new short[1] ;
      T010I3_A129BarCod = new int[1] ;
      T010I3_A132BarCodReo = new byte[1] ;
      T010I3_A130BarCodPar = new String[] {""} ;
      T010I3_A194BarOrdLin = new short[1] ;
      T010I3_A7934Dtb_Ordl = new short[1] ;
      T010I3_A7944Dtb_ForLin = new short[1] ;
      T010I3_A7945Dtb_Prdnum = new String[] {""} ;
      T010I3_n7945Dtb_Prdnum = new boolean[] {false} ;
      T010I3_A7947Dtb_Forcan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010I3_n7947Dtb_Forcan = new boolean[] {false} ;
      T010I3_A8477Dtb_clave1 = new String[] {""} ;
      T010I3_n8477Dtb_clave1 = new boolean[] {false} ;
      T010I3_A8478Dtb_clave2 = new String[] {""} ;
      T010I3_n8478Dtb_clave2 = new boolean[] {false} ;
      T010I3_A396EmprCod = new String[] {""} ;
      T010I3_A490ForPrdUMe = new byte[1] ;
      T010I3_n490ForPrdUMe = new boolean[] {false} ;
      T010I3_A758ProCod = new String[] {""} ;
      sMode1109 = "" ;
      T010I2_A129BarCod = new int[1] ;
      T010I2_A132BarCodReo = new byte[1] ;
      T010I2_A130BarCodPar = new String[] {""} ;
      T010I2_A194BarOrdLin = new short[1] ;
      T010I2_A7934Dtb_Ordl = new short[1] ;
      T010I2_A7944Dtb_ForLin = new short[1] ;
      T010I2_A7945Dtb_Prdnum = new String[] {""} ;
      T010I2_n7945Dtb_Prdnum = new boolean[] {false} ;
      T010I2_A7947Dtb_Forcan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010I2_n7947Dtb_Forcan = new boolean[] {false} ;
      T010I2_A8477Dtb_clave1 = new String[] {""} ;
      T010I2_n8477Dtb_clave1 = new boolean[] {false} ;
      T010I2_A8478Dtb_clave2 = new String[] {""} ;
      T010I2_n8478Dtb_clave2 = new boolean[] {false} ;
      T010I2_A396EmprCod = new String[] {""} ;
      T010I2_A490ForPrdUMe = new byte[1] ;
      T010I2_n490ForPrdUMe = new boolean[] {false} ;
      T010I2_A758ProCod = new String[] {""} ;
      T010I54_A488ForPrdDsc = new String[] {""} ;
      T010I54_n488ForPrdDsc = new boolean[] {false} ;
      T010I55_A396EmprCod = new String[] {""} ;
      T010I55_A129BarCod = new int[1] ;
      T010I55_A132BarCodReo = new byte[1] ;
      T010I55_A130BarCodPar = new String[] {""} ;
      T010I55_A758ProCod = new String[] {""} ;
      T010I55_A194BarOrdLin = new short[1] ;
      T010I55_A7934Dtb_Ordl = new short[1] ;
      T010I55_A7944Dtb_ForLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblTextblock9_Jsonclick = "" ;
      ROClassString = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      T010I56_A407EmprNom = new String[] {""} ;
      T010I56_n407EmprNom = new boolean[] {false} ;
      T010I57_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ758ProCod = "" ;
      ZZ407EmprNom = "" ;
      Z7936Dtb_DPQ = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Z7946Dtb_PrdNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdt005__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdt005__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdt005__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdt005__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdt005__default(),
         new Object[] {
             new Object[] {
            T010I2_A129BarCod, T010I2_A132BarCodReo, T010I2_A130BarCodPar, T010I2_A194BarOrdLin, T010I2_A7934Dtb_Ordl, T010I2_A7944Dtb_ForLin, T010I2_A7945Dtb_Prdnum, T010I2_n7945Dtb_Prdnum, T010I2_A7947Dtb_Forcan, T010I2_n7947Dtb_Forcan,
            T010I2_A8477Dtb_clave1, T010I2_n8477Dtb_clave1, T010I2_A8478Dtb_clave2, T010I2_n8478Dtb_clave2, T010I2_A396EmprCod, T010I2_A490ForPrdUMe, T010I2_n490ForPrdUMe, T010I2_A758ProCod
            }
            , new Object[] {
            T010I3_A129BarCod, T010I3_A132BarCodReo, T010I3_A130BarCodPar, T010I3_A194BarOrdLin, T010I3_A7934Dtb_Ordl, T010I3_A7944Dtb_ForLin, T010I3_A7945Dtb_Prdnum, T010I3_n7945Dtb_Prdnum, T010I3_A7947Dtb_Forcan, T010I3_n7947Dtb_Forcan,
            T010I3_A8477Dtb_clave1, T010I3_n8477Dtb_clave1, T010I3_A8478Dtb_clave2, T010I3_n8478Dtb_clave2, T010I3_A396EmprCod, T010I3_A490ForPrdUMe, T010I3_n490ForPrdUMe, T010I3_A758ProCod
            }
            , new Object[] {
            T010I4_A488ForPrdDsc, T010I4_n488ForPrdDsc
            }
            , new Object[] {
            T010I5_A129BarCod, T010I5_A132BarCodReo, T010I5_A130BarCodPar, T010I5_A194BarOrdLin, T010I5_A7934Dtb_Ordl, T010I5_A7935Dtb_CPQ, T010I5_n7935Dtb_CPQ, T010I5_A7937Dtb_ForFab, T010I5_n7937Dtb_ForFab, T010I5_A7938Dtb_Fortie,
            T010I5_n7938Dtb_Fortie, T010I5_A7939Dtb_ForTmx, T010I5_n7939Dtb_ForTmx, T010I5_A7940Dtb_ForRb, T010I5_n7940Dtb_ForRb, T010I5_A7941Dtb_ForPhx, T010I5_n7941Dtb_ForPhx, T010I5_A7942Dtb_ForPhn, T010I5_n7942Dtb_ForPhn, T010I5_A7943Dtb_ForUli,
            T010I5_n7943Dtb_ForUli, T010I5_A12111Dtb_Nh2o, T010I5_n12111Dtb_Nh2o, T010I5_A396EmprCod, T010I5_A758ProCod
            }
            , new Object[] {
            T010I6_A129BarCod, T010I6_A132BarCodReo, T010I6_A130BarCodPar, T010I6_A194BarOrdLin, T010I6_A7934Dtb_Ordl, T010I6_A7935Dtb_CPQ, T010I6_n7935Dtb_CPQ, T010I6_A7937Dtb_ForFab, T010I6_n7937Dtb_ForFab, T010I6_A7938Dtb_Fortie,
            T010I6_n7938Dtb_Fortie, T010I6_A7939Dtb_ForTmx, T010I6_n7939Dtb_ForTmx, T010I6_A7940Dtb_ForRb, T010I6_n7940Dtb_ForRb, T010I6_A7941Dtb_ForPhx, T010I6_n7941Dtb_ForPhx, T010I6_A7942Dtb_ForPhn, T010I6_n7942Dtb_ForPhn, T010I6_A7943Dtb_ForUli,
            T010I6_n7943Dtb_ForUli, T010I6_A12111Dtb_Nh2o, T010I6_n12111Dtb_Nh2o, T010I6_A396EmprCod, T010I6_A758ProCod
            }
            , new Object[] {
            T010I7_A194BarOrdLin, T010I7_A7933Dtb_UOrd, T010I7_n7933Dtb_UOrd, T010I7_A396EmprCod, T010I7_A129BarCod, T010I7_A132BarCodReo, T010I7_A130BarCodPar, T010I7_A758ProCod
            }
            , new Object[] {
            T010I8_A194BarOrdLin, T010I8_A7933Dtb_UOrd, T010I8_n7933Dtb_UOrd, T010I8_A396EmprCod, T010I8_A129BarCod, T010I8_A132BarCodReo, T010I8_A130BarCodPar, T010I8_A758ProCod
            }
            , new Object[] {
            T010I9_A407EmprNom, T010I9_n407EmprNom
            }
            , new Object[] {
            T010I10_A396EmprCod
            }
            , new Object[] {
            T010I11_A194BarOrdLin, T010I11_A407EmprNom, T010I11_n407EmprNom, T010I11_A7933Dtb_UOrd, T010I11_n7933Dtb_UOrd, T010I11_A396EmprCod, T010I11_A129BarCod, T010I11_A132BarCodReo, T010I11_A130BarCodPar, T010I11_A758ProCod
            }
            , new Object[] {
            T010I12_A396EmprCod, T010I12_A129BarCod, T010I12_A132BarCodReo, T010I12_A130BarCodPar, T010I12_A758ProCod, T010I12_A194BarOrdLin
            }
            , new Object[] {
            T010I13_A396EmprCod, T010I13_A129BarCod, T010I13_A132BarCodReo, T010I13_A130BarCodPar, T010I13_A758ProCod, T010I13_A194BarOrdLin
            }
            , new Object[] {
            T010I14_A396EmprCod, T010I14_A129BarCod, T010I14_A132BarCodReo, T010I14_A130BarCodPar, T010I14_A758ProCod, T010I14_A194BarOrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T010I18_A396EmprCod, T010I18_A129BarCod, T010I18_A132BarCodReo, T010I18_A130BarCodPar, T010I18_A758ProCod, T010I18_A194BarOrdLin, T010I18_A12517SolAfLn
            }
            , new Object[] {
            T010I19_A396EmprCod, T010I19_A129BarCod, T010I19_A132BarCodReo, T010I19_A130BarCodPar, T010I19_A758ProCod, T010I19_A194BarOrdLin, T010I19_A12516SolLzLn
            }
            , new Object[] {
            T010I20_A396EmprCod, T010I20_A129BarCod, T010I20_A132BarCodReo, T010I20_A130BarCodPar, T010I20_A758ProCod, T010I20_A194BarOrdLin, T010I20_A12515SolPlLn
            }
            , new Object[] {
            T010I21_A396EmprCod, T010I21_A129BarCod, T010I21_A132BarCodReo, T010I21_A130BarCodPar, T010I21_A758ProCod, T010I21_A194BarOrdLin, T010I21_A12514SolSAlLn
            }
            , new Object[] {
            T010I22_A396EmprCod, T010I22_A129BarCod, T010I22_A132BarCodReo, T010I22_A130BarCodPar, T010I22_A758ProCod, T010I22_A194BarOrdLin, T010I22_A12513SolSAcLn
            }
            , new Object[] {
            T010I23_A396EmprCod, T010I23_A129BarCod, T010I23_A132BarCodReo, T010I23_A130BarCodPar, T010I23_A758ProCod, T010I23_A194BarOrdLin, T010I23_A12512SolFrLn
            }
            , new Object[] {
            T010I24_A396EmprCod, T010I24_A129BarCod, T010I24_A132BarCodReo, T010I24_A130BarCodPar, T010I24_A758ProCod, T010I24_A194BarOrdLin, T010I24_A12511SolAgLn
            }
            , new Object[] {
            T010I25_A396EmprCod, T010I25_A129BarCod, T010I25_A132BarCodReo, T010I25_A130BarCodPar, T010I25_A758ProCod, T010I25_A194BarOrdLin, T010I25_A12510SolLvLn
            }
            , new Object[] {
            T010I26_A396EmprCod, T010I26_A129BarCod, T010I26_A132BarCodReo, T010I26_A130BarCodPar, T010I26_A758ProCod, T010I26_A194BarOrdLin, T010I26_A10781BarFasNb
            }
            , new Object[] {
            T010I27_A396EmprCod, T010I27_A129BarCod, T010I27_A132BarCodReo, T010I27_A130BarCodPar, T010I27_A758ProCod, T010I27_A194BarOrdLin, T010I27_A719PrdNum
            }
            , new Object[] {
            T010I28_A396EmprCod, T010I28_A129BarCod, T010I28_A132BarCodReo, T010I28_A130BarCodPar, T010I28_A758ProCod, T010I28_A194BarOrdLin, T010I28_A9966Em_cod
            }
            , new Object[] {
            T010I29_A396EmprCod, T010I29_A129BarCod, T010I29_A132BarCodReo, T010I29_A130BarCodPar, T010I29_A758ProCod, T010I29_A194BarOrdLin, T010I29_A9940Ab_cod
            }
            , new Object[] {
            T010I30_A396EmprCod, T010I30_A129BarCod, T010I30_A132BarCodReo, T010I30_A130BarCodPar, T010I30_A758ProCod, T010I30_A194BarOrdLin, T010I30_A9911Ca_cod
            }
            , new Object[] {
            T010I31_A396EmprCod, T010I31_A129BarCod, T010I31_A132BarCodReo, T010I31_A130BarCodPar, T010I31_A758ProCod, T010I31_A194BarOrdLin, T010I31_A9878Pe_cod
            }
            , new Object[] {
            T010I32_A396EmprCod, T010I32_A129BarCod, T010I32_A132BarCodReo, T010I32_A130BarCodPar, T010I32_A758ProCod, T010I32_A194BarOrdLin, T010I32_A9870Rm_cod
            }
            , new Object[] {
            T010I33_A396EmprCod, T010I33_A129BarCod, T010I33_A132BarCodReo, T010I33_A130BarCodPar, T010I33_A758ProCod, T010I33_A194BarOrdLin, T010I33_A7934Dtb_Ordl
            }
            , new Object[] {
            T010I34_A396EmprCod, T010I34_A129BarCod, T010I34_A132BarCodReo, T010I34_A130BarCodPar, T010I34_A758ProCod, T010I34_A194BarOrdLin, T010I34_A5371FasQuiLin
            }
            , new Object[] {
            T010I35_A396EmprCod, T010I35_A129BarCod, T010I35_A132BarCodReo, T010I35_A130BarCodPar, T010I35_A758ProCod, T010I35_A194BarOrdLin, T010I35_A4940A_Barcod, T010I35_A4941A_BarReo, T010I35_A4942A_BarPar, T010I35_A4943A_ProCod,
            T010I35_A4944A_BarOrd
            }
            , new Object[] {
            T010I36_A396EmprCod, T010I36_A129BarCod, T010I36_A132BarCodReo, T010I36_A130BarCodPar, T010I36_A758ProCod, T010I36_A194BarOrdLin, T010I36_A4643BarFasLot
            }
            , new Object[] {
            T010I37_A396EmprCod, T010I37_A129BarCod, T010I37_A132BarCodReo, T010I37_A130BarCodPar, T010I37_A758ProCod, T010I37_A194BarOrdLin, T010I37_A4031CCTCod
            }
            , new Object[] {
            T010I38_A396EmprCod, T010I38_A129BarCod, T010I38_A132BarCodReo, T010I38_A130BarCodPar, T010I38_A758ProCod, T010I38_A194BarOrdLin, T010I38_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            T010I40_A396EmprCod, T010I40_A129BarCod, T010I40_A132BarCodReo, T010I40_A130BarCodPar, T010I40_A758ProCod, T010I40_A194BarOrdLin
            }
            , new Object[] {
            T010I41_A129BarCod, T010I41_A132BarCodReo, T010I41_A130BarCodPar, T010I41_A194BarOrdLin, T010I41_A7934Dtb_Ordl, T010I41_A7935Dtb_CPQ, T010I41_n7935Dtb_CPQ, T010I41_A7937Dtb_ForFab, T010I41_n7937Dtb_ForFab, T010I41_A7938Dtb_Fortie,
            T010I41_n7938Dtb_Fortie, T010I41_A7939Dtb_ForTmx, T010I41_n7939Dtb_ForTmx, T010I41_A7940Dtb_ForRb, T010I41_n7940Dtb_ForRb, T010I41_A7941Dtb_ForPhx, T010I41_n7941Dtb_ForPhx, T010I41_A7942Dtb_ForPhn, T010I41_n7942Dtb_ForPhn, T010I41_A7943Dtb_ForUli,
            T010I41_n7943Dtb_ForUli, T010I41_A12111Dtb_Nh2o, T010I41_n12111Dtb_Nh2o, T010I41_A396EmprCod, T010I41_A758ProCod
            }
            , new Object[] {
            T010I42_A396EmprCod, T010I42_A129BarCod, T010I42_A132BarCodReo, T010I42_A130BarCodPar, T010I42_A758ProCod, T010I42_A194BarOrdLin, T010I42_A7934Dtb_Ordl
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
            T010I47_A396EmprCod, T010I47_A129BarCod, T010I47_A132BarCodReo, T010I47_A130BarCodPar, T010I47_A758ProCod, T010I47_A194BarOrdLin, T010I47_A7934Dtb_Ordl
            }
            , new Object[] {
            T010I48_A129BarCod, T010I48_A132BarCodReo, T010I48_A130BarCodPar, T010I48_A194BarOrdLin, T010I48_A7934Dtb_Ordl, T010I48_A7944Dtb_ForLin, T010I48_A7945Dtb_Prdnum, T010I48_n7945Dtb_Prdnum, T010I48_A488ForPrdDsc, T010I48_n488ForPrdDsc,
            T010I48_A7947Dtb_Forcan, T010I48_n7947Dtb_Forcan, T010I48_A8477Dtb_clave1, T010I48_n8477Dtb_clave1, T010I48_A8478Dtb_clave2, T010I48_n8478Dtb_clave2, T010I48_A396EmprCod, T010I48_A490ForPrdUMe, T010I48_n490ForPrdUMe, T010I48_A758ProCod
            }
            , new Object[] {
            T010I49_A488ForPrdDsc, T010I49_n488ForPrdDsc
            }
            , new Object[] {
            T010I50_A396EmprCod, T010I50_A129BarCod, T010I50_A132BarCodReo, T010I50_A130BarCodPar, T010I50_A758ProCod, T010I50_A194BarOrdLin, T010I50_A7934Dtb_Ordl, T010I50_A7944Dtb_ForLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T010I54_A488ForPrdDsc, T010I54_n488ForPrdDsc
            }
            , new Object[] {
            T010I55_A396EmprCod, T010I55_A129BarCod, T010I55_A132BarCodReo, T010I55_A130BarCodPar, T010I55_A758ProCod, T010I55_A194BarOrdLin, T010I55_A7934Dtb_Ordl, T010I55_A7944Dtb_ForLin
            }
            , new Object[] {
            T010I56_A407EmprNom, T010I56_n407EmprNom
            }
            , new Object[] {
            T010I57_A396EmprCod
            }
         }
      );
      Z194BarOrdLin = (short)(0) ;
      A194BarOrdLin = (short)(0) ;
      Z758ProCod = "" ;
      A758ProCod = "" ;
      Z130BarCodPar = "" ;
      A130BarCodPar = "" ;
      Z132BarCodReo = (byte)(0) ;
      A132BarCodReo = (byte)(0) ;
      Z129BarCod = 0 ;
      A129BarCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TDT005" ;
   }

   private byte wcpOA132BarCodReo ;
   private byte Z132BarCodReo ;
   private byte Z490ForPrdUMe ;
   private byte GxWebError ;
   private byte A490ForPrdUMe ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private byte ZZ132BarCodReo ;
   private short wcpOA194BarOrdLin ;
   private short Z194BarOrdLin ;
   private short Z7933Dtb_UOrd ;
   private short O7933Dtb_UOrd ;
   private short Z7934Dtb_Ordl ;
   private short Z7938Dtb_Fortie ;
   private short Z7939Dtb_ForTmx ;
   private short Z7943Dtb_ForUli ;
   private short Z12111Dtb_Nh2o ;
   private short O7943Dtb_ForUli ;
   private short nRcdDeleted_1108 ;
   private short nRcdExists_1108 ;
   private short nIsMod_1108 ;
   private short Z7944Dtb_ForLin ;
   private short nRcdDeleted_1109 ;
   private short nRcdExists_1109 ;
   private short nIsMod_1109 ;
   private short A194BarOrdLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A7933Dtb_UOrd ;
   private short A7943Dtb_ForUli ;
   private short nBlankRcdCount1108 ;
   private short RcdFound1108 ;
   private short B7933Dtb_UOrd ;
   private short nBlankRcdUsr1108 ;
   private short s7943Dtb_ForUli ;
   private short RcdFound1109 ;
   private short A7944Dtb_ForLin ;
   private short s7933Dtb_UOrd ;
   private short A7934Dtb_Ordl ;
   private short A7938Dtb_Fortie ;
   private short A7939Dtb_ForTmx ;
   private short A12111Dtb_Nh2o ;
   private short T7943Dtb_ForUli ;
   private short RcdFound15 ;
   private short nIsDirty_15 ;
   private short nIsDirty_1108 ;
   private short nIsDirty_1109 ;
   private short nBlankRcdCount1109 ;
   private short B7943Dtb_ForUli ;
   private short nBlankRcdUsr1109 ;
   private short i7933Dtb_UOrd ;
   private short i7943Dtb_ForUli ;
   private short subGrid1_Borderwidth ;
   private short ZZ194BarOrdLin ;
   private short ZZ7933Dtb_UOrd ;
   private short ZO7933Dtb_UOrd ;
   private int wcpOA129BarCod ;
   private int Z129BarCod ;
   private int nRC_GXsfl_60 ;
   private int nGXsfl_60_idx=1 ;
   private int nRC_GXsfl_122 ;
   private int nGXsfl_122_idx=1 ;
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
   private int edtProCod_Enabled ;
   private int edtBarOrdLin_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtDtb_UOrd_Enabled ;
   private int edtDtb_Ordl_Enabled ;
   private int edtDtb_CPQ_Enabled ;
   private int edtDtb_DPQ_Enabled ;
   private int edtDtb_ForFab_Enabled ;
   private int edtDtb_Fortie_Enabled ;
   private int edtDtb_ForTmx_Enabled ;
   private int edtDtb_ForRb_Enabled ;
   private int edtDtb_ForPhx_Enabled ;
   private int edtDtb_ForPhn_Enabled ;
   private int edtDtb_ForUli_Enabled ;
   private int edtDtb_Nh2o_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int edtavnRcdDeleted_1109_Enabled ;
   private int edtDtb_ForLin_Enabled ;
   private int edtDtb_Prdnum_Enabled ;
   private int edtDtb_PrdNom_Enabled ;
   private int edtForPrdUMe_Enabled ;
   private int edtForPrdDsc_Enabled ;
   private int edtDtb_Forcan_Enabled ;
   private int edtDtb_clave1_Enabled ;
   private int edtDtb_clave2_Enabled ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtDtb_ForLin_Enabled ;
   private int defedtDtb_ForUli_Enabled ;
   private int defedtDtb_Ordl_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtDtb_UOrd_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtBarOrdLin_Backcolor ;
   private int edtProCod_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private java.math.BigDecimal Z7940Dtb_ForRb ;
   private java.math.BigDecimal Z7941Dtb_ForPhx ;
   private java.math.BigDecimal Z7942Dtb_ForPhn ;
   private java.math.BigDecimal Z7947Dtb_Forcan ;
   private java.math.BigDecimal A7947Dtb_Forcan ;
   private java.math.BigDecimal A7940Dtb_ForRb ;
   private java.math.BigDecimal A7941Dtb_ForPhx ;
   private java.math.BigDecimal A7942Dtb_ForPhn ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOA758ProCod ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z758ProCod ;
   private String Z7935Dtb_CPQ ;
   private String Z7937Dtb_ForFab ;
   private String Z7945Dtb_Prdnum ;
   private String Z8477Dtb_clave1 ;
   private String Z8478Dtb_clave2 ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A7935Dtb_CPQ ;
   private String A7945Dtb_Prdnum ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_60_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_122_idx="0001" ;
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
   private String edtBarCod_Internalname ;
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
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtBarOrdLin_Internalname ;
   private String edtBarOrdLin_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtDtb_UOrd_Internalname ;
   private String edtDtb_UOrd_Jsonclick ;
   private String sMode1108 ;
   private String edtDtb_Ordl_Internalname ;
   private String edtDtb_CPQ_Internalname ;
   private String edtDtb_DPQ_Internalname ;
   private String edtDtb_ForFab_Internalname ;
   private String edtDtb_Fortie_Internalname ;
   private String edtDtb_ForTmx_Internalname ;
   private String edtDtb_ForRb_Internalname ;
   private String edtDtb_ForPhx_Internalname ;
   private String edtDtb_ForPhn_Internalname ;
   private String edtDtb_ForUli_Internalname ;
   private String edtDtb_Nh2o_Internalname ;
   private String GX_FocusControl ;
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
   private String edtavnRcdDeleted_1109_Internalname ;
   private String sMode15 ;
   private String GXCCtl ;
   private String edtDtb_ForLin_Internalname ;
   private String edtDtb_Prdnum_Internalname ;
   private String edtDtb_PrdNom_Internalname ;
   private String A7946Dtb_PrdNom ;
   private String edtForPrdUMe_Internalname ;
   private String edtForPrdDsc_Internalname ;
   private String A488ForPrdDsc ;
   private String edtDtb_Forcan_Internalname ;
   private String edtDtb_clave1_Internalname ;
   private String A8477Dtb_clave1 ;
   private String edtDtb_clave2_Internalname ;
   private String A8478Dtb_clave2 ;
   private String A7936Dtb_DPQ ;
   private String A7937Dtb_ForFab ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z488ForPrdDsc ;
   private String sMode1109 ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock19_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_60_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable3_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String ROClassString ;
   private String edtDtb_Ordl_Jsonclick ;
   private String lblTextblock10_Jsonclick ;
   private String edtDtb_CPQ_Jsonclick ;
   private String lblTextblock11_Jsonclick ;
   private String edtDtb_DPQ_Jsonclick ;
   private String lblTextblock12_Jsonclick ;
   private String edtDtb_ForFab_Jsonclick ;
   private String lblTextblock13_Jsonclick ;
   private String edtDtb_Fortie_Jsonclick ;
   private String lblTextblock14_Jsonclick ;
   private String edtDtb_ForTmx_Jsonclick ;
   private String lblTextblock15_Jsonclick ;
   private String edtDtb_ForRb_Jsonclick ;
   private String lblTextblock16_Jsonclick ;
   private String edtDtb_ForPhx_Jsonclick ;
   private String lblTextblock17_Jsonclick ;
   private String edtDtb_ForPhn_Jsonclick ;
   private String lblTextblock18_Jsonclick ;
   private String edtDtb_ForUli_Jsonclick ;
   private String lblTextblock19_Jsonclick ;
   private String edtDtb_Nh2o_Jsonclick ;
   private String sGXsfl_122_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_1109_Jsonclick ;
   private String edtDtb_ForLin_Jsonclick ;
   private String edtDtb_Prdnum_Jsonclick ;
   private String edtDtb_PrdNom_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtDtb_Forcan_Jsonclick ;
   private String edtDtb_clave1_Jsonclick ;
   private String edtDtb_clave2_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String lblTextblock9_Caption ;
   private String lblTextblock10_Caption ;
   private String lblTextblock11_Caption ;
   private String lblTextblock12_Caption ;
   private String lblTextblock13_Caption ;
   private String lblTextblock14_Caption ;
   private String lblTextblock15_Caption ;
   private String lblTextblock16_Caption ;
   private String lblTextblock17_Caption ;
   private String lblTextblock18_Caption ;
   private String lblTextblock19_Caption ;
   private String subGrid2_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ758ProCod ;
   private String ZZ407EmprNom ;
   private String Z7936Dtb_DPQ ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z7946Dtb_PrdNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n7935Dtb_CPQ ;
   private boolean n7945Dtb_Prdnum ;
   private boolean n490ForPrdUMe ;
   private boolean wbErr ;
   private boolean n7933Dtb_UOrd ;
   private boolean n7943Dtb_ForUli ;
   private boolean bGXsfl_60_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean bGXsfl_122_Refreshing=false ;
   private boolean returnInSub ;
   private boolean n7937Dtb_ForFab ;
   private boolean n7938Dtb_Fortie ;
   private boolean n7939Dtb_ForTmx ;
   private boolean n7940Dtb_ForRb ;
   private boolean n7941Dtb_ForPhx ;
   private boolean n7942Dtb_ForPhn ;
   private boolean n12111Dtb_Nh2o ;
   private boolean Gx_longc ;
   private boolean n488ForPrdDsc ;
   private boolean n7947Dtb_Forcan ;
   private boolean n8477Dtb_clave1 ;
   private boolean n8478Dtb_clave2 ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private IDataStoreProvider pr_default ;
   private String[] T010I9_A407EmprNom ;
   private boolean[] T010I9_n407EmprNom ;
   private String[] T010I10_A396EmprCod ;
   private short[] T010I11_A194BarOrdLin ;
   private String[] T010I11_A407EmprNom ;
   private boolean[] T010I11_n407EmprNom ;
   private short[] T010I11_A7933Dtb_UOrd ;
   private boolean[] T010I11_n7933Dtb_UOrd ;
   private String[] T010I11_A396EmprCod ;
   private int[] T010I11_A129BarCod ;
   private byte[] T010I11_A132BarCodReo ;
   private String[] T010I11_A130BarCodPar ;
   private String[] T010I11_A758ProCod ;
   private String[] T010I12_A396EmprCod ;
   private int[] T010I12_A129BarCod ;
   private byte[] T010I12_A132BarCodReo ;
   private String[] T010I12_A130BarCodPar ;
   private String[] T010I12_A758ProCod ;
   private short[] T010I12_A194BarOrdLin ;
   private short[] T010I8_A194BarOrdLin ;
   private short[] T010I8_A7933Dtb_UOrd ;
   private boolean[] T010I8_n7933Dtb_UOrd ;
   private String[] T010I8_A396EmprCod ;
   private int[] T010I8_A129BarCod ;
   private byte[] T010I8_A132BarCodReo ;
   private String[] T010I8_A130BarCodPar ;
   private String[] T010I8_A758ProCod ;
   private String[] T010I13_A396EmprCod ;
   private int[] T010I13_A129BarCod ;
   private byte[] T010I13_A132BarCodReo ;
   private String[] T010I13_A130BarCodPar ;
   private String[] T010I13_A758ProCod ;
   private short[] T010I13_A194BarOrdLin ;
   private String[] T010I14_A396EmprCod ;
   private int[] T010I14_A129BarCod ;
   private byte[] T010I14_A132BarCodReo ;
   private String[] T010I14_A130BarCodPar ;
   private String[] T010I14_A758ProCod ;
   private short[] T010I14_A194BarOrdLin ;
   private short[] T010I7_A194BarOrdLin ;
   private short[] T010I7_A7933Dtb_UOrd ;
   private boolean[] T010I7_n7933Dtb_UOrd ;
   private String[] T010I7_A396EmprCod ;
   private int[] T010I7_A129BarCod ;
   private byte[] T010I7_A132BarCodReo ;
   private String[] T010I7_A130BarCodPar ;
   private String[] T010I7_A758ProCod ;
   private String[] T010I18_A396EmprCod ;
   private int[] T010I18_A129BarCod ;
   private byte[] T010I18_A132BarCodReo ;
   private String[] T010I18_A130BarCodPar ;
   private String[] T010I18_A758ProCod ;
   private short[] T010I18_A194BarOrdLin ;
   private short[] T010I18_A12517SolAfLn ;
   private String[] T010I19_A396EmprCod ;
   private int[] T010I19_A129BarCod ;
   private byte[] T010I19_A132BarCodReo ;
   private String[] T010I19_A130BarCodPar ;
   private String[] T010I19_A758ProCod ;
   private short[] T010I19_A194BarOrdLin ;
   private short[] T010I19_A12516SolLzLn ;
   private String[] T010I20_A396EmprCod ;
   private int[] T010I20_A129BarCod ;
   private byte[] T010I20_A132BarCodReo ;
   private String[] T010I20_A130BarCodPar ;
   private String[] T010I20_A758ProCod ;
   private short[] T010I20_A194BarOrdLin ;
   private short[] T010I20_A12515SolPlLn ;
   private String[] T010I21_A396EmprCod ;
   private int[] T010I21_A129BarCod ;
   private byte[] T010I21_A132BarCodReo ;
   private String[] T010I21_A130BarCodPar ;
   private String[] T010I21_A758ProCod ;
   private short[] T010I21_A194BarOrdLin ;
   private short[] T010I21_A12514SolSAlLn ;
   private String[] T010I22_A396EmprCod ;
   private int[] T010I22_A129BarCod ;
   private byte[] T010I22_A132BarCodReo ;
   private String[] T010I22_A130BarCodPar ;
   private String[] T010I22_A758ProCod ;
   private short[] T010I22_A194BarOrdLin ;
   private short[] T010I22_A12513SolSAcLn ;
   private String[] T010I23_A396EmprCod ;
   private int[] T010I23_A129BarCod ;
   private byte[] T010I23_A132BarCodReo ;
   private String[] T010I23_A130BarCodPar ;
   private String[] T010I23_A758ProCod ;
   private short[] T010I23_A194BarOrdLin ;
   private short[] T010I23_A12512SolFrLn ;
   private String[] T010I24_A396EmprCod ;
   private int[] T010I24_A129BarCod ;
   private byte[] T010I24_A132BarCodReo ;
   private String[] T010I24_A130BarCodPar ;
   private String[] T010I24_A758ProCod ;
   private short[] T010I24_A194BarOrdLin ;
   private short[] T010I24_A12511SolAgLn ;
   private String[] T010I25_A396EmprCod ;
   private int[] T010I25_A129BarCod ;
   private byte[] T010I25_A132BarCodReo ;
   private String[] T010I25_A130BarCodPar ;
   private String[] T010I25_A758ProCod ;
   private short[] T010I25_A194BarOrdLin ;
   private short[] T010I25_A12510SolLvLn ;
   private String[] T010I26_A396EmprCod ;
   private int[] T010I26_A129BarCod ;
   private byte[] T010I26_A132BarCodReo ;
   private String[] T010I26_A130BarCodPar ;
   private String[] T010I26_A758ProCod ;
   private short[] T010I26_A194BarOrdLin ;
   private int[] T010I26_A10781BarFasNb ;
   private String[] T010I27_A396EmprCod ;
   private int[] T010I27_A129BarCod ;
   private byte[] T010I27_A132BarCodReo ;
   private String[] T010I27_A130BarCodPar ;
   private String[] T010I27_A758ProCod ;
   private short[] T010I27_A194BarOrdLin ;
   private String[] T010I27_A719PrdNum ;
   private String[] T010I28_A396EmprCod ;
   private int[] T010I28_A129BarCod ;
   private byte[] T010I28_A132BarCodReo ;
   private String[] T010I28_A130BarCodPar ;
   private String[] T010I28_A758ProCod ;
   private short[] T010I28_A194BarOrdLin ;
   private String[] T010I28_A9966Em_cod ;
   private String[] T010I29_A396EmprCod ;
   private int[] T010I29_A129BarCod ;
   private byte[] T010I29_A132BarCodReo ;
   private String[] T010I29_A130BarCodPar ;
   private String[] T010I29_A758ProCod ;
   private short[] T010I29_A194BarOrdLin ;
   private String[] T010I29_A9940Ab_cod ;
   private String[] T010I30_A396EmprCod ;
   private int[] T010I30_A129BarCod ;
   private byte[] T010I30_A132BarCodReo ;
   private String[] T010I30_A130BarCodPar ;
   private String[] T010I30_A758ProCod ;
   private short[] T010I30_A194BarOrdLin ;
   private String[] T010I30_A9911Ca_cod ;
   private String[] T010I31_A396EmprCod ;
   private int[] T010I31_A129BarCod ;
   private byte[] T010I31_A132BarCodReo ;
   private String[] T010I31_A130BarCodPar ;
   private String[] T010I31_A758ProCod ;
   private short[] T010I31_A194BarOrdLin ;
   private String[] T010I31_A9878Pe_cod ;
   private String[] T010I32_A396EmprCod ;
   private int[] T010I32_A129BarCod ;
   private byte[] T010I32_A132BarCodReo ;
   private String[] T010I32_A130BarCodPar ;
   private String[] T010I32_A758ProCod ;
   private short[] T010I32_A194BarOrdLin ;
   private String[] T010I32_A9870Rm_cod ;
   private String[] T010I33_A396EmprCod ;
   private int[] T010I33_A129BarCod ;
   private byte[] T010I33_A132BarCodReo ;
   private String[] T010I33_A130BarCodPar ;
   private String[] T010I33_A758ProCod ;
   private short[] T010I33_A194BarOrdLin ;
   private short[] T010I33_A7934Dtb_Ordl ;
   private String[] T010I34_A396EmprCod ;
   private int[] T010I34_A129BarCod ;
   private byte[] T010I34_A132BarCodReo ;
   private String[] T010I34_A130BarCodPar ;
   private String[] T010I34_A758ProCod ;
   private short[] T010I34_A194BarOrdLin ;
   private short[] T010I34_A5371FasQuiLin ;
   private String[] T010I35_A396EmprCod ;
   private int[] T010I35_A129BarCod ;
   private byte[] T010I35_A132BarCodReo ;
   private String[] T010I35_A130BarCodPar ;
   private String[] T010I35_A758ProCod ;
   private short[] T010I35_A194BarOrdLin ;
   private int[] T010I35_A4940A_Barcod ;
   private byte[] T010I35_A4941A_BarReo ;
   private String[] T010I35_A4942A_BarPar ;
   private String[] T010I35_A4943A_ProCod ;
   private short[] T010I35_A4944A_BarOrd ;
   private String[] T010I36_A396EmprCod ;
   private int[] T010I36_A129BarCod ;
   private byte[] T010I36_A132BarCodReo ;
   private String[] T010I36_A130BarCodPar ;
   private String[] T010I36_A758ProCod ;
   private short[] T010I36_A194BarOrdLin ;
   private int[] T010I36_A4643BarFasLot ;
   private String[] T010I37_A396EmprCod ;
   private int[] T010I37_A129BarCod ;
   private byte[] T010I37_A132BarCodReo ;
   private String[] T010I37_A130BarCodPar ;
   private String[] T010I37_A758ProCod ;
   private short[] T010I37_A194BarOrdLin ;
   private int[] T010I37_A4031CCTCod ;
   private String[] T010I38_A396EmprCod ;
   private int[] T010I38_A129BarCod ;
   private byte[] T010I38_A132BarCodReo ;
   private String[] T010I38_A130BarCodPar ;
   private String[] T010I38_A758ProCod ;
   private short[] T010I38_A194BarOrdLin ;
   private short[] T010I38_A1664ParFasCod ;
   private String[] T010I40_A396EmprCod ;
   private int[] T010I40_A129BarCod ;
   private byte[] T010I40_A132BarCodReo ;
   private String[] T010I40_A130BarCodPar ;
   private String[] T010I40_A758ProCod ;
   private short[] T010I40_A194BarOrdLin ;
   private int[] T010I41_A129BarCod ;
   private byte[] T010I41_A132BarCodReo ;
   private String[] T010I41_A130BarCodPar ;
   private short[] T010I41_A194BarOrdLin ;
   private short[] T010I41_A7934Dtb_Ordl ;
   private String[] T010I41_A7935Dtb_CPQ ;
   private boolean[] T010I41_n7935Dtb_CPQ ;
   private String[] T010I41_A7937Dtb_ForFab ;
   private boolean[] T010I41_n7937Dtb_ForFab ;
   private short[] T010I41_A7938Dtb_Fortie ;
   private boolean[] T010I41_n7938Dtb_Fortie ;
   private short[] T010I41_A7939Dtb_ForTmx ;
   private boolean[] T010I41_n7939Dtb_ForTmx ;
   private java.math.BigDecimal[] T010I41_A7940Dtb_ForRb ;
   private boolean[] T010I41_n7940Dtb_ForRb ;
   private java.math.BigDecimal[] T010I41_A7941Dtb_ForPhx ;
   private boolean[] T010I41_n7941Dtb_ForPhx ;
   private java.math.BigDecimal[] T010I41_A7942Dtb_ForPhn ;
   private boolean[] T010I41_n7942Dtb_ForPhn ;
   private short[] T010I41_A7943Dtb_ForUli ;
   private boolean[] T010I41_n7943Dtb_ForUli ;
   private short[] T010I41_A12111Dtb_Nh2o ;
   private boolean[] T010I41_n12111Dtb_Nh2o ;
   private String[] T010I41_A396EmprCod ;
   private String[] T010I41_A758ProCod ;
   private String[] T010I42_A396EmprCod ;
   private int[] T010I42_A129BarCod ;
   private byte[] T010I42_A132BarCodReo ;
   private String[] T010I42_A130BarCodPar ;
   private String[] T010I42_A758ProCod ;
   private short[] T010I42_A194BarOrdLin ;
   private short[] T010I42_A7934Dtb_Ordl ;
   private int[] T010I6_A129BarCod ;
   private byte[] T010I6_A132BarCodReo ;
   private String[] T010I6_A130BarCodPar ;
   private short[] T010I6_A194BarOrdLin ;
   private short[] T010I6_A7934Dtb_Ordl ;
   private String[] T010I6_A7935Dtb_CPQ ;
   private boolean[] T010I6_n7935Dtb_CPQ ;
   private String[] T010I6_A7937Dtb_ForFab ;
   private boolean[] T010I6_n7937Dtb_ForFab ;
   private short[] T010I6_A7938Dtb_Fortie ;
   private boolean[] T010I6_n7938Dtb_Fortie ;
   private short[] T010I6_A7939Dtb_ForTmx ;
   private boolean[] T010I6_n7939Dtb_ForTmx ;
   private java.math.BigDecimal[] T010I6_A7940Dtb_ForRb ;
   private boolean[] T010I6_n7940Dtb_ForRb ;
   private java.math.BigDecimal[] T010I6_A7941Dtb_ForPhx ;
   private boolean[] T010I6_n7941Dtb_ForPhx ;
   private java.math.BigDecimal[] T010I6_A7942Dtb_ForPhn ;
   private boolean[] T010I6_n7942Dtb_ForPhn ;
   private short[] T010I6_A7943Dtb_ForUli ;
   private boolean[] T010I6_n7943Dtb_ForUli ;
   private short[] T010I6_A12111Dtb_Nh2o ;
   private boolean[] T010I6_n12111Dtb_Nh2o ;
   private String[] T010I6_A396EmprCod ;
   private String[] T010I6_A758ProCod ;
   private int[] T010I5_A129BarCod ;
   private byte[] T010I5_A132BarCodReo ;
   private String[] T010I5_A130BarCodPar ;
   private short[] T010I5_A194BarOrdLin ;
   private short[] T010I5_A7934Dtb_Ordl ;
   private String[] T010I5_A7935Dtb_CPQ ;
   private boolean[] T010I5_n7935Dtb_CPQ ;
   private String[] T010I5_A7937Dtb_ForFab ;
   private boolean[] T010I5_n7937Dtb_ForFab ;
   private short[] T010I5_A7938Dtb_Fortie ;
   private boolean[] T010I5_n7938Dtb_Fortie ;
   private short[] T010I5_A7939Dtb_ForTmx ;
   private boolean[] T010I5_n7939Dtb_ForTmx ;
   private java.math.BigDecimal[] T010I5_A7940Dtb_ForRb ;
   private boolean[] T010I5_n7940Dtb_ForRb ;
   private java.math.BigDecimal[] T010I5_A7941Dtb_ForPhx ;
   private boolean[] T010I5_n7941Dtb_ForPhx ;
   private java.math.BigDecimal[] T010I5_A7942Dtb_ForPhn ;
   private boolean[] T010I5_n7942Dtb_ForPhn ;
   private short[] T010I5_A7943Dtb_ForUli ;
   private boolean[] T010I5_n7943Dtb_ForUli ;
   private short[] T010I5_A12111Dtb_Nh2o ;
   private boolean[] T010I5_n12111Dtb_Nh2o ;
   private String[] T010I5_A396EmprCod ;
   private String[] T010I5_A758ProCod ;
   private String[] T010I47_A396EmprCod ;
   private int[] T010I47_A129BarCod ;
   private byte[] T010I47_A132BarCodReo ;
   private String[] T010I47_A130BarCodPar ;
   private String[] T010I47_A758ProCod ;
   private short[] T010I47_A194BarOrdLin ;
   private short[] T010I47_A7934Dtb_Ordl ;
   private int[] T010I48_A129BarCod ;
   private byte[] T010I48_A132BarCodReo ;
   private String[] T010I48_A130BarCodPar ;
   private short[] T010I48_A194BarOrdLin ;
   private short[] T010I48_A7934Dtb_Ordl ;
   private short[] T010I48_A7944Dtb_ForLin ;
   private String[] T010I48_A7945Dtb_Prdnum ;
   private boolean[] T010I48_n7945Dtb_Prdnum ;
   private String[] T010I48_A488ForPrdDsc ;
   private boolean[] T010I48_n488ForPrdDsc ;
   private java.math.BigDecimal[] T010I48_A7947Dtb_Forcan ;
   private boolean[] T010I48_n7947Dtb_Forcan ;
   private String[] T010I48_A8477Dtb_clave1 ;
   private boolean[] T010I48_n8477Dtb_clave1 ;
   private String[] T010I48_A8478Dtb_clave2 ;
   private boolean[] T010I48_n8478Dtb_clave2 ;
   private String[] T010I48_A396EmprCod ;
   private byte[] T010I48_A490ForPrdUMe ;
   private boolean[] T010I48_n490ForPrdUMe ;
   private String[] T010I48_A758ProCod ;
   private String[] T010I4_A488ForPrdDsc ;
   private boolean[] T010I4_n488ForPrdDsc ;
   private String[] T010I49_A488ForPrdDsc ;
   private boolean[] T010I49_n488ForPrdDsc ;
   private String[] T010I50_A396EmprCod ;
   private int[] T010I50_A129BarCod ;
   private byte[] T010I50_A132BarCodReo ;
   private String[] T010I50_A130BarCodPar ;
   private String[] T010I50_A758ProCod ;
   private short[] T010I50_A194BarOrdLin ;
   private short[] T010I50_A7934Dtb_Ordl ;
   private short[] T010I50_A7944Dtb_ForLin ;
   private int[] T010I3_A129BarCod ;
   private byte[] T010I3_A132BarCodReo ;
   private String[] T010I3_A130BarCodPar ;
   private short[] T010I3_A194BarOrdLin ;
   private short[] T010I3_A7934Dtb_Ordl ;
   private short[] T010I3_A7944Dtb_ForLin ;
   private String[] T010I3_A7945Dtb_Prdnum ;
   private boolean[] T010I3_n7945Dtb_Prdnum ;
   private java.math.BigDecimal[] T010I3_A7947Dtb_Forcan ;
   private boolean[] T010I3_n7947Dtb_Forcan ;
   private String[] T010I3_A8477Dtb_clave1 ;
   private boolean[] T010I3_n8477Dtb_clave1 ;
   private String[] T010I3_A8478Dtb_clave2 ;
   private boolean[] T010I3_n8478Dtb_clave2 ;
   private String[] T010I3_A396EmprCod ;
   private byte[] T010I3_A490ForPrdUMe ;
   private boolean[] T010I3_n490ForPrdUMe ;
   private String[] T010I3_A758ProCod ;
   private int[] T010I2_A129BarCod ;
   private byte[] T010I2_A132BarCodReo ;
   private String[] T010I2_A130BarCodPar ;
   private short[] T010I2_A194BarOrdLin ;
   private short[] T010I2_A7934Dtb_Ordl ;
   private short[] T010I2_A7944Dtb_ForLin ;
   private String[] T010I2_A7945Dtb_Prdnum ;
   private boolean[] T010I2_n7945Dtb_Prdnum ;
   private java.math.BigDecimal[] T010I2_A7947Dtb_Forcan ;
   private boolean[] T010I2_n7947Dtb_Forcan ;
   private String[] T010I2_A8477Dtb_clave1 ;
   private boolean[] T010I2_n8477Dtb_clave1 ;
   private String[] T010I2_A8478Dtb_clave2 ;
   private boolean[] T010I2_n8478Dtb_clave2 ;
   private String[] T010I2_A396EmprCod ;
   private byte[] T010I2_A490ForPrdUMe ;
   private boolean[] T010I2_n490ForPrdUMe ;
   private String[] T010I2_A758ProCod ;
   private String[] T010I54_A488ForPrdDsc ;
   private boolean[] T010I54_n488ForPrdDsc ;
   private String[] T010I55_A396EmprCod ;
   private int[] T010I55_A129BarCod ;
   private byte[] T010I55_A132BarCodReo ;
   private String[] T010I55_A130BarCodPar ;
   private String[] T010I55_A758ProCod ;
   private short[] T010I55_A194BarOrdLin ;
   private short[] T010I55_A7934Dtb_Ordl ;
   private short[] T010I55_A7944Dtb_ForLin ;
   private String[] T010I56_A407EmprNom ;
   private boolean[] T010I56_n407EmprNom ;
   private String[] T010I57_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdt005__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdt005__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdt005__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdt005__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdt005__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T010I2", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, Dtb_Ordl, Dtb_ForLin, Dtb_Prdnum, Dtb_Forcan, Dtb_clave1, Dtb_clave2, EmprCod, ForPrdUMe, ProCod FROM TXPDT0051 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Dtb_Ordl = ? AND Dtb_ForLin = ?  FOR UPDATE OF Dtb_Prdnum, Dtb_Forcan, Dtb_clave1, Dtb_clave2, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010I3", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, Dtb_Ordl, Dtb_ForLin, Dtb_Prdnum, Dtb_Forcan, Dtb_clave1, Dtb_clave2, EmprCod, ForPrdUMe, ProCod FROM TXPDT0051 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Dtb_Ordl = ? AND Dtb_ForLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010I4", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I5", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, Dtb_Ordl, Dtb_CPQ, Dtb_ForFab, Dtb_Fortie, Dtb_ForTmx, Dtb_ForRb, Dtb_ForPhx, Dtb_ForPhn, Dtb_ForUli, Dtb_Nh2o, EmprCod, ProCod FROM TXPDT005 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Dtb_Ordl = ?  FOR UPDATE OF Dtb_CPQ, Dtb_ForFab, Dtb_Fortie, Dtb_ForTmx, Dtb_ForRb, Dtb_ForPhx, Dtb_ForPhn, Dtb_ForUli, Dtb_Nh2o NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010I6", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, Dtb_Ordl, Dtb_CPQ, Dtb_ForFab, Dtb_Fortie, Dtb_ForTmx, Dtb_ForRb, Dtb_ForPhx, Dtb_ForPhn, Dtb_ForUli, Dtb_Nh2o, EmprCod, ProCod FROM TXPDT005 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Dtb_Ordl = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010I7", "SELECT BarOrdLin, Dtb_UOrd, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?  FOR UPDATE OF Dtb_UOrd NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I8", "SELECT BarOrdLin, Dtb_UOrd, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I9", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I10", "SELECT EmprCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I11", "SELECT /*+ FIRST_ROWS(1) */ TM1.BarOrdLin, T2.EmprNom, TM1.Dtb_UOrd, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod FROM (TXPBARFAS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.ProCod = ? and TM1.BarOrdLin = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, ProCod DESC, BarOrdLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T010I15", "INSERT INTO TXPBARFAS(BarOrdLin, Dtb_UOrd, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarFasCon, BarFasEst, MaqCodBis, BarFacTin, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarHorIni, BarHorFin, BarTieRea, BarFecRIni, BarLoc, BarFasKgm, BarFasMtr, BarFasBot, BarNumBot, BarFasFor, BarFasCoP, BarNPzas, BarFasPzas, BarFasCara, BarUltNlot, BarFasAcab, BarFasInc, BarFasDTI, BarFasDTF, BarFasKPr, BarFasPPr, FasCod, BarFasAgr, BarFasPrp, BarFasFPl, BarFasUsu, BarFasGral, FasQuiUl, BarFasKgT, BarFasMtT, BarMaqPlan, BarFasCR, BarFasTip, BarFasSec, BarfasMn, BarfasOP, BarHdMn, BarTieAut, BarFasNPl, Barfastpp, BarfasUnpL, BarfasRb, BarHdrO, BarfasPri2, BarObsF, BarObsB, BarFasPri, BarFasSer, BarFasObs, BarFasTOb, BarFasBlq, TsSolTLcq, TsSolTFec, TsSolRLcq, TsSolRFec, TsSolObs, SolLvLnUl, SolAgLnUl, SolFrLnUl, SolSAcLnUl, SolSAlLnUl, SolPlLnUl, SolLzLnUl, SolAfLnUl) VALUES(?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', 0, ' ', ' ', 0, 0, ' ', 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPBARFAS")
         ,new UpdateCursor("T010I16", "UPDATE TXPBARFAS SET Dtb_UOrd=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK, "TXPBARFAS")
         ,new UpdateCursor("T010I17", "DELETE FROM TXPBARFAS  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK, "TXPBARFAS")
         ,new ForEachCursor("T010I18", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolAfLn FROM TXPTsSol7 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I19", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolLzLn FROM TXPTsSol6 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I20", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolPlLn FROM TXPTsSol5 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I21", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolSAlLn FROM TXPTsSol4 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I22", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolSAcLn FROM TXPTsSol3 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I23", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolFrLn FROM TXPTsSol2 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I24", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolAgLn FROM TXPTsSolL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I25", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolLvLn FROM TXPTsSol1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I26", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasNb FROM TXPFASBOT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I27", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, PrdNum FROM TXPZEPHYR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I28", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Em_cod FROM TXPCACEMp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I29", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ab_cod FROM TXPCACABp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I30", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ca_cod FROM TXPCACCAp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I31", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Pe_cod FROM TXPCACPEp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I32", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Rm_cod FROM TXPCACRAp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I33", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl FROM TXPDT005 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I34", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I35", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, A_Barcod, A_BarReo, A_BarPar, A_ProCod, A_BarOrd FROM TXPAGRHDF WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I36", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot FROM TXPFASMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I37", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I38", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod FROM TXPBarPar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T010I39", "UPDATE TXPBARFAS SET Dtb_UOrd=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK, "TXPBARFAS")
         ,new ForEachCursor("T010I40", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010I41", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, Dtb_Ordl, Dtb_CPQ, Dtb_ForFab, Dtb_Fortie, Dtb_ForTmx, Dtb_ForRb, Dtb_ForPhx, Dtb_ForPhn, Dtb_ForUli, Dtb_Nh2o, EmprCod, ProCod FROM TXPDT005 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and Dtb_Ordl = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010I42", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl FROM TXPDT005 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Dtb_Ordl = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T010I43", "INSERT INTO TXPDT005(BarCod, BarCodReo, BarCodPar, BarOrdLin, Dtb_Ordl, Dtb_CPQ, Dtb_ForFab, Dtb_Fortie, Dtb_ForTmx, Dtb_ForRb, Dtb_ForPhx, Dtb_ForPhn, Dtb_ForUli, Dtb_Nh2o, EmprCod, ProCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDT005")
         ,new UpdateCursor("T010I44", "UPDATE TXPDT005 SET Dtb_CPQ=?, Dtb_ForFab=?, Dtb_Fortie=?, Dtb_ForTmx=?, Dtb_ForRb=?, Dtb_ForPhx=?, Dtb_ForPhn=?, Dtb_ForUli=?, Dtb_Nh2o=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Dtb_Ordl = ?", GX_NOMASK, "TXPDT005")
         ,new UpdateCursor("T010I45", "DELETE FROM TXPDT005  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Dtb_Ordl = ?", GX_NOMASK, "TXPDT005")
         ,new UpdateCursor("T010I46", "UPDATE TXPDT005 SET Dtb_ForUli=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Dtb_Ordl = ?", GX_NOMASK, "TXPDT005")
         ,new ForEachCursor("T010I47", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl FROM TXPDT005 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010I48", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T1.Dtb_Ordl, T1.Dtb_ForLin, T1.Dtb_Prdnum, T2.ForPrdDsc, T1.Dtb_Forcan, T1.Dtb_clave1, T1.Dtb_clave2, T1.EmprCod, T1.ForPrdUMe, T1.ProCod FROM (TXPDT0051 T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? and T1.Dtb_Ordl = ? and T1.Dtb_ForLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.Dtb_Ordl, T1.Dtb_ForLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010I49", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010I50", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl, Dtb_ForLin FROM TXPDT0051 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Dtb_Ordl = ? AND Dtb_ForLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T010I51", "INSERT INTO TXPDT0051(BarCod, BarCodReo, BarCodPar, BarOrdLin, Dtb_Ordl, Dtb_ForLin, Dtb_Prdnum, Dtb_Forcan, Dtb_clave1, Dtb_clave2, EmprCod, ForPrdUMe, ProCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDT0051")
         ,new UpdateCursor("T010I52", "UPDATE TXPDT0051 SET Dtb_Prdnum=?, Dtb_Forcan=?, Dtb_clave1=?, Dtb_clave2=?, ForPrdUMe=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Dtb_Ordl = ? AND Dtb_ForLin = ?", GX_NOMASK, "TXPDT0051")
         ,new UpdateCursor("T010I53", "DELETE FROM TXPDT0051  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Dtb_Ordl = ? AND Dtb_ForLin = ?", GX_NOMASK, "TXPDT0051")
         ,new ForEachCursor("T010I54", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010I55", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl, Dtb_ForLin FROM TXPDT0051 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and Dtb_Ordl = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl, Dtb_ForLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010I56", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010I57", "SELECT EmprCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 3);
               ((byte[]) buf[15])[0] = rslt.getByte(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 3);
               ((byte[]) buf[15])[0] = rslt.getByte(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(15, 3);
               ((String[]) buf[24])[0] = rslt.getString(16, 8);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(15, 3);
               ((String[]) buf[24])[0] = rslt.getString(16, 8);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 39 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(15, 3);
               ((String[]) buf[24])[0] = rslt.getString(16, 8);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 46 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 3);
               ((byte[]) buf[17])[0] = rslt.getByte(13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 8);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 55 :
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 13 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               stmt.setString(7, (String)parms[7], 8);
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 8);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 37 :
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
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 8);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 41 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 6);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[20]).shortValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[22]).shortValue());
               }
               stmt.setString(15, (String)parms[23], 3);
               stmt.setString(16, (String)parms[24], 8);
               return;
            case 42 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
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
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
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
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               stmt.setString(10, (String)parms[18], 3);
               stmt.setInt(11, ((Number) parms[19]).intValue());
               stmt.setByte(12, ((Number) parms[20]).byteValue());
               stmt.setString(13, (String)parms[21], 1);
               stmt.setString(14, (String)parms[22], 8);
               stmt.setShort(15, ((Number) parms[23]).shortValue());
               stmt.setShort(16, ((Number) parms[24]).shortValue());
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 44 :
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
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 8);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 49 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 6);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 5);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[11], 16);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[13], 30);
               }
               stmt.setString(11, (String)parms[14], 3);
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[16]).byteValue());
               }
               stmt.setString(13, (String)parms[17], 8);
               return;
            case 50 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 16);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 30);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setByte(8, ((Number) parms[12]).byteValue());
               stmt.setString(9, (String)parms[13], 1);
               stmt.setString(10, (String)parms[14], 8);
               stmt.setShort(11, ((Number) parms[15]).shortValue());
               stmt.setShort(12, ((Number) parms[16]).shortValue());
               stmt.setShort(13, ((Number) parms[17]).shortValue());
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

