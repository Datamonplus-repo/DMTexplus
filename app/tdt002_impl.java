package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdt002_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"DTP_DPQ") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7898Dtp_CPQ = httpContext.GetPar( "Dtp_CPQ") ;
         n7898Dtp_CPQ = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asadtp_dpq10F1104( A396EmprCod, A7898Dtp_CPQ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel11"+"_"+"DTP_PRDNOM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7908Dtp_Prdnum = httpContext.GetPar( "Dtp_Prdnum") ;
         n7908Dtp_Prdnum = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx11asadtp_prdnom10F1105( A396EmprCod, A7908Dtp_Prdnum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_17") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_17( A396EmprCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_21") == 0 )
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
         gxload_21( A396EmprCod, A490ForPrdUMe) ;
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
            A758ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A774ProNumLin = (short)(GXutil.lval( httpContext.GetPar( "ProNumLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PROCESOS QUIMICOS F(NIT)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtFasCod_Internalname ;
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
      nRC_GXsfl_65 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_65"))) ;
      nGXsfl_65_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_65_idx"))) ;
      sGXsfl_65_idx = httpContext.GetPar( "sGXsfl_65_idx") ;
      A7911Dtp_UOrd = (short)(GXutil.lval( httpContext.GetPar( "Dtp_UOrd"))) ;
      n7911Dtp_UOrd = false ;
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
      nRC_GXsfl_127 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_127"))) ;
      nGXsfl_127_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_127_idx"))) ;
      sGXsfl_127_idx = httpContext.GetPar( "sGXsfl_127_idx") ;
      A7906Dtp_ForUli = (short)(GXutil.lval( httpContext.GetPar( "Dtp_ForUli"))) ;
      n7906Dtp_ForUli = false ;
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

   public tdt002_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdt002_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdt002_impl.class ));
   }

   public tdt002_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDT002.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDT002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDT002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Descripcion Proceso", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDT002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Descripcion II", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc2_Internalname, GXutil.rtrim( A4628ProDsc2), GXutil.rtrim( localUtil.format( A4628ProDsc2, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc2_Jsonclick, 0, "", "", "", "", "", 1, edtProDsc2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDT002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDT002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Numero Linea Proceso", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProNumLin_Internalname, GXutil.ltrim( localUtil.ntoc( A774ProNumLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProNumLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A774ProNumLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A774ProNumLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProNumLin_Jsonclick, 0, "", "", "", "", "", 1, edtProNumLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDT002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Codigo Fase", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDT002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Desc Fase DT", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDtp_FasDsc_Internalname, GXutil.rtrim( A7892Dtp_FasDsc), GXutil.rtrim( localUtil.format( A7892Dtp_FasDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDtp_FasDsc_Jsonclick, 0, "", "", "", "", "", 1, edtDtp_FasDsc_Enabled, 0, "text", "", 80, "chr", 1, "row", 90, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDT002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Ultimo Orden PQ", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDtp_UOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A7911Dtp_UOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDtp_UOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7911Dtp_UOrd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7911Dtp_UOrd), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDtp_UOrd_Jsonclick, 0, "", "", "", "", "", 1, edtDtp_UOrd_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDT002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol65( ) ;
      /* Save parent mode. */
      sMode1104 = Gx_mode ;
      nGXsfl_65_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1104 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1104 = (short)(1) ;
            scanStart10F1104( ) ;
            while ( RcdFound1104 != 0 )
            {
               init_level_properties1104( ) ;
               getByPrimaryKey10F1104( ) ;
               addRow10F1104( ) ;
               scanNext10F1104( ) ;
            }
            scanEnd10F1104( ) ;
            nBlankRcdCount1104 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B7911Dtp_UOrd = A7911Dtp_UOrd ;
         n7911Dtp_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
         standaloneNotModal10F1104( ) ;
         standaloneModal10F1104( ) ;
         sMode1104 = Gx_mode ;
         while ( nGXsfl_65_idx < nRC_GXsfl_65 )
         {
            bGXsfl_65_Refreshing = true ;
            readRow10F1104( ) ;
            edtDtp_Ordl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_ORDL_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtp_Ordl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_Ordl_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtDtp_CPQ_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_CPQ_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtp_CPQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_CPQ_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtDtp_DPQ_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_DPQ_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtp_DPQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_DPQ_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtDtp_ForFab_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_FORFAB_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtp_ForFab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_ForFab_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtDtp_Fortie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_FORTIE_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtp_Fortie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_Fortie_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtDtp_ForTmx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_FORTMX_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtp_ForTmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_ForTmx_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtDtp_ForRb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_FORRB_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtp_ForRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_ForRb_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtDtp_ForPhx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_FORPHX_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtp_ForPhx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_ForPhx_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtDtp_ForPhn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_FORPHN_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtp_ForPhn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_ForPhn_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtDtp_ForUli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_FORULI_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtp_ForUli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_ForUli_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtDtp_Nh2o_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_NH2O_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtp_Nh2o_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_Nh2o_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            if ( ( nRcdExists_1104 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal10F1104( ) ;
            }
            sendRow10F1104( ) ;
            bGXsfl_65_Refreshing = false ;
         }
         Gx_mode = sMode1104 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A7911Dtp_UOrd = B7911Dtp_UOrd ;
         n7911Dtp_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1104 = (short)(5) ;
         nRcdExists_1104 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart10F1104( ) ;
            while ( RcdFound1104 != 0 )
            {
               sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_651104( ) ;
               init_level_properties1104( ) ;
               standaloneNotModal10F1104( ) ;
               getByPrimaryKey10F1104( ) ;
               standaloneModal10F1104( ) ;
               addRow10F1104( ) ;
               scanNext10F1104( ) ;
            }
            scanEnd10F1104( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1104 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_651104( ) ;
      initAll10F1104( ) ;
      init_level_properties1104( ) ;
      B7911Dtp_UOrd = A7911Dtp_UOrd ;
      n7911Dtp_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
      nRcdExists_1104 = (short)(0) ;
      nIsMod_1104 = (short)(0) ;
      nRcdDeleted_1104 = (short)(0) ;
      nBlankRcdCount1104 = (short)(nBlankRcdUsr1104+nBlankRcdCount1104) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1104 > 0 )
      {
         standaloneNotModal10F1104( ) ;
         standaloneModal10F1104( ) ;
         addRow10F1104( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtDtp_Ordl_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1104 = (short)(nBlankRcdCount1104-1) ;
      }
      Gx_mode = sMode1104 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A7911Dtp_UOrd = B7911Dtp_UOrd ;
      n7911Dtp_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
      /* Restore parent mode. */
      Gx_mode = sMode1104 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 140,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 142,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDT002.htm");
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
      e1110F2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
            Z774ProNumLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z774ProNumLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7892Dtp_FasDsc = httpContext.cgiGet( "Z7892Dtp_FasDsc") ;
            Z7911Dtp_UOrd = (short)(localUtil.ctol( httpContext.cgiGet( "Z7911Dtp_UOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z457FasCod = httpContext.cgiGet( "Z457FasCod") ;
            O7911Dtp_UOrd = (short)(localUtil.ctol( httpContext.cgiGet( "O7911Dtp_UOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_65 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_65"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
            A4628ProDsc2 = httpContext.cgiGet( edtProDsc2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4628ProDsc2", A4628ProDsc2);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A774ProNumLin = (short)(localUtil.ctol( httpContext.cgiGet( edtProNumLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            A7892Dtp_FasDsc = httpContext.cgiGet( edtDtp_FasDsc_Internalname) ;
            n7892Dtp_FasDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7892Dtp_FasDsc", A7892Dtp_FasDsc);
            A7911Dtp_UOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtDtp_UOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7911Dtp_UOrd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
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
               A758ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A774ProNumLin = (short)(GXutil.lval( httpContext.GetPar( "ProNumLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
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
                        e1110F2 ();
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
            initAll10F88( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1105_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1105_Enabled), 5, 0), !bGXsfl_127_Refreshing);
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
      disableAttributes10F88( ) ;
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

   public void confirm_10F0( )
   {
      beforeValidate10F88( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls10F88( ) ;
         }
         else
         {
            checkExtendedTable10F88( ) ;
            if ( AnyError == 0 )
            {
               zm10F88( 16) ;
               zm10F88( 17) ;
               zm10F88( 18) ;
            }
            closeExtendedTableCursors10F88( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode88 = Gx_mode ;
         confirm_10F1104( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode88 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode88 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues10F0( ) ;
      }
   }

   public void confirm_10F1105( )
   {
      s7906Dtp_ForUli = O7906Dtp_ForUli ;
      n7906Dtp_ForUli = false ;
      nGXsfl_127_idx = 0 ;
      while ( nGXsfl_127_idx < nRC_GXsfl_127 )
      {
         readRow10F1105( ) ;
         if ( ( nRcdExists_1105 != 0 ) || ( nIsMod_1105 != 0 ) )
         {
            getKey10F1105( ) ;
            if ( ( nRcdExists_1105 == 0 ) && ( nRcdDeleted_1105 == 0 ) )
            {
               if ( RcdFound1105 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate10F1105( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable10F1105( ) ;
                     if ( AnyError == 0 )
                     {
                        zm10F1105( 21) ;
                     }
                     closeExtendedTableCursors10F1105( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O7906Dtp_ForUli = A7906Dtp_ForUli ;
                     n7906Dtp_ForUli = false ;
                  }
               }
               else
               {
                  GXCCtl = "DTP_ORDL_" + sGXsfl_65_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDtp_Ordl_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1105 != 0 )
               {
                  if ( nRcdDeleted_1105 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey10F1105( ) ;
                     load10F1105( ) ;
                     beforeValidate10F1105( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls10F1105( ) ;
                        O7906Dtp_ForUli = A7906Dtp_ForUli ;
                        n7906Dtp_ForUli = false ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1105 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate10F1105( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable10F1105( ) ;
                           if ( AnyError == 0 )
                           {
                              zm10F1105( 21) ;
                           }
                           closeExtendedTableCursors10F1105( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O7906Dtp_ForUli = A7906Dtp_ForUli ;
                           n7906Dtp_ForUli = false ;
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1105 == 0 )
                  {
                     GXCCtl = "DTP_ORDL_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDtp_Ordl_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1105_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1105, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtp_ForLin_Internalname, GXutil.ltrim( localUtil.ntoc( A7907Dtp_ForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtp_Prdnum_Internalname, GXutil.rtrim( A7908Dtp_Prdnum)) ;
         httpContext.changePostValue( edtDtp_PrdNom_Internalname, GXutil.rtrim( A7909Dtp_PrdNom)) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc)) ;
         httpContext.changePostValue( edtDtp_Forcan_Internalname, GXutil.ltrim( localUtil.ntoc( A7910Dtp_Forcan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtp_clave1_Internalname, GXutil.rtrim( A8475Dtp_clave1)) ;
         httpContext.changePostValue( edtDtp_clave2_Internalname, GXutil.rtrim( A8476Dtp_clave2)) ;
         httpContext.changePostValue( "ZT_"+"Z7907Dtp_ForLin_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z7907Dtp_ForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7908Dtp_Prdnum_"+sGXsfl_127_idx, GXutil.rtrim( Z7908Dtp_Prdnum)) ;
         httpContext.changePostValue( "ZT_"+"Z7910Dtp_Forcan_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z7910Dtp_Forcan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8475Dtp_clave1_"+sGXsfl_127_idx, GXutil.rtrim( Z8475Dtp_clave1)) ;
         httpContext.changePostValue( "ZT_"+"Z8476Dtp_clave2_"+sGXsfl_127_idx, GXutil.rtrim( Z8476Dtp_clave2)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1105_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1105, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1105_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1105, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1105_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1105, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1105 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1105_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1105_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_FORLIN_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_PRDNUM_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_Prdnum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_PRDNOM_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_PrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDDSC_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_FORCAN_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_Forcan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_CLAVE1_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_clave1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_CLAVE2_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_clave2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O7906Dtp_ForUli = s7906Dtp_ForUli ;
      n7906Dtp_ForUli = false ;
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_10F1104( )
   {
      s7911Dtp_UOrd = O7911Dtp_UOrd ;
      n7911Dtp_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRow10F1104( ) ;
         if ( ( nRcdExists_1104 != 0 ) || ( nIsMod_1104 != 0 ) )
         {
            getKey10F1104( ) ;
            if ( ( nRcdExists_1104 == 0 ) && ( nRcdDeleted_1104 == 0 ) )
            {
               if ( RcdFound1104 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate10F1104( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable10F1104( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors10F1104( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode1104 = Gx_mode ;
                        confirm_10F1105( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode1104 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode1104 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     O7911Dtp_UOrd = A7911Dtp_UOrd ;
                     n7911Dtp_UOrd = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "DTP_ORDL_" + sGXsfl_65_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDtp_Ordl_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1104 != 0 )
               {
                  if ( nRcdDeleted_1104 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey10F1104( ) ;
                     load10F1104( ) ;
                     beforeValidate10F1104( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls10F1104( ) ;
                        O7911Dtp_UOrd = A7911Dtp_UOrd ;
                        n7911Dtp_UOrd = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1104 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate10F1104( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable10F1104( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors10F1104( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode1104 = Gx_mode ;
                              confirm_10F1105( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode1104 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode1104 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                           O7911Dtp_UOrd = A7911Dtp_UOrd ;
                           n7911Dtp_UOrd = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1104 == 0 )
                  {
                     GXCCtl = "DTP_ORDL_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDtp_Ordl_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtDtp_Ordl_Internalname, GXutil.ltrim( localUtil.ntoc( A7897Dtp_Ordl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtp_CPQ_Internalname, GXutil.rtrim( A7898Dtp_CPQ)) ;
         httpContext.changePostValue( edtDtp_DPQ_Internalname, GXutil.rtrim( A7899Dtp_DPQ)) ;
         httpContext.changePostValue( edtDtp_ForFab_Internalname, GXutil.rtrim( A7900Dtp_ForFab)) ;
         httpContext.changePostValue( edtDtp_Fortie_Internalname, GXutil.ltrim( localUtil.ntoc( A7901Dtp_Fortie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtp_ForTmx_Internalname, GXutil.ltrim( localUtil.ntoc( A7902Dtp_ForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtp_ForRb_Internalname, GXutil.ltrim( localUtil.ntoc( A7903Dtp_ForRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtp_ForPhx_Internalname, GXutil.ltrim( localUtil.ntoc( A7904Dtp_ForPhx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtp_ForPhn_Internalname, GXutil.ltrim( localUtil.ntoc( A7905Dtp_ForPhn, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtp_ForUli_Internalname, GXutil.ltrim( localUtil.ntoc( A7906Dtp_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtp_Nh2o_Internalname, GXutil.ltrim( localUtil.ntoc( A11933Dtp_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7897Dtp_Ordl_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7897Dtp_Ordl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11933Dtp_Nh2o_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z11933Dtp_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7898Dtp_CPQ_"+sGXsfl_65_idx, GXutil.rtrim( Z7898Dtp_CPQ)) ;
         httpContext.changePostValue( "ZT_"+"Z7900Dtp_ForFab_"+sGXsfl_65_idx, GXutil.rtrim( Z7900Dtp_ForFab)) ;
         httpContext.changePostValue( "ZT_"+"Z7901Dtp_Fortie_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7901Dtp_Fortie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7902Dtp_ForTmx_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7902Dtp_ForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7903Dtp_ForRb_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7903Dtp_ForRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7904Dtp_ForPhx_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7904Dtp_ForPhx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7905Dtp_ForPhn_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7905Dtp_ForPhn, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7906Dtp_ForUli_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7906Dtp_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T7906Dtp_ForUli_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( O7906Dtp_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_127_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_127, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1104_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1104, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1104_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1104, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1104_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1104, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1104 != 0 )
         {
            httpContext.changePostValue( "DTP_ORDL_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_Ordl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_CPQ_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_CPQ_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_DPQ_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_DPQ_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_FORFAB_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForFab_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_FORTIE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_Fortie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_FORTMX_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForTmx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_FORRB_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForRb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_FORPHX_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForPhx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_FORPHN_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForPhn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_FORULI_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForUli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_NH2O_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_Nh2o_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O7911Dtp_UOrd = s7911Dtp_UOrd ;
      n7911Dtp_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption10F0( )
   {
   }

   public void e1110F2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tdt002_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tdt002_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tdt002_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdt002_impl.this.A396EmprCod = GXv_char2[0] ;
      tdt002_impl.this.AV11EmprNom = GXv_char3[0] ;
      tdt002_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm10F88( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7892Dtp_FasDsc = T010F8_A7892Dtp_FasDsc[0] ;
            Z7911Dtp_UOrd = T010F8_A7911Dtp_UOrd[0] ;
            Z457FasCod = T010F8_A457FasCod[0] ;
         }
         else
         {
            Z7892Dtp_FasDsc = A7892Dtp_FasDsc ;
            Z7911Dtp_UOrd = A7911Dtp_UOrd ;
            Z457FasCod = A457FasCod ;
         }
      }
      if ( GX_JID == -15 )
      {
         Z774ProNumLin = A774ProNumLin ;
         Z7892Dtp_FasDsc = A7892Dtp_FasDsc ;
         Z7911Dtp_UOrd = A7911Dtp_UOrd ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z758ProCod = A758ProCod ;
         Z407EmprNom = A407EmprNom ;
         Z759ProDsc = A759ProDsc ;
         Z4628ProDsc2 = A4628ProDsc2 ;
      }
   }

   public void standaloneNotModal( )
   {
      edtDtp_UOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_UOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_UOrd_Enabled), 5, 0), true);
      AV33Pgmname = "TDT002" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtDtp_UOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_UOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_UOrd_Enabled), 5, 0), true);
      /* Using cursor T010F9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T010F9_A407EmprNom[0] ;
      n407EmprNom = T010F9_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(7);
      /* Using cursor T010F11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T010F11_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      A4628ProDsc2 = T010F11_A4628ProDsc2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4628ProDsc2", A4628ProDsc2);
      pr_default.close(9);
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

   public void load10F88( )
   {
      /* Using cursor T010F12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound88 = (short)(1) ;
         A759ProDsc = T010F12_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A4628ProDsc2 = T010F12_A4628ProDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4628ProDsc2", A4628ProDsc2);
         A407EmprNom = T010F12_A407EmprNom[0] ;
         n407EmprNom = T010F12_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A7892Dtp_FasDsc = T010F12_A7892Dtp_FasDsc[0] ;
         n7892Dtp_FasDsc = T010F12_n7892Dtp_FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7892Dtp_FasDsc", A7892Dtp_FasDsc);
         A7911Dtp_UOrd = T010F12_A7911Dtp_UOrd[0] ;
         n7911Dtp_UOrd = T010F12_n7911Dtp_UOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
         A457FasCod = T010F12_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         zm10F88( -15) ;
      }
      pr_default.close(10);
      onLoadActions10F88( ) ;
   }

   public void onLoadActions10F88( )
   {
   }

   public void checkExtendedTable10F88( )
   {
      nIsDirty_88 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T010F10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(8);
   }

   public void closeExtendedTableCursors10F88( )
   {
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_17( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T010F13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void getKey10F88( )
   {
      /* Using cursor T010F14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound88 = (short)(1) ;
      }
      else
      {
         RcdFound88 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T010F8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
      if ( (pr_default.getStatus(6) != 101) && ( T010F8_A774ProNumLin[0] == A774ProNumLin ) && ( GXutil.strcmp(T010F8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T010F8_A758ProCod[0], A758ProCod) == 0 ) )
      {
         zm10F88( 15) ;
         RcdFound88 = (short)(1) ;
         A7892Dtp_FasDsc = T010F8_A7892Dtp_FasDsc[0] ;
         n7892Dtp_FasDsc = T010F8_n7892Dtp_FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7892Dtp_FasDsc", A7892Dtp_FasDsc);
         A7911Dtp_UOrd = T010F8_A7911Dtp_UOrd[0] ;
         n7911Dtp_UOrd = T010F8_n7911Dtp_UOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
         A457FasCod = T010F8_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         O7911Dtp_UOrd = A7911Dtp_UOrd ;
         n7911Dtp_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z758ProCod = A758ProCod ;
         Z774ProNumLin = A774ProNumLin ;
         sMode88 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load10F88( ) ;
         if ( AnyError == 1 )
         {
            RcdFound88 = (short)(0) ;
            initializeNonKey10F88( ) ;
         }
         Gx_mode = sMode88 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound88 = (short)(0) ;
         initializeNonKey10F88( ) ;
         sMode88 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode88 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey10F88( ) ;
      if ( RcdFound88 == 0 )
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
      RcdFound88 = (short)(0) ;
      /* Using cursor T010F15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( GXutil.strcmp(T010F15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T010F15_A758ProCod[0], A758ProCod) == 0 ) && ( T010F15_A774ProNumLin[0] == A774ProNumLin ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( GXutil.strcmp(T010F15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T010F15_A758ProCod[0], A758ProCod) == 0 ) && ( T010F15_A774ProNumLin[0] == A774ProNumLin ) )
         {
            RcdFound88 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound88 = (short)(0) ;
      /* Using cursor T010F16 */
      pr_default.execute(14, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( GXutil.strcmp(T010F16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T010F16_A758ProCod[0], A758ProCod) == 0 ) && ( T010F16_A774ProNumLin[0] == A774ProNumLin ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( GXutil.strcmp(T010F16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T010F16_A758ProCod[0], A758ProCod) == 0 ) && ( T010F16_A774ProNumLin[0] == A774ProNumLin ) )
         {
            RcdFound88 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey10F88( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A7911Dtp_UOrd = O7911Dtp_UOrd ;
         n7911Dtp_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert10F88( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound88 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A774ProNumLin != Z774ProNumLin ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A7911Dtp_UOrd = O7911Dtp_UOrd ;
               n7911Dtp_UOrd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A7911Dtp_UOrd = O7911Dtp_UOrd ;
               n7911Dtp_UOrd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
               update10F88( ) ;
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A774ProNumLin != Z774ProNumLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A7911Dtp_UOrd = O7911Dtp_UOrd ;
               n7911Dtp_UOrd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert10F88( ) ;
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
                  A7911Dtp_UOrd = O7911Dtp_UOrd ;
                  n7911Dtp_UOrd = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
                  GX_FocusControl = edtFasCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert10F88( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A774ProNumLin != Z774ProNumLin ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A7911Dtp_UOrd = O7911Dtp_UOrd ;
         n7911Dtp_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtFasCod_Internalname ;
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
      getKey10F88( ) ;
      if ( RcdFound88 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A774ProNumLin != Z774ProNumLin ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A774ProNumLin != Z774ProNumLin ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdt002");
      GX_FocusControl = edtFasCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_10F0( ) ;
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
      if ( RcdFound88 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtFasCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart10F88( ) ;
      if ( RcdFound88 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd10F88( ) ;
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
      if ( RcdFound88 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
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
      if ( RcdFound88 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
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
      scanStart10F88( ) ;
      if ( RcdFound88 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound88 != 0 )
         {
            scanNext10F88( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd10F88( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency10F88( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T010F7 */
         pr_default.execute(5, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPROLIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) || ( GXutil.strcmp(Z7892Dtp_FasDsc, T010F7_A7892Dtp_FasDsc[0]) != 0 ) || ( Z7911Dtp_UOrd != T010F7_A7911Dtp_UOrd[0] ) || ( GXutil.strcmp(Z457FasCod, T010F7_A457FasCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z7892Dtp_FasDsc, T010F7_A7892Dtp_FasDsc[0]) != 0 )
            {
               GXutil.writeLogln("tdt002:[seudo value changed for attri]"+"Dtp_FasDsc");
               GXutil.writeLogRaw("Old: ",Z7892Dtp_FasDsc);
               GXutil.writeLogRaw("Current: ",T010F7_A7892Dtp_FasDsc[0]);
            }
            if ( Z7911Dtp_UOrd != T010F7_A7911Dtp_UOrd[0] )
            {
               GXutil.writeLogln("tdt002:[seudo value changed for attri]"+"Dtp_UOrd");
               GXutil.writeLogRaw("Old: ",Z7911Dtp_UOrd);
               GXutil.writeLogRaw("Current: ",T010F7_A7911Dtp_UOrd[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T010F7_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("tdt002:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T010F7_A457FasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPROLIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert10F88( )
   {
      beforeValidate10F88( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10F88( ) ;
      }
      if ( AnyError == 0 )
      {
         zm10F88( 0) ;
         checkOptimisticConcurrency10F88( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10F88( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert10F88( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010F17 */
                  pr_default.execute(15, new Object[] {Short.valueOf(A774ProNumLin), Boolean.valueOf(n7892Dtp_FasDsc), A7892Dtp_FasDsc, Boolean.valueOf(n7911Dtp_UOrd), Short.valueOf(A7911Dtp_UOrd), A396EmprCod, A457FasCod, A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROLIN");
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
                        processLevel10F88( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption10F0( ) ;
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
            load10F88( ) ;
         }
         endLevel10F88( ) ;
      }
      closeExtendedTableCursors10F88( ) ;
   }

   public void update10F88( )
   {
      beforeValidate10F88( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10F88( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10F88( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10F88( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate10F88( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010F18 */
                  pr_default.execute(16, new Object[] {Boolean.valueOf(n7892Dtp_FasDsc), A7892Dtp_FasDsc, Boolean.valueOf(n7911Dtp_UOrd), Short.valueOf(A7911Dtp_UOrd), A457FasCod, A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROLIN");
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPROLIN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate10F88( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel10F88( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption10F0( ) ;
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
         endLevel10F88( ) ;
      }
      closeExtendedTableCursors10F88( ) ;
   }

   public void deferredUpdate10F88( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate10F88( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10F88( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls10F88( ) ;
         afterConfirm10F88( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete10F88( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T010F19 */
               pr_default.execute(17, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROLIN");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound88 == 0 )
                     {
                        initAll10F88( ) ;
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
                     resetCaption10F0( ) ;
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
      sMode88 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel10F88( ) ;
      Gx_mode = sMode88 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls10F88( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T010F20 */
         pr_default.execute(18, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DT002", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T010F21 */
         pr_default.execute(19, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
      }
   }

   public void processNestedLevel10F1104( )
   {
      s7911Dtp_UOrd = O7911Dtp_UOrd ;
      n7911Dtp_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRow10F1104( ) ;
         if ( ( nRcdExists_1104 != 0 ) || ( nIsMod_1104 != 0 ) )
         {
            standaloneNotModal10F1104( ) ;
            getKey10F1104( ) ;
            if ( ( nRcdExists_1104 == 0 ) && ( nRcdDeleted_1104 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert10F1104( ) ;
            }
            else
            {
               if ( RcdFound1104 != 0 )
               {
                  if ( ( nRcdDeleted_1104 != 0 ) && ( nRcdExists_1104 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete10F1104( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1104 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update10F1104( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1104 == 0 )
                  {
                     GXCCtl = "DTP_ORDL_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDtp_Ordl_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O7911Dtp_UOrd = A7911Dtp_UOrd ;
            n7911Dtp_UOrd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
         }
         httpContext.changePostValue( edtDtp_Ordl_Internalname, GXutil.ltrim( localUtil.ntoc( A7897Dtp_Ordl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtp_CPQ_Internalname, GXutil.rtrim( A7898Dtp_CPQ)) ;
         httpContext.changePostValue( edtDtp_DPQ_Internalname, GXutil.rtrim( A7899Dtp_DPQ)) ;
         httpContext.changePostValue( edtDtp_ForFab_Internalname, GXutil.rtrim( A7900Dtp_ForFab)) ;
         httpContext.changePostValue( edtDtp_Fortie_Internalname, GXutil.ltrim( localUtil.ntoc( A7901Dtp_Fortie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtp_ForTmx_Internalname, GXutil.ltrim( localUtil.ntoc( A7902Dtp_ForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtp_ForRb_Internalname, GXutil.ltrim( localUtil.ntoc( A7903Dtp_ForRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtp_ForPhx_Internalname, GXutil.ltrim( localUtil.ntoc( A7904Dtp_ForPhx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtp_ForPhn_Internalname, GXutil.ltrim( localUtil.ntoc( A7905Dtp_ForPhn, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtp_ForUli_Internalname, GXutil.ltrim( localUtil.ntoc( A7906Dtp_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtp_Nh2o_Internalname, GXutil.ltrim( localUtil.ntoc( A11933Dtp_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7897Dtp_Ordl_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7897Dtp_Ordl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11933Dtp_Nh2o_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z11933Dtp_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7898Dtp_CPQ_"+sGXsfl_65_idx, GXutil.rtrim( Z7898Dtp_CPQ)) ;
         httpContext.changePostValue( "ZT_"+"Z7900Dtp_ForFab_"+sGXsfl_65_idx, GXutil.rtrim( Z7900Dtp_ForFab)) ;
         httpContext.changePostValue( "ZT_"+"Z7901Dtp_Fortie_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7901Dtp_Fortie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7902Dtp_ForTmx_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7902Dtp_ForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7903Dtp_ForRb_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7903Dtp_ForRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7904Dtp_ForPhx_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7904Dtp_ForPhx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7905Dtp_ForPhn_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7905Dtp_ForPhn, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7906Dtp_ForUli_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7906Dtp_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T7906Dtp_ForUli_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( O7906Dtp_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_127_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_127, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1104_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1104, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1104_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1104, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1104_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1104, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1104 != 0 )
         {
            httpContext.changePostValue( "DTP_ORDL_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_Ordl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_CPQ_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_CPQ_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_DPQ_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_DPQ_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_FORFAB_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForFab_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_FORTIE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_Fortie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_FORTMX_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForTmx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_FORRB_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForRb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_FORPHX_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForPhx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_FORPHN_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForPhn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_FORULI_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForUli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_NH2O_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_Nh2o_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll10F1104( ) ;
      if ( AnyError != 0 )
      {
         O7911Dtp_UOrd = s7911Dtp_UOrd ;
         n7911Dtp_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
      }
      nRcdExists_1104 = (short)(0) ;
      nIsMod_1104 = (short)(0) ;
      nRcdDeleted_1104 = (short)(0) ;
   }

   public void processLevel10F88( )
   {
      /* Save parent mode. */
      sMode88 = Gx_mode ;
      processNestedLevel10F1104( ) ;
      if ( AnyError != 0 )
      {
         O7911Dtp_UOrd = s7911Dtp_UOrd ;
         n7911Dtp_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode88 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T010F22 */
      pr_default.execute(20, new Object[] {Boolean.valueOf(n7911Dtp_UOrd), Short.valueOf(A7911Dtp_UOrd), A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROLIN");
   }

   public void endLevel10F88( )
   {
      pr_default.close(5);
      if ( AnyError == 0 )
      {
         beforeComplete10F88( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdt002");
         if ( AnyError == 0 )
         {
            confirmValues10F0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdt002");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart10F88( )
   {
      /* Scan By routine */
      /* Using cursor T010F23 */
      pr_default.execute(21, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
      RcdFound88 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound88 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext10F88( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound88 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound88 = (short)(1) ;
      }
   }

   public void scanEnd10F88( )
   {
      pr_default.close(21);
   }

   public void afterConfirm10F88( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert10F88( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate10F88( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete10F88( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete10F88( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate10F88( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes10F88( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      edtProDsc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc2_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtProNumLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProNumLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProNumLin_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtDtp_FasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_FasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_FasDsc_Enabled), 5, 0), true);
      edtDtp_UOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_UOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_UOrd_Enabled), 5, 0), true);
   }

   public void zm10F1104( int GX_JID )
   {
      if ( ( GX_JID == 19 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11933Dtp_Nh2o = T010F6_A11933Dtp_Nh2o[0] ;
            Z7898Dtp_CPQ = T010F6_A7898Dtp_CPQ[0] ;
            Z7900Dtp_ForFab = T010F6_A7900Dtp_ForFab[0] ;
            Z7901Dtp_Fortie = T010F6_A7901Dtp_Fortie[0] ;
            Z7902Dtp_ForTmx = T010F6_A7902Dtp_ForTmx[0] ;
            Z7903Dtp_ForRb = T010F6_A7903Dtp_ForRb[0] ;
            Z7904Dtp_ForPhx = T010F6_A7904Dtp_ForPhx[0] ;
            Z7905Dtp_ForPhn = T010F6_A7905Dtp_ForPhn[0] ;
            Z7906Dtp_ForUli = T010F6_A7906Dtp_ForUli[0] ;
         }
         else
         {
            Z11933Dtp_Nh2o = A11933Dtp_Nh2o ;
            Z7898Dtp_CPQ = A7898Dtp_CPQ ;
            Z7900Dtp_ForFab = A7900Dtp_ForFab ;
            Z7901Dtp_Fortie = A7901Dtp_Fortie ;
            Z7902Dtp_ForTmx = A7902Dtp_ForTmx ;
            Z7903Dtp_ForRb = A7903Dtp_ForRb ;
            Z7904Dtp_ForPhx = A7904Dtp_ForPhx ;
            Z7905Dtp_ForPhn = A7905Dtp_ForPhn ;
            Z7906Dtp_ForUli = A7906Dtp_ForUli ;
         }
      }
      if ( GX_JID == -19 )
      {
         Z758ProCod = A758ProCod ;
         Z774ProNumLin = A774ProNumLin ;
         Z7897Dtp_Ordl = A7897Dtp_Ordl ;
         Z11933Dtp_Nh2o = A11933Dtp_Nh2o ;
         Z7898Dtp_CPQ = A7898Dtp_CPQ ;
         Z7900Dtp_ForFab = A7900Dtp_ForFab ;
         Z7901Dtp_Fortie = A7901Dtp_Fortie ;
         Z7902Dtp_ForTmx = A7902Dtp_ForTmx ;
         Z7903Dtp_ForRb = A7903Dtp_ForRb ;
         Z7904Dtp_ForPhx = A7904Dtp_ForPhx ;
         Z7905Dtp_ForPhn = A7905Dtp_ForPhn ;
         Z7906Dtp_ForUli = A7906Dtp_ForUli ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal10F1104( )
   {
      edtDtp_ForUli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_ForUli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_ForUli_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtDtp_UOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_UOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_UOrd_Enabled), 5, 0), true);
      edtDtp_UOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_UOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_UOrd_Enabled), 5, 0), true);
   }

   public void standaloneModal10F1104( )
   {
      if ( isIns( )  )
      {
         A7911Dtp_UOrd = (short)(O7911Dtp_UOrd+10) ;
         n7911Dtp_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A7897Dtp_Ordl = A7911Dtp_UOrd ;
      }
      if ( isIns( )  && (0==A11933Dtp_Nh2o) && ( Gx_BScreen == 0 ) )
      {
         A11933Dtp_Nh2o = (short)(1) ;
         n11933Dtp_Nh2o = false ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDtp_Ordl_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDtp_Ordl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_Ordl_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      else
      {
         edtDtp_Ordl_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDtp_Ordl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_Ordl_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
   }

   public void load10F1104( )
   {
      /* Using cursor T010F24 */
      pr_default.execute(22, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1104 = (short)(1) ;
         A11933Dtp_Nh2o = T010F24_A11933Dtp_Nh2o[0] ;
         n11933Dtp_Nh2o = T010F24_n11933Dtp_Nh2o[0] ;
         A7898Dtp_CPQ = T010F24_A7898Dtp_CPQ[0] ;
         n7898Dtp_CPQ = T010F24_n7898Dtp_CPQ[0] ;
         A7900Dtp_ForFab = T010F24_A7900Dtp_ForFab[0] ;
         n7900Dtp_ForFab = T010F24_n7900Dtp_ForFab[0] ;
         A7901Dtp_Fortie = T010F24_A7901Dtp_Fortie[0] ;
         n7901Dtp_Fortie = T010F24_n7901Dtp_Fortie[0] ;
         A7902Dtp_ForTmx = T010F24_A7902Dtp_ForTmx[0] ;
         n7902Dtp_ForTmx = T010F24_n7902Dtp_ForTmx[0] ;
         A7903Dtp_ForRb = T010F24_A7903Dtp_ForRb[0] ;
         n7903Dtp_ForRb = T010F24_n7903Dtp_ForRb[0] ;
         A7904Dtp_ForPhx = T010F24_A7904Dtp_ForPhx[0] ;
         n7904Dtp_ForPhx = T010F24_n7904Dtp_ForPhx[0] ;
         A7905Dtp_ForPhn = T010F24_A7905Dtp_ForPhn[0] ;
         n7905Dtp_ForPhn = T010F24_n7905Dtp_ForPhn[0] ;
         A7906Dtp_ForUli = T010F24_A7906Dtp_ForUli[0] ;
         n7906Dtp_ForUli = T010F24_n7906Dtp_ForUli[0] ;
         zm10F1104( -19) ;
      }
      pr_default.close(22);
      onLoadActions10F1104( ) ;
   }

   public void onLoadActions10F1104( )
   {
      GXt_char1 = A7899Dtp_DPQ ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7898Dtp_CPQ ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd3(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt002_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt002_impl.this.A7898Dtp_CPQ = GXv_char3[0] ;
      tdt002_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7899Dtp_DPQ = GXt_char1 ;
   }

   public void checkExtendedTable10F1104( )
   {
      nIsDirty_1104 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal10F1104( ) ;
      nIsDirty_1104 = (short)(1) ;
      GXt_char1 = A7899Dtp_DPQ ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7898Dtp_CPQ ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd3(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt002_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt002_impl.this.A7898Dtp_CPQ = GXv_char3[0] ;
      tdt002_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7899Dtp_DPQ = GXt_char1 ;
      if ( ( GXutil.strcmp(A7899Dtp_DPQ, httpContext.getMessage( "Error", "")) == 0 ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Inexistente", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors10F1104( )
   {
   }

   public void enableDisable10F1104( )
   {
   }

   public void getKey10F1104( )
   {
      /* Using cursor T010F25 */
      pr_default.execute(23, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1104 = (short)(1) ;
      }
      else
      {
         RcdFound1104 = (short)(0) ;
      }
      pr_default.close(23);
   }

   public void getByPrimaryKey10F1104( )
   {
      /* Using cursor T010F6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T010F6_A758ProCod[0], A758ProCod) == 0 ) && ( T010F6_A774ProNumLin[0] == A774ProNumLin ) && ( GXutil.strcmp(T010F6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm10F1104( 19) ;
         RcdFound1104 = (short)(1) ;
         initializeNonKey10F1104( ) ;
         A7897Dtp_Ordl = T010F6_A7897Dtp_Ordl[0] ;
         A11933Dtp_Nh2o = T010F6_A11933Dtp_Nh2o[0] ;
         n11933Dtp_Nh2o = T010F6_n11933Dtp_Nh2o[0] ;
         A7898Dtp_CPQ = T010F6_A7898Dtp_CPQ[0] ;
         n7898Dtp_CPQ = T010F6_n7898Dtp_CPQ[0] ;
         A7900Dtp_ForFab = T010F6_A7900Dtp_ForFab[0] ;
         n7900Dtp_ForFab = T010F6_n7900Dtp_ForFab[0] ;
         A7901Dtp_Fortie = T010F6_A7901Dtp_Fortie[0] ;
         n7901Dtp_Fortie = T010F6_n7901Dtp_Fortie[0] ;
         A7902Dtp_ForTmx = T010F6_A7902Dtp_ForTmx[0] ;
         n7902Dtp_ForTmx = T010F6_n7902Dtp_ForTmx[0] ;
         A7903Dtp_ForRb = T010F6_A7903Dtp_ForRb[0] ;
         n7903Dtp_ForRb = T010F6_n7903Dtp_ForRb[0] ;
         A7904Dtp_ForPhx = T010F6_A7904Dtp_ForPhx[0] ;
         n7904Dtp_ForPhx = T010F6_n7904Dtp_ForPhx[0] ;
         A7905Dtp_ForPhn = T010F6_A7905Dtp_ForPhn[0] ;
         n7905Dtp_ForPhn = T010F6_n7905Dtp_ForPhn[0] ;
         A7906Dtp_ForUli = T010F6_A7906Dtp_ForUli[0] ;
         n7906Dtp_ForUli = T010F6_n7906Dtp_ForUli[0] ;
         O7906Dtp_ForUli = A7906Dtp_ForUli ;
         n7906Dtp_ForUli = false ;
         Z396EmprCod = A396EmprCod ;
         Z758ProCod = A758ProCod ;
         Z774ProNumLin = A774ProNumLin ;
         Z7897Dtp_Ordl = A7897Dtp_Ordl ;
         sMode1104 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal10F1104( ) ;
         load10F1104( ) ;
         Gx_mode = sMode1104 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1104 = (short)(0) ;
         initializeNonKey10F1104( ) ;
         sMode1104 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal10F1104( ) ;
         Gx_mode = sMode1104 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes10F1104( ) ;
      }
      pr_default.close(4);
   }

   public void checkOptimisticConcurrency10F1104( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T010F5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDT002"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( Z11933Dtp_Nh2o != T010F5_A11933Dtp_Nh2o[0] ) || ( GXutil.strcmp(Z7898Dtp_CPQ, T010F5_A7898Dtp_CPQ[0]) != 0 ) || ( GXutil.strcmp(Z7900Dtp_ForFab, T010F5_A7900Dtp_ForFab[0]) != 0 ) || ( Z7901Dtp_Fortie != T010F5_A7901Dtp_Fortie[0] ) || ( Z7902Dtp_ForTmx != T010F5_A7902Dtp_ForTmx[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z7903Dtp_ForRb, T010F5_A7903Dtp_ForRb[0]) != 0 ) || ( DecimalUtil.compareTo(Z7904Dtp_ForPhx, T010F5_A7904Dtp_ForPhx[0]) != 0 ) || ( DecimalUtil.compareTo(Z7905Dtp_ForPhn, T010F5_A7905Dtp_ForPhn[0]) != 0 ) || ( Z7906Dtp_ForUli != T010F5_A7906Dtp_ForUli[0] ) )
         {
            if ( Z11933Dtp_Nh2o != T010F5_A11933Dtp_Nh2o[0] )
            {
               GXutil.writeLogln("tdt002:[seudo value changed for attri]"+"Dtp_Nh2o");
               GXutil.writeLogRaw("Old: ",Z11933Dtp_Nh2o);
               GXutil.writeLogRaw("Current: ",T010F5_A11933Dtp_Nh2o[0]);
            }
            if ( GXutil.strcmp(Z7898Dtp_CPQ, T010F5_A7898Dtp_CPQ[0]) != 0 )
            {
               GXutil.writeLogln("tdt002:[seudo value changed for attri]"+"Dtp_CPQ");
               GXutil.writeLogRaw("Old: ",Z7898Dtp_CPQ);
               GXutil.writeLogRaw("Current: ",T010F5_A7898Dtp_CPQ[0]);
            }
            if ( GXutil.strcmp(Z7900Dtp_ForFab, T010F5_A7900Dtp_ForFab[0]) != 0 )
            {
               GXutil.writeLogln("tdt002:[seudo value changed for attri]"+"Dtp_ForFab");
               GXutil.writeLogRaw("Old: ",Z7900Dtp_ForFab);
               GXutil.writeLogRaw("Current: ",T010F5_A7900Dtp_ForFab[0]);
            }
            if ( Z7901Dtp_Fortie != T010F5_A7901Dtp_Fortie[0] )
            {
               GXutil.writeLogln("tdt002:[seudo value changed for attri]"+"Dtp_Fortie");
               GXutil.writeLogRaw("Old: ",Z7901Dtp_Fortie);
               GXutil.writeLogRaw("Current: ",T010F5_A7901Dtp_Fortie[0]);
            }
            if ( Z7902Dtp_ForTmx != T010F5_A7902Dtp_ForTmx[0] )
            {
               GXutil.writeLogln("tdt002:[seudo value changed for attri]"+"Dtp_ForTmx");
               GXutil.writeLogRaw("Old: ",Z7902Dtp_ForTmx);
               GXutil.writeLogRaw("Current: ",T010F5_A7902Dtp_ForTmx[0]);
            }
            if ( DecimalUtil.compareTo(Z7903Dtp_ForRb, T010F5_A7903Dtp_ForRb[0]) != 0 )
            {
               GXutil.writeLogln("tdt002:[seudo value changed for attri]"+"Dtp_ForRb");
               GXutil.writeLogRaw("Old: ",Z7903Dtp_ForRb);
               GXutil.writeLogRaw("Current: ",T010F5_A7903Dtp_ForRb[0]);
            }
            if ( DecimalUtil.compareTo(Z7904Dtp_ForPhx, T010F5_A7904Dtp_ForPhx[0]) != 0 )
            {
               GXutil.writeLogln("tdt002:[seudo value changed for attri]"+"Dtp_ForPhx");
               GXutil.writeLogRaw("Old: ",Z7904Dtp_ForPhx);
               GXutil.writeLogRaw("Current: ",T010F5_A7904Dtp_ForPhx[0]);
            }
            if ( DecimalUtil.compareTo(Z7905Dtp_ForPhn, T010F5_A7905Dtp_ForPhn[0]) != 0 )
            {
               GXutil.writeLogln("tdt002:[seudo value changed for attri]"+"Dtp_ForPhn");
               GXutil.writeLogRaw("Old: ",Z7905Dtp_ForPhn);
               GXutil.writeLogRaw("Current: ",T010F5_A7905Dtp_ForPhn[0]);
            }
            if ( Z7906Dtp_ForUli != T010F5_A7906Dtp_ForUli[0] )
            {
               GXutil.writeLogln("tdt002:[seudo value changed for attri]"+"Dtp_ForUli");
               GXutil.writeLogRaw("Old: ",Z7906Dtp_ForUli);
               GXutil.writeLogRaw("Current: ",T010F5_A7906Dtp_ForUli[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDT002"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert10F1104( )
   {
      beforeValidate10F1104( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10F1104( ) ;
      }
      if ( AnyError == 0 )
      {
         zm10F1104( 0) ;
         checkOptimisticConcurrency10F1104( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10F1104( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert10F1104( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010F26 */
                  pr_default.execute(24, new Object[] {A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl), Boolean.valueOf(n11933Dtp_Nh2o), Short.valueOf(A11933Dtp_Nh2o), Boolean.valueOf(n7898Dtp_CPQ), A7898Dtp_CPQ, Boolean.valueOf(n7900Dtp_ForFab), A7900Dtp_ForFab, Boolean.valueOf(n7901Dtp_Fortie), Short.valueOf(A7901Dtp_Fortie), Boolean.valueOf(n7902Dtp_ForTmx), Short.valueOf(A7902Dtp_ForTmx), Boolean.valueOf(n7903Dtp_ForRb), A7903Dtp_ForRb, Boolean.valueOf(n7904Dtp_ForPhx), A7904Dtp_ForPhx, Boolean.valueOf(n7905Dtp_ForPhn), A7905Dtp_ForPhn, Boolean.valueOf(n7906Dtp_ForUli), Short.valueOf(A7906Dtp_ForUli), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT002");
                  if ( (pr_default.getStatus(24) == 1) )
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
                        processLevel10F1104( ) ;
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
            load10F1104( ) ;
         }
         endLevel10F1104( ) ;
      }
      closeExtendedTableCursors10F1104( ) ;
   }

   public void update10F1104( )
   {
      beforeValidate10F1104( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10F1104( ) ;
      }
      if ( ( nIsMod_1104 != 0 ) || ( nIsDirty_1104 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency10F1104( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm10F1104( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate10F1104( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T010F27 */
                     pr_default.execute(25, new Object[] {Boolean.valueOf(n11933Dtp_Nh2o), Short.valueOf(A11933Dtp_Nh2o), Boolean.valueOf(n7898Dtp_CPQ), A7898Dtp_CPQ, Boolean.valueOf(n7900Dtp_ForFab), A7900Dtp_ForFab, Boolean.valueOf(n7901Dtp_Fortie), Short.valueOf(A7901Dtp_Fortie), Boolean.valueOf(n7902Dtp_ForTmx), Short.valueOf(A7902Dtp_ForTmx), Boolean.valueOf(n7903Dtp_ForRb), A7903Dtp_ForRb, Boolean.valueOf(n7904Dtp_ForPhx), A7904Dtp_ForPhx, Boolean.valueOf(n7905Dtp_ForPhn), A7905Dtp_ForPhn, Boolean.valueOf(n7906Dtp_ForUli), Short.valueOf(A7906Dtp_ForUli), A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT002");
                     if ( (pr_default.getStatus(25) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDT002"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate10F1104( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel10F1104( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey10F1104( ) ;
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
            endLevel10F1104( ) ;
         }
      }
      closeExtendedTableCursors10F1104( ) ;
   }

   public void deferredUpdate10F1104( )
   {
   }

   public void delete10F1104( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate10F1104( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10F1104( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls10F1104( ) ;
         afterConfirm10F1104( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete10F1104( ) ;
            if ( AnyError == 0 )
            {
               A7906Dtp_ForUli = O7906Dtp_ForUli ;
               n7906Dtp_ForUli = false ;
               scanStart10F1105( ) ;
               while ( RcdFound1105 != 0 )
               {
                  getByPrimaryKey10F1105( ) ;
                  delete10F1105( ) ;
                  scanNext10F1105( ) ;
                  O7906Dtp_ForUli = A7906Dtp_ForUli ;
                  n7906Dtp_ForUli = false ;
               }
               scanEnd10F1105( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010F28 */
                  pr_default.execute(26, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT002");
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
      sMode1104 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel10F1104( ) ;
      Gx_mode = sMode1104 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls10F1104( )
   {
      standaloneModal10F1104( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A7899Dtp_DPQ ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A7898Dtp_CPQ ;
         GXv_char2[0] = GXt_char1 ;
         new app.ppreqd3(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         tdt002_impl.this.A396EmprCod = GXv_char4[0] ;
         tdt002_impl.this.A7898Dtp_CPQ = GXv_char3[0] ;
         tdt002_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7899Dtp_DPQ = GXt_char1 ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T010F29 */
         pr_default.execute(27, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARAMETROS PROCESOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
      }
   }

   public void processNestedLevel10F1105( )
   {
      s7906Dtp_ForUli = O7906Dtp_ForUli ;
      n7906Dtp_ForUli = false ;
      nGXsfl_127_idx = 0 ;
      while ( nGXsfl_127_idx < nRC_GXsfl_127 )
      {
         readRow10F1105( ) ;
         if ( ( nRcdExists_1105 != 0 ) || ( nIsMod_1105 != 0 ) )
         {
            standaloneNotModal10F1105( ) ;
            getKey10F1105( ) ;
            if ( ( nRcdExists_1105 == 0 ) && ( nRcdDeleted_1105 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert10F1105( ) ;
            }
            else
            {
               if ( RcdFound1105 != 0 )
               {
                  if ( ( nRcdDeleted_1105 != 0 ) && ( nRcdExists_1105 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete10F1105( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1105 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update10F1105( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1105 == 0 )
                  {
                     GXCCtl = "DTP_ORDL_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDtp_Ordl_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O7906Dtp_ForUli = A7906Dtp_ForUli ;
            n7906Dtp_ForUli = false ;
         }
         httpContext.changePostValue( edtavnRcdDeleted_1105_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1105, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtp_ForLin_Internalname, GXutil.ltrim( localUtil.ntoc( A7907Dtp_ForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtp_Prdnum_Internalname, GXutil.rtrim( A7908Dtp_Prdnum)) ;
         httpContext.changePostValue( edtDtp_PrdNom_Internalname, GXutil.rtrim( A7909Dtp_PrdNom)) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc)) ;
         httpContext.changePostValue( edtDtp_Forcan_Internalname, GXutil.ltrim( localUtil.ntoc( A7910Dtp_Forcan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDtp_clave1_Internalname, GXutil.rtrim( A8475Dtp_clave1)) ;
         httpContext.changePostValue( edtDtp_clave2_Internalname, GXutil.rtrim( A8476Dtp_clave2)) ;
         httpContext.changePostValue( "ZT_"+"Z7907Dtp_ForLin_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z7907Dtp_ForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7908Dtp_Prdnum_"+sGXsfl_127_idx, GXutil.rtrim( Z7908Dtp_Prdnum)) ;
         httpContext.changePostValue( "ZT_"+"Z7910Dtp_Forcan_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z7910Dtp_Forcan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8475Dtp_clave1_"+sGXsfl_127_idx, GXutil.rtrim( Z8475Dtp_clave1)) ;
         httpContext.changePostValue( "ZT_"+"Z8476Dtp_clave2_"+sGXsfl_127_idx, GXutil.rtrim( Z8476Dtp_clave2)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1105_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1105, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1105_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1105, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1105_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1105, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1105 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1105_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1105_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_FORLIN_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_PRDNUM_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_Prdnum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_PRDNOM_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_PrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDDSC_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_FORCAN_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_Forcan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_CLAVE1_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_clave1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DTP_CLAVE2_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_clave2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll10F1105( ) ;
      if ( AnyError != 0 )
      {
         O7906Dtp_ForUli = s7906Dtp_ForUli ;
         n7906Dtp_ForUli = false ;
      }
      nRcdExists_1105 = (short)(0) ;
      nIsMod_1105 = (short)(0) ;
      nRcdDeleted_1105 = (short)(0) ;
   }

   public void processLevel10F1104( )
   {
      /* Save parent mode. */
      sMode1104 = Gx_mode ;
      processNestedLevel10F1105( ) ;
      if ( AnyError != 0 )
      {
         O7906Dtp_ForUli = s7906Dtp_ForUli ;
         n7906Dtp_ForUli = false ;
      }
      /* Restore parent mode. */
      Gx_mode = sMode1104 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T010F30 */
      pr_default.execute(28, new Object[] {Boolean.valueOf(n7906Dtp_ForUli), Short.valueOf(A7906Dtp_ForUli), A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT002");
   }

   public void endLevel10F1104( )
   {
      pr_default.close(3);
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart10F1104( )
   {
      /* Scan By routine */
      /* Using cursor T010F31 */
      pr_default.execute(29, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
      RcdFound1104 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound1104 = (short)(1) ;
         A7897Dtp_Ordl = T010F31_A7897Dtp_Ordl[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext10F1104( )
   {
      /* Scan next routine */
      pr_default.readNext(29);
      RcdFound1104 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound1104 = (short)(1) ;
         A7897Dtp_Ordl = T010F31_A7897Dtp_Ordl[0] ;
      }
   }

   public void scanEnd10F1104( )
   {
      pr_default.close(29);
   }

   public void afterConfirm10F1104( )
   {
      /* After Confirm Rules */
      if ( ( A11933Dtp_Nh2o == 0 ) && ( GXutil.strcmp(A7900Dtp_ForFab, "*") != 0 ) && true /* After */ )
      {
         GXCCtl = "DTP_FORFAB_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion.Numero de Baños igual a 0", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDtp_ForFab_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert10F1104( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate10F1104( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete10F1104( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete10F1104( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate10F1104( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes10F1104( )
   {
      edtDtp_Ordl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_Ordl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_Ordl_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtDtp_CPQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_CPQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_CPQ_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtDtp_DPQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_DPQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_DPQ_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtDtp_ForFab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_ForFab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_ForFab_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtDtp_Fortie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_Fortie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_Fortie_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtDtp_ForTmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_ForTmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_ForTmx_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtDtp_ForRb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_ForRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_ForRb_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtDtp_ForPhx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_ForPhx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_ForPhx_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtDtp_ForPhn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_ForPhn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_ForPhn_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtDtp_ForUli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_ForUli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_ForUli_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtDtp_Nh2o_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_Nh2o_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_Nh2o_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void zm10F1105( int GX_JID )
   {
      if ( ( GX_JID == 20 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7908Dtp_Prdnum = T010F3_A7908Dtp_Prdnum[0] ;
            Z7910Dtp_Forcan = T010F3_A7910Dtp_Forcan[0] ;
            Z8475Dtp_clave1 = T010F3_A8475Dtp_clave1[0] ;
            Z8476Dtp_clave2 = T010F3_A8476Dtp_clave2[0] ;
            Z490ForPrdUMe = T010F3_A490ForPrdUMe[0] ;
         }
         else
         {
            Z7908Dtp_Prdnum = A7908Dtp_Prdnum ;
            Z7910Dtp_Forcan = A7910Dtp_Forcan ;
            Z8475Dtp_clave1 = A8475Dtp_clave1 ;
            Z8476Dtp_clave2 = A8476Dtp_clave2 ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( GX_JID == -20 )
      {
         Z758ProCod = A758ProCod ;
         Z774ProNumLin = A774ProNumLin ;
         Z7897Dtp_Ordl = A7897Dtp_Ordl ;
         Z7907Dtp_ForLin = A7907Dtp_ForLin ;
         Z7908Dtp_Prdnum = A7908Dtp_Prdnum ;
         Z7910Dtp_Forcan = A7910Dtp_Forcan ;
         Z8475Dtp_clave1 = A8475Dtp_clave1 ;
         Z8476Dtp_clave2 = A8476Dtp_clave2 ;
         Z396EmprCod = A396EmprCod ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z488ForPrdDsc = A488ForPrdDsc ;
      }
   }

   public void standaloneNotModal10F1105( )
   {
      edtDtp_ForUli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_ForUli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_ForUli_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void standaloneModal10F1105( )
   {
      if ( isIns( )  )
      {
         A7906Dtp_ForUli = (short)(O7906Dtp_ForUli+1) ;
         n7906Dtp_ForUli = false ;
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A7907Dtp_ForLin = A7906Dtp_ForUli ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDtp_ForLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDtp_ForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_ForLin_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      }
      else
      {
         edtDtp_ForLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDtp_ForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_ForLin_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      }
   }

   public void load10F1105( )
   {
      /* Using cursor T010F32 */
      pr_default.execute(30, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl), Short.valueOf(A7907Dtp_ForLin)});
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1105 = (short)(1) ;
         A7908Dtp_Prdnum = T010F32_A7908Dtp_Prdnum[0] ;
         n7908Dtp_Prdnum = T010F32_n7908Dtp_Prdnum[0] ;
         A488ForPrdDsc = T010F32_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T010F32_n488ForPrdDsc[0] ;
         A7910Dtp_Forcan = T010F32_A7910Dtp_Forcan[0] ;
         n7910Dtp_Forcan = T010F32_n7910Dtp_Forcan[0] ;
         A8475Dtp_clave1 = T010F32_A8475Dtp_clave1[0] ;
         n8475Dtp_clave1 = T010F32_n8475Dtp_clave1[0] ;
         A8476Dtp_clave2 = T010F32_A8476Dtp_clave2[0] ;
         n8476Dtp_clave2 = T010F32_n8476Dtp_clave2[0] ;
         A490ForPrdUMe = T010F32_A490ForPrdUMe[0] ;
         n490ForPrdUMe = T010F32_n490ForPrdUMe[0] ;
         zm10F1105( -20) ;
      }
      pr_default.close(30);
      onLoadActions10F1105( ) ;
   }

   public void onLoadActions10F1105( )
   {
      GXt_char1 = A7909Dtp_PrdNom ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7908Dtp_Prdnum ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt002_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt002_impl.this.A7908Dtp_Prdnum = GXv_char3[0] ;
      tdt002_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7909Dtp_PrdNom = GXt_char1 ;
   }

   public void checkExtendedTable10F1105( )
   {
      nIsDirty_1105 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal10F1105( ) ;
      /* Using cursor T010F4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T010F4_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T010F4_n488ForPrdDsc[0] ;
      pr_default.close(2);
      nIsDirty_1105 = (short)(1) ;
      GXt_char1 = A7909Dtp_PrdNom ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7908Dtp_Prdnum ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt002_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt002_impl.this.A7908Dtp_Prdnum = GXv_char3[0] ;
      tdt002_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7909Dtp_PrdNom = GXt_char1 ;
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors10F1105( )
   {
      pr_default.close(2);
   }

   public void enableDisable10F1105( )
   {
   }

   public void gxload_21( String A396EmprCod ,
                          byte A490ForPrdUMe )
   {
      /* Using cursor T010F33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T010F33_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T010F33_n488ForPrdDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A488ForPrdDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(31) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(31);
   }

   public void getKey10F1105( )
   {
      /* Using cursor T010F34 */
      pr_default.execute(32, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl), Short.valueOf(A7907Dtp_ForLin)});
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound1105 = (short)(1) ;
      }
      else
      {
         RcdFound1105 = (short)(0) ;
      }
      pr_default.close(32);
   }

   public void getByPrimaryKey10F1105( )
   {
      /* Using cursor T010F3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl), Short.valueOf(A7907Dtp_ForLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T010F3_A758ProCod[0], A758ProCod) == 0 ) && ( T010F3_A774ProNumLin[0] == A774ProNumLin ) && ( GXutil.strcmp(T010F3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm10F1105( 20) ;
         RcdFound1105 = (short)(1) ;
         initializeNonKey10F1105( ) ;
         A7907Dtp_ForLin = T010F3_A7907Dtp_ForLin[0] ;
         A7908Dtp_Prdnum = T010F3_A7908Dtp_Prdnum[0] ;
         n7908Dtp_Prdnum = T010F3_n7908Dtp_Prdnum[0] ;
         A7910Dtp_Forcan = T010F3_A7910Dtp_Forcan[0] ;
         n7910Dtp_Forcan = T010F3_n7910Dtp_Forcan[0] ;
         A8475Dtp_clave1 = T010F3_A8475Dtp_clave1[0] ;
         n8475Dtp_clave1 = T010F3_n8475Dtp_clave1[0] ;
         A8476Dtp_clave2 = T010F3_A8476Dtp_clave2[0] ;
         n8476Dtp_clave2 = T010F3_n8476Dtp_clave2[0] ;
         A490ForPrdUMe = T010F3_A490ForPrdUMe[0] ;
         n490ForPrdUMe = T010F3_n490ForPrdUMe[0] ;
         Z396EmprCod = A396EmprCod ;
         Z758ProCod = A758ProCod ;
         Z774ProNumLin = A774ProNumLin ;
         Z7897Dtp_Ordl = A7897Dtp_Ordl ;
         Z7907Dtp_ForLin = A7907Dtp_ForLin ;
         sMode1105 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal10F1105( ) ;
         load10F1105( ) ;
         Gx_mode = sMode1105 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1105 = (short)(0) ;
         initializeNonKey10F1105( ) ;
         sMode1105 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal10F1105( ) ;
         Gx_mode = sMode1105 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes10F1105( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency10F1105( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T010F2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl), Short.valueOf(A7907Dtp_ForLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDT0021"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z7908Dtp_Prdnum, T010F2_A7908Dtp_Prdnum[0]) != 0 ) || ( DecimalUtil.compareTo(Z7910Dtp_Forcan, T010F2_A7910Dtp_Forcan[0]) != 0 ) || ( GXutil.strcmp(Z8475Dtp_clave1, T010F2_A8475Dtp_clave1[0]) != 0 ) || ( GXutil.strcmp(Z8476Dtp_clave2, T010F2_A8476Dtp_clave2[0]) != 0 ) || ( Z490ForPrdUMe != T010F2_A490ForPrdUMe[0] ) )
         {
            if ( GXutil.strcmp(Z7908Dtp_Prdnum, T010F2_A7908Dtp_Prdnum[0]) != 0 )
            {
               GXutil.writeLogln("tdt002:[seudo value changed for attri]"+"Dtp_Prdnum");
               GXutil.writeLogRaw("Old: ",Z7908Dtp_Prdnum);
               GXutil.writeLogRaw("Current: ",T010F2_A7908Dtp_Prdnum[0]);
            }
            if ( DecimalUtil.compareTo(Z7910Dtp_Forcan, T010F2_A7910Dtp_Forcan[0]) != 0 )
            {
               GXutil.writeLogln("tdt002:[seudo value changed for attri]"+"Dtp_Forcan");
               GXutil.writeLogRaw("Old: ",Z7910Dtp_Forcan);
               GXutil.writeLogRaw("Current: ",T010F2_A7910Dtp_Forcan[0]);
            }
            if ( GXutil.strcmp(Z8475Dtp_clave1, T010F2_A8475Dtp_clave1[0]) != 0 )
            {
               GXutil.writeLogln("tdt002:[seudo value changed for attri]"+"Dtp_clave1");
               GXutil.writeLogRaw("Old: ",Z8475Dtp_clave1);
               GXutil.writeLogRaw("Current: ",T010F2_A8475Dtp_clave1[0]);
            }
            if ( GXutil.strcmp(Z8476Dtp_clave2, T010F2_A8476Dtp_clave2[0]) != 0 )
            {
               GXutil.writeLogln("tdt002:[seudo value changed for attri]"+"Dtp_clave2");
               GXutil.writeLogRaw("Old: ",Z8476Dtp_clave2);
               GXutil.writeLogRaw("Current: ",T010F2_A8476Dtp_clave2[0]);
            }
            if ( Z490ForPrdUMe != T010F2_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("tdt002:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T010F2_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDT0021"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert10F1105( )
   {
      beforeValidate10F1105( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10F1105( ) ;
      }
      if ( AnyError == 0 )
      {
         zm10F1105( 0) ;
         checkOptimisticConcurrency10F1105( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10F1105( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert10F1105( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010F35 */
                  pr_default.execute(33, new Object[] {A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl), Short.valueOf(A7907Dtp_ForLin), Boolean.valueOf(n7908Dtp_Prdnum), A7908Dtp_Prdnum, Boolean.valueOf(n7910Dtp_Forcan), A7910Dtp_Forcan, Boolean.valueOf(n8475Dtp_clave1), A8475Dtp_clave1, Boolean.valueOf(n8476Dtp_clave2), A8476Dtp_clave2, A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0021");
                  if ( (pr_default.getStatus(33) == 1) )
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
            load10F1105( ) ;
         }
         endLevel10F1105( ) ;
      }
      closeExtendedTableCursors10F1105( ) ;
   }

   public void update10F1105( )
   {
      beforeValidate10F1105( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10F1105( ) ;
      }
      if ( ( nIsMod_1105 != 0 ) || ( nIsDirty_1105 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency10F1105( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm10F1105( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate10F1105( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T010F36 */
                     pr_default.execute(34, new Object[] {Boolean.valueOf(n7908Dtp_Prdnum), A7908Dtp_Prdnum, Boolean.valueOf(n7910Dtp_Forcan), A7910Dtp_Forcan, Boolean.valueOf(n8475Dtp_clave1), A8475Dtp_clave1, Boolean.valueOf(n8476Dtp_clave2), A8476Dtp_clave2, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl), Short.valueOf(A7907Dtp_ForLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0021");
                     if ( (pr_default.getStatus(34) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDT0021"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate10F1105( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey10F1105( ) ;
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
            endLevel10F1105( ) ;
         }
      }
      closeExtendedTableCursors10F1105( ) ;
   }

   public void deferredUpdate10F1105( )
   {
   }

   public void delete10F1105( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate10F1105( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10F1105( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls10F1105( ) ;
         afterConfirm10F1105( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete10F1105( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T010F37 */
               pr_default.execute(35, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl), Short.valueOf(A7907Dtp_ForLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0021");
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
      sMode1105 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel10F1105( ) ;
      Gx_mode = sMode1105 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls10F1105( )
   {
      standaloneModal10F1105( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A7909Dtp_PrdNom ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A7908Dtp_Prdnum ;
         GXv_char2[0] = GXt_char1 ;
         new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         tdt002_impl.this.A396EmprCod = GXv_char4[0] ;
         tdt002_impl.this.A7908Dtp_Prdnum = GXv_char3[0] ;
         tdt002_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7909Dtp_PrdNom = GXt_char1 ;
         /* Using cursor T010F38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T010F38_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T010F38_n488ForPrdDsc[0] ;
         pr_default.close(36);
      }
   }

   public void endLevel10F1105( )
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

   public void scanStart10F1105( )
   {
      /* Scan By routine */
      /* Using cursor T010F39 */
      pr_default.execute(37, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl)});
      RcdFound1105 = (short)(0) ;
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound1105 = (short)(1) ;
         A7907Dtp_ForLin = T010F39_A7907Dtp_ForLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext10F1105( )
   {
      /* Scan next routine */
      pr_default.readNext(37);
      RcdFound1105 = (short)(0) ;
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound1105 = (short)(1) ;
         A7907Dtp_ForLin = T010F39_A7907Dtp_ForLin[0] ;
      }
   }

   public void scanEnd10F1105( )
   {
      pr_default.close(37);
   }

   public void afterConfirm10F1105( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert10F1105( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate10F1105( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete10F1105( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete10F1105( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate10F1105( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes10F1105( )
   {
      edtDtp_ForLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_ForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_ForLin_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtDtp_Prdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_Prdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_Prdnum_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtDtp_PrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_PrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_PrdNom_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtForPrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtDtp_Forcan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_Forcan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_Forcan_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtDtp_clave1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_clave1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_clave1_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtDtp_clave2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_clave2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_clave2_Enabled), 5, 0), !bGXsfl_127_Refreshing);
   }

   public void send_integrity_lvl_hashes10F1105( )
   {
   }

   public void send_integrity_lvl_hashes10F1104( )
   {
   }

   public void send_integrity_lvl_hashes10F88( )
   {
   }

   public void subsflControlProps_651104( )
   {
      lblTextblock10_Internalname = "TEXTBLOCK10_"+sGXsfl_65_idx ;
      edtDtp_Ordl_Internalname = "DTP_ORDL_"+sGXsfl_65_idx ;
      lblTextblock11_Internalname = "TEXTBLOCK11_"+sGXsfl_65_idx ;
      edtDtp_CPQ_Internalname = "DTP_CPQ_"+sGXsfl_65_idx ;
      lblTextblock12_Internalname = "TEXTBLOCK12_"+sGXsfl_65_idx ;
      edtDtp_DPQ_Internalname = "DTP_DPQ_"+sGXsfl_65_idx ;
      lblTextblock13_Internalname = "TEXTBLOCK13_"+sGXsfl_65_idx ;
      edtDtp_ForFab_Internalname = "DTP_FORFAB_"+sGXsfl_65_idx ;
      lblTextblock14_Internalname = "TEXTBLOCK14_"+sGXsfl_65_idx ;
      edtDtp_Fortie_Internalname = "DTP_FORTIE_"+sGXsfl_65_idx ;
      lblTextblock15_Internalname = "TEXTBLOCK15_"+sGXsfl_65_idx ;
      edtDtp_ForTmx_Internalname = "DTP_FORTMX_"+sGXsfl_65_idx ;
      lblTextblock16_Internalname = "TEXTBLOCK16_"+sGXsfl_65_idx ;
      edtDtp_ForRb_Internalname = "DTP_FORRB_"+sGXsfl_65_idx ;
      lblTextblock17_Internalname = "TEXTBLOCK17_"+sGXsfl_65_idx ;
      edtDtp_ForPhx_Internalname = "DTP_FORPHX_"+sGXsfl_65_idx ;
      lblTextblock18_Internalname = "TEXTBLOCK18_"+sGXsfl_65_idx ;
      edtDtp_ForPhn_Internalname = "DTP_FORPHN_"+sGXsfl_65_idx ;
      lblTextblock19_Internalname = "TEXTBLOCK19_"+sGXsfl_65_idx ;
      edtDtp_ForUli_Internalname = "DTP_FORULI_"+sGXsfl_65_idx ;
      lblTextblock20_Internalname = "TEXTBLOCK20_"+sGXsfl_65_idx ;
      edtDtp_Nh2o_Internalname = "DTP_NH2O_"+sGXsfl_65_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_65_idx ;
   }

   public void subsflControlProps_fel_651104( )
   {
      lblTextblock10_Internalname = "TEXTBLOCK10_"+sGXsfl_65_fel_idx ;
      edtDtp_Ordl_Internalname = "DTP_ORDL_"+sGXsfl_65_fel_idx ;
      lblTextblock11_Internalname = "TEXTBLOCK11_"+sGXsfl_65_fel_idx ;
      edtDtp_CPQ_Internalname = "DTP_CPQ_"+sGXsfl_65_fel_idx ;
      lblTextblock12_Internalname = "TEXTBLOCK12_"+sGXsfl_65_fel_idx ;
      edtDtp_DPQ_Internalname = "DTP_DPQ_"+sGXsfl_65_fel_idx ;
      lblTextblock13_Internalname = "TEXTBLOCK13_"+sGXsfl_65_fel_idx ;
      edtDtp_ForFab_Internalname = "DTP_FORFAB_"+sGXsfl_65_fel_idx ;
      lblTextblock14_Internalname = "TEXTBLOCK14_"+sGXsfl_65_fel_idx ;
      edtDtp_Fortie_Internalname = "DTP_FORTIE_"+sGXsfl_65_fel_idx ;
      lblTextblock15_Internalname = "TEXTBLOCK15_"+sGXsfl_65_fel_idx ;
      edtDtp_ForTmx_Internalname = "DTP_FORTMX_"+sGXsfl_65_fel_idx ;
      lblTextblock16_Internalname = "TEXTBLOCK16_"+sGXsfl_65_fel_idx ;
      edtDtp_ForRb_Internalname = "DTP_FORRB_"+sGXsfl_65_fel_idx ;
      lblTextblock17_Internalname = "TEXTBLOCK17_"+sGXsfl_65_fel_idx ;
      edtDtp_ForPhx_Internalname = "DTP_FORPHX_"+sGXsfl_65_fel_idx ;
      lblTextblock18_Internalname = "TEXTBLOCK18_"+sGXsfl_65_fel_idx ;
      edtDtp_ForPhn_Internalname = "DTP_FORPHN_"+sGXsfl_65_fel_idx ;
      lblTextblock19_Internalname = "TEXTBLOCK19_"+sGXsfl_65_fel_idx ;
      edtDtp_ForUli_Internalname = "DTP_FORULI_"+sGXsfl_65_fel_idx ;
      lblTextblock20_Internalname = "TEXTBLOCK20_"+sGXsfl_65_fel_idx ;
      edtDtp_Nh2o_Internalname = "DTP_NH2O_"+sGXsfl_65_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_65_fel_idx ;
   }

   public void addRow10F1104( )
   {
      nRC_GXsfl_127 = 0 ;
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651104( ) ;
      sendRow10F1104( ) ;
   }

   public void sendRow10F1104( )
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
         if ( ((int)((nGXsfl_65_idx) % (2))) == 0 )
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
         httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_65_idx+"\">") ;
      }
      if ( GRID1_IsPaging == 0 )
      {
         GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_65_idx ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable3_Internalname+"_"+sGXsfl_65_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock10_Internalname,httpContext.getMessage( "Orden Proceso Q DT", ""),"","",lblTextblock10_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1104_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtp_Ordl_Internalname,GXutil.ltrim( localUtil.ntoc( A7897Dtp_Ordl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7897Dtp_Ordl), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtp_Ordl_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDtp_Ordl_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock11_Internalname,httpContext.getMessage( "Proceso Q DT", ""),"","",lblTextblock11_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1104_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtp_CPQ_Internalname,GXutil.rtrim( A7898Dtp_CPQ),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtp_CPQ_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDtp_CPQ_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock12_Internalname,httpContext.getMessage( "Descripcion DT", ""),"","",lblTextblock12_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtp_DPQ_Internalname,GXutil.rtrim( A7899Dtp_DPQ),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtp_DPQ_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDtp_DPQ_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(80),"chr",Integer.valueOf(1),"row",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock13_Internalname,httpContext.getMessage( "Tipo L T M", ""),"","",lblTextblock13_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1104_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtp_ForFab_Internalname,GXutil.rtrim( A7900Dtp_ForFab),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtp_ForFab_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDtp_ForFab_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock14_Internalname,httpContext.getMessage( "Tiempo", ""),"","",lblTextblock14_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1104_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtp_Fortie_Internalname,GXutil.ltrim( localUtil.ntoc( A7901Dtp_Fortie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDtp_Fortie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7901Dtp_Fortie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7901Dtp_Fortie), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,93);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtp_Fortie_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDtp_Fortie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock15_Internalname,httpContext.getMessage( "TºC DT", ""),"","",lblTextblock15_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1104_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtp_ForTmx_Internalname,GXutil.ltrim( localUtil.ntoc( A7902Dtp_ForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDtp_ForTmx_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7902Dtp_ForTmx), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7902Dtp_ForTmx), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,98);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtp_ForTmx_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDtp_ForTmx_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock16_Internalname,httpContext.getMessage( "Rb DT", ""),"","",lblTextblock16_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1104_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtp_ForRb_Internalname,GXutil.ltrim( localUtil.ntoc( A7903Dtp_ForRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDtp_ForRb_Enabled!=0) ? localUtil.format( A7903Dtp_ForRb, "ZZZ9.99") : localUtil.format( A7903Dtp_ForRb, "ZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,103);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtp_ForRb_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDtp_ForRb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(7),"chr",Integer.valueOf(1),"row",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock17_Internalname,httpContext.getMessage( "Ph Max DT", ""),"","",lblTextblock17_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1104_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 108,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtp_ForPhx_Internalname,GXutil.ltrim( localUtil.ntoc( A7904Dtp_ForPhx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDtp_ForPhx_Enabled!=0) ? localUtil.format( A7904Dtp_ForPhx, "Z9.99") : localUtil.format( A7904Dtp_ForPhx, "Z9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,108);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtp_ForPhx_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDtp_ForPhx_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(5),"chr",Integer.valueOf(1),"row",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock18_Internalname,httpContext.getMessage( "Ph Min DT", ""),"","",lblTextblock18_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1104_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtp_ForPhn_Internalname,GXutil.ltrim( localUtil.ntoc( A7905Dtp_ForPhn, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDtp_ForPhn_Enabled!=0) ? localUtil.format( A7905Dtp_ForPhn, "Z9.99") : localUtil.format( A7905Dtp_ForPhn, "Z9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,113);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtp_ForPhn_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDtp_ForPhn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(5),"chr",Integer.valueOf(1),"row",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock19_Internalname,httpContext.getMessage( "Ultima Linea Productos DT", ""),"","",lblTextblock19_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtp_ForUli_Internalname,GXutil.ltrim( localUtil.ntoc( A7906Dtp_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDtp_ForUli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7906Dtp_ForUli), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7906Dtp_ForUli), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtp_ForUli_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDtp_ForUli_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock20_Internalname,httpContext.getMessage( "NUmero de Baños", ""),"","",lblTextblock20_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1104_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 123,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtp_Nh2o_Internalname,GXutil.ltrim( localUtil.ntoc( A11933Dtp_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDtp_Nh2o_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11933Dtp_Nh2o), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11933Dtp_Nh2o), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,123);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtp_Nh2o_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDtp_Nh2o_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
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
      startgridcontrol127( ) ;
      nGXsfl_127_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1105 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1105 = (short)(1) ;
            scanStart10F1105( ) ;
            while ( RcdFound1105 != 0 )
            {
               init_level_properties1105( ) ;
               getByPrimaryKey10F1105( ) ;
               addRow10F1105( ) ;
               scanNext10F1105( ) ;
            }
            scanEnd10F1105( ) ;
            nBlankRcdCount1105 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B7906Dtp_ForUli = A7906Dtp_ForUli ;
         n7906Dtp_ForUli = false ;
         B7911Dtp_UOrd = A7911Dtp_UOrd ;
         n7911Dtp_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
         standaloneNotModal10F1105( ) ;
         standaloneModal10F1105( ) ;
         sMode1105 = Gx_mode ;
         while ( nGXsfl_127_idx < nRC_GXsfl_127 )
         {
            bGXsfl_127_Refreshing = true ;
            readRow10F1105( ) ;
            edtavnRcdDeleted_1105_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1105_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1105_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1105_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtDtp_ForLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_FORLIN_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtp_ForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_ForLin_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtDtp_Prdnum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_PRDNUM_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtp_Prdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_Prdnum_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtDtp_PrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_PRDNOM_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtp_PrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_PrdNom_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtForPrdDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDDSC_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtDtp_Forcan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_FORCAN_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtp_Forcan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_Forcan_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtDtp_clave1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_CLAVE1_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtp_clave1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_clave1_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtDtp_clave2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_CLAVE2_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDtp_clave2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_clave2_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            if ( ( nRcdExists_1105 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal10F1105( ) ;
            }
            sendRow10F1105( ) ;
            bGXsfl_127_Refreshing = false ;
         }
         Gx_mode = sMode1105 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A7906Dtp_ForUli = B7906Dtp_ForUli ;
         n7906Dtp_ForUli = false ;
         A7911Dtp_UOrd = B7911Dtp_UOrd ;
         n7911Dtp_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1105 = (short)(5) ;
         nRcdExists_1105 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart10F1105( ) ;
            while ( RcdFound1105 != 0 )
            {
               sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx+1), 4, 0), (short)(4), "0") + sGXsfl_65_idx ;
               subsflControlProps_1271105( ) ;
               init_level_properties1105( ) ;
               standaloneNotModal10F1105( ) ;
               getByPrimaryKey10F1105( ) ;
               standaloneModal10F1105( ) ;
               addRow10F1105( ) ;
               scanNext10F1105( ) ;
            }
            scanEnd10F1105( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1105 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx+1), 4, 0), (short)(4), "0") + sGXsfl_65_idx ;
      subsflControlProps_1271105( ) ;
      initAll10F1105( ) ;
      init_level_properties1105( ) ;
      B7906Dtp_ForUli = A7906Dtp_ForUli ;
      n7906Dtp_ForUli = false ;
      B7911Dtp_UOrd = A7911Dtp_UOrd ;
      n7911Dtp_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
      nRcdExists_1105 = (short)(0) ;
      nIsMod_1105 = (short)(0) ;
      nRcdDeleted_1105 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 65 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_65_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1105 = (short)(nBlankRcdUsr1105+nBlankRcdCount1105) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1105 > 0 )
      {
         standaloneNotModal10F1105( ) ;
         standaloneModal10F1105( ) ;
         addRow10F1105( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtDtp_ForLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1105 = (short)(nBlankRcdCount1105-1) ;
      }
      Gx_mode = sMode1105 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A7906Dtp_ForUli = B7906Dtp_ForUli ;
      n7906Dtp_ForUli = false ;
      A7911Dtp_UOrd = B7911Dtp_UOrd ;
      n7911Dtp_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_65_idx, Grid2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid1Row.AddGrid("Grid2", Grid2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_65_idx, Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_65_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      /* End of table */
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes10F1104( ) ;
      GXCCtl = "Z7897Dtp_Ordl_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7897Dtp_Ordl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11933Dtp_Nh2o_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11933Dtp_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7898Dtp_CPQ_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7898Dtp_CPQ));
      GXCCtl = "Z7900Dtp_ForFab_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7900Dtp_ForFab));
      GXCCtl = "Z7901Dtp_Fortie_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7901Dtp_Fortie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7902Dtp_ForTmx_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7902Dtp_ForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7903Dtp_ForRb_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7903Dtp_ForRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7904Dtp_ForPhx_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7904Dtp_ForPhx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7905Dtp_ForPhn_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7905Dtp_ForPhn, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7906Dtp_ForUli_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7906Dtp_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O7906Dtp_ForUli_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O7906Dtp_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_127_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_127_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1104_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1104, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1104_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1104, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1104_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1104, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vGXBSCREEN_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTP_ORDL_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_Ordl_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTP_CPQ_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_CPQ_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTP_DPQ_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_DPQ_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTP_FORFAB_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForFab_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTP_FORTIE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_Fortie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTP_FORTMX_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForTmx_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTP_FORRB_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForRb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTP_FORPHX_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForPhx_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTP_FORPHN_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForPhn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTP_FORULI_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForUli_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTP_NH2O_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_Nh2o_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_65_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow10F1104( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651104( ) ;
      edtDtp_Ordl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_ORDL_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtp_CPQ_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_CPQ_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtp_DPQ_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_DPQ_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtp_ForFab_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_FORFAB_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtp_Fortie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_FORTIE_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtp_ForTmx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_FORTMX_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtp_ForRb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_FORRB_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtp_ForPhx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_FORPHX_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtp_ForPhn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_FORPHN_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtp_ForUli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_FORULI_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtp_Nh2o_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_NH2O_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDtp_Ordl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDtp_Ordl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DTP_ORDL_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDtp_Ordl_Internalname ;
         wbErr = true ;
         A7897Dtp_Ordl = (short)(0) ;
      }
      else
      {
         A7897Dtp_Ordl = (short)(localUtil.ctol( httpContext.cgiGet( edtDtp_Ordl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A7898Dtp_CPQ = httpContext.cgiGet( edtDtp_CPQ_Internalname) ;
      n7898Dtp_CPQ = false ;
      A7899Dtp_DPQ = httpContext.cgiGet( edtDtp_DPQ_Internalname) ;
      A7900Dtp_ForFab = httpContext.cgiGet( edtDtp_ForFab_Internalname) ;
      n7900Dtp_ForFab = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDtp_Fortie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDtp_Fortie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DTP_FORTIE_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDtp_Fortie_Internalname ;
         wbErr = true ;
         A7901Dtp_Fortie = (short)(0) ;
         n7901Dtp_Fortie = false ;
      }
      else
      {
         A7901Dtp_Fortie = (short)(localUtil.ctol( httpContext.cgiGet( edtDtp_Fortie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7901Dtp_Fortie = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDtp_ForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDtp_ForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DTP_FORTMX_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDtp_ForTmx_Internalname ;
         wbErr = true ;
         A7902Dtp_ForTmx = (short)(0) ;
         n7902Dtp_ForTmx = false ;
      }
      else
      {
         A7902Dtp_ForTmx = (short)(localUtil.ctol( httpContext.cgiGet( edtDtp_ForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7902Dtp_ForTmx = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDtp_ForRb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDtp_ForRb_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
      {
         GXCCtl = "DTP_FORRB_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDtp_ForRb_Internalname ;
         wbErr = true ;
         A7903Dtp_ForRb = DecimalUtil.ZERO ;
         n7903Dtp_ForRb = false ;
      }
      else
      {
         A7903Dtp_ForRb = localUtil.ctond( httpContext.cgiGet( edtDtp_ForRb_Internalname)) ;
         n7903Dtp_ForRb = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDtp_ForPhx_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDtp_ForPhx_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
      {
         GXCCtl = "DTP_FORPHX_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDtp_ForPhx_Internalname ;
         wbErr = true ;
         A7904Dtp_ForPhx = DecimalUtil.ZERO ;
         n7904Dtp_ForPhx = false ;
      }
      else
      {
         A7904Dtp_ForPhx = localUtil.ctond( httpContext.cgiGet( edtDtp_ForPhx_Internalname)) ;
         n7904Dtp_ForPhx = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDtp_ForPhn_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDtp_ForPhn_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
      {
         GXCCtl = "DTP_FORPHN_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDtp_ForPhn_Internalname ;
         wbErr = true ;
         A7905Dtp_ForPhn = DecimalUtil.ZERO ;
         n7905Dtp_ForPhn = false ;
      }
      else
      {
         A7905Dtp_ForPhn = localUtil.ctond( httpContext.cgiGet( edtDtp_ForPhn_Internalname)) ;
         n7905Dtp_ForPhn = false ;
      }
      A7906Dtp_ForUli = (short)(localUtil.ctol( httpContext.cgiGet( edtDtp_ForUli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n7906Dtp_ForUli = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDtp_Nh2o_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDtp_Nh2o_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DTP_NH2O_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDtp_Nh2o_Internalname ;
         wbErr = true ;
         A11933Dtp_Nh2o = (short)(0) ;
         n11933Dtp_Nh2o = false ;
      }
      else
      {
         A11933Dtp_Nh2o = (short)(localUtil.ctol( httpContext.cgiGet( edtDtp_Nh2o_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n11933Dtp_Nh2o = false ;
      }
      GXCCtl = "Z7897Dtp_Ordl_" + sGXsfl_65_idx ;
      Z7897Dtp_Ordl = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11933Dtp_Nh2o_" + sGXsfl_65_idx ;
      Z11933Dtp_Nh2o = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7898Dtp_CPQ_" + sGXsfl_65_idx ;
      Z7898Dtp_CPQ = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7900Dtp_ForFab_" + sGXsfl_65_idx ;
      Z7900Dtp_ForFab = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7901Dtp_Fortie_" + sGXsfl_65_idx ;
      Z7901Dtp_Fortie = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7902Dtp_ForTmx_" + sGXsfl_65_idx ;
      Z7902Dtp_ForTmx = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7903Dtp_ForRb_" + sGXsfl_65_idx ;
      Z7903Dtp_ForRb = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7904Dtp_ForPhx_" + sGXsfl_65_idx ;
      Z7904Dtp_ForPhx = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7905Dtp_ForPhn_" + sGXsfl_65_idx ;
      Z7905Dtp_ForPhn = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7906Dtp_ForUli_" + sGXsfl_65_idx ;
      Z7906Dtp_ForUli = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O7906Dtp_ForUli_" + sGXsfl_65_idx ;
      O7906Dtp_ForUli = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_127_" + sGXsfl_65_idx ;
      nRC_GXsfl_127 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1104_" + sGXsfl_65_idx ;
      nRcdDeleted_1104 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1104_" + sGXsfl_65_idx ;
      nRcdExists_1104 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1104_" + sGXsfl_65_idx ;
      nIsMod_1104 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "vGXBSCREEN_" + sGXsfl_65_idx ;
      Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_127_" + sGXsfl_65_idx ;
      nRC_GXsfl_127 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_1271105( )
   {
      edtavnRcdDeleted_1105_Internalname = "vNRCDDELETED_1105_"+sGXsfl_127_idx ;
      edtDtp_ForLin_Internalname = "DTP_FORLIN_"+sGXsfl_127_idx ;
      edtDtp_Prdnum_Internalname = "DTP_PRDNUM_"+sGXsfl_127_idx ;
      edtDtp_PrdNom_Internalname = "DTP_PRDNOM_"+sGXsfl_127_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_127_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_127_idx ;
      edtDtp_Forcan_Internalname = "DTP_FORCAN_"+sGXsfl_127_idx ;
      edtDtp_clave1_Internalname = "DTP_CLAVE1_"+sGXsfl_127_idx ;
      edtDtp_clave2_Internalname = "DTP_CLAVE2_"+sGXsfl_127_idx ;
   }

   public void subsflControlProps_fel_1271105( )
   {
      edtavnRcdDeleted_1105_Internalname = "vNRCDDELETED_1105_"+sGXsfl_127_fel_idx ;
      edtDtp_ForLin_Internalname = "DTP_FORLIN_"+sGXsfl_127_fel_idx ;
      edtDtp_Prdnum_Internalname = "DTP_PRDNUM_"+sGXsfl_127_fel_idx ;
      edtDtp_PrdNom_Internalname = "DTP_PRDNOM_"+sGXsfl_127_fel_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_127_fel_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_127_fel_idx ;
      edtDtp_Forcan_Internalname = "DTP_FORCAN_"+sGXsfl_127_fel_idx ;
      edtDtp_clave1_Internalname = "DTP_CLAVE1_"+sGXsfl_127_fel_idx ;
      edtDtp_clave2_Internalname = "DTP_CLAVE2_"+sGXsfl_127_fel_idx ;
   }

   public void addRow10F1105( )
   {
      nGXsfl_127_idx = (int)(nGXsfl_127_idx+1) ;
      sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx), 4, 0), (short)(4), "0") + sGXsfl_65_idx ;
      subsflControlProps_1271105( ) ;
      sendRow10F1105( ) ;
   }

   public void sendRow10F1105( )
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
         if ( ((int)((nGXsfl_127_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1105_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_1104_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 128,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1105_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1105, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1105_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1105), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1105), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,128);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1105_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1105_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1105_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_1104_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 129,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtp_ForLin_Internalname,GXutil.ltrim( localUtil.ntoc( A7907Dtp_ForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7907Dtp_ForLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,129);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtp_ForLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDtp_ForLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1105_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_1104_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 130,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtp_Prdnum_Internalname,GXutil.rtrim( A7908Dtp_Prdnum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,130);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtp_Prdnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDtp_Prdnum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtp_PrdNom_Internalname,GXutil.rtrim( A7909Dtp_PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtp_PrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDtp_PrdNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1105_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_1104_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 132,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForPrdUMe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9") : localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,132);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForPrdUMe_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdDsc_Internalname,GXutil.rtrim( A488ForPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForPrdDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1105_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_1104_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 134,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtp_Forcan_Internalname,GXutil.ltrim( localUtil.ntoc( A7910Dtp_Forcan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDtp_Forcan_Enabled!=0) ? localUtil.format( A7910Dtp_Forcan, "ZZZZZ9.99999") : localUtil.format( A7910Dtp_Forcan, "ZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,134);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtp_Forcan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDtp_Forcan_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1105_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_1104_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 135,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtp_clave1_Internalname,GXutil.rtrim( A8475Dtp_clave1),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,135);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtp_clave1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDtp_clave1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1105_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_1104_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 136,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDtp_clave2_Internalname,GXutil.rtrim( A8476Dtp_clave2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDtp_clave2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDtp_clave2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashes10F1105( ) ;
      GXCCtl = "Z7907Dtp_ForLin_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7907Dtp_ForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7908Dtp_Prdnum_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7908Dtp_Prdnum));
      GXCCtl = "Z7910Dtp_Forcan_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7910Dtp_Forcan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8475Dtp_clave1_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8475Dtp_clave1));
      GXCCtl = "Z8476Dtp_clave2_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8476Dtp_clave2));
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1105_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1105, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1105_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1105, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1105_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1105, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1105_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1105_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTP_FORLIN_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTP_PRDNUM_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_Prdnum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTP_PRDNOM_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_PrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUME_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDDSC_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTP_FORCAN_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_Forcan_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTP_CLAVE1_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_clave1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DTP_CLAVE2_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_clave2_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRow10F1105( )
   {
      nGXsfl_127_idx = (int)(nGXsfl_127_idx+1) ;
      sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx), 4, 0), (short)(4), "0") + sGXsfl_65_idx ;
      subsflControlProps_1271105( ) ;
      edtavnRcdDeleted_1105_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1105_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtp_ForLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_FORLIN_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtp_Prdnum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_PRDNUM_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtp_PrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_PRDNOM_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDDSC_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtp_Forcan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_FORCAN_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtp_clave1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_CLAVE1_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDtp_clave2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DTP_CLAVE2_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1105_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1105_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1105");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1105_Internalname ;
         wbErr = true ;
         nRcdDeleted_1105 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1105 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1105_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDtp_ForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDtp_ForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DTP_FORLIN_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDtp_ForLin_Internalname ;
         wbErr = true ;
         A7907Dtp_ForLin = (short)(0) ;
      }
      else
      {
         A7907Dtp_ForLin = (short)(localUtil.ctol( httpContext.cgiGet( edtDtp_ForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A7908Dtp_Prdnum = httpContext.cgiGet( edtDtp_Prdnum_Internalname) ;
      n7908Dtp_Prdnum = false ;
      A7909Dtp_PrdNom = httpContext.cgiGet( edtDtp_PrdNom_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_127_idx ;
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
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDtp_Forcan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDtp_Forcan_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "DTP_FORCAN_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDtp_Forcan_Internalname ;
         wbErr = true ;
         A7910Dtp_Forcan = DecimalUtil.ZERO ;
         n7910Dtp_Forcan = false ;
      }
      else
      {
         A7910Dtp_Forcan = localUtil.ctond( httpContext.cgiGet( edtDtp_Forcan_Internalname)) ;
         n7910Dtp_Forcan = false ;
      }
      A8475Dtp_clave1 = httpContext.cgiGet( edtDtp_clave1_Internalname) ;
      n8475Dtp_clave1 = false ;
      A8476Dtp_clave2 = httpContext.cgiGet( edtDtp_clave2_Internalname) ;
      n8476Dtp_clave2 = false ;
      GXCCtl = "Z7907Dtp_ForLin_" + sGXsfl_127_idx ;
      Z7907Dtp_ForLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7908Dtp_Prdnum_" + sGXsfl_127_idx ;
      Z7908Dtp_Prdnum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7910Dtp_Forcan_" + sGXsfl_127_idx ;
      Z7910Dtp_Forcan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8475Dtp_clave1_" + sGXsfl_127_idx ;
      Z8475Dtp_clave1 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8476Dtp_clave2_" + sGXsfl_127_idx ;
      Z8476Dtp_clave2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_127_idx ;
      Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1105_" + sGXsfl_127_idx ;
      nRcdDeleted_1105 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1105_" + sGXsfl_127_idx ;
      nRcdExists_1105 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1105_" + sGXsfl_127_idx ;
      nIsMod_1105 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtDtp_ForLin_Enabled = edtDtp_ForLin_Enabled ;
      defedtDtp_ForUli_Enabled = edtDtp_ForUli_Enabled ;
      defedtDtp_Ordl_Enabled = edtDtp_Ordl_Enabled ;
   }

   public void confirmValues10F0( )
   {
      nGXsfl_65_idx = 0 ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651104( ) ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_651104( ) ;
         httpContext.changePostValue( "Z7897Dtp_Ordl_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z7897Dtp_Ordl_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7897Dtp_Ordl_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z11933Dtp_Nh2o_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z11933Dtp_Nh2o_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11933Dtp_Nh2o_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z7898Dtp_CPQ_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z7898Dtp_CPQ_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7898Dtp_CPQ_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z7900Dtp_ForFab_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z7900Dtp_ForFab_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7900Dtp_ForFab_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z7901Dtp_Fortie_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z7901Dtp_Fortie_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7901Dtp_Fortie_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z7902Dtp_ForTmx_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z7902Dtp_ForTmx_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7902Dtp_ForTmx_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z7903Dtp_ForRb_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z7903Dtp_ForRb_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7903Dtp_ForRb_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z7904Dtp_ForPhx_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z7904Dtp_ForPhx_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7904Dtp_ForPhx_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z7905Dtp_ForPhn_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z7905Dtp_ForPhn_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7905Dtp_ForPhn_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z7906Dtp_ForUli_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z7906Dtp_ForUli_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7906Dtp_ForUli_"+sGXsfl_65_idx) ;
      }
      nGXsfl_127_idx = 0 ;
      sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx), 4, 0), (short)(4), "0") + sGXsfl_65_idx ;
      subsflControlProps_1271105( ) ;
      while ( nGXsfl_127_idx < nRC_GXsfl_127 )
      {
         nGXsfl_127_idx = (int)(nGXsfl_127_idx+1) ;
         sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx), 4, 0), (short)(4), "0") + sGXsfl_65_idx ;
         subsflControlProps_1271105( ) ;
         httpContext.changePostValue( "Z7907Dtp_ForLin_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z7907Dtp_ForLin_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7907Dtp_ForLin_"+sGXsfl_127_idx) ;
         httpContext.changePostValue( "Z7908Dtp_Prdnum_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z7908Dtp_Prdnum_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7908Dtp_Prdnum_"+sGXsfl_127_idx) ;
         httpContext.changePostValue( "Z7910Dtp_Forcan_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z7910Dtp_Forcan_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7910Dtp_Forcan_"+sGXsfl_127_idx) ;
         httpContext.changePostValue( "Z8475Dtp_clave1_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z8475Dtp_clave1_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8475Dtp_clave1_"+sGXsfl_127_idx) ;
         httpContext.changePostValue( "Z8476Dtp_clave2_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z8476Dtp_clave2_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8476Dtp_clave2_"+sGXsfl_127_idx) ;
         httpContext.changePostValue( "Z490ForPrdUMe_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_127_idx) ;
      }
      httpContext.changePostValue( "O7906Dtp_ForUli", httpContext.cgiGet( "T7906Dtp_ForUli")) ;
      httpContext.deletePostValue( "T7906Dtp_ForUli") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdt002", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A774ProNumLin,4,0))}, new String[] {"EmprCod","ProCod","ProNumLin"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z774ProNumLin", GXutil.ltrim( localUtil.ntoc( Z774ProNumLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7892Dtp_FasDsc", GXutil.rtrim( Z7892Dtp_FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7911Dtp_UOrd", GXutil.ltrim( localUtil.ntoc( Z7911Dtp_UOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "O7911Dtp_UOrd", GXutil.ltrim( localUtil.ntoc( O7911Dtp_UOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_65", GXutil.ltrim( localUtil.ntoc( nGXsfl_65_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tdt002", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A774ProNumLin,4,0))}, new String[] {"EmprCod","ProCod","ProNumLin"})  ;
   }

   public String getPgmname( )
   {
      return "TDT002" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PROCESOS QUIMICOS F(NIT)", "") ;
   }

   public void initializeNonKey10F88( )
   {
      A457FasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A7892Dtp_FasDsc = "" ;
      n7892Dtp_FasDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7892Dtp_FasDsc", A7892Dtp_FasDsc);
      A7911Dtp_UOrd = (short)(0) ;
      n7911Dtp_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
      O7911Dtp_UOrd = A7911Dtp_UOrd ;
      n7911Dtp_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
      Z7892Dtp_FasDsc = "" ;
      Z7911Dtp_UOrd = (short)(0) ;
      Z457FasCod = "" ;
   }

   public void initAll10F88( )
   {
      initializeNonKey10F88( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey10F1104( )
   {
      A7899Dtp_DPQ = "" ;
      A7898Dtp_CPQ = "" ;
      n7898Dtp_CPQ = false ;
      A7900Dtp_ForFab = "" ;
      n7900Dtp_ForFab = false ;
      A7901Dtp_Fortie = (short)(0) ;
      n7901Dtp_Fortie = false ;
      A7902Dtp_ForTmx = (short)(0) ;
      n7902Dtp_ForTmx = false ;
      A7903Dtp_ForRb = DecimalUtil.ZERO ;
      n7903Dtp_ForRb = false ;
      A7904Dtp_ForPhx = DecimalUtil.ZERO ;
      n7904Dtp_ForPhx = false ;
      A7905Dtp_ForPhn = DecimalUtil.ZERO ;
      n7905Dtp_ForPhn = false ;
      A7906Dtp_ForUli = (short)(0) ;
      n7906Dtp_ForUli = false ;
      A11933Dtp_Nh2o = (short)(1) ;
      n11933Dtp_Nh2o = false ;
      O7906Dtp_ForUli = A7906Dtp_ForUli ;
      n7906Dtp_ForUli = false ;
      Z11933Dtp_Nh2o = (short)(0) ;
      Z7898Dtp_CPQ = "" ;
      Z7900Dtp_ForFab = "" ;
      Z7901Dtp_Fortie = (short)(0) ;
      Z7902Dtp_ForTmx = (short)(0) ;
      Z7903Dtp_ForRb = DecimalUtil.ZERO ;
      Z7904Dtp_ForPhx = DecimalUtil.ZERO ;
      Z7905Dtp_ForPhn = DecimalUtil.ZERO ;
      Z7906Dtp_ForUli = (short)(0) ;
   }

   public void initAll10F1104( )
   {
      A7897Dtp_Ordl = (short)(0) ;
      initializeNonKey10F1104( ) ;
   }

   public void standaloneModalInsert10F1104( )
   {
      A7911Dtp_UOrd = i7911Dtp_UOrd ;
      n7911Dtp_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7911Dtp_UOrd), 4, 0));
      A11933Dtp_Nh2o = i11933Dtp_Nh2o ;
      n11933Dtp_Nh2o = false ;
   }

   public void initializeNonKey10F1105( )
   {
      A7909Dtp_PrdNom = "" ;
      A7908Dtp_Prdnum = "" ;
      n7908Dtp_Prdnum = false ;
      A490ForPrdUMe = (byte)(0) ;
      n490ForPrdUMe = false ;
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      A7910Dtp_Forcan = DecimalUtil.ZERO ;
      n7910Dtp_Forcan = false ;
      A8475Dtp_clave1 = "" ;
      n8475Dtp_clave1 = false ;
      A8476Dtp_clave2 = "" ;
      n8476Dtp_clave2 = false ;
      Z7908Dtp_Prdnum = "" ;
      Z7910Dtp_Forcan = DecimalUtil.ZERO ;
      Z8475Dtp_clave1 = "" ;
      Z8476Dtp_clave2 = "" ;
      Z490ForPrdUMe = (byte)(0) ;
   }

   public void initAll10F1105( )
   {
      A7907Dtp_ForLin = (short)(0) ;
      initializeNonKey10F1105( ) ;
   }

   public void standaloneModalInsert10F1105( )
   {
      A7906Dtp_ForUli = i7906Dtp_ForUli ;
      n7906Dtp_ForUli = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241533565", true, true);
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
      httpContext.AddJavascriptSource("tdt002.js", "?20268241533565", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1104( )
   {
      edtDtp_ForUli_Enabled = defedtDtp_ForUli_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_ForUli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_ForUli_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtDtp_Ordl_Enabled = defedtDtp_Ordl_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_Ordl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_Ordl_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void init_level_properties1105( )
   {
      edtDtp_ForLin_Enabled = defedtDtp_ForLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtp_ForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtp_ForLin_Enabled), 5, 0), !bGXsfl_127_Refreshing);
   }

   public void startgridcontrol65( )
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
      Grid1Column.AddObjectProperty("Value", lblTextblock10_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7897Dtp_Ordl, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_Ordl_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7898Dtp_CPQ));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_CPQ_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7899Dtp_DPQ));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_DPQ_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7900Dtp_ForFab));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForFab_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7901Dtp_Fortie, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_Fortie_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7902Dtp_ForTmx, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForTmx_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7903Dtp_ForRb, (byte)(7), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForRb_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7904Dtp_ForPhx, (byte)(5), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForPhx_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7905Dtp_ForPhn, (byte)(5), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForPhn_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7906Dtp_ForUli, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForUli_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock20_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11933Dtp_Nh2o, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_Nh2o_Enabled, (byte)(5), (byte)(0), ".", "")));
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

   public void startgridcontrol127( )
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
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1105, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1105_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7907Dtp_ForLin, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_ForLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A7908Dtp_Prdnum));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_Prdnum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A7909Dtp_PrdNom));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_PrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7910Dtp_Forcan, (byte)(12), (byte)(5), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_Forcan_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A8475Dtp_clave1));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_clave1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A8476Dtp_clave2));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDtp_clave2_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtProCod_Internalname = "PROCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtProDsc_Internalname = "PRODSC" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtProDsc2_Internalname = "PRODSC2" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtProNumLin_Internalname = "PRONUMLIN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtFasCod_Internalname = "FASCOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtDtp_FasDsc_Internalname = "DTP_FASDSC" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtDtp_UOrd_Internalname = "DTP_UORD" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtDtp_Ordl_Internalname = "DTP_ORDL" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtDtp_CPQ_Internalname = "DTP_CPQ" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtDtp_DPQ_Internalname = "DTP_DPQ" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtDtp_ForFab_Internalname = "DTP_FORFAB" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtDtp_Fortie_Internalname = "DTP_FORTIE" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtDtp_ForTmx_Internalname = "DTP_FORTMX" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtDtp_ForRb_Internalname = "DTP_FORRB" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtDtp_ForPhx_Internalname = "DTP_FORPHX" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtDtp_ForPhn_Internalname = "DTP_FORPHN" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtDtp_ForUli_Internalname = "DTP_FORULI" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtDtp_Nh2o_Internalname = "DTP_NH2O" ;
      edtavnRcdDeleted_1105_Internalname = "vNRCDDELETED_1105" ;
      edtDtp_ForLin_Internalname = "DTP_FORLIN" ;
      edtDtp_Prdnum_Internalname = "DTP_PRDNUM" ;
      edtDtp_PrdNom_Internalname = "DTP_PRDNOM" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtDtp_Forcan_Internalname = "DTP_FORCAN" ;
      edtDtp_clave1_Internalname = "DTP_CLAVE1" ;
      edtDtp_clave2_Internalname = "DTP_CLAVE2" ;
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
      lblTextblock20_Caption = httpContext.getMessage( "NUmero de Baños", "") ;
      lblTextblock19_Caption = httpContext.getMessage( "Ultima Linea Productos DT", "") ;
      lblTextblock18_Caption = httpContext.getMessage( "Ph Min DT", "") ;
      lblTextblock17_Caption = httpContext.getMessage( "Ph Max DT", "") ;
      lblTextblock16_Caption = httpContext.getMessage( "Rb DT", "") ;
      lblTextblock15_Caption = httpContext.getMessage( "TºC DT", "") ;
      lblTextblock14_Caption = httpContext.getMessage( "Tiempo", "") ;
      lblTextblock13_Caption = httpContext.getMessage( "Tipo L T M", "") ;
      lblTextblock12_Caption = httpContext.getMessage( "Descripcion DT", "") ;
      lblTextblock11_Caption = httpContext.getMessage( "Proceso Q DT", "") ;
      lblTextblock10_Caption = httpContext.getMessage( "Orden Proceso Q DT", "") ;
      subGrid1_Borderwidth = (short)(1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "PROCESOS QUIMICOS F(NIT)", "") );
      edtDtp_clave2_Jsonclick = "" ;
      edtDtp_clave1_Jsonclick = "" ;
      edtDtp_Forcan_Jsonclick = "" ;
      edtForPrdDsc_Jsonclick = "" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtDtp_PrdNom_Jsonclick = "" ;
      edtDtp_Prdnum_Jsonclick = "" ;
      edtDtp_ForLin_Jsonclick = "" ;
      edtavnRcdDeleted_1105_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtDtp_Nh2o_Jsonclick = "" ;
      edtDtp_ForUli_Jsonclick = "" ;
      edtDtp_ForPhn_Jsonclick = "" ;
      edtDtp_ForPhx_Jsonclick = "" ;
      edtDtp_ForRb_Jsonclick = "" ;
      edtDtp_ForTmx_Jsonclick = "" ;
      edtDtp_Fortie_Jsonclick = "" ;
      edtDtp_ForFab_Jsonclick = "" ;
      edtDtp_DPQ_Jsonclick = "" ;
      edtDtp_CPQ_Jsonclick = "" ;
      edtDtp_Ordl_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtDtp_clave2_Enabled = 1 ;
      edtDtp_clave1_Enabled = 1 ;
      edtDtp_Forcan_Enabled = 1 ;
      edtForPrdDsc_Enabled = 0 ;
      edtForPrdUMe_Enabled = 1 ;
      edtDtp_PrdNom_Enabled = 0 ;
      edtDtp_Prdnum_Enabled = 1 ;
      edtDtp_ForLin_Enabled = 1 ;
      edtavnRcdDeleted_1105_Enabled = 1 ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtDtp_Nh2o_Enabled = 1 ;
      edtDtp_ForUli_Enabled = 0 ;
      edtDtp_ForPhn_Enabled = 1 ;
      edtDtp_ForPhx_Enabled = 1 ;
      edtDtp_ForRb_Enabled = 1 ;
      edtDtp_ForTmx_Enabled = 1 ;
      edtDtp_Fortie_Enabled = 1 ;
      edtDtp_ForFab_Enabled = 1 ;
      edtDtp_DPQ_Enabled = 0 ;
      edtDtp_CPQ_Enabled = 1 ;
      edtDtp_Ordl_Enabled = 1 ;
      edtDtp_UOrd_Jsonclick = "" ;
      edtDtp_UOrd_Backcolor = (int)(0xFFFFFF) ;
      edtDtp_UOrd_Enabled = 0 ;
      edtDtp_FasDsc_Jsonclick = "" ;
      edtDtp_FasDsc_Backcolor = (int)(0xFFFFFF) ;
      edtDtp_FasDsc_Enabled = 1 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Backcolor = (int)(0xFFFFFF) ;
      edtFasCod_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtProNumLin_Jsonclick = "" ;
      edtProNumLin_Backcolor = (int)(0xFFFFFF) ;
      edtProNumLin_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtProDsc2_Jsonclick = "" ;
      edtProDsc2_Backcolor = (int)(0xFFFFFF) ;
      edtProDsc2_Enabled = 0 ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Backcolor = (int)(0xFFFFFF) ;
      edtProDsc_Enabled = 0 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Backcolor = (int)(0xFFFFFF) ;
      edtProCod_Enabled = 0 ;
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

   public void gx2asadtp_dpq10F1104( String A396EmprCod ,
                                     String A7898Dtp_CPQ )
   {
      GXt_char1 = A7899Dtp_DPQ ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7898Dtp_CPQ ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd3(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt002_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt002_impl.this.A7898Dtp_CPQ = GXv_char3[0] ;
      tdt002_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7899Dtp_DPQ = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7899Dtp_DPQ))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx11asadtp_prdnom10F1105( String A396EmprCod ,
                                         String A7908Dtp_Prdnum )
   {
      GXt_char1 = A7909Dtp_PrdNom ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7908Dtp_Prdnum ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt002_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt002_impl.this.A7908Dtp_Prdnum = GXv_char3[0] ;
      tdt002_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7909Dtp_PrdNom = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7909Dtp_PrdNom))+"\"") ;
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
      subsflControlProps_651104( ) ;
      while ( nGXsfl_65_idx <= nRC_GXsfl_65 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal10F1104( ) ;
         standaloneModal10F1104( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow10F1104( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_651104( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1271105( ) ;
      while ( nGXsfl_127_idx <= nRC_GXsfl_127 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal10F1104( ) ;
         standaloneModal10F1104( ) ;
         standaloneNotModal10F1105( ) ;
         standaloneModal10F1105( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow10F1105( ) ;
         nGXsfl_127_idx = (int)(nGXsfl_127_idx+1) ;
         sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx), 4, 0), (short)(4), "0") + sGXsfl_65_idx ;
         subsflControlProps_1271105( ) ;
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
      /* Using cursor T010F40 */
      pr_default.execute(38, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(38) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T010F40_A407EmprNom[0] ;
      n407EmprNom = T010F40_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(38);
      /* Using cursor T010F41 */
      pr_default.execute(39, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(39) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T010F41_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      A4628ProDsc2 = T010F41_A4628ProDsc2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4628ProDsc2", A4628ProDsc2);
      pr_default.close(39);
      GX_FocusControl = edtFasCod_Internalname ;
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

   public void valid_Pronumlin( )
   {
      n7911Dtp_UOrd = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4628ProDsc2", GXutil.rtrim( A4628ProDsc2));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", GXutil.rtrim( A457FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A7892Dtp_FasDsc", GXutil.rtrim( A7892Dtp_FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A7911Dtp_UOrd", GXutil.ltrim( localUtil.ntoc( A7911Dtp_UOrd, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z774ProNumLin", GXutil.ltrim( localUtil.ntoc( Z774ProNumLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z759ProDsc", GXutil.rtrim( Z759ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4628ProDsc2", GXutil.rtrim( Z4628ProDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7892Dtp_FasDsc", GXutil.rtrim( Z7892Dtp_FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7911Dtp_UOrd", GXutil.ltrim( localUtil.ntoc( Z7911Dtp_UOrd, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O7911Dtp_UOrd", GXutil.ltrim( localUtil.ntoc( O7911Dtp_UOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Fascod( )
   {
      /* Using cursor T010F42 */
      pr_default.execute(40, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(40) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      pr_default.close(40);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Dtp_cpq( )
   {
      n7898Dtp_CPQ = false ;
      GXt_char1 = A7899Dtp_DPQ ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7898Dtp_CPQ ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd3(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt002_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt002_impl.this.A7898Dtp_CPQ = GXv_char3[0] ;
      tdt002_impl.this.GXt_char1 = GXv_char2[0] ;
      A7899Dtp_DPQ = GXt_char1 ;
      if ( ( GXutil.strcmp(A7899Dtp_DPQ, httpContext.getMessage( "Error", "")) == 0 ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Inexistente", ""), 1, "DTP_CPQ");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDtp_CPQ_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7899Dtp_DPQ", GXutil.rtrim( A7899Dtp_DPQ));
   }

   public void valid_Dtp_prdnum( )
   {
      n7908Dtp_Prdnum = false ;
      GXt_char1 = A7909Dtp_PrdNom ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7908Dtp_Prdnum ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt002_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt002_impl.this.A7908Dtp_Prdnum = GXv_char3[0] ;
      tdt002_impl.this.GXt_char1 = GXv_char2[0] ;
      A7909Dtp_PrdNom = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7909Dtp_PrdNom", GXutil.rtrim( A7909Dtp_PrdNom));
   }

   public void valid_Forprdume( )
   {
      n490ForPrdUMe = false ;
      n488ForPrdDsc = false ;
      /* Using cursor T010F38 */
      pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(36) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      A488ForPrdDsc = T010F38_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T010F38_n488ForPrdDsc[0] ;
      pr_default.close(36);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A774ProNumLin',fld:'PRONUMLIN',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
      setEventMetadata("VALID_PRONUMLIN","{handler:'valid_Pronumlin',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A7911Dtp_UOrd',fld:'DTP_UORD',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A774ProNumLin',fld:'PRONUMLIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PRONUMLIN",",oparms:[{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A4628ProDsc2',fld:'PRODSC2',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A7892Dtp_FasDsc',fld:'DTP_FASDSC',pic:''},{av:'A7911Dtp_UOrd',fld:'DTP_UORD',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z758ProCod'},{av:'Z774ProNumLin'},{av:'Z759ProDsc'},{av:'Z4628ProDsc2'},{av:'Z407EmprNom'},{av:'Z457FasCod'},{av:'Z7892Dtp_FasDsc'},{av:'Z7911Dtp_UOrd'},{av:'O7911Dtp_UOrd'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'}]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("VALID_DTP_UORD","{handler:'valid_Dtp_uord',iparms:[]");
      setEventMetadata("VALID_DTP_UORD",",oparms:[]}");
      setEventMetadata("VALID_DTP_ORDL","{handler:'valid_Dtp_ordl',iparms:[]");
      setEventMetadata("VALID_DTP_ORDL",",oparms:[]}");
      setEventMetadata("VALID_DTP_CPQ","{handler:'valid_Dtp_cpq',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7898Dtp_CPQ',fld:'DTP_CPQ',pic:''},{av:'A7899Dtp_DPQ',fld:'DTP_DPQ',pic:''}]");
      setEventMetadata("VALID_DTP_CPQ",",oparms:[{av:'A7899Dtp_DPQ',fld:'DTP_DPQ',pic:''}]}");
      setEventMetadata("VALID_DTP_DPQ","{handler:'valid_Dtp_dpq',iparms:[]");
      setEventMetadata("VALID_DTP_DPQ",",oparms:[]}");
      setEventMetadata("VALID_DTP_FORFAB","{handler:'valid_Dtp_forfab',iparms:[]");
      setEventMetadata("VALID_DTP_FORFAB",",oparms:[]}");
      setEventMetadata("VALID_DTP_FORULI","{handler:'valid_Dtp_foruli',iparms:[]");
      setEventMetadata("VALID_DTP_FORULI",",oparms:[]}");
      setEventMetadata("VALID_DTP_NH2O","{handler:'valid_Dtp_nh2o',iparms:[]");
      setEventMetadata("VALID_DTP_NH2O",",oparms:[]}");
      setEventMetadata("VALID_DTP_FORLIN","{handler:'valid_Dtp_forlin',iparms:[]");
      setEventMetadata("VALID_DTP_FORLIN",",oparms:[]}");
      setEventMetadata("VALID_DTP_PRDNUM","{handler:'valid_Dtp_prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7908Dtp_Prdnum',fld:'DTP_PRDNUM',pic:''},{av:'A7909Dtp_PrdNom',fld:'DTP_PRDNOM',pic:''}]");
      setEventMetadata("VALID_DTP_PRDNUM",",oparms:[{av:'A7909Dtp_PrdNom',fld:'DTP_PRDNOM',pic:''}]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Dtp_clave2',iparms:[]");
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
      pr_default.close(36);
      pr_default.close(38);
      pr_default.close(40);
      pr_default.close(39);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA758ProCod = "" ;
      Z396EmprCod = "" ;
      Z758ProCod = "" ;
      Z7892Dtp_FasDsc = "" ;
      Z457FasCod = "" ;
      Z7898Dtp_CPQ = "" ;
      Z7900Dtp_ForFab = "" ;
      Z7903Dtp_ForRb = DecimalUtil.ZERO ;
      Z7904Dtp_ForPhx = DecimalUtil.ZERO ;
      Z7905Dtp_ForPhn = DecimalUtil.ZERO ;
      Z7908Dtp_Prdnum = "" ;
      Z7910Dtp_Forcan = DecimalUtil.ZERO ;
      Z8475Dtp_clave1 = "" ;
      Z8476Dtp_clave2 = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A7898Dtp_CPQ = "" ;
      A7908Dtp_Prdnum = "" ;
      A457FasCod = "" ;
      A758ProCod = "" ;
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
      A759ProDsc = "" ;
      lblTextblock4_Jsonclick = "" ;
      A4628ProDsc2 = "" ;
      lblTextblock5_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A7892Dtp_FasDsc = "" ;
      lblTextblock9_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1104 = "" ;
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
      sMode88 = "" ;
      GXCCtl = "" ;
      A7909Dtp_PrdNom = "" ;
      A488ForPrdDsc = "" ;
      A7910Dtp_Forcan = DecimalUtil.ZERO ;
      A8475Dtp_clave1 = "" ;
      A8476Dtp_clave2 = "" ;
      A7899Dtp_DPQ = "" ;
      A7900Dtp_ForFab = "" ;
      A7903Dtp_ForRb = DecimalUtil.ZERO ;
      A7904Dtp_ForPhx = DecimalUtil.ZERO ;
      A7905Dtp_ForPhn = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      Z759ProDsc = "" ;
      Z4628ProDsc2 = "" ;
      T010F9_A407EmprNom = new String[] {""} ;
      T010F9_n407EmprNom = new boolean[] {false} ;
      T010F11_A759ProDsc = new String[] {""} ;
      T010F11_A4628ProDsc2 = new String[] {""} ;
      T010F12_A774ProNumLin = new short[1] ;
      T010F12_A759ProDsc = new String[] {""} ;
      T010F12_A4628ProDsc2 = new String[] {""} ;
      T010F12_A407EmprNom = new String[] {""} ;
      T010F12_n407EmprNom = new boolean[] {false} ;
      T010F12_A7892Dtp_FasDsc = new String[] {""} ;
      T010F12_n7892Dtp_FasDsc = new boolean[] {false} ;
      T010F12_A7911Dtp_UOrd = new short[1] ;
      T010F12_n7911Dtp_UOrd = new boolean[] {false} ;
      T010F12_A396EmprCod = new String[] {""} ;
      T010F12_A457FasCod = new String[] {""} ;
      T010F12_A758ProCod = new String[] {""} ;
      T010F10_A396EmprCod = new String[] {""} ;
      T010F13_A396EmprCod = new String[] {""} ;
      T010F14_A396EmprCod = new String[] {""} ;
      T010F14_A758ProCod = new String[] {""} ;
      T010F14_A774ProNumLin = new short[1] ;
      T010F8_A774ProNumLin = new short[1] ;
      T010F8_A7892Dtp_FasDsc = new String[] {""} ;
      T010F8_n7892Dtp_FasDsc = new boolean[] {false} ;
      T010F8_A7911Dtp_UOrd = new short[1] ;
      T010F8_n7911Dtp_UOrd = new boolean[] {false} ;
      T010F8_A396EmprCod = new String[] {""} ;
      T010F8_A457FasCod = new String[] {""} ;
      T010F8_A758ProCod = new String[] {""} ;
      T010F15_A396EmprCod = new String[] {""} ;
      T010F15_A758ProCod = new String[] {""} ;
      T010F15_A774ProNumLin = new short[1] ;
      T010F16_A396EmprCod = new String[] {""} ;
      T010F16_A758ProCod = new String[] {""} ;
      T010F16_A774ProNumLin = new short[1] ;
      T010F7_A774ProNumLin = new short[1] ;
      T010F7_A7892Dtp_FasDsc = new String[] {""} ;
      T010F7_n7892Dtp_FasDsc = new boolean[] {false} ;
      T010F7_A7911Dtp_UOrd = new short[1] ;
      T010F7_n7911Dtp_UOrd = new boolean[] {false} ;
      T010F7_A396EmprCod = new String[] {""} ;
      T010F7_A457FasCod = new String[] {""} ;
      T010F7_A758ProCod = new String[] {""} ;
      T010F20_A396EmprCod = new String[] {""} ;
      T010F20_A758ProCod = new String[] {""} ;
      T010F20_A774ProNumLin = new short[1] ;
      T010F20_A7897Dtp_Ordl = new short[1] ;
      T010F21_A396EmprCod = new String[] {""} ;
      T010F21_A758ProCod = new String[] {""} ;
      T010F21_A774ProNumLin = new short[1] ;
      T010F21_A6438ProFsaL = new short[1] ;
      T010F23_A396EmprCod = new String[] {""} ;
      T010F23_A758ProCod = new String[] {""} ;
      T010F23_A774ProNumLin = new short[1] ;
      T010F24_A758ProCod = new String[] {""} ;
      T010F24_A774ProNumLin = new short[1] ;
      T010F24_A7897Dtp_Ordl = new short[1] ;
      T010F24_A11933Dtp_Nh2o = new short[1] ;
      T010F24_n11933Dtp_Nh2o = new boolean[] {false} ;
      T010F24_A7898Dtp_CPQ = new String[] {""} ;
      T010F24_n7898Dtp_CPQ = new boolean[] {false} ;
      T010F24_A7900Dtp_ForFab = new String[] {""} ;
      T010F24_n7900Dtp_ForFab = new boolean[] {false} ;
      T010F24_A7901Dtp_Fortie = new short[1] ;
      T010F24_n7901Dtp_Fortie = new boolean[] {false} ;
      T010F24_A7902Dtp_ForTmx = new short[1] ;
      T010F24_n7902Dtp_ForTmx = new boolean[] {false} ;
      T010F24_A7903Dtp_ForRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010F24_n7903Dtp_ForRb = new boolean[] {false} ;
      T010F24_A7904Dtp_ForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010F24_n7904Dtp_ForPhx = new boolean[] {false} ;
      T010F24_A7905Dtp_ForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010F24_n7905Dtp_ForPhn = new boolean[] {false} ;
      T010F24_A7906Dtp_ForUli = new short[1] ;
      T010F24_n7906Dtp_ForUli = new boolean[] {false} ;
      T010F24_A396EmprCod = new String[] {""} ;
      T010F25_A396EmprCod = new String[] {""} ;
      T010F25_A758ProCod = new String[] {""} ;
      T010F25_A774ProNumLin = new short[1] ;
      T010F25_A7897Dtp_Ordl = new short[1] ;
      T010F6_A758ProCod = new String[] {""} ;
      T010F6_A774ProNumLin = new short[1] ;
      T010F6_A7897Dtp_Ordl = new short[1] ;
      T010F6_A11933Dtp_Nh2o = new short[1] ;
      T010F6_n11933Dtp_Nh2o = new boolean[] {false} ;
      T010F6_A7898Dtp_CPQ = new String[] {""} ;
      T010F6_n7898Dtp_CPQ = new boolean[] {false} ;
      T010F6_A7900Dtp_ForFab = new String[] {""} ;
      T010F6_n7900Dtp_ForFab = new boolean[] {false} ;
      T010F6_A7901Dtp_Fortie = new short[1] ;
      T010F6_n7901Dtp_Fortie = new boolean[] {false} ;
      T010F6_A7902Dtp_ForTmx = new short[1] ;
      T010F6_n7902Dtp_ForTmx = new boolean[] {false} ;
      T010F6_A7903Dtp_ForRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010F6_n7903Dtp_ForRb = new boolean[] {false} ;
      T010F6_A7904Dtp_ForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010F6_n7904Dtp_ForPhx = new boolean[] {false} ;
      T010F6_A7905Dtp_ForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010F6_n7905Dtp_ForPhn = new boolean[] {false} ;
      T010F6_A7906Dtp_ForUli = new short[1] ;
      T010F6_n7906Dtp_ForUli = new boolean[] {false} ;
      T010F6_A396EmprCod = new String[] {""} ;
      T010F5_A758ProCod = new String[] {""} ;
      T010F5_A774ProNumLin = new short[1] ;
      T010F5_A7897Dtp_Ordl = new short[1] ;
      T010F5_A11933Dtp_Nh2o = new short[1] ;
      T010F5_n11933Dtp_Nh2o = new boolean[] {false} ;
      T010F5_A7898Dtp_CPQ = new String[] {""} ;
      T010F5_n7898Dtp_CPQ = new boolean[] {false} ;
      T010F5_A7900Dtp_ForFab = new String[] {""} ;
      T010F5_n7900Dtp_ForFab = new boolean[] {false} ;
      T010F5_A7901Dtp_Fortie = new short[1] ;
      T010F5_n7901Dtp_Fortie = new boolean[] {false} ;
      T010F5_A7902Dtp_ForTmx = new short[1] ;
      T010F5_n7902Dtp_ForTmx = new boolean[] {false} ;
      T010F5_A7903Dtp_ForRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010F5_n7903Dtp_ForRb = new boolean[] {false} ;
      T010F5_A7904Dtp_ForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010F5_n7904Dtp_ForPhx = new boolean[] {false} ;
      T010F5_A7905Dtp_ForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010F5_n7905Dtp_ForPhn = new boolean[] {false} ;
      T010F5_A7906Dtp_ForUli = new short[1] ;
      T010F5_n7906Dtp_ForUli = new boolean[] {false} ;
      T010F5_A396EmprCod = new String[] {""} ;
      T010F29_A396EmprCod = new String[] {""} ;
      T010F29_A758ProCod = new String[] {""} ;
      T010F29_A774ProNumLin = new short[1] ;
      T010F29_A7897Dtp_Ordl = new short[1] ;
      T010F29_A1664ParFasCod = new short[1] ;
      T010F31_A396EmprCod = new String[] {""} ;
      T010F31_A758ProCod = new String[] {""} ;
      T010F31_A774ProNumLin = new short[1] ;
      T010F31_A7897Dtp_Ordl = new short[1] ;
      Z488ForPrdDsc = "" ;
      T010F32_A758ProCod = new String[] {""} ;
      T010F32_A774ProNumLin = new short[1] ;
      T010F32_A7897Dtp_Ordl = new short[1] ;
      T010F32_A7907Dtp_ForLin = new short[1] ;
      T010F32_A7908Dtp_Prdnum = new String[] {""} ;
      T010F32_n7908Dtp_Prdnum = new boolean[] {false} ;
      T010F32_A488ForPrdDsc = new String[] {""} ;
      T010F32_n488ForPrdDsc = new boolean[] {false} ;
      T010F32_A7910Dtp_Forcan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010F32_n7910Dtp_Forcan = new boolean[] {false} ;
      T010F32_A8475Dtp_clave1 = new String[] {""} ;
      T010F32_n8475Dtp_clave1 = new boolean[] {false} ;
      T010F32_A8476Dtp_clave2 = new String[] {""} ;
      T010F32_n8476Dtp_clave2 = new boolean[] {false} ;
      T010F32_A396EmprCod = new String[] {""} ;
      T010F32_A490ForPrdUMe = new byte[1] ;
      T010F32_n490ForPrdUMe = new boolean[] {false} ;
      T010F4_A488ForPrdDsc = new String[] {""} ;
      T010F4_n488ForPrdDsc = new boolean[] {false} ;
      T010F33_A488ForPrdDsc = new String[] {""} ;
      T010F33_n488ForPrdDsc = new boolean[] {false} ;
      T010F34_A396EmprCod = new String[] {""} ;
      T010F34_A758ProCod = new String[] {""} ;
      T010F34_A774ProNumLin = new short[1] ;
      T010F34_A7897Dtp_Ordl = new short[1] ;
      T010F34_A7907Dtp_ForLin = new short[1] ;
      T010F3_A758ProCod = new String[] {""} ;
      T010F3_A774ProNumLin = new short[1] ;
      T010F3_A7897Dtp_Ordl = new short[1] ;
      T010F3_A7907Dtp_ForLin = new short[1] ;
      T010F3_A7908Dtp_Prdnum = new String[] {""} ;
      T010F3_n7908Dtp_Prdnum = new boolean[] {false} ;
      T010F3_A7910Dtp_Forcan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010F3_n7910Dtp_Forcan = new boolean[] {false} ;
      T010F3_A8475Dtp_clave1 = new String[] {""} ;
      T010F3_n8475Dtp_clave1 = new boolean[] {false} ;
      T010F3_A8476Dtp_clave2 = new String[] {""} ;
      T010F3_n8476Dtp_clave2 = new boolean[] {false} ;
      T010F3_A396EmprCod = new String[] {""} ;
      T010F3_A490ForPrdUMe = new byte[1] ;
      T010F3_n490ForPrdUMe = new boolean[] {false} ;
      sMode1105 = "" ;
      T010F2_A758ProCod = new String[] {""} ;
      T010F2_A774ProNumLin = new short[1] ;
      T010F2_A7897Dtp_Ordl = new short[1] ;
      T010F2_A7907Dtp_ForLin = new short[1] ;
      T010F2_A7908Dtp_Prdnum = new String[] {""} ;
      T010F2_n7908Dtp_Prdnum = new boolean[] {false} ;
      T010F2_A7910Dtp_Forcan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010F2_n7910Dtp_Forcan = new boolean[] {false} ;
      T010F2_A8475Dtp_clave1 = new String[] {""} ;
      T010F2_n8475Dtp_clave1 = new boolean[] {false} ;
      T010F2_A8476Dtp_clave2 = new String[] {""} ;
      T010F2_n8476Dtp_clave2 = new boolean[] {false} ;
      T010F2_A396EmprCod = new String[] {""} ;
      T010F2_A490ForPrdUMe = new byte[1] ;
      T010F2_n490ForPrdUMe = new boolean[] {false} ;
      T010F38_A488ForPrdDsc = new String[] {""} ;
      T010F38_n488ForPrdDsc = new boolean[] {false} ;
      T010F39_A396EmprCod = new String[] {""} ;
      T010F39_A758ProCod = new String[] {""} ;
      T010F39_A774ProNumLin = new short[1] ;
      T010F39_A7897Dtp_Ordl = new short[1] ;
      T010F39_A7907Dtp_ForLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblTextblock10_Jsonclick = "" ;
      ROClassString = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      T010F40_A407EmprNom = new String[] {""} ;
      T010F40_n407EmprNom = new boolean[] {false} ;
      T010F41_A759ProDsc = new String[] {""} ;
      T010F41_A4628ProDsc2 = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ758ProCod = "" ;
      ZZ759ProDsc = "" ;
      ZZ4628ProDsc2 = "" ;
      ZZ407EmprNom = "" ;
      ZZ457FasCod = "" ;
      ZZ7892Dtp_FasDsc = "" ;
      T010F42_A396EmprCod = new String[] {""} ;
      Z7899Dtp_DPQ = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Z7909Dtp_PrdNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdt002__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdt002__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdt002__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdt002__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdt002__default(),
         new Object[] {
             new Object[] {
            T010F2_A758ProCod, T010F2_A774ProNumLin, T010F2_A7897Dtp_Ordl, T010F2_A7907Dtp_ForLin, T010F2_A7908Dtp_Prdnum, T010F2_n7908Dtp_Prdnum, T010F2_A7910Dtp_Forcan, T010F2_n7910Dtp_Forcan, T010F2_A8475Dtp_clave1, T010F2_n8475Dtp_clave1,
            T010F2_A8476Dtp_clave2, T010F2_n8476Dtp_clave2, T010F2_A396EmprCod, T010F2_A490ForPrdUMe, T010F2_n490ForPrdUMe
            }
            , new Object[] {
            T010F3_A758ProCod, T010F3_A774ProNumLin, T010F3_A7897Dtp_Ordl, T010F3_A7907Dtp_ForLin, T010F3_A7908Dtp_Prdnum, T010F3_n7908Dtp_Prdnum, T010F3_A7910Dtp_Forcan, T010F3_n7910Dtp_Forcan, T010F3_A8475Dtp_clave1, T010F3_n8475Dtp_clave1,
            T010F3_A8476Dtp_clave2, T010F3_n8476Dtp_clave2, T010F3_A396EmprCod, T010F3_A490ForPrdUMe, T010F3_n490ForPrdUMe
            }
            , new Object[] {
            T010F4_A488ForPrdDsc, T010F4_n488ForPrdDsc
            }
            , new Object[] {
            T010F5_A758ProCod, T010F5_A774ProNumLin, T010F5_A7897Dtp_Ordl, T010F5_A11933Dtp_Nh2o, T010F5_n11933Dtp_Nh2o, T010F5_A7898Dtp_CPQ, T010F5_n7898Dtp_CPQ, T010F5_A7900Dtp_ForFab, T010F5_n7900Dtp_ForFab, T010F5_A7901Dtp_Fortie,
            T010F5_n7901Dtp_Fortie, T010F5_A7902Dtp_ForTmx, T010F5_n7902Dtp_ForTmx, T010F5_A7903Dtp_ForRb, T010F5_n7903Dtp_ForRb, T010F5_A7904Dtp_ForPhx, T010F5_n7904Dtp_ForPhx, T010F5_A7905Dtp_ForPhn, T010F5_n7905Dtp_ForPhn, T010F5_A7906Dtp_ForUli,
            T010F5_n7906Dtp_ForUli, T010F5_A396EmprCod
            }
            , new Object[] {
            T010F6_A758ProCod, T010F6_A774ProNumLin, T010F6_A7897Dtp_Ordl, T010F6_A11933Dtp_Nh2o, T010F6_n11933Dtp_Nh2o, T010F6_A7898Dtp_CPQ, T010F6_n7898Dtp_CPQ, T010F6_A7900Dtp_ForFab, T010F6_n7900Dtp_ForFab, T010F6_A7901Dtp_Fortie,
            T010F6_n7901Dtp_Fortie, T010F6_A7902Dtp_ForTmx, T010F6_n7902Dtp_ForTmx, T010F6_A7903Dtp_ForRb, T010F6_n7903Dtp_ForRb, T010F6_A7904Dtp_ForPhx, T010F6_n7904Dtp_ForPhx, T010F6_A7905Dtp_ForPhn, T010F6_n7905Dtp_ForPhn, T010F6_A7906Dtp_ForUli,
            T010F6_n7906Dtp_ForUli, T010F6_A396EmprCod
            }
            , new Object[] {
            T010F7_A774ProNumLin, T010F7_A7892Dtp_FasDsc, T010F7_n7892Dtp_FasDsc, T010F7_A7911Dtp_UOrd, T010F7_n7911Dtp_UOrd, T010F7_A396EmprCod, T010F7_A457FasCod, T010F7_A758ProCod
            }
            , new Object[] {
            T010F8_A774ProNumLin, T010F8_A7892Dtp_FasDsc, T010F8_n7892Dtp_FasDsc, T010F8_A7911Dtp_UOrd, T010F8_n7911Dtp_UOrd, T010F8_A396EmprCod, T010F8_A457FasCod, T010F8_A758ProCod
            }
            , new Object[] {
            T010F9_A407EmprNom, T010F9_n407EmprNom
            }
            , new Object[] {
            T010F10_A396EmprCod
            }
            , new Object[] {
            T010F11_A759ProDsc, T010F11_A4628ProDsc2
            }
            , new Object[] {
            T010F12_A774ProNumLin, T010F12_A759ProDsc, T010F12_A4628ProDsc2, T010F12_A407EmprNom, T010F12_n407EmprNom, T010F12_A7892Dtp_FasDsc, T010F12_n7892Dtp_FasDsc, T010F12_A7911Dtp_UOrd, T010F12_n7911Dtp_UOrd, T010F12_A396EmprCod,
            T010F12_A457FasCod, T010F12_A758ProCod
            }
            , new Object[] {
            T010F13_A396EmprCod
            }
            , new Object[] {
            T010F14_A396EmprCod, T010F14_A758ProCod, T010F14_A774ProNumLin
            }
            , new Object[] {
            T010F15_A396EmprCod, T010F15_A758ProCod, T010F15_A774ProNumLin
            }
            , new Object[] {
            T010F16_A396EmprCod, T010F16_A758ProCod, T010F16_A774ProNumLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T010F20_A396EmprCod, T010F20_A758ProCod, T010F20_A774ProNumLin, T010F20_A7897Dtp_Ordl
            }
            , new Object[] {
            T010F21_A396EmprCod, T010F21_A758ProCod, T010F21_A774ProNumLin, T010F21_A6438ProFsaL
            }
            , new Object[] {
            }
            , new Object[] {
            T010F23_A396EmprCod, T010F23_A758ProCod, T010F23_A774ProNumLin
            }
            , new Object[] {
            T010F24_A758ProCod, T010F24_A774ProNumLin, T010F24_A7897Dtp_Ordl, T010F24_A11933Dtp_Nh2o, T010F24_n11933Dtp_Nh2o, T010F24_A7898Dtp_CPQ, T010F24_n7898Dtp_CPQ, T010F24_A7900Dtp_ForFab, T010F24_n7900Dtp_ForFab, T010F24_A7901Dtp_Fortie,
            T010F24_n7901Dtp_Fortie, T010F24_A7902Dtp_ForTmx, T010F24_n7902Dtp_ForTmx, T010F24_A7903Dtp_ForRb, T010F24_n7903Dtp_ForRb, T010F24_A7904Dtp_ForPhx, T010F24_n7904Dtp_ForPhx, T010F24_A7905Dtp_ForPhn, T010F24_n7905Dtp_ForPhn, T010F24_A7906Dtp_ForUli,
            T010F24_n7906Dtp_ForUli, T010F24_A396EmprCod
            }
            , new Object[] {
            T010F25_A396EmprCod, T010F25_A758ProCod, T010F25_A774ProNumLin, T010F25_A7897Dtp_Ordl
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T010F29_A396EmprCod, T010F29_A758ProCod, T010F29_A774ProNumLin, T010F29_A7897Dtp_Ordl, T010F29_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            T010F31_A396EmprCod, T010F31_A758ProCod, T010F31_A774ProNumLin, T010F31_A7897Dtp_Ordl
            }
            , new Object[] {
            T010F32_A758ProCod, T010F32_A774ProNumLin, T010F32_A7897Dtp_Ordl, T010F32_A7907Dtp_ForLin, T010F32_A7908Dtp_Prdnum, T010F32_n7908Dtp_Prdnum, T010F32_A488ForPrdDsc, T010F32_n488ForPrdDsc, T010F32_A7910Dtp_Forcan, T010F32_n7910Dtp_Forcan,
            T010F32_A8475Dtp_clave1, T010F32_n8475Dtp_clave1, T010F32_A8476Dtp_clave2, T010F32_n8476Dtp_clave2, T010F32_A396EmprCod, T010F32_A490ForPrdUMe, T010F32_n490ForPrdUMe
            }
            , new Object[] {
            T010F33_A488ForPrdDsc, T010F33_n488ForPrdDsc
            }
            , new Object[] {
            T010F34_A396EmprCod, T010F34_A758ProCod, T010F34_A774ProNumLin, T010F34_A7897Dtp_Ordl, T010F34_A7907Dtp_ForLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T010F38_A488ForPrdDsc, T010F38_n488ForPrdDsc
            }
            , new Object[] {
            T010F39_A396EmprCod, T010F39_A758ProCod, T010F39_A774ProNumLin, T010F39_A7897Dtp_Ordl, T010F39_A7907Dtp_ForLin
            }
            , new Object[] {
            T010F40_A407EmprNom, T010F40_n407EmprNom
            }
            , new Object[] {
            T010F41_A759ProDsc, T010F41_A4628ProDsc2
            }
            , new Object[] {
            T010F42_A396EmprCod
            }
         }
      );
      Z774ProNumLin = (short)(0) ;
      A774ProNumLin = (short)(0) ;
      Z758ProCod = "" ;
      A758ProCod = "" ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TDT002" ;
      Z11933Dtp_Nh2o = (short)(1) ;
      n11933Dtp_Nh2o = false ;
      A11933Dtp_Nh2o = (short)(1) ;
      n11933Dtp_Nh2o = false ;
      i11933Dtp_Nh2o = (short)(1) ;
      n11933Dtp_Nh2o = false ;
   }

   private byte Z490ForPrdUMe ;
   private byte GxWebError ;
   private byte A490ForPrdUMe ;
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
   private short wcpOA774ProNumLin ;
   private short Z774ProNumLin ;
   private short Z7911Dtp_UOrd ;
   private short O7911Dtp_UOrd ;
   private short Z7897Dtp_Ordl ;
   private short Z11933Dtp_Nh2o ;
   private short Z7901Dtp_Fortie ;
   private short Z7902Dtp_ForTmx ;
   private short Z7906Dtp_ForUli ;
   private short O7906Dtp_ForUli ;
   private short nRcdDeleted_1104 ;
   private short nRcdExists_1104 ;
   private short nIsMod_1104 ;
   private short Z7907Dtp_ForLin ;
   private short nRcdDeleted_1105 ;
   private short nRcdExists_1105 ;
   private short nIsMod_1105 ;
   private short A774ProNumLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A7911Dtp_UOrd ;
   private short A7906Dtp_ForUli ;
   private short nBlankRcdCount1104 ;
   private short RcdFound1104 ;
   private short B7911Dtp_UOrd ;
   private short nBlankRcdUsr1104 ;
   private short s7906Dtp_ForUli ;
   private short RcdFound1105 ;
   private short A7907Dtp_ForLin ;
   private short s7911Dtp_UOrd ;
   private short A7897Dtp_Ordl ;
   private short A7901Dtp_Fortie ;
   private short A7902Dtp_ForTmx ;
   private short A11933Dtp_Nh2o ;
   private short T7906Dtp_ForUli ;
   private short RcdFound88 ;
   private short nIsDirty_88 ;
   private short nIsDirty_1104 ;
   private short nIsDirty_1105 ;
   private short nBlankRcdCount1105 ;
   private short B7906Dtp_ForUli ;
   private short nBlankRcdUsr1105 ;
   private short i7911Dtp_UOrd ;
   private short i11933Dtp_Nh2o ;
   private short i7906Dtp_ForUli ;
   private short subGrid1_Borderwidth ;
   private short ZZ774ProNumLin ;
   private short ZZ7911Dtp_UOrd ;
   private short ZO7911Dtp_UOrd ;
   private int nRC_GXsfl_65 ;
   private int nGXsfl_65_idx=1 ;
   private int nRC_GXsfl_127 ;
   private int nGXsfl_127_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtProCod_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtProDsc2_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtProNumLin_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtDtp_FasDsc_Enabled ;
   private int edtDtp_UOrd_Enabled ;
   private int edtDtp_Ordl_Enabled ;
   private int edtDtp_CPQ_Enabled ;
   private int edtDtp_DPQ_Enabled ;
   private int edtDtp_ForFab_Enabled ;
   private int edtDtp_Fortie_Enabled ;
   private int edtDtp_ForTmx_Enabled ;
   private int edtDtp_ForRb_Enabled ;
   private int edtDtp_ForPhx_Enabled ;
   private int edtDtp_ForPhn_Enabled ;
   private int edtDtp_ForUli_Enabled ;
   private int edtDtp_Nh2o_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int edtavnRcdDeleted_1105_Enabled ;
   private int edtDtp_ForLin_Enabled ;
   private int edtDtp_Prdnum_Enabled ;
   private int edtDtp_PrdNom_Enabled ;
   private int edtForPrdUMe_Enabled ;
   private int edtForPrdDsc_Enabled ;
   private int edtDtp_Forcan_Enabled ;
   private int edtDtp_clave1_Enabled ;
   private int edtDtp_clave2_Enabled ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtDtp_ForLin_Enabled ;
   private int defedtDtp_ForUli_Enabled ;
   private int defedtDtp_Ordl_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtDtp_UOrd_Backcolor ;
   private int edtDtp_FasDsc_Backcolor ;
   private int edtFasCod_Backcolor ;
   private int edtProNumLin_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtProDsc2_Backcolor ;
   private int edtProDsc_Backcolor ;
   private int edtProCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private java.math.BigDecimal Z7903Dtp_ForRb ;
   private java.math.BigDecimal Z7904Dtp_ForPhx ;
   private java.math.BigDecimal Z7905Dtp_ForPhn ;
   private java.math.BigDecimal Z7910Dtp_Forcan ;
   private java.math.BigDecimal A7910Dtp_Forcan ;
   private java.math.BigDecimal A7903Dtp_ForRb ;
   private java.math.BigDecimal A7904Dtp_ForPhx ;
   private java.math.BigDecimal A7905Dtp_ForPhn ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA758ProCod ;
   private String Z396EmprCod ;
   private String Z758ProCod ;
   private String Z7892Dtp_FasDsc ;
   private String Z457FasCod ;
   private String Z7898Dtp_CPQ ;
   private String Z7900Dtp_ForFab ;
   private String Z7908Dtp_Prdnum ;
   private String Z8475Dtp_clave1 ;
   private String Z8476Dtp_clave2 ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A7898Dtp_CPQ ;
   private String A7908Dtp_Prdnum ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtFasCod_Internalname ;
   private String sGXsfl_65_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_127_idx="0001" ;
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
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtProDsc2_Internalname ;
   private String A4628ProDsc2 ;
   private String edtProDsc2_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtProNumLin_Internalname ;
   private String edtProNumLin_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtDtp_FasDsc_Internalname ;
   private String A7892Dtp_FasDsc ;
   private String edtDtp_FasDsc_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtDtp_UOrd_Internalname ;
   private String edtDtp_UOrd_Jsonclick ;
   private String sMode1104 ;
   private String edtDtp_Ordl_Internalname ;
   private String edtDtp_CPQ_Internalname ;
   private String edtDtp_DPQ_Internalname ;
   private String edtDtp_ForFab_Internalname ;
   private String edtDtp_Fortie_Internalname ;
   private String edtDtp_ForTmx_Internalname ;
   private String edtDtp_ForRb_Internalname ;
   private String edtDtp_ForPhx_Internalname ;
   private String edtDtp_ForPhn_Internalname ;
   private String edtDtp_ForUli_Internalname ;
   private String edtDtp_Nh2o_Internalname ;
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
   private String edtavnRcdDeleted_1105_Internalname ;
   private String sMode88 ;
   private String GXCCtl ;
   private String edtDtp_ForLin_Internalname ;
   private String edtDtp_Prdnum_Internalname ;
   private String edtDtp_PrdNom_Internalname ;
   private String A7909Dtp_PrdNom ;
   private String edtForPrdUMe_Internalname ;
   private String edtForPrdDsc_Internalname ;
   private String A488ForPrdDsc ;
   private String edtDtp_Forcan_Internalname ;
   private String edtDtp_clave1_Internalname ;
   private String A8475Dtp_clave1 ;
   private String edtDtp_clave2_Internalname ;
   private String A8476Dtp_clave2 ;
   private String A7899Dtp_DPQ ;
   private String A7900Dtp_ForFab ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z759ProDsc ;
   private String Z4628ProDsc2 ;
   private String Z488ForPrdDsc ;
   private String sMode1105 ;
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
   private String lblTextblock20_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_65_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable3_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String ROClassString ;
   private String edtDtp_Ordl_Jsonclick ;
   private String lblTextblock11_Jsonclick ;
   private String edtDtp_CPQ_Jsonclick ;
   private String lblTextblock12_Jsonclick ;
   private String edtDtp_DPQ_Jsonclick ;
   private String lblTextblock13_Jsonclick ;
   private String edtDtp_ForFab_Jsonclick ;
   private String lblTextblock14_Jsonclick ;
   private String edtDtp_Fortie_Jsonclick ;
   private String lblTextblock15_Jsonclick ;
   private String edtDtp_ForTmx_Jsonclick ;
   private String lblTextblock16_Jsonclick ;
   private String edtDtp_ForRb_Jsonclick ;
   private String lblTextblock17_Jsonclick ;
   private String edtDtp_ForPhx_Jsonclick ;
   private String lblTextblock18_Jsonclick ;
   private String edtDtp_ForPhn_Jsonclick ;
   private String lblTextblock19_Jsonclick ;
   private String edtDtp_ForUli_Jsonclick ;
   private String lblTextblock20_Jsonclick ;
   private String edtDtp_Nh2o_Jsonclick ;
   private String sGXsfl_127_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_1105_Jsonclick ;
   private String edtDtp_ForLin_Jsonclick ;
   private String edtDtp_Prdnum_Jsonclick ;
   private String edtDtp_PrdNom_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtDtp_Forcan_Jsonclick ;
   private String edtDtp_clave1_Jsonclick ;
   private String edtDtp_clave2_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
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
   private String lblTextblock20_Caption ;
   private String subGrid2_Header ;
   private String ZZ396EmprCod ;
   private String ZZ758ProCod ;
   private String ZZ759ProDsc ;
   private String ZZ4628ProDsc2 ;
   private String ZZ407EmprNom ;
   private String ZZ457FasCod ;
   private String ZZ7892Dtp_FasDsc ;
   private String Z7899Dtp_DPQ ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z7909Dtp_PrdNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n7898Dtp_CPQ ;
   private boolean n7908Dtp_Prdnum ;
   private boolean n490ForPrdUMe ;
   private boolean wbErr ;
   private boolean n7911Dtp_UOrd ;
   private boolean n7906Dtp_ForUli ;
   private boolean bGXsfl_65_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n7892Dtp_FasDsc ;
   private boolean bGXsfl_127_Refreshing=false ;
   private boolean returnInSub ;
   private boolean n11933Dtp_Nh2o ;
   private boolean n7900Dtp_ForFab ;
   private boolean n7901Dtp_Fortie ;
   private boolean n7902Dtp_ForTmx ;
   private boolean n7903Dtp_ForRb ;
   private boolean n7904Dtp_ForPhx ;
   private boolean n7905Dtp_ForPhn ;
   private boolean Gx_longc ;
   private boolean n488ForPrdDsc ;
   private boolean n7910Dtp_Forcan ;
   private boolean n8475Dtp_clave1 ;
   private boolean n8476Dtp_clave2 ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private IDataStoreProvider pr_default ;
   private String[] T010F9_A407EmprNom ;
   private boolean[] T010F9_n407EmprNom ;
   private String[] T010F11_A759ProDsc ;
   private String[] T010F11_A4628ProDsc2 ;
   private short[] T010F12_A774ProNumLin ;
   private String[] T010F12_A759ProDsc ;
   private String[] T010F12_A4628ProDsc2 ;
   private String[] T010F12_A407EmprNom ;
   private boolean[] T010F12_n407EmprNom ;
   private String[] T010F12_A7892Dtp_FasDsc ;
   private boolean[] T010F12_n7892Dtp_FasDsc ;
   private short[] T010F12_A7911Dtp_UOrd ;
   private boolean[] T010F12_n7911Dtp_UOrd ;
   private String[] T010F12_A396EmprCod ;
   private String[] T010F12_A457FasCod ;
   private String[] T010F12_A758ProCod ;
   private String[] T010F10_A396EmprCod ;
   private String[] T010F13_A396EmprCod ;
   private String[] T010F14_A396EmprCod ;
   private String[] T010F14_A758ProCod ;
   private short[] T010F14_A774ProNumLin ;
   private short[] T010F8_A774ProNumLin ;
   private String[] T010F8_A7892Dtp_FasDsc ;
   private boolean[] T010F8_n7892Dtp_FasDsc ;
   private short[] T010F8_A7911Dtp_UOrd ;
   private boolean[] T010F8_n7911Dtp_UOrd ;
   private String[] T010F8_A396EmprCod ;
   private String[] T010F8_A457FasCod ;
   private String[] T010F8_A758ProCod ;
   private String[] T010F15_A396EmprCod ;
   private String[] T010F15_A758ProCod ;
   private short[] T010F15_A774ProNumLin ;
   private String[] T010F16_A396EmprCod ;
   private String[] T010F16_A758ProCod ;
   private short[] T010F16_A774ProNumLin ;
   private short[] T010F7_A774ProNumLin ;
   private String[] T010F7_A7892Dtp_FasDsc ;
   private boolean[] T010F7_n7892Dtp_FasDsc ;
   private short[] T010F7_A7911Dtp_UOrd ;
   private boolean[] T010F7_n7911Dtp_UOrd ;
   private String[] T010F7_A396EmprCod ;
   private String[] T010F7_A457FasCod ;
   private String[] T010F7_A758ProCod ;
   private String[] T010F20_A396EmprCod ;
   private String[] T010F20_A758ProCod ;
   private short[] T010F20_A774ProNumLin ;
   private short[] T010F20_A7897Dtp_Ordl ;
   private String[] T010F21_A396EmprCod ;
   private String[] T010F21_A758ProCod ;
   private short[] T010F21_A774ProNumLin ;
   private short[] T010F21_A6438ProFsaL ;
   private String[] T010F23_A396EmprCod ;
   private String[] T010F23_A758ProCod ;
   private short[] T010F23_A774ProNumLin ;
   private String[] T010F24_A758ProCod ;
   private short[] T010F24_A774ProNumLin ;
   private short[] T010F24_A7897Dtp_Ordl ;
   private short[] T010F24_A11933Dtp_Nh2o ;
   private boolean[] T010F24_n11933Dtp_Nh2o ;
   private String[] T010F24_A7898Dtp_CPQ ;
   private boolean[] T010F24_n7898Dtp_CPQ ;
   private String[] T010F24_A7900Dtp_ForFab ;
   private boolean[] T010F24_n7900Dtp_ForFab ;
   private short[] T010F24_A7901Dtp_Fortie ;
   private boolean[] T010F24_n7901Dtp_Fortie ;
   private short[] T010F24_A7902Dtp_ForTmx ;
   private boolean[] T010F24_n7902Dtp_ForTmx ;
   private java.math.BigDecimal[] T010F24_A7903Dtp_ForRb ;
   private boolean[] T010F24_n7903Dtp_ForRb ;
   private java.math.BigDecimal[] T010F24_A7904Dtp_ForPhx ;
   private boolean[] T010F24_n7904Dtp_ForPhx ;
   private java.math.BigDecimal[] T010F24_A7905Dtp_ForPhn ;
   private boolean[] T010F24_n7905Dtp_ForPhn ;
   private short[] T010F24_A7906Dtp_ForUli ;
   private boolean[] T010F24_n7906Dtp_ForUli ;
   private String[] T010F24_A396EmprCod ;
   private String[] T010F25_A396EmprCod ;
   private String[] T010F25_A758ProCod ;
   private short[] T010F25_A774ProNumLin ;
   private short[] T010F25_A7897Dtp_Ordl ;
   private String[] T010F6_A758ProCod ;
   private short[] T010F6_A774ProNumLin ;
   private short[] T010F6_A7897Dtp_Ordl ;
   private short[] T010F6_A11933Dtp_Nh2o ;
   private boolean[] T010F6_n11933Dtp_Nh2o ;
   private String[] T010F6_A7898Dtp_CPQ ;
   private boolean[] T010F6_n7898Dtp_CPQ ;
   private String[] T010F6_A7900Dtp_ForFab ;
   private boolean[] T010F6_n7900Dtp_ForFab ;
   private short[] T010F6_A7901Dtp_Fortie ;
   private boolean[] T010F6_n7901Dtp_Fortie ;
   private short[] T010F6_A7902Dtp_ForTmx ;
   private boolean[] T010F6_n7902Dtp_ForTmx ;
   private java.math.BigDecimal[] T010F6_A7903Dtp_ForRb ;
   private boolean[] T010F6_n7903Dtp_ForRb ;
   private java.math.BigDecimal[] T010F6_A7904Dtp_ForPhx ;
   private boolean[] T010F6_n7904Dtp_ForPhx ;
   private java.math.BigDecimal[] T010F6_A7905Dtp_ForPhn ;
   private boolean[] T010F6_n7905Dtp_ForPhn ;
   private short[] T010F6_A7906Dtp_ForUli ;
   private boolean[] T010F6_n7906Dtp_ForUli ;
   private String[] T010F6_A396EmprCod ;
   private String[] T010F5_A758ProCod ;
   private short[] T010F5_A774ProNumLin ;
   private short[] T010F5_A7897Dtp_Ordl ;
   private short[] T010F5_A11933Dtp_Nh2o ;
   private boolean[] T010F5_n11933Dtp_Nh2o ;
   private String[] T010F5_A7898Dtp_CPQ ;
   private boolean[] T010F5_n7898Dtp_CPQ ;
   private String[] T010F5_A7900Dtp_ForFab ;
   private boolean[] T010F5_n7900Dtp_ForFab ;
   private short[] T010F5_A7901Dtp_Fortie ;
   private boolean[] T010F5_n7901Dtp_Fortie ;
   private short[] T010F5_A7902Dtp_ForTmx ;
   private boolean[] T010F5_n7902Dtp_ForTmx ;
   private java.math.BigDecimal[] T010F5_A7903Dtp_ForRb ;
   private boolean[] T010F5_n7903Dtp_ForRb ;
   private java.math.BigDecimal[] T010F5_A7904Dtp_ForPhx ;
   private boolean[] T010F5_n7904Dtp_ForPhx ;
   private java.math.BigDecimal[] T010F5_A7905Dtp_ForPhn ;
   private boolean[] T010F5_n7905Dtp_ForPhn ;
   private short[] T010F5_A7906Dtp_ForUli ;
   private boolean[] T010F5_n7906Dtp_ForUli ;
   private String[] T010F5_A396EmprCod ;
   private String[] T010F29_A396EmprCod ;
   private String[] T010F29_A758ProCod ;
   private short[] T010F29_A774ProNumLin ;
   private short[] T010F29_A7897Dtp_Ordl ;
   private short[] T010F29_A1664ParFasCod ;
   private String[] T010F31_A396EmprCod ;
   private String[] T010F31_A758ProCod ;
   private short[] T010F31_A774ProNumLin ;
   private short[] T010F31_A7897Dtp_Ordl ;
   private String[] T010F32_A758ProCod ;
   private short[] T010F32_A774ProNumLin ;
   private short[] T010F32_A7897Dtp_Ordl ;
   private short[] T010F32_A7907Dtp_ForLin ;
   private String[] T010F32_A7908Dtp_Prdnum ;
   private boolean[] T010F32_n7908Dtp_Prdnum ;
   private String[] T010F32_A488ForPrdDsc ;
   private boolean[] T010F32_n488ForPrdDsc ;
   private java.math.BigDecimal[] T010F32_A7910Dtp_Forcan ;
   private boolean[] T010F32_n7910Dtp_Forcan ;
   private String[] T010F32_A8475Dtp_clave1 ;
   private boolean[] T010F32_n8475Dtp_clave1 ;
   private String[] T010F32_A8476Dtp_clave2 ;
   private boolean[] T010F32_n8476Dtp_clave2 ;
   private String[] T010F32_A396EmprCod ;
   private byte[] T010F32_A490ForPrdUMe ;
   private boolean[] T010F32_n490ForPrdUMe ;
   private String[] T010F4_A488ForPrdDsc ;
   private boolean[] T010F4_n488ForPrdDsc ;
   private String[] T010F33_A488ForPrdDsc ;
   private boolean[] T010F33_n488ForPrdDsc ;
   private String[] T010F34_A396EmprCod ;
   private String[] T010F34_A758ProCod ;
   private short[] T010F34_A774ProNumLin ;
   private short[] T010F34_A7897Dtp_Ordl ;
   private short[] T010F34_A7907Dtp_ForLin ;
   private String[] T010F3_A758ProCod ;
   private short[] T010F3_A774ProNumLin ;
   private short[] T010F3_A7897Dtp_Ordl ;
   private short[] T010F3_A7907Dtp_ForLin ;
   private String[] T010F3_A7908Dtp_Prdnum ;
   private boolean[] T010F3_n7908Dtp_Prdnum ;
   private java.math.BigDecimal[] T010F3_A7910Dtp_Forcan ;
   private boolean[] T010F3_n7910Dtp_Forcan ;
   private String[] T010F3_A8475Dtp_clave1 ;
   private boolean[] T010F3_n8475Dtp_clave1 ;
   private String[] T010F3_A8476Dtp_clave2 ;
   private boolean[] T010F3_n8476Dtp_clave2 ;
   private String[] T010F3_A396EmprCod ;
   private byte[] T010F3_A490ForPrdUMe ;
   private boolean[] T010F3_n490ForPrdUMe ;
   private String[] T010F2_A758ProCod ;
   private short[] T010F2_A774ProNumLin ;
   private short[] T010F2_A7897Dtp_Ordl ;
   private short[] T010F2_A7907Dtp_ForLin ;
   private String[] T010F2_A7908Dtp_Prdnum ;
   private boolean[] T010F2_n7908Dtp_Prdnum ;
   private java.math.BigDecimal[] T010F2_A7910Dtp_Forcan ;
   private boolean[] T010F2_n7910Dtp_Forcan ;
   private String[] T010F2_A8475Dtp_clave1 ;
   private boolean[] T010F2_n8475Dtp_clave1 ;
   private String[] T010F2_A8476Dtp_clave2 ;
   private boolean[] T010F2_n8476Dtp_clave2 ;
   private String[] T010F2_A396EmprCod ;
   private byte[] T010F2_A490ForPrdUMe ;
   private boolean[] T010F2_n490ForPrdUMe ;
   private String[] T010F38_A488ForPrdDsc ;
   private boolean[] T010F38_n488ForPrdDsc ;
   private String[] T010F39_A396EmprCod ;
   private String[] T010F39_A758ProCod ;
   private short[] T010F39_A774ProNumLin ;
   private short[] T010F39_A7897Dtp_Ordl ;
   private short[] T010F39_A7907Dtp_ForLin ;
   private String[] T010F40_A407EmprNom ;
   private boolean[] T010F40_n407EmprNom ;
   private String[] T010F41_A759ProDsc ;
   private String[] T010F41_A4628ProDsc2 ;
   private String[] T010F42_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdt002__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdt002__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdt002__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdt002__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdt002__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T010F2", "SELECT ProCod, ProNumLin, Dtp_Ordl, Dtp_ForLin, Dtp_Prdnum, Dtp_Forcan, Dtp_clave1, Dtp_clave2, EmprCod, ForPrdUMe FROM TXPDT0021 WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? AND Dtp_Ordl = ? AND Dtp_ForLin = ?  FOR UPDATE OF Dtp_Prdnum, Dtp_Forcan, Dtp_clave1, Dtp_clave2, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010F3", "SELECT ProCod, ProNumLin, Dtp_Ordl, Dtp_ForLin, Dtp_Prdnum, Dtp_Forcan, Dtp_clave1, Dtp_clave2, EmprCod, ForPrdUMe FROM TXPDT0021 WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? AND Dtp_Ordl = ? AND Dtp_ForLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010F4", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010F5", "SELECT ProCod, ProNumLin, Dtp_Ordl, Dtp_Nh2o, Dtp_CPQ, Dtp_ForFab, Dtp_Fortie, Dtp_ForTmx, Dtp_ForRb, Dtp_ForPhx, Dtp_ForPhn, Dtp_ForUli, EmprCod FROM TXPDT002 WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? AND Dtp_Ordl = ?  FOR UPDATE OF Dtp_Nh2o, Dtp_CPQ, Dtp_ForFab, Dtp_Fortie, Dtp_ForTmx, Dtp_ForRb, Dtp_ForPhx, Dtp_ForPhn, Dtp_ForUli NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010F6", "SELECT ProCod, ProNumLin, Dtp_Ordl, Dtp_Nh2o, Dtp_CPQ, Dtp_ForFab, Dtp_Fortie, Dtp_ForTmx, Dtp_ForRb, Dtp_ForPhx, Dtp_ForPhn, Dtp_ForUli, EmprCod FROM TXPDT002 WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? AND Dtp_Ordl = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010F7", "SELECT ProNumLin, Dtp_FasDsc, Dtp_UOrd, EmprCod, FasCod, ProCod FROM TXPPROLIN WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?  FOR UPDATE OF Dtp_FasDsc, Dtp_UOrd, FasCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010F8", "SELECT ProNumLin, Dtp_FasDsc, Dtp_UOrd, EmprCod, FasCod, ProCod FROM TXPPROLIN WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010F9", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010F10", "SELECT EmprCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010F11", "SELECT ProDsc, ProDsc2 FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010F12", "SELECT /*+ FIRST_ROWS(1) */ TM1.ProNumLin, T3.ProDsc, T3.ProDsc2, T2.EmprNom, TM1.Dtp_FasDsc, TM1.Dtp_UOrd, TM1.EmprCod, TM1.FasCod, TM1.ProCod FROM ((TXPPROLIN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = TM1.EmprCod AND T3.ProCod = TM1.ProCod) WHERE TM1.EmprCod = ? and TM1.ProCod = ? and TM1.ProNumLin = ? ORDER BY TM1.EmprCod, TM1.ProCod, TM1.ProNumLin ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010F13", "SELECT EmprCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010F14", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProCod, ProNumLin FROM TXPPROLIN WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010F15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProCod, ProNumLin FROM TXPPROLIN WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? ORDER BY EmprCod, ProCod, ProNumLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010F16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProCod, ProNumLin FROM TXPPROLIN WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? ORDER BY EmprCod DESC, ProCod DESC, ProNumLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T010F17", "INSERT INTO TXPPROLIN(ProNumLin, Dtp_FasDsc, Dtp_UOrd, EmprCod, FasCod, ProCod, ProFasNot, ProUltFP, Dtp_Tpp, Dtp_H2OReh, Dtp_TpCost, Dtp_UnpLt) VALUES(?, ?, ?, ?, ?, ?, ' ', 0, 0, ' ', 0, 0)", GX_NOMASK, "TXPPROLIN")
         ,new UpdateCursor("T010F18", "UPDATE TXPPROLIN SET Dtp_FasDsc=?, Dtp_UOrd=?, FasCod=?  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?", GX_NOMASK, "TXPPROLIN")
         ,new UpdateCursor("T010F19", "DELETE FROM TXPPROLIN  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?", GX_NOMASK, "TXPPROLIN")
         ,new ForEachCursor("T010F20", "SELECT * FROM (SELECT EmprCod, ProCod, ProNumLin, Dtp_Ordl FROM TXPDT002 WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010F21", "SELECT * FROM (SELECT EmprCod, ProCod, ProNumLin, ProFsaL FROM TXPPROFSA WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T010F22", "UPDATE TXPPROLIN SET Dtp_UOrd=?  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?", GX_NOMASK, "TXPPROLIN")
         ,new ForEachCursor("T010F23", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ProCod, ProNumLin FROM TXPPROLIN WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? ORDER BY EmprCod, ProCod, ProNumLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010F24", "SELECT ProCod, ProNumLin, Dtp_Ordl, Dtp_Nh2o, Dtp_CPQ, Dtp_ForFab, Dtp_Fortie, Dtp_ForTmx, Dtp_ForRb, Dtp_ForPhx, Dtp_ForPhn, Dtp_ForUli, EmprCod FROM TXPDT002 WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? and Dtp_Ordl = ? ORDER BY EmprCod, ProCod, ProNumLin, Dtp_Ordl ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010F25", "SELECT EmprCod, ProCod, ProNumLin, Dtp_Ordl FROM TXPDT002 WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? AND Dtp_Ordl = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T010F26", "INSERT INTO TXPDT002(ProCod, ProNumLin, Dtp_Ordl, Dtp_Nh2o, Dtp_CPQ, Dtp_ForFab, Dtp_Fortie, Dtp_ForTmx, Dtp_ForRb, Dtp_ForPhx, Dtp_ForPhn, Dtp_ForUli, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDT002")
         ,new UpdateCursor("T010F27", "UPDATE TXPDT002 SET Dtp_Nh2o=?, Dtp_CPQ=?, Dtp_ForFab=?, Dtp_Fortie=?, Dtp_ForTmx=?, Dtp_ForRb=?, Dtp_ForPhx=?, Dtp_ForPhn=?, Dtp_ForUli=?  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? AND Dtp_Ordl = ?", GX_NOMASK, "TXPDT002")
         ,new UpdateCursor("T010F28", "DELETE FROM TXPDT002  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? AND Dtp_Ordl = ?", GX_NOMASK, "TXPDT002")
         ,new ForEachCursor("T010F29", "SELECT * FROM (SELECT EmprCod, ProCod, ProNumLin, Dtp_Ordl, ParFasCod FROM TXPDT0022 WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? AND Dtp_Ordl = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T010F30", "UPDATE TXPDT002 SET Dtp_ForUli=?  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? AND Dtp_Ordl = ?", GX_NOMASK, "TXPDT002")
         ,new ForEachCursor("T010F31", "SELECT EmprCod, ProCod, ProNumLin, Dtp_Ordl FROM TXPDT002 WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? ORDER BY EmprCod, ProCod, ProNumLin, Dtp_Ordl ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010F32", "SELECT T1.ProCod, T1.ProNumLin, T1.Dtp_Ordl, T1.Dtp_ForLin, T1.Dtp_Prdnum, T2.ForPrdDsc, T1.Dtp_Forcan, T1.Dtp_clave1, T1.Dtp_clave2, T1.EmprCod, T1.ForPrdUMe FROM (TXPDT0021 T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.ProCod = ? and T1.ProNumLin = ? and T1.Dtp_Ordl = ? and T1.Dtp_ForLin = ? ORDER BY T1.EmprCod, T1.ProCod, T1.ProNumLin, T1.Dtp_Ordl, T1.Dtp_ForLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010F33", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010F34", "SELECT EmprCod, ProCod, ProNumLin, Dtp_Ordl, Dtp_ForLin FROM TXPDT0021 WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? AND Dtp_Ordl = ? AND Dtp_ForLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T010F35", "INSERT INTO TXPDT0021(ProCod, ProNumLin, Dtp_Ordl, Dtp_ForLin, Dtp_Prdnum, Dtp_Forcan, Dtp_clave1, Dtp_clave2, EmprCod, ForPrdUMe) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDT0021")
         ,new UpdateCursor("T010F36", "UPDATE TXPDT0021 SET Dtp_Prdnum=?, Dtp_Forcan=?, Dtp_clave1=?, Dtp_clave2=?, ForPrdUMe=?  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? AND Dtp_Ordl = ? AND Dtp_ForLin = ?", GX_NOMASK, "TXPDT0021")
         ,new UpdateCursor("T010F37", "DELETE FROM TXPDT0021  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? AND Dtp_Ordl = ? AND Dtp_ForLin = ?", GX_NOMASK, "TXPDT0021")
         ,new ForEachCursor("T010F38", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010F39", "SELECT EmprCod, ProCod, ProNumLin, Dtp_Ordl, Dtp_ForLin FROM TXPDT0021 WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? and Dtp_Ordl = ? ORDER BY EmprCod, ProCod, ProNumLin, Dtp_Ordl, Dtp_ForLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010F40", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010F41", "SELECT ProDsc, ProDsc2 FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010F42", "SELECT EmprCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 3);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 90);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((String[]) buf[6])[0] = rslt.getString(5, 8);
               ((String[]) buf[7])[0] = rslt.getString(6, 8);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 90);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((String[]) buf[6])[0] = rslt.getString(5, 8);
               ((String[]) buf[7])[0] = rslt.getString(6, 8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 90);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               ((String[]) buf[10])[0] = rslt.getString(8, 8);
               ((String[]) buf[11])[0] = rslt.getString(9, 8);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 3);
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
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
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 15 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 90);
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
               stmt.setString(5, (String)parms[6], 8);
               stmt.setString(6, (String)parms[7], 8);
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 90);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               stmt.setString(3, (String)parms[4], 8);
               stmt.setString(4, (String)parms[5], 3);
               stmt.setString(5, (String)parms[6], 8);
               stmt.setShort(6, ((Number) parms[7]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 8);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 6);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[20]).shortValue());
               }
               stmt.setString(13, (String)parms[21], 3);
               return;
            case 25 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 6);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
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
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 2);
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
               stmt.setString(11, (String)parms[19], 8);
               stmt.setShort(12, ((Number) parms[20]).shortValue());
               stmt.setShort(13, ((Number) parms[21]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 28 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 8);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 31 :
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
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 5);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 16);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 30);
               }
               stmt.setString(9, (String)parms[12], 3);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[14]).byteValue());
               }
               return;
            case 34 :
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
               stmt.setString(7, (String)parms[11], 8);
               stmt.setShort(8, ((Number) parms[12]).shortValue());
               stmt.setShort(9, ((Number) parms[13]).shortValue());
               stmt.setShort(10, ((Number) parms[14]).shortValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 36 :
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
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

