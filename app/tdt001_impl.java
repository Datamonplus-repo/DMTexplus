package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdt001_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"DT_DPQ") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7877Dt_CPQ = httpContext.GetPar( "Dt_CPQ") ;
         n7877Dt_CPQ = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asadt_dpq10E1102( A396EmprCod, A7877Dt_CPQ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel10"+"_"+"DT_PRDNOM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7887Dt_Prdnum = httpContext.GetPar( "Dt_Prdnum") ;
         n7887Dt_Prdnum = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx10asadt_prdnom10E1103( A396EmprCod, A7887Dt_Prdnum) ;
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
            A7867Dt_Op = (int)(GXutil.lval( httpContext.GetPar( "Dt_Op"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7867Dt_Op", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7867Dt_Op), 8, 0));
            A7868Dt_Opr = (byte)(GXutil.lval( httpContext.GetPar( "Dt_Opr"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7868Dt_Opr", GXutil.str( A7868Dt_Opr, 1, 0));
            A7869Dt_Opp = httpContext.GetPar( "Dt_Opp") ;
            httpContext.ajax_rsp_assign_attri("", false, "A7869Dt_Opp", A7869Dt_Opp);
            A7870Dt_Orden = (short)(GXutil.lval( httpContext.GetPar( "Dt_Orden"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7870Dt_Orden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7870Dt_Orden), 4, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TABLAB OP-ORDEN-PQUIMICO", ""), (short)(0)) ;
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
      nRC_GXsfl_55 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_55"))) ;
      nGXsfl_55_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_55_idx"))) ;
      sGXsfl_55_idx = httpContext.GetPar( "sGXsfl_55_idx") ;
      A7890Dt_UOrd = (short)(GXutil.lval( httpContext.GetPar( "Dt_UOrd"))) ;
      n7890Dt_UOrd = false ;
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
      nRC_GXsfl_117 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_117"))) ;
      nGXsfl_117_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_117_idx"))) ;
      sGXsfl_117_idx = httpContext.GetPar( "sGXsfl_117_idx") ;
      A7885Dt_ForUli = (short)(GXutil.lval( httpContext.GetPar( "Dt_ForUli"))) ;
      n7885Dt_ForUli = false ;
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

   public tdt001_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdt001_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdt001_impl.class ));
   }

   public tdt001_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDT001.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Hdr", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDt_Op_Internalname, GXutil.ltrim( localUtil.ntoc( A7867Dt_Op, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDt_Op_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7867Dt_Op), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7867Dt_Op), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDt_Op_Jsonclick, 0, "", "", "", "", "", 1, edtDt_Op_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "R", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDt_Opr_Internalname, GXutil.ltrim( localUtil.ntoc( A7868Dt_Opr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDt_Opr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7868Dt_Opr), "9") : localUtil.format( DecimalUtil.doubleToDec(A7868Dt_Opr), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDt_Opr_Jsonclick, 0, "", "", "", "", "", 1, edtDt_Opr_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "P", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDt_Opp_Internalname, GXutil.rtrim( A7869Dt_Opp), GXutil.rtrim( localUtil.format( A7869Dt_Opp, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDt_Opp_Jsonclick, 0, "", "", "", "", "", 1, edtDt_Opp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Orden Fase", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDt_Orden_Internalname, GXutil.ltrim( localUtil.ntoc( A7870Dt_Orden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDt_Orden_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7870Dt_Orden), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7870Dt_Orden), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDt_Orden_Jsonclick, 0, "", "", "", "", "", 1, edtDt_Orden_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDT001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Ultimo numero PQ", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDt_UOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A7890Dt_UOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDt_UOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7890Dt_UOrd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7890Dt_UOrd), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDt_UOrd_Jsonclick, 0, "", "", "", "", "", 1, edtDt_UOrd_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol55( ) ;
      /* Save parent mode. */
      sMode1102 = Gx_mode ;
      nGXsfl_55_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1102 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1102 = (short)(1) ;
            scanStart10E1102( ) ;
            while ( RcdFound1102 != 0 )
            {
               init_level_properties1102( ) ;
               getByPrimaryKey10E1102( ) ;
               addRow10E1102( ) ;
               scanNext10E1102( ) ;
            }
            scanEnd10E1102( ) ;
            nBlankRcdCount1102 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B7890Dt_UOrd = A7890Dt_UOrd ;
         n7890Dt_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
         standaloneNotModal10E1102( ) ;
         standaloneModal10E1102( ) ;
         sMode1102 = Gx_mode ;
         while ( nGXsfl_55_idx < nRC_GXsfl_55 )
         {
            bGXsfl_55_Refreshing = true ;
            readRow10E1102( ) ;
            edtDt_Ordl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_ORDL_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDt_Ordl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_Ordl_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtDt_CPQ_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_CPQ_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDt_CPQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_CPQ_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtDt_DPQ_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_DPQ_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDt_DPQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_DPQ_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtDt_ForFab_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_FORFAB_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDt_ForFab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_ForFab_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtDt_Fortie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_FORTIE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDt_Fortie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_Fortie_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtDt_ForTmx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_FORTMX_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDt_ForTmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_ForTmx_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtDt_ForRb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_FORRB_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDt_ForRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_ForRb_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtDt_ForPhx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_FORPHX_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDt_ForPhx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_ForPhx_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtDt_ForPhn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_FORPHN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDt_ForPhn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_ForPhn_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtDt_ForUli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_FORULI_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDt_ForUli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_ForUli_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtDt_Nh2o_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_NH2O_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDt_Nh2o_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_Nh2o_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            if ( ( nRcdExists_1102 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal10E1102( ) ;
            }
            sendRow10E1102( ) ;
            bGXsfl_55_Refreshing = false ;
         }
         Gx_mode = sMode1102 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A7890Dt_UOrd = B7890Dt_UOrd ;
         n7890Dt_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1102 = (short)(5) ;
         nRcdExists_1102 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart10E1102( ) ;
            while ( RcdFound1102 != 0 )
            {
               sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_551102( ) ;
               init_level_properties1102( ) ;
               standaloneNotModal10E1102( ) ;
               getByPrimaryKey10E1102( ) ;
               standaloneModal10E1102( ) ;
               addRow10E1102( ) ;
               scanNext10E1102( ) ;
            }
            scanEnd10E1102( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1102 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_551102( ) ;
      initAll10E1102( ) ;
      init_level_properties1102( ) ;
      B7890Dt_UOrd = A7890Dt_UOrd ;
      n7890Dt_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
      nRcdExists_1102 = (short)(0) ;
      nIsMod_1102 = (short)(0) ;
      nRcdDeleted_1102 = (short)(0) ;
      nBlankRcdCount1102 = (short)(nBlankRcdUsr1102+nBlankRcdCount1102) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1102 > 0 )
      {
         standaloneNotModal10E1102( ) ;
         standaloneModal10E1102( ) ;
         addRow10E1102( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtDt_Ordl_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1102 = (short)(nBlankRcdCount1102-1) ;
      }
      Gx_mode = sMode1102 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A7890Dt_UOrd = B7890Dt_UOrd ;
      n7890Dt_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
      /* Restore parent mode. */
      Gx_mode = sMode1102 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDT001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDT001.htm");
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
      e1110E2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z7867Dt_Op = (int)(localUtil.ctol( httpContext.cgiGet( "Z7867Dt_Op"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7868Dt_Opr = (byte)(localUtil.ctol( httpContext.cgiGet( "Z7868Dt_Opr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7869Dt_Opp = httpContext.cgiGet( "Z7869Dt_Opp") ;
            Z7870Dt_Orden = (short)(localUtil.ctol( httpContext.cgiGet( "Z7870Dt_Orden"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7890Dt_UOrd = (short)(localUtil.ctol( httpContext.cgiGet( "Z7890Dt_UOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O7890Dt_UOrd = (short)(localUtil.ctol( httpContext.cgiGet( "O7890Dt_UOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A7867Dt_Op = (int)(localUtil.ctol( httpContext.cgiGet( edtDt_Op_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7867Dt_Op", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7867Dt_Op), 8, 0));
            A7868Dt_Opr = (byte)(localUtil.ctol( httpContext.cgiGet( edtDt_Opr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7868Dt_Opr", GXutil.str( A7868Dt_Opr, 1, 0));
            A7869Dt_Opp = httpContext.cgiGet( edtDt_Opp_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7869Dt_Opp", A7869Dt_Opp);
            A7870Dt_Orden = (short)(localUtil.ctol( httpContext.cgiGet( edtDt_Orden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7870Dt_Orden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7870Dt_Orden), 4, 0));
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A7890Dt_UOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtDt_UOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7890Dt_UOrd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
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
               A7867Dt_Op = (int)(GXutil.lval( httpContext.GetPar( "Dt_Op"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7867Dt_Op", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7867Dt_Op), 8, 0));
               A7868Dt_Opr = (byte)(GXutil.lval( httpContext.GetPar( "Dt_Opr"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7868Dt_Opr", GXutil.str( A7868Dt_Opr, 1, 0));
               A7869Dt_Opp = httpContext.GetPar( "Dt_Opp") ;
               httpContext.ajax_rsp_assign_attri("", false, "A7869Dt_Opp", A7869Dt_Opp);
               A7870Dt_Orden = (short)(GXutil.lval( httpContext.GetPar( "Dt_Orden"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7870Dt_Orden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7870Dt_Orden), 4, 0));
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
                        e1110E2 ();
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
            initAll10E1099( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1103_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1103_Enabled), 5, 0), !bGXsfl_117_Refreshing);
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
      disableAttributes10E1099( ) ;
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

   public void confirm_10E0( )
   {
      beforeValidate10E1099( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls10E1099( ) ;
         }
         else
         {
            checkExtendedTable10E1099( ) ;
            if ( AnyError == 0 )
            {
               zm10E1099( 15) ;
            }
            closeExtendedTableCursors10E1099( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1099 = Gx_mode ;
         confirm_10E1102( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1099 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1099 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues10E0( ) ;
      }
   }

   public void confirm_10E1103( )
   {
      s7885Dt_ForUli = O7885Dt_ForUli ;
      n7885Dt_ForUli = false ;
      nGXsfl_117_idx = 0 ;
      while ( nGXsfl_117_idx < nRC_GXsfl_117 )
      {
         readRow10E1103( ) ;
         if ( ( nRcdExists_1103 != 0 ) || ( nIsMod_1103 != 0 ) )
         {
            getKey10E1103( ) ;
            if ( ( nRcdExists_1103 == 0 ) && ( nRcdDeleted_1103 == 0 ) )
            {
               if ( RcdFound1103 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate10E1103( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable10E1103( ) ;
                     if ( AnyError == 0 )
                     {
                        zm10E1103( 18) ;
                     }
                     closeExtendedTableCursors10E1103( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O7885Dt_ForUli = A7885Dt_ForUli ;
                     n7885Dt_ForUli = false ;
                  }
               }
               else
               {
                  GXCCtl = "DT_ORDL_" + sGXsfl_55_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDt_Ordl_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1103 != 0 )
               {
                  if ( nRcdDeleted_1103 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey10E1103( ) ;
                     load10E1103( ) ;
                     beforeValidate10E1103( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls10E1103( ) ;
                        O7885Dt_ForUli = A7885Dt_ForUli ;
                        n7885Dt_ForUli = false ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1103 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate10E1103( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable10E1103( ) ;
                           if ( AnyError == 0 )
                           {
                              zm10E1103( 18) ;
                           }
                           closeExtendedTableCursors10E1103( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O7885Dt_ForUli = A7885Dt_ForUli ;
                           n7885Dt_ForUli = false ;
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1103 == 0 )
                  {
                     GXCCtl = "DT_ORDL_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDt_Ordl_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1103_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1103, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDt_ForLin_Internalname, GXutil.ltrim( localUtil.ntoc( A7886Dt_ForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDt_Prdnum_Internalname, GXutil.rtrim( A7887Dt_Prdnum)) ;
         httpContext.changePostValue( edtDt_PrdNom_Internalname, GXutil.rtrim( A7888Dt_PrdNom)) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc)) ;
         httpContext.changePostValue( edtDt_Forcan_Internalname, GXutil.ltrim( localUtil.ntoc( A7889Dt_Forcan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDt_clave1_Internalname, GXutil.rtrim( A8473Dt_clave1)) ;
         httpContext.changePostValue( edtDt_clave2_Internalname, GXutil.rtrim( A8474Dt_clave2)) ;
         httpContext.changePostValue( "ZT_"+"Z7886Dt_ForLin_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( Z7886Dt_ForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7887Dt_Prdnum_"+sGXsfl_117_idx, GXutil.rtrim( Z7887Dt_Prdnum)) ;
         httpContext.changePostValue( "ZT_"+"Z7889Dt_Forcan_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( Z7889Dt_Forcan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8473Dt_clave1_"+sGXsfl_117_idx, GXutil.rtrim( Z8473Dt_clave1)) ;
         httpContext.changePostValue( "ZT_"+"Z8474Dt_clave2_"+sGXsfl_117_idx, GXutil.rtrim( Z8474Dt_clave2)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1103_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1103, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1103_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1103, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1103_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1103, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1103 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1103_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1103_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_FORLIN_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_PRDNUM_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_Prdnum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_PRDNOM_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_PrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDDSC_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_FORCAN_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_Forcan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_CLAVE1_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_clave1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_CLAVE2_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_clave2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O7885Dt_ForUli = s7885Dt_ForUli ;
      n7885Dt_ForUli = false ;
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_10E1102( )
   {
      s7890Dt_UOrd = O7890Dt_UOrd ;
      n7890Dt_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow10E1102( ) ;
         if ( ( nRcdExists_1102 != 0 ) || ( nIsMod_1102 != 0 ) )
         {
            getKey10E1102( ) ;
            if ( ( nRcdExists_1102 == 0 ) && ( nRcdDeleted_1102 == 0 ) )
            {
               if ( RcdFound1102 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate10E1102( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable10E1102( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors10E1102( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode1102 = Gx_mode ;
                        confirm_10E1103( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode1102 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode1102 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     O7890Dt_UOrd = A7890Dt_UOrd ;
                     n7890Dt_UOrd = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "DT_ORDL_" + sGXsfl_55_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDt_Ordl_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1102 != 0 )
               {
                  if ( nRcdDeleted_1102 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey10E1102( ) ;
                     load10E1102( ) ;
                     beforeValidate10E1102( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls10E1102( ) ;
                        O7890Dt_UOrd = A7890Dt_UOrd ;
                        n7890Dt_UOrd = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1102 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate10E1102( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable10E1102( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors10E1102( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode1102 = Gx_mode ;
                              confirm_10E1103( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode1102 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode1102 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                           O7890Dt_UOrd = A7890Dt_UOrd ;
                           n7890Dt_UOrd = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1102 == 0 )
                  {
                     GXCCtl = "DT_ORDL_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDt_Ordl_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtDt_Ordl_Internalname, GXutil.ltrim( localUtil.ntoc( A7891Dt_Ordl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDt_CPQ_Internalname, GXutil.rtrim( A7877Dt_CPQ)) ;
         httpContext.changePostValue( edtDt_DPQ_Internalname, GXutil.rtrim( A7878Dt_DPQ)) ;
         httpContext.changePostValue( edtDt_ForFab_Internalname, GXutil.rtrim( A7879Dt_ForFab)) ;
         httpContext.changePostValue( edtDt_Fortie_Internalname, GXutil.ltrim( localUtil.ntoc( A7880Dt_Fortie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDt_ForTmx_Internalname, GXutil.ltrim( localUtil.ntoc( A7881Dt_ForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDt_ForRb_Internalname, GXutil.ltrim( localUtil.ntoc( A7882Dt_ForRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDt_ForPhx_Internalname, GXutil.ltrim( localUtil.ntoc( A7883Dt_ForPhx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDt_ForPhn_Internalname, GXutil.ltrim( localUtil.ntoc( A7884Dt_ForPhn, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDt_ForUli_Internalname, GXutil.ltrim( localUtil.ntoc( A7885Dt_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDt_Nh2o_Internalname, GXutil.ltrim( localUtil.ntoc( A12110Dt_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7891Dt_Ordl_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z7891Dt_Ordl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7877Dt_CPQ_"+sGXsfl_55_idx, GXutil.rtrim( Z7877Dt_CPQ)) ;
         httpContext.changePostValue( "ZT_"+"Z7879Dt_ForFab_"+sGXsfl_55_idx, GXutil.rtrim( Z7879Dt_ForFab)) ;
         httpContext.changePostValue( "ZT_"+"Z7880Dt_Fortie_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z7880Dt_Fortie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7881Dt_ForTmx_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z7881Dt_ForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7882Dt_ForRb_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z7882Dt_ForRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7883Dt_ForPhx_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z7883Dt_ForPhx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7884Dt_ForPhn_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z7884Dt_ForPhn, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7885Dt_ForUli_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z7885Dt_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12110Dt_Nh2o_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12110Dt_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T7885Dt_ForUli_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( O7885Dt_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_117_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_117, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1102_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1102, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1102_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1102, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1102_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1102, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1102 != 0 )
         {
            httpContext.changePostValue( "DT_ORDL_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_Ordl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_CPQ_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_CPQ_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_DPQ_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_DPQ_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_FORFAB_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForFab_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_FORTIE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_Fortie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_FORTMX_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForTmx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_FORRB_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForRb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_FORPHX_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForPhx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_FORPHN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForPhn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_FORULI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForUli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_NH2O_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_Nh2o_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O7890Dt_UOrd = s7890Dt_UOrd ;
      n7890Dt_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption10E0( )
   {
   }

   public void e1110E2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tdt001_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tdt001_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tdt001_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdt001_impl.this.A396EmprCod = GXv_char2[0] ;
      tdt001_impl.this.AV11EmprNom = GXv_char3[0] ;
      tdt001_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm10E1099( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7890Dt_UOrd = T010E8_A7890Dt_UOrd[0] ;
         }
         else
         {
            Z7890Dt_UOrd = A7890Dt_UOrd ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z7867Dt_Op = A7867Dt_Op ;
         Z7868Dt_Opr = A7868Dt_Opr ;
         Z7869Dt_Opp = A7869Dt_Opp ;
         Z7870Dt_Orden = A7870Dt_Orden ;
         Z7890Dt_UOrd = A7890Dt_UOrd ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtDt_UOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_UOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_UOrd_Enabled), 5, 0), true);
      AV33Pgmname = "TDT001" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtDt_UOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_UOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_UOrd_Enabled), 5, 0), true);
      /* Using cursor T010E9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T010E9_A407EmprNom[0] ;
      n407EmprNom = T010E9_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(7);
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

   public void load10E1099( )
   {
      /* Using cursor T010E10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1099 = (short)(1) ;
         A407EmprNom = T010E10_A407EmprNom[0] ;
         n407EmprNom = T010E10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A7890Dt_UOrd = T010E10_A7890Dt_UOrd[0] ;
         n7890Dt_UOrd = T010E10_n7890Dt_UOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
         zm10E1099( -14) ;
      }
      pr_default.close(8);
      onLoadActions10E1099( ) ;
   }

   public void onLoadActions10E1099( )
   {
   }

   public void checkExtendedTable10E1099( )
   {
      nIsDirty_1099 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors10E1099( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey10E1099( )
   {
      /* Using cursor T010E11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1099 = (short)(1) ;
      }
      else
      {
         RcdFound1099 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T010E8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden)});
      if ( (pr_default.getStatus(6) != 101) && ( T010E8_A7867Dt_Op[0] == A7867Dt_Op ) && ( T010E8_A7868Dt_Opr[0] == A7868Dt_Opr ) && ( GXutil.strcmp(T010E8_A7869Dt_Opp[0], A7869Dt_Opp) == 0 ) && ( T010E8_A7870Dt_Orden[0] == A7870Dt_Orden ) && ( GXutil.strcmp(T010E8_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm10E1099( 14) ;
         RcdFound1099 = (short)(1) ;
         A7890Dt_UOrd = T010E8_A7890Dt_UOrd[0] ;
         n7890Dt_UOrd = T010E8_n7890Dt_UOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
         O7890Dt_UOrd = A7890Dt_UOrd ;
         n7890Dt_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z7867Dt_Op = A7867Dt_Op ;
         Z7868Dt_Opr = A7868Dt_Opr ;
         Z7869Dt_Opp = A7869Dt_Opp ;
         Z7870Dt_Orden = A7870Dt_Orden ;
         sMode1099 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load10E1099( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1099 = (short)(0) ;
            initializeNonKey10E1099( ) ;
         }
         Gx_mode = sMode1099 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1099 = (short)(0) ;
         initializeNonKey10E1099( ) ;
         sMode1099 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1099 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey10E1099( ) ;
      if ( RcdFound1099 == 0 )
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
      RcdFound1099 = (short)(0) ;
      /* Using cursor T010E12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T010E12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010E12_A7867Dt_Op[0] == A7867Dt_Op ) && ( T010E12_A7868Dt_Opr[0] == A7868Dt_Opr ) && ( GXutil.strcmp(T010E12_A7869Dt_Opp[0], A7869Dt_Opp) == 0 ) && ( T010E12_A7870Dt_Orden[0] == A7870Dt_Orden ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T010E12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010E12_A7867Dt_Op[0] == A7867Dt_Op ) && ( T010E12_A7868Dt_Opr[0] == A7868Dt_Opr ) && ( GXutil.strcmp(T010E12_A7869Dt_Opp[0], A7869Dt_Opp) == 0 ) && ( T010E12_A7870Dt_Orden[0] == A7870Dt_Orden ) )
         {
            RcdFound1099 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound1099 = (short)(0) ;
      /* Using cursor T010E13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T010E13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010E13_A7867Dt_Op[0] == A7867Dt_Op ) && ( T010E13_A7868Dt_Opr[0] == A7868Dt_Opr ) && ( GXutil.strcmp(T010E13_A7869Dt_Opp[0], A7869Dt_Opp) == 0 ) && ( T010E13_A7870Dt_Orden[0] == A7870Dt_Orden ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T010E13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010E13_A7867Dt_Op[0] == A7867Dt_Op ) && ( T010E13_A7868Dt_Opr[0] == A7868Dt_Opr ) && ( GXutil.strcmp(T010E13_A7869Dt_Opp[0], A7869Dt_Opp) == 0 ) && ( T010E13_A7870Dt_Orden[0] == A7870Dt_Orden ) )
         {
            RcdFound1099 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey10E1099( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A7890Dt_UOrd = O7890Dt_UOrd ;
         n7890Dt_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
         insert10E1099( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1099 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7867Dt_Op != Z7867Dt_Op ) || ( A7868Dt_Opr != Z7868Dt_Opr ) || ( GXutil.strcmp(A7869Dt_Opp, Z7869Dt_Opp) != 0 ) || ( A7870Dt_Orden != Z7870Dt_Orden ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A7890Dt_UOrd = O7890Dt_UOrd ;
               n7890Dt_UOrd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A7890Dt_UOrd = O7890Dt_UOrd ;
               n7890Dt_UOrd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
               update10E1099( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7867Dt_Op != Z7867Dt_Op ) || ( A7868Dt_Opr != Z7868Dt_Opr ) || ( GXutil.strcmp(A7869Dt_Opp, Z7869Dt_Opp) != 0 ) || ( A7870Dt_Orden != Z7870Dt_Orden ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A7890Dt_UOrd = O7890Dt_UOrd ;
               n7890Dt_UOrd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
               insert10E1099( ) ;
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
                  A7890Dt_UOrd = O7890Dt_UOrd ;
                  n7890Dt_UOrd = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
                  insert10E1099( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7867Dt_Op != Z7867Dt_Op ) || ( A7868Dt_Opr != Z7868Dt_Opr ) || ( GXutil.strcmp(A7869Dt_Opp, Z7869Dt_Opp) != 0 ) || ( A7870Dt_Orden != Z7870Dt_Orden ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A7890Dt_UOrd = O7890Dt_UOrd ;
         n7890Dt_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
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
      getKey10E1099( ) ;
      if ( RcdFound1099 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7867Dt_Op != Z7867Dt_Op ) || ( A7868Dt_Opr != Z7868Dt_Opr ) || ( GXutil.strcmp(A7869Dt_Opp, Z7869Dt_Opp) != 0 ) || ( A7870Dt_Orden != Z7870Dt_Orden ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7867Dt_Op != Z7867Dt_Op ) || ( A7868Dt_Opr != Z7868Dt_Opr ) || ( GXutil.strcmp(A7869Dt_Opp, Z7869Dt_Opp) != 0 ) || ( A7870Dt_Orden != Z7870Dt_Orden ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdt001");
   }

   public void insert_check( )
   {
      confirm_10E0( ) ;
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
      if ( RcdFound1099 == 0 )
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
      scanStart10E1099( ) ;
      if ( RcdFound1099 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd10E1099( ) ;
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
      if ( RcdFound1099 == 0 )
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
      if ( RcdFound1099 == 0 )
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
      scanStart10E1099( ) ;
      if ( RcdFound1099 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1099 != 0 )
         {
            scanNext10E1099( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd10E1099( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency10E1099( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T010E7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDT000"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) || ( Z7890Dt_UOrd != T010E7_A7890Dt_UOrd[0] ) )
         {
            if ( Z7890Dt_UOrd != T010E7_A7890Dt_UOrd[0] )
            {
               GXutil.writeLogln("tdt001:[seudo value changed for attri]"+"Dt_UOrd");
               GXutil.writeLogRaw("Old: ",Z7890Dt_UOrd);
               GXutil.writeLogRaw("Current: ",T010E7_A7890Dt_UOrd[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDT000"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert10E1099( )
   {
      beforeValidate10E1099( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10E1099( ) ;
      }
      if ( AnyError == 0 )
      {
         zm10E1099( 0) ;
         checkOptimisticConcurrency10E1099( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10E1099( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert10E1099( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010E14 */
                  pr_default.execute(12, new Object[] {Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden), Boolean.valueOf(n7890Dt_UOrd), Short.valueOf(A7890Dt_UOrd), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT000");
                  if ( (pr_default.getStatus(12) == 1) )
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
                        processLevel10E1099( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption10E0( ) ;
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
            load10E1099( ) ;
         }
         endLevel10E1099( ) ;
      }
      closeExtendedTableCursors10E1099( ) ;
   }

   public void update10E1099( )
   {
      beforeValidate10E1099( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10E1099( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10E1099( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10E1099( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate10E1099( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010E15 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n7890Dt_UOrd), Short.valueOf(A7890Dt_UOrd), A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT000");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDT000"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate10E1099( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel10E1099( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption10E0( ) ;
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
         endLevel10E1099( ) ;
      }
      closeExtendedTableCursors10E1099( ) ;
   }

   public void deferredUpdate10E1099( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate10E1099( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10E1099( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls10E1099( ) ;
         afterConfirm10E1099( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete10E1099( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T010E16 */
               pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT000");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1099 == 0 )
                     {
                        initAll10E1099( ) ;
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
                     resetCaption10E0( ) ;
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
      sMode1099 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel10E1099( ) ;
      Gx_mode = sMode1099 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls10E1099( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T010E17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DT001", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void processNestedLevel10E1102( )
   {
      s7890Dt_UOrd = O7890Dt_UOrd ;
      n7890Dt_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow10E1102( ) ;
         if ( ( nRcdExists_1102 != 0 ) || ( nIsMod_1102 != 0 ) )
         {
            standaloneNotModal10E1102( ) ;
            getKey10E1102( ) ;
            if ( ( nRcdExists_1102 == 0 ) && ( nRcdDeleted_1102 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert10E1102( ) ;
            }
            else
            {
               if ( RcdFound1102 != 0 )
               {
                  if ( ( nRcdDeleted_1102 != 0 ) && ( nRcdExists_1102 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete10E1102( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1102 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update10E1102( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1102 == 0 )
                  {
                     GXCCtl = "DT_ORDL_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDt_Ordl_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O7890Dt_UOrd = A7890Dt_UOrd ;
            n7890Dt_UOrd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
         }
         httpContext.changePostValue( edtDt_Ordl_Internalname, GXutil.ltrim( localUtil.ntoc( A7891Dt_Ordl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDt_CPQ_Internalname, GXutil.rtrim( A7877Dt_CPQ)) ;
         httpContext.changePostValue( edtDt_DPQ_Internalname, GXutil.rtrim( A7878Dt_DPQ)) ;
         httpContext.changePostValue( edtDt_ForFab_Internalname, GXutil.rtrim( A7879Dt_ForFab)) ;
         httpContext.changePostValue( edtDt_Fortie_Internalname, GXutil.ltrim( localUtil.ntoc( A7880Dt_Fortie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDt_ForTmx_Internalname, GXutil.ltrim( localUtil.ntoc( A7881Dt_ForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDt_ForRb_Internalname, GXutil.ltrim( localUtil.ntoc( A7882Dt_ForRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDt_ForPhx_Internalname, GXutil.ltrim( localUtil.ntoc( A7883Dt_ForPhx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDt_ForPhn_Internalname, GXutil.ltrim( localUtil.ntoc( A7884Dt_ForPhn, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDt_ForUli_Internalname, GXutil.ltrim( localUtil.ntoc( A7885Dt_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDt_Nh2o_Internalname, GXutil.ltrim( localUtil.ntoc( A12110Dt_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7891Dt_Ordl_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z7891Dt_Ordl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7877Dt_CPQ_"+sGXsfl_55_idx, GXutil.rtrim( Z7877Dt_CPQ)) ;
         httpContext.changePostValue( "ZT_"+"Z7879Dt_ForFab_"+sGXsfl_55_idx, GXutil.rtrim( Z7879Dt_ForFab)) ;
         httpContext.changePostValue( "ZT_"+"Z7880Dt_Fortie_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z7880Dt_Fortie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7881Dt_ForTmx_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z7881Dt_ForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7882Dt_ForRb_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z7882Dt_ForRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7883Dt_ForPhx_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z7883Dt_ForPhx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7884Dt_ForPhn_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z7884Dt_ForPhn, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7885Dt_ForUli_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z7885Dt_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12110Dt_Nh2o_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12110Dt_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T7885Dt_ForUli_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( O7885Dt_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_117_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_117, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1102_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1102, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1102_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1102, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1102_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1102, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1102 != 0 )
         {
            httpContext.changePostValue( "DT_ORDL_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_Ordl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_CPQ_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_CPQ_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_DPQ_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_DPQ_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_FORFAB_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForFab_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_FORTIE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_Fortie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_FORTMX_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForTmx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_FORRB_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForRb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_FORPHX_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForPhx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_FORPHN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForPhn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_FORULI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForUli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_NH2O_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_Nh2o_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll10E1102( ) ;
      if ( AnyError != 0 )
      {
         O7890Dt_UOrd = s7890Dt_UOrd ;
         n7890Dt_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
      }
      nRcdExists_1102 = (short)(0) ;
      nIsMod_1102 = (short)(0) ;
      nRcdDeleted_1102 = (short)(0) ;
   }

   public void processLevel10E1099( )
   {
      /* Save parent mode. */
      sMode1099 = Gx_mode ;
      processNestedLevel10E1102( ) ;
      if ( AnyError != 0 )
      {
         O7890Dt_UOrd = s7890Dt_UOrd ;
         n7890Dt_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1099 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T010E18 */
      pr_default.execute(16, new Object[] {Boolean.valueOf(n7890Dt_UOrd), Short.valueOf(A7890Dt_UOrd), A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT000");
   }

   public void endLevel10E1099( )
   {
      pr_default.close(5);
      if ( AnyError == 0 )
      {
         beforeComplete10E1099( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdt001");
         if ( AnyError == 0 )
         {
            confirmValues10E0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdt001");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart10E1099( )
   {
      /* Scan By routine */
      /* Using cursor T010E19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden)});
      RcdFound1099 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1099 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext10E1099( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound1099 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1099 = (short)(1) ;
      }
   }

   public void scanEnd10E1099( )
   {
      pr_default.close(17);
   }

   public void afterConfirm10E1099( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert10E1099( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate10E1099( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete10E1099( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete10E1099( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate10E1099( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes10E1099( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDt_Op_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_Op_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_Op_Enabled), 5, 0), true);
      edtDt_Opr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_Opr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_Opr_Enabled), 5, 0), true);
      edtDt_Opp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_Opp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_Opp_Enabled), 5, 0), true);
      edtDt_Orden_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_Orden_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_Orden_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtDt_UOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_UOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_UOrd_Enabled), 5, 0), true);
   }

   public void zm10E1102( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7877Dt_CPQ = T010E6_A7877Dt_CPQ[0] ;
            Z7879Dt_ForFab = T010E6_A7879Dt_ForFab[0] ;
            Z7880Dt_Fortie = T010E6_A7880Dt_Fortie[0] ;
            Z7881Dt_ForTmx = T010E6_A7881Dt_ForTmx[0] ;
            Z7882Dt_ForRb = T010E6_A7882Dt_ForRb[0] ;
            Z7883Dt_ForPhx = T010E6_A7883Dt_ForPhx[0] ;
            Z7884Dt_ForPhn = T010E6_A7884Dt_ForPhn[0] ;
            Z7885Dt_ForUli = T010E6_A7885Dt_ForUli[0] ;
            Z12110Dt_Nh2o = T010E6_A12110Dt_Nh2o[0] ;
         }
         else
         {
            Z7877Dt_CPQ = A7877Dt_CPQ ;
            Z7879Dt_ForFab = A7879Dt_ForFab ;
            Z7880Dt_Fortie = A7880Dt_Fortie ;
            Z7881Dt_ForTmx = A7881Dt_ForTmx ;
            Z7882Dt_ForRb = A7882Dt_ForRb ;
            Z7883Dt_ForPhx = A7883Dt_ForPhx ;
            Z7884Dt_ForPhn = A7884Dt_ForPhn ;
            Z7885Dt_ForUli = A7885Dt_ForUli ;
            Z12110Dt_Nh2o = A12110Dt_Nh2o ;
         }
      }
      if ( GX_JID == -16 )
      {
         Z396EmprCod = A396EmprCod ;
         Z7867Dt_Op = A7867Dt_Op ;
         Z7868Dt_Opr = A7868Dt_Opr ;
         Z7869Dt_Opp = A7869Dt_Opp ;
         Z7870Dt_Orden = A7870Dt_Orden ;
         Z7891Dt_Ordl = A7891Dt_Ordl ;
         Z7877Dt_CPQ = A7877Dt_CPQ ;
         Z7879Dt_ForFab = A7879Dt_ForFab ;
         Z7880Dt_Fortie = A7880Dt_Fortie ;
         Z7881Dt_ForTmx = A7881Dt_ForTmx ;
         Z7882Dt_ForRb = A7882Dt_ForRb ;
         Z7883Dt_ForPhx = A7883Dt_ForPhx ;
         Z7884Dt_ForPhn = A7884Dt_ForPhn ;
         Z7885Dt_ForUli = A7885Dt_ForUli ;
         Z12110Dt_Nh2o = A12110Dt_Nh2o ;
      }
   }

   public void standaloneNotModal10E1102( )
   {
      edtDt_ForUli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_ForUli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_ForUli_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtDt_UOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_UOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_UOrd_Enabled), 5, 0), true);
      edtDt_UOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_UOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_UOrd_Enabled), 5, 0), true);
   }

   public void standaloneModal10E1102( )
   {
      if ( isIns( )  )
      {
         A7890Dt_UOrd = (short)(O7890Dt_UOrd+10) ;
         n7890Dt_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A7891Dt_Ordl = A7890Dt_UOrd ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDt_Ordl_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDt_Ordl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_Ordl_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      else
      {
         edtDt_Ordl_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDt_Ordl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_Ordl_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
   }

   public void load10E1102( )
   {
      /* Using cursor T010E20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden), Short.valueOf(A7891Dt_Ordl)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1102 = (short)(1) ;
         A7877Dt_CPQ = T010E20_A7877Dt_CPQ[0] ;
         n7877Dt_CPQ = T010E20_n7877Dt_CPQ[0] ;
         A7879Dt_ForFab = T010E20_A7879Dt_ForFab[0] ;
         n7879Dt_ForFab = T010E20_n7879Dt_ForFab[0] ;
         A7880Dt_Fortie = T010E20_A7880Dt_Fortie[0] ;
         n7880Dt_Fortie = T010E20_n7880Dt_Fortie[0] ;
         A7881Dt_ForTmx = T010E20_A7881Dt_ForTmx[0] ;
         n7881Dt_ForTmx = T010E20_n7881Dt_ForTmx[0] ;
         A7882Dt_ForRb = T010E20_A7882Dt_ForRb[0] ;
         n7882Dt_ForRb = T010E20_n7882Dt_ForRb[0] ;
         A7883Dt_ForPhx = T010E20_A7883Dt_ForPhx[0] ;
         n7883Dt_ForPhx = T010E20_n7883Dt_ForPhx[0] ;
         A7884Dt_ForPhn = T010E20_A7884Dt_ForPhn[0] ;
         n7884Dt_ForPhn = T010E20_n7884Dt_ForPhn[0] ;
         A7885Dt_ForUli = T010E20_A7885Dt_ForUli[0] ;
         n7885Dt_ForUli = T010E20_n7885Dt_ForUli[0] ;
         A12110Dt_Nh2o = T010E20_A12110Dt_Nh2o[0] ;
         n12110Dt_Nh2o = T010E20_n12110Dt_Nh2o[0] ;
         zm10E1102( -16) ;
      }
      pr_default.close(18);
      onLoadActions10E1102( ) ;
   }

   public void onLoadActions10E1102( )
   {
      GXt_char1 = A7878Dt_DPQ ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7877Dt_CPQ ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd3(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt001_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt001_impl.this.A7877Dt_CPQ = GXv_char3[0] ;
      tdt001_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7878Dt_DPQ = GXt_char1 ;
   }

   public void checkExtendedTable10E1102( )
   {
      nIsDirty_1102 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal10E1102( ) ;
      nIsDirty_1102 = (short)(1) ;
      GXt_char1 = A7878Dt_DPQ ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7877Dt_CPQ ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd3(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt001_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt001_impl.this.A7877Dt_CPQ = GXv_char3[0] ;
      tdt001_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7878Dt_DPQ = GXt_char1 ;
      if ( ( GXutil.strcmp(A7878Dt_DPQ, httpContext.getMessage( "Error", "")) == 0 ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Inexistente", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors10E1102( )
   {
   }

   public void enableDisable10E1102( )
   {
   }

   public void getKey10E1102( )
   {
      /* Using cursor T010E21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden), Short.valueOf(A7891Dt_Ordl)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1102 = (short)(1) ;
      }
      else
      {
         RcdFound1102 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey10E1102( )
   {
      /* Using cursor T010E6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden), Short.valueOf(A7891Dt_Ordl)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T010E6_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010E6_A7867Dt_Op[0] == A7867Dt_Op ) && ( T010E6_A7868Dt_Opr[0] == A7868Dt_Opr ) && ( GXutil.strcmp(T010E6_A7869Dt_Opp[0], A7869Dt_Opp) == 0 ) && ( T010E6_A7870Dt_Orden[0] == A7870Dt_Orden ) )
      {
         zm10E1102( 16) ;
         RcdFound1102 = (short)(1) ;
         initializeNonKey10E1102( ) ;
         A7891Dt_Ordl = T010E6_A7891Dt_Ordl[0] ;
         A7877Dt_CPQ = T010E6_A7877Dt_CPQ[0] ;
         n7877Dt_CPQ = T010E6_n7877Dt_CPQ[0] ;
         A7879Dt_ForFab = T010E6_A7879Dt_ForFab[0] ;
         n7879Dt_ForFab = T010E6_n7879Dt_ForFab[0] ;
         A7880Dt_Fortie = T010E6_A7880Dt_Fortie[0] ;
         n7880Dt_Fortie = T010E6_n7880Dt_Fortie[0] ;
         A7881Dt_ForTmx = T010E6_A7881Dt_ForTmx[0] ;
         n7881Dt_ForTmx = T010E6_n7881Dt_ForTmx[0] ;
         A7882Dt_ForRb = T010E6_A7882Dt_ForRb[0] ;
         n7882Dt_ForRb = T010E6_n7882Dt_ForRb[0] ;
         A7883Dt_ForPhx = T010E6_A7883Dt_ForPhx[0] ;
         n7883Dt_ForPhx = T010E6_n7883Dt_ForPhx[0] ;
         A7884Dt_ForPhn = T010E6_A7884Dt_ForPhn[0] ;
         n7884Dt_ForPhn = T010E6_n7884Dt_ForPhn[0] ;
         A7885Dt_ForUli = T010E6_A7885Dt_ForUli[0] ;
         n7885Dt_ForUli = T010E6_n7885Dt_ForUli[0] ;
         A12110Dt_Nh2o = T010E6_A12110Dt_Nh2o[0] ;
         n12110Dt_Nh2o = T010E6_n12110Dt_Nh2o[0] ;
         O7885Dt_ForUli = A7885Dt_ForUli ;
         n7885Dt_ForUli = false ;
         Z396EmprCod = A396EmprCod ;
         Z7867Dt_Op = A7867Dt_Op ;
         Z7868Dt_Opr = A7868Dt_Opr ;
         Z7869Dt_Opp = A7869Dt_Opp ;
         Z7870Dt_Orden = A7870Dt_Orden ;
         Z7891Dt_Ordl = A7891Dt_Ordl ;
         sMode1102 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal10E1102( ) ;
         load10E1102( ) ;
         Gx_mode = sMode1102 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1102 = (short)(0) ;
         initializeNonKey10E1102( ) ;
         sMode1102 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal10E1102( ) ;
         Gx_mode = sMode1102 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes10E1102( ) ;
      }
      pr_default.close(4);
   }

   public void checkOptimisticConcurrency10E1102( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T010E5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden), Short.valueOf(A7891Dt_Ordl)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDT001"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z7877Dt_CPQ, T010E5_A7877Dt_CPQ[0]) != 0 ) || ( GXutil.strcmp(Z7879Dt_ForFab, T010E5_A7879Dt_ForFab[0]) != 0 ) || ( Z7880Dt_Fortie != T010E5_A7880Dt_Fortie[0] ) || ( Z7881Dt_ForTmx != T010E5_A7881Dt_ForTmx[0] ) || ( DecimalUtil.compareTo(Z7882Dt_ForRb, T010E5_A7882Dt_ForRb[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z7883Dt_ForPhx, T010E5_A7883Dt_ForPhx[0]) != 0 ) || ( DecimalUtil.compareTo(Z7884Dt_ForPhn, T010E5_A7884Dt_ForPhn[0]) != 0 ) || ( Z7885Dt_ForUli != T010E5_A7885Dt_ForUli[0] ) || ( Z12110Dt_Nh2o != T010E5_A12110Dt_Nh2o[0] ) )
         {
            if ( GXutil.strcmp(Z7877Dt_CPQ, T010E5_A7877Dt_CPQ[0]) != 0 )
            {
               GXutil.writeLogln("tdt001:[seudo value changed for attri]"+"Dt_CPQ");
               GXutil.writeLogRaw("Old: ",Z7877Dt_CPQ);
               GXutil.writeLogRaw("Current: ",T010E5_A7877Dt_CPQ[0]);
            }
            if ( GXutil.strcmp(Z7879Dt_ForFab, T010E5_A7879Dt_ForFab[0]) != 0 )
            {
               GXutil.writeLogln("tdt001:[seudo value changed for attri]"+"Dt_ForFab");
               GXutil.writeLogRaw("Old: ",Z7879Dt_ForFab);
               GXutil.writeLogRaw("Current: ",T010E5_A7879Dt_ForFab[0]);
            }
            if ( Z7880Dt_Fortie != T010E5_A7880Dt_Fortie[0] )
            {
               GXutil.writeLogln("tdt001:[seudo value changed for attri]"+"Dt_Fortie");
               GXutil.writeLogRaw("Old: ",Z7880Dt_Fortie);
               GXutil.writeLogRaw("Current: ",T010E5_A7880Dt_Fortie[0]);
            }
            if ( Z7881Dt_ForTmx != T010E5_A7881Dt_ForTmx[0] )
            {
               GXutil.writeLogln("tdt001:[seudo value changed for attri]"+"Dt_ForTmx");
               GXutil.writeLogRaw("Old: ",Z7881Dt_ForTmx);
               GXutil.writeLogRaw("Current: ",T010E5_A7881Dt_ForTmx[0]);
            }
            if ( DecimalUtil.compareTo(Z7882Dt_ForRb, T010E5_A7882Dt_ForRb[0]) != 0 )
            {
               GXutil.writeLogln("tdt001:[seudo value changed for attri]"+"Dt_ForRb");
               GXutil.writeLogRaw("Old: ",Z7882Dt_ForRb);
               GXutil.writeLogRaw("Current: ",T010E5_A7882Dt_ForRb[0]);
            }
            if ( DecimalUtil.compareTo(Z7883Dt_ForPhx, T010E5_A7883Dt_ForPhx[0]) != 0 )
            {
               GXutil.writeLogln("tdt001:[seudo value changed for attri]"+"Dt_ForPhx");
               GXutil.writeLogRaw("Old: ",Z7883Dt_ForPhx);
               GXutil.writeLogRaw("Current: ",T010E5_A7883Dt_ForPhx[0]);
            }
            if ( DecimalUtil.compareTo(Z7884Dt_ForPhn, T010E5_A7884Dt_ForPhn[0]) != 0 )
            {
               GXutil.writeLogln("tdt001:[seudo value changed for attri]"+"Dt_ForPhn");
               GXutil.writeLogRaw("Old: ",Z7884Dt_ForPhn);
               GXutil.writeLogRaw("Current: ",T010E5_A7884Dt_ForPhn[0]);
            }
            if ( Z7885Dt_ForUli != T010E5_A7885Dt_ForUli[0] )
            {
               GXutil.writeLogln("tdt001:[seudo value changed for attri]"+"Dt_ForUli");
               GXutil.writeLogRaw("Old: ",Z7885Dt_ForUli);
               GXutil.writeLogRaw("Current: ",T010E5_A7885Dt_ForUli[0]);
            }
            if ( Z12110Dt_Nh2o != T010E5_A12110Dt_Nh2o[0] )
            {
               GXutil.writeLogln("tdt001:[seudo value changed for attri]"+"Dt_Nh2o");
               GXutil.writeLogRaw("Old: ",Z12110Dt_Nh2o);
               GXutil.writeLogRaw("Current: ",T010E5_A12110Dt_Nh2o[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDT001"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert10E1102( )
   {
      beforeValidate10E1102( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10E1102( ) ;
      }
      if ( AnyError == 0 )
      {
         zm10E1102( 0) ;
         checkOptimisticConcurrency10E1102( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10E1102( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert10E1102( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010E22 */
                  pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden), Short.valueOf(A7891Dt_Ordl), Boolean.valueOf(n7877Dt_CPQ), A7877Dt_CPQ, Boolean.valueOf(n7879Dt_ForFab), A7879Dt_ForFab, Boolean.valueOf(n7880Dt_Fortie), Short.valueOf(A7880Dt_Fortie), Boolean.valueOf(n7881Dt_ForTmx), Short.valueOf(A7881Dt_ForTmx), Boolean.valueOf(n7882Dt_ForRb), A7882Dt_ForRb, Boolean.valueOf(n7883Dt_ForPhx), A7883Dt_ForPhx, Boolean.valueOf(n7884Dt_ForPhn), A7884Dt_ForPhn, Boolean.valueOf(n7885Dt_ForUli), Short.valueOf(A7885Dt_ForUli), Boolean.valueOf(n12110Dt_Nh2o), Short.valueOf(A12110Dt_Nh2o)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT001");
                  if ( (pr_default.getStatus(20) == 1) )
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
                        processLevel10E1102( ) ;
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
            load10E1102( ) ;
         }
         endLevel10E1102( ) ;
      }
      closeExtendedTableCursors10E1102( ) ;
   }

   public void update10E1102( )
   {
      beforeValidate10E1102( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10E1102( ) ;
      }
      if ( ( nIsMod_1102 != 0 ) || ( nIsDirty_1102 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency10E1102( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm10E1102( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate10E1102( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T010E23 */
                     pr_default.execute(21, new Object[] {Boolean.valueOf(n7877Dt_CPQ), A7877Dt_CPQ, Boolean.valueOf(n7879Dt_ForFab), A7879Dt_ForFab, Boolean.valueOf(n7880Dt_Fortie), Short.valueOf(A7880Dt_Fortie), Boolean.valueOf(n7881Dt_ForTmx), Short.valueOf(A7881Dt_ForTmx), Boolean.valueOf(n7882Dt_ForRb), A7882Dt_ForRb, Boolean.valueOf(n7883Dt_ForPhx), A7883Dt_ForPhx, Boolean.valueOf(n7884Dt_ForPhn), A7884Dt_ForPhn, Boolean.valueOf(n7885Dt_ForUli), Short.valueOf(A7885Dt_ForUli), Boolean.valueOf(n12110Dt_Nh2o), Short.valueOf(A12110Dt_Nh2o), A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden), Short.valueOf(A7891Dt_Ordl)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT001");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDT001"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate10E1102( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel10E1102( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey10E1102( ) ;
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
            endLevel10E1102( ) ;
         }
      }
      closeExtendedTableCursors10E1102( ) ;
   }

   public void deferredUpdate10E1102( )
   {
   }

   public void delete10E1102( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate10E1102( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10E1102( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls10E1102( ) ;
         afterConfirm10E1102( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete10E1102( ) ;
            if ( AnyError == 0 )
            {
               A7885Dt_ForUli = O7885Dt_ForUli ;
               n7885Dt_ForUli = false ;
               scanStart10E1103( ) ;
               while ( RcdFound1103 != 0 )
               {
                  getByPrimaryKey10E1103( ) ;
                  delete10E1103( ) ;
                  scanNext10E1103( ) ;
                  O7885Dt_ForUli = A7885Dt_ForUli ;
                  n7885Dt_ForUli = false ;
               }
               scanEnd10E1103( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010E24 */
                  pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden), Short.valueOf(A7891Dt_Ordl)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT001");
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
      sMode1102 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel10E1102( ) ;
      Gx_mode = sMode1102 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls10E1102( )
   {
      standaloneModal10E1102( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A7878Dt_DPQ ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A7877Dt_CPQ ;
         GXv_char2[0] = GXt_char1 ;
         new app.ppreqd3(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         tdt001_impl.this.A396EmprCod = GXv_char4[0] ;
         tdt001_impl.this.A7877Dt_CPQ = GXv_char3[0] ;
         tdt001_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7878Dt_DPQ = GXt_char1 ;
      }
   }

   public void processNestedLevel10E1103( )
   {
      s7885Dt_ForUli = O7885Dt_ForUli ;
      n7885Dt_ForUli = false ;
      nGXsfl_117_idx = 0 ;
      while ( nGXsfl_117_idx < nRC_GXsfl_117 )
      {
         readRow10E1103( ) ;
         if ( ( nRcdExists_1103 != 0 ) || ( nIsMod_1103 != 0 ) )
         {
            standaloneNotModal10E1103( ) ;
            getKey10E1103( ) ;
            if ( ( nRcdExists_1103 == 0 ) && ( nRcdDeleted_1103 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert10E1103( ) ;
            }
            else
            {
               if ( RcdFound1103 != 0 )
               {
                  if ( ( nRcdDeleted_1103 != 0 ) && ( nRcdExists_1103 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete10E1103( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1103 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update10E1103( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1103 == 0 )
                  {
                     GXCCtl = "DT_ORDL_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDt_Ordl_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O7885Dt_ForUli = A7885Dt_ForUli ;
            n7885Dt_ForUli = false ;
         }
         httpContext.changePostValue( edtavnRcdDeleted_1103_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1103, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDt_ForLin_Internalname, GXutil.ltrim( localUtil.ntoc( A7886Dt_ForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDt_Prdnum_Internalname, GXutil.rtrim( A7887Dt_Prdnum)) ;
         httpContext.changePostValue( edtDt_PrdNom_Internalname, GXutil.rtrim( A7888Dt_PrdNom)) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc)) ;
         httpContext.changePostValue( edtDt_Forcan_Internalname, GXutil.ltrim( localUtil.ntoc( A7889Dt_Forcan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDt_clave1_Internalname, GXutil.rtrim( A8473Dt_clave1)) ;
         httpContext.changePostValue( edtDt_clave2_Internalname, GXutil.rtrim( A8474Dt_clave2)) ;
         httpContext.changePostValue( "ZT_"+"Z7886Dt_ForLin_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( Z7886Dt_ForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7887Dt_Prdnum_"+sGXsfl_117_idx, GXutil.rtrim( Z7887Dt_Prdnum)) ;
         httpContext.changePostValue( "ZT_"+"Z7889Dt_Forcan_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( Z7889Dt_Forcan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8473Dt_clave1_"+sGXsfl_117_idx, GXutil.rtrim( Z8473Dt_clave1)) ;
         httpContext.changePostValue( "ZT_"+"Z8474Dt_clave2_"+sGXsfl_117_idx, GXutil.rtrim( Z8474Dt_clave2)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1103_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1103, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1103_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1103, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1103_"+sGXsfl_117_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1103, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1103 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1103_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1103_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_FORLIN_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_PRDNUM_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_Prdnum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_PRDNOM_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_PrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDDSC_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_FORCAN_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_Forcan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_CLAVE1_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_clave1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DT_CLAVE2_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_clave2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll10E1103( ) ;
      if ( AnyError != 0 )
      {
         O7885Dt_ForUli = s7885Dt_ForUli ;
         n7885Dt_ForUli = false ;
      }
      nRcdExists_1103 = (short)(0) ;
      nIsMod_1103 = (short)(0) ;
      nRcdDeleted_1103 = (short)(0) ;
   }

   public void processLevel10E1102( )
   {
      /* Save parent mode. */
      sMode1102 = Gx_mode ;
      processNestedLevel10E1103( ) ;
      if ( AnyError != 0 )
      {
         O7885Dt_ForUli = s7885Dt_ForUli ;
         n7885Dt_ForUli = false ;
      }
      /* Restore parent mode. */
      Gx_mode = sMode1102 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T010E25 */
      pr_default.execute(23, new Object[] {Boolean.valueOf(n7885Dt_ForUli), Short.valueOf(A7885Dt_ForUli), A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden), Short.valueOf(A7891Dt_Ordl)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT001");
   }

   public void endLevel10E1102( )
   {
      pr_default.close(3);
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart10E1102( )
   {
      /* Scan By routine */
      /* Using cursor T010E26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden)});
      RcdFound1102 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1102 = (short)(1) ;
         A7891Dt_Ordl = T010E26_A7891Dt_Ordl[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext10E1102( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound1102 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1102 = (short)(1) ;
         A7891Dt_Ordl = T010E26_A7891Dt_Ordl[0] ;
      }
   }

   public void scanEnd10E1102( )
   {
      pr_default.close(24);
   }

   public void afterConfirm10E1102( )
   {
      /* After Confirm Rules */
      if ( ( A12110Dt_Nh2o == 0 ) && ( GXutil.strcmp(A7879Dt_ForFab, "*") != 0 ) && true /* After */ )
      {
         GXCCtl = "DT_FORFAB_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion.Numero de Baños igual a 0", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDt_ForFab_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert10E1102( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate10E1102( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete10E1102( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete10E1102( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate10E1102( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes10E1102( )
   {
      edtDt_Ordl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_Ordl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_Ordl_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtDt_CPQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_CPQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_CPQ_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtDt_DPQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_DPQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_DPQ_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtDt_ForFab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_ForFab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_ForFab_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtDt_Fortie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_Fortie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_Fortie_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtDt_ForTmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_ForTmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_ForTmx_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtDt_ForRb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_ForRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_ForRb_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtDt_ForPhx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_ForPhx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_ForPhx_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtDt_ForPhn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_ForPhn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_ForPhn_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtDt_ForUli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_ForUli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_ForUli_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtDt_Nh2o_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_Nh2o_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_Nh2o_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void zm10E1103( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7887Dt_Prdnum = T010E3_A7887Dt_Prdnum[0] ;
            Z7889Dt_Forcan = T010E3_A7889Dt_Forcan[0] ;
            Z8473Dt_clave1 = T010E3_A8473Dt_clave1[0] ;
            Z8474Dt_clave2 = T010E3_A8474Dt_clave2[0] ;
            Z490ForPrdUMe = T010E3_A490ForPrdUMe[0] ;
         }
         else
         {
            Z7887Dt_Prdnum = A7887Dt_Prdnum ;
            Z7889Dt_Forcan = A7889Dt_Forcan ;
            Z8473Dt_clave1 = A8473Dt_clave1 ;
            Z8474Dt_clave2 = A8474Dt_clave2 ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z7867Dt_Op = A7867Dt_Op ;
         Z7868Dt_Opr = A7868Dt_Opr ;
         Z7869Dt_Opp = A7869Dt_Opp ;
         Z7870Dt_Orden = A7870Dt_Orden ;
         Z7891Dt_Ordl = A7891Dt_Ordl ;
         Z7886Dt_ForLin = A7886Dt_ForLin ;
         Z7887Dt_Prdnum = A7887Dt_Prdnum ;
         Z7889Dt_Forcan = A7889Dt_Forcan ;
         Z8473Dt_clave1 = A8473Dt_clave1 ;
         Z8474Dt_clave2 = A8474Dt_clave2 ;
         Z396EmprCod = A396EmprCod ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z488ForPrdDsc = A488ForPrdDsc ;
      }
   }

   public void standaloneNotModal10E1103( )
   {
      edtDt_ForUli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_ForUli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_ForUli_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void standaloneModal10E1103( )
   {
      if ( isIns( )  )
      {
         A7885Dt_ForUli = (short)(O7885Dt_ForUli+1) ;
         n7885Dt_ForUli = false ;
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A7886Dt_ForLin = A7885Dt_ForUli ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDt_ForLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDt_ForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_ForLin_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      }
      else
      {
         edtDt_ForLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDt_ForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_ForLin_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      }
   }

   public void load10E1103( )
   {
      /* Using cursor T010E27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden), Short.valueOf(A7891Dt_Ordl), Short.valueOf(A7886Dt_ForLin)});
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1103 = (short)(1) ;
         A7887Dt_Prdnum = T010E27_A7887Dt_Prdnum[0] ;
         n7887Dt_Prdnum = T010E27_n7887Dt_Prdnum[0] ;
         A488ForPrdDsc = T010E27_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T010E27_n488ForPrdDsc[0] ;
         A7889Dt_Forcan = T010E27_A7889Dt_Forcan[0] ;
         n7889Dt_Forcan = T010E27_n7889Dt_Forcan[0] ;
         A8473Dt_clave1 = T010E27_A8473Dt_clave1[0] ;
         n8473Dt_clave1 = T010E27_n8473Dt_clave1[0] ;
         A8474Dt_clave2 = T010E27_A8474Dt_clave2[0] ;
         n8474Dt_clave2 = T010E27_n8474Dt_clave2[0] ;
         A490ForPrdUMe = T010E27_A490ForPrdUMe[0] ;
         n490ForPrdUMe = T010E27_n490ForPrdUMe[0] ;
         zm10E1103( -17) ;
      }
      pr_default.close(25);
      onLoadActions10E1103( ) ;
   }

   public void onLoadActions10E1103( )
   {
      GXt_char1 = A7888Dt_PrdNom ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7887Dt_Prdnum ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt001_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt001_impl.this.A7887Dt_Prdnum = GXv_char3[0] ;
      tdt001_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7888Dt_PrdNom = GXt_char1 ;
   }

   public void checkExtendedTable10E1103( )
   {
      nIsDirty_1103 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal10E1103( ) ;
      /* Using cursor T010E4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_117_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T010E4_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T010E4_n488ForPrdDsc[0] ;
      pr_default.close(2);
      nIsDirty_1103 = (short)(1) ;
      GXt_char1 = A7888Dt_PrdNom ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7887Dt_Prdnum ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt001_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt001_impl.this.A7887Dt_Prdnum = GXv_char3[0] ;
      tdt001_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7888Dt_PrdNom = GXt_char1 ;
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_117_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors10E1103( )
   {
      pr_default.close(2);
   }

   public void enableDisable10E1103( )
   {
   }

   public void gxload_18( String A396EmprCod ,
                          byte A490ForPrdUMe )
   {
      /* Using cursor T010E28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_117_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T010E28_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T010E28_n488ForPrdDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A488ForPrdDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(26) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(26);
   }

   public void getKey10E1103( )
   {
      /* Using cursor T010E29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden), Short.valueOf(A7891Dt_Ordl), Short.valueOf(A7886Dt_ForLin)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1103 = (short)(1) ;
      }
      else
      {
         RcdFound1103 = (short)(0) ;
      }
      pr_default.close(27);
   }

   public void getByPrimaryKey10E1103( )
   {
      /* Using cursor T010E3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden), Short.valueOf(A7891Dt_Ordl), Short.valueOf(A7886Dt_ForLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T010E3_A7867Dt_Op[0] == A7867Dt_Op ) && ( T010E3_A7868Dt_Opr[0] == A7868Dt_Opr ) && ( GXutil.strcmp(T010E3_A7869Dt_Opp[0], A7869Dt_Opp) == 0 ) && ( T010E3_A7870Dt_Orden[0] == A7870Dt_Orden ) && ( GXutil.strcmp(T010E3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm10E1103( 17) ;
         RcdFound1103 = (short)(1) ;
         initializeNonKey10E1103( ) ;
         A7886Dt_ForLin = T010E3_A7886Dt_ForLin[0] ;
         A7887Dt_Prdnum = T010E3_A7887Dt_Prdnum[0] ;
         n7887Dt_Prdnum = T010E3_n7887Dt_Prdnum[0] ;
         A7889Dt_Forcan = T010E3_A7889Dt_Forcan[0] ;
         n7889Dt_Forcan = T010E3_n7889Dt_Forcan[0] ;
         A8473Dt_clave1 = T010E3_A8473Dt_clave1[0] ;
         n8473Dt_clave1 = T010E3_n8473Dt_clave1[0] ;
         A8474Dt_clave2 = T010E3_A8474Dt_clave2[0] ;
         n8474Dt_clave2 = T010E3_n8474Dt_clave2[0] ;
         A490ForPrdUMe = T010E3_A490ForPrdUMe[0] ;
         n490ForPrdUMe = T010E3_n490ForPrdUMe[0] ;
         Z396EmprCod = A396EmprCod ;
         Z7867Dt_Op = A7867Dt_Op ;
         Z7868Dt_Opr = A7868Dt_Opr ;
         Z7869Dt_Opp = A7869Dt_Opp ;
         Z7870Dt_Orden = A7870Dt_Orden ;
         Z7891Dt_Ordl = A7891Dt_Ordl ;
         Z7886Dt_ForLin = A7886Dt_ForLin ;
         sMode1103 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal10E1103( ) ;
         load10E1103( ) ;
         Gx_mode = sMode1103 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1103 = (short)(0) ;
         initializeNonKey10E1103( ) ;
         sMode1103 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal10E1103( ) ;
         Gx_mode = sMode1103 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes10E1103( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency10E1103( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T010E2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden), Short.valueOf(A7891Dt_Ordl), Short.valueOf(A7886Dt_ForLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDT0011"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z7887Dt_Prdnum, T010E2_A7887Dt_Prdnum[0]) != 0 ) || ( DecimalUtil.compareTo(Z7889Dt_Forcan, T010E2_A7889Dt_Forcan[0]) != 0 ) || ( GXutil.strcmp(Z8473Dt_clave1, T010E2_A8473Dt_clave1[0]) != 0 ) || ( GXutil.strcmp(Z8474Dt_clave2, T010E2_A8474Dt_clave2[0]) != 0 ) || ( Z490ForPrdUMe != T010E2_A490ForPrdUMe[0] ) )
         {
            if ( GXutil.strcmp(Z7887Dt_Prdnum, T010E2_A7887Dt_Prdnum[0]) != 0 )
            {
               GXutil.writeLogln("tdt001:[seudo value changed for attri]"+"Dt_Prdnum");
               GXutil.writeLogRaw("Old: ",Z7887Dt_Prdnum);
               GXutil.writeLogRaw("Current: ",T010E2_A7887Dt_Prdnum[0]);
            }
            if ( DecimalUtil.compareTo(Z7889Dt_Forcan, T010E2_A7889Dt_Forcan[0]) != 0 )
            {
               GXutil.writeLogln("tdt001:[seudo value changed for attri]"+"Dt_Forcan");
               GXutil.writeLogRaw("Old: ",Z7889Dt_Forcan);
               GXutil.writeLogRaw("Current: ",T010E2_A7889Dt_Forcan[0]);
            }
            if ( GXutil.strcmp(Z8473Dt_clave1, T010E2_A8473Dt_clave1[0]) != 0 )
            {
               GXutil.writeLogln("tdt001:[seudo value changed for attri]"+"Dt_clave1");
               GXutil.writeLogRaw("Old: ",Z8473Dt_clave1);
               GXutil.writeLogRaw("Current: ",T010E2_A8473Dt_clave1[0]);
            }
            if ( GXutil.strcmp(Z8474Dt_clave2, T010E2_A8474Dt_clave2[0]) != 0 )
            {
               GXutil.writeLogln("tdt001:[seudo value changed for attri]"+"Dt_clave2");
               GXutil.writeLogRaw("Old: ",Z8474Dt_clave2);
               GXutil.writeLogRaw("Current: ",T010E2_A8474Dt_clave2[0]);
            }
            if ( Z490ForPrdUMe != T010E2_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("tdt001:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T010E2_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDT0011"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert10E1103( )
   {
      beforeValidate10E1103( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10E1103( ) ;
      }
      if ( AnyError == 0 )
      {
         zm10E1103( 0) ;
         checkOptimisticConcurrency10E1103( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10E1103( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert10E1103( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010E30 */
                  pr_default.execute(28, new Object[] {Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden), Short.valueOf(A7891Dt_Ordl), Short.valueOf(A7886Dt_ForLin), Boolean.valueOf(n7887Dt_Prdnum), A7887Dt_Prdnum, Boolean.valueOf(n7889Dt_Forcan), A7889Dt_Forcan, Boolean.valueOf(n8473Dt_clave1), A8473Dt_clave1, Boolean.valueOf(n8474Dt_clave2), A8474Dt_clave2, A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0011");
                  if ( (pr_default.getStatus(28) == 1) )
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
            load10E1103( ) ;
         }
         endLevel10E1103( ) ;
      }
      closeExtendedTableCursors10E1103( ) ;
   }

   public void update10E1103( )
   {
      beforeValidate10E1103( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10E1103( ) ;
      }
      if ( ( nIsMod_1103 != 0 ) || ( nIsDirty_1103 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency10E1103( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm10E1103( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate10E1103( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T010E31 */
                     pr_default.execute(29, new Object[] {Boolean.valueOf(n7887Dt_Prdnum), A7887Dt_Prdnum, Boolean.valueOf(n7889Dt_Forcan), A7889Dt_Forcan, Boolean.valueOf(n8473Dt_clave1), A8473Dt_clave1, Boolean.valueOf(n8474Dt_clave2), A8474Dt_clave2, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden), Short.valueOf(A7891Dt_Ordl), Short.valueOf(A7886Dt_ForLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0011");
                     if ( (pr_default.getStatus(29) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDT0011"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate10E1103( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey10E1103( ) ;
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
            endLevel10E1103( ) ;
         }
      }
      closeExtendedTableCursors10E1103( ) ;
   }

   public void deferredUpdate10E1103( )
   {
   }

   public void delete10E1103( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate10E1103( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10E1103( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls10E1103( ) ;
         afterConfirm10E1103( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete10E1103( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T010E32 */
               pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden), Short.valueOf(A7891Dt_Ordl), Short.valueOf(A7886Dt_ForLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0011");
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
      sMode1103 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel10E1103( ) ;
      Gx_mode = sMode1103 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls10E1103( )
   {
      standaloneModal10E1103( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A7888Dt_PrdNom ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A7887Dt_Prdnum ;
         GXv_char2[0] = GXt_char1 ;
         new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         tdt001_impl.this.A396EmprCod = GXv_char4[0] ;
         tdt001_impl.this.A7887Dt_Prdnum = GXv_char3[0] ;
         tdt001_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7888Dt_PrdNom = GXt_char1 ;
         /* Using cursor T010E33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T010E33_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T010E33_n488ForPrdDsc[0] ;
         pr_default.close(31);
      }
   }

   public void endLevel10E1103( )
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

   public void scanStart10E1103( )
   {
      /* Scan By routine */
      /* Using cursor T010E34 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden), Short.valueOf(A7891Dt_Ordl)});
      RcdFound1103 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound1103 = (short)(1) ;
         A7886Dt_ForLin = T010E34_A7886Dt_ForLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext10E1103( )
   {
      /* Scan next routine */
      pr_default.readNext(32);
      RcdFound1103 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound1103 = (short)(1) ;
         A7886Dt_ForLin = T010E34_A7886Dt_ForLin[0] ;
      }
   }

   public void scanEnd10E1103( )
   {
      pr_default.close(32);
   }

   public void afterConfirm10E1103( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert10E1103( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate10E1103( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete10E1103( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete10E1103( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate10E1103( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes10E1103( )
   {
      edtDt_ForLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_ForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_ForLin_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtDt_Prdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_Prdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_Prdnum_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtDt_PrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_PrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_PrdNom_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtForPrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtDt_Forcan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_Forcan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_Forcan_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtDt_clave1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_clave1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_clave1_Enabled), 5, 0), !bGXsfl_117_Refreshing);
      edtDt_clave2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_clave2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_clave2_Enabled), 5, 0), !bGXsfl_117_Refreshing);
   }

   public void send_integrity_lvl_hashes10E1103( )
   {
   }

   public void send_integrity_lvl_hashes10E1102( )
   {
   }

   public void send_integrity_lvl_hashes10E1099( )
   {
   }

   public void subsflControlProps_551102( )
   {
      lblTextblock8_Internalname = "TEXTBLOCK8_"+sGXsfl_55_idx ;
      edtDt_Ordl_Internalname = "DT_ORDL_"+sGXsfl_55_idx ;
      lblTextblock9_Internalname = "TEXTBLOCK9_"+sGXsfl_55_idx ;
      edtDt_CPQ_Internalname = "DT_CPQ_"+sGXsfl_55_idx ;
      lblTextblock10_Internalname = "TEXTBLOCK10_"+sGXsfl_55_idx ;
      edtDt_DPQ_Internalname = "DT_DPQ_"+sGXsfl_55_idx ;
      lblTextblock11_Internalname = "TEXTBLOCK11_"+sGXsfl_55_idx ;
      edtDt_ForFab_Internalname = "DT_FORFAB_"+sGXsfl_55_idx ;
      lblTextblock12_Internalname = "TEXTBLOCK12_"+sGXsfl_55_idx ;
      edtDt_Fortie_Internalname = "DT_FORTIE_"+sGXsfl_55_idx ;
      lblTextblock13_Internalname = "TEXTBLOCK13_"+sGXsfl_55_idx ;
      edtDt_ForTmx_Internalname = "DT_FORTMX_"+sGXsfl_55_idx ;
      lblTextblock14_Internalname = "TEXTBLOCK14_"+sGXsfl_55_idx ;
      edtDt_ForRb_Internalname = "DT_FORRB_"+sGXsfl_55_idx ;
      lblTextblock15_Internalname = "TEXTBLOCK15_"+sGXsfl_55_idx ;
      edtDt_ForPhx_Internalname = "DT_FORPHX_"+sGXsfl_55_idx ;
      lblTextblock16_Internalname = "TEXTBLOCK16_"+sGXsfl_55_idx ;
      edtDt_ForPhn_Internalname = "DT_FORPHN_"+sGXsfl_55_idx ;
      lblTextblock17_Internalname = "TEXTBLOCK17_"+sGXsfl_55_idx ;
      edtDt_ForUli_Internalname = "DT_FORULI_"+sGXsfl_55_idx ;
      lblTextblock18_Internalname = "TEXTBLOCK18_"+sGXsfl_55_idx ;
      edtDt_Nh2o_Internalname = "DT_NH2O_"+sGXsfl_55_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_551102( )
   {
      lblTextblock8_Internalname = "TEXTBLOCK8_"+sGXsfl_55_fel_idx ;
      edtDt_Ordl_Internalname = "DT_ORDL_"+sGXsfl_55_fel_idx ;
      lblTextblock9_Internalname = "TEXTBLOCK9_"+sGXsfl_55_fel_idx ;
      edtDt_CPQ_Internalname = "DT_CPQ_"+sGXsfl_55_fel_idx ;
      lblTextblock10_Internalname = "TEXTBLOCK10_"+sGXsfl_55_fel_idx ;
      edtDt_DPQ_Internalname = "DT_DPQ_"+sGXsfl_55_fel_idx ;
      lblTextblock11_Internalname = "TEXTBLOCK11_"+sGXsfl_55_fel_idx ;
      edtDt_ForFab_Internalname = "DT_FORFAB_"+sGXsfl_55_fel_idx ;
      lblTextblock12_Internalname = "TEXTBLOCK12_"+sGXsfl_55_fel_idx ;
      edtDt_Fortie_Internalname = "DT_FORTIE_"+sGXsfl_55_fel_idx ;
      lblTextblock13_Internalname = "TEXTBLOCK13_"+sGXsfl_55_fel_idx ;
      edtDt_ForTmx_Internalname = "DT_FORTMX_"+sGXsfl_55_fel_idx ;
      lblTextblock14_Internalname = "TEXTBLOCK14_"+sGXsfl_55_fel_idx ;
      edtDt_ForRb_Internalname = "DT_FORRB_"+sGXsfl_55_fel_idx ;
      lblTextblock15_Internalname = "TEXTBLOCK15_"+sGXsfl_55_fel_idx ;
      edtDt_ForPhx_Internalname = "DT_FORPHX_"+sGXsfl_55_fel_idx ;
      lblTextblock16_Internalname = "TEXTBLOCK16_"+sGXsfl_55_fel_idx ;
      edtDt_ForPhn_Internalname = "DT_FORPHN_"+sGXsfl_55_fel_idx ;
      lblTextblock17_Internalname = "TEXTBLOCK17_"+sGXsfl_55_fel_idx ;
      edtDt_ForUli_Internalname = "DT_FORULI_"+sGXsfl_55_fel_idx ;
      lblTextblock18_Internalname = "TEXTBLOCK18_"+sGXsfl_55_fel_idx ;
      edtDt_Nh2o_Internalname = "DT_NH2O_"+sGXsfl_55_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_55_fel_idx ;
   }

   public void addRow10E1102( )
   {
      nRC_GXsfl_117 = 0 ;
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551102( ) ;
      sendRow10E1102( ) ;
   }

   public void sendRow10E1102( )
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
         if ( ((int)((nGXsfl_55_idx) % (2))) == 0 )
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
         httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_55_idx+"\">") ;
      }
      if ( GRID1_IsPaging == 0 )
      {
         GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_55_idx ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable3_Internalname+"_"+sGXsfl_55_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock8_Internalname,httpContext.getMessage( "Orden Proceso", ""),"","",lblTextblock8_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1102_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDt_Ordl_Internalname,GXutil.ltrim( localUtil.ntoc( A7891Dt_Ordl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7891Dt_Ordl), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDt_Ordl_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDt_Ordl_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock9_Internalname,httpContext.getMessage( "PQuimicod", ""),"","",lblTextblock9_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1102_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDt_CPQ_Internalname,GXutil.rtrim( A7877Dt_CPQ),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDt_CPQ_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDt_CPQ_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock10_Internalname,httpContext.getMessage( "Descripcion", ""),"","",lblTextblock10_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDt_DPQ_Internalname,GXutil.rtrim( A7878Dt_DPQ),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDt_DPQ_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDt_DPQ_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(80),"chr",Integer.valueOf(1),"row",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock11_Internalname,httpContext.getMessage( "Tipo L T *", ""),"","",lblTextblock11_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1102_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDt_ForFab_Internalname,GXutil.rtrim( A7879Dt_ForFab),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDt_ForFab_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDt_ForFab_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock12_Internalname,httpContext.getMessage( "Tiempo mm", ""),"","",lblTextblock12_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1102_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDt_Fortie_Internalname,GXutil.ltrim( localUtil.ntoc( A7880Dt_Fortie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDt_Fortie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7880Dt_Fortie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7880Dt_Fortie), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDt_Fortie_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDt_Fortie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock13_Internalname,httpContext.getMessage( "Temp", ""),"","",lblTextblock13_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1102_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDt_ForTmx_Internalname,GXutil.ltrim( localUtil.ntoc( A7881Dt_ForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDt_ForTmx_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7881Dt_ForTmx), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7881Dt_ForTmx), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDt_ForTmx_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDt_ForTmx_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock14_Internalname,httpContext.getMessage( "Dt ForRb", ""),"","",lblTextblock14_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1102_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDt_ForRb_Internalname,GXutil.ltrim( localUtil.ntoc( A7882Dt_ForRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDt_ForRb_Enabled!=0) ? localUtil.format( A7882Dt_ForRb, "ZZZ9.99") : localUtil.format( A7882Dt_ForRb, "ZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,93);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDt_ForRb_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDt_ForRb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(7),"chr",Integer.valueOf(1),"row",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock15_Internalname,httpContext.getMessage( "Ph Max", ""),"","",lblTextblock15_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1102_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDt_ForPhx_Internalname,GXutil.ltrim( localUtil.ntoc( A7883Dt_ForPhx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDt_ForPhx_Enabled!=0) ? localUtil.format( A7883Dt_ForPhx, "Z9.99") : localUtil.format( A7883Dt_ForPhx, "Z9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,98);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDt_ForPhx_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDt_ForPhx_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(5),"chr",Integer.valueOf(1),"row",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock16_Internalname,httpContext.getMessage( "Ph Mn", ""),"","",lblTextblock16_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1102_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDt_ForPhn_Internalname,GXutil.ltrim( localUtil.ntoc( A7884Dt_ForPhn, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDt_ForPhn_Enabled!=0) ? localUtil.format( A7884Dt_ForPhn, "Z9.99") : localUtil.format( A7884Dt_ForPhn, "Z9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,103);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDt_ForPhn_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDt_ForPhn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(5),"chr",Integer.valueOf(1),"row",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock17_Internalname,httpContext.getMessage( "Ultima Linea", ""),"","",lblTextblock17_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDt_ForUli_Internalname,GXutil.ltrim( localUtil.ntoc( A7885Dt_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDt_ForUli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7885Dt_ForUli), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7885Dt_ForUli), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDt_ForUli_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDt_ForUli_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock18_Internalname,httpContext.getMessage( "N Banyos", ""),"","",lblTextblock18_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1102_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDt_Nh2o_Internalname,GXutil.ltrim( localUtil.ntoc( A12110Dt_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDt_Nh2o_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12110Dt_Nh2o), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12110Dt_Nh2o), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,113);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDt_Nh2o_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDt_Nh2o_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
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
      startgridcontrol117( ) ;
      nGXsfl_117_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1103 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1103 = (short)(1) ;
            scanStart10E1103( ) ;
            while ( RcdFound1103 != 0 )
            {
               init_level_properties1103( ) ;
               getByPrimaryKey10E1103( ) ;
               addRow10E1103( ) ;
               scanNext10E1103( ) ;
            }
            scanEnd10E1103( ) ;
            nBlankRcdCount1103 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B7885Dt_ForUli = A7885Dt_ForUli ;
         n7885Dt_ForUli = false ;
         B7890Dt_UOrd = A7890Dt_UOrd ;
         n7890Dt_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
         standaloneNotModal10E1103( ) ;
         standaloneModal10E1103( ) ;
         sMode1103 = Gx_mode ;
         while ( nGXsfl_117_idx < nRC_GXsfl_117 )
         {
            bGXsfl_117_Refreshing = true ;
            readRow10E1103( ) ;
            edtavnRcdDeleted_1103_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1103_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1103_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1103_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtDt_ForLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_FORLIN_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDt_ForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_ForLin_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtDt_Prdnum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_PRDNUM_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDt_Prdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_Prdnum_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtDt_PrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_PRDNOM_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDt_PrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_PrdNom_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtForPrdDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDDSC_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtDt_Forcan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_FORCAN_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDt_Forcan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_Forcan_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtDt_clave1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_CLAVE1_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDt_clave1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_clave1_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            edtDt_clave2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_CLAVE2_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDt_clave2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_clave2_Enabled), 5, 0), !bGXsfl_117_Refreshing);
            if ( ( nRcdExists_1103 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal10E1103( ) ;
            }
            sendRow10E1103( ) ;
            bGXsfl_117_Refreshing = false ;
         }
         Gx_mode = sMode1103 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A7885Dt_ForUli = B7885Dt_ForUli ;
         n7885Dt_ForUli = false ;
         A7890Dt_UOrd = B7890Dt_UOrd ;
         n7890Dt_UOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1103 = (short)(5) ;
         nRcdExists_1103 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart10E1103( ) ;
            while ( RcdFound1103 != 0 )
            {
               sGXsfl_117_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_117_idx+1), 4, 0), (short)(4), "0") + sGXsfl_55_idx ;
               subsflControlProps_1171103( ) ;
               init_level_properties1103( ) ;
               standaloneNotModal10E1103( ) ;
               getByPrimaryKey10E1103( ) ;
               standaloneModal10E1103( ) ;
               addRow10E1103( ) ;
               scanNext10E1103( ) ;
            }
            scanEnd10E1103( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1103 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_117_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_117_idx+1), 4, 0), (short)(4), "0") + sGXsfl_55_idx ;
      subsflControlProps_1171103( ) ;
      initAll10E1103( ) ;
      init_level_properties1103( ) ;
      B7885Dt_ForUli = A7885Dt_ForUli ;
      n7885Dt_ForUli = false ;
      B7890Dt_UOrd = A7890Dt_UOrd ;
      n7890Dt_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
      nRcdExists_1103 = (short)(0) ;
      nIsMod_1103 = (short)(0) ;
      nRcdDeleted_1103 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 55 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_55_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1103 = (short)(nBlankRcdUsr1103+nBlankRcdCount1103) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1103 > 0 )
      {
         standaloneNotModal10E1103( ) ;
         standaloneModal10E1103( ) ;
         addRow10E1103( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtDt_ForLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1103 = (short)(nBlankRcdCount1103-1) ;
      }
      Gx_mode = sMode1103 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A7885Dt_ForUli = B7885Dt_ForUli ;
      n7885Dt_ForUli = false ;
      A7890Dt_UOrd = B7890Dt_UOrd ;
      n7890Dt_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_55_idx, Grid2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid1Row.AddGrid("Grid2", Grid2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_55_idx, Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_55_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      /* End of table */
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes10E1102( ) ;
      GXCCtl = "Z7891Dt_Ordl_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7891Dt_Ordl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7877Dt_CPQ_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7877Dt_CPQ));
      GXCCtl = "Z7879Dt_ForFab_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7879Dt_ForFab));
      GXCCtl = "Z7880Dt_Fortie_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7880Dt_Fortie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7881Dt_ForTmx_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7881Dt_ForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7882Dt_ForRb_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7882Dt_ForRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7883Dt_ForPhx_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7883Dt_ForPhx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7884Dt_ForPhn_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7884Dt_ForPhn, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7885Dt_ForUli_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7885Dt_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12110Dt_Nh2o_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12110Dt_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O7885Dt_ForUli_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O7885Dt_ForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_117_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_117_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1102_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1102, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1102_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1102, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1102_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1102, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vGXBSCREEN_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DT_ORDL_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_Ordl_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DT_CPQ_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_CPQ_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DT_DPQ_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_DPQ_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DT_FORFAB_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForFab_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DT_FORTIE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_Fortie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DT_FORTMX_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForTmx_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DT_FORRB_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForRb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DT_FORPHX_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForPhx_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DT_FORPHN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForPhn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DT_FORULI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForUli_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DT_NH2O_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_Nh2o_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_55_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow10E1102( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551102( ) ;
      edtDt_Ordl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_ORDL_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDt_CPQ_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_CPQ_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDt_DPQ_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_DPQ_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDt_ForFab_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_FORFAB_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDt_Fortie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_FORTIE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDt_ForTmx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_FORTMX_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDt_ForRb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_FORRB_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDt_ForPhx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_FORPHX_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDt_ForPhn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_FORPHN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDt_ForUli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_FORULI_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDt_Nh2o_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_NH2O_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDt_Ordl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDt_Ordl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DT_ORDL_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDt_Ordl_Internalname ;
         wbErr = true ;
         A7891Dt_Ordl = (short)(0) ;
      }
      else
      {
         A7891Dt_Ordl = (short)(localUtil.ctol( httpContext.cgiGet( edtDt_Ordl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A7877Dt_CPQ = httpContext.cgiGet( edtDt_CPQ_Internalname) ;
      n7877Dt_CPQ = false ;
      A7878Dt_DPQ = httpContext.cgiGet( edtDt_DPQ_Internalname) ;
      A7879Dt_ForFab = httpContext.cgiGet( edtDt_ForFab_Internalname) ;
      n7879Dt_ForFab = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDt_Fortie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDt_Fortie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DT_FORTIE_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDt_Fortie_Internalname ;
         wbErr = true ;
         A7880Dt_Fortie = (short)(0) ;
         n7880Dt_Fortie = false ;
      }
      else
      {
         A7880Dt_Fortie = (short)(localUtil.ctol( httpContext.cgiGet( edtDt_Fortie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7880Dt_Fortie = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDt_ForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDt_ForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DT_FORTMX_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDt_ForTmx_Internalname ;
         wbErr = true ;
         A7881Dt_ForTmx = (short)(0) ;
         n7881Dt_ForTmx = false ;
      }
      else
      {
         A7881Dt_ForTmx = (short)(localUtil.ctol( httpContext.cgiGet( edtDt_ForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7881Dt_ForTmx = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDt_ForRb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDt_ForRb_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
      {
         GXCCtl = "DT_FORRB_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDt_ForRb_Internalname ;
         wbErr = true ;
         A7882Dt_ForRb = DecimalUtil.ZERO ;
         n7882Dt_ForRb = false ;
      }
      else
      {
         A7882Dt_ForRb = localUtil.ctond( httpContext.cgiGet( edtDt_ForRb_Internalname)) ;
         n7882Dt_ForRb = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDt_ForPhx_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDt_ForPhx_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
      {
         GXCCtl = "DT_FORPHX_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDt_ForPhx_Internalname ;
         wbErr = true ;
         A7883Dt_ForPhx = DecimalUtil.ZERO ;
         n7883Dt_ForPhx = false ;
      }
      else
      {
         A7883Dt_ForPhx = localUtil.ctond( httpContext.cgiGet( edtDt_ForPhx_Internalname)) ;
         n7883Dt_ForPhx = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDt_ForPhn_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDt_ForPhn_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
      {
         GXCCtl = "DT_FORPHN_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDt_ForPhn_Internalname ;
         wbErr = true ;
         A7884Dt_ForPhn = DecimalUtil.ZERO ;
         n7884Dt_ForPhn = false ;
      }
      else
      {
         A7884Dt_ForPhn = localUtil.ctond( httpContext.cgiGet( edtDt_ForPhn_Internalname)) ;
         n7884Dt_ForPhn = false ;
      }
      A7885Dt_ForUli = (short)(localUtil.ctol( httpContext.cgiGet( edtDt_ForUli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n7885Dt_ForUli = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDt_Nh2o_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDt_Nh2o_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DT_NH2O_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDt_Nh2o_Internalname ;
         wbErr = true ;
         A12110Dt_Nh2o = (short)(0) ;
         n12110Dt_Nh2o = false ;
      }
      else
      {
         A12110Dt_Nh2o = (short)(localUtil.ctol( httpContext.cgiGet( edtDt_Nh2o_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12110Dt_Nh2o = false ;
      }
      GXCCtl = "Z7891Dt_Ordl_" + sGXsfl_55_idx ;
      Z7891Dt_Ordl = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7877Dt_CPQ_" + sGXsfl_55_idx ;
      Z7877Dt_CPQ = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7879Dt_ForFab_" + sGXsfl_55_idx ;
      Z7879Dt_ForFab = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7880Dt_Fortie_" + sGXsfl_55_idx ;
      Z7880Dt_Fortie = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7881Dt_ForTmx_" + sGXsfl_55_idx ;
      Z7881Dt_ForTmx = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7882Dt_ForRb_" + sGXsfl_55_idx ;
      Z7882Dt_ForRb = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7883Dt_ForPhx_" + sGXsfl_55_idx ;
      Z7883Dt_ForPhx = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7884Dt_ForPhn_" + sGXsfl_55_idx ;
      Z7884Dt_ForPhn = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7885Dt_ForUli_" + sGXsfl_55_idx ;
      Z7885Dt_ForUli = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12110Dt_Nh2o_" + sGXsfl_55_idx ;
      Z12110Dt_Nh2o = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O7885Dt_ForUli_" + sGXsfl_55_idx ;
      O7885Dt_ForUli = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_117_" + sGXsfl_55_idx ;
      nRC_GXsfl_117 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1102_" + sGXsfl_55_idx ;
      nRcdDeleted_1102 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1102_" + sGXsfl_55_idx ;
      nRcdExists_1102 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1102_" + sGXsfl_55_idx ;
      nIsMod_1102 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "vGXBSCREEN_" + sGXsfl_55_idx ;
      Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_117_" + sGXsfl_55_idx ;
      nRC_GXsfl_117 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_1171103( )
   {
      edtavnRcdDeleted_1103_Internalname = "vNRCDDELETED_1103_"+sGXsfl_117_idx ;
      edtDt_ForLin_Internalname = "DT_FORLIN_"+sGXsfl_117_idx ;
      edtDt_Prdnum_Internalname = "DT_PRDNUM_"+sGXsfl_117_idx ;
      edtDt_PrdNom_Internalname = "DT_PRDNOM_"+sGXsfl_117_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_117_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_117_idx ;
      edtDt_Forcan_Internalname = "DT_FORCAN_"+sGXsfl_117_idx ;
      edtDt_clave1_Internalname = "DT_CLAVE1_"+sGXsfl_117_idx ;
      edtDt_clave2_Internalname = "DT_CLAVE2_"+sGXsfl_117_idx ;
   }

   public void subsflControlProps_fel_1171103( )
   {
      edtavnRcdDeleted_1103_Internalname = "vNRCDDELETED_1103_"+sGXsfl_117_fel_idx ;
      edtDt_ForLin_Internalname = "DT_FORLIN_"+sGXsfl_117_fel_idx ;
      edtDt_Prdnum_Internalname = "DT_PRDNUM_"+sGXsfl_117_fel_idx ;
      edtDt_PrdNom_Internalname = "DT_PRDNOM_"+sGXsfl_117_fel_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_117_fel_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_117_fel_idx ;
      edtDt_Forcan_Internalname = "DT_FORCAN_"+sGXsfl_117_fel_idx ;
      edtDt_clave1_Internalname = "DT_CLAVE1_"+sGXsfl_117_fel_idx ;
      edtDt_clave2_Internalname = "DT_CLAVE2_"+sGXsfl_117_fel_idx ;
   }

   public void addRow10E1103( )
   {
      nGXsfl_117_idx = (int)(nGXsfl_117_idx+1) ;
      sGXsfl_117_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_117_idx), 4, 0), (short)(4), "0") + sGXsfl_55_idx ;
      subsflControlProps_1171103( ) ;
      sendRow10E1103( ) ;
   }

   public void sendRow10E1103( )
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
         if ( ((int)((nGXsfl_117_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1103_" + sGXsfl_117_idx + "',1);gx.fn.setControlValue('nIsMod_1102_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 118,'',false,'" + sGXsfl_117_idx + "',117)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1103_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1103, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1103_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1103), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1103), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,118);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1103_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1103_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1103_" + sGXsfl_117_idx + "',1);gx.fn.setControlValue('nIsMod_1102_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 119,'',false,'" + sGXsfl_117_idx + "',117)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDt_ForLin_Internalname,GXutil.ltrim( localUtil.ntoc( A7886Dt_ForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7886Dt_ForLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,119);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDt_ForLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDt_ForLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1103_" + sGXsfl_117_idx + "',1);gx.fn.setControlValue('nIsMod_1102_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 120,'',false,'" + sGXsfl_117_idx + "',117)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDt_Prdnum_Internalname,GXutil.rtrim( A7887Dt_Prdnum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,120);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDt_Prdnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDt_Prdnum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDt_PrdNom_Internalname,GXutil.rtrim( A7888Dt_PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDt_PrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDt_PrdNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1103_" + sGXsfl_117_idx + "',1);gx.fn.setControlValue('nIsMod_1102_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 122,'',false,'" + sGXsfl_117_idx + "',117)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForPrdUMe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9") : localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,122);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForPrdUMe_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdDsc_Internalname,GXutil.rtrim( A488ForPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForPrdDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1103_" + sGXsfl_117_idx + "',1);gx.fn.setControlValue('nIsMod_1102_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 124,'',false,'" + sGXsfl_117_idx + "',117)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDt_Forcan_Internalname,GXutil.ltrim( localUtil.ntoc( A7889Dt_Forcan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDt_Forcan_Enabled!=0) ? localUtil.format( A7889Dt_Forcan, "ZZZZZ9.99999") : localUtil.format( A7889Dt_Forcan, "ZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,124);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDt_Forcan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDt_Forcan_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1103_" + sGXsfl_117_idx + "',1);gx.fn.setControlValue('nIsMod_1102_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 125,'',false,'" + sGXsfl_117_idx + "',117)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDt_clave1_Internalname,GXutil.rtrim( A8473Dt_clave1),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,125);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDt_clave1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDt_clave1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1103_" + sGXsfl_117_idx + "',1);gx.fn.setControlValue('nIsMod_1102_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 126,'',false,'" + sGXsfl_117_idx + "',117)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDt_clave2_Internalname,GXutil.rtrim( A8474Dt_clave2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDt_clave2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDt_clave2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(117),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashes10E1103( ) ;
      GXCCtl = "Z7886Dt_ForLin_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7886Dt_ForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7887Dt_Prdnum_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7887Dt_Prdnum));
      GXCCtl = "Z7889Dt_Forcan_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7889Dt_Forcan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8473Dt_clave1_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8473Dt_clave1));
      GXCCtl = "Z8474Dt_clave2_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8474Dt_clave2));
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1103_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1103, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1103_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1103, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1103_" + sGXsfl_117_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1103, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1103_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1103_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DT_FORLIN_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DT_PRDNUM_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_Prdnum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DT_PRDNOM_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_PrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUME_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDDSC_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DT_FORCAN_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_Forcan_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DT_CLAVE1_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_clave1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DT_CLAVE2_"+sGXsfl_117_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_clave2_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRow10E1103( )
   {
      nGXsfl_117_idx = (int)(nGXsfl_117_idx+1) ;
      sGXsfl_117_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_117_idx), 4, 0), (short)(4), "0") + sGXsfl_55_idx ;
      subsflControlProps_1171103( ) ;
      edtavnRcdDeleted_1103_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1103_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDt_ForLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_FORLIN_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDt_Prdnum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_PRDNUM_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDt_PrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_PRDNOM_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDDSC_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDt_Forcan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_FORCAN_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDt_clave1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_CLAVE1_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDt_clave2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DT_CLAVE2_"+sGXsfl_117_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1103_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1103_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1103");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1103_Internalname ;
         wbErr = true ;
         nRcdDeleted_1103 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1103 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1103_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDt_ForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDt_ForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DT_FORLIN_" + sGXsfl_117_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDt_ForLin_Internalname ;
         wbErr = true ;
         A7886Dt_ForLin = (short)(0) ;
      }
      else
      {
         A7886Dt_ForLin = (short)(localUtil.ctol( httpContext.cgiGet( edtDt_ForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A7887Dt_Prdnum = httpContext.cgiGet( edtDt_Prdnum_Internalname) ;
      n7887Dt_Prdnum = false ;
      A7888Dt_PrdNom = httpContext.cgiGet( edtDt_PrdNom_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_117_idx ;
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
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDt_Forcan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDt_Forcan_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "DT_FORCAN_" + sGXsfl_117_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDt_Forcan_Internalname ;
         wbErr = true ;
         A7889Dt_Forcan = DecimalUtil.ZERO ;
         n7889Dt_Forcan = false ;
      }
      else
      {
         A7889Dt_Forcan = localUtil.ctond( httpContext.cgiGet( edtDt_Forcan_Internalname)) ;
         n7889Dt_Forcan = false ;
      }
      A8473Dt_clave1 = httpContext.cgiGet( edtDt_clave1_Internalname) ;
      n8473Dt_clave1 = false ;
      A8474Dt_clave2 = httpContext.cgiGet( edtDt_clave2_Internalname) ;
      n8474Dt_clave2 = false ;
      GXCCtl = "Z7886Dt_ForLin_" + sGXsfl_117_idx ;
      Z7886Dt_ForLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7887Dt_Prdnum_" + sGXsfl_117_idx ;
      Z7887Dt_Prdnum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7889Dt_Forcan_" + sGXsfl_117_idx ;
      Z7889Dt_Forcan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8473Dt_clave1_" + sGXsfl_117_idx ;
      Z8473Dt_clave1 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8474Dt_clave2_" + sGXsfl_117_idx ;
      Z8474Dt_clave2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_117_idx ;
      Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1103_" + sGXsfl_117_idx ;
      nRcdDeleted_1103 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1103_" + sGXsfl_117_idx ;
      nRcdExists_1103 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1103_" + sGXsfl_117_idx ;
      nIsMod_1103 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtDt_ForLin_Enabled = edtDt_ForLin_Enabled ;
      defedtDt_ForUli_Enabled = edtDt_ForUli_Enabled ;
      defedtDt_Ordl_Enabled = edtDt_Ordl_Enabled ;
   }

   public void confirmValues10E0( )
   {
      nGXsfl_55_idx = 0 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551102( ) ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551102( ) ;
         httpContext.changePostValue( "Z7891Dt_Ordl_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z7891Dt_Ordl_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7891Dt_Ordl_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z7877Dt_CPQ_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z7877Dt_CPQ_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7877Dt_CPQ_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z7879Dt_ForFab_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z7879Dt_ForFab_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7879Dt_ForFab_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z7880Dt_Fortie_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z7880Dt_Fortie_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7880Dt_Fortie_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z7881Dt_ForTmx_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z7881Dt_ForTmx_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7881Dt_ForTmx_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z7882Dt_ForRb_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z7882Dt_ForRb_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7882Dt_ForRb_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z7883Dt_ForPhx_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z7883Dt_ForPhx_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7883Dt_ForPhx_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z7884Dt_ForPhn_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z7884Dt_ForPhn_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7884Dt_ForPhn_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z7885Dt_ForUli_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z7885Dt_ForUli_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7885Dt_ForUli_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z12110Dt_Nh2o_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z12110Dt_Nh2o_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12110Dt_Nh2o_"+sGXsfl_55_idx) ;
      }
      nGXsfl_117_idx = 0 ;
      sGXsfl_117_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_117_idx), 4, 0), (short)(4), "0") + sGXsfl_55_idx ;
      subsflControlProps_1171103( ) ;
      while ( nGXsfl_117_idx < nRC_GXsfl_117 )
      {
         nGXsfl_117_idx = (int)(nGXsfl_117_idx+1) ;
         sGXsfl_117_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_117_idx), 4, 0), (short)(4), "0") + sGXsfl_55_idx ;
         subsflControlProps_1171103( ) ;
         httpContext.changePostValue( "Z7886Dt_ForLin_"+sGXsfl_117_idx, httpContext.cgiGet( "ZT_"+"Z7886Dt_ForLin_"+sGXsfl_117_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7886Dt_ForLin_"+sGXsfl_117_idx) ;
         httpContext.changePostValue( "Z7887Dt_Prdnum_"+sGXsfl_117_idx, httpContext.cgiGet( "ZT_"+"Z7887Dt_Prdnum_"+sGXsfl_117_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7887Dt_Prdnum_"+sGXsfl_117_idx) ;
         httpContext.changePostValue( "Z7889Dt_Forcan_"+sGXsfl_117_idx, httpContext.cgiGet( "ZT_"+"Z7889Dt_Forcan_"+sGXsfl_117_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7889Dt_Forcan_"+sGXsfl_117_idx) ;
         httpContext.changePostValue( "Z8473Dt_clave1_"+sGXsfl_117_idx, httpContext.cgiGet( "ZT_"+"Z8473Dt_clave1_"+sGXsfl_117_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8473Dt_clave1_"+sGXsfl_117_idx) ;
         httpContext.changePostValue( "Z8474Dt_clave2_"+sGXsfl_117_idx, httpContext.cgiGet( "ZT_"+"Z8474Dt_clave2_"+sGXsfl_117_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8474Dt_clave2_"+sGXsfl_117_idx) ;
         httpContext.changePostValue( "Z490ForPrdUMe_"+sGXsfl_117_idx, httpContext.cgiGet( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_117_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_117_idx) ;
      }
      httpContext.changePostValue( "O7885Dt_ForUli", httpContext.cgiGet( "T7885Dt_ForUli")) ;
      httpContext.deletePostValue( "T7885Dt_ForUli") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdt001", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A7867Dt_Op,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A7868Dt_Opr,1,0)),GXutil.URLEncode(GXutil.rtrim(A7869Dt_Opp)),GXutil.URLEncode(GXutil.ltrimstr(A7870Dt_Orden,4,0))}, new String[] {"EmprCod","Dt_Op","Dt_Opr","Dt_Opp","Dt_Orden"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z7867Dt_Op", GXutil.ltrim( localUtil.ntoc( Z7867Dt_Op, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7868Dt_Opr", GXutil.ltrim( localUtil.ntoc( Z7868Dt_Opr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7869Dt_Opp", GXutil.rtrim( Z7869Dt_Opp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7870Dt_Orden", GXutil.ltrim( localUtil.ntoc( Z7870Dt_Orden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7890Dt_UOrd", GXutil.ltrim( localUtil.ntoc( Z7890Dt_UOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O7890Dt_UOrd", GXutil.ltrim( localUtil.ntoc( O7890Dt_UOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nGXsfl_55_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tdt001", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A7867Dt_Op,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A7868Dt_Opr,1,0)),GXutil.URLEncode(GXutil.rtrim(A7869Dt_Opp)),GXutil.URLEncode(GXutil.ltrimstr(A7870Dt_Orden,4,0))}, new String[] {"EmprCod","Dt_Op","Dt_Opr","Dt_Opp","Dt_Orden"})  ;
   }

   public String getPgmname( )
   {
      return "TDT001" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TABLAB OP-ORDEN-PQUIMICO", "") ;
   }

   public void initializeNonKey10E1099( )
   {
      A7890Dt_UOrd = (short)(0) ;
      n7890Dt_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
      O7890Dt_UOrd = A7890Dt_UOrd ;
      n7890Dt_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
      Z7890Dt_UOrd = (short)(0) ;
   }

   public void initAll10E1099( )
   {
      initializeNonKey10E1099( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey10E1102( )
   {
      A7878Dt_DPQ = "" ;
      A7877Dt_CPQ = "" ;
      n7877Dt_CPQ = false ;
      A7879Dt_ForFab = "" ;
      n7879Dt_ForFab = false ;
      A7880Dt_Fortie = (short)(0) ;
      n7880Dt_Fortie = false ;
      A7881Dt_ForTmx = (short)(0) ;
      n7881Dt_ForTmx = false ;
      A7882Dt_ForRb = DecimalUtil.ZERO ;
      n7882Dt_ForRb = false ;
      A7883Dt_ForPhx = DecimalUtil.ZERO ;
      n7883Dt_ForPhx = false ;
      A7884Dt_ForPhn = DecimalUtil.ZERO ;
      n7884Dt_ForPhn = false ;
      A7885Dt_ForUli = (short)(0) ;
      n7885Dt_ForUli = false ;
      A12110Dt_Nh2o = (short)(0) ;
      n12110Dt_Nh2o = false ;
      O7885Dt_ForUli = A7885Dt_ForUli ;
      n7885Dt_ForUli = false ;
      Z7877Dt_CPQ = "" ;
      Z7879Dt_ForFab = "" ;
      Z7880Dt_Fortie = (short)(0) ;
      Z7881Dt_ForTmx = (short)(0) ;
      Z7882Dt_ForRb = DecimalUtil.ZERO ;
      Z7883Dt_ForPhx = DecimalUtil.ZERO ;
      Z7884Dt_ForPhn = DecimalUtil.ZERO ;
      Z7885Dt_ForUli = (short)(0) ;
      Z12110Dt_Nh2o = (short)(0) ;
   }

   public void initAll10E1102( )
   {
      A7891Dt_Ordl = (short)(0) ;
      initializeNonKey10E1102( ) ;
   }

   public void standaloneModalInsert10E1102( )
   {
      A7890Dt_UOrd = i7890Dt_UOrd ;
      n7890Dt_UOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7890Dt_UOrd), 4, 0));
   }

   public void initializeNonKey10E1103( )
   {
      A7888Dt_PrdNom = "" ;
      A7887Dt_Prdnum = "" ;
      n7887Dt_Prdnum = false ;
      A490ForPrdUMe = (byte)(0) ;
      n490ForPrdUMe = false ;
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      A7889Dt_Forcan = DecimalUtil.ZERO ;
      n7889Dt_Forcan = false ;
      A8473Dt_clave1 = "" ;
      n8473Dt_clave1 = false ;
      A8474Dt_clave2 = "" ;
      n8474Dt_clave2 = false ;
      Z7887Dt_Prdnum = "" ;
      Z7889Dt_Forcan = DecimalUtil.ZERO ;
      Z8473Dt_clave1 = "" ;
      Z8474Dt_clave2 = "" ;
      Z490ForPrdUMe = (byte)(0) ;
   }

   public void initAll10E1103( )
   {
      A7886Dt_ForLin = (short)(0) ;
      initializeNonKey10E1103( ) ;
   }

   public void standaloneModalInsert10E1103( )
   {
      A7885Dt_ForUli = i7885Dt_ForUli ;
      n7885Dt_ForUli = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241534214", true, true);
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
      httpContext.AddJavascriptSource("tdt001.js", "?20268241534214", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1102( )
   {
      edtDt_ForUli_Enabled = defedtDt_ForUli_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_ForUli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_ForUli_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtDt_Ordl_Enabled = defedtDt_Ordl_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_Ordl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_Ordl_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void init_level_properties1103( )
   {
      edtDt_ForLin_Enabled = defedtDt_ForLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDt_ForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDt_ForLin_Enabled), 5, 0), !bGXsfl_117_Refreshing);
   }

   public void startgridcontrol55( )
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
      Grid1Column.AddObjectProperty("Value", lblTextblock8_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7891Dt_Ordl, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_Ordl_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7877Dt_CPQ));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_CPQ_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7878Dt_DPQ));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_DPQ_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7879Dt_ForFab));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForFab_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7880Dt_Fortie, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_Fortie_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7881Dt_ForTmx, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForTmx_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7882Dt_ForRb, (byte)(7), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForRb_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7883Dt_ForPhx, (byte)(5), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForPhx_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7884Dt_ForPhn, (byte)(5), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForPhn_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7885Dt_ForUli, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForUli_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12110Dt_Nh2o, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_Nh2o_Enabled, (byte)(5), (byte)(0), ".", "")));
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

   public void startgridcontrol117( )
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
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1103, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1103_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7886Dt_ForLin, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_ForLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A7887Dt_Prdnum));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_Prdnum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A7888Dt_PrdNom));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_PrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7889Dt_Forcan, (byte)(12), (byte)(5), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_Forcan_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A8473Dt_clave1));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_clave1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A8474Dt_clave2));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDt_clave2_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtDt_Op_Internalname = "DT_OP" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtDt_Opr_Internalname = "DT_OPR" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtDt_Opp_Internalname = "DT_OPP" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtDt_Orden_Internalname = "DT_ORDEN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtDt_UOrd_Internalname = "DT_UORD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtDt_Ordl_Internalname = "DT_ORDL" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtDt_CPQ_Internalname = "DT_CPQ" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtDt_DPQ_Internalname = "DT_DPQ" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtDt_ForFab_Internalname = "DT_FORFAB" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtDt_Fortie_Internalname = "DT_FORTIE" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtDt_ForTmx_Internalname = "DT_FORTMX" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtDt_ForRb_Internalname = "DT_FORRB" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtDt_ForPhx_Internalname = "DT_FORPHX" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtDt_ForPhn_Internalname = "DT_FORPHN" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtDt_ForUli_Internalname = "DT_FORULI" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtDt_Nh2o_Internalname = "DT_NH2O" ;
      edtavnRcdDeleted_1103_Internalname = "vNRCDDELETED_1103" ;
      edtDt_ForLin_Internalname = "DT_FORLIN" ;
      edtDt_Prdnum_Internalname = "DT_PRDNUM" ;
      edtDt_PrdNom_Internalname = "DT_PRDNOM" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtDt_Forcan_Internalname = "DT_FORCAN" ;
      edtDt_clave1_Internalname = "DT_CLAVE1" ;
      edtDt_clave2_Internalname = "DT_CLAVE2" ;
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
      lblTextblock18_Caption = httpContext.getMessage( "N Banyos", "") ;
      lblTextblock17_Caption = httpContext.getMessage( "Ultima Linea", "") ;
      lblTextblock16_Caption = httpContext.getMessage( "Ph Mn", "") ;
      lblTextblock15_Caption = httpContext.getMessage( "Ph Max", "") ;
      lblTextblock14_Caption = httpContext.getMessage( "Dt ForRb", "") ;
      lblTextblock13_Caption = httpContext.getMessage( "Temp", "") ;
      lblTextblock12_Caption = httpContext.getMessage( "Tiempo mm", "") ;
      lblTextblock11_Caption = httpContext.getMessage( "Tipo L T *", "") ;
      lblTextblock10_Caption = httpContext.getMessage( "Descripcion", "") ;
      lblTextblock9_Caption = httpContext.getMessage( "PQuimicod", "") ;
      lblTextblock8_Caption = httpContext.getMessage( "Orden Proceso", "") ;
      subGrid1_Borderwidth = (short)(1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "TABLAB OP-ORDEN-PQUIMICO", "") );
      edtDt_clave2_Jsonclick = "" ;
      edtDt_clave1_Jsonclick = "" ;
      edtDt_Forcan_Jsonclick = "" ;
      edtForPrdDsc_Jsonclick = "" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtDt_PrdNom_Jsonclick = "" ;
      edtDt_Prdnum_Jsonclick = "" ;
      edtDt_ForLin_Jsonclick = "" ;
      edtavnRcdDeleted_1103_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtDt_Nh2o_Jsonclick = "" ;
      edtDt_ForUli_Jsonclick = "" ;
      edtDt_ForPhn_Jsonclick = "" ;
      edtDt_ForPhx_Jsonclick = "" ;
      edtDt_ForRb_Jsonclick = "" ;
      edtDt_ForTmx_Jsonclick = "" ;
      edtDt_Fortie_Jsonclick = "" ;
      edtDt_ForFab_Jsonclick = "" ;
      edtDt_DPQ_Jsonclick = "" ;
      edtDt_CPQ_Jsonclick = "" ;
      edtDt_Ordl_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtDt_clave2_Enabled = 1 ;
      edtDt_clave1_Enabled = 1 ;
      edtDt_Forcan_Enabled = 1 ;
      edtForPrdDsc_Enabled = 0 ;
      edtForPrdUMe_Enabled = 1 ;
      edtDt_PrdNom_Enabled = 0 ;
      edtDt_Prdnum_Enabled = 1 ;
      edtDt_ForLin_Enabled = 1 ;
      edtavnRcdDeleted_1103_Enabled = 1 ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtDt_Nh2o_Enabled = 1 ;
      edtDt_ForUli_Enabled = 0 ;
      edtDt_ForPhn_Enabled = 1 ;
      edtDt_ForPhx_Enabled = 1 ;
      edtDt_ForRb_Enabled = 1 ;
      edtDt_ForTmx_Enabled = 1 ;
      edtDt_Fortie_Enabled = 1 ;
      edtDt_ForFab_Enabled = 1 ;
      edtDt_DPQ_Enabled = 0 ;
      edtDt_CPQ_Enabled = 1 ;
      edtDt_Ordl_Enabled = 1 ;
      edtDt_UOrd_Jsonclick = "" ;
      edtDt_UOrd_Backcolor = (int)(0xFFFFFF) ;
      edtDt_UOrd_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtDt_Orden_Jsonclick = "" ;
      edtDt_Orden_Backcolor = (int)(0xFFFFFF) ;
      edtDt_Orden_Enabled = 0 ;
      edtDt_Opp_Jsonclick = "" ;
      edtDt_Opp_Backcolor = (int)(0xFFFFFF) ;
      edtDt_Opp_Enabled = 0 ;
      edtDt_Opr_Jsonclick = "" ;
      edtDt_Opr_Backcolor = (int)(0xFFFFFF) ;
      edtDt_Opr_Enabled = 0 ;
      edtDt_Op_Jsonclick = "" ;
      edtDt_Op_Backcolor = (int)(0xFFFFFF) ;
      edtDt_Op_Enabled = 0 ;
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

   public void gx2asadt_dpq10E1102( String A396EmprCod ,
                                    String A7877Dt_CPQ )
   {
      GXt_char1 = A7878Dt_DPQ ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7877Dt_CPQ ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd3(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt001_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt001_impl.this.A7877Dt_CPQ = GXv_char3[0] ;
      tdt001_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7878Dt_DPQ = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7878Dt_DPQ))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx10asadt_prdnom10E1103( String A396EmprCod ,
                                        String A7887Dt_Prdnum )
   {
      GXt_char1 = A7888Dt_PrdNom ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7887Dt_Prdnum ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt001_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt001_impl.this.A7887Dt_Prdnum = GXv_char3[0] ;
      tdt001_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7888Dt_PrdNom = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7888Dt_PrdNom))+"\"") ;
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
      subsflControlProps_551102( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal10E1102( ) ;
         standaloneModal10E1102( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow10E1102( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551102( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1171103( ) ;
      while ( nGXsfl_117_idx <= nRC_GXsfl_117 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal10E1102( ) ;
         standaloneModal10E1102( ) ;
         standaloneNotModal10E1103( ) ;
         standaloneModal10E1103( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow10E1103( ) ;
         nGXsfl_117_idx = (int)(nGXsfl_117_idx+1) ;
         sGXsfl_117_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_117_idx), 4, 0), (short)(4), "0") + sGXsfl_55_idx ;
         subsflControlProps_1171103( ) ;
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
      /* Using cursor T010E35 */
      pr_default.execute(33, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(33) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T010E35_A407EmprNom[0] ;
      n407EmprNom = T010E35_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(33);
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

   public void valid_Dt_orden( )
   {
      n7890Dt_UOrd = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A7890Dt_UOrd", GXutil.ltrim( localUtil.ntoc( A7890Dt_UOrd, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7867Dt_Op", GXutil.ltrim( localUtil.ntoc( Z7867Dt_Op, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7868Dt_Opr", GXutil.ltrim( localUtil.ntoc( Z7868Dt_Opr, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7869Dt_Opp", GXutil.rtrim( Z7869Dt_Opp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7870Dt_Orden", GXutil.ltrim( localUtil.ntoc( Z7870Dt_Orden, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7890Dt_UOrd", GXutil.ltrim( localUtil.ntoc( Z7890Dt_UOrd, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O7890Dt_UOrd", GXutil.ltrim( localUtil.ntoc( O7890Dt_UOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Dt_cpq( )
   {
      n7877Dt_CPQ = false ;
      GXt_char1 = A7878Dt_DPQ ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7877Dt_CPQ ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd3(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt001_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt001_impl.this.A7877Dt_CPQ = GXv_char3[0] ;
      tdt001_impl.this.GXt_char1 = GXv_char2[0] ;
      A7878Dt_DPQ = GXt_char1 ;
      if ( ( GXutil.strcmp(A7878Dt_DPQ, httpContext.getMessage( "Error", "")) == 0 ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Inexistente", ""), 1, "DT_CPQ");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDt_CPQ_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7878Dt_DPQ", GXutil.rtrim( A7878Dt_DPQ));
   }

   public void valid_Dt_prdnum( )
   {
      n7887Dt_Prdnum = false ;
      GXt_char1 = A7888Dt_PrdNom ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7887Dt_Prdnum ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tdt001_impl.this.A396EmprCod = GXv_char4[0] ;
      tdt001_impl.this.A7887Dt_Prdnum = GXv_char3[0] ;
      tdt001_impl.this.GXt_char1 = GXv_char2[0] ;
      A7888Dt_PrdNom = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7888Dt_PrdNom", GXutil.rtrim( A7888Dt_PrdNom));
   }

   public void valid_Forprdume( )
   {
      n490ForPrdUMe = false ;
      n488ForPrdDsc = false ;
      /* Using cursor T010E33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      A488ForPrdDsc = T010E33_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T010E33_n488ForPrdDsc[0] ;
      pr_default.close(31);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7867Dt_Op',fld:'DT_OP',pic:'ZZZZZZZ9'},{av:'A7868Dt_Opr',fld:'DT_OPR',pic:'9'},{av:'A7869Dt_Opp',fld:'DT_OPP',pic:''},{av:'A7870Dt_Orden',fld:'DT_ORDEN',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DT_OP","{handler:'valid_Dt_op',iparms:[]");
      setEventMetadata("VALID_DT_OP",",oparms:[]}");
      setEventMetadata("VALID_DT_OPR","{handler:'valid_Dt_opr',iparms:[]");
      setEventMetadata("VALID_DT_OPR",",oparms:[]}");
      setEventMetadata("VALID_DT_OPP","{handler:'valid_Dt_opp',iparms:[]");
      setEventMetadata("VALID_DT_OPP",",oparms:[]}");
      setEventMetadata("VALID_DT_ORDEN","{handler:'valid_Dt_orden',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A7890Dt_UOrd',fld:'DT_UORD',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7867Dt_Op',fld:'DT_OP',pic:'ZZZZZZZ9'},{av:'A7868Dt_Opr',fld:'DT_OPR',pic:'9'},{av:'A7869Dt_Opp',fld:'DT_OPP',pic:''},{av:'A7870Dt_Orden',fld:'DT_ORDEN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_DT_ORDEN",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A7890Dt_UOrd',fld:'DT_UORD',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z7867Dt_Op'},{av:'Z7868Dt_Opr'},{av:'Z7869Dt_Opp'},{av:'Z7870Dt_Orden'},{av:'Z407EmprNom'},{av:'Z7890Dt_UOrd'},{av:'O7890Dt_UOrd'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_DT_UORD","{handler:'valid_Dt_uord',iparms:[]");
      setEventMetadata("VALID_DT_UORD",",oparms:[]}");
      setEventMetadata("VALID_DT_ORDL","{handler:'valid_Dt_ordl',iparms:[]");
      setEventMetadata("VALID_DT_ORDL",",oparms:[]}");
      setEventMetadata("VALID_DT_CPQ","{handler:'valid_Dt_cpq',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7877Dt_CPQ',fld:'DT_CPQ',pic:''},{av:'A7878Dt_DPQ',fld:'DT_DPQ',pic:''}]");
      setEventMetadata("VALID_DT_CPQ",",oparms:[{av:'A7878Dt_DPQ',fld:'DT_DPQ',pic:''}]}");
      setEventMetadata("VALID_DT_DPQ","{handler:'valid_Dt_dpq',iparms:[]");
      setEventMetadata("VALID_DT_DPQ",",oparms:[]}");
      setEventMetadata("VALID_DT_FORFAB","{handler:'valid_Dt_forfab',iparms:[]");
      setEventMetadata("VALID_DT_FORFAB",",oparms:[]}");
      setEventMetadata("VALID_DT_FORULI","{handler:'valid_Dt_foruli',iparms:[]");
      setEventMetadata("VALID_DT_FORULI",",oparms:[]}");
      setEventMetadata("VALID_DT_NH2O","{handler:'valid_Dt_nh2o',iparms:[]");
      setEventMetadata("VALID_DT_NH2O",",oparms:[]}");
      setEventMetadata("VALID_DT_FORLIN","{handler:'valid_Dt_forlin',iparms:[]");
      setEventMetadata("VALID_DT_FORLIN",",oparms:[]}");
      setEventMetadata("VALID_DT_PRDNUM","{handler:'valid_Dt_prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7887Dt_Prdnum',fld:'DT_PRDNUM',pic:''},{av:'A7888Dt_PrdNom',fld:'DT_PRDNOM',pic:''}]");
      setEventMetadata("VALID_DT_PRDNUM",",oparms:[{av:'A7888Dt_PrdNom',fld:'DT_PRDNOM',pic:''}]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Dt_clave2',iparms:[]");
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
      pr_default.close(31);
      pr_default.close(33);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA7869Dt_Opp = "" ;
      Z396EmprCod = "" ;
      Z7869Dt_Opp = "" ;
      Z7877Dt_CPQ = "" ;
      Z7879Dt_ForFab = "" ;
      Z7882Dt_ForRb = DecimalUtil.ZERO ;
      Z7883Dt_ForPhx = DecimalUtil.ZERO ;
      Z7884Dt_ForPhn = DecimalUtil.ZERO ;
      Z7887Dt_Prdnum = "" ;
      Z7889Dt_Forcan = DecimalUtil.ZERO ;
      Z8473Dt_clave1 = "" ;
      Z8474Dt_clave2 = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A7877Dt_CPQ = "" ;
      A7887Dt_Prdnum = "" ;
      A7869Dt_Opp = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock7_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1102 = "" ;
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
      sMode1099 = "" ;
      GXCCtl = "" ;
      A7888Dt_PrdNom = "" ;
      A488ForPrdDsc = "" ;
      A7889Dt_Forcan = DecimalUtil.ZERO ;
      A8473Dt_clave1 = "" ;
      A8474Dt_clave2 = "" ;
      A7878Dt_DPQ = "" ;
      A7879Dt_ForFab = "" ;
      A7882Dt_ForRb = DecimalUtil.ZERO ;
      A7883Dt_ForPhx = DecimalUtil.ZERO ;
      A7884Dt_ForPhn = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      T010E9_A407EmprNom = new String[] {""} ;
      T010E9_n407EmprNom = new boolean[] {false} ;
      T010E10_A7867Dt_Op = new int[1] ;
      T010E10_A7868Dt_Opr = new byte[1] ;
      T010E10_A7869Dt_Opp = new String[] {""} ;
      T010E10_A7870Dt_Orden = new short[1] ;
      T010E10_A407EmprNom = new String[] {""} ;
      T010E10_n407EmprNom = new boolean[] {false} ;
      T010E10_A7890Dt_UOrd = new short[1] ;
      T010E10_n7890Dt_UOrd = new boolean[] {false} ;
      T010E10_A396EmprCod = new String[] {""} ;
      T010E11_A396EmprCod = new String[] {""} ;
      T010E11_A7867Dt_Op = new int[1] ;
      T010E11_A7868Dt_Opr = new byte[1] ;
      T010E11_A7869Dt_Opp = new String[] {""} ;
      T010E11_A7870Dt_Orden = new short[1] ;
      T010E8_A7867Dt_Op = new int[1] ;
      T010E8_A7868Dt_Opr = new byte[1] ;
      T010E8_A7869Dt_Opp = new String[] {""} ;
      T010E8_A7870Dt_Orden = new short[1] ;
      T010E8_A7890Dt_UOrd = new short[1] ;
      T010E8_n7890Dt_UOrd = new boolean[] {false} ;
      T010E8_A396EmprCod = new String[] {""} ;
      T010E12_A396EmprCod = new String[] {""} ;
      T010E12_A7867Dt_Op = new int[1] ;
      T010E12_A7868Dt_Opr = new byte[1] ;
      T010E12_A7869Dt_Opp = new String[] {""} ;
      T010E12_A7870Dt_Orden = new short[1] ;
      T010E13_A396EmprCod = new String[] {""} ;
      T010E13_A7867Dt_Op = new int[1] ;
      T010E13_A7868Dt_Opr = new byte[1] ;
      T010E13_A7869Dt_Opp = new String[] {""} ;
      T010E13_A7870Dt_Orden = new short[1] ;
      T010E7_A7867Dt_Op = new int[1] ;
      T010E7_A7868Dt_Opr = new byte[1] ;
      T010E7_A7869Dt_Opp = new String[] {""} ;
      T010E7_A7870Dt_Orden = new short[1] ;
      T010E7_A7890Dt_UOrd = new short[1] ;
      T010E7_n7890Dt_UOrd = new boolean[] {false} ;
      T010E7_A396EmprCod = new String[] {""} ;
      T010E17_A396EmprCod = new String[] {""} ;
      T010E17_A7867Dt_Op = new int[1] ;
      T010E17_A7868Dt_Opr = new byte[1] ;
      T010E17_A7869Dt_Opp = new String[] {""} ;
      T010E17_A7870Dt_Orden = new short[1] ;
      T010E17_A7891Dt_Ordl = new short[1] ;
      T010E19_A396EmprCod = new String[] {""} ;
      T010E19_A7867Dt_Op = new int[1] ;
      T010E19_A7868Dt_Opr = new byte[1] ;
      T010E19_A7869Dt_Opp = new String[] {""} ;
      T010E19_A7870Dt_Orden = new short[1] ;
      T010E20_A396EmprCod = new String[] {""} ;
      T010E20_A7867Dt_Op = new int[1] ;
      T010E20_A7868Dt_Opr = new byte[1] ;
      T010E20_A7869Dt_Opp = new String[] {""} ;
      T010E20_A7870Dt_Orden = new short[1] ;
      T010E20_A7891Dt_Ordl = new short[1] ;
      T010E20_A7877Dt_CPQ = new String[] {""} ;
      T010E20_n7877Dt_CPQ = new boolean[] {false} ;
      T010E20_A7879Dt_ForFab = new String[] {""} ;
      T010E20_n7879Dt_ForFab = new boolean[] {false} ;
      T010E20_A7880Dt_Fortie = new short[1] ;
      T010E20_n7880Dt_Fortie = new boolean[] {false} ;
      T010E20_A7881Dt_ForTmx = new short[1] ;
      T010E20_n7881Dt_ForTmx = new boolean[] {false} ;
      T010E20_A7882Dt_ForRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010E20_n7882Dt_ForRb = new boolean[] {false} ;
      T010E20_A7883Dt_ForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010E20_n7883Dt_ForPhx = new boolean[] {false} ;
      T010E20_A7884Dt_ForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010E20_n7884Dt_ForPhn = new boolean[] {false} ;
      T010E20_A7885Dt_ForUli = new short[1] ;
      T010E20_n7885Dt_ForUli = new boolean[] {false} ;
      T010E20_A12110Dt_Nh2o = new short[1] ;
      T010E20_n12110Dt_Nh2o = new boolean[] {false} ;
      T010E21_A396EmprCod = new String[] {""} ;
      T010E21_A7867Dt_Op = new int[1] ;
      T010E21_A7868Dt_Opr = new byte[1] ;
      T010E21_A7869Dt_Opp = new String[] {""} ;
      T010E21_A7870Dt_Orden = new short[1] ;
      T010E21_A7891Dt_Ordl = new short[1] ;
      T010E6_A396EmprCod = new String[] {""} ;
      T010E6_A7867Dt_Op = new int[1] ;
      T010E6_A7868Dt_Opr = new byte[1] ;
      T010E6_A7869Dt_Opp = new String[] {""} ;
      T010E6_A7870Dt_Orden = new short[1] ;
      T010E6_A7891Dt_Ordl = new short[1] ;
      T010E6_A7877Dt_CPQ = new String[] {""} ;
      T010E6_n7877Dt_CPQ = new boolean[] {false} ;
      T010E6_A7879Dt_ForFab = new String[] {""} ;
      T010E6_n7879Dt_ForFab = new boolean[] {false} ;
      T010E6_A7880Dt_Fortie = new short[1] ;
      T010E6_n7880Dt_Fortie = new boolean[] {false} ;
      T010E6_A7881Dt_ForTmx = new short[1] ;
      T010E6_n7881Dt_ForTmx = new boolean[] {false} ;
      T010E6_A7882Dt_ForRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010E6_n7882Dt_ForRb = new boolean[] {false} ;
      T010E6_A7883Dt_ForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010E6_n7883Dt_ForPhx = new boolean[] {false} ;
      T010E6_A7884Dt_ForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010E6_n7884Dt_ForPhn = new boolean[] {false} ;
      T010E6_A7885Dt_ForUli = new short[1] ;
      T010E6_n7885Dt_ForUli = new boolean[] {false} ;
      T010E6_A12110Dt_Nh2o = new short[1] ;
      T010E6_n12110Dt_Nh2o = new boolean[] {false} ;
      T010E5_A396EmprCod = new String[] {""} ;
      T010E5_A7867Dt_Op = new int[1] ;
      T010E5_A7868Dt_Opr = new byte[1] ;
      T010E5_A7869Dt_Opp = new String[] {""} ;
      T010E5_A7870Dt_Orden = new short[1] ;
      T010E5_A7891Dt_Ordl = new short[1] ;
      T010E5_A7877Dt_CPQ = new String[] {""} ;
      T010E5_n7877Dt_CPQ = new boolean[] {false} ;
      T010E5_A7879Dt_ForFab = new String[] {""} ;
      T010E5_n7879Dt_ForFab = new boolean[] {false} ;
      T010E5_A7880Dt_Fortie = new short[1] ;
      T010E5_n7880Dt_Fortie = new boolean[] {false} ;
      T010E5_A7881Dt_ForTmx = new short[1] ;
      T010E5_n7881Dt_ForTmx = new boolean[] {false} ;
      T010E5_A7882Dt_ForRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010E5_n7882Dt_ForRb = new boolean[] {false} ;
      T010E5_A7883Dt_ForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010E5_n7883Dt_ForPhx = new boolean[] {false} ;
      T010E5_A7884Dt_ForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010E5_n7884Dt_ForPhn = new boolean[] {false} ;
      T010E5_A7885Dt_ForUli = new short[1] ;
      T010E5_n7885Dt_ForUli = new boolean[] {false} ;
      T010E5_A12110Dt_Nh2o = new short[1] ;
      T010E5_n12110Dt_Nh2o = new boolean[] {false} ;
      T010E26_A396EmprCod = new String[] {""} ;
      T010E26_A7867Dt_Op = new int[1] ;
      T010E26_A7868Dt_Opr = new byte[1] ;
      T010E26_A7869Dt_Opp = new String[] {""} ;
      T010E26_A7870Dt_Orden = new short[1] ;
      T010E26_A7891Dt_Ordl = new short[1] ;
      Z488ForPrdDsc = "" ;
      T010E27_A7867Dt_Op = new int[1] ;
      T010E27_A7868Dt_Opr = new byte[1] ;
      T010E27_A7869Dt_Opp = new String[] {""} ;
      T010E27_A7870Dt_Orden = new short[1] ;
      T010E27_A7891Dt_Ordl = new short[1] ;
      T010E27_A7886Dt_ForLin = new short[1] ;
      T010E27_A7887Dt_Prdnum = new String[] {""} ;
      T010E27_n7887Dt_Prdnum = new boolean[] {false} ;
      T010E27_A488ForPrdDsc = new String[] {""} ;
      T010E27_n488ForPrdDsc = new boolean[] {false} ;
      T010E27_A7889Dt_Forcan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010E27_n7889Dt_Forcan = new boolean[] {false} ;
      T010E27_A8473Dt_clave1 = new String[] {""} ;
      T010E27_n8473Dt_clave1 = new boolean[] {false} ;
      T010E27_A8474Dt_clave2 = new String[] {""} ;
      T010E27_n8474Dt_clave2 = new boolean[] {false} ;
      T010E27_A396EmprCod = new String[] {""} ;
      T010E27_A490ForPrdUMe = new byte[1] ;
      T010E27_n490ForPrdUMe = new boolean[] {false} ;
      T010E4_A488ForPrdDsc = new String[] {""} ;
      T010E4_n488ForPrdDsc = new boolean[] {false} ;
      T010E28_A488ForPrdDsc = new String[] {""} ;
      T010E28_n488ForPrdDsc = new boolean[] {false} ;
      T010E29_A396EmprCod = new String[] {""} ;
      T010E29_A7867Dt_Op = new int[1] ;
      T010E29_A7868Dt_Opr = new byte[1] ;
      T010E29_A7869Dt_Opp = new String[] {""} ;
      T010E29_A7870Dt_Orden = new short[1] ;
      T010E29_A7891Dt_Ordl = new short[1] ;
      T010E29_A7886Dt_ForLin = new short[1] ;
      T010E3_A7867Dt_Op = new int[1] ;
      T010E3_A7868Dt_Opr = new byte[1] ;
      T010E3_A7869Dt_Opp = new String[] {""} ;
      T010E3_A7870Dt_Orden = new short[1] ;
      T010E3_A7891Dt_Ordl = new short[1] ;
      T010E3_A7886Dt_ForLin = new short[1] ;
      T010E3_A7887Dt_Prdnum = new String[] {""} ;
      T010E3_n7887Dt_Prdnum = new boolean[] {false} ;
      T010E3_A7889Dt_Forcan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010E3_n7889Dt_Forcan = new boolean[] {false} ;
      T010E3_A8473Dt_clave1 = new String[] {""} ;
      T010E3_n8473Dt_clave1 = new boolean[] {false} ;
      T010E3_A8474Dt_clave2 = new String[] {""} ;
      T010E3_n8474Dt_clave2 = new boolean[] {false} ;
      T010E3_A396EmprCod = new String[] {""} ;
      T010E3_A490ForPrdUMe = new byte[1] ;
      T010E3_n490ForPrdUMe = new boolean[] {false} ;
      sMode1103 = "" ;
      T010E2_A7867Dt_Op = new int[1] ;
      T010E2_A7868Dt_Opr = new byte[1] ;
      T010E2_A7869Dt_Opp = new String[] {""} ;
      T010E2_A7870Dt_Orden = new short[1] ;
      T010E2_A7891Dt_Ordl = new short[1] ;
      T010E2_A7886Dt_ForLin = new short[1] ;
      T010E2_A7887Dt_Prdnum = new String[] {""} ;
      T010E2_n7887Dt_Prdnum = new boolean[] {false} ;
      T010E2_A7889Dt_Forcan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010E2_n7889Dt_Forcan = new boolean[] {false} ;
      T010E2_A8473Dt_clave1 = new String[] {""} ;
      T010E2_n8473Dt_clave1 = new boolean[] {false} ;
      T010E2_A8474Dt_clave2 = new String[] {""} ;
      T010E2_n8474Dt_clave2 = new boolean[] {false} ;
      T010E2_A396EmprCod = new String[] {""} ;
      T010E2_A490ForPrdUMe = new byte[1] ;
      T010E2_n490ForPrdUMe = new boolean[] {false} ;
      T010E33_A488ForPrdDsc = new String[] {""} ;
      T010E33_n488ForPrdDsc = new boolean[] {false} ;
      T010E34_A396EmprCod = new String[] {""} ;
      T010E34_A7867Dt_Op = new int[1] ;
      T010E34_A7868Dt_Opr = new byte[1] ;
      T010E34_A7869Dt_Opp = new String[] {""} ;
      T010E34_A7870Dt_Orden = new short[1] ;
      T010E34_A7891Dt_Ordl = new short[1] ;
      T010E34_A7886Dt_ForLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblTextblock8_Jsonclick = "" ;
      ROClassString = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      T010E35_A407EmprNom = new String[] {""} ;
      T010E35_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ7869Dt_Opp = "" ;
      ZZ407EmprNom = "" ;
      Z7878Dt_DPQ = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Z7888Dt_PrdNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdt001__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdt001__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdt001__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdt001__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdt001__default(),
         new Object[] {
             new Object[] {
            T010E2_A7867Dt_Op, T010E2_A7868Dt_Opr, T010E2_A7869Dt_Opp, T010E2_A7870Dt_Orden, T010E2_A7891Dt_Ordl, T010E2_A7886Dt_ForLin, T010E2_A7887Dt_Prdnum, T010E2_n7887Dt_Prdnum, T010E2_A7889Dt_Forcan, T010E2_n7889Dt_Forcan,
            T010E2_A8473Dt_clave1, T010E2_n8473Dt_clave1, T010E2_A8474Dt_clave2, T010E2_n8474Dt_clave2, T010E2_A396EmprCod, T010E2_A490ForPrdUMe, T010E2_n490ForPrdUMe
            }
            , new Object[] {
            T010E3_A7867Dt_Op, T010E3_A7868Dt_Opr, T010E3_A7869Dt_Opp, T010E3_A7870Dt_Orden, T010E3_A7891Dt_Ordl, T010E3_A7886Dt_ForLin, T010E3_A7887Dt_Prdnum, T010E3_n7887Dt_Prdnum, T010E3_A7889Dt_Forcan, T010E3_n7889Dt_Forcan,
            T010E3_A8473Dt_clave1, T010E3_n8473Dt_clave1, T010E3_A8474Dt_clave2, T010E3_n8474Dt_clave2, T010E3_A396EmprCod, T010E3_A490ForPrdUMe, T010E3_n490ForPrdUMe
            }
            , new Object[] {
            T010E4_A488ForPrdDsc, T010E4_n488ForPrdDsc
            }
            , new Object[] {
            T010E5_A396EmprCod, T010E5_A7867Dt_Op, T010E5_A7868Dt_Opr, T010E5_A7869Dt_Opp, T010E5_A7870Dt_Orden, T010E5_A7891Dt_Ordl, T010E5_A7877Dt_CPQ, T010E5_n7877Dt_CPQ, T010E5_A7879Dt_ForFab, T010E5_n7879Dt_ForFab,
            T010E5_A7880Dt_Fortie, T010E5_n7880Dt_Fortie, T010E5_A7881Dt_ForTmx, T010E5_n7881Dt_ForTmx, T010E5_A7882Dt_ForRb, T010E5_n7882Dt_ForRb, T010E5_A7883Dt_ForPhx, T010E5_n7883Dt_ForPhx, T010E5_A7884Dt_ForPhn, T010E5_n7884Dt_ForPhn,
            T010E5_A7885Dt_ForUli, T010E5_n7885Dt_ForUli, T010E5_A12110Dt_Nh2o, T010E5_n12110Dt_Nh2o
            }
            , new Object[] {
            T010E6_A396EmprCod, T010E6_A7867Dt_Op, T010E6_A7868Dt_Opr, T010E6_A7869Dt_Opp, T010E6_A7870Dt_Orden, T010E6_A7891Dt_Ordl, T010E6_A7877Dt_CPQ, T010E6_n7877Dt_CPQ, T010E6_A7879Dt_ForFab, T010E6_n7879Dt_ForFab,
            T010E6_A7880Dt_Fortie, T010E6_n7880Dt_Fortie, T010E6_A7881Dt_ForTmx, T010E6_n7881Dt_ForTmx, T010E6_A7882Dt_ForRb, T010E6_n7882Dt_ForRb, T010E6_A7883Dt_ForPhx, T010E6_n7883Dt_ForPhx, T010E6_A7884Dt_ForPhn, T010E6_n7884Dt_ForPhn,
            T010E6_A7885Dt_ForUli, T010E6_n7885Dt_ForUli, T010E6_A12110Dt_Nh2o, T010E6_n12110Dt_Nh2o
            }
            , new Object[] {
            T010E7_A7867Dt_Op, T010E7_A7868Dt_Opr, T010E7_A7869Dt_Opp, T010E7_A7870Dt_Orden, T010E7_A7890Dt_UOrd, T010E7_n7890Dt_UOrd, T010E7_A396EmprCod
            }
            , new Object[] {
            T010E8_A7867Dt_Op, T010E8_A7868Dt_Opr, T010E8_A7869Dt_Opp, T010E8_A7870Dt_Orden, T010E8_A7890Dt_UOrd, T010E8_n7890Dt_UOrd, T010E8_A396EmprCod
            }
            , new Object[] {
            T010E9_A407EmprNom, T010E9_n407EmprNom
            }
            , new Object[] {
            T010E10_A7867Dt_Op, T010E10_A7868Dt_Opr, T010E10_A7869Dt_Opp, T010E10_A7870Dt_Orden, T010E10_A407EmprNom, T010E10_n407EmprNom, T010E10_A7890Dt_UOrd, T010E10_n7890Dt_UOrd, T010E10_A396EmprCod
            }
            , new Object[] {
            T010E11_A396EmprCod, T010E11_A7867Dt_Op, T010E11_A7868Dt_Opr, T010E11_A7869Dt_Opp, T010E11_A7870Dt_Orden
            }
            , new Object[] {
            T010E12_A396EmprCod, T010E12_A7867Dt_Op, T010E12_A7868Dt_Opr, T010E12_A7869Dt_Opp, T010E12_A7870Dt_Orden
            }
            , new Object[] {
            T010E13_A396EmprCod, T010E13_A7867Dt_Op, T010E13_A7868Dt_Opr, T010E13_A7869Dt_Opp, T010E13_A7870Dt_Orden
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T010E17_A396EmprCod, T010E17_A7867Dt_Op, T010E17_A7868Dt_Opr, T010E17_A7869Dt_Opp, T010E17_A7870Dt_Orden, T010E17_A7891Dt_Ordl
            }
            , new Object[] {
            }
            , new Object[] {
            T010E19_A396EmprCod, T010E19_A7867Dt_Op, T010E19_A7868Dt_Opr, T010E19_A7869Dt_Opp, T010E19_A7870Dt_Orden
            }
            , new Object[] {
            T010E20_A396EmprCod, T010E20_A7867Dt_Op, T010E20_A7868Dt_Opr, T010E20_A7869Dt_Opp, T010E20_A7870Dt_Orden, T010E20_A7891Dt_Ordl, T010E20_A7877Dt_CPQ, T010E20_n7877Dt_CPQ, T010E20_A7879Dt_ForFab, T010E20_n7879Dt_ForFab,
            T010E20_A7880Dt_Fortie, T010E20_n7880Dt_Fortie, T010E20_A7881Dt_ForTmx, T010E20_n7881Dt_ForTmx, T010E20_A7882Dt_ForRb, T010E20_n7882Dt_ForRb, T010E20_A7883Dt_ForPhx, T010E20_n7883Dt_ForPhx, T010E20_A7884Dt_ForPhn, T010E20_n7884Dt_ForPhn,
            T010E20_A7885Dt_ForUli, T010E20_n7885Dt_ForUli, T010E20_A12110Dt_Nh2o, T010E20_n12110Dt_Nh2o
            }
            , new Object[] {
            T010E21_A396EmprCod, T010E21_A7867Dt_Op, T010E21_A7868Dt_Opr, T010E21_A7869Dt_Opp, T010E21_A7870Dt_Orden, T010E21_A7891Dt_Ordl
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
            T010E26_A396EmprCod, T010E26_A7867Dt_Op, T010E26_A7868Dt_Opr, T010E26_A7869Dt_Opp, T010E26_A7870Dt_Orden, T010E26_A7891Dt_Ordl
            }
            , new Object[] {
            T010E27_A7867Dt_Op, T010E27_A7868Dt_Opr, T010E27_A7869Dt_Opp, T010E27_A7870Dt_Orden, T010E27_A7891Dt_Ordl, T010E27_A7886Dt_ForLin, T010E27_A7887Dt_Prdnum, T010E27_n7887Dt_Prdnum, T010E27_A488ForPrdDsc, T010E27_n488ForPrdDsc,
            T010E27_A7889Dt_Forcan, T010E27_n7889Dt_Forcan, T010E27_A8473Dt_clave1, T010E27_n8473Dt_clave1, T010E27_A8474Dt_clave2, T010E27_n8474Dt_clave2, T010E27_A396EmprCod, T010E27_A490ForPrdUMe, T010E27_n490ForPrdUMe
            }
            , new Object[] {
            T010E28_A488ForPrdDsc, T010E28_n488ForPrdDsc
            }
            , new Object[] {
            T010E29_A396EmprCod, T010E29_A7867Dt_Op, T010E29_A7868Dt_Opr, T010E29_A7869Dt_Opp, T010E29_A7870Dt_Orden, T010E29_A7891Dt_Ordl, T010E29_A7886Dt_ForLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T010E33_A488ForPrdDsc, T010E33_n488ForPrdDsc
            }
            , new Object[] {
            T010E34_A396EmprCod, T010E34_A7867Dt_Op, T010E34_A7868Dt_Opr, T010E34_A7869Dt_Opp, T010E34_A7870Dt_Orden, T010E34_A7891Dt_Ordl, T010E34_A7886Dt_ForLin
            }
            , new Object[] {
            T010E35_A407EmprNom, T010E35_n407EmprNom
            }
         }
      );
      Z7870Dt_Orden = (short)(0) ;
      A7870Dt_Orden = (short)(0) ;
      Z7869Dt_Opp = "" ;
      A7869Dt_Opp = "" ;
      Z7868Dt_Opr = (byte)(0) ;
      A7868Dt_Opr = (byte)(0) ;
      Z7867Dt_Op = 0 ;
      A7867Dt_Op = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TDT001" ;
   }

   private byte wcpOA7868Dt_Opr ;
   private byte Z7868Dt_Opr ;
   private byte Z490ForPrdUMe ;
   private byte GxWebError ;
   private byte A490ForPrdUMe ;
   private byte A7868Dt_Opr ;
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
   private byte ZZ7868Dt_Opr ;
   private short wcpOA7870Dt_Orden ;
   private short Z7870Dt_Orden ;
   private short Z7890Dt_UOrd ;
   private short O7890Dt_UOrd ;
   private short Z7891Dt_Ordl ;
   private short Z7880Dt_Fortie ;
   private short Z7881Dt_ForTmx ;
   private short Z7885Dt_ForUli ;
   private short Z12110Dt_Nh2o ;
   private short O7885Dt_ForUli ;
   private short nRcdDeleted_1102 ;
   private short nRcdExists_1102 ;
   private short nIsMod_1102 ;
   private short Z7886Dt_ForLin ;
   private short nRcdDeleted_1103 ;
   private short nRcdExists_1103 ;
   private short nIsMod_1103 ;
   private short A7870Dt_Orden ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A7890Dt_UOrd ;
   private short A7885Dt_ForUli ;
   private short nBlankRcdCount1102 ;
   private short RcdFound1102 ;
   private short B7890Dt_UOrd ;
   private short nBlankRcdUsr1102 ;
   private short s7885Dt_ForUli ;
   private short RcdFound1103 ;
   private short A7886Dt_ForLin ;
   private short s7890Dt_UOrd ;
   private short A7891Dt_Ordl ;
   private short A7880Dt_Fortie ;
   private short A7881Dt_ForTmx ;
   private short A12110Dt_Nh2o ;
   private short T7885Dt_ForUli ;
   private short RcdFound1099 ;
   private short nIsDirty_1099 ;
   private short nIsDirty_1102 ;
   private short nIsDirty_1103 ;
   private short nBlankRcdCount1103 ;
   private short B7885Dt_ForUli ;
   private short nBlankRcdUsr1103 ;
   private short i7890Dt_UOrd ;
   private short i7885Dt_ForUli ;
   private short subGrid1_Borderwidth ;
   private short ZZ7870Dt_Orden ;
   private short ZZ7890Dt_UOrd ;
   private short ZO7890Dt_UOrd ;
   private int wcpOA7867Dt_Op ;
   private int Z7867Dt_Op ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int nRC_GXsfl_117 ;
   private int nGXsfl_117_idx=1 ;
   private int A7867Dt_Op ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtDt_Op_Enabled ;
   private int edtDt_Opr_Enabled ;
   private int edtDt_Opp_Enabled ;
   private int edtDt_Orden_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtDt_UOrd_Enabled ;
   private int edtDt_Ordl_Enabled ;
   private int edtDt_CPQ_Enabled ;
   private int edtDt_DPQ_Enabled ;
   private int edtDt_ForFab_Enabled ;
   private int edtDt_Fortie_Enabled ;
   private int edtDt_ForTmx_Enabled ;
   private int edtDt_ForRb_Enabled ;
   private int edtDt_ForPhx_Enabled ;
   private int edtDt_ForPhn_Enabled ;
   private int edtDt_ForUli_Enabled ;
   private int edtDt_Nh2o_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int edtavnRcdDeleted_1103_Enabled ;
   private int edtDt_ForLin_Enabled ;
   private int edtDt_Prdnum_Enabled ;
   private int edtDt_PrdNom_Enabled ;
   private int edtForPrdUMe_Enabled ;
   private int edtForPrdDsc_Enabled ;
   private int edtDt_Forcan_Enabled ;
   private int edtDt_clave1_Enabled ;
   private int edtDt_clave2_Enabled ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtDt_ForLin_Enabled ;
   private int defedtDt_ForUli_Enabled ;
   private int defedtDt_Ordl_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtDt_UOrd_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtDt_Orden_Backcolor ;
   private int edtDt_Opp_Backcolor ;
   private int edtDt_Opr_Backcolor ;
   private int edtDt_Op_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ7867Dt_Op ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private java.math.BigDecimal Z7882Dt_ForRb ;
   private java.math.BigDecimal Z7883Dt_ForPhx ;
   private java.math.BigDecimal Z7884Dt_ForPhn ;
   private java.math.BigDecimal Z7889Dt_Forcan ;
   private java.math.BigDecimal A7889Dt_Forcan ;
   private java.math.BigDecimal A7882Dt_ForRb ;
   private java.math.BigDecimal A7883Dt_ForPhx ;
   private java.math.BigDecimal A7884Dt_ForPhn ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA7869Dt_Opp ;
   private String Z396EmprCod ;
   private String Z7869Dt_Opp ;
   private String Z7877Dt_CPQ ;
   private String Z7879Dt_ForFab ;
   private String Z7887Dt_Prdnum ;
   private String Z8473Dt_clave1 ;
   private String Z8474Dt_clave2 ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A7877Dt_CPQ ;
   private String A7887Dt_Prdnum ;
   private String A7869Dt_Opp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_55_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_117_idx="0001" ;
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
   private String edtDt_Op_Internalname ;
   private String edtDt_Op_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtDt_Opr_Internalname ;
   private String edtDt_Opr_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtDt_Opp_Internalname ;
   private String edtDt_Opp_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtDt_Orden_Internalname ;
   private String edtDt_Orden_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtDt_UOrd_Internalname ;
   private String edtDt_UOrd_Jsonclick ;
   private String sMode1102 ;
   private String edtDt_Ordl_Internalname ;
   private String edtDt_CPQ_Internalname ;
   private String edtDt_DPQ_Internalname ;
   private String edtDt_ForFab_Internalname ;
   private String edtDt_Fortie_Internalname ;
   private String edtDt_ForTmx_Internalname ;
   private String edtDt_ForRb_Internalname ;
   private String edtDt_ForPhx_Internalname ;
   private String edtDt_ForPhn_Internalname ;
   private String edtDt_ForUli_Internalname ;
   private String edtDt_Nh2o_Internalname ;
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
   private String edtavnRcdDeleted_1103_Internalname ;
   private String sMode1099 ;
   private String GXCCtl ;
   private String edtDt_ForLin_Internalname ;
   private String edtDt_Prdnum_Internalname ;
   private String edtDt_PrdNom_Internalname ;
   private String A7888Dt_PrdNom ;
   private String edtForPrdUMe_Internalname ;
   private String edtForPrdDsc_Internalname ;
   private String A488ForPrdDsc ;
   private String edtDt_Forcan_Internalname ;
   private String edtDt_clave1_Internalname ;
   private String A8473Dt_clave1 ;
   private String edtDt_clave2_Internalname ;
   private String A8474Dt_clave2 ;
   private String A7878Dt_DPQ ;
   private String A7879Dt_ForFab ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z488ForPrdDsc ;
   private String sMode1103 ;
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
   private String lblTextblock18_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable3_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String ROClassString ;
   private String edtDt_Ordl_Jsonclick ;
   private String lblTextblock9_Jsonclick ;
   private String edtDt_CPQ_Jsonclick ;
   private String lblTextblock10_Jsonclick ;
   private String edtDt_DPQ_Jsonclick ;
   private String lblTextblock11_Jsonclick ;
   private String edtDt_ForFab_Jsonclick ;
   private String lblTextblock12_Jsonclick ;
   private String edtDt_Fortie_Jsonclick ;
   private String lblTextblock13_Jsonclick ;
   private String edtDt_ForTmx_Jsonclick ;
   private String lblTextblock14_Jsonclick ;
   private String edtDt_ForRb_Jsonclick ;
   private String lblTextblock15_Jsonclick ;
   private String edtDt_ForPhx_Jsonclick ;
   private String lblTextblock16_Jsonclick ;
   private String edtDt_ForPhn_Jsonclick ;
   private String lblTextblock17_Jsonclick ;
   private String edtDt_ForUli_Jsonclick ;
   private String lblTextblock18_Jsonclick ;
   private String edtDt_Nh2o_Jsonclick ;
   private String sGXsfl_117_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_1103_Jsonclick ;
   private String edtDt_ForLin_Jsonclick ;
   private String edtDt_Prdnum_Jsonclick ;
   private String edtDt_PrdNom_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtDt_Forcan_Jsonclick ;
   private String edtDt_clave1_Jsonclick ;
   private String edtDt_clave2_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
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
   private String lblTextblock18_Caption ;
   private String subGrid2_Header ;
   private String ZZ396EmprCod ;
   private String ZZ7869Dt_Opp ;
   private String ZZ407EmprNom ;
   private String Z7878Dt_DPQ ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z7888Dt_PrdNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n7877Dt_CPQ ;
   private boolean n7887Dt_Prdnum ;
   private boolean n490ForPrdUMe ;
   private boolean wbErr ;
   private boolean n7890Dt_UOrd ;
   private boolean n7885Dt_ForUli ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean bGXsfl_117_Refreshing=false ;
   private boolean returnInSub ;
   private boolean n7879Dt_ForFab ;
   private boolean n7880Dt_Fortie ;
   private boolean n7881Dt_ForTmx ;
   private boolean n7882Dt_ForRb ;
   private boolean n7883Dt_ForPhx ;
   private boolean n7884Dt_ForPhn ;
   private boolean n12110Dt_Nh2o ;
   private boolean Gx_longc ;
   private boolean n488ForPrdDsc ;
   private boolean n7889Dt_Forcan ;
   private boolean n8473Dt_clave1 ;
   private boolean n8474Dt_clave2 ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private IDataStoreProvider pr_default ;
   private String[] T010E9_A407EmprNom ;
   private boolean[] T010E9_n407EmprNom ;
   private int[] T010E10_A7867Dt_Op ;
   private byte[] T010E10_A7868Dt_Opr ;
   private String[] T010E10_A7869Dt_Opp ;
   private short[] T010E10_A7870Dt_Orden ;
   private String[] T010E10_A407EmprNom ;
   private boolean[] T010E10_n407EmprNom ;
   private short[] T010E10_A7890Dt_UOrd ;
   private boolean[] T010E10_n7890Dt_UOrd ;
   private String[] T010E10_A396EmprCod ;
   private String[] T010E11_A396EmprCod ;
   private int[] T010E11_A7867Dt_Op ;
   private byte[] T010E11_A7868Dt_Opr ;
   private String[] T010E11_A7869Dt_Opp ;
   private short[] T010E11_A7870Dt_Orden ;
   private int[] T010E8_A7867Dt_Op ;
   private byte[] T010E8_A7868Dt_Opr ;
   private String[] T010E8_A7869Dt_Opp ;
   private short[] T010E8_A7870Dt_Orden ;
   private short[] T010E8_A7890Dt_UOrd ;
   private boolean[] T010E8_n7890Dt_UOrd ;
   private String[] T010E8_A396EmprCod ;
   private String[] T010E12_A396EmprCod ;
   private int[] T010E12_A7867Dt_Op ;
   private byte[] T010E12_A7868Dt_Opr ;
   private String[] T010E12_A7869Dt_Opp ;
   private short[] T010E12_A7870Dt_Orden ;
   private String[] T010E13_A396EmprCod ;
   private int[] T010E13_A7867Dt_Op ;
   private byte[] T010E13_A7868Dt_Opr ;
   private String[] T010E13_A7869Dt_Opp ;
   private short[] T010E13_A7870Dt_Orden ;
   private int[] T010E7_A7867Dt_Op ;
   private byte[] T010E7_A7868Dt_Opr ;
   private String[] T010E7_A7869Dt_Opp ;
   private short[] T010E7_A7870Dt_Orden ;
   private short[] T010E7_A7890Dt_UOrd ;
   private boolean[] T010E7_n7890Dt_UOrd ;
   private String[] T010E7_A396EmprCod ;
   private String[] T010E17_A396EmprCod ;
   private int[] T010E17_A7867Dt_Op ;
   private byte[] T010E17_A7868Dt_Opr ;
   private String[] T010E17_A7869Dt_Opp ;
   private short[] T010E17_A7870Dt_Orden ;
   private short[] T010E17_A7891Dt_Ordl ;
   private String[] T010E19_A396EmprCod ;
   private int[] T010E19_A7867Dt_Op ;
   private byte[] T010E19_A7868Dt_Opr ;
   private String[] T010E19_A7869Dt_Opp ;
   private short[] T010E19_A7870Dt_Orden ;
   private String[] T010E20_A396EmprCod ;
   private int[] T010E20_A7867Dt_Op ;
   private byte[] T010E20_A7868Dt_Opr ;
   private String[] T010E20_A7869Dt_Opp ;
   private short[] T010E20_A7870Dt_Orden ;
   private short[] T010E20_A7891Dt_Ordl ;
   private String[] T010E20_A7877Dt_CPQ ;
   private boolean[] T010E20_n7877Dt_CPQ ;
   private String[] T010E20_A7879Dt_ForFab ;
   private boolean[] T010E20_n7879Dt_ForFab ;
   private short[] T010E20_A7880Dt_Fortie ;
   private boolean[] T010E20_n7880Dt_Fortie ;
   private short[] T010E20_A7881Dt_ForTmx ;
   private boolean[] T010E20_n7881Dt_ForTmx ;
   private java.math.BigDecimal[] T010E20_A7882Dt_ForRb ;
   private boolean[] T010E20_n7882Dt_ForRb ;
   private java.math.BigDecimal[] T010E20_A7883Dt_ForPhx ;
   private boolean[] T010E20_n7883Dt_ForPhx ;
   private java.math.BigDecimal[] T010E20_A7884Dt_ForPhn ;
   private boolean[] T010E20_n7884Dt_ForPhn ;
   private short[] T010E20_A7885Dt_ForUli ;
   private boolean[] T010E20_n7885Dt_ForUli ;
   private short[] T010E20_A12110Dt_Nh2o ;
   private boolean[] T010E20_n12110Dt_Nh2o ;
   private String[] T010E21_A396EmprCod ;
   private int[] T010E21_A7867Dt_Op ;
   private byte[] T010E21_A7868Dt_Opr ;
   private String[] T010E21_A7869Dt_Opp ;
   private short[] T010E21_A7870Dt_Orden ;
   private short[] T010E21_A7891Dt_Ordl ;
   private String[] T010E6_A396EmprCod ;
   private int[] T010E6_A7867Dt_Op ;
   private byte[] T010E6_A7868Dt_Opr ;
   private String[] T010E6_A7869Dt_Opp ;
   private short[] T010E6_A7870Dt_Orden ;
   private short[] T010E6_A7891Dt_Ordl ;
   private String[] T010E6_A7877Dt_CPQ ;
   private boolean[] T010E6_n7877Dt_CPQ ;
   private String[] T010E6_A7879Dt_ForFab ;
   private boolean[] T010E6_n7879Dt_ForFab ;
   private short[] T010E6_A7880Dt_Fortie ;
   private boolean[] T010E6_n7880Dt_Fortie ;
   private short[] T010E6_A7881Dt_ForTmx ;
   private boolean[] T010E6_n7881Dt_ForTmx ;
   private java.math.BigDecimal[] T010E6_A7882Dt_ForRb ;
   private boolean[] T010E6_n7882Dt_ForRb ;
   private java.math.BigDecimal[] T010E6_A7883Dt_ForPhx ;
   private boolean[] T010E6_n7883Dt_ForPhx ;
   private java.math.BigDecimal[] T010E6_A7884Dt_ForPhn ;
   private boolean[] T010E6_n7884Dt_ForPhn ;
   private short[] T010E6_A7885Dt_ForUli ;
   private boolean[] T010E6_n7885Dt_ForUli ;
   private short[] T010E6_A12110Dt_Nh2o ;
   private boolean[] T010E6_n12110Dt_Nh2o ;
   private String[] T010E5_A396EmprCod ;
   private int[] T010E5_A7867Dt_Op ;
   private byte[] T010E5_A7868Dt_Opr ;
   private String[] T010E5_A7869Dt_Opp ;
   private short[] T010E5_A7870Dt_Orden ;
   private short[] T010E5_A7891Dt_Ordl ;
   private String[] T010E5_A7877Dt_CPQ ;
   private boolean[] T010E5_n7877Dt_CPQ ;
   private String[] T010E5_A7879Dt_ForFab ;
   private boolean[] T010E5_n7879Dt_ForFab ;
   private short[] T010E5_A7880Dt_Fortie ;
   private boolean[] T010E5_n7880Dt_Fortie ;
   private short[] T010E5_A7881Dt_ForTmx ;
   private boolean[] T010E5_n7881Dt_ForTmx ;
   private java.math.BigDecimal[] T010E5_A7882Dt_ForRb ;
   private boolean[] T010E5_n7882Dt_ForRb ;
   private java.math.BigDecimal[] T010E5_A7883Dt_ForPhx ;
   private boolean[] T010E5_n7883Dt_ForPhx ;
   private java.math.BigDecimal[] T010E5_A7884Dt_ForPhn ;
   private boolean[] T010E5_n7884Dt_ForPhn ;
   private short[] T010E5_A7885Dt_ForUli ;
   private boolean[] T010E5_n7885Dt_ForUli ;
   private short[] T010E5_A12110Dt_Nh2o ;
   private boolean[] T010E5_n12110Dt_Nh2o ;
   private String[] T010E26_A396EmprCod ;
   private int[] T010E26_A7867Dt_Op ;
   private byte[] T010E26_A7868Dt_Opr ;
   private String[] T010E26_A7869Dt_Opp ;
   private short[] T010E26_A7870Dt_Orden ;
   private short[] T010E26_A7891Dt_Ordl ;
   private int[] T010E27_A7867Dt_Op ;
   private byte[] T010E27_A7868Dt_Opr ;
   private String[] T010E27_A7869Dt_Opp ;
   private short[] T010E27_A7870Dt_Orden ;
   private short[] T010E27_A7891Dt_Ordl ;
   private short[] T010E27_A7886Dt_ForLin ;
   private String[] T010E27_A7887Dt_Prdnum ;
   private boolean[] T010E27_n7887Dt_Prdnum ;
   private String[] T010E27_A488ForPrdDsc ;
   private boolean[] T010E27_n488ForPrdDsc ;
   private java.math.BigDecimal[] T010E27_A7889Dt_Forcan ;
   private boolean[] T010E27_n7889Dt_Forcan ;
   private String[] T010E27_A8473Dt_clave1 ;
   private boolean[] T010E27_n8473Dt_clave1 ;
   private String[] T010E27_A8474Dt_clave2 ;
   private boolean[] T010E27_n8474Dt_clave2 ;
   private String[] T010E27_A396EmprCod ;
   private byte[] T010E27_A490ForPrdUMe ;
   private boolean[] T010E27_n490ForPrdUMe ;
   private String[] T010E4_A488ForPrdDsc ;
   private boolean[] T010E4_n488ForPrdDsc ;
   private String[] T010E28_A488ForPrdDsc ;
   private boolean[] T010E28_n488ForPrdDsc ;
   private String[] T010E29_A396EmprCod ;
   private int[] T010E29_A7867Dt_Op ;
   private byte[] T010E29_A7868Dt_Opr ;
   private String[] T010E29_A7869Dt_Opp ;
   private short[] T010E29_A7870Dt_Orden ;
   private short[] T010E29_A7891Dt_Ordl ;
   private short[] T010E29_A7886Dt_ForLin ;
   private int[] T010E3_A7867Dt_Op ;
   private byte[] T010E3_A7868Dt_Opr ;
   private String[] T010E3_A7869Dt_Opp ;
   private short[] T010E3_A7870Dt_Orden ;
   private short[] T010E3_A7891Dt_Ordl ;
   private short[] T010E3_A7886Dt_ForLin ;
   private String[] T010E3_A7887Dt_Prdnum ;
   private boolean[] T010E3_n7887Dt_Prdnum ;
   private java.math.BigDecimal[] T010E3_A7889Dt_Forcan ;
   private boolean[] T010E3_n7889Dt_Forcan ;
   private String[] T010E3_A8473Dt_clave1 ;
   private boolean[] T010E3_n8473Dt_clave1 ;
   private String[] T010E3_A8474Dt_clave2 ;
   private boolean[] T010E3_n8474Dt_clave2 ;
   private String[] T010E3_A396EmprCod ;
   private byte[] T010E3_A490ForPrdUMe ;
   private boolean[] T010E3_n490ForPrdUMe ;
   private int[] T010E2_A7867Dt_Op ;
   private byte[] T010E2_A7868Dt_Opr ;
   private String[] T010E2_A7869Dt_Opp ;
   private short[] T010E2_A7870Dt_Orden ;
   private short[] T010E2_A7891Dt_Ordl ;
   private short[] T010E2_A7886Dt_ForLin ;
   private String[] T010E2_A7887Dt_Prdnum ;
   private boolean[] T010E2_n7887Dt_Prdnum ;
   private java.math.BigDecimal[] T010E2_A7889Dt_Forcan ;
   private boolean[] T010E2_n7889Dt_Forcan ;
   private String[] T010E2_A8473Dt_clave1 ;
   private boolean[] T010E2_n8473Dt_clave1 ;
   private String[] T010E2_A8474Dt_clave2 ;
   private boolean[] T010E2_n8474Dt_clave2 ;
   private String[] T010E2_A396EmprCod ;
   private byte[] T010E2_A490ForPrdUMe ;
   private boolean[] T010E2_n490ForPrdUMe ;
   private String[] T010E33_A488ForPrdDsc ;
   private boolean[] T010E33_n488ForPrdDsc ;
   private String[] T010E34_A396EmprCod ;
   private int[] T010E34_A7867Dt_Op ;
   private byte[] T010E34_A7868Dt_Opr ;
   private String[] T010E34_A7869Dt_Opp ;
   private short[] T010E34_A7870Dt_Orden ;
   private short[] T010E34_A7891Dt_Ordl ;
   private short[] T010E34_A7886Dt_ForLin ;
   private String[] T010E35_A407EmprNom ;
   private boolean[] T010E35_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdt001__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdt001__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdt001__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdt001__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdt001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T010E2", "SELECT Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Ordl, Dt_ForLin, Dt_Prdnum, Dt_Forcan, Dt_clave1, Dt_clave2, EmprCod, ForPrdUMe FROM TXPDT0011 WHERE EmprCod = ? AND Dt_Op = ? AND Dt_Opr = ? AND Dt_Opp = ? AND Dt_Orden = ? AND Dt_Ordl = ? AND Dt_ForLin = ?  FOR UPDATE OF Dt_Prdnum, Dt_Forcan, Dt_clave1, Dt_clave2, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010E3", "SELECT Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Ordl, Dt_ForLin, Dt_Prdnum, Dt_Forcan, Dt_clave1, Dt_clave2, EmprCod, ForPrdUMe FROM TXPDT0011 WHERE EmprCod = ? AND Dt_Op = ? AND Dt_Opr = ? AND Dt_Opp = ? AND Dt_Orden = ? AND Dt_Ordl = ? AND Dt_ForLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010E4", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010E5", "SELECT EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Ordl, Dt_CPQ, Dt_ForFab, Dt_Fortie, Dt_ForTmx, Dt_ForRb, Dt_ForPhx, Dt_ForPhn, Dt_ForUli, Dt_Nh2o FROM TXPDT001 WHERE EmprCod = ? AND Dt_Op = ? AND Dt_Opr = ? AND Dt_Opp = ? AND Dt_Orden = ? AND Dt_Ordl = ?  FOR UPDATE OF Dt_CPQ, Dt_ForFab, Dt_Fortie, Dt_ForTmx, Dt_ForRb, Dt_ForPhx, Dt_ForPhn, Dt_ForUli, Dt_Nh2o NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010E6", "SELECT EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Ordl, Dt_CPQ, Dt_ForFab, Dt_Fortie, Dt_ForTmx, Dt_ForRb, Dt_ForPhx, Dt_ForPhn, Dt_ForUli, Dt_Nh2o FROM TXPDT001 WHERE EmprCod = ? AND Dt_Op = ? AND Dt_Opr = ? AND Dt_Opp = ? AND Dt_Orden = ? AND Dt_Ordl = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010E7", "SELECT Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_UOrd, EmprCod FROM TXPDT000 WHERE EmprCod = ? AND Dt_Op = ? AND Dt_Opr = ? AND Dt_Opp = ? AND Dt_Orden = ?  FOR UPDATE OF Dt_UOrd NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010E8", "SELECT Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_UOrd, EmprCod FROM TXPDT000 WHERE EmprCod = ? AND Dt_Op = ? AND Dt_Opr = ? AND Dt_Opp = ? AND Dt_Orden = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010E9", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010E10", "SELECT /*+ FIRST_ROWS(1) */ TM1.Dt_Op, TM1.Dt_Opr, TM1.Dt_Opp, TM1.Dt_Orden, T2.EmprNom, TM1.Dt_UOrd, TM1.EmprCod FROM (TXPDT000 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Dt_Op = ? and TM1.Dt_Opr = ? and TM1.Dt_Opp = ? and TM1.Dt_Orden = ? ORDER BY TM1.EmprCod, TM1.Dt_Op, TM1.Dt_Opr, TM1.Dt_Opp, TM1.Dt_Orden ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010E11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden FROM TXPDT000 WHERE EmprCod = ? AND Dt_Op = ? AND Dt_Opr = ? AND Dt_Opp = ? AND Dt_Orden = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010E12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden FROM TXPDT000 WHERE EmprCod = ? and Dt_Op = ? and Dt_Opr = ? and Dt_Opp = ? and Dt_Orden = ? ORDER BY EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010E13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden FROM TXPDT000 WHERE EmprCod = ? and Dt_Op = ? and Dt_Opr = ? and Dt_Opp = ? and Dt_Orden = ? ORDER BY EmprCod DESC, Dt_Op DESC, Dt_Opr DESC, Dt_Opp DESC, Dt_Orden DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T010E14", "INSERT INTO TXPDT000(Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_UOrd, EmprCod, Dt_Fascod, Dt_FasDsc, Dt_Tpp, Dt_H2OReh, Dt_TpCost, Dt_UnpLt) VALUES(?, ?, ?, ?, ?, ?, ' ', ' ', 0, ' ', 0, 0)", GX_NOMASK, "TXPDT000")
         ,new UpdateCursor("T010E15", "UPDATE TXPDT000 SET Dt_UOrd=?  WHERE EmprCod = ? AND Dt_Op = ? AND Dt_Opr = ? AND Dt_Opp = ? AND Dt_Orden = ?", GX_NOMASK, "TXPDT000")
         ,new UpdateCursor("T010E16", "DELETE FROM TXPDT000  WHERE EmprCod = ? AND Dt_Op = ? AND Dt_Opr = ? AND Dt_Opp = ? AND Dt_Orden = ?", GX_NOMASK, "TXPDT000")
         ,new ForEachCursor("T010E17", "SELECT * FROM (SELECT EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Ordl FROM TXPDT001 WHERE EmprCod = ? AND Dt_Op = ? AND Dt_Opr = ? AND Dt_Opp = ? AND Dt_Orden = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T010E18", "UPDATE TXPDT000 SET Dt_UOrd=?  WHERE EmprCod = ? AND Dt_Op = ? AND Dt_Opr = ? AND Dt_Opp = ? AND Dt_Orden = ?", GX_NOMASK, "TXPDT000")
         ,new ForEachCursor("T010E19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden FROM TXPDT000 WHERE EmprCod = ? and Dt_Op = ? and Dt_Opr = ? and Dt_Opp = ? and Dt_Orden = ? ORDER BY EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010E20", "SELECT EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Ordl, Dt_CPQ, Dt_ForFab, Dt_Fortie, Dt_ForTmx, Dt_ForRb, Dt_ForPhx, Dt_ForPhn, Dt_ForUli, Dt_Nh2o FROM TXPDT001 WHERE EmprCod = ? and Dt_Op = ? and Dt_Opr = ? and Dt_Opp = ? and Dt_Orden = ? and Dt_Ordl = ? ORDER BY EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Ordl ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010E21", "SELECT EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Ordl FROM TXPDT001 WHERE EmprCod = ? AND Dt_Op = ? AND Dt_Opr = ? AND Dt_Opp = ? AND Dt_Orden = ? AND Dt_Ordl = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T010E22", "INSERT INTO TXPDT001(EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Ordl, Dt_CPQ, Dt_ForFab, Dt_Fortie, Dt_ForTmx, Dt_ForRb, Dt_ForPhx, Dt_ForPhn, Dt_ForUli, Dt_Nh2o) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDT001")
         ,new UpdateCursor("T010E23", "UPDATE TXPDT001 SET Dt_CPQ=?, Dt_ForFab=?, Dt_Fortie=?, Dt_ForTmx=?, Dt_ForRb=?, Dt_ForPhx=?, Dt_ForPhn=?, Dt_ForUli=?, Dt_Nh2o=?  WHERE EmprCod = ? AND Dt_Op = ? AND Dt_Opr = ? AND Dt_Opp = ? AND Dt_Orden = ? AND Dt_Ordl = ?", GX_NOMASK, "TXPDT001")
         ,new UpdateCursor("T010E24", "DELETE FROM TXPDT001  WHERE EmprCod = ? AND Dt_Op = ? AND Dt_Opr = ? AND Dt_Opp = ? AND Dt_Orden = ? AND Dt_Ordl = ?", GX_NOMASK, "TXPDT001")
         ,new UpdateCursor("T010E25", "UPDATE TXPDT001 SET Dt_ForUli=?  WHERE EmprCod = ? AND Dt_Op = ? AND Dt_Opr = ? AND Dt_Opp = ? AND Dt_Orden = ? AND Dt_Ordl = ?", GX_NOMASK, "TXPDT001")
         ,new ForEachCursor("T010E26", "SELECT EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Ordl FROM TXPDT001 WHERE EmprCod = ? and Dt_Op = ? and Dt_Opr = ? and Dt_Opp = ? and Dt_Orden = ? ORDER BY EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Ordl ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010E27", "SELECT T1.Dt_Op, T1.Dt_Opr, T1.Dt_Opp, T1.Dt_Orden, T1.Dt_Ordl, T1.Dt_ForLin, T1.Dt_Prdnum, T2.ForPrdDsc, T1.Dt_Forcan, T1.Dt_clave1, T1.Dt_clave2, T1.EmprCod, T1.ForPrdUMe FROM (TXPDT0011 T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.Dt_Op = ? and T1.Dt_Opr = ? and T1.Dt_Opp = ? and T1.Dt_Orden = ? and T1.Dt_Ordl = ? and T1.Dt_ForLin = ? ORDER BY T1.EmprCod, T1.Dt_Op, T1.Dt_Opr, T1.Dt_Opp, T1.Dt_Orden, T1.Dt_Ordl, T1.Dt_ForLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010E28", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010E29", "SELECT EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Ordl, Dt_ForLin FROM TXPDT0011 WHERE EmprCod = ? AND Dt_Op = ? AND Dt_Opr = ? AND Dt_Opp = ? AND Dt_Orden = ? AND Dt_Ordl = ? AND Dt_ForLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T010E30", "INSERT INTO TXPDT0011(Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Ordl, Dt_ForLin, Dt_Prdnum, Dt_Forcan, Dt_clave1, Dt_clave2, EmprCod, ForPrdUMe) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDT0011")
         ,new UpdateCursor("T010E31", "UPDATE TXPDT0011 SET Dt_Prdnum=?, Dt_Forcan=?, Dt_clave1=?, Dt_clave2=?, ForPrdUMe=?  WHERE EmprCod = ? AND Dt_Op = ? AND Dt_Opr = ? AND Dt_Opp = ? AND Dt_Orden = ? AND Dt_Ordl = ? AND Dt_ForLin = ?", GX_NOMASK, "TXPDT0011")
         ,new UpdateCursor("T010E32", "DELETE FROM TXPDT0011  WHERE EmprCod = ? AND Dt_Op = ? AND Dt_Opr = ? AND Dt_Opp = ? AND Dt_Orden = ? AND Dt_Ordl = ? AND Dt_ForLin = ?", GX_NOMASK, "TXPDT0011")
         ,new ForEachCursor("T010E33", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010E34", "SELECT EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Ordl, Dt_ForLin FROM TXPDT0011 WHERE EmprCod = ? and Dt_Op = ? and Dt_Opr = ? and Dt_Opp = ? and Dt_Orden = ? and Dt_Ordl = ? ORDER BY EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Ordl, Dt_ForLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010E35", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(15);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(15);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(15);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 25 :
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
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 33 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               stmt.setString(6, (String)parms[6], 3);
               return;
            case 13 :
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
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 16 :
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
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[23]).shortValue());
               }
               return;
            case 21 :
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
               stmt.setShort(14, ((Number) parms[22]).shortValue());
               stmt.setShort(15, ((Number) parms[23]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 23 :
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
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 26 :
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
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 28 :
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
               return;
            case 29 :
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
               stmt.setShort(10, ((Number) parms[14]).shortValue());
               stmt.setShort(11, ((Number) parms[15]).shortValue());
               stmt.setShort(12, ((Number) parms[16]).shortValue());
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

