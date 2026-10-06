package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdt004_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"DTA_DPQ") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7920Dta_CPQ = httpContext.GetPar( "Dta_CPQ") ;
         n7920Dta_CPQ = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asadta_dpq10H1106( A396EmprCod, A7920Dta_CPQ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel9"+"_"+"DTA_PRDNOM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7930Dta_Prdnum = httpContext.GetPar( "Dta_Prdnum") ;
         n7930Dta_Prdnum = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx9asadta_prdnom10H1107( A396EmprCod, A7930Dta_Prdnum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
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
         gxload_19( A396EmprCod, A490ForPrdUMe) ;
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
            A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A758ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A368DisFasLin = (short)(GXutil.lval( httpContext.GetPar( "DisFasLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PQUIMICOS F(PEDIDO)", ""), (short)(0)) ;
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
      nRC_GXsfl_50 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_50"))) ;
      nGXsfl_50_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_50_idx"))) ;
      sGXsfl_50_idx = httpContext.GetPar( "sGXsfl_50_idx") ;
      A7918Dta_UOrd = (short)(GXutil.lval( httpContext.GetPar( "Dta_UOrd"))) ;
      n7918Dta_UOrd = false ;
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
      nRC_GXsfl_112 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_112"))) ;
      nGXsfl_112_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_112_idx"))) ;
      sGXsfl_112_idx = httpContext.GetPar( "sGXsfl_112_idx") ;
      A7928Dta_ForUli = (short)(GXutil.lval( httpContext.GetPar( "Dta_ForUli"))) ;
      n7928Dta_ForUli = false ;
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

   public tdt004_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdt004_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdt004_impl.class ));
   }

   public tdt004_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT004.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT004.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT004.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT004.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDT004.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT004.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDT004.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT004.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDT004.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT004.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDT004.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT004.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDT004.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Linea Fase", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT004.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisFasLin_Internalname, GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisFasLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A368DisFasLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A368DisFasLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFasLin_Jsonclick, 0, "", "", "", "", "", 1, edtDisFasLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDT004.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT004.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Orden PQ", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT004.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDta_UOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A7918Dta_UOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDta_UOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7918Dta_UOrd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7918Dta_UOrd), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDta_UOrd_Jsonclick, 0, "", "", "", "", "", 1, edtDta_UOrd_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDT004.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol50( ) ;
      /* Save parent mode. */
      sMode1106 = Gx_mode ;
      nGXsfl_50_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1106 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1106 = (short)(1) ;
            scanStart10H1106( ) ;
            while ( RcdFound1106 != 0 )
            {
               init_level_properties1106( ) ;
               getByPrimaryKey10H1106( ) ;
               addRow10H1106( ) ;
               scanNext10H1106( ) ;
            }
            scanEnd10H1106( ) ;
            nBlankRcdCount1106 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B7918Dta_UOrd = A7918Dta_UOrd ;
         n7918Dta_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
         standaloneNotModal10H1106( ) ;
         standaloneModal10H1106( ) ;
         sMode1106 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRow10H1106( ) ;
            edtDta_Ordl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_ORDL_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDta_Ordl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_Ordl_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtDta_CPQ_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_CPQ_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDta_CPQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_CPQ_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtDta_DPQ_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_DPQ_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDta_DPQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_DPQ_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtDta_ForFab_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_FORFAB_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDta_ForFab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_ForFab_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtDta_Fortie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_FORTIE_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDta_Fortie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_Fortie_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtDta_ForTmx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_FORTMX_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDta_ForTmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_ForTmx_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtDta_ForRb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_FORRB_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDta_ForRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_ForRb_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtDta_ForPhx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_FORPHX_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDta_ForPhx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_ForPhx_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtDta_ForPhn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_FORPHN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDta_ForPhn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_ForPhn_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtDta_ForUli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_FORULI_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDta_ForUli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_ForUli_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtDta_Nh2o_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_NH2O_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDta_Nh2o_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_Nh2o_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_1106 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal10H1106( ) ;
            }
            sendRow10H1106( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode1106 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A7918Dta_UOrd = B7918Dta_UOrd ;
         n7918Dta_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1106 = (short)(5) ;
         nRcdExists_1106 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart10H1106( ) ;
            while ( RcdFound1106 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_501106( ) ;
               init_level_properties1106( ) ;
               standaloneNotModal10H1106( ) ;
               getByPrimaryKey10H1106( ) ;
               standaloneModal10H1106( ) ;
               addRow10H1106( ) ;
               scanNext10H1106( ) ;
            }
            scanEnd10H1106( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1106 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_501106( ) ;
      initAll10H1106( ) ;
      init_level_properties1106( ) ;
      B7918Dta_UOrd = A7918Dta_UOrd ;
      n7918Dta_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
      nRcdExists_1106 = (short)(0) ;
      nIsMod_1106 = (short)(0) ;
      nRcdDeleted_1106 = (short)(0) ;
      nBlankRcdCount1106 = (short)(nBlankRcdUsr1106+nBlankRcdCount1106) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1106 > 0 )
      {
         standaloneNotModal10H1106( ) ;
         standaloneModal10H1106( ) ;
         addRow10H1106( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtDta_Ordl_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1106 = (short)(nBlankRcdCount1106-1) ;
      }
      Gx_mode = sMode1106 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A7918Dta_UOrd = B7918Dta_UOrd ;
      n7918Dta_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
      /* Restore parent mode. */
      Gx_mode = sMode1106 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT004.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT004.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT004.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT004.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDT004.htm");
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
      e1110H2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
            Z368DisFasLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z368DisFasLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z457FasCod = httpContext.cgiGet( "Z457FasCod") ;
            Z7918Dta_UOrd = (short)(localUtil.ctol( httpContext.cgiGet( "Z7918Dta_UOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A457FasCod = httpContext.cgiGet( "Z457FasCod") ;
            O7918Dta_UOrd = (short)(localUtil.ctol( httpContext.cgiGet( "O7918Dta_UOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A457FasCod = httpContext.cgiGet( "FASCOD") ;
            A7744FasPreObl = (byte)(localUtil.ctol( httpContext.cgiGet( "FASPREOBL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7744FasPreObl = false ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A368DisFasLin = (short)(localUtil.ctol( httpContext.cgiGet( edtDisFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
            A7918Dta_UOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtDta_UOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7918Dta_UOrd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TDT004");
            forbiddenHiddens.add("FasCod", GXutil.rtrim( localUtil.format( A457FasCod, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tdt004:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
               A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               A758ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A368DisFasLin = (short)(GXutil.lval( httpContext.GetPar( "DisFasLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
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
                        e1110H2 ();
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
            initAll10H39( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1107_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1107_Enabled), 5, 0), !bGXsfl_112_Refreshing);
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
      disableAttributes10H39( ) ;
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

   public void confirm_10H0( )
   {
      beforeValidate10H39( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls10H39( ) ;
         }
         else
         {
            checkExtendedTable10H39( ) ;
            if ( AnyError == 0 )
            {
               zm10H39( 14) ;
               zm10H39( 15) ;
               zm10H39( 16) ;
            }
            closeExtendedTableCursors10H39( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode39 = Gx_mode ;
         confirm_10H1106( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode39 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues10H0( ) ;
      }
   }

   public void confirm_10H1107( )
   {
      s7928Dta_ForUli = O7928Dta_ForUli ;
      n7928Dta_ForUli = false ;
      nGXsfl_112_idx = 0 ;
      while ( nGXsfl_112_idx < nRC_GXsfl_112 )
      {
         readRow10H1107( ) ;
         if ( ( nRcdExists_1107 != 0 ) || ( nIsMod_1107 != 0 ) )
         {
            getKey10H1107( ) ;
            if ( ( nRcdExists_1107 == 0 ) && ( nRcdDeleted_1107 == 0 ) )
            {
               if ( RcdFound1107 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate10H1107( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable10H1107( ) ;
                     if ( AnyError == 0 )
                     {
                        zm10H1107( 19) ;
                     }
                     closeExtendedTableCursors10H1107( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O7928Dta_ForUli = A7928Dta_ForUli ;
                     n7928Dta_ForUli = false ;
                  }
               }
               else
               {
                  GXCCtl = "DTA_ORDL_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDta_Ordl_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1107 != 0 )
               {
                  if ( nRcdDeleted_1107 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey10H1107( ) ;
                     load10H1107( ) ;
                     beforeValidate10H1107( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls10H1107( ) ;
                        O7928Dta_ForUli = A7928Dta_ForUli ;
                        n7928Dta_ForUli = false ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1107 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate10H1107( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable10H1107( ) ;
                           if ( AnyError == 0 )
                           {
                              zm10H1107( 19) ;
                           }
                           closeExtendedTableCursors10H1107( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O7928Dta_ForUli = A7928Dta_ForUli ;
                           n7928Dta_ForUli = false ;
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1107 == 0 )
                  {
                     GXCCtl = "DTA_ORDL_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDta_Ordl_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1107_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1107, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDta_ForLin_Internalname, GXutil.ltrim( localUtil.ntoc( A7929Dta_ForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDta_Prdnum_Internalname, GXutil.rtrim( A7930Dta_Prdnum)) ;
         httpContext.changePostValue( edtDta_PrdNom_Internalname, GXutil.rtrim( A7931Dta_PrdNom)) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc)) ;
         httpContext.changePostValue( edtDta_Forcan_Internalname, GXutil.ltrim( localUtil.ntoc( A7932Dta_Forcan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDta_clave1_Internalname, GXutil.rtrim( A8479Dta_clave1)) ;
         httpContext.changePostValue( edtDta_clave2_Internalname, GXutil.rtrim( A8480Dta_clave2)) ;
         httpContext.changePostValue( "ZT_"+"Z7929Dta_ForLin_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( Z7929Dta_ForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7930Dta_Prdnum_"+sGXsfl_112_idx, GXutil.rtrim( Z7930Dta_Prdnum)) ;
         httpContext.changePostValue( "ZT_"+"Z7932Dta_Forcan_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( Z7932Dta_Forcan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8479Dta_clave1_"+sGXsfl_112_idx, GXutil.rtrim( Z8479Dta_clave1)) ;
         httpContext.changePostValue( "ZT_"+"Z8480Dta_clave2_"+sGXsfl_112_idx, GXutil.rtrim( Z8480Dta_clave2)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1107_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1107, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1107_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1107, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1107_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1107, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1107 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1107_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1107_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_FORLIN_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_PRDNUM_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_Prdnum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_PRDNOM_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_PrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDDSC_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_FORCAN_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_Forcan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_CLAVE1_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_clave1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_CLAVE2_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_clave2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O7928Dta_ForUli = s7928Dta_ForUli ;
      n7928Dta_ForUli = false ;
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_10H1106( )
   {
      s7918Dta_UOrd = O7918Dta_UOrd ;
      n7918Dta_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow10H1106( ) ;
         if ( ( nRcdExists_1106 != 0 ) || ( nIsMod_1106 != 0 ) )
         {
            getKey10H1106( ) ;
            if ( ( nRcdExists_1106 == 0 ) && ( nRcdDeleted_1106 == 0 ) )
            {
               if ( RcdFound1106 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate10H1106( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable10H1106( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors10H1106( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode1106 = Gx_mode ;
                        confirm_10H1107( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode1106 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode1106 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     O7918Dta_UOrd = A7918Dta_UOrd ;
                     n7918Dta_UOrd = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "DTA_ORDL_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDta_Ordl_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1106 != 0 )
               {
                  if ( nRcdDeleted_1106 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey10H1106( ) ;
                     load10H1106( ) ;
                     beforeValidate10H1106( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls10H1106( ) ;
                        O7918Dta_UOrd = A7918Dta_UOrd ;
                        n7918Dta_UOrd = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1106 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate10H1106( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable10H1106( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors10H1106( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode1106 = Gx_mode ;
                              confirm_10H1107( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode1106 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode1106 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                           O7918Dta_UOrd = A7918Dta_UOrd ;
                           n7918Dta_UOrd = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1106 == 0 )
                  {
                     GXCCtl = "DTA_ORDL_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDta_Ordl_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtDta_Ordl_Internalname, GXutil.ltrim( localUtil.ntoc( A7919Dta_Ordl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDta_CPQ_Internalname, GXutil.rtrim( A7920Dta_CPQ)) ;
         httpContext.changePostValue( edtDta_DPQ_Internalname, GXutil.rtrim( A7921Dta_DPQ)) ;
         httpContext.changePostValue( edtDta_ForFab_Internalname, GXutil.rtrim( A7922Dta_ForFab)) ;
         httpContext.changePostValue( edtDta_Fortie_Internalname, GXutil.ltrim( localUtil.ntoc( A7923Dta_Fortie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDta_ForTmx_Internalname, GXutil.ltrim( localUtil.ntoc( A7924Dta_ForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDta_ForRb_Internalname, GXutil.ltrim( localUtil.ntoc( A7925Dta_ForRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDta_ForPhx_Internalname, GXutil.ltrim( localUtil.ntoc( A7926Dta_ForPhx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDta_ForPhn_Internalname, GXutil.ltrim( localUtil.ntoc( A7927Dta_ForPhn, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDta_ForUli_Internalname, GXutil.ltrim( localUtil.ntoc( A7928Dta_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDta_Nh2o_Internalname, GXutil.ltrim( localUtil.ntoc( A12112Dta_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7919Dta_Ordl_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z7919Dta_Ordl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7920Dta_CPQ_"+sGXsfl_50_idx, GXutil.rtrim( Z7920Dta_CPQ)) ;
         httpContext.changePostValue( "ZT_"+"Z7922Dta_ForFab_"+sGXsfl_50_idx, GXutil.rtrim( Z7922Dta_ForFab)) ;
         httpContext.changePostValue( "ZT_"+"Z7923Dta_Fortie_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z7923Dta_Fortie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7924Dta_ForTmx_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z7924Dta_ForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7925Dta_ForRb_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z7925Dta_ForRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7926Dta_ForPhx_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z7926Dta_ForPhx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7927Dta_ForPhn_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z7927Dta_ForPhn, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7928Dta_ForUli_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z7928Dta_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12112Dta_Nh2o_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z12112Dta_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T7928Dta_ForUli_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( O7928Dta_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_112_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_112, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1106_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1106, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1106_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1106, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1106_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1106, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1106 != 0 )
         {
            httpContext.changePostValue( "DTA_ORDL_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_Ordl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_CPQ_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_CPQ_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_DPQ_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_DPQ_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_FORFAB_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForFab_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_FORTIE_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_Fortie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_FORTMX_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForTmx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_FORRB_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForRb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_FORPHX_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForPhx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_FORPHN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForPhn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_FORULI_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForUli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_NH2O_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_Nh2o_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O7918Dta_UOrd = s7918Dta_UOrd ;
      n7918Dta_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption10H0( )
   {
   }

   public void e1110H2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tdt004_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tdt004_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tdt004_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdt004_impl.this.A396EmprCod = GXv_char2[0] ;
      tdt004_impl.this.AV11EmprNom = GXv_char3[0] ;
      tdt004_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm10H39( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z457FasCod = T010H8_A457FasCod[0] ;
            Z7918Dta_UOrd = T010H8_A7918Dta_UOrd[0] ;
         }
         else
         {
            Z457FasCod = A457FasCod ;
            Z7918Dta_UOrd = A7918Dta_UOrd ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z457FasCod = A457FasCod ;
         Z368DisFasLin = A368DisFasLin ;
         Z7918Dta_UOrd = A7918Dta_UOrd ;
         Z7744FasPreObl = A7744FasPreObl ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtDta_UOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_UOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_UOrd_Enabled), 5, 0), true);
      AV33Pgmname = "TDT004" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtDta_UOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_UOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_UOrd_Enabled), 5, 0), true);
      /* Using cursor T010H9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T010H9_A407EmprNom[0] ;
      n407EmprNom = T010H9_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(7);
      /* Using cursor T010H10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISLIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
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
      /* Using cursor T010H11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
      }
      A7744FasPreObl = T010H11_A7744FasPreObl[0] ;
      n7744FasPreObl = T010H11_n7744FasPreObl[0] ;
      pr_default.close(9);
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

   public void load10H39( )
   {
      /* Using cursor T010H12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A457FasCod = T010H12_A457FasCod[0] ;
         A407EmprNom = T010H12_A407EmprNom[0] ;
         n407EmprNom = T010H12_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A7918Dta_UOrd = T010H12_A7918Dta_UOrd[0] ;
         n7918Dta_UOrd = T010H12_n7918Dta_UOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
         A7744FasPreObl = T010H12_A7744FasPreObl[0] ;
         n7744FasPreObl = T010H12_n7744FasPreObl[0] ;
         zm10H39( -13) ;
      }
      pr_default.close(10);
      onLoadActions10H39( ) ;
   }

   public void onLoadActions10H39( )
   {
   }

   public void checkExtendedTable10H39( )
   {
      nIsDirty_39 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors10H39( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey10H39( )
   {
      /* Using cursor T010H13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound39 = (short)(1) ;
      }
      else
      {
         RcdFound39 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T010H8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(6) != 101) && ( T010H8_A368DisFasLin[0] == A368DisFasLin ) && ( GXutil.strcmp(T010H8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010H8_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T010H8_A758ProCod[0], A758ProCod) == 0 ) )
      {
         zm10H39( 13) ;
         RcdFound39 = (short)(1) ;
         A457FasCod = T010H8_A457FasCod[0] ;
         A7918Dta_UOrd = T010H8_A7918Dta_UOrd[0] ;
         n7918Dta_UOrd = T010H8_n7918Dta_UOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
         O7918Dta_UOrd = A7918Dta_UOrd ;
         n7918Dta_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load10H39( ) ;
         if ( AnyError == 1 )
         {
            RcdFound39 = (short)(0) ;
            initializeNonKey10H39( ) ;
         }
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound39 = (short)(0) ;
         initializeNonKey10H39( ) ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey10H39( ) ;
      if ( RcdFound39 == 0 )
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
      RcdFound39 = (short)(0) ;
      /* Using cursor T010H14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T010H14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010H14_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T010H14_A758ProCod[0], A758ProCod) == 0 ) && ( T010H14_A368DisFasLin[0] == A368DisFasLin ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T010H14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010H14_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T010H14_A758ProCod[0], A758ProCod) == 0 ) && ( T010H14_A368DisFasLin[0] == A368DisFasLin ) )
         {
            RcdFound39 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound39 = (short)(0) ;
      /* Using cursor T010H15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( GXutil.strcmp(T010H15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010H15_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T010H15_A758ProCod[0], A758ProCod) == 0 ) && ( T010H15_A368DisFasLin[0] == A368DisFasLin ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( GXutil.strcmp(T010H15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010H15_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T010H15_A758ProCod[0], A758ProCod) == 0 ) && ( T010H15_A368DisFasLin[0] == A368DisFasLin ) )
         {
            RcdFound39 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey10H39( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A7918Dta_UOrd = O7918Dta_UOrd ;
         n7918Dta_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
         insert10H39( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound39 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A368DisFasLin != Z368DisFasLin ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A7918Dta_UOrd = O7918Dta_UOrd ;
               n7918Dta_UOrd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A7918Dta_UOrd = O7918Dta_UOrd ;
               n7918Dta_UOrd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
               update10H39( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A368DisFasLin != Z368DisFasLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A7918Dta_UOrd = O7918Dta_UOrd ;
               n7918Dta_UOrd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
               insert10H39( ) ;
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
                  A7918Dta_UOrd = O7918Dta_UOrd ;
                  n7918Dta_UOrd = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
                  insert10H39( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A368DisFasLin != Z368DisFasLin ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A7918Dta_UOrd = O7918Dta_UOrd ;
         n7918Dta_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
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
      getKey10H39( ) ;
      if ( RcdFound39 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A368DisFasLin != Z368DisFasLin ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A368DisFasLin != Z368DisFasLin ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdt004");
   }

   public void insert_check( )
   {
      confirm_10H0( ) ;
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
      if ( RcdFound39 == 0 )
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
      scanStart10H39( ) ;
      if ( RcdFound39 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd10H39( ) ;
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
      if ( RcdFound39 == 0 )
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
      if ( RcdFound39 == 0 )
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
      scanStart10H39( ) ;
      if ( RcdFound39 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound39 != 0 )
         {
            scanNext10H39( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd10H39( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency10H39( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T010H7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) || ( GXutil.strcmp(Z457FasCod, T010H7_A457FasCod[0]) != 0 ) || ( Z7918Dta_UOrd != T010H7_A7918Dta_UOrd[0] ) )
         {
            if ( GXutil.strcmp(Z457FasCod, T010H7_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("tdt004:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T010H7_A457FasCod[0]);
            }
            if ( Z7918Dta_UOrd != T010H7_A7918Dta_UOrd[0] )
            {
               GXutil.writeLogln("tdt004:[seudo value changed for attri]"+"Dta_UOrd");
               GXutil.writeLogRaw("Old: ",Z7918Dta_UOrd);
               GXutil.writeLogRaw("Current: ",T010H7_A7918Dta_UOrd[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert10H39( )
   {
      beforeValidate10H39( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10H39( ) ;
      }
      if ( AnyError == 0 )
      {
         zm10H39( 0) ;
         checkOptimisticConcurrency10H39( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10H39( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert10H39( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010H16 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl), A457FasCod, Short.valueOf(A368DisFasLin), Boolean.valueOf(n7918Dta_UOrd), Short.valueOf(A7918Dta_UOrd), A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                  if ( (pr_default.getStatus(14) == 1) )
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
                        processLevel10H39( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption10H0( ) ;
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
            load10H39( ) ;
         }
         endLevel10H39( ) ;
      }
      closeExtendedTableCursors10H39( ) ;
   }

   public void update10H39( )
   {
      beforeValidate10H39( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10H39( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10H39( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10H39( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate10H39( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010H17 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl), A457FasCod, Boolean.valueOf(n7918Dta_UOrd), Short.valueOf(A7918Dta_UOrd), A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISFAS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate10H39( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel10H39( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption10H0( ) ;
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
         endLevel10H39( ) ;
      }
      closeExtendedTableCursors10H39( ) ;
   }

   public void deferredUpdate10H39( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate10H39( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10H39( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls10H39( ) ;
         afterConfirm10H39( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete10H39( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T010H18 */
               pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound39 == 0 )
                     {
                        initAll10H39( ) ;
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
                     resetCaption10H0( ) ;
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
      sMode39 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel10H39( ) ;
      Gx_mode = sMode39 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls10H39( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T010H19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DT004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T010H20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DisFPA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T010H21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T010H22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AGRDIS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T010H23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISPAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
      }
   }

   public void processNestedLevel10H1106( )
   {
      s7918Dta_UOrd = O7918Dta_UOrd ;
      n7918Dta_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow10H1106( ) ;
         if ( ( nRcdExists_1106 != 0 ) || ( nIsMod_1106 != 0 ) )
         {
            standaloneNotModal10H1106( ) ;
            getKey10H1106( ) ;
            if ( ( nRcdExists_1106 == 0 ) && ( nRcdDeleted_1106 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert10H1106( ) ;
            }
            else
            {
               if ( RcdFound1106 != 0 )
               {
                  if ( ( nRcdDeleted_1106 != 0 ) && ( nRcdExists_1106 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete10H1106( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1106 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update10H1106( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1106 == 0 )
                  {
                     GXCCtl = "DTA_ORDL_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDta_Ordl_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O7918Dta_UOrd = A7918Dta_UOrd ;
            n7918Dta_UOrd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
         }
         httpContext.changePostValue( edtDta_Ordl_Internalname, GXutil.ltrim( localUtil.ntoc( A7919Dta_Ordl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDta_CPQ_Internalname, GXutil.rtrim( A7920Dta_CPQ)) ;
         httpContext.changePostValue( edtDta_DPQ_Internalname, GXutil.rtrim( A7921Dta_DPQ)) ;
         httpContext.changePostValue( edtDta_ForFab_Internalname, GXutil.rtrim( A7922Dta_ForFab)) ;
         httpContext.changePostValue( edtDta_Fortie_Internalname, GXutil.ltrim( localUtil.ntoc( A7923Dta_Fortie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDta_ForTmx_Internalname, GXutil.ltrim( localUtil.ntoc( A7924Dta_ForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDta_ForRb_Internalname, GXutil.ltrim( localUtil.ntoc( A7925Dta_ForRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDta_ForPhx_Internalname, GXutil.ltrim( localUtil.ntoc( A7926Dta_ForPhx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDta_ForPhn_Internalname, GXutil.ltrim( localUtil.ntoc( A7927Dta_ForPhn, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDta_ForUli_Internalname, GXutil.ltrim( localUtil.ntoc( A7928Dta_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDta_Nh2o_Internalname, GXutil.ltrim( localUtil.ntoc( A12112Dta_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7919Dta_Ordl_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z7919Dta_Ordl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7920Dta_CPQ_"+sGXsfl_50_idx, GXutil.rtrim( Z7920Dta_CPQ)) ;
         httpContext.changePostValue( "ZT_"+"Z7922Dta_ForFab_"+sGXsfl_50_idx, GXutil.rtrim( Z7922Dta_ForFab)) ;
         httpContext.changePostValue( "ZT_"+"Z7923Dta_Fortie_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z7923Dta_Fortie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7924Dta_ForTmx_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z7924Dta_ForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7925Dta_ForRb_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z7925Dta_ForRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7926Dta_ForPhx_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z7926Dta_ForPhx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7927Dta_ForPhn_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z7927Dta_ForPhn, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7928Dta_ForUli_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z7928Dta_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12112Dta_Nh2o_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z12112Dta_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T7928Dta_ForUli_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( O7928Dta_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_112_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_112, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1106_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1106, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1106_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1106, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1106_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1106, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1106 != 0 )
         {
            httpContext.changePostValue( "DTA_ORDL_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_Ordl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_CPQ_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_CPQ_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_DPQ_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_DPQ_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_FORFAB_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForFab_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_FORTIE_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_Fortie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_FORTMX_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForTmx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_FORRB_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForRb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_FORPHX_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForPhx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_FORPHN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForPhn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_FORULI_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForUli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_NH2O_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_Nh2o_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll10H1106( ) ;
      if ( AnyError != 0 )
      {
         O7918Dta_UOrd = s7918Dta_UOrd ;
         n7918Dta_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
      }
      nRcdExists_1106 = (short)(0) ;
      nIsMod_1106 = (short)(0) ;
      nRcdDeleted_1106 = (short)(0) ;
   }

   public void processLevel10H39( )
   {
      /* Save parent mode. */
      sMode39 = Gx_mode ;
      processNestedLevel10H1106( ) ;
      if ( AnyError != 0 )
      {
         O7918Dta_UOrd = s7918Dta_UOrd ;
         n7918Dta_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode39 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T010H24 */
      pr_default.execute(22, new Object[] {Boolean.valueOf(n7918Dta_UOrd), Short.valueOf(A7918Dta_UOrd), A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
   }

   public void endLevel10H39( )
   {
      pr_default.close(5);
      if ( AnyError == 0 )
      {
         beforeComplete10H39( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdt004");
         if ( AnyError == 0 )
         {
            confirmValues10H0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdt004");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart10H39( )
   {
      /* Scan By routine */
      /* Using cursor T010H25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound39 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext10H39( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound39 = (short)(1) ;
      }
   }

   public void scanEnd10H39( )
   {
      pr_default.close(23);
   }

   public void afterConfirm10H39( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert10H39( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate10H39( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete10H39( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete10H39( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate10H39( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes10H39( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtDisFasLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), true);
      edtDta_UOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_UOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_UOrd_Enabled), 5, 0), true);
   }

   public void zm10H1106( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7920Dta_CPQ = T010H6_A7920Dta_CPQ[0] ;
            Z7922Dta_ForFab = T010H6_A7922Dta_ForFab[0] ;
            Z7923Dta_Fortie = T010H6_A7923Dta_Fortie[0] ;
            Z7924Dta_ForTmx = T010H6_A7924Dta_ForTmx[0] ;
            Z7925Dta_ForRb = T010H6_A7925Dta_ForRb[0] ;
            Z7926Dta_ForPhx = T010H6_A7926Dta_ForPhx[0] ;
            Z7927Dta_ForPhn = T010H6_A7927Dta_ForPhn[0] ;
            Z7928Dta_ForUli = T010H6_A7928Dta_ForUli[0] ;
            Z12112Dta_Nh2o = T010H6_A12112Dta_Nh2o[0] ;
         }
         else
         {
            Z7920Dta_CPQ = A7920Dta_CPQ ;
            Z7922Dta_ForFab = A7922Dta_ForFab ;
            Z7923Dta_Fortie = A7923Dta_Fortie ;
            Z7924Dta_ForTmx = A7924Dta_ForTmx ;
            Z7925Dta_ForRb = A7925Dta_ForRb ;
            Z7926Dta_ForPhx = A7926Dta_ForPhx ;
            Z7927Dta_ForPhn = A7927Dta_ForPhn ;
            Z7928Dta_ForUli = A7928Dta_ForUli ;
            Z12112Dta_Nh2o = A12112Dta_Nh2o ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         Z7919Dta_Ordl = A7919Dta_Ordl ;
         Z7920Dta_CPQ = A7920Dta_CPQ ;
         Z7922Dta_ForFab = A7922Dta_ForFab ;
         Z7923Dta_Fortie = A7923Dta_Fortie ;
         Z7924Dta_ForTmx = A7924Dta_ForTmx ;
         Z7925Dta_ForRb = A7925Dta_ForRb ;
         Z7926Dta_ForPhx = A7926Dta_ForPhx ;
         Z7927Dta_ForPhn = A7927Dta_ForPhn ;
         Z7928Dta_ForUli = A7928Dta_ForUli ;
         Z12112Dta_Nh2o = A12112Dta_Nh2o ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal10H1106( )
   {
      edtDta_ForUli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_ForUli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_ForUli_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtDta_UOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_UOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_UOrd_Enabled), 5, 0), true);
      edtDta_UOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_UOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_UOrd_Enabled), 5, 0), true);
   }

   public void standaloneModal10H1106( )
   {
      if ( isIns( )  )
      {
         A7918Dta_UOrd = (short)(O7918Dta_UOrd+10) ;
         n7918Dta_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A7919Dta_Ordl = A7918Dta_UOrd ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDta_Ordl_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDta_Ordl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_Ordl_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtDta_Ordl_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDta_Ordl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_Ordl_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void load10H1106( )
   {
      /* Using cursor T010H26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7919Dta_Ordl)});
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1106 = (short)(1) ;
         A7920Dta_CPQ = T010H26_A7920Dta_CPQ[0] ;
         n7920Dta_CPQ = T010H26_n7920Dta_CPQ[0] ;
         A7922Dta_ForFab = T010H26_A7922Dta_ForFab[0] ;
         n7922Dta_ForFab = T010H26_n7922Dta_ForFab[0] ;
         A7923Dta_Fortie = T010H26_A7923Dta_Fortie[0] ;
         n7923Dta_Fortie = T010H26_n7923Dta_Fortie[0] ;
         A7924Dta_ForTmx = T010H26_A7924Dta_ForTmx[0] ;
         n7924Dta_ForTmx = T010H26_n7924Dta_ForTmx[0] ;
         A7925Dta_ForRb = T010H26_A7925Dta_ForRb[0] ;
         n7925Dta_ForRb = T010H26_n7925Dta_ForRb[0] ;
         A7926Dta_ForPhx = T010H26_A7926Dta_ForPhx[0] ;
         n7926Dta_ForPhx = T010H26_n7926Dta_ForPhx[0] ;
         A7927Dta_ForPhn = T010H26_A7927Dta_ForPhn[0] ;
         n7927Dta_ForPhn = T010H26_n7927Dta_ForPhn[0] ;
         A7928Dta_ForUli = T010H26_A7928Dta_ForUli[0] ;
         n7928Dta_ForUli = T010H26_n7928Dta_ForUli[0] ;
         A12112Dta_Nh2o = T010H26_A12112Dta_Nh2o[0] ;
         n12112Dta_Nh2o = T010H26_n12112Dta_Nh2o[0] ;
         zm10H1106( -17) ;
      }
      pr_default.close(24);
      onLoadActions10H1106( ) ;
   }

   public void onLoadActions10H1106( )
   {
      GXt_char1 = A7921Dta_DPQ ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7920Dta_CPQ ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd3(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt004_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt004_impl.this.A7920Dta_CPQ = GXv_char3[0] ;
      tdt004_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7921Dta_DPQ = GXt_char1 ;
   }

   public void checkExtendedTable10H1106( )
   {
      nIsDirty_1106 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal10H1106( ) ;
      nIsDirty_1106 = (short)(1) ;
      GXt_char1 = A7921Dta_DPQ ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7920Dta_CPQ ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd3(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt004_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt004_impl.this.A7920Dta_CPQ = GXv_char3[0] ;
      tdt004_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7921Dta_DPQ = GXt_char1 ;
      if ( ( GXutil.strcmp(A7921Dta_DPQ, httpContext.getMessage( "Error", "")) == 0 ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Inexistente", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors10H1106( )
   {
   }

   public void enableDisable10H1106( )
   {
   }

   public void getKey10H1106( )
   {
      /* Using cursor T010H27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7919Dta_Ordl)});
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1106 = (short)(1) ;
      }
      else
      {
         RcdFound1106 = (short)(0) ;
      }
      pr_default.close(25);
   }

   public void getByPrimaryKey10H1106( )
   {
      /* Using cursor T010H6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7919Dta_Ordl)});
      if ( (pr_default.getStatus(4) != 101) && ( T010H6_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T010H6_A758ProCod[0], A758ProCod) == 0 ) && ( T010H6_A368DisFasLin[0] == A368DisFasLin ) && ( GXutil.strcmp(T010H6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm10H1106( 17) ;
         RcdFound1106 = (short)(1) ;
         initializeNonKey10H1106( ) ;
         A7919Dta_Ordl = T010H6_A7919Dta_Ordl[0] ;
         A7920Dta_CPQ = T010H6_A7920Dta_CPQ[0] ;
         n7920Dta_CPQ = T010H6_n7920Dta_CPQ[0] ;
         A7922Dta_ForFab = T010H6_A7922Dta_ForFab[0] ;
         n7922Dta_ForFab = T010H6_n7922Dta_ForFab[0] ;
         A7923Dta_Fortie = T010H6_A7923Dta_Fortie[0] ;
         n7923Dta_Fortie = T010H6_n7923Dta_Fortie[0] ;
         A7924Dta_ForTmx = T010H6_A7924Dta_ForTmx[0] ;
         n7924Dta_ForTmx = T010H6_n7924Dta_ForTmx[0] ;
         A7925Dta_ForRb = T010H6_A7925Dta_ForRb[0] ;
         n7925Dta_ForRb = T010H6_n7925Dta_ForRb[0] ;
         A7926Dta_ForPhx = T010H6_A7926Dta_ForPhx[0] ;
         n7926Dta_ForPhx = T010H6_n7926Dta_ForPhx[0] ;
         A7927Dta_ForPhn = T010H6_A7927Dta_ForPhn[0] ;
         n7927Dta_ForPhn = T010H6_n7927Dta_ForPhn[0] ;
         A7928Dta_ForUli = T010H6_A7928Dta_ForUli[0] ;
         n7928Dta_ForUli = T010H6_n7928Dta_ForUli[0] ;
         A12112Dta_Nh2o = T010H6_A12112Dta_Nh2o[0] ;
         n12112Dta_Nh2o = T010H6_n12112Dta_Nh2o[0] ;
         O7928Dta_ForUli = A7928Dta_ForUli ;
         n7928Dta_ForUli = false ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         Z7919Dta_Ordl = A7919Dta_Ordl ;
         sMode1106 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal10H1106( ) ;
         load10H1106( ) ;
         Gx_mode = sMode1106 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1106 = (short)(0) ;
         initializeNonKey10H1106( ) ;
         sMode1106 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal10H1106( ) ;
         Gx_mode = sMode1106 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes10H1106( ) ;
      }
      pr_default.close(4);
   }

   public void checkOptimisticConcurrency10H1106( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T010H5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7919Dta_Ordl)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDT004"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z7920Dta_CPQ, T010H5_A7920Dta_CPQ[0]) != 0 ) || ( GXutil.strcmp(Z7922Dta_ForFab, T010H5_A7922Dta_ForFab[0]) != 0 ) || ( Z7923Dta_Fortie != T010H5_A7923Dta_Fortie[0] ) || ( Z7924Dta_ForTmx != T010H5_A7924Dta_ForTmx[0] ) || ( DecimalUtil.compareTo(Z7925Dta_ForRb, T010H5_A7925Dta_ForRb[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z7926Dta_ForPhx, T010H5_A7926Dta_ForPhx[0]) != 0 ) || ( DecimalUtil.compareTo(Z7927Dta_ForPhn, T010H5_A7927Dta_ForPhn[0]) != 0 ) || ( Z7928Dta_ForUli != T010H5_A7928Dta_ForUli[0] ) || ( Z12112Dta_Nh2o != T010H5_A12112Dta_Nh2o[0] ) )
         {
            if ( GXutil.strcmp(Z7920Dta_CPQ, T010H5_A7920Dta_CPQ[0]) != 0 )
            {
               GXutil.writeLogln("tdt004:[seudo value changed for attri]"+"Dta_CPQ");
               GXutil.writeLogRaw("Old: ",Z7920Dta_CPQ);
               GXutil.writeLogRaw("Current: ",T010H5_A7920Dta_CPQ[0]);
            }
            if ( GXutil.strcmp(Z7922Dta_ForFab, T010H5_A7922Dta_ForFab[0]) != 0 )
            {
               GXutil.writeLogln("tdt004:[seudo value changed for attri]"+"Dta_ForFab");
               GXutil.writeLogRaw("Old: ",Z7922Dta_ForFab);
               GXutil.writeLogRaw("Current: ",T010H5_A7922Dta_ForFab[0]);
            }
            if ( Z7923Dta_Fortie != T010H5_A7923Dta_Fortie[0] )
            {
               GXutil.writeLogln("tdt004:[seudo value changed for attri]"+"Dta_Fortie");
               GXutil.writeLogRaw("Old: ",Z7923Dta_Fortie);
               GXutil.writeLogRaw("Current: ",T010H5_A7923Dta_Fortie[0]);
            }
            if ( Z7924Dta_ForTmx != T010H5_A7924Dta_ForTmx[0] )
            {
               GXutil.writeLogln("tdt004:[seudo value changed for attri]"+"Dta_ForTmx");
               GXutil.writeLogRaw("Old: ",Z7924Dta_ForTmx);
               GXutil.writeLogRaw("Current: ",T010H5_A7924Dta_ForTmx[0]);
            }
            if ( DecimalUtil.compareTo(Z7925Dta_ForRb, T010H5_A7925Dta_ForRb[0]) != 0 )
            {
               GXutil.writeLogln("tdt004:[seudo value changed for attri]"+"Dta_ForRb");
               GXutil.writeLogRaw("Old: ",Z7925Dta_ForRb);
               GXutil.writeLogRaw("Current: ",T010H5_A7925Dta_ForRb[0]);
            }
            if ( DecimalUtil.compareTo(Z7926Dta_ForPhx, T010H5_A7926Dta_ForPhx[0]) != 0 )
            {
               GXutil.writeLogln("tdt004:[seudo value changed for attri]"+"Dta_ForPhx");
               GXutil.writeLogRaw("Old: ",Z7926Dta_ForPhx);
               GXutil.writeLogRaw("Current: ",T010H5_A7926Dta_ForPhx[0]);
            }
            if ( DecimalUtil.compareTo(Z7927Dta_ForPhn, T010H5_A7927Dta_ForPhn[0]) != 0 )
            {
               GXutil.writeLogln("tdt004:[seudo value changed for attri]"+"Dta_ForPhn");
               GXutil.writeLogRaw("Old: ",Z7927Dta_ForPhn);
               GXutil.writeLogRaw("Current: ",T010H5_A7927Dta_ForPhn[0]);
            }
            if ( Z7928Dta_ForUli != T010H5_A7928Dta_ForUli[0] )
            {
               GXutil.writeLogln("tdt004:[seudo value changed for attri]"+"Dta_ForUli");
               GXutil.writeLogRaw("Old: ",Z7928Dta_ForUli);
               GXutil.writeLogRaw("Current: ",T010H5_A7928Dta_ForUli[0]);
            }
            if ( Z12112Dta_Nh2o != T010H5_A12112Dta_Nh2o[0] )
            {
               GXutil.writeLogln("tdt004:[seudo value changed for attri]"+"Dta_Nh2o");
               GXutil.writeLogRaw("Old: ",Z12112Dta_Nh2o);
               GXutil.writeLogRaw("Current: ",T010H5_A12112Dta_Nh2o[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDT004"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert10H1106( )
   {
      beforeValidate10H1106( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10H1106( ) ;
      }
      if ( AnyError == 0 )
      {
         zm10H1106( 0) ;
         checkOptimisticConcurrency10H1106( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10H1106( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert10H1106( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010H28 */
                  pr_default.execute(26, new Object[] {Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7919Dta_Ordl), Boolean.valueOf(n7920Dta_CPQ), A7920Dta_CPQ, Boolean.valueOf(n7922Dta_ForFab), A7922Dta_ForFab, Boolean.valueOf(n7923Dta_Fortie), Short.valueOf(A7923Dta_Fortie), Boolean.valueOf(n7924Dta_ForTmx), Short.valueOf(A7924Dta_ForTmx), Boolean.valueOf(n7925Dta_ForRb), A7925Dta_ForRb, Boolean.valueOf(n7926Dta_ForPhx), A7926Dta_ForPhx, Boolean.valueOf(n7927Dta_ForPhn), A7927Dta_ForPhn, Boolean.valueOf(n7928Dta_ForUli), Short.valueOf(A7928Dta_ForUli), Boolean.valueOf(n12112Dta_Nh2o), Short.valueOf(A12112Dta_Nh2o), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT004");
                  if ( (pr_default.getStatus(26) == 1) )
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
                        processLevel10H1106( ) ;
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
            load10H1106( ) ;
         }
         endLevel10H1106( ) ;
      }
      closeExtendedTableCursors10H1106( ) ;
   }

   public void update10H1106( )
   {
      beforeValidate10H1106( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10H1106( ) ;
      }
      if ( ( nIsMod_1106 != 0 ) || ( nIsDirty_1106 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency10H1106( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm10H1106( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate10H1106( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T010H29 */
                     pr_default.execute(27, new Object[] {Boolean.valueOf(n7920Dta_CPQ), A7920Dta_CPQ, Boolean.valueOf(n7922Dta_ForFab), A7922Dta_ForFab, Boolean.valueOf(n7923Dta_Fortie), Short.valueOf(A7923Dta_Fortie), Boolean.valueOf(n7924Dta_ForTmx), Short.valueOf(A7924Dta_ForTmx), Boolean.valueOf(n7925Dta_ForRb), A7925Dta_ForRb, Boolean.valueOf(n7926Dta_ForPhx), A7926Dta_ForPhx, Boolean.valueOf(n7927Dta_ForPhn), A7927Dta_ForPhn, Boolean.valueOf(n7928Dta_ForUli), Short.valueOf(A7928Dta_ForUli), Boolean.valueOf(n12112Dta_Nh2o), Short.valueOf(A12112Dta_Nh2o), A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7919Dta_Ordl)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT004");
                     if ( (pr_default.getStatus(27) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDT004"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate10H1106( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel10H1106( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey10H1106( ) ;
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
            endLevel10H1106( ) ;
         }
      }
      closeExtendedTableCursors10H1106( ) ;
   }

   public void deferredUpdate10H1106( )
   {
   }

   public void delete10H1106( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate10H1106( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10H1106( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls10H1106( ) ;
         afterConfirm10H1106( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete10H1106( ) ;
            if ( AnyError == 0 )
            {
               A7928Dta_ForUli = O7928Dta_ForUli ;
               n7928Dta_ForUli = false ;
               scanStart10H1107( ) ;
               while ( RcdFound1107 != 0 )
               {
                  getByPrimaryKey10H1107( ) ;
                  delete10H1107( ) ;
                  scanNext10H1107( ) ;
                  O7928Dta_ForUli = A7928Dta_ForUli ;
                  n7928Dta_ForUli = false ;
               }
               scanEnd10H1107( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010H30 */
                  pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7919Dta_Ordl)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT004");
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
      sMode1106 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel10H1106( ) ;
      Gx_mode = sMode1106 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls10H1106( )
   {
      standaloneModal10H1106( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A7921Dta_DPQ ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A7920Dta_CPQ ;
         GXv_char2[0] = GXt_char1 ;
         new app.ppreqd3(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         tdt004_impl.this.A396EmprCod = GXv_char4[0] ;
         tdt004_impl.this.A7920Dta_CPQ = GXv_char3[0] ;
         tdt004_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7921Dta_DPQ = GXt_char1 ;
      }
   }

   public void processNestedLevel10H1107( )
   {
      s7928Dta_ForUli = O7928Dta_ForUli ;
      n7928Dta_ForUli = false ;
      nGXsfl_112_idx = 0 ;
      while ( nGXsfl_112_idx < nRC_GXsfl_112 )
      {
         readRow10H1107( ) ;
         if ( ( nRcdExists_1107 != 0 ) || ( nIsMod_1107 != 0 ) )
         {
            standaloneNotModal10H1107( ) ;
            getKey10H1107( ) ;
            if ( ( nRcdExists_1107 == 0 ) && ( nRcdDeleted_1107 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert10H1107( ) ;
            }
            else
            {
               if ( RcdFound1107 != 0 )
               {
                  if ( ( nRcdDeleted_1107 != 0 ) && ( nRcdExists_1107 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete10H1107( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1107 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update10H1107( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1107 == 0 )
                  {
                     GXCCtl = "DTA_ORDL_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDta_Ordl_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O7928Dta_ForUli = A7928Dta_ForUli ;
            n7928Dta_ForUli = false ;
         }
         httpContext.changePostValue( edtavnRcdDeleted_1107_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1107, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDta_ForLin_Internalname, GXutil.ltrim( localUtil.ntoc( A7929Dta_ForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDta_Prdnum_Internalname, GXutil.rtrim( A7930Dta_Prdnum)) ;
         httpContext.changePostValue( edtDta_PrdNom_Internalname, GXutil.rtrim( A7931Dta_PrdNom)) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc)) ;
         httpContext.changePostValue( edtDta_Forcan_Internalname, GXutil.ltrim( localUtil.ntoc( A7932Dta_Forcan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDta_clave1_Internalname, GXutil.rtrim( A8479Dta_clave1)) ;
         httpContext.changePostValue( edtDta_clave2_Internalname, GXutil.rtrim( A8480Dta_clave2)) ;
         httpContext.changePostValue( "ZT_"+"Z7929Dta_ForLin_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( Z7929Dta_ForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7930Dta_Prdnum_"+sGXsfl_112_idx, GXutil.rtrim( Z7930Dta_Prdnum)) ;
         httpContext.changePostValue( "ZT_"+"Z7932Dta_Forcan_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( Z7932Dta_Forcan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8479Dta_clave1_"+sGXsfl_112_idx, GXutil.rtrim( Z8479Dta_clave1)) ;
         httpContext.changePostValue( "ZT_"+"Z8480Dta_clave2_"+sGXsfl_112_idx, GXutil.rtrim( Z8480Dta_clave2)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1107_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1107, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1107_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1107, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1107_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1107, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1107 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1107_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1107_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_FORLIN_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_PRDNUM_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_Prdnum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_PRDNOM_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_PrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDDSC_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_FORCAN_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_Forcan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_CLAVE1_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_clave1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTA_CLAVE2_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_clave2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll10H1107( ) ;
      if ( AnyError != 0 )
      {
         O7928Dta_ForUli = s7928Dta_ForUli ;
         n7928Dta_ForUli = false ;
      }
      nRcdExists_1107 = (short)(0) ;
      nIsMod_1107 = (short)(0) ;
      nRcdDeleted_1107 = (short)(0) ;
   }

   public void processLevel10H1106( )
   {
      /* Save parent mode. */
      sMode1106 = Gx_mode ;
      processNestedLevel10H1107( ) ;
      if ( AnyError != 0 )
      {
         O7928Dta_ForUli = s7928Dta_ForUli ;
         n7928Dta_ForUli = false ;
      }
      /* Restore parent mode. */
      Gx_mode = sMode1106 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T010H31 */
      pr_default.execute(29, new Object[] {Boolean.valueOf(n7928Dta_ForUli), Short.valueOf(A7928Dta_ForUli), A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7919Dta_Ordl)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT004");
   }

   public void endLevel10H1106( )
   {
      pr_default.close(3);
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart10H1106( )
   {
      /* Scan By routine */
      /* Using cursor T010H32 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      RcdFound1106 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1106 = (short)(1) ;
         A7919Dta_Ordl = T010H32_A7919Dta_Ordl[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext10H1106( )
   {
      /* Scan next routine */
      pr_default.readNext(30);
      RcdFound1106 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1106 = (short)(1) ;
         A7919Dta_Ordl = T010H32_A7919Dta_Ordl[0] ;
      }
   }

   public void scanEnd10H1106( )
   {
      pr_default.close(30);
   }

   public void afterConfirm10H1106( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert10H1106( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate10H1106( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete10H1106( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete10H1106( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate10H1106( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes10H1106( )
   {
      edtDta_Ordl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_Ordl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_Ordl_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtDta_CPQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_CPQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_CPQ_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtDta_DPQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_DPQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_DPQ_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtDta_ForFab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_ForFab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_ForFab_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtDta_Fortie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_Fortie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_Fortie_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtDta_ForTmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_ForTmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_ForTmx_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtDta_ForRb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_ForRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_ForRb_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtDta_ForPhx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_ForPhx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_ForPhx_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtDta_ForPhn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_ForPhn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_ForPhn_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtDta_ForUli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_ForUli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_ForUli_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtDta_Nh2o_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_Nh2o_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_Nh2o_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void zm10H1107( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7930Dta_Prdnum = T010H3_A7930Dta_Prdnum[0] ;
            Z7932Dta_Forcan = T010H3_A7932Dta_Forcan[0] ;
            Z8479Dta_clave1 = T010H3_A8479Dta_clave1[0] ;
            Z8480Dta_clave2 = T010H3_A8480Dta_clave2[0] ;
            Z490ForPrdUMe = T010H3_A490ForPrdUMe[0] ;
         }
         else
         {
            Z7930Dta_Prdnum = A7930Dta_Prdnum ;
            Z7932Dta_Forcan = A7932Dta_Forcan ;
            Z8479Dta_clave1 = A8479Dta_clave1 ;
            Z8480Dta_clave2 = A8480Dta_clave2 ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( GX_JID == -18 )
      {
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         Z7919Dta_Ordl = A7919Dta_Ordl ;
         Z7929Dta_ForLin = A7929Dta_ForLin ;
         Z7930Dta_Prdnum = A7930Dta_Prdnum ;
         Z7932Dta_Forcan = A7932Dta_Forcan ;
         Z8479Dta_clave1 = A8479Dta_clave1 ;
         Z8480Dta_clave2 = A8480Dta_clave2 ;
         Z396EmprCod = A396EmprCod ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z488ForPrdDsc = A488ForPrdDsc ;
      }
   }

   public void standaloneNotModal10H1107( )
   {
      edtDta_ForUli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_ForUli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_ForUli_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void standaloneModal10H1107( )
   {
      if ( isIns( )  )
      {
         A7928Dta_ForUli = (short)(O7928Dta_ForUli+1) ;
         n7928Dta_ForUli = false ;
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A7929Dta_ForLin = A7928Dta_ForUli ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDta_ForLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDta_ForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_ForLin_Enabled), 5, 0), !bGXsfl_112_Refreshing);
      }
      else
      {
         edtDta_ForLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDta_ForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_ForLin_Enabled), 5, 0), !bGXsfl_112_Refreshing);
      }
   }

   public void load10H1107( )
   {
      /* Using cursor T010H33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7919Dta_Ordl), Short.valueOf(A7929Dta_ForLin)});
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1107 = (short)(1) ;
         A7930Dta_Prdnum = T010H33_A7930Dta_Prdnum[0] ;
         n7930Dta_Prdnum = T010H33_n7930Dta_Prdnum[0] ;
         A488ForPrdDsc = T010H33_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T010H33_n488ForPrdDsc[0] ;
         A7932Dta_Forcan = T010H33_A7932Dta_Forcan[0] ;
         n7932Dta_Forcan = T010H33_n7932Dta_Forcan[0] ;
         A8479Dta_clave1 = T010H33_A8479Dta_clave1[0] ;
         n8479Dta_clave1 = T010H33_n8479Dta_clave1[0] ;
         A8480Dta_clave2 = T010H33_A8480Dta_clave2[0] ;
         n8480Dta_clave2 = T010H33_n8480Dta_clave2[0] ;
         A490ForPrdUMe = T010H33_A490ForPrdUMe[0] ;
         n490ForPrdUMe = T010H33_n490ForPrdUMe[0] ;
         zm10H1107( -18) ;
      }
      pr_default.close(31);
      onLoadActions10H1107( ) ;
   }

   public void onLoadActions10H1107( )
   {
      GXt_char1 = A7931Dta_PrdNom ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7930Dta_Prdnum ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt004_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt004_impl.this.A7930Dta_Prdnum = GXv_char3[0] ;
      tdt004_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7931Dta_PrdNom = GXt_char1 ;
   }

   public void checkExtendedTable10H1107( )
   {
      nIsDirty_1107 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal10H1107( ) ;
      /* Using cursor T010H4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_112_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T010H4_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T010H4_n488ForPrdDsc[0] ;
      pr_default.close(2);
      nIsDirty_1107 = (short)(1) ;
      GXt_char1 = A7931Dta_PrdNom ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7930Dta_Prdnum ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt004_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt004_impl.this.A7930Dta_Prdnum = GXv_char3[0] ;
      tdt004_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7931Dta_PrdNom = GXt_char1 ;
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_112_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors10H1107( )
   {
      pr_default.close(2);
   }

   public void enableDisable10H1107( )
   {
   }

   public void gxload_19( String A396EmprCod ,
                          byte A490ForPrdUMe )
   {
      /* Using cursor T010H34 */
      pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(32) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_112_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T010H34_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T010H34_n488ForPrdDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A488ForPrdDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(32) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(32);
   }

   public void getKey10H1107( )
   {
      /* Using cursor T010H35 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7919Dta_Ordl), Short.valueOf(A7929Dta_ForLin)});
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound1107 = (short)(1) ;
      }
      else
      {
         RcdFound1107 = (short)(0) ;
      }
      pr_default.close(33);
   }

   public void getByPrimaryKey10H1107( )
   {
      /* Using cursor T010H3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7919Dta_Ordl), Short.valueOf(A7929Dta_ForLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T010H3_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T010H3_A758ProCod[0], A758ProCod) == 0 ) && ( T010H3_A368DisFasLin[0] == A368DisFasLin ) && ( GXutil.strcmp(T010H3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm10H1107( 18) ;
         RcdFound1107 = (short)(1) ;
         initializeNonKey10H1107( ) ;
         A7929Dta_ForLin = T010H3_A7929Dta_ForLin[0] ;
         A7930Dta_Prdnum = T010H3_A7930Dta_Prdnum[0] ;
         n7930Dta_Prdnum = T010H3_n7930Dta_Prdnum[0] ;
         A7932Dta_Forcan = T010H3_A7932Dta_Forcan[0] ;
         n7932Dta_Forcan = T010H3_n7932Dta_Forcan[0] ;
         A8479Dta_clave1 = T010H3_A8479Dta_clave1[0] ;
         n8479Dta_clave1 = T010H3_n8479Dta_clave1[0] ;
         A8480Dta_clave2 = T010H3_A8480Dta_clave2[0] ;
         n8480Dta_clave2 = T010H3_n8480Dta_clave2[0] ;
         A490ForPrdUMe = T010H3_A490ForPrdUMe[0] ;
         n490ForPrdUMe = T010H3_n490ForPrdUMe[0] ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         Z7919Dta_Ordl = A7919Dta_Ordl ;
         Z7929Dta_ForLin = A7929Dta_ForLin ;
         sMode1107 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal10H1107( ) ;
         load10H1107( ) ;
         Gx_mode = sMode1107 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1107 = (short)(0) ;
         initializeNonKey10H1107( ) ;
         sMode1107 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal10H1107( ) ;
         Gx_mode = sMode1107 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes10H1107( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency10H1107( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T010H2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7919Dta_Ordl), Short.valueOf(A7929Dta_ForLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDT0041"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z7930Dta_Prdnum, T010H2_A7930Dta_Prdnum[0]) != 0 ) || ( DecimalUtil.compareTo(Z7932Dta_Forcan, T010H2_A7932Dta_Forcan[0]) != 0 ) || ( GXutil.strcmp(Z8479Dta_clave1, T010H2_A8479Dta_clave1[0]) != 0 ) || ( GXutil.strcmp(Z8480Dta_clave2, T010H2_A8480Dta_clave2[0]) != 0 ) || ( Z490ForPrdUMe != T010H2_A490ForPrdUMe[0] ) )
         {
            if ( GXutil.strcmp(Z7930Dta_Prdnum, T010H2_A7930Dta_Prdnum[0]) != 0 )
            {
               GXutil.writeLogln("tdt004:[seudo value changed for attri]"+"Dta_Prdnum");
               GXutil.writeLogRaw("Old: ",Z7930Dta_Prdnum);
               GXutil.writeLogRaw("Current: ",T010H2_A7930Dta_Prdnum[0]);
            }
            if ( DecimalUtil.compareTo(Z7932Dta_Forcan, T010H2_A7932Dta_Forcan[0]) != 0 )
            {
               GXutil.writeLogln("tdt004:[seudo value changed for attri]"+"Dta_Forcan");
               GXutil.writeLogRaw("Old: ",Z7932Dta_Forcan);
               GXutil.writeLogRaw("Current: ",T010H2_A7932Dta_Forcan[0]);
            }
            if ( GXutil.strcmp(Z8479Dta_clave1, T010H2_A8479Dta_clave1[0]) != 0 )
            {
               GXutil.writeLogln("tdt004:[seudo value changed for attri]"+"Dta_clave1");
               GXutil.writeLogRaw("Old: ",Z8479Dta_clave1);
               GXutil.writeLogRaw("Current: ",T010H2_A8479Dta_clave1[0]);
            }
            if ( GXutil.strcmp(Z8480Dta_clave2, T010H2_A8480Dta_clave2[0]) != 0 )
            {
               GXutil.writeLogln("tdt004:[seudo value changed for attri]"+"Dta_clave2");
               GXutil.writeLogRaw("Old: ",Z8480Dta_clave2);
               GXutil.writeLogRaw("Current: ",T010H2_A8480Dta_clave2[0]);
            }
            if ( Z490ForPrdUMe != T010H2_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("tdt004:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T010H2_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDT0041"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert10H1107( )
   {
      beforeValidate10H1107( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10H1107( ) ;
      }
      if ( AnyError == 0 )
      {
         zm10H1107( 0) ;
         checkOptimisticConcurrency10H1107( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10H1107( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert10H1107( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010H36 */
                  pr_default.execute(34, new Object[] {Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7919Dta_Ordl), Short.valueOf(A7929Dta_ForLin), Boolean.valueOf(n7930Dta_Prdnum), A7930Dta_Prdnum, Boolean.valueOf(n7932Dta_Forcan), A7932Dta_Forcan, Boolean.valueOf(n8479Dta_clave1), A8479Dta_clave1, Boolean.valueOf(n8480Dta_clave2), A8480Dta_clave2, A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0041");
                  if ( (pr_default.getStatus(34) == 1) )
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
            load10H1107( ) ;
         }
         endLevel10H1107( ) ;
      }
      closeExtendedTableCursors10H1107( ) ;
   }

   public void update10H1107( )
   {
      beforeValidate10H1107( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10H1107( ) ;
      }
      if ( ( nIsMod_1107 != 0 ) || ( nIsDirty_1107 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency10H1107( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm10H1107( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate10H1107( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T010H37 */
                     pr_default.execute(35, new Object[] {Boolean.valueOf(n7930Dta_Prdnum), A7930Dta_Prdnum, Boolean.valueOf(n7932Dta_Forcan), A7932Dta_Forcan, Boolean.valueOf(n8479Dta_clave1), A8479Dta_clave1, Boolean.valueOf(n8480Dta_clave2), A8480Dta_clave2, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7919Dta_Ordl), Short.valueOf(A7929Dta_ForLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0041");
                     if ( (pr_default.getStatus(35) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDT0041"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate10H1107( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey10H1107( ) ;
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
            endLevel10H1107( ) ;
         }
      }
      closeExtendedTableCursors10H1107( ) ;
   }

   public void deferredUpdate10H1107( )
   {
   }

   public void delete10H1107( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate10H1107( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10H1107( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls10H1107( ) ;
         afterConfirm10H1107( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete10H1107( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T010H38 */
               pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7919Dta_Ordl), Short.valueOf(A7929Dta_ForLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0041");
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
      sMode1107 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel10H1107( ) ;
      Gx_mode = sMode1107 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls10H1107( )
   {
      standaloneModal10H1107( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A7931Dta_PrdNom ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A7930Dta_Prdnum ;
         GXv_char2[0] = GXt_char1 ;
         new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         tdt004_impl.this.A396EmprCod = GXv_char4[0] ;
         tdt004_impl.this.A7930Dta_Prdnum = GXv_char3[0] ;
         tdt004_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7931Dta_PrdNom = GXt_char1 ;
         /* Using cursor T010H39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T010H39_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T010H39_n488ForPrdDsc[0] ;
         pr_default.close(37);
      }
   }

   public void endLevel10H1107( )
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

   public void scanStart10H1107( )
   {
      /* Scan By routine */
      /* Using cursor T010H40 */
      pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7919Dta_Ordl)});
      RcdFound1107 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound1107 = (short)(1) ;
         A7929Dta_ForLin = T010H40_A7929Dta_ForLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext10H1107( )
   {
      /* Scan next routine */
      pr_default.readNext(38);
      RcdFound1107 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound1107 = (short)(1) ;
         A7929Dta_ForLin = T010H40_A7929Dta_ForLin[0] ;
      }
   }

   public void scanEnd10H1107( )
   {
      pr_default.close(38);
   }

   public void afterConfirm10H1107( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert10H1107( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate10H1107( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete10H1107( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete10H1107( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate10H1107( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes10H1107( )
   {
      edtDta_ForLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_ForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_ForLin_Enabled), 5, 0), !bGXsfl_112_Refreshing);
      edtDta_Prdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_Prdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_Prdnum_Enabled), 5, 0), !bGXsfl_112_Refreshing);
      edtDta_PrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_PrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_PrdNom_Enabled), 5, 0), !bGXsfl_112_Refreshing);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_112_Refreshing);
      edtForPrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), !bGXsfl_112_Refreshing);
      edtDta_Forcan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_Forcan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_Forcan_Enabled), 5, 0), !bGXsfl_112_Refreshing);
      edtDta_clave1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_clave1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_clave1_Enabled), 5, 0), !bGXsfl_112_Refreshing);
      edtDta_clave2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_clave2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_clave2_Enabled), 5, 0), !bGXsfl_112_Refreshing);
   }

   public void send_integrity_lvl_hashes10H1107( )
   {
   }

   public void send_integrity_lvl_hashes10H1106( )
   {
   }

   public void send_integrity_lvl_hashes10H39( )
   {
   }

   public void subsflControlProps_501106( )
   {
      lblTextblock7_Internalname = "TEXTBLOCK7_"+sGXsfl_50_idx ;
      edtDta_Ordl_Internalname = "DTA_ORDL_"+sGXsfl_50_idx ;
      lblTextblock8_Internalname = "TEXTBLOCK8_"+sGXsfl_50_idx ;
      edtDta_CPQ_Internalname = "DTA_CPQ_"+sGXsfl_50_idx ;
      lblTextblock9_Internalname = "TEXTBLOCK9_"+sGXsfl_50_idx ;
      edtDta_DPQ_Internalname = "DTA_DPQ_"+sGXsfl_50_idx ;
      lblTextblock10_Internalname = "TEXTBLOCK10_"+sGXsfl_50_idx ;
      edtDta_ForFab_Internalname = "DTA_FORFAB_"+sGXsfl_50_idx ;
      lblTextblock11_Internalname = "TEXTBLOCK11_"+sGXsfl_50_idx ;
      edtDta_Fortie_Internalname = "DTA_FORTIE_"+sGXsfl_50_idx ;
      lblTextblock12_Internalname = "TEXTBLOCK12_"+sGXsfl_50_idx ;
      edtDta_ForTmx_Internalname = "DTA_FORTMX_"+sGXsfl_50_idx ;
      lblTextblock13_Internalname = "TEXTBLOCK13_"+sGXsfl_50_idx ;
      edtDta_ForRb_Internalname = "DTA_FORRB_"+sGXsfl_50_idx ;
      lblTextblock14_Internalname = "TEXTBLOCK14_"+sGXsfl_50_idx ;
      edtDta_ForPhx_Internalname = "DTA_FORPHX_"+sGXsfl_50_idx ;
      lblTextblock15_Internalname = "TEXTBLOCK15_"+sGXsfl_50_idx ;
      edtDta_ForPhn_Internalname = "DTA_FORPHN_"+sGXsfl_50_idx ;
      lblTextblock16_Internalname = "TEXTBLOCK16_"+sGXsfl_50_idx ;
      edtDta_ForUli_Internalname = "DTA_FORULI_"+sGXsfl_50_idx ;
      lblTextblock17_Internalname = "TEXTBLOCK17_"+sGXsfl_50_idx ;
      edtDta_Nh2o_Internalname = "DTA_NH2O_"+sGXsfl_50_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_501106( )
   {
      lblTextblock7_Internalname = "TEXTBLOCK7_"+sGXsfl_50_fel_idx ;
      edtDta_Ordl_Internalname = "DTA_ORDL_"+sGXsfl_50_fel_idx ;
      lblTextblock8_Internalname = "TEXTBLOCK8_"+sGXsfl_50_fel_idx ;
      edtDta_CPQ_Internalname = "DTA_CPQ_"+sGXsfl_50_fel_idx ;
      lblTextblock9_Internalname = "TEXTBLOCK9_"+sGXsfl_50_fel_idx ;
      edtDta_DPQ_Internalname = "DTA_DPQ_"+sGXsfl_50_fel_idx ;
      lblTextblock10_Internalname = "TEXTBLOCK10_"+sGXsfl_50_fel_idx ;
      edtDta_ForFab_Internalname = "DTA_FORFAB_"+sGXsfl_50_fel_idx ;
      lblTextblock11_Internalname = "TEXTBLOCK11_"+sGXsfl_50_fel_idx ;
      edtDta_Fortie_Internalname = "DTA_FORTIE_"+sGXsfl_50_fel_idx ;
      lblTextblock12_Internalname = "TEXTBLOCK12_"+sGXsfl_50_fel_idx ;
      edtDta_ForTmx_Internalname = "DTA_FORTMX_"+sGXsfl_50_fel_idx ;
      lblTextblock13_Internalname = "TEXTBLOCK13_"+sGXsfl_50_fel_idx ;
      edtDta_ForRb_Internalname = "DTA_FORRB_"+sGXsfl_50_fel_idx ;
      lblTextblock14_Internalname = "TEXTBLOCK14_"+sGXsfl_50_fel_idx ;
      edtDta_ForPhx_Internalname = "DTA_FORPHX_"+sGXsfl_50_fel_idx ;
      lblTextblock15_Internalname = "TEXTBLOCK15_"+sGXsfl_50_fel_idx ;
      edtDta_ForPhn_Internalname = "DTA_FORPHN_"+sGXsfl_50_fel_idx ;
      lblTextblock16_Internalname = "TEXTBLOCK16_"+sGXsfl_50_fel_idx ;
      edtDta_ForUli_Internalname = "DTA_FORULI_"+sGXsfl_50_fel_idx ;
      lblTextblock17_Internalname = "TEXTBLOCK17_"+sGXsfl_50_fel_idx ;
      edtDta_Nh2o_Internalname = "DTA_NH2O_"+sGXsfl_50_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_50_fel_idx ;
   }

   public void addRow10H1106( )
   {
      nRC_GXsfl_112 = 0 ;
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501106( ) ;
      sendRow10H1106( ) ;
   }

   public void sendRow10H1106( )
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
      /* Start of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_50_idx+"\">") ;
      }
      if ( GRID1_IsPaging == 0 )
      {
         GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_50_idx ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable3_Internalname+"_"+sGXsfl_50_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock7_Internalname,httpContext.getMessage( "Orden PQ", ""),"","",lblTextblock7_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1106_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDta_Ordl_Internalname,GXutil.ltrim( localUtil.ntoc( A7919Dta_Ordl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7919Dta_Ordl), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDta_Ordl_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDta_Ordl_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock8_Internalname,httpContext.getMessage( "Proceso Q", ""),"","",lblTextblock8_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1106_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDta_CPQ_Internalname,GXutil.rtrim( A7920Dta_CPQ),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDta_CPQ_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDta_CPQ_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock9_Internalname,httpContext.getMessage( "Dta DPQ", ""),"","",lblTextblock9_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDta_DPQ_Internalname,GXutil.rtrim( A7921Dta_DPQ),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDta_DPQ_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDta_DPQ_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(80),"chr",Integer.valueOf(1),"row",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock10_Internalname,httpContext.getMessage( "Tipo L T M", ""),"","",lblTextblock10_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1106_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDta_ForFab_Internalname,GXutil.rtrim( A7922Dta_ForFab),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDta_ForFab_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDta_ForFab_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock11_Internalname,httpContext.getMessage( "Tiempo", ""),"","",lblTextblock11_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1106_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDta_Fortie_Internalname,GXutil.ltrim( localUtil.ntoc( A7923Dta_Fortie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDta_Fortie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7923Dta_Fortie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7923Dta_Fortie), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,78);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDta_Fortie_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDta_Fortie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock12_Internalname,httpContext.getMessage( "TºC", ""),"","",lblTextblock12_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1106_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDta_ForTmx_Internalname,GXutil.ltrim( localUtil.ntoc( A7924Dta_ForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDta_ForTmx_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7924Dta_ForTmx), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7924Dta_ForTmx), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDta_ForTmx_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDta_ForTmx_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock13_Internalname,httpContext.getMessage( "Rb", ""),"","",lblTextblock13_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1106_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDta_ForRb_Internalname,GXutil.ltrim( localUtil.ntoc( A7925Dta_ForRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDta_ForRb_Enabled!=0) ? localUtil.format( A7925Dta_ForRb, "ZZZ9.99") : localUtil.format( A7925Dta_ForRb, "ZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDta_ForRb_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDta_ForRb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(7),"chr",Integer.valueOf(1),"row",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock14_Internalname,httpContext.getMessage( "Ph Mx", ""),"","",lblTextblock14_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1106_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDta_ForPhx_Internalname,GXutil.ltrim( localUtil.ntoc( A7926Dta_ForPhx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDta_ForPhx_Enabled!=0) ? localUtil.format( A7926Dta_ForPhx, "Z9.99") : localUtil.format( A7926Dta_ForPhx, "Z9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,93);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDta_ForPhx_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDta_ForPhx_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(5),"chr",Integer.valueOf(1),"row",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock15_Internalname,httpContext.getMessage( "PH Mn", ""),"","",lblTextblock15_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1106_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDta_ForPhn_Internalname,GXutil.ltrim( localUtil.ntoc( A7927Dta_ForPhn, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDta_ForPhn_Enabled!=0) ? localUtil.format( A7927Dta_ForPhn, "Z9.99") : localUtil.format( A7927Dta_ForPhn, "Z9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,98);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDta_ForPhn_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDta_ForPhn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(5),"chr",Integer.valueOf(1),"row",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock16_Internalname,httpContext.getMessage( "Ultima Linea", ""),"","",lblTextblock16_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDta_ForUli_Internalname,GXutil.ltrim( localUtil.ntoc( A7928Dta_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDta_ForUli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7928Dta_ForUli), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7928Dta_ForUli), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDta_ForUli_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDta_ForUli_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock17_Internalname,httpContext.getMessage( "N baños", ""),"","",lblTextblock17_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1106_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 108,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDta_Nh2o_Internalname,GXutil.ltrim( localUtil.ntoc( A12112Dta_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDta_Nh2o_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12112Dta_Nh2o), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12112Dta_Nh2o), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,108);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDta_Nh2o_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDta_Nh2o_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
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
      startgridcontrol112( ) ;
      nGXsfl_112_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1107 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1107 = (short)(1) ;
            scanStart10H1107( ) ;
            while ( RcdFound1107 != 0 )
            {
               init_level_properties1107( ) ;
               getByPrimaryKey10H1107( ) ;
               addRow10H1107( ) ;
               scanNext10H1107( ) ;
            }
            scanEnd10H1107( ) ;
            nBlankRcdCount1107 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B7928Dta_ForUli = A7928Dta_ForUli ;
         n7928Dta_ForUli = false ;
         B7918Dta_UOrd = A7918Dta_UOrd ;
         n7918Dta_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
         standaloneNotModal10H1107( ) ;
         standaloneModal10H1107( ) ;
         sMode1107 = Gx_mode ;
         while ( nGXsfl_112_idx < nRC_GXsfl_112 )
         {
            bGXsfl_112_Refreshing = true ;
            readRow10H1107( ) ;
            edtavnRcdDeleted_1107_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1107_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1107_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1107_Enabled), 5, 0), !bGXsfl_112_Refreshing);
            edtDta_ForLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_FORLIN_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDta_ForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_ForLin_Enabled), 5, 0), !bGXsfl_112_Refreshing);
            edtDta_Prdnum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_PRDNUM_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDta_Prdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_Prdnum_Enabled), 5, 0), !bGXsfl_112_Refreshing);
            edtDta_PrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_PRDNOM_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDta_PrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_PrdNom_Enabled), 5, 0), !bGXsfl_112_Refreshing);
            edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_112_Refreshing);
            edtForPrdDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDDSC_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), !bGXsfl_112_Refreshing);
            edtDta_Forcan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_FORCAN_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDta_Forcan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_Forcan_Enabled), 5, 0), !bGXsfl_112_Refreshing);
            edtDta_clave1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_CLAVE1_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDta_clave1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_clave1_Enabled), 5, 0), !bGXsfl_112_Refreshing);
            edtDta_clave2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_CLAVE2_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDta_clave2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_clave2_Enabled), 5, 0), !bGXsfl_112_Refreshing);
            if ( ( nRcdExists_1107 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal10H1107( ) ;
            }
            sendRow10H1107( ) ;
            bGXsfl_112_Refreshing = false ;
         }
         Gx_mode = sMode1107 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A7928Dta_ForUli = B7928Dta_ForUli ;
         n7928Dta_ForUli = false ;
         A7918Dta_UOrd = B7918Dta_UOrd ;
         n7918Dta_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1107 = (short)(5) ;
         nRcdExists_1107 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart10H1107( ) ;
            while ( RcdFound1107 != 0 )
            {
               sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx+1), 4, 0), (short)(4), "0") + sGXsfl_50_idx ;
               subsflControlProps_1121107( ) ;
               init_level_properties1107( ) ;
               standaloneNotModal10H1107( ) ;
               getByPrimaryKey10H1107( ) ;
               standaloneModal10H1107( ) ;
               addRow10H1107( ) ;
               scanNext10H1107( ) ;
            }
            scanEnd10H1107( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1107 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx+1), 4, 0), (short)(4), "0") + sGXsfl_50_idx ;
      subsflControlProps_1121107( ) ;
      initAll10H1107( ) ;
      init_level_properties1107( ) ;
      B7928Dta_ForUli = A7928Dta_ForUli ;
      n7928Dta_ForUli = false ;
      B7918Dta_UOrd = A7918Dta_UOrd ;
      n7918Dta_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
      nRcdExists_1107 = (short)(0) ;
      nIsMod_1107 = (short)(0) ;
      nRcdDeleted_1107 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 50 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_50_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1107 = (short)(nBlankRcdUsr1107+nBlankRcdCount1107) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1107 > 0 )
      {
         standaloneNotModal10H1107( ) ;
         standaloneModal10H1107( ) ;
         addRow10H1107( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtDta_ForLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1107 = (short)(nBlankRcdCount1107-1) ;
      }
      Gx_mode = sMode1107 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A7928Dta_ForUli = B7928Dta_ForUli ;
      n7928Dta_ForUli = false ;
      A7918Dta_UOrd = B7918Dta_UOrd ;
      n7918Dta_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_50_idx, Grid2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid1Row.AddGrid("Grid2", Grid2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_50_idx, Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_50_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      /* End of table */
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes10H1106( ) ;
      GXCCtl = "Z7919Dta_Ordl_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7919Dta_Ordl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7920Dta_CPQ_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7920Dta_CPQ));
      GXCCtl = "Z7922Dta_ForFab_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7922Dta_ForFab));
      GXCCtl = "Z7923Dta_Fortie_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7923Dta_Fortie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7924Dta_ForTmx_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7924Dta_ForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7925Dta_ForRb_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7925Dta_ForRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7926Dta_ForPhx_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7926Dta_ForPhx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7927Dta_ForPhn_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7927Dta_ForPhn, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7928Dta_ForUli_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7928Dta_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12112Dta_Nh2o_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12112Dta_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O7928Dta_ForUli_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O7928Dta_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_112_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_112_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1106_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1106, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1106_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1106, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1106_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1106, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vGXBSCREEN_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTA_ORDL_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_Ordl_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTA_CPQ_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_CPQ_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTA_DPQ_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_DPQ_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTA_FORFAB_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForFab_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTA_FORTIE_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_Fortie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTA_FORTMX_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForTmx_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTA_FORRB_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForRb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTA_FORPHX_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForPhx_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTA_FORPHN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForPhn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTA_FORULI_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForUli_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTA_NH2O_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_Nh2o_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_50_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow10H1106( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501106( ) ;
      edtDta_Ordl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_ORDL_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDta_CPQ_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_CPQ_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDta_DPQ_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_DPQ_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDta_ForFab_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_FORFAB_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDta_Fortie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_FORTIE_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDta_ForTmx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_FORTMX_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDta_ForRb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_FORRB_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDta_ForPhx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_FORPHX_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDta_ForPhn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_FORPHN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDta_ForUli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_FORULI_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDta_Nh2o_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_NH2O_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDta_Ordl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDta_Ordl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DTA_ORDL_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDta_Ordl_Internalname ;
         wbErr = true ;
         A7919Dta_Ordl = (short)(0) ;
      }
      else
      {
         A7919Dta_Ordl = (short)(localUtil.ctol( httpContext.cgiGet( edtDta_Ordl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A7920Dta_CPQ = httpContext.cgiGet( edtDta_CPQ_Internalname) ;
      n7920Dta_CPQ = false ;
      A7921Dta_DPQ = httpContext.cgiGet( edtDta_DPQ_Internalname) ;
      A7922Dta_ForFab = httpContext.cgiGet( edtDta_ForFab_Internalname) ;
      n7922Dta_ForFab = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDta_Fortie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDta_Fortie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DTA_FORTIE_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDta_Fortie_Internalname ;
         wbErr = true ;
         A7923Dta_Fortie = (short)(0) ;
         n7923Dta_Fortie = false ;
      }
      else
      {
         A7923Dta_Fortie = (short)(localUtil.ctol( httpContext.cgiGet( edtDta_Fortie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7923Dta_Fortie = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDta_ForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDta_ForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DTA_FORTMX_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDta_ForTmx_Internalname ;
         wbErr = true ;
         A7924Dta_ForTmx = (short)(0) ;
         n7924Dta_ForTmx = false ;
      }
      else
      {
         A7924Dta_ForTmx = (short)(localUtil.ctol( httpContext.cgiGet( edtDta_ForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7924Dta_ForTmx = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDta_ForRb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDta_ForRb_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
      {
         GXCCtl = "DTA_FORRB_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDta_ForRb_Internalname ;
         wbErr = true ;
         A7925Dta_ForRb = DecimalUtil.ZERO ;
         n7925Dta_ForRb = false ;
      }
      else
      {
         A7925Dta_ForRb = localUtil.ctond( httpContext.cgiGet( edtDta_ForRb_Internalname)) ;
         n7925Dta_ForRb = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDta_ForPhx_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDta_ForPhx_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
      {
         GXCCtl = "DTA_FORPHX_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDta_ForPhx_Internalname ;
         wbErr = true ;
         A7926Dta_ForPhx = DecimalUtil.ZERO ;
         n7926Dta_ForPhx = false ;
      }
      else
      {
         A7926Dta_ForPhx = localUtil.ctond( httpContext.cgiGet( edtDta_ForPhx_Internalname)) ;
         n7926Dta_ForPhx = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDta_ForPhn_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDta_ForPhn_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
      {
         GXCCtl = "DTA_FORPHN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDta_ForPhn_Internalname ;
         wbErr = true ;
         A7927Dta_ForPhn = DecimalUtil.ZERO ;
         n7927Dta_ForPhn = false ;
      }
      else
      {
         A7927Dta_ForPhn = localUtil.ctond( httpContext.cgiGet( edtDta_ForPhn_Internalname)) ;
         n7927Dta_ForPhn = false ;
      }
      A7928Dta_ForUli = (short)(localUtil.ctol( httpContext.cgiGet( edtDta_ForUli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n7928Dta_ForUli = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDta_Nh2o_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDta_Nh2o_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DTA_NH2O_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDta_Nh2o_Internalname ;
         wbErr = true ;
         A12112Dta_Nh2o = (short)(0) ;
         n12112Dta_Nh2o = false ;
      }
      else
      {
         A12112Dta_Nh2o = (short)(localUtil.ctol( httpContext.cgiGet( edtDta_Nh2o_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12112Dta_Nh2o = false ;
      }
      GXCCtl = "Z7919Dta_Ordl_" + sGXsfl_50_idx ;
      Z7919Dta_Ordl = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7920Dta_CPQ_" + sGXsfl_50_idx ;
      Z7920Dta_CPQ = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7922Dta_ForFab_" + sGXsfl_50_idx ;
      Z7922Dta_ForFab = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7923Dta_Fortie_" + sGXsfl_50_idx ;
      Z7923Dta_Fortie = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7924Dta_ForTmx_" + sGXsfl_50_idx ;
      Z7924Dta_ForTmx = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7925Dta_ForRb_" + sGXsfl_50_idx ;
      Z7925Dta_ForRb = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7926Dta_ForPhx_" + sGXsfl_50_idx ;
      Z7926Dta_ForPhx = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7927Dta_ForPhn_" + sGXsfl_50_idx ;
      Z7927Dta_ForPhn = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7928Dta_ForUli_" + sGXsfl_50_idx ;
      Z7928Dta_ForUli = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12112Dta_Nh2o_" + sGXsfl_50_idx ;
      Z12112Dta_Nh2o = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O7928Dta_ForUli_" + sGXsfl_50_idx ;
      O7928Dta_ForUli = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_112_" + sGXsfl_50_idx ;
      nRC_GXsfl_112 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1106_" + sGXsfl_50_idx ;
      nRcdDeleted_1106 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1106_" + sGXsfl_50_idx ;
      nRcdExists_1106 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1106_" + sGXsfl_50_idx ;
      nIsMod_1106 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "vGXBSCREEN_" + sGXsfl_50_idx ;
      Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_112_" + sGXsfl_50_idx ;
      nRC_GXsfl_112 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_1121107( )
   {
      edtavnRcdDeleted_1107_Internalname = "vNRCDDELETED_1107_"+sGXsfl_112_idx ;
      edtDta_ForLin_Internalname = "DTA_FORLIN_"+sGXsfl_112_idx ;
      edtDta_Prdnum_Internalname = "DTA_PRDNUM_"+sGXsfl_112_idx ;
      edtDta_PrdNom_Internalname = "DTA_PRDNOM_"+sGXsfl_112_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_112_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_112_idx ;
      edtDta_Forcan_Internalname = "DTA_FORCAN_"+sGXsfl_112_idx ;
      edtDta_clave1_Internalname = "DTA_CLAVE1_"+sGXsfl_112_idx ;
      edtDta_clave2_Internalname = "DTA_CLAVE2_"+sGXsfl_112_idx ;
   }

   public void subsflControlProps_fel_1121107( )
   {
      edtavnRcdDeleted_1107_Internalname = "vNRCDDELETED_1107_"+sGXsfl_112_fel_idx ;
      edtDta_ForLin_Internalname = "DTA_FORLIN_"+sGXsfl_112_fel_idx ;
      edtDta_Prdnum_Internalname = "DTA_PRDNUM_"+sGXsfl_112_fel_idx ;
      edtDta_PrdNom_Internalname = "DTA_PRDNOM_"+sGXsfl_112_fel_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_112_fel_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_112_fel_idx ;
      edtDta_Forcan_Internalname = "DTA_FORCAN_"+sGXsfl_112_fel_idx ;
      edtDta_clave1_Internalname = "DTA_CLAVE1_"+sGXsfl_112_fel_idx ;
      edtDta_clave2_Internalname = "DTA_CLAVE2_"+sGXsfl_112_fel_idx ;
   }

   public void addRow10H1107( )
   {
      nGXsfl_112_idx = (int)(nGXsfl_112_idx+1) ;
      sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx), 4, 0), (short)(4), "0") + sGXsfl_50_idx ;
      subsflControlProps_1121107( ) ;
      sendRow10H1107( ) ;
   }

   public void sendRow10H1107( )
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
         if ( ((int)((nGXsfl_112_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1107_" + sGXsfl_112_idx + "',1);gx.fn.setControlValue('nIsMod_1106_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_112_idx + "',112)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1107_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1107, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1107_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1107), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1107), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,113);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1107_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1107_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(112),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1107_" + sGXsfl_112_idx + "',1);gx.fn.setControlValue('nIsMod_1106_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 114,'',false,'" + sGXsfl_112_idx + "',112)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDta_ForLin_Internalname,GXutil.ltrim( localUtil.ntoc( A7929Dta_ForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7929Dta_ForLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,114);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDta_ForLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDta_ForLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(112),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1107_" + sGXsfl_112_idx + "',1);gx.fn.setControlValue('nIsMod_1106_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 115,'',false,'" + sGXsfl_112_idx + "',112)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDta_Prdnum_Internalname,GXutil.rtrim( A7930Dta_Prdnum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,115);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDta_Prdnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDta_Prdnum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(112),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDta_PrdNom_Internalname,GXutil.rtrim( A7931Dta_PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDta_PrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDta_PrdNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(112),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1107_" + sGXsfl_112_idx + "',1);gx.fn.setControlValue('nIsMod_1106_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 117,'',false,'" + sGXsfl_112_idx + "',112)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForPrdUMe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9") : localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,117);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForPrdUMe_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(112),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdDsc_Internalname,GXutil.rtrim( A488ForPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForPrdDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(112),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1107_" + sGXsfl_112_idx + "',1);gx.fn.setControlValue('nIsMod_1106_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 119,'',false,'" + sGXsfl_112_idx + "',112)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDta_Forcan_Internalname,GXutil.ltrim( localUtil.ntoc( A7932Dta_Forcan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDta_Forcan_Enabled!=0) ? localUtil.format( A7932Dta_Forcan, "ZZZZZ9.99999") : localUtil.format( A7932Dta_Forcan, "ZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,119);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDta_Forcan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDta_Forcan_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(112),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1107_" + sGXsfl_112_idx + "',1);gx.fn.setControlValue('nIsMod_1106_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 120,'',false,'" + sGXsfl_112_idx + "',112)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDta_clave1_Internalname,GXutil.rtrim( A8479Dta_clave1),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,120);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDta_clave1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDta_clave1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(112),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1107_" + sGXsfl_112_idx + "',1);gx.fn.setControlValue('nIsMod_1106_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 121,'',false,'" + sGXsfl_112_idx + "',112)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDta_clave2_Internalname,GXutil.rtrim( A8480Dta_clave2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDta_clave2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDta_clave2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(112),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashes10H1107( ) ;
      GXCCtl = "Z7929Dta_ForLin_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7929Dta_ForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7930Dta_Prdnum_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7930Dta_Prdnum));
      GXCCtl = "Z7932Dta_Forcan_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7932Dta_Forcan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8479Dta_clave1_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8479Dta_clave1));
      GXCCtl = "Z8480Dta_clave2_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8480Dta_clave2));
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1107_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1107, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1107_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1107, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1107_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1107, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1107_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1107_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTA_FORLIN_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTA_PRDNUM_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_Prdnum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTA_PRDNOM_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_PrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUME_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDDSC_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTA_FORCAN_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_Forcan_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTA_CLAVE1_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_clave1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTA_CLAVE2_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_clave2_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRow10H1107( )
   {
      nGXsfl_112_idx = (int)(nGXsfl_112_idx+1) ;
      sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx), 4, 0), (short)(4), "0") + sGXsfl_50_idx ;
      subsflControlProps_1121107( ) ;
      edtavnRcdDeleted_1107_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1107_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDta_ForLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_FORLIN_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDta_Prdnum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_PRDNUM_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDta_PrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_PRDNOM_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDDSC_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDta_Forcan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_FORCAN_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDta_clave1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_CLAVE1_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDta_clave2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTA_CLAVE2_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1107_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1107_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1107");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1107_Internalname ;
         wbErr = true ;
         nRcdDeleted_1107 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1107 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1107_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDta_ForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDta_ForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DTA_FORLIN_" + sGXsfl_112_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDta_ForLin_Internalname ;
         wbErr = true ;
         A7929Dta_ForLin = (short)(0) ;
      }
      else
      {
         A7929Dta_ForLin = (short)(localUtil.ctol( httpContext.cgiGet( edtDta_ForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A7930Dta_Prdnum = httpContext.cgiGet( edtDta_Prdnum_Internalname) ;
      n7930Dta_Prdnum = false ;
      A7931Dta_PrdNom = httpContext.cgiGet( edtDta_PrdNom_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_112_idx ;
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
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDta_Forcan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDta_Forcan_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "DTA_FORCAN_" + sGXsfl_112_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDta_Forcan_Internalname ;
         wbErr = true ;
         A7932Dta_Forcan = DecimalUtil.ZERO ;
         n7932Dta_Forcan = false ;
      }
      else
      {
         A7932Dta_Forcan = localUtil.ctond( httpContext.cgiGet( edtDta_Forcan_Internalname)) ;
         n7932Dta_Forcan = false ;
      }
      A8479Dta_clave1 = httpContext.cgiGet( edtDta_clave1_Internalname) ;
      n8479Dta_clave1 = false ;
      A8480Dta_clave2 = httpContext.cgiGet( edtDta_clave2_Internalname) ;
      n8480Dta_clave2 = false ;
      GXCCtl = "Z7929Dta_ForLin_" + sGXsfl_112_idx ;
      Z7929Dta_ForLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7930Dta_Prdnum_" + sGXsfl_112_idx ;
      Z7930Dta_Prdnum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7932Dta_Forcan_" + sGXsfl_112_idx ;
      Z7932Dta_Forcan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8479Dta_clave1_" + sGXsfl_112_idx ;
      Z8479Dta_clave1 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8480Dta_clave2_" + sGXsfl_112_idx ;
      Z8480Dta_clave2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_112_idx ;
      Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1107_" + sGXsfl_112_idx ;
      nRcdDeleted_1107 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1107_" + sGXsfl_112_idx ;
      nRcdExists_1107 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1107_" + sGXsfl_112_idx ;
      nIsMod_1107 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtDta_ForLin_Enabled = edtDta_ForLin_Enabled ;
      defedtDta_ForUli_Enabled = edtDta_ForUli_Enabled ;
      defedtDta_Ordl_Enabled = edtDta_Ordl_Enabled ;
   }

   public void confirmValues10H0( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501106( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501106( ) ;
         httpContext.changePostValue( "Z7919Dta_Ordl_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z7919Dta_Ordl_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7919Dta_Ordl_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z7920Dta_CPQ_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z7920Dta_CPQ_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7920Dta_CPQ_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z7922Dta_ForFab_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z7922Dta_ForFab_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7922Dta_ForFab_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z7923Dta_Fortie_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z7923Dta_Fortie_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7923Dta_Fortie_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z7924Dta_ForTmx_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z7924Dta_ForTmx_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7924Dta_ForTmx_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z7925Dta_ForRb_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z7925Dta_ForRb_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7925Dta_ForRb_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z7926Dta_ForPhx_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z7926Dta_ForPhx_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7926Dta_ForPhx_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z7927Dta_ForPhn_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z7927Dta_ForPhn_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7927Dta_ForPhn_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z7928Dta_ForUli_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z7928Dta_ForUli_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7928Dta_ForUli_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z12112Dta_Nh2o_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z12112Dta_Nh2o_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12112Dta_Nh2o_"+sGXsfl_50_idx) ;
      }
      nGXsfl_112_idx = 0 ;
      sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx), 4, 0), (short)(4), "0") + sGXsfl_50_idx ;
      subsflControlProps_1121107( ) ;
      while ( nGXsfl_112_idx < nRC_GXsfl_112 )
      {
         nGXsfl_112_idx = (int)(nGXsfl_112_idx+1) ;
         sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx), 4, 0), (short)(4), "0") + sGXsfl_50_idx ;
         subsflControlProps_1121107( ) ;
         httpContext.changePostValue( "Z7929Dta_ForLin_"+sGXsfl_112_idx, httpContext.cgiGet( "ZT_"+"Z7929Dta_ForLin_"+sGXsfl_112_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7929Dta_ForLin_"+sGXsfl_112_idx) ;
         httpContext.changePostValue( "Z7930Dta_Prdnum_"+sGXsfl_112_idx, httpContext.cgiGet( "ZT_"+"Z7930Dta_Prdnum_"+sGXsfl_112_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7930Dta_Prdnum_"+sGXsfl_112_idx) ;
         httpContext.changePostValue( "Z7932Dta_Forcan_"+sGXsfl_112_idx, httpContext.cgiGet( "ZT_"+"Z7932Dta_Forcan_"+sGXsfl_112_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7932Dta_Forcan_"+sGXsfl_112_idx) ;
         httpContext.changePostValue( "Z8479Dta_clave1_"+sGXsfl_112_idx, httpContext.cgiGet( "ZT_"+"Z8479Dta_clave1_"+sGXsfl_112_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8479Dta_clave1_"+sGXsfl_112_idx) ;
         httpContext.changePostValue( "Z8480Dta_clave2_"+sGXsfl_112_idx, httpContext.cgiGet( "ZT_"+"Z8480Dta_clave2_"+sGXsfl_112_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8480Dta_clave2_"+sGXsfl_112_idx) ;
         httpContext.changePostValue( "Z490ForPrdUMe_"+sGXsfl_112_idx, httpContext.cgiGet( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_112_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_112_idx) ;
      }
      httpContext.changePostValue( "O7928Dta_ForUli", httpContext.cgiGet( "T7928Dta_ForUli")) ;
      httpContext.deletePostValue( "T7928Dta_ForUli") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdt004", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A368DisFasLin,4,0))}, new String[] {"EmprCod","DisCod","ProCod","DisFasLin"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TDT004");
      forbiddenHiddens.add("FasCod", GXutil.rtrim( localUtil.format( A457FasCod, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tdt004:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z368DisFasLin", GXutil.ltrim( localUtil.ntoc( Z368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7918Dta_UOrd", GXutil.ltrim( localUtil.ntoc( Z7918Dta_UOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O7918Dta_UOrd", GXutil.ltrim( localUtil.ntoc( O7918Dta_UOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD", GXutil.rtrim( A457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREOBL", GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tdt004", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A368DisFasLin,4,0))}, new String[] {"EmprCod","DisCod","ProCod","DisFasLin"})  ;
   }

   public String getPgmname( )
   {
      return "TDT004" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PQUIMICOS F(PEDIDO)", "") ;
   }

   public void initializeNonKey10H39( )
   {
      A457FasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A7918Dta_UOrd = (short)(0) ;
      n7918Dta_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
      A7744FasPreObl = (byte)(0) ;
      n7744FasPreObl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7744FasPreObl", GXutil.str( A7744FasPreObl, 1, 0));
      O7918Dta_UOrd = A7918Dta_UOrd ;
      n7918Dta_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
      Z457FasCod = "" ;
      Z7918Dta_UOrd = (short)(0) ;
   }

   public void initAll10H39( )
   {
      initializeNonKey10H39( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey10H1106( )
   {
      A7921Dta_DPQ = "" ;
      A7920Dta_CPQ = "" ;
      n7920Dta_CPQ = false ;
      A7922Dta_ForFab = "" ;
      n7922Dta_ForFab = false ;
      A7923Dta_Fortie = (short)(0) ;
      n7923Dta_Fortie = false ;
      A7924Dta_ForTmx = (short)(0) ;
      n7924Dta_ForTmx = false ;
      A7925Dta_ForRb = DecimalUtil.ZERO ;
      n7925Dta_ForRb = false ;
      A7926Dta_ForPhx = DecimalUtil.ZERO ;
      n7926Dta_ForPhx = false ;
      A7927Dta_ForPhn = DecimalUtil.ZERO ;
      n7927Dta_ForPhn = false ;
      A7928Dta_ForUli = (short)(0) ;
      n7928Dta_ForUli = false ;
      A12112Dta_Nh2o = (short)(0) ;
      n12112Dta_Nh2o = false ;
      O7928Dta_ForUli = A7928Dta_ForUli ;
      n7928Dta_ForUli = false ;
      Z7920Dta_CPQ = "" ;
      Z7922Dta_ForFab = "" ;
      Z7923Dta_Fortie = (short)(0) ;
      Z7924Dta_ForTmx = (short)(0) ;
      Z7925Dta_ForRb = DecimalUtil.ZERO ;
      Z7926Dta_ForPhx = DecimalUtil.ZERO ;
      Z7927Dta_ForPhn = DecimalUtil.ZERO ;
      Z7928Dta_ForUli = (short)(0) ;
      Z12112Dta_Nh2o = (short)(0) ;
   }

   public void initAll10H1106( )
   {
      A7919Dta_Ordl = (short)(0) ;
      initializeNonKey10H1106( ) ;
   }

   public void standaloneModalInsert10H1106( )
   {
      A7918Dta_UOrd = i7918Dta_UOrd ;
      n7918Dta_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7918Dta_UOrd), 4, 0));
   }

   public void initializeNonKey10H1107( )
   {
      A7931Dta_PrdNom = "" ;
      A7930Dta_Prdnum = "" ;
      n7930Dta_Prdnum = false ;
      A490ForPrdUMe = (byte)(0) ;
      n490ForPrdUMe = false ;
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      A7932Dta_Forcan = DecimalUtil.ZERO ;
      n7932Dta_Forcan = false ;
      A8479Dta_clave1 = "" ;
      n8479Dta_clave1 = false ;
      A8480Dta_clave2 = "" ;
      n8480Dta_clave2 = false ;
      Z7930Dta_Prdnum = "" ;
      Z7932Dta_Forcan = DecimalUtil.ZERO ;
      Z8479Dta_clave1 = "" ;
      Z8480Dta_clave2 = "" ;
      Z490ForPrdUMe = (byte)(0) ;
   }

   public void initAll10H1107( )
   {
      A7929Dta_ForLin = (short)(0) ;
      initializeNonKey10H1107( ) ;
   }

   public void standaloneModalInsert10H1107( )
   {
      A7928Dta_ForUli = i7928Dta_ForUli ;
      n7928Dta_ForUli = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241534762", true, true);
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
      httpContext.AddJavascriptSource("tdt004.js", "?20268241534762", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1106( )
   {
      edtDta_ForUli_Enabled = defedtDta_ForUli_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_ForUli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_ForUli_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtDta_Ordl_Enabled = defedtDta_Ordl_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_Ordl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_Ordl_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void init_level_properties1107( )
   {
      edtDta_ForLin_Enabled = defedtDta_ForLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDta_ForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDta_ForLin_Enabled), 5, 0), !bGXsfl_112_Refreshing);
   }

   public void startgridcontrol50( )
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
      Grid1Column.AddObjectProperty("Value", lblTextblock6_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7919Dta_Ordl, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_Ordl_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock8_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7920Dta_CPQ));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_CPQ_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7921Dta_DPQ));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_DPQ_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7922Dta_ForFab));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForFab_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7923Dta_Fortie, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_Fortie_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7924Dta_ForTmx, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForTmx_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7925Dta_ForRb, (byte)(7), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForRb_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7926Dta_ForPhx, (byte)(5), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForPhx_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7927Dta_ForPhn, (byte)(5), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForPhn_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7928Dta_ForUli, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForUli_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12112Dta_Nh2o, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_Nh2o_Enabled, (byte)(5), (byte)(0), ".", "")));
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

   public void startgridcontrol112( )
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
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1107, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1107_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7929Dta_ForLin, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_ForLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A7930Dta_Prdnum));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_Prdnum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A7931Dta_PrdNom));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_PrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7932Dta_Forcan, (byte)(12), (byte)(5), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_Forcan_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A8479Dta_clave1));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_clave1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A8480Dta_clave2));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDta_clave2_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtDisCod_Internalname = "DISCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtProCod_Internalname = "PROCOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtDisFasLin_Internalname = "DISFASLIN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtDta_UOrd_Internalname = "DTA_UORD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtDta_Ordl_Internalname = "DTA_ORDL" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtDta_CPQ_Internalname = "DTA_CPQ" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtDta_DPQ_Internalname = "DTA_DPQ" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtDta_ForFab_Internalname = "DTA_FORFAB" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtDta_Fortie_Internalname = "DTA_FORTIE" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtDta_ForTmx_Internalname = "DTA_FORTMX" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtDta_ForRb_Internalname = "DTA_FORRB" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtDta_ForPhx_Internalname = "DTA_FORPHX" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtDta_ForPhn_Internalname = "DTA_FORPHN" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtDta_ForUli_Internalname = "DTA_FORULI" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtDta_Nh2o_Internalname = "DTA_NH2O" ;
      edtavnRcdDeleted_1107_Internalname = "vNRCDDELETED_1107" ;
      edtDta_ForLin_Internalname = "DTA_FORLIN" ;
      edtDta_Prdnum_Internalname = "DTA_PRDNUM" ;
      edtDta_PrdNom_Internalname = "DTA_PRDNOM" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtDta_Forcan_Internalname = "DTA_FORCAN" ;
      edtDta_clave1_Internalname = "DTA_CLAVE1" ;
      edtDta_clave2_Internalname = "DTA_CLAVE2" ;
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
      lblTextblock17_Caption = httpContext.getMessage( "N baños", "") ;
      lblTextblock16_Caption = httpContext.getMessage( "Ultima Linea", "") ;
      lblTextblock15_Caption = httpContext.getMessage( "PH Mn", "") ;
      lblTextblock14_Caption = httpContext.getMessage( "Ph Mx", "") ;
      lblTextblock13_Caption = httpContext.getMessage( "Rb", "") ;
      lblTextblock12_Caption = httpContext.getMessage( "TºC", "") ;
      lblTextblock11_Caption = httpContext.getMessage( "Tiempo", "") ;
      lblTextblock10_Caption = httpContext.getMessage( "Tipo L T M", "") ;
      lblTextblock9_Caption = httpContext.getMessage( "Dta DPQ", "") ;
      lblTextblock8_Caption = httpContext.getMessage( "Proceso Q", "") ;
      lblTextblock6_Caption = httpContext.getMessage( "Orden PQ", "") ;
      subGrid1_Borderwidth = (short)(1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "PQUIMICOS F(PEDIDO)", "") );
      edtDta_clave2_Jsonclick = "" ;
      edtDta_clave1_Jsonclick = "" ;
      edtDta_Forcan_Jsonclick = "" ;
      edtForPrdDsc_Jsonclick = "" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtDta_PrdNom_Jsonclick = "" ;
      edtDta_Prdnum_Jsonclick = "" ;
      edtDta_ForLin_Jsonclick = "" ;
      edtavnRcdDeleted_1107_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtDta_Nh2o_Jsonclick = "" ;
      edtDta_ForUli_Jsonclick = "" ;
      edtDta_ForPhn_Jsonclick = "" ;
      edtDta_ForPhx_Jsonclick = "" ;
      edtDta_ForRb_Jsonclick = "" ;
      edtDta_ForTmx_Jsonclick = "" ;
      edtDta_Fortie_Jsonclick = "" ;
      edtDta_ForFab_Jsonclick = "" ;
      edtDta_DPQ_Jsonclick = "" ;
      edtDta_CPQ_Jsonclick = "" ;
      edtDta_Ordl_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtDta_clave2_Enabled = 1 ;
      edtDta_clave1_Enabled = 1 ;
      edtDta_Forcan_Enabled = 1 ;
      edtForPrdDsc_Enabled = 0 ;
      edtForPrdUMe_Enabled = 1 ;
      edtDta_PrdNom_Enabled = 0 ;
      edtDta_Prdnum_Enabled = 1 ;
      edtDta_ForLin_Enabled = 1 ;
      edtavnRcdDeleted_1107_Enabled = 1 ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtDta_Nh2o_Enabled = 1 ;
      edtDta_ForUli_Enabled = 0 ;
      edtDta_ForPhn_Enabled = 1 ;
      edtDta_ForPhx_Enabled = 1 ;
      edtDta_ForRb_Enabled = 1 ;
      edtDta_ForTmx_Enabled = 1 ;
      edtDta_Fortie_Enabled = 1 ;
      edtDta_ForFab_Enabled = 1 ;
      edtDta_DPQ_Enabled = 0 ;
      edtDta_CPQ_Enabled = 1 ;
      edtDta_Ordl_Enabled = 1 ;
      edtDta_UOrd_Jsonclick = "" ;
      edtDta_UOrd_Backcolor = (int)(0xFFFFFF) ;
      edtDta_UOrd_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtDisFasLin_Jsonclick = "" ;
      edtDisFasLin_Backcolor = (int)(0xFFFFFF) ;
      edtDisFasLin_Enabled = 0 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Backcolor = (int)(0xFFFFFF) ;
      edtProCod_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Backcolor = (int)(0xFFFFFF) ;
      edtDisCod_Enabled = 0 ;
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

   public void gx2asadta_dpq10H1106( String A396EmprCod ,
                                     String A7920Dta_CPQ )
   {
      GXt_char1 = A7921Dta_DPQ ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7920Dta_CPQ ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd3(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt004_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt004_impl.this.A7920Dta_CPQ = GXv_char3[0] ;
      tdt004_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7921Dta_DPQ = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7921Dta_DPQ))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx9asadta_prdnom10H1107( String A396EmprCod ,
                                        String A7930Dta_Prdnum )
   {
      GXt_char1 = A7931Dta_PrdNom ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7930Dta_Prdnum ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt004_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt004_impl.this.A7930Dta_Prdnum = GXv_char3[0] ;
      tdt004_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7931Dta_PrdNom = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7931Dta_PrdNom))+"\"") ;
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
      subsflControlProps_501106( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal10H1106( ) ;
         standaloneModal10H1106( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow10H1106( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501106( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1121107( ) ;
      while ( nGXsfl_112_idx <= nRC_GXsfl_112 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal10H1106( ) ;
         standaloneModal10H1106( ) ;
         standaloneNotModal10H1107( ) ;
         standaloneModal10H1107( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow10H1107( ) ;
         nGXsfl_112_idx = (int)(nGXsfl_112_idx+1) ;
         sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx), 4, 0), (short)(4), "0") + sGXsfl_50_idx ;
         subsflControlProps_1121107( ) ;
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
      /* Using cursor T010H41 */
      pr_default.execute(39, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(39) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T010H41_A407EmprNom[0] ;
      n407EmprNom = T010H41_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(39);
      /* Using cursor T010H42 */
      pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(40) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISLIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(40);
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

   public void valid_Disfaslin( )
   {
      n7918Dta_UOrd = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", GXutil.rtrim( A457FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A7918Dta_UOrd", GXutil.ltrim( localUtil.ntoc( A7918Dta_UOrd, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7744FasPreObl", GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z368DisFasLin", GXutil.ltrim( localUtil.ntoc( Z368DisFasLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7918Dta_UOrd", GXutil.ltrim( localUtil.ntoc( Z7918Dta_UOrd, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7744FasPreObl", GXutil.ltrim( localUtil.ntoc( Z7744FasPreObl, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O7918Dta_UOrd", GXutil.ltrim( localUtil.ntoc( O7918Dta_UOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Dta_cpq( )
   {
      n7920Dta_CPQ = false ;
      GXt_char1 = A7921Dta_DPQ ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7920Dta_CPQ ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd3(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt004_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt004_impl.this.A7920Dta_CPQ = GXv_char3[0] ;
      tdt004_impl.this.GXt_char1 = GXv_char2[0] ;
      A7921Dta_DPQ = GXt_char1 ;
      if ( ( GXutil.strcmp(A7921Dta_DPQ, httpContext.getMessage( "Error", "")) == 0 ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Inexistente", ""), 1, "DTA_CPQ");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDta_CPQ_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7921Dta_DPQ", GXutil.rtrim( A7921Dta_DPQ));
   }

   public void valid_Dta_prdnum( )
   {
      n7930Dta_Prdnum = false ;
      GXt_char1 = A7931Dta_PrdNom ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7930Dta_Prdnum ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt004_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt004_impl.this.A7930Dta_Prdnum = GXv_char3[0] ;
      tdt004_impl.this.GXt_char1 = GXv_char2[0] ;
      A7931Dta_PrdNom = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7931Dta_PrdNom", GXutil.rtrim( A7931Dta_PrdNom));
   }

   public void valid_Forprdume( )
   {
      n490ForPrdUMe = false ;
      n488ForPrdDsc = false ;
      /* Using cursor T010H39 */
      pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(37) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      A488ForPrdDsc = T010H39_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T010H39_n488ForPrdDsc[0] ;
      pr_default.close(37);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A368DisFasLin',fld:'DISFASLIN',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A457FasCod',fld:'FASCOD',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[]");
      setEventMetadata("VALID_DISCOD",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
      setEventMetadata("VALID_DISFASLIN","{handler:'valid_Disfaslin',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A7918Dta_UOrd',fld:'DTA_UORD',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A368DisFasLin',fld:'DISFASLIN',pic:'ZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_DISFASLIN",",oparms:[{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A7918Dta_UOrd',fld:'DTA_UORD',pic:'ZZZ9'},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z361DisCod'},{av:'Z758ProCod'},{av:'Z368DisFasLin'},{av:'Z457FasCod'},{av:'Z407EmprNom'},{av:'Z7918Dta_UOrd'},{av:'Z7744FasPreObl'},{av:'O7918Dta_UOrd'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_DTA_UORD","{handler:'valid_Dta_uord',iparms:[]");
      setEventMetadata("VALID_DTA_UORD",",oparms:[]}");
      setEventMetadata("VALID_DTA_ORDL","{handler:'valid_Dta_ordl',iparms:[]");
      setEventMetadata("VALID_DTA_ORDL",",oparms:[]}");
      setEventMetadata("VALID_DTA_CPQ","{handler:'valid_Dta_cpq',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7920Dta_CPQ',fld:'DTA_CPQ',pic:''},{av:'A7921Dta_DPQ',fld:'DTA_DPQ',pic:''}]");
      setEventMetadata("VALID_DTA_CPQ",",oparms:[{av:'A7921Dta_DPQ',fld:'DTA_DPQ',pic:''}]}");
      setEventMetadata("VALID_DTA_DPQ","{handler:'valid_Dta_dpq',iparms:[]");
      setEventMetadata("VALID_DTA_DPQ",",oparms:[]}");
      setEventMetadata("VALID_DTA_FORULI","{handler:'valid_Dta_foruli',iparms:[]");
      setEventMetadata("VALID_DTA_FORULI",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Dta_nh2o',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_DTA_FORLIN","{handler:'valid_Dta_forlin',iparms:[]");
      setEventMetadata("VALID_DTA_FORLIN",",oparms:[]}");
      setEventMetadata("VALID_DTA_PRDNUM","{handler:'valid_Dta_prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7930Dta_Prdnum',fld:'DTA_PRDNUM',pic:''},{av:'A7931Dta_PrdNom',fld:'DTA_PRDNOM',pic:''}]");
      setEventMetadata("VALID_DTA_PRDNUM",",oparms:[{av:'A7931Dta_PrdNom',fld:'DTA_PRDNOM',pic:''}]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Dta_clave2',iparms:[]");
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
      pr_default.close(37);
      pr_default.close(39);
      pr_default.close(40);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA758ProCod = "" ;
      Z396EmprCod = "" ;
      Z758ProCod = "" ;
      Z457FasCod = "" ;
      Z7920Dta_CPQ = "" ;
      Z7922Dta_ForFab = "" ;
      Z7925Dta_ForRb = DecimalUtil.ZERO ;
      Z7926Dta_ForPhx = DecimalUtil.ZERO ;
      Z7927Dta_ForPhn = DecimalUtil.ZERO ;
      Z7930Dta_Prdnum = "" ;
      Z7932Dta_Forcan = DecimalUtil.ZERO ;
      Z8479Dta_clave1 = "" ;
      Z8480Dta_clave2 = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A7920Dta_CPQ = "" ;
      A7930Dta_Prdnum = "" ;
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
      A407EmprNom = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1106 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A457FasCod = "" ;
      AV33Pgmname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode39 = "" ;
      GXCCtl = "" ;
      A7931Dta_PrdNom = "" ;
      A488ForPrdDsc = "" ;
      A7932Dta_Forcan = DecimalUtil.ZERO ;
      A8479Dta_clave1 = "" ;
      A8480Dta_clave2 = "" ;
      A7921Dta_DPQ = "" ;
      A7922Dta_ForFab = "" ;
      A7925Dta_ForRb = DecimalUtil.ZERO ;
      A7926Dta_ForPhx = DecimalUtil.ZERO ;
      A7927Dta_ForPhn = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      T010H9_A407EmprNom = new String[] {""} ;
      T010H9_n407EmprNom = new boolean[] {false} ;
      T010H10_A396EmprCod = new String[] {""} ;
      T010H11_A7744FasPreObl = new byte[1] ;
      T010H11_n7744FasPreObl = new boolean[] {false} ;
      T010H12_A457FasCod = new String[] {""} ;
      T010H12_A368DisFasLin = new short[1] ;
      T010H12_A407EmprNom = new String[] {""} ;
      T010H12_n407EmprNom = new boolean[] {false} ;
      T010H12_A7918Dta_UOrd = new short[1] ;
      T010H12_n7918Dta_UOrd = new boolean[] {false} ;
      T010H12_A7744FasPreObl = new byte[1] ;
      T010H12_n7744FasPreObl = new boolean[] {false} ;
      T010H12_A396EmprCod = new String[] {""} ;
      T010H12_A361DisCod = new int[1] ;
      T010H12_A758ProCod = new String[] {""} ;
      T010H13_A396EmprCod = new String[] {""} ;
      T010H13_A361DisCod = new int[1] ;
      T010H13_A758ProCod = new String[] {""} ;
      T010H13_A368DisFasLin = new short[1] ;
      T010H8_A457FasCod = new String[] {""} ;
      T010H8_A368DisFasLin = new short[1] ;
      T010H8_A7918Dta_UOrd = new short[1] ;
      T010H8_n7918Dta_UOrd = new boolean[] {false} ;
      T010H8_A396EmprCod = new String[] {""} ;
      T010H8_A361DisCod = new int[1] ;
      T010H8_A758ProCod = new String[] {""} ;
      T010H8_A7744FasPreObl = new byte[1] ;
      T010H8_n7744FasPreObl = new boolean[] {false} ;
      T010H14_A396EmprCod = new String[] {""} ;
      T010H14_A361DisCod = new int[1] ;
      T010H14_A758ProCod = new String[] {""} ;
      T010H14_A368DisFasLin = new short[1] ;
      T010H15_A396EmprCod = new String[] {""} ;
      T010H15_A361DisCod = new int[1] ;
      T010H15_A758ProCod = new String[] {""} ;
      T010H15_A368DisFasLin = new short[1] ;
      T010H7_A457FasCod = new String[] {""} ;
      T010H7_A368DisFasLin = new short[1] ;
      T010H7_A7918Dta_UOrd = new short[1] ;
      T010H7_n7918Dta_UOrd = new boolean[] {false} ;
      T010H7_A396EmprCod = new String[] {""} ;
      T010H7_A361DisCod = new int[1] ;
      T010H7_A758ProCod = new String[] {""} ;
      T010H7_A7744FasPreObl = new byte[1] ;
      T010H7_n7744FasPreObl = new boolean[] {false} ;
      T010H19_A396EmprCod = new String[] {""} ;
      T010H19_A361DisCod = new int[1] ;
      T010H19_A758ProCod = new String[] {""} ;
      T010H19_A368DisFasLin = new short[1] ;
      T010H19_A7919Dta_Ordl = new short[1] ;
      T010H20_A396EmprCod = new String[] {""} ;
      T010H20_A361DisCod = new int[1] ;
      T010H20_A758ProCod = new String[] {""} ;
      T010H20_A368DisFasLin = new short[1] ;
      T010H20_A7727ArtAdiCod = new short[1] ;
      T010H21_A396EmprCod = new String[] {""} ;
      T010H21_A361DisCod = new int[1] ;
      T010H21_A758ProCod = new String[] {""} ;
      T010H21_A368DisFasLin = new short[1] ;
      T010H21_A5377DisQuiLin = new short[1] ;
      T010H22_A396EmprCod = new String[] {""} ;
      T010H22_A361DisCod = new int[1] ;
      T010H22_A758ProCod = new String[] {""} ;
      T010H22_A368DisFasLin = new short[1] ;
      T010H22_A5035A_Discod = new int[1] ;
      T010H22_A5038A_DProcod = new String[] {""} ;
      T010H22_A5039A_DOrdlin = new short[1] ;
      T010H23_A396EmprCod = new String[] {""} ;
      T010H23_A361DisCod = new int[1] ;
      T010H23_A758ProCod = new String[] {""} ;
      T010H23_A368DisFasLin = new short[1] ;
      T010H23_A1664ParFasCod = new short[1] ;
      T010H25_A396EmprCod = new String[] {""} ;
      T010H25_A361DisCod = new int[1] ;
      T010H25_A758ProCod = new String[] {""} ;
      T010H25_A368DisFasLin = new short[1] ;
      T010H26_A361DisCod = new int[1] ;
      T010H26_A758ProCod = new String[] {""} ;
      T010H26_A368DisFasLin = new short[1] ;
      T010H26_A7919Dta_Ordl = new short[1] ;
      T010H26_A7920Dta_CPQ = new String[] {""} ;
      T010H26_n7920Dta_CPQ = new boolean[] {false} ;
      T010H26_A7922Dta_ForFab = new String[] {""} ;
      T010H26_n7922Dta_ForFab = new boolean[] {false} ;
      T010H26_A7923Dta_Fortie = new short[1] ;
      T010H26_n7923Dta_Fortie = new boolean[] {false} ;
      T010H26_A7924Dta_ForTmx = new short[1] ;
      T010H26_n7924Dta_ForTmx = new boolean[] {false} ;
      T010H26_A7925Dta_ForRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010H26_n7925Dta_ForRb = new boolean[] {false} ;
      T010H26_A7926Dta_ForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010H26_n7926Dta_ForPhx = new boolean[] {false} ;
      T010H26_A7927Dta_ForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010H26_n7927Dta_ForPhn = new boolean[] {false} ;
      T010H26_A7928Dta_ForUli = new short[1] ;
      T010H26_n7928Dta_ForUli = new boolean[] {false} ;
      T010H26_A12112Dta_Nh2o = new short[1] ;
      T010H26_n12112Dta_Nh2o = new boolean[] {false} ;
      T010H26_A396EmprCod = new String[] {""} ;
      T010H27_A396EmprCod = new String[] {""} ;
      T010H27_A361DisCod = new int[1] ;
      T010H27_A758ProCod = new String[] {""} ;
      T010H27_A368DisFasLin = new short[1] ;
      T010H27_A7919Dta_Ordl = new short[1] ;
      T010H6_A361DisCod = new int[1] ;
      T010H6_A758ProCod = new String[] {""} ;
      T010H6_A368DisFasLin = new short[1] ;
      T010H6_A7919Dta_Ordl = new short[1] ;
      T010H6_A7920Dta_CPQ = new String[] {""} ;
      T010H6_n7920Dta_CPQ = new boolean[] {false} ;
      T010H6_A7922Dta_ForFab = new String[] {""} ;
      T010H6_n7922Dta_ForFab = new boolean[] {false} ;
      T010H6_A7923Dta_Fortie = new short[1] ;
      T010H6_n7923Dta_Fortie = new boolean[] {false} ;
      T010H6_A7924Dta_ForTmx = new short[1] ;
      T010H6_n7924Dta_ForTmx = new boolean[] {false} ;
      T010H6_A7925Dta_ForRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010H6_n7925Dta_ForRb = new boolean[] {false} ;
      T010H6_A7926Dta_ForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010H6_n7926Dta_ForPhx = new boolean[] {false} ;
      T010H6_A7927Dta_ForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010H6_n7927Dta_ForPhn = new boolean[] {false} ;
      T010H6_A7928Dta_ForUli = new short[1] ;
      T010H6_n7928Dta_ForUli = new boolean[] {false} ;
      T010H6_A12112Dta_Nh2o = new short[1] ;
      T010H6_n12112Dta_Nh2o = new boolean[] {false} ;
      T010H6_A396EmprCod = new String[] {""} ;
      T010H5_A361DisCod = new int[1] ;
      T010H5_A758ProCod = new String[] {""} ;
      T010H5_A368DisFasLin = new short[1] ;
      T010H5_A7919Dta_Ordl = new short[1] ;
      T010H5_A7920Dta_CPQ = new String[] {""} ;
      T010H5_n7920Dta_CPQ = new boolean[] {false} ;
      T010H5_A7922Dta_ForFab = new String[] {""} ;
      T010H5_n7922Dta_ForFab = new boolean[] {false} ;
      T010H5_A7923Dta_Fortie = new short[1] ;
      T010H5_n7923Dta_Fortie = new boolean[] {false} ;
      T010H5_A7924Dta_ForTmx = new short[1] ;
      T010H5_n7924Dta_ForTmx = new boolean[] {false} ;
      T010H5_A7925Dta_ForRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010H5_n7925Dta_ForRb = new boolean[] {false} ;
      T010H5_A7926Dta_ForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010H5_n7926Dta_ForPhx = new boolean[] {false} ;
      T010H5_A7927Dta_ForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010H5_n7927Dta_ForPhn = new boolean[] {false} ;
      T010H5_A7928Dta_ForUli = new short[1] ;
      T010H5_n7928Dta_ForUli = new boolean[] {false} ;
      T010H5_A12112Dta_Nh2o = new short[1] ;
      T010H5_n12112Dta_Nh2o = new boolean[] {false} ;
      T010H5_A396EmprCod = new String[] {""} ;
      T010H32_A396EmprCod = new String[] {""} ;
      T010H32_A361DisCod = new int[1] ;
      T010H32_A758ProCod = new String[] {""} ;
      T010H32_A368DisFasLin = new short[1] ;
      T010H32_A7919Dta_Ordl = new short[1] ;
      Z488ForPrdDsc = "" ;
      T010H33_A361DisCod = new int[1] ;
      T010H33_A758ProCod = new String[] {""} ;
      T010H33_A368DisFasLin = new short[1] ;
      T010H33_A7919Dta_Ordl = new short[1] ;
      T010H33_A7929Dta_ForLin = new short[1] ;
      T010H33_A7930Dta_Prdnum = new String[] {""} ;
      T010H33_n7930Dta_Prdnum = new boolean[] {false} ;
      T010H33_A488ForPrdDsc = new String[] {""} ;
      T010H33_n488ForPrdDsc = new boolean[] {false} ;
      T010H33_A7932Dta_Forcan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010H33_n7932Dta_Forcan = new boolean[] {false} ;
      T010H33_A8479Dta_clave1 = new String[] {""} ;
      T010H33_n8479Dta_clave1 = new boolean[] {false} ;
      T010H33_A8480Dta_clave2 = new String[] {""} ;
      T010H33_n8480Dta_clave2 = new boolean[] {false} ;
      T010H33_A396EmprCod = new String[] {""} ;
      T010H33_A490ForPrdUMe = new byte[1] ;
      T010H33_n490ForPrdUMe = new boolean[] {false} ;
      T010H4_A488ForPrdDsc = new String[] {""} ;
      T010H4_n488ForPrdDsc = new boolean[] {false} ;
      T010H34_A488ForPrdDsc = new String[] {""} ;
      T010H34_n488ForPrdDsc = new boolean[] {false} ;
      T010H35_A396EmprCod = new String[] {""} ;
      T010H35_A361DisCod = new int[1] ;
      T010H35_A758ProCod = new String[] {""} ;
      T010H35_A368DisFasLin = new short[1] ;
      T010H35_A7919Dta_Ordl = new short[1] ;
      T010H35_A7929Dta_ForLin = new short[1] ;
      T010H3_A361DisCod = new int[1] ;
      T010H3_A758ProCod = new String[] {""} ;
      T010H3_A368DisFasLin = new short[1] ;
      T010H3_A7919Dta_Ordl = new short[1] ;
      T010H3_A7929Dta_ForLin = new short[1] ;
      T010H3_A7930Dta_Prdnum = new String[] {""} ;
      T010H3_n7930Dta_Prdnum = new boolean[] {false} ;
      T010H3_A7932Dta_Forcan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010H3_n7932Dta_Forcan = new boolean[] {false} ;
      T010H3_A8479Dta_clave1 = new String[] {""} ;
      T010H3_n8479Dta_clave1 = new boolean[] {false} ;
      T010H3_A8480Dta_clave2 = new String[] {""} ;
      T010H3_n8480Dta_clave2 = new boolean[] {false} ;
      T010H3_A396EmprCod = new String[] {""} ;
      T010H3_A490ForPrdUMe = new byte[1] ;
      T010H3_n490ForPrdUMe = new boolean[] {false} ;
      sMode1107 = "" ;
      T010H2_A361DisCod = new int[1] ;
      T010H2_A758ProCod = new String[] {""} ;
      T010H2_A368DisFasLin = new short[1] ;
      T010H2_A7919Dta_Ordl = new short[1] ;
      T010H2_A7929Dta_ForLin = new short[1] ;
      T010H2_A7930Dta_Prdnum = new String[] {""} ;
      T010H2_n7930Dta_Prdnum = new boolean[] {false} ;
      T010H2_A7932Dta_Forcan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010H2_n7932Dta_Forcan = new boolean[] {false} ;
      T010H2_A8479Dta_clave1 = new String[] {""} ;
      T010H2_n8479Dta_clave1 = new boolean[] {false} ;
      T010H2_A8480Dta_clave2 = new String[] {""} ;
      T010H2_n8480Dta_clave2 = new boolean[] {false} ;
      T010H2_A396EmprCod = new String[] {""} ;
      T010H2_A490ForPrdUMe = new byte[1] ;
      T010H2_n490ForPrdUMe = new boolean[] {false} ;
      T010H39_A488ForPrdDsc = new String[] {""} ;
      T010H39_n488ForPrdDsc = new boolean[] {false} ;
      T010H40_A396EmprCod = new String[] {""} ;
      T010H40_A361DisCod = new int[1] ;
      T010H40_A758ProCod = new String[] {""} ;
      T010H40_A368DisFasLin = new short[1] ;
      T010H40_A7919Dta_Ordl = new short[1] ;
      T010H40_A7929Dta_ForLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblTextblock7_Jsonclick = "" ;
      ROClassString = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      T010H41_A407EmprNom = new String[] {""} ;
      T010H41_n407EmprNom = new boolean[] {false} ;
      T010H42_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ758ProCod = "" ;
      ZZ457FasCod = "" ;
      ZZ407EmprNom = "" ;
      Z7921Dta_DPQ = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Z7931Dta_PrdNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdt004__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdt004__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdt004__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdt004__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdt004__default(),
         new Object[] {
             new Object[] {
            T010H2_A361DisCod, T010H2_A758ProCod, T010H2_A368DisFasLin, T010H2_A7919Dta_Ordl, T010H2_A7929Dta_ForLin, T010H2_A7930Dta_Prdnum, T010H2_n7930Dta_Prdnum, T010H2_A7932Dta_Forcan, T010H2_n7932Dta_Forcan, T010H2_A8479Dta_clave1,
            T010H2_n8479Dta_clave1, T010H2_A8480Dta_clave2, T010H2_n8480Dta_clave2, T010H2_A396EmprCod, T010H2_A490ForPrdUMe, T010H2_n490ForPrdUMe
            }
            , new Object[] {
            T010H3_A361DisCod, T010H3_A758ProCod, T010H3_A368DisFasLin, T010H3_A7919Dta_Ordl, T010H3_A7929Dta_ForLin, T010H3_A7930Dta_Prdnum, T010H3_n7930Dta_Prdnum, T010H3_A7932Dta_Forcan, T010H3_n7932Dta_Forcan, T010H3_A8479Dta_clave1,
            T010H3_n8479Dta_clave1, T010H3_A8480Dta_clave2, T010H3_n8480Dta_clave2, T010H3_A396EmprCod, T010H3_A490ForPrdUMe, T010H3_n490ForPrdUMe
            }
            , new Object[] {
            T010H4_A488ForPrdDsc, T010H4_n488ForPrdDsc
            }
            , new Object[] {
            T010H5_A361DisCod, T010H5_A758ProCod, T010H5_A368DisFasLin, T010H5_A7919Dta_Ordl, T010H5_A7920Dta_CPQ, T010H5_n7920Dta_CPQ, T010H5_A7922Dta_ForFab, T010H5_n7922Dta_ForFab, T010H5_A7923Dta_Fortie, T010H5_n7923Dta_Fortie,
            T010H5_A7924Dta_ForTmx, T010H5_n7924Dta_ForTmx, T010H5_A7925Dta_ForRb, T010H5_n7925Dta_ForRb, T010H5_A7926Dta_ForPhx, T010H5_n7926Dta_ForPhx, T010H5_A7927Dta_ForPhn, T010H5_n7927Dta_ForPhn, T010H5_A7928Dta_ForUli, T010H5_n7928Dta_ForUli,
            T010H5_A12112Dta_Nh2o, T010H5_n12112Dta_Nh2o, T010H5_A396EmprCod
            }
            , new Object[] {
            T010H6_A361DisCod, T010H6_A758ProCod, T010H6_A368DisFasLin, T010H6_A7919Dta_Ordl, T010H6_A7920Dta_CPQ, T010H6_n7920Dta_CPQ, T010H6_A7922Dta_ForFab, T010H6_n7922Dta_ForFab, T010H6_A7923Dta_Fortie, T010H6_n7923Dta_Fortie,
            T010H6_A7924Dta_ForTmx, T010H6_n7924Dta_ForTmx, T010H6_A7925Dta_ForRb, T010H6_n7925Dta_ForRb, T010H6_A7926Dta_ForPhx, T010H6_n7926Dta_ForPhx, T010H6_A7927Dta_ForPhn, T010H6_n7927Dta_ForPhn, T010H6_A7928Dta_ForUli, T010H6_n7928Dta_ForUli,
            T010H6_A12112Dta_Nh2o, T010H6_n12112Dta_Nh2o, T010H6_A396EmprCod
            }
            , new Object[] {
            T010H7_A457FasCod, T010H7_A368DisFasLin, T010H7_A7918Dta_UOrd, T010H7_n7918Dta_UOrd, T010H7_A396EmprCod, T010H7_A361DisCod, T010H7_A758ProCod, T010H7_A7744FasPreObl, T010H7_n7744FasPreObl
            }
            , new Object[] {
            T010H8_A457FasCod, T010H8_A368DisFasLin, T010H8_A7918Dta_UOrd, T010H8_n7918Dta_UOrd, T010H8_A396EmprCod, T010H8_A361DisCod, T010H8_A758ProCod, T010H8_A7744FasPreObl, T010H8_n7744FasPreObl
            }
            , new Object[] {
            T010H9_A407EmprNom, T010H9_n407EmprNom
            }
            , new Object[] {
            T010H10_A396EmprCod
            }
            , new Object[] {
            T010H11_A7744FasPreObl, T010H11_n7744FasPreObl
            }
            , new Object[] {
            T010H12_A457FasCod, T010H12_A368DisFasLin, T010H12_A407EmprNom, T010H12_n407EmprNom, T010H12_A7918Dta_UOrd, T010H12_n7918Dta_UOrd, T010H12_A7744FasPreObl, T010H12_n7744FasPreObl, T010H12_A396EmprCod, T010H12_A361DisCod,
            T010H12_A758ProCod
            }
            , new Object[] {
            T010H13_A396EmprCod, T010H13_A361DisCod, T010H13_A758ProCod, T010H13_A368DisFasLin
            }
            , new Object[] {
            T010H14_A396EmprCod, T010H14_A361DisCod, T010H14_A758ProCod, T010H14_A368DisFasLin
            }
            , new Object[] {
            T010H15_A396EmprCod, T010H15_A361DisCod, T010H15_A758ProCod, T010H15_A368DisFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T010H19_A396EmprCod, T010H19_A361DisCod, T010H19_A758ProCod, T010H19_A368DisFasLin, T010H19_A7919Dta_Ordl
            }
            , new Object[] {
            T010H20_A396EmprCod, T010H20_A361DisCod, T010H20_A758ProCod, T010H20_A368DisFasLin, T010H20_A7727ArtAdiCod
            }
            , new Object[] {
            T010H21_A396EmprCod, T010H21_A361DisCod, T010H21_A758ProCod, T010H21_A368DisFasLin, T010H21_A5377DisQuiLin
            }
            , new Object[] {
            T010H22_A396EmprCod, T010H22_A361DisCod, T010H22_A758ProCod, T010H22_A368DisFasLin, T010H22_A5035A_Discod, T010H22_A5038A_DProcod, T010H22_A5039A_DOrdlin
            }
            , new Object[] {
            T010H23_A396EmprCod, T010H23_A361DisCod, T010H23_A758ProCod, T010H23_A368DisFasLin, T010H23_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            T010H25_A396EmprCod, T010H25_A361DisCod, T010H25_A758ProCod, T010H25_A368DisFasLin
            }
            , new Object[] {
            T010H26_A361DisCod, T010H26_A758ProCod, T010H26_A368DisFasLin, T010H26_A7919Dta_Ordl, T010H26_A7920Dta_CPQ, T010H26_n7920Dta_CPQ, T010H26_A7922Dta_ForFab, T010H26_n7922Dta_ForFab, T010H26_A7923Dta_Fortie, T010H26_n7923Dta_Fortie,
            T010H26_A7924Dta_ForTmx, T010H26_n7924Dta_ForTmx, T010H26_A7925Dta_ForRb, T010H26_n7925Dta_ForRb, T010H26_A7926Dta_ForPhx, T010H26_n7926Dta_ForPhx, T010H26_A7927Dta_ForPhn, T010H26_n7927Dta_ForPhn, T010H26_A7928Dta_ForUli, T010H26_n7928Dta_ForUli,
            T010H26_A12112Dta_Nh2o, T010H26_n12112Dta_Nh2o, T010H26_A396EmprCod
            }
            , new Object[] {
            T010H27_A396EmprCod, T010H27_A361DisCod, T010H27_A758ProCod, T010H27_A368DisFasLin, T010H27_A7919Dta_Ordl
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
            T010H32_A396EmprCod, T010H32_A361DisCod, T010H32_A758ProCod, T010H32_A368DisFasLin, T010H32_A7919Dta_Ordl
            }
            , new Object[] {
            T010H33_A361DisCod, T010H33_A758ProCod, T010H33_A368DisFasLin, T010H33_A7919Dta_Ordl, T010H33_A7929Dta_ForLin, T010H33_A7930Dta_Prdnum, T010H33_n7930Dta_Prdnum, T010H33_A488ForPrdDsc, T010H33_n488ForPrdDsc, T010H33_A7932Dta_Forcan,
            T010H33_n7932Dta_Forcan, T010H33_A8479Dta_clave1, T010H33_n8479Dta_clave1, T010H33_A8480Dta_clave2, T010H33_n8480Dta_clave2, T010H33_A396EmprCod, T010H33_A490ForPrdUMe, T010H33_n490ForPrdUMe
            }
            , new Object[] {
            T010H34_A488ForPrdDsc, T010H34_n488ForPrdDsc
            }
            , new Object[] {
            T010H35_A396EmprCod, T010H35_A361DisCod, T010H35_A758ProCod, T010H35_A368DisFasLin, T010H35_A7919Dta_Ordl, T010H35_A7929Dta_ForLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T010H39_A488ForPrdDsc, T010H39_n488ForPrdDsc
            }
            , new Object[] {
            T010H40_A396EmprCod, T010H40_A361DisCod, T010H40_A758ProCod, T010H40_A368DisFasLin, T010H40_A7919Dta_Ordl, T010H40_A7929Dta_ForLin
            }
            , new Object[] {
            T010H41_A407EmprNom, T010H41_n407EmprNom
            }
            , new Object[] {
            T010H42_A396EmprCod
            }
         }
      );
      Z368DisFasLin = (short)(0) ;
      A368DisFasLin = (short)(0) ;
      Z758ProCod = "" ;
      A758ProCod = "" ;
      Z361DisCod = 0 ;
      A361DisCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TDT004" ;
   }

   private byte Z490ForPrdUMe ;
   private byte GxWebError ;
   private byte A490ForPrdUMe ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A7744FasPreObl ;
   private byte Z7744FasPreObl ;
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
   private byte ZZ7744FasPreObl ;
   private short wcpOA368DisFasLin ;
   private short Z368DisFasLin ;
   private short Z7918Dta_UOrd ;
   private short O7918Dta_UOrd ;
   private short Z7919Dta_Ordl ;
   private short Z7923Dta_Fortie ;
   private short Z7924Dta_ForTmx ;
   private short Z7928Dta_ForUli ;
   private short Z12112Dta_Nh2o ;
   private short O7928Dta_ForUli ;
   private short nRcdDeleted_1106 ;
   private short nRcdExists_1106 ;
   private short nIsMod_1106 ;
   private short Z7929Dta_ForLin ;
   private short nRcdDeleted_1107 ;
   private short nRcdExists_1107 ;
   private short nIsMod_1107 ;
   private short A368DisFasLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A7918Dta_UOrd ;
   private short A7928Dta_ForUli ;
   private short nBlankRcdCount1106 ;
   private short RcdFound1106 ;
   private short B7918Dta_UOrd ;
   private short nBlankRcdUsr1106 ;
   private short s7928Dta_ForUli ;
   private short RcdFound1107 ;
   private short A7929Dta_ForLin ;
   private short s7918Dta_UOrd ;
   private short A7919Dta_Ordl ;
   private short A7923Dta_Fortie ;
   private short A7924Dta_ForTmx ;
   private short A12112Dta_Nh2o ;
   private short T7928Dta_ForUli ;
   private short RcdFound39 ;
   private short nIsDirty_39 ;
   private short nIsDirty_1106 ;
   private short nIsDirty_1107 ;
   private short nBlankRcdCount1107 ;
   private short B7928Dta_ForUli ;
   private short nBlankRcdUsr1107 ;
   private short i7918Dta_UOrd ;
   private short i7928Dta_ForUli ;
   private short subGrid1_Borderwidth ;
   private short ZZ368DisFasLin ;
   private short ZZ7918Dta_UOrd ;
   private short ZO7918Dta_UOrd ;
   private int wcpOA361DisCod ;
   private int Z361DisCod ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
   private int nRC_GXsfl_112 ;
   private int nGXsfl_112_idx=1 ;
   private int A361DisCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtDisCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtProCod_Enabled ;
   private int edtDisFasLin_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtDta_UOrd_Enabled ;
   private int edtDta_Ordl_Enabled ;
   private int edtDta_CPQ_Enabled ;
   private int edtDta_DPQ_Enabled ;
   private int edtDta_ForFab_Enabled ;
   private int edtDta_Fortie_Enabled ;
   private int edtDta_ForTmx_Enabled ;
   private int edtDta_ForRb_Enabled ;
   private int edtDta_ForPhx_Enabled ;
   private int edtDta_ForPhn_Enabled ;
   private int edtDta_ForUli_Enabled ;
   private int edtDta_Nh2o_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int edtavnRcdDeleted_1107_Enabled ;
   private int edtDta_ForLin_Enabled ;
   private int edtDta_Prdnum_Enabled ;
   private int edtDta_PrdNom_Enabled ;
   private int edtForPrdUMe_Enabled ;
   private int edtForPrdDsc_Enabled ;
   private int edtDta_Forcan_Enabled ;
   private int edtDta_clave1_Enabled ;
   private int edtDta_clave2_Enabled ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtDta_ForLin_Enabled ;
   private int defedtDta_ForUli_Enabled ;
   private int defedtDta_Ordl_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtDta_UOrd_Backcolor ;
   private int edtDisFasLin_Backcolor ;
   private int edtProCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtDisCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ361DisCod ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private java.math.BigDecimal Z7925Dta_ForRb ;
   private java.math.BigDecimal Z7926Dta_ForPhx ;
   private java.math.BigDecimal Z7927Dta_ForPhn ;
   private java.math.BigDecimal Z7932Dta_Forcan ;
   private java.math.BigDecimal A7932Dta_Forcan ;
   private java.math.BigDecimal A7925Dta_ForRb ;
   private java.math.BigDecimal A7926Dta_ForPhx ;
   private java.math.BigDecimal A7927Dta_ForPhn ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA758ProCod ;
   private String Z396EmprCod ;
   private String Z758ProCod ;
   private String Z457FasCod ;
   private String Z7920Dta_CPQ ;
   private String Z7922Dta_ForFab ;
   private String Z7930Dta_Prdnum ;
   private String Z8479Dta_clave1 ;
   private String Z8480Dta_clave2 ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A7920Dta_CPQ ;
   private String A7930Dta_Prdnum ;
   private String A758ProCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_50_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_112_idx="0001" ;
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
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtDisFasLin_Internalname ;
   private String edtDisFasLin_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtDta_UOrd_Internalname ;
   private String edtDta_UOrd_Jsonclick ;
   private String sMode1106 ;
   private String edtDta_Ordl_Internalname ;
   private String edtDta_CPQ_Internalname ;
   private String edtDta_DPQ_Internalname ;
   private String edtDta_ForFab_Internalname ;
   private String edtDta_Fortie_Internalname ;
   private String edtDta_ForTmx_Internalname ;
   private String edtDta_ForRb_Internalname ;
   private String edtDta_ForPhx_Internalname ;
   private String edtDta_ForPhn_Internalname ;
   private String edtDta_ForUli_Internalname ;
   private String edtDta_Nh2o_Internalname ;
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
   private String A457FasCod ;
   private String AV33Pgmname ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String edtavnRcdDeleted_1107_Internalname ;
   private String sMode39 ;
   private String GXCCtl ;
   private String edtDta_ForLin_Internalname ;
   private String edtDta_Prdnum_Internalname ;
   private String edtDta_PrdNom_Internalname ;
   private String A7931Dta_PrdNom ;
   private String edtForPrdUMe_Internalname ;
   private String edtForPrdDsc_Internalname ;
   private String A488ForPrdDsc ;
   private String edtDta_Forcan_Internalname ;
   private String edtDta_clave1_Internalname ;
   private String A8479Dta_clave1 ;
   private String edtDta_clave2_Internalname ;
   private String A8480Dta_clave2 ;
   private String A7921Dta_DPQ ;
   private String A7922Dta_ForFab ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z488ForPrdDsc ;
   private String sMode1107 ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock17_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable3_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String ROClassString ;
   private String edtDta_Ordl_Jsonclick ;
   private String lblTextblock8_Jsonclick ;
   private String edtDta_CPQ_Jsonclick ;
   private String lblTextblock9_Jsonclick ;
   private String edtDta_DPQ_Jsonclick ;
   private String lblTextblock10_Jsonclick ;
   private String edtDta_ForFab_Jsonclick ;
   private String lblTextblock11_Jsonclick ;
   private String edtDta_Fortie_Jsonclick ;
   private String lblTextblock12_Jsonclick ;
   private String edtDta_ForTmx_Jsonclick ;
   private String lblTextblock13_Jsonclick ;
   private String edtDta_ForRb_Jsonclick ;
   private String lblTextblock14_Jsonclick ;
   private String edtDta_ForPhx_Jsonclick ;
   private String lblTextblock15_Jsonclick ;
   private String edtDta_ForPhn_Jsonclick ;
   private String lblTextblock16_Jsonclick ;
   private String edtDta_ForUli_Jsonclick ;
   private String lblTextblock17_Jsonclick ;
   private String edtDta_Nh2o_Jsonclick ;
   private String sGXsfl_112_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_1107_Jsonclick ;
   private String edtDta_ForLin_Jsonclick ;
   private String edtDta_Prdnum_Jsonclick ;
   private String edtDta_PrdNom_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtDta_Forcan_Jsonclick ;
   private String edtDta_clave1_Jsonclick ;
   private String edtDta_clave2_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String lblTextblock6_Caption ;
   private String lblTextblock8_Caption ;
   private String lblTextblock9_Caption ;
   private String lblTextblock10_Caption ;
   private String lblTextblock11_Caption ;
   private String lblTextblock12_Caption ;
   private String lblTextblock13_Caption ;
   private String lblTextblock14_Caption ;
   private String lblTextblock15_Caption ;
   private String lblTextblock16_Caption ;
   private String lblTextblock17_Caption ;
   private String subGrid2_Header ;
   private String ZZ396EmprCod ;
   private String ZZ758ProCod ;
   private String ZZ457FasCod ;
   private String ZZ407EmprNom ;
   private String Z7921Dta_DPQ ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z7931Dta_PrdNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n7920Dta_CPQ ;
   private boolean n7930Dta_Prdnum ;
   private boolean n490ForPrdUMe ;
   private boolean wbErr ;
   private boolean n7918Dta_UOrd ;
   private boolean n7928Dta_ForUli ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n7744FasPreObl ;
   private boolean n407EmprNom ;
   private boolean bGXsfl_112_Refreshing=false ;
   private boolean returnInSub ;
   private boolean n7922Dta_ForFab ;
   private boolean n7923Dta_Fortie ;
   private boolean n7924Dta_ForTmx ;
   private boolean n7925Dta_ForRb ;
   private boolean n7926Dta_ForPhx ;
   private boolean n7927Dta_ForPhn ;
   private boolean n12112Dta_Nh2o ;
   private boolean Gx_longc ;
   private boolean n488ForPrdDsc ;
   private boolean n7932Dta_Forcan ;
   private boolean n8479Dta_clave1 ;
   private boolean n8480Dta_clave2 ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T010H9_A407EmprNom ;
   private boolean[] T010H9_n407EmprNom ;
   private String[] T010H10_A396EmprCod ;
   private byte[] T010H11_A7744FasPreObl ;
   private boolean[] T010H11_n7744FasPreObl ;
   private String[] T010H12_A457FasCod ;
   private short[] T010H12_A368DisFasLin ;
   private String[] T010H12_A407EmprNom ;
   private boolean[] T010H12_n407EmprNom ;
   private short[] T010H12_A7918Dta_UOrd ;
   private boolean[] T010H12_n7918Dta_UOrd ;
   private byte[] T010H12_A7744FasPreObl ;
   private boolean[] T010H12_n7744FasPreObl ;
   private String[] T010H12_A396EmprCod ;
   private int[] T010H12_A361DisCod ;
   private String[] T010H12_A758ProCod ;
   private String[] T010H13_A396EmprCod ;
   private int[] T010H13_A361DisCod ;
   private String[] T010H13_A758ProCod ;
   private short[] T010H13_A368DisFasLin ;
   private String[] T010H8_A457FasCod ;
   private short[] T010H8_A368DisFasLin ;
   private short[] T010H8_A7918Dta_UOrd ;
   private boolean[] T010H8_n7918Dta_UOrd ;
   private String[] T010H8_A396EmprCod ;
   private int[] T010H8_A361DisCod ;
   private String[] T010H8_A758ProCod ;
   private byte[] T010H8_A7744FasPreObl ;
   private boolean[] T010H8_n7744FasPreObl ;
   private String[] T010H14_A396EmprCod ;
   private int[] T010H14_A361DisCod ;
   private String[] T010H14_A758ProCod ;
   private short[] T010H14_A368DisFasLin ;
   private String[] T010H15_A396EmprCod ;
   private int[] T010H15_A361DisCod ;
   private String[] T010H15_A758ProCod ;
   private short[] T010H15_A368DisFasLin ;
   private String[] T010H7_A457FasCod ;
   private short[] T010H7_A368DisFasLin ;
   private short[] T010H7_A7918Dta_UOrd ;
   private boolean[] T010H7_n7918Dta_UOrd ;
   private String[] T010H7_A396EmprCod ;
   private int[] T010H7_A361DisCod ;
   private String[] T010H7_A758ProCod ;
   private byte[] T010H7_A7744FasPreObl ;
   private boolean[] T010H7_n7744FasPreObl ;
   private String[] T010H19_A396EmprCod ;
   private int[] T010H19_A361DisCod ;
   private String[] T010H19_A758ProCod ;
   private short[] T010H19_A368DisFasLin ;
   private short[] T010H19_A7919Dta_Ordl ;
   private String[] T010H20_A396EmprCod ;
   private int[] T010H20_A361DisCod ;
   private String[] T010H20_A758ProCod ;
   private short[] T010H20_A368DisFasLin ;
   private short[] T010H20_A7727ArtAdiCod ;
   private String[] T010H21_A396EmprCod ;
   private int[] T010H21_A361DisCod ;
   private String[] T010H21_A758ProCod ;
   private short[] T010H21_A368DisFasLin ;
   private short[] T010H21_A5377DisQuiLin ;
   private String[] T010H22_A396EmprCod ;
   private int[] T010H22_A361DisCod ;
   private String[] T010H22_A758ProCod ;
   private short[] T010H22_A368DisFasLin ;
   private int[] T010H22_A5035A_Discod ;
   private String[] T010H22_A5038A_DProcod ;
   private short[] T010H22_A5039A_DOrdlin ;
   private String[] T010H23_A396EmprCod ;
   private int[] T010H23_A361DisCod ;
   private String[] T010H23_A758ProCod ;
   private short[] T010H23_A368DisFasLin ;
   private short[] T010H23_A1664ParFasCod ;
   private String[] T010H25_A396EmprCod ;
   private int[] T010H25_A361DisCod ;
   private String[] T010H25_A758ProCod ;
   private short[] T010H25_A368DisFasLin ;
   private int[] T010H26_A361DisCod ;
   private String[] T010H26_A758ProCod ;
   private short[] T010H26_A368DisFasLin ;
   private short[] T010H26_A7919Dta_Ordl ;
   private String[] T010H26_A7920Dta_CPQ ;
   private boolean[] T010H26_n7920Dta_CPQ ;
   private String[] T010H26_A7922Dta_ForFab ;
   private boolean[] T010H26_n7922Dta_ForFab ;
   private short[] T010H26_A7923Dta_Fortie ;
   private boolean[] T010H26_n7923Dta_Fortie ;
   private short[] T010H26_A7924Dta_ForTmx ;
   private boolean[] T010H26_n7924Dta_ForTmx ;
   private java.math.BigDecimal[] T010H26_A7925Dta_ForRb ;
   private boolean[] T010H26_n7925Dta_ForRb ;
   private java.math.BigDecimal[] T010H26_A7926Dta_ForPhx ;
   private boolean[] T010H26_n7926Dta_ForPhx ;
   private java.math.BigDecimal[] T010H26_A7927Dta_ForPhn ;
   private boolean[] T010H26_n7927Dta_ForPhn ;
   private short[] T010H26_A7928Dta_ForUli ;
   private boolean[] T010H26_n7928Dta_ForUli ;
   private short[] T010H26_A12112Dta_Nh2o ;
   private boolean[] T010H26_n12112Dta_Nh2o ;
   private String[] T010H26_A396EmprCod ;
   private String[] T010H27_A396EmprCod ;
   private int[] T010H27_A361DisCod ;
   private String[] T010H27_A758ProCod ;
   private short[] T010H27_A368DisFasLin ;
   private short[] T010H27_A7919Dta_Ordl ;
   private int[] T010H6_A361DisCod ;
   private String[] T010H6_A758ProCod ;
   private short[] T010H6_A368DisFasLin ;
   private short[] T010H6_A7919Dta_Ordl ;
   private String[] T010H6_A7920Dta_CPQ ;
   private boolean[] T010H6_n7920Dta_CPQ ;
   private String[] T010H6_A7922Dta_ForFab ;
   private boolean[] T010H6_n7922Dta_ForFab ;
   private short[] T010H6_A7923Dta_Fortie ;
   private boolean[] T010H6_n7923Dta_Fortie ;
   private short[] T010H6_A7924Dta_ForTmx ;
   private boolean[] T010H6_n7924Dta_ForTmx ;
   private java.math.BigDecimal[] T010H6_A7925Dta_ForRb ;
   private boolean[] T010H6_n7925Dta_ForRb ;
   private java.math.BigDecimal[] T010H6_A7926Dta_ForPhx ;
   private boolean[] T010H6_n7926Dta_ForPhx ;
   private java.math.BigDecimal[] T010H6_A7927Dta_ForPhn ;
   private boolean[] T010H6_n7927Dta_ForPhn ;
   private short[] T010H6_A7928Dta_ForUli ;
   private boolean[] T010H6_n7928Dta_ForUli ;
   private short[] T010H6_A12112Dta_Nh2o ;
   private boolean[] T010H6_n12112Dta_Nh2o ;
   private String[] T010H6_A396EmprCod ;
   private int[] T010H5_A361DisCod ;
   private String[] T010H5_A758ProCod ;
   private short[] T010H5_A368DisFasLin ;
   private short[] T010H5_A7919Dta_Ordl ;
   private String[] T010H5_A7920Dta_CPQ ;
   private boolean[] T010H5_n7920Dta_CPQ ;
   private String[] T010H5_A7922Dta_ForFab ;
   private boolean[] T010H5_n7922Dta_ForFab ;
   private short[] T010H5_A7923Dta_Fortie ;
   private boolean[] T010H5_n7923Dta_Fortie ;
   private short[] T010H5_A7924Dta_ForTmx ;
   private boolean[] T010H5_n7924Dta_ForTmx ;
   private java.math.BigDecimal[] T010H5_A7925Dta_ForRb ;
   private boolean[] T010H5_n7925Dta_ForRb ;
   private java.math.BigDecimal[] T010H5_A7926Dta_ForPhx ;
   private boolean[] T010H5_n7926Dta_ForPhx ;
   private java.math.BigDecimal[] T010H5_A7927Dta_ForPhn ;
   private boolean[] T010H5_n7927Dta_ForPhn ;
   private short[] T010H5_A7928Dta_ForUli ;
   private boolean[] T010H5_n7928Dta_ForUli ;
   private short[] T010H5_A12112Dta_Nh2o ;
   private boolean[] T010H5_n12112Dta_Nh2o ;
   private String[] T010H5_A396EmprCod ;
   private String[] T010H32_A396EmprCod ;
   private int[] T010H32_A361DisCod ;
   private String[] T010H32_A758ProCod ;
   private short[] T010H32_A368DisFasLin ;
   private short[] T010H32_A7919Dta_Ordl ;
   private int[] T010H33_A361DisCod ;
   private String[] T010H33_A758ProCod ;
   private short[] T010H33_A368DisFasLin ;
   private short[] T010H33_A7919Dta_Ordl ;
   private short[] T010H33_A7929Dta_ForLin ;
   private String[] T010H33_A7930Dta_Prdnum ;
   private boolean[] T010H33_n7930Dta_Prdnum ;
   private String[] T010H33_A488ForPrdDsc ;
   private boolean[] T010H33_n488ForPrdDsc ;
   private java.math.BigDecimal[] T010H33_A7932Dta_Forcan ;
   private boolean[] T010H33_n7932Dta_Forcan ;
   private String[] T010H33_A8479Dta_clave1 ;
   private boolean[] T010H33_n8479Dta_clave1 ;
   private String[] T010H33_A8480Dta_clave2 ;
   private boolean[] T010H33_n8480Dta_clave2 ;
   private String[] T010H33_A396EmprCod ;
   private byte[] T010H33_A490ForPrdUMe ;
   private boolean[] T010H33_n490ForPrdUMe ;
   private String[] T010H4_A488ForPrdDsc ;
   private boolean[] T010H4_n488ForPrdDsc ;
   private String[] T010H34_A488ForPrdDsc ;
   private boolean[] T010H34_n488ForPrdDsc ;
   private String[] T010H35_A396EmprCod ;
   private int[] T010H35_A361DisCod ;
   private String[] T010H35_A758ProCod ;
   private short[] T010H35_A368DisFasLin ;
   private short[] T010H35_A7919Dta_Ordl ;
   private short[] T010H35_A7929Dta_ForLin ;
   private int[] T010H3_A361DisCod ;
   private String[] T010H3_A758ProCod ;
   private short[] T010H3_A368DisFasLin ;
   private short[] T010H3_A7919Dta_Ordl ;
   private short[] T010H3_A7929Dta_ForLin ;
   private String[] T010H3_A7930Dta_Prdnum ;
   private boolean[] T010H3_n7930Dta_Prdnum ;
   private java.math.BigDecimal[] T010H3_A7932Dta_Forcan ;
   private boolean[] T010H3_n7932Dta_Forcan ;
   private String[] T010H3_A8479Dta_clave1 ;
   private boolean[] T010H3_n8479Dta_clave1 ;
   private String[] T010H3_A8480Dta_clave2 ;
   private boolean[] T010H3_n8480Dta_clave2 ;
   private String[] T010H3_A396EmprCod ;
   private byte[] T010H3_A490ForPrdUMe ;
   private boolean[] T010H3_n490ForPrdUMe ;
   private int[] T010H2_A361DisCod ;
   private String[] T010H2_A758ProCod ;
   private short[] T010H2_A368DisFasLin ;
   private short[] T010H2_A7919Dta_Ordl ;
   private short[] T010H2_A7929Dta_ForLin ;
   private String[] T010H2_A7930Dta_Prdnum ;
   private boolean[] T010H2_n7930Dta_Prdnum ;
   private java.math.BigDecimal[] T010H2_A7932Dta_Forcan ;
   private boolean[] T010H2_n7932Dta_Forcan ;
   private String[] T010H2_A8479Dta_clave1 ;
   private boolean[] T010H2_n8479Dta_clave1 ;
   private String[] T010H2_A8480Dta_clave2 ;
   private boolean[] T010H2_n8480Dta_clave2 ;
   private String[] T010H2_A396EmprCod ;
   private byte[] T010H2_A490ForPrdUMe ;
   private boolean[] T010H2_n490ForPrdUMe ;
   private String[] T010H39_A488ForPrdDsc ;
   private boolean[] T010H39_n488ForPrdDsc ;
   private String[] T010H40_A396EmprCod ;
   private int[] T010H40_A361DisCod ;
   private String[] T010H40_A758ProCod ;
   private short[] T010H40_A368DisFasLin ;
   private short[] T010H40_A7919Dta_Ordl ;
   private short[] T010H40_A7929Dta_ForLin ;
   private String[] T010H41_A407EmprNom ;
   private boolean[] T010H41_n407EmprNom ;
   private String[] T010H42_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdt004__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdt004__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdt004__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdt004__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdt004__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T010H2", "SELECT DisCod, ProCod, DisFasLin, Dta_Ordl, Dta_ForLin, Dta_Prdnum, Dta_Forcan, Dta_clave1, Dta_clave2, EmprCod, ForPrdUMe FROM TXPDT0041 WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND Dta_Ordl = ? AND Dta_ForLin = ?  FOR UPDATE OF Dta_Prdnum, Dta_Forcan, Dta_clave1, Dta_clave2, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010H3", "SELECT DisCod, ProCod, DisFasLin, Dta_Ordl, Dta_ForLin, Dta_Prdnum, Dta_Forcan, Dta_clave1, Dta_clave2, EmprCod, ForPrdUMe FROM TXPDT0041 WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND Dta_Ordl = ? AND Dta_ForLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010H4", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010H5", "SELECT DisCod, ProCod, DisFasLin, Dta_Ordl, Dta_CPQ, Dta_ForFab, Dta_Fortie, Dta_ForTmx, Dta_ForRb, Dta_ForPhx, Dta_ForPhn, Dta_ForUli, Dta_Nh2o, EmprCod FROM TXPDT004 WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND Dta_Ordl = ?  FOR UPDATE OF Dta_CPQ, Dta_ForFab, Dta_Fortie, Dta_ForTmx, Dta_ForRb, Dta_ForPhx, Dta_ForPhn, Dta_ForUli, Dta_Nh2o NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010H6", "SELECT DisCod, ProCod, DisFasLin, Dta_Ordl, Dta_CPQ, Dta_ForFab, Dta_Fortie, Dta_ForTmx, Dta_ForRb, Dta_ForPhx, Dta_ForPhn, Dta_ForUli, Dta_Nh2o, EmprCod FROM TXPDT004 WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND Dta_Ordl = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010H7", "SELECT FasCod, DisFasLin, Dta_UOrd, EmprCod, DisCod, ProCod, FasPreObl FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?  FOR UPDATE OF FasCod, Dta_UOrd, FasPreObl NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010H8", "SELECT FasCod, DisFasLin, Dta_UOrd, EmprCod, DisCod, ProCod, FasPreObl FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010H9", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010H10", "SELECT EmprCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010H11", "SELECT FasPreObl FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010H12", "SELECT /*+ FIRST_ROWS(1) */ TM1.FasCod, TM1.DisFasLin, T2.EmprNom, TM1.Dta_UOrd, TM1.FasPreObl, TM1.EmprCod, TM1.DisCod, TM1.ProCod FROM (TXPDISFAS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.DisCod = ? and TM1.ProCod = ? and TM1.DisFasLin = ? ORDER BY TM1.EmprCod, TM1.DisCod, TM1.ProCod, TM1.DisFasLin ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010H13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010H14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010H15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod DESC, DisCod DESC, ProCod DESC, DisFasLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T010H16", "INSERT INTO TXPDISFAS(FasPreObl, FasCod, DisFasLin, Dta_UOrd, EmprCod, DisCod, ProCod, FasApr, DisMaqPru, DisQuiUl, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, Disfastpp, DisFasUpL, DisfasRb, DisFasObs, DisPreSal, DisPrePie, DisVelPro, DisNumPas) VALUES(?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0)", GX_NOMASK, "TXPDISFAS")
         ,new UpdateCursor("T010H17", "UPDATE TXPDISFAS SET FasPreObl=?, FasCod=?, Dta_UOrd=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK, "TXPDISFAS")
         ,new UpdateCursor("T010H18", "DELETE FROM TXPDISFAS  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK, "TXPDISFAS")
         ,new ForEachCursor("T010H19", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl FROM TXPDT004 WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010H20", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, ArtAdiCod FROM TXPDisFPA WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010H21", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin FROM TXPDISQUI WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010H22", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, A_Discod, A_DProcod, A_DOrdlin FROM TXPAGRDIS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010H23", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T010H24", "UPDATE TXPDISFAS SET Dta_UOrd=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK, "TXPDISFAS")
         ,new ForEachCursor("T010H25", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010H26", "SELECT DisCod, ProCod, DisFasLin, Dta_Ordl, Dta_CPQ, Dta_ForFab, Dta_Fortie, Dta_ForTmx, Dta_ForRb, Dta_ForPhx, Dta_ForPhn, Dta_ForUli, Dta_Nh2o, EmprCod FROM TXPDT004 WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? and Dta_Ordl = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010H27", "SELECT EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl FROM TXPDT004 WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND Dta_Ordl = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T010H28", "INSERT INTO TXPDT004(DisCod, ProCod, DisFasLin, Dta_Ordl, Dta_CPQ, Dta_ForFab, Dta_Fortie, Dta_ForTmx, Dta_ForRb, Dta_ForPhx, Dta_ForPhn, Dta_ForUli, Dta_Nh2o, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDT004")
         ,new UpdateCursor("T010H29", "UPDATE TXPDT004 SET Dta_CPQ=?, Dta_ForFab=?, Dta_Fortie=?, Dta_ForTmx=?, Dta_ForRb=?, Dta_ForPhx=?, Dta_ForPhn=?, Dta_ForUli=?, Dta_Nh2o=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND Dta_Ordl = ?", GX_NOMASK, "TXPDT004")
         ,new UpdateCursor("T010H30", "DELETE FROM TXPDT004  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND Dta_Ordl = ?", GX_NOMASK, "TXPDT004")
         ,new UpdateCursor("T010H31", "UPDATE TXPDT004 SET Dta_ForUli=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND Dta_Ordl = ?", GX_NOMASK, "TXPDT004")
         ,new ForEachCursor("T010H32", "SELECT EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl FROM TXPDT004 WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010H33", "SELECT T1.DisCod, T1.ProCod, T1.DisFasLin, T1.Dta_Ordl, T1.Dta_ForLin, T1.Dta_Prdnum, T2.ForPrdDsc, T1.Dta_Forcan, T1.Dta_clave1, T1.Dta_clave2, T1.EmprCod, T1.ForPrdUMe FROM (TXPDT0041 T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? and T1.DisFasLin = ? and T1.Dta_Ordl = ? and T1.Dta_ForLin = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin, T1.Dta_Ordl, T1.Dta_ForLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010H34", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010H35", "SELECT EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl, Dta_ForLin FROM TXPDT0041 WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND Dta_Ordl = ? AND Dta_ForLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T010H36", "INSERT INTO TXPDT0041(DisCod, ProCod, DisFasLin, Dta_Ordl, Dta_ForLin, Dta_Prdnum, Dta_Forcan, Dta_clave1, Dta_clave2, EmprCod, ForPrdUMe) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDT0041")
         ,new UpdateCursor("T010H37", "UPDATE TXPDT0041 SET Dta_Prdnum=?, Dta_Forcan=?, Dta_clave1=?, Dta_clave2=?, ForPrdUMe=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND Dta_Ordl = ? AND Dta_ForLin = ?", GX_NOMASK, "TXPDT0041")
         ,new UpdateCursor("T010H38", "DELETE FROM TXPDT0041  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND Dta_Ordl = ? AND Dta_ForLin = ?", GX_NOMASK, "TXPDT0041")
         ,new ForEachCursor("T010H39", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010H40", "SELECT EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl, Dta_ForLin FROM TXPDT0041 WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? and Dta_Ordl = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl, Dta_ForLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010H41", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010H42", "SELECT EmprCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 3);
               ((byte[]) buf[14])[0] = rslt.getByte(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 3);
               ((byte[]) buf[14])[0] = rslt.getByte(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 9 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 8);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 24 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 31 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 3);
               ((byte[]) buf[16])[0] = rslt.getByte(12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 40 :
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 8);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[5]).shortValue());
               }
               stmt.setString(5, (String)parms[6], 3);
               stmt.setInt(6, ((Number) parms[7]).intValue());
               stmt.setString(7, (String)parms[8], 8);
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 8);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[4]).shortValue());
               }
               stmt.setString(4, (String)parms[5], 3);
               stmt.setInt(5, ((Number) parms[6]).intValue());
               stmt.setString(6, (String)parms[7], 8);
               stmt.setShort(7, ((Number) parms[8]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 22 :
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
               stmt.setString(4, (String)parms[4], 8);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 26 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 6);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[11]).shortValue());
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
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[21]).shortValue());
               }
               stmt.setString(14, (String)parms[22], 3);
               return;
            case 27 :
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
               stmt.setString(12, (String)parms[20], 8);
               stmt.setShort(13, ((Number) parms[21]).shortValue());
               stmt.setShort(14, ((Number) parms[22]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 29 :
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
               stmt.setString(4, (String)parms[4], 8);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setShort(6, ((Number) parms[6]).shortValue());
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 32 :
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
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 34 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 5);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[10], 16);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 30);
               }
               stmt.setString(10, (String)parms[13], 3);
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[15]).byteValue());
               }
               return;
            case 35 :
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
               stmt.setString(8, (String)parms[12], 8);
               stmt.setShort(9, ((Number) parms[13]).shortValue());
               stmt.setShort(10, ((Number) parms[14]).shortValue());
               stmt.setShort(11, ((Number) parms[15]).shortValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 37 :
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
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

